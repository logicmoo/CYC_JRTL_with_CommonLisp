package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 

public class xml_parsing_utilities extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new xml_parsing_utilities();

    public static final String myName = "com.cyc.cycjava_2.cycl.xml_parsing_utilities";


    // defparameter
    public static final SubLSymbol $require_valid_xmlP$ = makeSymbol("*REQUIRE-VALID-XML?*");

    // defconstant
    public static final SubLSymbol $dtp_xml_token_iterator_state$ = makeSymbol("*DTP-XML-TOKEN-ITERATOR-STATE*");

    // defparameter
    private static final SubLSymbol $xml_token_accumulator$ = makeSymbol("*XML-TOKEN-ACCUMULATOR*");



    private static final SubLSymbol ITERATE_XML_TOKEN_DONE = makeSymbol("ITERATE-XML-TOKEN-DONE");

    private static final SubLSymbol ITERATE_XML_TOKEN_NEXT = makeSymbol("ITERATE-XML-TOKEN-NEXT");

    private static final SubLSymbol XML_TOKEN_ITERATOR_STATE = makeSymbol("XML-TOKEN-ITERATOR-STATE");

    private static final SubLSymbol XML_TOKEN_ITERATOR_STATE_P = makeSymbol("XML-TOKEN-ITERATOR-STATE-P");

    private static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("IN-STREAM"), makeSymbol("SCRATCH-STREAM"), makeSymbol("TOKEN-OUTPUT-STREAM"), makeSymbol("ENTITY-MAP"), makeSymbol("NAMESPACE-STACK"), makeSymbol("VALIDATE?"), makeSymbol("RESOLVE-ENTITY-REFERENCES?"), makeSymbol("RESOLVE-NAMESPACES?"), makeSymbol("ON-DECK-QUEUE") });

    private static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("IN-STREAM"), makeKeyword("SCRATCH-STREAM"), makeKeyword("TOKEN-OUTPUT-STREAM"), makeKeyword("ENTITY-MAP"), makeKeyword("NAMESPACE-STACK"), makeKeyword("VALIDATE?"), makeKeyword("RESOLVE-ENTITY-REFERENCES?"), makeKeyword("RESOLVE-NAMESPACES?"), makeKeyword("ON-DECK-QUEUE") });

    private static final SubLList $list7 = list(new SubLObject[]{ makeSymbol("XML-IT-STATE-IN-STREAM"), makeSymbol("XML-IT-STATE-SCRATCH-STREAM"), makeSymbol("XML-IT-STATE-TOKEN-OUTPUT-STREAM"), makeSymbol("XML-IT-STATE-ENTITY-MAP"), makeSymbol("XML-IT-STATE-NAMESPACE-STACK"), makeSymbol("XML-IT-STATE-VALIDATE?"), makeSymbol("XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?"), makeSymbol("XML-IT-STATE-RESOLVE-NAMESPACES?"), makeSymbol("XML-IT-STATE-ON-DECK-QUEUE") });

    private static final SubLList $list8 = list(new SubLObject[]{ makeSymbol("_CSETF-XML-IT-STATE-IN-STREAM"), makeSymbol("_CSETF-XML-IT-STATE-SCRATCH-STREAM"), makeSymbol("_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM"), makeSymbol("_CSETF-XML-IT-STATE-ENTITY-MAP"), makeSymbol("_CSETF-XML-IT-STATE-NAMESPACE-STACK"), makeSymbol("_CSETF-XML-IT-STATE-VALIDATE?"), makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?"), makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?"), makeSymbol("_CSETF-XML-IT-STATE-ON-DECK-QUEUE") });

    private static final SubLSymbol PRINT_XML_TOKEN_ITERATOR_STATE = makeSymbol("PRINT-XML-TOKEN-ITERATOR-STATE");

    private static final SubLSymbol XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("XML-TOKEN-ITERATOR-STATE-P"));

    private static final SubLSymbol XML_IT_STATE_IN_STREAM = makeSymbol("XML-IT-STATE-IN-STREAM");

    private static final SubLSymbol _CSETF_XML_IT_STATE_IN_STREAM = makeSymbol("_CSETF-XML-IT-STATE-IN-STREAM");

    private static final SubLSymbol XML_IT_STATE_SCRATCH_STREAM = makeSymbol("XML-IT-STATE-SCRATCH-STREAM");

    private static final SubLSymbol _CSETF_XML_IT_STATE_SCRATCH_STREAM = makeSymbol("_CSETF-XML-IT-STATE-SCRATCH-STREAM");

    private static final SubLSymbol XML_IT_STATE_TOKEN_OUTPUT_STREAM = makeSymbol("XML-IT-STATE-TOKEN-OUTPUT-STREAM");

    private static final SubLSymbol _CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM = makeSymbol("_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM");

    private static final SubLSymbol XML_IT_STATE_ENTITY_MAP = makeSymbol("XML-IT-STATE-ENTITY-MAP");

    private static final SubLSymbol _CSETF_XML_IT_STATE_ENTITY_MAP = makeSymbol("_CSETF-XML-IT-STATE-ENTITY-MAP");

    private static final SubLSymbol XML_IT_STATE_NAMESPACE_STACK = makeSymbol("XML-IT-STATE-NAMESPACE-STACK");

    private static final SubLSymbol _CSETF_XML_IT_STATE_NAMESPACE_STACK = makeSymbol("_CSETF-XML-IT-STATE-NAMESPACE-STACK");

    private static final SubLSymbol $sym22$XML_IT_STATE_VALIDATE_ = makeSymbol("XML-IT-STATE-VALIDATE?");

    private static final SubLSymbol $sym23$_CSETF_XML_IT_STATE_VALIDATE_ = makeSymbol("_CSETF-XML-IT-STATE-VALIDATE?");

    private static final SubLSymbol $sym24$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ = makeSymbol("XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?");

    private static final SubLSymbol $sym25$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ = makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?");

    private static final SubLSymbol $sym26$XML_IT_STATE_RESOLVE_NAMESPACES_ = makeSymbol("XML-IT-STATE-RESOLVE-NAMESPACES?");

    private static final SubLSymbol $sym27$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_ = makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?");

    private static final SubLSymbol XML_IT_STATE_ON_DECK_QUEUE = makeSymbol("XML-IT-STATE-ON-DECK-QUEUE");

    private static final SubLSymbol _CSETF_XML_IT_STATE_ON_DECK_QUEUE = makeSymbol("_CSETF-XML-IT-STATE-ON-DECK-QUEUE");

    private static final SubLSymbol $IN_STREAM = makeKeyword("IN-STREAM");

    private static final SubLSymbol $SCRATCH_STREAM = makeKeyword("SCRATCH-STREAM");

    private static final SubLSymbol $TOKEN_OUTPUT_STREAM = makeKeyword("TOKEN-OUTPUT-STREAM");

    private static final SubLSymbol $ENTITY_MAP = makeKeyword("ENTITY-MAP");

    private static final SubLSymbol $NAMESPACE_STACK = makeKeyword("NAMESPACE-STACK");

    private static final SubLSymbol $kw35$VALIDATE_ = makeKeyword("VALIDATE?");

    private static final SubLSymbol $kw36$RESOLVE_ENTITY_REFERENCES_ = makeKeyword("RESOLVE-ENTITY-REFERENCES?");

    private static final SubLSymbol $kw37$RESOLVE_NAMESPACES_ = makeKeyword("RESOLVE-NAMESPACES?");

    private static final SubLSymbol $ON_DECK_QUEUE = makeKeyword("ON-DECK-QUEUE");

    private static final SubLString $str39$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_XML_TOKEN_ITERATOR_STATE = makeSymbol("MAKE-XML-TOKEN-ITERATOR-STATE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_XML_TOKEN_ITERATOR_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-XML-TOKEN-ITERATOR-STATE-METHOD");

    private static final SubLString $str45$_XML_TOKEN_ITERATOR_STATE_ = makeString("<XML-TOKEN-ITERATOR-STATE>");



    private static final SubLString $str47$Couldn_t_resolve_namespace__S_in_ = makeString("Couldn't resolve namespace ~S in ~S");

    private static final SubLString $str48$Mismatched_tags__Expected__S__got = makeString("Mismatched tags: Expected ~S, got ~S");

    private static final SubLList $list49 = cons(makeSymbol("ELEMENT-NAME"), makeSymbol("ATTRIBUTES"));

    private static final SubLString $str50$xmlns_ = makeString("xmlns:");

    private static final SubLList $list51 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    private static final SubLList $list52 = cons(makeSymbol("ATTRIBUTE-NAME"), makeUninternedSymbol("VALUE"));

    private static final SubLString $$$xml = makeString("xml");

    private static final SubLString $str54$http___www_w3_org_XML_1998_namesp = makeString("http://www.w3.org/XML/1998/namespace");

    private static final SubLString $str55$_S_is_not_a_prefixed_XML_name_ = makeString("~S is not a prefixed XML name.");

    private static final SubLSymbol XML_TOKENIZED_HTTP_REQUEST = makeSymbol("XML-TOKENIZED-HTTP-REQUEST");



    private static final SubLInteger $int$80 = makeInteger(80);























    private static final SubLSymbol $kw70$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw71$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");





    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLList $list75 = list(makeSymbol("IN-STREAM"));

    private static final SubLSymbol HTML_TOKENIZE = makeSymbol("HTML-TOKENIZE");

    private static final SubLList $list77 = list(makeSymbol("XML-TOKENIZE"));

    private static final SubLSymbol XML_TOKENIZE = makeSymbol("XML-TOKENIZE");

    private static final SubLList $list79 = list(NIL);



    private static final SubLSymbol XML_TOKEN_MENTIONS = makeSymbol("XML-TOKEN-MENTIONS");

    private static final SubLString $str82$_ = makeString("<");

    private static final SubLString $str83$__ = makeString("/>");

    private static final SubLString $str84$__ = makeString("</");

    private static final SubLSymbol $sym85$XML_TAG_ = makeSymbol("XML-TAG?");

    private static final SubLList $list86 = cons(makeSymbol("FIRST-TOKEN"), makeSymbol("REST-OF-TOKENS"));

    private static final SubLSymbol $sym87$XML_TOKEN_ELEMENT_NAME_ = makeSymbol("XML-TOKEN-ELEMENT-NAME?");

    private static final SubLString $str88$Couldn_t_find_position_of__S_in__ = makeString("Couldn't find position of ~S in ~S");

    private static final SubLString $str89$_xml = makeString("?xml");

    private static final SubLString $str90$____ = makeString("<!--");

    private static final SubLString $str91$___ = makeString("-->");

    private static final SubLList $list92 = list(cons(CHAR_less, CHAR_greater));

    private static final SubLList $list93 = list(CHAR_less, CHAR_greater);

    private static final SubLString $str94$___ = makeString("!--");

    private static final SubLString $str95$__CDATA_ = makeString("![CDATA[");

    private static final SubLString $str96$__ = makeString("--");

    private static final SubLString $str97$__ = makeString("]]");

    private static final SubLString $str98$Mismatched_closing_bracket__S_fol = makeString("Mismatched closing bracket ~S following ~S. Expected ~S");

    private static final SubLString $str99$_DOCTYPE = makeString("!DOCTYPE");

    private static final SubLString $str100$__DOCTYPE_HTML_ = makeString("<!DOCTYPE HTML ");

    private static final SubLString $str101$__ = makeString("<?");

    private static final SubLString $str102$__ = makeString("?>");

    private static final SubLList $list103 = list(CHAR_lbracket);

    private static final SubLList $list104 = listS(makeSymbol("DOCTYPE"), makeSymbol("NAME"), makeSymbol("OPEN-BRACKET"), makeSymbol("REST"));

    private static final SubLString $str105$__DOCTYPE = makeString("<!DOCTYPE");

    private static final SubLString $str106$Got__S_instead_of___DOCTYPE_ = makeString("Got ~S instead of <!DOCTYPE.");

    private static final SubLString $str107$_ = makeString("[");

    private static final SubLString $str108$__ENTITY = makeString("<!ENTITY");

    private static final SubLString $str109$_ = makeString("&");

    private static final SubLString $str110$_ = makeString(";");

    private static final SubLList $list111 = cons(makeSymbol("NAME"), makeSymbol("CODE"));

    private static final SubLSymbol PARSE_XML_TOKEN_INT = makeSymbol("PARSE-XML-TOKEN-INT");



    private static final SubLString $str114$XML_syntax_error__No___before__S = makeString("XML syntax error: No = before ~S");

    private static final SubLString $str115$XML_syntax_error__Value_starting_ = makeString("XML syntax error: Value starting at ~S is not in quotes.");

    private static final SubLSymbol VALID_XML_NAME_P = makeSymbol("VALID-XML-NAME-P");

    private static final SubLSymbol $sym117$XML_CDATA_TAG_ = makeSymbol("XML-CDATA-TAG?");



    private static final SubLString $str119$_S_is_not_an_XML_token = makeString("~S is not an XML token");

    private static final SubLString $str120$ = makeString("");

    private static final SubLSymbol $sym121$STRING_ = makeSymbol("STRING=");

    private static final SubLSymbol XML_TOKENS_TO_SEXPR = makeSymbol("XML-TOKENS-TO-SEXPR");













    private static final SubLList $list129 = list(list(list(list(makeString("<html>"), makeString("<body bgcolor='3'>"), makeString("Here is some text"), makeString("<br/>"), makeString("</body>"), makeString("</html>"))), list(list(makeString("html")), list(list(makeString("body"), cons(makeString("bgcolor"), makeString("3"))), makeString("Here is some text"), list(list(makeString("br")))))));

    private static final SubLSymbol PARSE_HTML_TOKEN = makeSymbol("PARSE-HTML-TOKEN");

    private static final SubLList $list131 = list(list(list(makeString("<pre style=\"display:none\" id=RadEditorEncodedTag>")), list(makeString("pre"), cons(makeString("style"), makeString("display:none")), cons(makeString("id"), makeString("RadEditorEncodedTag")))), list(list(makeString("<pre id=RadEditorEncodedTag style=\"display:none\">")), list(makeString("pre"), cons(makeString("id"), makeString("RadEditorEncodedTag")), cons(makeString("style"), makeString("display:none")))));

    private static final SubLSymbol PARSE_XML_TOKEN = makeSymbol("PARSE-XML-TOKEN");

    private static final SubLObject $list133 = _constant_133_initializer();

    public static SubLObject xml_tokenize(final SubLObject in_stream, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP) {
        if (validateP == UNPROVIDED) {
            validateP = $require_valid_xmlP$.getDynamicValue();
        }
        if (resolve_entity_referencesP == UNPROVIDED) {
            resolve_entity_referencesP = NIL;
        }
        if (resolve_namespacesP == UNPROVIDED) {
            resolve_namespacesP = NIL;
        }
        final SubLObject iterator = new_xml_token_iterator(in_stream, validateP, resolve_entity_referencesP, resolve_namespacesP);
        SubLObject tokens = NIL;
        while (NIL == iteration.iteration_done(iterator)) {
            tokens = cons(iteration.iteration_next(iterator), tokens);
        } 
        return nreverse(tokens);
    }

    public static SubLObject new_xml_token_iterator(final SubLObject in_stream, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP) {
        if (validateP == UNPROVIDED) {
            validateP = $require_valid_xmlP$.getDynamicValue();
        }
        if (resolve_entity_referencesP == UNPROVIDED) {
            resolve_entity_referencesP = NIL;
        }
        if (resolve_namespacesP == UNPROVIDED) {
            resolve_namespacesP = NIL;
        }
        assert NIL != streamp(in_stream) : "Types.streamp(in_stream) " + "CommonSymbols.NIL != Types.streamp(in_stream) " + in_stream;
        final SubLObject state = make_iterator_xml_token_state(in_stream, validateP, resolve_entity_referencesP, resolve_namespacesP);
        final SubLObject iterator = iteration.new_iterator(state, ITERATE_XML_TOKEN_DONE, ITERATE_XML_TOKEN_NEXT, UNPROVIDED);
        return iterator;
    }

    public static SubLObject xml_token_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_xml_token_iterator_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject xml_token_iterator_state_p(final SubLObject v_object) {
        return v_object.getClass() == $xml_token_iterator_state_native.class ? T : NIL;
    }

    public static SubLObject xml_it_state_in_stream(final SubLObject v_object) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject xml_it_state_scratch_stream(final SubLObject v_object) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject xml_it_state_token_output_stream(final SubLObject v_object) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject xml_it_state_entity_map(final SubLObject v_object) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject xml_it_state_namespace_stack(final SubLObject v_object) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject xml_it_state_validateP(final SubLObject v_object) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject xml_it_state_resolve_entity_referencesP(final SubLObject v_object) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject xml_it_state_resolve_namespacesP(final SubLObject v_object) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject xml_it_state_on_deck_queue(final SubLObject v_object) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject _csetf_xml_it_state_in_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_xml_it_state_scratch_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_xml_it_state_token_output_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_xml_it_state_entity_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_xml_it_state_namespace_stack(final SubLObject v_object, final SubLObject value) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_xml_it_state_validateP(final SubLObject v_object, final SubLObject value) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_xml_it_state_resolve_entity_referencesP(final SubLObject v_object, final SubLObject value) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_xml_it_state_resolve_namespacesP(final SubLObject v_object, final SubLObject value) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_xml_it_state_on_deck_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != xml_token_iterator_state_p(v_object) : "xml_parsing_utilities.xml_token_iterator_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject make_xml_token_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $xml_token_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($IN_STREAM)) {
                _csetf_xml_it_state_in_stream(v_new, current_value);
            } else
                if (pcase_var.eql($SCRATCH_STREAM)) {
                    _csetf_xml_it_state_scratch_stream(v_new, current_value);
                } else
                    if (pcase_var.eql($TOKEN_OUTPUT_STREAM)) {
                        _csetf_xml_it_state_token_output_stream(v_new, current_value);
                    } else
                        if (pcase_var.eql($ENTITY_MAP)) {
                            _csetf_xml_it_state_entity_map(v_new, current_value);
                        } else
                            if (pcase_var.eql($NAMESPACE_STACK)) {
                                _csetf_xml_it_state_namespace_stack(v_new, current_value);
                            } else
                                if (pcase_var.eql($kw35$VALIDATE_)) {
                                    _csetf_xml_it_state_validateP(v_new, current_value);
                                } else
                                    if (pcase_var.eql($kw36$RESOLVE_ENTITY_REFERENCES_)) {
                                        _csetf_xml_it_state_resolve_entity_referencesP(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($kw37$RESOLVE_NAMESPACES_)) {
                                            _csetf_xml_it_state_resolve_namespacesP(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($ON_DECK_QUEUE)) {
                                                _csetf_xml_it_state_on_deck_queue(v_new, current_value);
                                            } else {
                                                Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_xml_token_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_XML_TOKEN_ITERATOR_STATE, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $IN_STREAM, xml_it_state_in_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $SCRATCH_STREAM, xml_it_state_scratch_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $TOKEN_OUTPUT_STREAM, xml_it_state_token_output_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $ENTITY_MAP, xml_it_state_entity_map(obj));
        funcall(visitor_fn, obj, $SLOT, $NAMESPACE_STACK, xml_it_state_namespace_stack(obj));
        funcall(visitor_fn, obj, $SLOT, $kw35$VALIDATE_, xml_it_state_validateP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw36$RESOLVE_ENTITY_REFERENCES_, xml_it_state_resolve_entity_referencesP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw37$RESOLVE_NAMESPACES_, xml_it_state_resolve_namespacesP(obj));
        funcall(visitor_fn, obj, $SLOT, $ON_DECK_QUEUE, xml_it_state_on_deck_queue(obj));
        funcall(visitor_fn, obj, $END, MAKE_XML_TOKEN_ITERATOR_STATE, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_xml_token_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_xml_token_iterator_state(obj, visitor_fn);
    }

    public static SubLObject print_xml_token_iterator_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str45$_XML_TOKEN_ITERATOR_STATE_);
        return v_object;
    }

    public static SubLObject new_xml_token_iterator_state(final SubLObject in_stream, final SubLObject scratch_stream, final SubLObject token_output_stream, final SubLObject entity_map, final SubLObject namespace_stack, final SubLObject validateP, final SubLObject resolve_entity_referencesP, final SubLObject resolve_namespacesP, final SubLObject on_deck_queue) {
        final SubLObject state = make_xml_token_iterator_state(UNPROVIDED);
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

    public static SubLObject xml_token_iterator_state_in_stream(final SubLObject state) {
        assert NIL != xml_token_iterator_state_p(state) : "xml_parsing_utilities.xml_token_iterator_state_p(state) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_token_iterator_state_p(state) " + state;
        return xml_it_state_in_stream(state);
    }

    public static SubLObject xml_token_iterator_state_scratch_stream(final SubLObject state) {
        assert NIL != xml_token_iterator_state_p(state) : "xml_parsing_utilities.xml_token_iterator_state_p(state) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_token_iterator_state_p(state) " + state;
        return xml_it_state_scratch_stream(state);
    }

    public static SubLObject xml_token_iterator_state_token_output_stream(final SubLObject state) {
        assert NIL != xml_token_iterator_state_p(state) : "xml_parsing_utilities.xml_token_iterator_state_p(state) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_token_iterator_state_p(state) " + state;
        return xml_it_state_token_output_stream(state);
    }

    public static SubLObject xml_token_iterator_state_entity_map(final SubLObject state) {
        assert NIL != xml_token_iterator_state_p(state) : "xml_parsing_utilities.xml_token_iterator_state_p(state) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_token_iterator_state_p(state) " + state;
        return xml_it_state_entity_map(state);
    }

    public static SubLObject xml_token_iterator_state_namespace_stack(final SubLObject state) {
        assert NIL != xml_token_iterator_state_p(state) : "xml_parsing_utilities.xml_token_iterator_state_p(state) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_token_iterator_state_p(state) " + state;
        return xml_it_state_namespace_stack(state);
    }

    public static SubLObject xml_token_iterator_state_validateP(final SubLObject state) {
        assert NIL != xml_token_iterator_state_p(state) : "xml_parsing_utilities.xml_token_iterator_state_p(state) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_token_iterator_state_p(state) " + state;
        return xml_it_state_validateP(state);
    }

    public static SubLObject xml_token_iterator_state_resolve_entity_referencesP(final SubLObject state) {
        assert NIL != xml_token_iterator_state_p(state) : "xml_parsing_utilities.xml_token_iterator_state_p(state) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_token_iterator_state_p(state) " + state;
        return xml_it_state_resolve_entity_referencesP(state);
    }

    public static SubLObject xml_token_iterator_state_resolve_namespacesP(final SubLObject state) {
        assert NIL != xml_token_iterator_state_p(state) : "xml_parsing_utilities.xml_token_iterator_state_p(state) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_token_iterator_state_p(state) " + state;
        return xml_it_state_resolve_namespacesP(state);
    }

    public static SubLObject xml_token_iterator_state_on_deck_queue(final SubLObject state) {
        assert NIL != xml_token_iterator_state_p(state) : "xml_parsing_utilities.xml_token_iterator_state_p(state) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_token_iterator_state_p(state) " + state;
        return xml_it_state_on_deck_queue(state);
    }

    public static SubLObject xml_token_iterator_state_peek(final SubLObject state) {
        ensure_xml_token_on_deck_queue_populated(state);
        return NIL != iterate_xml_token_done(state) ? NIL : queues.queue_peek(xml_token_iterator_state_on_deck_queue(state));
    }

    public static SubLObject advance_xml_token_iterator_to_next_element(final SubLObject token_iterator) {
        while ((NIL == iteration.iteration_done(token_iterator)) && ((NIL != non_content_xml_token_p(iteration.xml_token_iterator_peek(token_iterator))) || (NIL != string_utilities.whitespace_stringP(iteration.xml_token_iterator_peek(token_iterator))))) {
            iteration.iteration_next(token_iterator);
        } 
        return NIL;
    }

    public static SubLObject xml_token_iterator_progress(final SubLObject iterator) {
        final SubLObject state = iteration.iteration_state_peek(iterator);
        final SubLObject in_stream = xml_token_iterator_state_in_stream(state);
        return values(file_position(in_stream, UNPROVIDED), file_length(in_stream));
    }

    public static SubLObject make_iterator_xml_token_state(final SubLObject in_stream, final SubLObject validateP, final SubLObject resolve_entity_referencesP, final SubLObject resolve_namespacesP) {
        final SubLObject scratch_stream = make_private_string_output_stream();
        final SubLObject token_output_stream = make_private_string_output_stream();
        final SubLObject entity_map = NIL;
        final SubLObject namespace_stack = NIL;
        final SubLObject on_deck_queue = misc_utilities.uninitialized();
        return new_xml_token_iterator_state(in_stream, scratch_stream, token_output_stream, entity_map, namespace_stack, validateP, resolve_entity_referencesP, resolve_namespacesP, on_deck_queue);
    }

    public static SubLObject iterate_xml_token_done(final SubLObject state) {
        ensure_xml_token_on_deck_queue_populated(state);
        return eq($DONE, queues.queue_peek(xml_token_iterator_state_on_deck_queue(state)));
    }

    public static SubLObject iterate_xml_token_next(final SubLObject state) {
        final SubLObject on_deck_queue = xml_token_iterator_state_on_deck_queue(state);
        ensure_xml_token_on_deck_queue_populated(state);
        return values(queues.dequeue(on_deck_queue), state);
    }

    public static SubLObject ensure_xml_token_on_deck_queue_populated(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject on_deck_queue = xml_token_iterator_state_on_deck_queue(state);
        final SubLObject at_beginningP = makeBoolean(NIL == queues.queue_p(on_deck_queue));
        if (NIL != at_beginningP) {
            on_deck_queue = queues.create_queue(UNPROVIDED);
            _csetf_xml_it_state_on_deck_queue(state, on_deck_queue);
        }
        final SubLObject scratch_stream = xml_token_iterator_state_scratch_stream(state);
        final SubLObject token_output_stream = xml_token_iterator_state_token_output_stream(state);
        final SubLObject in_stream = xml_token_iterator_state_in_stream(state);
        if (NIL != queues.queue_empty_p(on_deck_queue)) {
            thread.resetMultipleValues();
            final SubLObject text = xml_read(in_stream, scratch_stream, token_output_stream);
            final SubLObject token = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != string_utilities.non_empty_string_p(text)) {
                final SubLObject modified_text = xml_iterator_state_handle_namespaces_and_entities(text, state);
                queues.enqueue(modified_text, on_deck_queue);
            }
            if (NIL == token) {
                queues.enqueue($DONE, on_deck_queue);
                close(scratch_stream, UNPROVIDED);
            } else {
                final SubLObject modified_token = xml_iterator_state_handle_namespaces_and_entities(token, state);
                queues.enqueue(modified_token, on_deck_queue);
            }
        }
        return state;
    }

    public static SubLObject xml_iterator_state_handle_namespaces_and_entities(final SubLObject token, final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject namespace_stack = xml_token_iterator_state_namespace_stack(state);
        final SubLObject resolve_namespacesP = xml_token_iterator_state_resolve_namespacesP(state);
        final SubLObject validateP = xml_token_iterator_state_validateP(state);
        final SubLObject resolve_entity_referencesP = xml_token_iterator_state_resolve_entity_referencesP(state);
        final SubLObject entity_map = xml_token_iterator_state_entity_map(state);
        SubLObject new_token = token;
        if (((NIL != resolve_entity_referencesP) && (NIL != entity_map)) && (NIL != find(CHAR_ampersand, token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            new_token = resolve_entity_references(token, entity_map);
        }
        if ((((((NIL != xml_tagP(token)) && (NIL == xml_declaration_p(token))) && (NIL == xml_doctype_tag_p(token))) && (NIL == xml_processing_instruction_p(token))) && (NIL == xml_comment_p(token))) && ((NIL != validateP) || (NIL != resolve_namespacesP))) {
            thread.resetMultipleValues();
            final SubLObject modified_token = handle_xml_namespaces(new_token, namespace_stack, resolve_namespacesP);
            final SubLObject new_stack = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_token = modified_token;
            _csetf_xml_it_state_namespace_stack(state, new_stack);
        }
        if (((NIL != resolve_entity_referencesP) && (NIL == entity_map)) && (NIL != xml_doctype_tag_p(token))) {
            _csetf_xml_it_state_entity_map(state, entity_map_from_doctype_tag(token));
        }
        return new_token;
    }

    public static SubLObject handle_xml_namespaces(SubLObject token, SubLObject stack, final SubLObject resolve_namespacesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_namespace_bindings = NIL;
        if (NIL != resolve_namespacesP) {
            thread.resetMultipleValues();
            final SubLObject token_$1 = xml_utilities.resolve_xml_namespaces(token, stack);
            final SubLObject new_namespace_bindings_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            token = token_$1;
            new_namespace_bindings = new_namespace_bindings_$2;
        } else {
            SubLObject problem = NIL;
            thread.resetMultipleValues();
            final SubLObject problem_$3 = validate_xml_namespaces(token, stack);
            final SubLObject new_namespace_bindings_$3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            problem = problem_$3;
            new_namespace_bindings = new_namespace_bindings_$3;
            if (NIL != problem) {
                Errors.error($str47$Couldn_t_resolve_namespace__S_in_, problem, token);
            }
        }
        if (NIL == xml_cdata_tagP(token)) {
            if (NIL != xml_opening_tag_p(token)) {
                stack = cons(xml_token_element_name(token), stack);
                stack = append(new_namespace_bindings, stack);
            } else
                if (NIL != xml_closing_tag_p(token)) {
                    final SubLObject element_name = xml_token_element_name(token);
                    while (NIL != xml_namespace_mapping_p(stack.first())) {
                        stack = stack.rest();
                    } 
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!element_name.equal(stack.first()))) {
                        Errors.error($str48$Mismatched_tags__Expected__S__got, stack.first(), element_name);
                    }
                    stack = stack.rest();
                }

        }
        return values(token, stack);
    }

    public static SubLObject xml_namespace_mapping_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && v_object.first().isString()) && v_object.rest().isString());
    }

    public static SubLObject validate_xml_namespaces(final SubLObject token, final SubLObject stack) {
        SubLObject problem = NIL;
        SubLObject new_bindings = NIL;
        if ((((((NIL != xml_tagP(token)) && (NIL == xml_declaration_p(token))) && (NIL == xml_doctype_tag_p(token))) && (NIL == xml_processing_instruction_p(token))) && (NIL == xml_cdata_tagP(token))) && (NIL == xml_comment_p(token))) {
            SubLObject current;
            final SubLObject datum = current = parse_xml_token(token);
            SubLObject element_name = NIL;
            SubLObject attributes = NIL;
            destructuring_bind_must_consp(current, datum, $list49);
            element_name = current.first();
            current = attributes = current.rest();
            if (NIL != string_utilities.substringP($str50$xmlns_, token, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                SubLObject cdolist_list_var = attributes;
                SubLObject cons = NIL;
                cons = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current_$6;
                    final SubLObject datum_$5 = current_$6 = cons;
                    SubLObject attribute = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current_$6, datum_$5, $list51);
                    attribute = current_$6.first();
                    current_$6 = value = current_$6.rest();
                    if (NIL != string_utilities.starts_with(attribute, $str50$xmlns_)) {
                        new_bindings = cons(cons(string_utilities.substring(attribute, SIX_INTEGER, position(CHAR_equal, attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), value), new_bindings);
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
            for (problem = maybe_validate_xml_namespace(element_name, new_bindings, stack), rest = NIL, rest = attributes; (NIL == problem) && (NIL != rest); problem = maybe_validate_xml_namespace(attribute_name, new_bindings, stack) , rest = rest.rest()) {
                cons = rest.first();
                datum_$6 = current_$7 = cons;
                attribute_name = NIL;
                value = NIL;
                destructuring_bind_must_consp(current_$7, datum_$6, $list52);
                attribute_name = current_$7.first();
                current_$7 = value = current_$7.rest();
            }
        }
        return values(problem, new_bindings);
    }

    public static SubLObject maybe_validate_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack) {
        return (NIL != find(CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == string_utilities.starts_with(name, $str50$xmlns_)) ? validate_xml_namespace(name, new_bindings, stack) : NIL;
    }

    public static SubLObject validate_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack) {
        final SubLObject namespace = xml_prefixed_name_namespace(name);
        SubLObject expanded = list_utilities.alist_lookup_without_values(new_bindings, namespace, symbol_function(EQUAL), NIL);
        if ((NIL == expanded) && namespace.equal($$$xml)) {
            expanded = $str54$http___www_w3_org_XML_1998_namesp;
        }
        if (NIL == expanded) {
            SubLObject csome_list_var = stack;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == expanded) && (NIL != csome_list_var)) {
                if (binding.isCons() && namespace.equal(binding.first())) {
                    expanded = binding.rest();
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        return NIL != expanded ? NIL : name;
    }

    public static SubLObject xml_prefixed_name_p(final SubLObject name) {
        return makeBoolean(name.isString() && (NIL != list_utilities.sublisp_boolean(position(CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject xml_prefixed_name_namespace(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject colon_pos = position(CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == colon_pos)) {
            Errors.error($str55$_S_is_not_a_prefixed_XML_name_, name);
        }
        return string_utilities.substring(name, ZERO_INTEGER, colon_pos);
    }

    public static SubLObject xml_prefixed_name_local_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject colon_pos = position(CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == colon_pos)) {
            Errors.error($str55$_S_is_not_a_prefixed_XML_name_, name);
        }
        return string_utilities.substring(name, number_utilities.f_1X(colon_pos), UNPROVIDED);
    }

    public static SubLObject xml_string_tokenize(final SubLObject string, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP) {
        if (validateP == UNPROVIDED) {
            validateP = $require_valid_xmlP$.getDynamicValue();
        }
        if (resolve_entity_referencesP == UNPROVIDED) {
            resolve_entity_referencesP = NIL;
        }
        if (resolve_namespacesP == UNPROVIDED) {
            resolve_namespacesP = NIL;
        }
        SubLObject out_list = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_input_stream(string, ZERO_INTEGER, NIL);
            out_list = xml_tokenize(stream, validateP, resolve_entity_referencesP, resolve_namespacesP);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return out_list;
    }

    public static SubLObject xml_tokenized_http_request(SubLObject machine, SubLObject url, SubLObject query, SubLObject method, SubLObject port, SubLObject keep_aliveP, SubLObject wide_newlinesP, SubLObject open_connection_timeout, SubLObject overall_timeout, SubLObject redirectP, SubLObject accept_types) {
        if (query == UNPROVIDED) {
            query = NIL;
        }
        if (method == UNPROVIDED) {
            method = $GET;
        }
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (keep_aliveP == UNPROVIDED) {
            keep_aliveP = T;
        }
        if (wide_newlinesP == UNPROVIDED) {
            wide_newlinesP = T;
        }
        if (open_connection_timeout == UNPROVIDED) {
            open_connection_timeout = NIL;
        }
        if (overall_timeout == UNPROVIDED) {
            overall_timeout = NIL;
        }
        if (redirectP == UNPROVIDED) {
            redirectP = T;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        SubLObject connection_timed_out = NIL;
        SubLObject overall_timed_out = NIL;
        SubLObject make_request = T;
        SubLObject tokens = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL != overall_timeout) {
                        SubLObject timeout_reason = NIL;
                        final SubLObject tag = with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$9 = $within_with_timeout$.currentBinding(thread);
                            try {
                                $within_with_timeout$.bind(T, thread);
                                SubLObject timer = NIL;
                                try {
                                    final SubLObject _prev_bind_0_$10 = $with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = with_timeout_start_timer(overall_timeout, tag);
                                        thread.resetMultipleValues();
                                        final SubLObject tokens_$11 = xml_tokenized_http_request(machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, NIL, redirectP, accept_types);
                                        final SubLObject timeout_reason_$12 = thread.secondMultipleValue();
                                        final SubLObject error_message_$13 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        tokens = tokens_$11;
                                        timeout_reason = timeout_reason_$12;
                                        error_message = error_message_$13;
                                    } finally {
                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$10, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        with_timeout_stop_timer(timer);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            } finally {
                                $within_with_timeout$.rebind(_prev_bind_0_$9, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            overall_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                        } finally {
                            thread.throwStack.pop();
                        }
                        final SubLObject pcase_var = timeout_reason;
                        if (pcase_var.eql($OPEN_CONNECTION)) {
                            connection_timed_out = T;
                        }
                    } else {
                        while (NIL != make_request) {
                            thread.resetMultipleValues();
                            final SubLObject tokens_$12 = xml_tokenized_http_request_internal(machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, accept_types);
                            final SubLObject connection_timed_out_$16 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            tokens = tokens_$12;
                            connection_timed_out = connection_timed_out_$16;
                            if (NIL != redirectP) {
                                final SubLObject header = tokens.first();
                                if (NIL != web_utilities.html_redirection_header_p(header)) {
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
                                } else {
                                    make_request = NIL;
                                }
                            } else {
                                make_request = NIL;
                            }
                        } 
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            return values(tokens, $ERROR, error_message);
        }
        if (NIL != connection_timed_out) {
            return values(tokens, $OPEN_CONNECTION, NIL);
        }
        if (NIL != overall_timed_out) {
            return values(tokens, $OVERALL, NIL);
        }
        return values(tokens, NIL, NIL);
    }

    public static SubLObject xml_tokenized_http_request_internal(final SubLObject machine, final SubLObject url, final SubLObject query, final SubLObject method, final SubLObject port, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, final SubLObject timeout, final SubLObject accept_types) {
        SubLObject timed_out = T;
        SubLObject tokens = NIL;
        final SubLObject real_port = (port.eql($DEFAULT)) ? $int$80 : port;
        SubLObject channel = NIL;
        try {
            channel = subl_promotions.open_tcp_stream_with_timeout(machine, real_port, timeout, $PRIVATE);
            if (NIL != validate_tcp_connection(channel, machine, real_port)) {
                web_utilities.send_http_request(channel, list(new SubLObject[]{ $MACHINE, machine, $PORT, port, $METHOD, method, $URL, url, $QUERY, query, $kw70$KEEP_ALIVE_, keep_aliveP, $kw71$WIDE_NEWLINES_, wide_newlinesP, $ACCEPT_TYPES, accept_types, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
                timed_out = NIL;
                tokens = xml_tokenize(channel, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != channel) {
                    close(channel, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return values(tokens, timed_out);
    }

    public static SubLObject html_tokenize(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject in_stream = NIL;
        destructuring_bind_must_consp(current, datum, $list75);
        in_stream = current.first();
        current = current.rest();
        if (NIL == current) {
            defmacro_obsolete_warning(HTML_TOKENIZE, $list77);
            return listS(XML_TOKENIZE, in_stream, $list79);
        }
        cdestructuring_bind_error(datum, $list75);
        return NIL;
    }

    public static SubLObject xml_token_matches_exactly(final SubLObject token, final SubLObject match_string) {
        return Strings.stringE(token, match_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject xml_token_matches(final SubLObject token, final SubLObject match_string) {
        return Strings.string_equal(token, match_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject xml_token_starts_with(final SubLObject token, final SubLObject start_string) {
        return eql(ZERO_INTEGER, search(start_string, token, symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject xml_token_mentions(final SubLObject token, final SubLObject mention_string) {
        return list_utilities.sublisp_boolean(search(mention_string, token, symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject next_xml_token_position(final SubLObject tokens, final SubLObject target_string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = XML_TOKEN_MENTIONS;
        }
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject position = NIL;
        list_var = tokens;
        token = list_var.first();
        for (position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , position = add(ONE_INTEGER, position)) {
            if (NIL != funcall(test, token, target_string)) {
                return position;
            }
        }
        return NIL;
    }

    public static SubLObject next_xml_token_position_if(final SubLObject tokens, final SubLObject test) {
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject position = NIL;
        list_var = tokens;
        token = list_var.first();
        for (position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , position = add(ONE_INTEGER, position)) {
            if (NIL != funcall(test, token)) {
                return position;
            }
        }
        return NIL;
    }

    public static SubLObject next_xml_token_position_if_not(final SubLObject tokens, final SubLObject test) {
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject position = NIL;
        list_var = tokens;
        token = list_var.first();
        for (position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , position = add(ONE_INTEGER, position)) {
            if (NIL == funcall(test, token)) {
                return position;
            }
        }
        return NIL;
    }

    public static SubLObject advance_xml_tokens(final SubLObject tokens, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        return nthcdr(n, tokens);
    }

    public static SubLObject advance_xml_tokens_to(SubLObject tokens, final SubLObject target_string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = XML_TOKEN_MENTIONS;
        }
        while ((NIL != tokens) && (NIL == funcall(test, tokens.first(), target_string))) {
            tokens = tokens.rest();
        } 
        return tokens;
    }

    public static SubLObject xml_extract_token_sequence(final SubLObject xml_tokens, final SubLObject token_name) {
        final SubLObject sequence_start_string = cconcatenate($str82$_, format_nil.format_nil_a_no_copy(token_name));
        final SubLObject sequence_self_end_string = $str83$__;
        final SubLObject sequence_match_end_string = cconcatenate($str84$__, format_nil.format_nil_a_no_copy(token_name));
        final SubLObject sequence_start = advance_xml_tokens_to(xml_tokens, sequence_start_string, UNPROVIDED);
        if (NIL == sequence_start) {
            return NIL;
        }
        final SubLObject start_token = sequence_start.first();
        if (NIL != string_utilities.ends_with(start_token, sequence_self_end_string, UNPROVIDED)) {
            return list(start_token);
        }
        final SubLObject sequence_end = advance_xml_tokens_to(sequence_start, sequence_match_end_string, UNPROVIDED);
        if (NIL != sequence_end) {
            final SubLObject sequence_after_end = sequence_end.rest();
            return ldiff(sequence_start, sequence_after_end);
        }
        return NIL;
    }

    public static SubLObject accumulate_xml_token(final SubLObject token) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p($xml_token_accumulator$.getDynamicValue(thread))) {
            $xml_token_accumulator$.setDynamicValue(cons(token, $xml_token_accumulator$.getDynamicValue(thread)), thread);
        }
        return token;
    }

    public static SubLObject accumulate_xml_tokens(final SubLObject tokens, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p($xml_token_accumulator$.getDynamicValue(thread))) {
            SubLObject done_count = ZERO_INTEGER;
            SubLObject doneP = numGE(done_count, n);
            if (NIL == doneP) {
                SubLObject csome_list_var = tokens;
                SubLObject token = NIL;
                token = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    accumulate_xml_token(token);
                    done_count = add(done_count, ONE_INTEGER);
                    doneP = numGE(done_count, n);
                    csome_list_var = csome_list_var.rest();
                    token = csome_list_var.first();
                } 
            }
        }
        return tokens;
    }

    public static SubLObject accumulated_xml_tokens() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != misc_utilities.initialized_p($xml_token_accumulator$.getDynamicValue(thread)) ? nreverse($xml_token_accumulator$.getDynamicValue(thread)) : NIL;
    }

    public static SubLObject xml_tokens_for_next_element(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $xml_token_accumulator$.currentBinding(thread);
        try {
            $xml_token_accumulator$.bind(NIL, thread);
            advance_xml_tokens_to_end_of_element(tokens);
            ans = accumulated_xml_tokens();
        } finally {
            $xml_token_accumulator$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject advance_xml_tokens_to_end_of_element(final SubLObject tokens) {
        assert NIL != xml_tagP(tokens.first()) : "xml_parsing_utilities.xml_tagP(tokens.first()) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_tagP(tokens.first()) " + tokens.first();
        final SubLObject element_name = xml_token_element_name(tokens.first());
        return advance_xml_tokens_to_end_of_element_int(tokens, element_name);
    }

    public static SubLObject advance_xml_tokens_to_end_of_element_int(final SubLObject tokens, final SubLObject element_name) {
        SubLObject first_token = NIL;
        SubLObject rest_of_tokens = NIL;
        destructuring_bind_must_consp(tokens, tokens, $list86);
        first_token = tokens.first();
        final SubLObject current = rest_of_tokens = tokens.rest();
        if ((NIL != xml_closing_tokenP(element_name, first_token)) || ((NIL != xml_token_element_nameP(first_token, element_name)) && (NIL != xml_empty_tagP(first_token)))) {
            accumulate_xml_token(first_token);
            return rest_of_tokens;
        }
        SubLObject next_position = next_xml_token_position(rest_of_tokens, element_name, $sym87$XML_TOKEN_ELEMENT_NAME_);
        SubLObject next_occurrence = (NIL != next_position) ? nth(next_position, rest_of_tokens) : NIL;
        if (NIL == next_position) {
            Errors.sublisp_break($str88$Couldn_t_find_position_of__S_in__, new SubLObject[]{ element_name, rest_of_tokens });
        }
        SubLObject ans;
        for (ans = rest_of_tokens; NIL != xml_empty_tagP(next_occurrence); next_occurrence = (NIL != next_position) ? nth(next_position, ans) : NIL) {
            ans = advance_xml_tokens(ans, number_utilities.f_1X(next_position));
            next_position = next_xml_token_position(ans, element_name, $sym87$XML_TOKEN_ELEMENT_NAME_);
        }
        if (NIL != xml_closing_tag_p(next_occurrence)) {
            accumulate_xml_tokens(tokens, number_utilities.f_1X(number_utilities.f_1X(next_position)));
            return advance_xml_tokens(ans, number_utilities.f_1X(next_position));
        }
        while (NIL == xml_closing_tag_p(next_occurrence)) {
            final SubLObject at_next_start = advance_xml_tokens(ans, next_position);
            final SubLObject after_next_end = ans = advance_xml_tokens_to_end_of_element_int(at_next_start, element_name);
            next_position = next_xml_token_position(ans, element_name, $sym87$XML_TOKEN_ELEMENT_NAME_);
            next_occurrence = (NIL != next_position) ? nth(next_position, ans) : NIL;
        } 
        return NIL != ans ? advance_xml_tokens_to_end_of_element_int(ans, element_name) : NIL;
    }

    public static SubLObject xml_declaration_p(final SubLObject v_object) {
        return xml_token_element_nameP(v_object, $str89$_xml);
    }

    public static SubLObject xml_comment_p(final SubLObject v_object) {
        return makeBoolean((v_object.isString() && (NIL != string_utilities.starts_with(v_object, $str90$____))) && (NIL != string_utilities.ends_with(v_object, $str91$___, UNPROVIDED)));
    }

    public static SubLObject xml_closing_tag_p(final SubLObject token) {
        return makeBoolean(((token.isString() && (NIL != xml_tagP(token))) && (NIL != list_utilities.lengthG(token, TWO_INTEGER, UNPROVIDED))) && CHAR_slash.eql(Strings.sublisp_char(token, ONE_INTEGER)));
    }

    public static SubLObject xml_opening_tag_p(final SubLObject token) {
        return makeBoolean(((((((NIL != xml_tagP(token)) && (NIL == xml_declaration_p(token))) && (NIL == xml_doctype_tag_p(token))) && (NIL == xml_comment_p(token))) && (NIL == xml_empty_tagP(token))) && (NIL == xml_closing_tag_p(token))) && (NIL == xml_processing_instruction_p(token)));
    }

    public static SubLObject advance_xml_tokens_without_crossing(SubLObject tokens, final SubLObject target_string, final SubLObject forbidden_string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = XML_TOKEN_MENTIONS;
        }
        while (((NIL != tokens) && (NIL == funcall(test, tokens.first(), target_string))) && (NIL == funcall(test, tokens.first(), forbidden_string))) {
            tokens = tokens.rest();
        } 
        return tokens;
    }

    public static SubLObject advance_xml_tokens_without_crossing_or_quit(SubLObject tokens, final SubLObject target_string, final SubLObject forbidden_string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = XML_TOKEN_MENTIONS;
        }
        tokens = advance_xml_tokens_without_crossing(tokens, target_string, forbidden_string, test);
        if ((NIL != tokens) && (NIL == funcall(test, tokens.first(), forbidden_string))) {
            return tokens;
        }
        return NIL;
    }

    public static SubLObject xml_read(final SubLObject in_stream, SubLObject scratch_stream, SubLObject token_output_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        if (token_output_stream == UNPROVIDED) {
            token_output_stream = make_private_string_output_stream();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_output(scratch_stream);
        clear_output(token_output_stream);
        thread.resetMultipleValues();
        final SubLObject pretext = web_utilities.read_until_char(in_stream, CHAR_less, scratch_stream);
        final SubLObject eof = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != eof) {
            return values(pretext, NIL);
        }
        final SubLObject bracket_alist = $list92;
        final SubLObject brackets = $list93;
        SubLObject open_bracket_stack = list(CHAR_less);
        SubLObject abortP = NIL;
        princ(CHAR_less, token_output_stream);
        SubLObject within_commentP = NIL;
        SubLObject within_cdataP = NIL;
        while ((NIL != open_bracket_stack) && (NIL == abortP)) {
            thread.resetMultipleValues();
            final SubLObject partial_tag_text = web_utilities.read_until_one_of(in_stream, brackets, scratch_stream);
            final SubLObject v_char = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (partial_tag_text.isString()) {
                princ(partial_tag_text, token_output_stream);
                if ((NIL == within_commentP) && (NIL != string_utilities.starts_with(partial_tag_text, $str94$___))) {
                    within_commentP = T;
                }
                if ((NIL == within_cdataP) && (NIL != string_utilities.starts_with(partial_tag_text, $str95$__CDATA_))) {
                    within_cdataP = T;
                }
            }
            if (NIL == v_char) {
                abortP = T;
            } else
                if (NIL != within_commentP) {
                    princ(v_char, token_output_stream);
                    if ((NIL == string_utilities.ends_with(partial_tag_text, $str96$__, UNPROVIDED)) || (!v_char.eql(CHAR_greater))) {
                        continue;
                    }
                    open_bracket_stack = open_bracket_stack.rest();
                } else
                    if (NIL != within_cdataP) {
                        princ(v_char, token_output_stream);
                        if ((NIL == string_utilities.ends_with(partial_tag_text, $str97$__, UNPROVIDED)) || (!v_char.eql(CHAR_greater))) {
                            continue;
                        }
                        open_bracket_stack = open_bracket_stack.rest();
                    } else
                        if (v_char.eql(list_utilities.alist_lookup_without_values(bracket_alist, open_bracket_stack.first(), UNPROVIDED, UNPROVIDED))) {
                            princ(v_char, token_output_stream);
                            open_bracket_stack = open_bracket_stack.rest();
                        } else
                            if (NIL != list_utilities.alist_lookup_without_values(bracket_alist, v_char, UNPROVIDED, UNPROVIDED)) {
                                princ(v_char, token_output_stream);
                                open_bracket_stack = cons(v_char, open_bracket_stack);
                            } else {
                                Errors.error($str98$Mismatched_closing_bracket__S_fol, v_char, partial_tag_text, list_utilities.alist_lookup_without_values(bracket_alist, open_bracket_stack.first(), UNPROVIDED, UNPROVIDED));
                            }




        } 
        return NIL != abortP ? values(pretext, NIL) : values(pretext, get_output_stream_string(token_output_stream));
    }

    public static SubLObject xml_doctype_tag_p(final SubLObject token) {
        return makeBoolean(token.isString() && (NIL != xml_token_element_nameP(token, $str99$_DOCTYPE)));
    }

    public static SubLObject html_doctype_tag_p(final SubLObject token) {
        return makeBoolean((NIL != xml_doctype_tag_p(token)) && (NIL != string_utilities.starts_with_by_test(token, $str100$__DOCTYPE_HTML_, symbol_function(EQUALP))));
    }

    public static SubLObject xml_processing_instruction_p(final SubLObject token) {
        return makeBoolean((NIL != string_utilities.starts_with(token, $str101$__)) && (NIL != string_utilities.ends_with(token, $str102$__, UNPROVIDED)));
    }

    public static SubLObject entity_map_from_doctype_tag(final SubLObject token) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject chunks = string_utilities.string_tokenize(token, cons(CHAR_lbracket, cons(CHAR_rbracket, string_utilities.whitespace_chars())), NIL, NIL, T, NIL, $list103);
        SubLObject map = NIL;
        SubLObject current;
        final SubLObject datum = current = chunks;
        SubLObject doctype = NIL;
        SubLObject name = NIL;
        SubLObject open_bracket = NIL;
        SubLObject rest = NIL;
        destructuring_bind_must_consp(current, datum, $list104);
        doctype = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list104);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list104);
        open_bracket = current.first();
        current = rest = current.rest();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!doctype.equal($str105$__DOCTYPE))) {
            Errors.error($str106$Got__S_instead_of___DOCTYPE_, doctype);
        }
        if (open_bracket.equal($str107$_)) {
            SubLObject doneP = NIL;
            while ((NIL == doneP) && (NIL == list_utilities.empty_list_p(rest))) {
                final SubLObject next_pos = position($str108$__ENTITY, rest, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == next_pos) {
                    doneP = T;
                } else
                    if (NIL != list_utilities.lengthG(rest, add(next_pos, THREE_INTEGER), UNPROVIDED)) {
                        final SubLObject abbrev = cconcatenate($str109$_, new SubLObject[]{ nth(add(next_pos, ONE_INTEGER), rest), $str110$_ });
                        final SubLObject raw_url_string = nth(add(next_pos, TWO_INTEGER), rest);
                        final SubLObject url_string = string_utilities.nchar_subst(CHAR_quotation, CHAR_quote, raw_url_string);
                        final SubLObject expansion = read_from_string(url_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        map = list_utilities.alist_enter(map, abbrev, expansion, UNPROVIDED);
                        rest = nthcdr(add(next_pos, THREE_INTEGER), rest);
                    } else {
                        doneP = T;
                    }

            } 
        }
        return map;
    }

    public static SubLObject resolve_entity_references(final SubLObject token, final SubLObject entity_map) {
        final SubLObject ans = resolve_predefined_xml_entities(string_utilities.do_string_substitutions_robust(token, entity_map, symbol_function(EQUAL)));
        return ans;
    }

    public static SubLObject resolve_predefined_xml_entities(SubLObject string) {
        SubLObject cdolist_list_var = xml_vars.$xml_predefined_entities$.getGlobalValue();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject name = NIL;
            SubLObject code = NIL;
            destructuring_bind_must_consp(current, datum, $list111);
            name = current.first();
            current = code = current.rest();
            if (NIL != search(name, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                string = string_utilities.string_substitute(Strings.make_string(ONE_INTEGER, code_char(code)), cconcatenate($str109$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str110$_ }), string, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return string;
    }

    public static SubLObject remove_xml_comments(final SubLObject xml_string) {
        final SubLObject xml_tokens = xml_string_tokenize(xml_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            SubLObject cdolist_list_var = xml_tokens;
            SubLObject token = NIL;
            token = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == xml_comment_p(token)) {
                    princ(token, s);
                }
                cdolist_list_var = cdolist_list_var.rest();
                token = cdolist_list_var.first();
            } 
            result = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static SubLObject parse_xml_token(final SubLObject token) {
        return parse_xml_token_int(token, UNPROVIDED);
    }

    public static SubLObject parse_html_token(final SubLObject token) {
        return parse_xml_token_int(token, NIL);
    }

    public static SubLObject parse_xml_token_int_internal(final SubLObject token, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = T;
        }
        final SubLObject space_pos = position_if(WHITESPACEP, token, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject token_length = length(token);
        final SubLObject contents_end = ((NIL != xml_empty_tagP(token)) || (NIL != xml_declaration_p(token))) ? subtract(token_length, TWO_INTEGER) : subtract(token_length, ONE_INTEGER);
        SubLObject v_answer = list(xml_token_element_name(token));
        SubLObject read_keyP = NIL;
        SubLObject found_equal_signP = NIL;
        SubLObject quote_char = NIL;
        SubLObject key_start = NIL;
        SubLObject key_end = NIL;
        SubLObject value_start = NIL;
        SubLObject value_end = NIL;
        if (NIL != space_pos) {
            SubLObject end_var_$21;
            SubLObject end_var;
            SubLObject i;
            SubLObject c;
            SubLObject done_with_keyP;
            SubLObject pcase_var;
            SubLObject pair;
            for (end_var = end_var_$21 = (NIL != contents_end) ? contents_end : length(token), i = NIL, i = number_utilities.f_1X(space_pos); !i.numGE(end_var_$21); i = number_utilities.f_1X(i)) {
                c = Strings.sublisp_char(token, i);
                done_with_keyP = NIL;
                if (NIL != read_keyP) {
                    if (NIL != quote_char) {
                        if (c.eql(quote_char)) {
                            quote_char = NIL;
                            if (NIL == value_start) {
                                value_start = i;
                            }
                            value_end = number_utilities.f_1_(i);
                            done_with_keyP = T;
                            read_keyP = NIL;
                        } else
                            if (quote_char.eql(CHAR_null) && ((c.eql(CHAR_greater) || (NIL != string_utilities.whitespacep(c))) || number_utilities.f_1X(i).eql(contents_end))) {
                                quote_char = NIL;
                                value_end = (NIL != string_utilities.whitespacep(c)) ? subtract(i, ONE_INTEGER) : i;
                                done_with_keyP = T;
                                read_keyP = NIL;
                            } else
                                if (NIL == value_start) {
                                    value_start = (quote_char.eql(CHAR_null)) ? subtract(i, ONE_INTEGER) : i;
                                }


                    } else {
                        pcase_var = c;
                        if (pcase_var.eql(CHAR_quotation) || pcase_var.eql(CHAR_quote)) {
                            if (NIL == found_equal_signP) {
                                Errors.error($str114$XML_syntax_error__No___before__S, string_utilities.substring(token, i, UNPROVIDED));
                            }
                            quote_char = c;
                        } else
                            if (pcase_var.eql(CHAR_equal)) {
                                found_equal_signP = T;
                            } else
                                if (NIL == string_utilities.whitespacep(c)) {
                                    if (NIL != strictP) {
                                        Errors.error($str115$XML_syntax_error__Value_starting_, string_utilities.substring(token, i, UNPROVIDED));
                                    } else {
                                        quote_char = CHAR_null;
                                    }
                                }


                    }
                } else {
                    pcase_var = c;
                    if ((((pcase_var.eql(CHAR_space) || pcase_var.eql(CHAR_tab)) || pcase_var.eql(CHAR_return)) || pcase_var.eql(CHAR_newline)) || pcase_var.eql(CHAR_equal)) {
                        if (CHAR_equal.eql(c)) {
                            found_equal_signP = T;
                        }
                        if (NIL != key_start) {
                            read_keyP = T;
                            key_end = number_utilities.f_1_(i);
                        }
                    } else
                        if (NIL != key_start) {
                            key_end = i;
                        } else {
                            key_start = i;
                        }

                }
                if ((NIL != key_start) && (NIL != done_with_keyP)) {
                    pair = xml_attribute_value_pair_from_token(token, key_start, key_end, value_start, value_end);
                    v_answer = cons(pair, v_answer);
                    key_start = NIL;
                    key_end = NIL;
                    value_start = NIL;
                    value_end = NIL;
                    found_equal_signP = NIL;
                }
            }
        }
        if (NIL != key_start) {
            final SubLObject pair2 = xml_attribute_value_pair_from_token(token, key_start, key_end, value_start, value_end);
            v_answer = cons(pair2, v_answer);
        }
        return nreverse(v_answer);
    }

    public static SubLObject parse_xml_token_int(final SubLObject token, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return parse_xml_token_int_internal(token, strictP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PARSE_XML_TOKEN_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PARSE_XML_TOKEN_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PARSE_XML_TOKEN_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(token, strictP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (token.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && strictP.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(parse_xml_token_int_internal(token, strictP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(token, strictP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject xml_attribute_value_pair_from_token(final SubLObject token, final SubLObject attribute_name_start, final SubLObject attribute_name_end, final SubLObject value_start, final SubLObject value_end) {
        final SubLObject attribute_name = unicode_strings.html_escaped_to_utf8_string(string_utilities.substring(token, attribute_name_start, number_utilities.f_1X(attribute_name_end)));
        final SubLObject value = (NIL != value_start) ? unicode_strings.html_escaped_to_utf8_string(string_utilities.substring(token, value_start, number_utilities.f_1X(value_end))) : NIL;
        assert NIL != xml_utilities.valid_xml_name_p(attribute_name) : "xml_utilities.valid_xml_name_p(attribute_name) " + "CommonSymbols.NIL != xml_utilities.valid_xml_name_p(attribute_name) " + attribute_name;
        return cons(attribute_name, value);
    }

    public static SubLObject xml_tagP(final SubLObject token) {
        return makeBoolean(((token.isString() && (NIL != list_utilities.lengthGE(token, THREE_INTEGER, UNPROVIDED))) && CHAR_less.eql(string_utilities.first_char(token))) && CHAR_greater.eql(string_utilities.last_char(token)));
    }

    public static SubLObject regular_xml_tagP(final SubLObject token) {
        return makeBoolean((((NIL != xml_tagP(token)) && (NIL == xml_declaration_p(token))) && (NIL == xml_doctype_tag_p(token))) && (NIL == xml_comment_p(token)));
    }

    public static SubLObject xml_empty_tagP(final SubLObject token) {
        return makeBoolean((NIL != xml_tagP(token)) && CHAR_slash.eql(string_utilities.char_from_end(token, ONE_INTEGER)));
    }

    public static SubLObject xml_cdata_tagP(final SubLObject token) {
        return makeBoolean(((NIL != xml_tagP(token)) && (NIL != string_utilities.starts_with_by_test(token, xml_utilities.xml_cdata_prefix(), symbol_function(EQUAL)))) && (NIL != string_utilities.ends_with(token, xml_utilities.xml_cdata_suffix(), symbol_function(EQUAL))));
    }

    public static SubLObject xml_cdata_tag_text(final SubLObject tag) {
        assert NIL != xml_cdata_tagP(tag) : "xml_parsing_utilities.xml_cdata_tagP(tag) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_cdata_tagP(tag) " + tag;
        return string_utilities.substring(tag, length(xml_utilities.xml_cdata_prefix()), subtract(length(tag), length(xml_utilities.xml_cdata_suffix())));
    }

    public static SubLObject xml_closing_tokenP(final SubLObject element_name, final SubLObject token) {
        return makeBoolean(((NIL != xml_tagP(token)) && (NIL != xml_closing_tag_p(token))) && (NIL != xml_token_element_nameP(token, element_name)));
    }

    public static SubLObject xml_opening_tokenP(final SubLObject element_name, final SubLObject token) {
        return makeBoolean(((NIL != xml_tagP(token)) && (NIL != xml_opening_tag_p(token))) && (NIL != xml_token_element_nameP(token, element_name)));
    }

    public static SubLObject xml_token_element_nameP(final SubLObject token, final SubLObject element_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(token) : "Types.stringp(token) " + "CommonSymbols.NIL != Types.stringp(token) " + token;
        if (NIL == xml_tagP(token)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject element_name_start = xml_token_element_name_start_and_end(token);
        final SubLObject element_name_end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean((NIL != list_utilities.lengthE(element_name, subtract(element_name_end, element_name_start), UNPROVIDED)) && (NIL != string_utilities.substring_matchP(token, element_name, element_name_start, UNPROVIDED)));
    }

    public static SubLObject xml_token_element_name(final SubLObject token) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!token.isString())) {
            Errors.error($str119$_S_is_not_an_XML_token, token);
        }
        if (NIL == xml_tagP(token)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject element_name_start = xml_token_element_name_start_and_end(token);
        final SubLObject element_name_end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return string_utilities.substring(token, element_name_start, element_name_end);
    }

    public static SubLObject xml_token_element_name_start_and_end(final SubLObject token) {
        final SubLObject element_name_start = (CHAR_slash.eql(Strings.sublisp_char(token, ONE_INTEGER))) ? TWO_INTEGER : ONE_INTEGER;
        final SubLObject space_pos = position_if(WHITESPACEP, token, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject token_length = length(token);
        final SubLObject token_end = (NIL != xml_empty_tagP(token)) ? subtract(token_length, TWO_INTEGER) : subtract(token_length, ONE_INTEGER);
        final SubLObject element_name_end = (NIL != space_pos) ? space_pos : token_end;
        return values(element_name_start, element_name_end);
    }

    public static SubLObject xml_tokens_to_sexpr(final SubLObject tokens) {
        final SubLObject iterator = iteration.new_list_iterator(tokens);
        final SubLObject sexpr = xml_token_iterator_to_sexpr(iterator, UNPROVIDED);
        SubLObject remaining = NIL;
        while (NIL == iteration.iteration_done(iterator)) {
            remaining = cons(iteration.iteration_next(iterator), remaining);
        } 
        iteration.iteration_finalize(iterator);
        return values(sexpr, nreverse(remaining));
    }

    public static SubLObject xml_token_iterator_to_sexpr(final SubLObject token_iterator, SubLObject first_token) {
        if (first_token == UNPROVIDED) {
            first_token = NIL;
        }
        final SubLObject iteration_doneP = iteration.iteration_done(token_iterator);
        if ((NIL == first_token) && (NIL == iteration_doneP)) {
            first_token = iteration.iteration_next(token_iterator);
        }
        if (NIL != iteration_doneP) {
            return NIL;
        }
        if (NIL != xml_empty_tagP(first_token)) {
            return list(parse_xml_token(first_token));
        }
        if (NIL != xml_cdata_tagP(first_token)) {
            return xml_cdata_tag_text(first_token);
        }
        if (NIL == xml_tagP(first_token)) {
            return first_token;
        }
        return xml_token_iterator_to_sexpr_internal(token_iterator, first_token);
    }

    public static SubLObject xml_token_iterator_to_sexpr_internal(final SubLObject token_iterator, final SubLObject first_token) {
        if (NIL != non_content_xml_token_p(first_token)) {
            return xml_token_iterator_to_sexpr(token_iterator, UNPROVIDED);
        }
        final SubLObject head = parse_xml_token(first_token);
        SubLObject sexpr = list(head);
        SubLObject next_token;
        for (next_token = (NIL != iteration.iteration_done(token_iterator)) ? NIL : iteration.iteration_next(token_iterator); NIL != non_content_xml_token_p(next_token); next_token = (NIL != iteration.iteration_done(token_iterator)) ? NIL : iteration.iteration_next(token_iterator)) {
        }
        while (NIL == iteration.iteration_done(token_iterator)) {
            if (NIL != xml_closing_tokenP(head.first(), next_token)) {
                return reverse(sexpr);
            }
            final SubLObject subexpr = xml_token_iterator_to_sexpr(token_iterator, next_token);
            if (subexpr.isString()) {
                if (sexpr.first().isString()) {
                    final SubLObject old_value = sexpr.first();
                    final SubLObject new_value = cconcatenate(old_value, subexpr);
                    sexpr = sexpr.rest();
                    sexpr = cons(new_value, sexpr);
                } else
                    if (!$str120$.equal(string_utilities.trim_whitespace(subexpr))) {
                        sexpr = cons(subexpr, sexpr);
                    }

            } else {
                sexpr = cons(subexpr, sexpr);
            }
            next_token = (NIL != iteration.iteration_done(token_iterator)) ? NIL : iteration.iteration_next(token_iterator);
        } 
        return reverse(sexpr);
    }

    public static SubLObject xml_tag_attribute_value(final SubLObject tag, final SubLObject attribute, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != xml_tagP(tag) : "xml_parsing_utilities.xml_tagP(tag) " + "CommonSymbols.NIL != xml_parsing_utilities.xml_tagP(tag) " + tag;
        assert NIL != stringp(attribute) : "Types.stringp(attribute) " + "CommonSymbols.NIL != Types.stringp(attribute) " + attribute;
        final SubLObject attributes = parse_xml_token(tag).rest();
        return list_utilities.alist_lookup_without_values(attributes, attribute, symbol_function($sym121$STRING_), v_default);
    }

    public static SubLObject non_content_xml_token_p(final SubLObject token) {
        return makeBoolean((((NIL != xml_declaration_p(token)) || (NIL != xml_doctype_tag_p(token))) || (NIL != xml_comment_p(token))) || (NIL != xml_processing_instruction_p(token)));
    }

    public static SubLObject get_field_value_from_xml_sexpr(final SubLObject field, final SubLObject sexpr) {
        SubLObject cdolist_list_var = sexpr.rest();
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (child.first().first().equal(field)) {
                return second(child);
            }
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject xml_sexpr_tag(final SubLObject sexpr) {
        return sexpr.first();
    }

    public static SubLObject xml_sexpr_type(final SubLObject sexpr) {
        return xml_sexpr_tag(sexpr).first();
    }

    public static SubLObject xml_sexpr_daughter(final SubLObject sexpr, final SubLObject tag) {
        SubLObject cdolist_list_var = xml_sexpr_daughters(sexpr, UNPROVIDED);
        SubLObject daughter = NIL;
        daughter = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Strings.stringE(xml_sexpr_type(daughter), tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return daughter;
            }
            cdolist_list_var = cdolist_list_var.rest();
            daughter = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject xml_sexpr_daughters(final SubLObject sexpr, SubLObject tag) {
        if (tag == UNPROVIDED) {
            tag = NIL;
        }
        if (NIL != tag) {
            SubLObject daughters = NIL;
            SubLObject cdolist_list_var = sexpr.rest();
            SubLObject daughter = NIL;
            daughter = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (daughter.isList() && (NIL != Strings.stringE(xml_sexpr_type(daughter), tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    daughters = cons(daughter, daughters);
                }
                cdolist_list_var = cdolist_list_var.rest();
                daughter = cdolist_list_var.first();
            } 
            return nreverse(daughters);
        }
        return sexpr.rest();
    }

    public static SubLObject xml_sexpr_attributes(final SubLObject sexpr) {
        return xml_sexpr_tag(sexpr).rest();
    }

    public static SubLObject xml_sexpr_attribute_value(final SubLObject sexpr, final SubLObject attribute) {
        return assoc(attribute, xml_sexpr_attributes(sexpr), $sym121$STRING_, UNPROVIDED).rest();
    }

    public static SubLObject xml_sexpr_set_attribute(final SubLObject sexpr, final SubLObject key, final SubLObject value) {
        final SubLObject attributes = list_utilities.alist_enter(xml_sexpr_attributes(sexpr), key, value, symbol_function($sym121$STRING_));
        rplacd(xml_sexpr_tag(sexpr), attributes);
        return sexpr;
    }

    public static SubLObject xml_sexpr_atomic_p(final SubLObject sexpr) {
        return list_utilities.empty_list_p(xml_sexpr_daughters(sexpr, UNPROVIDED));
    }

    public static SubLObject xml_sexpr_wXsingle_valueP(final SubLObject sexpr) {
        final SubLObject dtrs = xml_sexpr_daughters(sexpr, UNPROVIDED);
        return makeBoolean((NIL != list_utilities.singletonP(dtrs)) && dtrs.first().isString());
    }

    public static SubLObject xml_sexpr_value(final SubLObject sexpr) {
        return xml_sexpr_daughters(sexpr, UNPROVIDED).first();
    }

    public static SubLObject declare_xml_parsing_utilities_file() {
        declareFunction("xml_tokenize", "XML-TOKENIZE", 1, 3, false);
        declareFunction("new_xml_token_iterator", "NEW-XML-TOKEN-ITERATOR", 1, 3, false);
        declareFunction("xml_token_iterator_state_print_function_trampoline", "XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("xml_token_iterator_state_p", "XML-TOKEN-ITERATOR-STATE-P", 1, 0, false);
        new xml_parsing_utilities.$xml_token_iterator_state_p$UnaryFunction();
        declareFunction("xml_it_state_in_stream", "XML-IT-STATE-IN-STREAM", 1, 0, false);
        declareFunction("xml_it_state_scratch_stream", "XML-IT-STATE-SCRATCH-STREAM", 1, 0, false);
        declareFunction("xml_it_state_token_output_stream", "XML-IT-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false);
        declareFunction("xml_it_state_entity_map", "XML-IT-STATE-ENTITY-MAP", 1, 0, false);
        declareFunction("xml_it_state_namespace_stack", "XML-IT-STATE-NAMESPACE-STACK", 1, 0, false);
        declareFunction("xml_it_state_validateP", "XML-IT-STATE-VALIDATE?", 1, 0, false);
        declareFunction("xml_it_state_resolve_entity_referencesP", "XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false);
        declareFunction("xml_it_state_resolve_namespacesP", "XML-IT-STATE-RESOLVE-NAMESPACES?", 1, 0, false);
        declareFunction("xml_it_state_on_deck_queue", "XML-IT-STATE-ON-DECK-QUEUE", 1, 0, false);
        declareFunction("_csetf_xml_it_state_in_stream", "_CSETF-XML-IT-STATE-IN-STREAM", 2, 0, false);
        declareFunction("_csetf_xml_it_state_scratch_stream", "_CSETF-XML-IT-STATE-SCRATCH-STREAM", 2, 0, false);
        declareFunction("_csetf_xml_it_state_token_output_stream", "_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM", 2, 0, false);
        declareFunction("_csetf_xml_it_state_entity_map", "_CSETF-XML-IT-STATE-ENTITY-MAP", 2, 0, false);
        declareFunction("_csetf_xml_it_state_namespace_stack", "_CSETF-XML-IT-STATE-NAMESPACE-STACK", 2, 0, false);
        declareFunction("_csetf_xml_it_state_validateP", "_CSETF-XML-IT-STATE-VALIDATE?", 2, 0, false);
        declareFunction("_csetf_xml_it_state_resolve_entity_referencesP", "_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 2, 0, false);
        declareFunction("_csetf_xml_it_state_resolve_namespacesP", "_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?", 2, 0, false);
        declareFunction("_csetf_xml_it_state_on_deck_queue", "_CSETF-XML-IT-STATE-ON-DECK-QUEUE", 2, 0, false);
        declareFunction("make_xml_token_iterator_state", "MAKE-XML-TOKEN-ITERATOR-STATE", 0, 1, false);
        declareFunction("visit_defstruct_xml_token_iterator_state", "VISIT-DEFSTRUCT-XML-TOKEN-ITERATOR-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_xml_token_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-XML-TOKEN-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction("print_xml_token_iterator_state", "PRINT-XML-TOKEN-ITERATOR-STATE", 3, 0, false);
        declareFunction("new_xml_token_iterator_state", "NEW-XML-TOKEN-ITERATOR-STATE", 9, 0, false);
        declareFunction("xml_token_iterator_state_in_stream", "XML-TOKEN-ITERATOR-STATE-IN-STREAM", 1, 0, false);
        declareFunction("xml_token_iterator_state_scratch_stream", "XML-TOKEN-ITERATOR-STATE-SCRATCH-STREAM", 1, 0, false);
        declareFunction("xml_token_iterator_state_token_output_stream", "XML-TOKEN-ITERATOR-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false);
        declareFunction("xml_token_iterator_state_entity_map", "XML-TOKEN-ITERATOR-STATE-ENTITY-MAP", 1, 0, false);
        declareFunction("xml_token_iterator_state_namespace_stack", "XML-TOKEN-ITERATOR-STATE-NAMESPACE-STACK", 1, 0, false);
        declareFunction("xml_token_iterator_state_validateP", "XML-TOKEN-ITERATOR-STATE-VALIDATE?", 1, 0, false);
        declareFunction("xml_token_iterator_state_resolve_entity_referencesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false);
        declareFunction("xml_token_iterator_state_resolve_namespacesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-NAMESPACES?", 1, 0, false);
        declareFunction("xml_token_iterator_state_on_deck_queue", "XML-TOKEN-ITERATOR-STATE-ON-DECK-QUEUE", 1, 0, false);
        declareFunction("xml_token_iterator_state_peek", "XML-TOKEN-ITERATOR-STATE-PEEK", 1, 0, false);
        declareFunction("advance_xml_token_iterator_to_next_element", "ADVANCE-XML-TOKEN-ITERATOR-TO-NEXT-ELEMENT", 1, 0, false);
        declareFunction("xml_token_iterator_progress", "XML-TOKEN-ITERATOR-PROGRESS", 1, 0, false);
        declareFunction("make_iterator_xml_token_state", "MAKE-ITERATOR-XML-TOKEN-STATE", 4, 0, false);
        declareFunction("iterate_xml_token_done", "ITERATE-XML-TOKEN-DONE", 1, 0, false);
        declareFunction("iterate_xml_token_next", "ITERATE-XML-TOKEN-NEXT", 1, 0, false);
        declareFunction("ensure_xml_token_on_deck_queue_populated", "ENSURE-XML-TOKEN-ON-DECK-QUEUE-POPULATED", 1, 0, false);
        declareFunction("xml_iterator_state_handle_namespaces_and_entities", "XML-ITERATOR-STATE-HANDLE-NAMESPACES-AND-ENTITIES", 2, 0, false);
        declareFunction("handle_xml_namespaces", "HANDLE-XML-NAMESPACES", 3, 0, false);
        declareFunction("xml_namespace_mapping_p", "XML-NAMESPACE-MAPPING-P", 1, 0, false);
        declareFunction("validate_xml_namespaces", "VALIDATE-XML-NAMESPACES", 2, 0, false);
        declareFunction("maybe_validate_xml_namespace", "MAYBE-VALIDATE-XML-NAMESPACE", 3, 0, false);
        declareFunction("validate_xml_namespace", "VALIDATE-XML-NAMESPACE", 3, 0, false);
        declareFunction("xml_prefixed_name_p", "XML-PREFIXED-NAME-P", 1, 0, false);
        declareFunction("xml_prefixed_name_namespace", "XML-PREFIXED-NAME-NAMESPACE", 1, 0, false);
        declareFunction("xml_prefixed_name_local_name", "XML-PREFIXED-NAME-LOCAL-NAME", 1, 0, false);
        declareFunction("xml_string_tokenize", "XML-STRING-TOKENIZE", 1, 3, false);
        declareFunction("xml_tokenized_http_request", "XML-TOKENIZED-HTTP-REQUEST", 2, 9, false);
        declareFunction("xml_tokenized_http_request_internal", "XML-TOKENIZED-HTTP-REQUEST-INTERNAL", 9, 0, false);
        declareMacro("html_tokenize", "HTML-TOKENIZE");
        declareFunction("xml_token_matches_exactly", "XML-TOKEN-MATCHES-EXACTLY", 2, 0, false);
        declareFunction("xml_token_matches", "XML-TOKEN-MATCHES", 2, 0, false);
        declareFunction("xml_token_starts_with", "XML-TOKEN-STARTS-WITH", 2, 0, false);
        declareFunction("xml_token_mentions", "XML-TOKEN-MENTIONS", 2, 0, false);
        new xml_parsing_utilities.$xml_token_mentions$BinaryFunction();
        declareFunction("next_xml_token_position", "NEXT-XML-TOKEN-POSITION", 2, 1, false);
        declareFunction("next_xml_token_position_if", "NEXT-XML-TOKEN-POSITION-IF", 2, 0, false);
        declareFunction("next_xml_token_position_if_not", "NEXT-XML-TOKEN-POSITION-IF-NOT", 2, 0, false);
        declareFunction("advance_xml_tokens", "ADVANCE-XML-TOKENS", 1, 1, false);
        declareFunction("advance_xml_tokens_to", "ADVANCE-XML-TOKENS-TO", 2, 1, false);
        declareFunction("xml_extract_token_sequence", "XML-EXTRACT-TOKEN-SEQUENCE", 2, 0, false);
        declareFunction("accumulate_xml_token", "ACCUMULATE-XML-TOKEN", 1, 0, false);
        declareFunction("accumulate_xml_tokens", "ACCUMULATE-XML-TOKENS", 2, 0, false);
        declareFunction("accumulated_xml_tokens", "ACCUMULATED-XML-TOKENS", 0, 0, false);
        declareFunction("xml_tokens_for_next_element", "XML-TOKENS-FOR-NEXT-ELEMENT", 1, 0, false);
        declareFunction("advance_xml_tokens_to_end_of_element", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT", 1, 0, false);
        declareFunction("advance_xml_tokens_to_end_of_element_int", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT-INT", 2, 0, false);
        declareFunction("xml_declaration_p", "XML-DECLARATION-P", 1, 0, false);
        declareFunction("xml_comment_p", "XML-COMMENT-P", 1, 0, false);
        declareFunction("xml_closing_tag_p", "XML-CLOSING-TAG-P", 1, 0, false);
        declareFunction("xml_opening_tag_p", "XML-OPENING-TAG-P", 1, 0, false);
        declareFunction("advance_xml_tokens_without_crossing", "ADVANCE-XML-TOKENS-WITHOUT-CROSSING", 3, 1, false);
        declareFunction("advance_xml_tokens_without_crossing_or_quit", "ADVANCE-XML-TOKENS-WITHOUT-CROSSING-OR-QUIT", 3, 1, false);
        declareFunction("xml_read", "XML-READ", 1, 2, false);
        declareFunction("xml_doctype_tag_p", "XML-DOCTYPE-TAG-P", 1, 0, false);
        declareFunction("html_doctype_tag_p", "HTML-DOCTYPE-TAG-P", 1, 0, false);
        declareFunction("xml_processing_instruction_p", "XML-PROCESSING-INSTRUCTION-P", 1, 0, false);
        declareFunction("entity_map_from_doctype_tag", "ENTITY-MAP-FROM-DOCTYPE-TAG", 1, 0, false);
        declareFunction("resolve_entity_references", "RESOLVE-ENTITY-REFERENCES", 2, 0, false);
        declareFunction("resolve_predefined_xml_entities", "RESOLVE-PREDEFINED-XML-ENTITIES", 1, 0, false);
        declareFunction("remove_xml_comments", "REMOVE-XML-COMMENTS", 1, 0, false);
        declareFunction("parse_xml_token", "PARSE-XML-TOKEN", 1, 0, false);
        declareFunction("parse_html_token", "PARSE-HTML-TOKEN", 1, 0, false);
        declareFunction("parse_xml_token_int_internal", "PARSE-XML-TOKEN-INT-INTERNAL", 1, 1, false);
        declareFunction("parse_xml_token_int", "PARSE-XML-TOKEN-INT", 1, 1, false);
        declareFunction("xml_attribute_value_pair_from_token", "XML-ATTRIBUTE-VALUE-PAIR-FROM-TOKEN", 5, 0, false);
        declareFunction("xml_tagP", "XML-TAG?", 1, 0, false);
        declareFunction("regular_xml_tagP", "REGULAR-XML-TAG?", 1, 0, false);
        declareFunction("xml_empty_tagP", "XML-EMPTY-TAG?", 1, 0, false);
        declareFunction("xml_cdata_tagP", "XML-CDATA-TAG?", 1, 0, false);
        declareFunction("xml_cdata_tag_text", "XML-CDATA-TAG-TEXT", 1, 0, false);
        declareFunction("xml_closing_tokenP", "XML-CLOSING-TOKEN?", 2, 0, false);
        declareFunction("xml_opening_tokenP", "XML-OPENING-TOKEN?", 2, 0, false);
        declareFunction("xml_token_element_nameP", "XML-TOKEN-ELEMENT-NAME?", 2, 0, false);
        declareFunction("xml_token_element_name", "XML-TOKEN-ELEMENT-NAME", 1, 0, false);
        declareFunction("xml_token_element_name_start_and_end", "XML-TOKEN-ELEMENT-NAME-START-AND-END", 1, 0, false);
        declareFunction("xml_tokens_to_sexpr", "XML-TOKENS-TO-SEXPR", 1, 0, false);
        declareFunction("xml_token_iterator_to_sexpr", "XML-TOKEN-ITERATOR-TO-SEXPR", 1, 1, false);
        declareFunction("xml_token_iterator_to_sexpr_internal", "XML-TOKEN-ITERATOR-TO-SEXPR-INTERNAL", 2, 0, false);
        declareFunction("xml_tag_attribute_value", "XML-TAG-ATTRIBUTE-VALUE", 2, 1, false);
        declareFunction("non_content_xml_token_p", "NON-CONTENT-XML-TOKEN-P", 1, 0, false);
        declareFunction("get_field_value_from_xml_sexpr", "GET-FIELD-VALUE-FROM-XML-SEXPR", 2, 0, false);
        declareFunction("xml_sexpr_tag", "XML-SEXPR-TAG", 1, 0, false);
        declareFunction("xml_sexpr_type", "XML-SEXPR-TYPE", 1, 0, false);
        declareFunction("xml_sexpr_daughter", "XML-SEXPR-DAUGHTER", 2, 0, false);
        declareFunction("xml_sexpr_daughters", "XML-SEXPR-DAUGHTERS", 1, 1, false);
        declareFunction("xml_sexpr_attributes", "XML-SEXPR-ATTRIBUTES", 1, 0, false);
        declareFunction("xml_sexpr_attribute_value", "XML-SEXPR-ATTRIBUTE-VALUE", 2, 0, false);
        declareFunction("xml_sexpr_set_attribute", "XML-SEXPR-SET-ATTRIBUTE", 3, 0, false);
        declareFunction("xml_sexpr_atomic_p", "XML-SEXPR-ATOMIC-P", 1, 0, false);
        declareFunction("xml_sexpr_wXsingle_valueP", "XML-SEXPR-W/SINGLE-VALUE?", 1, 0, false);
        declareFunction("xml_sexpr_value", "XML-SEXPR-VALUE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_xml_parsing_utilities_file() {
        defparameter("*REQUIRE-VALID-XML?*", NIL);
        defconstant("*DTP-XML-TOKEN-ITERATOR-STATE*", XML_TOKEN_ITERATOR_STATE);
        defparameter("*XML-TOKEN-ACCUMULATOR*", misc_utilities.uninitialized());
        return NIL;
    }

    public static SubLObject setup_xml_parsing_utilities_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_xml_token_iterator_state$.getGlobalValue(), symbol_function(XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list11);
        def_csetf(XML_IT_STATE_IN_STREAM, _CSETF_XML_IT_STATE_IN_STREAM);
        def_csetf(XML_IT_STATE_SCRATCH_STREAM, _CSETF_XML_IT_STATE_SCRATCH_STREAM);
        def_csetf(XML_IT_STATE_TOKEN_OUTPUT_STREAM, _CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM);
        def_csetf(XML_IT_STATE_ENTITY_MAP, _CSETF_XML_IT_STATE_ENTITY_MAP);
        def_csetf(XML_IT_STATE_NAMESPACE_STACK, _CSETF_XML_IT_STATE_NAMESPACE_STACK);
        def_csetf($sym22$XML_IT_STATE_VALIDATE_, $sym23$_CSETF_XML_IT_STATE_VALIDATE_);
        def_csetf($sym24$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_, $sym25$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_);
        def_csetf($sym26$XML_IT_STATE_RESOLVE_NAMESPACES_, $sym27$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_);
        def_csetf(XML_IT_STATE_ON_DECK_QUEUE, _CSETF_XML_IT_STATE_ON_DECK_QUEUE);
        identity(XML_TOKEN_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_xml_token_iterator_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_XML_TOKEN_ITERATOR_STATE_METHOD));
        note_funcall_helper_function(PRINT_XML_TOKEN_ITERATOR_STATE);
        note_funcall_helper_function(ITERATE_XML_TOKEN_DONE);
        note_funcall_helper_function(ITERATE_XML_TOKEN_NEXT);
        register_external_symbol(XML_TOKENIZED_HTTP_REQUEST);
        memoization_state.note_memoized_function(PARSE_XML_TOKEN_INT);
        define_test_case_table_int(XML_TOKENS_TO_SEXPR, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list129);
        define_test_case_table_int(PARSE_HTML_TOKEN, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list131);
        define_test_case_table_int(PARSE_XML_TOKEN, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list133);
        return NIL;
    }

    private static SubLObject _constant_133_initializer() {
        return list(new SubLObject[]{ list(list(makeString("<owl:onProperty/>")), list(makeString("owl:onProperty"))), list(list(makeString("<owl:Class rdf:ID=\"MarineEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MarineEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"PackIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PackIce")))), list(list(makeString("<owl:Class rdf:ID=\"SubmarineCanyon\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SubmarineCanyon")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Ocean\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Ocean")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SnowLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SnowLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Hydrosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Hydrosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Cryosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Cryosphere")))), list(list(makeString("<owl:Class rdf:ID=\"SedimentLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SedimentLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Lake\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Lake")))), list(list(makeString("<rdfs:range rdf:resource=\"#ClimateZoneType\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#ClimateZoneType")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Stratosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Stratosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Litter\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Litter")))), list(list(makeString("<owl:Class rdf:ID=\"Pond\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Pond")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D")))), list(list(makeString("<owl:Class rdf:ID=\"LowerMantle\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LowerMantle")))), list(list(makeString("<owl:Class rdf:about=\"#Catchment\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Catchment")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#MantleLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#MantleLayer")))), list(list(makeString("<owl:Class rdf:ID=\"TroposphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TroposphereLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart")))), list(list(makeString("<owl:Class rdf:ID=\"IntertidalZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IntertidalZone")))), list(list(makeString("<owl:Class rdf:ID=\"Cirque\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Cirque")))), list(list(makeString("<owl:Class rdf:ID=\"EcosystemType\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EcosystemType")))), list(list(makeString("<owl:Class rdf:ID=\"PeriglacialLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PeriglacialLandform")))), list(list(makeString("<owl:Class rdf:ID=\"Mantle\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mantle")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Hydrosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Hydrosphere")))), list(list(makeString("<owl:Class rdf:ID=\"TemperateClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TemperateClimateZone")))), list(list(makeString("<owl:Class rdf:ID=\"Fjord\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Fjord")))), list(list(makeString("<owl:Class rdf:ID=\"Ocean\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Ocean")))), list(list(makeString("<rdfs:domain rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"Felsic\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Felsic")))), list(list(makeString("<owl:Class rdf:ID=\"Beach\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Beach")))), list(list(makeString("<owl:Class rdf:ID=\"Core\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Core")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Basin\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Basin")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon")))), list(list(makeString("<owl:Class rdf:ID=\"Mesosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mesosphere")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Water\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Water")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Mesosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Mesosphere")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock")))), list(list(makeString("<owl:Class rdf:ID=\"Marsh\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Marsh")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/property.owl#Height\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/property.owl#Height")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/property.owl#Height\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/property.owl#Height")))), list(list(makeString("<owl:Class rdf:ID=\"SeaIceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaIceLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Geosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Geosphere")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Glacier\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Glacier")))), list(list(makeString("<owl:Class rdf:ID=\"Watershed\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Watershed")))), list(list(makeString("<owl:Class rdf:ID=\"Shoreline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Shoreline")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Crust\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Crust")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#haslowerBoundary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#haslowerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"RegionProperty\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RegionProperty")))), list(list(makeString("<owl:Class rdf:ID=\"MarineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MarineWetland")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/property.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/property.owl")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasUpperBoundary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasUpperBoundary")))), list(list(makeString("<owl:Class rdf:about=\"#VadoseZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#VadoseZone")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerLowerBoundaryOf\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerLowerBoundaryOf")))), list(list(makeString("<owl:Class rdf:ID=\"EstuarineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EstuarineWetland")))), list(list(makeString("<owl:Class rdf:ID=\"Volcano\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Volcano")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Region\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Region")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D")))), list(list(makeString("<owl:Class rdf:about=\"#OceanRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#OceanRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Stream\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Stream")))), list(list(makeString("<owl:Class rdf:about=\"#Ocean\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Ocean")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Mantle\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Mantle")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#TerrestrialEcosystem\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#TerrestrialEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"WaterTable\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterTable")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#TopographicalRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#TopographicalRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Spring\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Spring")))), list(list(makeString("<owl:Class rdf:ID=\"Tropopause\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Tropopause")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Troposphere\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Troposphere")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf")))), list(list(makeString("<owl:Class rdf:ID=\"WaterSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterSurfaceLayer")))), list(list(makeString("<owl:Class>")), list(makeString("owl:Class"))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Layer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Layer")))), list(list(makeString("<rdfs:range rdf:resource=\"#EcosystemType\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#EcosystemType")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#inside\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#inside")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfIce\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfIce")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#GeometricalObject\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#GeometricalObject")))), list(list(makeString("<owl:Class rdf:ID=\"Plateau\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Plateau")))), list(list(makeString("<owl:Class rdf:ID=\"AphoticZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AphoticZone")))), list(list(makeString("<owl:Class rdf:ID=\"IslandArc\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IslandArc")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaFloorWaterLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaFloorWaterLayer")))), list(list(makeString("<owl:Class rdf:about=\"#PlanetarySurfaceLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#PlanetarySurfaceLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar")))), list(list(makeString("<owl:Class rdf:ID=\"SeaSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaSurface")))), list(list(makeString("<owl:onProperty rdf:resource=\"#primarySubstance\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#primarySubstance")))), list(list(makeString("<owl:Class rdf:about=\"#Groundwater\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Groundwater")))), list(list(makeString("<owl:Class rdf:ID=\"FastIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FastIce")))), list(list(makeString("<owl:Class rdf:ID=\"Swamp\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Swamp")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandWaterObject\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandWaterObject")))), list(list(makeString("<owl:Class rdf:ID=\"PhoticZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PhoticZone")))), list(list(makeString("<rdfs:range rdf:resource=\"#EarthRealm\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<owl:Class rdf:ID=\"LandIceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandIceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#OceanRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#OceanRegion")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#EolianLandform\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#EolianLandform")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), list(list(makeString("<owl:Class rdf:ID=\"Rock_body\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Rock_body")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#SeaIceLayer\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#SeaIceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Farmland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Farmland")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaFloorRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaFloorRegion")))), list(list(makeString("<owl:onProperty rdf:resource=\"#hasGeomorphologicalType\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#hasGeomorphologicalType")))), list(list(makeString("<owl:Class rdf:about=\"#SeaFloorGroundLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#SeaFloorGroundLayer")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"#OceanRegion\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("#OceanRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#TerrestrialEcosystem\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#TerrestrialEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Sea\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Sea")))), list(list(makeString("<owl:Class rdf:ID=\"KarstLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("KarstLandform")))), list(list(makeString("<owl:Class rdf:ID=\"Troposphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Troposphere")))), list(list(makeString("<owl:Class rdf:ID=\"AlpineClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AlpineClimateZone")))), list(list(makeString("<owl:Class rdf:ID=\"GlacialLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GlacialLandform")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GroundWaterObjectBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GroundWaterObjectBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"BenticEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BenticEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Isopycnal\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Isopycnal")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetarySurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetarySurface")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CoastalRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CoastalRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#OceanRegion\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#OceanRegion")))), list(list(makeString("<owl:Class rdf:about=\"#LandRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandRegion")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#UndergroundWater\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#UndergroundWater")))), list(list(makeString("<owl:Class rdf:ID=\"Mafic\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mafic")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice")))), list(list(makeString("<owl:Class rdf:ID=\"Delta\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Delta")))), list(list(makeString("<owl:Class rdf:ID=\"SeaIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaIce")))), list(list(makeString("<owl:Class rdf:ID=\"Creek\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Creek")))), list(list(makeString("<owl:Class rdf:ID=\"LandRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Thermosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Thermosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Ridge\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Ridge")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SurfaceWater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SurfaceWater")))), list(list(makeString("<owl:Class rdf:about=\"#Floodplain\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Floodplain")))), list(list(makeString("<owl:Class rdf:ID=\"SnowLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SnowLayer")))), list(list(makeString("<owl:allValuesFrom>")), list(makeString("owl:allValuesFrom"))), list(list(makeString("<owl:Class rdf:ID=\"IceFloe\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceFloe")))), list(list(makeString("<owl:Class rdf:ID=\"DryLandRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DryLandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Aquifer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Aquifer")))), list(list(makeString("<owl:Class rdf:ID=\"MiddleAtmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MiddleAtmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Biosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Biosphere")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetaryStructure\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetaryStructure")))), list(list(makeString("<owl:Class rdf:ID=\"CoralReef\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CoralReef")))), list(list(makeString("<owl:Class rdf:ID=\"ContinentalMargin\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ContinentalMargin")))), list(list(makeString("<owl:Class rdf:ID=\"SurfaceWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SurfaceWater")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#EarthRealm\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<owl:Class rdf:ID=\"Estuary\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Estuary")))), list(list(makeString("<owl:Class rdf:ID=\"IceCore\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceCore")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Air\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Air")))), list(list(makeString("<owl:Class rdf:ID=\"CrustLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CrustLayer")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#SeaFloorRegion\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#SeaFloorRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandSurfaceLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloorRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloorRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#MarineEcosystem\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#MarineEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Plain\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Plain")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#WaterSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#WaterSurface")))), list(list(makeString("<owl:Class rdf:ID=\"Benthos\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Benthos")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#PlanetarySurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#PlanetarySurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#MarineEcosystem\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#MarineEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"MixedLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MixedLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Stratosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Stratosphere")))), list(list(makeString("<owl:Class rdf:ID=\"LandSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandSurface")))), list(list(makeString("<owl:Class rdf:ID=\"SolidEarth\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SolidEarth")))), list(list(makeString("<owl:Class rdf:ID=\"SoilLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SoilLayer")))), list(list(makeString("<owl:Class rdf:ID=\"HydrosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("HydrosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"EolianLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EolianLandform")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloor\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaFloor")))), list(list(makeString("<owl:Class rdf:ID=\"Benthic\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Benthic")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#PermafrostZone\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#PermafrostZone")))), list(list(makeString("<owl:Class rdf:ID=\"TectonicLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TectonicLandform")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasLowerBoundaryHeight\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasLowerBoundaryHeight")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Thermosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Thermosphere")))), list(list(makeString("<owl:DatatypeProperty rdf:ID=\"hasLowerBoundaryReferenceHeight\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("hasLowerBoundaryReferenceHeight")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CryosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CryosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Mountain\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mountain")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo")))), list(list(makeString("<owl:Class rdf:ID=\"CryosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CryosphereLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloorGroundLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaFloorGroundLayer")))), list(list(makeString("<owl:Class rdf:ID=\"TerrrestrialWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TerrrestrialWetland")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Region\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Region")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#TroposphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#TroposphereLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"#LandRegion\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"LandwaterSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandwaterSurfaceLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#inside\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#inside")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#contains\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#contains")))), list(list(makeString("<owl:Class rdf:ID=\"PalustrineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PalustrineWetland")))), list(list(makeString("<rdfs:range rdf:resource=\"#SurfaceRegion\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#SurfaceRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Atmosphere\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Atmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"FreshwaterLake\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FreshwaterLake")))), list(list(makeString("<owl:Class rdf:ID=\"FluvialLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FluvialLandform")))), list(list(makeString("<owl:Class rdf:ID=\"HydrothermalVents\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("HydrothermalVents")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Groundwater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Groundwater")))), list(list(makeString("<owl:Class rdf:about=\"#Basin\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Basin")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloorGroundLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloorGroundLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Forest_Ecosystem\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Forest_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Bedrock\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Bedrock")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandRegion\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"LacustrineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LacustrineWetland")))), list(list(makeString("<owl:Class rdf:ID=\"CostalLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CostalLandform")))), list(list(makeString("<owl:Class rdf:ID=\"ClimateZoneType\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ClimateZoneType")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#TectonicLandform\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#TectonicLandform")))), list(list(makeString("<owl:Class rdf:ID=\"TropicalClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TropicalClimateZone")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasEcosystemType\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasEcosystemType")))), list(list(makeString("<owl:onProperty rdf:resource=\"#hasEcosystemType\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#hasEcosystemType")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#PlanetarySurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#PlanetarySurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"GroundWaterObjectBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GroundWaterObjectBoundary")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Lake\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Lake")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf")))), list(list(makeString("<owl:Class rdf:ID=\"RockGlacier\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RockGlacier")))), list(list(makeString("<owl:Class rdf:ID=\"SubsurfaceWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SubsurfaceWater")))), list(list(makeString("<owl:Class rdf:about=\"#LandwaterRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandwaterRegion")))), list(list(makeString("<rdfs:domain rdf:resource=\"#EarthRealm\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LithosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LithosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"MontaneForest\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MontaneForest")))), list(list(makeString("<owl:Class rdf:ID=\"CaveEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CaveEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Tundra_Ecosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Tundra_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Dune\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Dune")))), list(list(makeString("<owl:Class rdf:ID=\"DemersalEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DemersalEcosystem")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#LandIceLayer\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#LandIceLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith")))), list(list(makeString("<owl:Class rdf:ID=\"BarrierIsland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BarrierIsland")))), list(list(makeString("<owl:Class rdf:ID=\"Leads\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Leads")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#WaterSurface\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#WaterSurface")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfWater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfWater")))), list(list(makeString("<owl:Class rdf:ID=\"MangroveForest\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MangroveForest")))), list(list(makeString("<owl:Class rdf:ID=\"Grassland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Grassland")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"coveredBySubstance_temporary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("coveredBySubstance_temporary")))), list(list(makeString("<owl:Class rdf:ID=\"UrbanLand\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UrbanLand")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#LandSurfaceLayer\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#LandSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Ionosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Ionosphere")))), list(list(makeString("<owl:Class rdf:ID=\"PelagicEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PelagicEcosystem")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaSurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Farmland\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Farmland")))), list(list(makeString("<owl:onProperty rdf:resource=\"#hasLowerBoundaryReferenceHeight\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#hasLowerBoundaryReferenceHeight")))), list(list(makeString("<owl:Class rdf:ID=\"OceanLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#PlanetarySurface\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#PlanetarySurface")))), list(list(makeString("<owl:Class rdf:ID=\"Iceberg\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Iceberg")))), list(list(makeString("<owl:Class rdf:ID=\"Aeoliean\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Aeoliean")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Geosphere\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Geosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Isobar\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Isobar")))), list(list(makeString("<owl:Class rdf:ID=\"LandwaterRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandwaterRegion")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasClimateZoneType\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasClimateZoneType")))), list(list(makeString("<owl:Class rdf:ID=\"SnowField\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SnowField")))), list(list(makeString("<owl:Class rdf:ID=\"RiftValley\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RiftValley")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LakeLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LakeLayer")))), list(list(makeString("<owl:disjointWith rdf:resource=\"#LandSurface\"/>")), list(makeString("owl:disjointWith"), cons(makeString("rdf:resource"), makeString("#LandSurface")))), list(list(makeString("<owl:Class rdf:about=\"#Dam\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Dam")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Rock_body\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Rock_body")))), list(list(makeString("<owl:Class rdf:ID=\"Lagoon\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Lagoon")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#OceanLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#OceanLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfSeaIce\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfSeaIce")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl")))), list(list(makeString("<owl:Class rdf:ID=\"Seamount\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Seamount")))), list(list(makeString("<owl:Class rdf:ID=\"Lithosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Lithosphere")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaSurface")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#MantleLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#MantleLayer")))), list(list(makeString("<owl:Class rdf:ID=\"IceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"SurfaceRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SurfaceRegion")))), list(list(makeString("<owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#double\">")), list(makeString("owl:hasValue"), cons(makeString("rdf:datatype"), makeString("http://www.w3.org/2001/XMLSchema#double")))), list(list(makeString("<owl:Class rdf:ID=\"Asthenosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Asthenosphere")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#LandRegion\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"primarySubstance\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("primarySubstance")))), list(list(makeString("<owl:Class rdf:ID=\"Thermocline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Thermocline")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Trench\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Trench")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CrustLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CrustLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Lithosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Lithosphere")))), list(list(makeString("<owl:Class rdf:ID=\"fiord\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("fiord")))), list(list(makeString("<owl:Class rdf:ID=\"Land\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Land")))), list(list(makeString("<owl:Class rdf:ID=\"ArcticClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ArcticClimateZone")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"SubtropicalClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SubtropicalClimateZone")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Water\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Water")))), list(list(makeString("<owl:Class rdf:ID=\"SeaSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaSurfaceLayer")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Fjord\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Fjord")))), list(list(makeString("<owl:Class rdf:ID=\"Mesopause\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mesopause")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#WaterSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#WaterSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfGround\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfGround")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfSeaIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfSeaIce")))), list(list(makeString("<owl:Class rdf:ID=\"WaterChannel\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterChannel")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Cryosol\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Cryosol")))), list(list(makeString("<owl:Class rdf:ID=\"SedimentaryStructure\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SedimentaryStructure")))), list(list(makeString("<owl:Class rdf:ID=\"AtmosphereLayerBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AtmosphereLayerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"F-Region\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("F-Region")))), list(list(makeString("<owl:Class rdf:ID=\"Lake\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Lake")))), list(list(makeString("<owl:Class rdf:ID=\"Continent\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Continent")))), list(list(makeString("<owl:Class rdf:ID=\"FractureZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FractureZone")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#CrustLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#CrustLayer")))), list(list(makeString("<owl:Class rdf:ID=\"DepthHoarLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DepthHoarLayer")))), list(list(makeString("<owl:Class rdf:ID=\"WaterSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterSurface")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart")))), list(list(makeString("<owl:Class rdf:ID=\"Cave\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Cave")))), list(list(makeString("<owl:Class rdf:ID=\"LowerAtmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LowerAtmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Moho\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Moho")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#contains\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#contains")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Crust\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Crust")))), list(list(makeString("<owl:Class rdf:ID=\"Stream\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Stream")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Air\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Air")))), list(list(makeString("<owl:Class rdf:ID=\"RiparianWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RiparianWetland")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"#LandwaterSurfaceLayer\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandwaterSurfaceLayer")))), list(list(makeString("<rdfs:range rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://www.w3.org/2002/07/owl#Thing")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CoreLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CoreLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Polynya\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Polynya")))), list(list(makeString("<owl:Class rdf:ID=\"AtmosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AtmosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#IceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#IceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"AbyssalPlain\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AbyssalPlain")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance")))), list(list(makeString("<owl:Class rdf:ID=\"GeomorphologicalRegionType\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GeomorphologicalRegionType")))), list(list(makeString("<owl:Class rdf:ID=\"Geosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Geosphere")))), list(list(makeString("<owl:Class rdf:ID=\"LandWaterSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandWaterSurface")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#CoastalRegion\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#CoastalRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#HydrosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#HydrosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"GroundSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GroundSurfaceLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#CaveEcosystem\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#CaveEcosystem")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GeosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GeosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Soil\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Soil")))), list(list(makeString("<owl:Class rdf:ID=\"AbyssalHill\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AbyssalHill")))), list(list(makeString("<owl:Class rdf:ID=\"RockyCoast\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RockyCoast")))), list(list(makeString("<owl:Class rdf:ID=\"DesertClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DesertClimateZone")))), list(list(makeString("<rdfs:domain rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("http://www.w3.org/2002/07/owl#Thing")))), list(list(makeString("<owl:Class rdf:ID=\"Magnetosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Magnetosphere")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandwaterSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandwaterSurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#EarthRealm\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Grassland\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Grassland")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerUpperBoundaryOf\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerUpperBoundaryOf")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaSurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"OceanRidge\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanRidge")))), list(list(makeString("<owl:Class rdf:ID=\"Atmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Atmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"GeosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GeosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment")))), list(list(makeString("<rdfs:domain rdf:resource=\"#SurfaceRegion\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("#SurfaceRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#CoastalRegion\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#CoastalRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Body\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Body")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasGeomorphologicalType\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasGeomorphologicalType")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#AtmosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#AtmosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"#Mesosphere\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Mesosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Land_WaterBoundary_2D\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Land_WaterBoundary_2D")))), list(list(makeString("<owl:Class rdf:ID=\"Forest_Ecosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Forest_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"AgriculturalLands\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AgriculturalLands")))), list(list(makeString("<owl:DatatypeProperty rdf:ID=\"hasUpperBoundaryReferenceHeight\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("hasUpperBoundaryReferenceHeight")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl")))), list(list(makeString("<owl:Class rdf:ID=\"Talik\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Talik")))), list(list(makeString("<owl:Class rdf:ID=\"Inlet\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Inlet")))), list(list(makeString("<owl:Class rdf:ID=\"Desert_Ecosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Desert_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"InversionLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("InversionLayer")))), list(list(makeString("<owl:Class rdf:ID=\"OceanCrustLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanCrustLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Shoal\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Shoal")))), list(list(makeString("<owl:Class rdf:ID=\"Wetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Wetland")))), list(list(makeString("<owl:Class rdf:ID=\"LithosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LithosphereLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfGround\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfGround")))), list(list(makeString("<owl:Class rdf:about=\"#SubsurfaceRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#SubsurfaceRegion")))), list(list(makeString("<owl:Class rdf:ID=\"IceSheet\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceSheet")))), list(list(makeString("<owl:Class rdf:ID=\"Glacier\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Glacier")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandSurface")))), list(list(makeString("<owl:Class rdf:ID=\"Littoral\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Littoral")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isUpperBoundaryOf\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isUpperBoundaryOf")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#UndergroundWater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#UndergroundWater")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice")))), list(list(makeString("<owl:Class rdf:ID=\"SkinLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SkinLayer")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLowerBoundaryOf\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLowerBoundaryOf")))), list(list(makeString("<owl:Class rdf:ID=\"UpperMantle_flowing\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperMantle_flowing")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GlobalPlanetaryLayers\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GlobalPlanetaryLayers")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#WaterSurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#WaterSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Savanna\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Savanna")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Basin\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Basin")))), list(list(makeString("<owl:Class rdf:ID=\"OceanRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanRegion")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetEarth\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetEarth")))), list(list(makeString("<owl:Class rdf:ID=\"BoundaryLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BoundaryLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Crust\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Crust")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#EcosystemType\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#EcosystemType")))), list(list(makeString("<owl:Class rdf:ID=\"ActiveLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ActiveLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Layer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Layer")))), list(list(makeString("<owl:Class rdf:ID=\"LandIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandIce")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Wetland\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Wetland")))), list(list(makeString("<owl:Class rdf:ID=\"LandSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Trench\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Trench")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasRegionBoundary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasRegionBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#RegionProperty\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#RegionProperty")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#ClimateZoneType\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#ClimateZoneType")))), list(list(makeString("<owl:Class rdf:ID=\"MantleLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MantleLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaIceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaIceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"River\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("River")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandWaterSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandWaterSurface")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Troposphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Troposphere")))), list(list(makeString("<owl:Class rdf:about=\"#LandWaterObject\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandWaterObject")))), list(list(makeString("<owl:Class rdf:ID=\"TopographicalRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TopographicalRegion")))), list(list(makeString("<owl:Class rdf:about=\"#CoastalRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#CoastalRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Stratopause\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Stratopause")))), list(list(makeString("<owl:Class rdf:ID=\"UpperAtmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperAtmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"DeepOcean\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DeepOcean")))), list(list(makeString("<owl:Class rdf:ID=\"BorealForest\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BorealForest")))), list(list(makeString("<owl:Class rdf:ID=\"Nearshore\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Nearshore")))), list(list(makeString("<owl:Class rdf:ID=\"GlobalPlanetaryLayers\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GlobalPlanetaryLayers")))), list(list(makeString("<owl:Class rdf:ID=\"UpperAir\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperAir")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Cryosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Cryosphere")))), list(list(makeString("<owl:Class rdf:ID=\"LakeLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LakeLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Permafrost\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Permafrost")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloorWaterLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaFloorWaterLayer")))), list(list(makeString("<owl:Class rdf:ID=\"UpperMantle_rigid\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperMantle_rigid")))), list(list(makeString("<owl:Class rdf:ID=\"CoastalRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CoastalRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Ionosphere\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Ionosphere")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Island\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Island")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandSurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetarySurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetarySurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Exosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Exosphere")))), list(list(makeString("<owl:Class rdf:about=\"#LandwaterSurfaceLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandwaterSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Sky\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Sky")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#UpperMantle_flowing\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#UpperMantle_flowing")))), list(list(makeString("<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://www.w3.org/2002/07/owl#Thing")))), list(list(makeString("<owl:Class rdf:ID=\"Peatland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Peatland")))), list(list(makeString("<owl:Class rdf:about=\"#LandSurfaceLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandSurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SurfaceRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SurfaceRegion")))), list(list(makeString("<owl:Class rdf:ID=\"MediterraneanClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MediterraneanClimateZone")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GeomorphologicalRegionType\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GeomorphologicalRegionType")))), list(list(makeString("<owl:Class rdf:ID=\"Island\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Island")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandwaterRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandwaterRegion")))), list(list(makeString("<owl:Class rdf:about=\"#Stratosphere\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Stratosphere")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfWater")))), list(list(makeString("<owl:Class rdf:ID=\"EarthRealm\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EarthRealm")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#WetlandRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#WetlandRegion")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloorWaterLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloorWaterLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance")))), list(list(makeString("<owl:Class rdf:ID=\"Halocline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Halocline")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasUpperBoundaryHeight\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasUpperBoundaryHeight")))), list(list(makeString("<owl:Class rdf:ID=\"TerrestrialEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TerrestrialEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"SalineLake\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SalineLake")))), list(list(makeString("<owl:Class rdf:ID=\"WetlandRegion\" xmlns:rdf=\"http://rdf.com/\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WetlandRegion")), cons(makeString("xmlns:rdf"), makeString("http://rdf.com/")))), list(list(makeString("<owl:Class rdf:ID=\"CoreLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CoreLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#AtmosphereLayerBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#AtmosphereLayerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"UndergroundWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UndergroundWater")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloor\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloor")))), list(list(makeString("<owl:Class rdf:ID=\"LandWaterObject\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandWaterObject")))), list(list(makeString("<owl:Class rdf:ID=\"Pycnocline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Pycnocline")))), list(list(makeString("<rdfs:range rdf:resource=\"#GeomorphologicalRegionType\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#GeomorphologicalRegionType")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfIce")))), list(list(makeString("<owl:Class rdf:ID=\"PermafrostZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PermafrostZone")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Atmosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Atmosphere")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Body\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Body")))), list(list(makeString("<owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\"\n        >")), list(makeString("owl:hasValue"), cons(makeString("rdf:datatype"), makeString("http://www.w3.org/2001/XMLSchema#boolean")))), list(list(makeString("<owl:hasValue rdf:datatype=\'http://www.w3.org/2001/XMLSchema#boolean\'\n        >")), list(makeString("owl:hasValue"), cons(makeString("rdf:datatype"), makeString("http://www.w3.org/2001/XMLSchema#boolean")))), list(list(makeString("<owl:Class rdf:ID=\"Z\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Z")))), list(list(makeString("<owl:DatatypeProperty  rdf:ID= \"AbsoluteValueFn\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("AbsoluteValueFn")))), list(list(makeString("<owl:DatatypeProperty  rdf:ID = \"AbsoluteValueFn\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("AbsoluteValueFn")))), list(list(makeString("<rdf:RDF\n\nxmlns:rdf =\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n\nxmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n\n xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n\nxmlns     =\"http://reliant.teknowledge.com/DAML/SUMO.owl#\"\n\n>")), list(makeString("rdf:RDF"), cons(makeString("xmlns:rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("xmlns:rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")), cons(makeString("xmlns:owl"), makeString("http://www.w3.org/2002/07/owl#")), cons(makeString("xmlns"), makeString("http://reliant.teknowledge.com/DAML/SUMO.owl#")))) });
    }

    @Override
    public void declareFunctions() {
        declare_xml_parsing_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_xml_parsing_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_xml_parsing_utilities_file();
    }

    static {










































































































































    }

    public static final class $xml_token_iterator_state_native extends SubLStructNative {
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

        private $xml_token_iterator_state_native() {
            this.$in_stream = Lisp.NIL;
            this.$scratch_stream = Lisp.NIL;
            this.$token_output_stream = Lisp.NIL;
            this.$entity_map = Lisp.NIL;
            this.$namespace_stack = Lisp.NIL;
            this.$validateP = Lisp.NIL;
            this.$resolve_entity_referencesP = Lisp.NIL;
            this.$resolve_namespacesP = Lisp.NIL;
            this.$on_deck_queue = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$in_stream;
        }

        @Override
        public SubLObject getField3() {
            return this.$scratch_stream;
        }

        @Override
        public SubLObject getField4() {
            return this.$token_output_stream;
        }

        @Override
        public SubLObject getField5() {
            return this.$entity_map;
        }

        @Override
        public SubLObject getField6() {
            return this.$namespace_stack;
        }

        @Override
        public SubLObject getField7() {
            return this.$validateP;
        }

        @Override
        public SubLObject getField8() {
            return this.$resolve_entity_referencesP;
        }

        @Override
        public SubLObject getField9() {
            return this.$resolve_namespacesP;
        }

        @Override
        public SubLObject getField10() {
            return this.$on_deck_queue;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$in_stream = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$scratch_stream = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$token_output_stream = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$entity_map = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$namespace_stack = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$validateP = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$resolve_entity_referencesP = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$resolve_namespacesP = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$on_deck_queue = value;
        }

        static {
            structDecl = makeStructDeclNative($xml_token_iterator_state_native.class, XML_TOKEN_ITERATOR_STATE, XML_TOKEN_ITERATOR_STATE_P, $list5, $list6, new String[]{ "$in_stream", "$scratch_stream", "$token_output_stream", "$entity_map", "$namespace_stack", "$validateP", "$resolve_entity_referencesP", "$resolve_namespacesP", "$on_deck_queue" }, $list7, $list8, PRINT_XML_TOKEN_ITERATOR_STATE);
        }
    }

    public static final class $xml_token_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $xml_token_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("XML-TOKEN-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return xml_token_iterator_state_p(arg1);
        }
    }

    public static final class $xml_token_mentions$BinaryFunction extends BinaryFunction {
        public $xml_token_mentions$BinaryFunction() {
            super(extractFunctionNamed("XML-TOKEN-MENTIONS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return xml_token_mentions(arg1, arg2);
        }
    }
}

/**
 * Total time: 1104 ms
 */
