package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.id_index.clear_id_index;
import static com.cyc.cycjava.cycl.id_index.fill_id_index_dense_space;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_enter;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_missing_ids;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_old_and_new_object_counts;
import static com.cyc.cycjava.cycl.id_index.id_index_remove;
import static com.cyc.cycjava.cycl.id_index.id_index_reserve;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.id_index.new_id_index;
import static com.cyc.cycjava.cycl.id_index.new_id_index_iterator;
import static com.cyc.cycjava.cycl.id_index.new_indirect_compact_id_index;
import static com.cyc.cycjava.cycl.id_index.optimize_id_index;
import static com.cyc.cycjava.cycl.id_index.set_id_index_next_id;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_hl_support_handles extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new kb_hl_support_handles();

    public static final String myName = "com.cyc.cycjava_2.cycl.kb_hl_support_handles";


    // defconstant
    public static final SubLSymbol $dtp_kb_hl_support$ = makeSymbol("*DTP-KB-HL-SUPPORT*");

    // defparameter
    public static final SubLSymbol $print_kb_hl_support_hl_supportP$ = makeSymbol("*PRINT-KB-HL-SUPPORT-HL-SUPPORT?*");

    private static final SubLSymbol $kb_hl_supports_from_ids$ = makeSymbol("*KB-HL-SUPPORTS-FROM-IDS*");

    private static final SubLSymbol KB_HL_SUPPORTS_TABLE_TUPLE_TO_KB_HL_SUPPORT = makeSymbol("KB-HL-SUPPORTS-TABLE-TUPLE-TO-KB-HL-SUPPORT");

    private static final SubLList $list2 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc KB HL supports")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list3 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLString $$$mapping_Cyc_KB_HL_supports = makeString("mapping Cyc KB HL supports");

    private static final SubLSymbol $sym8$S_ID = makeUninternedSymbol("S-ID");

    private static final SubLSymbol $sym9$S_HANDLE = makeUninternedSymbol("S-HANDLE");

    private static final SubLList $list11 = list(makeSymbol("DO-KB-HL-SUPPORTS-TABLE"));

    private static final SubLSymbol RESOLVE_KB_HL_SUPPORT_ID_VALUE_PAIR = makeSymbol("RESOLVE-KB-HL-SUPPORT-ID-VALUE-PAIR");

    private static final SubLSymbol DO_KB_HL_SUPPORTS = makeSymbol("DO-KB-HL-SUPPORTS");

    private static final SubLSymbol DO_KB_HL_SUPPORTS_TABLE = makeSymbol("DO-KB-HL-SUPPORTS-TABLE");

    private static final SubLList $list18 = list(makeSymbol("ID"), makeSymbol("PAYLOAD"));

    private static final SubLSymbol CREATE_KB_HL_SUPPORT_DUMP_ID_TABLE = makeSymbol("CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE");

    private static final SubLSymbol WITH_KB_HL_SUPPORT_DUMP_ID_TABLE = makeSymbol("WITH-KB-HL-SUPPORT-DUMP-ID-TABLE");

    private static final SubLSymbol $new_kb_hl_support_id_threshold$ = makeSymbol("*NEW-KB-HL-SUPPORT-ID-THRESHOLD*");

    private static final SubLString $str23$Determining_maximum_KB_HL_support = makeString("Determining maximum KB HL support ID");

    private static final SubLList $list26 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");

    private static final SubLList $list28 = list(makeSymbol("NEW-KB-HL-SUPPORT-ID-THRESHOLD"));

    private static final SubLSymbol DO_KB_SUID_TABLE_STARTING_AT_ID = makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");

    private static final SubLList $list32 = list(makeSymbol("ID"));

    private static final SubLList $list33 = list(makeKeyword("ID"));

    private static final SubLList $list34 = list(makeSymbol("KB-HLS-ID"));

    private static final SubLList $list35 = list(makeSymbol("_CSETF-KB-HLS-ID"));

    private static final SubLSymbol PRINT_KB_HL_SUPPORT = makeSymbol("PRINT-KB-HL-SUPPORT");

    private static final SubLSymbol KB_HL_SUPPORT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-HL-SUPPORT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list38 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KB-HL-SUPPORT-P"));

    private static final SubLSymbol KB_HLS_ID = makeSymbol("KB-HLS-ID");

    private static final SubLSymbol _CSETF_KB_HLS_ID = makeSymbol("_CSETF-KB-HLS-ID");

    private static final SubLString $str42$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_KB_HL_SUPPORT = makeSymbol("MAKE-KB-HL-SUPPORT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KB_HL_SUPPORT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KB-HL-SUPPORT-METHOD");

    private static final SubLString $str48$_The_CFASL_invalid_KB_HL_support_ = makeString("<The CFASL invalid KB HL support>");

    private static final SubLString $str49$___s_ = makeString("#<~s>");

    private static final SubLString $str50$__KB_HL_SUPPORT__s_ = makeString("#<KB HL SUPPORT ~s>");

    private static final SubLInteger $int$787 = makeInteger(787);

    private static final SubLSymbol SXHASH_KB_HL_SUPPORT_METHOD = makeSymbol("SXHASH-KB-HL-SUPPORT-METHOD");

    private static final SubLList $list53 = list(makeSymbol("OBJECT"));

    private static final SubLString $str54$Return_T_iff_OBJECT_is_a_CycL_KB_ = makeString("Return T iff OBJECT is a CycL KB HL support");

    private static final SubLList $list55 = list(makeSymbol("BOOLEANP"));

    private static final SubLString $$$Freeing_KB_HL_supports = makeString("Freeing KB HL supports");

    public static SubLObject new_kb_hl_supports_iterator() {
	return iteration.new_indirect_iterator(new_id_index_iterator($kb_hl_supports_from_ids$.getGlobalValue()), KB_HL_SUPPORTS_TABLE_TUPLE_TO_KB_HL_SUPPORT, UNPROVIDED);
    }

    public static SubLObject do_kb_hl_supports(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list2);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject var = NIL;
	destructuring_bind_must_consp(current, datum, $list2);
	var = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$1 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list2);
	    current_$1 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list2);
	    if (NIL == member(current_$1, $list3, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$1 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list2);
	}
	final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
	final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_Cyc_KB_HL_supports;
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject s_id = $sym8$S_ID;
	final SubLObject s_handle = $sym9$S_HANDLE;
	return list(DO_ID_INDEX, list(new SubLObject[] { s_id, s_handle, $list11, $PROGRESS_MESSAGE, progress_message, $ORDERED, T, $DONE, done }), listS(CLET, list(list(var, list(RESOLVE_KB_HL_SUPPORT_ID_VALUE_PAIR, s_id, s_handle))), append(body, NIL)));
    }

    public static SubLObject resolve_kb_hl_support_id_value_pair(final SubLObject id, SubLObject support) {
	if ($PAGED_OUT == support) {
	    support = find_kb_hl_support_by_id(id);
	}
	return support;
    }

    public static SubLObject do_kb_hl_supports_table() {
	return $kb_hl_supports_from_ids$.getGlobalValue();
    }

    public static SubLObject kb_hl_supports_table_tuple_to_kb_hl_support(final SubLObject tuple) {
	SubLObject id = NIL;
	SubLObject payload = NIL;
	destructuring_bind_must_consp(tuple, tuple, $list18);
	id = tuple.first();
	SubLObject current = tuple.rest();
	destructuring_bind_must_consp(current, tuple, $list18);
	payload = current.first();
	current = current.rest();
	if (NIL == current) {
	    return find_kb_hl_support_by_id(id);
	}
	cdestructuring_bind_error(tuple, $list18);
	return NIL;
    }

    public static SubLObject kb_hl_support_argument_int(final SubLObject kb_hl_support) {
	final SubLObject content = kb_hl_supports_low.kb_hl_support_content(kb_hl_support);
	final SubLObject argument = kb_hl_supports_low.kb_hl_support_content_get_argument(content);
	return argument;
    }

    public static SubLObject kb_hl_support_arguments_int(final SubLObject kb_hl_support) {
	final SubLObject content = kb_hl_supports_low.kb_hl_support_content(kb_hl_support);
	final SubLObject argument = kb_hl_supports_low.kb_hl_support_content_get_argument(content);
	return list(argument);
    }

    public static SubLObject kb_hl_support_dependents_int(final SubLObject kb_hl_support) {
	final SubLObject content = kb_hl_supports_low.kb_hl_support_content(kb_hl_support);
	final SubLObject dependents = kb_hl_supports_low.kb_hl_support_content_get_dependents(content);
	return set_contents.set_contents_element_list(dependents);
    }

    public static SubLObject setup_kb_hl_support_index_table() {
	if (NIL != kb_hl_supports_low.$kb_hl_support_index$.getGlobalValue()) {
	    return NIL;
	}
	kb_hl_supports_low.$kb_hl_support_index$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
	return T;
    }

    public static SubLObject setup_kb_hl_support_id_tables(final SubLObject size, final SubLObject exactP) {
	if (NIL == $kb_hl_supports_from_ids$.getGlobalValue()) {
	    $kb_hl_supports_from_ids$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
	}
	kb_hl_support_manager.setup_kb_hl_support_content_table(size, exactP);
	return NIL;
    }

    public static SubLObject finalize_kb_hl_supports(SubLObject max_kb_hl_support_id) {
	if (max_kb_hl_support_id == UNPROVIDED) {
	    max_kb_hl_support_id = NIL;
	}
	set_next_kb_hl_support_id(max_kb_hl_support_id);
	set_new_kb_hl_support_id_threshold(next_kb_hl_support_id());
	if (NIL == max_kb_hl_support_id) {
	    optimize_kb_hl_support_id_tables();
	}
	return NIL;
    }

    public static SubLObject optimize_kb_hl_support_id_tables() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
	try {
	    Storage.$current_area$.bind(Storage.get_static_area(), thread);
	    optimize_id_index($kb_hl_supports_from_ids$.getGlobalValue(), UNPROVIDED);
	    kb_hl_support_manager.optimize_kb_hl_support_content_table(id_index_count($kb_hl_supports_from_ids$.getGlobalValue()));
	} finally {
	    Storage.$current_area$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static SubLObject clear_kb_hl_support_id_tables() {
	clear_id_index($kb_hl_supports_from_ids$.getGlobalValue());
	kb_hl_support_manager.clear_kb_hl_support_content_table();
	return NIL;
    }

    public static SubLObject create_kb_hl_support_dump_id_table() {
	return new_indirect_compact_id_index($kb_hl_supports_from_ids$.getGlobalValue());
    }

    public static SubLObject kb_hl_support_count() {
	return NIL != $kb_hl_supports_from_ids$.getGlobalValue() ? id_index_count($kb_hl_supports_from_ids$.getGlobalValue()) : ZERO_INTEGER;
    }

    public static SubLObject lookup_kb_hl_support_by_id(final SubLObject id) {
	final SubLObject support = id_index_lookup($kb_hl_supports_from_ids$.getGlobalValue(), id, UNPROVIDED);
	if (NIL == support) {
	    return NIL;
	}
	if ($PAGED_OUT == support) {
	    return make_kb_hl_support_shell(id);
	}
	return support;
    }

    public static SubLObject next_kb_hl_support_id() {
	return id_index_next_id($kb_hl_supports_from_ids$.getGlobalValue());
    }

    public static SubLObject new_kb_hl_support_id_threshold() {
	return NIL != $new_kb_hl_support_id_threshold$.getGlobalValue() ? $new_kb_hl_support_id_threshold$.getGlobalValue() : kb_hl_support_manager.get_file_backed_kb_hl_support_id_threshold();
    }

    public static SubLObject set_new_kb_hl_support_id_threshold(final SubLObject id) {
	$new_kb_hl_support_id_threshold$.setGlobalValue(id);
	return id;
    }

    public static SubLObject old_kb_hl_support_count() {
	return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), id_index_old_and_new_object_counts(do_kb_hl_supports_table(), new_kb_hl_support_id_threshold()));
    }

    public static SubLObject new_kb_hl_support_count() {
	return nth_value_step_2(nth_value_step_1(ONE_INTEGER), id_index_old_and_new_object_counts(do_kb_hl_supports_table(), new_kb_hl_support_id_threshold()));
    }

    public static SubLObject missing_kb_hl_support_id_set() {
	return set_utilities.construct_set_from_list(id_index_missing_ids(do_kb_hl_supports_table(), $ALL, UNPROVIDED), EQL, UNPROVIDED);
    }

    public static SubLObject set_next_kb_hl_support_id(SubLObject max_kb_hl_support_id) {
	if (max_kb_hl_support_id == UNPROVIDED) {
	    max_kb_hl_support_id = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject max = MINUS_ONE_INTEGER;
	if (NIL != max_kb_hl_support_id) {
	    max = max_kb_hl_support_id;
	} else {
	    final SubLObject idx = do_kb_hl_supports_table();
	    final SubLObject mess = $str23$Determining_maximum_KB_HL_support;
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
		    final SubLObject idx_$2 = idx;
		    if (NIL == id_index_objects_empty_p(idx_$2, $SKIP)) {
			final SubLObject idx_$3 = idx_$2;
			if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
			    final SubLObject vector_var = id_index_dense_objects(idx_$3);
			    final SubLObject backwardP_var = NIL;
			    SubLObject length;
			    SubLObject v_iteration;
			    SubLObject s_id;
			    SubLObject s_handle;
			    SubLObject kb_hl_support;
			    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
				s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
				s_handle = aref(vector_var, s_id);
				if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
				    if (NIL != id_index_tombstone_p(s_handle)) {
					s_handle = $SKIP;
				    }
				    kb_hl_support = resolve_kb_hl_support_id_value_pair(s_id, s_handle);
				    max = max(max, kb_hl_support_id(kb_hl_support));
				    sofar = add(sofar, ONE_INTEGER);
				    note_percent_progress(sofar, total);
				}
			    }
			}
			final SubLObject idx_$4 = idx_$2;
			if ((NIL == id_index_sparse_objects_empty_p(idx_$4)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			    final SubLObject sparse = id_index_sparse_objects(idx_$4);
			    SubLObject s_id2 = id_index_sparse_id_threshold(idx_$4);
			    final SubLObject end_id = id_index_next_id(idx_$4);
			    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
			    while (s_id2.numL(end_id)) {
				final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
				if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
				    final SubLObject kb_hl_support2 = resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
				    max = max(max, kb_hl_support_id(kb_hl_support2));
				    sofar = add(sofar, ONE_INTEGER);
				    note_percent_progress(sofar, total);
				}
				s_id2 = add(s_id2, ONE_INTEGER);
			    }
			}
		    }
		} finally {
		    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values = getValuesAsVector();
			noting_percent_progress_postamble();
			restoreValuesFromVector(_values);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
		    }
		}
	    } finally {
		$percent_progress_start_time$.rebind(_prev_bind_4, thread);
		$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
		$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
		$last_percent_progress_index$.rebind(_prev_bind_0, thread);
	    }
	}
	final SubLObject next_id = add(max, ONE_INTEGER);
	set_id_index_next_id($kb_hl_supports_from_ids$.getGlobalValue(), next_id);
	return next_id;
    }

    public static SubLObject register_kb_hl_support_id(final SubLObject id, final SubLObject kb_hl_support) {
	reset_kb_hl_support_id(kb_hl_support, id);
	return id_index_enter($kb_hl_supports_from_ids$.getGlobalValue(), id, kb_hl_support);
    }

    public static SubLObject deregister_kb_hl_support_id(final SubLObject id) {
	return id_index_remove($kb_hl_supports_from_ids$.getGlobalValue(), id);
    }

    public static SubLObject make_kb_hl_support_id() {
	return id_index_reserve($kb_hl_supports_from_ids$.getGlobalValue());
    }

    public static SubLObject do_old_kb_hl_supports(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list26);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject var = NIL;
	destructuring_bind_must_consp(current, datum, $list26);
	var = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$6 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list26);
	    current_$6 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list26);
	    if (NIL == member(current_$6, $list3, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$6 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list26);
	}
	final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
	final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return listS(DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, list(var, $list11, $list28, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_new_kb_hl_supports(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list26);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject var = NIL;
	destructuring_bind_must_consp(current, datum, $list26);
	var = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$7 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list26);
	    current_$7 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list26);
	    if (NIL == member(current_$7, $list3, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$7 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list26);
	}
	final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
	final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(var, $list11, $list28, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
    }

    public static SubLObject kb_hl_support_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	print_kb_hl_support(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject kb_hl_support_p(final SubLObject v_object) {
	return v_object.getClass() == $kb_hl_support_native.class ? T : NIL;
    }

    public static SubLObject kb_hls_id(final SubLObject v_object) {
	assert NIL != kb_hl_support_p(v_object) : "kb_hl_support_handles.kb_hl_support_p error :" + v_object;
	return v_object.getField2();
    }

    public static SubLObject _csetf_kb_hls_id(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_hl_support_p(v_object) : "kb_hl_support_handles.kb_hl_support_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static SubLObject make_kb_hl_support(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $kb_hl_support_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($ID)) {
		_csetf_kb_hls_id(v_new, current_value);
	    } else {
		Errors.error($str42$Invalid_slot__S_for_construction_, current_arg);
	    }
	}
	return v_new;
    }

    public static SubLObject visit_defstruct_kb_hl_support(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_KB_HL_SUPPORT, ONE_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $ID, kb_hls_id(obj));
	funcall(visitor_fn, obj, $END, MAKE_KB_HL_SUPPORT, ONE_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_kb_hl_support_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_kb_hl_support(obj, visitor_fn);
    }

    public static SubLObject print_kb_hl_support(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (v_object.eql(cfasl_kb_methods.cfasl_invalid_kb_hl_support())) {
	    format(stream, $str48$_The_CFASL_invalid_KB_HL_support_);
	} else if ((NIL != $print_kb_hl_support_hl_supportP$.getDynamicValue(thread)) && (NIL != valid_kb_hl_supportP(v_object, UNPROVIDED))) {
	    format(stream, $str49$___s_, kb_hl_supports_low.kb_hl_support_hl_support_int(v_object));
	} else {
	    format(stream, $str50$__KB_HL_SUPPORT__s_, kb_hls_id(v_object));
	}

	return v_object;
    }

    public static SubLObject sxhash_kb_hl_support_method(final SubLObject v_object) {
	final SubLObject id = kb_hls_id(v_object);
	return id.isInteger() ? id : $int$787;
    }

    public static SubLObject get_kb_hl_support() {
	SubLObject kb_hl_support = NIL;
	kb_hl_support = make_kb_hl_support(UNPROVIDED);
	return kb_hl_support;
    }

    public static SubLObject new_kb_hl_support(final SubLObject id) {
	SubLObject kb_hl_support = NIL;
	kb_hl_support = make_kb_hl_support(UNPROVIDED);
	_csetf_kb_hls_id(kb_hl_support, id);
	return kb_hl_support;
    }

    public static SubLObject free_kb_hl_support(final SubLObject kb_hl_support) {
	_csetf_kb_hls_id(kb_hl_support, NIL);
	return kb_hl_support;
    }

    public static SubLObject kb_hl_support_get_id(final SubLObject kb_hl_support) {
	return kb_hls_id(kb_hl_support);
    }

    public static SubLObject hl_justify_for_kb_hl_support(final SubLObject hl_support) {
	return remove(hl_support, hl_supports.hl_support_justify(hl_support), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject valid_kb_hl_support_handleP(final SubLObject v_object) {
	return makeBoolean((NIL != kb_hl_support_p(v_object)) && (NIL != kb_hl_support_handle_validP(v_object)));
    }

    public static SubLObject valid_kb_hl_supportP(final SubLObject v_object, SubLObject robustP) {
	if (robustP == UNPROVIDED) {
	    robustP = NIL;
	}
	return makeBoolean((NIL != valid_kb_hl_support_handleP(v_object)) && ((NIL == robustP) || (NIL != kb_hl_supports_low.valid_kb_hl_support_contentP(kb_hl_supports_low.kb_hl_support_content(v_object), robustP))));
    }

    public static SubLObject mark_available_kb_hl_supports(final SubLObject max_id, SubLObject deleted_set) {
	if (deleted_set == UNPROVIDED) {
	    deleted_set = NIL;
	}
	fill_id_index_dense_space($kb_hl_supports_from_ids$.getGlobalValue(), $PAGED_OUT, max_id);
	if (NIL != set.set_p(deleted_set)) {
	    final SubLObject set_contents_var = set.do_set_internal(deleted_set);
	    SubLObject basis_object;
	    SubLObject state;
	    SubLObject deleted_id;
	    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		    state); state = set_contents.do_set_contents_update_state(state)) {
		deleted_id = set_contents.do_set_contents_next(basis_object, state);
		if (NIL != set_contents.do_set_contents_element_validP(state, deleted_id)) {
		    id_index_remove($kb_hl_supports_from_ids$.getGlobalValue(), deleted_id);
		}
	    }
	}
	return max_id;
    }

    public static SubLObject make_kb_hl_support_shell(SubLObject id) {
	if (NIL == id) {
	    id = make_kb_hl_support_id();
	}
	assert NIL != fixnump(id) : "Types.fixnump(id) " + "CommonSymbols.NIL != Types.fixnump(id) " + id;
	final SubLObject kb_hl_support = get_kb_hl_support();
	register_kb_hl_support_id(id, kb_hl_support);
	return kb_hl_support;
    }

    public static SubLObject create_sample_invalid_kb_hl_support() {
	return make_kb_hl_support(UNPROVIDED);
    }

    public static SubLObject partition_create_invalid_kb_hl_support() {
	return make_kb_hl_support(UNPROVIDED);
    }

    public static SubLObject free_all_kb_hl_support() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	kb_hl_supports_low.clear_kb_hl_support_index();
	final SubLObject idx = do_kb_hl_supports_table();
	final SubLObject mess = $$$Freeing_KB_HL_supports;
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
		final SubLObject idx_$8 = idx;
		if (NIL == id_index_objects_empty_p(idx_$8, $SKIP)) {
		    final SubLObject idx_$9 = idx_$8;
		    if (NIL == id_index_dense_objects_empty_p(idx_$9, $SKIP)) {
			final SubLObject vector_var = id_index_dense_objects(idx_$9);
			final SubLObject backwardP_var = NIL;
			SubLObject length;
			SubLObject v_iteration;
			SubLObject s_id;
			SubLObject s_handle;
			SubLObject kb_hl_support;
			SubLObject content;
			for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			    s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			    s_handle = aref(vector_var, s_id);
			    if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
				if (NIL != id_index_tombstone_p(s_handle)) {
				    s_handle = $SKIP;
				}
				kb_hl_support = resolve_kb_hl_support_id_value_pair(s_id, s_handle);
				content = kb_hl_supports_low.kb_hl_support_content(kb_hl_support);
				free_kb_hl_support(kb_hl_support);
				if (NIL != content) {
				    kb_hl_supports_low.free_kb_hl_support_content(content);
				}
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			}
		    }
		    final SubLObject idx_$10 = idx_$8;
		    if ((NIL == id_index_sparse_objects_empty_p(idx_$10)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			final SubLObject sparse = id_index_sparse_objects(idx_$10);
			SubLObject s_id2 = id_index_sparse_id_threshold(idx_$10);
			final SubLObject end_id = id_index_next_id(idx_$10);
			final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
			while (s_id2.numL(end_id)) {
			    final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
			    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
				final SubLObject kb_hl_support2 = resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
				final SubLObject content2 = kb_hl_supports_low.kb_hl_support_content(kb_hl_support2);
				free_kb_hl_support(kb_hl_support2);
				if (NIL != content2) {
				    kb_hl_supports_low.free_kb_hl_support_content(content2);
				}
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			    s_id2 = add(s_id2, ONE_INTEGER);
			}
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
		}
	    }
	} finally {
	    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
	    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
	    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
	    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
	}
	clear_kb_hl_support_id_tables();
	return NIL;
    }

    public static SubLObject kb_hl_support_id(final SubLObject kb_hl_support) {
	return kb_hl_support_get_id(kb_hl_support);
    }

    public static SubLObject reset_kb_hl_support_id(final SubLObject kb_hl_support, final SubLObject new_id) {
	_csetf_kb_hls_id(kb_hl_support, new_id);
	return kb_hl_support;
    }

    public static SubLObject kb_hl_support_handle_validP(final SubLObject kb_hl_support) {
	return integerp(kb_hl_support_get_id(kb_hl_support));
    }

    public static SubLObject find_kb_hl_support_by_id(final SubLObject id) {
	return lookup_kb_hl_support_by_id(id);
    }

    public static SubLObject declare_kb_hl_support_handles_file() {
	declareFunction("new_kb_hl_supports_iterator", "NEW-KB-HL-SUPPORTS-ITERATOR", 0, 0, false);
	declareMacro("do_kb_hl_supports", "DO-KB-HL-SUPPORTS");
	declareFunction("resolve_kb_hl_support_id_value_pair", "RESOLVE-KB-HL-SUPPORT-ID-VALUE-PAIR", 2, 0, false);
	declareFunction("do_kb_hl_supports_table", "DO-KB-HL-SUPPORTS-TABLE", 0, 0, false);
	declareFunction("kb_hl_supports_table_tuple_to_kb_hl_support", "KB-HL-SUPPORTS-TABLE-TUPLE-TO-KB-HL-SUPPORT", 1, 0, false);
	declareFunction("kb_hl_support_argument_int", "KB-HL-SUPPORT-ARGUMENT-INT", 1, 0, false);
	declareFunction("kb_hl_support_arguments_int", "KB-HL-SUPPORT-ARGUMENTS-INT", 1, 0, false);
	declareFunction("kb_hl_support_dependents_int", "KB-HL-SUPPORT-DEPENDENTS-INT", 1, 0, false);
	declareFunction("setup_kb_hl_support_index_table", "SETUP-KB-HL-SUPPORT-INDEX-TABLE", 0, 0, false);
	declareFunction("setup_kb_hl_support_id_tables", "SETUP-KB-HL-SUPPORT-ID-TABLES", 2, 0, false);
	declareFunction("finalize_kb_hl_supports", "FINALIZE-KB-HL-SUPPORTS", 0, 1, false);
	declareFunction("optimize_kb_hl_support_id_tables", "OPTIMIZE-KB-HL-SUPPORT-ID-TABLES", 0, 0, false);
	declareFunction("clear_kb_hl_support_id_tables", "CLEAR-KB-HL-SUPPORT-ID-TABLES", 0, 0, false);
	declareFunction("create_kb_hl_support_dump_id_table", "CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE", 0, 0, false);
	declareFunction("kb_hl_support_count", "KB-HL-SUPPORT-COUNT", 0, 0, false);
	declareFunction("lookup_kb_hl_support_by_id", "LOOKUP-KB-HL-SUPPORT-BY-ID", 1, 0, false);
	declareFunction("next_kb_hl_support_id", "NEXT-KB-HL-SUPPORT-ID", 0, 0, false);
	declareFunction("new_kb_hl_support_id_threshold", "NEW-KB-HL-SUPPORT-ID-THRESHOLD", 0, 0, false);
	declareFunction("set_new_kb_hl_support_id_threshold", "SET-NEW-KB-HL-SUPPORT-ID-THRESHOLD", 1, 0, false);
	declareFunction("old_kb_hl_support_count", "OLD-KB-HL-SUPPORT-COUNT", 0, 0, false);
	declareFunction("new_kb_hl_support_count", "NEW-KB-HL-SUPPORT-COUNT", 0, 0, false);
	declareFunction("missing_kb_hl_support_id_set", "MISSING-KB-HL-SUPPORT-ID-SET", 0, 0, false);
	declareFunction("set_next_kb_hl_support_id", "SET-NEXT-KB-HL-SUPPORT-ID", 0, 1, false);
	declareFunction("register_kb_hl_support_id", "REGISTER-KB-HL-SUPPORT-ID", 2, 0, false);
	declareFunction("deregister_kb_hl_support_id", "DEREGISTER-KB-HL-SUPPORT-ID", 1, 0, false);
	declareFunction("make_kb_hl_support_id", "MAKE-KB-HL-SUPPORT-ID", 0, 0, false);
	declareMacro("do_old_kb_hl_supports", "DO-OLD-KB-HL-SUPPORTS");
	declareMacro("do_new_kb_hl_supports", "DO-NEW-KB-HL-SUPPORTS");
	declareFunction("kb_hl_support_print_function_trampoline", "KB-HL-SUPPORT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("kb_hl_support_p", "KB-HL-SUPPORT-P", 1, 0, false);
	new kb_hl_support_handles.$kb_hl_support_p$UnaryFunction();
	declareFunction("kb_hls_id", "KB-HLS-ID", 1, 0, false);
	declareFunction("_csetf_kb_hls_id", "_CSETF-KB-HLS-ID", 2, 0, false);
	declareFunction("make_kb_hl_support", "MAKE-KB-HL-SUPPORT", 0, 1, false);
	declareFunction("visit_defstruct_kb_hl_support", "VISIT-DEFSTRUCT-KB-HL-SUPPORT", 2, 0, false);
	declareFunction("visit_defstruct_object_kb_hl_support_method", "VISIT-DEFSTRUCT-OBJECT-KB-HL-SUPPORT-METHOD", 2, 0, false);
	declareFunction("print_kb_hl_support", "PRINT-KB-HL-SUPPORT", 3, 0, false);
	declareFunction("sxhash_kb_hl_support_method", "SXHASH-KB-HL-SUPPORT-METHOD", 1, 0, false);
	new kb_hl_support_handles.$sxhash_kb_hl_support_method$UnaryFunction();
	declareFunction("get_kb_hl_support", "GET-KB-HL-SUPPORT", 0, 0, false);
	declareFunction("new_kb_hl_support", "NEW-KB-HL-SUPPORT", 1, 0, false);
	declareFunction("free_kb_hl_support", "FREE-KB-HL-SUPPORT", 1, 0, false);
	declareFunction("kb_hl_support_get_id", "KB-HL-SUPPORT-GET-ID", 1, 0, false);
	declareFunction("hl_justify_for_kb_hl_support", "HL-JUSTIFY-FOR-KB-HL-SUPPORT", 1, 0, false);
	declareFunction("valid_kb_hl_support_handleP", "VALID-KB-HL-SUPPORT-HANDLE?", 1, 0, false);
	declareFunction("valid_kb_hl_supportP", "VALID-KB-HL-SUPPORT?", 1, 1, false);
	declareFunction("mark_available_kb_hl_supports", "MARK-AVAILABLE-KB-HL-SUPPORTS", 1, 1, false);
	declareFunction("make_kb_hl_support_shell", "MAKE-KB-HL-SUPPORT-SHELL", 1, 0, false);
	declareFunction("create_sample_invalid_kb_hl_support", "CREATE-SAMPLE-INVALID-KB-HL-SUPPORT", 0, 0, false);
	declareFunction("partition_create_invalid_kb_hl_support", "PARTITION-CREATE-INVALID-KB-HL-SUPPORT", 0, 0, false);
	declareFunction("free_all_kb_hl_support", "FREE-ALL-KB-HL-SUPPORT", 0, 0, false);
	declareFunction("kb_hl_support_id", "KB-HL-SUPPORT-ID", 1, 0, false);
	declareFunction("reset_kb_hl_support_id", "RESET-KB-HL-SUPPORT-ID", 2, 0, false);
	declareFunction("kb_hl_support_handle_validP", "KB-HL-SUPPORT-HANDLE-VALID?", 1, 0, false);
	declareFunction("find_kb_hl_support_by_id", "FIND-KB-HL-SUPPORT-BY-ID", 1, 0, false);
	return NIL;
    }

    public static SubLObject init_kb_hl_support_handles_file() {
	deflexical("*KB-HL-SUPPORTS-FROM-IDS*", SubLTrampolineFile.maybeDefault($kb_hl_supports_from_ids$, $kb_hl_supports_from_ids$, NIL));
	deflexical("*NEW-KB-HL-SUPPORT-ID-THRESHOLD*", SubLTrampolineFile.maybeDefault($new_kb_hl_support_id_threshold$, $new_kb_hl_support_id_threshold$, NIL));
	defconstant("*DTP-KB-HL-SUPPORT*", KB_HL_SUPPORT);
	defparameter("*PRINT-KB-HL-SUPPORT-HL-SUPPORT?*", T);
	return NIL;
    }

    public static SubLObject setup_kb_hl_support_handles_file() {
	declare_defglobal($kb_hl_supports_from_ids$);
	register_macro_helper(RESOLVE_KB_HL_SUPPORT_ID_VALUE_PAIR, DO_KB_HL_SUPPORTS);
	register_macro_helper(DO_KB_HL_SUPPORTS_TABLE, DO_KB_HL_SUPPORTS);
	note_funcall_helper_function(KB_HL_SUPPORTS_TABLE_TUPLE_TO_KB_HL_SUPPORT);
	register_macro_helper(CREATE_KB_HL_SUPPORT_DUMP_ID_TABLE, WITH_KB_HL_SUPPORT_DUMP_ID_TABLE);
	declare_defglobal($new_kb_hl_support_id_threshold$);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_hl_support$.getGlobalValue(), symbol_function(KB_HL_SUPPORT_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list38);
	def_csetf(KB_HLS_ID, _CSETF_KB_HLS_ID);
	identity(KB_HL_SUPPORT);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_hl_support$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KB_HL_SUPPORT_METHOD));
	register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_kb_hl_support$.getGlobalValue(), symbol_function(SXHASH_KB_HL_SUPPORT_METHOD));
	register_cyc_api_function(KB_HL_SUPPORT_P, $list53, $str54$Return_T_iff_OBJECT_is_a_CycL_KB_, NIL, $list55);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_kb_hl_support_handles_file();
    }

    @Override
    public void initializeVariables() {
	init_kb_hl_support_handles_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_kb_hl_support_handles_file();
    }

    

    public static final class $kb_hl_support_native extends SubLStructNative {
	public SubLObject $id;

	private static final SubLStructDeclNative structDecl;

	private $kb_hl_support_native() {
	    this.$id = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return this.$id;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$id = value;
	}

	static {
	    structDecl = makeStructDeclNative($kb_hl_support_native.class, KB_HL_SUPPORT, KB_HL_SUPPORT_P, $list32, $list33, new String[] { "$id" }, $list34, $list35, PRINT_KB_HL_SUPPORT);
	}
    }

    public static final class $kb_hl_support_p$UnaryFunction extends UnaryFunction {
	public $kb_hl_support_p$UnaryFunction() {
	    super(extractFunctionNamed("KB-HL-SUPPORT-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return kb_hl_support_p(arg1);
	}
    }

    public static final class $sxhash_kb_hl_support_method$UnaryFunction extends UnaryFunction {
	public $sxhash_kb_hl_support_method$UnaryFunction() {
	    super(extractFunctionNamed("SXHASH-KB-HL-SUPPORT-METHOD"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return sxhash_kb_hl_support_method(arg1);
	}
    }
}

/**
 * Total time: 290 ms
 */
