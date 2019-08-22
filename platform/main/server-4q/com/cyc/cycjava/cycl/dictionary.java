package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class dictionary extends SubLTranslatedFile {
	public static final SubLFile me = new dictionary();

	public static final String myName = "com.cyc.cycjava.cycl.dictionary";

	public static final String myFingerPrint = "94f63653917ec9fe5df80a0a4abb09c06504c992fc3d6287c737293d62df11c8";

	// deflexical
	private static final SubLSymbol $dictionary_high_water_mark$ = makeSymbol("*DICTIONARY-HIGH-WATER-MARK*");

	// deflexical
	private static final SubLSymbol $dictionary_low_water_mark$ = makeSymbol("*DICTIONARY-LOW-WATER-MARK*");

	// defconstant
	public static final SubLSymbol $dtp_dictionary$ = makeSymbol("*DTP-DICTIONARY*");

	// defconstant
	private static final SubLSymbol $cfasl_opcode_dictionary$ = makeSymbol("*CFASL-OPCODE-DICTIONARY*");

	// defconstant
	private static final SubLSymbol $cfasl_opcode_legacy_dictionary$ = makeSymbol("*CFASL-OPCODE-LEGACY-DICTIONARY*");

	private static final SubLInteger $int$133 = makeInteger(133);

	public static final SubLList $list3 = list(makeSymbol("DATABASE"), makeSymbol("TEST"));

	public static final SubLList $list4 = list(makeKeyword("DATABASE"), makeKeyword("TEST"));

	public static final SubLList $list5 = list(makeSymbol("DICTIONARY-DATABASE"), makeSymbol("DICTIONARY-TEST"));

	public static final SubLList $list6 = list(makeSymbol("_CSETF-DICTIONARY-DATABASE"), makeSymbol("_CSETF-DICTIONARY-TEST"));

	public static final SubLSymbol PRINT_DICTIONARY = makeSymbol("PRINT-DICTIONARY");

	public static final SubLSymbol DICTIONARY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DICTIONARY-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DICTIONARY-P"));

	private static final SubLSymbol DICTIONARY_DATABASE = makeSymbol("DICTIONARY-DATABASE");

	private static final SubLSymbol _CSETF_DICTIONARY_DATABASE = makeSymbol("_CSETF-DICTIONARY-DATABASE");

	private static final SubLSymbol DICTIONARY_TEST = makeSymbol("DICTIONARY-TEST");

	private static final SubLSymbol _CSETF_DICTIONARY_TEST = makeSymbol("_CSETF-DICTIONARY-TEST");

	private static final SubLString $str16$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	private static final SubLSymbol MAKE_DICTIONARY = makeSymbol("MAKE-DICTIONARY");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DICTIONARY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DICTIONARY-METHOD");

	private static final SubLString $str22$_ = makeString("(");

	private static final SubLString $$$_ = makeString(" ");

	private static final SubLString $str24$_ = makeString(")");

	private static final SubLString $str25$_size_ = makeString(" size=");

	private static final SubLList $list26 = list(makeSymbol("INLINE"), makeSymbol("DICTIONARY-DATABASE-STYLE"), makeSymbol("DICTIONARY-STYLE"), makeSymbol("DICTIONARY-STYLE-ERROR"));

	private static final SubLString $str30$Corrupted_dictionary__unsupported = makeString("Corrupted dictionary; unsupported style ~S.~%");

	private static final SubLList $list31 = list(new SubLObject[] { makeSymbol("INLINE"), makeSymbol("DICTIONARY-EMPTY-ALIST-STYLE"), makeSymbol("DICTIONARY-SIZE-ALIST-STYLE"), makeSymbol("DICTIONARY-LOOKUP-ALIST-STYLE"), makeSymbol("DICTIONARY-LOOKUP-WITHOUT-VALUES-ALIST-STYLE"), makeSymbol("DICTIONARY-ENTER-ALIST-STYLE"), makeSymbol("DICTIONARY-REMOVE-ALIST-STYLE"), makeSymbol("DICTIONARY-OPTIMIZE-ALIST-STYLE"),
			makeSymbol("MAKE-HASHTABLE-DICTIONARY-FROM-ALIST") });

	private static final SubLList $list32 = list(new SubLObject[] { makeSymbol("INLINE"), makeSymbol("DICTIONARY-EMPTY-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-SIZE-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-LOOKUP-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-ENTER-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-REMOVE-HASHTABLE-STYLE"),
			makeSymbol("DICTIONARY-OPTIMIZE-HASHTABLE-STYLE"), makeSymbol("MAKE-ALIST-DICTIONARY-FROM-HASHTABLE") });

	public static final SubLList $list35 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol DO_DICTIONARY_CONTENTS = makeSymbol("DO-DICTIONARY-CONTENTS");

	private static final SubLSymbol DICTIONARY_CONTENTS = makeSymbol("DICTIONARY-CONTENTS");

	private static final SubLList $list40 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("PROGRESS-NOTE"), makeString("Mapping .."))), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list41 = list(makeKeyword("DONE"), makeKeyword("PROGRESS-NOTE"));

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	private static final SubLString $str44$Mapping_dictionary___ = makeString("Mapping ..");

	private static final SubLSymbol $sym45$SO_FAR = makeUninternedSymbol("SO-FAR");

	private static final SubLSymbol $sym46$TOTAL = makeUninternedSymbol("TOTAL");

	private static final SubLList $list48 = list(ZERO_INTEGER);

	private static final SubLSymbol DICTIONARY_LENGTH = makeSymbol("DICTIONARY-LENGTH");

	private static final SubLInteger $int$61 = makeInteger(61);

	private static final SubLSymbol CFASL_INPUT_DICTIONARY = makeSymbol("CFASL-INPUT-DICTIONARY");

	private static final SubLSymbol CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-DICTIONARY-METHOD");

	private static final SubLSymbol CFASL_INPUT_LEGACY_DICTIONARY = makeSymbol("CFASL-INPUT-LEGACY-DICTIONARY");

	public static SubLObject dictionary_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		print_dictionary(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject dictionary_like(final SubLObject v_object) {
		final boolean isDict = v_object.getJavaClass() ==$dictionary_native.class || v_object.isHashtable() || NIL != v_object.toLispObject().typep(DICTIONARY.toLispObject());
		return isDict ? T : NIL;
	}

	public static SubLObject dictionary_p(final SubLObject v_object) {
		final boolean isDict = v_object.getJavaClass() ==$dictionary_native.class || NIL != v_object.toLispObject().typep(DICTIONARY.toLispObject());
		return isDict ? T : NIL;
	}

	public static SubLObject dictionary_database(final SubLObject v_object) {
		assert NIL != dictionary_p(v_object) : "dictionary.dictionary_p error :" + v_object;
		if (v_object.isHashtable())
			return v_object;
		return v_object.getField2();
	}

	public static SubLObject dictionary_test(final SubLObject v_object) {
		assert NIL != dictionary_p(v_object) : "dictionary.dictionary_p error :" + v_object;
		if (v_object.isHashtable())
			return v_object.toHashtable().getTestSymbol();
		return v_object.getField3();
	}

	public static SubLObject _csetf_dictionary_database(final SubLObject v_object, final SubLObject value) {
		assert NIL != dictionary_p(v_object) : "dictionary.dictionary_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_dictionary_test(final SubLObject v_object, final SubLObject value) {
		assert NIL != dictionary_p(v_object) : "dictionary.dictionary_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject make_dictionary(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new $dictionary_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($DATABASE)) {
				_csetf_dictionary_database(v_new, current_value);
			} else if (pcase_var.eql($TEST)) {
				_csetf_dictionary_test(v_new, current_value);
			} else {
				Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_dictionary(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_DICTIONARY, TWO_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $DATABASE, dictionary_database(obj));
		funcall(visitor_fn, obj, $SLOT, $TEST, dictionary_test(obj));
		funcall(visitor_fn, obj, $END, MAKE_DICTIONARY, TWO_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_dictionary_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_dictionary(obj, visitor_fn);
	}

	public static SubLObject print_dictionary(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $print_readably$.getDynamicValue(thread)) {
			print_not_readable(v_object, stream);
		} else {
			print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
			write_string($str22$_, stream, UNPROVIDED, UNPROVIDED);
			princ(hash_table_utilities.hash_test_to_symbol(dictionary_test(v_object)), stream);
			write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
			write_string(symbol_name(dictionary_style(v_object)), stream, UNPROVIDED, UNPROVIDED);
			write_string($str24$_, stream, UNPROVIDED, UNPROVIDED);
			write_string($str25$_size_, stream, UNPROVIDED, UNPROVIDED);
			princ(dictionary_length(v_object), stream);
			print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
		}
		return v_object;
	}

	public static SubLObject dictionary_database_style(final SubLObject dictionary_database) {
		if (dictionary_database.isList()) {
			return $ALIST;
		}
		if (dictionary_database.isHashtable()) {
			return $HASHTABLE;
		}
		return $UNKNOWN;
	}

	public static SubLObject dictionary_style(final SubLObject v_dictionary) {
		return dictionary_database_style(dictionary_database(v_dictionary));
	}

	public static SubLObject dictionary_style_error(final SubLObject v_dictionary) {
		return Errors.error($str30$Corrupted_dictionary__unsupported, dictionary_style(v_dictionary));
	}

	public static SubLObject dictionary_empty_alist_style(final SubLObject v_dictionary, final SubLObject alist) {
		return sublisp_null(alist);
	}

	public static SubLObject dictionary_size_alist_style(final SubLObject v_dictionary, final SubLObject alist) {
		return length(alist);
	}

	public static SubLObject dictionary_lookup_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject not_found) {
		final SubLObject test = dictionary_test(v_dictionary);
		return list_utilities.alist_lookup(alist, key, test, not_found);
	}

	public static SubLObject dictionary_lookup_without_values_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject not_found) {
		final SubLObject test = dictionary_test(v_dictionary);
		return list_utilities.alist_lookup_without_values(alist, key, test, not_found);
	}

	public static SubLObject dictionary_enter_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject value) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject test = dictionary_test(v_dictionary);
		thread.resetMultipleValues();
		final SubLObject new_alist = list_utilities.alist_enter(alist, key, value, test);
		final SubLObject replacement_p = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == replacement_p) {
			_csetf_dictionary_database(v_dictionary, new_alist);
			if (dictionary_length(v_dictionary).numG($dictionary_high_water_mark$.getGlobalValue())) {
				make_hashtable_dictionary_from_alist(v_dictionary, new_alist);
			}
		}
		return key;
	}

	public static SubLObject dictionary_remove_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject test = dictionary_test(v_dictionary);
		thread.resetMultipleValues();
		final SubLObject new_alist = list_utilities.alist_delete(alist, key, test);
		final SubLObject removed_p = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != removed_p) {
			_csetf_dictionary_database(v_dictionary, new_alist);
		}
		return key;
	}

	public static SubLObject dictionary_optimize_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject predicate) {
		final SubLObject new_database = list_utilities.alist_optimize(alist, predicate);
		_csetf_dictionary_database(v_dictionary, new_database);
		return v_dictionary;
	}

	public static SubLObject make_hashtable_dictionary_from_alist(final SubLObject v_dictionary, final SubLObject old_database) {
		final SubLObject test = dictionary_test(v_dictionary);
		final SubLObject new_database = list_utilities.alist_to_hash_table(old_database, test);
		_csetf_dictionary_database(v_dictionary, new_database);
		return v_dictionary;
	}

	public static SubLObject dictionary_empty_hashtable_style(final SubLObject v_dictionary, final SubLObject hashtable) {
		return hash_table_utilities.hash_table_empty_p(hashtable);
	}

	public static SubLObject dictionary_size_hashtable_style(final SubLObject v_dictionary, final SubLObject hashtable) {
		return hash_table_count(hashtable);
	}

	public static SubLObject dictionary_lookup_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject not_found) {
		return gethash(key, table, not_found);
	}

	public static SubLObject dictionary_lookup_without_values_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject not_found) {
		return gethash_without_values(key, table, not_found);
	}

	public static SubLObject dictionary_enter_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject value) {
		sethash(key, table, value);
		return key;
	}

	public static SubLObject dictionary_remove_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key) {
		final SubLObject removed_p = remhash(key, table);
		if ((NIL != removed_p) && dictionary_length(v_dictionary).numL($dictionary_low_water_mark$.getGlobalValue())) {
			make_alist_dictionary_from_hashtable(v_dictionary, table);
		}
		return key;
	}

	public static SubLObject dictionary_optimize_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject predicate) {
		return v_dictionary;
	}

	public static SubLObject make_alist_dictionary_from_hashtable(final SubLObject v_dictionary, final SubLObject old_database) {
		final SubLObject new_database = hash_table_utilities.hash_table_to_alist(old_database);
		_csetf_dictionary_database(v_dictionary, new_database);
		return v_dictionary;
	}

	public static SubLObject new_dictionary(SubLObject test, SubLObject size) {
		if (test == UNPROVIDED) {
			test = symbol_function(EQL);
		}
		if (size == UNPROVIDED) {
			size = ZERO_INTEGER;
		}
		assert NIL != hash_table_utilities.valid_hash_test_p(test) : "hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) " + test;
		assert NIL != integerp(size) : "Types.integerp(size) " + "CommonSymbols.NIL != Types.integerp(size) " + size;
		if (test.isSymbol()) {
			test = symbol_function(test);
		}
		final SubLObject v_dictionary = make_dictionary(UNPROVIDED);
		clear_dictionary(v_dictionary);
		_csetf_dictionary_test(v_dictionary, test);
		if (size.numG($dictionary_high_water_mark$.getGlobalValue())) {
			_csetf_dictionary_database(v_dictionary, make_hash_table(size, test, UNPROVIDED));
		}
		return v_dictionary;
	}

	public static SubLObject clear_dictionary(final SubLObject v_dictionary) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		_csetf_dictionary_database(v_dictionary, NIL);
		return v_dictionary;
	}

	public static SubLObject dictionary_length(final SubLObject v_dictionary) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return dictionary_size_alist_style(v_dictionary, database);
		}
		if (pcase_var.eql($HASHTABLE)) {
			return dictionary_size_hashtable_style(v_dictionary, database);
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject dictionary_empty_p(final SubLObject v_dictionary) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return dictionary_empty_alist_style(v_dictionary, database);
		}
		if (pcase_var.eql($HASHTABLE)) {
			return dictionary_empty_hashtable_style(v_dictionary, database);
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject non_empty_dictionary_p(final SubLObject v_object) {
		return makeBoolean((NIL != dictionary_p(v_object)) && (NIL == dictionary_empty_p(v_object)));
	}

	public static SubLObject dictionary_lookup(final SubLObject v_dictionary, final SubLObject key, SubLObject not_found) {
		if (not_found == UNPROVIDED) {
			not_found = NIL;
		}
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return dictionary_lookup_alist_style(v_dictionary, database, key, not_found);
		}
		if (pcase_var.eql($HASHTABLE)) {
			return dictionary_lookup_hashtable_style(v_dictionary, database, key, not_found);
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject dictionary_lookup_without_values(final SubLObject v_dictionary, final SubLObject key, SubLObject not_found) {
		if (not_found == UNPROVIDED) {
			not_found = NIL;
		}
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return dictionary_lookup_without_values_alist_style(v_dictionary, database, key, not_found);
		}
		if (pcase_var.eql($HASHTABLE)) {
			return dictionary_lookup_without_values_hashtable_style(v_dictionary, database, key, not_found);
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject dictionary_enter(final SubLObject v_dictionary, final SubLObject key, final SubLObject value) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return dictionary_enter_alist_style(v_dictionary, database, key, value);
		}
		if (pcase_var.eql($HASHTABLE)) {
			return dictionary_enter_hashtable_style(v_dictionary, database, key, value);
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject dictionary_remove(final SubLObject v_dictionary, final SubLObject key) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return dictionary_remove_alist_style(v_dictionary, database, key);
		}
		if (pcase_var.eql($HASHTABLE)) {
			return dictionary_remove_hashtable_style(v_dictionary, database, key);
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject dictionary_optimize(final SubLObject v_dictionary, final SubLObject predicate) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return dictionary_optimize_alist_style(v_dictionary, database, predicate);
		}
		if (pcase_var.eql($HASHTABLE)) {
			return dictionary_optimize_hashtable_style(v_dictionary, database, predicate);
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject new_dictionary_iterator(final SubLObject v_dictionary) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return iteration.new_alist_iterator(database);
		}
		if (pcase_var.eql($HASHTABLE)) {
			return iteration.new_hash_table_iterator(database);
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject do_dictionary(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list35);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject key = NIL;
		SubLObject value = NIL;
		SubLObject v_dictionary = NIL;
		destructuring_bind_must_consp(current, datum, $list35);
		key = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list35);
		value = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list35);
		v_dictionary = current.first();
		current = current.rest();
		final SubLObject done = (current.isCons()) ? current.first() : NIL;
		destructuring_bind_must_listp(current, datum, $list35);
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(DO_DICTIONARY_CONTENTS, list(key, value, list(DICTIONARY_CONTENTS, v_dictionary), $DONE, done), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list35);
		return NIL;
	}

	public static SubLObject dictionary_contents(final SubLObject v_dictionary) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		return dictionary_database(v_dictionary);
	}

	public static SubLObject do_dictionary_progress(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list40);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject key = NIL;
		SubLObject value = NIL;
		SubLObject v_dictionary = NIL;
		destructuring_bind_must_consp(current, datum, $list40);
		key = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list40);
		value = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list40);
		v_dictionary = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$1 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list40);
			current_$1 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list40);
			if (NIL == member(current_$1, $list41, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$1 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list40);
		}
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject progress_note_tail = property_list_member($PROGRESS_NOTE, current);
		final SubLObject progress_note = (NIL != progress_note_tail) ? cadr(progress_note_tail) : $str44$Mapping_dictionary___;
		final SubLObject body;
		current = body = temp;
		final SubLObject so_far = $sym45$SO_FAR;
		final SubLObject total = $sym46$TOTAL;
		return list(CLET, list(bq_cons(so_far, $list48), list(total, list(DICTIONARY_LENGTH, v_dictionary))), list(NOTING_PERCENT_PROGRESS, progress_note, listS(DO_DICTIONARY, list(key, value, v_dictionary, done), append(body, list(list(CINC, so_far), list(NOTE_PERCENT_PROGRESS, so_far, total))))));
	}

	public static SubLObject mapdictionary(final SubLObject v_dictionary, final SubLObject function) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
		SubLObject iteration_state;
		for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
			thread.resetMultipleValues();
			final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			final SubLObject value = thread.secondMultipleValue();
			thread.resetMultipleValues();
			funcall(function, key, value);
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return NIL;
	}

	public static SubLObject mapdictionary_parameterized(final SubLObject v_dictionary, final SubLObject function, final SubLObject args) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
		SubLObject iteration_state;
		for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
			thread.resetMultipleValues();
			final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			final SubLObject value = thread.secondMultipleValue();
			thread.resetMultipleValues();
			funcall(function, key, value, args);
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return NIL;
	}

	public static SubLObject cfasl_output_object_dictionary_method(final SubLObject v_object, final SubLObject stream) {
		return cfasl_output_dictionary(v_object, stream);
	}

	public static SubLObject cfasl_output_dictionary(final SubLObject v_object, final SubLObject stream) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		cfasl_raw_write_byte($cfasl_opcode_dictionary$.getGlobalValue(), stream);
		final SubLObject test = hash_table_utilities.hash_test_to_symbol(dictionary_test(v_object));
		final SubLObject size = dictionary_length(v_object);
		cfasl_output(test, stream);
		cfasl_output(size, stream);
		SubLObject iteration_state;
		for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_object)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
			thread.resetMultipleValues();
			final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			final SubLObject value = thread.secondMultipleValue();
			thread.resetMultipleValues();
			cfasl_output(key, stream);
			cfasl_output(value, stream);
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return v_object;
	}

	public static SubLObject cfasl_input_dictionary(final SubLObject stream) {
		SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
		final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
		SubLObject v_dictionary = NIL;
		SubLObject pcase_var = test;
		if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
			test = symbol_function(test);
		}
		v_dictionary = new_dictionary(test, size);
		pcase_var = dictionary_style(v_dictionary);
		if (pcase_var.eql($ALIST)) {
			cfasl_input_dictionary_content_alist_style(v_dictionary, size, stream);
		} else if (pcase_var.eql($HASHTABLE)) {
			cfasl_input_dictionary_content_hashtable_style(v_dictionary, size, stream);
		} else {
			cfasl_input_dictionary_content_logically(v_dictionary, size, stream);
		}

		return v_dictionary;
	}

	public static SubLObject cfasl_input_dictionary_content_alist_style(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream) {
		SubLObject database = NIL;
		database = make_list(size, NIL);
		SubLObject cons;
		SubLObject key;
		SubLObject value;
		SubLObject association;
		for (cons = NIL, cons = database; !cons.isAtom(); cons = cons.rest()) {
			key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
			value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
			association = NIL;
			association = cons(key, value);
			rplaca(cons, association);
		}
		_csetf_dictionary_database(v_dictionary, database);
		return v_dictionary;
	}

	public static SubLObject cfasl_input_dictionary_content_hashtable_style(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream) {
		return cfasl_input_dictionary_content_logically(v_dictionary, size, stream);
	}

	public static SubLObject cfasl_input_dictionary_content_logically(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream) {
		SubLObject i;
		SubLObject key;
		SubLObject value;
		for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
			key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
			value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
			dictionary_enter(v_dictionary, key, value);
		}
		return v_dictionary;
	}

	public static SubLObject cfasl_input_legacy_dictionary(final SubLObject stream) {
		SubLObject v_dictionary = NIL;
		v_dictionary = new_dictionary(UNPROVIDED, UNPROVIDED);
		cfasl_input_object(stream);
		_csetf_dictionary_database(v_dictionary, cfasl_input_object(stream));
		_csetf_dictionary_test(v_dictionary, symbol_function(cfasl_input_object(stream)));
		return v_dictionary;
	}

	public static SubLObject dictionary_keys(final SubLObject v_dictionary) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return list_utilities.alist_keys(database);
		}
		if (pcase_var.eql($HASHTABLE)) {
			return hash_table_utilities.hash_table_keys(database);
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject dictionary_values(final SubLObject v_dictionary) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return list_utilities.alist_values(database);
		}
		if (pcase_var.eql($HASHTABLE)) {
			return hash_table_utilities.hash_table_values(database);
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject dictionary_rebuild(final SubLObject v_dictionary) {
		assert NIL != dictionary_p(v_dictionary) : "dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) " + v_dictionary;
		final SubLObject database = dictionary_database(v_dictionary);
		final SubLObject pcase_var = dictionary_database_style(database);
		if (pcase_var.eql($ALIST)) {
			return v_dictionary;
		}
		if (pcase_var.eql($HASHTABLE)) {
			hash_table_utilities.rehash(database);
			return v_dictionary;
		}
		return dictionary_style_error(v_dictionary);
	}

	public static SubLObject declare_dictionary_file() {
		declareFunction(me, "dictionary_print_function_trampoline", "DICTIONARY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction(me, "dictionary_p", "DICTIONARY-P", 1, 0, false);
		new dictionary.$dictionary_p$UnaryFunction();
		declareFunction(me, "dictionary_database", "DICTIONARY-DATABASE", 1, 0, false);
		declareFunction(me, "dictionary_test", "DICTIONARY-TEST", 1, 0, false);
		declareFunction(me, "_csetf_dictionary_database", "_CSETF-DICTIONARY-DATABASE", 2, 0, false);
		declareFunction(me, "_csetf_dictionary_test", "_CSETF-DICTIONARY-TEST", 2, 0, false);
		declareFunction(me, "make_dictionary", "MAKE-DICTIONARY", 0, 1, false);
		declareFunction(me, "visit_defstruct_dictionary", "VISIT-DEFSTRUCT-DICTIONARY", 2, 0, false);
		declareFunction(me, "visit_defstruct_object_dictionary_method", "VISIT-DEFSTRUCT-OBJECT-DICTIONARY-METHOD", 2, 0, false);
		declareFunction(me, "print_dictionary", "PRINT-DICTIONARY", 3, 0, false);
		declareFunction(me, "dictionary_database_style", "DICTIONARY-DATABASE-STYLE", 1, 0, false);
		declareFunction(me, "dictionary_style", "DICTIONARY-STYLE", 1, 0, false);
		declareFunction(me, "dictionary_style_error", "DICTIONARY-STYLE-ERROR", 1, 0, false);
		declareFunction(me, "dictionary_empty_alist_style", "DICTIONARY-EMPTY-ALIST-STYLE", 2, 0, false);
		declareFunction(me, "dictionary_size_alist_style", "DICTIONARY-SIZE-ALIST-STYLE", 2, 0, false);
		declareFunction(me, "dictionary_lookup_alist_style", "DICTIONARY-LOOKUP-ALIST-STYLE", 4, 0, false);
		declareFunction(me, "dictionary_lookup_without_values_alist_style", "DICTIONARY-LOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false);
		declareFunction(me, "dictionary_enter_alist_style", "DICTIONARY-ENTER-ALIST-STYLE", 4, 0, false);
		declareFunction(me, "dictionary_remove_alist_style", "DICTIONARY-REMOVE-ALIST-STYLE", 3, 0, false);
		declareFunction(me, "dictionary_optimize_alist_style", "DICTIONARY-OPTIMIZE-ALIST-STYLE", 3, 0, false);
		declareFunction(me, "make_hashtable_dictionary_from_alist", "MAKE-HASHTABLE-DICTIONARY-FROM-ALIST", 2, 0, false);
		declareFunction(me, "dictionary_empty_hashtable_style", "DICTIONARY-EMPTY-HASHTABLE-STYLE", 2, 0, false);
		declareFunction(me, "dictionary_size_hashtable_style", "DICTIONARY-SIZE-HASHTABLE-STYLE", 2, 0, false);
		declareFunction(me, "dictionary_lookup_hashtable_style", "DICTIONARY-LOOKUP-HASHTABLE-STYLE", 4, 0, false);
		declareFunction(me, "dictionary_lookup_without_values_hashtable_style", "DICTIONARY-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE", 4, 0, false);
		declareFunction(me, "dictionary_enter_hashtable_style", "DICTIONARY-ENTER-HASHTABLE-STYLE", 4, 0, false);
		declareFunction(me, "dictionary_remove_hashtable_style", "DICTIONARY-REMOVE-HASHTABLE-STYLE", 3, 0, false);
		declareFunction(me, "dictionary_optimize_hashtable_style", "DICTIONARY-OPTIMIZE-HASHTABLE-STYLE", 3, 0, false);
		declareFunction(me, "make_alist_dictionary_from_hashtable", "MAKE-ALIST-DICTIONARY-FROM-HASHTABLE", 2, 0, false);
		declareFunction(me, "new_dictionary", "NEW-DICTIONARY", 0, 2, false);
		declareFunction(me, "clear_dictionary", "CLEAR-DICTIONARY", 1, 0, false);
		declareFunction(me, "dictionary_length", "DICTIONARY-LENGTH", 1, 0, false);
		declareFunction(me, "dictionary_empty_p", "DICTIONARY-EMPTY-P", 1, 0, false);
		declareFunction(me, "non_empty_dictionary_p", "NON-EMPTY-DICTIONARY-P", 1, 0, false);
		declareFunction(me, "dictionary_lookup", "DICTIONARY-LOOKUP", 2, 1, false);
		declareFunction(me, "dictionary_lookup_without_values", "DICTIONARY-LOOKUP-WITHOUT-VALUES", 2, 1, false);
		declareFunction(me, "dictionary_enter", "DICTIONARY-ENTER", 3, 0, false);
		declareFunction(me, "dictionary_remove", "DICTIONARY-REMOVE", 2, 0, false);
		declareFunction(me, "dictionary_optimize", "DICTIONARY-OPTIMIZE", 2, 0, false);
		declareFunction(me, "new_dictionary_iterator", "NEW-DICTIONARY-ITERATOR", 1, 0, false);
		declareMacro(me, "do_dictionary", "DO-DICTIONARY");
		declareFunction(me, "dictionary_contents", "DICTIONARY-CONTENTS", 1, 0, false);
		declareMacro(me, "do_dictionary_progress", "DO-DICTIONARY-PROGRESS");
		declareFunction(me, "mapdictionary", "MAPDICTIONARY", 2, 0, false);
		declareFunction(me, "mapdictionary_parameterized", "MAPDICTIONARY-PARAMETERIZED", 3, 0, false);
		declareFunction(me, "cfasl_output_object_dictionary_method", "CFASL-OUTPUT-OBJECT-DICTIONARY-METHOD", 2, 0, false);
		declareFunction(me, "cfasl_output_dictionary", "CFASL-OUTPUT-DICTIONARY", 2, 0, false);
		declareFunction(me, "cfasl_input_dictionary", "CFASL-INPUT-DICTIONARY", 1, 0, false);
		new dictionary.$cfasl_input_dictionary$UnaryFunction();
		declareFunction(me, "cfasl_input_dictionary_content_alist_style", "CFASL-INPUT-DICTIONARY-CONTENT-ALIST-STYLE", 3, 0, false);
		declareFunction(me, "cfasl_input_dictionary_content_hashtable_style", "CFASL-INPUT-DICTIONARY-CONTENT-HASHTABLE-STYLE", 3, 0, false);
		declareFunction(me, "cfasl_input_dictionary_content_logically", "CFASL-INPUT-DICTIONARY-CONTENT-LOGICALLY", 3, 0, false);
		declareFunction(me, "cfasl_input_legacy_dictionary", "CFASL-INPUT-LEGACY-DICTIONARY", 1, 0, false);
		declareFunction(me, "dictionary_keys", "DICTIONARY-KEYS", 1, 0, false);
		declareFunction(me, "dictionary_values", "DICTIONARY-VALUES", 1, 0, false);
		declareFunction(me, "dictionary_rebuild", "DICTIONARY-REBUILD", 1, 0, false);
		return NIL;
	}

	public static SubLObject init_dictionary_file() {
		deflexical("*DICTIONARY-HIGH-WATER-MARK*", TWELVE_INTEGER);
		deflexical("*DICTIONARY-LOW-WATER-MARK*", EIGHT_INTEGER);
		defconstant("*DTP-DICTIONARY*", DICTIONARY);
		defconstant("*CFASL-OPCODE-DICTIONARY*", $int$61);
		defconstant("*CFASL-OPCODE-LEGACY-DICTIONARY*", $int$64);
		return NIL;
	}

	public static SubLObject setup_dictionary_file() {
		register_method($print_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), symbol_function(DICTIONARY_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list9);
		def_csetf(DICTIONARY_DATABASE, _CSETF_DICTIONARY_DATABASE);
		def_csetf(DICTIONARY_TEST, _CSETF_DICTIONARY_TEST);
		identity(DICTIONARY);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DICTIONARY_METHOD));
		SubLSpecialOperatorDeclarations.proclaim($list26);
		SubLSpecialOperatorDeclarations.proclaim($list31);
		SubLSpecialOperatorDeclarations.proclaim($list32);
		register_macro_helper(DICTIONARY_CONTENTS, DO_DICTIONARY);
		register_cfasl_input_function($cfasl_opcode_dictionary$.getGlobalValue(), CFASL_INPUT_DICTIONARY);
		register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD));
		register_cfasl_input_function($cfasl_opcode_legacy_dictionary$.getGlobalValue(), CFASL_INPUT_LEGACY_DICTIONARY);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_dictionary_file();
	}

	@Override
	public void initializeVariables() {
		init_dictionary_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_dictionary_file();
	}

	

	public static final class $dictionary_native extends SubLStructNative {
		public SubLObject $database;

		public SubLObject $test;

		private static final SubLStructDeclNative structDecl;

		private $dictionary_native() {
			this.$database = Lisp.NIL;
			this.$test = Lisp.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return this.$database;
		}

		@Override
		public SubLObject getField3() {
			return this.$test;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return this.$database = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value) {
			return this.$test = value;
		}

		static {
			structDecl = makeStructDeclNative($dictionary_native.class, DICTIONARY, DICTIONARY_P, $list3, $list4, new String[] { "$database", "$test" }, $list5, $list6, PRINT_DICTIONARY);
		}
	}

	public static final class $dictionary_p$UnaryFunction extends UnaryFunction {
		public $dictionary_p$UnaryFunction() {
			super(extractFunctionNamed("DICTIONARY-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return dictionary_p(arg1);
		}
	}

	public static final class $cfasl_input_dictionary$UnaryFunction extends UnaryFunction {
		public $cfasl_input_dictionary$UnaryFunction() {
			super(extractFunctionNamed("CFASL-INPUT-DICTIONARY"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return cfasl_input_dictionary(arg1);
		}
	}
}

/**
 * Total time: 177 ms
 */
