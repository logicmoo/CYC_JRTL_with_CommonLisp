/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.extract_dynamic_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logxor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import java.util.ArrayList;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SPECIAL-VARIABLE-STATE
 * source file: /cyc/top/cycl/special-variable-state.lisp
 * created:     2019/07/03 17:37:15
 */
public final class special_variable_state extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new special_variable_state();

 public static final String myName = "com.cyc.cycjava.cycl.special_variable_state";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_special_variable_state$ = makeSymbol("*DTP-SPECIAL-VARIABLE-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol BOUND_SPECIAL_VARIABLE_P = makeSymbol("BOUND-SPECIAL-VARIABLE-P");

    private static final SubLSymbol SPECIAL_VARIABLE_STATE = makeSymbol("SPECIAL-VARIABLE-STATE");

    private static final SubLSymbol SPECIAL_VARIABLE_STATE_P = makeSymbol("SPECIAL-VARIABLE-STATE-P");

    static private final SubLList $list3 = list(makeSymbol("VARIABLES"), makeSymbol("VALUES"));

    static private final SubLList $list4 = list(makeKeyword("VARIABLES"), makeKeyword("VALUES"));

    static private final SubLList $list5 = list(makeSymbol("SVS-VARIABLES"), makeSymbol("SVS-VALUES"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-SVS-VARIABLES"), makeSymbol("_CSETF-SVS-VALUES"));

    private static final SubLSymbol PRINT_SPECIAL_VARIABLE_STATE = makeSymbol("PRINT-SPECIAL-VARIABLE-STATE");

    private static final SubLSymbol SPECIAL_VARIABLE_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SPECIAL-VARIABLE-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SPECIAL-VARIABLE-STATE-P"));

    private static final SubLSymbol SVS_VARIABLES = makeSymbol("SVS-VARIABLES");

    private static final SubLSymbol _CSETF_SVS_VARIABLES = makeSymbol("_CSETF-SVS-VARIABLES");

    private static final SubLSymbol SVS_VALUES = makeSymbol("SVS-VALUES");

    private static final SubLSymbol _CSETF_SVS_VALUES = makeSymbol("_CSETF-SVS-VALUES");

    private static final SubLString $str16$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SPECIAL_VARIABLE_STATE = makeSymbol("MAKE-SPECIAL-VARIABLE-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SPECIAL_VARIABLE_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SPECIAL-VARIABLE-STATE-METHOD");

    private static final SubLString $str22$_S_variables = makeString("~S variables");

    private static final SubLSymbol SXHASH_SPECIAL_VARIABLE_STATE_METHOD = makeSymbol("SXHASH-SPECIAL-VARIABLE-STATE-METHOD");

    private static final SubLSymbol BOUND_SPECIAL_VARIABLE_LIST_P = makeSymbol("BOUND-SPECIAL-VARIABLE-LIST-P");

    static private final SubLList $list26 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLList $list27 = list(makeSymbol("SVS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym28$SVS_VAR = makeUninternedSymbol("SVS-VAR");

    private static final SubLSymbol POSSIBLY_WITH_SPECIAL_VARIABLE_STATE = makeSymbol("POSSIBLY-WITH-SPECIAL-VARIABLE-STATE");

    private static final SubLSymbol WITH_SPECIAL_VARIABLE_STATE_VARIABLES = makeSymbol("WITH-SPECIAL-VARIABLE-STATE-VARIABLES");

    private static final SubLSymbol WITH_SPECIAL_VARIABLE_STATE_VALUES = makeSymbol("WITH-SPECIAL-VARIABLE-STATE-VALUES");

    private static final SubLList $list35 = list(makeSymbol("SPECIAL-VARIABLE-STATE-P"));

    private static final SubLString $str36$___S____S__ = makeString("~&~S = ~S~%");

    // Definitions
    /**
     * Return T iff OBJECT is a boundp symbol.
     */
    @LispMethod(comment = "Return T iff OBJECT is a boundp symbol.")
    public static final SubLObject bound_symbol_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && (NIL != boundp(v_object)));
    }

    // Definitions
    /**
     * Return T iff OBJECT is a boundp symbol.
     */
    @LispMethod(comment = "Return T iff OBJECT is a boundp symbol.")
    public static SubLObject bound_symbol_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && (NIL != boundp(v_object)));
    }

    /**
     * Return T iff OBJECT is a bound (and rebindable) special variable.
     */
    @LispMethod(comment = "Return T iff OBJECT is a bound (and rebindable) special variable.")
    public static final SubLObject bound_special_variable_p_alt(SubLObject v_object) {
        return bound_symbol_p(v_object);
    }

    /**
     * Return T iff OBJECT is a bound (and rebindable) special variable.
     */
    @LispMethod(comment = "Return T iff OBJECT is a bound (and rebindable) special variable.")
    public static SubLObject bound_special_variable_p(final SubLObject v_object) {
        return bound_symbol_p(v_object);
    }

    /**
     * Return T iff OBJECT is a (potentially empty) list of bound special variables.
     */
    @LispMethod(comment = "Return T iff OBJECT is a (potentially empty) list of bound special variables.")
    public static final SubLObject bound_special_variable_list_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(BOUND_SPECIAL_VARIABLE_P, v_object, UNPROVIDED)));
    }

    /**
     * Return T iff OBJECT is a (potentially empty) list of bound special variables.
     */
    @LispMethod(comment = "Return T iff OBJECT is a (potentially empty) list of bound special variables.")
    public static SubLObject bound_special_variable_list_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.every_in_list(BOUND_SPECIAL_VARIABLE_P, v_object, UNPROVIDED)));
    }

    public static final SubLObject special_variable_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_special_variable_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject special_variable_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_special_variable_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject special_variable_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.special_variable_state.$special_variable_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject special_variable_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.special_variable_state.$special_variable_state_native.class ? T : NIL;
    }

    public static final SubLObject svs_variables_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SPECIAL_VARIABLE_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject svs_variables(final SubLObject v_object) {
        assert NIL != special_variable_state_p(v_object) : "! special_variable_state.special_variable_state_p(v_object) " + "special_variable_state.special_variable_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject svs_values_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SPECIAL_VARIABLE_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject svs_values(final SubLObject v_object) {
        assert NIL != special_variable_state_p(v_object) : "! special_variable_state.special_variable_state_p(v_object) " + "special_variable_state.special_variable_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_svs_variables_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SPECIAL_VARIABLE_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_svs_variables(final SubLObject v_object, final SubLObject value) {
        assert NIL != special_variable_state_p(v_object) : "! special_variable_state.special_variable_state_p(v_object) " + "special_variable_state.special_variable_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_svs_values_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SPECIAL_VARIABLE_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_svs_values(final SubLObject v_object, final SubLObject value) {
        assert NIL != special_variable_state_p(v_object) : "! special_variable_state.special_variable_state_p(v_object) " + "special_variable_state.special_variable_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_special_variable_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.special_variable_state.$special_variable_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($VARIABLES)) {
                        _csetf_svs_variables(v_new, current_value);
                    } else {
                        if (pcase_var.eql($VALUES)) {
                            _csetf_svs_values(v_new, current_value);
                        } else {
                            Errors.error($str_alt15$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_special_variable_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.special_variable_state.$special_variable_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($VARIABLES)) {
                _csetf_svs_variables(v_new, current_value);
            } else
                if (pcase_var.eql($VALUES)) {
                    _csetf_svs_values(v_new, current_value);
                } else {
                    Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_special_variable_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SPECIAL_VARIABLE_STATE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $VARIABLES, svs_variables(obj));
        funcall(visitor_fn, obj, $SLOT, $VALUES, svs_values(obj));
        funcall(visitor_fn, obj, $END, MAKE_SPECIAL_VARIABLE_STATE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_special_variable_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_special_variable_state(obj, visitor_fn);
    }

    public static final SubLObject print_special_variable_state_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt16$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    format(stream, $str_alt18$_S_variables, length(svs_variables(v_object)));
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_special_variable_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            format(stream, $str22$_S_variables, length(svs_variables(v_object)));
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject sxhash_special_variable_state_method_alt(SubLObject v_object) {
        return logxor(Sxhash.sxhash(svs_variables(v_object)), Sxhash.sxhash(svs_values(v_object)));
    }

    public static SubLObject sxhash_special_variable_state_method(final SubLObject v_object) {
        return logxor(Sxhash.sxhash(svs_variables(v_object)), Sxhash.sxhash(svs_values(v_object)));
    }

    /**
     * Return a new @xref special-variable-state-p based on the current values for SPECIAL-VARIABLES.
     */
    @LispMethod(comment = "Return a new @xref special-variable-state-p based on the current values for SPECIAL-VARIABLES.")
    public static final SubLObject new_special_variable_state_alt(SubLObject special_variables) {
        SubLTrampolineFile.checkType(special_variables, BOUND_SPECIAL_VARIABLE_LIST_P);
        {
            SubLObject svs = make_special_variable_state(UNPROVIDED);
            _csetf_svs_variables(svs, copy_list(special_variables));
            _csetf_svs_values(svs, make_list(length(special_variables), UNPROVIDED));
            return update_special_variable_state(svs);
        }
    }

    /**
     * Return a new @xref special-variable-state-p based on the current values for SPECIAL-VARIABLES.
     */
    @LispMethod(comment = "Return a new @xref special-variable-state-p based on the current values for SPECIAL-VARIABLES.")
    public static SubLObject new_special_variable_state(final SubLObject special_variables) {
        assert NIL != bound_special_variable_list_p(special_variables) : "! special_variable_state.bound_special_variable_list_p(special_variables) " + ("special_variable_state.bound_special_variable_list_p(special_variables) " + "CommonSymbols.NIL != special_variable_state.bound_special_variable_list_p(special_variables) ") + special_variables;
        final SubLObject svs = make_special_variable_state(UNPROVIDED);
        _csetf_svs_variables(svs, copy_list(special_variables));
        _csetf_svs_values(svs, make_list(length(special_variables), UNPROVIDED));
        return update_special_variable_state(svs);
    }

    public static SubLObject new_special_variable_state_from_alist(final SubLObject alist) {
        assert NIL != list_utilities.alist_p(alist) : "! list_utilities.alist_p(alist) " + ("list_utilities.alist_p(alist) " + "CommonSymbols.NIL != list_utilities.alist_p(alist) ") + alist;
        final SubLObject svs = new_special_variable_state(NIL);
        SubLObject cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list26);
            variable = current.first();
            current = value = current.rest();
            special_variable_state_push(svs, variable, value);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return svs;
    }

    public static SubLObject copy_special_variable_state(final SubLObject source_svs) {
        assert NIL != special_variable_state_p(source_svs) : "! special_variable_state.special_variable_state_p(source_svs) " + ("special_variable_state.special_variable_state_p(source_svs) " + "CommonSymbols.NIL != special_variable_state.special_variable_state_p(source_svs) ") + source_svs;
        final SubLObject svs = make_special_variable_state(UNPROVIDED);
        _csetf_svs_variables(svs, copy_list(svs_variables(source_svs)));
        _csetf_svs_values(svs, copy_tree(svs_values(source_svs)));
        return svs;
    }

    /**
     * Return a list of the special variables in special-variable-state SVS.
     */
    @LispMethod(comment = "Return a list of the special variables in special-variable-state SVS.")
    public static final SubLObject special_variable_state_variables_alt(SubLObject svs) {
        SubLTrampolineFile.checkType(svs, SPECIAL_VARIABLE_STATE_P);
        return svs_variables(svs);
    }

    /**
     * Return a list of the special variables in special-variable-state SVS.
     */
    @LispMethod(comment = "Return a list of the special variables in special-variable-state SVS.")
    public static SubLObject special_variable_state_variables(final SubLObject svs) {
        assert NIL != special_variable_state_p(svs) : "! special_variable_state.special_variable_state_p(svs) " + ("special_variable_state.special_variable_state_p(svs) " + "CommonSymbols.NIL != special_variable_state.special_variable_state_p(svs) ") + svs;
        return svs_variables(svs);
    }

    /**
     * Return the value for special VARIABLE in special-variable-state SVS.
     * Return DEFAULT if variable is not present.
     * Return second value of T iff variable is present.
     */
    @LispMethod(comment = "Return the value for special VARIABLE in special-variable-state SVS.\r\nReturn DEFAULT if variable is not present.\r\nReturn second value of T iff variable is present.\nReturn the value for special VARIABLE in special-variable-state SVS.\nReturn DEFAULT if variable is not present.\nReturn second value of T iff variable is present.")
    public static final SubLObject special_variable_state_variable_value_alt(SubLObject svs, SubLObject variable, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(svs, SPECIAL_VARIABLE_STATE_P);
        SubLTrampolineFile.checkType(variable, BOUND_SPECIAL_VARIABLE_P);
        {
            SubLObject position = position(variable, svs_variables(svs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject value = (NIL != position) ? ((SubLObject) (nth(position, svs_values(svs)))) : v_default;
            return values(value, list_utilities.sublisp_boolean(position));
        }
    }

    /**
     * Return the value for special VARIABLE in special-variable-state SVS.
     * Return DEFAULT if variable is not present.
     * Return second value of T iff variable is present.
     */
    @LispMethod(comment = "Return the value for special VARIABLE in special-variable-state SVS.\r\nReturn DEFAULT if variable is not present.\r\nReturn second value of T iff variable is present.\nReturn the value for special VARIABLE in special-variable-state SVS.\nReturn DEFAULT if variable is not present.\nReturn second value of T iff variable is present.")
    public static SubLObject special_variable_state_variable_value(final SubLObject svs, final SubLObject variable, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != special_variable_state_p(svs) : "! special_variable_state.special_variable_state_p(svs) " + ("special_variable_state.special_variable_state_p(svs) " + "CommonSymbols.NIL != special_variable_state.special_variable_state_p(svs) ") + svs;
        assert NIL != bound_special_variable_p(variable) : "! special_variable_state.bound_special_variable_p(variable) " + ("special_variable_state.bound_special_variable_p(variable) " + "CommonSymbols.NIL != special_variable_state.bound_special_variable_p(variable) ") + variable;
        final SubLObject position = position(variable, svs_variables(svs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject value = (NIL != position) ? nth(position, svs_values(svs)) : v_default;
        return values(value, list_utilities.sublisp_boolean(position));
    }

    public static SubLObject possibly_with_special_variable_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject svs = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        svs = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (!svs.isAtom()) {
            final SubLObject svs_var = $sym28$SVS_VAR;
            return list(CLET, list(list(svs_var, svs)), listS(POSSIBLY_WITH_SPECIAL_VARIABLE_STATE, svs_var, append(body, NIL)));
        }
        return listS(CPROGV, list(WITH_SPECIAL_VARIABLE_STATE_VARIABLES, svs), list(WITH_SPECIAL_VARIABLE_STATE_VALUES, svs), append(body, NIL));
    }

    /**
     * Evaluate BODY within the dynamic bindings of the special variables of special-variable-state SVS.
     */
    @LispMethod(comment = "Evaluate BODY within the dynamic bindings of the special variables of special-variable-state SVS.")
    public static final SubLObject with_special_variable_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject svs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            svs = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject svs_var = $sym23$SVS_VAR;
                return list(CLET, list(list(svs_var, svs)), listS(CHECK_TYPE, svs_var, $list_alt26), listS(CPROGV, list(WITH_SPECIAL_VARIABLE_STATE_VARIABLES, svs_var), list(WITH_SPECIAL_VARIABLE_STATE_VALUES, svs_var), append(body, NIL)));
            }
        }
    }

    /**
     * Evaluate BODY within the dynamic bindings of the special variables of special-variable-state SVS.
     */
    @LispMethod(comment = "Evaluate BODY within the dynamic bindings of the special variables of special-variable-state SVS.")
    public static SubLObject with_special_variable_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject svs = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        svs = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(POSSIBLY_WITH_SPECIAL_VARIABLE_STATE, svs, listS(ENFORCE_TYPE, svs, $list35), append(body, NIL));
    }

    public static final SubLObject with_special_variable_state_variables_alt(SubLObject svs) {
        return svs_variables(svs);
    }

    public static SubLObject with_special_variable_state_variables(final SubLObject svs) {
        if (NIL != svs) {
            SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
            return svs_variables(svs);
        }
        return NIL;
    }

    public static final SubLObject with_special_variable_state_values_alt(SubLObject svs) {
        return svs_values(svs);
    }

    public static SubLObject with_special_variable_state_values(final SubLObject svs) {
        if (NIL != svs) {
            SubLTrampolineFile.enforceType(svs, SPECIAL_VARIABLE_STATE_P);
            return svs_values(svs);
        }
        return NIL;
    }

    /**
     * Update special-variable-state SVS with the current binding values for all its special-variables.
     *
     * @return SVS
     */
    @LispMethod(comment = "Update special-variable-state SVS with the current binding values for all its special-variables.\r\n\r\n@return SVS")
    public static final SubLObject update_special_variable_state_alt(SubLObject svs) {
        SubLTrampolineFile.checkType(svs, SPECIAL_VARIABLE_STATE_P);
        update_special_variable_value_list(svs_values(svs), svs_variables(svs));
        return svs;
    }

    /**
     * Update special-variable-state SVS with the current binding values for all its special-variables.
     *
     * @return SVS
     */
    @LispMethod(comment = "Update special-variable-state SVS with the current binding values for all its special-variables.\r\n\r\n@return SVS")
    public static SubLObject update_special_variable_state(final SubLObject svs) {
        assert NIL != special_variable_state_p(svs) : "! special_variable_state.special_variable_state_p(svs) " + ("special_variable_state.special_variable_state_p(svs) " + "CommonSymbols.NIL != special_variable_state.special_variable_state_p(svs) ") + svs;
        update_special_variable_value_list(svs_values(svs), svs_variables(svs));
        return svs;
    }

    /**
     * Pushes VARIABLE and VALUE onto SVS.  Assumes VARIABLE is not yet present in SVS.
     */
    @LispMethod(comment = "Pushes VARIABLE and VALUE onto SVS.  Assumes VARIABLE is not yet present in SVS.")
    public static final SubLObject special_variable_state_push_alt(SubLObject svs, SubLObject variable, SubLObject value) {
        SubLTrampolineFile.checkType(svs, SPECIAL_VARIABLE_STATE_P);
        SubLTrampolineFile.checkType(variable, BOUND_SPECIAL_VARIABLE_P);
        _csetf_svs_variables(svs, cons(variable, svs_variables(svs)));
        _csetf_svs_values(svs, cons(value, svs_values(svs)));
        return svs;
    }

    /**
     * Pushes VARIABLE and VALUE onto SVS.  Assumes VARIABLE is not yet present in SVS.
     */
    @LispMethod(comment = "Pushes VARIABLE and VALUE onto SVS.  Assumes VARIABLE is not yet present in SVS.")
    public static SubLObject special_variable_state_push(final SubLObject svs, final SubLObject variable, final SubLObject value) {
        assert NIL != special_variable_state_p(svs) : "! special_variable_state.special_variable_state_p(svs) " + ("special_variable_state.special_variable_state_p(svs) " + "CommonSymbols.NIL != special_variable_state.special_variable_state_p(svs) ") + svs;
        assert NIL != bound_special_variable_p(variable) : "! special_variable_state.bound_special_variable_p(variable) " + ("special_variable_state.bound_special_variable_p(variable) " + "CommonSymbols.NIL != special_variable_state.bound_special_variable_p(variable) ") + variable;
        _csetf_svs_variables(svs, cons(variable, svs_variables(svs)));
        _csetf_svs_values(svs, cons(value, svs_values(svs)));
        return svs;
    }

    public static final SubLObject update_special_variable_value_list_alt(SubLObject values, SubLObject v_variables) {
        {
            SubLObject rest_variables = NIL;
            SubLObject rest_values = NIL;
            for (rest_variables = v_variables, rest_values = values; NIL != rest_variables; rest_variables = rest_variables.rest() , rest_values = rest_values.rest()) {
                {
                    SubLObject variable = rest_variables.first();
                    SubLObject value = symbol_value(variable);
                    rplaca(rest_values, value);
                }
            }
        }
        return values;
    }

    public static SubLObject update_special_variable_value_list(final SubLObject values, final SubLObject v_variables) {
        SubLObject rest_variables;
        SubLObject rest_values;
        SubLObject variable;
        SubLObject value;
        for (rest_variables = NIL, rest_values = NIL, rest_variables = v_variables, rest_values = values; NIL != rest_variables; rest_variables = rest_variables.rest() , rest_values = rest_values.rest()) {
            variable = rest_variables.first();
            value = symbol_value(variable);
            rplaca(rest_values, value);
        }
        return values;
    }

    /**
     * Display the contents of special-variable-state SVS to STREAM.
     *
     * @return SVS
     */
    @LispMethod(comment = "Display the contents of special-variable-state SVS to STREAM.\r\n\r\n@return SVS")
    public static final SubLObject show_special_variable_state_alt(SubLObject svs, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(svs, SPECIAL_VARIABLE_STATE_P);
        {
            SubLObject rest_variables = NIL;
            SubLObject rest_values = NIL;
            for (rest_variables = svs_variables(svs), rest_values = svs_values(svs); NIL != rest_variables; rest_variables = rest_variables.rest() , rest_values = rest_values.rest()) {
                {
                    SubLObject variable = rest_variables.first();
                    SubLObject value = rest_values.first();
                    format(stream, $str_alt31$___S____S__, variable, value);
                }
            }
        }
        force_output(stream);
        return svs;
    }

    /**
     * Display the contents of special-variable-state SVS to STREAM.
     *
     * @return SVS
     */
    @LispMethod(comment = "Display the contents of special-variable-state SVS to STREAM.\r\n\r\n@return SVS")
    public static SubLObject show_special_variable_state(final SubLObject svs, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != special_variable_state_p(svs) : "! special_variable_state.special_variable_state_p(svs) " + ("special_variable_state.special_variable_state_p(svs) " + "CommonSymbols.NIL != special_variable_state.special_variable_state_p(svs) ") + svs;
        SubLObject rest_variables;
        SubLObject rest_values;
        SubLObject variable;
        SubLObject value;
        for (rest_variables = NIL, rest_values = NIL, rest_variables = svs_variables(svs), rest_values = svs_values(svs); NIL != rest_variables; rest_variables = rest_variables.rest() , rest_values = rest_values.rest()) {
            variable = rest_variables.first();
            value = rest_values.first();
            format(stream, $str36$___S____S__, variable, value);
        }
        force_output(stream);
        return svs;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("VARIABLES"), makeSymbol("VALUES"));

    static private final SubLList $list_alt4 = list(makeKeyword("VARIABLES"), makeKeyword("VALUES"));

    static private final SubLList $list_alt5 = list(makeSymbol("SVS-VARIABLES"), makeSymbol("SVS-VALUES"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-SVS-VARIABLES"), makeSymbol("_CSETF-SVS-VALUES"));

    public static SubLObject nmerge_special_variable_state(final SubLObject mutate_svs, final SubLObject override_svs) {
        final SubLObject cprogv_var = with_special_variable_state_variables(mutate_svs);
        final ArrayList old_values = extract_dynamic_values(cprogv_var);
        try {
            bind_dynamic_vars(cprogv_var, with_special_variable_state_values(mutate_svs));
            SubLTrampolineFile.enforceType(mutate_svs, SPECIAL_VARIABLE_STATE_P);
            final SubLObject cprogv_var_$1 = with_special_variable_state_variables(override_svs);
            final ArrayList old_values_$2 = extract_dynamic_values(cprogv_var_$1);
            try {
                bind_dynamic_vars(cprogv_var_$1, with_special_variable_state_values(override_svs));
                SubLTrampolineFile.enforceType(override_svs, SPECIAL_VARIABLE_STATE_P);
                update_special_variable_state(mutate_svs);
            } finally {
                rebind_dynamic_vars(cprogv_var_$1, old_values_$2);
            }
        } finally {
            rebind_dynamic_vars(cprogv_var, old_values);
        }
        return mutate_svs;
    }

    static private final SubLString $str_alt15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt16$__ = makeString("#<");

    static private final SubLString $str_alt18$_S_variables = makeString("~S variables");

    public static SubLObject declare_special_variable_state_file() {
        declareFunction("bound_symbol_p", "BOUND-SYMBOL-P", 1, 0, false);
        declareFunction("bound_special_variable_p", "BOUND-SPECIAL-VARIABLE-P", 1, 0, false);
        declareFunction("bound_special_variable_list_p", "BOUND-SPECIAL-VARIABLE-LIST-P", 1, 0, false);
        declareFunction("special_variable_state_print_function_trampoline", "SPECIAL-VARIABLE-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("special_variable_state_p", "SPECIAL-VARIABLE-STATE-P", 1, 0, false);
        new special_variable_state.$special_variable_state_p$UnaryFunction();
        declareFunction("svs_variables", "SVS-VARIABLES", 1, 0, false);
        declareFunction("svs_values", "SVS-VALUES", 1, 0, false);
        declareFunction("_csetf_svs_variables", "_CSETF-SVS-VARIABLES", 2, 0, false);
        declareFunction("_csetf_svs_values", "_CSETF-SVS-VALUES", 2, 0, false);
        declareFunction("make_special_variable_state", "MAKE-SPECIAL-VARIABLE-STATE", 0, 1, false);
        declareFunction("visit_defstruct_special_variable_state", "VISIT-DEFSTRUCT-SPECIAL-VARIABLE-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_special_variable_state_method", "VISIT-DEFSTRUCT-OBJECT-SPECIAL-VARIABLE-STATE-METHOD", 2, 0, false);
        declareFunction("print_special_variable_state", "PRINT-SPECIAL-VARIABLE-STATE", 3, 0, false);
        declareFunction("sxhash_special_variable_state_method", "SXHASH-SPECIAL-VARIABLE-STATE-METHOD", 1, 0, false);
        declareFunction("new_special_variable_state", "NEW-SPECIAL-VARIABLE-STATE", 1, 0, false);
        declareFunction("new_special_variable_state_from_alist", "NEW-SPECIAL-VARIABLE-STATE-FROM-ALIST", 1, 0, false);
        declareFunction("copy_special_variable_state", "COPY-SPECIAL-VARIABLE-STATE", 1, 0, false);
        declareFunction("special_variable_state_variables", "SPECIAL-VARIABLE-STATE-VARIABLES", 1, 0, false);
        declareFunction("special_variable_state_variable_value", "SPECIAL-VARIABLE-STATE-VARIABLE-VALUE", 2, 1, false);
        declareMacro("possibly_with_special_variable_state", "POSSIBLY-WITH-SPECIAL-VARIABLE-STATE");
        declareMacro("with_special_variable_state", "WITH-SPECIAL-VARIABLE-STATE");
        declareFunction("with_special_variable_state_variables", "WITH-SPECIAL-VARIABLE-STATE-VARIABLES", 1, 0, false);
        declareFunction("with_special_variable_state_values", "WITH-SPECIAL-VARIABLE-STATE-VALUES", 1, 0, false);
        declareFunction("update_special_variable_state", "UPDATE-SPECIAL-VARIABLE-STATE", 1, 0, false);
        declareFunction("special_variable_state_push", "SPECIAL-VARIABLE-STATE-PUSH", 3, 0, false);
        declareFunction("update_special_variable_value_list", "UPDATE-SPECIAL-VARIABLE-VALUE-LIST", 2, 0, false);
        declareFunction("show_special_variable_state", "SHOW-SPECIAL-VARIABLE-STATE", 1, 1, false);
        declareFunction("nmerge_special_variable_state", "NMERGE-SPECIAL-VARIABLE-STATE", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt22 = list(makeSymbol("SVS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym23$SVS_VAR = makeUninternedSymbol("SVS-VAR");

    static private final SubLList $list_alt26 = list(makeSymbol("SPECIAL-VARIABLE-STATE-P"));

    private static final SubLSymbol WITH_SPECIAL_VARIABLE_STATE = makeSymbol("WITH-SPECIAL-VARIABLE-STATE");

    static private final SubLString $str_alt31$___S____S__ = makeString("~&~S = ~S~%");

    public static SubLObject init_special_variable_state_file() {
        defconstant("*DTP-SPECIAL-VARIABLE-STATE*", SPECIAL_VARIABLE_STATE);
        return NIL;
    }

    public static final SubLObject setup_special_variable_state_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), symbol_function(SPECIAL_VARIABLE_STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SVS_VARIABLES, _CSETF_SVS_VARIABLES);
        def_csetf(SVS_VALUES, _CSETF_SVS_VALUES);
        identity(SPECIAL_VARIABLE_STATE);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), symbol_function(SXHASH_SPECIAL_VARIABLE_STATE_METHOD));
        register_macro_helper(WITH_SPECIAL_VARIABLE_STATE_VARIABLES, WITH_SPECIAL_VARIABLE_STATE);
        register_macro_helper(WITH_SPECIAL_VARIABLE_STATE_VALUES, WITH_SPECIAL_VARIABLE_STATE);
        return NIL;
    }

    public static SubLObject setup_special_variable_state_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), symbol_function(SPECIAL_VARIABLE_STATE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list9);
            def_csetf(SVS_VARIABLES, _CSETF_SVS_VARIABLES);
            def_csetf(SVS_VALUES, _CSETF_SVS_VALUES);
            identity(SPECIAL_VARIABLE_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SPECIAL_VARIABLE_STATE_METHOD));
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), symbol_function(SXHASH_SPECIAL_VARIABLE_STATE_METHOD));
            register_macro_helper(WITH_SPECIAL_VARIABLE_STATE_VARIABLES, POSSIBLY_WITH_SPECIAL_VARIABLE_STATE);
            register_macro_helper(WITH_SPECIAL_VARIABLE_STATE_VALUES, POSSIBLY_WITH_SPECIAL_VARIABLE_STATE);
        }
        if (SubLFiles.USE_V2) {
            register_macro_helper(WITH_SPECIAL_VARIABLE_STATE_VARIABLES, WITH_SPECIAL_VARIABLE_STATE);
            register_macro_helper(WITH_SPECIAL_VARIABLE_STATE_VALUES, WITH_SPECIAL_VARIABLE_STATE);
        }
        return NIL;
    }

    public static SubLObject setup_special_variable_state_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), symbol_function(SPECIAL_VARIABLE_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(SVS_VARIABLES, _CSETF_SVS_VARIABLES);
        def_csetf(SVS_VALUES, _CSETF_SVS_VALUES);
        identity(SPECIAL_VARIABLE_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SPECIAL_VARIABLE_STATE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), symbol_function(SXHASH_SPECIAL_VARIABLE_STATE_METHOD));
        register_macro_helper(WITH_SPECIAL_VARIABLE_STATE_VARIABLES, POSSIBLY_WITH_SPECIAL_VARIABLE_STATE);
        register_macro_helper(WITH_SPECIAL_VARIABLE_STATE_VALUES, POSSIBLY_WITH_SPECIAL_VARIABLE_STATE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_special_variable_state_file();
    }

    @Override
    public void initializeVariables() {
        init_special_variable_state_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_special_variable_state_file();
    }

    

    public static final class $special_variable_state_native extends SubLStructNative {
        public SubLObject $variables;

        public SubLObject $values;

        private static final SubLStructDeclNative structDecl;

        public $special_variable_state_native() {
            special_variable_state.$special_variable_state_native.this.$variables = Lisp.NIL;
            special_variable_state.$special_variable_state_native.this.$values = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return special_variable_state.$special_variable_state_native.this.$variables;
        }

        @Override
        public SubLObject getField3() {
            return special_variable_state.$special_variable_state_native.this.$values;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return special_variable_state.$special_variable_state_native.this.$variables = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return special_variable_state.$special_variable_state_native.this.$values = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.special_variable_state.$special_variable_state_native.class, SPECIAL_VARIABLE_STATE, SPECIAL_VARIABLE_STATE_P, $list3, $list4, new String[]{ "$variables", "$values" }, $list5, $list6, PRINT_SPECIAL_VARIABLE_STATE);
        }
    }

    public static final class $special_variable_state_p$UnaryFunction extends UnaryFunction {
        public $special_variable_state_p$UnaryFunction() {
            super(extractFunctionNamed("SPECIAL-VARIABLE-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return special_variable_state_p(arg1);
        }
    }
}

/**
 * Total time: 210 ms
 */
