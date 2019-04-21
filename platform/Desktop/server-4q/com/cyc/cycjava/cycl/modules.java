package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class modules extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.modules";
    public static final String myFingerPrint = "275979802cb485ca4f7a11bbeead3ab8529bad07852cae77684b18f6fcb2f5af";
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 1240L)
    private static SubLSymbol $module_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 1404L)
    private static SubLSymbol $system_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLSymbol $dtp_module$;
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 4347L)
    private static SubLSymbol $module_index$;
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLSymbol $dtp_system$;
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12979L)
    private static SubLSymbol $system_index$;
    private static final SubLString $str0$Module_Lock;
    private static final SubLSymbol $sym1$WITH_LOCK_HELD;
    private static final SubLList $list2;
    private static final SubLString $str3$System_Lock;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$MODULE;
    private static final SubLSymbol $sym6$MODULE_P;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$PRINT_MODULE;
    private static final SubLSymbol $sym12$MODULE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$MODULE_BASIS;
    private static final SubLSymbol $sym15$_CSETF_MODULE_BASIS;
    private static final SubLSymbol $sym16$MODULE_NAME;
    private static final SubLSymbol $sym17$_CSETF_MODULE_NAME;
    private static final SubLSymbol $sym18$MODULE_SYSTEM;
    private static final SubLSymbol $sym19$_CSETF_MODULE_SYSTEM;
    private static final SubLSymbol $sym20$MODULE_PATHNAME;
    private static final SubLSymbol $sym21$_CSETF_MODULE_PATHNAME;
    private static final SubLSymbol $sym22$MODULE_TEST_CASES;
    private static final SubLSymbol $sym23$_CSETF_MODULE_TEST_CASES;
    private static final SubLSymbol $sym24$MODULE_TEST_SUITES;
    private static final SubLSymbol $sym25$_CSETF_MODULE_TEST_SUITES;
    private static final SubLSymbol $sym26$MODULE_PROVISIONAL_P;
    private static final SubLSymbol $sym27$_CSETF_MODULE_PROVISIONAL_P;
    private static final SubLSymbol $kw28$BASIS;
    private static final SubLSymbol $kw29$NAME;
    private static final SubLSymbol $kw30$SYSTEM;
    private static final SubLSymbol $kw31$PATHNAME;
    private static final SubLSymbol $kw32$TEST_CASES;
    private static final SubLSymbol $kw33$TEST_SUITES;
    private static final SubLSymbol $kw34$PROVISIONAL_P;
    private static final SubLString $str35$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw36$BEGIN;
    private static final SubLSymbol $sym37$MAKE_MODULE;
    private static final SubLSymbol $kw38$SLOT;
    private static final SubLSymbol $kw39$END;
    private static final SubLSymbol $sym40$VISIT_DEFSTRUCT_OBJECT_MODULE_METHOD;
    private static final SubLString $str41$_S_in__S;
    private static final SubLSymbol $sym42$SXHASH_MODULE_METHOD;
    private static final SubLSymbol $sym43$_MODULE_INDEX_;
    private static final SubLInteger $int44$1024;
    private static final SubLSymbol $sym45$STRINGP;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLSymbol $kw48$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw49$MESSAGE;
    private static final SubLString $str50$mapping_modules;
    private static final SubLSymbol $sym51$MODULE_REF;
    private static final SubLSymbol $sym52$MODULE_NAME;
    private static final SubLSymbol $sym53$SYSTEM_NAME;
    private static final SubLSymbol $sym54$PROGN;
    private static final SubLSymbol $sym55$PWHEN;
    private static final SubLSymbol $sym56$PUNLESS;
    private static final SubLSymbol $sym57$SYSTEM_P;
    private static final SubLSymbol $sym58$SYSTEM_LOOKUP;
    private static final SubLSymbol $sym59$ERROR;
    private static final SubLString $str60$_A_is_not_a_known_system_name_;
    private static final SubLSymbol $sym61$PROGRESS_CDOHASH;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym64$IGNORE;
    private static final SubLSymbol $sym65$COR;
    private static final SubLSymbol $sym66$NULL;
    private static final SubLSymbol $sym67$CAND;
    private static final SubLSymbol $sym68$MODULE_GET_INDEX;
    private static final SubLSymbol $sym69$DO_MODULES;
    private static final SubLString $str70$_A_is_not_the_name_of_a_known_sys;
    private static final SubLSymbol $sym71$SYMBOLP;
    private static final SubLSymbol $sym72$SYSTEM;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$PRINT_SYSTEM;
    private static final SubLSymbol $sym78$SYSTEM_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$SYSTEM_BASIS;
    private static final SubLSymbol $sym81$_CSETF_SYSTEM_BASIS;
    private static final SubLSymbol $sym82$SYSTEM_NAME;
    private static final SubLSymbol $sym83$_CSETF_SYSTEM_NAME;
    private static final SubLSymbol $sym84$SYSTEM_DEFAULT_PATHNAME;
    private static final SubLSymbol $sym85$_CSETF_SYSTEM_DEFAULT_PATHNAME;
    private static final SubLSymbol $sym86$SYSTEM_MODULES;
    private static final SubLSymbol $sym87$_CSETF_SYSTEM_MODULES;
    private static final SubLSymbol $sym88$SYSTEM_PROVISIONAL_P;
    private static final SubLSymbol $sym89$_CSETF_SYSTEM_PROVISIONAL_P;
    private static final SubLSymbol $kw90$DEFAULT_PATHNAME;
    private static final SubLSymbol $kw91$MODULES;
    private static final SubLSymbol $sym92$MAKE_SYSTEM;
    private static final SubLSymbol $sym93$VISIT_DEFSTRUCT_OBJECT_SYSTEM_METHOD;
    private static final SubLString $str94$System__S;
    private static final SubLSymbol $sym95$SXHASH_SYSTEM_METHOD;
    private static final SubLSymbol $sym96$_SYSTEM_INDEX_;
    private static final SubLSymbol $sym97$SYSTEM_GET_NAME;
    private static final SubLString $str98$_A_is_already_the_name_of_a_known;
    private static final SubLList $list99;
    private static final SubLSymbol $kw100$COMMON_LISP;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$CDOLIST;
    private static final SubLSymbol $sym104$NAME;
    private static final SubLSymbol $sym105$QUOTE;
    private static final SubLSymbol $sym106$CREATE_MODULE;
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 1302L)
    public static SubLObject with_module_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)modules.$sym1$WITH_LOCK_HELD, (SubLObject)modules.$list2, ConsesLow.append(body, (SubLObject)modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 1466L)
    public static SubLObject with_system_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)modules.$sym1$WITH_LOCK_HELD, (SubLObject)modules.$list4, ConsesLow.append(body, (SubLObject)modules.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_module(v_object, stream, (SubLObject)modules.ZERO_INTEGER);
        return (SubLObject)modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject module_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $module_native.class) ? modules.T : modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject module_basis(final SubLObject v_object) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject module_name(final SubLObject v_object) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject module_system(final SubLObject v_object) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject module_pathname(final SubLObject v_object) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject module_test_cases(final SubLObject v_object) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject module_test_suites(final SubLObject v_object) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject module_provisional_p(final SubLObject v_object) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject _csetf_module_basis(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject _csetf_module_name(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject _csetf_module_system(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject _csetf_module_pathname(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject _csetf_module_test_cases(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject _csetf_module_test_suites(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject _csetf_module_provisional_p(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != module_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject make_module(SubLObject arglist) {
        if (arglist == modules.UNPROVIDED) {
            arglist = (SubLObject)modules.NIL;
        }
        final SubLObject v_new = (SubLObject)new $module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)modules.NIL, next = arglist; modules.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)modules.$kw28$BASIS)) {
                _csetf_module_basis(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)modules.$kw29$NAME)) {
                _csetf_module_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)modules.$kw30$SYSTEM)) {
                _csetf_module_system(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)modules.$kw31$PATHNAME)) {
                _csetf_module_pathname(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)modules.$kw32$TEST_CASES)) {
                _csetf_module_test_cases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)modules.$kw33$TEST_SUITES)) {
                _csetf_module_test_suites(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)modules.$kw34$PROVISIONAL_P)) {
                _csetf_module_provisional_p(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)modules.$str35$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject visit_defstruct_module(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw36$BEGIN, (SubLObject)modules.$sym37$MAKE_MODULE, (SubLObject)modules.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw28$BASIS, module_basis(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw29$NAME, module_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw30$SYSTEM, module_system(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw31$PATHNAME, module_pathname(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw32$TEST_CASES, module_test_cases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw33$TEST_SUITES, module_test_suites(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw34$PROVISIONAL_P, module_provisional_p(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw39$END, (SubLObject)modules.$sym37$MAKE_MODULE, (SubLObject)modules.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 2784L)
    public static SubLObject visit_defstruct_object_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_module(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 3858L)
    public static SubLObject print_module(final SubLObject module, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module_name = module_get_name(module);
        final SubLObject system_name = module_get_system(module);
        if (modules.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(module, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, module, (SubLObject)modules.T, (SubLObject)modules.T);
            PrintLow.format(stream, (SubLObject)modules.$str41$_S_in__S, module_name, system_name);
            print_macros.print_unreadable_object_postamble(stream, module, (SubLObject)modules.NIL, (SubLObject)modules.NIL);
        }
        return module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 4147L)
    public static SubLObject sxhash_module_method(final SubLObject v_object) {
        return Numbers.logxor(Sxhash.sxhash(module_get_name(v_object)), Sxhash.sxhash(module_get_system(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 4478L)
    public static SubLObject module_store(final SubLObject module) {
        final SubLObject entry = (SubLObject)ConsesLow.list(module_get_name(module), module_get_system(module));
        SubLObject v_answer = (SubLObject)modules.NIL;
        SubLObject release = (SubLObject)modules.NIL;
        try {
            release = Locks.seize_lock(modules.$module_lock$.getGlobalValue());
            v_answer = Hashtables.sethash(entry, modules.$module_index$.getGlobalValue(), module);
        }
        finally {
            if (modules.NIL != release) {
                Locks.release_lock(modules.$module_lock$.getGlobalValue());
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 4704L)
    public static SubLObject module_remove(final SubLObject module) {
        final SubLObject entry = (SubLObject)ConsesLow.list(module_get_name(module), module_get_system(module));
        SubLObject v_answer = (SubLObject)modules.NIL;
        SubLObject release = (SubLObject)modules.NIL;
        try {
            release = Locks.seize_lock(modules.$module_lock$.getGlobalValue());
            v_answer = Hashtables.remhash(entry, modules.$module_index$.getGlobalValue());
        }
        finally {
            if (modules.NIL != release) {
                Locks.release_lock(modules.$module_lock$.getGlobalValue());
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 4924L)
    public static SubLObject module_lookup(final SubLObject module_name, final SubLObject system_name) {
        assert modules.NIL != Types.stringp(module_name) : module_name;
        assert modules.NIL != Types.stringp(system_name) : system_name;
        final SubLObject entry = (SubLObject)ConsesLow.list(module_name, system_name);
        final SubLObject module = Hashtables.gethash(entry, modules.$module_index$.getGlobalValue(), (SubLObject)modules.UNPROVIDED);
        return module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 5160L)
    public static SubLObject all_modules() {
        return hash_table_utilities.hash_table_values(modules.$module_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 5276L)
    public static SubLObject do_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)modules.$list46);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)modules.$list46);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)modules.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)modules.NIL;
        SubLObject current_$1 = (SubLObject)modules.NIL;
        while (modules.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)modules.$list46);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)modules.$list46);
            if (modules.NIL == conses_high.member(current_$1, (SubLObject)modules.$list47, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED)) {
                bad = (SubLObject)modules.T;
            }
            if (current_$1 == modules.$kw48$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (modules.NIL != bad && modules.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)modules.$list46);
        }
        final SubLObject system_tail = cdestructuring_bind.property_list_member((SubLObject)modules.$kw30$SYSTEM, current);
        final SubLObject system = (SubLObject)((modules.NIL != system_tail) ? conses_high.cadr(system_tail) : modules.NIL);
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)modules.$kw49$MESSAGE, current);
        final SubLObject message = (SubLObject)((modules.NIL != message_tail) ? conses_high.cadr(message_tail) : modules.$str50$mapping_modules);
        final SubLObject body;
        current = (body = temp);
        final SubLObject module_ref = (SubLObject)modules.$sym51$MODULE_REF;
        final SubLObject module_name = (SubLObject)modules.$sym52$MODULE_NAME;
        final SubLObject system_name = (SubLObject)modules.$sym53$SYSTEM_NAME;
        return (SubLObject)ConsesLow.list((SubLObject)modules.$sym54$PROGN, (SubLObject)ConsesLow.list((SubLObject)modules.$sym55$PWHEN, (SubLObject)ConsesLow.list((SubLObject)modules.$sym45$STRINGP, system), (SubLObject)ConsesLow.list((SubLObject)modules.$sym56$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)modules.$sym57$SYSTEM_P, (SubLObject)ConsesLow.list((SubLObject)modules.$sym58$SYSTEM_LOOKUP, system)), (SubLObject)ConsesLow.list((SubLObject)modules.$sym59$ERROR, (SubLObject)modules.$str60$_A_is_not_a_known_system_name_, system))), (SubLObject)ConsesLow.list((SubLObject)modules.$sym61$PROGRESS_CDOHASH, (SubLObject)ConsesLow.list(module_ref, var, (SubLObject)modules.$list62, message), (SubLObject)ConsesLow.list((SubLObject)modules.$sym63$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(module_name, system_name), module_ref, (SubLObject)ConsesLow.list((SubLObject)modules.$sym64$IGNORE, module_name), (SubLObject)ConsesLow.listS((SubLObject)modules.$sym55$PWHEN, (SubLObject)ConsesLow.list((SubLObject)modules.$sym65$COR, (SubLObject)ConsesLow.list((SubLObject)modules.$sym66$NULL, system), (SubLObject)ConsesLow.list((SubLObject)modules.$sym67$CAND, system, (SubLObject)ConsesLow.list((SubLObject)modules.EQUAL, system_name, system))), ConsesLow.append(body, (SubLObject)modules.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 6008L)
    public static SubLObject module_get_index() {
        return modules.$module_index$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 6096L)
    public static SubLObject module_new(SubLObject name, SubLObject system_name, SubLObject provisional_p, SubLObject pathname) {
        if (provisional_p == modules.UNPROVIDED) {
            provisional_p = (SubLObject)modules.NIL;
        }
        if (pathname == modules.UNPROVIDED) {
            pathname = (SubLObject)modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert modules.NIL != Types.stringp(name) : name;
        assert modules.NIL != Types.stringp(system_name) : system_name;
        final SubLObject system = system_lookup(system_name);
        if (modules.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && modules.NIL == system_p(system)) {
            Errors.error((SubLObject)modules.$str70$_A_is_not_the_name_of_a_known_sys, system_name);
        }
        name = Strings.string_downcase(name, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED);
        system_name = Strings.string_downcase(system_name, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED);
        final SubLObject v_new = make_module((SubLObject)modules.UNPROVIDED);
        _csetf_module_name(v_new, name);
        _csetf_module_system(v_new, system_name);
        module_store(v_new);
        system_add_module(system, v_new);
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 7284L)
    public static SubLObject ensure_provisional_module(final SubLObject module_name, final SubLObject system_name, final SubLObject pathname) {
        return (SubLObject)modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 8249L)
    public static SubLObject create_provisional_module(final SubLObject module_name, final SubLObject system_name, final SubLObject pathname) {
        return module_new(module_name, system_name, (SubLObject)modules.T, pathname);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 8556L)
    public static SubLObject create_module(final SubLObject module_name, final SubLObject system_name) {
        assert modules.NIL != Types.stringp(module_name) : module_name;
        assert modules.NIL != Types.stringp(system_name) : system_name;
        return module_new(module_name, system_name, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 8773L)
    public static SubLObject module_get_name(final SubLObject module) {
        assert modules.NIL != module_p(module) : module;
        return module_name(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 9178L)
    public static SubLObject module_get_system(final SubLObject module) {
        assert modules.NIL != module_p(module) : module;
        return module_system(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 9537L)
    public static SubLObject module_get_pathname(final SubLObject module) {
        assert modules.NIL != module_p(module) : module;
        return module_pathname(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 9825L)
    public static SubLObject module_add_test_case(final SubLObject module, final SubLObject test_case_symbol) {
        assert modules.NIL != module_p(module) : module;
        assert modules.NIL != Types.symbolp(test_case_symbol) : test_case_symbol;
        SubLObject release = (SubLObject)modules.NIL;
        try {
            release = Locks.seize_lock(modules.$module_lock$.getGlobalValue());
            if (modules.NIL == conses_high.member(test_case_symbol, module_test_cases(module), Symbols.symbol_function((SubLObject)modules.EQL), Symbols.symbol_function((SubLObject)modules.IDENTITY))) {
                _csetf_module_test_cases(module, (SubLObject)ConsesLow.cons(test_case_symbol, module_test_cases(module)));
            }
        }
        finally {
            if (modules.NIL != release) {
                Locks.release_lock(modules.$module_lock$.getGlobalValue());
            }
        }
        return module_test_cases(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 10464L)
    public static SubLObject module_remove_test_case(final SubLObject module, final SubLObject test_case_symbol) {
        assert modules.NIL != module_p(module) : module;
        assert modules.NIL != Types.symbolp(test_case_symbol) : test_case_symbol;
        SubLObject release = (SubLObject)modules.NIL;
        try {
            release = Locks.seize_lock(modules.$module_lock$.getGlobalValue());
            _csetf_module_test_cases(module, Sequences.delete(test_case_symbol, module_test_cases(module), (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED));
        }
        finally {
            if (modules.NIL != release) {
                Locks.release_lock(modules.$module_lock$.getGlobalValue());
            }
        }
        return module_test_cases(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 10754L)
    public static SubLObject module_get_test_cases(final SubLObject module) {
        assert modules.NIL != module_p(module) : module;
        return module_test_cases(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 10868L)
    public static SubLObject module_add_test_suite(final SubLObject module, final SubLObject test_suite_name) {
        assert modules.NIL != module_p(module) : module;
        assert modules.NIL != Types.stringp(test_suite_name) : test_suite_name;
        SubLObject release = (SubLObject)modules.NIL;
        try {
            release = Locks.seize_lock(modules.$module_lock$.getGlobalValue());
            if (modules.NIL == conses_high.member(test_suite_name, module_test_suites(module), Symbols.symbol_function((SubLObject)modules.EQUAL), Symbols.symbol_function((SubLObject)modules.IDENTITY))) {
                _csetf_module_test_suites(module, (SubLObject)ConsesLow.cons(test_suite_name, module_test_suites(module)));
            }
        }
        finally {
            if (modules.NIL != release) {
                Locks.release_lock(modules.$module_lock$.getGlobalValue());
            }
        }
        return module_test_suites(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 11169L)
    public static SubLObject module_remove_test_suite(final SubLObject module, final SubLObject test_suite_name) {
        assert modules.NIL != module_p(module) : module;
        assert modules.NIL != Types.stringp(test_suite_name) : test_suite_name;
        SubLObject release = (SubLObject)modules.NIL;
        try {
            release = Locks.seize_lock(modules.$module_lock$.getGlobalValue());
            _csetf_module_test_suites(module, Sequences.delete(test_suite_name, module_test_suites(module), Symbols.symbol_function((SubLObject)modules.EQUAL), (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED));
        }
        finally {
            if (modules.NIL != release) {
                Locks.release_lock(modules.$module_lock$.getGlobalValue());
            }
        }
        return module_test_suites(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 11514L)
    public static SubLObject module_get_test_suites(final SubLObject module) {
        assert modules.NIL != module_p(module) : module;
        return module_test_suites(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 11630L)
    public static SubLObject module_get_provisional_p(final SubLObject module) {
        assert modules.NIL != module_p(module) : module;
        return module_provisional_p(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject system_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_system(v_object, stream, (SubLObject)modules.ZERO_INTEGER);
        return (SubLObject)modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject system_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $system_native.class) ? modules.T : modules.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject system_basis(final SubLObject v_object) {
        assert modules.NIL != system_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject system_name(final SubLObject v_object) {
        assert modules.NIL != system_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject system_default_pathname(final SubLObject v_object) {
        assert modules.NIL != system_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject system_modules(final SubLObject v_object) {
        assert modules.NIL != system_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject system_provisional_p(final SubLObject v_object) {
        assert modules.NIL != system_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject _csetf_system_basis(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != system_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject _csetf_system_name(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != system_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject _csetf_system_default_pathname(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != system_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject _csetf_system_modules(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != system_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject _csetf_system_provisional_p(final SubLObject v_object, final SubLObject value) {
        assert modules.NIL != system_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject make_system(SubLObject arglist) {
        if (arglist == modules.UNPROVIDED) {
            arglist = (SubLObject)modules.NIL;
        }
        final SubLObject v_new = (SubLObject)new $system_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)modules.NIL, next = arglist; modules.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)modules.$kw28$BASIS)) {
                _csetf_system_basis(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)modules.$kw29$NAME)) {
                _csetf_system_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)modules.$kw90$DEFAULT_PATHNAME)) {
                _csetf_system_default_pathname(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)modules.$kw91$MODULES)) {
                _csetf_system_modules(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)modules.$kw34$PROVISIONAL_P)) {
                _csetf_system_provisional_p(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)modules.$str35$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject visit_defstruct_system(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw36$BEGIN, (SubLObject)modules.$sym92$MAKE_SYSTEM, (SubLObject)modules.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw28$BASIS, system_basis(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw29$NAME, system_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw90$DEFAULT_PATHNAME, system_default_pathname(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw91$MODULES, system_modules(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw38$SLOT, (SubLObject)modules.$kw34$PROVISIONAL_P, system_provisional_p(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)modules.$kw39$END, (SubLObject)modules.$sym92$MAKE_SYSTEM, (SubLObject)modules.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12010L)
    public static SubLObject visit_defstruct_object_system_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_system(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12657L)
    public static SubLObject print_system(final SubLObject system, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject system_name = system_get_name(system);
        if (modules.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(system, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, system, (SubLObject)modules.T, (SubLObject)modules.T);
            PrintLow.format(stream, (SubLObject)modules.$str94$System__S, system_name);
            print_macros.print_unreadable_object_postamble(stream, system, (SubLObject)modules.NIL, (SubLObject)modules.NIL);
        }
        return system;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 12895L)
    public static SubLObject sxhash_system_method(final SubLObject v_object) {
        return Sxhash.sxhash(system_get_name(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 13081L)
    public static SubLObject system_store(final SubLObject system) {
        SubLObject release = (SubLObject)modules.NIL;
        try {
            release = Locks.seize_lock(modules.$system_lock$.getGlobalValue());
            if (modules.NIL == conses_high.member(system, modules.$system_index$.getGlobalValue(), Symbols.symbol_function((SubLObject)modules.EQL), Symbols.symbol_function((SubLObject)modules.IDENTITY))) {
                modules.$system_index$.setGlobalValue((SubLObject)ConsesLow.cons(system, modules.$system_index$.getGlobalValue()));
            }
        }
        finally {
            if (modules.NIL != release) {
                Locks.release_lock(modules.$system_lock$.getGlobalValue());
            }
        }
        return (SubLObject)modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 13191L)
    public static SubLObject system_remove(final SubLObject system) {
        SubLObject release = (SubLObject)modules.NIL;
        try {
            release = Locks.seize_lock(modules.$system_lock$.getGlobalValue());
            modules.$system_index$.setGlobalValue(Sequences.remove(system, modules.$system_index$.getGlobalValue(), (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED));
        }
        finally {
            if (modules.NIL != release) {
                Locks.release_lock(modules.$system_lock$.getGlobalValue());
            }
        }
        return (SubLObject)modules.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 13323L)
    public static SubLObject system_lookup(final SubLObject system_name) {
        assert modules.NIL != Types.stringp(system_name) : system_name;
        return Sequences.find(system_name, modules.$system_index$.getGlobalValue(), Symbols.symbol_function((SubLObject)modules.EQUAL), Symbols.symbol_function((SubLObject)modules.$sym97$SYSTEM_GET_NAME), (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 13471L)
    public static SubLObject all_systems() {
        return modules.$system_index$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 13526L)
    public static SubLObject system_new(SubLObject system_name, SubLObject provisional_p, SubLObject default_pathname) {
        if (provisional_p == modules.UNPROVIDED) {
            provisional_p = (SubLObject)modules.NIL;
        }
        if (default_pathname == modules.UNPROVIDED) {
            default_pathname = (SubLObject)modules.NIL;
        }
        assert modules.NIL != Types.stringp(system_name) : system_name;
        system_name = Strings.string_downcase(system_name, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED);
        final SubLObject v_new = make_system((SubLObject)modules.UNPROVIDED);
        _csetf_system_name(v_new, system_name);
        system_store(v_new);
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 14363L)
    public static SubLObject ensure_provisional_system(final SubLObject system_name, final SubLObject default_pathname) {
        assert modules.NIL != Types.stringp(system_name) : system_name;
        assert modules.NIL != Types.stringp(default_pathname) : default_pathname;
        final SubLObject existing_system = system_lookup(system_name);
        if (modules.NIL != system_p(existing_system)) {
            return existing_system;
        }
        return create_provisional_system(system_name, default_pathname);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 15032L)
    public static SubLObject create_provisional_system(final SubLObject system_name, final SubLObject default_pathname) {
        assert modules.NIL != Types.stringp(system_name) : system_name;
        assert modules.NIL != Types.stringp(default_pathname) : default_pathname;
        final SubLObject existing_system = system_lookup(system_name);
        if (modules.NIL != system_p(existing_system)) {
            Errors.error((SubLObject)modules.$str98$_A_is_already_the_name_of_a_known, system_name);
            return (SubLObject)modules.NIL;
        }
        return system_new(system_name, (SubLObject)modules.T, default_pathname);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 15561L)
    public static SubLObject create_system(final SubLObject system_name) {
        assert modules.NIL != Types.stringp(system_name) : system_name;
        return system_new(system_name, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 15718L)
    public static SubLObject system_get_name(final SubLObject system) {
        assert modules.NIL != system_p(system) : system;
        return system_name(system);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 16141L)
    public static SubLObject system_get_default_pathname(final SubLObject system) {
        assert modules.NIL != system_p(system) : system;
        return system_default_pathname(system);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 16460L)
    public static SubLObject system_get_modules(final SubLObject system, SubLObject include_provisional_modules) {
        if (include_provisional_modules == modules.UNPROVIDED) {
            include_provisional_modules = (SubLObject)modules.NIL;
        }
        assert modules.NIL != system_p(system) : system;
        return Sequences.reverse(system_modules(system));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 17167L)
    public static SubLObject system_add_module(final SubLObject system, final SubLObject module) {
        assert modules.NIL != system_p(system) : system;
        assert modules.NIL != module_p(module) : module;
        SubLObject release = (SubLObject)modules.NIL;
        try {
            release = Locks.seize_lock(modules.$system_lock$.getGlobalValue());
            _csetf_system_modules(system, conses_high.adjoin(module, system_modules(system), (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED));
        }
        finally {
            if (modules.NIL != release) {
                Locks.release_lock(modules.$system_lock$.getGlobalValue());
            }
        }
        return system_modules(system);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 17512L)
    public static SubLObject system_remove_module(final SubLObject system, final SubLObject module) {
        assert modules.NIL != system_p(system) : system;
        assert modules.NIL != module_p(module) : module;
        SubLObject release = (SubLObject)modules.NIL;
        try {
            release = Locks.seize_lock(modules.$system_lock$.getGlobalValue());
            _csetf_system_modules(system, Sequences.delete(module, system_modules(system), (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED));
        }
        finally {
            if (modules.NIL != release) {
                Locks.release_lock(modules.$system_lock$.getGlobalValue());
            }
        }
        return system_modules(system);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 17860L)
    public static SubLObject system_get_provisional_p(final SubLObject system) {
        assert modules.NIL != system_p(system) : system;
        return system_provisional_p(system);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 18123L)
    public static SubLObject system_module_names(final SubLObject system_name, SubLObject include_provisional) {
        if (include_provisional == modules.UNPROVIDED) {
            include_provisional = (SubLObject)modules.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject system = system_lookup(system_name);
        if (modules.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && modules.NIL == system_p(system)) {
            Errors.error((SubLObject)modules.$str70$_A_is_not_the_name_of_a_known_sys, system_name);
        }
        SubLObject result = (SubLObject)modules.NIL;
        if (modules.NIL != system_p(system)) {
            SubLObject cdolist_list_var = system_get_modules(system, (SubLObject)modules.UNPROVIDED);
            SubLObject module = (SubLObject)modules.NIL;
            module = cdolist_list_var.first();
            while (modules.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(module_get_name(module), result);
                cdolist_list_var = cdolist_list_var.rest();
                module = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 21987L)
    public static SubLObject system_names(SubLObject include_provisional) {
        if (include_provisional == modules.UNPROVIDED) {
            include_provisional = (SubLObject)modules.NIL;
        }
        final SubLObject all_systems = all_systems();
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)modules.$sym97$SYSTEM_GET_NAME), all_systems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/modules.lisp", position = 22656L)
    public static SubLObject note_translated_modules(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject system_name = (SubLObject)modules.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)modules.$list99);
        system_name = current.first();
        current = current.rest();
        if (modules.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)modules.$list99);
            return (SubLObject)modules.NIL;
        }
        if (modules.NIL != Sequences.find((SubLObject)modules.$kw100$COMMON_LISP, reader.$features$.getDynamicValue(thread), (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED, (SubLObject)modules.UNPROVIDED)) {
            return (SubLObject)modules.$list101;
        }
        final SubLObject v_modules = system_get_modules(system_lookup(system_name), (SubLObject)modules.UNPROVIDED);
        SubLObject module_names = (SubLObject)modules.NIL;
        SubLObject cdolist_list_var = v_modules;
        SubLObject module = (SubLObject)modules.NIL;
        module = cdolist_list_var.first();
        while (modules.NIL != cdolist_list_var) {
            final SubLObject name = module_get_name(module);
            module_names = (SubLObject)ConsesLow.cons(name, module_names);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        }
        module_names = Sequences.nreverse(module_names);
        return (SubLObject)ConsesLow.list((SubLObject)modules.$sym54$PROGN, (SubLObject)modules.$list102, (SubLObject)ConsesLow.list((SubLObject)modules.$sym103$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)modules.$sym104$NAME, (SubLObject)ConsesLow.list((SubLObject)modules.$sym105$QUOTE, module_names)), (SubLObject)ConsesLow.list((SubLObject)modules.$sym106$CREATE_MODULE, (SubLObject)modules.$sym104$NAME, system_name)));
    }
    
    public static SubLObject declare_modules_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.modules", "with_module_lock", "WITH-MODULE-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.modules", "with_system_lock", "WITH-SYSTEM-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_print_function_trampoline", "MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_p", "MODULE-P", 1, 0, false);
        new $module_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_basis", "MODULE-BASIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_name", "MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_system", "MODULE-SYSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_pathname", "MODULE-PATHNAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_test_cases", "MODULE-TEST-CASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_test_suites", "MODULE-TEST-SUITES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_provisional_p", "MODULE-PROVISIONAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_module_basis", "_CSETF-MODULE-BASIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_module_name", "_CSETF-MODULE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_module_system", "_CSETF-MODULE-SYSTEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_module_pathname", "_CSETF-MODULE-PATHNAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_module_test_cases", "_CSETF-MODULE-TEST-CASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_module_test_suites", "_CSETF-MODULE-TEST-SUITES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_module_provisional_p", "_CSETF-MODULE-PROVISIONAL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "make_module", "MAKE-MODULE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "visit_defstruct_module", "VISIT-DEFSTRUCT-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "visit_defstruct_object_module_method", "VISIT-DEFSTRUCT-OBJECT-MODULE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "print_module", "PRINT-MODULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "sxhash_module_method", "SXHASH-MODULE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_store", "MODULE-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_remove", "MODULE-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_lookup", "MODULE-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "all_modules", "ALL-MODULES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.modules", "do_modules", "DO-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_get_index", "MODULE-GET-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_new", "MODULE-NEW", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "ensure_provisional_module", "ENSURE-PROVISIONAL-MODULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "create_provisional_module", "CREATE-PROVISIONAL-MODULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "create_module", "CREATE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_get_name", "MODULE-GET-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_get_system", "MODULE-GET-SYSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_get_pathname", "MODULE-GET-PATHNAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_add_test_case", "MODULE-ADD-TEST-CASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_remove_test_case", "MODULE-REMOVE-TEST-CASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_get_test_cases", "MODULE-GET-TEST-CASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_add_test_suite", "MODULE-ADD-TEST-SUITE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_remove_test_suite", "MODULE-REMOVE-TEST-SUITE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_get_test_suites", "MODULE-GET-TEST-SUITES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "module_get_provisional_p", "MODULE-GET-PROVISIONAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_print_function_trampoline", "SYSTEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_p", "SYSTEM-P", 1, 0, false);
        new $system_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_basis", "SYSTEM-BASIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_name", "SYSTEM-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_default_pathname", "SYSTEM-DEFAULT-PATHNAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_modules", "SYSTEM-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_provisional_p", "SYSTEM-PROVISIONAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_system_basis", "_CSETF-SYSTEM-BASIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_system_name", "_CSETF-SYSTEM-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_system_default_pathname", "_CSETF-SYSTEM-DEFAULT-PATHNAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_system_modules", "_CSETF-SYSTEM-MODULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "_csetf_system_provisional_p", "_CSETF-SYSTEM-PROVISIONAL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "make_system", "MAKE-SYSTEM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "visit_defstruct_system", "VISIT-DEFSTRUCT-SYSTEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "visit_defstruct_object_system_method", "VISIT-DEFSTRUCT-OBJECT-SYSTEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "print_system", "PRINT-SYSTEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "sxhash_system_method", "SXHASH-SYSTEM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_store", "SYSTEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_remove", "SYSTEM-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_lookup", "SYSTEM-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "all_systems", "ALL-SYSTEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_new", "SYSTEM-NEW", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "ensure_provisional_system", "ENSURE-PROVISIONAL-SYSTEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "create_provisional_system", "CREATE-PROVISIONAL-SYSTEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "create_system", "CREATE-SYSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_get_name", "SYSTEM-GET-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_get_default_pathname", "SYSTEM-GET-DEFAULT-PATHNAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_get_modules", "SYSTEM-GET-MODULES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_add_module", "SYSTEM-ADD-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_remove_module", "SYSTEM-REMOVE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_get_provisional_p", "SYSTEM-GET-PROVISIONAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_module_names", "SYSTEM-MODULE-NAMES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.modules", "system_names", "SYSTEM-NAMES", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.modules", "note_translated_modules", "NOTE-TRANSLATED-MODULES");
        return (SubLObject)modules.NIL;
    }
    
    public static SubLObject init_modules_file() {
        modules.$module_lock$ = SubLFiles.deflexical("*MODULE-LOCK*", Locks.make_lock((SubLObject)modules.$str0$Module_Lock));
        modules.$system_lock$ = SubLFiles.deflexical("*SYSTEM-LOCK*", Locks.make_lock((SubLObject)modules.$str3$System_Lock));
        modules.$dtp_module$ = SubLFiles.defconstant("*DTP-MODULE*", (SubLObject)modules.$sym5$MODULE);
        modules.$module_index$ = SubLFiles.deflexical("*MODULE-INDEX*", maybeDefault((SubLObject)modules.$sym43$_MODULE_INDEX_, modules.$module_index$, ()->(Hashtables.make_hash_table((SubLObject)modules.$int44$1024, Symbols.symbol_function((SubLObject)modules.EQUALP), (SubLObject)modules.UNPROVIDED))));
        modules.$dtp_system$ = SubLFiles.defconstant("*DTP-SYSTEM*", (SubLObject)modules.$sym72$SYSTEM);
        modules.$system_index$ = SubLFiles.deflexical("*SYSTEM-INDEX*", (SubLObject)(maybeDefault((SubLObject)modules.$sym96$_SYSTEM_INDEX_, modules.$system_index$, modules.NIL)));
        return (SubLObject)modules.NIL;
    }
    
    public static SubLObject setup_modules_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), modules.$dtp_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)modules.$sym12$MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)modules.$list13);
        Structures.def_csetf((SubLObject)modules.$sym14$MODULE_BASIS, (SubLObject)modules.$sym15$_CSETF_MODULE_BASIS);
        Structures.def_csetf((SubLObject)modules.$sym16$MODULE_NAME, (SubLObject)modules.$sym17$_CSETF_MODULE_NAME);
        Structures.def_csetf((SubLObject)modules.$sym18$MODULE_SYSTEM, (SubLObject)modules.$sym19$_CSETF_MODULE_SYSTEM);
        Structures.def_csetf((SubLObject)modules.$sym20$MODULE_PATHNAME, (SubLObject)modules.$sym21$_CSETF_MODULE_PATHNAME);
        Structures.def_csetf((SubLObject)modules.$sym22$MODULE_TEST_CASES, (SubLObject)modules.$sym23$_CSETF_MODULE_TEST_CASES);
        Structures.def_csetf((SubLObject)modules.$sym24$MODULE_TEST_SUITES, (SubLObject)modules.$sym25$_CSETF_MODULE_TEST_SUITES);
        Structures.def_csetf((SubLObject)modules.$sym26$MODULE_PROVISIONAL_P, (SubLObject)modules.$sym27$_CSETF_MODULE_PROVISIONAL_P);
        Equality.identity((SubLObject)modules.$sym5$MODULE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), modules.$dtp_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)modules.$sym40$VISIT_DEFSTRUCT_OBJECT_MODULE_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), modules.$dtp_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)modules.$sym42$SXHASH_MODULE_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)modules.$sym43$_MODULE_INDEX_);
        access_macros.register_macro_helper((SubLObject)modules.$sym68$MODULE_GET_INDEX, (SubLObject)modules.$sym69$DO_MODULES);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), modules.$dtp_system$.getGlobalValue(), Symbols.symbol_function((SubLObject)modules.$sym78$SYSTEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)modules.$list79);
        Structures.def_csetf((SubLObject)modules.$sym80$SYSTEM_BASIS, (SubLObject)modules.$sym81$_CSETF_SYSTEM_BASIS);
        Structures.def_csetf((SubLObject)modules.$sym82$SYSTEM_NAME, (SubLObject)modules.$sym83$_CSETF_SYSTEM_NAME);
        Structures.def_csetf((SubLObject)modules.$sym84$SYSTEM_DEFAULT_PATHNAME, (SubLObject)modules.$sym85$_CSETF_SYSTEM_DEFAULT_PATHNAME);
        Structures.def_csetf((SubLObject)modules.$sym86$SYSTEM_MODULES, (SubLObject)modules.$sym87$_CSETF_SYSTEM_MODULES);
        Structures.def_csetf((SubLObject)modules.$sym88$SYSTEM_PROVISIONAL_P, (SubLObject)modules.$sym89$_CSETF_SYSTEM_PROVISIONAL_P);
        Equality.identity((SubLObject)modules.$sym72$SYSTEM);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), modules.$dtp_system$.getGlobalValue(), Symbols.symbol_function((SubLObject)modules.$sym93$VISIT_DEFSTRUCT_OBJECT_SYSTEM_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), modules.$dtp_system$.getGlobalValue(), Symbols.symbol_function((SubLObject)modules.$sym95$SXHASH_SYSTEM_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)modules.$sym96$_SYSTEM_INDEX_);
        return (SubLObject)modules.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_modules_file();
    }
    
    @Override
	public void initializeVariables() {
        init_modules_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_modules_file();
    }
    
    static {
        me = (SubLFile)new modules();
        modules.$module_lock$ = null;
        modules.$system_lock$ = null;
        modules.$dtp_module$ = null;
        modules.$module_index$ = null;
        modules.$dtp_system$ = null;
        modules.$system_index$ = null;
        $str0$Module_Lock = SubLObjectFactory.makeString("Module Lock");
        $sym1$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MODULE-LOCK*"));
        $str3$System_Lock = SubLObjectFactory.makeString("System Lock");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SYSTEM-LOCK*"));
        $sym5$MODULE = SubLObjectFactory.makeSymbol("MODULE");
        $sym6$MODULE_P = SubLObjectFactory.makeSymbol("MODULE-P");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIS"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM"), (SubLObject)SubLObjectFactory.makeSymbol("PATHNAME"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-CASES"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-SUITES"), (SubLObject)SubLObjectFactory.makeSymbol("PROVISIONAL-P"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BASIS"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SYSTEM"), (SubLObject)SubLObjectFactory.makeKeyword("PATHNAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-CASES"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-SUITES"), (SubLObject)SubLObjectFactory.makeKeyword("PROVISIONAL-P"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE-BASIS"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-SYSTEM"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PATHNAME"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-TEST-CASES"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-TEST-SUITES"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-PROVISIONAL-P"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MODULE-BASIS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MODULE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MODULE-SYSTEM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MODULE-PATHNAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MODULE-TEST-CASES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MODULE-TEST-SUITES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MODULE-PROVISIONAL-P"));
        $sym11$PRINT_MODULE = SubLObjectFactory.makeSymbol("PRINT-MODULE");
        $sym12$MODULE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("MODULE-PRINT-FUNCTION-TRAMPOLINE");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-P"));
        $sym14$MODULE_BASIS = SubLObjectFactory.makeSymbol("MODULE-BASIS");
        $sym15$_CSETF_MODULE_BASIS = SubLObjectFactory.makeSymbol("_CSETF-MODULE-BASIS");
        $sym16$MODULE_NAME = SubLObjectFactory.makeSymbol("MODULE-NAME");
        $sym17$_CSETF_MODULE_NAME = SubLObjectFactory.makeSymbol("_CSETF-MODULE-NAME");
        $sym18$MODULE_SYSTEM = SubLObjectFactory.makeSymbol("MODULE-SYSTEM");
        $sym19$_CSETF_MODULE_SYSTEM = SubLObjectFactory.makeSymbol("_CSETF-MODULE-SYSTEM");
        $sym20$MODULE_PATHNAME = SubLObjectFactory.makeSymbol("MODULE-PATHNAME");
        $sym21$_CSETF_MODULE_PATHNAME = SubLObjectFactory.makeSymbol("_CSETF-MODULE-PATHNAME");
        $sym22$MODULE_TEST_CASES = SubLObjectFactory.makeSymbol("MODULE-TEST-CASES");
        $sym23$_CSETF_MODULE_TEST_CASES = SubLObjectFactory.makeSymbol("_CSETF-MODULE-TEST-CASES");
        $sym24$MODULE_TEST_SUITES = SubLObjectFactory.makeSymbol("MODULE-TEST-SUITES");
        $sym25$_CSETF_MODULE_TEST_SUITES = SubLObjectFactory.makeSymbol("_CSETF-MODULE-TEST-SUITES");
        $sym26$MODULE_PROVISIONAL_P = SubLObjectFactory.makeSymbol("MODULE-PROVISIONAL-P");
        $sym27$_CSETF_MODULE_PROVISIONAL_P = SubLObjectFactory.makeSymbol("_CSETF-MODULE-PROVISIONAL-P");
        $kw28$BASIS = SubLObjectFactory.makeKeyword("BASIS");
        $kw29$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw30$SYSTEM = SubLObjectFactory.makeKeyword("SYSTEM");
        $kw31$PATHNAME = SubLObjectFactory.makeKeyword("PATHNAME");
        $kw32$TEST_CASES = SubLObjectFactory.makeKeyword("TEST-CASES");
        $kw33$TEST_SUITES = SubLObjectFactory.makeKeyword("TEST-SUITES");
        $kw34$PROVISIONAL_P = SubLObjectFactory.makeKeyword("PROVISIONAL-P");
        $str35$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw36$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym37$MAKE_MODULE = SubLObjectFactory.makeSymbol("MAKE-MODULE");
        $kw38$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw39$END = SubLObjectFactory.makeKeyword("END");
        $sym40$VISIT_DEFSTRUCT_OBJECT_MODULE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-MODULE-METHOD");
        $str41$_S_in__S = SubLObjectFactory.makeString("~S in ~S");
        $sym42$SXHASH_MODULE_METHOD = SubLObjectFactory.makeSymbol("SXHASH-MODULE-METHOD");
        $sym43$_MODULE_INDEX_ = SubLObjectFactory.makeSymbol("*MODULE-INDEX*");
        $int44$1024 = SubLObjectFactory.makeInteger(1024);
        $sym45$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping modules"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SYSTEM"), (SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"));
        $kw48$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw49$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $str50$mapping_modules = SubLObjectFactory.makeString("mapping modules");
        $sym51$MODULE_REF = SubLObjectFactory.makeUninternedSymbol("MODULE-REF");
        $sym52$MODULE_NAME = SubLObjectFactory.makeUninternedSymbol("MODULE-NAME");
        $sym53$SYSTEM_NAME = SubLObjectFactory.makeUninternedSymbol("SYSTEM-NAME");
        $sym54$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym55$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym56$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym57$SYSTEM_P = SubLObjectFactory.makeSymbol("SYSTEM-P");
        $sym58$SYSTEM_LOOKUP = SubLObjectFactory.makeSymbol("SYSTEM-LOOKUP");
        $sym59$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str60$_A_is_not_a_known_system_name_ = SubLObjectFactory.makeString("~A is not a known system name.");
        $sym61$PROGRESS_CDOHASH = SubLObjectFactory.makeSymbol("PROGRESS-CDOHASH");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE-GET-INDEX"));
        $sym63$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym64$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym65$COR = SubLObjectFactory.makeSymbol("COR");
        $sym66$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym67$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym68$MODULE_GET_INDEX = SubLObjectFactory.makeSymbol("MODULE-GET-INDEX");
        $sym69$DO_MODULES = SubLObjectFactory.makeSymbol("DO-MODULES");
        $str70$_A_is_not_the_name_of_a_known_sys = SubLObjectFactory.makeString("~A is not the name of a known system.");
        $sym71$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym72$SYSTEM = SubLObjectFactory.makeSymbol("SYSTEM");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIS"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-PATHNAME"), (SubLObject)SubLObjectFactory.makeSymbol("MODULES"), (SubLObject)SubLObjectFactory.makeSymbol("PROVISIONAL-P"));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BASIS"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-PATHNAME"), (SubLObject)SubLObjectFactory.makeKeyword("MODULES"), (SubLObject)SubLObjectFactory.makeKeyword("PROVISIONAL-P"));
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-BASIS"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-DEFAULT-PATHNAME"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-MODULES"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-PROVISIONAL-P"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SYSTEM-BASIS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SYSTEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SYSTEM-DEFAULT-PATHNAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SYSTEM-MODULES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SYSTEM-PROVISIONAL-P"));
        $sym77$PRINT_SYSTEM = SubLObjectFactory.makeSymbol("PRINT-SYSTEM");
        $sym78$SYSTEM_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SYSTEM-PRINT-FUNCTION-TRAMPOLINE");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-P"));
        $sym80$SYSTEM_BASIS = SubLObjectFactory.makeSymbol("SYSTEM-BASIS");
        $sym81$_CSETF_SYSTEM_BASIS = SubLObjectFactory.makeSymbol("_CSETF-SYSTEM-BASIS");
        $sym82$SYSTEM_NAME = SubLObjectFactory.makeSymbol("SYSTEM-NAME");
        $sym83$_CSETF_SYSTEM_NAME = SubLObjectFactory.makeSymbol("_CSETF-SYSTEM-NAME");
        $sym84$SYSTEM_DEFAULT_PATHNAME = SubLObjectFactory.makeSymbol("SYSTEM-DEFAULT-PATHNAME");
        $sym85$_CSETF_SYSTEM_DEFAULT_PATHNAME = SubLObjectFactory.makeSymbol("_CSETF-SYSTEM-DEFAULT-PATHNAME");
        $sym86$SYSTEM_MODULES = SubLObjectFactory.makeSymbol("SYSTEM-MODULES");
        $sym87$_CSETF_SYSTEM_MODULES = SubLObjectFactory.makeSymbol("_CSETF-SYSTEM-MODULES");
        $sym88$SYSTEM_PROVISIONAL_P = SubLObjectFactory.makeSymbol("SYSTEM-PROVISIONAL-P");
        $sym89$_CSETF_SYSTEM_PROVISIONAL_P = SubLObjectFactory.makeSymbol("_CSETF-SYSTEM-PROVISIONAL-P");
        $kw90$DEFAULT_PATHNAME = SubLObjectFactory.makeKeyword("DEFAULT-PATHNAME");
        $kw91$MODULES = SubLObjectFactory.makeKeyword("MODULES");
        $sym92$MAKE_SYSTEM = SubLObjectFactory.makeSymbol("MAKE-SYSTEM");
        $sym93$VISIT_DEFSTRUCT_OBJECT_SYSTEM_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SYSTEM-METHOD");
        $str94$System__S = SubLObjectFactory.makeString("System ~S");
        $sym95$SXHASH_SYSTEM_METHOD = SubLObjectFactory.makeSymbol("SXHASH-SYSTEM-METHOD");
        $sym96$_SYSTEM_INDEX_ = SubLObjectFactory.makeSymbol("*SYSTEM-INDEX*");
        $sym97$SYSTEM_GET_NAME = SubLObjectFactory.makeSymbol("SYSTEM-GET-NAME");
        $str98$_A_is_already_the_name_of_a_known = SubLObjectFactory.makeString("~A is already the name of a known system.");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-NAME"));
        $kw100$COMMON_LISP = SubLObjectFactory.makeKeyword("COMMON-LISP");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-SYSTEM"), (SubLObject)SubLObjectFactory.makeString("cycl"));
        $sym103$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym104$NAME = SubLObjectFactory.makeSymbol("NAME");
        $sym105$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym106$CREATE_MODULE = SubLObjectFactory.makeSymbol("CREATE-MODULE");
    }
    
    public static final class $module_native extends SubLStructNative
    {
        public SubLObject $basis;
        public SubLObject $name;
        public SubLObject $system;
        public SubLObject $pathname;
        public SubLObject $test_cases;
        public SubLObject $test_suites;
        public SubLObject $provisional_p;
        private static final SubLStructDeclNative structDecl;
        
        public $module_native() {
            this.$basis = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$system = (SubLObject)CommonSymbols.NIL;
            this.$pathname = (SubLObject)CommonSymbols.NIL;
            this.$test_cases = (SubLObject)CommonSymbols.NIL;
            this.$test_suites = (SubLObject)CommonSymbols.NIL;
            this.$provisional_p = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$module_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$basis;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$system;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$pathname;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$test_cases;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$test_suites;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$provisional_p;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$basis = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$system = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$pathname = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$test_cases = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$test_suites = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$provisional_p = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$module_native.class, modules.$sym5$MODULE, modules.$sym6$MODULE_P, modules.$list7, modules.$list8, new String[] { "$basis", "$name", "$system", "$pathname", "$test_cases", "$test_suites", "$provisional_p" }, modules.$list9, modules.$list10, modules.$sym11$PRINT_MODULE);
        }
    }
    
    public static final class $module_p$UnaryFunction extends UnaryFunction
    {
        public $module_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MODULE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return modules.module_p(arg1);
        }
    }
    
    public static final class $system_native extends SubLStructNative
    {
        public SubLObject $basis;
        public SubLObject $name;
        public SubLObject $default_pathname;
        public SubLObject $modules;
        public SubLObject $provisional_p;
        private static final SubLStructDeclNative structDecl;
        
        public $system_native() {
            this.$basis = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$default_pathname = (SubLObject)CommonSymbols.NIL;
            this.$modules = (SubLObject)CommonSymbols.NIL;
            this.$provisional_p = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$system_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$basis;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$default_pathname;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$modules;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$provisional_p;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$basis = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$default_pathname = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$modules = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$provisional_p = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$system_native.class, modules.$sym72$SYSTEM, modules.$sym57$SYSTEM_P, modules.$list73, modules.$list74, new String[] { "$basis", "$name", "$default_pathname", "$modules", "$provisional_p" }, modules.$list75, modules.$list76, modules.$sym77$PRINT_SYSTEM);
        }
    }
    
    public static final class $system_p$UnaryFunction extends UnaryFunction
    {
        public $system_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SYSTEM-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return modules.system_p(arg1);
        }
    }
}

/*

	Total time: 564 ms
	
*/