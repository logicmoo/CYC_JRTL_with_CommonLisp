/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_dollar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numNE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UserIO;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KE-FILE
 * source file: /cyc/top/cycl/ke-file.lisp
 * created:     2019/07/03 17:37:49
 */
public final class ke_file extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new ke_file();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ke_action_dispatch_table$ = makeSymbol("*KE-ACTION-DISPATCH-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ke_state_defaults$ = makeSymbol("*KE-STATE-DEFAULTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ke_file_reserved_words$ = makeSymbol("*KE-FILE-RESERVED-WORDS*");

    static private final SubLList $list1 = list(cons(makeKeyword("TV"), makeKeyword("UNKNOWN")), cons(makeKeyword("DIRECTION"), makeKeyword("UNKNOWN")), cons($MODE, makeKeyword("ENTER")), cons(makeKeyword("APPLICATION"), makeKeyword("KE-FILE")));

    static private final SubLList $list2 = list(new SubLObject[]{ makeString("EL"), makeString("F"), makeString("nil"), makeString("t"), makeString("Unit"), makeString("Constant"), makeString("Access"), makeString("Level"), makeString("AL"), makeString("Direction"), makeString("D"), makeString("In"), makeString("Mt"), makeString("forward"), makeString(":forward"), makeString("backward"), makeString(":backward"), makeString("code"), makeString(":code"), makeString("default"), makeString(":default"), makeString("monotonic"), makeString(":monotonic"), makeString("unknown"), makeString(":unknown"), makeString("TV"), makeString("Truth"), makeString("Value"), makeString("enter"), makeString("delete"), makeString("rename"), makeString("kill") });

    static private final SubLList $list4 = list(makeKeyword("COMPOSE-HISTORY"));

    static private final SubLString $str6$___s____s = makeString("~%~s : ~s");

    static private final SubLList $list7 = list(new SubLObject[]{ cons(makeSymbol("CONSTANT-DIR?"), makeSymbol("SET-CONSTANT")), cons(makeSymbol("MT-DIR?"), makeSymbol("SET-MT")), cons(makeSymbol("DEFAULT-MT-DIR?"), makeSymbol("SET-DEFAULT-MT")), cons(makeSymbol("EL-DIR?"), makeSymbol("HANDLE-EL-EXPR")), cons(makeSymbol("TV-DIR?"), makeSymbol("SET-TV")), cons(makeSymbol("DIRECTION-DIR?"), makeSymbol("SET-DIRECTION")), cons(makeSymbol("MODE-DIR?"), makeSymbol("SET-MODE")), cons(makeSymbol("RENAME-DIR?"), makeSymbol("HANDLE-RENAME")), cons(makeSymbol("KILL-DIR?"), makeSymbol("HANDLE-KILL")), cons(makeSymbol("PROBABLY-UNARY?"), makeSymbol("HANDLE-PROBABLY-UNARY")), cons(makeSymbol("PROBABLY-NON-UNARY?"), makeSymbol("HANDLE-PROBABLY-NON-UNARY")), cons(makeSymbol("GIVE-UP?"), makeSymbol("HANDLE-PROBLEM")) });

    static private final SubLString $str11$_____ = makeString(" #$()");

    private static final SubLSymbol EXCEPT_KE_CHARS = makeSymbol("EXCEPT-KE-CHARS");

    static private final SubLList $list13 = list(CHAR_colon, CHAR_quote, CHAR_quotation, CHAR_period);

    static private final SubLString $str14$_ = makeString(";");

    static private final SubLList $list15 = list(TEN_INTEGER, THIRTEEN_INTEGER);

    static private final SubLList $list16 = list(CHAR_space, CHAR_tab);

    static private final SubLList $list17 = list(CHAR_space, CHAR_tab, CHAR_period);

    static private final SubLList $list19 = list(CHAR_space);







    static private final SubLString $str25$_ = makeString(":");

    static private final SubLList $list26 = list(makeString("rename"), makeString(":rename"));

    static private final SubLString $str27$_ = makeString("\"");

    static private final SubLList $list28 = list(makeString("enter"), makeString("delete"));

    static private final SubLList $list29 = list(makeString("EL"), makeString("F"));

    static private final SubLList $list30 = list(makeString("(implies "), makeString("(and "), makeString("(thereExist"), makeString("(or "));

    static private final SubLList $list31 = list(makeString("EL"), makeString("F"), makeString("english"), makeString("comment"), makeString("future"), makeString("cyclistNotes"), makeString("ist"), makeString("informStatement"));

    static private final SubLString $str32$__ = makeString("~%");

    private static final SubLSymbol $OK_TOKEN_FORMS = makeKeyword("OK-TOKEN-FORMS");

    static private final SubLString $str36$___s_token_strings_loaded_ = makeString("~%~s token strings loaded.");

    static private final SubLString $str37$___s_token_strings_processed_ = makeString("~%~s token strings processed.");

    static private final SubLString $str38$_____s_is_not_a_stream_or_a_strin = makeString("~%~%~s is not a stream or a string.");

    static private final SubLString $str40$____Processing_token_strings____ = makeString("~%~%Processing token strings ...");

    static private final SubLString $str42$__Malformed_token_list___s = makeString("~%Malformed token list: ~s");

    static private final SubLList $list43 = list(makeString("unit"), makeString("constant"));

    static private final SubLList $list44 = list(makeString("rename"));

    static private final SubLList $list45 = list(makeString("delete"), makeString("enter"));

    static private final SubLList $list46 = list(makeString("kill"));

    static private final SubLString $$$in = makeString("in");

    static private final SubLString $$$mt = makeString("mt");

    static private final SubLString $$$default = makeString("default");

    static private final SubLList $list50 = list(makeString("el"), makeString("f"));

    static private final SubLString $$$truth = makeString("truth");

    static private final SubLString $$$value = makeString("value");

    static private final SubLList $list53 = list(makeString(":default"), makeString("default"), makeString(":monotonic"), makeString("monotonic"), makeString(":unknown"), makeString("unknown"));

    static private final SubLString $$$tv = makeString("tv");

    static private final SubLList $list55 = list(makeString("al"), makeString("direction"), makeString("d"));

    static private final SubLString $$$access = makeString("access");

    static private final SubLString $$$level = makeString("level");

    static private final SubLList $list58 = list(new SubLObject[]{ makeString("unit"), makeString("in"), makeString("el"), makeString("f"), makeString("access"), makeString("al"), makeString("constant"), makeString("d"), makeString("direction"), makeString("tv"), makeString("truth"), makeString("enter"), makeString("delete"), makeString("kill"), makeString("rename") });

    static private final SubLList $list64 = list(makeString(":default"), makeString("default"));

    static private final SubLList $list66 = list(makeString(":monotonic"), makeString("monotonic"));

    static private final SubLList $list68 = list(makeString(":unknown"), makeString("unknown"));

    static private final SubLList $list69 = list(makeString(":forward"), makeString("forward"), makeString("0"));

    static private final SubLList $list71 = list(makeString(":backward"), makeString("backward"), makeString("4"));

    static private final SubLList $list73 = list(makeString(":code"), makeString("code"));

    static private final SubLString $$$enter = makeString("enter");

    static private final SubLString $$$delete = makeString("delete");





    private static final SubLSymbol $ALREADY_IN_KB = makeKeyword("ALREADY-IN-KB");

    private static final SubLSymbol $FORMS_TO_EVAL = makeKeyword("FORMS-TO-EVAL");

    private static final SubLSymbol KE_ASSERT = makeSymbol("KE-ASSERT");

    private static final SubLSymbol KE_UNASSERT = makeSymbol("KE-UNASSERT");

    private static final SubLSymbol KE_BLAST = makeSymbol("KE-BLAST");

    static private final SubLList $list89 = list(makeKeyword("LOCAL"), makeKeyword("REMOTE"));

    private static final SubLSymbol $NOT_IN_KB = makeKeyword("NOT-IN-KB");



    private static final SubLSymbol KE_RENAME = makeSymbol("KE-RENAME");

    private static final SubLSymbol KE_KILL = makeSymbol("KE-KILL");

    private static final SubLSymbol $NOT_VALID_CONSTANTS = makeKeyword("NOT-VALID-CONSTANTS");

    static private final SubLString $str98$___a_s = makeString("~%~a~s");

    static private final SubLString $str99$_____a_s = makeString("~%~%~a~s");

    static private final SubLList $list100 = list(makeKeyword("ALREADY-IN-KB"), makeKeyword("MALFORMED"), makeKeyword("FORMS-TO-EVAL"), makeKeyword("NOT-IN-KB"), makeKeyword("NOT-VALID-CONSTANTS"), makeKeyword("ALREADY-CONSTANTS"));

    static private final SubLString $str101$_________________________________ = makeString("~%~%-------------------------------------------------------");

    static private final SubLString $str102$____ = makeString("~%~%");

    static private final SubLString $str103$_______s_in__s = makeString("~%~%  ~s in ~s");

    static private final SubLString $str104$_______s_is_not_in__s = makeString("~%~%  ~s is not in ~s");

    static private final SubLString $str105$____New_forms_to_evaluate_ = makeString("~%~%New forms to evaluate:");

    static private final SubLString $str107$__Evaluate_the_form_above_now__ = makeString("~%Evaluate the form above now? ");

    static private final SubLString $str108$__Evaluate_the__s_forms_above_now = makeString("~%Evaluate the ~s forms above now? ");

    static private final SubLString $str109$__One_form_evaluated_ = makeString("~%One form evaluated.");

    static private final SubLString $str110$___s_forms_evaluated_ = makeString("~%~s forms evaluated.");

    static private final SubLString $str111$____Please_check_the_input_file__ = makeString("~%~%Please check the input file.~%Some expressions cannot be coerced into CycL.~%Some of these token lists may be malformed:");

    static private final SubLString $str112$These_assertions_are_already_in_t = makeString("These assertions are already in the KB:");

    static private final SubLString $str113$These_assertions_are_not_in_the_K = makeString("These assertions are not in the KB.~%They cannot be deleted:");

    static private final SubLString $str114$These_strings_are_not_names_of_va = makeString("These strings are not names of valid constants.~%They cannot be killed:");

    static private final SubLString $str115$These_strings_are_already_the_nam = makeString("These strings are already the names of constants.~%They cannot be used for renaming:");

    static private final SubLString $str116$____Returning_to_Lisp_Interactor_ = makeString("~%~%Returning to Lisp Interactor.");

    static private final SubLString $str118$____Waiting_for_create_operations = makeString("~%~%Waiting for create operations to be processed...~%Do you want to try to continue now? ");

    static private final SubLString $str119$____Problem_loading_file__s_ = makeString("~%~%Problem loading file ~s.");

    static private final SubLString $str120$____The_file_contains_fatal_synta = makeString("~%~%The file contains fatal syntax errors, or~%cannot be located by the pathname given.");

    static private final SubLString $str121$____Please_check_the_input_file_f = makeString("~%~%Please check the input file for missing parens or periods,~%wrong number of arguments, etc.~%~%These token lists are malformed:");

    static private final SubLString $str122$____Unknown_constants__or_constan = makeString("~%~%Unknown constants, or constants missing ids:~%");

    static private final SubLString $str123$____Make_Cyc_constants_of_the_str = makeString("~%~%Make Cyc constants of the strings listed above? ");

    static private final SubLString $str124$__OK___Be_sure_to_give_new_consta = makeString("~%OK.  Be sure to give new constants an #$isa.~%Be sure to give new collections a #$genls.~%Be sure to give new microtheories a #$genlMt.");

    static private final SubLString $str126$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str127$__Sorry___s_is_not_known_to_be_a_ = makeString("~%Sorry, ~s is not known to be a Cyclist.");

    public static final SubLObject make_ke_state_vector_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return misc_utilities.make_indexed_vector(ke_utilities.$ke_state_keys$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject make_ke_state_vector() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return misc_utilities.make_indexed_vector(ke_utilities.$ke_state_keys$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * Returns the vector that contains the ke state information
     * for cyclist.  The vectors are contained in
     * the table (a-list) bound to *ke-state*
     */
    @LispMethod(comment = "Returns the vector that contains the ke state information\r\nfor cyclist.  The vectors are contained in\r\nthe table (a-list) bound to *ke-state*\nReturns the vector that contains the ke state information\nfor cyclist.  The vectors are contained in\nthe table (a-list) bound to *ke-state*")
    public static final SubLObject get_ke_state_alt(SubLObject cyclist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user = (cyclist.isString()) ? ((SubLObject) (fi.fi_find_int(cyclist))) : cyclist;
                return misc_utilities.get_indexed_obj(user, ke_utilities.$ke_state$.getDynamicValue(thread), UNPROVIDED);
            }
        }
    }

    /**
     * Returns the vector that contains the ke state information
     * for cyclist.  The vectors are contained in
     * the table (a-list) bound to *ke-state*
     */
    @LispMethod(comment = "Returns the vector that contains the ke state information\r\nfor cyclist.  The vectors are contained in\r\nthe table (a-list) bound to *ke-state*\nReturns the vector that contains the ke state information\nfor cyclist.  The vectors are contained in\nthe table (a-list) bound to *ke-state*")
    public static SubLObject get_ke_state(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user = (cyclist.isString()) ? fi.fi_find_int(cyclist) : cyclist;
        return misc_utilities.get_indexed_obj(user, ke_utilities.$ke_state$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * Adds a ke state vector for cyclist to *ke-state*
     * if one is not already present.
     */
    @LispMethod(comment = "Adds a ke state vector for cyclist to *ke-state*\r\nif one is not already present.\nAdds a ke state vector for cyclist to *ke-state*\nif one is not already present.")
    public static final SubLObject add_ke_vector_alt(SubLObject cyclist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vec = com.cyc.cycjava.cycl.ke_file.get_ke_state(cyclist);
                if (vec.isVector() && (NIL != numNE(length(ke_utilities.$ke_state_keys$.getDynamicValue(thread)), length(vec)))) {
                    ke_utilities.$ke_state$.setDynamicValue(remove(cyclist, ke_utilities.$ke_state$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    vec = com.cyc.cycjava.cycl.ke_file.make_ke_state_vector();
                    ke_utilities.$ke_state$.setDynamicValue(cons(cons(cyclist, vec), ke_utilities.$ke_state$.getDynamicValue(thread)), thread);
                } else {
                    if (NIL == vec) {
                        vec = com.cyc.cycjava.cycl.ke_file.make_ke_state_vector();
                        ke_utilities.$ke_state$.setDynamicValue(cons(cons(cyclist, vec), ke_utilities.$ke_state$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return com.cyc.cycjava.cycl.ke_file.reset_ke_state(cyclist);
        }
    }

    /**
     * Adds a ke state vector for cyclist to *ke-state*
     * if one is not already present.
     */
    @LispMethod(comment = "Adds a ke state vector for cyclist to *ke-state*\r\nif one is not already present.\nAdds a ke state vector for cyclist to *ke-state*\nif one is not already present.")
    public static SubLObject add_ke_vector(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vec = get_ke_state(cyclist);
        if (vec.isVector() && (NIL != numNE(length(ke_utilities.$ke_state_keys$.getDynamicValue(thread)), length(vec)))) {
            ke_utilities.$ke_state$.setDynamicValue(remove(cyclist, ke_utilities.$ke_state$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            vec = make_ke_state_vector();
            ke_utilities.$ke_state$.setDynamicValue(cons(cons(cyclist, vec), ke_utilities.$ke_state$.getDynamicValue(thread)), thread);
        } else
            if (NIL == vec) {
                vec = make_ke_state_vector();
                ke_utilities.$ke_state$.setDynamicValue(cons(cons(cyclist, vec), ke_utilities.$ke_state$.getDynamicValue(thread)), thread);
            }

        return reset_ke_state(cyclist);
    }

    /**
     * called only from html-ke-file
     */
    @LispMethod(comment = "called only from html-ke-file")
    public static final SubLObject reset_ke_state_alt(SubLObject cyclist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = ke_utilities.$ke_state_keys$.getDynamicValue(thread);
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject key = pair.first();
                        SubLObject v_default = assoc(key, $ke_state_defaults$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                        if (NIL == subl_promotions.memberP(key, $list_alt4, UNPROVIDED, UNPROVIDED)) {
                            ke_utilities.change_ke_value(cyclist, key, $REPLACE, v_default);
                        }
                    }
                }
            }
            return com.cyc.cycjava.cycl.ke_file.get_ke_state(cyclist);
        }
    }

    /**
     * called only from html-ke-file
     */
    @LispMethod(comment = "called only from html-ke-file")
    public static SubLObject reset_ke_state(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = ke_utilities.$ke_state_keys$.getDynamicValue(thread);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key = pair.first();
            final SubLObject v_default = assoc(key, $ke_state_defaults$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
            if (NIL == subl_promotions.memberP(key, $list4, UNPROVIDED, UNPROVIDED)) {
                ke_utilities.change_ke_value(cyclist, key, $REPLACE, v_default);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return get_ke_state(cyclist);
    }

    public static final SubLObject return_ke_state_alt(SubLObject cyclist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(CAR), ke_utilities.$ke_state_keys$.getDynamicValue(thread));
                SubLObject key = NIL;
                for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                    ans = cons(list(key, ke_utilities.ke_value(cyclist, key)), ans);
                }
                return reverse(ans);
            }
        }
    }

    public static SubLObject return_ke_state(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(CAR), ke_utilities.$ke_state_keys$.getDynamicValue(thread));
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(list(key, ke_utilities.ke_value(cyclist, key)), ans);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    public static final SubLObject print_ke_state_alt(SubLObject cyclist) {
        {
            SubLObject result = com.cyc.cycjava.cycl.ke_file.return_ke_state(cyclist);
            if (result.isCons()) {
                {
                    SubLObject cdolist_list_var = result;
                    SubLObject x = NIL;
                    for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                        format(T, $str_alt6$___s____s, x.first(), second(x));
                    }
                }
            } else {
                print(result, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject print_ke_state(final SubLObject cyclist) {
        final SubLObject result = return_ke_state(cyclist);
        if (result.isCons()) {
            SubLObject cdolist_list_var = result;
            SubLObject x = NIL;
            x = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str6$___s____s, x.first(), second(x));
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            } 
        } else {
            print(result, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Reset (clear) ke state info for keys in key-list, else
     * for all keys except exception-list, else for all keys
     * in *ke-state-keys*
     */
    @LispMethod(comment = "Reset (clear) ke state info for keys in key-list, else\r\nfor all keys except exception-list, else for all keys\r\nin *ke-state-keys*\nReset (clear) ke state info for keys in key-list, else\nfor all keys except exception-list, else for all keys\nin *ke-state-keys*")
    public static final SubLObject clear_ke_state_alt(SubLObject cyclist, SubLObject key_list, SubLObject exception_list) {
        if (key_list == UNPROVIDED) {
            key_list = NIL;
        }
        if (exception_list == UNPROVIDED) {
            exception_list = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_keys = Mapping.mapcar(symbol_function(CAR), ke_utilities.$ke_state_keys$.getDynamicValue(thread));
                SubLObject keys_to_use = (NIL != key_list) ? ((SubLObject) (key_list)) : NIL != exception_list ? ((SubLObject) (set_difference(all_keys, exception_list, UNPROVIDED, UNPROVIDED))) : all_keys;
                SubLObject cdolist_list_var = keys_to_use;
                SubLObject key = NIL;
                for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                    ke_utilities.change_ke_value(cyclist, key, UNPROVIDED, UNPROVIDED);
                }
                return com.cyc.cycjava.cycl.ke_file.get_ke_state(cyclist);
            }
        }
    }

    /**
     * Reset (clear) ke state info for keys in key-list, else
     * for all keys except exception-list, else for all keys
     * in *ke-state-keys*
     */
    @LispMethod(comment = "Reset (clear) ke state info for keys in key-list, else\r\nfor all keys except exception-list, else for all keys\r\nin *ke-state-keys*\nReset (clear) ke state info for keys in key-list, else\nfor all keys except exception-list, else for all keys\nin *ke-state-keys*")
    public static SubLObject clear_ke_state(final SubLObject cyclist, SubLObject key_list, SubLObject exception_list) {
        if (key_list == UNPROVIDED) {
            key_list = NIL;
        }
        if (exception_list == UNPROVIDED) {
            exception_list = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_keys = Mapping.mapcar(symbol_function(CAR), ke_utilities.$ke_state_keys$.getDynamicValue(thread));
        SubLObject cdolist_list_var;
        final SubLObject keys_to_use = cdolist_list_var = (NIL != key_list) ? key_list : NIL != exception_list ? set_difference(all_keys, exception_list, UNPROVIDED, UNPROVIDED) : all_keys;
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ke_utilities.change_ke_value(cyclist, key, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return get_ke_state(cyclist);
    }

    /**
     * called only from html-ke-file
     */
    @LispMethod(comment = "called only from html-ke-file")
    public static final SubLObject blast_ke_state_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.ke_file.ke_set_dispatch_table();
            ke_utilities.$ke_state$.setDynamicValue(NIL, thread);
            return ke_utilities.$ke_state$.getDynamicValue(thread);
        }
    }

    /**
     * called only from html-ke-file
     */
    @LispMethod(comment = "called only from html-ke-file")
    public static SubLObject blast_ke_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ke_set_dispatch_table();
        ke_utilities.$ke_state$.setDynamicValue(NIL, thread);
        return ke_utilities.$ke_state$.getDynamicValue(thread);
    }

    /**
     * called only from html-ke-file
     */
    @LispMethod(comment = "called only from html-ke-file")
    public static final SubLObject ke_init_alt(SubLObject cyclist) {
        com.cyc.cycjava.cycl.ke_file.add_ke_vector(cyclist);
        com.cyc.cycjava.cycl.ke_file.clear_ke_state(cyclist, NIL, $list_alt4);
        com.cyc.cycjava.cycl.ke_file.reset_ke_state(cyclist);
        com.cyc.cycjava.cycl.ke_file.ke_set_dispatch_table();
        return com.cyc.cycjava.cycl.ke_file.get_ke_state(cyclist);
    }

    /**
     * called only from html-ke-file
     */
    @LispMethod(comment = "called only from html-ke-file")
    public static SubLObject ke_init(final SubLObject cyclist) {
        add_ke_vector(cyclist);
        clear_ke_state(cyclist, NIL, $list4);
        reset_ke_state(cyclist);
        ke_set_dispatch_table();
        return get_ke_state(cyclist);
    }

    /**
     * This procedure constructs the dispatch table bound
     * to *ke-action-dispatch-table*.  The predicates and
     * functions referred to in the constructed table are invoked in
     * the procedure DISPATCH-ON-TEST
     */
    @LispMethod(comment = "This procedure constructs the dispatch table bound\r\nto *ke-action-dispatch-table*.  The predicates and\r\nfunctions referred to in the constructed table are invoked in\r\nthe procedure DISPATCH-ON-TEST\nThis procedure constructs the dispatch table bound\nto *ke-action-dispatch-table*.  The predicates and\nfunctions referred to in the constructed table are invoked in\nthe procedure DISPATCH-ON-TEST")
    public static final SubLObject ke_set_dispatch_table_alt() {
        $ke_action_dispatch_table$.setDynamicValue($list_alt7);
        return NIL;
    }

    /**
     * This procedure constructs the dispatch table bound
     * to *ke-action-dispatch-table*.  The predicates and
     * functions referred to in the constructed table are invoked in
     * the procedure DISPATCH-ON-TEST
     */
    @LispMethod(comment = "This procedure constructs the dispatch table bound\r\nto *ke-action-dispatch-table*.  The predicates and\r\nfunctions referred to in the constructed table are invoked in\r\nthe procedure DISPATCH-ON-TEST\nThis procedure constructs the dispatch table bound\nto *ke-action-dispatch-table*.  The predicates and\nfunctions referred to in the constructed table are invoked in\nthe procedure DISPATCH-ON-TEST")
    public static SubLObject ke_set_dispatch_table() {
        $ke_action_dispatch_table$.setDynamicValue($list7);
        return NIL;
    }

    /**
     * This procedure calls the tests (predicates)
     * listed in *ke-action-dispatch-table*, and for the
     * first one which succeeds, calls the associated
     * result function
     */
    @LispMethod(comment = "This procedure calls the tests (predicates)\r\nlisted in *ke-action-dispatch-table*, and for the\r\nfirst one which succeeds, calls the associated\r\nresult function\nThis procedure calls the tests (predicates)\nlisted in *ke-action-dispatch-table*, and for the\nfirst one which succeeds, calls the associated\nresult function")
    public static final SubLObject dispatch_on_test_alt(SubLObject token_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table_pairs = NIL;
                SubLObject pair = NIL;
                SubLObject matchP = NIL;
                for (table_pairs = $ke_action_dispatch_table$.getDynamicValue(thread), pair = table_pairs.first(), matchP = funcall(pair.first(), token_list); NIL == matchP; table_pairs = table_pairs.rest() , pair = table_pairs.first() , matchP = funcall(pair.first(), token_list)) {
                }
                funcall(pair.rest(), token_list);
                return NIL;
            }
        }
    }

    /**
     * This procedure calls the tests (predicates)
     * listed in *ke-action-dispatch-table*, and for the
     * first one which succeeds, calls the associated
     * result function
     */
    @LispMethod(comment = "This procedure calls the tests (predicates)\r\nlisted in *ke-action-dispatch-table*, and for the\r\nfirst one which succeeds, calls the associated\r\nresult function\nThis procedure calls the tests (predicates)\nlisted in *ke-action-dispatch-table*, and for the\nfirst one which succeeds, calls the associated\nresult function")
    public static SubLObject dispatch_on_test(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table_pairs = NIL;
        SubLObject pair = NIL;
        SubLObject matchP = NIL;
        table_pairs = $ke_action_dispatch_table$.getDynamicValue(thread);
        for (pair = table_pairs.first(), matchP = funcall(pair.first(), token_list); NIL == matchP; matchP = funcall(pair.first(), token_list)) {
            table_pairs = table_pairs.rest();
            pair = table_pairs.first();
        }
        funcall(pair.rest(), token_list);
        return NIL;
    }

    public static final SubLObject ids_from_sentence_alt(SubLObject sentence, SubLObject mt) {
        if (NIL == forts.fort_p(mt)) {
            if (mt.isCons()) {
                mt = narts_high.find_nart(mt);
            }
        }
        return Mapping.mapcar(symbol_function(ASSERTION_ID), fi.sentence_assertions(sentence, mt));
    }

    public static SubLObject ids_from_sentence(final SubLObject sentence, SubLObject mt) {
        if ((NIL == forts.fort_p(mt)) && mt.isCons()) {
            mt = narts_high.find_nart(mt);
        }
        return Mapping.mapcar(symbol_function(ASSERTION_ID), fi.sentence_assertions(sentence, mt));
    }

    public static final SubLObject source_type_alt(SubLObject sentence, SubLObject mt) {
        if (NIL == forts.fort_p(mt)) {
            if (mt.isCons()) {
                mt = narts_high.find_nart(mt);
            }
        }
        {
            SubLObject assertions = fi.sentence_assertions(sentence, mt);
            SubLObject type = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                if (NIL != assertion_handles.assertion_p(ass)) {
                    if (NIL != assertions_high.asserted_assertionP(ass)) {
                        type = $LOCAL;
                    } else {
                        if (type != $LOCAL) {
                            type = $REMOTE;
                        }
                    }
                }
            }
            return type;
        }
    }

    public static SubLObject source_type(final SubLObject sentence, SubLObject mt) {
        if ((NIL == forts.fort_p(mt)) && mt.isCons()) {
            mt = narts_high.find_nart(mt);
        }
        final SubLObject assertions = fi.sentence_assertions(sentence, mt);
        SubLObject type = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.assertion_p(ass)) {
                if (NIL != assertions_high.asserted_assertionP(ass)) {
                    type = $LOCAL;
                } else
                    if (type != $LOCAL) {
                        type = $REMOTE;
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        } 
        return type;
    }

    /**
     * Returns all elements of list that are not valid Cyc constants.
     * A valid Cyc constant is a Cyc constant with a valid integer id.
     */
    @LispMethod(comment = "Returns all elements of list that are not valid Cyc constants.\r\nA valid Cyc constant is a Cyc constant with a valid integer id.\nReturns all elements of list that are not valid Cyc constants.\nA valid Cyc constant is a Cyc constant with a valid integer id.")
    public static final SubLObject filter_out_ok_constants_alt(SubLObject list) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = list;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                {
                    SubLObject constant = fi.fi_find_int(string);
                    if (NIL == constant) {
                        {
                            SubLObject item_var = string;
                            if (NIL == member(item_var, ans, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                ans = cons(item_var, ans);
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Returns all elements of list that are not valid Cyc constants.
     * A valid Cyc constant is a Cyc constant with a valid integer id.
     */
    @LispMethod(comment = "Returns all elements of list that are not valid Cyc constants.\r\nA valid Cyc constant is a Cyc constant with a valid integer id.\nReturns all elements of list that are not valid Cyc constants.\nA valid Cyc constant is a Cyc constant with a valid integer id.")
    public static SubLObject filter_out_ok_constants(final SubLObject list) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = list;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject constant = fi.fi_find_int(string);
            if (NIL == constant) {
                final SubLObject item_var = string;
                if (NIL == member(item_var, ans, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return ans;
    }

    public static final SubLObject except_ke_chars_alt(SubLObject v_char) {
        return makeBoolean(NIL == find(v_char, $str_alt11$_____, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject except_ke_chars(final SubLObject v_char) {
        return makeBoolean(NIL == find(v_char, $str11$_____, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Returns a list of all relevant constant-like subsequences of string
     * which are not known to be Cyc constants
     */
    @LispMethod(comment = "Returns a list of all relevant constant-like subsequences of string\r\nwhich are not known to be Cyc constants\nReturns a list of all relevant constant-like subsequences of string\nwhich are not known to be Cyc constants")
    public static final SubLObject get_unknown_constants_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constants = NIL;
                SubLObject words = string_utilities.break_words(string, symbol_function(EXCEPT_KE_CHARS), T);
                SubLObject cdolist_list_var = words;
                SubLObject w = NIL;
                for (w = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , w = cdolist_list_var.first()) {
                    {
                        SubLObject first_char = Strings.sublisp_char(w, ZERO_INTEGER);
                        if (!((((NIL != find(first_char, $list_alt13, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_variables.el_var_nameP(w))) || (NIL != number_utilities.number_string_p(w))) || (NIL != find(w, $ke_file_reserved_words$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                            {
                                SubLObject item_var = w;
                                if (NIL == member(item_var, constants, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    constants = cons(item_var, constants);
                                }
                            }
                        }
                    }
                }
                constants = com.cyc.cycjava.cycl.ke_file.filter_out_ok_constants(constants);
                return constants;
            }
        }
    }

    /**
     * Returns a list of all relevant constant-like subsequences of string
     * which are not known to be Cyc constants
     */
    @LispMethod(comment = "Returns a list of all relevant constant-like subsequences of string\r\nwhich are not known to be Cyc constants\nReturns a list of all relevant constant-like subsequences of string\nwhich are not known to be Cyc constants")
    public static SubLObject get_unknown_constants(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constants = NIL;
        SubLObject cdolist_list_var;
        final SubLObject words = cdolist_list_var = string_utilities.break_words(string, symbol_function(EXCEPT_KE_CHARS), T);
        SubLObject w = NIL;
        w = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject first_char = Strings.sublisp_char(w, ZERO_INTEGER);
            if ((((NIL == find(first_char, $list13, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_variables.el_var_nameP(w))) && (NIL == number_utilities.number_string_p(w))) && (NIL == find(w, $ke_file_reserved_words$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                final SubLObject item_var = w;
                if (NIL == member(item_var, constants, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    constants = cons(item_var, constants);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            w = cdolist_list_var.first();
        } 
        constants = filter_out_ok_constants(constants);
        return constants;
    }

    /**
     * Takes a string with 0 or more `;' characters.  Returns a
     * string with the commented-out section removed.  Comments
     * inside double quotes are preserved.
     */
    @LispMethod(comment = "Takes a string with 0 or more `;\' characters.  Returns a\r\nstring with the commented-out section removed.  Comments\r\ninside double quotes are preserved.\nTakes a string with 0 or more `;\' characters.  Returns a\nstring with the commented-out section removed.  Comments\ninside double quotes are preserved.")
    public static final SubLObject frob_comments_alt(SubLObject string) {
        if (NIL != string_utilities.substringP($str_alt14$_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject len = length(string);
                SubLObject inside_dqP = NIL;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(len); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject ch = aref(string, i);
                        if ((NIL == charE(ch, CHAR_semicolon)) && i.numE(subtract(len, ONE_INTEGER))) {
                            return string;
                        } else {
                            if ((NIL != charE(ch, CHAR_semicolon)) && (NIL == inside_dqP)) {
                                return subseq(string, ZERO_INTEGER, i);
                            } else {
                                if ((NIL != charE(ch, CHAR_quotation)) && (NIL == inside_dqP)) {
                                    inside_dqP = T;
                                } else {
                                    if ((NIL != charE(ch, CHAR_quotation)) && (NIL != inside_dqP)) {
                                        inside_dqP = NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return string;
        }
        return NIL;
    }

    /**
     * Takes a string with 0 or more `;' characters.  Returns a
     * string with the commented-out section removed.  Comments
     * inside double quotes are preserved.
     */
    @LispMethod(comment = "Takes a string with 0 or more `;\' characters.  Returns a\r\nstring with the commented-out section removed.  Comments\r\ninside double quotes are preserved.\nTakes a string with 0 or more `;\' characters.  Returns a\nstring with the commented-out section removed.  Comments\ninside double quotes are preserved.")
    public static SubLObject frob_comments(final SubLObject string) {
        if (NIL != string_utilities.substringP($str14$_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject len = length(string);
            SubLObject inside_dqP = NIL;
            SubLObject i;
            SubLObject ch;
            for (i = NIL, i = ZERO_INTEGER; i.numL(len); i = add(i, ONE_INTEGER)) {
                ch = aref(string, i);
                if ((NIL == charE(ch, CHAR_semicolon)) && i.numE(subtract(len, ONE_INTEGER))) {
                    return string;
                }
                if ((NIL != charE(ch, CHAR_semicolon)) && (NIL == inside_dqP)) {
                    return subseq(string, ZERO_INTEGER, i);
                }
                if ((NIL != charE(ch, CHAR_quotation)) && (NIL == inside_dqP)) {
                    inside_dqP = T;
                } else
                    if ((NIL != charE(ch, CHAR_quotation)) && (NIL != inside_dqP)) {
                        inside_dqP = NIL;
                    }

            }
            return NIL;
        }
        return string;
    }

    /**
     * Returns the number of occurrences of token (each token is a string)
     * in list.
     */
    @LispMethod(comment = "Returns the number of occurrences of token (each token is a string)\r\nin list.\nReturns the number of occurrences of token (each token is a string)\nin list.")
    public static final SubLObject count_tokens_alt(SubLObject token, SubLObject list) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = list;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                if (string.equalp(token)) {
                    count = add(count, ONE_INTEGER);
                }
            }
            return count;
        }
    }

    /**
     * Returns the number of occurrences of token (each token is a string)
     * in list.
     */
    @LispMethod(comment = "Returns the number of occurrences of token (each token is a string)\r\nin list.\nReturns the number of occurrences of token (each token is a string)\nin list.")
    public static SubLObject count_tokens(final SubLObject token, final SubLObject list) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = list;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (string.equalp(token)) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return count;
    }

    /**
     * Returns T if ch is #(, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #(, else NIL")
    public static final SubLObject lpP_alt(SubLObject ch) {
        return charE(ch, CHAR_lparen);
    }

    /**
     * Returns T if ch is #(, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #(, else NIL")
    public static SubLObject lpP(final SubLObject ch) {
        return charE(ch, CHAR_lparen);
    }

    /**
     * Returns T if ch is #), else NIL
     */
    @LispMethod(comment = "Returns T if ch is #), else NIL")
    public static final SubLObject rpP_alt(SubLObject ch) {
        return charE(ch, CHAR_rparen);
    }

    /**
     * Returns T if ch is #), else NIL
     */
    @LispMethod(comment = "Returns T if ch is #), else NIL")
    public static SubLObject rpP(final SubLObject ch) {
        return charE(ch, CHAR_rparen);
    }

    /**
     * Returns T if ch is #space, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #space, else NIL")
    public static final SubLObject spaceP_alt(SubLObject ch) {
        return charE(ch, CHAR_space);
    }

    /**
     * Returns T if ch is #space, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #space, else NIL")
    public static SubLObject spaceP(final SubLObject ch) {
        return charE(ch, CHAR_space);
    }

    /**
     * called only from html-ke-file
     */
    @LispMethod(comment = "called only from html-ke-file")
    public static final SubLObject lbrP_alt(SubLObject ch) {
        return list_utilities.sublisp_boolean(find(char_code(ch), $list_alt15, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * called only from html-ke-file
     */
    @LispMethod(comment = "called only from html-ke-file")
    public static SubLObject lbrP(final SubLObject ch) {
        return list_utilities.sublisp_boolean(find(char_code(ch), $list15, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Returns T if ch is #tab, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #tab, else NIL")
    public static final SubLObject tabP_alt(SubLObject ch) {
        return charE(ch, CHAR_tab);
    }

    /**
     * Returns T if ch is #tab, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #tab, else NIL")
    public static SubLObject tabP(final SubLObject ch) {
        return charE(ch, CHAR_tab);
    }

    /**
     * Returns T if ch is #", else NIL
     */
    @LispMethod(comment = "Returns T if ch is #\", else NIL")
    public static final SubLObject dquoteP_alt(SubLObject ch) {
        return charE(ch, CHAR_quotation);
    }

    /**
     * Returns T if ch is #", else NIL
     */
    @LispMethod(comment = "Returns T if ch is #\", else NIL")
    public static SubLObject dquoteP(final SubLObject ch) {
        return charE(ch, CHAR_quotation);
    }

    /**
     * Returns T if ch is #., else NIL
     */
    @LispMethod(comment = "Returns T if ch is #., else NIL")
    public static final SubLObject periodP_alt(SubLObject ch) {
        return charE(ch, CHAR_period);
    }

    /**
     * Returns T if ch is #., else NIL
     */
    @LispMethod(comment = "Returns T if ch is #., else NIL")
    public static SubLObject periodP(final SubLObject ch) {
        return charE(ch, CHAR_period);
    }

    /**
     * Returns T if ch is #;, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #;, else NIL")
    public static final SubLObject semiP_alt(SubLObject ch) {
        return charE(ch, CHAR_semicolon);
    }

    /**
     * Returns T if ch is #;, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #;, else NIL")
    public static SubLObject semiP(final SubLObject ch) {
        return charE(ch, CHAR_semicolon);
    }

    /**
     * Returns T if ch is #:, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #:, else NIL")
    public static final SubLObject colonP_alt(SubLObject ch) {
        return charE(ch, CHAR_colon);
    }

    /**
     * Returns T if ch is #:, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #:, else NIL")
    public static SubLObject colonP(final SubLObject ch) {
        return charE(ch, CHAR_colon);
    }

    /**
     * Returns T if ch is #$, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #$, else NIL")
    public static final SubLObject dol_signP_alt(SubLObject ch) {
        return charE(ch, CHAR_dollar);
    }

    /**
     * Returns T if ch is #$, else NIL
     */
    @LispMethod(comment = "Returns T if ch is #$, else NIL")
    public static SubLObject dol_signP(final SubLObject ch) {
        return charE(ch, CHAR_dollar);
    }

    public static final SubLObject whitespace_char_p_alt(SubLObject ch) {
        return makeBoolean((NIL != find(ch, $list_alt16, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == ke_utilities.printable_ascii_charP(ch)));
    }

    public static SubLObject whitespace_char_p(final SubLObject ch) {
        return makeBoolean((NIL != find(ch, $list16, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == ke_utilities.printable_ascii_charP(ch)));
    }

    /**
     * Converts a ke-region input string into a list of token strings and returns the list.
     *
     * @unknown !!! Please use @xref string-tokenize instead of this function.  There are ke-text specific hacks in this function and it's not nearly as general as @xref string-tokenize !!!
     */
    @LispMethod(comment = "Converts a ke-region input string into a list of token strings and returns the list.\r\n\r\n@unknown !!! Please use @xref string-tokenize instead of this function.  There are ke-text specific hacks in this function and it\'s not nearly as general as @xref string-tokenize !!!")
    public static final SubLObject ke_file_tokenize_string_alt(SubLObject string) {
        if (NIL == string_utilities.non_empty_stringP(string)) {
            return NIL;
        }
        string = Strings.string_trim($list_alt17, string);
        {
            SubLObject token_list = NIL;
            SubLObject inside_dqP = NIL;
            SubLObject p1 = ZERO_INTEGER;
            SubLObject len = length(string);
            SubLObject lps = ZERO_INTEGER;
            SubLObject rps = ZERO_INTEGER;
            SubLObject p2 = NIL;
            for (p2 = ZERO_INTEGER; p2.numL(len); p2 = add(p2, ONE_INTEGER)) {
                {
                    SubLObject ch1 = Strings.sublisp_char(string, p1);
                    SubLObject ch2 = Strings.sublisp_char(string, p2);
                    SubLObject p3 = (p2.numL(subtract(len, ONE_INTEGER))) ? ((SubLObject) (add(p2, ONE_INTEGER))) : NIL;
                    SubLObject ch3 = (NIL != p3) ? ((SubLObject) (Strings.sublisp_char(string, p3))) : NIL;
                    if (NIL == inside_dqP) {
                        if (NIL != com.cyc.cycjava.cycl.ke_file.lpP(ch2)) {
                            lps = add(lps, ONE_INTEGER);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.ke_file.rpP(ch2)) {
                                rps = add(rps, ONE_INTEGER);
                            }
                        }
                    }
                    if ((p2.numE(subtract(len, ONE_INTEGER)) && p2.numGE(p1)) && (NIL == com.cyc.cycjava.cycl.ke_file.spaceP(ch2))) {
                        token_list = cons(subseq(string, p1, len), token_list);
                    } else {
                        if ((NIL != com.cyc.cycjava.cycl.ke_file.spaceP(ch1)) && (NIL != com.cyc.cycjava.cycl.ke_file.spaceP(ch2))) {
                            p1 = add(p2, ONE_INTEGER);
                        } else {
                            if (((NIL != com.cyc.cycjava.cycl.ke_file.spaceP(ch2)) && lps.numE(rps)) && (NIL == inside_dqP)) {
                                token_list = cons(subseq(string, p1, p2), token_list);
                                p1 = add(p2, ONE_INTEGER);
                            } else {
                                if ((((NIL != com.cyc.cycjava.cycl.ke_file.colonP(ch2)) && (NIL != com.cyc.cycjava.cycl.ke_file.whitespace_char_p(ch3))) && p2.numG(p1)) && (NIL == inside_dqP)) {
                                    token_list = cons(subseq(string, p1, p2), token_list);
                                    p1 = p2;
                                } else {
                                    if ((((NIL != com.cyc.cycjava.cycl.ke_file.colonP(ch1)) && (NIL != com.cyc.cycjava.cycl.ke_file.whitespace_char_p(ch3))) && p2.numG(p1)) && (NIL == inside_dqP)) {
                                        token_list = cons(subseq(string, p1, p2), token_list);
                                        p1 = p2;
                                    } else {
                                        if ((NIL != com.cyc.cycjava.cycl.ke_file.rpP(ch2)) && (NIL == inside_dqP)) {
                                            if (lps.numE(rps)) {
                                                token_list = cons(subseq(string, p1, add(p2, ONE_INTEGER)), token_list);
                                                p1 = add(p2, ONE_INTEGER);
                                            }
                                        } else {
                                            if ((NIL != com.cyc.cycjava.cycl.ke_file.dquoteP(ch2)) && (NIL != inside_dqP)) {
                                                inside_dqP = NIL;
                                                if (lps.numE(rps)) {
                                                    token_list = cons(subseq(string, p1, add(p2, ONE_INTEGER)), token_list);
                                                    p1 = add(p2, ONE_INTEGER);
                                                }
                                            } else {
                                                if (NIL != com.cyc.cycjava.cycl.ke_file.dquoteP(ch2)) {
                                                    inside_dqP = T;
                                                    if (p2.numG(p1) && lps.numE(rps)) {
                                                        token_list = cons(subseq(string, p1, p2), token_list);
                                                        p1 = p2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(token_list);
        }
    }

    /**
     * Converts a ke-region input string into a list of token strings and returns the list.
     *
     * @unknown !!! Please use @xref string-tokenize instead of this function.  There are ke-text specific hacks in this function and it's not nearly as general as @xref string-tokenize !!!
     */
    @LispMethod(comment = "Converts a ke-region input string into a list of token strings and returns the list.\r\n\r\n@unknown !!! Please use @xref string-tokenize instead of this function.  There are ke-text specific hacks in this function and it\'s not nearly as general as @xref string-tokenize !!!")
    public static SubLObject ke_file_tokenize_string(SubLObject string) {
        if (NIL == string_utilities.non_empty_stringP(string)) {
            return NIL;
        }
        string = Strings.string_trim($list17, string);
        SubLObject token_list = NIL;
        SubLObject inside_dqP = NIL;
        SubLObject p1 = ZERO_INTEGER;
        final SubLObject len = length(string);
        SubLObject lps = ZERO_INTEGER;
        SubLObject rps = ZERO_INTEGER;
        SubLObject p2;
        SubLObject ch1;
        SubLObject ch2;
        SubLObject p3;
        SubLObject ch3;
        for (p2 = NIL, p2 = ZERO_INTEGER; p2.numL(len); p2 = add(p2, ONE_INTEGER)) {
            ch1 = Strings.sublisp_char(string, p1);
            ch2 = Strings.sublisp_char(string, p2);
            p3 = (p2.numL(subtract(len, ONE_INTEGER))) ? add(p2, ONE_INTEGER) : NIL;
            ch3 = (NIL != p3) ? Strings.sublisp_char(string, p3) : NIL;
            if (NIL == inside_dqP) {
                if (NIL != lpP(ch2)) {
                    lps = add(lps, ONE_INTEGER);
                } else
                    if (NIL != rpP(ch2)) {
                        rps = add(rps, ONE_INTEGER);
                    }

            }
            if ((p2.numE(subtract(len, ONE_INTEGER)) && p2.numGE(p1)) && (NIL == spaceP(ch2))) {
                token_list = cons(subseq(string, p1, len), token_list);
            } else
                if ((NIL != spaceP(ch1)) && (NIL != spaceP(ch2))) {
                    p1 = add(p2, ONE_INTEGER);
                } else
                    if (((NIL != spaceP(ch2)) && lps.numE(rps)) && (NIL == inside_dqP)) {
                        token_list = cons(subseq(string, p1, p2), token_list);
                        p1 = add(p2, ONE_INTEGER);
                    } else
                        if ((((NIL != colonP(ch2)) && (NIL != whitespace_char_p(ch3))) && p2.numG(p1)) && (NIL == inside_dqP)) {
                            token_list = cons(subseq(string, p1, p2), token_list);
                            p1 = p2;
                        } else
                            if ((((NIL != colonP(ch1)) && (NIL != whitespace_char_p(ch3))) && p2.numG(p1)) && (NIL == inside_dqP)) {
                                token_list = cons(subseq(string, p1, p2), token_list);
                                p1 = p2;
                            } else
                                if ((NIL != rpP(ch2)) && (NIL == inside_dqP)) {
                                    if (lps.numE(rps)) {
                                        token_list = cons(subseq(string, p1, add(p2, ONE_INTEGER)), token_list);
                                        p1 = add(p2, ONE_INTEGER);
                                    }
                                } else
                                    if ((NIL != dquoteP(ch2)) && (NIL != inside_dqP)) {
                                        inside_dqP = NIL;
                                        if (lps.numE(rps)) {
                                            token_list = cons(subseq(string, p1, add(p2, ONE_INTEGER)), token_list);
                                            p1 = add(p2, ONE_INTEGER);
                                        }
                                    } else
                                        if (NIL != dquoteP(ch2)) {
                                            inside_dqP = T;
                                            if (p2.numG(p1) && lps.numE(rps)) {
                                                token_list = cons(subseq(string, p1, p2), token_list);
                                                p1 = p2;
                                            }
                                        }







        }
        return nreverse(token_list);
    }

    /**
     * Read one ke-region expression and return a listed string.
     * A ke-region expression ends with a period outside a double-quote.
     * If no ke-region expressions are present, return NIL.
     */
    @LispMethod(comment = "Read one ke-region expression and return a listed string.\r\nA ke-region expression ends with a period outside a double-quote.\r\nIf no ke-region expressions are present, return NIL.\nRead one ke-region expression and return a listed string.\nA ke-region expression ends with a period outside a double-quote.\nIf no ke-region expressions are present, return NIL.")
    public static final SubLObject ke_read_from_stream_alt(SubLObject stream) {
        {
            SubLObject temp = NIL;
            SubLObject inside_dqP = NIL;
            SubLObject inside_commentP = NIL;
            SubLObject lps = ZERO_INTEGER;
            SubLObject rps = ZERO_INTEGER;
            SubLObject ch = NIL;
            for (ch = read_char(stream, NIL, $EOF, UNPROVIDED); !(((ch == $EOF) || (NIL == ch)) || ((((NIL != charE(ch, CHAR_period)) && (NIL != set_difference(temp, $list_alt19, UNPROVIDED, UNPROVIDED))) && lps.numE(rps)) && (!((NIL != inside_dqP) || (NIL != inside_commentP))))); ch = read_char(stream, NIL, $EOF, UNPROVIDED)) {
                if ((NIL != com.cyc.cycjava.cycl.ke_file.semiP(ch)) && (NIL == inside_dqP)) {
                    inside_commentP = T;
                } else {
                    if ((NIL != inside_commentP) && (NIL != com.cyc.cycjava.cycl.ke_file.lbrP(ch))) {
                        inside_commentP = NIL;
                    } else {
                        if (NIL == inside_commentP) {
                            if ((NIL != com.cyc.cycjava.cycl.ke_file.dquoteP(ch)) && (NIL != inside_dqP)) {
                                inside_dqP = NIL;
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.ke_file.dquoteP(ch)) {
                                    inside_dqP = T;
                                } else {
                                    if ((NIL != com.cyc.cycjava.cycl.ke_file.lpP(ch)) && (NIL == inside_dqP)) {
                                        lps = add(lps, ONE_INTEGER);
                                    } else {
                                        if ((NIL != com.cyc.cycjava.cycl.ke_file.rpP(ch)) && (NIL == inside_dqP)) {
                                            rps = add(rps, ONE_INTEGER);
                                        }
                                    }
                                }
                            }
                            if (((NIL != com.cyc.cycjava.cycl.ke_file.lbrP(ch)) || (NIL != com.cyc.cycjava.cycl.ke_file.tabP(ch))) && (NIL == inside_dqP)) {
                                temp = cons(CHAR_space, temp);
                            } else {
                                if (!(((NIL != com.cyc.cycjava.cycl.ke_file.periodP(ch)) && (NIL == inside_dqP)) && lps.numE(rps))) {
                                    temp = cons(ch, temp);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != set_difference(temp, $list_alt19, UNPROVIDED, UNPROVIDED)) {
                return string_utilities.char_list_to_string(nreverse(temp));
            } else {
                return NIL;
            }
        }
    }

    /**
     * Read one ke-region expression and return a listed string.
     * A ke-region expression ends with a period outside a double-quote.
     * If no ke-region expressions are present, return NIL.
     */
    @LispMethod(comment = "Read one ke-region expression and return a listed string.\r\nA ke-region expression ends with a period outside a double-quote.\r\nIf no ke-region expressions are present, return NIL.\nRead one ke-region expression and return a listed string.\nA ke-region expression ends with a period outside a double-quote.\nIf no ke-region expressions are present, return NIL.")
    public static SubLObject ke_read_from_stream(final SubLObject stream) {
        SubLObject temp;
        SubLObject inside_dqP;
        SubLObject inside_commentP;
        SubLObject lps;
        SubLObject rps;
        SubLObject ch;
        for (temp = NIL, inside_dqP = NIL, inside_commentP = NIL, lps = ZERO_INTEGER, rps = ZERO_INTEGER, ch = NIL, ch = read_char(stream, NIL, $EOF, UNPROVIDED); ((ch != $EOF) && (NIL != ch)) && (((((NIL == charE(ch, CHAR_period)) || (NIL == set_difference(temp, $list19, UNPROVIDED, UNPROVIDED))) || (!lps.numE(rps))) || (NIL != inside_dqP)) || (NIL != inside_commentP)); ch = read_char(stream, NIL, $EOF, UNPROVIDED)) {
            if ((NIL != semiP(ch)) && (NIL == inside_dqP)) {
                inside_commentP = T;
            } else
                if ((NIL != inside_commentP) && (NIL != lbrP(ch))) {
                    inside_commentP = NIL;
                } else
                    if (NIL == inside_commentP) {
                        if ((NIL != dquoteP(ch)) && (NIL != inside_dqP)) {
                            inside_dqP = NIL;
                        } else
                            if (NIL != dquoteP(ch)) {
                                inside_dqP = T;
                            } else
                                if ((NIL != lpP(ch)) && (NIL == inside_dqP)) {
                                    lps = add(lps, ONE_INTEGER);
                                } else
                                    if ((NIL != rpP(ch)) && (NIL == inside_dqP)) {
                                        rps = add(rps, ONE_INTEGER);
                                    }



                        if (((NIL != lbrP(ch)) || (NIL != tabP(ch))) && (NIL == inside_dqP)) {
                            temp = cons(CHAR_space, temp);
                        } else
                            if (((NIL == periodP(ch)) || (NIL != inside_dqP)) || (!lps.numE(rps))) {
                                temp = cons(ch, temp);
                            }

                    }


        }
        if (NIL != set_difference(temp, $list19, UNPROVIDED, UNPROVIDED)) {
            return string_utilities.char_list_to_string(nreverse(temp));
        }
        return NIL;
    }

    /**
     * Read a string composed of one or more ke-region input expressions
     * and return a list of strings.
     */
    @LispMethod(comment = "Read a string composed of one or more ke-region input expressions\r\nand return a list of strings.\nRead a string composed of one or more ke-region input expressions\nand return a list of strings.")
    public static final SubLObject ke_input_from_string_alt(SubLObject string) {
        {
            SubLObject ans = NIL;
            SubLObject temp = NIL;
            SubLObject inside_dqP = NIL;
            SubLObject inside_commentP = NIL;
            SubLObject lps = ZERO_INTEGER;
            SubLObject rps = ZERO_INTEGER;
            SubLObject p1 = ZERO_INTEGER;
            SubLObject len = length(string);
            SubLObject p2 = NIL;
            for (p2 = ZERO_INTEGER; p2.numL(len); p2 = add(p2, ONE_INTEGER)) {
                {
                    SubLObject ch = Strings.sublisp_char(string, p2);
                    if ((NIL != com.cyc.cycjava.cycl.ke_file.semiP(ch)) && (NIL == inside_dqP)) {
                        if ((NIL == inside_commentP) && p2.numG(p1)) {
                            {
                                SubLObject ss = subseq(string, p1, p2);
                                if (NIL == string_utilities.all_chars_EP(CHAR_space, ss)) {
                                    temp = cons(ss, temp);
                                }
                            }
                            p1 = add(p2, ONE_INTEGER);
                        }
                        inside_commentP = T;
                    } else {
                        if ((NIL != inside_commentP) && (NIL != com.cyc.cycjava.cycl.ke_file.lbrP(ch))) {
                            inside_commentP = NIL;
                            p1 = add(p2, ONE_INTEGER);
                        } else {
                            if (NIL == inside_commentP) {
                                {
                                    SubLObject endP = numE(p2, subtract(len, ONE_INTEGER));
                                    if ((((NIL != charE(ch, CHAR_period)) && lps.numE(rps)) && (NIL == inside_dqP)) || (NIL != endP)) {
                                        if (p2.numG(p1)) {
                                            {
                                                SubLObject ss = subseq(string, p1, NIL != endP ? ((SubLObject) (add(p2, ONE_INTEGER))) : p2);
                                                if (NIL == string_utilities.all_chars_EP(CHAR_space, ss)) {
                                                    temp = cons(ss, temp);
                                                    temp = nreverse(temp);
                                                    ans = cons(apply(symbol_function(CCONCATENATE), temp.first(), temp.rest()), ans);
                                                    temp = NIL;
                                                }
                                            }
                                        }
                                        p1 = add(p2, ONE_INTEGER);
                                    } else {
                                        if ((NIL != com.cyc.cycjava.cycl.ke_file.dquoteP(ch)) && (NIL != inside_dqP)) {
                                            inside_dqP = NIL;
                                        } else {
                                            if (NIL != com.cyc.cycjava.cycl.ke_file.dquoteP(ch)) {
                                                inside_dqP = T;
                                            } else {
                                                if ((NIL != com.cyc.cycjava.cycl.ke_file.lpP(ch)) && (NIL == inside_dqP)) {
                                                    lps = add(lps, ONE_INTEGER);
                                                } else {
                                                    if ((NIL != com.cyc.cycjava.cycl.ke_file.rpP(ch)) && (NIL == inside_dqP)) {
                                                        rps = add(rps, ONE_INTEGER);
                                                    } else {
                                                        if ((NIL != com.cyc.cycjava.cycl.ke_file.lbrP(ch)) || (NIL != com.cyc.cycjava.cycl.ke_file.tabP(ch))) {
                                                            set_aref(string, p2, CHAR_space);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(ans);
        }
    }

    /**
     * Read a string composed of one or more ke-region input expressions
     * and return a list of strings.
     */
    @LispMethod(comment = "Read a string composed of one or more ke-region input expressions\r\nand return a list of strings.\nRead a string composed of one or more ke-region input expressions\nand return a list of strings.")
    public static SubLObject ke_input_from_string(final SubLObject string) {
        SubLObject ans = NIL;
        SubLObject temp = NIL;
        SubLObject inside_dqP = NIL;
        SubLObject inside_commentP = NIL;
        SubLObject lps = ZERO_INTEGER;
        SubLObject rps = ZERO_INTEGER;
        SubLObject p1 = ZERO_INTEGER;
        SubLObject len;
        SubLObject p2;
        SubLObject ch;
        SubLObject ss;
        SubLObject endP;
        SubLObject ss2;
        for (len = length(string), p2 = NIL, p2 = ZERO_INTEGER; p2.numL(len); p2 = add(p2, ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, p2);
            if ((NIL != semiP(ch)) && (NIL == inside_dqP)) {
                if ((NIL == inside_commentP) && p2.numG(p1)) {
                    ss = subseq(string, p1, p2);
                    if (NIL == string_utilities.all_chars_EP(CHAR_space, ss)) {
                        temp = cons(ss, temp);
                    }
                    p1 = add(p2, ONE_INTEGER);
                }
                inside_commentP = T;
            } else
                if ((NIL != inside_commentP) && (NIL != lbrP(ch))) {
                    inside_commentP = NIL;
                    p1 = add(p2, ONE_INTEGER);
                } else
                    if (NIL == inside_commentP) {
                        endP = numE(p2, subtract(len, ONE_INTEGER));
                        if ((((NIL != charE(ch, CHAR_period)) && lps.numE(rps)) && (NIL == inside_dqP)) || (NIL != endP)) {
                            if (p2.numG(p1)) {
                                ss2 = subseq(string, p1, NIL != endP ? add(p2, ONE_INTEGER) : p2);
                                if (NIL == string_utilities.all_chars_EP(CHAR_space, ss2)) {
                                    temp = cons(ss2, temp);
                                    temp = nreverse(temp);
                                    ans = cons(apply(symbol_function(CCONCATENATE), temp.first(), temp.rest()), ans);
                                    temp = NIL;
                                }
                            }
                            p1 = add(p2, ONE_INTEGER);
                        } else
                            if ((NIL != dquoteP(ch)) && (NIL != inside_dqP)) {
                                inside_dqP = NIL;
                            } else
                                if (NIL != dquoteP(ch)) {
                                    inside_dqP = T;
                                } else
                                    if ((NIL != lpP(ch)) && (NIL == inside_dqP)) {
                                        lps = add(lps, ONE_INTEGER);
                                    } else
                                        if ((NIL != rpP(ch)) && (NIL == inside_dqP)) {
                                            rps = add(rps, ONE_INTEGER);
                                        } else
                                            if ((NIL != lbrP(ch)) || (NIL != tabP(ch))) {
                                                set_aref(string, p2, CHAR_space);
                                            }





                    }


        }
        return nreverse(ans);
    }

    public static final SubLObject nested_parens_in_stringP_alt(SubLObject string) {
        return makeBoolean((string.isString() && string_utilities.count_chars_in_string(string, CHAR_lparen).numG(ONE_INTEGER)) && (NIL != ke_utilities.parens_equalP(string)));
    }

    public static SubLObject nested_parens_in_stringP(final SubLObject string) {
        return makeBoolean((string.isString() && string_utilities.count_chars_in_string(string, CHAR_lparen).numG(ONE_INTEGER)) && (NIL != ke_utilities.parens_equalP(string)));
    }

    public static final SubLObject unary_predicateP_alt(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = makeBoolean((NIL != valid_constantP(obj, UNPROVIDED)) && (NIL != isa.isaP(obj, $$UnaryPredicate, UNPROVIDED, UNPROVIDED)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject unary_predicateP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = makeBoolean((NIL != valid_constantP(obj, UNPROVIDED)) && (NIL != isa.isaP(obj, $$UnaryPredicate, UNPROVIDED, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject non_unary_predicateP_alt(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = makeBoolean(((NIL != valid_constantP(obj, UNPROVIDED)) && (NIL != isa.isaP(obj, $$Predicate, UNPROVIDED, UNPROVIDED))) && (NIL == com.cyc.cycjava.cycl.ke_file.unary_predicateP(obj)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject non_unary_predicateP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = makeBoolean(((NIL != valid_constantP(obj, UNPROVIDED)) && (NIL != isa.isaP(obj, $$Predicate, UNPROVIDED, UNPROVIDED))) && (NIL == unary_predicateP(obj)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    /**
     * Returns T if token-list contains the wrong number of colon
     * delimiters, or if they are in the wrong position, or if the
     * token list is otherwise detectably malformed.
     */
    @LispMethod(comment = "Returns T if token-list contains the wrong number of colon\r\ndelimiters, or if they are in the wrong position, or if the\r\ntoken list is otherwise detectably malformed.\nReturns T if token-list contains the wrong number of colon\ndelimiters, or if they are in the wrong position, or if the\ntoken list is otherwise detectably malformed.")
    public static final SubLObject malformedP_alt(SubLObject token_list) {
        {
            SubLObject colon_tokens = com.cyc.cycjava.cycl.ke_file.count_tokens($str_alt25$_, token_list);
            SubLObject len = length(token_list);
            SubLObject first_token = token_list.first();
            SubLObject second_token = second(token_list);
            SubLObject third_token = third(token_list);
            SubLObject fourth_token = fourth(token_list);
            SubLObject c1 = fi.fi_find_int(first_token);
            return makeBoolean((((((((((NIL != find(first_token, $list_alt26, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((NIL != numNE(len, FOUR_INTEGER)) || (NIL == string_utilities.substringP($str_alt27$_, fourth_token, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) || (((NIL != subl_promotions.memberP(first_token, $list_alt28, symbol_function(EQUALP), UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.ke_file.unary_predicateP(c1))) && (NIL != numNE(len, ONE_INTEGER)))) || (colon_tokens.numE(ZERO_INTEGER) && (NIL == subl_promotions.memberP(first_token, $list_alt28, symbol_function(EQUALP), UNPROVIDED)))) || ((NIL != com.cyc.cycjava.cycl.ke_file.non_unary_predicateP(c1)) && len.numL(THREE_INTEGER))) || (len.numE(ONE_INTEGER) && colon_tokens.numG(ZERO_INTEGER))) || colon_tokens.numG(ONE_INTEGER)) || (colon_tokens.numE(ONE_INTEGER) && (NIL == subl_promotions.memberP($str_alt25$_, list(second_token, third_token), symbol_function(EQUALP), UNPROVIDED)))) || ((NIL != subl_promotions.memberP(first_token, $list_alt29, symbol_function(EQUALP), UNPROVIDED)) && (NIL != numNE(len, THREE_INTEGER)))) || (((NIL != com.cyc.cycjava.cycl.ke_file.nested_parens_in_stringP(third_token)) && (NIL != string_utilities.some_are_substringsP($list_alt30, third_token, UNPROVIDED))) && (NIL == subl_promotions.memberP(first_token, $list_alt31, symbol_function(EQUALP), UNPROVIDED))));
        }
    }

    /**
     * Returns T if token-list contains the wrong number of colon
     * delimiters, or if they are in the wrong position, or if the
     * token list is otherwise detectably malformed.
     */
    @LispMethod(comment = "Returns T if token-list contains the wrong number of colon\r\ndelimiters, or if they are in the wrong position, or if the\r\ntoken list is otherwise detectably malformed.\nReturns T if token-list contains the wrong number of colon\ndelimiters, or if they are in the wrong position, or if the\ntoken list is otherwise detectably malformed.")
    public static SubLObject malformedP(final SubLObject token_list) {
        final SubLObject colon_tokens = count_tokens($str25$_, token_list);
        final SubLObject len = length(token_list);
        final SubLObject first_token = token_list.first();
        final SubLObject second_token = second(token_list);
        final SubLObject third_token = third(token_list);
        final SubLObject fourth_token = fourth(token_list);
        final SubLObject c1 = fi.fi_find_int(first_token);
        return makeBoolean((((((((((NIL != find(first_token, $list26, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((NIL != numNE(len, FOUR_INTEGER)) || (NIL == string_utilities.substringP($str27$_, fourth_token, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) || (((NIL != subl_promotions.memberP(first_token, $list28, symbol_function(EQUALP), UNPROVIDED)) || (NIL != unary_predicateP(c1))) && (NIL != numNE(len, ONE_INTEGER)))) || (colon_tokens.numE(ZERO_INTEGER) && (NIL == subl_promotions.memberP(first_token, $list28, symbol_function(EQUALP), UNPROVIDED)))) || ((NIL != non_unary_predicateP(c1)) && len.numL(THREE_INTEGER))) || (len.numE(ONE_INTEGER) && colon_tokens.numG(ZERO_INTEGER))) || colon_tokens.numG(ONE_INTEGER)) || (colon_tokens.numE(ONE_INTEGER) && (NIL == subl_promotions.memberP($str25$_, list(second_token, third_token), symbol_function(EQUALP), UNPROVIDED)))) || ((NIL != subl_promotions.memberP(first_token, $list29, symbol_function(EQUALP), UNPROVIDED)) && (NIL != numNE(len, THREE_INTEGER)))) || (((NIL != nested_parens_in_stringP(third_token)) && (NIL != string_utilities.some_are_substringsP($list30, third_token, UNPROVIDED))) && (NIL == subl_promotions.memberP(first_token, $list31, symbol_function(EQUALP), UNPROVIDED))));
    }

    /**
     * Read from source (a stream or a string), parse the input
     * into lists of tokens, and push each token list onto
     * :ok-token-forms or :malformed, as appropriate.
     * called only from html-ke-file
     */
    @LispMethod(comment = "Read from source (a stream or a string), parse the input\r\ninto lists of tokens, and push each token list onto\r\n:ok-token-forms or :malformed, as appropriate.\r\ncalled only from html-ke-file\nRead from source (a stream or a string), parse the input\ninto lists of tokens, and push each token list onto\n:ok-token-forms or :malformed, as appropriate.\ncalled only from html-ke-file")
    public static final SubLObject tokenize_read_alt(SubLObject source, SubLObject noisy) {
        if (noisy == UNPROVIDED) {
            noisy = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != noisy) {
                format(T, $str_alt32$__);
            }
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject haltP = NIL;
                if (source.isStream()) {
                    {
                        SubLObject token_expr = NIL;
                        for (token_expr = com.cyc.cycjava.cycl.ke_file.ke_file_tokenize_string(ke_utilities.strip_garbage_chars(com.cyc.cycjava.cycl.ke_file.ke_read_from_stream(source), html_ke_file.$remove_non_printing_characters$.getDynamicValue(thread))); !((NIL == token_expr) || (NIL != haltP)); token_expr = com.cyc.cycjava.cycl.ke_file.ke_file_tokenize_string(ke_utilities.strip_garbage_chars(com.cyc.cycjava.cycl.ke_file.ke_read_from_stream(source), html_ke_file.$remove_non_printing_characters$.getDynamicValue(thread)))) {
                            if (NIL != com.cyc.cycjava.cycl.ke_file.malformedP(token_expr)) {
                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_expr);
                                haltP = T;
                            } else {
                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS, $CONS, token_expr);
                            }
                            count = add(count, ONE_INTEGER);
                            if (((NIL != noisy) && count.numG(ZERO_INTEGER)) && mod(count, TEN_INTEGER).numE(ZERO_INTEGER)) {
                                format(T, $str_alt36$___s_token_strings_loaded_, count);
                            }
                        }
                    }
                } else {
                    if (source.isString()) {
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.ke_file.ke_input_from_string(source);
                            SubLObject string = NIL;
                            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                                {
                                    SubLObject token_expr = com.cyc.cycjava.cycl.ke_file.ke_file_tokenize_string(ke_utilities.strip_garbage_chars(string, html_ke_file.$remove_non_printing_characters$.getDynamicValue(thread)));
                                    if (NIL != com.cyc.cycjava.cycl.ke_file.malformedP(token_expr)) {
                                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_expr);
                                    } else {
                                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS, $CONS, token_expr);
                                    }
                                    count = add(count, ONE_INTEGER);
                                    if (((NIL != noisy) && count.numG(ZERO_INTEGER)) && mod(count, TEN_INTEGER).numE(ZERO_INTEGER)) {
                                        format(T, $str_alt37$___s_token_strings_processed_, count);
                                    }
                                }
                            }
                        }
                    } else {
                        format(T, $str_alt38$_____s_is_not_a_stream_or_a_strin, source);
                    }
                }
                if (NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $REVERSE, UNPROVIDED);
                }
                if (NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS, $REVERSE, UNPROVIDED);
                }
                if (((NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED)) || (NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS))) && (NIL != noisy)) {
                    format(T, $str_alt40$____Processing_token_strings____);
                }
                return NIL;
            }
        }
    }

    /**
     * Read from source (a stream or a string), parse the input
     * into lists of tokens, and push each token list onto
     * :ok-token-forms or :malformed, as appropriate.
     * called only from html-ke-file
     */
    @LispMethod(comment = "Read from source (a stream or a string), parse the input\r\ninto lists of tokens, and push each token list onto\r\n:ok-token-forms or :malformed, as appropriate.\r\ncalled only from html-ke-file\nRead from source (a stream or a string), parse the input\ninto lists of tokens, and push each token list onto\n:ok-token-forms or :malformed, as appropriate.\ncalled only from html-ke-file")
    public static SubLObject tokenize_read(SubLObject source, SubLObject noisy) {
        if (noisy == UNPROVIDED) {
            noisy = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != noisy) {
            format(T, $str32$__);
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject haltP = NIL;
        if (source.isStream()) {
            SubLObject token_expr;
            for (token_expr = NIL, token_expr = ke_file_tokenize_string(ke_utilities.strip_garbage_chars(ke_read_from_stream(source), html_ke_file.$remove_non_printing_characters$.getDynamicValue(thread))); (NIL != token_expr) && (NIL == haltP); token_expr = ke_file_tokenize_string(ke_utilities.strip_garbage_chars(ke_read_from_stream(source), html_ke_file.$remove_non_printing_characters$.getDynamicValue(thread)))) {
                if (NIL != malformedP(token_expr)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_expr);
                    haltP = T;
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS, $CONS, token_expr);
                }
                count = add(count, ONE_INTEGER);
                if (((NIL != noisy) && count.numG(ZERO_INTEGER)) && mod(count, TEN_INTEGER).numE(ZERO_INTEGER)) {
                    format(T, $str36$___s_token_strings_loaded_, count);
                }
            }
        } else
            if (source.isString()) {
                SubLObject cdolist_list_var = ke_input_from_string(source);
                SubLObject string = NIL;
                string = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject token_expr2 = ke_file_tokenize_string(ke_utilities.strip_garbage_chars(string, html_ke_file.$remove_non_printing_characters$.getDynamicValue(thread)));
                    if (NIL != malformedP(token_expr2)) {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_expr2);
                    } else {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS, $CONS, token_expr2);
                    }
                    count = add(count, ONE_INTEGER);
                    if (((NIL != noisy) && count.numG(ZERO_INTEGER)) && mod(count, TEN_INTEGER).numE(ZERO_INTEGER)) {
                        format(T, $str37$___s_token_strings_processed_, count);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    string = cdolist_list_var.first();
                } 
            } else {
                format(T, $str38$_____s_is_not_a_stream_or_a_strin, source);
            }

        if (NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $REVERSE, UNPROVIDED);
        }
        if (NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS, $REVERSE, UNPROVIDED);
        }
        if (((NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED)) || (NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS))) && (NIL != noisy)) {
            format(T, $str40$____Processing_token_strings____);
        }
        return NIL;
    }

    /**
     * Takes a list of token-forms (each token-form is a list),
     * filtering for unknown constants.  Returns a list of
     * the unknown constants, sorted alphabetically.
     * called only from html-ke-file
     */
    @LispMethod(comment = "Takes a list of token-forms (each token-form is a list),\r\nfiltering for unknown constants.  Returns a list of\r\nthe unknown constants, sorted alphabetically.\r\ncalled only from html-ke-file\nTakes a list of token-forms (each token-form is a list),\nfiltering for unknown constants.  Returns a list of\nthe unknown constants, sorted alphabetically.\ncalled only from html-ke-file")
    public static final SubLObject unknown_constants_among_tokens_alt(SubLObject token_forms) {
        {
            SubLObject unknowns = NIL;
            SubLObject cdolist_list_var = token_forms;
            SubLObject token_list = NIL;
            for (token_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token_list = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_1 = token_list;
                    SubLObject token = NIL;
                    for (token = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , token = cdolist_list_var_1.first()) {
                        if (NIL == com.cyc.cycjava.cycl.ke_file.dquoteP(Strings.sublisp_char(token, ZERO_INTEGER))) {
                            unknowns = union(unknowns, com.cyc.cycjava.cycl.ke_file.get_unknown_constants(token), symbol_function(EQUALP), UNPROVIDED);
                        }
                    }
                }
            }
            return Sort.sort(unknowns, symbol_function(STRING_LESSP), UNPROVIDED);
        }
    }

    /**
     * Takes a list of token-forms (each token-form is a list),
     * filtering for unknown constants.  Returns a list of
     * the unknown constants, sorted alphabetically.
     * called only from html-ke-file
     */
    @LispMethod(comment = "Takes a list of token-forms (each token-form is a list),\r\nfiltering for unknown constants.  Returns a list of\r\nthe unknown constants, sorted alphabetically.\r\ncalled only from html-ke-file\nTakes a list of token-forms (each token-form is a list),\nfiltering for unknown constants.  Returns a list of\nthe unknown constants, sorted alphabetically.\ncalled only from html-ke-file")
    public static SubLObject unknown_constants_among_tokens(final SubLObject token_forms) {
        SubLObject unknowns = NIL;
        SubLObject cdolist_list_var = token_forms;
        SubLObject token_list = NIL;
        token_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = token_list;
            SubLObject token = NIL;
            token = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                if (NIL == dquoteP(Strings.sublisp_char(token, ZERO_INTEGER))) {
                    unknowns = union(unknowns, get_unknown_constants(token), symbol_function(EQUALP), UNPROVIDED);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                token = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            token_list = cdolist_list_var.first();
        } 
        return Sort.sort(unknowns, symbol_function(STRING_LESSP), UNPROVIDED);
    }

    /**
     * Returns T no matter what.  Called in DISPATCH-ON-TEST
     */
    @LispMethod(comment = "Returns T no matter what.  Called in DISPATCH-ON-TEST")
    public static final SubLObject give_upP_alt(SubLObject token_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke_utilities.$ke_debug$.getDynamicValue(thread)) {
                format(T, $str_alt42$__Malformed_token_list___s, token_list);
            }
            return T;
        }
    }

    /**
     * Returns T no matter what.  Called in DISPATCH-ON-TEST
     */
    @LispMethod(comment = "Returns T no matter what.  Called in DISPATCH-ON-TEST")
    public static SubLObject give_upP(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke_utilities.$ke_debug$.getDynamicValue(thread)) {
            format(T, $str42$__Malformed_token_list___s, token_list);
        }
        return T;
    }

    /**
     * Test to see if token-list is a ke-file constant assignment statement
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file constant assignment statement")
    public static final SubLObject constant_dirP_alt(SubLObject token_list) {
        return makeBoolean((length(token_list).numE(THREE_INTEGER) && (NIL != member(token_list.first(), $list_alt43, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str_alt25$_));
    }

    /**
     * Test to see if token-list is a ke-file constant assignment statement
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file constant assignment statement")
    public static SubLObject constant_dirP(final SubLObject token_list) {
        return makeBoolean((length(token_list).numE(THREE_INTEGER) && (NIL != member(token_list.first(), $list43, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_));
    }

    /**
     * Test to see if token-list is a ke-file rename statement
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file rename statement")
    public static final SubLObject rename_dirP_alt(SubLObject token_list) {
        return makeBoolean((length(token_list).numE(FOUR_INTEGER) && (NIL != member(token_list.first(), $list_alt44, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str_alt25$_));
    }

    /**
     * Test to see if token-list is a ke-file rename statement
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file rename statement")
    public static SubLObject rename_dirP(final SubLObject token_list) {
        return makeBoolean((length(token_list).numE(FOUR_INTEGER) && (NIL != member(token_list.first(), $list44, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_));
    }

    /**
     * Test to see if token-list is a ke-file mode directive
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file mode directive")
    public static final SubLObject mode_dirP_alt(SubLObject token_list) {
        return makeBoolean(length(token_list).numE(ONE_INTEGER) && (NIL != member(token_list.first(), $list_alt45, symbol_function(EQUALP), UNPROVIDED)));
    }

    /**
     * Test to see if token-list is a ke-file mode directive
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file mode directive")
    public static SubLObject mode_dirP(final SubLObject token_list) {
        return makeBoolean(length(token_list).numE(ONE_INTEGER) && (NIL != member(token_list.first(), $list45, symbol_function(EQUALP), UNPROVIDED)));
    }

    /**
     * Test to see if token-list is a ke-file unary predicate directive
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file unary predicate directive")
    public static final SubLObject probably_unaryP_alt(SubLObject token_list) {
        return makeBoolean(length(token_list).numE(ONE_INTEGER) && (NIL == subl_promotions.memberP(token_list.first(), $list_alt28, symbol_function(EQUALP), UNPROVIDED)));
    }

    /**
     * Test to see if token-list is a ke-file unary predicate directive
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file unary predicate directive")
    public static SubLObject probably_unaryP(final SubLObject token_list) {
        return makeBoolean(length(token_list).numE(ONE_INTEGER) && (NIL == subl_promotions.memberP(token_list.first(), $list28, symbol_function(EQUALP), UNPROVIDED)));
    }

    /**
     * Test to see if token-list is a ke-file kill statement
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file kill statement")
    public static final SubLObject kill_dirP_alt(SubLObject token_list) {
        return makeBoolean((length(token_list).numGE(THREE_INTEGER) && (NIL != member(token_list.first(), $list_alt46, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str_alt25$_));
    }

    /**
     * Test to see if token-list is a ke-file kill statement
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file kill statement")
    public static SubLObject kill_dirP(final SubLObject token_list) {
        return makeBoolean((length(token_list).numGE(THREE_INTEGER) && (NIL != member(token_list.first(), $list46, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_));
    }

    /**
     * Test to see if token-list is a ke-file mt assignment statement
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file mt assignment statement")
    public static final SubLObject mt_dirP_alt(SubLObject token_list) {
        return makeBoolean(((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$in)) && second(token_list).equalp($$$mt)) && third(token_list).equalp($str_alt25$_));
    }

    /**
     * Test to see if token-list is a ke-file mt assignment statement
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file mt assignment statement")
    public static SubLObject mt_dirP(final SubLObject token_list) {
        return makeBoolean(((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$in)) && second(token_list).equalp($$$mt)) && third(token_list).equalp($str25$_));
    }

    /**
     * Test to see if token-list is a ke-file default mt assignment statement
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file default mt assignment statement")
    public static final SubLObject default_mt_dirP_alt(SubLObject token_list) {
        return makeBoolean(((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$default)) && second(token_list).equalp($$$mt)) && third(token_list).equalp($str_alt25$_));
    }

    /**
     * Test to see if token-list is a ke-file default mt assignment statement
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file default mt assignment statement")
    public static SubLObject default_mt_dirP(final SubLObject token_list) {
        return makeBoolean(((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$default)) && second(token_list).equalp($$$mt)) && third(token_list).equalp($str25$_));
    }

    /**
     * Test to see if token-list is a ke-file EL directive
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file EL directive")
    public static final SubLObject el_dirP_alt(SubLObject token_list) {
        return makeBoolean((length(token_list).numGE(THREE_INTEGER) && (NIL != member(token_list.first(), $list_alt50, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str_alt25$_));
    }

    /**
     * Test to see if token-list is a ke-file EL directive
     */
    @LispMethod(comment = "Test to see if token-list is a ke-file EL directive")
    public static SubLObject el_dirP(final SubLObject token_list) {
        return makeBoolean((length(token_list).numGE(THREE_INTEGER) && (NIL != member(token_list.first(), $list50, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_));
    }

    /**
     * Test to see if token-list is a truth value assignment statement
     */
    @LispMethod(comment = "Test to see if token-list is a truth value assignment statement")
    public static final SubLObject tv_dirP_alt(SubLObject token_list) {
        return makeBoolean(((((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$truth)) && second(token_list).equalp($$$value)) && third(token_list).equalp($str_alt25$_)) && (NIL != member(fourth(token_list), $list_alt53, symbol_function(EQUALP), UNPROVIDED))) || (((length(token_list).numE(THREE_INTEGER) && token_list.first().equalp($$$tv)) && second(token_list).equalp($str_alt25$_)) && (NIL != member(third(token_list), $list_alt53, symbol_function(EQUALP), UNPROVIDED))));
    }

    /**
     * Test to see if token-list is a truth value assignment statement
     */
    @LispMethod(comment = "Test to see if token-list is a truth value assignment statement")
    public static SubLObject tv_dirP(final SubLObject token_list) {
        return makeBoolean(((((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$truth)) && second(token_list).equalp($$$value)) && third(token_list).equalp($str25$_)) && (NIL != member(fourth(token_list), $list53, symbol_function(EQUALP), UNPROVIDED))) || (((length(token_list).numE(THREE_INTEGER) && token_list.first().equalp($$$tv)) && second(token_list).equalp($str25$_)) && (NIL != member(third(token_list), $list53, symbol_function(EQUALP), UNPROVIDED))));
    }

    /**
     * Test to see if token-list is an access level assignment statement
     */
    @LispMethod(comment = "Test to see if token-list is an access level assignment statement")
    public static final SubLObject direction_dirP_alt(SubLObject token_list) {
        return makeBoolean(((length(token_list).numE(THREE_INTEGER) && (NIL != member(token_list.first(), $list_alt55, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str_alt25$_)) || (((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$access)) && second(token_list).equalp($$$level)) && third(token_list).equalp($str_alt25$_)));
    }

    /**
     * Test to see if token-list is an access level assignment statement
     */
    @LispMethod(comment = "Test to see if token-list is an access level assignment statement")
    public static SubLObject direction_dirP(final SubLObject token_list) {
        return makeBoolean(((length(token_list).numE(THREE_INTEGER) && (NIL != member(token_list.first(), $list55, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_)) || (((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$access)) && second(token_list).equalp($$$level)) && third(token_list).equalp($str25$_)));
    }

    /**
     * Test to see if token-list is an expression beginning with a Cyc predicate
     */
    @LispMethod(comment = "Test to see if token-list is an expression beginning with a Cyc predicate")
    public static final SubLObject probably_non_unaryP_alt(SubLObject token_list) {
        return makeBoolean((length(token_list).numGE(THREE_INTEGER) && (NIL == member(token_list.first(), $list_alt58, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str_alt25$_));
    }

    /**
     * Test to see if token-list is an expression beginning with a Cyc predicate
     */
    @LispMethod(comment = "Test to see if token-list is an expression beginning with a Cyc predicate")
    public static SubLObject probably_non_unaryP(final SubLObject token_list) {
        return makeBoolean((length(token_list).numGE(THREE_INTEGER) && (NIL == member(token_list.first(), $list58, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_));
    }

    /**
     * Set current constant, mt, mode, and access level for cyclist's
     * ke-file session, based on information in token-list
     */
    @LispMethod(comment = "Set current constant, mt, mode, and access level for cyclist\'s\r\nke-file session, based on information in token-list\nSet current constant, mt, mode, and access level for cyclist\'s\nke-file session, based on information in token-list")
    public static final SubLObject set_constant_alt(SubLObject token_list) {
        {
            SubLObject last_token = last(token_list, UNPROVIDED).first();
            SubLObject constant = ke_utilities.cycl_from_string(last_token);
            SubLObject default_mt = ke_utilities.ke_value(operation_communication.the_cyclist(), $DEFAULT_MT);
            if (NIL != constant) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $CONSTANT, $REPLACE, constant);
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MT, $REPLACE, NIL != default_mt ? ((SubLObject) (default_mt)) : mt_vars.$default_assert_mt$.getGlobalValue());
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $UNKNOWN);
                return constant;
            } else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
                return ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
            }
        }
    }

    /**
     * Set current constant, mt, mode, and access level for cyclist's
     * ke-file session, based on information in token-list
     */
    @LispMethod(comment = "Set current constant, mt, mode, and access level for cyclist\'s\r\nke-file session, based on information in token-list\nSet current constant, mt, mode, and access level for cyclist\'s\nke-file session, based on information in token-list")
    public static SubLObject set_constant(final SubLObject token_list) {
        final SubLObject last_token = last(token_list, UNPROVIDED).first();
        final SubLObject constant = ke_utilities.cycl_from_string(last_token);
        final SubLObject default_mt = ke_utilities.ke_value(operation_communication.the_cyclist(), $DEFAULT_MT);
        if (NIL != constant) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $CONSTANT, $REPLACE, constant);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MT, $REPLACE, NIL != default_mt ? default_mt : mt_vars.$default_assert_mt$.getGlobalValue());
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $UNKNOWN);
            return constant;
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
        return ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
    }

    /**
     * Set current mt for cyclist's ke-file session, based on
     * info in token-list
     */
    @LispMethod(comment = "Set current mt for cyclist\'s ke-file session, based on\r\ninfo in token-list\nSet current mt for cyclist\'s ke-file session, based on\ninfo in token-list")
    public static final SubLObject set_mt_alt(SubLObject token_list) {
        {
            SubLObject last_token = last(token_list, UNPROVIDED).first();
            SubLObject mt = ke_utilities.cycl_from_string(last_token);
            if (NIL != mt) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MT, $REPLACE, mt);
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DEFAULT_MT, $REPLACE, NIL);
                return ke_utilities.ke_value(operation_communication.the_cyclist(), $MT);
            } else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
                return ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
            }
        }
    }

    /**
     * Set current mt for cyclist's ke-file session, based on
     * info in token-list
     */
    @LispMethod(comment = "Set current mt for cyclist\'s ke-file session, based on\r\ninfo in token-list\nSet current mt for cyclist\'s ke-file session, based on\ninfo in token-list")
    public static SubLObject set_mt(final SubLObject token_list) {
        final SubLObject last_token = last(token_list, UNPROVIDED).first();
        final SubLObject mt = ke_utilities.cycl_from_string(last_token);
        if (NIL != mt) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MT, $REPLACE, mt);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DEFAULT_MT, $REPLACE, NIL);
            return ke_utilities.ke_value(operation_communication.the_cyclist(), $MT);
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
        return ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
    }

    /**
     * Set default mt for cyclist's ke-file session, based on
     * info in token-list
     */
    @LispMethod(comment = "Set default mt for cyclist\'s ke-file session, based on\r\ninfo in token-list\nSet default mt for cyclist\'s ke-file session, based on\ninfo in token-list")
    public static final SubLObject set_default_mt_alt(SubLObject token_list) {
        {
            SubLObject last_token = last(token_list, UNPROVIDED).first();
            SubLObject mt = ke_utilities.cycl_from_string(last_token);
            if (NIL != mt) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DEFAULT_MT, $REPLACE, mt);
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MT, $REPLACE, mt);
                return ke_utilities.ke_value(operation_communication.the_cyclist(), $DEFAULT_MT);
            } else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
                return ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
            }
        }
    }

    /**
     * Set default mt for cyclist's ke-file session, based on
     * info in token-list
     */
    @LispMethod(comment = "Set default mt for cyclist\'s ke-file session, based on\r\ninfo in token-list\nSet default mt for cyclist\'s ke-file session, based on\ninfo in token-list")
    public static SubLObject set_default_mt(final SubLObject token_list) {
        final SubLObject last_token = last(token_list, UNPROVIDED).first();
        final SubLObject mt = ke_utilities.cycl_from_string(last_token);
        if (NIL != mt) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DEFAULT_MT, $REPLACE, mt);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MT, $REPLACE, mt);
            return ke_utilities.ke_value(operation_communication.the_cyclist(), $DEFAULT_MT);
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
        return ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
    }

    /**
     * Set current truth value for cyclist's ke-file session,
     * based on info in token list
     */
    @LispMethod(comment = "Set current truth value for cyclist\'s ke-file session,\r\nbased on info in token list\nSet current truth value for cyclist\'s ke-file session,\nbased on info in token list")
    public static final SubLObject set_tv_alt(SubLObject token_list) {
        {
            SubLObject tv = last(token_list, UNPROVIDED).first();
            if (NIL != find(tv, $list_alt64, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $DEFAULT);
            } else {
                if (NIL != find(tv, $list_alt66, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $MONOTONIC);
                } else {
                    if (NIL != find(tv, $list_alt68, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
                    } else {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
                    }
                }
            }
            return ke_utilities.ke_value(operation_communication.the_cyclist(), $TV);
        }
    }

    /**
     * Set current truth value for cyclist's ke-file session,
     * based on info in token list
     */
    @LispMethod(comment = "Set current truth value for cyclist\'s ke-file session,\r\nbased on info in token list\nSet current truth value for cyclist\'s ke-file session,\nbased on info in token list")
    public static SubLObject set_tv(final SubLObject token_list) {
        final SubLObject tv = last(token_list, UNPROVIDED).first();
        if (NIL != find(tv, $list64, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $DEFAULT);
        } else
            if (NIL != find(tv, $list66, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $MONOTONIC);
            } else
                if (NIL != find(tv, $list68, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
                }


        return ke_utilities.ke_value(operation_communication.the_cyclist(), $TV);
    }

    /**
     * Set current access level for cyclist's ke-file session,
     * based on info in token-list
     */
    @LispMethod(comment = "Set current access level for cyclist\'s ke-file session,\r\nbased on info in token-list\nSet current access level for cyclist\'s ke-file session,\nbased on info in token-list")
    public static final SubLObject set_direction_alt(SubLObject token_list) {
        {
            SubLObject token = last(token_list, UNPROVIDED).first();
            if (NIL != find(token, $list_alt69, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $FORWARD);
            } else {
                if (NIL != find(token, $list_alt71, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $BACKWARD);
                } else {
                    if (NIL != find(token, $list_alt73, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $CODE);
                    } else {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $UNKNOWN);
                    }
                }
            }
            return ke_utilities.ke_value(operation_communication.the_cyclist(), $DIRECTION);
        }
    }

    /**
     * Set current access level for cyclist's ke-file session,
     * based on info in token-list
     */
    @LispMethod(comment = "Set current access level for cyclist\'s ke-file session,\r\nbased on info in token-list\nSet current access level for cyclist\'s ke-file session,\nbased on info in token-list")
    public static SubLObject set_direction(final SubLObject token_list) {
        final SubLObject token = last(token_list, UNPROVIDED).first();
        if (NIL != find(token, $list69, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $FORWARD);
        } else
            if (NIL != find(token, $list71, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $BACKWARD);
            } else
                if (NIL != find(token, $list73, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $CODE);
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $UNKNOWN);
                }


        return ke_utilities.ke_value(operation_communication.the_cyclist(), $DIRECTION);
    }

    public static final SubLObject set_mode_alt(SubLObject token_list) {
        {
            SubLObject token = token_list.first();
            if (token.equalp($$$enter)) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $ENTER);
            } else {
                if (token.equalp($$$delete)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $DELETE);
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $UNKNOWN);
                }
            }
        }
        return ke_utilities.ke_value(operation_communication.the_cyclist(), $MODE);
    }

    public static SubLObject set_mode(final SubLObject token_list) {
        final SubLObject token = token_list.first();
        if (token.equalp($$$enter)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $ENTER);
        } else
            if (token.equalp($$$delete)) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $DELETE);
            } else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $UNKNOWN);
            }

        return ke_utilities.ke_value(operation_communication.the_cyclist(), $MODE);
    }

    public static final SubLObject set_direction_to_use_alt(SubLObject expr) {
        if ((ke_utilities.ke_value(operation_communication.the_cyclist(), $DIRECTION).equal($UNKNOWN) && (NIL == list_utilities.cons_tree_find($$equiv, expr, symbol_function(EQUAL), UNPROVIDED))) && (NIL == list_utilities.cons_tree_find($$implies, expr, symbol_function(EQUAL), UNPROVIDED))) {
            return $FORWARD;
        } else {
            if (ke_utilities.ke_value(operation_communication.the_cyclist(), $DIRECTION) == $FORWARD) {
                return $FORWARD;
            } else {
                if (ke_utilities.ke_value(operation_communication.the_cyclist(), $DIRECTION) == $CODE) {
                    return $CODE;
                } else {
                    return $BACKWARD;
                }
            }
        }
    }

    public static SubLObject set_direction_to_use(final SubLObject expr) {
        if ((ke_utilities.ke_value(operation_communication.the_cyclist(), $DIRECTION).equal($UNKNOWN) && (NIL == list_utilities.cons_tree_find($$equiv, expr, symbol_function(EQUAL), UNPROVIDED))) && (NIL == list_utilities.cons_tree_find($$implies, expr, symbol_function(EQUAL), UNPROVIDED))) {
            return $FORWARD;
        }
        if (ke_utilities.ke_value(operation_communication.the_cyclist(), $DIRECTION) == $FORWARD) {
            return $FORWARD;
        }
        if (ke_utilities.ke_value(operation_communication.the_cyclist(), $DIRECTION) == $CODE) {
            return $CODE;
        }
        return $BACKWARD;
    }

    public static final SubLObject already_in_kbP_alt(SubLObject expr, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != html_ke_file.$check_for_existing_assertions$.getDynamicValue(thread)) {
                if (NIL == forts.fort_p(mt)) {
                    if (mt.isCons()) {
                        mt = narts_high.find_nart(mt);
                    }
                }
                if (NIL != forts.fort_p(mt)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject assertions = fi.sentence_assertions(expr, mt);
                        SubLObject all_present = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return makeBoolean((NIL != assertions) && (NIL != all_present));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject already_in_kbP(final SubLObject expr, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != html_ke_file.$check_for_existing_assertions$.getDynamicValue(thread)) {
            if ((NIL == forts.fort_p(mt)) && mt.isCons()) {
                mt = narts_high.find_nart(mt);
            }
            if (NIL != forts.fort_p(mt)) {
                thread.resetMultipleValues();
                final SubLObject assertions = fi.sentence_assertions(expr, mt);
                final SubLObject all_present = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean((NIL != assertions) && (NIL != all_present));
            }
        }
        return NIL;
    }

    /**
     * If the right side of token-list is an EL expression, make
     * it into a ke fi form and add the form to :forms-to-eval
     * in the cyclist's ke state object
     */
    @LispMethod(comment = "If the right side of token-list is an EL expression, make\r\nit into a ke fi form and add the form to :forms-to-eval\r\nin the cyclist\'s ke state object\nIf the right side of token-list is an EL expression, make\nit into a ke fi form and add the form to :forms-to-eval\nin the cyclist\'s ke state object")
    public static final SubLObject handle_el_expr_alt(SubLObject token_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mode = ke_utilities.ke_value(operation_communication.the_cyclist(), $MODE);
                SubLObject last_token = last(token_list, UNPROVIDED).first();
                SubLObject expr = ke_utilities.cycl_from_string(last_token);
                SubLObject quoted_expr = list(QUOTE, expr);
                SubLObject default_mt = ke_utilities.ke_value(operation_communication.the_cyclist(), $DEFAULT_MT);
                SubLObject mt = (NIL != default_mt) ? ((SubLObject) (default_mt)) : ke_utilities.ke_value(operation_communication.the_cyclist(), $MT);
                SubLObject quoted_mt = list(QUOTE, mt);
                SubLObject tv_to_use = ke_utilities.set_tv_to_use(expr.first());
                SubLObject direction_to_use = com.cyc.cycjava.cycl.ke_file.set_direction_to_use(expr);
                if (NIL != expr) {
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($ENTER)) {
                            if (NIL != com.cyc.cycjava.cycl.ke_file.already_in_kbP(expr, mt)) {
                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB, $APPEND, com.cyc.cycjava.cycl.ke_file.ids_from_sentence(expr, mt));
                            } else {
                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, list(KE_ASSERT, quoted_expr, quoted_mt, tv_to_use, direction_to_use));
                            }
                        } else {
                            if (pcase_var.eql($DELETE)) {
                                {
                                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                    SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                                    SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                                    SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                                    SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                                    SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                    SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                                    SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                                    try {
                                        $within_assert$.bind(NIL, thread);
                                        wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                                        at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                                        wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                        wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                        wff_vars.$validate_constantsP$.bind(NIL, thread);
                                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                        {
                                            SubLObject type = com.cyc.cycjava.cycl.ke_file.source_type(expr, mt);
                                            SubLObject form = (type == $LOCAL) ? ((SubLObject) (list(KE_UNASSERT, quoted_expr, quoted_mt))) : type == $REMOTE ? ((SubLObject) (list(KE_BLAST, quoted_expr, quoted_mt))) : list(expr, mt);
                                            if (NIL != subl_promotions.memberP(type, $list_alt89, UNPROVIDED, UNPROVIDED)) {
                                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, form);
                                            } else {
                                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_IN_KB, $CONS, form);
                                            }
                                        }
                                    } finally {
                                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                                        wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                                        czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                                        at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                                        $within_assert$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
                }
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $UNKNOWN);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "If the right side of token-list is an EL expression, make\r\nit into a ke fi form and add the form to :forms-to-eval\r\nin the cyclist\'s ke state object\nIf the right side of token-list is an EL expression, make\nit into a ke fi form and add the form to :forms-to-eval\nin the cyclist\'s ke state object")
    public static SubLObject handle_el_expr(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = ke_utilities.ke_value(operation_communication.the_cyclist(), $MODE);
        final SubLObject last_token = last(token_list, UNPROVIDED).first();
        final SubLObject expr = ke_utilities.cycl_from_string(last_token);
        final SubLObject quoted_expr = list(QUOTE, expr);
        final SubLObject default_mt = ke_utilities.ke_value(operation_communication.the_cyclist(), $DEFAULT_MT);
        final SubLObject mt = (NIL != default_mt) ? default_mt : ke_utilities.ke_value(operation_communication.the_cyclist(), $MT);
        final SubLObject quoted_mt = list(QUOTE, mt);
        final SubLObject tv_to_use = ke_utilities.set_tv_to_use(expr.first());
        final SubLObject direction_to_use = set_direction_to_use(expr);
        if (NIL != expr) {
            final SubLObject pcase_var = mode;
            if (pcase_var.eql($ENTER)) {
                if (NIL != already_in_kbP(expr, mt)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB, $APPEND, ids_from_sentence(expr, mt));
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, list(KE_ASSERT, quoted_expr, quoted_mt, tv_to_use, direction_to_use));
                }
            } else
                if (pcase_var.eql($DELETE)) {
                    final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        $within_assert$.bind(NIL, thread);
                        wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                        at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                        wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                        wff_vars.$validate_constantsP$.bind(NIL, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        final SubLObject type = source_type(expr, mt);
                        final SubLObject form = (type == $LOCAL) ? list(KE_UNASSERT, quoted_expr, quoted_mt) : type == $REMOTE ? list(KE_BLAST, quoted_expr, quoted_mt) : list(expr, mt);
                        if (NIL != subl_promotions.memberP(type, $list89, UNPROVIDED, UNPROVIDED)) {
                            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, form);
                        } else {
                            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_IN_KB, $CONS, form);
                        }
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                        wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                        at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }

        } else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $UNKNOWN);
        return NIL;
    }

    public static final SubLObject non_binary_predicateP_alt(SubLObject pred) {
        return makeBoolean((NIL != fort_types_interface.predicate_p(pred)) && (NIL == isa.isa_in_any_mtP(pred, $$BinaryPredicate)));
    }

    public static SubLObject non_binary_predicateP(final SubLObject pred) {
        return makeBoolean((NIL != fort_types_interface.predicate_p(pred)) && (NIL == isa.isa_in_any_mtP(pred, $$BinaryPredicate)));
    }

    /**
     * Convert token-list into a ke fi expression, and add the expression to the
     * :forms-to-eval list on the cyclist's ke state object.  The token list is assumed
     * to encode a CycL sentence beginning with a non-unary predicate.
     */
    @LispMethod(comment = "Convert token-list into a ke fi expression, and add the expression to the\r\n:forms-to-eval list on the cyclist\'s ke state object.  The token list is assumed\r\nto encode a CycL sentence beginning with a non-unary predicate.\nConvert token-list into a ke fi expression, and add the expression to the\n:forms-to-eval list on the cyclist\'s ke state object.  The token list is assumed\nto encode a CycL sentence beginning with a non-unary predicate.")
    public static final SubLObject handle_probably_non_unary_alt(SubLObject token_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constant = ke_utilities.ke_value(operation_communication.the_cyclist(), $CONSTANT);
                SubLObject mode = ke_utilities.ke_value(operation_communication.the_cyclist(), $MODE);
                SubLObject first_token = token_list.first();
                SubLObject pred = ke_utilities.cycl_from_string(first_token);
                SubLObject mt = ke_utilities.ke_value(operation_communication.the_cyclist(), $MT);
                SubLObject tv_to_use = ke_utilities.set_tv_to_use(pred);
                SubLObject direction_to_use = com.cyc.cycjava.cycl.ke_file.set_direction_to_use(pred);
                SubLObject quoted_mt = list(QUOTE, mt);
                SubLObject cdolist_list_var = cddr(token_list);
                SubLObject string = NIL;
                for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                    {
                        SubLObject v_term = ke_utilities.cycl_from_string(string);
                        SubLObject literal = list(pred, constant, v_term);
                        SubLObject alt_lit = (NIL != com.cyc.cycjava.cycl.ke_file.non_binary_predicateP(pred)) ? ((SubLObject) (append(list(pred, constant), v_term))) : NIL;
                        SubLObject entry_form = (NIL != alt_lit) ? ((SubLObject) (alt_lit)) : literal;
                        SubLObject quoted_entry_form = list(QUOTE, entry_form);
                        if ((NIL != pred) && (NIL != v_term)) {
                            {
                                SubLObject pcase_var = mode;
                                if (pcase_var.eql($ENTER)) {
                                    if (NIL != com.cyc.cycjava.cycl.ke_file.already_in_kbP(entry_form, mt)) {
                                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB, $APPEND, com.cyc.cycjava.cycl.ke_file.ids_from_sentence(entry_form, mt));
                                    } else {
                                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, list(KE_ASSERT, quoted_entry_form, quoted_mt, tv_to_use, direction_to_use));
                                    }
                                } else {
                                    if (pcase_var.eql($DELETE)) {
                                        {
                                            SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                            SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                                            SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                                            SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                                            SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                                            SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                            SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                                            SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                                            try {
                                                $within_assert$.bind(NIL, thread);
                                                wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                                                at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                                                wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                                wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                                                wff_utilities.$check_var_typesP$.bind(NIL, thread);
                                                czer_vars.$simplify_literalP$.bind(NIL, thread);
                                                at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                                at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                                wff_vars.$validate_constantsP$.bind(NIL, thread);
                                                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                                {
                                                    SubLObject type = com.cyc.cycjava.cycl.ke_file.source_type(entry_form, mt);
                                                    SubLObject form = (type == $LOCAL) ? ((SubLObject) (list(KE_UNASSERT, quoted_entry_form, quoted_mt))) : type == $REMOTE ? ((SubLObject) (list(KE_BLAST, quoted_entry_form, quoted_mt))) : list(entry_form, mt);
                                                    if (NIL != subl_promotions.memberP(type, $list_alt89, UNPROVIDED, UNPROVIDED)) {
                                                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, form);
                                                    } else {
                                                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_IN_KB, $CONS, form);
                                                    }
                                                }
                                            } finally {
                                                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                                                wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                                                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                                                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                                                czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                                                wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                                                wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                                                wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                                                at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                                                wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                                                $within_assert$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
                        }
                    }
                }
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $UNKNOWN);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Convert token-list into a ke fi expression, and add the expression to the\r\n:forms-to-eval list on the cyclist\'s ke state object.  The token list is assumed\r\nto encode a CycL sentence beginning with a non-unary predicate.\nConvert token-list into a ke fi expression, and add the expression to the\n:forms-to-eval list on the cyclist\'s ke state object.  The token list is assumed\nto encode a CycL sentence beginning with a non-unary predicate.")
    public static SubLObject handle_probably_non_unary(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constant = ke_utilities.ke_value(operation_communication.the_cyclist(), $CONSTANT);
        final SubLObject mode = ke_utilities.ke_value(operation_communication.the_cyclist(), $MODE);
        final SubLObject first_token = token_list.first();
        final SubLObject pred = ke_utilities.cycl_from_string(first_token);
        final SubLObject mt = ke_utilities.ke_value(operation_communication.the_cyclist(), $MT);
        final SubLObject tv_to_use = ke_utilities.set_tv_to_use(pred);
        final SubLObject direction_to_use = set_direction_to_use(pred);
        final SubLObject quoted_mt = list(QUOTE, mt);
        SubLObject cdolist_list_var = cddr(token_list);
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_term = ke_utilities.cycl_from_string(string);
            final SubLObject literal = list(pred, constant, v_term);
            final SubLObject alt_lit = (NIL != non_binary_predicateP(pred)) ? append(list(pred, constant), v_term) : NIL;
            final SubLObject entry_form = (NIL != alt_lit) ? alt_lit : literal;
            final SubLObject quoted_entry_form = list(QUOTE, entry_form);
            if ((NIL != pred) && (NIL != v_term)) {
                final SubLObject pcase_var = mode;
                if (pcase_var.eql($ENTER)) {
                    if (NIL != already_in_kbP(entry_form, mt)) {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB, $APPEND, ids_from_sentence(entry_form, mt));
                    } else {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, list(KE_ASSERT, quoted_entry_form, quoted_mt, tv_to_use, direction_to_use));
                    }
                } else
                    if (pcase_var.eql($DELETE)) {
                        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                        try {
                            $within_assert$.bind(NIL, thread);
                            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                            wff_utilities.$check_var_typesP$.bind(NIL, thread);
                            czer_vars.$simplify_literalP$.bind(NIL, thread);
                            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            wff_vars.$validate_constantsP$.bind(NIL, thread);
                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                            final SubLObject type = source_type(entry_form, mt);
                            final SubLObject form = (type == $LOCAL) ? list(KE_UNASSERT, quoted_entry_form, quoted_mt) : type == $REMOTE ? list(KE_BLAST, quoted_entry_form, quoted_mt) : list(entry_form, mt);
                            if (NIL != subl_promotions.memberP(type, $list89, UNPROVIDED, UNPROVIDED)) {
                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, form);
                            } else {
                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_IN_KB, $CONS, form);
                            }
                        } finally {
                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                            $within_assert$.rebind(_prev_bind_0, thread);
                        }
                    }

            } else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $UNKNOWN);
        return NIL;
    }

    /**
     * Convert token-list into a ke fi expression, and
     * add the expression to the :forms-to-eval list on the
     * cyclist's ke state object.  The token list is assumed
     * to encode a CycL sentence beginning with a unary
     * predicate.
     */
    @LispMethod(comment = "Convert token-list into a ke fi expression, and\r\nadd the expression to the :forms-to-eval list on the\r\ncyclist\'s ke state object.  The token list is assumed\r\nto encode a CycL sentence beginning with a unary\r\npredicate.\nConvert token-list into a ke fi expression, and\nadd the expression to the :forms-to-eval list on the\ncyclist\'s ke state object.  The token list is assumed\nto encode a CycL sentence beginning with a unary\npredicate.")
    public static final SubLObject handle_probably_unary_alt(SubLObject token_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constant = ke_utilities.ke_value(operation_communication.the_cyclist(), $CONSTANT);
                SubLObject mode = ke_utilities.ke_value(operation_communication.the_cyclist(), $MODE);
                SubLObject first_token = token_list.first();
                SubLObject pred = ke_utilities.cycl_from_string(first_token);
                SubLObject mt = ke_utilities.ke_value(operation_communication.the_cyclist(), $MT);
                SubLObject tv_to_use = ke_utilities.set_tv_to_use(pred);
                SubLObject direction_to_use = com.cyc.cycjava.cycl.ke_file.set_direction_to_use(pred);
                SubLObject quoted_mt = list(QUOTE, mt);
                SubLObject literal = list(pred, constant);
                SubLObject quoted_literal = list(QUOTE, literal);
                if ((NIL != pred) && (NIL != constant)) {
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($ENTER)) {
                            if (NIL != com.cyc.cycjava.cycl.ke_file.already_in_kbP(literal, mt)) {
                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB, $APPEND, com.cyc.cycjava.cycl.ke_file.ids_from_sentence(literal, mt));
                            } else {
                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, list(KE_ASSERT, quoted_literal, quoted_mt, tv_to_use, direction_to_use));
                            }
                        } else {
                            if (pcase_var.eql($DELETE)) {
                                {
                                    SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                    SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                                    SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                                    SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                                    SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                                    SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                    SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                                    SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                                    try {
                                        $within_assert$.bind(NIL, thread);
                                        wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                                        at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                                        wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                        wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                        wff_vars.$validate_constantsP$.bind(NIL, thread);
                                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                        {
                                            SubLObject type = com.cyc.cycjava.cycl.ke_file.source_type(literal, mt);
                                            SubLObject form = (type == $LOCAL) ? ((SubLObject) (list(KE_UNASSERT, quoted_literal, quoted_mt))) : type == $REMOTE ? ((SubLObject) (list(KE_BLAST, quoted_literal, quoted_mt))) : list(literal, mt);
                                            if (NIL != subl_promotions.memberP(type, $list_alt89, UNPROVIDED, UNPROVIDED)) {
                                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, form);
                                            } else {
                                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_IN_KB, $CONS, form);
                                            }
                                        }
                                    } finally {
                                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                                        wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                                        czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                                        at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1, thread);
                                        $within_assert$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
                }
            }
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $UNKNOWN);
            return NIL;
        }
    }

    /**
     * Convert token-list into a ke fi expression, and
     * add the expression to the :forms-to-eval list on the
     * cyclist's ke state object.  The token list is assumed
     * to encode a CycL sentence beginning with a unary
     * predicate.
     */
    @LispMethod(comment = "Convert token-list into a ke fi expression, and\r\nadd the expression to the :forms-to-eval list on the\r\ncyclist\'s ke state object.  The token list is assumed\r\nto encode a CycL sentence beginning with a unary\r\npredicate.\nConvert token-list into a ke fi expression, and\nadd the expression to the :forms-to-eval list on the\ncyclist\'s ke state object.  The token list is assumed\nto encode a CycL sentence beginning with a unary\npredicate.")
    public static SubLObject handle_probably_unary(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constant = ke_utilities.ke_value(operation_communication.the_cyclist(), $CONSTANT);
        final SubLObject mode = ke_utilities.ke_value(operation_communication.the_cyclist(), $MODE);
        final SubLObject first_token = token_list.first();
        final SubLObject pred = ke_utilities.cycl_from_string(first_token);
        final SubLObject mt = ke_utilities.ke_value(operation_communication.the_cyclist(), $MT);
        final SubLObject tv_to_use = ke_utilities.set_tv_to_use(pred);
        final SubLObject direction_to_use = set_direction_to_use(pred);
        final SubLObject quoted_mt = list(QUOTE, mt);
        final SubLObject literal = list(pred, constant);
        final SubLObject quoted_literal = list(QUOTE, literal);
        if ((NIL != pred) && (NIL != constant)) {
            final SubLObject pcase_var = mode;
            if (pcase_var.eql($ENTER)) {
                if (NIL != already_in_kbP(literal, mt)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB, $APPEND, ids_from_sentence(literal, mt));
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, list(KE_ASSERT, quoted_literal, quoted_mt, tv_to_use, direction_to_use));
                }
            } else
                if (pcase_var.eql($DELETE)) {
                    final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        $within_assert$.bind(NIL, thread);
                        wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                        at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                        wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                        wff_vars.$validate_constantsP$.bind(NIL, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        final SubLObject type = source_type(literal, mt);
                        final SubLObject form = (type == $LOCAL) ? list(KE_UNASSERT, quoted_literal, quoted_mt) : type == $REMOTE ? list(KE_BLAST, quoted_literal, quoted_mt) : list(literal, mt);
                        if (NIL != subl_promotions.memberP(type, $list89, UNPROVIDED, UNPROVIDED)) {
                            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, form);
                        } else {
                            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_IN_KB, $CONS, form);
                        }
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                        wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                        at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                        $within_assert$.rebind(_prev_bind_0, thread);
                    }
                }

        } else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
        }
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $TV, $REPLACE, $UNKNOWN);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $DIRECTION, $REPLACE, $UNKNOWN);
        return NIL;
    }

    public static final SubLObject handle_rename_alt(SubLObject token_list) {
        {
            SubLObject constant = ke_utilities.cycl_from_string(third(token_list));
            SubLObject new_name = ke_utilities.cycl_from_string(fourth(token_list));
            if ((NIL != constant) && (NIL != new_name)) {
                if (NIL != fi.fi_find_int(new_name)) {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_CONSTANTS, $ADJOIN, new_name);
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, list(KE_RENAME, constant, new_name));
                }
            } else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
            }
        }
        return NIL;
    }

    public static SubLObject handle_rename(final SubLObject token_list) {
        final SubLObject constant = ke_utilities.cycl_from_string(third(token_list));
        final SubLObject new_name = ke_utilities.cycl_from_string(fourth(token_list));
        if ((NIL != constant) && (NIL != new_name)) {
            if (NIL != fi.fi_find_int(new_name)) {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_CONSTANTS, $ADJOIN, new_name);
            } else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, list(KE_RENAME, constant, new_name));
            }
        } else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
        }
        return NIL;
    }

    public static final SubLObject handle_kill_alt(SubLObject token_list) {
        {
            SubLObject strings = cddr(token_list);
            SubLObject cdolist_list_var = strings;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                {
                    SubLObject obj = ke_utilities.cycl_from_string(string);
                    if (NIL != obj) {
                        if (NIL != misc_kb_utilities.constant_or_natP(obj)) {
                            {
                                SubLObject quoted_obj = list(QUOTE, obj);
                                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, list(KE_KILL, quoted_obj));
                            }
                        } else {
                            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_VALID_CONSTANTS, $CONS, string);
                        }
                    } else {
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject handle_kill(final SubLObject token_list) {
        SubLObject cdolist_list_var;
        final SubLObject strings = cdolist_list_var = cddr(token_list);
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject obj = ke_utilities.cycl_from_string(string);
            if (NIL != obj) {
                if (NIL != misc_kb_utilities.constant_or_natP(obj)) {
                    final SubLObject quoted_obj = list(QUOTE, obj);
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $CONS, list(KE_KILL, quoted_obj));
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_VALID_CONSTANTS, $CONS, string);
                }
            } else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * If token-list appears to be malformed (meaning it can't
     * possibly yield a well-formed CycL expression), add it to
     * the list of apparently malformed token lists on cyclist's
     * ke-state object
     */
    @LispMethod(comment = "If token-list appears to be malformed (meaning it can\'t\r\npossibly yield a well-formed CycL expression), add it to\r\nthe list of apparently malformed token lists on cyclist\'s\r\nke-state object\nIf token-list appears to be malformed (meaning it can\'t\npossibly yield a well-formed CycL expression), add it to\nthe list of apparently malformed token lists on cyclist\'s\nke-state object")
    public static final SubLObject handle_problem_alt(SubLObject token_list) {
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
        return NIL;
    }

    @LispMethod(comment = "If token-list appears to be malformed (meaning it can\'t\r\npossibly yield a well-formed CycL expression), add it to\r\nthe list of apparently malformed token lists on cyclist\'s\r\nke-state object\nIf token-list appears to be malformed (meaning it can\'t\npossibly yield a well-formed CycL expression), add it to\nthe list of apparently malformed token lists on cyclist\'s\nke-state object")
    public static SubLObject handle_problem(final SubLObject token_list) {
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
        return NIL;
    }/**
     * If token-list appears to be malformed (meaning it can't
     * possibly yield a well-formed CycL expression), add it to
     * the list of apparently malformed token lists on cyclist's
     * ke-state object
     */


    /**
     * Print each element in list-of-objs to stream
     */
    @LispMethod(comment = "Print each element in list-of-objs to stream")
    public static final SubLObject print_list_alt(SubLObject list_of_objs, SubLObject stream, SubLObject spacing, SubLObject indent) {
        if (spacing == UNPROVIDED) {
            spacing = $SINGLE;
        }
        if (indent == UNPROVIDED) {
            indent = ZERO_INTEGER;
        }
        {
            SubLObject ind_str = Strings.make_string(indent, UNPROVIDED);
            if (spacing == $SINGLE) {
                {
                    SubLObject cdolist_list_var = list_of_objs;
                    SubLObject obj = NIL;
                    for (obj = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , obj = cdolist_list_var.first()) {
                        format(stream, $str_alt98$___a_s, ind_str, obj);
                    }
                }
            } else {
                {
                    SubLObject cdolist_list_var = list_of_objs;
                    SubLObject obj = NIL;
                    for (obj = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , obj = cdolist_list_var.first()) {
                        format(stream, $str_alt99$_____a_s, ind_str, obj);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Print each element in list-of-objs to stream")
    public static SubLObject print_list(final SubLObject list_of_objs, final SubLObject stream, SubLObject spacing, SubLObject indent) {
        if (spacing == UNPROVIDED) {
            spacing = $SINGLE;
        }
        if (indent == UNPROVIDED) {
            indent = ZERO_INTEGER;
        }
        final SubLObject ind_str = Strings.make_string(indent, UNPROVIDED);
        if (spacing == $SINGLE) {
            SubLObject cdolist_list_var = list_of_objs;
            SubLObject obj = NIL;
            obj = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(stream, $str98$___a_s, ind_str, obj);
                cdolist_list_var = cdolist_list_var.rest();
                obj = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = list_of_objs;
            SubLObject obj = NIL;
            obj = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(stream, $str99$_____a_s, ind_str, obj);
                cdolist_list_var = cdolist_list_var.rest();
                obj = cdolist_list_var.first();
            } 
        }
        return NIL;
    }/**
     * Print each element in list-of-objs to stream
     */


    /**
     * Iterate through each token list in :ok-token-forms, passing
     * each to DISPATCH-ON-TEST for processing.
     * called only from html-ke-file
     */
    @LispMethod(comment = "Iterate through each token list in :ok-token-forms, passing\r\neach to DISPATCH-ON-TEST for processing.\r\ncalled only from html-ke-file\nIterate through each token list in :ok-token-forms, passing\neach to DISPATCH-ON-TEST for processing.\ncalled only from html-ke-file")
    public static final SubLObject build_eval_form_list_alt() {
        {
            SubLObject token_lists = ke_utilities.ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS);
            com.cyc.cycjava.cycl.ke_file.clear_ke_state(operation_communication.the_cyclist(), $list_alt100, UNPROVIDED);
            {
                SubLObject cdolist_list_var = token_lists;
                SubLObject tl = NIL;
                for (tl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tl = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.ke_file.dispatch_on_test(tl);
                }
            }
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $REVERSE, UNPROVIDED);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB, $REVERSE, UNPROVIDED);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $REVERSE, UNPROVIDED);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_IN_KB, $REVERSE, UNPROVIDED);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_VALID_CONSTANTS, $REVERSE, UNPROVIDED);
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_CONSTANTS, $REVERSE, UNPROVIDED);
        }
        return NIL;
    }

    @LispMethod(comment = "Iterate through each token list in :ok-token-forms, passing\r\neach to DISPATCH-ON-TEST for processing.\r\ncalled only from html-ke-file\nIterate through each token list in :ok-token-forms, passing\neach to DISPATCH-ON-TEST for processing.\ncalled only from html-ke-file")
    public static SubLObject build_eval_form_list() {
        final SubLObject token_lists = ke_utilities.ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS);
        clear_ke_state(operation_communication.the_cyclist(), $list100, UNPROVIDED);
        SubLObject cdolist_list_var = token_lists;
        SubLObject tl = NIL;
        tl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dispatch_on_test(tl);
            cdolist_list_var = cdolist_list_var.rest();
            tl = cdolist_list_var.first();
        } 
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $REVERSE, UNPROVIDED);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB, $REVERSE, UNPROVIDED);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL, $REVERSE, UNPROVIDED);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_IN_KB, $REVERSE, UNPROVIDED);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $NOT_VALID_CONSTANTS, $REVERSE, UNPROVIDED);
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $ALREADY_CONSTANTS, $REVERSE, UNPROVIDED);
        return NIL;
    }/**
     * Iterate through each token list in :ok-token-forms, passing
     * each to DISPATCH-ON-TEST for processing.
     * called only from html-ke-file
     */


    public static final SubLObject print_forms_2_alt(SubLObject forms, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (NIL != forms) {
            format(T, $str_alt101$_________________________________);
            if (message.isString()) {
                format(T, $str_alt102$____);
                format(T, message);
            }
            {
                SubLObject cdolist_list_var = forms;
                SubLObject x = NIL;
                for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                    {
                        SubLObject ass = assertion_handles.find_assertion_by_id(x);
                        SubLObject cycl = misc_kb_utilities.make_lispy_form(ass);
                        SubLObject mt = assertions_high.assertion_mt(ass);
                        format(T, $str_alt103$_______s_in__s, cycl, mt);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject print_forms_2(final SubLObject forms, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (NIL != forms) {
            format(T, $str101$_________________________________);
            if (message.isString()) {
                format(T, $str102$____);
                format(T, message);
            }
            SubLObject cdolist_list_var = forms;
            SubLObject x = NIL;
            x = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject ass = assertion_handles.find_assertion_by_id(x);
                final SubLObject cycl = misc_kb_utilities.make_lispy_form(ass);
                final SubLObject mt = assertions_high.assertion_mt(ass);
                format(T, $str103$_______s_in__s, cycl, mt);
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject print_forms_3_alt(SubLObject forms, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (NIL != forms) {
            format(T, $str_alt101$_________________________________);
            if (message.isString()) {
                format(T, $str_alt102$____);
                format(T, message);
            }
            {
                SubLObject cdolist_list_var = forms;
                SubLObject x = NIL;
                for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                    format(T, $str_alt104$_______s_is_not_in__s, x.first(), second(x));
                }
            }
        }
        return NIL;
    }

    public static SubLObject print_forms_3(final SubLObject forms, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (NIL != forms) {
            format(T, $str101$_________________________________);
            if (message.isString()) {
                format(T, $str102$____);
                format(T, message);
            }
            SubLObject cdolist_list_var = forms;
            SubLObject x = NIL;
            x = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str104$_______s_is_not_in__s, x.first(), second(x));
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject print_forms_1_alt(SubLObject forms, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (NIL != forms) {
            format(T, $str_alt101$_________________________________);
            if (message.isString()) {
                format(T, $str_alt102$____);
                format(T, message);
            }
            format(T, $str_alt32$__);
            com.cyc.cycjava.cycl.ke_file.print_list(forms, T, $SINGLE, TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject print_forms_1(final SubLObject forms, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (NIL != forms) {
            format(T, $str101$_________________________________);
            if (message.isString()) {
                format(T, $str102$____);
                format(T, message);
            }
            format(T, $str32$__);
            print_list(forms, T, $SINGLE, TWO_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject present_forms_to_eval_alt(SubLObject forms_to_eval) {
        if (NIL != forms_to_eval) {
            format(T, $str_alt101$_________________________________);
            {
                SubLObject len = length(forms_to_eval);
                format(T, $str_alt105$____New_forms_to_evaluate_);
                com.cyc.cycjava.cycl.ke_file.print_list(forms_to_eval, T, $DOUBLE, TWO_INTEGER);
                if (NIL != (len.numE(ONE_INTEGER) ? ((SubLObject) (UserIO.user_confirm($str_alt107$__Evaluate_the_form_above_now__))) : UserIO.user_confirm(format(NIL, $str_alt108$__Evaluate_the__s_forms_above_now, len)))) {
                    {
                        SubLObject cdolist_list_var = forms_to_eval;
                        SubLObject f = NIL;
                        for (f = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , f = cdolist_list_var.first()) {
                            eval(f);
                        }
                    }
                    if (len.numE(ONE_INTEGER)) {
                        format(T, $str_alt109$__One_form_evaluated_);
                    } else {
                        format(T, $str_alt110$___s_forms_evaluated_, len);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject present_forms_to_eval(final SubLObject forms_to_eval) {
        if (NIL != forms_to_eval) {
            format(T, $str101$_________________________________);
            final SubLObject len = length(forms_to_eval);
            format(T, $str105$____New_forms_to_evaluate_);
            print_list(forms_to_eval, T, $DOUBLE, TWO_INTEGER);
            if (NIL != (len.numE(ONE_INTEGER) ? UserIO.user_confirm($str107$__Evaluate_the_form_above_now__) : UserIO.user_confirm(format(NIL, $str108$__Evaluate_the__s_forms_above_now, len)))) {
                SubLObject cdolist_list_var = forms_to_eval;
                SubLObject f = NIL;
                f = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    eval(f);
                    cdolist_list_var = cdolist_list_var.rest();
                    f = cdolist_list_var.first();
                } 
                if (len.numE(ONE_INTEGER)) {
                    format(T, $str109$__One_form_evaluated_);
                } else {
                    format(T, $str110$___s_forms_evaluated_, len);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject maybe_eval_forms_alt() {
        {
            SubLObject malformed = ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
            SubLObject forms_to_eval = ke_utilities.ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL);
            SubLObject already_in_kb = ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB);
            SubLObject not_in_kb = ke_utilities.ke_value(operation_communication.the_cyclist(), $NOT_IN_KB);
            SubLObject not_valid_constants = ke_utilities.ke_value(operation_communication.the_cyclist(), $NOT_VALID_CONSTANTS);
            SubLObject already_constants = ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_CONSTANTS);
            if (NIL != malformed) {
                format(T, $str_alt111$____Please_check_the_input_file__);
                com.cyc.cycjava.cycl.ke_file.print_list(malformed, T, $DOUBLE, TWO_INTEGER);
            } else {
                com.cyc.cycjava.cycl.ke_file.print_forms_2(already_in_kb, $str_alt112$These_assertions_are_already_in_t);
                com.cyc.cycjava.cycl.ke_file.print_forms_3(not_in_kb, $str_alt113$These_assertions_are_not_in_the_K);
                com.cyc.cycjava.cycl.ke_file.print_forms_1(not_valid_constants, $str_alt114$These_strings_are_not_names_of_va);
                com.cyc.cycjava.cycl.ke_file.print_forms_1(already_constants, $str_alt115$These_strings_are_already_the_nam);
                com.cyc.cycjava.cycl.ke_file.present_forms_to_eval(forms_to_eval);
            }
        }
        com.cyc.cycjava.cycl.ke_file.graceful_quit();
        return NIL;
    }

    public static SubLObject maybe_eval_forms() {
        final SubLObject malformed = ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
        final SubLObject forms_to_eval = ke_utilities.ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL);
        final SubLObject already_in_kb = ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB);
        final SubLObject not_in_kb = ke_utilities.ke_value(operation_communication.the_cyclist(), $NOT_IN_KB);
        final SubLObject not_valid_constants = ke_utilities.ke_value(operation_communication.the_cyclist(), $NOT_VALID_CONSTANTS);
        final SubLObject already_constants = ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_CONSTANTS);
        if (NIL != malformed) {
            format(T, $str111$____Please_check_the_input_file__);
            print_list(malformed, T, $DOUBLE, TWO_INTEGER);
        } else {
            print_forms_2(already_in_kb, $str112$These_assertions_are_already_in_t);
            print_forms_3(not_in_kb, $str113$These_assertions_are_not_in_the_K);
            print_forms_1(not_valid_constants, $str114$These_strings_are_not_names_of_va);
            print_forms_1(already_constants, $str115$These_strings_are_already_the_nam);
            present_forms_to_eval(forms_to_eval);
        }
        graceful_quit();
        return NIL;
    }

    public static final SubLObject graceful_quit_alt() {
        format(T, $str_alt116$____Returning_to_Lisp_Interactor_);
        return NIL;
    }

    public static SubLObject graceful_quit() {
        format(T, $str116$____Returning_to_Lisp_Interactor_);
        return NIL;
    }

    /**
     * called only from html-ke-file
     */
    @LispMethod(comment = "called only from html-ke-file")
    public static final SubLObject unknown_constants_in_listP_alt(SubLObject list) {
        if (NIL == list) {
            return NIL;
        } else {
            if (NIL == fi.fi_find_int(list.first())) {
                return T;
            } else {
                return com.cyc.cycjava.cycl.ke_file.unknown_constants_in_listP(list.rest());
            }
        }
    }

    @LispMethod(comment = "called only from html-ke-file")
    public static SubLObject unknown_constants_in_listP(final SubLObject list) {
        if (NIL == list) {
            return NIL;
        }
        if (NIL == fi.fi_find_int(list.first())) {
            return T;
        }
        return unknown_constants_in_listP(list.rest());
    }/**
     * called only from html-ke-file
     */


    public static final SubLObject check_and_poll_alt() {
        {
            SubLObject unknowns = ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS);
            if (NIL != com.cyc.cycjava.cycl.ke_file.unknown_constants_in_listP(unknowns)) {
                if (NIL != UserIO.user_confirm($str_alt118$____Waiting_for_create_operations)) {
                    return com.cyc.cycjava.cycl.ke_file.check_and_poll();
                } else {
                    return NIL;
                }
            } else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $UNKNOWNS, UNPROVIDED, UNPROVIDED);
                return T;
            }
        }
    }

    public static SubLObject check_and_poll() {
        final SubLObject unknowns = ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS);
        if (NIL == unknown_constants_in_listP(unknowns)) {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $UNKNOWNS, UNPROVIDED, UNPROVIDED);
            return T;
        }
        if (NIL != UserIO.user_confirm($str118$____Waiting_for_create_operations)) {
            return check_and_poll();
        }
        return NIL;
    }

    public static final SubLObject check_and_maybe_eval_alt(SubLObject file) {
        {
            SubLObject malformed = ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
            SubLObject ok = ke_utilities.ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS);
            if (!((NIL != malformed) || (NIL != ok))) {
                format(T, $str_alt119$____Problem_loading_file__s_, file);
                format(T, $str_alt120$____The_file_contains_fatal_synta);
                com.cyc.cycjava.cycl.ke_file.graceful_quit();
            } else {
                if (NIL != malformed) {
                    format(T, $str_alt121$____Please_check_the_input_file_f);
                    com.cyc.cycjava.cycl.ke_file.print_list(malformed, T, $DOUBLE, TWO_INTEGER);
                    com.cyc.cycjava.cycl.ke_file.graceful_quit();
                } else {
                    if (NIL != ok) {
                        {
                            SubLObject unknowns = com.cyc.cycjava.cycl.ke_file.unknown_constants_among_tokens(ok);
                            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $UNKNOWNS, $REPLACE, unknowns);
                            if (NIL != unknowns) {
                                format(T, $str_alt122$____Unknown_constants__or_constan);
                                com.cyc.cycjava.cycl.ke_file.print_list(ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS), T, $SINGLE, TWO_INTEGER);
                                if (NIL != UserIO.user_confirm($str_alt123$____Make_Cyc_constants_of_the_str)) {
                                    format(T, $str_alt124$__OK___Be_sure_to_give_new_consta);
                                    ke_utilities.constantify(ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS));
                                    if (NIL != com.cyc.cycjava.cycl.ke_file.check_and_poll()) {
                                        com.cyc.cycjava.cycl.ke_file.build_eval_form_list();
                                        com.cyc.cycjava.cycl.ke_file.maybe_eval_forms();
                                    }
                                } else {
                                    com.cyc.cycjava.cycl.ke_file.graceful_quit();
                                }
                            } else {
                                com.cyc.cycjava.cycl.ke_file.build_eval_form_list();
                                com.cyc.cycjava.cycl.ke_file.maybe_eval_forms();
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject check_and_maybe_eval(final SubLObject file) {
        final SubLObject malformed = ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
        final SubLObject ok = ke_utilities.ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS);
        if ((NIL == malformed) && (NIL == ok)) {
            format(T, $str119$____Problem_loading_file__s_, file);
            format(T, $str120$____The_file_contains_fatal_synta);
            graceful_quit();
        } else
            if (NIL != malformed) {
                format(T, $str121$____Please_check_the_input_file_f);
                print_list(malformed, T, $DOUBLE, TWO_INTEGER);
                graceful_quit();
            } else
                if (NIL != ok) {
                    final SubLObject unknowns = unknown_constants_among_tokens(ok);
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $UNKNOWNS, $REPLACE, unknowns);
                    if (NIL != unknowns) {
                        format(T, $str122$____Unknown_constants__or_constan);
                        print_list(ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS), T, $SINGLE, TWO_INTEGER);
                        if (NIL != UserIO.user_confirm($str123$____Make_Cyc_constants_of_the_str)) {
                            format(T, $str124$__OK___Be_sure_to_give_new_consta);
                            ke_utilities.constantify(ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS));
                            if (NIL != check_and_poll()) {
                                build_eval_form_list();
                                maybe_eval_forms();
                            }
                        } else {
                            graceful_quit();
                        }
                    } else {
                        build_eval_form_list();
                        maybe_eval_forms();
                    }
                }


        return NIL;
    }

    /**
     * Top level access to the lisp interactor version of ke-file.
     * Takes a cyclist (string or constant) and a file (string) as input
     */
    @LispMethod(comment = "Top level access to the lisp interactor version of ke-file.\r\nTakes a cyclist (string or constant) and a file (string) as input\nTop level access to the lisp interactor version of ke-file.\nTakes a cyclist (string or constant) and a file (string) as input")
    public static final SubLObject ke_file_alt(SubLObject cyclist, SubLObject file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_cyclist = operation_communication.the_cyclist();
                try {
                    operation_communication.set_the_cyclist(cyclist.isString() ? ((SubLObject) (fi.fi_find_int(cyclist))) : cyclist);
                    {
                        SubLObject v_boolean = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                v_boolean = kb_accessors.human_cyclistP(operation_communication.the_cyclist());
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if ((NIL != operation_communication.the_cyclist()) && (NIL != v_boolean)) {
                            com.cyc.cycjava.cycl.ke_file.ke_init(operation_communication.the_cyclist());
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(file, $INPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt126$Unable_to_open__S, file);
                                    }
                                    {
                                        SubLObject str = stream;
                                        com.cyc.cycjava.cycl.ke_file.tokenize_read(str, T);
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            com.cyc.cycjava.cycl.ke_file.check_and_maybe_eval(file);
                        } else {
                            format(T, $str_alt127$__Sorry___s_is_not_known_to_be_a_, cyclist);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            operation_communication.set_the_cyclist(old_cyclist);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Top level access to the lisp interactor version of ke-file.\r\nTakes a cyclist (string or constant) and a file (string) as input\nTop level access to the lisp interactor version of ke-file.\nTakes a cyclist (string or constant) and a file (string) as input")
    public static SubLObject ke_file(final SubLObject cyclist, final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_cyclist = operation_communication.the_cyclist();
        try {
            operation_communication.set_the_cyclist(cyclist.isString() ? fi.fi_find_int(cyclist) : cyclist);
            SubLObject v_boolean = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                v_boolean = kb_accessors.human_cyclistP(operation_communication.the_cyclist());
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            if ((NIL != operation_communication.the_cyclist()) && (NIL != v_boolean)) {
                ke_init(operation_communication.the_cyclist());
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(file, $INPUT);
                    if (!stream.isStream()) {
                        Errors.error($str126$Unable_to_open__S, file);
                    }
                    final SubLObject str = stream;
                    tokenize_read(str, T);
                } finally {
                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
                check_and_maybe_eval(file);
            } else {
                format(T, $str127$__Sorry___s_is_not_known_to_be_a_, cyclist);
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                operation_communication.set_the_cyclist(old_cyclist);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }/**
     * Top level access to the lisp interactor version of ke-file.
     * Takes a cyclist (string or constant) and a file (string) as input
     */


    public static SubLObject declare_ke_file_file() {
        declareFunction("make_ke_state_vector", "MAKE-KE-STATE-VECTOR", 0, 0, false);
        declareFunction("get_ke_state", "GET-KE-STATE", 1, 0, false);
        declareFunction("add_ke_vector", "ADD-KE-VECTOR", 1, 0, false);
        declareFunction("reset_ke_state", "RESET-KE-STATE", 1, 0, false);
        declareFunction("return_ke_state", "RETURN-KE-STATE", 1, 0, false);
        declareFunction("print_ke_state", "PRINT-KE-STATE", 1, 0, false);
        declareFunction("clear_ke_state", "CLEAR-KE-STATE", 1, 2, false);
        declareFunction("blast_ke_state", "BLAST-KE-STATE", 0, 0, false);
        declareFunction("ke_init", "KE-INIT", 1, 0, false);
        declareFunction("ke_set_dispatch_table", "KE-SET-DISPATCH-TABLE", 0, 0, false);
        declareFunction("dispatch_on_test", "DISPATCH-ON-TEST", 1, 0, false);
        declareFunction("ids_from_sentence", "IDS-FROM-SENTENCE", 2, 0, false);
        declareFunction("source_type", "SOURCE-TYPE", 2, 0, false);
        declareFunction("filter_out_ok_constants", "FILTER-OUT-OK-CONSTANTS", 1, 0, false);
        declareFunction("except_ke_chars", "EXCEPT-KE-CHARS", 1, 0, false);
        declareFunction("get_unknown_constants", "GET-UNKNOWN-CONSTANTS", 1, 0, false);
        declareFunction("frob_comments", "FROB-COMMENTS", 1, 0, false);
        declareFunction("count_tokens", "COUNT-TOKENS", 2, 0, false);
        declareFunction("lpP", "LP?", 1, 0, false);
        declareFunction("rpP", "RP?", 1, 0, false);
        declareFunction("spaceP", "SPACE?", 1, 0, false);
        declareFunction("lbrP", "LBR?", 1, 0, false);
        declareFunction("tabP", "TAB?", 1, 0, false);
        declareFunction("dquoteP", "DQUOTE?", 1, 0, false);
        declareFunction("periodP", "PERIOD?", 1, 0, false);
        declareFunction("semiP", "SEMI?", 1, 0, false);
        declareFunction("colonP", "COLON?", 1, 0, false);
        declareFunction("dol_signP", "DOL-SIGN?", 1, 0, false);
        declareFunction("whitespace_char_p", "WHITESPACE-CHAR-P", 1, 0, false);
        declareFunction("ke_file_tokenize_string", "KE-FILE-TOKENIZE-STRING", 1, 0, false);
        declareFunction("ke_read_from_stream", "KE-READ-FROM-STREAM", 1, 0, false);
        declareFunction("ke_input_from_string", "KE-INPUT-FROM-STRING", 1, 0, false);
        declareFunction("nested_parens_in_stringP", "NESTED-PARENS-IN-STRING?", 1, 0, false);
        declareFunction("unary_predicateP", "UNARY-PREDICATE?", 1, 0, false);
        declareFunction("non_unary_predicateP", "NON-UNARY-PREDICATE?", 1, 0, false);
        declareFunction("malformedP", "MALFORMED?", 1, 0, false);
        declareFunction("tokenize_read", "TOKENIZE-READ", 1, 1, false);
        declareFunction("unknown_constants_among_tokens", "UNKNOWN-CONSTANTS-AMONG-TOKENS", 1, 0, false);
        declareFunction("give_upP", "GIVE-UP?", 1, 0, false);
        declareFunction("constant_dirP", "CONSTANT-DIR?", 1, 0, false);
        declareFunction("rename_dirP", "RENAME-DIR?", 1, 0, false);
        declareFunction("mode_dirP", "MODE-DIR?", 1, 0, false);
        declareFunction("probably_unaryP", "PROBABLY-UNARY?", 1, 0, false);
        declareFunction("kill_dirP", "KILL-DIR?", 1, 0, false);
        declareFunction("mt_dirP", "MT-DIR?", 1, 0, false);
        declareFunction("default_mt_dirP", "DEFAULT-MT-DIR?", 1, 0, false);
        declareFunction("el_dirP", "EL-DIR?", 1, 0, false);
        declareFunction("tv_dirP", "TV-DIR?", 1, 0, false);
        declareFunction("direction_dirP", "DIRECTION-DIR?", 1, 0, false);
        declareFunction("probably_non_unaryP", "PROBABLY-NON-UNARY?", 1, 0, false);
        declareFunction("set_constant", "SET-CONSTANT", 1, 0, false);
        declareFunction("set_mt", "SET-MT", 1, 0, false);
        declareFunction("set_default_mt", "SET-DEFAULT-MT", 1, 0, false);
        declareFunction("set_tv", "SET-TV", 1, 0, false);
        declareFunction("set_direction", "SET-DIRECTION", 1, 0, false);
        declareFunction("set_mode", "SET-MODE", 1, 0, false);
        declareFunction("set_direction_to_use", "SET-DIRECTION-TO-USE", 1, 0, false);
        declareFunction("already_in_kbP", "ALREADY-IN-KB?", 2, 0, false);
        declareFunction("handle_el_expr", "HANDLE-EL-EXPR", 1, 0, false);
        declareFunction("non_binary_predicateP", "NON-BINARY-PREDICATE?", 1, 0, false);
        declareFunction("handle_probably_non_unary", "HANDLE-PROBABLY-NON-UNARY", 1, 0, false);
        declareFunction("handle_probably_unary", "HANDLE-PROBABLY-UNARY", 1, 0, false);
        declareFunction("handle_rename", "HANDLE-RENAME", 1, 0, false);
        declareFunction("handle_kill", "HANDLE-KILL", 1, 0, false);
        declareFunction("handle_problem", "HANDLE-PROBLEM", 1, 0, false);
        declareFunction("print_list", "PRINT-LIST", 2, 2, false);
        declareFunction("build_eval_form_list", "BUILD-EVAL-FORM-LIST", 0, 0, false);
        declareFunction("print_forms_2", "PRINT-FORMS-2", 1, 1, false);
        declareFunction("print_forms_3", "PRINT-FORMS-3", 1, 1, false);
        declareFunction("print_forms_1", "PRINT-FORMS-1", 1, 1, false);
        declareFunction("present_forms_to_eval", "PRESENT-FORMS-TO-EVAL", 1, 0, false);
        declareFunction("maybe_eval_forms", "MAYBE-EVAL-FORMS", 0, 0, false);
        declareFunction("graceful_quit", "GRACEFUL-QUIT", 0, 0, false);
        declareFunction("unknown_constants_in_listP", "UNKNOWN-CONSTANTS-IN-LIST?", 1, 0, false);
        declareFunction("check_and_poll", "CHECK-AND-POLL", 0, 0, false);
        declareFunction("check_and_maybe_eval", "CHECK-AND-MAYBE-EVAL", 1, 0, false);
        declareFunction("ke_file", "KE-FILE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_ke_file_file() {
        defparameter("*KE-ACTION-DISPATCH-TABLE*", NIL);
        defparameter("*KE-STATE-DEFAULTS*", bq_cons(bq_cons($MT, mt_vars.$default_assert_mt$.getGlobalValue()), $list1));
        defparameter("*KE-FILE-RESERVED-WORDS*", $list2);
        return NIL;
    }

    public static SubLObject setup_ke_file_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ke_file_file();
    }

    @Override
    public void initializeVariables() {
        init_ke_file_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ke_file_file();
    }

    static {
    }

    static private final SubLList $list_alt1 = list(cons(makeKeyword("TV"), makeKeyword("UNKNOWN")), cons(makeKeyword("DIRECTION"), makeKeyword("UNKNOWN")), cons($MODE, makeKeyword("ENTER")), cons(makeKeyword("APPLICATION"), makeKeyword("KE-FILE")));

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeString("EL"), makeString("F"), makeString("nil"), makeString("t"), makeString("Unit"), makeString("Constant"), makeString("Access"), makeString("Level"), makeString("AL"), makeString("Direction"), makeString("D"), makeString("In"), makeString("Mt"), makeString("forward"), makeString(":forward"), makeString("backward"), makeString(":backward"), makeString("code"), makeString(":code"), makeString("default"), makeString(":default"), makeString("monotonic"), makeString(":monotonic"), makeString("unknown"), makeString(":unknown"), makeString("TV"), makeString("Truth"), makeString("Value"), makeString("enter"), makeString("delete"), makeString("rename"), makeString("kill") });

    static private final SubLList $list_alt4 = list(makeKeyword("COMPOSE-HISTORY"));

    static private final SubLString $str_alt6$___s____s = makeString("~%~s : ~s");

    static private final SubLList $list_alt7 = list(new SubLObject[]{ cons(makeSymbol("CONSTANT-DIR?"), makeSymbol("SET-CONSTANT")), cons(makeSymbol("MT-DIR?"), makeSymbol("SET-MT")), cons(makeSymbol("DEFAULT-MT-DIR?"), makeSymbol("SET-DEFAULT-MT")), cons(makeSymbol("EL-DIR?"), makeSymbol("HANDLE-EL-EXPR")), cons(makeSymbol("TV-DIR?"), makeSymbol("SET-TV")), cons(makeSymbol("DIRECTION-DIR?"), makeSymbol("SET-DIRECTION")), cons(makeSymbol("MODE-DIR?"), makeSymbol("SET-MODE")), cons(makeSymbol("RENAME-DIR?"), makeSymbol("HANDLE-RENAME")), cons(makeSymbol("KILL-DIR?"), makeSymbol("HANDLE-KILL")), cons(makeSymbol("PROBABLY-UNARY?"), makeSymbol("HANDLE-PROBABLY-UNARY")), cons(makeSymbol("PROBABLY-NON-UNARY?"), makeSymbol("HANDLE-PROBABLY-NON-UNARY")), cons(makeSymbol("GIVE-UP?"), makeSymbol("HANDLE-PROBLEM")) });

    static private final SubLString $str_alt11$_____ = makeString(" #$()");

    static private final SubLList $list_alt13 = list(CHAR_colon, CHAR_quote, CHAR_quotation, CHAR_period);

    static private final SubLString $str_alt14$_ = makeString(";");

    static private final SubLList $list_alt15 = list(TEN_INTEGER, THIRTEEN_INTEGER);

    static private final SubLList $list_alt16 = list(CHAR_space, CHAR_tab);

    static private final SubLList $list_alt17 = list(CHAR_space, CHAR_tab, CHAR_period);

    static private final SubLList $list_alt19 = list(CHAR_space);

    static private final SubLString $str_alt25$_ = makeString(":");

    static private final SubLList $list_alt26 = list(makeString("rename"), makeString(":rename"));

    static private final SubLString $str_alt27$_ = makeString("\"");

    static private final SubLList $list_alt28 = list(makeString("enter"), makeString("delete"));

    static private final SubLList $list_alt29 = list(makeString("EL"), makeString("F"));

    static private final SubLList $list_alt30 = list(makeString("(implies "), makeString("(and "), makeString("(thereExist"), makeString("(or "));

    static private final SubLList $list_alt31 = list(makeString("EL"), makeString("F"), makeString("english"), makeString("comment"), makeString("future"), makeString("cyclistNotes"), makeString("ist"), makeString("informStatement"));

    static private final SubLString $str_alt32$__ = makeString("~%");

    static private final SubLString $str_alt36$___s_token_strings_loaded_ = makeString("~%~s token strings loaded.");

    static private final SubLString $str_alt37$___s_token_strings_processed_ = makeString("~%~s token strings processed.");

    static private final SubLString $str_alt38$_____s_is_not_a_stream_or_a_strin = makeString("~%~%~s is not a stream or a string.");

    static private final SubLString $str_alt40$____Processing_token_strings____ = makeString("~%~%Processing token strings ...");

    static private final SubLString $str_alt42$__Malformed_token_list___s = makeString("~%Malformed token list: ~s");

    static private final SubLList $list_alt43 = list(makeString("unit"), makeString("constant"));

    static private final SubLList $list_alt44 = list(makeString("rename"));

    static private final SubLList $list_alt45 = list(makeString("delete"), makeString("enter"));

    static private final SubLList $list_alt46 = list(makeString("kill"));

    static private final SubLList $list_alt50 = list(makeString("el"), makeString("f"));

    static private final SubLList $list_alt53 = list(makeString(":default"), makeString("default"), makeString(":monotonic"), makeString("monotonic"), makeString(":unknown"), makeString("unknown"));

    static private final SubLList $list_alt55 = list(makeString("al"), makeString("direction"), makeString("d"));

    static private final SubLList $list_alt58 = list(new SubLObject[]{ makeString("unit"), makeString("in"), makeString("el"), makeString("f"), makeString("access"), makeString("al"), makeString("constant"), makeString("d"), makeString("direction"), makeString("tv"), makeString("truth"), makeString("enter"), makeString("delete"), makeString("kill"), makeString("rename") });

    static private final SubLList $list_alt64 = list(makeString(":default"), makeString("default"));

    static private final SubLList $list_alt66 = list(makeString(":monotonic"), makeString("monotonic"));

    static private final SubLList $list_alt68 = list(makeString(":unknown"), makeString("unknown"));

    static private final SubLList $list_alt69 = list(makeString(":forward"), makeString("forward"), makeString("0"));

    static private final SubLList $list_alt71 = list(makeString(":backward"), makeString("backward"), makeString("4"));

    static private final SubLList $list_alt73 = list(makeString(":code"), makeString("code"));

    static private final SubLList $list_alt89 = list(makeKeyword("LOCAL"), makeKeyword("REMOTE"));

    static private final SubLString $str_alt98$___a_s = makeString("~%~a~s");

    static private final SubLString $str_alt99$_____a_s = makeString("~%~%~a~s");

    static private final SubLList $list_alt100 = list(makeKeyword("ALREADY-IN-KB"), makeKeyword("MALFORMED"), makeKeyword("FORMS-TO-EVAL"), makeKeyword("NOT-IN-KB"), makeKeyword("NOT-VALID-CONSTANTS"), makeKeyword("ALREADY-CONSTANTS"));

    static private final SubLString $str_alt101$_________________________________ = makeString("~%~%-------------------------------------------------------");

    static private final SubLString $str_alt102$____ = makeString("~%~%");

    static private final SubLString $str_alt103$_______s_in__s = makeString("~%~%  ~s in ~s");

    static private final SubLString $str_alt104$_______s_is_not_in__s = makeString("~%~%  ~s is not in ~s");

    static private final SubLString $str_alt105$____New_forms_to_evaluate_ = makeString("~%~%New forms to evaluate:");

    static private final SubLString $str_alt107$__Evaluate_the_form_above_now__ = makeString("~%Evaluate the form above now? ");

    static private final SubLString $str_alt108$__Evaluate_the__s_forms_above_now = makeString("~%Evaluate the ~s forms above now? ");

    static private final SubLString $str_alt109$__One_form_evaluated_ = makeString("~%One form evaluated.");

    static private final SubLString $str_alt110$___s_forms_evaluated_ = makeString("~%~s forms evaluated.");

    static private final SubLString $str_alt111$____Please_check_the_input_file__ = makeString("~%~%Please check the input file.~%Some expressions cannot be coerced into CycL.~%Some of these token lists may be malformed:");

    static private final SubLString $str_alt112$These_assertions_are_already_in_t = makeString("These assertions are already in the KB:");

    static private final SubLString $str_alt113$These_assertions_are_not_in_the_K = makeString("These assertions are not in the KB.~%They cannot be deleted:");

    static private final SubLString $str_alt114$These_strings_are_not_names_of_va = makeString("These strings are not names of valid constants.~%They cannot be killed:");

    static private final SubLString $str_alt115$These_strings_are_already_the_nam = makeString("These strings are already the names of constants.~%They cannot be used for renaming:");

    static private final SubLString $str_alt116$____Returning_to_Lisp_Interactor_ = makeString("~%~%Returning to Lisp Interactor.");

    static private final SubLString $str_alt118$____Waiting_for_create_operations = makeString("~%~%Waiting for create operations to be processed...~%Do you want to try to continue now? ");

    static private final SubLString $str_alt119$____Problem_loading_file__s_ = makeString("~%~%Problem loading file ~s.");

    static private final SubLString $str_alt120$____The_file_contains_fatal_synta = makeString("~%~%The file contains fatal syntax errors, or~%cannot be located by the pathname given.");

    static private final SubLString $str_alt121$____Please_check_the_input_file_f = makeString("~%~%Please check the input file for missing parens or periods,~%wrong number of arguments, etc.~%~%These token lists are malformed:");

    static private final SubLString $str_alt122$____Unknown_constants__or_constan = makeString("~%~%Unknown constants, or constants missing ids:~%");

    static private final SubLString $str_alt123$____Make_Cyc_constants_of_the_str = makeString("~%~%Make Cyc constants of the strings listed above? ");

    static private final SubLString $str_alt124$__OK___Be_sure_to_give_new_consta = makeString("~%OK.  Be sure to give new constants an #$isa.~%Be sure to give new collections a #$genls.~%Be sure to give new microtheories a #$genlMt.");

    static private final SubLString $str_alt126$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt127$__Sorry___s_is_not_known_to_be_a_ = makeString("~%Sorry, ~s is not known to be a Cyclist.");
}

/**
 * Total time: 525 ms
 */
