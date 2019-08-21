package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.ke_file;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.ke_file.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class ke_file extends SubLTranslatedFile {
    public static final SubLFile me = new ke_file();

    public static final String myName = "com.cyc.cycjava.cycl.ke_file";

    public static final String myFingerPrint = "b76359d913e21333624ec30daf4790e275c7a9fce50a380398279cc60a2ed9bb";

    // defparameter
    private static final SubLSymbol $ke_action_dispatch_table$ = makeSymbol("*KE-ACTION-DISPATCH-TABLE*");

    // defparameter
    private static final SubLSymbol $ke_state_defaults$ = makeSymbol("*KE-STATE-DEFAULTS*");

    // defparameter
    private static final SubLSymbol $ke_file_reserved_words$ = makeSymbol("*KE-FILE-RESERVED-WORDS*");



    public static final SubLList $list1 = list(cons(makeKeyword("TV"), makeKeyword("UNKNOWN")), cons(makeKeyword("DIRECTION"), makeKeyword("UNKNOWN")), cons(makeKeyword("MODE"), makeKeyword("ENTER")), cons(makeKeyword("APPLICATION"), makeKeyword("KE-FILE")));

    public static final SubLList $list2 = list(new SubLObject[]{ makeString("EL"), makeString("F"), makeString("nil"), makeString("t"), makeString("Unit"), makeString("Constant"), makeString("Access"), makeString("Level"), makeString("AL"), makeString("Direction"), makeString("D"), makeString("In"), makeString("Mt"), makeString("forward"), makeString(":forward"), makeString("backward"), makeString(":backward"), makeString("code"), makeString(":code"), makeString("default"), makeString(":default"), makeString("monotonic"), makeString(":monotonic"), makeString("unknown"), makeString(":unknown"), makeString("TV"), makeString("Truth"), makeString("Value"), makeString("enter"), makeString("delete"), makeString("rename"), makeString("kill") });



    public static final SubLList $list4 = list(makeKeyword("COMPOSE-HISTORY"));



    public static final SubLString $str6$___s____s = makeString("~%~s : ~s");

    public static final SubLList $list7 = list(new SubLObject[]{ cons(makeSymbol("CONSTANT-DIR?"), makeSymbol("SET-CONSTANT")), cons(makeSymbol("MT-DIR?"), makeSymbol("SET-MT")), cons(makeSymbol("DEFAULT-MT-DIR?"), makeSymbol("SET-DEFAULT-MT")), cons(makeSymbol("EL-DIR?"), makeSymbol("HANDLE-EL-EXPR")), cons(makeSymbol("TV-DIR?"), makeSymbol("SET-TV")), cons(makeSymbol("DIRECTION-DIR?"), makeSymbol("SET-DIRECTION")), cons(makeSymbol("MODE-DIR?"), makeSymbol("SET-MODE")), cons(makeSymbol("RENAME-DIR?"), makeSymbol("HANDLE-RENAME")), cons(makeSymbol("KILL-DIR?"), makeSymbol("HANDLE-KILL")), cons(makeSymbol("PROBABLY-UNARY?"), makeSymbol("HANDLE-PROBABLY-UNARY")), cons(makeSymbol("PROBABLY-NON-UNARY?"), makeSymbol("HANDLE-PROBABLY-NON-UNARY")), cons(makeSymbol("GIVE-UP?"), makeSymbol("HANDLE-PROBLEM")) });







    public static final SubLString $str11$_____ = makeString(" #$()");

    public static final SubLSymbol EXCEPT_KE_CHARS = makeSymbol("EXCEPT-KE-CHARS");

    public static final SubLList $list13 = list(CHAR_colon, CHAR_quote, CHAR_quotation, CHAR_period);

    public static final SubLString $str14$_ = makeString(";");

    public static final SubLList $list15 = list(TEN_INTEGER, THIRTEEN_INTEGER);

    public static final SubLList $list16 = list(CHAR_space, CHAR_tab);

    public static final SubLList $list17 = list(CHAR_space, CHAR_tab, CHAR_period);



    public static final SubLList $list19 = list(CHAR_space);





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$UnaryPredicate = reader_make_constant_shell(makeString("UnaryPredicate"));

    private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));

    public static final SubLString $str25$_ = makeString(":");

    public static final SubLList $list26 = list(makeString("rename"), makeString(":rename"));

    public static final SubLString $str27$_ = makeString("\"");

    public static final SubLList $list28 = list(makeString("enter"), makeString("delete"));

    public static final SubLList $list29 = list(makeString("EL"), makeString("F"));

    public static final SubLList $list30 = list(makeString("(implies "), makeString("(and "), makeString("(thereExist"), makeString("(or "));

    public static final SubLList $list31 = list(makeString("EL"), makeString("F"), makeString("english"), makeString("comment"), makeString("future"), makeString("cyclistNotes"), makeString("ist"), makeString("informStatement"));

    public static final SubLString $str32$__ = makeString("~%");





    private static final SubLSymbol $OK_TOKEN_FORMS = makeKeyword("OK-TOKEN-FORMS");

    public static final SubLString $str36$___s_token_strings_loaded_ = makeString("~%~s token strings loaded.");

    public static final SubLString $str37$___s_token_strings_processed_ = makeString("~%~s token strings processed.");

    public static final SubLString $str38$_____s_is_not_a_stream_or_a_strin = makeString("~%~%~s is not a stream or a string.");



    public static final SubLString $str40$____Processing_token_strings____ = makeString("~%~%Processing token strings ...");



    public static final SubLString $str42$__Malformed_token_list___s = makeString("~%Malformed token list: ~s");

    public static final SubLList $list43 = list(makeString("unit"), makeString("constant"));

    public static final SubLList $list44 = list(makeString("rename"));

    public static final SubLList $list45 = list(makeString("delete"), makeString("enter"));

    public static final SubLList $list46 = list(makeString("kill"));

    public static final SubLString $$$in = makeString("in");

    public static final SubLString $$$mt = makeString("mt");

    public static final SubLString $$$default = makeString("default");

    public static final SubLList $list50 = list(makeString("el"), makeString("f"));

    public static final SubLString $$$truth = makeString("truth");

    public static final SubLString $$$value = makeString("value");

    public static final SubLList $list53 = list(makeString(":default"), makeString("default"), makeString(":monotonic"), makeString("monotonic"), makeString(":unknown"), makeString("unknown"));

    public static final SubLString $$$tv = makeString("tv");

    public static final SubLList $list55 = list(makeString("al"), makeString("direction"), makeString("d"));

    public static final SubLString $$$access = makeString("access");

    public static final SubLString $$$level = makeString("level");

    public static final SubLList $list58 = list(new SubLObject[]{ makeString("unit"), makeString("in"), makeString("el"), makeString("f"), makeString("access"), makeString("al"), makeString("constant"), makeString("d"), makeString("direction"), makeString("tv"), makeString("truth"), makeString("enter"), makeString("delete"), makeString("kill"), makeString("rename") });











    public static final SubLList $list64 = list(makeString(":default"), makeString("default"));



    public static final SubLList $list66 = list(makeString(":monotonic"), makeString("monotonic"));



    public static final SubLList $list68 = list(makeString(":unknown"), makeString("unknown"));

    public static final SubLList $list69 = list(makeString(":forward"), makeString("forward"), makeString("0"));



    public static final SubLList $list71 = list(makeString(":backward"), makeString("backward"), makeString("4"));



    public static final SubLList $list73 = list(makeString(":code"), makeString("code"));



    public static final SubLString $$$enter = makeString("enter");





    public static final SubLString $$$delete = makeString("delete");



    private static final SubLObject $$equiv = reader_make_constant_shell(makeString("equiv"));

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));



    private static final SubLSymbol $ALREADY_IN_KB = makeKeyword("ALREADY-IN-KB");



    private static final SubLSymbol $FORMS_TO_EVAL = makeKeyword("FORMS-TO-EVAL");

    public static final SubLSymbol KE_ASSERT = makeSymbol("KE-ASSERT");

    public static final SubLSymbol KE_UNASSERT = makeSymbol("KE-UNASSERT");

    public static final SubLSymbol KE_BLAST = makeSymbol("KE-BLAST");

    public static final SubLList $list89 = list(makeKeyword("LOCAL"), makeKeyword("REMOTE"));

    private static final SubLSymbol $NOT_IN_KB = makeKeyword("NOT-IN-KB");

    private static final SubLObject $$BinaryPredicate = reader_make_constant_shell(makeString("BinaryPredicate"));





    public static final SubLSymbol KE_RENAME = makeSymbol("KE-RENAME");

    public static final SubLSymbol KE_KILL = makeSymbol("KE-KILL");

    private static final SubLSymbol $NOT_VALID_CONSTANTS = makeKeyword("NOT-VALID-CONSTANTS");



    public static final SubLString $str98$___a_s = makeString("~%~a~s");

    public static final SubLString $str99$_____a_s = makeString("~%~%~a~s");

    public static final SubLList $list100 = list(makeKeyword("ALREADY-IN-KB"), makeKeyword("MALFORMED"), makeKeyword("FORMS-TO-EVAL"), makeKeyword("NOT-IN-KB"), makeKeyword("NOT-VALID-CONSTANTS"), makeKeyword("ALREADY-CONSTANTS"));

    public static final SubLString $str101$_________________________________ = makeString("~%~%-------------------------------------------------------");

    public static final SubLString $str102$____ = makeString("~%~%");

    public static final SubLString $str103$_______s_in__s = makeString("~%~%  ~s in ~s");

    public static final SubLString $str104$_______s_is_not_in__s = makeString("~%~%  ~s is not in ~s");

    public static final SubLString $str105$____New_forms_to_evaluate_ = makeString("~%~%New forms to evaluate:");



    public static final SubLString $str107$__Evaluate_the_form_above_now__ = makeString("~%Evaluate the form above now? ");

    public static final SubLString $str108$__Evaluate_the__s_forms_above_now = makeString("~%Evaluate the ~s forms above now? ");

    public static final SubLString $str109$__One_form_evaluated_ = makeString("~%One form evaluated.");

    public static final SubLString $str110$___s_forms_evaluated_ = makeString("~%~s forms evaluated.");

    public static final SubLString $str111$____Please_check_the_input_file__ = makeString("~%~%Please check the input file.~%Some expressions cannot be coerced into CycL.~%Some of these token lists may be malformed:");

    public static final SubLString $str112$These_assertions_are_already_in_t = makeString("These assertions are already in the KB:");

    public static final SubLString $str113$These_assertions_are_not_in_the_K = makeString("These assertions are not in the KB.~%They cannot be deleted:");

    public static final SubLString $str114$These_strings_are_not_names_of_va = makeString("These strings are not names of valid constants.~%They cannot be killed:");

    public static final SubLString $str115$These_strings_are_already_the_nam = makeString("These strings are already the names of constants.~%They cannot be used for renaming:");

    public static final SubLString $str116$____Returning_to_Lisp_Interactor_ = makeString("~%~%Returning to Lisp Interactor.");



    public static final SubLString $str118$____Waiting_for_create_operations = makeString("~%~%Waiting for create operations to be processed...~%Do you want to try to continue now? ");

    public static final SubLString $str119$____Problem_loading_file__s_ = makeString("~%~%Problem loading file ~s.");

    public static final SubLString $str120$____The_file_contains_fatal_synta = makeString("~%~%The file contains fatal syntax errors, or~%cannot be located by the pathname given.");

    public static final SubLString $str121$____Please_check_the_input_file_f = makeString("~%~%Please check the input file for missing parens or periods,~%wrong number of arguments, etc.~%~%These token lists are malformed:");

    public static final SubLString $str122$____Unknown_constants__or_constan = makeString("~%~%Unknown constants, or constants missing ids:~%");

    public static final SubLString $str123$____Make_Cyc_constants_of_the_str = makeString("~%~%Make Cyc constants of the strings listed above? ");

    public static final SubLString $str124$__OK___Be_sure_to_give_new_consta = makeString("~%OK.  Be sure to give new constants an #$isa.~%Be sure to give new collections a #$genls.~%Be sure to give new microtheories a #$genlMt.");



    public static final SubLString $str126$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLString $str127$__Sorry___s_is_not_known_to_be_a_ = makeString("~%Sorry, ~s is not known to be a Cyclist.");

    public static SubLObject make_ke_state_vector() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return misc_utilities.make_indexed_vector(ke_utilities.$ke_state_keys$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject get_ke_state(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user = (cyclist.isString()) ? fi.fi_find_int(cyclist) : cyclist;
        return misc_utilities.get_indexed_obj(user, ke_utilities.$ke_state$.getDynamicValue(thread), UNPROVIDED);
    }

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

    public static SubLObject blast_ke_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ke_set_dispatch_table();
        ke_utilities.$ke_state$.setDynamicValue(NIL, thread);
        return ke_utilities.$ke_state$.getDynamicValue(thread);
    }

    public static SubLObject ke_init(final SubLObject cyclist) {
        add_ke_vector(cyclist);
        clear_ke_state(cyclist, NIL, $list4);
        reset_ke_state(cyclist);
        ke_set_dispatch_table();
        return get_ke_state(cyclist);
    }

    public static SubLObject ke_set_dispatch_table() {
        $ke_action_dispatch_table$.setDynamicValue($list7);
        return NIL;
    }

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

    public static SubLObject ids_from_sentence(final SubLObject sentence, SubLObject mt) {
        if ((NIL == forts.fort_p(mt)) && mt.isCons()) {
            mt = narts_high.find_nart(mt);
        }
        return Mapping.mapcar(symbol_function(ASSERTION_ID), fi.sentence_assertions(sentence, mt));
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

    public static SubLObject except_ke_chars(final SubLObject v_char) {
        return makeBoolean(NIL == find(v_char, $str11$_____, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

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

    public static SubLObject lpP(final SubLObject ch) {
        return charE(ch, CHAR_lparen);
    }

    public static SubLObject rpP(final SubLObject ch) {
        return charE(ch, CHAR_rparen);
    }

    public static SubLObject spaceP(final SubLObject ch) {
        return charE(ch, CHAR_space);
    }

    public static SubLObject lbrP(final SubLObject ch) {
        return list_utilities.sublisp_boolean(find(char_code(ch), $list15, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject tabP(final SubLObject ch) {
        return charE(ch, CHAR_tab);
    }

    public static SubLObject dquoteP(final SubLObject ch) {
        return charE(ch, CHAR_quotation);
    }

    public static SubLObject periodP(final SubLObject ch) {
        return charE(ch, CHAR_period);
    }

    public static SubLObject semiP(final SubLObject ch) {
        return charE(ch, CHAR_semicolon);
    }

    public static SubLObject colonP(final SubLObject ch) {
        return charE(ch, CHAR_colon);
    }

    public static SubLObject dol_signP(final SubLObject ch) {
        return charE(ch, CHAR_dollar);
    }

    public static SubLObject whitespace_char_p(final SubLObject ch) {
        return makeBoolean((NIL != find(ch, $list16, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == ke_utilities.printable_ascii_charP(ch)));
    }

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

    public static SubLObject nested_parens_in_stringP(final SubLObject string) {
        return makeBoolean((string.isString() && string_utilities.count_chars_in_string(string, CHAR_lparen).numG(ONE_INTEGER)) && (NIL != ke_utilities.parens_equalP(string)));
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

    public static SubLObject give_upP(final SubLObject token_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke_utilities.$ke_debug$.getDynamicValue(thread)) {
            format(T, $str42$__Malformed_token_list___s, token_list);
        }
        return T;
    }

    public static SubLObject constant_dirP(final SubLObject token_list) {
        return makeBoolean((length(token_list).numE(THREE_INTEGER) && (NIL != member(token_list.first(), $list43, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_));
    }

    public static SubLObject rename_dirP(final SubLObject token_list) {
        return makeBoolean((length(token_list).numE(FOUR_INTEGER) && (NIL != member(token_list.first(), $list44, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_));
    }

    public static SubLObject mode_dirP(final SubLObject token_list) {
        return makeBoolean(length(token_list).numE(ONE_INTEGER) && (NIL != member(token_list.first(), $list45, symbol_function(EQUALP), UNPROVIDED)));
    }

    public static SubLObject probably_unaryP(final SubLObject token_list) {
        return makeBoolean(length(token_list).numE(ONE_INTEGER) && (NIL == subl_promotions.memberP(token_list.first(), $list28, symbol_function(EQUALP), UNPROVIDED)));
    }

    public static SubLObject kill_dirP(final SubLObject token_list) {
        return makeBoolean((length(token_list).numGE(THREE_INTEGER) && (NIL != member(token_list.first(), $list46, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_));
    }

    public static SubLObject mt_dirP(final SubLObject token_list) {
        return makeBoolean(((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$in)) && second(token_list).equalp($$$mt)) && third(token_list).equalp($str25$_));
    }

    public static SubLObject default_mt_dirP(final SubLObject token_list) {
        return makeBoolean(((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$default)) && second(token_list).equalp($$$mt)) && third(token_list).equalp($str25$_));
    }

    public static SubLObject el_dirP(final SubLObject token_list) {
        return makeBoolean((length(token_list).numGE(THREE_INTEGER) && (NIL != member(token_list.first(), $list50, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_));
    }

    public static SubLObject tv_dirP(final SubLObject token_list) {
        return makeBoolean(((((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$truth)) && second(token_list).equalp($$$value)) && third(token_list).equalp($str25$_)) && (NIL != member(fourth(token_list), $list53, symbol_function(EQUALP), UNPROVIDED))) || (((length(token_list).numE(THREE_INTEGER) && token_list.first().equalp($$$tv)) && second(token_list).equalp($str25$_)) && (NIL != member(third(token_list), $list53, symbol_function(EQUALP), UNPROVIDED))));
    }

    public static SubLObject direction_dirP(final SubLObject token_list) {
        return makeBoolean(((length(token_list).numE(THREE_INTEGER) && (NIL != member(token_list.first(), $list55, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_)) || (((length(token_list).numE(FOUR_INTEGER) && token_list.first().equalp($$$access)) && second(token_list).equalp($$$level)) && third(token_list).equalp($str25$_)));
    }

    public static SubLObject probably_non_unaryP(final SubLObject token_list) {
        return makeBoolean((length(token_list).numGE(THREE_INTEGER) && (NIL == member(token_list.first(), $list58, symbol_function(EQUALP), UNPROVIDED))) && second(token_list).equalp($str25$_));
    }

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

    public static SubLObject non_binary_predicateP(final SubLObject pred) {
        return makeBoolean((NIL != fort_types_interface.predicate_p(pred)) && (NIL == isa.isa_in_any_mtP(pred, $$BinaryPredicate)));
    }

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

    public static SubLObject handle_problem(final SubLObject token_list) {
        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $MALFORMED, $CONS, token_list);
        return NIL;
    }

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
    }

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

    public static SubLObject graceful_quit() {
        format(T, $str116$____Returning_to_Lisp_Interactor_);
        return NIL;
    }

    public static SubLObject unknown_constants_in_listP(final SubLObject list) {
        if (NIL == list) {
            return NIL;
        }
        if (NIL == fi.fi_find_int(list.first())) {
            return T;
        }
        return unknown_constants_in_listP(list.rest());
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
    }

    public static SubLObject declare_ke_file_file() {
        declareFunction(me, "make_ke_state_vector", "MAKE-KE-STATE-VECTOR", 0, 0, false);
        declareFunction(me, "get_ke_state", "GET-KE-STATE", 1, 0, false);
        declareFunction(me, "add_ke_vector", "ADD-KE-VECTOR", 1, 0, false);
        declareFunction(me, "reset_ke_state", "RESET-KE-STATE", 1, 0, false);
        declareFunction(me, "return_ke_state", "RETURN-KE-STATE", 1, 0, false);
        declareFunction(me, "print_ke_state", "PRINT-KE-STATE", 1, 0, false);
        declareFunction(me, "clear_ke_state", "CLEAR-KE-STATE", 1, 2, false);
        declareFunction(me, "blast_ke_state", "BLAST-KE-STATE", 0, 0, false);
        declareFunction(me, "ke_init", "KE-INIT", 1, 0, false);
        declareFunction(me, "ke_set_dispatch_table", "KE-SET-DISPATCH-TABLE", 0, 0, false);
        declareFunction(me, "dispatch_on_test", "DISPATCH-ON-TEST", 1, 0, false);
        declareFunction(me, "ids_from_sentence", "IDS-FROM-SENTENCE", 2, 0, false);
        declareFunction(me, "source_type", "SOURCE-TYPE", 2, 0, false);
        declareFunction(me, "filter_out_ok_constants", "FILTER-OUT-OK-CONSTANTS", 1, 0, false);
        declareFunction(me, "except_ke_chars", "EXCEPT-KE-CHARS", 1, 0, false);
        declareFunction(me, "get_unknown_constants", "GET-UNKNOWN-CONSTANTS", 1, 0, false);
        declareFunction(me, "frob_comments", "FROB-COMMENTS", 1, 0, false);
        declareFunction(me, "count_tokens", "COUNT-TOKENS", 2, 0, false);
        declareFunction(me, "lpP", "LP?", 1, 0, false);
        declareFunction(me, "rpP", "RP?", 1, 0, false);
        declareFunction(me, "spaceP", "SPACE?", 1, 0, false);
        declareFunction(me, "lbrP", "LBR?", 1, 0, false);
        declareFunction(me, "tabP", "TAB?", 1, 0, false);
        declareFunction(me, "dquoteP", "DQUOTE?", 1, 0, false);
        declareFunction(me, "periodP", "PERIOD?", 1, 0, false);
        declareFunction(me, "semiP", "SEMI?", 1, 0, false);
        declareFunction(me, "colonP", "COLON?", 1, 0, false);
        declareFunction(me, "dol_signP", "DOL-SIGN?", 1, 0, false);
        declareFunction(me, "whitespace_char_p", "WHITESPACE-CHAR-P", 1, 0, false);
        declareFunction(me, "ke_file_tokenize_string", "KE-FILE-TOKENIZE-STRING", 1, 0, false);
        declareFunction(me, "ke_read_from_stream", "KE-READ-FROM-STREAM", 1, 0, false);
        declareFunction(me, "ke_input_from_string", "KE-INPUT-FROM-STRING", 1, 0, false);
        declareFunction(me, "nested_parens_in_stringP", "NESTED-PARENS-IN-STRING?", 1, 0, false);
        declareFunction(me, "unary_predicateP", "UNARY-PREDICATE?", 1, 0, false);
        declareFunction(me, "non_unary_predicateP", "NON-UNARY-PREDICATE?", 1, 0, false);
        declareFunction(me, "malformedP", "MALFORMED?", 1, 0, false);
        declareFunction(me, "tokenize_read", "TOKENIZE-READ", 1, 1, false);
        declareFunction(me, "unknown_constants_among_tokens", "UNKNOWN-CONSTANTS-AMONG-TOKENS", 1, 0, false);
        declareFunction(me, "give_upP", "GIVE-UP?", 1, 0, false);
        declareFunction(me, "constant_dirP", "CONSTANT-DIR?", 1, 0, false);
        declareFunction(me, "rename_dirP", "RENAME-DIR?", 1, 0, false);
        declareFunction(me, "mode_dirP", "MODE-DIR?", 1, 0, false);
        declareFunction(me, "probably_unaryP", "PROBABLY-UNARY?", 1, 0, false);
        declareFunction(me, "kill_dirP", "KILL-DIR?", 1, 0, false);
        declareFunction(me, "mt_dirP", "MT-DIR?", 1, 0, false);
        declareFunction(me, "default_mt_dirP", "DEFAULT-MT-DIR?", 1, 0, false);
        declareFunction(me, "el_dirP", "EL-DIR?", 1, 0, false);
        declareFunction(me, "tv_dirP", "TV-DIR?", 1, 0, false);
        declareFunction(me, "direction_dirP", "DIRECTION-DIR?", 1, 0, false);
        declareFunction(me, "probably_non_unaryP", "PROBABLY-NON-UNARY?", 1, 0, false);
        declareFunction(me, "set_constant", "SET-CONSTANT", 1, 0, false);
        declareFunction(me, "set_mt", "SET-MT", 1, 0, false);
        declareFunction(me, "set_default_mt", "SET-DEFAULT-MT", 1, 0, false);
        declareFunction(me, "set_tv", "SET-TV", 1, 0, false);
        declareFunction(me, "set_direction", "SET-DIRECTION", 1, 0, false);
        declareFunction(me, "set_mode", "SET-MODE", 1, 0, false);
        declareFunction(me, "set_direction_to_use", "SET-DIRECTION-TO-USE", 1, 0, false);
        declareFunction(me, "already_in_kbP", "ALREADY-IN-KB?", 2, 0, false);
        declareFunction(me, "handle_el_expr", "HANDLE-EL-EXPR", 1, 0, false);
        declareFunction(me, "non_binary_predicateP", "NON-BINARY-PREDICATE?", 1, 0, false);
        declareFunction(me, "handle_probably_non_unary", "HANDLE-PROBABLY-NON-UNARY", 1, 0, false);
        declareFunction(me, "handle_probably_unary", "HANDLE-PROBABLY-UNARY", 1, 0, false);
        declareFunction(me, "handle_rename", "HANDLE-RENAME", 1, 0, false);
        declareFunction(me, "handle_kill", "HANDLE-KILL", 1, 0, false);
        declareFunction(me, "handle_problem", "HANDLE-PROBLEM", 1, 0, false);
        declareFunction(me, "print_list", "PRINT-LIST", 2, 2, false);
        declareFunction(me, "build_eval_form_list", "BUILD-EVAL-FORM-LIST", 0, 0, false);
        declareFunction(me, "print_forms_2", "PRINT-FORMS-2", 1, 1, false);
        declareFunction(me, "print_forms_3", "PRINT-FORMS-3", 1, 1, false);
        declareFunction(me, "print_forms_1", "PRINT-FORMS-1", 1, 1, false);
        declareFunction(me, "present_forms_to_eval", "PRESENT-FORMS-TO-EVAL", 1, 0, false);
        declareFunction(me, "maybe_eval_forms", "MAYBE-EVAL-FORMS", 0, 0, false);
        declareFunction(me, "graceful_quit", "GRACEFUL-QUIT", 0, 0, false);
        declareFunction(me, "unknown_constants_in_listP", "UNKNOWN-CONSTANTS-IN-LIST?", 1, 0, false);
        declareFunction(me, "check_and_poll", "CHECK-AND-POLL", 0, 0, false);
        declareFunction(me, "check_and_maybe_eval", "CHECK-AND-MAYBE-EVAL", 1, 0, false);
        declareFunction(me, "ke_file", "KE-FILE", 2, 0, false);
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
}

/**
 * Total time: 525 ms
 */
