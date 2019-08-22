package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 public final class new_cycl_query_specification extends SubLTranslatedFile {
    public static final SubLFile me = new new_cycl_query_specification();

    public static final String myName = "com.cyc.cycjava.cycl.new_cycl_query_specification";

    public static final String myFingerPrint = "24f81262bd29feb6a1bfe71fd8113ca78a249ac22b114a9f268e470ee651e1b8";

    // defconstant
    public static final SubLSymbol $dtp_new_cycl_query_specification$ = makeSymbol("*DTP-NEW-CYCL-QUERY-SPECIFICATION*");



    // deflexical
    // The Mt where the SubL encoding for inference parameters are stored.
    private static final SubLSymbol $new_cycl_query_encoding_extent$ = makeSymbol("*NEW-CYCL-QUERY-ENCODING-EXTENT*");

    // Internal Constants
    public static final SubLSymbol NEW_CYCL_QUERY_SPECIFICATION = makeSymbol("NEW-CYCL-QUERY-SPECIFICATION");

    public static final SubLSymbol NEW_CYCL_QUERY_SPECIFICATION_P = makeSymbol("NEW-CYCL-QUERY-SPECIFICATION-P");

    public static final SubLList $list2 = list(makeSymbol("CYCL-ID"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("COMMENT"), makeSymbol("PROPERTIES"), makeSymbol("INDEXICALS"), makeSymbol("EDITED"));

    public static final SubLList $list3 = list(makeKeyword("CYCL-ID"), makeKeyword("FORMULA"), makeKeyword("MT"), makeKeyword("COMMENT"), makeKeyword("PROPERTIES"), makeKeyword("INDEXICALS"), makeKeyword("EDITED"));

    public static final SubLList $list4 = list(makeSymbol("NEW-CYCL-QUERY-SPEC-CYCL-ID"), makeSymbol("NEW-CYCL-QUERY-SPEC-FORMULA"), makeSymbol("NEW-CYCL-QUERY-SPEC-MT"), makeSymbol("NEW-CYCL-QUERY-SPEC-COMMENT"), makeSymbol("NEW-CYCL-QUERY-SPEC-PROPERTIES"), makeSymbol("NEW-CYCL-QUERY-SPEC-INDEXICALS"), makeSymbol("NEW-CYCL-QUERY-SPEC-EDITED"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-CYCL-ID"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-FORMULA"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-MT"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-COMMENT"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-PROPERTIES"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-INDEXICALS"), makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-EDITED"));

    public static final SubLSymbol NEW_CYCL_QUERY_SPECIFICATION_PRINT = makeSymbol("NEW-CYCL-QUERY-SPECIFICATION-PRINT");

    public static final SubLSymbol NEW_CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NEW-CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NEW-CYCL-QUERY-SPECIFICATION-P"));

    private static final SubLSymbol NEW_CYCL_QUERY_SPEC_CYCL_ID = makeSymbol("NEW-CYCL-QUERY-SPEC-CYCL-ID");

    private static final SubLSymbol _CSETF_NEW_CYCL_QUERY_SPEC_CYCL_ID = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-CYCL-ID");

    private static final SubLSymbol NEW_CYCL_QUERY_SPEC_FORMULA = makeSymbol("NEW-CYCL-QUERY-SPEC-FORMULA");

    private static final SubLSymbol _CSETF_NEW_CYCL_QUERY_SPEC_FORMULA = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-FORMULA");

    private static final SubLSymbol NEW_CYCL_QUERY_SPEC_MT = makeSymbol("NEW-CYCL-QUERY-SPEC-MT");

    private static final SubLSymbol _CSETF_NEW_CYCL_QUERY_SPEC_MT = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-MT");

    private static final SubLSymbol NEW_CYCL_QUERY_SPEC_COMMENT = makeSymbol("NEW-CYCL-QUERY-SPEC-COMMENT");

    private static final SubLSymbol _CSETF_NEW_CYCL_QUERY_SPEC_COMMENT = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-COMMENT");

    private static final SubLSymbol NEW_CYCL_QUERY_SPEC_PROPERTIES = makeSymbol("NEW-CYCL-QUERY-SPEC-PROPERTIES");

    private static final SubLSymbol _CSETF_NEW_CYCL_QUERY_SPEC_PROPERTIES = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-PROPERTIES");

    private static final SubLSymbol NEW_CYCL_QUERY_SPEC_INDEXICALS = makeSymbol("NEW-CYCL-QUERY-SPEC-INDEXICALS");

    private static final SubLSymbol _CSETF_NEW_CYCL_QUERY_SPEC_INDEXICALS = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-INDEXICALS");

    private static final SubLSymbol NEW_CYCL_QUERY_SPEC_EDITED = makeSymbol("NEW-CYCL-QUERY-SPEC-EDITED");

    private static final SubLSymbol _CSETF_NEW_CYCL_QUERY_SPEC_EDITED = makeSymbol("_CSETF-NEW-CYCL-QUERY-SPEC-EDITED");















    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_NEW_CYCL_QUERY_SPECIFICATION = makeSymbol("MAKE-NEW-CYCL-QUERY-SPECIFICATION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NEW_CYCL_QUERY_SPECIFICATION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NEW-CYCL-QUERY-SPECIFICATION-METHOD");

    private static final SubLString $str36$_NEW_CYCL_QUERY_SPECIFICATION__S_ = makeString("<NEW-CYCL-QUERY-SPECIFICATION ~S ~S in ~S ;; ~A~% ");

    private static final SubLString $str37$_Properties___S_ = makeString(" Properties: ~S ");

    private static final SubLString $str38$_Template_Slots___S_ = makeString(" Template Slots: ~S ");

    private static final SubLString $str39$__changed__ = makeString(" (changed) ");

    private static final SubLList $list40 = list(list(makeSymbol("LOCAL-NAME")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list42 = list(NIL, NIL, NIL, NIL, list(makeSymbol("CYCL-QUERY-NAMESPACE")));



    private static final SubLList $list44 = list(list(makeSymbol("*CYCML-INCLUDE-NAMESPACE?*"), makeSymbol("*CYCL-QUERY-INCLUDE-NAMESPACE?*")));



    private static final SubLString $$$cyclQuery = makeString("cyclQuery");

    private static final SubLString $$$queryID = makeString("queryID");

    private static final SubLString $$$queryFormula = makeString("queryFormula");

    private static final SubLString $str49$Can_t_serialize__S____Its_query_f = makeString("Can't serialize ~S.~% Its query formula is not a valid CycL sentence:~% ~S");

    private static final SubLString $$$queryMt = makeString("queryMt");

    private static final SubLString $$$queryComment = makeString("queryComment");

    private static final SubLString $$$queryInferenceProperties = makeString("queryInferenceProperties");

    private static final SubLString $$$queryIndexicals = makeString("queryIndexicals");

    private static final SubLString $$$queryIndexical = makeString("queryIndexical");

    private static final SubLString $$$queryInferenceProperty = makeString("queryInferenceProperty");

    private static final SubLString $$$propertySymbol = makeString("propertySymbol");

    private static final SubLString $$$propertyValue = makeString("propertyValue");









    private static final SubLObject $$TheNthFn = reader_make_constant_shell(makeString("TheNthFn"));



    private static final SubLSymbol NEW_CYCL_QUERY_INDEXICAL_P = makeSymbol("NEW-CYCL-QUERY-INDEXICAL-P");

    private static final SubLSymbol NCQ_INFERENCE_PARAMETER_P = makeSymbol("NCQ-INFERENCE-PARAMETER-P");



    private static final SubLList $list67 = cons(makeSymbol("TERM"), makeSymbol("REPLACEMENT"));

    private static final SubLString $str68$Insufficient_number_of_substituti = makeString("Insufficient number of substitutions -- indexicals ~A unaccounted for.");

    private static final SubLSymbol $new_cycl_query_parameter_set$ = makeSymbol("*NEW-CYCL-QUERY-PARAMETER-SET*");

    private static final SubLObject $$InferenceParameter = reader_make_constant_shell(makeString("InferenceParameter"));

    private static final SubLObject $$CycAPIMt = reader_make_constant_shell(makeString("CycAPIMt"));

    private static final SubLObject $$subLIdentifier = reader_make_constant_shell(makeString("subLIdentifier"));



    private static final SubLObject $$SubLQuoteFn = reader_make_constant_shell(makeString("SubLQuoteFn"));

    public static SubLObject new_cycl_query_specification_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        new_cycl_query_specification_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject new_cycl_query_specification_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$new_cycl_query_specification_native.class ? T : NIL;
    }

    public static SubLObject new_cycl_query_spec_cycl_id(final SubLObject v_object) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject new_cycl_query_spec_formula(final SubLObject v_object) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject new_cycl_query_spec_mt(final SubLObject v_object) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject new_cycl_query_spec_comment(final SubLObject v_object) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject new_cycl_query_spec_properties(final SubLObject v_object) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject new_cycl_query_spec_indexicals(final SubLObject v_object) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject new_cycl_query_spec_edited(final SubLObject v_object) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_new_cycl_query_spec_cycl_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_new_cycl_query_spec_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_new_cycl_query_spec_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_new_cycl_query_spec_comment(final SubLObject v_object, final SubLObject value) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_new_cycl_query_spec_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_new_cycl_query_spec_indexicals(final SubLObject v_object, final SubLObject value) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_new_cycl_query_spec_edited(final SubLObject v_object, final SubLObject value) {
        assert NIL != new_cycl_query_specification_p(v_object) : "new_cycl_query_specification.new_cycl_query_specification_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_new_cycl_query_specification(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $new_cycl_query_specification_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL_ID)) {
                _csetf_new_cycl_query_spec_cycl_id(v_new, current_value);
            } else
                if (pcase_var.eql($FORMULA)) {
                    _csetf_new_cycl_query_spec_formula(v_new, current_value);
                } else
                    if (pcase_var.eql($MT)) {
                        _csetf_new_cycl_query_spec_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($COMMENT)) {
                            _csetf_new_cycl_query_spec_comment(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROPERTIES)) {
                                _csetf_new_cycl_query_spec_properties(v_new, current_value);
                            } else
                                if (pcase_var.eql($INDEXICALS)) {
                                    _csetf_new_cycl_query_spec_indexicals(v_new, current_value);
                                } else
                                    if (pcase_var.eql($EDITED)) {
                                        _csetf_new_cycl_query_spec_edited(v_new, current_value);
                                    } else {
                                        Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_new_cycl_query_specification(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_NEW_CYCL_QUERY_SPECIFICATION, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL_ID, new_cycl_query_spec_cycl_id(obj));
        funcall(visitor_fn, obj, $SLOT, $FORMULA, new_cycl_query_spec_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, new_cycl_query_spec_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENT, new_cycl_query_spec_comment(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, new_cycl_query_spec_properties(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEXICALS, new_cycl_query_spec_indexicals(obj));
        funcall(visitor_fn, obj, $SLOT, $EDITED, new_cycl_query_spec_edited(obj));
        funcall(visitor_fn, obj, $END, MAKE_NEW_CYCL_QUERY_SPECIFICATION, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_new_cycl_query_specification_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_new_cycl_query_specification(obj, visitor_fn);
    }

    public static SubLObject new_cycl_query_specification_print(final SubLObject query_spec, final SubLObject stream, final SubLObject depth) {
        format(stream, $str36$_NEW_CYCL_QUERY_SPECIFICATION__S_, new SubLObject[]{ new_cycl_query_spec_cycl_id(query_spec), new_cycl_query_spec_formula(query_spec), new_cycl_query_spec_mt(query_spec), new_cycl_query_spec_comment(query_spec) });
        string_utilities.indent(stream, depth);
        format(stream, $str37$_Properties___S_, new_cycl_query_spec_properties(query_spec));
        if (NIL != new_cycl_query_spec_indexicals(query_spec)) {
            format(stream, $str38$_Template_Slots___S_, new_cycl_query_spec_indexicals(query_spec));
        }
        if (NIL != new_cycl_query_spec_edited(query_spec)) {
            write_string($str39$__changed__, stream, UNPROVIDED, UNPROVIDED);
        }
        write_char(CHAR_greater, stream);
        return query_spec;
    }

    public static SubLObject cycl_query_xml_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list40);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject local_name = NIL;
        destructuring_bind_must_consp(current, datum, $list40);
        local_name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(XML_TAG, bq_cons(local_name, $list42), listS(CLET, $list44, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list40);
        return NIL;
    }

    public static SubLObject xml_serialize_new_cycl_query_specification(final SubLObject cycl_query, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        SubLObject error_message = NIL;
        SubLObject xml_string = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream_$1 = NIL;
                    try {
                        stream_$1 = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$2 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream_$1, thread);
                            try {
                                final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$cyclQuery, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                                    final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$5 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                                        try {
                                            final SubLObject _prev_bind_0_$5 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$queryID, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                                                final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$7 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                                                    cycml.cycml_serialize_term(new_cycl_query_spec_cycl_id(cycl_query));
                                                } finally {
                                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$7, thread);
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$6, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$6, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$5, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$queryID);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        }
                                        try {
                                            final SubLObject _prev_bind_0_$8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$8 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$queryFormula, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                                                final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$9 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                                                    final SubLObject query_formula = new_cycl_query_spec_formula(cycl_query);
                                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cycl_grammar.cycl_sentence_p(query_formula))) {
                                                        Errors.error($str49$Can_t_serialize__S____Its_query_f, new_cycl_query_spec_cycl_id(cycl_query), query_formula);
                                                    }
                                                    cycml.cycml_serialize_sentence(query_formula);
                                                } finally {
                                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$9, thread);
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$8, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$queryFormula);
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                            }
                                        }
                                        try {
                                            final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$10 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal($$$queryMt, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                                                final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$11 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                try {
                                                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                                                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                                                    cycml.cycml_serialize_term(new_cycl_query_spec_mt(cycl_query));
                                                } finally {
                                                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$11, thread);
                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$10, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$11, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$queryMt);
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                            }
                                        }
                                        if (NIL != new_cycl_query_spec_comment(cycl_query)) {
                                            try {
                                                final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$12 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$queryComment, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                                                    final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$13 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                                                        cycml.cycml_serialize_term(new_cycl_query_spec_comment(cycl_query));
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$13, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$12, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$14, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values4 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$queryComment);
                                                    restoreValuesFromVector(_values4);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                                }
                                            }
                                        }
                                        if (NIL != new_cycl_query_spec_properties(cycl_query)) {
                                            try {
                                                final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$14 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$queryInferenceProperties, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                                                    final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$15 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                                                        SubLObject remainder;
                                                        SubLObject property;
                                                        SubLObject value;
                                                        for (remainder = NIL, remainder = new_cycl_query_spec_properties(cycl_query); NIL != remainder; remainder = cddr(remainder)) {
                                                            property = remainder.first();
                                                            value = cadr(remainder);
                                                            xml_serialize_inference_parameter(property, value);
                                                        }
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$15, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$18, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$14, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$17, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values5 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$queryInferenceProperties);
                                                    restoreValuesFromVector(_values5);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                                }
                                            }
                                        }
                                        if (NIL != new_cycl_query_spec_indexicals(cycl_query)) {
                                            try {
                                                final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$16 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal($$$queryIndexicals, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                                                    final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$17 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                                                        SubLObject cdolist_list_var = new_cycl_query_spec_indexicals(cycl_query);
                                                        SubLObject indexical = NIL;
                                                        indexical = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            try {
                                                                final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                try {
                                                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                    xml_utilities.xml_start_tag_internal($$$queryIndexical, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                                                                    final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$19 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                                                                    try {
                                                                        xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                                                                        xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                                                                        cycml.cycml_serialize_term(indexical);
                                                                    } finally {
                                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$19, thread);
                                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                                                                    }
                                                                } finally {
                                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                                                                }
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values6 = getValuesAsVector();
                                                                    xml_utilities.xml_terpri();
                                                                    xml_utilities.xml_end_tag_internal($$$queryIndexical);
                                                                    restoreValuesFromVector(_values6);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                                                }
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            indexical = cdolist_list_var.first();
                                                        } 
                                                    } finally {
                                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$17, thread);
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                } finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$16, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values7 = getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal($$$queryIndexicals);
                                                    restoreValuesFromVector(_values7);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$5, thread);
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values8 = getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal($$$cyclQuery);
                                    restoreValuesFromVector(_values8);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                }
                            }
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0_$2, thread);
                        }
                        xml_string = get_output_stream_string(stream_$1);
                    } finally {
                        final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values9 = getValuesAsVector();
                            close(stream_$1, UNPROVIDED);
                            restoreValuesFromVector(_values9);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            Errors.error(error_message);
        } else {
            princ(xml_string, stream);
        }
        return cycl_query;
    }

    public static SubLObject xml_serialize_inference_parameter(final SubLObject property, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$queryInferenceProperty, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                final SubLObject _prev_bind_1_$44 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                    xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                    try {
                        final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$45 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$propertySymbol, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                            final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$46 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                                xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                                write_string(symbol_name(property), xml_vars.$xml_stream$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            } finally {
                                xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$46, thread);
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$45, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$propertySymbol);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                        }
                    }
                    try {
                        final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$47 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$propertyValue, NIL, NIL, NIL, xml_vars.cycl_query_namespace());
                            final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$48 = xml_vars.$cycml_include_namespaceP$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind(xml_vars.cycl_query_namespace(), thread);
                                xml_vars.$cycml_include_namespaceP$.bind(xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread), thread);
                                cycml.cycml_serialize_term(value);
                            } finally {
                                xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$48, thread);
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$48, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$47, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$47, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal($$$propertyValue);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                        }
                    }
                } finally {
                    xml_vars.$cycml_include_namespaceP$.rebind(_prev_bind_1_$44, thread);
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$43, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$queryInferenceProperty);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return value;
    }

    public static SubLObject new_cycl_query_specification_cycl_id(final SubLObject cycl_query) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        return new_cycl_query_spec_cycl_id(cycl_query);
    }

    public static SubLObject new_cycl_query_specification_formula(final SubLObject cycl_query) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        return new_cycl_query_spec_formula(cycl_query);
    }

    public static SubLObject new_cycl_query_specification_mt(final SubLObject cycl_query) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        return new_cycl_query_spec_mt(cycl_query);
    }

    public static SubLObject new_cycl_query_specification_comment(final SubLObject cycl_query) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        return new_cycl_query_spec_comment(cycl_query);
    }

    public static SubLObject new_cycl_query_specification_properties(final SubLObject cycl_query) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        return new_cycl_query_spec_properties(cycl_query);
    }

    public static SubLObject new_cycl_query_specification_indexicals(final SubLObject cycl_query) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        return new_cycl_query_spec_indexicals(cycl_query);
    }

    public static SubLObject new_cycl_query_specification_edited(final SubLObject cycl_query) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        return new_cycl_query_spec_edited(cycl_query);
    }

    public static SubLObject set_new_cycl_query_specification_cycl_id(final SubLObject cycl_query, final SubLObject id) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        _csetf_new_cycl_query_spec_cycl_id(cycl_query, id);
        return cycl_query;
    }

    public static SubLObject set_new_cycl_query_specification_formula(final SubLObject cycl_query, final SubLObject formula) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        _csetf_new_cycl_query_spec_formula(cycl_query, formula);
        return cycl_query;
    }

    public static SubLObject set_new_cycl_query_specification_mt(final SubLObject cycl_query, final SubLObject mt) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        _csetf_new_cycl_query_spec_mt(cycl_query, mt);
        return cycl_query;
    }

    public static SubLObject set_new_cycl_query_specification_comment(final SubLObject cycl_query, final SubLObject comment) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        _csetf_new_cycl_query_spec_comment(cycl_query, comment);
        return cycl_query;
    }

    public static SubLObject set_new_cycl_query_specification_properties(final SubLObject cycl_query, final SubLObject props) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        _csetf_new_cycl_query_spec_properties(cycl_query, props);
        return cycl_query;
    }

    public static SubLObject set_new_cycl_query_specification_properties_eliminating_defaults(final SubLObject cycl_query, final SubLObject props) {
        return set_new_cycl_query_specification_properties(cycl_query, inference_parameters.remove_inference_engine_query_property_defaults(props));
    }

    public static SubLObject set_new_cycl_query_specification_indexicals(final SubLObject cycl_query, final SubLObject indexicals) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        _csetf_new_cycl_query_spec_indexicals(cycl_query, indexicals);
        return cycl_query;
    }

    public static SubLObject set_cycl_query_specification_edited(final SubLObject cycl_query) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        _csetf_new_cycl_query_spec_edited(cycl_query, cycl_query);
        return cycl_query;
    }

    public static SubLObject templated_new_cycl_query_specification_p(final SubLObject cycl_query) {
        return makeBoolean(NIL != new_cycl_query_specification_indexicals(cycl_query));
    }

    public static SubLObject new_cycl_query_specification_edited_p(final SubLObject cycl_query) {
        return new_cycl_query_specification_edited(cycl_query);
    }

    public static SubLObject mark_new_cycl_query_specification_modified(final SubLObject cycl_query) {
        _csetf_new_cycl_query_spec_edited(cycl_query, $CHANGED);
        return cycl_query;
    }

    public static SubLObject update_query_spec_params_using_defaults(final SubLObject query_spec, final SubLObject defaults) {
        SubLObject existing_params = new_cycl_query_specification_properties(query_spec);
        SubLObject new_params = copy_list(existing_params);
        final SubLObject existing_mode = getf(existing_params, $INFERENCE_MODE, NIL);
        if (NIL != existing_mode) {
            existing_params = list_utilities.augment_plist_with_defaults(copy_list(existing_params), inference_parameters.query_properties_for_inference_mode(existing_mode));
        }
        SubLObject dirtyP = NIL;
        SubLObject remainder;
        SubLObject param;
        SubLObject value;
        for (remainder = NIL, remainder = defaults; NIL != remainder; remainder = cddr(remainder)) {
            param = remainder.first();
            value = cadr(remainder);
            if (NIL == list_utilities.plist_has_keyP(existing_params, param)) {
                dirtyP = T;
                new_params = putf(new_params, param, value);
            }
        }
        if (NIL != dirtyP) {
            set_new_cycl_query_specification_properties(query_spec, new_params);
        }
        return NIL;
    }

    public static SubLObject reset_new_cycl_query_specification_formula(final SubLObject cycl_query, final SubLObject formula) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        _csetf_new_cycl_query_spec_formula(cycl_query, formula);
        mark_new_cycl_query_specification_modified(cycl_query);
        return new_cycl_query_spec_formula(cycl_query);
    }

    public static SubLObject reset_new_cycl_query_specification_mt(final SubLObject cycl_query, final SubLObject mt) {
        assert NIL != new_cycl_query_specification_p(cycl_query) : "new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(cycl_query) " + cycl_query;
        assert NIL != fort_types_interface.microtheory_p(mt) : "fort_types_interface.microtheory_p(mt) " + "CommonSymbols.NIL != fort_types_interface.microtheory_p(mt) " + mt;
        _csetf_new_cycl_query_spec_mt(cycl_query, mt);
        mark_new_cycl_query_specification_modified(cycl_query);
        return new_cycl_query_spec_mt(cycl_query);
    }

    public static SubLObject new_cycl_query_indexical_p(final SubLObject v_object) {
        return makeBoolean(((NIL != narts_high.naut_p(v_object)) && (NIL != new_cycl_query_indexical_formula_p(v_object))) || ((NIL != nart_handles.nart_p(v_object)) && (NIL != new_cycl_query_indexical_formula_p(narts_high.nart_el_formula(v_object)))));
    }

    public static SubLObject new_cycl_query_indexical_formula_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_ternary_formula_p(v_object)) && cycl_utilities.formula_arg0(v_object).eql($$TheNthFn));
    }

    public static SubLObject create_new_cycl_query_specification() {
        final SubLObject cycl_query = make_new_cycl_query_specification(UNPROVIDED);
        return cycl_query;
    }

    public static SubLObject load_new_cycl_query_specification_from_kb(SubLObject identifier, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != cycl_grammar.cycl_denotational_term_p(identifier) : "cycl_grammar.cycl_denotational_term_p(identifier) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(identifier) " + identifier;
        final SubLObject cycl_query = create_new_cycl_query_specification();
        if (NIL != function_terms.nat_formula_p(identifier)) {
            final SubLObject nart = narts_high.find_nart(identifier);
            if (NIL != nart) {
                identifier = nart;
            }
        }
        _csetf_new_cycl_query_spec_cycl_id(cycl_query, identifier);
        new_cycl_query_specification_load_sentence(identifier, cycl_query);
        new_cycl_query_specification_load_mt(identifier, cycl_query);
        new_cycl_query_specification_load_inference_parameters(identifier, cycl_query);
        analyse_new_cycl_query_specification_for_indexicals(cycl_query);
        return cycl_query;
    }

    public static SubLObject analyse_new_cycl_query_specification_for_indexicals(final SubLObject cycl_query) {
        final SubLObject formula = new_cycl_query_spec_formula(cycl_query);
        final SubLObject indexical_list = list_utilities.tree_gather(formula, symbol_function(NEW_CYCL_QUERY_INDEXICAL_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == list_utilities.empty_list_p(indexical_list)) {
            final SubLObject indexical_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = indexical_list;
            SubLObject indexical = NIL;
            indexical = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(indexical, indexical_set);
                cdolist_list_var = cdolist_list_var.rest();
                indexical = cdolist_list_var.first();
            } 
            _csetf_new_cycl_query_spec_indexicals(cycl_query, indexical_set);
        }
        return cycl_query;
    }

    public static SubLObject new_cycl_query_specification_load_sentence(final SubLObject identifier, final SubLObject cycl_query) {
        final SubLObject sentence = kb_query.kbq_sentence(identifier);
        _csetf_new_cycl_query_spec_formula(cycl_query, czer_main.unquote_quoted_term(sentence, UNPROVIDED));
        return cycl_query;
    }

    public static SubLObject new_cycl_query_specification_load_mt(final SubLObject identifier, final SubLObject cycl_query) {
        final SubLObject mt = kb_query.kbq_mt(identifier);
        _csetf_new_cycl_query_spec_mt(cycl_query, narts_high.nart_substitute(mt));
        return cycl_query;
    }

    public static SubLObject new_cycl_query_specification_load_inference_parameters(final SubLObject identifier, final SubLObject cycl_query) {
        final SubLObject v_properties = list_utilities.filter_plist(kb_query.kbq_query_properties(identifier), NCQ_INFERENCE_PARAMETER_P);
        _csetf_new_cycl_query_spec_properties(cycl_query, v_properties);
        return cycl_query;
    }

    public static SubLObject copy_new_cycl_query_specification(final SubLObject query_spec) {
        assert NIL != new_cycl_query_specification_p(query_spec) : "new_cycl_query_specification.new_cycl_query_specification_p(query_spec) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(query_spec) " + query_spec;
        final SubLObject new_spec = create_new_cycl_query_specification();
        _csetf_new_cycl_query_spec_cycl_id(new_spec, new_cycl_query_spec_cycl_id(query_spec));
        _csetf_new_cycl_query_spec_formula(new_spec, copy_formula(new_cycl_query_spec_formula(query_spec)));
        _csetf_new_cycl_query_spec_mt(new_spec, new_cycl_query_spec_mt(query_spec));
        _csetf_new_cycl_query_spec_properties(new_spec, copy_list(new_cycl_query_spec_properties(query_spec)));
        if (NIL != templated_new_cycl_query_specification_p(query_spec)) {
            _csetf_new_cycl_query_spec_indexicals(new_spec, set.copy_set(new_cycl_query_spec_indexicals(query_spec)));
        }
        mark_new_cycl_query_specification_modified(new_spec);
        return new_spec;
    }

    public static SubLObject instantiate_new_cycl_query_specification_from_template(final SubLObject query_spec, final SubLObject substitutions, SubLObject enforce_full_instantiationP) {
        if (enforce_full_instantiationP == UNPROVIDED) {
            enforce_full_instantiationP = T;
        }
        assert NIL != new_cycl_query_specification_p(query_spec) : "new_cycl_query_specification.new_cycl_query_specification_p(query_spec) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(query_spec) " + query_spec;
        assert NIL != listp(substitutions) : "Types.listp(substitutions) " + "CommonSymbols.NIL != Types.listp(substitutions) " + substitutions;
        final SubLObject instantiated_query = copy_new_cycl_query_specification(query_spec);
        final SubLObject indexical_set = new_cycl_query_specification_indexicals(instantiated_query);
        final SubLObject formula = new_cycl_query_specification_formula(instantiated_query);
        SubLObject cdolist_list_var = substitutions;
        SubLObject substitution = NIL;
        substitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = substitution;
            SubLObject v_term = NIL;
            SubLObject replacement = NIL;
            destructuring_bind_must_consp(current, datum, $list67);
            v_term = current.first();
            current = replacement = current.rest();
            nsubst(replacement, v_term, formula, symbol_function(EQUAL), UNPROVIDED);
            set.set_remove(v_term, indexical_set);
            cdolist_list_var = cdolist_list_var.rest();
            substitution = cdolist_list_var.first();
        } 
        if (NIL != set.set_emptyP(indexical_set)) {
            _csetf_new_cycl_query_spec_indexicals(instantiated_query, NIL);
        } else
            if (NIL != enforce_full_instantiationP) {
                Errors.error($str68$Insufficient_number_of_substituti, set.set_element_list(indexical_set));
            }

        return instantiated_query;
    }

    public static SubLObject new_cycl_query_specification_ask(SubLObject query_spec, SubLObject mt, SubLObject substitutions, SubLObject more_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (substitutions == UNPROVIDED) {
            substitutions = NIL;
        }
        if (more_properties == UNPROVIDED) {
            more_properties = NIL;
        }
        assert NIL != new_cycl_query_specification_p(query_spec) : "new_cycl_query_specification.new_cycl_query_specification_p(query_spec) " + "CommonSymbols.NIL != new_cycl_query_specification.new_cycl_query_specification_p(query_spec) " + query_spec;
        if (NIL != substitutions) {
            query_spec = instantiate_new_cycl_query_specification_from_template(query_spec, substitutions, UNPROVIDED);
        }
        if (NIL == fort_types_interface.microtheory_p(mt)) {
            mt = new_cycl_query_spec_mt(query_spec);
        }
        SubLObject query_properties = new_cycl_query_spec_properties(query_spec);
        query_properties = list_utilities.merge_plist(query_properties, more_properties);
        return inference_kernel.new_cyc_query(new_cycl_query_spec_formula(query_spec), mt, query_properties);
    }

    public static SubLObject get_new_cycl_query_parameter_set() {
        ensure_new_cycl_query_parameter_set_initialized();
        return new_cycl_query_parameter_set();
    }

    public static SubLObject ensure_new_cycl_query_parameter_set_initialized() {
        if (NIL == is_new_cycl_query_parameter_set_initializedP()) {
            initialize_new_cycl_query_parameter_set();
        }
        return NIL;
    }

    public static SubLObject is_new_cycl_query_parameter_set_initializedP() {
        return makeBoolean(NIL != $new_cycl_query_parameter_set$.getGlobalValue());
    }

    public static SubLObject new_cycl_query_parameter_set() {
        return $new_cycl_query_parameter_set$.getGlobalValue();
    }

    public static SubLObject ncq_inference_parameter_p(final SubLObject v_object) {
        return set.set_memberP(v_object, get_new_cycl_query_parameter_set());
    }

    public static SubLObject initialize_new_cycl_query_parameter_set() {
        $new_cycl_query_parameter_set$.setGlobalValue(compute_new_cycl_query_parameter_set());
        return new_cycl_query_parameter_set();
    }

    public static SubLObject compute_new_cycl_query_parameter_set() {
        final SubLObject parameters = new_cycl_query_get_all_parameters();
        final SubLObject v_set = set.new_set(symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = parameters;
        SubLObject parameter = NIL;
        parameter = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject internal_encoding = new_cycl_query_get_internal_encoding_for_parameter(parameter);
            set.set_add(internal_encoding, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            parameter = cdolist_list_var.first();
        } 
        return v_set;
    }

    public static SubLObject new_cycl_query_get_all_parameters() {
        return isa.all_fort_instances($$InferenceParameter, $$CycAPIMt, UNPROVIDED);
    }

    public static SubLObject new_cycl_query_get_internal_encoding_for_parameter(final SubLObject parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject encoding = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($new_cycl_query_encoding_extent$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject encoding_function = kb_mapping_utilities.fpred_value(parameter, $$subLIdentifier, ONE_INTEGER, TWO_INTEGER, $TRUE);
            if (NIL != el_formula_with_operator_p(encoding_function, $$SubLQuoteFn)) {
                encoding = cycl_utilities.formula_arg1(encoding_function, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return encoding;
    }

    public static SubLObject declare_new_cycl_query_specification_file() {
        declareFunction(me, "new_cycl_query_specification_print_function_trampoline", "NEW-CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "new_cycl_query_specification_p", "NEW-CYCL-QUERY-SPECIFICATION-P", 1, 0, false);
        new new_cycl_query_specification.$new_cycl_query_specification_p$UnaryFunction();
        declareFunction(me, "new_cycl_query_spec_cycl_id", "NEW-CYCL-QUERY-SPEC-CYCL-ID", 1, 0, false);
        declareFunction(me, "new_cycl_query_spec_formula", "NEW-CYCL-QUERY-SPEC-FORMULA", 1, 0, false);
        declareFunction(me, "new_cycl_query_spec_mt", "NEW-CYCL-QUERY-SPEC-MT", 1, 0, false);
        declareFunction(me, "new_cycl_query_spec_comment", "NEW-CYCL-QUERY-SPEC-COMMENT", 1, 0, false);
        declareFunction(me, "new_cycl_query_spec_properties", "NEW-CYCL-QUERY-SPEC-PROPERTIES", 1, 0, false);
        declareFunction(me, "new_cycl_query_spec_indexicals", "NEW-CYCL-QUERY-SPEC-INDEXICALS", 1, 0, false);
        declareFunction(me, "new_cycl_query_spec_edited", "NEW-CYCL-QUERY-SPEC-EDITED", 1, 0, false);
        declareFunction(me, "_csetf_new_cycl_query_spec_cycl_id", "_CSETF-NEW-CYCL-QUERY-SPEC-CYCL-ID", 2, 0, false);
        declareFunction(me, "_csetf_new_cycl_query_spec_formula", "_CSETF-NEW-CYCL-QUERY-SPEC-FORMULA", 2, 0, false);
        declareFunction(me, "_csetf_new_cycl_query_spec_mt", "_CSETF-NEW-CYCL-QUERY-SPEC-MT", 2, 0, false);
        declareFunction(me, "_csetf_new_cycl_query_spec_comment", "_CSETF-NEW-CYCL-QUERY-SPEC-COMMENT", 2, 0, false);
        declareFunction(me, "_csetf_new_cycl_query_spec_properties", "_CSETF-NEW-CYCL-QUERY-SPEC-PROPERTIES", 2, 0, false);
        declareFunction(me, "_csetf_new_cycl_query_spec_indexicals", "_CSETF-NEW-CYCL-QUERY-SPEC-INDEXICALS", 2, 0, false);
        declareFunction(me, "_csetf_new_cycl_query_spec_edited", "_CSETF-NEW-CYCL-QUERY-SPEC-EDITED", 2, 0, false);
        declareFunction(me, "make_new_cycl_query_specification", "MAKE-NEW-CYCL-QUERY-SPECIFICATION", 0, 1, false);
        declareFunction(me, "visit_defstruct_new_cycl_query_specification", "VISIT-DEFSTRUCT-NEW-CYCL-QUERY-SPECIFICATION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_new_cycl_query_specification_method", "VISIT-DEFSTRUCT-OBJECT-NEW-CYCL-QUERY-SPECIFICATION-METHOD", 2, 0, false);
        declareFunction(me, "new_cycl_query_specification_print", "NEW-CYCL-QUERY-SPECIFICATION-PRINT", 3, 0, false);
        declareMacro(me, "cycl_query_xml_tag", "CYCL-QUERY-XML-TAG");
        declareFunction(me, "xml_serialize_new_cycl_query_specification", "XML-SERIALIZE-NEW-CYCL-QUERY-SPECIFICATION", 1, 1, false);
        declareFunction(me, "xml_serialize_inference_parameter", "XML-SERIALIZE-INFERENCE-PARAMETER", 2, 0, false);
        declareFunction(me, "new_cycl_query_specification_cycl_id", "NEW-CYCL-QUERY-SPECIFICATION-CYCL-ID", 1, 0, false);
        declareFunction(me, "new_cycl_query_specification_formula", "NEW-CYCL-QUERY-SPECIFICATION-FORMULA", 1, 0, false);
        declareFunction(me, "new_cycl_query_specification_mt", "NEW-CYCL-QUERY-SPECIFICATION-MT", 1, 0, false);
        declareFunction(me, "new_cycl_query_specification_comment", "NEW-CYCL-QUERY-SPECIFICATION-COMMENT", 1, 0, false);
        declareFunction(me, "new_cycl_query_specification_properties", "NEW-CYCL-QUERY-SPECIFICATION-PROPERTIES", 1, 0, false);
        declareFunction(me, "new_cycl_query_specification_indexicals", "NEW-CYCL-QUERY-SPECIFICATION-INDEXICALS", 1, 0, false);
        declareFunction(me, "new_cycl_query_specification_edited", "NEW-CYCL-QUERY-SPECIFICATION-EDITED", 1, 0, false);
        declareFunction(me, "set_new_cycl_query_specification_cycl_id", "SET-NEW-CYCL-QUERY-SPECIFICATION-CYCL-ID", 2, 0, false);
        declareFunction(me, "set_new_cycl_query_specification_formula", "SET-NEW-CYCL-QUERY-SPECIFICATION-FORMULA", 2, 0, false);
        declareFunction(me, "set_new_cycl_query_specification_mt", "SET-NEW-CYCL-QUERY-SPECIFICATION-MT", 2, 0, false);
        declareFunction(me, "set_new_cycl_query_specification_comment", "SET-NEW-CYCL-QUERY-SPECIFICATION-COMMENT", 2, 0, false);
        declareFunction(me, "set_new_cycl_query_specification_properties", "SET-NEW-CYCL-QUERY-SPECIFICATION-PROPERTIES", 2, 0, false);
        declareFunction(me, "set_new_cycl_query_specification_properties_eliminating_defaults", "SET-NEW-CYCL-QUERY-SPECIFICATION-PROPERTIES-ELIMINATING-DEFAULTS", 2, 0, false);
        declareFunction(me, "set_new_cycl_query_specification_indexicals", "SET-NEW-CYCL-QUERY-SPECIFICATION-INDEXICALS", 2, 0, false);
        declareFunction(me, "set_cycl_query_specification_edited", "SET-CYCL-QUERY-SPECIFICATION-EDITED", 1, 0, false);
        declareFunction(me, "templated_new_cycl_query_specification_p", "TEMPLATED-NEW-CYCL-QUERY-SPECIFICATION-P", 1, 0, false);
        declareFunction(me, "new_cycl_query_specification_edited_p", "NEW-CYCL-QUERY-SPECIFICATION-EDITED-P", 1, 0, false);
        declareFunction(me, "mark_new_cycl_query_specification_modified", "MARK-NEW-CYCL-QUERY-SPECIFICATION-MODIFIED", 1, 0, false);
        declareFunction(me, "update_query_spec_params_using_defaults", "UPDATE-QUERY-SPEC-PARAMS-USING-DEFAULTS", 2, 0, false);
        declareFunction(me, "reset_new_cycl_query_specification_formula", "RESET-NEW-CYCL-QUERY-SPECIFICATION-FORMULA", 2, 0, false);
        declareFunction(me, "reset_new_cycl_query_specification_mt", "RESET-NEW-CYCL-QUERY-SPECIFICATION-MT", 2, 0, false);
        declareFunction(me, "new_cycl_query_indexical_p", "NEW-CYCL-QUERY-INDEXICAL-P", 1, 0, false);
        declareFunction(me, "new_cycl_query_indexical_formula_p", "NEW-CYCL-QUERY-INDEXICAL-FORMULA-P", 1, 0, false);
        declareFunction(me, "create_new_cycl_query_specification", "CREATE-NEW-CYCL-QUERY-SPECIFICATION", 0, 0, false);
        declareFunction(me, "load_new_cycl_query_specification_from_kb", "LOAD-NEW-CYCL-QUERY-SPECIFICATION-FROM-KB", 1, 1, false);
        declareFunction(me, "analyse_new_cycl_query_specification_for_indexicals", "ANALYSE-NEW-CYCL-QUERY-SPECIFICATION-FOR-INDEXICALS", 1, 0, false);
        declareFunction(me, "new_cycl_query_specification_load_sentence", "NEW-CYCL-QUERY-SPECIFICATION-LOAD-SENTENCE", 2, 0, false);
        declareFunction(me, "new_cycl_query_specification_load_mt", "NEW-CYCL-QUERY-SPECIFICATION-LOAD-MT", 2, 0, false);
        declareFunction(me, "new_cycl_query_specification_load_inference_parameters", "NEW-CYCL-QUERY-SPECIFICATION-LOAD-INFERENCE-PARAMETERS", 2, 0, false);
        declareFunction(me, "copy_new_cycl_query_specification", "COPY-NEW-CYCL-QUERY-SPECIFICATION", 1, 0, false);
        declareFunction(me, "instantiate_new_cycl_query_specification_from_template", "INSTANTIATE-NEW-CYCL-QUERY-SPECIFICATION-FROM-TEMPLATE", 2, 1, false);
        declareFunction(me, "new_cycl_query_specification_ask", "NEW-CYCL-QUERY-SPECIFICATION-ASK", 1, 3, false);
        declareFunction(me, "get_new_cycl_query_parameter_set", "GET-NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false);
        declareFunction(me, "ensure_new_cycl_query_parameter_set_initialized", "ENSURE-NEW-CYCL-QUERY-PARAMETER-SET-INITIALIZED", 0, 0, false);
        declareFunction(me, "is_new_cycl_query_parameter_set_initializedP", "IS-NEW-CYCL-QUERY-PARAMETER-SET-INITIALIZED?", 0, 0, false);
        declareFunction(me, "new_cycl_query_parameter_set", "NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false);
        declareFunction(me, "ncq_inference_parameter_p", "NCQ-INFERENCE-PARAMETER-P", 1, 0, false);
        declareFunction(me, "initialize_new_cycl_query_parameter_set", "INITIALIZE-NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false);
        declareFunction(me, "compute_new_cycl_query_parameter_set", "COMPUTE-NEW-CYCL-QUERY-PARAMETER-SET", 0, 0, false);
        declareFunction(me, "new_cycl_query_get_all_parameters", "NEW-CYCL-QUERY-GET-ALL-PARAMETERS", 0, 0, false);
        declareFunction(me, "new_cycl_query_get_internal_encoding_for_parameter", "NEW-CYCL-QUERY-GET-INTERNAL-ENCODING-FOR-PARAMETER", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_new_cycl_query_specification_file() {
        defconstant("*DTP-NEW-CYCL-QUERY-SPECIFICATION*", NEW_CYCL_QUERY_SPECIFICATION);
        deflexical("*NEW-CYCL-QUERY-PARAMETER-SET*", SubLTrampolineFile.maybeDefault($new_cycl_query_parameter_set$, $new_cycl_query_parameter_set$, NIL));
        deflexical("*NEW-CYCL-QUERY-ENCODING-EXTENT*", $$CycAPIMt);
        return NIL;
    }

    public static SubLObject setup_new_cycl_query_specification_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_new_cycl_query_specification$.getGlobalValue(), symbol_function(NEW_CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(NEW_CYCL_QUERY_SPEC_CYCL_ID, _CSETF_NEW_CYCL_QUERY_SPEC_CYCL_ID);
        def_csetf(NEW_CYCL_QUERY_SPEC_FORMULA, _CSETF_NEW_CYCL_QUERY_SPEC_FORMULA);
        def_csetf(NEW_CYCL_QUERY_SPEC_MT, _CSETF_NEW_CYCL_QUERY_SPEC_MT);
        def_csetf(NEW_CYCL_QUERY_SPEC_COMMENT, _CSETF_NEW_CYCL_QUERY_SPEC_COMMENT);
        def_csetf(NEW_CYCL_QUERY_SPEC_PROPERTIES, _CSETF_NEW_CYCL_QUERY_SPEC_PROPERTIES);
        def_csetf(NEW_CYCL_QUERY_SPEC_INDEXICALS, _CSETF_NEW_CYCL_QUERY_SPEC_INDEXICALS);
        def_csetf(NEW_CYCL_QUERY_SPEC_EDITED, _CSETF_NEW_CYCL_QUERY_SPEC_EDITED);
        identity(NEW_CYCL_QUERY_SPECIFICATION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_new_cycl_query_specification$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NEW_CYCL_QUERY_SPECIFICATION_METHOD));
        declare_defglobal($new_cycl_query_parameter_set$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_new_cycl_query_specification_file();
    }

    @Override
    public void initializeVariables() {
        init_new_cycl_query_specification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_new_cycl_query_specification_file();
    }

    

    public static final class $new_cycl_query_specification_native extends SubLStructNative {
        public SubLObject $cycl_id;

        public SubLObject $formula;

        public SubLObject $mt;

        public SubLObject $comment;

        public SubLObject $properties;

        public SubLObject $indexicals;

        public SubLObject $edited;

        private static final SubLStructDeclNative structDecl;

        private $new_cycl_query_specification_native() {
            this.$cycl_id = Lisp.NIL;
            this.$formula = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$comment = Lisp.NIL;
            this.$properties = Lisp.NIL;
            this.$indexicals = Lisp.NIL;
            this.$edited = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$cycl_id;
        }

        @Override
        public SubLObject getField3() {
            return this.$formula;
        }

        @Override
        public SubLObject getField4() {
            return this.$mt;
        }

        @Override
        public SubLObject getField5() {
            return this.$comment;
        }

        @Override
        public SubLObject getField6() {
            return this.$properties;
        }

        @Override
        public SubLObject getField7() {
            return this.$indexicals;
        }

        @Override
        public SubLObject getField8() {
            return this.$edited;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl_id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$formula = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$comment = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$properties = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$indexicals = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$edited = value;
        }

        static {
            structDecl = makeStructDeclNative($new_cycl_query_specification_native.class, NEW_CYCL_QUERY_SPECIFICATION, NEW_CYCL_QUERY_SPECIFICATION_P, $list2, $list3, new String[]{ "$cycl_id", "$formula", "$mt", "$comment", "$properties", "$indexicals", "$edited" }, $list4, $list5, NEW_CYCL_QUERY_SPECIFICATION_PRINT);
        }
    }

    public static final class $new_cycl_query_specification_p$UnaryFunction extends UnaryFunction {
        public $new_cycl_query_specification_p$UnaryFunction() {
            super(extractFunctionNamed("NEW-CYCL-QUERY-SPECIFICATION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return new_cycl_query_specification_p(arg1);
        }
    }
}

/**
 * Total time: 1213 ms
 */
