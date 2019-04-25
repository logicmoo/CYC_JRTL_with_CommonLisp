package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class red_api extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.red_api";
    public static final String myFingerPrint = "764b942df1c10c5bacd6c6f025b21f1ff18e468ff2a9c2882884950e0621b132";
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 513L)
    public static SubLSymbol $red_api_object$;
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 707L)
    public static SubLSymbol $red_filenames$;
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 748L)
    public static SubLSymbol $dtp_red_struct$;
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 1025L)
    public static SubLSymbol $dtp_red_repository_struct$;
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 4853L)
    public static SubLSymbol $dtp_red_repository_list_struct$;
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 6895L)
    public static SubLSymbol $dtp_red_element_struct$;
    private static final SubLSymbol $sym0$RED_STRUCT;
    private static final SubLSymbol $sym1$RED_STRUCT_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_RED_STRUCT;
    private static final SubLSymbol $sym7$RED_STRUCT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$RED_STRUCT_COBJ;
    private static final SubLSymbol $sym10$_CSETF_RED_STRUCT_COBJ;
    private static final SubLSymbol $kw11$COBJ;
    private static final SubLString $str12$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw13$BEGIN;
    private static final SubLSymbol $sym14$MAKE_RED_STRUCT;
    private static final SubLSymbol $kw15$SLOT;
    private static final SubLSymbol $kw16$END;
    private static final SubLSymbol $sym17$VISIT_DEFSTRUCT_OBJECT_RED_STRUCT_METHOD;
    private static final SubLSymbol $sym18$RED_REPOSITORY_STRUCT;
    private static final SubLSymbol $sym19$RED_REPOSITORY_STRUCT_P;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$PRINT_RED_REPOSITORY_STRUCT;
    private static final SubLSymbol $sym25$RED_REPOSITORY_STRUCT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$RED_REPOSITORY_STRUCT_FILENAME;
    private static final SubLSymbol $sym28$_CSETF_RED_REPOSITORY_STRUCT_FILENAME;
    private static final SubLSymbol $kw29$FILENAME;
    private static final SubLSymbol $sym30$MAKE_RED_REPOSITORY_STRUCT;
    private static final SubLSymbol $sym31$VISIT_DEFSTRUCT_OBJECT_RED_REPOSITORY_STRUCT_METHOD;
    private static final SubLSymbol $kw32$RED_SHARED;
    private static final SubLString $str33$__red_struct_obj___s__version____;
    private static final SubLSymbol $sym34$RED_GET_VERSION_STRING_IMPLEMENTATION;
    private static final SubLSymbol $sym35$RED_GET_DATE_STRING_IMPLEMENTATION;
    private static final SubLSymbol $sym36$RED_GET_TIME_STRING_IMPLEMENTATION;
    private static final SubLSymbol $sym37$RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION;
    private static final SubLString $str38$__red_struct_cobj__nil_;
    private static final SubLSymbol $sym39$STRINGP;
    private static final SubLString $str40$__red_repository_struct_INVALID__;
    private static final SubLString $str41$__red_repository_struct__name____;
    private static final SubLSymbol $sym42$RED_GET_REPOSITORY_NAME_IMPLEMENTATION;
    private static final SubLSymbol $sym43$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION;
    private static final SubLSymbol $sym44$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION;
    private static final SubLSymbol $sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION;
    private static final SubLSymbol $sym46$RED_GET_REPOSITORY_TIME_IMPLEMENTATION;
    private static final SubLSymbol $sym47$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION;
    private static final SubLSymbol $sym48$RED_REPOSITORY_LIST_STRUCT;
    private static final SubLSymbol $sym49$RED_REPOSITORY_LIST_STRUCT_P;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$PRINT_RED_REPOSITORY_LIST_STRUCT;
    private static final SubLSymbol $sym55$RED_REPOSITORY_LIST_STRUCT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$RED_REPOSITORY_LIST_STRUCT_TYPE;
    private static final SubLSymbol $sym58$_CSETF_RED_REPOSITORY_LIST_STRUCT_TYPE;
    private static final SubLSymbol $kw59$TYPE;
    private static final SubLSymbol $sym60$MAKE_RED_REPOSITORY_LIST_STRUCT;
    private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_RED_REPOSITORY_LIST_STRUCT_METHOD;
    private static final SubLSymbol $kw62$SYSTEM;
    private static final SubLSymbol $kw63$MACHINE;
    private static final SubLSymbol $kw64$MACHINE_SYSTEM;
    private static final SubLSymbol $kw65$SYSTEM_MACHINE;
    private static final SubLSymbol $kw66$APPLICATION;
    private static final SubLSymbol $kw67$MOST_PRIVILEGED;
    private static final SubLSymbol $kw68$LEAST_PRIVILEGED;
    private static final SubLString $str69$__red_repository_list_struct_type;
    private static final SubLString $str70$__red_repository_list_struct_elts;
    private static final SubLString $str71$__red_repository_list_struct_elts;
    private static final SubLString $str72$_s_;
    private static final SubLSymbol $sym73$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION;
    private static final SubLString $str74$__;
    private static final SubLSymbol $sym75$RED_ELEMENT_STRUCT;
    private static final SubLSymbol $sym76$RED_ELEMENT_STRUCT_P;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$PRINT_RED_ELEMENT_STRUCT;
    private static final SubLSymbol $sym82$RED_ELEMENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$RED_ELEMENT_STRUCT_REPOSITORY_LIST;
    private static final SubLSymbol $sym85$_CSETF_RED_ELEMENT_STRUCT_REPOSITORY_LIST;
    private static final SubLSymbol $sym86$RED_ELEMENT_STRUCT_KEY_STRING;
    private static final SubLSymbol $sym87$_CSETF_RED_ELEMENT_STRUCT_KEY_STRING;
    private static final SubLSymbol $kw88$REPOSITORY_LIST;
    private static final SubLSymbol $kw89$KEY_STRING;
    private static final SubLSymbol $sym90$MAKE_RED_ELEMENT_STRUCT;
    private static final SubLSymbol $sym91$VISIT_DEFSTRUCT_OBJECT_RED_ELEMENT_STRUCT_METHOD;
    private static final SubLString $str92$__red_element_struct_key____s_;
    private static final SubLSymbol $sym93$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION;
    private static final SubLSymbol $sym94$RED_GET_DATATYPE_STRING_IMPLEMENTATION;
    private static final SubLString $str95$__red_element_struct_key___s_type;
    private static final SubLSymbol $kw96$STRING;
    private static final SubLString $str97$value____s;
    private static final SubLSymbol $sym98$RED_GET_STRING_VALUE_IMPLEMENTATION;
    private static final SubLSymbol $kw99$INTEGER;
    private static final SubLString $str100$value____d;
    private static final SubLSymbol $sym101$RED_GET_INT32_VALUE_IMPLEMENTATION;
    private static final SubLSymbol $kw102$BLOB;
    private static final SubLString $str103$BlobValue____;
    private static final SubLString $str104$_x;
    private static final SubLString $str105$0;
    private static final SubLString $str106$_a;
    private static final SubLString $str107$_;
    private static final SubLSymbol $kw108$DEFAULT;
    private static final SubLString $str109$INVALID_DATA_TYPE;
    private static final SubLString $str110$_;
    private static final SubLSymbol $sym111$RED_NUMBER_REPOSITORIES_IMPLEMENTATION;
    private static final SubLSymbol $sym112$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION;
    private static final SubLString $str113$;
    private static final SubLSymbol $sym114$RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION;
    private static final SubLSymbol $sym115$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION;
    private static final SubLSymbol $sym116$RED_GET_KEY_IMPLEMENTATION;
    private static final SubLSymbol $sym117$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION;
    private static final SubLSymbol $sym118$RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION;
    private static final SubLSymbol $sym119$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION;
    private static final SubLSymbol $sym120$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION;
    private static final SubLSymbol $sym121$RED_ITERATOR_HAS_NEXT_IMPLEMENTATION;
    private static final SubLSymbol $sym122$RED_ITERATOR_NEXT_IMPLEMENTATION;
    private static final SubLSymbol $sym123$RED_ITERATOR_DISPOSE_IMPLEMENTATION;
    private static final SubLSymbol $kw124$INVALID;
    private static final SubLString $str125$_;
    private static final SubLSymbol $sym126$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION;
    private static final SubLSymbol $sym127$RED_REPOSITORY_OBJECT_VALID_P;
    private static final SubLSymbol $sym128$RED_REPOSITORY_DISPOSE_IMPLEMENTATION;
    private static final SubLSymbol $sym129$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION;
    private static final SubLSymbol $sym130$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION;
    private static final SubLSymbol $sym131$RED_LOAD_REPOSITORY_IMPLEMENTATION;
    private static final SubLSymbol $sym132$RED_DISPOSE_IMPLEMENTATION;
    private static final SubLString $str133$string;
    private static final SubLString $str134$integer;
    private static final SubLString $str135$blob;
    private static final SubLSymbol $sym136$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION;
    private static final SubLSymbol $sym137$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION;
    private static final SubLSymbol $sym138$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION;
    private static final SubLSymbol $sym139$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION;
    private static final SubLSymbol $sym140$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION;
    private static final SubLSymbol $sym141$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION;
    private static final SubLSymbol $sym142$RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION;
    private static final SubLSymbol $sym143$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION;
    private static final SubLSymbol $sym144$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION;
    private static final SubLSymbol $sym145$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION;
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 748L)
    public static SubLObject red_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_red_struct(v_object, stream, (SubLObject)red_api.ZERO_INTEGER);
        return (SubLObject)red_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 748L)
    public static SubLObject red_struct_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $red_struct_native.class) ? red_api.T : red_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 748L)
    public static SubLObject red_struct_cobj(final SubLObject v_object) {
        assert red_api.NIL != red_struct_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 748L)
    public static SubLObject _csetf_red_struct_cobj(final SubLObject v_object, final SubLObject value) {
        assert red_api.NIL != red_struct_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 748L)
    public static SubLObject make_red_struct(SubLObject arglist) {
        if (arglist == red_api.UNPROVIDED) {
            arglist = (SubLObject)red_api.NIL;
        }
        final SubLObject v_new = (SubLObject)new $red_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)red_api.NIL, next = arglist; red_api.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)red_api.$kw11$COBJ)) {
                _csetf_red_struct_cobj(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)red_api.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 748L)
    public static SubLObject visit_defstruct_red_struct(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw13$BEGIN, (SubLObject)red_api.$sym14$MAKE_RED_STRUCT, (SubLObject)red_api.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw15$SLOT, (SubLObject)red_api.$kw11$COBJ, red_struct_cobj(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw16$END, (SubLObject)red_api.$sym14$MAKE_RED_STRUCT, (SubLObject)red_api.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 748L)
    public static SubLObject visit_defstruct_object_red_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_red_struct(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 1025L)
    public static SubLObject red_repository_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_red_repository_struct(v_object, stream, (SubLObject)red_api.ZERO_INTEGER);
        return (SubLObject)red_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 1025L)
    public static SubLObject red_repository_struct_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $red_repository_struct_native.class) ? red_api.T : red_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 1025L)
    public static SubLObject red_repository_struct_filename(final SubLObject v_object) {
        assert red_api.NIL != red_repository_struct_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 1025L)
    public static SubLObject _csetf_red_repository_struct_filename(final SubLObject v_object, final SubLObject value) {
        assert red_api.NIL != red_repository_struct_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 1025L)
    public static SubLObject make_red_repository_struct(SubLObject arglist) {
        if (arglist == red_api.UNPROVIDED) {
            arglist = (SubLObject)red_api.NIL;
        }
        final SubLObject v_new = (SubLObject)new $red_repository_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)red_api.NIL, next = arglist; red_api.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)red_api.$kw29$FILENAME)) {
                _csetf_red_repository_struct_filename(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)red_api.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 1025L)
    public static SubLObject visit_defstruct_red_repository_struct(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw13$BEGIN, (SubLObject)red_api.$sym30$MAKE_RED_REPOSITORY_STRUCT, (SubLObject)red_api.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw15$SLOT, (SubLObject)red_api.$kw29$FILENAME, red_repository_struct_filename(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw16$END, (SubLObject)red_api.$sym30$MAKE_RED_REPOSITORY_STRUCT, (SubLObject)red_api.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 1025L)
    public static SubLObject visit_defstruct_object_red_repository_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_red_repository_struct(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 1161L)
    public static SubLObject red_struct_create() {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        final SubLObject red_obj = make_red_struct((SubLObject)red_api.UNPROVIDED);
        _csetf_red_struct_cobj(red_obj, SubLMain.get_red_object());
        red_cond_create_repository_filenames();
        return red_obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 1519L)
    public static SubLObject print_red_struct(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        if (red_api.NIL != red_struct_cobj(v_object)) {
            final SubLObject red = red_struct_cobj(v_object);
            final SubLObject system_repository = red_get_system_repository((SubLObject)red_api.UNPROVIDED);
            final SubLObject machine_repository = red_get_machine_repository((SubLObject)red_api.UNPROVIDED);
            PrintLow.format(stream, (SubLObject)red_api.$str33$__red_struct_obj___s__version____, new SubLObject[] { red, Functions.funcall((SubLObject)red_api.$sym34$RED_GET_VERSION_STRING_IMPLEMENTATION, red), Functions.funcall((SubLObject)red_api.$sym35$RED_GET_DATE_STRING_IMPLEMENTATION, red), Functions.funcall((SubLObject)red_api.$sym36$RED_GET_TIME_STRING_IMPLEMENTATION, red), Functions.funcall((SubLObject)red_api.$sym37$RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION, red), system_repository, machine_repository });
        }
        else {
            PrintLow.format(stream, (SubLObject)red_api.$str38$__red_struct_cobj__nil_);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 2425L)
    public static SubLObject red_repository_struct_create(final SubLObject filename) {
        assert red_api.NIL != Types.stringp(filename) : filename;
        final SubLObject cobj = red_lookup_or_load_repository_object_by_filename(filename);
        if (red_api.NIL == cobj) {
            return (SubLObject)red_api.NIL;
        }
        final SubLObject rr = make_red_repository_struct((SubLObject)red_api.UNPROVIDED);
        _csetf_red_repository_struct_filename(rr, filename);
        return rr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 2756L)
    public static SubLObject red_repository_object_wrap(final SubLObject cobj) {
        if (red_api.NIL == cobj) {
            return (SubLObject)red_api.NIL;
        }
        final SubLObject filename = red_get_filename_from_object(cobj);
        if (red_api.NIL == filename) {
            return (SubLObject)red_api.NIL;
        }
        final SubLObject rr = make_red_repository_struct((SubLObject)red_api.UNPROVIDED);
        _csetf_red_repository_struct_filename(rr, filename);
        return rr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 3063L)
    public static SubLObject red_repository_get_repository_object(final SubLObject rep_struct) {
        final SubLObject filename = red_repository_struct_filename(rep_struct);
        return red_lookup_repository_object_by_filename(filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 3275L)
    public static SubLObject print_red_repository_struct(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject rr = red_repository_get_repository_object(v_object);
        final SubLObject valid = red_repository_struct_valid_p(v_object);
        if (red_api.NIL == valid) {
            PrintLow.format(stream, (SubLObject)red_api.$str40$__red_repository_struct_INVALID__, rr);
            return v_object;
        }
        PrintLow.format(stream, (SubLObject)red_api.$str41$__red_repository_struct__name____, new SubLObject[] { Functions.funcall((SubLObject)red_api.$sym42$RED_GET_REPOSITORY_NAME_IMPLEMENTATION, rr), Functions.funcall((SubLObject)red_api.$sym43$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION, rr), Functions.funcall((SubLObject)red_api.$sym44$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION, rr), Functions.funcall((SubLObject)red_api.$sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION, rr), Functions.funcall((SubLObject)red_api.$sym46$RED_GET_REPOSITORY_TIME_IMPLEMENTATION, rr) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 4079L)
    public static SubLObject red_repository_struct_valid_p(final SubLObject red_rep_struct) {
        assert red_api.NIL != red_repository_struct_p(red_rep_struct) : red_rep_struct;
        final SubLObject cobj = red_repository_get_repository_object(red_rep_struct);
        if (red_api.NIL == cobj) {
            return (SubLObject)red_api.NIL;
        }
        final SubLObject retval = Functions.funcall((SubLObject)red_api.$sym47$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, red_get_object_bare(), cobj);
        if (retval.eql((SubLObject)red_api.ZERO_INTEGER)) {
            return (SubLObject)red_api.NIL;
        }
        return (SubLObject)red_api.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 4499L)
    public static SubLObject red_repository_object_valid_p(final SubLObject rep_obj) {
        if (red_api.NIL == rep_obj) {
            return (SubLObject)red_api.NIL;
        }
        if (!rep_obj.isNumber()) {
            return (SubLObject)red_api.NIL;
        }
        if (red_api.NIL == rep_obj) {
            return (SubLObject)red_api.NIL;
        }
        final SubLObject retval = Functions.funcall((SubLObject)red_api.$sym47$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, red_get_object_bare(), rep_obj);
        if (retval.eql((SubLObject)red_api.ZERO_INTEGER)) {
            return (SubLObject)red_api.NIL;
        }
        return (SubLObject)red_api.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 4853L)
    public static SubLObject red_repository_list_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_red_repository_list_struct(v_object, stream, (SubLObject)red_api.ZERO_INTEGER);
        return (SubLObject)red_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 4853L)
    public static SubLObject red_repository_list_struct_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $red_repository_list_struct_native.class) ? red_api.T : red_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 4853L)
    public static SubLObject red_repository_list_struct_type(final SubLObject v_object) {
        assert red_api.NIL != red_repository_list_struct_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 4853L)
    public static SubLObject _csetf_red_repository_list_struct_type(final SubLObject v_object, final SubLObject value) {
        assert red_api.NIL != red_repository_list_struct_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 4853L)
    public static SubLObject make_red_repository_list_struct(SubLObject arglist) {
        if (arglist == red_api.UNPROVIDED) {
            arglist = (SubLObject)red_api.NIL;
        }
        final SubLObject v_new = (SubLObject)new $red_repository_list_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)red_api.NIL, next = arglist; red_api.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)red_api.$kw59$TYPE)) {
                _csetf_red_repository_list_struct_type(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)red_api.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 4853L)
    public static SubLObject visit_defstruct_red_repository_list_struct(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw13$BEGIN, (SubLObject)red_api.$sym60$MAKE_RED_REPOSITORY_LIST_STRUCT, (SubLObject)red_api.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw15$SLOT, (SubLObject)red_api.$kw59$TYPE, red_repository_list_struct_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw16$END, (SubLObject)red_api.$sym60$MAKE_RED_REPOSITORY_LIST_STRUCT, (SubLObject)red_api.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 4853L)
    public static SubLObject visit_defstruct_object_red_repository_list_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_red_repository_list_struct(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 5002L)
    public static SubLObject red_repository_list_struct_create(final SubLObject type) {
        red_get_object();
        if (type.eql((SubLObject)red_api.$kw62$SYSTEM) || type.eql((SubLObject)red_api.$kw63$MACHINE) || type.eql((SubLObject)red_api.$kw64$MACHINE_SYSTEM) || type.eql((SubLObject)red_api.$kw65$SYSTEM_MACHINE) || type.eql((SubLObject)red_api.$kw66$APPLICATION) || type.eql((SubLObject)red_api.$kw67$MOST_PRIVILEGED) || type.eql((SubLObject)red_api.$kw68$LEAST_PRIVILEGED)) {
            final SubLObject red_repository_list = make_red_repository_list_struct((SubLObject)red_api.UNPROVIDED);
            _csetf_red_repository_list_struct_type(red_repository_list, type);
            return red_repository_list;
        }
        return (SubLObject)red_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 5672L)
    public static SubLObject print_red_repository_list_struct(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)red_api.$str69$__red_repository_list_struct_type, red_repository_list_struct_type(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 5952L)
    public static SubLObject xprint_red_repository_list_struct(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        final SubLObject red_repository_list = red_repository_list_instantiate(v_object);
        try {
            if (red_api.NIL == red_repository_list) {
                PrintLow.format(stream, (SubLObject)red_api.$str70$__red_repository_list_struct_elts);
            }
            else {
                final SubLObject num = red_get_repository_list_length(v_object);
                SubLObject index = (SubLObject)red_api.ZERO_INTEGER;
                if (num.eql((SubLObject)red_api.ZERO_INTEGER)) {
                    PrintLow.format(stream, (SubLObject)red_api.$str70$__red_repository_list_struct_elts);
                }
                else {
                    PrintLow.format(stream, (SubLObject)red_api.$str71$__red_repository_list_struct_elts, red_get_repository_list_length(v_object));
                    while (index.numL(num)) {
                        PrintLow.format(stream, (SubLObject)red_api.$str72$_s_, red_repository_object_wrap(Functions.funcall((SubLObject)red_api.$sym73$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION, red_repository_list, index)));
                        index = Numbers.add(index, (SubLObject)red_api.ONE_INTEGER);
                    }
                    PrintLow.format(stream, (SubLObject)red_api.$str74$__);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                final SubLObject _values = Values.getValuesAsVector();
                red_repository_list_dispose(red_repository_list);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 6895L)
    public static SubLObject red_element_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_red_element_struct(v_object, stream, (SubLObject)red_api.ZERO_INTEGER);
        return (SubLObject)red_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 6895L)
    public static SubLObject red_element_struct_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $red_element_struct_native.class) ? red_api.T : red_api.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 6895L)
    public static SubLObject red_element_struct_repository_list(final SubLObject v_object) {
        assert red_api.NIL != red_element_struct_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 6895L)
    public static SubLObject red_element_struct_key_string(final SubLObject v_object) {
        assert red_api.NIL != red_element_struct_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 6895L)
    public static SubLObject _csetf_red_element_struct_repository_list(final SubLObject v_object, final SubLObject value) {
        assert red_api.NIL != red_element_struct_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 6895L)
    public static SubLObject _csetf_red_element_struct_key_string(final SubLObject v_object, final SubLObject value) {
        assert red_api.NIL != red_element_struct_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 6895L)
    public static SubLObject make_red_element_struct(SubLObject arglist) {
        if (arglist == red_api.UNPROVIDED) {
            arglist = (SubLObject)red_api.NIL;
        }
        final SubLObject v_new = (SubLObject)new $red_element_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)red_api.NIL, next = arglist; red_api.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)red_api.$kw88$REPOSITORY_LIST)) {
                _csetf_red_element_struct_repository_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)red_api.$kw89$KEY_STRING)) {
                _csetf_red_element_struct_key_string(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)red_api.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 6895L)
    public static SubLObject visit_defstruct_red_element_struct(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw13$BEGIN, (SubLObject)red_api.$sym90$MAKE_RED_ELEMENT_STRUCT, (SubLObject)red_api.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw15$SLOT, (SubLObject)red_api.$kw88$REPOSITORY_LIST, red_element_struct_repository_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw15$SLOT, (SubLObject)red_api.$kw89$KEY_STRING, red_element_struct_key_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)red_api.$kw16$END, (SubLObject)red_api.$sym90$MAKE_RED_ELEMENT_STRUCT, (SubLObject)red_api.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 6895L)
    public static SubLObject visit_defstruct_object_red_element_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_red_element_struct(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 7049L)
    public static SubLObject red_element_struct_create(final SubLObject repository_list, final SubLObject key_string) {
        assert red_api.NIL != red_repository_list_struct_p(repository_list) : repository_list;
        assert red_api.NIL != Types.stringp(key_string) : key_string;
        final SubLObject rse = make_red_element_struct((SubLObject)red_api.UNPROVIDED);
        _csetf_red_element_struct_repository_list(rse, repository_list);
        _csetf_red_element_struct_key_string(rse, key_string);
        return rse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 7417L)
    public static SubLObject print_red_element_struct(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        assert red_api.NIL != red_element_struct_p(v_object) : v_object;
        final SubLObject rse = red_element_instantiate(v_object);
        try {
            if (red_api.NIL == rse) {
                PrintLow.format(stream, (SubLObject)red_api.$str92$__red_element_struct_key____s_, red_element_struct_key_string(v_object));
            }
            else {
                final SubLObject element = Functions.funcall((SubLObject)red_api.$sym93$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
                if (red_api.NIL != element) {
                    final SubLObject datatype = Functions.funcall((SubLObject)red_api.$sym94$RED_GET_DATATYPE_STRING_IMPLEMENTATION, element);
                    final SubLObject dt = red_element_get_datatype_internal(rse);
                    PrintLow.format(stream, (SubLObject)red_api.$str95$__red_element_struct_key___s_type, red_element_struct_key_string(v_object), datatype);
                    final SubLObject pcase_var = dt;
                    if (pcase_var.eql((SubLObject)red_api.$kw96$STRING)) {
                        PrintLow.format(stream, (SubLObject)red_api.$str97$value____s, Functions.funcall((SubLObject)red_api.$sym98$RED_GET_STRING_VALUE_IMPLEMENTATION, element));
                    }
                    else if (pcase_var.eql((SubLObject)red_api.$kw99$INTEGER)) {
                        PrintLow.format(stream, (SubLObject)red_api.$str100$value____d, Functions.funcall((SubLObject)red_api.$sym101$RED_GET_INT32_VALUE_IMPLEMENTATION, element));
                    }
                    else if (pcase_var.eql((SubLObject)red_api.$kw102$BLOB)) {
                        PrintLow.format(stream, (SubLObject)red_api.$str103$BlobValue____);
                        final SubLObject bval = red_implementation.red_get_blob_value_ext(element);
                        for (SubLObject numelts = Sequences.length(bval), index = (SubLObject)red_api.ZERO_INTEGER; index.numL(numelts); index = Numbers.add(index, (SubLObject)red_api.ONE_INTEGER)) {
                            SubLObject v = PrintLow.format((SubLObject)red_api.NIL, (SubLObject)red_api.$str104$_x, Vectors.aref(bval, index));
                            if (Sequences.length(v).numE((SubLObject)red_api.ONE_INTEGER)) {
                                v = Sequences.cconcatenate((SubLObject)red_api.$str105$0, v);
                            }
                            PrintLow.format(stream, (SubLObject)red_api.$str106$_a, v);
                        }
                        PrintLow.format(stream, (SubLObject)red_api.$str107$_);
                    }
                    else if (pcase_var.eql((SubLObject)red_api.$kw108$DEFAULT)) {
                        PrintLow.format(stream, (SubLObject)red_api.$str109$INVALID_DATA_TYPE);
                    }
                    PrintLow.format(stream, (SubLObject)red_api.$str110$_);
                }
                else {
                    PrintLow.format(stream, (SubLObject)red_api.$str92$__red_element_struct_key____s_, red_element_struct_key_string(v_object));
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                final SubLObject _values = Values.getValuesAsVector();
                red_element_dispose(rse);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 9200L)
    public static SubLObject red_get_repository_list_length(final SubLObject red_repository_list) {
        red_get_object();
        assert red_api.NIL != red_repository_list_struct_p(red_repository_list) : red_repository_list;
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = red_repository_list_struct_type(red_repository_list);
        if (pcase_var.eql((SubLObject)red_api.$kw62$SYSTEM)) {
            final SubLObject sysr = red_get_system_repository((SubLObject)red_api.UNPROVIDED);
            if (red_api.NIL != sysr) {
                return (SubLObject)red_api.ONE_INTEGER;
            }
            return (SubLObject)red_api.ZERO_INTEGER;
        }
        else if (pcase_var.eql((SubLObject)red_api.$kw63$MACHINE)) {
            final SubLObject machr = red_get_machine_repository((SubLObject)red_api.UNPROVIDED);
            if (red_api.NIL != machr) {
                return (SubLObject)red_api.ONE_INTEGER;
            }
            return (SubLObject)red_api.ZERO_INTEGER;
        }
        else {
            if (pcase_var.eql((SubLObject)red_api.$kw64$MACHINE_SYSTEM) || pcase_var.eql((SubLObject)red_api.$kw65$SYSTEM_MACHINE)) {
                final SubLObject machr = red_get_machine_repository((SubLObject)red_api.UNPROVIDED);
                final SubLObject sysr2 = red_get_system_repository((SubLObject)red_api.UNPROVIDED);
                SubLObject num = (SubLObject)red_api.ZERO_INTEGER;
                if (red_api.NIL != machr) {
                    num = Numbers.add(num, (SubLObject)red_api.ONE_INTEGER);
                }
                if (red_api.NIL != sysr2) {
                    num = Numbers.add(num, (SubLObject)red_api.ONE_INTEGER);
                }
                return num;
            }
            if (pcase_var.eql((SubLObject)red_api.$kw66$APPLICATION)) {
                final SubLObject red = red_get_object_bare();
                return Functions.funcall((SubLObject)red_api.$sym37$RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION, red);
            }
            if (pcase_var.eql((SubLObject)red_api.$kw67$MOST_PRIVILEGED) || pcase_var.eql((SubLObject)red_api.$kw68$LEAST_PRIVILEGED)) {
                final SubLObject red = red_get_object_bare();
                return Functions.funcall((SubLObject)red_api.$sym111$RED_NUMBER_REPOSITORIES_IMPLEMENTATION, red);
            }
            return (SubLObject)red_api.MINUS_ONE_INTEGER;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 10683L)
    public static SubLObject red_element_get_key(final SubLObject red_element_struct) {
        assert red_api.NIL != red_element_struct_p(red_element_struct) : red_element_struct;
        return red_element_struct_key_string(red_element_struct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 11014L)
    public static SubLObject red_element_get_datatype(final SubLObject red_element_struct) {
        assert red_api.NIL != red_element_struct_p(red_element_struct) : red_element_struct;
        final SubLObject rse = red_element_instantiate(red_element_struct);
        SubLObject retval = (SubLObject)red_api.NIL;
        if (red_api.NIL == rse) {
            return retval;
        }
        try {
            retval = red_element_get_datatype_internal(rse);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                final SubLObject _values = Values.getValuesAsVector();
                red_element_dispose(rse);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return retval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 11736L)
    public static SubLObject red_element_get_value(final SubLObject red_element_struct) {
        assert red_api.NIL != red_element_struct_p(red_element_struct) : red_element_struct;
        final SubLObject rse = red_element_instantiate(red_element_struct);
        SubLObject retval = (SubLObject)red_api.NIL;
        if (red_api.NIL == rse) {
            return retval;
        }
        try {
            final SubLObject rs = Functions.funcall((SubLObject)red_api.$sym93$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
            final SubLObject pcase_var;
            final SubLObject datatype = pcase_var = red_element_get_datatype_internal(rse);
            if (pcase_var.eql((SubLObject)red_api.$kw96$STRING)) {
                retval = Functions.funcall((SubLObject)red_api.$sym98$RED_GET_STRING_VALUE_IMPLEMENTATION, rs);
            }
            else if (pcase_var.eql((SubLObject)red_api.$kw99$INTEGER)) {
                retval = Functions.funcall((SubLObject)red_api.$sym101$RED_GET_INT32_VALUE_IMPLEMENTATION, rs);
            }
            else if (pcase_var.eql((SubLObject)red_api.$kw102$BLOB)) {
                retval = cfasl.cfasl_decode(red_int_vector_to_byte_vector(red_implementation.red_get_blob_value_ext(rs)));
            }
            else if (pcase_var.eql((SubLObject)red_api.$kw108$DEFAULT)) {
                retval = (SubLObject)red_api.NIL;
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                final SubLObject _values = Values.getValuesAsVector();
                red_element_dispose(rse);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return retval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 12999L)
    public static SubLObject red_element_get_value_cfasl_decode(final SubLObject red_element_struct) {
        assert red_api.NIL != red_element_struct_p(red_element_struct) : red_element_struct;
        return cfasl.cfasl_decode(red_element_get_value(red_element_struct));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 13403L)
    public static SubLObject red_get_element(final SubLObject repository_list, final SubLObject key_string) {
        assert red_api.NIL != red_repository_list_struct_p(repository_list) : repository_list;
        assert red_api.NIL != Types.stringp(key_string) : key_string;
        final SubLObject re = red_element_struct_create(repository_list, key_string);
        if (red_api.NIL != red_element_get_key_exists_p(re)) {
            return re;
        }
        return (SubLObject)red_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 13979L)
    public static SubLObject red_element_get_value_type(final SubLObject red_element_struct) {
        assert red_api.NIL != red_element_struct_p(red_element_struct) : red_element_struct;
        final SubLObject rse = red_element_instantiate(red_element_struct);
        SubLObject retval = (SubLObject)red_api.NIL;
        if (red_api.NIL == rse) {
            return retval;
        }
        try {
            final SubLObject rs = Functions.funcall((SubLObject)red_api.$sym93$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
            if (red_api.NIL != rs) {
                retval = Functions.funcall((SubLObject)red_api.$sym93$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rs);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                final SubLObject _values = Values.getValuesAsVector();
                red_element_dispose(rse);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return retval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 14492L)
    public static SubLObject red_get_element_get_sub_element_by_key(final SubLObject repository_element_struct, final SubLObject key_string) {
        assert red_api.NIL != red_element_struct_p(repository_element_struct) : repository_element_struct;
        assert red_api.NIL != Types.stringp(key_string) : key_string;
        final SubLObject parent_key = red_element_struct_key_string(repository_element_struct);
        final SubLObject repository_list = red_element_struct_repository_list(repository_element_struct);
        final SubLObject key = red_makekey(parent_key, key_string);
        return red_get_element(repository_list, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 15236L)
    public static SubLObject red_element_get_sub_elements(final SubLObject red_element_struct) {
        assert red_api.NIL != red_element_struct_p(red_element_struct) : red_element_struct;
        SubLObject parent_key = red_element_struct_key_string(red_element_struct);
        final SubLObject rep_list = red_element_struct_repository_list(red_element_struct);
        SubLObject retval = (SubLObject)red_api.NIL;
        final SubLObject rse = red_element_instantiate(red_element_struct);
        if (red_api.NIL == rse) {
            return retval;
        }
        try {
            final SubLObject rsi = Functions.funcall((SubLObject)red_api.$sym112$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION, rse);
            if (red_api.NIL != rsi) {
                try {
                    if (red_api.NIL == parent_key || red_api.ZERO_INTEGER.numE(Sequences.length(parent_key))) {
                        parent_key = (SubLObject)red_api.$str113$;
                    }
                    while (red_api.NIL != Numbers.numNE((SubLObject)red_api.ZERO_INTEGER, Functions.funcall((SubLObject)red_api.$sym114$RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION, rsi))) {
                        final SubLObject cre = Functions.funcall((SubLObject)red_api.$sym115$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION, rsi);
                        if (red_api.NIL != Numbers.numNE(cre, (SubLObject)red_api.ZERO_INTEGER)) {
                            try {
                                SubLObject child_key = Functions.funcall((SubLObject)red_api.$sym116$RED_GET_KEY_IMPLEMENTATION, Functions.funcall((SubLObject)red_api.$sym93$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, cre));
                                SubLObject new_red_element = (SubLObject)red_api.NIL;
                                child_key = red_makekey(parent_key, child_key);
                                new_red_element = red_element_struct_create(rep_list, child_key);
                                retval = (SubLObject)ConsesLow.cons(new_red_element, retval);
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    Functions.funcall((SubLObject)red_api.$sym117$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, cre);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        Functions.funcall((SubLObject)red_api.$sym118$RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION, rsi);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                final SubLObject _values3 = Values.getValuesAsVector();
                red_element_dispose(rse);
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_3);
            }
        }
        return Sequences.reverse(retval);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 16939L)
    public static SubLObject red_element_get_sub_elements_recursive(final SubLObject red_element_struct) {
        SubLObject ret_list = (SubLObject)red_api.NIL;
        final SubLObject tmp_list = red_element_get_sub_elements(red_element_struct);
        if (red_api.NIL == tmp_list) {
            return (SubLObject)red_api.NIL;
        }
        SubLObject cdolist_list_var = tmp_list;
        SubLObject elt = (SubLObject)red_api.NIL;
        elt = cdolist_list_var.first();
        while (red_api.NIL != cdolist_list_var) {
            final SubLObject subelts = red_element_get_sub_elements_recursive(elt);
            ret_list = (SubLObject)ConsesLow.cons(elt, ret_list);
            ret_list = ConsesLow.append(subelts, ret_list);
            cdolist_list_var = cdolist_list_var.rest();
            elt = cdolist_list_var.first();
        }
        return ret_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 17339L)
    public static SubLObject red_get_top_element(final SubLObject repository_struct) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        final SubLObject rep_obj = red_repository_get_repository_object(repository_struct);
        final SubLObject valid = red_repository_struct_valid_p(repository_struct);
        final SubLObject top_elt = Functions.funcall((SubLObject)red_api.$sym119$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION, rep_obj);
        if (red_api.NIL == valid) {
            return (SubLObject)red_api.NIL;
        }
        if (red_api.NIL == top_elt) {
            return (SubLObject)red_api.NIL;
        }
        return top_elt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 17767L)
    public static SubLObject red_get_all_elements_of_repository(final SubLObject repository_struct) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        final SubLObject rep_obj = red_repository_get_repository_object(repository_struct);
        final SubLObject valid = red_repository_struct_valid_p(repository_struct);
        final SubLObject top_elt = Functions.funcall((SubLObject)red_api.$sym119$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION, rep_obj);
        if (red_api.NIL == valid) {
            return (SubLObject)red_api.NIL;
        }
        if (red_api.NIL == top_elt) {
            return (SubLObject)red_api.NIL;
        }
        return red_get_repository_get_all_elements((SubLObject)red_api.$str113$, top_elt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 18251L)
    public static SubLObject red_get_repository_get_all_elements(final SubLObject prefix_string, final SubLObject red_elt) {
        final SubLObject subkey_iter = Functions.funcall((SubLObject)red_api.$sym120$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION, red_elt);
        SubLObject retval = (SubLObject)red_api.NIL;
        if (red_api.NIL == subkey_iter) {
            return (SubLObject)red_api.NIL;
        }
        while (!Functions.funcall((SubLObject)red_api.$sym121$RED_ITERATOR_HAS_NEXT_IMPLEMENTATION, subkey_iter).numE((SubLObject)red_api.ZERO_INTEGER)) {
            final SubLObject subelt = Functions.funcall((SubLObject)red_api.$sym122$RED_ITERATOR_NEXT_IMPLEMENTATION, subkey_iter);
            final SubLObject redkvt = red_get_key_value_type(prefix_string, subelt);
            retval = (SubLObject)ConsesLow.cons(redkvt, retval);
            retval = ConsesLow.append(red_get_repository_get_all_elements(redkvt.first(), subelt), retval);
        }
        Functions.funcall((SubLObject)red_api.$sym123$RED_ITERATOR_DISPOSE_IMPLEMENTATION, subkey_iter);
        return retval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 18973L)
    public static SubLObject red_get_key_value_type(final SubLObject prefix, final SubLObject red_elt) {
        final SubLObject key = red_makekey(prefix, Functions.funcall((SubLObject)red_api.$sym116$RED_GET_KEY_IMPLEMENTATION, red_elt));
        final SubLObject datatype = red_translate_datatype_string(Functions.funcall((SubLObject)red_api.$sym94$RED_GET_DATATYPE_STRING_IMPLEMENTATION, red_elt));
        SubLObject value = (SubLObject)red_api.NIL;
        final SubLObject pcase_var = datatype;
        if (pcase_var.eql((SubLObject)red_api.$kw96$STRING)) {
            value = Functions.funcall((SubLObject)red_api.$sym98$RED_GET_STRING_VALUE_IMPLEMENTATION, red_elt);
        }
        else if (pcase_var.eql((SubLObject)red_api.$kw99$INTEGER)) {
            value = Functions.funcall((SubLObject)red_api.$sym101$RED_GET_INT32_VALUE_IMPLEMENTATION, red_elt);
        }
        else if (pcase_var.eql((SubLObject)red_api.$kw102$BLOB)) {
            value = red_int_vector_to_byte_vector(red_implementation.red_get_blob_value_ext(red_elt));
        }
        else if (pcase_var.eql((SubLObject)red_api.$kw124$INVALID)) {
            return (SubLObject)red_api.NIL;
        }
        return (SubLObject)ConsesLow.list(key, value, datatype);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 19724L)
    public static SubLObject red_makekey(final SubLObject prefix, final SubLObject key) {
        if (prefix.equal((SubLObject)red_api.$str113$)) {
            return key;
        }
        return Sequences.cconcatenate(prefix, new SubLObject[] { red_api.$str125$_, key });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 19860L)
    public static SubLObject red_get_filename(final SubLObject red_repository_struct) {
        final SubLObject red_obj = red_repository_get_repository_object(red_repository_struct);
        final SubLObject valid = red_repository_struct_valid_p(red_repository_struct);
        if (red_api.NIL == valid) {
            return (SubLObject)red_api.NIL;
        }
        return red_get_filename_from_object(red_obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 20159L)
    public static SubLObject red_get_filename_from_object(final SubLObject red_obj) {
        final SubLObject filename = Functions.funcall((SubLObject)red_api.$sym126$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION, red_obj);
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 20349L)
    public static SubLObject red_get_repository_with_filename(final SubLObject filename) {
        final SubLObject repobj = red_get_repository_object_with_filename(filename);
        if (red_api.NIL == repobj) {
            return (SubLObject)red_api.NIL;
        }
        return red_repository_object_wrap(repobj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 20577L)
    public static SubLObject red_get_repository_object_with_filename(final SubLObject filename) {
        final SubLObject repobj = dictionary.dictionary_lookup(red_api.$red_filenames$.getGlobalValue(), filename, (SubLObject)red_api.UNPROVIDED);
        if (red_api.NIL == repobj) {
            return (SubLObject)red_api.NIL;
        }
        final SubLObject valid = Functions.funcall((SubLObject)red_api.$sym47$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, red_get_object_bare(), repobj);
        if (valid.eql((SubLObject)red_api.ZERO_INTEGER)) {
            return (SubLObject)red_api.NIL;
        }
        return repobj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 20943L)
    public static SubLObject red_remove_repository(final SubLObject rep_obj) {
        assert red_api.NIL != red_repository_object_valid_p(rep_obj) : rep_obj;
        final SubLObject filename = red_get_filename_from_object(rep_obj);
        Functions.funcall((SubLObject)red_api.$sym128$RED_REPOSITORY_DISPOSE_IMPLEMENTATION, rep_obj);
        dictionary.dictionary_remove(red_api.$red_filenames$.getGlobalValue(), filename);
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 21267L)
    public static SubLObject red_cond_create_repository_filenames() {
        if (red_api.NIL != red_api.$red_filenames$.getGlobalValue()) {
            return (SubLObject)red_api.NIL;
        }
        red_api.$red_filenames$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)red_api.EQUAL), (SubLObject)red_api.UNPROVIDED));
        final SubLObject repository_list = red_repository_list_struct_create((SubLObject)red_api.$kw68$LEAST_PRIVILEGED);
        final SubLObject rep_list = red_repository_list_instantiate(repository_list);
        try {
            final SubLObject num = red_get_repository_list_length(repository_list);
            SubLObject index = (SubLObject)red_api.ZERO_INTEGER;
            if (!num.eql((SubLObject)red_api.ZERO_INTEGER)) {
                while (index.numL(num)) {
                    final SubLObject cobj = Functions.funcall((SubLObject)red_api.$sym73$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION, rep_list, index);
                    final SubLObject filename = Functions.funcall((SubLObject)red_api.$sym126$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION, cobj);
                    dictionary.dictionary_enter(red_api.$red_filenames$.getGlobalValue(), filename, cobj);
                    index = Numbers.add(index, (SubLObject)red_api.ONE_INTEGER);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                final SubLObject _values = Values.getValuesAsVector();
                red_repository_list_dispose(rep_list);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)red_api.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 22136L)
    public static SubLObject red_get_system_repository(SubLObject red) {
        if (red == red_api.UNPROVIDED) {
            red = red_get_object();
        }
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        assert red_api.NIL != red_struct_p(red) : red;
        final SubLObject redobj = red_struct_cobj(red);
        final SubLObject repository = Functions.funcall((SubLObject)red_api.$sym129$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION, redobj);
        if (red_api.NIL == repository) {
            return (SubLObject)red_api.NIL;
        }
        return red_repository_object_wrap(repository);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 22917L)
    public static SubLObject red_get_machine_repository(SubLObject red) {
        if (red == red_api.UNPROVIDED) {
            red = red_get_object();
        }
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        assert red_api.NIL != red_struct_p(red) : red;
        final SubLObject red_obj = red_struct_cobj(red);
        final SubLObject repository = Functions.funcall((SubLObject)red_api.$sym130$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION, red_obj);
        if (red_api.NIL == repository) {
            return (SubLObject)red_api.NIL;
        }
        return red_repository_object_wrap(repository);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 23534L)
    public static SubLObject red_load_repository(final SubLObject filename) {
        red_get_object();
        return red_repository_struct_create(filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 23891L)
    public static SubLObject red_reload_repository_simple(final SubLObject filename) {
        final SubLObject cobj = red_lookup_repository_object_by_filename(filename);
        if (red_api.NIL != cobj) {
            red_remove_repository(cobj);
        }
        return red_load_repository(filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 24347L)
    public static SubLObject red_lookup_repository_struct_by_filename(final SubLObject filename) {
        if (red_api.NIL == filename) {
            return (SubLObject)red_api.NIL;
        }
        final SubLObject rep_obj = red_lookup_repository_object_by_filename(filename);
        if (red_api.NIL == rep_obj) {
            return (SubLObject)red_api.NIL;
        }
        return red_repository_struct_create(filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 24603L)
    public static SubLObject red_lookup_repository_object_by_filename(final SubLObject filename) {
        if (red_api.NIL == filename) {
            return (SubLObject)red_api.NIL;
        }
        return dictionary.dictionary_lookup(red_api.$red_filenames$.getGlobalValue(), filename, (SubLObject)red_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 24757L)
    public static SubLObject red_lookup_or_load_repository_object_by_filename(final SubLObject filename) {
        if (red_api.NIL == filename) {
            return (SubLObject)red_api.NIL;
        }
        final SubLObject cobj = red_lookup_repository_object_by_filename(filename);
        if (red_api.NIL != cobj) {
            return cobj;
        }
        return red_load_repository_object(filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 25010L)
    public static SubLObject red_load_repository_object(final SubLObject filename) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        final SubLObject red = red_get_object_bare();
        final SubLObject rr = Functions.funcall((SubLObject)red_api.$sym131$RED_LOAD_REPOSITORY_IMPLEMENTATION, red, filename);
        if (red_api.NIL == rr) {
            return (SubLObject)red_api.NIL;
        }
        dictionary.dictionary_enter(red_api.$red_filenames$.getGlobalValue(), filename, rr);
        return rr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 25575L)
    public static SubLObject red_get_object() {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        if (red_api.NIL == red_api.$red_api_object$.getGlobalValue()) {
            red_api.$red_api_object$.setGlobalValue(red_struct_create());
        }
        return red_api.$red_api_object$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 25987L)
    public static SubLObject red_get_object_bare() {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        if (red_api.NIL == red_api.$red_api_object$.getGlobalValue()) {
            red_api.$red_api_object$.setGlobalValue(red_struct_create());
        }
        return red_struct_cobj(red_api.$red_api_object$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 26267L)
    public static SubLObject red_dispose_object() {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        if (red_api.NIL != red_api.$red_api_object$.getGlobalValue()) {
            final SubLObject red = red_struct_cobj(red_api.$red_api_object$.getGlobalValue());
            Functions.funcall((SubLObject)red_api.$sym132$RED_DISPOSE_IMPLEMENTATION, red);
            red_api.$red_api_object$.setGlobalValue((SubLObject)red_api.NIL);
        }
        return (SubLObject)red_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 26587L)
    public static SubLObject red_element_get_key_exists_p(final SubLObject red_element_struct) {
        assert red_api.NIL != red_element_struct_p(red_element_struct) : red_element_struct;
        final SubLObject rse = red_element_instantiate(red_element_struct);
        if (red_api.NIL == rse) {
            return (SubLObject)red_api.NIL;
        }
        red_element_dispose(rse);
        return (SubLObject)red_api.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 26842L)
    public static SubLObject red_element_get_datatype_internal(final SubLObject rse) {
        if (red_api.NIL == rse) {
            return (SubLObject)red_api.$kw124$INVALID;
        }
        final SubLObject rs = Functions.funcall((SubLObject)red_api.$sym93$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
        if (red_api.NIL != rs) {
            final SubLObject datatype = Functions.funcall((SubLObject)red_api.$sym94$RED_GET_DATATYPE_STRING_IMPLEMENTATION, rs);
            return red_translate_datatype_string(datatype);
        }
        return (SubLObject)red_api.$kw124$INVALID;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 27196L)
    public static SubLObject red_translate_datatype_string(final SubLObject datatype) {
        if (datatype.equal((SubLObject)red_api.$str133$string)) {
            return (SubLObject)red_api.$kw96$STRING;
        }
        if (datatype.equal((SubLObject)red_api.$str134$integer)) {
            return (SubLObject)red_api.$kw99$INTEGER;
        }
        if (datatype.equal((SubLObject)red_api.$str135$blob)) {
            return (SubLObject)red_api.$kw102$BLOB;
        }
        return (SubLObject)red_api.$kw124$INVALID;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 27447L)
    public static SubLObject red_repository_list_instantiate(final SubLObject red_repository_list) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_api.$kw32$RED_SHARED, (SubLObject)red_api.UNPROVIDED);
        if (red_api.NIL == red_repository_list) {
            return (SubLObject)red_api.NIL;
        }
        assert red_api.NIL != red_repository_list_struct_p(red_repository_list) : red_repository_list;
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = red_repository_list_struct_type(red_repository_list);
        if (pcase_var.eql((SubLObject)red_api.$kw62$SYSTEM)) {
            final SubLObject sysr = red_get_system_repository((SubLObject)red_api.UNPROVIDED);
            if (red_api.NIL == sysr || red_api.NIL == red_repository_struct_valid_p(sysr)) {
                return (SubLObject)red_api.NIL;
            }
            final SubLObject rep_obj = red_repository_get_repository_object(sysr);
            final SubLObject red_repository_list_$1 = Functions.funcall((SubLObject)red_api.$sym136$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION, rep_obj);
            if (red_api.NIL == red_repository_list_$1 || red_api.NIL == red_repository_list_$1) {
                return (SubLObject)red_api.NIL;
            }
            return red_repository_list_$1;
        }
        else if (pcase_var.eql((SubLObject)red_api.$kw63$MACHINE)) {
            final SubLObject machr = red_get_machine_repository((SubLObject)red_api.UNPROVIDED);
            if (red_api.NIL == machr || red_api.NIL == red_repository_struct_valid_p(machr)) {
                return (SubLObject)red_api.NIL;
            }
            final SubLObject rep_obj = red_repository_get_repository_object(machr);
            final SubLObject red_repository_list_$2 = Functions.funcall((SubLObject)red_api.$sym136$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION, rep_obj);
            if (red_api.NIL == red_repository_list_$2 || red_api.NIL == red_repository_list_$2) {
                return (SubLObject)red_api.NIL;
            }
            return red_repository_list_$2;
        }
        else if (pcase_var.eql((SubLObject)red_api.$kw64$MACHINE_SYSTEM)) {
            final SubLObject rd = red_get_object();
            final SubLObject red = red_struct_cobj(rd);
            final SubLObject machr2 = red_get_machine_repository((SubLObject)red_api.UNPROVIDED);
            final SubLObject sysr2 = red_get_system_repository((SubLObject)red_api.UNPROVIDED);
            SubLObject num = (SubLObject)red_api.ZERO_INTEGER;
            if (red_api.NIL != machr2 && red_api.NIL != red_repository_struct_valid_p(machr2)) {
                num = Numbers.add(num, (SubLObject)red_api.ONE_INTEGER);
            }
            if (red_api.NIL != sysr2 && red_api.NIL != red_repository_struct_valid_p(sysr2)) {
                num = Numbers.add(num, (SubLObject)red_api.ONE_INTEGER);
            }
            if (num.eql((SubLObject)red_api.ZERO_INTEGER)) {
                return (SubLObject)red_api.NIL;
            }
            final SubLObject red_repository_list_$3 = Functions.funcall((SubLObject)red_api.$sym137$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION, red, num);
            if (red_api.NIL == red_repository_list_$3 || red_api.NIL == red_repository_list_$3) {
                return (SubLObject)red_api.NIL;
            }
            if (red_api.NIL != machr2 && red_api.NIL != red_repository_struct_valid_p(machr2)) {
                final SubLObject rep_obj2 = red_repository_get_repository_object(machr2);
                Functions.funcall((SubLObject)red_api.$sym138$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_$3, rep_obj2);
            }
            if (red_api.NIL != sysr2 && red_api.NIL != red_repository_struct_valid_p(sysr2)) {
                final SubLObject rep_obj2 = red_repository_get_repository_object(sysr2);
                Functions.funcall((SubLObject)red_api.$sym138$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_$3, rep_obj2);
            }
            return red_repository_list_$3;
        }
        else if (pcase_var.eql((SubLObject)red_api.$kw65$SYSTEM_MACHINE)) {
            final SubLObject rd = red_get_object();
            final SubLObject red = red_struct_cobj(rd);
            final SubLObject machr2 = red_get_machine_repository((SubLObject)red_api.UNPROVIDED);
            final SubLObject sysr2 = red_get_system_repository((SubLObject)red_api.UNPROVIDED);
            SubLObject num = (SubLObject)red_api.ZERO_INTEGER;
            if (red_api.NIL != machr2 && red_api.NIL != red_repository_struct_valid_p(machr2)) {
                num = Numbers.add(num, (SubLObject)red_api.ONE_INTEGER);
            }
            if (red_api.NIL != sysr2 && red_api.NIL != red_repository_struct_valid_p(sysr2)) {
                num = Numbers.add(num, (SubLObject)red_api.ONE_INTEGER);
            }
            if (num.eql((SubLObject)red_api.ZERO_INTEGER)) {
                return (SubLObject)red_api.NIL;
            }
            final SubLObject red_repository_list_$4 = Functions.funcall((SubLObject)red_api.$sym137$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION, red, num);
            if (red_api.NIL == red_repository_list_$4 || red_api.NIL == red_repository_list_$4) {
                return (SubLObject)red_api.NIL;
            }
            if (red_api.NIL != sysr2 && red_api.NIL != red_repository_struct_valid_p(sysr2)) {
                final SubLObject rep_obj2 = red_repository_get_repository_object(sysr2);
                Functions.funcall((SubLObject)red_api.$sym138$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_$4, rep_obj2);
            }
            if (red_api.NIL != machr2 && red_api.NIL != red_repository_struct_valid_p(machr2)) {
                final SubLObject rep_obj2 = red_repository_get_repository_object(machr2);
                Functions.funcall((SubLObject)red_api.$sym138$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_$4, rep_obj2);
            }
            return red_repository_list_$4;
        }
        else if (pcase_var.eql((SubLObject)red_api.$kw66$APPLICATION)) {
            final SubLObject red2 = red_get_object_bare();
            final SubLObject red_repository_list_$5 = Functions.funcall((SubLObject)red_api.$sym139$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION, red2);
            if (red_api.NIL == red_repository_list_$5 || red_api.NIL == red_repository_list_$5) {
                return (SubLObject)red_api.NIL;
            }
            return red_repository_list_$5;
        }
        else if (pcase_var.eql((SubLObject)red_api.$kw67$MOST_PRIVILEGED)) {
            final SubLObject red2 = red_get_object_bare();
            final SubLObject red_repository_list_$6 = Functions.funcall((SubLObject)red_api.$sym140$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION, red2);
            if (red_api.NIL == red_repository_list_$6 || red_api.NIL == red_repository_list_$6) {
                return (SubLObject)red_api.NIL;
            }
            return red_repository_list_$6;
        }
        else {
            if (!pcase_var.eql((SubLObject)red_api.$kw68$LEAST_PRIVILEGED)) {
                return (SubLObject)red_api.NIL;
            }
            final SubLObject red2 = red_get_object_bare();
            final SubLObject red_repository_list_$7 = Functions.funcall((SubLObject)red_api.$sym141$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION, red2);
            if (red_api.NIL == red_repository_list_$7 || red_api.NIL == red_repository_list_$7) {
                return (SubLObject)red_api.NIL;
            }
            return red_repository_list_$7;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 31772L)
    public static SubLObject red_repository_list_dispose(final SubLObject red_repository_list) {
        if (red_api.NIL == red_repository_list || red_api.NIL == red_repository_list) {
            return (SubLObject)red_api.NIL;
        }
        Functions.funcall((SubLObject)red_api.$sym142$RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION, red_repository_list);
        return (SubLObject)red_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 32008L)
    public static SubLObject red_element_instantiate(final SubLObject red_element_struct) {
        assert red_api.NIL != red_element_struct_p(red_element_struct) : red_element_struct;
        final SubLObject key = red_element_struct_key_string(red_element_struct);
        final SubLObject red_repository_list_struct = red_element_struct_repository_list(red_element_struct);
        SubLObject retkey = (SubLObject)red_api.NIL;
        assert red_api.NIL != red_repository_list_struct_p(red_repository_list_struct) : red_repository_list_struct;
        assert red_api.NIL != Types.stringp(key) : key;
        final SubLObject red_repository_list = red_repository_list_instantiate(red_repository_list_struct);
        SubLObject flag = (SubLObject)red_api.NIL;
        if (red_api.NIL == red_repository_list || red_api.NIL == red_repository_list) {
            return retkey;
        }
        try {
            final SubLObject topkey = Functions.funcall((SubLObject)red_api.$sym143$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION, red_repository_list);
            if (red_api.NIL != topkey) {
                if (red_api.NIL != key && red_api.NIL != Numbers.numNE(Sequences.length(key), (SubLObject)red_api.ZERO_INTEGER)) {
                    try {
                        retkey = Functions.funcall((SubLObject)red_api.$sym144$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION, topkey, key);
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            Functions.funcall((SubLObject)red_api.$sym117$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, topkey);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                else {
                    retkey = topkey;
                }
            }
            flag = (SubLObject)red_api.T;
        }
        finally {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)red_api.T);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (red_api.NIL == flag) {
                    red_repository_list_dispose(red_repository_list);
                    retkey = (SubLObject)red_api.NIL;
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return retkey;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 33199L)
    public static SubLObject red_element_dispose(final SubLObject red_element) {
        if (red_api.NIL == red_element) {
            return (SubLObject)red_api.NIL;
        }
        final SubLObject red_repository_list = Functions.funcall((SubLObject)red_api.$sym145$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION, red_element);
        red_repository_list_dispose(red_repository_list);
        Functions.funcall((SubLObject)red_api.$sym117$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, red_element);
        return (SubLObject)red_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-api.lisp", position = 33555L)
    public static SubLObject red_int_vector_to_byte_vector(final SubLObject int_vector) {
        final SubLObject int_vector_length = Sequences.length(int_vector);
        final SubLObject byte_vector = Vectors.make_vector(int_vector_length, (SubLObject)red_api.ZERO_INTEGER);
        SubLObject i;
        for (i = (SubLObject)red_api.NIL, i = (SubLObject)red_api.ZERO_INTEGER; i.numL(int_vector_length); i = Numbers.add(i, (SubLObject)red_api.ONE_INTEGER)) {
            Vectors.set_aref(byte_vector, i, Vectors.aref(int_vector, i));
        }
        return byte_vector;
    }
    
    public static SubLObject declare_red_api_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_struct_print_function_trampoline", "RED-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_struct_p", "RED-STRUCT-P", 1, 0, false);
        new $red_struct_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_struct_cobj", "RED-STRUCT-COBJ", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "_csetf_red_struct_cobj", "_CSETF-RED-STRUCT-COBJ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "make_red_struct", "MAKE-RED-STRUCT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "visit_defstruct_red_struct", "VISIT-DEFSTRUCT-RED-STRUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "visit_defstruct_object_red_struct_method", "VISIT-DEFSTRUCT-OBJECT-RED-STRUCT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_struct_print_function_trampoline", "RED-REPOSITORY-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_struct_p", "RED-REPOSITORY-STRUCT-P", 1, 0, false);
        new $red_repository_struct_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_struct_filename", "RED-REPOSITORY-STRUCT-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "_csetf_red_repository_struct_filename", "_CSETF-RED-REPOSITORY-STRUCT-FILENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "make_red_repository_struct", "MAKE-RED-REPOSITORY-STRUCT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "visit_defstruct_red_repository_struct", "VISIT-DEFSTRUCT-RED-REPOSITORY-STRUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "visit_defstruct_object_red_repository_struct_method", "VISIT-DEFSTRUCT-OBJECT-RED-REPOSITORY-STRUCT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_struct_create", "RED-STRUCT-CREATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "print_red_struct", "PRINT-RED-STRUCT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_struct_create", "RED-REPOSITORY-STRUCT-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_object_wrap", "RED-REPOSITORY-OBJECT-WRAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_get_repository_object", "RED-REPOSITORY-GET-REPOSITORY-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "print_red_repository_struct", "PRINT-RED-REPOSITORY-STRUCT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_struct_valid_p", "RED-REPOSITORY-STRUCT-VALID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_object_valid_p", "RED-REPOSITORY-OBJECT-VALID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_list_struct_print_function_trampoline", "RED-REPOSITORY-LIST-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_list_struct_p", "RED-REPOSITORY-LIST-STRUCT-P", 1, 0, false);
        new $red_repository_list_struct_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_list_struct_type", "RED-REPOSITORY-LIST-STRUCT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "_csetf_red_repository_list_struct_type", "_CSETF-RED-REPOSITORY-LIST-STRUCT-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "make_red_repository_list_struct", "MAKE-RED-REPOSITORY-LIST-STRUCT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "visit_defstruct_red_repository_list_struct", "VISIT-DEFSTRUCT-RED-REPOSITORY-LIST-STRUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "visit_defstruct_object_red_repository_list_struct_method", "VISIT-DEFSTRUCT-OBJECT-RED-REPOSITORY-LIST-STRUCT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_list_struct_create", "RED-REPOSITORY-LIST-STRUCT-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "print_red_repository_list_struct", "PRINT-RED-REPOSITORY-LIST-STRUCT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "xprint_red_repository_list_struct", "XPRINT-RED-REPOSITORY-LIST-STRUCT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_struct_print_function_trampoline", "RED-ELEMENT-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_struct_p", "RED-ELEMENT-STRUCT-P", 1, 0, false);
        new $red_element_struct_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_struct_repository_list", "RED-ELEMENT-STRUCT-REPOSITORY-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_struct_key_string", "RED-ELEMENT-STRUCT-KEY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "_csetf_red_element_struct_repository_list", "_CSETF-RED-ELEMENT-STRUCT-REPOSITORY-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "_csetf_red_element_struct_key_string", "_CSETF-RED-ELEMENT-STRUCT-KEY-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "make_red_element_struct", "MAKE-RED-ELEMENT-STRUCT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "visit_defstruct_red_element_struct", "VISIT-DEFSTRUCT-RED-ELEMENT-STRUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "visit_defstruct_object_red_element_struct_method", "VISIT-DEFSTRUCT-OBJECT-RED-ELEMENT-STRUCT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_struct_create", "RED-ELEMENT-STRUCT-CREATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "print_red_element_struct", "PRINT-RED-ELEMENT-STRUCT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_repository_list_length", "RED-GET-REPOSITORY-LIST-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_get_key", "RED-ELEMENT-GET-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_get_datatype", "RED-ELEMENT-GET-DATATYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_get_value", "RED-ELEMENT-GET-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_get_value_cfasl_decode", "RED-ELEMENT-GET-VALUE-CFASL-DECODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_element", "RED-GET-ELEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_get_value_type", "RED-ELEMENT-GET-VALUE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_element_get_sub_element_by_key", "RED-GET-ELEMENT-GET-SUB-ELEMENT-BY-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_get_sub_elements", "RED-ELEMENT-GET-SUB-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_get_sub_elements_recursive", "RED-ELEMENT-GET-SUB-ELEMENTS-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_top_element", "RED-GET-TOP-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_all_elements_of_repository", "RED-GET-ALL-ELEMENTS-OF-REPOSITORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_repository_get_all_elements", "RED-GET-REPOSITORY-GET-ALL-ELEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_key_value_type", "RED-GET-KEY-VALUE-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_makekey", "RED-MAKEKEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_filename", "RED-GET-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_filename_from_object", "RED-GET-FILENAME-FROM-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_repository_with_filename", "RED-GET-REPOSITORY-WITH-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_repository_object_with_filename", "RED-GET-REPOSITORY-OBJECT-WITH-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_remove_repository", "RED-REMOVE-REPOSITORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_cond_create_repository_filenames", "RED-COND-CREATE-REPOSITORY-FILENAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_system_repository", "RED-GET-SYSTEM-REPOSITORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_machine_repository", "RED-GET-MACHINE-REPOSITORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_load_repository", "RED-LOAD-REPOSITORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_reload_repository_simple", "RED-RELOAD-REPOSITORY-SIMPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_lookup_repository_struct_by_filename", "RED-LOOKUP-REPOSITORY-STRUCT-BY-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_lookup_repository_object_by_filename", "RED-LOOKUP-REPOSITORY-OBJECT-BY-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_lookup_or_load_repository_object_by_filename", "RED-LOOKUP-OR-LOAD-REPOSITORY-OBJECT-BY-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_load_repository_object", "RED-LOAD-REPOSITORY-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_object", "RED-GET-OBJECT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_get_object_bare", "RED-GET-OBJECT-BARE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_dispose_object", "RED-DISPOSE-OBJECT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_get_key_exists_p", "RED-ELEMENT-GET-KEY-EXISTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_get_datatype_internal", "RED-ELEMENT-GET-DATATYPE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_translate_datatype_string", "RED-TRANSLATE-DATATYPE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_list_instantiate", "RED-REPOSITORY-LIST-INSTANTIATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_repository_list_dispose", "RED-REPOSITORY-LIST-DISPOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_instantiate", "RED-ELEMENT-INSTANTIATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_element_dispose", "RED-ELEMENT-DISPOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_api", "red_int_vector_to_byte_vector", "RED-INT-VECTOR-TO-BYTE-VECTOR", 1, 0, false);
        return (SubLObject)red_api.NIL;
    }
    
    public static SubLObject init_red_api_file() {
        red_api.$red_api_object$ = SubLFiles.deflexical("*RED-API-OBJECT*", (SubLObject)red_api.NIL);
        red_api.$red_filenames$ = SubLFiles.deflexical("*RED-FILENAMES*", (SubLObject)red_api.NIL);
        red_api.$dtp_red_struct$ = SubLFiles.defconstant("*DTP-RED-STRUCT*", (SubLObject)red_api.$sym0$RED_STRUCT);
        red_api.$dtp_red_repository_struct$ = SubLFiles.defconstant("*DTP-RED-REPOSITORY-STRUCT*", (SubLObject)red_api.$sym18$RED_REPOSITORY_STRUCT);
        red_api.$dtp_red_repository_list_struct$ = SubLFiles.defconstant("*DTP-RED-REPOSITORY-LIST-STRUCT*", (SubLObject)red_api.$sym48$RED_REPOSITORY_LIST_STRUCT);
        red_api.$dtp_red_element_struct$ = SubLFiles.defconstant("*DTP-RED-ELEMENT-STRUCT*", (SubLObject)red_api.$sym75$RED_ELEMENT_STRUCT);
        return (SubLObject)red_api.NIL;
    }
    
    public static SubLObject setup_red_api_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), red_api.$dtp_red_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)red_api.$sym7$RED_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)red_api.$list8);
        Structures.def_csetf((SubLObject)red_api.$sym9$RED_STRUCT_COBJ, (SubLObject)red_api.$sym10$_CSETF_RED_STRUCT_COBJ);
        Equality.identity((SubLObject)red_api.$sym0$RED_STRUCT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), red_api.$dtp_red_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)red_api.$sym17$VISIT_DEFSTRUCT_OBJECT_RED_STRUCT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), red_api.$dtp_red_repository_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)red_api.$sym25$RED_REPOSITORY_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)red_api.$list26);
        Structures.def_csetf((SubLObject)red_api.$sym27$RED_REPOSITORY_STRUCT_FILENAME, (SubLObject)red_api.$sym28$_CSETF_RED_REPOSITORY_STRUCT_FILENAME);
        Equality.identity((SubLObject)red_api.$sym18$RED_REPOSITORY_STRUCT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), red_api.$dtp_red_repository_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)red_api.$sym31$VISIT_DEFSTRUCT_OBJECT_RED_REPOSITORY_STRUCT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), red_api.$dtp_red_repository_list_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)red_api.$sym55$RED_REPOSITORY_LIST_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)red_api.$list56);
        Structures.def_csetf((SubLObject)red_api.$sym57$RED_REPOSITORY_LIST_STRUCT_TYPE, (SubLObject)red_api.$sym58$_CSETF_RED_REPOSITORY_LIST_STRUCT_TYPE);
        Equality.identity((SubLObject)red_api.$sym48$RED_REPOSITORY_LIST_STRUCT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), red_api.$dtp_red_repository_list_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)red_api.$sym61$VISIT_DEFSTRUCT_OBJECT_RED_REPOSITORY_LIST_STRUCT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), red_api.$dtp_red_element_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)red_api.$sym82$RED_ELEMENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)red_api.$list83);
        Structures.def_csetf((SubLObject)red_api.$sym84$RED_ELEMENT_STRUCT_REPOSITORY_LIST, (SubLObject)red_api.$sym85$_CSETF_RED_ELEMENT_STRUCT_REPOSITORY_LIST);
        Structures.def_csetf((SubLObject)red_api.$sym86$RED_ELEMENT_STRUCT_KEY_STRING, (SubLObject)red_api.$sym87$_CSETF_RED_ELEMENT_STRUCT_KEY_STRING);
        Equality.identity((SubLObject)red_api.$sym75$RED_ELEMENT_STRUCT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), red_api.$dtp_red_element_struct$.getGlobalValue(), Symbols.symbol_function((SubLObject)red_api.$sym91$VISIT_DEFSTRUCT_OBJECT_RED_ELEMENT_STRUCT_METHOD));
        return (SubLObject)red_api.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_red_api_file();
    }
    
    @Override
	public void initializeVariables() {
        init_red_api_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_red_api_file();
    }
    
    static {
        me = (SubLFile)new red_api();
        red_api.$red_api_object$ = null;
        red_api.$red_filenames$ = null;
        red_api.$dtp_red_struct$ = null;
        red_api.$dtp_red_repository_struct$ = null;
        red_api.$dtp_red_repository_list_struct$ = null;
        red_api.$dtp_red_element_struct$ = null;
        $sym0$RED_STRUCT = SubLObjectFactory.makeSymbol("RED-STRUCT");
        $sym1$RED_STRUCT_P = SubLObjectFactory.makeSymbol("RED-STRUCT-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COBJ"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COBJ"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-STRUCT-COBJ"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RED-STRUCT-COBJ"));
        $sym6$PRINT_RED_STRUCT = SubLObjectFactory.makeSymbol("PRINT-RED-STRUCT");
        $sym7$RED_STRUCT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RED-STRUCT-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RED-STRUCT-P"));
        $sym9$RED_STRUCT_COBJ = SubLObjectFactory.makeSymbol("RED-STRUCT-COBJ");
        $sym10$_CSETF_RED_STRUCT_COBJ = SubLObjectFactory.makeSymbol("_CSETF-RED-STRUCT-COBJ");
        $kw11$COBJ = SubLObjectFactory.makeKeyword("COBJ");
        $str12$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw13$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym14$MAKE_RED_STRUCT = SubLObjectFactory.makeSymbol("MAKE-RED-STRUCT");
        $kw15$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw16$END = SubLObjectFactory.makeKeyword("END");
        $sym17$VISIT_DEFSTRUCT_OBJECT_RED_STRUCT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RED-STRUCT-METHOD");
        $sym18$RED_REPOSITORY_STRUCT = SubLObjectFactory.makeSymbol("RED-REPOSITORY-STRUCT");
        $sym19$RED_REPOSITORY_STRUCT_P = SubLObjectFactory.makeSymbol("RED-REPOSITORY-STRUCT-P");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILENAME"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-REPOSITORY-STRUCT-FILENAME"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RED-REPOSITORY-STRUCT-FILENAME"));
        $sym24$PRINT_RED_REPOSITORY_STRUCT = SubLObjectFactory.makeSymbol("PRINT-RED-REPOSITORY-STRUCT");
        $sym25$RED_REPOSITORY_STRUCT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RED-REPOSITORY-STRUCT-PRINT-FUNCTION-TRAMPOLINE");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RED-REPOSITORY-STRUCT-P"));
        $sym27$RED_REPOSITORY_STRUCT_FILENAME = SubLObjectFactory.makeSymbol("RED-REPOSITORY-STRUCT-FILENAME");
        $sym28$_CSETF_RED_REPOSITORY_STRUCT_FILENAME = SubLObjectFactory.makeSymbol("_CSETF-RED-REPOSITORY-STRUCT-FILENAME");
        $kw29$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
        $sym30$MAKE_RED_REPOSITORY_STRUCT = SubLObjectFactory.makeSymbol("MAKE-RED-REPOSITORY-STRUCT");
        $sym31$VISIT_DEFSTRUCT_OBJECT_RED_REPOSITORY_STRUCT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RED-REPOSITORY-STRUCT-METHOD");
        $kw32$RED_SHARED = SubLObjectFactory.makeKeyword("RED-SHARED");
        $str33$__red_struct_obj___s__version____ = SubLObjectFactory.makeString("#<red-struct obj: ~s  version = ~s  date= ~s  time = ~s  number-application-repositories ~s  system-repository = ~s machine-repository=~s >");
        $sym34$RED_GET_VERSION_STRING_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-VERSION-STRING-IMPLEMENTATION");
        $sym35$RED_GET_DATE_STRING_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-DATE-STRING-IMPLEMENTATION");
        $sym36$RED_GET_TIME_STRING_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-TIME-STRING-IMPLEMENTATION");
        $sym37$RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-NUMBER-APPLICATION-REPOSITORIES-IMPLEMENTATION");
        $str38$__red_struct_cobj__nil_ = SubLObjectFactory.makeString("#<red-struct cobj: nil>");
        $sym39$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str40$__red_repository_struct_INVALID__ = SubLObjectFactory.makeString("#<red-repository-struct INVALID  ~s>");
        $str41$__red_repository_struct__name____ = SubLObjectFactory.makeString("#<red-repository-struct  name = ~s type = ~s version = ~s date = ~s time = ~s >");
        $sym42$RED_GET_REPOSITORY_NAME_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-NAME-IMPLEMENTATION");
        $sym43$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-TYPE-STRING-IMPLEMENTATION");
        $sym44$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-VERSION-STRING-IMPLEMENTATION");
        $sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-DATE-IMPLEMENTATION");
        $sym46$RED_GET_REPOSITORY_TIME_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-TIME-IMPLEMENTATION");
        $sym47$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-POINTER-VALID-IMPLEMENTATION");
        $sym48$RED_REPOSITORY_LIST_STRUCT = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-STRUCT");
        $sym49$RED_REPOSITORY_LIST_STRUCT_P = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-STRUCT-P");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-STRUCT-TYPE"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RED-REPOSITORY-LIST-STRUCT-TYPE"));
        $sym54$PRINT_RED_REPOSITORY_LIST_STRUCT = SubLObjectFactory.makeSymbol("PRINT-RED-REPOSITORY-LIST-STRUCT");
        $sym55$RED_REPOSITORY_LIST_STRUCT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-STRUCT-PRINT-FUNCTION-TRAMPOLINE");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-STRUCT-P"));
        $sym57$RED_REPOSITORY_LIST_STRUCT_TYPE = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-STRUCT-TYPE");
        $sym58$_CSETF_RED_REPOSITORY_LIST_STRUCT_TYPE = SubLObjectFactory.makeSymbol("_CSETF-RED-REPOSITORY-LIST-STRUCT-TYPE");
        $kw59$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $sym60$MAKE_RED_REPOSITORY_LIST_STRUCT = SubLObjectFactory.makeSymbol("MAKE-RED-REPOSITORY-LIST-STRUCT");
        $sym61$VISIT_DEFSTRUCT_OBJECT_RED_REPOSITORY_LIST_STRUCT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RED-REPOSITORY-LIST-STRUCT-METHOD");
        $kw62$SYSTEM = SubLObjectFactory.makeKeyword("SYSTEM");
        $kw63$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw64$MACHINE_SYSTEM = SubLObjectFactory.makeKeyword("MACHINE-SYSTEM");
        $kw65$SYSTEM_MACHINE = SubLObjectFactory.makeKeyword("SYSTEM-MACHINE");
        $kw66$APPLICATION = SubLObjectFactory.makeKeyword("APPLICATION");
        $kw67$MOST_PRIVILEGED = SubLObjectFactory.makeKeyword("MOST-PRIVILEGED");
        $kw68$LEAST_PRIVILEGED = SubLObjectFactory.makeKeyword("LEAST-PRIVILEGED");
        $str69$__red_repository_list_struct_type = SubLObjectFactory.makeString("#<red-repository-list-struct type = ~s>");
        $str70$__red_repository_list_struct_elts = SubLObjectFactory.makeString("#<red-repository-list-struct elts = 0 ()>");
        $str71$__red_repository_list_struct_elts = SubLObjectFactory.makeString("#<red-repository-list-struct elts = ~d ( ");
        $str72$_s_ = SubLObjectFactory.makeString("~s ");
        $sym73$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-GET-ELEMENT-IMPLEMENTATION");
        $str74$__ = SubLObjectFactory.makeString(")>");
        $sym75$RED_ELEMENT_STRUCT = SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT");
        $sym76$RED_ELEMENT_STRUCT_P = SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT-P");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPOSITORY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-STRING"));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REPOSITORY-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("KEY-STRING"));
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT-REPOSITORY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT-KEY-STRING"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RED-ELEMENT-STRUCT-REPOSITORY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RED-ELEMENT-STRUCT-KEY-STRING"));
        $sym81$PRINT_RED_ELEMENT_STRUCT = SubLObjectFactory.makeSymbol("PRINT-RED-ELEMENT-STRUCT");
        $sym82$RED_ELEMENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT-PRINT-FUNCTION-TRAMPOLINE");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT-P"));
        $sym84$RED_ELEMENT_STRUCT_REPOSITORY_LIST = SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT-REPOSITORY-LIST");
        $sym85$_CSETF_RED_ELEMENT_STRUCT_REPOSITORY_LIST = SubLObjectFactory.makeSymbol("_CSETF-RED-ELEMENT-STRUCT-REPOSITORY-LIST");
        $sym86$RED_ELEMENT_STRUCT_KEY_STRING = SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT-KEY-STRING");
        $sym87$_CSETF_RED_ELEMENT_STRUCT_KEY_STRING = SubLObjectFactory.makeSymbol("_CSETF-RED-ELEMENT-STRUCT-KEY-STRING");
        $kw88$REPOSITORY_LIST = SubLObjectFactory.makeKeyword("REPOSITORY-LIST");
        $kw89$KEY_STRING = SubLObjectFactory.makeKeyword("KEY-STRING");
        $sym90$MAKE_RED_ELEMENT_STRUCT = SubLObjectFactory.makeSymbol("MAKE-RED-ELEMENT-STRUCT");
        $sym91$VISIT_DEFSTRUCT_OBJECT_RED_ELEMENT_STRUCT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RED-ELEMENT-STRUCT-METHOD");
        $str92$__red_element_struct_key____s_ = SubLObjectFactory.makeString("#<red-element-struct key = ~s>");
        $sym93$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-GET-ELEMENT-IMPLEMENTATION");
        $sym94$RED_GET_DATATYPE_STRING_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-DATATYPE-STRING-IMPLEMENTATION");
        $str95$__red_element_struct_key___s_type = SubLObjectFactory.makeString("#<red-element-struct key= ~s type = ~s ");
        $kw96$STRING = SubLObjectFactory.makeKeyword("STRING");
        $str97$value____s = SubLObjectFactory.makeString("value = ~s");
        $sym98$RED_GET_STRING_VALUE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-STRING-VALUE-IMPLEMENTATION");
        $kw99$INTEGER = SubLObjectFactory.makeKeyword("INTEGER");
        $str100$value____d = SubLObjectFactory.makeString("value = ~d");
        $sym101$RED_GET_INT32_VALUE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-INT32-VALUE-IMPLEMENTATION");
        $kw102$BLOB = SubLObjectFactory.makeKeyword("BLOB");
        $str103$BlobValue____ = SubLObjectFactory.makeString("BlobValue = \"");
        $str104$_x = SubLObjectFactory.makeString("~x");
        $str105$0 = SubLObjectFactory.makeString("0");
        $str106$_a = SubLObjectFactory.makeString("~a");
        $str107$_ = SubLObjectFactory.makeString("\"");
        $kw108$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str109$INVALID_DATA_TYPE = SubLObjectFactory.makeString("INVALID DATA TYPE");
        $str110$_ = SubLObjectFactory.makeString(">");
        $sym111$RED_NUMBER_REPOSITORIES_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-NUMBER-REPOSITORIES-IMPLEMENTATION");
        $sym112$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-SUPER-ELEMENT-ITERATOR-IMPLEMENTATION");
        $str113$ = SubLObjectFactory.makeString("");
        $sym114$RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-ITERATOR-HAS-NEXT-IMPLEMENTATION");
        $sym115$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-ITERATOR-NEXT-IMPLEMENTATION");
        $sym116$RED_GET_KEY_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-KEY-IMPLEMENTATION");
        $sym117$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-DISPOSE-IMPLEMENTATION");
        $sym118$RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-ITERATOR-DISPOSE-IMPLEMENTATION");
        $sym119$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-TOP-LEVEL-KEY-IMPLEMENTATION");
        $sym120$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-SUBKEY-ITERATOR-IMPLEMENTATION");
        $sym121$RED_ITERATOR_HAS_NEXT_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-ITERATOR-HAS-NEXT-IMPLEMENTATION");
        $sym122$RED_ITERATOR_NEXT_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-ITERATOR-NEXT-IMPLEMENTATION");
        $sym123$RED_ITERATOR_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-ITERATOR-DISPOSE-IMPLEMENTATION");
        $kw124$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $str125$_ = SubLObjectFactory.makeString(".");
        $sym126$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-FILENAME-IMPLEMENTATION");
        $sym127$RED_REPOSITORY_OBJECT_VALID_P = SubLObjectFactory.makeSymbol("RED-REPOSITORY-OBJECT-VALID-P");
        $sym128$RED_REPOSITORY_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-DISPOSE-IMPLEMENTATION");
        $sym129$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-SYSTEM-REPOSITORY-IMPLEMENTATION");
        $sym130$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-MACHINE-REPOSITORY-IMPLEMENTATION");
        $sym131$RED_LOAD_REPOSITORY_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-LOAD-REPOSITORY-IMPLEMENTATION");
        $sym132$RED_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-DISPOSE-IMPLEMENTATION");
        $str133$string = SubLObjectFactory.makeString("string");
        $str134$integer = SubLObjectFactory.makeString("integer");
        $str135$blob = SubLObjectFactory.makeString("blob");
        $sym136$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-MAKE-REPOSITORY-LIST-FROM-REPOSITORY-IMPLEMENTATION");
        $sym137$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-NEW-IMPLEMENTATION");
        $sym138$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-ADD-REPOSITORY-IMPLEMENTATION");
        $sym139$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-APPLICATION-REPOSITORIES-IMPLEMENTATION");
        $sym140$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-LIST-MOST-PRIVILEGED-FIRST-IMPLEMENTATION");
        $sym141$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-LIST-LEAST-PRIVILEGED-FIRST-IMPLEMENTATION");
        $sym142$RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-DISPOSE-IMPLEMENTATION");
        $sym143$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-TOP-LEVEL-SUPER-ELEMENT-IMPLEMENTATION");
        $sym144$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-LIST-IMPLEMENTATION");
        $sym145$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-GET-REPOSITORY-LIST-IMPLEMENTATION");
    }
    
    public static final class $red_struct_native extends SubLStructNative
    {
        public SubLObject $cobj;
        private static final SubLStructDeclNative structDecl;
        
        public $red_struct_native() {
            this.$cobj = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$red_struct_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$cobj;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$cobj = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$red_struct_native.class, red_api.$sym0$RED_STRUCT, red_api.$sym1$RED_STRUCT_P, red_api.$list2, red_api.$list3, new String[] { "$cobj" }, red_api.$list4, red_api.$list5, red_api.$sym6$PRINT_RED_STRUCT);
        }
    }
    
    public static final class $red_struct_p$UnaryFunction extends UnaryFunction
    {
        public $red_struct_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RED-STRUCT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return red_api.red_struct_p(arg1);
        }
    }
    
    public static final class $red_repository_struct_native extends SubLStructNative
    {
        public SubLObject $filename;
        private static final SubLStructDeclNative structDecl;
        
        public $red_repository_struct_native() {
            this.$filename = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$red_repository_struct_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$filename;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$filename = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$red_repository_struct_native.class, red_api.$sym18$RED_REPOSITORY_STRUCT, red_api.$sym19$RED_REPOSITORY_STRUCT_P, red_api.$list20, red_api.$list21, new String[] { "$filename" }, red_api.$list22, red_api.$list23, red_api.$sym24$PRINT_RED_REPOSITORY_STRUCT);
        }
    }
    
    public static final class $red_repository_struct_p$UnaryFunction extends UnaryFunction
    {
        public $red_repository_struct_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RED-REPOSITORY-STRUCT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return red_api.red_repository_struct_p(arg1);
        }
    }
    
    public static final class $red_repository_list_struct_native extends SubLStructNative
    {
        public SubLObject $type;
        private static final SubLStructDeclNative structDecl;
        
        public $red_repository_list_struct_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$red_repository_list_struct_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$type;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$red_repository_list_struct_native.class, red_api.$sym48$RED_REPOSITORY_LIST_STRUCT, red_api.$sym49$RED_REPOSITORY_LIST_STRUCT_P, red_api.$list50, red_api.$list51, new String[] { "$type" }, red_api.$list52, red_api.$list53, red_api.$sym54$PRINT_RED_REPOSITORY_LIST_STRUCT);
        }
    }
    
    public static final class $red_repository_list_struct_p$UnaryFunction extends UnaryFunction
    {
        public $red_repository_list_struct_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RED-REPOSITORY-LIST-STRUCT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return red_api.red_repository_list_struct_p(arg1);
        }
    }
    
    public static final class $red_element_struct_native extends SubLStructNative
    {
        public SubLObject $repository_list;
        public SubLObject $key_string;
        private static final SubLStructDeclNative structDecl;
        
        public $red_element_struct_native() {
            this.$repository_list = (SubLObject)CommonSymbols.NIL;
            this.$key_string = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$red_element_struct_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$repository_list;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$key_string;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$repository_list = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$key_string = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$red_element_struct_native.class, red_api.$sym75$RED_ELEMENT_STRUCT, red_api.$sym76$RED_ELEMENT_STRUCT_P, red_api.$list77, red_api.$list78, new String[] { "$repository_list", "$key_string" }, red_api.$list79, red_api.$list80, red_api.$sym81$PRINT_RED_ELEMENT_STRUCT);
        }
    }
    
    public static final class $red_element_struct_p$UnaryFunction extends UnaryFunction
    {
        public $red_element_struct_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RED-ELEMENT-STRUCT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return red_api.red_element_struct_p(arg1);
        }
    }
}

/*

	Total time: 388 ms
	
*/