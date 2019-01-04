package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class dictionary extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.dictionary";
    public static final String myFingerPrint = "94f63653917ec9fe5df80a0a4abb09c06504c992fc3d6287c737293d62df11c8";
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 1952L)
    private static SubLSymbol $dictionary_high_water_mark$;
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2251L)
    private static SubLSymbol $dictionary_low_water_mark$;
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2559L)
    public static SubLSymbol $dtp_dictionary$;
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 16616L)
    private static SubLSymbol $cfasl_opcode_dictionary$;
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 19008L)
    private static SubLSymbol $cfasl_opcode_legacy_dictionary$;
    private static final SubLSymbol $sym0$DICTIONARY;
    private static final SubLSymbol $sym1$DICTIONARY_P;
    private static final SubLInteger $int2$133;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_DICTIONARY;
    private static final SubLSymbol $sym8$DICTIONARY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$DICTIONARY_DATABASE;
    private static final SubLSymbol $sym11$_CSETF_DICTIONARY_DATABASE;
    private static final SubLSymbol $sym12$DICTIONARY_TEST;
    private static final SubLSymbol $sym13$_CSETF_DICTIONARY_TEST;
    private static final SubLSymbol $kw14$DATABASE;
    private static final SubLSymbol $kw15$TEST;
    private static final SubLString $str16$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw17$BEGIN;
    private static final SubLSymbol $sym18$MAKE_DICTIONARY;
    private static final SubLSymbol $kw19$SLOT;
    private static final SubLSymbol $kw20$END;
    private static final SubLSymbol $sym21$VISIT_DEFSTRUCT_OBJECT_DICTIONARY_METHOD;
    private static final SubLString $str22$_;
    private static final SubLString $str23$_;
    private static final SubLString $str24$_;
    private static final SubLString $str25$_size_;
    private static final SubLList $list26;
    private static final SubLSymbol $kw27$ALIST;
    private static final SubLSymbol $kw28$HASHTABLE;
    private static final SubLSymbol $kw29$UNKNOWN;
    private static final SubLString $str30$Corrupted_dictionary__unsupported;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$VALID_HASH_TEST_P;
    private static final SubLSymbol $sym34$INTEGERP;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$DO_DICTIONARY_CONTENTS;
    private static final SubLSymbol $sym37$DICTIONARY_CONTENTS;
    private static final SubLSymbol $kw38$DONE;
    private static final SubLSymbol $sym39$DO_DICTIONARY;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $kw42$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw43$PROGRESS_NOTE;
    private static final SubLString $str44$Mapping_dictionary___;
    private static final SubLSymbol $sym45$SO_FAR;
    private static final SubLSymbol $sym46$TOTAL;
    private static final SubLSymbol $sym47$CLET;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$DICTIONARY_LENGTH;
    private static final SubLSymbol $sym50$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym51$CINC;
    private static final SubLSymbol $sym52$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym53$FUNCTION_SPEC_P;
    private static final SubLInteger $int54$61;
    private static final SubLSymbol $sym55$CFASL_INPUT_DICTIONARY;
    private static final SubLSymbol $sym56$CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD;
    private static final SubLInteger $int57$64;
    private static final SubLSymbol $sym58$CFASL_INPUT_LEGACY_DICTIONARY;
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2559L)
    public static SubLObject dictionary_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_dictionary(v_object, stream, (SubLObject)dictionary.ZERO_INTEGER);
        return (SubLObject)dictionary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2559L)
    public static SubLObject dictionary_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $dictionary_native.class) ? dictionary.T : dictionary.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2559L)
    public static SubLObject dictionary_database(final SubLObject v_object) {
        assert dictionary.NIL != dictionary_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2559L)
    public static SubLObject dictionary_test(final SubLObject v_object) {
        assert dictionary.NIL != dictionary_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2559L)
    public static SubLObject _csetf_dictionary_database(final SubLObject v_object, final SubLObject value) {
        assert dictionary.NIL != dictionary_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2559L)
    public static SubLObject _csetf_dictionary_test(final SubLObject v_object, final SubLObject value) {
        assert dictionary.NIL != dictionary_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2559L)
    public static SubLObject make_dictionary(SubLObject arglist) {
        if (arglist == dictionary.UNPROVIDED) {
            arglist = (SubLObject)dictionary.NIL;
        }
        final SubLObject v_new = (SubLObject)new $dictionary_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)dictionary.NIL, next = arglist; dictionary.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)dictionary.$kw14$DATABASE)) {
                _csetf_dictionary_database(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)dictionary.$kw15$TEST)) {
                _csetf_dictionary_test(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)dictionary.$str16$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2559L)
    public static SubLObject visit_defstruct_dictionary(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)dictionary.$kw17$BEGIN, (SubLObject)dictionary.$sym18$MAKE_DICTIONARY, (SubLObject)dictionary.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)dictionary.$kw19$SLOT, (SubLObject)dictionary.$kw14$DATABASE, dictionary_database(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)dictionary.$kw19$SLOT, (SubLObject)dictionary.$kw15$TEST, dictionary_test(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)dictionary.$kw20$END, (SubLObject)dictionary.$sym18$MAKE_DICTIONARY, (SubLObject)dictionary.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2559L)
    public static SubLObject visit_defstruct_object_dictionary_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_dictionary(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 2818L)
    public static SubLObject print_dictionary(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (dictionary.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)dictionary.T, (SubLObject)dictionary.T);
            streams_high.write_string((SubLObject)dictionary.$str22$_, stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
            print_high.princ(hash_table_utilities.hash_test_to_symbol(dictionary_test(v_object)), stream);
            streams_high.write_string((SubLObject)dictionary.$str23$_, stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
            streams_high.write_string(Symbols.symbol_name(dictionary_style(v_object)), stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
            streams_high.write_string((SubLObject)dictionary.$str24$_, stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
            streams_high.write_string((SubLObject)dictionary.$str25$_size_, stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
            print_high.princ(dictionary_length(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)dictionary.T, (SubLObject)dictionary.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 3487L)
    public static SubLObject dictionary_database_style(final SubLObject dictionary_database) {
        if (dictionary_database.isList()) {
            return (SubLObject)dictionary.$kw27$ALIST;
        }
        if (dictionary_database.isHashtable()) {
            return (SubLObject)dictionary.$kw28$HASHTABLE;
        }
        return (SubLObject)dictionary.$kw29$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 3824L)
    public static SubLObject dictionary_style(final SubLObject v_dictionary) {
        return dictionary_database_style(dictionary_database(v_dictionary));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 4094L)
    public static SubLObject dictionary_style_error(final SubLObject v_dictionary) {
        return Errors.error((SubLObject)dictionary.$str30$Corrupted_dictionary__unsupported, dictionary_style(v_dictionary));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 4601L)
    public static SubLObject dictionary_empty_alist_style(final SubLObject v_dictionary, final SubLObject alist) {
        return Types.sublisp_null(alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 4710L)
    public static SubLObject dictionary_size_alist_style(final SubLObject v_dictionary, final SubLObject alist) {
        return Sequences.length(alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 4820L)
    public static SubLObject dictionary_lookup_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject not_found) {
        final SubLObject test = dictionary_test(v_dictionary);
        return list_utilities.alist_lookup(alist, key, test, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 4998L)
    public static SubLObject dictionary_lookup_without_values_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject not_found) {
        final SubLObject test = dictionary_test(v_dictionary);
        return list_utilities.alist_lookup_without_values(alist, key, test, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 5252L)
    public static SubLObject dictionary_enter_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = dictionary_test(v_dictionary);
        thread.resetMultipleValues();
        final SubLObject new_alist = list_utilities.alist_enter(alist, key, value, test);
        final SubLObject replacement_p = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (dictionary.NIL == replacement_p) {
            _csetf_dictionary_database(v_dictionary, new_alist);
            if (dictionary_length(v_dictionary).numG(dictionary.$dictionary_high_water_mark$.getGlobalValue())) {
                make_hashtable_dictionary_from_alist(v_dictionary, new_alist);
            }
        }
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 5719L)
    public static SubLObject dictionary_remove_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = dictionary_test(v_dictionary);
        thread.resetMultipleValues();
        final SubLObject new_alist = list_utilities.alist_delete(alist, key, test);
        final SubLObject removed_p = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (dictionary.NIL != removed_p) {
            _csetf_dictionary_database(v_dictionary, new_alist);
        }
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 6005L)
    public static SubLObject dictionary_optimize_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject predicate) {
        final SubLObject new_database = list_utilities.alist_optimize(alist, predicate);
        _csetf_dictionary_database(v_dictionary, new_database);
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 6220L)
    public static SubLObject make_hashtable_dictionary_from_alist(final SubLObject v_dictionary, final SubLObject old_database) {
        final SubLObject test = dictionary_test(v_dictionary);
        final SubLObject new_database = list_utilities.alist_to_hash_table(old_database, test);
        _csetf_dictionary_database(v_dictionary, new_database);
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 6872L)
    public static SubLObject dictionary_empty_hashtable_style(final SubLObject v_dictionary, final SubLObject hashtable) {
        return hash_table_utilities.hash_table_empty_p(hashtable);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 7007L)
    public static SubLObject dictionary_size_hashtable_style(final SubLObject v_dictionary, final SubLObject hashtable) {
        return Hashtables.hash_table_count(hashtable);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 7139L)
    public static SubLObject dictionary_lookup_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject not_found) {
        return Hashtables.gethash(key, table, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 7284L)
    public static SubLObject dictionary_lookup_without_values_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject not_found) {
        return Hashtables.gethash_without_values(key, table, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 7459L)
    public static SubLObject dictionary_enter_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject value) {
        Hashtables.sethash(key, table, value);
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 7609L)
    public static SubLObject dictionary_remove_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key) {
        final SubLObject removed_p = Hashtables.remhash(key, table);
        if (dictionary.NIL != removed_p && dictionary_length(v_dictionary).numL(dictionary.$dictionary_low_water_mark$.getGlobalValue())) {
            make_alist_dictionary_from_hashtable(v_dictionary, table);
        }
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 7925L)
    public static SubLObject dictionary_optimize_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject predicate) {
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 8054L)
    public static SubLObject make_alist_dictionary_from_hashtable(final SubLObject v_dictionary, final SubLObject old_database) {
        final SubLObject new_database = hash_table_utilities.hash_table_to_alist(old_database);
        _csetf_dictionary_database(v_dictionary, new_database);
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 8273L)
    public static SubLObject new_dictionary(SubLObject test, SubLObject size) {
        if (test == dictionary.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)dictionary.EQL);
        }
        if (size == dictionary.UNPROVIDED) {
            size = (SubLObject)dictionary.ZERO_INTEGER;
        }
        assert dictionary.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        assert dictionary.NIL != Types.integerp(size) : size;
        if (test.isSymbol()) {
            test = Symbols.symbol_function(test);
        }
        final SubLObject v_dictionary = make_dictionary((SubLObject)dictionary.UNPROVIDED);
        clear_dictionary(v_dictionary);
        _csetf_dictionary_test(v_dictionary, test);
        if (size.numG(dictionary.$dictionary_high_water_mark$.getGlobalValue())) {
            _csetf_dictionary_database(v_dictionary, Hashtables.make_hash_table(size, test, (SubLObject)dictionary.UNPROVIDED));
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 9155L)
    public static SubLObject clear_dictionary(final SubLObject v_dictionary) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        _csetf_dictionary_database(v_dictionary, (SubLObject)dictionary.NIL);
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 9391L)
    public static SubLObject dictionary_length(final SubLObject v_dictionary) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return dictionary_size_alist_style(v_dictionary, database);
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            return dictionary_size_hashtable_style(v_dictionary, database);
        }
        return dictionary_style_error(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 10088L)
    public static SubLObject dictionary_empty_p(final SubLObject v_dictionary) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return dictionary_empty_alist_style(v_dictionary, database);
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            return dictionary_empty_hashtable_style(v_dictionary, database);
        }
        return dictionary_style_error(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 10539L)
    public static SubLObject non_empty_dictionary_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(dictionary.NIL != dictionary_p(v_object) && dictionary.NIL == dictionary_empty_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 10725L)
    public static SubLObject dictionary_lookup(final SubLObject v_dictionary, final SubLObject key, SubLObject not_found) {
        if (not_found == dictionary.UNPROVIDED) {
            not_found = (SubLObject)dictionary.NIL;
        }
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return dictionary_lookup_alist_style(v_dictionary, database, key, not_found);
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            return dictionary_lookup_hashtable_style(v_dictionary, database, key, not_found);
        }
        return dictionary_style_error(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 11382L)
    public static SubLObject dictionary_lookup_without_values(final SubLObject v_dictionary, final SubLObject key, SubLObject not_found) {
        if (not_found == dictionary.UNPROVIDED) {
            not_found = (SubLObject)dictionary.NIL;
        }
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return dictionary_lookup_without_values_alist_style(v_dictionary, database, key, not_found);
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            return dictionary_lookup_without_values_hashtable_style(v_dictionary, database, key, not_found);
        }
        return dictionary_style_error(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 12059L)
    public static SubLObject dictionary_enter(final SubLObject v_dictionary, final SubLObject key, final SubLObject value) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return dictionary_enter_alist_style(v_dictionary, database, key, value);
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            return dictionary_enter_hashtable_style(v_dictionary, database, key, value);
        }
        return dictionary_style_error(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 12607L)
    public static SubLObject dictionary_remove(final SubLObject v_dictionary, final SubLObject key) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return dictionary_remove_alist_style(v_dictionary, database, key);
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            return dictionary_remove_hashtable_style(v_dictionary, database, key);
        }
        return dictionary_style_error(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 13110L)
    public static SubLObject dictionary_optimize(final SubLObject v_dictionary, final SubLObject predicate) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return dictionary_optimize_alist_style(v_dictionary, database, predicate);
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            return dictionary_optimize_hashtable_style(v_dictionary, database, predicate);
        }
        return dictionary_style_error(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 13777L)
    public static SubLObject new_dictionary_iterator(final SubLObject v_dictionary) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return iteration.new_alist_iterator(database);
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            return iteration.new_hash_table_iterator(database);
        }
        return dictionary_style_error(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 14294L)
    public static SubLObject do_dictionary(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary.$list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)dictionary.NIL;
        SubLObject value = (SubLObject)dictionary.NIL;
        SubLObject v_dictionary = (SubLObject)dictionary.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary.$list35);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary.$list35);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary.$list35);
        v_dictionary = current.first();
        current = current.rest();
        final SubLObject done = (SubLObject)(current.isCons() ? current.first() : dictionary.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)dictionary.$list35);
        current = current.rest();
        if (dictionary.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)dictionary.$sym36$DO_DICTIONARY_CONTENTS, (SubLObject)ConsesLow.list(key, value, (SubLObject)ConsesLow.list((SubLObject)dictionary.$sym37$DICTIONARY_CONTENTS, v_dictionary), (SubLObject)dictionary.$kw38$DONE, done), ConsesLow.append(body, (SubLObject)dictionary.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dictionary.$list35);
        return (SubLObject)dictionary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 14870L)
    public static SubLObject dictionary_contents(final SubLObject v_dictionary) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        return dictionary_database(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 15111L)
    public static SubLObject do_dictionary_progress(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary.$list40);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)dictionary.NIL;
        SubLObject value = (SubLObject)dictionary.NIL;
        SubLObject v_dictionary = (SubLObject)dictionary.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary.$list40);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary.$list40);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)dictionary.$list40);
        v_dictionary = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)dictionary.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)dictionary.NIL;
        SubLObject current_$1 = (SubLObject)dictionary.NIL;
        while (dictionary.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dictionary.$list40);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)dictionary.$list40);
            if (dictionary.NIL == conses_high.member(current_$1, (SubLObject)dictionary.$list41, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED)) {
                bad = (SubLObject)dictionary.T;
            }
            if (current_$1 == dictionary.$kw42$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (dictionary.NIL != bad && dictionary.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)dictionary.$list40);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)dictionary.$kw38$DONE, current);
        final SubLObject done = (SubLObject)((dictionary.NIL != done_tail) ? conses_high.cadr(done_tail) : dictionary.NIL);
        final SubLObject progress_note_tail = cdestructuring_bind.property_list_member((SubLObject)dictionary.$kw43$PROGRESS_NOTE, current);
        final SubLObject progress_note = (SubLObject)((dictionary.NIL != progress_note_tail) ? conses_high.cadr(progress_note_tail) : dictionary.$str44$Mapping_dictionary___);
        final SubLObject body;
        current = (body = temp);
        final SubLObject so_far = (SubLObject)dictionary.$sym45$SO_FAR;
        final SubLObject total = (SubLObject)dictionary.$sym46$TOTAL;
        return (SubLObject)ConsesLow.list((SubLObject)dictionary.$sym47$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(so_far, (SubLObject)dictionary.$list48), (SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)dictionary.$sym49$DICTIONARY_LENGTH, v_dictionary))), (SubLObject)ConsesLow.list((SubLObject)dictionary.$sym50$NOTING_PERCENT_PROGRESS, progress_note, (SubLObject)ConsesLow.listS((SubLObject)dictionary.$sym39$DO_DICTIONARY, (SubLObject)ConsesLow.list(key, value, v_dictionary, done), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)dictionary.$sym51$CINC, so_far), (SubLObject)ConsesLow.list((SubLObject)dictionary.$sym52$NOTE_PERCENT_PROGRESS, so_far, total))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 15820L)
    public static SubLObject mapdictionary(final SubLObject v_dictionary, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        assert dictionary.NIL != Types.function_spec_p(function) : function;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_dictionary)); dictionary.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            Functions.funcall(function, key, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)dictionary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 16181L)
    public static SubLObject mapdictionary_parameterized(final SubLObject v_dictionary, final SubLObject function, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        assert dictionary.NIL != Types.function_spec_p(function) : function;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_dictionary)); dictionary.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            Functions.funcall(function, key, value, args);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)dictionary.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 16744L)
    public static SubLObject cfasl_output_object_dictionary_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_dictionary(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 16869L)
    public static SubLObject cfasl_output_dictionary(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl.cfasl_raw_write_byte(dictionary.$cfasl_opcode_dictionary$.getGlobalValue(), stream);
        final SubLObject test = hash_table_utilities.hash_test_to_symbol(dictionary_test(v_object));
        final SubLObject size = dictionary_length(v_object);
        cfasl.cfasl_output(test, stream);
        cfasl.cfasl_output(size, stream);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_object)); dictionary.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cfasl.cfasl_output(key, stream);
            cfasl.cfasl_output(value, stream);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 17270L)
    public static SubLObject cfasl_input_dictionary(final SubLObject stream) {
        SubLObject test = cfasl.cfasl_input(stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
        final SubLObject size = cfasl.cfasl_input(stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
        SubLObject v_dictionary = (SubLObject)dictionary.NIL;
        SubLObject pcase_var = test;
        if (pcase_var.eql((SubLObject)dictionary.EQ) || pcase_var.eql((SubLObject)dictionary.EQL) || pcase_var.eql((SubLObject)dictionary.EQUAL) || pcase_var.eql((SubLObject)dictionary.EQUALP)) {
            test = Symbols.symbol_function(test);
        }
        v_dictionary = new_dictionary(test, size);
        pcase_var = dictionary_style(v_dictionary);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            cfasl_input_dictionary_content_alist_style(v_dictionary, size, stream);
        }
        else if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            cfasl_input_dictionary_content_hashtable_style(v_dictionary, size, stream);
        }
        else {
            cfasl_input_dictionary_content_logically(v_dictionary, size, stream);
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 18067L)
    public static SubLObject cfasl_input_dictionary_content_alist_style(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream) {
        SubLObject database = (SubLObject)dictionary.NIL;
        database = (SubLObject)ConsesLow.make_list(size, (SubLObject)dictionary.NIL);
        SubLObject cons;
        SubLObject key;
        SubLObject value;
        SubLObject association;
        for (cons = (SubLObject)dictionary.NIL, cons = database; !cons.isAtom(); cons = cons.rest()) {
            key = cfasl.cfasl_input(stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
            value = cfasl.cfasl_input(stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
            association = (SubLObject)dictionary.NIL;
            association = (SubLObject)ConsesLow.cons(key, value);
            ConsesLow.rplaca(cons, association);
        }
        _csetf_dictionary_database(v_dictionary, database);
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 18591L)
    public static SubLObject cfasl_input_dictionary_content_hashtable_style(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream) {
        return cfasl_input_dictionary_content_logically(v_dictionary, size, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 18755L)
    public static SubLObject cfasl_input_dictionary_content_logically(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream) {
        SubLObject i;
        SubLObject key;
        SubLObject value;
        for (i = (SubLObject)dictionary.NIL, i = (SubLObject)dictionary.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)dictionary.ONE_INTEGER)) {
            key = cfasl.cfasl_input(stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
            value = cfasl.cfasl_input(stream, (SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
            dictionary_enter(v_dictionary, key, value);
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 19167L)
    public static SubLObject cfasl_input_legacy_dictionary(final SubLObject stream) {
        SubLObject v_dictionary = (SubLObject)dictionary.NIL;
        v_dictionary = new_dictionary((SubLObject)dictionary.UNPROVIDED, (SubLObject)dictionary.UNPROVIDED);
        cfasl.cfasl_input_object(stream);
        _csetf_dictionary_database(v_dictionary, cfasl.cfasl_input_object(stream));
        _csetf_dictionary_test(v_dictionary, Symbols.symbol_function(cfasl.cfasl_input_object(stream)));
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 19609L)
    public static SubLObject dictionary_keys(final SubLObject v_dictionary) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return list_utilities.alist_keys(database);
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            return hash_table_utilities.hash_table_keys(database);
        }
        return dictionary_style_error(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 20357L)
    public static SubLObject dictionary_values(final SubLObject v_dictionary) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return list_utilities.alist_values(database);
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            return hash_table_utilities.hash_table_values(database);
        }
        return dictionary_style_error(v_dictionary);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/dictionary.lisp", position = 20816L)
    public static SubLObject dictionary_rebuild(final SubLObject v_dictionary) {
        assert dictionary.NIL != dictionary_p(v_dictionary) : v_dictionary;
        final SubLObject database = dictionary_database(v_dictionary);
        final SubLObject pcase_var = dictionary_database_style(database);
        if (pcase_var.eql((SubLObject)dictionary.$kw27$ALIST)) {
            return v_dictionary;
        }
        if (pcase_var.eql((SubLObject)dictionary.$kw28$HASHTABLE)) {
            hash_table_utilities.rehash(database);
            return v_dictionary;
        }
        return dictionary_style_error(v_dictionary);
    }
    
    public static SubLObject declare_dictionary_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_print_function_trampoline", "DICTIONARY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_p", "DICTIONARY-P", 1, 0, false);
        new $dictionary_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_database", "DICTIONARY-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_test", "DICTIONARY-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "_csetf_dictionary_database", "_CSETF-DICTIONARY-DATABASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "_csetf_dictionary_test", "_CSETF-DICTIONARY-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "make_dictionary", "MAKE-DICTIONARY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "visit_defstruct_dictionary", "VISIT-DEFSTRUCT-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "visit_defstruct_object_dictionary_method", "VISIT-DEFSTRUCT-OBJECT-DICTIONARY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "print_dictionary", "PRINT-DICTIONARY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_database_style", "DICTIONARY-DATABASE-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_style", "DICTIONARY-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_style_error", "DICTIONARY-STYLE-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_empty_alist_style", "DICTIONARY-EMPTY-ALIST-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_size_alist_style", "DICTIONARY-SIZE-ALIST-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_lookup_alist_style", "DICTIONARY-LOOKUP-ALIST-STYLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_lookup_without_values_alist_style", "DICTIONARY-LOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_enter_alist_style", "DICTIONARY-ENTER-ALIST-STYLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_remove_alist_style", "DICTIONARY-REMOVE-ALIST-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_optimize_alist_style", "DICTIONARY-OPTIMIZE-ALIST-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "make_hashtable_dictionary_from_alist", "MAKE-HASHTABLE-DICTIONARY-FROM-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_empty_hashtable_style", "DICTIONARY-EMPTY-HASHTABLE-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_size_hashtable_style", "DICTIONARY-SIZE-HASHTABLE-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_lookup_hashtable_style", "DICTIONARY-LOOKUP-HASHTABLE-STYLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_lookup_without_values_hashtable_style", "DICTIONARY-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_enter_hashtable_style", "DICTIONARY-ENTER-HASHTABLE-STYLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_remove_hashtable_style", "DICTIONARY-REMOVE-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_optimize_hashtable_style", "DICTIONARY-OPTIMIZE-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "make_alist_dictionary_from_hashtable", "MAKE-ALIST-DICTIONARY-FROM-HASHTABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "new_dictionary", "NEW-DICTIONARY", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "clear_dictionary", "CLEAR-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_length", "DICTIONARY-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_empty_p", "DICTIONARY-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "non_empty_dictionary_p", "NON-EMPTY-DICTIONARY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_lookup", "DICTIONARY-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_lookup_without_values", "DICTIONARY-LOOKUP-WITHOUT-VALUES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_enter", "DICTIONARY-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_remove", "DICTIONARY-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_optimize", "DICTIONARY-OPTIMIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "new_dictionary_iterator", "NEW-DICTIONARY-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dictionary", "do_dictionary", "DO-DICTIONARY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_contents", "DICTIONARY-CONTENTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.dictionary", "do_dictionary_progress", "DO-DICTIONARY-PROGRESS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "mapdictionary", "MAPDICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "mapdictionary_parameterized", "MAPDICTIONARY-PARAMETERIZED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "cfasl_output_object_dictionary_method", "CFASL-OUTPUT-OBJECT-DICTIONARY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "cfasl_output_dictionary", "CFASL-OUTPUT-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "cfasl_input_dictionary", "CFASL-INPUT-DICTIONARY", 1, 0, false);
        new $cfasl_input_dictionary$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "cfasl_input_dictionary_content_alist_style", "CFASL-INPUT-DICTIONARY-CONTENT-ALIST-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "cfasl_input_dictionary_content_hashtable_style", "CFASL-INPUT-DICTIONARY-CONTENT-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "cfasl_input_dictionary_content_logically", "CFASL-INPUT-DICTIONARY-CONTENT-LOGICALLY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "cfasl_input_legacy_dictionary", "CFASL-INPUT-LEGACY-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_keys", "DICTIONARY-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_values", "DICTIONARY-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.dictionary", "dictionary_rebuild", "DICTIONARY-REBUILD", 1, 0, false);
        return (SubLObject)dictionary.NIL;
    }
    
    public static SubLObject init_dictionary_file() {
        dictionary.$dictionary_high_water_mark$ = SubLFiles.deflexical("*DICTIONARY-HIGH-WATER-MARK*", (SubLObject)dictionary.TWELVE_INTEGER);
        dictionary.$dictionary_low_water_mark$ = SubLFiles.deflexical("*DICTIONARY-LOW-WATER-MARK*", (SubLObject)dictionary.EIGHT_INTEGER);
        dictionary.$dtp_dictionary$ = SubLFiles.defconstant("*DTP-DICTIONARY*", (SubLObject)dictionary.$sym0$DICTIONARY);
        dictionary.$cfasl_opcode_dictionary$ = SubLFiles.defconstant("*CFASL-OPCODE-DICTIONARY*", (SubLObject)dictionary.$int54$61);
        dictionary.$cfasl_opcode_legacy_dictionary$ = SubLFiles.defconstant("*CFASL-OPCODE-LEGACY-DICTIONARY*", (SubLObject)dictionary.$int57$64);
        return (SubLObject)dictionary.NIL;
    }
    
    public static SubLObject setup_dictionary_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary.$sym8$DICTIONARY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)dictionary.$list9);
        Structures.def_csetf((SubLObject)dictionary.$sym10$DICTIONARY_DATABASE, (SubLObject)dictionary.$sym11$_CSETF_DICTIONARY_DATABASE);
        Structures.def_csetf((SubLObject)dictionary.$sym12$DICTIONARY_TEST, (SubLObject)dictionary.$sym13$_CSETF_DICTIONARY_TEST);
        Equality.identity((SubLObject)dictionary.$sym0$DICTIONARY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary.$sym21$VISIT_DEFSTRUCT_OBJECT_DICTIONARY_METHOD));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)dictionary.$list26);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)dictionary.$list31);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)dictionary.$list32);
        access_macros.register_macro_helper((SubLObject)dictionary.$sym37$DICTIONARY_CONTENTS, (SubLObject)dictionary.$sym39$DO_DICTIONARY);
        cfasl.register_cfasl_input_function(dictionary.$cfasl_opcode_dictionary$.getGlobalValue(), (SubLObject)dictionary.$sym55$CFASL_INPUT_DICTIONARY);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), dictionary.$dtp_dictionary$.getGlobalValue(), Symbols.symbol_function((SubLObject)dictionary.$sym56$CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD));
        cfasl.register_cfasl_input_function(dictionary.$cfasl_opcode_legacy_dictionary$.getGlobalValue(), (SubLObject)dictionary.$sym58$CFASL_INPUT_LEGACY_DICTIONARY);
        return (SubLObject)dictionary.NIL;
    }
    
    public void declareFunctions() {
        declare_dictionary_file();
    }
    
    public void initializeVariables() {
        init_dictionary_file();
    }
    
    public void runTopLevelForms() {
        setup_dictionary_file();
    }
    
    static {
        me = (SubLFile)new dictionary();
        dictionary.$dictionary_high_water_mark$ = null;
        dictionary.$dictionary_low_water_mark$ = null;
        dictionary.$dtp_dictionary$ = null;
        dictionary.$cfasl_opcode_dictionary$ = null;
        dictionary.$cfasl_opcode_legacy_dictionary$ = null;
        $sym0$DICTIONARY = SubLObjectFactory.makeSymbol("DICTIONARY");
        $sym1$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $int2$133 = SubLObjectFactory.makeInteger(133);
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATABASE"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DATABASE"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-DATABASE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-TEST"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DICTIONARY-DATABASE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DICTIONARY-TEST"));
        $sym7$PRINT_DICTIONARY = SubLObjectFactory.makeSymbol("PRINT-DICTIONARY");
        $sym8$DICTIONARY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("DICTIONARY-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-P"));
        $sym10$DICTIONARY_DATABASE = SubLObjectFactory.makeSymbol("DICTIONARY-DATABASE");
        $sym11$_CSETF_DICTIONARY_DATABASE = SubLObjectFactory.makeSymbol("_CSETF-DICTIONARY-DATABASE");
        $sym12$DICTIONARY_TEST = SubLObjectFactory.makeSymbol("DICTIONARY-TEST");
        $sym13$_CSETF_DICTIONARY_TEST = SubLObjectFactory.makeSymbol("_CSETF-DICTIONARY-TEST");
        $kw14$DATABASE = SubLObjectFactory.makeKeyword("DATABASE");
        $kw15$TEST = SubLObjectFactory.makeKeyword("TEST");
        $str16$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw17$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym18$MAKE_DICTIONARY = SubLObjectFactory.makeSymbol("MAKE-DICTIONARY");
        $kw19$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw20$END = SubLObjectFactory.makeKeyword("END");
        $sym21$VISIT_DEFSTRUCT_OBJECT_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-DICTIONARY-METHOD");
        $str22$_ = SubLObjectFactory.makeString("(");
        $str23$_ = SubLObjectFactory.makeString(" ");
        $str24$_ = SubLObjectFactory.makeString(")");
        $str25$_size_ = SubLObjectFactory.makeString(" size=");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-DATABASE-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-STYLE-ERROR"));
        $kw27$ALIST = SubLObjectFactory.makeKeyword("ALIST");
        $kw28$HASHTABLE = SubLObjectFactory.makeKeyword("HASHTABLE");
        $kw29$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str30$Corrupted_dictionary__unsupported = SubLObjectFactory.makeString("Corrupted dictionary; unsupported style ~S.~%");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INLINE"), SubLObjectFactory.makeSymbol("DICTIONARY-EMPTY-ALIST-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-SIZE-ALIST-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP-ALIST-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP-WITHOUT-VALUES-ALIST-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-ENTER-ALIST-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-REMOVE-ALIST-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-OPTIMIZE-ALIST-STYLE"), SubLObjectFactory.makeSymbol("MAKE-HASHTABLE-DICTIONARY-FROM-ALIST") });
        $list32 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INLINE"), SubLObjectFactory.makeSymbol("DICTIONARY-EMPTY-HASHTABLE-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-SIZE-HASHTABLE-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP-HASHTABLE-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-ENTER-HASHTABLE-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-REMOVE-HASHTABLE-STYLE"), SubLObjectFactory.makeSymbol("DICTIONARY-OPTIMIZE-HASHTABLE-STYLE"), SubLObjectFactory.makeSymbol("MAKE-ALIST-DICTIONARY-FROM-HASHTABLE") });
        $sym33$VALID_HASH_TEST_P = SubLObjectFactory.makeSymbol("VALID-HASH-TEST-P");
        $sym34$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym36$DO_DICTIONARY_CONTENTS = SubLObjectFactory.makeSymbol("DO-DICTIONARY-CONTENTS");
        $sym37$DICTIONARY_CONTENTS = SubLObjectFactory.makeSymbol("DICTIONARY-CONTENTS");
        $kw38$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym39$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-NOTE"), (SubLObject)SubLObjectFactory.makeString("Mapping dictionary..."))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-NOTE"));
        $kw42$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw43$PROGRESS_NOTE = SubLObjectFactory.makeKeyword("PROGRESS-NOTE");
        $str44$Mapping_dictionary___ = SubLObjectFactory.makeString("Mapping dictionary...");
        $sym45$SO_FAR = SubLObjectFactory.makeUninternedSymbol("SO-FAR");
        $sym46$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym47$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list48 = ConsesLow.list((SubLObject)dictionary.ZERO_INTEGER);
        $sym49$DICTIONARY_LENGTH = SubLObjectFactory.makeSymbol("DICTIONARY-LENGTH");
        $sym50$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym51$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym52$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym53$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $int54$61 = SubLObjectFactory.makeInteger(61);
        $sym55$CFASL_INPUT_DICTIONARY = SubLObjectFactory.makeSymbol("CFASL-INPUT-DICTIONARY");
        $sym56$CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-DICTIONARY-METHOD");
        $int57$64 = SubLObjectFactory.makeInteger(64);
        $sym58$CFASL_INPUT_LEGACY_DICTIONARY = SubLObjectFactory.makeSymbol("CFASL-INPUT-LEGACY-DICTIONARY");
    }
    
    public static final class $dictionary_native extends SubLStructNative
    {
        public SubLObject $database;
        public SubLObject $test;
        private static final SubLStructDeclNative structDecl;
        
        public $dictionary_native() {
            this.$database = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$dictionary_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$database;
        }
        
        public SubLObject getField3() {
            return this.$test;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$database = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$dictionary_native.class, dictionary.$sym0$DICTIONARY, dictionary.$sym1$DICTIONARY_P, dictionary.$list3, dictionary.$list4, new String[] { "$database", "$test" }, dictionary.$list5, dictionary.$list6, dictionary.$sym7$PRINT_DICTIONARY);
        }
    }
    
    public static final class $dictionary_p$UnaryFunction extends UnaryFunction
    {
        public $dictionary_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DICTIONARY-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return dictionary.dictionary_p(arg1);
        }
    }
    
    public static final class $cfasl_input_dictionary$UnaryFunction extends UnaryFunction
    {
        public $cfasl_input_dictionary$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CFASL-INPUT-DICTIONARY"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return dictionary.cfasl_input_dictionary(arg1);
        }
    }
}

/*

	Total time: 177 ms
	
*/