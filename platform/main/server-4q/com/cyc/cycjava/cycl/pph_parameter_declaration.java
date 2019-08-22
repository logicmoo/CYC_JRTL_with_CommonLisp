package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_parameter_declaration extends SubLTranslatedFile {
    public static final SubLFile me = new pph_parameter_declaration();

    public static final String myName = "com.cyc.cycjava.cycl.pph_parameter_declaration";

    public static final String myFingerPrint = "94447e5cf4ec5d4e6110478a69562e148c74bcaf802ed5ff3577eae5b461da5d";



    // deflexical
    // Keywords that may be used in declaring a PPH parameter
    private static final SubLSymbol $pph_parameter_declaration_keywords$ = makeSymbol("*PPH-PARAMETER-DECLARATION-KEYWORDS*");

    // deflexical
    private static final SubLSymbol $pph_parameter_types$ = makeSymbol("*PPH-PARAMETER-TYPES*");

    // Internal Constants
    public static final SubLSymbol $pph_parameter_declarations$ = makeSymbol("*PPH-PARAMETER-DECLARATIONS*");

    public static final SubLSymbol PPH_PARAMETER_DECLARATIONS = makeSymbol("PPH-PARAMETER-DECLARATIONS");

    public static final SubLSymbol DO_PPH_PARAMETER_DECLARATIONS = makeSymbol("DO-PPH-PARAMETER-DECLARATIONS");

    public static final SubLList $list3 = list(list(makeSymbol("PARAM"), makeSymbol("VALUE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list5 = list(list(makeSymbol("PPH-PARAMETER-DECLARATIONS")));

    public static final SubLList $list6 = list(makeSymbol("NAME"), makeSymbol("PLIST"));

    public static final SubLSymbol $sym7$PROPERTIES = makeUninternedSymbol("PROPERTIES");





    public static final SubLSymbol VALIDATE_PPH_PARAMETER_DECLARATION = makeSymbol("VALIDATE-PPH-PARAMETER-DECLARATION");

    public static final SubLSymbol ENTER_PPH_PARAMETER_DECLARATION = makeSymbol("ENTER-PPH-PARAMETER-DECLARATION");



    public static final SubLSymbol DEFINE_PPH_PARAMETER_SETTER = makeSymbol("DEFINE-PPH-PARAMETER-SETTER");

    public static final SubLSymbol PLIST_ENTER = makeSymbol("PLIST-ENTER");

    public static final SubLSymbol PPH_PARAMETER_SETTER_NAME = makeSymbol("PPH-PARAMETER-SETTER-NAME");

    public static final SubLSymbol DECLARE_PPH_PARAMETER = makeSymbol("DECLARE-PPH-PARAMETER");

    public static final SubLList $list17 = list(makeSymbol("NAME"), makeSymbol("PLIST-FORM"));

    public static final SubLString $$$Set_value_of_ = makeString("Set value of ");

    public static final SubLString $str19$_in_PARAMS_to_VALUE_ = makeString(" in PARAMS to VALUE.");





    public static final SubLSymbol DEFINE_MACRO_HELPER = makeSymbol("DEFINE-MACRO-HELPER");

    public static final SubLList $list23 = list(makeSymbol("PARAMS"), makeSymbol("VALUE"));







    public static final SubLList $list27 = list(makeSymbol("CHECK-TYPE"), makeSymbol("PARAMS"), makeSymbol("PPH-MUTABLE-API-PARAMS-P"));

    public static final SubLSymbol SET_PPH_PARAMETER_VALUE = makeSymbol("SET-PPH-PARAMETER-VALUE");



    public static final SubLList $list30 = list(makeSymbol("VALUE"));

    public static final SubLList $list31 = list(list(makeSymbol("RET"), makeSymbol("PARAMS")));

    public static final SubLSymbol DEFMACRO_API_PROVISIONAL = makeSymbol("DEFMACRO-API-PROVISIONAL");

    public static final SubLList $list33 = list(makeSymbol("PARAMS-FORM"), makeSymbol("VALUE"));

    public static final SubLList $list34 = list(list(makeKeyword("RETURN-TYPES"), makeSymbol("PPH-API-PARAM-LIST-P")));

    public static final SubLSymbol WITH_TEMP_VARS = makeSymbol("WITH-TEMP-VARS");

    public static final SubLList $list36 = list(makeSymbol("PARAMS"));



    public static final SubLSymbol PPH_PARAMETER_SETTER_BODY = makeSymbol("PPH-PARAMETER-SETTER-BODY");

    public static final SubLSymbol PARAMS_FORM = makeSymbol("PARAMS-FORM");



    public static final SubLString $str41$SET_ = makeString("SET-");

    public static final SubLString $str42$_INTERNAL = makeString("-INTERNAL");

    public static final SubLList $list43 = list(makeSymbol("PARAMS"), makeSymbol("PPH-MUTABLE-API-PARAMS-P"));



    public static final SubLList $list45 = list(cons(makeKeyword("CORRESPONDING-GLOBAL"), makeSymbol("SYMBOLP")), cons(makeKeyword("SETTER"), makeSymbol("SYMBOLP")), cons(makeKeyword("TYPE"), makeSymbol("PPH-PARAMETER-TYPE-P")), cons(makeKeyword("CHECK-TYPE"), makeSymbol("SYMBOLP")), cons(makeKeyword("DOCUMENTATION"), makeSymbol("STRINGP")), cons(makeKeyword("DEFAULT-VALUE-FORM"), makeSymbol("TRUE")));

    public static final SubLList $list46 = list(makeKeyword("TOP-LEVEL"), makeKeyword("PPH-GOODNESS"), makeKeyword("PPH-FORMAT"), makeKeyword("PPH-FORMALITY"), makeKeyword("PPH-PRECISION"), makeKeyword("PPH-MISC"));



    public static final SubLString $str48$Unrecognized_property_in_declarat = makeString("Unrecognized property in declaration: ~S");

    public static final SubLString $str49$Value__S_fails_test__S_for__S = makeString("Value ~S fails test ~S for ~S");





    private static final SubLSymbol $DEFAULT_VALUE_FORM = makeKeyword("DEFAULT-VALUE-FORM");

    public static final SubLList $list53 = list(list(makeSymbol("PARAM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym54$TUPLE = makeUninternedSymbol("TUPLE");



    public static final SubLList $list56 = list(list(makeSymbol("NEW-PPH-API-PARAM-ITERATOR")));



    public static final SubLSymbol NEW_PPH_API_PARAM_ITERATOR = makeSymbol("NEW-PPH-API-PARAM-ITERATOR");

    public static final SubLSymbol DO_PPH_API_PARAMS = makeSymbol("DO-PPH-API-PARAMS");



    public static final SubLString $str61$______S_________Description_____A = makeString("~%===~S===\n* \'\'\'Description\'\'\' ~A\n* \'\'\'Setter Macro\'\'\' <tt>~A</tt>\n* \'\'\'Default Value\'\'\' <tt>~S</tt>\n* \'\'\'Values must pass ~A.~%");

    public static SubLObject pph_parameter_declarations() {
        return $pph_parameter_declarations$.getGlobalValue();
    }

    public static SubLObject do_pph_parameter_declarations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject param = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        param = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_DICTIONARY, listS(param, value, $list5), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static SubLObject declare_pph_parameter(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject plist = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        plist = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list6);
            return NIL;
        }
        final SubLObject v_properties = $sym7$PROPERTIES;
        if (NIL != getf(plist, $SETTER, NIL)) {
            return list(CLET, list(list(v_properties, plist)), list(VALIDATE_PPH_PARAMETER_DECLARATION, name, v_properties), list(ENTER_PPH_PARAMETER_DECLARATION, name, v_properties));
        }
        return list(PROGN, list(DEFINE_PPH_PARAMETER_SETTER, name, plist), list(CLET, list(list(v_properties, plist)), list(PLIST_ENTER, v_properties, $SETTER, list(PPH_PARAMETER_SETTER_NAME, name)), list(VALIDATE_PPH_PARAMETER_DECLARATION, name, v_properties), list(ENTER_PPH_PARAMETER_DECLARATION, name, v_properties)));
    }

    public static SubLObject enter_pph_parameter_declaration(final SubLObject name, final SubLObject v_properties) {
        return dictionary.dictionary_enter($pph_parameter_declarations$.getGlobalValue(), name, v_properties);
    }

    public static SubLObject define_pph_parameter_setter(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject plist_form = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        plist_form = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject macro_name = pph_parameter_setter_name(name);
            final SubLObject helper_name = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject doc_string = cconcatenate($$$Set_value_of_, new SubLObject[]{ format_nil.format_nil_s_no_copy(name), $str19$_in_PARAMS_to_VALUE_, format_nil.$format_nil_percent$.getGlobalValue() });
            final SubLObject plist = eval(plist_form);
            final SubLObject arg_types = pph_parameter_setter_arg_types(plist);
            final SubLObject check_type = getf(plist, $CHECK_TYPE, TRUE);
            return list(PROGN, listS(DEFINE_MACRO_HELPER, new SubLObject[]{ helper_name, $list23, list($MACRO, macro_name), doc_string, list(CHECK_TYPE, VALUE, check_type), $list27, listS(SET_PPH_PARAMETER_VALUE, PARAMS, name, $list30), $list31 }), list(DEFMACRO_API_PROVISIONAL, macro_name, $list33, doc_string, bq_cons(arg_types, $list34), list(WITH_TEMP_VARS, $list36, list(RET, list(PPH_PARAMETER_SETTER_BODY, PARAMS_FORM, PARAMS, VALUE, list(QUOTE, helper_name))))));
        }
        cdestructuring_bind_error(datum, $list17);
        return NIL;
    }

    public static SubLObject set_pph_parameter_value(final SubLObject params, final SubLObject name, final SubLObject value) {
        dictionary.dictionary_enter(params, name, value);
        return params;
    }

    public static SubLObject pph_parameter_setter_body(final SubLObject params_form, final SubLObject params, final SubLObject value, final SubLObject helper_name) {
        return list(CLET, list(list(params, params_form)), list(helper_name, params, value));
    }

    public static SubLObject pph_parameter_setter_name(final SubLObject parameter_keyword) {
        final SubLObject keyword_name = symbol_name(parameter_keyword);
        final SubLObject macro_name = intern(make_symbol(cconcatenate($str41$SET_, keyword_name)), UNPROVIDED);
        final SubLObject helper_name = intern(make_symbol(cconcatenate($str41$SET_, new SubLObject[]{ keyword_name, $str42$_INTERNAL })), UNPROVIDED);
        return values(macro_name, helper_name);
    }

    public static SubLObject pph_parameter_setter_arg_types(final SubLObject plist) {
        SubLObject arg_types = NIL;
        final SubLObject check_type = getf(plist, $CHECK_TYPE, UNPROVIDED);
        if (NIL != fboundp(check_type)) {
            arg_types = cons(list(VALUE, check_type), arg_types);
        }
        arg_types = cons($list43, arg_types);
        arg_types = cons($ARGUMENT_TYPES, arg_types);
        return arg_types;
    }

    public static SubLObject undeclare_pph_parameter(final SubLObject name) {
        return dictionary.dictionary_remove($pph_parameter_declarations$.getGlobalValue(), name);
    }

    public static SubLObject pph_parameter_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $pph_parameter_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject validate_pph_parameter_declaration(final SubLObject name, final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != keywordp(name) : "Types.keywordp(name) " + "CommonSymbols.NIL != Types.keywordp(name) " + name;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject pred;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            pred = list_utilities.alist_lookup($pph_parameter_declaration_keywords$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == fboundp(pred))) {
                Errors.error($str48$Unrecognized_property_in_declarat, property);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == funcall(pred, value))) {
                Errors.error($str49$Value__S_fails_test__S_for__S, value, pred, property);
            }
        }
        return T;
    }

    public static SubLObject get_pph_param_type(final SubLObject param) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(pph_parameter_declarations(), param, NIL);
        return getf(plist, $TYPE, NIL);
    }

    public static SubLObject get_pph_param_corresponding_global(final SubLObject param) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(pph_parameter_declarations(), param, NIL);
        return getf(plist, $CORRESPONDING_GLOBAL, NIL);
    }

    public static SubLObject valid_pph_param_value_pair_p(final SubLObject param, final SubLObject value) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(pph_parameter_declarations(), param, UNPROVIDED);
        final SubLObject check_type = getf(plist, $CHECK_TYPE, UNPROVIDED);
        if (NIL == plist) {
            return NIL;
        }
        if (NIL != fboundp(check_type)) {
            return funcall(check_type, value);
        }
        return NIL;
    }

    public static SubLObject pph_default_for_param(final SubLObject param) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(pph_parameter_declarations(), param, NIL);
        final SubLObject corresponding_global = getf(plist, $CORRESPONDING_GLOBAL, NIL);
        final SubLObject default_value_form = getf(plist, $DEFAULT_VALUE_FORM, NIL);
        return NIL != corresponding_global ? symbol_value(corresponding_global) : eval(default_value_form);
    }

    public static SubLObject do_pph_api_params(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject param = NIL;
        destructuring_bind_must_consp(current, datum, $list53);
        param = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject tuple = $sym54$TUPLE;
            return list(DO_ITERATOR, bq_cons(tuple, $list56), listS(CLET, list(list(param, list(FIRST, tuple))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list53);
        return NIL;
    }

    public static SubLObject new_pph_api_param_iterator() {
        return dictionary.new_dictionary_iterator(pph_parameter_declarations());
    }

    public static SubLObject print_wiki_documentation_for_pph_api_param(final SubLObject param) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(pph_parameter_declarations(), param, UNPROVIDED);
        final SubLObject setter = getf(plist, $SETTER, UNPROVIDED);
        final SubLObject doc_string = getf(plist, $DOCUMENTATION, UNPROVIDED);
        final SubLObject check_type = getf(plist, $CHECK_TYPE, UNPROVIDED);
        format(T, $str61$______S_________Description_____A, new SubLObject[]{ param, doc_string, Strings.string_downcase(symbol_name(setter), UNPROVIDED, UNPROVIDED), pph_default_for_param(param), check_type });
        return NIL;
    }

    public static SubLObject declare_pph_parameter_declaration_file() {
        declareFunction(me, "pph_parameter_declarations", "PPH-PARAMETER-DECLARATIONS", 0, 0, false);
        declareMacro(me, "do_pph_parameter_declarations", "DO-PPH-PARAMETER-DECLARATIONS");
        declareMacro(me, "declare_pph_parameter", "DECLARE-PPH-PARAMETER");
        declareFunction(me, "enter_pph_parameter_declaration", "ENTER-PPH-PARAMETER-DECLARATION", 2, 0, false);
        declareMacro(me, "define_pph_parameter_setter", "DEFINE-PPH-PARAMETER-SETTER");
        declareFunction(me, "set_pph_parameter_value", "SET-PPH-PARAMETER-VALUE", 3, 0, false);
        declareFunction(me, "pph_parameter_setter_body", "PPH-PARAMETER-SETTER-BODY", 4, 0, false);
        declareFunction(me, "pph_parameter_setter_name", "PPH-PARAMETER-SETTER-NAME", 1, 0, false);
        declareFunction(me, "pph_parameter_setter_arg_types", "PPH-PARAMETER-SETTER-ARG-TYPES", 1, 0, false);
        declareFunction(me, "undeclare_pph_parameter", "UNDECLARE-PPH-PARAMETER", 1, 0, false);
        declareFunction(me, "pph_parameter_type_p", "PPH-PARAMETER-TYPE-P", 1, 0, false);
        declareFunction(me, "validate_pph_parameter_declaration", "VALIDATE-PPH-PARAMETER-DECLARATION", 2, 0, false);
        declareFunction(me, "get_pph_param_type", "GET-PPH-PARAM-TYPE", 1, 0, false);
        declareFunction(me, "get_pph_param_corresponding_global", "GET-PPH-PARAM-CORRESPONDING-GLOBAL", 1, 0, false);
        declareFunction(me, "valid_pph_param_value_pair_p", "VALID-PPH-PARAM-VALUE-PAIR-P", 2, 0, false);
        declareFunction(me, "pph_default_for_param", "PPH-DEFAULT-FOR-PARAM", 1, 0, false);
        declareMacro(me, "do_pph_api_params", "DO-PPH-API-PARAMS");
        declareFunction(me, "new_pph_api_param_iterator", "NEW-PPH-API-PARAM-ITERATOR", 0, 0, false);
        declareFunction(me, "print_wiki_documentation_for_pph_api_param", "PRINT-WIKI-DOCUMENTATION-FOR-PPH-API-PARAM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_parameter_declaration_file() {
        deflexical("*PPH-PARAMETER-DECLARATIONS*", SubLTrampolineFile.maybeDefault($pph_parameter_declarations$, $pph_parameter_declarations$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*PPH-PARAMETER-DECLARATION-KEYWORDS*", $list45);
        deflexical("*PPH-PARAMETER-TYPES*", $list46);
        return NIL;
    }

    public static SubLObject setup_pph_parameter_declaration_file() {
        declare_defglobal($pph_parameter_declarations$);
        register_macro_helper(PPH_PARAMETER_DECLARATIONS, DO_PPH_PARAMETER_DECLARATIONS);
        register_macro_helper(ENTER_PPH_PARAMETER_DECLARATION, DECLARE_PPH_PARAMETER);
        register_macro_helper(DEFINE_PPH_PARAMETER_SETTER, DECLARE_PPH_PARAMETER);
        register_macro_helper(PPH_PARAMETER_SETTER_BODY, DEFINE_PPH_PARAMETER_SETTER);
        register_macro_helper(PPH_PARAMETER_SETTER_NAME, DEFINE_PPH_PARAMETER_SETTER);
        register_macro_helper(VALIDATE_PPH_PARAMETER_DECLARATION, DECLARE_PPH_PARAMETER);
        register_macro_helper(NEW_PPH_API_PARAM_ITERATOR, DO_PPH_API_PARAMS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_parameter_declaration_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_parameter_declaration_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_parameter_declaration_file();
    }

    
}

/**
 * Total time: 185 ms
 */
