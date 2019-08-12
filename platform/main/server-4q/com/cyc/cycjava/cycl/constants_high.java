/**
 *
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_macros.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONSTANTS-HIGH
 * source file: /cyc/top/cycl/constants-high.lisp
 * created:     2019/07/03 17:37:20
 */
public final class constants_high extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt17$ = makeString("");

    public static final SubLFile me = new constants_high();

 public static final String myName = "com.cyc.cycjava.cycl.constants_high";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $constant_legacy_guid_date$ = makeSymbol("*CONSTANT-LEGACY-GUID-DATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $constant_dump_id_table$ = makeSymbol("*CONSTANT-DUMP-ID-TABLE*");

    private static final SubLList $list0 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("NUM"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping constants for sweep")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list1 = list(makeKeyword("NUM"), makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLString $$$mapping_constants_for_sweep = makeString("mapping constants for sweep");

    private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

    private static final SubLSymbol CONSTANTS_AROUND = makeSymbol("CONSTANTS-AROUND");

    private static final SubLList $list11 = list(makeSymbol("NEXT-CONSTANT-SUID"));

    private static final SubLSymbol DO_CONSTANTS = makeSymbol("DO-CONSTANTS");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol CONSTANT_NAME_SPEC_P = makeSymbol("CONSTANT-NAME-SPEC-P");

    private static final SubLSymbol CREATE_CONSTANT = makeSymbol("CREATE-CONSTANT");

    static private final SubLList $list16 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));

    private static final SubLString $str17$Return_a_new_constant_named_NAME_ = makeString("Return a new constant named NAME with EXTERNAL-ID as the external ID.");

    private static final SubLList $list18 = list(list(makeSymbol("NAME"), makeSymbol("CONSTANT-NAME-SPEC-P")), list(makeSymbol("EXTERNAL-ID"), list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P"))));

    private static final SubLList $list19 = list(makeSymbol("CONSTANT-P"));

    private static final SubLSymbol FIND_OR_CREATE_CONSTANT = makeSymbol("FIND-OR-CREATE-CONSTANT");

    private static final SubLString $str22$Return_the_constant_with_NAME_if_ = makeString("Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\n  Also, if it exists but has a null id, install EXTERNAL-ID on the constant.");

    private static final SubLList $list23 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));

    private static final SubLString $$$TMP = makeString("TMP");

    private static final SubLString $str25$_A__A = makeString("~A-~A");

    private static final SubLSymbol GENTEMP_CONSTANT = makeSymbol("GENTEMP-CONSTANT");

    static private final SubLList $list27 = list(makeSymbol("START-NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("PREFIX"), makeString("TMP")));

    private static final SubLString $str28$Create_and_return_a_temporary_con = makeString("Create and return a temporary constant whose name is based on START-NAME");

    static private final SubLList $list29 = list(list(makeSymbol("START-NAME"), makeSymbol("STRINGP")));

    private static final SubLString $str30$ = makeString("");

    private static final SubLString $$$T = makeString("T");

    private static final SubLString $str34$T_ = makeString("T-");

    private static final SubLSymbol REMOVE_CONSTANT = makeSymbol("REMOVE-CONSTANT");

    static private final SubLList $list37 = list(makeSymbol("CONSTANT"));

    private static final SubLString $str38$Remove_CONSTANT_from_the_KB_ = makeString("Remove CONSTANT from the KB.");

    private static final SubLList $list39 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));

    static private final SubLList $list40 = list(makeSymbol("NULL"));

    private static final SubLList $list42 = list(makeSymbol("NAME"));

    private static final SubLString $str43$Return_the_constant_with_NAME__or = makeString("Return the constant with NAME, or NIL if not present.");

    private static final SubLList $list44 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));

    private static final SubLString $str46$Return_the_name_of_CONSTANT_or__u = makeString("Return the name of CONSTANT or :unnamed.");

    private static final SubLSymbol GUID_STRING_P = makeSymbol("GUID-STRING-P");

    private static final SubLSymbol RENAME_CONSTANT = makeSymbol("RENAME-CONSTANT");

    static private final SubLList $list50 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"));

    private static final SubLString $str51$Rename_CONSTANT_to_have_NEW_NAME_ = makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");

    static private final SubLList $list52 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NEW-NAME"), makeSymbol("STRINGP")));

    private static final SubLSymbol CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");

    private static final SubLString $str54$Return_the_internal_id_of_CONSTAN = makeString("Return the internal id of CONSTANT.");

    static private final SubLList $list55 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-INTERNAL-ID-P")));

    private static final SubLSymbol CONSTANT_INTERNAL_ID_P = makeSymbol("CONSTANT-INTERNAL-ID-P");

    static private final SubLList $list58 = list(makeSymbol("ID"));

    private static final SubLString $str59$Return_the_constant_with_internal = makeString("Return the constant with internal ID, or NIL if not present.");

    static private final SubLList $list60 = list(list(makeSymbol("ID"), makeSymbol("CONSTANT-INTERNAL-ID-P")));

    private static final SubLList $list61 = list(makeSymbol("ID-MAP"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $constant_external_id_equivalence_map$ = makeSymbol("*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*");

    private static final SubLSymbol CONSTANT_EXTERNAL_ID = makeSymbol("CONSTANT-EXTERNAL-ID");

    private static final SubLString $str65$Return_the_external_id_of_CONSTAN = makeString("Return the external id of CONSTANT.");

    static private final SubLList $list66 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));

    private static final SubLSymbol FIND_CONSTANT_BY_EXTERNAL_ID = makeSymbol("FIND-CONSTANT-BY-EXTERNAL-ID");

    private static final SubLList $list68 = list(makeSymbol("EXTERNAL-ID"));

    private static final SubLString $str69$Return_the_constant_with_EXTERNAL = makeString("Return the constant with EXTERNAL-ID, or NIL if not present.");

    private static final SubLList $list70 = list(list(makeSymbol("EXTERNAL-ID"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));

    private static final SubLSymbol CONSTANT_INFO_FROM_GUID_STRINGS = makeSymbol("CONSTANT-INFO-FROM-GUID-STRINGS");

    private static final SubLList $list73 = list(makeSymbol("GUID-STRING-LIST"));

    private static final SubLString $str74$Returns_a_list_of_constant_info_i = makeString("Returns a list of constant info-items corresponding to the GUID-LIST.  Each\ninfo item is a list of guid-string and name.");

    static private final SubLList $list75 = list(list(makeSymbol("GUID-STRING-LIST"), makeSymbol("LISTP")));

    private static final SubLList $list76 = list(makeSymbol("LISTP"));

    private static final SubLSymbol CONSTANT_INFO_FROM_NAME_STRINGS = makeSymbol("CONSTANT-INFO-FROM-NAME-STRINGS");

    private static final SubLList $list78 = list(makeSymbol("NAME-STRING-LIST"));

    private static final SubLString $str79$Returns_a_list_of_constant_info_i = makeString("Returns a list of constant info-items corresponding to the NAME-LIST.  Each\ninfo item is a list of guid-string and name.");

    private static final SubLList $list80 = list(list(makeSymbol("NAME-STRING-LIST"), makeSymbol("LISTP")));

    private static final SubLList $list81 = list(SEVEN_INTEGER, TWENTY_INTEGER, makeInteger(1969));

    private static final SubLSymbol CONSTANT_LEGACY_ID_P = makeSymbol("CONSTANT-LEGACY-ID-P");

    private static final SubLList $list83 = list(makeSymbol("MONTH"), makeSymbol("DAY"), makeSymbol("YEAR"));

    static private final SubLList $list84 = list(makeSymbol("LEGACY-MONTH"), makeSymbol("LEGACY-DAY"), makeSymbol("LEGACY-YEAR"));

    private static final SubLString $$$cyc = makeString("cyc");

    private static final SubLSymbol CONSTANT_NAMESPACE = makeSymbol("CONSTANT-NAMESPACE");

    private static final SubLString $str88$Return_the_namespace_to_which_the = makeString("Return the namespace to which the constant belongs.");

    private static final SubLSymbol CONSTANT_NAME_WITHIN_NAMESPACE = makeSymbol("CONSTANT-NAME-WITHIN-NAMESPACE");

    private static final SubLString $str90$Return_the_constant_name_within_i = makeString("Return the constant name within its namespace.");

    private static final SubLSymbol RANDOM_CONSTANT = makeSymbol("RANDOM-CONSTANT");

    private static final SubLList $list93 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("FUNCTION"), makeSymbol("TRUE"))));

    private static final SubLString $str94$Return_a_randomly_chosen_constant = makeString("Return a randomly chosen constant that satisfies TEST");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol REGULAR_EXPRESSION_P = makeSymbol("REGULAR-EXPRESSION-P");

    private static final SubLString $str98$Error__A___A__compiling_regular_e = makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");

    private static final SubLList $list100 = list(makeSymbol("CHECKPOINT-COUNT"), makeSymbol("CHECKPOINT-NEXT-ID"));

    private static final SubLList $list101 = list(list(makeSymbol("*CONSTANT-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-CONSTANT-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-CONSTANT-HANDLE-FUNC*"), list(QUOTE, makeSymbol("CONSTANT-DUMP-ID"))));

    private static final SubLSymbol WITH_CONSTANT_NAME_OBFUSCATION = makeSymbol("WITH-CONSTANT-NAME-OBFUSCATION");

    private static final SubLList $list103 = list(makeSymbol("OBFUSCATE-FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $constant_name_obfuscation_fn$ = makeSymbol("*CONSTANT-NAME-OBFUSCATION-FN*");

    private static final SubLSymbol FIND_CONSTANT_BY_SUID = makeSymbol("FIND-CONSTANT-BY-SUID");

    private static final boolean $find_renamed$ = false;

    public static SubLObject do_recent_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject num_tail = property_list_member($NUM, current);
        final SubLObject num = (NIL != num_tail) ? cadr(num_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_constants_for_sweep;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PIF, list(POSITIVE_INTEGER_P, num), listS(PROGRESS_CSOME, list(var, list(CONSTANTS_AROUND, $list11, num, num), progress_message, done), append(body, NIL)), listS(DO_CONSTANTS, list(var, progress_message, $DONE, done), append(body, NIL)));
    }

    // Definitions
    /**
     * Return a new constant named NAME with EXTERNAL-ID as the external ID.
     */
    @LispMethod(comment = "Return a new constant named NAME with EXTERNAL-ID as the external ID.")
    public static final SubLObject create_constant_alt(SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        SubLTrampolineFile.checkType(name, CONSTANT_NAME_SPEC_P);
        if (NIL != external_id) {
            SubLTrampolineFile.checkType(external_id, CONSTANT_EXTERNAL_ID_P);
        }
        if (NIL == external_id) {
            external_id = com.cyc.cycjava.cycl.constants_high.make_constant_external_id();
        }
        return constants_interface.kb_create_constant(name, external_id);
    }

    // Definitions
    /**
     * Return a new constant named NAME with EXTERNAL-ID as the external ID.
     */
    @LispMethod(comment = "Return a new constant named NAME with EXTERNAL-ID as the external ID.")
    public static SubLObject create_constant(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        SubLTrampolineFile.enforceType(name, CONSTANT_NAME_SPEC_P);
        if (NIL != external_id) {
            SubLTrampolineFile.enforceType(external_id, CONSTANT_EXTERNAL_ID_P);
        }
        if (NIL == external_id) {
            external_id = make_constant_external_id();
        }
        SubLObject result = NIL;
        result = constants_interface.kb_create_constant(name, external_id);
        return result;
    }

    /**
     * Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.
     * Also, if it exists but has a null id, install EXTERNAL-ID on the constant.
     */
    @LispMethod(comment = "Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\r\nAlso, if it exists but has a null id, install EXTERNAL-ID on the constant.\nReturn the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\nAlso, if it exists but has a null id, install EXTERNAL-ID on the constant.")
    public static final SubLObject find_or_create_constant_alt(SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        SubLTrampolineFile.checkType(name, STRINGP);
        {
            SubLObject constant = com.cyc.cycjava.cycl.constants_high.find_constant(name);
            if (NIL != com.cyc.cycjava.cycl.constants_high.installed_constant_p(constant)) {
                return constant;
            } else {
                return com.cyc.cycjava.cycl.constants_high.create_constant(name, external_id);
            }
        }
    }

    /**
     * Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.
     * Also, if it exists but has a null id, install EXTERNAL-ID on the constant.
     */
    @LispMethod(comment = "Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\r\nAlso, if it exists but has a null id, install EXTERNAL-ID on the constant.\nReturn the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\nAlso, if it exists but has a null id, install EXTERNAL-ID on the constant.")
    public static SubLObject find_or_create_constant(final SubLObject name, SubLObject external_id) {
        if (external_id == UNPROVIDED) {
            external_id = NIL;
        }
        SubLTrampolineFile.enforceType(name, STRINGP);
        final SubLObject constant = find_constant(name);
        if (NIL != installed_constant_p(constant)) {
            return constant;
        }
        return create_constant(name, external_id);
    }

    /**
     * Create and return a temporary constant whose name is based on START-NAME
     */
    @LispMethod(comment = "Create and return a temporary constant whose name is based on START-NAME")
    public static final SubLObject gentemp_constant_alt(SubLObject start_name, SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$TMP;
        }
        SubLTrampolineFile.checkType(start_name, STRINGP);
        {
            SubLObject name = constant_completion_high.uniquify_constant_name(format(NIL, $str_alt12$_A__A, prefix, start_name));
            SubLObject constant = com.cyc.cycjava.cycl.constants_high.create_constant(name, UNPROVIDED);
            return constant;
        }
    }

    /**
     * Create and return a temporary constant whose name is based on START-NAME
     */
    @LispMethod(comment = "Create and return a temporary constant whose name is based on START-NAME")
    public static SubLObject gentemp_constant(final SubLObject start_name, SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$TMP;
        }
        SubLTrampolineFile.enforceType(start_name, STRINGP);
        final SubLObject name = constant_completion_high.uniquify_constant_name(format(NIL, $str25$_A__A, prefix, start_name), UNPROVIDED);
        final SubLObject constant = create_constant(name, UNPROVIDED);
        return constant;
    }

    public static final SubLObject suggest_constant_name(SubLObject string, SubLObject prefix, SubLObject suffix, SubLObject capitalizeP, SubLObject uniquifyP) {
        if (prefix == UNPROVIDED) {
            prefix = $str_alt17$;
        }
        if (suffix == UNPROVIDED) {
            suffix = $str_alt17$;
        }
        if (capitalizeP == UNPROVIDED) {
            capitalizeP = T;
        }
        if (uniquifyP == UNPROVIDED) {
            uniquifyP = T;
        }
        {
            SubLObject name = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                {
                    SubLObject string_var = string;
                    SubLObject end_var = length(string_var);
                    SubLObject end_var_1 = end_var;
                    SubLObject char_num = NIL;
                    for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_1); char_num = number_utilities.f_1X(char_num)) {
                        {
                            SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                            SubLObject valid_charP = constant_completion_high.valid_constant_name_char_p(v_char);
                            if (v_char == CHAR_space) {
                                capitalizeP = T;
                            } else {
                                if ((NIL != valid_charP) && (NIL != capitalizeP)) {
                                    princ(char_upcase(v_char), stream);
                                    capitalizeP = NIL;
                                } else {
                                    if (NIL != valid_charP) {
                                        princ(v_char, stream);
                                    }
                                }
                            }
                        }
                    }
                }
                name = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            if (name.equalp($$$T)) {
                name = $str_alt19$T_;
            }
            name = cconcatenate(prefix, new SubLObject[]{ name, suffix });
            if (NIL != uniquifyP) {
                name = constant_completion_high.uniquify_constant_name(name);
            }
            return name;
        }
    }

    public static SubLObject suggest_constant_name(final SubLObject string, SubLObject prefix, SubLObject suffix, SubLObject initial_case, SubLObject uniquifyP, SubLObject sequentialP) {
        if (prefix == UNPROVIDED) {
            prefix = $str30$;
        }
        if (suffix == UNPROVIDED) {
            suffix = $str30$;
        }
        if (initial_case == UNPROVIDED) {
            initial_case = $UPCASE;
        }
        if (uniquifyP == UNPROVIDED) {
            uniquifyP = T;
        }
        if (sequentialP == UNPROVIDED) {
            sequentialP = NIL;
        }
        SubLObject name = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject string_var = unicode_strings.utf8_string_to_subl_string(string);
            SubLObject end_var_$2;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            SubLObject valid_charP;
            for (end_var = end_var_$2 = length(string_var), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$2); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string_var, char_num);
                valid_charP = constant_completion_high.valid_constant_name_char_p(v_char);
                if (v_char.eql(CHAR_space)) {
                    initial_case = $UPCASE;
                } else
                    if ((NIL != valid_charP) && (initial_case == $UPCASE)) {
                        princ(char_upcase(v_char), stream);
                        initial_case = NIL;
                    } else
                        if ((NIL != valid_charP) && (initial_case == $DOWNCASE)) {
                            princ(char_downcase(v_char), stream);
                            initial_case = NIL;
                        } else
                            if (NIL != valid_charP) {
                                princ(v_char, stream);
                            }



            }
            name = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (name.equalp($$$T)) {
            name = $str34$T_;
        }
        name = cconcatenate(prefix, new SubLObject[]{ name, suffix });
        if (NIL != uniquifyP) {
            name = constant_completion_high.uniquify_constant_name(name, sequentialP);
        }
        return name;
    }

    /**
     * Remove CONSTANT from the KB.
     */
    @LispMethod(comment = "Remove CONSTANT from the KB.")
    public static final SubLObject remove_constant_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        com.cyc.cycjava.cycl.constants_high.remove_everything_about_constant(constant);
        return constants_interface.kb_remove_constant(constant);
    }

    /**
     * Remove CONSTANT from the KB.
     */
    @LispMethod(comment = "Remove CONSTANT from the KB.")
    public static SubLObject remove_constant(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        remove_everything_about_constant(constant);
        if (NIL != tms.tms_please_kill_this_term_for_me(constant)) {
            return constant;
        }
        return constants_interface.kb_remove_constant(constant);
    }

    /**
     * Remove all information (assertions, nats) about CONSTANT from the KB.
     */
    @LispMethod(comment = "Remove all information (assertions, nats) about CONSTANT from the KB.")
    public static final SubLObject remove_everything_about_constant_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(constant, CONSTANT_P);
            {
                SubLObject _prev_bind_0 = $forts_being_removed$.currentBinding(thread);
                try {
                    $forts_being_removed$.bind(cons(constant, $forts_being_removed$.getDynamicValue(thread)), thread);
                    if (NIL != term.reified_skolem_fn_in_any_mtP(constant, T, T)) {
                        skolems.remove_defn_of_skolem(constant, UNPROVIDED);
                    }
                    if (NIL != kb_control_vars.time_kb_loaded_p()) {
                        if (NIL != sbhl_time_utilities.sbhl_temporality_term_p(constant)) {
                            sbhl_time_assertion_processing.remove_fort_from_sbhl_temporality_structures(constant);
                        }
                    }
                    narts_high.remove_dependent_narts(constant);
                    bookkeeping_store.unassert_all_bookkeeping_gafs_on_term(constant);
                    kb_indexing.remove_term_indices(constant);
                    kb_hl_supports.tms_remove_kb_hl_supports_mentioning_term(constant);
                    cardinality_estimates.clear_cardinality_estimates(constant);
                } finally {
                    $forts_being_removed$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Remove all information (assertions, nats) about CONSTANT from the KB.
     */
    @LispMethod(comment = "Remove all information (assertions, nats) about CONSTANT from the KB.")
    public static SubLObject remove_everything_about_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        final SubLObject _prev_bind_0 = hl_macros.$forts_being_removed$.currentBinding(thread);
        try {
            hl_macros.$forts_being_removed$.bind(cons(constant, hl_macros.$forts_being_removed$.getDynamicValue(thread)), thread);
            if (NIL != term.reified_skolem_fn_in_any_mtP(constant, T, T)) {
                skolems.remove_defn_of_skolem(constant, UNPROVIDED);
            }
            if ((NIL != kb_control_vars.time_kb_loaded_p()) && (NIL != sbhl_time_utilities.sbhl_temporality_term_p(constant))) {
                sbhl_time_assertion_processing.remove_fort_from_sbhl_temporality_structures(constant);
            }
            narts_high.remove_dependent_narts(constant);
            bookkeeping_store.unassert_all_bookkeeping_gafs_on_term(constant);
            kb_indexing.remove_term_indices(constant);
            kb_hl_supports_high.tms_remove_kb_hl_supports_mentioning_term(constant);
            cardinality_estimates.clear_cardinality_estimates(constant);
        } finally {
            hl_macros.$forts_being_removed$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Return the constant with NAME, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with NAME, or NIL if not present.")
    public static final SubLObject find_constant_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, STRINGP);
        return constants_interface.kb_lookup_constant_by_name(name);
    }

    /**
     * Return the constant with NAME, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with NAME, or NIL if not present.")
    public static SubLObject find_constant(final SubLObject name) {
        SubLTrampolineFile.enforceType(name, STRINGP);
        final SubLObject constant = constants_interface.kb_lookup_constant_by_name(name);
        if ($find_renamed$ && (constant == NIL)) {
        }
        return constant;
    }

    /**
     * Return the name of CONSTANT or :unnamed.
     */
    @LispMethod(comment = "Return the name of CONSTANT or :unnamed.")
    public static final SubLObject constant_name_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        return constants_interface.kb_constant_name(constant);
    }

    /**
     * Return the name of CONSTANT or :unnamed.
     */
    @LispMethod(comment = "Return the name of CONSTANT or :unnamed.")
    public static SubLObject constant_name(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        return constants_interface.kb_constant_name(constant);
    }

    /**
     * Return the GUID of CONSTANT.
     */
    @LispMethod(comment = "Return the GUID of CONSTANT.")
    public static final SubLObject constant_guid_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        return NIL != constant_handle_validP(constant) ? ((SubLObject) (constants_interface.kb_constant_guid(constant))) : NIL;
    }

    /**
     * Return the GUID of CONSTANT.
     */
    @LispMethod(comment = "Return the GUID of CONSTANT.")
    public static SubLObject constant_guid(final SubLObject constant) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        return NIL != constant_handle_validP(constant) ? constants_interface.kb_constant_guid(constant) : NIL;
    }

    /**
     * Return the merged GUID of CONSTANT.
     */
    @LispMethod(comment = "Return the merged GUID of CONSTANT.")
    public static final SubLObject constant_merged_guid_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        return NIL != constant_handle_validP(constant) ? ((SubLObject) (constants_interface.kb_constant_merged_guid(constant))) : NIL;
    }

    /**
     * Return the merged GUID of CONSTANT.
     */
    @LispMethod(comment = "Return the merged GUID of CONSTANT.")
    public static SubLObject constant_merged_guid(final SubLObject constant) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        return NIL != constant_handle_validP(constant) ? constants_interface.kb_constant_merged_guid(constant) : NIL;
    }

    /**
     * Return the constant with ID, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with ID, or NIL if not present.")
    public static final SubLObject find_constant_by_guid_alt(SubLObject guid) {
        SubLTrampolineFile.checkType(guid, GUID_P);
        return constants_interface.kb_lookup_constant_by_guid(guid);
    }

    /**
     * Return the constant with ID, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with ID, or NIL if not present.")
    public static SubLObject find_constant_by_guid(final SubLObject guid) {
        assert NIL != Guids.guid_p(guid) : "! Guids.guid_p(guid) " + ("Guids.guid_p(guid) " + "CommonSymbols.NIL != Guids.guid_p(guid) ") + guid;
        return constants_interface.kb_lookup_constant_by_guid(guid);
    }

    /**
     * Return the constant with GUID-STRING, NIL if not present, or error
     * if GUID-STRING is not GUID-STRING-P
     */
    @LispMethod(comment = "Return the constant with GUID-STRING, NIL if not present, or error\r\nif GUID-STRING is not GUID-STRING-P\nReturn the constant with GUID-STRING, NIL if not present, or error\nif GUID-STRING is not GUID-STRING-P")
    public static final SubLObject find_constant_by_guid_string_alt(SubLObject guid_string) {
        SubLTrampolineFile.checkType(guid_string, GUID_STRING_P);
        return com.cyc.cycjava.cycl.constants_high.find_constant_by_guid(Guids.string_to_guid(guid_string));
    }

    /**
     * Return the constant with GUID-STRING, NIL if not present, or error
     * if GUID-STRING is not GUID-STRING-P
     */
    @LispMethod(comment = "Return the constant with GUID-STRING, NIL if not present, or error\r\nif GUID-STRING is not GUID-STRING-P\nReturn the constant with GUID-STRING, NIL if not present, or error\nif GUID-STRING is not GUID-STRING-P")
    public static SubLObject find_constant_by_guid_string(final SubLObject guid_string) {
        assert NIL != Guids.guid_string_p(guid_string) : "! Guids.guid_string_p(guid_string) " + ("Guids.guid_string_p(guid_string) " + "CommonSymbols.NIL != Guids.guid_string_p(guid_string) ") + guid_string;
        return find_constant_by_guid(Guids.string_to_guid(guid_string));
    }

    /**
     * Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.
     */
    @LispMethod(comment = "Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.")
    public static final SubLObject rename_constant_alt(SubLObject constant, SubLObject new_name) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        SubLTrampolineFile.checkType(new_name, STRINGP);
        return constants_interface.kb_rename_constant(constant, new_name);
    }

    /**
     * Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.
     */
    @LispMethod(comment = "Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.")
    public static SubLObject rename_constant(final SubLObject constant, final SubLObject new_name) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        SubLTrampolineFile.enforceType(new_name, STRINGP);
        return constants_interface.kb_rename_constant(constant, new_name);
    }

    /**
     * Return the internal id of CONSTANT.
     */
    @LispMethod(comment = "Return the internal id of CONSTANT.")
    public static final SubLObject constant_internal_id_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        return constant_suid(constant);
    }

    /**
     * Return the internal id of CONSTANT.
     */
    @LispMethod(comment = "Return the internal id of CONSTANT.")
    public static SubLObject constant_internal_id(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        return constant_suid(constant);
    }

    public static final SubLObject constant_internal_id_from_external_id_alt(SubLObject external_id) {
        {
            SubLObject constant = com.cyc.cycjava.cycl.constants_high.find_constant_by_external_id(external_id);
            return NIL != constant ? ((SubLObject) (com.cyc.cycjava.cycl.constants_high.constant_internal_id(constant))) : NIL;
        }
    }

    public static SubLObject constant_internal_id_from_external_id(final SubLObject external_id) {
        final SubLObject constant = find_constant_by_external_id(external_id);
        return NIL != constant ? constant_internal_id(constant) : NIL;
    }

    /**
     * Return the constant with internal ID, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with internal ID, or NIL if not present.")
    public static final SubLObject find_constant_by_internal_id_alt(SubLObject id) {
        SubLTrampolineFile.checkType(id, CONSTANT_INTERNAL_ID_P);
        return find_constant_by_suid(id);
    }

    /**
     * Return the constant with internal ID, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with internal ID, or NIL if not present.")
    public static SubLObject find_constant_by_internal_id(final SubLObject id) {
        SubLTrampolineFile.enforceType(id, CONSTANT_INTERNAL_ID_P);
        return find_constant_by_suid(id);
    }

    /**
     * Return T iff OBJECT could be an internal constant ID.
     */
    @LispMethod(comment = "Return T iff OBJECT could be an internal constant ID.")
    public static final SubLObject constant_internal_id_p_alt(SubLObject v_object) {
        return integerp(v_object);
    }

    /**
     * Return T iff OBJECT could be an internal constant ID.
     */
    @LispMethod(comment = "Return T iff OBJECT could be an internal constant ID.")
    public static SubLObject constant_internal_id_p(final SubLObject v_object) {
        return integerp(v_object);
    }

    /**
     * Return T iff CONSTANT1 has a smaller internal id than CONSTANT2
     */
    @LispMethod(comment = "Return T iff CONSTANT1 has a smaller internal id than CONSTANT2")
    public static final SubLObject constant_internal_id_L_alt(SubLObject constant1, SubLObject constant2) {
        {
            SubLObject suid_1 = constant_suid(constant1);
            SubLObject suid_2 = constant_suid(constant2);
            if ((NIL != suid_1) && (NIL != suid_2)) {
                return numL(suid_1, suid_2);
            } else {
                if (!((NIL != suid_1) || (NIL != suid_2))) {
                    return NIL;
                } else {
                    return sublisp_null(suid_1);
                }
            }
        }
    }

    /**
     * Return T iff CONSTANT1 has a smaller internal id than CONSTANT2
     */
    @LispMethod(comment = "Return T iff CONSTANT1 has a smaller internal id than CONSTANT2")
    public static SubLObject constant_internal_id_L(final SubLObject constant1, final SubLObject constant2) {
        final SubLObject suid_1 = constant_suid(constant1);
        final SubLObject suid_2 = constant_suid(constant2);
        if ((NIL != suid_1) && (NIL != suid_2)) {
            return numL(suid_1, suid_2);
        }
        if ((NIL == suid_1) && (NIL == suid_2)) {
            return NIL;
        }
        return sublisp_null(suid_1);
    }

    /**
     * Return T iff OBJECT is a constant that has its IDs installed.
     */
    @LispMethod(comment = "Return T iff OBJECT is a constant that has its IDs installed.")
    public static final SubLObject installed_constant_p_alt(SubLObject v_object) {
        return valid_constant_handleP(v_object);
    }

    /**
     * Return T iff OBJECT is a constant that has its IDs installed.
     */
    @LispMethod(comment = "Return T iff OBJECT is a constant that has its IDs installed.")
    public static SubLObject installed_constant_p(final SubLObject v_object) {
        return valid_constant_handleP(v_object);
    }

    /**
     * Return T iff OBJECT is a constant that does not have its IDs installed.
     */
    @LispMethod(comment = "Return T iff OBJECT is a constant that does not have its IDs installed.")
    public static final SubLObject uninstalled_constant_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL == com.cyc.cycjava.cycl.constants_high.installed_constant_p(v_object)));
    }

    /**
     * Return T iff OBJECT is a constant that does not have its IDs installed.
     */
    @LispMethod(comment = "Return T iff OBJECT is a constant that does not have its IDs installed.")
    public static SubLObject uninstalled_constant_p(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL == installed_constant_p(v_object)));
    }

    /**
     * Return the internal ID where new constants started.
     */
    @LispMethod(comment = "Return the internal ID where new constants started.")
    public static final SubLObject new_constant_internal_id_threshold_alt() {
        return new_constant_suid_threshold();
    }

    /**
     * Return the internal ID where new constants started.
     */
    @LispMethod(comment = "Return the internal ID where new constants started.")
    public static SubLObject new_constant_internal_id_threshold() {
        return new_constant_suid_threshold();
    }

    public static SubLObject with_constant_external_id_equivalence_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject id_map = NIL;
        destructuring_bind_must_consp(current, datum, $list61);
        id_map = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($constant_external_id_equivalence_map$, id_map)), append(body, NIL));
    }

    public static SubLObject prefered_constant_external_id_wrt_equivalence(SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != map_utilities.map_p($constant_external_id_equivalence_map$.getDynamicValue(thread))) {
            external_id = map_utilities.map_get_without_values($constant_external_id_equivalence_map$.getDynamicValue(thread), external_id, external_id);
        }
        return external_id;
    }

    /**
     * Return the external id of CONSTANT.
     */
    @LispMethod(comment = "Return the external id of CONSTANT.")
    public static final SubLObject constant_external_id_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        return com.cyc.cycjava.cycl.constants_high.constant_guid(constant);
    }

    /**
     * Return the external id of CONSTANT.
     */
    @LispMethod(comment = "Return the external id of CONSTANT.")
    public static SubLObject constant_external_id(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        return constant_guid(constant);
    }

    public static final SubLObject constant_name_from_internal_id_alt(SubLObject internal_id) {
        {
            SubLObject constant = com.cyc.cycjava.cycl.constants_high.find_constant_by_internal_id(internal_id);
            return NIL != constant ? ((SubLObject) (com.cyc.cycjava.cycl.constants_high.constant_name(constant))) : NIL;
        }
    }

    public static SubLObject constant_name_from_internal_id(final SubLObject internal_id) {
        final SubLObject constant = find_constant_by_internal_id(internal_id);
        return NIL != constant_p(constant) ? constant_name(constant) : NIL;
    }

    /**
     * Return the constant with EXTERNAL-ID, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with EXTERNAL-ID, or NIL if not present.")
    public static final SubLObject find_constant_by_external_id_alt(SubLObject external_id) {
        SubLTrampolineFile.checkType(external_id, CONSTANT_EXTERNAL_ID_P);
        return com.cyc.cycjava.cycl.constants_high.find_constant_by_guid(external_id);
    }

    /**
     * Return the constant with EXTERNAL-ID, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with EXTERNAL-ID, or NIL if not present.")
    public static SubLObject find_constant_by_external_id(SubLObject external_id) {
        SubLTrampolineFile.enforceType(external_id, CONSTANT_EXTERNAL_ID_P);
        external_id = prefered_constant_external_id_wrt_equivalence(external_id);
        return find_constant_by_guid(external_id);
    }

    /**
     * Return T iff OBJECT could be an external constant ID.
     */
    @LispMethod(comment = "Return T iff OBJECT could be an external constant ID.")
    public static final SubLObject constant_external_id_p_alt(SubLObject v_object) {
        return Guids.guid_p(v_object);
    }

    /**
     * Return T iff OBJECT could be an external constant ID.
     */
    @LispMethod(comment = "Return T iff OBJECT could be an external constant ID.")
    public static SubLObject constant_external_id_p(final SubLObject v_object) {
        return Guids.guid_p(v_object);
    }

    /**
     * Return T iff CONSTANT has EXTERNAL-ID as its external ID.
     */
    @LispMethod(comment = "Return T iff CONSTANT has EXTERNAL-ID as its external ID.")
    public static final SubLObject constant_has_external_id_alt(SubLObject constant, SubLObject external_id) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        SubLTrampolineFile.checkType(external_id, CONSTANT_EXTERNAL_ID_P);
        {
            SubLObject guid = com.cyc.cycjava.cycl.constants_high.constant_guid(constant);
            return Guids.guidE(guid, external_id);
        }
    }

    /**
     * Return T iff CONSTANT has EXTERNAL-ID as its external ID.
     */
    @LispMethod(comment = "Return T iff CONSTANT has EXTERNAL-ID as its external ID.")
    public static SubLObject constant_has_external_id(final SubLObject constant, final SubLObject external_id) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        assert NIL != constant_external_id_p(external_id) : "! constants_high.constant_external_id_p(external_id) " + ("constants_high.constant_external_id_p(external_id) " + "CommonSymbols.NIL != constants_high.constant_external_id_p(external_id) ") + external_id;
        final SubLObject guid = constant_guid(constant);
        return Guids.guidE(guid, external_id);
    }

    /**
     * Return T iff CONSTANT1 has a smaller external id than CONSTANT2
     */
    @LispMethod(comment = "Return T iff CONSTANT1 has a smaller external id than CONSTANT2")
    public static final SubLObject constant_external_id_L_alt(SubLObject constant1, SubLObject constant2) {
        {
            SubLObject guid_1 = com.cyc.cycjava.cycl.constants_high.constant_guid(constant1);
            SubLObject guid_2 = com.cyc.cycjava.cycl.constants_high.constant_guid(constant2);
            if ((NIL != guid_1) && (NIL != guid_2)) {
                return Guids.guidL(guid_1, guid_2);
            } else {
                if (!((NIL != guid_1) || (NIL != guid_2))) {
                    return NIL;
                } else {
                    return sublisp_null(guid_1);
                }
            }
        }
    }

    /**
     * Return T iff CONSTANT1 has a smaller external id than CONSTANT2
     */
    @LispMethod(comment = "Return T iff CONSTANT1 has a smaller external id than CONSTANT2")
    public static SubLObject constant_external_id_L(final SubLObject constant1, final SubLObject constant2) {
        final SubLObject guid_1 = constant_guid(constant1);
        final SubLObject guid_2 = constant_guid(constant2);
        if ((NIL != guid_1) && (NIL != guid_2)) {
            return Guids.guidL(guid_1, guid_2);
        }
        if ((NIL == guid_1) && (NIL == guid_2)) {
            return NIL;
        }
        return sublisp_null(guid_1);
    }

    /**
     * Returns a list of constant info-items corresponding to the GUID-LIST.  Each
     * info item is a list of guid-string and name.
     */
    @LispMethod(comment = "Returns a list of constant info-items corresponding to the GUID-LIST.  Each\r\ninfo item is a list of guid-string and name.\nReturns a list of constant info-items corresponding to the GUID-LIST.  Each\ninfo item is a list of guid-string and name.")
    public static final SubLObject constant_info_from_guid_strings_alt(SubLObject guid_string_list) {
        SubLTrampolineFile.checkType(guid_string_list, LISTP);
        {
            SubLObject constant_info_list = NIL;
            SubLObject constant = NIL;
            SubLObject cdolist_list_var = guid_string_list;
            SubLObject guid_string = NIL;
            for (guid_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , guid_string = cdolist_list_var.first()) {
                constant = com.cyc.cycjava.cycl.constants_high.find_constant_by_external_id(Guids.string_to_guid(guid_string));
                if (NIL != constant) {
                    constant_info_list = cons(list(guid_string, com.cyc.cycjava.cycl.constants_high.constant_name(constant)), constant_info_list);
                } else {
                    constant_info_list = cons(NIL, constant_info_list);
                }
            }
            return nreverse(constant_info_list);
        }
    }

    /**
     * Returns a list of constant info-items corresponding to the GUID-LIST.  Each
     * info item is a list of guid-string and name.
     */
    @LispMethod(comment = "Returns a list of constant info-items corresponding to the GUID-LIST.  Each\r\ninfo item is a list of guid-string and name.\nReturns a list of constant info-items corresponding to the GUID-LIST.  Each\ninfo item is a list of guid-string and name.")
    public static SubLObject constant_info_from_guid_strings(final SubLObject guid_string_list) {
        SubLTrampolineFile.enforceType(guid_string_list, LISTP);
        SubLObject constant_info_list = NIL;
        SubLObject constant = NIL;
        SubLObject cdolist_list_var = guid_string_list;
        SubLObject guid_string = NIL;
        guid_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constant = find_constant_by_external_id(Guids.string_to_guid(guid_string));
            if (NIL != constant) {
                constant_info_list = cons(list(guid_string, constant_name(constant)), constant_info_list);
            } else {
                constant_info_list = cons(NIL, constant_info_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            guid_string = cdolist_list_var.first();
        } 
        return nreverse(constant_info_list);
    }

    /**
     * Returns a list of constant info-items corresponding to the NAME-LIST.  Each
     * info item is a list of guid-string and name.
     */
    @LispMethod(comment = "Returns a list of constant info-items corresponding to the NAME-LIST.  Each\r\ninfo item is a list of guid-string and name.\nReturns a list of constant info-items corresponding to the NAME-LIST.  Each\ninfo item is a list of guid-string and name.")
    public static final SubLObject constant_info_from_name_strings_alt(SubLObject name_string_list) {
        SubLTrampolineFile.checkType(name_string_list, LISTP);
        {
            SubLObject constant_info_list = NIL;
            SubLObject constant = NIL;
            SubLObject cdolist_list_var = name_string_list;
            SubLObject name_string = NIL;
            for (name_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name_string = cdolist_list_var.first()) {
                constant = com.cyc.cycjava.cycl.constants_high.find_constant(name_string);
                if (NIL != constant) {
                    constant_info_list = cons(list(com.cyc.cycjava.cycl.constants_high.constant_guid(constant), com.cyc.cycjava.cycl.constants_high.constant_name(constant)), constant_info_list);
                } else {
                    constant_info_list = cons(NIL, constant_info_list);
                }
            }
            return nreverse(constant_info_list);
        }
    }

    /**
     * Returns a list of constant info-items corresponding to the NAME-LIST.  Each
     * info item is a list of guid-string and name.
     */
    @LispMethod(comment = "Returns a list of constant info-items corresponding to the NAME-LIST.  Each\r\ninfo item is a list of guid-string and name.\nReturns a list of constant info-items corresponding to the NAME-LIST.  Each\ninfo item is a list of guid-string and name.")
    public static SubLObject constant_info_from_name_strings(final SubLObject name_string_list) {
        SubLTrampolineFile.enforceType(name_string_list, LISTP);
        SubLObject constant_info_list = NIL;
        SubLObject constant = NIL;
        SubLObject cdolist_list_var = name_string_list;
        SubLObject name_string = NIL;
        name_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            constant = find_constant(name_string);
            if (NIL != constant) {
                constant_info_list = cons(list(constant_guid(constant), constant_name(constant)), constant_info_list);
            } else {
                constant_info_list = cons(NIL, constant_info_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            name_string = cdolist_list_var.first();
        } 
        return nreverse(constant_info_list);
    }

    public static final SubLObject make_constant_external_id_alt() {
        return com.cyc.cycjava.cycl.constants_high.make_constant_guid();
    }

    public static SubLObject make_constant_external_id() {
        return make_constant_guid();
    }

    /**
     * Return a unique integer id for use in a skolem constant.
     */
    @LispMethod(comment = "Return a unique integer id for use in a skolem constant.")
    public static final SubLObject make_skolem_id_alt() {
        return com.cyc.cycjava.cycl.constants_high.make_constant_external_id();
    }

    /**
     * Return a unique integer id for use in a skolem constant.
     */
    @LispMethod(comment = "Return a unique integer id for use in a skolem constant.")
    public static SubLObject make_skolem_id() {
        return make_constant_external_id();
    }

    public static final SubLObject make_constant_guid_alt() {
        return Guids.new_guid();
    }

    public static SubLObject make_constant_guid() {
        return Guids.new_guid();
    }

    /**
     * Return a constant legacy GUID from the constant LEGACY-ID
     */
    @LispMethod(comment = "Return a constant legacy GUID from the constant LEGACY-ID")
    public static final SubLObject make_constant_legacy_guid_alt(SubLObject legacy_id) {
        SubLTrampolineFile.checkType(legacy_id, CONSTANT_LEGACY_ID_P);
        {
            SubLObject datum = $constant_legacy_guid_date$.getGlobalValue();
            SubLObject current = datum;
            SubLObject month = NIL;
            SubLObject day = NIL;
            SubLObject year = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            month = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            day = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            year = current.first();
            current = current.rest();
            if (NIL == current) {
                return Guids.make_date_relative_guid(year, month, day, legacy_id);
            } else {
                cdestructuring_bind_error(datum, $list_alt65);
            }
        }
        return NIL;
    }

    /**
     * Return a constant legacy GUID from the constant LEGACY-ID
     */
    @LispMethod(comment = "Return a constant legacy GUID from the constant LEGACY-ID")
    public static SubLObject make_constant_legacy_guid(final SubLObject legacy_id) {
        assert NIL != constant_legacy_id_p(legacy_id) : "! constants_high.constant_legacy_id_p(legacy_id) " + ("constants_high.constant_legacy_id_p(legacy_id) " + "CommonSymbols.NIL != constants_high.constant_legacy_id_p(legacy_id) ") + legacy_id;
        SubLObject current;
        final SubLObject datum = current = $constant_legacy_guid_date$.getGlobalValue();
        SubLObject month = NIL;
        SubLObject day = NIL;
        SubLObject year = NIL;
        destructuring_bind_must_consp(current, datum, $list83);
        month = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        day = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list83);
        year = current.first();
        current = current.rest();
        if (NIL == current) {
            return Guids.make_date_relative_guid(year, month, day, legacy_id);
        }
        cdestructuring_bind_error(datum, $list83);
        return NIL;
    }

    /**
     * Return the legacy-id from a constant legacy GUID
     */
    @LispMethod(comment = "Return the legacy-id from a constant legacy GUID")
    public static final SubLObject constant_guid_to_legacy_id_alt(SubLObject guid) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(guid, GUID_P);
            if (NIL != Guids.date_relative_guid_p(guid)) {
                thread.resetMultipleValues();
                {
                    SubLObject given_year = Guids.crack_date_relative_guid(guid);
                    SubLObject given_month = thread.secondMultipleValue();
                    SubLObject given_day = thread.thirdMultipleValue();
                    SubLObject legacy_id = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject datum = $constant_legacy_guid_date$.getGlobalValue();
                        SubLObject current = datum;
                        SubLObject legacy_month = NIL;
                        SubLObject legacy_day = NIL;
                        SubLObject legacy_year = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt66);
                        legacy_month = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt66);
                        legacy_day = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt66);
                        legacy_year = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((legacy_year.numE(given_year) && legacy_month.numE(given_month)) && legacy_day.numE(given_day)) {
                                return legacy_id;
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt66);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Return the legacy-id from a constant legacy GUID
     */
    @LispMethod(comment = "Return the legacy-id from a constant legacy GUID")
    public static SubLObject constant_guid_to_legacy_id(final SubLObject guid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Guids.guid_p(guid) : "! Guids.guid_p(guid) " + ("Guids.guid_p(guid) " + "CommonSymbols.NIL != Guids.guid_p(guid) ") + guid;
        if (NIL != Guids.date_relative_guid_p(guid)) {
            thread.resetMultipleValues();
            final SubLObject given_year = Guids.crack_date_relative_guid(guid);
            final SubLObject given_month = thread.secondMultipleValue();
            final SubLObject given_day = thread.thirdMultipleValue();
            final SubLObject legacy_id = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            SubLObject current;
            final SubLObject datum = current = $constant_legacy_guid_date$.getGlobalValue();
            SubLObject legacy_month = NIL;
            SubLObject legacy_day = NIL;
            SubLObject legacy_year = NIL;
            destructuring_bind_must_consp(current, datum, $list84);
            legacy_month = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list84);
            legacy_day = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list84);
            legacy_year = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((legacy_year.numE(given_year) && legacy_month.numE(given_month)) && legacy_day.numE(given_day)) {
                    return legacy_id;
                }
            } else {
                cdestructuring_bind_error(datum, $list84);
            }
        }
        return NIL;
    }

    /**
     * Return the legacy id of CONSTANT, or NIL if it doesn't have one.
     */
    @LispMethod(comment = "Return the legacy id of CONSTANT, or NIL if it doesn\'t have one.")
    public static final SubLObject constant_legacy_id_alt(SubLObject constant) {
        return com.cyc.cycjava.cycl.constants_high.constant_guid_to_legacy_id(com.cyc.cycjava.cycl.constants_high.constant_guid(constant));
    }

    /**
     * Return the legacy id of CONSTANT, or NIL if it doesn't have one.
     */
    @LispMethod(comment = "Return the legacy id of CONSTANT, or NIL if it doesn\'t have one.")
    public static SubLObject constant_legacy_id(final SubLObject constant) {
        return constant_guid_to_legacy_id(constant_guid(constant));
    }

    /**
     * Return the constant with LEGACY-ID, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with LEGACY-ID, or NIL if not present.")
    public static final SubLObject find_constant_by_legacy_id_alt(SubLObject legacy_id) {
        return com.cyc.cycjava.cycl.constants_high.find_constant_by_guid(com.cyc.cycjava.cycl.constants_high.make_constant_legacy_guid(legacy_id));
    }

    /**
     * Return the constant with LEGACY-ID, or NIL if not present.
     */
    @LispMethod(comment = "Return the constant with LEGACY-ID, or NIL if not present.")
    public static SubLObject find_constant_by_legacy_id(final SubLObject legacy_id) {
        return find_constant_by_guid(make_constant_legacy_guid(legacy_id));
    }

    public static final SubLObject constant_legacy_id_p_alt(SubLObject v_object) {
        return integerp(v_object);
    }

    public static SubLObject constant_legacy_id_p(final SubLObject v_object) {
        return integerp(v_object);
    }

    /**
     * Return T iff CONSTANT is an unnamed constant.
     */
    @LispMethod(comment = "Return T iff CONSTANT is an unnamed constant.")
    public static final SubLObject unnamed_constant_p_alt(SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && ($UNNAMED == com.cyc.cycjava.cycl.constants_high.constant_name(constant)));
    }

    /**
     * Return T iff CONSTANT is an unnamed constant.
     */
    @LispMethod(comment = "Return T iff CONSTANT is an unnamed constant.")
    public static SubLObject unnamed_constant_p(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && ($UNNAMED == constant_name(constant)));
    }

    /**
     * Return the namespace to which the constant belongs.
     */
    @LispMethod(comment = "Return the namespace to which the constant belongs.")
    public static final SubLObject constant_namespace_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        {
            SubLObject delim = string_utilities.char_position(CHAR_colon, com.cyc.cycjava.cycl.constants_high.constant_name(constant), UNPROVIDED);
            if (NIL != delim) {
                return subseq(com.cyc.cycjava.cycl.constants_high.constant_name(constant), ZERO_INTEGER, delim);
            } else {
                return $$$cyc;
            }
        }
    }

    /**
     * Return the namespace to which the constant belongs.
     */
    @LispMethod(comment = "Return the namespace to which the constant belongs.")
    public static SubLObject constant_namespace(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        final SubLObject delim = string_utilities.char_position(CHAR_colon, constant_name(constant), UNPROVIDED);
        if (NIL != delim) {
            return subseq(constant_name(constant), ZERO_INTEGER, delim);
        }
        return $$$cyc;
    }

    /**
     * Return the constant name within its namespace.
     */
    @LispMethod(comment = "Return the constant name within its namespace.")
    public static final SubLObject constant_name_within_namespace_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        {
            SubLObject delim = string_utilities.char_position(CHAR_colon, com.cyc.cycjava.cycl.constants_high.constant_name(constant), UNPROVIDED);
            if (NIL != delim) {
                return subseq(com.cyc.cycjava.cycl.constants_high.constant_name(constant), add(delim, ONE_INTEGER), UNPROVIDED);
            } else {
                return com.cyc.cycjava.cycl.constants_high.constant_name(constant);
            }
        }
    }

    /**
     * Return the constant name within its namespace.
     */
    @LispMethod(comment = "Return the constant name within its namespace.")
    public static SubLObject constant_name_within_namespace(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        final SubLObject delim = string_utilities.char_position(CHAR_colon, constant_name(constant), UNPROVIDED);
        if (NIL != delim) {
            return subseq(constant_name(constant), add(delim, ONE_INTEGER), UNPROVIDED);
        }
        return constant_name(constant);
    }

    /**
     * Return a randomly chosen constant that satisfies TEST
     */
    @LispMethod(comment = "Return a randomly chosen constant that satisfies TEST")
    public static final SubLObject random_constant_alt(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        if (constant_count().numG(ZERO_INTEGER)) {
            {
                SubLObject max_id = next_constant_suid();
                SubLObject v_answer = NIL;
                while (NIL == v_answer) {
                    {
                        SubLObject candidate = find_constant_by_suid(random.random(max_id));
                        if ((NIL != candidate) && (NIL != funcall(test, candidate))) {
                            v_answer = candidate;
                        }
                    }
                } 
                return v_answer;
            }
        }
        return NIL;
    }

    /**
     * Return a randomly chosen constant that satisfies TEST
     */
    @LispMethod(comment = "Return a randomly chosen constant that satisfies TEST")
    public static SubLObject random_constant(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        return constants_low.random_constant_internal(test);
    }

    /**
     * Return N randomly chosen constants that satisfy TEST
     * All constants are different unless ALLOW-REPEATS? is non-nil.
     */
    @LispMethod(comment = "Return N randomly chosen constants that satisfy TEST\r\nAll constants are different unless ALLOW-REPEATS? is non-nil.\nReturn N randomly chosen constants that satisfy TEST\nAll constants are different unless ALLOW-REPEATS? is non-nil.")
    public static final SubLObject sample_constants_alt(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == UNPROVIDED) {
            n = $int$500;
        }
        if (allow_repeatsP == UNPROVIDED) {
            allow_repeatsP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
        if (NIL != allow_repeatsP) {
            {
                SubLObject result = NIL;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                    result = cons(com.cyc.cycjava.cycl.constants_high.random_constant(test), result);
                }
                return result;
            }
        }
        {
            SubLObject result = set_contents.new_set_contents(n, symbol_function(EQ));
            while (set_contents.set_contents_size(result).numL(n)) {
                result = set_contents.set_contents_add(com.cyc.cycjava.cycl.constants_high.random_constant(test), result, symbol_function(EQ));
            } 
            return set_contents.set_contents_element_list(result);
        }
    }

    /**
     * Return N randomly chosen constants that satisfy TEST
     * All constants are different unless ALLOW-REPEATS? is non-nil.
     */
    @LispMethod(comment = "Return N randomly chosen constants that satisfy TEST\r\nAll constants are different unless ALLOW-REPEATS? is non-nil.\nReturn N randomly chosen constants that satisfy TEST\nAll constants are different unless ALLOW-REPEATS? is non-nil.")
    public static SubLObject sample_constants(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == UNPROVIDED) {
            n = $int$500;
        }
        if (allow_repeatsP == UNPROVIDED) {
            allow_repeatsP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        if (NIL != allow_repeatsP) {
            SubLObject result = NIL;
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                result = cons(random_constant(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, symbol_function(EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_constant(test), result, symbol_function(EQL))) {
        }
        return set_contents.set_contents_element_list(result);
    }

    /**
     * grep through constant names, looking for items that match REGULAR-EXPRESSION.
     *
     * @return list; a list of all the constants that match REGULAR-EXPRESSION
     */
    @LispMethod(comment = "grep through constant names, looking for items that match REGULAR-EXPRESSION.\r\n\r\n@return list; a list of all the constants that match REGULAR-EXPRESSION")
    public static final SubLObject constant_grep_alt(SubLObject regular_expression, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(regular_expression, REGULAR_EXPRESSION_P);
            {
                SubLObject matches = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
                    SubLObject error_code = thread.secondMultipleValue();
                    SubLObject error_offset = thread.thirdMultipleValue();
                    SubLObject error_msg = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                            Errors.error($str_alt80$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
                        }
                        matches = com.cyc.cycjava.cycl.constants_high.constant_grep_pattern(pattern, match_options);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                                    regular_expressions.discard_regular_expression_pattern(pattern);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return matches;
            }
        }
    }

    /**
     * grep through constant names, looking for items that match REGULAR-EXPRESSION.
     *
     * @return list; a list of all the constants that match REGULAR-EXPRESSION
     */
    @LispMethod(comment = "grep through constant names, looking for items that match REGULAR-EXPRESSION.\r\n\r\n@return list; a list of all the constants that match REGULAR-EXPRESSION")
    public static SubLObject constant_grep(final SubLObject regular_expression, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regular_expressions.regular_expression_p(regular_expression) : "! regular_expressions.regular_expression_p(regular_expression) " + ("regular_expressions.regular_expression_p(regular_expression) " + "CommonSymbols.NIL != regular_expressions.regular_expression_p(regular_expression) ") + regular_expression;
        SubLObject matches = NIL;
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, comp_options);
        final SubLObject error_code = thread.secondMultipleValue();
        final SubLObject error_offset = thread.thirdMultipleValue();
        final SubLObject error_msg = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        try {
            if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                Errors.error($str98$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, regular_expression, error_offset });
            }
            matches = constant_grep_pattern(pattern, match_options);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                    regular_expressions.discard_regular_expression_pattern(pattern);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return matches;
    }

    public static final SubLObject constant_grep_pattern_alt(SubLObject pattern, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        {
            SubLObject matches = NIL;
            SubLObject idx = do_constants_table();
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                    SubLObject constant = NIL;
                    while (NIL != id) {
                        constant = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
                            if (NIL != list_utilities.sublisp_boolean(regular_expression_utilities.find_all_matches_within_string(pattern, com.cyc.cycjava.cycl.constants_high.constant_name(constant), match_options, NIL, UNPROVIDED, UNPROVIDED))) {
                                matches = cons(constant, matches);
                            }
                        }
                        id = do_id_index_next_id(idx, T, id, state_var);
                        state_var = do_id_index_next_state(idx, T, id, state_var);
                    } 
                }
            }
            return nreverse(matches);
        }
    }

    public static SubLObject constant_grep_pattern(final SubLObject pattern, SubLObject match_options) {
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        SubLObject matches = NIL;
        final SubLObject idx = do_constants_table();
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$3 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$3);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject constant;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    constant = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(constant)) {
                            constant = $SKIP;
                        }
                        if (NIL != list_utilities.sublisp_boolean(regular_expression_utilities.find_all_matches_within_string(pattern, constant_name(constant), match_options, NIL, UNPROVIDED, UNPROVIDED))) {
                            matches = cons(constant, matches);
                        }
                    }
                }
            }
            final SubLObject idx_$4 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$4)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$4);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$4);
                final SubLObject end_id = id_index_next_id(idx_$4);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                    if (((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) && (NIL != list_utilities.sublisp_boolean(regular_expression_utilities.find_all_matches_within_string(pattern, constant_name(constant2), match_options, NIL, UNPROVIDED, UNPROVIDED)))) {
                        matches = cons(constant2, matches);
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        return nreverse(matches);
    }

    static private final SubLList $list_alt3 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));

    /**
     * Return T iff OBJECT is a constant checkpoint.
     */
    @LispMethod(comment = "Return T iff OBJECT is a constant checkpoint.")
    public static final SubLObject constant_checkpoint_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(NON_NEGATIVE_INTEGER_P, v_object, UNPROVIDED)));
    }

    /**
     * Return T iff OBJECT is a constant checkpoint.
     */
    @LispMethod(comment = "Return T iff OBJECT is a constant checkpoint.")
    public static SubLObject constant_checkpoint_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(NON_NEGATIVE_INTEGER_P, v_object, UNPROVIDED)));
    }

    static private final SubLString $str_alt4$Return_a_new_constant_named_NAME_ = makeString("Return a new constant named NAME with EXTERNAL-ID as the external ID.");

    static private final SubLList $list_alt5 = list(list(makeSymbol("NAME"), makeSymbol("CONSTANT-NAME-SPEC-P")), list(makeSymbol("EXTERNAL-ID"), list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P"))));

    /**
     * return constant-checkpoint-p; the current constant checkpoint
     */
    @LispMethod(comment = "return constant-checkpoint-p; the current constant checkpoint")
    public static final SubLObject new_constant_checkpoint_alt() {
        {
            SubLObject constant_count = constant_count();
            SubLObject next_constant_id = next_constant_suid();
            return list(constant_count, next_constant_id);
        }
    }

    /**
     * return constant-checkpoint-p; the current constant checkpoint
     */
    @LispMethod(comment = "return constant-checkpoint-p; the current constant checkpoint")
    public static SubLObject new_constant_checkpoint() {
        final SubLObject constant_count = constant_count();
        final SubLObject next_constant_id = next_constant_suid();
        return list(constant_count, next_constant_id);
    }

    static private final SubLList $list_alt6 = list(makeSymbol("CONSTANT-P"));

    /**
     * Return T iff CONSTANT-CHECKPOINT is still current
     */
    @LispMethod(comment = "Return T iff CONSTANT-CHECKPOINT is still current")
    public static final SubLObject constant_checkpoint_currentP_alt(SubLObject constant_checkpoint) {
        {
            SubLObject datum = constant_checkpoint;
            SubLObject current = datum;
            SubLObject checkpoint_count = NIL;
            SubLObject checkpoint_next_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt82);
            checkpoint_count = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt82);
            checkpoint_next_id = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean(checkpoint_count.numE(constant_count()) && checkpoint_next_id.numE(next_constant_suid()));
            } else {
                cdestructuring_bind_error(datum, $list_alt82);
            }
        }
        return NIL;
    }

    /**
     * Return T iff CONSTANT-CHECKPOINT is still current
     */
    @LispMethod(comment = "Return T iff CONSTANT-CHECKPOINT is still current")
    public static SubLObject constant_checkpoint_currentP(final SubLObject constant_checkpoint) {
        SubLObject checkpoint_count = NIL;
        SubLObject checkpoint_next_id = NIL;
        destructuring_bind_must_consp(constant_checkpoint, constant_checkpoint, $list100);
        checkpoint_count = constant_checkpoint.first();
        SubLObject current = constant_checkpoint.rest();
        destructuring_bind_must_consp(current, constant_checkpoint, $list100);
        checkpoint_next_id = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(checkpoint_count.numE(constant_count()) && checkpoint_next_id.numE(next_constant_suid()));
        }
        cdestructuring_bind_error(constant_checkpoint, $list100);
        return NIL;
    }

    static private final SubLString $str_alt9$Return_the_constant_with_NAME_if_ = makeString("Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\n  Also, if it exists but has a null id, install EXTERNAL-ID on the constant.");

    static private final SubLList $list_alt10 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));

    static private final SubLString $str_alt12$_A__A = makeString("~A-~A");

    static private final SubLList $list_alt14 = list(makeSymbol("START-NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("PREFIX"), makeString("TMP")));

    /**
     * Return the id of CONSTANT to use during a KB dump.
     */
    @LispMethod(comment = "Return the id of CONSTANT to use during a KB dump.")
    public static final SubLObject constant_dump_id_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = com.cyc.cycjava.cycl.constants_high.constant_internal_id(constant);
                SubLObject dump_table = $constant_dump_id_table$.getDynamicValue(thread);
                if (NIL != dump_table) {
                    id = id_index_lookup(dump_table, id, UNPROVIDED);
                }
                return id;
            }
        }
    }

    /**
     * Return the id of CONSTANT to use during a KB dump.
     */
    @LispMethod(comment = "Return the id of CONSTANT to use during a KB dump.")
    public static SubLObject constant_dump_id(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = constant_internal_id(constant);
        final SubLObject dump_table = $constant_dump_id_table$.getDynamicValue(thread);
        if (NIL != dump_table) {
            id = id_index_lookup(dump_table, id, UNPROVIDED);
        }
        return id;
    }

    static private final SubLString $str_alt15$Create_and_return_a_temporary_con = makeString("Create and return a temporary constant whose name is based on START-NAME");

    static private final SubLList $list_alt16 = list(list(makeSymbol("START-NAME"), makeSymbol("STRINGP")));

    /**
     * Return the constant with DUMP-ID during a KB load.
     */
    @LispMethod(comment = "Return the constant with DUMP-ID during a KB load.")
    public static final SubLObject find_constant_by_dump_id_alt(SubLObject dump_id) {
        return com.cyc.cycjava.cycl.constants_high.find_constant_by_internal_id(dump_id);
    }

    /**
     * Return the constant with DUMP-ID during a KB load.
     */
    @LispMethod(comment = "Return the constant with DUMP-ID during a KB load.")
    public static SubLObject find_constant_by_dump_id(final SubLObject dump_id) {
        return find_constant_by_internal_id(dump_id);
    }

    static private final SubLString $str_alt19$T_ = makeString("T-");

    public static final SubLObject with_constant_dump_id_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt84, append(body, NIL));
        }
    }

    public static SubLObject with_constant_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list101, append(body, NIL));
    }

    static private final SubLList $list_alt22 = list(makeSymbol("CONSTANT"));

    static private final SubLString $str_alt23$Remove_CONSTANT_from_the_KB_ = makeString("Remove CONSTANT from the KB.");

    static private final SubLList $list_alt24 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));

    public static SubLObject constant_dump_name(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($constant_name_obfuscation_fn$.getDynamicValue(thread).isFunctionSpec()) {
            return funcall($constant_name_obfuscation_fn$.getDynamicValue(thread), constant);
        }
        return constant_name(constant);
    }

    static private final SubLList $list_alt25 = list(makeSymbol("NULL"));

    static private final SubLList $list_alt27 = list(makeSymbol("NAME"));

    static private final SubLString $str_alt28$Return_the_constant_with_NAME__or = makeString("Return the constant with NAME, or NIL if not present.");

    static private final SubLList $list_alt29 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));

    public static SubLObject with_constant_name_obfuscation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject obfuscate_fn = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        obfuscate_fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($constant_name_obfuscation_fn$, obfuscate_fn)), append(body, NIL));
    }

    static private final SubLString $str_alt31$Return_the_name_of_CONSTANT_or__u = makeString("Return the name of CONSTANT or :unnamed.");

    static private final SubLList $list_alt35 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"));

    static private final SubLString $str_alt36$Rename_CONSTANT_to_have_NEW_NAME_ = makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");

    public static SubLObject constants_around_constant(final SubLObject constant, SubLObject total, SubLObject before, SubLObject after) {
        if (total == UNPROVIDED) {
            total = $int$100;
        }
        if (before == UNPROVIDED) {
            before = ZERO_INTEGER;
        }
        if (after == UNPROVIDED) {
            after = subtract(total, before);
        }
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        return constants_around(constant_suid(constant), total, before, after);
    }

    static private final SubLList $list_alt37 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NEW-NAME"), makeSymbol("STRINGP")));

    static private final SubLString $str_alt39$Return_the_internal_id_of_CONSTAN = makeString("Return the internal id of CONSTANT.");

    static private final SubLList $list_alt40 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-INTERNAL-ID-P")));

    public static SubLObject constants_around(final SubLObject constant_id, SubLObject total, SubLObject before, SubLObject after) {
        if (total == UNPROVIDED) {
            total = $int$100;
        }
        if (before == UNPROVIDED) {
            before = ZERO_INTEGER;
        }
        if (after == UNPROVIDED) {
            after = subtract(total, before);
        }
        assert NIL != subl_promotions.non_negative_integer_p(constant_id) : "! subl_promotions.non_negative_integer_p(constant_id) " + ("subl_promotions.non_negative_integer_p(constant_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(constant_id) ") + constant_id;
        return assertions_high.kb_objects_around_id(FIND_CONSTANT_BY_SUID, ZERO_INTEGER, constant_id, next_constant_suid(), total, before, after);
    }

    static private final SubLList $list_alt43 = list(makeSymbol("ID"));

    static private final SubLString $str_alt44$Return_the_constant_with_internal = makeString("Return the constant with internal ID, or NIL if not present.");

    static private final SubLList $list_alt45 = list(list(makeSymbol("ID"), makeSymbol("CONSTANT-INTERNAL-ID-P")));

    static private final SubLString $str_alt47$Return_the_external_id_of_CONSTAN = makeString("Return the external id of CONSTANT.");

    static private final SubLList $list_alt48 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));

    public static final SubLObject declare_constants_high_file_alt() {
        declareFunction("create_constant", "CREATE-CONSTANT", 1, 1, false);
        declareFunction("find_or_create_constant", "FIND-OR-CREATE-CONSTANT", 1, 1, false);
        declareFunction("gentemp_constant", "GENTEMP-CONSTANT", 1, 1, false);
        declareFunction("suggest_constant_name", "SUGGEST-CONSTANT-NAME", 1, 4, false);
        declareFunction("remove_constant", "REMOVE-CONSTANT", 1, 0, false);
        declareFunction("remove_everything_about_constant", "REMOVE-EVERYTHING-ABOUT-CONSTANT", 1, 0, false);
        declareFunction("find_constant", "FIND-CONSTANT", 1, 0, false);
        declareFunction("constant_name", "CONSTANT-NAME", 1, 0, false);
        declareFunction("constant_guid", "CONSTANT-GUID", 1, 0, false);
        declareFunction("constant_merged_guid", "CONSTANT-MERGED-GUID", 1, 0, false);
        declareFunction("find_constant_by_guid", "FIND-CONSTANT-BY-GUID", 1, 0, false);
        declareFunction("find_constant_by_guid_string", "FIND-CONSTANT-BY-GUID-STRING", 1, 0, false);
        declareFunction("rename_constant", "RENAME-CONSTANT", 2, 0, false);
        declareFunction("constant_internal_id", "CONSTANT-INTERNAL-ID", 1, 0, false);
        declareFunction("constant_internal_id_from_external_id", "CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID", 1, 0, false);
        declareFunction("find_constant_by_internal_id", "FIND-CONSTANT-BY-INTERNAL-ID", 1, 0, false);
        declareFunction("constant_internal_id_p", "CONSTANT-INTERNAL-ID-P", 1, 0, false);
        declareFunction("constant_internal_id_L", "CONSTANT-INTERNAL-ID-<", 2, 0, false);
        declareFunction("installed_constant_p", "INSTALLED-CONSTANT-P", 1, 0, false);
        declareFunction("uninstalled_constant_p", "UNINSTALLED-CONSTANT-P", 1, 0, false);
        declareFunction("new_constant_internal_id_threshold", "NEW-CONSTANT-INTERNAL-ID-THRESHOLD", 0, 0, false);
        declareFunction("constant_external_id", "CONSTANT-EXTERNAL-ID", 1, 0, false);
        declareFunction("constant_name_from_internal_id", "CONSTANT-NAME-FROM-INTERNAL-ID", 1, 0, false);
        declareFunction("find_constant_by_external_id", "FIND-CONSTANT-BY-EXTERNAL-ID", 1, 0, false);
        declareFunction("constant_external_id_p", "CONSTANT-EXTERNAL-ID-P", 1, 0, false);
        declareFunction("constant_has_external_id", "CONSTANT-HAS-EXTERNAL-ID", 2, 0, false);
        declareFunction("constant_external_id_L", "CONSTANT-EXTERNAL-ID-<", 2, 0, false);
        declareFunction("constant_info_from_guid_strings", "CONSTANT-INFO-FROM-GUID-STRINGS", 1, 0, false);
        declareFunction("constant_info_from_name_strings", "CONSTANT-INFO-FROM-NAME-STRINGS", 1, 0, false);
        declareFunction("make_constant_external_id", "MAKE-CONSTANT-EXTERNAL-ID", 0, 0, false);
        declareFunction("make_skolem_id", "MAKE-SKOLEM-ID", 0, 0, false);
        declareFunction("make_constant_guid", "MAKE-CONSTANT-GUID", 0, 0, false);
        declareFunction("make_constant_legacy_guid", "MAKE-CONSTANT-LEGACY-GUID", 1, 0, false);
        declareFunction("constant_guid_to_legacy_id", "CONSTANT-GUID-TO-LEGACY-ID", 1, 0, false);
        declareFunction("constant_legacy_id", "CONSTANT-LEGACY-ID", 1, 0, false);
        declareFunction("find_constant_by_legacy_id", "FIND-CONSTANT-BY-LEGACY-ID", 1, 0, false);
        declareFunction("constant_legacy_id_p", "CONSTANT-LEGACY-ID-P", 1, 0, false);
        declareFunction("unnamed_constant_p", "UNNAMED-CONSTANT-P", 1, 0, false);
        declareFunction("constant_namespace", "CONSTANT-NAMESPACE", 1, 0, false);
        declareFunction("constant_name_within_namespace", "CONSTANT-NAME-WITHIN-NAMESPACE", 1, 0, false);
        declareFunction("random_constant", "RANDOM-CONSTANT", 0, 1, false);
        declareFunction("sample_constants", "SAMPLE-CONSTANTS", 0, 3, false);
        declareFunction("constant_grep", "CONSTANT-GREP", 1, 2, false);
        declareFunction("constant_grep_pattern", "CONSTANT-GREP-PATTERN", 1, 1, false);
        declareFunction("constant_checkpoint_p", "CONSTANT-CHECKPOINT-P", 1, 0, false);
        declareFunction("new_constant_checkpoint", "NEW-CONSTANT-CHECKPOINT", 0, 0, false);
        declareFunction("constant_checkpoint_currentP", "CONSTANT-CHECKPOINT-CURRENT?", 1, 0, false);
        declareFunction("constant_dump_id", "CONSTANT-DUMP-ID", 1, 0, false);
        declareFunction("find_constant_by_dump_id", "FIND-CONSTANT-BY-DUMP-ID", 1, 0, false);
        declareMacro("with_constant_dump_id_table", "WITH-CONSTANT-DUMP-ID-TABLE");
        return NIL;
    }

    public static SubLObject declare_constants_high_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("do_recent_constants", "DO-RECENT-CONSTANTS");
            declareFunction("create_constant", "CREATE-CONSTANT", 1, 1, false);
            declareFunction("find_or_create_constant", "FIND-OR-CREATE-CONSTANT", 1, 1, false);
            declareFunction("gentemp_constant", "GENTEMP-CONSTANT", 1, 1, false);
            declareFunction("suggest_constant_name", "SUGGEST-CONSTANT-NAME", 1, 5, false);
            declareFunction("remove_constant", "REMOVE-CONSTANT", 1, 0, false);
            declareFunction("remove_everything_about_constant", "REMOVE-EVERYTHING-ABOUT-CONSTANT", 1, 0, false);
            declareFunction("find_constant", "FIND-CONSTANT", 1, 0, false);
            declareFunction("constant_name", "CONSTANT-NAME", 1, 0, false);
            declareFunction("constant_guid", "CONSTANT-GUID", 1, 0, false);
            declareFunction("constant_merged_guid", "CONSTANT-MERGED-GUID", 1, 0, false);
            declareFunction("find_constant_by_guid", "FIND-CONSTANT-BY-GUID", 1, 0, false);
            declareFunction("find_constant_by_guid_string", "FIND-CONSTANT-BY-GUID-STRING", 1, 0, false);
            declareFunction("rename_constant", "RENAME-CONSTANT", 2, 0, false);
            declareFunction("constant_internal_id", "CONSTANT-INTERNAL-ID", 1, 0, false);
            declareFunction("constant_internal_id_from_external_id", "CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID", 1, 0, false);
            declareFunction("find_constant_by_internal_id", "FIND-CONSTANT-BY-INTERNAL-ID", 1, 0, false);
            declareFunction("constant_internal_id_p", "CONSTANT-INTERNAL-ID-P", 1, 0, false);
            declareFunction("constant_internal_id_L", "CONSTANT-INTERNAL-ID-<", 2, 0, false);
            declareFunction("installed_constant_p", "INSTALLED-CONSTANT-P", 1, 0, false);
            declareFunction("uninstalled_constant_p", "UNINSTALLED-CONSTANT-P", 1, 0, false);
            declareFunction("new_constant_internal_id_threshold", "NEW-CONSTANT-INTERNAL-ID-THRESHOLD", 0, 0, false);
            declareMacro("with_constant_external_id_equivalence_map", "WITH-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP");
            declareFunction("prefered_constant_external_id_wrt_equivalence", "PREFERED-CONSTANT-EXTERNAL-ID-WRT-EQUIVALENCE", 1, 0, false);
            declareFunction("constant_external_id", "CONSTANT-EXTERNAL-ID", 1, 0, false);
            declareFunction("constant_name_from_internal_id", "CONSTANT-NAME-FROM-INTERNAL-ID", 1, 0, false);
            declareFunction("find_constant_by_external_id", "FIND-CONSTANT-BY-EXTERNAL-ID", 1, 0, false);
            declareFunction("constant_external_id_p", "CONSTANT-EXTERNAL-ID-P", 1, 0, false);
            declareFunction("constant_has_external_id", "CONSTANT-HAS-EXTERNAL-ID", 2, 0, false);
            declareFunction("constant_external_id_L", "CONSTANT-EXTERNAL-ID-<", 2, 0, false);
            declareFunction("constant_info_from_guid_strings", "CONSTANT-INFO-FROM-GUID-STRINGS", 1, 0, false);
            declareFunction("constant_info_from_name_strings", "CONSTANT-INFO-FROM-NAME-STRINGS", 1, 0, false);
            declareFunction("make_constant_external_id", "MAKE-CONSTANT-EXTERNAL-ID", 0, 0, false);
            declareFunction("make_skolem_id", "MAKE-SKOLEM-ID", 0, 0, false);
            declareFunction("make_constant_guid", "MAKE-CONSTANT-GUID", 0, 0, false);
            declareFunction("make_constant_legacy_guid", "MAKE-CONSTANT-LEGACY-GUID", 1, 0, false);
            declareFunction("constant_guid_to_legacy_id", "CONSTANT-GUID-TO-LEGACY-ID", 1, 0, false);
            declareFunction("constant_legacy_id", "CONSTANT-LEGACY-ID", 1, 0, false);
            declareFunction("find_constant_by_legacy_id", "FIND-CONSTANT-BY-LEGACY-ID", 1, 0, false);
            declareFunction("constant_legacy_id_p", "CONSTANT-LEGACY-ID-P", 1, 0, false);
            declareFunction("unnamed_constant_p", "UNNAMED-CONSTANT-P", 1, 0, false);
            declareFunction("constant_namespace", "CONSTANT-NAMESPACE", 1, 0, false);
            declareFunction("constant_name_within_namespace", "CONSTANT-NAME-WITHIN-NAMESPACE", 1, 0, false);
            declareFunction("random_constant", "RANDOM-CONSTANT", 0, 1, false);
            declareFunction("sample_constants", "SAMPLE-CONSTANTS", 0, 3, false);
            declareFunction("constant_grep", "CONSTANT-GREP", 1, 2, false);
            declareFunction("constant_grep_pattern", "CONSTANT-GREP-PATTERN", 1, 1, false);
            declareFunction("constant_checkpoint_p", "CONSTANT-CHECKPOINT-P", 1, 0, false);
            declareFunction("new_constant_checkpoint", "NEW-CONSTANT-CHECKPOINT", 0, 0, false);
            declareFunction("constant_checkpoint_currentP", "CONSTANT-CHECKPOINT-CURRENT?", 1, 0, false);
            declareFunction("constant_dump_id", "CONSTANT-DUMP-ID", 1, 0, false);
            declareFunction("find_constant_by_dump_id", "FIND-CONSTANT-BY-DUMP-ID", 1, 0, false);
            declareMacro("with_constant_dump_id_table", "WITH-CONSTANT-DUMP-ID-TABLE");
            declareFunction("constant_dump_name", "CONSTANT-DUMP-NAME", 1, 0, false);
            declareMacro("with_constant_name_obfuscation", "WITH-CONSTANT-NAME-OBFUSCATION");
            declareFunction("constants_around_constant", "CONSTANTS-AROUND-CONSTANT", 1, 3, false);
            declareFunction("constants_around", "CONSTANTS-AROUND", 1, 3, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("suggest_constant_name", "SUGGEST-CONSTANT-NAME", 1, 4, false);
        }
        return NIL;
    }

    public static SubLObject declare_constants_high_file_Previous() {
        declareMacro("do_recent_constants", "DO-RECENT-CONSTANTS");
        declareFunction("create_constant", "CREATE-CONSTANT", 1, 1, false);
        declareFunction("find_or_create_constant", "FIND-OR-CREATE-CONSTANT", 1, 1, false);
        declareFunction("gentemp_constant", "GENTEMP-CONSTANT", 1, 1, false);
        declareFunction("suggest_constant_name", "SUGGEST-CONSTANT-NAME", 1, 5, false);
        declareFunction("remove_constant", "REMOVE-CONSTANT", 1, 0, false);
        declareFunction("remove_everything_about_constant", "REMOVE-EVERYTHING-ABOUT-CONSTANT", 1, 0, false);
        declareFunction("find_constant", "FIND-CONSTANT", 1, 0, false);
        declareFunction("constant_name", "CONSTANT-NAME", 1, 0, false);
        declareFunction("constant_guid", "CONSTANT-GUID", 1, 0, false);
        declareFunction("constant_merged_guid", "CONSTANT-MERGED-GUID", 1, 0, false);
        declareFunction("find_constant_by_guid", "FIND-CONSTANT-BY-GUID", 1, 0, false);
        declareFunction("find_constant_by_guid_string", "FIND-CONSTANT-BY-GUID-STRING", 1, 0, false);
        declareFunction("rename_constant", "RENAME-CONSTANT", 2, 0, false);
        declareFunction("constant_internal_id", "CONSTANT-INTERNAL-ID", 1, 0, false);
        declareFunction("constant_internal_id_from_external_id", "CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID", 1, 0, false);
        declareFunction("find_constant_by_internal_id", "FIND-CONSTANT-BY-INTERNAL-ID", 1, 0, false);
        declareFunction("constant_internal_id_p", "CONSTANT-INTERNAL-ID-P", 1, 0, false);
        declareFunction("constant_internal_id_L", "CONSTANT-INTERNAL-ID-<", 2, 0, false);
        declareFunction("installed_constant_p", "INSTALLED-CONSTANT-P", 1, 0, false);
        declareFunction("uninstalled_constant_p", "UNINSTALLED-CONSTANT-P", 1, 0, false);
        declareFunction("new_constant_internal_id_threshold", "NEW-CONSTANT-INTERNAL-ID-THRESHOLD", 0, 0, false);
        declareMacro("with_constant_external_id_equivalence_map", "WITH-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP");
        declareFunction("prefered_constant_external_id_wrt_equivalence", "PREFERED-CONSTANT-EXTERNAL-ID-WRT-EQUIVALENCE", 1, 0, false);
        declareFunction("constant_external_id", "CONSTANT-EXTERNAL-ID", 1, 0, false);
        declareFunction("constant_name_from_internal_id", "CONSTANT-NAME-FROM-INTERNAL-ID", 1, 0, false);
        declareFunction("find_constant_by_external_id", "FIND-CONSTANT-BY-EXTERNAL-ID", 1, 0, false);
        declareFunction("constant_external_id_p", "CONSTANT-EXTERNAL-ID-P", 1, 0, false);
        declareFunction("constant_has_external_id", "CONSTANT-HAS-EXTERNAL-ID", 2, 0, false);
        declareFunction("constant_external_id_L", "CONSTANT-EXTERNAL-ID-<", 2, 0, false);
        declareFunction("constant_info_from_guid_strings", "CONSTANT-INFO-FROM-GUID-STRINGS", 1, 0, false);
        declareFunction("constant_info_from_name_strings", "CONSTANT-INFO-FROM-NAME-STRINGS", 1, 0, false);
        declareFunction("make_constant_external_id", "MAKE-CONSTANT-EXTERNAL-ID", 0, 0, false);
        declareFunction("make_skolem_id", "MAKE-SKOLEM-ID", 0, 0, false);
        declareFunction("make_constant_guid", "MAKE-CONSTANT-GUID", 0, 0, false);
        declareFunction("make_constant_legacy_guid", "MAKE-CONSTANT-LEGACY-GUID", 1, 0, false);
        declareFunction("constant_guid_to_legacy_id", "CONSTANT-GUID-TO-LEGACY-ID", 1, 0, false);
        declareFunction("constant_legacy_id", "CONSTANT-LEGACY-ID", 1, 0, false);
        declareFunction("find_constant_by_legacy_id", "FIND-CONSTANT-BY-LEGACY-ID", 1, 0, false);
        declareFunction("constant_legacy_id_p", "CONSTANT-LEGACY-ID-P", 1, 0, false);
        declareFunction("unnamed_constant_p", "UNNAMED-CONSTANT-P", 1, 0, false);
        declareFunction("constant_namespace", "CONSTANT-NAMESPACE", 1, 0, false);
        declareFunction("constant_name_within_namespace", "CONSTANT-NAME-WITHIN-NAMESPACE", 1, 0, false);
        declareFunction("random_constant", "RANDOM-CONSTANT", 0, 1, false);
        declareFunction("sample_constants", "SAMPLE-CONSTANTS", 0, 3, false);
        declareFunction("constant_grep", "CONSTANT-GREP", 1, 2, false);
        declareFunction("constant_grep_pattern", "CONSTANT-GREP-PATTERN", 1, 1, false);
        declareFunction("constant_checkpoint_p", "CONSTANT-CHECKPOINT-P", 1, 0, false);
        declareFunction("new_constant_checkpoint", "NEW-CONSTANT-CHECKPOINT", 0, 0, false);
        declareFunction("constant_checkpoint_currentP", "CONSTANT-CHECKPOINT-CURRENT?", 1, 0, false);
        declareFunction("constant_dump_id", "CONSTANT-DUMP-ID", 1, 0, false);
        declareFunction("find_constant_by_dump_id", "FIND-CONSTANT-BY-DUMP-ID", 1, 0, false);
        declareMacro("with_constant_dump_id_table", "WITH-CONSTANT-DUMP-ID-TABLE");
        declareFunction("constant_dump_name", "CONSTANT-DUMP-NAME", 1, 0, false);
        declareMacro("with_constant_name_obfuscation", "WITH-CONSTANT-NAME-OBFUSCATION");
        declareFunction("constants_around_constant", "CONSTANTS-AROUND-CONSTANT", 1, 3, false);
        declareFunction("constants_around", "CONSTANTS-AROUND", 1, 3, false);
        return NIL;
    }

    static private final SubLList $list_alt50 = list(makeSymbol("EXTERNAL-ID"));

    static private final SubLString $str_alt51$Return_the_constant_with_EXTERNAL = makeString("Return the constant with EXTERNAL-ID, or NIL if not present.");

    static private final SubLList $list_alt52 = list(list(makeSymbol("EXTERNAL-ID"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));

    static private final SubLList $list_alt55 = list(makeSymbol("GUID-STRING-LIST"));

    static private final SubLString $str_alt56$Returns_a_list_of_constant_info_i = makeString("Returns a list of constant info-items corresponding to the GUID-LIST.  Each\ninfo item is a list of guid-string and name.");

    static private final SubLList $list_alt57 = list(list(makeSymbol("GUID-STRING-LIST"), makeSymbol("LISTP")));

    static private final SubLList $list_alt58 = list(makeSymbol("LISTP"));

    static private final SubLList $list_alt60 = list(makeSymbol("NAME-STRING-LIST"));

    static private final SubLString $str_alt61$Returns_a_list_of_constant_info_i = makeString("Returns a list of constant info-items corresponding to the NAME-LIST.  Each\ninfo item is a list of guid-string and name.");

    static private final SubLList $list_alt62 = list(list(makeSymbol("NAME-STRING-LIST"), makeSymbol("LISTP")));

    static private final SubLList $list_alt63 = list(SEVEN_INTEGER, TWENTY_INTEGER, makeInteger(1969));

    static private final SubLList $list_alt65 = list(makeSymbol("MONTH"), makeSymbol("DAY"), makeSymbol("YEAR"));

    static private final SubLList $list_alt66 = list(makeSymbol("LEGACY-MONTH"), makeSymbol("LEGACY-DAY"), makeSymbol("LEGACY-YEAR"));

    static private final SubLString $str_alt70$Return_the_namespace_to_which_the = makeString("Return the namespace to which the constant belongs.");

    static private final SubLString $str_alt72$Return_the_constant_name_within_i = makeString("Return the constant name within its namespace.");

    static private final SubLList $list_alt75 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("FUNCTION"), makeSymbol("TRUE"))));

    static private final SubLString $str_alt76$Return_a_randomly_chosen_constant = makeString("Return a randomly chosen constant that satisfies TEST");

    static private final SubLString $str_alt80$Error__A___A__compiling_regular_e = makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");

    static private final SubLList $list_alt82 = list(makeSymbol("CHECKPOINT-COUNT"), makeSymbol("CHECKPOINT-NEXT-ID"));

    static private final SubLList $list_alt84 = list(list(makeSymbol("*CONSTANT-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-CONSTANT-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-CONSTANT-HANDLE-FUNC*"), list(QUOTE, makeSymbol("CONSTANT-DUMP-ID"))));

    public static final SubLObject init_constants_high_file_alt() {
        deflexical("*CONSTANT-LEGACY-GUID-DATE*", $list_alt63);
        defparameter("*CONSTANT-DUMP-ID-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject init_constants_high_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*", NIL);
            deflexical("*CONSTANT-LEGACY-GUID-DATE*", $list81);
            defparameter("*CONSTANT-DUMP-ID-TABLE*", NIL);
            defparameter("*CONSTANT-NAME-OBFUSCATION-FN*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CONSTANT-LEGACY-GUID-DATE*", $list_alt63);
        }
        return NIL;
    }

    public static SubLObject init_constants_high_file_Previous() {
        defparameter("*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*", NIL);
        deflexical("*CONSTANT-LEGACY-GUID-DATE*", $list81);
        defparameter("*CONSTANT-DUMP-ID-TABLE*", NIL);
        defparameter("*CONSTANT-NAME-OBFUSCATION-FN*", NIL);
        return NIL;
    }

    public static final SubLObject setup_constants_high_file_alt() {
        register_cyc_api_function(CREATE_CONSTANT, $list_alt3, $str_alt4$Return_a_new_constant_named_NAME_, $list_alt5, $list_alt6);
        register_cyc_api_function(FIND_OR_CREATE_CONSTANT, $list_alt3, $str_alt9$Return_the_constant_with_NAME_if_, $list_alt10, $list_alt6);
        register_cyc_api_function(GENTEMP_CONSTANT, $list_alt14, $str_alt15$Create_and_return_a_temporary_con, $list_alt16, $list_alt6);
        register_cyc_api_function(REMOVE_CONSTANT, $list_alt22, $str_alt23$Remove_CONSTANT_from_the_KB_, $list_alt24, $list_alt25);
        register_cyc_api_function(FIND_CONSTANT, $list_alt27, $str_alt28$Return_the_constant_with_NAME__or, $list_alt10, $list_alt29);
        register_cyc_api_function(CONSTANT_NAME, $list_alt22, $str_alt31$Return_the_name_of_CONSTANT_or__u, $list_alt24, NIL);
        register_cyc_api_function(RENAME_CONSTANT, $list_alt35, $str_alt36$Rename_CONSTANT_to_have_NEW_NAME_, $list_alt37, $list_alt6);
        register_cyc_api_function(CONSTANT_INTERNAL_ID, $list_alt22, $str_alt39$Return_the_internal_id_of_CONSTAN, $list_alt24, $list_alt40);
        register_cyc_api_function(FIND_CONSTANT_BY_INTERNAL_ID, $list_alt43, $str_alt44$Return_the_constant_with_internal, $list_alt45, $list_alt29);
        register_cyc_api_function(CONSTANT_EXTERNAL_ID, $list_alt22, $str_alt47$Return_the_external_id_of_CONSTAN, $list_alt24, $list_alt48);
        register_cyc_api_function(FIND_CONSTANT_BY_EXTERNAL_ID, $list_alt50, $str_alt51$Return_the_constant_with_EXTERNAL, $list_alt52, $list_alt29);
        register_cyc_api_function(CONSTANT_INFO_FROM_GUID_STRINGS, $list_alt55, $str_alt56$Returns_a_list_of_constant_info_i, $list_alt57, $list_alt58);
        register_cyc_api_function(CONSTANT_INFO_FROM_NAME_STRINGS, $list_alt60, $str_alt61$Returns_a_list_of_constant_info_i, $list_alt62, $list_alt58);
        register_cyc_api_function(CONSTANT_NAMESPACE, $list_alt22, $str_alt70$Return_the_namespace_to_which_the, $list_alt24, NIL);
        register_cyc_api_function(CONSTANT_NAME_WITHIN_NAMESPACE, $list_alt22, $str_alt72$Return_the_constant_name_within_i, $list_alt24, NIL);
        register_cyc_api_function(RANDOM_CONSTANT, $list_alt75, $str_alt76$Return_a_randomly_chosen_constant, NIL, $list_alt6);
        return NIL;
    }

    public static SubLObject setup_constants_high_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function(CREATE_CONSTANT, $list16, $str17$Return_a_new_constant_named_NAME_, $list18, $list19);
            register_cyc_api_function(FIND_OR_CREATE_CONSTANT, $list16, $str22$Return_the_constant_with_NAME_if_, $list23, $list19);
            register_cyc_api_function(GENTEMP_CONSTANT, $list27, $str28$Create_and_return_a_temporary_con, $list29, $list19);
            register_cyc_api_function(REMOVE_CONSTANT, $list37, $str38$Remove_CONSTANT_from_the_KB_, $list39, $list40);
            register_cyc_api_function(FIND_CONSTANT, $list42, $str43$Return_the_constant_with_NAME__or, $list23, $list44);
            register_cyc_api_function(CONSTANT_NAME, $list37, $str46$Return_the_name_of_CONSTANT_or__u, $list39, NIL);
            register_cyc_api_function(RENAME_CONSTANT, $list50, $str51$Rename_CONSTANT_to_have_NEW_NAME_, $list52, $list19);
            register_cyc_api_function(CONSTANT_INTERNAL_ID, $list37, $str54$Return_the_internal_id_of_CONSTAN, $list39, $list55);
            register_cyc_api_function(FIND_CONSTANT_BY_INTERNAL_ID, $list58, $str59$Return_the_constant_with_internal, $list60, $list44);
            register_cyc_api_function(CONSTANT_EXTERNAL_ID, $list37, $str65$Return_the_external_id_of_CONSTAN, $list39, $list66);
            register_cyc_api_function(FIND_CONSTANT_BY_EXTERNAL_ID, $list68, $str69$Return_the_constant_with_EXTERNAL, $list70, $list44);
            register_cyc_api_function(CONSTANT_INFO_FROM_GUID_STRINGS, $list73, $str74$Returns_a_list_of_constant_info_i, $list75, $list76);
            register_cyc_api_function(CONSTANT_INFO_FROM_NAME_STRINGS, $list78, $str79$Returns_a_list_of_constant_info_i, $list80, $list76);
            register_cyc_api_function(CONSTANT_NAMESPACE, $list37, $str88$Return_the_namespace_to_which_the, $list39, NIL);
            register_cyc_api_function(CONSTANT_NAME_WITHIN_NAMESPACE, $list37, $str90$Return_the_constant_name_within_i, $list39, NIL);
            register_cyc_api_function(RANDOM_CONSTANT, $list93, $str94$Return_a_randomly_chosen_constant, NIL, $list19);
            register_external_symbol(WITH_CONSTANT_NAME_OBFUSCATION);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(CREATE_CONSTANT, $list_alt3, $str_alt4$Return_a_new_constant_named_NAME_, $list_alt5, $list_alt6);
            register_cyc_api_function(FIND_OR_CREATE_CONSTANT, $list_alt3, $str_alt9$Return_the_constant_with_NAME_if_, $list_alt10, $list_alt6);
            register_cyc_api_function(GENTEMP_CONSTANT, $list_alt14, $str_alt15$Create_and_return_a_temporary_con, $list_alt16, $list_alt6);
            register_cyc_api_function(REMOVE_CONSTANT, $list_alt22, $str_alt23$Remove_CONSTANT_from_the_KB_, $list_alt24, $list_alt25);
            register_cyc_api_function(FIND_CONSTANT, $list_alt27, $str_alt28$Return_the_constant_with_NAME__or, $list_alt10, $list_alt29);
            register_cyc_api_function(CONSTANT_NAME, $list_alt22, $str_alt31$Return_the_name_of_CONSTANT_or__u, $list_alt24, NIL);
            register_cyc_api_function(RENAME_CONSTANT, $list_alt35, $str_alt36$Rename_CONSTANT_to_have_NEW_NAME_, $list_alt37, $list_alt6);
            register_cyc_api_function(CONSTANT_INTERNAL_ID, $list_alt22, $str_alt39$Return_the_internal_id_of_CONSTAN, $list_alt24, $list_alt40);
            register_cyc_api_function(FIND_CONSTANT_BY_INTERNAL_ID, $list_alt43, $str_alt44$Return_the_constant_with_internal, $list_alt45, $list_alt29);
            register_cyc_api_function(CONSTANT_EXTERNAL_ID, $list_alt22, $str_alt47$Return_the_external_id_of_CONSTAN, $list_alt24, $list_alt48);
            register_cyc_api_function(FIND_CONSTANT_BY_EXTERNAL_ID, $list_alt50, $str_alt51$Return_the_constant_with_EXTERNAL, $list_alt52, $list_alt29);
            register_cyc_api_function(CONSTANT_INFO_FROM_GUID_STRINGS, $list_alt55, $str_alt56$Returns_a_list_of_constant_info_i, $list_alt57, $list_alt58);
            register_cyc_api_function(CONSTANT_INFO_FROM_NAME_STRINGS, $list_alt60, $str_alt61$Returns_a_list_of_constant_info_i, $list_alt62, $list_alt58);
            register_cyc_api_function(CONSTANT_NAMESPACE, $list_alt22, $str_alt70$Return_the_namespace_to_which_the, $list_alt24, NIL);
            register_cyc_api_function(CONSTANT_NAME_WITHIN_NAMESPACE, $list_alt22, $str_alt72$Return_the_constant_name_within_i, $list_alt24, NIL);
            register_cyc_api_function(RANDOM_CONSTANT, $list_alt75, $str_alt76$Return_a_randomly_chosen_constant, NIL, $list_alt6);
        }
        return NIL;
    }

    public static SubLObject setup_constants_high_file_Previous() {
        register_cyc_api_function(CREATE_CONSTANT, $list16, $str17$Return_a_new_constant_named_NAME_, $list18, $list19);
        register_cyc_api_function(FIND_OR_CREATE_CONSTANT, $list16, $str22$Return_the_constant_with_NAME_if_, $list23, $list19);
        register_cyc_api_function(GENTEMP_CONSTANT, $list27, $str28$Create_and_return_a_temporary_con, $list29, $list19);
        register_cyc_api_function(REMOVE_CONSTANT, $list37, $str38$Remove_CONSTANT_from_the_KB_, $list39, $list40);
        register_cyc_api_function(FIND_CONSTANT, $list42, $str43$Return_the_constant_with_NAME__or, $list23, $list44);
        register_cyc_api_function(CONSTANT_NAME, $list37, $str46$Return_the_name_of_CONSTANT_or__u, $list39, NIL);
        register_cyc_api_function(RENAME_CONSTANT, $list50, $str51$Rename_CONSTANT_to_have_NEW_NAME_, $list52, $list19);
        register_cyc_api_function(CONSTANT_INTERNAL_ID, $list37, $str54$Return_the_internal_id_of_CONSTAN, $list39, $list55);
        register_cyc_api_function(FIND_CONSTANT_BY_INTERNAL_ID, $list58, $str59$Return_the_constant_with_internal, $list60, $list44);
        register_cyc_api_function(CONSTANT_EXTERNAL_ID, $list37, $str65$Return_the_external_id_of_CONSTAN, $list39, $list66);
        register_cyc_api_function(FIND_CONSTANT_BY_EXTERNAL_ID, $list68, $str69$Return_the_constant_with_EXTERNAL, $list70, $list44);
        register_cyc_api_function(CONSTANT_INFO_FROM_GUID_STRINGS, $list73, $str74$Returns_a_list_of_constant_info_i, $list75, $list76);
        register_cyc_api_function(CONSTANT_INFO_FROM_NAME_STRINGS, $list78, $str79$Returns_a_list_of_constant_info_i, $list80, $list76);
        register_cyc_api_function(CONSTANT_NAMESPACE, $list37, $str88$Return_the_namespace_to_which_the, $list39, NIL);
        register_cyc_api_function(CONSTANT_NAME_WITHIN_NAMESPACE, $list37, $str90$Return_the_constant_name_within_i, $list39, NIL);
        register_cyc_api_function(RANDOM_CONSTANT, $list93, $str94$Return_a_randomly_chosen_constant, NIL, $list19);
        register_external_symbol(WITH_CONSTANT_NAME_OBFUSCATION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constants_high_file();
    }

    @Override
    public void initializeVariables() {
        init_constants_high_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constants_high_file();
    }

    static {
    }
}

