/**
 *
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.constant_handles.constant_handle_validP;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.constant_suid;
import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.find_constant_by_suid;
import static com.cyc.cycjava.cycl.constant_handles.new_constant_suid_threshold;
import static com.cyc.cycjava.cycl.constant_handles.next_constant_suid;
import static com.cyc.cycjava.cycl.constant_handles.valid_constant_handleP;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_downcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_upcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class constants_high extends SubLTranslatedFile {
    public static final SubLFile me = new constants_high();

    public static final String myName = "com.cyc.cycjava.cycl.constants_high";

    public static final String myFingerPrint = "841191859c8a0b679f830e1d25d1965e82a7c59af185c8b00ff928c275ae2ddd";



    // deflexical
    private static final SubLSymbol $constant_legacy_guid_date$ = makeSymbol("*CONSTANT-LEGACY-GUID-DATE*");

    // defparameter
    public static final SubLSymbol $constant_dump_id_table$ = makeSymbol("*CONSTANT-DUMP-ID-TABLE*");



    private static final SubLList $list0 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("NUM"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping constants for sweep")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list1 = list(makeKeyword("NUM"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLString $$$mapping_constants_for_sweep = makeString("mapping constants for sweep");







    private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

    private static final SubLSymbol CONSTANTS_AROUND = makeSymbol("CONSTANTS-AROUND");

    private static final SubLList $list11 = list(makeSymbol("NEXT-CONSTANT-SUID"));

    private static final SubLSymbol DO_CONSTANTS = makeSymbol("DO-CONSTANTS");

    private static final SubLSymbol CONSTANT_NAME_SPEC_P = makeSymbol("CONSTANT-NAME-SPEC-P");



    private static final SubLSymbol CREATE_CONSTANT = makeSymbol("CREATE-CONSTANT");

    public static final SubLList $list16 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));

    private static final SubLString $str17$Return_a_new_constant_named_NAME_ = makeString("Return a new constant named NAME with EXTERNAL-ID as the external ID.");

    private static final SubLList $list18 = list(list(makeSymbol("NAME"), makeSymbol("CONSTANT-NAME-SPEC-P")), list(makeSymbol("EXTERNAL-ID"), list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P"))));

    private static final SubLList $list19 = list(makeSymbol("CONSTANT-P"));



    private static final SubLSymbol FIND_OR_CREATE_CONSTANT = makeSymbol("FIND-OR-CREATE-CONSTANT");

    private static final SubLString $str22$Return_the_constant_with_NAME_if_ = makeString("Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\n  Also, if it exists but has a null id, install EXTERNAL-ID on the constant.");

    private static final SubLList $list23 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));

    private static final SubLString $$$TMP = makeString("TMP");

    private static final SubLString $str25$_A__A = makeString("~A-~A");

    private static final SubLSymbol GENTEMP_CONSTANT = makeSymbol("GENTEMP-CONSTANT");

    public static final SubLList $list27 = list(makeSymbol("START-NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("PREFIX"), makeString("TMP")));

    private static final SubLString $str28$Create_and_return_a_temporary_con = makeString("Create and return a temporary constant whose name is based on START-NAME");

    public static final SubLList $list29 = list(list(makeSymbol("START-NAME"), makeSymbol("STRINGP")));

    private static final SubLString $str30$ = makeString("");





    private static final SubLString $$$T = makeString("T");

    private static final SubLString $str34$T_ = makeString("T-");



    private static final SubLSymbol REMOVE_CONSTANT = makeSymbol("REMOVE-CONSTANT");

    public static final SubLList $list37 = list(makeSymbol("CONSTANT"));

    private static final SubLString $str38$Remove_CONSTANT_from_the_KB_ = makeString("Remove CONSTANT from the KB.");

    private static final SubLList $list39 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));

    public static final SubLList $list40 = list(makeSymbol("NULL"));



    private static final SubLList $list42 = list(makeSymbol("NAME"));

    private static final SubLString $str43$Return_the_constant_with_NAME__or = makeString("Return the constant with NAME, or NIL if not present.");

    private static final SubLList $list44 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));



    private static final SubLString $str46$Return_the_name_of_CONSTANT_or__u = makeString("Return the name of CONSTANT or :unnamed.");



    private static final SubLSymbol GUID_STRING_P = makeSymbol("GUID-STRING-P");

    private static final SubLSymbol RENAME_CONSTANT = makeSymbol("RENAME-CONSTANT");

    public static final SubLList $list50 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"));

    private static final SubLString $str51$Rename_CONSTANT_to_have_NEW_NAME_ = makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");

    public static final SubLList $list52 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NEW-NAME"), makeSymbol("STRINGP")));

    private static final SubLSymbol CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");

    private static final SubLString $str54$Return_the_internal_id_of_CONSTAN = makeString("Return the internal id of CONSTANT.");

    public static final SubLList $list55 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-INTERNAL-ID-P")));

    private static final SubLSymbol CONSTANT_INTERNAL_ID_P = makeSymbol("CONSTANT-INTERNAL-ID-P");



    public static final SubLList $list58 = list(makeSymbol("ID"));

    private static final SubLString $str59$Return_the_constant_with_internal = makeString("Return the constant with internal ID, or NIL if not present.");

    public static final SubLList $list60 = list(list(makeSymbol("ID"), makeSymbol("CONSTANT-INTERNAL-ID-P")));

    private static final SubLList $list61 = list(makeSymbol("ID-MAP"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $constant_external_id_equivalence_map$ = makeSymbol("*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*");

    private static final SubLSymbol CONSTANT_EXTERNAL_ID = makeSymbol("CONSTANT-EXTERNAL-ID");

    private static final SubLString $str65$Return_the_external_id_of_CONSTAN = makeString("Return the external id of CONSTANT.");

    public static final SubLList $list66 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));

    private static final SubLSymbol FIND_CONSTANT_BY_EXTERNAL_ID = makeSymbol("FIND-CONSTANT-BY-EXTERNAL-ID");

    private static final SubLList $list68 = list(makeSymbol("EXTERNAL-ID"));

    private static final SubLString $str69$Return_the_constant_with_EXTERNAL = makeString("Return the constant with EXTERNAL-ID, or NIL if not present.");

    private static final SubLList $list70 = list(list(makeSymbol("EXTERNAL-ID"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));



    private static final SubLSymbol CONSTANT_INFO_FROM_GUID_STRINGS = makeSymbol("CONSTANT-INFO-FROM-GUID-STRINGS");

    private static final SubLList $list73 = list(makeSymbol("GUID-STRING-LIST"));

    private static final SubLString $str74$Returns_a_list_of_constant_info_i = makeString("Returns a list of constant info-items corresponding to the GUID-LIST.  Each\ninfo item is a list of guid-string and name.");

    public static final SubLList $list75 = list(list(makeSymbol("GUID-STRING-LIST"), makeSymbol("LISTP")));

    private static final SubLList $list76 = list(makeSymbol("LISTP"));

    private static final SubLSymbol CONSTANT_INFO_FROM_NAME_STRINGS = makeSymbol("CONSTANT-INFO-FROM-NAME-STRINGS");

    private static final SubLList $list78 = list(makeSymbol("NAME-STRING-LIST"));

    private static final SubLString $str79$Returns_a_list_of_constant_info_i = makeString("Returns a list of constant info-items corresponding to the NAME-LIST.  Each\ninfo item is a list of guid-string and name.");

    private static final SubLList $list80 = list(list(makeSymbol("NAME-STRING-LIST"), makeSymbol("LISTP")));

    private static final SubLList $list81 = list(SEVEN_INTEGER, TWENTY_INTEGER, makeInteger(1969));

    private static final SubLSymbol CONSTANT_LEGACY_ID_P = makeSymbol("CONSTANT-LEGACY-ID-P");

    private static final SubLList $list83 = list(makeSymbol("MONTH"), makeSymbol("DAY"), makeSymbol("YEAR"));

    public static final SubLList $list84 = list(makeSymbol("LEGACY-MONTH"), makeSymbol("LEGACY-DAY"), makeSymbol("LEGACY-YEAR"));



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

    private static final SubLList $list101 = list(list(makeSymbol("*CONSTANT-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-CONSTANT-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-CONSTANT-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("CONSTANT-DUMP-ID"))));

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

    public static SubLObject gentemp_constant(final SubLObject start_name, SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $$$TMP;
        }
        SubLTrampolineFile.enforceType(start_name, STRINGP);
        final SubLObject name = constant_completion_high.uniquify_constant_name(format(NIL, $str25$_A__A, prefix, start_name), UNPROVIDED);
        final SubLObject constant = create_constant(name, UNPROVIDED);
        return constant;
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

    public static SubLObject remove_constant(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        remove_everything_about_constant(constant);
        if (NIL != tms.tms_please_kill_this_term_for_me(constant)) {
            return constant;
        }
        return constants_interface.kb_remove_constant(constant);
    }

    public static SubLObject remove_everything_about_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
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

    public static SubLObject find_constant(final SubLObject name) {
        SubLTrampolineFile.enforceType(name, STRINGP);
        final SubLObject constant = constants_interface.kb_lookup_constant_by_name(name);
        if ($find_renamed$ && (constant == NIL)) {
        }
        return constant;
    }

    public static SubLObject constant_name(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        return constants_interface.kb_constant_name(constant);
    }

    public static SubLObject constant_guid(final SubLObject constant) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        return NIL != constant_handle_validP(constant) ? constants_interface.kb_constant_guid(constant) : NIL;
    }

    public static SubLObject constant_merged_guid(final SubLObject constant) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        return NIL != constant_handle_validP(constant) ? constants_interface.kb_constant_merged_guid(constant) : NIL;
    }

    public static SubLObject find_constant_by_guid(final SubLObject guid) {
        assert NIL != Guids.guid_p(guid) : "Guids.guid_p(guid) " + "CommonSymbols.NIL != Guids.guid_p(guid) " + guid;
        return constants_interface.kb_lookup_constant_by_guid(guid);
    }

    public static SubLObject find_constant_by_guid_string(final SubLObject guid_string) {
        assert NIL != Guids.guid_string_p(guid_string) : "Guids.guid_string_p(guid_string) " + "CommonSymbols.NIL != Guids.guid_string_p(guid_string) " + guid_string;
        return find_constant_by_guid(Guids.string_to_guid(guid_string));
    }

    public static SubLObject rename_constant(final SubLObject constant, final SubLObject new_name) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        SubLTrampolineFile.enforceType(new_name, STRINGP);
        return constants_interface.kb_rename_constant(constant, new_name);
    }

    public static SubLObject constant_internal_id(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        return constant_suid(constant);
    }

    public static SubLObject constant_internal_id_from_external_id(final SubLObject external_id) {
        final SubLObject constant = find_constant_by_external_id(external_id);
        return NIL != constant ? constant_internal_id(constant) : NIL;
    }

    public static SubLObject find_constant_by_internal_id(final SubLObject id) {
        SubLTrampolineFile.enforceType(id, CONSTANT_INTERNAL_ID_P);
        return find_constant_by_suid(id);
    }

    public static SubLObject constant_internal_id_p(final SubLObject v_object) {
        return integerp(v_object);
    }

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

    public static SubLObject installed_constant_p(final SubLObject v_object) {
        return valid_constant_handleP(v_object);
    }

    public static SubLObject uninstalled_constant_p(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL == installed_constant_p(v_object)));
    }

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

    public static SubLObject constant_external_id(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        return constant_guid(constant);
    }

    public static SubLObject constant_name_from_internal_id(final SubLObject internal_id) {
        final SubLObject constant = find_constant_by_internal_id(internal_id);
        return NIL != constant_p(constant) ? constant_name(constant) : NIL;
    }

    public static SubLObject find_constant_by_external_id(SubLObject external_id) {
        SubLTrampolineFile.enforceType(external_id, CONSTANT_EXTERNAL_ID_P);
        external_id = prefered_constant_external_id_wrt_equivalence(external_id);
        return find_constant_by_guid(external_id);
    }

    public static SubLObject constant_external_id_p(final SubLObject v_object) {
        return Guids.guid_p(v_object);
    }

    public static SubLObject constant_has_external_id(final SubLObject constant, final SubLObject external_id) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        assert NIL != constant_external_id_p(external_id) : "constants_high.constant_external_id_p(external_id) " + "CommonSymbols.NIL != constants_high.constant_external_id_p(external_id) " + external_id;
        final SubLObject guid = constant_guid(constant);
        return Guids.guidE(guid, external_id);
    }

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

    public static SubLObject make_constant_external_id() {
        return make_constant_guid();
    }

    public static SubLObject make_skolem_id() {
        return make_constant_external_id();
    }

    public static SubLObject make_constant_guid() {
        return Guids.new_guid();
    }

    public static SubLObject make_constant_legacy_guid(final SubLObject legacy_id) {
        assert NIL != constant_legacy_id_p(legacy_id) : "constants_high.constant_legacy_id_p(legacy_id) " + "CommonSymbols.NIL != constants_high.constant_legacy_id_p(legacy_id) " + legacy_id;
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

    public static SubLObject constant_guid_to_legacy_id(final SubLObject guid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Guids.guid_p(guid) : "Guids.guid_p(guid) " + "CommonSymbols.NIL != Guids.guid_p(guid) " + guid;
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

    public static SubLObject constant_legacy_id(final SubLObject constant) {
        return constant_guid_to_legacy_id(constant_guid(constant));
    }

    public static SubLObject find_constant_by_legacy_id(final SubLObject legacy_id) {
        return find_constant_by_guid(make_constant_legacy_guid(legacy_id));
    }

    public static SubLObject constant_legacy_id_p(final SubLObject v_object) {
        return integerp(v_object);
    }

    public static SubLObject unnamed_constant_p(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && ($UNNAMED == constant_name(constant)));
    }

    public static SubLObject constant_namespace(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        final SubLObject delim = string_utilities.char_position(CHAR_colon, constant_name(constant), UNPROVIDED);
        if (NIL != delim) {
            return subseq(constant_name(constant), ZERO_INTEGER, delim);
        }
        return $$$cyc;
    }

    public static SubLObject constant_name_within_namespace(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        final SubLObject delim = string_utilities.char_position(CHAR_colon, constant_name(constant), UNPROVIDED);
        if (NIL != delim) {
            return subseq(constant_name(constant), add(delim, ONE_INTEGER), UNPROVIDED);
        }
        return constant_name(constant);
    }

    public static SubLObject random_constant(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        return constants_low.random_constant_internal(test);
    }

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
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
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

    public static SubLObject constant_grep(final SubLObject regular_expression, SubLObject comp_options, SubLObject match_options) {
        if (comp_options == UNPROVIDED) {
            comp_options = NIL;
        }
        if (match_options == UNPROVIDED) {
            match_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != regular_expressions.regular_expression_p(regular_expression) : "regular_expressions.regular_expression_p(regular_expression) " + "CommonSymbols.NIL != regular_expressions.regular_expression_p(regular_expression) " + regular_expression;
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

    public static SubLObject constant_checkpoint_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(NON_NEGATIVE_INTEGER_P, v_object, UNPROVIDED)));
    }

    public static SubLObject new_constant_checkpoint() {
        final SubLObject constant_count = constant_count();
        final SubLObject next_constant_id = next_constant_suid();
        return list(constant_count, next_constant_id);
    }

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

    public static SubLObject constant_dump_id(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = constant_internal_id(constant);
        final SubLObject dump_table = $constant_dump_id_table$.getDynamicValue(thread);
        if (NIL != dump_table) {
            id = id_index_lookup(dump_table, id, UNPROVIDED);
        }
        return id;
    }

    public static SubLObject find_constant_by_dump_id(final SubLObject dump_id) {
        return find_constant_by_internal_id(dump_id);
    }

    public static SubLObject with_constant_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list101, append(body, NIL));
    }

    public static SubLObject constant_dump_name(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($constant_name_obfuscation_fn$.getDynamicValue(thread).isFunctionSpec()) {
            return funcall($constant_name_obfuscation_fn$.getDynamicValue(thread), constant);
        }
        return constant_name(constant);
    }

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
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        return constants_around(constant_suid(constant), total, before, after);
    }

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
        assert NIL != subl_promotions.non_negative_integer_p(constant_id) : "subl_promotions.non_negative_integer_p(constant_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(constant_id) " + constant_id;
        return assertions_high.kb_objects_around_id(FIND_CONSTANT_BY_SUID, ZERO_INTEGER, constant_id, next_constant_suid(), total, before, after);
    }

    public static SubLObject declare_constants_high_file() {
        declareMacro(me, "do_recent_constants", "DO-RECENT-CONSTANTS");
        declareFunction(me, "create_constant", "CREATE-CONSTANT", 1, 1, false);
        declareFunction(me, "find_or_create_constant", "FIND-OR-CREATE-CONSTANT", 1, 1, false);
        declareFunction(me, "gentemp_constant", "GENTEMP-CONSTANT", 1, 1, false);
        declareFunction(me, "suggest_constant_name", "SUGGEST-CONSTANT-NAME", 1, 5, false);
        declareFunction(me, "remove_constant", "REMOVE-CONSTANT", 1, 0, false);
        declareFunction(me, "remove_everything_about_constant", "REMOVE-EVERYTHING-ABOUT-CONSTANT", 1, 0, false);
        declareFunction(me, "find_constant", "FIND-CONSTANT", 1, 0, false);
        declareFunction(me, "constant_name", "CONSTANT-NAME", 1, 0, false);
        declareFunction(me, "constant_guid", "CONSTANT-GUID", 1, 0, false);
        declareFunction(me, "constant_merged_guid", "CONSTANT-MERGED-GUID", 1, 0, false);
        declareFunction(me, "find_constant_by_guid", "FIND-CONSTANT-BY-GUID", 1, 0, false);
        declareFunction(me, "find_constant_by_guid_string", "FIND-CONSTANT-BY-GUID-STRING", 1, 0, false);
        declareFunction(me, "rename_constant", "RENAME-CONSTANT", 2, 0, false);
        declareFunction(me, "constant_internal_id", "CONSTANT-INTERNAL-ID", 1, 0, false);
        declareFunction(me, "constant_internal_id_from_external_id", "CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID", 1, 0, false);
        declareFunction(me, "find_constant_by_internal_id", "FIND-CONSTANT-BY-INTERNAL-ID", 1, 0, false);
        declareFunction(me, "constant_internal_id_p", "CONSTANT-INTERNAL-ID-P", 1, 0, false);
        declareFunction(me, "constant_internal_id_L", "CONSTANT-INTERNAL-ID-<", 2, 0, false);
        declareFunction(me, "installed_constant_p", "INSTALLED-CONSTANT-P", 1, 0, false);
        declareFunction(me, "uninstalled_constant_p", "UNINSTALLED-CONSTANT-P", 1, 0, false);
        declareFunction(me, "new_constant_internal_id_threshold", "NEW-CONSTANT-INTERNAL-ID-THRESHOLD", 0, 0, false);
        declareMacro(me, "with_constant_external_id_equivalence_map", "WITH-CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP");
        declareFunction(me, "prefered_constant_external_id_wrt_equivalence", "PREFERED-CONSTANT-EXTERNAL-ID-WRT-EQUIVALENCE", 1, 0, false);
        declareFunction(me, "constant_external_id", "CONSTANT-EXTERNAL-ID", 1, 0, false);
        declareFunction(me, "constant_name_from_internal_id", "CONSTANT-NAME-FROM-INTERNAL-ID", 1, 0, false);
        declareFunction(me, "find_constant_by_external_id", "FIND-CONSTANT-BY-EXTERNAL-ID", 1, 0, false);
        declareFunction(me, "constant_external_id_p", "CONSTANT-EXTERNAL-ID-P", 1, 0, false);
        declareFunction(me, "constant_has_external_id", "CONSTANT-HAS-EXTERNAL-ID", 2, 0, false);
        declareFunction(me, "constant_external_id_L", "CONSTANT-EXTERNAL-ID-<", 2, 0, false);
        declareFunction(me, "constant_info_from_guid_strings", "CONSTANT-INFO-FROM-GUID-STRINGS", 1, 0, false);
        declareFunction(me, "constant_info_from_name_strings", "CONSTANT-INFO-FROM-NAME-STRINGS", 1, 0, false);
        declareFunction(me, "make_constant_external_id", "MAKE-CONSTANT-EXTERNAL-ID", 0, 0, false);
        declareFunction(me, "make_skolem_id", "MAKE-SKOLEM-ID", 0, 0, false);
        declareFunction(me, "make_constant_guid", "MAKE-CONSTANT-GUID", 0, 0, false);
        declareFunction(me, "make_constant_legacy_guid", "MAKE-CONSTANT-LEGACY-GUID", 1, 0, false);
        declareFunction(me, "constant_guid_to_legacy_id", "CONSTANT-GUID-TO-LEGACY-ID", 1, 0, false);
        declareFunction(me, "constant_legacy_id", "CONSTANT-LEGACY-ID", 1, 0, false);
        declareFunction(me, "find_constant_by_legacy_id", "FIND-CONSTANT-BY-LEGACY-ID", 1, 0, false);
        declareFunction(me, "constant_legacy_id_p", "CONSTANT-LEGACY-ID-P", 1, 0, false);
        declareFunction(me, "unnamed_constant_p", "UNNAMED-CONSTANT-P", 1, 0, false);
        declareFunction(me, "constant_namespace", "CONSTANT-NAMESPACE", 1, 0, false);
        declareFunction(me, "constant_name_within_namespace", "CONSTANT-NAME-WITHIN-NAMESPACE", 1, 0, false);
        declareFunction(me, "random_constant", "RANDOM-CONSTANT", 0, 1, false);
        declareFunction(me, "sample_constants", "SAMPLE-CONSTANTS", 0, 3, false);
        declareFunction(me, "constant_grep", "CONSTANT-GREP", 1, 2, false);
        declareFunction(me, "constant_grep_pattern", "CONSTANT-GREP-PATTERN", 1, 1, false);
        declareFunction(me, "constant_checkpoint_p", "CONSTANT-CHECKPOINT-P", 1, 0, false);
        declareFunction(me, "new_constant_checkpoint", "NEW-CONSTANT-CHECKPOINT", 0, 0, false);
        declareFunction(me, "constant_checkpoint_currentP", "CONSTANT-CHECKPOINT-CURRENT?", 1, 0, false);
        declareFunction(me, "constant_dump_id", "CONSTANT-DUMP-ID", 1, 0, false);
        declareFunction(me, "find_constant_by_dump_id", "FIND-CONSTANT-BY-DUMP-ID", 1, 0, false);
        declareMacro(me, "with_constant_dump_id_table", "WITH-CONSTANT-DUMP-ID-TABLE");
        declareFunction(me, "constant_dump_name", "CONSTANT-DUMP-NAME", 1, 0, false);
        declareMacro(me, "with_constant_name_obfuscation", "WITH-CONSTANT-NAME-OBFUSCATION");
        declareFunction(me, "constants_around_constant", "CONSTANTS-AROUND-CONSTANT", 1, 3, false);
        declareFunction(me, "constants_around", "CONSTANTS-AROUND", 1, 3, false);
        return NIL;
    }

    public static SubLObject init_constants_high_file() {
        defparameter("*CONSTANT-EXTERNAL-ID-EQUIVALENCE-MAP*", NIL);
        deflexical("*CONSTANT-LEGACY-GUID-DATE*", $list81);
        defparameter("*CONSTANT-DUMP-ID-TABLE*", NIL);
        defparameter("*CONSTANT-NAME-OBFUSCATION-FN*", NIL);
        return NIL;
    }

    public static SubLObject setup_constants_high_file() {
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

    
}

