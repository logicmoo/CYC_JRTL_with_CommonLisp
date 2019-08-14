package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_input_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.peek_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class json extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new json();

    public static final String myName = "com.cyc.cycjava_2.cycl.json";




    // defconstant
    public static final SubLSymbol $json_special_chars$ = makeSymbol("*JSON-SPECIAL-CHARS*");

    // defparameter
    public static final SubLSymbol $json_sequence_startedP$ = makeSymbol("*JSON-SEQUENCE-STARTED?*");

    // defparameter
    public static final SubLSymbol $json_indent_level$ = makeSymbol("*JSON-INDENT-LEVEL*");

    // defparameter
    public static final SubLSymbol $json_object_startedP$ = makeSymbol("*JSON-OBJECT-STARTED?*");

    // defparameter
    public static final SubLSymbol $print_json_indent_increment$ = makeSymbol("*PRINT-JSON-INDENT-INCREMENT*");

    // defparameter
    public static final SubLSymbol $json_capitalize_keysP$ = makeSymbol("*JSON-CAPITALIZE-KEYS?*");

    private static final SubLList $list0 = list(makeSymbol("STREAM"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $json_stream$ = makeSymbol("*JSON-STREAM*");

    private static final SubLList $list3 = list(makeSymbol("STRING-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $sym5$STREAM = makeUninternedSymbol("STREAM");



    private static final SubLSymbol WITH_JSON_OUTPUT_TO_STREAM = makeSymbol("WITH-JSON-OUTPUT-TO-STREAM");

    private static final SubLList $list8 = list(CHAR_backslash, CHAR_quotation);

    private static final SubLString $str9$_u_4__0x = makeString("\\u~4,\'0x");

    private static final SubLInteger $int$34 = makeInteger(34);

    private static final SubLString $str11$__ = makeString("\\\"");

    private static final SubLInteger $int$92 = makeInteger(92);

    private static final SubLString $str13$__ = makeString("\\\\");



    private static final SubLString $str15$_ = makeString("\"");

    private static final SubLString $$$true = makeString("true");

    private static final SubLString $$$false = makeString("false");

    private static final SubLString $str18$Can_t_serialize__S_to_JSON_ = makeString("Can't serialize ~S to JSON.");

    private static final SubLList $list19 = list(list(makeSymbol("*JSON-SEQUENCE-STARTED?*"), NIL));

    private static final SubLList $list20 = list(makeSymbol("JSON-PRINC"), makeString("["));

    private static final SubLSymbol JSON_INDENT = makeSymbol("JSON-INDENT");

    private static final SubLList $list22 = list(list(makeSymbol("JSON-PRINC"), makeString("]")));

    private static final SubLList $list23 = list(list(makeSymbol("*JSON-INDENT-LEVEL*"), list(makeSymbol("1+"), makeSymbol("*JSON-INDENT-LEVEL*"))));



    private static final SubLList $list25 = list(makeSymbol("PWHEN"), makeSymbol("*JSON-SEQUENCE-STARTED?*"), list(makeSymbol("JSON-PRINC"), makeString(",")));

    private static final SubLList $list26 = list(makeSymbol("JSON-NEWLINE"));

    private static final SubLList $list27 = list(list(makeSymbol("CSETQ"), makeSymbol("*JSON-SEQUENCE-STARTED?*"), T));

    private static final SubLList $list28 = list(list(makeSymbol("*JSON-OBJECT-STARTED?*"), NIL));

    private static final SubLList $list29 = list(makeSymbol("JSON-PRINC"), makeString("{"));

    private static final SubLList $list30 = list(list(makeSymbol("JSON-PRINC"), makeString("}")));

    private static final SubLList $list31 = list(makeSymbol("KEY"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list33 = list(makeSymbol("STRINGP"));

    private static final SubLList $list34 = list(makeSymbol("PWHEN"), makeSymbol("*JSON-OBJECT-STARTED?*"), list(makeSymbol("JSON-PRINC"), makeString(",")));

    private static final SubLSymbol JSON_PRINT = makeSymbol("JSON-PRINT");

    private static final SubLList $list36 = list(makeSymbol("JSON-PRINC"), makeString(": "));

    private static final SubLList $list37 = list(list(makeSymbol("CSETQ"), makeSymbol("*JSON-OBJECT-STARTED?*"), T));

    private static final SubLString $str38$_ = makeString("[");

    private static final SubLString $str39$_ = makeString(",");

    private static final SubLString $str40$_ = makeString("]");

    private static final SubLList $list41 = list(makeKeyword("EMPTY-OBJECT"), makeKeyword("EMPTY-ARRAY"));

    private static final SubLString $$$null = makeString("null");

    private static final SubLSymbol $EMPTY_OBJECT = makeKeyword("EMPTY-OBJECT");

    private static final SubLSymbol $EMPTY_ARRAY = makeKeyword("EMPTY-ARRAY");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLString $str47$_D = makeString("~D");

    private static final SubLString $str48$_F = makeString("~F");

    private static final SubLString $str49$Could_not_handle_JSON_object__S = makeString("Could not handle JSON object ~S");



    private static final SubLSymbol $sym51$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");



    private static final SubLString $str53$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str54$Unexpected_JSON_when_reading__S__ = makeString("Unexpected JSON when reading ~S (got ~S)");

    private static final SubLList $list55 = list(CHAR_comma);

    private static final SubLSymbol ALPHANUMERIC_OR_NUMBER_CHAR_P = makeSymbol("ALPHANUMERIC-OR-NUMBER-CHAR-P");

    private static final SubLString $str57$Unexpected_JSON_when_reading_prim = makeString("Unexpected JSON when reading primitive in ~S (got ~S)");

    private static final SubLString $str58$Unexpected_JSON_when_reading_to_c = makeString("Unexpected JSON when reading to char ~S in ~S (got ~S)");

    private static final SubLString $str59$Unexpected_JSON_when_reading_to_c = makeString("Unexpected JSON when reading to chars ~S in ~S (got ~S)");

    private static final SubLString $str60$Unexpected_JSON_when_reading_to_E = makeString("Unexpected JSON when reading to EOF from ~S (got ~S)");

    private static final SubLSymbol $sym61$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol JSON_ROUND_TRIP = makeSymbol("JSON-ROUND-TRIP");













    private static final SubLList $list69 = list(new SubLObject[]{ list(list(makeString("{\n    \"firstName\": \"John\",\n    \"lastName\": \"Smith\",\n    \"isAlive\": true,\n    \"age\": 25,\n    \"height_cm\": 167.64,\n    \"address\": {\n        \"streetAddress\": \"21 2nd Street\",\n        \"city\": \"New York\",\n        \"state\": \"NY\",\n        \"postalCode\": \"10021-3100\"\n    },\n    \"phoneNumbers\": [\n        { \"type\": \"home\", \"number\": \"212 555-1234\" },\n        { \"type\": \"fax\",  \"number\": \"646 555-4567\" }\n    ]\n    }")), T), list(list(makeString("{\n    \"name\": \"Product\",\n    \"properties\": {\n        \"id\": {\n            \"type\": \"number\",\n            \"description\": \"Product identifier\",\n            \"required\": true\n        },\n        \"name\": {\n            \"type\": \"string\",\n            \"description\": \"Name of the product\",\n            \"required\": true\n        },\n        \"price\": {\n            \"type\": \"number\",\n            \"minimum\": 0,\n            \"required\": true\n        },\n        \"tags\": {\n            \"type\": \"array\",\n            \"items\": {\n                \"type\": \"string\"\n            }\n        },\n        \"stock\": {\n            \"type\": \"object\",\n            \"properties\": {\n                \"warehouse\": {\n                    \"type\": \"number\"\n                },\n                \"retail\": {\n                    \"type\": \"number\"\n                }\n            }\n        }\n    }\n    }")), T), list(list(makeString("{\n    \"id\": 1,\n    \"name\": \"Foo\",\n    \"price\": 123,\n    \"tags\": [ \"Bar\", \"Eek\" ],\n    \"stock\": {\n        \"warehouse\": 300,\n        \"retail\": 20\n    }\n}")), T), list(list(makeString("{\n  \"@context\": {\n    \"name\": \"http://xmlns.com/foaf/0.1/name\",\n    \"homepage\": {\n      \"@id\": \"http://xmlns.com/foaf/0.1/workplaceHomepage\",\n      \"@type\": \"@id\"\n    },\n    \"Person\": \"http://xmlns.com/foaf/0.1/Person\"\n  },\n  \"@id\": \"http://me.bob.com\",\n  \"@type\": \"Person\",\n  \"name\": \"Bob\",\n  \"homepage\": \"http://www.bob.com/\"\n}")), T), list(list(makeString("[\n  {\n    \"@id\": \"http://purl.oreilly.com/works/45U8QJGZSQKDH8N\",\n    \"@type\": \"http://purl.org/vocab/frbr/core#Work\",\n    \"http://purl.org/dc/terms/title\": \"Just a Geek\",\n    \"http://purl.org/dc/terms/creator\": \"Whil Wheaton\",\n    \"http://purl.org/vocab/frbr/core#realization\":\n    [\n      \"http://purl.oreilly.com/products/9780596007683.BOOK\",\n      \"http://purl.oreilly.com/products/9780596802189.EBOOK\"\n    ]\n  },\n  {\n    \"@id\": \"http://purl.oreilly.com/products/9780596007683.BOOK\",\n    \"@type\": \"http://purl.org/vocab/frbr/core#Expression\",\n    \"http://purl.org/dc/terms/type\": \"http://purl.oreilly.com/product-types/BOOK\"\n  },\n  {\n    \"@id\": \"http://purl.oreilly.com/products/9780596802189.EBOOK\",\n    \"@type\": \"http://purl.org/vocab/frbr/core#Expression\",\n    \"http://purl.org/dc/terms/type\": \"http://purl.oreilly.com/product-types/EBOOK\"\n  }\n  ]")), T), list(list(makeString("{\n        \"success\": \"t\",\n        \"data\": [\n                {\n                        \"turnId\": \"MxGBgR4raDzs1C5URauzw2sjS_rBUg\"\n                        ,\n                        \"dialog\": \"This is what I need to solve.\"\n                        \n                        ,\n                        \"math\": \"<mathmath delayms=\\\"500\\\"><math overflow=\\\"linebreak\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mrow><menclose notation=\\\"box\\\"><mtext>1</mtext></menclose><mspace width=\\\".5em\\\"/><mfrac><mn>12u000A  </mn><mn>30u000A  </mn>u000A </mfrac></mrow>u000A</math></mathmath>\"\n                        ,\n                        \"explanation\": \"Each sensor needs to get<math overflow=\\\"linebreak\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mspace width=\\\".5em\\\"/>u000A</math><math overflow=\\\"linebreak\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mfrac><mn>12u000A  </mn><mn>30u000A  </mn>u000A </mfrac>u000A</math><math overflow=\\\"linebreak\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mspace width=\\\".5em\\\"/>u000A</math>of the power from each generator.\"\n                        },\n                {\n                        \n                        \"options\": [\n                                {\n                                        \"id\": 0,\n                                        \"text\": \"u0009OK, Continue.\"}\n                                ]}]}")), T), list(list(makeString(" { \"success\": \"t\",  \"data1\": { },  \"data2\": [] }")), T), list(list(makeString(" true ")), T), list(list(makeString("false")), T), list(list(makeString("null")), T), list(list(makeString("{}")), T), list(list(makeString("[]")), T), list(list(makeString("1")), T), list(list(makeString("-1")), T), list(list(makeString("0.0001")), T), list(list(makeString("-0.0001")), T), list(list(makeString("[0, 0, 0, 0, 0, 0, 0]")), T), list(list(makeString("{\"foo\": \"bar\", \"foo\": \"bar\"}")), T) });

    private static final SubLSymbol JSON_ROUND_TRIP_FROM_LIST = makeSymbol("JSON-ROUND-TRIP-FROM-LIST");

    private static final SubLList $list71 = list(list(list(list(makeKeyword("windowTitle"), list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("(10 x 20 volts) + 2&u2153;y = 228 volts")))), T));

    public static SubLObject with_json_output_to_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        stream = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($json_stream$, stream)), append(body, NIL));
    }

    public static SubLObject with_json_output_to_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string_var = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        string_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        assert NIL != symbolp(string_var) : "Types.symbolp(string_var) " + "CommonSymbols.NIL != Types.symbolp(string_var) " + string_var;
        final SubLObject stream = $sym5$STREAM;
        return list(CWITH_OUTPUT_TO_STRING, list(stream, string_var), listS(WITH_JSON_OUTPUT_TO_STREAM, stream, append(body, NIL)));
    }

    public static SubLObject json_special_charP(final SubLObject v_char) {
        return makeBoolean((NIL != string_utilities.control_char_p(v_char)) || (NIL != member(v_char, $json_special_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject json_char_escaped_version(final SubLObject v_char) {
        if (NIL != string_utilities.control_char_p(v_char)) {
            return format(NIL, $str9$_u_4__0x, char_code(v_char));
        }
        final SubLObject pcase_var = char_code(v_char);
        if (pcase_var.eql($int$34)) {
            return $str11$__;
        }
        if (pcase_var.eql($int$92)) {
            return $str13$__;
        }
        return write_to_string(v_char, EMPTY_SUBL_OBJECT_ARRAY);
    }

    public static SubLObject json_serialize(final SubLObject l) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return print_json(l, $json_stream$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject json_write_wXescaped_special_chars(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        json_princ($str15$_);
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = end_var_$1 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$1); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            if (NIL != json_special_charP(v_char)) {
                json_princ(json_char_escaped_version(v_char));
            } else {
                json_princ(v_char);
            }
        }
        json_princ($str15$_);
        return NIL;
    }

    public static SubLObject json_serialize_atom(final SubLObject atom, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = $json_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $json_stream$.currentBinding(thread);
        try {
            $json_stream$.bind(stream, thread);
            if (atom.isNumber()) {
                json_princ(atom);
            } else
                if (atom.isString()) {
                    json_write_wXescaped_special_chars(atom);
                } else
                    if (T.eql(atom)) {
                        json_princ($$$true);
                    } else
                        if (NIL.eql(atom)) {
                            json_princ($$$false);
                        } else {
                            Errors.error($str18$Can_t_serialize__S_to_JSON_, atom);
                        }



        } finally {
            $json_stream$.rebind(_prev_bind_0, thread);
        }
        return atom;
    }

    public static SubLObject json_serializing_sequence(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list19, $list20, bq_cons(JSON_INDENT, append(body, $list22)));
    }

    public static SubLObject json_indent(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list23, append(body, NIL));
    }

    public static SubLObject json_serialize_sequence_item(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PROGN, $list25, $list26, append(body, $list27));
    }

    public static SubLObject json_serializing_object(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list28, $list29, bq_cons(JSON_INDENT, append(body, $list30)));
    }

    public static SubLObject json_serialize_object_field(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        key = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PROGN, new SubLObject[]{ listS(CHECK_TYPE, key, $list33), $list34, $list26, list(JSON_PRINT, key), $list36, append(body, $list37) });
    }

    public static SubLObject json_serialize_atom_sequence(final SubLObject sequence, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = $json_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $json_stream$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $json_sequence_startedP$.currentBinding(thread);
        try {
            $json_stream$.bind(stream, thread);
            $json_sequence_startedP$.bind(NIL, thread);
            json_princ($str38$_);
            final SubLObject _prev_bind_0_$2 = $json_indent_level$.currentBinding(thread);
            try {
                $json_indent_level$.bind(number_utilities.f_1X($json_indent_level$.getDynamicValue(thread)), thread);
                for (SubLObject sequence_var = sequence, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), element_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
                    final SubLObject item = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
                    if (NIL != $json_sequence_startedP$.getDynamicValue(thread)) {
                        json_princ($str39$_);
                    }
                    json_newline();
                    json_serialize_atom(item, UNPROVIDED);
                    $json_sequence_startedP$.setDynamicValue(T, thread);
                    sequence_var = subl_macros.do_sequence_index_update(sequence_var);
                    element_num = add(element_num, ONE_INTEGER);
                }
                json_princ($str40$_);
            } finally {
                $json_indent_level$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            $json_sequence_startedP$.rebind(_prev_bind_2, thread);
            $json_stream$.rebind(_prev_bind_0, thread);
        }
        return sequence;
    }

    public static SubLObject json_princ(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return princ(obj, $json_stream$.getDynamicValue(thread));
    }

    public static SubLObject json_print(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return prin1(obj, $json_stream$.getDynamicValue(thread));
    }

    public static SubLObject json_newline() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        terpri($json_stream$.getDynamicValue(thread));
        json_do_indent();
        return NIL;
    }

    public static SubLObject json_do_indent() {
        SubLThread thread;
        SubLObject i;
        for (thread = SubLProcess.currentSubLThread(), i = NIL, i = ZERO_INTEGER; i.numL($json_indent_level$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
            json_princ(CHAR_tab);
        }
        return $json_indent_level$.getDynamicValue(thread);
    }

    public static SubLObject json_lookup_path(final SubLObject keys, final SubLObject v_json) {
        if (NIL == keys) {
            return v_json;
        }
        final SubLObject key = keys.first();
        if (NIL != list_utilities.member_eqP(v_json, $list41)) {
            return NIL;
        }
        if (NIL != plist_with_keyword_keys_p(v_json)) {
            return json_lookup_path(keys.rest(), getf(v_json, key, UNPROVIDED));
        }
        if (key.isNumber()) {
            return json_lookup_path(keys.rest(), nth(key, v_json));
        }
        return v_json;
    }

    public static SubLObject print_json_to_string(final SubLObject v_object, SubLObject indent) {
        if (indent == UNPROVIDED) {
            indent = ZERO_INTEGER;
        }
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            print_json(v_object, stream, indent);
            string = get_output_stream_string(stream);
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
        return string;
    }

    public static SubLObject print_json(final SubLObject v_object, SubLObject stream, SubLObject indent) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (indent == UNPROVIDED) {
            indent = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject deeper_indent = add(indent, $print_json_indent_increment$.getDynamicValue(thread));
        if (NIL == v_object) {
            princ($$$null, stream);
        } else
            if (v_object == $EMPTY_OBJECT) {
                princ(CHAR_lbrace, stream);
                princ(CHAR_rbrace, stream);
            } else
                if (NIL != plist_with_keyword_keys_p(v_object)) {
                    SubLObject skipped_initial_commaP = NIL;
                    princ(CHAR_lbrace, stream);
                    terpri(stream);
                    SubLObject remainder;
                    SubLObject key;
                    SubLObject value;
                    for (remainder = NIL, remainder = v_object; NIL != remainder; remainder = cddr(remainder)) {
                        key = remainder.first();
                        value = cadr(remainder);
                        if (NIL != skipped_initial_commaP) {
                            princ(CHAR_comma, stream);
                            terpri(stream);
                        } else {
                            skipped_initial_commaP = T;
                        }
                        princ(Strings.make_string(deeper_indent, UNPROVIDED), stream);
                        princ(CHAR_quotation, stream);
                        princ(symbol_name(key), stream);
                        princ(CHAR_quotation, stream);
                        princ(CHAR_colon, stream);
                        princ(CHAR_space, stream);
                        print_json(value, stream, deeper_indent);
                    }
                    terpri(stream);
                    princ(Strings.make_string(indent, UNPROVIDED), stream);
                    princ(CHAR_rbrace, stream);
                } else
                    if (v_object == $EMPTY_ARRAY) {
                        princ(CHAR_lbracket, stream);
                        princ(CHAR_rbracket, stream);
                    } else
                        if (NIL != unicode_nauts.unicode_naut_p(v_object, UNPROVIDED)) {
                            json_serialize_atom(cycl_string.cycl_string_to_utf8_string(v_object), stream);
                        } else
                            if (v_object.isList()) {
                                SubLObject skipped_initial_commaP = NIL;
                                princ(CHAR_lbracket, stream);
                                princ(CHAR_space, stream);
                                SubLObject cdolist_list_var = v_object;
                                SubLObject elem = NIL;
                                elem = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != skipped_initial_commaP) {
                                        princ(CHAR_comma, stream);
                                        princ(CHAR_space, stream);
                                    } else {
                                        skipped_initial_commaP = T;
                                    }
                                    print_json(elem, stream, deeper_indent);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    elem = cdolist_list_var.first();
                                } 
                                princ(CHAR_space, stream);
                                princ(CHAR_rbracket, stream);
                            } else
                                if (NIL != kb_utilities.kbeq(v_object, $$True)) {
                                    princ($$$true, stream);
                                } else
                                    if (NIL != kb_utilities.kbeq(v_object, $$False)) {
                                        princ($$$false, stream);
                                    } else
                                        if (v_object.isString()) {
                                            json_serialize_atom(v_object, stream);
                                        } else
                                            if (v_object.isInteger()) {
                                                format(stream, $str47$_D, v_object);
                                            } else
                                                if (v_object.isNumber()) {
                                                    format(stream, $str48$_F, v_object);
                                                } else {
                                                    Errors.error($str49$Could_not_handle_JSON_object__S, v_object);
                                                }










        return NIL;
    }

    public static SubLObject plist_with_keyword_keys_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.property_list_p(v_object)) && (NIL != list_utilities.every_in_list(KEYWORDP, list_utilities.plist_keys(v_object), UNPROVIDED)));
    }

    public static SubLObject parse_json_from_string(final SubLObject string) {
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_input_stream(string, ZERO_INTEGER, NIL);
            result = parse_json_value_from_stream(stream);
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
        return result;
    }

    public static SubLObject parse_json_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(filename, $sym51$FILE_EXISTS_);
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str53$Unable_to_open__S, filename);
            }
            final SubLObject stream_$3 = stream;
            result = parse_json_value_from_stream(stream_$3);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }

    public static SubLObject parse_json_from_stream(final SubLObject stream) {
        final SubLObject result = parse_json_value_from_stream(stream);
        json_read_until_eof(stream);
        return result;
    }

    public static SubLObject parse_json_value_from_stream(final SubLObject stream) {
        json_read_whitespace(stream, UNPROVIDED);
        final SubLObject pcase_var;
        final SubLObject next_char = pcase_var = peek_char(NIL, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (pcase_var.eql(CHAR_quotation)) {
            return parse_json_string_from_stream(stream);
        }
        if (pcase_var.eql(CHAR_lbrace)) {
            return parse_json_object_from_stream(stream);
        }
        if (pcase_var.eql(CHAR_lbracket)) {
            return parse_json_array_from_stream(stream);
        }
        return parse_json_primitive_from_stream(stream);
    }

    public static SubLObject parse_json_object_from_stream(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        json_read_until_char(stream, CHAR_lbrace);
        json_read_whitespace(stream, UNPROVIDED);
        if (!CHAR_rbrace.eql(peek_char(NIL, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            SubLObject key;
            SubLObject value;
            SubLObject moreP;
            for (SubLObject doneP = NIL; NIL == doneP; doneP = makeBoolean(NIL == moreP) , result = cons(key, result) , result = cons(value, result)) {
                thread.resetMultipleValues();
                key = parse_json_keyXvalue_from_stream(stream);
                value = thread.secondMultipleValue();
                moreP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
            }
        }
        json_read_until_char(stream, CHAR_rbrace);
        return NIL != result ? nreverse(result) : $EMPTY_OBJECT;
    }

    public static SubLObject parse_json_keyXvalue_from_stream(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject key = parse_json_string_from_stream(stream);
        key = make_keyword(NIL != $json_capitalize_keysP$.getDynamicValue(thread) ? Strings.string_upcase(key, UNPROVIDED, UNPROVIDED) : key);
        json_read_until_char(stream, CHAR_colon);
        final SubLObject value = parse_json_value_from_stream(stream);
        final SubLObject moreP = json_read_whitespace(stream, $list55);
        return values(key, value, moreP);
    }

    public static SubLObject parse_json_string_from_stream(final SubLObject stream) {
        SubLObject result = NIL;
        json_read_until_char(stream, CHAR_quotation);
        final SubLObject string = json_read_until_char_unless(stream, CHAR_quotation, CHAR_backslash);
        result = unicode_nauts.utf8_string_to_cycl_safe_string(string_utilities.string_subst($str15$_, $str11$__, string, UNPROVIDED));
        return result;
    }

    public static SubLObject parse_json_primitive_from_stream(final SubLObject stream) {
        final SubLObject string = web_utilities.read_while(stream, ALPHANUMERIC_OR_NUMBER_CHAR_P, UNPROVIDED);
        final SubLObject possible_number = read_from_string_ignoring_errors(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (possible_number.isNumber()) {
            return possible_number;
        }
        final SubLObject downcase_string = Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
        if (NIL != Strings.stringE(downcase_string, $$$true, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $$True;
        }
        if (NIL != Strings.stringE(downcase_string, $$$false, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $$False;
        }
        if (NIL != Strings.stringE(downcase_string, $$$null, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        Errors.error($str57$Unexpected_JSON_when_reading_prim, stream, string);
        return NIL;
    }

    public static SubLObject parse_json_array_from_stream(final SubLObject stream) {
        SubLObject result = NIL;
        json_read_until_char(stream, CHAR_lbracket);
        json_read_whitespace(stream, UNPROVIDED);
        if (!CHAR_rbracket.eql(peek_char(NIL, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            SubLObject value;
            SubLObject moreP;
            for (SubLObject doneP = NIL; NIL == doneP; doneP = makeBoolean(NIL == moreP) , result = cons(value, result)) {
                value = parse_json_value_from_stream(stream);
                moreP = json_read_whitespace(stream, $list55);
            }
        }
        json_read_until_char(stream, CHAR_rbracket);
        return NIL != result ? nreverse(result) : $EMPTY_ARRAY;
    }

    public static SubLObject json_read_whitespace(final SubLObject stream, SubLObject additional_chars) {
        if (additional_chars == UNPROVIDED) {
            additional_chars = NIL;
        }
        SubLObject v_char = peek_char(NIL, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject additional_char_foundP = NIL;
        while ((NIL != member(v_char, additional_chars, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.whitespacep(v_char))) {
            if (NIL != subl_promotions.memberP(read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED), additional_chars, UNPROVIDED, UNPROVIDED)) {
                additional_char_foundP = T;
            }
            v_char = peek_char(NIL, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } 
        return additional_char_foundP;
    }

    public static SubLObject json_read_until_char(final SubLObject stream, final SubLObject v_char) {
        final SubLObject string = web_utilities.read_until_char(stream, v_char, UNPROVIDED);
        if (NIL == string_utilities.whitespace_stringP(string)) {
            Errors.error($str58$Unexpected_JSON_when_reading_to_c, v_char, stream, string);
        }
        return string;
    }

    public static SubLObject json_read_until_one_of(final SubLObject stream, final SubLObject chars) {
        final SubLObject string = web_utilities.read_until_one_of(stream, chars, UNPROVIDED);
        if (NIL == string_utilities.whitespace_stringP(string)) {
            Errors.error($str59$Unexpected_JSON_when_reading_to_c, chars, stream, string);
        }
        return string;
    }

    public static SubLObject json_read_until_char_unless(final SubLObject stream, final SubLObject v_char, final SubLObject unless_char) {
        final SubLObject string = web_utilities.read_until_char_unless(stream, v_char, unless_char, UNPROVIDED);
        return string;
    }

    public static SubLObject json_read_until_eof(final SubLObject stream) {
        final SubLObject string = web_utilities.slack_read_until_eof(stream, UNPROVIDED);
        if (NIL == string_utilities.whitespace_stringP(string)) {
            Errors.error($str60$Unexpected_JSON_when_reading_to_E, stream, string);
        }
        return string;
    }

    public static SubLObject json_round_trip(final SubLObject string) {
        final SubLObject initial_json = parse_json_from_string(string);
        final SubLObject json_trip1 = parse_json_from_string(print_json_to_string(initial_json, UNPROVIDED));
        return equal(initial_json, json_trip1);
    }

    public static SubLObject json_round_trip_from_list(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $json_capitalize_keysP$.currentBinding(thread);
        try {
            $json_capitalize_keysP$.bind(NIL, thread);
            final SubLObject json_trip1 = parse_json_from_string(print_json_to_string(list, UNPROVIDED));
            return equal(list, json_trip1);
        } finally {
            $json_capitalize_keysP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject declare_json_file() {
        declareMacro("with_json_output_to_stream", "WITH-JSON-OUTPUT-TO-STREAM");
        declareMacro("with_json_output_to_string", "WITH-JSON-OUTPUT-TO-STRING");
        declareFunction("json_special_charP", "JSON-SPECIAL-CHAR?", 1, 0, false);
        declareFunction("json_char_escaped_version", "JSON-CHAR-ESCAPED-VERSION", 1, 0, false);
        declareFunction("json_serialize", "JSON-SERIALIZE", 1, 0, false);
        declareFunction("json_write_wXescaped_special_chars", "JSON-WRITE-W/ESCAPED-SPECIAL-CHARS", 1, 0, false);
        declareFunction("json_serialize_atom", "JSON-SERIALIZE-ATOM", 1, 1, false);
        declareMacro("json_serializing_sequence", "JSON-SERIALIZING-SEQUENCE");
        declareMacro("json_indent", "JSON-INDENT");
        declareMacro("json_serialize_sequence_item", "JSON-SERIALIZE-SEQUENCE-ITEM");
        declareMacro("json_serializing_object", "JSON-SERIALIZING-OBJECT");
        declareMacro("json_serialize_object_field", "JSON-SERIALIZE-OBJECT-FIELD");
        declareFunction("json_serialize_atom_sequence", "JSON-SERIALIZE-ATOM-SEQUENCE", 1, 1, false);
        declareFunction("json_princ", "JSON-PRINC", 1, 0, false);
        declareFunction("json_print", "JSON-PRINT", 1, 0, false);
        declareFunction("json_newline", "JSON-NEWLINE", 0, 0, false);
        declareFunction("json_do_indent", "JSON-DO-INDENT", 0, 0, false);
        declareFunction("json_lookup_path", "JSON-LOOKUP-PATH", 2, 0, false);
        declareFunction("print_json_to_string", "PRINT-JSON-TO-STRING", 1, 1, false);
        declareFunction("print_json", "PRINT-JSON", 1, 2, false);
        declareFunction("plist_with_keyword_keys_p", "PLIST-WITH-KEYWORD-KEYS-P", 1, 0, false);
        declareFunction("parse_json_from_string", "PARSE-JSON-FROM-STRING", 1, 0, false);
        declareFunction("parse_json_from_file", "PARSE-JSON-FROM-FILE", 1, 0, false);
        declareFunction("parse_json_from_stream", "PARSE-JSON-FROM-STREAM", 1, 0, false);
        declareFunction("parse_json_value_from_stream", "PARSE-JSON-VALUE-FROM-STREAM", 1, 0, false);
        declareFunction("parse_json_object_from_stream", "PARSE-JSON-OBJECT-FROM-STREAM", 1, 0, false);
        declareFunction("parse_json_keyXvalue_from_stream", "PARSE-JSON-KEY/VALUE-FROM-STREAM", 1, 0, false);
        declareFunction("parse_json_string_from_stream", "PARSE-JSON-STRING-FROM-STREAM", 1, 0, false);
        declareFunction("parse_json_primitive_from_stream", "PARSE-JSON-PRIMITIVE-FROM-STREAM", 1, 0, false);
        declareFunction("parse_json_array_from_stream", "PARSE-JSON-ARRAY-FROM-STREAM", 1, 0, false);
        declareFunction("json_read_whitespace", "JSON-READ-WHITESPACE", 1, 1, false);
        declareFunction("json_read_until_char", "JSON-READ-UNTIL-CHAR", 2, 0, false);
        declareFunction("json_read_until_one_of", "JSON-READ-UNTIL-ONE-OF", 2, 0, false);
        declareFunction("json_read_until_char_unless", "JSON-READ-UNTIL-CHAR-UNLESS", 3, 0, false);
        declareFunction("json_read_until_eof", "JSON-READ-UNTIL-EOF", 1, 0, false);
        declareFunction("json_round_trip", "JSON-ROUND-TRIP", 1, 0, false);
        declareFunction("json_round_trip_from_list", "JSON-ROUND-TRIP-FROM-LIST", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_json_file() {
        defparameter("*JSON-STREAM*", T);
        defconstant("*JSON-SPECIAL-CHARS*", $list8);
        defparameter("*JSON-SEQUENCE-STARTED?*", NIL);
        defparameter("*JSON-INDENT-LEVEL*", ZERO_INTEGER);
        defparameter("*JSON-OBJECT-STARTED?*", NIL);
        defparameter("*PRINT-JSON-INDENT-INCREMENT*", TWO_INTEGER);
        defparameter("*JSON-CAPITALIZE-KEYS?*", T);
        return NIL;
    }

    public static SubLObject setup_json_file() {
        define_test_case_table_int(JSON_ROUND_TRIP, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list69);
        define_test_case_table_int(JSON_ROUND_TRIP_FROM_LIST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list71);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_json_file();
    }

    @Override
    public void initializeVariables() {
        init_json_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_json_file();
    }

    static {
















































































    }
}

/**
 * Total time: 244 ms
 */
