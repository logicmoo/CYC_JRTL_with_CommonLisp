/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-KS-TOOLS
 *  source file: /cyc/top/cycl/cyblack/cyblack-ks-tools.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_ks_tools extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_ks_tools() {
    }

    public static final SubLFile me = new cyblack_ks_tools();


    // // Definitions
    public static final SubLObject with_ks_args(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ks_arg_symbols = NIL;
            SubLObject binding_symbols = NIL;
            SubLObject activation_pattern = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            ks_arg_symbols = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            binding_symbols = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            activation_pattern = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject v_bindings = NIL;
                SubLObject cdolist_list_var = append(ks_arg_symbols, binding_symbols);
                SubLObject ks_arg_symbol = NIL;
                for (ks_arg_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks_arg_symbol = cdolist_list_var.first()) {
                    v_bindings = cons(list(intern(make_symbol(string_utilities.strip_first(symbol_name(ks_arg_symbol))), UNPROVIDED), list(INLINE_METHOD, $list_alt2, activation_pattern, list(QUOTE, ks_arg_symbol))), v_bindings);
                }
                return listS(CLET, v_bindings, append(body, NIL));
            }
        }
    }

    public static final SubLObject define_ks(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            name = current.first();
            current = current.rest();
            {
                SubLObject deflist = current;
                SubLObject base_name = Strings.string_upcase(Strings.string(name), UNPROVIDED, UNPROVIDED);
                SubLObject precond_pattern_name = intern(cconcatenate($str_alt6$_, new SubLObject[]{ base_name, $str_alt7$_KS_PRECONDITION_PATTERN }), UNPROVIDED);
                SubLObject ksi_name = intern(cconcatenate(base_name, $str_alt8$_KSI), UNPROVIDED);
                SubLObject proposal_name = intern(cconcatenate(base_name, $str_alt9$_PROPOSAL), UNPROVIDED);
                SubLObject ks_name = intern(cconcatenate(base_name, $str_alt10$_KS), UNPROVIDED);
                SubLObject precond_pattern = cadr(member($PRECONDITION_PATTERN, deflist, UNPROVIDED, UNPROVIDED));
                SubLObject ksi_execute = cadr(member($KSI_EXECUTE, deflist, UNPROVIDED, UNPROVIDED));
                SubLObject result_datatypes = cadr(member($RESULT_DATATYPES, deflist, UNPROVIDED, UNPROVIDED));
                SubLObject unification_robot = cadr(member($UNIFICATION_ROBOT, deflist, UNPROVIDED, UNPROVIDED));
                SubLObject ksi_superclass = cadr(member($KSI_SUPERCLASS, deflist, UNPROVIDED, UNPROVIDED));
                SubLObject proposal_superclass = cadr(member($PROPOSAL_SUPERCLASS, deflist, UNPROVIDED, UNPROVIDED));
                SubLObject ks_superclass = cadr(member($KS_SUPERCLASS, deflist, UNPROVIDED, UNPROVIDED));
                SubLObject precond_pattern_ks_args = NIL;
                SubLObject precond_pattern_binding_list = NIL;
                SubLObject abortP = NIL;
                if (NIL != unification_robot) {
                    if (NIL == classes.subclassp(unification_robot, CYBLACK_UNIFICATION_ROBOT)) {
                        Errors.warn($str_alt19$_define_ks__A___invalid__unificat, name, unification_robot);
                        abortP = T;
                    }
                } else {
                    unification_robot = CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION;
                }
                if (NIL != ksi_superclass) {
                    if (NIL == classes.subclassp(ksi_superclass, CYBLACK_BASIC_KSI)) {
                        Errors.warn($str_alt22$_define_ks__A___invalid__ksi_supe, name, ksi_superclass);
                        abortP = T;
                    }
                } else {
                    ksi_superclass = CYBLACK_BASIC_KSI;
                }
                if (NIL != proposal_superclass) {
                    if (NIL == classes.subclassp(proposal_superclass, CYBLACK_BASIC_PROPOSAL)) {
                        Errors.warn($str_alt24$_define_ks__A___invalid__proposal, name, proposal_superclass);
                        abortP = T;
                    }
                } else {
                    proposal_superclass = CYBLACK_INTERNAL_PROPOSAL;
                }
                if (NIL != ks_superclass) {
                    if (NIL == classes.subclassp(ks_superclass, CYBLACK_BASIC_KNOWLEDGE_SOURCE)) {
                        Errors.warn($str_alt27$_define_ks__A___invalid__ks_super, name, ks_superclass);
                        abortP = T;
                    }
                } else {
                    ks_superclass = CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE;
                }
                if (!result_datatypes.isList()) {
                    Errors.warn($str_alt29$_define_ks__A___invalid__result_d, name, result_datatypes);
                    abortP = T;
                }
                {
                    SubLObject cdolist_list_var = result_datatypes;
                    SubLObject result_datatype = NIL;
                    for (result_datatype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result_datatype = cdolist_list_var.first()) {
                        if (!result_datatype.isString()) {
                            Errors.warn($str_alt30$_define_ks__A___invalid__result_d, name, result_datatype);
                            abortP = T;
                        }
                    }
                }
                if (!precond_pattern.isCons()) {
                    Errors.warn($str_alt31$_define_ks__A___invalid__precondi, name, precond_pattern);
                    abortP = T;
                }
                if (QUOTE == precond_pattern.first()) {
                    Errors.warn($str_alt32$_define_ks__A____precondition_pat, name);
                    abortP = T;
                }
                {
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    precond_pattern_ks_args = Mapping.mapcar(symbol_function(CAR), cadr(member($KS_ARGS, precond_pattern, UNPROVIDED, UNPROVIDED)));
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error_message) {
                        Errors.warn($str_alt36$_define_ks__A____ks_args_of__prec, name);
                        abortP = T;
                    }
                }
                if (NIL == precond_pattern_ks_args) {
                    Errors.warn($str_alt37$_define_ks__A____precondition_pat, name);
                    abortP = T;
                }
                {
                    SubLObject cdolist_list_var = precond_pattern_ks_args;
                    SubLObject precond_pattern_ks_arg = NIL;
                    for (precond_pattern_ks_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , precond_pattern_ks_arg = cdolist_list_var.first()) {
                        if (CHAR_question != Strings.sublisp_char(symbol_name(precond_pattern_ks_arg), ZERO_INTEGER)) {
                            Errors.warn($str_alt38$_define_ks__A___a__ks_arg_of__pre, name, precond_pattern_ks_arg);
                            abortP = T;
                        }
                    }
                }
                {
                    SubLObject error_message = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    precond_pattern_binding_list = Mapping.mapcar(symbol_function(CAR), cadr(member($BINDING_LIST, precond_pattern, UNPROVIDED, UNPROVIDED)));
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error_message) {
                        Errors.warn($str_alt40$_define_ks__A____binding_list_of_, name);
                        abortP = T;
                    }
                }
                {
                    SubLObject cdolist_list_var = precond_pattern_binding_list;
                    SubLObject precond_pattern_binding = NIL;
                    for (precond_pattern_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , precond_pattern_binding = cdolist_list_var.first()) {
                        if (CHAR_question != Strings.sublisp_char(symbol_name(precond_pattern_binding), ZERO_INTEGER)) {
                            Errors.warn($str_alt41$_define_ks__A___a__binding_of__pr, name, precond_pattern_binding);
                            abortP = T;
                        }
                    }
                }
                if (!ksi_execute.isCons()) {
                    Errors.warn($str_alt42$_define_ks__A___invalid__ksi_exec, name);
                    abortP = T;
                }
                if (QUOTE == ksi_execute.first()) {
                    Errors.warn($str_alt43$_define_ks__A____ksi_execute_must, name);
                    abortP = T;
                }
                if (NIL != abortP) {
                    Errors.error($str_alt44$_define_ks__A__had_errors__, name);
                }
                return list(new SubLObject[]{ PROGN, list(DEFPARAMETER_PRIVATE, precond_pattern_name, list(QUOTE, precond_pattern)), listS(DEFINE_CLASS, list(ksi_name, $EXTENDS, ksi_superclass), $list_alt49), list(DEF_INSTANCE_METHOD, listS(EXECUTE, ksi_name, $list_alt52), NIL, list(CYBLACK_TRACING_FORMAT, $str_alt54$___EXECUTE__S___Executing__S_prop, SELF, list(QUOTE, ksi_name)), list(CLET, $list_alt56, list(MUST, $list_alt58, $str_alt59$_S__app_not_found_, list(QUOTE, ksi_name)), list(CLET, $list_alt60, list(MUST, $list_alt61, $str_alt62$_S__datatype_dictionary_not_found, list(QUOTE, ksi_name)), list(MUST, $list_alt63, $str_alt62$_S__datatype_dictionary_not_found, list(QUOTE, ksi_name)), list(PWHEN, ACTIVATION_PATTERN, list(WITH_KS_ARGS, precond_pattern_ks_args, precond_pattern_binding_list, ACTIVATION_PATTERN, ksi_execute))))), listS(DEFINE_CLASS, list(proposal_name, $EXTENDS, proposal_superclass), $list_alt67), listS(DEF_INSTANCE_METHOD, listS(INITIALIZE, proposal_name, $list_alt69), NIL, $list_alt70, list(SET_PROPOSED_CONTRIBUTIONS, SELF, list(CREATE_DATATYPE_BAG, SELF, list(QUOTE, result_datatypes))), $list_alt73), list(DEF_INSTANCE_METHOD, listS(GENERATE_KSI, proposal_name, $list_alt52), NIL, list(CYBLACK_TRACING_FORMAT, $str_alt75$___GENERATE_KSI__S___Generating__, SELF, list(QUOTE, ksi_name)), listS(CLET, $list_alt76, list(PWHEN, NEW_KSI, listS(INLINE_METHOD, list(SET_ACTIVATION_PATTERN, ksi_name), $list_alt79)), $list_alt80)), listS(DEFINE_CLASS, list(ks_name, $EXTENDS, ks_superclass), $list_alt81), listS(DEF_INSTANCE_METHOD, new SubLObject[]{ listS(INITIALIZE, ks_name, $list_alt82), NIL, $list_alt70, list(SET_PRECONDITION_PATTERN, SELF, list(COPY_TREE, list(QUOTE, precond_pattern))), list(SET_UNIFICATION_ROBOT_CLASS, SELF, list(QUOTE, unification_robot)), $list_alt73 }), listS(DEF_INSTANCE_METHOD, listS(STIMULATE, ks_name, $list_alt52), $list_alt87), list(DEF_INSTANCE_METHOD, listS(GENERATE_KSI, ks_name, $list_alt52), $list_alt88, $list_alt89, listS(CLET, list(list(KSI, list(INLINE_METHOD, list(NEW, ksi_name), list(QUOTE, ksi_name)))), $list_alt92)), list(DEF_INSTANCE_METHOD, listS(CREATE_PROPOSAL, ks_name, $list_alt69), $list_alt94, list(FORMAT, T, $str_alt96$_______Calling__CREATE_PROPOSAL__, list(QUOTE, ks_name)), $list_alt97, $list_alt98, listS(CLET, new SubLObject[]{ bq_cons(list(NEW_PROPOSAL, list(INLINE_METHOD, list(NEW, proposal_name), list(QUOTE, proposal_name))), $list_alt56), listS(INLINE_METHOD, list(SET_APPLICATION, proposal_name), $list_alt101), listS(INLINE_METHOD, list(SET_ACTIVATION_PATTERN, proposal_name), $list_alt102), list(PWHEN, APP, list(CLET, $list_alt104, list(PWHEN, DICTIONARY, list(CLET, $list_alt106, listS(CDOLIST, list(RESULT_DATATYPE, list(QUOTE, result_datatypes)), $list_alt109), listS(INLINE_METHOD, list(SET_PROPOSED_CONTRIBUTIONS, proposal_name), $list_alt110))))), listS(INLINE_METHOD, list(SET_TIMESTAMP, proposal_name), $list_alt112), $list_alt113 })) });
            }
        }
    }

    public static final SubLObject make_posting(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject posting_type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt114);
            posting_type = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(FUNCALL_CLASS_METHOD, list(QUOTE, posting_type), $list_alt116);
            } else {
                cdestructuring_bind_error(datum, $list_alt114);
            }
        }
        return NIL;
    }

    public static final SubLObject populate_posting(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject posting = NIL;
            SubLObject posting_type = NIL;
            SubLObject datatype_name = NIL;
            SubLObject app = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt117);
            posting = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt117);
            posting_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt117);
            datatype_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt117);
            app = current.first();
            current = current.rest();
            {
                SubLObject slot_name_value_pairs = current;
                SubLObject set_slot_forms = NIL;
                SubLObject cdolist_list_var = slot_name_value_pairs;
                SubLObject slot_name_value_pair = NIL;
                for (slot_name_value_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , slot_name_value_pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum_1 = slot_name_value_pair;
                        SubLObject current_2 = datum_1;
                        SubLObject slot_name = NIL;
                        SubLObject slot_value = NIL;
                        destructuring_bind_must_consp(current_2, datum_1, $list_alt118);
                        slot_name = current_2.first();
                        current_2 = current_2.rest();
                        destructuring_bind_must_consp(current_2, datum_1, $list_alt118);
                        slot_value = current_2.first();
                        current_2 = current_2.rest();
                        if (NIL == current_2) {
                            set_slot_forms = cons(list(SET_SLOT, posting, slot_name, slot_value), set_slot_forms);
                        } else {
                            cdestructuring_bind_error(datum_1, $list_alt118);
                        }
                    }
                }
                {
                    SubLObject datatype = $sym120$DATATYPE;
                    return listS(CLET, list(list(datatype, list(INLINE_METHOD, $list_alt121, list(INLINE_METHOD, $list_alt122, app), datatype_name))), append(set_slot_forms, list(list(INLINE_METHOD, list(SET_DATATYPE, posting_type), posting, datatype))));
                }
            }
        }
    }

    public static final SubLObject post_posting(SubLObject posting, SubLObject app) {
        {
            SubLObject blackboard = cyblack_application.cyblack_basic_application_get_blackboard_method(app);
            if (NIL == blackboard) {
                Errors.warn($str_alt124$post_posting__not_blackboard_foun, app);
                return NIL;
            }
            cyblack_blackboard.cyblack_basic_blackboard_post_method(blackboard, posting);
        }
        return posting;
    }

    public static final SubLObject make_posting_and_post(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject posting_type = NIL;
            SubLObject datatype_name = NIL;
            SubLObject app = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt125);
            posting_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt125);
            datatype_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt125);
            app = current.first();
            current = current.rest();
            {
                SubLObject slot_name_value_pairs = current;
                SubLObject posting = $sym126$POSTING;
                return list(CLET, list(list(posting, list(MAKE_POSTING, posting_type))), listS(POPULATE_POSTING, posting, posting_type, datatype_name, app, append(slot_name_value_pairs, NIL)), list(POST_POSTING, posting, app));
            }
        }
    }

    public static final SubLObject declare_cyblack_ks_tools_file() {
        declareMacro("with_ks_args", "WITH-KS-ARGS");
        declareMacro("define_ks", "DEFINE-KS");
        declareMacro("make_posting", "MAKE-POSTING");
        declareMacro("populate_posting", "POPULATE-POSTING");
        declareFunction("post_posting", "POST-POSTING", 2, 0, false);
        declareMacro("make_posting_and_post", "MAKE-POSTING-AND-POST");
        return NIL;
    }

    public static final SubLObject init_cyblack_ks_tools_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_ks_tools_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("KS-ARG-SYMBOLS"), makeSymbol("BINDING-SYMBOLS"), makeSymbol("ACTIVATION-PATTERN"), makeSymbol("&BODY"), makeSymbol("BODY"));



    static private final SubLList $list_alt2 = list(makeSymbol("GET"), makeSymbol("CYBLACK-ACTIVATION-PATTERN"));





    static private final SubLList $list_alt5 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("DEFLIST"));

    static private final SubLString $str_alt6$_ = makeString("*");

    static private final SubLString $str_alt7$_KS_PRECONDITION_PATTERN = makeString("-KS-PRECONDITION-PATTERN");

    static private final SubLString $str_alt8$_KSI = makeString("~KSI");

    static private final SubLString $str_alt9$_PROPOSAL = makeString("-PROPOSAL");

    static private final SubLString $str_alt10$_KS = makeString("-KS");

    private static final SubLSymbol $PRECONDITION_PATTERN = makeKeyword("PRECONDITION-PATTERN");

    private static final SubLSymbol $KSI_EXECUTE = makeKeyword("KSI-EXECUTE");

    private static final SubLSymbol $RESULT_DATATYPES = makeKeyword("RESULT-DATATYPES");

    private static final SubLSymbol $UNIFICATION_ROBOT = makeKeyword("UNIFICATION-ROBOT");

    private static final SubLSymbol $KSI_SUPERCLASS = makeKeyword("KSI-SUPERCLASS");

    private static final SubLSymbol $PROPOSAL_SUPERCLASS = makeKeyword("PROPOSAL-SUPERCLASS");

    private static final SubLSymbol $KS_SUPERCLASS = makeKeyword("KS-SUPERCLASS");



    static private final SubLString $str_alt19$_define_ks__A___invalid__unificat = makeString("(define-ks ~A): invalid :unification-robot -- ~A must be a subclass of cyblack-unification-robot.~%");





    static private final SubLString $str_alt22$_define_ks__A___invalid__ksi_supe = makeString("(define-ks ~A): invalid :ksi-superclass -- ~A must be a subclass of cyblack-knowledge-source-instantiation~%");



    static private final SubLString $str_alt24$_define_ks__A___invalid__proposal = makeString("(define-ks ~A): invalid :proposal-superclass -- ~A must be a subclass of cyblack-proposal~%");

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL = makeSymbol("CYBLACK-INTERNAL-PROPOSAL");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE");

    static private final SubLString $str_alt27$_define_ks__A___invalid__ks_super = makeString("(define-ks ~A): invalid :ks-superclass -- ~A must be a subclass of cyblack-knowledge-source~%");

    private static final SubLSymbol CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-SINGLE-MATCH-CONSTRAINED-KNOWLEDGE-SOURCE");

    static private final SubLString $str_alt29$_define_ks__A___invalid__result_d = makeString("(define-ks ~A): invalid :result-datatypes -- ~A must be a list.~%");

    static private final SubLString $str_alt30$_define_ks__A___invalid__result_d = makeString("(define-ks ~A): invalid :result-datatypes -- ~A must be a string.~%");

    static private final SubLString $str_alt31$_define_ks__A___invalid__precondi = makeString("(define-ks ~A): invalid :precondition-pattern -- ~A must be a list.~%");

    static private final SubLString $str_alt32$_define_ks__A____precondition_pat = makeString("(define-ks ~A): :precondition-pattern must not be quoted.~%");





    private static final SubLSymbol $KS_ARGS = makeKeyword("KS-ARGS");

    static private final SubLString $str_alt36$_define_ks__A____ks_args_of__prec = makeString("(define-ks ~A): :ks-args of :precondition-pattern invalid.~%");

    static private final SubLString $str_alt37$_define_ks__A____precondition_pat = makeString("(define-ks ~A): :precondition-pattern :ks-args must be specified.~%");

    static private final SubLString $str_alt38$_define_ks__A___a__ks_arg_of__pre = makeString("(define-ks ~A): a :ks-arg of :precondition-pattern does not start with a question mark (~A)~%");

    private static final SubLSymbol $BINDING_LIST = makeKeyword("BINDING-LIST");

    static private final SubLString $str_alt40$_define_ks__A____binding_list_of_ = makeString("(define-ks ~A): :binding-list of :precondition-pattern invalid.~%");

    static private final SubLString $str_alt41$_define_ks__A___a__binding_of__pr = makeString("(define-ks ~A): a :binding of :precondition-pattern does not start with a question mark (~A)~%");

    static private final SubLString $str_alt42$_define_ks__A___invalid__ksi_exec = makeString("(define-ks ~A): invalid :ksi-execute -- must be a list.~%");

    static private final SubLString $str_alt43$_define_ks__A____ksi_execute_must = makeString("(define-ks ~A): :ksi-execute must not be quoted.~%");

    static private final SubLString $str_alt44$_define_ks__A__had_errors__ = makeString("(define-ks ~A) had errors~%");



    private static final SubLSymbol DEFPARAMETER_PRIVATE = makeSymbol("DEFPARAMETER-PRIVATE");





    static private final SubLList $list_alt49 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));





    static private final SubLList $list_alt52 = list(makeKeyword("PUBLIC"));



    static private final SubLString $str_alt54$___EXECUTE__S___Executing__S_prop = makeString("~%(EXECUTE ~S): Executing ~S proposal.");



    static private final SubLList $list_alt56 = list(list(makeSymbol("APP"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))));



    static private final SubLList $list_alt58 = list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("APP"));

    static private final SubLString $str_alt59$_S__app_not_found_ = makeString("~S: app not found.");

    static private final SubLList $list_alt60 = list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-BLACKBOARD"), makeSymbol("CYBLACK-BASIC-APPLICATION")), makeSymbol("APP"))), list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("CYBLACK-BASIC-APPLICATION")), makeSymbol("APP"))));

    static private final SubLList $list_alt61 = list(makeSymbol("CYBLACK-BLACKBOARD-P"), makeSymbol("BLACKBOARD"));

    static private final SubLString $str_alt62$_S__datatype_dictionary_not_found = makeString("~S: datatype-dictionary not found.");

    static private final SubLList $list_alt63 = list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-P"), makeSymbol("DATATYPE-DICTIONARY"));





    private static final SubLSymbol WITH_KS_ARGS = makeSymbol("WITH-KS-ARGS");

    static private final SubLList $list_alt67 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KSI"), NIL, makeKeyword("PUBLIC")));



    static private final SubLList $list_alt69 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt70 = list(makeSymbol("INITIALIZE"), makeSymbol("SUPER"));





    static private final SubLList $list_alt73 = list(list(RET, makeSymbol("SELF")));



    static private final SubLString $str_alt75$___GENERATE_KSI__S___Generating__ = makeString("~%(GENERATE-KSI ~S): Generating ~S.");

    static private final SubLList $list_alt76 = list(list(makeSymbol("NEW-KSI"), list(makeSymbol("GENERATE-KSI"), makeSymbol("SUPER"))), list(makeSymbol("NEW-ACTIVATION-PATTERN"), list(makeSymbol("FIF"), makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ACTIVATION-PATTERN"), list(QUOTE, makeSymbol("CLONE"))), NIL)));





    static private final SubLList $list_alt79 = list(makeSymbol("NEW-KSI"), makeSymbol("NEW-ACTIVATION-PATTERN"));

    static private final SubLList $list_alt80 = list(list(RET, makeSymbol("NEW-KSI")));

    static private final SubLList $list_alt81 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("POSTING"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KSI"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-PROPOSAL"), list(makeSymbol("ACTIVATION-PATTERN"), makeSymbol("&OPTIONAL"), list(makeSymbol("ARG-IF-ON-STARTUP"), NIL)), makeKeyword("PROTECTED")));

    static private final SubLList $list_alt82 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));









    static private final SubLList $list_alt87 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("POSTING"), NIL)), list(makeSymbol("FORMAT"), T, makeString("~%(STIMULATE ~S): Stimulating through posting ~S."), makeSymbol("SELF"), makeSymbol("POSTING")), list(RET, list(makeSymbol("STIMULATE"), makeSymbol("SUPER"))));

    static private final SubLList $list_alt88 = list(makeSymbol("PROPOSAL"));

    static private final SubLList $list_alt89 = list(makeSymbol("IGNORE"), makeSymbol("PROPOSAL"));





    static private final SubLList $list_alt92 = list(list(makeSymbol("LINK-KSI"), makeSymbol("SELF"), makeSymbol("KSI")), list(RET, makeSymbol("KSI")));



    static private final SubLList $list_alt94 = list(makeSymbol("ACTIVATION-PATTERN"), makeSymbol("&OPTIONAL"), list(makeSymbol("ARG-IF-ON-STARTUP"), NIL));



    static private final SubLString $str_alt96$_______Calling__CREATE_PROPOSAL__ = makeString("~%**** Calling (CREATE-PROPOSAL ~S) ****");

    static private final SubLList $list_alt97 = list(makeSymbol("PUNLESS"), makeSymbol("ACTIVATION-PATTERN"), list(RET, NIL));

    static private final SubLList $list_alt98 = list(makeSymbol("CREATE-PROPOSAL"), makeSymbol("SUPER"), makeSymbol("ACTIVATION-PATTERN"), makeSymbol("ARG-IF-ON-STARTUP"));





    static private final SubLList $list_alt101 = list(makeSymbol("NEW-PROPOSAL"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")));

    static private final SubLList $list_alt102 = list(makeSymbol("NEW-PROPOSAL"), makeSymbol("ACTIVATION-PATTERN"));



    static private final SubLList $list_alt104 = list(list(makeSymbol("DICTIONARY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("CYBLACK-BASIC-APPLICATION")), makeSymbol("APP"))));



    static private final SubLList $list_alt106 = list(list(makeSymbol("NEW-CONTRIBUTIONS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-BAG")), list(QUOTE, makeSymbol("BASIC-BAG")))));



    private static final SubLSymbol RESULT_DATATYPE = makeSymbol("RESULT-DATATYPE");

    static private final SubLList $list_alt109 = list(list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-BAG")), makeSymbol("NEW-CONTRIBUTIONS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INTERN"), makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY")), makeSymbol("DICTIONARY"), makeSymbol("RESULT-DATATYPE"))));

    static private final SubLList $list_alt110 = list(makeSymbol("NEW-PROPOSAL"), makeSymbol("NEW-CONTRIBUTIONS"));



    static private final SubLList $list_alt112 = list(makeSymbol("NEW-PROPOSAL"), list(makeSymbol("GET-UNIVERSAL-TIME")));

    static private final SubLList $list_alt113 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-PROPOSAL"), list(QUOTE, makeSymbol("SET-KNOWLEDGE-SOURCE")), makeSymbol("SELF")), list(RET, makeSymbol("NEW-PROPOSAL")));

    static private final SubLList $list_alt114 = list(makeSymbol("POSTING-TYPE"));



    static private final SubLList $list_alt116 = list(list(QUOTE, makeSymbol("NEW")));

    static private final SubLList $list_alt117 = list(makeSymbol("POSTING"), makeSymbol("POSTING-TYPE"), makeSymbol("DATATYPE-NAME"), makeSymbol("APP"), makeSymbol("&REST"), makeSymbol("SLOT-NAME-VALUE-PAIRS"));

    static private final SubLList $list_alt118 = list(makeSymbol("SLOT-NAME"), makeSymbol("SLOT-VALUE"));



    static private final SubLSymbol $sym120$DATATYPE = makeUninternedSymbol("DATATYPE");

    static private final SubLList $list_alt121 = list(makeSymbol("INTERN"), makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY"));

    static private final SubLList $list_alt122 = list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("CYBLACK-BASIC-APPLICATION"));



    static private final SubLString $str_alt124$post_posting__not_blackboard_foun = makeString("post-posting: not blackboard found for app ~A");

    static private final SubLList $list_alt125 = list(makeSymbol("POSTING-TYPE"), makeSymbol("DATATYPE-NAME"), makeSymbol("APP"), makeSymbol("&REST"), makeSymbol("SLOT-NAME-VALUE-PAIRS"));

    static private final SubLSymbol $sym126$POSTING = makeUninternedSymbol("POSTING");

    private static final SubLSymbol MAKE_POSTING = makeSymbol("MAKE-POSTING");

    private static final SubLSymbol POPULATE_POSTING = makeSymbol("POPULATE-POSTING");

    private static final SubLSymbol POST_POSTING = makeSymbol("POST-POSTING");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_ks_tools_file();
    }

    public void initializeVariables() {
        init_cyblack_ks_tools_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_ks_tools_file();
    }
}

