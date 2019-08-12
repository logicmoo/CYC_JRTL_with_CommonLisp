/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LEXIFICATION-REMINDERS
 * source file: /cyc/top/cycl/lexification-reminders.lisp
 * created:     2019/07/03 17:38:23
 */
public final class lexification_reminders extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new lexification_reminders();

 public static final String myName = "com.cyc.cycjava.cycl.lexification_reminders";


    // deflexical
    @LispMethod(comment = "Predicate to use for the guessed termStrings\ndeflexical")
    private static final SubLSymbol $termstrings_guessed_pred$ = makeSymbol("*TERMSTRINGS-GUESSED-PRED*");

    // deflexical
    @LispMethod(comment = "MT where the guess termStrings assertions will be placed\ndeflexical")
    private static final SubLSymbol $termstrings_guessed_mt$ = makeSymbol("*TERMSTRINGS-GUESSED-MT*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLObject $$termStrings_GuessedFromName = reader_make_constant_shell("termStrings-GuessedFromName");

    private static final SubLObject $const1$TemporaryLexicalAssertions_Guesse = reader_make_constant_shell("TemporaryLexicalAssertions-GuessedMt");

    private static final SubLSymbol USER_ACTION_P = makeSymbol("USER-ACTION-P");

    static private final SubLString $str8$Adding_lexwiz_reminders_for_unlex = makeString("Adding lexwiz reminders for unlexified terms ...");

    public static final SubLObject new_lexification_user_action_user_data_alt(SubLObject cyc_term, SubLObject phrase, SubLObject assertion) {
        return list(cyc_term, phrase, assertion);
    }

    public static SubLObject new_lexification_user_action_user_data(final SubLObject cyc_term, final SubLObject phrase, final SubLObject assertion) {
        return list(cyc_term, phrase, assertion);
    }

    public static final SubLObject lexification_user_action_term_alt(SubLObject action) {
        SubLTrampolineFile.checkType(action, USER_ACTION_P);
        return user_actions.user_action_data(action).first();
    }

    public static SubLObject lexification_user_action_term(final SubLObject action) {
        assert NIL != user_actions.user_action_p(action) : "! user_actions.user_action_p(action) " + ("user_actions.user_action_p(action) " + "CommonSymbols.NIL != user_actions.user_action_p(action) ") + action;
        return user_actions.user_action_data(action).first();
    }

    public static final SubLObject lexification_user_action_phrase_alt(SubLObject action) {
        SubLTrampolineFile.checkType(action, USER_ACTION_P);
        return second(user_actions.user_action_data(action));
    }

    public static SubLObject lexification_user_action_phrase(final SubLObject action) {
        assert NIL != user_actions.user_action_p(action) : "! user_actions.user_action_p(action) " + ("user_actions.user_action_p(action) " + "CommonSymbols.NIL != user_actions.user_action_p(action) ") + action;
        return second(user_actions.user_action_data(action));
    }

    public static final SubLObject lexification_user_action_assertion_alt(SubLObject action) {
        SubLTrampolineFile.checkType(action, USER_ACTION_P);
        return third(user_actions.user_action_data(action));
    }

    public static SubLObject lexification_user_action_assertion(final SubLObject action) {
        assert NIL != user_actions.user_action_p(action) : "! user_actions.user_action_p(action) " + ("user_actions.user_action_p(action) " + "CommonSymbols.NIL != user_actions.user_action_p(action) ") + action;
        return third(user_actions.user_action_data(action));
    }

    /**
     * Add a user action indicating that CYC-TERM should be lexified with the Lexification Wizard,
     * optionally using label PHRASE and removing termString ASSERTION when done.
     *
     * @return user-action ; the new :lexification-needed user action
     * @unknown This is intended to be invoked when new terms are created, as in @xref fi-create-int, and @xref add-term-of-unit.
     */
    @LispMethod(comment = "Add a user action indicating that CYC-TERM should be lexified with the Lexification Wizard,\r\noptionally using label PHRASE and removing termString ASSERTION when done.\r\n\r\n@return user-action ; the new :lexification-needed user action\r\n@unknown This is intended to be invoked when new terms are created, as in @xref fi-create-int, and @xref add-term-of-unit.\nAdd a user action indicating that CYC-TERM should be lexified with the Lexification Wizard,\noptionally using label PHRASE and removing termString ASSERTION when done.")
    public static final SubLObject add_lexification_todo_alt(SubLObject cyc_term, SubLObject cyclist, SubLObject phrase, SubLObject assertion) {
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
        {
            SubLObject user_data = com.cyc.cycjava.cycl.lexification_reminders.new_lexification_user_action_user_data(cyc_term, phrase, assertion);
            SubLObject lex_todo_action = user_actions.new_user_action(list($CYCLIST, cyclist, $TYPE_KEY, $LEXIFICATION_NEEDED, $DATA, user_data));
            return lex_todo_action;
        }
    }

    /**
     * Add a user action indicating that CYC-TERM should be lexified with the Lexification Wizard,
     * optionally using label PHRASE and removing termString ASSERTION when done.
     *
     * @return user-action ; the new :lexification-needed user action
     * @unknown This is intended to be invoked when new terms are created, as in @xref fi-create-int, and @xref add-term-of-unit.
     */
    @LispMethod(comment = "Add a user action indicating that CYC-TERM should be lexified with the Lexification Wizard,\r\noptionally using label PHRASE and removing termString ASSERTION when done.\r\n\r\n@return user-action ; the new :lexification-needed user action\r\n@unknown This is intended to be invoked when new terms are created, as in @xref fi-create-int, and @xref add-term-of-unit.\nAdd a user action indicating that CYC-TERM should be lexified with the Lexification Wizard,\noptionally using label PHRASE and removing termString ASSERTION when done.")
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

    /**
     * Alias for @xref add-lexification-todo
     */
    @LispMethod(comment = "Alias for @xref add-lexification-todo")
    public static final SubLObject add_lex_todo_alt(SubLObject v_term, SubLObject cyclist, SubLObject phrase, SubLObject assertion) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        return com.cyc.cycjava.cycl.lexification_reminders.add_lexification_todo(v_term, cyclist, phrase, assertion);
    }

    /**
     * Alias for @xref add-lexification-todo
     */
    @LispMethod(comment = "Alias for @xref add-lexification-todo")
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

    /**
     * Remove user-action reminder for lexification and delete the associated termString if any
     */
    @LispMethod(comment = "Remove user-action reminder for lexification and delete the associated termString if any")
    public static final SubLObject remove_lexification_user_action_alt(SubLObject v_object, SubLObject user_action) {
        {
            SubLObject user_data = user_actions.user_action_data(user_action);
            SubLObject assertion = (user_data.isList()) ? ((SubLObject) (third(user_data))) : NIL;
            user_actions.delete_user_action(user_action);
            if ((((lexification_wizard.lexwiz_state(v_object) == $DONE) && (NIL != assertions_high.gaf_assertionP(assertion))) && (misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object)) == assertions_high.gaf_arg1(assertion))) && lexification_wizard.lexwiz_phrase(v_object).equalp(assertions_high.gaf_arg2(assertion))) {
                misc_kb_utilities.try_unassert(assertions_high.assertion_formula(assertion), assertions_high.assertion_mt(assertion));
            }
            return T;
        }
    }

    /**
     * Remove user-action reminder for lexification and delete the associated termString if any
     */
    @LispMethod(comment = "Remove user-action reminder for lexification and delete the associated termString if any")
    public static SubLObject remove_lexification_user_action(final SubLObject v_object, final SubLObject user_action) {
        final SubLObject user_data = user_actions.user_action_data(user_action);
        final SubLObject assertion = (user_data.isList()) ? third(user_data) : NIL;
        user_actions.delete_user_action(user_action);
        if ((((lexification_wizard.lexwiz_state(v_object) == $DONE) && (NIL != assertions_high.gaf_assertionP(assertion))) && misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object)).eql(assertions_high.gaf_arg1(assertion))) && lexification_wizard.lexwiz_phrase(v_object).equalp(assertions_high.gaf_arg2(assertion))) {
            misc_kb_utilities.try_unassert(assertions_high.assertion_formula(assertion), assertions_high.assertion_mt(assertion));
        }
        return T;
    }

    /**
     *
     *
     * @return list ; user actions of type :lexification-needed for CYCLIST
     */
    @LispMethod(comment = "@return list ; user actions of type :lexification-needed for CYCLIST")
    public static final SubLObject lexification_user_actions_alt(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        return user_actions.all_actions_for_cyclist_of_type(cyclist, $LEXIFICATION_NEEDED);
    }

    /**
     *
     *
     * @return list ; user actions of type :lexification-needed for CYCLIST
     */
    @LispMethod(comment = "@return list ; user actions of type :lexification-needed for CYCLIST")
    public static SubLObject lexification_user_actions(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        return user_actions.all_actions_for_cyclist_of_type(cyclist, $LEXIFICATION_NEEDED);
    }

    public static final SubLObject valid_lexification_user_actions_alt(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        {
            SubLObject valid_user_actions = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.lexification_reminders.lexification_user_actions(cyclist);
            SubLObject action = NIL;
            for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.lexification_reminders.valid_lexification_user_actionP(action)) {
                    valid_user_actions = cons(action, valid_user_actions);
                } else {
                    com.cyc.cycjava.cycl.lexification_reminders.remove_lexification_user_action_from_queue(action);
                }
            }
            return nreverse(valid_user_actions);
        }
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

    public static final SubLObject valid_lexification_user_actionP_alt(SubLObject action) {
        {
            SubLObject term_to_lexify = com.cyc.cycjava.cycl.lexification_reminders.lexification_user_action_term(action);
            return makeBoolean(((NIL == invalid_constantP(term_to_lexify, UNPROVIDED)) && (NIL == narts_high.invalid_nartP(term_to_lexify, UNPROVIDED))) && ((NIL != cycl_grammar.cycl_nat_p(term_to_lexify)) || (NIL != constant_p(term_to_lexify))));
        }
    }

    public static SubLObject valid_lexification_user_actionP(final SubLObject action) {
        final SubLObject term_to_lexify = lexification_user_action_term(action);
        return makeBoolean(((NIL == invalid_constantP(term_to_lexify, UNPROVIDED)) && (NIL == narts_high.invalid_nartP(term_to_lexify, UNPROVIDED))) && ((NIL != cycl_grammar.cycl_nat_p(term_to_lexify)) || (NIL != constant_p(term_to_lexify))));
    }

    public static final SubLObject remove_lexification_user_action_from_queue_alt(SubLObject action) {
        return user_actions.delete_user_action(action);
    }

    public static SubLObject remove_lexification_user_action_from_queue(final SubLObject action) {
        return user_actions.delete_user_action(action);
    }

    /**
     *
     *
     * @return boolean ; result of invoking the lexification wizard on next lexification user action for CYCLIST
     */
    @LispMethod(comment = "@return boolean ; result of invoking the lexification wizard on next lexification user action for CYCLIST")
    public static final SubLObject lexify_next_user_action_alt(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        {
            SubLObject next_action = com.cyc.cycjava.cycl.lexification_reminders.valid_lexification_user_actions(cyclist).first();
            if (NIL != next_action) {
                return cb_lexification_reminders.display_lex_todo(list(user_actions.user_action_id_string(next_action)));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean ; result of invoking the lexification wizard on next lexification user action for CYCLIST
     */
    @LispMethod(comment = "@return boolean ; result of invoking the lexification wizard on next lexification user action for CYCLIST")
    public static SubLObject lexify_next_user_action(SubLObject cyclist) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        return NIL;
    }

    /**
     *
     *
     * @return assertion ; first termStrings-Guessed assertion for TERM
     */
    @LispMethod(comment = "@return assertion ; first termStrings-Guessed assertion for TERM")
    public static final SubLObject find_termstrings_guessed_assertions_alt(SubLObject v_term) {
        return kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $termstrings_guessed_pred$.getGlobalValue(), $termstrings_guessed_mt$.getGlobalValue(), UNPROVIDED);
    }

    /**
     *
     *
     * @return assertion ; first termStrings-Guessed assertion for TERM
     */
    @LispMethod(comment = "@return assertion ; first termStrings-Guessed assertion for TERM")
    public static SubLObject find_termstrings_guessed_assertions(final SubLObject v_term) {
        return kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $termstrings_guessed_pred$.getGlobalValue(), $termstrings_guessed_mt$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Create reminders for the user to perform lexification of unlexified constants they created
     *
     * @return integer ; number of user actions added to the queue
     * @unknown If cyclist is nil, then all constants are examined
     */
    @LispMethod(comment = "Create reminders for the user to perform lexification of unlexified constants they created\r\n\r\n@return integer ; number of user actions added to the queue\r\n@unknown If cyclist is nil, then all constants are examined")
    public static final SubLObject add_user_action_lexification_reminders_alt(SubLObject oe_cyclist, SubLObject max_days, SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
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
        {
            SubLObject unlexified_terms = lexification_utilities.unlexified_terms_for_cyclist(oe_cyclist, max_days, check_termstringsP);
            return com.cyc.cycjava.cycl.lexification_reminders.add_term_lexification_reminders(unlexified_terms, NIL, NIL, max_num, todo_cyclist);
        }
    }

    /**
     * Create reminders for the user to perform lexification of unlexified constants they created
     *
     * @return integer ; number of user actions added to the queue
     * @unknown If cyclist is nil, then all constants are examined
     */
    @LispMethod(comment = "Create reminders for the user to perform lexification of unlexified constants they created\r\n\r\n@return integer ; number of user actions added to the queue\r\n@unknown If cyclist is nil, then all constants are examined")
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

    /**
     * Add reminders to perform lexification of termstrings user's temporary lexical assertions mt (e.g., TemporaryLexicalAssertions-TomOMt)
     */
    @LispMethod(comment = "Add reminders to perform lexification of termstrings user\'s temporary lexical assertions mt (e.g., TemporaryLexicalAssertions-TomOMt)")
    public static final SubLObject add_termstring_lexification_reminders_alt(SubLObject nl_cyclist, SubLObject max_num, SubLObject todo_cyclist) {
        if (nl_cyclist == UNPROVIDED) {
            nl_cyclist = operation_communication.the_cyclist();
        }
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (todo_cyclist == UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        {
            SubLObject cyclist_termstrings = lexification_utilities.get_termstring_assertions_for_cyclist(nl_cyclist);
            SubLObject num_added = ZERO_INTEGER;
            SubLObject done = NIL;
            if (NIL == done) {
                {
                    SubLObject csome_list_var = cyclist_termstrings;
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != done) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        if (NIL != assertions_high.gaf_assertionP(assertion)) {
                            {
                                SubLObject v_term = assertions_high.gaf_arg1(assertion);
                                SubLObject phrase = assertions_high.gaf_arg2(assertion);
                                com.cyc.cycjava.cycl.lexification_reminders.add_lexification_todo(v_term, todo_cyclist, phrase, assertion);
                                num_added = add(num_added, ONE_INTEGER);
                                done = makeBoolean((NIL != max_num) && num_added.numGE(max_num));
                            }
                        }
                    }
                }
            }
            return num_added;
        }
    }

    /**
     * Add reminders to perform lexification of termstrings user's temporary lexical assertions mt (e.g., TemporaryLexicalAssertions-TomOMt)
     */
    @LispMethod(comment = "Add reminders to perform lexification of termstrings user\'s temporary lexical assertions mt (e.g., TemporaryLexicalAssertions-TomOMt)")
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

    /**
     * Adds reminders for TODO-CYCLIST to perform lexification for the terms in TERM-LIST, provided
     * that they are JUST-UNLEXIFIED? with the proviso that CHECK-TERMSTRINGS?
     *
     * @unknown If the term has a termStrings-GuessedFromName assertion then the corresponding phrase will be used (and the assertion will be marked for deletion after the lexification is done).
     * @return integer ; number of lexification reminders added to the user action queue
     */
    @LispMethod(comment = "Adds reminders for TODO-CYCLIST to perform lexification for the terms in TERM-LIST, provided\r\nthat they are JUST-UNLEXIFIED? with the proviso that CHECK-TERMSTRINGS?\r\n\r\n@unknown If the term has a termStrings-GuessedFromName assertion then the corresponding phrase will be used (and the assertion will be marked for deletion after the lexification is done).\r\n@return integer ; number of lexification reminders added to the user action queue\nAdds reminders for TODO-CYCLIST to perform lexification for the terms in TERM-LIST, provided\nthat they are JUST-UNLEXIFIED? with the proviso that CHECK-TERMSTRINGS?")
    public static final SubLObject add_term_lexification_reminders_alt(SubLObject term_list, SubLObject just_unlexifiedP, SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
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
        {
            SubLObject num_added = ZERO_INTEGER;
            SubLObject done = NIL;
            if (NIL == done) {
                {
                    SubLObject csome_list_var = term_list;
                    SubLObject v_term = NIL;
                    for (v_term = csome_list_var.first(); !((NIL != done) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                        if (!((NIL != just_unlexifiedP) && (NIL == lexification_utilities.unlexifiedP(v_term, check_termstringsP)))) {
                            {
                                SubLObject guessed_termstrings = com.cyc.cycjava.cycl.lexification_reminders.find_termstrings_guessed_assertions(v_term);
                                SubLObject assertion = (NIL != guessed_termstrings) ? ((SubLObject) (guessed_termstrings.first())) : NIL;
                                SubLObject phrase = (NIL != assertions_high.gaf_assertionP(assertion)) ? ((SubLObject) (assertions_high.gaf_arg2(assertion))) : NIL;
                                if (NIL != com.cyc.cycjava.cycl.lexification_reminders.add_lexification_todo(v_term, todo_cyclist, phrase, assertion)) {
                                    num_added = add(num_added, ONE_INTEGER);
                                    done = makeBoolean((NIL != max_num) && num_added.numGE(max_num));
                                }
                            }
                        }
                    }
                }
            }
            return num_added;
        }
    }

    /**
     * Adds reminders for TODO-CYCLIST to perform lexification for the terms in TERM-LIST, provided
     * that they are JUST-UNLEXIFIED? with the proviso that CHECK-TERMSTRINGS?
     *
     * @unknown If the term has a termStrings-GuessedFromName assertion then the corresponding phrase will be used (and the assertion will be marked for deletion after the lexification is done).
     * @return integer ; number of lexification reminders added to the user action queue
     */
    @LispMethod(comment = "Adds reminders for TODO-CYCLIST to perform lexification for the terms in TERM-LIST, provided\r\nthat they are JUST-UNLEXIFIED? with the proviso that CHECK-TERMSTRINGS?\r\n\r\n@unknown If the term has a termStrings-GuessedFromName assertion then the corresponding phrase will be used (and the assertion will be marked for deletion after the lexification is done).\r\n@return integer ; number of lexification reminders added to the user action queue\nAdds reminders for TODO-CYCLIST to perform lexification for the terms in TERM-LIST, provided\nthat they are JUST-UNLEXIFIED? with the proviso that CHECK-TERMSTRINGS?")
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

    /**
     * Add reminder for TODO-CYCLIST to perform lexification for TERM
     */
    @LispMethod(comment = "Add reminder for TODO-CYCLIST to perform lexification for TERM")
    public static final SubLObject add_term_lexification_reminder_alt(SubLObject v_term, SubLObject todo_cyclist) {
        if (todo_cyclist == UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        return com.cyc.cycjava.cycl.lexification_reminders.add_term_lexification_reminders(list(v_term), NIL, NIL, NIL, todo_cyclist);
    }

    @LispMethod(comment = "Add reminder for TODO-CYCLIST to perform lexification for TERM")
    public static SubLObject add_term_lexification_reminder(final SubLObject v_term, SubLObject todo_cyclist) {
        if (todo_cyclist == UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        return add_term_lexification_reminders(list(v_term), NIL, NIL, NIL, todo_cyclist);
    }/**
     * Add reminder for TODO-CYCLIST to perform lexification for TERM
     */


    /**
     * Add reminders for TODO-CYCLIST to lexify all the terms listed in FILENAME
     */
    @LispMethod(comment = "Add reminders for TODO-CYCLIST to lexify all the terms listed in FILENAME")
    public static final SubLObject add_lexification_reminders_from_file_alt(SubLObject filename, SubLObject just_unlexifiedP, SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
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
        {
            SubLObject term_list = misc_kb_utilities.read_terms_from_file(filename);
            return com.cyc.cycjava.cycl.lexification_reminders.add_term_lexification_reminders(term_list, just_unlexifiedP, check_termstringsP, max_num, todo_cyclist);
        }
    }

    @LispMethod(comment = "Add reminders for TODO-CYCLIST to lexify all the terms listed in FILENAME")
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
    }/**
     * Add reminders for TODO-CYCLIST to lexify all the terms listed in FILENAME
     */


    /**
     *
     *
     * @return integer : number of unlexified terms added to user action queue
     */
    @LispMethod(comment = "@return integer : number of unlexified terms added to user action queue")
    public static final SubLObject add_unlexified_term_reminders_alt(SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
        if (check_termstringsP == UNPROVIDED) {
            check_termstringsP = NIL;
        }
        if (max_num == UNPROVIDED) {
            max_num = NIL;
        }
        if (todo_cyclist == UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject max_count = (NIL != max_num) ? ((SubLObject) (max_num)) : forts.fort_count();
                SubLObject idx = do_constants_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt8$Adding_lexwiz_reminders_for_unlex, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($str_alt8$Adding_lexwiz_reminders_for_unlex);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject v_term = NIL;
                                while (NIL != id) {
                                    v_term = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, v_term, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != lexification_utilities.unlexifiedP(v_term, check_termstringsP)) {
                                            if (!count.numGE(max_count)) {
                                                com.cyc.cycjava.cycl.lexification_reminders.add_term_lexification_reminder(v_term, todo_cyclist);
                                                count = add(count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    /**
     *
     *
     * @return integer : number of unlexified terms added to user action queue
     */
    @LispMethod(comment = "@return integer : number of unlexified terms added to user action queue")
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
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
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
        declareFunction("new_lexification_user_action_user_data", "NEW-LEXIFICATION-USER-ACTION-USER-DATA", 3, 0, false);
        declareFunction("lexification_user_action_term", "LEXIFICATION-USER-ACTION-TERM", 1, 0, false);
        declareFunction("lexification_user_action_phrase", "LEXIFICATION-USER-ACTION-PHRASE", 1, 0, false);
        declareFunction("lexification_user_action_assertion", "LEXIFICATION-USER-ACTION-ASSERTION", 1, 0, false);
        declareFunction("add_lexification_todo", "ADD-LEXIFICATION-TODO", 1, 3, false);
        declareFunction("add_lex_todo", "ADD-LEX-TODO", 1, 3, false);
        declareFunction("remove_lexification_user_action", "REMOVE-LEXIFICATION-USER-ACTION", 2, 0, false);
        declareFunction("lexification_user_actions", "LEXIFICATION-USER-ACTIONS", 0, 1, false);
        declareFunction("valid_lexification_user_actions", "VALID-LEXIFICATION-USER-ACTIONS", 0, 1, false);
        declareFunction("valid_lexification_user_actionP", "VALID-LEXIFICATION-USER-ACTION?", 1, 0, false);
        declareFunction("remove_lexification_user_action_from_queue", "REMOVE-LEXIFICATION-USER-ACTION-FROM-QUEUE", 1, 0, false);
        declareFunction("lexify_next_user_action", "LEXIFY-NEXT-USER-ACTION", 0, 1, false);
        declareFunction("find_termstrings_guessed_assertions", "FIND-TERMSTRINGS-GUESSED-ASSERTIONS", 1, 0, false);
        declareFunction("add_user_action_lexification_reminders", "ADD-USER-ACTION-LEXIFICATION-REMINDERS", 0, 5, false);
        declareFunction("add_termstring_lexification_reminders", "ADD-TERMSTRING-LEXIFICATION-REMINDERS", 0, 3, false);
        declareFunction("add_term_lexification_reminders", "ADD-TERM-LEXIFICATION-REMINDERS", 1, 4, false);
        declareFunction("add_term_lexification_reminder", "ADD-TERM-LEXIFICATION-REMINDER", 1, 1, false);
        declareFunction("add_lexification_reminders_from_file", "ADD-LEXIFICATION-REMINDERS-FROM-FILE", 1, 4, false);
        declareFunction("add_unlexified_term_reminders", "ADD-UNLEXIFIED-TERM-REMINDERS", 0, 3, false);
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

    static private final SubLString $str_alt8$Adding_lexwiz_reminders_for_unlex = makeString("Adding lexwiz reminders for unlexified terms ...");
}

/**
 * Total time: 166 ms
 */
