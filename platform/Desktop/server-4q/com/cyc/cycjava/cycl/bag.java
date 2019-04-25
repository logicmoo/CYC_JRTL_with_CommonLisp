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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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

public final class bag extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.bag";
    public static final String myFingerPrint = "c431ba6003dc462d6ad5a5f03d801f7c1204a9fdf4a2dab96643e294a284b3e7";
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLSymbol $dtp_bag$;
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 8180L)
    private static SubLSymbol $bag_repeat_contents_iterator_watermark$;
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 12330L)
    public static SubLSymbol $new_bag_default_test_function$;
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 26265L)
    private static SubLSymbol $cfasl_opcode_bag$;
    private static final SubLSymbol $sym0$BAG;
    private static final SubLSymbol $sym1$BAG_P;
    private static final SubLInteger $int2$138;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_BAG;
    private static final SubLSymbol $sym8$BAG_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$BAG_STRUCT_UNIQUE_CONTENTS;
    private static final SubLSymbol $sym11$_CSETF_BAG_STRUCT_UNIQUE_CONTENTS;
    private static final SubLSymbol $sym12$BAG_STRUCT_REPEAT_CONTENTS;
    private static final SubLSymbol $sym13$_CSETF_BAG_STRUCT_REPEAT_CONTENTS;
    private static final SubLSymbol $sym14$BAG_STRUCT_REPEAT_SIZE;
    private static final SubLSymbol $sym15$_CSETF_BAG_STRUCT_REPEAT_SIZE;
    private static final SubLSymbol $sym16$BAG_STRUCT_TEST;
    private static final SubLSymbol $sym17$_CSETF_BAG_STRUCT_TEST;
    private static final SubLSymbol $kw18$UNIQUE_CONTENTS;
    private static final SubLSymbol $kw19$REPEAT_CONTENTS;
    private static final SubLSymbol $kw20$REPEAT_SIZE;
    private static final SubLSymbol $kw21$TEST;
    private static final SubLString $str22$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw23$BEGIN;
    private static final SubLSymbol $sym24$MAKE_BAG;
    private static final SubLSymbol $kw25$SLOT;
    private static final SubLSymbol $kw26$END;
    private static final SubLSymbol $sym27$VISIT_DEFSTRUCT_OBJECT_BAG_METHOD;
    private static final SubLString $str28$_;
    private static final SubLString $str29$_impl_;
    private static final SubLString $str30$__;
    private static final SubLString $str31$_;
    private static final SubLString $str32$_size_;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw36$DONE;
    private static final SubLSymbol $sym37$DO_DICTIONARY_CONTENTS;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$CURR_ELEMENT;
    private static final SubLSymbol $sym40$ELEMENT_COUNT;
    private static final SubLSymbol $sym41$INDEX;
    private static final SubLSymbol $sym42$DO_BAG_REPEAT_CONTENTS_UNIQUE;
    private static final SubLSymbol $sym43$CDOTIMES;
    private static final SubLSymbol $sym44$CLET;
    private static final SubLList $list45;
    private static final SubLSymbol $kw46$UNINITIALIZED;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$ITERATE_BAG_NEXT;
    private static final SubLSymbol $sym49$ITERATE_BAG_DONE;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$DO_SET_CONTENTS;
    private static final SubLSymbol $sym52$VALID_HASH_TEST_P;
    private static final SubLSymbol $sym53$INTEGERP;
    private static final SubLSymbol $sym54$LISTP;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$PROGN;
    private static final SubLSymbol $sym57$DO_BAG_REPEAT_INTERNAL;
    private static final SubLSymbol $sym58$PUNLESS;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$DO_BAG_UNIQUE_CONTENTS;
    private static final SubLSymbol $sym61$DO_BAG_UNIQUE_INTERNAL;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$CURRENT_ELEMENT;
    private static final SubLSymbol $sym64$INDEX;
    private static final SubLSymbol $sym65$ELEMENT_COUNT;
    private static final SubLSymbol $sym66$DO_BAG_UNIQUE;
    private static final SubLInteger $int67$62;
    private static final SubLSymbol $sym68$CFASL_INPUT_BAG;
    private static final SubLSymbol $sym69$CFASL_OUTPUT_OBJECT_BAG_METHOD;
    private static final SubLString $str70$CFASL_loaded_bag__A_does_not_have;
    private static final SubLString $str71$CFASL_loaded_bag__A_has_more_than;
    private static final SubLString $str72$CFASL_loaded_bag__A_does_not_repr;
    private static final SubLSymbol $sym73$BAG_UNIT_TEST_KITCHEN_SINK;
    private static final SubLSymbol $kw74$OWNER;
    private static final SubLSymbol $kw75$CLASSES;
    private static final SubLSymbol $kw76$KB;
    private static final SubLSymbol $kw77$TINY;
    private static final SubLSymbol $kw78$WORKING_;
    private static final SubLList $list79;
    private static final SubLString $str80$bag_not_empty;
    private static final SubLString $str81$bag_size____item_count;
    private static final SubLString $str82$bag_member_count_out_of_whack;
    private static final SubLString $str83$added_bag_members_not_findable;
    private static final SubLString $str84$cannot_find_existing_member_again;
    private static final SubLString $str85$do_bag_existing_element_not_there;
    private static final SubLString $str86$do_list_existing_element_not_ther;
    private static final SubLString $str87$iterator_existing_element_not_the;
    private static final SubLString $str88$unique_element_list_wrong;
    private static final SubLList $list89;
    private static final SubLString $str90$bag_element_count_tuple_contains_;
    private static final SubLString $str91$bag_element_count_tuple_contains_;
    private static final SubLString $str92$list_of_elements_has_bogus_length;
    private static final SubLString $str93$CFASLed_bag_has_different_size_;
    private static final SubLString $str94$CFASLed_bag_has_different_unique_;
    private static final SubLString $str95$CFASLed_bag_does_not_contain_elem;
    private static final SubLString $str96$CFASLed_bag_does_not_contain_elem;
    private static final SubLString $str97$removing_items_whacks_bag_size;
    private static final SubLString $str98$removing_items_whacks_member_coun;
    private static final SubLString $str99$emptied_bag_is_not_empty;
    private static final SubLSymbol $kw100$SUCCESS;
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject bag_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_bag(v_object, stream, (SubLObject)bag.ZERO_INTEGER);
        return (SubLObject)bag.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject bag_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $bag_native.class) ? bag.T : bag.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject bag_struct_unique_contents(final SubLObject v_object) {
        assert bag.NIL != bag_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject bag_struct_repeat_contents(final SubLObject v_object) {
        assert bag.NIL != bag_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject bag_struct_repeat_size(final SubLObject v_object) {
        assert bag.NIL != bag_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject bag_struct_test(final SubLObject v_object) {
        assert bag.NIL != bag_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject _csetf_bag_struct_unique_contents(final SubLObject v_object, final SubLObject value) {
        assert bag.NIL != bag_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject _csetf_bag_struct_repeat_contents(final SubLObject v_object, final SubLObject value) {
        assert bag.NIL != bag_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject _csetf_bag_struct_repeat_size(final SubLObject v_object, final SubLObject value) {
        assert bag.NIL != bag_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject _csetf_bag_struct_test(final SubLObject v_object, final SubLObject value) {
        assert bag.NIL != bag_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject make_bag(SubLObject arglist) {
        if (arglist == bag.UNPROVIDED) {
            arglist = (SubLObject)bag.NIL;
        }
        final SubLObject v_new = (SubLObject)new $bag_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)bag.NIL, next = arglist; bag.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)bag.$kw18$UNIQUE_CONTENTS)) {
                _csetf_bag_struct_unique_contents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)bag.$kw19$REPEAT_CONTENTS)) {
                _csetf_bag_struct_repeat_contents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)bag.$kw20$REPEAT_SIZE)) {
                _csetf_bag_struct_repeat_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)bag.$kw21$TEST)) {
                _csetf_bag_struct_test(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)bag.$str22$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject visit_defstruct_bag(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)bag.$kw23$BEGIN, (SubLObject)bag.$sym24$MAKE_BAG, (SubLObject)bag.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)bag.$kw25$SLOT, (SubLObject)bag.$kw18$UNIQUE_CONTENTS, bag_struct_unique_contents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)bag.$kw25$SLOT, (SubLObject)bag.$kw19$REPEAT_CONTENTS, bag_struct_repeat_contents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)bag.$kw25$SLOT, (SubLObject)bag.$kw20$REPEAT_SIZE, bag_struct_repeat_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)bag.$kw25$SLOT, (SubLObject)bag.$kw21$TEST, bag_struct_test(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)bag.$kw26$END, (SubLObject)bag.$sym24$MAKE_BAG, (SubLObject)bag.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 1942L)
    public static SubLObject visit_defstruct_object_bag_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_bag(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 2315L)
    public static SubLObject print_bag(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (bag.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)bag.T, (SubLObject)bag.T);
            streams_high.write_string((SubLObject)bag.$str28$_, stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
            print_high.princ(hash_table_utilities.hash_test_to_symbol(bag_struct_test(v_object)), stream);
            streams_high.write_string((SubLObject)bag.$str29$_impl_, stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
            print_high.princ(set_contents.set_contents_style(bag_struct_unique_contents(v_object)), stream);
            streams_high.write_string((SubLObject)bag.$str30$__, stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
            print_high.princ(dictionary_contents.dictionary_contents_style(bag_struct_repeat_contents(v_object)), stream);
            streams_high.write_string((SubLObject)bag.$str31$_, stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
            streams_high.write_string((SubLObject)bag.$str32$_size_, stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
            print_high.princ(bag_size(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)bag.T, (SubLObject)bag.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 2939L)
    public static SubLObject make_new_bag(final SubLObject test, final SubLObject repeat_size, final SubLObject unique_contents, final SubLObject repeat_contents) {
        final SubLObject v_bag = make_bag((SubLObject)bag.UNPROVIDED);
        _csetf_bag_struct_test(v_bag, test);
        _csetf_bag_struct_repeat_size(v_bag, repeat_size);
        _csetf_bag_struct_repeat_contents(v_bag, repeat_contents);
        _csetf_bag_struct_unique_contents(v_bag, unique_contents);
        return v_bag;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 3427L)
    public static SubLObject new_bag_repeat_contents(final SubLObject size, final SubLObject test) {
        return dictionary_contents.new_dictionary_contents(size, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 3635L)
    public static SubLObject copy_bag_repeat_contents(final SubLObject bag_repeat_contents) {
        return dictionary_contents.copy_dictionary_contents(bag_repeat_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 3756L)
    public static SubLObject bag_repeat_contents_unique_size(final SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_size(bag_repeat_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 3884L)
    public static SubLObject bag_repeat_contents_emptyP(final SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_empty_p(bag_repeat_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 4009L)
    public static SubLObject bag_repeat_contents_member_count(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        return dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, (SubLObject)bag.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 4191L)
    public static SubLObject bag_repeat_contents_memberP(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        return Numbers.plusp(bag_repeat_contents_member_count(element, bag_repeat_contents, test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 4356L)
    public static SubLObject bag_repeat_contents_matching_element(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        return (SubLObject)((bag.NIL != bag_repeat_contents_memberP(element, bag_repeat_contents, test)) ? element : bag.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 4537L)
    public static SubLObject bag_repeat_contents_random_element(final SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_random_key(bag_repeat_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 4675L)
    public static SubLObject bag_repeat_contents_add(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        SubLObject times = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, (SubLObject)bag.ONE_INTEGER);
        times = Numbers.add(times, (SubLObject)bag.ONE_INTEGER);
        return dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, times, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 5068L)
    public static SubLObject bag_repeat_contents_delete(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        SubLObject times = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, (SubLObject)bag.ZERO_INTEGER);
        if (!times.isPositive()) {
            return (SubLObject)bag.NIL;
        }
        times = Numbers.subtract(times, (SubLObject)bag.ONE_INTEGER);
        if (bag.ONE_INTEGER.numL(times)) {
            return dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, times, test);
        }
        return dictionary_contents.dictionary_contents_delete(bag_repeat_contents, element, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 5573L)
    public static SubLObject bag_repeat_contents_delete_all(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        final SubLObject times = bag_repeat_contents_member_count(element, bag_repeat_contents, test);
        return Values.values(dictionary_contents.dictionary_contents_delete(bag_repeat_contents, element, test), times);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 5852L)
    public static SubLObject clear_bag_repeat_contents(final SubLObject bag_repeat_contents) {
        return dictionary_contents.clear_dictionary_contents(bag_repeat_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 5977L)
    public static SubLObject do_bag_repeat_contents_unique(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)bag.NIL;
        SubLObject element_count = (SubLObject)bag.NIL;
        SubLObject bag_repeat_contents = (SubLObject)bag.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list33);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list33);
        element_count = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list33);
        bag_repeat_contents = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)bag.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)bag.NIL;
        SubLObject current_$1 = (SubLObject)bag.NIL;
        while (bag.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bag.$list33);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bag.$list33);
            if (bag.NIL == conses_high.member(current_$1, (SubLObject)bag.$list34, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED)) {
                bad = (SubLObject)bag.T;
            }
            if (current_$1 == bag.$kw35$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (bag.NIL != bad && bag.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)bag.$list33);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)bag.$kw36$DONE, current);
        final SubLObject done = (SubLObject)((bag.NIL != done_tail) ? conses_high.cadr(done_tail) : bag.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)bag.$sym37$DO_DICTIONARY_CONTENTS, (SubLObject)ConsesLow.list(element_var, element_count, bag_repeat_contents, (SubLObject)bag.$kw36$DONE, done), ConsesLow.append(body, (SubLObject)bag.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 6214L)
    public static SubLObject do_bag_repeat_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)bag.NIL;
        SubLObject bag_repeat_contents = (SubLObject)bag.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list38);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list38);
        bag_repeat_contents = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)bag.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)bag.NIL;
        SubLObject current_$2 = (SubLObject)bag.NIL;
        while (bag.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bag.$list38);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bag.$list38);
            if (bag.NIL == conses_high.member(current_$2, (SubLObject)bag.$list34, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED)) {
                bad = (SubLObject)bag.T;
            }
            if (current_$2 == bag.$kw35$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (bag.NIL != bad && bag.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)bag.$list38);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)bag.$kw36$DONE, current);
        final SubLObject done = (SubLObject)((bag.NIL != done_tail) ? conses_high.cadr(done_tail) : bag.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject curr_element = (SubLObject)bag.$sym39$CURR_ELEMENT;
        final SubLObject element_count = (SubLObject)bag.$sym40$ELEMENT_COUNT;
        final SubLObject index = (SubLObject)bag.$sym41$INDEX;
        return (SubLObject)ConsesLow.list((SubLObject)bag.$sym42$DO_BAG_REPEAT_CONTENTS_UNIQUE, (SubLObject)ConsesLow.list(curr_element, element_count, bag_repeat_contents, (SubLObject)bag.$kw36$DONE, done), (SubLObject)ConsesLow.list((SubLObject)bag.$sym43$CDOTIMES, (SubLObject)ConsesLow.list(index, element_count), (SubLObject)ConsesLow.listS((SubLObject)bag.$sym44$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(element_var, curr_element)), ConsesLow.append(body, (SubLObject)bag.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 6599L)
    public static SubLObject map_bag_repeat_contents(final SubLObject function, final SubLObject bag_repeat_contents, SubLObject args) {
        if (args == bag.UNPROVIDED) {
            args = (SubLObject)bag.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(bag_repeat_contents); bag.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject curr_element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject element_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject index;
            SubLObject element_var;
            for (index = (SubLObject)bag.NIL, index = (SubLObject)bag.ZERO_INTEGER; index.numL(element_count); index = Numbers.add(index, (SubLObject)bag.ONE_INTEGER)) {
                element_var = curr_element;
                Functions.apply(function, element_var, args);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)bag.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 6798L)
    public static SubLObject bag_repeat_contents_element_list(final SubLObject bag_repeat_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject values = (SubLObject)bag.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(bag_repeat_contents); bag.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject curr_element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject element_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject index;
            SubLObject element_var;
            for (index = (SubLObject)bag.NIL, index = (SubLObject)bag.ZERO_INTEGER; index.numL(element_count); index = Numbers.add(index, (SubLObject)bag.ONE_INTEGER)) {
                element_var = curr_element;
                values = (SubLObject)ConsesLow.cons(element_var, values);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 7002L)
    public static SubLObject bag_repeat_contents_unique_element_list(final SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_keys(bag_repeat_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 7137L)
    public static SubLObject make_bag_iterator_state(final SubLObject bag_repeat_contents) {
        final SubLObject contents_iterator = dictionary_contents.new_dictionary_contents_iterator(bag_repeat_contents);
        return (SubLObject)ConsesLow.list((SubLObject)bag.ZERO_INTEGER, (SubLObject)bag.NIL, contents_iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 7361L)
    public static SubLObject iterate_bag_done(final SubLObject state) {
        SubLObject times = (SubLObject)bag.NIL;
        SubLObject element = (SubLObject)bag.NIL;
        SubLObject contents_iterator = (SubLObject)bag.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)bag.$list45);
        times = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)bag.$list45);
        element = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)bag.$list45);
        contents_iterator = current.first();
        current = current.rest();
        if (bag.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(times.isZero() && (bag.$kw46$UNINITIALIZED == contents_iterator || bag.NIL != iteration.iteration_done(contents_iterator)));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)bag.$list45);
        return (SubLObject)bag.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 7643L)
    public static SubLObject iterate_bag_next(final SubLObject state) {
        SubLObject times = (SubLObject)bag.NIL;
        SubLObject element = (SubLObject)bag.NIL;
        SubLObject contents_iterator = (SubLObject)bag.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)bag.$list45);
        times = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)bag.$list45);
        element = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)bag.$list45);
        contents_iterator = current.first();
        current = current.rest();
        if (bag.NIL == current) {
            if (times.isZero()) {
                final SubLObject entry = iteration.iteration_next(contents_iterator);
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = entry;
                SubLObject key = (SubLObject)bag.NIL;
                SubLObject value = (SubLObject)bag.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)bag.$list47);
                key = current_$4.first();
                current_$4 = current_$4.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)bag.$list47);
                value = current_$4.first();
                current_$4 = current_$4.rest();
                if (bag.NIL == current_$4) {
                    element = key;
                    times = value;
                    ConsesLow.set_nth((SubLObject)bag.ONE_INTEGER, state, element);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$3, (SubLObject)bag.$list47);
                }
                if (bag.NIL != iteration.iteration_done(contents_iterator)) {
                    ConsesLow.set_nth((SubLObject)bag.TWO_INTEGER, state, (SubLObject)bag.$kw46$UNINITIALIZED);
                }
            }
            if (times.isPositive()) {
                times = Numbers.subtract(times, (SubLObject)bag.ONE_INTEGER);
                ConsesLow.set_nth((SubLObject)bag.ZERO_INTEGER, state, times);
            }
            return Values.values(element, state);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)bag.$list45);
        return (SubLObject)bag.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 8354L)
    public static SubLObject new_bag_repeat_contents_iterator(final SubLObject bag_repeat_contents) {
        if (bag.NIL != dictionary_contents.dictionary_contents_empty_p(bag_repeat_contents)) {
            return iteration.new_null_iterator();
        }
        if (dictionary_contents.dictionary_contents_size(bag_repeat_contents).numL(bag.$bag_repeat_contents_iterator_watermark$.getGlobalValue())) {
            return iteration.new_list_iterator(bag_repeat_contents_element_list(bag_repeat_contents));
        }
        return iteration.new_iterator(make_bag_iterator_state(bag_repeat_contents), (SubLObject)bag.$sym48$ITERATE_BAG_NEXT, (SubLObject)bag.$sym49$ITERATE_BAG_DONE, (SubLObject)bag.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 8850L)
    public static SubLObject new_bag_unique_contents(final SubLObject size, final SubLObject test) {
        return set_contents.new_set_contents(size, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 9064L)
    public static SubLObject copy_bag_unique_contents(final SubLObject bag_unique_contents) {
        return set_contents.copy_set_contents(bag_unique_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 9178L)
    public static SubLObject bag_unique_contents_unique_size(final SubLObject bag_unique_contents) {
        return set_contents.set_contents_size(bag_unique_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 9299L)
    public static SubLObject bag_unique_contents_emptyP(final SubLObject bag_unique_contents) {
        return set_contents.set_contents_emptyP(bag_unique_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 9416L)
    public static SubLObject bag_unique_contents_memberP(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return set_contents.set_contents_memberP(element, bag_unique_contents, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 9561L)
    public static SubLObject bag_unique_contents_member_count(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return (SubLObject)((bag.NIL != bag_unique_contents_memberP(element, bag_unique_contents, test)) ? bag.ONE_INTEGER : bag.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 9740L)
    public static SubLObject bag_unique_contents_matching_element(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return set_contents.set_contents_matching_element(element, bag_unique_contents, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 9905L)
    public static SubLObject bag_unique_contents_random_element(final SubLObject bag_unique_contents) {
        return set_contents.set_contents_random_element(bag_unique_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 10040L)
    public static SubLObject bag_unique_contents_add(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return set_contents.set_contents_add(element, bag_unique_contents, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 10178L)
    public static SubLObject bag_unique_contents_delete(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return set_contents.set_contents_delete(element, bag_unique_contents, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 10323L)
    public static SubLObject bag_unique_contents_delete_all(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return set_contents.set_contents_delete(element, bag_unique_contents, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 10474L)
    public static SubLObject clear_bag_unique_contents(final SubLObject bag_unique_contents) {
        return set_contents.clear_set_contents(bag_unique_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 10592L)
    public static SubLObject do_bag_unique_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)bag.NIL;
        SubLObject bag_unique_contents = (SubLObject)bag.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list50);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list50);
        bag_unique_contents = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)bag.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)bag.NIL;
        SubLObject current_$5 = (SubLObject)bag.NIL;
        while (bag.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bag.$list50);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bag.$list50);
            if (bag.NIL == conses_high.member(current_$5, (SubLObject)bag.$list34, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED)) {
                bad = (SubLObject)bag.T;
            }
            if (current_$5 == bag.$kw35$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (bag.NIL != bad && bag.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)bag.$list50);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)bag.$kw36$DONE, current);
        final SubLObject done = (SubLObject)((bag.NIL != done_tail) ? conses_high.cadr(done_tail) : bag.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)bag.$sym51$DO_SET_CONTENTS, (SubLObject)ConsesLow.list(element_var, bag_unique_contents, (SubLObject)bag.$kw36$DONE, done), ConsesLow.append(body, (SubLObject)bag.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 10786L)
    public static SubLObject map_bag_unique_contents(final SubLObject function, final SubLObject bag_unique_contents, SubLObject args) {
        if (args == bag.UNPROVIDED) {
            args = (SubLObject)bag.NIL;
        }
        SubLObject basis_object;
        SubLObject state;
        SubLObject element_var;
        for (basis_object = set_contents.do_set_contents_basis_object(bag_unique_contents), state = (SubLObject)bag.NIL, state = set_contents.do_set_contents_initial_state(basis_object, bag_unique_contents); bag.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element_var = set_contents.do_set_contents_next(basis_object, state);
            if (bag.NIL != set_contents.do_set_contents_element_validP(state, element_var)) {
                Functions.apply(function, element_var, args);
            }
        }
        return (SubLObject)bag.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 10985L)
    public static SubLObject bag_unique_contents_element_list(final SubLObject bag_unique_contents) {
        SubLObject values = (SubLObject)bag.NIL;
        SubLObject basis_object;
        SubLObject state;
        SubLObject element_var;
        for (basis_object = set_contents.do_set_contents_basis_object(bag_unique_contents), state = (SubLObject)bag.NIL, state = set_contents.do_set_contents_initial_state(basis_object, bag_unique_contents); bag.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element_var = set_contents.do_set_contents_next(basis_object, state);
            if (bag.NIL != set_contents.do_set_contents_element_validP(state, element_var)) {
                values = (SubLObject)ConsesLow.cons(element_var, values);
            }
        }
        return values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 11189L)
    public static SubLObject bag_unique_contents_unique_element_list(final SubLObject bag_unique_contents) {
        return set_contents.set_contents_element_list(bag_unique_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 11325L)
    public static SubLObject new_bag_unique_contents_iterator(final SubLObject bag_unique_contents) {
        if (bag.NIL != bag_unique_contents_emptyP(bag_unique_contents)) {
            return iteration.new_null_iterator();
        }
        return set_contents.new_set_contents_iterator(bag_unique_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 11557L)
    public static SubLObject new_bag_contents_iterator(final SubLObject bag_unique_contents, final SubLObject bag_repeat_contents) {
        if (bag.NIL != bag_unique_contents_emptyP(bag_unique_contents)) {
            return new_bag_repeat_contents_iterator(bag_repeat_contents);
        }
        if (bag.NIL != bag_repeat_contents_emptyP(bag_repeat_contents)) {
            return new_bag_unique_contents_iterator(bag_unique_contents);
        }
        return iteration.new_iterator_iterator((SubLObject)ConsesLow.list(new_bag_unique_contents_iterator(bag_unique_contents), new_bag_repeat_contents_iterator(bag_repeat_contents)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 12593L)
    public static SubLObject new_bag(SubLObject test, SubLObject size) {
        if (test == bag.UNPROVIDED) {
            test = bag.$new_bag_default_test_function$.getGlobalValue();
        }
        if (size == bag.UNPROVIDED) {
            size = (SubLObject)bag.ZERO_INTEGER;
        }
        assert bag.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        assert bag.NIL != Types.integerp(size) : size;
        if (test.isSymbol()) {
            test = Symbols.symbol_function(test);
        }
        final SubLObject unique_size = Numbers.integerDivide(size, (SubLObject)bag.TWO_INTEGER);
        final SubLObject repeat_size = Numbers.integerDivide(unique_size, (SubLObject)bag.TWO_INTEGER);
        return make_new_bag(test, (SubLObject)bag.ZERO_INTEGER, new_bag_unique_contents(unique_size, test), new_bag_repeat_contents(repeat_size, test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 13264L)
    public static SubLObject copy_bag(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        final SubLObject new_bag_repeat_contents = copy_bag_repeat_contents(bag_struct_repeat_contents(v_bag));
        final SubLObject new_bag_unique_contents = copy_bag_unique_contents(bag_struct_unique_contents(v_bag));
        return make_new_bag(bag_test(v_bag), bag_struct_repeat_size(v_bag), new_bag_unique_contents, new_bag_repeat_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 13702L)
    public static SubLObject new_bag_from_elements(final SubLObject elements, SubLObject test, SubLObject size) {
        if (test == bag.UNPROVIDED) {
            test = bag.$new_bag_default_test_function$.getGlobalValue();
        }
        if (size == bag.UNPROVIDED) {
            size = (SubLObject)bag.NIL;
        }
        assert bag.NIL != Types.listp(elements) : elements;
        if (bag.NIL == size) {
            size = Sequences.length(elements);
        }
        final SubLObject v_bag = new_bag(test, size);
        SubLObject cdolist_list_var = elements;
        SubLObject element = (SubLObject)bag.NIL;
        element = cdolist_list_var.first();
        while (bag.NIL != cdolist_list_var) {
            bag_add(element, v_bag);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return v_bag;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 14219L)
    public static SubLObject bag_test(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        return bag_struct_test(v_bag);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 14426L)
    public static SubLObject bag_size(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        return Numbers.add(bag_unique_contents_unique_size(bag_struct_unique_contents(v_bag)), bag_struct_repeat_size(v_bag));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 14680L)
    public static SubLObject bag_unique_size(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        return Numbers.add(bag_unique_contents_unique_size(bag_struct_unique_contents(v_bag)), bag_repeat_contents_unique_size(bag_struct_repeat_contents(v_bag)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 14958L)
    public static SubLObject bag_emptyP(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        return (SubLObject)SubLObjectFactory.makeBoolean(bag.NIL != bag_repeat_contents_emptyP(bag_struct_repeat_contents(v_bag)) && bag.NIL != bag_unique_contents_emptyP(bag_struct_unique_contents(v_bag)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 15233L)
    public static SubLObject empty_bag_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(bag.NIL != bag_p(obj) && bag.NIL != bag_emptyP(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 15361L)
    public static SubLObject non_empty_bag_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(bag.NIL != bag_p(obj) && bag.NIL == bag_emptyP(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 15503L)
    public static SubLObject bag_memberP(final SubLObject element, final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        final SubLObject test = bag_struct_test(v_bag);
        return (SubLObject)SubLObjectFactory.makeBoolean(bag.NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test) || bag.NIL != bag_repeat_contents_memberP(element, bag_struct_repeat_contents(v_bag), test));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 15869L)
    public static SubLObject bag_member_count(final SubLObject element, final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        final SubLObject test = bag_struct_test(v_bag);
        if (bag.NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
            return (SubLObject)bag.ONE_INTEGER;
        }
        return bag_repeat_contents_member_count(element, bag_struct_repeat_contents(v_bag), test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 16248L)
    public static SubLObject bag_matching_element(final SubLObject element, final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        final SubLObject test = bag_struct_test(v_bag);
        final SubLObject result = bag_unique_contents_matching_element(element, bag_struct_unique_contents(v_bag), test);
        if (bag.NIL != Functions.funcall(test, element, result)) {
            return result;
        }
        return bag_repeat_contents_matching_element(element, bag_struct_repeat_contents(v_bag), test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 16838L)
    public static SubLObject bag_random_element(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        if (bag.NIL != bag_unique_contents_emptyP(bag_struct_unique_contents(v_bag))) {
            return bag_repeat_contents_random_element(bag_struct_repeat_contents(v_bag));
        }
        return bag_unique_contents_random_element(bag_struct_unique_contents(v_bag));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 17194L)
    public static SubLObject bag_add(final SubLObject element, final SubLObject v_bag) {
        final SubLObject test = bag_struct_test(v_bag);
        SubLObject presentP = (SubLObject)bag.NIL;
        if (bag.NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
            presentP = (SubLObject)bag.T;
            _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_delete(element, bag_struct_unique_contents(v_bag), test));
            _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_add(element, bag_struct_repeat_contents(v_bag), test));
            _csetf_bag_struct_repeat_size(v_bag, Numbers.add(bag_struct_repeat_size(v_bag), (SubLObject)bag.TWO_INTEGER));
        }
        else if (bag.NIL != bag_repeat_contents_memberP(element, bag_struct_repeat_contents(v_bag), test)) {
            presentP = (SubLObject)bag.T;
            _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_add(element, bag_struct_repeat_contents(v_bag), test));
            _csetf_bag_struct_repeat_size(v_bag, Numbers.add(bag_struct_repeat_size(v_bag), (SubLObject)bag.ONE_INTEGER));
        }
        else {
            _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_add(element, bag_struct_unique_contents(v_bag), test));
        }
        return presentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 18595L)
    public static SubLObject bag_remove(final SubLObject element, final SubLObject v_bag) {
        final SubLObject test = bag_struct_test(v_bag);
        final SubLObject repeat_member_count = bag_repeat_contents_member_count(element, bag_struct_repeat_contents(v_bag), test);
        SubLObject presentP = (SubLObject)bag.NIL;
        if (bag.TWO_INTEGER.numE(repeat_member_count)) {
            _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_delete(element, bag_struct_repeat_contents(v_bag), test));
            _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_add(element, bag_struct_unique_contents(v_bag), test));
            _csetf_bag_struct_repeat_size(v_bag, Numbers.subtract(bag_struct_repeat_size(v_bag), (SubLObject)bag.TWO_INTEGER));
            presentP = (SubLObject)bag.T;
        }
        else if (repeat_member_count.isPositive()) {
            _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_delete(element, bag_struct_repeat_contents(v_bag), test));
            _csetf_bag_struct_repeat_size(v_bag, Numbers.subtract(bag_struct_repeat_size(v_bag), (SubLObject)bag.ONE_INTEGER));
            presentP = (SubLObject)bag.T;
        }
        else if (bag.NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
            _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_delete(element, bag_struct_unique_contents(v_bag), test));
            presentP = (SubLObject)bag.T;
        }
        return presentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 19948L)
    public static SubLObject bag_remove_all(final SubLObject element, final SubLObject v_bag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = bag_struct_test(v_bag);
        thread.resetMultipleValues();
        final SubLObject changed_bag_contents = bag_repeat_contents_delete_all(element, bag_struct_repeat_contents(v_bag), test);
        final SubLObject times = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (times.isPositive()) {
            _csetf_bag_struct_repeat_contents(v_bag, changed_bag_contents);
            _csetf_bag_struct_repeat_size(v_bag, Numbers.subtract(bag_struct_repeat_size(v_bag), times));
            return (SubLObject)bag.T;
        }
        if (bag.NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
            _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_delete_all(element, bag_struct_unique_contents(v_bag), test));
            return (SubLObject)bag.T;
        }
        return (SubLObject)bag.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 20991L)
    public static SubLObject clear_bag(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        _csetf_bag_struct_repeat_contents(v_bag, clear_bag_repeat_contents(bag_struct_repeat_contents(v_bag)));
        _csetf_bag_struct_unique_contents(v_bag, clear_bag_unique_contents(bag_struct_unique_contents(v_bag)));
        _csetf_bag_struct_repeat_size(v_bag, (SubLObject)bag.ZERO_INTEGER);
        return v_bag;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 21420L)
    public static SubLObject bag_intersection(final SubLObject bag1, final SubLObject bag2) {
        final SubLObject bag1_unique_elements = bag_unique_element_list(bag1);
        final SubLObject bag2_unique_elements = bag_unique_element_list(bag2);
        final SubLObject unique_elem_intersection = conses_high.intersection(bag1_unique_elements, bag2_unique_elements, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        final SubLObject intersection_bag = new_bag_from_elements(unique_elem_intersection, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        SubLObject cdolist_list_var = unique_elem_intersection;
        SubLObject elem = (SubLObject)bag.NIL;
        elem = cdolist_list_var.first();
        while (bag.NIL != cdolist_list_var) {
            final SubLObject bag1_elem_count = bag_member_count(elem, bag1);
            final SubLObject bag2_elem_count = bag_member_count(elem, bag2);
            SubLObject elem_min_count;
            SubLObject i;
            for (elem_min_count = Numbers.subtract(Numbers.min(bag1_elem_count, bag2_elem_count), (SubLObject)bag.ONE_INTEGER), i = (SubLObject)bag.NIL, i = (SubLObject)bag.ZERO_INTEGER; i.numL(elem_min_count); i = Numbers.add(i, (SubLObject)bag.ONE_INTEGER)) {
                bag_add(elem, intersection_bag);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return intersection_bag;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 22179L)
    public static SubLObject bag_union(final SubLObject bag1, final SubLObject bag2) {
        final SubLObject bag1_unique_elements = bag_unique_element_list(bag1);
        final SubLObject bag2_unique_elements = bag_unique_element_list(bag2);
        final SubLObject unique_elem_union = conses_high.union(bag1_unique_elements, bag2_unique_elements, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        final SubLObject union_bag = new_bag_from_elements(unique_elem_union, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        SubLObject cdolist_list_var = unique_elem_union;
        SubLObject elem = (SubLObject)bag.NIL;
        elem = cdolist_list_var.first();
        while (bag.NIL != cdolist_list_var) {
            final SubLObject bag1_elem_count = bag_member_count(elem, bag1);
            final SubLObject bag2_elem_count = bag_member_count(elem, bag2);
            SubLObject elem_max_count;
            SubLObject i;
            for (elem_max_count = Numbers.subtract(Numbers.max(bag1_elem_count, bag2_elem_count), (SubLObject)bag.ONE_INTEGER), i = (SubLObject)bag.NIL, i = (SubLObject)bag.ZERO_INTEGER; i.numL(elem_max_count); i = Numbers.add(i, (SubLObject)bag.ONE_INTEGER)) {
                bag_add(elem, union_bag);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return union_bag;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 22788L)
    public static SubLObject new_bag_iterator(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        return new_bag_contents_iterator(bag_struct_unique_contents(v_bag), bag_struct_repeat_contents(v_bag));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 23044L)
    public static SubLObject do_bag_unique(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)bag.NIL;
        SubLObject element_count = (SubLObject)bag.NIL;
        SubLObject v_bag = (SubLObject)bag.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list55);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list55);
        element_count = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list55);
        v_bag = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)bag.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)bag.NIL;
        SubLObject current_$6 = (SubLObject)bag.NIL;
        while (bag.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bag.$list55);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bag.$list55);
            if (bag.NIL == conses_high.member(current_$6, (SubLObject)bag.$list34, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED)) {
                bad = (SubLObject)bag.T;
            }
            if (current_$6 == bag.$kw35$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (bag.NIL != bad && bag.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)bag.$list55);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)bag.$kw36$DONE, current);
        final SubLObject done = (SubLObject)((bag.NIL != done_tail) ? conses_high.cadr(done_tail) : bag.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)bag.$sym56$PROGN, (SubLObject)ConsesLow.listS((SubLObject)bag.$sym42$DO_BAG_REPEAT_CONTENTS_UNIQUE, (SubLObject)ConsesLow.list(element_var, element_count, (SubLObject)ConsesLow.list((SubLObject)bag.$sym57$DO_BAG_REPEAT_INTERNAL, v_bag), (SubLObject)bag.$kw36$DONE, done), ConsesLow.append(body, (SubLObject)bag.NIL)), (SubLObject)ConsesLow.list((SubLObject)bag.$sym58$PUNLESS, done, (SubLObject)ConsesLow.list((SubLObject)bag.$sym44$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(element_count, (SubLObject)bag.$list59)), (SubLObject)ConsesLow.listS((SubLObject)bag.$sym60$DO_BAG_UNIQUE_CONTENTS, (SubLObject)ConsesLow.list(element_var, (SubLObject)ConsesLow.list((SubLObject)bag.$sym61$DO_BAG_UNIQUE_INTERNAL, v_bag), (SubLObject)bag.$kw36$DONE, done), ConsesLow.append(body, (SubLObject)bag.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 23842L)
    public static SubLObject do_bag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = (SubLObject)bag.NIL;
        SubLObject v_bag = (SubLObject)bag.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list62);
        element_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list62);
        v_bag = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)bag.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)bag.NIL;
        SubLObject current_$7 = (SubLObject)bag.NIL;
        while (bag.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bag.$list62);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bag.$list62);
            if (bag.NIL == conses_high.member(current_$7, (SubLObject)bag.$list34, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED)) {
                bad = (SubLObject)bag.T;
            }
            if (current_$7 == bag.$kw35$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (bag.NIL != bad && bag.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)bag.$list62);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)bag.$kw36$DONE, current);
        final SubLObject done = (SubLObject)((bag.NIL != done_tail) ? conses_high.cadr(done_tail) : bag.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject current_element = (SubLObject)bag.$sym63$CURRENT_ELEMENT;
        final SubLObject index = (SubLObject)bag.$sym64$INDEX;
        final SubLObject element_count = (SubLObject)bag.$sym65$ELEMENT_COUNT;
        return (SubLObject)ConsesLow.list((SubLObject)bag.$sym66$DO_BAG_UNIQUE, (SubLObject)ConsesLow.list(current_element, element_count, v_bag, (SubLObject)bag.$kw36$DONE, done), (SubLObject)ConsesLow.list((SubLObject)bag.$sym43$CDOTIMES, (SubLObject)ConsesLow.list(index, element_count), (SubLObject)ConsesLow.listS((SubLObject)bag.$sym44$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(element_var, current_element)), ConsesLow.append(body, (SubLObject)bag.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 24516L)
    public static SubLObject do_bag_repeat_internal(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        return bag_struct_repeat_contents(v_bag);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 24677L)
    public static SubLObject do_bag_unique_internal(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        return bag_struct_unique_contents(v_bag);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 24820L)
    public static SubLObject map_bag(final SubLObject function, final SubLObject v_bag, SubLObject args) {
        if (args == bag.UNPROVIDED) {
            args = (SubLObject)bag.NIL;
        }
        assert bag.NIL != bag_p(v_bag) : v_bag;
        map_bag_repeat_contents(function, bag_struct_repeat_contents(v_bag), args);
        map_bag_unique_contents(function, bag_struct_unique_contents(v_bag), args);
        return (SubLObject)bag.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 25253L)
    public static SubLObject bag_element_list(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        return ConsesLow.nconc(bag_repeat_contents_element_list(bag_struct_repeat_contents(v_bag)), bag_unique_contents_element_list(bag_struct_unique_contents(v_bag)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 25569L)
    public static SubLObject bag_unique_element_list(final SubLObject v_bag) {
        assert bag.NIL != bag_p(v_bag) : v_bag;
        return ConsesLow.nconc(bag_repeat_contents_unique_element_list(bag_struct_repeat_contents(v_bag)), bag_unique_contents_unique_element_list(bag_struct_unique_contents(v_bag)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 25956L)
    public static SubLObject bag_element_count_list(final SubLObject v_bag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert bag.NIL != bag_p(v_bag) : v_bag;
        SubLObject element_count_list = (SubLObject)bag.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(do_bag_repeat_internal(v_bag)); bag.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            element_count_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(element, count), element_count_list);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject count2 = (SubLObject)bag.ONE_INTEGER;
        final SubLObject set_contents_var = do_bag_unique_internal(v_bag);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)bag.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); bag.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element2 = set_contents.do_set_contents_next(basis_object, state);
            if (bag.NIL != set_contents.do_set_contents_element_validP(state, element2)) {
                element_count_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(element2, count2), element_count_list);
            }
        }
        return element_count_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 26379L)
    public static SubLObject cfasl_output_object_bag_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_bag(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 26490L)
    public static SubLObject cfasl_output_bag(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl.cfasl_raw_write_byte(bag.$cfasl_opcode_bag$.getGlobalValue(), stream);
        final SubLObject test = hash_table_utilities.hash_test_to_symbol(bag_test(v_object));
        final SubLObject size = bag_size(v_object);
        cfasl.cfasl_output(test, stream);
        cfasl.cfasl_output(size, stream);
        cfasl.cfasl_output(bag_unique_size(v_object), stream);
        final SubLObject singletons = bag_unique_contents_unique_size(bag_struct_unique_contents(v_object));
        final SubLObject multis = bag_repeat_contents_unique_size(bag_struct_repeat_contents(v_object));
        cfasl.cfasl_output(singletons, stream);
        final SubLObject set_contents_var = bag_struct_unique_contents(v_object);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)bag.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); bag.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (bag.NIL != set_contents.do_set_contents_element_validP(state, element)) {
                cfasl.cfasl_output(element, stream);
            }
        }
        cfasl.cfasl_output(multis, stream);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(bag_struct_repeat_contents(v_object)); bag.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject element2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cfasl.cfasl_output(element2, stream);
            cfasl.cfasl_output(count, stream);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 27530L)
    public static SubLObject cfasl_input_bag(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test = cfasl.cfasl_input(stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        final SubLObject size = cfasl.cfasl_input(stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        final SubLObject unique_element_count = cfasl.cfasl_input(stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        SubLObject singletons = (SubLObject)bag.NIL;
        SubLObject multis = (SubLObject)bag.NIL;
        SubLObject unique_collisions = (SubLObject)bag.NIL;
        SubLObject v_bag = (SubLObject)bag.NIL;
        SubLObject bag_unique_contents = (SubLObject)bag.NIL;
        SubLObject bag_repeat_contents = (SubLObject)bag.NIL;
        final SubLObject pcase_var = test;
        if (pcase_var.eql((SubLObject)bag.EQ) || pcase_var.eql((SubLObject)bag.EQL) || pcase_var.eql((SubLObject)bag.EQUAL) || pcase_var.eql((SubLObject)bag.EQUALP)) {
            test = Symbols.symbol_function(test);
        }
        singletons = cfasl.cfasl_input(stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        bag_unique_contents = set_contents.new_set_contents(singletons, test);
        unique_collisions = dictionary_contents.new_dictionary_contents((SubLObject)bag.ZERO_INTEGER, test);
        SubLObject i;
        SubLObject element;
        SubLObject old_count;
        for (i = (SubLObject)bag.NIL, i = (SubLObject)bag.ZERO_INTEGER; i.numL(singletons); i = Numbers.add(i, (SubLObject)bag.ONE_INTEGER)) {
            element = cfasl.cfasl_input(stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
            if (bag.NIL != dictionary_contents.dictionary_contents_lookup_without_values(unique_collisions, element, test, (SubLObject)bag.NIL)) {
                old_count = dictionary_contents.dictionary_contents_lookup_without_values(unique_collisions, element, test, (SubLObject)bag.ZERO_INTEGER);
                unique_collisions = dictionary_contents.dictionary_contents_enter(unique_collisions, element, Numbers.add(old_count, (SubLObject)bag.ONE_INTEGER), test);
            }
            else if (bag.NIL != set_contents.set_contents_memberP(element, bag_unique_contents, test)) {
                bag_unique_contents = set_contents.set_contents_delete(element, bag_unique_contents, test);
                unique_collisions = dictionary_contents.dictionary_contents_enter(unique_collisions, element, (SubLObject)bag.TWO_INTEGER, test);
            }
            else {
                bag_unique_contents = set_contents.set_contents_add(element, bag_unique_contents, test);
            }
        }
        multis = cfasl.cfasl_input(stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        final SubLObject repeats_from_unique_collisions = dictionary_contents.dictionary_contents_size(unique_collisions);
        final SubLObject repeat_contents_size = Numbers.add(multis, repeats_from_unique_collisions);
        bag_repeat_contents = dictionary_contents.new_dictionary_contents(repeat_contents_size, test);
        SubLObject count;
        SubLObject old_count2;
        for (i = (SubLObject)bag.NIL, i = (SubLObject)bag.ZERO_INTEGER; i.numL(multis); i = Numbers.add(i, (SubLObject)bag.ONE_INTEGER)) {
            element = cfasl.cfasl_input(stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
            count = cfasl.cfasl_input(stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
            old_count2 = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, (SubLObject)bag.ZERO_INTEGER);
            bag_repeat_contents = dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, Numbers.add(old_count2, count), test);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(unique_collisions); bag.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            old_count2 = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, (SubLObject)bag.ZERO_INTEGER);
            bag_repeat_contents = dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, Numbers.add(old_count2, count), test);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject repeat_size = Numbers.subtract(size, set_contents.set_contents_size(bag_unique_contents));
        v_bag = make_new_bag(test, repeat_size, bag_unique_contents, bag_repeat_contents);
        final SubLObject actual_unique_element_count = Numbers.add(bag_unique_contents_unique_size(bag_unique_contents), bag_repeat_contents_unique_size(bag_repeat_contents));
        if (bag.NIL != dictionary_contents.dictionary_contents_empty_p(unique_collisions)) {
            if (bag.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !unique_element_count.numE(actual_unique_element_count)) {
                Errors.error((SubLObject)bag.$str70$CFASL_loaded_bag__A_does_not_have, v_bag, unique_element_count);
            }
        }
        else if (bag.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !unique_element_count.numGE(actual_unique_element_count)) {
            Errors.error((SubLObject)bag.$str71$CFASL_loaded_bag__A_has_more_than, v_bag, unique_element_count);
        }
        if (bag.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !size.numE(bag_size(v_bag))) {
            Errors.error((SubLObject)bag.$str72$CFASL_loaded_bag__A_does_not_repr, v_bag, size);
        }
        return v_bag;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bag.lisp", position = 31771L)
    public static SubLObject bag_unit_test_kitchen_sink(final SubLObject test_keys, final SubLObject test_counts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_bag = new_bag((SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        SubLObject items = (SubLObject)bag.ZERO_INTEGER;
        if (bag.NIL == bag_emptyP(v_bag)) {
            return (SubLObject)bag.$str80$bag_not_empty;
        }
        SubLObject cdolist_list_var = test_keys;
        SubLObject key = (SubLObject)bag.NIL;
        key = cdolist_list_var.first();
        while (bag.NIL != cdolist_list_var) {
            SubLObject i;
            for (i = (SubLObject)bag.NIL, i = (SubLObject)bag.ZERO_INTEGER; i.numL(test_counts); i = Numbers.add(i, (SubLObject)bag.ONE_INTEGER)) {
                if (!items.numE(bag_size(v_bag))) {
                    return (SubLObject)bag.$str81$bag_size____item_count;
                }
                if (!i.numE(bag_member_count(key, v_bag))) {
                    return (SubLObject)bag.$str82$bag_member_count_out_of_whack;
                }
                bag_add(key, v_bag);
                if (bag.NIL == bag_memberP(key, v_bag)) {
                    return (SubLObject)bag.$str83$added_bag_members_not_findable;
                }
                items = Numbers.add(items, (SubLObject)bag.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(do_bag_repeat_internal(v_bag)); bag.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject element_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (bag.NIL == subl_promotions.memberP(element, test_keys, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED)) {
                return (SubLObject)bag.$str84$cannot_find_existing_member_again;
            }
            if (!element_count.numE(test_counts)) {
                return (SubLObject)bag.$str85$do_bag_existing_element_not_there;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject element_count2 = (SubLObject)bag.ONE_INTEGER;
        final SubLObject set_contents_var = do_bag_unique_internal(v_bag);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)bag.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); bag.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element2 = set_contents.do_set_contents_next(basis_object, state);
            if (bag.NIL != set_contents.do_set_contents_element_validP(state, element2)) {
                if (bag.NIL == subl_promotions.memberP(element2, test_keys, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED)) {
                    return (SubLObject)bag.$str84$cannot_find_existing_member_again;
                }
                if (!element_count2.numE(test_counts)) {
                    return (SubLObject)bag.$str85$do_bag_existing_element_not_there;
                }
            }
        }
        cdolist_list_var = test_keys;
        key = (SubLObject)bag.NIL;
        key = cdolist_list_var.first();
        while (bag.NIL != cdolist_list_var) {
            if (!bag_member_count(key, v_bag).numE(test_counts)) {
                return (SubLObject)bag.$str86$do_list_existing_element_not_ther;
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        final SubLObject iterator_var = new_bag_iterator(v_bag);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)bag.NIL; bag.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(bag.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject key2 = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (bag.NIL != valid && !bag_member_count(key2, v_bag).numE(test_counts)) {
                return (SubLObject)bag.$str87$iterator_existing_element_not_the;
            }
        }
        final SubLObject bag_keys = bag_unique_element_list(v_bag);
        if (bag.NIL != list_utilities.set_differenceP(bag_keys, test_keys, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED)) {
            return (SubLObject)bag.$str88$unique_element_list_wrong;
        }
        SubLObject cdolist_list_var2;
        final SubLObject bag_element_counts = cdolist_list_var2 = bag_element_count_list(v_bag);
        SubLObject element_and_count = (SubLObject)bag.NIL;
        element_and_count = cdolist_list_var2.first();
        while (bag.NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = element_and_count;
            element2 = (SubLObject)bag.NIL;
            SubLObject element_count3 = (SubLObject)bag.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bag.$list89);
            element2 = current.first();
            current = (element_count3 = current.rest());
            if (bag.NIL == subl_promotions.memberP(element2, test_keys, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED)) {
                return (SubLObject)bag.$str90$bag_element_count_tuple_contains_;
            }
            if (!element_count3.numE(test_counts)) {
                return (SubLObject)bag.$str91$bag_element_count_tuple_contains_;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            element_and_count = cdolist_list_var2.first();
        }
        if (bag.NIL == list_utilities.lengthE(bag_element_list(v_bag), Numbers.multiply(Sequences.length(test_keys), test_counts), (SubLObject)bag.UNPROVIDED)) {
            return (SubLObject)bag.$str92$list_of_elements_has_bogus_length;
        }
        SubLObject byte_vector = (SubLObject)bag.NIL;
        SubLObject duplicate_bag = (SubLObject)bag.NIL;
        SubLObject stream = cfasl.new_cfasl_encoding_stream();
        try {
            cfasl.cfasl_output(v_bag, stream);
            byte_vector = cfasl.cfasl_encoding_stream_encoding(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)bag.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                cfasl.close_cfasl_encoding_stream(stream);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        stream = cfasl.new_cfasl_decoding_stream(byte_vector);
        try {
            duplicate_bag = cfasl.cfasl_input(stream, (SubLObject)bag.UNPROVIDED, (SubLObject)bag.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)bag.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                cfasl.close_cfasl_decoding_stream(stream);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (!bag_size(v_bag).numE(bag_size(duplicate_bag))) {
            return (SubLObject)bag.$str93$CFASLed_bag_has_different_size_;
        }
        if (!bag_unique_size(v_bag).numE(bag_unique_size(duplicate_bag))) {
            return (SubLObject)bag.$str94$CFASLed_bag_has_different_unique_;
        }
        SubLObject iteration_state2;
        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(do_bag_repeat_internal(duplicate_bag)); bag.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
            thread.resetMultipleValues();
            final SubLObject element3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
            final SubLObject times = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (bag.NIL == bag_memberP(element3, v_bag)) {
                return (SubLObject)bag.$str95$CFASLed_bag_does_not_contain_elem;
            }
            if (!times.numE(bag_member_count(element3, v_bag))) {
                return (SubLObject)bag.$str96$CFASLed_bag_does_not_contain_elem;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
        final SubLObject times2 = (SubLObject)bag.ONE_INTEGER;
        final SubLObject set_contents_var2 = do_bag_unique_internal(duplicate_bag);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject element4;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)bag.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); bag.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            element4 = set_contents.do_set_contents_next(basis_object2, state2);
            if (bag.NIL != set_contents.do_set_contents_element_validP(state2, element4)) {
                if (bag.NIL == bag_memberP(element4, v_bag)) {
                    return (SubLObject)bag.$str95$CFASLed_bag_does_not_contain_elem;
                }
                if (!times2.numE(bag_member_count(element4, v_bag))) {
                    return (SubLObject)bag.$str96$CFASLed_bag_does_not_contain_elem;
                }
            }
        }
        cdolist_list_var = test_keys;
        key = (SubLObject)bag.NIL;
        key = cdolist_list_var.first();
        while (bag.NIL != cdolist_list_var) {
            SubLObject i;
            for (i = (SubLObject)bag.NIL, i = (SubLObject)bag.ZERO_INTEGER; i.numL(test_counts); i = Numbers.add(i, (SubLObject)bag.ONE_INTEGER)) {
                if (!items.numE(bag_size(v_bag))) {
                    return (SubLObject)bag.$str97$removing_items_whacks_bag_size;
                }
                if (!Numbers.subtract(test_counts, i).numE(bag_member_count(key, v_bag))) {
                    return (SubLObject)bag.$str98$removing_items_whacks_member_coun;
                }
                bag_remove(key, v_bag);
                items = Numbers.subtract(items, (SubLObject)bag.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        if (bag.NIL == bag_emptyP(v_bag)) {
            return (SubLObject)bag.$str99$emptied_bag_is_not_empty;
        }
        return (SubLObject)bag.$kw100$SUCCESS;
    }
    
    public static SubLObject declare_bag_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_print_function_trampoline", "BAG-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_p", "BAG-P", 1, 0, false);
        new $bag_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_struct_unique_contents", "BAG-STRUCT-UNIQUE-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_struct_repeat_contents", "BAG-STRUCT-REPEAT-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_struct_repeat_size", "BAG-STRUCT-REPEAT-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_struct_test", "BAG-STRUCT-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "_csetf_bag_struct_unique_contents", "_CSETF-BAG-STRUCT-UNIQUE-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "_csetf_bag_struct_repeat_contents", "_CSETF-BAG-STRUCT-REPEAT-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "_csetf_bag_struct_repeat_size", "_CSETF-BAG-STRUCT-REPEAT-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "_csetf_bag_struct_test", "_CSETF-BAG-STRUCT-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "make_bag", "MAKE-BAG", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "visit_defstruct_bag", "VISIT-DEFSTRUCT-BAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "visit_defstruct_object_bag_method", "VISIT-DEFSTRUCT-OBJECT-BAG-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "print_bag", "PRINT-BAG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "make_new_bag", "MAKE-NEW-BAG", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "new_bag_repeat_contents", "NEW-BAG-REPEAT-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "copy_bag_repeat_contents", "COPY-BAG-REPEAT-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_unique_size", "BAG-REPEAT-CONTENTS-UNIQUE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_emptyP", "BAG-REPEAT-CONTENTS-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_member_count", "BAG-REPEAT-CONTENTS-MEMBER-COUNT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_memberP", "BAG-REPEAT-CONTENTS-MEMBER?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_matching_element", "BAG-REPEAT-CONTENTS-MATCHING-ELEMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_random_element", "BAG-REPEAT-CONTENTS-RANDOM-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_add", "BAG-REPEAT-CONTENTS-ADD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_delete", "BAG-REPEAT-CONTENTS-DELETE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_delete_all", "BAG-REPEAT-CONTENTS-DELETE-ALL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "clear_bag_repeat_contents", "CLEAR-BAG-REPEAT-CONTENTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.bag", "do_bag_repeat_contents_unique", "DO-BAG-REPEAT-CONTENTS-UNIQUE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.bag", "do_bag_repeat_contents", "DO-BAG-REPEAT-CONTENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "map_bag_repeat_contents", "MAP-BAG-REPEAT-CONTENTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_element_list", "BAG-REPEAT-CONTENTS-ELEMENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_repeat_contents_unique_element_list", "BAG-REPEAT-CONTENTS-UNIQUE-ELEMENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "make_bag_iterator_state", "MAKE-BAG-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "iterate_bag_done", "ITERATE-BAG-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "iterate_bag_next", "ITERATE-BAG-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "new_bag_repeat_contents_iterator", "NEW-BAG-REPEAT-CONTENTS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "new_bag_unique_contents", "NEW-BAG-UNIQUE-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "copy_bag_unique_contents", "COPY-BAG-UNIQUE-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_unique_size", "BAG-UNIQUE-CONTENTS-UNIQUE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_emptyP", "BAG-UNIQUE-CONTENTS-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_memberP", "BAG-UNIQUE-CONTENTS-MEMBER?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_member_count", "BAG-UNIQUE-CONTENTS-MEMBER-COUNT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_matching_element", "BAG-UNIQUE-CONTENTS-MATCHING-ELEMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_random_element", "BAG-UNIQUE-CONTENTS-RANDOM-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_add", "BAG-UNIQUE-CONTENTS-ADD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_delete", "BAG-UNIQUE-CONTENTS-DELETE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_delete_all", "BAG-UNIQUE-CONTENTS-DELETE-ALL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "clear_bag_unique_contents", "CLEAR-BAG-UNIQUE-CONTENTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.bag", "do_bag_unique_contents", "DO-BAG-UNIQUE-CONTENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "map_bag_unique_contents", "MAP-BAG-UNIQUE-CONTENTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_element_list", "BAG-UNIQUE-CONTENTS-ELEMENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_contents_unique_element_list", "BAG-UNIQUE-CONTENTS-UNIQUE-ELEMENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "new_bag_unique_contents_iterator", "NEW-BAG-UNIQUE-CONTENTS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "new_bag_contents_iterator", "NEW-BAG-CONTENTS-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "new_bag", "NEW-BAG", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "copy_bag", "COPY-BAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "new_bag_from_elements", "NEW-BAG-FROM-ELEMENTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_test", "BAG-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_size", "BAG-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_size", "BAG-UNIQUE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_emptyP", "BAG-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "empty_bag_p", "EMPTY-BAG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "non_empty_bag_p", "NON-EMPTY-BAG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_memberP", "BAG-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_member_count", "BAG-MEMBER-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_matching_element", "BAG-MATCHING-ELEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_random_element", "BAG-RANDOM-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_add", "BAG-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_remove", "BAG-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_remove_all", "BAG-REMOVE-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "clear_bag", "CLEAR-BAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_intersection", "BAG-INTERSECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_union", "BAG-UNION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "new_bag_iterator", "NEW-BAG-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.bag", "do_bag_unique", "DO-BAG-UNIQUE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.bag", "do_bag", "DO-BAG");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "do_bag_repeat_internal", "DO-BAG-REPEAT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "do_bag_unique_internal", "DO-BAG-UNIQUE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "map_bag", "MAP-BAG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_element_list", "BAG-ELEMENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unique_element_list", "BAG-UNIQUE-ELEMENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_element_count_list", "BAG-ELEMENT-COUNT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "cfasl_output_object_bag_method", "CFASL-OUTPUT-OBJECT-BAG-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "cfasl_output_bag", "CFASL-OUTPUT-BAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "cfasl_input_bag", "CFASL-INPUT-BAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bag", "bag_unit_test_kitchen_sink", "BAG-UNIT-TEST-KITCHEN-SINK", 2, 0, false);
        return (SubLObject)bag.NIL;
    }
    
    public static SubLObject init_bag_file() {
        bag.$dtp_bag$ = SubLFiles.defconstant("*DTP-BAG*", (SubLObject)bag.$sym0$BAG);
        bag.$bag_repeat_contents_iterator_watermark$ = SubLFiles.deflexical("*BAG-REPEAT-CONTENTS-ITERATOR-WATERMARK*", (SubLObject)bag.EIGHT_INTEGER);
        bag.$new_bag_default_test_function$ = SubLFiles.deflexical("*NEW-BAG-DEFAULT-TEST-FUNCTION*", Symbols.symbol_function((SubLObject)bag.EQL));
        bag.$cfasl_opcode_bag$ = SubLFiles.defconstant("*CFASL-OPCODE-BAG*", (SubLObject)bag.$int67$62);
        return (SubLObject)bag.NIL;
    }
    
    public static SubLObject setup_bag_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), bag.$dtp_bag$.getGlobalValue(), Symbols.symbol_function((SubLObject)bag.$sym8$BAG_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)bag.$list9);
        Structures.def_csetf((SubLObject)bag.$sym10$BAG_STRUCT_UNIQUE_CONTENTS, (SubLObject)bag.$sym11$_CSETF_BAG_STRUCT_UNIQUE_CONTENTS);
        Structures.def_csetf((SubLObject)bag.$sym12$BAG_STRUCT_REPEAT_CONTENTS, (SubLObject)bag.$sym13$_CSETF_BAG_STRUCT_REPEAT_CONTENTS);
        Structures.def_csetf((SubLObject)bag.$sym14$BAG_STRUCT_REPEAT_SIZE, (SubLObject)bag.$sym15$_CSETF_BAG_STRUCT_REPEAT_SIZE);
        Structures.def_csetf((SubLObject)bag.$sym16$BAG_STRUCT_TEST, (SubLObject)bag.$sym17$_CSETF_BAG_STRUCT_TEST);
        Equality.identity((SubLObject)bag.$sym0$BAG);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), bag.$dtp_bag$.getGlobalValue(), Symbols.symbol_function((SubLObject)bag.$sym27$VISIT_DEFSTRUCT_OBJECT_BAG_METHOD));
        access_macros.register_macro_helper((SubLObject)bag.$sym57$DO_BAG_REPEAT_INTERNAL, (SubLObject)bag.$sym66$DO_BAG_UNIQUE);
        access_macros.register_macro_helper((SubLObject)bag.$sym61$DO_BAG_UNIQUE_INTERNAL, (SubLObject)bag.$sym66$DO_BAG_UNIQUE);
        cfasl.register_cfasl_input_function(bag.$cfasl_opcode_bag$.getGlobalValue(), (SubLObject)bag.$sym68$CFASL_INPUT_BAG);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), bag.$dtp_bag$.getGlobalValue(), Symbols.symbol_function((SubLObject)bag.$sym69$CFASL_OUTPUT_OBJECT_BAG_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)bag.$sym73$BAG_UNIT_TEST_KITCHEN_SINK, (SubLObject)ConsesLow.list(new SubLObject[] { bag.$kw21$TEST, bag.NIL, bag.$kw74$OWNER, bag.NIL, bag.$kw75$CLASSES, bag.NIL, bag.$kw76$KB, bag.$kw77$TINY, bag.$kw78$WORKING_, bag.T }), (SubLObject)bag.$list79);
        return (SubLObject)bag.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_bag_file();
    }
    
    @Override
	public void initializeVariables() {
        init_bag_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_bag_file();
    }
    
    static {
        me = (SubLFile)new bag();
        bag.$dtp_bag$ = null;
        bag.$bag_repeat_contents_iterator_watermark$ = null;
        bag.$new_bag_default_test_function$ = null;
        bag.$cfasl_opcode_bag$ = null;
        $sym0$BAG = SubLObjectFactory.makeSymbol("BAG");
        $sym1$BAG_P = SubLObjectFactory.makeSymbol("BAG-P");
        $int2$138 = SubLObjectFactory.makeInteger(138);
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIQUE-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("REPEAT-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("REPEAT-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNIQUE-CONTENTS"), (SubLObject)SubLObjectFactory.makeKeyword("REPEAT-CONTENTS"), (SubLObject)SubLObjectFactory.makeKeyword("REPEAT-SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BAG-STRUCT-UNIQUE-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-STRUCT-REPEAT-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-STRUCT-REPEAT-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-STRUCT-TEST"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BAG-STRUCT-UNIQUE-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BAG-STRUCT-REPEAT-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BAG-STRUCT-REPEAT-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BAG-STRUCT-TEST"));
        $sym7$PRINT_BAG = SubLObjectFactory.makeSymbol("PRINT-BAG");
        $sym8$BAG_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("BAG-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-P"));
        $sym10$BAG_STRUCT_UNIQUE_CONTENTS = SubLObjectFactory.makeSymbol("BAG-STRUCT-UNIQUE-CONTENTS");
        $sym11$_CSETF_BAG_STRUCT_UNIQUE_CONTENTS = SubLObjectFactory.makeSymbol("_CSETF-BAG-STRUCT-UNIQUE-CONTENTS");
        $sym12$BAG_STRUCT_REPEAT_CONTENTS = SubLObjectFactory.makeSymbol("BAG-STRUCT-REPEAT-CONTENTS");
        $sym13$_CSETF_BAG_STRUCT_REPEAT_CONTENTS = SubLObjectFactory.makeSymbol("_CSETF-BAG-STRUCT-REPEAT-CONTENTS");
        $sym14$BAG_STRUCT_REPEAT_SIZE = SubLObjectFactory.makeSymbol("BAG-STRUCT-REPEAT-SIZE");
        $sym15$_CSETF_BAG_STRUCT_REPEAT_SIZE = SubLObjectFactory.makeSymbol("_CSETF-BAG-STRUCT-REPEAT-SIZE");
        $sym16$BAG_STRUCT_TEST = SubLObjectFactory.makeSymbol("BAG-STRUCT-TEST");
        $sym17$_CSETF_BAG_STRUCT_TEST = SubLObjectFactory.makeSymbol("_CSETF-BAG-STRUCT-TEST");
        $kw18$UNIQUE_CONTENTS = SubLObjectFactory.makeKeyword("UNIQUE-CONTENTS");
        $kw19$REPEAT_CONTENTS = SubLObjectFactory.makeKeyword("REPEAT-CONTENTS");
        $kw20$REPEAT_SIZE = SubLObjectFactory.makeKeyword("REPEAT-SIZE");
        $kw21$TEST = SubLObjectFactory.makeKeyword("TEST");
        $str22$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw23$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym24$MAKE_BAG = SubLObjectFactory.makeSymbol("MAKE-BAG");
        $kw25$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw26$END = SubLObjectFactory.makeKeyword("END");
        $sym27$VISIT_DEFSTRUCT_OBJECT_BAG_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-BAG-METHOD");
        $str28$_ = SubLObjectFactory.makeString("(");
        $str29$_impl_ = SubLObjectFactory.makeString(" impl ");
        $str30$__ = SubLObjectFactory.makeString("//");
        $str31$_ = SubLObjectFactory.makeString(")");
        $str32$_size_ = SubLObjectFactory.makeString(" size=");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-REPEAT-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw35$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw36$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym37$DO_DICTIONARY_CONTENTS = SubLObjectFactory.makeSymbol("DO-DICTIONARY-CONTENTS");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-REPEAT-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym39$CURR_ELEMENT = SubLObjectFactory.makeUninternedSymbol("CURR-ELEMENT");
        $sym40$ELEMENT_COUNT = SubLObjectFactory.makeUninternedSymbol("ELEMENT-COUNT");
        $sym41$INDEX = SubLObjectFactory.makeUninternedSymbol("INDEX");
        $sym42$DO_BAG_REPEAT_CONTENTS_UNIQUE = SubLObjectFactory.makeSymbol("DO-BAG-REPEAT-CONTENTS-UNIQUE");
        $sym43$CDOTIMES = SubLObjectFactory.makeSymbol("CDOTIMES");
        $sym44$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMES"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-ITERATOR"));
        $kw46$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym48$ITERATE_BAG_NEXT = SubLObjectFactory.makeSymbol("ITERATE-BAG-NEXT");
        $sym49$ITERATE_BAG_DONE = SubLObjectFactory.makeSymbol("ITERATE-BAG-DONE");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-UNIQUE-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym51$DO_SET_CONTENTS = SubLObjectFactory.makeSymbol("DO-SET-CONTENTS");
        $sym52$VALID_HASH_TEST_P = SubLObjectFactory.makeSymbol("VALID-HASH-TEST-P");
        $sym53$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym54$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("BAG"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym56$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym57$DO_BAG_REPEAT_INTERNAL = SubLObjectFactory.makeSymbol("DO-BAG-REPEAT-INTERNAL");
        $sym58$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list59 = ConsesLow.list((SubLObject)bag.ONE_INTEGER);
        $sym60$DO_BAG_UNIQUE_CONTENTS = SubLObjectFactory.makeSymbol("DO-BAG-UNIQUE-CONTENTS");
        $sym61$DO_BAG_UNIQUE_INTERNAL = SubLObjectFactory.makeSymbol("DO-BAG-UNIQUE-INTERNAL");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("BAG"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym63$CURRENT_ELEMENT = SubLObjectFactory.makeUninternedSymbol("CURRENT-ELEMENT");
        $sym64$INDEX = SubLObjectFactory.makeUninternedSymbol("INDEX");
        $sym65$ELEMENT_COUNT = SubLObjectFactory.makeUninternedSymbol("ELEMENT-COUNT");
        $sym66$DO_BAG_UNIQUE = SubLObjectFactory.makeSymbol("DO-BAG-UNIQUE");
        $int67$62 = SubLObjectFactory.makeInteger(62);
        $sym68$CFASL_INPUT_BAG = SubLObjectFactory.makeSymbol("CFASL-INPUT-BAG");
        $sym69$CFASL_OUTPUT_OBJECT_BAG_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-BAG-METHOD");
        $str70$CFASL_loaded_bag__A_does_not_have = SubLObjectFactory.makeString("CFASL-loaded bag ~A does not have the needed number of unique elements ~A.");
        $str71$CFASL_loaded_bag__A_has_more_than = SubLObjectFactory.makeString("CFASL-loaded bag ~A has more than the expected unumber of unique elements ~A.");
        $str72$CFASL_loaded_bag__A_does_not_repr = SubLObjectFactory.makeString("CFASL-loaded bag ~A does not represent the expected number of total elements ~A.");
        $sym73$BAG_UNIT_TEST_KITCHEN_SINK = SubLObjectFactory.makeSymbol("BAG-UNIT-TEST-KITCHEN-SINK");
        $kw74$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw75$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw76$KB = SubLObjectFactory.makeKeyword("KB");
        $kw77$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw78$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RED"), (SubLObject)SubLObjectFactory.makeKeyword("BLUE"), (SubLObject)SubLObjectFactory.makeKeyword("GREEN"), (SubLObject)SubLObjectFactory.makeKeyword("YELLOW"), (SubLObject)SubLObjectFactory.makeKeyword("WHITE"), (SubLObject)SubLObjectFactory.makeKeyword("BROWN"), (SubLObject)SubLObjectFactory.makeKeyword("BLACK")), (SubLObject)bag.TEN_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RED"), (SubLObject)SubLObjectFactory.makeKeyword("BLUE"), (SubLObject)SubLObjectFactory.makeKeyword("GREEN"), (SubLObject)SubLObjectFactory.makeKeyword("YELLOW"), (SubLObject)SubLObjectFactory.makeKeyword("WHITE"), (SubLObject)SubLObjectFactory.makeKeyword("BROWN"), (SubLObject)SubLObjectFactory.makeKeyword("BLACK")), (SubLObject)bag.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str80$bag_not_empty = SubLObjectFactory.makeString("bag not empty");
        $str81$bag_size____item_count = SubLObjectFactory.makeString("bag size != item count");
        $str82$bag_member_count_out_of_whack = SubLObjectFactory.makeString("bag member-count out of whack");
        $str83$added_bag_members_not_findable = SubLObjectFactory.makeString("added bag members not findable");
        $str84$cannot_find_existing_member_again = SubLObjectFactory.makeString("cannot find existing member again");
        $str85$do_bag_existing_element_not_there = SubLObjectFactory.makeString("do-bag existing element not there often enough");
        $str86$do_list_existing_element_not_ther = SubLObjectFactory.makeString("do-list existing element not there often enough");
        $str87$iterator_existing_element_not_the = SubLObjectFactory.makeString("iterator existing element not there often enough");
        $str88$unique_element_list_wrong = SubLObjectFactory.makeString("unique element list wrong");
        $list89 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT"));
        $str90$bag_element_count_tuple_contains_ = SubLObjectFactory.makeString("bag-element-count tuple contains bad element");
        $str91$bag_element_count_tuple_contains_ = SubLObjectFactory.makeString("bag-element-count tuple contains bad count");
        $str92$list_of_elements_has_bogus_length = SubLObjectFactory.makeString("list of elements has bogus length");
        $str93$CFASLed_bag_has_different_size_ = SubLObjectFactory.makeString("CFASLed bag has different size.");
        $str94$CFASLed_bag_has_different_unique_ = SubLObjectFactory.makeString("CFASLed bag has different unique size.");
        $str95$CFASLed_bag_does_not_contain_elem = SubLObjectFactory.makeString("CFASLed bag does not contain element.");
        $str96$CFASLed_bag_does_not_contain_elem = SubLObjectFactory.makeString("CFASLed bag does not contain element as often.");
        $str97$removing_items_whacks_bag_size = SubLObjectFactory.makeString("removing items whacks bag-size");
        $str98$removing_items_whacks_member_coun = SubLObjectFactory.makeString("removing items whacks member count");
        $str99$emptied_bag_is_not_empty = SubLObjectFactory.makeString("emptied bag is not empty");
        $kw100$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
    }
    
    public static final class $bag_native extends SubLStructNative
    {
        public SubLObject $unique_contents;
        public SubLObject $repeat_contents;
        public SubLObject $repeat_size;
        public SubLObject $test;
        private static final SubLStructDeclNative structDecl;
        
        public $bag_native() {
            this.$unique_contents = (SubLObject)CommonSymbols.NIL;
            this.$repeat_contents = (SubLObject)CommonSymbols.NIL;
            this.$repeat_size = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$bag_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$unique_contents;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$repeat_contents;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$repeat_size;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$test;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$unique_contents = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$repeat_contents = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$repeat_size = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$test = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$bag_native.class, bag.$sym0$BAG, bag.$sym1$BAG_P, bag.$list3, bag.$list4, new String[] { "$unique_contents", "$repeat_contents", "$repeat_size", "$test" }, bag.$list5, bag.$list6, bag.$sym7$PRINT_BAG);
        }
    }
    
    public static final class $bag_p$UnaryFunction extends UnaryFunction
    {
        public $bag_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("BAG-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return bag.bag_p(arg1);
        }
    }
}

/*

	Total time: 425 ms
	
*/