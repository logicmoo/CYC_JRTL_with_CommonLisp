package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.constant_completion_interface;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_completion_interface.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class constant_completion_interface extends SubLTranslatedFile {
    public static final SubLFile me = new constant_completion_interface();

    public static final String myName = "com.cyc.cycjava.cycl.constant_completion_interface";

    public static final String myFingerPrint = "19be7027efccf598d4148d8970f0f917a121ea7805de0483c33f599d58cef964";





    public static final SubLSymbol KB_CONSTANT_COMPLETE_EXACT = makeSymbol("KB-CONSTANT-COMPLETE-EXACT");



    public static final SubLList $list4 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    public static final SubLString $str5$Return_a_valid_constant_whose_nam = makeString("Return a valid constant whose name exactly matches STRING.\n   Optionally the START and END character positions can be\n   specified, such that the STRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");

    public static final SubLList $list6 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    public static final SubLList $list7 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));



    public static final SubLSymbol KB_CONSTANT_COMPLETE = makeSymbol("KB-CONSTANT-COMPLETE");

    public static final SubLList $list10 = list(makeSymbol("PREFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), makeSymbol("EXACT-LENGTH?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    public static final SubLString $str11$Return_all_valid_constants_with_P = makeString("Return all valid constants with PREFIX as a prefix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   When EXACT-LENGTH? is non-nil, the prefix must be the entire string\n   Optionally the START and END character positions can be\n   specified, such that the PREFIX matches characters between the START and \n   END range.  If no constant exists, return NIL.");

    public static final SubLList $list12 = list(list(makeSymbol("PREFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("EXACT-LENGTH?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    public static final SubLList $list13 = list(list(makeSymbol("LIST"), makeSymbol("CONSTANT-P")));

    public static final SubLSymbol KB_CONSTANT_APROPOS = makeSymbol("KB-CONSTANT-APROPOS");

    public static final SubLList $list15 = list(makeSymbol("SUBSTRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    public static final SubLString $str16$Return_all_valid_constants_with_S = makeString("Return all valid constants with SUBSTRING somewhere in their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");

    public static final SubLList $list17 = list(list(makeSymbol("SUBSTRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    public static final SubLSymbol KB_CONSTANT_POSTFIX = makeSymbol("KB-CONSTANT-POSTFIX");

    public static final SubLList $list19 = list(makeSymbol("POSTFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    public static final SubLString $str20$Return_all_valid_constants_with_P = makeString("Return all valid constants with POSTFIX as a postfix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");

    public static final SubLList $list21 = list(list(makeSymbol("POSTFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));



    public static final SubLSymbol KB_N_CONSTANTS_BEFORE = makeSymbol("KB-N-CONSTANTS-BEFORE");

    public static final SubLList $list24 = list(makeSymbol("N"), makeSymbol("STRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("STRICT?"));

    public static final SubLString $str25$Return_the_N_constants_with_names = makeString("Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly\n   before the string are returned.");

    public static final SubLList $list26 = list(list(makeSymbol("N"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    public static final SubLSymbol KB_N_CONSTANTS_AFTER = makeSymbol("KB-N-CONSTANTS-AFTER");

    public static final SubLString $str28$Return_the_N_constants_with_names = makeString("Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly after\n   the string are returned.");

    public static final SubLSymbol KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL = makeSymbol("KB-NEW-CONSTANT-COMPLETION-ITERATOR-INTERNAL");

    public static final SubLSymbol KB_NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR_INTERNAL = makeSymbol("KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR-INTERNAL");

    public static SubLObject kb_constant_complete_exact(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.enforceType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_COMPLETE_EXACT, list(QUOTE, string), list(QUOTE, start), list(QUOTE, end)));
        }
        final SubLObject result = constant_completion_low.kb_constant_complete_exact_internal(string, start, end);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject kb_constant_complete(final SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (exact_lengthP == UNPROVIDED) {
            exact_lengthP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.enforceType(prefix, STRINGP);
        SubLTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.enforceType(exact_lengthP, BOOLEANP);
        SubLTrampolineFile.enforceType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.enforceType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_COMPLETE, list(QUOTE, prefix), list(QUOTE, case_sensitiveP), list(QUOTE, exact_lengthP), list(QUOTE, start), list(QUOTE, end)));
        }
        final SubLObject result = constant_completion_low.kb_constant_complete_internal(prefix, case_sensitiveP, exact_lengthP, start, end);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject kb_constant_apropos(final SubLObject substring, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.enforceType(substring, STRINGP);
        SubLTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.enforceType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.enforceType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_APROPOS, list(QUOTE, substring), list(QUOTE, case_sensitiveP), list(QUOTE, start), list(QUOTE, end)));
        }
        final SubLObject result = constant_completion_low.kb_constant_apropos_internal(substring, case_sensitiveP, start, end);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject kb_constant_postfix(final SubLObject postfix, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.enforceType(postfix, STRINGP);
        SubLTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.enforceType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.enforceType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_POSTFIX, list(QUOTE, postfix), list(QUOTE, case_sensitiveP), list(QUOTE, start), list(QUOTE, end)));
        }
        final SubLObject result = constant_completion_low.kb_constant_postfix_internal(postfix, case_sensitiveP, start, end);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject kb_n_constants_before(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        SubLTrampolineFile.enforceType(n, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.enforceType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.enforceType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_N_CONSTANTS_BEFORE, list(QUOTE, n), list(QUOTE, string), list(QUOTE, case_sensitiveP), list(QUOTE, start), list(QUOTE, end), list(QUOTE, strictP)));
        }
        final SubLObject result = constant_completion_low.kb_n_constants_before_internal(n, string, case_sensitiveP, start, end, strictP);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject kb_n_constants_after(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        SubLTrampolineFile.enforceType(n, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.enforceType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.enforceType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_N_CONSTANTS_AFTER, list(QUOTE, n), list(QUOTE, string), list(QUOTE, case_sensitiveP), list(QUOTE, start), list(QUOTE, end), list(QUOTE, strictP)));
        }
        final SubLObject result = constant_completion_low.kb_n_constants_after_internal(n, string, case_sensitiveP, start, end, strictP);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject kb_new_constant_completion_iterator(SubLObject forwardP, SubLObject buffer_size) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return hl_interface_infrastructure.new_hl_store_iterator(list(KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL, list_utilities.quotify(forwardP)), buffer_size);
    }

    public static SubLObject kb_new_directed_constant_completion_iterator(final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject buffer_size) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return hl_interface_infrastructure.new_hl_store_iterator(list(KB_NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR_INTERNAL, list_utilities.quotify(string), list_utilities.quotify(case_sensitiveP), list_utilities.quotify(start), list_utilities.quotify(end), list_utilities.quotify(forwardP)), buffer_size);
    }

    public static SubLObject declare_constant_completion_interface_file() {
        declareFunction(me, "kb_constant_complete_exact", "KB-CONSTANT-COMPLETE-EXACT", 1, 2, false);
        declareFunction(me, "kb_constant_complete", "KB-CONSTANT-COMPLETE", 1, 4, false);
        declareFunction(me, "kb_constant_apropos", "KB-CONSTANT-APROPOS", 1, 3, false);
        declareFunction(me, "kb_constant_postfix", "KB-CONSTANT-POSTFIX", 1, 3, false);
        declareFunction(me, "kb_n_constants_before", "KB-N-CONSTANTS-BEFORE", 2, 4, false);
        declareFunction(me, "kb_n_constants_after", "KB-N-CONSTANTS-AFTER", 2, 4, false);
        declareFunction(me, "kb_new_constant_completion_iterator", "KB-NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false);
        declareFunction(me, "kb_new_directed_constant_completion_iterator", "KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false);
        return NIL;
    }

    public static SubLObject init_constant_completion_interface_file() {
        return NIL;
    }

    public static SubLObject setup_constant_completion_interface_file() {
        register_cyc_api_function(KB_CONSTANT_COMPLETE_EXACT, $list4, $str5$Return_a_valid_constant_whose_nam, $list6, $list7);
        register_cyc_api_function(KB_CONSTANT_COMPLETE, $list10, $str11$Return_all_valid_constants_with_P, $list12, $list13);
        register_cyc_api_function(KB_CONSTANT_APROPOS, $list15, $str16$Return_all_valid_constants_with_S, $list17, $list13);
        register_cyc_api_function(KB_CONSTANT_POSTFIX, $list19, $str20$Return_all_valid_constants_with_P, $list21, $list13);
        register_cyc_api_function(KB_N_CONSTANTS_BEFORE, $list24, $str25$Return_the_N_constants_with_names, $list26, $list13);
        register_cyc_api_function(KB_N_CONSTANTS_AFTER, $list24, $str28$Return_the_N_constants_with_names, $list26, $list13);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constant_completion_interface_file();
    }

    @Override
    public void initializeVariables() {
        init_constant_completion_interface_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constant_completion_interface_file();
    }

    static {
































    }
}

/**
 * Total time: 55 ms
 */
