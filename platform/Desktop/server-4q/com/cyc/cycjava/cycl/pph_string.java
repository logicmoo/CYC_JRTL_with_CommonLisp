package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_string extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_string";
    public static final String myFingerPrint = "5661bd411fab9aaf0b548258695e5a22862c139900a7cff4b1bb8d82347669bc";
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1508L)
    private static SubLSymbol $pph_string_from_utf8_string_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5798L)
    private static SubLSymbol $pph_space_vector$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5875L)
    private static SubLSymbol $pph_canonicalize_on_bungeP$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$START;
    private static final SubLSymbol $kw4$END;
    private static final SubLSymbol $kw5$CHAR_NUM;
    private static final SubLSymbol $kw6$DONE;
    private static final SubLSymbol $sym7$ITEM;
    private static final SubLSymbol $sym8$DO_SEQUENCE;
    private static final SubLSymbol $kw9$ELEMENT_NUM;
    private static final SubLSymbol $sym10$PCOND;
    private static final SubLSymbol $sym11$CAND;
    private static final SubLSymbol $sym12$INTEGERP;
    private static final SubLSymbol $sym13$_;
    private static final SubLSymbol $sym14$IGNORE;
    private static final SubLSymbol $sym15$__;
    private static final SubLSymbol $sym16$CLET;
    private static final SubLSymbol $sym17$FIF;
    private static final SubLSymbol $sym18$CHARACTERP;
    private static final SubLSymbol $sym19$PPH_CODE_CHAR;
    private static final SubLSymbol $sym20$PPH_STRING_FROM_UTF8_STRING;
    private static final SubLSymbol $sym21$_PPH_STRING_FROM_UTF8_STRING_CACHING_STATE_;
    private static final SubLInteger $int22$256;
    private static final SubLString $str23$_PPH_error_level_;
    private static final SubLString $str24$__;
    private static final SubLString $str25$Can_t_make_a_PPH_string_from__S;
    private static final SubLSymbol $sym26$PPH_CHAR_CODE;
    private static final SubLSymbol $sym27$STRINGP;
    private static final SubLObject $ic28;
    private static final SubLString $str29$;
    private static final SubLSymbol $sym30$NON_EMPTY_PPH_STRING_;
    private static final SubLSymbol $kw31$HTML;
    private static final SubLObject $ic32;
    private static final SubLInteger $int33$255;
    private static final SubLSymbol $sym34$PPH_STRING_P;
    private static final SubLSymbol $kw35$TEST;
    private static final SubLSymbol $kw36$OWNER;
    private static final SubLSymbol $kw37$CLASSES;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$KB;
    private static final SubLSymbol $kw40$TINY;
    private static final SubLSymbol $kw41$WORKING_;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$PPH_STRING_TO_OUTPUT_FORMAT;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$PPH_STRING_COPY;
    private static final SubLSymbol $sym47$PPH_STRING_EQUAL_;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$PPH_STRING_FIND_IF_;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$PPH_STRING_POSITION;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$PPH_STRING_DOWNCASE;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$PPH_STRING_FROM_CYCL_STRING;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$PPH_STRING_STARTS_WITH;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$PPH_STRING_ENDS_WITH;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$PPH_SUBSTRING_;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$PPH_SUBSTRING;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$_EXIT;
    private static final SubLSymbol $sym67$PPH_CANONICALIZING_BUNGE;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$PPH_NONCANONICALIZING_BUNGE;
    private static final SubLList $list70;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 922L)
    public static SubLObject do_pph_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_string.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_char = (SubLObject)pph_string.NIL;
        SubLObject string = (SubLObject)pph_string.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_string.$list0);
        v_char = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_string.$list0);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)pph_string.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)pph_string.NIL;
        SubLObject current_$1 = (SubLObject)pph_string.NIL;
        while (pph_string.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_string.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)pph_string.$list0);
            if (pph_string.NIL == conses_high.member(current_$1, (SubLObject)pph_string.$list1, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED)) {
                bad = (SubLObject)pph_string.T;
            }
            if (current_$1 == pph_string.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (pph_string.NIL != bad && pph_string.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_string.$list0);
        }
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)pph_string.$kw3$START, current);
        final SubLObject start = (SubLObject)((pph_string.NIL != start_tail) ? conses_high.cadr(start_tail) : pph_string.ZERO_INTEGER);
        final SubLObject end_tail = cdestructuring_bind.property_list_member((SubLObject)pph_string.$kw4$END, current);
        final SubLObject end = (SubLObject)((pph_string.NIL != end_tail) ? conses_high.cadr(end_tail) : pph_string.NIL);
        final SubLObject char_num_tail = cdestructuring_bind.property_list_member((SubLObject)pph_string.$kw5$CHAR_NUM, current);
        final SubLObject char_num = (SubLObject)((pph_string.NIL != char_num_tail) ? conses_high.cadr(char_num_tail) : pph_string.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)pph_string.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((pph_string.NIL != done_tail) ? conses_high.cadr(done_tail) : pph_string.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject item = (SubLObject)pph_string.$sym7$ITEM;
        return (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym8$DO_SEQUENCE, (SubLObject)ConsesLow.list(item, string, (SubLObject)pph_string.$kw9$ELEMENT_NUM, char_num, (SubLObject)pph_string.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym10$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_string.$sym11$CAND, (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym12$INTEGERP, char_num), (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym13$_, char_num, start)), (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym14$IGNORE, item)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_string.$sym11$CAND, (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym12$INTEGERP, end), (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym12$INTEGERP, char_num), (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym15$__, char_num, end)), (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym14$IGNORE, item)), (SubLObject)ConsesLow.list((SubLObject)pph_string.T, (SubLObject)ConsesLow.listS((SubLObject)pph_string.$sym16$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_char, (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym17$FIF, (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym18$CHARACTERP, item), item, (SubLObject)ConsesLow.list((SubLObject)pph_string.$sym19$PPH_CODE_CHAR, item)))), ConsesLow.append(body, (SubLObject)pph_string.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1402L)
    public static SubLObject pph_string_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_string.NIL != unicode_strings.ascii_string_p(obj) || pph_string.NIL != unicode_strings.unicode_vector_string_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1508L)
    public static SubLObject clear_pph_string_from_utf8_string() {
        final SubLObject cs = pph_string.$pph_string_from_utf8_string_caching_state$.getGlobalValue();
        if (pph_string.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_string.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1508L)
    public static SubLObject remove_pph_string_from_utf8_string(final SubLObject utf8_string) {
        return memoization_state.caching_state_remove_function_results_with_args(pph_string.$pph_string_from_utf8_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(utf8_string), (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1508L)
    public static SubLObject pph_string_from_utf8_string_internal(final SubLObject utf8_string) {
        return (pph_string.NIL != unicode_strings.non_ascii_string_p(utf8_string)) ? pph_string_from_cycl_string(unicode_nauts.utf8_string_to_cycl_safe_string(utf8_string)) : utf8_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1508L)
    public static SubLObject pph_string_from_utf8_string(final SubLObject utf8_string) {
        SubLObject caching_state = pph_string.$pph_string_from_utf8_string_caching_state$.getGlobalValue();
        if (pph_string.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_string.$sym20$PPH_STRING_FROM_UTF8_STRING, (SubLObject)pph_string.$sym21$_PPH_STRING_FROM_UTF8_STRING_CACHING_STATE_, (SubLObject)pph_string.$int22$256, (SubLObject)pph_string.EQUAL, (SubLObject)pph_string.ONE_INTEGER, (SubLObject)pph_string.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, utf8_string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_string_from_utf8_string_internal(utf8_string)));
            memoization_state.caching_state_put(caching_state, utf8_string, results, (SubLObject)pph_string.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1748L)
    public static SubLObject pph_string_from_unicode_naut(final SubLObject naut) {
        return unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(naut, (SubLObject)pph_string.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1853L)
    public static SubLObject pph_string_from_cycl_string(final SubLObject v_cycl_string) {
        if (v_cycl_string.isString()) {
            return v_cycl_string;
        }
        if (pph_string.NIL != unicode_nauts.unicode_naut_p(v_cycl_string, (SubLObject)pph_string.UNPROVIDED)) {
            return pph_string_from_unicode_naut(v_cycl_string);
        }
        final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_string.$str23$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_string.ONE_INTEGER), pph_string.$str24$__, format_nil.format_nil_a_no_copy((SubLObject)pph_string.$str25$Can_t_make_a_PPH_string_from__S) });
        pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(v_cycl_string));
        return (SubLObject)pph_string.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 2129L)
    public static SubLObject pph_string_starts_with(final SubLObject string, final SubLObject start, SubLObject test) {
        if (test == pph_string.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)pph_string.EQUAL);
        }
        if (string.isString()) {
            return string_utilities.starts_with_by_test(string, start, test);
        }
        return string_utilities.starts_with_by_test(unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(string, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED)), start, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 2409L)
    public static SubLObject pph_string_ends_with(final SubLObject string, final SubLObject end, SubLObject test) {
        if (test == pph_string.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)pph_string.EQUAL);
        }
        if (string.isString()) {
            return string_utilities.ends_with(string, end, test);
        }
        return string_utilities.ends_with(unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(string, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED)), end, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 2661L)
    public static SubLObject pph_string_pre_remove(final SubLObject string, final SubLObject start, SubLObject test) {
        if (test == pph_string.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)pph_string.EQUAL);
        }
        if (pph_string.NIL != pph_string_starts_with(string, start, test)) {
            return Sequences.subseq(string, Sequences.length(start), (SubLObject)pph_string.UNPROVIDED);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 2859L)
    public static SubLObject pph_string_copy(final SubLObject string) {
        return Sequences.copy_seq(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 2927L)
    public static SubLObject pph_char_downcase(final SubLObject v_char) {
        if (v_char.isChar()) {
            return Characters.char_downcase(v_char);
        }
        if (pph_string.NIL != unicode_strings.ascii_char_p(pph_code_char(v_char))) {
            return Characters.char_code(Characters.char_downcase(pph_code_char(v_char)));
        }
        return v_char;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 3151L)
    public static SubLObject pph_string_ndowncase_leading(final SubLObject string) {
        Vectors.set_aref(string, (SubLObject)pph_string.ZERO_INTEGER, pph_char_downcase(Vectors.aref(string, (SubLObject)pph_string.ZERO_INTEGER)));
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 3283L)
    public static SubLObject pph_string_starts_with_one_of(final SubLObject string, final SubLObject starts) {
        if (string.isString()) {
            return string_utilities.starts_with_one_of(string, starts);
        }
        SubLObject cdolist_list_var = starts;
        SubLObject start = (SubLObject)pph_string.NIL;
        start = cdolist_list_var.first();
        while (pph_string.NIL != cdolist_list_var) {
            if (pph_string.NIL != pph_string_starts_with(string, start, Symbols.symbol_function((SubLObject)pph_string.EQUAL))) {
                return (SubLObject)pph_string.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            start = cdolist_list_var.first();
        }
        return (SubLObject)pph_string.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 3620L)
    public static SubLObject pph_string_equalP(final SubLObject string1, final SubLObject string2) {
        if (string1.isString() && string2.isString()) {
            return Equality.equal(string1, string2);
        }
        return Equality.equalp(pph_string_canonicalize(string1), pph_string_canonicalize(string2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 3855L)
    public static SubLObject pph_string_concatenate(final SubLObject string1, final SubLObject string2) {
        if (string1.isString() && string2.isString()) {
            return Sequences.cconcatenate(string1, string2);
        }
        if (pph_string.NIL != list_utilities.lengthE(string1, (SubLObject)pph_string.ZERO_INTEGER, (SubLObject)pph_string.UNPROVIDED)) {
            return string2;
        }
        if (pph_string.NIL != list_utilities.lengthE(string2, (SubLObject)pph_string.ZERO_INTEGER, (SubLObject)pph_string.UNPROVIDED)) {
            return string1;
        }
        return Sequences.cconcatenate(pph_string_canonicalize(string1), pph_string_canonicalize(string2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 4198L)
    public static SubLObject pph_string_tokenize(final SubLObject v_pph_string, SubLObject break_list) {
        if (break_list == pph_string.UNPROVIDED) {
            break_list = string_utilities.whitespace_chars();
        }
        if (v_pph_string.isString()) {
            return string_utilities.string_tokenize(v_pph_string, break_list, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED);
        }
        SubLObject token_stack = (SubLObject)pph_string.NIL;
        SubLObject current_string_char_stack = (SubLObject)pph_string.NIL;
        for (SubLObject sequence_var = v_pph_string, end_index = (SubLObject)(sequence_var.isList() ? pph_string.NIL : Sequences.length(sequence_var)), ignore_me = (SubLObject)pph_string.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(ignore_me, end_index, sequence_var); pph_string.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(ignore_me, end_index, sequence_var)) {
            final SubLObject item = subl_macros.do_sequence_index_valueP(ignore_me, sequence_var);
            if (!ignore_me.isInteger() || !ignore_me.numL((SubLObject)pph_string.ZERO_INTEGER)) {
                if (!pph_string.NIL.isInteger() || !ignore_me.isInteger() || !ignore_me.numGE((SubLObject)pph_string.NIL)) {
                    final SubLObject v_char = item.isChar() ? item : pph_code_char(item);
                    if (pph_string.NIL != subl_promotions.memberP(v_char, break_list, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED)) {
                        if (pph_string.NIL != list_utilities.non_empty_list_p(current_string_char_stack)) {
                            token_stack = (SubLObject)ConsesLow.cons(pph_string_from_char_list(Sequences.nreverse(current_string_char_stack)), token_stack);
                            current_string_char_stack = (SubLObject)pph_string.NIL;
                        }
                    }
                    else {
                        current_string_char_stack = (SubLObject)ConsesLow.cons(v_char, current_string_char_stack);
                    }
                }
            }
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            ignore_me = Numbers.add(ignore_me, (SubLObject)pph_string.ONE_INTEGER);
        }
        if (pph_string.NIL != list_utilities.non_empty_list_p(current_string_char_stack)) {
            token_stack = (SubLObject)ConsesLow.cons(pph_string_from_char_list(Sequences.nreverse(current_string_char_stack)), token_stack);
        }
        return Sequences.nreverse(token_stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 4973L)
    public static SubLObject pph_string_from_char_list(final SubLObject chars) {
        if (pph_string.NIL != list_utilities.find_if_not((SubLObject)pph_string.$sym18$CHARACTERP, chars, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED)) {
            return list_utilities.list2vector(Mapping.mapcar((SubLObject)pph_string.$sym26$PPH_CHAR_CODE, chars));
        }
        return unicode_strings.string_from_char_list(chars, (SubLObject)pph_string.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5171L)
    public static SubLObject preds_of_pph_string(final SubLObject string, SubLObject misspellings) {
        if (misspellings == pph_string.UNPROVIDED) {
            misspellings = (SubLObject)pph_string.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (string.isString()) {
            return lexicon_utilities.preds_of_string(string, misspellings, pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_string.UNPROVIDED);
        }
        return (SubLObject)pph_string.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5450L)
    public static SubLObject pph_string_last_char(final SubLObject string) {
        if (string.isString()) {
            return string_utilities.last_char(string);
        }
        return pph_string_char_from_end(string, (SubLObject)pph_string.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5610L)
    public static SubLObject pph_string_char_from_end(final SubLObject string, final SubLObject i) {
        if (string.isString()) {
            return string_utilities.char_from_end(string, i);
        }
        return pph_string_char(string, Numbers.subtract(Sequences.length(string), number_utilities.f_1X(i)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5932L)
    public static SubLObject pph_bunge(final SubLObject strings_to_bunge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_string.NIL == pph_string.$pph_canonicalize_on_bungeP$.getDynamicValue(thread) && pph_string.NIL != list_utilities.list_of_type_p((SubLObject)pph_string.$sym27$STRINGP, strings_to_bunge)) {
            return string_utilities.bunge(strings_to_bunge, (SubLObject)pph_string.UNPROVIDED);
        }
        if (pph_string.NIL != list_utilities.empty_list_p(strings_to_bunge)) {
            return (SubLObject)((pph_string.NIL != pph_string.$pph_canonicalize_on_bungeP$.getDynamicValue(thread)) ? pph_string.$ic28 : pph_string.$str29$);
        }
        if (pph_string.NIL != list_utilities.find_if_not((SubLObject)pph_string.$sym30$NON_EMPTY_PPH_STRING_, strings_to_bunge, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED)) {
            return pph_bunge(list_utilities.remove_if_not((SubLObject)pph_string.$sym30$NON_EMPTY_PPH_STRING_, strings_to_bunge, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED));
        }
        final SubLObject first_string = strings_to_bunge.first();
        SubLObject ans = pph_string_canonicalize(first_string);
        SubLObject cdolist_list_var = strings_to_bunge.rest();
        SubLObject string = (SubLObject)pph_string.NIL;
        string = cdolist_list_var.first();
        while (pph_string.NIL != cdolist_list_var) {
            ans = Sequences.cconcatenate(ans, new SubLObject[] { pph_string.$pph_space_vector$.getGlobalValue(), pph_string_canonicalize(string) });
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 6602L)
    public static SubLObject pph_string_find_if(final SubLObject test, final SubLObject string) {
        if (string.isString()) {
            return Sequences.find_if(test, string, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED);
        }
        final SubLObject backwardP_var = (SubLObject)pph_string.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject code;
        SubLObject v_char;
        for (length = Sequences.length(string), v_iteration = (SubLObject)pph_string.NIL, v_iteration = (SubLObject)pph_string.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_string.ONE_INTEGER)) {
            element_num = ((pph_string.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_string.ONE_INTEGER) : v_iteration);
            code = Vectors.aref(string, element_num);
            v_char = Characters.code_char(code);
            if (pph_string.NIL != v_char && pph_string.NIL != Functions.funcall(test, v_char)) {
                return v_char;
            }
        }
        return (SubLObject)pph_string.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 6865L)
    public static SubLObject pph_string_position(final SubLObject v_char, final SubLObject string, SubLObject test, SubLObject key, SubLObject start, SubLObject end) {
        if (test == pph_string.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)pph_string.EQL);
        }
        if (key == pph_string.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)pph_string.IDENTITY);
        }
        if (start == pph_string.UNPROVIDED) {
            start = (SubLObject)pph_string.ZERO_INTEGER;
        }
        if (end == pph_string.UNPROVIDED) {
            end = (SubLObject)pph_string.NIL;
        }
        if (string.isString()) {
            return Sequences.position(v_char, string, test, key, start, end);
        }
        return Sequences.position(pph_char_code(v_char), string, test, key, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 7132L)
    public static SubLObject pph_string_char(final SubLObject string, final SubLObject i) {
        if (string.isString()) {
            return Strings.sublisp_char(string, i);
        }
        return pph_code_char(Vectors.aref(string, i));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 7286L)
    public static SubLObject pph_char_E(final SubLObject char1, final SubLObject char2) {
        if (char1.isChar() && char2.isChar()) {
            return Characters.charE(char1, char2);
        }
        return Equality.eql(pph_char_code(char1), pph_char_code(char2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 7488L)
    public static SubLObject pph_set_nth_char(final SubLObject n, final SubLObject string, final SubLObject new_char, SubLObject safeP) {
        if (safeP == pph_string.UNPROVIDED) {
            safeP = (SubLObject)pph_string.NIL;
        }
        if (string.isString() && new_char.isChar()) {
            return string_utilities.set_nth_char(n, string, new_char, safeP);
        }
        if (pph_string.NIL == safeP || pph_string.NIL != list_utilities.lengthG(string, n, (SubLObject)pph_string.UNPROVIDED)) {
            Vectors.set_aref(string, n, pph_char_code(new_char));
            return string;
        }
        return (SubLObject)pph_string.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 7785L)
    public static SubLObject pph_substringP(final SubLObject little, final SubLObject big, SubLObject test, SubLObject start, SubLObject end) {
        if (test == pph_string.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)pph_string.EQUAL);
        }
        if (start == pph_string.UNPROVIDED) {
            start = (SubLObject)pph_string.ZERO_INTEGER;
        }
        if (end == pph_string.UNPROVIDED) {
            end = (SubLObject)pph_string.NIL;
        }
        if (little.isString() && big.isString()) {
            return list_utilities.sublisp_boolean(string_utilities.substringP(little, big, test, start, end));
        }
        if (pph_string.NIL != list_utilities.greater_or_same_length_p(big, little)) {
            return list_utilities.sublisp_boolean(Sequences.search(pph_string_canonicalize(little), pph_string_canonicalize(big), Symbols.symbol_function((SubLObject)pph_string.EQUALP), Symbols.symbol_function((SubLObject)pph_string.IDENTITY), (SubLObject)pph_string.ZERO_INTEGER, (SubLObject)pph_string.NIL, start, end));
        }
        return (SubLObject)pph_string.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 8181L)
    public static SubLObject pph_substring(final SubLObject string, final SubLObject start, SubLObject end) {
        if (end == pph_string.UNPROVIDED) {
            end = (SubLObject)pph_string.NIL;
        }
        if (string.isString()) {
            return string_utilities.substring(string, start, end);
        }
        return Sequences.subseq(string, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 8351L)
    public static SubLObject pph_string_to_display(final SubLObject string) {
        if (string.isString()) {
            return string;
        }
        return unicode_strings.unicode_vector_to_display(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 8496L)
    public static SubLObject pph_string_if_non_null_to_output_format(final SubLObject string, SubLObject mode) {
        if (mode == pph_string.UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        return (pph_string.NIL == string) ? string : pph_string_to_output_format(string, mode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 8678L)
    public static SubLObject pph_string_to_cycl(final SubLObject string) {
        if (string.isString()) {
            return string;
        }
        if (pph_string.NIL != unicode_strings.unicode_vector_is_ascii_string_p(string, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED)) {
            return unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(string, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED));
        }
        return unicode_nauts.make_unicode_naut(unicode_strings.unicode_vector_to_display(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 9066L)
    public static SubLObject pph_string_to_output_format(final SubLObject string, SubLObject mode) {
        if (mode == pph_string.UNPROVIDED) {
            mode = pph_vars.$paraphrase_mode$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_string.NIL != unicode_strings.ascii_string_p(string)) {
            return string;
        }
        if (mode == pph_string.$kw31$HTML || pph_string.NIL != unicode_strings.unicode_vector_is_ascii_string_p(string, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED)) {
            return pph_string_to_html_escaped(string, (SubLObject)pph_string.UNPROVIDED);
        }
        if (pph_string.NIL != pph_vars.$allow_utf8_in_pph_text_mode$.getDynamicValue(thread)) {
            return pph_string_to_utf8(string);
        }
        if (string.isString()) {
            return unicode_nauts.utf8_string_to_cycl_safe_string(string);
        }
        return unicode_nauts.make_unicode_naut(unicode_strings.unicode_vector_to_display(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 9703L)
    public static SubLObject pph_string_if_non_null_to_html_escaped(final SubLObject string) {
        return (pph_string.NIL == string) ? string : pph_string_to_html_escaped(string, (SubLObject)pph_string.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 9839L)
    public static SubLObject pph_string_to_html_escaped(final SubLObject string, SubLObject escape_reserved_charsP) {
        if (escape_reserved_charsP == pph_string.UNPROVIDED) {
            escape_reserved_charsP = (SubLObject)pph_string.NIL;
        }
        if (pph_string.NIL != unicode_strings.ascii_string_p(string)) {
            return string;
        }
        if (string.isString()) {
            return unicode_strings.unicode_to_html_escaped(unicode_strings.utf8_string_to_unicode_vector(unicode_strings.html_escaped_to_utf8_string(string)), (SubLObject)pph_string.UNPROVIDED);
        }
        return unicode_strings.unicode_to_html_escaped(string, escape_reserved_charsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 10278L)
    public static SubLObject pph_string_if_non_null_to_utf8(final SubLObject string) {
        return (pph_string.NIL == string) ? string : pph_string_to_utf8(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 10398L)
    public static SubLObject pph_string_to_utf8(final SubLObject string) {
        if (string.isString()) {
            return string;
        }
        return unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(string, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 10634L)
    public static SubLObject non_empty_pph_stringP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_string.NIL != pph_string_p(obj) && pph_string.NIL != list_utilities.lengthG(obj, (SubLObject)pph_string.ZERO_INTEGER, (SubLObject)pph_string.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 10735L)
    public static SubLObject pph_string_canonicalize(final SubLObject string) {
        return string.isString() ? unicode_strings.utf8_string_to_unicode_vector(string) : string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 10862L)
    public static SubLObject pph_nupcase_nth(final SubLObject string, final SubLObject n, SubLObject safeP) {
        if (safeP == pph_string.UNPROVIDED) {
            safeP = (SubLObject)pph_string.T;
        }
        if (string.isString()) {
            return string_utilities.nupcase_nth(string, n, safeP);
        }
        if (pph_string.NIL == safeP || pph_string.NIL != list_utilities.lengthG(string, n, (SubLObject)pph_string.UNPROVIDED)) {
            final SubLObject v_char = pph_code_char(Vectors.aref(string, n));
            if (v_char.isChar()) {
                Vectors.set_aref(string, n, Characters.char_code(Characters.char_upcase(v_char)));
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 11193L)
    public static SubLObject pph_string_downcase(final SubLObject string) {
        if (string.isString()) {
            return Strings.string_downcase(string, (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED);
        }
        final SubLObject ans = vector_utilities.copy_vector(string);
        for (SubLObject sequence_var = string, end_index = (SubLObject)(sequence_var.isList() ? pph_string.NIL : Sequences.length(sequence_var)), i = (SubLObject)pph_string.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(i, end_index, sequence_var); pph_string.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(i, end_index, sequence_var)) {
            final SubLObject code = subl_macros.do_sequence_index_valueP(i, sequence_var);
            final SubLObject downcased = pph_char_downcase(pph_code_char(code));
            Vectors.set_aref(ans, i, downcased.isChar() ? Characters.char_code(downcased) : downcased);
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            i = Numbers.add(i, (SubLObject)pph_string.ONE_INTEGER);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 11580L)
    public static SubLObject pph_remove_substring(final SubLObject big, final SubLObject little) {
        if (big.isString() && little.isString()) {
            return string_utilities.remove_substring(big, little);
        }
        return vector_utilities.vector_nreplace_subsequence(pph_string.$ic32, pph_string_canonicalize(little), pph_string_canonicalize(big), (SubLObject)pph_string.UNPROVIDED, (SubLObject)pph_string.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 11848L)
    public static SubLObject pph_code_char(final SubLObject code) {
        return code.numLE((SubLObject)pph_string.$int33$255) ? Characters.code_char(code) : get_pph_code_char(code);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12056L)
    public static SubLObject pph_char_code(final SubLObject v_char) {
        return v_char.isChar() ? Characters.char_code(v_char) : get_pph_char_code(v_char);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12181L)
    public static SubLObject get_pph_code_char(final SubLObject code) {
        return code;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12304L)
    public static SubLObject get_pph_char_code(final SubLObject v_char) {
        return v_char;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12427L)
    public static SubLObject pph_string_find_ifP(final SubLObject test, final SubLObject string) {
        return list_utilities.sublisp_boolean(pph_string_find_if(test, string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12427L)
    public static SubLObject pph_canonicalizing_bunge(final SubLObject strings_to_bunge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_string.$pph_canonicalize_on_bungeP$.currentBinding(thread);
        try {
            pph_string.$pph_canonicalize_on_bungeP$.bind((SubLObject)pph_string.T, thread);
            return pph_bunge(strings_to_bunge);
        }
        finally {
            pph_string.$pph_canonicalize_on_bungeP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12427L)
    public static SubLObject pph_noncanonicalizing_bunge(final SubLObject strings_to_bunge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_string.$pph_canonicalize_on_bungeP$.currentBinding(thread);
        try {
            pph_string.$pph_canonicalize_on_bungeP$.bind((SubLObject)pph_string.NIL, thread);
            return pph_bunge(strings_to_bunge);
        }
        finally {
            pph_string.$pph_canonicalize_on_bungeP$.rebind(_prev_bind_0, thread);
        }
    }
    
    public static SubLObject declare_pph_string_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_string", "do_pph_string", "DO-PPH-STRING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_p", "PPH-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "clear_pph_string_from_utf8_string", "CLEAR-PPH-STRING-FROM-UTF8-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "remove_pph_string_from_utf8_string", "REMOVE-PPH-STRING-FROM-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_from_utf8_string_internal", "PPH-STRING-FROM-UTF8-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_from_utf8_string", "PPH-STRING-FROM-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_from_unicode_naut", "PPH-STRING-FROM-UNICODE-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_from_cycl_string", "PPH-STRING-FROM-CYCL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_starts_with", "PPH-STRING-STARTS-WITH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_ends_with", "PPH-STRING-ENDS-WITH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_pre_remove", "PPH-STRING-PRE-REMOVE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_copy", "PPH-STRING-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_char_downcase", "PPH-CHAR-DOWNCASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_ndowncase_leading", "PPH-STRING-NDOWNCASE-LEADING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_starts_with_one_of", "PPH-STRING-STARTS-WITH-ONE-OF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_equalP", "PPH-STRING-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_concatenate", "PPH-STRING-CONCATENATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_tokenize", "PPH-STRING-TOKENIZE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_from_char_list", "PPH-STRING-FROM-CHAR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "preds_of_pph_string", "PREDS-OF-PPH-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_last_char", "PPH-STRING-LAST-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_char_from_end", "PPH-STRING-CHAR-FROM-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_bunge", "PPH-BUNGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_find_if", "PPH-STRING-FIND-IF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_position", "PPH-STRING-POSITION", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_char", "PPH-STRING-CHAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_char_E", "PPH-CHAR-=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_set_nth_char", "PPH-SET-NTH-CHAR", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_substringP", "PPH-SUBSTRING?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_substring", "PPH-SUBSTRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_to_display", "PPH-STRING-TO-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_if_non_null_to_output_format", "PPH-STRING-IF-NON-NULL-TO-OUTPUT-FORMAT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_to_cycl", "PPH-STRING-TO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_to_output_format", "PPH-STRING-TO-OUTPUT-FORMAT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_if_non_null_to_html_escaped", "PPH-STRING-IF-NON-NULL-TO-HTML-ESCAPED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_to_html_escaped", "PPH-STRING-TO-HTML-ESCAPED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_if_non_null_to_utf8", "PPH-STRING-IF-NON-NULL-TO-UTF8", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_to_utf8", "PPH-STRING-TO-UTF8", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "non_empty_pph_stringP", "NON-EMPTY-PPH-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_canonicalize", "PPH-STRING-CANONICALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_nupcase_nth", "PPH-NUPCASE-NTH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_downcase", "PPH-STRING-DOWNCASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_remove_substring", "PPH-REMOVE-SUBSTRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_code_char", "PPH-CODE-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_char_code", "PPH-CHAR-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "get_pph_code_char", "GET-PPH-CODE-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "get_pph_char_code", "GET-PPH-CHAR-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_string_find_ifP", "PPH-STRING-FIND-IF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_canonicalizing_bunge", "PPH-CANONICALIZING-BUNGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string", "pph_noncanonicalizing_bunge", "PPH-NONCANONICALIZING-BUNGE", 1, 0, false);
        return (SubLObject)pph_string.NIL;
    }
    
    public static SubLObject init_pph_string_file() {
        pph_string.$pph_string_from_utf8_string_caching_state$ = SubLFiles.deflexical("*PPH-STRING-FROM-UTF8-STRING-CACHING-STATE*", (SubLObject)pph_string.NIL);
        pph_string.$pph_space_vector$ = SubLFiles.deflexical("*PPH-SPACE-VECTOR*", Vectors.make_vector((SubLObject)pph_string.ONE_INTEGER, Characters.char_code((SubLObject)Characters.CHAR_space)));
        pph_string.$pph_canonicalize_on_bungeP$ = SubLFiles.defparameter("*PPH-CANONICALIZE-ON-BUNGE?*", (SubLObject)pph_string.NIL);
        return (SubLObject)pph_string.NIL;
    }
    
    public static SubLObject setup_pph_string_file() {
        memoization_state.note_globally_cached_function((SubLObject)pph_string.$sym20$PPH_STRING_FROM_UTF8_STRING);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym34$PPH_STRING_P, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, pph_string.NIL, pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list42);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym30$NON_EMPTY_PPH_STRING_, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, pph_string.NIL, pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list43);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym44$PPH_STRING_TO_OUTPUT_FORMAT, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, Symbols.symbol_function((SubLObject)pph_string.EQUAL), pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list45);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym46$PPH_STRING_COPY, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, Symbols.symbol_function((SubLObject)pph_string.$sym47$PPH_STRING_EQUAL_), pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list48);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym49$PPH_STRING_FIND_IF_, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, pph_string.NIL, pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list50);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym51$PPH_STRING_POSITION, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, pph_string.NIL, pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list52);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym47$PPH_STRING_EQUAL_, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, pph_string.NIL, pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list53);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym54$PPH_STRING_DOWNCASE, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, Symbols.symbol_function((SubLObject)pph_string.$sym47$PPH_STRING_EQUAL_), pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list55);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym56$PPH_STRING_FROM_CYCL_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, Symbols.symbol_function((SubLObject)pph_string.$sym47$PPH_STRING_EQUAL_), pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list57);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym58$PPH_STRING_STARTS_WITH, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, pph_string.NIL, pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list59);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym60$PPH_STRING_ENDS_WITH, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, pph_string.NIL, pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list61);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym62$PPH_SUBSTRING_, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, pph_string.NIL, pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list63);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym64$PPH_SUBSTRING, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, Symbols.symbol_function((SubLObject)pph_string.$sym47$PPH_STRING_EQUAL_), pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list65);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym67$PPH_CANONICALIZING_BUNGE, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, Symbols.symbol_function((SubLObject)pph_string.EQUALP), pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list68);
        generic_testing.define_test_case_table_int((SubLObject)pph_string.$sym69$PPH_NONCANONICALIZING_BUNGE, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string.$kw35$TEST, Symbols.symbol_function((SubLObject)pph_string.EQUALP), pph_string.$kw36$OWNER, pph_string.NIL, pph_string.$kw37$CLASSES, pph_string.$list38, pph_string.$kw39$KB, pph_string.$kw40$TINY, pph_string.$kw41$WORKING_, pph_string.T }), (SubLObject)pph_string.$list70);
        return (SubLObject)pph_string.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_string_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_string_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_string_file();
    }
    
    static {
        me = (SubLFile)new pph_string();
        pph_string.$pph_string_from_utf8_string_caching_state$ = null;
        pph_string.$pph_space_vector$ = null;
        pph_string.$pph_canonicalize_on_bungeP$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHAR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)pph_string.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("CHAR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$START = SubLObjectFactory.makeKeyword("START");
        $kw4$END = SubLObjectFactory.makeKeyword("END");
        $kw5$CHAR_NUM = SubLObjectFactory.makeKeyword("CHAR-NUM");
        $kw6$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym7$ITEM = SubLObjectFactory.makeUninternedSymbol("ITEM");
        $sym8$DO_SEQUENCE = SubLObjectFactory.makeSymbol("DO-SEQUENCE");
        $kw9$ELEMENT_NUM = SubLObjectFactory.makeKeyword("ELEMENT-NUM");
        $sym10$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym11$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym12$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym13$_ = SubLObjectFactory.makeSymbol("<");
        $sym14$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym15$__ = SubLObjectFactory.makeSymbol(">=");
        $sym16$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym17$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym18$CHARACTERP = SubLObjectFactory.makeSymbol("CHARACTERP");
        $sym19$PPH_CODE_CHAR = SubLObjectFactory.makeSymbol("PPH-CODE-CHAR");
        $sym20$PPH_STRING_FROM_UTF8_STRING = SubLObjectFactory.makeSymbol("PPH-STRING-FROM-UTF8-STRING");
        $sym21$_PPH_STRING_FROM_UTF8_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PPH-STRING-FROM-UTF8-STRING-CACHING-STATE*");
        $int22$256 = SubLObjectFactory.makeInteger(256);
        $str23$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str24$__ = SubLObjectFactory.makeString(") ");
        $str25$Can_t_make_a_PPH_string_from__S = SubLObjectFactory.makeString("Can't make a PPH string from ~S");
        $sym26$PPH_CHAR_CODE = SubLObjectFactory.makeSymbol("PPH-CHAR-CODE");
        $sym27$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $ic28 = Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY);
        $str29$ = SubLObjectFactory.makeString("");
        $sym30$NON_EMPTY_PPH_STRING_ = SubLObjectFactory.makeSymbol("NON-EMPTY-PPH-STRING?");
        $kw31$HTML = SubLObjectFactory.makeKeyword("HTML");
        $ic32 = Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY);
        $int33$255 = SubLObjectFactory.makeInteger(255);
        $sym34$PPH_STRING_P = SubLObjectFactory.makeSymbol("PPH-STRING-P");
        $kw35$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw36$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw37$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-TEST-CASE-TABLES"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-STRING-TEST-CASE-TABLES"));
        $kw39$KB = SubLObjectFactory.makeKeyword("KB");
        $kw40$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw41$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) })), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u806F;&u90A6;&u5FEB;&u905E;"))), (SubLObject)pph_string.NIL));
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)pph_string.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) })), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u806F;&u90A6;&u5FEB;&u905E;"))), (SubLObject)pph_string.NIL));
        $sym44$PPH_STRING_TO_OUTPUT_FORMAT = SubLObjectFactory.makeSymbol("PPH-STRING-TO-OUTPUT-FORMAT");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) }), (SubLObject)SubLObjectFactory.makeKeyword("TEXT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u806F;&u90A6;&u5FEB;&u905E;"))));
        $sym46$PPH_STRING_COPY = SubLObjectFactory.makeSymbol("PPH-STRING-COPY");
        $sym47$PPH_STRING_EQUAL_ = SubLObjectFactory.makeSymbol("PPH-STRING-EQUAL?");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) })), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) })));
        $sym49$PPH_STRING_FIND_IF_ = SubLObjectFactory.makeSymbol("PPH-STRING-FIND-IF?");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHARACTERP"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHARACTERP"), Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)pph_string.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALPHANUMERIC-CHAR-P"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALPHANUMERIC-CHAR-P"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-ASCII-CHAR-P"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(128), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) })), (SubLObject)pph_string.T));
        $sym51$PPH_STRING_POSITION = SubLObjectFactory.makeSymbol("PPH-STRING-POSITION");
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_o, (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_o, Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), (SubLObject)pph_string.ONE_INTEGER));
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY), Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) }), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) }), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) })), (SubLObject)pph_string.T));
        $sym54$PPH_STRING_DOWNCASE = SubLObjectFactory.makeSymbol("PPH-STRING-DOWNCASE");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Foo")), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(70), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) })), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) })));
        $sym56$PPH_STRING_FROM_CYCL_STRING = SubLObjectFactory.makeSymbol("PPH-STRING-FROM-CYCL-STRING");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("")), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u806F;&u90A6;&u5FEB;&u905E;"))), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) })));
        $sym58$PPH_STRING_STARTS_WITH = SubLObjectFactory.makeSymbol("PPH-STRING-STARTS-WITH");
        $list59 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("fo")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) }), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T));
        $sym60$PPH_STRING_ENDS_WITH = SubLObjectFactory.makeSymbol("PPH-STRING-ENDS-WITH");
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("oo")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) }), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T));
        $sym62$PPH_SUBSTRING_ = SubLObjectFactory.makeSymbol("PPH-SUBSTRING?");
        $list63 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.T), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)pph_string.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) }), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), (SubLObject)pph_string.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("fo"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)pph_string.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("o"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.T), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("q"), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)pph_string.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) })), (SubLObject)pph_string.T) });
        $sym64$PPH_SUBSTRING = SubLObjectFactory.makeSymbol("PPH-SUBSTRING");
        $list65 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)pph_string.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)pph_string.ZERO_INTEGER, (SubLObject)pph_string.ZERO_INTEGER), Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)pph_string.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)pph_string.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeString("foo")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)pph_string.ZERO_INTEGER), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) }), (SubLObject)pph_string.ZERO_INTEGER, (SubLObject)pph_string.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeString("foo")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)pph_string.ZERO_INTEGER, (SubLObject)pph_string.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeString("fo")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)pph_string.ZERO_INTEGER, (SubLObject)pph_string.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)pph_string.ONE_INTEGER, (SubLObject)pph_string.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeString("")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)pph_string.ONE_INTEGER, (SubLObject)pph_string.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeString("o")), ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) }), (SubLObject)pph_string.ZERO_INTEGER, (SubLObject)pph_string.THREE_INTEGER), (SubLObject)SubLObjectFactory.makeString("foo")) });
        $sym66$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym67$PPH_CANONICALIZING_BUNGE = SubLObjectFactory.makeSymbol("PPH-CANONICALIZING-BUNGE");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""))), Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)SubLObjectFactory.makeString(""))), Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("foo"))), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("oo"))), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"))), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) }), (SubLObject)SubLObjectFactory.makeString("foo"))), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })));
        $sym69$PPH_NONCANONICALIZING_BUNGE = SubLObjectFactory.makeSymbol("PPH-NONCANONICALIZING-BUNGE");
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""))), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(""), (SubLObject)SubLObjectFactory.makeString(""))), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(pph_string.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)SubLObjectFactory.makeString(""))), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("foo"))), (SubLObject)SubLObjectFactory.makeString("foo foo")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"), (SubLObject)SubLObjectFactory.makeString("oo"))), (SubLObject)SubLObjectFactory.makeString("foo oo")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("foo"))), (SubLObject)SubLObjectFactory.makeString("foo")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958) }), (SubLObject)SubLObjectFactory.makeString("foo"))), Vectors.vector(new SubLObject[] { SubLObjectFactory.makeInteger(32879), SubLObjectFactory.makeInteger(37030), SubLObjectFactory.makeInteger(24555), SubLObjectFactory.makeInteger(36958), SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(102), SubLObjectFactory.makeInteger(111), SubLObjectFactory.makeInteger(111) })));
    }
}

/*

	Total time: 256 ms
	
*/