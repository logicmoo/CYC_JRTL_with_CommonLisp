package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.lexification_reminders;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.lexification_reminders.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class lexification_reminders extends SubLTranslatedFile {
    public static final SubLFile me = new lexification_reminders();

    public static final String myName = "com.cyc.cycjava.cycl.lexification_reminders";

    public static final String myFingerPrint = "af37fb00febe8988200da589fc8968f9f372e7a919ce7ffa8a0214bb9e1661c9";

    // deflexical
    private static final SubLSymbol $termstrings_guessed_pred$ = makeSymbol("*TERMSTRINGS-GUESSED-PRED*");

    // deflexical
    private static final SubLSymbol $termstrings_guessed_mt$ = makeSymbol("*TERMSTRINGS-GUESSED-MT*");

    private static final SubLObject $$termStrings_GuessedFromName = reader_make_constant_shell(makeString("termStrings-GuessedFromName"));

    private static final SubLObject $const1$TemporaryLexicalAssertions_Guesse = reader_make_constant_shell(makeString("TemporaryLexicalAssertions-GuessedMt"));

    public static final SubLSymbol USER_ACTION_P = makeSymbol("USER-ACTION-P");











    public static final SubLString $str8$Adding_lexwiz_reminders_for_unlex = makeString("Adding lexwiz reminders for unlexified terms ...");





    public static SubLObject new_lexification_user_action_user_data(final SubLObject cyc_term, final SubLObject phrase, final SubLObject assertion) {
        return list(cyc_term, phrase, assertion);
    }

    public static SubLObject lexification_user_action_term(final SubLObject action) {
        assert NIL != user_actions.user_action_p(action) : "user_actions.user_action_p(action) " + "CommonSymbols.NIL != user_actions.user_action_p(action) " + action;
        return user_actions.user_action_data(action).first();
    }

    public static SubLObject lexification_user_action_phrase(final SubLObject action) {
        assert NIL != user_actions.user_action_p(action) : "user_actions.user_action_p(action) " + "CommonSymbols.NIL != user_actions.user_action_p(action) " + action;
        return second(user_actions.user_action_data(action));
    }

    public static SubLObject lexification_user_action_assertion(final SubLObject action) {
        assert NIL != user_actions.user_action_p(action) : "user_actions.user_action_p(action) " + "CommonSymbols.NIL != user_actions.user_action_p(action) " + action;
        return third(user_actions.user_action_data(action));
    }

    public static SubLObject add_lexification_todo(final SubLObject cyc_term, SubLObject cyclist, SubLObject phrase, SubLObject assertion) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        if (NIL == forts.fort_p(cyc_term)) {
            return NIL;
        }
        final SubLObject user_data = new_lexification_user_action_user_data(cyc_term, phrase, assertion);
        final SubLObject lex_todo_action = user_actions.new_user_action(list($CYCLIST, cyclist, $TYPE_KEY, $LEXIFICATION_NEEDED, $DATA, user_data));
        return lex_todo_action;
    }

    public static SubLObject add_lex_todo(final SubLObject v_term, SubLObject cyclist, SubLObject phrase, SubLObject assertion) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        return add_lexification_todo(v_term, cyclist, phrase, assertion);
    }

    public static SubLObject remove_lexification_user_action(final SubLObject v_object, final SubLObject user_action) {
        final SubLObject user_data = user_actions.user_action_data(user_action);
        final SubLObject assertion = (user_data.isList()) ? third(user_data) : NIL;
        user_actions.delete_user_action(user_action);
        if ((((lexification_wizard.lexwiz_state(v_object) == $DONE) && (NIL != assertions_high.gaf_assertionP(assertion))) && misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object)).eql(assertions_high.gaf_arg1(assertion))) && lexification_wizard.lexwiz_phrase(v_object).equalp(assertions_high.gaf_arg2(assertion))) {
            misc_kb_utilities.try_unassert(assertions_high.assertion_formula(assertion), assertions_high.assertion_mt(assertion));
        }
        return T;
    }

    public static SubLObject lexification_user_actions(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        return user_actions.all_actions_for_cyclist_of_type(cyclist, $LEXIFICATION_NEEDED);
    }

    public static SubLObject valid_lexification_user_actions(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        SubLObject valid_user_actions = NIL;
        SubLObject cdolist_list_var = lexification_user_actions(cyclist);
        SubLObject action = NIL;
        action = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != valid_lexification_user_actionP(action)) {
                valid_user_actions = cons(action, valid_user_actions);
            } else {
                remove_lexification_user_action_from_queue(action);
            }
            cdolist_list_var = cdolist_list_var.rest();
            action = cdolist_list_var.first();
        } 
        return nreverse(valid_user_actions);
    }

    public static SubLObject valid_lexification_user_actionP(final SubLObject action) {
        final SubLObject term_to_lexify = lexification_user_action_term(action);
        return makeBoolean(((NIL == invalid_constantP(term_to_lexify, UNPROVIDED)) && (NIL == narts_high.invalid_nartP(term_to_lexify, UNPROVIDED))) && ((NIL != cycl_grammar.cycl_nat_p(term_to_lexify)) || (NIL != constant_p(term_to_lexify))));
    }

    public static SubLObject remove_lexification_user_action_from_queue(final SubLObject action) {
        return user_actions.delete_user_action(action);
    }

    public static SubLObject lexify_next_user_action(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        return NIL;
    }

    public static SubLObject find_termstrings_guessed_assertions(final SubLObject v_term) {
        return kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $termstrings_guessed_pred$.getGlobalValue(), $termstrings_guessed_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject add_user_action_lexification_reminders(SubLObject oe_cyclist, SubLObject max_days, SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
        if (oe_cyclist == UNPROVIDED) {
            oe_cyclist = operation_communication.the_cyclist();
        }
        if (max_days == UNPROVIDED) {
            max_days = lexification_utilities.$lexification_check_max_days$.getGlobalValue();
        }
        if (check_termstringsP == UNPROVIDED) {
            check_termstringsP = NIL;
        }
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (todo_cyclist == UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        final SubLObject unlexified_terms = lexification_utilities.unlexified_terms_for_cyclist(oe_cyclist, max_days, check_termstringsP);
        return add_term_lexification_reminders(unlexified_terms, NIL, NIL, max_num, todo_cyclist);
    }

    public static SubLObject add_termstring_lexification_reminders(SubLObject nl_cyclist, SubLObject max_num, SubLObject todo_cyclist) {
        if (nl_cyclist == UNPROVIDED) {
            nl_cyclist = operation_communication.the_cyclist();
        }
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (todo_cyclist == UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        final SubLObject cyclist_termstrings = lexification_utilities.get_termstring_assertions_for_cyclist(nl_cyclist);
        SubLObject num_added = ZERO_INTEGER;
        SubLObject done = NIL;
        if (NIL == done) {
            SubLObject csome_list_var = cyclist_termstrings;
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ((NIL == done) && (NIL != csome_list_var)) {
                if (NIL != assertions_high.gaf_assertionP(assertion)) {
                    final SubLObject v_term = assertions_high.gaf_arg1(assertion);
                    final SubLObject phrase = assertions_high.gaf_arg2(assertion);
                    add_lexification_todo(v_term, todo_cyclist, phrase, assertion);
                    num_added = add(num_added, ONE_INTEGER);
                    done = makeBoolean((NIL != max_num) && num_added.numGE(max_num));
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            } 
        }
        return num_added;
    }

    public static SubLObject add_term_lexification_reminders(final SubLObject term_list, SubLObject just_unlexifiedP, SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
        if (just_unlexifiedP == UNPROVIDED) {
            just_unlexifiedP = NIL;
        }
        if (check_termstringsP == UNPROVIDED) {
            check_termstringsP = NIL;
        }
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (todo_cyclist == UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        SubLObject num_added = ZERO_INTEGER;
        SubLObject done = NIL;
        if (NIL == done) {
            SubLObject csome_list_var = term_list;
            SubLObject v_term = NIL;
            v_term = csome_list_var.first();
            while ((NIL == done) && (NIL != csome_list_var)) {
                if ((NIL == just_unlexifiedP) || (NIL != lexification_utilities.unlexifiedP(v_term, check_termstringsP))) {
                    final SubLObject guessed_termstrings = find_termstrings_guessed_assertions(v_term);
                    final SubLObject assertion = (NIL != guessed_termstrings) ? guessed_termstrings.first() : NIL;
                    final SubLObject phrase = (NIL != assertions_high.gaf_assertionP(assertion)) ? assertions_high.gaf_arg2(assertion) : NIL;
                    if (NIL != add_lexification_todo(v_term, todo_cyclist, phrase, assertion)) {
                        num_added = add(num_added, ONE_INTEGER);
                        done = makeBoolean((NIL != max_num) && num_added.numGE(max_num));
                    }
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            } 
        }
        return num_added;
    }

    public static SubLObject add_term_lexification_reminder(final SubLObject v_term, SubLObject todo_cyclist) {
        if (todo_cyclist == UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        return add_term_lexification_reminders(list(v_term), NIL, NIL, NIL, todo_cyclist);
    }

    public static SubLObject add_lexification_reminders_from_file(final SubLObject filename, SubLObject just_unlexifiedP, SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
        if (just_unlexifiedP == UNPROVIDED) {
            just_unlexifiedP = NIL;
        }
        if (check_termstringsP == UNPROVIDED) {
            check_termstringsP = NIL;
        }
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (todo_cyclist == UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        final SubLObject term_list = misc_kb_utilities.read_terms_from_file(filename);
        return add_term_lexification_reminders(term_list, just_unlexifiedP, check_termstringsP, max_num, todo_cyclist);
    }

    public static SubLObject add_unlexified_term_reminders(SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
        if (check_termstringsP == UNPROVIDED) {
            check_termstringsP = NIL;
        }
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (todo_cyclist == UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject max_count = (NIL != max_num) ? max_num : forts.fort_count();
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $str8$Adding_lexwiz_reminders_for_unlex;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$1 = idx;
                if (NIL == id_index_objects_empty_p(idx_$1, $SKIP)) {
                    final SubLObject idx_$2 = idx_$1;
                    if (NIL == id_index_dense_objects_empty_p(idx_$2, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$2);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject v_term;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            v_term = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(v_term)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(v_term)) {
                                    v_term = $SKIP;
                                }
                                if ((NIL != lexification_utilities.unlexifiedP(v_term, check_termstringsP)) && (!count.numGE(max_count))) {
                                    add_term_lexification_reminder(v_term, todo_cyclist);
                                    count = add(count, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$3 = idx_$1;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$3);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$3);
                        final SubLObject end_id = id_index_next_id(idx_$3);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject v_term2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_term2))) {
                                if ((NIL != lexification_utilities.unlexifiedP(v_term2, check_termstringsP)) && (!count.numGE(max_count))) {
                                    add_term_lexification_reminder(v_term2, todo_cyclist);
                                    count = add(count, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject declare_lexification_reminders_file() {
        declareFunction(me, "new_lexification_user_action_user_data", "NEW-LEXIFICATION-USER-ACTION-USER-DATA", 3, 0, false);
        declareFunction(me, "lexification_user_action_term", "LEXIFICATION-USER-ACTION-TERM", 1, 0, false);
        declareFunction(me, "lexification_user_action_phrase", "LEXIFICATION-USER-ACTION-PHRASE", 1, 0, false);
        declareFunction(me, "lexification_user_action_assertion", "LEXIFICATION-USER-ACTION-ASSERTION", 1, 0, false);
        declareFunction(me, "add_lexification_todo", "ADD-LEXIFICATION-TODO", 1, 3, false);
        declareFunction(me, "add_lex_todo", "ADD-LEX-TODO", 1, 3, false);
        declareFunction(me, "remove_lexification_user_action", "REMOVE-LEXIFICATION-USER-ACTION", 2, 0, false);
        declareFunction(me, "lexification_user_actions", "LEXIFICATION-USER-ACTIONS", 0, 1, false);
        declareFunction(me, "valid_lexification_user_actions", "VALID-LEXIFICATION-USER-ACTIONS", 0, 1, false);
        declareFunction(me, "valid_lexification_user_actionP", "VALID-LEXIFICATION-USER-ACTION?", 1, 0, false);
        declareFunction(me, "remove_lexification_user_action_from_queue", "REMOVE-LEXIFICATION-USER-ACTION-FROM-QUEUE", 1, 0, false);
        declareFunction(me, "lexify_next_user_action", "LEXIFY-NEXT-USER-ACTION", 0, 1, false);
        declareFunction(me, "find_termstrings_guessed_assertions", "FIND-TERMSTRINGS-GUESSED-ASSERTIONS", 1, 0, false);
        declareFunction(me, "add_user_action_lexification_reminders", "ADD-USER-ACTION-LEXIFICATION-REMINDERS", 0, 5, false);
        declareFunction(me, "add_termstring_lexification_reminders", "ADD-TERMSTRING-LEXIFICATION-REMINDERS", 0, 3, false);
        declareFunction(me, "add_term_lexification_reminders", "ADD-TERM-LEXIFICATION-REMINDERS", 1, 4, false);
        declareFunction(me, "add_term_lexification_reminder", "ADD-TERM-LEXIFICATION-REMINDER", 1, 1, false);
        declareFunction(me, "add_lexification_reminders_from_file", "ADD-LEXIFICATION-REMINDERS-FROM-FILE", 1, 4, false);
        declareFunction(me, "add_unlexified_term_reminders", "ADD-UNLEXIFIED-TERM-REMINDERS", 0, 3, false);
        return NIL;
    }

    public static SubLObject init_lexification_reminders_file() {
        deflexical("*TERMSTRINGS-GUESSED-PRED*", $$termStrings_GuessedFromName);
        deflexical("*TERMSTRINGS-GUESSED-MT*", $const1$TemporaryLexicalAssertions_Guesse);
        return NIL;
    }

    public static SubLObject setup_lexification_reminders_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexification_reminders_file();
    }

    @Override
    public void initializeVariables() {
        init_lexification_reminders_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexification_reminders_file();
    }

    static {














    }
}

/**
 * Total time: 166 ms
 */
