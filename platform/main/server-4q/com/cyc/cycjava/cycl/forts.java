package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.forts.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;

import static com.cyc.cycjava.cycl.forts.*;

public final class forts extends SubLTranslatedFile {
	public static final SubLFile me = new forts();

	public static final String myName = "com.cyc.cycjava.cycl.forts";

	public static final String myFingerPrint = "47a6760ac485dc04bd675a1e4bcbcea0939054120725b20de7a998053e7d76d4";

	// defconstant
	public static final SubLSymbol $dtp_fort_id_index$ = makeSymbol("*DTP-FORT-ID-INDEX*");

	// defconstant
	private static final SubLSymbol $cfasl_opcode_fort_id_index$ = makeSymbol("*CFASL-OPCODE-FORT-ID-INDEX*");

	public static final SubLList $list1 = list(makeSymbol("OBJECT"));

	public static final SubLString $str2$Return_T_iff_OBJECT_is_a_first_or = makeString("Return T iff OBJECT is a first order reified term (FORT).");

	public static final SubLList $list3 = list(makeSymbol("BOOLEANP"));

	public static final SubLSymbol FORT_EL_FORMULA = makeSymbol("FORT-EL-FORMULA");

	public static final SubLList $list5 = list(makeSymbol("FORT"));

	public static final SubLString $str6$Return_the_EL_formula_for_any_FOR = makeString("Return the EL formula for any FORT.");

	public static final SubLList $list7 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")));

	public static final SubLList $list8 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSP")));

