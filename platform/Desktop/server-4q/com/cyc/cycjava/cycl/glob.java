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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class glob extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.glob";
    public static final String myFingerPrint = "432f730c828fdccb34931aaf1543d2267c61c8c9e999021f55de4958c7cbb9e2";
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLSymbol $dtp_glob$;
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 8090L)
    private static SubLSymbol $default_initial_glob_size$;
    private static final SubLSymbol $sym0$GLOB;
    private static final SubLSymbol $sym1$GLOB_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_GLOB;
    private static final SubLSymbol $sym7$GLOB_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$GLOB_STRUC_TEST;
    private static final SubLSymbol $sym10$_CSETF_GLOB_STRUC_TEST;
    private static final SubLSymbol $sym11$GLOB_STRUC_MAX_SIZE;
    private static final SubLSymbol $sym12$_CSETF_GLOB_STRUC_MAX_SIZE;
    private static final SubLSymbol $sym13$GLOB_STRUC_ID_STATE;
    private static final SubLSymbol $sym14$_CSETF_GLOB_STRUC_ID_STATE;
    private static final SubLSymbol $sym15$GLOB_STRUC_LOCK;
    private static final SubLSymbol $sym16$_CSETF_GLOB_STRUC_LOCK;
    private static final SubLSymbol $sym17$GLOB_STRUC_INDEX;
    private static final SubLSymbol $sym18$_CSETF_GLOB_STRUC_INDEX;
    private static final SubLSymbol $sym19$GLOB_STRUC_BACK_INDEX;
    private static final SubLSymbol $sym20$_CSETF_GLOB_STRUC_BACK_INDEX;
    private static final SubLSymbol $sym21$GLOB_STRUC_OWNER;
    private static final SubLSymbol $sym22$_CSETF_GLOB_STRUC_OWNER;
    private static final SubLSymbol $kw23$TEST;
    private static final SubLSymbol $kw24$MAX_SIZE;
    private static final SubLSymbol $kw25$ID_STATE;
    private static final SubLSymbol $kw26$LOCK;
    private static final SubLSymbol $kw27$INDEX;
    private static final SubLSymbol $kw28$BACK_INDEX;
    private static final SubLSymbol $kw29$OWNER;
    private static final SubLString $str30$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw31$BEGIN;
    private static final SubLSymbol $sym32$MAKE_GLOB;
    private static final SubLSymbol $kw33$SLOT;
    private static final SubLSymbol $kw34$END;
    private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_GLOB_METHOD;
    private static final SubLString $str36$_;
    private static final SubLString $str37$_;
    private static final SubLString $str38$_size_;
    private static final SubLString $str39$_owner_;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$WITH_LOCK_HELD;
    private static final SubLSymbol $kw42$DICTIONARY;
    private static final SubLSymbol $kw43$UNKNOWN;
    private static final SubLSymbol $sym44$VALID_HASH_TEST_P;
    private static final SubLSymbol $sym45$NON_NEGATIVE_INTEGER_P;
    private static final SubLInteger $int46$50;
    private static final SubLString $str47$glob_lock;
    private static final SubLSymbol $sym48$GLOB_ID_P;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLSymbol $kw51$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw52$DONE;
    private static final SubLSymbol $sym53$DO_DICTIONARY;
    private static final SubLSymbol $sym54$DO_GLOB_INDEX;
    private static final SubLSymbol $sym55$DO_GLOB;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject glob_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_glob(v_object, stream, (SubLObject)glob.ZERO_INTEGER);
        return (SubLObject)glob.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject glob_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $glob_native.class) ? glob.T : glob.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject glob_struc_test(final SubLObject v_object) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject glob_struc_max_size(final SubLObject v_object) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject glob_struc_id_state(final SubLObject v_object) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject glob_struc_lock(final SubLObject v_object) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject glob_struc_index(final SubLObject v_object) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject glob_struc_back_index(final SubLObject v_object) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject glob_struc_owner(final SubLObject v_object) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject _csetf_glob_struc_test(final SubLObject v_object, final SubLObject value) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject _csetf_glob_struc_max_size(final SubLObject v_object, final SubLObject value) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject _csetf_glob_struc_id_state(final SubLObject v_object, final SubLObject value) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject _csetf_glob_struc_lock(final SubLObject v_object, final SubLObject value) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject _csetf_glob_struc_index(final SubLObject v_object, final SubLObject value) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject _csetf_glob_struc_back_index(final SubLObject v_object, final SubLObject value) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject _csetf_glob_struc_owner(final SubLObject v_object, final SubLObject value) {
        assert glob.NIL != glob_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject make_glob(SubLObject arglist) {
        if (arglist == glob.UNPROVIDED) {
            arglist = (SubLObject)glob.NIL;
        }
        final SubLObject v_new = (SubLObject)new $glob_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)glob.NIL, next = arglist; glob.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)glob.$kw23$TEST)) {
                _csetf_glob_struc_test(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)glob.$kw24$MAX_SIZE)) {
                _csetf_glob_struc_max_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)glob.$kw25$ID_STATE)) {
                _csetf_glob_struc_id_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)glob.$kw26$LOCK)) {
                _csetf_glob_struc_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)glob.$kw27$INDEX)) {
                _csetf_glob_struc_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)glob.$kw28$BACK_INDEX)) {
                _csetf_glob_struc_back_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)glob.$kw29$OWNER)) {
                _csetf_glob_struc_owner(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)glob.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject visit_defstruct_glob(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)glob.$kw31$BEGIN, (SubLObject)glob.$sym32$MAKE_GLOB, (SubLObject)glob.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)glob.$kw33$SLOT, (SubLObject)glob.$kw23$TEST, glob_struc_test(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)glob.$kw33$SLOT, (SubLObject)glob.$kw24$MAX_SIZE, glob_struc_max_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)glob.$kw33$SLOT, (SubLObject)glob.$kw25$ID_STATE, glob_struc_id_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)glob.$kw33$SLOT, (SubLObject)glob.$kw26$LOCK, glob_struc_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)glob.$kw33$SLOT, (SubLObject)glob.$kw27$INDEX, glob_struc_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)glob.$kw33$SLOT, (SubLObject)glob.$kw28$BACK_INDEX, glob_struc_back_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)glob.$kw33$SLOT, (SubLObject)glob.$kw29$OWNER, glob_struc_owner(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)glob.$kw34$END, (SubLObject)glob.$sym32$MAKE_GLOB, (SubLObject)glob.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 2402L)
    public static SubLObject visit_defstruct_object_glob_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_glob(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 3219L)
    public static SubLObject print_glob(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (glob.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)glob.T, (SubLObject)glob.T);
            streams_high.write_string((SubLObject)glob.$str36$_, stream, (SubLObject)glob.UNPROVIDED, (SubLObject)glob.UNPROVIDED);
            print_high.princ(hash_table_utilities.hash_test_to_symbol(glob_test(v_object)), stream);
            streams_high.write_string((SubLObject)glob.$str37$_, stream, (SubLObject)glob.UNPROVIDED, (SubLObject)glob.UNPROVIDED);
            streams_high.write_string((SubLObject)glob.$str38$_size_, stream, (SubLObject)glob.UNPROVIDED, (SubLObject)glob.UNPROVIDED);
            print_high.princ(glob_size(v_object), stream);
            if (glob.NIL != glob_owner(v_object)) {
                streams_high.write_string((SubLObject)glob.$str39$_owner_, stream, (SubLObject)glob.UNPROVIDED, (SubLObject)glob.UNPROVIDED);
                print_high.princ(glob_owner(v_object), stream);
            }
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)glob.T, (SubLObject)glob.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 4020L)
    public static SubLObject with_glob_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_glob = (SubLObject)glob.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)glob.$list40);
        v_glob = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)glob.$sym41$WITH_LOCK_HELD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)glob.$sym15$GLOB_STRUC_LOCK, v_glob)), ConsesLow.append(body, (SubLObject)glob.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 4263L)
    public static SubLObject new_glob_id_state() {
        return integer_sequence_generator.new_integer_sequence_generator((SubLObject)glob.UNPROVIDED, (SubLObject)glob.UNPROVIDED, (SubLObject)glob.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 4385L)
    public static SubLObject glob_id_state_reset(final SubLObject v_glob) {
        final SubLObject id_state = glob_struc_id_state(v_glob);
        return integer_sequence_generator.integer_sequence_generator_reset(id_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 4533L)
    public static SubLObject glob_id_state_next(final SubLObject v_glob) {
        final SubLObject id_state = glob_struc_id_state(v_glob);
        return integer_sequence_generator.integer_sequence_generator_next(id_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 4679L)
    public static SubLObject new_glob_index(final SubLObject test, final SubLObject initial_size) {
        return dictionary.new_dictionary(test, initial_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 4799L)
    public static SubLObject glob_index_reset(final SubLObject v_glob) {
        final SubLObject index = glob_struc_index(v_glob);
        return dictionary.clear_dictionary(index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 4919L)
    public static SubLObject glob_index_style(final SubLObject v_glob) {
        final SubLObject index = glob_struc_index(v_glob);
        if (glob.NIL != dictionary.dictionary_p(index)) {
            return (SubLObject)glob.$kw42$DICTIONARY;
        }
        return (SubLObject)glob.$kw43$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 5135L)
    public static SubLObject glob_index_size(final SubLObject v_glob) {
        final SubLObject index = glob_struc_index(v_glob);
        return dictionary.dictionary_length(index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 5259L)
    public static SubLObject glob_index_enter(final SubLObject v_glob, final SubLObject id, final SubLObject v_object) {
        final SubLObject index = glob_struc_index(v_glob);
        return dictionary.dictionary_enter(index, id, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 5399L)
    public static SubLObject glob_index_lookup(final SubLObject v_glob, final SubLObject id, final SubLObject v_default) {
        final SubLObject index = glob_struc_index(v_glob);
        return dictionary.dictionary_lookup(index, id, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 5543L)
    public static SubLObject glob_index_remove(final SubLObject v_glob, final SubLObject id) {
        final SubLObject index = glob_struc_index(v_glob);
        return dictionary.dictionary_remove(index, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 5671L)
    public static SubLObject new_glob_back_index(final SubLObject test, final SubLObject initial_size) {
        return dictionary.new_dictionary(test, initial_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 5800L)
    public static SubLObject glob_back_index_reset(final SubLObject v_glob) {
        final SubLObject back_index = glob_struc_back_index(v_glob);
        return dictionary.clear_dictionary(back_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 5940L)
    public static SubLObject glob_back_index_style(final SubLObject v_glob) {
        final SubLObject back_index = glob_struc_back_index(v_glob);
        if (glob.NIL != dictionary.dictionary_p(back_index)) {
            return (SubLObject)glob.$kw42$DICTIONARY;
        }
        return (SubLObject)glob.$kw43$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 6176L)
    public static SubLObject glob_back_index_enter(final SubLObject v_glob, final SubLObject v_object, final SubLObject id) {
        final SubLObject back_index = glob_struc_back_index(v_glob);
        return dictionary.dictionary_enter(back_index, v_object, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 6338L)
    public static SubLObject glob_back_index_lookup(final SubLObject v_glob, final SubLObject v_object, final SubLObject v_default) {
        final SubLObject back_index = glob_struc_back_index(v_glob);
        return dictionary.dictionary_lookup(back_index, v_object, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 6510L)
    public static SubLObject glob_back_index_remove(final SubLObject v_glob, final SubLObject v_object) {
        final SubLObject back_index = glob_struc_back_index(v_glob);
        return dictionary.dictionary_remove(back_index, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 6666L)
    public static SubLObject glob_id_p(final SubLObject v_object) {
        return subl_promotions.non_negative_integer_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 6998L)
    public static SubLObject invalid_glob_id_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(glob.NIL == glob_id_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 7124L)
    public static SubLObject new_glob(SubLObject test, SubLObject initial_size, SubLObject max_size) {
        if (test == glob.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)glob.EQL);
        }
        if (initial_size == glob.UNPROVIDED) {
            initial_size = (SubLObject)glob.NIL;
        }
        if (max_size == glob.UNPROVIDED) {
            max_size = (SubLObject)glob.NIL;
        }
        assert glob.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        if (glob.NIL != initial_size && !glob.assertionsDisabledSynth && glob.NIL == subl_promotions.non_negative_integer_p(initial_size)) {
            throw new AssertionError(initial_size);
        }
        if (glob.NIL != max_size) {
            assert glob.NIL != subl_promotions.non_negative_integer_p(max_size) : max_size;
            max_size = (SubLObject)glob.NIL;
        }
        final SubLObject v_glob = make_glob((SubLObject)glob.UNPROVIDED);
        _csetf_glob_struc_test(v_glob, hash_table_utilities.hash_test_to_symbol(test));
        _csetf_glob_struc_max_size(v_glob, max_size);
        initialize_glob_indices(v_glob, initial_size);
        return v_glob;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 7953L)
    public static SubLObject glob_reset(final SubLObject v_glob) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        return reinitialize_glob_indices(v_glob);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 8157L)
    public static SubLObject initialize_glob_indices(final SubLObject v_glob, SubLObject initial_size) {
        if (glob.NIL == initial_size) {
            initial_size = glob.$default_initial_glob_size$.getGlobalValue();
        }
        final SubLObject test = glob_test(v_glob);
        _csetf_glob_struc_id_state(v_glob, new_glob_id_state());
        _csetf_glob_struc_lock(v_glob, Locks.make_lock((SubLObject)glob.$str47$glob_lock));
        _csetf_glob_struc_index(v_glob, new_glob_index(test, initial_size));
        _csetf_glob_struc_back_index(v_glob, new_glob_back_index(test, initial_size));
        return v_glob;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 8628L)
    public static SubLObject reinitialize_glob_indices(final SubLObject v_glob) {
        final SubLObject lock = glob_struc_lock(v_glob);
        SubLObject release = (SubLObject)glob.NIL;
        try {
            release = Locks.seize_lock(lock);
            glob_id_state_reset(v_glob);
            glob_index_reset(v_glob);
            glob_back_index_reset(v_glob);
        }
        finally {
            if (glob.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_glob;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 8808L)
    public static SubLObject glob_test(final SubLObject v_glob) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        return glob_struc_test(v_glob);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 8982L)
    public static SubLObject glob_max_size(final SubLObject v_glob) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        return glob_struc_max_size(v_glob);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 9141L)
    public static SubLObject glob_size(final SubLObject v_glob) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        return glob_index_size(v_glob);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 9282L)
    public static SubLObject glob_owner(final SubLObject v_glob) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        return glob_struc_owner(v_glob);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 9405L)
    public static SubLObject glob_lookup(final SubLObject v_glob, final SubLObject id, SubLObject v_default) {
        if (v_default == glob.UNPROVIDED) {
            v_default = (SubLObject)glob.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert glob.NIL != glob_p(v_glob) : v_glob;
        assert glob.NIL != glob_id_p(id) : id;
        SubLObject v_object = (SubLObject)glob.NIL;
        SubLObject validP = (SubLObject)glob.NIL;
        final SubLObject lock = glob_struc_lock(v_glob);
        SubLObject release = (SubLObject)glob.NIL;
        try {
            release = Locks.seize_lock(lock);
            thread.resetMultipleValues();
            final SubLObject v_object_$1 = glob_index_lookup(v_glob, id, v_default);
            final SubLObject validP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_object = v_object_$1;
            validP = validP_$2;
        }
        finally {
            if (glob.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return Values.values(v_object, validP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 9828L)
    public static SubLObject glob_object_id(final SubLObject v_glob, final SubLObject v_object, SubLObject v_default) {
        if (v_default == glob.UNPROVIDED) {
            v_default = (SubLObject)glob.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert glob.NIL != glob_p(v_glob) : v_glob;
        SubLObject id = (SubLObject)glob.NIL;
        SubLObject validP = (SubLObject)glob.NIL;
        final SubLObject lock = glob_struc_lock(v_glob);
        SubLObject release = (SubLObject)glob.NIL;
        try {
            release = Locks.seize_lock(lock);
            thread.resetMultipleValues();
            final SubLObject id_$3 = glob_back_index_lookup(v_glob, v_object, v_default);
            final SubLObject validP_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            id = id_$3;
            validP = validP_$4;
        }
        finally {
            if (glob.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return Values.values(id, validP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 10198L)
    public static SubLObject glob_enter(final SubLObject v_glob, final SubLObject v_object) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        final SubLObject existing_id = glob_object_id(v_glob, v_object, (SubLObject)glob.NIL);
        if (glob.NIL != glob_id_p(existing_id)) {
            return existing_id;
        }
        final SubLObject new_id = glob_id_state_next(v_glob);
        glob_enter_internal(v_glob, new_id, v_object);
        return new_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 10705L)
    public static SubLObject glob_remove(final SubLObject v_glob, final SubLObject v_object) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        final SubLObject id = glob_object_id(v_glob, v_object, (SubLObject)glob.NIL);
        return glob_remove_internal(v_glob, id, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 10901L)
    public static SubLObject glob_remove_id(final SubLObject v_glob, final SubLObject id) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        assert glob.NIL != glob_id_p(id) : id;
        final SubLObject v_object = glob_lookup(v_glob, id, (SubLObject)glob.NIL);
        return glob_remove_internal(v_glob, id, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 11133L)
    public static SubLObject glob_note_owner(final SubLObject v_glob, final SubLObject owner) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        final SubLObject lock = glob_struc_lock(v_glob);
        SubLObject release = (SubLObject)glob.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_glob_struc_owner(v_glob, owner);
        }
        finally {
            if (glob.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_glob;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 11324L)
    public static SubLObject glob_enter_internal(final SubLObject v_glob, final SubLObject id, final SubLObject v_object) {
        final SubLObject lock = glob_struc_lock(v_glob);
        SubLObject release = (SubLObject)glob.NIL;
        try {
            release = Locks.seize_lock(lock);
            glob_index_enter(v_glob, id, v_object);
            glob_back_index_enter(v_glob, v_object, id);
        }
        finally {
            if (glob.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_glob;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 11514L)
    public static SubLObject glob_remove_internal(final SubLObject v_glob, final SubLObject id, final SubLObject v_object) {
        final SubLObject lock = glob_struc_lock(v_glob);
        SubLObject release = (SubLObject)glob.NIL;
        try {
            release = Locks.seize_lock(lock);
            glob_index_remove(v_glob, id);
            glob_back_index_remove(v_glob, v_object);
        }
        finally {
            if (glob.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_glob;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 11683L)
    public static SubLObject new_glob_iterator(final SubLObject v_glob) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        return dictionary.new_dictionary_iterator(glob_struc_index(v_glob));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 11943L)
    public static SubLObject do_glob(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)glob.$list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = (SubLObject)glob.NIL;
        SubLObject v_object = (SubLObject)glob.NIL;
        SubLObject v_glob = (SubLObject)glob.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)glob.$list49);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)glob.$list49);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)glob.$list49);
        v_glob = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)glob.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)glob.NIL;
        SubLObject current_$5 = (SubLObject)glob.NIL;
        while (glob.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)glob.$list49);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)glob.$list49);
            if (glob.NIL == conses_high.member(current_$5, (SubLObject)glob.$list50, (SubLObject)glob.UNPROVIDED, (SubLObject)glob.UNPROVIDED)) {
                bad = (SubLObject)glob.T;
            }
            if (current_$5 == glob.$kw51$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (glob.NIL != bad && glob.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)glob.$list49);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)glob.$kw52$DONE, current);
        final SubLObject done = (SubLObject)((glob.NIL != done_tail) ? conses_high.cadr(done_tail) : glob.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)glob.$sym53$DO_DICTIONARY, (SubLObject)ConsesLow.listS(id, v_object, (SubLObject)ConsesLow.list((SubLObject)glob.$sym54$DO_GLOB_INDEX, v_glob), ConsesLow.append((SubLObject)((glob.NIL != done) ? ConsesLow.list(done) : glob.NIL), (SubLObject)glob.NIL)), ConsesLow.append(body, (SubLObject)glob.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 12383L)
    public static SubLObject do_glob_index(final SubLObject v_glob) {
        assert glob.NIL != glob_p(v_glob) : v_glob;
        return glob_struc_index(v_glob);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/glob.lisp", position = 12505L)
    public static SubLObject print_glob_contents(final SubLObject v_glob) {
        return dictionary_utilities.print_dictionary_contents(glob_struc_index(v_glob), (SubLObject)glob.UNPROVIDED);
    }
    
    public static SubLObject declare_glob_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_print_function_trampoline", "GLOB-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_p", "GLOB-P", 1, 0, false);
        new $glob_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_struc_test", "GLOB-STRUC-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_struc_max_size", "GLOB-STRUC-MAX-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_struc_id_state", "GLOB-STRUC-ID-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_struc_lock", "GLOB-STRUC-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_struc_index", "GLOB-STRUC-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_struc_back_index", "GLOB-STRUC-BACK-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_struc_owner", "GLOB-STRUC-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "_csetf_glob_struc_test", "_CSETF-GLOB-STRUC-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "_csetf_glob_struc_max_size", "_CSETF-GLOB-STRUC-MAX-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "_csetf_glob_struc_id_state", "_CSETF-GLOB-STRUC-ID-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "_csetf_glob_struc_lock", "_CSETF-GLOB-STRUC-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "_csetf_glob_struc_index", "_CSETF-GLOB-STRUC-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "_csetf_glob_struc_back_index", "_CSETF-GLOB-STRUC-BACK-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "_csetf_glob_struc_owner", "_CSETF-GLOB-STRUC-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "make_glob", "MAKE-GLOB", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "visit_defstruct_glob", "VISIT-DEFSTRUCT-GLOB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "visit_defstruct_object_glob_method", "VISIT-DEFSTRUCT-OBJECT-GLOB-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "print_glob", "PRINT-GLOB", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.glob", "with_glob_lock", "WITH-GLOB-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "new_glob_id_state", "NEW-GLOB-ID-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_id_state_reset", "GLOB-ID-STATE-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_id_state_next", "GLOB-ID-STATE-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "new_glob_index", "NEW-GLOB-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_index_reset", "GLOB-INDEX-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_index_style", "GLOB-INDEX-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_index_size", "GLOB-INDEX-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_index_enter", "GLOB-INDEX-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_index_lookup", "GLOB-INDEX-LOOKUP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_index_remove", "GLOB-INDEX-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "new_glob_back_index", "NEW-GLOB-BACK-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_back_index_reset", "GLOB-BACK-INDEX-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_back_index_style", "GLOB-BACK-INDEX-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_back_index_enter", "GLOB-BACK-INDEX-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_back_index_lookup", "GLOB-BACK-INDEX-LOOKUP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_back_index_remove", "GLOB-BACK-INDEX-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_id_p", "GLOB-ID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "invalid_glob_id_p", "INVALID-GLOB-ID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "new_glob", "NEW-GLOB", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_reset", "GLOB-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "initialize_glob_indices", "INITIALIZE-GLOB-INDICES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "reinitialize_glob_indices", "REINITIALIZE-GLOB-INDICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_test", "GLOB-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_max_size", "GLOB-MAX-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_size", "GLOB-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_owner", "GLOB-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_lookup", "GLOB-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_object_id", "GLOB-OBJECT-ID", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_enter", "GLOB-ENTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_remove", "GLOB-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_remove_id", "GLOB-REMOVE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_note_owner", "GLOB-NOTE-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_enter_internal", "GLOB-ENTER-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "glob_remove_internal", "GLOB-REMOVE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "new_glob_iterator", "NEW-GLOB-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.glob", "do_glob", "DO-GLOB");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "do_glob_index", "DO-GLOB-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.glob", "print_glob_contents", "PRINT-GLOB-CONTENTS", 1, 0, false);
        return (SubLObject)glob.NIL;
    }
    
    public static SubLObject init_glob_file() {
        glob.$dtp_glob$ = SubLFiles.defconstant("*DTP-GLOB*", (SubLObject)glob.$sym0$GLOB);
        glob.$default_initial_glob_size$ = SubLFiles.deflexical("*DEFAULT-INITIAL-GLOB-SIZE*", (SubLObject)glob.$int46$50);
        return (SubLObject)glob.NIL;
    }
    
    public static SubLObject setup_glob_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), glob.$dtp_glob$.getGlobalValue(), Symbols.symbol_function((SubLObject)glob.$sym7$GLOB_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)glob.$list8);
        Structures.def_csetf((SubLObject)glob.$sym9$GLOB_STRUC_TEST, (SubLObject)glob.$sym10$_CSETF_GLOB_STRUC_TEST);
        Structures.def_csetf((SubLObject)glob.$sym11$GLOB_STRUC_MAX_SIZE, (SubLObject)glob.$sym12$_CSETF_GLOB_STRUC_MAX_SIZE);
        Structures.def_csetf((SubLObject)glob.$sym13$GLOB_STRUC_ID_STATE, (SubLObject)glob.$sym14$_CSETF_GLOB_STRUC_ID_STATE);
        Structures.def_csetf((SubLObject)glob.$sym15$GLOB_STRUC_LOCK, (SubLObject)glob.$sym16$_CSETF_GLOB_STRUC_LOCK);
        Structures.def_csetf((SubLObject)glob.$sym17$GLOB_STRUC_INDEX, (SubLObject)glob.$sym18$_CSETF_GLOB_STRUC_INDEX);
        Structures.def_csetf((SubLObject)glob.$sym19$GLOB_STRUC_BACK_INDEX, (SubLObject)glob.$sym20$_CSETF_GLOB_STRUC_BACK_INDEX);
        Structures.def_csetf((SubLObject)glob.$sym21$GLOB_STRUC_OWNER, (SubLObject)glob.$sym22$_CSETF_GLOB_STRUC_OWNER);
        Equality.identity((SubLObject)glob.$sym0$GLOB);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), glob.$dtp_glob$.getGlobalValue(), Symbols.symbol_function((SubLObject)glob.$sym35$VISIT_DEFSTRUCT_OBJECT_GLOB_METHOD));
        access_macros.register_macro_helper((SubLObject)glob.$sym54$DO_GLOB_INDEX, (SubLObject)glob.$sym55$DO_GLOB);
        return (SubLObject)glob.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_glob_file();
    }
    
    @Override
	public void initializeVariables() {
        init_glob_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_glob_file();
    }
    
    static {
        me = (SubLFile)new glob();
        glob.$dtp_glob$ = null;
        glob.$default_initial_glob_size$ = null;
        $sym0$GLOB = SubLObjectFactory.makeSymbol("GLOB");
        $sym1$GLOB_P = SubLObjectFactory.makeSymbol("GLOB-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("ID-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("BACK-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("OWNER"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("ID-STATE"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("BACK-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLOB-STRUC-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("GLOB-STRUC-MAX-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("GLOB-STRUC-ID-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("GLOB-STRUC-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("GLOB-STRUC-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("GLOB-STRUC-BACK-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("GLOB-STRUC-OWNER"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-MAX-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-ID-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-BACK-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-OWNER"));
        $sym6$PRINT_GLOB = SubLObjectFactory.makeSymbol("PRINT-GLOB");
        $sym7$GLOB_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GLOB-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GLOB-P"));
        $sym9$GLOB_STRUC_TEST = SubLObjectFactory.makeSymbol("GLOB-STRUC-TEST");
        $sym10$_CSETF_GLOB_STRUC_TEST = SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-TEST");
        $sym11$GLOB_STRUC_MAX_SIZE = SubLObjectFactory.makeSymbol("GLOB-STRUC-MAX-SIZE");
        $sym12$_CSETF_GLOB_STRUC_MAX_SIZE = SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-MAX-SIZE");
        $sym13$GLOB_STRUC_ID_STATE = SubLObjectFactory.makeSymbol("GLOB-STRUC-ID-STATE");
        $sym14$_CSETF_GLOB_STRUC_ID_STATE = SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-ID-STATE");
        $sym15$GLOB_STRUC_LOCK = SubLObjectFactory.makeSymbol("GLOB-STRUC-LOCK");
        $sym16$_CSETF_GLOB_STRUC_LOCK = SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-LOCK");
        $sym17$GLOB_STRUC_INDEX = SubLObjectFactory.makeSymbol("GLOB-STRUC-INDEX");
        $sym18$_CSETF_GLOB_STRUC_INDEX = SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-INDEX");
        $sym19$GLOB_STRUC_BACK_INDEX = SubLObjectFactory.makeSymbol("GLOB-STRUC-BACK-INDEX");
        $sym20$_CSETF_GLOB_STRUC_BACK_INDEX = SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-BACK-INDEX");
        $sym21$GLOB_STRUC_OWNER = SubLObjectFactory.makeSymbol("GLOB-STRUC-OWNER");
        $sym22$_CSETF_GLOB_STRUC_OWNER = SubLObjectFactory.makeSymbol("_CSETF-GLOB-STRUC-OWNER");
        $kw23$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw24$MAX_SIZE = SubLObjectFactory.makeKeyword("MAX-SIZE");
        $kw25$ID_STATE = SubLObjectFactory.makeKeyword("ID-STATE");
        $kw26$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw27$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw28$BACK_INDEX = SubLObjectFactory.makeKeyword("BACK-INDEX");
        $kw29$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $str30$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw31$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym32$MAKE_GLOB = SubLObjectFactory.makeSymbol("MAKE-GLOB");
        $kw33$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw34$END = SubLObjectFactory.makeKeyword("END");
        $sym35$VISIT_DEFSTRUCT_OBJECT_GLOB_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GLOB-METHOD");
        $str36$_ = SubLObjectFactory.makeString("(");
        $str37$_ = SubLObjectFactory.makeString(")");
        $str38$_size_ = SubLObjectFactory.makeString(" size=");
        $str39$_owner_ = SubLObjectFactory.makeString(" owner=");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GLOB"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym41$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $kw42$DICTIONARY = SubLObjectFactory.makeKeyword("DICTIONARY");
        $kw43$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym44$VALID_HASH_TEST_P = SubLObjectFactory.makeSymbol("VALID-HASH-TEST-P");
        $sym45$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $int46$50 = SubLObjectFactory.makeInteger(50);
        $str47$glob_lock = SubLObjectFactory.makeString("glob lock");
        $sym48$GLOB_ID_P = SubLObjectFactory.makeSymbol("GLOB-ID-P");
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("GLOB"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw51$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw52$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym53$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $sym54$DO_GLOB_INDEX = SubLObjectFactory.makeSymbol("DO-GLOB-INDEX");
        $sym55$DO_GLOB = SubLObjectFactory.makeSymbol("DO-GLOB");
    }
    
    public static final class $glob_native extends SubLStructNative
    {
        public SubLObject $test;
        public SubLObject $max_size;
        public SubLObject $id_state;
        public SubLObject $lock;
        public SubLObject $index;
        public SubLObject $back_index;
        public SubLObject $owner;
        private static final SubLStructDeclNative structDecl;
        
        public $glob_native() {
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$max_size = (SubLObject)CommonSymbols.NIL;
            this.$id_state = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$back_index = (SubLObject)CommonSymbols.NIL;
            this.$owner = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$glob_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$test;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$max_size;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$id_state;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$lock;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$index;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$back_index;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$owner;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$test = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$max_size = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$id_state = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$lock = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$index = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$back_index = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$owner = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$glob_native.class, glob.$sym0$GLOB, glob.$sym1$GLOB_P, glob.$list2, glob.$list3, new String[] { "$test", "$max_size", "$id_state", "$lock", "$index", "$back_index", "$owner" }, glob.$list4, glob.$list5, glob.$sym6$PRINT_GLOB);
        }
    }
    
    public static final class $glob_p$UnaryFunction extends UnaryFunction
    {
        public $glob_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GLOB-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return glob.glob_p(arg1);
        }
    }
}

/*

	Total time: 199 ms
	 synthetic 
*/