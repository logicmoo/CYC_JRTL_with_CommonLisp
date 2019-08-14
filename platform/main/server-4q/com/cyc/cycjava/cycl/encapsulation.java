/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.$dtp_constant$;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$last_agenda_op$;
import static com.cyc.cycjava.cycl.control_vars.$unencapsulating_within_agenda$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_cons$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ENCAPSULATION
 * source file: /cyc/top/cycl/encapsulation.lisp
 * created:     2019/07/03 17:37:50
 */
public final class encapsulation extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @unknown this needs to go ASAP
     */
    @LispMethod(comment = "@unknown this needs to go ASAP")
    public static final SubLObject unencapsulate_common_symbol(SubLObject v_object) {
        {
            SubLObject mapping = list_utilities.alist_lookup_without_values($unencapsulated_common_symbols$.getGlobalValue(), v_object, symbol_function(EQ), v_object);
            if (mapping == v_object) {
                return v_object;
            } else {
                return mapping.first();
            }
        }
    }

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $unencapsulated_common_symbols$ = makeSymbol("*UNENCAPSULATED-COMMON-SYMBOLS*");

    public static final SubLFile me = new encapsulation();

 public static final String myName = "com.cyc.cycjava.cycl.encapsulation";


    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $encapsulate_method_table$ = makeSymbol("*ENCAPSULATE-METHOD-TABLE*");

    // defparameter
    // Do we believe the names when the ids fail to match?
    /**
     * Do we believe the names when the ids fail to match?
     */
    @LispMethod(comment = "Do we believe the names when the ids fail to match?\ndefparameter")
    public static final SubLSymbol $unencapsulate_believe_names$ = makeSymbol("*UNENCAPSULATE-BELIEVE-NAMES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $unencapsulate_constant_via_name_optimizationP$ = makeSymbol("*UNENCAPSULATE-CONSTANT-VIA-NAME-OPTIMIZATION?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $unencapsulate_find_constant_capacity$ = makeSymbol("*UNENCAPSULATE-FIND-CONSTANT-CAPACITY*");

    private static final SubLSymbol ENCAPSULATE_CONS_METHOD = makeSymbol("ENCAPSULATE-CONS-METHOD");

    private static final SubLSymbol ENCAPSULATE_CONSTANT_METHOD = makeSymbol("ENCAPSULATE-CONSTANT-METHOD");

    private static final SubLSymbol ENCAPSULATE_NART_METHOD = makeSymbol("ENCAPSULATE-NART-METHOD");

    static private final SubLString $str4$Attempt_to_encapsulate_invalid_co = makeString("Attempt to encapsulate invalid constant ~S.");

    static private final SubLString $str5$Attempt_to_encapsulate_a_constant = makeString("Attempt to encapsulate a constant ~S with an invalid external ID.");

    static private final SubLString $str7$Attempt_to_encapsulate_a_constant = makeString("Attempt to encapsulate a constant ~S with a non-string name ~S.");

    static private final SubLString $str8$Attempt_to_encapsulate_the_NART__ = makeString("Attempt to encapsulate the NART ~S with an invalid HL formula ~S.");

    static private final SubLList $list11 = list(makeSymbol("HP"), makeSymbol("NAME-SPEC"), makeSymbol("EXTERNAL-ID"));

    private static final SubLSymbol $unencapsulate_find_constant_lookaside_table$ = makeSymbol("*UNENCAPSULATE-FIND-CONSTANT-LOOKASIDE-TABLE*");

    private static final SubLList $list13 = list(makeSymbol("NAT"), makeSymbol("NART-HL-FORMULA-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("ID"));

    private static final SubLString $str15$__Last_operation___S___This_objec = makeString("~%Last operation: ~S ~%This object did not yield a term: ~S");

    private static final SubLString $$$Skip_this_operation = makeString("Skip this operation");

    private static final SubLString $str17$_S_did_not_yield_a_term = makeString("~S did not yield a term");

    public static final SubLObject encapsulate_alt(SubLObject v_object) {
        {
            SubLObject method_function = method_func(v_object, $encapsulate_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, v_object);
            }
            return v_object;
        }
    }

    public static SubLObject encapsulate(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $encapsulate_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return v_object;
    }

    public static final SubLObject encapsulate_cons_method_alt(SubLObject v_object) {
        return list_utilities.recons(com.cyc.cycjava.cycl.encapsulation.encapsulate(v_object.first()), com.cyc.cycjava.cycl.encapsulation.encapsulate(v_object.rest()), v_object);
    }

    public static SubLObject encapsulate_cons_method(final SubLObject v_object) {
        return list_utilities.recons(encapsulate(v_object.first()), encapsulate(v_object.rest()), v_object);
    }

    public static final SubLObject encapsulate_constant_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.encapsulation.encapsulate_constant(v_object);
    }

    public static SubLObject encapsulate_constant_method(final SubLObject v_object) {
        return encapsulate_constant(v_object);
    }

    public static final SubLObject encapsulate_nart_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.encapsulation.encapsulate_nart(v_object);
    }

    public static SubLObject encapsulate_nart_method(final SubLObject v_object) {
        return encapsulate_nart(v_object);
    }

    public static final SubLObject encapsulate_constant_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == valid_constantP(constant, UNPROVIDED)) {
                    Errors.error($str_alt4$Attempt_to_encapsulate_invalid_co, constant);
                }
            }
            {
                SubLObject external_id = constants_high.constant_external_id(constant);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == constants_high.constant_external_id_p(external_id)) {
                        Errors.error($str_alt5$Attempt_to_encapsulate_a_constant, constant);
                    }
                }
            }
            {
                SubLObject name = constants_high.constant_name(constant);
                if ($UNNAMED != name) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!name.isString()) {
                            Errors.error($str_alt7$Attempt_to_encapsulate_a_constant, constant, name);
                        }
                    }
                }
            }
            return com.cyc.cycjava.cycl.encapsulation.encapsulate_constant_internal(constant);
        }
    }

    public static SubLObject encapsulate_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == valid_constantP(constant, UNPROVIDED))) {
            Errors.error($str4$Attempt_to_encapsulate_invalid_co, constant);
        }
        final SubLObject external_id = constants_high.constant_external_id(constant);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == constants_high.constant_external_id_p(external_id))) {
            Errors.error($str5$Attempt_to_encapsulate_a_constant, constant);
        }
        final SubLObject name = constants_high.constant_name(constant);
        if ((($UNNAMED != name) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (!name.isString())) {
            Errors.error($str7$Attempt_to_encapsulate_a_constant, constant, name);
        }
        return encapsulate_constant_internal(constant);
    }

    public static final SubLObject encapsulate_nart_alt(SubLObject nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nart_hl_formula = narts_high.nart_hl_formula(nart);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!nart_hl_formula.isCons()) {
                        Errors.error($str_alt8$Attempt_to_encapsulate_the_NART__, nart, nart_hl_formula);
                    }
                }
            }
            return com.cyc.cycjava.cycl.encapsulation.encapsulate_nart_internal(nart);
        }
    }

    public static SubLObject encapsulate_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nart_hl_formula = narts_high.nart_hl_formula(nart);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!nart_hl_formula.isCons())) {
            Errors.error($str8$Attempt_to_encapsulate_the_NART__, nart, nart_hl_formula);
        }
        return encapsulate_nart_internal(nart);
    }

    public static final SubLObject encapsulate_constant_internal_alt(SubLObject constant) {
        {
            SubLObject external_id = constants_high.constant_external_id(constant);
            SubLObject name = constants_high.constant_name(constant);
            SubLObject v_encapsulation = list($HP, name, external_id);
            return v_encapsulation;
        }
    }

    public static SubLObject encapsulate_constant_internal(final SubLObject constant) {
        final SubLObject external_id = constants_high.constant_external_id(constant);
        final SubLObject name = constants_high.constant_name(constant);
        final SubLObject v_encapsulation = list($HP, name, external_id);
        return v_encapsulation;
    }

    public static final SubLObject encapsulate_nart_internal_alt(SubLObject nart) {
        {
            SubLObject nart_hl_formula = narts_high.nart_hl_formula(nart);
            SubLObject v_encapsulation = list($NAT, com.cyc.cycjava.cycl.encapsulation.encapsulate(nart_hl_formula));
            return v_encapsulation;
        }
    }

    public static SubLObject encapsulate_nart_internal(final SubLObject nart) {
        final SubLObject nart_hl_formula = narts_high.nart_hl_formula(nart);
        final SubLObject v_encapsulation = list($NAT, encapsulate(nart_hl_formula));
        return v_encapsulation;
    }

    public static final SubLObject unencapsulate_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.encapsulation.unencapsulate_internal(v_object, NIL);
    }

    public static SubLObject unencapsulate(final SubLObject v_object) {
        return unencapsulate_internal(v_object, NIL);
    }

    public static final SubLObject unencapsulate_partial_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.encapsulation.unencapsulate_internal(v_object, T);
    }

    public static SubLObject unencapsulate_partial(final SubLObject v_object) {
        return unencapsulate_internal(v_object, T);
    }

    /**
     * Unencapsulate OBJECT.  If ALLOW-PARTIAL? is non-nil, then forms which
     * cannot be unencapsulated are merely returned.
     */
    @LispMethod(comment = "Unencapsulate OBJECT.  If ALLOW-PARTIAL? is non-nil, then forms which\r\ncannot be unencapsulated are merely returned.\nUnencapsulate OBJECT.  If ALLOW-PARTIAL? is non-nil, then forms which\ncannot be unencapsulated are merely returned.")
    public static final SubLObject unencapsulate_internal_alt(SubLObject v_object, SubLObject allow_partialP) {
        if (v_object.isAtom()) {
            if (v_object.isSymbol()) {
                return com.cyc.cycjava.cycl.encapsulation.unencapsulate_common_symbol(v_object);
            } else {
                return v_object;
            }
        } else {
            {
                SubLObject car = v_object.first();
                if (((NIL != com.cyc.cycjava.cycl.encapsulation.unencapsulate_token_equal_p(car, $HP)) && (NIL != list_utilities.proper_list_p(v_object))) && THREE_INTEGER.numE(length(v_object))) {
                    return com.cyc.cycjava.cycl.encapsulation.unencapsulate_constant_marker(v_object, allow_partialP);
                } else {
                    if (((NIL != com.cyc.cycjava.cycl.encapsulation.unencapsulate_token_equal_p(car, $NAT)) && (NIL != list_utilities.proper_list_p(v_object))) && (TWO_INTEGER.numE(length(v_object)) || THREE_INTEGER.numE(length(v_object)))) {
                        return com.cyc.cycjava.cycl.encapsulation.unencapsulate_nart_marker(v_object, allow_partialP);
                    } else {
                        return com.cyc.cycjava.cycl.encapsulation.unencapsulate_cons(v_object, allow_partialP);
                    }
                }
            }
        }
    }

    /**
     * Unencapsulate OBJECT.  If ALLOW-PARTIAL? is non-nil, then forms which
     * cannot be unencapsulated are merely returned.
     */
    @LispMethod(comment = "Unencapsulate OBJECT.  If ALLOW-PARTIAL? is non-nil, then forms which\r\ncannot be unencapsulated are merely returned.\nUnencapsulate OBJECT.  If ALLOW-PARTIAL? is non-nil, then forms which\ncannot be unencapsulated are merely returned.")
    public static SubLObject unencapsulate_internal(final SubLObject v_object, final SubLObject allow_partialP) {
        if (v_object.isAtom()) {
            return v_object;
        }
        final SubLObject car = v_object.first();
        if (((NIL != unencapsulate_token_equal_p(car, $HP)) && (NIL != list_utilities.proper_list_p(v_object))) && THREE_INTEGER.numE(length(v_object))) {
            return unencapsulate_constant_marker(v_object, allow_partialP);
        }
        if (((NIL != unencapsulate_token_equal_p(car, $NAT)) && (NIL != list_utilities.proper_list_p(v_object))) && (TWO_INTEGER.numE(length(v_object)) || THREE_INTEGER.numE(length(v_object)))) {
            return unencapsulate_nart_marker(v_object, allow_partialP);
        }
        return unencapsulate_cons(v_object, allow_partialP);
    }

    public static final SubLObject unencapsulate_token_equal_p_alt(SubLObject v_object, SubLObject token) {
        return makeBoolean((token == v_object) || (v_object.isSymbol() && (NIL != Strings.stringE(symbol_name(v_object), symbol_name(token), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject unencapsulate_token_equal_p(final SubLObject v_object, final SubLObject token) {
        return makeBoolean(token.eql(v_object) || (v_object.isSymbol() && (NIL != Strings.stringE(symbol_name(v_object), symbol_name(token), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject unencapsulate_cons_alt(SubLObject v_object, SubLObject allow_partialP) {
        return list_utilities.recons(com.cyc.cycjava.cycl.encapsulation.unencapsulate_internal(v_object.first(), allow_partialP), com.cyc.cycjava.cycl.encapsulation.unencapsulate_internal(v_object.rest(), allow_partialP), v_object);
    }

    public static SubLObject unencapsulate_cons(final SubLObject v_object, final SubLObject allow_partialP) {
        return list_utilities.recons(unencapsulate_internal(v_object.first(), allow_partialP), unencapsulate_internal(v_object.rest(), allow_partialP), v_object);
    }

    public static final SubLObject unencapsulate_constant_marker_alt(SubLObject v_object, SubLObject allow_partialP) {
        {
            SubLObject datum = v_object;
            SubLObject current = datum;
            SubLObject hp = NIL;
            SubLObject name_spec = NIL;
            SubLObject external_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            hp = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt12);
            name_spec = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt12);
            external_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject existing_constant = com.cyc.cycjava.cycl.encapsulation.unencapsulate_constant_marker_int(name_spec, external_id);
                    if (NIL != constant_p(existing_constant)) {
                        return existing_constant;
                    } else {
                        if (name_spec.isString()) {
                            return com.cyc.cycjava.cycl.encapsulation.handle_unencapsulate_constant_problem(v_object, allow_partialP);
                        } else {
                            if ($UNNAMED == name_spec) {
                                return com.cyc.cycjava.cycl.encapsulation.handle_unencapsulate_unnamed_constant_problem(v_object, allow_partialP);
                            } else {
                                return com.cyc.cycjava.cycl.encapsulation.handle_unencapsulation_error(v_object);
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt12);
            }
        }
        return NIL;
    }

    public static SubLObject unencapsulate_constant_marker(final SubLObject v_object, final SubLObject allow_partialP) {
        SubLObject hp = NIL;
        SubLObject name_spec = NIL;
        SubLObject external_id = NIL;
        destructuring_bind_must_consp(v_object, v_object, $list11);
        hp = v_object.first();
        SubLObject current = v_object.rest();
        destructuring_bind_must_consp(current, v_object, $list11);
        name_spec = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, v_object, $list11);
        external_id = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(v_object, $list11);
            return NIL;
        }
        final SubLObject existing_constant = unencapsulate_constant_marker_int(name_spec, external_id);
        if (NIL != constant_p(existing_constant)) {
            return existing_constant;
        }
        if (name_spec.isString()) {
            return handle_unencapsulate_constant_problem(v_object, allow_partialP);
        }
        if ($UNNAMED == name_spec) {
            return handle_unencapsulate_unnamed_constant_problem(v_object, allow_partialP);
        }
        return handle_unencapsulation_error(v_object);
    }

    public static final SubLObject unencapsulate_constant_marker_int_alt(SubLObject name_spec, SubLObject external_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing_constant = NIL;
                if (NIL != constants_high.constant_external_id_p(external_id)) {
                    if (NIL != $unencapsulate_constant_via_name_optimizationP$.getDynamicValue(thread)) {
                        if (name_spec.isString()) {
                            {
                                SubLObject constant = com.cyc.cycjava.cycl.encapsulation.unencapsulate_find_constant(name_spec);
                                if ((NIL != valid_constantP(constant, UNPROVIDED)) && (NIL != constants_high.constant_has_external_id(constant, external_id))) {
                                    existing_constant = constant;
                                }
                            }
                        }
                    }
                    if (NIL == existing_constant) {
                        existing_constant = constants_high.find_constant_by_external_id(external_id);
                    }
                }
                return existing_constant;
            }
        }
    }

    public static SubLObject unencapsulate_constant_marker_int(final SubLObject name_spec, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject existing_constant = NIL;
        if (NIL != constants_high.constant_external_id_p(external_id)) {
            if ((NIL != $unencapsulate_constant_via_name_optimizationP$.getDynamicValue(thread)) && name_spec.isString()) {
                final SubLObject constant = unencapsulate_find_constant(name_spec);
                if ((NIL != valid_constantP(constant, UNPROVIDED)) && (NIL != constants_high.constant_has_external_id(constant, external_id))) {
                    existing_constant = constant;
                }
            }
            if (NIL == existing_constant) {
                existing_constant = constants_high.find_constant_by_external_id(external_id);
            }
        }
        return existing_constant;
    }

    public static final SubLObject unencapsulate_find_constant_alt(SubLObject string) {
        {
            SubLObject constant = list_utilities.alist_lookup_without_values($unencapsulate_find_constant_lookaside_table$.getGlobalValue(), string, symbol_function(EQUAL), UNPROVIDED);
            if (NIL != constant) {
                $unencapsulate_find_constant_lookaside_table$.setGlobalValue(list_utilities.alist_promote($unencapsulate_find_constant_lookaside_table$.getGlobalValue(), string, symbol_function(EQUAL)));
            } else {
                constant = constants_high.find_constant(string);
                $unencapsulate_find_constant_lookaside_table$.setGlobalValue(list_utilities.alist_capacity_enter_without_values($unencapsulate_find_constant_lookaside_table$.getGlobalValue(), string, constant, $unencapsulate_find_constant_capacity$.getGlobalValue(), symbol_function(EQUAL)));
            }
            return constant;
        }
    }

    public static SubLObject unencapsulate_find_constant(final SubLObject string) {
        SubLObject constant = list_utilities.alist_lookup_without_values($unencapsulate_find_constant_lookaside_table$.getGlobalValue(), string, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != constant) {
            $unencapsulate_find_constant_lookaside_table$.setGlobalValue(list_utilities.alist_promote($unencapsulate_find_constant_lookaside_table$.getGlobalValue(), string, symbol_function(EQUAL)));
        } else {
            constant = constants_high.find_constant(string);
            $unencapsulate_find_constant_lookaside_table$.setGlobalValue(list_utilities.alist_capacity_enter_without_values($unencapsulate_find_constant_lookaside_table$.getGlobalValue(), string, constant, $unencapsulate_find_constant_capacity$.getGlobalValue(), symbol_function(EQUAL)));
        }
        return constant;
    }

    public static final SubLObject unencapsulate_nart_marker_alt(SubLObject v_object, SubLObject allow_partialP) {
        {
            SubLObject datum = v_object;
            SubLObject current = datum;
            SubLObject nat = NIL;
            SubLObject nart_hl_formula_spec = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            nat = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            nart_hl_formula_spec = current.first();
            current = current.rest();
            {
                SubLObject id = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt14);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject nart_hl_formula = com.cyc.cycjava.cycl.encapsulation.unencapsulate_internal(nart_hl_formula_spec, allow_partialP);
                        SubLObject existing_nart = narts_high.find_nart(nart_hl_formula);
                        if (NIL != nart_handles.nart_p(existing_nart)) {
                            return existing_nart;
                        } else {
                            return com.cyc.cycjava.cycl.encapsulation.handle_unencapsulate_nart_problem(v_object, allow_partialP);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt14);
                }
            }
        }
        return NIL;
    }

    public static SubLObject unencapsulate_nart_marker(final SubLObject v_object, final SubLObject allow_partialP) {
        SubLObject nat = NIL;
        SubLObject nart_hl_formula_spec = NIL;
        destructuring_bind_must_consp(v_object, v_object, $list13);
        nat = v_object.first();
        SubLObject current = v_object.rest();
        destructuring_bind_must_consp(current, v_object, $list13);
        nart_hl_formula_spec = current.first();
        current = current.rest();
        final SubLObject id = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, v_object, $list13);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(v_object, $list13);
            return NIL;
        }
        final SubLObject nart_hl_formula = unencapsulate_internal(nart_hl_formula_spec, allow_partialP);
        final SubLObject existing_nart = narts_high.find_nart(nart_hl_formula);
        if (NIL != nart_handles.nart_p(existing_nart)) {
            return existing_nart;
        }
        return handle_unencapsulate_nart_problem(v_object, allow_partialP);
    }

    public static final SubLObject handle_unencapsulate_constant_problem_alt(SubLObject v_object, SubLObject allow_partialP) {
        if (NIL != allow_partialP) {
            return v_object;
        }
        return com.cyc.cycjava.cycl.encapsulation.handle_unencapsulation_error(v_object);
    }

    public static SubLObject handle_unencapsulate_constant_problem(final SubLObject v_object, final SubLObject allow_partialP) {
        if (NIL != allow_partialP) {
            return v_object;
        }
        return handle_unencapsulation_error(v_object);
    }

    public static final SubLObject handle_unencapsulate_unnamed_constant_problem_alt(SubLObject v_object, SubLObject allow_partialP) {
        return com.cyc.cycjava.cycl.encapsulation.handle_unencapsulate_constant_problem(v_object, allow_partialP);
    }

    public static SubLObject handle_unencapsulate_unnamed_constant_problem(final SubLObject v_object, final SubLObject allow_partialP) {
        return handle_unencapsulate_constant_problem(v_object, allow_partialP);
    }

    public static final SubLObject handle_unencapsulate_nart_problem_alt(SubLObject v_object, SubLObject allow_partialP) {
        if (NIL != allow_partialP) {
            return v_object;
        }
        return com.cyc.cycjava.cycl.encapsulation.handle_unencapsulation_error(v_object);
    }

    public static SubLObject handle_unencapsulate_nart_problem(final SubLObject v_object, final SubLObject allow_partialP) {
        if (NIL != allow_partialP) {
            return v_object;
        }
        return handle_unencapsulation_error(v_object);
    }

    public static final SubLObject handle_unencapsulation_error_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $unencapsulating_within_agenda$.getDynamicValue(thread)) {
                if ($IGNORE != agenda.agenda_error_mode()) {
                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt16$__Last_operation___S___This_objec, com.cyc.cycjava.cycl.encapsulation.unencapsulate_partial($last_agenda_op$.getGlobalValue()), v_object);
                    force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                    Errors.cerror($$$Skip_this_operation, $str_alt18$_S_did_not_yield_a_term, v_object);
                }
                sublisp_throw($UNENCAPSULATION_ERROR, NIL);
            } else {
                Errors.error($str_alt18$_S_did_not_yield_a_term, v_object);
            }
            return NIL;
        }
    }

    public static SubLObject handle_unencapsulation_error(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $unencapsulating_within_agenda$.getDynamicValue(thread)) {
            if ($IGNORE != agenda.agenda_error_mode()) {
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str15$__Last_operation___S___This_objec, unencapsulate_partial($last_agenda_op$.getGlobalValue()), v_object);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                Errors.cerror($$$Skip_this_operation, $str17$_S_did_not_yield_a_term, v_object);
            }
            sublisp_throw($UNENCAPSULATION_ERROR, NIL);
        } else {
            Errors.error($str17$_S_did_not_yield_a_term, v_object);
        }
        return NIL;
    }

    public static final SubLObject declare_encapsulation_file_alt() {
        declareFunction("encapsulate", "ENCAPSULATE", 1, 0, false);
        declareFunction("encapsulate_cons_method", "ENCAPSULATE-CONS-METHOD", 1, 0, false);
        declareFunction("encapsulate_constant_method", "ENCAPSULATE-CONSTANT-METHOD", 1, 0, false);
        declareFunction("encapsulate_nart_method", "ENCAPSULATE-NART-METHOD", 1, 0, false);
        declareFunction("encapsulate_constant", "ENCAPSULATE-CONSTANT", 1, 0, false);
        declareFunction("encapsulate_nart", "ENCAPSULATE-NART", 1, 0, false);
        declareFunction("encapsulate_constant_internal", "ENCAPSULATE-CONSTANT-INTERNAL", 1, 0, false);
        declareFunction("encapsulate_nart_internal", "ENCAPSULATE-NART-INTERNAL", 1, 0, false);
        declareFunction("unencapsulate", "UNENCAPSULATE", 1, 0, false);
        declareFunction("unencapsulate_partial", "UNENCAPSULATE-PARTIAL", 1, 0, false);
        declareFunction("unencapsulate_internal", "UNENCAPSULATE-INTERNAL", 2, 0, false);
        declareFunction("unencapsulate_token_equal_p", "UNENCAPSULATE-TOKEN-EQUAL-P", 2, 0, false);
        declareFunction("unencapsulate_common_symbol", "UNENCAPSULATE-COMMON-SYMBOL", 1, 0, false);
        declareFunction("unencapsulate_cons", "UNENCAPSULATE-CONS", 2, 0, false);
        declareFunction("unencapsulate_constant_marker", "UNENCAPSULATE-CONSTANT-MARKER", 2, 0, false);
        declareFunction("unencapsulate_constant_marker_int", "UNENCAPSULATE-CONSTANT-MARKER-INT", 2, 0, false);
        declareFunction("unencapsulate_find_constant", "UNENCAPSULATE-FIND-CONSTANT", 1, 0, false);
        declareFunction("unencapsulate_nart_marker", "UNENCAPSULATE-NART-MARKER", 2, 0, false);
        declareFunction("handle_unencapsulate_constant_problem", "HANDLE-UNENCAPSULATE-CONSTANT-PROBLEM", 2, 0, false);
        declareFunction("handle_unencapsulate_unnamed_constant_problem", "HANDLE-UNENCAPSULATE-UNNAMED-CONSTANT-PROBLEM", 2, 0, false);
        declareFunction("handle_unencapsulate_nart_problem", "HANDLE-UNENCAPSULATE-NART-PROBLEM", 2, 0, false);
        declareFunction("handle_unencapsulation_error", "HANDLE-UNENCAPSULATION-ERROR", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_encapsulation_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("encapsulate", "ENCAPSULATE", 1, 0, false);
            declareFunction("encapsulate_cons_method", "ENCAPSULATE-CONS-METHOD", 1, 0, false);
            declareFunction("encapsulate_constant_method", "ENCAPSULATE-CONSTANT-METHOD", 1, 0, false);
            declareFunction("encapsulate_nart_method", "ENCAPSULATE-NART-METHOD", 1, 0, false);
            declareFunction("encapsulate_constant", "ENCAPSULATE-CONSTANT", 1, 0, false);
            declareFunction("encapsulate_nart", "ENCAPSULATE-NART", 1, 0, false);
            declareFunction("encapsulate_constant_internal", "ENCAPSULATE-CONSTANT-INTERNAL", 1, 0, false);
            declareFunction("encapsulate_nart_internal", "ENCAPSULATE-NART-INTERNAL", 1, 0, false);
            declareFunction("unencapsulate", "UNENCAPSULATE", 1, 0, false);
            declareFunction("unencapsulate_partial", "UNENCAPSULATE-PARTIAL", 1, 0, false);
            declareFunction("unencapsulate_internal", "UNENCAPSULATE-INTERNAL", 2, 0, false);
            declareFunction("unencapsulate_token_equal_p", "UNENCAPSULATE-TOKEN-EQUAL-P", 2, 0, false);
            declareFunction("unencapsulate_cons", "UNENCAPSULATE-CONS", 2, 0, false);
            declareFunction("unencapsulate_constant_marker", "UNENCAPSULATE-CONSTANT-MARKER", 2, 0, false);
            declareFunction("unencapsulate_constant_marker_int", "UNENCAPSULATE-CONSTANT-MARKER-INT", 2, 0, false);
            declareFunction("unencapsulate_find_constant", "UNENCAPSULATE-FIND-CONSTANT", 1, 0, false);
            declareFunction("unencapsulate_nart_marker", "UNENCAPSULATE-NART-MARKER", 2, 0, false);
            declareFunction("handle_unencapsulate_constant_problem", "HANDLE-UNENCAPSULATE-CONSTANT-PROBLEM", 2, 0, false);
            declareFunction("handle_unencapsulate_unnamed_constant_problem", "HANDLE-UNENCAPSULATE-UNNAMED-CONSTANT-PROBLEM", 2, 0, false);
            declareFunction("handle_unencapsulate_nart_problem", "HANDLE-UNENCAPSULATE-NART-PROBLEM", 2, 0, false);
            declareFunction("handle_unencapsulation_error", "HANDLE-UNENCAPSULATION-ERROR", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("unencapsulate_common_symbol", "UNENCAPSULATE-COMMON-SYMBOL", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_encapsulation_file_Previous() {
        declareFunction("encapsulate", "ENCAPSULATE", 1, 0, false);
        declareFunction("encapsulate_cons_method", "ENCAPSULATE-CONS-METHOD", 1, 0, false);
        declareFunction("encapsulate_constant_method", "ENCAPSULATE-CONSTANT-METHOD", 1, 0, false);
        declareFunction("encapsulate_nart_method", "ENCAPSULATE-NART-METHOD", 1, 0, false);
        declareFunction("encapsulate_constant", "ENCAPSULATE-CONSTANT", 1, 0, false);
        declareFunction("encapsulate_nart", "ENCAPSULATE-NART", 1, 0, false);
        declareFunction("encapsulate_constant_internal", "ENCAPSULATE-CONSTANT-INTERNAL", 1, 0, false);
        declareFunction("encapsulate_nart_internal", "ENCAPSULATE-NART-INTERNAL", 1, 0, false);
        declareFunction("unencapsulate", "UNENCAPSULATE", 1, 0, false);
        declareFunction("unencapsulate_partial", "UNENCAPSULATE-PARTIAL", 1, 0, false);
        declareFunction("unencapsulate_internal", "UNENCAPSULATE-INTERNAL", 2, 0, false);
        declareFunction("unencapsulate_token_equal_p", "UNENCAPSULATE-TOKEN-EQUAL-P", 2, 0, false);
        declareFunction("unencapsulate_cons", "UNENCAPSULATE-CONS", 2, 0, false);
        declareFunction("unencapsulate_constant_marker", "UNENCAPSULATE-CONSTANT-MARKER", 2, 0, false);
        declareFunction("unencapsulate_constant_marker_int", "UNENCAPSULATE-CONSTANT-MARKER-INT", 2, 0, false);
        declareFunction("unencapsulate_find_constant", "UNENCAPSULATE-FIND-CONSTANT", 1, 0, false);
        declareFunction("unencapsulate_nart_marker", "UNENCAPSULATE-NART-MARKER", 2, 0, false);
        declareFunction("handle_unencapsulate_constant_problem", "HANDLE-UNENCAPSULATE-CONSTANT-PROBLEM", 2, 0, false);
        declareFunction("handle_unencapsulate_unnamed_constant_problem", "HANDLE-UNENCAPSULATE-UNNAMED-CONSTANT-PROBLEM", 2, 0, false);
        declareFunction("handle_unencapsulate_nart_problem", "HANDLE-UNENCAPSULATE-NART-PROBLEM", 2, 0, false);
        declareFunction("handle_unencapsulation_error", "HANDLE-UNENCAPSULATION-ERROR", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_encapsulation_file_alt() {
        deflexical("*ENCAPSULATE-METHOD-TABLE*", make_vector($int$256, NIL));
        defparameter("*UNENCAPSULATE-BELIEVE-NAMES*", NIL);
        deflexical("*UNENCAPSULATED-COMMON-SYMBOLS*", $list_alt11);
        defparameter("*UNENCAPSULATE-CONSTANT-VIA-NAME-OPTIMIZATION?*", NIL);
        deflexical("*UNENCAPSULATE-FIND-CONSTANT-LOOKASIDE-TABLE*", NIL != boundp($unencapsulate_find_constant_lookaside_table$) ? ((SubLObject) ($unencapsulate_find_constant_lookaside_table$.getGlobalValue())) : NIL);
        deflexical("*UNENCAPSULATE-FIND-CONSTANT-CAPACITY*", TWENTY_INTEGER);
        return NIL;
    }

    public static SubLObject init_encapsulation_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*ENCAPSULATE-METHOD-TABLE*", make_vector($int$256, NIL));
            defparameter("*UNENCAPSULATE-BELIEVE-NAMES*", NIL);
            defparameter("*UNENCAPSULATE-CONSTANT-VIA-NAME-OPTIMIZATION?*", NIL);
            deflexical("*UNENCAPSULATE-FIND-CONSTANT-LOOKASIDE-TABLE*", SubLTrampolineFile.maybeDefault($unencapsulate_find_constant_lookaside_table$, $unencapsulate_find_constant_lookaside_table$, NIL));
            deflexical("*UNENCAPSULATE-FIND-CONSTANT-CAPACITY*", TWENTY_INTEGER);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*UNENCAPSULATED-COMMON-SYMBOLS*", $list_alt11);
            deflexical("*UNENCAPSULATE-FIND-CONSTANT-LOOKASIDE-TABLE*", NIL != boundp($unencapsulate_find_constant_lookaside_table$) ? ((SubLObject) ($unencapsulate_find_constant_lookaside_table$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_encapsulation_file_Previous() {
        deflexical("*ENCAPSULATE-METHOD-TABLE*", make_vector($int$256, NIL));
        defparameter("*UNENCAPSULATE-BELIEVE-NAMES*", NIL);
        defparameter("*UNENCAPSULATE-CONSTANT-VIA-NAME-OPTIMIZATION?*", NIL);
        deflexical("*UNENCAPSULATE-FIND-CONSTANT-LOOKASIDE-TABLE*", SubLTrampolineFile.maybeDefault($unencapsulate_find_constant_lookaside_table$, $unencapsulate_find_constant_lookaside_table$, NIL));
        deflexical("*UNENCAPSULATE-FIND-CONSTANT-CAPACITY*", TWENTY_INTEGER);
        return NIL;
    }

    public static SubLObject setup_encapsulation_file() {
        register_method($encapsulate_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(ENCAPSULATE_CONS_METHOD));
        register_method($encapsulate_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(ENCAPSULATE_CONSTANT_METHOD));
        register_method($encapsulate_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(ENCAPSULATE_NART_METHOD));
        declare_defglobal($unencapsulate_find_constant_lookaside_table$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_encapsulation_file();
    }

    @Override
    public void initializeVariables() {
        init_encapsulation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_encapsulation_file();
    }

    static {
    }

    static private final SubLString $str_alt4$Attempt_to_encapsulate_invalid_co = makeString("Attempt to encapsulate invalid constant ~S.");

    static private final SubLString $str_alt5$Attempt_to_encapsulate_a_constant = makeString("Attempt to encapsulate a constant ~S with an invalid external ID.");

    static private final SubLString $str_alt7$Attempt_to_encapsulate_a_constant = makeString("Attempt to encapsulate a constant ~S with a non-string name ~S.");

    static private final SubLString $str_alt8$Attempt_to_encapsulate_the_NART__ = makeString("Attempt to encapsulate the NART ~S with an invalid HL formula ~S.");

    static private final SubLList $list_alt11 = list(list(makeSymbol("MONOTONIC"), makeKeyword("MONOTONIC")), list(makeSymbol("DEFAULT"), makeKeyword("DEFAULT")), list(makeSymbol("FORWARD"), makeKeyword("FORWARD")), list(makeSymbol("BACKWARD"), makeKeyword("BACKWARD")), list(makeSymbol("CODE"), $CODE));

    static private final SubLList $list_alt12 = list(makeSymbol("HP"), makeSymbol("NAME-SPEC"), makeSymbol("EXTERNAL-ID"));

    static private final SubLList $list_alt14 = list(makeSymbol("NAT"), makeSymbol("NART-HL-FORMULA-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("ID"));

    static private final SubLString $str_alt16$__Last_operation___S___This_objec = makeString("~%Last operation: ~S ~%This object did not yield a term: ~S");

    static private final SubLString $str_alt18$_S_did_not_yield_a_term = makeString("~S did not yield a term");
}

/**
 * Total time: 118 ms
 */
