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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
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

public final class wff_module_datastructures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.wff_module_datastructures";
    public static final String myFingerPrint = "a307e43acbf90ce65cf4b46b804cded9badb742f5474dc68807abe7925512ace";
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
    public static SubLSymbol $dtp_wff_module$;
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 3314L)
    private static SubLSymbol $wff_module_store$;
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 4815L)
    private static SubLSymbol $wff_module_properties$;
    private static final SubLSymbol $sym0$WFF_MODULE;
    private static final SubLSymbol $sym1$WFF_MODULE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_WFF_MODULE;
    private static final SubLSymbol $sym7$WFF_MODULE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$WFF_MOD_NAME;
    private static final SubLSymbol $sym10$_CSETF_WFF_MOD_NAME;
    private static final SubLSymbol $sym11$WFF_MOD_PLIST;
    private static final SubLSymbol $sym12$_CSETF_WFF_MOD_PLIST;
    private static final SubLSymbol $kw13$NAME;
    private static final SubLSymbol $kw14$PLIST;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_WFF_MODULE;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_WFF_MODULE_METHOD;
    private static final SubLString $str21$_WFF_Module___a_;
    private static final SubLSymbol $sym22$PROPERTY_LIST_P;
    private static final SubLSymbol $kw23$FREE;
    private static final SubLSymbol $sym24$_WFF_MODULE_STORE_;
    private static final SubLInteger $int25$212;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw29$DONE;
    private static final SubLSymbol $sym30$NAME_VAR;
    private static final SubLSymbol $sym31$DO_HASH_TABLE;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$IGNORE;
    private static final SubLSymbol $sym34$WFF_MODULE_STORE;
    private static final SubLSymbol $sym35$DO_WFF_MODULES;
    private static final SubLSymbol $kw36$MODULE_TYPE;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$CAR;
    private static final SubLSymbol $sym39$WFF_MODULE_PROPERTY_LIST_P;
    private static final SubLSymbol $kw40$VIOLATION;
    private static final SubLSymbol $kw41$EXPLAIN_FUNC;
    private static final SubLSymbol $kw42$EXPLAIN_ARGS;
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
    public static SubLObject wff_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_wff_module(v_object, stream, (SubLObject)wff_module_datastructures.ZERO_INTEGER);
        return (SubLObject)wff_module_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
    public static SubLObject wff_module_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $wff_module_native.class) ? wff_module_datastructures.T : wff_module_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
    public static SubLObject wff_mod_name(final SubLObject v_object) {
        assert wff_module_datastructures.NIL != wff_module_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
    public static SubLObject wff_mod_plist(final SubLObject v_object) {
        assert wff_module_datastructures.NIL != wff_module_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
    public static SubLObject _csetf_wff_mod_name(final SubLObject v_object, final SubLObject value) {
        assert wff_module_datastructures.NIL != wff_module_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
    public static SubLObject _csetf_wff_mod_plist(final SubLObject v_object, final SubLObject value) {
        assert wff_module_datastructures.NIL != wff_module_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
    public static SubLObject make_wff_module(SubLObject arglist) {
        if (arglist == wff_module_datastructures.UNPROVIDED) {
            arglist = (SubLObject)wff_module_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $wff_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)wff_module_datastructures.NIL, next = arglist; wff_module_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)wff_module_datastructures.$kw13$NAME)) {
                _csetf_wff_mod_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)wff_module_datastructures.$kw14$PLIST)) {
                _csetf_wff_mod_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)wff_module_datastructures.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
    public static SubLObject visit_defstruct_wff_module(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)wff_module_datastructures.$kw16$BEGIN, (SubLObject)wff_module_datastructures.$sym17$MAKE_WFF_MODULE, (SubLObject)wff_module_datastructures.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)wff_module_datastructures.$kw18$SLOT, (SubLObject)wff_module_datastructures.$kw13$NAME, wff_mod_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)wff_module_datastructures.$kw18$SLOT, (SubLObject)wff_module_datastructures.$kw14$PLIST, wff_mod_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)wff_module_datastructures.$kw19$END, (SubLObject)wff_module_datastructures.$sym17$MAKE_WFF_MODULE, (SubLObject)wff_module_datastructures.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1315L)
    public static SubLObject visit_defstruct_object_wff_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_wff_module(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1618L)
    public static SubLObject print_wff_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = wff_module_name(v_object);
        PrintLow.format(stream, (SubLObject)wff_module_datastructures.$str21$_WFF_Module___a_, name);
        return (SubLObject)wff_module_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 1791L)
    public static SubLObject new_wff_module(final SubLObject name, final SubLObject plist) {
        assert wff_module_datastructures.NIL != list_utilities.property_list_p(plist) : plist;
        final SubLObject wff_module = allocate_wff_module(name);
        _csetf_wff_mod_plist(wff_module, plist);
        add_wff_module(wff_module);
        return wff_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 2139L)
    public static SubLObject allocate_wff_module(final SubLObject name) {
        SubLObject wff_module = find_wff_module_by_name(name);
        if (wff_module_datastructures.NIL != wff_module) {
            remove_wff_module(wff_module);
        }
        else {
            wff_module = make_wff_module((SubLObject)wff_module_datastructures.UNPROVIDED);
            _csetf_wff_mod_name(wff_module, name);
        }
        _csetf_wff_mod_plist(wff_module, (SubLObject)wff_module_datastructures.NIL);
        return wff_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 2451L)
    public static SubLObject destroy_wff_module(final SubLObject wff_module) {
        remove_wff_module(wff_module);
        _csetf_wff_mod_plist(wff_module, (SubLObject)wff_module_datastructures.$kw23$FREE);
        return (SubLObject)wff_module_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 2604L)
    public static SubLObject wff_module_name(final SubLObject wff_module) {
        assert wff_module_datastructures.NIL != wff_module_p(wff_module) : wff_module;
        return wff_mod_name(wff_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 2804L)
    public static SubLObject wff_module_plist(final SubLObject wff_module) {
        assert wff_module_datastructures.NIL != wff_module_p(wff_module) : wff_module;
        return wff_mod_plist(wff_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 2926L)
    public static SubLObject wff_module_property(final SubLObject wff_module, final SubLObject property, SubLObject v_default) {
        if (v_default == wff_module_datastructures.UNPROVIDED) {
            v_default = (SubLObject)wff_module_datastructures.NIL;
        }
        assert wff_module_datastructures.NIL != wff_module_p(wff_module) : wff_module;
        final SubLObject plist = wff_module_plist(wff_module);
        return conses_high.getf(plist, property, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 3515L)
    public static SubLObject do_wff_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_module_datastructures.$list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject wff_module_var = (SubLObject)wff_module_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_module_datastructures.$list26);
        wff_module_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)wff_module_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)wff_module_datastructures.NIL;
        SubLObject current_$1 = (SubLObject)wff_module_datastructures.NIL;
        while (wff_module_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)wff_module_datastructures.$list26);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)wff_module_datastructures.$list26);
            if (wff_module_datastructures.NIL == conses_high.member(current_$1, (SubLObject)wff_module_datastructures.$list27, (SubLObject)wff_module_datastructures.UNPROVIDED, (SubLObject)wff_module_datastructures.UNPROVIDED)) {
                bad = (SubLObject)wff_module_datastructures.T;
            }
            if (current_$1 == wff_module_datastructures.$kw28$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (wff_module_datastructures.NIL != bad && wff_module_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_module_datastructures.$list26);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)wff_module_datastructures.$kw29$DONE, current);
        final SubLObject done = (SubLObject)((wff_module_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : wff_module_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject name_var = (SubLObject)wff_module_datastructures.$sym30$NAME_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)wff_module_datastructures.$sym31$DO_HASH_TABLE, (SubLObject)ConsesLow.list(name_var, wff_module_var, (SubLObject)wff_module_datastructures.$list32, (SubLObject)wff_module_datastructures.$kw29$DONE, done), (SubLObject)ConsesLow.list((SubLObject)wff_module_datastructures.$sym33$IGNORE, name_var), ConsesLow.append(body, (SubLObject)wff_module_datastructures.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 3754L)
    public static SubLObject wff_module_store() {
        return wff_module_datastructures.$wff_module_store$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 3850L)
    public static SubLObject find_wff_module_by_name(final SubLObject name) {
        final SubLObject wff_module = Hashtables.gethash(name, wff_module_datastructures.$wff_module_store$.getGlobalValue(), (SubLObject)wff_module_datastructures.UNPROVIDED);
        return wff_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 3990L)
    public static SubLObject add_wff_module(final SubLObject wff_module) {
        assert wff_module_datastructures.NIL != wff_module_p(wff_module) : wff_module;
        final SubLObject name = wff_module_name(wff_module);
        Hashtables.sethash(name, wff_module_datastructures.$wff_module_store$.getGlobalValue(), wff_module);
        return wff_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 4203L)
    public static SubLObject remove_wff_module(final SubLObject wff_module) {
        assert wff_module_datastructures.NIL != wff_module_p(wff_module) : wff_module;
        final SubLObject name = wff_module_name(wff_module);
        Hashtables.remhash(name, wff_module_datastructures.$wff_module_store$.getGlobalValue());
        return wff_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 4395L)
    public static SubLObject setup_wff_module(final SubLObject name, final SubLObject type, final SubLObject plist) {
        SubLObject new_plist = conses_high.copy_list(plist);
        new_plist = conses_high.putf(plist, (SubLObject)wff_module_datastructures.$kw36$MODULE_TYPE, type);
        final SubLObject wff_module = new_wff_module(name, new_plist);
        return wff_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 4697L)
    public static SubLObject wff_module_type(final SubLObject wff_module) {
        return wff_module_property(wff_module, (SubLObject)wff_module_datastructures.$kw36$MODULE_TYPE, (SubLObject)wff_module_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 5315L)
    public static SubLObject wff_violation_type_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(find_wff_module_by_name(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 5573L)
    public static SubLObject wff_violation_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(wff_module_datastructures.NIL == v_object || (v_object.isCons() && wff_module_datastructures.NIL != wff_violation_type_p(v_object.first())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 5793L)
    public static SubLObject wff_module_property_p(final SubLObject property, final SubLObject value) {
        if (!property.isKeyword()) {
            return (SubLObject)wff_module_datastructures.NIL;
        }
        SubLObject value_type = (SubLObject)wff_module_datastructures.NIL;
        value_type = Sequences.find(property, wff_module_datastructures.$wff_module_properties$.getGlobalValue(), Symbols.symbol_function((SubLObject)wff_module_datastructures.EQL), Symbols.symbol_function((SubLObject)wff_module_datastructures.$sym38$CAR), (SubLObject)wff_module_datastructures.UNPROVIDED, (SubLObject)wff_module_datastructures.UNPROVIDED).rest();
        if (wff_module_datastructures.NIL != value_type) {
            return Functions.funcall(value_type, value);
        }
        return (SubLObject)wff_module_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 6082L)
    public static SubLObject wff_module_property_list_p(final SubLObject v_object) {
        if (wff_module_datastructures.NIL == list_utilities.property_list_p(v_object)) {
            return (SubLObject)wff_module_datastructures.NIL;
        }
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)wff_module_datastructures.NIL, remainder = v_object; wff_module_datastructures.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (wff_module_datastructures.NIL == wff_module_property_p(property, value)) {
                return (SubLObject)wff_module_datastructures.NIL;
            }
        }
        return (SubLObject)wff_module_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 6307L)
    public static SubLObject wff_violation_module(final SubLObject name, final SubLObject plist) {
        assert wff_module_datastructures.NIL != wff_module_property_list_p(plist) : plist;
        final SubLObject wff_module = setup_wff_module(name, (SubLObject)wff_module_datastructures.$kw40$VIOLATION, plist);
        return wff_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 8199L)
    public static SubLObject wff_violation_explanation_function(final SubLObject wff_violation_name) {
        return wff_module_property(find_wff_module_by_name(wff_violation_name), (SubLObject)wff_module_datastructures.$kw41$EXPLAIN_FUNC, (SubLObject)wff_module_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-module-datastructures.lisp", position = 8391L)
    public static SubLObject wff_violation_explanation_function_args(final SubLObject wff_violation_name) {
        return wff_module_property(find_wff_module_by_name(wff_violation_name), (SubLObject)wff_module_datastructures.$kw42$EXPLAIN_ARGS, (SubLObject)wff_module_datastructures.NIL);
    }
    
    public static SubLObject declare_wff_module_datastructures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_module_print_function_trampoline", "WFF-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_module_p", "WFF-MODULE-P", 1, 0, false);
        new $wff_module_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_mod_name", "WFF-MOD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_mod_plist", "WFF-MOD-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "_csetf_wff_mod_name", "_CSETF-WFF-MOD-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "_csetf_wff_mod_plist", "_CSETF-WFF-MOD-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "make_wff_module", "MAKE-WFF-MODULE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "visit_defstruct_wff_module", "VISIT-DEFSTRUCT-WFF-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "visit_defstruct_object_wff_module_method", "VISIT-DEFSTRUCT-OBJECT-WFF-MODULE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "print_wff_module", "PRINT-WFF-MODULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "new_wff_module", "NEW-WFF-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "allocate_wff_module", "ALLOCATE-WFF-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "destroy_wff_module", "DESTROY-WFF-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_module_name", "WFF-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_module_plist", "WFF-MODULE-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_module_property", "WFF-MODULE-PROPERTY", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_module_datastructures", "do_wff_modules", "DO-WFF-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_module_store", "WFF-MODULE-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "find_wff_module_by_name", "FIND-WFF-MODULE-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "add_wff_module", "ADD-WFF-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "remove_wff_module", "REMOVE-WFF-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "setup_wff_module", "SETUP-WFF-MODULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_module_type", "WFF-MODULE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_violation_type_p", "WFF-VIOLATION-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_violation_p", "WFF-VIOLATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_module_property_p", "WFF-MODULE-PROPERTY-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_module_property_list_p", "WFF-MODULE-PROPERTY-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_violation_module", "WFF-VIOLATION-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_violation_explanation_function", "WFF-VIOLATION-EXPLANATION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_module_datastructures", "wff_violation_explanation_function_args", "WFF-VIOLATION-EXPLANATION-FUNCTION-ARGS", 1, 0, false);
        return (SubLObject)wff_module_datastructures.NIL;
    }
    
    public static SubLObject init_wff_module_datastructures_file() {
        wff_module_datastructures.$dtp_wff_module$ = SubLFiles.defconstant("*DTP-WFF-MODULE*", (SubLObject)wff_module_datastructures.$sym0$WFF_MODULE);
        wff_module_datastructures.$wff_module_store$ = SubLFiles.deflexical("*WFF-MODULE-STORE*", maybeDefault((SubLObject)wff_module_datastructures.$sym24$_WFF_MODULE_STORE_, wff_module_datastructures.$wff_module_store$, ()->(Hashtables.make_hash_table((SubLObject)wff_module_datastructures.$int25$212, Symbols.symbol_function((SubLObject)wff_module_datastructures.EQUAL), (SubLObject)wff_module_datastructures.UNPROVIDED))));
        wff_module_datastructures.$wff_module_properties$ = SubLFiles.deflexical("*WFF-MODULE-PROPERTIES*", (SubLObject)wff_module_datastructures.$list37);
        return (SubLObject)wff_module_datastructures.NIL;
    }
    
    public static SubLObject setup_wff_module_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), wff_module_datastructures.$dtp_wff_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)wff_module_datastructures.$sym7$WFF_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)wff_module_datastructures.$list8);
        Structures.def_csetf((SubLObject)wff_module_datastructures.$sym9$WFF_MOD_NAME, (SubLObject)wff_module_datastructures.$sym10$_CSETF_WFF_MOD_NAME);
        Structures.def_csetf((SubLObject)wff_module_datastructures.$sym11$WFF_MOD_PLIST, (SubLObject)wff_module_datastructures.$sym12$_CSETF_WFF_MOD_PLIST);
        Equality.identity((SubLObject)wff_module_datastructures.$sym0$WFF_MODULE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), wff_module_datastructures.$dtp_wff_module$.getGlobalValue(), Symbols.symbol_function((SubLObject)wff_module_datastructures.$sym20$VISIT_DEFSTRUCT_OBJECT_WFF_MODULE_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)wff_module_datastructures.$sym24$_WFF_MODULE_STORE_);
        access_macros.register_macro_helper((SubLObject)wff_module_datastructures.$sym34$WFF_MODULE_STORE, (SubLObject)wff_module_datastructures.$sym35$DO_WFF_MODULES);
        return (SubLObject)wff_module_datastructures.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_wff_module_datastructures_file();
    }
    
    @Override
	public void initializeVariables() {
        init_wff_module_datastructures_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_wff_module_datastructures_file();
    }
    
    static {
        me = (SubLFile)new wff_module_datastructures();
        wff_module_datastructures.$dtp_wff_module$ = null;
        wff_module_datastructures.$wff_module_store$ = null;
        wff_module_datastructures.$wff_module_properties$ = null;
        $sym0$WFF_MODULE = SubLObjectFactory.makeSymbol("WFF-MODULE");
        $sym1$WFF_MODULE_P = SubLObjectFactory.makeSymbol("WFF-MODULE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-MOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-MOD-PLIST"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-WFF-MOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-WFF-MOD-PLIST"));
        $sym6$PRINT_WFF_MODULE = SubLObjectFactory.makeSymbol("PRINT-WFF-MODULE");
        $sym7$WFF_MODULE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("WFF-MODULE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-MODULE-P"));
        $sym9$WFF_MOD_NAME = SubLObjectFactory.makeSymbol("WFF-MOD-NAME");
        $sym10$_CSETF_WFF_MOD_NAME = SubLObjectFactory.makeSymbol("_CSETF-WFF-MOD-NAME");
        $sym11$WFF_MOD_PLIST = SubLObjectFactory.makeSymbol("WFF-MOD-PLIST");
        $sym12$_CSETF_WFF_MOD_PLIST = SubLObjectFactory.makeSymbol("_CSETF-WFF-MOD-PLIST");
        $kw13$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw14$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_WFF_MODULE = SubLObjectFactory.makeSymbol("MAKE-WFF-MODULE");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_WFF_MODULE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-WFF-MODULE-METHOD");
        $str21$_WFF_Module___a_ = SubLObjectFactory.makeString("[WFF Module: ~a]");
        $sym22$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $kw23$FREE = SubLObjectFactory.makeKeyword("FREE");
        $sym24$_WFF_MODULE_STORE_ = SubLObjectFactory.makeSymbol("*WFF-MODULE-STORE*");
        $int25$212 = SubLObjectFactory.makeInteger(212);
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-MODULE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw28$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw29$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym30$NAME_VAR = SubLObjectFactory.makeUninternedSymbol("NAME-VAR");
        $sym31$DO_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-MODULE-STORE"));
        $sym33$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym34$WFF_MODULE_STORE = SubLObjectFactory.makeSymbol("WFF-MODULE-STORE");
        $sym35$DO_WFF_MODULES = SubLObjectFactory.makeSymbol("DO-WFF-MODULES");
        $kw36$MODULE_TYPE = SubLObjectFactory.makeKeyword("MODULE-TYPE");
        $list37 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EXPLAIN-FUNC"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $sym38$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym39$WFF_MODULE_PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("WFF-MODULE-PROPERTY-LIST-P");
        $kw40$VIOLATION = SubLObjectFactory.makeKeyword("VIOLATION");
        $kw41$EXPLAIN_FUNC = SubLObjectFactory.makeKeyword("EXPLAIN-FUNC");
        $kw42$EXPLAIN_ARGS = SubLObjectFactory.makeKeyword("EXPLAIN-ARGS");
    }
    
    public static final class $wff_module_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $wff_module_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$wff_module_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$plist;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$wff_module_native.class, wff_module_datastructures.$sym0$WFF_MODULE, wff_module_datastructures.$sym1$WFF_MODULE_P, wff_module_datastructures.$list2, wff_module_datastructures.$list3, new String[] { "$name", "$plist" }, wff_module_datastructures.$list4, wff_module_datastructures.$list5, wff_module_datastructures.$sym6$PRINT_WFF_MODULE);
        }
    }
    
    public static final class $wff_module_p$UnaryFunction extends UnaryFunction
    {
        public $wff_module_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("WFF-MODULE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return wff_module_datastructures.wff_module_p(arg1);
        }
    }
}

/*

	Total time: 150 ms
	
*/