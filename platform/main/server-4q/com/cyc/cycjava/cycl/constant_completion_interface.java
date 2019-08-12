/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONSTANT-COMPLETION-INTERFACE
 * source file: /cyc/top/cycl/constant-completion-interface.lisp
 * created:     2019/07/03 17:37:18
 */
public final class constant_completion_interface extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new constant_completion_interface();

 public static final String myName = "com.cyc.cycjava.cycl.constant_completion_interface";


    private static final SubLSymbol KB_CONSTANT_COMPLETE_EXACT = makeSymbol("KB-CONSTANT-COMPLETE-EXACT");

    static private final SubLList $list4 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str5$Return_a_valid_constant_whose_nam = makeString("Return a valid constant whose name exactly matches STRING.\n   Optionally the START and END character positions can be\n   specified, such that the STRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");

    static private final SubLList $list6 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    static private final SubLList $list7 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));

    private static final SubLSymbol KB_CONSTANT_COMPLETE = makeSymbol("KB-CONSTANT-COMPLETE");

    static private final SubLList $list10 = list(makeSymbol("PREFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), makeSymbol("EXACT-LENGTH?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str11$Return_all_valid_constants_with_P = makeString("Return all valid constants with PREFIX as a prefix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   When EXACT-LENGTH? is non-nil, the prefix must be the entire string\n   Optionally the START and END character positions can be\n   specified, such that the PREFIX matches characters between the START and \n   END range.  If no constant exists, return NIL.");

    static private final SubLList $list12 = list(list(makeSymbol("PREFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("EXACT-LENGTH?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    static private final SubLList $list13 = list(list(makeSymbol("LIST"), makeSymbol("CONSTANT-P")));

    private static final SubLSymbol KB_CONSTANT_APROPOS = makeSymbol("KB-CONSTANT-APROPOS");

    static private final SubLList $list15 = list(makeSymbol("SUBSTRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str16$Return_all_valid_constants_with_S = makeString("Return all valid constants with SUBSTRING somewhere in their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");

    static private final SubLList $list17 = list(list(makeSymbol("SUBSTRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    private static final SubLSymbol KB_CONSTANT_POSTFIX = makeSymbol("KB-CONSTANT-POSTFIX");

    static private final SubLList $list19 = list(makeSymbol("POSTFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str20$Return_all_valid_constants_with_P = makeString("Return all valid constants with POSTFIX as a postfix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");

    static private final SubLList $list21 = list(list(makeSymbol("POSTFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    private static final SubLSymbol KB_N_CONSTANTS_BEFORE = makeSymbol("KB-N-CONSTANTS-BEFORE");

    static private final SubLList $list24 = list(makeSymbol("N"), makeSymbol("STRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("STRICT?"));

    static private final SubLString $str25$Return_the_N_constants_with_names = makeString("Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly\n   before the string are returned.");

    static private final SubLList $list26 = list(list(makeSymbol("N"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    private static final SubLSymbol KB_N_CONSTANTS_AFTER = makeSymbol("KB-N-CONSTANTS-AFTER");

    static private final SubLString $str28$Return_the_N_constants_with_names = makeString("Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly after\n   the string are returned.");

    private static final SubLSymbol KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL = makeSymbol("KB-NEW-CONSTANT-COMPLETION-ITERATOR-INTERNAL");

    private static final SubLSymbol KB_NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR_INTERNAL = makeSymbol("KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR-INTERNAL");

    // Definitions
    /**
     * Return a valid constant whose name exactly matches STRING.
     * Optionally the START and END character positions can be
     * specified, such that the STRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return a valid constant whose name exactly matches STRING.\r\nOptionally the START and END character positions can be\r\nspecified, such that the STRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static final SubLObject kb_constant_complete_exact_alt(SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.checkType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_COMPLETE_EXACT, list(QUOTE, string), list(QUOTE, start), list(QUOTE, end)));
        } else {
            return constant_completion_low.kb_constant_complete_exact_internal(string, start, end);
        }
    }

    // Definitions
    /**
     * Return a valid constant whose name exactly matches STRING.
     * Optionally the START and END character positions can be
     * specified, such that the STRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return a valid constant whose name exactly matches STRING.\r\nOptionally the START and END character positions can be\r\nspecified, such that the STRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
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

    /**
     * Return all valid constants with PREFIX as a prefix of their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * When EXACT-LENGTH? is non-nil, the prefix must be the entire string
     * Optionally the START and END character positions can be
     * specified, such that the PREFIX matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with PREFIX as a prefix of their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\r\nOptionally the START and END character positions can be\r\nspecified, such that the PREFIX matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static final SubLObject kb_constant_complete_alt(SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
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
        SubLTrampolineFile.checkType(prefix, STRINGP);
        SubLTrampolineFile.checkType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.checkType(exact_lengthP, BOOLEANP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.checkType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_COMPLETE, list(QUOTE, prefix), list(QUOTE, case_sensitiveP), list(QUOTE, exact_lengthP), list(QUOTE, start), list(QUOTE, end)));
        } else {
            return constant_completion_low.kb_constant_complete_internal(prefix, case_sensitiveP, exact_lengthP, start, end);
        }
    }

    /**
     * Return all valid constants with PREFIX as a prefix of their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * When EXACT-LENGTH? is non-nil, the prefix must be the entire string
     * Optionally the START and END character positions can be
     * specified, such that the PREFIX matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with PREFIX as a prefix of their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\r\nOptionally the START and END character positions can be\r\nspecified, such that the PREFIX matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and\nEND range.  If no constant exists, return NIL.")
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

    /**
     * Return all valid constants with SUBSTRING somewhere in their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * Optionally the START and END character positions can be
     * specified, such that the SUBSTRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with SUBSTRING somewhere in their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nOptionally the START and END character positions can be\r\nspecified, such that the SUBSTRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static final SubLObject kb_constant_apropos_alt(SubLObject substring, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(substring, STRINGP);
        SubLTrampolineFile.checkType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.checkType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_APROPOS, list(QUOTE, substring), list(QUOTE, case_sensitiveP), list(QUOTE, start), list(QUOTE, end)));
        } else {
            return constant_completion_low.kb_constant_apropos_internal(substring, case_sensitiveP, start, end);
        }
    }

    /**
     * Return all valid constants with SUBSTRING somewhere in their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * Optionally the START and END character positions can be
     * specified, such that the SUBSTRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with SUBSTRING somewhere in their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nOptionally the START and END character positions can be\r\nspecified, such that the SUBSTRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
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

    /**
     * Return all valid constants with POSTFIX as a postfix of their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * Optionally the START and END character positions can be
     * specified, such that the SUBSTRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with POSTFIX as a postfix of their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nOptionally the START and END character positions can be\r\nspecified, such that the SUBSTRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
    public static final SubLObject kb_constant_postfix_alt(SubLObject postfix, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(postfix, STRINGP);
        SubLTrampolineFile.checkType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.checkType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_POSTFIX, list(QUOTE, postfix), list(QUOTE, case_sensitiveP), list(QUOTE, start), list(QUOTE, end)));
        } else {
            return constant_completion_low.kb_constant_postfix_internal(postfix, case_sensitiveP, start, end);
        }
    }

    /**
     * Return all valid constants with POSTFIX as a postfix of their name
     * When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
     * Optionally the START and END character positions can be
     * specified, such that the SUBSTRING matches characters between the START and
     * END range.  If no constant exists, return NIL.
     */
    @LispMethod(comment = "Return all valid constants with POSTFIX as a postfix of their name\r\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\r\nOptionally the START and END character positions can be\r\nspecified, such that the SUBSTRING matches characters between the START and\r\nEND range.  If no constant exists, return NIL.\nReturn all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and\nEND range.  If no constant exists, return NIL.")
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

    /**
     * Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,
     * the comparison is done in a case-sensitive fashion.  Optionally the START and END
     * character positions can be specified, such that STRING matches characters between
     * the START and END range.  If STRICT? is non-nil, then only constants strictly
     * before the string are returned.
     */
    @LispMethod(comment = "Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\r\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\r\ncharacter positions can be specified, such that STRING matches characters between\r\nthe START and END range.  If STRICT? is non-nil, then only constants strictly\r\nbefore the string are returned.\nReturn the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\ncharacter positions can be specified, such that STRING matches characters between\nthe START and END range.  If STRICT? is non-nil, then only constants strictly\nbefore the string are returned.")
    public static final SubLObject kb_n_constants_before_alt(SubLObject n, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
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
        SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        SubLTrampolineFile.checkType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.checkType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_N_CONSTANTS_BEFORE, list(QUOTE, n), list(QUOTE, string), list(QUOTE, case_sensitiveP), list(QUOTE, start), list(QUOTE, end), list(QUOTE, strictP)));
        } else {
            return constant_completion_low.kb_n_constants_before_internal(n, string, case_sensitiveP, start, end, strictP);
        }
    }

    /**
     * Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,
     * the comparison is done in a case-sensitive fashion.  Optionally the START and END
     * character positions can be specified, such that STRING matches characters between
     * the START and END range.  If STRICT? is non-nil, then only constants strictly
     * before the string are returned.
     */
    @LispMethod(comment = "Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\r\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\r\ncharacter positions can be specified, such that STRING matches characters between\r\nthe START and END range.  If STRICT? is non-nil, then only constants strictly\r\nbefore the string are returned.\nReturn the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\ncharacter positions can be specified, such that STRING matches characters between\nthe START and END range.  If STRICT? is non-nil, then only constants strictly\nbefore the string are returned.")
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

    /**
     * Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,
     * the comparison is done in a case-sensitive fashion.  Optionally the START and END
     * character positions can be specified, such that STRING matches characters between
     * the START and END range.  If STRICT? is non-nil, then only constants strictly after
     * the string are returned.
     */
    @LispMethod(comment = "Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\r\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\r\ncharacter positions can be specified, such that STRING matches characters between\r\nthe START and END range.  If STRICT? is non-nil, then only constants strictly after\r\nthe string are returned.\nReturn the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\ncharacter positions can be specified, such that STRING matches characters between\nthe START and END range.  If STRICT? is non-nil, then only constants strictly after\nthe string are returned.")
    public static final SubLObject kb_n_constants_after_alt(SubLObject n, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
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
        SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        SubLTrampolineFile.checkType(case_sensitiveP, BOOLEANP);
        SubLTrampolineFile.checkType(start, FIXNUMP);
        if (NIL != end) {
            SubLTrampolineFile.checkType(end, FIXNUMP);
        }
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_N_CONSTANTS_AFTER, list(QUOTE, n), list(QUOTE, string), list(QUOTE, case_sensitiveP), list(QUOTE, start), list(QUOTE, end), list(QUOTE, strictP)));
        } else {
            return constant_completion_low.kb_n_constants_after_internal(n, string, case_sensitiveP, start, end, strictP);
        }
    }

    /**
     * Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,
     * the comparison is done in a case-sensitive fashion.  Optionally the START and END
     * character positions can be specified, such that STRING matches characters between
     * the START and END range.  If STRICT? is non-nil, then only constants strictly after
     * the string are returned.
     */
    @LispMethod(comment = "Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\r\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\r\ncharacter positions can be specified, such that STRING matches characters between\r\nthe START and END range.  If STRICT? is non-nil, then only constants strictly after\r\nthe string are returned.\nReturn the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\nthe comparison is done in a case-sensitive fashion.  Optionally the START and END\ncharacter positions can be specified, such that STRING matches characters between\nthe START and END range.  If STRICT? is non-nil, then only constants strictly after\nthe string are returned.")
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

    static private final SubLList $list_alt4 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str_alt5$Return_a_valid_constant_whose_nam = makeString("Return a valid constant whose name exactly matches STRING.\n   Optionally the START and END character positions can be\n   specified, such that the STRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");

    /**
     * Returns an iterator for the constants in the constant completion table.
     */
    @LispMethod(comment = "Returns an iterator for the constants in the constant completion table.")
    public static final SubLObject kb_new_constant_completion_iterator_alt(SubLObject forwardP, SubLObject buffer_size) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return hl_interface_infrastructure.new_hl_store_iterator(list(KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL, list_utilities.quotify(forwardP)), buffer_size);
    }

    /**
     * Returns an iterator for the constants in the constant completion table.
     */
    @LispMethod(comment = "Returns an iterator for the constants in the constant completion table.")
    public static SubLObject kb_new_constant_completion_iterator(SubLObject forwardP, SubLObject buffer_size) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return hl_interface_infrastructure.new_hl_store_iterator(list(KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL, list_utilities.quotify(forwardP)), buffer_size);
    }

    static private final SubLList $list_alt6 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    static private final SubLList $list_alt7 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));

    /**
     * Returns an iterator for the constants in the constant completion table
     * beginning with STRING and going alphabetically if FORWARD and reverse
     * alphabetically otherwise.
     */
    @LispMethod(comment = "Returns an iterator for the constants in the constant completion table\r\nbeginning with STRING and going alphabetically if FORWARD and reverse\r\nalphabetically otherwise.\nReturns an iterator for the constants in the constant completion table\nbeginning with STRING and going alphabetically if FORWARD and reverse\nalphabetically otherwise.")
    public static final SubLObject kb_new_directed_constant_completion_iterator_alt(SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject buffer_size) {
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

    /**
     * Returns an iterator for the constants in the constant completion table
     * beginning with STRING and going alphabetically if FORWARD and reverse
     * alphabetically otherwise.
     */
    @LispMethod(comment = "Returns an iterator for the constants in the constant completion table\r\nbeginning with STRING and going alphabetically if FORWARD and reverse\r\nalphabetically otherwise.\nReturns an iterator for the constants in the constant completion table\nbeginning with STRING and going alphabetically if FORWARD and reverse\nalphabetically otherwise.")
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

    static private final SubLList $list_alt10 = list(makeSymbol("PREFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), makeSymbol("EXACT-LENGTH?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str_alt11$Return_all_valid_constants_with_P = makeString("Return all valid constants with PREFIX as a prefix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   When EXACT-LENGTH? is non-nil, the prefix must be the entire string\n   Optionally the START and END character positions can be\n   specified, such that the PREFIX matches characters between the START and \n   END range.  If no constant exists, return NIL.");

    static private final SubLList $list_alt12 = list(list(makeSymbol("PREFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("EXACT-LENGTH?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    public static SubLObject declare_constant_completion_interface_file() {
        declareFunction("kb_constant_complete_exact", "KB-CONSTANT-COMPLETE-EXACT", 1, 2, false);
        declareFunction("kb_constant_complete", "KB-CONSTANT-COMPLETE", 1, 4, false);
        declareFunction("kb_constant_apropos", "KB-CONSTANT-APROPOS", 1, 3, false);
        declareFunction("kb_constant_postfix", "KB-CONSTANT-POSTFIX", 1, 3, false);
        declareFunction("kb_n_constants_before", "KB-N-CONSTANTS-BEFORE", 2, 4, false);
        declareFunction("kb_n_constants_after", "KB-N-CONSTANTS-AFTER", 2, 4, false);
        declareFunction("kb_new_constant_completion_iterator", "KB-NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false);
        declareFunction("kb_new_directed_constant_completion_iterator", "KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false);
        return NIL;
    }

    static private final SubLList $list_alt13 = list(list(makeSymbol("LIST"), makeSymbol("CONSTANT-P")));

    static private final SubLList $list_alt15 = list(makeSymbol("SUBSTRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str_alt16$Return_all_valid_constants_with_S = makeString("Return all valid constants with SUBSTRING somewhere in their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");

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

    static private final SubLList $list_alt17 = list(list(makeSymbol("SUBSTRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    static private final SubLList $list_alt19 = list(makeSymbol("POSTFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    static private final SubLString $str_alt20$Return_all_valid_constants_with_P = makeString("Return all valid constants with POSTFIX as a postfix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");

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

    static private final SubLList $list_alt21 = list(list(makeSymbol("POSTFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    static {
    }

    static private final SubLList $list_alt24 = list(makeSymbol("N"), makeSymbol("STRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("STRICT?"));

    static private final SubLString $str_alt25$Return_the_N_constants_with_names = makeString("Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly\n   before the string are returned.");

    static private final SubLList $list_alt26 = list(list(makeSymbol("N"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));

    static private final SubLString $str_alt28$Return_the_N_constants_with_names = makeString("Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly after\n   the string are returned.");
}

/**
 * Total time: 55 ms
 */
