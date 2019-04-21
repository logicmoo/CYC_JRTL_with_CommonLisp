package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_parameter_declaration extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_parameter_declaration";
    public static final String myFingerPrint = "94447e5cf4ec5d4e6110478a69562e148c74bcaf802ed5ff3577eae5b461da5d";
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 870L)
    private static SubLSymbol $pph_parameter_declarations$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 4637L)
    private static SubLSymbol $pph_parameter_declaration_keywords$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 5046L)
    private static SubLSymbol $pph_parameter_types$;
    private static final SubLSymbol $sym0$_PPH_PARAMETER_DECLARATIONS_;
    private static final SubLSymbol $sym1$PPH_PARAMETER_DECLARATIONS;
    private static final SubLSymbol $sym2$DO_PPH_PARAMETER_DECLARATIONS;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$DO_DICTIONARY;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PROPERTIES;
    private static final SubLSymbol $kw8$SETTER;
    private static final SubLSymbol $sym9$CLET;
    private static final SubLSymbol $sym10$VALIDATE_PPH_PARAMETER_DECLARATION;
    private static final SubLSymbol $sym11$ENTER_PPH_PARAMETER_DECLARATION;
    private static final SubLSymbol $sym12$PROGN;
    private static final SubLSymbol $sym13$DEFINE_PPH_PARAMETER_SETTER;
    private static final SubLSymbol $sym14$PLIST_ENTER;
    private static final SubLSymbol $sym15$PPH_PARAMETER_SETTER_NAME;
    private static final SubLSymbol $sym16$DECLARE_PPH_PARAMETER;
    private static final SubLList $list17;
    private static final SubLString $str18$Set_value_of_;
    private static final SubLString $str19$_in_PARAMS_to_VALUE_;
    private static final SubLSymbol $kw20$CHECK_TYPE;
    private static final SubLSymbol $sym21$TRUE;
    private static final SubLSymbol $sym22$DEFINE_MACRO_HELPER;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$MACRO;
    private static final SubLSymbol $sym25$CHECK_TYPE;
    private static final SubLSymbol $sym26$VALUE;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$SET_PPH_PARAMETER_VALUE;
    private static final SubLSymbol $sym29$PARAMS;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$DEFMACRO_API_PROVISIONAL;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$WITH_TEMP_VARS;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$RET;
    private static final SubLSymbol $sym38$PPH_PARAMETER_SETTER_BODY;
    private static final SubLSymbol $sym39$PARAMS_FORM;
    private static final SubLSymbol $sym40$QUOTE;
    private static final SubLString $str41$SET_;
    private static final SubLString $str42$_INTERNAL;
    private static final SubLList $list43;
    private static final SubLSymbol $kw44$ARGUMENT_TYPES;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$KEYWORDP;
    private static final SubLString $str48$Unrecognized_property_in_declarat;
    private static final SubLString $str49$Value__S_fails_test__S_for__S;
    private static final SubLSymbol $kw50$TYPE;
    private static final SubLSymbol $kw51$CORRESPONDING_GLOBAL;
    private static final SubLSymbol $kw52$DEFAULT_VALUE_FORM;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$TUPLE;
    private static final SubLSymbol $sym55$DO_ITERATOR;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$FIRST;
    private static final SubLSymbol $sym58$NEW_PPH_API_PARAM_ITERATOR;
    private static final SubLSymbol $sym59$DO_PPH_API_PARAMS;
    private static final SubLSymbol $kw60$DOCUMENTATION;
    private static final SubLString $str61$______S_________Description_____A;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 938L)
    public static SubLObject pph_parameter_declarations() {
        return pph_parameter_declaration.$pph_parameter_declarations$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 1070L)
    public static SubLObject do_pph_parameter_declarations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declaration.$list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject param = (SubLObject)pph_parameter_declaration.NIL;
        SubLObject value = (SubLObject)pph_parameter_declaration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declaration.$list3);
        param = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declaration.$list3);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declaration.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_parameter_declaration.$sym4$DO_DICTIONARY, (SubLObject)ConsesLow.listS(param, value, (SubLObject)pph_parameter_declaration.$list5), ConsesLow.append(body, (SubLObject)pph_parameter_declaration.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declaration.$list3);
        return (SubLObject)pph_parameter_declaration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 1326L)
    public static SubLObject declare_pph_parameter(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)pph_parameter_declaration.NIL;
        SubLObject plist = (SubLObject)pph_parameter_declaration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declaration.$list6);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declaration.$list6);
        plist = current.first();
        current = current.rest();
        if (pph_parameter_declaration.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declaration.$list6);
            return (SubLObject)pph_parameter_declaration.NIL;
        }
        final SubLObject v_properties = (SubLObject)pph_parameter_declaration.$sym7$PROPERTIES;
        if (pph_parameter_declaration.NIL != conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw8$SETTER, (SubLObject)pph_parameter_declaration.NIL)) {
            return (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_properties, plist)), (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym10$VALIDATE_PPH_PARAMETER_DECLARATION, name, v_properties), (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym11$ENTER_PPH_PARAMETER_DECLARATION, name, v_properties));
        }
        return (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym12$PROGN, (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym13$DEFINE_PPH_PARAMETER_SETTER, name, plist), (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_properties, plist)), (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym14$PLIST_ENTER, v_properties, (SubLObject)pph_parameter_declaration.$kw8$SETTER, (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym15$PPH_PARAMETER_SETTER_NAME, name)), (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym10$VALIDATE_PPH_PARAMETER_DECLARATION, name, v_properties), (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym11$ENTER_PPH_PARAMETER_DECLARATION, name, v_properties)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 2438L)
    public static SubLObject enter_pph_parameter_declaration(final SubLObject name, final SubLObject v_properties) {
        return dictionary.dictionary_enter(pph_parameter_declaration.$pph_parameter_declarations$.getGlobalValue(), name, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 2616L)
    public static SubLObject define_pph_parameter_setter(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)pph_parameter_declaration.NIL;
        SubLObject plist_form = (SubLObject)pph_parameter_declaration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declaration.$list17);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declaration.$list17);
        plist_form = current.first();
        current = current.rest();
        if (pph_parameter_declaration.NIL == current) {
            thread.resetMultipleValues();
            final SubLObject macro_name = pph_parameter_setter_name(name);
            final SubLObject helper_name = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject doc_string = Sequences.cconcatenate((SubLObject)pph_parameter_declaration.$str18$Set_value_of_, new SubLObject[] { format_nil.format_nil_s_no_copy(name), pph_parameter_declaration.$str19$_in_PARAMS_to_VALUE_, format_nil.$format_nil_percent$.getGlobalValue() });
            final SubLObject plist = Eval.eval(plist_form);
            final SubLObject arg_types = pph_parameter_setter_arg_types(plist);
            final SubLObject check_type = conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw20$CHECK_TYPE, (SubLObject)pph_parameter_declaration.$sym21$TRUE);
            return (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym12$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_parameter_declaration.$sym22$DEFINE_MACRO_HELPER, new SubLObject[] { helper_name, pph_parameter_declaration.$list23, ConsesLow.list((SubLObject)pph_parameter_declaration.$kw24$MACRO, macro_name), doc_string, ConsesLow.list((SubLObject)pph_parameter_declaration.$sym25$CHECK_TYPE, (SubLObject)pph_parameter_declaration.$sym26$VALUE, check_type), pph_parameter_declaration.$list27, ConsesLow.listS((SubLObject)pph_parameter_declaration.$sym28$SET_PPH_PARAMETER_VALUE, (SubLObject)pph_parameter_declaration.$sym29$PARAMS, name, (SubLObject)pph_parameter_declaration.$list30), pph_parameter_declaration.$list31 }), (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym32$DEFMACRO_API_PROVISIONAL, macro_name, (SubLObject)pph_parameter_declaration.$list33, doc_string, reader.bq_cons(arg_types, (SubLObject)pph_parameter_declaration.$list34), (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym35$WITH_TEMP_VARS, (SubLObject)pph_parameter_declaration.$list36, (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym37$RET, (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym38$PPH_PARAMETER_SETTER_BODY, (SubLObject)pph_parameter_declaration.$sym39$PARAMS_FORM, (SubLObject)pph_parameter_declaration.$sym29$PARAMS, (SubLObject)pph_parameter_declaration.$sym26$VALUE, (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym40$QUOTE, helper_name))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declaration.$list17);
        return (SubLObject)pph_parameter_declaration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 3517L)
    public static SubLObject set_pph_parameter_value(final SubLObject params, final SubLObject name, final SubLObject value) {
        dictionary.dictionary_enter(params, name, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 3635L)
    public static SubLObject pph_parameter_setter_body(final SubLObject params_form, final SubLObject params, final SubLObject value, final SubLObject helper_name) {
        return (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(params, params_form)), (SubLObject)ConsesLow.list(helper_name, params, value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 3836L)
    public static SubLObject pph_parameter_setter_name(final SubLObject parameter_keyword) {
        final SubLObject keyword_name = Symbols.symbol_name(parameter_keyword);
        final SubLObject macro_name = Packages.intern(Symbols.make_symbol(Sequences.cconcatenate((SubLObject)pph_parameter_declaration.$str41$SET_, keyword_name)), (SubLObject)pph_parameter_declaration.UNPROVIDED);
        final SubLObject helper_name = Packages.intern(Symbols.make_symbol(Sequences.cconcatenate((SubLObject)pph_parameter_declaration.$str41$SET_, new SubLObject[] { keyword_name, pph_parameter_declaration.$str42$_INTERNAL })), (SubLObject)pph_parameter_declaration.UNPROVIDED);
        return Values.values(macro_name, helper_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 4203L)
    public static SubLObject pph_parameter_setter_arg_types(final SubLObject plist) {
        SubLObject arg_types = (SubLObject)pph_parameter_declaration.NIL;
        final SubLObject check_type = conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw20$CHECK_TYPE, (SubLObject)pph_parameter_declaration.UNPROVIDED);
        if (pph_parameter_declaration.NIL != Symbols.fboundp(check_type)) {
            arg_types = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym26$VALUE, check_type), arg_types);
        }
        arg_types = (SubLObject)ConsesLow.cons((SubLObject)pph_parameter_declaration.$list43, arg_types);
        arg_types = (SubLObject)ConsesLow.cons((SubLObject)pph_parameter_declaration.$kw44$ARGUMENT_TYPES, arg_types);
        return arg_types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 4526L)
    public static SubLObject undeclare_pph_parameter(final SubLObject name) {
        return dictionary.dictionary_remove(pph_parameter_declaration.$pph_parameter_declarations$.getGlobalValue(), name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 5188L)
    public static SubLObject pph_parameter_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, pph_parameter_declaration.$pph_parameter_types$.getGlobalValue(), (SubLObject)pph_parameter_declaration.UNPROVIDED, (SubLObject)pph_parameter_declaration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 5281L)
    public static SubLObject validate_pph_parameter_declaration(final SubLObject name, final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_parameter_declaration.NIL != Types.keywordp(name) : name;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject pred;
        for (remainder = (SubLObject)pph_parameter_declaration.NIL, remainder = plist; pph_parameter_declaration.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            pred = list_utilities.alist_lookup(pph_parameter_declaration.$pph_parameter_declaration_keywords$.getGlobalValue(), property, (SubLObject)pph_parameter_declaration.UNPROVIDED, (SubLObject)pph_parameter_declaration.UNPROVIDED);
            if (pph_parameter_declaration.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && pph_parameter_declaration.NIL == Symbols.fboundp(pred)) {
                Errors.error((SubLObject)pph_parameter_declaration.$str48$Unrecognized_property_in_declarat, property);
            }
            if (pph_parameter_declaration.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && pph_parameter_declaration.NIL == Functions.funcall(pred, value)) {
                Errors.error((SubLObject)pph_parameter_declaration.$str49$Value__S_fails_test__S_for__S, value, pred, property);
            }
        }
        return (SubLObject)pph_parameter_declaration.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 5709L)
    public static SubLObject get_pph_param_type(final SubLObject param) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(pph_parameter_declarations(), param, (SubLObject)pph_parameter_declaration.NIL);
        return conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw50$TYPE, (SubLObject)pph_parameter_declaration.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 5937L)
    public static SubLObject get_pph_param_corresponding_global(final SubLObject param) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(pph_parameter_declarations(), param, (SubLObject)pph_parameter_declaration.NIL);
        return conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw51$CORRESPONDING_GLOBAL, (SubLObject)pph_parameter_declaration.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 6207L)
    public static SubLObject valid_pph_param_value_pair_p(final SubLObject param, final SubLObject value) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(pph_parameter_declarations(), param, (SubLObject)pph_parameter_declaration.UNPROVIDED);
        final SubLObject check_type = conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw20$CHECK_TYPE, (SubLObject)pph_parameter_declaration.UNPROVIDED);
        if (pph_parameter_declaration.NIL == plist) {
            return (SubLObject)pph_parameter_declaration.NIL;
        }
        if (pph_parameter_declaration.NIL != Symbols.fboundp(check_type)) {
            return Functions.funcall(check_type, value);
        }
        return (SubLObject)pph_parameter_declaration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 6535L)
    public static SubLObject pph_default_for_param(final SubLObject param) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(pph_parameter_declarations(), param, (SubLObject)pph_parameter_declaration.NIL);
        final SubLObject corresponding_global = conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw51$CORRESPONDING_GLOBAL, (SubLObject)pph_parameter_declaration.NIL);
        final SubLObject default_value_form = conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw52$DEFAULT_VALUE_FORM, (SubLObject)pph_parameter_declaration.NIL);
        return (pph_parameter_declaration.NIL != corresponding_global) ? Symbols.symbol_value(corresponding_global) : Eval.eval(default_value_form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 6958L)
    public static SubLObject do_pph_api_params(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declaration.$list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject param = (SubLObject)pph_parameter_declaration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declaration.$list53);
        param = current.first();
        current = current.rest();
        if (pph_parameter_declaration.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject tuple = (SubLObject)pph_parameter_declaration.$sym54$TUPLE;
            return (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym55$DO_ITERATOR, reader.bq_cons(tuple, (SubLObject)pph_parameter_declaration.$list56), (SubLObject)ConsesLow.listS((SubLObject)pph_parameter_declaration.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(param, (SubLObject)ConsesLow.list((SubLObject)pph_parameter_declaration.$sym57$FIRST, tuple))), ConsesLow.append(body, (SubLObject)pph_parameter_declaration.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declaration.$list53);
        return (SubLObject)pph_parameter_declaration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 7161L)
    public static SubLObject new_pph_api_param_iterator() {
        return dictionary.new_dictionary_iterator(pph_parameter_declarations());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 7306L)
    public static SubLObject print_wiki_documentation_for_pph_api_param(final SubLObject param) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(pph_parameter_declarations(), param, (SubLObject)pph_parameter_declaration.UNPROVIDED);
        final SubLObject setter = conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw8$SETTER, (SubLObject)pph_parameter_declaration.UNPROVIDED);
        final SubLObject doc_string = conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw60$DOCUMENTATION, (SubLObject)pph_parameter_declaration.UNPROVIDED);
        final SubLObject check_type = conses_high.getf(plist, (SubLObject)pph_parameter_declaration.$kw20$CHECK_TYPE, (SubLObject)pph_parameter_declaration.UNPROVIDED);
        PrintLow.format((SubLObject)pph_parameter_declaration.T, (SubLObject)pph_parameter_declaration.$str61$______S_________Description_____A, new SubLObject[] { param, doc_string, Strings.string_downcase(Symbols.symbol_name(setter), (SubLObject)pph_parameter_declaration.UNPROVIDED, (SubLObject)pph_parameter_declaration.UNPROVIDED), pph_default_for_param(param), check_type });
        return (SubLObject)pph_parameter_declaration.NIL;
    }
    
    public static SubLObject declare_pph_parameter_declaration_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "pph_parameter_declarations", "PPH-PARAMETER-DECLARATIONS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declaration", "do_pph_parameter_declarations", "DO-PPH-PARAMETER-DECLARATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declaration", "declare_pph_parameter", "DECLARE-PPH-PARAMETER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "enter_pph_parameter_declaration", "ENTER-PPH-PARAMETER-DECLARATION", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declaration", "define_pph_parameter_setter", "DEFINE-PPH-PARAMETER-SETTER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "set_pph_parameter_value", "SET-PPH-PARAMETER-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "pph_parameter_setter_body", "PPH-PARAMETER-SETTER-BODY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "pph_parameter_setter_name", "PPH-PARAMETER-SETTER-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "pph_parameter_setter_arg_types", "PPH-PARAMETER-SETTER-ARG-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "undeclare_pph_parameter", "UNDECLARE-PPH-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "pph_parameter_type_p", "PPH-PARAMETER-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "validate_pph_parameter_declaration", "VALIDATE-PPH-PARAMETER-DECLARATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "get_pph_param_type", "GET-PPH-PARAM-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "get_pph_param_corresponding_global", "GET-PPH-PARAM-CORRESPONDING-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "valid_pph_param_value_pair_p", "VALID-PPH-PARAM-VALUE-PAIR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "pph_default_for_param", "PPH-DEFAULT-FOR-PARAM", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declaration", "do_pph_api_params", "DO-PPH-API-PARAMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "new_pph_api_param_iterator", "NEW-PPH-API-PARAM-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declaration", "print_wiki_documentation_for_pph_api_param", "PRINT-WIKI-DOCUMENTATION-FOR-PPH-API-PARAM", 1, 0, false);
        return (SubLObject)pph_parameter_declaration.NIL;
    }
    
    public static SubLObject init_pph_parameter_declaration_file() {
        pph_parameter_declaration.$pph_parameter_declarations$ = SubLFiles.deflexical("*PPH-PARAMETER-DECLARATIONS*", maybeDefault((SubLObject)pph_parameter_declaration.$sym0$_PPH_PARAMETER_DECLARATIONS_, pph_parameter_declaration.$pph_parameter_declarations$, ()->(dictionary.new_dictionary((SubLObject)pph_parameter_declaration.UNPROVIDED, (SubLObject)pph_parameter_declaration.UNPROVIDED))));
        pph_parameter_declaration.$pph_parameter_declaration_keywords$ = SubLFiles.deflexical("*PPH-PARAMETER-DECLARATION-KEYWORDS*", (SubLObject)pph_parameter_declaration.$list45);
        pph_parameter_declaration.$pph_parameter_types$ = SubLFiles.deflexical("*PPH-PARAMETER-TYPES*", (SubLObject)pph_parameter_declaration.$list46);
        return (SubLObject)pph_parameter_declaration.NIL;
    }
    
    public static SubLObject setup_pph_parameter_declaration_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)pph_parameter_declaration.$sym0$_PPH_PARAMETER_DECLARATIONS_);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declaration.$sym1$PPH_PARAMETER_DECLARATIONS, (SubLObject)pph_parameter_declaration.$sym2$DO_PPH_PARAMETER_DECLARATIONS);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declaration.$sym11$ENTER_PPH_PARAMETER_DECLARATION, (SubLObject)pph_parameter_declaration.$sym16$DECLARE_PPH_PARAMETER);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declaration.$sym13$DEFINE_PPH_PARAMETER_SETTER, (SubLObject)pph_parameter_declaration.$sym16$DECLARE_PPH_PARAMETER);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declaration.$sym38$PPH_PARAMETER_SETTER_BODY, (SubLObject)pph_parameter_declaration.$sym13$DEFINE_PPH_PARAMETER_SETTER);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declaration.$sym15$PPH_PARAMETER_SETTER_NAME, (SubLObject)pph_parameter_declaration.$sym13$DEFINE_PPH_PARAMETER_SETTER);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declaration.$sym10$VALIDATE_PPH_PARAMETER_DECLARATION, (SubLObject)pph_parameter_declaration.$sym16$DECLARE_PPH_PARAMETER);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declaration.$sym58$NEW_PPH_API_PARAM_ITERATOR, (SubLObject)pph_parameter_declaration.$sym59$DO_PPH_API_PARAMS);
        return (SubLObject)pph_parameter_declaration.NIL;
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
    
    static {
        me = (SubLFile)new pph_parameter_declaration();
        pph_parameter_declaration.$pph_parameter_declarations$ = null;
        pph_parameter_declaration.$pph_parameter_declaration_keywords$ = null;
        pph_parameter_declaration.$pph_parameter_types$ = null;
        $sym0$_PPH_PARAMETER_DECLARATIONS_ = SubLObjectFactory.makeSymbol("*PPH-PARAMETER-DECLARATIONS*");
        $sym1$PPH_PARAMETER_DECLARATIONS = SubLObjectFactory.makeSymbol("PPH-PARAMETER-DECLARATIONS");
        $sym2$DO_PPH_PARAMETER_DECLARATIONS = SubLObjectFactory.makeSymbol("DO-PPH-PARAMETER-DECLARATIONS");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAM"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym4$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PARAMETER-DECLARATIONS")));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $sym7$PROPERTIES = SubLObjectFactory.makeUninternedSymbol("PROPERTIES");
        $kw8$SETTER = SubLObjectFactory.makeKeyword("SETTER");
        $sym9$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym10$VALIDATE_PPH_PARAMETER_DECLARATION = SubLObjectFactory.makeSymbol("VALIDATE-PPH-PARAMETER-DECLARATION");
        $sym11$ENTER_PPH_PARAMETER_DECLARATION = SubLObjectFactory.makeSymbol("ENTER-PPH-PARAMETER-DECLARATION");
        $sym12$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym13$DEFINE_PPH_PARAMETER_SETTER = SubLObjectFactory.makeSymbol("DEFINE-PPH-PARAMETER-SETTER");
        $sym14$PLIST_ENTER = SubLObjectFactory.makeSymbol("PLIST-ENTER");
        $sym15$PPH_PARAMETER_SETTER_NAME = SubLObjectFactory.makeSymbol("PPH-PARAMETER-SETTER-NAME");
        $sym16$DECLARE_PPH_PARAMETER = SubLObjectFactory.makeSymbol("DECLARE-PPH-PARAMETER");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST-FORM"));
        $str18$Set_value_of_ = SubLObjectFactory.makeString("Set value of ");
        $str19$_in_PARAMS_to_VALUE_ = SubLObjectFactory.makeString(" in PARAMS to VALUE.");
        $kw20$CHECK_TYPE = SubLObjectFactory.makeKeyword("CHECK-TYPE");
        $sym21$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym22$DEFINE_MACRO_HELPER = SubLObjectFactory.makeSymbol("DEFINE-MACRO-HELPER");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAMS"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $kw24$MACRO = SubLObjectFactory.makeKeyword("MACRO");
        $sym25$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $sym26$VALUE = SubLObjectFactory.makeSymbol("VALUE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMS"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-MUTABLE-API-PARAMS-P"));
        $sym28$SET_PPH_PARAMETER_VALUE = SubLObjectFactory.makeSymbol("SET-PPH-PARAMETER-VALUE");
        $sym29$PARAMS = SubLObjectFactory.makeSymbol("PARAMS");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMS")));
        $sym32$DEFMACRO_API_PROVISIONAL = SubLObjectFactory.makeSymbol("DEFMACRO-API-PROVISIONAL");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAMS-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-API-PARAM-LIST-P")));
        $sym35$WITH_TEMP_VARS = SubLObjectFactory.makeSymbol("WITH-TEMP-VARS");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAMS"));
        $sym37$RET = SubLObjectFactory.makeSymbol("RET");
        $sym38$PPH_PARAMETER_SETTER_BODY = SubLObjectFactory.makeSymbol("PPH-PARAMETER-SETTER-BODY");
        $sym39$PARAMS_FORM = SubLObjectFactory.makeSymbol("PARAMS-FORM");
        $sym40$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $str41$SET_ = SubLObjectFactory.makeString("SET-");
        $str42$_INTERNAL = SubLObjectFactory.makeString("-INTERNAL");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAMS"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-MUTABLE-API-PARAMS-P"));
        $kw44$ARGUMENT_TYPES = SubLObjectFactory.makeKeyword("ARGUMENT-TYPES");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SETTER"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-PARAMETER-TYPE-P")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE")));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-GOODNESS"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-FORMALITY"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-PRECISION"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-MISC"));
        $sym47$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $str48$Unrecognized_property_in_declarat = SubLObjectFactory.makeString("Unrecognized property in declaration: ~S");
        $str49$Value__S_fails_test__S_for__S = SubLObjectFactory.makeString("Value ~S fails test ~S for ~S");
        $kw50$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw51$CORRESPONDING_GLOBAL = SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL");
        $kw52$DEFAULT_VALUE_FORM = SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym54$TUPLE = SubLObjectFactory.makeUninternedSymbol("TUPLE");
        $sym55$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PPH-API-PARAM-ITERATOR")));
        $sym57$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym58$NEW_PPH_API_PARAM_ITERATOR = SubLObjectFactory.makeSymbol("NEW-PPH-API-PARAM-ITERATOR");
        $sym59$DO_PPH_API_PARAMS = SubLObjectFactory.makeSymbol("DO-PPH-API-PARAMS");
        $kw60$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $str61$______S_________Description_____A = SubLObjectFactory.makeString("~%===~S===\n* '''Description''' ~A\n* '''Setter Macro''' <tt>~A</tt>\n* '''Default Value''' <tt>~S</tt>\n* '''Values must pass ~A.~%");
    }
}

/*

	Total time: 185 ms
	
*/