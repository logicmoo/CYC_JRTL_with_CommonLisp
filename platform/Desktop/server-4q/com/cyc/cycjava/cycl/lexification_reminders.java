package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexification_reminders extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.lexification_reminders";
    public static final String myFingerPrint = "af37fb00febe8988200da589fc8968f9f372e7a919ce7ffa8a0214bb9e1661c9";
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 2274L)
    private static SubLSymbol $termstrings_guessed_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 2527L)
    private static SubLSymbol $termstrings_guessed_mt$;
    private static final SubLObject $const0$termStrings_GuessedFromName;
    private static final SubLObject $const1$TemporaryLexicalAssertions_Guesse;
    private static final SubLSymbol $sym2$USER_ACTION_P;
    private static final SubLSymbol $kw3$CYCLIST;
    private static final SubLSymbol $kw4$TYPE_KEY;
    private static final SubLSymbol $kw5$LEXIFICATION_NEEDED;
    private static final SubLSymbol $kw6$DATA;
    private static final SubLSymbol $kw7$DONE;
    private static final SubLString $str8$Adding_lexwiz_reminders_for_unlex;
    private static final SubLSymbol $sym9$STRINGP;
    private static final SubLSymbol $kw10$SKIP;
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 2674L)
    public static SubLObject new_lexification_user_action_user_data(final SubLObject cyc_term, final SubLObject phrase, final SubLObject assertion) {
        return (SubLObject)ConsesLow.list(cyc_term, phrase, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 2977L)
    public static SubLObject lexification_user_action_term(final SubLObject action) {
        assert lexification_reminders.NIL != user_actions.user_action_p(action) : action;
        return user_actions.user_action_data(action).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 3113L)
    public static SubLObject lexification_user_action_phrase(final SubLObject action) {
        assert lexification_reminders.NIL != user_actions.user_action_p(action) : action;
        return conses_high.second(user_actions.user_action_data(action));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 3252L)
    public static SubLObject lexification_user_action_assertion(final SubLObject action) {
        assert lexification_reminders.NIL != user_actions.user_action_p(action) : action;
        return conses_high.third(user_actions.user_action_data(action));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 3393L)
    public static SubLObject add_lexification_todo(final SubLObject cyc_term, SubLObject cyclist, SubLObject phrase, SubLObject assertion) {
        if (cyclist == lexification_reminders.UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (phrase == lexification_reminders.UNPROVIDED) {
            phrase = (SubLObject)lexification_reminders.NIL;
        }
        if (assertion == lexification_reminders.UNPROVIDED) {
            assertion = (SubLObject)lexification_reminders.NIL;
        }
        if (lexification_reminders.NIL == forts.fort_p(cyc_term)) {
            return (SubLObject)lexification_reminders.NIL;
        }
        final SubLObject user_data = new_lexification_user_action_user_data(cyc_term, phrase, assertion);
        final SubLObject lex_todo_action = user_actions.new_user_action((SubLObject)ConsesLow.list((SubLObject)lexification_reminders.$kw3$CYCLIST, cyclist, (SubLObject)lexification_reminders.$kw4$TYPE_KEY, (SubLObject)lexification_reminders.$kw5$LEXIFICATION_NEEDED, (SubLObject)lexification_reminders.$kw6$DATA, user_data));
        return lex_todo_action;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 4192L)
    public static SubLObject add_lex_todo(final SubLObject v_term, SubLObject cyclist, SubLObject phrase, SubLObject assertion) {
        if (cyclist == lexification_reminders.UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (phrase == lexification_reminders.UNPROVIDED) {
            phrase = (SubLObject)lexification_reminders.NIL;
        }
        if (assertion == lexification_reminders.UNPROVIDED) {
            assertion = (SubLObject)lexification_reminders.NIL;
        }
        return add_lexification_todo(v_term, cyclist, phrase, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 4387L)
    public static SubLObject remove_lexification_user_action(final SubLObject v_object, final SubLObject user_action) {
        final SubLObject user_data = user_actions.user_action_data(user_action);
        final SubLObject assertion = (SubLObject)(user_data.isList() ? conses_high.third(user_data) : lexification_reminders.NIL);
        user_actions.delete_user_action(user_action);
        if (lexification_wizard.lexwiz_state(v_object) == lexification_reminders.$kw7$DONE && lexification_reminders.NIL != assertions_high.gaf_assertionP(assertion) && misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object)).eql(assertions_high.gaf_arg1(assertion)) && lexification_wizard.lexwiz_phrase(v_object).equalp(assertions_high.gaf_arg2(assertion))) {
            misc_kb_utilities.try_unassert(assertions_high.assertion_formula(assertion), assertions_high.assertion_mt(assertion));
        }
        return (SubLObject)lexification_reminders.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 4996L)
    public static SubLObject lexification_user_actions(SubLObject cyclist) {
        if (cyclist == lexification_reminders.UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        return user_actions.all_actions_for_cyclist_of_type(cyclist, (SubLObject)lexification_reminders.$kw5$LEXIFICATION_NEEDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 5222L)
    public static SubLObject valid_lexification_user_actions(SubLObject cyclist) {
        if (cyclist == lexification_reminders.UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        SubLObject valid_user_actions = (SubLObject)lexification_reminders.NIL;
        SubLObject cdolist_list_var = lexification_user_actions(cyclist);
        SubLObject action = (SubLObject)lexification_reminders.NIL;
        action = cdolist_list_var.first();
        while (lexification_reminders.NIL != cdolist_list_var) {
            if (lexification_reminders.NIL != valid_lexification_user_actionP(action)) {
                valid_user_actions = (SubLObject)ConsesLow.cons(action, valid_user_actions);
            }
            else {
                remove_lexification_user_action_from_queue(action);
            }
            cdolist_list_var = cdolist_list_var.rest();
            action = cdolist_list_var.first();
        }
        return Sequences.nreverse(valid_user_actions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 5588L)
    public static SubLObject valid_lexification_user_actionP(final SubLObject action) {
        final SubLObject term_to_lexify = lexification_user_action_term(action);
        return (SubLObject)SubLObjectFactory.makeBoolean(lexification_reminders.NIL == constant_handles.invalid_constantP(term_to_lexify, (SubLObject)lexification_reminders.UNPROVIDED) && lexification_reminders.NIL == narts_high.invalid_nartP(term_to_lexify, (SubLObject)lexification_reminders.UNPROVIDED) && (lexification_reminders.NIL != cycl_grammar.cycl_nat_p(term_to_lexify) || lexification_reminders.NIL != constant_handles.constant_p(term_to_lexify)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 5895L)
    public static SubLObject remove_lexification_user_action_from_queue(final SubLObject action) {
        return user_actions.delete_user_action(action);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 6001L)
    public static SubLObject lexify_next_user_action(SubLObject cyclist) {
        if (cyclist == lexification_reminders.UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        return (SubLObject)lexification_reminders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 6405L)
    public static SubLObject find_termstrings_guessed_assertions(final SubLObject v_term) {
        return kb_mapping.gather_gaf_arg_index(v_term, (SubLObject)lexification_reminders.ONE_INTEGER, lexification_reminders.$termstrings_guessed_pred$.getGlobalValue(), lexification_reminders.$termstrings_guessed_mt$.getGlobalValue(), (SubLObject)lexification_reminders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 6855L)
    public static SubLObject add_user_action_lexification_reminders(SubLObject oe_cyclist, SubLObject max_days, SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
        if (oe_cyclist == lexification_reminders.UNPROVIDED) {
            oe_cyclist = operation_communication.the_cyclist();
        }
        if (max_days == lexification_reminders.UNPROVIDED) {
            max_days = lexification_utilities.$lexification_check_max_days$.getGlobalValue();
        }
        if (check_termstringsP == lexification_reminders.UNPROVIDED) {
            check_termstringsP = (SubLObject)lexification_reminders.NIL;
        }
        if (max_num == lexification_reminders.UNPROVIDED) {
            max_num = (SubLObject)lexification_reminders.NIL;
        }
        if (todo_cyclist == lexification_reminders.UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        final SubLObject unlexified_terms = lexification_utilities.unlexified_terms_for_cyclist(oe_cyclist, max_days, check_termstringsP);
        return add_term_lexification_reminders(unlexified_terms, (SubLObject)lexification_reminders.NIL, (SubLObject)lexification_reminders.NIL, max_num, todo_cyclist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 7767L)
    public static SubLObject add_termstring_lexification_reminders(SubLObject nl_cyclist, SubLObject max_num, SubLObject todo_cyclist) {
        if (nl_cyclist == lexification_reminders.UNPROVIDED) {
            nl_cyclist = operation_communication.the_cyclist();
        }
        if (max_num == lexification_reminders.UNPROVIDED) {
            max_num = (SubLObject)lexification_reminders.NIL;
        }
        if (todo_cyclist == lexification_reminders.UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        final SubLObject cyclist_termstrings = lexification_utilities.get_termstring_assertions_for_cyclist(nl_cyclist);
        SubLObject num_added = (SubLObject)lexification_reminders.ZERO_INTEGER;
        SubLObject done = (SubLObject)lexification_reminders.NIL;
        if (lexification_reminders.NIL == done) {
            SubLObject csome_list_var = cyclist_termstrings;
            SubLObject assertion = (SubLObject)lexification_reminders.NIL;
            assertion = csome_list_var.first();
            while (lexification_reminders.NIL == done && lexification_reminders.NIL != csome_list_var) {
                if (lexification_reminders.NIL != assertions_high.gaf_assertionP(assertion)) {
                    final SubLObject v_term = assertions_high.gaf_arg1(assertion);
                    final SubLObject phrase = assertions_high.gaf_arg2(assertion);
                    add_lexification_todo(v_term, todo_cyclist, phrase, assertion);
                    num_added = Numbers.add(num_added, (SubLObject)lexification_reminders.ONE_INTEGER);
                    done = (SubLObject)SubLObjectFactory.makeBoolean(lexification_reminders.NIL != max_num && num_added.numGE(max_num));
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            }
        }
        return num_added;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 8570L)
    public static SubLObject add_term_lexification_reminders(final SubLObject term_list, SubLObject just_unlexifiedP, SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
        if (just_unlexifiedP == lexification_reminders.UNPROVIDED) {
            just_unlexifiedP = (SubLObject)lexification_reminders.NIL;
        }
        if (check_termstringsP == lexification_reminders.UNPROVIDED) {
            check_termstringsP = (SubLObject)lexification_reminders.NIL;
        }
        if (max_num == lexification_reminders.UNPROVIDED) {
            max_num = (SubLObject)lexification_reminders.NIL;
        }
        if (todo_cyclist == lexification_reminders.UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        SubLObject num_added = (SubLObject)lexification_reminders.ZERO_INTEGER;
        SubLObject done = (SubLObject)lexification_reminders.NIL;
        if (lexification_reminders.NIL == done) {
            SubLObject csome_list_var = term_list;
            SubLObject v_term = (SubLObject)lexification_reminders.NIL;
            v_term = csome_list_var.first();
            while (lexification_reminders.NIL == done && lexification_reminders.NIL != csome_list_var) {
                if (lexification_reminders.NIL == just_unlexifiedP || lexification_reminders.NIL != lexification_utilities.unlexifiedP(v_term, check_termstringsP)) {
                    final SubLObject guessed_termstrings = find_termstrings_guessed_assertions(v_term);
                    final SubLObject assertion = (SubLObject)((lexification_reminders.NIL != guessed_termstrings) ? guessed_termstrings.first() : lexification_reminders.NIL);
                    final SubLObject phrase = (SubLObject)((lexification_reminders.NIL != assertions_high.gaf_assertionP(assertion)) ? assertions_high.gaf_arg2(assertion) : lexification_reminders.NIL);
                    if (lexification_reminders.NIL != add_lexification_todo(v_term, todo_cyclist, phrase, assertion)) {
                        num_added = Numbers.add(num_added, (SubLObject)lexification_reminders.ONE_INTEGER);
                        done = (SubLObject)SubLObjectFactory.makeBoolean(lexification_reminders.NIL != max_num && num_added.numGE(max_num));
                    }
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            }
        }
        return num_added;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 9954L)
    public static SubLObject add_term_lexification_reminder(final SubLObject v_term, SubLObject todo_cyclist) {
        if (todo_cyclist == lexification_reminders.UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        return add_term_lexification_reminders((SubLObject)ConsesLow.list(v_term), (SubLObject)lexification_reminders.NIL, (SubLObject)lexification_reminders.NIL, (SubLObject)lexification_reminders.NIL, todo_cyclist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 10204L)
    public static SubLObject add_lexification_reminders_from_file(final SubLObject filename, SubLObject just_unlexifiedP, SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
        if (just_unlexifiedP == lexification_reminders.UNPROVIDED) {
            just_unlexifiedP = (SubLObject)lexification_reminders.NIL;
        }
        if (check_termstringsP == lexification_reminders.UNPROVIDED) {
            check_termstringsP = (SubLObject)lexification_reminders.NIL;
        }
        if (max_num == lexification_reminders.UNPROVIDED) {
            max_num = (SubLObject)lexification_reminders.NIL;
        }
        if (todo_cyclist == lexification_reminders.UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        final SubLObject term_list = misc_kb_utilities.read_terms_from_file(filename);
        return add_term_lexification_reminders(term_list, just_unlexifiedP, check_termstringsP, max_num, todo_cyclist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexification-reminders.lisp", position = 10626L)
    public static SubLObject add_unlexified_term_reminders(SubLObject check_termstringsP, SubLObject max_num, SubLObject todo_cyclist) {
        if (check_termstringsP == lexification_reminders.UNPROVIDED) {
            check_termstringsP = (SubLObject)lexification_reminders.NIL;
        }
        if (max_num == lexification_reminders.UNPROVIDED) {
            max_num = (SubLObject)lexification_reminders.NIL;
        }
        if (todo_cyclist == lexification_reminders.UNPROVIDED) {
            todo_cyclist = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)lexification_reminders.ZERO_INTEGER;
        final SubLObject max_count = (lexification_reminders.NIL != max_num) ? max_num : forts.fort_count();
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = (SubLObject)lexification_reminders.$str8$Adding_lexwiz_reminders_for_unlex;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)lexification_reminders.ZERO_INTEGER;
        assert lexification_reminders.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)lexification_reminders.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)lexification_reminders.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)lexification_reminders.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$1 = idx;
                if (lexification_reminders.NIL == id_index.id_index_objects_empty_p(idx_$1, (SubLObject)lexification_reminders.$kw10$SKIP)) {
                    final SubLObject idx_$2 = idx_$1;
                    if (lexification_reminders.NIL == id_index.id_index_dense_objects_empty_p(idx_$2, (SubLObject)lexification_reminders.$kw10$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$2);
                        final SubLObject backwardP_var = (SubLObject)lexification_reminders.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject v_term;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)lexification_reminders.NIL, v_iteration = (SubLObject)lexification_reminders.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)lexification_reminders.ONE_INTEGER)) {
                            id = ((lexification_reminders.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)lexification_reminders.ONE_INTEGER) : v_iteration);
                            v_term = Vectors.aref(vector_var, id);
                            if (lexification_reminders.NIL == id_index.id_index_tombstone_p(v_term) || lexification_reminders.NIL == id_index.id_index_skip_tombstones_p((SubLObject)lexification_reminders.$kw10$SKIP)) {
                                if (lexification_reminders.NIL != id_index.id_index_tombstone_p(v_term)) {
                                    v_term = (SubLObject)lexification_reminders.$kw10$SKIP;
                                }
                                if (lexification_reminders.NIL != lexification_utilities.unlexifiedP(v_term, check_termstringsP) && !count.numGE(max_count)) {
                                    add_term_lexification_reminder(v_term, todo_cyclist);
                                    count = Numbers.add(count, (SubLObject)lexification_reminders.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)lexification_reminders.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$3 = idx_$1;
                    if (lexification_reminders.NIL == id_index.id_index_sparse_objects_empty_p(idx_$3) || lexification_reminders.NIL == id_index.id_index_skip_tombstones_p((SubLObject)lexification_reminders.$kw10$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$3);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$3);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$3);
                        final SubLObject v_default = (SubLObject)((lexification_reminders.NIL != id_index.id_index_skip_tombstones_p((SubLObject)lexification_reminders.$kw10$SKIP)) ? lexification_reminders.NIL : lexification_reminders.$kw10$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject v_term2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (lexification_reminders.NIL == id_index.id_index_skip_tombstones_p((SubLObject)lexification_reminders.$kw10$SKIP) || lexification_reminders.NIL == id_index.id_index_tombstone_p(v_term2)) {
                                if (lexification_reminders.NIL != lexification_utilities.unlexifiedP(v_term2, check_termstringsP) && !count.numGE(max_count)) {
                                    add_term_lexification_reminder(v_term2, todo_cyclist);
                                    count = Numbers.add(count, (SubLObject)lexification_reminders.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)lexification_reminders.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)lexification_reminders.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexification_reminders.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    public static SubLObject declare_lexification_reminders_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "new_lexification_user_action_user_data", "NEW-LEXIFICATION-USER-ACTION-USER-DATA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "lexification_user_action_term", "LEXIFICATION-USER-ACTION-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "lexification_user_action_phrase", "LEXIFICATION-USER-ACTION-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "lexification_user_action_assertion", "LEXIFICATION-USER-ACTION-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "add_lexification_todo", "ADD-LEXIFICATION-TODO", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "add_lex_todo", "ADD-LEX-TODO", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "remove_lexification_user_action", "REMOVE-LEXIFICATION-USER-ACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "lexification_user_actions", "LEXIFICATION-USER-ACTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "valid_lexification_user_actions", "VALID-LEXIFICATION-USER-ACTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "valid_lexification_user_actionP", "VALID-LEXIFICATION-USER-ACTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "remove_lexification_user_action_from_queue", "REMOVE-LEXIFICATION-USER-ACTION-FROM-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "lexify_next_user_action", "LEXIFY-NEXT-USER-ACTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "find_termstrings_guessed_assertions", "FIND-TERMSTRINGS-GUESSED-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "add_user_action_lexification_reminders", "ADD-USER-ACTION-LEXIFICATION-REMINDERS", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "add_termstring_lexification_reminders", "ADD-TERMSTRING-LEXIFICATION-REMINDERS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "add_term_lexification_reminders", "ADD-TERM-LEXIFICATION-REMINDERS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "add_term_lexification_reminder", "ADD-TERM-LEXIFICATION-REMINDER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "add_lexification_reminders_from_file", "ADD-LEXIFICATION-REMINDERS-FROM-FILE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexification_reminders", "add_unlexified_term_reminders", "ADD-UNLEXIFIED-TERM-REMINDERS", 0, 3, false);
        return (SubLObject)lexification_reminders.NIL;
    }
    
    public static SubLObject init_lexification_reminders_file() {
        lexification_reminders.$termstrings_guessed_pred$ = SubLFiles.deflexical("*TERMSTRINGS-GUESSED-PRED*", lexification_reminders.$const0$termStrings_GuessedFromName);
        lexification_reminders.$termstrings_guessed_mt$ = SubLFiles.deflexical("*TERMSTRINGS-GUESSED-MT*", lexification_reminders.$const1$TemporaryLexicalAssertions_Guesse);
        return (SubLObject)lexification_reminders.NIL;
    }
    
    public static SubLObject setup_lexification_reminders_file() {
        return (SubLObject)lexification_reminders.NIL;
    }
    
    public void declareFunctions() {
        declare_lexification_reminders_file();
    }
    
    public void initializeVariables() {
        init_lexification_reminders_file();
    }
    
    public void runTopLevelForms() {
        setup_lexification_reminders_file();
    }
    
    static {
        me = (SubLFile)new lexification_reminders();
        lexification_reminders.$termstrings_guessed_pred$ = null;
        lexification_reminders.$termstrings_guessed_mt$ = null;
        $const0$termStrings_GuessedFromName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings-GuessedFromName"));
        $const1$TemporaryLexicalAssertions_Guesse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertions-GuessedMt"));
        $sym2$USER_ACTION_P = SubLObjectFactory.makeSymbol("USER-ACTION-P");
        $kw3$CYCLIST = SubLObjectFactory.makeKeyword("CYCLIST");
        $kw4$TYPE_KEY = SubLObjectFactory.makeKeyword("TYPE-KEY");
        $kw5$LEXIFICATION_NEEDED = SubLObjectFactory.makeKeyword("LEXIFICATION-NEEDED");
        $kw6$DATA = SubLObjectFactory.makeKeyword("DATA");
        $kw7$DONE = SubLObjectFactory.makeKeyword("DONE");
        $str8$Adding_lexwiz_reminders_for_unlex = SubLObjectFactory.makeString("Adding lexwiz reminders for unlexified terms ...");
        $sym9$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw10$SKIP = SubLObjectFactory.makeKeyword("SKIP");
    }
}

/*

	Total time: 166 ms
	
*/