/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_decode;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numNE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RED-API
 * source file: /cyc/top/cycl/red-api.lisp
 * created:     2019/07/03 17:37:10
 */
public final class red_api extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt98$ = makeString("");

    public static final class $red_repository_struct_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.red_api.$red_repository_struct_native.this.$filename;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.red_api.$red_repository_struct_native.this.$filename = value;
        }

        public SubLObject $filename = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.red_api.$red_repository_struct_native.class, RED_REPOSITORY_STRUCT, RED_REPOSITORY_STRUCT_P, $list_alt14, $list_alt15, new String[]{ "$filename" }, $list_alt16, $list_alt17, PRINT_RED_REPOSITORY_STRUCT);
    }

    public static final class $red_repository_list_struct_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.red_api.$red_repository_list_struct_native.this.$type;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.red_api.$red_repository_list_struct_native.this.$type = value;
        }

        public SubLObject $type = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.red_api.$red_repository_list_struct_native.class, RED_REPOSITORY_LIST_STRUCT, RED_REPOSITORY_LIST_STRUCT_P, $list_alt41, $list_alt42, new String[]{ "$type" }, $list_alt43, $list_alt44, PRINT_RED_REPOSITORY_LIST_STRUCT);
    }

    public static final SubLFile me = new red_api();

 public static final String myName = "com.cyc.cycjava.cycl.red_api";


    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $red_api_object$ = makeSymbol("*RED-API-OBJECT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $red_filenames$ = makeSymbol("*RED-FILENAMES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_red_struct$ = makeSymbol("*DTP-RED-STRUCT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_red_repository_struct$ = makeSymbol("*DTP-RED-REPOSITORY-STRUCT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_red_repository_list_struct$ = makeSymbol("*DTP-RED-REPOSITORY-LIST-STRUCT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_red_element_struct$ = makeSymbol("*DTP-RED-ELEMENT-STRUCT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RED_STRUCT = makeSymbol("RED-STRUCT");

    private static final SubLSymbol RED_STRUCT_P = makeSymbol("RED-STRUCT-P");

    static private final SubLList $list2 = list(makeSymbol("COBJ"));

    static private final SubLList $list3 = list($COBJ);

    static private final SubLList $list4 = list(makeSymbol("RED-STRUCT-COBJ"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-RED-STRUCT-COBJ"));

    private static final SubLSymbol PRINT_RED_STRUCT = makeSymbol("PRINT-RED-STRUCT");

    private static final SubLSymbol RED_STRUCT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RED-STRUCT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RED-STRUCT-P"));

    private static final SubLSymbol RED_STRUCT_COBJ = makeSymbol("RED-STRUCT-COBJ");

    private static final SubLSymbol _CSETF_RED_STRUCT_COBJ = makeSymbol("_CSETF-RED-STRUCT-COBJ");

    private static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_RED_STRUCT = makeSymbol("MAKE-RED-STRUCT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RED_STRUCT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RED-STRUCT-METHOD");

    private static final SubLSymbol RED_REPOSITORY_STRUCT = makeSymbol("RED-REPOSITORY-STRUCT");

    private static final SubLSymbol RED_REPOSITORY_STRUCT_P = makeSymbol("RED-REPOSITORY-STRUCT-P");

    private static final SubLList $list20 = list(makeSymbol("FILENAME"));

    private static final SubLList $list21 = list(makeKeyword("FILENAME"));

    private static final SubLList $list22 = list(makeSymbol("RED-REPOSITORY-STRUCT-FILENAME"));

    private static final SubLList $list23 = list(makeSymbol("_CSETF-RED-REPOSITORY-STRUCT-FILENAME"));

    private static final SubLSymbol PRINT_RED_REPOSITORY_STRUCT = makeSymbol("PRINT-RED-REPOSITORY-STRUCT");

    private static final SubLSymbol RED_REPOSITORY_STRUCT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RED-REPOSITORY-STRUCT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list26 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RED-REPOSITORY-STRUCT-P"));

    private static final SubLSymbol RED_REPOSITORY_STRUCT_FILENAME = makeSymbol("RED-REPOSITORY-STRUCT-FILENAME");

    private static final SubLSymbol _CSETF_RED_REPOSITORY_STRUCT_FILENAME = makeSymbol("_CSETF-RED-REPOSITORY-STRUCT-FILENAME");

    private static final SubLSymbol MAKE_RED_REPOSITORY_STRUCT = makeSymbol("MAKE-RED-REPOSITORY-STRUCT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RED_REPOSITORY_STRUCT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RED-REPOSITORY-STRUCT-METHOD");

    private static final SubLString $str33$__red_struct_obj___s__version____ = makeString("#<red-struct obj: ~s  version = ~s  date= ~s  time = ~s  number-application-repositories ~s  system-repository = ~s machine-repository=~s >");

    private static final SubLSymbol RED_GET_VERSION_STRING_IMPLEMENTATION = makeSymbol("RED-GET-VERSION-STRING-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_DATE_STRING_IMPLEMENTATION = makeSymbol("RED-GET-DATE-STRING-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_TIME_STRING_IMPLEMENTATION = makeSymbol("RED-GET-TIME-STRING-IMPLEMENTATION");

    private static final SubLSymbol RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION = makeSymbol("RED-NUMBER-APPLICATION-REPOSITORIES-IMPLEMENTATION");

    private static final SubLString $str38$__red_struct_cobj__nil_ = makeString("#<red-struct cobj: nil>");

    private static final SubLString $str40$__red_repository_struct_INVALID__ = makeString("#<red-repository-struct INVALID  ~s>");

    private static final SubLString $str41$__red_repository_struct__name____ = makeString("#<red-repository-struct  name = ~s type = ~s version = ~s date = ~s time = ~s >");

    private static final SubLSymbol RED_GET_REPOSITORY_NAME_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-NAME-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-TYPE-STRING-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-VERSION-STRING-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_REPOSITORY_DATE_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-DATE-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_REPOSITORY_TIME_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-TIME-IMPLEMENTATION");

    private static final SubLSymbol RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-POINTER-VALID-IMPLEMENTATION");

    private static final SubLSymbol RED_REPOSITORY_LIST_STRUCT = makeSymbol("RED-REPOSITORY-LIST-STRUCT");

    private static final SubLSymbol RED_REPOSITORY_LIST_STRUCT_P = makeSymbol("RED-REPOSITORY-LIST-STRUCT-P");

    private static final SubLList $list50 = list(makeSymbol("TYPE"));

    private static final SubLList $list51 = list($TYPE);

    private static final SubLList $list52 = list(makeSymbol("RED-REPOSITORY-LIST-STRUCT-TYPE"));

    private static final SubLList $list53 = list(makeSymbol("_CSETF-RED-REPOSITORY-LIST-STRUCT-TYPE"));

    private static final SubLSymbol PRINT_RED_REPOSITORY_LIST_STRUCT = makeSymbol("PRINT-RED-REPOSITORY-LIST-STRUCT");

    private static final SubLSymbol RED_REPOSITORY_LIST_STRUCT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RED-REPOSITORY-LIST-STRUCT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list56 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RED-REPOSITORY-LIST-STRUCT-P"));

    private static final SubLSymbol RED_REPOSITORY_LIST_STRUCT_TYPE = makeSymbol("RED-REPOSITORY-LIST-STRUCT-TYPE");

    private static final SubLSymbol _CSETF_RED_REPOSITORY_LIST_STRUCT_TYPE = makeSymbol("_CSETF-RED-REPOSITORY-LIST-STRUCT-TYPE");

    private static final SubLSymbol MAKE_RED_REPOSITORY_LIST_STRUCT = makeSymbol("MAKE-RED-REPOSITORY-LIST-STRUCT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RED_REPOSITORY_LIST_STRUCT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RED-REPOSITORY-LIST-STRUCT-METHOD");

    private static final SubLString $str69$__red_repository_list_struct_type = makeString("#<red-repository-list-struct type = ~s>");

    private static final SubLString $str70$__red_repository_list_struct_elts = makeString("#<red-repository-list-struct elts = 0 ()>");

    private static final SubLString $str71$__red_repository_list_struct_elts = makeString("#<red-repository-list-struct elts = ~d ( ");

    private static final SubLString $str72$_s_ = makeString("~s ");

    private static final SubLSymbol RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-GET-ELEMENT-IMPLEMENTATION");

    private static final SubLString $str74$__ = makeString(")>");

    private static final SubLSymbol RED_ELEMENT_STRUCT = makeSymbol("RED-ELEMENT-STRUCT");

    private static final SubLSymbol RED_ELEMENT_STRUCT_P = makeSymbol("RED-ELEMENT-STRUCT-P");

    private static final SubLList $list77 = list(makeSymbol("REPOSITORY-LIST"), makeSymbol("KEY-STRING"));

    private static final SubLList $list78 = list(makeKeyword("REPOSITORY-LIST"), makeKeyword("KEY-STRING"));

    private static final SubLList $list79 = list(makeSymbol("RED-ELEMENT-STRUCT-REPOSITORY-LIST"), makeSymbol("RED-ELEMENT-STRUCT-KEY-STRING"));

    private static final SubLList $list80 = list(makeSymbol("_CSETF-RED-ELEMENT-STRUCT-REPOSITORY-LIST"), makeSymbol("_CSETF-RED-ELEMENT-STRUCT-KEY-STRING"));

    private static final SubLSymbol PRINT_RED_ELEMENT_STRUCT = makeSymbol("PRINT-RED-ELEMENT-STRUCT");

    private static final SubLSymbol RED_ELEMENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RED-ELEMENT-STRUCT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list83 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RED-ELEMENT-STRUCT-P"));

    private static final SubLSymbol RED_ELEMENT_STRUCT_REPOSITORY_LIST = makeSymbol("RED-ELEMENT-STRUCT-REPOSITORY-LIST");

    private static final SubLSymbol _CSETF_RED_ELEMENT_STRUCT_REPOSITORY_LIST = makeSymbol("_CSETF-RED-ELEMENT-STRUCT-REPOSITORY-LIST");

    private static final SubLSymbol RED_ELEMENT_STRUCT_KEY_STRING = makeSymbol("RED-ELEMENT-STRUCT-KEY-STRING");

    private static final SubLSymbol _CSETF_RED_ELEMENT_STRUCT_KEY_STRING = makeSymbol("_CSETF-RED-ELEMENT-STRUCT-KEY-STRING");

    private static final SubLSymbol MAKE_RED_ELEMENT_STRUCT = makeSymbol("MAKE-RED-ELEMENT-STRUCT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RED_ELEMENT_STRUCT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RED-ELEMENT-STRUCT-METHOD");

    private static final SubLString $str92$__red_element_struct_key____s_ = makeString("#<red-element-struct key = ~s>");

    private static final SubLSymbol RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-GET-ELEMENT-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_DATATYPE_STRING_IMPLEMENTATION = makeSymbol("RED-GET-DATATYPE-STRING-IMPLEMENTATION");

    private static final SubLString $str95$__red_element_struct_key___s_type = makeString("#<red-element-struct key= ~s type = ~s ");

    private static final SubLString $str97$value____s = makeString("value = ~s");

    private static final SubLSymbol RED_GET_STRING_VALUE_IMPLEMENTATION = makeSymbol("RED-GET-STRING-VALUE-IMPLEMENTATION");

    private static final SubLString $str100$value____d = makeString("value = ~d");

    private static final SubLSymbol RED_GET_INT32_VALUE_IMPLEMENTATION = makeSymbol("RED-GET-INT32-VALUE-IMPLEMENTATION");

    private static final SubLString $str103$BlobValue____ = makeString("BlobValue = \"");

    private static final SubLString $str104$_x = makeString("~x");

    private static final SubLString $$$0 = makeString("0");

    private static final SubLString $str106$_a = makeString("~a");

    private static final SubLString $str107$_ = makeString("\"");

    private static final SubLString $$$INVALID_DATA_TYPE = makeString("INVALID DATA TYPE");

    static private final SubLString $str110$_ = makeString(">");

    private static final SubLSymbol RED_NUMBER_REPOSITORIES_IMPLEMENTATION = makeSymbol("RED-NUMBER-REPOSITORIES-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION = makeSymbol("RED-GET-SUPER-ELEMENT-ITERATOR-IMPLEMENTATION");

    private static final SubLString $str113$ = makeString("");

    private static final SubLSymbol RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-ITERATOR-HAS-NEXT-IMPLEMENTATION");

    private static final SubLSymbol RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-ITERATOR-NEXT-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_KEY_IMPLEMENTATION = makeSymbol("RED-GET-KEY-IMPLEMENTATION");

    private static final SubLSymbol RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-DISPOSE-IMPLEMENTATION");

    private static final SubLSymbol RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-ITERATOR-DISPOSE-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION = makeSymbol("RED-GET-TOP-LEVEL-KEY-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION = makeSymbol("RED-GET-SUBKEY-ITERATOR-IMPLEMENTATION");

    private static final SubLSymbol RED_ITERATOR_HAS_NEXT_IMPLEMENTATION = makeSymbol("RED-ITERATOR-HAS-NEXT-IMPLEMENTATION");

    private static final SubLSymbol RED_ITERATOR_NEXT_IMPLEMENTATION = makeSymbol("RED-ITERATOR-NEXT-IMPLEMENTATION");

    private static final SubLSymbol RED_ITERATOR_DISPOSE_IMPLEMENTATION = makeSymbol("RED-ITERATOR-DISPOSE-IMPLEMENTATION");

    private static final SubLString $str125$_ = makeString(".");

    private static final SubLSymbol RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-FILENAME-IMPLEMENTATION");

    private static final SubLSymbol RED_REPOSITORY_OBJECT_VALID_P = makeSymbol("RED-REPOSITORY-OBJECT-VALID-P");

    private static final SubLSymbol RED_REPOSITORY_DISPOSE_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-DISPOSE-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-GET-SYSTEM-REPOSITORY-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-GET-MACHINE-REPOSITORY-IMPLEMENTATION");

    private static final SubLSymbol RED_LOAD_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-LOAD-REPOSITORY-IMPLEMENTATION");

    private static final SubLSymbol RED_DISPOSE_IMPLEMENTATION = makeSymbol("RED-DISPOSE-IMPLEMENTATION");

    private static final SubLString $$$string = makeString("string");

    private static final SubLString $$$integer = makeString("integer");

    private static final SubLString $$$blob = makeString("blob");

    private static final SubLSymbol RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-MAKE-REPOSITORY-LIST-FROM-REPOSITORY-IMPLEMENTATION");

    private static final SubLSymbol RED_REPOSITORY_LIST_NEW_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-NEW-IMPLEMENTATION");

    private static final SubLSymbol RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-ADD-REPOSITORY-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION = makeSymbol("RED-GET-APPLICATION-REPOSITORIES-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-LIST-MOST-PRIVILEGED-FIRST-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-LIST-LEAST-PRIVILEGED-FIRST-IMPLEMENTATION");

    private static final SubLSymbol RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-DISPOSE-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION = makeSymbol("RED-GET-TOP-LEVEL-SUPER-ELEMENT-IMPLEMENTATION");

    private static final SubLSymbol RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION = makeSymbol("RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-LIST-IMPLEMENTATION");

    private static final SubLSymbol RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-GET-REPOSITORY-LIST-IMPLEMENTATION");

    public static final SubLObject red_struct_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_red_struct(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject red_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_red_struct(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject red_struct_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.red_api.$red_struct_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject red_struct_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.red_api.$red_struct_native.class ? T : NIL;
    }

    public static final SubLObject red_struct_cobj_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RED_STRUCT_P);
        return v_object.getField2();
    }

    public static SubLObject red_struct_cobj(final SubLObject v_object) {
        assert NIL != red_struct_p(v_object) : "! red_api.red_struct_p(v_object) " + "red_api.red_struct_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_red_struct_cobj_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RED_STRUCT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_red_struct_cobj(final SubLObject v_object, final SubLObject value) {
        assert NIL != red_struct_p(v_object) : "! red_api.red_struct_p(v_object) " + "red_api.red_struct_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_red_struct_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.red_api.$red_struct_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($COBJ)) {
                        _csetf_red_struct_cobj(v_new, current_value);
                    } else {
                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_red_struct(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.red_api.$red_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($COBJ)) {
                _csetf_red_struct_cobj(v_new, current_value);
            } else {
                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_red_struct(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RED_STRUCT, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $COBJ, red_struct_cobj(obj));
        funcall(visitor_fn, obj, $END, MAKE_RED_STRUCT, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_red_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_red_struct(obj, visitor_fn);
    }

    public static final SubLObject red_repository_struct_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_red_repository_struct(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject red_repository_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_red_repository_struct(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject red_repository_struct_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.red_api.$red_repository_struct_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject red_repository_struct_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.red_api.$red_repository_struct_native.class ? T : NIL;
    }

    public static final SubLObject red_repository_struct_filename_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RED_REPOSITORY_STRUCT_P);
        return v_object.getField2();
    }

    public static SubLObject red_repository_struct_filename(final SubLObject v_object) {
        assert NIL != red_repository_struct_p(v_object) : "! red_api.red_repository_struct_p(v_object) " + "red_api.red_repository_struct_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_red_repository_struct_filename_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RED_REPOSITORY_STRUCT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_red_repository_struct_filename(final SubLObject v_object, final SubLObject value) {
        assert NIL != red_repository_struct_p(v_object) : "! red_api.red_repository_struct_p(v_object) " + "red_api.red_repository_struct_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_red_repository_struct_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.red_api.$red_repository_struct_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FILENAME)) {
                        _csetf_red_repository_struct_filename(v_new, current_value);
                    } else {
                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_red_repository_struct(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.red_api.$red_repository_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FILENAME)) {
                _csetf_red_repository_struct_filename(v_new, current_value);
            } else {
                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_red_repository_struct(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RED_REPOSITORY_STRUCT, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FILENAME, red_repository_struct_filename(obj));
        funcall(visitor_fn, obj, $END, MAKE_RED_REPOSITORY_STRUCT, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_red_repository_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_red_repository_struct(obj, visitor_fn);
    }

    public static final SubLObject red_struct_create_alt() {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        {
            SubLObject red_obj = make_red_struct(UNPROVIDED);
            _csetf_red_struct_cobj(red_obj, SubLMain.get_red_object());
            red_cond_create_repository_filenames();
            return red_obj;
        }
    }

    public static SubLObject red_struct_create() {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        final SubLObject red_obj = make_red_struct(UNPROVIDED);
        _csetf_red_struct_cobj(red_obj, SubLMain.get_red_object());
        red_cond_create_repository_filenames();
        return red_obj;
    }

    public static final SubLObject print_red_struct_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        if (NIL != red_struct_cobj(v_object)) {
            {
                SubLObject red = red_struct_cobj(v_object);
                SubLObject system_repository = red_get_system_repository(UNPROVIDED);
                SubLObject machine_repository = red_get_machine_repository(UNPROVIDED);
                format(stream, $str_alt24$__red_struct_obj___s__version____, new SubLObject[]{ red, funcall(RED_GET_VERSION_STRING_IMPLEMENTATION, red), funcall(RED_GET_DATE_STRING_IMPLEMENTATION, red), funcall(RED_GET_TIME_STRING_IMPLEMENTATION, red), funcall(RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION, red), system_repository, machine_repository });
            }
        } else {
            format(stream, $str_alt29$__red_struct_cobj__nil_);
        }
        return v_object;
    }

    public static SubLObject print_red_struct(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        if (NIL != red_struct_cobj(v_object)) {
            final SubLObject red = red_struct_cobj(v_object);
            final SubLObject system_repository = red_get_system_repository(UNPROVIDED);
            final SubLObject machine_repository = red_get_machine_repository(UNPROVIDED);
            format(stream, $str33$__red_struct_obj___s__version____, new SubLObject[]{ red, funcall(RED_GET_VERSION_STRING_IMPLEMENTATION, red), funcall(RED_GET_DATE_STRING_IMPLEMENTATION, red), funcall(RED_GET_TIME_STRING_IMPLEMENTATION, red), funcall(RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION, red), system_repository, machine_repository });
        } else {
            format(stream, $str38$__red_struct_cobj__nil_);
        }
        return v_object;
    }

    public static final SubLObject red_repository_struct_create_alt(SubLObject filename) {
        SubLTrampolineFile.checkType(filename, STRINGP);
        {
            SubLObject cobj = red_lookup_or_load_repository_object_by_filename(filename);
            if (NIL == cobj) {
                return NIL;
            }
        }
        {
            SubLObject rr = make_red_repository_struct(UNPROVIDED);
            _csetf_red_repository_struct_filename(rr, filename);
            return rr;
        }
    }

    public static SubLObject red_repository_struct_create(final SubLObject filename) {
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        final SubLObject cobj = red_lookup_or_load_repository_object_by_filename(filename);
        if (NIL == cobj) {
            return NIL;
        }
        final SubLObject rr = make_red_repository_struct(UNPROVIDED);
        _csetf_red_repository_struct_filename(rr, filename);
        return rr;
    }

    public static final SubLObject red_repository_object_wrap_alt(SubLObject cobj) {
        if (NIL == cobj) {
            return NIL;
        }
        {
            SubLObject filename = red_get_filename_from_object(cobj);
            if (NIL == filename) {
                return NIL;
            }
            {
                SubLObject rr = make_red_repository_struct(UNPROVIDED);
                _csetf_red_repository_struct_filename(rr, filename);
                return rr;
            }
        }
    }

    public static SubLObject red_repository_object_wrap(final SubLObject cobj) {
        if (NIL == cobj) {
            return NIL;
        }
        final SubLObject filename = red_get_filename_from_object(cobj);
        if (NIL == filename) {
            return NIL;
        }
        final SubLObject rr = make_red_repository_struct(UNPROVIDED);
        _csetf_red_repository_struct_filename(rr, filename);
        return rr;
    }

    public static final SubLObject red_repository_get_repository_object_alt(SubLObject rep_struct) {
        {
            SubLObject filename = red_repository_struct_filename(rep_struct);
            return red_lookup_repository_object_by_filename(filename);
        }
    }

    public static SubLObject red_repository_get_repository_object(final SubLObject rep_struct) {
        final SubLObject filename = red_repository_struct_filename(rep_struct);
        return red_lookup_repository_object_by_filename(filename);
    }

    public static final SubLObject print_red_repository_struct_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject rr = red_repository_get_repository_object(v_object);
            SubLObject valid = red_repository_struct_valid_p(v_object);
            if (NIL == valid) {
                format(stream, $str_alt31$__red_repository_struct_INVALID__, rr);
                return v_object;
            }
            format(stream, $str_alt32$__red_repository_struct__name____, new SubLObject[]{ funcall(RED_GET_REPOSITORY_NAME_IMPLEMENTATION, rr), funcall(RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION, rr), funcall(RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION, rr), funcall(RED_GET_REPOSITORY_DATE_IMPLEMENTATION, rr), funcall(RED_GET_REPOSITORY_TIME_IMPLEMENTATION, rr) });
        }
        return v_object;
    }

    public static SubLObject print_red_repository_struct(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject rr = red_repository_get_repository_object(v_object);
        final SubLObject valid = red_repository_struct_valid_p(v_object);
        if (NIL == valid) {
            format(stream, $str40$__red_repository_struct_INVALID__, rr);
            return v_object;
        }
        format(stream, $str41$__red_repository_struct__name____, new SubLObject[]{ funcall(RED_GET_REPOSITORY_NAME_IMPLEMENTATION, rr), funcall(RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION, rr), funcall(RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION, rr), funcall(RED_GET_REPOSITORY_DATE_IMPLEMENTATION, rr), funcall(RED_GET_REPOSITORY_TIME_IMPLEMENTATION, rr) });
        return v_object;
    }

    public static final SubLObject red_repository_struct_valid_p_alt(SubLObject red_rep_struct) {
        SubLTrampolineFile.checkType(red_rep_struct, RED_REPOSITORY_STRUCT_P);
        {
            SubLObject cobj = red_repository_get_repository_object(red_rep_struct);
            if (NIL == cobj) {
                return NIL;
            }
            {
                SubLObject retval = funcall(RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, red_get_object_bare(), cobj);
                if (retval == ZERO_INTEGER) {
                    return NIL;
                }
                return T;
            }
        }
    }

    public static SubLObject red_repository_struct_valid_p(final SubLObject red_rep_struct) {
        assert NIL != red_repository_struct_p(red_rep_struct) : "! red_api.red_repository_struct_p(red_rep_struct) " + ("red_api.red_repository_struct_p(red_rep_struct) " + "CommonSymbols.NIL != red_api.red_repository_struct_p(red_rep_struct) ") + red_rep_struct;
        final SubLObject cobj = red_repository_get_repository_object(red_rep_struct);
        if (NIL == cobj) {
            return NIL;
        }
        final SubLObject retval = funcall(RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, red_get_object_bare(), cobj);
        if (retval.eql(ZERO_INTEGER)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject red_repository_object_valid_p_alt(SubLObject rep_obj) {
        if (NIL == rep_obj) {
            return NIL;
        }
        if (!rep_obj.isNumber()) {
            return NIL;
        }
        if (NIL == rep_obj) {
            return NIL;
        }
        {
            SubLObject retval = funcall(RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, red_get_object_bare(), rep_obj);
            if (retval == ZERO_INTEGER) {
                return NIL;
            }
            return T;
        }
    }

    public static SubLObject red_repository_object_valid_p(final SubLObject rep_obj) {
        if (NIL == rep_obj) {
            return NIL;
        }
        if (!rep_obj.isNumber()) {
            return NIL;
        }
        if (NIL == rep_obj) {
            return NIL;
        }
        final SubLObject retval = funcall(RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, red_get_object_bare(), rep_obj);
        if (retval.eql(ZERO_INTEGER)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject red_repository_list_struct_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_red_repository_list_struct(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject red_repository_list_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_red_repository_list_struct(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject red_repository_list_struct_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.red_api.$red_repository_list_struct_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject red_repository_list_struct_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.red_api.$red_repository_list_struct_native.class ? T : NIL;
    }

    public static final SubLObject red_repository_list_struct_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RED_REPOSITORY_LIST_STRUCT_P);
        return v_object.getField2();
    }

    public static SubLObject red_repository_list_struct_type(final SubLObject v_object) {
        assert NIL != red_repository_list_struct_p(v_object) : "! red_api.red_repository_list_struct_p(v_object) " + "red_api.red_repository_list_struct_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_red_repository_list_struct_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RED_REPOSITORY_LIST_STRUCT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_red_repository_list_struct_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != red_repository_list_struct_p(v_object) : "! red_api.red_repository_list_struct_p(v_object) " + "red_api.red_repository_list_struct_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_red_repository_list_struct_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.red_api.$red_repository_list_struct_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TYPE)) {
                        _csetf_red_repository_list_struct_type(v_new, current_value);
                    } else {
                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_red_repository_list_struct(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.red_api.$red_repository_list_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_red_repository_list_struct_type(v_new, current_value);
            } else {
                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_red_repository_list_struct(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RED_REPOSITORY_LIST_STRUCT, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, red_repository_list_struct_type(obj));
        funcall(visitor_fn, obj, $END, MAKE_RED_REPOSITORY_LIST_STRUCT, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_red_repository_list_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_red_repository_list_struct(obj, visitor_fn);
    }

    /**
     * Create a repository-list-struct of type 'type'
     *
     * @param type;
     * 		one of :system :machine :machine-system :system-machine :application :most-privileged :least-privileged
     * @return red-repository-list=struct; a red repository list struct of the given type
     */
    @LispMethod(comment = "Create a repository-list-struct of type \'type\'\r\n\r\n@param type;\r\n\t\tone of :system :machine :machine-system :system-machine :application :most-privileged :least-privileged\r\n@return red-repository-list=struct; a red repository list struct of the given type")
    public static final SubLObject red_repository_list_struct_create_alt(SubLObject type) {
        red_get_object();
        {
            SubLObject pcase_var = type;
            if ((((((pcase_var.eql($SYSTEM) || pcase_var.eql($MACHINE)) || pcase_var.eql($MACHINE_SYSTEM)) || pcase_var.eql($SYSTEM_MACHINE)) || pcase_var.eql($APPLICATION)) || pcase_var.eql($MOST_PRIVILEGED)) || pcase_var.eql($LEAST_PRIVILEGED)) {
                {
                    SubLObject red_repository_list = make_red_repository_list_struct(UNPROVIDED);
                    _csetf_red_repository_list_struct_type(red_repository_list, type);
                    return red_repository_list;
                }
            } else {
                return NIL;
            }
        }
    }

    /**
     * Create a repository-list-struct of type 'type'
     *
     * @param type;
     * 		one of :system :machine :machine-system :system-machine :application :most-privileged :least-privileged
     * @return red-repository-list=struct; a red repository list struct of the given type
     */
    @LispMethod(comment = "Create a repository-list-struct of type \'type\'\r\n\r\n@param type;\r\n\t\tone of :system :machine :machine-system :system-machine :application :most-privileged :least-privileged\r\n@return red-repository-list=struct; a red repository list struct of the given type")
    public static SubLObject red_repository_list_struct_create(final SubLObject type) {
        red_get_object();
        if ((((((type.eql($SYSTEM) || type.eql($MACHINE)) || type.eql($MACHINE_SYSTEM)) || type.eql($SYSTEM_MACHINE)) || type.eql($APPLICATION)) || type.eql($MOST_PRIVILEGED)) || type.eql($LEAST_PRIVILEGED)) {
            final SubLObject red_repository_list = make_red_repository_list_struct(UNPROVIDED);
            _csetf_red_repository_list_struct_type(red_repository_list, type);
            return red_repository_list;
        }
        return NIL;
    }

    public static final SubLObject print_red_repository_list_struct_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        format(stream, $str_alt57$__red_repository_list_struct_type, red_repository_list_struct_type(v_object));
        return v_object;
    }

    public static SubLObject print_red_repository_list_struct(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        format(stream, $str69$__red_repository_list_struct_type, red_repository_list_struct_type(v_object));
        return v_object;
    }

    public static final SubLObject xprint_red_repository_list_struct_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        {
            SubLObject red_repository_list = red_repository_list_instantiate(v_object);
            try {
                if (NIL == red_repository_list) {
                    format(stream, $str_alt58$__red_repository_list_struct_elts);
                } else {
                    {
                        SubLObject num = red_get_repository_list_length(v_object);
                        SubLObject index = ZERO_INTEGER;
                        if (num == ZERO_INTEGER) {
                            format(stream, $str_alt58$__red_repository_list_struct_elts);
                        } else {
                            format(stream, $str_alt59$__red_repository_list_struct_elts, red_get_repository_list_length(v_object));
                            while (index.numL(num)) {
                                format(stream, $str_alt60$_s_, red_repository_object_wrap(funcall(RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION, red_repository_list, index)));
                                index = add(index, ONE_INTEGER);
                            } 
                            format(stream, $str_alt62$__);
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        red_repository_list_dispose(red_repository_list);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return v_object;
    }

    public static SubLObject xprint_red_repository_list_struct(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        final SubLObject red_repository_list = red_repository_list_instantiate(v_object);
        try {
            if (NIL == red_repository_list) {
                format(stream, $str70$__red_repository_list_struct_elts);
            } else {
                final SubLObject num = red_get_repository_list_length(v_object);
                SubLObject index = ZERO_INTEGER;
                if (num.eql(ZERO_INTEGER)) {
                    format(stream, $str70$__red_repository_list_struct_elts);
                } else {
                    format(stream, $str71$__red_repository_list_struct_elts, red_get_repository_list_length(v_object));
                    while (index.numL(num)) {
                        format(stream, $str72$_s_, red_repository_object_wrap(funcall(RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION, red_repository_list, index)));
                        index = add(index, ONE_INTEGER);
                    } 
                    format(stream, $str74$__);
                }
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                red_repository_list_dispose(red_repository_list);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return v_object;
    }

    public static final SubLObject red_element_struct_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_red_element_struct(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject red_element_struct_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_red_element_struct(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject red_element_struct_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.red_api.$red_element_struct_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject red_element_struct_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.red_api.$red_element_struct_native.class ? T : NIL;
    }

    public static final SubLObject red_element_struct_repository_list_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RED_ELEMENT_STRUCT_P);
        return v_object.getField2();
    }

    public static SubLObject red_element_struct_repository_list(final SubLObject v_object) {
        assert NIL != red_element_struct_p(v_object) : "! red_api.red_element_struct_p(v_object) " + "red_api.red_element_struct_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject red_element_struct_key_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RED_ELEMENT_STRUCT_P);
        return v_object.getField3();
    }

    public static SubLObject red_element_struct_key_string(final SubLObject v_object) {
        assert NIL != red_element_struct_p(v_object) : "! red_api.red_element_struct_p(v_object) " + "red_api.red_element_struct_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_red_element_struct_repository_list_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RED_ELEMENT_STRUCT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_red_element_struct_repository_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != red_element_struct_p(v_object) : "! red_api.red_element_struct_p(v_object) " + "red_api.red_element_struct_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_red_element_struct_key_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RED_ELEMENT_STRUCT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_red_element_struct_key_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != red_element_struct_p(v_object) : "! red_api.red_element_struct_p(v_object) " + "red_api.red_element_struct_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_red_element_struct_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.red_api.$red_element_struct_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($REPOSITORY_LIST)) {
                        _csetf_red_element_struct_repository_list(v_new, current_value);
                    } else {
                        if (pcase_var.eql($KEY_STRING)) {
                            _csetf_red_element_struct_key_string(v_new, current_value);
                        } else {
                            Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_red_element_struct(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.red_api.$red_element_struct_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($REPOSITORY_LIST)) {
                _csetf_red_element_struct_repository_list(v_new, current_value);
            } else
                if (pcase_var.eql($KEY_STRING)) {
                    _csetf_red_element_struct_key_string(v_new, current_value);
                } else {
                    Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_red_element_struct(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RED_ELEMENT_STRUCT, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $REPOSITORY_LIST, red_element_struct_repository_list(obj));
        funcall(visitor_fn, obj, $SLOT, $KEY_STRING, red_element_struct_key_string(obj));
        funcall(visitor_fn, obj, $END, MAKE_RED_ELEMENT_STRUCT, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_red_element_struct_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_red_element_struct(obj, visitor_fn);
    }

    public static final SubLObject red_element_struct_create_alt(SubLObject repository_list, SubLObject key_string) {
        SubLTrampolineFile.checkType(repository_list, RED_REPOSITORY_LIST_STRUCT_P);
        SubLTrampolineFile.checkType(key_string, STRINGP);
        {
            SubLObject rse = make_red_element_struct(UNPROVIDED);
            _csetf_red_element_struct_repository_list(rse, repository_list);
            _csetf_red_element_struct_key_string(rse, key_string);
            return rse;
        }
    }

    public static SubLObject red_element_struct_create(final SubLObject repository_list, final SubLObject key_string) {
        assert NIL != red_repository_list_struct_p(repository_list) : "! red_api.red_repository_list_struct_p(repository_list) " + ("red_api.red_repository_list_struct_p(repository_list) " + "CommonSymbols.NIL != red_api.red_repository_list_struct_p(repository_list) ") + repository_list;
        assert NIL != stringp(key_string) : "! stringp(key_string) " + ("Types.stringp(key_string) " + "CommonSymbols.NIL != Types.stringp(key_string) ") + key_string;
        final SubLObject rse = make_red_element_struct(UNPROVIDED);
        _csetf_red_element_struct_repository_list(rse, repository_list);
        _csetf_red_element_struct_key_string(rse, key_string);
        return rse;
    }

    public static final SubLObject print_red_element_struct_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        SubLTrampolineFile.checkType(v_object, RED_ELEMENT_STRUCT_P);
        {
            SubLObject rse = red_element_instantiate(v_object);
            try {
                if (NIL == rse) {
                    format(stream, $str_alt77$__red_element_struct_key____s_, red_element_struct_key_string(v_object));
                } else {
                    {
                        SubLObject element = funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
                        if (NIL != element) {
                            {
                                SubLObject datatype = funcall(RED_GET_DATATYPE_STRING_IMPLEMENTATION, element);
                                SubLObject dt = red_element_get_datatype_internal(rse);
                                format(stream, $str_alt80$__red_element_struct_key___s_type, red_element_struct_key_string(v_object), datatype);
                                {
                                    SubLObject pcase_var = dt;
                                    if (pcase_var.eql($STRING)) {
                                        format(stream, $str_alt82$value____s, funcall(RED_GET_STRING_VALUE_IMPLEMENTATION, element));
                                    } else {
                                        if (pcase_var.eql($INTEGER)) {
                                            format(stream, $str_alt85$value____d, funcall(RED_GET_INT32_VALUE_IMPLEMENTATION, element));
                                        } else {
                                            if (pcase_var.eql($BLOB)) {
                                                format(stream, $str_alt88$BlobValue____);
                                                {
                                                    SubLObject bval = red_implementation.red_get_blob_value_ext(element);
                                                    SubLObject numelts = length(bval);
                                                    SubLObject index = ZERO_INTEGER;
                                                    while (index.numL(numelts)) {
                                                        {
                                                            SubLObject v = format(NIL, $str_alt89$_x, aref(bval, index));
                                                            if (length(v).numE(ONE_INTEGER)) {
                                                                v = cconcatenate($$$0, v);
                                                            }
                                                            format(stream, $str_alt91$_a, v);
                                                        }
                                                        index = add(index, ONE_INTEGER);
                                                    } 
                                                }
                                                format(stream, $str_alt92$_);
                                            } else {
                                                if (pcase_var.eql($DEFAULT)) {
                                                    format(stream, $$$INVALID_DATA_TYPE);
                                                }
                                            }
                                        }
                                    }
                                }
                                format(stream, $str_alt95$_);
                            }
                        } else {
                            format(stream, $str_alt77$__red_element_struct_key____s_, red_element_struct_key_string(v_object));
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        red_element_dispose(rse);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return v_object;
    }

    public static SubLObject print_red_element_struct(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        assert NIL != red_element_struct_p(v_object) : "! red_api.red_element_struct_p(v_object) " + "red_api.red_element_struct_p error :" + v_object;
        final SubLObject rse = red_element_instantiate(v_object);
        try {
            if (NIL == rse) {
                format(stream, $str92$__red_element_struct_key____s_, red_element_struct_key_string(v_object));
            } else {
                final SubLObject element = funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
                if (NIL != element) {
                    final SubLObject datatype = funcall(RED_GET_DATATYPE_STRING_IMPLEMENTATION, element);
                    final SubLObject dt = red_element_get_datatype_internal(rse);
                    format(stream, $str95$__red_element_struct_key___s_type, red_element_struct_key_string(v_object), datatype);
                    final SubLObject pcase_var = dt;
                    if (pcase_var.eql($STRING)) {
                        format(stream, $str97$value____s, funcall(RED_GET_STRING_VALUE_IMPLEMENTATION, element));
                    } else
                        if (pcase_var.eql($INTEGER)) {
                            format(stream, $str100$value____d, funcall(RED_GET_INT32_VALUE_IMPLEMENTATION, element));
                        } else
                            if (pcase_var.eql($BLOB)) {
                                format(stream, $str103$BlobValue____);
                                final SubLObject bval = red_implementation.red_get_blob_value_ext(element);
                                for (SubLObject numelts = length(bval), index = ZERO_INTEGER; index.numL(numelts); index = add(index, ONE_INTEGER)) {
                                    SubLObject v = format(NIL, $str104$_x, aref(bval, index));
                                    if (length(v).numE(ONE_INTEGER)) {
                                        v = cconcatenate($$$0, v);
                                    }
                                    format(stream, $str106$_a, v);
                                }
                                format(stream, $str107$_);
                            } else
                                if (pcase_var.eql($DEFAULT)) {
                                    format(stream, $$$INVALID_DATA_TYPE);
                                }



                    format(stream, $str110$_);
                } else {
                    format(stream, $str92$__red_element_struct_key____s_, red_element_struct_key_string(v_object));
                }
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                red_element_dispose(rse);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return v_object;
    }

    /**
     * Get the number of repositories in red-repository-list-struct
     *
     * @param red-repository-list;
     * 		the red-repository-list-struct whose member repositories are to be counted.
     * @return integer; the number of repositories in the red-list-struct
     */
    @LispMethod(comment = "Get the number of repositories in red-repository-list-struct\r\n\r\n@param red-repository-list;\r\n\t\tthe red-repository-list-struct whose member repositories are to be counted.\r\n@return integer; the number of repositories in the red-list-struct")
    public static final SubLObject red_get_repository_list_length_alt(SubLObject red_repository_list) {
        red_get_object();
        SubLTrampolineFile.checkType(red_repository_list, RED_REPOSITORY_LIST_STRUCT_P);
        {
            SubLObject type = red_repository_list_struct_type(red_repository_list);
            SubLObject pcase_var = type;
            if (pcase_var.eql($SYSTEM)) {
                {
                    SubLObject sysr = red_get_system_repository(UNPROVIDED);
                    if (NIL != sysr) {
                        return ONE_INTEGER;
                    } else {
                        return ZERO_INTEGER;
                    }
                }
            } else {
                if (pcase_var.eql($MACHINE)) {
                    {
                        SubLObject machr = red_get_machine_repository(UNPROVIDED);
                        if (NIL != machr) {
                            return ONE_INTEGER;
                        } else {
                            return ZERO_INTEGER;
                        }
                    }
                } else {
                    if (pcase_var.eql($MACHINE_SYSTEM) || pcase_var.eql($SYSTEM_MACHINE)) {
                        {
                            SubLObject machr = red_get_machine_repository(UNPROVIDED);
                            SubLObject sysr = red_get_system_repository(UNPROVIDED);
                            SubLObject num = ZERO_INTEGER;
                            if (NIL != machr) {
                                num = add(num, ONE_INTEGER);
                            }
                            if (NIL != sysr) {
                                num = add(num, ONE_INTEGER);
                            }
                            return num;
                        }
                    } else {
                        if (pcase_var.eql($APPLICATION)) {
                            {
                                SubLObject red = red_get_object_bare();
                                return funcall(RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION, red);
                            }
                        } else {
                            if (pcase_var.eql($MOST_PRIVILEGED) || pcase_var.eql($LEAST_PRIVILEGED)) {
                                {
                                    SubLObject red = red_get_object_bare();
                                    return funcall(RED_NUMBER_REPOSITORIES_IMPLEMENTATION, red);
                                }
                            } else {
                                return MINUS_ONE_INTEGER;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Get the number of repositories in red-repository-list-struct
     *
     * @param red-repository-list;
     * 		the red-repository-list-struct whose member repositories are to be counted.
     * @return integer; the number of repositories in the red-list-struct
     */
    @LispMethod(comment = "Get the number of repositories in red-repository-list-struct\r\n\r\n@param red-repository-list;\r\n\t\tthe red-repository-list-struct whose member repositories are to be counted.\r\n@return integer; the number of repositories in the red-list-struct")
    public static SubLObject red_get_repository_list_length(final SubLObject red_repository_list) {
        red_get_object();
        assert NIL != red_repository_list_struct_p(red_repository_list) : "! red_api.red_repository_list_struct_p(red_repository_list) " + ("red_api.red_repository_list_struct_p(red_repository_list) " + "CommonSymbols.NIL != red_api.red_repository_list_struct_p(red_repository_list) ") + red_repository_list;
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = red_repository_list_struct_type(red_repository_list);
        if (pcase_var.eql($SYSTEM)) {
            final SubLObject sysr = red_get_system_repository(UNPROVIDED);
            if (NIL != sysr) {
                return ONE_INTEGER;
            }
            return ZERO_INTEGER;
        } else
            if (pcase_var.eql($MACHINE)) {
                final SubLObject machr = red_get_machine_repository(UNPROVIDED);
                if (NIL != machr) {
                    return ONE_INTEGER;
                }
                return ZERO_INTEGER;
            } else {
                if (pcase_var.eql($MACHINE_SYSTEM) || pcase_var.eql($SYSTEM_MACHINE)) {
                    final SubLObject machr = red_get_machine_repository(UNPROVIDED);
                    final SubLObject sysr2 = red_get_system_repository(UNPROVIDED);
                    SubLObject num = ZERO_INTEGER;
                    if (NIL != machr) {
                        num = add(num, ONE_INTEGER);
                    }
                    if (NIL != sysr2) {
                        num = add(num, ONE_INTEGER);
                    }
                    return num;
                }
                if (pcase_var.eql($APPLICATION)) {
                    final SubLObject red = red_get_object_bare();
                    return funcall(RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION, red);
                }
                if (pcase_var.eql($MOST_PRIVILEGED) || pcase_var.eql($LEAST_PRIVILEGED)) {
                    final SubLObject red = red_get_object_bare();
                    return funcall(RED_NUMBER_REPOSITORIES_IMPLEMENTATION, red);
                }
                return MINUS_ONE_INTEGER;
            }

    }

    /**
     * Get the key string of the red-element structs
     *
     * @param red-elemen-struct;
     * 		any red-element structure
     * @return string; the key string of the red-element-struct
     */
    @LispMethod(comment = "Get the key string of the red-element structs\r\n\r\n@param red-elemen-struct;\r\n\t\tany red-element structure\r\n@return string; the key string of the red-element-struct")
    public static final SubLObject red_element_get_key_alt(SubLObject red_element_struct) {
        SubLTrampolineFile.checkType(red_element_struct, RED_ELEMENT_STRUCT_P);
        return red_element_struct_key_string(red_element_struct);
    }

    /**
     * Get the key string of the red-element structs
     *
     * @param red-elemen-struct;
     * 		any red-element structure
     * @return string; the key string of the red-element-struct
     */
    @LispMethod(comment = "Get the key string of the red-element structs\r\n\r\n@param red-elemen-struct;\r\n\t\tany red-element structure\r\n@return string; the key string of the red-element-struct")
    public static SubLObject red_element_get_key(final SubLObject red_element_struct) {
        assert NIL != red_element_struct_p(red_element_struct) : "! red_api.red_element_struct_p(red_element_struct) " + ("red_api.red_element_struct_p(red_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(red_element_struct) ") + red_element_struct;
        return red_element_struct_key_string(red_element_struct);
    }

    /**
     * Get the datatype keywork associated with the datatype of the value of the red-element struct
     *
     * @param red-elemen-struct;
     * 		any red-element structure
     * @return keyword; :string when the value datatype is string
    :integer when the value datatype is integer and
    :blob when the value datatype is blob(a vector of bytes of binary data
     */
    @LispMethod(comment = "Get the datatype keywork associated with the datatype of the value of the red-element struct\r\n\r\n@param red-elemen-struct;\r\n\t\tany red-element structure\r\n@return keyword; :string when the value datatype is string\r\n:integer when the value datatype is integer and\r\n:blob when the value datatype is blob(a vector of bytes of binary data")
    public static final SubLObject red_element_get_datatype_alt(SubLObject red_element_struct) {
        SubLTrampolineFile.checkType(red_element_struct, RED_ELEMENT_STRUCT_P);
        {
            SubLObject rse = red_element_instantiate(red_element_struct);
            SubLObject retval = NIL;
            if (NIL == rse) {
                return retval;
            }
            try {
                retval = red_element_get_datatype_internal(rse);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        red_element_dispose(rse);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return retval;
        }
    }

    /**
     * Get the datatype keywork associated with the datatype of the value of the red-element struct
     *
     * @param red-elemen-struct;
     * 		any red-element structure
     * @return keyword; :string when the value datatype is string
    :integer when the value datatype is integer and
    :blob when the value datatype is blob(a vector of bytes of binary data
     */
    @LispMethod(comment = "Get the datatype keywork associated with the datatype of the value of the red-element struct\r\n\r\n@param red-elemen-struct;\r\n\t\tany red-element structure\r\n@return keyword; :string when the value datatype is string\r\n:integer when the value datatype is integer and\r\n:blob when the value datatype is blob(a vector of bytes of binary data")
    public static SubLObject red_element_get_datatype(final SubLObject red_element_struct) {
        assert NIL != red_element_struct_p(red_element_struct) : "! red_api.red_element_struct_p(red_element_struct) " + ("red_api.red_element_struct_p(red_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(red_element_struct) ") + red_element_struct;
        final SubLObject rse = red_element_instantiate(red_element_struct);
        SubLObject retval = NIL;
        if (NIL == rse) {
            return retval;
        }
        try {
            retval = red_element_get_datatype_internal(rse);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                red_element_dispose(rse);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return retval;
    }

    /**
     * Get the value of the red-element struct
     *
     * @param red-elemen-struct;
     * 		any red-element structure
     * @return value; the value of the red-element-struct. Its value type is as follows:
    when value datatype is :string, a string
    when value datatype is :integer, an integer
    when value datatype is :blob a byte-vector
     */
    @LispMethod(comment = "Get the value of the red-element struct\r\n\r\n@param red-elemen-struct;\r\n\t\tany red-element structure\r\n@return value; the value of the red-element-struct. Its value type is as follows:\r\nwhen value datatype is :string, a string\r\nwhen value datatype is :integer, an integer\r\nwhen value datatype is :blob a byte-vector")
    public static final SubLObject red_element_get_value_alt(SubLObject red_element_struct) {
        SubLTrampolineFile.checkType(red_element_struct, RED_ELEMENT_STRUCT_P);
        {
            SubLObject rse = red_element_instantiate(red_element_struct);
            SubLObject retval = NIL;
            if (NIL == rse) {
                return retval;
            }
            try {
                {
                    SubLObject rs = funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
                    SubLObject datatype = red_element_get_datatype_internal(rse);
                    SubLObject pcase_var = datatype;
                    if (pcase_var.eql($STRING)) {
                        retval = funcall(RED_GET_STRING_VALUE_IMPLEMENTATION, rs);
                    } else {
                        if (pcase_var.eql($INTEGER)) {
                            retval = funcall(RED_GET_INT32_VALUE_IMPLEMENTATION, rs);
                        } else {
                            if (pcase_var.eql($BLOB)) {
                                retval = cfasl_decode(red_int_vector_to_byte_vector(red_implementation.red_get_blob_value_ext(rs)));
                            } else {
                                if (pcase_var.eql($DEFAULT)) {
                                    retval = NIL;
                                }
                            }
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        red_element_dispose(rse);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return retval;
        }
    }

    /**
     * Get the value of the red-element struct
     *
     * @param red-elemen-struct;
     * 		any red-element structure
     * @return value; the value of the red-element-struct. Its value type is as follows:
    when value datatype is :string, a string
    when value datatype is :integer, an integer
    when value datatype is :blob a byte-vector
     */
    @LispMethod(comment = "Get the value of the red-element struct\r\n\r\n@param red-elemen-struct;\r\n\t\tany red-element structure\r\n@return value; the value of the red-element-struct. Its value type is as follows:\r\nwhen value datatype is :string, a string\r\nwhen value datatype is :integer, an integer\r\nwhen value datatype is :blob a byte-vector")
    public static SubLObject red_element_get_value(final SubLObject red_element_struct) {
        assert NIL != red_element_struct_p(red_element_struct) : "! red_api.red_element_struct_p(red_element_struct) " + ("red_api.red_element_struct_p(red_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(red_element_struct) ") + red_element_struct;
        final SubLObject rse = red_element_instantiate(red_element_struct);
        SubLObject retval = NIL;
        if (NIL == rse) {
            return retval;
        }
        try {
            final SubLObject rs = funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
            final SubLObject pcase_var;
            final SubLObject datatype = pcase_var = red_element_get_datatype_internal(rse);
            if (pcase_var.eql($STRING)) {
                retval = funcall(RED_GET_STRING_VALUE_IMPLEMENTATION, rs);
            } else
                if (pcase_var.eql($INTEGER)) {
                    retval = funcall(RED_GET_INT32_VALUE_IMPLEMENTATION, rs);
                } else
                    if (pcase_var.eql($BLOB)) {
                        retval = cfasl_decode(red_int_vector_to_byte_vector(red_implementation.red_get_blob_value_ext(rs)));
                    } else
                        if (pcase_var.eql($DEFAULT)) {
                            retval = NIL;
                        }



        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                red_element_dispose(rse);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return retval;
    }

    /**
     * returns the cfasl decode of a red-element-struct with a blob value
     *
     * @param red-elemen-struct;
     * 		any red-element structure with a datatype of :blob
     * @return string; the cfasl-decoded value of the blob value
     */
    @LispMethod(comment = "returns the cfasl decode of a red-element-struct with a blob value\r\n\r\n@param red-elemen-struct;\r\n\t\tany red-element structure with a datatype of :blob\r\n@return string; the cfasl-decoded value of the blob value")
    public static final SubLObject red_element_get_value_cfasl_decode_alt(SubLObject red_element_struct) {
        SubLTrampolineFile.checkType(red_element_struct, RED_ELEMENT_STRUCT_P);
        return cfasl_decode(red_element_get_value(red_element_struct));
    }

    /**
     * returns the cfasl decode of a red-element-struct with a blob value
     *
     * @param red-elemen-struct;
     * 		any red-element structure with a datatype of :blob
     * @return string; the cfasl-decoded value of the blob value
     */
    @LispMethod(comment = "returns the cfasl decode of a red-element-struct with a blob value\r\n\r\n@param red-elemen-struct;\r\n\t\tany red-element structure with a datatype of :blob\r\n@return string; the cfasl-decoded value of the blob value")
    public static SubLObject red_element_get_value_cfasl_decode(final SubLObject red_element_struct) {
        assert NIL != red_element_struct_p(red_element_struct) : "! red_api.red_element_struct_p(red_element_struct) " + ("red_api.red_element_struct_p(red_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(red_element_struct) ") + red_element_struct;
        return cfasl_decode(red_element_get_value(red_element_struct));
    }

    /**
     * Get the repository-element struct whose key is key-string within the given repository-list struct
     *
     * @param repository-list;
     * 		the red-repository-list-struct in which we are to search.
     * @return red-element-struct; with the key key-string or nil if its not found
     */
    @LispMethod(comment = "Get the repository-element struct whose key is key-string within the given repository-list struct\r\n\r\n@param repository-list;\r\n\t\tthe red-repository-list-struct in which we are to search.\r\n@return red-element-struct; with the key key-string or nil if its not found")
    public static final SubLObject red_get_element_alt(SubLObject repository_list, SubLObject key_string) {
        SubLTrampolineFile.checkType(repository_list, RED_REPOSITORY_LIST_STRUCT_P);
        SubLTrampolineFile.checkType(key_string, STRINGP);
        {
            SubLObject re = red_element_struct_create(repository_list, key_string);
            if (NIL != red_element_get_key_exists_p(re)) {
                return re;
            }
            return NIL;
        }
    }

    /**
     * Get the repository-element struct whose key is key-string within the given repository-list struct
     *
     * @param repository-list;
     * 		the red-repository-list-struct in which we are to search.
     * @return red-element-struct; with the key key-string or nil if its not found
     */
    @LispMethod(comment = "Get the repository-element struct whose key is key-string within the given repository-list struct\r\n\r\n@param repository-list;\r\n\t\tthe red-repository-list-struct in which we are to search.\r\n@return red-element-struct; with the key key-string or nil if its not found")
    public static SubLObject red_get_element(final SubLObject repository_list, final SubLObject key_string) {
        assert NIL != red_repository_list_struct_p(repository_list) : "! red_api.red_repository_list_struct_p(repository_list) " + ("red_api.red_repository_list_struct_p(repository_list) " + "CommonSymbols.NIL != red_api.red_repository_list_struct_p(repository_list) ") + repository_list;
        assert NIL != stringp(key_string) : "! stringp(key_string) " + ("Types.stringp(key_string) " + "CommonSymbols.NIL != Types.stringp(key_string) ") + key_string;
        final SubLObject re = red_element_struct_create(repository_list, key_string);
        if (NIL != red_element_get_key_exists_p(re)) {
            return re;
        }
        return NIL;
    }

    public static final SubLObject red_element_get_value_type_alt(SubLObject red_element_struct) {
        SubLTrampolineFile.checkType(red_element_struct, RED_ELEMENT_STRUCT_P);
        {
            SubLObject rse = red_element_instantiate(red_element_struct);
            SubLObject retval = NIL;
            if (NIL == rse) {
                return retval;
            }
            try {
                {
                    SubLObject rs = funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
                    if (NIL != rs) {
                        retval = funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rs);
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        red_element_dispose(rse);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return retval;
        }
    }

    public static SubLObject red_element_get_value_type(final SubLObject red_element_struct) {
        assert NIL != red_element_struct_p(red_element_struct) : "! red_api.red_element_struct_p(red_element_struct) " + ("red_api.red_element_struct_p(red_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(red_element_struct) ") + red_element_struct;
        final SubLObject rse = red_element_instantiate(red_element_struct);
        SubLObject retval = NIL;
        if (NIL == rse) {
            return retval;
        }
        try {
            final SubLObject rs = funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
            if (NIL != rs) {
                retval = funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rs);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                red_element_dispose(rse);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return retval;
    }

    /**
     * Get the repository-element struct whose key is key-string within the given repository-element struct
     *
     * @param repository-element-struct;
     * 		the red-repository-element-struct in which we are to search.
     * @return red-element-struct; with the key key-string or nil if its not found
     */
    @LispMethod(comment = "Get the repository-element struct whose key is key-string within the given repository-element struct\r\n\r\n@param repository-element-struct;\r\n\t\tthe red-repository-element-struct in which we are to search.\r\n@return red-element-struct; with the key key-string or nil if its not found")
    public static final SubLObject red_get_element_get_sub_element_by_key_alt(SubLObject repository_element_struct, SubLObject key_string) {
        SubLTrampolineFile.checkType(repository_element_struct, RED_ELEMENT_STRUCT_P);
        SubLTrampolineFile.checkType(key_string, STRINGP);
        {
            SubLObject parent_key = red_element_struct_key_string(repository_element_struct);
            SubLObject repository_list = red_element_struct_repository_list(repository_element_struct);
            SubLObject key = red_makekey(parent_key, key_string);
            return red_get_element(repository_list, key);
        }
    }

    /**
     * Get the repository-element struct whose key is key-string within the given repository-element struct
     *
     * @param repository-element-struct;
     * 		the red-repository-element-struct in which we are to search.
     * @return red-element-struct; with the key key-string or nil if its not found
     */
    @LispMethod(comment = "Get the repository-element struct whose key is key-string within the given repository-element struct\r\n\r\n@param repository-element-struct;\r\n\t\tthe red-repository-element-struct in which we are to search.\r\n@return red-element-struct; with the key key-string or nil if its not found")
    public static SubLObject red_get_element_get_sub_element_by_key(final SubLObject repository_element_struct, final SubLObject key_string) {
        assert NIL != red_element_struct_p(repository_element_struct) : "! red_api.red_element_struct_p(repository_element_struct) " + ("red_api.red_element_struct_p(repository_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(repository_element_struct) ") + repository_element_struct;
        assert NIL != stringp(key_string) : "! stringp(key_string) " + ("Types.stringp(key_string) " + "CommonSymbols.NIL != Types.stringp(key_string) ") + key_string;
        final SubLObject parent_key = red_element_struct_key_string(repository_element_struct);
        final SubLObject repository_list = red_element_struct_repository_list(repository_element_struct);
        final SubLObject key = red_makekey(parent_key, key_string);
        return red_get_element(repository_list, key);
    }

    /**
     * Get the list of sub red-element structs that are sub elements of red-element-struct
     *
     * @param red-elemen-struct;
     * 		any red-element structure
     * @return red-element-struct-lisp; a list of all of the sub-elements of the input red-element-struct
     */
    @LispMethod(comment = "Get the list of sub red-element structs that are sub elements of red-element-struct\r\n\r\n@param red-elemen-struct;\r\n\t\tany red-element structure\r\n@return red-element-struct-lisp; a list of all of the sub-elements of the input red-element-struct")
    public static final SubLObject red_element_get_sub_elements_alt(SubLObject red_element_struct) {
        SubLTrampolineFile.checkType(red_element_struct, RED_ELEMENT_STRUCT_P);
        {
            SubLObject parent_key = red_element_struct_key_string(red_element_struct);
            SubLObject rep_list = red_element_struct_repository_list(red_element_struct);
            SubLObject retval = NIL;
            SubLObject rse = red_element_instantiate(red_element_struct);
            if (NIL == rse) {
                return retval;
            }
            try {
                {
                    SubLObject rsi = funcall(RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION, rse);
                    if (NIL != rsi) {
                        try {
                            if ((NIL == parent_key) || ZERO_INTEGER.numE(length(parent_key))) {
                                parent_key = $str_alt98$;
                            }
                            while (NIL != numNE(ZERO_INTEGER, funcall(RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION, rsi))) {
                                {
                                    SubLObject cre = funcall(RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION, rsi);
                                    if (NIL != numNE(cre, ZERO_INTEGER)) {
                                        try {
                                            {
                                                SubLObject child_key = funcall(RED_GET_KEY_IMPLEMENTATION, funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, cre));
                                                SubLObject new_red_element = NIL;
                                                child_key = red_makekey(parent_key, child_key);
                                                new_red_element = red_element_struct_create(rep_list, child_key);
                                                retval = cons(new_red_element, retval);
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                try {
                                                    bind($is_thread_performing_cleanupP$, T);
                                                    funcall(RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, cre);
                                                } finally {
                                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                }
                                            }
                                        }
                                    }
                                }
                            } 
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    funcall(RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION, rsi);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        red_element_dispose(rse);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return reverse(retval);
        }
    }

    /**
     * Get the list of sub red-element structs that are sub elements of red-element-struct
     *
     * @param red-elemen-struct;
     * 		any red-element structure
     * @return red-element-struct-lisp; a list of all of the sub-elements of the input red-element-struct
     */
    @LispMethod(comment = "Get the list of sub red-element structs that are sub elements of red-element-struct\r\n\r\n@param red-elemen-struct;\r\n\t\tany red-element structure\r\n@return red-element-struct-lisp; a list of all of the sub-elements of the input red-element-struct")
    public static SubLObject red_element_get_sub_elements(final SubLObject red_element_struct) {
        assert NIL != red_element_struct_p(red_element_struct) : "! red_api.red_element_struct_p(red_element_struct) " + ("red_api.red_element_struct_p(red_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(red_element_struct) ") + red_element_struct;
        SubLObject parent_key = red_element_struct_key_string(red_element_struct);
        final SubLObject rep_list = red_element_struct_repository_list(red_element_struct);
        SubLObject retval = NIL;
        final SubLObject rse = red_element_instantiate(red_element_struct);
        if (NIL == rse) {
            return retval;
        }
        try {
            final SubLObject rsi = funcall(RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION, rse);
            if (NIL != rsi) {
                try {
                    if ((NIL == parent_key) || ZERO_INTEGER.numE(length(parent_key))) {
                        parent_key = $str113$;
                    }
                    while (NIL != numNE(ZERO_INTEGER, funcall(RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION, rsi))) {
                        final SubLObject cre = funcall(RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION, rsi);
                        if (NIL != numNE(cre, ZERO_INTEGER)) {
                            try {
                                SubLObject child_key = funcall(RED_GET_KEY_IMPLEMENTATION, funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, cre));
                                SubLObject new_red_element = NIL;
                                child_key = red_makekey(parent_key, child_key);
                                new_red_element = red_element_struct_create(rep_list, child_key);
                                retval = cons(new_red_element, retval);
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    funcall(RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, cre);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    } 
                } finally {
                    final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values2 = getValuesAsVector();
                        funcall(RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION, rsi);
                        restoreValuesFromVector(_values2);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values3 = getValuesAsVector();
                red_element_dispose(rse);
                restoreValuesFromVector(_values3);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_3);
            }
        }
        return reverse(retval);
    }

    public static final SubLObject red_element_get_sub_elements_recursive_alt(SubLObject red_element_struct) {
        {
            SubLObject ret_list = NIL;
            SubLObject tmp_list = red_element_get_sub_elements(red_element_struct);
            if (NIL == tmp_list) {
                return NIL;
            }
            {
                SubLObject cdolist_list_var = tmp_list;
                SubLObject elt = NIL;
                for (elt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elt = cdolist_list_var.first()) {
                    {
                        SubLObject subelts = red_element_get_sub_elements_recursive(elt);
                        ret_list = cons(elt, ret_list);
                        ret_list = append(subelts, ret_list);
                    }
                }
            }
            return ret_list;
        }
    }

    public static SubLObject red_element_get_sub_elements_recursive(final SubLObject red_element_struct) {
        SubLObject ret_list = NIL;
        final SubLObject tmp_list = red_element_get_sub_elements(red_element_struct);
        if (NIL == tmp_list) {
            return NIL;
        }
        SubLObject cdolist_list_var = tmp_list;
        SubLObject elt = NIL;
        elt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject subelts = red_element_get_sub_elements_recursive(elt);
            ret_list = cons(elt, ret_list);
            ret_list = append(subelts, ret_list);
            cdolist_list_var = cdolist_list_var.rest();
            elt = cdolist_list_var.first();
        } 
        return ret_list;
    }

    public static final SubLObject red_get_top_element_alt(SubLObject repository_struct) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        {
            SubLObject rep_obj = red_repository_get_repository_object(repository_struct);
            SubLObject valid = red_repository_struct_valid_p(repository_struct);
            SubLObject top_elt = funcall(RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION, rep_obj);
            if (NIL == valid) {
                return NIL;
            }
            if (NIL == top_elt) {
                return NIL;
            }
            return top_elt;
        }
    }

    public static SubLObject red_get_top_element(final SubLObject repository_struct) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        final SubLObject rep_obj = red_repository_get_repository_object(repository_struct);
        final SubLObject valid = red_repository_struct_valid_p(repository_struct);
        final SubLObject top_elt = funcall(RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION, rep_obj);
        if (NIL == valid) {
            return NIL;
        }
        if (NIL == top_elt) {
            return NIL;
        }
        return top_elt;
    }

    public static final SubLObject red_get_all_elements_of_repository_alt(SubLObject repository_struct) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        {
            SubLObject rep_obj = red_repository_get_repository_object(repository_struct);
            SubLObject valid = red_repository_struct_valid_p(repository_struct);
            SubLObject top_elt = funcall(RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION, rep_obj);
            if (NIL == valid) {
                return NIL;
            }
            if (NIL == top_elt) {
                return NIL;
            }
            return red_get_repository_get_all_elements($str_alt98$, top_elt);
        }
    }

    public static SubLObject red_get_all_elements_of_repository(final SubLObject repository_struct) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        final SubLObject rep_obj = red_repository_get_repository_object(repository_struct);
        final SubLObject valid = red_repository_struct_valid_p(repository_struct);
        final SubLObject top_elt = funcall(RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION, rep_obj);
        if (NIL == valid) {
            return NIL;
        }
        if (NIL == top_elt) {
            return NIL;
        }
        return red_get_repository_get_all_elements($str113$, top_elt);
    }

    public static final SubLObject red_get_repository_get_all_elements_alt(SubLObject prefix_string, SubLObject red_elt) {
        {
            SubLObject subkey_iter = funcall(RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION, red_elt);
            SubLObject retval = NIL;
            if (NIL == subkey_iter) {
                return NIL;
            }
            while (!funcall(RED_ITERATOR_HAS_NEXT_IMPLEMENTATION, subkey_iter).numE(ZERO_INTEGER)) {
                {
                    SubLObject subelt = funcall(RED_ITERATOR_NEXT_IMPLEMENTATION, subkey_iter);
                    SubLObject redkvt = red_get_key_value_type(prefix_string, subelt);
                    retval = cons(redkvt, retval);
                    retval = append(red_get_repository_get_all_elements(redkvt.first(), subelt), retval);
                }
            } 
            funcall(RED_ITERATOR_DISPOSE_IMPLEMENTATION, subkey_iter);
            return retval;
        }
    }

    public static SubLObject red_get_repository_get_all_elements(final SubLObject prefix_string, final SubLObject red_elt) {
        final SubLObject subkey_iter = funcall(RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION, red_elt);
        SubLObject retval = NIL;
        if (NIL == subkey_iter) {
            return NIL;
        }
        while (!funcall(RED_ITERATOR_HAS_NEXT_IMPLEMENTATION, subkey_iter).numE(ZERO_INTEGER)) {
            final SubLObject subelt = funcall(RED_ITERATOR_NEXT_IMPLEMENTATION, subkey_iter);
            final SubLObject redkvt = red_get_key_value_type(prefix_string, subelt);
            retval = cons(redkvt, retval);
            retval = append(red_get_repository_get_all_elements(redkvt.first(), subelt), retval);
        } 
        funcall(RED_ITERATOR_DISPOSE_IMPLEMENTATION, subkey_iter);
        return retval;
    }

    public static final SubLObject red_get_key_value_type_alt(SubLObject prefix, SubLObject red_elt) {
        {
            SubLObject key = red_makekey(prefix, funcall(RED_GET_KEY_IMPLEMENTATION, red_elt));
            SubLObject datatype = red_translate_datatype_string(funcall(RED_GET_DATATYPE_STRING_IMPLEMENTATION, red_elt));
            SubLObject value = NIL;
            SubLObject pcase_var = datatype;
            if (pcase_var.eql($STRING)) {
                value = funcall(RED_GET_STRING_VALUE_IMPLEMENTATION, red_elt);
            } else {
                if (pcase_var.eql($INTEGER)) {
                    value = funcall(RED_GET_INT32_VALUE_IMPLEMENTATION, red_elt);
                } else {
                    if (pcase_var.eql($BLOB)) {
                        value = red_int_vector_to_byte_vector(red_implementation.red_get_blob_value_ext(red_elt));
                    } else {
                        if (pcase_var.eql($INVALID)) {
                            return NIL;
                        }
                    }
                }
            }
            return list(key, value, datatype);
        }
    }

    public static SubLObject red_get_key_value_type(final SubLObject prefix, final SubLObject red_elt) {
        final SubLObject key = red_makekey(prefix, funcall(RED_GET_KEY_IMPLEMENTATION, red_elt));
        final SubLObject datatype = red_translate_datatype_string(funcall(RED_GET_DATATYPE_STRING_IMPLEMENTATION, red_elt));
        SubLObject value = NIL;
        final SubLObject pcase_var = datatype;
        if (pcase_var.eql($STRING)) {
            value = funcall(RED_GET_STRING_VALUE_IMPLEMENTATION, red_elt);
        } else
            if (pcase_var.eql($INTEGER)) {
                value = funcall(RED_GET_INT32_VALUE_IMPLEMENTATION, red_elt);
            } else
                if (pcase_var.eql($BLOB)) {
                    value = red_int_vector_to_byte_vector(red_implementation.red_get_blob_value_ext(red_elt));
                } else
                    if (pcase_var.eql($INVALID)) {
                        return NIL;
                    }



        return list(key, value, datatype);
    }

    public static final SubLObject red_makekey_alt(SubLObject prefix, SubLObject key) {
        if (prefix.equal($str_alt98$)) {
            return key;
        }
        return cconcatenate(prefix, new SubLObject[]{ $str_alt110$_, key });
    }

    public static SubLObject red_makekey(final SubLObject prefix, final SubLObject key) {
        if (prefix.equal($str113$)) {
            return key;
        }
        return cconcatenate(prefix, new SubLObject[]{ $str125$_, key });
    }

    public static final SubLObject red_get_filename_alt(SubLObject red_repository_struct) {
        {
            SubLObject red_obj = red_repository_get_repository_object(red_repository_struct);
            SubLObject valid = red_repository_struct_valid_p(red_repository_struct);
            if (NIL == valid) {
                return NIL;
            }
            return red_get_filename_from_object(red_obj);
        }
    }

    public static SubLObject red_get_filename(final SubLObject red_repository_struct) {
        final SubLObject red_obj = red_repository_get_repository_object(red_repository_struct);
        final SubLObject valid = red_repository_struct_valid_p(red_repository_struct);
        if (NIL == valid) {
            return NIL;
        }
        return red_get_filename_from_object(red_obj);
    }

    public static final SubLObject red_get_filename_from_object_alt(SubLObject red_obj) {
        {
            SubLObject filename = funcall(RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION, red_obj);
            return filename;
        }
    }

    public static SubLObject red_get_filename_from_object(final SubLObject red_obj) {
        final SubLObject filename = funcall(RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION, red_obj);
        return filename;
    }

    public static final SubLObject red_get_repository_with_filename_alt(SubLObject filename) {
        {
            SubLObject repobj = red_get_repository_object_with_filename(filename);
            if (NIL == repobj) {
                return NIL;
            }
            return red_repository_object_wrap(repobj);
        }
    }

    public static SubLObject red_get_repository_with_filename(final SubLObject filename) {
        final SubLObject repobj = red_get_repository_object_with_filename(filename);
        if (NIL == repobj) {
            return NIL;
        }
        return red_repository_object_wrap(repobj);
    }

    public static final SubLObject red_get_repository_object_with_filename_alt(SubLObject filename) {
        {
            SubLObject repobj = dictionary.dictionary_lookup($red_filenames$.getGlobalValue(), filename, UNPROVIDED);
            if (NIL == repobj) {
                return NIL;
            }
            {
                SubLObject valid = funcall(RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, red_get_object_bare(), repobj);
                if (valid == ZERO_INTEGER) {
                    return NIL;
                }
                return repobj;
            }
        }
    }

    public static SubLObject red_get_repository_object_with_filename(final SubLObject filename) {
        final SubLObject repobj = dictionary.dictionary_lookup($red_filenames$.getGlobalValue(), filename, UNPROVIDED);
        if (NIL == repobj) {
            return NIL;
        }
        final SubLObject valid = funcall(RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, red_get_object_bare(), repobj);
        if (valid.eql(ZERO_INTEGER)) {
            return NIL;
        }
        return repobj;
    }

    public static final SubLObject red_remove_repository_alt(SubLObject rep_obj) {
        SubLTrampolineFile.checkType(rep_obj, RED_REPOSITORY_OBJECT_VALID_P);
        {
            SubLObject filename = red_get_filename_from_object(rep_obj);
            funcall(RED_REPOSITORY_DISPOSE_IMPLEMENTATION, rep_obj);
            dictionary.dictionary_remove($red_filenames$.getGlobalValue(), filename);
            return filename;
        }
    }

    public static SubLObject red_remove_repository(final SubLObject rep_obj) {
        assert NIL != red_repository_object_valid_p(rep_obj) : "! red_api.red_repository_object_valid_p(rep_obj) " + ("red_api.red_repository_object_valid_p(rep_obj) " + "CommonSymbols.NIL != red_api.red_repository_object_valid_p(rep_obj) ") + rep_obj;
        final SubLObject filename = red_get_filename_from_object(rep_obj);
        funcall(RED_REPOSITORY_DISPOSE_IMPLEMENTATION, rep_obj);
        dictionary.dictionary_remove($red_filenames$.getGlobalValue(), filename);
        return filename;
    }

    public static final SubLObject red_cond_create_repository_filenames_alt() {
        if (NIL != $red_filenames$.getGlobalValue()) {
            return NIL;
        }
        $red_filenames$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        {
            SubLObject repository_list = red_repository_list_struct_create($LEAST_PRIVILEGED);
            SubLObject rep_list = red_repository_list_instantiate(repository_list);
            try {
                {
                    SubLObject num = red_get_repository_list_length(repository_list);
                    SubLObject index = ZERO_INTEGER;
                    if (num != ZERO_INTEGER) {
                        while (index.numL(num)) {
                            {
                                SubLObject cobj = funcall(RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION, rep_list, index);
                                SubLObject filename = funcall(RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION, cobj);
                                dictionary.dictionary_enter($red_filenames$.getGlobalValue(), filename, cobj);
                            }
                            index = add(index, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        red_repository_list_dispose(rep_list);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject red_cond_create_repository_filenames() {
        if (NIL != $red_filenames$.getGlobalValue()) {
            return NIL;
        }
        $red_filenames$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        final SubLObject repository_list = red_repository_list_struct_create($LEAST_PRIVILEGED);
        final SubLObject rep_list = red_repository_list_instantiate(repository_list);
        try {
            final SubLObject num = red_get_repository_list_length(repository_list);
            SubLObject index = ZERO_INTEGER;
            if (!num.eql(ZERO_INTEGER)) {
                while (index.numL(num)) {
                    final SubLObject cobj = funcall(RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION, rep_list, index);
                    final SubLObject filename = funcall(RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION, cobj);
                    dictionary.dictionary_enter($red_filenames$.getGlobalValue(), filename, cobj);
                    index = add(index, ONE_INTEGER);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                red_repository_list_dispose(rep_list);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return T;
    }

    /**
     * Get the System repository for the red system, or nil if one doesn't exist
     *
     * @param optional
     * 		red; a red system object, the non default value should only be used for testing
     * @return red-repository-struct; the system repository
     */
    @LispMethod(comment = "Get the System repository for the red system, or nil if one doesn\'t exist\r\n\r\n@param optional\r\n\t\tred; a red system object, the non default value should only be used for testing\r\n@return red-repository-struct; the system repository")
    public static final SubLObject red_get_system_repository_alt(SubLObject red) {
        if (red == UNPROVIDED) {
            red = red_get_object();
        }
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        SubLTrampolineFile.checkType(red, RED_STRUCT_P);
        {
            SubLObject redobj = red_struct_cobj(red);
            SubLObject repository = funcall(RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION, redobj);
            if (NIL == repository) {
                return NIL;
            }
            return red_repository_object_wrap(repository);
        }
    }

    /**
     * Get the System repository for the red system, or nil if one doesn't exist
     *
     * @param optional
     * 		red; a red system object, the non default value should only be used for testing
     * @return red-repository-struct; the system repository
     */
    @LispMethod(comment = "Get the System repository for the red system, or nil if one doesn\'t exist\r\n\r\n@param optional\r\n\t\tred; a red system object, the non default value should only be used for testing\r\n@return red-repository-struct; the system repository")
    public static SubLObject red_get_system_repository(SubLObject red) {
        if (red == UNPROVIDED) {
            red = red_get_object();
        }
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        assert NIL != red_struct_p(red) : "! red_api.red_struct_p(red) " + ("red_api.red_struct_p(red) " + "CommonSymbols.NIL != red_api.red_struct_p(red) ") + red;
        final SubLObject redobj = red_struct_cobj(red);
        final SubLObject repository = funcall(RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION, redobj);
        if (NIL == repository) {
            return NIL;
        }
        return red_repository_object_wrap(repository);
    }

    /**
     * Get the Machine repository for the red system, or nil if one doesn't exist
     *
     * @param optional
     * 		red; a red system object, the non default value should only be used for testing
     * @return red-repository-struct; the machine repository
     */
    @LispMethod(comment = "Get the Machine repository for the red system, or nil if one doesn\'t exist\r\n\r\n@param optional\r\n\t\tred; a red system object, the non default value should only be used for testing\r\n@return red-repository-struct; the machine repository")
    public static final SubLObject red_get_machine_repository_alt(SubLObject red) {
        if (red == UNPROVIDED) {
            red = red_get_object();
        }
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        SubLTrampolineFile.checkType(red, RED_STRUCT_P);
        {
            SubLObject red_obj = red_struct_cobj(red);
            SubLObject repository = funcall(RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION, red_obj);
            if (NIL == repository) {
                return NIL;
            }
            return red_repository_object_wrap(repository);
        }
    }

    /**
     * Get the Machine repository for the red system, or nil if one doesn't exist
     *
     * @param optional
     * 		red; a red system object, the non default value should only be used for testing
     * @return red-repository-struct; the machine repository
     */
    @LispMethod(comment = "Get the Machine repository for the red system, or nil if one doesn\'t exist\r\n\r\n@param optional\r\n\t\tred; a red system object, the non default value should only be used for testing\r\n@return red-repository-struct; the machine repository")
    public static SubLObject red_get_machine_repository(SubLObject red) {
        if (red == UNPROVIDED) {
            red = red_get_object();
        }
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        assert NIL != red_struct_p(red) : "! red_api.red_struct_p(red) " + ("red_api.red_struct_p(red) " + "CommonSymbols.NIL != red_api.red_struct_p(red) ") + red;
        final SubLObject red_obj = red_struct_cobj(red);
        final SubLObject repository = funcall(RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION, red_obj);
        if (NIL == repository) {
            return NIL;
        }
        return red_repository_object_wrap(repository);
    }

    /**
     * load a repository from a file
     *
     * @param filename;
     * 		a string containing the filename of the repository
     * @return red-repository-struct; the repository just loaded, or nil if it load correctly, Note this function does not reload repositories
     */
    @LispMethod(comment = "load a repository from a file\r\n\r\n@param filename;\r\n\t\ta string containing the filename of the repository\r\n@return red-repository-struct; the repository just loaded, or nil if it load correctly, Note this function does not reload repositories")
    public static final SubLObject red_load_repository_alt(SubLObject filename) {
        red_get_object();
        return red_repository_struct_create(filename);
    }

    @LispMethod(comment = "load a repository from a file\r\n\r\n@param filename;\r\n\t\ta string containing the filename of the repository\r\n@return red-repository-struct; the repository just loaded, or nil if it load correctly, Note this function does not reload repositories")
    public static SubLObject red_load_repository(final SubLObject filename) {
        red_get_object();
        return red_repository_struct_create(filename);
    }

    /**
     * load a repository from a file
     *
     * @param filename;
     * 		a string containing the filename of the repository
     * @return red-repository-struct; the repository just loaded, or nil if it load correctly, Note this function does not reload repositories
     */
    @LispMethod(comment = "load a repository from a file\r\n\r\n@param filename;\r\n\t\ta string containing the filename of the repository\r\n@return red-repository-struct; the repository just loaded, or nil if it load correctly, Note this function does not reload repositories")
    public static final SubLObject red_reload_repository_simple_alt(SubLObject filename) {
        {
            SubLObject cobj = red_lookup_repository_object_by_filename(filename);
            if (NIL != cobj) {
                red_remove_repository(cobj);
            }
            return red_load_repository(filename);
        }
    }

    @LispMethod(comment = "load a repository from a file\r\n\r\n@param filename;\r\n\t\ta string containing the filename of the repository\r\n@return red-repository-struct; the repository just loaded, or nil if it load correctly, Note this function does not reload repositories")
    public static SubLObject red_reload_repository_simple(final SubLObject filename) {
        final SubLObject cobj = red_lookup_repository_object_by_filename(filename);
        if (NIL != cobj) {
            red_remove_repository(cobj);
        }
        return red_load_repository(filename);
    }

    public static final SubLObject red_lookup_repository_struct_by_filename_alt(SubLObject filename) {
        if (NIL == filename) {
            return NIL;
        }
        {
            SubLObject rep_obj = red_lookup_repository_object_by_filename(filename);
            if (NIL == rep_obj) {
                return NIL;
            }
        }
        return red_repository_struct_create(filename);
    }

    public static SubLObject red_lookup_repository_struct_by_filename(final SubLObject filename) {
        if (NIL == filename) {
            return NIL;
        }
        final SubLObject rep_obj = red_lookup_repository_object_by_filename(filename);
        if (NIL == rep_obj) {
            return NIL;
        }
        return red_repository_struct_create(filename);
    }

    public static final SubLObject red_lookup_repository_object_by_filename_alt(SubLObject filename) {
        if (NIL == filename) {
            return NIL;
        }
        return dictionary.dictionary_lookup($red_filenames$.getGlobalValue(), filename, UNPROVIDED);
    }

    public static SubLObject red_lookup_repository_object_by_filename(final SubLObject filename) {
        if (NIL == filename) {
            return NIL;
        }
        return dictionary.dictionary_lookup($red_filenames$.getGlobalValue(), filename, UNPROVIDED);
    }

    public static final SubLObject red_lookup_or_load_repository_object_by_filename_alt(SubLObject filename) {
        if (NIL == filename) {
            return NIL;
        }
        {
            SubLObject cobj = red_lookup_repository_object_by_filename(filename);
            if (NIL != cobj) {
                return cobj;
            }
        }
        return red_load_repository_object(filename);
    }

    public static SubLObject red_lookup_or_load_repository_object_by_filename(final SubLObject filename) {
        if (NIL == filename) {
            return NIL;
        }
        final SubLObject cobj = red_lookup_repository_object_by_filename(filename);
        if (NIL != cobj) {
            return cobj;
        }
        return red_load_repository_object(filename);
    }

    /**
     * load a repository object from a file
     *
     * @param filename;
     * 		a string containing the filename of the repository
     * @return red-repository-struct; the repository just loaded, or nil if it load correctly
     */
    @LispMethod(comment = "load a repository object from a file\r\n\r\n@param filename;\r\n\t\ta string containing the filename of the repository\r\n@return red-repository-struct; the repository just loaded, or nil if it load correctly")
    public static final SubLObject red_load_repository_object_alt(SubLObject filename) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        {
            SubLObject red = red_get_object_bare();
            SubLObject rr = funcall(RED_LOAD_REPOSITORY_IMPLEMENTATION, red, filename);
            if (NIL == rr) {
                return NIL;
            }
            dictionary.dictionary_enter($red_filenames$.getGlobalValue(), filename, rr);
            return rr;
        }
    }

    @LispMethod(comment = "load a repository object from a file\r\n\r\n@param filename;\r\n\t\ta string containing the filename of the repository\r\n@return red-repository-struct; the repository just loaded, or nil if it load correctly")
    public static SubLObject red_load_repository_object(final SubLObject filename) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        final SubLObject red = red_get_object_bare();
        final SubLObject rr = funcall(RED_LOAD_REPOSITORY_IMPLEMENTATION, red, filename);
        if (NIL == rr) {
            return NIL;
        }
        dictionary.dictionary_enter($red_filenames$.getGlobalValue(), filename, rr);
        return rr;
    }

    public static final SubLObject red_get_object_alt() {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        if (NIL == $red_api_object$.getGlobalValue()) {
            $red_api_object$.setGlobalValue(red_struct_create());
        }
        return $red_api_object$.getGlobalValue();
    }

    public static SubLObject red_get_object() {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        if (NIL == $red_api_object$.getGlobalValue()) {
            $red_api_object$.setGlobalValue(red_struct_create());
        }
        return $red_api_object$.getGlobalValue();
    }

    public static final SubLObject red_get_object_bare_alt() {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        if (NIL == $red_api_object$.getGlobalValue()) {
            $red_api_object$.setGlobalValue(red_struct_create());
        }
        return red_struct_cobj($red_api_object$.getGlobalValue());
    }

    public static SubLObject red_get_object_bare() {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        if (NIL == $red_api_object$.getGlobalValue()) {
            $red_api_object$.setGlobalValue(red_struct_create());
        }
        return red_struct_cobj($red_api_object$.getGlobalValue());
    }

    public static final SubLObject red_dispose_object_alt() {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        if (NIL != $red_api_object$.getGlobalValue()) {
            {
                SubLObject red = red_struct_cobj($red_api_object$.getGlobalValue());
                funcall(RED_DISPOSE_IMPLEMENTATION, red);
                $red_api_object$.setGlobalValue(NIL);
            }
        }
        return NIL;
    }

    public static SubLObject red_dispose_object() {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        if (NIL != $red_api_object$.getGlobalValue()) {
            final SubLObject red = red_struct_cobj($red_api_object$.getGlobalValue());
            funcall(RED_DISPOSE_IMPLEMENTATION, red);
            $red_api_object$.setGlobalValue(NIL);
        }
        return NIL;
    }

    public static final SubLObject red_element_get_key_exists_p_alt(SubLObject red_element_struct) {
        SubLTrampolineFile.checkType(red_element_struct, RED_ELEMENT_STRUCT_P);
        {
            SubLObject rse = red_element_instantiate(red_element_struct);
            if (NIL == rse) {
                return NIL;
            }
            red_element_dispose(rse);
        }
        return T;
    }

    public static SubLObject red_element_get_key_exists_p(final SubLObject red_element_struct) {
        assert NIL != red_element_struct_p(red_element_struct) : "! red_api.red_element_struct_p(red_element_struct) " + ("red_api.red_element_struct_p(red_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(red_element_struct) ") + red_element_struct;
        final SubLObject rse = red_element_instantiate(red_element_struct);
        if (NIL == rse) {
            return NIL;
        }
        red_element_dispose(rse);
        return T;
    }

    public static final SubLObject red_element_get_datatype_internal_alt(SubLObject rse) {
        if (NIL == rse) {
            return $INVALID;
        }
        {
            SubLObject rs = funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
            if (NIL != rs) {
                {
                    SubLObject datatype = funcall(RED_GET_DATATYPE_STRING_IMPLEMENTATION, rs);
                    return red_translate_datatype_string(datatype);
                }
            }
        }
        return $INVALID;
    }

    public static SubLObject red_element_get_datatype_internal(final SubLObject rse) {
        if (NIL == rse) {
            return $INVALID;
        }
        final SubLObject rs = funcall(RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION, rse);
        if (NIL != rs) {
            final SubLObject datatype = funcall(RED_GET_DATATYPE_STRING_IMPLEMENTATION, rs);
            return red_translate_datatype_string(datatype);
        }
        return $INVALID;
    }

    public static final SubLObject red_translate_datatype_string_alt(SubLObject datatype) {
        if (datatype.equal($$$string)) {
            return $STRING;
        } else {
            if (datatype.equal($$$integer)) {
                return $INTEGER;
            } else {
                if (datatype.equal($$$blob)) {
                    return $BLOB;
                } else {
                    return $INVALID;
                }
            }
        }
    }

    public static SubLObject red_translate_datatype_string(final SubLObject datatype) {
        if (datatype.equal($$$string)) {
            return $STRING;
        }
        if (datatype.equal($$$integer)) {
            return $INTEGER;
        }
        if (datatype.equal($$$blob)) {
            return $BLOB;
        }
        return $INVALID;
    }

    public static final SubLObject red_repository_list_instantiate_alt(SubLObject red_repository_list) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        if (NIL == red_repository_list) {
            return NIL;
        }
        SubLTrampolineFile.checkType(red_repository_list, RED_REPOSITORY_LIST_STRUCT_P);
        {
            SubLObject type = red_repository_list_struct_type(red_repository_list);
            SubLObject pcase_var = type;
            if (pcase_var.eql($SYSTEM)) {
                {
                    SubLObject sysr = red_get_system_repository(UNPROVIDED);
                    if ((NIL != sysr) && (NIL != red_repository_struct_valid_p(sysr))) {
                        {
                            SubLObject rep_obj = red_repository_get_repository_object(sysr);
                            SubLObject red_repository_list_1 = funcall(RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION, rep_obj);
                            if (!((NIL != red_repository_list_1) && (NIL != red_repository_list_1))) {
                                return NIL;
                            }
                            return red_repository_list_1;
                        }
                    } else {
                        return NIL;
                    }
                }
            } else {
                if (pcase_var.eql($MACHINE)) {
                    {
                        SubLObject machr = red_get_machine_repository(UNPROVIDED);
                        if ((NIL != machr) && (NIL != red_repository_struct_valid_p(machr))) {
                            {
                                SubLObject rep_obj = red_repository_get_repository_object(machr);
                                SubLObject red_repository_list_2 = funcall(RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION, rep_obj);
                                if (!((NIL != red_repository_list_2) && (NIL != red_repository_list_2))) {
                                    return NIL;
                                }
                                return red_repository_list_2;
                            }
                        } else {
                            return NIL;
                        }
                    }
                } else {
                    if (pcase_var.eql($MACHINE_SYSTEM)) {
                        {
                            SubLObject rd = red_get_object();
                            SubLObject red = red_struct_cobj(rd);
                            SubLObject machr = red_get_machine_repository(UNPROVIDED);
                            SubLObject sysr = red_get_system_repository(UNPROVIDED);
                            SubLObject num = ZERO_INTEGER;
                            if ((NIL != machr) && (NIL != red_repository_struct_valid_p(machr))) {
                                num = add(num, ONE_INTEGER);
                            }
                            if ((NIL != sysr) && (NIL != red_repository_struct_valid_p(sysr))) {
                                num = add(num, ONE_INTEGER);
                            }
                            if (num == ZERO_INTEGER) {
                                return NIL;
                            }
                            {
                                SubLObject red_repository_list_3 = funcall(RED_REPOSITORY_LIST_NEW_IMPLEMENTATION, red, num);
                                if (!((NIL != red_repository_list_3) && (NIL != red_repository_list_3))) {
                                    return NIL;
                                }
                                if ((NIL != machr) && (NIL != red_repository_struct_valid_p(machr))) {
                                    {
                                        SubLObject rep_obj = red_repository_get_repository_object(machr);
                                        funcall(RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_3, rep_obj);
                                    }
                                }
                                if ((NIL != sysr) && (NIL != red_repository_struct_valid_p(sysr))) {
                                    {
                                        SubLObject rep_obj = red_repository_get_repository_object(sysr);
                                        funcall(RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_3, rep_obj);
                                    }
                                }
                                return red_repository_list_3;
                            }
                        }
                    } else {
                        if (pcase_var.eql($SYSTEM_MACHINE)) {
                            {
                                SubLObject rd = red_get_object();
                                SubLObject red = red_struct_cobj(rd);
                                SubLObject machr = red_get_machine_repository(UNPROVIDED);
                                SubLObject sysr = red_get_system_repository(UNPROVIDED);
                                SubLObject num = ZERO_INTEGER;
                                if ((NIL != machr) && (NIL != red_repository_struct_valid_p(machr))) {
                                    num = add(num, ONE_INTEGER);
                                }
                                if ((NIL != sysr) && (NIL != red_repository_struct_valid_p(sysr))) {
                                    num = add(num, ONE_INTEGER);
                                }
                                if (num == ZERO_INTEGER) {
                                    return NIL;
                                }
                                {
                                    SubLObject red_repository_list_4 = funcall(RED_REPOSITORY_LIST_NEW_IMPLEMENTATION, red, num);
                                    if (!((NIL != red_repository_list_4) && (NIL != red_repository_list_4))) {
                                        return NIL;
                                    }
                                    if ((NIL != sysr) && (NIL != red_repository_struct_valid_p(sysr))) {
                                        {
                                            SubLObject rep_obj = red_repository_get_repository_object(sysr);
                                            funcall(RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_4, rep_obj);
                                        }
                                    }
                                    if ((NIL != machr) && (NIL != red_repository_struct_valid_p(machr))) {
                                        {
                                            SubLObject rep_obj = red_repository_get_repository_object(machr);
                                            funcall(RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_4, rep_obj);
                                        }
                                    }
                                    return red_repository_list_4;
                                }
                            }
                        } else {
                            if (pcase_var.eql($APPLICATION)) {
                                {
                                    SubLObject red = red_get_object_bare();
                                    SubLObject red_repository_list_5 = funcall(RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION, red);
                                    if (!((NIL != red_repository_list_5) && (NIL != red_repository_list_5))) {
                                        return NIL;
                                    }
                                    return red_repository_list_5;
                                }
                            } else {
                                if (pcase_var.eql($MOST_PRIVILEGED)) {
                                    {
                                        SubLObject red = red_get_object_bare();
                                        SubLObject red_repository_list_6 = funcall(RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION, red);
                                        if (!((NIL != red_repository_list_6) && (NIL != red_repository_list_6))) {
                                            return NIL;
                                        }
                                        return red_repository_list_6;
                                    }
                                } else {
                                    if (pcase_var.eql($LEAST_PRIVILEGED)) {
                                        {
                                            SubLObject red = red_get_object_bare();
                                            SubLObject red_repository_list_7 = funcall(RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION, red);
                                            if (!((NIL != red_repository_list_7) && (NIL != red_repository_list_7))) {
                                                return NIL;
                                            }
                                            return red_repository_list_7;
                                        }
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject red_repository_list_instantiate(final SubLObject red_repository_list) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        if (NIL == red_repository_list) {
            return NIL;
        }
        assert NIL != red_repository_list_struct_p(red_repository_list) : "! red_api.red_repository_list_struct_p(red_repository_list) " + ("red_api.red_repository_list_struct_p(red_repository_list) " + "CommonSymbols.NIL != red_api.red_repository_list_struct_p(red_repository_list) ") + red_repository_list;
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = red_repository_list_struct_type(red_repository_list);
        if (pcase_var.eql($SYSTEM)) {
            final SubLObject sysr = red_get_system_repository(UNPROVIDED);
            if ((NIL == sysr) || (NIL == red_repository_struct_valid_p(sysr))) {
                return NIL;
            }
            final SubLObject rep_obj = red_repository_get_repository_object(sysr);
            final SubLObject red_repository_list_$1 = funcall(RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION, rep_obj);
            if ((NIL == red_repository_list_$1) || (NIL == red_repository_list_$1)) {
                return NIL;
            }
            return red_repository_list_$1;
        } else
            if (pcase_var.eql($MACHINE)) {
                final SubLObject machr = red_get_machine_repository(UNPROVIDED);
                if ((NIL == machr) || (NIL == red_repository_struct_valid_p(machr))) {
                    return NIL;
                }
                final SubLObject rep_obj = red_repository_get_repository_object(machr);
                final SubLObject red_repository_list_$2 = funcall(RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION, rep_obj);
                if ((NIL == red_repository_list_$2) || (NIL == red_repository_list_$2)) {
                    return NIL;
                }
                return red_repository_list_$2;
            } else
                if (pcase_var.eql($MACHINE_SYSTEM)) {
                    final SubLObject rd = red_get_object();
                    final SubLObject red = red_struct_cobj(rd);
                    final SubLObject machr2 = red_get_machine_repository(UNPROVIDED);
                    final SubLObject sysr2 = red_get_system_repository(UNPROVIDED);
                    SubLObject num = ZERO_INTEGER;
                    if ((NIL != machr2) && (NIL != red_repository_struct_valid_p(machr2))) {
                        num = add(num, ONE_INTEGER);
                    }
                    if ((NIL != sysr2) && (NIL != red_repository_struct_valid_p(sysr2))) {
                        num = add(num, ONE_INTEGER);
                    }
                    if (num.eql(ZERO_INTEGER)) {
                        return NIL;
                    }
                    final SubLObject red_repository_list_$3 = funcall(RED_REPOSITORY_LIST_NEW_IMPLEMENTATION, red, num);
                    if ((NIL == red_repository_list_$3) || (NIL == red_repository_list_$3)) {
                        return NIL;
                    }
                    if ((NIL != machr2) && (NIL != red_repository_struct_valid_p(machr2))) {
                        final SubLObject rep_obj2 = red_repository_get_repository_object(machr2);
                        funcall(RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_$3, rep_obj2);
                    }
                    if ((NIL != sysr2) && (NIL != red_repository_struct_valid_p(sysr2))) {
                        final SubLObject rep_obj2 = red_repository_get_repository_object(sysr2);
                        funcall(RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_$3, rep_obj2);
                    }
                    return red_repository_list_$3;
                } else
                    if (pcase_var.eql($SYSTEM_MACHINE)) {
                        final SubLObject rd = red_get_object();
                        final SubLObject red = red_struct_cobj(rd);
                        final SubLObject machr2 = red_get_machine_repository(UNPROVIDED);
                        final SubLObject sysr2 = red_get_system_repository(UNPROVIDED);
                        SubLObject num = ZERO_INTEGER;
                        if ((NIL != machr2) && (NIL != red_repository_struct_valid_p(machr2))) {
                            num = add(num, ONE_INTEGER);
                        }
                        if ((NIL != sysr2) && (NIL != red_repository_struct_valid_p(sysr2))) {
                            num = add(num, ONE_INTEGER);
                        }
                        if (num.eql(ZERO_INTEGER)) {
                            return NIL;
                        }
                        final SubLObject red_repository_list_$4 = funcall(RED_REPOSITORY_LIST_NEW_IMPLEMENTATION, red, num);
                        if ((NIL == red_repository_list_$4) || (NIL == red_repository_list_$4)) {
                            return NIL;
                        }
                        if ((NIL != sysr2) && (NIL != red_repository_struct_valid_p(sysr2))) {
                            final SubLObject rep_obj2 = red_repository_get_repository_object(sysr2);
                            funcall(RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_$4, rep_obj2);
                        }
                        if ((NIL != machr2) && (NIL != red_repository_struct_valid_p(machr2))) {
                            final SubLObject rep_obj2 = red_repository_get_repository_object(machr2);
                            funcall(RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, red_repository_list_$4, rep_obj2);
                        }
                        return red_repository_list_$4;
                    } else
                        if (pcase_var.eql($APPLICATION)) {
                            final SubLObject red2 = red_get_object_bare();
                            final SubLObject red_repository_list_$5 = funcall(RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION, red2);
                            if ((NIL == red_repository_list_$5) || (NIL == red_repository_list_$5)) {
                                return NIL;
                            }
                            return red_repository_list_$5;
                        } else
                            if (pcase_var.eql($MOST_PRIVILEGED)) {
                                final SubLObject red2 = red_get_object_bare();
                                final SubLObject red_repository_list_$6 = funcall(RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION, red2);
                                if ((NIL == red_repository_list_$6) || (NIL == red_repository_list_$6)) {
                                    return NIL;
                                }
                                return red_repository_list_$6;
                            } else {
                                if (!pcase_var.eql($LEAST_PRIVILEGED)) {
                                    return NIL;
                                }
                                final SubLObject red2 = red_get_object_bare();
                                final SubLObject red_repository_list_$7 = funcall(RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION, red2);
                                if ((NIL == red_repository_list_$7) || (NIL == red_repository_list_$7)) {
                                    return NIL;
                                }
                                return red_repository_list_$7;
                            }





    }

    public static final SubLObject red_repository_list_dispose_alt(SubLObject red_repository_list) {
        if (!((NIL != red_repository_list) && (NIL != red_repository_list))) {
            return NIL;
        }
        funcall(RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION, red_repository_list);
        return NIL;
    }

    public static SubLObject red_repository_list_dispose(final SubLObject red_repository_list) {
        if ((NIL == red_repository_list) || (NIL == red_repository_list)) {
            return NIL;
        }
        funcall(RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION, red_repository_list);
        return NIL;
    }

    public static final SubLObject red_element_instantiate_alt(SubLObject red_element_struct) {
        SubLTrampolineFile.checkType(red_element_struct, RED_ELEMENT_STRUCT_P);
        {
            SubLObject key = red_element_struct_key_string(red_element_struct);
            SubLObject red_repository_list_struct = red_element_struct_repository_list(red_element_struct);
            SubLObject retkey = NIL;
            SubLTrampolineFile.checkType(red_repository_list_struct, RED_REPOSITORY_LIST_STRUCT_P);
            SubLTrampolineFile.checkType(key, STRINGP);
            {
                SubLObject red_repository_list = red_repository_list_instantiate(red_repository_list_struct);
                SubLObject flag = NIL;
                if (!((NIL != red_repository_list) && (NIL != red_repository_list))) {
                    return retkey;
                }
                try {
                    {
                        SubLObject topkey = funcall(RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION, red_repository_list);
                        if (NIL != topkey) {
                            if ((NIL != key) && (NIL != numNE(length(key), ZERO_INTEGER))) {
                                try {
                                    retkey = funcall(RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION, topkey, key);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            funcall(RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, topkey);
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                        }
                                    }
                                }
                            } else {
                                retkey = topkey;
                            }
                        }
                        flag = T;
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (NIL == flag) {
                                red_repository_list_dispose(red_repository_list);
                                retkey = NIL;
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                return retkey;
            }
        }
    }

    public static SubLObject red_element_instantiate(final SubLObject red_element_struct) {
        assert NIL != red_element_struct_p(red_element_struct) : "! red_api.red_element_struct_p(red_element_struct) " + ("red_api.red_element_struct_p(red_element_struct) " + "CommonSymbols.NIL != red_api.red_element_struct_p(red_element_struct) ") + red_element_struct;
        final SubLObject key = red_element_struct_key_string(red_element_struct);
        final SubLObject red_repository_list_struct = red_element_struct_repository_list(red_element_struct);
        SubLObject retkey = NIL;
        assert NIL != red_repository_list_struct_p(red_repository_list_struct) : "! red_api.red_repository_list_struct_p(red_repository_list_struct) " + ("red_api.red_repository_list_struct_p(red_repository_list_struct) " + "CommonSymbols.NIL != red_api.red_repository_list_struct_p(red_repository_list_struct) ") + red_repository_list_struct;
        assert NIL != stringp(key) : "! stringp(key) " + ("Types.stringp(key) " + "CommonSymbols.NIL != Types.stringp(key) ") + key;
        final SubLObject red_repository_list = red_repository_list_instantiate(red_repository_list_struct);
        SubLObject flag = NIL;
        if ((NIL == red_repository_list) || (NIL == red_repository_list)) {
            return retkey;
        }
        try {
            final SubLObject topkey = funcall(RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION, red_repository_list);
            if (NIL != topkey) {
                if ((NIL != key) && (NIL != numNE(length(key), ZERO_INTEGER))) {
                    try {
                        retkey = funcall(RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION, topkey, key);
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            funcall(RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, topkey);
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                } else {
                    retkey = topkey;
                }
            }
            flag = T;
        } finally {
            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL == flag) {
                    red_repository_list_dispose(red_repository_list);
                    retkey = NIL;
                }
                restoreValuesFromVector(_values2);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return retkey;
    }

    public static final SubLObject red_element_dispose_alt(SubLObject red_element) {
        if (NIL == red_element) {
            return NIL;
        }
        {
            SubLObject red_repository_list = funcall(RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION, red_element);
            red_repository_list_dispose(red_repository_list);
        }
        funcall(RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, red_element);
        return NIL;
    }

    public static SubLObject red_element_dispose(final SubLObject red_element) {
        if (NIL == red_element) {
            return NIL;
        }
        final SubLObject red_repository_list = funcall(RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION, red_element);
        red_repository_list_dispose(red_repository_list);
        funcall(RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, red_element);
        return NIL;
    }

    /**
     * Convert int vector into a vector satisfying byte-vector-p
     */
    @LispMethod(comment = "Convert int vector into a vector satisfying byte-vector-p")
    public static final SubLObject red_int_vector_to_byte_vector_alt(SubLObject int_vector) {
        {
            SubLObject int_vector_length = length(int_vector);
            SubLObject byte_vector = make_vector(int_vector_length, ZERO_INTEGER);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(int_vector_length); i = add(i, ONE_INTEGER)) {
                set_aref(byte_vector, i, aref(int_vector, i));
            }
            return byte_vector;
        }
    }

    @LispMethod(comment = "Convert int vector into a vector satisfying byte-vector-p")
    public static SubLObject red_int_vector_to_byte_vector(final SubLObject int_vector) {
        final SubLObject int_vector_length = length(int_vector);
        final SubLObject byte_vector = make_vector(int_vector_length, ZERO_INTEGER);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(int_vector_length); i = add(i, ONE_INTEGER)) {
            set_aref(byte_vector, i, aref(int_vector, i));
        }
        return byte_vector;
    }

    public static SubLObject declare_red_api_file() {
        declareFunction("red_struct_print_function_trampoline", "RED-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("red_struct_p", "RED-STRUCT-P", 1, 0, false);
        new red_api.$red_struct_p$UnaryFunction();
        declareFunction("red_struct_cobj", "RED-STRUCT-COBJ", 1, 0, false);
        declareFunction("_csetf_red_struct_cobj", "_CSETF-RED-STRUCT-COBJ", 2, 0, false);
        declareFunction("make_red_struct", "MAKE-RED-STRUCT", 0, 1, false);
        declareFunction("visit_defstruct_red_struct", "VISIT-DEFSTRUCT-RED-STRUCT", 2, 0, false);
        declareFunction("visit_defstruct_object_red_struct_method", "VISIT-DEFSTRUCT-OBJECT-RED-STRUCT-METHOD", 2, 0, false);
        declareFunction("red_repository_struct_print_function_trampoline", "RED-REPOSITORY-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("red_repository_struct_p", "RED-REPOSITORY-STRUCT-P", 1, 0, false);
        new red_api.$red_repository_struct_p$UnaryFunction();
        declareFunction("red_repository_struct_filename", "RED-REPOSITORY-STRUCT-FILENAME", 1, 0, false);
        declareFunction("_csetf_red_repository_struct_filename", "_CSETF-RED-REPOSITORY-STRUCT-FILENAME", 2, 0, false);
        declareFunction("make_red_repository_struct", "MAKE-RED-REPOSITORY-STRUCT", 0, 1, false);
        declareFunction("visit_defstruct_red_repository_struct", "VISIT-DEFSTRUCT-RED-REPOSITORY-STRUCT", 2, 0, false);
        declareFunction("visit_defstruct_object_red_repository_struct_method", "VISIT-DEFSTRUCT-OBJECT-RED-REPOSITORY-STRUCT-METHOD", 2, 0, false);
        declareFunction("red_struct_create", "RED-STRUCT-CREATE", 0, 0, false);
        declareFunction("print_red_struct", "PRINT-RED-STRUCT", 3, 0, false);
        declareFunction("red_repository_struct_create", "RED-REPOSITORY-STRUCT-CREATE", 1, 0, false);
        declareFunction("red_repository_object_wrap", "RED-REPOSITORY-OBJECT-WRAP", 1, 0, false);
        declareFunction("red_repository_get_repository_object", "RED-REPOSITORY-GET-REPOSITORY-OBJECT", 1, 0, false);
        declareFunction("print_red_repository_struct", "PRINT-RED-REPOSITORY-STRUCT", 3, 0, false);
        declareFunction("red_repository_struct_valid_p", "RED-REPOSITORY-STRUCT-VALID-P", 1, 0, false);
        declareFunction("red_repository_object_valid_p", "RED-REPOSITORY-OBJECT-VALID-P", 1, 0, false);
        declareFunction("red_repository_list_struct_print_function_trampoline", "RED-REPOSITORY-LIST-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("red_repository_list_struct_p", "RED-REPOSITORY-LIST-STRUCT-P", 1, 0, false);
        new red_api.$red_repository_list_struct_p$UnaryFunction();
        declareFunction("red_repository_list_struct_type", "RED-REPOSITORY-LIST-STRUCT-TYPE", 1, 0, false);
        declareFunction("_csetf_red_repository_list_struct_type", "_CSETF-RED-REPOSITORY-LIST-STRUCT-TYPE", 2, 0, false);
        declareFunction("make_red_repository_list_struct", "MAKE-RED-REPOSITORY-LIST-STRUCT", 0, 1, false);
        declareFunction("visit_defstruct_red_repository_list_struct", "VISIT-DEFSTRUCT-RED-REPOSITORY-LIST-STRUCT", 2, 0, false);
        declareFunction("visit_defstruct_object_red_repository_list_struct_method", "VISIT-DEFSTRUCT-OBJECT-RED-REPOSITORY-LIST-STRUCT-METHOD", 2, 0, false);
        declareFunction("red_repository_list_struct_create", "RED-REPOSITORY-LIST-STRUCT-CREATE", 1, 0, false);
        declareFunction("print_red_repository_list_struct", "PRINT-RED-REPOSITORY-LIST-STRUCT", 3, 0, false);
        declareFunction("xprint_red_repository_list_struct", "XPRINT-RED-REPOSITORY-LIST-STRUCT", 3, 0, false);
        declareFunction("red_element_struct_print_function_trampoline", "RED-ELEMENT-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("red_element_struct_p", "RED-ELEMENT-STRUCT-P", 1, 0, false);
        new red_api.$red_element_struct_p$UnaryFunction();
        declareFunction("red_element_struct_repository_list", "RED-ELEMENT-STRUCT-REPOSITORY-LIST", 1, 0, false);
        declareFunction("red_element_struct_key_string", "RED-ELEMENT-STRUCT-KEY-STRING", 1, 0, false);
        declareFunction("_csetf_red_element_struct_repository_list", "_CSETF-RED-ELEMENT-STRUCT-REPOSITORY-LIST", 2, 0, false);
        declareFunction("_csetf_red_element_struct_key_string", "_CSETF-RED-ELEMENT-STRUCT-KEY-STRING", 2, 0, false);
        declareFunction("make_red_element_struct", "MAKE-RED-ELEMENT-STRUCT", 0, 1, false);
        declareFunction("visit_defstruct_red_element_struct", "VISIT-DEFSTRUCT-RED-ELEMENT-STRUCT", 2, 0, false);
        declareFunction("visit_defstruct_object_red_element_struct_method", "VISIT-DEFSTRUCT-OBJECT-RED-ELEMENT-STRUCT-METHOD", 2, 0, false);
        declareFunction("red_element_struct_create", "RED-ELEMENT-STRUCT-CREATE", 2, 0, false);
        declareFunction("print_red_element_struct", "PRINT-RED-ELEMENT-STRUCT", 3, 0, false);
        declareFunction("red_get_repository_list_length", "RED-GET-REPOSITORY-LIST-LENGTH", 1, 0, false);
        declareFunction("red_element_get_key", "RED-ELEMENT-GET-KEY", 1, 0, false);
        declareFunction("red_element_get_datatype", "RED-ELEMENT-GET-DATATYPE", 1, 0, false);
        declareFunction("red_element_get_value", "RED-ELEMENT-GET-VALUE", 1, 0, false);
        declareFunction("red_element_get_value_cfasl_decode", "RED-ELEMENT-GET-VALUE-CFASL-DECODE", 1, 0, false);
        declareFunction("red_get_element", "RED-GET-ELEMENT", 2, 0, false);
        declareFunction("red_element_get_value_type", "RED-ELEMENT-GET-VALUE-TYPE", 1, 0, false);
        declareFunction("red_get_element_get_sub_element_by_key", "RED-GET-ELEMENT-GET-SUB-ELEMENT-BY-KEY", 2, 0, false);
        declareFunction("red_element_get_sub_elements", "RED-ELEMENT-GET-SUB-ELEMENTS", 1, 0, false);
        declareFunction("red_element_get_sub_elements_recursive", "RED-ELEMENT-GET-SUB-ELEMENTS-RECURSIVE", 1, 0, false);
        declareFunction("red_get_top_element", "RED-GET-TOP-ELEMENT", 1, 0, false);
        declareFunction("red_get_all_elements_of_repository", "RED-GET-ALL-ELEMENTS-OF-REPOSITORY", 1, 0, false);
        declareFunction("red_get_repository_get_all_elements", "RED-GET-REPOSITORY-GET-ALL-ELEMENTS", 2, 0, false);
        declareFunction("red_get_key_value_type", "RED-GET-KEY-VALUE-TYPE", 2, 0, false);
        declareFunction("red_makekey", "RED-MAKEKEY", 2, 0, false);
        declareFunction("red_get_filename", "RED-GET-FILENAME", 1, 0, false);
        declareFunction("red_get_filename_from_object", "RED-GET-FILENAME-FROM-OBJECT", 1, 0, false);
        declareFunction("red_get_repository_with_filename", "RED-GET-REPOSITORY-WITH-FILENAME", 1, 0, false);
        declareFunction("red_get_repository_object_with_filename", "RED-GET-REPOSITORY-OBJECT-WITH-FILENAME", 1, 0, false);
        declareFunction("red_remove_repository", "RED-REMOVE-REPOSITORY", 1, 0, false);
        declareFunction("red_cond_create_repository_filenames", "RED-COND-CREATE-REPOSITORY-FILENAMES", 0, 0, false);
        declareFunction("red_get_system_repository", "RED-GET-SYSTEM-REPOSITORY", 0, 1, false);
        declareFunction("red_get_machine_repository", "RED-GET-MACHINE-REPOSITORY", 0, 1, false);
        declareFunction("red_load_repository", "RED-LOAD-REPOSITORY", 1, 0, false);
        declareFunction("red_reload_repository_simple", "RED-RELOAD-REPOSITORY-SIMPLE", 1, 0, false);
        declareFunction("red_lookup_repository_struct_by_filename", "RED-LOOKUP-REPOSITORY-STRUCT-BY-FILENAME", 1, 0, false);
        declareFunction("red_lookup_repository_object_by_filename", "RED-LOOKUP-REPOSITORY-OBJECT-BY-FILENAME", 1, 0, false);
        declareFunction("red_lookup_or_load_repository_object_by_filename", "RED-LOOKUP-OR-LOAD-REPOSITORY-OBJECT-BY-FILENAME", 1, 0, false);
        declareFunction("red_load_repository_object", "RED-LOAD-REPOSITORY-OBJECT", 1, 0, false);
        declareFunction("red_get_object", "RED-GET-OBJECT", 0, 0, false);
        declareFunction("red_get_object_bare", "RED-GET-OBJECT-BARE", 0, 0, false);
        declareFunction("red_dispose_object", "RED-DISPOSE-OBJECT", 0, 0, false);
        declareFunction("red_element_get_key_exists_p", "RED-ELEMENT-GET-KEY-EXISTS-P", 1, 0, false);
        declareFunction("red_element_get_datatype_internal", "RED-ELEMENT-GET-DATATYPE-INTERNAL", 1, 0, false);
        declareFunction("red_translate_datatype_string", "RED-TRANSLATE-DATATYPE-STRING", 1, 0, false);
        declareFunction("red_repository_list_instantiate", "RED-REPOSITORY-LIST-INSTANTIATE", 1, 0, false);
        declareFunction("red_repository_list_dispose", "RED-REPOSITORY-LIST-DISPOSE", 1, 0, false);
        declareFunction("red_element_instantiate", "RED-ELEMENT-INSTANTIATE", 1, 0, false);
        declareFunction("red_element_dispose", "RED-ELEMENT-DISPOSE", 1, 0, false);
        declareFunction("red_int_vector_to_byte_vector", "RED-INT-VECTOR-TO-BYTE-VECTOR", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("COBJ"));

    static private final SubLList $list_alt3 = list($COBJ);

    static private final SubLList $list_alt4 = list(makeSymbol("RED-STRUCT-COBJ"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-RED-STRUCT-COBJ"));

    static private final SubLString $str_alt11$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt14 = list(makeSymbol("FILENAME"));

    static private final SubLList $list_alt15 = list(makeKeyword("FILENAME"));

    static private final SubLList $list_alt16 = list(makeSymbol("RED-REPOSITORY-STRUCT-FILENAME"));

    static private final SubLList $list_alt17 = list(makeSymbol("_CSETF-RED-REPOSITORY-STRUCT-FILENAME"));

    static private final SubLString $str_alt24$__red_struct_obj___s__version____ = makeString("#<red-struct obj: ~s  version = ~s  date= ~s  time = ~s  number-application-repositories ~s  system-repository = ~s machine-repository=~s >");

    static private final SubLString $str_alt29$__red_struct_cobj__nil_ = makeString("#<red-struct cobj: nil>");

    static private final SubLString $str_alt31$__red_repository_struct_INVALID__ = makeString("#<red-repository-struct INVALID  ~s>");

    static private final SubLString $str_alt32$__red_repository_struct__name____ = makeString("#<red-repository-struct  name = ~s type = ~s version = ~s date = ~s time = ~s >");

    public static SubLObject init_red_api_file() {
        deflexical("*RED-API-OBJECT*", NIL);
        deflexical("*RED-FILENAMES*", NIL);
        defconstant("*DTP-RED-STRUCT*", RED_STRUCT);
        defconstant("*DTP-RED-REPOSITORY-STRUCT*", RED_REPOSITORY_STRUCT);
        defconstant("*DTP-RED-REPOSITORY-LIST-STRUCT*", RED_REPOSITORY_LIST_STRUCT);
        defconstant("*DTP-RED-ELEMENT-STRUCT*", RED_ELEMENT_STRUCT);
        return NIL;
    }

    public static SubLObject setup_red_api_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_red_struct$.getGlobalValue(), symbol_function(RED_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RED_STRUCT_COBJ, _CSETF_RED_STRUCT_COBJ);
        identity(RED_STRUCT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_red_struct$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RED_STRUCT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_red_repository_struct$.getGlobalValue(), symbol_function(RED_REPOSITORY_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list26);
        def_csetf(RED_REPOSITORY_STRUCT_FILENAME, _CSETF_RED_REPOSITORY_STRUCT_FILENAME);
        identity(RED_REPOSITORY_STRUCT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_red_repository_struct$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RED_REPOSITORY_STRUCT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_red_repository_list_struct$.getGlobalValue(), symbol_function(RED_REPOSITORY_LIST_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list56);
        def_csetf(RED_REPOSITORY_LIST_STRUCT_TYPE, _CSETF_RED_REPOSITORY_LIST_STRUCT_TYPE);
        identity(RED_REPOSITORY_LIST_STRUCT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_red_repository_list_struct$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RED_REPOSITORY_LIST_STRUCT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_red_element_struct$.getGlobalValue(), symbol_function(RED_ELEMENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list83);
        def_csetf(RED_ELEMENT_STRUCT_REPOSITORY_LIST, _CSETF_RED_ELEMENT_STRUCT_REPOSITORY_LIST);
        def_csetf(RED_ELEMENT_STRUCT_KEY_STRING, _CSETF_RED_ELEMENT_STRUCT_KEY_STRING);
        identity(RED_ELEMENT_STRUCT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_red_element_struct$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RED_ELEMENT_STRUCT_METHOD));
        return NIL;
    }

    static private final SubLList $list_alt41 = list(makeSymbol("TYPE"));

    static private final SubLList $list_alt42 = list($TYPE);

    static private final SubLList $list_alt43 = list(makeSymbol("RED-REPOSITORY-LIST-STRUCT-TYPE"));

    static private final SubLList $list_alt44 = list(makeSymbol("_CSETF-RED-REPOSITORY-LIST-STRUCT-TYPE"));

    static private final SubLString $str_alt57$__red_repository_list_struct_type = makeString("#<red-repository-list-struct type = ~s>");

    static private final SubLString $str_alt58$__red_repository_list_struct_elts = makeString("#<red-repository-list-struct elts = 0 ()>");

    static private final SubLString $str_alt59$__red_repository_list_struct_elts = makeString("#<red-repository-list-struct elts = ~d ( ");

    static private final SubLString $str_alt60$_s_ = makeString("~s ");

    static private final SubLString $str_alt62$__ = makeString(")>");

    static private final SubLList $list_alt65 = list(makeSymbol("REPOSITORY-LIST"), makeSymbol("KEY-STRING"));

    static private final SubLList $list_alt66 = list(makeKeyword("REPOSITORY-LIST"), makeKeyword("KEY-STRING"));

    static private final SubLList $list_alt67 = list(makeSymbol("RED-ELEMENT-STRUCT-REPOSITORY-LIST"), makeSymbol("RED-ELEMENT-STRUCT-KEY-STRING"));

    @Override
    public void declareFunctions() {
        declare_red_api_file();
    }

    static private final SubLList $list_alt68 = list(makeSymbol("_CSETF-RED-ELEMENT-STRUCT-REPOSITORY-LIST"), makeSymbol("_CSETF-RED-ELEMENT-STRUCT-KEY-STRING"));

    @Override
    public void initializeVariables() {
        init_red_api_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_red_api_file();
    }

    

    public static final class $red_struct_native extends SubLStructNative {
        public SubLObject $cobj;

        private static final SubLStructDeclNative structDecl;

        public $red_struct_native() {
            red_api.$red_struct_native.this.$cobj = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return red_api.$red_struct_native.this.$cobj;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return red_api.$red_struct_native.this.$cobj = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.red_api.$red_struct_native.class, RED_STRUCT, RED_STRUCT_P, $list2, $list3, new String[]{ "$cobj" }, $list4, $list5, PRINT_RED_STRUCT);
        }
    }

    static private final SubLString $str_alt77$__red_element_struct_key____s_ = makeString("#<red-element-struct key = ~s>");

    static private final SubLString $str_alt80$__red_element_struct_key___s_type = makeString("#<red-element-struct key= ~s type = ~s ");

    public static final class $red_struct_p$UnaryFunction extends UnaryFunction {
        public $red_struct_p$UnaryFunction() {
            super(extractFunctionNamed("RED-STRUCT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return red_struct_p(arg1);
        }
    }

    static private final SubLString $str_alt82$value____s = makeString("value = ~s");

    static private final SubLString $str_alt85$value____d = makeString("value = ~d");

    static private final SubLString $str_alt88$BlobValue____ = makeString("BlobValue = \"");

    static private final SubLString $str_alt89$_x = makeString("~x");

    static private final SubLString $str_alt91$_a = makeString("~a");

    static private final SubLString $str_alt92$_ = makeString("\"");

    static private final SubLString $str_alt95$_ = makeString(">");

    public static final class $red_repository_struct_p$UnaryFunction extends UnaryFunction {
        public $red_repository_struct_p$UnaryFunction() {
            super(extractFunctionNamed("RED-REPOSITORY-STRUCT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return red_repository_struct_p(arg1);
        }
    }

    public static final class $red_repository_list_struct_p$UnaryFunction extends UnaryFunction {
        public $red_repository_list_struct_p$UnaryFunction() {
            super(extractFunctionNamed("RED-REPOSITORY-LIST-STRUCT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return red_repository_list_struct_p(arg1);
        }
    }

    static private final SubLString $str_alt110$_ = makeString(".");

    public static final class $red_element_struct_native extends SubLStructNative {
        public SubLObject $repository_list;

        public SubLObject $key_string;

        private static final SubLStructDeclNative structDecl;

        public $red_element_struct_native() {
            red_api.$red_element_struct_native.this.$repository_list = Lisp.NIL;
            red_api.$red_element_struct_native.this.$key_string = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return red_api.$red_element_struct_native.this.$repository_list;
        }

        @Override
        public SubLObject getField3() {
            return red_api.$red_element_struct_native.this.$key_string;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return red_api.$red_element_struct_native.this.$repository_list = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return red_api.$red_element_struct_native.this.$key_string = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.red_api.$red_element_struct_native.class, RED_ELEMENT_STRUCT, RED_ELEMENT_STRUCT_P, $list77, $list78, new String[]{ "$repository_list", "$key_string" }, $list79, $list80, PRINT_RED_ELEMENT_STRUCT);
        }
    }

    public static final class $red_element_struct_p$UnaryFunction extends UnaryFunction {
        public $red_element_struct_p$UnaryFunction() {
            super(extractFunctionNamed("RED-ELEMENT-STRUCT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return red_element_struct_p(arg1);
        }
    }
}

/**
 * Total time: 388 ms
 */
