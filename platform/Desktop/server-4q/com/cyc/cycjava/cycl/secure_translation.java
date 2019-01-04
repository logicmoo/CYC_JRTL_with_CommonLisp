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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class secure_translation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.secure_translation";
    public static final String myFingerPrint = "8e02c8fd8d38b619f2aa31987c6a7e940131e21d1edd92f340605593711ed76b";
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 847L)
    private static SubLSymbol $translator_security_levels$;
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLSymbol $dtp_secure_id_database$;
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 9531L)
    private static SubLSymbol $secure_id_database_type_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 21104L)
    private static SubLSymbol $standard_library_symbols_not_to_obfuscate$;
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 22334L)
    private static SubLSymbol $misc_symbols_not_to_obfuscate$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$SECURE_ID_DATABASE;
    private static final SubLSymbol $sym2$SECURE_ID_DATABASE_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym8$SECURE_ID_DATABASE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$SID_DB_SECURITY_LEVEL;
    private static final SubLSymbol $sym11$_CSETF_SID_DB_SECURITY_LEVEL;
    private static final SubLSymbol $sym12$SID_DB_ID_MODULE_TABLE;
    private static final SubLSymbol $sym13$_CSETF_SID_DB_ID_MODULE_TABLE;
    private static final SubLSymbol $sym14$SID_DB_MODULE_ID_TABLE;
    private static final SubLSymbol $sym15$_CSETF_SID_DB_MODULE_ID_TABLE;
    private static final SubLSymbol $sym16$SID_DB_ID_METHOD_TABLE;
    private static final SubLSymbol $sym17$_CSETF_SID_DB_ID_METHOD_TABLE;
    private static final SubLSymbol $sym18$SID_DB_METHOD_ID_TABLE;
    private static final SubLSymbol $sym19$_CSETF_SID_DB_METHOD_ID_TABLE;
    private static final SubLSymbol $sym20$SID_DB_ID_GLOBAL_TABLE;
    private static final SubLSymbol $sym21$_CSETF_SID_DB_ID_GLOBAL_TABLE;
    private static final SubLSymbol $sym22$SID_DB_GLOBAL_ID_TABLE;
    private static final SubLSymbol $sym23$_CSETF_SID_DB_GLOBAL_ID_TABLE;
    private static final SubLSymbol $sym24$SID_DB_SYMBOL_EXCEPTIONS;
    private static final SubLSymbol $sym25$_CSETF_SID_DB_SYMBOL_EXCEPTIONS;
    private static final SubLSymbol $sym26$SID_DB_ID_SYMBOL_TABLE;
    private static final SubLSymbol $sym27$_CSETF_SID_DB_ID_SYMBOL_TABLE;
    private static final SubLSymbol $sym28$SID_DB_SYMBOL_ID_TABLE;
    private static final SubLSymbol $sym29$_CSETF_SID_DB_SYMBOL_ID_TABLE;
    private static final SubLSymbol $kw30$SECURITY_LEVEL;
    private static final SubLSymbol $kw31$ID_MODULE_TABLE;
    private static final SubLSymbol $kw32$MODULE_ID_TABLE;
    private static final SubLSymbol $kw33$ID_METHOD_TABLE;
    private static final SubLSymbol $kw34$METHOD_ID_TABLE;
    private static final SubLSymbol $kw35$ID_GLOBAL_TABLE;
    private static final SubLSymbol $kw36$GLOBAL_ID_TABLE;
    private static final SubLSymbol $kw37$SYMBOL_EXCEPTIONS;
    private static final SubLSymbol $kw38$ID_SYMBOL_TABLE;
    private static final SubLSymbol $kw39$SYMBOL_ID_TABLE;
    private static final SubLString $str40$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw41$BEGIN;
    private static final SubLSymbol $sym42$MAKE_SECURE_ID_DATABASE;
    private static final SubLSymbol $kw43$SLOT;
    private static final SubLSymbol $kw44$END;
    private static final SubLSymbol $sym45$VISIT_DEFSTRUCT_OBJECT_SECURE_ID_DATABASE_METHOD;
    private static final SubLSymbol $sym46$TRANSLATOR_SECURITY_LEVEL_P;
    private static final SubLInteger $int47$1500;
    private static final SubLInteger $int48$10000;
    private static final SubLInteger $int49$1000;
    private static final SubLSymbol $kw50$FREE;
    private static final SubLList $list51;
    private static final SubLString $str52$S;
    private static final SubLString $str53$US;
    private static final SubLSymbol $kw54$HIGH;
    private static final SubLString $str55$_;
    private static final SubLSymbol $kw56$OUTPUT;
    private static final SubLString $str57$Unable_to_open__S;
    private static final SubLString $str58$c3edef08_eef1_11dd_9624_00219b50e;
    private static final SubLSymbol $kw59$TYPE;
    private static final SubLSymbol $kw60$VERSION;
    private static final SubLSymbol $kw61$COPYRIGHT;
    private static final SubLSymbol $kw62$INPUT;
    private static final SubLString $str63$Invalid_format___A_cannot_be_inte;
    private static final SubLString $str64$;
    private static final SubLString $str65$Invalid_format__The_type_ID_is_mi;
    private static final SubLSymbol $sym66$FIXNUMP;
    private static final SubLString $str67$Invalid_format___A_is_not_a_valid;
    private static final SubLList $list68;
    private static final SubLString $str69$Invalid_format___A_is_not_a_known;
    private static final SubLString $str70$Invalid_format___A_is_not_a_valid;
    private static final SubLString $str71$Invalid_format___A_is_not_a_valid;
    private static final SubLString $str72$Invalid_format___A_is_not_a_valid;
    private static final SubLSymbol $sym73$STRINGP;
    private static final SubLSymbol $sym74$SYMBOLP;
    private static final SubLSymbol $sym75$API_MUTABLE_GLOBAL_P;
    private static final SubLString $str76$CYC;
    private static final SubLList $list77;
    private static final SubLObject $list78;
    private static final SubLSymbol $kw79$EOF;
    private static final SubLSymbol $sym80$FBOUNDP;
    private static final SubLSymbol $sym81$STRING_;
    private static final SubLSymbol $sym82$SYMBOL_NAME;
    private static final SubLString $str83$Stuck_on__A_which_is_neither_meth;
    private static final SubLString $str84$___in_package__cyc___;
    private static final SubLString $str85$___deflexical__unprovided_trampol;
    private static final SubLString $str86$___define__A_;
    private static final SubLSymbol $sym87$_OPTIONAL;
    private static final SubLString $str88$_____;
    private static final SubLString $str89$___defmacro__A___rest_rest_;
    private static final SubLString $str90$_ret___;
    private static final SubLString $str91$___rest___;
    private static final SubLString $str92$_;
    private static final SubLString $str93$_;
    private static final SubLString $str94$_optional;
    private static final SubLString $str95$__;
    private static final SubLString $str96$__unprovided_trampoline_arg__;
    private static final SubLString $str97$_;
    private static final SubLString $str98$_ret___A;
    private static final SubLString $str99$__;
    private static final SubLString $str100$_pcond;
    private static final SubLString $str101$__eq__unprovided_trampoline_arg__;
    private static final SubLString $str102$__;
    private static final SubLString $str103$_t_;
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1231L)
    public static SubLObject translator_security_level_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, secure_translation.$translator_security_levels$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject secure_id_database_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)secure_translation.ZERO_INTEGER);
        return (SubLObject)secure_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject secure_id_database_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $secure_id_database_native.class) ? secure_translation.T : secure_translation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject sid_db_security_level(final SubLObject v_object) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject sid_db_id_module_table(final SubLObject v_object) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject sid_db_module_id_table(final SubLObject v_object) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject sid_db_id_method_table(final SubLObject v_object) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject sid_db_method_id_table(final SubLObject v_object) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject sid_db_id_global_table(final SubLObject v_object) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject sid_db_global_id_table(final SubLObject v_object) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject sid_db_symbol_exceptions(final SubLObject v_object) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject sid_db_id_symbol_table(final SubLObject v_object) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject sid_db_symbol_id_table(final SubLObject v_object) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject _csetf_sid_db_security_level(final SubLObject v_object, final SubLObject value) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject _csetf_sid_db_id_module_table(final SubLObject v_object, final SubLObject value) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject _csetf_sid_db_module_id_table(final SubLObject v_object, final SubLObject value) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject _csetf_sid_db_id_method_table(final SubLObject v_object, final SubLObject value) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject _csetf_sid_db_method_id_table(final SubLObject v_object, final SubLObject value) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject _csetf_sid_db_id_global_table(final SubLObject v_object, final SubLObject value) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject _csetf_sid_db_global_id_table(final SubLObject v_object, final SubLObject value) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject _csetf_sid_db_symbol_exceptions(final SubLObject v_object, final SubLObject value) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject _csetf_sid_db_id_symbol_table(final SubLObject v_object, final SubLObject value) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject _csetf_sid_db_symbol_id_table(final SubLObject v_object, final SubLObject value) {
        assert secure_translation.NIL != secure_id_database_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject make_secure_id_database(SubLObject arglist) {
        if (arglist == secure_translation.UNPROVIDED) {
            arglist = (SubLObject)secure_translation.NIL;
        }
        final SubLObject v_new = (SubLObject)new $secure_id_database_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)secure_translation.NIL, next = arglist; secure_translation.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)secure_translation.$kw30$SECURITY_LEVEL)) {
                _csetf_sid_db_security_level(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)secure_translation.$kw31$ID_MODULE_TABLE)) {
                _csetf_sid_db_id_module_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)secure_translation.$kw32$MODULE_ID_TABLE)) {
                _csetf_sid_db_module_id_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)secure_translation.$kw33$ID_METHOD_TABLE)) {
                _csetf_sid_db_id_method_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)secure_translation.$kw34$METHOD_ID_TABLE)) {
                _csetf_sid_db_method_id_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)secure_translation.$kw35$ID_GLOBAL_TABLE)) {
                _csetf_sid_db_id_global_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)secure_translation.$kw36$GLOBAL_ID_TABLE)) {
                _csetf_sid_db_global_id_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)secure_translation.$kw37$SYMBOL_EXCEPTIONS)) {
                _csetf_sid_db_symbol_exceptions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)secure_translation.$kw38$ID_SYMBOL_TABLE)) {
                _csetf_sid_db_id_symbol_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)secure_translation.$kw39$SYMBOL_ID_TABLE)) {
                _csetf_sid_db_symbol_id_table(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)secure_translation.$str40$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject visit_defstruct_secure_id_database(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw41$BEGIN, (SubLObject)secure_translation.$sym42$MAKE_SECURE_ID_DATABASE, (SubLObject)secure_translation.TEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw43$SLOT, (SubLObject)secure_translation.$kw30$SECURITY_LEVEL, sid_db_security_level(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw43$SLOT, (SubLObject)secure_translation.$kw31$ID_MODULE_TABLE, sid_db_id_module_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw43$SLOT, (SubLObject)secure_translation.$kw32$MODULE_ID_TABLE, sid_db_module_id_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw43$SLOT, (SubLObject)secure_translation.$kw33$ID_METHOD_TABLE, sid_db_id_method_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw43$SLOT, (SubLObject)secure_translation.$kw34$METHOD_ID_TABLE, sid_db_method_id_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw43$SLOT, (SubLObject)secure_translation.$kw35$ID_GLOBAL_TABLE, sid_db_id_global_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw43$SLOT, (SubLObject)secure_translation.$kw36$GLOBAL_ID_TABLE, sid_db_global_id_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw43$SLOT, (SubLObject)secure_translation.$kw37$SYMBOL_EXCEPTIONS, sid_db_symbol_exceptions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw43$SLOT, (SubLObject)secure_translation.$kw38$ID_SYMBOL_TABLE, sid_db_id_symbol_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw43$SLOT, (SubLObject)secure_translation.$kw39$SYMBOL_ID_TABLE, sid_db_symbol_id_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)secure_translation.$kw44$END, (SubLObject)secure_translation.$sym42$MAKE_SECURE_ID_DATABASE, (SubLObject)secure_translation.TEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 1773L)
    public static SubLObject visit_defstruct_object_secure_id_database_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_secure_id_database(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 2908L)
    public static SubLObject new_secure_id_database(final SubLObject security_level) {
        assert secure_translation.NIL != translator_security_level_p(security_level) : security_level;
        final SubLObject sid_db = make_secure_id_database((SubLObject)secure_translation.UNPROVIDED);
        SubLObject id_module_table = (SubLObject)secure_translation.NIL;
        SubLObject module_id_table = (SubLObject)secure_translation.NIL;
        SubLObject id_method_table = (SubLObject)secure_translation.NIL;
        SubLObject method_id_table = (SubLObject)secure_translation.NIL;
        SubLObject id_global_table = (SubLObject)secure_translation.NIL;
        SubLObject global_id_table = (SubLObject)secure_translation.NIL;
        SubLObject id_symbol_table = (SubLObject)secure_translation.NIL;
        SubLObject symbol_id_table = (SubLObject)secure_translation.NIL;
        SubLObject symbol_exceptions = (SubLObject)secure_translation.NIL;
        final SubLObject expected_module_count = (SubLObject)secure_translation.$int47$1500;
        id_module_table = id_index.new_id_index(expected_module_count, (SubLObject)secure_translation.ZERO_INTEGER);
        module_id_table = Hashtables.make_hash_table(expected_module_count, Symbols.symbol_function((SubLObject)secure_translation.EQUAL), (SubLObject)secure_translation.UNPROVIDED);
        final SubLObject expected_method_count = (SubLObject)secure_translation.$int48$10000;
        id_method_table = id_index.new_id_index(expected_method_count, (SubLObject)secure_translation.ZERO_INTEGER);
        method_id_table = Hashtables.make_hash_table(expected_method_count, Symbols.symbol_function((SubLObject)secure_translation.EQ), (SubLObject)secure_translation.UNPROVIDED);
        final SubLObject expected_global_count = (SubLObject)secure_translation.$int48$10000;
        id_global_table = id_index.new_id_index(expected_global_count, (SubLObject)secure_translation.ZERO_INTEGER);
        global_id_table = Hashtables.make_hash_table(expected_global_count, Symbols.symbol_function((SubLObject)secure_translation.EQ), (SubLObject)secure_translation.UNPROVIDED);
        final SubLObject expected_symbol_count = (SubLObject)secure_translation.$int48$10000;
        id_symbol_table = id_index.new_id_index(expected_symbol_count, (SubLObject)secure_translation.ZERO_INTEGER);
        symbol_id_table = Hashtables.make_hash_table(expected_symbol_count, Symbols.symbol_function((SubLObject)secure_translation.EQ), (SubLObject)secure_translation.UNPROVIDED);
        final SubLObject excepted_symbol_count = (SubLObject)secure_translation.$int49$1000;
        symbol_exceptions = set.new_set(Symbols.symbol_function((SubLObject)secure_translation.EQ), excepted_symbol_count);
        set_secure_id_database_slots(sid_db, security_level, id_module_table, module_id_table, id_method_table, method_id_table, id_global_table, global_id_table, id_symbol_table, symbol_id_table, symbol_exceptions);
        secure_id_database_populate_symbol_exceptions(sid_db);
        return sid_db;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 4439L)
    public static SubLObject set_secure_id_database_slots(final SubLObject sid_db, final SubLObject security_level, final SubLObject id_module_table, final SubLObject module_id_table, final SubLObject id_method_table, final SubLObject method_id_table, final SubLObject id_global_table, final SubLObject global_id_table, final SubLObject id_symbol_table, final SubLObject symbol_id_table, final SubLObject symbol_exceptions) {
        _csetf_sid_db_security_level(sid_db, security_level);
        _csetf_sid_db_id_module_table(sid_db, id_module_table);
        _csetf_sid_db_module_id_table(sid_db, module_id_table);
        _csetf_sid_db_id_method_table(sid_db, id_method_table);
        _csetf_sid_db_method_id_table(sid_db, method_id_table);
        _csetf_sid_db_id_global_table(sid_db, id_global_table);
        _csetf_sid_db_global_id_table(sid_db, global_id_table);
        _csetf_sid_db_id_symbol_table(sid_db, id_symbol_table);
        _csetf_sid_db_symbol_id_table(sid_db, symbol_id_table);
        _csetf_sid_db_symbol_exceptions(sid_db, symbol_exceptions);
        return sid_db;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 5465L)
    public static SubLObject destroy_secure_id_database(final SubLObject sid_db) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        _csetf_sid_db_security_level(sid_db, (SubLObject)secure_translation.$kw50$FREE);
        id_index.clear_id_index(sid_db_id_module_table(sid_db));
        _csetf_sid_db_id_module_table(sid_db, (SubLObject)secure_translation.$kw50$FREE);
        Hashtables.clrhash(sid_db_module_id_table(sid_db));
        _csetf_sid_db_module_id_table(sid_db, (SubLObject)secure_translation.$kw50$FREE);
        id_index.clear_id_index(sid_db_id_method_table(sid_db));
        _csetf_sid_db_id_method_table(sid_db, (SubLObject)secure_translation.$kw50$FREE);
        Hashtables.clrhash(sid_db_method_id_table(sid_db));
        _csetf_sid_db_method_id_table(sid_db, (SubLObject)secure_translation.$kw50$FREE);
        id_index.clear_id_index(sid_db_id_global_table(sid_db));
        _csetf_sid_db_id_global_table(sid_db, (SubLObject)secure_translation.$kw50$FREE);
        Hashtables.clrhash(sid_db_global_id_table(sid_db));
        _csetf_sid_db_global_id_table(sid_db, (SubLObject)secure_translation.$kw50$FREE);
        Hashtables.clrhash(sid_db_symbol_exceptions(sid_db));
        _csetf_sid_db_symbol_exceptions(sid_db, (SubLObject)secure_translation.$kw50$FREE);
        id_index.clear_id_index(sid_db_id_symbol_table(sid_db));
        _csetf_sid_db_id_symbol_table(sid_db, (SubLObject)secure_translation.$kw50$FREE);
        Hashtables.clrhash(sid_db_symbol_id_table(sid_db));
        _csetf_sid_db_symbol_id_table(sid_db, (SubLObject)secure_translation.$kw50$FREE);
        return sid_db;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 6723L)
    public static SubLObject secure_id_database_security_level(final SubLObject sid_db) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        return sid_db_security_level(sid_db);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 6877L)
    public static SubLObject secure_id_database_lookup_module(final SubLObject sid_db, final SubLObject id) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        return id_index.id_index_lookup(sid_db_id_module_table(sid_db), id, (SubLObject)secure_translation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 7070L)
    public static SubLObject secure_id_database_lookup_method(final SubLObject sid_db, final SubLObject id) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        return id_index.id_index_lookup(sid_db_id_method_table(sid_db), id, (SubLObject)secure_translation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 7237L)
    public static SubLObject secure_id_database_lookup_global(final SubLObject sid_db, final SubLObject id) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        return id_index.id_index_lookup(sid_db_id_global_table(sid_db), id, (SubLObject)secure_translation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 7404L)
    public static SubLObject secure_id_database_excepted_symbolP(final SubLObject sid_db, final SubLObject symbol) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        return set.set_memberP(symbol, sid_db_symbol_exceptions(sid_db));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 7580L)
    public static SubLObject secure_id_database_lookup_symbol(final SubLObject sid_db, final SubLObject id) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        return id_index.id_index_lookup(sid_db_id_symbol_table(sid_db), id, (SubLObject)secure_translation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 7747L)
    public static SubLObject secure_id_database_symbol_name(final SubLObject sid_db, final SubLObject symbol) {
        final SubLObject level = secure_id_database_security_level(sid_db);
        final SubLObject v_package = Symbols.symbol_package(symbol);
        SubLObject secure_name;
        SubLObject basis = secure_name = Symbols.symbol_name(symbol);
        if (secure_translation.NIL == secure_id_database_name_sensitive_symbolP(symbol) && secure_translation.NIL != list_utilities.member_eqP(level, (SubLObject)secure_translation.$list51) && secure_translation.NIL == secure_id_database_excepted_symbolP(sid_db, symbol)) {
            final SubLObject prefix = (SubLObject)((secure_translation.NIL != v_package) ? secure_translation.$str52$S : secure_translation.$str53$US);
            if (level == secure_translation.$kw54$HIGH) {
                if (secure_translation.NIL != v_package) {
                    basis = secure_id_database_symbol_id(sid_db, symbol);
                }
                else {
                    basis = string_utilities.integer_to_hex_string(sxhash_external.sxhash_external(Symbols.symbol_name(symbol)));
                }
            }
            secure_name = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[] { secure_translation.$str55$_, format_nil.format_nil_a_no_copy(basis) });
        }
        return secure_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 8569L)
    public static SubLObject secure_id_database_name_sensitive_symbolP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && (v_object.isKeyword() || secure_translation.NIL != sublisp_symbol_p(v_object) || secure_translation.NIL != cycl_variables.el_varP(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 8783L)
    public static SubLObject sublisp_symbol_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && v_object.eql(Packages.find_symbol(Symbols.symbol_name(v_object), control_vars.$sublisp_package$.getGlobalValue())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 8930L)
    public static SubLObject save_secure_id_database_to_file(final SubLObject sid_db, final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)secure_translation.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)secure_translation.NIL, thread);
                stream = compatibility.open_binary(file, (SubLObject)secure_translation.$kw56$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)secure_translation.$str57$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            save_secure_id_database(sid_db, s);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)secure_translation.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)secure_translation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 9231L)
    public static SubLObject save_secure_id_database(final SubLObject sid_db, final SubLObject stream) {
        cfasl.cfasl_output(construct_recipe_for_secure_id_database(sid_db), stream);
        return sid_db;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 9671L)
    public static SubLObject construct_recipe_for_secure_id_database(final SubLObject sid_db) {
        SubLObject recipe = (SubLObject)secure_translation.NIL;
        recipe = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)secure_translation.$kw59$TYPE, secure_translation.$secure_id_database_type_marker$.getGlobalValue()), recipe);
        recipe = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)secure_translation.$kw60$VERSION, (SubLObject)ConsesLow.list((SubLObject)secure_translation.ONE_INTEGER, (SubLObject)secure_translation.ZERO_INTEGER)), recipe);
        recipe = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)secure_translation.$kw61$COPYRIGHT, misc_utilities.copyright_notice()), recipe);
        recipe = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)secure_translation.$kw30$SECURITY_LEVEL, sid_db_security_level(sid_db)), recipe);
        recipe = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)secure_translation.$kw32$MODULE_ID_TABLE, sid_db_module_id_table(sid_db)), recipe);
        recipe = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)secure_translation.$kw34$METHOD_ID_TABLE, sid_db_method_id_table(sid_db)), recipe);
        recipe = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)secure_translation.$kw36$GLOBAL_ID_TABLE, sid_db_global_id_table(sid_db)), recipe);
        recipe = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)secure_translation.$kw39$SYMBOL_ID_TABLE, sid_db_symbol_id_table(sid_db)), recipe);
        recipe = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)secure_translation.$kw37$SYMBOL_EXCEPTIONS, sid_db_symbol_exceptions(sid_db)), recipe);
        return recipe;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 10742L)
    public static SubLObject restore_secure_id_database_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sid_db = (SubLObject)secure_translation.NIL;
        SubLObject stream = (SubLObject)secure_translation.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)secure_translation.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)secure_translation.$kw62$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)secure_translation.$str57$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            sid_db = restore_secure_id_database(s);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)secure_translation.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)secure_translation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return sid_db;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 11046L)
    public static SubLObject restore_secure_id_database(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject recipe = load_secure_id_database_recipe(stream);
        if (secure_translation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !recipe.isCons()) {
            Errors.error((SubLObject)secure_translation.$str63$Invalid_format___A_cannot_be_inte, recipe);
        }
        if (secure_translation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && secure_translation.NIL == Strings.stringE(secure_translation.$secure_id_database_type_marker$.getGlobalValue(), sid_db_recipe_get(recipe, (SubLObject)secure_translation.$kw59$TYPE, (SubLObject)secure_translation.$str64$), (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED)) {
            Errors.error((SubLObject)secure_translation.$str65$Invalid_format__The_type_ID_is_mi);
        }
        final SubLObject version = sid_db_recipe_get(recipe, (SubLObject)secure_translation.$kw60$VERSION, (SubLObject)secure_translation.UNPROVIDED);
        if (secure_translation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!version.isCons() || secure_translation.NIL == list_utilities.list_of_type_p((SubLObject)secure_translation.$sym66$FIXNUMP, version))) {
            Errors.error((SubLObject)secure_translation.$str67$Invalid_format___A_is_not_a_valid, version);
        }
        return interpret_secure_id_database_recipe_by_version(recipe, version);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 11849L)
    public static SubLObject load_secure_id_database_recipe(final SubLObject stream) {
        return cfasl.cfasl_input(stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 11937L)
    public static SubLObject sid_db_recipe_get(final SubLObject recipe, final SubLObject marker, SubLObject v_default) {
        if (v_default == secure_translation.UNPROVIDED) {
            v_default = (SubLObject)secure_translation.NIL;
        }
        return list_utilities.alist_lookup(recipe, marker, Symbols.symbol_function((SubLObject)secure_translation.EQ), v_default).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 12067L)
    public static SubLObject interpret_secure_id_database_recipe_by_version(final SubLObject recipe, final SubLObject version) {
        if (secure_translation.$list68.equal(version)) {
            return interpret_secure_id_database_recipe_v1p0(recipe);
        }
        Errors.error((SubLObject)secure_translation.$str69$Invalid_format___A_is_not_a_known, version);
        return (SubLObject)secure_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 12348L)
    public static SubLObject interpret_secure_id_database_recipe_v1p0(final SubLObject recipe) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject security_level = (SubLObject)secure_translation.NIL;
        SubLObject id_module_table = (SubLObject)secure_translation.NIL;
        SubLObject module_id_table = (SubLObject)secure_translation.NIL;
        SubLObject id_method_table = (SubLObject)secure_translation.NIL;
        SubLObject method_id_table = (SubLObject)secure_translation.NIL;
        SubLObject id_global_table = (SubLObject)secure_translation.NIL;
        SubLObject global_id_table = (SubLObject)secure_translation.NIL;
        SubLObject id_symbol_table = (SubLObject)secure_translation.NIL;
        SubLObject symbol_id_table = (SubLObject)secure_translation.NIL;
        SubLObject symbol_exceptions = (SubLObject)secure_translation.NIL;
        security_level = sid_db_recipe_get(recipe, (SubLObject)secure_translation.$kw30$SECURITY_LEVEL, (SubLObject)secure_translation.UNPROVIDED);
        if (secure_translation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && secure_translation.NIL == translator_security_level_p(security_level)) {
            Errors.error((SubLObject)secure_translation.$str70$Invalid_format___A_is_not_a_valid, security_level);
        }
        module_id_table = fetch_valid_secure_id_database_table(recipe, (SubLObject)secure_translation.$kw32$MODULE_ID_TABLE);
        method_id_table = fetch_valid_secure_id_database_table(recipe, (SubLObject)secure_translation.$kw34$METHOD_ID_TABLE);
        global_id_table = fetch_valid_secure_id_database_table(recipe, (SubLObject)secure_translation.$kw36$GLOBAL_ID_TABLE);
        symbol_id_table = fetch_valid_secure_id_database_table(recipe, (SubLObject)secure_translation.$kw39$SYMBOL_ID_TABLE);
        id_module_table = id_index.new_id_index_from_reverse_index(module_id_table);
        id_method_table = id_index.new_id_index_from_reverse_index(method_id_table);
        id_global_table = id_index.new_id_index_from_reverse_index(global_id_table);
        id_symbol_table = id_index.new_id_index_from_reverse_index(symbol_id_table);
        symbol_exceptions = sid_db_recipe_get(recipe, (SubLObject)secure_translation.$kw37$SYMBOL_EXCEPTIONS, (SubLObject)secure_translation.UNPROVIDED);
        if (secure_translation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && secure_translation.NIL == set.set_p(symbol_exceptions)) {
            Errors.error((SubLObject)secure_translation.$str71$Invalid_format___A_is_not_a_valid, symbol_exceptions);
        }
        return set_secure_id_database_slots(make_secure_id_database((SubLObject)secure_translation.UNPROVIDED), security_level, id_module_table, module_id_table, id_method_table, method_id_table, id_global_table, global_id_table, id_symbol_table, symbol_id_table, symbol_exceptions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 14082L)
    public static SubLObject fetch_valid_secure_id_database_table(final SubLObject recipe, final SubLObject tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = sid_db_recipe_get(recipe, tag, (SubLObject)secure_translation.UNPROVIDED);
        if (secure_translation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && secure_translation.NIL == map_utilities.map_p(table)) {
            Errors.error((SubLObject)secure_translation.$str72$Invalid_format___A_is_not_a_valid, table, tag);
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 14327L)
    public static SubLObject secure_id_database_known_moduleP(final SubLObject sid_db, final SubLObject module_name) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        assert secure_translation.NIL != Types.stringp(module_name) : module_name;
        return list_utilities.sublisp_boolean(Hashtables.gethash_without_values(module_name, sid_db_module_id_table(sid_db), (SubLObject)secure_translation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 14576L)
    public static SubLObject secure_id_database_known_methodP(final SubLObject sid_db, final SubLObject method) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        assert secure_translation.NIL != Types.symbolp(method) : method;
        return list_utilities.sublisp_boolean(Hashtables.gethash_without_values(method, sid_db_method_id_table(sid_db), (SubLObject)secure_translation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 14797L)
    public static SubLObject secure_id_database_known_globalP(final SubLObject sid_db, final SubLObject global) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        assert secure_translation.NIL != Types.symbolp(global) : global;
        return list_utilities.sublisp_boolean(Hashtables.gethash_without_values(global, sid_db_global_id_table(sid_db), (SubLObject)secure_translation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 15018L)
    public static SubLObject secure_id_database_module_id(final SubLObject sid_db, final SubLObject module_name) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        assert secure_translation.NIL != Types.stringp(module_name) : module_name;
        SubLObject id = Hashtables.gethash_without_values(module_name, sid_db_module_id_table(sid_db), (SubLObject)secure_translation.UNPROVIDED);
        if (secure_translation.NIL == id) {
            id = id_index.id_index_reserve(sid_db_id_module_table(sid_db));
            id_index.id_index_enter(sid_db_id_module_table(sid_db), id, module_name);
            Hashtables.sethash(module_name, sid_db_module_id_table(sid_db), id);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 15493L)
    public static SubLObject secure_id_database_method_id(final SubLObject sid_db, final SubLObject method) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        assert secure_translation.NIL != Types.symbolp(method) : method;
        SubLObject id = Hashtables.gethash_without_values(method, sid_db_method_id_table(sid_db), (SubLObject)secure_translation.UNPROVIDED);
        if (secure_translation.NIL == id) {
            id = id_index.id_index_reserve(sid_db_id_method_table(sid_db));
            id_index.id_index_enter(sid_db_id_method_table(sid_db), id, method);
            Hashtables.sethash(method, sid_db_method_id_table(sid_db), id);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 15929L)
    public static SubLObject secure_id_database_global_id(final SubLObject sid_db, final SubLObject global) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        assert secure_translation.NIL != Types.symbolp(global) : global;
        SubLObject id = Hashtables.gethash_without_values(global, sid_db_global_id_table(sid_db), (SubLObject)secure_translation.UNPROVIDED);
        if (secure_translation.NIL == id) {
            id = id_index.id_index_reserve(sid_db_id_global_table(sid_db));
            id_index.id_index_enter(sid_db_id_global_table(sid_db), id, global);
            Hashtables.sethash(global, sid_db_global_id_table(sid_db), id);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 16365L)
    public static SubLObject secure_id_database_symbol_id(final SubLObject sid_db, final SubLObject symbol) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        assert secure_translation.NIL != Types.symbolp(symbol) : symbol;
        SubLObject id = Hashtables.gethash_without_values(symbol, sid_db_symbol_id_table(sid_db), (SubLObject)secure_translation.UNPROVIDED);
        if (secure_translation.NIL == id) {
            id = id_index.id_index_reserve(sid_db_id_symbol_table(sid_db));
            id_index.id_index_enter(sid_db_id_symbol_table(sid_db), id, symbol);
            Hashtables.sethash(symbol, sid_db_symbol_id_table(sid_db), id);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 16801L)
    public static SubLObject secure_id_database_populate_symbol_exceptions(final SubLObject sid_db) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        if (secure_translation.NIL != list_utilities.member_eqP(secure_id_database_security_level(sid_db), (SubLObject)secure_translation.$list51)) {
            final SubLObject exceptions = sid_db_symbol_exceptions(sid_db);
            sid_db_symbol_exceptions_add_all(exceptions);
            return (SubLObject)secure_translation.T;
        }
        return (SubLObject)secure_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 17138L)
    public static SubLObject secure_id_database_note_symbol_exception(final SubLObject sid_db, final SubLObject symbol) {
        assert secure_translation.NIL != secure_id_database_p(sid_db) : sid_db;
        assert secure_translation.NIL != Types.symbolp(symbol) : symbol;
        if (secure_translation.NIL != list_utilities.member_eqP(secure_id_database_security_level(sid_db), (SubLObject)secure_translation.$list51)) {
            set.set_add(symbol, sid_db_symbol_exceptions(sid_db));
            return (SubLObject)secure_translation.T;
        }
        return (SubLObject)secure_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 17450L)
    public static SubLObject current_system_translation_secure_module_lookup(final SubLObject secure_module_id) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (secure_translation.NIL != sys_tran) {
            final SubLObject sid_db = system_translation.sys_tran_secure_id_database(sys_tran);
            if (secure_translation.NIL != sid_db) {
                return secure_id_database_lookup_module(sid_db, secure_module_id);
            }
        }
        return (SubLObject)secure_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 17770L)
    public static SubLObject current_system_translation_secure_method_lookup(final SubLObject secure_method_id) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (secure_translation.NIL != sys_tran) {
            final SubLObject sid_db = system_translation.sys_tran_secure_id_database(sys_tran);
            if (secure_translation.NIL != sid_db) {
                return secure_id_database_lookup_method(sid_db, secure_method_id);
            }
        }
        return (SubLObject)secure_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 18076L)
    public static SubLObject current_system_translation_secure_global_lookup(final SubLObject secure_global_id) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (secure_translation.NIL != sys_tran) {
            final SubLObject sid_db = system_translation.sys_tran_secure_id_database(sys_tran);
            if (secure_translation.NIL != sid_db) {
                return secure_id_database_lookup_global(sid_db, secure_global_id);
            }
        }
        return (SubLObject)secure_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 18382L)
    public static SubLObject current_system_translation_secure_symbol_lookup(final SubLObject secure_symbol_id) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (secure_translation.NIL != sys_tran) {
            final SubLObject sid_db = system_translation.sys_tran_secure_id_database(sys_tran);
            if (secure_translation.NIL != sid_db) {
                return secure_id_database_lookup_symbol(sid_db, secure_symbol_id);
            }
        }
        return (SubLObject)secure_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 18688L)
    public static SubLObject sid_db_symbol_exceptions_add_all(final SubLObject exceptions) {
        sid_db_symbol_exceptions_add_for_api(exceptions);
        sid_db_symbol_exceptions_add_for_external(exceptions);
        sid_db_symbol_exceptions_add_for_system_parameters(exceptions);
        sid_db_symbol_exceptions_add_for_html_handlers(exceptions);
        sid_db_symbol_exceptions_add_for_kb_function_symbols(exceptions);
        sid_db_symbol_exceptions_add_for_standard_libraries(exceptions);
        sid_db_symbol_exceptions_add_for_misc_symbols(exceptions);
        return (SubLObject)secure_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 19435L)
    public static SubLObject sid_db_symbol_exceptions_add_for_api(final SubLObject exceptions) {
        SubLObject symbol = (SubLObject)secure_translation.NIL;
        SubLObject value = (SubLObject)secure_translation.NIL;
        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(utilities_macros.$api_predefined_function_table$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                symbol = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                set.set_add(symbol, exceptions);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        symbol = (SubLObject)secure_translation.NIL;
        value = (SubLObject)secure_translation.NIL;
        cdohash_iterator = Hashtables.getEntrySetIterator(utilities_macros.$api_predefined_macro_table$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                symbol = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                set.set_add(symbol, exceptions);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        set.set_add((SubLObject)secure_translation.$sym75$API_MUTABLE_GLOBAL_P, exceptions);
        return (SubLObject)secure_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 19901L)
    public static SubLObject sid_db_symbol_exceptions_add_symbols(final SubLObject exceptions, final SubLObject symbols) {
        final SubLObject cyc_package = Packages.find_package((SubLObject)secure_translation.$str76$CYC);
        SubLObject total = (SubLObject)secure_translation.ZERO_INTEGER;
        SubLObject cdolist_list_var = symbols;
        SubLObject symbol = (SubLObject)secure_translation.NIL;
        symbol = cdolist_list_var.first();
        while (secure_translation.NIL != cdolist_list_var) {
            if (cyc_package.eql(Symbols.symbol_package(symbol))) {
                total = Numbers.add(total, (SubLObject)secure_translation.ONE_INTEGER);
                set.set_add(symbol, exceptions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 20180L)
    public static SubLObject sid_db_symbol_exceptions_add_for_external(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, access_macros.all_external_symbols());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 20404L)
    public static SubLObject sid_db_symbol_exceptions_add_for_system_parameters(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, system_parameters.all_system_parameters());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 20568L)
    public static SubLObject sid_db_symbol_exceptions_add_for_html_handlers(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, html_macros.all_html_handler_symbols());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 20757L)
    public static SubLObject sid_db_symbol_exceptions_add_for_kb_function_symbols(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, utilities_macros.all_kb_functions());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 20918L)
    public static SubLObject sid_db_symbol_exceptions_add_for_standard_libraries(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, secure_translation.$standard_library_symbols_not_to_obfuscate$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 22166L)
    public static SubLObject sid_db_symbol_exceptions_add_for_misc_symbols(final SubLObject exceptions) {
        return sid_db_symbol_exceptions_add_symbols(exceptions, secure_translation.$misc_symbols_not_to_obfuscate$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 46764L)
    public static SubLObject sid_db_symbol_exceptions_register_and_retranslate_misc(SubLObject symbols) {
        if (symbols == secure_translation.UNPROVIDED) {
            symbols = secure_translation.$misc_symbols_not_to_obfuscate$.getGlobalValue();
        }
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (secure_translation.NIL != sys_tran) {
            final SubLObject sid_db = system_translation.sys_tran_secure_id_database(sys_tran);
            final SubLObject exceptions = sid_db_symbol_exceptions(sid_db);
            sid_db_symbol_exceptions_add_symbols(exceptions, symbols);
        }
        SubLObject v_modules = (SubLObject)secure_translation.NIL;
        SubLObject cdolist_list_var = symbols;
        SubLObject symbol = (SubLObject)secure_translation.NIL;
        symbol = cdolist_list_var.first();
        while (secure_translation.NIL != cdolist_list_var) {
            final SubLObject method_module = xref_database.xref_method_defining_module(symbol);
            final SubLObject module = (secure_translation.NIL != method_module) ? method_module : xref_database.xref_global_defining_module(symbol);
            if (secure_translation.NIL != module) {
                final SubLObject item_var = module;
                if (secure_translation.NIL == conses_high.member(item_var, v_modules, Symbols.symbol_function((SubLObject)secure_translation.EQUAL), Symbols.symbol_function((SubLObject)secure_translation.IDENTITY))) {
                    v_modules = (SubLObject)ConsesLow.cons(item_var, v_modules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        system_translation.retranslate_modules(v_modules);
        return Sequences.length(v_modules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 47466L)
    public static SubLObject gather_all_subl_functions_mentioned_in_file(final SubLObject file, SubLObject functions) {
        if (functions == secure_translation.UNPROVIDED) {
            functions = (SubLObject)secure_translation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (secure_translation.NIL == set.set_p(functions)) {
            functions = set.new_set((SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        }
        SubLObject stream = (SubLObject)secure_translation.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)secure_translation.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)secure_translation.$kw62$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)secure_translation.$str57$Unable_to_open__S, file);
            }
            SubLObject s;
            SubLObject form;
            SubLObject fsyms;
            for (s = stream, form = (SubLObject)secure_translation.NIL, form = reader.read(s, (SubLObject)secure_translation.NIL, (SubLObject)secure_translation.$kw79$EOF, (SubLObject)secure_translation.UNPROVIDED); secure_translation.$kw79$EOF != form; form = reader.read(s, (SubLObject)secure_translation.NIL, (SubLObject)secure_translation.$kw79$EOF, (SubLObject)secure_translation.UNPROVIDED)) {
                fsyms = list_utilities.remove_if_not((SubLObject)secure_translation.$sym80$FBOUNDP, list_utilities.tree_gather(form, (SubLObject)secure_translation.$sym74$SYMBOLP, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED), (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
                set_utilities.set_add_all(fsyms, functions);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)secure_translation.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)secure_translation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return functions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 48205L)
    public static SubLObject gather_all_subl_functions_mentioned_in_files(final SubLObject files, SubLObject functions) {
        if (functions == secure_translation.UNPROVIDED) {
            functions = (SubLObject)secure_translation.NIL;
        }
        SubLObject cdolist_list_var = files;
        SubLObject file = (SubLObject)secure_translation.NIL;
        file = cdolist_list_var.first();
        while (secure_translation.NIL != cdolist_list_var) {
            functions = gather_all_subl_functions_mentioned_in_file(file, functions);
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        }
        return functions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 48424L)
    public static SubLObject all_securely_translated_methods_requiring_trampolines(final SubLObject sid_db, final SubLObject v_methods) {
        SubLObject method_list = (SubLObject)secure_translation.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_methods);
        SubLObject basis_object;
        SubLObject state;
        SubLObject method;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)secure_translation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); secure_translation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            method = set_contents.do_set_contents_next(basis_object, state);
            if (secure_translation.NIL != set_contents.do_set_contents_element_validP(state, method) && secure_translation.NIL != secure_id_database_known_methodP(sid_db, method) && secure_translation.NIL == secure_id_database_excepted_symbolP(sid_db, method)) {
                method_list = (SubLObject)ConsesLow.cons(method, method_list);
            }
        }
        return Sort.sort(method_list, (SubLObject)secure_translation.$sym81$STRING_, (SubLObject)secure_translation.$sym82$SYMBOL_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 48802L)
    public static SubLObject write_trampolines_for_securely_translated_methods(final SubLObject sid_db, final SubLObject v_methods, SubLObject stream) {
        if (stream == secure_translation.UNPROVIDED) {
            stream = (SubLObject)secure_translation.T;
        }
        write_trampoline_file_header_for_securely_translated_methods(stream);
        SubLObject cdolist_list_var = all_securely_translated_methods_requiring_trampolines(sid_db, v_methods);
        SubLObject method = (SubLObject)secure_translation.NIL;
        method = cdolist_list_var.first();
        while (secure_translation.NIL != cdolist_list_var) {
            final SubLObject secure_method_name = secure_id_database_symbol_name(sid_db, method);
            if (method.isMacroOperator()) {
                write_trampoline_for_securely_translated_macro(method, secure_method_name, stream);
            }
            else if (secure_translation.NIL != subl_promotions.function_symbol_p(method)) {
                final SubLObject argument_list = write_trampolines_get_method_arglist_names_only(method);
                write_trampoline_for_securely_translated_method(method, secure_method_name, argument_list, stream);
            }
            else {
                Errors.error((SubLObject)secure_translation.$str83$Stuck_on__A_which_is_neither_meth, method);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return sid_db;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 49646L)
    public static SubLObject write_trampolines_get_method_arglist_names_only(final SubLObject method) {
        final SubLObject raw_arglist = subl_promotions.function_symbol_arglist(method);
        SubLObject arg_list = (SubLObject)secure_translation.NIL;
        SubLObject cdolist_list_var = raw_arglist;
        SubLObject arg = (SubLObject)secure_translation.NIL;
        arg = cdolist_list_var.first();
        while (secure_translation.NIL != cdolist_list_var) {
            if (arg.isCons()) {
                arg = arg.first();
            }
            arg_list = (SubLObject)ConsesLow.cons(arg, arg_list);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.nreverse(arg_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 50191L)
    public static SubLObject write_trampoline_file_header_for_securely_translated_methods(final SubLObject stream) {
        PrintLow.format(stream, (SubLObject)secure_translation.$str84$___in_package__cyc___);
        PrintLow.format(stream, (SubLObject)secure_translation.$str85$___deflexical__unprovided_trampol);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 50439L)
    public static SubLObject write_trampoline_for_securely_translated_method(final SubLObject method, final SubLObject secure_method_name, final SubLObject argument_list, SubLObject stream) {
        if (stream == secure_translation.UNPROVIDED) {
            stream = (SubLObject)secure_translation.T;
        }
        PrintLow.format(stream, (SubLObject)secure_translation.$str86$___define__A_, method);
        SubLObject required = argument_list;
        final SubLObject split_point = Sequences.position((SubLObject)secure_translation.$sym87$_OPTIONAL, argument_list, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        SubLObject optional = (SubLObject)secure_translation.NIL;
        if (split_point.isInteger()) {
            required = Sequences.subseq(argument_list, (SubLObject)secure_translation.ZERO_INTEGER, split_point);
            optional = Sequences.subseq(argument_list, Numbers.add(split_point, (SubLObject)secure_translation.ONE_INTEGER), (SubLObject)secure_translation.UNPROVIDED);
        }
        write_trampoline_argument_list(required, optional, stream);
        streams_high.terpri(stream);
        string_utilities.indent(stream, (SubLObject)secure_translation.TWO_INTEGER);
        if (secure_translation.NIL == optional) {
            write_trampoline_invocation_form(secure_method_name, required, stream);
        }
        else {
            write_trampoline_invocation_form_for_optional_args(secure_method_name, required, optional, stream);
        }
        PrintLow.format(stream, (SubLObject)secure_translation.$str88$_____);
        return secure_method_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 51337L)
    public static SubLObject write_trampoline_for_securely_translated_macro(final SubLObject method, final SubLObject secure_method_name, SubLObject stream) {
        if (stream == secure_translation.UNPROVIDED) {
            stream = (SubLObject)secure_translation.T;
        }
        PrintLow.format(stream, (SubLObject)secure_translation.$str89$___defmacro__A___rest_rest_, method);
        streams_high.terpri(stream);
        string_utilities.indent(stream, (SubLObject)secure_translation.TWO_INTEGER);
        streams_high.write_string((SubLObject)secure_translation.$str90$_ret___, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        streams_high.write_string(secure_method_name, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        streams_high.write_string((SubLObject)secure_translation.$str91$___rest___, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        streams_high.terpri(stream);
        streams_high.terpri(stream);
        return secure_method_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 51727L)
    public static SubLObject write_trampoline_argument_list(final SubLObject required, final SubLObject optional, SubLObject stream) {
        if (stream == secure_translation.UNPROVIDED) {
            stream = (SubLObject)secure_translation.T;
        }
        SubLObject need_spaceP = (SubLObject)secure_translation.NIL;
        streams_high.write_string((SubLObject)secure_translation.$str92$_, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        SubLObject cdolist_list_var = required;
        SubLObject req = (SubLObject)secure_translation.NIL;
        req = cdolist_list_var.first();
        while (secure_translation.NIL != cdolist_list_var) {
            if (secure_translation.NIL != need_spaceP) {
                streams_high.write_string((SubLObject)secure_translation.$str93$_, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
            }
            streams_high.write_string(Symbols.symbol_name(req), stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
            need_spaceP = (SubLObject)secure_translation.T;
            cdolist_list_var = cdolist_list_var.rest();
            req = cdolist_list_var.first();
        }
        if (secure_translation.NIL != list_utilities.sublisp_boolean(optional)) {
            if (secure_translation.NIL != need_spaceP) {
                streams_high.write_string((SubLObject)secure_translation.$str93$_, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
            }
            streams_high.write_string((SubLObject)secure_translation.$str94$_optional, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
            cdolist_list_var = optional;
            SubLObject opt = (SubLObject)secure_translation.NIL;
            opt = cdolist_list_var.first();
            while (secure_translation.NIL != cdolist_list_var) {
                streams_high.write_string((SubLObject)secure_translation.$str95$__, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
                streams_high.write_string(Symbols.symbol_name(opt), stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
                streams_high.write_string((SubLObject)secure_translation.$str96$__unprovided_trampoline_arg__, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                opt = cdolist_list_var.first();
            }
        }
        streams_high.write_string((SubLObject)secure_translation.$str97$_, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        return required;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 52503L)
    public static SubLObject write_trampoline_invocation_form(final SubLObject secure_method_name, final SubLObject args, SubLObject stream) {
        if (stream == secure_translation.UNPROVIDED) {
            stream = (SubLObject)secure_translation.T;
        }
        PrintLow.format(stream, (SubLObject)secure_translation.$str98$_ret___A, secure_method_name);
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)secure_translation.NIL;
        arg = cdolist_list_var.first();
        while (secure_translation.NIL != cdolist_list_var) {
            streams_high.write_string((SubLObject)secure_translation.$str93$_, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
            streams_high.write_string(Symbols.symbol_name(arg), stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        streams_high.write_string((SubLObject)secure_translation.$str99$__, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        return secure_method_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/secure-translation.lisp", position = 52802L)
    public static SubLObject write_trampoline_invocation_form_for_optional_args(final SubLObject secure_method_name, final SubLObject required, final SubLObject optional, SubLObject stream) {
        if (stream == secure_translation.UNPROVIDED) {
            stream = (SubLObject)secure_translation.T;
        }
        streams_high.write_string((SubLObject)secure_translation.$str100$_pcond, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        SubLObject args = conses_high.copy_list(required);
        SubLObject cdolist_list_var = optional;
        SubLObject opt = (SubLObject)secure_translation.NIL;
        opt = cdolist_list_var.first();
        while (secure_translation.NIL != cdolist_list_var) {
            streams_high.terpri(stream);
            string_utilities.indent(stream, (SubLObject)secure_translation.FOUR_INTEGER);
            streams_high.write_string((SubLObject)secure_translation.$str101$__eq__unprovided_trampoline_arg__, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
            streams_high.write_string(Symbols.symbol_name(opt), stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
            streams_high.write_string((SubLObject)secure_translation.$str102$__, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
            write_trampoline_invocation_form(secure_method_name, args, stream);
            streams_high.write_string((SubLObject)secure_translation.$str97$_, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
            args = ConsesLow.append(args, (SubLObject)ConsesLow.list(opt));
            cdolist_list_var = cdolist_list_var.rest();
            opt = cdolist_list_var.first();
        }
        streams_high.terpri(stream);
        string_utilities.indent(stream, (SubLObject)secure_translation.FOUR_INTEGER);
        streams_high.write_string((SubLObject)secure_translation.$str103$_t_, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        write_trampoline_invocation_form(secure_method_name, args, stream);
        streams_high.write_string((SubLObject)secure_translation.$str97$_, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        streams_high.write_string((SubLObject)secure_translation.$str97$_, stream, (SubLObject)secure_translation.UNPROVIDED, (SubLObject)secure_translation.UNPROVIDED);
        return secure_method_name;
    }
    
    public static SubLObject declare_secure_translation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "translator_security_level_p", "TRANSLATOR-SECURITY-LEVEL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_print_function_trampoline", "SECURE-ID-DATABASE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_p", "SECURE-ID-DATABASE-P", 1, 0, false);
        new $secure_id_database_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_security_level", "SID-DB-SECURITY-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_id_module_table", "SID-DB-ID-MODULE-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_module_id_table", "SID-DB-MODULE-ID-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_id_method_table", "SID-DB-ID-METHOD-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_method_id_table", "SID-DB-METHOD-ID-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_id_global_table", "SID-DB-ID-GLOBAL-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_global_id_table", "SID-DB-GLOBAL-ID-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions", "SID-DB-SYMBOL-EXCEPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_id_symbol_table", "SID-DB-ID-SYMBOL-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_id_table", "SID-DB-SYMBOL-ID-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "_csetf_sid_db_security_level", "_CSETF-SID-DB-SECURITY-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "_csetf_sid_db_id_module_table", "_CSETF-SID-DB-ID-MODULE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "_csetf_sid_db_module_id_table", "_CSETF-SID-DB-MODULE-ID-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "_csetf_sid_db_id_method_table", "_CSETF-SID-DB-ID-METHOD-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "_csetf_sid_db_method_id_table", "_CSETF-SID-DB-METHOD-ID-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "_csetf_sid_db_id_global_table", "_CSETF-SID-DB-ID-GLOBAL-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "_csetf_sid_db_global_id_table", "_CSETF-SID-DB-GLOBAL-ID-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "_csetf_sid_db_symbol_exceptions", "_CSETF-SID-DB-SYMBOL-EXCEPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "_csetf_sid_db_id_symbol_table", "_CSETF-SID-DB-ID-SYMBOL-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "_csetf_sid_db_symbol_id_table", "_CSETF-SID-DB-SYMBOL-ID-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "make_secure_id_database", "MAKE-SECURE-ID-DATABASE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "visit_defstruct_secure_id_database", "VISIT-DEFSTRUCT-SECURE-ID-DATABASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "visit_defstruct_object_secure_id_database_method", "VISIT-DEFSTRUCT-OBJECT-SECURE-ID-DATABASE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "new_secure_id_database", "NEW-SECURE-ID-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "set_secure_id_database_slots", "SET-SECURE-ID-DATABASE-SLOTS", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "destroy_secure_id_database", "DESTROY-SECURE-ID-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_security_level", "SECURE-ID-DATABASE-SECURITY-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_lookup_module", "SECURE-ID-DATABASE-LOOKUP-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_lookup_method", "SECURE-ID-DATABASE-LOOKUP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_lookup_global", "SECURE-ID-DATABASE-LOOKUP-GLOBAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_excepted_symbolP", "SECURE-ID-DATABASE-EXCEPTED-SYMBOL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_lookup_symbol", "SECURE-ID-DATABASE-LOOKUP-SYMBOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_symbol_name", "SECURE-ID-DATABASE-SYMBOL-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_name_sensitive_symbolP", "SECURE-ID-DATABASE-NAME-SENSITIVE-SYMBOL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sublisp_symbol_p", "SUBLISP-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "save_secure_id_database_to_file", "SAVE-SECURE-ID-DATABASE-TO-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "save_secure_id_database", "SAVE-SECURE-ID-DATABASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "construct_recipe_for_secure_id_database", "CONSTRUCT-RECIPE-FOR-SECURE-ID-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "restore_secure_id_database_from_file", "RESTORE-SECURE-ID-DATABASE-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "restore_secure_id_database", "RESTORE-SECURE-ID-DATABASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "load_secure_id_database_recipe", "LOAD-SECURE-ID-DATABASE-RECIPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_recipe_get", "SID-DB-RECIPE-GET", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "interpret_secure_id_database_recipe_by_version", "INTERPRET-SECURE-ID-DATABASE-RECIPE-BY-VERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "interpret_secure_id_database_recipe_v1p0", "INTERPRET-SECURE-ID-DATABASE-RECIPE-V1P0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "fetch_valid_secure_id_database_table", "FETCH-VALID-SECURE-ID-DATABASE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_known_moduleP", "SECURE-ID-DATABASE-KNOWN-MODULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_known_methodP", "SECURE-ID-DATABASE-KNOWN-METHOD?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_known_globalP", "SECURE-ID-DATABASE-KNOWN-GLOBAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_module_id", "SECURE-ID-DATABASE-MODULE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_method_id", "SECURE-ID-DATABASE-METHOD-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_global_id", "SECURE-ID-DATABASE-GLOBAL-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_symbol_id", "SECURE-ID-DATABASE-SYMBOL-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_populate_symbol_exceptions", "SECURE-ID-DATABASE-POPULATE-SYMBOL-EXCEPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "secure_id_database_note_symbol_exception", "SECURE-ID-DATABASE-NOTE-SYMBOL-EXCEPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "current_system_translation_secure_module_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-MODULE-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "current_system_translation_secure_method_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-METHOD-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "current_system_translation_secure_global_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-GLOBAL-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "current_system_translation_secure_symbol_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-SYMBOL-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions_add_all", "SID-DB-SYMBOL-EXCEPTIONS-ADD-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions_add_for_api", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-API", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions_add_symbols", "SID-DB-SYMBOL-EXCEPTIONS-ADD-SYMBOLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions_add_for_external", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-EXTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions_add_for_system_parameters", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-SYSTEM-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions_add_for_html_handlers", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-HTML-HANDLERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions_add_for_kb_function_symbols", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-KB-FUNCTION-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions_add_for_standard_libraries", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-STANDARD-LIBRARIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions_add_for_misc_symbols", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-MISC-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "sid_db_symbol_exceptions_register_and_retranslate_misc", "SID-DB-SYMBOL-EXCEPTIONS-REGISTER-AND-RETRANSLATE-MISC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "gather_all_subl_functions_mentioned_in_file", "GATHER-ALL-SUBL-FUNCTIONS-MENTIONED-IN-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "gather_all_subl_functions_mentioned_in_files", "GATHER-ALL-SUBL-FUNCTIONS-MENTIONED-IN-FILES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "all_securely_translated_methods_requiring_trampolines", "ALL-SECURELY-TRANSLATED-METHODS-REQUIRING-TRAMPOLINES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "write_trampolines_for_securely_translated_methods", "WRITE-TRAMPOLINES-FOR-SECURELY-TRANSLATED-METHODS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "write_trampolines_get_method_arglist_names_only", "WRITE-TRAMPOLINES-GET-METHOD-ARGLIST-NAMES-ONLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "write_trampoline_file_header_for_securely_translated_methods", "WRITE-TRAMPOLINE-FILE-HEADER-FOR-SECURELY-TRANSLATED-METHODS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "write_trampoline_for_securely_translated_method", "WRITE-TRAMPOLINE-FOR-SECURELY-TRANSLATED-METHOD", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "write_trampoline_for_securely_translated_macro", "WRITE-TRAMPOLINE-FOR-SECURELY-TRANSLATED-MACRO", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "write_trampoline_argument_list", "WRITE-TRAMPOLINE-ARGUMENT-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "write_trampoline_invocation_form", "WRITE-TRAMPOLINE-INVOCATION-FORM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.secure_translation", "write_trampoline_invocation_form_for_optional_args", "WRITE-TRAMPOLINE-INVOCATION-FORM-FOR-OPTIONAL-ARGS", 3, 1, false);
        return (SubLObject)secure_translation.NIL;
    }
    
    public static SubLObject init_secure_translation_file() {
        secure_translation.$translator_security_levels$ = SubLFiles.deflexical("*TRANSLATOR-SECURITY-LEVELS*", (SubLObject)secure_translation.$list0);
        secure_translation.$dtp_secure_id_database$ = SubLFiles.defconstant("*DTP-SECURE-ID-DATABASE*", (SubLObject)secure_translation.$sym1$SECURE_ID_DATABASE);
        secure_translation.$secure_id_database_type_marker$ = SubLFiles.deflexical("*SECURE-ID-DATABASE-TYPE-MARKER*", (SubLObject)secure_translation.$str58$c3edef08_eef1_11dd_9624_00219b50e);
        secure_translation.$standard_library_symbols_not_to_obfuscate$ = SubLFiles.deflexical("*STANDARD-LIBRARY-SYMBOLS-NOT-TO-OBFUSCATE*", (SubLObject)secure_translation.$list77);
        secure_translation.$misc_symbols_not_to_obfuscate$ = SubLFiles.deflexical("*MISC-SYMBOLS-NOT-TO-OBFUSCATE*", secure_translation.$list78);
        return (SubLObject)secure_translation.NIL;
    }
    
    public static SubLObject setup_secure_translation_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), secure_translation.$dtp_secure_id_database$.getGlobalValue(), Symbols.symbol_function((SubLObject)secure_translation.$sym8$SECURE_ID_DATABASE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)secure_translation.$list9);
        Structures.def_csetf((SubLObject)secure_translation.$sym10$SID_DB_SECURITY_LEVEL, (SubLObject)secure_translation.$sym11$_CSETF_SID_DB_SECURITY_LEVEL);
        Structures.def_csetf((SubLObject)secure_translation.$sym12$SID_DB_ID_MODULE_TABLE, (SubLObject)secure_translation.$sym13$_CSETF_SID_DB_ID_MODULE_TABLE);
        Structures.def_csetf((SubLObject)secure_translation.$sym14$SID_DB_MODULE_ID_TABLE, (SubLObject)secure_translation.$sym15$_CSETF_SID_DB_MODULE_ID_TABLE);
        Structures.def_csetf((SubLObject)secure_translation.$sym16$SID_DB_ID_METHOD_TABLE, (SubLObject)secure_translation.$sym17$_CSETF_SID_DB_ID_METHOD_TABLE);
        Structures.def_csetf((SubLObject)secure_translation.$sym18$SID_DB_METHOD_ID_TABLE, (SubLObject)secure_translation.$sym19$_CSETF_SID_DB_METHOD_ID_TABLE);
        Structures.def_csetf((SubLObject)secure_translation.$sym20$SID_DB_ID_GLOBAL_TABLE, (SubLObject)secure_translation.$sym21$_CSETF_SID_DB_ID_GLOBAL_TABLE);
        Structures.def_csetf((SubLObject)secure_translation.$sym22$SID_DB_GLOBAL_ID_TABLE, (SubLObject)secure_translation.$sym23$_CSETF_SID_DB_GLOBAL_ID_TABLE);
        Structures.def_csetf((SubLObject)secure_translation.$sym24$SID_DB_SYMBOL_EXCEPTIONS, (SubLObject)secure_translation.$sym25$_CSETF_SID_DB_SYMBOL_EXCEPTIONS);
        Structures.def_csetf((SubLObject)secure_translation.$sym26$SID_DB_ID_SYMBOL_TABLE, (SubLObject)secure_translation.$sym27$_CSETF_SID_DB_ID_SYMBOL_TABLE);
        Structures.def_csetf((SubLObject)secure_translation.$sym28$SID_DB_SYMBOL_ID_TABLE, (SubLObject)secure_translation.$sym29$_CSETF_SID_DB_SYMBOL_ID_TABLE);
        Equality.identity((SubLObject)secure_translation.$sym1$SECURE_ID_DATABASE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), secure_translation.$dtp_secure_id_database$.getGlobalValue(), Symbols.symbol_function((SubLObject)secure_translation.$sym45$VISIT_DEFSTRUCT_OBJECT_SECURE_ID_DATABASE_METHOD));
        return (SubLObject)secure_translation.NIL;
    }
    
    private static SubLObject _constant_78_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("*CACHE-INFERENCE-RESULTS*"), SubLObjectFactory.makeSymbol("*HL-FAILURE-BACKCHAINING*"), SubLObjectFactory.makeSymbol("*ENABLE-REWRITE-OF-PROPAGATION?*"), SubLObjectFactory.makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*"), SubLObjectFactory.makeSymbol("KB-STATISTICS"), SubLObjectFactory.makeSymbol("SERVER-SUMMARY"), SubLObjectFactory.makeSymbol("HALT-CYC-IMAGE"), SubLObjectFactory.makeSymbol("ALL"), SubLObjectFactory.makeSymbol("NONE"), SubLObjectFactory.makeSymbol("*INIT-FILE-LOADED?*"), SubLObjectFactory.makeSymbol("*THESAURUS-FILENAME*"), SubLObjectFactory.makeSymbol("*THESAURUS-FILENAME-EXTENSION*"), SubLObjectFactory.makeSymbol("*THESAURUS-SUBDIRECTORIES*"), SubLObjectFactory.makeSymbol("INITIALIZE-AGENDA"), SubLObjectFactory.makeSymbol("INITIALIZE-TRANSCRIPT-HANDLING"), SubLObjectFactory.makeSymbol("LOAD-SYSTEM-PARAMETERS"), SubLObjectFactory.makeSymbol("LOAD-THESAURUS-INIT-FILE"), SubLObjectFactory.makeSymbol("PROBE-FILE"), SubLObjectFactory.makeSymbol("SYSTEM-CODE-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("SYSTEM-KB-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("LOAD-API"), SubLObjectFactory.makeSymbol("CORE-KB-FINALIZATION"), SubLObjectFactory.makeSymbol("CORE-KB-FINISH-BOOTSTRAPPING"), SubLObjectFactory.makeSymbol("CORE-KB-FINISH-DEFINITIONS"), SubLObjectFactory.makeSymbol("CORE-KB-INITIALIZATION"), SubLObjectFactory.makeSymbol("CORE-KB-START-BOOTSTRAPPING"), SubLObjectFactory.makeSymbol("CORE-KB-START-DEFINITIONS"), SubLObjectFactory.makeSymbol("CYC-FUNCTION-TO-ARG"), SubLObjectFactory.makeSymbol("FI-ASSERT-INT"), SubLObjectFactory.makeSymbol("HL-EXTERNAL-ID-STRING-P"), SubLObjectFactory.makeSymbol("HL-FIND-OR-CREATE-NART"), SubLObjectFactory.makeSymbol("LOW-ASSERT-LITERAL"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeSymbol("DUMP-STANDARD-KB"), SubLObjectFactory.makeSymbol("DUMP-KB"), SubLObjectFactory.makeSymbol("LOAD-KB"), SubLObjectFactory.makeSymbol("*STANDARD-INPUT*"), SubLObjectFactory.makeSymbol("READ-IGNORING-ERRORS"), SubLObjectFactory.makeSymbol("*INFERENCE-TRACE-PORT*"), SubLObjectFactory.makeSymbol("API-PORT"), SubLObjectFactory.makeSymbol("API-SERVER-TOP-LEVEL"), SubLObjectFactory.makeSymbol("CFASL-PORT"), SubLObjectFactory.makeSymbol("CFASL-SERVER-TOP-LEVEL"), SubLObjectFactory.makeSymbol("CYC-HTML-FEATURE"), SubLObjectFactory.makeSymbol("CYC-THESAURUS-FEATURE"), SubLObjectFactory.makeSymbol("ENABLE-TCP-SERVER"), SubLObjectFactory.makeSymbol("FINISH-OUTPUT"), SubLObjectFactory.makeSymbol("HTML-PORT"), SubLObjectFactory.makeSymbol("HTTP-PORT"), SubLObjectFactory.makeSymbol("HTML-SERVER-TOP-LEVEL"), SubLObjectFactory.makeSymbol("HTTP-SERVER-TOP-LEVEL"), SubLObjectFactory.makeSymbol("ROBUST-ENABLE-TCP-SERVER"), SubLObjectFactory.makeSymbol("START-AGENDA"), SubLObjectFactory.makeSymbol("THESAURUS-MANAGER-ACCESS-PROTOCOL-SERVER-TOP-LEVEL"), SubLObjectFactory.makeSymbol("TMAP-PORT"), SubLObjectFactory.makeSymbol("HOSTNAME"), SubLObjectFactory.makeSymbol("*EVAL-IN-API?*"), SubLObjectFactory.makeSymbol("*SILENT-PROGRESS?*"), SubLObjectFactory.makeSymbol("CYC-HOME-FILENAME"), SubLObjectFactory.makeSymbol("HALT-AGENDA"), SubLObjectFactory.makeSymbol("LOAD-INFERENCE-TESTS"), SubLObjectFactory.makeSymbol("SET-COMMUNICATION-MODE"), SubLObjectFactory.makeSymbol("LOAD-INFERENCE-TESTS"), SubLObjectFactory.makeSymbol("DEF-INFERENCE-TEST"), SubLObjectFactory.makeSymbol("DEFINE-INFERENCE-TEST"), SubLObjectFactory.makeSymbol("DEFINE-SUBTEST"), SubLObjectFactory.makeSymbol("CYC-HOME-FILENAME"), SubLObjectFactory.makeSymbol("LOAD-ALL-CYC-TESTS"), SubLObjectFactory.makeSymbol("RUN-ALL-CYC-TESTS"), SubLObjectFactory.makeSymbol("RUN-CYC-TESTS"), SubLObjectFactory.makeSymbol("RUN-ALL-INFERENCE-UNIT-TESTS"), SubLObjectFactory.makeSymbol("RUN-ALL-REMOVAL-MODULE-TESTS"), SubLObjectFactory.makeSymbol("RUN-ALL-EVALUATABLE-RELATION-TESTS"), SubLObjectFactory.makeSymbol("*SECONDS-IN-A-NON-LEAP-YEAR*"), SubLObjectFactory.makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST"), SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK"), SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK"), SubLObjectFactory.makeSymbol("EQUALS-EL?"), SubLObjectFactory.makeSymbol("HTML-ESCAPED-TO-UNICODE-VECTOR"), SubLObjectFactory.makeSymbol("LENGTH="), SubLObjectFactory.makeSymbol("LENGTH>="), SubLObjectFactory.makeSymbol("LENGTHS="), SubLObjectFactory.makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS"), SubLObjectFactory.makeSymbol("NOT-EQ"), SubLObjectFactory.makeSymbol("TREE-MATCHES-PATTERN"), SubLObjectFactory.makeSymbol("UNICODE-VECTOR-TO-DISPLAY"), SubLObjectFactory.makeSymbol("DECLARE-CYC-TEST-FILE"), SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST"), SubLObjectFactory.makeSymbol("DEFINE-INFERENCE-UNIT-TEST"), SubLObjectFactory.makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST"), SubLObjectFactory.makeSymbol("LOAD-ALL-KB-CONTENT-POST-BUILD-TESTS"), SubLObjectFactory.makeSymbol("PWHEN-FEATURE"), SubLObjectFactory.makeSymbol("*TRANSFORMATION-DEPTH-COMPUTATION*"), SubLObjectFactory.makeSymbol("GENL-CARDINALITY"), SubLObjectFactory.makeSymbol("PROBLEM-MIN-TRANSFORMATION-DEPTH"), SubLObjectFactory.makeSymbol("PROBLEM-MIN-TRANSFORMATION-DEPTH"), SubLObjectFactory.makeSymbol("PROBLEM-PROOF-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-SOLE-CLAUSE"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT"), SubLObjectFactory.makeSymbol("QUERY-ABORT"), SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM"), SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM"), SubLObjectFactory.makeSymbol("SPEC-CARDINALITY"), SubLObjectFactory.makeSymbol("STRATEGICALLY-PENDING-PROBLEM-P"), SubLObjectFactory.makeSymbol("STRATEGICALLY-POSSIBLE-PROBLEM-P"), SubLObjectFactory.makeSymbol("STRATEGICALLY-POSSIBLE-PROBLEM-P"), SubLObjectFactory.makeSymbol("TACTICALLY-PENDING-PROBLEM-P"), SubLObjectFactory.makeSymbol("TACTICALLY-PENDING-PROBLEM-P"), SubLObjectFactory.makeSymbol("TACTICALLY-POSSIBLE-PROBLEM-P"), SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT"), SubLObjectFactory.makeSymbol("CONSTANT-SUID"), SubLObjectFactory.makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), SubLObjectFactory.makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), SubLObjectFactory.makeSymbol("*ADDITIONAL-FORT-TYPING-COLLECTIONS*"), SubLObjectFactory.makeSymbol("*ADMIT-NART-MTS-IN-MT-GAFS-IN-MT-MT?*"), SubLObjectFactory.makeSymbol("*ANECT-MT*"), SubLObjectFactory.makeSymbol("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*"), SubLObjectFactory.makeSymbol("*AT-ADMIT-CONSISTENT-NAUTS?*"), SubLObjectFactory.makeSymbol("*AT-APPLY-NECESSARY-DEFNS?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-GENLS?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-ISA?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-GENL-INVERSES?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-GENL-PREDS?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-GENL?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-ISA?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-GENLS-DISJOINT?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-ISA-DISJOINT?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-MDW?*"), SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-SDC?*"), SubLObjectFactory.makeSymbol("*AT-POSSIBLY-CHECK-DEFINING-MTS?*"), SubLObjectFactory.makeSymbol("*AT-SOME-ARG-ISA-REQUIRED?*"), SubLObjectFactory.makeSymbol("*AT-TRACE-LEVEL*"), SubLObjectFactory.makeSymbol("*BREAK-ON-FAILURE*"), SubLObjectFactory.makeSymbol("*CACHE-INFERENCE-RESULTS*"), SubLObjectFactory.makeSymbol("*CACHED-GENL-PREDICATES*"), SubLObjectFactory.makeSymbol("*CACHED-GENL-PREDICATES-SET*"), SubLObjectFactory.makeSymbol("*CACHED-GENLS*"), SubLObjectFactory.makeSymbol("*CACHED-GENLS-SET*"), SubLObjectFactory.makeSymbol("*CACHED-ISAS*"), SubLObjectFactory.makeSymbol("*CACHED-ISAS-SET*"), SubLObjectFactory.makeSymbol("*CANONICALIZE-ALL-SENTENCE-ARGS?*"), SubLObjectFactory.makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*"), SubLObjectFactory.makeSymbol("*CHECK-WFF-COHERENCE?*"), SubLObjectFactory.makeSymbol("*CHEMISTRY-LEXICAL-MT*"), SubLObjectFactory.makeSymbol("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*"), SubLObjectFactory.makeSymbol("*CONTINUE-CERROR?*"), SubLObjectFactory.makeSymbol("*CONTROL-1*"), SubLObjectFactory.makeSymbol("*CONTROL-2*"), SubLObjectFactory.makeSymbol("*CONTROL-3*"), SubLObjectFactory.makeSymbol("*CONTROL-4*"), SubLObjectFactory.makeSymbol("*CONTROL-5*"), SubLObjectFactory.makeSymbol("*CONTROL-6*"), SubLObjectFactory.makeSymbol("*CONTROL?*"), SubLObjectFactory.makeSymbol("*CORE-MT-FLOOR*"), SubLObjectFactory.makeSymbol("*CURRENT-TEST*"), SubLObjectFactory.makeSymbol("*DEBUG-CONTINUE*"), SubLObjectFactory.makeSymbol("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*"), SubLObjectFactory.makeSymbol("*DEFN-TRACE-LEVEL*"), SubLObjectFactory.makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), SubLObjectFactory.makeSymbol("*EL-SUPPORTS-CONTRACTIONS?*"), SubLObjectFactory.makeSymbol("*EL-SUPPORTS-DOT-SYNTAX?*"), SubLObjectFactory.makeSymbol("*ENCAPSULATE-INTENSIONAL-FORMULA?*"), SubLObjectFactory.makeSymbol("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*"), SubLObjectFactory.makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-ASYMMETRIC?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-DISJOINT-WITH?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-GENLS?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-IRREFLEXIVE?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-NEGATION-INVERSE?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-NEGATION-PREDICATES?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-REFLEXIVE?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-RELATION-TYPE?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-RULE-MACRO?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-SYMMETRIC?*"), SubLObjectFactory.makeSymbol("*EXPRESS-AS-TRANSITIVE?*"), SubLObjectFactory.makeSymbol("*FI-ERROR*"), SubLObjectFactory.makeSymbol("*FI-WARNING*"), SubLObjectFactory.makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*"), SubLObjectFactory.makeSymbol("*GT-MAX-NODES-DIRECTION*"), SubLObjectFactory.makeSymbol("*HL-FAILURE-BACKCHAINING*"), SubLObjectFactory.makeSymbol("*IMPLICIT-FORT-TYPING-COLLECTIONS*"), SubLObjectFactory.makeSymbol("*IMPLICITIFY-UNIVERSALS?*"), SubLObjectFactory.makeSymbol("*INCLUDE-AT-CONSTRAINT-GAF?*"), SubLObjectFactory.makeSymbol("*INDEX-CONVERT-COMPLEX-THRESHOLD*"), SubLObjectFactory.makeSymbol("*INDEX-CONVERT-SIMPLE-THRESHOLD*"), SubLObjectFactory.makeSymbol("*INDEX-OVERLAP-ENABLED?*"), SubLObjectFactory.makeSymbol("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*"), SubLObjectFactory.makeSymbol("*IT-BACKCHAIN*"), SubLObjectFactory.makeSymbol("*IT-DEPTH*"), SubLObjectFactory.makeSymbol("*IT-NUMBER*"), SubLObjectFactory.makeSymbol("*IT-TIME*"), SubLObjectFactory.makeSymbol("*IT-VERBOSE*"), SubLObjectFactory.makeSymbol("*KNOWN-ANTECEDENT-RULE-ENABLED?*"), SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*"), SubLObjectFactory.makeSymbol("*LOOKUP-OVERLAP-WATERMARK*"), SubLObjectFactory.makeSymbol("*MT*"), SubLObjectFactory.makeSymbol("*MT-MT*"), SubLObjectFactory.makeSymbol("*MUST-ENFORCE-SEMANTICS?*"), SubLObjectFactory.makeSymbol("*NL-TRIE-ROTATION-INDEX*"), SubLObjectFactory.makeSymbol("*NOTING-AT-VIOLATIONS?*"), SubLObjectFactory.makeSymbol("*PARAPHRASE-MODE*"), SubLObjectFactory.makeSymbol("*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*"), SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*"), SubLObjectFactory.makeSymbol("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*"), SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*"), SubLObjectFactory.makeSymbol("*PPH-LINK-ARG0?*"), SubLObjectFactory.makeSymbol("*PPH-QUANTIFY-VARS?*"), SubLObjectFactory.makeSymbol("*PPH-USE-BULLETED-LISTS?*"), SubLObjectFactory.makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), SubLObjectFactory.makeSymbol("*PPH-USE-WHOM?*"), SubLObjectFactory.makeSymbol("*READ-REQUIRE-CONSTANT-EXISTS*"), SubLObjectFactory.makeSymbol("*RESIDUAL-TRANSFORMATION-LINKS-ENABLED?*"), SubLObjectFactory.makeSymbol("*REWRITE-MODULES*"), SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-ACTIVE?*"), SubLObjectFactory.makeSymbol("*SDC-COMMON-SPEC-EXCEPTION?*"), SubLObjectFactory.makeSymbol("*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*"), SubLObjectFactory.makeSymbol("*SIMPLIFY-SENTENCE?*"), SubLObjectFactory.makeSymbol("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*"), SubLObjectFactory.makeSymbol("*SKOLEM-AXIOM-TABLE*"), SubLObjectFactory.makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), SubLObjectFactory.makeSymbol("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*"), SubLObjectFactory.makeSymbol("*TEST-DIRECTION*"), SubLObjectFactory.makeSymbol("*TEST-STATUS*"), SubLObjectFactory.makeSymbol("*THE-CYCLIST*"), SubLObjectFactory.makeSymbol("*KE-PURPOSE*"), SubLObjectFactory.makeSymbol("*CB-CONSTANT-HISTORY*"), SubLObjectFactory.makeSymbol("*CB-NAT-HISTORY*"), SubLObjectFactory.makeSymbol("*CB-SENTENCE-HISTORY*"), SubLObjectFactory.makeSymbol("*CB-ASSERTION-HISTORY*"), SubLObjectFactory.makeSymbol("*PPH-REPLACE-BULLETED-LIST-TAGS?*"), SubLObjectFactory.makeSymbol("*PARAPHRASE-PRECISION*"), SubLObjectFactory.makeSymbol("*PPH-TERSE-MT-SCOPE?*"), SubLObjectFactory.makeSymbol("*PPH-MAXIMIZE-LINKS?*"), SubLObjectFactory.makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), SubLObjectFactory.makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), SubLObjectFactory.makeSymbol("*PPH-ADDRESSEE*"), SubLObjectFactory.makeSymbol("*PPH-SPEAKER*"), SubLObjectFactory.makeSymbol("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*"), SubLObjectFactory.makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*"), SubLObjectFactory.makeSymbol("*USE-TRANSCRIPT?*"), SubLObjectFactory.makeSymbol("*VALIDATE-EXPANSIONS?*"), SubLObjectFactory.makeSymbol("*WFF-VIOLATION-DATA-TERSE?*"), SubLObjectFactory.makeSymbol("*WITHIN-ASK*"), SubLObjectFactory.makeSymbol("1+"), SubLObjectFactory.makeSymbol("ABORT-CURRENT-CONTROLLING-INFERENCE"), SubLObjectFactory.makeSymbol("ALL-CONSTANTS"), SubLObjectFactory.makeSymbol("ALL-CONTIGUOUS-AFTER"), SubLObjectFactory.makeSymbol("ALL-CONTIGUOUS-AFTER-INVERSE"), SubLObjectFactory.makeSymbol("ALL-COTEMPORAL"), SubLObjectFactory.makeSymbol("ALL-DENOTS-OF-STRING"), SubLObjectFactory.makeSymbol("ALL-ENDS-AFTER-ENDING-OF"), SubLObjectFactory.makeSymbol("ALL-ENDS-AFTER-ENDING-OF-INVERSE"), SubLObjectFactory.makeSymbol("ALL-ENDS-AFTER-STARTING-OF"), SubLObjectFactory.makeSymbol("ALL-ENDS-AFTER-STARTING-OF-INVERSE"), SubLObjectFactory.makeSymbol("ALL-ENDS-DURING"), SubLObjectFactory.makeSymbol("ALL-ENDS-DURING-INVERSE"), SubLObjectFactory.makeSymbol("ALL-LEXICON-STRING-PREDICATES"), SubLObjectFactory.makeSymbol("ALL-NEGATION-INVERSES"), SubLObjectFactory.makeSymbol("ALL-NEGATION-PREDICATES"), SubLObjectFactory.makeSymbol("ALL-NEGATION-PREDS"), SubLObjectFactory.makeSymbol("ALL-OVERLAPS-START"), SubLObjectFactory.makeSymbol("ALL-OVERLAPS-START-INVERSE"), SubLObjectFactory.makeSymbol("ALL-SPEC-PREDS"), SubLObjectFactory.makeSymbol("ALL-STARTS-AFTER-ENDING-OF"), SubLObjectFactory.makeSymbol("ALL-STARTS-AFTER-ENDING-OF-INVERSE"), SubLObjectFactory.makeSymbol("ALL-STARTS-AFTER-STARTING-OF"), SubLObjectFactory.makeSymbol("ALL-STARTS-AFTER-STARTING-OF-INVERSE"), SubLObjectFactory.makeSymbol("ALL-STARTS-DURING"), SubLObjectFactory.makeSymbol("ALL-STARTS-DURING-INVERSE"), SubLObjectFactory.makeSymbol("ALL-TEMPORAL-BOUNDS-CONTAIN"), SubLObjectFactory.makeSymbol("ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE"), SubLObjectFactory.makeSymbol("ALL-TEMPORAL-BOUNDS-IDENTICAL"), SubLObjectFactory.makeSymbol("ALL-TEMPORAL-BOUNDS-INTERSECT"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-COORIGINATING"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-COTERMINAL"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-FINISHED-BY"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-FINISHED-BY-INVERSE"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-STARTED-BY"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-STARTED-BY-INVERSE"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-SUBSUMES"), SubLObjectFactory.makeSymbol("ALL-TEMPORALLY-SUBSUMES-INVERSE"), SubLObjectFactory.makeSymbol("ANY-SDC-WRT?"), SubLObjectFactory.makeSymbol("ASENT-SENSE-AND-MT-TO-PROBLEM-QUERY"), SubLObjectFactory.makeSymbol("ASSERT-QUERY-TEST"), SubLObjectFactory.makeSymbol("ASSERT-RETURN-UNCANON"), SubLObjectFactory.makeSymbol("ASSERTED-SECOND"), SubLObjectFactory.makeSymbol("ASSERTED-WHY"), SubLObjectFactory.makeSymbol("ASSERTION-ARGUMENTS"), SubLObjectFactory.makeSymbol("ASSERTION-CONS"), SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA"), SubLObjectFactory.makeSymbol("ASSERTION-FIND-IF"), SubLObjectFactory.makeSymbol("ASSERTION-GATHER"), SubLObjectFactory.makeSymbol("ASSERTION-HL-FORMULA"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG1"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG2"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG3"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARG4"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-ARGS"), SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE"), SubLObjectFactory.makeSymbol("B-TEST-FORM"), SubLObjectFactory.makeSymbol("BELIEF-P"), SubLObjectFactory.makeSymbol("BINDING-VERIFY"), SubLObjectFactory.makeSymbol("BULL"), SubLObjectFactory.makeSymbol("CANON-ASSERT-EQUAL?"), SubLObjectFactory.makeSymbol("CANON-ASSERT-ISOMORPHIC?"), SubLObjectFactory.makeSymbol("CANON-EQUAL-HL-NAMES?"), SubLObjectFactory.makeSymbol("CANON-EQUAL?"), SubLObjectFactory.makeSymbol("CANON-FORMS-EQUAL?"), SubLObjectFactory.makeSymbol("CANON-QUERY-EQUAL?"), SubLObjectFactory.makeSymbol("CANONICALIZE-AND-RETURN-SKOLEM-VARS"), SubLObjectFactory.makeSymbol("CANONICALIZE-ASK"), SubLObjectFactory.makeSymbol("CANONICALIZE-CYCL"), SubLObjectFactory.makeSymbol("CANONICALIZE-CYCL-SENTENCE"), SubLObjectFactory.makeSymbol("CANONICALIZE-DEFAULT-EL-VARS"), SubLObjectFactory.makeSymbol("CANONICALIZE-PROBLEM-QUERY"), SubLObjectFactory.makeSymbol("CANONICALIZE-QUERY"), SubLObjectFactory.makeSymbol("CANONICALIZE-QUERY-SENTENCE"), SubLObjectFactory.makeSymbol("CANONICALIZE-WF-CYCL"), SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), SubLObjectFactory.makeSymbol("CB-GUESS-FORT"), SubLObjectFactory.makeSymbol("CDOHASH"), SubLObjectFactory.makeSymbol("CHECK-DENOT"), SubLObjectFactory.makeSymbol("CLEAR-SBHL-CACHES"), SubLObjectFactory.makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), SubLObjectFactory.makeSymbol("COLLECTION-P"), SubLObjectFactory.makeSymbol("COMPLEX-INDEX-P"), SubLObjectFactory.makeSymbol("COMPLEX-INDEXED-TERM-P"), SubLObjectFactory.makeSymbol("CONTIGUOUS-AFTER?"), SubLObjectFactory.makeSymbol("CONTINUE-INFERENCE"), SubLObjectFactory.makeSymbol("COPY-FORMULA"), SubLObjectFactory.makeSymbol("COTEMPORAL?"), SubLObjectFactory.makeSymbol("CPUSHNEW"), SubLObjectFactory.makeSymbol("CSOME"), SubLObjectFactory.makeSymbol("CURRENT-CONTROLLING-INFERENCE"), SubLObjectFactory.makeSymbol("CURRENT-MT-RELEVANCE-MT"), SubLObjectFactory.makeSymbol("CURRENT-REWRITE-MT"), SubLObjectFactory.makeSymbol("CURRENTLY-ACTIVE-PROBLEM"), SubLObjectFactory.makeSymbol("CURRENTLY-ACTIVE-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("CVS-ID"), SubLObjectFactory.makeSymbol("CYC-EVALUATE"), SubLObjectFactory.makeSymbol("CYC-FIND-OR-CREATE-NART"), SubLObjectFactory.makeSymbol("CYCL-PROBLEM-DECODE"), SubLObjectFactory.makeSymbol("CYCL-PROBLEM-STORE-DECODE"), SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P"), SubLObjectFactory.makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), SubLObjectFactory.makeSymbol("CYCL-TERM-P"), SubLObjectFactory.makeSymbol("DATE-KB-LOADED-P"), SubLObjectFactory.makeSymbol("DECLARE-CYC-TEST-FILE"), SubLObjectFactory.makeSymbol("DEDUCTION-SUPPORTS"), SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR?"), SubLObjectFactory.makeSymbol("DEFAULT-REFORMULATOR-MODE-PRECEDENCE"), SubLObjectFactory.makeSymbol("DEFGLOBAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST"), SubLObjectFactory.makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST"), SubLObjectFactory.makeSymbol("DEFINE-INFERENCE-UNIT-TEST"), SubLObjectFactory.makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST"), SubLObjectFactory.makeSymbol("DEFINE-REMOVAL-MODULE-TEST"), SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK"), SubLObjectFactory.makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK"), SubLObjectFactory.makeSymbol("DEFINE-SUBTEST"), SubLObjectFactory.makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST"), SubLObjectFactory.makeSymbol("DEFLEXICAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFNS"), SubLObjectFactory.makeSymbol("DEFPARAMETER"), SubLObjectFactory.makeSymbol("DEFPARAMETER-PRIVATE"), SubLObjectFactory.makeSymbol("DELETE-FILE"), SubLObjectFactory.makeSymbol("DENOT-WS-LOOKUP"), SubLObjectFactory.makeSymbol("DENOTS-OF-ABBREVIATION-STRING"), SubLObjectFactory.makeSymbol("DENOTS-OF-COMPLEX-WORD-STRING"), SubLObjectFactory.makeSymbol("DENOTS-OF-NAME-STRING"), SubLObjectFactory.makeSymbol("DENOTS-OF-PARTIAL-STRING"), SubLObjectFactory.makeSymbol("DENOTS-OF-STRING&POS"), SubLObjectFactory.makeSymbol("DENOTS-OF-STRING&PRED"), SubLObjectFactory.makeSymbol("DEPENDENT-NARTS"), SubLObjectFactory.makeSymbol("DEREGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS"), SubLObjectFactory.makeSymbol("DEREGISTER-SKSI-REMOVAL-MODULES-FOR-SKS"), SubLObjectFactory.makeSymbol("DESTROY-ALL-PROBLEM-STORES"), SubLObjectFactory.makeSymbol("DESTROY-INFERENCE"), SubLObjectFactory.makeSymbol("DESTROY-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("DESTROYING-NEW-PPH-PHRASES-WHEN-DONE"), SubLObjectFactory.makeSymbol("DETERMINE-DENOTATION-PREDS"), SubLObjectFactory.makeSymbol("DISJOIN"), SubLObjectFactory.makeSymbol("DNF-AND-MT-TO-HL-QUERY"), SubLObjectFactory.makeSymbol("DO-INDEXED-TERMS"), SubLObjectFactory.makeSymbol("DO-INTERMEDIATE-INDEX"), SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeSymbol("DO-PROBLEM-STORE-LINKS"), SubLObjectFactory.makeSymbol("DO-PROBLEM-STORE-PROBLEMS"), SubLObjectFactory.makeSymbol("DO-PROBLEM-TACTICS"), SubLObjectFactory.makeSymbol("DOUBLETON?"), SubLObjectFactory.makeSymbol("DUPLICATE-NART-TUPLES"), SubLObjectFactory.makeSymbol("EL-BINARY-FORMULA-P"), SubLObjectFactory.makeSymbol("EL-CONTRACTION"), SubLObjectFactory.makeSymbol("EL-EXPAND-ALL"), SubLObjectFactory.makeSymbol("EL-FIND-NART"), SubLObjectFactory.makeSymbol("EL-UNARY-FORMULA-P"), SubLObjectFactory.makeSymbol("EL-VERSION"), SubLObjectFactory.makeSymbol("EL-WFE?"), SubLObjectFactory.makeSymbol("EL-WFF-ASSERTIBLE?"), SubLObjectFactory.makeSymbol("EL-WFT?"), SubLObjectFactory.makeSymbol("EL-ZERO-ARITY-FORMULA-P"), SubLObjectFactory.makeSymbol("ENDS-AFTER-ENDING-OF?"), SubLObjectFactory.makeSymbol("ENDS-AFTER-STARTING-OF?"), SubLObjectFactory.makeSymbol("ENDS-DURING?"), SubLObjectFactory.makeSymbol("ENDS-WITH"), SubLObjectFactory.makeSymbol("EQUAL-WRT-SVM"), SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA"), SubLObjectFactory.makeSymbol("EQUALS-EL?"), SubLObjectFactory.makeSymbol("EXPRESSION-FIND"), SubLObjectFactory.makeSymbol("EXPRESSION-FIND-IF"), SubLObjectFactory.makeSymbol("EXPRESSION-GATHER"), SubLObjectFactory.makeSymbol("EXPRESSION-NSUBLIS"), SubLObjectFactory.makeSymbol("EXPRESSION-NSUBST"), SubLObjectFactory.makeSymbol("EXPRESSION-NTRANSFORM"), SubLObjectFactory.makeSymbol("EXPRESSION-SUBLIS"), SubLObjectFactory.makeSymbol("EXPRESSION-SUBST"), SubLObjectFactory.makeSymbol("EXPRESSION-TRANSFORM"), SubLObjectFactory.makeSymbol("EXTRACT-EL-CLAUSES"), SubLObjectFactory.makeSymbol("FAILING-IT-FORM-IDENTIFIER"), SubLObjectFactory.makeSymbol("FAST-DELETE-DUPLICATES"), SubLObjectFactory.makeSymbol("FAST-SKOLEM-NART?"), SubLObjectFactory.makeSymbol("FI-CREATE-INT"), SubLObjectFactory.makeSymbol("FI-KILL-INT"), SubLObjectFactory.makeSymbol("FI-REASSERT-INT"), SubLObjectFactory.makeSymbol("FI-RENAME-INT"), SubLObjectFactory.makeSymbol("FI-RENAME-VARIABLES-INT"), SubLObjectFactory.makeSymbol("FI-UNASSERT-INT"), SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA"), SubLObjectFactory.makeSymbol("FIMPLIES"), SubLObjectFactory.makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION"), SubLObjectFactory.makeSymbol("FIND-ASSERTION-CYCL"), SubLObjectFactory.makeSymbol("FIND-ASSERTIONS-CYCL"), SubLObjectFactory.makeSymbol("FIND-ASSERTIONS-VIA-TL"), SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-GUID"), SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-NAME"), SubLObjectFactory.makeSymbol("FIND-IF-NOT"), SubLObjectFactory.makeSymbol("FIND-INFERENCE-ANSWER-BY-ID"), SubLObjectFactory.makeSymbol("FIND-INFERENCE-BY-IDS"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-ASSERTION"), SubLObjectFactory.makeSymbol("FIND-PREVIOUS-INFERENCE-PROBLEM-BY-EL-ASENT"), SubLObjectFactory.makeSymbol("FIND-PROBLEM-BY-EL-QUERY"), SubLObjectFactory.makeSymbol("FIND-PROBLEM-BY-ID"), SubLObjectFactory.makeSymbol("FIND-PROBLEM-BY-QUERY"), SubLObjectFactory.makeSymbol("FIND-PROOF-BY-ID"), SubLObjectFactory.makeSymbol("FIND-REFORMULATOR-RULE-FOR-RULE-ASSERTION"), SubLObjectFactory.makeSymbol("FIND-STRATEGY-BY-ID"), SubLObjectFactory.makeSymbol("FIND-VISIBLE-ASSERTION-CYCL"), SubLObjectFactory.makeSymbol("FIND-VISIBLE-ASSERTIONS-CYCL"), SubLObjectFactory.makeSymbol("FIRST-CHAR"), SubLObjectFactory.makeSymbol("FIRST-OF"), SubLObjectFactory.makeSymbol("FMAKUNBOUND"), SubLObjectFactory.makeSymbol("FORM-VERIFY"), SubLObjectFactory.makeSymbol("FORMULA-ARGS"), SubLObjectFactory.makeSymbol("FORMULA-ARGS-OK-WRT-TYPE?"), SubLObjectFactory.makeSymbol("FORMULA-ARITY>"), SubLObjectFactory.makeSymbol("FORMULA-VARIABLES-ARG-CONSTRAINTS"), SubLObjectFactory.makeSymbol("FWHEN"), SubLObjectFactory.makeSymbol("GAF-ARG"), SubLObjectFactory.makeSymbol("GAF-CNF-LITERAL"), SubLObjectFactory.makeSymbol("GAF-FORMULA"), SubLObjectFactory.makeSymbol("GAF-OK-WRT-ANTI-TRANSITIVE-PRED?"), SubLObjectFactory.makeSymbol("GATHER-PREDICATE-RULE-INDEX-IN-ALL-MTS"), SubLObjectFactory.makeSymbol("GENERATE-DISAMBIGUATION-PHRASES"), SubLObjectFactory.makeSymbol("GENERATE-GENFORMAT-ARG"), SubLObjectFactory.makeSymbol("GENERATE-QUESTION"), SubLObjectFactory.makeSymbol("GENERATE-REGULAR-STRING"), SubLObjectFactory.makeSymbol("GENERATE-SPEECH-ACT"), SubLObjectFactory.makeSymbol("GENERATE-TEXT"), SubLObjectFactory.makeSymbol("GENLS?"), SubLObjectFactory.makeSymbol("GET-CYCLS-FOR-STRING-ESCALATING"), SubLObjectFactory.makeSymbol("GET-NL-TRIE"), SubLObjectFactory.makeSymbol("GET-STRINGS-OF-TYPE"), SubLObjectFactory.makeSymbol("GET-VARIABLE"), SubLObjectFactory.makeSymbol("GT-INFERIOR?"), SubLObjectFactory.makeSymbol("GT-SUPERIOR-IN-WHAT-MTS"), SubLObjectFactory.makeSymbol("GT-SUPERIOR?"), SubLObjectFactory.makeSymbol("GTM"), SubLObjectFactory.makeSymbol("HL-MODULE-NAME"), SubLObjectFactory.makeSymbol("HL-TO-EL"), SubLObjectFactory.makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR"), SubLObjectFactory.makeSymbol("HL-WFF?"), SubLObjectFactory.makeSymbol("HLMT-EQUAL"), SubLObjectFactory.makeSymbol("HTML-GENERATE-PHRASE"), SubLObjectFactory.makeSymbol("HTML-GENERATE-TEXT"), SubLObjectFactory.makeSymbol("INFERENCE-ABORT"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-BINDINGS-EQUAL?"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-PROOFS"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-P"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWERS-TO-BINDINGS"), SubLObjectFactory.makeSymbol("INFERENCE-CANONICALIZE-ASK-INT"), SubLObjectFactory.makeSymbol("INFERENCE-COMPLETELY-ASSERTED-ASENT-GAFS"), SubLObjectFactory.makeSymbol("INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAFS"), SubLObjectFactory.makeSymbol("INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAFS"), SubLObjectFactory.makeSymbol("INFERENCE-ERROR-SUSPEND-STATUS-P"), SubLObjectFactory.makeSymbol("INFERENCE-HL-MTS"), SubLObjectFactory.makeSymbol("INFERENCE-INTERRUPT"), SubLObjectFactory.makeSymbol("INFERENCE-P"), SubLObjectFactory.makeSymbol("INFERENCE-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("INFERENCE-REWRITE-MODULE"), SubLObjectFactory.makeSymbol("INFERENCE-ROOT-PROBLEM"), SubLObjectFactory.makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"), SubLObjectFactory.makeSymbol("INFERENCE-SUID"), SubLObjectFactory.makeSymbol("INITIALIZE-ALL-SBHL-CACHING"), SubLObjectFactory.makeSymbol("INITIALIZE-INFERENCE-TEST-CARDINALITIES"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-ROTATION-INDEX"), SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-KEYS"), SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-LOOKUP"), SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-P"), SubLObjectFactory.makeSymbol("INTERSECT?"), SubLObjectFactory.makeSymbol("INTERVAL-TOKEN-VALUE"), SubLObjectFactory.makeSymbol("IS-REGULAR-EXPRESSIONS-SUPPORT-AVAILABLE?"), SubLObjectFactory.makeSymbol("KE-UNASSERT-ASSERTION-NOW"), SubLObjectFactory.makeSymbol("KEYWORD-FOR-POS"), SubLObjectFactory.makeSymbol("LEGACY-B-VERIFY"), SubLObjectFactory.makeSymbol("LEGACY-BINDING-VERIFY"), SubLObjectFactory.makeSymbol("LEGACY-VERIFY-NOT"), SubLObjectFactory.makeSymbol("LENGTH="), SubLObjectFactory.makeSymbol("LENGTH>="), SubLObjectFactory.makeSymbol("LOAD-PARTITION"), SubLObjectFactory.makeSymbol("M-VERIFY"), SubLObjectFactory.makeSymbol("MAKE-BINARY-FORMULA"), SubLObjectFactory.makeSymbol("MAKE-CONJUNCTION"), SubLObjectFactory.makeSymbol("MAKE-DISJUNCTION"), SubLObjectFactory.makeSymbol("MAKE-EL-FORMULA"), SubLObjectFactory.makeSymbol("MAKE-EL-VAR"), SubLObjectFactory.makeSymbol("MAKE-EXISTENTIAL"), SubLObjectFactory.makeSymbol("MAKE-EXISTENTIAL-EXACT"), SubLObjectFactory.makeSymbol("MAKE-EXISTENTIAL-MAX"), SubLObjectFactory.makeSymbol("MAKE-EXISTENTIAL-MIN"), SubLObjectFactory.makeSymbol("MAKE-FORMULA"), SubLObjectFactory.makeSymbol("MAKE-GAF-CNF"), SubLObjectFactory.makeSymbol("MAKE-PROCESS-WITH-ARGS"), SubLObjectFactory.makeSymbol("MAKE-SET-FROM-LIST"), SubLObjectFactory.makeSymbol("MAKE-SYMBOL"), SubLObjectFactory.makeSymbol("MAKE-TERNARY-FORMULA"), SubLObjectFactory.makeSymbol("MAKE-UNARY-FORMULA"), SubLObjectFactory.makeSymbol("MAKE-UNUSED-TEMP-FILENAME"), SubLObjectFactory.makeSymbol("MAL-VARIABLES"), SubLObjectFactory.makeSymbol("MAPEXP"), SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-PROBLEM"), SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP"), SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-GENL-PRED-PATHS"), SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-NAT"), SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-NEGATION-INVERSE-PATHS"), SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-NEGATION-PRED-PATHS"), SubLObjectFactory.makeSymbol("MAX-NEGATION-INVERSES"), SubLObjectFactory.makeSymbol("MAXIMIZING-PPH-LINKS"), SubLObjectFactory.makeSymbol("MDW?"), SubLObjectFactory.makeSymbol("MIN-GENL-MTS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-GENL-INVERSE-PATHS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-GENL-PRED-PATHS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-GENLS-PATHS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-ISA-PATHS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-NEGATION-INVERSE-PATHS"), SubLObjectFactory.makeSymbol("MIN-MTS-OF-NEGATION-PRED-PATHS"), SubLObjectFactory.makeSymbol("NAT-ARG1"), SubLObjectFactory.makeSymbol("NAT-ARG2"), SubLObjectFactory.makeSymbol("NAT-FUNCTION"), SubLObjectFactory.makeSymbol("NAT-FUNCTOR"), SubLObjectFactory.makeSymbol("NAUT-TO-NART"), SubLObjectFactory.makeSymbol("NEGATION-INVERSE?"), SubLObjectFactory.makeSymbol("NEGATION-PRED?"), SubLObjectFactory.makeSymbol("NEGATION-PREDS"), SubLObjectFactory.makeSymbol("NEW-CONTINUABLE-INFERENCE"), SubLObjectFactory.makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS"), SubLObjectFactory.makeSymbol("NEW-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("NEW-SET"), SubLObjectFactory.makeSymbol("NEXT-AVAILABLE-WS"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-DENOTS"), SubLObjectFactory.makeSymbol("NL-TRIE-INDEX-ITEM-TERM"), SubLObjectFactory.makeSymbol("NL-TRIE-MATCHING-PHRASES"), SubLObjectFactory.makeSymbol("NL-TRIE-ROTATION-INDEX-INITIALIZED?"), SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH"), SubLObjectFactory.makeSymbol("NL-TRIE-SEMTRANS-TEMPLATES-OF-STRING"), SubLObjectFactory.makeSymbol("NL-TRIE-SENTENCE-TOKENIZE"), SubLObjectFactory.makeSymbol("NON-EMPTY-STRING?"), SubLObjectFactory.makeSymbol("NON-HL-PREDICATE-P"), SubLObjectFactory.makeSymbol("NOT-ENDS-AFTER-ENDING-OF?"), SubLObjectFactory.makeSymbol("NOT-ENDS-AFTER-STARTING-OF?"), SubLObjectFactory.makeSymbol("NOT-EQ"), SubLObjectFactory.makeSymbol("NOT-GENLS?"), SubLObjectFactory.makeSymbol("NOT-MDW?"), SubLObjectFactory.makeSymbol("NOT-STARTS-AFTER-ENDING-OF?"), SubLObjectFactory.makeSymbol("NOT-STARTS-AFTER-STARTING-OF?"), SubLObjectFactory.makeSymbol("NTH-VALUE"), SubLObjectFactory.makeSymbol("NUM-INDEX-SLOW"), SubLObjectFactory.makeSymbol("NUMBER"), SubLObjectFactory.makeSymbol("OBJECT-TO-STRING"), SubLObjectFactory.makeSymbol("ORDERED-LEXIFICATION-PREDS-FOR-KEYWORD"), SubLObjectFactory.makeSymbol("ORDERED-LEXIFICATION-PREDS-OF-STRING"), SubLObjectFactory.makeSymbol("ORDERED-STRINGS-OF-WORD-UNIT"), SubLObjectFactory.makeSymbol("ORDERED-WORD-VARIANTS"), SubLObjectFactory.makeSymbol("OVERLAPS-START?"), SubLObjectFactory.makeSymbol("PAD-TABLE-INITIALIZED?"), SubLObjectFactory.makeSymbol("PARAMETERIZED-TEST-VALUE"), SubLObjectFactory.makeSymbol("PARSE-LEXICAL-SEMANTIC-FORMULA"), SubLObjectFactory.makeSymbol("PIF-FEATURE"), SubLObjectFactory.makeSymbol("PLACEHOLDER-DENOTS-OF-SENSE"), SubLObjectFactory.makeSymbol("POS-FOR-KEYWORD"), SubLObjectFactory.makeSymbol("POS-LIT-VARIABLE-GENL-CONSTRAINTS"), SubLObjectFactory.makeSymbol("POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS"), SubLObjectFactory.makeSymbol("POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("POS-LIT-VARIABLE-ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("POS-OF-STRING"), SubLObjectFactory.makeSymbol("POS-OF-STRING&WORD"), SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P"), SubLObjectFactory.makeSymbol("POWERSET"), SubLObjectFactory.makeSymbol("PPH-IDENTIFY-TYPE"), SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING"), SubLObjectFactory.makeSymbol("PPH-SYMBOL-STRING"), SubLObjectFactory.makeSymbol("PRECISE-KEYWORD-FOR-POS"), SubLObjectFactory.makeSymbol("PREDS-FOR-KEYWORD"), SubLObjectFactory.makeSymbol("PREDS-OF-STRING"), SubLObjectFactory.makeSymbol("PREDS-OF-STRING&WORD"), SubLObjectFactory.makeSymbol("PRINT-DICTIONARY-CONTENTS"), SubLObjectFactory.makeSymbol("PRINT-FAILING-FORM"), SubLObjectFactory.makeSymbol("PRINT-JUSTIFY"), SubLObjectFactory.makeSymbol("PRINT-TMS-FORMULA"), SubLObjectFactory.makeSymbol("PRINT-TMS-MT"), SubLObjectFactory.makeSymbol("PRINT-UNASSERT"), SubLObjectFactory.makeSymbol("PRINTED-FORMS-EQUAL?"), SubLObjectFactory.makeSymbol("PROBLEM-ARGUMENT-LINK-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-DEPENDENT-LINK-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-DISCARDED-TACTIC-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-EXECUTED-TACTIC-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-EXECUTED-TACTICS"), SubLObjectFactory.makeSymbol("PROBLEM-HAS-TACTIC-OF-TYPE-WITH-STATUS?"), SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM"), SubLObjectFactory.makeSymbol("PROBLEM-QUERY-SOLE-CLAUSE"), SubLObjectFactory.makeSymbol("PROBLEM-RELEVANT-TO-INFERENCE?"), SubLObjectFactory.makeSymbol("PROBLEM-STORE"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-FIRST-LINK-OF-TYPE"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-REJECTED-PROOF-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-RESTRICTION-LINK-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-REWRITE-LINK-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-STRATEGY-COUNT"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-SUID"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT"), SubLObjectFactory.makeSymbol("PROOF-REJECTED?"), SubLObjectFactory.makeSymbol("PUTF"), SubLObjectFactory.makeSymbol("PWHEN-FEATURE"), SubLObjectFactory.makeSymbol("QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS"), SubLObjectFactory.makeSymbol("READ-LINE"), SubLObjectFactory.makeSymbol("REBUILD-MODULE-TESTS"), SubLObjectFactory.makeSymbol("RECLASSIFY-REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("REDECLARE-INFERENCE-REMOVAL-MODULE"), SubLObjectFactory.makeSymbol("REFORMULATE-CYCL"), SubLObjectFactory.makeSymbol("REGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS"), SubLObjectFactory.makeSymbol("REGISTER-SKSI-REMOVAL-MODULES-FOR-SKS"), SubLObjectFactory.makeSymbol("REIFIABLE-FUNCTION-TERM?"), SubLObjectFactory.makeSymbol("REIFIABLE-FUNCTOR?"), SubLObjectFactory.makeSymbol("REIFIED-SKOLEM-FN?"), SubLObjectFactory.makeSymbol("RELATED-DENOTS-OF-SENSE"), SubLObjectFactory.makeSymbol("RELATION-VARIABLE-GENL-CONSTRAINTS"), SubLObjectFactory.makeSymbol("RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS"), SubLObjectFactory.makeSymbol("RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("RELATION-VARIABLE-ISA-CONSTRAINTS"), SubLObjectFactory.makeSymbol("RELATIONAL-NOUN-POSSESSED-ARGNUMS"), SubLObjectFactory.makeSymbol("REMOVE-IF-NOT"), SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM"), SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-PROBLEM"), SubLObjectFactory.makeSymbol("RESTRICTION-REWRITE-ADD-LINK"), SubLObjectFactory.makeSymbol("RESULT-GENL"), SubLObjectFactory.makeSymbol("RESULT-INTER-ARG-GENL-RELN"), SubLObjectFactory.makeSymbol("RESULT-INTER-ARG-ISA-RELN"), SubLObjectFactory.makeSymbol("RETURN-UNCANON"), SubLObjectFactory.makeSymbol("REWRITE-ADD-LINK"), SubLObjectFactory.makeSymbol("REWRITE-LINK-TACTIC"), SubLObjectFactory.makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-ALL-SUGGESTIONS"), SubLObjectFactory.makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS"), SubLObjectFactory.makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY"), SubLObjectFactory.makeSymbol("STRENGTHENED-PREDS"), SubLObjectFactory.makeSymbol("TYPED-PRED-STRENGTHEN-FORMULA"), SubLObjectFactory.makeSymbol("RSUBLIS"), SubLObjectFactory.makeSymbol("RULES-MENTIONING"), SubLObjectFactory.makeSymbol("RUN-ALL-CYC-TESTS"), SubLObjectFactory.makeSymbol("RUN-EVALUATABLE-RELATION-TESTS"), SubLObjectFactory.makeSymbol("RUN-TEST-CASE-TABLES-OF-CLASS"), SubLObjectFactory.makeSymbol("RUN-TEST-SUITE"), SubLObjectFactory.makeSymbol("SAFE-FI"), SubLObjectFactory.makeSymbol("SAMPLE-DIFFERENT-LEAF-INSTANCES"), SubLObjectFactory.makeSymbol("SAMPLE-DIFFERENT-LEAF-SPECS"), SubLObjectFactory.makeSymbol("SAMPLE-LEAF-INSTANCES"), SubLObjectFactory.makeSymbol("SAVE-PARTITION"), SubLObjectFactory.makeSymbol("SBHL-CACHED-PREDICATE-RELATION-P"), SubLObjectFactory.makeSymbol("SBHL-CACHED-RELATIONS-FOR-NODE"), SubLObjectFactory.makeSymbol("SBHL-MARKED-NODES"), SubLObjectFactory.makeSymbol("SDC"), SubLObjectFactory.makeSymbol("SDC?"), SubLObjectFactory.makeSymbol("SEMANTICALLY-WF-LITERAL?"), SubLObjectFactory.makeSymbol("SENTENCE-ASSERTIONS"), SubLObjectFactory.makeSymbol("SENTENCE-ASSERTIONS-IN-MT"), SubLObjectFactory.makeSymbol("SENTENCE-FREE-SEQUENCE-VARIABLES"), SubLObjectFactory.makeSymbol("SENTENCE-FREE-VARIABLES"), SubLObjectFactory.makeSymbol("SENTENCE-VARIABLES"), SubLObjectFactory.makeSymbol("SET"), SubLObjectFactory.makeSymbol("SET-ADD"), SubLObjectFactory.makeSymbol("SET-ASSERTION-ASSERTED-BY"), SubLObjectFactory.makeSymbol("SET-ASSERTION-ASSERTED-SECOND"), SubLObjectFactory.makeSymbol("SETHASH"), SubLObjectFactory.makeSymbol("SETS-EQUAL-EQUAL?"), SubLObjectFactory.makeSymbol("SETS-EQUAL?"), SubLObjectFactory.makeSymbol("SIMPLE-INDEX-P"), SubLObjectFactory.makeSymbol("SIMPLEST-INFERENCE-STRATEGY"), SubLObjectFactory.makeSymbol("SIMPLIFY-TRANSITIVE-REDUNDANCIES"), SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-ATOMIC-SENTENCE"), SubLObjectFactory.makeSymbol("SINGLETON?"), SubLObjectFactory.makeSymbol("SKOLEM-DEFN-ASSERTIONS"), SubLObjectFactory.makeSymbol("SKOLEM-FUNCTION-P"), SubLObjectFactory.makeSymbol("SKOLEM-FUNCTION?"), SubLObjectFactory.makeSymbol("SKOLEM-NART?"), SubLObjectFactory.makeSymbol("SKOLEM-RULE-HOSED?"), SubLObjectFactory.makeSymbol("SOME-GENL-PRED-OR-INVERSE?"), SubLObjectFactory.makeSymbol("SOME-NEGATION-PRED-OR-INVERSE?"), SubLObjectFactory.makeSymbol("SOME-SPEC-PRED-OR-INVERSE?"), SubLObjectFactory.makeSymbol("SPEC-POS-PRED?"), SubLObjectFactory.makeSymbol("STARTS-AFTER-ENDING-OF?"), SubLObjectFactory.makeSymbol("STARTS-AFTER-STARTING-OF?"), SubLObjectFactory.makeSymbol("STARTS-DURING?"), SubLObjectFactory.makeSymbol("STARTS-WITH"), SubLObjectFactory.makeSymbol("STRATEGICALLY-FINISHED-PROBLEM-P"), SubLObjectFactory.makeSymbol("STRATEGICALLY-NO-GOOD-PROBLEM-P"), SubLObjectFactory.makeSymbol("STRING-IS-POS-ON-WU?"), SubLObjectFactory.makeSymbol("STRING-TOKEN-VALUE"), SubLObjectFactory.makeSymbol("STRINGS-OF-WORD-UNIT"), SubLObjectFactory.makeSymbol("SUBINDEX-LEAF-COUNT"), SubLObjectFactory.makeSymbol("SUBINDEX-LEAVES"), SubLObjectFactory.makeSymbol("SUBINDEX-P"), SubLObjectFactory.makeSymbol("SUBL-ESCAPE-P"), SubLObjectFactory.makeSymbol("SUBL-STRING-P"), SubLObjectFactory.makeSymbol("SUBSTRING?"), SubLObjectFactory.makeSymbol("SUF-DEFN?"), SubLObjectFactory.makeSymbol("SUPERSETP"), SubLObjectFactory.makeSymbol("TACTIC-HL-MODULE"), SubLObjectFactory.makeSymbol("TACTIC-HL-MODULE-NAME"), SubLObjectFactory.makeSymbol("TACTICALLY-FINISHED-PROBLEM-P"), SubLObjectFactory.makeSymbol("TACTICALLY-NO-GOOD-PROBLEM-P"), SubLObjectFactory.makeSymbol("TACTICALLY-UNEXAMINED-PROBLEM-P"), SubLObjectFactory.makeSymbol("TEMPORAL-BOUNDS-CONTAIN?"), SubLObjectFactory.makeSymbol("TEMPORAL-BOUNDS-IDENTICAL?"), SubLObjectFactory.makeSymbol("TEMPORAL-BOUNDS-INTERSECT?"), SubLObjectFactory.makeSymbol("TEMPORALLY-COORIGINATING?"), SubLObjectFactory.makeSymbol("TEMPORALLY-COTERMINAL?"), SubLObjectFactory.makeSymbol("TEMPORALLY-FINISHED-BY?"), SubLObjectFactory.makeSymbol("TEMPORALLY-STARTED-BY?"), SubLObjectFactory.makeSymbol("TEMPORALLY-SUBSUMES?"), SubLObjectFactory.makeSymbol("TERM-INDEX"), SubLObjectFactory.makeSymbol("TERM-OF-UNIT"), SubLObjectFactory.makeSymbol("TERM-UNIFY"), SubLObjectFactory.makeSymbol("TEST-CANONICALIZE-ASSERT"), SubLObjectFactory.makeSymbol("TEST-CANONICALIZE-ASSERT-SENTENCE"), SubLObjectFactory.makeSymbol("TEST-ERROR"), SubLObjectFactory.makeSymbol("TEST-SUITE-DEFINED-P"), SubLObjectFactory.makeSymbol("TEST-VERIFY"), SubLObjectFactory.makeSymbol("TEST-VERIFY-NEW"), SubLObjectFactory.makeSymbol("THROW-UNEVALUATABLE"), SubLObjectFactory.makeSymbol("TIME"), SubLObjectFactory.makeSymbol("TRANSFORM"), SubLObjectFactory.makeSymbol("TREE-FIND"), SubLObjectFactory.makeSymbol("TREE-FIND-IF"), SubLObjectFactory.makeSymbol("TREE-GATHER"), SubLObjectFactory.makeSymbol("TREE-MATCHES-PATTERN"), SubLObjectFactory.makeSymbol("TYPED-DENOTS-OF-STRING-AT-PLACE"), SubLObjectFactory.makeSymbol("UNCANON-TEST"), SubLObjectFactory.makeSymbol("UNDECLARE-INFERENCE-REMOVAL-MODULE"), SubLObjectFactory.makeSymbol("UNKNOWN-ASSERTION?"), SubLObjectFactory.makeSymbol("UNWRAP-IF-IST-PERMISSIVE"), SubLObjectFactory.makeSymbol("USELESS-NART?"), SubLObjectFactory.makeSymbol("VALID-ASSERTION?"), SubLObjectFactory.makeSymbol("VALID-EL-VAR?"), SubLObjectFactory.makeSymbol("VALID-SBHL-LINKS-P"), SubLObjectFactory.makeSymbol("VAR-NAMES-IN-STRING"), SubLObjectFactory.makeSymbol("VARIABLE-LOOKUP"), SubLObjectFactory.makeSymbol("VERIFY-NOT"), SubLObjectFactory.makeSymbol("WHY-NOT-QUERY-OK"), SubLObjectFactory.makeSymbol("WHY-NOT-SEMANTICALLY-WF-WRT-TYPES"), SubLObjectFactory.makeSymbol("WHY-NOT-WFF"), SubLObjectFactory.makeSymbol("WHY-NOT-WFF-ASK"), SubLObjectFactory.makeSymbol("WHY-NOT-WFF-ASSERT"), SubLObjectFactory.makeSymbol("WHY-NOT-WFT"), SubLObjectFactory.makeSymbol("WITH-ALL-PREDICATES"), SubLObjectFactory.makeSymbol("WITH-INFERENCE-ERROR-HANDLING"), SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), SubLObjectFactory.makeSymbol("WITH-NL-TRIE-CASE-SENSITIVITY-OFF"), SubLObjectFactory.makeSymbol("WITH-NL-TRIE-CASE-SENSITIVITY-ON"), SubLObjectFactory.makeSymbol("WITH-PARAPHRASE-MAPPINGS"), SubLObjectFactory.makeSymbol("WITH-PPH-DEMERIT-CUTOFF"), SubLObjectFactory.makeSymbol("WITH-PPH-MEMOIZATION"), SubLObjectFactory.makeSymbol("WITH-PRECISE-PARAPHRASE-OFF"), SubLObjectFactory.makeSymbol("WITH-ALL-SPEC-PREDICATES"), SubLObjectFactory.makeSymbol("WITH-TEST-ASSERTION-LISTS"), SubLObjectFactory.makeSymbol("WITH-TEST-ASSERTIONS"), SubLObjectFactory.makeSymbol("WITH-TEST-CONSTANTS"), SubLObjectFactory.makeSymbol("WITH-TEXT-FILE"), SubLObjectFactory.makeSymbol("WITH-THE-CYCLIST"), SubLObjectFactory.makeSymbol("WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD"), SubLObjectFactory.makeSymbol("WITHOUT-SBHL-CACHES"), SubLObjectFactory.makeSymbol("WITHOUT-UNLEXIFIED-TERM-DISCOVERY-LOGGING"), SubLObjectFactory.makeSymbol("WORD-HAS-POS?"), SubLObjectFactory.makeSymbol("WORD-VARIANTS"), SubLObjectFactory.makeSymbol("WORDS-OF-STRING&POS"), SubLObjectFactory.makeSymbol("WORDS-OF-STRING&PRED"), SubLObjectFactory.makeSymbol("WORDS-OF-STRING&SPEECH-PART") });
    }
    
    public void declareFunctions() {
        declare_secure_translation_file();
    }
    
    public void initializeVariables() {
        init_secure_translation_file();
    }
    
    public void runTopLevelForms() {
        setup_secure_translation_file();
    }
    
    static {
        me = (SubLFile)new secure_translation();
        secure_translation.$translator_security_levels$ = null;
        secure_translation.$dtp_secure_id_database$ = null;
        secure_translation.$secure_id_database_type_marker$ = null;
        secure_translation.$standard_library_symbols_not_to_obfuscate$ = null;
        secure_translation.$misc_symbols_not_to_obfuscate$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeKeyword("LOW"), (SubLObject)SubLObjectFactory.makeKeyword("MEDIUM"), (SubLObject)SubLObjectFactory.makeKeyword("HIGH"));
        $sym1$SECURE_ID_DATABASE = SubLObjectFactory.makeSymbol("SECURE-ID-DATABASE");
        $sym2$SECURE_ID_DATABASE_P = SubLObjectFactory.makeSymbol("SECURE-ID-DATABASE-P");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SECURITY-LEVEL"), SubLObjectFactory.makeSymbol("ID-MODULE-TABLE"), SubLObjectFactory.makeSymbol("MODULE-ID-TABLE"), SubLObjectFactory.makeSymbol("ID-METHOD-TABLE"), SubLObjectFactory.makeSymbol("METHOD-ID-TABLE"), SubLObjectFactory.makeSymbol("ID-GLOBAL-TABLE"), SubLObjectFactory.makeSymbol("GLOBAL-ID-TABLE"), SubLObjectFactory.makeSymbol("SYMBOL-EXCEPTIONS"), SubLObjectFactory.makeSymbol("ID-SYMBOL-TABLE"), SubLObjectFactory.makeSymbol("SYMBOL-ID-TABLE") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SECURITY-LEVEL"), SubLObjectFactory.makeKeyword("ID-MODULE-TABLE"), SubLObjectFactory.makeKeyword("MODULE-ID-TABLE"), SubLObjectFactory.makeKeyword("ID-METHOD-TABLE"), SubLObjectFactory.makeKeyword("METHOD-ID-TABLE"), SubLObjectFactory.makeKeyword("ID-GLOBAL-TABLE"), SubLObjectFactory.makeKeyword("GLOBAL-ID-TABLE"), SubLObjectFactory.makeKeyword("SYMBOL-EXCEPTIONS"), SubLObjectFactory.makeKeyword("ID-SYMBOL-TABLE"), SubLObjectFactory.makeKeyword("SYMBOL-ID-TABLE") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SID-DB-SECURITY-LEVEL"), SubLObjectFactory.makeSymbol("SID-DB-ID-MODULE-TABLE"), SubLObjectFactory.makeSymbol("SID-DB-MODULE-ID-TABLE"), SubLObjectFactory.makeSymbol("SID-DB-ID-METHOD-TABLE"), SubLObjectFactory.makeSymbol("SID-DB-METHOD-ID-TABLE"), SubLObjectFactory.makeSymbol("SID-DB-ID-GLOBAL-TABLE"), SubLObjectFactory.makeSymbol("SID-DB-GLOBAL-ID-TABLE"), SubLObjectFactory.makeSymbol("SID-DB-SYMBOL-EXCEPTIONS"), SubLObjectFactory.makeSymbol("SID-DB-ID-SYMBOL-TABLE"), SubLObjectFactory.makeSymbol("SID-DB-SYMBOL-ID-TABLE") });
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-SID-DB-SECURITY-LEVEL"), SubLObjectFactory.makeSymbol("_CSETF-SID-DB-ID-MODULE-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-SID-DB-MODULE-ID-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-SID-DB-ID-METHOD-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-SID-DB-METHOD-ID-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-SID-DB-ID-GLOBAL-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-SID-DB-GLOBAL-ID-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-SID-DB-SYMBOL-EXCEPTIONS"), SubLObjectFactory.makeSymbol("_CSETF-SID-DB-ID-SYMBOL-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-SID-DB-SYMBOL-ID-TABLE") });
        $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym8$SECURE_ID_DATABASE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SECURE-ID-DATABASE-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SECURE-ID-DATABASE-P"));
        $sym10$SID_DB_SECURITY_LEVEL = SubLObjectFactory.makeSymbol("SID-DB-SECURITY-LEVEL");
        $sym11$_CSETF_SID_DB_SECURITY_LEVEL = SubLObjectFactory.makeSymbol("_CSETF-SID-DB-SECURITY-LEVEL");
        $sym12$SID_DB_ID_MODULE_TABLE = SubLObjectFactory.makeSymbol("SID-DB-ID-MODULE-TABLE");
        $sym13$_CSETF_SID_DB_ID_MODULE_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SID-DB-ID-MODULE-TABLE");
        $sym14$SID_DB_MODULE_ID_TABLE = SubLObjectFactory.makeSymbol("SID-DB-MODULE-ID-TABLE");
        $sym15$_CSETF_SID_DB_MODULE_ID_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SID-DB-MODULE-ID-TABLE");
        $sym16$SID_DB_ID_METHOD_TABLE = SubLObjectFactory.makeSymbol("SID-DB-ID-METHOD-TABLE");
        $sym17$_CSETF_SID_DB_ID_METHOD_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SID-DB-ID-METHOD-TABLE");
        $sym18$SID_DB_METHOD_ID_TABLE = SubLObjectFactory.makeSymbol("SID-DB-METHOD-ID-TABLE");
        $sym19$_CSETF_SID_DB_METHOD_ID_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SID-DB-METHOD-ID-TABLE");
        $sym20$SID_DB_ID_GLOBAL_TABLE = SubLObjectFactory.makeSymbol("SID-DB-ID-GLOBAL-TABLE");
        $sym21$_CSETF_SID_DB_ID_GLOBAL_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SID-DB-ID-GLOBAL-TABLE");
        $sym22$SID_DB_GLOBAL_ID_TABLE = SubLObjectFactory.makeSymbol("SID-DB-GLOBAL-ID-TABLE");
        $sym23$_CSETF_SID_DB_GLOBAL_ID_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SID-DB-GLOBAL-ID-TABLE");
        $sym24$SID_DB_SYMBOL_EXCEPTIONS = SubLObjectFactory.makeSymbol("SID-DB-SYMBOL-EXCEPTIONS");
        $sym25$_CSETF_SID_DB_SYMBOL_EXCEPTIONS = SubLObjectFactory.makeSymbol("_CSETF-SID-DB-SYMBOL-EXCEPTIONS");
        $sym26$SID_DB_ID_SYMBOL_TABLE = SubLObjectFactory.makeSymbol("SID-DB-ID-SYMBOL-TABLE");
        $sym27$_CSETF_SID_DB_ID_SYMBOL_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SID-DB-ID-SYMBOL-TABLE");
        $sym28$SID_DB_SYMBOL_ID_TABLE = SubLObjectFactory.makeSymbol("SID-DB-SYMBOL-ID-TABLE");
        $sym29$_CSETF_SID_DB_SYMBOL_ID_TABLE = SubLObjectFactory.makeSymbol("_CSETF-SID-DB-SYMBOL-ID-TABLE");
        $kw30$SECURITY_LEVEL = SubLObjectFactory.makeKeyword("SECURITY-LEVEL");
        $kw31$ID_MODULE_TABLE = SubLObjectFactory.makeKeyword("ID-MODULE-TABLE");
        $kw32$MODULE_ID_TABLE = SubLObjectFactory.makeKeyword("MODULE-ID-TABLE");
        $kw33$ID_METHOD_TABLE = SubLObjectFactory.makeKeyword("ID-METHOD-TABLE");
        $kw34$METHOD_ID_TABLE = SubLObjectFactory.makeKeyword("METHOD-ID-TABLE");
        $kw35$ID_GLOBAL_TABLE = SubLObjectFactory.makeKeyword("ID-GLOBAL-TABLE");
        $kw36$GLOBAL_ID_TABLE = SubLObjectFactory.makeKeyword("GLOBAL-ID-TABLE");
        $kw37$SYMBOL_EXCEPTIONS = SubLObjectFactory.makeKeyword("SYMBOL-EXCEPTIONS");
        $kw38$ID_SYMBOL_TABLE = SubLObjectFactory.makeKeyword("ID-SYMBOL-TABLE");
        $kw39$SYMBOL_ID_TABLE = SubLObjectFactory.makeKeyword("SYMBOL-ID-TABLE");
        $str40$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw41$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym42$MAKE_SECURE_ID_DATABASE = SubLObjectFactory.makeSymbol("MAKE-SECURE-ID-DATABASE");
        $kw43$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw44$END = SubLObjectFactory.makeKeyword("END");
        $sym45$VISIT_DEFSTRUCT_OBJECT_SECURE_ID_DATABASE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SECURE-ID-DATABASE-METHOD");
        $sym46$TRANSLATOR_SECURITY_LEVEL_P = SubLObjectFactory.makeSymbol("TRANSLATOR-SECURITY-LEVEL-P");
        $int47$1500 = SubLObjectFactory.makeInteger(1500);
        $int48$10000 = SubLObjectFactory.makeInteger(10000);
        $int49$1000 = SubLObjectFactory.makeInteger(1000);
        $kw50$FREE = SubLObjectFactory.makeKeyword("FREE");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MEDIUM"), (SubLObject)SubLObjectFactory.makeKeyword("HIGH"));
        $str52$S = SubLObjectFactory.makeString("S");
        $str53$US = SubLObjectFactory.makeString("US");
        $kw54$HIGH = SubLObjectFactory.makeKeyword("HIGH");
        $str55$_ = SubLObjectFactory.makeString("#");
        $kw56$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str57$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str58$c3edef08_eef1_11dd_9624_00219b50e = SubLObjectFactory.makeString("c3edef08-eef1-11dd-9624-00219b50e0e5");
        $kw59$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw60$VERSION = SubLObjectFactory.makeKeyword("VERSION");
        $kw61$COPYRIGHT = SubLObjectFactory.makeKeyword("COPYRIGHT");
        $kw62$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str63$Invalid_format___A_cannot_be_inte = SubLObjectFactory.makeString("Invalid format: ~A cannot be interpreted as a secure ID database.~%");
        $str64$ = SubLObjectFactory.makeString("");
        $str65$Invalid_format__The_type_ID_is_mi = SubLObjectFactory.makeString("Invalid format: The type ID is missing or invalid.~%");
        $sym66$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $str67$Invalid_format___A_is_not_a_valid = SubLObjectFactory.makeString("Invalid format: ~A is not a valid version specification.~%");
        $list68 = ConsesLow.list((SubLObject)secure_translation.ONE_INTEGER, (SubLObject)secure_translation.ZERO_INTEGER);
        $str69$Invalid_format___A_is_not_a_known = SubLObjectFactory.makeString("Invalid format: ~A is not a known version specification.~%");
        $str70$Invalid_format___A_is_not_a_valid = SubLObjectFactory.makeString("Invalid format: ~A is not a valid security level.~%");
        $str71$Invalid_format___A_is_not_a_valid = SubLObjectFactory.makeString("Invalid format: ~A is not a valid symbol exceptions set.~%");
        $str72$Invalid_format___A_is_not_a_valid = SubLObjectFactory.makeString("Invalid format: ~A is not a valid table mapping to ids of type ~A.");
        $sym73$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym74$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym75$API_MUTABLE_GLOBAL_P = SubLObjectFactory.makeSymbol("API-MUTABLE-GLOBAL-P");
        $str76$CYC = SubLObjectFactory.makeString("CYC");
        $list77 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("READER-WRITER-LOCK-P"), SubLObjectFactory.makeSymbol("RW-LOCK-P"), SubLObjectFactory.makeSymbol("NEW-RW-LOCK"), SubLObjectFactory.makeSymbol("RW-LOCK-NAME"), SubLObjectFactory.makeSymbol("RW-LOCK-SEIZE-READ-LOCK"), SubLObjectFactory.makeSymbol("RW-LOCK-SEIZE-WRITE-LOCK"), SubLObjectFactory.makeSymbol("RW-LOCK-RELEASE-READ-LOCK"), SubLObjectFactory.makeSymbol("RW-LOCK-RELEASE-WRITE-LOCK"), SubLObjectFactory.makeSymbol("SEMAPHORE-P"), SubLObjectFactory.makeSymbol("NEW-SEMAPHORE"), SubLObjectFactory.makeSymbol("SEMAPHORE-NAME"), SubLObjectFactory.makeSymbol("SEMAPHORE-SIGNAL"), SubLObjectFactory.makeSymbol("SEMAPHORE-CURRENT-COUNT"), SubLObjectFactory.makeSymbol("SEMAPHORE-WAIT"), SubLObjectFactory.makeSymbol("SEMAPHORE-DRAIN"), SubLObjectFactory.makeSymbol("SEMAPHORE-WAIT-WITH-TIMEOUT") });
        $list78 = _constant_78_initializer();
        $kw79$EOF = SubLObjectFactory.makeKeyword("EOF");
        $sym80$FBOUNDP = SubLObjectFactory.makeSymbol("FBOUNDP");
        $sym81$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym82$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $str83$Stuck_on__A_which_is_neither_meth = SubLObjectFactory.makeString("Stuck on ~A which is neither method nor macro.~%");
        $str84$___in_package__cyc___ = SubLObjectFactory.makeString("~%(in-package :cyc)~%");
        $str85$___deflexical__unprovided_trampol = SubLObjectFactory.makeString("~%(deflexical *unprovided-trampoline-arg* '|the unprovided trampoline argument|)~%");
        $str86$___define__A_ = SubLObjectFactory.makeString("~%(define ~A ");
        $sym87$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $str88$_____ = SubLObjectFactory.makeString(")~%~%");
        $str89$___defmacro__A___rest_rest_ = SubLObjectFactory.makeString("~%(defmacro ~A (&rest rest)");
        $str90$_ret___ = SubLObjectFactory.makeString("(ret `(");
        $str91$___rest___ = SubLObjectFactory.makeString(" ,@rest)))");
        $str92$_ = SubLObjectFactory.makeString("(");
        $str93$_ = SubLObjectFactory.makeString(" ");
        $str94$_optional = SubLObjectFactory.makeString("&optional");
        $str95$__ = SubLObjectFactory.makeString(" (");
        $str96$__unprovided_trampoline_arg__ = SubLObjectFactory.makeString(" *unprovided-trampoline-arg*)");
        $str97$_ = SubLObjectFactory.makeString(")");
        $str98$_ret___A = SubLObjectFactory.makeString("(ret (~A");
        $str99$__ = SubLObjectFactory.makeString("))");
        $str100$_pcond = SubLObjectFactory.makeString("(pcond");
        $str101$__eq__unprovided_trampoline_arg__ = SubLObjectFactory.makeString("((eq *unprovided-trampoline-arg* ");
        $str102$__ = SubLObjectFactory.makeString(") ");
        $str103$_t_ = SubLObjectFactory.makeString("(t ");
    }
    
    public static final class $secure_id_database_native extends SubLStructNative
    {
        public SubLObject $security_level;
        public SubLObject $id_module_table;
        public SubLObject $module_id_table;
        public SubLObject $id_method_table;
        public SubLObject $method_id_table;
        public SubLObject $id_global_table;
        public SubLObject $global_id_table;
        public SubLObject $symbol_exceptions;
        public SubLObject $id_symbol_table;
        public SubLObject $symbol_id_table;
        private static final SubLStructDeclNative structDecl;
        
        public $secure_id_database_native() {
            this.$security_level = (SubLObject)CommonSymbols.NIL;
            this.$id_module_table = (SubLObject)CommonSymbols.NIL;
            this.$module_id_table = (SubLObject)CommonSymbols.NIL;
            this.$id_method_table = (SubLObject)CommonSymbols.NIL;
            this.$method_id_table = (SubLObject)CommonSymbols.NIL;
            this.$id_global_table = (SubLObject)CommonSymbols.NIL;
            this.$global_id_table = (SubLObject)CommonSymbols.NIL;
            this.$symbol_exceptions = (SubLObject)CommonSymbols.NIL;
            this.$id_symbol_table = (SubLObject)CommonSymbols.NIL;
            this.$symbol_id_table = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$secure_id_database_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$security_level;
        }
        
        public SubLObject getField3() {
            return this.$id_module_table;
        }
        
        public SubLObject getField4() {
            return this.$module_id_table;
        }
        
        public SubLObject getField5() {
            return this.$id_method_table;
        }
        
        public SubLObject getField6() {
            return this.$method_id_table;
        }
        
        public SubLObject getField7() {
            return this.$id_global_table;
        }
        
        public SubLObject getField8() {
            return this.$global_id_table;
        }
        
        public SubLObject getField9() {
            return this.$symbol_exceptions;
        }
        
        public SubLObject getField10() {
            return this.$id_symbol_table;
        }
        
        public SubLObject getField11() {
            return this.$symbol_id_table;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$security_level = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$id_module_table = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$module_id_table = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$id_method_table = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$method_id_table = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$id_global_table = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$global_id_table = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$symbol_exceptions = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$id_symbol_table = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$symbol_id_table = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$secure_id_database_native.class, secure_translation.$sym1$SECURE_ID_DATABASE, secure_translation.$sym2$SECURE_ID_DATABASE_P, secure_translation.$list3, secure_translation.$list4, new String[] { "$security_level", "$id_module_table", "$module_id_table", "$id_method_table", "$method_id_table", "$id_global_table", "$global_id_table", "$symbol_exceptions", "$id_symbol_table", "$symbol_id_table" }, secure_translation.$list5, secure_translation.$list6, secure_translation.$sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $secure_id_database_p$UnaryFunction extends UnaryFunction
    {
        public $secure_id_database_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SECURE-ID-DATABASE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return secure_translation.secure_id_database_p(arg1);
        }
    }
}

/*

	Total time: 595 ms
	
*/