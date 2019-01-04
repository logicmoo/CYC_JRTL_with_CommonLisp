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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
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

public final class set extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.set";
    public static final String myFingerPrint = "cbe78d49a2eb4940be13953015bee7b37959e27d4f18fbe94d677ee48bafebdf";
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1853L)
    public static SubLSymbol $dtp_set$;
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 2904L)
    public static SubLSymbol $new_set_default_test_function$;
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 10837L)
    private static SubLSymbol $cfasl_opcode_set$;
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 11807L)
    private static SubLSymbol $cfasl_opcode_legacy_set$;
    private static final SubLSymbol $sym0$SET;
    private static final SubLSymbol $sym1$SET_P;
    private static final SubLInteger $int2$136;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_SET;
    private static final SubLSymbol $sym8$SET_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$SET_STRUCT_CONTENTS;
    private static final SubLSymbol $sym11$_CSETF_SET_STRUCT_CONTENTS;
    private static final SubLSymbol $sym12$SET_STRUCT_TEST;
    private static final SubLSymbol $sym13$_CSETF_SET_STRUCT_TEST;
    private static final SubLSymbol $kw14$CONTENTS;
    private static final SubLSymbol $kw15$TEST;
    private static final SubLString $str16$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw17$BEGIN;
    private static final SubLSymbol $sym18$MAKE_SET;
    private static final SubLSymbol $kw19$SLOT;
    private static final SubLSymbol $kw20$END;
    private static final SubLSymbol $sym21$VISIT_DEFSTRUCT_OBJECT_SET_METHOD;
    private static final SubLString $str22$_;
    private static final SubLString $str23$_;
    private static final SubLString $str24$_;
    private static final SubLString $str25$_size_;
    private static final SubLString $str26$_elements___S;
    private static final SubLSymbol $kw27$LIST;
    private static final SubLSymbol $kw28$KEYHASH;
    private static final SubLSymbol $kw29$SINGLETON;
    private static final SubLSymbol $sym30$VALID_HASH_TEST_P;
    private static final SubLSymbol $sym31$INTEGERP;
    private static final SubLString $str32$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw36$PROGRESS_MESSAGE;
    private static final SubLSymbol $kw37$DONE;
    private static final SubLSymbol $sym38$SET_VAR;
    private static final SubLSymbol $sym39$CLET;
    private static final SubLSymbol $sym40$DO_SET;
    private static final SubLSymbol $sym41$MESSAGE_VAR;
    private static final SubLSymbol $sym42$SOFAR_VAR;
    private static final SubLSymbol $sym43$TOTAL_VAR;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$SET_SIZE;
    private static final SubLSymbol $sym46$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym47$CINC;
    private static final SubLSymbol $sym48$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym49$DO_SET_CONTENTS;
    private static final SubLSymbol $sym50$DO_SET_INTERNAL;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$SOS;
    private static final SubLSymbol $sym54$PWHEN;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$SOL;
    private static final SubLSymbol $sym57$PIF;
    private static final SubLSymbol $sym58$LISTP;
    private static final SubLSymbol $sym59$CSOME;
    private static final SubLSymbol $sym60$ERROR;
    private static final SubLInteger $int61$60;
    private static final SubLSymbol $sym62$CFASL_INPUT_SET;
    private static final SubLSymbol $sym63$CFASL_OUTPUT_OBJECT_SET_METHOD;
    private static final SubLInteger $int64$67;
    private static final SubLSymbol $sym65$CFASL_INPUT_LEGACY_SET;
    private static final SubLString $str66$Set_Module_Supercategory;
    private static final SubLString $str67$Set_Module_Change_Operation_Subca;
    private static final SubLString $str68$Set_Module_Information_Subcategor;
    private static final SubLString $str69$Set_Module_Iterator_Subcategory;
    private static final SubLString $str70$Set_Module_Mapping_Subcategory;
    private static final SubLString $str71$Set_Module_Kitchen_Sink_Subcatego;
    private static final SubLString $str72$Set_Module_Testing_Suite;
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1853L)
    public static SubLObject set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_set(v_object, stream, (SubLObject)set.ZERO_INTEGER);
        return (SubLObject)set.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1853L)
    public static SubLObject set_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $set_native.class) ? set.T : set.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1853L)
    public static SubLObject set_struct_contents(final SubLObject v_object) {
        assert set.NIL != set_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1853L)
    public static SubLObject set_struct_test(final SubLObject v_object) {
        assert set.NIL != set_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1853L)
    public static SubLObject _csetf_set_struct_contents(final SubLObject v_object, final SubLObject value) {
        assert set.NIL != set_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1853L)
    public static SubLObject _csetf_set_struct_test(final SubLObject v_object, final SubLObject value) {
        assert set.NIL != set_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1853L)
    public static SubLObject make_set(SubLObject arglist) {
        if (arglist == set.UNPROVIDED) {
            arglist = (SubLObject)set.NIL;
        }
        final SubLObject v_new = (SubLObject)new $set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)set.NIL, next = arglist; set.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)set.$kw14$CONTENTS)) {
                _csetf_set_struct_contents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)set.$kw15$TEST)) {
                _csetf_set_struct_test(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)set.$str16$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1853L)
    public static SubLObject visit_defstruct_set(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)set.$kw17$BEGIN, (SubLObject)set.$sym18$MAKE_SET, (SubLObject)set.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)set.$kw19$SLOT, (SubLObject)set.$kw14$CONTENTS, set_struct_contents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)set.$kw19$SLOT, (SubLObject)set.$kw15$TEST, set_struct_test(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)set.$kw20$END, (SubLObject)set.$sym18$MAKE_SET, (SubLObject)set.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1853L)
    public static SubLObject visit_defstruct_object_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_set(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 1985L)
    public static SubLObject print_set(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (set.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)set.T, (SubLObject)set.T);
            streams_high.write_string((SubLObject)set.$str22$_, stream, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED);
            print_high.princ(hash_table_utilities.hash_test_to_symbol(set_struct_test(v_object)), stream);
            streams_high.write_string((SubLObject)set.$str23$_, stream, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED);
            streams_high.write_string(Symbols.symbol_name(set_style(v_object)), stream, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED);
            streams_high.write_string((SubLObject)set.$str24$_, stream, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED);
            streams_high.write_string((SubLObject)set.$str25$_size_, stream, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED);
            print_high.princ(set_size(v_object), stream);
            if (set_size(v_object).numL((SubLObject)set.TWENTY_INTEGER)) {
                PrintLow.format(stream, (SubLObject)set.$str26$_elements___S, set_element_list(v_object));
            }
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)set.T, (SubLObject)set.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 2588L)
    public static SubLObject set_style(final SubLObject v_set) {
        final SubLObject contents = set_struct_contents(v_set);
        if (contents.isList()) {
            return (SubLObject)set.$kw27$LIST;
        }
        if (set.NIL != keyhash.keyhash_p(contents)) {
            return (SubLObject)set.$kw28$KEYHASH;
        }
        return (SubLObject)set.$kw29$SINGLETON;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 3167L)
    public static SubLObject new_set(SubLObject test, SubLObject size) {
        if (test == set.UNPROVIDED) {
            test = set.$new_set_default_test_function$.getGlobalValue();
        }
        if (size == set.UNPROVIDED) {
            size = (SubLObject)set.ZERO_INTEGER;
        }
        assert set.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        assert set.NIL != Types.integerp(size) : size;
        if (test.isSymbol()) {
            test = Symbols.symbol_function(test);
        }
        final SubLObject v_set = make_set((SubLObject)set.UNPROVIDED);
        _csetf_set_struct_test(v_set, test);
        _csetf_set_struct_contents(v_set, set_contents.new_set_contents(size, test));
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 3669L)
    public static SubLObject copy_set(final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        final SubLObject new_set = new_set(set_test(v_set), (SubLObject)set.ZERO_INTEGER);
        _csetf_set_struct_contents(new_set, set_contents.copy_set_contents(set_struct_contents(v_set)));
        return new_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 3927L)
    public static SubLObject set_test(final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        return set_struct_test(v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 4133L)
    public static SubLObject set_size(final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        return set_contents.set_contents_size(set_struct_contents(v_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 4323L)
    public static SubLObject set_emptyP(final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        return set_contents.set_contents_emptyP(set_struct_contents(v_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 4499L)
    public static SubLObject set_or_list_emptyP(final SubLObject set_or_list) {
        if (set.NIL != set_p(set_or_list)) {
            return set_contents.set_contents_emptyP(set_struct_contents(set_or_list));
        }
        if (set_or_list.isList()) {
            return Types.sublisp_null(set_or_list);
        }
        Errors.error((SubLObject)set.$str32$_A_is_neither_SET_P_nor_LISTP_);
        return (SubLObject)set.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 4826L)
    public static SubLObject empty_set_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(set.NIL != set_p(obj) && set.NIL != set_emptyP(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 4953L)
    public static SubLObject non_empty_set_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(set.NIL != set_p(obj) && set.NIL == set_emptyP(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 5094L)
    public static SubLObject set_memberP(final SubLObject element, final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        return set_contents.set_contents_memberP(element, set_struct_contents(v_set), set_struct_test(v_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 5362L)
    public static SubLObject set_member_permissiveP(final SubLObject element, final SubLObject v_set) {
        if (set.NIL == set_p(v_set)) {
            return (SubLObject)set.NIL;
        }
        return set_member_permissiveP(element, v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 5588L)
    public static SubLObject set_or_list_memberP(final SubLObject element, final SubLObject set_or_list) {
        if (set.NIL != set_p(set_or_list)) {
            return set_memberP(element, set_or_list);
        }
        if (set_or_list.isList()) {
            return subl_promotions.memberP(element, set_or_list, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED);
        }
        Errors.error((SubLObject)set.$str32$_A_is_neither_SET_P_nor_LISTP_);
        return (SubLObject)set.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 5959L)
    public static SubLObject set_or_list_to_list(final SubLObject set_or_list) {
        if (set.NIL != set_p(set_or_list)) {
            return set_element_list(set_or_list);
        }
        if (set_or_list.isList()) {
            return set_or_list;
        }
        Errors.error((SubLObject)set.$str32$_A_is_neither_SET_P_nor_LISTP_);
        return (SubLObject)set.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 6210L)
    public static SubLObject set_matching_element(final SubLObject element, final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        return set_contents.set_contents_matching_element(element, set_struct_contents(v_set), set_struct_test(v_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 6575L)
    public static SubLObject set_random_element(final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        return set_contents.set_contents_random_element(set_struct_contents(v_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 6759L)
    public static SubLObject set_add(final SubLObject element, final SubLObject v_set) {
        if (set.NIL == set_memberP(element, v_set)) {
            _csetf_set_struct_contents(v_set, set_contents.set_contents_add(element, set_struct_contents(v_set), set_struct_test(v_set)));
            return (SubLObject)set.T;
        }
        return (SubLObject)set.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 7133L)
    public static SubLObject set_remove(final SubLObject element, final SubLObject v_set) {
        if (set.NIL != set_memberP(element, v_set)) {
            _csetf_set_struct_contents(v_set, set_contents.set_contents_delete(element, set_struct_contents(v_set), set_struct_test(v_set)));
            return (SubLObject)set.T;
        }
        return (SubLObject)set.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 7488L)
    public static SubLObject clear_set(final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        _csetf_set_struct_contents(v_set, set_contents.clear_set_contents(set_struct_contents(v_set)));
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 7709L)
    public static SubLObject new_set_iterator(final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        return set_contents.new_set_contents_iterator(set_struct_contents(v_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 7925L)
    public static SubLObject do_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set.$list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)set.NIL;
        SubLObject v_set = (SubLObject)set.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set.$list33);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set.$list33);
        v_set = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)set.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)set.NIL;
        SubLObject current_$1 = (SubLObject)set.NIL;
        while (set.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)set.$list33);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)set.$list33);
            if (set.NIL == conses_high.member(current_$1, (SubLObject)set.$list34, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED)) {
                bad = (SubLObject)set.T;
            }
            if (current_$1 == set.$kw35$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (set.NIL != bad && set.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)set.$list33);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)set.$kw36$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((set.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : set.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)set.$kw37$DONE, current);
        final SubLObject done = (SubLObject)((set.NIL != done_tail) ? conses_high.cadr(done_tail) : set.NIL);
        final SubLObject body;
        current = (body = temp);
        if (!v_set.isAtom()) {
            final SubLObject set_var = (SubLObject)set.$sym38$SET_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)set.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(set_var, v_set)), (SubLObject)ConsesLow.listS((SubLObject)set.$sym40$DO_SET, (SubLObject)ConsesLow.list(element_var, set_var, (SubLObject)set.$kw36$PROGRESS_MESSAGE, progress_message, (SubLObject)set.$kw37$DONE, done), ConsesLow.append(body, (SubLObject)set.NIL)));
        }
        if (!progress_message.isAtom()) {
            final SubLObject message_var = (SubLObject)set.$sym41$MESSAGE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)set.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(message_var, progress_message)), (SubLObject)ConsesLow.listS((SubLObject)set.$sym40$DO_SET, (SubLObject)ConsesLow.list(element_var, v_set, (SubLObject)set.$kw36$PROGRESS_MESSAGE, message_var, (SubLObject)set.$kw37$DONE, done), ConsesLow.append(body, (SubLObject)set.NIL)));
        }
        if (set.NIL != progress_message) {
            final SubLObject sofar_var = (SubLObject)set.$sym42$SOFAR_VAR;
            final SubLObject total_var = (SubLObject)set.$sym43$TOTAL_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)set.$sym39$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(sofar_var, (SubLObject)set.$list44), (SubLObject)ConsesLow.list(total_var, (SubLObject)ConsesLow.list((SubLObject)set.$sym45$SET_SIZE, v_set))), (SubLObject)ConsesLow.list((SubLObject)set.$sym46$NOTING_PERCENT_PROGRESS, progress_message, (SubLObject)ConsesLow.listS((SubLObject)set.$sym40$DO_SET, (SubLObject)ConsesLow.list(element_var, v_set, (SubLObject)set.$kw37$DONE, done), (SubLObject)ConsesLow.list((SubLObject)set.$sym47$CINC, sofar_var), (SubLObject)ConsesLow.list((SubLObject)set.$sym48$NOTE_PERCENT_PROGRESS, sofar_var, total_var), ConsesLow.append(body, (SubLObject)set.NIL))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)set.$sym49$DO_SET_CONTENTS, (SubLObject)ConsesLow.list(element_var, (SubLObject)ConsesLow.list((SubLObject)set.$sym50$DO_SET_INTERNAL, v_set), (SubLObject)set.$kw37$DONE, done), ConsesLow.append(body, (SubLObject)set.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 9169L)
    public static SubLObject do_set_permissive(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set.$list51);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)set.NIL;
        SubLObject v_set = (SubLObject)set.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set.$list51);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set.$list51);
        v_set = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)set.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)set.NIL;
        SubLObject current_$2 = (SubLObject)set.NIL;
        while (set.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)set.$list51);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)set.$list51);
            if (set.NIL == conses_high.member(current_$2, (SubLObject)set.$list52, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED)) {
                bad = (SubLObject)set.T;
            }
            if (current_$2 == set.$kw35$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (set.NIL != bad && set.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)set.$list51);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)set.$kw37$DONE, current);
        final SubLObject done = (SubLObject)((set.NIL != done_tail) ? conses_high.cadr(done_tail) : set.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject sos = (SubLObject)set.$sym53$SOS;
        return (SubLObject)ConsesLow.list((SubLObject)set.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sos, v_set)), (SubLObject)ConsesLow.list((SubLObject)set.$sym54$PWHEN, (SubLObject)ConsesLow.list((SubLObject)set.$sym1$SET_P, sos), (SubLObject)ConsesLow.listS((SubLObject)set.$sym49$DO_SET_CONTENTS, (SubLObject)ConsesLow.list(element_var, (SubLObject)ConsesLow.list((SubLObject)set.$sym50$DO_SET_INTERNAL, sos), (SubLObject)set.$kw37$DONE, done), ConsesLow.append(body, (SubLObject)set.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 9666L)
    public static SubLObject do_set_or_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set.$list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)set.NIL;
        SubLObject set_or_list = (SubLObject)set.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set.$list55);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)set.$list55);
        set_or_list = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)set.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)set.NIL;
        SubLObject current_$3 = (SubLObject)set.NIL;
        while (set.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)set.$list55);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)set.$list55);
            if (set.NIL == conses_high.member(current_$3, (SubLObject)set.$list52, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED)) {
                bad = (SubLObject)set.T;
            }
            if (current_$3 == set.$kw35$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (set.NIL != bad && set.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)set.$list55);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)set.$kw37$DONE, current);
        final SubLObject done = (SubLObject)((set.NIL != done_tail) ? conses_high.cadr(done_tail) : set.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject sol = (SubLObject)set.$sym56$SOL;
        return (SubLObject)ConsesLow.list((SubLObject)set.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sol, set_or_list)), (SubLObject)ConsesLow.list((SubLObject)set.$sym57$PIF, (SubLObject)ConsesLow.list((SubLObject)set.$sym1$SET_P, sol), (SubLObject)ConsesLow.listS((SubLObject)set.$sym49$DO_SET_CONTENTS, (SubLObject)ConsesLow.list(element_var, (SubLObject)ConsesLow.list((SubLObject)set.$sym50$DO_SET_INTERNAL, sol), (SubLObject)set.$kw37$DONE, done), ConsesLow.append(body, (SubLObject)set.NIL)), (SubLObject)ConsesLow.list((SubLObject)set.$sym57$PIF, (SubLObject)ConsesLow.list((SubLObject)set.$sym58$LISTP, sol), (SubLObject)ConsesLow.listS((SubLObject)set.$sym59$CSOME, (SubLObject)ConsesLow.list(element_var, sol, done), ConsesLow.append(body, (SubLObject)set.NIL)), (SubLObject)ConsesLow.list((SubLObject)set.$sym60$ERROR, (SubLObject)set.$str32$_A_is_neither_SET_P_nor_LISTP_, sol))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 10353L)
    public static SubLObject do_set_internal(final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        return set_struct_contents(v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 10493L)
    public static SubLObject map_set(final SubLObject function, final SubLObject v_set, SubLObject args) {
        if (args == set.UNPROVIDED) {
            args = (SubLObject)set.NIL;
        }
        assert set.NIL != set_p(v_set) : v_set;
        set_contents.map_set_contents(function, set_struct_contents(v_set), args);
        return (SubLObject)set.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 10951L)
    public static SubLObject cfasl_output_object_set_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_set(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 11062L)
    public static SubLObject cfasl_output_set(final SubLObject v_object, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(set.$cfasl_opcode_set$.getGlobalValue(), stream);
        final SubLObject test = hash_table_utilities.hash_test_to_symbol(set_test(v_object));
        final SubLObject size = set_size(v_object);
        cfasl.cfasl_output(test, stream);
        cfasl.cfasl_output(size, stream);
        final SubLObject set_contents_var = do_set_internal(v_object);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)set.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); set.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (set.NIL != set_contents.do_set_contents_element_validP(state, element)) {
                cfasl.cfasl_output(element, stream);
            }
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 11392L)
    public static SubLObject cfasl_input_set(final SubLObject stream) {
        SubLObject test = cfasl.cfasl_input(stream, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED);
        final SubLObject size = cfasl.cfasl_input(stream, (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED);
        SubLObject v_set = (SubLObject)set.NIL;
        final SubLObject pcase_var = test;
        if (pcase_var.eql((SubLObject)set.EQ) || pcase_var.eql((SubLObject)set.EQL) || pcase_var.eql((SubLObject)set.EQUAL) || pcase_var.eql((SubLObject)set.EQUALP)) {
            test = Symbols.symbol_function(test);
        }
        v_set = new_set(test, size);
        _csetf_set_struct_contents(v_set, set_contents.cfasl_input_set_contents(stream, set_struct_contents(v_set), size, test));
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 11943L)
    public static SubLObject cfasl_input_legacy_set(final SubLObject stream) {
        SubLObject v_set = (SubLObject)set.NIL;
        v_set = new_set((SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED);
        cfasl.cfasl_input_object(stream);
        _csetf_set_struct_contents(v_set, cfasl.cfasl_input_object(stream));
        _csetf_set_struct_test(v_set, Symbols.symbol_function(cfasl.cfasl_input_object(stream)));
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 12372L)
    public static SubLObject set_element_list(final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        return set_contents.set_contents_element_list(set_struct_contents(v_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/set.lisp", position = 12848L)
    public static SubLObject set_rebuild(final SubLObject v_set) {
        assert set.NIL != set_p(v_set) : v_set;
        _csetf_set_struct_contents(v_set, set_contents.set_contents_rebuild(set_struct_contents(v_set)));
        return v_set;
    }
    
    public static SubLObject declare_set_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_print_function_trampoline", "SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_p", "SET-P", 1, 0, false);
        new $set_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_struct_contents", "SET-STRUCT-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_struct_test", "SET-STRUCT-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "_csetf_set_struct_contents", "_CSETF-SET-STRUCT-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "_csetf_set_struct_test", "_CSETF-SET-STRUCT-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "make_set", "MAKE-SET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "visit_defstruct_set", "VISIT-DEFSTRUCT-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "visit_defstruct_object_set_method", "VISIT-DEFSTRUCT-OBJECT-SET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "print_set", "PRINT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_style", "SET-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "new_set", "NEW-SET", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "copy_set", "COPY-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_test", "SET-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_size", "SET-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_emptyP", "SET-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_or_list_emptyP", "SET-OR-LIST-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "empty_set_p", "EMPTY-SET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "non_empty_set_p", "NON-EMPTY-SET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_memberP", "SET-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_member_permissiveP", "SET-MEMBER-PERMISSIVE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_or_list_memberP", "SET-OR-LIST-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_or_list_to_list", "SET-OR-LIST-TO-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_matching_element", "SET-MATCHING-ELEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_random_element", "SET-RANDOM-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_add", "SET-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_remove", "SET-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "clear_set", "CLEAR-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "new_set_iterator", "NEW-SET-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.set", "do_set", "DO-SET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.set", "do_set_permissive", "DO-SET-PERMISSIVE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.set", "do_set_or_list", "DO-SET-OR-LIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "do_set_internal", "DO-SET-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "map_set", "MAP-SET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "cfasl_output_object_set_method", "CFASL-OUTPUT-OBJECT-SET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "cfasl_output_set", "CFASL-OUTPUT-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "cfasl_input_set", "CFASL-INPUT-SET", 1, 0, false);
        new $cfasl_input_set$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "cfasl_input_legacy_set", "CFASL-INPUT-LEGACY-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_element_list", "SET-ELEMENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.set", "set_rebuild", "SET-REBUILD", 1, 0, false);
        return (SubLObject)set.NIL;
    }
    
    public static SubLObject init_set_file() {
        set.$dtp_set$ = SubLFiles.defconstant("*DTP-SET*", (SubLObject)set.$sym0$SET);
        set.$new_set_default_test_function$ = SubLFiles.deflexical("*NEW-SET-DEFAULT-TEST-FUNCTION*", Symbols.symbol_function((SubLObject)set.EQL));
        set.$cfasl_opcode_set$ = SubLFiles.defconstant("*CFASL-OPCODE-SET*", (SubLObject)set.$int61$60);
        set.$cfasl_opcode_legacy_set$ = SubLFiles.defconstant("*CFASL-OPCODE-LEGACY-SET*", (SubLObject)set.$int64$67);
        return (SubLObject)set.NIL;
    }
    
    public static SubLObject setup_set_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)set.$sym8$SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)set.$list9);
        Structures.def_csetf((SubLObject)set.$sym10$SET_STRUCT_CONTENTS, (SubLObject)set.$sym11$_CSETF_SET_STRUCT_CONTENTS);
        Structures.def_csetf((SubLObject)set.$sym12$SET_STRUCT_TEST, (SubLObject)set.$sym13$_CSETF_SET_STRUCT_TEST);
        Equality.identity((SubLObject)set.$sym0$SET);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)set.$sym21$VISIT_DEFSTRUCT_OBJECT_SET_METHOD));
        access_macros.register_macro_helper((SubLObject)set.$sym50$DO_SET_INTERNAL, (SubLObject)set.$sym40$DO_SET);
        cfasl.register_cfasl_input_function(set.$cfasl_opcode_set$.getGlobalValue(), (SubLObject)set.$sym62$CFASL_INPUT_SET);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), set.$dtp_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)set.$sym63$CFASL_OUTPUT_OBJECT_SET_METHOD));
        cfasl.register_cfasl_input_function(set.$cfasl_opcode_legacy_set$.getGlobalValue(), (SubLObject)set.$sym65$CFASL_INPUT_LEGACY_SET);
        sunit_external.define_test_category((SubLObject)set.$str66$Set_Module_Supercategory, (SubLObject)set.UNPROVIDED);
        sunit_external.define_test_category((SubLObject)set.$str67$Set_Module_Change_Operation_Subca, (SubLObject)ConsesLow.list((SubLObject)set.$str66$Set_Module_Supercategory));
        sunit_external.define_test_category((SubLObject)set.$str68$Set_Module_Information_Subcategor, (SubLObject)ConsesLow.list((SubLObject)set.$str66$Set_Module_Supercategory));
        sunit_external.define_test_category((SubLObject)set.$str69$Set_Module_Iterator_Subcategory, (SubLObject)ConsesLow.list((SubLObject)set.$str66$Set_Module_Supercategory));
        sunit_external.define_test_category((SubLObject)set.$str70$Set_Module_Mapping_Subcategory, (SubLObject)ConsesLow.list((SubLObject)set.$str66$Set_Module_Supercategory));
        sunit_external.define_test_category((SubLObject)set.$str71$Set_Module_Kitchen_Sink_Subcatego, (SubLObject)ConsesLow.list((SubLObject)set.$str66$Set_Module_Supercategory));
        sunit_external.define_test_suite((SubLObject)set.$str72$Set_Module_Testing_Suite, (SubLObject)ConsesLow.list((SubLObject)set.$str66$Set_Module_Supercategory), (SubLObject)set.UNPROVIDED, (SubLObject)set.UNPROVIDED);
        return (SubLObject)set.NIL;
    }
    
    public void declareFunctions() {
        declare_set_file();
    }
    
    public void initializeVariables() {
        init_set_file();
    }
    
    public void runTopLevelForms() {
        setup_set_file();
    }
    
    static {
        me = (SubLFile)new set();
        set.$dtp_set$ = null;
        set.$new_set_default_test_function$ = null;
        set.$cfasl_opcode_set$ = null;
        set.$cfasl_opcode_legacy_set$ = null;
        $sym0$SET = SubLObjectFactory.makeSymbol("SET");
        $sym1$SET_P = SubLObjectFactory.makeSymbol("SET-P");
        $int2$136 = SubLObjectFactory.makeInteger(136);
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTENTS"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-STRUCT-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SET-STRUCT-TEST"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SET-STRUCT-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SET-STRUCT-TEST"));
        $sym7$PRINT_SET = SubLObjectFactory.makeSymbol("PRINT-SET");
        $sym8$SET_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SET-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SET-P"));
        $sym10$SET_STRUCT_CONTENTS = SubLObjectFactory.makeSymbol("SET-STRUCT-CONTENTS");
        $sym11$_CSETF_SET_STRUCT_CONTENTS = SubLObjectFactory.makeSymbol("_CSETF-SET-STRUCT-CONTENTS");
        $sym12$SET_STRUCT_TEST = SubLObjectFactory.makeSymbol("SET-STRUCT-TEST");
        $sym13$_CSETF_SET_STRUCT_TEST = SubLObjectFactory.makeSymbol("_CSETF-SET-STRUCT-TEST");
        $kw14$CONTENTS = SubLObjectFactory.makeKeyword("CONTENTS");
        $kw15$TEST = SubLObjectFactory.makeKeyword("TEST");
        $str16$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw17$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym18$MAKE_SET = SubLObjectFactory.makeSymbol("MAKE-SET");
        $kw19$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw20$END = SubLObjectFactory.makeKeyword("END");
        $sym21$VISIT_DEFSTRUCT_OBJECT_SET_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SET-METHOD");
        $str22$_ = SubLObjectFactory.makeString("(");
        $str23$_ = SubLObjectFactory.makeString(" ");
        $str24$_ = SubLObjectFactory.makeString(")");
        $str25$_size_ = SubLObjectFactory.makeString(" size=");
        $str26$_elements___S = SubLObjectFactory.makeString(" elements: ~S");
        $kw27$LIST = SubLObjectFactory.makeKeyword("LIST");
        $kw28$KEYHASH = SubLObjectFactory.makeKeyword("KEYHASH");
        $kw29$SINGLETON = SubLObjectFactory.makeKeyword("SINGLETON");
        $sym30$VALID_HASH_TEST_P = SubLObjectFactory.makeSymbol("VALID-HASH-TEST-P");
        $sym31$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str32$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw35$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw36$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $kw37$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym38$SET_VAR = SubLObjectFactory.makeUninternedSymbol("SET-VAR");
        $sym39$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym40$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $sym41$MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("MESSAGE-VAR");
        $sym42$SOFAR_VAR = SubLObjectFactory.makeUninternedSymbol("SOFAR-VAR");
        $sym43$TOTAL_VAR = SubLObjectFactory.makeUninternedSymbol("TOTAL-VAR");
        $list44 = ConsesLow.list((SubLObject)set.ZERO_INTEGER);
        $sym45$SET_SIZE = SubLObjectFactory.makeSymbol("SET-SIZE");
        $sym46$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym47$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym48$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym49$DO_SET_CONTENTS = SubLObjectFactory.makeSymbol("DO-SET-CONTENTS");
        $sym50$DO_SET_INTERNAL = SubLObjectFactory.makeSymbol("DO-SET-INTERNAL");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym53$SOS = SubLObjectFactory.makeUninternedSymbol("SOS");
        $sym54$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SET-OR-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym56$SOL = SubLObjectFactory.makeUninternedSymbol("SOL");
        $sym57$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym58$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym59$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym60$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $int61$60 = SubLObjectFactory.makeInteger(60);
        $sym62$CFASL_INPUT_SET = SubLObjectFactory.makeSymbol("CFASL-INPUT-SET");
        $sym63$CFASL_OUTPUT_OBJECT_SET_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-SET-METHOD");
        $int64$67 = SubLObjectFactory.makeInteger(67);
        $sym65$CFASL_INPUT_LEGACY_SET = SubLObjectFactory.makeSymbol("CFASL-INPUT-LEGACY-SET");
        $str66$Set_Module_Supercategory = SubLObjectFactory.makeString("Set Module Supercategory");
        $str67$Set_Module_Change_Operation_Subca = SubLObjectFactory.makeString("Set Module Change Operation Subcategory");
        $str68$Set_Module_Information_Subcategor = SubLObjectFactory.makeString("Set Module Information Subcategory");
        $str69$Set_Module_Iterator_Subcategory = SubLObjectFactory.makeString("Set Module Iterator Subcategory");
        $str70$Set_Module_Mapping_Subcategory = SubLObjectFactory.makeString("Set Module Mapping Subcategory");
        $str71$Set_Module_Kitchen_Sink_Subcatego = SubLObjectFactory.makeString("Set Module Kitchen Sink Subcategory");
        $str72$Set_Module_Testing_Suite = SubLObjectFactory.makeString("Set Module Testing Suite");
    }
    
    public static final class $set_native extends SubLStructNative
    {
        public SubLObject $contents;
        public SubLObject $test;
        private static final SubLStructDeclNative structDecl;
        
        public $set_native() {
            this.$contents = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$set_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$contents;
        }
        
        public SubLObject getField3() {
            return this.$test;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$contents = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$set_native.class, set.$sym0$SET, set.$sym1$SET_P, set.$list3, set.$list4, new String[] { "$contents", "$test" }, set.$list5, set.$list6, set.$sym7$PRINT_SET);
        }
    }
    
    public static final class $set_p$UnaryFunction extends UnaryFunction
    {
        public $set_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SET-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return set.set_p(arg1);
        }
    }
    
    public static final class $cfasl_input_set$UnaryFunction extends UnaryFunction
    {
        public $cfasl_input_set$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CFASL-INPUT-SET"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return set.cfasl_input_set(arg1);
        }
    }
}

/*

	Total time: 207 ms
	
*/