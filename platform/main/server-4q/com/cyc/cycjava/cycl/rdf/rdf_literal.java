package com.cyc.cycjava.cycl.rdf;


import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.owl.owl_to_cycl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rdf_literal extends SubLTranslatedFile {
    public static final SubLFile me = new rdf_literal();

    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_literal";

    public static final String myFingerPrint = "70ac18a4df4422bdf9b0e087893c12af042a3111e13f6a9f4d8594e3506bca85";

    // defconstant
    public static final SubLSymbol $dtp_rdf_literal$ = makeSymbol("*DTP-RDF-LITERAL*");

    // Internal Constants
    public static final SubLSymbol RDF_LITERAL = makeSymbol("RDF-LITERAL");

    public static final SubLSymbol RDF_LITERAL_P = makeSymbol("RDF-LITERAL-P");

    public static final SubLList $list2 = list(makeSymbol("UTF8-LEXICAL-FORM"), makeSymbol("LANGUAGE-TAG"), makeSymbol("DATATYPE"));

    public static final SubLList $list3 = list(makeKeyword("UTF8-LEXICAL-FORM"), makeKeyword("LANGUAGE-TAG"), makeKeyword("DATATYPE"));

    public static final SubLList $list4 = list(makeSymbol("RDF-LIT-UTF8-LEXICAL-FORM"), makeSymbol("RDF-LIT-LANGUAGE-TAG"), makeSymbol("RDF-LIT-DATATYPE"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-RDF-LIT-UTF8-LEXICAL-FORM"), makeSymbol("_CSETF-RDF-LIT-LANGUAGE-TAG"), makeSymbol("_CSETF-RDF-LIT-DATATYPE"));

    public static final SubLSymbol PRINT_RDF_LITERAL = makeSymbol("PRINT-RDF-LITERAL");

    public static final SubLSymbol RDF_LITERAL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RDF-LITERAL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RDF-LITERAL-P"));

    private static final SubLSymbol RDF_LIT_UTF8_LEXICAL_FORM = makeSymbol("RDF-LIT-UTF8-LEXICAL-FORM");

    private static final SubLSymbol _CSETF_RDF_LIT_UTF8_LEXICAL_FORM = makeSymbol("_CSETF-RDF-LIT-UTF8-LEXICAL-FORM");

    private static final SubLSymbol RDF_LIT_LANGUAGE_TAG = makeSymbol("RDF-LIT-LANGUAGE-TAG");

    private static final SubLSymbol _CSETF_RDF_LIT_LANGUAGE_TAG = makeSymbol("_CSETF-RDF-LIT-LANGUAGE-TAG");

    private static final SubLSymbol RDF_LIT_DATATYPE = makeSymbol("RDF-LIT-DATATYPE");

    private static final SubLSymbol _CSETF_RDF_LIT_DATATYPE = makeSymbol("_CSETF-RDF-LIT-DATATYPE");

    private static final SubLSymbol $UTF8_LEXICAL_FORM = makeKeyword("UTF8-LEXICAL-FORM");





    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_RDF_LITERAL = makeSymbol("MAKE-RDF-LITERAL");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RDF_LITERAL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RDF-LITERAL-METHOD");

    private static final SubLString $str24$_RDF_LITERAL__S = makeString("<RDF-LITERAL ~S");

    private static final SubLString $str25$__S = makeString(" ~S");

    private static final SubLString $str26$_ = makeString(">");



    private static final SubLSymbol VALID_RDF_LITERAL_DATATYPE_P = makeSymbol("VALID-RDF-LITERAL-DATATYPE-P");

    private static final SubLString $$$en = makeString("en");

    private static final SubLString $$$string = makeString("string");

    private static final SubLString $str31$__literal_ = makeString("</literal>");

    private static final SubLString $$$lang = makeString("lang");

    private static final SubLString $$$datatype = makeString("datatype");

    private static final SubLString $$$boolean = makeString("boolean");

    private static final SubLString $$$integer = makeString("integer");

    private static final SubLString $$$nonPositiveInteger = makeString("nonPositiveInteger");

    private static final SubLString $$$negativeInteger = makeString("negativeInteger");

    private static final SubLString $$$long = makeString("long");

    private static final SubLString $$$int = makeString("int");

    private static final SubLString $$$short = makeString("short");

    private static final SubLString $$$byte = makeString("byte");

    private static final SubLString $$$nonNegativeInteger = makeString("nonNegativeInteger");

    private static final SubLString $$$unsignedLong = makeString("unsignedLong");

    private static final SubLString $$$unsignedShort = makeString("unsignedShort");

    private static final SubLString $$$unsignedByte = makeString("unsignedByte");

    private static final SubLString $$$positiveInteger = makeString("positiveInteger");

    private static final SubLString $$$double = makeString("double");

    private static final SubLString $$$float = makeString("float");

    private static final SubLString $$$decimal = makeString("decimal");

    private static final SubLString $$$date = makeString("date");

    private static final SubLString $$$time = makeString("time");

    private static final SubLString $$$dateTime = makeString("dateTime");

    private static final SubLString $$$anyURI = makeString("anyURI");

    private static final SubLSymbol SXHASH_RDF_LITERAL_METHOD = makeSymbol("SXHASH-RDF-LITERAL-METHOD");

    public static SubLObject rdf_literal_equal_p(final SubLObject literal1, final SubLObject literal2) {
        return makeBoolean((rdf_literal_utf8_lexical_form(literal1).equal(rdf_literal_utf8_lexical_form(literal2)) && rdf_literal_language_tag(literal1).equal(rdf_literal_language_tag(literal2))) && rdf_literal_datatype(literal1).equal(rdf_literal_datatype(literal2)));
    }

    public static SubLObject rdf_literal_L(final SubLObject literal1, final SubLObject literal2) {
        return Strings.stringL(rdf_literal_utf8_lexical_form(literal1), rdf_literal_utf8_lexical_form(literal2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rdf_literal_cyc_string(final SubLObject v_rdf_literal) {
        final SubLObject utf8 = rdf_literal_utf8_lexical_form(v_rdf_literal);
        return NIL != unicode_strings.ascii_string_p(utf8) ? utf8 : unicode_nauts.non_ascii_string_to_unicode(utf8);
    }

    public static SubLObject rdf_literal_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rdf_literal(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rdf_literal_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$rdf_literal_native.class ? T : NIL;
    }

    public static SubLObject rdf_lit_utf8_lexical_form(final SubLObject v_object) {
        assert NIL != rdf_literal_p(v_object) : "rdf_literal.rdf_literal_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rdf_lit_language_tag(final SubLObject v_object) {
        assert NIL != rdf_literal_p(v_object) : "rdf_literal.rdf_literal_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rdf_lit_datatype(final SubLObject v_object) {
        assert NIL != rdf_literal_p(v_object) : "rdf_literal.rdf_literal_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_rdf_lit_utf8_lexical_form(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_literal_p(v_object) : "rdf_literal.rdf_literal_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rdf_lit_language_tag(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_literal_p(v_object) : "rdf_literal.rdf_literal_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rdf_lit_datatype(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_literal_p(v_object) : "rdf_literal.rdf_literal_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_rdf_literal(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rdf_literal_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($UTF8_LEXICAL_FORM)) {
                _csetf_rdf_lit_utf8_lexical_form(v_new, current_value);
            } else
                if (pcase_var.eql($LANGUAGE_TAG)) {
                    _csetf_rdf_lit_language_tag(v_new, current_value);
                } else
                    if (pcase_var.eql($DATATYPE)) {
                        _csetf_rdf_lit_datatype(v_new, current_value);
                    } else {
                        Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rdf_literal(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RDF_LITERAL, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $UTF8_LEXICAL_FORM, rdf_lit_utf8_lexical_form(obj));
        funcall(visitor_fn, obj, $SLOT, $LANGUAGE_TAG, rdf_lit_language_tag(obj));
        funcall(visitor_fn, obj, $SLOT, $DATATYPE, rdf_lit_datatype(obj));
        funcall(visitor_fn, obj, $END, MAKE_RDF_LITERAL, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rdf_literal_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rdf_literal(obj, visitor_fn);
    }

    public static SubLObject print_rdf_literal(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str24$_RDF_LITERAL__S, rdf_literal_utf8_lexical_form(v_object));
        if (NIL != rdf_literal_language_tag(v_object)) {
            format(stream, $str25$__S, rdf_literal_language_tag(v_object));
        }
        if (NIL != rdf_literal_datatype(v_object)) {
            format(stream, $str25$__S, rdf_literal_datatype(v_object));
        }
        princ($str26$_, stream);
        return v_object;
    }

    public static SubLObject new_rdf_literal(final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype) {
        assert NIL != stringp(utf8_lexical_form) : "Types.stringp(utf8_lexical_form) " + "CommonSymbols.NIL != Types.stringp(utf8_lexical_form) " + utf8_lexical_form;
        if (((NIL != language_tag) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(language_tag))) {
            throw new AssertionError(language_tag);
        }
        if (((NIL != datatype) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == valid_rdf_literal_datatype_p(datatype))) {
            throw new AssertionError(datatype);
        }
        final SubLObject literal = make_rdf_literal(UNPROVIDED);
        _csetf_rdf_lit_utf8_lexical_form(literal, utf8_lexical_form);
        if (NIL != string_utilities.non_empty_string_p(language_tag)) {
            _csetf_rdf_lit_language_tag(literal, Strings.string_downcase(language_tag, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != datatype) {
            _csetf_rdf_lit_datatype(literal, NIL != rdf_uri.rdf_uri_p(datatype) ? datatype : get_datatype_uri(datatype));
        }
        return literal;
    }

    public static SubLObject new_rdf_string_literal(final SubLObject utf8_lexical_form, SubLObject language) {
        if (language == UNPROVIDED) {
            language = $$$en;
        }
        return new_rdf_literal(utf8_lexical_form, language, rdf_utilities.xsd_expanded_name($$$string));
    }

    public static SubLObject new_rdf_literal_from_sparql_results_xml(final SubLObject utf8_xml_form) {
        assert NIL != stringp(utf8_xml_form) : "Types.stringp(utf8_xml_form) " + "CommonSymbols.NIL != Types.stringp(utf8_xml_form) " + utf8_xml_form;
        final SubLObject literal_tag_end = search($str26$_, utf8_xml_form, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, ZERO_INTEGER, UNPROVIDED);
        final SubLObject literal_start = number_utilities.f_1X(literal_tag_end);
        final SubLObject literal_end = search($str31$__literal_, utf8_xml_form, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, literal_start, UNPROVIDED);
        final SubLObject literal_value = string_utilities.substring(utf8_xml_form, literal_start, literal_end);
        final SubLObject literal_tag = string_utilities.substring(utf8_xml_form, ZERO_INTEGER, literal_start);
        final SubLObject language = xml_parsing_utilities.xml_tag_attribute_value(literal_tag, owl_to_cycl.xml_name($$$lang), UNPROVIDED);
        final SubLObject datatype = xml_parsing_utilities.xml_tag_attribute_value(literal_tag, $$$datatype, UNPROVIDED);
        final SubLObject literal = make_rdf_literal(UNPROVIDED);
        _csetf_rdf_lit_utf8_lexical_form(literal, literal_value);
        if (NIL != string_utilities.non_empty_string_p(language)) {
            _csetf_rdf_lit_language_tag(literal, language);
        }
        if (NIL != datatype) {
            _csetf_rdf_lit_datatype(literal, NIL != rdf_uri.rdf_uri_p(datatype) ? datatype : get_datatype_uri(datatype));
        }
        return literal;
    }

    public static SubLObject valid_rdf_literal_datatype_p(final SubLObject v_object) {
        return makeBoolean((NIL != rdf_datatype_uri_p(v_object)) || (NIL != web_utilities.uri_p(v_object, UNPROVIDED)));
    }

    public static SubLObject rdf_datatype_uri_p(final SubLObject v_object) {
        return rdf_uri.rdf_uri_p(v_object);
    }

    public static SubLObject rdf_boolean_literal_p(final SubLObject literal) {
        final SubLObject datatype = rdf_literal_datatype(literal);
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(datatype)) && rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$boolean)));
    }

    public static SubLObject rdf_string_literal_p(final SubLObject literal) {
        final SubLObject datatype = rdf_literal_datatype(literal);
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(datatype)) && rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$string)));
    }

    public static SubLObject rdf_integer_literal_p(final SubLObject literal) {
        final SubLObject datatype = rdf_literal_datatype(literal);
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(datatype)) && (((((((((((rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$integer)) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$nonPositiveInteger))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$negativeInteger))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$long))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$int))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$short))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$byte))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$nonNegativeInteger))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$unsignedLong))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$unsignedShort))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$unsignedByte))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$positiveInteger))));
    }

    public static SubLObject rdf_double_literal_p(final SubLObject literal) {
        final SubLObject datatype = rdf_literal_datatype(literal);
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(datatype)) && ((rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$double)) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$float))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$decimal))));
    }

    public static SubLObject rdf_date_literal_p(final SubLObject literal) {
        final SubLObject datatype = rdf_literal_datatype(literal);
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(datatype)) && ((rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$date)) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$time))) || rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$dateTime))));
    }

    public static SubLObject rdf_uri_literal_p(final SubLObject literal) {
        final SubLObject datatype = rdf_literal_datatype(literal);
        return makeBoolean((NIL != rdf_uri.rdf_uri_p(datatype)) && rdf_uri.rdf_uri_utf8_string(datatype).equal(rdf_utilities.xsd_expanded_name($$$anyURI)));
    }

    public static SubLObject get_datatype_uri(final SubLObject datatype_uri) {
        assert NIL != stringp(datatype_uri) : "Types.stringp(datatype_uri) " + "CommonSymbols.NIL != Types.stringp(datatype_uri) " + datatype_uri;
        return rdf_uri.get_rdf_uri(datatype_uri, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rdf_literal_utf8_lexical_form(final SubLObject literal) {
        assert NIL != rdf_literal_p(literal) : "rdf_literal.rdf_literal_p(literal) " + "CommonSymbols.NIL != rdf_literal.rdf_literal_p(literal) " + literal;
        return rdf_lit_utf8_lexical_form(literal);
    }

    public static SubLObject rdf_literal_language_tag(final SubLObject literal) {
        assert NIL != rdf_literal_p(literal) : "rdf_literal.rdf_literal_p(literal) " + "CommonSymbols.NIL != rdf_literal.rdf_literal_p(literal) " + literal;
        return rdf_lit_language_tag(literal);
    }

    public static SubLObject rdf_literal_datatype(final SubLObject literal) {
        assert NIL != rdf_literal_p(literal) : "rdf_literal.rdf_literal_p(literal) " + "CommonSymbols.NIL != rdf_literal.rdf_literal_p(literal) " + literal;
        return rdf_lit_datatype(literal);
    }

    public static SubLObject sxhash_rdf_literal_method(final SubLObject v_object) {
        return sxhash_rdf_literal(v_object);
    }

    public static SubLObject sxhash_rdf_literal(final SubLObject literal) {
        return Sxhash.sxhash(rdf_lit_utf8_lexical_form(literal));
    }

    public static SubLObject declare_rdf_literal_file() {
        declareFunction(me, "rdf_literal_equal_p", "RDF-LITERAL-EQUAL-P", 2, 0, false);
        declareFunction(me, "rdf_literal_L", "RDF-LITERAL-<", 2, 0, false);
        declareFunction(me, "rdf_literal_cyc_string", "RDF-LITERAL-CYC-STRING", 1, 0, false);
        declareFunction(me, "rdf_literal_print_function_trampoline", "RDF-LITERAL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rdf_literal_p", "RDF-LITERAL-P", 1, 0, false);
        new rdf_literal.$rdf_literal_p$UnaryFunction();
        declareFunction(me, "rdf_lit_utf8_lexical_form", "RDF-LIT-UTF8-LEXICAL-FORM", 1, 0, false);
        declareFunction(me, "rdf_lit_language_tag", "RDF-LIT-LANGUAGE-TAG", 1, 0, false);
        declareFunction(me, "rdf_lit_datatype", "RDF-LIT-DATATYPE", 1, 0, false);
        declareFunction(me, "_csetf_rdf_lit_utf8_lexical_form", "_CSETF-RDF-LIT-UTF8-LEXICAL-FORM", 2, 0, false);
        declareFunction(me, "_csetf_rdf_lit_language_tag", "_CSETF-RDF-LIT-LANGUAGE-TAG", 2, 0, false);
        declareFunction(me, "_csetf_rdf_lit_datatype", "_CSETF-RDF-LIT-DATATYPE", 2, 0, false);
        declareFunction(me, "make_rdf_literal", "MAKE-RDF-LITERAL", 0, 1, false);
        declareFunction(me, "visit_defstruct_rdf_literal", "VISIT-DEFSTRUCT-RDF-LITERAL", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rdf_literal_method", "VISIT-DEFSTRUCT-OBJECT-RDF-LITERAL-METHOD", 2, 0, false);
        declareFunction(me, "print_rdf_literal", "PRINT-RDF-LITERAL", 3, 0, false);
        declareFunction(me, "new_rdf_literal", "NEW-RDF-LITERAL", 3, 0, false);
        declareFunction(me, "new_rdf_string_literal", "NEW-RDF-STRING-LITERAL", 1, 1, false);
        declareFunction(me, "new_rdf_literal_from_sparql_results_xml", "NEW-RDF-LITERAL-FROM-SPARQL-RESULTS-XML", 1, 0, false);
        declareFunction(me, "valid_rdf_literal_datatype_p", "VALID-RDF-LITERAL-DATATYPE-P", 1, 0, false);
        declareFunction(me, "rdf_datatype_uri_p", "RDF-DATATYPE-URI-P", 1, 0, false);
        declareFunction(me, "rdf_boolean_literal_p", "RDF-BOOLEAN-LITERAL-P", 1, 0, false);
        declareFunction(me, "rdf_string_literal_p", "RDF-STRING-LITERAL-P", 1, 0, false);
        declareFunction(me, "rdf_integer_literal_p", "RDF-INTEGER-LITERAL-P", 1, 0, false);
        declareFunction(me, "rdf_double_literal_p", "RDF-DOUBLE-LITERAL-P", 1, 0, false);
        declareFunction(me, "rdf_date_literal_p", "RDF-DATE-LITERAL-P", 1, 0, false);
        declareFunction(me, "rdf_uri_literal_p", "RDF-URI-LITERAL-P", 1, 0, false);
        declareFunction(me, "get_datatype_uri", "GET-DATATYPE-URI", 1, 0, false);
        declareFunction(me, "rdf_literal_utf8_lexical_form", "RDF-LITERAL-UTF8-LEXICAL-FORM", 1, 0, false);
        declareFunction(me, "rdf_literal_language_tag", "RDF-LITERAL-LANGUAGE-TAG", 1, 0, false);
        declareFunction(me, "rdf_literal_datatype", "RDF-LITERAL-DATATYPE", 1, 0, false);
        declareFunction(me, "sxhash_rdf_literal_method", "SXHASH-RDF-LITERAL-METHOD", 1, 0, false);
        declareFunction(me, "sxhash_rdf_literal", "SXHASH-RDF-LITERAL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rdf_literal_file() {
        defconstant("*DTP-RDF-LITERAL*", RDF_LITERAL);
        return NIL;
    }

    public static SubLObject setup_rdf_literal_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rdf_literal$.getGlobalValue(), symbol_function(RDF_LITERAL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RDF_LIT_UTF8_LEXICAL_FORM, _CSETF_RDF_LIT_UTF8_LEXICAL_FORM);
        def_csetf(RDF_LIT_LANGUAGE_TAG, _CSETF_RDF_LIT_LANGUAGE_TAG);
        def_csetf(RDF_LIT_DATATYPE, _CSETF_RDF_LIT_DATATYPE);
        identity(RDF_LITERAL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rdf_literal$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RDF_LITERAL_METHOD));
        note_funcall_helper_function(PRINT_RDF_LITERAL);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_rdf_literal$.getGlobalValue(), symbol_function(SXHASH_RDF_LITERAL_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rdf_literal_file();
    }

    @Override
    public void initializeVariables() {
        init_rdf_literal_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rdf_literal_file();
    }

    

    public static final class $rdf_literal_native extends SubLStructNative {
        public SubLObject $utf8_lexical_form;

        public SubLObject $language_tag;

        public SubLObject $datatype;

        private static final SubLStructDeclNative structDecl;

        private $rdf_literal_native() {
            this.$utf8_lexical_form = Lisp.NIL;
            this.$language_tag = Lisp.NIL;
            this.$datatype = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$utf8_lexical_form;
        }

        @Override
        public SubLObject getField3() {
            return this.$language_tag;
        }

        @Override
        public SubLObject getField4() {
            return this.$datatype;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$utf8_lexical_form = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$language_tag = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$datatype = value;
        }

        static {
            structDecl = makeStructDeclNative($rdf_literal_native.class, RDF_LITERAL, RDF_LITERAL_P, $list2, $list3, new String[]{ "$utf8_lexical_form", "$language_tag", "$datatype" }, $list4, $list5, PRINT_RDF_LITERAL);
        }
    }

    public static final class $rdf_literal_p$UnaryFunction extends UnaryFunction {
        public $rdf_literal_p$UnaryFunction() {
            super(extractFunctionNamed("RDF-LITERAL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rdf_literal_p(arg1);
        }
    }
}

/**
 * Total time: 245 ms synthetic
 */
