/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-ISI-POSTINGS
 *  source file: /cyc/top/cycl/cyblack/cyblack-isi-postings.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_isi_postings extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_isi_postings() {
    }

    public static final SubLFile me = new cyblack_isi_postings();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_isi_postings";

    // // Definitions
    public static final SubLObject subloop_reserved_initialize_isi_root_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_isi_root_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        return NIL;
    }

    public static final SubLObject isi_root_posting_p(SubLObject isi_root_posting) {
        return classes.subloop_instanceof_class(isi_root_posting, ISI_ROOT_POSTING);
    }

    public static final SubLObject isi_root_posting_plistify_method(SubLObject self) {
        {
            SubLObject plistified_version = cyblack_posting.cyblack_basic_posting_plistify_method(self);
            return remf(plistified_version, $INTERNAL_PID);
        }
    }

    public static final SubLObject isi_root_posting_assimilate_method(SubLObject self, SubLObject plistified_content) {
        {
            SubLObject internal_pid_as_string = getf(plistified_content, $INTERNAL_PID, UNPROVIDED);
            if (NIL != internal_pid_as_string) {
                {
                    SubLObject internal_pid_as_integer = read_from_string(internal_pid_as_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject copied_content = copy_tree(plistified_content);
                    putf(copied_content, $INTERNAL_PID, internal_pid_as_integer);
                    return object.object_assimilate_method(self, copied_content);
                }
            }
            return object.object_assimilate_method(self, plistified_content);
        }
    }

    public static final SubLObject subloop_reserved_initialize_isi_datum_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_isi_datum_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        return NIL;
    }

    public static final SubLObject isi_datum_posting_p(SubLObject isi_datum_posting) {
        return classes.subloop_instanceof_class(isi_datum_posting, ISI_DATUM_POSTING);
    }

    public static final SubLObject get_isi_problem_problem(SubLObject isi_problem) {
        return classes.subloop_get_instance_slot(isi_problem, TWENTY_INTEGER);
    }

    public static final SubLObject set_isi_problem_problem(SubLObject isi_problem, SubLObject value) {
        return classes.subloop_set_instance_slot(isi_problem, value, TWENTY_INTEGER);
    }

    public static final SubLObject subloop_reserved_initialize_isi_problem_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_isi_problem_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, ISI_PROBLEM, PROBLEM, NIL);
        return NIL;
    }

    public static final SubLObject isi_problem_p(SubLObject isi_problem) {
        return classes.subloop_instanceof_class(isi_problem, ISI_PROBLEM);
    }

    public static final SubLObject isi_problem_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_isi_problem_method = NIL;
            SubLObject problem = get_isi_problem_problem(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_initialize_method(self);
                    problem = cyblack_isi_macros.create_isi_problem(NIL, NIL, NIL, NIL, NIL, NIL);
                    sublisp_throw($sym55$OUTER_CATCH_FOR_ISI_PROBLEM_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_isi_problem_problem(self, problem);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_isi_problem_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_ISI_PROBLEM_METHOD);
            }
            return catch_var_for_isi_problem_method;
        }
    }

    public static final SubLObject isi_problem_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            format(stream, $str_alt61$__ISI_PROBLEM__FORMULA__S__MT__S_, new SubLObject[]{ getf(problem, $FORMULA, UNPROVIDED), getf(problem, $MT, UNPROVIDED), getf(problem, $BACKCHAINS, UNPROVIDED), getf(problem, $NUMBER, UNPROVIDED), getf(problem, $TIME, UNPROVIDED), getf(problem, $DEPTH, UNPROVIDED) });
            return self;
        }
    }

    public static final SubLObject isi_problem_get_problem_method(SubLObject self) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            return problem;
        }
    }

    public static final SubLObject isi_problem_set_problem_method(SubLObject self, SubLObject new_datum) {
        {
            SubLObject catch_var_for_isi_problem_method = NIL;
            SubLObject problem = get_isi_problem_problem(self);
            try {
                try {
                    problem = new_datum;
                    sublisp_throw($sym75$OUTER_CATCH_FOR_ISI_PROBLEM_METHOD, new_datum);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_isi_problem_problem(self, problem);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_isi_problem_method = Errors.handleThrowable(ccatch_env_var, $sym75$OUTER_CATCH_FOR_ISI_PROBLEM_METHOD);
            }
            return catch_var_for_isi_problem_method;
        }
    }

    public static final SubLObject isi_problem_get_formula_method(SubLObject self) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            return getf(problem, $FORMULA, UNPROVIDED);
        }
    }

    public static final SubLObject isi_problem_set_formula_method(SubLObject self, SubLObject new_formula) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            putf(problem, $FORMULA, new_formula);
            return new_formula;
        }
    }

    public static final SubLObject isi_problem_get_mt_method(SubLObject self) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            return getf(problem, $MT, UNPROVIDED);
        }
    }

    public static final SubLObject isi_problem_set_mt_method(SubLObject self, SubLObject new_mt) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            putf(problem, $MT, new_mt);
            return new_mt;
        }
    }

    public static final SubLObject isi_problem_get_backchains_method(SubLObject self) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            return getf(problem, $BACKCHAINS, UNPROVIDED);
        }
    }

    public static final SubLObject isi_problem_set_backchains_method(SubLObject self, SubLObject new_backchains) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            putf(problem, $BACKCHAINS, new_backchains);
            return new_backchains;
        }
    }

    public static final SubLObject isi_problem_get_number_method(SubLObject self) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            return getf(problem, $NUMBER, UNPROVIDED);
        }
    }

    public static final SubLObject isi_problem_set_number_method(SubLObject self, SubLObject new_number) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            putf(problem, $NUMBER, new_number);
            return new_number;
        }
    }

    public static final SubLObject isi_problem_get_time_method(SubLObject self) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            return getf(problem, $TIME, UNPROVIDED);
        }
    }

    public static final SubLObject isi_problem_set_time_method(SubLObject self, SubLObject new_time) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            putf(problem, $TIME, new_time);
            return new_time;
        }
    }

    public static final SubLObject isi_problem_get_depth_method(SubLObject self) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            return getf(problem, $DEPTH, UNPROVIDED);
        }
    }

    public static final SubLObject isi_problem_set_depth_method(SubLObject self, SubLObject new_depth) {
        {
            SubLObject problem = get_isi_problem_problem(self);
            putf(problem, $DEPTH, new_depth);
            return new_depth;
        }
    }

    public static final SubLObject get_isi_query_improvement_proposal_answer_to(SubLObject isi_query_improvement_proposal) {
        return classes.subloop_get_instance_slot(isi_query_improvement_proposal, $int$21);
    }

    public static final SubLObject set_isi_query_improvement_proposal_answer_to(SubLObject isi_query_improvement_proposal, SubLObject value) {
        return classes.subloop_set_instance_slot(isi_query_improvement_proposal, value, $int$21);
    }

    public static final SubLObject get_isi_query_improvement_proposal_solution(SubLObject isi_query_improvement_proposal) {
        return classes.subloop_get_instance_slot(isi_query_improvement_proposal, TWENTY_INTEGER);
    }

    public static final SubLObject set_isi_query_improvement_proposal_solution(SubLObject isi_query_improvement_proposal, SubLObject value) {
        return classes.subloop_set_instance_slot(isi_query_improvement_proposal, value, TWENTY_INTEGER);
    }

    public static final SubLObject subloop_reserved_initialize_isi_query_improvement_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_isi_query_improvement_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, ISI_QUERY_IMPROVEMENT_PROPOSAL, SOLUTION, NIL);
        classes.subloop_initialize_slot(new_instance, ISI_QUERY_IMPROVEMENT_PROPOSAL, ANSWER_TO, NIL);
        return NIL;
    }

    public static final SubLObject isi_query_improvement_proposal_p(SubLObject isi_query_improvement_proposal) {
        return classes.subloop_instanceof_class(isi_query_improvement_proposal, ISI_QUERY_IMPROVEMENT_PROPOSAL);
    }

    public static final SubLObject isi_query_improvement_proposal_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_isi_query_improvement_proposal_method = NIL;
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            SubLObject solution = get_isi_query_improvement_proposal_solution(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_initialize_method(self);
                    solution = cons($MISSING_ASSERTIONS, copy_list(list(list(list($ASSERT, NIL), list($MT, NIL)))));
                    answer_to = cyblack_isi_macros.create_isi_problem(NIL, NIL, NIL, NIL, NIL, NIL);
                    sublisp_throw($sym127$OUTER_CATCH_FOR_ISI_QUERY_IMPROVEMENT_PROPOSAL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_isi_query_improvement_proposal_answer_to(self, answer_to);
                            set_isi_query_improvement_proposal_solution(self, solution);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_isi_query_improvement_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym127$OUTER_CATCH_FOR_ISI_QUERY_IMPROVEMENT_PROPOSAL_METHOD);
            }
            return catch_var_for_isi_query_improvement_proposal_method;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            SubLObject solution = get_isi_query_improvement_proposal_solution(self);
            format(stream, $str_alt132$__QUERY_IMPROVEMENT_PROPOSAL__MIS, new SubLObject[]{ solution, getf(answer_to, $FORMULA, UNPROVIDED), getf(answer_to, $MT, UNPROVIDED), getf(answer_to, $BACKCHAINS, UNPROVIDED), getf(answer_to, $NUMBER, UNPROVIDED), getf(answer_to, $TIME, UNPROVIDED), getf(answer_to, $DEPTH, UNPROVIDED) });
            return self;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_get_solution_method(SubLObject self) {
        {
            SubLObject solution = get_isi_query_improvement_proposal_solution(self);
            return solution;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_set_solution_method(SubLObject self, SubLObject new_solution) {
        {
            SubLObject catch_var_for_isi_query_improvement_proposal_method = NIL;
            SubLObject solution = get_isi_query_improvement_proposal_solution(self);
            try {
                try {
                    solution = new_solution;
                    sublisp_throw($sym140$OUTER_CATCH_FOR_ISI_QUERY_IMPROVEMENT_PROPOSAL_METHOD, new_solution);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_isi_query_improvement_proposal_solution(self, solution);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_isi_query_improvement_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym140$OUTER_CATCH_FOR_ISI_QUERY_IMPROVEMENT_PROPOSAL_METHOD);
            }
            return catch_var_for_isi_query_improvement_proposal_method;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_get_answer_to_method(SubLObject self) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            return answer_to;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_set_answer_to_method(SubLObject self, SubLObject new_answer_to) {
        {
            SubLObject catch_var_for_isi_query_improvement_proposal_method = NIL;
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            try {
                try {
                    answer_to = new_answer_to;
                    sublisp_throw($sym148$OUTER_CATCH_FOR_ISI_QUERY_IMPROVEMENT_PROPOSAL_METHOD, new_answer_to);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_isi_query_improvement_proposal_answer_to(self, answer_to);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_isi_query_improvement_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym148$OUTER_CATCH_FOR_ISI_QUERY_IMPROVEMENT_PROPOSAL_METHOD);
            }
            return catch_var_for_isi_query_improvement_proposal_method;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_get_solution_missing_assertions_method(SubLObject self) {
        {
            SubLObject solution = get_isi_query_improvement_proposal_solution(self);
            return solution.rest();
        }
    }

    public static final SubLObject isi_query_improvement_proposal_set_solution_missing_assertions_method(SubLObject self, SubLObject new_assertions) {
        {
            SubLObject solution = get_isi_query_improvement_proposal_solution(self);
            rplacd(solution, copy_list(new_assertions));
            return new_assertions;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_get_answer_to_formula_method(SubLObject self) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            return getf(answer_to, $FORMULA, UNPROVIDED);
        }
    }

    public static final SubLObject isi_query_improvement_proposal_set_answer_to_formula_method(SubLObject self, SubLObject new_answer_to_formula) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            putf(answer_to, $FORMULA, new_answer_to_formula);
            return new_answer_to_formula;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_get_answer_to_mt_method(SubLObject self) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            return getf(answer_to, $MT, UNPROVIDED);
        }
    }

    public static final SubLObject isi_query_improvement_proposal_set_answer_to_mt_method(SubLObject self, SubLObject new_mt) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            putf(answer_to, $MT, new_mt);
            return new_mt;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_get_answer_to_backchains_method(SubLObject self) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            return getf(answer_to, $BACKCHAINS, UNPROVIDED);
        }
    }

    public static final SubLObject isi_query_improvement_proposal_set_answer_to_backchains_method(SubLObject self, SubLObject new_backchains) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            putf(answer_to, $BACKCHAINS, new_backchains);
            return new_backchains;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_get_answer_to_number_method(SubLObject self) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            return getf(answer_to, $NUMBER, UNPROVIDED);
        }
    }

    public static final SubLObject isi_query_improvement_proposal_set_answer_to_number_method(SubLObject self, SubLObject new_number) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            putf(answer_to, $NUMBER, new_number);
            return new_number;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_get_answer_to_time_method(SubLObject self) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            return getf(answer_to, $TIME, UNPROVIDED);
        }
    }

    public static final SubLObject isi_query_improvement_proposal_set_answer_to_time_method(SubLObject self, SubLObject new_time) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            putf(answer_to, $TIME, new_time);
            return new_time;
        }
    }

    public static final SubLObject isi_query_improvement_proposal_get_answer_to_depth_method(SubLObject self) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            return getf(answer_to, $DEPTH, UNPROVIDED);
        }
    }

    public static final SubLObject isi_query_improvement_proposal_set_answer_to_depth_method(SubLObject self, SubLObject new_depth) {
        {
            SubLObject answer_to = get_isi_query_improvement_proposal_answer_to(self);
            putf(answer_to, $DEPTH, new_depth);
            return new_depth;
        }
    }

    public static final SubLObject declare_cyblack_isi_postings_file() {
        declareFunction("subloop_reserved_initialize_isi_root_posting_class", "SUBLOOP-RESERVED-INITIALIZE-ISI-ROOT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_isi_root_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-ISI-ROOT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("isi_root_posting_p", "ISI-ROOT-POSTING-P", 1, 0, false);
        declareFunction("isi_root_posting_plistify_method", "ISI-ROOT-POSTING-PLISTIFY-METHOD", 1, 0, false);
        declareFunction("isi_root_posting_assimilate_method", "ISI-ROOT-POSTING-ASSIMILATE-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_isi_datum_posting_class", "SUBLOOP-RESERVED-INITIALIZE-ISI-DATUM-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_isi_datum_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-ISI-DATUM-POSTING-INSTANCE", 1, 0, false);
        declareFunction("isi_datum_posting_p", "ISI-DATUM-POSTING-P", 1, 0, false);
        declareFunction("get_isi_problem_problem", "GET-ISI-PROBLEM-PROBLEM", 1, 0, false);
        declareFunction("set_isi_problem_problem", "SET-ISI-PROBLEM-PROBLEM", 2, 0, false);
        declareFunction("subloop_reserved_initialize_isi_problem_class", "SUBLOOP-RESERVED-INITIALIZE-ISI-PROBLEM-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_isi_problem_instance", "SUBLOOP-RESERVED-INITIALIZE-ISI-PROBLEM-INSTANCE", 1, 0, false);
        declareFunction("isi_problem_p", "ISI-PROBLEM-P", 1, 0, false);
        declareFunction("isi_problem_initialize_method", "ISI-PROBLEM-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("isi_problem_print_method", "ISI-PROBLEM-PRINT-METHOD", 3, 0, false);
        declareFunction("isi_problem_get_problem_method", "ISI-PROBLEM-GET-PROBLEM-METHOD", 1, 0, false);
        declareFunction("isi_problem_set_problem_method", "ISI-PROBLEM-SET-PROBLEM-METHOD", 2, 0, false);
        declareFunction("isi_problem_get_formula_method", "ISI-PROBLEM-GET-FORMULA-METHOD", 1, 0, false);
        declareFunction("isi_problem_set_formula_method", "ISI-PROBLEM-SET-FORMULA-METHOD", 2, 0, false);
        declareFunction("isi_problem_get_mt_method", "ISI-PROBLEM-GET-MT-METHOD", 1, 0, false);
        declareFunction("isi_problem_set_mt_method", "ISI-PROBLEM-SET-MT-METHOD", 2, 0, false);
        declareFunction("isi_problem_get_backchains_method", "ISI-PROBLEM-GET-BACKCHAINS-METHOD", 1, 0, false);
        declareFunction("isi_problem_set_backchains_method", "ISI-PROBLEM-SET-BACKCHAINS-METHOD", 2, 0, false);
        declareFunction("isi_problem_get_number_method", "ISI-PROBLEM-GET-NUMBER-METHOD", 1, 0, false);
        declareFunction("isi_problem_set_number_method", "ISI-PROBLEM-SET-NUMBER-METHOD", 2, 0, false);
        declareFunction("isi_problem_get_time_method", "ISI-PROBLEM-GET-TIME-METHOD", 1, 0, false);
        declareFunction("isi_problem_set_time_method", "ISI-PROBLEM-SET-TIME-METHOD", 2, 0, false);
        declareFunction("isi_problem_get_depth_method", "ISI-PROBLEM-GET-DEPTH-METHOD", 1, 0, false);
        declareFunction("isi_problem_set_depth_method", "ISI-PROBLEM-SET-DEPTH-METHOD", 2, 0, false);
        declareFunction("get_isi_query_improvement_proposal_answer_to", "GET-ISI-QUERY-IMPROVEMENT-PROPOSAL-ANSWER-TO", 1, 0, false);
        declareFunction("set_isi_query_improvement_proposal_answer_to", "SET-ISI-QUERY-IMPROVEMENT-PROPOSAL-ANSWER-TO", 2, 0, false);
        declareFunction("get_isi_query_improvement_proposal_solution", "GET-ISI-QUERY-IMPROVEMENT-PROPOSAL-SOLUTION", 1, 0, false);
        declareFunction("set_isi_query_improvement_proposal_solution", "SET-ISI-QUERY-IMPROVEMENT-PROPOSAL-SOLUTION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_isi_query_improvement_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-ISI-QUERY-IMPROVEMENT-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_isi_query_improvement_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-ISI-QUERY-IMPROVEMENT-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_p", "ISI-QUERY-IMPROVEMENT-PROPOSAL-P", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_initialize_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_print_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-PRINT-METHOD", 3, 0, false);
        declareFunction("isi_query_improvement_proposal_get_solution_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-SOLUTION-METHOD", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_set_solution_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-SOLUTION-METHOD", 2, 0, false);
        declareFunction("isi_query_improvement_proposal_get_answer_to_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-METHOD", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_set_answer_to_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-METHOD", 2, 0, false);
        declareFunction("isi_query_improvement_proposal_get_solution_missing_assertions_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-SOLUTION-MISSING-ASSERTIONS-METHOD", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_set_solution_missing_assertions_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-SOLUTION-MISSING-ASSERTIONS-METHOD", 2, 0, false);
        declareFunction("isi_query_improvement_proposal_get_answer_to_formula_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-FORMULA-METHOD", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_set_answer_to_formula_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-FORMULA-METHOD", 2, 0, false);
        declareFunction("isi_query_improvement_proposal_get_answer_to_mt_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-MT-METHOD", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_set_answer_to_mt_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-MT-METHOD", 2, 0, false);
        declareFunction("isi_query_improvement_proposal_get_answer_to_backchains_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-BACKCHAINS-METHOD", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_set_answer_to_backchains_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-BACKCHAINS-METHOD", 2, 0, false);
        declareFunction("isi_query_improvement_proposal_get_answer_to_number_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-NUMBER-METHOD", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_set_answer_to_number_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-NUMBER-METHOD", 2, 0, false);
        declareFunction("isi_query_improvement_proposal_get_answer_to_time_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-TIME-METHOD", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_set_answer_to_time_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-TIME-METHOD", 2, 0, false);
        declareFunction("isi_query_improvement_proposal_get_answer_to_depth_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-DEPTH-METHOD", 1, 0, false);
        declareFunction("isi_query_improvement_proposal_set_answer_to_depth_method", "ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-DEPTH-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_isi_postings_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_isi_postings_file() {
                classes.subloop_new_class(ISI_ROOT_POSTING, CYBLACK_BASIC_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(ISI_ROOT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(ISI_ROOT_POSTING, SUBLOOP_RESERVED_INITIALIZE_ISI_ROOT_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(ISI_ROOT_POSTING, SUBLOOP_RESERVED_INITIALIZE_ISI_ROOT_POSTING_INSTANCE);
        subloop_reserved_initialize_isi_root_posting_class(ISI_ROOT_POSTING);
        methods.methods_incorporate_instance_method(PLISTIFY, ISI_ROOT_POSTING, $list_alt36, NIL, $list_alt37);
        methods.subloop_register_instance_method(ISI_ROOT_POSTING, PLISTIFY, ISI_ROOT_POSTING_PLISTIFY_METHOD);
        methods.methods_incorporate_instance_method(ASSIMILATE, ISI_ROOT_POSTING, $list_alt36, $list_alt41, $list_alt42);
        methods.subloop_register_instance_method(ISI_ROOT_POSTING, ASSIMILATE, ISI_ROOT_POSTING_ASSIMILATE_METHOD);
        classes.subloop_new_class(ISI_DATUM_POSTING, ISI_ROOT_POSTING, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(ISI_DATUM_POSTING, NIL);
        classes.subloop_note_class_initialization_function(ISI_DATUM_POSTING, SUBLOOP_RESERVED_INITIALIZE_ISI_DATUM_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(ISI_DATUM_POSTING, SUBLOOP_RESERVED_INITIALIZE_ISI_DATUM_POSTING_INSTANCE);
        subloop_reserved_initialize_isi_datum_posting_class(ISI_DATUM_POSTING);
        classes.subloop_new_class(ISI_PROBLEM, ISI_DATUM_POSTING, NIL, NIL, $list_alt48);
        classes.class_set_implements_slot_listeners(ISI_PROBLEM, NIL);
        classes.subloop_note_class_initialization_function(ISI_PROBLEM, SUBLOOP_RESERVED_INITIALIZE_ISI_PROBLEM_CLASS);
        classes.subloop_note_instance_initialization_function(ISI_PROBLEM, SUBLOOP_RESERVED_INITIALIZE_ISI_PROBLEM_INSTANCE);
        subloop_reserved_initialize_isi_problem_class(ISI_PROBLEM);
        methods.methods_incorporate_instance_method(INITIALIZE, ISI_PROBLEM, $list_alt53, NIL, $list_alt54);
        methods.subloop_register_instance_method(ISI_PROBLEM, INITIALIZE, ISI_PROBLEM_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, ISI_PROBLEM, $list_alt58, $list_alt59, $list_alt60);
        methods.subloop_register_instance_method(ISI_PROBLEM, PRINT, ISI_PROBLEM_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PROBLEM, ISI_PROBLEM, $list_alt58, NIL, $list_alt70);
        methods.subloop_register_instance_method(ISI_PROBLEM, GET_PROBLEM, ISI_PROBLEM_GET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(SET_PROBLEM, ISI_PROBLEM, $list_alt36, $list_alt73, $list_alt74);
        methods.subloop_register_instance_method(ISI_PROBLEM, SET_PROBLEM, ISI_PROBLEM_SET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(GET_FORMULA, ISI_PROBLEM, $list_alt58, NIL, $list_alt78);
        methods.subloop_register_instance_method(ISI_PROBLEM, GET_FORMULA, ISI_PROBLEM_GET_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(SET_FORMULA, ISI_PROBLEM, $list_alt58, $list_alt81, $list_alt82);
        methods.subloop_register_instance_method(ISI_PROBLEM, SET_FORMULA, ISI_PROBLEM_SET_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(GET_MT, ISI_PROBLEM, $list_alt58, NIL, $list_alt85);
        methods.subloop_register_instance_method(ISI_PROBLEM, GET_MT, ISI_PROBLEM_GET_MT_METHOD);
        methods.methods_incorporate_instance_method(SET_MT, ISI_PROBLEM, $list_alt58, $list_alt88, $list_alt89);
        methods.subloop_register_instance_method(ISI_PROBLEM, SET_MT, ISI_PROBLEM_SET_MT_METHOD);
        methods.methods_incorporate_instance_method(GET_BACKCHAINS, ISI_PROBLEM, $list_alt58, NIL, $list_alt92);
        methods.subloop_register_instance_method(ISI_PROBLEM, GET_BACKCHAINS, ISI_PROBLEM_GET_BACKCHAINS_METHOD);
        methods.methods_incorporate_instance_method(SET_BACKCHAINS, ISI_PROBLEM, $list_alt58, $list_alt95, $list_alt96);
        methods.subloop_register_instance_method(ISI_PROBLEM, SET_BACKCHAINS, ISI_PROBLEM_SET_BACKCHAINS_METHOD);
        methods.methods_incorporate_instance_method(GET_NUMBER, ISI_PROBLEM, $list_alt58, NIL, $list_alt99);
        methods.subloop_register_instance_method(ISI_PROBLEM, GET_NUMBER, ISI_PROBLEM_GET_NUMBER_METHOD);
        methods.methods_incorporate_instance_method(SET_NUMBER, ISI_PROBLEM, $list_alt58, $list_alt102, $list_alt103);
        methods.subloop_register_instance_method(ISI_PROBLEM, SET_NUMBER, ISI_PROBLEM_SET_NUMBER_METHOD);
        methods.methods_incorporate_instance_method(GET_TIME, ISI_PROBLEM, $list_alt58, NIL, $list_alt106);
        methods.subloop_register_instance_method(ISI_PROBLEM, GET_TIME, ISI_PROBLEM_GET_TIME_METHOD);
        methods.methods_incorporate_instance_method(SET_TIME, ISI_PROBLEM, $list_alt58, $list_alt109, $list_alt110);
        methods.subloop_register_instance_method(ISI_PROBLEM, SET_TIME, ISI_PROBLEM_SET_TIME_METHOD);
        methods.methods_incorporate_instance_method(GET_DEPTH, ISI_PROBLEM, $list_alt58, NIL, $list_alt113);
        methods.subloop_register_instance_method(ISI_PROBLEM, GET_DEPTH, ISI_PROBLEM_GET_DEPTH_METHOD);
        methods.methods_incorporate_instance_method(SET_DEPTH, ISI_PROBLEM, $list_alt58, $list_alt116, $list_alt117);
        methods.subloop_register_instance_method(ISI_PROBLEM, SET_DEPTH, ISI_PROBLEM_SET_DEPTH_METHOD);
        classes.subloop_new_class(ISI_QUERY_IMPROVEMENT_PROPOSAL, ISI_DATUM_POSTING, NIL, NIL, $list_alt120);
        classes.class_set_implements_slot_listeners(ISI_QUERY_IMPROVEMENT_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(ISI_QUERY_IMPROVEMENT_PROPOSAL, SUBLOOP_RESERVED_INITIALIZE_ISI_QUERY_IMPROVEMENT_PROPOSAL_CLASS);
        classes.subloop_note_instance_initialization_function(ISI_QUERY_IMPROVEMENT_PROPOSAL, $sym125$SUBLOOP_RESERVED_INITIALIZE_ISI_QUERY_IMPROVEMENT_PROPOSAL_INSTAN);
        subloop_reserved_initialize_isi_query_improvement_proposal_class(ISI_QUERY_IMPROVEMENT_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt53, NIL, $list_alt126);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, INITIALIZE, ISI_QUERY_IMPROVEMENT_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, $list_alt59, $list_alt131);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, PRINT, ISI_QUERY_IMPROVEMENT_PROPOSAL_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_SOLUTION, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, NIL, $list_alt135);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, GET_SOLUTION, ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_SOLUTION_METHOD);
        methods.methods_incorporate_instance_method(SET_SOLUTION, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt36, $list_alt138, $list_alt139);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, SET_SOLUTION, ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_SOLUTION_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER_TO, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, NIL, $list_alt143);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, GET_ANSWER_TO, ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_METHOD);
        methods.methods_incorporate_instance_method(SET_ANSWER_TO, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt36, $list_alt146, $list_alt147);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, SET_ANSWER_TO, ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_METHOD);
        methods.methods_incorporate_instance_method(GET_SOLUTION_MISSING_ASSERTIONS, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, NIL, $list_alt151);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, GET_SOLUTION_MISSING_ASSERTIONS, $sym152$ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_SOLUTION_MISSING_ASSERTIONS_ME);
        methods.methods_incorporate_instance_method(SET_SOLUTION_MISSING_ASSERTIONS, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, $list_alt154, $list_alt155);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, SET_SOLUTION_MISSING_ASSERTIONS, $sym156$ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_SOLUTION_MISSING_ASSERTIONS_ME);
        methods.methods_incorporate_instance_method(GET_ANSWER_TO_FORMULA, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, NIL, $list_alt158);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, GET_ANSWER_TO_FORMULA, ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(SET_ANSWER_TO_FORMULA, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, $list_alt161, $list_alt162);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, SET_ANSWER_TO_FORMULA, ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER_TO_MT, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, NIL, $list_alt165);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, GET_ANSWER_TO_MT, ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_MT_METHOD);
        methods.methods_incorporate_instance_method(SET_ANSWER_TO_MT, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, $list_alt88, $list_alt168);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, SET_ANSWER_TO_MT, ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_MT_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER_TO_BACKCHAINS, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, NIL, $list_alt171);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, GET_ANSWER_TO_BACKCHAINS, ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_BACKCHAINS_METHOD);
        methods.methods_incorporate_instance_method(SET_ANSWER_TO_BACKCHAINS, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, $list_alt95, $list_alt174);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, SET_ANSWER_TO_BACKCHAINS, ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_BACKCHAINS_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER_TO_NUMBER, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, NIL, $list_alt177);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, GET_ANSWER_TO_NUMBER, ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_NUMBER_METHOD);
        methods.methods_incorporate_instance_method(SET_ANSWER_TO_NUMBER, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, $list_alt102, $list_alt180);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, SET_ANSWER_TO_NUMBER, ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_NUMBER_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER_TO_TIME, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, NIL, $list_alt183);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, GET_ANSWER_TO_TIME, ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_TIME_METHOD);
        methods.methods_incorporate_instance_method(SET_ANSWER_TO_TIME, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, $list_alt109, $list_alt186);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, SET_ANSWER_TO_TIME, ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_TIME_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER_TO_DEPTH, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, NIL, $list_alt189);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, GET_ANSWER_TO_DEPTH, ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_DEPTH_METHOD);
        methods.methods_incorporate_instance_method(SET_ANSWER_TO_DEPTH, ISI_QUERY_IMPROVEMENT_PROPOSAL, $list_alt58, $list_alt116, $list_alt192);
        methods.subloop_register_instance_method(ISI_QUERY_IMPROVEMENT_PROPOSAL, SET_ANSWER_TO_DEPTH, ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_DEPTH_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol ISI_ROOT_POSTING = makeSymbol("ISI-ROOT-POSTING");



    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PLISTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASSIMILATE"), list(makeSymbol("PLISTIFIED-CONTENT")), makeKeyword("PUBLIC")));





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISI_ROOT_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISI-ROOT-POSTING-CLASS");



























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");





























    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISI_ROOT_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISI-ROOT-POSTING-INSTANCE");



    static private final SubLList $list_alt36 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt37 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PLISTIFIED-VERSION"), list(makeSymbol("PLISTIFY"), makeSymbol("SUPER")))), list(RET, list(makeSymbol("REMF"), makeSymbol("PLISTIFIED-VERSION"), makeKeyword("INTERNAL-PID")))));

    private static final SubLSymbol $INTERNAL_PID = makeKeyword("INTERNAL-PID");

    private static final SubLSymbol ISI_ROOT_POSTING_PLISTIFY_METHOD = makeSymbol("ISI-ROOT-POSTING-PLISTIFY-METHOD");



    static private final SubLList $list_alt41 = list(makeSymbol("PLISTIFIED-CONTENT"));

    static private final SubLList $list_alt42 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERNAL-PID-AS-STRING"), list(makeSymbol("GETF"), makeSymbol("PLISTIFIED-CONTENT"), makeKeyword("INTERNAL-PID")))), list(makeSymbol("PWHEN"), makeSymbol("INTERNAL-PID-AS-STRING"), list(makeSymbol("CLET"), list(list(makeSymbol("INTERNAL-PID-AS-INTEGER"), list(makeSymbol("READ-FROM-STRING"), makeSymbol("INTERNAL-PID-AS-STRING"))), list(makeSymbol("COPIED-CONTENT"), list(makeSymbol("COPY-TREE"), makeSymbol("PLISTIFIED-CONTENT")))), list(makeSymbol("PUTF"), makeSymbol("COPIED-CONTENT"), makeKeyword("INTERNAL-PID"), makeSymbol("INTERNAL-PID-AS-INTEGER")), list(RET, list(makeSymbol("ASSIMILATE"), makeSymbol("SUPER"), makeSymbol("COPIED-CONTENT"))))), list(RET, list(makeSymbol("ASSIMILATE"), makeSymbol("SUPER"), makeSymbol("PLISTIFIED-CONTENT")))));

    private static final SubLSymbol ISI_ROOT_POSTING_ASSIMILATE_METHOD = makeSymbol("ISI-ROOT-POSTING-ASSIMILATE-METHOD");

    private static final SubLSymbol ISI_DATUM_POSTING = makeSymbol("ISI-DATUM-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISI_DATUM_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISI-DATUM-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISI_DATUM_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISI-DATUM-POSTING-INSTANCE");



    static private final SubLList $list_alt48 = list(new SubLObject[]{ list(makeSymbol("PROBLEM"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROBLEM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROBLEM"), list(makeSymbol("NEW-DATUM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FORMULA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FORMULA"), list(makeSymbol("NEW-FORMULA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MT"), list(makeSymbol("NEW-MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BACKCHAINS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BACKCHAINS"), list(makeSymbol("NEW-BACKCHAINS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NUMBER"), list(makeSymbol("NEW-NUMBER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIME"), list(makeSymbol("NEW-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEPTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEPTH"), list(makeSymbol("NEW-DEPTH")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISI_PROBLEM_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISI-PROBLEM-CLASS");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISI_PROBLEM_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISI-PROBLEM-INSTANCE");



    static private final SubLList $list_alt53 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt54 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PROBLEM"), list(makeSymbol("CREATE-ISI-PROBLEM"), NIL, NIL, NIL, NIL, NIL, NIL)), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym55$OUTER_CATCH_FOR_ISI_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ISI-PROBLEM-METHOD");

    private static final SubLSymbol ISI_PROBLEM_INITIALIZE_METHOD = makeSymbol("ISI-PROBLEM-INITIALIZE-METHOD");



    static private final SubLList $list_alt58 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt59 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt60 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(new SubLObject[]{ makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<ISI-PROBLEM :FORMULA ~S :MT ~S :BACKCHAINS ~S :NUMBER ~S :TIME ~S :DEPTH ~S>"), list(makeSymbol("GET-ISI-PROBLEM-QUERY"), makeSymbol("PROBLEM")), list(makeSymbol("GET-ISI-PROBLEM-MT"), makeSymbol("PROBLEM")), list(makeSymbol("GET-ISI-PROBLEM-BACKCHAINS"), makeSymbol("PROBLEM")), list(makeSymbol("GET-ISI-PROBLEM-NUMBER"), makeSymbol("PROBLEM")), list(makeSymbol("GET-ISI-PROBLEM-TIME"), makeSymbol("PROBLEM")), list(makeSymbol("GET-ISI-PROBLEM-DEPTH"), makeSymbol("PROBLEM")) }), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt61$__ISI_PROBLEM__FORMULA__S__MT__S_ = makeString("#<ISI-PROBLEM :FORMULA ~S :MT ~S :BACKCHAINS ~S :NUMBER ~S :TIME ~S :DEPTH ~S>");





    private static final SubLSymbol $BACKCHAINS = makeKeyword("BACKCHAINS");







    private static final SubLSymbol ISI_PROBLEM_PRINT_METHOD = makeSymbol("ISI-PROBLEM-PRINT-METHOD");

    private static final SubLSymbol GET_PROBLEM = makeSymbol("GET-PROBLEM");

    static private final SubLList $list_alt70 = list(list(RET, makeSymbol("PROBLEM")));

    private static final SubLSymbol ISI_PROBLEM_GET_PROBLEM_METHOD = makeSymbol("ISI-PROBLEM-GET-PROBLEM-METHOD");

    private static final SubLSymbol SET_PROBLEM = makeSymbol("SET-PROBLEM");

    static private final SubLList $list_alt73 = list(makeSymbol("NEW-DATUM"));

    static private final SubLList $list_alt74 = list(list(makeSymbol("CSETQ"), makeSymbol("PROBLEM"), makeSymbol("NEW-DATUM")), list(RET, makeSymbol("NEW-DATUM")));

    static private final SubLSymbol $sym75$OUTER_CATCH_FOR_ISI_PROBLEM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ISI-PROBLEM-METHOD");

    private static final SubLSymbol ISI_PROBLEM_SET_PROBLEM_METHOD = makeSymbol("ISI-PROBLEM-SET-PROBLEM-METHOD");



    static private final SubLList $list_alt78 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-QUERY"), makeSymbol("PROBLEM"))));

    private static final SubLSymbol ISI_PROBLEM_GET_FORMULA_METHOD = makeSymbol("ISI-PROBLEM-GET-FORMULA-METHOD");

    private static final SubLSymbol SET_FORMULA = makeSymbol("SET-FORMULA");

    static private final SubLList $list_alt81 = list(makeSymbol("NEW-FORMULA"));

    static private final SubLList $list_alt82 = list(list(makeSymbol("SET-ISI-PROBLEM-QUERY"), makeSymbol("PROBLEM"), makeSymbol("NEW-FORMULA")), list(RET, makeSymbol("NEW-FORMULA")));

    private static final SubLSymbol ISI_PROBLEM_SET_FORMULA_METHOD = makeSymbol("ISI-PROBLEM-SET-FORMULA-METHOD");



    static private final SubLList $list_alt85 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-MT"), makeSymbol("PROBLEM"))));

    private static final SubLSymbol ISI_PROBLEM_GET_MT_METHOD = makeSymbol("ISI-PROBLEM-GET-MT-METHOD");



    static private final SubLList $list_alt88 = list(makeSymbol("NEW-MT"));

    static private final SubLList $list_alt89 = list(list(makeSymbol("SET-ISI-PROBLEM-MT"), makeSymbol("PROBLEM"), makeSymbol("NEW-MT")), list(RET, makeSymbol("NEW-MT")));

    private static final SubLSymbol ISI_PROBLEM_SET_MT_METHOD = makeSymbol("ISI-PROBLEM-SET-MT-METHOD");

    private static final SubLSymbol GET_BACKCHAINS = makeSymbol("GET-BACKCHAINS");

    static private final SubLList $list_alt92 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-BACKCHAINS"), makeSymbol("PROBLEM"))));

    private static final SubLSymbol ISI_PROBLEM_GET_BACKCHAINS_METHOD = makeSymbol("ISI-PROBLEM-GET-BACKCHAINS-METHOD");

    private static final SubLSymbol SET_BACKCHAINS = makeSymbol("SET-BACKCHAINS");

    static private final SubLList $list_alt95 = list(makeSymbol("NEW-BACKCHAINS"));

    static private final SubLList $list_alt96 = list(list(makeSymbol("SET-ISI-PROBLEM-BACKCHAINS"), makeSymbol("PROBLEM"), makeSymbol("NEW-BACKCHAINS")), list(RET, makeSymbol("NEW-BACKCHAINS")));

    private static final SubLSymbol ISI_PROBLEM_SET_BACKCHAINS_METHOD = makeSymbol("ISI-PROBLEM-SET-BACKCHAINS-METHOD");



    static private final SubLList $list_alt99 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-NUMBER"), makeSymbol("PROBLEM"))));

    private static final SubLSymbol ISI_PROBLEM_GET_NUMBER_METHOD = makeSymbol("ISI-PROBLEM-GET-NUMBER-METHOD");

    private static final SubLSymbol SET_NUMBER = makeSymbol("SET-NUMBER");

    static private final SubLList $list_alt102 = list(makeSymbol("NEW-NUMBER"));

    static private final SubLList $list_alt103 = list(list(makeSymbol("SET-ISI-PROBLEM-NUMBER"), makeSymbol("PROBLEM"), makeSymbol("NEW-NUMBER")), list(RET, makeSymbol("NEW-NUMBER")));

    private static final SubLSymbol ISI_PROBLEM_SET_NUMBER_METHOD = makeSymbol("ISI-PROBLEM-SET-NUMBER-METHOD");

    private static final SubLSymbol GET_TIME = makeSymbol("GET-TIME");

    static private final SubLList $list_alt106 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-TIME"), makeSymbol("PROBLEM"))));

    private static final SubLSymbol ISI_PROBLEM_GET_TIME_METHOD = makeSymbol("ISI-PROBLEM-GET-TIME-METHOD");

    private static final SubLSymbol SET_TIME = makeSymbol("SET-TIME");

    static private final SubLList $list_alt109 = list(makeSymbol("NEW-TIME"));

    static private final SubLList $list_alt110 = list(list(makeSymbol("SET-ISI-PROBLEM-TIME"), makeSymbol("PROBLEM"), makeSymbol("NEW-TIME")), list(RET, makeSymbol("NEW-TIME")));

    private static final SubLSymbol ISI_PROBLEM_SET_TIME_METHOD = makeSymbol("ISI-PROBLEM-SET-TIME-METHOD");

    private static final SubLSymbol GET_DEPTH = makeSymbol("GET-DEPTH");

    static private final SubLList $list_alt113 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-DEPTH"), makeSymbol("PROBLEM"))));

    private static final SubLSymbol ISI_PROBLEM_GET_DEPTH_METHOD = makeSymbol("ISI-PROBLEM-GET-DEPTH-METHOD");

    private static final SubLSymbol SET_DEPTH = makeSymbol("SET-DEPTH");

    static private final SubLList $list_alt116 = list(makeSymbol("NEW-DEPTH"));

    static private final SubLList $list_alt117 = list(list(makeSymbol("SET-ISI-PROBLEM-DEPTH"), makeSymbol("PROBLEM"), makeSymbol("NEW-DEPTH")), list(RET, makeSymbol("NEW-DEPTH")));

    private static final SubLSymbol ISI_PROBLEM_SET_DEPTH_METHOD = makeSymbol("ISI-PROBLEM-SET-DEPTH-METHOD");

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL");

    static private final SubLList $list_alt120 = list(new SubLObject[]{ list(makeSymbol("SOLUTION"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("ANSWER-TO"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOLUTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SOLUTION"), list(makeSymbol("NEW-SOLUTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANSWER-TO"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ANSWER-TO"), list(makeSymbol("NEW-ANSWER-TO")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOLUTION-MISSING-ASSERTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SOLUTION-MISSING-ASSERTIONS"), list(makeSymbol("NEW-ASSERTIONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANSWER-TO-FORMULA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ANSWER-TO-FORMULA"), list(makeSymbol("NEW-ANSWER-TO-FORMULA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANSWER-TO-MT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ANSWER-TO-MT"), list(makeSymbol("NEW-MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANSWER-TO-BACKCHAINS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ANSWER-TO-BACKCHAINS"), list(makeSymbol("NEW-BACKCHAINS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANSWER-TO-NUMBER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ANSWER-TO-NUMBER"), list(makeSymbol("NEW-NUMBER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANSWER-TO-TIME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ANSWER-TO-TIME"), list(makeSymbol("NEW-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANSWER-TO-DEPTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ANSWER-TO-DEPTH"), list(makeSymbol("NEW-DEPTH")), makeKeyword("PUBLIC")) });

    public static final SubLInteger $int$21 = makeInteger(21);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ISI_QUERY_IMPROVEMENT_PROPOSAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISI-QUERY-IMPROVEMENT-PROPOSAL-CLASS");





    static private final SubLSymbol $sym125$SUBLOOP_RESERVED_INITIALIZE_ISI_QUERY_IMPROVEMENT_PROPOSAL_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ISI-QUERY-IMPROVEMENT-PROPOSAL-INSTANCE");

    static private final SubLList $list_alt126 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SOLUTION"), list(makeSymbol("CREATE-ISI-SOLUTION"), list(makeSymbol("LIST"), list(makeSymbol("CREATE-ISI-ASSERTION"), NIL, NIL)))), list(makeSymbol("CSETQ"), makeSymbol("ANSWER-TO"), list(makeSymbol("CREATE-ISI-PROBLEM"), NIL, NIL, NIL, NIL, NIL, NIL)), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym127$OUTER_CATCH_FOR_ISI_QUERY_IMPROVEMENT_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ISI-QUERY-IMPROVEMENT-PROPOSAL-METHOD");

    private static final SubLSymbol $MISSING_ASSERTIONS = makeKeyword("MISSING-ASSERTIONS");



    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_INITIALIZE_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLList $list_alt131 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(new SubLObject[]{ makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<QUERY-IMPROVEMENT-PROPOSAL :MISSING-ASSERTIONS ~S :ANSWER-TO/:FORMULA ~S ~\n                  :ANSWER-TO/:MT ~S :ANSWER-TO/:BACKCHAINS ~S :ANSWER-TO/:NUMBER ~S ~\n                  :ANSWER-TO/:TIME ~S :ANSWER-TO/:DEPTH ~S>"), makeSymbol("SOLUTION"), list(makeSymbol("GET-ISI-PROBLEM-QUERY"), makeSymbol("ANSWER-TO")), list(makeSymbol("GET-ISI-PROBLEM-MT"), makeSymbol("ANSWER-TO")), list(makeSymbol("GET-ISI-PROBLEM-BACKCHAINS"), makeSymbol("ANSWER-TO")), list(makeSymbol("GET-ISI-PROBLEM-NUMBER"), makeSymbol("ANSWER-TO")), list(makeSymbol("GET-ISI-PROBLEM-TIME"), makeSymbol("ANSWER-TO")), list(makeSymbol("GET-ISI-PROBLEM-DEPTH"), makeSymbol("ANSWER-TO")) }), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt132$__QUERY_IMPROVEMENT_PROPOSAL__MIS = makeString("#<QUERY-IMPROVEMENT-PROPOSAL :MISSING-ASSERTIONS ~S :ANSWER-TO/:FORMULA ~S ~\n                  :ANSWER-TO/:MT ~S :ANSWER-TO/:BACKCHAINS ~S :ANSWER-TO/:NUMBER ~S ~\n                  :ANSWER-TO/:TIME ~S :ANSWER-TO/:DEPTH ~S>");

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_PRINT_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-PRINT-METHOD");

    private static final SubLSymbol GET_SOLUTION = makeSymbol("GET-SOLUTION");

    static private final SubLList $list_alt135 = list(list(RET, makeSymbol("SOLUTION")));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_SOLUTION_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-SOLUTION-METHOD");

    private static final SubLSymbol SET_SOLUTION = makeSymbol("SET-SOLUTION");

    static private final SubLList $list_alt138 = list(makeSymbol("NEW-SOLUTION"));

    static private final SubLList $list_alt139 = list(list(makeSymbol("CSETQ"), makeSymbol("SOLUTION"), makeSymbol("NEW-SOLUTION")), list(RET, makeSymbol("NEW-SOLUTION")));

    static private final SubLSymbol $sym140$OUTER_CATCH_FOR_ISI_QUERY_IMPROVEMENT_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ISI-QUERY-IMPROVEMENT-PROPOSAL-METHOD");

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_SOLUTION_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-SOLUTION-METHOD");

    private static final SubLSymbol GET_ANSWER_TO = makeSymbol("GET-ANSWER-TO");

    static private final SubLList $list_alt143 = list(list(RET, makeSymbol("ANSWER-TO")));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-METHOD");

    private static final SubLSymbol SET_ANSWER_TO = makeSymbol("SET-ANSWER-TO");

    static private final SubLList $list_alt146 = list(makeSymbol("NEW-ANSWER-TO"));

    static private final SubLList $list_alt147 = list(list(makeSymbol("CSETQ"), makeSymbol("ANSWER-TO"), makeSymbol("NEW-ANSWER-TO")), list(RET, makeSymbol("NEW-ANSWER-TO")));

    static private final SubLSymbol $sym148$OUTER_CATCH_FOR_ISI_QUERY_IMPROVEMENT_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ISI-QUERY-IMPROVEMENT-PROPOSAL-METHOD");

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-METHOD");

    private static final SubLSymbol GET_SOLUTION_MISSING_ASSERTIONS = makeSymbol("GET-SOLUTION-MISSING-ASSERTIONS");

    static private final SubLList $list_alt151 = list(list(RET, list(makeSymbol("GET-ISI-SOLUTION-MISSING-ASSERTIONS"), makeSymbol("SOLUTION"))));

    static private final SubLSymbol $sym152$ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_SOLUTION_MISSING_ASSERTIONS_ME = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-SOLUTION-MISSING-ASSERTIONS-METHOD");

    private static final SubLSymbol SET_SOLUTION_MISSING_ASSERTIONS = makeSymbol("SET-SOLUTION-MISSING-ASSERTIONS");

    static private final SubLList $list_alt154 = list(makeSymbol("NEW-ASSERTIONS"));

    static private final SubLList $list_alt155 = list(list(makeSymbol("SET-ISI-SOLUTION-MISSING-ASSERTIONS"), makeSymbol("SOLUTION"), makeSymbol("NEW-ASSERTIONS")), list(RET, makeSymbol("NEW-ASSERTIONS")));

    static private final SubLSymbol $sym156$ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_SOLUTION_MISSING_ASSERTIONS_ME = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-SOLUTION-MISSING-ASSERTIONS-METHOD");

    private static final SubLSymbol GET_ANSWER_TO_FORMULA = makeSymbol("GET-ANSWER-TO-FORMULA");

    static private final SubLList $list_alt158 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-QUERY"), makeSymbol("ANSWER-TO"))));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_FORMULA_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-FORMULA-METHOD");

    private static final SubLSymbol SET_ANSWER_TO_FORMULA = makeSymbol("SET-ANSWER-TO-FORMULA");

    static private final SubLList $list_alt161 = list(makeSymbol("NEW-ANSWER-TO-FORMULA"));

    static private final SubLList $list_alt162 = list(list(makeSymbol("SET-ISI-PROBLEM-QUERY"), makeSymbol("ANSWER-TO"), makeSymbol("NEW-ANSWER-TO-FORMULA")), list(RET, makeSymbol("NEW-ANSWER-TO-FORMULA")));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_FORMULA_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-FORMULA-METHOD");

    private static final SubLSymbol GET_ANSWER_TO_MT = makeSymbol("GET-ANSWER-TO-MT");

    static private final SubLList $list_alt165 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-MT"), makeSymbol("ANSWER-TO"))));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_MT_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-MT-METHOD");

    private static final SubLSymbol SET_ANSWER_TO_MT = makeSymbol("SET-ANSWER-TO-MT");

    static private final SubLList $list_alt168 = list(list(makeSymbol("SET-ISI-PROBLEM-MT"), makeSymbol("ANSWER-TO"), makeSymbol("NEW-MT")), list(RET, makeSymbol("NEW-MT")));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_MT_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-MT-METHOD");

    private static final SubLSymbol GET_ANSWER_TO_BACKCHAINS = makeSymbol("GET-ANSWER-TO-BACKCHAINS");

    static private final SubLList $list_alt171 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-BACKCHAINS"), makeSymbol("ANSWER-TO"))));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_BACKCHAINS_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-BACKCHAINS-METHOD");

    private static final SubLSymbol SET_ANSWER_TO_BACKCHAINS = makeSymbol("SET-ANSWER-TO-BACKCHAINS");

    static private final SubLList $list_alt174 = list(list(makeSymbol("SET-ISI-PROBLEM-BACKCHAINS"), makeSymbol("ANSWER-TO"), makeSymbol("NEW-BACKCHAINS")), list(RET, makeSymbol("NEW-BACKCHAINS")));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_BACKCHAINS_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-BACKCHAINS-METHOD");

    private static final SubLSymbol GET_ANSWER_TO_NUMBER = makeSymbol("GET-ANSWER-TO-NUMBER");

    static private final SubLList $list_alt177 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-NUMBER"), makeSymbol("ANSWER-TO"))));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_NUMBER_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-NUMBER-METHOD");

    private static final SubLSymbol SET_ANSWER_TO_NUMBER = makeSymbol("SET-ANSWER-TO-NUMBER");

    static private final SubLList $list_alt180 = list(list(makeSymbol("SET-ISI-PROBLEM-NUMBER"), makeSymbol("ANSWER-TO"), makeSymbol("NEW-NUMBER")), list(RET, makeSymbol("NEW-NUMBER")));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_NUMBER_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-NUMBER-METHOD");

    private static final SubLSymbol GET_ANSWER_TO_TIME = makeSymbol("GET-ANSWER-TO-TIME");

    static private final SubLList $list_alt183 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-TIME"), makeSymbol("ANSWER-TO"))));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_TIME_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-TIME-METHOD");

    private static final SubLSymbol SET_ANSWER_TO_TIME = makeSymbol("SET-ANSWER-TO-TIME");

    static private final SubLList $list_alt186 = list(list(makeSymbol("SET-ISI-PROBLEM-TIME"), makeSymbol("ANSWER-TO"), makeSymbol("NEW-TIME")), list(RET, makeSymbol("NEW-TIME")));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_TIME_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-TIME-METHOD");

    private static final SubLSymbol GET_ANSWER_TO_DEPTH = makeSymbol("GET-ANSWER-TO-DEPTH");

    static private final SubLList $list_alt189 = list(list(RET, list(makeSymbol("GET-ISI-PROBLEM-DEPTH"), makeSymbol("ANSWER-TO"))));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_GET_ANSWER_TO_DEPTH_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-GET-ANSWER-TO-DEPTH-METHOD");

    private static final SubLSymbol SET_ANSWER_TO_DEPTH = makeSymbol("SET-ANSWER-TO-DEPTH");

    static private final SubLList $list_alt192 = list(list(makeSymbol("SET-ISI-PROBLEM-DEPTH"), makeSymbol("ANSWER-TO"), makeSymbol("NEW-DEPTH")), list(RET, makeSymbol("NEW-DEPTH")));

    private static final SubLSymbol ISI_QUERY_IMPROVEMENT_PROPOSAL_SET_ANSWER_TO_DEPTH_METHOD = makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL-SET-ANSWER-TO-DEPTH-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_isi_postings_file();
    }

    public void initializeVariables() {
        init_cyblack_isi_postings_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_isi_postings_file();
    }
}

