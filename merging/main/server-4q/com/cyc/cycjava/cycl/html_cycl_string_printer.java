package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_stale_constant_reference;
import static com.cyc.cycjava.cycl.html_utilities.html_string;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_cycl_string_printer extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new html_cycl_string_printer();

    public static final String myName = "com.cyc.cycjava_2.cycl.html_cycl_string_printer";


    // defconstant
    public static final SubLSymbol $dtp_html_cycl_string_printer$ = makeSymbol("*DTP-HTML-CYCL-STRING-PRINTER*");

    // deflexical
    private static final SubLSymbol $embedded_constant_suffix_strings$ = makeSymbol("*EMBEDDED-CONSTANT-SUFFIX-STRINGS*");

    // deflexical
    public static final SubLSymbol $cycl_string_allowable_html_tags$ = makeSymbol("*CYCL-STRING-ALLOWABLE-HTML-TAGS*");

    // defparameter
    public static final SubLSymbol $html_large_string_limit$ = makeSymbol("*HTML-LARGE-STRING-LIMIT*");

    private static final SubLSymbol HTML_CYCL_STRING_PRINTER = makeSymbol("HTML-CYCL-STRING-PRINTER");

    private static final SubLSymbol HTML_CYCL_STRING_PRINTER_P = makeSymbol("HTML-CYCL-STRING-PRINTER-P");

    private static final SubLList $list2 = list(new SubLObject[] { makeSymbol("STRING"), makeSymbol("LENGTH"), makeSymbol("LAST-IDX"), makeSymbol("INSIDE-CYCL-TAG?"), makeSymbol("HASH-IDX"), makeSymbol("COLON-IDX"), makeSymbol("LT-IDX"), makeSymbol("VARIABLE-IDX"), makeSymbol("URL-IDX"),
	    makeSymbol("URL-END-IDX"), makeSymbol("LINK-FUNCTION"), makeSymbol("REQUIRE-EXACT?") });

    private static final SubLList $list3 = list(new SubLObject[] { makeKeyword("STRING"), makeKeyword("LENGTH"), makeKeyword("LAST-IDX"), makeKeyword("INSIDE-CYCL-TAG?"), makeKeyword("HASH-IDX"), makeKeyword("COLON-IDX"), makeKeyword("LT-IDX"), makeKeyword("VARIABLE-IDX"), makeKeyword("URL-IDX"),
	    makeKeyword("URL-END-IDX"), makeKeyword("LINK-FUNCTION"), makeKeyword("REQUIRE-EXACT?") });

    private static final SubLList $list4 = list(new SubLObject[] { makeSymbol("HCS-STRING"), makeSymbol("HCS-LENGTH"), makeSymbol("HCS-LAST-IDX"), makeSymbol("HCS-INSIDE-CYCL-TAG?"), makeSymbol("HCS-HASH-IDX"), makeSymbol("HCS-COLON-IDX"), makeSymbol("HCS-LT-IDX"), makeSymbol("HCS-VARIABLE-IDX"),
	    makeSymbol("HCS-URL-IDX"), makeSymbol("HCS-URL-END-IDX"), makeSymbol("HCS-LINK-FUNCTION"), makeSymbol("HCS-REQUIRE-EXACT?") });

    private static final SubLList $list5 = list(new SubLObject[] { makeSymbol("_CSETF-HCS-STRING"), makeSymbol("_CSETF-HCS-LENGTH"), makeSymbol("_CSETF-HCS-LAST-IDX"), makeSymbol("_CSETF-HCS-INSIDE-CYCL-TAG?"), makeSymbol("_CSETF-HCS-HASH-IDX"), makeSymbol("_CSETF-HCS-COLON-IDX"),
	    makeSymbol("_CSETF-HCS-LT-IDX"), makeSymbol("_CSETF-HCS-VARIABLE-IDX"), makeSymbol("_CSETF-HCS-URL-IDX"), makeSymbol("_CSETF-HCS-URL-END-IDX"), makeSymbol("_CSETF-HCS-LINK-FUNCTION"), makeSymbol("_CSETF-HCS-REQUIRE-EXACT?") });

    private static final SubLSymbol PRINT_HTML_CYCL_STRING_PRINTER = makeSymbol("PRINT-HTML-CYCL-STRING-PRINTER");

    private static final SubLSymbol HTML_CYCL_STRING_PRINTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTML-CYCL-STRING-PRINTER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HTML-CYCL-STRING-PRINTER-P"));

    private static final SubLSymbol HCS_STRING = makeSymbol("HCS-STRING");

    private static final SubLSymbol _CSETF_HCS_STRING = makeSymbol("_CSETF-HCS-STRING");

    private static final SubLSymbol HCS_LENGTH = makeSymbol("HCS-LENGTH");

    private static final SubLSymbol _CSETF_HCS_LENGTH = makeSymbol("_CSETF-HCS-LENGTH");

    private static final SubLSymbol HCS_LAST_IDX = makeSymbol("HCS-LAST-IDX");

    private static final SubLSymbol _CSETF_HCS_LAST_IDX = makeSymbol("_CSETF-HCS-LAST-IDX");

    private static final SubLSymbol $sym15$HCS_INSIDE_CYCL_TAG_ = makeSymbol("HCS-INSIDE-CYCL-TAG?");

    private static final SubLSymbol $sym16$_CSETF_HCS_INSIDE_CYCL_TAG_ = makeSymbol("_CSETF-HCS-INSIDE-CYCL-TAG?");

    private static final SubLSymbol HCS_HASH_IDX = makeSymbol("HCS-HASH-IDX");

    private static final SubLSymbol _CSETF_HCS_HASH_IDX = makeSymbol("_CSETF-HCS-HASH-IDX");

    private static final SubLSymbol HCS_COLON_IDX = makeSymbol("HCS-COLON-IDX");

    private static final SubLSymbol _CSETF_HCS_COLON_IDX = makeSymbol("_CSETF-HCS-COLON-IDX");

    private static final SubLSymbol HCS_LT_IDX = makeSymbol("HCS-LT-IDX");

    private static final SubLSymbol _CSETF_HCS_LT_IDX = makeSymbol("_CSETF-HCS-LT-IDX");

    private static final SubLSymbol HCS_VARIABLE_IDX = makeSymbol("HCS-VARIABLE-IDX");

    private static final SubLSymbol _CSETF_HCS_VARIABLE_IDX = makeSymbol("_CSETF-HCS-VARIABLE-IDX");

    private static final SubLSymbol HCS_URL_IDX = makeSymbol("HCS-URL-IDX");

    private static final SubLSymbol _CSETF_HCS_URL_IDX = makeSymbol("_CSETF-HCS-URL-IDX");

    private static final SubLSymbol HCS_URL_END_IDX = makeSymbol("HCS-URL-END-IDX");

    private static final SubLSymbol _CSETF_HCS_URL_END_IDX = makeSymbol("_CSETF-HCS-URL-END-IDX");

    private static final SubLSymbol HCS_LINK_FUNCTION = makeSymbol("HCS-LINK-FUNCTION");

    private static final SubLSymbol _CSETF_HCS_LINK_FUNCTION = makeSymbol("_CSETF-HCS-LINK-FUNCTION");

    private static final SubLSymbol $sym31$HCS_REQUIRE_EXACT_ = makeSymbol("HCS-REQUIRE-EXACT?");

    private static final SubLSymbol $sym32$_CSETF_HCS_REQUIRE_EXACT_ = makeSymbol("_CSETF-HCS-REQUIRE-EXACT?");

    private static final SubLSymbol $LAST_IDX = makeKeyword("LAST-IDX");

    private static final SubLSymbol $kw36$INSIDE_CYCL_TAG_ = makeKeyword("INSIDE-CYCL-TAG?");

    private static final SubLSymbol $HASH_IDX = makeKeyword("HASH-IDX");

    private static final SubLSymbol $COLON_IDX = makeKeyword("COLON-IDX");

    private static final SubLSymbol $LT_IDX = makeKeyword("LT-IDX");

    private static final SubLSymbol $VARIABLE_IDX = makeKeyword("VARIABLE-IDX");

    private static final SubLSymbol $URL_IDX = makeKeyword("URL-IDX");

    private static final SubLSymbol $URL_END_IDX = makeKeyword("URL-END-IDX");

    private static final SubLSymbol $LINK_FUNCTION = makeKeyword("LINK-FUNCTION");

    private static final SubLSymbol $kw44$REQUIRE_EXACT_ = makeKeyword("REQUIRE-EXACT?");

    private static final SubLString $str45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_HTML_CYCL_STRING_PRINTER = makeSymbol("MAKE-HTML-CYCL-STRING-PRINTER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HTML_CYCL_STRING_PRINTER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTML-CYCL-STRING-PRINTER-METHOD");

    private static final SubLString $str51$_HTML_CYCL_STRING_PRINTER_ = makeString("<HTML-CYCL-STRING-PRINTER>");

    private static final SubLString $str56$__ = makeString(":?");

    private static final SubLString $str57$_a_href___S__A__a_ = makeString("<a href= ~S>~A</a>");

    private static final SubLList $list58 = list(makeString("es"), makeString("es:"));

    private static final SubLList $list60 = list(new SubLObject[] { makeString("i"), makeString("b"), makeString("sub"), makeString("sup"), makeString("pre"), makeString("code"), makeString("blockquote"), makeString("p"), makeString("br") });

    private static final SubLSymbol $sym62$EL_VARIABLE_CHAR_ = makeSymbol("EL-VARIABLE-CHAR?");

    private static final SubLSymbol $sym63$STRING_ = makeSymbol("STRING=");

    private static final SubLString $str64$_ = makeString("<");

    private static final SubLString $str65$_ = makeString("/");

    private static final SubLString $str66$_ = makeString(">");

    private static final SubLString $$$code = makeString("code");

    private static final SubLString $$$pre = makeString("pre");

    public static SubLObject html_cycl_string_printer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	print_html_cycl_string_printer(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject html_cycl_string_printer_p(final SubLObject v_object) {
	return v_object.getClass() == $html_cycl_string_printer_native.class ? T : NIL;
    }

    public static SubLObject hcs_string(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField2();
    }

    public static SubLObject hcs_length(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField3();
    }

    public static SubLObject hcs_last_idx(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField4();
    }

    public static SubLObject hcs_inside_cycl_tagP(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField5();
    }

    public static SubLObject hcs_hash_idx(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField6();
    }

    public static SubLObject hcs_colon_idx(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField7();
    }

    public static SubLObject hcs_lt_idx(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField8();
    }

    public static SubLObject hcs_variable_idx(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField9();
    }

    public static SubLObject hcs_url_idx(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField10();
    }

    public static SubLObject hcs_url_end_idx(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField11();
    }

    public static SubLObject hcs_link_function(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField12();
    }

    public static SubLObject hcs_require_exactP(final SubLObject v_object) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.getField13();
    }

    public static SubLObject _csetf_hcs_string(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_hcs_length(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_hcs_last_idx(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_hcs_inside_cycl_tagP(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_hcs_hash_idx(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_hcs_colon_idx(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_hcs_lt_idx(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static SubLObject _csetf_hcs_variable_idx(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField9(value);
    }

    public static SubLObject _csetf_hcs_url_idx(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField10(value);
    }

    public static SubLObject _csetf_hcs_url_end_idx(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField11(value);
    }

    public static SubLObject _csetf_hcs_link_function(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField12(value);
    }

    public static SubLObject _csetf_hcs_require_exactP(final SubLObject v_object, final SubLObject value) {
	assert NIL != html_cycl_string_printer_p(v_object) : "html_cycl_string_printer.html_cycl_string_printer_p error :" + v_object;
	return v_object.setField13(value);
    }

    public static SubLObject make_html_cycl_string_printer(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $html_cycl_string_printer_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($STRING)) {
		_csetf_hcs_string(v_new, current_value);
	    } else if (pcase_var.eql($LENGTH)) {
		_csetf_hcs_length(v_new, current_value);
	    } else if (pcase_var.eql($LAST_IDX)) {
		_csetf_hcs_last_idx(v_new, current_value);
	    } else if (pcase_var.eql($kw36$INSIDE_CYCL_TAG_)) {
		_csetf_hcs_inside_cycl_tagP(v_new, current_value);
	    } else if (pcase_var.eql($HASH_IDX)) {
		_csetf_hcs_hash_idx(v_new, current_value);
	    } else if (pcase_var.eql($COLON_IDX)) {
		_csetf_hcs_colon_idx(v_new, current_value);
	    } else if (pcase_var.eql($LT_IDX)) {
		_csetf_hcs_lt_idx(v_new, current_value);
	    } else if (pcase_var.eql($VARIABLE_IDX)) {
		_csetf_hcs_variable_idx(v_new, current_value);
	    } else if (pcase_var.eql($URL_IDX)) {
		_csetf_hcs_url_idx(v_new, current_value);
	    } else if (pcase_var.eql($URL_END_IDX)) {
		_csetf_hcs_url_end_idx(v_new, current_value);
	    } else if (pcase_var.eql($LINK_FUNCTION)) {
		_csetf_hcs_link_function(v_new, current_value);
	    } else if (pcase_var.eql($kw44$REQUIRE_EXACT_)) {
		_csetf_hcs_require_exactP(v_new, current_value);
	    } else {
		Errors.error($str45$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_html_cycl_string_printer(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_HTML_CYCL_STRING_PRINTER, TWELVE_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $STRING, hcs_string(obj));
	funcall(visitor_fn, obj, $SLOT, $LENGTH, hcs_length(obj));
	funcall(visitor_fn, obj, $SLOT, $LAST_IDX, hcs_last_idx(obj));
	funcall(visitor_fn, obj, $SLOT, $kw36$INSIDE_CYCL_TAG_, hcs_inside_cycl_tagP(obj));
	funcall(visitor_fn, obj, $SLOT, $HASH_IDX, hcs_hash_idx(obj));
	funcall(visitor_fn, obj, $SLOT, $COLON_IDX, hcs_colon_idx(obj));
	funcall(visitor_fn, obj, $SLOT, $LT_IDX, hcs_lt_idx(obj));
	funcall(visitor_fn, obj, $SLOT, $VARIABLE_IDX, hcs_variable_idx(obj));
	funcall(visitor_fn, obj, $SLOT, $URL_IDX, hcs_url_idx(obj));
	funcall(visitor_fn, obj, $SLOT, $URL_END_IDX, hcs_url_end_idx(obj));
	funcall(visitor_fn, obj, $SLOT, $LINK_FUNCTION, hcs_link_function(obj));
	funcall(visitor_fn, obj, $SLOT, $kw44$REQUIRE_EXACT_, hcs_require_exactP(obj));
	funcall(visitor_fn, obj, $END, MAKE_HTML_CYCL_STRING_PRINTER, TWELVE_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_html_cycl_string_printer_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_html_cycl_string_printer(obj, visitor_fn);
    }

    public static SubLObject print_html_cycl_string_printer(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	format(stream, $str51$_HTML_CYCL_STRING_PRINTER_);
	return v_object;
    }

    public static SubLObject new_html_cycl_string_printer(final SubLObject string, SubLObject link_function, SubLObject require_exactP) {
	if (link_function == UNPROVIDED) {
	    link_function = CB_FORM;
	}
	if (require_exactP == UNPROVIDED) {
	    require_exactP = NIL;
	}
	final SubLObject printer = make_html_cycl_string_printer(UNPROVIDED);
	_csetf_hcs_string(printer, string);
	_csetf_hcs_length(printer, length(string));
	_csetf_hcs_last_idx(printer, ZERO_INTEGER);
	_csetf_hcs_inside_cycl_tagP(printer, NIL);
	hcs_set_hash_idx(printer);
	hcs_set_colon_idx(printer);
	_csetf_hcs_lt_idx(printer, hcs_find(printer, CHAR_less, hcs_last_idx(printer)));
	_csetf_hcs_variable_idx(printer, html_cycl_string_variable_index(string, hcs_last_idx(printer)));
	_csetf_hcs_url_idx(printer, ZERO_INTEGER);
	_csetf_hcs_url_end_idx(printer, ZERO_INTEGER);
	_csetf_hcs_link_function(printer, link_function);
	_csetf_hcs_require_exactP(printer, require_exactP);
	return printer;
    }

    public static SubLObject html_cycl_string_printer_done_p(final SubLObject printer) {
	return makeBoolean(((((NIL == hcs_colon_idx(printer)) && (NIL == hcs_hash_idx(printer))) && (NIL == hcs_last_idx(printer))) && (NIL == hcs_lt_idx(printer))) && (NIL == hcs_variable_idx(printer)));
    }

    public static SubLObject html_cycl_string_printer_print_next(final SubLObject printer) {
	if ((((NIL == hcs_colon_idx(printer)) && (NIL == hcs_hash_idx(printer))) && (NIL == hcs_lt_idx(printer))) && (NIL == hcs_variable_idx(printer))) {
	    hcs_print(printer, NIL, T);
	    return $DONE;
	}
	final SubLObject next_char_idx = apply(symbol_function(MIN), remove_if(symbol_function(NULL), list(hcs_hash_idx(printer), hcs_colon_idx(printer), hcs_lt_idx(printer), hcs_variable_idx(printer)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
	if (hcs_colon_idx(printer).eql(next_char_idx)) {
	    hcs_handle_colon(printer);
	} else if (hcs_hash_idx(printer).eql(next_char_idx)) {
	    hcs_handle_hash(printer);
	} else if (hcs_variable_idx(printer).eql(next_char_idx)) {
	    hcs_handle_variable(printer);
	} else if (hcs_lt_idx(printer).eql(next_char_idx)) {
	    hcs_handle_lt(printer);
	}

	return NIL;
    }

    public static SubLObject html_cycl_string_variable_index(final SubLObject string, final SubLObject start_char) {
	SubLObject prev_char = CHAR_space;
	SubLObject inside_tagP = NIL;
	SubLObject end_var_$1;
	SubLObject end_var;
	SubLObject n;
	SubLObject this_char;
	for (end_var = end_var_$1 = length(string), n = NIL, n = start_char; !n.numGE(end_var_$1); n = number_utilities.f_1X(n)) {
	    this_char = Strings.sublisp_char(string, n);
	    if (NIL != inside_tagP) {
		if (this_char.eql(CHAR_greater)) {
		    inside_tagP = NIL;
		}
	    } else if (this_char.eql(CHAR_less)) {
		inside_tagP = T;
	    } else {
		if ((NIL != string_utilities.whitespacep(prev_char)) && (NIL != find(this_char, $str56$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
		    return n;
		}
		if ((((NIL != string_utilities.whitespacep(prev_char)) && (NIL != list_utilities.lengthG(string, number_utilities.f_1X(n), UNPROVIDED))) && (NIL != cycl_variables.el_variable_charP(this_char)))
			&& (NIL != cycl_variables.el_variable_charP(Strings.sublisp_char(string, number_utilities.f_1X(n))))) {
		    return n;
		}
		prev_char = this_char;
	    }

	}
	return NIL;
    }

    public static SubLObject print_url_with_tag(final SubLObject string) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (!string.isString()) {
	    return NIL;
	}
	format(html_macros.$html_stream$.getDynamicValue(thread), $str57$_a_href___S__A__a_, string, string);
	return string;
    }

    public static SubLObject print_embedded_constant(final SubLObject string, final SubLObject length, final SubLObject dollar_idx, SubLObject link_function, SubLObject require_exactP) {
	if (link_function == UNPROVIDED) {
	    link_function = CB_FORM;
	}
	if (require_exactP == UNPROVIDED) {
	    require_exactP = NIL;
	}
	final SubLObject token_start = add(dollar_idx, ONE_INTEGER);
	SubLObject token_end = list_utilities.position_if_not(symbol_function(VALID_CONSTANT_NAME_CHAR_P), string, symbol_function(IDENTITY), token_start, UNPROVIDED);
	SubLObject token_last = NIL;
	SubLObject possible_constant = NIL;
	if (NIL == token_end) {
	    token_end = length;
	}
	token_last = subtract(token_end, ONE_INTEGER);
	possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_end);
	if (((NIL == possible_constant) && (NIL == require_exactP)) && (NIL == possible_constant)) {
	    SubLObject csome_list_var = $embedded_constant_suffix_strings$.getGlobalValue();
	    SubLObject suffix_string = NIL;
	    suffix_string = csome_list_var.first();
	    while ((NIL == possible_constant) && (NIL != csome_list_var)) {
		SubLObject abort_this_suffixP;
		SubLObject i;
		SubLObject j;
		SubLObject chari;
		SubLObject possible_token_last;
		for (abort_this_suffixP = NIL, i = NIL, j = NIL, i = subtract(length(suffix_string), ONE_INTEGER), j = ZERO_INTEGER; ((!i.numL(ZERO_INTEGER)) && (NIL == possible_constant)) && (NIL == abort_this_suffixP); i = subtract(i, ONE_INTEGER), j = add(j, ONE_INTEGER)) {
		    chari = Strings.sublisp_char(suffix_string, i);
		    possible_token_last = subtract(token_last, j);
		    if (possible_token_last.numG(token_start) && (NIL != char_equal(chari, Strings.sublisp_char(string, possible_token_last)))) {
			possible_constant = constant_completion_high.constant_complete_exact(string, token_start, possible_token_last);
			if (NIL != possible_constant) {
			    token_end = possible_token_last;
			}
		    } else {
			abort_this_suffixP = T;
		    }
		}
		csome_list_var = csome_list_var.rest();
		suffix_string = csome_list_var.first();
	    }
	}
	if (NIL != possible_constant) {
	    if (CB_FORM == link_function) {
		cb_form(possible_constant, UNPROVIDED, UNPROVIDED);
	    } else {
		funcall(link_function, possible_constant);
	    }
	} else {
	    html_stale_constant_reference(string, subtract(dollar_idx, ONE_INTEGER), token_end);
	}
	return token_end;
    }

    public static SubLObject hcs_find(final SubLObject printer, final SubLObject v_char, final SubLObject start) {
	return position(v_char, hcs_string(printer), symbol_function(EQL), symbol_function(IDENTITY), start, UNPROVIDED);
    }

    public static SubLObject hcs_set_colon_idx(final SubLObject printer) {
	_csetf_hcs_colon_idx(printer, hcs_find(printer, CHAR_colon, hcs_last_idx(printer)));
	return hcs_colon_idx(printer);
    }

    public static SubLObject hcs_set_hash_idx(final SubLObject printer) {
	_csetf_hcs_hash_idx(printer, hcs_find(printer, CHAR_hash, hcs_last_idx(printer)));
	return hcs_hash_idx(printer);
    }

    public static SubLObject hcs_print(final SubLObject printer, final SubLObject end, final SubLObject move_last_idx_to_endP) {
	html_string(hcs_string(printer), hcs_last_idx(printer), end);
	if (NIL != move_last_idx_to_endP) {
	    _csetf_hcs_last_idx(printer, end);
	}
	return printer;
    }

    public static SubLObject hcs_handle_colon(final SubLObject printer) {
	_csetf_hcs_url_idx(printer, web_utilities.find_url_beginning(hcs_string(printer), hcs_length(printer), hcs_colon_idx(printer)));
	if (NIL != hcs_url_idx(printer)) {
	    _csetf_hcs_url_end_idx(printer, web_utilities.find_url_end(hcs_string(printer), hcs_length(printer), hcs_url_idx(printer)));
	}
	if ((NIL != hcs_url_idx(printer)) && (NIL != hcs_url_end_idx(printer))) {
	    hcs_print(printer, hcs_url_idx(printer), NIL);
	    print_url_with_tag(subseq(hcs_string(printer), hcs_url_idx(printer), hcs_url_end_idx(printer)));
	    _csetf_hcs_last_idx(printer, hcs_url_end_idx(printer));
	} else {
	    hcs_print(printer, add(ONE_INTEGER, hcs_colon_idx(printer)), T);
	}
	hcs_set_colon_idx(printer);
	hcs_set_hash_idx(printer);
	_csetf_hcs_variable_idx(printer, position_if($sym62$EL_VARIABLE_CHAR_, hcs_string(printer), symbol_function(IDENTITY), hcs_last_idx(printer), UNPROVIDED));
	return printer;
    }

    public static SubLObject hcs_handle_hash(final SubLObject printer) {
	hcs_print(printer, hcs_hash_idx(printer), NIL);
	final SubLObject dollar_idx = add(hcs_hash_idx(printer), ONE_INTEGER);
	if (dollar_idx.numE(hcs_length(printer)) || (!Strings.sublisp_char(hcs_string(printer), dollar_idx).eql(constant_reader.constant_reader_macro_char()))) {
	    html_princ(CHAR_hash);
	    _csetf_hcs_last_idx(printer, dollar_idx);
	} else {
	    _csetf_hcs_last_idx(printer, print_embedded_constant(hcs_string(printer), hcs_length(printer), dollar_idx, hcs_link_function(printer), hcs_require_exactP(printer)));
	}
	hcs_set_hash_idx(printer);
	hcs_set_colon_idx(printer);
	_csetf_hcs_variable_idx(printer, position_if($sym62$EL_VARIABLE_CHAR_, hcs_string(printer), symbol_function(IDENTITY), hcs_last_idx(printer), UNPROVIDED));
	return printer;
    }

    public static SubLObject hcs_handle_variable(final SubLObject printer) {
	hcs_print(printer, hcs_variable_idx(printer), T);
	final SubLObject non_variable_idx = list_utilities.position_if_not($sym62$EL_VARIABLE_CHAR_, hcs_string(printer), symbol_function(IDENTITY), hcs_variable_idx(printer), UNPROVIDED);
	if ((((NIL != hcs_inside_cycl_tagP(printer)) && (NIL != non_variable_idx)) && non_variable_idx.numG(hcs_variable_idx(printer))) && (NIL == alpha_char_p(Strings.sublisp_char(hcs_string(printer), non_variable_idx)))) {
	    final SubLObject variable_name = subseq(hcs_string(printer), hcs_variable_idx(printer), non_variable_idx);
	    if (NIL != cycl_variables.valid_el_var_nameP(variable_name)) {
		html_princ(variable_name);
	    } else if (NIL != string_utilities.integer_string_p(variable_name)) {
		html_princ(variable_name);
	    } else {
		html_markup(html_macros.$html_bold_head$.getGlobalValue());
		html_princ(variable_name);
		html_markup(html_macros.$html_bold_tail$.getGlobalValue());
	    }

	    _csetf_hcs_last_idx(printer, non_variable_idx);
	}
	if (NIL != non_variable_idx) {
	    _csetf_hcs_variable_idx(printer, html_cycl_string_variable_index(hcs_string(printer), non_variable_idx));
	} else {
	    _csetf_hcs_variable_idx(printer, NIL);
	}
	return printer;
    }

    public static SubLObject hcs_handle_lt(final SubLObject printer) {
	hcs_print(printer, hcs_lt_idx(printer), T);
	final SubLObject gt_idx = hcs_find(printer, CHAR_greater, hcs_lt_idx(printer));
	if (NIL != gt_idx) {
	    final SubLObject tag_start_idx = (NIL != charE(CHAR_slash, Strings.sublisp_char(hcs_string(printer), add(hcs_lt_idx(printer), ONE_INTEGER)))) ? TWO_INTEGER : ONE_INTEGER;
	    final SubLObject tag = subseq(hcs_string(printer), add(hcs_lt_idx(printer), tag_start_idx), gt_idx);
	    if (NIL != subl_promotions.memberP(Strings.string_downcase(string_utilities.trim_whitespace(tag), UNPROVIDED, UNPROVIDED), $cycl_string_allowable_html_tags$.getGlobalValue(), symbol_function($sym63$STRING_), UNPROVIDED)) {
		html_markup($str64$_);
		if (TWO_INTEGER.eql(tag_start_idx)) {
		    html_princ($str65$_);
		}
		html_markup(tag);
		html_markup($str66$_);
		if ((NIL != Strings.string_equal(tag, $$$code, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.string_equal(tag, $$$pre, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
		    if (TWO_INTEGER.eql(tag_start_idx)) {
			_csetf_hcs_inside_cycl_tagP(printer, NIL);
		    } else {
			_csetf_hcs_inside_cycl_tagP(printer, T);
		    }
		}
		_csetf_hcs_last_idx(printer, add(gt_idx, ONE_INTEGER));
	    }
	}
	_csetf_hcs_lt_idx(printer, hcs_find(printer, CHAR_less, add(hcs_lt_idx(printer), ONE_INTEGER)));
	return printer;
    }

    public static SubLObject declare_html_cycl_string_printer_file() {
	declareFunction("html_cycl_string_printer_print_function_trampoline", "HTML-CYCL-STRING-PRINTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("html_cycl_string_printer_p", "HTML-CYCL-STRING-PRINTER-P", 1, 0, false);
	new html_cycl_string_printer.$html_cycl_string_printer_p$UnaryFunction();
	declareFunction("hcs_string", "HCS-STRING", 1, 0, false);
	declareFunction("hcs_length", "HCS-LENGTH", 1, 0, false);
	declareFunction("hcs_last_idx", "HCS-LAST-IDX", 1, 0, false);
	declareFunction("hcs_inside_cycl_tagP", "HCS-INSIDE-CYCL-TAG?", 1, 0, false);
	declareFunction("hcs_hash_idx", "HCS-HASH-IDX", 1, 0, false);
	declareFunction("hcs_colon_idx", "HCS-COLON-IDX", 1, 0, false);
	declareFunction("hcs_lt_idx", "HCS-LT-IDX", 1, 0, false);
	declareFunction("hcs_variable_idx", "HCS-VARIABLE-IDX", 1, 0, false);
	declareFunction("hcs_url_idx", "HCS-URL-IDX", 1, 0, false);
	declareFunction("hcs_url_end_idx", "HCS-URL-END-IDX", 1, 0, false);
	declareFunction("hcs_link_function", "HCS-LINK-FUNCTION", 1, 0, false);
	declareFunction("hcs_require_exactP", "HCS-REQUIRE-EXACT?", 1, 0, false);
	declareFunction("_csetf_hcs_string", "_CSETF-HCS-STRING", 2, 0, false);
	declareFunction("_csetf_hcs_length", "_CSETF-HCS-LENGTH", 2, 0, false);
	declareFunction("_csetf_hcs_last_idx", "_CSETF-HCS-LAST-IDX", 2, 0, false);
	declareFunction("_csetf_hcs_inside_cycl_tagP", "_CSETF-HCS-INSIDE-CYCL-TAG?", 2, 0, false);
	declareFunction("_csetf_hcs_hash_idx", "_CSETF-HCS-HASH-IDX", 2, 0, false);
	declareFunction("_csetf_hcs_colon_idx", "_CSETF-HCS-COLON-IDX", 2, 0, false);
	declareFunction("_csetf_hcs_lt_idx", "_CSETF-HCS-LT-IDX", 2, 0, false);
	declareFunction("_csetf_hcs_variable_idx", "_CSETF-HCS-VARIABLE-IDX", 2, 0, false);
	declareFunction("_csetf_hcs_url_idx", "_CSETF-HCS-URL-IDX", 2, 0, false);
	declareFunction("_csetf_hcs_url_end_idx", "_CSETF-HCS-URL-END-IDX", 2, 0, false);
	declareFunction("_csetf_hcs_link_function", "_CSETF-HCS-LINK-FUNCTION", 2, 0, false);
	declareFunction("_csetf_hcs_require_exactP", "_CSETF-HCS-REQUIRE-EXACT?", 2, 0, false);
	declareFunction("make_html_cycl_string_printer", "MAKE-HTML-CYCL-STRING-PRINTER", 0, 1, false);
	declareFunction("visit_defstruct_html_cycl_string_printer", "VISIT-DEFSTRUCT-HTML-CYCL-STRING-PRINTER", 2, 0, false);
	declareFunction("visit_defstruct_object_html_cycl_string_printer_method", "VISIT-DEFSTRUCT-OBJECT-HTML-CYCL-STRING-PRINTER-METHOD", 2, 0, false);
	declareFunction("print_html_cycl_string_printer", "PRINT-HTML-CYCL-STRING-PRINTER", 3, 0, false);
	declareFunction("new_html_cycl_string_printer", "NEW-HTML-CYCL-STRING-PRINTER", 1, 2, false);
	declareFunction("html_cycl_string_printer_done_p", "HTML-CYCL-STRING-PRINTER-DONE-P", 1, 0, false);
	declareFunction("html_cycl_string_printer_print_next", "HTML-CYCL-STRING-PRINTER-PRINT-NEXT", 1, 0, false);
	declareFunction("html_cycl_string_variable_index", "HTML-CYCL-STRING-VARIABLE-INDEX", 2, 0, false);
	declareFunction("print_url_with_tag", "PRINT-URL-WITH-TAG", 1, 0, false);
	declareFunction("print_embedded_constant", "PRINT-EMBEDDED-CONSTANT", 3, 2, false);
	declareFunction("hcs_find", "HCS-FIND", 3, 0, false);
	declareFunction("hcs_set_colon_idx", "HCS-SET-COLON-IDX", 1, 0, false);
	declareFunction("hcs_set_hash_idx", "HCS-SET-HASH-IDX", 1, 0, false);
	declareFunction("hcs_print", "HCS-PRINT", 3, 0, false);
	declareFunction("hcs_handle_colon", "HCS-HANDLE-COLON", 1, 0, false);
	declareFunction("hcs_handle_hash", "HCS-HANDLE-HASH", 1, 0, false);
	declareFunction("hcs_handle_variable", "HCS-HANDLE-VARIABLE", 1, 0, false);
	declareFunction("hcs_handle_lt", "HCS-HANDLE-LT", 1, 0, false);
	return NIL;
    }

    public static SubLObject init_html_cycl_string_printer_file() {
	defconstant("*DTP-HTML-CYCL-STRING-PRINTER*", HTML_CYCL_STRING_PRINTER);
	deflexical("*EMBEDDED-CONSTANT-SUFFIX-STRINGS*", $list58);
	deflexical("*CYCL-STRING-ALLOWABLE-HTML-TAGS*", $list60);
	defparameter("*HTML-LARGE-STRING-LIMIT*", $int$4096);
	return NIL;
    }

    public static SubLObject setup_html_cycl_string_printer_file() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_html_cycl_string_printer$.getGlobalValue(), symbol_function(HTML_CYCL_STRING_PRINTER_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list8);
	def_csetf(HCS_STRING, _CSETF_HCS_STRING);
	def_csetf(HCS_LENGTH, _CSETF_HCS_LENGTH);
	def_csetf(HCS_LAST_IDX, _CSETF_HCS_LAST_IDX);
	def_csetf($sym15$HCS_INSIDE_CYCL_TAG_, $sym16$_CSETF_HCS_INSIDE_CYCL_TAG_);
	def_csetf(HCS_HASH_IDX, _CSETF_HCS_HASH_IDX);
	def_csetf(HCS_COLON_IDX, _CSETF_HCS_COLON_IDX);
	def_csetf(HCS_LT_IDX, _CSETF_HCS_LT_IDX);
	def_csetf(HCS_VARIABLE_IDX, _CSETF_HCS_VARIABLE_IDX);
	def_csetf(HCS_URL_IDX, _CSETF_HCS_URL_IDX);
	def_csetf(HCS_URL_END_IDX, _CSETF_HCS_URL_END_IDX);
	def_csetf(HCS_LINK_FUNCTION, _CSETF_HCS_LINK_FUNCTION);
	def_csetf($sym31$HCS_REQUIRE_EXACT_, $sym32$_CSETF_HCS_REQUIRE_EXACT_);
	identity(HTML_CYCL_STRING_PRINTER);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_html_cycl_string_printer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTML_CYCL_STRING_PRINTER_METHOD));
	note_funcall_helper_function(PRINT_HTML_CYCL_STRING_PRINTER);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_html_cycl_string_printer_file();
    }

    @Override
    public void initializeVariables() {
	init_html_cycl_string_printer_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_html_cycl_string_printer_file();
    }

    

    public static final class $html_cycl_string_printer_native extends SubLStructNative {
	public SubLObject $string;

	public SubLObject $length;

	public SubLObject $last_idx;

	public SubLObject $inside_cycl_tagP;

	public SubLObject $hash_idx;

	public SubLObject $colon_idx;

	public SubLObject $lt_idx;

	public SubLObject $variable_idx;

	public SubLObject $url_idx;

	public SubLObject $url_end_idx;

	public SubLObject $link_function;

	public SubLObject $require_exactP;

	private static final SubLStructDeclNative structDecl;

	private $html_cycl_string_printer_native() {
	    this.$string = Lisp.NIL;
	    this.$length = Lisp.NIL;
	    this.$last_idx = Lisp.NIL;
	    this.$inside_cycl_tagP = Lisp.NIL;
	    this.$hash_idx = Lisp.NIL;
	    this.$colon_idx = Lisp.NIL;
	    this.$lt_idx = Lisp.NIL;
	    this.$variable_idx = Lisp.NIL;
	    this.$url_idx = Lisp.NIL;
	    this.$url_end_idx = Lisp.NIL;
	    this.$link_function = Lisp.NIL;
	    this.$require_exactP = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return this.$string;
	}

	@Override
	public SubLObject getField3() {
	    return this.$length;
	}

	@Override
	public SubLObject getField4() {
	    return this.$last_idx;
	}

	@Override
	public SubLObject getField5() {
	    return this.$inside_cycl_tagP;
	}

	@Override
	public SubLObject getField6() {
	    return this.$hash_idx;
	}

	@Override
	public SubLObject getField7() {
	    return this.$colon_idx;
	}

	@Override
	public SubLObject getField8() {
	    return this.$lt_idx;
	}

	@Override
	public SubLObject getField9() {
	    return this.$variable_idx;
	}

	@Override
	public SubLObject getField10() {
	    return this.$url_idx;
	}

	@Override
	public SubLObject getField11() {
	    return this.$url_end_idx;
	}

	@Override
	public SubLObject getField12() {
	    return this.$link_function;
	}

	@Override
	public SubLObject getField13() {
	    return this.$require_exactP;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$string = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return this.$length = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return this.$last_idx = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return this.$inside_cycl_tagP = value;
	}

	@Override
	public SubLObject setField6(final SubLObject value) {
	    return this.$hash_idx = value;
	}

	@Override
	public SubLObject setField7(final SubLObject value) {
	    return this.$colon_idx = value;
	}

	@Override
	public SubLObject setField8(final SubLObject value) {
	    return this.$lt_idx = value;
	}

	@Override
	public SubLObject setField9(final SubLObject value) {
	    return this.$variable_idx = value;
	}

	@Override
	public SubLObject setField10(final SubLObject value) {
	    return this.$url_idx = value;
	}

	@Override
	public SubLObject setField11(final SubLObject value) {
	    return this.$url_end_idx = value;
	}

	@Override
	public SubLObject setField12(final SubLObject value) {
	    return this.$link_function = value;
	}

	@Override
	public SubLObject setField13(final SubLObject value) {
	    return this.$require_exactP = value;
	}

	static {
	    structDecl = makeStructDeclNative($html_cycl_string_printer_native.class, HTML_CYCL_STRING_PRINTER, HTML_CYCL_STRING_PRINTER_P, $list2, $list3,
		    new String[] { "$string", "$length", "$last_idx", "$inside_cycl_tagP", "$hash_idx", "$colon_idx", "$lt_idx", "$variable_idx", "$url_idx", "$url_end_idx", "$link_function", "$require_exactP" }, $list4, $list5, PRINT_HTML_CYCL_STRING_PRINTER);
	}
    }

    public static final class $html_cycl_string_printer_p$UnaryFunction extends UnaryFunction {
	public $html_cycl_string_printer_p$UnaryFunction() {
	    super(extractFunctionNamed("HTML-CYCL-STRING-PRINTER-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return html_cycl_string_printer_p(arg1);
	}
    }
}

/**
 * Total time: 203 ms
 */
