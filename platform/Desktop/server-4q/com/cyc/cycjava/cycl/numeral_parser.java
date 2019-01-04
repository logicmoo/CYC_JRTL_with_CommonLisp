// 
////
// 

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class numeral_parser extends SubLTranslatedFile
{
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 2896L)
    public static SubLObject standardize_number_string(final SubLObject string, SubLObject number_type) {
        if (number_type == numeral_parser.UNPROVIDED) {
            number_type = (SubLObject)numeral_parser.$kw13$AMERICAN;
        }
        return string_utilities.remove_substring(string, (SubLObject)numeral_parser.$str14$_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 3794L)
    public static SubLObject initialize_number_values() {
        final SubLObject number_values = Hashtables.make_hash_table((SubLObject)numeral_parser.$int15$100, Symbols.symbol_function((SubLObject)numeral_parser.EQUALP), (SubLObject)numeral_parser.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject tables = cdolist_list_var = (SubLObject)ConsesLow.list(new SubLObject[] { numeral_parser.$null$.getGlobalValue(), numeral_parser.$a$.getGlobalValue(), numeral_parser.$digits$.getGlobalValue(), numeral_parser.$teens$.getGlobalValue(), numeral_parser.$fuzzies$.getGlobalValue(), numeral_parser.$atomic_tens$.getGlobalValue(), numeral_parser.$onedozen$.getGlobalValue(), numeral_parser.$onehundred$.getGlobalValue(), numeral_parser.$onethousand$.getGlobalValue(), numeral_parser.$onemillion$.getGlobalValue(), numeral_parser.$onebillion$.getGlobalValue(), numeral_parser.$onetrillion$.getGlobalValue(), numeral_parser.$irregular_denominators$.getGlobalValue() });
        SubLObject table = (SubLObject)numeral_parser.NIL;
        table = cdolist_list_var.first();
        while (numeral_parser.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = table;
            SubLObject entry = (SubLObject)numeral_parser.NIL;
            entry = cdolist_list_var_$1.first();
            while (numeral_parser.NIL != cdolist_list_var_$1) {
                Hashtables.sethash(entry.first(), number_values, entry.rest());
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                entry = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        return number_values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 4596L)
    public static SubLObject number_value(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (numeral_parser.NIL != string_utilities.empty_string_p(string)) {
            return (SubLObject)numeral_parser.NIL;
        }
        final SubLObject v_object = reader.read_from_string_ignoring_errors(string, (SubLObject)numeral_parser.NIL, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        if (v_object.isNumber()) {
            return v_object;
        }
        final SubLObject lookup_string = (numeral_parser.NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread)) ? string : Strings.string_downcase(string, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        return Hashtables.gethash(lookup_string, numeral_parser.$number_values$.getDynamicValue(thread), Hashtables.gethash(string_utilities.strip_trailer(lookup_string, (SubLObject)numeral_parser.$str16$s), numeral_parser.$number_values$.getDynamicValue(thread), Hashtables.gethash(string_utilities.strip_trailer(lookup_string, (SubLObject)numeral_parser.$str17$th), numeral_parser.$number_values$.getDynamicValue(thread), Hashtables.gethash(string_utilities.strip_trailer(lookup_string, (SubLObject)numeral_parser.$str18$ths), numeral_parser.$number_values$.getDynamicValue(thread), (SubLObject)numeral_parser.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 5233L)
    public static SubLObject number_string_signP(final SubLObject word) {
        return number_utilities.number_string_p(document.sign_string(word));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 5323L)
    public static SubLObject hyphenated_number_value(final SubLObject string) {
        final SubLObject components = string_utilities.split_string(string, (SubLObject)numeral_parser.$list19);
        return combine_number_values(number_value(components.first()), (SubLObject)numeral_parser.$kw20$PLUS, number_value(conses_high.second(components)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 5679L)
    public static SubLObject combine_number_values(final SubLObject val1, final SubLObject type, final SubLObject val2) {
        assert numeral_parser.NIL != Types.keywordp(type) : type;
        final SubLObject raw_value = (val1.isNumber() && val2.isNumber()) ? combine_non_cycl_number_values(val1, type, val2) : combine_cycl_number_values(val1, type, val2);
        return (type == numeral_parser.$kw22$TIMES && numeral_parser.NIL != number_utilities.extended_potentially_infinite_number_p(raw_value)) ? number_utilities.significant_digits(raw_value, numeral_parser_max_significant_digits(val1, val2)) : raw_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 6273L)
    public static SubLObject numeral_parser_max_significant_digits(final SubLObject val1, final SubLObject val2) {
        final SubLObject sd1 = numeral_parser_significant_digits(val1);
        final SubLObject sd2 = numeral_parser_significant_digits(val2);
        return Numbers.max(sd1, sd2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 6472L)
    public static SubLObject numeral_parser_significant_digits(final SubLObject val) {
        final SubLObject string = Sequences.remove((SubLObject)Characters.CHAR_period, print_high.prin1_to_string(val), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        final SubLObject suffix_start = list_utilities.position_if_not((SubLObject)numeral_parser.$sym23$DIGIT_CHAR_P, string, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        return (numeral_parser.NIL != suffix_start) ? suffix_start : Sequences.length(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 6763L)
    public static SubLObject combine_cycl_number_values(final SubLObject val1, final SubLObject type, final SubLObject val2) {
        SubLObject raw_value = (SubLObject)numeral_parser.NIL;
        if (type.eql((SubLObject)numeral_parser.$kw20$PLUS)) {
            raw_value = (SubLObject)ConsesLow.list(numeral_parser.$const24$PlusFn, val1, val2);
        }
        else if (type.eql((SubLObject)numeral_parser.$kw22$TIMES)) {
            raw_value = (SubLObject)ConsesLow.list(numeral_parser.$const25$TimesFn, val1, val2);
        }
        else if (type.eql((SubLObject)numeral_parser.$kw26$DIVIDEDBY)) {
            raw_value = (SubLObject)ConsesLow.list(numeral_parser.$const27$QuotientFn, val1, val2);
        }
        else if (type.eql((SubLObject)numeral_parser.$kw28$TOTHE)) {
            raw_value = (SubLObject)ConsesLow.list(numeral_parser.$const29$ExponentFn, val1, val2);
        }
        return simplifier.simplify_number_expression(raw_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 7301L)
    public static SubLObject combine_non_cycl_number_values(final SubLObject val1, final SubLObject type, final SubLObject val2) {
        if (type.eql((SubLObject)numeral_parser.$kw20$PLUS)) {
            return Numbers.add(val1, val2);
        }
        if (type.eql((SubLObject)numeral_parser.$kw22$TIMES)) {
            return Numbers.multiply(val1, val2);
        }
        if (type.eql((SubLObject)numeral_parser.$kw26$DIVIDEDBY)) {
            return Numbers.divide(val1, val2);
        }
        if (type.eql((SubLObject)numeral_parser.$kw28$TOTHE)) {
            return Numbers.expt(val1, val2);
        }
        return (SubLObject)numeral_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 7624L)
    public static SubLObject numeral_parser_stringE(final SubLObject string1, final SubLObject string2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (numeral_parser.NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread)) ? cycl_string.cycl_stringE(string1, string2) : cycl_string.cycl_string_equal(string1, string2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 7871L)
    public static SubLObject numeral_parser_charE(final SubLObject char1, final SubLObject char2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (numeral_parser.NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue(thread)) ? Characters.charE(char1, char2) : Characters.char_equal(char1, char2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8026L)
    public static SubLObject zero_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str30$zero));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8151L)
    public static SubLObject indefinite_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw31$INDEFINITE, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8270L)
    public static SubLObject atomic_ten_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.assoc(document.sign_string(v_object), numeral_parser.$atomic_tens$.getGlobalValue(), Symbols.symbol_function((SubLObject)numeral_parser.$sym32$NUMERAL_PARSER_STRING_), (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8413L)
    public static SubLObject digit_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.assoc(document.sign_string(v_object), numeral_parser.$digits$.getGlobalValue(), Symbols.symbol_function((SubLObject)numeral_parser.$sym32$NUMERAL_PARSER_STRING_), (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8806L)
    public static SubLObject deci_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.assoc(document.sign_string(v_object), numeral_parser.$digits$.getGlobalValue(), Symbols.symbol_function((SubLObject)numeral_parser.$sym32$NUMERAL_PARSER_STRING_), (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8938L)
    public static SubLObject hyphen_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && document.sign_string(v_object).equal((SubLObject)numeral_parser.$str33$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9042L)
    public static SubLObject teen_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.assoc(document.sign_string(v_object), numeral_parser.$teens$.getGlobalValue(), Symbols.symbol_function((SubLObject)numeral_parser.$sym32$NUMERAL_PARSER_STRING_), (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9173L)
    public static SubLObject fuzzy_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && (numeral_parser.NIL != conses_high.assoc(document.sign_string(v_object), numeral_parser.$fuzzies$.getGlobalValue(), Symbols.symbol_function((SubLObject)numeral_parser.$sym32$NUMERAL_PARSER_STRING_), (SubLObject)numeral_parser.UNPROVIDED) || numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw34$FUZZY, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9391L)
    public static SubLObject non_atomic_ten_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw35$NON_ATOMIC_TEN, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9518L)
    public static SubLObject hyphenated_non_atomic_ten_signP(final SubLObject v_object) {
        if (numeral_parser.NIL != document.sign_p(v_object)) {
            final SubLObject components = string_utilities.split_string(document.sign_string(v_object), (SubLObject)numeral_parser.$list19);
            return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(components).numE((SubLObject)numeral_parser.TWO_INTEGER) && numeral_parser.NIL != conses_high.assoc(components.first(), numeral_parser.$atomic_tens$.getGlobalValue(), Symbols.symbol_function((SubLObject)numeral_parser.$sym32$NUMERAL_PARSER_STRING_), (SubLObject)numeral_parser.UNPROVIDED) && numeral_parser.NIL != conses_high.assoc(conses_high.second(components), numeral_parser.$digits$.getGlobalValue(), Symbols.symbol_function((SubLObject)numeral_parser.$sym32$NUMERAL_PARSER_STRING_), (SubLObject)numeral_parser.UNPROVIDED));
        }
        return (SubLObject)numeral_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9870L)
    public static SubLObject cent_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw36$CENT, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9977L)
    public static SubLObject kilo_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw37$KILO, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10084L)
    public static SubLObject fraction_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw38$FRACTION, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10199L)
    public static SubLObject float_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw39$FLOAT, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10308L)
    public static SubLObject number_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw40$NUMBER, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10421L)
    public static SubLObject interval_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw41$INTERVAL, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10538L)
    public static SubLObject proper_interval_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw42$PROPER_INTERVAL, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10669L)
    public static SubLObject milli_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw43$MILLI, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10778L)
    public static SubLObject billi_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw44$BILLI, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10887L)
    public static SubLObject trilli_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw45$TRILLI, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10998L)
    public static SubLObject integer_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw46$INTEGER, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11111L)
    public static SubLObject extended_dozen_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw47$EXTENDED_DOZEN, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11256L)
    public static SubLObject standard_dozen_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw48$STANDARD_DOZEN, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11401L)
    public static SubLObject extended_hundred_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw49$EXTENDED_HUNDRED, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11532L)
    public static SubLObject standard_hundred_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw50$STANDARD_HUNDRED, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11663L)
    public static SubLObject thousand_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw51$THOUSAND, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11778L)
    public static SubLObject million_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw52$MILLION, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11891L)
    public static SubLObject billion_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw53$BILLION, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12004L)
    public static SubLObject trillion_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw54$TRILLION, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12119L)
    public static SubLObject and_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str55$and));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12242L)
    public static SubLObject indefinite_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.assoc(document.sign_string(v_object), numeral_parser.$a$.getGlobalValue(), Symbols.symbol_function((SubLObject)numeral_parser.$sym32$NUMERAL_PARSER_STRING_), (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12378L)
    public static SubLObject dozen_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str56$dozen));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12523L)
    public static SubLObject few_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str57$few));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12664L)
    public static SubLObject hundred_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str58$hundred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12795L)
    public static SubLObject thousand_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str59$thousand));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12928L)
    public static SubLObject million_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str60$million));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13059L)
    public static SubLObject millions_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str61$millions));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13192L)
    public static SubLObject billions_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str62$billions));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13325L)
    public static SubLObject billion_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str63$billion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13456L)
    public static SubLObject trillions_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str64$trillions));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13591L)
    public static SubLObject trillion_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str65$trillion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13724L)
    public static SubLObject first_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str66$first));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13851L)
    public static SubLObject second_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str67$second));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13980L)
    public static SubLObject seconds_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str68$seconds));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 14111L)
    public static SubLObject atomic_denominator_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL == first_literalP(v_object) && numeral_parser.NIL == second_literalP(v_object) && numeral_parser.NIL == seconds_literalP(v_object) && (numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str69$halves) || numeral_parser.NIL != conses_high.assoc(string_utilities.post_remove(document.sign_string(v_object), (SubLObject)numeral_parser.$str16$s, (SubLObject)numeral_parser.$sym70$NUMERAL_PARSER_CHAR_), numeral_parser.$irregular_denominators$.getGlobalValue(), Symbols.symbol_function((SubLObject)numeral_parser.$sym32$NUMERAL_PARSER_STRING_), (SubLObject)numeral_parser.UNPROVIDED) || numeral_parser.NIL != string_utilities.ends_with(document.sign_string(v_object), (SubLObject)numeral_parser.$str17$th, (SubLObject)numeral_parser.UNPROVIDED) || numeral_parser.NIL != string_utilities.ends_with(document.sign_string(v_object), (SubLObject)numeral_parser.$str18$ths, (SubLObject)numeral_parser.UNPROVIDED)) && numeral_parser.NIL != number_value(document.sign_string(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 14639L)
    public static SubLObject denominator_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && (numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str69$halves) || numeral_parser.NIL != conses_high.assoc(string_utilities.post_remove(document.sign_string(v_object), (SubLObject)numeral_parser.$str16$s, (SubLObject)numeral_parser.$sym70$NUMERAL_PARSER_CHAR_), numeral_parser.$irregular_denominators$.getGlobalValue(), Symbols.symbol_function((SubLObject)numeral_parser.$sym32$NUMERAL_PARSER_STRING_), (SubLObject)numeral_parser.UNPROVIDED) || numeral_parser.NIL != string_utilities.ends_with(document.sign_string(v_object), (SubLObject)numeral_parser.$str17$th, (SubLObject)numeral_parser.UNPROVIDED) || numeral_parser.NIL != string_utilities.ends_with(document.sign_string(v_object), (SubLObject)numeral_parser.$str18$ths, (SubLObject)numeral_parser.UNPROVIDED)) && numeral_parser.NIL != number_value(document.sign_string(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15046L)
    public static SubLObject denominator_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw71$DENOMINATOR, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15167L)
    public static SubLObject half_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str72$half));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15295L)
    public static SubLObject minus_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && (numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str73$minus) || numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str74$negative) || numeral_parser.NIL != minus_signP(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15526L)
    public static SubLObject to_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && (numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str75$to) || numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str33$_)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15713L)
    public static SubLObject from_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str76$from));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15838L)
    public static SubLObject between_literalP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != numeral_parser_stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str77$between));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15969L)
    public static SubLObject mult_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw78$MULT, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 16076L)
    public static SubLObject expt_operator_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw79$EXPT, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 16192L)
    public static SubLObject exponentiation_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != conses_high.member((SubLObject)numeral_parser.$kw80$EXPONENTIATION, document.sign_category(v_object), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 16319L)
    public static SubLObject minus_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != Strings.stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str33$_, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 16426L)
    public static SubLObject plus_signP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(numeral_parser.NIL != document.sign_p(v_object) && numeral_parser.NIL != Strings.stringE(document.sign_string(v_object), (SubLObject)numeral_parser.$str81$_, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 16530L)
    public static SubLObject build_denominator(final SubLObject fst) {
        final SubLObject output = finite_state_transducer.fst_output(fst);
        if (numeral_parser.NIL == output) {
            Errors.error((SubLObject)numeral_parser.$str82$Can_t_build_a_denominator_out_of_);
            return (SubLObject)numeral_parser.NIL;
        }
        if (numeral_parser.NIL != list_utilities.singletonP(output)) {
            final SubLObject word = output.first();
            document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw71$DENOMINATOR, document.word_category(word), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw84$INFO, number_value(document.word_string(word))));
            return word;
        }
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        SubLObject numeric_value = (SubLObject)numeral_parser.ZERO_INTEGER;
        SubLObject cdolist_list_var = output;
        SubLObject dtr = (SubLObject)numeral_parser.NIL;
        dtr = cdolist_list_var.first();
        while (numeral_parser.NIL != cdolist_list_var) {
            final SubLObject dtr_info = document.sign_info(dtr);
            numeric_value = combine_number_values(numeric_value, (SubLObject)numeral_parser.$kw20$PLUS, (numeral_parser.NIL != dtr_info) ? dtr_info : number_value(document.sign_string(dtr)));
            cdolist_list_var = cdolist_list_var.rest();
            dtr = cdolist_list_var.first();
        }
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw71$DENOMINATOR, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, numeric_value));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 18279L)
    public static SubLObject build_zero(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw96$ZERO, document.word_category(word), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw84$INFO, number_value(document.word_string(word))));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 18631L)
    public static SubLObject build_indefinite(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw31$INDEFINITE, document.word_category(word), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw84$INFO, number_value(document.word_string(word))));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 19013L)
    public static SubLObject build_deci(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw101$DECI, document.word_category(word), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw84$INFO, number_value(document.word_string(word))));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 19407L)
    public static SubLObject build_teen(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw105$TEEN, document.word_category(word), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw84$INFO, number_value(document.word_string(word))));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 19755L)
    public static SubLObject build_fuzzy(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw34$FUZZY, document.word_category(word), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw84$INFO, number_value(document.word_string(word))));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 20144L)
    public static SubLObject build_atomic_ten(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw110$ATOMIC_TEN, document.word_category(word), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw84$INFO, number_value(document.word_string(word))));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 20522L)
    public static SubLObject build_hyphenated_non_atomic_ten(final SubLObject fst) {
        final SubLObject word = finite_state_transducer.fst_output(fst).first();
        document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw35$NON_ATOMIC_TEN, document.word_category(word), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw84$INFO, hyphenated_number_value(document.word_string(word))));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 20976L)
    public static SubLObject build_non_atomic_ten(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        final SubLObject normalized_output = Sequences.remove_if(Symbols.symbol_function((SubLObject)numeral_parser.$sym114$HYPHEN_SIGN_), finite_state_transducer.fst_output(fst), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw35$NON_ATOMIC_TEN), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(document.sign_info(normalized_output.first()), (SubLObject)numeral_parser.$kw20$PLUS, document.sign_info(conses_high.second(normalized_output)))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 21736L)
    public static SubLObject build_cent(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw36$CENT, document.sign_category(sign), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)));
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 22237L)
    public static SubLObject build_standard_hundred(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        final SubLObject normalized_output = Sequences.remove_if(Symbols.symbol_function((SubLObject)numeral_parser.$sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw50$STANDARD_HUNDRED, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), (SubLObject)numeral_parser.$kw22$TIMES, (SubLObject)numeral_parser.$int15$100), (SubLObject)numeral_parser.$kw20$PLUS, (SubLObject)((numeral_parser.NIL != document.sign_p(conses_high.third(normalized_output))) ? document.sign_info(conses_high.third(normalized_output)) : numeral_parser.ZERO_INTEGER))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 23385L)
    public static SubLObject build_a_few(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw34$FUZZY, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, numeral_parser.$const131$AFew_Quant));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 23907L)
    public static SubLObject build_extended_hundred(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        final SubLObject normalized_output = Sequences.remove_if(Symbols.symbol_function((SubLObject)numeral_parser.$sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw49$EXTENDED_HUNDRED, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), (SubLObject)numeral_parser.$kw22$TIMES, (SubLObject)numeral_parser.$int15$100), (SubLObject)numeral_parser.$kw20$PLUS, (SubLObject)((numeral_parser.NIL != document.sign_p(conses_high.third(normalized_output))) ? document.sign_info(conses_high.third(normalized_output)) : numeral_parser.ZERO_INTEGER))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 25056L)
    public static SubLObject build_standard_dozen(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        final SubLObject normalized_output = Sequences.remove_if(Symbols.symbol_function((SubLObject)numeral_parser.$sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw48$STANDARD_DOZEN, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), (SubLObject)numeral_parser.$kw22$TIMES, (SubLObject)numeral_parser.TWELVE_INTEGER), (SubLObject)numeral_parser.$kw20$PLUS, (SubLObject)((numeral_parser.NIL != document.sign_p(conses_high.third(normalized_output))) ? document.sign_info(conses_high.third(normalized_output)) : numeral_parser.ZERO_INTEGER))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 25938L)
    public static SubLObject build_extended_dozen(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        final SubLObject normalized_output = Sequences.remove_if(Symbols.symbol_function((SubLObject)numeral_parser.$sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw47$EXTENDED_DOZEN, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), (SubLObject)numeral_parser.$kw22$TIMES, (SubLObject)numeral_parser.TWELVE_INTEGER), (SubLObject)numeral_parser.$kw20$PLUS, (SubLObject)((numeral_parser.NIL != document.sign_p(conses_high.third(normalized_output))) ? document.sign_info(conses_high.third(normalized_output)) : numeral_parser.ZERO_INTEGER))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 26825L)
    public static SubLObject build_kilo(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw37$KILO, document.sign_category(sign), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)));
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 27300L)
    public static SubLObject build_thousand(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        final SubLObject normalized_output = Sequences.remove_if(Symbols.symbol_function((SubLObject)numeral_parser.$sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw51$THOUSAND, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), (SubLObject)numeral_parser.$kw22$TIMES, (SubLObject)numeral_parser.$int143$1000), (SubLObject)numeral_parser.$kw20$PLUS, (SubLObject)((numeral_parser.NIL != document.sign_p(conses_high.third(normalized_output))) ? document.sign_info(conses_high.third(normalized_output)) : numeral_parser.ZERO_INTEGER))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 28417L)
    public static SubLObject build_milli(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw43$MILLI, document.sign_category(sign), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)));
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 28805L)
    public static SubLObject build_million(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        final SubLObject normalized_output = Sequences.remove_if(Symbols.symbol_function((SubLObject)numeral_parser.$sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw52$MILLION, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), (SubLObject)numeral_parser.$kw22$TIMES, (SubLObject)numeral_parser.$int149$1000000), (SubLObject)numeral_parser.$kw20$PLUS, (SubLObject)((numeral_parser.NIL != document.sign_p(conses_high.third(normalized_output))) ? document.sign_info(conses_high.third(normalized_output)) : numeral_parser.ZERO_INTEGER))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 29927L)
    public static SubLObject build_billi(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw44$BILLI, document.sign_category(sign), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)));
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 30315L)
    public static SubLObject build_billion(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        final SubLObject normalized_output = Sequences.remove_if(Symbols.symbol_function((SubLObject)numeral_parser.$sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw53$BILLION, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), (SubLObject)numeral_parser.$kw22$TIMES, (SubLObject)numeral_parser.$int155$1000000000), (SubLObject)numeral_parser.$kw20$PLUS, (SubLObject)((numeral_parser.NIL != document.sign_p(conses_high.third(normalized_output))) ? document.sign_info(conses_high.third(normalized_output)) : numeral_parser.ZERO_INTEGER))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 31440L)
    public static SubLObject build_trilli(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw45$TRILLI, document.sign_category(sign), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)));
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 31832L)
    public static SubLObject build_trillion(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        final SubLObject normalized_output = Sequences.remove_if(Symbols.symbol_function((SubLObject)numeral_parser.$sym121$AND_LITERAL_), finite_state_transducer.fst_output(fst), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw54$TRILLION, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(combine_number_values(document.sign_info(normalized_output.first()), (SubLObject)numeral_parser.$kw22$TIMES, (SubLObject)numeral_parser.$int161$1000000000000), (SubLObject)numeral_parser.$kw20$PLUS, (SubLObject)((numeral_parser.NIL != document.sign_p(conses_high.third(normalized_output))) ? document.sign_info(conses_high.third(normalized_output)) : numeral_parser.ZERO_INTEGER))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 32967L)
    public static SubLObject build_integer(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw46$INTEGER, document.sign_category(sign), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)));
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 33321L)
    public static SubLObject build_number(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw40$NUMBER, document.sign_category(sign), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)));
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 33842L)
    public static SubLObject build_fraction(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw38$FRACTION, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), (SubLObject)numeral_parser.$kw26$DIVIDEDBY, document.sign_info(conses_high.second(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 34560L)
    public static SubLObject build_half(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw40$NUMBER, document.sign_category(sign), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw84$INFO, (SubLObject)numeral_parser.$float174$0_5));
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 34884L)
    public static SubLObject build_float(final SubLObject fst) {
        final SubLObject output = finite_state_transducer.fst_output(fst);
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw39$FLOAT, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), output), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), output), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(document.sign_info(output.first()), (SubLObject)numeral_parser.$kw20$PLUS, document.sign_info(conses_high.third(output)))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 35515L)
    public static SubLObject build_negative_number(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw40$NUMBER, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, Numbers.minus(document.sign_info(conses_high.second(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 36062L)
    public static SubLObject build_proper_interval(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw42$PROPER_INTERVAL, document.phrase_category(phrase), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, (SubLObject)ConsesLow.cons(numeral_parser.$const181$Unity, Sort.sort(Sequences.delete_if(Symbols.symbol_function((SubLObject)numeral_parser.$sym182$NULL), Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym183$SIGN_INFO), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED), Symbols.symbol_function((SubLObject)numeral_parser.$sym184$_), (SubLObject)numeral_parser.UNPROVIDED))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 37095L)
    public static SubLObject build_interval(final SubLObject fst) {
        final SubLObject sign = finite_state_transducer.fst_output(fst).first();
        document.sign_update(sign, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, conses_high.adjoin((SubLObject)numeral_parser.$kw41$INTERVAL, document.sign_category(sign), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)));
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 38090L)
    public static SubLObject lex_numerals(final SubLObject sequence) {
        assert numeral_parser.NIL != Types.sequencep(sequence) : sequence;
        final SubLObject backwardP_var = (SubLObject)numeral_parser.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = Sequences.length(sequence), v_iteration = (SubLObject)numeral_parser.NIL, v_iteration = (SubLObject)numeral_parser.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)numeral_parser.ONE_INTEGER)) {
            element_num = ((numeral_parser.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)numeral_parser.ONE_INTEGER) : v_iteration);
            word = Vectors.aref(sequence, element_num);
            if (numeral_parser.NIL != number_utilities.number_string_p(document.word_string(word))) {
                document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw40$NUMBER), (SubLObject)numeral_parser.$kw84$INFO, number_utilities.number_string_value(document.word_string(word))));
            }
            else if (numeral_parser.NIL != Strings.stringE(document.word_string(word), (SubLObject)numeral_parser.$str197$_, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)) {
                document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw78$MULT)));
            }
            else if (numeral_parser.NIL != Strings.stringE(document.word_string(word), (SubLObject)numeral_parser.$str198$_, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED)) {
                document.word_update(word, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw79$EXPT)));
            }
        }
        return sequence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 39198L)
    public static SubLObject build_exponentiation_phrase(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw80$EXPONENTIATION), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), (SubLObject)numeral_parser.$kw28$TOTHE, document.sign_info(conses_high.third(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 39868L)
    public static SubLObject build_multiplication_phrase(final SubLObject fst) {
        final SubLObject phrase = document.new_phrase((SubLObject)numeral_parser.UNPROVIDED);
        document.phrase_update(phrase, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw83$CATEGORY, (SubLObject)ConsesLow.list((SubLObject)numeral_parser.$kw40$NUMBER), (SubLObject)numeral_parser.$kw85$STRING, string_utilities.bunge(Mapping.mapcar(Symbols.symbol_function((SubLObject)numeral_parser.$sym86$SIGN_STRING), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.UNPROVIDED), (SubLObject)numeral_parser.$kw87$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)numeral_parser.$sym88$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)numeral_parser.$kw84$INFO, combine_number_values(document.sign_info(finite_state_transducer.fst_output(fst).first()), (SubLObject)numeral_parser.$kw22$TIMES, document.sign_info(conses_high.third(finite_state_transducer.fst_output(fst))))));
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 40715L)
    public static SubLObject string_to_interval(final SubLObject string) {
        return conses_high.copy_tree(string_to_interval_cached(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 41003L)
    public static SubLObject clear_string_to_interval_cached() {
        final SubLObject cs = numeral_parser.$string_to_interval_cached_caching_state$.getGlobalValue();
        if (numeral_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)numeral_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 41003L)
    public static SubLObject remove_string_to_interval_cached(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(numeral_parser.$string_to_interval_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)numeral_parser.UNPROVIDED, (SubLObject)numeral_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 41003L)
    public static SubLObject string_to_interval_cached_internal(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert numeral_parser.NIL != Types.stringp(string) : string;
        SubLObject ans = (SubLObject)numeral_parser.NIL;
        SubLObject ignore_errors_tag = (SubLObject)numeral_parser.NIL;
        try {
            thread.throwStack.push(numeral_parser.$kw208$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)numeral_parser.$sym209$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject standardized_number_string = standardize_number_string(string, (SubLObject)numeral_parser.UNPROVIDED);
                    final SubLObject tokens = document.string_wordify(standardized_number_string, (SubLObject)numeral_parser.UNPROVIDED);
                    final SubLObject english_parse = finite_state_cascade_parser.fscp_parse(numeral_parser.$english_interval_parser$.getDynamicValue(thread), tokens);
                    ans = numeric_interval_term_from_fscp_result(english_parse);
                    if (numeral_parser.NIL == ans) {
                        final SubLObject digit_parse = finite_state_cascade_parser.fscp_parse(numeral_parser.$digit_interval_parser$.getDynamicValue(thread), tokens);
                        ans = numeric_interval_term_from_fscp_result(digit_parse);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)numeral_parser.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)numeral_parser.$kw208$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 41003L)
    public static SubLObject string_to_interval_cached(final SubLObject string) {
        SubLObject caching_state = numeral_parser.$string_to_interval_cached_caching_state$.getGlobalValue();
        if (numeral_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)numeral_parser.$sym206$STRING_TO_INTERVAL_CACHED, (SubLObject)numeral_parser.$sym210$_STRING_TO_INTERVAL_CACHED_CACHING_STATE_, (SubLObject)numeral_parser.$int211$256, (SubLObject)numeral_parser.EQUAL, (SubLObject)numeral_parser.ONE_INTEGER, (SubLObject)numeral_parser.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(string_to_interval_cached_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)numeral_parser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 41720L)
    public static SubLObject numeric_interval_term_from_fscp_result(final SubLObject fscp_result) {
        if (numeral_parser.NIL != list_utilities.lengthE(fscp_result, (SubLObject)numeral_parser.ONE_INTEGER, (SubLObject)numeral_parser.UNPROVIDED)) {
            final SubLObject first_fscp_result = Sequences.elt(fscp_result, (SubLObject)numeral_parser.ZERO_INTEGER);
            return (SubLObject)((numeral_parser.NIL != document.sign_info(first_fscp_result) && numeral_parser.NIL != interval_signP(first_fscp_result)) ? document.sign_info(first_fscp_result) : numeral_parser.NIL);
        }
        return (SubLObject)numeral_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 42041L)
    public static SubLObject interval_stringP(final SubLObject string) {
        assert numeral_parser.NIL != Types.stringp(string) : string;
        return string_to_interval(string);
    }
    
    
    public static final class $numeral_parser_stringE$BinaryFunction extends BinaryFunction
    {
        public $numeral_parser_stringE$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NUMERAL-PARSER-STRING="));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return numeral_parser.numeral_parser_stringE(arg1, arg2);
        }
    }
    
    public static SubLObject declare_numeral_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "standardize_number_string", "STANDARDIZE-NUMBER-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "initialize_number_values", "INITIALIZE-NUMBER-VALUES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "number_value", "NUMBER-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "number_string_signP", "NUMBER-STRING-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "hyphenated_number_value", "HYPHENATED-NUMBER-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "combine_number_values", "COMBINE-NUMBER-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "numeral_parser_max_significant_digits", "NUMERAL-PARSER-MAX-SIGNIFICANT-DIGITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "numeral_parser_significant_digits", "NUMERAL-PARSER-SIGNIFICANT-DIGITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "combine_cycl_number_values", "COMBINE-CYCL-NUMBER-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "combine_non_cycl_number_values", "COMBINE-NON-CYCL-NUMBER-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "numeral_parser_stringE", "NUMERAL-PARSER-STRING=", 2, 0, false);
        new $numeral_parser_stringE$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "numeral_parser_charE", "NUMERAL-PARSER-CHAR=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "zero_literalP", "ZERO-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "indefinite_signP", "INDEFINITE-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "atomic_ten_signP", "ATOMIC-TEN-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "digit_signP", "DIGIT-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "deci_signP", "DECI-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "hyphen_signP", "HYPHEN-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "teen_signP", "TEEN-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "fuzzy_signP", "FUZZY-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "non_atomic_ten_signP", "NON-ATOMIC-TEN-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "hyphenated_non_atomic_ten_signP", "HYPHENATED-NON-ATOMIC-TEN-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "cent_signP", "CENT-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "kilo_signP", "KILO-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "fraction_signP", "FRACTION-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "float_signP", "FLOAT-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "number_signP", "NUMBER-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "interval_signP", "INTERVAL-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "proper_interval_signP", "PROPER-INTERVAL-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "milli_signP", "MILLI-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "billi_signP", "BILLI-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "trilli_signP", "TRILLI-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "integer_signP", "INTEGER-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "extended_dozen_signP", "EXTENDED-DOZEN-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "standard_dozen_signP", "STANDARD-DOZEN-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "extended_hundred_signP", "EXTENDED-HUNDRED-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "standard_hundred_signP", "STANDARD-HUNDRED-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "thousand_signP", "THOUSAND-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "million_signP", "MILLION-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "billion_signP", "BILLION-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "trillion_signP", "TRILLION-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "and_literalP", "AND-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "indefinite_literalP", "INDEFINITE-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "dozen_literalP", "DOZEN-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "few_literalP", "FEW-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "hundred_literalP", "HUNDRED-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "thousand_literalP", "THOUSAND-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "million_literalP", "MILLION-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "millions_literalP", "MILLIONS-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "billions_literalP", "BILLIONS-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "billion_literalP", "BILLION-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "trillions_literalP", "TRILLIONS-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "trillion_literalP", "TRILLION-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "first_literalP", "FIRST-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "second_literalP", "SECOND-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "seconds_literalP", "SECONDS-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "atomic_denominator_literalP", "ATOMIC-DENOMINATOR-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "denominator_literalP", "DENOMINATOR-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "denominator_signP", "DENOMINATOR-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "half_signP", "HALF-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "minus_literalP", "MINUS-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "to_literalP", "TO-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "from_literalP", "FROM-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "between_literalP", "BETWEEN-LITERAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "mult_signP", "MULT-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "expt_operator_signP", "EXPT-OPERATOR-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "exponentiation_signP", "EXPONENTIATION-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "minus_signP", "MINUS-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "plus_signP", "PLUS-SIGN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_denominator", "BUILD-DENOMINATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_zero", "BUILD-ZERO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_indefinite", "BUILD-INDEFINITE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_deci", "BUILD-DECI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_teen", "BUILD-TEEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_fuzzy", "BUILD-FUZZY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_atomic_ten", "BUILD-ATOMIC-TEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_hyphenated_non_atomic_ten", "BUILD-HYPHENATED-NON-ATOMIC-TEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_non_atomic_ten", "BUILD-NON-ATOMIC-TEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_cent", "BUILD-CENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_standard_hundred", "BUILD-STANDARD-HUNDRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_a_few", "BUILD-A-FEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_extended_hundred", "BUILD-EXTENDED-HUNDRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_standard_dozen", "BUILD-STANDARD-DOZEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_extended_dozen", "BUILD-EXTENDED-DOZEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_kilo", "BUILD-KILO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_thousand", "BUILD-THOUSAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_milli", "BUILD-MILLI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_million", "BUILD-MILLION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_billi", "BUILD-BILLI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_billion", "BUILD-BILLION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_trilli", "BUILD-TRILLI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_trillion", "BUILD-TRILLION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_integer", "BUILD-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_number", "BUILD-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_fraction", "BUILD-FRACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_half", "BUILD-HALF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_float", "BUILD-FLOAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_negative_number", "BUILD-NEGATIVE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_proper_interval", "BUILD-PROPER-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_interval", "BUILD-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "lex_numerals", "LEX-NUMERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_exponentiation_phrase", "BUILD-EXPONENTIATION-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "build_multiplication_phrase", "BUILD-MULTIPLICATION-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "string_to_interval", "STRING-TO-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "clear_string_to_interval_cached", "CLEAR-STRING-TO-INTERVAL-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "remove_string_to_interval_cached", "REMOVE-STRING-TO-INTERVAL-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "string_to_interval_cached_internal", "STRING-TO-INTERVAL-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "string_to_interval_cached", "STRING-TO-INTERVAL-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "numeric_interval_term_from_fscp_result", "NUMERIC-INTERVAL-TERM-FROM-FSCP-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeral_parser", "interval_stringP", "INTERVAL-STRING?", 1, 0, false);
        return (SubLObject)numeral_parser.NIL;
    }
    
    public static SubLObject init_numeral_parser_file() {
        numeral_parser.$null$ = SubLFiles.deflexical("*NULL*", (SubLObject)numeral_parser.$list0);
        numeral_parser.$a$ = SubLFiles.deflexical("*A*", (SubLObject)numeral_parser.$list1);
        numeral_parser.$digits$ = SubLFiles.deflexical("*DIGITS*", (SubLObject)numeral_parser.$list2);
        numeral_parser.$teens$ = SubLFiles.deflexical("*TEENS*", (SubLObject)numeral_parser.$list3);
        numeral_parser.$fuzzies$ = SubLFiles.deflexical("*FUZZIES*", (SubLObject)numeral_parser.$list4);
        numeral_parser.$atomic_tens$ = SubLFiles.deflexical("*ATOMIC-TENS*", (SubLObject)numeral_parser.$list5);
        numeral_parser.$onedozen$ = SubLFiles.deflexical("*ONEDOZEN*", (SubLObject)numeral_parser.$list6);
        numeral_parser.$onehundred$ = SubLFiles.deflexical("*ONEHUNDRED*", (SubLObject)numeral_parser.$list7);
        numeral_parser.$onethousand$ = SubLFiles.deflexical("*ONETHOUSAND*", (SubLObject)numeral_parser.$list8);
        numeral_parser.$onemillion$ = SubLFiles.deflexical("*ONEMILLION*", (SubLObject)numeral_parser.$list9);
        numeral_parser.$onebillion$ = SubLFiles.deflexical("*ONEBILLION*", (SubLObject)numeral_parser.$list10);
        numeral_parser.$onetrillion$ = SubLFiles.deflexical("*ONETRILLION*", (SubLObject)numeral_parser.$list11);
        numeral_parser.$irregular_denominators$ = SubLFiles.deflexical("*IRREGULAR-DENOMINATORS*", (SubLObject)numeral_parser.$list12);
        numeral_parser.$number_values$ = SubLFiles.defparameter("*NUMBER-VALUES*", initialize_number_values());
        numeral_parser.$denominator$ = SubLFiles.defparameter("*DENOMINATOR*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym90$ATOMIC_DENOMINATOR_LITERAL_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym92$ATOMIC_TEN_SIGN_), (SubLObject)numeral_parser.$list93), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.TWO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym94$DENOMINATOR_LITERAL_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym95$BUILD_DENOMINATOR)));
        numeral_parser.$zero$ = SubLFiles.defparameter("*ZERO*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym97$ZERO_LITERAL_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym98$BUILD_ZERO)));
        numeral_parser.$indefinite$ = SubLFiles.defparameter("*INDEFINITE*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym99$INDEFINITE_LITERAL_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym100$BUILD_INDEFINITE)));
        numeral_parser.$deci$ = SubLFiles.defparameter("*DECI*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym102$DIGIT_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym103$NUMBER_STRING_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym104$BUILD_DECI)));
        numeral_parser.$teen$ = SubLFiles.defparameter("*TEEN*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym106$TEEN_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym107$BUILD_TEEN)));
        numeral_parser.$fuzzy$ = SubLFiles.defparameter("*FUZZY*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym108$FUZZY_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym109$BUILD_FUZZY)));
        numeral_parser.$atomic_ten$ = SubLFiles.defparameter("*ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym92$ATOMIC_TEN_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym111$BUILD_ATOMIC_TEN)));
        numeral_parser.$hyphenated_non_atomic_ten$ = SubLFiles.defparameter("*HYPHENATED-NON-ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym112$HYPHENATED_NON_ATOMIC_TEN_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym113$BUILD_HYPHENATED_NON_ATOMIC_TEN)));
        numeral_parser.$non_atomic_ten$ = SubLFiles.defparameter("*NON-ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym92$ATOMIC_TEN_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym116$DECI_SIGN_), (SubLObject)numeral_parser.$list93), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym114$HYPHEN_SIGN_), (SubLObject)numeral_parser.$list117), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym116$DECI_SIGN_), (SubLObject)numeral_parser.$list93)), Symbols.symbol_function((SubLObject)numeral_parser.$sym118$BUILD_NON_ATOMIC_TEN)));
        numeral_parser.$cent$ = SubLFiles.defparameter("*CENT*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym116$DECI_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym106$TEEN_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym108$FUZZY_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym92$ATOMIC_TEN_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym119$NON_ATOMIC_TEN_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym103$NUMBER_STRING_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym120$BUILD_CENT)));
        numeral_parser.$standard_hundred$ = SubLFiles.defparameter("*STANDARD-HUNDRED*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym116$DECI_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym122$INDEFINITE_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym123$HUNDRED_LITERAL_), (SubLObject)numeral_parser.$list117), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list93), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list126), numeral_parser.$list127, ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list128), ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym129$FRACTION_SIGN_), (SubLObject)numeral_parser.$list128), ConsesLow.listS((SubLObject)numeral_parser.SIX_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list93) }), Symbols.symbol_function((SubLObject)numeral_parser.$sym130$BUILD_STANDARD_HUNDRED)));
        numeral_parser.$a_few$ = SubLFiles.defparameter("*A-FEW*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym122$INDEFINITE_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym132$FEW_LITERAL_), (SubLObject)numeral_parser.$list93)), Symbols.symbol_function((SubLObject)numeral_parser.$sym133$BUILD_A_FEW)));
        numeral_parser.$extended_hundred$ = SubLFiles.defparameter("*EXTENDED-HUNDRED*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym122$INDEFINITE_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym123$HUNDRED_LITERAL_), (SubLObject)numeral_parser.$list117), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list93), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list126), numeral_parser.$list127, ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list128), ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list134), ConsesLow.listS((SubLObject)numeral_parser.SIX_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list93) }), Symbols.symbol_function((SubLObject)numeral_parser.$sym135$BUILD_EXTENDED_HUNDRED)));
        numeral_parser.$standard_dozen$ = SubLFiles.defparameter("*STANDARD-DOZEN*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym116$DECI_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym122$INDEFINITE_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym136$DOZEN_LITERAL_), (SubLObject)numeral_parser.$list93)), Symbols.symbol_function((SubLObject)numeral_parser.$sym137$BUILD_STANDARD_DOZEN)));
        numeral_parser.$extended_dozen$ = SubLFiles.defparameter("*EXTENDED-DOZEN*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym122$INDEFINITE_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym136$DOZEN_LITERAL_), (SubLObject)numeral_parser.$list93)), Symbols.symbol_function((SubLObject)numeral_parser.$sym138$BUILD_EXTENDED_DOZEN)));
        numeral_parser.$kilo$ = SubLFiles.defparameter("*KILO*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym139$STANDARD_HUNDRED_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym140$EXTENDED_HUNDRED_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym141$FLOAT_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym103$NUMBER_STRING_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym142$BUILD_KILO)));
        numeral_parser.$thousand$ = SubLFiles.defparameter("*THOUSAND*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym144$KILO_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym122$INDEFINITE_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym145$THOUSAND_LITERAL_), (SubLObject)numeral_parser.$list117), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym144$KILO_SIGN_), (SubLObject)numeral_parser.$list93), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list126), numeral_parser.$list127, ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list128), ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list134), ConsesLow.listS((SubLObject)numeral_parser.SIX_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list93) }), Symbols.symbol_function((SubLObject)numeral_parser.$sym146$BUILD_THOUSAND)));
        numeral_parser.$milli$ = SubLFiles.defparameter("*MILLI*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym144$KILO_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym147$THOUSAND_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym103$NUMBER_STRING_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym148$BUILD_MILLI)));
        numeral_parser.$million$ = SubLFiles.defparameter("*MILLION*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym150$MILLI_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym122$INDEFINITE_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym151$MILLION_LITERAL_), (SubLObject)numeral_parser.$list117), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym150$MILLI_SIGN_), (SubLObject)numeral_parser.$list93), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list126), numeral_parser.$list127, ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list128), ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list134), ConsesLow.listS((SubLObject)numeral_parser.SIX_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list93) }), Symbols.symbol_function((SubLObject)numeral_parser.$sym152$BUILD_MILLION)));
        numeral_parser.$billi$ = SubLFiles.defparameter("*BILLI*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym150$MILLI_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym153$MILLION_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym103$NUMBER_STRING_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym154$BUILD_BILLI)));
        numeral_parser.$billion$ = SubLFiles.defparameter("*BILLION*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym156$BILLI_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym122$INDEFINITE_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym157$BILLION_LITERAL_), (SubLObject)numeral_parser.$list117), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym156$BILLI_SIGN_), (SubLObject)numeral_parser.$list93), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list126), numeral_parser.$list127, ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list128), ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list134), ConsesLow.listS((SubLObject)numeral_parser.SIX_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list93) }), Symbols.symbol_function((SubLObject)numeral_parser.$sym158$BUILD_BILLION)));
        numeral_parser.$trilli$ = SubLFiles.defparameter("*TRILLI*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym156$BILLI_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym159$BILLION_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym103$NUMBER_STRING_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym160$BUILD_TRILLI)));
        numeral_parser.$trillion$ = SubLFiles.defparameter("*TRILLION*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym162$TRILLI_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym122$INDEFINITE_SIGN_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym163$TRILLION_LITERAL_), (SubLObject)numeral_parser.$list117), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym162$TRILLI_SIGN_), (SubLObject)numeral_parser.$list93), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list126), numeral_parser.$list127, ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list128), ConsesLow.listS((SubLObject)numeral_parser.FOUR_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym125$SIGN_P), (SubLObject)numeral_parser.$list134), ConsesLow.listS((SubLObject)numeral_parser.SIX_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym124$CENT_SIGN_), (SubLObject)numeral_parser.$list93) }), Symbols.symbol_function((SubLObject)numeral_parser.$sym164$BUILD_TRILLION)));
        numeral_parser.$integer$ = SubLFiles.defparameter("*INTEGER*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym162$TRILLI_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym165$TRILLION_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym166$BUILD_INTEGER)));
        numeral_parser.$number$ = SubLFiles.defparameter("*NUMBER*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym167$INTEGER_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym141$FLOAT_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym103$NUMBER_STRING_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym129$FRACTION_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym168$STANDARD_DOZEN_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym169$EXTENDED_DOZEN_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym170$BUILD_NUMBER)));
        numeral_parser.$fraction$ = SubLFiles.defparameter("*FRACTION*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym122$INDEFINITE_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym90$ATOMIC_DENOMINATOR_LITERAL_), (SubLObject)numeral_parser.$list93), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym172$DENOMINATOR_SIGN_), (SubLObject)numeral_parser.$list93)), Symbols.symbol_function((SubLObject)numeral_parser.$sym173$BUILD_FRACTION)));
        numeral_parser.$half$ = SubLFiles.defparameter("*HALF*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym175$HALF_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym176$BUILD_HALF)));
        numeral_parser.$float$ = SubLFiles.defparameter("*FLOAT*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list177, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym167$INTEGER_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym121$AND_LITERAL_), (SubLObject)numeral_parser.$list93), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.TWO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym129$FRACTION_SIGN_), (SubLObject)numeral_parser.$list117)), Symbols.symbol_function((SubLObject)numeral_parser.$sym178$BUILD_FLOAT)));
        numeral_parser.$negative_number_string$ = SubLFiles.defparameter("*NEGATIVE-NUMBER-STRING*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym179$MINUS_LITERAL_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list93)), Symbols.symbol_function((SubLObject)numeral_parser.$sym180$BUILD_NEGATIVE_NUMBER)));
        numeral_parser.$proper_interval$ = SubLFiles.defparameter("*PROPER-INTERVAL*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list185, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list93), ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym129$FRACTION_SIGN_), (SubLObject)numeral_parser.$list93), ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym186$FROM_LITERAL_), (SubLObject)numeral_parser.$list91), ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym187$BETWEEN_LITERAL_), (SubLObject)numeral_parser.$list188), ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list93), ConsesLow.listS((SubLObject)numeral_parser.TWO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym189$TO_LITERAL_), (SubLObject)numeral_parser.$list117), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list190), ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym129$FRACTION_SIGN_), (SubLObject)numeral_parser.$list190), ConsesLow.listS((SubLObject)numeral_parser.FIVE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list191), ConsesLow.listS((SubLObject)numeral_parser.FIVE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym129$FRACTION_SIGN_), (SubLObject)numeral_parser.$list191), ConsesLow.listS((SubLObject)numeral_parser.SIX_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym121$AND_LITERAL_), (SubLObject)numeral_parser.$list192), ConsesLow.listS((SubLObject)numeral_parser.SEVEN_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list190), ConsesLow.listS((SubLObject)numeral_parser.SEVEN_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym129$FRACTION_SIGN_), (SubLObject)numeral_parser.$list190) }), Symbols.symbol_function((SubLObject)numeral_parser.$sym193$BUILD_PROPER_INTERVAL)));
        numeral_parser.$interval$ = SubLFiles.defparameter("*INTERVAL*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list89, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym194$PROPER_INTERVAL_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list91)), Symbols.symbol_function((SubLObject)numeral_parser.$sym195$BUILD_INTERVAL)));
        numeral_parser.$english_interval_parser$ = SubLFiles.defparameter("*ENGLISH-INTERVAL-PARSER*", finite_state_cascade_parser.new_finite_state_cascade_parser((SubLObject)ConsesLow.list(new SubLObject[] { numeral_parser.$zero$.getDynamicValue(), numeral_parser.$indefinite$.getDynamicValue(), numeral_parser.$deci$.getDynamicValue(), numeral_parser.$teen$.getDynamicValue(), numeral_parser.$fuzzy$.getDynamicValue(), numeral_parser.$a_few$.getDynamicValue(), numeral_parser.$atomic_ten$.getDynamicValue(), numeral_parser.$hyphenated_non_atomic_ten$.getDynamicValue(), numeral_parser.$denominator$.getDynamicValue(), numeral_parser.$non_atomic_ten$.getDynamicValue(), numeral_parser.$cent$.getDynamicValue(), numeral_parser.$standard_hundred$.getDynamicValue(), numeral_parser.$extended_hundred$.getDynamicValue(), numeral_parser.$standard_dozen$.getDynamicValue(), numeral_parser.$extended_dozen$.getDynamicValue(), numeral_parser.$kilo$.getDynamicValue(), numeral_parser.$thousand$.getDynamicValue(), numeral_parser.$milli$.getDynamicValue(), numeral_parser.$million$.getDynamicValue(), numeral_parser.$billi$.getDynamicValue(), numeral_parser.$billion$.getDynamicValue(), numeral_parser.$trilli$.getDynamicValue(), numeral_parser.$trillion$.getDynamicValue(), numeral_parser.$integer$.getDynamicValue(), numeral_parser.$number$.getDynamicValue(), numeral_parser.$fraction$.getDynamicValue(), numeral_parser.$half$.getDynamicValue(), numeral_parser.$proper_interval$.getDynamicValue(), numeral_parser.$float$.getDynamicValue(), numeral_parser.$kilo$.getDynamicValue(), numeral_parser.$thousand$.getDynamicValue(), numeral_parser.$milli$.getDynamicValue(), numeral_parser.$million$.getDynamicValue(), numeral_parser.$billi$.getDynamicValue(), numeral_parser.$billion$.getDynamicValue(), numeral_parser.$trilli$.getDynamicValue(), numeral_parser.$trillion$.getDynamicValue(), numeral_parser.$integer$.getDynamicValue(), numeral_parser.$number$.getDynamicValue(), numeral_parser.$negative_number_string$.getDynamicValue(), numeral_parser.$proper_interval$.getDynamicValue(), numeral_parser.$interval$.getDynamicValue() }), (SubLObject)numeral_parser.UNPROVIDED));
        numeral_parser.$negative_number$ = SubLFiles.defparameter("*NEGATIVE-NUMBER*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym199$MINUS_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list93)), Symbols.symbol_function((SubLObject)numeral_parser.$sym180$BUILD_NEGATIVE_NUMBER)));
        numeral_parser.$exponentiation$ = SubLFiles.defparameter("*EXPONENTIATION*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym200$EXPT_OPERATOR_SIGN_), (SubLObject)numeral_parser.$list117), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list93)), Symbols.symbol_function((SubLObject)numeral_parser.$sym201$BUILD_EXPONENTIATION_PHRASE)));
        numeral_parser.$multiplication$ = SubLFiles.defparameter("*MULTIPLICATION*", finite_state_transducer.new_finite_state_transducer((SubLObject)numeral_parser.ZERO_INTEGER, (SubLObject)numeral_parser.$list115, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ZERO_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym171$NUMBER_SIGN_), (SubLObject)numeral_parser.$list91), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.ONE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym202$MULT_SIGN_), (SubLObject)numeral_parser.$list117), (SubLObject)ConsesLow.listS((SubLObject)numeral_parser.THREE_INTEGER, Symbols.symbol_function((SubLObject)numeral_parser.$sym203$EXPONENTIATION_SIGN_), (SubLObject)numeral_parser.$list93)), Symbols.symbol_function((SubLObject)numeral_parser.$sym204$BUILD_MULTIPLICATION_PHRASE)));
        numeral_parser.$digit_interval_parser$ = SubLFiles.defparameter("*DIGIT-INTERVAL-PARSER*", finite_state_cascade_parser.new_finite_state_cascade_parser((SubLObject)ConsesLow.list(numeral_parser.$negative_number$.getDynamicValue(), numeral_parser.$exponentiation$.getDynamicValue(), numeral_parser.$multiplication$.getDynamicValue(), numeral_parser.$interval$.getDynamicValue()), (SubLObject)numeral_parser.$sym205$LEX_NUMERALS));
        numeral_parser.$string_to_interval_cached_caching_state$ = SubLFiles.deflexical("*STRING-TO-INTERVAL-CACHED-CACHING-STATE*", (SubLObject)numeral_parser.NIL);
        return (SubLObject)numeral_parser.NIL;
    }
    
    public static SubLObject setup_numeral_parser_file() {
        memoization_state.note_globally_cached_function((SubLObject)numeral_parser.$sym206$STRING_TO_INTERVAL_CACHED);
        return (SubLObject)numeral_parser.NIL;
    }
    
    public void declareFunctions() {
        declare_numeral_parser_file();
    }
    
    public void initializeVariables() {
        init_numeral_parser_file();
    }
    
    public void runTopLevelForms() {
        setup_numeral_parser_file();
    }
    

    public static final SubLFile me = new numeral_parser();
    public static final String myName = "com.cyc.cycjava.cycl.numeral_parser";
    public static final String myFingerPrint = "51ab259000ee60d1c803f220566e9bce56b798e2dabc14202a1184857d3b8503";
    private static SubLSymbol $null$ = null;
    private static SubLSymbol $a$ = null;
    private static SubLSymbol $digits$ = null;
    private static SubLSymbol $teens$ = null;
    private static SubLSymbol $fuzzies$ = null;
    private static SubLSymbol $atomic_tens$ = null;
    private static SubLSymbol $onedozen$ = null;
    private static SubLSymbol $onehundred$ = null;
    private static SubLSymbol $onethousand$ = null;
    private static SubLSymbol $onemillion$ = null;
    private static SubLSymbol $onebillion$ = null;
    private static SubLSymbol $onetrillion$ = null;
    private static SubLSymbol $irregular_denominators$ = null;
    private static SubLSymbol $number_values$ = null;
    private static SubLSymbol $denominator$ = null;
    private static SubLSymbol $zero$ = null;
    private static SubLSymbol $indefinite$ = null;
    private static SubLSymbol $deci$ = null;
    private static SubLSymbol $teen$ = null;
    private static SubLSymbol $fuzzy$ = null;
    private static SubLSymbol $atomic_ten$ = null;
    private static SubLSymbol $hyphenated_non_atomic_ten$ = null;
    private static SubLSymbol $non_atomic_ten$ = null;
    private static SubLSymbol $cent$ = null;
    private static SubLSymbol $standard_hundred$ = null;
    private static SubLSymbol $a_few$ = null;
    private static SubLSymbol $extended_hundred$ = null;
    private static SubLSymbol $standard_dozen$ = null;
    private static SubLSymbol $extended_dozen$ = null;
    private static SubLSymbol $kilo$ = null;
    private static SubLSymbol $thousand$ = null;
    private static SubLSymbol $milli$ = null;
    private static SubLSymbol $million$ = null;
    private static SubLSymbol $billi$ = null;
    private static SubLSymbol $billion$ = null;
    private static SubLSymbol $trilli$ = null;
    private static SubLSymbol $trillion$ = null;
    private static SubLSymbol $integer$ = null;
    private static SubLSymbol $number$ = null;
    private static SubLSymbol $fraction$ = null;
    private static SubLSymbol $half$ = null;
    private static SubLSymbol $float$ = null;
    private static SubLSymbol $negative_number_string$ = null;
    public static SubLSymbol $proper_interval$ = null;
    private static SubLSymbol $interval$ = null;
    public static SubLSymbol $english_interval_parser$ = null;
    private static SubLSymbol $negative_number$ = null;
    private static SubLSymbol $exponentiation$ = null;
    private static SubLSymbol $multiplication$ = null;
    public static SubLSymbol $digit_interval_parser$ = null;
    private static SubLSymbol $string_to_interval_cached_caching_state$ = null;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeString("several"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Several-Quant"))));
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeString("hundred"), SubLObjectFactory.makeInteger(100)));
    private static final SubLList $list8 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeString("thousand"), SubLObjectFactory.makeInteger(1000)));
    private static final SubLList $list9 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeString("million"), SubLObjectFactory.makeInteger(0xf4240)));
    private static final SubLList $list10 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeString("billion"), SubLObjectFactory.makeInteger(0x3b9aca00)));
    private static final SubLList $list11 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeString("trillion"), SubLObjectFactory.makeInteger("1000000000000")));
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$AMERICAN = SubLObjectFactory.makeKeyword("AMERICAN");
    private static final SubLString $str14$_ = SubLObjectFactory.makeString(",");
    private static final SubLInteger $int15$100 = SubLObjectFactory.makeInteger(100);
    private static final SubLString $str16$s = SubLObjectFactory.makeString("s");
    private static final SubLString $str17$th = SubLObjectFactory.makeString("th");
    private static final SubLString $str18$ths = SubLObjectFactory.makeString("ths");
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$PLUS = SubLObjectFactory.makeKeyword("PLUS");
    private static final SubLSymbol $sym21$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
    private static final SubLSymbol $kw22$TIMES = SubLObjectFactory.makeKeyword("TIMES");
    private static final SubLSymbol $sym23$DIGIT_CHAR_P = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
    private static final SubLObject $const24$PlusFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("PlusFn"));
    private static final SubLObject $const25$TimesFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TimesFn"));
    private static final SubLSymbol $kw26$DIVIDEDBY = SubLObjectFactory.makeKeyword("DIVIDEDBY");
    private static final SubLObject $const27$QuotientFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("QuotientFn"));
    private static final SubLSymbol $kw28$TOTHE = SubLObjectFactory.makeKeyword("TOTHE");
    private static final SubLObject $const29$ExponentFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ExponentFn"));
    private static final SubLString $str30$zero = SubLObjectFactory.makeString("zero");
    private static final SubLSymbol $kw31$INDEFINITE = SubLObjectFactory.makeKeyword("INDEFINITE");
    private static final SubLSymbol $sym32$NUMERAL_PARSER_STRING_ = SubLObjectFactory.makeSymbol("NUMERAL-PARSER-STRING=");
    private static final SubLString $str33$_ = SubLObjectFactory.makeString("-");
    private static final SubLSymbol $kw34$FUZZY = SubLObjectFactory.makeKeyword("FUZZY");
    private static final SubLSymbol $kw35$NON_ATOMIC_TEN = SubLObjectFactory.makeKeyword("NON-ATOMIC-TEN");
    private static final SubLSymbol $kw36$CENT = SubLObjectFactory.makeKeyword("CENT");
    private static final SubLSymbol $kw37$KILO = SubLObjectFactory.makeKeyword("KILO");
    private static final SubLSymbol $kw38$FRACTION = SubLObjectFactory.makeKeyword("FRACTION");
    private static final SubLSymbol $kw39$FLOAT = SubLObjectFactory.makeKeyword("FLOAT");
    private static final SubLSymbol $kw40$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
    private static final SubLSymbol $kw41$INTERVAL = SubLObjectFactory.makeKeyword("INTERVAL");
    private static final SubLSymbol $kw42$PROPER_INTERVAL = SubLObjectFactory.makeKeyword("PROPER-INTERVAL");
    private static final SubLSymbol $kw43$MILLI = SubLObjectFactory.makeKeyword("MILLI");
    private static final SubLSymbol $kw44$BILLI = SubLObjectFactory.makeKeyword("BILLI");
    private static final SubLSymbol $kw45$TRILLI = SubLObjectFactory.makeKeyword("TRILLI");
    private static final SubLSymbol $kw46$INTEGER = SubLObjectFactory.makeKeyword("INTEGER");
    private static final SubLSymbol $kw47$EXTENDED_DOZEN = SubLObjectFactory.makeKeyword("EXTENDED-DOZEN");
    private static final SubLSymbol $kw48$STANDARD_DOZEN = SubLObjectFactory.makeKeyword("STANDARD-DOZEN");
    private static final SubLSymbol $kw49$EXTENDED_HUNDRED = SubLObjectFactory.makeKeyword("EXTENDED-HUNDRED");
    private static final SubLSymbol $kw50$STANDARD_HUNDRED = SubLObjectFactory.makeKeyword("STANDARD-HUNDRED");
    private static final SubLSymbol $kw51$THOUSAND = SubLObjectFactory.makeKeyword("THOUSAND");
    private static final SubLSymbol $kw52$MILLION = SubLObjectFactory.makeKeyword("MILLION");
    private static final SubLSymbol $kw53$BILLION = SubLObjectFactory.makeKeyword("BILLION");
    private static final SubLSymbol $kw54$TRILLION = SubLObjectFactory.makeKeyword("TRILLION");
    private static final SubLString $str55$and = SubLObjectFactory.makeString("and");
    private static final SubLString $str56$dozen = SubLObjectFactory.makeString("dozen");
    private static final SubLString $str57$few = SubLObjectFactory.makeString("few");
    private static final SubLString $str58$hundred = SubLObjectFactory.makeString("hundred");
    private static final SubLString $str59$thousand = SubLObjectFactory.makeString("thousand");
    private static final SubLString $str60$million = SubLObjectFactory.makeString("million");
    private static final SubLString $str61$millions = SubLObjectFactory.makeString("millions");
    private static final SubLString $str62$billions = SubLObjectFactory.makeString("billions");
    private static final SubLString $str63$billion = SubLObjectFactory.makeString("billion");
    private static final SubLString $str64$trillions = SubLObjectFactory.makeString("trillions");
    private static final SubLString $str65$trillion = SubLObjectFactory.makeString("trillion");
    private static final SubLString $str66$first = SubLObjectFactory.makeString("first");
    private static final SubLString $str67$second = SubLObjectFactory.makeString("second");
    private static final SubLString $str68$seconds = SubLObjectFactory.makeString("seconds");
    private static final SubLString $str69$halves = SubLObjectFactory.makeString("halves");
    private static final SubLSymbol $sym70$NUMERAL_PARSER_CHAR_ = SubLObjectFactory.makeSymbol("NUMERAL-PARSER-CHAR=");
    private static final SubLSymbol $kw71$DENOMINATOR = SubLObjectFactory.makeKeyword("DENOMINATOR");
    private static final SubLString $str72$half = SubLObjectFactory.makeString("half");
    private static final SubLString $str73$minus = SubLObjectFactory.makeString("minus");
    private static final SubLString $str74$negative = SubLObjectFactory.makeString("negative");
    private static final SubLString $str75$to = SubLObjectFactory.makeString("to");
    private static final SubLString $str76$from = SubLObjectFactory.makeString("from");
    private static final SubLString $str77$between = SubLObjectFactory.makeString("between");
    private static final SubLSymbol $kw78$MULT = SubLObjectFactory.makeKeyword("MULT");
    private static final SubLSymbol $kw79$EXPT = SubLObjectFactory.makeKeyword("EXPT");
    private static final SubLSymbol $kw80$EXPONENTIATION = SubLObjectFactory.makeKeyword("EXPONENTIATION");
    private static final SubLString $str81$_ = SubLObjectFactory.makeString("+");
    private static final SubLString $str82$Can_t_build_a_denominator_out_of_ = SubLObjectFactory.makeString("Can't build a denominator out of nothing!");
    private static final SubLSymbol $kw83$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
    private static final SubLSymbol $kw84$INFO = SubLObjectFactory.makeKeyword("INFO");
    private static final SubLSymbol $kw85$STRING = SubLObjectFactory.makeKeyword("STRING");
    private static final SubLSymbol $sym86$SIGN_STRING = SubLObjectFactory.makeSymbol("SIGN-STRING");
    private static final SubLSymbol $kw87$CONSTITUENTS = SubLObjectFactory.makeKeyword("CONSTITUENTS");
    private static final SubLSymbol $sym88$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$ATOMIC_DENOMINATOR_LITERAL_ = SubLObjectFactory.makeSymbol("ATOMIC-DENOMINATOR-LITERAL?");
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$ATOMIC_TEN_SIGN_ = SubLObjectFactory.makeSymbol("ATOMIC-TEN-SIGN?");
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$DENOMINATOR_LITERAL_ = SubLObjectFactory.makeSymbol("DENOMINATOR-LITERAL?");
    private static final SubLSymbol $sym95$BUILD_DENOMINATOR = SubLObjectFactory.makeSymbol("BUILD-DENOMINATOR");
    private static final SubLSymbol $kw96$ZERO = SubLObjectFactory.makeKeyword("ZERO");
    private static final SubLSymbol $sym97$ZERO_LITERAL_ = SubLObjectFactory.makeSymbol("ZERO-LITERAL?");
    private static final SubLSymbol $sym98$BUILD_ZERO = SubLObjectFactory.makeSymbol("BUILD-ZERO");
    private static final SubLSymbol $sym99$INDEFINITE_LITERAL_ = SubLObjectFactory.makeSymbol("INDEFINITE-LITERAL?");
    private static final SubLSymbol $sym100$BUILD_INDEFINITE = SubLObjectFactory.makeSymbol("BUILD-INDEFINITE");
    private static final SubLSymbol $kw101$DECI = SubLObjectFactory.makeKeyword("DECI");
    private static final SubLSymbol $sym102$DIGIT_SIGN_ = SubLObjectFactory.makeSymbol("DIGIT-SIGN?");
    private static final SubLSymbol $sym103$NUMBER_STRING_SIGN_ = SubLObjectFactory.makeSymbol("NUMBER-STRING-SIGN?");
    private static final SubLSymbol $sym104$BUILD_DECI = SubLObjectFactory.makeSymbol("BUILD-DECI");
    private static final SubLSymbol $kw105$TEEN = SubLObjectFactory.makeKeyword("TEEN");
    private static final SubLSymbol $sym106$TEEN_SIGN_ = SubLObjectFactory.makeSymbol("TEEN-SIGN?");
    private static final SubLSymbol $sym107$BUILD_TEEN = SubLObjectFactory.makeSymbol("BUILD-TEEN");
    private static final SubLSymbol $sym108$FUZZY_SIGN_ = SubLObjectFactory.makeSymbol("FUZZY-SIGN?");
    private static final SubLSymbol $sym109$BUILD_FUZZY = SubLObjectFactory.makeSymbol("BUILD-FUZZY");
    private static final SubLSymbol $kw110$ATOMIC_TEN = SubLObjectFactory.makeKeyword("ATOMIC-TEN");
    private static final SubLSymbol $sym111$BUILD_ATOMIC_TEN = SubLObjectFactory.makeSymbol("BUILD-ATOMIC-TEN");
    private static final SubLSymbol $sym112$HYPHENATED_NON_ATOMIC_TEN_SIGN_ = SubLObjectFactory.makeSymbol("HYPHENATED-NON-ATOMIC-TEN-SIGN?");
    private static final SubLSymbol $sym113$BUILD_HYPHENATED_NON_ATOMIC_TEN = SubLObjectFactory.makeSymbol("BUILD-HYPHENATED-NON-ATOMIC-TEN");
    private static final SubLSymbol $sym114$HYPHEN_SIGN_ = SubLObjectFactory.makeSymbol("HYPHEN-SIGN?");
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$DECI_SIGN_ = SubLObjectFactory.makeSymbol("DECI-SIGN?");
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$BUILD_NON_ATOMIC_TEN = SubLObjectFactory.makeSymbol("BUILD-NON-ATOMIC-TEN");
    private static final SubLSymbol $sym119$NON_ATOMIC_TEN_SIGN_ = SubLObjectFactory.makeSymbol("NON-ATOMIC-TEN-SIGN?");
    private static final SubLSymbol $sym120$BUILD_CENT = SubLObjectFactory.makeSymbol("BUILD-CENT");
    private static final SubLSymbol $sym121$AND_LITERAL_ = SubLObjectFactory.makeSymbol("AND-LITERAL?");
    private static final SubLSymbol $sym122$INDEFINITE_SIGN_ = SubLObjectFactory.makeSymbol("INDEFINITE-SIGN?");
    private static final SubLSymbol $sym123$HUNDRED_LITERAL_ = SubLObjectFactory.makeSymbol("HUNDRED-LITERAL?");
    private static final SubLSymbol $sym124$CENT_SIGN_ = SubLObjectFactory.makeSymbol("CENT-SIGN?");
    private static final SubLSymbol $sym125$SIGN_P = SubLObjectFactory.makeSymbol("SIGN-P");
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLList $list128;
    private static final SubLSymbol $sym129$FRACTION_SIGN_ = SubLObjectFactory.makeSymbol("FRACTION-SIGN?");
    private static final SubLSymbol $sym130$BUILD_STANDARD_HUNDRED = SubLObjectFactory.makeSymbol("BUILD-STANDARD-HUNDRED");
    private static final SubLObject $const131$AFew_Quant = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AFew-Quant"));
    private static final SubLSymbol $sym132$FEW_LITERAL_ = SubLObjectFactory.makeSymbol("FEW-LITERAL?");
    private static final SubLSymbol $sym133$BUILD_A_FEW = SubLObjectFactory.makeSymbol("BUILD-A-FEW");
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$BUILD_EXTENDED_HUNDRED = SubLObjectFactory.makeSymbol("BUILD-EXTENDED-HUNDRED");
    private static final SubLSymbol $sym136$DOZEN_LITERAL_ = SubLObjectFactory.makeSymbol("DOZEN-LITERAL?");
    private static final SubLSymbol $sym137$BUILD_STANDARD_DOZEN = SubLObjectFactory.makeSymbol("BUILD-STANDARD-DOZEN");
    private static final SubLSymbol $sym138$BUILD_EXTENDED_DOZEN = SubLObjectFactory.makeSymbol("BUILD-EXTENDED-DOZEN");
    private static final SubLSymbol $sym139$STANDARD_HUNDRED_SIGN_ = SubLObjectFactory.makeSymbol("STANDARD-HUNDRED-SIGN?");
    private static final SubLSymbol $sym140$EXTENDED_HUNDRED_SIGN_ = SubLObjectFactory.makeSymbol("EXTENDED-HUNDRED-SIGN?");
    private static final SubLSymbol $sym141$FLOAT_SIGN_ = SubLObjectFactory.makeSymbol("FLOAT-SIGN?");
    private static final SubLSymbol $sym142$BUILD_KILO = SubLObjectFactory.makeSymbol("BUILD-KILO");
    private static final SubLInteger $int143$1000 = SubLObjectFactory.makeInteger(1000);
    private static final SubLSymbol $sym144$KILO_SIGN_ = SubLObjectFactory.makeSymbol("KILO-SIGN?");
    private static final SubLSymbol $sym145$THOUSAND_LITERAL_ = SubLObjectFactory.makeSymbol("THOUSAND-LITERAL?");
    private static final SubLSymbol $sym146$BUILD_THOUSAND = SubLObjectFactory.makeSymbol("BUILD-THOUSAND");
    private static final SubLSymbol $sym147$THOUSAND_SIGN_ = SubLObjectFactory.makeSymbol("THOUSAND-SIGN?");
    private static final SubLSymbol $sym148$BUILD_MILLI = SubLObjectFactory.makeSymbol("BUILD-MILLI");
    private static final SubLInteger $int149$1000000 = SubLObjectFactory.makeInteger(0xf4240);
    private static final SubLSymbol $sym150$MILLI_SIGN_ = SubLObjectFactory.makeSymbol("MILLI-SIGN?");
    private static final SubLSymbol $sym151$MILLION_LITERAL_ = SubLObjectFactory.makeSymbol("MILLION-LITERAL?");
    private static final SubLSymbol $sym152$BUILD_MILLION = SubLObjectFactory.makeSymbol("BUILD-MILLION");
    private static final SubLSymbol $sym153$MILLION_SIGN_ = SubLObjectFactory.makeSymbol("MILLION-SIGN?");
    private static final SubLSymbol $sym154$BUILD_BILLI = SubLObjectFactory.makeSymbol("BUILD-BILLI");
    private static final SubLInteger $int155$1000000000 = SubLObjectFactory.makeInteger(0x3b9aca00);
    private static final SubLSymbol $sym156$BILLI_SIGN_ = SubLObjectFactory.makeSymbol("BILLI-SIGN?");
    private static final SubLSymbol $sym157$BILLION_LITERAL_ = SubLObjectFactory.makeSymbol("BILLION-LITERAL?");
    private static final SubLSymbol $sym158$BUILD_BILLION = SubLObjectFactory.makeSymbol("BUILD-BILLION");
    private static final SubLSymbol $sym159$BILLION_SIGN_ = SubLObjectFactory.makeSymbol("BILLION-SIGN?");
    private static final SubLSymbol $sym160$BUILD_TRILLI = SubLObjectFactory.makeSymbol("BUILD-TRILLI");
    private static final SubLInteger $int161$1000000000000 = SubLObjectFactory.makeInteger("1000000000000");
    private static final SubLSymbol $sym162$TRILLI_SIGN_ = SubLObjectFactory.makeSymbol("TRILLI-SIGN?");
    private static final SubLSymbol $sym163$TRILLION_LITERAL_ = SubLObjectFactory.makeSymbol("TRILLION-LITERAL?");
    private static final SubLSymbol $sym164$BUILD_TRILLION = SubLObjectFactory.makeSymbol("BUILD-TRILLION");
    private static final SubLSymbol $sym165$TRILLION_SIGN_ = SubLObjectFactory.makeSymbol("TRILLION-SIGN?");
    private static final SubLSymbol $sym166$BUILD_INTEGER = SubLObjectFactory.makeSymbol("BUILD-INTEGER");
    private static final SubLSymbol $sym167$INTEGER_SIGN_ = SubLObjectFactory.makeSymbol("INTEGER-SIGN?");
    private static final SubLSymbol $sym168$STANDARD_DOZEN_SIGN_ = SubLObjectFactory.makeSymbol("STANDARD-DOZEN-SIGN?");
    private static final SubLSymbol $sym169$EXTENDED_DOZEN_SIGN_ = SubLObjectFactory.makeSymbol("EXTENDED-DOZEN-SIGN?");
    private static final SubLSymbol $sym170$BUILD_NUMBER = SubLObjectFactory.makeSymbol("BUILD-NUMBER");
    private static final SubLSymbol $sym171$NUMBER_SIGN_ = SubLObjectFactory.makeSymbol("NUMBER-SIGN?");
    private static final SubLSymbol $sym172$DENOMINATOR_SIGN_ = SubLObjectFactory.makeSymbol("DENOMINATOR-SIGN?");
    private static final SubLSymbol $sym173$BUILD_FRACTION = SubLObjectFactory.makeSymbol("BUILD-FRACTION");
    private static final SubLFloat $float174$0_5 = SubLObjectFactory.makeDouble(0.5D);
    private static final SubLSymbol $sym175$HALF_SIGN_ = SubLObjectFactory.makeSymbol("HALF-SIGN?");
    private static final SubLSymbol $sym176$BUILD_HALF = SubLObjectFactory.makeSymbol("BUILD-HALF");
    private static final SubLList $list177;
    private static final SubLSymbol $sym178$BUILD_FLOAT = SubLObjectFactory.makeSymbol("BUILD-FLOAT");
    private static final SubLSymbol $sym179$MINUS_LITERAL_ = SubLObjectFactory.makeSymbol("MINUS-LITERAL?");
    private static final SubLSymbol $sym180$BUILD_NEGATIVE_NUMBER = SubLObjectFactory.makeSymbol("BUILD-NEGATIVE-NUMBER");
    private static final SubLObject $const181$Unity = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Unity"));
    private static final SubLSymbol $sym182$NULL = SubLObjectFactory.makeSymbol("NULL");
    private static final SubLSymbol $sym183$SIGN_INFO = SubLObjectFactory.makeSymbol("SIGN-INFO");
    private static final SubLSymbol $sym184$_ = SubLObjectFactory.makeSymbol("<");
    private static final SubLList $list185;
    private static final SubLSymbol $sym186$FROM_LITERAL_ = SubLObjectFactory.makeSymbol("FROM-LITERAL?");
    private static final SubLSymbol $sym187$BETWEEN_LITERAL_ = SubLObjectFactory.makeSymbol("BETWEEN-LITERAL?");
    private static final SubLList $list188;
    private static final SubLSymbol $sym189$TO_LITERAL_ = SubLObjectFactory.makeSymbol("TO-LITERAL?");
    private static final SubLList $list190;
    private static final SubLList $list191;
    private static final SubLList $list192;
    private static final SubLSymbol $sym193$BUILD_PROPER_INTERVAL = SubLObjectFactory.makeSymbol("BUILD-PROPER-INTERVAL");
    private static final SubLSymbol $sym194$PROPER_INTERVAL_SIGN_ = SubLObjectFactory.makeSymbol("PROPER-INTERVAL-SIGN?");
    private static final SubLSymbol $sym195$BUILD_INTERVAL = SubLObjectFactory.makeSymbol("BUILD-INTERVAL");
    private static final SubLSymbol $sym196$SEQUENCEP = SubLObjectFactory.makeSymbol("SEQUENCEP");
    private static final SubLString $str197$_ = SubLObjectFactory.makeString("*");
    private static final SubLString $str198$_ = SubLObjectFactory.makeString("^");
    private static final SubLSymbol $sym199$MINUS_SIGN_ = SubLObjectFactory.makeSymbol("MINUS-SIGN?");
    private static final SubLSymbol $sym200$EXPT_OPERATOR_SIGN_ = SubLObjectFactory.makeSymbol("EXPT-OPERATOR-SIGN?");
    private static final SubLSymbol $sym201$BUILD_EXPONENTIATION_PHRASE = SubLObjectFactory.makeSymbol("BUILD-EXPONENTIATION-PHRASE");
    private static final SubLSymbol $sym202$MULT_SIGN_ = SubLObjectFactory.makeSymbol("MULT-SIGN?");
    private static final SubLSymbol $sym203$EXPONENTIATION_SIGN_ = SubLObjectFactory.makeSymbol("EXPONENTIATION-SIGN?");
    private static final SubLSymbol $sym204$BUILD_MULTIPLICATION_PHRASE = SubLObjectFactory.makeSymbol("BUILD-MULTIPLICATION-PHRASE");
    private static final SubLSymbol $sym205$LEX_NUMERALS = SubLObjectFactory.makeSymbol("LEX-NUMERALS");
    private static final SubLSymbol $sym206$STRING_TO_INTERVAL_CACHED = SubLObjectFactory.makeSymbol("STRING-TO-INTERVAL-CACHED");
    private static final SubLSymbol $sym207$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
    private static final SubLSymbol $kw208$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
    private static final SubLSymbol $sym209$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
    private static final SubLSymbol $sym210$_STRING_TO_INTERVAL_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*STRING-TO-INTERVAL-CACHED-CACHING-STATE*");
    private static final SubLInteger $int211$256 = SubLObjectFactory.makeInteger(256);
  //  static final boolean assertionsDisabledInClass = !com/cyc/cycjava/cycl/numeral_parser.desiredAssertionStatus();

    static 
    {
        $list0 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeString("zero"), ZERO_INTEGER));
        $list1 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeString("a"), ONE_INTEGER));
        $list2 = ConsesLow.list(new SubLObject[] {
            ConsesLow.cons(SubLObjectFactory.makeString("one"), ONE_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("two"), TWO_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("three"), THREE_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("four"), FOUR_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("five"), FIVE_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("six"), SIX_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("seven"), SEVEN_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("eight"), EIGHT_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("nine"), NINE_INTEGER)
        });
        $list3 = ConsesLow.list(new SubLObject[] {
            ConsesLow.cons(SubLObjectFactory.makeString("ten"), TEN_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("eleven"), ELEVEN_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("twelve"), TWELVE_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("thirteen"), THIRTEEN_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("fourteen"), FOURTEEN_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("fifteen"), FIFTEEN_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("sixteen"), SIXTEEN_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("seventeen"), SEVENTEEN_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("eighteen"), EIGHTEEN_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("nineteen"), NINETEEN_INTEGER)
        });
        $list5 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeString("twenty"), TWENTY_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("thirty"), SubLObjectFactory.makeInteger(30)), ConsesLow.cons(SubLObjectFactory.makeString("forty"), SubLObjectFactory.makeInteger(40)), ConsesLow.cons(SubLObjectFactory.makeString("fifty"), SubLObjectFactory.makeInteger(50)), ConsesLow.cons(SubLObjectFactory.makeString("sixty"), SubLObjectFactory.makeInteger(60)), ConsesLow.cons(SubLObjectFactory.makeString("seventy"), SubLObjectFactory.makeInteger(70)), ConsesLow.cons(SubLObjectFactory.makeString("eighty"), SubLObjectFactory.makeInteger(80)), ConsesLow.cons(SubLObjectFactory.makeString("ninety"), SubLObjectFactory.makeInteger(90)));
        $list6 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeString("dozen"), TWELVE_INTEGER));
        $list12 = ConsesLow.list(new SubLObject[] {
            ConsesLow.cons(SubLObjectFactory.makeString("first"), ONE_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("second"), TWO_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("half"), TWO_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("halves"), TWO_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("third"), THREE_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("quarter"), FOUR_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("fifth"), FIVE_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("eighth"), EIGHT_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("twelfth"), TWELVE_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("twelvth"), TWELVE_INTEGER), 
            ConsesLow.cons(SubLObjectFactory.makeString("twentieth"), TWENTY_INTEGER), ConsesLow.cons(SubLObjectFactory.makeString("thirtieth"), SubLObjectFactory.makeInteger(30)), ConsesLow.cons(SubLObjectFactory.makeString("fortieth"), SubLObjectFactory.makeInteger(40)), ConsesLow.cons(SubLObjectFactory.makeString("fiftieth"), SubLObjectFactory.makeInteger(50)), ConsesLow.cons(SubLObjectFactory.makeString("sixtieth"), SubLObjectFactory.makeInteger(60)), ConsesLow.cons(SubLObjectFactory.makeString("seventieth"), SubLObjectFactory.makeInteger(70)), ConsesLow.cons(SubLObjectFactory.makeString("eightieth"), SubLObjectFactory.makeInteger(80)), ConsesLow.cons(SubLObjectFactory.makeString("ninetieth"), SubLObjectFactory.makeInteger(90))
        });
        $list19 = ConsesLow.list(Characters.CHAR_hyphen);
        $list89 = ConsesLow.list(ONE_INTEGER);
        $list91 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("EMIT")), ONE_INTEGER);
        $list93 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("EMIT")), TWO_INTEGER);
        $list115 = ConsesLow.list(TWO_INTEGER);
        $list117 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("EMIT")), THREE_INTEGER);
        $list126 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("REMEMBER"), SubLObjectFactory.makeKeyword("BACKUP")), TWO_INTEGER);
        $list127 = ConsesLow.list(THREE_INTEGER, SubLObjectFactory.makeKeyword("END"), NIL, TWO_INTEGER);
        $list128 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("BACKUP")), FIVE_INTEGER);
        $list134 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("BACKUP")), TWO_INTEGER);
        $list177 = ConsesLow.list(THREE_INTEGER);
        $list185 = ConsesLow.list(FOUR_INTEGER);
        $list188 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("EMIT")), FIVE_INTEGER);
        $list190 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("EMIT")), FOUR_INTEGER);
        $list191 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("EMIT")), SIX_INTEGER);
        $list192 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("EMIT")), SEVEN_INTEGER);
    }
}