	public static final SubLList $list9 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc FORTs")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLString $$$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");

	public static final SubLList $list11 = list(makeKeyword("DONE"));

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	public static final SubLSymbol $sym14$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

	public static final SubLList $list16 = list(makeSymbol("DO-FORTS-TABLES"));

	public static final SubLSymbol $sym19$MESSAGE = makeUninternedSymbol("MESSAGE");

	public static final SubLSymbol $sym20$TOTAL = makeUninternedSymbol("TOTAL");

	public static final SubLSymbol $sym21$SOFAR = makeUninternedSymbol("SOFAR");

	public static final SubLList $list23 = list(list(makeSymbol("FORT-COUNT")));

	public static final SubLList $list24 = list(ZERO_INTEGER);

	public static final SubLSymbol DO_FORTS = makeSymbol("DO-FORTS");

	public static final SubLString $str29$Iterate_over_all_HL_FORT_datastru = makeString("Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the FORT.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts as soon as DONE becomes non-nil.");

	public static final SubLSymbol DO_FORTS_TABLES = makeSymbol("DO-FORTS-TABLES");

	public static final SubLSymbol FORT_COUNT = makeSymbol("FORT-COUNT");

	public static final SubLString $str32$Return_the_total_number_of_FORTs_ = makeString("Return the total number of FORTs.");

	public static final SubLList $list33 = list(makeSymbol("INTEGERP"));

	private static final SubLInteger $int$500 = makeInteger(500);

	private static final SubLString $str37$_S_was_not_a_FORT = makeString("~S was not a FORT");

	private static final SubLSymbol REMOVE_FORT = makeSymbol("REMOVE-FORT");

	private static final SubLString $str39$Remove_FORT_from_the_KB_ = makeString("Remove FORT from the KB.");

	public static final SubLList $list40 = list(makeSymbol("NULL"));

	private static final SubLSymbol FORT_ID_INDEX = makeSymbol("FORT-ID-INDEX");

	private static final SubLSymbol FORT_ID_INDEX_P = makeSymbol("FORT-ID-INDEX-P");

	public static final SubLList $list43 = list(makeSymbol("CONSTANTS"), makeSymbol("NARTS"));

	private static final SubLList $list44 = list(makeKeyword("CONSTANTS"), makeKeyword("NARTS"));

	private static final SubLList $list45 = list(makeSymbol("FORT-ID-INDEX-CONSTANTS"), makeSymbol("FORT-ID-INDEX-NARTS"));

	private static final SubLList $list46 = list(makeSymbol("_CSETF-FORT-ID-INDEX-CONSTANTS"), makeSymbol("_CSETF-FORT-ID-INDEX-NARTS"));

	private static final SubLSymbol PRINT_FORT_ID_INDEX = makeSymbol("PRINT-FORT-ID-INDEX");

	private static final SubLSymbol FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list49 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORT-ID-INDEX-P"));

	private static final SubLSymbol FORT_ID_INDEX_CONSTANTS = makeSymbol("FORT-ID-INDEX-CONSTANTS");

	private static final SubLSymbol _CSETF_FORT_ID_INDEX_CONSTANTS = makeSymbol("_CSETF-FORT-ID-INDEX-CONSTANTS");

	private static final SubLSymbol FORT_ID_INDEX_NARTS = makeSymbol("FORT-ID-INDEX-NARTS");

	private static final SubLSymbol _CSETF_FORT_ID_INDEX_NARTS = makeSymbol("_CSETF-FORT-ID-INDEX-NARTS");

	private static final SubLString $str56$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	private static final SubLSymbol MAKE_FORT_ID_INDEX = makeSymbol("MAKE-FORT-ID-INDEX");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORT-ID-INDEX-METHOD");

	private static final SubLString $str62$Constant_Index_ = makeString("Constant Index:");

	private static final SubLString $str63$Nart_Index_ = makeString("Nart Index:");

	private static final SubLList $list64 = list(list(makeSymbol("ID-INDEX-VAR"), makeSymbol("ID-VAR"), makeSymbol("FORT"), makeSymbol("FORT-ID-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list67 = list(makeSymbol("FORT-P"));

	private static final SubLList $list68 = list(makeSymbol("FORT-ID-INDEX-P"));

	private static final SubLSymbol $sym70$VALID_FORT_ = makeSymbol("VALID-FORT?");

	private static final SubLSymbol CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");

	private static final SubLSymbol NART_ID = makeSymbol("NART-ID");

	private static final SubLList $list75 = list(list(makeSymbol("FORT"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym76$FII = makeUninternedSymbol("FII");

	private static final SubLSymbol DO_FORT_ID_INDEX_CONSTANTS = makeSymbol("DO-FORT-ID-INDEX-CONSTANTS");

	private static final SubLSymbol DO_FORT_ID_INDEX_NARTS = makeSymbol("DO-FORT-ID-INDEX-NARTS");

	private static final SubLSymbol DO_FORT_ID_INDEX = makeSymbol("DO-FORT-ID-INDEX");

	private static final SubLList $list80 = list(list(makeSymbol("CONSTANT"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym81$ID = makeUninternedSymbol("ID");

	private static final SubLSymbol DO_FII_GET_CONSTANTS = makeSymbol("DO-FII-GET-CONSTANTS");

	private static final SubLList $list85 = list(list(makeSymbol("NART"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym86$ID = makeUninternedSymbol("ID");

	private static final SubLSymbol DO_FII_GET_NARTS = makeSymbol("DO-FII-GET-NARTS");

	private static final SubLSymbol FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");

	private static final SubLInteger $int$99 = makeInteger(99);

	private static final SubLSymbol CFASL_INPUT_FORT_ID_INDEX = makeSymbol("CFASL-INPUT-FORT-ID-INDEX");

	private static final SubLSymbol CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD");

	private static final SubLString $str93$Checking_that_forts_iterators_wor = makeString("Checking that forts iterators work.");

	private static final SubLSymbol $sym95$_EXIT = makeSymbol("%EXIT");

	private static final SubLString $str97$FORTS_ITERATOR_exhausted_before_D = makeString("FORTS-ITERATOR exhausted before DO-FORTS");

	private static final SubLString $str99$FORTS_ITERATOR_returned_non_fort_ = makeString("FORTS-ITERATOR returned non-fort!");

	private static final SubLString $str101$FORTS_ITERATOR_and_DO_FORTS_diffe = makeString("FORTS-ITERATOR and DO-FORTS differ in which FORT they think is next");

	private static final SubLString $str103$The_FORTS_iterator_has_more_value = makeString("The FORTS iterator has more values than DO-FORTS.");

	public static SubLObject fort_p(final SubLObject v_object) {
		return makeBoolean((NIL != constant_p(v_object)) || (NIL != nart_handles.nart_p(v_object)));
	}

	public static SubLObject non_fort_p(final SubLObject v_object) {
		return makeBoolean(NIL == fort_p(v_object));
	}

	public static SubLObject list_of_fort_p(final SubLObject v_object) {
		return list_utilities.list_of_type_p(FORT_P, v_object);
	}

	public static SubLObject fort_el_formula(final SubLObject fort) {
		SubLTrampolineFile.enforceType(fort, FORT_P);
		if (NIL != constant_p(fort)) {
			return fort;
		}
		return narts_high.nart_el_formula(fort);
	}

	public static SubLObject new_forts_iterator() {
		return iteration.new_iterator_iterator(list(new_constants_iterator(), nart_handles.new_narts_iterator()));
	}

	public static SubLObject do_forts(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list9);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = NIL;
		destructuring_bind_must_consp(current, datum, $list9);
		var = current.first();
		current = current.rest();
		final SubLObject progress_message = (current.isCons()) ? current.first() : $$$mapping_Cyc_FORTs;
		destructuring_bind_must_listp(current, datum, $list9);
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$1 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list9);
			current_$1 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list9);
			if (NIL == member(current_$1, $list11, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$1 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list9);
		}
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		if (NIL == progress_message) {
			final SubLObject table_var = $sym14$TABLE_VAR;
			return list(DO_LIST, list(table_var, $list16, $DONE, done), listS(DO_KB_SUID_TABLE, list(var, table_var, $PROGRESS_MESSAGE, NIL, $DONE, done), append(body, NIL)));
		}
		final SubLObject message = $sym19$MESSAGE;
		final SubLObject total = $sym20$TOTAL;
		final SubLObject sofar = $sym21$SOFAR;
		return list(CLET, list(list(message, progress_message), bq_cons(total, $list23), bq_cons(sofar, $list24)), list(NOTING_PERCENT_PROGRESS, message, listS(DO_FORTS, list(var, NIL, $DONE, done), list(CINC, sofar), list(NOTE_PERCENT_PROGRESS, sofar, total), append(body, NIL))));
	}

	public static SubLObject do_forts_tables() {
		return list(do_constants_table(), nart_handles.do_narts_table());
	}

	public static SubLObject fort_count() {
		return add(constant_count(), nart_handles.nart_count());
	}

	public static SubLObject random_fort(SubLObject test) {
		if (test == UNPROVIDED) {
			test = symbol_function(TRUE);
		}
		final SubLObject fort_count = fort_count();
		if (fort_count.numG(ZERO_INTEGER)) {
			final SubLObject constant_threshold = constant_count();
			SubLObject v_answer;
			SubLObject candidate;
			for (v_answer = NIL; NIL == v_answer; v_answer = candidate) {
				final SubLObject fort_type_indicator = random.random(fort_count);
				candidate = (fort_type_indicator.numL(constant_threshold)) ? constants_high.random_constant(UNPROVIDED) : narts_high.random_nart(UNPROVIDED);
				if ((NIL != candidate) && (NIL != funcall(test, candidate))) {
				}
			}
			return v_answer;
		}
		return NIL;
	}

	public static SubLObject sample_forts(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
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
				result = cons(random_fort(test), result);
			}
			return result;
		}
		SubLObject result;
		for (result = set_contents.new_set_contents(n, symbol_function(EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_fort(test), result, symbol_function(EQL))) {
		}
		return set_contents.set_contents_element_list(result);
	}

	public static SubLObject fort_index(final SubLObject fort) {
		if (NIL != constant_p(fort)) {
			return constants_low.constant_index(fort);
		}
		if (NIL != nart_handles.nart_p(fort)) {
			return narts_low.nart_index(fort);
		}
		Errors.error($str37$_S_was_not_a_FORT, fort);
		return NIL;
	}

	public static SubLObject reset_fort_index(final SubLObject fort, final SubLObject new_index) {
		assert NIL != fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
		if (NIL != constant_p(fort)) {
			return constants_low.reset_constant_index(fort, new_index);
		}
		return narts_low.reset_nart_index(fort, new_index);
	}

	public static SubLObject clear_fort_index(final SubLObject fort) {
		return reset_fort_index(fort, new_simple_index());
	}

	public static SubLObject fort_internal_id(final SubLObject fort) {
		if (NIL != constant_p(fort)) {
			return constants_high.constant_internal_id(fort);
		}
		return number_utilities.f_1_(minus(nart_handles.nart_id(fort)));
	}

	public static SubLObject fort_external_id(final SubLObject fort) {
		if (NIL != constant_p(fort)) {
			return constants_high.constant_external_id(fort);
		}
		return number_utilities.f_1_(minus(nart_handles.nart_id(fort)));
	}

	public static SubLObject valid_fortP(final SubLObject fort) {
		if (NIL != constant_p(fort)) {
			return valid_constantP(fort, UNPROVIDED);
		}
		if (NIL != nart_handles.nart_p(fort)) {
			return nart_handles.valid_nartP(fort, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject valid_fort_robustP(final SubLObject fort) {
		if (NIL != constant_p(fort)) {
			return valid_constant_robustP(fort);
		}
		if (NIL != nart_handles.nart_p(fort)) {
			return nart_handles.valid_nart_robustP(fort);
		}
		return NIL;
	}

	public static SubLObject invalid_fortP(final SubLObject fort) {
		if (NIL != constant_p(fort)) {
			return invalid_constantP(fort, UNPROVIDED);
		}
		if (NIL != nart_handles.nart_p(fort)) {
			return narts_high.invalid_nartP(fort, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject invalid_fort_robustP(final SubLObject fort) {
		if (NIL != constant_p(fort)) {
			return invalid_constant_robustP(fort);
		}
		if (NIL != nart_handles.nart_p(fort)) {
			return narts_high.invalid_nart_robustP(fort);
		}
		return NIL;
	}

	public static SubLObject remove_fort(final SubLObject fort) {
		SubLTrampolineFile.enforceType(fort, FORT_P);
		if (NIL != constant_p(fort)) {
			return constants_high.remove_constant(fort);
		}
		return narts_high.remove_nart(fort);
	}

	public static SubLObject fort_id_index_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		print_fort_id_index(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject fort_id_index_p(final SubLObject v_object) {
		return v_object.getClass() == $fort_id_index_native.class ? T : NIL;
	}

	public static SubLObject fort_id_index_constants(final SubLObject v_object) {
		assert NIL != fort_id_index_p(v_object) : "forts.fort_id_index_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject fort_id_index_narts(final SubLObject v_object) {
		assert NIL != fort_id_index_p(v_object) : "forts.fort_id_index_p error :" + v_object;
		return v_object.getField3();
	}

	public static SubLObject _csetf_fort_id_index_constants(final SubLObject v_object, final SubLObject value) {
		assert NIL != fort_id_index_p(v_object) : "forts.fort_id_index_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_fort_id_index_narts(final SubLObject v_object, final SubLObject value) {
		assert NIL != fort_id_index_p(v_object) : "forts.fort_id_index_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject make_fort_id_index(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new $fort_id_index_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($CONSTANTS)) {
				_csetf_fort_id_index_constants(v_new, current_value);
			} else if (pcase_var.eql($NARTS)) {
				_csetf_fort_id_index_narts(v_new, current_value);
			} else {
				Errors.error($str56$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_fort_id_index(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_FORT_ID_INDEX, TWO_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $CONSTANTS, fort_id_index_constants(obj));
		funcall(visitor_fn, obj, $SLOT, $NARTS, fort_id_index_narts(obj));
		funcall(visitor_fn, obj, $END, MAKE_FORT_ID_INDEX, TWO_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_fort_id_index_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_fort_id_index(obj, visitor_fn);
	}

	public static SubLObject print_fort_id_index(final SubLObject fort_id_index, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $print_readably$.getDynamicValue(thread)) {
			print_not_readable(fort_id_index, stream);
		} else {
			print_macros.print_unreadable_object_preamble(stream, fort_id_index, T, T);
			write_string($str62$Constant_Index_, stream, UNPROVIDED, UNPROVIDED);
			princ(fort_id_index_constants(fort_id_index), stream);
			write_string($str63$Nart_Index_, stream, UNPROVIDED, UNPROVIDED);
			princ(fort_id_index_narts(fort_id_index), stream);
			print_macros.print_unreadable_object_postamble(stream, fort_id_index, NIL, NIL);
		}
		return fort_id_index;
	}

	public static SubLObject with_fort_id_index_index_and_id(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list64);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject id_index_var = NIL;
		SubLObject id_var = NIL;
		SubLObject fort = NIL;
		SubLObject fort_id_index = NIL;
		destructuring_bind_must_consp(current, datum, $list64);
		id_index_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list64);
		id_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list64);
		fort = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list64);
		fort_id_index = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return list(PROGN, listS(CHECK_TYPE, fort, $list67), listS(CHECK_TYPE, fort_id_index, $list68),
					list(PWHEN, list($sym70$VALID_FORT_, fort), listS(CLET, list(list(id_index_var, list(FIF, list(CONSTANT_P, fort), list(FORT_ID_INDEX_CONSTANTS, fort_id_index), list(FORT_ID_INDEX_NARTS, fort_id_index))), list(id_var, list(FIF, list(CONSTANT_P, fort), list(CONSTANT_INTERNAL_ID, fort), list(NART_ID, fort)))), append(body, NIL))));
		}
		cdestructuring_bind_error(datum, $list64);
		return NIL;
	}

	public static SubLObject new_fort_id_index() {
		final SubLObject fort_id_index = make_fort_id_index(UNPROVIDED);
		_csetf_fort_id_index_constants(fort_id_index, new_fort_id_index_constants());
		_csetf_fort_id_index_narts(fort_id_index, new_fort_id_index_narts());
		return fort_id_index;
	}

	public static SubLObject fort_id_index_count(final SubLObject fort_id_index) {
		assert NIL != fort_id_index_p(fort_id_index) : "forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) " + fort_id_index;
		return add(id_index_count(fort_id_index_constants(fort_id_index)), id_index_count(fort_id_index_narts(fort_id_index)));
	}

	public static SubLObject fort_id_index_emptyP(final SubLObject fort_id_index) {
		assert NIL != fort_id_index_p(fort_id_index) : "forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) " + fort_id_index;
		return eq(fort_id_index_count(fort_id_index), ZERO_INTEGER);
	}

	public static SubLObject fort_id_index_lookup(final SubLObject fort_id_index, final SubLObject fort) {
		SubLObject v_answer = NIL;
		assert NIL != fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
		assert NIL != fort_id_index_p(fort_id_index) : "forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) " + fort_id_index;
		if (NIL != valid_fortP(fort)) {
			final SubLObject v_id_index = (NIL != constant_p(fort)) ? fort_id_index_constants(fort_id_index) : fort_id_index_narts(fort_id_index);
			final SubLObject id = (NIL != constant_p(fort)) ? constants_high.constant_internal_id(fort) : nart_handles.nart_id(fort);
			v_answer = id_index_lookup(v_id_index, id, UNPROVIDED);
		}
		return v_answer;
	}

	public static SubLObject fort_id_index_enter(final SubLObject fort_id_index, final SubLObject fort, final SubLObject v_object) {
		assert NIL != fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
		assert NIL != fort_id_index_p(fort_id_index) : "forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) " + fort_id_index;
		if (NIL != valid_fortP(fort)) {
			final SubLObject v_id_index = (NIL != constant_p(fort)) ? fort_id_index_constants(fort_id_index) : fort_id_index_narts(fort_id_index);
			final SubLObject id = (NIL != constant_p(fort)) ? constants_high.constant_internal_id(fort) : nart_handles.nart_id(fort);
			id_index_enter(v_id_index, id, v_object);
		}
		return NIL;
	}

	public static SubLObject fort_id_index_remove(final SubLObject fort_id_index, final SubLObject fort) {
		assert NIL != fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
		assert NIL != fort_id_index_p(fort_id_index) : "forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) " + fort_id_index;
		if (NIL != valid_fortP(fort)) {
			final SubLObject v_id_index = (NIL != constant_p(fort)) ? fort_id_index_constants(fort_id_index) : fort_id_index_narts(fort_id_index);
			final SubLObject id = (NIL != constant_p(fort)) ? constants_high.constant_internal_id(fort) : nart_handles.nart_id(fort);
			id_index_remove(v_id_index, id);
		}
		return NIL;
	}

	public static SubLObject clear_fort_id_index(final SubLObject fort_id_index) {
		assert NIL != fort_id_index_p(fort_id_index) : "forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) " + fort_id_index;
		clear_id_index(fort_id_index_constants(fort_id_index));
		clear_id_index(fort_id_index_narts(fort_id_index));
		return NIL;
	}

	public static SubLObject optimize_fort_id_index(final SubLObject fort_id_index) {
		assert NIL != fort_id_index_p(fort_id_index) : "forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) " + fort_id_index;
		optimize_id_index(fort_id_index_constants(fort_id_index), UNPROVIDED);
		optimize_id_index(fort_id_index_narts(fort_id_index), UNPROVIDED);
		return NIL;
	}

	public static SubLObject fort_id_index_optimized_p(final SubLObject fort_id_index) {
		assert NIL != fort_id_index_p(fort_id_index) : "forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) " + fort_id_index;
		return makeBoolean((NIL != id_index_optimized_p(fort_id_index_constants(fort_id_index))) && (NIL != id_index_optimized_p(fort_id_index_narts(fort_id_index))));
	}

	public static SubLObject new_fort_id_index_constants() {
		return new_id_index(constants_high.new_constant_internal_id_threshold(), UNPROVIDED);
	}

	public static SubLObject new_fort_id_index_narts() {
		return new_id_index(nart_handles.new_nart_id_threshold(), UNPROVIDED);
	}

	public static SubLObject do_fort_id_index(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list75);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject fort = NIL;
		SubLObject value = NIL;
		SubLObject fort_id_index = NIL;
		destructuring_bind_must_consp(current, datum, $list75);
		fort = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list75);
		value = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list75);
		fort_id_index = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$2 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list75);
			current_$2 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list75);
			if (NIL == member(current_$2, $list11, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$2 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list75);
		}
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		final SubLObject fii = $sym76$FII;
		return list(CLET, list(list(fii, fort_id_index)), listS(DO_FORT_ID_INDEX_CONSTANTS, list(fort, value, fii, $DONE, done), append(body, NIL)), listS(DO_FORT_ID_INDEX_NARTS, list(fort, value, fii, $DONE, done), append(body, NIL)));
	}

	public static SubLObject do_fort_id_index_constants(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list80);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject constant = NIL;
		SubLObject value = NIL;
		SubLObject fort_id_index = NIL;
		destructuring_bind_must_consp(current, datum, $list80);
		constant = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list80);
		value = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list80);
		fort_id_index = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$3 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list80);
			current_$3 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list80);
			if (NIL == member(current_$3, $list11, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$3 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list80);
		}
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		final SubLObject id = $sym81$ID;
		return list(DO_ID_INDEX, list(id, value, list(DO_FII_GET_CONSTANTS, fort_id_index), $DONE, done), list(CLET, list(list(constant, list(FIND_CONSTANT_BY_INTERNAL_ID, id))), listS(PWHEN, constant, append(body, NIL))));
	}

	public static SubLObject do_fii_get_constants(final SubLObject fort_id_index) {
		return fort_id_index_constants(fort_id_index);
	}

	public static SubLObject do_fort_id_index_narts(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list85);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject nart = NIL;
		SubLObject value = NIL;
		SubLObject fort_id_index = NIL;
		destructuring_bind_must_consp(current, datum, $list85);
		nart = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list85);
		value = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list85);
		fort_id_index = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$4 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list85);
			current_$4 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list85);
			if (NIL == member(current_$4, $list11, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$4 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list85);
		}
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		final SubLObject id = $sym86$ID;
		return list(DO_ID_INDEX, list(id, value, list(DO_FII_GET_NARTS, fort_id_index), $DONE, done), list(CLET, list(list(nart, list(FIND_NART_BY_ID, id))), listS(PWHEN, nart, append(body, NIL))));
	}

	public static SubLObject do_fii_get_narts(final SubLObject fort_id_index) {
		return fort_id_index_narts(fort_id_index);
	}

	public static SubLObject cfasl_output_object_fort_id_index_method(final SubLObject v_object, final SubLObject stream) {
		return cfasl_output_fort_id_index(v_object, stream);
	}

	public static SubLObject cfasl_output_fort_id_index(final SubLObject fort_id_index, final SubLObject stream) {
		cfasl_raw_write_byte($cfasl_opcode_fort_id_index$.getGlobalValue(), stream);
		final SubLObject count = fort_id_index_count(fort_id_index);
		cfasl_output(count, stream);
		SubLObject idx = do_fii_get_constants(fort_id_index);
		if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
			final SubLObject idx_$5 = idx;
			if (NIL == id_index_dense_objects_empty_p(idx_$5, $SKIP)) {
				final SubLObject vector_var = id_index_dense_objects(idx_$5);
				final SubLObject backwardP_var = NIL;
				SubLObject length;
				SubLObject v_iteration;
				SubLObject id;
				SubLObject value;
				SubLObject fort;
				for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
					value = aref(vector_var, id);
					if ((NIL == id_index_tombstone_p(value)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
						if (NIL != id_index_tombstone_p(value)) {
							value = $SKIP;
						}
						fort = constants_high.find_constant_by_internal_id(id);
						if (NIL != fort) {
							cfasl_output(fort, stream);
							cfasl_output(value, stream);
						}
					}
				}
			}
			final SubLObject idx_$6 = idx;
			if (NIL == id_index_sparse_objects_empty_p(idx_$6)) {
				final SubLObject cdohash_table = id_index_sparse_objects(idx_$6);
				SubLObject id2 = NIL;
				SubLObject value2 = NIL;
				final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						id2 = getEntryKey(cdohash_entry);
						value2 = getEntryValue(cdohash_entry);
						final SubLObject fort2 = constants_high.find_constant_by_internal_id(id2);
						if (NIL != fort2) {
							cfasl_output(fort2, stream);
							cfasl_output(value2, stream);
						}
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		idx = do_fii_get_narts(fort_id_index);
		if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
			final SubLObject idx_$7 = idx;
			if (NIL == id_index_dense_objects_empty_p(idx_$7, $SKIP)) {
				final SubLObject vector_var = id_index_dense_objects(idx_$7);
				final SubLObject backwardP_var = NIL;
				SubLObject length;
				SubLObject v_iteration;
				SubLObject id;
				SubLObject value;
				SubLObject fort;
				for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
					value = aref(vector_var, id);
					if ((NIL == id_index_tombstone_p(value)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
						if (NIL != id_index_tombstone_p(value)) {
							value = $SKIP;
						}
						fort = nart_handles.find_nart_by_id(id);
						if (NIL != fort) {
							cfasl_output(fort, stream);
							cfasl_output(value, stream);
						}
					}
				}
			}
			final SubLObject idx_$8 = idx;
			if (NIL == id_index_sparse_objects_empty_p(idx_$8)) {
				final SubLObject cdohash_table = id_index_sparse_objects(idx_$8);
				SubLObject id2 = NIL;
				SubLObject value2 = NIL;
				final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
				try {
					while (iteratorHasNext(cdohash_iterator)) {
						final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
						id2 = getEntryKey(cdohash_entry);
						value2 = getEntryValue(cdohash_entry);
						final SubLObject fort2 = nart_handles.find_nart_by_id(id2);
						if (NIL != fort2) {
							cfasl_output(fort2, stream);
							cfasl_output(value2, stream);
						}
					}
				} finally {
					releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return fort_id_index;
	}

	public static SubLObject cfasl_input_fort_id_index(final SubLObject stream) {
		final SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
		SubLObject fort_id_index = NIL;
		fort_id_index = new_fort_id_index();
		SubLObject i;
		SubLObject fort;
		SubLObject value;
		for (i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
			fort = cfasl_input_object(stream);
			value = cfasl_input_object(stream);
			fort_id_index_enter(fort_id_index, fort, value);
		}
		return fort_id_index;
	}

	public static SubLObject verify_do_forts_macro_iteration_equivalence() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index = ZERO_INTEGER;
		final SubLObject iter = new_forts_iterator();
		final SubLObject message = $str93$Checking_that_forts_iterators_wor;
		final SubLObject total = fort_count();
		SubLObject sofar = ZERO_INTEGER;
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
				noting_percent_progress_preamble(message);
				SubLObject cdolist_list_var = do_forts_tables();
				SubLObject table_var = NIL;
				table_var = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					final SubLObject idx = table_var;
					if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
						final SubLObject idx_$9 = idx;
						if (NIL == id_index_dense_objects_empty_p(idx_$9, $SKIP)) {
							final SubLObject vector_var = id_index_dense_objects(idx_$9);
							final SubLObject backwardP_var = NIL;
							SubLObject length;
							SubLObject v_iteration;
							SubLObject id;
							SubLObject fort;
							SubLObject candidate;
							for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
								id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
								fort = aref(vector_var, id);
								if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
									if (NIL != id_index_tombstone_p(fort)) {
										fort = $SKIP;
									}
									sofar = add(sofar, ONE_INTEGER);
									note_percent_progress(sofar, total);
									index = add(index, ONE_INTEGER);
									candidate = iteration.iteration_next_without_values(iter, $EXHAUSTED);
									if (NIL == fort_p(candidate)) {
										if (candidate == $EXHAUSTED) {
											return list($ERROR, $str97$FORTS_ITERATOR_exhausted_before_D, $INDEX, index);
										}
										return list($ERROR, $str99$FORTS_ITERATOR_returned_non_fort_, $CANDIDATE, candidate, $INDEX, index);
									} else if (!candidate.eql(fort)) {
										return list($ERROR, $str101$FORTS_ITERATOR_and_DO_FORTS_diffe, $CANDIDATE, candidate, $FORT, fort, $INDEX, index);
									}

								}
							}
						}
						final SubLObject idx_$10 = idx;
						if ((NIL == id_index_sparse_objects_empty_p(idx_$10)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
							final SubLObject sparse = id_index_sparse_objects(idx_$10);
							SubLObject id2 = id_index_sparse_id_threshold(idx_$10);
							final SubLObject end_id = id_index_next_id(idx_$10);
							final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
							while (id2.numL(end_id)) {
								final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
								if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
									sofar = add(sofar, ONE_INTEGER);
									note_percent_progress(sofar, total);
									index = add(index, ONE_INTEGER);
									final SubLObject candidate2 = iteration.iteration_next_without_values(iter, $EXHAUSTED);
									if (NIL == fort_p(candidate2)) {
										if (candidate2 == $EXHAUSTED) {
											return list($ERROR, $str97$FORTS_ITERATOR_exhausted_before_D, $INDEX, index);
										}
										return list($ERROR, $str99$FORTS_ITERATOR_returned_non_fort_, $CANDIDATE, candidate2, $INDEX, index);
									} else if (!candidate2.eql(fort2)) {
										return list($ERROR, $str101$FORTS_ITERATOR_and_DO_FORTS_diffe, $CANDIDATE, candidate2, $FORT, fort2, $INDEX, index);
									}

								}
								id2 = add(id2, ONE_INTEGER);
							}
						}
					}
					cdolist_list_var = cdolist_list_var.rest();
					table_var = cdolist_list_var.first();
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
		final SubLObject exhausted = iteration.iteration_next_without_values(iter, $EXHAUSTED);
		if ($EXHAUSTED != exhausted) {
			return list($ERROR, $str103$The_FORTS_iterator_has_more_value, $INDEX, index, $CANDIDATE, exhausted);
		}
		return NIL;
	}

	public static SubLObject declare_forts_file() {
		declareFunction(me, "fort_p", "FORT-P", 1, 0, false);
		new forts.$fort_p$UnaryFunction();
		declareFunction(me, "non_fort_p", "NON-FORT-P", 1, 0, false);
		declareFunction(me, "list_of_fort_p", "LIST-OF-FORT-P", 1, 0, false);
		declareFunction(me, "fort_el_formula", "FORT-EL-FORMULA", 1, 0, false);
		declareFunction(me, "new_forts_iterator", "NEW-FORTS-ITERATOR", 0, 0, false);
		declareMacro(me, "do_forts", "DO-FORTS");
		declareFunction(me, "do_forts_tables", "DO-FORTS-TABLES", 0, 0, false);
		declareFunction(me, "fort_count", "FORT-COUNT", 0, 0, false);
		declareFunction(me, "random_fort", "RANDOM-FORT", 0, 1, false);
		declareFunction(me, "sample_forts", "SAMPLE-FORTS", 0, 3, false);
		declareFunction(me, "fort_index", "FORT-INDEX", 1, 0, false);
		declareFunction(me, "reset_fort_index", "RESET-FORT-INDEX", 2, 0, false);
		declareFunction(me, "clear_fort_index", "CLEAR-FORT-INDEX", 1, 0, false);
		declareFunction(me, "fort_internal_id", "FORT-INTERNAL-ID", 1, 0, false);
		new forts.$fort_internal_id$UnaryFunction();
		declareFunction(me, "fort_external_id", "FORT-EXTERNAL-ID", 1, 0, false);
		declareFunction(me, "valid_fortP", "VALID-FORT?", 1, 0, false);
		declareFunction(me, "valid_fort_robustP", "VALID-FORT-ROBUST?", 1, 0, false);
		declareFunction(me, "invalid_fortP", "INVALID-FORT?", 1, 0, false);
		new forts.$invalid_fortP$UnaryFunction();
		declareFunction(me, "invalid_fort_robustP", "INVALID-FORT-ROBUST?", 1, 0, false);
		declareFunction(me, "remove_fort", "REMOVE-FORT", 1, 0, false);
		declareFunction(me, "fort_id_index_print_function_trampoline", "FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction(me, "fort_id_index_p", "FORT-ID-INDEX-P", 1, 0, false);
		new forts.$fort_id_index_p$UnaryFunction();
		declareFunction(me, "fort_id_index_constants", "FORT-ID-INDEX-CONSTANTS", 1, 0, false);
		declareFunction(me, "fort_id_index_narts", "FORT-ID-INDEX-NARTS", 1, 0, false);
		declareFunction(me, "_csetf_fort_id_index_constants", "_CSETF-FORT-ID-INDEX-CONSTANTS", 2, 0, false);
		declareFunction(me, "_csetf_fort_id_index_narts", "_CSETF-FORT-ID-INDEX-NARTS", 2, 0, false);
		declareFunction(me, "make_fort_id_index", "MAKE-FORT-ID-INDEX", 0, 1, false);
		declareFunction(me, "visit_defstruct_fort_id_index", "VISIT-DEFSTRUCT-FORT-ID-INDEX", 2, 0, false);
		declareFunction(me, "visit_defstruct_object_fort_id_index_method", "VISIT-DEFSTRUCT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false);
		declareFunction(me, "print_fort_id_index", "PRINT-FORT-ID-INDEX", 3, 0, false);
		declareMacro(me, "with_fort_id_index_index_and_id", "WITH-FORT-ID-INDEX-INDEX-AND-ID");
		declareFunction(me, "new_fort_id_index", "NEW-FORT-ID-INDEX", 0, 0, false);
		declareFunction(me, "fort_id_index_count", "FORT-ID-INDEX-COUNT", 1, 0, false);
		declareFunction(me, "fort_id_index_emptyP", "FORT-ID-INDEX-EMPTY?", 1, 0, false);
		declareFunction(me, "fort_id_index_lookup", "FORT-ID-INDEX-LOOKUP", 2, 0, false);
		declareFunction(me, "fort_id_index_enter", "FORT-ID-INDEX-ENTER", 3, 0, false);
		declareFunction(me, "fort_id_index_remove", "FORT-ID-INDEX-REMOVE", 2, 0, false);
		declareFunction(me, "clear_fort_id_index", "CLEAR-FORT-ID-INDEX", 1, 0, false);
		declareFunction(me, "optimize_fort_id_index", "OPTIMIZE-FORT-ID-INDEX", 1, 0, false);
		declareFunction(me, "fort_id_index_optimized_p", "FORT-ID-INDEX-OPTIMIZED-P", 1, 0, false);
		declareFunction(me, "new_fort_id_index_constants", "NEW-FORT-ID-INDEX-CONSTANTS", 0, 0, false);
		declareFunction(me, "new_fort_id_index_narts", "NEW-FORT-ID-INDEX-NARTS", 0, 0, false);
		declareMacro(me, "do_fort_id_index", "DO-FORT-ID-INDEX");
		declareMacro(me, "do_fort_id_index_constants", "DO-FORT-ID-INDEX-CONSTANTS");
		declareFunction(me, "do_fii_get_constants", "DO-FII-GET-CONSTANTS", 1, 0, false);
		declareMacro(me, "do_fort_id_index_narts", "DO-FORT-ID-INDEX-NARTS");
		declareFunction(me, "do_fii_get_narts", "DO-FII-GET-NARTS", 1, 0, false);
		declareFunction(me, "cfasl_output_object_fort_id_index_method", "CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false);
		declareFunction(me, "cfasl_output_fort_id_index", "CFASL-OUTPUT-FORT-ID-INDEX", 2, 0, false);
		declareFunction(me, "cfasl_input_fort_id_index", "CFASL-INPUT-FORT-ID-INDEX", 1, 0, false);
		declareFunction(me, "verify_do_forts_macro_iteration_equivalence", "VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE", 0, 0, false);
		return NIL;
	}

	public static SubLObject init_forts_file() {
		defconstant("*DTP-FORT-ID-INDEX*", FORT_ID_INDEX);
		defconstant("*CFASL-OPCODE-FORT-ID-INDEX*", $int$99);
		return NIL;
	}

	public static SubLObject setup_forts_file() {
		register_cyc_api_function(FORT_P, $list1, $str2$Return_T_iff_OBJECT_is_a_first_or, NIL, $list3);
		register_cyc_api_function(FORT_EL_FORMULA, $list5, $str6$Return_the_EL_formula_for_any_FOR, $list7, $list8);
		register_cyc_api_macro(DO_FORTS, $list9, $str29$Iterate_over_all_HL_FORT_datastru);
		register_macro_helper(DO_FORTS_TABLES, DO_FORTS);
		register_cyc_api_function(FORT_COUNT, NIL, $str32$Return_the_total_number_of_FORTs_, NIL, $list33);
		register_cyc_api_function(REMOVE_FORT, $list5, $str39$Remove_FORT_from_the_KB_, $list7, $list40);
		register_method($print_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list49);
		def_csetf(FORT_ID_INDEX_CONSTANTS, _CSETF_FORT_ID_INDEX_CONSTANTS);
		def_csetf(FORT_ID_INDEX_NARTS, _CSETF_FORT_ID_INDEX_NARTS);
		identity(FORT_ID_INDEX);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD));
		register_macro_helper(DO_FORT_ID_INDEX_CONSTANTS, DO_FORT_ID_INDEX);
		register_macro_helper(DO_FII_GET_CONSTANTS, DO_FORT_ID_INDEX_CONSTANTS);
		register_macro_helper(DO_FORT_ID_INDEX_NARTS, DO_FORT_ID_INDEX);
		register_macro_helper(DO_FII_GET_NARTS, DO_FORT_ID_INDEX_NARTS);
		register_cfasl_input_function($cfasl_opcode_fort_id_index$.getGlobalValue(), CFASL_INPUT_FORT_ID_INDEX);
		register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD));
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_forts_file();
	}

	@Override
	public void initializeVariables() {
		init_forts_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_forts_file();
	}

	static {

	}

	public static final class $fort_p$UnaryFunction extends UnaryFunction {
		public $fort_p$UnaryFunction() {
			super(extractFunctionNamed("FORT-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return fort_p(arg1);
		}
	}

	public static final class $fort_internal_id$UnaryFunction extends UnaryFunction {
		public $fort_internal_id$UnaryFunction() {
			super(extractFunctionNamed("FORT-INTERNAL-ID"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return fort_internal_id(arg1);
		}
	}

	public static final class $invalid_fortP$UnaryFunction extends UnaryFunction {
		public $invalid_fortP$UnaryFunction() {
			super(extractFunctionNamed("INVALID-FORT?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return invalid_fortP(arg1);
		}
	}

	public static final class $fort_id_index_native extends SubLStructNative {
		public SubLObject $constants;

		public SubLObject $narts;

		private static final SubLStructDeclNative structDecl;

		private $fort_id_index_native() {
			this.$constants = Lisp.NIL;
			this.$narts = Lisp.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return this.$constants;
		}

		@Override
		public SubLObject getField3() {
			return this.$narts;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return this.$constants = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value) {
			return this.$narts = value;
		}

		static {
			structDecl = makeStructDeclNative($fort_id_index_native.class, FORT_ID_INDEX, FORT_ID_INDEX_P, $list43, $list44, new String[] { "$constants", "$narts" }, $list45, $list46, PRINT_FORT_ID_INDEX);
		}
	}

	public static final class $fort_id_index_p$UnaryFunction extends UnaryFunction {
		public $fort_id_index_p$UnaryFunction() {
			super(extractFunctionNamed("FORT-ID-INDEX-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return fort_id_index_p(arg1);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return
	 */
	public static SubLObject random_fort() {
		return random_fort(UNPROVIDED_SYM);
	}
}

/**
 * Total time: 411 ms
 */
