package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.hashtables_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class dictionary_contents extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.dictionary_contents";
    public static final String myFingerPrint = "8b0b80b6a10d15b354a92c57a8d0886fd6b2aaa7e678df26b93f987d998ba13a";
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 2366L)
    private static SubLSymbol $dictionary_contents_high_water_mark$;
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 2691L)
    private static SubLSymbol $dictionary_contents_low_water_mark$;
    private static final SubLInteger $int0$40;
    private static final SubLInteger $int1$30;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$ALIST;
    private static final SubLSymbol $kw4$HASHTABLE;
    private static final SubLSymbol $kw5$UNKNOWN;
    private static final SubLString $str6$Corrupted_dictionary_contents__un;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw12$DONE;
    private static final SubLSymbol $sym13$ITERATION_STATE;
    private static final SubLSymbol $sym14$CLET;
    private static final SubLSymbol $sym15$DO_DICTIONARY_CONTENTS_STATE;
    private static final SubLSymbol $sym16$UNTIL;
    private static final SubLSymbol $sym17$COR;
    private static final SubLSymbol $sym18$DO_DICTIONARY_CONTENTS_DONE_;
    private static final SubLSymbol $sym19$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym20$DO_DICTIONARY_CONTENTS_KEY_VALUE;
    private static final SubLSymbol $sym21$CSETQ;
    private static final SubLSymbol $sym22$DO_DICTIONARY_CONTENTS_NEXT;
    private static final SubLSymbol $sym23$DO_DICTIONARY_CONTENTS_FINALIZE;
    private static final SubLSymbol $sym24$DO_DICTIONARY_CONTENTS;
    private static final SubLSymbol $sym25$DO_DICTIONARY;
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 2831L)
    public static SubLObject dictionary_contents_style(final SubLObject v_dictionary_contents) {
        if (dictionary_contents.NIL != list_utilities.alist_p(v_dictionary_contents)) {
            return (SubLObject)dictionary_contents.$kw3$ALIST;
        }
        if (v_dictionary_contents.isHashtable()) {
            return (SubLObject)dictionary_contents.$kw4$HASHTABLE;
        }
        return (SubLObject)dictionary_contents.$kw5$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 3256L)
    public static SubLObject dictionary_contents_style_error(final SubLObject v_dictionary_contents) {
        return Errors.error((SubLObject)dictionary_contents.$str6$Corrupted_dictionary_contents__un, dictionary_contents_style(v_dictionary_contents));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 3701L)
    public static SubLObject dictionary_contents_lookup_alist_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, final SubLObject not_found) {
        return list_utilities.alist_lookup(v_dictionary_contents, key, test, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 3861L)
    public static SubLObject dictionary_contents_lookup_without_values_alist_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, final SubLObject not_found) {
        return list_utilities.alist_lookup_without_values(v_dictionary_contents, key, test, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 4051L)
    public static SubLObject dictionary_contents_nlookup_without_values_alist_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, final SubLObject not_found) {
        return list_utilities.alist_nlookup_without_values(v_dictionary_contents, key, test, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 4243L)
    public static SubLObject dictionary_contents_enter_alist_style(SubLObject v_dictionary_contents, final SubLObject key, final SubLObject value, final SubLObject test) {
        final SubLObject pair = conses_high.assoc(key, v_dictionary_contents, test, (SubLObject)dictionary_contents.UNPROVIDED);
        if (dictionary_contents.NIL != pair) {
            ConsesLow.rplacd(pair, value);
        }
        else {
            v_dictionary_contents = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(key, value), v_dictionary_contents);
            if (Sequences.length(v_dictionary_contents).numG(dictionary_contents.$dictionary_contents_high_water_mark$.getGlobalValue())) {
                v_dictionary_contents = list_utilities.alist_to_hash_table(v_dictionary_contents, test);
            }
        }
        return v_dictionary_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 4679L)
    public static SubLObject dictionary_contents_delete_alist_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test) {
        return list_utilities.alist_delete_without_values(v_dictionary_contents, key, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 5107L)
    public static SubLObject dictionary_contents_lookup_hashtable_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject not_found) {
        return Hashtables.gethash(key, v_dictionary_contents, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 5256L)
    public static SubLObject dictionary_contents_lookup_without_values_hashtable_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject not_found) {
        return Hashtables.gethash_without_values(key, v_dictionary_contents, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 5435L)
    public static SubLObject dictionary_contents_enter_hashtable_style(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject value) {
        Hashtables.sethash(key, v_dictionary_contents, value);
        return v_dictionary_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 5597L)
    public static SubLObject dictionary_contents_delete_hashtable_style(SubLObject v_dictionary_contents, final SubLObject key) {
        Hashtables.remhash(key, v_dictionary_contents);
        if (Hashtables.hash_table_count(v_dictionary_contents).numL(dictionary_contents.$dictionary_contents_low_water_mark$.getGlobalValue())) {
            v_dictionary_contents = hash_table_utilities.hash_table_to_alist(v_dictionary_contents);
        }
        return v_dictionary_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 5912L)
    public static SubLObject dictionary_contents_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(dictionary_contents.NIL != list_utilities.alist_p(v_object) || v_object.isHashtable());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 6289L)
    public static SubLObject new_dictionary_contents(SubLObject size, SubLObject test) {
        if (size == dictionary_contents.UNPROVIDED) {
            size = (SubLObject)dictionary_contents.ZERO_INTEGER;
        }
        if (test == dictionary_contents.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_contents.EQL);
        }
        if (size.numG(dictionary_contents.$dictionary_contents_high_water_mark$.getGlobalValue())) {
            return Hashtables.make_hash_table(size, test, (SubLObject)dictionary_contents.UNPROVIDED);
        }
        return (SubLObject)dictionary_contents.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 6758L)
    public static SubLObject copy_dictionary_contents(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return conses_high.copy_alist(v_dictionary_contents);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return hash_table_utilities.copy_hashtable(v_dictionary_contents, (SubLObject)dictionary_contents.UNPROVIDED);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 7214L)
    public static SubLObject dictionary_contents_size(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return Sequences.length(v_dictionary_contents);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return Hashtables.hash_table_count(v_dictionary_contents);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 7731L)
    public static SubLObject dictionary_contents_empty_p(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return Types.sublisp_null(v_dictionary_contents);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return Numbers.zerop(Hashtables.hash_table_count(v_dictionary_contents));
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 8158L)
    public static SubLObject non_empty_dictionary_contents_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(dictionary_contents.NIL != dictionary_contents_p(v_object) && dictionary_contents.NIL == dictionary_contents_empty_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 8380L)
    public static SubLObject dictionary_contents_has_keyP(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)dictionary_contents.ONE_INTEGER), dictionary_contents_lookup(v_dictionary_contents, key, test, (SubLObject)dictionary_contents.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 8638L)
    public static SubLObject dictionary_contents_lookup(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, SubLObject not_found) {
        if (not_found == dictionary_contents.UNPROVIDED) {
            not_found = (SubLObject)dictionary_contents.NIL;
        }
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return dictionary_contents_lookup_alist_style(v_dictionary_contents, key, test, not_found);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return dictionary_contents_lookup_hashtable_style(v_dictionary_contents, key, not_found);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 9342L)
    public static SubLObject dictionary_contents_lookup_without_values(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, SubLObject not_found) {
        if (not_found == dictionary_contents.UNPROVIDED) {
            not_found = (SubLObject)dictionary_contents.NIL;
        }
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return dictionary_contents_lookup_without_values_alist_style(v_dictionary_contents, key, test, not_found);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return dictionary_contents_lookup_without_values_hashtable_style(v_dictionary_contents, key, not_found);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 10106L)
    public static SubLObject dictionary_contents_nlookup_without_values(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test, SubLObject not_found) {
        if (not_found == dictionary_contents.UNPROVIDED) {
            not_found = (SubLObject)dictionary_contents.NIL;
        }
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return dictionary_contents_nlookup_without_values_alist_style(v_dictionary_contents, key, test, not_found);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return dictionary_contents_lookup_without_values_hashtable_style(v_dictionary_contents, key, not_found);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 10808L)
    public static SubLObject dictionary_contents_enter(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject value, final SubLObject test) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return dictionary_contents_enter_alist_style(v_dictionary_contents, key, value, test);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return dictionary_contents_enter_hashtable_style(v_dictionary_contents, key, value);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 11462L)
    public static SubLObject dictionary_contents_delete(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject test) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return dictionary_contents_delete_alist_style(v_dictionary_contents, key, test);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return dictionary_contents_delete_hashtable_style(v_dictionary_contents, key);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 12051L)
    public static SubLObject clear_dictionary_contents(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            Hashtables.clrhash(v_dictionary_contents);
        }
        return new_dictionary_contents((SubLObject)dictionary_contents.ZERO_INTEGER, (SubLObject)dictionary_contents.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 12417L)
    public static SubLObject new_dictionary_contents_iterator(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return iteration.new_alist_iterator(v_dictionary_contents);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return iteration.new_hash_table_iterator(v_dictionary_contents);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 12968L)
    public static SubLObject do_dictionary_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_contents.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)dictionary_contents.NIL;
        SubLObject value = (SubLObject)dictionary_contents.NIL;
        SubLObject v_dictionary_contents = (SubLObject)dictionary_contents.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_contents.$list9);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_contents.$list9);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_contents.$list9);
        v_dictionary_contents = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dictionary_contents.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dictionary_contents.NIL;
        SubLObject current_$1 = (SubLObject)dictionary_contents.NIL;
        while (dictionary_contents.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dictionary_contents.$list9);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dictionary_contents.$list9);
            if (dictionary_contents.NIL == conses_high.member(current_$1, (SubLObject)dictionary_contents.$list10, (SubLObject)dictionary_contents.UNPROVIDED, (SubLObject)dictionary_contents.UNPROVIDED)) {
                bad = (SubLObject)dictionary_contents.T;
            }
            if (current_$1 == dictionary_contents.$kw11$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dictionary_contents.NIL != bad && dictionary_contents.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dictionary_contents.$list9);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)dictionary_contents.$kw12$DONE, current);
        final SubLObject done = (SubLObject)((dictionary_contents.NIL != done_tail) ? conses_high.cadr(done_tail) : dictionary_contents.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iteration_state = (SubLObject)dictionary_contents.$sym13$ITERATION_STATE;
        return (SubLObject)ConsesLow.list((SubLObject)dictionary_contents.$sym14$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iteration_state, (SubLObject)ConsesLow.list((SubLObject)dictionary_contents.$sym15$DO_DICTIONARY_CONTENTS_STATE, v_dictionary_contents))), (SubLObject)ConsesLow.list((SubLObject)dictionary_contents.$sym16$UNTIL, (SubLObject)ConsesLow.list((SubLObject)dictionary_contents.$sym17$COR, done, (SubLObject)ConsesLow.list((SubLObject)dictionary_contents.$sym18$DO_DICTIONARY_CONTENTS_DONE_, iteration_state)), (SubLObject)ConsesLow.listS((SubLObject)dictionary_contents.$sym19$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(key, value), (SubLObject)ConsesLow.list((SubLObject)dictionary_contents.$sym20$DO_DICTIONARY_CONTENTS_KEY_VALUE, iteration_state), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)dictionary_contents.$sym21$CSETQ, iteration_state, (SubLObject)ConsesLow.list((SubLObject)dictionary_contents.$sym22$DO_DICTIONARY_CONTENTS_NEXT, iteration_state)))))), (SubLObject)ConsesLow.list((SubLObject)dictionary_contents.$sym23$DO_DICTIONARY_CONTENTS_FINALIZE, iteration_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 13949L)
    public static SubLObject do_dictionary_contents_state(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return v_dictionary_contents;
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return hashtables_high.make_hash_table_iterator(v_dictionary_contents);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 14327L)
    public static SubLObject do_dictionary_contents_key_value(final SubLObject state) {
        if (state.isList()) {
            final SubLObject key_value_pair = state.first();
            final SubLObject key = key_value_pair.first();
            final SubLObject value = key_value_pair.rest();
            return subl_promotions.values2(key, value);
        }
        final SubLObject key2 = hashtables_high.hash_table_iterator_key(state);
        final SubLObject value2 = hashtables_high.hash_table_iterator_value(state);
        return subl_promotions.values2(key2, value2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 14736L)
    public static SubLObject do_dictionary_contents_next(final SubLObject state) {
        if (state.isList()) {
            return state.rest();
        }
        return hashtables_high.hash_table_iterator_next(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 14913L)
    public static SubLObject do_dictionary_contents_doneP(final SubLObject state) {
        if (state.isList()) {
            return Types.sublisp_null(state);
        }
        return hashtables_high.hash_table_iterator_done_p(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 15094L)
    public static SubLObject do_dictionary_contents_finalize(final SubLObject state) {
        if (dictionary_contents.NIL != hashtables_high.hash_table_iterator_p(state)) {
            hashtables_high.destroy_hash_table_iterator(state);
        }
        return (SubLObject)dictionary_contents.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 15274L)
    public static SubLObject map_dictionary_contents(final SubLObject v_dictionary_contents, final SubLObject function, SubLObject args) {
        if (args == dictionary_contents.UNPROVIDED) {
            args = (SubLObject)dictionary_contents.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = do_dictionary_contents_state(v_dictionary_contents); dictionary_contents.NIL == do_dictionary_contents_doneP(iteration_state); iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            Functions.apply(function, key, new SubLObject[] { value, args });
        }
        do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)dictionary_contents.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 15781L)
    public static SubLObject dictionary_contents_keys(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return list_utilities.alist_keys(v_dictionary_contents);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return hash_table_utilities.hash_table_keys(v_dictionary_contents);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 16609L)
    public static SubLObject dictionary_contents_values(final SubLObject v_dictionary_contents) {
        final SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw3$ALIST)) {
            return list_utilities.alist_values(v_dictionary_contents);
        }
        if (pcase_var.eql((SubLObject)dictionary_contents.$kw4$HASHTABLE)) {
            return hash_table_utilities.hash_table_values(v_dictionary_contents);
        }
        return dictionary_contents_style_error(v_dictionary_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-contents.lisp", position = 17056L)
    public static SubLObject dictionary_contents_random_key(final SubLObject v_dictionary_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_key;
        SubLObject iteration_state;
        SubLObject key;
        for (first_key = (SubLObject)dictionary_contents.NIL, iteration_state = do_dictionary_contents_state(v_dictionary_contents); dictionary_contents.NIL == first_key && dictionary_contents.NIL == do_dictionary_contents_doneP(iteration_state); first_key = key, iteration_state = do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            key = do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
        }
        do_dictionary_contents_finalize(iteration_state);
        return first_key;
    }
    
    public static SubLObject declare_dictionary_contents_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_style", "DICTIONARY-CONTENTS-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_style_error", "DICTIONARY-CONTENTS-STYLE-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_lookup_alist_style", "DICTIONARY-CONTENTS-LOOKUP-ALIST-STYLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_lookup_without_values_alist_style", "DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_nlookup_without_values_alist_style", "DICTIONARY-CONTENTS-NLOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_enter_alist_style", "DICTIONARY-CONTENTS-ENTER-ALIST-STYLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_delete_alist_style", "DICTIONARY-CONTENTS-DELETE-ALIST-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_lookup_hashtable_style", "DICTIONARY-CONTENTS-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_lookup_without_values_hashtable_style", "DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_enter_hashtable_style", "DICTIONARY-CONTENTS-ENTER-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_delete_hashtable_style", "DICTIONARY-CONTENTS-DELETE-HASHTABLE-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_p", "DICTIONARY-CONTENTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "new_dictionary_contents", "NEW-DICTIONARY-CONTENTS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "copy_dictionary_contents", "COPY-DICTIONARY-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_size", "DICTIONARY-CONTENTS-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_empty_p", "DICTIONARY-CONTENTS-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "non_empty_dictionary_contents_p", "NON-EMPTY-DICTIONARY-CONTENTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_has_keyP", "DICTIONARY-CONTENTS-HAS-KEY?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_lookup", "DICTIONARY-CONTENTS-LOOKUP", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_lookup_without_values", "DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_nlookup_without_values", "DICTIONARY-CONTENTS-NLOOKUP-WITHOUT-VALUES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_enter", "DICTIONARY-CONTENTS-ENTER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_delete", "DICTIONARY-CONTENTS-DELETE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "clear_dictionary_contents", "CLEAR-DICTIONARY-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "new_dictionary_contents_iterator", "NEW-DICTIONARY-CONTENTS-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dictionary_contents", "do_dictionary_contents", "DO-DICTIONARY-CONTENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "do_dictionary_contents_state", "DO-DICTIONARY-CONTENTS-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "do_dictionary_contents_key_value", "DO-DICTIONARY-CONTENTS-KEY-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "do_dictionary_contents_next", "DO-DICTIONARY-CONTENTS-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "do_dictionary_contents_doneP", "DO-DICTIONARY-CONTENTS-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "do_dictionary_contents_finalize", "DO-DICTIONARY-CONTENTS-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "map_dictionary_contents", "MAP-DICTIONARY-CONTENTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_keys", "DICTIONARY-CONTENTS-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_values", "DICTIONARY-CONTENTS-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_contents", "dictionary_contents_random_key", "DICTIONARY-CONTENTS-RANDOM-KEY", 1, 0, false);
        return (SubLObject)dictionary_contents.NIL;
    }
    
    public static SubLObject init_dictionary_contents_file() {
        dictionary_contents.$dictionary_contents_high_water_mark$ = SubLFiles.deflexical("*DICTIONARY-CONTENTS-HIGH-WATER-MARK*", (SubLObject)dictionary_contents.$int0$40);
        dictionary_contents.$dictionary_contents_low_water_mark$ = SubLFiles.deflexical("*DICTIONARY-CONTENTS-LOW-WATER-MARK*", (SubLObject)dictionary_contents.$int1$30);
        return (SubLObject)dictionary_contents.NIL;
    }
    
    public static SubLObject setup_dictionary_contents_file() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)dictionary_contents.$list2);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)dictionary_contents.$list7);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)dictionary_contents.$list8);
        access_macros.register_macro_helper((SubLObject)dictionary_contents.$sym15$DO_DICTIONARY_CONTENTS_STATE, (SubLObject)dictionary_contents.$sym24$DO_DICTIONARY_CONTENTS);
        access_macros.register_macro_helper((SubLObject)dictionary_contents.$sym20$DO_DICTIONARY_CONTENTS_KEY_VALUE, (SubLObject)dictionary_contents.$sym25$DO_DICTIONARY);
        access_macros.register_macro_helper((SubLObject)dictionary_contents.$sym22$DO_DICTIONARY_CONTENTS_NEXT, (SubLObject)dictionary_contents.$sym25$DO_DICTIONARY);
        access_macros.register_macro_helper((SubLObject)dictionary_contents.$sym18$DO_DICTIONARY_CONTENTS_DONE_, (SubLObject)dictionary_contents.$sym25$DO_DICTIONARY);
        access_macros.register_macro_helper((SubLObject)dictionary_contents.$sym23$DO_DICTIONARY_CONTENTS_FINALIZE, (SubLObject)dictionary_contents.$sym25$DO_DICTIONARY);
        return (SubLObject)dictionary_contents.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_dictionary_contents_file();
    }
    
    @Override
	public void initializeVariables() {
        init_dictionary_contents_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_dictionary_contents_file();
    }
    
    static {
        me = (SubLFile)new dictionary_contents();
        dictionary_contents.$dictionary_contents_high_water_mark$ = null;
        dictionary_contents.$dictionary_contents_low_water_mark$ = null;
        $int0$40 = SubLObjectFactory.makeInteger(40);
        $int1$30 = SubLObjectFactory.makeInteger(30);
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-STYLE-ERROR"));
        $kw3$ALIST = SubLObjectFactory.makeKeyword("ALIST");
        $kw4$HASHTABLE = SubLObjectFactory.makeKeyword("HASHTABLE");
        $kw5$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str6$Corrupted_dictionary_contents__un = SubLObjectFactory.makeString("Corrupted dictionary-contents; unsupported style ~S.~%");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-LOOKUP-ALIST-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES-ALIST-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-ENTER-ALIST-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-DELETE-ALIST-STYLE"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-LOOKUP-HASHTABLE-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-ENTER-HASHTABLE-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-DELETE-HASHTABLE-STYLE"));
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw11$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw12$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym13$ITERATION_STATE = SubLObjectFactory.makeUninternedSymbol("ITERATION-STATE");
        $sym14$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym15$DO_DICTIONARY_CONTENTS_STATE = SubLObjectFactory.makeSymbol("DO-DICTIONARY-CONTENTS-STATE");
        $sym16$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym17$COR = SubLObjectFactory.makeSymbol("COR");
        $sym18$DO_DICTIONARY_CONTENTS_DONE_ = SubLObjectFactory.makeSymbol("DO-DICTIONARY-CONTENTS-DONE?");
        $sym19$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym20$DO_DICTIONARY_CONTENTS_KEY_VALUE = SubLObjectFactory.makeSymbol("DO-DICTIONARY-CONTENTS-KEY-VALUE");
        $sym21$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym22$DO_DICTIONARY_CONTENTS_NEXT = SubLObjectFactory.makeSymbol("DO-DICTIONARY-CONTENTS-NEXT");
        $sym23$DO_DICTIONARY_CONTENTS_FINALIZE = SubLObjectFactory.makeSymbol("DO-DICTIONARY-CONTENTS-FINALIZE");
        $sym24$DO_DICTIONARY_CONTENTS = SubLObjectFactory.makeSymbol("DO-DICTIONARY-CONTENTS");
        $sym25$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
    }
}

/*

	Total time: 153 ms
	
*/