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
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class bijection extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.bijection";
    public static final String myFingerPrint = "632cbf9f999b989008992d9b5d114ddb86ffde9ebe74a664e4abfd7417f92e57";
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 1927L)
    private static SubLSymbol $bijection_high_water_mark$;
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 1980L)
    private static SubLSymbol $bijection_low_water_mark$;
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLSymbol $dtp_bijection$;
    private static final SubLInteger $int0$40;
    private static final SubLInteger $int1$30;
    private static final SubLSymbol $sym2$BIJECTION;
    private static final SubLSymbol $sym3$BIJECTION_P;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym9$BIJECTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$BIJECTION_SIZE;
    private static final SubLSymbol $sym12$_CSETF_BIJECTION_SIZE;
    private static final SubLSymbol $sym13$BIJECTION_DATABASE;
    private static final SubLSymbol $sym14$_CSETF_BIJECTION_DATABASE;
    private static final SubLSymbol $sym15$BIJECTION_INVERSE_DATABASE;
    private static final SubLSymbol $sym16$_CSETF_BIJECTION_INVERSE_DATABASE;
    private static final SubLSymbol $sym17$BIJECTION_TEST;
    private static final SubLSymbol $sym18$_CSETF_BIJECTION_TEST;
    private static final SubLSymbol $kw19$SIZE;
    private static final SubLSymbol $kw20$DATABASE;
    private static final SubLSymbol $kw21$INVERSE_DATABASE;
    private static final SubLSymbol $kw22$TEST;
    private static final SubLString $str23$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw24$BEGIN;
    private static final SubLSymbol $sym25$MAKE_BIJECTION;
    private static final SubLSymbol $kw26$SLOT;
    private static final SubLSymbol $kw27$END;
    private static final SubLSymbol $sym28$VISIT_DEFSTRUCT_OBJECT_BIJECTION_METHOD;
    private static final SubLSymbol $kw29$ALIST;
    private static final SubLSymbol $kw30$HASHTABLE;
    private static final SubLSymbol $kw31$UNKNOWN;
    private static final SubLString $str32$Corrupted_bijection__unsupported_;
    private static final SubLString $str33$Malformed_bijection_;
    private static final SubLSymbol $sym34$VALID_HASH_TEST_P;
    private static final SubLSymbol $sym35$INTEGERP;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $kw38$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw39$DONE;
    private static final SubLSymbol $sym40$BIJECTION_VAR;
    private static final SubLSymbol $sym41$CLET;
    private static final SubLSymbol $sym42$PCASE;
    private static final SubLSymbol $sym43$DO_BIJECTION_STYLE;
    private static final SubLSymbol $sym44$DO_ALIST;
    private static final SubLSymbol $sym45$DO_BIJECTION_DATABASE;
    private static final SubLSymbol $sym46$DO_HASH_TABLE;
    private static final SubLSymbol $sym47$OTHERWISE;
    private static final SubLSymbol $sym48$BIJECTION_STYLE_ERROR;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$BIJECTION_VAR;
    private static final SubLSymbol $sym51$DO_BIJECTION_INVERSE_DATABASE;
    private static final SubLSymbol $sym52$DO_BIJECTION;
    private static final SubLList $list53;
    private static final SubLString $str54$_S______S__;
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject bijection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)bijection.ZERO_INTEGER);
        return (SubLObject)bijection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject bijection_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $bijection_native.class) ? bijection.T : bijection.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject bijection_size(final SubLObject v_object) {
        assert bijection.NIL != bijection_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject bijection_database(final SubLObject v_object) {
        assert bijection.NIL != bijection_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject bijection_inverse_database(final SubLObject v_object) {
        assert bijection.NIL != bijection_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject bijection_test(final SubLObject v_object) {
        assert bijection.NIL != bijection_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject _csetf_bijection_size(final SubLObject v_object, final SubLObject value) {
        assert bijection.NIL != bijection_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject _csetf_bijection_database(final SubLObject v_object, final SubLObject value) {
        assert bijection.NIL != bijection_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject _csetf_bijection_inverse_database(final SubLObject v_object, final SubLObject value) {
        assert bijection.NIL != bijection_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject _csetf_bijection_test(final SubLObject v_object, final SubLObject value) {
        assert bijection.NIL != bijection_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject make_bijection(SubLObject arglist) {
        if (arglist == bijection.UNPROVIDED) {
            arglist = (SubLObject)bijection.NIL;
        }
        final SubLObject v_new = (SubLObject)new $bijection_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)bijection.NIL, next = arglist; bijection.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)bijection.$kw19$SIZE)) {
                _csetf_bijection_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)bijection.$kw20$DATABASE)) {
                _csetf_bijection_database(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)bijection.$kw21$INVERSE_DATABASE)) {
                _csetf_bijection_inverse_database(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)bijection.$kw22$TEST)) {
                _csetf_bijection_test(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)bijection.$str23$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject visit_defstruct_bijection(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)bijection.$kw24$BEGIN, (SubLObject)bijection.$sym25$MAKE_BIJECTION, (SubLObject)bijection.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)bijection.$kw26$SLOT, (SubLObject)bijection.$kw19$SIZE, bijection_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)bijection.$kw26$SLOT, (SubLObject)bijection.$kw20$DATABASE, bijection_database(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)bijection.$kw26$SLOT, (SubLObject)bijection.$kw21$INVERSE_DATABASE, bijection_inverse_database(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)bijection.$kw26$SLOT, (SubLObject)bijection.$kw22$TEST, bijection_test(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)bijection.$kw27$END, (SubLObject)bijection.$sym25$MAKE_BIJECTION, (SubLObject)bijection.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2333L)
    public static SubLObject visit_defstruct_object_bijection_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_bijection(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2532L)
    public static SubLObject bijection_style(final SubLObject v_bijection) {
        final SubLObject database = bijection_database(v_bijection);
        if (database.isList()) {
            return (SubLObject)bijection.$kw29$ALIST;
        }
        if (database.isHashtable()) {
            return (SubLObject)bijection.$kw30$HASHTABLE;
        }
        return (SubLObject)bijection.$kw31$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 2935L)
    public static SubLObject bijection_style_error(final SubLObject v_bijection) {
        return Errors.error((SubLObject)bijection.$str32$Corrupted_bijection__unsupported_, bijection_style(v_bijection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 3087L)
    public static SubLObject bijection_lookup_alist_style(final SubLObject v_bijection, final SubLObject key, final SubLObject not_found) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject pair = conses_high.assoc(key, alist, test, (SubLObject)bijection.UNPROVIDED);
        return (bijection.NIL != pair) ? Values.values(pair.rest(), (SubLObject)bijection.T) : Values.values(not_found, (SubLObject)bijection.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 3417L)
    public static SubLObject bijection_enter_alist_style(final SubLObject v_bijection, final SubLObject key, final SubLObject value) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject key_pair = conses_high.assoc(key, alist, test, (SubLObject)bijection.UNPROVIDED);
        final SubLObject value_pair = conses_high.rassoc(value, alist, test, (SubLObject)bijection.UNPROVIDED);
        if (bijection.NIL != key_pair && bijection.NIL != value_pair) {
            if (bijection.NIL == Functions.funcall(test, key, value_pair.first()) || bijection.NIL == Functions.funcall(test, key_pair.rest(), value)) {
                ConsesLow.rplacd(key_pair, value);
                _csetf_bijection_database(v_bijection, list_utilities.delete_first(value_pair, alist, (SubLObject)bijection.UNPROVIDED));
            }
        }
        else if (bijection.NIL != key_pair) {
            ConsesLow.rplacd(key_pair, value);
        }
        else if (bijection.NIL != value_pair) {
            ConsesLow.rplaca(value_pair, key);
        }
        else {
            _csetf_bijection_database(v_bijection, conses_high.acons(key, value, alist));
            _csetf_bijection_size(v_bijection, Numbers.add(bijection_size(v_bijection), (SubLObject)bijection.ONE_INTEGER));
            if (bijection_size(v_bijection).numG(bijection.$bijection_high_water_mark$.getGlobalValue())) {
                make_hashtable_bijection_from_alist(v_bijection);
            }
        }
        return Values.values(key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 4277L)
    public static SubLObject bijection_remove_alist_style(final SubLObject v_bijection, final SubLObject key) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject key_pair = conses_high.assoc(key, alist, test, (SubLObject)bijection.UNPROVIDED);
        SubLObject value = (SubLObject)bijection.NIL;
        if (bijection.NIL != key_pair) {
            _csetf_bijection_database(v_bijection, list_utilities.delete_first(key_pair, alist, (SubLObject)bijection.UNPROVIDED));
            value = key_pair.rest();
            _csetf_bijection_size(v_bijection, Numbers.subtract(bijection_size(v_bijection), (SubLObject)bijection.ONE_INTEGER));
        }
        return Values.values(key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 4684L)
    public static SubLObject bijection_inverse_lookup_alist_style(final SubLObject v_bijection, final SubLObject value, final SubLObject not_found) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject pair = conses_high.rassoc(value, alist, test, (SubLObject)bijection.UNPROVIDED);
        return (bijection.NIL != pair) ? Values.values(pair.first(), (SubLObject)bijection.T) : Values.values(not_found, (SubLObject)bijection.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 4971L)
    public static SubLObject bijection_inverse_enter_alist_style(final SubLObject v_bijection, final SubLObject value, final SubLObject key) {
        return bijection_enter_alist_style(v_bijection, key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 5105L)
    public static SubLObject bijection_inverse_remove_alist_style(final SubLObject v_bijection, final SubLObject value) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject alist = bijection_database(v_bijection);
        final SubLObject value_pair = conses_high.rassoc(value, alist, test, (SubLObject)bijection.UNPROVIDED);
        SubLObject key = (SubLObject)bijection.NIL;
        if (bijection.NIL != value_pair) {
            _csetf_bijection_database(v_bijection, list_utilities.delete_first(value_pair, alist, (SubLObject)bijection.UNPROVIDED));
            key = value_pair.first();
            _csetf_bijection_size(v_bijection, Numbers.subtract(bijection_size(v_bijection), (SubLObject)bijection.ONE_INTEGER));
        }
        return Values.values(key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 5526L)
    public static SubLObject make_hashtable_bijection_from_alist(final SubLObject v_bijection) {
        final SubLObject test = bijection_test(v_bijection);
        final SubLObject old_database = bijection_database(v_bijection);
        final SubLObject new_database = list_utilities.alist_to_hash_table(old_database, test);
        final SubLObject new_inverse = list_utilities.alist_to_reverse_hash_table(old_database, test);
        _csetf_bijection_database(v_bijection, new_database);
        _csetf_bijection_inverse_database(v_bijection, new_inverse);
        return v_bijection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 5953L)
    public static SubLObject bijection_lookup_hashtable_style(final SubLObject v_bijection, final SubLObject key, final SubLObject not_found) {
        return Hashtables.gethash(key, bijection_database(v_bijection), not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 6155L)
    public static SubLObject bijection_enter_hashtable_style(final SubLObject v_bijection, final SubLObject key, final SubLObject value) {
        final SubLObject table = bijection_database(v_bijection);
        final SubLObject inverse = bijection_inverse_database(v_bijection);
        Hashtables.sethash(key, table, value);
        Hashtables.sethash(value, inverse, key);
        _csetf_bijection_size(v_bijection, Hashtables.hash_table_count(table));
        return Values.values(key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 6499L)
    public static SubLObject bijection_remove_hashtable_style(final SubLObject v_bijection, final SubLObject key) {
        final SubLObject table = bijection_database(v_bijection);
        final SubLObject value = Hashtables.gethash(key, table, (SubLObject)bijection.UNPROVIDED);
        return (bijection.NIL != value) ? bijection_remove_hashtable_style_int(v_bijection, key, value) : Values.values(key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 6760L)
    public static SubLObject bijection_inverse_lookup_hashtable_style(final SubLObject v_bijection, final SubLObject value, final SubLObject not_found) {
        return Hashtables.gethash(value, bijection_inverse_database(v_bijection), not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 6921L)
    public static SubLObject bijection_inverse_enter_hashtable_style(final SubLObject v_bijection, final SubLObject value, final SubLObject key) {
        return bijection_enter_hashtable_style(v_bijection, key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 7063L)
    public static SubLObject bijection_inverse_remove_hashtable_style(final SubLObject v_bijection, final SubLObject value) {
        final SubLObject inverse = bijection_inverse_database(v_bijection);
        final SubLObject key = Hashtables.gethash(value, inverse, (SubLObject)bijection.UNPROVIDED);
        return (bijection.NIL != key) ? bijection_remove_hashtable_style_int(v_bijection, key, value) : Values.values(key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 7348L)
    public static SubLObject bijection_remove_hashtable_style_int(final SubLObject v_bijection, final SubLObject key, final SubLObject value) {
        final SubLObject table = bijection_database(v_bijection);
        final SubLObject inverse = bijection_inverse_database(v_bijection);
        final SubLObject table_removedP = Hashtables.remhash(key, table);
        final SubLObject inverse_removedP = Hashtables.remhash(value, inverse);
        if (bijection.NIL != table_removedP && bijection.NIL != inverse_removedP) {
            _csetf_bijection_size(v_bijection, Hashtables.hash_table_count(table));
            if (bijection_size(v_bijection).numL(bijection.$bijection_low_water_mark$.getGlobalValue())) {
                make_alist_bijection_from_hashtable(v_bijection);
            }
        }
        else if (bijection.NIL != table_removedP || bijection.NIL != inverse_removedP) {
            Errors.error((SubLObject)bijection.$str33$Malformed_bijection_);
        }
        return Values.values(key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 7984L)
    public static SubLObject make_alist_bijection_from_hashtable(final SubLObject v_bijection) {
        final SubLObject old_database = bijection_database(v_bijection);
        final SubLObject new_database = hash_table_utilities.hash_table_to_alist(old_database);
        _csetf_bijection_database(v_bijection, new_database);
        _csetf_bijection_inverse_database(v_bijection, (SubLObject)bijection.NIL);
        return v_bijection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 8288L)
    public static SubLObject new_bijection(SubLObject test, SubLObject size) {
        if (test == bijection.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)bijection.EQL);
        }
        if (size == bijection.UNPROVIDED) {
            size = (SubLObject)bijection.ZERO_INTEGER;
        }
        assert bijection.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        assert bijection.NIL != Types.integerp(size) : size;
        if (test.isSymbol()) {
            test = Symbols.symbol_function(test);
        }
        final SubLObject v_bijection = make_bijection((SubLObject)bijection.UNPROVIDED);
        clear_bijection(v_bijection);
        _csetf_bijection_test(v_bijection, test);
        if (size.numG(bijection.$bijection_high_water_mark$.getGlobalValue())) {
            _csetf_bijection_database(v_bijection, Hashtables.make_hash_table(size, test, (SubLObject)bijection.UNPROVIDED));
            _csetf_bijection_inverse_database(v_bijection, Hashtables.make_hash_table(size, test, (SubLObject)bijection.UNPROVIDED));
        }
        return v_bijection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 9240L)
    public static SubLObject clear_bijection(final SubLObject v_bijection) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        _csetf_bijection_size(v_bijection, (SubLObject)bijection.ZERO_INTEGER);
        _csetf_bijection_database(v_bijection, (SubLObject)bijection.NIL);
        _csetf_bijection_inverse_database(v_bijection, (SubLObject)bijection.NIL);
        return v_bijection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 9563L)
    public static SubLObject bijection_empty_p(final SubLObject v_bijection) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        return Numbers.zerop(bijection_size(v_bijection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 9949L)
    public static SubLObject non_empty_bijection_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(bijection.NIL != bijection_p(v_object) && bijection.NIL == bijection_empty_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 10131L)
    public static SubLObject bijection_lookup(final SubLObject v_bijection, final SubLObject key, SubLObject not_found) {
        if (not_found == bijection.UNPROVIDED) {
            not_found = (SubLObject)bijection.NIL;
        }
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            return bijection_lookup_alist_style(v_bijection, key, not_found);
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return bijection_lookup_hashtable_style(v_bijection, key, not_found);
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 10697L)
    public static SubLObject bijection_inverse_lookup(final SubLObject v_bijection, final SubLObject value, SubLObject not_found) {
        if (not_found == bijection.UNPROVIDED) {
            not_found = (SubLObject)bijection.NIL;
        }
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            return bijection_inverse_lookup_alist_style(v_bijection, value, not_found);
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return bijection_inverse_lookup_hashtable_style(v_bijection, value, not_found);
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 11260L)
    public static SubLObject bijection_enter(final SubLObject v_bijection, final SubLObject key, final SubLObject value) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            return bijection_enter_alist_style(v_bijection, key, value);
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return bijection_enter_hashtable_style(v_bijection, key, value);
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 11751L)
    public static SubLObject bijection_inverse_enter(final SubLObject v_bijection, final SubLObject value, final SubLObject key) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            return bijection_inverse_enter_alist_style(v_bijection, value, key);
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return bijection_inverse_enter_hashtable_style(v_bijection, value, key);
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 12214L)
    public static SubLObject bijection_remove(final SubLObject v_bijection, final SubLObject key) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            return bijection_remove_alist_style(v_bijection, key);
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return bijection_remove_hashtable_style(v_bijection, key);
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 12643L)
    public static SubLObject bijection_inverse_remove(final SubLObject v_bijection, final SubLObject value) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            return bijection_inverse_remove_alist_style(v_bijection, value);
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return bijection_inverse_remove_hashtable_style(v_bijection, value);
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 13104L)
    public static SubLObject new_bijection_iterator(final SubLObject v_bijection) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject database = bijection_database(v_bijection);
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            return iteration.new_alist_iterator(database);
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return iteration.new_hash_table_iterator(database);
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 13614L)
    public static SubLObject do_bijection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bijection.$list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)bijection.NIL;
        SubLObject value = (SubLObject)bijection.NIL;
        SubLObject v_bijection = (SubLObject)bijection.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bijection.$list36);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bijection.$list36);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bijection.$list36);
        v_bijection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)bijection.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)bijection.NIL;
        SubLObject current_$1 = (SubLObject)bijection.NIL;
        while (bijection.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bijection.$list36);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bijection.$list36);
            if (bijection.NIL == conses_high.member(current_$1, (SubLObject)bijection.$list37, (SubLObject)bijection.UNPROVIDED, (SubLObject)bijection.UNPROVIDED)) {
                bad = (SubLObject)bijection.T;
            }
            if (current_$1 == bijection.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (bijection.NIL != bad && bijection.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)bijection.$list36);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)bijection.$kw39$DONE, current);
        final SubLObject done = (SubLObject)((bijection.NIL != done_tail) ? conses_high.cadr(done_tail) : bijection.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject bijection_var = (SubLObject)bijection.$sym40$BIJECTION_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)bijection.$sym41$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(bijection_var, v_bijection)), (SubLObject)ConsesLow.list((SubLObject)bijection.$sym42$PCASE, (SubLObject)ConsesLow.list((SubLObject)bijection.$sym43$DO_BIJECTION_STYLE, bijection_var), (SubLObject)ConsesLow.list((SubLObject)bijection.$kw29$ALIST, (SubLObject)ConsesLow.listS((SubLObject)bijection.$sym44$DO_ALIST, (SubLObject)ConsesLow.list(key, value, (SubLObject)ConsesLow.list((SubLObject)bijection.$sym45$DO_BIJECTION_DATABASE, bijection_var), (SubLObject)bijection.$kw39$DONE, done), ConsesLow.append(body, (SubLObject)bijection.NIL))), (SubLObject)ConsesLow.list((SubLObject)bijection.$kw30$HASHTABLE, (SubLObject)ConsesLow.listS((SubLObject)bijection.$sym46$DO_HASH_TABLE, (SubLObject)ConsesLow.list(key, value, (SubLObject)ConsesLow.list((SubLObject)bijection.$sym45$DO_BIJECTION_DATABASE, bijection_var), (SubLObject)bijection.$kw39$DONE, done), ConsesLow.append(body, (SubLObject)bijection.NIL))), (SubLObject)ConsesLow.list((SubLObject)bijection.$sym47$OTHERWISE, (SubLObject)ConsesLow.list((SubLObject)bijection.$sym48$BIJECTION_STYLE_ERROR, bijection_var))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 14519L)
    public static SubLObject do_bijection_inverse(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bijection.$list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = (SubLObject)bijection.NIL;
        SubLObject key = (SubLObject)bijection.NIL;
        SubLObject v_bijection = (SubLObject)bijection.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bijection.$list49);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bijection.$list49);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bijection.$list49);
        v_bijection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)bijection.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)bijection.NIL;
        SubLObject current_$2 = (SubLObject)bijection.NIL;
        while (bijection.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bijection.$list49);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)bijection.$list49);
            if (bijection.NIL == conses_high.member(current_$2, (SubLObject)bijection.$list37, (SubLObject)bijection.UNPROVIDED, (SubLObject)bijection.UNPROVIDED)) {
                bad = (SubLObject)bijection.T;
            }
            if (current_$2 == bijection.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (bijection.NIL != bad && bijection.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)bijection.$list49);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)bijection.$kw39$DONE, current);
        final SubLObject done = (SubLObject)((bijection.NIL != done_tail) ? conses_high.cadr(done_tail) : bijection.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject bijection_var = (SubLObject)bijection.$sym50$BIJECTION_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)bijection.$sym41$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(bijection_var, v_bijection)), (SubLObject)ConsesLow.list((SubLObject)bijection.$sym42$PCASE, (SubLObject)ConsesLow.list((SubLObject)bijection.$sym43$DO_BIJECTION_STYLE, bijection_var), (SubLObject)ConsesLow.list((SubLObject)bijection.$kw29$ALIST, (SubLObject)ConsesLow.listS((SubLObject)bijection.$sym44$DO_ALIST, (SubLObject)ConsesLow.list(key, value, (SubLObject)ConsesLow.list((SubLObject)bijection.$sym45$DO_BIJECTION_DATABASE, bijection_var), (SubLObject)bijection.$kw39$DONE, done), ConsesLow.append(body, (SubLObject)bijection.NIL))), (SubLObject)ConsesLow.list((SubLObject)bijection.$kw30$HASHTABLE, (SubLObject)ConsesLow.listS((SubLObject)bijection.$sym46$DO_HASH_TABLE, (SubLObject)ConsesLow.list(value, key, (SubLObject)ConsesLow.list((SubLObject)bijection.$sym51$DO_BIJECTION_INVERSE_DATABASE, bijection_var), (SubLObject)bijection.$kw39$DONE, done), ConsesLow.append(body, (SubLObject)bijection.NIL))), (SubLObject)ConsesLow.list((SubLObject)bijection.$sym47$OTHERWISE, (SubLObject)ConsesLow.list((SubLObject)bijection.$sym48$BIJECTION_STYLE_ERROR, bijection_var))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 15262L)
    public static SubLObject do_bijection_style(final SubLObject v_bijection) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        return bijection_style(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 15427L)
    public static SubLObject do_bijection_database(final SubLObject v_bijection) {
        return bijection_database(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 15547L)
    public static SubLObject do_bijection_inverse_database(final SubLObject v_bijection) {
        return bijection_inverse_database(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 15683L)
    public static SubLObject bijection_keys(final SubLObject v_bijection) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            return list_utilities.alist_keys(bijection_database(v_bijection));
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return hash_table_utilities.hash_table_keys(bijection_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 16237L)
    public static SubLObject bijection_values(final SubLObject v_bijection) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            return list_utilities.alist_values(bijection_database(v_bijection));
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return hash_table_utilities.hash_table_keys(bijection_inverse_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 16654L)
    public static SubLObject bijection_to_alist(final SubLObject v_bijection) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            return Values.values(conses_high.copy_tree(bijection_database(v_bijection)), bijection_test(v_bijection));
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return hash_table_utilities.hash_table_to_alist(bijection_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 17023L)
    public static SubLObject bijection_to_hashtable(final SubLObject v_bijection) {
        assert bijection.NIL != bijection_p(v_bijection) : v_bijection;
        final SubLObject pcase_var = bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            final SubLObject alist = bijection_database(v_bijection);
            final SubLObject test = bijection_test(v_bijection);
            return Values.values(list_utilities.alist_to_hash_table(alist, test), list_utilities.alist_to_reverse_hash_table(alist, test));
        }
        if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            return Values.values(bijection_database(v_bijection), bijection_inverse_database(v_bijection));
        }
        return bijection_style_error(v_bijection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/bijection.lisp", position = 17520L)
    public static SubLObject print_bijection_contents(final SubLObject v_bijection, SubLObject stream) {
        if (stream == bijection.UNPROVIDED) {
            stream = (SubLObject)bijection.T;
        }
        final SubLObject pcase_var = do_bijection_style(v_bijection);
        if (pcase_var.eql((SubLObject)bijection.$kw29$ALIST)) {
            SubLObject cdolist_list_var = do_bijection_database(v_bijection);
            SubLObject cons = (SubLObject)bijection.NIL;
            cons = cdolist_list_var.first();
            while (bijection.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject key = (SubLObject)bijection.NIL;
                SubLObject value = (SubLObject)bijection.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)bijection.$list53);
                key = current.first();
                current = (value = current.rest());
                PrintLow.format(stream, (SubLObject)bijection.$str54$_S______S__, key, value);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        else if (pcase_var.eql((SubLObject)bijection.$kw30$HASHTABLE)) {
            final SubLObject cdohash_table = do_bijection_database(v_bijection);
            SubLObject key2 = (SubLObject)bijection.NIL;
            SubLObject value2 = (SubLObject)bijection.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key2 = Hashtables.getEntryKey(cdohash_entry);
                    value2 = Hashtables.getEntryValue(cdohash_entry);
                    PrintLow.format(stream, (SubLObject)bijection.$str54$_S______S__, key2, value2);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        else {
            bijection_style_error(v_bijection);
        }
        return (SubLObject)bijection.NIL;
    }
    
    public static SubLObject declare_bijection_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_print_function_trampoline", "BIJECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_p", "BIJECTION-P", 1, 0, false);
        new $bijection_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_size", "BIJECTION-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_database", "BIJECTION-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_inverse_database", "BIJECTION-INVERSE-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_test", "BIJECTION-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "_csetf_bijection_size", "_CSETF-BIJECTION-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "_csetf_bijection_database", "_CSETF-BIJECTION-DATABASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "_csetf_bijection_inverse_database", "_CSETF-BIJECTION-INVERSE-DATABASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "_csetf_bijection_test", "_CSETF-BIJECTION-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "make_bijection", "MAKE-BIJECTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "visit_defstruct_bijection", "VISIT-DEFSTRUCT-BIJECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "visit_defstruct_object_bijection_method", "VISIT-DEFSTRUCT-OBJECT-BIJECTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_style", "BIJECTION-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_style_error", "BIJECTION-STYLE-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_lookup_alist_style", "BIJECTION-LOOKUP-ALIST-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_enter_alist_style", "BIJECTION-ENTER-ALIST-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_remove_alist_style", "BIJECTION-REMOVE-ALIST-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_inverse_lookup_alist_style", "BIJECTION-INVERSE-LOOKUP-ALIST-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_inverse_enter_alist_style", "BIJECTION-INVERSE-ENTER-ALIST-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_inverse_remove_alist_style", "BIJECTION-INVERSE-REMOVE-ALIST-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "make_hashtable_bijection_from_alist", "MAKE-HASHTABLE-BIJECTION-FROM-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_lookup_hashtable_style", "BIJECTION-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_enter_hashtable_style", "BIJECTION-ENTER-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_remove_hashtable_style", "BIJECTION-REMOVE-HASHTABLE-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_inverse_lookup_hashtable_style", "BIJECTION-INVERSE-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_inverse_enter_hashtable_style", "BIJECTION-INVERSE-ENTER-HASHTABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_inverse_remove_hashtable_style", "BIJECTION-INVERSE-REMOVE-HASHTABLE-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_remove_hashtable_style_int", "BIJECTION-REMOVE-HASHTABLE-STYLE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "make_alist_bijection_from_hashtable", "MAKE-ALIST-BIJECTION-FROM-HASHTABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "new_bijection", "NEW-BIJECTION", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "clear_bijection", "CLEAR-BIJECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_empty_p", "BIJECTION-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "non_empty_bijection_p", "NON-EMPTY-BIJECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_lookup", "BIJECTION-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_inverse_lookup", "BIJECTION-INVERSE-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_enter", "BIJECTION-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_inverse_enter", "BIJECTION-INVERSE-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_remove", "BIJECTION-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_inverse_remove", "BIJECTION-INVERSE-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "new_bijection_iterator", "NEW-BIJECTION-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.bijection", "do_bijection", "DO-BIJECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.bijection", "do_bijection_inverse", "DO-BIJECTION-INVERSE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "do_bijection_style", "DO-BIJECTION-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "do_bijection_database", "DO-BIJECTION-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "do_bijection_inverse_database", "DO-BIJECTION-INVERSE-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_keys", "BIJECTION-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_values", "BIJECTION-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_to_alist", "BIJECTION-TO-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "bijection_to_hashtable", "BIJECTION-TO-HASHTABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.bijection", "print_bijection_contents", "PRINT-BIJECTION-CONTENTS", 1, 1, false);
        return (SubLObject)bijection.NIL;
    }
    
    public static SubLObject init_bijection_file() {
        bijection.$bijection_high_water_mark$ = SubLFiles.deflexical("*BIJECTION-HIGH-WATER-MARK*", (SubLObject)bijection.$int0$40);
        bijection.$bijection_low_water_mark$ = SubLFiles.deflexical("*BIJECTION-LOW-WATER-MARK*", (SubLObject)bijection.$int1$30);
        bijection.$dtp_bijection$ = SubLFiles.defconstant("*DTP-BIJECTION*", (SubLObject)bijection.$sym2$BIJECTION);
        return (SubLObject)bijection.NIL;
    }
    
    public static SubLObject setup_bijection_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), bijection.$dtp_bijection$.getGlobalValue(), Symbols.symbol_function((SubLObject)bijection.$sym9$BIJECTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)bijection.$list10);
        Structures.def_csetf((SubLObject)bijection.$sym11$BIJECTION_SIZE, (SubLObject)bijection.$sym12$_CSETF_BIJECTION_SIZE);
        Structures.def_csetf((SubLObject)bijection.$sym13$BIJECTION_DATABASE, (SubLObject)bijection.$sym14$_CSETF_BIJECTION_DATABASE);
        Structures.def_csetf((SubLObject)bijection.$sym15$BIJECTION_INVERSE_DATABASE, (SubLObject)bijection.$sym16$_CSETF_BIJECTION_INVERSE_DATABASE);
        Structures.def_csetf((SubLObject)bijection.$sym17$BIJECTION_TEST, (SubLObject)bijection.$sym18$_CSETF_BIJECTION_TEST);
        Equality.identity((SubLObject)bijection.$sym2$BIJECTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), bijection.$dtp_bijection$.getGlobalValue(), Symbols.symbol_function((SubLObject)bijection.$sym28$VISIT_DEFSTRUCT_OBJECT_BIJECTION_METHOD));
        access_macros.register_macro_helper((SubLObject)bijection.$sym43$DO_BIJECTION_STYLE, (SubLObject)bijection.$sym52$DO_BIJECTION);
        access_macros.register_macro_helper((SubLObject)bijection.$sym45$DO_BIJECTION_DATABASE, (SubLObject)bijection.$sym52$DO_BIJECTION);
        access_macros.register_macro_helper((SubLObject)bijection.$sym51$DO_BIJECTION_INVERSE_DATABASE, (SubLObject)bijection.$sym52$DO_BIJECTION);
        return (SubLObject)bijection.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_bijection_file();
    }
    
    @Override
	public void initializeVariables() {
        init_bijection_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_bijection_file();
    }
    
    static {
        me = (SubLFile)new bijection();
        bijection.$bijection_high_water_mark$ = null;
        bijection.$bijection_low_water_mark$ = null;
        bijection.$dtp_bijection$ = null;
        $int0$40 = SubLObjectFactory.makeInteger(40);
        $int1$30 = SubLObjectFactory.makeInteger(30);
        $sym2$BIJECTION = SubLObjectFactory.makeSymbol("BIJECTION");
        $sym3$BIJECTION_P = SubLObjectFactory.makeSymbol("BIJECTION-P");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("DATABASE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-DATABASE"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("DATABASE"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE-DATABASE"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BIJECTION-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("BIJECTION-DATABASE"), (SubLObject)SubLObjectFactory.makeSymbol("BIJECTION-INVERSE-DATABASE"), (SubLObject)SubLObjectFactory.makeSymbol("BIJECTION-TEST"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BIJECTION-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BIJECTION-DATABASE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BIJECTION-INVERSE-DATABASE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BIJECTION-TEST"));
        $sym8$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym9$BIJECTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("BIJECTION-PRINT-FUNCTION-TRAMPOLINE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("BIJECTION-P"));
        $sym11$BIJECTION_SIZE = SubLObjectFactory.makeSymbol("BIJECTION-SIZE");
        $sym12$_CSETF_BIJECTION_SIZE = SubLObjectFactory.makeSymbol("_CSETF-BIJECTION-SIZE");
        $sym13$BIJECTION_DATABASE = SubLObjectFactory.makeSymbol("BIJECTION-DATABASE");
        $sym14$_CSETF_BIJECTION_DATABASE = SubLObjectFactory.makeSymbol("_CSETF-BIJECTION-DATABASE");
        $sym15$BIJECTION_INVERSE_DATABASE = SubLObjectFactory.makeSymbol("BIJECTION-INVERSE-DATABASE");
        $sym16$_CSETF_BIJECTION_INVERSE_DATABASE = SubLObjectFactory.makeSymbol("_CSETF-BIJECTION-INVERSE-DATABASE");
        $sym17$BIJECTION_TEST = SubLObjectFactory.makeSymbol("BIJECTION-TEST");
        $sym18$_CSETF_BIJECTION_TEST = SubLObjectFactory.makeSymbol("_CSETF-BIJECTION-TEST");
        $kw19$SIZE = SubLObjectFactory.makeKeyword("SIZE");
        $kw20$DATABASE = SubLObjectFactory.makeKeyword("DATABASE");
        $kw21$INVERSE_DATABASE = SubLObjectFactory.makeKeyword("INVERSE-DATABASE");
        $kw22$TEST = SubLObjectFactory.makeKeyword("TEST");
        $str23$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw24$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym25$MAKE_BIJECTION = SubLObjectFactory.makeSymbol("MAKE-BIJECTION");
        $kw26$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw27$END = SubLObjectFactory.makeKeyword("END");
        $sym28$VISIT_DEFSTRUCT_OBJECT_BIJECTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-BIJECTION-METHOD");
        $kw29$ALIST = SubLObjectFactory.makeKeyword("ALIST");
        $kw30$HASHTABLE = SubLObjectFactory.makeKeyword("HASHTABLE");
        $kw31$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str32$Corrupted_bijection__unsupported_ = SubLObjectFactory.makeString("Corrupted bijection; unsupported style ~S.~%");
        $str33$Malformed_bijection_ = SubLObjectFactory.makeString("Malformed bijection.");
        $sym34$VALID_HASH_TEST_P = SubLObjectFactory.makeSymbol("VALID-HASH-TEST-P");
        $sym35$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIJECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw38$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw39$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym40$BIJECTION_VAR = SubLObjectFactory.makeUninternedSymbol("BIJECTION-VAR");
        $sym41$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym42$PCASE = SubLObjectFactory.makeSymbol("PCASE");
        $sym43$DO_BIJECTION_STYLE = SubLObjectFactory.makeSymbol("DO-BIJECTION-STYLE");
        $sym44$DO_ALIST = SubLObjectFactory.makeSymbol("DO-ALIST");
        $sym45$DO_BIJECTION_DATABASE = SubLObjectFactory.makeSymbol("DO-BIJECTION-DATABASE");
        $sym46$DO_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $sym47$OTHERWISE = SubLObjectFactory.makeSymbol("OTHERWISE");
        $sym48$BIJECTION_STYLE_ERROR = SubLObjectFactory.makeSymbol("BIJECTION-STYLE-ERROR");
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("BIJECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym50$BIJECTION_VAR = SubLObjectFactory.makeUninternedSymbol("BIJECTION-VAR");
        $sym51$DO_BIJECTION_INVERSE_DATABASE = SubLObjectFactory.makeSymbol("DO-BIJECTION-INVERSE-DATABASE");
        $sym52$DO_BIJECTION = SubLObjectFactory.makeSymbol("DO-BIJECTION");
        $list53 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str54$_S______S__ = SubLObjectFactory.makeString("~S <-> ~S~%");
    }
    
    public static final class $bijection_native extends SubLStructNative
    {
        public SubLObject $size;
        public SubLObject $database;
        public SubLObject $inverse_database;
        public SubLObject $test;
        private static final SubLStructDeclNative structDecl;
        
        public $bijection_native() {
            this.$size = (SubLObject)CommonSymbols.NIL;
            this.$database = (SubLObject)CommonSymbols.NIL;
            this.$inverse_database = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$bijection_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$size;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$database;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$inverse_database;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$test;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$size = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$database = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$inverse_database = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$test = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$bijection_native.class, bijection.$sym2$BIJECTION, bijection.$sym3$BIJECTION_P, bijection.$list4, bijection.$list5, new String[] { "$size", "$database", "$inverse_database", "$test" }, bijection.$list6, bijection.$list7, bijection.$sym8$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $bijection_p$UnaryFunction extends UnaryFunction
    {
        public $bijection_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("BIJECTION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return bijection.bijection_p(arg1);
        }
    }
}

/*

	Total time: 224 ms
	
*/