package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cycl_variables extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cycl_variables";
    public static final String myFingerPrint = "6e9e6638714627aa795908aeb0682869b5dc53e01e74b5c30a9c9cd56c8f9349";
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 813L)
    private static SubLSymbol $el_variable_prefix_char$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1019L)
    private static SubLSymbol $el_variable_prefix_string$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1143L)
    private static SubLSymbol $el_variable_hyphen_char$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1269L)
    private static SubLSymbol $el_variable_invalid_hyphen_sequence$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1463L)
    public static SubLSymbol $valid_el_var_regular_expression$;
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 9304L)
    private static SubLSymbol $keyword_variable_prefix_char$;
    private static final SubLString $str0$_;
    private static final SubLString $str1$______________A_Z____A_Z___0_9___;
    private static final SubLSymbol $sym2$EL_VAR_;
    private static final SubLList $list3;
    private static final SubLString $str4$Return_T_iff_OBJECT_is_a_symbol_w;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$SYMBOLP;
    private static final SubLSymbol $sym7$INVALID_VARIABLE_NAME_CHAR;
    private static final SubLSymbol $sym8$STRING_;
    private static final SubLInteger $int9$200;
    private static final SubLString $str10$_C_A;
    private static final SubLSymbol $sym11$VARIABLE_SYMBOL_;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$HL_VAR_;
    private static final SubLSymbol $sym14$TL_VAR_;
    private static final SubLSymbol $sym15$KEYWORD_VAR_;
    private static final SubLSymbol $sym16$GENERIC_ARG_VAR_;
    private static final SubLSymbol $sym17$FALSE;
    private static final SubLSymbol $sym18$VALID_EL_VAR_NAME_;
    private static final SubLSymbol $kw19$TEST;
    private static final SubLSymbol $kw20$OWNER;
    private static final SubLSymbol $kw21$CLASSES;
    private static final SubLSymbol $kw22$KB;
    private static final SubLSymbol $kw23$TINY;
    private static final SubLSymbol $kw24$WORKING_;
    private static final SubLList $list25;
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1657L)
    public static SubLObject el_variable_prefix_char() {
        return cycl_variables.$el_variable_prefix_char$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1827L)
    public static SubLObject el_variable_prefix_string() {
        return cycl_variables.$el_variable_prefix_string$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 2001L)
    public static SubLObject el_variable_hyphen_char() {
        return cycl_variables.$el_variable_hyphen_char$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 2173L)
    public static SubLObject el_variable_prefix_charP(final SubLObject v_object) {
        return Characters.charE(v_object, el_variable_prefix_char());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 2385L)
    public static SubLObject has_el_variable_prefixP(final SubLObject string) {
        return el_variable_prefix_charP(Strings.sublisp_char(string, (SubLObject)cycl_variables.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 2574L)
    public static SubLObject has_dont_care_var_prefixP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL != el_variable_prefix_charP(Strings.sublisp_char(string, (SubLObject)cycl_variables.ZERO_INTEGER)) && cycl_variables.NIL != el_variable_prefix_charP(Strings.sublisp_char(string, (SubLObject)cycl_variables.ONE_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 2822L)
    public static SubLObject el_variable_hyphen_charP(final SubLObject v_object) {
        return Characters.charE(v_object, el_variable_hyphen_char());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 3035L)
    public static SubLObject el_variable_charP(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL != string_utilities.upper_case_alphanumeric_p(v_char) || cycl_variables.NIL != el_variable_hyphen_charP(v_char) || cycl_variables.NIL != el_variable_prefix_charP(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 3198L)
    public static SubLObject el_varP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && cycl_variables.NIL != v_object && !v_object.isKeyword() && cycl_variables.NIL != el_var_nameP(el_var_name(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 3470L)
    public static SubLObject dont_care_varP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL != el_varP(v_object) && cycl_variables.NIL != el_var_nameP(Sequences.subseq(el_var_name(v_object), (SubLObject)cycl_variables.ONE_INTEGER, (SubLObject)cycl_variables.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 3695L)
    public static SubLObject el_var_name(final SubLObject el_var) {
        assert cycl_variables.NIL != Types.symbolp(el_var) : el_var;
        return Symbols.symbol_name(el_var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 3865L)
    public static SubLObject el_var_nameP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && cycl_variables.NIL != list_utilities.lengthG(v_object, (SubLObject)cycl_variables.ONE_INTEGER, (SubLObject)cycl_variables.UNPROVIDED) && cycl_variables.NIL != has_el_variable_prefixP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 4000L)
    public static SubLObject make_el_var(final SubLObject v_object) {
        final SubLObject el_var = intern_el_var(v_object);
        return el_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 4098L)
    public static SubLObject make_el_var_name(final SubLObject v_object) {
        if (cycl_variables.NIL != el_var_nameP(v_object)) {
            return Strings.string_upcase(v_object, (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED);
        }
        return Strings.string_upcase(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(el_variable_prefix_string()), format_nil.format_nil_a_no_copy(v_object)), (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 4344L)
    public static SubLObject possibly_make_valid_el_var_name(final SubLObject v_object) {
        if (cycl_variables.NIL != valid_el_var_nameP(v_object)) {
            return v_object;
        }
        final SubLObject validated_name = el_utilities.correct_variable(v_object);
        if (cycl_variables.NIL != validated_name) {
            return validated_name;
        }
        return make_el_var_name(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 4743L)
    public static SubLObject possibly_make_valid_el_var(final SubLObject v_object) {
        return Packages.intern(possibly_make_valid_el_var_name(v_object), control_vars.$cyc_package$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 5003L)
    public static SubLObject invalid_variable_name_char(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL == string_utilities.upper_case_alphanumeric_p(v_object) && cycl_variables.NIL == el_variable_hyphen_charP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 5290L)
    public static SubLObject valid_el_varP(final SubLObject v_object) {
        if (v_object.isSymbol() && !v_object.isKeyword()) {
            return valid_el_var_nameP(el_var_name(v_object));
        }
        return (SubLObject)cycl_variables.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 5584L)
    public static SubLObject valid_el_var_nameP(final SubLObject v_object) {
        if (!v_object.isString() || cycl_variables.NIL != string_utilities.empty_string_p(v_object) || cycl_variables.NIL == has_el_variable_prefixP(v_object)) {
            return (SubLObject)cycl_variables.NIL;
        }
        final SubLObject length = Sequences.length(v_object);
        SubLObject last = Numbers.subtract(length, (SubLObject)cycl_variables.ONE_INTEGER);
        SubLObject subseq_check_start = (SubLObject)cycl_variables.ONE_INTEGER;
        if (!length.numG((SubLObject)cycl_variables.ONE_INTEGER)) {
            return (SubLObject)cycl_variables.NIL;
        }
        if (cycl_variables.NIL != has_dont_care_var_prefixP(v_object)) {
            if (!length.numG((SubLObject)cycl_variables.TWO_INTEGER)) {
                return (SubLObject)cycl_variables.NIL;
            }
            subseq_check_start = (SubLObject)cycl_variables.TWO_INTEGER;
        }
        if (last.numLE(subseq_check_start)) {
            last = Numbers.add(subseq_check_start, (SubLObject)cycl_variables.ONE_INTEGER);
        }
        if (cycl_variables.NIL != valid_el_variable_name_subsequenceP(Sequences.subseq(v_object, subseq_check_start, last))) {
            return string_utilities.upper_case_alphanumeric_p(Strings.sublisp_char(v_object, Numbers.subtract(length, (SubLObject)cycl_variables.ONE_INTEGER)));
        }
        return (SubLObject)cycl_variables.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 6385L)
    public static SubLObject valid_el_variable_name_subsequenceP(final SubLObject v_object) {
        if (cycl_variables.NIL != list_utilities.lengthG(v_object, (SubLObject)cycl_variables.ZERO_INTEGER, (SubLObject)cycl_variables.UNPROVIDED)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL != Characters.upper_case_p(Strings.sublisp_char(v_object, (SubLObject)cycl_variables.ZERO_INTEGER)) && cycl_variables.NIL == Sequences.find_if((SubLObject)cycl_variables.$sym7$INVALID_VARIABLE_NAME_CHAR, Sequences.subseq(v_object, (SubLObject)cycl_variables.ONE_INTEGER, (SubLObject)cycl_variables.UNPROVIDED), (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED) && cycl_variables.NIL == Sequences.search(invalid_hyphen_sequence(), v_object, (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED));
        }
        return (SubLObject)cycl_variables.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 6653L)
    public static SubLObject invalid_hyphen_sequence() {
        return cycl_variables.$el_variable_invalid_hyphen_sequence$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 6744L)
    public static SubLObject gensym_el_var(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_var = (SubLObject)cycl_variables.NIL;
        final SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
        try {
            Packages.$package$.bind(control_vars.$cyc_package$.getGlobalValue(), thread);
            el_var = Symbols.gensym(make_el_var_name(v_object));
        }
        finally {
            Packages.$package$.rebind(_prev_bind_0, thread);
        }
        return el_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 6956L)
    public static SubLObject gentemp_el_var(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el_var = (SubLObject)cycl_variables.NIL;
        final SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
        try {
            Packages.$package$.bind(control_vars.$cyc_package$.getGlobalValue(), thread);
            el_var = Symbols.gentemp(make_el_var_name(v_object));
        }
        finally {
            Packages.$package$.rebind(_prev_bind_0, thread);
        }
        return el_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 7213L)
    public static SubLObject intern_el_var(final SubLObject v_object) {
        return Packages.intern(make_el_var_name(v_object), control_vars.$cyc_package$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 7311L)
    public static SubLObject var_names_in_string(final SubLObject string, SubLObject var_char) {
        if (var_char == cycl_variables.UNPROVIDED) {
            var_char = el_variable_prefix_char();
        }
        SubLObject names = (SubLObject)cycl_variables.NIL;
        SubLObject start = (SubLObject)cycl_variables.NIL;
        SubLObject varP = (SubLObject)cycl_variables.NIL;
        SubLObject eligibleP = (SubLObject)cycl_variables.T;
        final SubLObject length = Sequences.length(string);
        final SubLObject last = Numbers.subtract(length, (SubLObject)cycl_variables.ONE_INTEGER);
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject i;
        SubLObject ch;
        SubLObject item_var;
        for (end_var = (end_var_$1 = Sequences.length(string)), i = (SubLObject)cycl_variables.NIL, i = (SubLObject)cycl_variables.ZERO_INTEGER; !i.numGE(end_var_$1); i = number_utilities.f_1X(i)) {
            ch = Strings.sublisp_char(string, i);
            if (cycl_variables.NIL != eligibleP && cycl_variables.NIL != Characters.charE(ch, var_char)) {
                start = i;
                varP = (SubLObject)cycl_variables.T;
            }
            else if (cycl_variables.NIL != varP && (cycl_variables.NIL != string_utilities.punctuation_p(ch) || cycl_variables.NIL != string_utilities.whitespacep(ch) || i.numE(last))) {
                varP = (SubLObject)cycl_variables.NIL;
                eligibleP = (SubLObject)cycl_variables.T;
                item_var = Sequences.subseq(string, start, i.numE(last) ? Numbers.add((SubLObject)cycl_variables.ONE_INTEGER, i) : i);
                if (cycl_variables.NIL == conses_high.member(item_var, names, Symbols.symbol_function((SubLObject)cycl_variables.$sym8$STRING_), Symbols.symbol_function((SubLObject)cycl_variables.IDENTITY))) {
                    names = (SubLObject)ConsesLow.cons(item_var, names);
                }
            }
            else if (cycl_variables.NIL != string_utilities.punctuation_p(ch) || cycl_variables.NIL != string_utilities.whitespacep(ch)) {
                eligibleP = (SubLObject)cycl_variables.T;
            }
            else {
                eligibleP = (SubLObject)cycl_variables.NIL;
            }
        }
        return names;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 8163L)
    public static SubLObject el_var_name_without_prefix(final SubLObject el_var) {
        return string_without_el_var_name_prefix(el_var_name(el_var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 8354L)
    public static SubLObject string_without_el_var_name_prefix(final SubLObject string) {
        if (!string.isString()) {
            return (SubLObject)cycl_variables.NIL;
        }
        if (cycl_variables.NIL != list_utilities.lengthG(string, (SubLObject)cycl_variables.TWO_INTEGER, (SubLObject)cycl_variables.UNPROVIDED) && Vectors.aref(string, (SubLObject)cycl_variables.ONE_INTEGER).eql(el_variable_prefix_char())) {
            return Sequences.subseq(string, (SubLObject)cycl_variables.TWO_INTEGER, (SubLObject)cycl_variables.UNPROVIDED);
        }
        return Sequences.subseq(string, (SubLObject)cycl_variables.ONE_INTEGER, (SubLObject)cycl_variables.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 8710L)
    public static SubLObject default_el_varP(final SubLObject symbol) {
        if (cycl_variables.NIL != el_varP(symbol) && Sequences.length(Symbols.symbol_name(symbol)).numG((SubLObject)cycl_variables.FOUR_INTEGER)) {
            final SubLObject number = reader.read_from_string_ignoring_errors(Symbols.symbol_name(symbol), (SubLObject)cycl_variables.NIL, (SubLObject)cycl_variables.NIL, (SubLObject)cycl_variables.FOUR_INTEGER, (SubLObject)cycl_variables.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(number.isFixnum() && number.numGE((SubLObject)cycl_variables.ZERO_INTEGER) && number.numLE((SubLObject)cycl_variables.$int9$200) && symbol.eql(variables.default_el_var_for_hl_var(variables.get_variable(number))));
        }
        return (SubLObject)cycl_variables.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 9188L)
    public static SubLObject non_default_el_varP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL != el_varP(v_object) && cycl_variables.NIL == default_el_varP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 9501L)
    public static SubLObject keyword_variable_prefix_char() {
        return cycl_variables.$keyword_variable_prefix_char$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 9686L)
    public static SubLObject permissible_keyword_varP(final SubLObject thing) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread) && thing.isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 9895L)
    public static SubLObject impermissible_varP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((cycl_variables.NIL == wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread) && v_object.isKeyword()) || (cycl_variables.NIL == wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread) && cycl_variables.NIL != at_admitted.generic_arg_p(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10096L)
    public static SubLObject keyword_varP(final SubLObject thing) {
        return Types.keywordp(thing);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10221L)
    public static SubLObject keyword_var_name(final SubLObject keyword_var) {
        assert cycl_variables.NIL != Types.symbolp(keyword_var) : keyword_var;
        return Symbols.symbol_name(keyword_var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10416L)
    public static SubLObject keyword_var_nameP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && Sequences.length(v_object).numG((SubLObject)cycl_variables.ONE_INTEGER) && cycl_variables.NIL != Characters.charE(Strings.sublisp_char(v_object, (SubLObject)cycl_variables.ZERO_INTEGER), keyword_variable_prefix_char()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10581L)
    public static SubLObject make_keyword_var(final SubLObject string) {
        return Symbols.make_keyword(Strings.string_upcase(string, (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10670L)
    public static SubLObject make_keyword_var_name(final SubLObject v_object) {
        if (cycl_variables.NIL != keyword_var_nameP(v_object)) {
            return Strings.string_upcase(v_object, (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED);
        }
        return Strings.string_upcase(PrintLow.format((SubLObject)cycl_variables.NIL, (SubLObject)cycl_variables.$str10$_C_A, keyword_variable_prefix_char(), v_object), (SubLObject)cycl_variables.UNPROVIDED, (SubLObject)cycl_variables.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10876L)
    public static SubLObject el_variable_or_keyword_p(final SubLObject symbol) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL != collection_defns.el_variableP(symbol) || symbol.isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 11089L)
    public static SubLObject variable_name(final SubLObject var) {
        if (cycl_variables.NIL != variables.variable_p(var)) {
            return variable_name(variables.default_el_var_for_hl_var(var));
        }
        if (cycl_variables.NIL != el_varP(var)) {
            return el_var_name(var);
        }
        if (cycl_variables.NIL != keyword_varP(var)) {
            return keyword_var_name(var);
        }
        return string_utilities.object_to_string(var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 11524L)
    public static SubLObject variable_name_without_prefix(final SubLObject var) {
        if (cycl_variables.NIL != variables.variable_p(var)) {
            return variable_name_without_prefix(variables.default_el_var_for_hl_var(var));
        }
        if (cycl_variables.NIL != el_varP(var)) {
            return el_var_name_without_prefix(var);
        }
        return string_without_el_var_name_prefix(string_utilities.object_to_string(var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 11911L)
    public static SubLObject variable_symbolP(final SubLObject symbol) {
        return el_varP(symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 12108L)
    public static SubLObject el_var_or_generic_argP(final SubLObject candidate_variable) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL != el_varP(candidate_variable) || cycl_variables.NIL != at_admitted.generic_arg_p(candidate_variable));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 12252L)
    public static SubLObject cyc_varP(final SubLObject thing) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL != el_varP(thing) || cycl_variables.NIL != kb_varP(thing) || cycl_variables.NIL != canon_tl.tl_varP(thing) || cycl_variables.NIL != permissible_keyword_varP(thing) || cycl_variables.NIL != generic_arg_varP(thing));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 12625L)
    public static SubLObject generic_arg_varP(final SubLObject thing) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl_variables.NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread) && cycl_variables.NIL != at_admitted.generic_arg_p(thing));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 12802L)
    public static SubLObject variable_predicate_fn(final SubLObject var) {
        if (cycl_variables.NIL != hl_varP(var)) {
            return (SubLObject)cycl_variables.$sym13$HL_VAR_;
        }
        if (cycl_variables.NIL != el_varP(var)) {
            return (SubLObject)cycl_variables.$sym2$EL_VAR_;
        }
        if (cycl_variables.NIL != canon_tl.tl_varP(var)) {
            return (SubLObject)cycl_variables.$sym14$TL_VAR_;
        }
        if (cycl_variables.NIL != permissible_keyword_varP(var)) {
            return (SubLObject)cycl_variables.$sym15$KEYWORD_VAR_;
        }
        if (cycl_variables.NIL != generic_arg_varP(var)) {
            return (SubLObject)cycl_variables.$sym16$GENERIC_ARG_VAR_;
        }
        return (SubLObject)cycl_variables.$sym17$FALSE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 13148L)
    public static SubLObject kb_varP(final SubLObject symbol) {
        return kb_variableP(symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 13212L)
    public static SubLObject kb_variableP(final SubLObject symbol) {
        return variables.variable_p(symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 13279L)
    public static SubLObject hl_varP(final SubLObject thing) {
        return variables.variable_p(thing);
    }
    
    public static SubLObject declare_cycl_variables_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_variable_prefix_char", "EL-VARIABLE-PREFIX-CHAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_variable_prefix_string", "EL-VARIABLE-PREFIX-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_variable_hyphen_char", "EL-VARIABLE-HYPHEN-CHAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_variable_prefix_charP", "EL-VARIABLE-PREFIX-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "has_el_variable_prefixP", "HAS-EL-VARIABLE-PREFIX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "has_dont_care_var_prefixP", "HAS-DONT-CARE-VAR-PREFIX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_variable_hyphen_charP", "EL-VARIABLE-HYPHEN-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_variable_charP", "EL-VARIABLE-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_varP", "EL-VAR?", 1, 0, false);
        new $el_varP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "dont_care_varP", "DONT-CARE-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_var_name", "EL-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_var_nameP", "EL-VAR-NAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "make_el_var", "MAKE-EL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "make_el_var_name", "MAKE-EL-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "possibly_make_valid_el_var_name", "POSSIBLY-MAKE-VALID-EL-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "possibly_make_valid_el_var", "POSSIBLY-MAKE-VALID-EL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "invalid_variable_name_char", "INVALID-VARIABLE-NAME-CHAR", 1, 0, false);
        new $invalid_variable_name_char$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "valid_el_varP", "VALID-EL-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "valid_el_var_nameP", "VALID-EL-VAR-NAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "valid_el_variable_name_subsequenceP", "VALID-EL-VARIABLE-NAME-SUBSEQUENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "invalid_hyphen_sequence", "INVALID-HYPHEN-SEQUENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "gensym_el_var", "GENSYM-EL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "gentemp_el_var", "GENTEMP-EL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "intern_el_var", "INTERN-EL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "var_names_in_string", "VAR-NAMES-IN-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_var_name_without_prefix", "EL-VAR-NAME-WITHOUT-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "string_without_el_var_name_prefix", "STRING-WITHOUT-EL-VAR-NAME-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "default_el_varP", "DEFAULT-EL-VAR?", 1, 0, false);
        new $default_el_varP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "non_default_el_varP", "NON-DEFAULT-EL-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "keyword_variable_prefix_char", "KEYWORD-VARIABLE-PREFIX-CHAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "permissible_keyword_varP", "PERMISSIBLE-KEYWORD-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "impermissible_varP", "IMPERMISSIBLE-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "keyword_varP", "KEYWORD-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "keyword_var_name", "KEYWORD-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "keyword_var_nameP", "KEYWORD-VAR-NAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "make_keyword_var", "MAKE-KEYWORD-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "make_keyword_var_name", "MAKE-KEYWORD-VAR-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_variable_or_keyword_p", "EL-VARIABLE-OR-KEYWORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "variable_name", "VARIABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "variable_name_without_prefix", "VARIABLE-NAME-WITHOUT-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "variable_symbolP", "VARIABLE-SYMBOL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "el_var_or_generic_argP", "EL-VAR-OR-GENERIC-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "cyc_varP", "CYC-VAR?", 1, 0, false);
        new $cyc_varP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "generic_arg_varP", "GENERIC-ARG-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "variable_predicate_fn", "VARIABLE-PREDICATE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "kb_varP", "KB-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "kb_variableP", "KB-VARIABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_variables", "hl_varP", "HL-VAR?", 1, 0, false);
        new $hl_varP$UnaryFunction();
        return (SubLObject)cycl_variables.NIL;
    }
    
    public static SubLObject init_cycl_variables_file() {
        cycl_variables.$el_variable_prefix_char$ = SubLFiles.defconstant("*EL-VARIABLE-PREFIX-CHAR*", (SubLObject)Characters.CHAR_question);
        cycl_variables.$el_variable_prefix_string$ = SubLFiles.defconstant("*EL-VARIABLE-PREFIX-STRING*", (SubLObject)cycl_variables.$str0$_);
        cycl_variables.$el_variable_hyphen_char$ = SubLFiles.defconstant("*EL-VARIABLE-HYPHEN-CHAR*", (SubLObject)Characters.CHAR_hyphen);
        cycl_variables.$el_variable_invalid_hyphen_sequence$ = SubLFiles.defconstant("*EL-VARIABLE-INVALID-HYPHEN-SEQUENCE*", Strings.make_string((SubLObject)cycl_variables.TWO_INTEGER, cycl_variables.$el_variable_hyphen_char$.getGlobalValue()));
        cycl_variables.$valid_el_var_regular_expression$ = SubLFiles.defconstant("*VALID-EL-VAR-REGULAR-EXPRESSION*", (SubLObject)cycl_variables.$str1$______________A_Z____A_Z___0_9___);
        cycl_variables.$keyword_variable_prefix_char$ = SubLFiles.defconstant("*KEYWORD-VARIABLE-PREFIX-CHAR*", (SubLObject)Characters.CHAR_colon);
        return (SubLObject)cycl_variables.NIL;
    }
    
    public static SubLObject setup_cycl_variables_file() {
        utilities_macros.register_cyc_api_function((SubLObject)cycl_variables.$sym2$EL_VAR_, (SubLObject)cycl_variables.$list3, (SubLObject)cycl_variables.$str4$Return_T_iff_OBJECT_is_a_symbol_w, (SubLObject)cycl_variables.NIL, (SubLObject)cycl_variables.$list5);
        access_macros.define_obsolete_register((SubLObject)cycl_variables.$sym11$VARIABLE_SYMBOL_, (SubLObject)cycl_variables.$list12);
        generic_testing.define_test_case_table_int((SubLObject)cycl_variables.$sym18$VALID_EL_VAR_NAME_, (SubLObject)ConsesLow.list(new SubLObject[] { cycl_variables.$kw19$TEST, cycl_variables.NIL, cycl_variables.$kw20$OWNER, cycl_variables.NIL, cycl_variables.$kw21$CLASSES, cycl_variables.NIL, cycl_variables.$kw22$KB, cycl_variables.$kw23$TINY, cycl_variables.$kw24$WORKING_, cycl_variables.T }), (SubLObject)cycl_variables.$list25);
        return (SubLObject)cycl_variables.NIL;
    }
    
    public void declareFunctions() {
        declare_cycl_variables_file();
    }
    
    public void initializeVariables() {
        init_cycl_variables_file();
    }
    
    public void runTopLevelForms() {
        setup_cycl_variables_file();
    }
    
    static {
        me = (SubLFile)new cycl_variables();
        cycl_variables.$el_variable_prefix_char$ = null;
        cycl_variables.$el_variable_prefix_string$ = null;
        cycl_variables.$el_variable_hyphen_char$ = null;
        cycl_variables.$el_variable_invalid_hyphen_sequence$ = null;
        cycl_variables.$valid_el_var_regular_expression$ = null;
        cycl_variables.$keyword_variable_prefix_char$ = null;
        $str0$_ = SubLObjectFactory.makeString("?");
        $str1$______________A_Z____A_Z___0_9___ = SubLObjectFactory.makeString("([?]|[?][?]) [A-Z] ([A-Z]|[0-9])* ([-] ([A-Z]|[0-9])+)*");
        $sym2$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str4$Return_T_iff_OBJECT_is_a_symbol_w = SubLObjectFactory.makeString("Return T iff OBJECT is a symbol which can be interpreted as an EL variable.");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym6$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym7$INVALID_VARIABLE_NAME_CHAR = SubLObjectFactory.makeSymbol("INVALID-VARIABLE-NAME-CHAR");
        $sym8$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $int9$200 = SubLObjectFactory.makeInteger(200);
        $str10$_C_A = SubLObjectFactory.makeString("~C~A");
        $sym11$VARIABLE_SYMBOL_ = SubLObjectFactory.makeSymbol("VARIABLE-SYMBOL?");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?"));
        $sym13$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $sym14$TL_VAR_ = SubLObjectFactory.makeSymbol("TL-VAR?");
        $sym15$KEYWORD_VAR_ = SubLObjectFactory.makeSymbol("KEYWORD-VAR?");
        $sym16$GENERIC_ARG_VAR_ = SubLObjectFactory.makeSymbol("GENERIC-ARG-VAR?");
        $sym17$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $sym18$VALID_EL_VAR_NAME_ = SubLObjectFactory.makeSymbol("VALID-EL-VAR-NAME?");
        $kw19$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw20$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw21$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw22$KB = SubLObjectFactory.makeKeyword("KB");
        $kw23$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw24$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list25 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("FOO")), (SubLObject)cycl_variables.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("?FOO")), (SubLObject)cycl_variables.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("??FOO")), (SubLObject)cycl_variables.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("???FOO")), (SubLObject)cycl_variables.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("?X")), (SubLObject)cycl_variables.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("?x")), (SubLObject)cycl_variables.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("??X")), (SubLObject)cycl_variables.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("??x")), (SubLObject)cycl_variables.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("?1")), (SubLObject)cycl_variables.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)cycl_variables.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("?")), (SubLObject)cycl_variables.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("??")), (SubLObject)cycl_variables.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("???")), (SubLObject)cycl_variables.NIL) });
    }
    
    public static final class $el_varP$UnaryFunction extends UnaryFunction
    {
        public $el_varP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EL-VAR?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_variables.el_varP(arg1);
        }
    }
    
    public static final class $invalid_variable_name_char$UnaryFunction extends UnaryFunction
    {
        public $invalid_variable_name_char$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INVALID-VARIABLE-NAME-CHAR"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_variables.invalid_variable_name_char(arg1);
        }
    }
    
    public static final class $default_el_varP$UnaryFunction extends UnaryFunction
    {
        public $default_el_varP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DEFAULT-EL-VAR?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_variables.default_el_varP(arg1);
        }
    }
    
    public static final class $cyc_varP$UnaryFunction extends UnaryFunction
    {
        public $cyc_varP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-VAR?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_variables.cyc_varP(arg1);
        }
    }
    
    public static final class $hl_varP$UnaryFunction extends UnaryFunction
    {
        public $hl_varP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-VAR?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_variables.hl_varP(arg1);
        }
    }
}

/*

	Total time: 206 ms
	
*/