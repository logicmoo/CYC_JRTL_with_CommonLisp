/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      USER-ACTIONS
 * source file: /cyc/top/cycl/user-actions.lisp
 * created:     2019/07/03 17:37:50
 */
public final class user_actions extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new user_actions();

 public static final String myName = "com.cyc.cycjava.cycl.user_actions";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_action_type$ = makeSymbol("*DTP-ACTION-TYPE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_user_action$ = makeSymbol("*DTP-USER-ACTION*");

    // deflexical
    // A lock of the user-action structures to prevent clobbering.
    /**
     * A lock of the user-action structures to prevent clobbering.
     */
    @LispMethod(comment = "A lock of the user-action structures to prevent clobbering.\ndeflexical")
    public static final SubLSymbol $user_actions_lock$ = makeSymbol("*USER-ACTIONS-LOCK*");

    // defparameter
    // All the user actions that have been defined.
    /**
     * All the user actions that have been defined.
     */
    @LispMethod(comment = "All the user actions that have been defined.\ndefparameter")
    public static final SubLSymbol $user_actions$ = makeSymbol("*USER-ACTIONS*");

    // defparameter
    // A hash to find a user action from its id-string.
    /**
     * A hash to find a user action from its id-string.
     */
    @LispMethod(comment = "A hash to find a user action from its id-string.\ndefparameter")
    public static final SubLSymbol $user_actions_by_id_string$ = makeSymbol("*USER-ACTIONS-BY-ID-STRING*");

    private static final SubLSymbol ACTION_TYPE_P = makeSymbol("ACTION-TYPE-P");

    static private final SubLList $list2 = list(makeSymbol("KEY"), makeSymbol("SUMMARY-FN"), makeSymbol("DISPLAY-FN"), makeSymbol("HANDLER-FN"));

    static private final SubLList $list3 = list(makeKeyword("KEY"), makeKeyword("SUMMARY-FN"), makeKeyword("DISPLAY-FN"), makeKeyword("HANDLER-FN"));

    static private final SubLList $list4 = list(makeSymbol("ACTION-TYPE-KEY"), makeSymbol("ACTION-TYPE-SUMMARY-FN"), makeSymbol("ACTION-TYPE-DISPLAY-FN"), makeSymbol("ACTION-TYPE-HANDLER-FN"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-ACTION-TYPE-KEY"), makeSymbol("_CSETF-ACTION-TYPE-SUMMARY-FN"), makeSymbol("_CSETF-ACTION-TYPE-DISPLAY-FN"), makeSymbol("_CSETF-ACTION-TYPE-HANDLER-FN"));

    private static final SubLSymbol PRINT_ACTION_TYPE = makeSymbol("PRINT-ACTION-TYPE");

    private static final SubLSymbol ACTION_TYPE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ACTION-TYPE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ACTION-TYPE-P"));

    private static final SubLSymbol ACTION_TYPE_KEY = makeSymbol("ACTION-TYPE-KEY");

    private static final SubLSymbol _CSETF_ACTION_TYPE_KEY = makeSymbol("_CSETF-ACTION-TYPE-KEY");

    private static final SubLSymbol ACTION_TYPE_SUMMARY_FN = makeSymbol("ACTION-TYPE-SUMMARY-FN");

    private static final SubLSymbol _CSETF_ACTION_TYPE_SUMMARY_FN = makeSymbol("_CSETF-ACTION-TYPE-SUMMARY-FN");

    private static final SubLSymbol ACTION_TYPE_DISPLAY_FN = makeSymbol("ACTION-TYPE-DISPLAY-FN");

    private static final SubLSymbol _CSETF_ACTION_TYPE_DISPLAY_FN = makeSymbol("_CSETF-ACTION-TYPE-DISPLAY-FN");

    private static final SubLSymbol ACTION_TYPE_HANDLER_FN = makeSymbol("ACTION-TYPE-HANDLER-FN");

    private static final SubLSymbol _CSETF_ACTION_TYPE_HANDLER_FN = makeSymbol("_CSETF-ACTION-TYPE-HANDLER-FN");

    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_ACTION_TYPE = makeSymbol("MAKE-ACTION-TYPE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ACTION_TYPE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ACTION-TYPE-METHOD");

    private static final SubLString $str27$_ = makeString("#");

    private static final SubLList $list29 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    private static final SubLSymbol $sym30$NEW_ACTION_TYPE = makeUninternedSymbol("NEW-ACTION-TYPE");

    public static final SubLSymbol $action_types_by_key$ = makeSymbol("*ACTION-TYPES-BY-KEY*");

    private static final SubLSymbol USER_ACTION = makeSymbol("USER-ACTION");

    private static final SubLSymbol USER_ACTION_P = makeSymbol("USER-ACTION-P");

    static private final SubLList $list38 = list(makeSymbol("ID-STRING"), makeSymbol("TYPE-KEY"), makeSymbol("CYCLIST"), makeSymbol("CREATION-TIME"), makeSymbol("DATA"));

    static private final SubLList $list39 = list(makeKeyword("ID-STRING"), makeKeyword("TYPE-KEY"), makeKeyword("CYCLIST"), makeKeyword("CREATION-TIME"), $DATA);

    private static final SubLList $list40 = list(makeSymbol("USER-ACTION-ID-STRING"), makeSymbol("USER-ACTION-TYPE-KEY"), makeSymbol("USER-ACTION-CYCLIST"), makeSymbol("USER-ACTION-CREATION-TIME"), makeSymbol("USER-ACTION-DATA"));

    private static final SubLList $list41 = list(makeSymbol("_CSETF-USER-ACTION-ID-STRING"), makeSymbol("_CSETF-USER-ACTION-TYPE-KEY"), makeSymbol("_CSETF-USER-ACTION-CYCLIST"), makeSymbol("_CSETF-USER-ACTION-CREATION-TIME"), makeSymbol("_CSETF-USER-ACTION-DATA"));

    private static final SubLSymbol PRINT_USER_ACTION = makeSymbol("PRINT-USER-ACTION");

    private static final SubLSymbol USER_ACTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("USER-ACTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list44 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("USER-ACTION-P"));

    private static final SubLSymbol USER_ACTION_ID_STRING = makeSymbol("USER-ACTION-ID-STRING");

    private static final SubLSymbol _CSETF_USER_ACTION_ID_STRING = makeSymbol("_CSETF-USER-ACTION-ID-STRING");

    private static final SubLSymbol USER_ACTION_TYPE_KEY = makeSymbol("USER-ACTION-TYPE-KEY");

    private static final SubLSymbol _CSETF_USER_ACTION_TYPE_KEY = makeSymbol("_CSETF-USER-ACTION-TYPE-KEY");

    private static final SubLSymbol USER_ACTION_CYCLIST = makeSymbol("USER-ACTION-CYCLIST");

    private static final SubLSymbol _CSETF_USER_ACTION_CYCLIST = makeSymbol("_CSETF-USER-ACTION-CYCLIST");

    private static final SubLSymbol USER_ACTION_CREATION_TIME = makeSymbol("USER-ACTION-CREATION-TIME");

    private static final SubLSymbol _CSETF_USER_ACTION_CREATION_TIME = makeSymbol("_CSETF-USER-ACTION-CREATION-TIME");

    private static final SubLSymbol USER_ACTION_DATA = makeSymbol("USER-ACTION-DATA");

    private static final SubLSymbol _CSETF_USER_ACTION_DATA = makeSymbol("_CSETF-USER-ACTION-DATA");

    private static final SubLSymbol MAKE_USER_ACTION = makeSymbol("MAKE-USER-ACTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_USER_ACTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-USER-ACTION-METHOD");

    private static final SubLString $$$User_Actions_Lock = makeString("User Actions Lock");

    public static final SubLObject action_type_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_action_type(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject action_type_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_action_type(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject action_type_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.user_actions.$action_type_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject action_type_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.user_actions.$action_type_native.class ? T : NIL;
    }

    public static final SubLObject action_type_key_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ACTION_TYPE_P);
        return v_object.getField2();
    }

    public static SubLObject action_type_key(final SubLObject v_object) {
        assert NIL != action_type_p(v_object) : "! user_actions.action_type_p(v_object) " + "user_actions.action_type_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject action_type_summary_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ACTION_TYPE_P);
        return v_object.getField3();
    }

    public static SubLObject action_type_summary_fn(final SubLObject v_object) {
        assert NIL != action_type_p(v_object) : "! user_actions.action_type_p(v_object) " + "user_actions.action_type_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject action_type_display_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ACTION_TYPE_P);
        return v_object.getField4();
    }

    public static SubLObject action_type_display_fn(final SubLObject v_object) {
        assert NIL != action_type_p(v_object) : "! user_actions.action_type_p(v_object) " + "user_actions.action_type_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject action_type_handler_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ACTION_TYPE_P);
        return v_object.getField5();
    }

    public static SubLObject action_type_handler_fn(final SubLObject v_object) {
        assert NIL != action_type_p(v_object) : "! user_actions.action_type_p(v_object) " + "user_actions.action_type_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_action_type_key_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ACTION_TYPE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_action_type_key(final SubLObject v_object, final SubLObject value) {
        assert NIL != action_type_p(v_object) : "! user_actions.action_type_p(v_object) " + "user_actions.action_type_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_action_type_summary_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ACTION_TYPE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_action_type_summary_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != action_type_p(v_object) : "! user_actions.action_type_p(v_object) " + "user_actions.action_type_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_action_type_display_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ACTION_TYPE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_action_type_display_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != action_type_p(v_object) : "! user_actions.action_type_p(v_object) " + "user_actions.action_type_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_action_type_handler_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ACTION_TYPE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_action_type_handler_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != action_type_p(v_object) : "! user_actions.action_type_p(v_object) " + "user_actions.action_type_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_action_type_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.user_actions.$action_type_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($KEY)) {
                        _csetf_action_type_key(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SUMMARY_FN)) {
                            _csetf_action_type_summary_fn(v_new, current_value);
                        } else {
                            if (pcase_var.eql($DISPLAY_FN)) {
                                _csetf_action_type_display_fn(v_new, current_value);
                            } else {
                                if (pcase_var.eql($HANDLER_FN)) {
                                    _csetf_action_type_handler_fn(v_new, current_value);
                                } else {
                                    Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_action_type(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.user_actions.$action_type_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($KEY)) {
                _csetf_action_type_key(v_new, current_value);
            } else
                if (pcase_var.eql($SUMMARY_FN)) {
                    _csetf_action_type_summary_fn(v_new, current_value);
                } else
                    if (pcase_var.eql($DISPLAY_FN)) {
                        _csetf_action_type_display_fn(v_new, current_value);
                    } else
                        if (pcase_var.eql($HANDLER_FN)) {
                            _csetf_action_type_handler_fn(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_action_type(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ACTION_TYPE, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $KEY, action_type_key(obj));
        funcall(visitor_fn, obj, $SLOT, $SUMMARY_FN, action_type_summary_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $DISPLAY_FN, action_type_display_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $HANDLER_FN, action_type_handler_fn(obj));
        funcall(visitor_fn, obj, $END, MAKE_ACTION_TYPE, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_action_type_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_action_type(obj, visitor_fn);
    }

    /**
     * Used internally.
     */
    @LispMethod(comment = "Used internally.")
    public static final SubLObject print_action_type_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
                princ($str_alt21$_, stream);
            } else {
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(v_object, stream);
                } else {
                    {
                        SubLObject v_object_1 = v_object;
                        SubLObject stream_2 = stream;
                        write_string($str_alt22$__, stream_2, UNPROVIDED, UNPROVIDED);
                        write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                        write_char(CHAR_space, stream_2);
                        princ(action_type_key(v_object), stream);
                        write_char(CHAR_greater, stream_2);
                    }
                }
            }
            return v_object;
        }
    }

    /**
     * Used internally.
     */
    @LispMethod(comment = "Used internally.")
    public static SubLObject print_action_type(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
            princ($str27$_, stream);
        } else
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
                princ(action_type_key(v_object), stream);
                print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
            }

        return v_object;
    }

    /**
     * Define a new action-type.
     */
    @LispMethod(comment = "Define a new action-type.")
    public static final SubLObject defaction_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            name = current.first();
            current = current.rest();
            {
                SubLObject arglist = current;
                SubLObject new_action_type = $sym27$NEW_ACTION_TYPE;
                return list(CLET, list(list(new_action_type, list(MAKE_ACTION_TYPE, list(QUOTE, arglist)))), list(CSETF, list(ACTION_TYPE_KEY, new_action_type), list(QUOTE, name)), list(SETHASH, list(ACTION_TYPE_KEY, new_action_type), $action_types_by_key$, new_action_type));
            }
        }
    }

    /**
     * Define a new action-type.
     */
    @LispMethod(comment = "Define a new action-type.")
    public static SubLObject defaction_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        name = current.first();
        final SubLObject arglist;
        current = arglist = current.rest();
        final SubLObject new_action_type = $sym30$NEW_ACTION_TYPE;
        return list(CLET, list(list(new_action_type, list(MAKE_ACTION_TYPE, list(QUOTE, arglist)))), list(CSETF, list(ACTION_TYPE_KEY, new_action_type), list(QUOTE, name)), list(SETHASH, list(ACTION_TYPE_KEY, new_action_type), $action_types_by_key$, new_action_type));
    }

    public static final SubLObject action_type_by_key_alt(SubLObject action_type_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(action_type_key, $action_types_by_key$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject action_type_by_key(final SubLObject action_type_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(action_type_key, $action_types_by_key$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject user_action_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_user_action(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject user_action_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_user_action(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject user_action_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.user_actions.$user_action_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject user_action_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.user_actions.$user_action_native.class ? T : NIL;
    }

    public static final SubLObject user_action_id_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_ACTION_P);
        return v_object.getField2();
    }

    public static SubLObject user_action_id_string(final SubLObject v_object) {
        assert NIL != user_action_p(v_object) : "! user_actions.user_action_p(v_object) " + "user_actions.user_action_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject user_action_type_key_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_ACTION_P);
        return v_object.getField3();
    }

    public static SubLObject user_action_type_key(final SubLObject v_object) {
        assert NIL != user_action_p(v_object) : "! user_actions.user_action_p(v_object) " + "user_actions.user_action_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject user_action_cyclist_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_ACTION_P);
        return v_object.getField4();
    }

    public static SubLObject user_action_cyclist(final SubLObject v_object) {
        assert NIL != user_action_p(v_object) : "! user_actions.user_action_p(v_object) " + "user_actions.user_action_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject user_action_creation_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_ACTION_P);
        return v_object.getField5();
    }

    public static SubLObject user_action_creation_time(final SubLObject v_object) {
        assert NIL != user_action_p(v_object) : "! user_actions.user_action_p(v_object) " + "user_actions.user_action_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject user_action_data_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, USER_ACTION_P);
        return v_object.getField6();
    }

    public static SubLObject user_action_data(final SubLObject v_object) {
        assert NIL != user_action_p(v_object) : "! user_actions.user_action_p(v_object) " + "user_actions.user_action_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_user_action_id_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_ACTION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_user_action_id_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_action_p(v_object) : "! user_actions.user_action_p(v_object) " + "user_actions.user_action_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_user_action_type_key_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_ACTION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_user_action_type_key(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_action_p(v_object) : "! user_actions.user_action_p(v_object) " + "user_actions.user_action_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_user_action_cyclist_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_ACTION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_user_action_cyclist(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_action_p(v_object) : "! user_actions.user_action_p(v_object) " + "user_actions.user_action_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_user_action_creation_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_ACTION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_user_action_creation_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_action_p(v_object) : "! user_actions.user_action_p(v_object) " + "user_actions.user_action_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_user_action_data_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, USER_ACTION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_user_action_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != user_action_p(v_object) : "! user_actions.user_action_p(v_object) " + "user_actions.user_action_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_user_action_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.user_actions.$user_action_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID_STRING)) {
                        _csetf_user_action_id_string(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TYPE_KEY)) {
                            _csetf_user_action_type_key(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CYCLIST)) {
                                _csetf_user_action_cyclist(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CREATION_TIME)) {
                                    _csetf_user_action_creation_time(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($DATA)) {
                                        _csetf_user_action_data(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_user_action(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.user_actions.$user_action_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID_STRING)) {
                _csetf_user_action_id_string(v_new, current_value);
            } else
                if (pcase_var.eql($TYPE_KEY)) {
                    _csetf_user_action_type_key(v_new, current_value);
                } else
                    if (pcase_var.eql($CYCLIST)) {
                        _csetf_user_action_cyclist(v_new, current_value);
                    } else
                        if (pcase_var.eql($CREATION_TIME)) {
                            _csetf_user_action_creation_time(v_new, current_value);
                        } else
                            if (pcase_var.eql($DATA)) {
                                _csetf_user_action_data(v_new, current_value);
                            } else {
                                Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_user_action(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_USER_ACTION, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID_STRING, user_action_id_string(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE_KEY, user_action_type_key(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCLIST, user_action_cyclist(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATION_TIME, user_action_creation_time(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA, user_action_data(obj));
        funcall(visitor_fn, obj, $END, MAKE_USER_ACTION, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_user_action_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_user_action(obj, visitor_fn);
    }

    /**
     * Used internally.
     */
    @LispMethod(comment = "Used internally.")
    public static final SubLObject print_user_action_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
                princ($str_alt21$_, stream);
            } else {
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(v_object, stream);
                } else {
                    {
                        SubLObject v_object_3 = v_object;
                        SubLObject stream_4 = stream;
                        write_string($str_alt22$__, stream_4, UNPROVIDED, UNPROVIDED);
                        write(type_of(v_object_3), new SubLObject[]{ $STREAM, stream_4 });
                        write_char(CHAR_space, stream_4);
                        princ(user_action_id_string(v_object), stream);
                        write_char(CHAR_greater, stream_4);
                    }
                }
            }
            return v_object;
        }
    }

    /**
     * Used internally.
     */
    @LispMethod(comment = "Used internally.")
    public static SubLObject print_user_action(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
            princ($str27$_, stream);
        } else
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
                princ(user_action_id_string(v_object), stream);
                print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
            }

        return v_object;
    }

    public static final SubLObject user_actions_emptyP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return sublisp_null($user_actions$.getDynamicValue(thread));
        }
    }

    public static SubLObject user_actions_emptyP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sublisp_null($user_actions$.getDynamicValue(thread));
    }

    public static final SubLObject user_actions_size_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return length($user_actions$.getDynamicValue(thread));
        }
    }

    public static SubLObject user_actions_size() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return length($user_actions$.getDynamicValue(thread));
    }

    /**
     * Define a new user-action and add it to *user-actions-by-id-string* and *user-actions*.
     *
     * @return user-action ;; the new user-action
     * @param ARGLIST
     * 		list ;; a list of key-value pairs to set type-key, cyclist, and optionally data.
     */
    @LispMethod(comment = "Define a new user-action and add it to *user-actions-by-id-string* and *user-actions*.\r\n\r\n@return user-action ;; the new user-action\r\n@param ARGLIST\r\n\t\tlist ;; a list of key-value pairs to set type-key, cyclist, and optionally data.")
    public static final SubLObject new_user_action_alt(SubLObject arglist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject guid = Guids.new_guid();
                SubLObject new_user_action_id_string = string_utilities.copy_string(Guids.guid_to_string(guid));
                SubLObject arglist_copy = copy_list(arglist);
                SubLObject new_user_action = NIL;
                new_user_action = make_user_action(arglist_copy);
                _csetf_user_action_id_string(new_user_action, new_user_action_id_string);
                _csetf_user_action_creation_time(new_user_action, get_universal_time());
                {
                    SubLObject lock = $user_actions_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        sethash(new_user_action_id_string, $user_actions_by_id_string$.getDynamicValue(thread), new_user_action);
                        {
                            SubLObject item_var = new_user_action;
                            if (NIL == member(item_var, $user_actions$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                $user_actions$.setDynamicValue(cons(item_var, $user_actions$.getDynamicValue(thread)), thread);
                            }
                        }
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                return new_user_action;
            }
        }
    }

    @LispMethod(comment = "Define a new user-action and add it to *user-actions-by-id-string* and *user-actions*.\r\n\r\n@return user-action ;; the new user-action\r\n@param ARGLIST\r\n\t\tlist ;; a list of key-value pairs to set type-key, cyclist, and optionally data.")
    public static SubLObject new_user_action(final SubLObject arglist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject guid = Guids.new_guid();
        final SubLObject new_user_action_id_string = string_utilities.copy_string(Guids.guid_to_string(guid));
        final SubLObject arglist_copy = copy_list(arglist);
        SubLObject new_user_action = NIL;
        new_user_action = make_user_action(arglist_copy);
        _csetf_user_action_id_string(new_user_action, new_user_action_id_string);
        _csetf_user_action_creation_time(new_user_action, get_universal_time());
        SubLObject release = NIL;
        try {
            release = seize_lock($user_actions_lock$.getGlobalValue());
            sethash(new_user_action_id_string, $user_actions_by_id_string$.getDynamicValue(thread), new_user_action);
            final SubLObject item_var = new_user_action;
            if (NIL == member(item_var, $user_actions$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                $user_actions$.setDynamicValue(cons(item_var, $user_actions$.getDynamicValue(thread)), thread);
            }
        } finally {
            if (NIL != release) {
                release_lock($user_actions_lock$.getGlobalValue());
            }
        }
        return new_user_action;
    }

    /**
     * Remove a user-action from *user-actions* and *user-actions-by-id-string*.
     */
    @LispMethod(comment = "Remove a user-action from *user-actions* and *user-actions-by-id-string*.")
    public static final SubLObject delete_user_action_alt(SubLObject user_action) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $user_actions_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    $user_actions$.setDynamicValue(remove(user_action, $user_actions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    remhash(user_action_id_string(user_action), $user_actions_by_id_string$.getDynamicValue(thread));
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Remove a user-action from *user-actions* and *user-actions-by-id-string*.")
    public static SubLObject delete_user_action(final SubLObject user_action) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($user_actions_lock$.getGlobalValue());
            $user_actions$.setDynamicValue(remove(user_action, $user_actions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            remhash(user_action_id_string(user_action), $user_actions_by_id_string$.getDynamicValue(thread));
        } finally {
            if (NIL != release) {
                release_lock($user_actions_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Lookup a user-action by id-string.
     *
     * @return user-action
     * @param USER-ACTION-ID-STRING
    string
     * 		
     */
    @LispMethod(comment = "Lookup a user-action by id-string.\r\n\r\n@return user-action\r\n@param USER-ACTION-ID-STRING\nstring")
    public static final SubLObject user_action_by_id_string_alt(SubLObject user_action_id_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(user_action_id_string, $user_actions_by_id_string$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    @LispMethod(comment = "Lookup a user-action by id-string.\r\n\r\n@return user-action\r\n@param USER-ACTION-ID-STRING\n\t\tstring")
    public static SubLObject user_action_by_id_string(final SubLObject user_action_id_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(user_action_id_string, $user_actions_by_id_string$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * Return the action-type structure for this USER-ACTION.
     *
     * @return action-type
     * @param USER-ACTION
    user-action
     * 		
     */
    @LispMethod(comment = "Return the action-type structure for this USER-ACTION.\r\n\r\n@return action-type\r\n@param USER-ACTION\nuser-action")
    public static final SubLObject user_action_type_alt(SubLObject user_action) {
        {
            SubLObject user_action_type_key = user_action_type_key(user_action);
            if (NIL == user_action_type_key) {
                return NIL;
            }
            {
                SubLObject user_action_type = action_type_by_key(user_action_type_key);
                return user_action_type;
            }
        }
    }

    @LispMethod(comment = "Return the action-type structure for this USER-ACTION.\r\n\r\n@return action-type\r\n@param USER-ACTION\n\t\tuser-action")
    public static SubLObject user_action_type(final SubLObject user_action) {
        final SubLObject user_action_type_key = user_action_type_key(user_action);
        if (NIL == user_action_type_key) {
            return NIL;
        }
        final SubLObject user_action_type = action_type_by_key(user_action_type_key);
        return user_action_type;
    }

    /**
     * Return the summary-fn for this USER-ACTION's action-type.
     *
     * @return function
     * @param USER-ACTION
    user-action
     * 		
     */
    @LispMethod(comment = "Return the summary-fn for this USER-ACTION\'s action-type.\r\n\r\n@return function\r\n@param USER-ACTION\nuser-action")
    public static final SubLObject user_action_summary_fn_alt(SubLObject user_action) {
        {
            SubLObject user_action_type = user_action_type(user_action);
            if (NIL == user_action_type) {
                return NIL;
            }
            {
                SubLObject user_action_type_summary_fn = action_type_summary_fn(user_action_type);
                return user_action_type_summary_fn;
            }
        }
    }

    @LispMethod(comment = "Return the summary-fn for this USER-ACTION\'s action-type.\r\n\r\n@return function\r\n@param USER-ACTION\n\t\tuser-action")
    public static SubLObject user_action_summary_fn(final SubLObject user_action) {
        final SubLObject user_action_type = user_action_type(user_action);
        if (NIL == user_action_type) {
            return NIL;
        }
        final SubLObject user_action_type_summary_fn = action_type_summary_fn(user_action_type);
        return user_action_type_summary_fn;
    }

    /**
     * Return the display-fn for this USER-ACTION's action-type.
     *
     * @return function
     * @param USER-ACTION
    user-action
     * 		
     */
    @LispMethod(comment = "Return the display-fn for this USER-ACTION\'s action-type.\r\n\r\n@return function\r\n@param USER-ACTION\nuser-action")
    public static final SubLObject user_action_display_fn_alt(SubLObject user_action) {
        {
            SubLObject user_action_type = user_action_type(user_action);
            if (NIL == user_action_type) {
                return NIL;
            }
            {
                SubLObject user_action_type_display_fn = action_type_display_fn(user_action_type);
                return user_action_type_display_fn;
            }
        }
    }

    @LispMethod(comment = "Return the display-fn for this USER-ACTION\'s action-type.\r\n\r\n@return function\r\n@param USER-ACTION\n\t\tuser-action")
    public static SubLObject user_action_display_fn(final SubLObject user_action) {
        final SubLObject user_action_type = user_action_type(user_action);
        if (NIL == user_action_type) {
            return NIL;
        }
        final SubLObject user_action_type_display_fn = action_type_display_fn(user_action_type);
        return user_action_type_display_fn;
    }

    /**
     * Return the handler-fn for this USER-ACTION's action-type.
     *
     * @return function
     * @param USER-ACTION
    user-action
     * 		
     */
    @LispMethod(comment = "Return the handler-fn for this USER-ACTION\'s action-type.\r\n\r\n@return function\r\n@param USER-ACTION\nuser-action")
    public static final SubLObject user_action_handler_fn_alt(SubLObject user_action) {
        {
            SubLObject user_action_type = user_action_type(user_action);
            if (NIL == user_action_type) {
                return NIL;
            }
            {
                SubLObject user_action_type_handler_fn = action_type_handler_fn(user_action_type);
                return user_action_type_handler_fn;
            }
        }
    }

    @LispMethod(comment = "Return the handler-fn for this USER-ACTION\'s action-type.\r\n\r\n@return function\r\n@param USER-ACTION\n\t\tuser-action")
    public static SubLObject user_action_handler_fn(final SubLObject user_action) {
        final SubLObject user_action_type = user_action_type(user_action);
        if (NIL == user_action_type) {
            return NIL;
        }
        final SubLObject user_action_type_handler_fn = action_type_handler_fn(user_action_type);
        return user_action_type_handler_fn;
    }

    public static final SubLObject all_actions_for_cyclist_alt(SubLObject cyclist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return remove(cyclist, $user_actions$.getDynamicValue(thread), symbol_function(NOT_EQ), symbol_function(USER_ACTION_CYCLIST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject all_actions_for_cyclist(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return remove(cyclist, $user_actions$.getDynamicValue(thread), symbol_function(NOT_EQ), symbol_function(USER_ACTION_CYCLIST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject all_actions_for_cyclist_of_type_alt(SubLObject cyclist, SubLObject action_type_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_actions_of_cyclist = remove(cyclist, $user_actions$.getDynamicValue(thread), symbol_function(NOT_EQ), symbol_function(USER_ACTION_CYCLIST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject user_actions_of_cyclist_with_type_key = remove(action_type_key, user_actions_of_cyclist, symbol_function(NOT_EQ), symbol_function(USER_ACTION_TYPE_KEY), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return user_actions_of_cyclist_with_type_key;
            }
        }
    }

    public static SubLObject all_actions_for_cyclist_of_type(final SubLObject cyclist, final SubLObject action_type_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user_actions_of_cyclist = remove(cyclist, $user_actions$.getDynamicValue(thread), symbol_function(NOT_EQ), symbol_function(USER_ACTION_CYCLIST), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject user_actions_of_cyclist_with_type_key = remove(action_type_key, user_actions_of_cyclist, symbol_function(NOT_EQ), symbol_function(USER_ACTION_TYPE_KEY), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return user_actions_of_cyclist_with_type_key;
    }

    public static SubLObject declare_user_actions_file() {
        declareFunction("action_type_print_function_trampoline", "ACTION-TYPE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("action_type_p", "ACTION-TYPE-P", 1, 0, false);
        new user_actions.$action_type_p$UnaryFunction();
        declareFunction("action_type_key", "ACTION-TYPE-KEY", 1, 0, false);
        declareFunction("action_type_summary_fn", "ACTION-TYPE-SUMMARY-FN", 1, 0, false);
        declareFunction("action_type_display_fn", "ACTION-TYPE-DISPLAY-FN", 1, 0, false);
        declareFunction("action_type_handler_fn", "ACTION-TYPE-HANDLER-FN", 1, 0, false);
        declareFunction("_csetf_action_type_key", "_CSETF-ACTION-TYPE-KEY", 2, 0, false);
        declareFunction("_csetf_action_type_summary_fn", "_CSETF-ACTION-TYPE-SUMMARY-FN", 2, 0, false);
        declareFunction("_csetf_action_type_display_fn", "_CSETF-ACTION-TYPE-DISPLAY-FN", 2, 0, false);
        declareFunction("_csetf_action_type_handler_fn", "_CSETF-ACTION-TYPE-HANDLER-FN", 2, 0, false);
        declareFunction("make_action_type", "MAKE-ACTION-TYPE", 0, 1, false);
        declareFunction("visit_defstruct_action_type", "VISIT-DEFSTRUCT-ACTION-TYPE", 2, 0, false);
        declareFunction("visit_defstruct_object_action_type_method", "VISIT-DEFSTRUCT-OBJECT-ACTION-TYPE-METHOD", 2, 0, false);
        declareFunction("print_action_type", "PRINT-ACTION-TYPE", 3, 0, false);
        declareMacro("defaction_type", "DEFACTION-TYPE");
        declareFunction("action_type_by_key", "ACTION-TYPE-BY-KEY", 1, 0, false);
        declareFunction("user_action_print_function_trampoline", "USER-ACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("user_action_p", "USER-ACTION-P", 1, 0, false);
        new user_actions.$user_action_p$UnaryFunction();
        declareFunction("user_action_id_string", "USER-ACTION-ID-STRING", 1, 0, false);
        declareFunction("user_action_type_key", "USER-ACTION-TYPE-KEY", 1, 0, false);
        declareFunction("user_action_cyclist", "USER-ACTION-CYCLIST", 1, 0, false);
        declareFunction("user_action_creation_time", "USER-ACTION-CREATION-TIME", 1, 0, false);
        declareFunction("user_action_data", "USER-ACTION-DATA", 1, 0, false);
        declareFunction("_csetf_user_action_id_string", "_CSETF-USER-ACTION-ID-STRING", 2, 0, false);
        declareFunction("_csetf_user_action_type_key", "_CSETF-USER-ACTION-TYPE-KEY", 2, 0, false);
        declareFunction("_csetf_user_action_cyclist", "_CSETF-USER-ACTION-CYCLIST", 2, 0, false);
        declareFunction("_csetf_user_action_creation_time", "_CSETF-USER-ACTION-CREATION-TIME", 2, 0, false);
        declareFunction("_csetf_user_action_data", "_CSETF-USER-ACTION-DATA", 2, 0, false);
        declareFunction("make_user_action", "MAKE-USER-ACTION", 0, 1, false);
        declareFunction("visit_defstruct_user_action", "VISIT-DEFSTRUCT-USER-ACTION", 2, 0, false);
        declareFunction("visit_defstruct_object_user_action_method", "VISIT-DEFSTRUCT-OBJECT-USER-ACTION-METHOD", 2, 0, false);
        declareFunction("print_user_action", "PRINT-USER-ACTION", 3, 0, false);
        declareFunction("user_actions_emptyP", "USER-ACTIONS-EMPTY?", 0, 0, false);
        declareFunction("user_actions_size", "USER-ACTIONS-SIZE", 0, 0, false);
        declareFunction("new_user_action", "NEW-USER-ACTION", 1, 0, false);
        declareFunction("delete_user_action", "DELETE-USER-ACTION", 1, 0, false);
        declareFunction("user_action_by_id_string", "USER-ACTION-BY-ID-STRING", 1, 0, false);
        declareFunction("user_action_type", "USER-ACTION-TYPE", 1, 0, false);
        declareFunction("user_action_summary_fn", "USER-ACTION-SUMMARY-FN", 1, 0, false);
        declareFunction("user_action_display_fn", "USER-ACTION-DISPLAY-FN", 1, 0, false);
        declareFunction("user_action_handler_fn", "USER-ACTION-HANDLER-FN", 1, 0, false);
        declareFunction("all_actions_for_cyclist", "ALL-ACTIONS-FOR-CYCLIST", 1, 0, false);
        declareFunction("all_actions_for_cyclist_of_type", "ALL-ACTIONS-FOR-CYCLIST-OF-TYPE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_user_actions_file() {
        defconstant("*DTP-ACTION-TYPE*", ACTION_TYPE);
        defparameter("*ACTION-TYPES-BY-KEY*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-USER-ACTION*", USER_ACTION);
        deflexical("*USER-ACTIONS-LOCK*", make_lock($$$User_Actions_Lock));
        defparameter("*USER-ACTIONS*", NIL);
        defparameter("*USER-ACTIONS-BY-ID-STRING*", make_hash_table($int$64, symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_user_actions_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_action_type$.getGlobalValue(), symbol_function(ACTION_TYPE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(ACTION_TYPE_KEY, _CSETF_ACTION_TYPE_KEY);
        def_csetf(ACTION_TYPE_SUMMARY_FN, _CSETF_ACTION_TYPE_SUMMARY_FN);
        def_csetf(ACTION_TYPE_DISPLAY_FN, _CSETF_ACTION_TYPE_DISPLAY_FN);
        def_csetf(ACTION_TYPE_HANDLER_FN, _CSETF_ACTION_TYPE_HANDLER_FN);
        identity(ACTION_TYPE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_action_type$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ACTION_TYPE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_user_action$.getGlobalValue(), symbol_function(USER_ACTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list44);
        def_csetf(USER_ACTION_ID_STRING, _CSETF_USER_ACTION_ID_STRING);
        def_csetf(USER_ACTION_TYPE_KEY, _CSETF_USER_ACTION_TYPE_KEY);
        def_csetf(USER_ACTION_CYCLIST, _CSETF_USER_ACTION_CYCLIST);
        def_csetf(USER_ACTION_CREATION_TIME, _CSETF_USER_ACTION_CREATION_TIME);
        def_csetf(USER_ACTION_DATA, _CSETF_USER_ACTION_DATA);
        identity(USER_ACTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_action$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_USER_ACTION_METHOD));
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("KEY"), makeSymbol("SUMMARY-FN"), makeSymbol("DISPLAY-FN"), makeSymbol("HANDLER-FN"));

    static private final SubLList $list_alt3 = list(makeKeyword("KEY"), makeKeyword("SUMMARY-FN"), makeKeyword("DISPLAY-FN"), makeKeyword("HANDLER-FN"));

    static private final SubLList $list_alt4 = list(makeSymbol("ACTION-TYPE-KEY"), makeSymbol("ACTION-TYPE-SUMMARY-FN"), makeSymbol("ACTION-TYPE-DISPLAY-FN"), makeSymbol("ACTION-TYPE-HANDLER-FN"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-ACTION-TYPE-KEY"), makeSymbol("_CSETF-ACTION-TYPE-SUMMARY-FN"), makeSymbol("_CSETF-ACTION-TYPE-DISPLAY-FN"), makeSymbol("_CSETF-ACTION-TYPE-HANDLER-FN"));

    @Override
    public void declareFunctions() {
        declare_user_actions_file();
    }

    @Override
    public void initializeVariables() {
        init_user_actions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_user_actions_file();
    }

    static {
    }

    public static final class $action_type_native extends SubLStructNative {
        public SubLObject $key;

        public SubLObject $summary_fn;

        public SubLObject $display_fn;

        public SubLObject $handler_fn;

        private static final SubLStructDeclNative structDecl;

        public $action_type_native() {
            user_actions.$action_type_native.this.$key = Lisp.NIL;
            user_actions.$action_type_native.this.$summary_fn = Lisp.NIL;
            user_actions.$action_type_native.this.$display_fn = Lisp.NIL;
            user_actions.$action_type_native.this.$handler_fn = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return user_actions.$action_type_native.this.$key;
        }

        @Override
        public SubLObject getField3() {
            return user_actions.$action_type_native.this.$summary_fn;
        }

        @Override
        public SubLObject getField4() {
            return user_actions.$action_type_native.this.$display_fn;
        }

        @Override
        public SubLObject getField5() {
            return user_actions.$action_type_native.this.$handler_fn;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return user_actions.$action_type_native.this.$key = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return user_actions.$action_type_native.this.$summary_fn = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return user_actions.$action_type_native.this.$display_fn = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return user_actions.$action_type_native.this.$handler_fn = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.user_actions.$action_type_native.class, ACTION_TYPE, ACTION_TYPE_P, $list2, $list3, new String[]{ "$key", "$summary_fn", "$display_fn", "$handler_fn" }, $list4, $list5, PRINT_ACTION_TYPE);
        }
    }

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt21$_ = makeString("#");

    static private final SubLString $str_alt22$__ = makeString("#<");

    static private final SubLList $list_alt26 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    static private final SubLSymbol $sym27$NEW_ACTION_TYPE = makeUninternedSymbol("NEW-ACTION-TYPE");

    static private final SubLList $list_alt36 = list(makeSymbol("ID-STRING"), makeSymbol("TYPE-KEY"), makeSymbol("CYCLIST"), makeSymbol("CREATION-TIME"), makeSymbol("DATA"));

    static private final SubLList $list_alt37 = list(makeKeyword("ID-STRING"), makeKeyword("TYPE-KEY"), makeKeyword("CYCLIST"), makeKeyword("CREATION-TIME"), $DATA);

    static private final SubLList $list_alt38 = list(makeSymbol("USER-ACTION-ID-STRING"), makeSymbol("USER-ACTION-TYPE-KEY"), makeSymbol("USER-ACTION-CYCLIST"), makeSymbol("USER-ACTION-CREATION-TIME"), makeSymbol("USER-ACTION-DATA"));

    static private final SubLList $list_alt39 = list(makeSymbol("_CSETF-USER-ACTION-ID-STRING"), makeSymbol("_CSETF-USER-ACTION-TYPE-KEY"), makeSymbol("_CSETF-USER-ACTION-CYCLIST"), makeSymbol("_CSETF-USER-ACTION-CREATION-TIME"), makeSymbol("_CSETF-USER-ACTION-DATA"));

    public static final class $action_type_p$UnaryFunction extends UnaryFunction {
        public $action_type_p$UnaryFunction() {
            super(extractFunctionNamed("ACTION-TYPE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return action_type_p(arg1);
        }
    }

    public static final class $user_action_native extends SubLStructNative {
        public SubLObject $id_string;

        public SubLObject $type_key;

        public SubLObject $cyclist;

        public SubLObject $creation_time;

        public SubLObject $data;

        private static final SubLStructDeclNative structDecl;

        public $user_action_native() {
            user_actions.$user_action_native.this.$id_string = Lisp.NIL;
            user_actions.$user_action_native.this.$type_key = Lisp.NIL;
            user_actions.$user_action_native.this.$cyclist = Lisp.NIL;
            user_actions.$user_action_native.this.$creation_time = Lisp.NIL;
            user_actions.$user_action_native.this.$data = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return user_actions.$user_action_native.this.$id_string;
        }

        @Override
        public SubLObject getField3() {
            return user_actions.$user_action_native.this.$type_key;
        }

        @Override
        public SubLObject getField4() {
            return user_actions.$user_action_native.this.$cyclist;
        }

        @Override
        public SubLObject getField5() {
            return user_actions.$user_action_native.this.$creation_time;
        }

        @Override
        public SubLObject getField6() {
            return user_actions.$user_action_native.this.$data;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return user_actions.$user_action_native.this.$id_string = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return user_actions.$user_action_native.this.$type_key = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return user_actions.$user_action_native.this.$cyclist = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return user_actions.$user_action_native.this.$creation_time = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return user_actions.$user_action_native.this.$data = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.user_actions.$user_action_native.class, USER_ACTION, USER_ACTION_P, $list38, $list39, new String[]{ "$id_string", "$type_key", "$cyclist", "$creation_time", "$data" }, $list40, $list41, PRINT_USER_ACTION);
        }
    }

    public static final class $user_action_p$UnaryFunction extends UnaryFunction {
        public $user_action_p$UnaryFunction() {
            super(extractFunctionNamed("USER-ACTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return user_action_p(arg1);
        }
    }
}

/**
 * Total time: 173 ms
 */
