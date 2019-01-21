package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cycml_generator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cycml_generator";
    public static final String myFingerPrint = "828d82d47942b2e957ee9b208a90bd86ecef91657e1b04964f00769c15e9462d";
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLSymbol $dtp_cycml_kp_info$;
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 33272L)
    private static SubLSymbol $within_cycl_atomic_sentenceP$;
    private static final SubLSymbol $sym0$CONSP;
    private static final SubLSymbol $sym1$INTEGERP;
    private static final SubLSymbol $sym2$STRINGP;
    private static final SubLString $str3$__;
    private static final SubLString $str4$api_request_message;
    private static final SubLString $str5$api_request;
    private static final SubLString $str6$api_request_bindings;
    private static final SubLString $str7$justification;
    private static final SubLString $str8$truth;
    private static final SubLString $str9$api_request_requestor;
    private static final SubLString $str10$api_request_priority;
    private static final SubLString $str11$api_request_id;
    private static final SubLString $str12$nonnegativeinteger;
    private static final SubLString $str13$positiveinteger;
    private static final SubLString $str14$new_name;
    private static final SubLString $str15$date;
    private static final SubLString $str16$time;
    private static final SubLString $str17$cyc_image_id;
    private static final SubLString $str18$knowledge_package_id;
    private static final SubLString $str19$sublsymbol;
    private static final SubLString $str20$sublstring;
    private static final SubLString $str21$sublrealnumber;
    private static final SubLString $str22$cyclvariable;
    private static final SubLString $str23$uri;
    private static final SubLString $str24$namespace;
    private static final SubLString $str25$false;
    private static final SubLString $str26$true;
    private static final SubLSymbol $sym27$CYCML_KP_INFO;
    private static final SubLSymbol $sym28$CYCML_KP_INFO_P;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$PRINT_CYCML_KP_INFO;
    private static final SubLSymbol $sym34$CYCML_KP_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID;
    private static final SubLSymbol $sym37$_CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID;
    private static final SubLSymbol $sym38$CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES;
    private static final SubLSymbol $sym39$_CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES;
    private static final SubLSymbol $sym40$CYCML_KP_INFO_OPERATIONS;
    private static final SubLSymbol $sym41$_CSETF_CYCML_KP_INFO_OPERATIONS;
    private static final SubLSymbol $kw42$KNOWLEDGE_PACKAGE_ID;
    private static final SubLSymbol $kw43$KNOWLEDGE_PACKAGE_DEPENDENCIES;
    private static final SubLSymbol $kw44$OPERATIONS;
    private static final SubLString $str45$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw46$BEGIN;
    private static final SubLSymbol $sym47$MAKE_CYCML_KP_INFO;
    private static final SubLSymbol $kw48$SLOT;
    private static final SubLSymbol $kw49$END;
    private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_CYCML_KP_INFO_METHOD;
    private static final SubLString $str51$__CYCML_KP_INFO_;
    private static final SubLSymbol $sym52$CYCL_CONSTANT_P;
    private static final SubLSymbol $sym53$CYCL_FORT_P;
    private static final SubLSymbol $kw54$CREATE;
    private static final SubLSymbol $kw55$FIND_OR_CREATE;
    private static final SubLSymbol $sym56$VALID_CONSTANT_NAME_P;
    private static final SubLSymbol $kw57$RENAME;
    private static final SubLSymbol $kw58$MERGE;
    private static final SubLSymbol $kw59$KILL;
    private static final SubLSymbol $sym60$CYCL_SENTENCE_P;
    private static final SubLSymbol $sym61$EL_STRENGTH_P;
    private static final SubLSymbol $sym62$DIRECTION_P;
    private static final SubLSymbol $kw63$ASSERT;
    private static final SubLSymbol $kw64$REASSERT;
    private static final SubLSymbol $kw65$UNASSERT;
    private static final SubLSymbol $kw66$BLAST;
    private static final SubLSymbol $sym67$CONSTANT_EXTERNAL_ID_P;
    private static final SubLSymbol $sym68$LISTP;
    private static final SubLSymbol $kw69$CREATE_SKOLEM;
    private static final SubLString $str70$cycml;
    private static final SubLString $str71$knowledge_package;
    private static final SubLString $str72$knowledge_package_dependencies;
    private static final SubLString $str73$operations;
    private static final SubLList $list74;
    private static final SubLString $str75$create;
    private static final SubLString $str76$find_or_create;
    private static final SubLList $list77;
    private static final SubLString $str78$rename;
    private static final SubLList $list79;
    private static final SubLString $str80$merge;
    private static final SubLList $list81;
    private static final SubLString $str82$kill;
    private static final SubLList $list83;
    private static final SubLString $str84$assert;
    private static final SubLList $list85;
    private static final SubLString $str86$reassert;
    private static final SubLList $list87;
    private static final SubLString $str88$unassert;
    private static final SubLString $str89$blast;
    private static final SubLList $list90;
    private static final SubLString $str91$create_skolem;
    private static final SubLString $str92$skolem_unreified_term;
    private static final SubLString $str93$skolem_conjunctive_normal_form;
    private static final SubLString $str94$skolem_arg_types;
    private static final SubLSymbol $sym95$UNIVERSAL_SECOND_P;
    private static final SubLString $str96$bookkeeping_info;
    private static final SubLString $str97$Cyclist;
    private static final SubLString $str98$Microtheory;
    private static final SubLString $str99$CycLConstant;
    private static final SubLString $str100$urn_uuid_;
    private static final SubLSymbol $sym101$CYCL_NART_P;
    private static final SubLString $str102$_S_is_not_a_reified_nart;
    private static final SubLString $str103$CycLReifiedNonAtomicTerm;
    private static final SubLString $str104$Function_Denotational;
    private static final SubLString $str105$argument_list;
    private static final SubLString $str106$CycLReifiableNonAtomicTerm;
    private static final SubLSymbol $sym107$CYCL_NAT_P;
    private static final SubLString $str108$ELNonAtomicTerm;
    private static final SubLSymbol $sym109$CLET;
    private static final SubLList $list110;
    private static final SubLObject $const111$True;
    private static final SubLString $str112$;
    private static final SubLObject $const113$False;
    private static final SubLString $str114$__is_unknown_type_for_CycML_seria;
    private static final SubLSymbol $sym115$CYCML_SERIALIZE_OBJECT_TO_STRING;
    private static final SubLString $str116$SubLList;
    private static final SubLString $str117$dotted_item;
    private static final SubLObject $const118$not;
    private static final SubLString $str119$not;
    private static final SubLObject $const120$and;
    private static final SubLString $str121$and;
    private static final SubLObject $const122$or;
    private static final SubLString $str123$or;
    private static final SubLObject $const124$xor;
    private static final SubLString $str125$xor;
    private static final SubLObject $const126$implies;
    private static final SubLString $str127$implies;
    private static final SubLObject $const128$equiv;
    private static final SubLString $str129$equiv;
    private static final SubLObject $const130$forAll;
    private static final SubLString $str131$forAll;
    private static final SubLObject $const132$thereExists;
    private static final SubLString $str133$thereExists;
    private static final SubLObject $const134$thereExistExactly;
    private static final SubLString $str135$thereExistExactly;
    private static final SubLObject $const136$thereExistAtMost;
    private static final SubLString $str137$thereExistAtMost;
    private static final SubLObject $const138$thereExistAtLeast;
    private static final SubLString $str139$thereExistAtLeast;
    private static final SubLSymbol $sym140$CYCL_ATOMIC_SENTENCE_P;
    private static final SubLObject $const141$OpenCycDefinitionalPredicate;
    private static final SubLString $str142$CycLAtomicSentence;
    private static final SubLString $str143$Predicate;
    private static final SubLString $str144$purpose;
    private static final SubLString $str145$_A__A__A;
    private static final SubLString $str146$_6__0D;
    private static final SubLString $str147$hl_support;
    private static final SubLString $str148$module_token;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 636L)
    public static SubLObject cycml_serialize_knowledge_package_info(final SubLObject cycml_kp_info) {
        cycml.emit_cycml_prologue((SubLObject)cycml_generator.UNPROVIDED);
        cycml_serialize_knowledge_package(cycml_kp_info);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 1147L)
    public static SubLObject cycml_serialize_api_request(final SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycml_generator.NIL != Types.consp(request) : request;
        assert cycml_generator.NIL != Types.integerp(id) : id;
        assert cycml_generator.NIL != Types.integerp(priority) : priority;
        assert cycml_generator.NIL != Types.stringp(requestor) : requestor;
        assert cycml_generator.NIL != Types.consp(v_bindings) : v_bindings;
        cycml.emit_cycml_prologue((SubLObject)cycml_generator.UNPROVIDED);
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str4$api_request_message;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$2 = (SubLObject)cycml_generator.$str5$api_request;
                        xml_utilities.xml_start_tag_internal(name_var_$2, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_subllist(request);
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$3, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$2, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$2);
                    }
                    cycml_serialize_api_request_id(id, (SubLObject)cycml_generator.UNPROVIDED);
                    cycml_serialize_api_request_priority(priority, (SubLObject)cycml_generator.UNPROVIDED);
                    cycml_serialize_api_request_requestor(requestor, (SubLObject)cycml_generator.UNPROVIDED);
                    if (cycml_generator.NIL != v_bindings && cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$3 = (SubLObject)cycml_generator.$str6$api_request_bindings;
                        xml_utilities.xml_start_tag_internal(name_var_$3, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$5 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_subllist(request);
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$5, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$3);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$1, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2139L)
    public static SubLObject cycml_serialize_justification(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        print_high.print(supports, (SubLObject)cycml_generator.UNPROVIDED);
        cycml.emit_cycml_prologue((SubLObject)cycml_generator.UNPROVIDED);
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str7$justification;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var = supports;
                    SubLObject support = (SubLObject)cycml_generator.NIL;
                    support = cdolist_list_var.first();
                    while (cycml_generator.NIL != cdolist_list_var) {
                        cycml_serialize_support(support);
                        cdolist_list_var = cdolist_list_var.rest();
                        support = cdolist_list_var.first();
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$8, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_truth(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str8$truth, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_api_request_requestor(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str9$api_request_requestor, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_api_request_priority(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str10$api_request_priority, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_api_request_id(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str11$api_request_id, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_nonnegativeinteger(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str12$nonnegativeinteger, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_positiveinteger(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str13$positiveinteger, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_new_name(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str14$new_name, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_date(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str15$date, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_time(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str16$time, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_cyc_image_id(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str17$cyc_image_id, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_knowledge_package_id(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str18$knowledge_package_id, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_sublsymbol(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str19$sublsymbol, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_sublstring(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str20$sublstring, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_sublrealnumber(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str21$sublrealnumber, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_cyclvariable(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str22$cyclvariable, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_uri(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str23$uri, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_namespace(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str24$namespace, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_false(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str25$false, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 2532L)
    public static SubLObject cycml_serialize_true(final SubLObject body, SubLObject attributes) {
        if (attributes == cycml_generator.UNPROVIDED) {
            attributes = (SubLObject)cycml_generator.NIL;
        }
        cycml.cycml_serialize_primitive((SubLObject)cycml_generator.$str26$true, body, attributes);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject cycml_kp_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cycml_kp_info(v_object, stream, (SubLObject)cycml_generator.ZERO_INTEGER);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject cycml_kp_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cycml_kp_info_native.class) ? cycml_generator.T : cycml_generator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject cycml_kp_info_knowledge_package_id(final SubLObject v_object) {
        assert cycml_generator.NIL != cycml_kp_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject cycml_kp_info_knowledge_package_dependencies(final SubLObject v_object) {
        assert cycml_generator.NIL != cycml_kp_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject cycml_kp_info_operations(final SubLObject v_object) {
        assert cycml_generator.NIL != cycml_kp_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject _csetf_cycml_kp_info_knowledge_package_id(final SubLObject v_object, final SubLObject value) {
        assert cycml_generator.NIL != cycml_kp_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject _csetf_cycml_kp_info_knowledge_package_dependencies(final SubLObject v_object, final SubLObject value) {
        assert cycml_generator.NIL != cycml_kp_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject _csetf_cycml_kp_info_operations(final SubLObject v_object, final SubLObject value) {
        assert cycml_generator.NIL != cycml_kp_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject make_cycml_kp_info(SubLObject arglist) {
        if (arglist == cycml_generator.UNPROVIDED) {
            arglist = (SubLObject)cycml_generator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cycml_kp_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cycml_generator.NIL, next = arglist; cycml_generator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cycml_generator.$kw42$KNOWLEDGE_PACKAGE_ID)) {
                _csetf_cycml_kp_info_knowledge_package_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycml_generator.$kw43$KNOWLEDGE_PACKAGE_DEPENDENCIES)) {
                _csetf_cycml_kp_info_knowledge_package_dependencies(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycml_generator.$kw44$OPERATIONS)) {
                _csetf_cycml_kp_info_operations(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cycml_generator.$str45$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject visit_defstruct_cycml_kp_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cycml_generator.$kw46$BEGIN, (SubLObject)cycml_generator.$sym47$MAKE_CYCML_KP_INFO, (SubLObject)cycml_generator.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cycml_generator.$kw48$SLOT, (SubLObject)cycml_generator.$kw42$KNOWLEDGE_PACKAGE_ID, cycml_kp_info_knowledge_package_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycml_generator.$kw48$SLOT, (SubLObject)cycml_generator.$kw43$KNOWLEDGE_PACKAGE_DEPENDENCIES, cycml_kp_info_knowledge_package_dependencies(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycml_generator.$kw48$SLOT, (SubLObject)cycml_generator.$kw44$OPERATIONS, cycml_kp_info_operations(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycml_generator.$kw49$END, (SubLObject)cycml_generator.$sym47$MAKE_CYCML_KP_INFO, (SubLObject)cycml_generator.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3048L)
    public static SubLObject visit_defstruct_object_cycml_kp_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cycml_kp_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3353L)
    public static SubLObject print_cycml_kp_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)cycml_generator.$str51$__CYCML_KP_INFO_, stream, (SubLObject)cycml_generator.UNPROVIDED, (SubLObject)cycml_generator.UNPROVIDED);
        print_high.prin1(cycml_kp_info_knowledge_package_id(v_object), stream);
        streams_high.terpri(stream);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 3767L)
    public static SubLObject cycml_add_create_constant_oper(final SubLObject cycml_kp_info, final SubLObject constant, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
        if (cyclist == cycml_generator.UNPROVIDED) {
            cyclist = (SubLObject)cycml_generator.NIL;
        }
        if (cyc_image_id == cycml_generator.UNPROVIDED) {
            cyc_image_id = (SubLObject)cycml_generator.NIL;
        }
        if (operation_time == cycml_generator.UNPROVIDED) {
            operation_time = (SubLObject)cycml_generator.NIL;
        }
        if (operation_second == cycml_generator.UNPROVIDED) {
            operation_second = (SubLObject)cycml_generator.NIL;
        }
        if (purpose == cycml_generator.UNPROVIDED) {
            purpose = (SubLObject)cycml_generator.NIL;
        }
        assert cycml_generator.NIL != cycml_kp_info_p(cycml_kp_info) : cycml_kp_info;
        assert cycml_generator.NIL != cycl_grammar.cycl_constant_p(constant) : constant;
        if (cycml_generator.NIL != cyclist && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(cyclist)) {
            throw new AssertionError(cyclist);
        }
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        if (cycml_generator.NIL != operation_second && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_second)) {
            throw new AssertionError(operation_second);
        }
        if (cycml_generator.NIL != purpose && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(purpose)) {
            throw new AssertionError(purpose);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cycml_generator.$kw54$CREATE, constant, cyclist, cyc_image_id, operation_time, operation_second, purpose), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 5313L)
    public static SubLObject cycml_add_find_or_create_constant_oper(final SubLObject cycml_kp_info, final SubLObject constant, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
        if (cyclist == cycml_generator.UNPROVIDED) {
            cyclist = (SubLObject)cycml_generator.NIL;
        }
        if (cyc_image_id == cycml_generator.UNPROVIDED) {
            cyc_image_id = (SubLObject)cycml_generator.NIL;
        }
        if (operation_time == cycml_generator.UNPROVIDED) {
            operation_time = (SubLObject)cycml_generator.NIL;
        }
        if (operation_second == cycml_generator.UNPROVIDED) {
            operation_second = (SubLObject)cycml_generator.NIL;
        }
        if (purpose == cycml_generator.UNPROVIDED) {
            purpose = (SubLObject)cycml_generator.NIL;
        }
        assert cycml_generator.NIL != cycml_kp_info_p(cycml_kp_info) : cycml_kp_info;
        assert cycml_generator.NIL != cycl_grammar.cycl_constant_p(constant) : constant;
        if (cycml_generator.NIL != cyclist && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(cyclist)) {
            throw new AssertionError(cyclist);
        }
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        if (cycml_generator.NIL != operation_second && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_second)) {
            throw new AssertionError(operation_second);
        }
        if (cycml_generator.NIL != purpose && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(purpose)) {
            throw new AssertionError(purpose);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cycml_generator.$kw55$FIND_OR_CREATE, constant, cyclist, cyc_image_id, operation_time, operation_second, purpose), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 6824L)
    public static SubLObject cycml_add_rename_constant_oper(final SubLObject cycml_kp_info, final SubLObject constant, final SubLObject new_name, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyc_image_id == cycml_generator.UNPROVIDED) {
            cyc_image_id = (SubLObject)cycml_generator.NIL;
        }
        if (operation_time == cycml_generator.UNPROVIDED) {
            operation_time = (SubLObject)cycml_generator.NIL;
        }
        assert cycml_generator.NIL != cycml_kp_info_p(cycml_kp_info) : cycml_kp_info;
        assert cycml_generator.NIL != cycl_grammar.cycl_constant_p(constant) : constant;
        assert cycml_generator.NIL != constant_completion_high.valid_constant_name_p(new_name) : new_name;
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cycml_generator.$kw57$RENAME, constant, new_name, cyc_image_id, operation_time), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 7922L)
    public static SubLObject cycml_add_merge_fort_oper(final SubLObject cycml_kp_info, final SubLObject fort_1, final SubLObject fort_2, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyc_image_id == cycml_generator.UNPROVIDED) {
            cyc_image_id = (SubLObject)cycml_generator.NIL;
        }
        if (operation_time == cycml_generator.UNPROVIDED) {
            operation_time = (SubLObject)cycml_generator.NIL;
        }
        assert cycml_generator.NIL != cycml_kp_info_p(cycml_kp_info) : cycml_kp_info;
        assert cycml_generator.NIL != cycl_grammar.cycl_fort_p(fort_1) : fort_1;
        assert cycml_generator.NIL != cycl_grammar.cycl_fort_p(fort_2) : fort_2;
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cycml_generator.$kw58$MERGE, fort_1, fort_2, cyc_image_id, operation_time), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 8988L)
    public static SubLObject cycml_add_kill_fort_oper(final SubLObject cycml_kp_info, final SubLObject fort, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time) {
        if (cyclist == cycml_generator.UNPROVIDED) {
            cyclist = (SubLObject)cycml_generator.NIL;
        }
        if (cyc_image_id == cycml_generator.UNPROVIDED) {
            cyc_image_id = (SubLObject)cycml_generator.NIL;
        }
        if (operation_time == cycml_generator.UNPROVIDED) {
            operation_time = (SubLObject)cycml_generator.NIL;
        }
        assert cycml_generator.NIL != cycml_kp_info_p(cycml_kp_info) : cycml_kp_info;
        assert cycml_generator.NIL != cycl_grammar.cycl_fort_p(fort) : fort;
        if (cycml_generator.NIL != cyclist && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(cyclist)) {
            throw new AssertionError(cyclist);
        }
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cycml_generator.$kw59$KILL, fort, cyclist, cyc_image_id, operation_time), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 9965L)
    public static SubLObject cycml_add_assert_oper(final SubLObject cycml_kp_info, final SubLObject assertion, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
        if (mt == cycml_generator.UNPROVIDED) {
            mt = (SubLObject)cycml_generator.NIL;
        }
        if (strength == cycml_generator.UNPROVIDED) {
            strength = (SubLObject)cycml_generator.NIL;
        }
        if (direction == cycml_generator.UNPROVIDED) {
            direction = (SubLObject)cycml_generator.NIL;
        }
        if (cyclist == cycml_generator.UNPROVIDED) {
            cyclist = (SubLObject)cycml_generator.NIL;
        }
        if (cyc_image_id == cycml_generator.UNPROVIDED) {
            cyc_image_id = (SubLObject)cycml_generator.NIL;
        }
        if (operation_time == cycml_generator.UNPROVIDED) {
            operation_time = (SubLObject)cycml_generator.NIL;
        }
        if (operation_second == cycml_generator.UNPROVIDED) {
            operation_second = (SubLObject)cycml_generator.NIL;
        }
        if (purpose == cycml_generator.UNPROVIDED) {
            purpose = (SubLObject)cycml_generator.NIL;
        }
        assert cycml_generator.NIL != cycml_kp_info_p(cycml_kp_info) : cycml_kp_info;
        assert cycml_generator.NIL != cycl_grammar.cycl_sentence_p(assertion) : assertion;
        if (cycml_generator.NIL != mt && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(mt)) {
            throw new AssertionError(mt);
        }
        if (cycml_generator.NIL != strength && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == enumeration_types.el_strength_p(strength)) {
            throw new AssertionError(strength);
        }
        if (cycml_generator.NIL != direction && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == enumeration_types.direction_p(direction)) {
            throw new AssertionError(direction);
        }
        if (cycml_generator.NIL != cyclist && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(cyclist)) {
            throw new AssertionError(cyclist);
        }
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        if (cycml_generator.NIL != operation_second && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_second)) {
            throw new AssertionError(operation_second);
        }
        if (cycml_generator.NIL != purpose && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(purpose)) {
            throw new AssertionError(purpose);
        }
        if (cycml_generator.NIL != assertion_handles.assertion_p(assertion) && cycml_generator.NIL == mt) {
            mt = assertions_high.assertion_mt(assertion);
        }
        if (cycml_generator.NIL != assertion_handles.assertion_p(assertion) && cycml_generator.NIL == strength) {
            strength = assertions_high.assertion_strength(assertion);
        }
        if (cycml_generator.NIL != assertion_handles.assertion_p(assertion) && cycml_generator.NIL == direction) {
            direction = assertions_high.assertion_direction(assertion);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new SubLObject[] { cycml_generator.$kw63$ASSERT, assertion, mt, strength, direction, cyclist, cyc_image_id, operation_time, operation_second, purpose }), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 12306L)
    public static SubLObject cycml_add_reassert_oper(final SubLObject cycml_kp_info, final SubLObject assertion, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time, SubLObject operation_second, SubLObject purpose) {
        if (mt == cycml_generator.UNPROVIDED) {
            mt = (SubLObject)cycml_generator.NIL;
        }
        if (strength == cycml_generator.UNPROVIDED) {
            strength = (SubLObject)cycml_generator.NIL;
        }
        if (direction == cycml_generator.UNPROVIDED) {
            direction = (SubLObject)cycml_generator.NIL;
        }
        if (cyclist == cycml_generator.UNPROVIDED) {
            cyclist = (SubLObject)cycml_generator.NIL;
        }
        if (cyc_image_id == cycml_generator.UNPROVIDED) {
            cyc_image_id = (SubLObject)cycml_generator.NIL;
        }
        if (operation_time == cycml_generator.UNPROVIDED) {
            operation_time = (SubLObject)cycml_generator.NIL;
        }
        if (operation_second == cycml_generator.UNPROVIDED) {
            operation_second = (SubLObject)cycml_generator.NIL;
        }
        if (purpose == cycml_generator.UNPROVIDED) {
            purpose = (SubLObject)cycml_generator.NIL;
        }
        assert cycml_generator.NIL != cycml_kp_info_p(cycml_kp_info) : cycml_kp_info;
        assert cycml_generator.NIL != cycl_grammar.cycl_sentence_p(assertion) : assertion;
        if (cycml_generator.NIL != mt && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(mt)) {
            throw new AssertionError(mt);
        }
        if (cycml_generator.NIL != strength && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == enumeration_types.el_strength_p(strength)) {
            throw new AssertionError(strength);
        }
        if (cycml_generator.NIL != direction && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == enumeration_types.direction_p(direction)) {
            throw new AssertionError(direction);
        }
        if (cycml_generator.NIL != cyclist && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(cyclist)) {
            throw new AssertionError(cyclist);
        }
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        if (cycml_generator.NIL != operation_second && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_second)) {
            throw new AssertionError(operation_second);
        }
        if (cycml_generator.NIL != purpose && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(purpose)) {
            throw new AssertionError(purpose);
        }
        if (cycml_generator.NIL != assertion_handles.assertion_p(assertion) && cycml_generator.NIL == mt) {
            mt = assertions_high.assertion_mt(assertion);
        }
        if (cycml_generator.NIL != assertion_handles.assertion_p(assertion) && cycml_generator.NIL == strength) {
            strength = assertions_high.assertion_strength(assertion);
        }
        if (cycml_generator.NIL != assertion_handles.assertion_p(assertion) && cycml_generator.NIL == direction) {
            direction = assertions_high.assertion_direction(assertion);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new SubLObject[] { cycml_generator.$kw64$REASSERT, assertion, mt, strength, direction, cyclist, cyc_image_id, operation_time, operation_second, purpose }), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 14669L)
    public static SubLObject cycml_add_unassert_oper(final SubLObject cycml_kp_info, final SubLObject assertion, SubLObject mt, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time) {
        if (mt == cycml_generator.UNPROVIDED) {
            mt = (SubLObject)cycml_generator.NIL;
        }
        if (cyclist == cycml_generator.UNPROVIDED) {
            cyclist = (SubLObject)cycml_generator.NIL;
        }
        if (cyc_image_id == cycml_generator.UNPROVIDED) {
            cyc_image_id = (SubLObject)cycml_generator.NIL;
        }
        if (operation_time == cycml_generator.UNPROVIDED) {
            operation_time = (SubLObject)cycml_generator.NIL;
        }
        assert cycml_generator.NIL != cycml_kp_info_p(cycml_kp_info) : cycml_kp_info;
        assert cycml_generator.NIL != cycl_grammar.cycl_sentence_p(assertion) : assertion;
        if (cycml_generator.NIL != mt && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(mt)) {
            throw new AssertionError(mt);
        }
        if (cycml_generator.NIL != cyclist && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(cyclist)) {
            throw new AssertionError(cyclist);
        }
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        if (cycml_generator.NIL != assertion_handles.assertion_p(assertion) && cycml_generator.NIL == mt) {
            mt = assertions_high.assertion_mt(assertion);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cycml_generator.$kw65$UNASSERT, assertion, mt, cyclist, cyc_image_id, operation_time), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 16159L)
    public static SubLObject cycml_add_blast_assertion_oper(final SubLObject cycml_kp_info, final SubLObject assertion, SubLObject mt, SubLObject cyclist, SubLObject cyc_image_id, SubLObject operation_time) {
        if (mt == cycml_generator.UNPROVIDED) {
            mt = (SubLObject)cycml_generator.NIL;
        }
        if (cyclist == cycml_generator.UNPROVIDED) {
            cyclist = (SubLObject)cycml_generator.NIL;
        }
        if (cyc_image_id == cycml_generator.UNPROVIDED) {
            cyc_image_id = (SubLObject)cycml_generator.NIL;
        }
        if (operation_time == cycml_generator.UNPROVIDED) {
            operation_time = (SubLObject)cycml_generator.NIL;
        }
        assert cycml_generator.NIL != cycml_kp_info_p(cycml_kp_info) : cycml_kp_info;
        assert cycml_generator.NIL != cycl_grammar.cycl_sentence_p(assertion) : assertion;
        if (cycml_generator.NIL != mt && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(mt)) {
            throw new AssertionError(mt);
        }
        if (cycml_generator.NIL != cyclist && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(cyclist)) {
            throw new AssertionError(cyclist);
        }
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        if (cycml_generator.NIL != assertion_handles.assertion_p(assertion) && cycml_generator.NIL == mt) {
            mt = assertions_high.assertion_mt(assertion);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cycml_generator.$kw66$BLAST, assertion, mt, cyclist, cyc_image_id, operation_time), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 17645L)
    public static SubLObject cycml_add_create_skolem_oper(final SubLObject cycml_kp_info, final SubLObject external_id, final SubLObject unreified_sk_term, final SubLObject mt, final SubLObject cnfs, final SubLObject arg_types, final SubLObject cyclist, final SubLObject cyc_image_id, final SubLObject operation_time) {
        assert cycml_generator.NIL != cycml_kp_info_p(cycml_kp_info) : cycml_kp_info;
        assert cycml_generator.NIL != constants_high.constant_external_id_p(external_id) : external_id;
        assert cycml_generator.NIL != Types.consp(unreified_sk_term) : unreified_sk_term;
        assert cycml_generator.NIL != cycl_grammar.cycl_fort_p(mt) : mt;
        assert cycml_generator.NIL != Types.listp(cnfs) : cnfs;
        assert cycml_generator.NIL != Types.listp(arg_types) : arg_types;
        if (cycml_generator.NIL != cyclist && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(cyclist)) {
            throw new AssertionError(cyclist);
        }
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        SubLObject operations = cycml_kp_info_operations(cycml_kp_info);
        operations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new SubLObject[] { cycml_generator.$kw69$CREATE_SKOLEM, external_id, unreified_sk_term, mt, cnfs, arg_types, cyclist, cyc_image_id, operation_time }), operations);
        _csetf_cycml_kp_info_operations(cycml_kp_info, operations);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 19707L)
    public static SubLObject cycml_serialize_knowledge_package(final SubLObject cycml_kp_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str70$cycml;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$9 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$10 = (SubLObject)cycml_generator.$str71$knowledge_package;
                        xml_utilities.xml_start_tag_internal(name_var_$10, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$11 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_knowledge_package_id(cycml_kp_info_knowledge_package_id(cycml_kp_info), (SubLObject)cycml_generator.UNPROVIDED);
                                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                    cycml.cycml_indent();
                                    final SubLObject name_var_$11 = (SubLObject)cycml_generator.$str72$knowledge_package_dependencies;
                                    xml_utilities.xml_start_tag_internal(name_var_$11, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                                    final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                        final SubLObject _prev_bind_0_$13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                        try {
                                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                            SubLObject cdolist_list_var = cycml_kp_info_knowledge_package_dependencies(cycml_kp_info);
                                            SubLObject knowledge_package_dependency = (SubLObject)cycml_generator.NIL;
                                            knowledge_package_dependency = cdolist_list_var.first();
                                            while (cycml_generator.NIL != cdolist_list_var) {
                                                cycml_serialize_knowledge_package_id(knowledge_package_dependency, (SubLObject)cycml_generator.UNPROVIDED);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                knowledge_package_dependency = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$13, thread);
                                        }
                                        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                            cycml.cycml_indent();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    xml_utilities.xml_end_tag_internal(name_var_$11);
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$11, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$10, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$10);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$12 = (SubLObject)cycml_generator.$str73$operations;
                        xml_utilities.xml_start_tag_internal(name_var_$12, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                SubLObject cdolist_list_var2 = Sequences.reverse(cycml_kp_info_operations(cycml_kp_info));
                                SubLObject operation = (SubLObject)cycml_generator.NIL;
                                operation = cdolist_list_var2.first();
                                while (cycml_generator.NIL != cdolist_list_var2) {
                                    cycml_serialize_operation(operation);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    operation = cdolist_list_var2.first();
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$15, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$14, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$12);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$9, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 20718L)
    public static SubLObject cycml_serialize_operation(final SubLObject operation) {
        final SubLObject pcase_var;
        final SubLObject operation_type = pcase_var = operation.first();
        if (pcase_var.eql((SubLObject)cycml_generator.$kw54$CREATE)) {
            cycml_serialize_create_constant_oper(operation.rest());
        }
        else if (pcase_var.eql((SubLObject)cycml_generator.$kw55$FIND_OR_CREATE)) {
            cycml_serialize_find_or_create_constant_oper(operation.rest());
        }
        else if (pcase_var.eql((SubLObject)cycml_generator.$kw57$RENAME)) {
            cycml_serialize_rename_constant_oper(operation.rest());
        }
        else if (pcase_var.eql((SubLObject)cycml_generator.$kw58$MERGE)) {
            cycml_serialize_merge_forts_oper(operation.rest());
        }
        else if (pcase_var.eql((SubLObject)cycml_generator.$kw59$KILL)) {
            cycml_serialize_kill_fort_oper(operation.rest());
        }
        else if (pcase_var.eql((SubLObject)cycml_generator.$kw63$ASSERT)) {
            cycml_serialize_assert_oper(operation.rest());
        }
        else if (pcase_var.eql((SubLObject)cycml_generator.$kw64$REASSERT)) {
            cycml_serialize_reassert_oper(operation.rest());
        }
        else if (pcase_var.eql((SubLObject)cycml_generator.$kw65$UNASSERT)) {
            cycml_serialize_unassert_oper(operation.rest());
        }
        else if (pcase_var.eql((SubLObject)cycml_generator.$kw66$BLAST)) {
            cycml_serialize_blast_assertion_oper(operation.rest());
        }
        else if (pcase_var.eql((SubLObject)cycml_generator.$kw69$CREATE_SKOLEM)) {
            cycml_serialize_create_skolem_oper(operation.rest());
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 21765L)
    public static SubLObject cycml_serialize_create_constant_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = (SubLObject)cycml_generator.NIL;
        SubLObject cyclist = (SubLObject)cycml_generator.NIL;
        SubLObject cyc_image_id = (SubLObject)cycml_generator.NIL;
        SubLObject operation_time = (SubLObject)cycml_generator.NIL;
        SubLObject operation_second = (SubLObject)cycml_generator.NIL;
        SubLObject purpose = (SubLObject)cycml_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parms, parms, (SubLObject)cycml_generator.$list74);
        constant = parms.first();
        SubLObject current = parms.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list74);
        cyclist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list74);
        cyc_image_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list74);
        operation_time = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list74);
        operation_second = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list74);
        purpose = current.first();
        current = current.rest();
        if (cycml_generator.NIL == current) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str75$create;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclconstant(constant);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$19, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parms, (SubLObject)cycml_generator.$list74);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 22363L)
    public static SubLObject cycml_serialize_find_or_create_constant_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = (SubLObject)cycml_generator.NIL;
        SubLObject cyclist = (SubLObject)cycml_generator.NIL;
        SubLObject cyc_image_id = (SubLObject)cycml_generator.NIL;
        SubLObject operation_time = (SubLObject)cycml_generator.NIL;
        SubLObject operation_second = (SubLObject)cycml_generator.NIL;
        SubLObject purpose = (SubLObject)cycml_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parms, parms, (SubLObject)cycml_generator.$list74);
        constant = parms.first();
        SubLObject current = parms.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list74);
        cyclist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list74);
        cyc_image_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list74);
        operation_time = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list74);
        operation_second = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list74);
        purpose = current.first();
        current = current.rest();
        if (cycml_generator.NIL == current) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str76$find_or_create;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclconstant(constant);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$20, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parms, (SubLObject)cycml_generator.$list74);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 22986L)
    public static SubLObject cycml_serialize_rename_constant_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = (SubLObject)cycml_generator.NIL;
        SubLObject new_name = (SubLObject)cycml_generator.NIL;
        SubLObject cyc_image_id = (SubLObject)cycml_generator.NIL;
        SubLObject operation_time = (SubLObject)cycml_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parms, parms, (SubLObject)cycml_generator.$list77);
        constant = parms.first();
        SubLObject current = parms.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list77);
        new_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list77);
        cyc_image_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list77);
        operation_time = current.first();
        current = current.rest();
        if (cycml_generator.NIL == current) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str78$rename;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclconstant(constant);
                        cycml_serialize_new_name(new_name, (SubLObject)cycml_generator.UNPROVIDED);
                        cycml_serialize_bookkeeping((SubLObject)cycml_generator.NIL, cyc_image_id, operation_time, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL);
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$21, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parms, (SubLObject)cycml_generator.$list77);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 23549L)
    public static SubLObject cycml_serialize_merge_forts_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fort_1 = (SubLObject)cycml_generator.NIL;
        SubLObject fort_2 = (SubLObject)cycml_generator.NIL;
        SubLObject cyc_image_id = (SubLObject)cycml_generator.NIL;
        SubLObject operation_time = (SubLObject)cycml_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parms, parms, (SubLObject)cycml_generator.$list79);
        fort_1 = parms.first();
        SubLObject current = parms.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list79);
        fort_2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list79);
        cyc_image_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list79);
        operation_time = current.first();
        current = current.rest();
        if (cycml_generator.NIL == current) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str80$merge;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_fort(fort_1);
                        cycml_serialize_fort(fort_2);
                        cycml_serialize_bookkeeping((SubLObject)cycml_generator.NIL, cyc_image_id, operation_time, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL);
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$22, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parms, (SubLObject)cycml_generator.$list79);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 24088L)
    public static SubLObject cycml_serialize_kill_fort_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fort = (SubLObject)cycml_generator.NIL;
        SubLObject cyclist = (SubLObject)cycml_generator.NIL;
        SubLObject cyc_image_id = (SubLObject)cycml_generator.NIL;
        SubLObject operation_time = (SubLObject)cycml_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parms, parms, (SubLObject)cycml_generator.$list81);
        fort = parms.first();
        SubLObject current = parms.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list81);
        cyclist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list81);
        cyc_image_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list81);
        operation_time = current.first();
        current = current.rest();
        if (cycml_generator.NIL == current) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str82$kill;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$23 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_fort(fort);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL);
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$23, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parms, (SubLObject)cycml_generator.$list81);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 24581L)
    public static SubLObject cycml_serialize_assert_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = (SubLObject)cycml_generator.NIL;
        SubLObject mt = (SubLObject)cycml_generator.NIL;
        SubLObject strength = (SubLObject)cycml_generator.NIL;
        SubLObject direction = (SubLObject)cycml_generator.NIL;
        SubLObject cyclist = (SubLObject)cycml_generator.NIL;
        SubLObject cyc_image_id = (SubLObject)cycml_generator.NIL;
        SubLObject operation_time = (SubLObject)cycml_generator.NIL;
        SubLObject operation_second = (SubLObject)cycml_generator.NIL;
        SubLObject purpose = (SubLObject)cycml_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parms, parms, (SubLObject)cycml_generator.$list83);
        assertion = parms.first();
        SubLObject current = parms.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        strength = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        cyclist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        cyc_image_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        operation_time = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        operation_second = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        purpose = current.first();
        current = current.rest();
        if (cycml_generator.NIL == current) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str84$assert;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(assertion);
                        cycml.cycml_serialize_paraphrase(pph_main.generate_phrase(assertion, (SubLObject)cycml_generator.UNPROVIDED, (SubLObject)cycml_generator.UNPROVIDED, (SubLObject)cycml_generator.UNPROVIDED, (SubLObject)cycml_generator.UNPROVIDED, (SubLObject)cycml_generator.UNPROVIDED, (SubLObject)cycml_generator.UNPROVIDED, (SubLObject)cycml_generator.UNPROVIDED), (SubLObject)cycml_generator.$list85);
                        cycml_serialize_microtheory(mt);
                        cycml.cycml_serialize_strength(strength);
                        cycml.cycml_serialize_direction(direction);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, operation_second, purpose);
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$24, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parms, (SubLObject)cycml_generator.$list83);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 25481L)
    public static SubLObject cycml_serialize_reassert_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = (SubLObject)cycml_generator.NIL;
        SubLObject mt = (SubLObject)cycml_generator.NIL;
        SubLObject strength = (SubLObject)cycml_generator.NIL;
        SubLObject direction = (SubLObject)cycml_generator.NIL;
        SubLObject cyclist = (SubLObject)cycml_generator.NIL;
        SubLObject cyc_image_id = (SubLObject)cycml_generator.NIL;
        SubLObject operation_time = (SubLObject)cycml_generator.NIL;
        SubLObject operation_second = (SubLObject)cycml_generator.NIL;
        SubLObject purpose = (SubLObject)cycml_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parms, parms, (SubLObject)cycml_generator.$list83);
        assertion = parms.first();
        SubLObject current = parms.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        strength = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        cyclist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        cyc_image_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        operation_time = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        operation_second = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list83);
        purpose = current.first();
        current = current.rest();
        if (cycml_generator.NIL == current) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str86$reassert;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
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
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$25, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parms, (SubLObject)cycml_generator.$list83);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 26258L)
    public static SubLObject cycml_serialize_unassert_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = (SubLObject)cycml_generator.NIL;
        SubLObject mt = (SubLObject)cycml_generator.NIL;
        SubLObject cyclist = (SubLObject)cycml_generator.NIL;
        SubLObject cyc_image_id = (SubLObject)cycml_generator.NIL;
        SubLObject operation_time = (SubLObject)cycml_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parms, parms, (SubLObject)cycml_generator.$list87);
        assertion = parms.first();
        SubLObject current = parms.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list87);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list87);
        cyclist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list87);
        cyc_image_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list87);
        operation_time = current.first();
        current = current.rest();
        if (cycml_generator.NIL == current) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str88$unassert;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(assertion);
                        cycml_serialize_microtheory(mt);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL);
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$26, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parms, (SubLObject)cycml_generator.$list87);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 26829L)
    public static SubLObject cycml_serialize_blast_assertion_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = (SubLObject)cycml_generator.NIL;
        SubLObject mt = (SubLObject)cycml_generator.NIL;
        SubLObject cyclist = (SubLObject)cycml_generator.NIL;
        SubLObject cyc_image_id = (SubLObject)cycml_generator.NIL;
        SubLObject operation_time = (SubLObject)cycml_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parms, parms, (SubLObject)cycml_generator.$list87);
        assertion = parms.first();
        SubLObject current = parms.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list87);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list87);
        cyclist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list87);
        cyc_image_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list87);
        operation_time = current.first();
        current = current.rest();
        if (cycml_generator.NIL == current) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str89$blast;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(assertion);
                        cycml_serialize_microtheory(mt);
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL);
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$27, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parms, (SubLObject)cycml_generator.$list87);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 27411L)
    public static SubLObject cycml_serialize_create_skolem_oper(final SubLObject parms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject external_id = (SubLObject)cycml_generator.NIL;
        SubLObject unreified_sk_term = (SubLObject)cycml_generator.NIL;
        SubLObject mt = (SubLObject)cycml_generator.NIL;
        SubLObject cnfs = (SubLObject)cycml_generator.NIL;
        SubLObject arg_types = (SubLObject)cycml_generator.NIL;
        SubLObject cyclist = (SubLObject)cycml_generator.NIL;
        SubLObject cyc_image_id = (SubLObject)cycml_generator.NIL;
        SubLObject operation_time = (SubLObject)cycml_generator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parms, parms, (SubLObject)cycml_generator.$list90);
        external_id = parms.first();
        SubLObject current = parms.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list90);
        unreified_sk_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list90);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list90);
        cnfs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list90);
        arg_types = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list90);
        cyclist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list90);
        cyc_image_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parms, (SubLObject)cycml_generator.$list90);
        operation_time = current.first();
        current = current.rest();
        if (cycml_generator.NIL == current) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str91$create_skolem;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml.cycml_serialize_guid(external_id, (SubLObject)cycml_generator.UNPROVIDED);
                        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                            cycml.cycml_indent();
                            final SubLObject name_var_$29 = (SubLObject)cycml_generator.$str92$skolem_unreified_term;
                            xml_utilities.xml_start_tag_internal(name_var_$29, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$30 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_subllist(unreified_sk_term);
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$30, thread);
                                }
                                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                    cycml.cycml_indent();
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$29, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$29);
                        }
                        cycml_serialize_microtheory(mt);
                        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                            cycml.cycml_indent();
                            final SubLObject name_var_$30 = (SubLObject)cycml_generator.$str93$skolem_conjunctive_normal_form;
                            xml_utilities.xml_start_tag_internal(name_var_$30, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_subllist(cnfs);
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$32, thread);
                                }
                                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                    cycml.cycml_indent();
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$31, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$30);
                        }
                        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                            cycml.cycml_indent();
                            final SubLObject name_var_$31 = (SubLObject)cycml_generator.$str94$skolem_arg_types;
                            xml_utilities.xml_start_tag_internal(name_var_$31, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_subllist(arg_types);
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$34, thread);
                                }
                                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                    cycml.cycml_indent();
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$33, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$31);
                        }
                        cycml_serialize_bookkeeping(cyclist, cyc_image_id, operation_time, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL);
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$28, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parms, (SubLObject)cycml_generator.$list90);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 28395L)
    public static SubLObject cycml_serialize_bookkeeping(final SubLObject cyclist, final SubLObject cyc_image_id, final SubLObject operation_time, final SubLObject operation_second, final SubLObject purpose) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml_generator.NIL != cyclist && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(cyclist)) {
            throw new AssertionError(cyclist);
        }
        if (cycml_generator.NIL != cyc_image_id && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.stringp(cyc_image_id)) {
            throw new AssertionError(cyc_image_id);
        }
        if (cycml_generator.NIL != operation_time && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == Types.integerp(operation_time)) {
            throw new AssertionError(operation_time);
        }
        if (cycml_generator.NIL != operation_second && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == numeric_date_utilities.universal_second_p(operation_second)) {
            throw new AssertionError(operation_second);
        }
        if (cycml_generator.NIL != purpose && !cycml_generator.assertionsDisabledInClass && cycml_generator.NIL == cycl_grammar.cycl_fort_p(purpose)) {
            throw new AssertionError(purpose);
        }
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str96$bookkeeping_info;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$38 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (cycml_generator.NIL != cyclist && cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$39 = (SubLObject)cycml_generator.$str97$Cyclist;
                        xml_utilities.xml_start_tag_internal(name_var_$39, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$40 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_cyclconstant(cyclist);
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$40, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$39);
                    }
                    if (cycml_generator.NIL != cyc_image_id) {
                        cycml_serialize_cyc_image_id(cyc_image_id, (SubLObject)cycml_generator.UNPROVIDED);
                    }
                    if (cycml_generator.NIL != operation_time) {
                        cycml_serialize_universal_date(operation_time);
                    }
                    if (cycml_generator.NIL != operation_second) {
                        cycml_serialize_universal_second(operation_second);
                    }
                    if (cycml_generator.NIL != purpose) {
                        cycml_serialize_purpose(purpose);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$38, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 29746L)
    public static SubLObject cycml_serialize_microtheory(final SubLObject el_or_hl_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycml_generator.NIL != cycl_grammar.cycl_fort_p(el_or_hl_fort) : el_or_hl_fort;
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str98$Microtheory;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$42 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (cycml_generator.NIL != cycl_grammar.cycl_constant_p(el_or_hl_fort)) {
                        cycml_serialize_cyclconstant(el_or_hl_fort);
                    }
                    else {
                        cycml_serialize_cyclreifiablenonatomicterm(el_or_hl_fort);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$42, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 30214L)
    public static SubLObject cycml_serialize_fort(final SubLObject el_or_hl_fort) {
        assert cycml_generator.NIL != cycl_grammar.cycl_fort_p(el_or_hl_fort) : el_or_hl_fort;
        if (cycml_generator.NIL != cycl_grammar.cycl_constant_p(el_or_hl_fort)) {
            cycml_serialize_cyclconstant(el_or_hl_fort);
        }
        else if (cycml_generator.NIL != nart_handles.nart_p(el_or_hl_fort)) {
            cycml_serialize_cyclreifiednonatomicterm(el_or_hl_fort);
        }
        else {
            cycml_serialize_cyclreifiablenonatomicterm(el_or_hl_fort);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 30731L)
    public static SubLObject cycml_serialize_cyclconstant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycml_generator.NIL != cycl_grammar.cycl_constant_p(constant) : constant;
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str99$CycLConstant;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$43 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml.cycml_serialize_name(constants_high.constant_name_within_namespace(constant), (SubLObject)cycml_generator.UNPROVIDED);
                    cycml_serialize_namespace(constants_high.constant_namespace(constant), (SubLObject)cycml_generator.UNPROVIDED);
                    cycml.cycml_serialize_guid(constants_high.constant_external_id(constant), (SubLObject)cycml_generator.UNPROVIDED);
                    cycml_serialize_uri(Sequences.cconcatenate((SubLObject)cycml_generator.$str100$urn_uuid_, Guids.guid_to_string(constants_high.constant_guid(constant))), (SubLObject)cycml_generator.UNPROVIDED);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$43, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 31321L)
    public static SubLObject cycml_serialize_cyclreifiednonatomicterm(final SubLObject el_or_hl_nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycml_generator.NIL != cycl_grammar.cycl_nart_p(el_or_hl_nart) : el_or_hl_nart;
        if (cycml_generator.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && cycml_generator.NIL == nart_handles.nart_p(el_or_hl_nart) && (!el_or_hl_nart.isList() || cycml_generator.NIL == nart_handles.nart_p(el_or_hl_nart))) {
            Errors.error((SubLObject)cycml_generator.$str102$_S_is_not_a_reified_nart, el_or_hl_nart);
        }
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str103$CycLReifiedNonAtomicTerm;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$44 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$45 = (SubLObject)cycml_generator.$str104$Function_Denotational;
                        xml_utilities.xml_start_tag_internal(name_var_$45, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$46 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_object(cycl_utilities.nat_functor(el_or_hl_nart));
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$46, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$45);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$46 = (SubLObject)cycml_generator.$str105$argument_list;
                        xml_utilities.xml_start_tag_internal(name_var_$46, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$48 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                SubLObject cdolist_list_var = cycl_utilities.nat_args(el_or_hl_nart, (SubLObject)cycml_generator.UNPROVIDED);
                                SubLObject arg = (SubLObject)cycml_generator.NIL;
                                arg = cdolist_list_var.first();
                                while (cycml_generator.NIL != cdolist_list_var) {
                                    cycml_serialize_object(arg);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$48, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$46);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$44, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 32080L)
    public static SubLObject cycml_serialize_cyclreifiablenonatomicterm(final SubLObject el_or_hl_nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycml_generator.NIL != cycl_grammar.cycl_nart_p(el_or_hl_nart) : el_or_hl_nart;
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str106$CycLReifiableNonAtomicTerm;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$51 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$52 = (SubLObject)cycml_generator.$str104$Function_Denotational;
                        xml_utilities.xml_start_tag_internal(name_var_$52, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$52 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$53 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_object(cycl_utilities.nat_functor(el_or_hl_nart));
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$53, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$52, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$52);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$53 = (SubLObject)cycml_generator.$str105$argument_list;
                        xml_utilities.xml_start_tag_internal(name_var_$53, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$55 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                SubLObject cdolist_list_var = cycl_utilities.nat_args(el_or_hl_nart, (SubLObject)cycml_generator.UNPROVIDED);
                                SubLObject arg = (SubLObject)cycml_generator.NIL;
                                arg = cdolist_list_var.first();
                                while (cycml_generator.NIL != cdolist_list_var) {
                                    cycml_serialize_object(arg);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$55, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$54, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$53);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$51, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 32699L)
    public static SubLObject cycml_serialize_elnonatomicterm(final SubLObject el_nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycml_generator.NIL != cycl_grammar.cycl_nat_p(el_nat) : el_nat;
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str108$ELNonAtomicTerm;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$58 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$59 = (SubLObject)cycml_generator.$str104$Function_Denotational;
                        xml_utilities.xml_start_tag_internal(name_var_$59, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$60 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_object(cycl_utilities.nat_functor(el_nat));
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$60, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$59, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$59);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$60 = (SubLObject)cycml_generator.$str105$argument_list;
                        xml_utilities.xml_start_tag_internal(name_var_$60, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$61 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$62 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                SubLObject cdolist_list_var = cycl_utilities.nat_args(el_nat, (SubLObject)cycml_generator.UNPROVIDED);
                                SubLObject arg = (SubLObject)cycml_generator.NIL;
                                arg = cdolist_list_var.first();
                                while (cycml_generator.NIL != cdolist_list_var) {
                                    cycml_serialize_object(arg);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                }
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$62, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$61, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$60);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$58, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 33453L)
    public static SubLObject within_cycl_atomic_sentence(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cycml_generator.$sym109$CLET, (SubLObject)cycml_generator.$list110, ConsesLow.append(body, (SubLObject)cycml_generator.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 33702L)
    public static SubLObject cycml_serialize_object(final SubLObject obj) {
        if (cycml_generator.NIL != cycl_grammar.cycl_variable_p(obj)) {
            cycml_serialize_cyclvariable(obj, (SubLObject)cycml_generator.UNPROVIDED);
        }
        else if (obj.isSymbol()) {
            cycml_serialize_sublsymbol(obj, (SubLObject)cycml_generator.UNPROVIDED);
        }
        else if (cycml_generator.NIL != nart_handles.nart_p(obj)) {
            cycml_serialize_cyclreifiednonatomicterm(obj);
        }
        else if (cycml_generator.NIL != assertion_handles.assertion_p(obj)) {
            cycml_serialize_cyclsentence(assertions_high.assertion_formula(obj));
        }
        else if (cycml_generator.NIL != Guids.guid_p(obj)) {
            cycml.cycml_serialize_guid(obj, (SubLObject)cycml_generator.UNPROVIDED);
        }
        else if (obj.isNumber()) {
            cycml_serialize_sublrealnumber(obj, (SubLObject)cycml_generator.UNPROVIDED);
        }
        else if (obj.isString()) {
            cycml_serialize_sublstring(obj, (SubLObject)cycml_generator.UNPROVIDED);
        }
        else if (obj.eql(cycml_generator.$const111$True)) {
            cycml_serialize_true((SubLObject)cycml_generator.$str112$, (SubLObject)cycml_generator.UNPROVIDED);
        }
        else if (obj.eql(cycml_generator.$const113$False)) {
            cycml_serialize_false((SubLObject)cycml_generator.$str112$, (SubLObject)cycml_generator.UNPROVIDED);
        }
        else if (cycml_generator.NIL != cycl_grammar.cycl_constant_p(obj)) {
            cycml_serialize_cyclconstant(obj);
        }
        else if (!obj.isList() && cycml_generator.NIL != cycl_grammar.cycl_nat_p(obj)) {
            cycml_serialize_cyclreifiablenonatomicterm(obj);
        }
        else if (obj.isList() && cycml_generator.NIL != cycl_grammar.cycl_nat_p(obj)) {
            cycml_serialize_elnonatomicterm(obj);
        }
        else if (obj.isList() && cycml_generator.NIL != el_grammar.el_sentence_p(obj)) {
            cycml_serialize_cyclsentence(obj);
        }
        else if (obj.isList()) {
            cycml_serialize_subllist(obj);
        }
        else {
            Errors.error((SubLObject)cycml_generator.$str114$__is_unknown_type_for_CycML_seria, obj);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 34999L)
    public static SubLObject cycml_serialize_object_to_string(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_string = (SubLObject)cycml_generator.NIL;
        SubLObject stream = (SubLObject)cycml_generator.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                cycml_serialize_object(obj);
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            output_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cycml_generator.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)cycml_generator.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return output_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 35189L)
    public static SubLObject cycml_serialize_subllist(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str116$SubLList;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$65 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    SubLObject rest;
                    for (rest = (SubLObject)cycml_generator.NIL, rest = list; rest.isCons(); rest = rest.rest()) {
                        cycml_serialize_object(rest.first());
                    }
                    if (cycml_generator.NIL != rest && cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$66 = (SubLObject)cycml_generator.$str117$dotted_item;
                        xml_utilities.xml_start_tag_internal(name_var_$66, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$66 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$67 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_object(rest);
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$67, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$66, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$66);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$65, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 35601L)
    public static SubLObject cycml_serialize_cyclsentence(final SubLObject el_or_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycml_generator.NIL != cycl_grammar.cycl_sentence_p(el_or_hl_formula) : el_or_hl_formula;
        final SubLObject arg0 = cycl_utilities.cycl_formula_arg0(el_or_hl_formula);
        if (arg0.eql(cycml_generator.$const118$not)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str119$not;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$69 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$69, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (arg0.eql(cycml_generator.$const120$and)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str121$and;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$70 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        SubLObject cdolist_list_var = cycl_utilities.cycl_formula_args(el_or_hl_formula);
                        SubLObject sentence = (SubLObject)cycml_generator.NIL;
                        sentence = cdolist_list_var.first();
                        while (cycml_generator.NIL != cdolist_list_var) {
                            cycml_serialize_cyclsentence(sentence);
                            cdolist_list_var = cdolist_list_var.rest();
                            sentence = cdolist_list_var.first();
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$70, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (arg0.eql(cycml_generator.$const122$or)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str123$or;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$71 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        SubLObject cdolist_list_var = cycl_utilities.cycl_formula_args(el_or_hl_formula);
                        SubLObject sentence = (SubLObject)cycml_generator.NIL;
                        sentence = cdolist_list_var.first();
                        while (cycml_generator.NIL != cdolist_list_var) {
                            cycml_serialize_cyclsentence(sentence);
                            cdolist_list_var = cdolist_list_var.rest();
                            sentence = cdolist_list_var.first();
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$71, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (arg0.eql(cycml_generator.$const124$xor)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str125$xor;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$72 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$72, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (arg0.eql(cycml_generator.$const126$implies)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str127$implies;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$73 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$73, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (arg0.eql(cycml_generator.$const128$equiv)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str129$equiv;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$74 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg1(el_or_hl_formula));
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$74, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (arg0.eql(cycml_generator.$const130$forAll)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str131$forAll;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$75 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml.cycml_serialize_variable(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), (SubLObject)cycml_generator.UNPROVIDED);
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$75, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (arg0.eql(cycml_generator.$const132$thereExists)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str133$thereExists;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$76 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), (SubLObject)cycml_generator.UNPROVIDED);
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg2(el_or_hl_formula));
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$76, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (arg0.eql(cycml_generator.$const134$thereExistExactly)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str135$thereExistExactly;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$77 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_sublrealnumber(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), (SubLObject)cycml_generator.UNPROVIDED);
                        cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg2(el_or_hl_formula), (SubLObject)cycml_generator.UNPROVIDED);
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg3(el_or_hl_formula));
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$77, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (arg0.eql(cycml_generator.$const136$thereExistAtMost)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str137$thereExistAtMost;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$78 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_sublrealnumber(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), (SubLObject)cycml_generator.UNPROVIDED);
                        cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg2(el_or_hl_formula), (SubLObject)cycml_generator.UNPROVIDED);
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg3(el_or_hl_formula));
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$78, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else if (arg0.eql(cycml_generator.$const138$thereExistAtLeast)) {
            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str139$thereExistAtLeast;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$79 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        cycml_serialize_sublrealnumber(cycl_utilities.cycl_formula_arg1(el_or_hl_formula), (SubLObject)cycml_generator.UNPROVIDED);
                        cycml_serialize_cyclvariable(cycl_utilities.cycl_formula_arg2(el_or_hl_formula), (SubLObject)cycml_generator.UNPROVIDED);
                        cycml_serialize_cyclsentence(cycl_utilities.cycl_formula_arg3(el_or_hl_formula));
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$79, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        else {
            cycml_serialize_cyclatomicsentence(el_or_hl_formula);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 38579L)
    public static SubLObject cycml_serialize_cyclatomicsentence(final SubLObject el_or_hl_atomic_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycml_generator.NIL != cycl_grammar.cycl_atomic_sentence_p(el_or_hl_atomic_sentence) : el_or_hl_atomic_sentence;
        final SubLObject pred = cycl_utilities.cycl_formula_arg0(el_or_hl_atomic_sentence);
        final SubLObject _prev_bind_0 = cycml_generator.$within_cycl_atomic_sentenceP$.currentBinding(thread);
        try {
            cycml_generator.$within_cycl_atomic_sentenceP$.bind((SubLObject)cycml_generator.T, thread);
            if (cycml_generator.NIL != isa.isaP(pred, cycml_generator.$const141$OpenCycDefinitionalPredicate, (SubLObject)cycml_generator.UNPROVIDED, (SubLObject)cycml_generator.UNPROVIDED)) {
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                    final SubLObject name_var = constants_high.constant_name(pred);
                    xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                    final SubLObject _prev_bind_0_$80 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                        final SubLObject _prev_bind_0_$81 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                            SubLObject cdolist_list_var = cycl_utilities.cycl_formula_args(el_or_hl_atomic_sentence);
                            SubLObject arg = (SubLObject)cycml_generator.NIL;
                            arg = cdolist_list_var.first();
                            while (cycml_generator.NIL != cdolist_list_var) {
                                cycml_serialize_object(arg);
                                cdolist_list_var = cdolist_list_var.rest();
                                arg = cdolist_list_var.first();
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$81, thread);
                        }
                        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                            cycml.cycml_indent();
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$80, thread);
                    }
                    xml_utilities.xml_end_tag_internal(name_var);
                }
            }
            else if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                cycml.cycml_indent();
                final SubLObject name_var = (SubLObject)cycml_generator.$str142$CycLAtomicSentence;
                xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                final SubLObject _prev_bind_0_$82 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                    final SubLObject _prev_bind_0_$83 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                            cycml.cycml_indent();
                            final SubLObject name_var_$84 = (SubLObject)cycml_generator.$str143$Predicate;
                            xml_utilities.xml_start_tag_internal(name_var_$84, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$84 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$85 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    cycml_serialize_object(cycl_utilities.cycl_formula_arg0(el_or_hl_atomic_sentence));
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$85, thread);
                                }
                                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                    cycml.cycml_indent();
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$84, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$84);
                        }
                        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                            cycml.cycml_indent();
                            final SubLObject name_var_$85 = (SubLObject)cycml_generator.$str105$argument_list;
                            xml_utilities.xml_start_tag_internal(name_var_$85, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                            final SubLObject _prev_bind_0_$86 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                                final SubLObject _prev_bind_0_$87 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                    SubLObject cdolist_list_var2 = cycl_utilities.cycl_formula_args(el_or_hl_atomic_sentence);
                                    SubLObject v_term = (SubLObject)cycml_generator.NIL;
                                    v_term = cdolist_list_var2.first();
                                    while (cycml_generator.NIL != cdolist_list_var2) {
                                        cycml_serialize_object(v_term);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        v_term = cdolist_list_var2.first();
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$87, thread);
                                }
                                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                    cycml.cycml_indent();
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$86, thread);
                            }
                            xml_utilities.xml_end_tag_internal(name_var_$85);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$83, thread);
                    }
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$82, thread);
                }
                xml_utilities.xml_end_tag_internal(name_var);
            }
        }
        finally {
            cycml_generator.$within_cycl_atomic_sentenceP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 39623L)
    public static SubLObject cycml_serialize_purpose(final SubLObject purpose) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str144$purpose;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$90 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    cycml_serialize_cyclconstant(purpose);
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$90, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 39948L)
    public static SubLObject cycml_serialize_universal_date(final SubLObject universal_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
        final SubLObject month = thread.secondMultipleValue();
        final SubLObject year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject formatted_date = PrintLow.format((SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.$str145$_A__A__A, new SubLObject[] { year, month, day });
        cycml_serialize_date(formatted_date, (SubLObject)cycml_generator.UNPROVIDED);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 40343L)
    public static SubLObject cycml_serialize_universal_second(final SubLObject universal_second) {
        assert cycml_generator.NIL != numeric_date_utilities.universal_second_p(universal_second) : universal_second;
        final SubLObject formatted_second = PrintLow.format((SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.$str146$_6__0D, universal_second);
        cycml_serialize_time(formatted_second, (SubLObject)cycml_generator.UNPROVIDED);
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 40768L)
    public static SubLObject cycml_serialize_support(final SubLObject support) {
        if (cycml_generator.NIL != assertion_handles.assertion_p(support)) {
            cycml_serialize_cyclsentence(uncanonicalizer.assertion_el_formula(support));
        }
        else {
            cycml_serialize_hl_support(support);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-generator.lisp", position = 41063L)
    public static SubLObject cycml_serialize_hl_support(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
            cycml.cycml_indent();
            final SubLObject name_var = (SubLObject)cycml_generator.$str147$hl_support;
            xml_utilities.xml_start_tag_internal(name_var, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
            final SubLObject _prev_bind_0 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                final SubLObject _prev_bind_0_$91 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                    if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                        cycml.cycml_indent();
                        final SubLObject name_var_$92 = (SubLObject)cycml_generator.$str148$module_token;
                        xml_utilities.xml_start_tag_internal(name_var_$92, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, (SubLObject)cycml_generator.NIL, xml_vars.cycml_namespace());
                        final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind(xml_vars.cycml_namespace(), thread);
                            final SubLObject _prev_bind_0_$93 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$cycml_indent_level$.bind(number_utilities.f_1X(xml_utilities.$cycml_indent_level$.getDynamicValue(thread)), thread);
                                cycml_serialize_sublsymbol(arguments.support_module(hl_support), (SubLObject)cycml_generator.UNPROVIDED);
                            }
                            finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$93, thread);
                            }
                            if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                                PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                                cycml.cycml_indent();
                            }
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$92, thread);
                        }
                        xml_utilities.xml_end_tag_internal(name_var_$92);
                    }
                    cycml_serialize_cyclsentence(arguments.support_sentence(hl_support));
                    cycml_serialize_microtheory(arguments.support_mt(hl_support));
                    cycml_serialize_truth(arguments.support_truth(hl_support), (SubLObject)cycml_generator.UNPROVIDED);
                    cycml.cycml_serialize_strength(arguments.support_strength(hl_support));
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_0_$91, thread);
                }
                if (cycml_generator.NIL != cycml.$cycml_indent_mode_on$.getDynamicValue(thread)) {
                    PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cycml_generator.$str3$__);
                    cycml.cycml_indent();
                }
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0, thread);
            }
            xml_utilities.xml_end_tag_internal(name_var);
        }
        return (SubLObject)cycml_generator.NIL;
    }
    
    public static SubLObject declare_cycml_generator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_knowledge_package_info", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_api_request", "CYCML-SERIALIZE-API-REQUEST", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_justification", "CYCML-SERIALIZE-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_truth", "CYCML-SERIALIZE-TRUTH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_api_request_requestor", "CYCML-SERIALIZE-API-REQUEST-REQUESTOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_api_request_priority", "CYCML-SERIALIZE-API-REQUEST-PRIORITY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_api_request_id", "CYCML-SERIALIZE-API-REQUEST-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_nonnegativeinteger", "CYCML-SERIALIZE-NONNEGATIVEINTEGER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_positiveinteger", "CYCML-SERIALIZE-POSITIVEINTEGER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_new_name", "CYCML-SERIALIZE-NEW-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_date", "CYCML-SERIALIZE-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_time", "CYCML-SERIALIZE-TIME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_cyc_image_id", "CYCML-SERIALIZE-CYC-IMAGE-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_knowledge_package_id", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_sublsymbol", "CYCML-SERIALIZE-SUBLSYMBOL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_sublstring", "CYCML-SERIALIZE-SUBLSTRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_sublrealnumber", "CYCML-SERIALIZE-SUBLREALNUMBER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_cyclvariable", "CYCML-SERIALIZE-CYCLVARIABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_uri", "CYCML-SERIALIZE-URI", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_namespace", "CYCML-SERIALIZE-NAMESPACE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_false", "CYCML-SERIALIZE-FALSE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_true", "CYCML-SERIALIZE-TRUE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_kp_info_print_function_trampoline", "CYCML-KP-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_kp_info_p", "CYCML-KP-INFO-P", 1, 0, false);
        new $cycml_kp_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_kp_info_knowledge_package_id", "CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_kp_info_knowledge_package_dependencies", "CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_kp_info_operations", "CYCML-KP-INFO-OPERATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "_csetf_cycml_kp_info_knowledge_package_id", "_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "_csetf_cycml_kp_info_knowledge_package_dependencies", "_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "_csetf_cycml_kp_info_operations", "_CSETF-CYCML-KP-INFO-OPERATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "make_cycml_kp_info", "MAKE-CYCML-KP-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "visit_defstruct_cycml_kp_info", "VISIT-DEFSTRUCT-CYCML-KP-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "visit_defstruct_object_cycml_kp_info_method", "VISIT-DEFSTRUCT-OBJECT-CYCML-KP-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "print_cycml_kp_info", "PRINT-CYCML-KP-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_add_create_constant_oper", "CYCML-ADD-CREATE-CONSTANT-OPER", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_add_find_or_create_constant_oper", "CYCML-ADD-FIND-OR-CREATE-CONSTANT-OPER", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_add_rename_constant_oper", "CYCML-ADD-RENAME-CONSTANT-OPER", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_add_merge_fort_oper", "CYCML-ADD-MERGE-FORT-OPER", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_add_kill_fort_oper", "CYCML-ADD-KILL-FORT-OPER", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_add_assert_oper", "CYCML-ADD-ASSERT-OPER", 2, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_add_reassert_oper", "CYCML-ADD-REASSERT-OPER", 2, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_add_unassert_oper", "CYCML-ADD-UNASSERT-OPER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_add_blast_assertion_oper", "CYCML-ADD-BLAST-ASSERTION-OPER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_add_create_skolem_oper", "CYCML-ADD-CREATE-SKOLEM-OPER", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_knowledge_package", "CYCML-SERIALIZE-KNOWLEDGE-PACKAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_operation", "CYCML-SERIALIZE-OPERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_create_constant_oper", "CYCML-SERIALIZE-CREATE-CONSTANT-OPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_find_or_create_constant_oper", "CYCML-SERIALIZE-FIND-OR-CREATE-CONSTANT-OPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_rename_constant_oper", "CYCML-SERIALIZE-RENAME-CONSTANT-OPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_merge_forts_oper", "CYCML-SERIALIZE-MERGE-FORTS-OPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_kill_fort_oper", "CYCML-SERIALIZE-KILL-FORT-OPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_assert_oper", "CYCML-SERIALIZE-ASSERT-OPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_reassert_oper", "CYCML-SERIALIZE-REASSERT-OPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_unassert_oper", "CYCML-SERIALIZE-UNASSERT-OPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_blast_assertion_oper", "CYCML-SERIALIZE-BLAST-ASSERTION-OPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_create_skolem_oper", "CYCML-SERIALIZE-CREATE-SKOLEM-OPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_bookkeeping", "CYCML-SERIALIZE-BOOKKEEPING", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_microtheory", "CYCML-SERIALIZE-MICROTHEORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_fort", "CYCML-SERIALIZE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_cyclconstant", "CYCML-SERIALIZE-CYCLCONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_cyclreifiednonatomicterm", "CYCML-SERIALIZE-CYCLREIFIEDNONATOMICTERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_cyclreifiablenonatomicterm", "CYCML-SERIALIZE-CYCLREIFIABLENONATOMICTERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_elnonatomicterm", "CYCML-SERIALIZE-ELNONATOMICTERM", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycml_generator", "within_cycl_atomic_sentence", "WITHIN-CYCL-ATOMIC-SENTENCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_object", "CYCML-SERIALIZE-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_object_to_string", "CYCML-SERIALIZE-OBJECT-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_subllist", "CYCML-SERIALIZE-SUBLLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_cyclsentence", "CYCML-SERIALIZE-CYCLSENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_cyclatomicsentence", "CYCML-SERIALIZE-CYCLATOMICSENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_purpose", "CYCML-SERIALIZE-PURPOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_universal_date", "CYCML-SERIALIZE-UNIVERSAL-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_universal_second", "CYCML-SERIALIZE-UNIVERSAL-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_support", "CYCML-SERIALIZE-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycml_generator", "cycml_serialize_hl_support", "CYCML-SERIALIZE-HL-SUPPORT", 1, 0, false);
        return (SubLObject)cycml_generator.NIL;
    }
    
    public static SubLObject init_cycml_generator_file() {
        cycml_generator.$dtp_cycml_kp_info$ = SubLFiles.defconstant("*DTP-CYCML-KP-INFO*", (SubLObject)cycml_generator.$sym27$CYCML_KP_INFO);
        cycml_generator.$within_cycl_atomic_sentenceP$ = SubLFiles.defparameter("*WITHIN-CYCL-ATOMIC-SENTENCE?*", (SubLObject)cycml_generator.NIL);
        return (SubLObject)cycml_generator.NIL;
    }
    
    public static SubLObject setup_cycml_generator_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cycml_generator.$dtp_cycml_kp_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)cycml_generator.$sym34$CYCML_KP_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycml_generator.$list35);
        Structures.def_csetf((SubLObject)cycml_generator.$sym36$CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID, (SubLObject)cycml_generator.$sym37$_CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID);
        Structures.def_csetf((SubLObject)cycml_generator.$sym38$CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES, (SubLObject)cycml_generator.$sym39$_CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES);
        Structures.def_csetf((SubLObject)cycml_generator.$sym40$CYCML_KP_INFO_OPERATIONS, (SubLObject)cycml_generator.$sym41$_CSETF_CYCML_KP_INFO_OPERATIONS);
        Equality.identity((SubLObject)cycml_generator.$sym27$CYCML_KP_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cycml_generator.$dtp_cycml_kp_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)cycml_generator.$sym50$VISIT_DEFSTRUCT_OBJECT_CYCML_KP_INFO_METHOD));
        access_macros.register_external_symbol((SubLObject)cycml_generator.$sym115$CYCML_SERIALIZE_OBJECT_TO_STRING);
        return (SubLObject)cycml_generator.NIL;
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
        me = (SubLFile)new cycml_generator();
        cycml_generator.$dtp_cycml_kp_info$ = null;
        cycml_generator.$within_cycl_atomic_sentenceP$ = null;
        $sym0$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym1$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym2$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str3$__ = SubLObjectFactory.makeString("~&");
        $str4$api_request_message = SubLObjectFactory.makeString("api-request-message");
        $str5$api_request = SubLObjectFactory.makeString("api-request");
        $str6$api_request_bindings = SubLObjectFactory.makeString("api-request-bindings");
        $str7$justification = SubLObjectFactory.makeString("justification");
        $str8$truth = SubLObjectFactory.makeString("truth");
        $str9$api_request_requestor = SubLObjectFactory.makeString("api-request-requestor");
        $str10$api_request_priority = SubLObjectFactory.makeString("api-request-priority");
        $str11$api_request_id = SubLObjectFactory.makeString("api-request-id");
        $str12$nonnegativeinteger = SubLObjectFactory.makeString("nonnegativeinteger");
        $str13$positiveinteger = SubLObjectFactory.makeString("positiveinteger");
        $str14$new_name = SubLObjectFactory.makeString("new-name");
        $str15$date = SubLObjectFactory.makeString("date");
        $str16$time = SubLObjectFactory.makeString("time");
        $str17$cyc_image_id = SubLObjectFactory.makeString("cyc-image-id");
        $str18$knowledge_package_id = SubLObjectFactory.makeString("knowledge-package-id");
        $str19$sublsymbol = SubLObjectFactory.makeString("sublsymbol");
        $str20$sublstring = SubLObjectFactory.makeString("sublstring");
        $str21$sublrealnumber = SubLObjectFactory.makeString("sublrealnumber");
        $str22$cyclvariable = SubLObjectFactory.makeString("cyclvariable");
        $str23$uri = SubLObjectFactory.makeString("uri");
        $str24$namespace = SubLObjectFactory.makeString("namespace");
        $str25$false = SubLObjectFactory.makeString("false");
        $str26$true = SubLObjectFactory.makeString("true");
        $sym27$CYCML_KP_INFO = SubLObjectFactory.makeSymbol("CYCML-KP-INFO");
        $sym28$CYCML_KP_INFO_P = SubLObjectFactory.makeSymbol("CYCML-KP-INFO-P");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KNOWLEDGE-PACKAGE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("KNOWLEDGE-PACKAGE-DEPENDENCIES"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATIONS"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KNOWLEDGE-PACKAGE-ID"), (SubLObject)SubLObjectFactory.makeKeyword("KNOWLEDGE-PACKAGE-DEPENDENCIES"), (SubLObject)SubLObjectFactory.makeKeyword("OPERATIONS"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES"), (SubLObject)SubLObjectFactory.makeSymbol("CYCML-KP-INFO-OPERATIONS"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CYCML-KP-INFO-OPERATIONS"));
        $sym33$PRINT_CYCML_KP_INFO = SubLObjectFactory.makeSymbol("PRINT-CYCML-KP-INFO");
        $sym34$CYCML_KP_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CYCML-KP-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCML-KP-INFO-P"));
        $sym36$CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID = SubLObjectFactory.makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID");
        $sym37$_CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_ID = SubLObjectFactory.makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-ID");
        $sym38$CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES = SubLObjectFactory.makeSymbol("CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES");
        $sym39$_CSETF_CYCML_KP_INFO_KNOWLEDGE_PACKAGE_DEPENDENCIES = SubLObjectFactory.makeSymbol("_CSETF-CYCML-KP-INFO-KNOWLEDGE-PACKAGE-DEPENDENCIES");
        $sym40$CYCML_KP_INFO_OPERATIONS = SubLObjectFactory.makeSymbol("CYCML-KP-INFO-OPERATIONS");
        $sym41$_CSETF_CYCML_KP_INFO_OPERATIONS = SubLObjectFactory.makeSymbol("_CSETF-CYCML-KP-INFO-OPERATIONS");
        $kw42$KNOWLEDGE_PACKAGE_ID = SubLObjectFactory.makeKeyword("KNOWLEDGE-PACKAGE-ID");
        $kw43$KNOWLEDGE_PACKAGE_DEPENDENCIES = SubLObjectFactory.makeKeyword("KNOWLEDGE-PACKAGE-DEPENDENCIES");
        $kw44$OPERATIONS = SubLObjectFactory.makeKeyword("OPERATIONS");
        $str45$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw46$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym47$MAKE_CYCML_KP_INFO = SubLObjectFactory.makeSymbol("MAKE-CYCML-KP-INFO");
        $kw48$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw49$END = SubLObjectFactory.makeKeyword("END");
        $sym50$VISIT_DEFSTRUCT_OBJECT_CYCML_KP_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYCML-KP-INFO-METHOD");
        $str51$__CYCML_KP_INFO_ = SubLObjectFactory.makeString("#<CYCML-KP-INFO:");
        $sym52$CYCL_CONSTANT_P = SubLObjectFactory.makeSymbol("CYCL-CONSTANT-P");
        $sym53$CYCL_FORT_P = SubLObjectFactory.makeSymbol("CYCL-FORT-P");
        $kw54$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $kw55$FIND_OR_CREATE = SubLObjectFactory.makeKeyword("FIND-OR-CREATE");
        $sym56$VALID_CONSTANT_NAME_P = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P");
        $kw57$RENAME = SubLObjectFactory.makeKeyword("RENAME");
        $kw58$MERGE = SubLObjectFactory.makeKeyword("MERGE");
        $kw59$KILL = SubLObjectFactory.makeKeyword("KILL");
        $sym60$CYCL_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $sym61$EL_STRENGTH_P = SubLObjectFactory.makeSymbol("EL-STRENGTH-P");
        $sym62$DIRECTION_P = SubLObjectFactory.makeSymbol("DIRECTION-P");
        $kw63$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $kw64$REASSERT = SubLObjectFactory.makeKeyword("REASSERT");
        $kw65$UNASSERT = SubLObjectFactory.makeKeyword("UNASSERT");
        $kw66$BLAST = SubLObjectFactory.makeKeyword("BLAST");
        $sym67$CONSTANT_EXTERNAL_ID_P = SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID-P");
        $sym68$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $kw69$CREATE_SKOLEM = SubLObjectFactory.makeKeyword("CREATE-SKOLEM");
        $str70$cycml = SubLObjectFactory.makeString("cycml");
        $str71$knowledge_package = SubLObjectFactory.makeString("knowledge-package");
        $str72$knowledge_package_dependencies = SubLObjectFactory.makeString("knowledge-package-dependencies");
        $str73$operations = SubLObjectFactory.makeString("operations");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-IMAGE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATION-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATION-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("PURPOSE"));
        $str75$create = SubLObjectFactory.makeString("create");
        $str76$find_or_create = SubLObjectFactory.makeString("find-or-create");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-IMAGE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATION-TIME"));
        $str78$rename = SubLObjectFactory.makeString("rename");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-1"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-2"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-IMAGE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATION-TIME"));
        $str80$merge = SubLObjectFactory.makeString("merge");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-IMAGE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATION-TIME"));
        $str82$kill = SubLObjectFactory.makeString("kill");
        $list83 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ASSERTION"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("STRENGTH"), SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeSymbol("CYCLIST"), SubLObjectFactory.makeSymbol("CYC-IMAGE-ID"), SubLObjectFactory.makeSymbol("OPERATION-TIME"), SubLObjectFactory.makeSymbol("OPERATION-SECOND"), SubLObjectFactory.makeSymbol("PURPOSE") });
        $str84$assert = SubLObjectFactory.makeString("assert");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("lang"), (SubLObject)SubLObjectFactory.makeString("en"));
        $str86$reassert = SubLObjectFactory.makeString("reassert");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-IMAGE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATION-TIME"));
        $str88$unassert = SubLObjectFactory.makeString("unassert");
        $str89$blast = SubLObjectFactory.makeString("blast");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("UNREIFIED-SK-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("CNFS"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-IMAGE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATION-TIME"));
        $str91$create_skolem = SubLObjectFactory.makeString("create-skolem");
        $str92$skolem_unreified_term = SubLObjectFactory.makeString("skolem-unreified-term");
        $str93$skolem_conjunctive_normal_form = SubLObjectFactory.makeString("skolem-conjunctive-normal-form");
        $str94$skolem_arg_types = SubLObjectFactory.makeString("skolem-arg-types");
        $sym95$UNIVERSAL_SECOND_P = SubLObjectFactory.makeSymbol("UNIVERSAL-SECOND-P");
        $str96$bookkeeping_info = SubLObjectFactory.makeString("bookkeeping-info");
        $str97$Cyclist = SubLObjectFactory.makeString("Cyclist");
        $str98$Microtheory = SubLObjectFactory.makeString("Microtheory");
        $str99$CycLConstant = SubLObjectFactory.makeString("CycLConstant");
        $str100$urn_uuid_ = SubLObjectFactory.makeString("urn:uuid:");
        $sym101$CYCL_NART_P = SubLObjectFactory.makeSymbol("CYCL-NART-P");
        $str102$_S_is_not_a_reified_nart = SubLObjectFactory.makeString("~S is not a reified nart");
        $str103$CycLReifiedNonAtomicTerm = SubLObjectFactory.makeString("CycLReifiedNonAtomicTerm");
        $str104$Function_Denotational = SubLObjectFactory.makeString("Function-Denotational");
        $str105$argument_list = SubLObjectFactory.makeString("argument-list");
        $str106$CycLReifiableNonAtomicTerm = SubLObjectFactory.makeString("CycLReifiableNonAtomicTerm");
        $sym107$CYCL_NAT_P = SubLObjectFactory.makeSymbol("CYCL-NAT-P");
        $str108$ELNonAtomicTerm = SubLObjectFactory.makeString("ELNonAtomicTerm");
        $sym109$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list110 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-CYCL-ATOMIC-SENTENCE?*"), (SubLObject)cycml_generator.T));
        $const111$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $str112$ = SubLObjectFactory.makeString("");
        $const113$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $str114$__is_unknown_type_for_CycML_seria = SubLObjectFactory.makeString("~ is unknown type for CycML serialization.");
        $sym115$CYCML_SERIALIZE_OBJECT_TO_STRING = SubLObjectFactory.makeSymbol("CYCML-SERIALIZE-OBJECT-TO-STRING");
        $str116$SubLList = SubLObjectFactory.makeString("SubLList");
        $str117$dotted_item = SubLObjectFactory.makeString("dotted-item");
        $const118$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $str119$not = SubLObjectFactory.makeString("not");
        $const120$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $str121$and = SubLObjectFactory.makeString("and");
        $const122$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $str123$or = SubLObjectFactory.makeString("or");
        $const124$xor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("xor"));
        $str125$xor = SubLObjectFactory.makeString("xor");
        $const126$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $str127$implies = SubLObjectFactory.makeString("implies");
        $const128$equiv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equiv"));
        $str129$equiv = SubLObjectFactory.makeString("equiv");
        $const130$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $str131$forAll = SubLObjectFactory.makeString("forAll");
        $const132$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $str133$thereExists = SubLObjectFactory.makeString("thereExists");
        $const134$thereExistExactly = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistExactly"));
        $str135$thereExistExactly = SubLObjectFactory.makeString("thereExistExactly");
        $const136$thereExistAtMost = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtMost"));
        $str137$thereExistAtMost = SubLObjectFactory.makeString("thereExistAtMost");
        $const138$thereExistAtLeast = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast"));
        $str139$thereExistAtLeast = SubLObjectFactory.makeString("thereExistAtLeast");
        $sym140$CYCL_ATOMIC_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-ATOMIC-SENTENCE-P");
        $const141$OpenCycDefinitionalPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OpenCycDefinitionalPredicate"));
        $str142$CycLAtomicSentence = SubLObjectFactory.makeString("CycLAtomicSentence");
        $str143$Predicate = SubLObjectFactory.makeString("Predicate");
        $str144$purpose = SubLObjectFactory.makeString("purpose");
        $str145$_A__A__A = SubLObjectFactory.makeString("~A-~A-~A");
        $str146$_6__0D = SubLObjectFactory.makeString("~6,'0D");
        $str147$hl_support = SubLObjectFactory.makeString("hl-support");
        $str148$module_token = SubLObjectFactory.makeString("module-token");
    }
    
    public static final class $cycml_kp_info_native extends SubLStructNative
    {
        public SubLObject $knowledge_package_id;
        public SubLObject $knowledge_package_dependencies;
        public SubLObject $operations;
        private static final SubLStructDeclNative structDecl;
        
        public $cycml_kp_info_native() {
            this.$knowledge_package_id = (SubLObject)CommonSymbols.NIL;
            this.$knowledge_package_dependencies = (SubLObject)CommonSymbols.NIL;
            this.$operations = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cycml_kp_info_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$cycml_kp_info_native.class, cycml_generator.$sym27$CYCML_KP_INFO, cycml_generator.$sym28$CYCML_KP_INFO_P, cycml_generator.$list29, cycml_generator.$list30, new String[] { "$knowledge_package_id", "$knowledge_package_dependencies", "$operations" }, cycml_generator.$list31, cycml_generator.$list32, cycml_generator.$sym33$PRINT_CYCML_KP_INFO);
        }
    }
    
    public static final class $cycml_kp_info_p$UnaryFunction extends UnaryFunction
    {
        public $cycml_kp_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCML-KP-INFO-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cycml_generator.cycml_kp_info_p(arg1);
        }
    }
}

/*

	Total time: 1044 ms
	 synthetic 
*/