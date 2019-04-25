package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class dictionary_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.dictionary_utilities";
    public static final String myFingerPrint = "70b82e7281705d4f2d9175c66d46b3535d2948f8b64cae7c2ae00b7f260c407f";
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 21389L)
    private static SubLSymbol $dictionary_keys_sorter_current_sorting_information$;
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 28999L)
    private static SubLSymbol $key_missing$;
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 32321L)
    private static SubLSymbol $sub_dictionary_not_found$;
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33873L)
    public static SubLSymbol $dtp_synchronized_dictionary$;
    private static final SubLSymbol $sym0$DICTIONARY_P;
    private static final SubLString $str1$Corrupted_dictionary__attempting_;
    private static final SubLSymbol $sym2$DICTIONARY_CONTENTS_P;
    private static final SubLString $str3$Corrupted_dictionary_contents__at;
    private static final SubLString $str4$Corrupted_dictionary__attempting_;
    private static final SubLSymbol $sym5$STRING__;
    private static final SubLSymbol $sym6$SYMBOL_NAME;
    private static final SubLString $str7$Corrupted_dictionary__attempting_;
    private static final SubLSymbol $sym8$LISTP;
    private static final SubLString $str9$Corrupted_dictionary__attempting_;
    private static final SubLString $str10$Corrupted_dictionary__attempting_;
    private static final SubLString $str11$Corrupted_dictionary__attempting_;
    private static final SubLString $str12$Corrupted_dictionary__attempting_;
    private static final SubLSymbol $sym13$FALSE;
    private static final SubLSymbol $sym14$ZEROP;
    private static final SubLSymbol $sym15$NON_EMPTY_DICTIONARY_P;
    private static final SubLSymbol $sym16$NUMBERP;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$DICT_EXPRESSION_VAR;
    private static final SubLSymbol $sym20$CLET;
    private static final SubLSymbol $sym21$CSETQ;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$PWHEN;
    private static final SubLSymbol $sym24$DO_DICTIONARY;
    private static final SubLSymbol $sym25$IGNORE;
    private static final SubLSymbol $sym26$CPUSH;
    private static final SubLSymbol $sym27$NREVERSE;
    private static final SubLSymbol $kw28$INPUT;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$PROGN;
    private static final SubLSymbol $sym32$CINC;
    private static final SubLString $str33$_S_____S__;
    private static final SubLString $str34$_S____;
    private static final SubLString $str35$_S__;
    private static final SubLSymbol $sym36$STRINGP;
    private static final SubLString $str37$_csv;
    private static final SubLSymbol $kw38$DIRECTION;
    private static final SubLSymbol $kw39$OUTPUT;
    private static final SubLSymbol $kw40$IF_DOES_NOT_EXIST;
    private static final SubLSymbol $kw41$CREATE;
    private static final SubLString $str42$_A___A__;
    private static final SubLString $str43$_S___S__;
    private static final SubLString $str44$Unable_to_open__S;
    private static final SubLString $str45$_;
    private static final SubLSymbol $sym46$DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE;
    private static final SubLList $list47;
    private static final SubLString $str48$For_key__A__the_computed_new_valu;
    private static final SubLSymbol $kw49$SUCCESS;
    private static final SubLSymbol $sym50$_;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw54$DONE;
    private static final SubLSymbol $sym55$VALUE;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$KEY;
    private static final SubLList $list58;
    private static final SubLString $str59$KEY_MISSING;
    private static final SubLString $str60$Overwriting__s_from__s_to__s;
    private static final SubLSymbol $sym61$_SUB_DICTIONARY_NOT_FOUND_;
    private static final SubLSymbol $sym62$SYNCHRONIZED_DICTIONARY;
    private static final SubLSymbol $sym63$SYNCHRONIZED_DICTIONARY_P;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$PRINT_SYNCHRONIZED_DICTIONARY;
    private static final SubLSymbol $sym69$SYNCHRONIZED_DICTIONARY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$SYNCHRONIZED_DICTIONARY_DICTIONARY;
    private static final SubLSymbol $sym72$_CSETF_SYNCHRONIZED_DICTIONARY_DICTIONARY;
    private static final SubLSymbol $sym73$SYNCHRONIZED_DICTIONARY_LOCK;
    private static final SubLSymbol $sym74$_CSETF_SYNCHRONIZED_DICTIONARY_LOCK;
    private static final SubLSymbol $kw75$DICTIONARY;
    private static final SubLSymbol $kw76$LOCK;
    private static final SubLString $str77$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw78$BEGIN;
    private static final SubLSymbol $sym79$MAKE_SYNCHRONIZED_DICTIONARY;
    private static final SubLSymbol $kw80$SLOT;
    private static final SubLSymbol $kw81$END;
    private static final SubLSymbol $sym82$VISIT_DEFSTRUCT_OBJECT_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLString $str83$Synchronized_Dictionary_Lock;
    private static final SubLString $str84$DICTIONARY___A___LOCK___A__;
    private static final SubLSymbol $sym85$_EXIT;
    private static final SubLSymbol $kw86$NOT_SET;
    private static final SubLSymbol $sym87$IS_MAP_OBJECT_P_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym88$MAP_OBJECT_SIZE_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym89$MAP_OBJECT_TEST_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym90$MAP_OBJECT_PUT_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym91$MAP_OBJECT_PUT_UNLESS_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym92$MAP_OBJECT_GET_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym93$MAP_OBJECT_GET_WITHOUT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym94$MAP_OBJECT_REMOVE_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym95$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SYNCHRONIZED_DICTIONARY_METHO;
    private static final SubLSymbol $sym96$MAP_OBJECT_ARBITRARY_KEY_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym97$NEW_MAP_OBJECT_ITERATOR_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym98$MAP_OBJECT_REMOVE_ALL_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym99$MAP_OBJECT_KEYS_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLSymbol $sym100$MAP_OBJECT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD;
    private static final SubLInteger $int101$50;
    private static final SubLInteger $int102$3000000;
    private static final SubLString $str103$Testing_size__A_ALIST__A_HASHTABL;
    private static final SubLSymbol $sym104$TEST_DICTIONARY_KEYS_SORTED_BY_VALUES;
    private static final SubLSymbol $kw105$TEST;
    private static final SubLSymbol $kw106$OWNER;
    private static final SubLSymbol $kw107$CLASSES;
    private static final SubLSymbol $kw108$KB;
    private static final SubLSymbol $kw109$TINY;
    private static final SubLSymbol $kw110$WORKING_;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$TEST_MAP_DICTIONARY_VALUES;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$TEST_DICTIONARY_KEY_CONFLATION;
    private static final SubLList $list115;
    private static final SubLSymbol $kw116$PRESENT;
    private static final SubLString $str117$Expected__A_entries__but_got__A_;
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 791L)
    public static SubLObject dictionary_arbitrary_key(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)dictionary_utilities.NIL;
        SubLObject found;
        SubLObject iteration_state;
        for (found = (SubLObject)dictionary_utilities.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == found && dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); found = (SubLObject)dictionary_utilities.T, iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = key;
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Values.values(result, found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 1065L)
    public static SubLObject copy_dictionary(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject test = dictionary.dictionary_test(v_dictionary);
        final SubLObject size = dictionary.dictionary_length(v_dictionary);
        final SubLObject new_dictionary = dictionary.new_dictionary(test, size);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject val = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_enter(new_dictionary, key, val);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 1464L)
    public static SubLObject copy_dictionary_recursive(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject test = dictionary.dictionary_test(v_dictionary);
        final SubLObject size = dictionary.dictionary_length(v_dictionary);
        final SubLObject new_dictionary = dictionary.new_dictionary(test, size);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject val = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (dictionary_utilities.NIL != dictionary.dictionary_p(val)) {
                dictionary.dictionary_enter(new_dictionary, key, copy_dictionary_recursive(val));
            }
            else {
                dictionary.dictionary_enter(new_dictionary, key, val);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 2030L)
    public static SubLObject dictionary_pop(final SubLObject v_dictionary, final SubLObject key) {
        final SubLObject result = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        dictionary.dictionary_remove(v_dictionary, key);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 2309L)
    public static SubLObject dictionary_push(final SubLObject v_dictionary, final SubLObject key, final SubLObject value) {
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isList()) {
            current_val = (SubLObject)ConsesLow.cons(value, current_val);
            return dictionary.dictionary_enter(v_dictionary, key, current_val);
        }
        Errors.error((SubLObject)dictionary_utilities.$str1$Corrupted_dictionary__attempting_, current_val);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 2954L)
    public static SubLObject dictionary_contents_push(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject value, final SubLObject test) {
        assert dictionary_utilities.NIL != dictionary_contents.dictionary_contents_p(v_dictionary_contents) : v_dictionary_contents;
        SubLObject current_val = dictionary_contents.dictionary_contents_lookup_without_values(v_dictionary_contents, key, test, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isList()) {
            current_val = (SubLObject)ConsesLow.cons(value, current_val);
            return dictionary_contents.dictionary_contents_enter(v_dictionary_contents, key, current_val, test);
        }
        Errors.error((SubLObject)dictionary_utilities.$str3$Corrupted_dictionary_contents__at, current_val);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 3687L)
    public static SubLObject dictionary_pop_from_value(final SubLObject v_dictionary, final SubLObject key) {
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        SubLObject result = (SubLObject)dictionary_utilities.NIL;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isCons()) {
            result = current_val.first();
            final SubLObject new_val = current_val.rest();
            if (dictionary_utilities.NIL == new_val) {
                dictionary.dictionary_remove(v_dictionary, key);
            }
            else if (!new_val.eql(current_val)) {
                dictionary.dictionary_enter(v_dictionary, key, new_val);
            }
        }
        else if (dictionary_utilities.NIL == current_val) {
            result = (SubLObject)dictionary_utilities.NIL;
        }
        else {
            Errors.error((SubLObject)dictionary_utilities.$str4$Corrupted_dictionary__attempting_, current_val);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 4574L)
    public static SubLObject dictionary_pushnew(final SubLObject v_dictionary, final SubLObject key, final SubLObject value, SubLObject test, SubLObject key_accessor) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        if (key_accessor == dictionary_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)dictionary_utilities.IDENTITY);
        }
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isList()) {
            if (dictionary_utilities.NIL == conses_high.member(value, current_val, test, key_accessor)) {
                current_val = (SubLObject)ConsesLow.cons(value, current_val);
            }
            return dictionary.dictionary_enter(v_dictionary, key, current_val);
        }
        Errors.error((SubLObject)dictionary_utilities.$str1$Corrupted_dictionary__attempting_, current_val);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 5492L)
    public static SubLObject dictionary_add_to_value_sorted(final SubLObject v_dictionary, final SubLObject key, final SubLObject item, SubLObject predicate, SubLObject key_accessor) {
        if (predicate == dictionary_utilities.UNPROVIDED) {
            predicate = (SubLObject)dictionary_utilities.$sym5$STRING__;
        }
        if (key_accessor == dictionary_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)dictionary_utilities.$sym6$SYMBOL_NAME);
        }
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isList()) {
            current_val = list_utilities.sorted_add_to_list(item, current_val, predicate, key_accessor);
            return dictionary.dictionary_enter(v_dictionary, key, current_val);
        }
        Errors.error((SubLObject)dictionary_utilities.$str7$Corrupted_dictionary__attempting_, current_val);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 6343L)
    public static SubLObject dictionary_append(final SubLObject v_dictionary, final SubLObject key, final SubLObject list) {
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        assert dictionary_utilities.NIL != Types.listp(list) : list;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isList()) {
            final SubLObject new_val = ConsesLow.append(current_val, list);
            return dictionary.dictionary_enter(v_dictionary, key, new_val);
        }
        Errors.error((SubLObject)dictionary_utilities.$str9$Corrupted_dictionary__attempting_, current_val);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 6918L)
    public static SubLObject dictionary_union(final SubLObject v_dictionary, final SubLObject key, final SubLObject list, SubLObject test, SubLObject key_accessor) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        if (key_accessor == dictionary_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)dictionary_utilities.IDENTITY);
        }
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        assert dictionary_utilities.NIL != Types.listp(list) : list;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isList()) {
            final SubLObject new_val = conses_high.union(current_val, list, test, key_accessor);
            return dictionary.dictionary_enter(v_dictionary, key, new_val);
        }
        Errors.error((SubLObject)dictionary_utilities.$str10$Corrupted_dictionary__attempting_, current_val);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 7530L)
    public static SubLObject dictionary_getf(final SubLObject v_dictionary, final SubLObject key, final SubLObject indicator, SubLObject v_default) {
        if (v_default == dictionary_utilities.UNPROVIDED) {
            v_default = (SubLObject)dictionary_utilities.NIL;
        }
        final SubLObject plist = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        assert dictionary_utilities.NIL != Types.listp(plist) : plist;
        return conses_high.getf(plist, indicator, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 7938L)
    public static SubLObject dictionary_putf(final SubLObject v_dictionary, final SubLObject key, final SubLObject indicator, final SubLObject value) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        assert dictionary_utilities.NIL != Types.listp(plist) : plist;
        return dictionary.dictionary_enter(v_dictionary, key, conses_high.putf(plist, indicator, value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 8383L)
    public static SubLObject dictionary_remove_from_value(final SubLObject v_dictionary, final SubLObject key, final SubLObject elt, SubLObject test, SubLObject key_accessor) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = (SubLObject)dictionary_utilities.EQL;
        }
        if (key_accessor == dictionary_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)dictionary_utilities.IDENTITY);
        }
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isList()) {
            final SubLObject new_val = Sequences.remove(elt, current_val, test, key_accessor, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED);
            if (dictionary_utilities.NIL == new_val) {
                dictionary.dictionary_remove(v_dictionary, key);
            }
            else {
                dictionary.dictionary_enter(v_dictionary, key, new_val);
            }
        }
        else {
            Errors.error((SubLObject)dictionary_utilities.$str11$Corrupted_dictionary__attempting_, current_val);
        }
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 9258L)
    public static SubLObject dictionary_delete_from_value(final SubLObject v_dictionary, final SubLObject key, final SubLObject elt, SubLObject test, SubLObject key_accessor) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        if (key_accessor == dictionary_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)dictionary_utilities.IDENTITY);
        }
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isList()) {
            final SubLObject new_val = Sequences.delete(elt, current_val, test, key_accessor, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED);
            if (dictionary_utilities.NIL == new_val) {
                dictionary.dictionary_remove(v_dictionary, key);
            }
            else if (!new_val.eql(current_val)) {
                dictionary.dictionary_enter(v_dictionary, key, new_val);
            }
        }
        else {
            Errors.error((SubLObject)dictionary_utilities.$str12$Corrupted_dictionary__attempting_, current_val);
        }
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 10037L)
    public static SubLObject dictionary_delete_first_from_value(final SubLObject v_dictionary, final SubLObject key, final SubLObject elt, SubLObject test) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isList()) {
            final SubLObject new_val = list_utilities.delete_first(elt, current_val, test);
            if (dictionary_utilities.NIL == new_val) {
                dictionary.dictionary_remove(v_dictionary, key);
            }
            else if (!new_val.eql(current_val)) {
                dictionary.dictionary_enter(v_dictionary, key, new_val);
            }
        }
        else {
            Errors.error((SubLObject)dictionary_utilities.$str12$Corrupted_dictionary__attempting_, current_val);
        }
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 10849L)
    public static SubLObject dictionary_delete_items_from_value(final SubLObject v_dictionary, final SubLObject key, final SubLObject elts, SubLObject test, SubLObject key_accessor) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = (SubLObject)dictionary_utilities.EQL;
        }
        if (key_accessor == dictionary_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)dictionary_utilities.IDENTITY);
        }
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
        if (current_val.isList()) {
            SubLObject new_val = conses_high.copy_list(current_val);
            SubLObject cdolist_list_var = elts;
            SubLObject elt = (SubLObject)dictionary_utilities.NIL;
            elt = cdolist_list_var.first();
            while (dictionary_utilities.NIL != cdolist_list_var) {
                new_val = Sequences.delete(elt, new_val, test, key_accessor, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                elt = cdolist_list_var.first();
            }
            if (dictionary_utilities.NIL == new_val) {
                dictionary.dictionary_remove(v_dictionary, key);
            }
            else if (!new_val.eql(current_val)) {
                dictionary.dictionary_enter(v_dictionary, key, new_val);
            }
        }
        else {
            Errors.error((SubLObject)dictionary_utilities.$str12$Corrupted_dictionary__attempting_, current_val);
        }
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 11714L)
    public static SubLObject dictionary_increment(final SubLObject v_dictionary, final SubLObject key, SubLObject increment) {
        if (increment == dictionary_utilities.UNPROVIDED) {
            increment = (SubLObject)dictionary_utilities.ONE_INTEGER;
        }
        SubLObject value = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.ZERO_INTEGER);
        value = Numbers.add(value, increment);
        dictionary.dictionary_enter(v_dictionary, key, value);
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 12031L)
    public static SubLObject dictionary_decrement(final SubLObject v_dictionary, final SubLObject key, SubLObject decrement) {
        if (decrement == dictionary_utilities.UNPROVIDED) {
            decrement = (SubLObject)dictionary_utilities.ONE_INTEGER;
        }
        return dictionary_decrement_and_remove_if(v_dictionary, key, decrement, Symbols.symbol_function((SubLObject)dictionary_utilities.$sym13$FALSE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 12264L)
    public static SubLObject dictionary_decrement_and_remove_if(final SubLObject v_dictionary, final SubLObject key, SubLObject decrement, SubLObject test) {
        if (decrement == dictionary_utilities.UNPROVIDED) {
            decrement = (SubLObject)dictionary_utilities.ONE_INTEGER;
        }
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.$sym14$ZEROP);
        }
        SubLObject value = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.ZERO_INTEGER);
        value = Numbers.subtract(value, decrement);
        if (dictionary_utilities.NIL != Functions.funcall(test, value)) {
            dictionary.dictionary_remove(v_dictionary, key);
        }
        else {
            dictionary.dictionary_enter(v_dictionary, key, value);
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 12781L)
    public static SubLObject dictionary_extremal(final SubLObject v_dictionary, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert dictionary_utilities.NIL != dictionary.non_empty_dictionary_p(v_dictionary) : v_dictionary;
        SubLObject extreme_key = dictionary_arbitrary_key(v_dictionary);
        SubLObject extreme_value = dictionary.dictionary_lookup_without_values(v_dictionary, extreme_key, (SubLObject)dictionary_utilities.UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (dictionary_utilities.NIL != Functions.funcall(test, value, extreme_value)) {
                extreme_key = key;
                extreme_value = value;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Values.values(extreme_key, extreme_value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 13319L)
    public static SubLObject dictionary_total(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)dictionary_utilities.ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            assert dictionary_utilities.NIL != Types.numberp(value) : value;
            total = Numbers.add(total, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 13623L)
    public static SubLObject dictionary_to_alist(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject test = dictionary.dictionary_test(v_dictionary);
        SubLObject alist = (SubLObject)dictionary_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(key, value), alist);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Values.values(alist, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 14011L)
    public static SubLObject new_dictionary_from_alist(final SubLObject alist, SubLObject test) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        final SubLObject size = Sequences.length(alist);
        final SubLObject v_dictionary = dictionary.new_dictionary(test, size);
        SubLObject cdolist_list_var = alist;
        SubLObject cons = (SubLObject)dictionary_utilities.NIL;
        cons = cdolist_list_var.first();
        while (dictionary_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)dictionary_utilities.NIL;
            SubLObject value = (SubLObject)dictionary_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list17);
            key = current.first();
            current = (value = current.rest());
            dictionary.dictionary_enter(v_dictionary, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 14260L)
    public static SubLObject dictionary_to_tuples(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject test = dictionary.dictionary_test(v_dictionary);
        SubLObject tuples = (SubLObject)dictionary_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(key, value), tuples);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Values.values(tuples, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 14648L)
    public static SubLObject dictionary_to_paired_lists(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        SubLObject key_list = (SubLObject)dictionary_utilities.NIL;
        SubLObject val_list = (SubLObject)dictionary_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject val = thread.secondMultipleValue();
            thread.resetMultipleValues();
            key_list = (SubLObject)ConsesLow.cons(key, key_list);
            val_list = (SubLObject)ConsesLow.cons(val, val_list);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)ConsesLow.list(key_list, val_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 15013L)
    public static SubLObject new_dictionary_from_paired_lists_unique(final SubLObject key_list, final SubLObject value_list, SubLObject test) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        final SubLObject dict = dictionary.new_dictionary(test, (SubLObject)dictionary_utilities.UNPROVIDED);
        SubLObject key = (SubLObject)dictionary_utilities.NIL;
        SubLObject key_$1 = (SubLObject)dictionary_utilities.NIL;
        SubLObject value = (SubLObject)dictionary_utilities.NIL;
        SubLObject value_$2 = (SubLObject)dictionary_utilities.NIL;
        key = key_list;
        key_$1 = key.first();
        value = value_list;
        value_$2 = value.first();
        while (dictionary_utilities.NIL != value || dictionary_utilities.NIL != key) {
            dictionary.dictionary_enter(dict, key_$1, value_$2);
            key = key.rest();
            key_$1 = key.first();
            value = value.rest();
            value_$2 = value.first();
        }
        return dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 15316L)
    public static SubLObject new_dictionary_from_paired_lists_push(final SubLObject key_list, final SubLObject value_list, SubLObject test) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        final SubLObject dict = dictionary.new_dictionary(test, (SubLObject)dictionary_utilities.UNPROVIDED);
        SubLObject key = (SubLObject)dictionary_utilities.NIL;
        SubLObject key_$3 = (SubLObject)dictionary_utilities.NIL;
        SubLObject value = (SubLObject)dictionary_utilities.NIL;
        SubLObject value_$4 = (SubLObject)dictionary_utilities.NIL;
        key = key_list;
        key_$3 = key.first();
        value = value_list;
        value_$4 = value.first();
        while (dictionary_utilities.NIL != value || dictionary_utilities.NIL != key) {
            dictionary_push(dict, key_$3, value_$4);
            key = key.rest();
            key_$3 = key.first();
            value = value.rest();
            value_$4 = value.first();
        }
        return dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 15669L)
    public static SubLObject new_classification_dictionary(final SubLObject value_list, final SubLObject key_func, SubLObject test) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        final SubLObject key_list = Mapping.mapcar(key_func, value_list);
        return new_dictionary_from_paired_lists_push(key_list, value_list, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 16270L)
    public static SubLObject do_dictionary_accumulating(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)dictionary_utilities.NIL;
        SubLObject val = (SubLObject)dictionary_utilities.NIL;
        SubLObject dict_expression = (SubLObject)dictionary_utilities.NIL;
        SubLObject collection_var = (SubLObject)dictionary_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list18);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list18);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list18);
        dict_expression = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list18);
        collection_var = current.first();
        current = current.rest();
        if (dictionary_utilities.NIL == current) {
            current = temp;
            SubLObject iterated_expression = (SubLObject)dictionary_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list18);
            iterated_expression = current.first();
            current = current.rest();
            if (dictionary_utilities.NIL == current) {
                SubLObject ignores = (SubLObject)dictionary_utilities.NIL;
                if (dictionary_utilities.NIL == list_utilities.tree_find(val, iterated_expression, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED)) {
                    ignores = (SubLObject)ConsesLow.cons(val, ignores);
                }
                if (dictionary_utilities.NIL == list_utilities.tree_find(key, iterated_expression, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED)) {
                    ignores = (SubLObject)ConsesLow.cons(key, ignores);
                }
                final SubLObject dict_expression_var = (SubLObject)dictionary_utilities.$sym19$DICT_EXPRESSION_VAR;
                return (SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym20$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(dict_expression_var, dict_expression)), (SubLObject)ConsesLow.listS((SubLObject)dictionary_utilities.$sym21$CSETQ, collection_var, (SubLObject)dictionary_utilities.$list22), (SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym23$PWHEN, (SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym0$DICTIONARY_P, dict_expression_var), (SubLObject)ConsesLow.listS((SubLObject)dictionary_utilities.$sym24$DO_DICTIONARY, (SubLObject)ConsesLow.list(key, val, dict_expression), ConsesLow.append((SubLObject)((dictionary_utilities.NIL != ignores) ? ConsesLow.list(reader.bq_cons((SubLObject)dictionary_utilities.$sym25$IGNORE, ConsesLow.append(ignores, (SubLObject)dictionary_utilities.NIL))) : dictionary_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym26$CPUSH, iterated_expression, collection_var)))), (SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym21$CSETQ, collection_var, (SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym27$NREVERSE, collection_var))));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dictionary_utilities.$list18);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dictionary_utilities.$list18);
        }
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 17389L)
    public static SubLObject make_dictionary_from_text(final SubLObject path_string) {
        final SubLObject file_stream = compatibility.open_text(path_string, (SubLObject)dictionary_utilities.$kw28$INPUT);
        SubLObject current_line_as_list = (SubLObject)dictionary_utilities.NIL;
        SubLObject doneP = (SubLObject)dictionary_utilities.NIL;
        final SubLObject dict = dictionary.new_dictionary((SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED);
        while (dictionary_utilities.NIL == doneP) {
            current_line_as_list = list_utilities.safe_read_delimited_list((SubLObject)Characters.CHAR_newline, file_stream, (SubLObject)dictionary_utilities.UNPROVIDED);
            if (current_line_as_list.isString()) {
                doneP = (SubLObject)dictionary_utilities.T;
            }
            else {
                dictionary.dictionary_enter(dict, current_line_as_list.first(), conses_high.second(current_line_as_list));
            }
        }
        streams_high.close(file_stream, (SubLObject)dictionary_utilities.UNPROVIDED);
        return dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 18095L)
    public static SubLObject do_dictionary_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)dictionary_utilities.NIL;
        SubLObject value = (SubLObject)dictionary_utilities.NIL;
        SubLObject numvar = (SubLObject)dictionary_utilities.NIL;
        SubLObject v_dictionary = (SubLObject)dictionary_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list29);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list29);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list29);
        numvar = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list29);
        v_dictionary = current.first();
        current = current.rest();
        final SubLObject done = (SubLObject)(current.isCons() ? current.first() : dictionary_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)dictionary_utilities.$list29);
        current = current.rest();
        if (dictionary_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym20$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(numvar, (SubLObject)dictionary_utilities.$list30)), (SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym24$DO_DICTIONARY, (SubLObject)ConsesLow.list(key, value, v_dictionary, done), reader.bq_cons((SubLObject)dictionary_utilities.$sym31$PROGN, ConsesLow.append(body, (SubLObject)dictionary_utilities.NIL)), (SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym32$CINC, numvar)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dictionary_utilities.$list29);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 18443L)
    public static SubLObject print_dictionary_contents(final SubLObject dict, SubLObject stream) {
        if (stream == dictionary_utilities.UNPROVIDED) {
            stream = (SubLObject)dictionary_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            PrintLow.format(stream, (SubLObject)dictionary_utilities.$str33$_S_____S__, key, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 18604L)
    public static SubLObject print_dictionary_contents_wX_dictionary_values(final SubLObject dict, SubLObject stream) {
        if (stream == dictionary_utilities.UNPROVIDED) {
            stream = (SubLObject)dictionary_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            PrintLow.format(stream, (SubLObject)dictionary_utilities.$str34$_S____, key);
            if (dictionary_utilities.NIL != dictionary.dictionary_p(value)) {
                streams_high.terpri(stream);
                print_dictionary_contents(value, stream);
                streams_high.terpri(stream);
            }
            else {
                PrintLow.format(stream, (SubLObject)dictionary_utilities.$str35$_S__, value);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 18941L)
    public static SubLObject print_dictionary_contents_wX_hashtable_values(final SubLObject dict, SubLObject stream) {
        if (stream == dictionary_utilities.UNPROVIDED) {
            stream = (SubLObject)dictionary_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            PrintLow.format(stream, (SubLObject)dictionary_utilities.$str34$_S____, key);
            if (value.isHashtable()) {
                streams_high.terpri(stream);
                hash_table_utilities.printhash(value, stream);
                streams_high.terpri(stream);
            }
            else {
                PrintLow.format(stream, (SubLObject)dictionary_utilities.$str35$_S__, value);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 19261L)
    public static SubLObject print_dictionary_contents_to_csv(final SubLObject v_dictionary, SubLObject file_name, SubLObject key_header, SubLObject value_header) {
        if (key_header == dictionary_utilities.UNPROVIDED) {
            key_header = (SubLObject)dictionary_utilities.NIL;
        }
        if (value_header == dictionary_utilities.UNPROVIDED) {
            value_header = (SubLObject)dictionary_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert dictionary_utilities.NIL != Types.stringp(file_name) : file_name;
        if (dictionary_utilities.NIL == string_utilities.ends_with(file_name, (SubLObject)dictionary_utilities.$str37$_csv, (SubLObject)dictionary_utilities.UNPROVIDED)) {
            file_name = Sequences.cconcatenate(file_name, (SubLObject)dictionary_utilities.$str37$_csv);
        }
        if (dictionary_utilities.NIL != Filesys.probe_file(file_name)) {
            Filesys.delete_file(file_name);
        }
        SubLObject stream_var = (SubLObject)dictionary_utilities.NIL;
        try {
            final SubLObject out_stream;
            stream_var = (out_stream = StreamsLow.open(file_name, new SubLObject[] { dictionary_utilities.$kw38$DIRECTION, dictionary_utilities.$kw39$OUTPUT, dictionary_utilities.$kw40$IF_DOES_NOT_EXIST, dictionary_utilities.$kw41$CREATE }));
            if (key_header.isString() || value_header.isString()) {
                PrintLow.format(out_stream, (SubLObject)dictionary_utilities.$str42$_A___A__, key_header, value_header);
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject value = thread.secondMultipleValue();
                thread.resetMultipleValues();
                PrintLow.format(out_stream, (SubLObject)dictionary_utilities.$str43$_S___S__, key, value);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)dictionary_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (dictionary_utilities.NIL != stream_var) {
                    streams_high.close(stream_var, (SubLObject)dictionary_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return file_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 19961L)
    public static SubLObject new_dictionary_from_csv(final SubLObject file_name, SubLObject test, SubLObject has_header_rowP, SubLObject readP) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        if (has_header_rowP == dictionary_utilities.UNPROVIDED) {
            has_header_rowP = (SubLObject)dictionary_utilities.NIL;
        }
        if (readP == dictionary_utilities.UNPROVIDED) {
            readP = (SubLObject)dictionary_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(test, (SubLObject)dictionary_utilities.UNPROVIDED);
        SubLObject first_lineP = (SubLObject)dictionary_utilities.T;
        SubLObject stream = (SubLObject)dictionary_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)dictionary_utilities.NIL, thread);
                stream = compatibility.open_text(file_name, (SubLObject)dictionary_utilities.$kw28$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)dictionary_utilities.$str44$Unable_to_open__S, file_name);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$5 = stream_var;
                SubLObject line_number_var = (SubLObject)dictionary_utilities.NIL;
                SubLObject line = (SubLObject)dictionary_utilities.NIL;
                line_number_var = (SubLObject)dictionary_utilities.ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$5); dictionary_utilities.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$5)) {
                    final SubLObject tokenized_line = string_utilities.string_tokenize(line, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_comma), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$str45$_, (SubLObject)dictionary_utilities.$str45$_)), (SubLObject)dictionary_utilities.NIL, (SubLObject)dictionary_utilities.NIL, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_backslash), (SubLObject)dictionary_utilities.UNPROVIDED);
                    if (dictionary_utilities.NIL == first_lineP || dictionary_utilities.NIL == has_header_rowP) {
                        final SubLObject key = string_utilities.possibly_read_from_string_ignoring_errors(tokenized_line.first(), readP);
                        SubLObject value = (SubLObject)dictionary_utilities.NIL;
                        if (dictionary_utilities.NIL != list_utilities.doubletonP(tokenized_line)) {
                            value = string_utilities.possibly_read_from_string_ignoring_errors(conses_high.second(tokenized_line), readP);
                        }
                        else {
                            SubLObject cdolist_list_var = tokenized_line.rest();
                            SubLObject value_piece = (SubLObject)dictionary_utilities.NIL;
                            value_piece = cdolist_list_var.first();
                            while (dictionary_utilities.NIL != cdolist_list_var) {
                                value = (SubLObject)ConsesLow.cons(string_utilities.possibly_read_from_string_ignoring_errors(value_piece, readP), value);
                                cdolist_list_var = cdolist_list_var.rest();
                                value_piece = cdolist_list_var.first();
                            }
                            value = Sequences.nreverse(value);
                        }
                        dictionary.dictionary_enter(dict, key, value);
                    }
                    first_lineP = (SubLObject)dictionary_utilities.NIL;
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)dictionary_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)dictionary_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 20879L)
    public static SubLObject sort_dictionary_by_keys(final SubLObject v_dictionary, final SubLObject predicate) {
        final SubLObject alist = dictionary_to_alist(v_dictionary);
        final SubLObject sorted_alist = list_utilities.sort_alist_by_keys(alist, predicate);
        return sorted_alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 21132L)
    public static SubLObject sort_dictionary_by_values(final SubLObject v_dictionary, final SubLObject predicate) {
        final SubLObject alist = dictionary_to_alist(v_dictionary);
        final SubLObject sorted_alist = list_utilities.sort_alist_by_values(alist, predicate);
        return sorted_alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 21679L)
    public static SubLObject dictionary_keys_sorted_by_values(final SubLObject v_dictionary, final SubLObject predicate, SubLObject key) {
        if (key == dictionary_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)dictionary_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sorting_information = (SubLObject)ConsesLow.list(v_dictionary, predicate, key);
        final SubLObject unsorted_keys = dictionary.dictionary_keys(v_dictionary);
        SubLObject sorted_keys = (SubLObject)dictionary_utilities.NIL;
        final SubLObject _prev_bind_0 = dictionary_utilities.$dictionary_keys_sorter_current_sorting_information$.currentBinding(thread);
        try {
            dictionary_utilities.$dictionary_keys_sorter_current_sorting_information$.bind(sorting_information, thread);
            sorted_keys = Sort.sort(unsorted_keys, (SubLObject)dictionary_utilities.$sym46$DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE, (SubLObject)dictionary_utilities.UNPROVIDED);
        }
        finally {
            dictionary_utilities.$dictionary_keys_sorter_current_sorting_information$.rebind(_prev_bind_0, thread);
        }
        return sorted_keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 22271L)
    public static SubLObject dictionary_keys_sorter_comparison_predicate(final SubLObject key_a, final SubLObject key_b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = dictionary_utilities.$dictionary_keys_sorter_current_sorting_information$.getDynamicValue(thread);
        SubLObject v_dictionary = (SubLObject)dictionary_utilities.NIL;
        SubLObject predicate = (SubLObject)dictionary_utilities.NIL;
        SubLObject key = (SubLObject)dictionary_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list47);
        v_dictionary = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list47);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list47);
        key = current.first();
        current = current.rest();
        if (dictionary_utilities.NIL == current) {
            final SubLObject raw_value_a = dictionary.dictionary_lookup_without_values(v_dictionary, key_a, (SubLObject)dictionary_utilities.UNPROVIDED);
            final SubLObject value_a = Functions.funcall(key, raw_value_a);
            final SubLObject raw_value_b = dictionary.dictionary_lookup_without_values(v_dictionary, key_b, (SubLObject)dictionary_utilities.UNPROVIDED);
            final SubLObject value_b = Functions.funcall(key, raw_value_b);
            return Functions.funcall(predicate, value_a, value_b);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dictionary_utilities.$list47);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 22957L)
    public static SubLObject test_dictionary_keys_sorted_by_values(final SubLObject alist, final SubLObject sort_pred, SubLObject key) {
        if (key == dictionary_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)dictionary_utilities.IDENTITY);
        }
        final SubLObject v_dictionary = new_dictionary_from_alist(alist, (SubLObject)dictionary_utilities.UNPROVIDED);
        return dictionary_keys_sorted_by_values(v_dictionary, sort_pred, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 23187L)
    public static SubLObject map_dictionary_values(final SubLObject v_dictionary, final SubLObject functor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_dictionary = dictionary.new_dictionary(dictionary.dictionary_test(v_dictionary), dictionary.dictionary_length(v_dictionary));
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_enter(new_dictionary, key, Functions.funcall(functor, value));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 23915L)
    public static SubLObject test_map_dictionary_values(final SubLObject alist, final SubLObject functor, final SubLObject testfn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_dictionary = new_dictionary_from_alist(alist, (SubLObject)dictionary_utilities.UNPROVIDED);
        final SubLObject new_dictionary = map_dictionary_values(old_dictionary, functor);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(old_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject expected_new_value = Functions.funcall(functor, value);
            final SubLObject resulting_new_value = dictionary.dictionary_lookup(new_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED);
            if (dictionary_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && dictionary_utilities.NIL == Functions.funcall(testfn, expected_new_value, resulting_new_value)) {
                Errors.error((SubLObject)dictionary_utilities.$str48$For_key__A__the_computed_new_valu, new SubLObject[] { key, resulting_new_value, testfn, expected_new_value });
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)dictionary_utilities.$kw49$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 24538L)
    public static SubLObject partition_dictionary_keys_into_n_tiles(final SubLObject v_dictionary, final SubLObject n, SubLObject ordered_keys) {
        if (ordered_keys == dictionary_utilities.UNPROVIDED) {
            ordered_keys = (SubLObject)dictionary_utilities.NIL;
        }
        if (dictionary_utilities.NIL != dictionary.dictionary_empty_p(v_dictionary)) {
            return (SubLObject)dictionary_utilities.NIL;
        }
        if (dictionary_utilities.NIL == ordered_keys) {
            ordered_keys = dictionary_keys_sorted_by_values(v_dictionary, Symbols.symbol_function((SubLObject)dictionary_utilities.$sym50$_), (SubLObject)dictionary_utilities.UNPROVIDED);
        }
        final SubLObject total = dictionary_total(v_dictionary);
        final SubLObject tile_width = Numbers.divide(total, n);
        SubLObject tile_border = (SubLObject)dictionary_utilities.ZERO_INTEGER;
        final SubLObject last_tile_border = Numbers.multiply(tile_width, Numbers.subtract(n, (SubLObject)dictionary_utilities.ONE_INTEGER));
        SubLObject sum = (SubLObject)dictionary_utilities.ZERO_INTEGER;
        SubLObject partition = (SubLObject)dictionary_utilities.NIL;
        SubLObject doneP = (SubLObject)dictionary_utilities.NIL;
        SubLObject list_var = (SubLObject)dictionary_utilities.NIL;
        SubLObject key = (SubLObject)dictionary_utilities.NIL;
        SubLObject position = (SubLObject)dictionary_utilities.NIL;
        list_var = ordered_keys;
        key = list_var.first();
        for (position = (SubLObject)dictionary_utilities.ZERO_INTEGER; dictionary_utilities.NIL == doneP && dictionary_utilities.NIL != list_var; list_var = list_var.rest(), key = list_var.first(), position = Numbers.add((SubLObject)dictionary_utilities.ONE_INTEGER, position)) {
            final SubLObject number = dictionary.dictionary_lookup_without_values(v_dictionary, key, (SubLObject)dictionary_utilities.ZERO_INTEGER);
            for (sum = Numbers.add(sum, number); sum.numG(tile_border); tile_border = Numbers.add(tile_border, tile_width), doneP = Numbers.numGE(tile_border, last_tile_border)) {
                partition = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(key, position, sum), partition);
            }
        }
        final SubLObject last_key = conses_high.last(ordered_keys, (SubLObject)dictionary_utilities.UNPROVIDED).first();
        final SubLObject last_pos = Numbers.subtract(dictionary.dictionary_length(v_dictionary), (SubLObject)dictionary_utilities.ONE_INTEGER);
        partition = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(last_key, last_pos, total), partition);
        return Sequences.nreverse(partition);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 26295L)
    public static SubLObject do_dictionary_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list51);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)dictionary_utilities.NIL;
        SubLObject v_dictionary = (SubLObject)dictionary_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list51);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list51);
        v_dictionary = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dictionary_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dictionary_utilities.NIL;
        SubLObject current_$6 = (SubLObject)dictionary_utilities.NIL;
        while (dictionary_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dictionary_utilities.$list51);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dictionary_utilities.$list51);
            if (dictionary_utilities.NIL == conses_high.member(current_$6, (SubLObject)dictionary_utilities.$list52, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED)) {
                bad = (SubLObject)dictionary_utilities.T;
            }
            if (current_$6 == dictionary_utilities.$kw53$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dictionary_utilities.NIL != bad && dictionary_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dictionary_utilities.$list51);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)dictionary_utilities.$kw54$DONE, current);
        final SubLObject done = (SubLObject)((dictionary_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : dictionary_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject value = (SubLObject)dictionary_utilities.$sym55$VALUE;
        return (SubLObject)ConsesLow.listS((SubLObject)dictionary_utilities.$sym24$DO_DICTIONARY, (SubLObject)ConsesLow.list(key, value, v_dictionary, done), (SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym25$IGNORE, value), ConsesLow.append(body, (SubLObject)dictionary_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 26956L)
    public static SubLObject do_dictionary_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = (SubLObject)dictionary_utilities.NIL;
        SubLObject v_dictionary = (SubLObject)dictionary_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list56);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list56);
        v_dictionary = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dictionary_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dictionary_utilities.NIL;
        SubLObject current_$7 = (SubLObject)dictionary_utilities.NIL;
        while (dictionary_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dictionary_utilities.$list56);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dictionary_utilities.$list56);
            if (dictionary_utilities.NIL == conses_high.member(current_$7, (SubLObject)dictionary_utilities.$list52, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED)) {
                bad = (SubLObject)dictionary_utilities.T;
            }
            if (current_$7 == dictionary_utilities.$kw53$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dictionary_utilities.NIL != bad && dictionary_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dictionary_utilities.$list56);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)dictionary_utilities.$kw54$DONE, current);
        final SubLObject done = (SubLObject)((dictionary_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : dictionary_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject key = (SubLObject)dictionary_utilities.$sym57$KEY;
        return (SubLObject)ConsesLow.listS((SubLObject)dictionary_utilities.$sym24$DO_DICTIONARY, (SubLObject)ConsesLow.list(key, value, v_dictionary, done), (SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.$sym25$IGNORE, key), ConsesLow.append(body, (SubLObject)dictionary_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 27153L)
    public static SubLObject add_tuple_list_to_dictionary(final SubLObject tuple_list, SubLObject v_dictionary) {
        if (v_dictionary == dictionary_utilities.UNPROVIDED) {
            v_dictionary = (SubLObject)dictionary_utilities.NIL;
        }
        if (dictionary_utilities.NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary((SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED);
        }
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        assert dictionary_utilities.NIL != Types.listp(tuple_list) : tuple_list;
        SubLObject cdolist_list_var = tuple_list;
        SubLObject tuple = (SubLObject)dictionary_utilities.NIL;
        tuple = cdolist_list_var.first();
        while (dictionary_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject key = (SubLObject)dictionary_utilities.NIL;
            SubLObject value = (SubLObject)dictionary_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list58);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary_utilities.$list58);
            value = current.first();
            current = current.rest();
            if (dictionary_utilities.NIL == current) {
                dictionary.dictionary_enter(v_dictionary, key, value);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dictionary_utilities.$list58);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 27810L)
    public static SubLObject add_values_from_lists_to_dictionary(final SubLObject key_list, final SubLObject value_list, SubLObject v_dictionary) {
        if (v_dictionary == dictionary_utilities.UNPROVIDED) {
            v_dictionary = (SubLObject)dictionary_utilities.NIL;
        }
        if (dictionary_utilities.NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary((SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED);
        }
        assert dictionary_utilities.NIL != dictionary.dictionary_p(v_dictionary) : v_dictionary;
        assert dictionary_utilities.NIL != Types.listp(key_list) : key_list;
        assert dictionary_utilities.NIL != Types.listp(value_list) : value_list;
        SubLObject key = (SubLObject)dictionary_utilities.NIL;
        SubLObject key_$8 = (SubLObject)dictionary_utilities.NIL;
        SubLObject value = (SubLObject)dictionary_utilities.NIL;
        SubLObject value_$9 = (SubLObject)dictionary_utilities.NIL;
        key = key_list;
        key_$8 = key.first();
        value = value_list;
        value_$9 = value.first();
        while (dictionary_utilities.NIL != value || dictionary_utilities.NIL != key) {
            dictionary.dictionary_enter(v_dictionary, key_$8, value_$9);
            key = key.rest();
            key_$8 = key.first();
            value = value.rest();
            value_$9 = value.first();
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 28414L)
    public static SubLObject dictionary_reverse_lookup(final SubLObject v_dictionary, final SubLObject value, SubLObject not_found) {
        if (not_found == dictionary_utilities.UNPROVIDED) {
            not_found = (SubLObject)dictionary_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject candidate_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (value.equal(candidate_value)) {
                return key;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return not_found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 28623L)
    public static SubLObject dictionary_keys_with_value(final SubLObject v_dictionary, final SubLObject value, SubLObject not_found) {
        if (not_found == dictionary_utilities.UNPROVIDED) {
            not_found = (SubLObject)dictionary_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)dictionary_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject candidate_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (value.equal(candidate_value)) {
                result = (SubLObject)ConsesLow.cons(key, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (dictionary_utilities.NIL != result) {
            return Sequences.nreverse(result);
        }
        return not_found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 29063L)
    public static SubLObject dictionary_has_keyP(final SubLObject v_dictionary, final SubLObject key) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!dictionary_utilities.$key_missing$.getGlobalValue().eql(dictionary.dictionary_lookup_without_values(v_dictionary, key, dictionary_utilities.$key_missing$.getGlobalValue())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 29276L)
    public static SubLObject dictionary_has_valueP(final SubLObject v_dictionary, final SubLObject value, SubLObject test) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject this_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (dictionary_utilities.NIL != Functions.funcall(test, this_value, value)) {
                return (SubLObject)dictionary_utilities.T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 29550L)
    public static SubLObject dictionary_nmerge(final SubLObject target_dict, final SubLObject source_dict, SubLObject warn_on_conflictsP) {
        if (warn_on_conflictsP == dictionary_utilities.UNPROVIDED) {
            warn_on_conflictsP = (SubLObject)dictionary_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_dict)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (dictionary_utilities.NIL != warn_on_conflictsP) {
                thread.resetMultipleValues();
                final SubLObject old_value = dictionary.dictionary_lookup(target_dict, key, (SubLObject)dictionary_utilities.UNPROVIDED);
                final SubLObject foundP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (dictionary_utilities.NIL != foundP) {
                    Errors.warn((SubLObject)dictionary_utilities.$str60$Overwriting__s_from__s_to__s, key, old_value, value);
                }
            }
            dictionary.dictionary_enter(target_dict, key, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return target_dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 30171L)
    public static SubLObject dictionary_merge(final SubLObject target_dict, final SubLObject source_dict, SubLObject warn_on_conflictsP) {
        if (warn_on_conflictsP == dictionary_utilities.UNPROVIDED) {
            warn_on_conflictsP = (SubLObject)dictionary_utilities.NIL;
        }
        final SubLObject new_dict = copy_dictionary(target_dict);
        return dictionary_nmerge(new_dict, source_dict, warn_on_conflictsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 30686L)
    public static SubLObject dictionary_merge_list_values(final SubLObject target_dict, final SubLObject source_dict, SubLObject test, SubLObject key_accessor) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        if (key_accessor == dictionary_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)dictionary_utilities.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert dictionary_utilities.NIL != dictionary.dictionary_p(target_dict) : target_dict;
        assert dictionary_utilities.NIL != dictionary.dictionary_p(source_dict) : source_dict;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_dict)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (dictionary_utilities.NIL != dictionary.dictionary_lookup(target_dict, key, (SubLObject)dictionary_utilities.UNPROVIDED)) {
                SubLObject cdolist_list_var = value_list;
                SubLObject value = (SubLObject)dictionary_utilities.NIL;
                value = cdolist_list_var.first();
                while (dictionary_utilities.NIL != cdolist_list_var) {
                    dictionary_pushnew(target_dict, key, value, test, key_accessor);
                    cdolist_list_var = cdolist_list_var.rest();
                    value = cdolist_list_var.first();
                }
            }
            else {
                dictionary.dictionary_enter(target_dict, key, value_list);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 31638L)
    public static SubLObject dictionary_nsum(final SubLObject target_dict, final SubLObject source_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_dict)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary_increment(target_dict, key, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return target_dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 31966L)
    public static SubLObject dictionary_sum(final SubLObject target_dict, final SubLObject source_dict) {
        final SubLObject new_dict = copy_dictionary(target_dict);
        return dictionary_nsum(new_dict, source_dict);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 32380L)
    public static SubLObject sub_dictionaryP(final SubLObject small, final SubLObject big, SubLObject test) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = dictionary.dictionary_test(small);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (small.eql(big)) {
            return (SubLObject)dictionary_utilities.T;
        }
        SubLObject failP;
        SubLObject iteration_state;
        SubLObject small_value;
        SubLObject big_value;
        for (failP = (SubLObject)dictionary_utilities.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(small)); dictionary_utilities.NIL == failP && dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); failP = (SubLObject)SubLObjectFactory.makeBoolean(dictionary_utilities.NIL == Functions.funcall(test, small_value, big_value)), iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            small_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            big_value = dictionary.dictionary_lookup(big, key, dictionary_utilities.$sub_dictionary_not_found$.getGlobalValue());
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)SubLObjectFactory.makeBoolean(dictionary_utilities.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33048L)
    public static SubLObject dictionaries_coextensionalP(final SubLObject dict_a, final SubLObject dict_b, SubLObject test) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = dictionary.dictionary_test(dict_a);
        }
        if (dict_a.eql(dict_b)) {
            return (SubLObject)dictionary_utilities.T;
        }
        if (dictionary.dictionary_length(dict_a).numE(dictionary.dictionary_length(dict_b))) {
            return (SubLObject)SubLObjectFactory.makeBoolean(dictionary_utilities.NIL != sub_dictionaryP(dict_a, dict_b, test) && dictionary_utilities.NIL != sub_dictionaryP(dict_b, dict_a, test));
        }
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33873L)
    public static SubLObject synchronized_dictionary_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_synchronized_dictionary(v_object, stream, (SubLObject)dictionary_utilities.ZERO_INTEGER);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33873L)
    public static SubLObject synchronized_dictionary_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $synchronized_dictionary_native.class) ? dictionary_utilities.T : dictionary_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33873L)
    public static SubLObject synchronized_dictionary_dictionary(final SubLObject v_object) {
        assert dictionary_utilities.NIL != synchronized_dictionary_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33873L)
    public static SubLObject synchronized_dictionary_lock(final SubLObject v_object) {
        assert dictionary_utilities.NIL != synchronized_dictionary_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33873L)
    public static SubLObject _csetf_synchronized_dictionary_dictionary(final SubLObject v_object, final SubLObject value) {
        assert dictionary_utilities.NIL != synchronized_dictionary_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33873L)
    public static SubLObject _csetf_synchronized_dictionary_lock(final SubLObject v_object, final SubLObject value) {
        assert dictionary_utilities.NIL != synchronized_dictionary_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33873L)
    public static SubLObject make_synchronized_dictionary(SubLObject arglist) {
        if (arglist == dictionary_utilities.UNPROVIDED) {
            arglist = (SubLObject)dictionary_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $synchronized_dictionary_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)dictionary_utilities.NIL, next = arglist; dictionary_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)dictionary_utilities.$kw75$DICTIONARY)) {
                _csetf_synchronized_dictionary_dictionary(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)dictionary_utilities.$kw76$LOCK)) {
                _csetf_synchronized_dictionary_lock(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)dictionary_utilities.$str77$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33873L)
    public static SubLObject visit_defstruct_synchronized_dictionary(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)dictionary_utilities.$kw78$BEGIN, (SubLObject)dictionary_utilities.$sym79$MAKE_SYNCHRONIZED_DICTIONARY, (SubLObject)dictionary_utilities.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)dictionary_utilities.$kw80$SLOT, (SubLObject)dictionary_utilities.$kw75$DICTIONARY, synchronized_dictionary_dictionary(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)dictionary_utilities.$kw80$SLOT, (SubLObject)dictionary_utilities.$kw76$LOCK, synchronized_dictionary_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)dictionary_utilities.$kw81$END, (SubLObject)dictionary_utilities.$sym79$MAKE_SYNCHRONIZED_DICTIONARY, (SubLObject)dictionary_utilities.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33873L)
    public static SubLObject visit_defstruct_object_synchronized_dictionary_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_synchronized_dictionary(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 33985L)
    public static SubLObject new_synchronized_dictionary(SubLObject test, SubLObject size) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        if (size == dictionary_utilities.UNPROVIDED) {
            size = (SubLObject)dictionary_utilities.ZERO_INTEGER;
        }
        final SubLObject sd = make_synchronized_dictionary((SubLObject)dictionary_utilities.UNPROVIDED);
        _csetf_synchronized_dictionary_dictionary(sd, dictionary.new_dictionary(test, size));
        _csetf_synchronized_dictionary_lock(sd, Locks.make_lock((SubLObject)dictionary_utilities.$str83$Synchronized_Dictionary_Lock));
        return sd;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 34293L)
    public static SubLObject synchronized_dictionary_test(final SubLObject synchronized_dictionary) {
        assert dictionary_utilities.NIL != synchronized_dictionary_p(synchronized_dictionary) : synchronized_dictionary;
        SubLObject test = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            test = dictionary.dictionary_test(synchronized_dictionary_dictionary(synchronized_dictionary));
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return test;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 34760L)
    public static SubLObject print_synchronized_dictionary(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (dictionary_utilities.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)dictionary_utilities.T, (SubLObject)dictionary_utilities.T);
            final SubLObject lock = synchronized_dictionary_lock(v_object);
            SubLObject release = (SubLObject)dictionary_utilities.NIL;
            try {
                release = Locks.seize_lock(lock);
                PrintLow.format(stream, (SubLObject)dictionary_utilities.$str84$DICTIONARY___A___LOCK___A__, dictionary.print_dictionary(synchronized_dictionary_dictionary(v_object), stream, depth), synchronized_dictionary_lock(v_object));
            }
            finally {
                if (dictionary_utilities.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)dictionary_utilities.T, (SubLObject)dictionary_utilities.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 35152L)
    public static SubLObject clear_synchronized_dictionary(final SubLObject synchronized_dictionary) {
        assert dictionary_utilities.NIL != synchronized_dictionary_p(synchronized_dictionary) : synchronized_dictionary;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            dictionary.clear_dictionary(synchronized_dictionary_dictionary(synchronized_dictionary));
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return synchronized_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 35482L)
    public static SubLObject synchronized_dictionary_enter(final SubLObject synchronized_dictionary, final SubLObject key, final SubLObject value) {
        assert dictionary_utilities.NIL != synchronized_dictionary_p(synchronized_dictionary) : synchronized_dictionary;
        SubLObject result = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            result = dictionary.dictionary_enter(synchronized_dictionary_dictionary(synchronized_dictionary), key, value);
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 35854L)
    public static SubLObject synchronized_dictionary_enter_unless(final SubLObject synchronized_dictionary, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        assert dictionary_utilities.NIL != synchronized_dictionary_p(synchronized_dictionary) : synchronized_dictionary;
        SubLObject result = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            if (dictionary_utilities.NIL == Functions.funcall(test_func, synchronized_dictionary_lookup(synchronized_dictionary, key, (SubLObject)dictionary_utilities.UNPROVIDED))) {
                result = dictionary.dictionary_enter(synchronized_dictionary_dictionary(synchronized_dictionary), key, value);
                return result;
            }
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return (SubLObject)dictionary_utilities.$kw86$NOT_SET;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 36351L)
    public static SubLObject synchronized_dictionary_remove(final SubLObject synchronized_dictionary, final SubLObject key) {
        assert dictionary_utilities.NIL != synchronized_dictionary_p(synchronized_dictionary) : synchronized_dictionary;
        SubLObject result = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            result = dictionary.dictionary_remove(synchronized_dictionary_dictionary(synchronized_dictionary), key);
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 36711L)
    public static SubLObject synchronized_dictionary_lookup(final SubLObject synchronized_dictionary, final SubLObject key, SubLObject not_found) {
        if (not_found == dictionary_utilities.UNPROVIDED) {
            not_found = (SubLObject)dictionary_utilities.NIL;
        }
        assert dictionary_utilities.NIL != synchronized_dictionary_p(synchronized_dictionary) : synchronized_dictionary;
        SubLObject result = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            result = dictionary.dictionary_lookup(synchronized_dictionary_dictionary(synchronized_dictionary), key, not_found);
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 37103L)
    public static SubLObject synchronized_dictionary_lookup_without_values(final SubLObject synchronized_dictionary, final SubLObject key, SubLObject not_found) {
        if (not_found == dictionary_utilities.UNPROVIDED) {
            not_found = (SubLObject)dictionary_utilities.NIL;
        }
        assert dictionary_utilities.NIL != synchronized_dictionary_p(synchronized_dictionary) : synchronized_dictionary;
        SubLObject result = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            result = dictionary.dictionary_lookup_without_values(synchronized_dictionary_dictionary(synchronized_dictionary), key, not_found);
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 37525L)
    public static SubLObject synchronized_dictionary_push(final SubLObject synchronized_dictionary, final SubLObject key, final SubLObject value) {
        assert dictionary_utilities.NIL != synchronized_dictionary_p(synchronized_dictionary) : synchronized_dictionary;
        SubLObject result = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            result = dictionary_push(synchronized_dictionary_dictionary(synchronized_dictionary), key, value);
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 37901L)
    public static SubLObject synchronized_dictionary_delete_from_value(final SubLObject synchronized_dictionary, final SubLObject key, final SubLObject elt, SubLObject test, SubLObject key_accessor) {
        if (test == dictionary_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary_utilities.EQL);
        }
        if (key_accessor == dictionary_utilities.UNPROVIDED) {
            key_accessor = Symbols.symbol_function((SubLObject)dictionary_utilities.IDENTITY);
        }
        assert dictionary_utilities.NIL != synchronized_dictionary_p(synchronized_dictionary) : synchronized_dictionary;
        SubLObject result = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            result = dictionary_delete_from_value(synchronized_dictionary_dictionary(synchronized_dictionary), key, elt, test, key_accessor);
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 38360L)
    public static SubLObject synchronized_dictionary_keys(final SubLObject synchronized_dictionary) {
        SubLObject keys = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            keys = dictionary.dictionary_keys(synchronized_dictionary_dictionary(synchronized_dictionary));
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 38703L)
    public static SubLObject synchronized_dictionary_values(final SubLObject synchronized_dictionary) {
        SubLObject values = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            values = dictionary.dictionary_values(synchronized_dictionary_dictionary(synchronized_dictionary));
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 39058L)
    public static SubLObject synchronized_dictionary_length(final SubLObject synchronized_dictionary) {
        SubLObject size = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            size = dictionary.dictionary_length(synchronized_dictionary_dictionary(synchronized_dictionary));
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return size;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 39400L)
    public static SubLObject synchronized_dictionary_arbitrary_key(final SubLObject synchronized_dictionary) {
        SubLObject key = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            key = dictionary_arbitrary_key(synchronized_dictionary_dictionary(synchronized_dictionary));
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 39749L)
    public static SubLObject new_synchronized_dictionary_iterator(final SubLObject synchronized_dictionary) {
        SubLObject replica = (SubLObject)dictionary_utilities.NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = (SubLObject)dictionary_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            replica = copy_dictionary(synchronized_dictionary_dictionary(synchronized_dictionary));
        }
        finally {
            if (dictionary_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return dictionary.new_dictionary_iterator(replica);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 40141L)
    public static SubLObject is_map_object_p_synchronized_dictionary_method(final SubLObject v_object) {
        return (SubLObject)dictionary_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 40245L)
    public static SubLObject map_object_size_synchronized_dictionary_method(final SubLObject v_object) {
        return synchronized_dictionary_length(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 40361L)
    public static SubLObject map_object_test_synchronized_dictionary_method(final SubLObject v_object) {
        return synchronized_dictionary_test(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 40475L)
    public static SubLObject map_object_put_synchronized_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return synchronized_dictionary_enter(v_object, key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 40609L)
    public static SubLObject map_object_put_unless_synchronized_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        return synchronized_dictionary_enter_unless(v_object, key, value, test_func);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 40777L)
    public static SubLObject map_object_get_synchronized_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return synchronized_dictionary_lookup(v_object, key, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 40920L)
    public static SubLObject map_object_get_without_values_synchronized_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return synchronized_dictionary_lookup_without_values(v_object, key, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 41093L)
    public static SubLObject map_object_remove_synchronized_dictionary_method(final SubLObject v_object, final SubLObject key) {
        return synchronized_dictionary_remove(v_object, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 41219L)
    public static SubLObject new_map_object_with_same_properties_synchronized_dictionary_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return new_synchronized_dictionary(test, size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 41365L)
    public static SubLObject map_object_arbitrary_key_synchronized_dictionary_method(final SubLObject v_object) {
        return synchronized_dictionary_arbitrary_key(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 41497L)
    public static SubLObject new_map_object_iterator_synchronized_dictionary_method(final SubLObject v_object) {
        return new_synchronized_dictionary_iterator(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 41627L)
    public static SubLObject map_object_remove_all_synchronized_dictionary_method(final SubLObject v_object) {
        return clear_synchronized_dictionary(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 41748L)
    public static SubLObject map_object_keys_synchronized_dictionary_method(final SubLObject v_object) {
        return synchronized_dictionary_keys(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 41862L)
    public static SubLObject map_object_values_synchronized_dictionary_method(final SubLObject v_object) {
        return synchronized_dictionary_values(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 41980L)
    public static SubLObject test_timings_of_alist_of_size(final SubLObject size, final SubLObject repetitions) {
        SubLObject the_alist = (SubLObject)dictionary_utilities.NIL;
        SubLObject v_timing = (SubLObject)dictionary_utilities.NIL;
        SubLObject i;
        for (i = (SubLObject)dictionary_utilities.NIL, i = (SubLObject)dictionary_utilities.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
            the_alist = list_utilities.alist_enter(the_alist, constants_high.find_constant_by_internal_id(i), i, (SubLObject)dictionary_utilities.UNPROVIDED);
        }
        final SubLObject time_var = Time.get_internal_real_time();
        SubLObject cdotimes_end_var;
        SubLObject j;
        SubLObject k;
        SubLObject value;
        for (cdotimes_end_var = Numbers.divide(repetitions, size), j = (SubLObject)dictionary_utilities.NIL, j = (SubLObject)dictionary_utilities.ZERO_INTEGER; j.numL(cdotimes_end_var); j = Numbers.add(j, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
            for (k = (SubLObject)dictionary_utilities.NIL, k = (SubLObject)dictionary_utilities.ZERO_INTEGER; k.numL(size); k = Numbers.add(k, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
                value = list_utilities.alist_lookup(the_alist, constants_high.find_constant_by_internal_id(k), (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED);
            }
        }
        v_timing = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return v_timing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 42595L)
    public static SubLObject test_timings_of_hashtable_of_size(final SubLObject size, final SubLObject repetitions) {
        final SubLObject the_hashtable = Hashtables.make_hash_table(size, (SubLObject)dictionary_utilities.EQ, (SubLObject)dictionary_utilities.UNPROVIDED);
        SubLObject v_timing = (SubLObject)dictionary_utilities.NIL;
        SubLObject i;
        for (i = (SubLObject)dictionary_utilities.NIL, i = (SubLObject)dictionary_utilities.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
            Hashtables.sethash(constants_high.find_constant_by_internal_id(i), the_hashtable, i);
        }
        final SubLObject time_var = Time.get_internal_real_time();
        SubLObject cdotimes_end_var;
        SubLObject j;
        SubLObject k;
        SubLObject value;
        for (cdotimes_end_var = Numbers.divide(repetitions, size), j = (SubLObject)dictionary_utilities.NIL, j = (SubLObject)dictionary_utilities.ZERO_INTEGER; j.numL(cdotimes_end_var); j = Numbers.add(j, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
            for (k = (SubLObject)dictionary_utilities.NIL, k = (SubLObject)dictionary_utilities.ZERO_INTEGER; k.numL(size); k = Numbers.add(k, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
                value = Hashtables.gethash(constants_high.find_constant_by_internal_id(k), the_hashtable, (SubLObject)dictionary_utilities.UNPROVIDED);
            }
        }
        v_timing = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return v_timing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 43062L)
    public static SubLObject estimate_optimal_dictionary_watermark(SubLObject max_size, SubLObject repetitions) {
        if (max_size == dictionary_utilities.UNPROVIDED) {
            max_size = (SubLObject)dictionary_utilities.$int101$50;
        }
        if (repetitions == dictionary_utilities.UNPROVIDED) {
            repetitions = (SubLObject)dictionary_utilities.$int102$3000000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)dictionary_utilities.MINUS_ONE_INTEGER;
        SubLObject i;
        SubLObject size;
        SubLObject alist_timings;
        SubLObject hashtable_timings;
        for (i = (SubLObject)dictionary_utilities.NIL, i = (SubLObject)dictionary_utilities.ZERO_INTEGER; i.numL(max_size); i = Numbers.add(i, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
            size = Numbers.add((SubLObject)dictionary_utilities.TWO_INTEGER, i);
            alist_timings = test_timings_of_alist_of_size(size, repetitions);
            hashtable_timings = test_timings_of_hashtable_of_size(size, repetitions);
            PrintLow.format((SubLObject)dictionary_utilities.T, (SubLObject)dictionary_utilities.$str103$Testing_size__A_ALIST__A_HASHTABL, new SubLObject[] { size, alist_timings, hashtable_timings });
            streams_high.force_output(StreamsLow.$terminal_io$.getDynamicValue(thread));
            if (result.numE((SubLObject)dictionary_utilities.MINUS_ONE_INTEGER) && hashtable_timings.numL(alist_timings)) {
                result = size;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 43682L)
    public static SubLObject test_dictionary_key_conflation(final SubLObject test, final SubLObject raw_items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_dictionary = dictionary.new_dictionary(test, (SubLObject)dictionary_utilities.UNPROVIDED);
        final SubLObject unique_items = Sequences.remove_duplicates(raw_items, test, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = raw_items;
        SubLObject item = (SubLObject)dictionary_utilities.NIL;
        item = cdolist_list_var.first();
        while (dictionary_utilities.NIL != cdolist_list_var) {
            dictionary.dictionary_enter(v_dictionary, item, (SubLObject)dictionary_utilities.$kw116$PRESENT);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        final SubLObject expected = Sequences.length(unique_items);
        final SubLObject actual = dictionary.dictionary_length(v_dictionary);
        if (dictionary_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected.numE(actual)) {
            Errors.error((SubLObject)dictionary_utilities.$str117$Expected__A_entries__but_got__A_, expected, actual);
        }
        return (SubLObject)dictionary_utilities.$kw49$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 43682L)
    public static SubLObject test_hashtable_speed(final SubLObject initial_size, final SubLObject sethash_count, final SubLObject do_count) {
        final SubLObject hash = Hashtables.make_hash_table(initial_size, (SubLObject)dictionary_utilities.UNPROVIDED, (SubLObject)dictionary_utilities.UNPROVIDED);
        SubLObject n;
        for (n = (SubLObject)dictionary_utilities.NIL, n = (SubLObject)dictionary_utilities.ZERO_INTEGER; n.numL(sethash_count); n = Numbers.add(n, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
            Hashtables.sethash(n, hash, n);
        }
        SubLObject k;
        SubLObject v;
        Iterator cdohash_iterator;
        Map.Entry cdohash_entry;
        for (n = (SubLObject)dictionary_utilities.NIL, n = (SubLObject)dictionary_utilities.ZERO_INTEGER; n.numL(do_count); n = Numbers.add(n, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
            k = (SubLObject)dictionary_utilities.NIL;
            v = (SubLObject)dictionary_utilities.NIL;
            cdohash_iterator = Hashtables.getEntrySetIterator(hash);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    k = Hashtables.getEntryKey(cdohash_entry);
                    v = Hashtables.getEntryValue(cdohash_entry);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary-utilities.lisp", position = 43682L)
    public static SubLObject test_dictionary_speed(final SubLObject initial_size, final SubLObject sethash_count, final SubLObject do_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)dictionary_utilities.EQL), initial_size);
        SubLObject n;
        for (n = (SubLObject)dictionary_utilities.NIL, n = (SubLObject)dictionary_utilities.ZERO_INTEGER; n.numL(sethash_count); n = Numbers.add(n, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
            dictionary.dictionary_enter(dict, n, n);
        }
        SubLObject iteration_state;
        SubLObject k;
        SubLObject v;
        for (n = (SubLObject)dictionary_utilities.NIL, n = (SubLObject)dictionary_utilities.ZERO_INTEGER; n.numL(do_count); n = Numbers.add(n, (SubLObject)dictionary_utilities.ONE_INTEGER)) {
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); dictionary_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                k = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                v = thread.secondMultipleValue();
                thread.resetMultipleValues();
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    public static SubLObject declare_dictionary_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_arbitrary_key", "DICTIONARY-ARBITRARY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "copy_dictionary", "COPY-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "copy_dictionary_recursive", "COPY-DICTIONARY-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_pop", "DICTIONARY-POP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_push", "DICTIONARY-PUSH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_contents_push", "DICTIONARY-CONTENTS-PUSH", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_pop_from_value", "DICTIONARY-POP-FROM-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_pushnew", "DICTIONARY-PUSHNEW", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_add_to_value_sorted", "DICTIONARY-ADD-TO-VALUE-SORTED", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_append", "DICTIONARY-APPEND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_union", "DICTIONARY-UNION", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_getf", "DICTIONARY-GETF", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_putf", "DICTIONARY-PUTF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_remove_from_value", "DICTIONARY-REMOVE-FROM-VALUE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_delete_from_value", "DICTIONARY-DELETE-FROM-VALUE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_delete_first_from_value", "DICTIONARY-DELETE-FIRST-FROM-VALUE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_delete_items_from_value", "DICTIONARY-DELETE-ITEMS-FROM-VALUE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_increment", "DICTIONARY-INCREMENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_decrement", "DICTIONARY-DECREMENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_decrement_and_remove_if", "DICTIONARY-DECREMENT-AND-REMOVE-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_extremal", "DICTIONARY-EXTREMAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_total", "DICTIONARY-TOTAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_to_alist", "DICTIONARY-TO-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "new_dictionary_from_alist", "NEW-DICTIONARY-FROM-ALIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_to_tuples", "DICTIONARY-TO-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_to_paired_lists", "DICTIONARY-TO-PAIRED-LISTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "new_dictionary_from_paired_lists_unique", "NEW-DICTIONARY-FROM-PAIRED-LISTS-UNIQUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "new_dictionary_from_paired_lists_push", "NEW-DICTIONARY-FROM-PAIRED-LISTS-PUSH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "new_classification_dictionary", "NEW-CLASSIFICATION-DICTIONARY", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dictionary_utilities", "do_dictionary_accumulating", "DO-DICTIONARY-ACCUMULATING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "make_dictionary_from_text", "MAKE-DICTIONARY-FROM-TEXT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dictionary_utilities", "do_dictionary_numbered", "DO-DICTIONARY-NUMBERED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "print_dictionary_contents", "PRINT-DICTIONARY-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "print_dictionary_contents_wX_dictionary_values", "PRINT-DICTIONARY-CONTENTS-W/-DICTIONARY-VALUES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "print_dictionary_contents_wX_hashtable_values", "PRINT-DICTIONARY-CONTENTS-W/-HASHTABLE-VALUES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "print_dictionary_contents_to_csv", "PRINT-DICTIONARY-CONTENTS-TO-CSV", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "new_dictionary_from_csv", "NEW-DICTIONARY-FROM-CSV", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "sort_dictionary_by_keys", "SORT-DICTIONARY-BY-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "sort_dictionary_by_values", "SORT-DICTIONARY-BY-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_keys_sorted_by_values", "DICTIONARY-KEYS-SORTED-BY-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_keys_sorter_comparison_predicate", "DICTIONARY-KEYS-SORTER-COMPARISON-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "test_dictionary_keys_sorted_by_values", "TEST-DICTIONARY-KEYS-SORTED-BY-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_dictionary_values", "MAP-DICTIONARY-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "test_map_dictionary_values", "TEST-MAP-DICTIONARY-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "partition_dictionary_keys_into_n_tiles", "PARTITION-DICTIONARY-KEYS-INTO-N-TILES", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dictionary_utilities", "do_dictionary_keys", "DO-DICTIONARY-KEYS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dictionary_utilities", "do_dictionary_values", "DO-DICTIONARY-VALUES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "add_tuple_list_to_dictionary", "ADD-TUPLE-LIST-TO-DICTIONARY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "add_values_from_lists_to_dictionary", "ADD-VALUES-FROM-LISTS-TO-DICTIONARY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_reverse_lookup", "DICTIONARY-REVERSE-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_keys_with_value", "DICTIONARY-KEYS-WITH-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_has_keyP", "DICTIONARY-HAS-KEY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_has_valueP", "DICTIONARY-HAS-VALUE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_nmerge", "DICTIONARY-NMERGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_merge", "DICTIONARY-MERGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_merge_list_values", "DICTIONARY-MERGE-LIST-VALUES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_nsum", "DICTIONARY-NSUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionary_sum", "DICTIONARY-SUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "sub_dictionaryP", "SUB-DICTIONARY?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "dictionaries_coextensionalP", "DICTIONARIES-COEXTENSIONAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_print_function_trampoline", "SYNCHRONIZED-DICTIONARY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_p", "SYNCHRONIZED-DICTIONARY-P", 1, 0, false);
        new $synchronized_dictionary_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_dictionary", "SYNCHRONIZED-DICTIONARY-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_lock", "SYNCHRONIZED-DICTIONARY-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "_csetf_synchronized_dictionary_dictionary", "_CSETF-SYNCHRONIZED-DICTIONARY-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "_csetf_synchronized_dictionary_lock", "_CSETF-SYNCHRONIZED-DICTIONARY-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "make_synchronized_dictionary", "MAKE-SYNCHRONIZED-DICTIONARY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "visit_defstruct_synchronized_dictionary", "VISIT-DEFSTRUCT-SYNCHRONIZED-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "visit_defstruct_object_synchronized_dictionary_method", "VISIT-DEFSTRUCT-OBJECT-SYNCHRONIZED-DICTIONARY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "new_synchronized_dictionary", "NEW-SYNCHRONIZED-DICTIONARY", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_test", "SYNCHRONIZED-DICTIONARY-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "print_synchronized_dictionary", "PRINT-SYNCHRONIZED-DICTIONARY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "clear_synchronized_dictionary", "CLEAR-SYNCHRONIZED-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_enter", "SYNCHRONIZED-DICTIONARY-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_enter_unless", "SYNCHRONIZED-DICTIONARY-ENTER-UNLESS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_remove", "SYNCHRONIZED-DICTIONARY-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_lookup", "SYNCHRONIZED-DICTIONARY-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_lookup_without_values", "SYNCHRONIZED-DICTIONARY-LOOKUP-WITHOUT-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_push", "SYNCHRONIZED-DICTIONARY-PUSH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_delete_from_value", "SYNCHRONIZED-DICTIONARY-DELETE-FROM-VALUE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_keys", "SYNCHRONIZED-DICTIONARY-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_values", "SYNCHRONIZED-DICTIONARY-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_length", "SYNCHRONIZED-DICTIONARY-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "synchronized_dictionary_arbitrary_key", "SYNCHRONIZED-DICTIONARY-ARBITRARY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "new_synchronized_dictionary_iterator", "NEW-SYNCHRONIZED-DICTIONARY-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "is_map_object_p_synchronized_dictionary_method", "IS-MAP-OBJECT-P-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_size_synchronized_dictionary_method", "MAP-OBJECT-SIZE-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_test_synchronized_dictionary_method", "MAP-OBJECT-TEST-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_put_synchronized_dictionary_method", "MAP-OBJECT-PUT-SYNCHRONIZED-DICTIONARY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_put_unless_synchronized_dictionary_method", "MAP-OBJECT-PUT-UNLESS-SYNCHRONIZED-DICTIONARY-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_get_synchronized_dictionary_method", "MAP-OBJECT-GET-SYNCHRONIZED-DICTIONARY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_get_without_values_synchronized_dictionary_method", "MAP-OBJECT-GET-WITHOUT-VALUES-SYNCHRONIZED-DICTIONARY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_remove_synchronized_dictionary_method", "MAP-OBJECT-REMOVE-SYNCHRONIZED-DICTIONARY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "new_map_object_with_same_properties_synchronized_dictionary_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-SYNCHRONIZED-DICTIONARY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_arbitrary_key_synchronized_dictionary_method", "MAP-OBJECT-ARBITRARY-KEY-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "new_map_object_iterator_synchronized_dictionary_method", "NEW-MAP-OBJECT-ITERATOR-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_remove_all_synchronized_dictionary_method", "MAP-OBJECT-REMOVE-ALL-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_keys_synchronized_dictionary_method", "MAP-OBJECT-KEYS-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "map_object_values_synchronized_dictionary_method", "MAP-OBJECT-VALUES-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "test_timings_of_alist_of_size", "TEST-TIMINGS-OF-ALIST-OF-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "test_timings_of_hashtable_of_size", "TEST-TIMINGS-OF-HASHTABLE-OF-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "estimate_optimal_dictionary_watermark", "ESTIMATE-OPTIMAL-DICTIONARY-WATERMARK", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "test_dictionary_key_conflation", "TEST-DICTIONARY-KEY-CONFLATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "test_hashtable_speed", "TEST-HASHTABLE-SPEED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary_utilities", "test_dictionary_speed", "TEST-DICTIONARY-SPEED", 3, 0, false);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    public static SubLObject init_dictionary_utilities_file() {
        dictionary_utilities.$dictionary_keys_sorter_current_sorting_information$ = SubLFiles.defparameter("*DICTIONARY-KEYS-SORTER-CURRENT-SORTING-INFORMATION*", (SubLObject)dictionary_utilities.NIL);
        dictionary_utilities.$key_missing$ = SubLFiles.deflexical("*KEY-MISSING*", Symbols.make_symbol((SubLObject)dictionary_utilities.$str59$KEY_MISSING));
        dictionary_utilities.$sub_dictionary_not_found$ = SubLFiles.deflexical("*SUB-DICTIONARY-NOT-FOUND*", maybeDefault((SubLObject)dictionary_utilities.$sym61$_SUB_DICTIONARY_NOT_FOUND_, dictionary_utilities.$sub_dictionary_not_found$, ()->(Symbols.gensym((SubLObject)dictionary_utilities.UNPROVIDED))));
        dictionary_utilities.$dtp_synchronized_dictionary$ = SubLFiles.defconstant("*DTP-SYNCHRONIZED-DICTIONARY*", (SubLObject)dictionary_utilities.$sym62$SYNCHRONIZED_DICTIONARY);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    public static SubLObject setup_dictionary_utilities_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)dictionary_utilities.$sym46$DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE);
        subl_macro_promotions.declare_defglobal((SubLObject)dictionary_utilities.$sym61$_SUB_DICTIONARY_NOT_FOUND_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym69$SYNCHRONIZED_DICTIONARY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)dictionary_utilities.$list70);
        Structures.def_csetf((SubLObject)dictionary_utilities.$sym71$SYNCHRONIZED_DICTIONARY_DICTIONARY, (SubLObject)dictionary_utilities.$sym72$_CSETF_SYNCHRONIZED_DICTIONARY_DICTIONARY);
        Structures.def_csetf((SubLObject)dictionary_utilities.$sym73$SYNCHRONIZED_DICTIONARY_LOCK, (SubLObject)dictionary_utilities.$sym74$_CSETF_SYNCHRONIZED_DICTIONARY_LOCK);
        Equality.identity((SubLObject)dictionary_utilities.$sym62$SYNCHRONIZED_DICTIONARY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym82$VISIT_DEFSTRUCT_OBJECT_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym87$IS_MAP_OBJECT_P_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym88$MAP_OBJECT_SIZE_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym89$MAP_OBJECT_TEST_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym90$MAP_OBJECT_PUT_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_put_unless_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym91$MAP_OBJECT_PUT_UNLESS_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym92$MAP_OBJECT_GET_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym93$MAP_OBJECT_GET_WITHOUT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym94$MAP_OBJECT_REMOVE_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym95$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SYNCHRONIZED_DICTIONARY_METHO));
        Structures.register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym96$MAP_OBJECT_ARBITRARY_KEY_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym97$NEW_MAP_OBJECT_ITERATOR_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym98$MAP_OBJECT_REMOVE_ALL_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_keys_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym99$MAP_OBJECT_KEYS_SYNCHRONIZED_DICTIONARY_METHOD));
        Structures.register_method(map_utilities.$map_object_values_method_table$.getGlobalValue(), dictionary_utilities.$dtp_synchronized_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary_utilities.$sym100$MAP_OBJECT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)dictionary_utilities.$sym104$TEST_DICTIONARY_KEYS_SORTED_BY_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { dictionary_utilities.$kw105$TEST, Symbols.symbol_function((SubLObject)dictionary_utilities.EQUAL), dictionary_utilities.$kw106$OWNER, dictionary_utilities.NIL, dictionary_utilities.$kw107$CLASSES, dictionary_utilities.NIL, dictionary_utilities.$kw108$KB, dictionary_utilities.$kw109$TINY, dictionary_utilities.$kw110$WORKING_, dictionary_utilities.T }), (SubLObject)dictionary_utilities.$list111);
        generic_testing.define_test_case_table_int((SubLObject)dictionary_utilities.$sym112$TEST_MAP_DICTIONARY_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { dictionary_utilities.$kw105$TEST, Symbols.symbol_function((SubLObject)dictionary_utilities.EQUAL), dictionary_utilities.$kw106$OWNER, dictionary_utilities.NIL, dictionary_utilities.$kw107$CLASSES, dictionary_utilities.NIL, dictionary_utilities.$kw108$KB, dictionary_utilities.$kw109$TINY, dictionary_utilities.$kw110$WORKING_, dictionary_utilities.T }), (SubLObject)dictionary_utilities.$list113);
        generic_testing.define_test_case_table_int((SubLObject)dictionary_utilities.$sym114$TEST_DICTIONARY_KEY_CONFLATION, (SubLObject)ConsesLow.list(new SubLObject[] { dictionary_utilities.$kw105$TEST, dictionary_utilities.NIL, dictionary_utilities.$kw106$OWNER, dictionary_utilities.NIL, dictionary_utilities.$kw107$CLASSES, dictionary_utilities.NIL, dictionary_utilities.$kw108$KB, dictionary_utilities.$kw109$TINY, dictionary_utilities.$kw110$WORKING_, dictionary_utilities.T }), (SubLObject)dictionary_utilities.$list115);
        return (SubLObject)dictionary_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_dictionary_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_dictionary_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_dictionary_utilities_file();
    }
    
    static {
        me = (SubLFile)new dictionary_utilities();
        dictionary_utilities.$dictionary_keys_sorter_current_sorting_information$ = null;
        dictionary_utilities.$key_missing$ = null;
        dictionary_utilities.$sub_dictionary_not_found$ = null;
        dictionary_utilities.$dtp_synchronized_dictionary$ = null;
        $sym0$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $str1$Corrupted_dictionary__attempting_ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to push values on a non listp ~a.~%");
        $sym2$DICTIONARY_CONTENTS_P = SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS-P");
        $str3$Corrupted_dictionary_contents__at = SubLObjectFactory.makeString("Corrupted dictionary-contents; attempting to push values on a non listp ~a.~%");
        $str4$Corrupted_dictionary__attempting_ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to pop a value from a non listp ~a.~%");
        $sym5$STRING__ = SubLObjectFactory.makeSymbol("STRING<=");
        $sym6$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $str7$Corrupted_dictionary__attempting_ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to add values on a non-listp ~a.~%");
        $sym8$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str9$Corrupted_dictionary__attempting_ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to append to a non listp ~a.~%");
        $str10$Corrupted_dictionary__attempting_ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to union with a non listp ~a.~%");
        $str11$Corrupted_dictionary__attempting_ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to remove values from a non listp ~a.~%");
        $str12$Corrupted_dictionary__attempting_ = SubLObjectFactory.makeString("Corrupted dictionary; attempting to delete values from a non listp ~a.~%");
        $sym13$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $sym14$ZEROP = SubLObjectFactory.makeSymbol("ZEROP");
        $sym15$NON_EMPTY_DICTIONARY_P = SubLObjectFactory.makeSymbol("NON-EMPTY-DICTIONARY-P");
        $sym16$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $list17 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL"), (SubLObject)SubLObjectFactory.makeSymbol("DICT-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("ITERATED-EXPRESSION"));
        $sym19$DICT_EXPRESSION_VAR = SubLObjectFactory.makeUninternedSymbol("DICT-EXPRESSION-VAR");
        $sym20$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym21$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list22 = ConsesLow.list((SubLObject)dictionary_utilities.NIL);
        $sym23$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym24$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $sym25$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym26$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym27$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $kw28$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMVAR"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list30 = ConsesLow.list((SubLObject)dictionary_utilities.ZERO_INTEGER);
        $sym31$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym32$CINC = SubLObjectFactory.makeSymbol("CINC");
        $str33$_S_____S__ = SubLObjectFactory.makeString("~S -> ~S~%");
        $str34$_S____ = SubLObjectFactory.makeString("~S -> ");
        $str35$_S__ = SubLObjectFactory.makeString("~S~%");
        $sym36$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str37$_csv = SubLObjectFactory.makeString(".csv");
        $kw38$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw39$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $kw40$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
        $kw41$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $str42$_A___A__ = SubLObjectFactory.makeString("~A, ~A~%");
        $str43$_S___S__ = SubLObjectFactory.makeString("~S, ~S~%");
        $str44$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str45$_ = SubLObjectFactory.makeString("\"");
        $sym46$DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE = SubLObjectFactory.makeSymbol("DICTIONARY-KEYS-SORTER-COMPARISON-PREDICATE");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"));
        $str48$For_key__A__the_computed_new_valu = SubLObjectFactory.makeString("For key ~A, the computed new value ~A does not ~A the  expected new value ~A.");
        $kw49$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $sym50$_ = SubLObjectFactory.makeSymbol(">");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw53$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw54$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym55$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym57$KEY = SubLObjectFactory.makeUninternedSymbol("KEY");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str59$KEY_MISSING = SubLObjectFactory.makeString("KEY-MISSING");
        $str60$Overwriting__s_from__s_to__s = SubLObjectFactory.makeString("Overwriting ~s from ~s to ~s");
        $sym61$_SUB_DICTIONARY_NOT_FOUND_ = SubLObjectFactory.makeSymbol("*SUB-DICTIONARY-NOT-FOUND*");
        $sym62$SYNCHRONIZED_DICTIONARY = SubLObjectFactory.makeSymbol("SYNCHRONIZED-DICTIONARY");
        $sym63$SYNCHRONIZED_DICTIONARY_P = SubLObjectFactory.makeSymbol("SYNCHRONIZED-DICTIONARY-P");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DICTIONARY"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYNCHRONIZED-DICTIONARY-DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("SYNCHRONIZED-DICTIONARY-LOCK"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-LOCK"));
        $sym68$PRINT_SYNCHRONIZED_DICTIONARY = SubLObjectFactory.makeSymbol("PRINT-SYNCHRONIZED-DICTIONARY");
        $sym69$SYNCHRONIZED_DICTIONARY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SYNCHRONIZED-DICTIONARY-PRINT-FUNCTION-TRAMPOLINE");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SYNCHRONIZED-DICTIONARY-P"));
        $sym71$SYNCHRONIZED_DICTIONARY_DICTIONARY = SubLObjectFactory.makeSymbol("SYNCHRONIZED-DICTIONARY-DICTIONARY");
        $sym72$_CSETF_SYNCHRONIZED_DICTIONARY_DICTIONARY = SubLObjectFactory.makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-DICTIONARY");
        $sym73$SYNCHRONIZED_DICTIONARY_LOCK = SubLObjectFactory.makeSymbol("SYNCHRONIZED-DICTIONARY-LOCK");
        $sym74$_CSETF_SYNCHRONIZED_DICTIONARY_LOCK = SubLObjectFactory.makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-LOCK");
        $kw75$DICTIONARY = SubLObjectFactory.makeKeyword("DICTIONARY");
        $kw76$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $str77$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw78$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym79$MAKE_SYNCHRONIZED_DICTIONARY = SubLObjectFactory.makeSymbol("MAKE-SYNCHRONIZED-DICTIONARY");
        $kw80$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw81$END = SubLObjectFactory.makeKeyword("END");
        $sym82$VISIT_DEFSTRUCT_OBJECT_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SYNCHRONIZED-DICTIONARY-METHOD");
        $str83$Synchronized_Dictionary_Lock = SubLObjectFactory.makeString("Synchronized Dictionary Lock");
        $str84$DICTIONARY___A___LOCK___A__ = SubLObjectFactory.makeString("DICTIONARY: ~A ~%LOCK: ~A~%");
        $sym85$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw86$NOT_SET = SubLObjectFactory.makeKeyword("NOT-SET");
        $sym87$IS_MAP_OBJECT_P_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("IS-MAP-OBJECT-P-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym88$MAP_OBJECT_SIZE_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-SIZE-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym89$MAP_OBJECT_TEST_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-TEST-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym90$MAP_OBJECT_PUT_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-PUT-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym91$MAP_OBJECT_PUT_UNLESS_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-PUT-UNLESS-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym92$MAP_OBJECT_GET_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-GET-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym93$MAP_OBJECT_GET_WITHOUT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym94$MAP_OBJECT_REMOVE_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-REMOVE-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym95$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SYNCHRONIZED_DICTIONARY_METHO = SubLObjectFactory.makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym96$MAP_OBJECT_ARBITRARY_KEY_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-ARBITRARY-KEY-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym97$NEW_MAP_OBJECT_ITERATOR_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("NEW-MAP-OBJECT-ITERATOR-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym98$MAP_OBJECT_REMOVE_ALL_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-REMOVE-ALL-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym99$MAP_OBJECT_KEYS_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-KEYS-SYNCHRONIZED-DICTIONARY-METHOD");
        $sym100$MAP_OBJECT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-VALUES-SYNCHRONIZED-DICTIONARY-METHOD");
        $int101$50 = SubLObjectFactory.makeInteger(50);
        $int102$3000000 = SubLObjectFactory.makeInteger(3000000);
        $str103$Testing_size__A_ALIST__A_HASHTABL = SubLObjectFactory.makeString("Testing size=~A ALIST=~A HASHTABLE=~A~%");
        $sym104$TEST_DICTIONARY_KEYS_SORTED_BY_VALUES = SubLObjectFactory.makeSymbol("TEST-DICTIONARY-KEYS-SORTED-BY-VALUES");
        $kw105$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw106$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw107$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw108$KB = SubLObjectFactory.makeKeyword("KB");
        $kw109$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw110$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list111 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("eins"), (SubLObject)dictionary_utilities.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("zwei"), (SubLObject)dictionary_utilities.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("drei"), (SubLObject)dictionary_utilities.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("vier"), (SubLObject)dictionary_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("fuenf"), (SubLObject)dictionary_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sechs"), (SubLObject)dictionary_utilities.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("<")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("eins"), (SubLObject)SubLObjectFactory.makeString("zwei"), (SubLObject)SubLObjectFactory.makeString("drei"), (SubLObject)SubLObjectFactory.makeString("vier"), (SubLObject)SubLObjectFactory.makeString("fuenf"), (SubLObject)SubLObjectFactory.makeString("sechs"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("one"), (SubLObject)dictionary_utilities.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("two"), (SubLObject)dictionary_utilities.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)dictionary_utilities.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("four"), (SubLObject)dictionary_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("five"), (SubLObject)dictionary_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("six"), (SubLObject)dictionary_utilities.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol(">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("six"), (SubLObject)SubLObjectFactory.makeString("five"), (SubLObject)SubLObjectFactory.makeString("four"), (SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)SubLObjectFactory.makeString("two"), (SubLObject)SubLObjectFactory.makeString("one"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("un"), (SubLObject)dictionary_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("deux"), (SubLObject)dictionary_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("trois"), (SubLObject)dictionary_utilities.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("quatre"), (SubLObject)dictionary_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("cinq"), (SubLObject)dictionary_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("seize"), (SubLObject)dictionary_utilities.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("seize"), (SubLObject)SubLObjectFactory.makeString("cinq"), (SubLObject)SubLObjectFactory.makeString("quatre"), (SubLObject)SubLObjectFactory.makeString("trois"), (SubLObject)SubLObjectFactory.makeString("deux"), (SubLObject)SubLObjectFactory.makeString("un"))));
        $sym112$TEST_MAP_DICTIONARY_VALUES = SubLObjectFactory.makeSymbol("TEST-MAP-DICTIONARY-VALUES");
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("eins"), (SubLObject)dictionary_utilities.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("zwei"), (SubLObject)dictionary_utilities.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("drei"), (SubLObject)dictionary_utilities.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("vier"), (SubLObject)dictionary_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("fuenf"), (SubLObject)dictionary_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sechs"), (SubLObject)dictionary_utilities.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("SQUARE"), (SubLObject)SubLObjectFactory.makeSymbol("=")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("one"), (SubLObject)dictionary_utilities.ONE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("two"), (SubLObject)dictionary_utilities.TWO_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("three"), (SubLObject)dictionary_utilities.THREE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("four"), (SubLObject)dictionary_utilities.FOUR_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("five"), (SubLObject)dictionary_utilities.FIVE_INTEGER), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("six"), (SubLObject)dictionary_utilities.SIX_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("SQRT"), (SubLObject)SubLObjectFactory.makeSymbol("=")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $sym114$TEST_DICTIONARY_KEY_CONFLATION = SubLObjectFactory.makeSymbol("TEST-DICTIONARY-KEY-CONFLATION");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Sea"), (SubLObject)SubLObjectFactory.makeString("sea"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("central"), SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("sea") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("sea"), SubLObjectFactory.makeString("central") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)dictionary_utilities.EQUALP, (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Sea"), SubLObjectFactory.makeString("Vancouver"), SubLObjectFactory.makeString("GOA"), SubLObjectFactory.makeString("Valley"), SubLObjectFactory.makeString("Anna"), SubLObjectFactory.makeString("Carolina"), SubLObjectFactory.makeString("point"), SubLObjectFactory.makeString("Rolandsay"), SubLObjectFactory.makeString("Dartmouth"), SubLObjectFactory.makeString("fork"), SubLObjectFactory.makeString("country"), SubLObjectFactory.makeString("East"), SubLObjectFactory.makeString("central"), SubLObjectFactory.makeString("sea") })), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $kw116$PRESENT = SubLObjectFactory.makeKeyword("PRESENT");
        $str117$Expected__A_entries__but_got__A_ = SubLObjectFactory.makeString("Expected ~A entries, but got ~A.");
    }
    
    public static final class $synchronized_dictionary_native extends SubLStructNative
    {
        public SubLObject $dictionary;
        public SubLObject $lock;
        private static final SubLStructDeclNative structDecl;
        
        public $synchronized_dictionary_native() {
            this.$dictionary = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$synchronized_dictionary_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$dictionary;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$lock;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$dictionary = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$lock = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$synchronized_dictionary_native.class, dictionary_utilities.$sym62$SYNCHRONIZED_DICTIONARY, dictionary_utilities.$sym63$SYNCHRONIZED_DICTIONARY_P, dictionary_utilities.$list64, dictionary_utilities.$list65, new String[] { "$dictionary", "$lock" }, dictionary_utilities.$list66, dictionary_utilities.$list67, dictionary_utilities.$sym68$PRINT_SYNCHRONIZED_DICTIONARY);
        }
    }
    
    public static final class $synchronized_dictionary_p$UnaryFunction extends UnaryFunction
    {
        public $synchronized_dictionary_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SYNCHRONIZED-DICTIONARY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return dictionary_utilities.synchronized_dictionary_p(arg1);
        }
    }
}

/*

	Total time: 497 ms
	
*/