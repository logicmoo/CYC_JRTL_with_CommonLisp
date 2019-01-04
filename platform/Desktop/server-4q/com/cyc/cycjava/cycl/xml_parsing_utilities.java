package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_parsing_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.xml_parsing_utilities";
    public static final String myFingerPrint = "2c2af299dd294bce3a358005e330a7011ee5c699671007ee10f3003243fc71fc";
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 800L)
    public static SubLSymbol $require_valid_xmlP$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLSymbol $dtp_xml_token_iterator_state$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 22444L)
    private static SubLSymbol $xml_token_accumulator$;
    private static final SubLSymbol $sym0$STREAMP;
    private static final SubLSymbol $sym1$ITERATE_XML_TOKEN_DONE;
    private static final SubLSymbol $sym2$ITERATE_XML_TOKEN_NEXT;
    private static final SubLSymbol $sym3$XML_TOKEN_ITERATOR_STATE;
    private static final SubLSymbol $sym4$XML_TOKEN_ITERATOR_STATE_P;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$PRINT_XML_TOKEN_ITERATOR_STATE;
    private static final SubLSymbol $sym10$XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$XML_IT_STATE_IN_STREAM;
    private static final SubLSymbol $sym13$_CSETF_XML_IT_STATE_IN_STREAM;
    private static final SubLSymbol $sym14$XML_IT_STATE_SCRATCH_STREAM;
    private static final SubLSymbol $sym15$_CSETF_XML_IT_STATE_SCRATCH_STREAM;
    private static final SubLSymbol $sym16$XML_IT_STATE_TOKEN_OUTPUT_STREAM;
    private static final SubLSymbol $sym17$_CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM;
    private static final SubLSymbol $sym18$XML_IT_STATE_ENTITY_MAP;
    private static final SubLSymbol $sym19$_CSETF_XML_IT_STATE_ENTITY_MAP;
    private static final SubLSymbol $sym20$XML_IT_STATE_NAMESPACE_STACK;
    private static final SubLSymbol $sym21$_CSETF_XML_IT_STATE_NAMESPACE_STACK;
    private static final SubLSymbol $sym22$XML_IT_STATE_VALIDATE_;
    private static final SubLSymbol $sym23$_CSETF_XML_IT_STATE_VALIDATE_;
    private static final SubLSymbol $sym24$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_;
    private static final SubLSymbol $sym25$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_;
    private static final SubLSymbol $sym26$XML_IT_STATE_RESOLVE_NAMESPACES_;
    private static final SubLSymbol $sym27$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_;
    private static final SubLSymbol $sym28$XML_IT_STATE_ON_DECK_QUEUE;
    private static final SubLSymbol $sym29$_CSETF_XML_IT_STATE_ON_DECK_QUEUE;
    private static final SubLSymbol $kw30$IN_STREAM;
    private static final SubLSymbol $kw31$SCRATCH_STREAM;
    private static final SubLSymbol $kw32$TOKEN_OUTPUT_STREAM;
    private static final SubLSymbol $kw33$ENTITY_MAP;
    private static final SubLSymbol $kw34$NAMESPACE_STACK;
    private static final SubLSymbol $kw35$VALIDATE_;
    private static final SubLSymbol $kw36$RESOLVE_ENTITY_REFERENCES_;
    private static final SubLSymbol $kw37$RESOLVE_NAMESPACES_;
    private static final SubLSymbol $kw38$ON_DECK_QUEUE;
    private static final SubLString $str39$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw40$BEGIN;
    private static final SubLSymbol $sym41$MAKE_XML_TOKEN_ITERATOR_STATE;
    private static final SubLSymbol $kw42$SLOT;
    private static final SubLSymbol $kw43$END;
    private static final SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_XML_TOKEN_ITERATOR_STATE_METHOD;
    private static final SubLString $str45$_XML_TOKEN_ITERATOR_STATE_;
    private static final SubLSymbol $kw46$DONE;
    private static final SubLString $str47$Couldn_t_resolve_namespace__S_in_;
    private static final SubLString $str48$Mismatched_tags__Expected__S__got;
    private static final SubLList $list49;
    private static final SubLString $str50$xmlns_;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLString $str53$xml;
    private static final SubLString $str54$http___www_w3_org_XML_1998_namesp;
    private static final SubLString $str55$_S_is_not_a_prefixed_XML_name_;
    private static final SubLSymbol $sym56$XML_TOKENIZED_HTTP_REQUEST;
    private static final SubLSymbol $kw57$GET;
    private static final SubLInteger $int58$80;
    private static final SubLSymbol $kw59$DEFAULT;
    private static final SubLSymbol $sym60$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw61$OPEN_CONNECTION;
    private static final SubLSymbol $kw62$ERROR;
    private static final SubLSymbol $kw63$OVERALL;
    private static final SubLSymbol $kw64$PRIVATE;
    private static final SubLSymbol $kw65$MACHINE;
    private static final SubLSymbol $kw66$PORT;
    private static final SubLSymbol $kw67$METHOD;
    private static final SubLSymbol $kw68$URL;
    private static final SubLSymbol $kw69$QUERY;
    private static final SubLSymbol $kw70$KEEP_ALIVE_;
    private static final SubLSymbol $kw71$WIDE_NEWLINES_;
    private static final SubLSymbol $kw72$ACCEPT_TYPES;
    private static final SubLSymbol $kw73$CONTENT_TYPE;
    private static final SubLSymbol $kw74$SOAP_ACTION_URI;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$HTML_TOKENIZE;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$XML_TOKENIZE;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$CHAR_EQUAL;
    private static final SubLSymbol $sym81$XML_TOKEN_MENTIONS;
    private static final SubLString $str82$_;
    private static final SubLString $str83$__;
    private static final SubLString $str84$__;
    private static final SubLSymbol $sym85$XML_TAG_;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$XML_TOKEN_ELEMENT_NAME_;
    private static final SubLString $str88$Couldn_t_find_position_of__S_in__;
    private static final SubLString $str89$_xml;
    private static final SubLString $str90$____;
    private static final SubLString $str91$___;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLString $str94$___;
    private static final SubLString $str95$__CDATA_;
    private static final SubLString $str96$__;
    private static final SubLString $str97$__;
    private static final SubLString $str98$Mismatched_closing_bracket__S_fol;
    private static final SubLString $str99$_DOCTYPE;
    private static final SubLString $str100$__DOCTYPE_HTML_;
    private static final SubLString $str101$__;
    private static final SubLString $str102$__;
    private static final SubLList $list103;
    private static final SubLList $list104;
    private static final SubLString $str105$__DOCTYPE;
    private static final SubLString $str106$Got__S_instead_of___DOCTYPE_;
    private static final SubLString $str107$_;
    private static final SubLString $str108$__ENTITY;
    private static final SubLString $str109$_;
    private static final SubLString $str110$_;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$PARSE_XML_TOKEN_INT;
    private static final SubLSymbol $sym113$WHITESPACEP;
    private static final SubLString $str114$XML_syntax_error__No___before__S;
    private static final SubLString $str115$XML_syntax_error__Value_starting_;
    private static final SubLSymbol $sym116$VALID_XML_NAME_P;
    private static final SubLSymbol $sym117$XML_CDATA_TAG_;
    private static final SubLSymbol $sym118$STRINGP;
    private static final SubLString $str119$_S_is_not_an_XML_token;
    private static final SubLString $str120$;
    private static final SubLSymbol $sym121$STRING_;
    private static final SubLSymbol $sym122$XML_TOKENS_TO_SEXPR;
    private static final SubLSymbol $kw123$TEST;
    private static final SubLSymbol $kw124$OWNER;
    private static final SubLSymbol $kw125$CLASSES;
    private static final SubLSymbol $kw126$KB;
    private static final SubLSymbol $kw127$TINY;
    private static final SubLSymbol $kw128$WORKING_;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$PARSE_HTML_TOKEN;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$PARSE_XML_TOKEN;
    private static final SubLObject $list133;
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 1086L)
    public static SubLObject xml_tokenize(final SubLObject in_stream, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP) {
        if (validateP == xml_parsing_utilities.UNPROVIDED) {
            validateP = xml_parsing_utilities.$require_valid_xmlP$.getDynamicValue();
        }
        if (resolve_entity_referencesP == xml_parsing_utilities.UNPROVIDED) {
            resolve_entity_referencesP = (SubLObject)xml_parsing_utilities.NIL;
        }
        if (resolve_namespacesP == xml_parsing_utilities.UNPROVIDED) {
            resolve_namespacesP = (SubLObject)xml_parsing_utilities.NIL;
        }
        final SubLObject iterator = new_xml_token_iterator(in_stream, validateP, resolve_entity_referencesP, resolve_namespacesP);
        SubLObject tokens = (SubLObject)xml_parsing_utilities.NIL;
        while (xml_parsing_utilities.NIL == iteration.iteration_done(iterator)) {
            tokens = (SubLObject)ConsesLow.cons(iteration.iteration_next(iterator), tokens);
        }
        return Sequences.nreverse(tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 1957L)
    public static SubLObject new_xml_token_iterator(final SubLObject in_stream, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP) {
        if (validateP == xml_parsing_utilities.UNPROVIDED) {
            validateP = xml_parsing_utilities.$require_valid_xmlP$.getDynamicValue();
        }
        if (resolve_entity_referencesP == xml_parsing_utilities.UNPROVIDED) {
            resolve_entity_referencesP = (SubLObject)xml_parsing_utilities.NIL;
        }
        if (resolve_namespacesP == xml_parsing_utilities.UNPROVIDED) {
            resolve_namespacesP = (SubLObject)xml_parsing_utilities.NIL;
        }
        assert xml_parsing_utilities.NIL != Types.streamp(in_stream) : in_stream;
        final SubLObject state = make_iterator_xml_token_state(in_stream, validateP, resolve_entity_referencesP, resolve_namespacesP);
        final SubLObject iterator = iteration.new_iterator(state, (SubLObject)xml_parsing_utilities.$sym1$ITERATE_XML_TOKEN_DONE, (SubLObject)xml_parsing_utilities.$sym2$ITERATE_XML_TOKEN_NEXT, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_token_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_xml_token_iterator_state(v_object, stream, (SubLObject)xml_parsing_utilities.ZERO_INTEGER);
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_token_iterator_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $xml_token_iterator_state_native.class) ? xml_parsing_utilities.T : xml_parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_it_state_in_stream(final SubLObject v_object) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_it_state_scratch_stream(final SubLObject v_object) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_it_state_token_output_stream(final SubLObject v_object) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_it_state_entity_map(final SubLObject v_object) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_it_state_namespace_stack(final SubLObject v_object) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_it_state_validateP(final SubLObject v_object) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_it_state_resolve_entity_referencesP(final SubLObject v_object) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_it_state_resolve_namespacesP(final SubLObject v_object) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject xml_it_state_on_deck_queue(final SubLObject v_object) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject _csetf_xml_it_state_in_stream(final SubLObject v_object, final SubLObject value) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject _csetf_xml_it_state_scratch_stream(final SubLObject v_object, final SubLObject value) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject _csetf_xml_it_state_token_output_stream(final SubLObject v_object, final SubLObject value) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject _csetf_xml_it_state_entity_map(final SubLObject v_object, final SubLObject value) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject _csetf_xml_it_state_namespace_stack(final SubLObject v_object, final SubLObject value) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject _csetf_xml_it_state_validateP(final SubLObject v_object, final SubLObject value) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject _csetf_xml_it_state_resolve_entity_referencesP(final SubLObject v_object, final SubLObject value) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject _csetf_xml_it_state_resolve_namespacesP(final SubLObject v_object, final SubLObject value) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject _csetf_xml_it_state_on_deck_queue(final SubLObject v_object, final SubLObject value) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject make_xml_token_iterator_state(SubLObject arglist) {
        if (arglist == xml_parsing_utilities.UNPROVIDED) {
            arglist = (SubLObject)xml_parsing_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $xml_token_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)xml_parsing_utilities.NIL, next = arglist; xml_parsing_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)xml_parsing_utilities.$kw30$IN_STREAM)) {
                _csetf_xml_it_state_in_stream(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)xml_parsing_utilities.$kw31$SCRATCH_STREAM)) {
                _csetf_xml_it_state_scratch_stream(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)xml_parsing_utilities.$kw32$TOKEN_OUTPUT_STREAM)) {
                _csetf_xml_it_state_token_output_stream(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)xml_parsing_utilities.$kw33$ENTITY_MAP)) {
                _csetf_xml_it_state_entity_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)xml_parsing_utilities.$kw34$NAMESPACE_STACK)) {
                _csetf_xml_it_state_namespace_stack(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)xml_parsing_utilities.$kw35$VALIDATE_)) {
                _csetf_xml_it_state_validateP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)xml_parsing_utilities.$kw36$RESOLVE_ENTITY_REFERENCES_)) {
                _csetf_xml_it_state_resolve_entity_referencesP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)xml_parsing_utilities.$kw37$RESOLVE_NAMESPACES_)) {
                _csetf_xml_it_state_resolve_namespacesP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)xml_parsing_utilities.$kw38$ON_DECK_QUEUE)) {
                _csetf_xml_it_state_on_deck_queue(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)xml_parsing_utilities.$str39$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject visit_defstruct_xml_token_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw40$BEGIN, (SubLObject)xml_parsing_utilities.$sym41$MAKE_XML_TOKEN_ITERATOR_STATE, (SubLObject)xml_parsing_utilities.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw42$SLOT, (SubLObject)xml_parsing_utilities.$kw30$IN_STREAM, xml_it_state_in_stream(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw42$SLOT, (SubLObject)xml_parsing_utilities.$kw31$SCRATCH_STREAM, xml_it_state_scratch_stream(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw42$SLOT, (SubLObject)xml_parsing_utilities.$kw32$TOKEN_OUTPUT_STREAM, xml_it_state_token_output_stream(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw42$SLOT, (SubLObject)xml_parsing_utilities.$kw33$ENTITY_MAP, xml_it_state_entity_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw42$SLOT, (SubLObject)xml_parsing_utilities.$kw34$NAMESPACE_STACK, xml_it_state_namespace_stack(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw42$SLOT, (SubLObject)xml_parsing_utilities.$kw35$VALIDATE_, xml_it_state_validateP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw42$SLOT, (SubLObject)xml_parsing_utilities.$kw36$RESOLVE_ENTITY_REFERENCES_, xml_it_state_resolve_entity_referencesP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw42$SLOT, (SubLObject)xml_parsing_utilities.$kw37$RESOLVE_NAMESPACES_, xml_it_state_resolve_namespacesP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw42$SLOT, (SubLObject)xml_parsing_utilities.$kw38$ON_DECK_QUEUE, xml_it_state_on_deck_queue(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)xml_parsing_utilities.$kw43$END, (SubLObject)xml_parsing_utilities.$sym41$MAKE_XML_TOKEN_ITERATOR_STATE, (SubLObject)xml_parsing_utilities.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
    public static SubLObject visit_defstruct_object_xml_token_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_xml_token_iterator_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3770L)
    public static SubLObject print_xml_token_iterator_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)xml_parsing_utilities.$str45$_XML_TOKEN_ITERATOR_STATE_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3936L)
    public static SubLObject new_xml_token_iterator_state(final SubLObject in_stream, final SubLObject scratch_stream, final SubLObject token_output_stream, final SubLObject entity_map, final SubLObject namespace_stack, final SubLObject validateP, final SubLObject resolve_entity_referencesP, final SubLObject resolve_namespacesP, final SubLObject on_deck_queue) {
        final SubLObject state = make_xml_token_iterator_state((SubLObject)xml_parsing_utilities.UNPROVIDED);
        _csetf_xml_it_state_in_stream(state, in_stream);
        _csetf_xml_it_state_scratch_stream(state, scratch_stream);
        _csetf_xml_it_state_token_output_stream(state, token_output_stream);
        _csetf_xml_it_state_entity_map(state, entity_map);
        _csetf_xml_it_state_namespace_stack(state, namespace_stack);
        _csetf_xml_it_state_validateP(state, validateP);
        _csetf_xml_it_state_resolve_entity_referencesP(state, resolve_entity_referencesP);
        _csetf_xml_it_state_resolve_namespacesP(state, resolve_namespacesP);
        _csetf_xml_it_state_on_deck_queue(state, on_deck_queue);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 4795L)
    public static SubLObject xml_token_iterator_state_in_stream(final SubLObject state) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(state) : state;
        return xml_it_state_in_stream(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 4955L)
    public static SubLObject xml_token_iterator_state_scratch_stream(final SubLObject state) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(state) : state;
        return xml_it_state_scratch_stream(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5113L)
    public static SubLObject xml_token_iterator_state_token_output_stream(final SubLObject state) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(state) : state;
        return xml_it_state_token_output_stream(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5281L)
    public static SubLObject xml_token_iterator_state_entity_map(final SubLObject state) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(state) : state;
        return xml_it_state_entity_map(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5431L)
    public static SubLObject xml_token_iterator_state_namespace_stack(final SubLObject state) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(state) : state;
        return xml_it_state_namespace_stack(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5591L)
    public static SubLObject xml_token_iterator_state_validateP(final SubLObject state) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(state) : state;
        return xml_it_state_validateP(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5739L)
    public static SubLObject xml_token_iterator_state_resolve_entity_referencesP(final SubLObject state) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(state) : state;
        return xml_it_state_resolve_entity_referencesP(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5921L)
    public static SubLObject xml_token_iterator_state_resolve_namespacesP(final SubLObject state) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(state) : state;
        return xml_it_state_resolve_namespacesP(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 6089L)
    public static SubLObject xml_token_iterator_state_on_deck_queue(final SubLObject state) {
        assert xml_parsing_utilities.NIL != xml_token_iterator_state_p(state) : state;
        return xml_it_state_on_deck_queue(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 6245L)
    public static SubLObject xml_token_iterator_state_peek(final SubLObject state) {
        ensure_xml_token_on_deck_queue_populated(state);
        return (SubLObject)((xml_parsing_utilities.NIL != iterate_xml_token_done(state)) ? xml_parsing_utilities.NIL : queues.queue_peek(xml_token_iterator_state_on_deck_queue(state)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 6465L)
    public static SubLObject advance_xml_token_iterator_to_next_element(final SubLObject token_iterator) {
        while (xml_parsing_utilities.NIL == iteration.iteration_done(token_iterator) && (xml_parsing_utilities.NIL != non_content_xml_token_p(iteration.xml_token_iterator_peek(token_iterator)) || xml_parsing_utilities.NIL != string_utilities.whitespace_stringP(iteration.xml_token_iterator_peek(token_iterator)))) {
            iteration.iteration_next(token_iterator);
        }
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 6799L)
    public static SubLObject xml_token_iterator_progress(final SubLObject iterator) {
        final SubLObject state = iteration.iteration_state_peek(iterator);
        final SubLObject in_stream = xml_token_iterator_state_in_stream(state);
        return Values.values(streams_high.file_position(in_stream, (SubLObject)xml_parsing_utilities.UNPROVIDED), streams_high.file_length(in_stream));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 7035L)
    public static SubLObject make_iterator_xml_token_state(final SubLObject in_stream, final SubLObject validateP, final SubLObject resolve_entity_referencesP, final SubLObject resolve_namespacesP) {
        final SubLObject scratch_stream = streams_high.make_private_string_output_stream();
        final SubLObject token_output_stream = streams_high.make_private_string_output_stream();
        final SubLObject entity_map = (SubLObject)xml_parsing_utilities.NIL;
        final SubLObject namespace_stack = (SubLObject)xml_parsing_utilities.NIL;
        final SubLObject on_deck_queue = misc_utilities.uninitialized();
        return new_xml_token_iterator_state(in_stream, scratch_stream, token_output_stream, entity_map, namespace_stack, validateP, resolve_entity_referencesP, resolve_namespacesP, on_deck_queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 7546L)
    public static SubLObject iterate_xml_token_done(final SubLObject state) {
        ensure_xml_token_on_deck_queue_populated(state);
        return Equality.eq((SubLObject)xml_parsing_utilities.$kw46$DONE, queues.queue_peek(xml_token_iterator_state_on_deck_queue(state)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 7733L)
    public static SubLObject iterate_xml_token_next(final SubLObject state) {
        final SubLObject on_deck_queue = xml_token_iterator_state_on_deck_queue(state);
        ensure_xml_token_on_deck_queue_populated(state);
        return Values.values(queues.dequeue(on_deck_queue), state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 7966L)
    public static SubLObject ensure_xml_token_on_deck_queue_populated(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject on_deck_queue = xml_token_iterator_state_on_deck_queue(state);
        final SubLObject at_beginningP = (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL == queues.queue_p(on_deck_queue));
        if (xml_parsing_utilities.NIL != at_beginningP) {
            on_deck_queue = queues.create_queue((SubLObject)xml_parsing_utilities.UNPROVIDED);
            _csetf_xml_it_state_on_deck_queue(state, on_deck_queue);
        }
        final SubLObject scratch_stream = xml_token_iterator_state_scratch_stream(state);
        final SubLObject token_output_stream = xml_token_iterator_state_token_output_stream(state);
        final SubLObject in_stream = xml_token_iterator_state_in_stream(state);
        if (xml_parsing_utilities.NIL != queues.queue_empty_p(on_deck_queue)) {
            thread.resetMultipleValues();
            final SubLObject text = xml_read(in_stream, scratch_stream, token_output_stream);
            final SubLObject token = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (xml_parsing_utilities.NIL != string_utilities.non_empty_string_p(text)) {
                final SubLObject modified_text = xml_iterator_state_handle_namespaces_and_entities(text, state);
                queues.enqueue(modified_text, on_deck_queue);
            }
            if (xml_parsing_utilities.NIL == token) {
                queues.enqueue((SubLObject)xml_parsing_utilities.$kw46$DONE, on_deck_queue);
                streams_high.close(scratch_stream, (SubLObject)xml_parsing_utilities.UNPROVIDED);
            }
            else {
                final SubLObject modified_token = xml_iterator_state_handle_namespaces_and_entities(token, state);
                queues.enqueue(modified_token, on_deck_queue);
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 9289L)
    public static SubLObject xml_iterator_state_handle_namespaces_and_entities(final SubLObject token, final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject namespace_stack = xml_token_iterator_state_namespace_stack(state);
        final SubLObject resolve_namespacesP = xml_token_iterator_state_resolve_namespacesP(state);
        final SubLObject validateP = xml_token_iterator_state_validateP(state);
        final SubLObject resolve_entity_referencesP = xml_token_iterator_state_resolve_entity_referencesP(state);
        final SubLObject entity_map = xml_token_iterator_state_entity_map(state);
        SubLObject new_token = token;
        if (xml_parsing_utilities.NIL != resolve_entity_referencesP && xml_parsing_utilities.NIL != entity_map && xml_parsing_utilities.NIL != Sequences.find((SubLObject)Characters.CHAR_ampersand, token, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED)) {
            new_token = resolve_entity_references(token, entity_map);
        }
        if (xml_parsing_utilities.NIL != xml_tagP(token) && xml_parsing_utilities.NIL == xml_declaration_p(token) && xml_parsing_utilities.NIL == xml_doctype_tag_p(token) && xml_parsing_utilities.NIL == xml_processing_instruction_p(token) && xml_parsing_utilities.NIL == xml_comment_p(token) && (xml_parsing_utilities.NIL != validateP || xml_parsing_utilities.NIL != resolve_namespacesP)) {
            thread.resetMultipleValues();
            final SubLObject modified_token = handle_xml_namespaces(new_token, namespace_stack, resolve_namespacesP);
            final SubLObject new_stack = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_token = modified_token;
            _csetf_xml_it_state_namespace_stack(state, new_stack);
        }
        if (xml_parsing_utilities.NIL != resolve_entity_referencesP && xml_parsing_utilities.NIL == entity_map && xml_parsing_utilities.NIL != xml_doctype_tag_p(token)) {
            _csetf_xml_it_state_entity_map(state, entity_map_from_doctype_tag(token));
        }
        return new_token;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 10621L)
    public static SubLObject handle_xml_namespaces(SubLObject token, SubLObject stack, final SubLObject resolve_namespacesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_namespace_bindings = (SubLObject)xml_parsing_utilities.NIL;
        if (xml_parsing_utilities.NIL != resolve_namespacesP) {
            thread.resetMultipleValues();
            final SubLObject token_$1 = xml_utilities.resolve_xml_namespaces(token, stack);
            final SubLObject new_namespace_bindings_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            token = token_$1;
            new_namespace_bindings = new_namespace_bindings_$2;
        }
        else {
            SubLObject problem = (SubLObject)xml_parsing_utilities.NIL;
            thread.resetMultipleValues();
            final SubLObject problem_$3 = validate_xml_namespaces(token, stack);
            final SubLObject new_namespace_bindings_$3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            problem = problem_$3;
            new_namespace_bindings = new_namespace_bindings_$3;
            if (xml_parsing_utilities.NIL != problem) {
                Errors.error((SubLObject)xml_parsing_utilities.$str47$Couldn_t_resolve_namespace__S_in_, problem, token);
            }
        }
        if (xml_parsing_utilities.NIL == xml_cdata_tagP(token)) {
            if (xml_parsing_utilities.NIL != xml_opening_tag_p(token)) {
                stack = (SubLObject)ConsesLow.cons(xml_token_element_name(token), stack);
                stack = ConsesLow.append(new_namespace_bindings, stack);
            }
            else if (xml_parsing_utilities.NIL != xml_closing_tag_p(token)) {
                final SubLObject element_name = xml_token_element_name(token);
                while (xml_parsing_utilities.NIL != xml_namespace_mapping_p(stack.first())) {
                    stack = stack.rest();
                }
                if (xml_parsing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !element_name.equal(stack.first())) {
                    Errors.error((SubLObject)xml_parsing_utilities.$str48$Mismatched_tags__Expected__S__got, stack.first(), element_name);
                }
                stack = stack.rest();
            }
        }
        return Values.values(token, stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 12132L)
    public static SubLObject xml_namespace_mapping_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && v_object.first().isString() && v_object.rest().isString());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 12273L)
    public static SubLObject validate_xml_namespaces(final SubLObject token, final SubLObject stack) {
        SubLObject problem = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject new_bindings = (SubLObject)xml_parsing_utilities.NIL;
        if (xml_parsing_utilities.NIL != xml_tagP(token) && xml_parsing_utilities.NIL == xml_declaration_p(token) && xml_parsing_utilities.NIL == xml_doctype_tag_p(token) && xml_parsing_utilities.NIL == xml_processing_instruction_p(token) && xml_parsing_utilities.NIL == xml_cdata_tagP(token) && xml_parsing_utilities.NIL == xml_comment_p(token)) {
            SubLObject current;
            final SubLObject datum = current = parse_xml_token(token);
            SubLObject element_name = (SubLObject)xml_parsing_utilities.NIL;
            SubLObject attributes = (SubLObject)xml_parsing_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_parsing_utilities.$list49);
            element_name = current.first();
            current = (attributes = current.rest());
            if (xml_parsing_utilities.NIL != string_utilities.substringP((SubLObject)xml_parsing_utilities.$str50$xmlns_, token, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED)) {
                SubLObject cdolist_list_var = attributes;
                SubLObject cons = (SubLObject)xml_parsing_utilities.NIL;
                cons = cdolist_list_var.first();
                while (xml_parsing_utilities.NIL != cdolist_list_var) {
                    SubLObject current_$6;
                    final SubLObject datum_$5 = current_$6 = cons;
                    SubLObject attribute = (SubLObject)xml_parsing_utilities.NIL;
                    SubLObject value = (SubLObject)xml_parsing_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)xml_parsing_utilities.$list51);
                    attribute = current_$6.first();
                    current_$6 = (value = current_$6.rest());
                    if (xml_parsing_utilities.NIL != string_utilities.starts_with(attribute, (SubLObject)xml_parsing_utilities.$str50$xmlns_)) {
                        new_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(string_utilities.substring(attribute, (SubLObject)xml_parsing_utilities.SIX_INTEGER, Sequences.position((SubLObject)Characters.CHAR_equal, attribute, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED)), value), new_bindings);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                }
            }
            SubLObject cons;
            SubLObject value;
            SubLObject rest;
            SubLObject current_$7;
            SubLObject datum_$6;
            SubLObject attribute_name;
            for (problem = maybe_validate_xml_namespace(element_name, new_bindings, stack), rest = (SubLObject)xml_parsing_utilities.NIL, rest = attributes; xml_parsing_utilities.NIL == problem && xml_parsing_utilities.NIL != rest; problem = maybe_validate_xml_namespace(attribute_name, new_bindings, stack), rest = rest.rest()) {
                cons = rest.first();
                datum_$6 = (current_$7 = cons);
                attribute_name = (SubLObject)xml_parsing_utilities.NIL;
                value = (SubLObject)xml_parsing_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)xml_parsing_utilities.$list52);
                attribute_name = current_$7.first();
                current_$7 = (value = current_$7.rest());
            }
        }
        return Values.values(problem, new_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 13153L)
    public static SubLObject maybe_validate_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack) {
        return (SubLObject)((xml_parsing_utilities.NIL != Sequences.find((SubLObject)Characters.CHAR_colon, name, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED) && xml_parsing_utilities.NIL == string_utilities.starts_with(name, (SubLObject)xml_parsing_utilities.$str50$xmlns_)) ? validate_xml_namespace(name, new_bindings, stack) : xml_parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 13351L)
    public static SubLObject validate_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack) {
        final SubLObject namespace = xml_prefixed_name_namespace(name);
        SubLObject expanded = list_utilities.alist_lookup_without_values(new_bindings, namespace, Symbols.symbol_function((SubLObject)xml_parsing_utilities.EQUAL), (SubLObject)xml_parsing_utilities.NIL);
        if (xml_parsing_utilities.NIL == expanded && namespace.equal((SubLObject)xml_parsing_utilities.$str53$xml)) {
            expanded = (SubLObject)xml_parsing_utilities.$str54$http___www_w3_org_XML_1998_namesp;
        }
        if (xml_parsing_utilities.NIL == expanded) {
            SubLObject csome_list_var = stack;
            SubLObject binding = (SubLObject)xml_parsing_utilities.NIL;
            binding = csome_list_var.first();
            while (xml_parsing_utilities.NIL == expanded && xml_parsing_utilities.NIL != csome_list_var) {
                if (binding.isCons() && namespace.equal(binding.first())) {
                    expanded = binding.rest();
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            }
        }
        return (SubLObject)((xml_parsing_utilities.NIL != expanded) ? xml_parsing_utilities.NIL : name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 13943L)
    public static SubLObject xml_prefixed_name_p(final SubLObject name) {
        return (SubLObject)SubLObjectFactory.makeBoolean(name.isString() && xml_parsing_utilities.NIL != list_utilities.sublisp_boolean(Sequences.position((SubLObject)Characters.CHAR_colon, name, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 14056L)
    public static SubLObject xml_prefixed_name_namespace(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject colon_pos = Sequences.position((SubLObject)Characters.CHAR_colon, name, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        if (xml_parsing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && xml_parsing_utilities.NIL == colon_pos) {
            Errors.error((SubLObject)xml_parsing_utilities.$str55$_S_is_not_a_prefixed_XML_name_, name);
        }
        return string_utilities.substring(name, (SubLObject)xml_parsing_utilities.ZERO_INTEGER, colon_pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 14252L)
    public static SubLObject xml_prefixed_name_local_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject colon_pos = Sequences.position((SubLObject)Characters.CHAR_colon, name, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        if (xml_parsing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && xml_parsing_utilities.NIL == colon_pos) {
            Errors.error((SubLObject)xml_parsing_utilities.$str55$_S_is_not_a_prefixed_XML_name_, name);
        }
        return string_utilities.substring(name, number_utilities.f_1X(colon_pos), (SubLObject)xml_parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 14452L)
    public static SubLObject xml_string_tokenize(final SubLObject string, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP) {
        if (validateP == xml_parsing_utilities.UNPROVIDED) {
            validateP = xml_parsing_utilities.$require_valid_xmlP$.getDynamicValue();
        }
        if (resolve_entity_referencesP == xml_parsing_utilities.UNPROVIDED) {
            resolve_entity_referencesP = (SubLObject)xml_parsing_utilities.NIL;
        }
        if (resolve_namespacesP == xml_parsing_utilities.UNPROVIDED) {
            resolve_namespacesP = (SubLObject)xml_parsing_utilities.NIL;
        }
        SubLObject out_list = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject stream = (SubLObject)xml_parsing_utilities.NIL;
        try {
            stream = streams_high.make_private_string_input_stream(string, (SubLObject)xml_parsing_utilities.ZERO_INTEGER, (SubLObject)xml_parsing_utilities.NIL);
            out_list = xml_tokenize(stream, validateP, resolve_entity_referencesP, resolve_namespacesP);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)xml_parsing_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)xml_parsing_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return out_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 14904L)
    public static SubLObject xml_tokenized_http_request(SubLObject machine, SubLObject url, SubLObject query, SubLObject method, SubLObject port, SubLObject keep_aliveP, SubLObject wide_newlinesP, SubLObject open_connection_timeout, SubLObject overall_timeout, SubLObject redirectP, SubLObject accept_types) {
        if (query == xml_parsing_utilities.UNPROVIDED) {
            query = (SubLObject)xml_parsing_utilities.NIL;
        }
        if (method == xml_parsing_utilities.UNPROVIDED) {
            method = (SubLObject)xml_parsing_utilities.$kw57$GET;
        }
        if (port == xml_parsing_utilities.UNPROVIDED) {
            port = (SubLObject)xml_parsing_utilities.$int58$80;
        }
        if (keep_aliveP == xml_parsing_utilities.UNPROVIDED) {
            keep_aliveP = (SubLObject)xml_parsing_utilities.T;
        }
        if (wide_newlinesP == xml_parsing_utilities.UNPROVIDED) {
            wide_newlinesP = (SubLObject)xml_parsing_utilities.T;
        }
        if (open_connection_timeout == xml_parsing_utilities.UNPROVIDED) {
            open_connection_timeout = (SubLObject)xml_parsing_utilities.NIL;
        }
        if (overall_timeout == xml_parsing_utilities.UNPROVIDED) {
            overall_timeout = (SubLObject)xml_parsing_utilities.NIL;
        }
        if (redirectP == xml_parsing_utilities.UNPROVIDED) {
            redirectP = (SubLObject)xml_parsing_utilities.T;
        }
        if (accept_types == xml_parsing_utilities.UNPROVIDED) {
            accept_types = (SubLObject)xml_parsing_utilities.$kw59$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject connection_timed_out = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject overall_timed_out = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject make_request = (SubLObject)xml_parsing_utilities.T;
        SubLObject tokens = (SubLObject)xml_parsing_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)xml_parsing_utilities.$sym60$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (xml_parsing_utilities.NIL != overall_timeout) {
                        SubLObject timeout_reason = (SubLObject)xml_parsing_utilities.NIL;
                        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$9 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)xml_parsing_utilities.T, thread);
                                SubLObject timer = (SubLObject)xml_parsing_utilities.NIL;
                                try {
                                    final SubLObject _prev_bind_0_$10 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)xml_parsing_utilities.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = subl_macro_promotions.with_timeout_start_timer(overall_timeout, tag);
                                        thread.resetMultipleValues();
                                        final SubLObject tokens_$11 = xml_tokenized_http_request(machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, (SubLObject)xml_parsing_utilities.NIL, redirectP, accept_types);
                                        final SubLObject timeout_reason_$12 = thread.secondMultipleValue();
                                        final SubLObject error_message_$13 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        tokens = tokens_$11;
                                        timeout_reason = timeout_reason_$12;
                                        error_message = error_message_$13;
                                    }
                                    finally {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$10, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)xml_parsing_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        subl_macro_promotions.with_timeout_stop_timer(timer);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            }
                            finally {
                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            overall_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        final SubLObject pcase_var = timeout_reason;
                        if (pcase_var.eql((SubLObject)xml_parsing_utilities.$kw61$OPEN_CONNECTION)) {
                            connection_timed_out = (SubLObject)xml_parsing_utilities.T;
                        }
                    }
                    else {
                        while (xml_parsing_utilities.NIL != make_request) {
                            thread.resetMultipleValues();
                            final SubLObject tokens_$12 = xml_tokenized_http_request_internal(machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, accept_types);
                            final SubLObject connection_timed_out_$16 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            tokens = tokens_$12;
                            connection_timed_out = connection_timed_out_$16;
                            if (xml_parsing_utilities.NIL != redirectP) {
                                final SubLObject header = tokens.first();
                                if (xml_parsing_utilities.NIL != web_utilities.html_redirection_header_p(header)) {
                                    final SubLObject redirection_url = web_utilities.html_redirection_url(header);
                                    thread.resetMultipleValues();
                                    final SubLObject machine_$17 = web_utilities.parse_http_url(redirection_url);
                                    final SubLObject port_$18 = thread.secondMultipleValue();
                                    final SubLObject url_$19 = thread.thirdMultipleValue();
                                    final SubLObject query_$20 = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    machine = machine_$17;
                                    port = port_$18;
                                    url = url_$19;
                                    query = query_$20;
                                }
                                else {
                                    make_request = (SubLObject)xml_parsing_utilities.NIL;
                                }
                            }
                            else {
                                make_request = (SubLObject)xml_parsing_utilities.NIL;
                            }
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)xml_parsing_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (xml_parsing_utilities.NIL != error_message) {
            return Values.values(tokens, (SubLObject)xml_parsing_utilities.$kw62$ERROR, error_message);
        }
        if (xml_parsing_utilities.NIL != connection_timed_out) {
            return Values.values(tokens, (SubLObject)xml_parsing_utilities.$kw61$OPEN_CONNECTION, (SubLObject)xml_parsing_utilities.NIL);
        }
        if (xml_parsing_utilities.NIL != overall_timed_out) {
            return Values.values(tokens, (SubLObject)xml_parsing_utilities.$kw63$OVERALL, (SubLObject)xml_parsing_utilities.NIL);
        }
        return Values.values(tokens, (SubLObject)xml_parsing_utilities.NIL, (SubLObject)xml_parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 17642L)
    public static SubLObject xml_tokenized_http_request_internal(final SubLObject machine, final SubLObject url, final SubLObject query, final SubLObject method, final SubLObject port, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, final SubLObject timeout, final SubLObject accept_types) {
        SubLObject timed_out = (SubLObject)xml_parsing_utilities.T;
        SubLObject tokens = (SubLObject)xml_parsing_utilities.NIL;
        final SubLObject real_port = (SubLObject)(port.eql((SubLObject)xml_parsing_utilities.$kw59$DEFAULT) ? xml_parsing_utilities.$int58$80 : port);
        SubLObject channel = (SubLObject)xml_parsing_utilities.NIL;
        try {
            channel = subl_promotions.open_tcp_stream_with_timeout(machine, real_port, timeout, (SubLObject)xml_parsing_utilities.$kw64$PRIVATE);
            if (xml_parsing_utilities.NIL != subl_macro_promotions.validate_tcp_connection(channel, machine, real_port)) {
                web_utilities.send_http_request(channel, (SubLObject)ConsesLow.list(new SubLObject[] { xml_parsing_utilities.$kw65$MACHINE, machine, xml_parsing_utilities.$kw66$PORT, port, xml_parsing_utilities.$kw67$METHOD, method, xml_parsing_utilities.$kw68$URL, url, xml_parsing_utilities.$kw69$QUERY, query, xml_parsing_utilities.$kw70$KEEP_ALIVE_, keep_aliveP, xml_parsing_utilities.$kw71$WIDE_NEWLINES_, wide_newlinesP, xml_parsing_utilities.$kw72$ACCEPT_TYPES, accept_types, xml_parsing_utilities.$kw73$CONTENT_TYPE, xml_parsing_utilities.$kw59$DEFAULT, xml_parsing_utilities.$kw74$SOAP_ACTION_URI, xml_parsing_utilities.NIL }));
                timed_out = (SubLObject)xml_parsing_utilities.NIL;
                tokens = xml_tokenize(channel, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)xml_parsing_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (xml_parsing_utilities.NIL != channel) {
                    streams_high.close(channel, (SubLObject)xml_parsing_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return Values.values(tokens, timed_out);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 18283L)
    public static SubLObject html_tokenize(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject in_stream = (SubLObject)xml_parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_parsing_utilities.$list75);
        in_stream = current.first();
        current = current.rest();
        if (xml_parsing_utilities.NIL == current) {
            access_macros.defmacro_obsolete_warning((SubLObject)xml_parsing_utilities.$sym76$HTML_TOKENIZE, (SubLObject)xml_parsing_utilities.$list77);
            return (SubLObject)ConsesLow.listS((SubLObject)xml_parsing_utilities.$sym78$XML_TOKENIZE, in_stream, (SubLObject)xml_parsing_utilities.$list79);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)xml_parsing_utilities.$list75);
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 18433L)
    public static SubLObject xml_token_matches_exactly(final SubLObject token, final SubLObject match_string) {
        return Strings.stringE(token, match_string, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 18689L)
    public static SubLObject xml_token_matches(final SubLObject token, final SubLObject match_string) {
        return Strings.string_equal(token, match_string, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 18941L)
    public static SubLObject xml_token_starts_with(final SubLObject token, final SubLObject start_string) {
        return Equality.eql((SubLObject)xml_parsing_utilities.ZERO_INTEGER, Sequences.search(start_string, token, Symbols.symbol_function((SubLObject)xml_parsing_utilities.$sym80$CHAR_EQUAL), (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 19208L)
    public static SubLObject xml_token_mentions(final SubLObject token, final SubLObject mention_string) {
        return list_utilities.sublisp_boolean(Sequences.search(mention_string, token, Symbols.symbol_function((SubLObject)xml_parsing_utilities.$sym80$CHAR_EQUAL), (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 19488L)
    public static SubLObject next_xml_token_position(final SubLObject tokens, final SubLObject target_string, SubLObject test) {
        if (test == xml_parsing_utilities.UNPROVIDED) {
            test = (SubLObject)xml_parsing_utilities.$sym81$XML_TOKEN_MENTIONS;
        }
        SubLObject list_var = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject token = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject position = (SubLObject)xml_parsing_utilities.NIL;
        list_var = tokens;
        token = list_var.first();
        for (position = (SubLObject)xml_parsing_utilities.ZERO_INTEGER; xml_parsing_utilities.NIL != list_var; list_var = list_var.rest(), token = list_var.first(), position = Numbers.add((SubLObject)xml_parsing_utilities.ONE_INTEGER, position)) {
            if (xml_parsing_utilities.NIL != Functions.funcall(test, token, target_string)) {
                return position;
            }
        }
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 19951L)
    public static SubLObject next_xml_token_position_if(final SubLObject tokens, final SubLObject test) {
        SubLObject list_var = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject token = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject position = (SubLObject)xml_parsing_utilities.NIL;
        list_var = tokens;
        token = list_var.first();
        for (position = (SubLObject)xml_parsing_utilities.ZERO_INTEGER; xml_parsing_utilities.NIL != list_var; list_var = list_var.rest(), token = list_var.first(), position = Numbers.add((SubLObject)xml_parsing_utilities.ONE_INTEGER, position)) {
            if (xml_parsing_utilities.NIL != Functions.funcall(test, token)) {
                return position;
            }
        }
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 20300L)
    public static SubLObject next_xml_token_position_if_not(final SubLObject tokens, final SubLObject test) {
        SubLObject list_var = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject token = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject position = (SubLObject)xml_parsing_utilities.NIL;
        list_var = tokens;
        token = list_var.first();
        for (position = (SubLObject)xml_parsing_utilities.ZERO_INTEGER; xml_parsing_utilities.NIL != list_var; list_var = list_var.rest(), token = list_var.first(), position = Numbers.add((SubLObject)xml_parsing_utilities.ONE_INTEGER, position)) {
            if (xml_parsing_utilities.NIL == Functions.funcall(test, token)) {
                return position;
            }
        }
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 20662L)
    public static SubLObject advance_xml_tokens(final SubLObject tokens, SubLObject n) {
        if (n == xml_parsing_utilities.UNPROVIDED) {
            n = (SubLObject)xml_parsing_utilities.ONE_INTEGER;
        }
        return conses_high.nthcdr(n, tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 20937L)
    public static SubLObject advance_xml_tokens_to(SubLObject tokens, final SubLObject target_string, SubLObject test) {
        if (test == xml_parsing_utilities.UNPROVIDED) {
            test = (SubLObject)xml_parsing_utilities.$sym81$XML_TOKEN_MENTIONS;
        }
        while (xml_parsing_utilities.NIL != tokens && xml_parsing_utilities.NIL == Functions.funcall(test, tokens.first(), target_string)) {
            tokens = tokens.rest();
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 21416L)
    public static SubLObject xml_extract_token_sequence(final SubLObject xml_tokens, final SubLObject token_name) {
        final SubLObject sequence_start_string = Sequences.cconcatenate((SubLObject)xml_parsing_utilities.$str82$_, format_nil.format_nil_a_no_copy(token_name));
        final SubLObject sequence_self_end_string = (SubLObject)xml_parsing_utilities.$str83$__;
        final SubLObject sequence_match_end_string = Sequences.cconcatenate((SubLObject)xml_parsing_utilities.$str84$__, format_nil.format_nil_a_no_copy(token_name));
        final SubLObject sequence_start = advance_xml_tokens_to(xml_tokens, sequence_start_string, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        if (xml_parsing_utilities.NIL == sequence_start) {
            return (SubLObject)xml_parsing_utilities.NIL;
        }
        final SubLObject start_token = sequence_start.first();
        if (xml_parsing_utilities.NIL != string_utilities.ends_with(start_token, sequence_self_end_string, (SubLObject)xml_parsing_utilities.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(start_token);
        }
        final SubLObject sequence_end = advance_xml_tokens_to(sequence_start, sequence_match_end_string, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        if (xml_parsing_utilities.NIL != sequence_end) {
            final SubLObject sequence_after_end = sequence_end.rest();
            return conses_high.ldiff(sequence_start, sequence_after_end);
        }
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 22508L)
    public static SubLObject accumulate_xml_token(final SubLObject token) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (xml_parsing_utilities.NIL != misc_utilities.initialized_p(xml_parsing_utilities.$xml_token_accumulator$.getDynamicValue(thread))) {
            xml_parsing_utilities.$xml_token_accumulator$.setDynamicValue((SubLObject)ConsesLow.cons(token, xml_parsing_utilities.$xml_token_accumulator$.getDynamicValue(thread)), thread);
        }
        return token;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 22661L)
    public static SubLObject accumulate_xml_tokens(final SubLObject tokens, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (xml_parsing_utilities.NIL != misc_utilities.initialized_p(xml_parsing_utilities.$xml_token_accumulator$.getDynamicValue(thread))) {
            SubLObject done_count = (SubLObject)xml_parsing_utilities.ZERO_INTEGER;
            SubLObject doneP = Numbers.numGE(done_count, n);
            if (xml_parsing_utilities.NIL == doneP) {
                SubLObject csome_list_var = tokens;
                SubLObject token = (SubLObject)xml_parsing_utilities.NIL;
                token = csome_list_var.first();
                while (xml_parsing_utilities.NIL == doneP && xml_parsing_utilities.NIL != csome_list_var) {
                    accumulate_xml_token(token);
                    done_count = Numbers.add(done_count, (SubLObject)xml_parsing_utilities.ONE_INTEGER);
                    doneP = Numbers.numGE(done_count, n);
                    csome_list_var = csome_list_var.rest();
                    token = csome_list_var.first();
                }
            }
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 22952L)
    public static SubLObject accumulated_xml_tokens() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((xml_parsing_utilities.NIL != misc_utilities.initialized_p(xml_parsing_utilities.$xml_token_accumulator$.getDynamicValue(thread))) ? Sequences.nreverse(xml_parsing_utilities.$xml_token_accumulator$.getDynamicValue(thread)) : xml_parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 23089L)
    public static SubLObject xml_tokens_for_next_element(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)xml_parsing_utilities.NIL;
        final SubLObject _prev_bind_0 = xml_parsing_utilities.$xml_token_accumulator$.currentBinding(thread);
        try {
            xml_parsing_utilities.$xml_token_accumulator$.bind((SubLObject)xml_parsing_utilities.NIL, thread);
            advance_xml_tokens_to_end_of_element(tokens);
            ans = accumulated_xml_tokens();
        }
        finally {
            xml_parsing_utilities.$xml_token_accumulator$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 23416L)
    public static SubLObject advance_xml_tokens_to_end_of_element(final SubLObject tokens) {
        assert xml_parsing_utilities.NIL != xml_tagP(tokens.first()) : tokens.first();
        final SubLObject element_name = xml_token_element_name(tokens.first());
        return advance_xml_tokens_to_end_of_element_int(tokens, element_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 23788L)
    public static SubLObject advance_xml_tokens_to_end_of_element_int(final SubLObject tokens, final SubLObject element_name) {
        SubLObject first_token = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject rest_of_tokens = (SubLObject)xml_parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tokens, tokens, (SubLObject)xml_parsing_utilities.$list86);
        first_token = tokens.first();
        final SubLObject current = rest_of_tokens = tokens.rest();
        if (xml_parsing_utilities.NIL != xml_closing_tokenP(element_name, first_token) || (xml_parsing_utilities.NIL != xml_token_element_nameP(first_token, element_name) && xml_parsing_utilities.NIL != xml_empty_tagP(first_token))) {
            accumulate_xml_token(first_token);
            return rest_of_tokens;
        }
        SubLObject next_position = next_xml_token_position(rest_of_tokens, element_name, (SubLObject)xml_parsing_utilities.$sym87$XML_TOKEN_ELEMENT_NAME_);
        SubLObject next_occurrence = (SubLObject)((xml_parsing_utilities.NIL != next_position) ? ConsesLow.nth(next_position, rest_of_tokens) : xml_parsing_utilities.NIL);
        if (xml_parsing_utilities.NIL == next_position) {
            Errors.sublisp_break((SubLObject)xml_parsing_utilities.$str88$Couldn_t_find_position_of__S_in__, new SubLObject[] { element_name, rest_of_tokens });
        }
        SubLObject ans;
        for (ans = rest_of_tokens; xml_parsing_utilities.NIL != xml_empty_tagP(next_occurrence); next_occurrence = (SubLObject)((xml_parsing_utilities.NIL != next_position) ? ConsesLow.nth(next_position, ans) : xml_parsing_utilities.NIL)) {
            ans = advance_xml_tokens(ans, number_utilities.f_1X(next_position));
            next_position = next_xml_token_position(ans, element_name, (SubLObject)xml_parsing_utilities.$sym87$XML_TOKEN_ELEMENT_NAME_);
        }
        if (xml_parsing_utilities.NIL != xml_closing_tag_p(next_occurrence)) {
            accumulate_xml_tokens(tokens, number_utilities.f_1X(number_utilities.f_1X(next_position)));
            return advance_xml_tokens(ans, number_utilities.f_1X(next_position));
        }
        while (xml_parsing_utilities.NIL == xml_closing_tag_p(next_occurrence)) {
            final SubLObject at_next_start = advance_xml_tokens(ans, next_position);
            final SubLObject after_next_end = ans = advance_xml_tokens_to_end_of_element_int(at_next_start, element_name);
            next_position = next_xml_token_position(ans, element_name, (SubLObject)xml_parsing_utilities.$sym87$XML_TOKEN_ELEMENT_NAME_);
            next_occurrence = (SubLObject)((xml_parsing_utilities.NIL != next_position) ? ConsesLow.nth(next_position, ans) : xml_parsing_utilities.NIL);
        }
        return (SubLObject)((xml_parsing_utilities.NIL != ans) ? advance_xml_tokens_to_end_of_element_int(ans, element_name) : xml_parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 26043L)
    public static SubLObject xml_declaration_p(final SubLObject v_object) {
        return xml_token_element_nameP(v_object, (SubLObject)xml_parsing_utilities.$str89$_xml);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 26135L)
    public static SubLObject xml_comment_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && xml_parsing_utilities.NIL != string_utilities.starts_with(v_object, (SubLObject)xml_parsing_utilities.$str90$____) && xml_parsing_utilities.NIL != string_utilities.ends_with(v_object, (SubLObject)xml_parsing_utilities.$str91$___, (SubLObject)xml_parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 26272L)
    public static SubLObject xml_closing_tag_p(final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(token.isString() && xml_parsing_utilities.NIL != xml_tagP(token) && xml_parsing_utilities.NIL != list_utilities.lengthG(token, (SubLObject)xml_parsing_utilities.TWO_INTEGER, (SubLObject)xml_parsing_utilities.UNPROVIDED) && Characters.CHAR_slash.eql(Strings.sublisp_char(token, (SubLObject)xml_parsing_utilities.ONE_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 26424L)
    public static SubLObject xml_opening_tag_p(final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != xml_tagP(token) && xml_parsing_utilities.NIL == xml_declaration_p(token) && xml_parsing_utilities.NIL == xml_doctype_tag_p(token) && xml_parsing_utilities.NIL == xml_comment_p(token) && xml_parsing_utilities.NIL == xml_empty_tagP(token) && xml_parsing_utilities.NIL == xml_closing_tag_p(token) && xml_parsing_utilities.NIL == xml_processing_instruction_p(token));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 26740L)
    public static SubLObject advance_xml_tokens_without_crossing(SubLObject tokens, final SubLObject target_string, final SubLObject forbidden_string, SubLObject test) {
        if (test == xml_parsing_utilities.UNPROVIDED) {
            test = (SubLObject)xml_parsing_utilities.$sym81$XML_TOKEN_MENTIONS;
        }
        while (xml_parsing_utilities.NIL != tokens && xml_parsing_utilities.NIL == Functions.funcall(test, tokens.first(), target_string) && xml_parsing_utilities.NIL == Functions.funcall(test, tokens.first(), forbidden_string)) {
            tokens = tokens.rest();
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 27592L)
    public static SubLObject advance_xml_tokens_without_crossing_or_quit(SubLObject tokens, final SubLObject target_string, final SubLObject forbidden_string, SubLObject test) {
        if (test == xml_parsing_utilities.UNPROVIDED) {
            test = (SubLObject)xml_parsing_utilities.$sym81$XML_TOKEN_MENTIONS;
        }
        tokens = advance_xml_tokens_without_crossing(tokens, target_string, forbidden_string, test);
        if (xml_parsing_utilities.NIL != tokens && xml_parsing_utilities.NIL == Functions.funcall(test, tokens.first(), forbidden_string)) {
            return tokens;
        }
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 28251L)
    public static SubLObject xml_read(final SubLObject in_stream, SubLObject scratch_stream, SubLObject token_output_stream) {
        if (scratch_stream == xml_parsing_utilities.UNPROVIDED) {
            scratch_stream = streams_high.make_private_string_output_stream();
        }
        if (token_output_stream == xml_parsing_utilities.UNPROVIDED) {
            token_output_stream = streams_high.make_private_string_output_stream();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.clear_output(scratch_stream);
        streams_high.clear_output(token_output_stream);
        thread.resetMultipleValues();
        final SubLObject pretext = web_utilities.read_until_char(in_stream, (SubLObject)Characters.CHAR_less, scratch_stream);
        final SubLObject eof = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (xml_parsing_utilities.NIL != eof) {
            return Values.values(pretext, (SubLObject)xml_parsing_utilities.NIL);
        }
        final SubLObject bracket_alist = (SubLObject)xml_parsing_utilities.$list92;
        final SubLObject brackets = (SubLObject)xml_parsing_utilities.$list93;
        SubLObject open_bracket_stack = (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_less);
        SubLObject abortP = (SubLObject)xml_parsing_utilities.NIL;
        print_high.princ((SubLObject)Characters.CHAR_less, token_output_stream);
        SubLObject within_commentP = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject within_cdataP = (SubLObject)xml_parsing_utilities.NIL;
        while (xml_parsing_utilities.NIL != open_bracket_stack && xml_parsing_utilities.NIL == abortP) {
            thread.resetMultipleValues();
            final SubLObject partial_tag_text = web_utilities.read_until_one_of(in_stream, brackets, scratch_stream);
            final SubLObject v_char = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (partial_tag_text.isString()) {
                print_high.princ(partial_tag_text, token_output_stream);
                if (xml_parsing_utilities.NIL == within_commentP && xml_parsing_utilities.NIL != string_utilities.starts_with(partial_tag_text, (SubLObject)xml_parsing_utilities.$str94$___)) {
                    within_commentP = (SubLObject)xml_parsing_utilities.T;
                }
                if (xml_parsing_utilities.NIL == within_cdataP && xml_parsing_utilities.NIL != string_utilities.starts_with(partial_tag_text, (SubLObject)xml_parsing_utilities.$str95$__CDATA_)) {
                    within_cdataP = (SubLObject)xml_parsing_utilities.T;
                }
            }
            if (xml_parsing_utilities.NIL == v_char) {
                abortP = (SubLObject)xml_parsing_utilities.T;
            }
            else if (xml_parsing_utilities.NIL != within_commentP) {
                print_high.princ(v_char, token_output_stream);
                if (xml_parsing_utilities.NIL == string_utilities.ends_with(partial_tag_text, (SubLObject)xml_parsing_utilities.$str96$__, (SubLObject)xml_parsing_utilities.UNPROVIDED) || !v_char.eql((SubLObject)Characters.CHAR_greater)) {
                    continue;
                }
                open_bracket_stack = open_bracket_stack.rest();
            }
            else if (xml_parsing_utilities.NIL != within_cdataP) {
                print_high.princ(v_char, token_output_stream);
                if (xml_parsing_utilities.NIL == string_utilities.ends_with(partial_tag_text, (SubLObject)xml_parsing_utilities.$str97$__, (SubLObject)xml_parsing_utilities.UNPROVIDED) || !v_char.eql((SubLObject)Characters.CHAR_greater)) {
                    continue;
                }
                open_bracket_stack = open_bracket_stack.rest();
            }
            else if (v_char.eql(list_utilities.alist_lookup_without_values(bracket_alist, open_bracket_stack.first(), (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED))) {
                print_high.princ(v_char, token_output_stream);
                open_bracket_stack = open_bracket_stack.rest();
            }
            else if (xml_parsing_utilities.NIL != list_utilities.alist_lookup_without_values(bracket_alist, v_char, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED)) {
                print_high.princ(v_char, token_output_stream);
                open_bracket_stack = (SubLObject)ConsesLow.cons(v_char, open_bracket_stack);
            }
            else {
                Errors.error((SubLObject)xml_parsing_utilities.$str98$Mismatched_closing_bracket__S_fol, v_char, partial_tag_text, list_utilities.alist_lookup_without_values(bracket_alist, open_bracket_stack.first(), (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED));
            }
        }
        return (xml_parsing_utilities.NIL != abortP) ? Values.values(pretext, (SubLObject)xml_parsing_utilities.NIL) : Values.values(pretext, streams_high.get_output_stream_string(token_output_stream));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 30575L)
    public static SubLObject xml_doctype_tag_p(final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(token.isString() && xml_parsing_utilities.NIL != xml_token_element_nameP(token, (SubLObject)xml_parsing_utilities.$str99$_DOCTYPE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 30698L)
    public static SubLObject html_doctype_tag_p(final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != xml_doctype_tag_p(token) && xml_parsing_utilities.NIL != string_utilities.starts_with_by_test(token, (SubLObject)xml_parsing_utilities.$str100$__DOCTYPE_HTML_, Symbols.symbol_function((SubLObject)xml_parsing_utilities.EQUALP)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 30844L)
    public static SubLObject xml_processing_instruction_p(final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != string_utilities.starts_with(token, (SubLObject)xml_parsing_utilities.$str101$__) && xml_parsing_utilities.NIL != string_utilities.ends_with(token, (SubLObject)xml_parsing_utilities.$str102$__, (SubLObject)xml_parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 30967L)
    public static SubLObject entity_map_from_doctype_tag(final SubLObject token) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject chunks = string_utilities.string_tokenize(token, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_lbracket, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_rbracket, string_utilities.whitespace_chars())), (SubLObject)xml_parsing_utilities.NIL, (SubLObject)xml_parsing_utilities.NIL, (SubLObject)xml_parsing_utilities.T, (SubLObject)xml_parsing_utilities.NIL, (SubLObject)xml_parsing_utilities.$list103);
        SubLObject map = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject current;
        final SubLObject datum = current = chunks;
        SubLObject doctype = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject name = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject open_bracket = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject rest = (SubLObject)xml_parsing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_parsing_utilities.$list104);
        doctype = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_parsing_utilities.$list104);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_parsing_utilities.$list104);
        open_bracket = current.first();
        current = (rest = current.rest());
        if (xml_parsing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !doctype.equal((SubLObject)xml_parsing_utilities.$str105$__DOCTYPE)) {
            Errors.error((SubLObject)xml_parsing_utilities.$str106$Got__S_instead_of___DOCTYPE_, doctype);
        }
        if (open_bracket.equal((SubLObject)xml_parsing_utilities.$str107$_)) {
            SubLObject doneP = (SubLObject)xml_parsing_utilities.NIL;
            while (xml_parsing_utilities.NIL == doneP && xml_parsing_utilities.NIL == list_utilities.empty_list_p(rest)) {
                final SubLObject next_pos = Sequences.position((SubLObject)xml_parsing_utilities.$str108$__ENTITY, rest, Symbols.symbol_function((SubLObject)xml_parsing_utilities.EQUAL), (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED);
                if (xml_parsing_utilities.NIL == next_pos) {
                    doneP = (SubLObject)xml_parsing_utilities.T;
                }
                else if (xml_parsing_utilities.NIL != list_utilities.lengthG(rest, Numbers.add(next_pos, (SubLObject)xml_parsing_utilities.THREE_INTEGER), (SubLObject)xml_parsing_utilities.UNPROVIDED)) {
                    final SubLObject abbrev = Sequences.cconcatenate((SubLObject)xml_parsing_utilities.$str109$_, new SubLObject[] { ConsesLow.nth(Numbers.add(next_pos, (SubLObject)xml_parsing_utilities.ONE_INTEGER), rest), xml_parsing_utilities.$str110$_ });
                    final SubLObject raw_url_string = ConsesLow.nth(Numbers.add(next_pos, (SubLObject)xml_parsing_utilities.TWO_INTEGER), rest);
                    final SubLObject url_string = string_utilities.nchar_subst((SubLObject)Characters.CHAR_quotation, (SubLObject)Characters.CHAR_quote, raw_url_string);
                    final SubLObject expansion = reader.read_from_string(url_string, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED);
                    map = list_utilities.alist_enter(map, abbrev, expansion, (SubLObject)xml_parsing_utilities.UNPROVIDED);
                    rest = conses_high.nthcdr(Numbers.add(next_pos, (SubLObject)xml_parsing_utilities.THREE_INTEGER), rest);
                }
                else {
                    doneP = (SubLObject)xml_parsing_utilities.T;
                }
            }
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 31941L)
    public static SubLObject resolve_entity_references(final SubLObject token, final SubLObject entity_map) {
        final SubLObject ans = resolve_predefined_xml_entities(string_utilities.do_string_substitutions_robust(token, entity_map, Symbols.symbol_function((SubLObject)xml_parsing_utilities.EQUAL)));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 32202L)
    public static SubLObject resolve_predefined_xml_entities(SubLObject string) {
        SubLObject cdolist_list_var = xml_vars.$xml_predefined_entities$.getGlobalValue();
        SubLObject cons = (SubLObject)xml_parsing_utilities.NIL;
        cons = cdolist_list_var.first();
        while (xml_parsing_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject name = (SubLObject)xml_parsing_utilities.NIL;
            SubLObject code = (SubLObject)xml_parsing_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_parsing_utilities.$list111);
            name = current.first();
            current = (code = current.rest());
            if (xml_parsing_utilities.NIL != Sequences.search(name, string, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED)) {
                string = string_utilities.string_substitute(Strings.make_string((SubLObject)xml_parsing_utilities.ONE_INTEGER, Characters.code_char(code)), Sequences.cconcatenate((SubLObject)xml_parsing_utilities.$str109$_, new SubLObject[] { format_nil.format_nil_a_no_copy(name), xml_parsing_utilities.$str110$_ }), string, (SubLObject)xml_parsing_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 32466L)
    public static SubLObject remove_xml_comments(final SubLObject xml_string) {
        final SubLObject xml_tokens = xml_string_tokenize(xml_string, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        SubLObject result = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject s = (SubLObject)xml_parsing_utilities.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            SubLObject cdolist_list_var = xml_tokens;
            SubLObject token = (SubLObject)xml_parsing_utilities.NIL;
            token = cdolist_list_var.first();
            while (xml_parsing_utilities.NIL != cdolist_list_var) {
                if (xml_parsing_utilities.NIL == xml_comment_p(token)) {
                    print_high.princ(token, s);
                }
                cdolist_list_var = cdolist_list_var.rest();
                token = cdolist_list_var.first();
            }
            result = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)xml_parsing_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)xml_parsing_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 32983L)
    public static SubLObject parse_xml_token(final SubLObject token) {
        return parse_xml_token_int(token, (SubLObject)xml_parsing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 33063L)
    public static SubLObject parse_html_token(final SubLObject token) {
        return parse_xml_token_int(token, (SubLObject)xml_parsing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 33240L)
    public static SubLObject parse_xml_token_int_internal(final SubLObject token, SubLObject strictP) {
        if (strictP == xml_parsing_utilities.UNPROVIDED) {
            strictP = (SubLObject)xml_parsing_utilities.T;
        }
        final SubLObject space_pos = Sequences.position_if((SubLObject)xml_parsing_utilities.$sym113$WHITESPACEP, token, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        final SubLObject token_length = Sequences.length(token);
        final SubLObject contents_end = (xml_parsing_utilities.NIL != xml_empty_tagP(token) || xml_parsing_utilities.NIL != xml_declaration_p(token)) ? Numbers.subtract(token_length, (SubLObject)xml_parsing_utilities.TWO_INTEGER) : Numbers.subtract(token_length, (SubLObject)xml_parsing_utilities.ONE_INTEGER);
        SubLObject v_answer = (SubLObject)ConsesLow.list(xml_token_element_name(token));
        SubLObject read_keyP = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject found_equal_signP = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject quote_char = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject key_start = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject key_end = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject value_start = (SubLObject)xml_parsing_utilities.NIL;
        SubLObject value_end = (SubLObject)xml_parsing_utilities.NIL;
        if (xml_parsing_utilities.NIL != space_pos) {
            SubLObject end_var_$21;
            SubLObject end_var;
            SubLObject i;
            SubLObject c;
            SubLObject done_with_keyP;
            SubLObject pcase_var;
            SubLObject pair;
            for (end_var = (end_var_$21 = ((xml_parsing_utilities.NIL != contents_end) ? contents_end : Sequences.length(token))), i = (SubLObject)xml_parsing_utilities.NIL, i = number_utilities.f_1X(space_pos); !i.numGE(end_var_$21); i = number_utilities.f_1X(i)) {
                c = Strings.sublisp_char(token, i);
                done_with_keyP = (SubLObject)xml_parsing_utilities.NIL;
                if (xml_parsing_utilities.NIL != read_keyP) {
                    if (xml_parsing_utilities.NIL != quote_char) {
                        if (c.eql(quote_char)) {
                            quote_char = (SubLObject)xml_parsing_utilities.NIL;
                            if (xml_parsing_utilities.NIL == value_start) {
                                value_start = i;
                            }
                            value_end = number_utilities.f_1_(i);
                            done_with_keyP = (SubLObject)xml_parsing_utilities.T;
                            read_keyP = (SubLObject)xml_parsing_utilities.NIL;
                        }
                        else if (quote_char.eql((SubLObject)Characters.CHAR_null) && (c.eql((SubLObject)Characters.CHAR_greater) || xml_parsing_utilities.NIL != string_utilities.whitespacep(c) || number_utilities.f_1X(i).eql(contents_end))) {
                            quote_char = (SubLObject)xml_parsing_utilities.NIL;
                            value_end = ((xml_parsing_utilities.NIL != string_utilities.whitespacep(c)) ? Numbers.subtract(i, (SubLObject)xml_parsing_utilities.ONE_INTEGER) : i);
                            done_with_keyP = (SubLObject)xml_parsing_utilities.T;
                            read_keyP = (SubLObject)xml_parsing_utilities.NIL;
                        }
                        else if (xml_parsing_utilities.NIL == value_start) {
                            value_start = (quote_char.eql((SubLObject)Characters.CHAR_null) ? Numbers.subtract(i, (SubLObject)xml_parsing_utilities.ONE_INTEGER) : i);
                        }
                    }
                    else {
                        pcase_var = c;
                        if (pcase_var.eql((SubLObject)Characters.CHAR_quotation) || pcase_var.eql((SubLObject)Characters.CHAR_quote)) {
                            if (xml_parsing_utilities.NIL == found_equal_signP) {
                                Errors.error((SubLObject)xml_parsing_utilities.$str114$XML_syntax_error__No___before__S, string_utilities.substring(token, i, (SubLObject)xml_parsing_utilities.UNPROVIDED));
                            }
                            quote_char = c;
                        }
                        else if (pcase_var.eql((SubLObject)Characters.CHAR_equal)) {
                            found_equal_signP = (SubLObject)xml_parsing_utilities.T;
                        }
                        else if (xml_parsing_utilities.NIL == string_utilities.whitespacep(c)) {
                            if (xml_parsing_utilities.NIL != strictP) {
                                Errors.error((SubLObject)xml_parsing_utilities.$str115$XML_syntax_error__Value_starting_, string_utilities.substring(token, i, (SubLObject)xml_parsing_utilities.UNPROVIDED));
                            }
                            else {
                                quote_char = (SubLObject)Characters.CHAR_null;
                            }
                        }
                    }
                }
                else {
                    pcase_var = c;
                    if (pcase_var.eql((SubLObject)Characters.CHAR_space) || pcase_var.eql((SubLObject)Characters.CHAR_tab) || pcase_var.eql((SubLObject)Characters.CHAR_return) || pcase_var.eql((SubLObject)Characters.CHAR_newline) || pcase_var.eql((SubLObject)Characters.CHAR_equal)) {
                        if (Characters.CHAR_equal.eql(c)) {
                            found_equal_signP = (SubLObject)xml_parsing_utilities.T;
                        }
                        if (xml_parsing_utilities.NIL != key_start) {
                            read_keyP = (SubLObject)xml_parsing_utilities.T;
                            key_end = number_utilities.f_1_(i);
                        }
                    }
                    else if (xml_parsing_utilities.NIL != key_start) {
                        key_end = i;
                    }
                    else {
                        key_start = i;
                    }
                }
                if (xml_parsing_utilities.NIL != key_start && xml_parsing_utilities.NIL != done_with_keyP) {
                    pair = xml_attribute_value_pair_from_token(token, key_start, key_end, value_start, value_end);
                    v_answer = (SubLObject)ConsesLow.cons(pair, v_answer);
                    key_start = (SubLObject)xml_parsing_utilities.NIL;
                    key_end = (SubLObject)xml_parsing_utilities.NIL;
                    value_start = (SubLObject)xml_parsing_utilities.NIL;
                    value_end = (SubLObject)xml_parsing_utilities.NIL;
                    found_equal_signP = (SubLObject)xml_parsing_utilities.NIL;
                }
            }
        }
        if (xml_parsing_utilities.NIL != key_start) {
            final SubLObject pair2 = xml_attribute_value_pair_from_token(token, key_start, key_end, value_start, value_end);
            v_answer = (SubLObject)ConsesLow.cons(pair2, v_answer);
        }
        return Sequences.nreverse(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 33240L)
    public static SubLObject parse_xml_token_int(final SubLObject token, SubLObject strictP) {
        if (strictP == xml_parsing_utilities.UNPROVIDED) {
            strictP = (SubLObject)xml_parsing_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)xml_parsing_utilities.NIL;
        if (xml_parsing_utilities.NIL == v_memoization_state) {
            return parse_xml_token_int_internal(token, strictP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)xml_parsing_utilities.$sym112$PARSE_XML_TOKEN_INT, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        if (xml_parsing_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)xml_parsing_utilities.$sym112$PARSE_XML_TOKEN_INT, (SubLObject)xml_parsing_utilities.TWO_INTEGER, (SubLObject)xml_parsing_utilities.NIL, (SubLObject)xml_parsing_utilities.EQUAL, (SubLObject)xml_parsing_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)xml_parsing_utilities.$sym112$PARSE_XML_TOKEN_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(token, strictP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)xml_parsing_utilities.NIL;
            collision = cdolist_list_var.first();
            while (xml_parsing_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (token.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (xml_parsing_utilities.NIL != cached_args && xml_parsing_utilities.NIL == cached_args.rest() && strictP.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(parse_xml_token_int_internal(token, strictP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(token, strictP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 35942L)
    public static SubLObject xml_attribute_value_pair_from_token(final SubLObject token, final SubLObject attribute_name_start, final SubLObject attribute_name_end, final SubLObject value_start, final SubLObject value_end) {
        final SubLObject attribute_name = unicode_strings.html_escaped_to_utf8_string(string_utilities.substring(token, attribute_name_start, number_utilities.f_1X(attribute_name_end)));
        final SubLObject value = (SubLObject)((xml_parsing_utilities.NIL != value_start) ? unicode_strings.html_escaped_to_utf8_string(string_utilities.substring(token, value_start, number_utilities.f_1X(value_end))) : xml_parsing_utilities.NIL);
        assert xml_parsing_utilities.NIL != xml_utilities.valid_xml_name_p(attribute_name) : attribute_name;
        return (SubLObject)ConsesLow.cons(attribute_name, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 36379L)
    public static SubLObject xml_tagP(final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(token.isString() && xml_parsing_utilities.NIL != list_utilities.lengthGE(token, (SubLObject)xml_parsing_utilities.THREE_INTEGER, (SubLObject)xml_parsing_utilities.UNPROVIDED) && Characters.CHAR_less.eql(string_utilities.first_char(token)) && Characters.CHAR_greater.eql(string_utilities.last_char(token)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 36632L)
    public static SubLObject regular_xml_tagP(final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != xml_tagP(token) && xml_parsing_utilities.NIL == xml_declaration_p(token) && xml_parsing_utilities.NIL == xml_doctype_tag_p(token) && xml_parsing_utilities.NIL == xml_comment_p(token));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 36937L)
    public static SubLObject xml_empty_tagP(final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != xml_tagP(token) && Characters.CHAR_slash.eql(string_utilities.char_from_end(token, (SubLObject)xml_parsing_utilities.ONE_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 37159L)
    public static SubLObject xml_cdata_tagP(final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != xml_tagP(token) && xml_parsing_utilities.NIL != string_utilities.starts_with_by_test(token, xml_utilities.xml_cdata_prefix(), Symbols.symbol_function((SubLObject)xml_parsing_utilities.EQUAL)) && xml_parsing_utilities.NIL != string_utilities.ends_with(token, xml_utilities.xml_cdata_suffix(), Symbols.symbol_function((SubLObject)xml_parsing_utilities.EQUAL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 37467L)
    public static SubLObject xml_cdata_tag_text(final SubLObject tag) {
        assert xml_parsing_utilities.NIL != xml_cdata_tagP(tag) : tag;
        return string_utilities.substring(tag, Sequences.length(xml_utilities.xml_cdata_prefix()), Numbers.subtract(Sequences.length(tag), Sequences.length(xml_utilities.xml_cdata_suffix())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 37647L)
    public static SubLObject xml_closing_tokenP(final SubLObject element_name, final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != xml_tagP(token) && xml_parsing_utilities.NIL != xml_closing_tag_p(token) && xml_parsing_utilities.NIL != xml_token_element_nameP(token, element_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 37968L)
    public static SubLObject xml_opening_tokenP(final SubLObject element_name, final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != xml_tagP(token) && xml_parsing_utilities.NIL != xml_opening_tag_p(token) && xml_parsing_utilities.NIL != xml_token_element_nameP(token, element_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 38288L)
    public static SubLObject xml_token_element_nameP(final SubLObject token, final SubLObject element_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert xml_parsing_utilities.NIL != Types.stringp(token) : token;
        if (xml_parsing_utilities.NIL == xml_tagP(token)) {
            return (SubLObject)xml_parsing_utilities.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject element_name_start = xml_token_element_name_start_and_end(token);
        final SubLObject element_name_end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != list_utilities.lengthE(element_name, Numbers.subtract(element_name_end, element_name_start), (SubLObject)xml_parsing_utilities.UNPROVIDED) && xml_parsing_utilities.NIL != string_utilities.substring_matchP(token, element_name, element_name_start, (SubLObject)xml_parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 38681L)
    public static SubLObject xml_token_element_name(final SubLObject token) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (xml_parsing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !token.isString()) {
            Errors.error((SubLObject)xml_parsing_utilities.$str119$_S_is_not_an_XML_token, token);
        }
        if (xml_parsing_utilities.NIL == xml_tagP(token)) {
            return (SubLObject)xml_parsing_utilities.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject element_name_start = xml_token_element_name_start_and_end(token);
        final SubLObject element_name_end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return string_utilities.substring(token, element_name_start, element_name_end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 39372L)
    public static SubLObject xml_token_element_name_start_and_end(final SubLObject token) {
        final SubLObject element_name_start = (SubLObject)(Characters.CHAR_slash.eql(Strings.sublisp_char(token, (SubLObject)xml_parsing_utilities.ONE_INTEGER)) ? xml_parsing_utilities.TWO_INTEGER : xml_parsing_utilities.ONE_INTEGER);
        final SubLObject space_pos = Sequences.position_if((SubLObject)xml_parsing_utilities.$sym113$WHITESPACEP, token, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        final SubLObject token_length = Sequences.length(token);
        final SubLObject token_end = (xml_parsing_utilities.NIL != xml_empty_tagP(token)) ? Numbers.subtract(token_length, (SubLObject)xml_parsing_utilities.TWO_INTEGER) : Numbers.subtract(token_length, (SubLObject)xml_parsing_utilities.ONE_INTEGER);
        final SubLObject element_name_end = (xml_parsing_utilities.NIL != space_pos) ? space_pos : token_end;
        return Values.values(element_name_start, element_name_end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 39777L)
    public static SubLObject xml_tokens_to_sexpr(final SubLObject tokens) {
        final SubLObject iterator = iteration.new_list_iterator(tokens);
        final SubLObject sexpr = xml_token_iterator_to_sexpr(iterator, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        SubLObject remaining = (SubLObject)xml_parsing_utilities.NIL;
        while (xml_parsing_utilities.NIL == iteration.iteration_done(iterator)) {
            remaining = (SubLObject)ConsesLow.cons(iteration.iteration_next(iterator), remaining);
        }
        iteration.iteration_finalize(iterator);
        return Values.values(sexpr, Sequences.nreverse(remaining));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 40681L)
    public static SubLObject xml_token_iterator_to_sexpr(final SubLObject token_iterator, SubLObject first_token) {
        if (first_token == xml_parsing_utilities.UNPROVIDED) {
            first_token = (SubLObject)xml_parsing_utilities.NIL;
        }
        final SubLObject iteration_doneP = iteration.iteration_done(token_iterator);
        if (xml_parsing_utilities.NIL == first_token && xml_parsing_utilities.NIL == iteration_doneP) {
            first_token = iteration.iteration_next(token_iterator);
        }
        if (xml_parsing_utilities.NIL != iteration_doneP) {
            return (SubLObject)xml_parsing_utilities.NIL;
        }
        if (xml_parsing_utilities.NIL != xml_empty_tagP(first_token)) {
            return (SubLObject)ConsesLow.list(parse_xml_token(first_token));
        }
        if (xml_parsing_utilities.NIL != xml_cdata_tagP(first_token)) {
            return xml_cdata_tag_text(first_token);
        }
        if (xml_parsing_utilities.NIL == xml_tagP(first_token)) {
            return first_token;
        }
        return xml_token_iterator_to_sexpr_internal(token_iterator, first_token);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 41903L)
    public static SubLObject xml_token_iterator_to_sexpr_internal(final SubLObject token_iterator, final SubLObject first_token) {
        if (xml_parsing_utilities.NIL != non_content_xml_token_p(first_token)) {
            return xml_token_iterator_to_sexpr(token_iterator, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        }
        final SubLObject head = parse_xml_token(first_token);
        SubLObject sexpr = (SubLObject)ConsesLow.list(head);
        SubLObject next_token;
        for (next_token = (SubLObject)((xml_parsing_utilities.NIL != iteration.iteration_done(token_iterator)) ? xml_parsing_utilities.NIL : iteration.iteration_next(token_iterator)); xml_parsing_utilities.NIL != non_content_xml_token_p(next_token); next_token = (SubLObject)((xml_parsing_utilities.NIL != iteration.iteration_done(token_iterator)) ? xml_parsing_utilities.NIL : iteration.iteration_next(token_iterator))) {}
        while (xml_parsing_utilities.NIL == iteration.iteration_done(token_iterator)) {
            if (xml_parsing_utilities.NIL != xml_closing_tokenP(head.first(), next_token)) {
                return Sequences.reverse(sexpr);
            }
            final SubLObject subexpr = xml_token_iterator_to_sexpr(token_iterator, next_token);
            if (subexpr.isString()) {
                if (sexpr.first().isString()) {
                    final SubLObject old_value = sexpr.first();
                    final SubLObject new_value = Sequences.cconcatenate(old_value, subexpr);
                    sexpr = sexpr.rest();
                    sexpr = (SubLObject)ConsesLow.cons(new_value, sexpr);
                }
                else if (!xml_parsing_utilities.$str120$.equal(string_utilities.trim_whitespace(subexpr))) {
                    sexpr = (SubLObject)ConsesLow.cons(subexpr, sexpr);
                }
            }
            else {
                sexpr = (SubLObject)ConsesLow.cons(subexpr, sexpr);
            }
            next_token = (SubLObject)((xml_parsing_utilities.NIL != iteration.iteration_done(token_iterator)) ? xml_parsing_utilities.NIL : iteration.iteration_next(token_iterator));
        }
        return Sequences.reverse(sexpr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 43253L)
    public static SubLObject xml_tag_attribute_value(final SubLObject tag, final SubLObject attribute, SubLObject v_default) {
        if (v_default == xml_parsing_utilities.UNPROVIDED) {
            v_default = (SubLObject)xml_parsing_utilities.NIL;
        }
        assert xml_parsing_utilities.NIL != xml_tagP(tag) : tag;
        assert xml_parsing_utilities.NIL != Types.stringp(attribute) : attribute;
        final SubLObject attributes = parse_xml_token(tag).rest();
        return list_utilities.alist_lookup_without_values(attributes, attribute, Symbols.symbol_function((SubLObject)xml_parsing_utilities.$sym121$STRING_), v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 43523L)
    public static SubLObject non_content_xml_token_p(final SubLObject token) {
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != xml_declaration_p(token) || xml_parsing_utilities.NIL != xml_doctype_tag_p(token) || xml_parsing_utilities.NIL != xml_comment_p(token) || xml_parsing_utilities.NIL != xml_processing_instruction_p(token));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 43715L)
    public static SubLObject get_field_value_from_xml_sexpr(final SubLObject field, final SubLObject sexpr) {
        SubLObject cdolist_list_var = sexpr.rest();
        SubLObject child = (SubLObject)xml_parsing_utilities.NIL;
        child = cdolist_list_var.first();
        while (xml_parsing_utilities.NIL != cdolist_list_var) {
            if (child.first().first().equal(field)) {
                return conses_high.second(child);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        }
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 44279L)
    public static SubLObject xml_sexpr_tag(final SubLObject sexpr) {
        return sexpr.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 44402L)
    public static SubLObject xml_sexpr_type(final SubLObject sexpr) {
        return xml_sexpr_tag(sexpr).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 44520L)
    public static SubLObject xml_sexpr_daughter(final SubLObject sexpr, final SubLObject tag) {
        SubLObject cdolist_list_var = xml_sexpr_daughters(sexpr, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        SubLObject daughter = (SubLObject)xml_parsing_utilities.NIL;
        daughter = cdolist_list_var.first();
        while (xml_parsing_utilities.NIL != cdolist_list_var) {
            if (xml_parsing_utilities.NIL != Strings.stringE(xml_sexpr_type(daughter), tag, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED)) {
                return daughter;
            }
            cdolist_list_var = cdolist_list_var.rest();
            daughter = cdolist_list_var.first();
        }
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 44749L)
    public static SubLObject xml_sexpr_daughters(final SubLObject sexpr, SubLObject tag) {
        if (tag == xml_parsing_utilities.UNPROVIDED) {
            tag = (SubLObject)xml_parsing_utilities.NIL;
        }
        if (xml_parsing_utilities.NIL != tag) {
            SubLObject daughters = (SubLObject)xml_parsing_utilities.NIL;
            SubLObject cdolist_list_var = sexpr.rest();
            SubLObject daughter = (SubLObject)xml_parsing_utilities.NIL;
            daughter = cdolist_list_var.first();
            while (xml_parsing_utilities.NIL != cdolist_list_var) {
                if (daughter.isList() && xml_parsing_utilities.NIL != Strings.stringE(xml_sexpr_type(daughter), tag, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED, (SubLObject)xml_parsing_utilities.UNPROVIDED)) {
                    daughters = (SubLObject)ConsesLow.cons(daughter, daughters);
                }
                cdolist_list_var = cdolist_list_var.rest();
                daughter = cdolist_list_var.first();
            }
            return Sequences.nreverse(daughters);
        }
        return sexpr.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 45105L)
    public static SubLObject xml_sexpr_attributes(final SubLObject sexpr) {
        return xml_sexpr_tag(sexpr).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 45240L)
    public static SubLObject xml_sexpr_attribute_value(final SubLObject sexpr, final SubLObject attribute) {
        return conses_high.assoc(attribute, xml_sexpr_attributes(sexpr), (SubLObject)xml_parsing_utilities.$sym121$STRING_, (SubLObject)xml_parsing_utilities.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 45433L)
    public static SubLObject xml_sexpr_set_attribute(final SubLObject sexpr, final SubLObject key, final SubLObject value) {
        final SubLObject attributes = list_utilities.alist_enter(xml_sexpr_attributes(sexpr), key, value, Symbols.symbol_function((SubLObject)xml_parsing_utilities.$sym121$STRING_));
        ConsesLow.rplacd(xml_sexpr_tag(sexpr), attributes);
        return sexpr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 45739L)
    public static SubLObject xml_sexpr_atomic_p(final SubLObject sexpr) {
        return list_utilities.empty_list_p(xml_sexpr_daughters(sexpr, (SubLObject)xml_parsing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 45837L)
    public static SubLObject xml_sexpr_wXsingle_valueP(final SubLObject sexpr) {
        final SubLObject dtrs = xml_sexpr_daughters(sexpr, (SubLObject)xml_parsing_utilities.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(xml_parsing_utilities.NIL != list_utilities.singletonP(dtrs) && dtrs.first().isString());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 46073L)
    public static SubLObject xml_sexpr_value(final SubLObject sexpr) {
        return xml_sexpr_daughters(sexpr, (SubLObject)xml_parsing_utilities.UNPROVIDED).first();
    }
    
    public static SubLObject declare_xml_parsing_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_tokenize", "XML-TOKENIZE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "new_xml_token_iterator", "NEW-XML-TOKEN-ITERATOR", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_print_function_trampoline", "XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_p", "XML-TOKEN-ITERATOR-STATE-P", 1, 0, false);
        new $xml_token_iterator_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_it_state_in_stream", "XML-IT-STATE-IN-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_it_state_scratch_stream", "XML-IT-STATE-SCRATCH-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_it_state_token_output_stream", "XML-IT-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_it_state_entity_map", "XML-IT-STATE-ENTITY-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_it_state_namespace_stack", "XML-IT-STATE-NAMESPACE-STACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_it_state_validateP", "XML-IT-STATE-VALIDATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_it_state_resolve_entity_referencesP", "XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_it_state_resolve_namespacesP", "XML-IT-STATE-RESOLVE-NAMESPACES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_it_state_on_deck_queue", "XML-IT-STATE-ON-DECK-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "_csetf_xml_it_state_in_stream", "_CSETF-XML-IT-STATE-IN-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "_csetf_xml_it_state_scratch_stream", "_CSETF-XML-IT-STATE-SCRATCH-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "_csetf_xml_it_state_token_output_stream", "_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "_csetf_xml_it_state_entity_map", "_CSETF-XML-IT-STATE-ENTITY-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "_csetf_xml_it_state_namespace_stack", "_CSETF-XML-IT-STATE-NAMESPACE-STACK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "_csetf_xml_it_state_validateP", "_CSETF-XML-IT-STATE-VALIDATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "_csetf_xml_it_state_resolve_entity_referencesP", "_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "_csetf_xml_it_state_resolve_namespacesP", "_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "_csetf_xml_it_state_on_deck_queue", "_CSETF-XML-IT-STATE-ON-DECK-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "make_xml_token_iterator_state", "MAKE-XML-TOKEN-ITERATOR-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "visit_defstruct_xml_token_iterator_state", "VISIT-DEFSTRUCT-XML-TOKEN-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "visit_defstruct_object_xml_token_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-XML-TOKEN-ITERATOR-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "print_xml_token_iterator_state", "PRINT-XML-TOKEN-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "new_xml_token_iterator_state", "NEW-XML-TOKEN-ITERATOR-STATE", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_in_stream", "XML-TOKEN-ITERATOR-STATE-IN-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_scratch_stream", "XML-TOKEN-ITERATOR-STATE-SCRATCH-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_token_output_stream", "XML-TOKEN-ITERATOR-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_entity_map", "XML-TOKEN-ITERATOR-STATE-ENTITY-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_namespace_stack", "XML-TOKEN-ITERATOR-STATE-NAMESPACE-STACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_validateP", "XML-TOKEN-ITERATOR-STATE-VALIDATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_resolve_entity_referencesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_resolve_namespacesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-NAMESPACES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_on_deck_queue", "XML-TOKEN-ITERATOR-STATE-ON-DECK-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_state_peek", "XML-TOKEN-ITERATOR-STATE-PEEK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "advance_xml_token_iterator_to_next_element", "ADVANCE-XML-TOKEN-ITERATOR-TO-NEXT-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_progress", "XML-TOKEN-ITERATOR-PROGRESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "make_iterator_xml_token_state", "MAKE-ITERATOR-XML-TOKEN-STATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "iterate_xml_token_done", "ITERATE-XML-TOKEN-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "iterate_xml_token_next", "ITERATE-XML-TOKEN-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "ensure_xml_token_on_deck_queue_populated", "ENSURE-XML-TOKEN-ON-DECK-QUEUE-POPULATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_iterator_state_handle_namespaces_and_entities", "XML-ITERATOR-STATE-HANDLE-NAMESPACES-AND-ENTITIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "handle_xml_namespaces", "HANDLE-XML-NAMESPACES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_namespace_mapping_p", "XML-NAMESPACE-MAPPING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "validate_xml_namespaces", "VALIDATE-XML-NAMESPACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "maybe_validate_xml_namespace", "MAYBE-VALIDATE-XML-NAMESPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "validate_xml_namespace", "VALIDATE-XML-NAMESPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_prefixed_name_p", "XML-PREFIXED-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_prefixed_name_namespace", "XML-PREFIXED-NAME-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_prefixed_name_local_name", "XML-PREFIXED-NAME-LOCAL-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_string_tokenize", "XML-STRING-TOKENIZE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_tokenized_http_request", "XML-TOKENIZED-HTTP-REQUEST", 2, 9, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_tokenized_http_request_internal", "XML-TOKENIZED-HTTP-REQUEST-INTERNAL", 9, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.xml_parsing_utilities", "html_tokenize", "HTML-TOKENIZE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_matches_exactly", "XML-TOKEN-MATCHES-EXACTLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_matches", "XML-TOKEN-MATCHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_starts_with", "XML-TOKEN-STARTS-WITH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_mentions", "XML-TOKEN-MENTIONS", 2, 0, false);
        new $xml_token_mentions$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "next_xml_token_position", "NEXT-XML-TOKEN-POSITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "next_xml_token_position_if", "NEXT-XML-TOKEN-POSITION-IF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "next_xml_token_position_if_not", "NEXT-XML-TOKEN-POSITION-IF-NOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "advance_xml_tokens", "ADVANCE-XML-TOKENS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "advance_xml_tokens_to", "ADVANCE-XML-TOKENS-TO", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_extract_token_sequence", "XML-EXTRACT-TOKEN-SEQUENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "accumulate_xml_token", "ACCUMULATE-XML-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "accumulate_xml_tokens", "ACCUMULATE-XML-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "accumulated_xml_tokens", "ACCUMULATED-XML-TOKENS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_tokens_for_next_element", "XML-TOKENS-FOR-NEXT-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "advance_xml_tokens_to_end_of_element", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "advance_xml_tokens_to_end_of_element_int", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_declaration_p", "XML-DECLARATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_comment_p", "XML-COMMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_closing_tag_p", "XML-CLOSING-TAG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_opening_tag_p", "XML-OPENING-TAG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "advance_xml_tokens_without_crossing", "ADVANCE-XML-TOKENS-WITHOUT-CROSSING", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "advance_xml_tokens_without_crossing_or_quit", "ADVANCE-XML-TOKENS-WITHOUT-CROSSING-OR-QUIT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_read", "XML-READ", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_doctype_tag_p", "XML-DOCTYPE-TAG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "html_doctype_tag_p", "HTML-DOCTYPE-TAG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_processing_instruction_p", "XML-PROCESSING-INSTRUCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "entity_map_from_doctype_tag", "ENTITY-MAP-FROM-DOCTYPE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "resolve_entity_references", "RESOLVE-ENTITY-REFERENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "resolve_predefined_xml_entities", "RESOLVE-PREDEFINED-XML-ENTITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "remove_xml_comments", "REMOVE-XML-COMMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "parse_xml_token", "PARSE-XML-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "parse_html_token", "PARSE-HTML-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "parse_xml_token_int_internal", "PARSE-XML-TOKEN-INT-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "parse_xml_token_int", "PARSE-XML-TOKEN-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_attribute_value_pair_from_token", "XML-ATTRIBUTE-VALUE-PAIR-FROM-TOKEN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_tagP", "XML-TAG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "regular_xml_tagP", "REGULAR-XML-TAG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_empty_tagP", "XML-EMPTY-TAG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_cdata_tagP", "XML-CDATA-TAG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_cdata_tag_text", "XML-CDATA-TAG-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_closing_tokenP", "XML-CLOSING-TOKEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_opening_tokenP", "XML-OPENING-TOKEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_element_nameP", "XML-TOKEN-ELEMENT-NAME?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_element_name", "XML-TOKEN-ELEMENT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_element_name_start_and_end", "XML-TOKEN-ELEMENT-NAME-START-AND-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_tokens_to_sexpr", "XML-TOKENS-TO-SEXPR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_to_sexpr", "XML-TOKEN-ITERATOR-TO-SEXPR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_token_iterator_to_sexpr_internal", "XML-TOKEN-ITERATOR-TO-SEXPR-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_tag_attribute_value", "XML-TAG-ATTRIBUTE-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "non_content_xml_token_p", "NON-CONTENT-XML-TOKEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "get_field_value_from_xml_sexpr", "GET-FIELD-VALUE-FROM-XML-SEXPR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_sexpr_tag", "XML-SEXPR-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_sexpr_type", "XML-SEXPR-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_sexpr_daughter", "XML-SEXPR-DAUGHTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_sexpr_daughters", "XML-SEXPR-DAUGHTERS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_sexpr_attributes", "XML-SEXPR-ATTRIBUTES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_sexpr_attribute_value", "XML-SEXPR-ATTRIBUTE-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_sexpr_set_attribute", "XML-SEXPR-SET-ATTRIBUTE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_sexpr_atomic_p", "XML-SEXPR-ATOMIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_sexpr_wXsingle_valueP", "XML-SEXPR-W/SINGLE-VALUE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_parsing_utilities", "xml_sexpr_value", "XML-SEXPR-VALUE", 1, 0, false);
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    public static SubLObject init_xml_parsing_utilities_file() {
        xml_parsing_utilities.$require_valid_xmlP$ = SubLFiles.defparameter("*REQUIRE-VALID-XML?*", (SubLObject)xml_parsing_utilities.NIL);
        xml_parsing_utilities.$dtp_xml_token_iterator_state$ = SubLFiles.defconstant("*DTP-XML-TOKEN-ITERATOR-STATE*", (SubLObject)xml_parsing_utilities.$sym3$XML_TOKEN_ITERATOR_STATE);
        xml_parsing_utilities.$xml_token_accumulator$ = SubLFiles.defparameter("*XML-TOKEN-ACCUMULATOR*", misc_utilities.uninitialized());
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    public static SubLObject setup_xml_parsing_utilities_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), xml_parsing_utilities.$dtp_xml_token_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)xml_parsing_utilities.$sym10$XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)xml_parsing_utilities.$list11);
        Structures.def_csetf((SubLObject)xml_parsing_utilities.$sym12$XML_IT_STATE_IN_STREAM, (SubLObject)xml_parsing_utilities.$sym13$_CSETF_XML_IT_STATE_IN_STREAM);
        Structures.def_csetf((SubLObject)xml_parsing_utilities.$sym14$XML_IT_STATE_SCRATCH_STREAM, (SubLObject)xml_parsing_utilities.$sym15$_CSETF_XML_IT_STATE_SCRATCH_STREAM);
        Structures.def_csetf((SubLObject)xml_parsing_utilities.$sym16$XML_IT_STATE_TOKEN_OUTPUT_STREAM, (SubLObject)xml_parsing_utilities.$sym17$_CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM);
        Structures.def_csetf((SubLObject)xml_parsing_utilities.$sym18$XML_IT_STATE_ENTITY_MAP, (SubLObject)xml_parsing_utilities.$sym19$_CSETF_XML_IT_STATE_ENTITY_MAP);
        Structures.def_csetf((SubLObject)xml_parsing_utilities.$sym20$XML_IT_STATE_NAMESPACE_STACK, (SubLObject)xml_parsing_utilities.$sym21$_CSETF_XML_IT_STATE_NAMESPACE_STACK);
        Structures.def_csetf((SubLObject)xml_parsing_utilities.$sym22$XML_IT_STATE_VALIDATE_, (SubLObject)xml_parsing_utilities.$sym23$_CSETF_XML_IT_STATE_VALIDATE_);
        Structures.def_csetf((SubLObject)xml_parsing_utilities.$sym24$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_, (SubLObject)xml_parsing_utilities.$sym25$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_);
        Structures.def_csetf((SubLObject)xml_parsing_utilities.$sym26$XML_IT_STATE_RESOLVE_NAMESPACES_, (SubLObject)xml_parsing_utilities.$sym27$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_);
        Structures.def_csetf((SubLObject)xml_parsing_utilities.$sym28$XML_IT_STATE_ON_DECK_QUEUE, (SubLObject)xml_parsing_utilities.$sym29$_CSETF_XML_IT_STATE_ON_DECK_QUEUE);
        Equality.identity((SubLObject)xml_parsing_utilities.$sym3$XML_TOKEN_ITERATOR_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), xml_parsing_utilities.$dtp_xml_token_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)xml_parsing_utilities.$sym44$VISIT_DEFSTRUCT_OBJECT_XML_TOKEN_ITERATOR_STATE_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)xml_parsing_utilities.$sym9$PRINT_XML_TOKEN_ITERATOR_STATE);
        utilities_macros.note_funcall_helper_function((SubLObject)xml_parsing_utilities.$sym1$ITERATE_XML_TOKEN_DONE);
        utilities_macros.note_funcall_helper_function((SubLObject)xml_parsing_utilities.$sym2$ITERATE_XML_TOKEN_NEXT);
        access_macros.register_external_symbol((SubLObject)xml_parsing_utilities.$sym56$XML_TOKENIZED_HTTP_REQUEST);
        memoization_state.note_memoized_function((SubLObject)xml_parsing_utilities.$sym112$PARSE_XML_TOKEN_INT);
        generic_testing.define_test_case_table_int((SubLObject)xml_parsing_utilities.$sym122$XML_TOKENS_TO_SEXPR, (SubLObject)ConsesLow.list(new SubLObject[] { xml_parsing_utilities.$kw123$TEST, xml_parsing_utilities.EQUAL, xml_parsing_utilities.$kw124$OWNER, xml_parsing_utilities.NIL, xml_parsing_utilities.$kw125$CLASSES, xml_parsing_utilities.NIL, xml_parsing_utilities.$kw126$KB, xml_parsing_utilities.$kw127$TINY, xml_parsing_utilities.$kw128$WORKING_, xml_parsing_utilities.T }), (SubLObject)xml_parsing_utilities.$list129);
        generic_testing.define_test_case_table_int((SubLObject)xml_parsing_utilities.$sym130$PARSE_HTML_TOKEN, (SubLObject)ConsesLow.list(new SubLObject[] { xml_parsing_utilities.$kw123$TEST, Symbols.symbol_function((SubLObject)xml_parsing_utilities.EQUAL), xml_parsing_utilities.$kw124$OWNER, xml_parsing_utilities.NIL, xml_parsing_utilities.$kw125$CLASSES, xml_parsing_utilities.NIL, xml_parsing_utilities.$kw126$KB, xml_parsing_utilities.$kw127$TINY, xml_parsing_utilities.$kw128$WORKING_, xml_parsing_utilities.T }), (SubLObject)xml_parsing_utilities.$list131);
        generic_testing.define_test_case_table_int((SubLObject)xml_parsing_utilities.$sym132$PARSE_XML_TOKEN, (SubLObject)ConsesLow.list(new SubLObject[] { xml_parsing_utilities.$kw123$TEST, Symbols.symbol_function((SubLObject)xml_parsing_utilities.EQUAL), xml_parsing_utilities.$kw124$OWNER, xml_parsing_utilities.NIL, xml_parsing_utilities.$kw125$CLASSES, xml_parsing_utilities.NIL, xml_parsing_utilities.$kw126$KB, xml_parsing_utilities.$kw127$TINY, xml_parsing_utilities.$kw128$WORKING_, xml_parsing_utilities.T }), xml_parsing_utilities.$list133);
        return (SubLObject)xml_parsing_utilities.NIL;
    }
    
    private static SubLObject _constant_133_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"MarineEcosystem\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("MarineEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"PackIce\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("PackIce")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SubmarineCanyon\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SubmarineCanyon")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Ocean\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Ocean")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#SnowLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SnowLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Hydrosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Hydrosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Cryosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Cryosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SedimentLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SedimentLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Lake\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Lake")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"#ClimateZoneType\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#ClimateZoneType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Stratosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Stratosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Litter\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Litter")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Pond\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Pond")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LowerMantle\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LowerMantle")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#Catchment\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#Catchment")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#MantleLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#MantleLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"TroposphereLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("TroposphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"IntertidalZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("IntertidalZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Cirque\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Cirque")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"EcosystemType\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("EcosystemType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"PeriglacialLandform\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("PeriglacialLandform")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Mantle\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Mantle")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Hydrosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Hydrosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"TemperateClimateZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("TemperateClimateZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Fjord\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Fjord")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Ocean\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Ocean")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:domain rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:domain"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Felsic\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Felsic")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Beach\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Beach")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Core\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Core")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#Basin\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Basin")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Mesosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Mesosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Water\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Water")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Mesosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Mesosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Marsh\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Marsh")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/property.owl#Height\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/property.owl#Height")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/property.owl#Height\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/property.owl#Height")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SeaIceLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SeaIceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Geosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Geosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Glacier\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Glacier")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Watershed\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Watershed")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Shoreline\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Shoreline")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Crust\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Crust")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#haslowerBoundary\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#haslowerBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"RegionProperty\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("RegionProperty")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"MarineWetland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("MarineWetland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/property.owl\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:imports"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/property.owl")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasUpperBoundary\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasUpperBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#VadoseZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#VadoseZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerLowerBoundaryOf\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerLowerBoundaryOf")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"EstuarineWetland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("EstuarineWetland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Volcano\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Volcano")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Region\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Region")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#OceanRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#OceanRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Stream\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Stream")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#Ocean\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#Ocean")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Mantle\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Mantle")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#TerrestrialEcosystem\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#TerrestrialEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"WaterTable\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("WaterTable")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#TopographicalRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#TopographicalRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Spring\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Spring")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Tropopause\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Tropopause")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#Troposphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Troposphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"WaterSurfaceLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("WaterSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Layer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Layer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"#EcosystemType\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#EcosystemType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#inside\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#inside")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfIce\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#BodyOfIce")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#GeometricalObject\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#GeometricalObject")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Plateau\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Plateau")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"AphoticZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("AphoticZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"IslandArc\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("IslandArc")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#SeaFloorWaterLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaFloorWaterLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#PlanetarySurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#PlanetarySurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SeaSurface\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SeaSurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"#primarySubstance\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#primarySubstance")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#Groundwater\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#Groundwater")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"FastIce\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("FastIce")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Swamp\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Swamp")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#LandWaterObject\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandWaterObject")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"PhoticZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("PhoticZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"#EarthRealm\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#EarthRealm")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LandIceLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LandIceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#OceanRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#OceanRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#EolianLandform\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#EolianLandform")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Rock_body\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Rock_body")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#SeaIceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaIceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Farmland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Farmland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#SeaFloorRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaFloorRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"#hasGeomorphologicalType\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#hasGeomorphologicalType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#SeaFloorGroundLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#SeaFloorGroundLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:someValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:someValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:someValuesFrom rdf:resource=\"#OceanRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:someValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#OceanRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#TerrestrialEcosystem\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#TerrestrialEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Sea\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Sea")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"KarstLandform\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("KarstLandform")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Troposphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Troposphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"AlpineClimateZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("AlpineClimateZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"GlacialLandform\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("GlacialLandform")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#GroundWaterObjectBoundary\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#GroundWaterObjectBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"BenticEcosystem\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("BenticEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Isopycnal\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Isopycnal")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"PlanetarySurface\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("PlanetarySurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#CoastalRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#CoastalRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#OceanRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#OceanRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#LandRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#LandRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#UndergroundWater\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#UndergroundWater")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Mafic\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Mafic")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Delta\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Delta")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SeaIce\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SeaIce")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Creek\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Creek")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LandRegion\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LandRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Thermosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Thermosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Ridge\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Ridge")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#SurfaceWater\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SurfaceWater")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#Floodplain\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#Floodplain")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SnowLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SnowLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"IceFloe\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("IceFloe")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"DryLandRegion\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("DryLandRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Aquifer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Aquifer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"MiddleAtmosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("MiddleAtmosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Biosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Biosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"PlanetaryStructure\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("PlanetaryStructure")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"CoralReef\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("CoralReef")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"ContinentalMargin\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("ContinentalMargin")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SurfaceWater\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SurfaceWater")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#EarthRealm\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#EarthRealm")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Estuary\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Estuary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"IceCore\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("IceCore")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Air\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Air")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"CrustLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("CrustLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#SeaFloorRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaFloorRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#LandSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SeaFloorRegion\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SeaFloorRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#MarineEcosystem\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#MarineEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Plain\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Plain")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#WaterSurface\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#WaterSurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Benthos\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Benthos")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#PlanetarySurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#PlanetarySurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#MarineEcosystem\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#MarineEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"MixedLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("MixedLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Stratosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Stratosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LandSurface\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LandSurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SolidEarth\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SolidEarth")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SoilLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SoilLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"HydrosphereLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("HydrosphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"EolianLandform\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("EolianLandform")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloor\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaFloor")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Benthic\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Benthic")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#PermafrostZone\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#PermafrostZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"TectonicLandform\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("TectonicLandform")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:ID=\"hasLowerBoundaryHeight\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("hasLowerBoundaryHeight")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Thermosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Thermosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:DatatypeProperty rdf:ID=\"hasLowerBoundaryReferenceHeight\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:DatatypeProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("hasLowerBoundaryReferenceHeight")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#CryosphereLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#CryosphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Mountain\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Mountain")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"CryosphereLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("CryosphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloorGroundLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaFloorGroundLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"TerrrestrialWetland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("TerrrestrialWetland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Region\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Region")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#TroposphereLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#TroposphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:someValuesFrom rdf:resource=\"#LandRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:someValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LandwaterSurfaceLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LandwaterSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#inside\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#inside")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#contains\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#contains")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"PalustrineWetland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("PalustrineWetland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"#SurfaceRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SurfaceRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Atmosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Atmosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"FreshwaterLake\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("FreshwaterLake")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"FluvialLandform\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("FluvialLandform")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"HydrothermalVents\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("HydrothermalVents")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Groundwater\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Groundwater")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#Basin\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#Basin")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SeaFloorGroundLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SeaFloorGroundLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Forest_Ecosystem\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Forest_Ecosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Bedrock\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Bedrock")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#LandRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LacustrineWetland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LacustrineWetland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"CostalLandform\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("CostalLandform")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"ClimateZoneType\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("ClimateZoneType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#TectonicLandform\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#TectonicLandform")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"TropicalClimateZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("TropicalClimateZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:ID=\"hasEcosystemType\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("hasEcosystemType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"#hasEcosystemType\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#hasEcosystemType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#PlanetarySurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#PlanetarySurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"GroundWaterObjectBoundary\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("GroundWaterObjectBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Lake\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Lake")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"RockGlacier\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("RockGlacier")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SubsurfaceWater\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SubsurfaceWater")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#LandwaterRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#LandwaterRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:domain rdf:resource=\"#EarthRealm\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:domain"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#EarthRealm")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#LithosphereLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LithosphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"MontaneForest\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("MontaneForest")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"CaveEcosystem\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("CaveEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Tundra_Ecosystem\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Tundra_Ecosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Dune\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Dune")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"DemersalEcosystem\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("DemersalEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#LandIceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandIceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"BarrierIsland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("BarrierIsland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Leads\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Leads")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#WaterSurface\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#WaterSurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfWater\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#BodyOfWater")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"MangroveForest\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("MangroveForest")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Grassland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Grassland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:ID=\"coveredBySubstance_temporary\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("coveredBySubstance_temporary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"UrbanLand\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("UrbanLand")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#LandSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Ionosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Ionosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"PelagicEcosystem\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("PelagicEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#SeaSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#Farmland\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Farmland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"#hasLowerBoundaryReferenceHeight\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#hasLowerBoundaryReferenceHeight")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"OceanLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("OceanLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#PlanetarySurface\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#PlanetarySurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Iceberg\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Iceberg")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Aeoliean\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Aeoliean")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#Geosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Geosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Isobar\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Isobar")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LandwaterRegion\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LandwaterRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:ID=\"hasClimateZoneType\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("hasClimateZoneType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SnowField\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SnowField")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"RiftValley\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("RiftValley")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#LakeLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LakeLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:disjointWith rdf:resource=\"#LandSurface\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:disjointWith"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandSurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#Dam\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#Dam")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Rock_body\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Rock_body")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Lagoon\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Lagoon")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#OceanLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#OceanLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfSeaIce\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#BodyOfSeaIce")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:imports"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Seamount\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Seamount")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Lithosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Lithosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#SeaSurface\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaSurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#MantleLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#MantleLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"IceLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("IceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SurfaceRegion\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SurfaceRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#double\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:hasValue"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:datatype"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#double")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Asthenosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Asthenosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#LandRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:ID=\"primarySubstance\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("primarySubstance")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Thermocline\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Thermocline")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Trench\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Trench")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#CrustLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#CrustLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Lithosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Lithosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"fiord\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("fiord")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Land\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Land")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"ArcticClimateZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("ArcticClimateZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SubtropicalClimateZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SubtropicalClimateZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Water\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Water")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SeaSurfaceLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SeaSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#Fjord\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Fjord")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Mesopause\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Mesopause")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#WaterSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#WaterSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"BodyOfGround\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("BodyOfGround")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"BodyOfSeaIce\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("BodyOfSeaIce")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"WaterChannel\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("WaterChannel")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Cryosol\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Cryosol")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SedimentaryStructure\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SedimentaryStructure")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"AtmosphereLayerBoundary\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("AtmosphereLayerBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"F-Region\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("F-Region")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Lake\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Lake")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Continent\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Continent")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"FractureZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("FractureZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#CrustLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#CrustLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"DepthHoarLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("DepthHoarLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"WaterSurface\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("WaterSurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Cave\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Cave")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LowerAtmosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LowerAtmosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Moho\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Moho")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#contains\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#contains")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Crust\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Crust")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Stream\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Stream")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Air\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Air")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"RiparianWetland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("RiparianWetland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:someValuesFrom rdf:resource=\"#LandwaterSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:someValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandwaterSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2002/07/owl#Thing")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#CoreLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#CoreLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Polynya\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Polynya")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"AtmosphereLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("AtmosphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#IceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#IceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"AbyssalPlain\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("AbyssalPlain")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"GeomorphologicalRegionType\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("GeomorphologicalRegionType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Geosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Geosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LandWaterSurface\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LandWaterSurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#CoastalRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#CoastalRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#HydrosphereLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#HydrosphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"GroundSurfaceLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("GroundSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#CaveEcosystem\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#CaveEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#GeosphereLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#GeosphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Soil\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Soil")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"AbyssalHill\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("AbyssalHill")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"RockyCoast\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("RockyCoast")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"DesertClimateZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("DesertClimateZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:domain rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:domain"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2002/07/owl#Thing")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Magnetosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Magnetosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#LandwaterSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandwaterSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#EarthRealm\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#EarthRealm")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Grassland\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Grassland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerUpperBoundaryOf\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:onProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerUpperBoundaryOf")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#SeaSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"OceanRidge\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("OceanRidge")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Atmosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Atmosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"GeosphereLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("GeosphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:domain rdf:resource=\"#SurfaceRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:domain"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SurfaceRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#CoastalRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#CoastalRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Body\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Body")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:ID=\"hasGeomorphologicalType\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("hasGeomorphologicalType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#AtmosphereLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#AtmosphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#Mesosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#Mesosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Land_WaterBoundary_2D\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Land_WaterBoundary_2D")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Forest_Ecosystem\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Forest_Ecosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"AgriculturalLands\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("AgriculturalLands")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:DatatypeProperty rdf:ID=\"hasUpperBoundaryReferenceHeight\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:DatatypeProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("hasUpperBoundaryReferenceHeight")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:imports"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Talik\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Talik")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Inlet\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Inlet")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Desert_Ecosystem\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Desert_Ecosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"InversionLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("InversionLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"OceanCrustLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("OceanCrustLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Shoal\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Shoal")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Wetland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Wetland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LithosphereLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LithosphereLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfGround\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#BodyOfGround")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#SubsurfaceRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#SubsurfaceRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"IceSheet\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("IceSheet")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Glacier\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Glacier")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#LandSurface\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandSurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Littoral\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Littoral")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isUpperBoundaryOf\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isUpperBoundaryOf")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#UndergroundWater\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#UndergroundWater")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SkinLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SkinLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLowerBoundaryOf\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLowerBoundaryOf")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"UpperMantle_flowing\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("UpperMantle_flowing")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#GlobalPlanetaryLayers\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#GlobalPlanetaryLayers")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#LandRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#WaterSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#WaterSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Savanna\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Savanna")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Basin\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Basin")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"OceanRegion\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("OceanRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"PlanetEarth\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("PlanetEarth")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"BoundaryLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("BoundaryLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Crust\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Crust")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#EcosystemType\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#EcosystemType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"ActiveLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("ActiveLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Layer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Layer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LandIce\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LandIce")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Wetland\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Wetland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LandSurfaceLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LandSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Trench\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Trench")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasRegionBoundary\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasRegionBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#RegionProperty\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#RegionProperty")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#ClimateZoneType\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#ClimateZoneType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"MantleLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("MantleLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#SeaIceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaIceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"River\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("River")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#LandWaterSurface\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandWaterSurface")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Troposphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Troposphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#LandWaterObject\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#LandWaterObject")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"TopographicalRegion\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("TopographicalRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#CoastalRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#CoastalRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Stratopause\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Stratopause")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"UpperAtmosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("UpperAtmosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"DeepOcean\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("DeepOcean")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"BorealForest\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("BorealForest")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Nearshore\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Nearshore")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"GlobalPlanetaryLayers\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("GlobalPlanetaryLayers")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"UpperAir\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("UpperAir")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Cryosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Cryosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LakeLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LakeLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Permafrost\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Permafrost")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloorWaterLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SeaFloorWaterLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"UpperMantle_rigid\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("UpperMantle_rigid")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"CoastalRegion\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("CoastalRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Ionosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Ionosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#Island\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Island")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#LandSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"PlanetarySurfaceLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("PlanetarySurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Exosphere\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Exosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#LandwaterSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#LandwaterSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Sky\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Sky")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:equivalentClass rdf:resource=\"#UpperMantle_flowing\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#UpperMantle_flowing")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2002/07/owl#Thing")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Peatland\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Peatland")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#LandSurfaceLayer\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#LandSurfaceLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#SurfaceRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#SurfaceRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"MediterraneanClimateZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("MediterraneanClimateZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#GeomorphologicalRegionType\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#GeomorphologicalRegionType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Island\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Island")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#LandwaterRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#LandwaterRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"#Stratosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("#Stratosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"BodyOfWater\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("BodyOfWater")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"EarthRealm\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("EarthRealm")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#WetlandRegion\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#WetlandRegion")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:imports"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SeaFloorWaterLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SeaFloorWaterLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Halocline\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Halocline")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:ObjectProperty rdf:ID=\"hasUpperBoundaryHeight\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:ObjectProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("hasUpperBoundaryHeight")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"TerrestrialEcosystem\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("TerrestrialEcosystem")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SalineLake\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SalineLake")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"WetlandRegion\" xmlns:rdf=\"http://rdf.com/\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("WetlandRegion")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xmlns:rdf"), (SubLObject)SubLObjectFactory.makeString("http://rdf.com/")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"CoreLayer\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("CoreLayer")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:subClassOf rdf:resource=\"#AtmosphereLayerBoundary\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#AtmosphereLayerBoundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"UndergroundWater\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("UndergroundWater")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"SeaFloor\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("SeaFloor")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"LandWaterObject\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("LandWaterObject")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Pycnocline\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Pycnocline")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdfs:range rdf:resource=\"#GeomorphologicalRegionType\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs:range"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#GeomorphologicalRegionType")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"BodyOfIce\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("BodyOfIce")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"PermafrostZone\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("PermafrostZone")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:allValuesFrom rdf:resource=\"#Atmosphere\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:allValuesFrom"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:resource"), (SubLObject)SubLObjectFactory.makeString("#Atmosphere")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Body\"/>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:about"), (SubLObject)SubLObjectFactory.makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Body")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\"\n        >")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:hasValue"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:datatype"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#boolean")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:hasValue rdf:datatype='http://www.w3.org/2001/XMLSchema#boolean'\n        >")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:hasValue"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:datatype"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#boolean")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:Class rdf:ID=\"Z\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:Class"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("Z")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:DatatypeProperty  rdf:ID= \"AbsoluteValueFn\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:DatatypeProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("AbsoluteValueFn")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<owl:DatatypeProperty  rdf:ID = \"AbsoluteValueFn\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl:DatatypeProperty"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf:ID"), (SubLObject)SubLObjectFactory.makeString("AbsoluteValueFn")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<rdf:RDF\n\nxmlns:rdf =\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n\nxmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n\n xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n\nxmlns     =\"http://reliant.teknowledge.com/DAML/SUMO.owl#\"\n\n>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdf:RDF"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xmlns:rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xmlns:rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xmlns:owl"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2002/07/owl#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xmlns"), (SubLObject)SubLObjectFactory.makeString("http://reliant.teknowledge.com/DAML/SUMO.owl#")))) });
    }
    
    public void declareFunctions() {
        declare_xml_parsing_utilities_file();
    }
    
    public void initializeVariables() {
        init_xml_parsing_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_xml_parsing_utilities_file();
    }
    
    static {
        me = (SubLFile)new xml_parsing_utilities();
        xml_parsing_utilities.$require_valid_xmlP$ = null;
        xml_parsing_utilities.$dtp_xml_token_iterator_state$ = null;
        xml_parsing_utilities.$xml_token_accumulator$ = null;
        $sym0$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $sym1$ITERATE_XML_TOKEN_DONE = SubLObjectFactory.makeSymbol("ITERATE-XML-TOKEN-DONE");
        $sym2$ITERATE_XML_TOKEN_NEXT = SubLObjectFactory.makeSymbol("ITERATE-XML-TOKEN-NEXT");
        $sym3$XML_TOKEN_ITERATOR_STATE = SubLObjectFactory.makeSymbol("XML-TOKEN-ITERATOR-STATE");
        $sym4$XML_TOKEN_ITERATOR_STATE_P = SubLObjectFactory.makeSymbol("XML-TOKEN-ITERATOR-STATE-P");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("IN-STREAM"), SubLObjectFactory.makeSymbol("SCRATCH-STREAM"), SubLObjectFactory.makeSymbol("TOKEN-OUTPUT-STREAM"), SubLObjectFactory.makeSymbol("ENTITY-MAP"), SubLObjectFactory.makeSymbol("NAMESPACE-STACK"), SubLObjectFactory.makeSymbol("VALIDATE?"), SubLObjectFactory.makeSymbol("RESOLVE-ENTITY-REFERENCES?"), SubLObjectFactory.makeSymbol("RESOLVE-NAMESPACES?"), SubLObjectFactory.makeSymbol("ON-DECK-QUEUE") });
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("IN-STREAM"), SubLObjectFactory.makeKeyword("SCRATCH-STREAM"), SubLObjectFactory.makeKeyword("TOKEN-OUTPUT-STREAM"), SubLObjectFactory.makeKeyword("ENTITY-MAP"), SubLObjectFactory.makeKeyword("NAMESPACE-STACK"), SubLObjectFactory.makeKeyword("VALIDATE?"), SubLObjectFactory.makeKeyword("RESOLVE-ENTITY-REFERENCES?"), SubLObjectFactory.makeKeyword("RESOLVE-NAMESPACES?"), SubLObjectFactory.makeKeyword("ON-DECK-QUEUE") });
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("XML-IT-STATE-IN-STREAM"), SubLObjectFactory.makeSymbol("XML-IT-STATE-SCRATCH-STREAM"), SubLObjectFactory.makeSymbol("XML-IT-STATE-TOKEN-OUTPUT-STREAM"), SubLObjectFactory.makeSymbol("XML-IT-STATE-ENTITY-MAP"), SubLObjectFactory.makeSymbol("XML-IT-STATE-NAMESPACE-STACK"), SubLObjectFactory.makeSymbol("XML-IT-STATE-VALIDATE?"), SubLObjectFactory.makeSymbol("XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?"), SubLObjectFactory.makeSymbol("XML-IT-STATE-RESOLVE-NAMESPACES?"), SubLObjectFactory.makeSymbol("XML-IT-STATE-ON-DECK-QUEUE") });
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-IN-STREAM"), SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-SCRATCH-STREAM"), SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM"), SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-ENTITY-MAP"), SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-NAMESPACE-STACK"), SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-VALIDATE?"), SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?"), SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?"), SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-ON-DECK-QUEUE") });
        $sym9$PRINT_XML_TOKEN_ITERATOR_STATE = SubLObjectFactory.makeSymbol("PRINT-XML-TOKEN-ITERATOR-STATE");
        $sym10$XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("XML-TOKEN-ITERATOR-STATE-P"));
        $sym12$XML_IT_STATE_IN_STREAM = SubLObjectFactory.makeSymbol("XML-IT-STATE-IN-STREAM");
        $sym13$_CSETF_XML_IT_STATE_IN_STREAM = SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-IN-STREAM");
        $sym14$XML_IT_STATE_SCRATCH_STREAM = SubLObjectFactory.makeSymbol("XML-IT-STATE-SCRATCH-STREAM");
        $sym15$_CSETF_XML_IT_STATE_SCRATCH_STREAM = SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-SCRATCH-STREAM");
        $sym16$XML_IT_STATE_TOKEN_OUTPUT_STREAM = SubLObjectFactory.makeSymbol("XML-IT-STATE-TOKEN-OUTPUT-STREAM");
        $sym17$_CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM = SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM");
        $sym18$XML_IT_STATE_ENTITY_MAP = SubLObjectFactory.makeSymbol("XML-IT-STATE-ENTITY-MAP");
        $sym19$_CSETF_XML_IT_STATE_ENTITY_MAP = SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-ENTITY-MAP");
        $sym20$XML_IT_STATE_NAMESPACE_STACK = SubLObjectFactory.makeSymbol("XML-IT-STATE-NAMESPACE-STACK");
        $sym21$_CSETF_XML_IT_STATE_NAMESPACE_STACK = SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-NAMESPACE-STACK");
        $sym22$XML_IT_STATE_VALIDATE_ = SubLObjectFactory.makeSymbol("XML-IT-STATE-VALIDATE?");
        $sym23$_CSETF_XML_IT_STATE_VALIDATE_ = SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-VALIDATE?");
        $sym24$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ = SubLObjectFactory.makeSymbol("XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?");
        $sym25$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ = SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?");
        $sym26$XML_IT_STATE_RESOLVE_NAMESPACES_ = SubLObjectFactory.makeSymbol("XML-IT-STATE-RESOLVE-NAMESPACES?");
        $sym27$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_ = SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?");
        $sym28$XML_IT_STATE_ON_DECK_QUEUE = SubLObjectFactory.makeSymbol("XML-IT-STATE-ON-DECK-QUEUE");
        $sym29$_CSETF_XML_IT_STATE_ON_DECK_QUEUE = SubLObjectFactory.makeSymbol("_CSETF-XML-IT-STATE-ON-DECK-QUEUE");
        $kw30$IN_STREAM = SubLObjectFactory.makeKeyword("IN-STREAM");
        $kw31$SCRATCH_STREAM = SubLObjectFactory.makeKeyword("SCRATCH-STREAM");
        $kw32$TOKEN_OUTPUT_STREAM = SubLObjectFactory.makeKeyword("TOKEN-OUTPUT-STREAM");
        $kw33$ENTITY_MAP = SubLObjectFactory.makeKeyword("ENTITY-MAP");
        $kw34$NAMESPACE_STACK = SubLObjectFactory.makeKeyword("NAMESPACE-STACK");
        $kw35$VALIDATE_ = SubLObjectFactory.makeKeyword("VALIDATE?");
        $kw36$RESOLVE_ENTITY_REFERENCES_ = SubLObjectFactory.makeKeyword("RESOLVE-ENTITY-REFERENCES?");
        $kw37$RESOLVE_NAMESPACES_ = SubLObjectFactory.makeKeyword("RESOLVE-NAMESPACES?");
        $kw38$ON_DECK_QUEUE = SubLObjectFactory.makeKeyword("ON-DECK-QUEUE");
        $str39$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw40$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym41$MAKE_XML_TOKEN_ITERATOR_STATE = SubLObjectFactory.makeSymbol("MAKE-XML-TOKEN-ITERATOR-STATE");
        $kw42$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw43$END = SubLObjectFactory.makeKeyword("END");
        $sym44$VISIT_DEFSTRUCT_OBJECT_XML_TOKEN_ITERATOR_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-XML-TOKEN-ITERATOR-STATE-METHOD");
        $str45$_XML_TOKEN_ITERATOR_STATE_ = SubLObjectFactory.makeString("<XML-TOKEN-ITERATOR-STATE>");
        $kw46$DONE = SubLObjectFactory.makeKeyword("DONE");
        $str47$Couldn_t_resolve_namespace__S_in_ = SubLObjectFactory.makeString("Couldn't resolve namespace ~S in ~S");
        $str48$Mismatched_tags__Expected__S__got = SubLObjectFactory.makeString("Mismatched tags: Expected ~S, got ~S");
        $list49 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"));
        $str50$xmlns_ = SubLObjectFactory.makeString("xmlns:");
        $list51 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list52 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTE-NAME"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("VALUE"));
        $str53$xml = SubLObjectFactory.makeString("xml");
        $str54$http___www_w3_org_XML_1998_namesp = SubLObjectFactory.makeString("http://www.w3.org/XML/1998/namespace");
        $str55$_S_is_not_a_prefixed_XML_name_ = SubLObjectFactory.makeString("~S is not a prefixed XML name.");
        $sym56$XML_TOKENIZED_HTTP_REQUEST = SubLObjectFactory.makeSymbol("XML-TOKENIZED-HTTP-REQUEST");
        $kw57$GET = SubLObjectFactory.makeKeyword("GET");
        $int58$80 = SubLObjectFactory.makeInteger(80);
        $kw59$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym60$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw61$OPEN_CONNECTION = SubLObjectFactory.makeKeyword("OPEN-CONNECTION");
        $kw62$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw63$OVERALL = SubLObjectFactory.makeKeyword("OVERALL");
        $kw64$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw65$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw66$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw67$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw68$URL = SubLObjectFactory.makeKeyword("URL");
        $kw69$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw70$KEEP_ALIVE_ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $kw71$WIDE_NEWLINES_ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $kw72$ACCEPT_TYPES = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $kw73$CONTENT_TYPE = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $kw74$SOAP_ACTION_URI = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IN-STREAM"));
        $sym76$HTML_TOKENIZE = SubLObjectFactory.makeSymbol("HTML-TOKENIZE");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TOKENIZE"));
        $sym78$XML_TOKENIZE = SubLObjectFactory.makeSymbol("XML-TOKENIZE");
        $list79 = ConsesLow.list((SubLObject)xml_parsing_utilities.NIL);
        $sym80$CHAR_EQUAL = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
        $sym81$XML_TOKEN_MENTIONS = SubLObjectFactory.makeSymbol("XML-TOKEN-MENTIONS");
        $str82$_ = SubLObjectFactory.makeString("<");
        $str83$__ = SubLObjectFactory.makeString("/>");
        $str84$__ = SubLObjectFactory.makeString("</");
        $sym85$XML_TAG_ = SubLObjectFactory.makeSymbol("XML-TAG?");
        $list86 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("REST-OF-TOKENS"));
        $sym87$XML_TOKEN_ELEMENT_NAME_ = SubLObjectFactory.makeSymbol("XML-TOKEN-ELEMENT-NAME?");
        $str88$Couldn_t_find_position_of__S_in__ = SubLObjectFactory.makeString("Couldn't find position of ~S in ~S");
        $str89$_xml = SubLObjectFactory.makeString("?xml");
        $str90$____ = SubLObjectFactory.makeString("<!--");
        $str91$___ = SubLObjectFactory.makeString("-->");
        $list92 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_less, (SubLObject)Characters.CHAR_greater));
        $list93 = ConsesLow.list((SubLObject)Characters.CHAR_less, (SubLObject)Characters.CHAR_greater);
        $str94$___ = SubLObjectFactory.makeString("!--");
        $str95$__CDATA_ = SubLObjectFactory.makeString("![CDATA[");
        $str96$__ = SubLObjectFactory.makeString("--");
        $str97$__ = SubLObjectFactory.makeString("]]");
        $str98$Mismatched_closing_bracket__S_fol = SubLObjectFactory.makeString("Mismatched closing bracket ~S following ~S. Expected ~S");
        $str99$_DOCTYPE = SubLObjectFactory.makeString("!DOCTYPE");
        $str100$__DOCTYPE_HTML_ = SubLObjectFactory.makeString("<!DOCTYPE HTML ");
        $str101$__ = SubLObjectFactory.makeString("<?");
        $str102$__ = SubLObjectFactory.makeString("?>");
        $list103 = ConsesLow.list((SubLObject)Characters.CHAR_lbracket);
        $list104 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("DOCTYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-BRACKET"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $str105$__DOCTYPE = SubLObjectFactory.makeString("<!DOCTYPE");
        $str106$Got__S_instead_of___DOCTYPE_ = SubLObjectFactory.makeString("Got ~S instead of <!DOCTYPE.");
        $str107$_ = SubLObjectFactory.makeString("[");
        $str108$__ENTITY = SubLObjectFactory.makeString("<!ENTITY");
        $str109$_ = SubLObjectFactory.makeString("&");
        $str110$_ = SubLObjectFactory.makeString(";");
        $list111 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CODE"));
        $sym112$PARSE_XML_TOKEN_INT = SubLObjectFactory.makeSymbol("PARSE-XML-TOKEN-INT");
        $sym113$WHITESPACEP = SubLObjectFactory.makeSymbol("WHITESPACEP");
        $str114$XML_syntax_error__No___before__S = SubLObjectFactory.makeString("XML syntax error: No = before ~S");
        $str115$XML_syntax_error__Value_starting_ = SubLObjectFactory.makeString("XML syntax error: Value starting at ~S is not in quotes.");
        $sym116$VALID_XML_NAME_P = SubLObjectFactory.makeSymbol("VALID-XML-NAME-P");
        $sym117$XML_CDATA_TAG_ = SubLObjectFactory.makeSymbol("XML-CDATA-TAG?");
        $sym118$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str119$_S_is_not_an_XML_token = SubLObjectFactory.makeString("~S is not an XML token");
        $str120$ = SubLObjectFactory.makeString("");
        $sym121$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $sym122$XML_TOKENS_TO_SEXPR = SubLObjectFactory.makeSymbol("XML-TOKENS-TO-SEXPR");
        $kw123$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw124$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw125$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw126$KB = SubLObjectFactory.makeKeyword("KB");
        $kw127$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw128$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list129 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<html>"), (SubLObject)SubLObjectFactory.makeString("<body bgcolor='3'>"), (SubLObject)SubLObjectFactory.makeString("Here is some text"), (SubLObject)SubLObjectFactory.makeString("<br/>"), (SubLObject)SubLObjectFactory.makeString("</body>"), (SubLObject)SubLObjectFactory.makeString("</html>"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("html")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("body"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("bgcolor"), (SubLObject)SubLObjectFactory.makeString("3"))), (SubLObject)SubLObjectFactory.makeString("Here is some text"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("br")))))));
        $sym130$PARSE_HTML_TOKEN = SubLObjectFactory.makeSymbol("PARSE-HTML-TOKEN");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<pre style=\"display:none\" id=RadEditorEncodedTag>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pre"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("style"), (SubLObject)SubLObjectFactory.makeString("display:none")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("id"), (SubLObject)SubLObjectFactory.makeString("RadEditorEncodedTag")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<pre id=RadEditorEncodedTag style=\"display:none\">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pre"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("id"), (SubLObject)SubLObjectFactory.makeString("RadEditorEncodedTag")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("style"), (SubLObject)SubLObjectFactory.makeString("display:none")))));
        $sym132$PARSE_XML_TOKEN = SubLObjectFactory.makeSymbol("PARSE-XML-TOKEN");
        $list133 = _constant_133_initializer();
    }
    
    public static final class $xml_token_iterator_state_native extends SubLStructNative
    {
        public SubLObject $in_stream;
        public SubLObject $scratch_stream;
        public SubLObject $token_output_stream;
        public SubLObject $entity_map;
        public SubLObject $namespace_stack;
        public SubLObject $validateP;
        public SubLObject $resolve_entity_referencesP;
        public SubLObject $resolve_namespacesP;
        public SubLObject $on_deck_queue;
        private static final SubLStructDeclNative structDecl;
        
        public $xml_token_iterator_state_native() {
            this.$in_stream = (SubLObject)CommonSymbols.NIL;
            this.$scratch_stream = (SubLObject)CommonSymbols.NIL;
            this.$token_output_stream = (SubLObject)CommonSymbols.NIL;
            this.$entity_map = (SubLObject)CommonSymbols.NIL;
            this.$namespace_stack = (SubLObject)CommonSymbols.NIL;
            this.$validateP = (SubLObject)CommonSymbols.NIL;
            this.$resolve_entity_referencesP = (SubLObject)CommonSymbols.NIL;
            this.$resolve_namespacesP = (SubLObject)CommonSymbols.NIL;
            this.$on_deck_queue = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$xml_token_iterator_state_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$in_stream;
        }
        
        public SubLObject getField3() {
            return this.$scratch_stream;
        }
        
        public SubLObject getField4() {
            return this.$token_output_stream;
        }
        
        public SubLObject getField5() {
            return this.$entity_map;
        }
        
        public SubLObject getField6() {
            return this.$namespace_stack;
        }
        
        public SubLObject getField7() {
            return this.$validateP;
        }
        
        public SubLObject getField8() {
            return this.$resolve_entity_referencesP;
        }
        
        public SubLObject getField9() {
            return this.$resolve_namespacesP;
        }
        
        public SubLObject getField10() {
            return this.$on_deck_queue;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$in_stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$scratch_stream = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$token_output_stream = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$entity_map = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$namespace_stack = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$validateP = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$resolve_entity_referencesP = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$resolve_namespacesP = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$on_deck_queue = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$xml_token_iterator_state_native.class, xml_parsing_utilities.$sym3$XML_TOKEN_ITERATOR_STATE, xml_parsing_utilities.$sym4$XML_TOKEN_ITERATOR_STATE_P, xml_parsing_utilities.$list5, xml_parsing_utilities.$list6, new String[] { "$in_stream", "$scratch_stream", "$token_output_stream", "$entity_map", "$namespace_stack", "$validateP", "$resolve_entity_referencesP", "$resolve_namespacesP", "$on_deck_queue" }, xml_parsing_utilities.$list7, xml_parsing_utilities.$list8, xml_parsing_utilities.$sym9$PRINT_XML_TOKEN_ITERATOR_STATE);
        }
    }
    
    public static final class $xml_token_iterator_state_p$UnaryFunction extends UnaryFunction
    {
        public $xml_token_iterator_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("XML-TOKEN-ITERATOR-STATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return xml_parsing_utilities.xml_token_iterator_state_p(arg1);
        }
    }
    
    public static final class $xml_token_mentions$BinaryFunction extends BinaryFunction
    {
        public $xml_token_mentions$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("XML-TOKEN-MENTIONS"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return xml_parsing_utilities.xml_token_mentions(arg1, arg2);
        }
    }
}

/*

	Total time: 1104 ms
	
*/