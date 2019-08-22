/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_bignum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_character$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_cons$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_float$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_hash_table$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_string$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_symbol$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_vector$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class visitation extends SubLTranslatedFile {
    public static SubLObject declare_visitation_file() {
        declareFunction("visit_defstruct", "VISIT-DEFSTRUCT", 2, 0, false);
        declareFunction("visit_defstruct_object", "VISIT-DEFSTRUCT-OBJECT", 2, 0, false);
        declareFunction("visit_defstruct_noop", "VISIT-DEFSTRUCT-NOOP", 2, 0, false);
        declareFunction("visit_defstruct_object_integer_method", "VISIT-DEFSTRUCT-OBJECT-INTEGER-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_float_method", "VISIT-DEFSTRUCT-OBJECT-FLOAT-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_string_method", "VISIT-DEFSTRUCT-OBJECT-STRING-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_character_method", "VISIT-DEFSTRUCT-OBJECT-CHARACTER-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_symbol_method", "VISIT-DEFSTRUCT-OBJECT-SYMBOL-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_vector_method", "VISIT-DEFSTRUCT-OBJECT-VECTOR-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_cons_method", "VISIT-DEFSTRUCT-OBJECT-CONS-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_hash_table_method", "VISIT-DEFSTRUCT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
        declareFunction("print_visitor", "PRINT-VISITOR", 4, 0, false);
        return SubLNil.NIL;
    }

    public static SubLObject init_visitation_file() {
        deflexical("*VISIT-DEFSTRUCT-OBJECT-METHOD-TABLE*", make_vector($int$256, SubLNil.NIL));
        return SubLNil.NIL;
    }

    public static SubLObject print_visitor(SubLObject obj, SubLObject phase, SubLObject slot, SubLObject value) {
        return format(T, $str10$_A__A__A___A__, new SubLObject[]{ phase, obj, slot, value });
    }

    public static SubLObject setup_visitation_file() {
        register_method($visit_defstruct_object_method_table$.getGlobalValue(), $dtp_bignum$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD));
        register_method($visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fixnum$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD));
        register_method($visit_defstruct_object_method_table$.getGlobalValue(), $dtp_float$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FLOAT_METHOD));
        register_method($visit_defstruct_object_method_table$.getGlobalValue(), $dtp_string$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_STRING_METHOD));
        register_method($visit_defstruct_object_method_table$.getGlobalValue(), $dtp_character$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CHARACTER_METHOD));
        register_method($visit_defstruct_object_method_table$.getGlobalValue(), $dtp_symbol$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SYMBOL_METHOD));
        register_method($visit_defstruct_object_method_table$.getGlobalValue(), $dtp_vector$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VECTOR_METHOD));
        register_method($visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CONS_METHOD));
        register_method($visit_defstruct_object_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HASH_TABLE_METHOD));
        return SubLNil.NIL;
    }

    public static SubLObject visit_defstruct(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_object(obj, visitor_fn);
    }

    public static SubLObject visit_defstruct_noop(SubLObject obj, SubLObject visitor_fn) {
        return obj;
    }

    public static SubLObject visit_defstruct_object(SubLObject obj, SubLObject visitor_fn) {
        SubLObject method_function = method_func(obj, $visit_defstruct_object_method_table$.getGlobalValue());
        if (SubLNil.NIL != method_function)
            return funcall(method_function, obj, visitor_fn);

        return Errors.error($str1$No_visitation_function_defined_fo, type_of(obj));
    }

    public static SubLObject visit_defstruct_object_character_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_noop(obj, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_cons_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_noop(obj, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_float_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_noop(obj, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_hash_table_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_noop(obj, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_integer_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_noop(obj, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_string_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_noop(obj, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_symbol_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_noop(obj, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_vector_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_noop(obj, visitor_fn);
    }

    public static final SubLFile me = new visitation();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation";

    // deflexical
    public static final SubLSymbol $visit_defstruct_object_method_table$ = makeSymbol("*VISIT-DEFSTRUCT-OBJECT-METHOD-TABLE*");



    public static final SubLString $str1$No_visitation_function_defined_fo = makeString("No visitation function defined for ~A.");

    public static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_INTEGER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INTEGER-METHOD");

    public static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FLOAT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FLOAT-METHOD");

    public static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_STRING_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-STRING-METHOD");

    public static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CHARACTER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CHARACTER-METHOD");

    public static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SYMBOL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SYMBOL-METHOD");

    public static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_VECTOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-VECTOR-METHOD");

    public static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CONS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CONS-METHOD");

    public static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HASH_TABLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HASH-TABLE-METHOD");

    public static final SubLString $str10$_A__A__A___A__ = makeString("~A ~A ~A: ~A~%");

    

    @Override
    public void declareFunctions() {
        declare_visitation_file();
    }

    @Override
    public void initializeVariables() {
        init_visitation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_visitation_file();
    }
}

