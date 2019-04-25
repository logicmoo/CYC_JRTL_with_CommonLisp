package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
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

public final class tries extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.tries";
    public static final String myFingerPrint = "63c2034ccd68b8e09c42febc79c365cb89d31757554afbe46cf04c5c8bea04f8";
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1113L)
    public static SubLSymbol $trie_objects$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1249L)
    public static SubLSymbol $trie_relevant_marks$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1371L)
    public static SubLSymbol $trie_ancestor_tracking$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLSymbol $dtp_trie$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 2397L)
    private static SubLSymbol $trie_free_list$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 2397L)
    private static SubLSymbol $trie_free_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 21792L)
    private static SubLSymbol $trie_maximum_search_size$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 38144L)
    public static SubLSymbol $trie_ancestor_tracking_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 38362L)
    public static SubLSymbol $trie_ancestor_tracking_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 38448L)
    public static SubLSymbol $trie_ancestor_tracking_vector_size$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 39304L)
    public static SubLSymbol $trie_ancestor_vector$;
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 39347L)
    public static SubLSymbol $trie_ancestor_next$;
    private static final SubLSymbol $kw0$ALL;
    private static final SubLSymbol $sym1$TRIE;
    private static final SubLSymbol $sym2$TRIE_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_TRIE;
    private static final SubLSymbol $sym8$TRIE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$TRIE_NAME;
    private static final SubLSymbol $sym11$_CSETF_TRIE_NAME;
    private static final SubLSymbol $sym12$TRIE_TOP_NODE;
    private static final SubLSymbol $sym13$_CSETF_TRIE_TOP_NODE;
    private static final SubLSymbol $sym14$TRIE_UNIQUE;
    private static final SubLSymbol $sym15$_CSETF_TRIE_UNIQUE;
    private static final SubLSymbol $sym16$TRIE_CASE_SENSITIVE;
    private static final SubLSymbol $sym17$_CSETF_TRIE_CASE_SENSITIVE;
    private static final SubLSymbol $sym18$TRIE_ENTRY_TEST_FUNC;
    private static final SubLSymbol $sym19$_CSETF_TRIE_ENTRY_TEST_FUNC;
    private static final SubLSymbol $sym20$TRIE_MULTI;
    private static final SubLSymbol $sym21$_CSETF_TRIE_MULTI;
    private static final SubLSymbol $sym22$TRIE_MULTI_KEYS;
    private static final SubLSymbol $sym23$_CSETF_TRIE_MULTI_KEYS;
    private static final SubLSymbol $sym24$TRIE_MULTI_KEY_FUNC;
    private static final SubLSymbol $sym25$_CSETF_TRIE_MULTI_KEY_FUNC;
    private static final SubLSymbol $kw26$NAME;
    private static final SubLSymbol $kw27$TOP_NODE;
    private static final SubLSymbol $kw28$UNIQUE;
    private static final SubLSymbol $kw29$CASE_SENSITIVE;
    private static final SubLSymbol $kw30$ENTRY_TEST_FUNC;
    private static final SubLSymbol $kw31$MULTI;
    private static final SubLSymbol $kw32$MULTI_KEYS;
    private static final SubLSymbol $kw33$MULTI_KEY_FUNC;
    private static final SubLString $str34$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw35$BEGIN;
    private static final SubLSymbol $sym36$MAKE_TRIE;
    private static final SubLSymbol $kw37$SLOT;
    private static final SubLSymbol $kw38$END;
    private static final SubLSymbol $sym39$VISIT_DEFSTRUCT_OBJECT_TRIE_METHOD;
    private static final SubLString $str40$__TRIE;
    private static final SubLString $str41$__A;
    private static final SubLString $str42$_UNIQUE;
    private static final SubLString $str43$_SENSITIVE;
    private static final SubLString $str44$_INSENSITIVE;
    private static final SubLString $str45$__S;
    private static final SubLString $str46$_;
    private static final SubLString $str47$TRIE_resource_lock;
    private static final SubLSymbol $kw48$FREE;
    private static final SubLSymbol $kw49$TOP;
    private static final SubLString $str50$_m___S;
    private static final SubLString $str51$_____S;
    private static final SubLSymbol $sym52$STRINGP;
    private static final SubLString $str53$There_is_already_an_object__S_not;
    private static final SubLString $str54$Remove_it_anyway;
    private static final SubLString $str55$The_object_found_in_trie_for__S_i;
    private static final SubLString $str56$TRIE__S_does_not_have_unique_entr;
    private static final SubLInteger $int57$1000;
    private static final SubLString $str58$_S_will_result_in_a_search_that_i;
    private static final SubLSymbol $kw59$MAPPING_DONE;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $kw62$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw63$DONE;
    private static final SubLSymbol $kw64$FORWARD;
    private static final SubLSymbol $sym65$ITERATOR;
    private static final SubLSymbol $sym66$CLET;
    private static final SubLSymbol $sym67$NEW_TRIE_ITERATOR;
    private static final SubLSymbol $sym68$DO_ITERATOR;
    private static final SubLSymbol $sym69$TRIE_ITERATOR_DONE;
    private static final SubLSymbol $sym70$TRIE_ITERATOR_NEXT;
    private static final SubLSymbol $sym71$TRIE_ITERATOR_FINALIZE;
    private static final SubLString $str72$Ancestor_Tracking_Resource;
    private static final SubLInteger $int73$100;
    private static final SubLSymbol $kw74$ERROR;
    private static final SubLSymbol $sym75$MULTI_TRIE_P;
    private static final SubLList $list76;
    private static final SubLString $str77$_A__A;
    private static final SubLSymbol $sym78$CAR;
    private static final SubLList $list79;
    private static final SubLString $str80$___S_sub_tries;
    private static final SubLString $str81$____Sub_Trie__S;
    private static final SubLSymbol $sym82$TRIE_LEAF_NODE_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject trie_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_trie(v_object, stream, (SubLObject)tries.ZERO_INTEGER);
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject trie_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $trie_native.class) ? tries.T : tries.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject trie_name(final SubLObject v_object) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject trie_top_node(final SubLObject v_object) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject trie_unique(final SubLObject v_object) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject trie_case_sensitive(final SubLObject v_object) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject trie_entry_test_func(final SubLObject v_object) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject trie_multi(final SubLObject v_object) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject trie_multi_keys(final SubLObject v_object) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject trie_multi_key_func(final SubLObject v_object) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject _csetf_trie_name(final SubLObject v_object, final SubLObject value) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject _csetf_trie_top_node(final SubLObject v_object, final SubLObject value) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject _csetf_trie_unique(final SubLObject v_object, final SubLObject value) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject _csetf_trie_case_sensitive(final SubLObject v_object, final SubLObject value) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject _csetf_trie_entry_test_func(final SubLObject v_object, final SubLObject value) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject _csetf_trie_multi(final SubLObject v_object, final SubLObject value) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject _csetf_trie_multi_keys(final SubLObject v_object, final SubLObject value) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject _csetf_trie_multi_key_func(final SubLObject v_object, final SubLObject value) {
        assert tries.NIL != trie_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject make_trie(SubLObject arglist) {
        if (arglist == tries.UNPROVIDED) {
            arglist = (SubLObject)tries.NIL;
        }
        final SubLObject v_new = (SubLObject)new $trie_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)tries.NIL, next = arglist; tries.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)tries.$kw26$NAME)) {
                _csetf_trie_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tries.$kw27$TOP_NODE)) {
                _csetf_trie_top_node(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tries.$kw28$UNIQUE)) {
                _csetf_trie_unique(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tries.$kw29$CASE_SENSITIVE)) {
                _csetf_trie_case_sensitive(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tries.$kw30$ENTRY_TEST_FUNC)) {
                _csetf_trie_entry_test_func(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tries.$kw31$MULTI)) {
                _csetf_trie_multi(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tries.$kw32$MULTI_KEYS)) {
                _csetf_trie_multi_keys(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tries.$kw33$MULTI_KEY_FUNC)) {
                _csetf_trie_multi_key_func(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)tries.$str34$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject visit_defstruct_trie(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)tries.$kw35$BEGIN, (SubLObject)tries.$sym36$MAKE_TRIE, (SubLObject)tries.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)tries.$kw37$SLOT, (SubLObject)tries.$kw26$NAME, trie_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tries.$kw37$SLOT, (SubLObject)tries.$kw27$TOP_NODE, trie_top_node(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tries.$kw37$SLOT, (SubLObject)tries.$kw28$UNIQUE, trie_unique(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tries.$kw37$SLOT, (SubLObject)tries.$kw29$CASE_SENSITIVE, trie_case_sensitive(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tries.$kw37$SLOT, (SubLObject)tries.$kw30$ENTRY_TEST_FUNC, trie_entry_test_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tries.$kw37$SLOT, (SubLObject)tries.$kw31$MULTI, trie_multi(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tries.$kw37$SLOT, (SubLObject)tries.$kw32$MULTI_KEYS, trie_multi_keys(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tries.$kw37$SLOT, (SubLObject)tries.$kw33$MULTI_KEY_FUNC, trie_multi_key_func(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tries.$kw38$END, (SubLObject)tries.$sym36$MAKE_TRIE, (SubLObject)tries.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1509L)
    public static SubLObject visit_defstruct_object_trie_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_trie(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 1764L)
    public static SubLObject print_trie(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = trie_name(v_object);
        PrintLow.format(stream, (SubLObject)tries.$str40$__TRIE);
        if (tries.NIL != name) {
            PrintLow.format(stream, (SubLObject)tries.$str41$__A, name);
        }
        else {
            final SubLObject unique = trie_unique(v_object);
            final SubLObject entry_test_func = trie_entry_test_func(v_object);
            final SubLObject case_sensitive = trie_case_sensitive(v_object);
            final SubLObject multiP = trie_multi(v_object);
            if (tries.NIL != unique) {
                PrintLow.format(stream, (SubLObject)tries.$str42$_UNIQUE);
            }
            PrintLow.format(stream, (SubLObject)tries.$str41$__A, entry_test_func);
            if (tries.NIL != case_sensitive) {
                PrintLow.format(stream, (SubLObject)tries.$str43$_SENSITIVE);
            }
            else {
                PrintLow.format(stream, (SubLObject)tries.$str44$_INSENSITIVE);
            }
            if (tries.NIL != multiP) {
                PrintLow.format(stream, (SubLObject)tries.$str45$__S, trie_multi_keys(v_object));
            }
        }
        PrintLow.format(stream, (SubLObject)tries.$str46$_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 2397L)
    public static SubLObject make_static_trie() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = (SubLObject)tries.NIL;
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            v_object = make_trie((SubLObject)tries.UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 2397L)
    public static SubLObject init_trie(final SubLObject trie) {
        _csetf_trie_name(trie, (SubLObject)tries.NIL);
        _csetf_trie_top_node(trie, (SubLObject)tries.NIL);
        _csetf_trie_unique(trie, (SubLObject)tries.NIL);
        _csetf_trie_case_sensitive(trie, (SubLObject)tries.NIL);
        _csetf_trie_entry_test_func(trie, (SubLObject)tries.NIL);
        _csetf_trie_multi(trie, (SubLObject)tries.NIL);
        _csetf_trie_multi_keys(trie, (SubLObject)tries.NIL);
        _csetf_trie_multi_key_func(trie, (SubLObject)tries.NIL);
        return trie;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 2397L)
    public static SubLObject free_trie_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tries.NIL != trie_p(v_object) && trie_top_node(v_object) == tries.$kw48$FREE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 2397L)
    public static SubLObject free_trie(SubLObject v_object) {
        assert tries.NIL != trie_p(v_object) : v_object;
        if (tries.NIL == free_trie_p(v_object)) {
            v_object = init_trie(v_object);
            _csetf_trie_top_node(v_object, (SubLObject)tries.$kw48$FREE);
            if (tries.NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue()) {
                SubLObject release = (SubLObject)tries.NIL;
                try {
                    release = Locks.seize_lock(tries.$trie_free_lock$.getGlobalValue());
                    _csetf_trie_name(v_object, tries.$trie_free_list$.getGlobalValue());
                    tries.$trie_free_list$.setGlobalValue(v_object);
                }
                finally {
                    if (tries.NIL != release) {
                        Locks.release_lock(tries.$trie_free_lock$.getGlobalValue());
                    }
                }
            }
            return (SubLObject)tries.T;
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 2397L)
    public static SubLObject get_trie() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue()) {
            SubLObject v_object = (SubLObject)tries.NIL;
            SubLObject found = (SubLObject)tries.NIL;
            SubLObject release = (SubLObject)tries.NIL;
            try {
                release = Locks.seize_lock(tries.$trie_free_lock$.getGlobalValue());
                v_object = tries.$trie_free_list$.getGlobalValue();
                while (tries.NIL == found && tries.NIL != v_object) {
                    if (tries.NIL != free_trie_p(v_object)) {
                        tries.$trie_free_list$.setGlobalValue(trie_name(v_object));
                        found = (SubLObject)tries.T;
                    }
                    else {
                        v_object = trie_name(v_object);
                    }
                }
                if (tries.NIL == found) {
                    if (tries.NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread)) {
                        v_object = make_static_trie();
                    }
                    else {
                        v_object = make_trie((SubLObject)tries.UNPROVIDED);
                    }
                    tries.$trie_free_list$.setGlobalValue((SubLObject)tries.NIL);
                }
            }
            finally {
                if (tries.NIL != release) {
                    Locks.release_lock(tries.$trie_free_lock$.getGlobalValue());
                }
            }
            return init_trie(v_object);
        }
        if (tries.NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread)) {
            return init_trie(make_static_trie());
        }
        return init_trie(make_trie((SubLObject)tries.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 2833L)
    public static SubLObject trie_node_key(final SubLObject node) {
        final SubLObject car = node.first();
        return car.isAtom() ? car : car.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 3011L)
    public static SubLObject trie_node_data(final SubLObject node) {
        return node.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 3070L)
    public static SubLObject trie_node_subnodes(final SubLObject node) {
        return node.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 3133L)
    public static SubLObject trie_leaf_node_p(final SubLObject node) {
        return Equality.eq(trie_node_key(node), (SubLObject)tries.$kw38$END);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 3214L)
    public static SubLObject new_trie_terminal_node(final SubLObject v_object, final SubLObject uniqueP) {
        return (SubLObject)((tries.NIL != uniqueP) ? ConsesLow.cons((SubLObject)tries.$kw38$END, v_object) : ConsesLow.list((SubLObject)tries.$kw38$END, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 3332L)
    public static SubLObject new_trie_nonterminal_node(final SubLObject v_char, final SubLObject case_sensitive) {
        return (SubLObject)ConsesLow.cons((tries.NIL != case_sensitive) ? v_char : Characters.char_downcase(v_char), (SubLObject)tries.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 3464L)
    public static SubLObject trie_key_E(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive) {
        return (tries.NIL != case_sensitive) ? Characters.charE(key1, key2) : Characters.char_equal(key1, key2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 3590L)
    public static SubLObject trie_key_L(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive) {
        return (tries.NIL != case_sensitive) ? Characters.charL(key1, key2) : Characters.char_lessp(key1, key2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 3716L)
    public static SubLObject trie_key_LE(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive) {
        return (tries.NIL != case_sensitive) ? Characters.charLE(key1, key2) : Characters.char_not_greaterp(key1, key2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 3851L)
    public static SubLObject trie_key_G(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive) {
        return trie_key_L(key2, key1, case_sensitive);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 3954L)
    public static SubLObject trie_key_GE(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive) {
        return trie_key_LE(key2, key1, case_sensitive);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 4058L)
    public static SubLObject add_trie_subnode(final SubLObject node, final SubLObject subnode, final SubLObject case_sensitive) {
        final SubLObject data = trie_node_subnodes(node);
        final SubLObject subkey = trie_node_key(subnode);
        SubLObject back = (SubLObject)tries.NIL;
        SubLObject next = (SubLObject)tries.NIL;
        SubLObject key = (SubLObject)tries.NIL;
        back = node;
        for (next = data, key = trie_node_key(next.first()); tries.NIL != next && subkey != tries.$kw38$END && (key == tries.$kw38$END || tries.NIL != trie_key_L(key, subkey, case_sensitive)); next = next.rest(), key = trie_node_key(next.first())) {
            back = next;
        }
        ConsesLow.rplacd(back, (SubLObject)ConsesLow.cons(subnode, next));
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 4546L)
    public static SubLObject create_trie(final SubLObject unique, SubLObject name, SubLObject case_sensitive, SubLObject test) {
        if (name == tries.UNPROVIDED) {
            name = (SubLObject)tries.NIL;
        }
        if (case_sensitive == tries.UNPROVIDED) {
            case_sensitive = (SubLObject)tries.T;
        }
        if (test == tries.UNPROVIDED) {
            test = (SubLObject)tries.EQL;
        }
        final SubLObject trie = get_trie();
        _csetf_trie_name(trie, name);
        _csetf_trie_top_node(trie, (SubLObject)ConsesLow.listS((SubLObject)tries.$kw49$TOP, (SubLObject)tries.NIL));
        _csetf_trie_unique(trie, unique);
        _csetf_trie_case_sensitive(trie, case_sensitive);
        _csetf_trie_entry_test_func(trie, test);
        _csetf_trie_multi(trie, (SubLObject)tries.NIL);
        return trie;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 5020L)
    public static SubLObject trie_from_strings(final SubLObject strings, final SubLObject unique, SubLObject case_sensitive, SubLObject test, SubLObject save_strings) {
        if (case_sensitive == tries.UNPROVIDED) {
            case_sensitive = (SubLObject)tries.T;
        }
        if (test == tries.UNPROVIDED) {
            test = (SubLObject)tries.NIL;
        }
        if (save_strings == tries.UNPROVIDED) {
            save_strings = (SubLObject)tries.NIL;
        }
        if (tries.NIL == test) {
            if (tries.NIL != save_strings) {
                test = (SubLObject)((tries.NIL != case_sensitive) ? tries.EQUAL : tries.EQUALP);
            }
            else {
                test = (SubLObject)tries.EQL;
            }
        }
        final SubLObject trie = create_trie(unique, (SubLObject)tries.NIL, case_sensitive, test);
        SubLObject cdolist_list_var = strings;
        SubLObject string = (SubLObject)tries.NIL;
        string = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            trie_insert(trie, string, (SubLObject)((tries.NIL != save_strings) ? string : tries.T), (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return trie;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 5516L)
    public static SubLObject clear_trie(final SubLObject trie) {
        assert tries.NIL != trie_p(trie) : trie;
        final SubLObject top_node = trie_top_node(trie);
        ConsesLow.rplacd(top_node, (SubLObject)tries.NIL);
        if (tries.NIL != trie_multi(trie)) {
            final SubLObject top_node_marks = trie_node_marks(top_node);
            final SubLObject trie_marks = trie_multi_keys(trie);
            SubLObject cdolist_list_var = top_node_marks;
            SubLObject mark = (SubLObject)tries.NIL;
            mark = cdolist_list_var.first();
            while (tries.NIL != cdolist_list_var) {
                rem_trie_node_mark(top_node, mark);
                cdolist_list_var = cdolist_list_var.rest();
                mark = cdolist_list_var.first();
            }
            cdolist_list_var = trie_marks;
            mark = (SubLObject)tries.NIL;
            mark = cdolist_list_var.first();
            while (tries.NIL != cdolist_list_var) {
                add_trie_node_mark(top_node, mark);
                cdolist_list_var = cdolist_list_var.rest();
                mark = cdolist_list_var.first();
            }
        }
        return trie;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 5975L)
    public static SubLObject trie_emptyP(final SubLObject trie) {
        assert tries.NIL != trie_p(trie) : trie;
        return Types.sublisp_null(trie_top_node(trie).rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 6111L)
    public static SubLObject trie_count(final SubLObject trie) {
        return trie_node_count(trie_top_node(trie), trie_unique(trie));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 6263L)
    public static SubLObject trie_node_count(final SubLObject node, final SubLObject uniqueP) {
        SubLObject total = (SubLObject)tries.ZERO_INTEGER;
        if (tries.NIL != node) {
            if (tries.NIL != trie_leaf_node_p(node)) {
                if (tries.NIL != uniqueP) {
                    total = Numbers.add(total, (SubLObject)tries.ONE_INTEGER);
                }
                else {
                    total = Numbers.add(total, Sequences.length(trie_node_data(node)));
                }
            }
            else {
                SubLObject cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    total = Numbers.add(total, trie_node_count(subnode, uniqueP));
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                }
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 6621L)
    public static SubLObject show_trie(final SubLObject trie, SubLObject stream) {
        if (stream == tries.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        streams_high.terpri(stream);
        show_trie_node(trie_top_node(trie), stream, (SubLObject)tries.ZERO_INTEGER, (SubLObject)tries.NIL);
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 6808L)
    public static SubLObject show_trie_node(final SubLObject node, final SubLObject stream, final SubLObject depth, final SubLObject indent) {
        if (tries.NIL != indent) {
            streams_high.terpri(stream);
            string_utilities.indent(stream, depth);
        }
        final SubLObject key = trie_node_key(node);
        final SubLObject marks = trie_node_marks(node);
        if (key.isChar()) {
            final SubLObject subnodes = trie_node_subnodes(node);
            if (tries.NIL != subnodes) {
                print_high.princ(key, (SubLObject)tries.UNPROVIDED);
                if (tries.NIL != marks) {
                    PrintLow.format(stream, (SubLObject)tries.$str50$_m___S, marks);
                }
                show_trie_node(subnodes.first(), stream, Numbers.add(depth, (SubLObject)tries.ONE_INTEGER), marks);
                SubLObject cdolist_list_var = subnodes.rest();
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    show_trie_node(subnode, stream, Numbers.add(depth, (SubLObject)tries.ONE_INTEGER), (SubLObject)tries.T);
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                }
            }
        }
        else if (key == tries.$kw38$END) {
            PrintLow.format(stream, (SubLObject)tries.$str51$_____S, trie_node_data(node));
        }
        else if (key == tries.$kw49$TOP) {
            if (tries.NIL != marks) {
                PrintLow.format(stream, (SubLObject)tries.$str50$_m___S, marks);
            }
            final SubLObject subnodes = trie_node_subnodes(node);
            if (tries.NIL != subnodes) {
                show_trie_node(subnodes.first(), stream, (SubLObject)tries.ZERO_INTEGER, marks);
                SubLObject cdolist_list_var = subnodes.rest();
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    show_trie_node(subnode, stream, (SubLObject)tries.ZERO_INTEGER, (SubLObject)tries.T);
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 7723L)
    public static SubLObject trie_insert(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == tries.UNPROVIDED) {
            v_object = string;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        assert tries.NIL != trie_p(trie) : trie;
        assert tries.NIL != Types.stringp(string) : string;
        final SubLObject unique = trie_unique(trie);
        final SubLObject case_sensitive = trie_case_sensitive(trie);
        final SubLObject test = trie_entry_test_func(trie);
        final SubLObject max = (tries.NIL != end) ? end : Sequences.length(string);
        SubLObject node = trie_top_node(trie);
        SubLObject existing_terminal = (SubLObject)tries.NIL;
        SubLObject ch = (SubLObject)tries.NIL;
        initialize_trie_ancestor_tracking(node);
        SubLObject next_node = (SubLObject)tries.NIL;
        SubLObject index = (SubLObject)tries.NIL;
        next_node = (SubLObject)tries.NIL;
        for (index = start; !index.numE(max); index = Numbers.add(index, (SubLObject)tries.ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, index);
            if (tries.NIL == next_node) {
                SubLObject csome_list_var = trie_node_subnodes(node);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = csome_list_var.first();
                while (tries.NIL == next_node && tries.NIL != csome_list_var) {
                    final SubLObject subkey = trie_node_key(subnode);
                    if (subkey.isChar() && tries.NIL != trie_key_E(ch, subkey, case_sensitive)) {
                        next_node = subnode;
                    }
                    csome_list_var = csome_list_var.rest();
                    subnode = csome_list_var.first();
                }
            }
            if (tries.NIL != next_node) {
                node = next_node;
            }
            else {
                final SubLObject new_node = new_trie_nonterminal_node(ch, case_sensitive);
                add_trie_subnode(node, new_node, case_sensitive);
                node = new_node;
            }
            trie_ancestor_tracking_descend(node);
            next_node = (SubLObject)tries.NIL;
        }
        if (tries.NIL == existing_terminal) {
            SubLObject csome_list_var = trie_node_subnodes(node);
            SubLObject subnode = (SubLObject)tries.NIL;
            subnode = csome_list_var.first();
            while (tries.NIL == existing_terminal && tries.NIL != csome_list_var) {
                if (tries.NIL != trie_leaf_node_p(subnode)) {
                    existing_terminal = subnode;
                }
                csome_list_var = csome_list_var.rest();
                subnode = csome_list_var.first();
            }
        }
        if (tries.NIL != existing_terminal) {
            trie_ancestor_tracking_descend(existing_terminal);
            if (tries.NIL != unique) {
                if (tries.NIL == Functions.funcall(test, v_object, trie_node_data(existing_terminal))) {
                    Errors.error((SubLObject)tries.$str53$There_is_already_an_object__S_not, trie_node_data(existing_terminal), test, v_object);
                }
            }
            else {
                final SubLObject old_data = trie_node_data(existing_terminal);
                if (tries.NIL == subl_promotions.memberP(v_object, old_data, test, (SubLObject)tries.UNPROVIDED)) {
                    multi_trie_existing_insert_mark(trie, v_object);
                    final SubLObject new_data = (SubLObject)ConsesLow.cons(v_object, old_data);
                    ConsesLow.rplacd(existing_terminal, new_data);
                }
            }
        }
        else {
            final SubLObject new_terminal = new_trie_terminal_node(v_object, unique);
            multi_trie_new_insert_mark(trie, v_object);
            add_trie_subnode(node, new_terminal, case_sensitive);
        }
        finish_trie_ancestor_tracking();
        return trie;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 9998L)
    public static SubLObject trie_remove(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == tries.UNPROVIDED) {
            v_object = string;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        assert tries.NIL != trie_p(trie) : trie;
        assert tries.NIL != Types.stringp(string) : string;
        final SubLObject unique = trie_unique(trie);
        final SubLObject case_sensitive = trie_case_sensitive(trie);
        final SubLObject test = trie_entry_test_func(trie);
        final SubLObject max = (tries.NIL != end) ? end : Sequences.length(string);
        SubLObject node = trie_top_node(trie);
        SubLObject last_branching_node = (SubLObject)tries.NIL;
        SubLObject end_node = (SubLObject)tries.NIL;
        SubLObject last_branch = (SubLObject)tries.NIL;
        SubLObject ch = (SubLObject)tries.NIL;
        initialize_trie_ancestor_tracking(node);
        SubLObject next_node = (SubLObject)tries.NIL;
        SubLObject index = (SubLObject)tries.NIL;
        next_node = (SubLObject)tries.NIL;
        for (index = start; !index.numE(max); index = Numbers.add(index, (SubLObject)tries.ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, index);
            if (tries.NIL == next_node) {
                SubLObject csome_list_var = trie_node_subnodes(node);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = csome_list_var.first();
                while (tries.NIL == next_node && tries.NIL != csome_list_var) {
                    final SubLObject subkey = trie_node_key(subnode);
                    if (subkey.isChar() && tries.NIL != trie_key_E(ch, subkey, case_sensitive)) {
                        next_node = subnode;
                    }
                    csome_list_var = csome_list_var.rest();
                    subnode = csome_list_var.first();
                }
            }
            if (tries.NIL == next_node) {
                finish_trie_ancestor_tracking();
                return trie;
            }
            if (tries.NIL != trie_node_subnodes(node).rest()) {
                last_branching_node = node;
                last_branch = next_node;
            }
            node = next_node;
            trie_ancestor_tracking_descend(node);
            next_node = (SubLObject)tries.NIL;
        }
        if (tries.NIL == end_node) {
            SubLObject csome_list_var = trie_node_subnodes(node);
            SubLObject subnode = (SubLObject)tries.NIL;
            subnode = csome_list_var.first();
            while (tries.NIL == end_node && tries.NIL != csome_list_var) {
                if (tries.NIL != trie_leaf_node_p(subnode)) {
                    trie_ancestor_tracking_descend(subnode);
                    end_node = subnode;
                }
                csome_list_var = csome_list_var.rest();
                subnode = csome_list_var.first();
            }
        }
        if (tries.NIL == end_node) {
            finish_trie_ancestor_tracking();
            return trie;
        }
        if (tries.NIL != unique) {
            if (tries.NIL == Functions.funcall(test, v_object, trie_node_data(end_node))) {
                Errors.cerror((SubLObject)tries.$str54$Remove_it_anyway, (SubLObject)tries.$str55$The_object_found_in_trie_for__S_i, string, trie_node_data(end_node), v_object);
            }
        }
        else {
            final SubLObject old_data = trie_node_data(end_node);
            final SubLObject new_data = Sequences.delete(v_object, old_data, test, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED);
            if (!old_data.eql(new_data)) {
                ConsesLow.rplacd(end_node, new_data);
            }
            if (tries.NIL != new_data) {
                multi_trie_remove_mark(trie, v_object);
                finish_trie_ancestor_tracking();
                return trie;
            }
        }
        multi_trie_remove_mark(trie, v_object);
        if (tries.NIL != trie_node_subnodes(node).rest()) {
            ConsesLow.rplacd(node, Sequences.delete(end_node, trie_node_subnodes(node), (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED));
        }
        else if (tries.NIL != last_branch && tries.NIL != last_branching_node) {
            last_branching_node = Sequences.delete(last_branch, last_branching_node, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED);
        }
        else {
            clear_trie(trie);
        }
        finish_trie_ancestor_tracking();
        return trie;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 13445L)
    public static SubLObject trie_remove_all(final SubLObject trie, final SubLObject string, SubLObject start, SubLObject end) {
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        assert tries.NIL != trie_p(trie) : trie;
        assert tries.NIL != Types.stringp(string) : string;
        final SubLObject case_sensitive = trie_case_sensitive(trie);
        final SubLObject max = (tries.NIL != end) ? end : Sequences.length(string);
        SubLObject node = trie_top_node(trie);
        SubLObject last_branching_node = (SubLObject)tries.NIL;
        SubLObject last_branch = (SubLObject)tries.NIL;
        SubLObject ch = (SubLObject)tries.NIL;
        SubLObject total = (SubLObject)tries.ZERO_INTEGER;
        initialize_trie_ancestor_tracking(node);
        SubLObject next_node = (SubLObject)tries.NIL;
        SubLObject index = (SubLObject)tries.NIL;
        next_node = (SubLObject)tries.NIL;
        for (index = start; !index.numE(max); index = Numbers.add(index, (SubLObject)tries.ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, index);
            if (tries.NIL == next_node) {
                SubLObject csome_list_var = trie_node_subnodes(node);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = csome_list_var.first();
                while (tries.NIL == next_node && tries.NIL != csome_list_var) {
                    final SubLObject subkey = trie_node_key(subnode);
                    if (subkey.isChar() && tries.NIL != trie_key_E(ch, subkey, case_sensitive)) {
                        next_node = subnode;
                    }
                    csome_list_var = csome_list_var.rest();
                    subnode = csome_list_var.first();
                }
            }
            if (tries.NIL == next_node) {
                finish_trie_ancestor_tracking();
                return total;
            }
            if (tries.NIL != trie_node_subnodes(node).rest()) {
                last_branching_node = node;
                last_branch = next_node;
            }
            node = next_node;
            trie_ancestor_tracking_descend(node);
            next_node = (SubLObject)tries.NIL;
        }
        if (tries.NIL != last_branch && tries.NIL != last_branching_node) {
            total = trie_node_count(node, trie_unique(trie));
            multi_trie_remove_all_mark(trie);
            last_branching_node = Sequences.delete(last_branch, last_branching_node, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED);
        }
        else {
            total = trie_count(trie);
            clear_trie(trie);
        }
        finish_trie_ancestor_tracking();
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 15541L)
    public static SubLObject trie_exact(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == tries.UNPROVIDED) {
            case_sensitiveP = (SubLObject)tries.NIL;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert tries.NIL != trie_p(trie) : trie;
        assert tries.NIL != Types.stringp(string) : string;
        if (tries.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && tries.NIL == trie_unique(trie)) {
            Errors.error((SubLObject)tries.$str56$TRIE__S_does_not_have_unique_entr, trie);
        }
        case_sensitiveP = (SubLObject)SubLObjectFactory.makeBoolean(tries.NIL != case_sensitiveP && tries.NIL != trie_case_sensitive(trie));
        SubLObject node = trie_top_node(trie);
        SubLObject v_char = (SubLObject)tries.NIL;
        SubLObject v_answer = (SubLObject)tries.NIL;
        final SubLObject stop = (tries.NIL != end) ? end : Sequences.length(string);
        initialize_trie_ancestor_tracking(node);
        SubLObject i = (SubLObject)tries.NIL;
        SubLObject next_node = (SubLObject)tries.NIL;
        i = start;
        next_node = (SubLObject)tries.NIL;
        while (!i.numE(stop) && (!i.numG((SubLObject)tries.ZERO_INTEGER) || tries.NIL != node)) {
            v_char = Strings.sublisp_char(string, i);
            if (tries.NIL == next_node) {
                SubLObject csome_list_var = trie_node_subnodes(node);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = csome_list_var.first();
                while (tries.NIL == next_node && tries.NIL != csome_list_var) {
                    final SubLObject subkey = trie_node_key(subnode);
                    if (subkey.isChar() && tries.NIL != trie_key_E(v_char, subkey, case_sensitiveP)) {
                        next_node = subnode;
                    }
                    csome_list_var = csome_list_var.rest();
                    subnode = csome_list_var.first();
                }
            }
            node = next_node;
            trie_ancestor_tracking_descend(node);
            i = Numbers.add(i, (SubLObject)tries.ONE_INTEGER);
            next_node = (SubLObject)tries.NIL;
        }
        if (tries.NIL != node && tries.NIL == v_answer) {
            SubLObject csome_list_var = trie_node_subnodes(node);
            SubLObject subnode = (SubLObject)tries.NIL;
            subnode = csome_list_var.first();
            while (tries.NIL == v_answer && tries.NIL != csome_list_var) {
                if (tries.NIL != trie_leaf_node_p(subnode)) {
                    trie_ancestor_tracking_descend(subnode);
                    if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                        final SubLObject v_object = trie_node_data(subnode);
                        if (tries.NIL != trie_relevant_object(trie, v_object)) {
                            v_answer = v_object;
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                subnode = csome_list_var.first();
            }
        }
        finish_trie_ancestor_tracking();
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 17030L)
    public static SubLObject trie_prefix(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == tries.UNPROVIDED) {
            case_sensitiveP = (SubLObject)tries.NIL;
        }
        if (exact_lengthP == tries.UNPROVIDED) {
            exact_lengthP = (SubLObject)tries.NIL;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        if (tries.NIL != case_sensitiveP || tries.NIL == trie_case_sensitive(trie)) {
            return trie_prefix_iterative(trie, string, exact_lengthP, start, end);
        }
        return trie_prefix_recursive(trie, string, exact_lengthP, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 17655L)
    public static SubLObject trie_prefix_iterative(final SubLObject trie, final SubLObject string, final SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert tries.NIL != trie_p(trie) : trie;
        assert tries.NIL != Types.stringp(string) : string;
        SubLObject ans = (SubLObject)tries.NIL;
        final SubLObject _prev_bind_0 = tries.$trie_objects$.currentBinding(thread);
        try {
            tries.$trie_objects$.bind((SubLObject)tries.NIL, thread);
            final SubLObject case_sensitive = trie_case_sensitive(trie);
            final SubLObject stop = (tries.NIL != end) ? end : Sequences.length(string);
            SubLObject v_char = (SubLObject)tries.NIL;
            SubLObject terminal = (SubLObject)tries.NIL;
            final SubLObject uniqueP = trie_unique(trie);
            SubLObject node = trie_top_node(trie);
            initialize_trie_ancestor_tracking(node);
            SubLObject i = (SubLObject)tries.NIL;
            SubLObject next_node = (SubLObject)tries.NIL;
            i = start;
            next_node = (SubLObject)tries.NIL;
            while (!i.numE(stop) && (!i.numG((SubLObject)tries.ZERO_INTEGER) || tries.NIL != node)) {
                v_char = Strings.sublisp_char(string, i);
                if (tries.NIL == next_node) {
                    SubLObject csome_list_var = trie_node_subnodes(node);
                    SubLObject subnode = (SubLObject)tries.NIL;
                    subnode = csome_list_var.first();
                    while (tries.NIL == next_node && tries.NIL != csome_list_var) {
                        final SubLObject subkey = trie_node_key(subnode);
                        if (subkey.isChar() && tries.NIL != trie_key_E(v_char, subkey, case_sensitive)) {
                            next_node = subnode;
                        }
                        node = next_node;
                        trie_ancestor_tracking_descend(node);
                        csome_list_var = csome_list_var.rest();
                        subnode = csome_list_var.first();
                    }
                }
                i = Numbers.add(i, (SubLObject)tries.ONE_INTEGER);
                next_node = (SubLObject)tries.NIL;
            }
            if (tries.NIL != node) {
                if (tries.NIL != exact_lengthP) {
                    if (tries.NIL == terminal) {
                        SubLObject csome_list_var = trie_node_subnodes(node);
                        SubLObject subnode = (SubLObject)tries.NIL;
                        subnode = csome_list_var.first();
                        while (tries.NIL == terminal && tries.NIL != csome_list_var) {
                            if (tries.NIL != trie_leaf_node_p(subnode)) {
                                terminal = subnode;
                                trie_ancestor_tracking_descend(subnode);
                            }
                            csome_list_var = csome_list_var.rest();
                            subnode = csome_list_var.first();
                        }
                    }
                    if (tries.NIL != terminal && tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                        final SubLObject v_object = trie_node_data(terminal);
                        if (tries.NIL != uniqueP) {
                            if (tries.NIL != trie_relevant_object(trie, v_object)) {
                                tries.$trie_objects$.setDynamicValue((SubLObject)ConsesLow.list(v_object), thread);
                            }
                        }
                        else {
                            tries.$trie_objects$.setDynamicValue(trie_relevant_objects(trie, v_object), thread);
                        }
                    }
                }
                else {
                    all_trie_objects_under_node(trie, node, uniqueP);
                }
            }
            ans = tries.$trie_objects$.getDynamicValue(thread);
        }
        finally {
            tries.$trie_objects$.rebind(_prev_bind_0, thread);
        }
        finish_trie_ancestor_tracking();
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 19387L)
    public static SubLObject trie_prefix_recursive(final SubLObject trie, final SubLObject string, final SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert tries.NIL != trie_p(trie) : trie;
        assert tries.NIL != Types.stringp(string) : string;
        SubLObject ans = (SubLObject)tries.NIL;
        final SubLObject _prev_bind_0 = tries.$trie_objects$.currentBinding(thread);
        try {
            tries.$trie_objects$.bind((SubLObject)tries.NIL, thread);
            final SubLObject top_node = trie_top_node(trie);
            initialize_trie_ancestor_tracking(top_node);
            if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                SubLObject cdolist_list_var = trie_node_subnodes(top_node);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    trie_ancestor_tracking_descend(subnode);
                    if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                        trie_prefix_recursive_int(trie, subnode, string, start, (tries.NIL != end) ? end : Sequences.length(string), exact_lengthP, trie_unique(trie));
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                }
            }
            ans = tries.$trie_objects$.getDynamicValue(thread);
            finish_trie_ancestor_tracking();
        }
        finally {
            tries.$trie_objects$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 20289L)
    public static SubLObject trie_prefix_recursive_int(final SubLObject trie, final SubLObject node, final SubLObject string, final SubLObject index, final SubLObject stop, final SubLObject exact_lengthP, final SubLObject uniqueP) {
        if (index.numE(stop)) {
            if (tries.NIL != exact_lengthP) {
                if (tries.NIL != trie_leaf_node_p(node)) {
                    all_trie_objects_in_leaf_node(trie, node, uniqueP);
                }
            }
            else {
                all_trie_objects_under_node(trie, node, uniqueP);
            }
        }
        else {
            final SubLObject key = trie_node_key(node);
            if (!key.isChar() || tries.NIL == Characters.char_equal(Strings.sublisp_char(string, index), key)) {
                return (SubLObject)tries.NIL;
            }
            SubLObject cdolist_list_var = trie_node_subnodes(node);
            SubLObject subnode = (SubLObject)tries.NIL;
            subnode = cdolist_list_var.first();
            while (tries.NIL != cdolist_list_var) {
                trie_ancestor_tracking_descend(subnode);
                if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                    trie_prefix_recursive_int(trie, subnode, string, Numbers.add(index, (SubLObject)tries.ONE_INTEGER), stop, exact_lengthP, uniqueP);
                }
                trie_ancestor_tracking_ascend();
                cdolist_list_var = cdolist_list_var.rest();
                subnode = cdolist_list_var.first();
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 21049L)
    public static SubLObject all_trie_objects_under_node(final SubLObject trie, final SubLObject node, final SubLObject uniqueP) {
        if (tries.NIL != node) {
            if (tries.NIL != trie_leaf_node_p(node)) {
                all_trie_objects_in_leaf_node(trie, node, uniqueP);
            }
            else {
                SubLObject cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    trie_ancestor_tracking_descend(subnode);
                    if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                        all_trie_objects_under_node(trie, subnode, uniqueP);
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 21462L)
    public static SubLObject all_trie_objects_in_leaf_node(final SubLObject trie, final SubLObject node, final SubLObject uniqueP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = trie_node_data(node);
        if (tries.NIL != uniqueP) {
            if (tries.NIL != trie_relevant_object(trie, data)) {
                tries.$trie_objects$.setDynamicValue((SubLObject)ConsesLow.cons(data, tries.$trie_objects$.getDynamicValue(thread)), thread);
            }
        }
        else {
            data = trie_relevant_objects(trie, data);
            tries.$trie_objects$.setDynamicValue(ConsesLow.append(data, tries.$trie_objects$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 21897L)
    public static SubLObject trie_search(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == tries.UNPROVIDED) {
            case_sensitiveP = (SubLObject)tries.NIL;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert tries.NIL != trie_p(trie) : trie;
        assert tries.NIL != Types.stringp(string) : string;
        case_sensitiveP = (SubLObject)SubLObjectFactory.makeBoolean(tries.NIL != case_sensitiveP && tries.NIL != trie_case_sensitive(trie));
        SubLObject ans = (SubLObject)tries.NIL;
        final SubLObject _prev_bind_0 = tries.$trie_objects$.currentBinding(thread);
        try {
            tries.$trie_objects$.bind((SubLObject)tries.NIL, thread);
            final SubLObject uniqueP = trie_unique(trie);
            final SubLObject stack = Strings.make_string(tries.$trie_maximum_search_size$.getDynamicValue(thread), (SubLObject)tries.UNPROVIDED);
            final SubLObject stack_index = (SubLObject)tries.ZERO_INTEGER;
            final SubLObject string_max = Numbers.subtract((tries.NIL != end) ? end : Sequences.length(string), (SubLObject)tries.ONE_INTEGER);
            final SubLObject top_node = trie_top_node(trie);
            initialize_trie_ancestor_tracking(top_node);
            if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                SubLObject cdolist_list_var = trie_node_subnodes(top_node);
                SubLObject node = (SubLObject)tries.NIL;
                node = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    trie_ancestor_tracking_descend(node);
                    if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                        trie_search_internal(trie, node, string, start, string_max, stack, stack_index, case_sensitiveP, uniqueP);
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                }
            }
            ans = tries.$trie_objects$.getDynamicValue(thread);
            finish_trie_ancestor_tracking();
        }
        finally {
            tries.$trie_objects$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 22828L)
    public static SubLObject trie_search_internal(final SubLObject trie, final SubLObject node, final SubLObject string, final SubLObject string_min, final SubLObject string_max, final SubLObject stack, SubLObject stack_index, final SubLObject case_sensitiveP, final SubLObject uniqueP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = trie_node_key(node);
        if (tries.NIL != list_utilities.lengthLE(stack, stack_index, (SubLObject)tries.UNPROVIDED)) {
            Errors.error((SubLObject)tries.$str58$_S_will_result_in_a_search_that_i, stack, tries.$trie_maximum_search_size$.getDynamicValue(thread));
        }
        if (key.isChar()) {
            Strings.set_char(stack, stack_index, key);
            if (tries.NIL != trie_match(string, string_min, string_max, stack, stack_index, case_sensitiveP)) {
                all_trie_objects_under_node(trie, node, uniqueP);
            }
            else {
                stack_index = Numbers.add(stack_index, (SubLObject)tries.ONE_INTEGER);
                SubLObject cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    trie_ancestor_tracking_descend(subnode);
                    if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                        trie_search_internal(trie, subnode, string, string_min, string_max, stack, stack_index, case_sensitiveP, uniqueP);
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 23733L)
    public static SubLObject trie_match(final SubLObject string, final SubLObject string_min, final SubLObject string_max, final SubLObject array, final SubLObject array_max, final SubLObject case_sensitiveP) {
        if (array_max.numGE(Numbers.subtract(string_max, string_min))) {
            SubLObject i;
            SubLObject i2;
            SubLObject s_char;
            SubLObject a_char;
            for (i = (SubLObject)tries.NIL, i2 = (SubLObject)tries.NIL, i = string_max, i2 = array_max; !i.numL(string_min) && !i2.isNegative(); i = Numbers.subtract(i, (SubLObject)tries.ONE_INTEGER), i2 = Numbers.subtract(i2, (SubLObject)tries.ONE_INTEGER)) {
                s_char = Strings.sublisp_char(string, i);
                a_char = Strings.sublisp_char(array, i2);
                if (tries.NIL == ((tries.NIL != case_sensitiveP) ? Characters.charE(s_char, a_char) : Characters.char_equal(s_char, a_char))) {
                    return (SubLObject)tries.NIL;
                }
            }
            return (SubLObject)tries.T;
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 24281L)
    public static SubLObject map_trie_data(final SubLObject function, final SubLObject trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert tries.NIL != trie_p(trie) : trie;
        final SubLObject top_node = trie_top_node(trie);
        initialize_trie_ancestor_tracking(top_node);
        if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
            SubLObject catch_var = (SubLObject)tries.NIL;
            try {
                thread.throwStack.push(tries.$kw59$MAPPING_DONE);
                map_trie_data_internal(function, trie, top_node, trie_unique(trie));
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)tries.$kw59$MAPPING_DONE);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finish_trie_ancestor_tracking();
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 24795L)
    public static SubLObject map_trie_data_internal(final SubLObject function, final SubLObject trie, final SubLObject node, final SubLObject uniqueP) {
        if (tries.NIL != trie_leaf_node_p(node)) {
            final SubLObject data = trie_node_data(node);
            if (tries.NIL != uniqueP) {
                if (tries.NIL != trie_relevant_object(trie, data)) {
                    Functions.funcall(function, data);
                }
            }
            else {
                SubLObject cdolist_list_var = data;
                SubLObject item = (SubLObject)tries.NIL;
                item = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    if (tries.NIL != trie_relevant_object(trie, item)) {
                        Functions.funcall(function, item);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
            }
        }
        else {
            SubLObject cdolist_list_var2 = trie_node_subnodes(node);
            SubLObject subnode = (SubLObject)tries.NIL;
            subnode = cdolist_list_var2.first();
            while (tries.NIL != cdolist_list_var2) {
                trie_ancestor_tracking_descend(subnode);
                if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                    map_trie_data_internal(function, trie, subnode, uniqueP);
                }
                trie_ancestor_tracking_ascend();
                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode = cdolist_list_var2.first();
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 25393L)
    public static SubLObject map_trie_data_direction(final SubLObject function, final SubLObject trie, final SubLObject string, SubLObject start, SubLObject end, SubLObject v_forward) {
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        if (v_forward == tries.UNPROVIDED) {
            v_forward = (SubLObject)tries.T;
        }
        assert tries.NIL != trie_p(trie) : trie;
        assert tries.NIL != Types.stringp(string) : string;
        if (tries.NIL == end) {
            end = Sequences.length(string);
        }
        final SubLObject top_node = trie_top_node(trie);
        final SubLObject unique = trie_unique(trie);
        final SubLObject case_sensitive = trie_case_sensitive(trie);
        initialize_trie_ancestor_tracking(top_node);
        if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
            if (tries.NIL != v_forward) {
                map_trie_data_forward(function, trie, top_node, unique, case_sensitive, string, start, end);
            }
            else {
                map_trie_data_backward(function, trie, top_node, unique, case_sensitive, string, start, end);
            }
        }
        finish_trie_ancestor_tracking();
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 26185L)
    public static SubLObject map_trie_data_forward(final SubLObject function, final SubLObject trie, final SubLObject node, final SubLObject unique, final SubLObject case_sensitive, final SubLObject string, final SubLObject char_index, final SubLObject end_index) {
        if (tries.NIL != string) {
            if (char_index.numE(end_index)) {
                map_trie_data_forward(function, trie, node, unique, case_sensitive, (SubLObject)tries.NIL, (SubLObject)tries.NIL, (SubLObject)tries.NIL);
            }
            else {
                final SubLObject v_char = Strings.sublisp_char(string, char_index);
                SubLObject cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    trie_ancestor_tracking_descend(subnode);
                    if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                        final SubLObject subkey = trie_node_key(subnode);
                        if (subkey != tries.$kw38$END) {
                            if (tries.NIL == trie_key_L(subkey, v_char, case_sensitive)) {
                                if (tries.NIL != trie_key_E(subkey, v_char, case_sensitive)) {
                                    map_trie_data_forward(function, trie, subnode, unique, case_sensitive, string, Numbers.add(char_index, (SubLObject)tries.ONE_INTEGER), end_index);
                                }
                                else {
                                    map_trie_data_forward(function, trie, subnode, unique, case_sensitive, (SubLObject)tries.NIL, (SubLObject)tries.NIL, (SubLObject)tries.NIL);
                                }
                            }
                        }
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                }
            }
        }
        else if (tries.NIL != trie_leaf_node_p(node)) {
            final SubLObject data = trie_node_data(node);
            if (tries.NIL != unique) {
                if (tries.NIL != trie_relevant_object(trie, data)) {
                    Functions.funcall(function, data);
                }
            }
            else {
                SubLObject cdolist_list_var = data;
                SubLObject datum = (SubLObject)tries.NIL;
                datum = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    if (tries.NIL != trie_relevant_object(trie, datum)) {
                        Functions.funcall(function, datum);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    datum = cdolist_list_var.first();
                }
            }
        }
        else {
            SubLObject cdolist_list_var2 = trie_node_subnodes(node);
            SubLObject subnode2 = (SubLObject)tries.NIL;
            subnode2 = cdolist_list_var2.first();
            while (tries.NIL != cdolist_list_var2) {
                trie_ancestor_tracking_descend(subnode2);
                if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                    map_trie_data_forward(function, trie, subnode2, unique, case_sensitive, (SubLObject)tries.NIL, (SubLObject)tries.NIL, (SubLObject)tries.NIL);
                }
                trie_ancestor_tracking_ascend();
                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode2 = cdolist_list_var2.first();
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 28085L)
    public static SubLObject map_trie_data_backward(final SubLObject function, final SubLObject trie, final SubLObject node, final SubLObject unique, final SubLObject case_sensitive, final SubLObject string, final SubLObject char_index, final SubLObject end_index) {
        if (tries.NIL != string) {
            if (!char_index.numE(end_index)) {
                final SubLObject v_char = Strings.sublisp_char(string, char_index);
                final SubLObject subnodes = trie_node_subnodes(node);
                SubLObject length;
                SubLObject index_from_end;
                SubLObject node_index;
                SubLObject subnode;
                SubLObject subkey;
                for (length = Sequences.length(subnodes), index_from_end = (SubLObject)tries.NIL, index_from_end = (SubLObject)tries.ZERO_INTEGER; index_from_end.numL(length); index_from_end = Numbers.add(index_from_end, (SubLObject)tries.ONE_INTEGER)) {
                    node_index = Numbers.subtract(length, index_from_end, (SubLObject)tries.ONE_INTEGER);
                    subnode = ConsesLow.nth(node_index, subnodes);
                    subkey = trie_node_key(subnode);
                    trie_ancestor_tracking_descend(subnode);
                    if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                        if (subkey == tries.$kw38$END) {
                            map_trie_data_backward(function, trie, subnode, unique, case_sensitive, (SubLObject)tries.NIL, (SubLObject)tries.NIL, (SubLObject)tries.NIL);
                        }
                        else if (tries.NIL != trie_key_L(subkey, v_char, case_sensitive)) {
                            map_trie_data_backward(function, trie, subnode, unique, case_sensitive, (SubLObject)tries.NIL, (SubLObject)tries.NIL, (SubLObject)tries.NIL);
                        }
                        else if (tries.NIL != trie_key_E(subkey, v_char, case_sensitive)) {
                            map_trie_data_backward(function, trie, subnode, unique, case_sensitive, string, Numbers.add(char_index, (SubLObject)tries.ONE_INTEGER), end_index);
                        }
                    }
                    trie_ancestor_tracking_ascend();
                }
            }
        }
        else if (tries.NIL != trie_leaf_node_p(node)) {
            final SubLObject data = trie_node_data(node);
            if (tries.NIL != unique) {
                if (tries.NIL != trie_relevant_object(trie, data)) {
                    Functions.funcall(function, data);
                }
            }
            else {
                SubLObject cdolist_list_var = data;
                SubLObject datum = (SubLObject)tries.NIL;
                datum = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    if (tries.NIL != trie_relevant_object(trie, datum)) {
                        Functions.funcall(function, datum);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    datum = cdolist_list_var.first();
                }
            }
        }
        else {
            final SubLObject subnodes2 = trie_node_subnodes(node);
            SubLObject length2;
            SubLObject index_from_end2;
            SubLObject node_index2;
            SubLObject subnode2;
            for (length2 = Sequences.length(subnodes2), index_from_end2 = (SubLObject)tries.NIL, index_from_end2 = (SubLObject)tries.ZERO_INTEGER; index_from_end2.numL(length2); index_from_end2 = Numbers.add(index_from_end2, (SubLObject)tries.ONE_INTEGER)) {
                node_index2 = Numbers.subtract(length2, index_from_end2, (SubLObject)tries.ONE_INTEGER);
                subnode2 = ConsesLow.nth(node_index2, subnodes2);
                trie_ancestor_tracking_descend(subnode2);
                if (tries.NIL != trie_relevant_ancestor_pathP(trie)) {
                    map_trie_data_backward(function, trie, subnode2, unique, case_sensitive, (SubLObject)tries.NIL, (SubLObject)tries.NIL, (SubLObject)tries.NIL);
                }
                trie_ancestor_tracking_ascend();
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 30454L)
    public static SubLObject do_objects_in_trie(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_object = (SubLObject)tries.NIL;
        SubLObject trie = (SubLObject)tries.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list60);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list60);
        trie = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)tries.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)tries.NIL;
        SubLObject current_$1 = (SubLObject)tries.NIL;
        while (tries.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tries.$list60);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tries.$list60);
            if (tries.NIL == conses_high.member(current_$1, (SubLObject)tries.$list61, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED)) {
                bad = (SubLObject)tries.T;
            }
            if (current_$1 == tries.$kw62$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (tries.NIL != bad && tries.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tries.$list60);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)tries.$kw63$DONE, current);
        final SubLObject done = (SubLObject)((tries.NIL != done_tail) ? conses_high.cadr(done_tail) : tries.NIL);
        final SubLObject forward_tail = cdestructuring_bind.property_list_member((SubLObject)tries.$kw64$FORWARD, current);
        final SubLObject v_forward = (SubLObject)((tries.NIL != forward_tail) ? conses_high.cadr(forward_tail) : tries.T);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iterator = (SubLObject)tries.$sym65$ITERATOR;
        return (SubLObject)ConsesLow.list((SubLObject)tries.$sym66$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)tries.$sym67$NEW_TRIE_ITERATOR, trie, v_forward))), (SubLObject)ConsesLow.listS((SubLObject)tries.$sym68$DO_ITERATOR, (SubLObject)ConsesLow.list(v_object, iterator, (SubLObject)tries.$kw63$DONE, done), ConsesLow.append(body, (SubLObject)tries.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 30812L)
    public static SubLObject new_trie_iterator(final SubLObject trie, SubLObject forwardP) {
        if (forwardP == tries.UNPROVIDED) {
            forwardP = (SubLObject)tries.T;
        }
        final SubLObject state = new_trie_iterator_state(trie, forwardP);
        return iteration.new_iterator(state, (SubLObject)tries.$sym69$TRIE_ITERATOR_DONE, (SubLObject)tries.$sym70$TRIE_ITERATOR_NEXT, (SubLObject)tries.$sym71$TRIE_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 31058L)
    public static SubLObject new_trie_iterator_state(final SubLObject trie, final SubLObject forwardP) {
        final SubLObject state = Vectors.make_vector((SubLObject)tries.FIVE_INTEGER, (SubLObject)tries.NIL);
        Vectors.set_aref(state, (SubLObject)tries.ZERO_INTEGER, trie);
        Vectors.set_aref(state, (SubLObject)tries.ONE_INTEGER, trie_top_node(trie));
        Vectors.set_aref(state, (SubLObject)tries.TWO_INTEGER, forwardP);
        Vectors.set_aref(state, (SubLObject)tries.THREE_INTEGER, (SubLObject)((tries.NIL != trie_unique(trie)) ? tries.NIL : queues.create_queue((SubLObject)tries.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)tries.FOUR_INTEGER, stacks.create_stack());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 31513L)
    public static SubLObject trie_iterator_done(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tries.NIL != trie_iterator_done_node(Vectors.aref(state, (SubLObject)tries.ONE_INTEGER)) && tries.NIL != trie_iterator_done_queue(Vectors.aref(state, (SubLObject)tries.THREE_INTEGER)) && tries.NIL != trie_iterator_done_stack(Vectors.aref(state, (SubLObject)tries.FOUR_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 31713L)
    public static SubLObject trie_iterator_done_node(final SubLObject node) {
        return Types.sublisp_null(node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 31782L)
    public static SubLObject trie_iterator_done_queue(final SubLObject possibly_queue) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tries.NIL == queues.queue_p(possibly_queue) || tries.NIL != queues.queue_empty_p(possibly_queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 31924L)
    public static SubLObject trie_iterator_done_stack(final SubLObject stack) {
        return stacks.stack_empty_p(stack);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 32005L)
    public static SubLObject trie_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject trie = Vectors.aref(state, (SubLObject)tries.ZERO_INTEGER);
        final SubLObject node = Vectors.aref(state, (SubLObject)tries.ONE_INTEGER);
        final SubLObject forwardP = Vectors.aref(state, (SubLObject)tries.TWO_INTEGER);
        final SubLObject queue = Vectors.aref(state, (SubLObject)tries.THREE_INTEGER);
        final SubLObject stack = Vectors.aref(state, (SubLObject)tries.FOUR_INTEGER);
        thread.resetMultipleValues();
        final SubLObject next = (tries.NIL != queues.queue_p(queue)) ? trie_iterator_next_non_unique(trie, node, forwardP, queue, stack) : trie_iterator_next_unique(trie, node, forwardP, stack);
        final SubLObject invalidP = thread.secondMultipleValue();
        final SubLObject new_node = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (tries.NIL != invalidP) {
            Vectors.set_aref(state, (SubLObject)tries.ONE_INTEGER, (SubLObject)tries.NIL);
            Vectors.set_aref(state, (SubLObject)tries.THREE_INTEGER, (SubLObject)tries.NIL);
            stacks.clear_stack(stack);
        }
        else {
            Vectors.set_aref(state, (SubLObject)tries.ONE_INTEGER, new_node);
        }
        return Values.values(next, state, invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 32595L)
    public static SubLObject trie_iterator_next_unique(final SubLObject trie, SubLObject node, final SubLObject forwardP, final SubLObject stack) {
        SubLObject next;
        SubLObject invalidP;
        for (next = (SubLObject)tries.NIL, invalidP = (SubLObject)tries.NIL; tries.NIL == next && tries.NIL == invalidP; invalidP = (SubLObject)tries.T) {
            if (tries.NIL != trie_leaf_node_p(node)) {
                final SubLObject data = trie_node_data(node);
                if (tries.NIL != trie_relevant_object(trie, data)) {
                    next = data;
                }
            }
            else {
                final SubLObject subnodes = trie_node_subnodes(node);
                if (tries.NIL != forwardP) {
                    SubLObject cdolist_list_var = Sequences.reverse(subnodes);
                    SubLObject subnode = (SubLObject)tries.NIL;
                    subnode = cdolist_list_var.first();
                    while (tries.NIL != cdolist_list_var) {
                        stacks.stack_push(subnode, stack);
                        cdolist_list_var = cdolist_list_var.rest();
                        subnode = cdolist_list_var.first();
                    }
                }
                else {
                    SubLObject cdolist_list_var = subnodes;
                    SubLObject subnode = (SubLObject)tries.NIL;
                    subnode = cdolist_list_var.first();
                    while (tries.NIL != cdolist_list_var) {
                        stacks.stack_push(subnode, stack);
                        cdolist_list_var = cdolist_list_var.rest();
                        subnode = cdolist_list_var.first();
                    }
                }
            }
            node = stacks.stack_pop(stack);
            if (tries.NIL == next && tries.NIL == node && tries.NIL != stacks.stack_empty_p(stack)) {}
        }
        return Values.values(next, invalidP, node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 33260L)
    public static SubLObject trie_iterator_next_non_unique(final SubLObject trie, SubLObject node, final SubLObject forwardP, final SubLObject queue, final SubLObject stack) {
        SubLObject next;
        SubLObject invalidP;
        for (next = (SubLObject)tries.NIL, invalidP = (SubLObject)tries.NIL; tries.NIL == next && tries.NIL == invalidP; invalidP = (SubLObject)tries.T) {
            if (tries.NIL != queues.queue_empty_p(queue)) {
                if (tries.NIL != trie_leaf_node_p(node)) {
                    SubLObject cdolist_list_var;
                    final SubLObject data = cdolist_list_var = trie_node_data(node);
                    SubLObject item = (SubLObject)tries.NIL;
                    item = cdolist_list_var.first();
                    while (tries.NIL != cdolist_list_var) {
                        if (tries.NIL != trie_relevant_object(trie, item)) {
                            queues.enqueue(item, queue);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    }
                }
                else {
                    final SubLObject subnodes = trie_node_subnodes(node);
                    if (tries.NIL != forwardP) {
                        SubLObject cdolist_list_var = Sequences.reverse(subnodes);
                        SubLObject subnode = (SubLObject)tries.NIL;
                        subnode = cdolist_list_var.first();
                        while (tries.NIL != cdolist_list_var) {
                            stacks.stack_push(subnode, stack);
                            cdolist_list_var = cdolist_list_var.rest();
                            subnode = cdolist_list_var.first();
                        }
                    }
                    else {
                        SubLObject cdolist_list_var = subnodes;
                        SubLObject subnode = (SubLObject)tries.NIL;
                        subnode = cdolist_list_var.first();
                        while (tries.NIL != cdolist_list_var) {
                            stacks.stack_push(subnode, stack);
                            cdolist_list_var = cdolist_list_var.rest();
                            subnode = cdolist_list_var.first();
                        }
                    }
                }
                node = stacks.stack_pop(stack);
            }
            else {
                next = queues.dequeue(queue);
            }
            if (tries.NIL == next && tries.NIL == node && tries.NIL != stacks.stack_empty_p(stack) && tries.NIL != queues.queue_empty_p(queue)) {}
        }
        return Values.values(next, invalidP, node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 34069L)
    public static SubLObject trie_iterator_finalize(SubLObject state) {
        if (tries.NIL != queues.queue_p(Vectors.aref(state, (SubLObject)tries.THREE_INTEGER))) {
            queues.clear_queue(Vectors.aref(state, (SubLObject)tries.THREE_INTEGER));
        }
        stacks.clear_stack(Vectors.aref(state, (SubLObject)tries.FOUR_INTEGER));
        SubLObject i;
        for (i = (SubLObject)tries.NIL, i = (SubLObject)tries.ZERO_INTEGER; i.numL((SubLObject)tries.FIVE_INTEGER); i = Numbers.add(i, (SubLObject)tries.ONE_INTEGER)) {
            Vectors.set_aref(state, i, (SubLObject)tries.NIL);
        }
        state = (SubLObject)tries.NIL;
        return (SubLObject)tries.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 34295L)
    public static SubLObject new_directed_trie_iterator(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject strictP) {
        if (case_sensitiveP == tries.UNPROVIDED) {
            case_sensitiveP = (SubLObject)tries.NIL;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        if (forwardP == tries.UNPROVIDED) {
            forwardP = (SubLObject)tries.T;
        }
        if (strictP == tries.UNPROVIDED) {
            strictP = (SubLObject)tries.NIL;
        }
        final SubLObject state = new_directed_trie_iterator_state(trie, string, case_sensitiveP, start, end, forwardP, strictP);
        return iteration.new_iterator(state, (SubLObject)tries.$sym69$TRIE_ITERATOR_DONE, (SubLObject)tries.$sym70$TRIE_ITERATOR_NEXT, (SubLObject)tries.$sym71$TRIE_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 34805L)
    public static SubLObject new_directed_trie_iterator_state(final SubLObject trie, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject forwardP, final SubLObject strictP) {
        final SubLObject state = Vectors.make_vector((SubLObject)tries.FIVE_INTEGER, (SubLObject)tries.NIL);
        final SubLObject stack = directed_trie_iterator_generate_stack(trie, string, case_sensitiveP, start, end, forwardP, strictP);
        final SubLObject node = stacks.stack_pop(stack);
        Vectors.set_aref(state, (SubLObject)tries.ZERO_INTEGER, trie);
        Vectors.set_aref(state, (SubLObject)tries.ONE_INTEGER, node);
        Vectors.set_aref(state, (SubLObject)tries.TWO_INTEGER, forwardP);
        Vectors.set_aref(state, (SubLObject)tries.THREE_INTEGER, (SubLObject)((tries.NIL != trie_unique(trie)) ? tries.NIL : queues.create_queue((SubLObject)tries.UNPROVIDED)));
        Vectors.set_aref(state, (SubLObject)tries.FOUR_INTEGER, stack);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 35443L)
    public static SubLObject directed_trie_iterator_generate_stack(final SubLObject trie, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject forwardP, final SubLObject strictP) {
        final SubLObject start_node = trie_top_node(trie);
        final SubLObject start_string = Sequences.subseq(string, start, end);
        final SubLObject stack = stacks.create_stack();
        if (tries.NIL != forwardP) {
            forward_trie_iterator_generate_stack_recursive(start_node, stack, start_string, case_sensitiveP, strictP);
        }
        else {
            backward_trie_iterator_generate_stack_recursive(start_node, stack, start_string, case_sensitiveP, strictP);
        }
        return stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 35924L)
    public static SubLObject forward_trie_iterator_generate_stack_recursive(final SubLObject node, final SubLObject stack, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject strictly_forwardP) {
        if (tries.NIL != list_utilities.lengthE(string, (SubLObject)tries.ZERO_INTEGER, (SubLObject)tries.UNPROVIDED)) {
            if (tries.NIL == strictly_forwardP) {
                final SubLObject subnodes = trie_node_subnodes(node);
                SubLObject cdolist_list_var = Sequences.reverse(subnodes);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    stacks.stack_push(subnode, stack);
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                }
            }
        }
        else {
            final SubLObject subnodes = trie_node_subnodes(node);
            final SubLObject v_char = Sequences.elt(string, (SubLObject)tries.ZERO_INTEGER);
            SubLObject equal_nodes = (SubLObject)tries.NIL;
            SubLObject cdolist_list_var2 = Sequences.reverse(subnodes);
            SubLObject subnode2 = (SubLObject)tries.NIL;
            subnode2 = cdolist_list_var2.first();
            while (tries.NIL != cdolist_list_var2) {
                final SubLObject key = trie_node_key(subnode2);
                if (key != tries.$kw38$END) {
                    if (tries.NIL == trie_key_L(key, v_char, case_sensitiveP)) {
                        if (tries.NIL != trie_key_E(key, v_char, case_sensitiveP)) {
                            equal_nodes = (SubLObject)ConsesLow.cons(subnode2, equal_nodes);
                        }
                        else {
                            stacks.stack_push(subnode2, stack);
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode2 = cdolist_list_var2.first();
            }
            equal_nodes = (cdolist_list_var2 = Sequences.nreverse(equal_nodes));
            subnode2 = (SubLObject)tries.NIL;
            subnode2 = cdolist_list_var2.first();
            while (tries.NIL != cdolist_list_var2) {
                forward_trie_iterator_generate_stack_recursive(subnode2, stack, Sequences.subseq(string, (SubLObject)tries.ONE_INTEGER, (SubLObject)tries.UNPROVIDED), case_sensitiveP, strictly_forwardP);
                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode2 = cdolist_list_var2.first();
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 37031L)
    public static SubLObject backward_trie_iterator_generate_stack_recursive(final SubLObject node, final SubLObject stack, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject strictly_backwardP) {
        if (tries.NIL != list_utilities.lengthE(string, (SubLObject)tries.ZERO_INTEGER, (SubLObject)tries.UNPROVIDED)) {
            if (tries.NIL == strictly_backwardP) {
                SubLObject cdolist_list_var;
                final SubLObject subnodes = cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = (SubLObject)tries.NIL;
                subnode = cdolist_list_var.first();
                while (tries.NIL != cdolist_list_var) {
                    stacks.stack_push(subnode, stack);
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                }
            }
        }
        else {
            final SubLObject subnodes = trie_node_subnodes(node);
            final SubLObject v_char = Sequences.elt(string, (SubLObject)tries.ZERO_INTEGER);
            SubLObject equal_nodes = (SubLObject)tries.NIL;
            SubLObject cdolist_list_var2 = subnodes;
            SubLObject subnode2 = (SubLObject)tries.NIL;
            subnode2 = cdolist_list_var2.first();
            while (tries.NIL != cdolist_list_var2) {
                final SubLObject key = trie_node_key(subnode2);
                if (key == tries.$kw38$END) {
                    stacks.stack_push(subnode2, stack);
                }
                else if (tries.NIL != trie_key_L(key, v_char, case_sensitiveP)) {
                    stacks.stack_push(subnode2, stack);
                }
                else if (tries.NIL != trie_key_E(key, v_char, case_sensitiveP)) {
                    equal_nodes = (SubLObject)ConsesLow.cons(subnode2, equal_nodes);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode2 = cdolist_list_var2.first();
            }
            equal_nodes = (cdolist_list_var2 = Sequences.nreverse(equal_nodes));
            subnode2 = (SubLObject)tries.NIL;
            subnode2 = cdolist_list_var2.first();
            while (tries.NIL != cdolist_list_var2) {
                backward_trie_iterator_generate_stack_recursive(subnode2, stack, Sequences.subseq(string, (SubLObject)tries.ONE_INTEGER, (SubLObject)tries.UNPROVIDED), case_sensitiveP, strictly_backwardP);
                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode2 = cdolist_list_var2.first();
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 38505L)
    public static SubLObject new_trie_ancestor_tracking_vector() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Vectors.make_vector(tries.$trie_ancestor_tracking_vector_size$.getDynamicValue(thread), (SubLObject)tries.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 38615L)
    public static SubLObject get_trie_ancestor_tracking_vector() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)tries.NIL;
        SubLObject release = (SubLObject)tries.NIL;
        try {
            release = Locks.seize_lock(tries.$trie_ancestor_tracking_lock$.getDynamicValue(thread));
            if (tries.NIL != tries.$trie_ancestor_tracking_resource$.getDynamicValue(thread)) {
                final SubLObject resource = tries.$trie_ancestor_tracking_resource$.getDynamicValue(thread);
                tries.$trie_ancestor_tracking_resource$.setDynamicValue(Vectors.aref(resource, (SubLObject)tries.ZERO_INTEGER), thread);
                Vectors.set_aref(resource, (SubLObject)tries.ZERO_INTEGER, (SubLObject)tries.NIL);
                ans = resource;
            }
        }
        finally {
            if (tries.NIL != release) {
                Locks.release_lock(tries.$trie_ancestor_tracking_lock$.getDynamicValue(thread));
            }
        }
        if (tries.NIL == ans) {
            ans = new_trie_ancestor_tracking_vector();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 39039L)
    public static SubLObject free_trie_ancestor_tracking_vector(final SubLObject vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (vector.isVector()) {
            SubLObject release = (SubLObject)tries.NIL;
            try {
                release = Locks.seize_lock(tries.$trie_ancestor_tracking_lock$.getDynamicValue(thread));
                Vectors.set_aref(vector, (SubLObject)tries.ZERO_INTEGER, tries.$trie_ancestor_tracking_resource$.getDynamicValue(thread));
                tries.$trie_ancestor_tracking_resource$.setDynamicValue(vector, thread);
            }
            finally {
                if (tries.NIL != release) {
                    Locks.release_lock(tries.$trie_ancestor_tracking_lock$.getDynamicValue(thread));
                }
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 39387L)
    public static SubLObject initialize_trie_ancestor_tracking(final SubLObject top_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL != tries.$trie_ancestor_tracking$.getDynamicValue(thread)) {
            tries.$trie_ancestor_vector$.setDynamicValue(get_trie_ancestor_tracking_vector(), thread);
            tries.$trie_ancestor_next$.setDynamicValue((SubLObject)tries.ZERO_INTEGER, thread);
            trie_ancestor_tracking_descend(top_node);
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 39684L)
    public static SubLObject finish_trie_ancestor_tracking() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL != tries.$trie_ancestor_tracking$.getDynamicValue(thread)) {
            free_trie_ancestor_tracking_vector(tries.$trie_ancestor_vector$.getDynamicValue(thread));
            tries.$trie_ancestor_next$.setDynamicValue((SubLObject)tries.ZERO_INTEGER, thread);
            tries.$trie_ancestor_vector$.setDynamicValue((SubLObject)tries.NIL, thread);
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 39912L)
    public static SubLObject trie_ancestor_tracking_descend(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL != tries.$trie_ancestor_tracking$.getDynamicValue(thread)) {
            if (tries.$trie_ancestor_next$.getDynamicValue(thread).numGE(Sequences.length(tries.$trie_ancestor_vector$.getDynamicValue(thread)))) {
                tries.$trie_ancestor_vector$.setDynamicValue(vector_utilities.grow_vector(tries.$trie_ancestor_vector$.getDynamicValue(thread), (SubLObject)tries.NIL, (SubLObject)tries.TWO_INTEGER), thread);
            }
            Vectors.set_aref(tries.$trie_ancestor_vector$.getDynamicValue(thread), tries.$trie_ancestor_next$.getDynamicValue(thread), node);
            tries.$trie_ancestor_next$.setDynamicValue(Numbers.add(tries.$trie_ancestor_next$.getDynamicValue(thread), (SubLObject)tries.ONE_INTEGER), thread);
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 40286L)
    public static SubLObject trie_ancestor_tracking_ascend() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL != tries.$trie_ancestor_tracking$.getDynamicValue(thread)) {
            tries.$trie_ancestor_next$.setDynamicValue(Numbers.subtract(tries.$trie_ancestor_next$.getDynamicValue(thread), (SubLObject)tries.ONE_INTEGER), thread);
            Vectors.set_aref(tries.$trie_ancestor_vector$.getDynamicValue(thread), tries.$trie_ancestor_next$.getDynamicValue(thread), (SubLObject)tries.NIL);
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 40475L)
    public static SubLObject trie_ancestor_path() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Values.values(tries.$trie_ancestor_vector$.getDynamicValue(thread), tries.$trie_ancestor_next$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 40568L)
    public static SubLObject no_more_ancestors(final SubLObject ancestor_index) {
        return Numbers.numE(ancestor_index, (SubLObject)tries.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 40642L)
    public static SubLObject first_ancestor(final SubLObject ancestor_vector, final SubLObject ancestor_index) {
        if (tries.NIL != no_more_ancestors(ancestor_index)) {
            return (SubLObject)tries.NIL;
        }
        return Vectors.aref(ancestor_vector, Numbers.subtract(ancestor_index, (SubLObject)tries.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 40817L)
    public static SubLObject parent_ancestor(final SubLObject ancestor_vector, final SubLObject ancestor_index) {
        return first_ancestor(ancestor_vector, ancestor_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 40932L)
    public static SubLObject next_generation(final SubLObject ancestor_index) {
        return Numbers.subtract(ancestor_index, (SubLObject)tries.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 41004L)
    public static SubLObject multi_trie_some_ancestor_marked(final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject some_ancestor_marked = (SubLObject)tries.NIL;
        SubLObject catch_var = (SubLObject)tries.NIL;
        try {
            thread.throwStack.push(tries.$kw59$MAPPING_DONE);
            SubLObject cdotimes_end_var;
            SubLObject index;
            SubLObject ancestor;
            for (cdotimes_end_var = Numbers.subtract(ancestor_index, (SubLObject)tries.ONE_INTEGER), index = (SubLObject)tries.NIL, index = (SubLObject)tries.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)tries.ONE_INTEGER)) {
                ancestor = Vectors.aref(ancestor_vector, index);
                if (tries.NIL != trie_node_has_mark(ancestor, mark)) {
                    some_ancestor_marked = (SubLObject)tries.T;
                    utilities_macros.mapping_finished();
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)tries.$kw59$MAPPING_DONE);
        }
        finally {
            thread.throwStack.pop();
        }
        return some_ancestor_marked;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 41458L)
    public static SubLObject create_multi_trie(final SubLObject unique, final SubLObject multi_key_func, SubLObject name, SubLObject case_sensitive, SubLObject test) {
        if (name == tries.UNPROVIDED) {
            name = (SubLObject)tries.NIL;
        }
        if (case_sensitive == tries.UNPROVIDED) {
            case_sensitive = (SubLObject)tries.T;
        }
        if (test == tries.UNPROVIDED) {
            test = (SubLObject)tries.EQL;
        }
        final SubLObject trie = create_trie(unique, name, case_sensitive, test);
        _csetf_trie_top_node(trie, (SubLObject)tries.$kw74$ERROR);
        _csetf_trie_multi(trie, (SubLObject)tries.T);
        _csetf_trie_multi_key_func(trie, multi_key_func);
        _csetf_trie_multi_keys(trie, (SubLObject)tries.NIL);
        return trie;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 42001L)
    public static SubLObject multi_trie_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(tries.NIL != trie_p(v_object) && tries.NIL != trie_multi(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 42084L)
    public static SubLObject clear_multi_trie(final SubLObject trie, SubLObject clear_keys) {
        if (clear_keys == tries.UNPROVIDED) {
            clear_keys = (SubLObject)tries.NIL;
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        _csetf_trie_top_node(trie, (SubLObject)tries.$kw74$ERROR);
        if (tries.NIL != clear_keys) {
            _csetf_trie_multi_keys(trie, (SubLObject)tries.NIL);
        }
        else {
            SubLObject cdolist_list_var = trie_multi_keys(trie);
            SubLObject info = (SubLObject)tries.NIL;
            info = cdolist_list_var.first();
            while (tries.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = info;
                SubLObject key = (SubLObject)tries.NIL;
                SubLObject subtrie = (SubLObject)tries.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list76);
                key = current.first();
                current = (subtrie = current.rest());
                clear_trie(subtrie);
                cdolist_list_var = cdolist_list_var.rest();
                info = cdolist_list_var.first();
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 42479L)
    public static SubLObject add_multi_trie_key(final SubLObject trie, final SubLObject mark) {
        assert tries.NIL != multi_trie_p(trie) : trie;
        final SubLObject unique = trie_unique(trie);
        final SubLObject name = trie_name(trie);
        final SubLObject case_sensitive = trie_case_sensitive(trie);
        final SubLObject test = trie_entry_test_func(trie);
        final SubLObject sub_name = PrintLow.format((SubLObject)tries.NIL, (SubLObject)tries.$str77$_A__A, name, mark);
        final SubLObject sub_trie = create_trie(unique, sub_name, case_sensitive, test);
        _csetf_trie_multi_keys(trie, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(mark, sub_trie), trie_multi_keys(trie)));
        return mark;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 42914L)
    public static SubLObject rem_multi_trie_key(final SubLObject trie, final SubLObject mark) {
        assert tries.NIL != multi_trie_p(trie) : trie;
        _csetf_trie_multi_keys(trie, Sequences.delete(mark, trie_multi_keys(trie), Symbols.symbol_function((SubLObject)tries.EQL), Symbols.symbol_function((SubLObject)tries.$sym78$CAR), (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED));
        return mark;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 43085L)
    public static SubLObject multi_trie_emptyP(final SubLObject trie) {
        assert tries.NIL != multi_trie_p(trie) : trie;
        SubLObject some_non_empty = (SubLObject)tries.NIL;
        if (tries.NIL == some_non_empty) {
            SubLObject csome_list_var = trie_multi_keys(trie);
            SubLObject info = (SubLObject)tries.NIL;
            info = csome_list_var.first();
            while (tries.NIL == some_non_empty && tries.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = info;
                SubLObject mark = (SubLObject)tries.NIL;
                SubLObject subtrie = (SubLObject)tries.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list79);
                mark = current.first();
                current = (subtrie = current.rest());
                some_non_empty = (SubLObject)SubLObjectFactory.makeBoolean(tries.NIL == trie_emptyP(subtrie));
                csome_list_var = csome_list_var.rest();
                info = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(tries.NIL == some_non_empty);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 43423L)
    public static SubLObject multi_trie_count(final SubLObject trie) {
        assert tries.NIL != multi_trie_p(trie) : trie;
        SubLObject total_count = (SubLObject)tries.ZERO_INTEGER;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = (SubLObject)tries.NIL;
        info = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = (SubLObject)tries.NIL;
            SubLObject subtrie = (SubLObject)tries.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list79);
            mark = current.first();
            current = (subtrie = current.rest());
            total_count = Numbers.add(total_count, trie_count(subtrie));
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return total_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 43746L)
    public static SubLObject show_multi_trie(final SubLObject trie, SubLObject stream) {
        if (stream == tries.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        PrintLow.format(stream, (SubLObject)tries.$str80$___S_sub_tries, Sequences.length(trie_multi_keys(trie)));
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = (SubLObject)tries.NIL;
        info = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = (SubLObject)tries.NIL;
            SubLObject subtrie = (SubLObject)tries.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list79);
            mark = current.first();
            current = (subtrie = current.rest());
            PrintLow.format(stream, (SubLObject)tries.$str81$____Sub_Trie__S, mark);
            show_trie(subtrie, stream);
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return trie;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 44143L)
    public static SubLObject multi_trie_insert(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == tries.UNPROVIDED) {
            v_object = string;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        final SubLObject key_func = trie_multi_key_func(trie);
        final SubLObject mark = Functions.funcall(key_func, v_object);
        final SubLObject subtrie = conses_high.assoc(mark, trie_multi_keys(trie), (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED).rest();
        if (tries.NIL != trie_p(subtrie)) {
            trie_insert(subtrie, string, v_object, start, end);
            return (SubLObject)tries.T;
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 44507L)
    public static SubLObject multi_trie_remove(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == tries.UNPROVIDED) {
            v_object = string;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        final SubLObject key_func = trie_multi_key_func(trie);
        final SubLObject mark = Functions.funcall(key_func, v_object);
        final SubLObject subtrie = conses_high.assoc(mark, trie_multi_keys(trie), (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED).rest();
        if (tries.NIL != trie_p(subtrie)) {
            trie_remove(subtrie, string, v_object, start, end);
            return (SubLObject)tries.T;
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 44871L)
    public static SubLObject multi_trie_remove_all(final SubLObject trie, final SubLObject string, SubLObject start, SubLObject end) {
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        SubLObject total = (SubLObject)tries.ZERO_INTEGER;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = (SubLObject)tries.NIL;
        info = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = (SubLObject)tries.NIL;
            SubLObject subtrie = (SubLObject)tries.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list79);
            mark = current.first();
            current = (subtrie = current.rest());
            total = Numbers.add(total, trie_remove_all(subtrie, string, start, end));
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 45177L)
    public static SubLObject multi_trie_exact(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject relevant_marks, SubLObject start, SubLObject end) {
        if (case_sensitiveP == tries.UNPROVIDED) {
            case_sensitiveP = (SubLObject)tries.NIL;
        }
        if (relevant_marks == tries.UNPROVIDED) {
            relevant_marks = (SubLObject)tries.$kw0$ALL;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        SubLObject ans = (SubLObject)tries.NIL;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = (SubLObject)tries.NIL;
        info = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = (SubLObject)tries.NIL;
            SubLObject subtrie = (SubLObject)tries.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list79);
            mark = current.first();
            current = (subtrie = current.rest());
            if (relevant_marks == tries.$kw0$ALL || tries.NIL != conses_high.member(mark, relevant_marks, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED)) {
                final SubLObject sub_ans = trie_exact(subtrie, string, case_sensitiveP, start, end);
                if (tries.NIL != sub_ans) {
                    ans = (SubLObject)ConsesLow.cons(sub_ans, ans);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 45671L)
    public static SubLObject multi_trie_prefix(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject relevant_marks, SubLObject start, SubLObject end) {
        if (case_sensitiveP == tries.UNPROVIDED) {
            case_sensitiveP = (SubLObject)tries.NIL;
        }
        if (exact_lengthP == tries.UNPROVIDED) {
            exact_lengthP = (SubLObject)tries.NIL;
        }
        if (relevant_marks == tries.UNPROVIDED) {
            relevant_marks = (SubLObject)tries.$kw0$ALL;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        SubLObject ans = (SubLObject)tries.NIL;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = (SubLObject)tries.NIL;
        info = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = (SubLObject)tries.NIL;
            SubLObject subtrie = (SubLObject)tries.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list79);
            mark = current.first();
            current = (subtrie = current.rest());
            if (relevant_marks == tries.$kw0$ALL || tries.NIL != conses_high.member(mark, relevant_marks, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED)) {
                final SubLObject sub_ans = trie_prefix(subtrie, string, case_sensitiveP, exact_lengthP, start, end);
                ans = ConsesLow.append(sub_ans, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 46160L)
    public static SubLObject multi_trie_search(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject relevant_marks, SubLObject start, SubLObject end) {
        if (case_sensitiveP == tries.UNPROVIDED) {
            case_sensitiveP = (SubLObject)tries.NIL;
        }
        if (relevant_marks == tries.UNPROVIDED) {
            relevant_marks = (SubLObject)tries.$kw0$ALL;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        SubLObject ans = (SubLObject)tries.NIL;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = (SubLObject)tries.NIL;
        info = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = (SubLObject)tries.NIL;
            SubLObject subtrie = (SubLObject)tries.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list79);
            mark = current.first();
            current = (subtrie = current.rest());
            if (relevant_marks == tries.$kw0$ALL || tries.NIL != conses_high.member(mark, relevant_marks, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED)) {
                final SubLObject sub_ans = trie_search(subtrie, string, case_sensitiveP, start, end);
                ans = ConsesLow.append(sub_ans, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 46621L)
    public static SubLObject map_multi_trie_data(final SubLObject function, final SubLObject trie, SubLObject relevant_marks) {
        if (relevant_marks == tries.UNPROVIDED) {
            relevant_marks = (SubLObject)tries.$kw0$ALL;
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = (SubLObject)tries.NIL;
        info = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = (SubLObject)tries.NIL;
            SubLObject subtrie = (SubLObject)tries.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list79);
            mark = current.first();
            current = (subtrie = current.rest());
            if (relevant_marks == tries.$kw0$ALL || tries.NIL != conses_high.member(mark, relevant_marks, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED)) {
                map_trie_data(function, subtrie);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 47016L)
    public static SubLObject map_multi_trie_data_mark(final SubLObject function, final SubLObject trie, final SubLObject mark) {
        assert tries.NIL != multi_trie_p(trie) : trie;
        final SubLObject subtrie = conses_high.assoc(mark, trie_multi_keys(trie), (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED).rest();
        if (tries.NIL != trie_p(subtrie)) {
            map_trie_data(function, subtrie);
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 47308L)
    public static SubLObject map_multi_trie_data_direction(final SubLObject function, final SubLObject trie, final SubLObject string, SubLObject relevant_marks, SubLObject start, SubLObject end, SubLObject v_forward) {
        if (relevant_marks == tries.UNPROVIDED) {
            relevant_marks = (SubLObject)tries.$kw0$ALL;
        }
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        if (v_forward == tries.UNPROVIDED) {
            v_forward = (SubLObject)tries.T;
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = (SubLObject)tries.NIL;
        info = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = (SubLObject)tries.NIL;
            SubLObject subtrie = (SubLObject)tries.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tries.$list79);
            mark = current.first();
            current = (subtrie = current.rest());
            if (relevant_marks == tries.$kw0$ALL || tries.NIL != conses_high.member(mark, relevant_marks, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED)) {
                map_trie_data_direction(function, subtrie, string, start, end, v_forward);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 47711L)
    public static SubLObject map_multi_trie_data_direction_mark(final SubLObject function, final SubLObject trie, final SubLObject string, final SubLObject mark, SubLObject start, SubLObject end, SubLObject v_forward) {
        if (start == tries.UNPROVIDED) {
            start = (SubLObject)tries.ZERO_INTEGER;
        }
        if (end == tries.UNPROVIDED) {
            end = (SubLObject)tries.NIL;
        }
        if (v_forward == tries.UNPROVIDED) {
            v_forward = (SubLObject)tries.T;
        }
        assert tries.NIL != multi_trie_p(trie) : trie;
        final SubLObject subtrie = conses_high.assoc(mark, trie_multi_keys(trie), (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED).rest();
        if (tries.NIL != trie_p(subtrie)) {
            map_trie_data_direction(function, subtrie, string, start, end, v_forward);
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 48031L)
    public static SubLObject trie_relevant_ancestor_pathP(final SubLObject trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL == trie_multi(trie)) {
            return (SubLObject)tries.T;
        }
        if (tries.NIL == tries.$trie_relevant_marks$.getDynamicValue(thread)) {
            return (SubLObject)tries.NIL;
        }
        if (tries.$trie_relevant_marks$.getDynamicValue(thread).isAtom()) {
            return (SubLObject)tries.T;
        }
        SubLObject some_mark_not_on_any_ancestor = (SubLObject)tries.NIL;
        thread.resetMultipleValues();
        final SubLObject ancestor_vector = trie_ancestor_path();
        final SubLObject ancestor_end_index = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (tries.NIL == some_mark_not_on_any_ancestor) {
            SubLObject csome_list_var = tries.$trie_relevant_marks$.getDynamicValue(thread);
            SubLObject mark = (SubLObject)tries.NIL;
            mark = csome_list_var.first();
            while (tries.NIL == some_mark_not_on_any_ancestor && tries.NIL != csome_list_var) {
                SubLObject mark_on_ancestor = (SubLObject)tries.NIL;
                SubLObject catch_var = (SubLObject)tries.NIL;
                try {
                    thread.throwStack.push(tries.$kw59$MAPPING_DONE);
                    SubLObject index;
                    SubLObject ancestor;
                    for (index = (SubLObject)tries.NIL, index = (SubLObject)tries.ZERO_INTEGER; index.numL(ancestor_end_index); index = Numbers.add(index, (SubLObject)tries.ONE_INTEGER)) {
                        ancestor = Vectors.aref(ancestor_vector, index);
                        if (tries.NIL != ((tries.NIL != trie_leaf_node_p(ancestor)) ? trie_leaf_has_implicit_mark(trie, ancestor, mark) : trie_node_has_mark(ancestor, mark))) {
                            mark_on_ancestor = (SubLObject)tries.T;
                            utilities_macros.mapping_finished();
                        }
                    }
                }
                catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)tries.$kw59$MAPPING_DONE);
                }
                finally {
                    thread.throwStack.pop();
                }
                if (tries.NIL == mark_on_ancestor) {
                    some_mark_not_on_any_ancestor = (SubLObject)tries.T;
                }
                csome_list_var = csome_list_var.rest();
                mark = csome_list_var.first();
            }
        }
        return some_mark_not_on_any_ancestor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 48955L)
    public static SubLObject trie_relevant_object(final SubLObject trie, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL == trie_multi(trie)) {
            return (SubLObject)tries.T;
        }
        if (tries.NIL == tries.$trie_relevant_marks$.getDynamicValue(thread)) {
            return (SubLObject)tries.NIL;
        }
        if (tries.$trie_relevant_marks$.getDynamicValue(thread).isAtom()) {
            return (SubLObject)tries.T;
        }
        final SubLObject object_mark = Functions.funcall(trie_multi_key_func(trie), v_object);
        return conses_high.member(object_mark, tries.$trie_relevant_marks$.getDynamicValue(thread), (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 49270L)
    public static SubLObject trie_relevant_objects(final SubLObject trie, final SubLObject objects) {
        SubLObject ans = (SubLObject)tries.NIL;
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = (SubLObject)tries.NIL;
        v_object = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            if (tries.NIL != trie_relevant_object(trie, v_object)) {
                ans = (SubLObject)ConsesLow.cons(v_object, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 49446L)
    public static SubLObject add_trie_mark(final SubLObject trie, final SubLObject mark) {
        assert tries.NIL != trie_p(trie) : trie;
        if (tries.NIL != trie_multi(trie)) {
            final SubLObject marks = trie_multi_keys(trie);
            if (tries.NIL == Sequences.find(mark, marks, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED)) {
                _csetf_trie_multi_keys(trie, (SubLObject)ConsesLow.cons(mark, marks));
                add_trie_node_mark(trie_top_node(trie), mark);
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 49979L)
    public static SubLObject rem_trie_mark(final SubLObject trie, final SubLObject mark) {
        assert tries.NIL != trie_p(trie) : trie;
        if (tries.NIL != trie_multi(trie)) {
            final SubLObject marks = trie_multi_keys(trie);
            if (tries.NIL != Sequences.find(mark, marks, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED)) {
                _csetf_trie_multi_keys(trie, list_utilities.delete_first(mark, marks, (SubLObject)tries.UNPROVIDED));
                rem_trie_node_mark(trie_top_node(trie), mark);
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 50452L)
    public static SubLObject trie_node_marks(final SubLObject node) {
        final SubLObject car = node.first();
        if (car.isCons()) {
            return car.rest();
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 50603L)
    public static SubLObject trie_node_has_mark(final SubLObject node, final SubLObject mark) {
        return Sequences.find(mark, trie_node_marks(node), (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 50741L)
    public static SubLObject set_trie_node_marks(final SubLObject node, final SubLObject marks) {
        final SubLObject key = trie_node_key(node);
        if (key != tries.$kw38$END) {
            if (tries.NIL == marks) {
                ConsesLow.rplaca(node, key);
            }
            else {
                final SubLObject car = node.first();
                if (car.isCons()) {
                    ConsesLow.rplacd(car, marks);
                }
                else {
                    ConsesLow.rplaca(node, (SubLObject)ConsesLow.cons(key, marks));
                }
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 51066L)
    public static SubLObject trie_leaf_has_implicit_mark(final SubLObject trie, final SubLObject leaf_node, final SubLObject mark) {
        final SubLObject data = trie_node_data(leaf_node);
        final SubLObject mark_func = trie_multi_key_func(trie);
        if (tries.NIL != trie_unique(trie)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(!mark.eql(Functions.funcall(mark_func, data)));
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = (SubLObject)tries.NIL;
        datum = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            if (mark.eql(Functions.funcall(mark_func, datum))) {
                return (SubLObject)tries.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return (SubLObject)tries.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 51390L)
    public static SubLObject add_trie_node_mark(final SubLObject node, final SubLObject mark) {
        if (tries.NIL == trie_leaf_node_p(node)) {
            final SubLObject marks = trie_node_marks(node);
            if (tries.NIL == Sequences.find(mark, marks, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED)) {
                set_trie_node_marks(node, (SubLObject)ConsesLow.cons(mark, marks));
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 51724L)
    public static SubLObject rem_trie_node_mark(final SubLObject node, final SubLObject mark) {
        if (tries.NIL == trie_leaf_node_p(node)) {
            final SubLObject marks = trie_node_marks(node);
            if (tries.NIL != Sequences.find(mark, marks, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED, (SubLObject)tries.UNPROVIDED)) {
                set_trie_node_marks(node, list_utilities.delete_first(mark, marks, (SubLObject)tries.UNPROVIDED));
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 52021L)
    public static SubLObject trie_node_mark_present_recursive(final SubLObject trie, SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
        ancestor_index = next_generation(ancestor_index);
        if (tries.NIL != trie_node_has_mark(node, mark)) {
            return rem_trie_node_mark(node, mark);
        }
        final SubLObject parent = parent_ancestor(ancestor_vector, ancestor_index);
        SubLObject cdolist_list_var;
        final SubLObject siblings = cdolist_list_var = trie_node_subnodes(parent);
        SubLObject sibling = (SubLObject)tries.NIL;
        sibling = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            if (!node.eql(sibling) && tries.NIL == trie_leaf_node_p(sibling)) {
                add_trie_node_mark(sibling, mark);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling = cdolist_list_var.first();
        }
        return trie_node_mark_present_recursive(trie, ancestor_index, ancestor_vector, mark);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 52907L)
    public static SubLObject trie_node_mark_not_present_recursive(final SubLObject trie, SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
        ancestor_index = next_generation(ancestor_index);
        if (tries.NIL != no_more_ancestors(ancestor_index)) {
            return add_trie_node_mark(node, mark);
        }
        final SubLObject parent = parent_ancestor(ancestor_vector, ancestor_index);
        SubLObject cdolist_list_var;
        final SubLObject siblings = cdolist_list_var = trie_node_subnodes(parent);
        SubLObject sibling = (SubLObject)tries.NIL;
        sibling = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            if (!node.eql(sibling)) {
                if (tries.NIL != trie_leaf_node_p(sibling)) {
                    if (tries.NIL == trie_leaf_has_implicit_mark(trie, sibling, mark)) {
                        return add_trie_node_mark(node, mark);
                    }
                }
                else if (tries.NIL == trie_node_has_mark(sibling, mark)) {
                    return add_trie_node_mark(node, mark);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling = cdolist_list_var.first();
        }
        cdolist_list_var = siblings;
        sibling = (SubLObject)tries.NIL;
        sibling = cdolist_list_var.first();
        while (tries.NIL != cdolist_list_var) {
            if (!node.eql(sibling) && tries.NIL == trie_leaf_node_p(sibling)) {
                rem_trie_node_mark(sibling, mark);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling = cdolist_list_var.first();
        }
        return trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 54411L)
    public static SubLObject multi_trie_existing_insert_mark(final SubLObject trie, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL != trie_multi(trie)) {
            thread.resetMultipleValues();
            final SubLObject ancestor_vector = trie_ancestor_path();
            final SubLObject ancestor_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject object_mark = Functions.funcall(trie_multi_key_func(trie), v_object);
            final SubLObject trie_marks = trie_multi_keys(trie);
            final SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
            assert tries.NIL != trie_leaf_node_p(node) : node;
            SubLObject cdolist_list_var = trie_marks;
            SubLObject mark = (SubLObject)tries.NIL;
            mark = cdolist_list_var.first();
            while (tries.NIL != cdolist_list_var) {
                if (mark.eql(object_mark)) {
                    multi_trie_existing_insert_mark_present(trie, ancestor_index, ancestor_vector, mark);
                }
                else {
                    multi_trie_existing_insert_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mark = cdolist_list_var.first();
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 55222L)
    public static SubLObject multi_trie_existing_insert_mark_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (tries.NIL != some_ancestor_marked) {
            trie_node_mark_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 55628L)
    public static SubLObject multi_trie_existing_insert_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (tries.NIL != some_ancestor_marked) {
            return (SubLObject)tries.NIL;
        }
        final SubLObject leaf_node = first_ancestor(ancestor_vector, ancestor_index);
        if (tries.NIL == trie_leaf_has_implicit_mark(trie, leaf_node, mark)) {
            return (SubLObject)tries.NIL;
        }
        trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 56399L)
    public static SubLObject multi_trie_new_insert_mark(final SubLObject trie, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL != trie_multi(trie)) {
            thread.resetMultipleValues();
            final SubLObject ancestor_vector = trie_ancestor_path();
            final SubLObject ancestor_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject object_mark = Functions.funcall(trie_multi_key_func(trie), v_object);
            SubLObject cdolist_list_var;
            final SubLObject trie_marks = cdolist_list_var = trie_multi_keys(trie);
            SubLObject mark = (SubLObject)tries.NIL;
            mark = cdolist_list_var.first();
            while (tries.NIL != cdolist_list_var) {
                if (mark.eql(object_mark)) {
                    multi_trie_new_insert_mark_present(trie, ancestor_index, ancestor_vector, mark);
                }
                else {
                    multi_trie_new_insert_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mark = cdolist_list_var.first();
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 57051L)
    public static SubLObject multi_trie_new_insert_mark_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (tries.NIL != some_ancestor_marked) {
            return trie_node_mark_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 57472L)
    public static SubLObject multi_trie_new_insert_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (tries.NIL != some_ancestor_marked) {
            return (SubLObject)tries.NIL;
        }
        final SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
        if (tries.NIL != trie_node_subnodes(node)) {
            return (SubLObject)tries.NIL;
        }
        trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 58128L)
    public static SubLObject multi_trie_remove_mark(final SubLObject trie, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL != trie_multi(trie)) {
            thread.resetMultipleValues();
            final SubLObject ancestor_vector = trie_ancestor_path();
            final SubLObject ancestor_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mark = Functions.funcall(trie_multi_key_func(trie), v_object);
            final SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
            assert tries.NIL != trie_leaf_node_p(node) : node;
            if (tries.NIL != trie_leaf_has_implicit_mark(trie, node, mark)) {
                multi_trie_remove_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 58741L)
    public static SubLObject multi_trie_remove_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (tries.NIL != some_ancestor_marked) {
            return (SubLObject)tries.NIL;
        }
        trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 59131L)
    public static SubLObject multi_trie_remove_all_mark(final SubLObject trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tries.NIL != trie_multi(trie)) {
            thread.resetMultipleValues();
            final SubLObject ancestor_vector = trie_ancestor_path();
            final SubLObject ancestor_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var;
            final SubLObject trie_marks = cdolist_list_var = trie_multi_keys(trie);
            SubLObject mark = (SubLObject)tries.NIL;
            mark = cdolist_list_var.first();
            while (tries.NIL != cdolist_list_var) {
                multi_trie_remove_all_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
                cdolist_list_var = cdolist_list_var.rest();
                mark = cdolist_list_var.first();
            }
        }
        return (SubLObject)tries.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tries.lisp", position = 59571L)
    public static SubLObject multi_trie_remove_all_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (tries.NIL != some_ancestor_marked) {
            return (SubLObject)tries.NIL;
        }
        trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        return (SubLObject)tries.NIL;
    }
    
    public static SubLObject declare_tries_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_print_function_trampoline", "TRIE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_p", "TRIE-P", 1, 0, false);
        new $trie_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_name", "TRIE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_top_node", "TRIE-TOP-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_unique", "TRIE-UNIQUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_case_sensitive", "TRIE-CASE-SENSITIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_entry_test_func", "TRIE-ENTRY-TEST-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_multi", "TRIE-MULTI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_multi_keys", "TRIE-MULTI-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_multi_key_func", "TRIE-MULTI-KEY-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "_csetf_trie_name", "_CSETF-TRIE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "_csetf_trie_top_node", "_CSETF-TRIE-TOP-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "_csetf_trie_unique", "_CSETF-TRIE-UNIQUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "_csetf_trie_case_sensitive", "_CSETF-TRIE-CASE-SENSITIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "_csetf_trie_entry_test_func", "_CSETF-TRIE-ENTRY-TEST-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "_csetf_trie_multi", "_CSETF-TRIE-MULTI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "_csetf_trie_multi_keys", "_CSETF-TRIE-MULTI-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "_csetf_trie_multi_key_func", "_CSETF-TRIE-MULTI-KEY-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "make_trie", "MAKE-TRIE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "visit_defstruct_trie", "VISIT-DEFSTRUCT-TRIE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "visit_defstruct_object_trie_method", "VISIT-DEFSTRUCT-OBJECT-TRIE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "print_trie", "PRINT-TRIE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "make_static_trie", "MAKE-STATIC-TRIE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "init_trie", "INIT-TRIE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "free_trie_p", "FREE-TRIE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "free_trie", "FREE-TRIE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "get_trie", "GET-TRIE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_node_key", "TRIE-NODE-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_node_data", "TRIE-NODE-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_node_subnodes", "TRIE-NODE-SUBNODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_leaf_node_p", "TRIE-LEAF-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "new_trie_terminal_node", "NEW-TRIE-TERMINAL-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "new_trie_nonterminal_node", "NEW-TRIE-NONTERMINAL-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_key_E", "TRIE-KEY-=", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_key_L", "TRIE-KEY-<", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_key_LE", "TRIE-KEY-<=", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_key_G", "TRIE-KEY->", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_key_GE", "TRIE-KEY->=", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "add_trie_subnode", "ADD-TRIE-SUBNODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "create_trie", "CREATE-TRIE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_from_strings", "TRIE-FROM-STRINGS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "clear_trie", "CLEAR-TRIE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_emptyP", "TRIE-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_count", "TRIE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_node_count", "TRIE-NODE-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "show_trie", "SHOW-TRIE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "show_trie_node", "SHOW-TRIE-NODE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_insert", "TRIE-INSERT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_remove", "TRIE-REMOVE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_remove_all", "TRIE-REMOVE-ALL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_exact", "TRIE-EXACT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_prefix", "TRIE-PREFIX", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_prefix_iterative", "TRIE-PREFIX-ITERATIVE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_prefix_recursive", "TRIE-PREFIX-RECURSIVE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_prefix_recursive_int", "TRIE-PREFIX-RECURSIVE-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "all_trie_objects_under_node", "ALL-TRIE-OBJECTS-UNDER-NODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "all_trie_objects_in_leaf_node", "ALL-TRIE-OBJECTS-IN-LEAF-NODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_search", "TRIE-SEARCH", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_search_internal", "TRIE-SEARCH-INTERNAL", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_match", "TRIE-MATCH", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "map_trie_data", "MAP-TRIE-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "map_trie_data_internal", "MAP-TRIE-DATA-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "map_trie_data_direction", "MAP-TRIE-DATA-DIRECTION", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "map_trie_data_forward", "MAP-TRIE-DATA-FORWARD", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "map_trie_data_backward", "MAP-TRIE-DATA-BACKWARD", 8, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tries", "do_objects_in_trie", "DO-OBJECTS-IN-TRIE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "new_trie_iterator", "NEW-TRIE-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "new_trie_iterator_state", "NEW-TRIE-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_iterator_done", "TRIE-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_iterator_done_node", "TRIE-ITERATOR-DONE-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_iterator_done_queue", "TRIE-ITERATOR-DONE-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_iterator_done_stack", "TRIE-ITERATOR-DONE-STACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_iterator_next", "TRIE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_iterator_next_unique", "TRIE-ITERATOR-NEXT-UNIQUE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_iterator_next_non_unique", "TRIE-ITERATOR-NEXT-NON-UNIQUE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_iterator_finalize", "TRIE-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "new_directed_trie_iterator", "NEW-DIRECTED-TRIE-ITERATOR", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "new_directed_trie_iterator_state", "NEW-DIRECTED-TRIE-ITERATOR-STATE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "directed_trie_iterator_generate_stack", "DIRECTED-TRIE-ITERATOR-GENERATE-STACK", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "forward_trie_iterator_generate_stack_recursive", "FORWARD-TRIE-ITERATOR-GENERATE-STACK-RECURSIVE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "backward_trie_iterator_generate_stack_recursive", "BACKWARD-TRIE-ITERATOR-GENERATE-STACK-RECURSIVE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "new_trie_ancestor_tracking_vector", "NEW-TRIE-ANCESTOR-TRACKING-VECTOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "get_trie_ancestor_tracking_vector", "GET-TRIE-ANCESTOR-TRACKING-VECTOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "free_trie_ancestor_tracking_vector", "FREE-TRIE-ANCESTOR-TRACKING-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "initialize_trie_ancestor_tracking", "INITIALIZE-TRIE-ANCESTOR-TRACKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "finish_trie_ancestor_tracking", "FINISH-TRIE-ANCESTOR-TRACKING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_ancestor_tracking_descend", "TRIE-ANCESTOR-TRACKING-DESCEND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_ancestor_tracking_ascend", "TRIE-ANCESTOR-TRACKING-ASCEND", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_ancestor_path", "TRIE-ANCESTOR-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "no_more_ancestors", "NO-MORE-ANCESTORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "first_ancestor", "FIRST-ANCESTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "parent_ancestor", "PARENT-ANCESTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "next_generation", "NEXT-GENERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_some_ancestor_marked", "MULTI-TRIE-SOME-ANCESTOR-MARKED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "create_multi_trie", "CREATE-MULTI-TRIE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_p", "MULTI-TRIE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "clear_multi_trie", "CLEAR-MULTI-TRIE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "add_multi_trie_key", "ADD-MULTI-TRIE-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "rem_multi_trie_key", "REM-MULTI-TRIE-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_emptyP", "MULTI-TRIE-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_count", "MULTI-TRIE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "show_multi_trie", "SHOW-MULTI-TRIE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_insert", "MULTI-TRIE-INSERT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_remove", "MULTI-TRIE-REMOVE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_remove_all", "MULTI-TRIE-REMOVE-ALL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_exact", "MULTI-TRIE-EXACT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_prefix", "MULTI-TRIE-PREFIX", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_search", "MULTI-TRIE-SEARCH", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "map_multi_trie_data", "MAP-MULTI-TRIE-DATA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "map_multi_trie_data_mark", "MAP-MULTI-TRIE-DATA-MARK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "map_multi_trie_data_direction", "MAP-MULTI-TRIE-DATA-DIRECTION", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "map_multi_trie_data_direction_mark", "MAP-MULTI-TRIE-DATA-DIRECTION-MARK", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_relevant_ancestor_pathP", "TRIE-RELEVANT-ANCESTOR-PATH?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_relevant_object", "TRIE-RELEVANT-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_relevant_objects", "TRIE-RELEVANT-OBJECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "add_trie_mark", "ADD-TRIE-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "rem_trie_mark", "REM-TRIE-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_node_marks", "TRIE-NODE-MARKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_node_has_mark", "TRIE-NODE-HAS-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "set_trie_node_marks", "SET-TRIE-NODE-MARKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_leaf_has_implicit_mark", "TRIE-LEAF-HAS-IMPLICIT-MARK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "add_trie_node_mark", "ADD-TRIE-NODE-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "rem_trie_node_mark", "REM-TRIE-NODE-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_node_mark_present_recursive", "TRIE-NODE-MARK-PRESENT-RECURSIVE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "trie_node_mark_not_present_recursive", "TRIE-NODE-MARK-NOT-PRESENT-RECURSIVE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_existing_insert_mark", "MULTI-TRIE-EXISTING-INSERT-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_existing_insert_mark_present", "MULTI-TRIE-EXISTING-INSERT-MARK-PRESENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_existing_insert_mark_not_present", "MULTI-TRIE-EXISTING-INSERT-MARK-NOT-PRESENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_new_insert_mark", "MULTI-TRIE-NEW-INSERT-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_new_insert_mark_present", "MULTI-TRIE-NEW-INSERT-MARK-PRESENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_new_insert_mark_not_present", "MULTI-TRIE-NEW-INSERT-MARK-NOT-PRESENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_remove_mark", "MULTI-TRIE-REMOVE-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_remove_mark_not_present", "MULTI-TRIE-REMOVE-MARK-NOT-PRESENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_remove_all_mark", "MULTI-TRIE-REMOVE-ALL-MARK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tries", "multi_trie_remove_all_mark_not_present", "MULTI-TRIE-REMOVE-ALL-MARK-NOT-PRESENT", 4, 0, false);
        return (SubLObject)tries.NIL;
    }
    
    public static SubLObject init_tries_file() {
        tries.$trie_objects$ = SubLFiles.defparameter("*TRIE-OBJECTS*", (SubLObject)tries.NIL);
        tries.$trie_relevant_marks$ = SubLFiles.defparameter("*TRIE-RELEVANT-MARKS*", (SubLObject)tries.$kw0$ALL);
        tries.$trie_ancestor_tracking$ = SubLFiles.defparameter("*TRIE-ANCESTOR-TRACKING*", (SubLObject)tries.NIL);
        tries.$dtp_trie$ = SubLFiles.defconstant("*DTP-TRIE*", (SubLObject)tries.$sym1$TRIE);
        tries.$trie_free_list$ = SubLFiles.deflexical("*TRIE-FREE-LIST*", (SubLObject)tries.NIL);
        tries.$trie_free_lock$ = SubLFiles.deflexical("*TRIE-FREE-LOCK*", Locks.make_lock((SubLObject)tries.$str47$TRIE_resource_lock));
        tries.$trie_maximum_search_size$ = SubLFiles.defparameter("*TRIE-MAXIMUM-SEARCH-SIZE*", (SubLObject)tries.$int57$1000);
        tries.$trie_ancestor_tracking_resource$ = SubLFiles.defparameter("*TRIE-ANCESTOR-TRACKING-RESOURCE*", (SubLObject)tries.NIL);
        tries.$trie_ancestor_tracking_lock$ = SubLFiles.defparameter("*TRIE-ANCESTOR-TRACKING-LOCK*", Locks.make_lock((SubLObject)tries.$str72$Ancestor_Tracking_Resource));
        tries.$trie_ancestor_tracking_vector_size$ = SubLFiles.defparameter("*TRIE-ANCESTOR-TRACKING-VECTOR-SIZE*", (SubLObject)tries.$int73$100);
        tries.$trie_ancestor_vector$ = SubLFiles.defparameter("*TRIE-ANCESTOR-VECTOR*", (SubLObject)tries.NIL);
        tries.$trie_ancestor_next$ = SubLFiles.defparameter("*TRIE-ANCESTOR-NEXT*", (SubLObject)tries.NIL);
        return (SubLObject)tries.NIL;
    }
    
    public static SubLObject setup_tries_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), tries.$dtp_trie$.getGlobalValue(), Symbols.symbol_function((SubLObject)tries.$sym8$TRIE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)tries.$list9);
        Structures.def_csetf((SubLObject)tries.$sym10$TRIE_NAME, (SubLObject)tries.$sym11$_CSETF_TRIE_NAME);
        Structures.def_csetf((SubLObject)tries.$sym12$TRIE_TOP_NODE, (SubLObject)tries.$sym13$_CSETF_TRIE_TOP_NODE);
        Structures.def_csetf((SubLObject)tries.$sym14$TRIE_UNIQUE, (SubLObject)tries.$sym15$_CSETF_TRIE_UNIQUE);
        Structures.def_csetf((SubLObject)tries.$sym16$TRIE_CASE_SENSITIVE, (SubLObject)tries.$sym17$_CSETF_TRIE_CASE_SENSITIVE);
        Structures.def_csetf((SubLObject)tries.$sym18$TRIE_ENTRY_TEST_FUNC, (SubLObject)tries.$sym19$_CSETF_TRIE_ENTRY_TEST_FUNC);
        Structures.def_csetf((SubLObject)tries.$sym20$TRIE_MULTI, (SubLObject)tries.$sym21$_CSETF_TRIE_MULTI);
        Structures.def_csetf((SubLObject)tries.$sym22$TRIE_MULTI_KEYS, (SubLObject)tries.$sym23$_CSETF_TRIE_MULTI_KEYS);
        Structures.def_csetf((SubLObject)tries.$sym24$TRIE_MULTI_KEY_FUNC, (SubLObject)tries.$sym25$_CSETF_TRIE_MULTI_KEY_FUNC);
        Equality.identity((SubLObject)tries.$sym1$TRIE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), tries.$dtp_trie$.getGlobalValue(), Symbols.symbol_function((SubLObject)tries.$sym39$VISIT_DEFSTRUCT_OBJECT_TRIE_METHOD));
        return (SubLObject)tries.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_tries_file();
    }
    
    @Override
	public void initializeVariables() {
        init_tries_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_tries_file();
    }
    
    static {
        me = (SubLFile)new tries();
        tries.$trie_objects$ = null;
        tries.$trie_relevant_marks$ = null;
        tries.$trie_ancestor_tracking$ = null;
        tries.$dtp_trie$ = null;
        tries.$trie_free_list$ = null;
        tries.$trie_free_lock$ = null;
        tries.$trie_maximum_search_size$ = null;
        tries.$trie_ancestor_tracking_resource$ = null;
        tries.$trie_ancestor_tracking_lock$ = null;
        tries.$trie_ancestor_tracking_vector_size$ = null;
        tries.$trie_ancestor_vector$ = null;
        tries.$trie_ancestor_next$ = null;
        $kw0$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym1$TRIE = SubLObjectFactory.makeSymbol("TRIE");
        $sym2$TRIE_P = SubLObjectFactory.makeSymbol("TRIE-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TOP-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIQUE"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY-TEST-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("MULTI"), (SubLObject)SubLObjectFactory.makeSymbol("MULTI-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("MULTI-KEY-FUNC"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-NODE"), (SubLObject)SubLObjectFactory.makeKeyword("UNIQUE"), (SubLObject)SubLObjectFactory.makeKeyword("CASE-SENSITIVE"), (SubLObject)SubLObjectFactory.makeKeyword("ENTRY-TEST-FUNC"), (SubLObject)SubLObjectFactory.makeKeyword("MULTI"), (SubLObject)SubLObjectFactory.makeKeyword("MULTI-KEYS"), (SubLObject)SubLObjectFactory.makeKeyword("MULTI-KEY-FUNC"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-TOP-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-UNIQUE"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-CASE-SENSITIVE"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY-TEST-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-MULTI"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-MULTI-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-MULTI-KEY-FUNC"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRIE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRIE-TOP-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRIE-UNIQUE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRIE-CASE-SENSITIVE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRIE-ENTRY-TEST-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRIE-MULTI"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRIE-MULTI-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TRIE-MULTI-KEY-FUNC"));
        $sym7$PRINT_TRIE = SubLObjectFactory.makeSymbol("PRINT-TRIE");
        $sym8$TRIE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TRIE-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-P"));
        $sym10$TRIE_NAME = SubLObjectFactory.makeSymbol("TRIE-NAME");
        $sym11$_CSETF_TRIE_NAME = SubLObjectFactory.makeSymbol("_CSETF-TRIE-NAME");
        $sym12$TRIE_TOP_NODE = SubLObjectFactory.makeSymbol("TRIE-TOP-NODE");
        $sym13$_CSETF_TRIE_TOP_NODE = SubLObjectFactory.makeSymbol("_CSETF-TRIE-TOP-NODE");
        $sym14$TRIE_UNIQUE = SubLObjectFactory.makeSymbol("TRIE-UNIQUE");
        $sym15$_CSETF_TRIE_UNIQUE = SubLObjectFactory.makeSymbol("_CSETF-TRIE-UNIQUE");
        $sym16$TRIE_CASE_SENSITIVE = SubLObjectFactory.makeSymbol("TRIE-CASE-SENSITIVE");
        $sym17$_CSETF_TRIE_CASE_SENSITIVE = SubLObjectFactory.makeSymbol("_CSETF-TRIE-CASE-SENSITIVE");
        $sym18$TRIE_ENTRY_TEST_FUNC = SubLObjectFactory.makeSymbol("TRIE-ENTRY-TEST-FUNC");
        $sym19$_CSETF_TRIE_ENTRY_TEST_FUNC = SubLObjectFactory.makeSymbol("_CSETF-TRIE-ENTRY-TEST-FUNC");
        $sym20$TRIE_MULTI = SubLObjectFactory.makeSymbol("TRIE-MULTI");
        $sym21$_CSETF_TRIE_MULTI = SubLObjectFactory.makeSymbol("_CSETF-TRIE-MULTI");
        $sym22$TRIE_MULTI_KEYS = SubLObjectFactory.makeSymbol("TRIE-MULTI-KEYS");
        $sym23$_CSETF_TRIE_MULTI_KEYS = SubLObjectFactory.makeSymbol("_CSETF-TRIE-MULTI-KEYS");
        $sym24$TRIE_MULTI_KEY_FUNC = SubLObjectFactory.makeSymbol("TRIE-MULTI-KEY-FUNC");
        $sym25$_CSETF_TRIE_MULTI_KEY_FUNC = SubLObjectFactory.makeSymbol("_CSETF-TRIE-MULTI-KEY-FUNC");
        $kw26$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw27$TOP_NODE = SubLObjectFactory.makeKeyword("TOP-NODE");
        $kw28$UNIQUE = SubLObjectFactory.makeKeyword("UNIQUE");
        $kw29$CASE_SENSITIVE = SubLObjectFactory.makeKeyword("CASE-SENSITIVE");
        $kw30$ENTRY_TEST_FUNC = SubLObjectFactory.makeKeyword("ENTRY-TEST-FUNC");
        $kw31$MULTI = SubLObjectFactory.makeKeyword("MULTI");
        $kw32$MULTI_KEYS = SubLObjectFactory.makeKeyword("MULTI-KEYS");
        $kw33$MULTI_KEY_FUNC = SubLObjectFactory.makeKeyword("MULTI-KEY-FUNC");
        $str34$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw35$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym36$MAKE_TRIE = SubLObjectFactory.makeSymbol("MAKE-TRIE");
        $kw37$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw38$END = SubLObjectFactory.makeKeyword("END");
        $sym39$VISIT_DEFSTRUCT_OBJECT_TRIE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRIE-METHOD");
        $str40$__TRIE = SubLObjectFactory.makeString("#<TRIE");
        $str41$__A = SubLObjectFactory.makeString(" ~A");
        $str42$_UNIQUE = SubLObjectFactory.makeString(" UNIQUE");
        $str43$_SENSITIVE = SubLObjectFactory.makeString(" SENSITIVE");
        $str44$_INSENSITIVE = SubLObjectFactory.makeString(" INSENSITIVE");
        $str45$__S = SubLObjectFactory.makeString(" ~S");
        $str46$_ = SubLObjectFactory.makeString(">");
        $str47$TRIE_resource_lock = SubLObjectFactory.makeString("TRIE resource lock");
        $kw48$FREE = SubLObjectFactory.makeKeyword("FREE");
        $kw49$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str50$_m___S = SubLObjectFactory.makeString("<m> ~S");
        $str51$_____S = SubLObjectFactory.makeString(" :  ~S");
        $sym52$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str53$There_is_already_an_object__S_not = SubLObjectFactory.makeString("There is already an object ~S not ~S to ~S in the trie!");
        $str54$Remove_it_anyway = SubLObjectFactory.makeString("Remove it anyway");
        $str55$The_object_found_in_trie_for__S_i = SubLObjectFactory.makeString("The object found in trie for ~S is ~S, not ~S");
        $str56$TRIE__S_does_not_have_unique_entr = SubLObjectFactory.makeString("TRIE ~S does not have unique entries");
        $int57$1000 = SubLObjectFactory.makeInteger(1000);
        $str58$_S_will_result_in_a_search_that_i = SubLObjectFactory.makeString("~S will result in a search that is larger than the maximum search size of ~S");
        $kw59$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORWARD"), (SubLObject)tries.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $kw62$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw63$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw64$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $sym65$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym66$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym67$NEW_TRIE_ITERATOR = SubLObjectFactory.makeSymbol("NEW-TRIE-ITERATOR");
        $sym68$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $sym69$TRIE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("TRIE-ITERATOR-DONE");
        $sym70$TRIE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("TRIE-ITERATOR-NEXT");
        $sym71$TRIE_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("TRIE-ITERATOR-FINALIZE");
        $str72$Ancestor_Tracking_Resource = SubLObjectFactory.makeString("Ancestor Tracking Resource");
        $int73$100 = SubLObjectFactory.makeInteger(100);
        $kw74$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $sym75$MULTI_TRIE_P = SubLObjectFactory.makeSymbol("MULTI-TRIE-P");
        $list76 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTRIE"));
        $str77$_A__A = SubLObjectFactory.makeString("~A:~A");
        $sym78$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list79 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MARK"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTRIE"));
        $str80$___S_sub_tries = SubLObjectFactory.makeString("~%~S sub-tries");
        $str81$____Sub_Trie__S = SubLObjectFactory.makeString("~%~%Sub-Trie ~S");
        $sym82$TRIE_LEAF_NODE_P = SubLObjectFactory.makeSymbol("TRIE-LEAF-NODE-P");
    }
    
    public static final class $trie_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $top_node;
        public SubLObject $unique;
        public SubLObject $case_sensitive;
        public SubLObject $entry_test_func;
        public SubLObject $multi;
        public SubLObject $multi_keys;
        public SubLObject $multi_key_func;
        private static final SubLStructDeclNative structDecl;
        
        public $trie_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$top_node = (SubLObject)CommonSymbols.NIL;
            this.$unique = (SubLObject)CommonSymbols.NIL;
            this.$case_sensitive = (SubLObject)CommonSymbols.NIL;
            this.$entry_test_func = (SubLObject)CommonSymbols.NIL;
            this.$multi = (SubLObject)CommonSymbols.NIL;
            this.$multi_keys = (SubLObject)CommonSymbols.NIL;
            this.$multi_key_func = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$trie_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$top_node;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$unique;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$case_sensitive;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$entry_test_func;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$multi;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$multi_keys;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$multi_key_func;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$top_node = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$unique = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$case_sensitive = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$entry_test_func = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$multi = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$multi_keys = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$multi_key_func = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$trie_native.class, tries.$sym1$TRIE, tries.$sym2$TRIE_P, tries.$list3, tries.$list4, new String[] { "$name", "$top_node", "$unique", "$case_sensitive", "$entry_test_func", "$multi", "$multi_keys", "$multi_key_func" }, tries.$list5, tries.$list6, tries.$sym7$PRINT_TRIE);
        }
    }
    
    public static final class $trie_p$UnaryFunction extends UnaryFunction
    {
        public $trie_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TRIE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return tries.trie_p(arg1);
        }
    }
}

/*

	Total time: 658 ms
	
*/