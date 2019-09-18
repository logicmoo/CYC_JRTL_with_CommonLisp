/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.nl_stats;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$suspend_type_checkingP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.genls_hierarchy_problems;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexification_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mysentient_concept_extractor;
import com.cyc.cycjava.cycl.mysentient_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.rkf_term_utilities;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      LEARNED-NOUNS
 *  source file: /cyc/top/cycl/nl-stats/learned-nouns.lisp
 *  created:     2019/07/03 17:39:02
 */
public final class learned_nouns extends SubLTranslatedFile implements V02 {
	// // Constructor
	private learned_nouns() {
	}

	public static final SubLFile me = new learned_nouns();

	// // Definitions
	public static final SubLObject do_learned_nouns(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt0);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject noun_var = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt0);
					noun_var = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = NIL;
						SubLObject rest = current;
						SubLObject bad = NIL;
						SubLObject current_1 = NIL;
						for (; NIL != rest;) {
							destructuring_bind_must_consp(rest, datum, $list_alt0);
							current_1 = rest.first();
							rest = rest.rest();
							destructuring_bind_must_consp(rest, datum, $list_alt0);
							if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
								bad = T;
							}
							if (current_1 == $ALLOW_OTHER_KEYS) {
								allow_other_keys_p = rest.first();
							}
							rest = rest.rest();
						}
						if ((NIL != bad) && (NIL == allow_other_keys_p)) {
							cdestructuring_bind_error(datum, $list_alt0);
						}
						{
							SubLObject learned_tail = property_list_member($LEARNED, current);
							SubLObject learned = (NIL != learned_tail) ? ((SubLObject) (cadr(learned_tail))) : SELF;
							current = temp;
							{
								SubLObject body = current;
								SubLObject string_var = $sym5$STRING_VAR;
								return listS(DO_DICTIONARY, list(string_var, noun_var, list(GET_LEARNED_NOUNS_DICTIONARY_OF_NOUNS, learned)), list(IGNORE, string_var), append(body, NIL));
							}
						}
					}
				}
			}
		}
	}

	/**
	 * Iterate through the simple nouns in LEARNED, binding each one in sequence to NOUN-VAR
	 *
	 * @param COUNT-THRESHOLD;
	 * 		non-negative-integer-p: iterate only through nouns that occurred at least this many times
	 * @param CONFIDENCE-THRESHOLD;
	 * 		numberp or NIL: if non-nil, we iterate only through nouns that are tagged with
	 * 		confidence greater than this number
	 * @param STATUSES;
	 * 		listp of keywordp or :ALL: if listp, we iterate only through nouns whose status in Cyc is in
	 * 		this list.
	 * 		Possible statuses: :KNOWN-AND-LEXIFIED :KNOWN-BUT-UNLEXIFIED :UNKNOWN
	 */
	public static final SubLObject do_learned_simple_nouns(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt9);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject noun_var = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt9);
					noun_var = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = NIL;
						SubLObject rest = current;
						SubLObject bad = NIL;
						SubLObject current_2 = NIL;
						for (; NIL != rest;) {
							destructuring_bind_must_consp(rest, datum, $list_alt9);
							current_2 = rest.first();
							rest = rest.rest();
							destructuring_bind_must_consp(rest, datum, $list_alt9);
							if (NIL == member(current_2, $list_alt10, UNPROVIDED, UNPROVIDED)) {
								bad = T;
							}
							if (current_2 == $ALLOW_OTHER_KEYS) {
								allow_other_keys_p = rest.first();
							}
							rest = rest.rest();
						}
						if ((NIL != bad) && (NIL == allow_other_keys_p)) {
							cdestructuring_bind_error(datum, $list_alt9);
						}
						{
							SubLObject learned_tail = property_list_member($LEARNED, current);
							SubLObject learned = (NIL != learned_tail) ? ((SubLObject) (cadr(learned_tail))) : SELF;
							SubLObject count_threshold_tail = property_list_member($COUNT_THRESHOLD, current);
							SubLObject count_threshold = (NIL != count_threshold_tail) ? ((SubLObject) (cadr(count_threshold_tail))) : ZERO_INTEGER;
							SubLObject confidence_threshold_tail = property_list_member($CONFIDENCE_THRESHOLD, current);
							SubLObject confidence_threshold = (NIL != confidence_threshold_tail) ? ((SubLObject) (cadr(confidence_threshold_tail))) : NIL;
							SubLObject statuses_tail = property_list_member($STATUSES, current);
							SubLObject statuses = (NIL != statuses_tail) ? ((SubLObject) (cadr(statuses_tail))) : $ALL;
							current = temp;
							{
								SubLObject body = current;
								SubLObject count_threshold_var = $sym15$COUNT_THRESHOLD_VAR;
								SubLObject confidence_threshold_var = $sym16$CONFIDENCE_THRESHOLD_VAR;
								SubLObject statuses_var = $sym17$STATUSES_VAR;
								SubLObject string_var = $sym18$STRING_VAR;
								return list(CLET, list(list(count_threshold_var, count_threshold), list(confidence_threshold_var, confidence_threshold), list(statuses_var, statuses)), list(DO_DICTIONARY, list(string_var, noun_var, list(GET_LEARNED_NOUNS_DICTIONARY_OF_NOUNS, learned)), list(IGNORE, string_var), listS(PWHEN,
										list(CAND, list(SIMPLE_NOUN_P, noun_var), list($sym23$__, listS(FIM, noun_var, $list_alt25), count_threshold_var), list(COR, list(NULL, confidence_threshold_var), list($sym28$_, listS(FIM, noun_var, $list_alt29), confidence_threshold_var)), list(COR, listS(EQ, statuses_var, $list_alt30), listS($sym31$MEMBER_, listS(FIM, noun_var, $list_alt32), statuses_var, $list_alt33))),
										append(body, NIL))));
							}
						}
					}
				}
			}
		}
	}

	public static final SubLObject generate_constant_name_for_noun(SubLObject noun) {
		return delete(CHAR_space, Strings.string_capitalize(noun, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject get_learned_nouns_noun_relevance_count_threshold(SubLObject v_learned_nouns) {
		return classes.subloop_get_access_protected_instance_slot(v_learned_nouns, THREE_INTEGER, NOUN_RELEVANCE_COUNT_THRESHOLD);
	}

	public static final SubLObject set_learned_nouns_noun_relevance_count_threshold(SubLObject v_learned_nouns, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_learned_nouns, value, THREE_INTEGER, NOUN_RELEVANCE_COUNT_THRESHOLD);
	}

	public static final SubLObject get_learned_nouns_calculate_tag_method(SubLObject v_learned_nouns) {
		return classes.subloop_get_access_protected_instance_slot(v_learned_nouns, TWO_INTEGER, CALCULATE_TAG_METHOD);
	}

	public static final SubLObject set_learned_nouns_calculate_tag_method(SubLObject v_learned_nouns, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_learned_nouns, value, TWO_INTEGER, CALCULATE_TAG_METHOD);
	}

	public static final SubLObject get_learned_nouns_dictionary_of_nouns(SubLObject v_learned_nouns) {
		return classes.subloop_get_access_protected_instance_slot(v_learned_nouns, ONE_INTEGER, DICTIONARY_OF_NOUNS);
	}

	public static final SubLObject set_learned_nouns_dictionary_of_nouns(SubLObject v_learned_nouns, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_learned_nouns, value, ONE_INTEGER, DICTIONARY_OF_NOUNS);
	}

	public static final SubLObject get_learned_nouns_calculate_tag_methods(SubLObject v_learned_nouns) {
		{
			SubLObject v_class = (v_learned_nouns.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_learned_nouns))) : NIL != subloop_structures.class_p(v_learned_nouns) ? ((SubLObject) (v_learned_nouns)) : NIL != subloop_structures.instance_p(v_learned_nouns) ? ((SubLObject) (subloop_structures.instance_class(v_learned_nouns))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(CALCULATE_TAG_METHODS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
			}
			return NIL;
		}
	}

	public static final SubLObject set_learned_nouns_calculate_tag_methods(SubLObject v_learned_nouns, SubLObject value) {
		{
			SubLObject v_class = (v_learned_nouns.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_learned_nouns))) : NIL != subloop_structures.class_p(v_learned_nouns) ? ((SubLObject) (v_learned_nouns)) : NIL != subloop_structures.instance_p(v_learned_nouns) ? ((SubLObject) (subloop_structures.instance_class(v_learned_nouns))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(CALCULATE_TAG_METHODS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
			}
			return NIL;
		}
	}

	public static final SubLObject get_learned_nouns_typicality_sum_calculate_tag_methods(SubLObject v_learned_nouns) {
		{
			SubLObject v_class = (v_learned_nouns.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_learned_nouns))) : NIL != subloop_structures.class_p(v_learned_nouns) ? ((SubLObject) (v_learned_nouns)) : NIL != subloop_structures.instance_p(v_learned_nouns) ? ((SubLObject) (subloop_structures.instance_class(v_learned_nouns))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TYPICALITY_SUM_CALCULATE_TAG_METHODS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
			}
			return NIL;
		}
	}

	public static final SubLObject set_learned_nouns_typicality_sum_calculate_tag_methods(SubLObject v_learned_nouns, SubLObject value) {
		{
			SubLObject v_class = (v_learned_nouns.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_learned_nouns))) : NIL != subloop_structures.class_p(v_learned_nouns) ? ((SubLObject) (v_learned_nouns)) : NIL != subloop_structures.instance_p(v_learned_nouns) ? ((SubLObject) (subloop_structures.instance_class(v_learned_nouns))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TYPICALITY_SUM_CALCULATE_TAG_METHODS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
			}
			return NIL;
		}
	}

	public static final SubLObject get_learned_nouns_default_calculate_tag_method(SubLObject v_learned_nouns) {
		{
			SubLObject v_class = (v_learned_nouns.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_learned_nouns))) : NIL != subloop_structures.class_p(v_learned_nouns) ? ((SubLObject) (v_learned_nouns)) : NIL != subloop_structures.instance_p(v_learned_nouns) ? ((SubLObject) (subloop_structures.instance_class(v_learned_nouns))) : NIL;
			if (NIL != v_class) {
				return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
			}
			return NIL;
		}
	}

	public static final SubLObject set_learned_nouns_default_calculate_tag_method(SubLObject v_learned_nouns, SubLObject value) {
		{
			SubLObject v_class = (v_learned_nouns.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_learned_nouns))) : NIL != subloop_structures.class_p(v_learned_nouns) ? ((SubLObject) (v_learned_nouns)) : NIL != subloop_structures.instance_p(v_learned_nouns) ? ((SubLObject) (subloop_structures.instance_class(v_learned_nouns))) : NIL;
			if (NIL != v_class) {
				return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
			}
			return NIL;
		}
	}

	public static final SubLObject get_learned_nouns_default_magic_number(SubLObject v_learned_nouns) {
		{
			SubLObject v_class = (v_learned_nouns.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_learned_nouns))) : NIL != subloop_structures.class_p(v_learned_nouns) ? ((SubLObject) (v_learned_nouns)) : NIL != subloop_structures.instance_p(v_learned_nouns) ? ((SubLObject) (subloop_structures.instance_class(v_learned_nouns))) : NIL;
			if (NIL != v_class) {
				return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
			}
			return NIL;
		}
	}

	public static final SubLObject set_learned_nouns_default_magic_number(SubLObject v_learned_nouns, SubLObject value) {
		{
			SubLObject v_class = (v_learned_nouns.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_learned_nouns))) : NIL != subloop_structures.class_p(v_learned_nouns) ? ((SubLObject) (v_learned_nouns)) : NIL != subloop_structures.instance_p(v_learned_nouns) ? ((SubLObject) (subloop_structures.instance_class(v_learned_nouns))) : NIL;
			if (NIL != v_class) {
				return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
			}
			return NIL;
		}
	}

	public static final SubLObject subloop_reserved_initialize_learned_nouns_class(SubLObject new_instance) {
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
		classes.subloop_initialize_slot(new_instance, LEARNED_NOUNS, DEFAULT_MAGIC_NUMBER, $float$0_51);
		classes.subloop_initialize_slot(new_instance, LEARNED_NOUNS, DEFAULT_CALCULATE_TAG_METHOD, $APMI_SUM_WEIGHTED_BY_SELECTIVENESS);
		classes.subloop_initialize_slot(new_instance, LEARNED_NOUNS, TYPICALITY_SUM_CALCULATE_TAG_METHODS, list(listS($SA_SUM, symbol_function(SELECTIONAL_ASSOCIATION), $list_alt49), listS($APMI_SUM, symbol_function(ADJUSTED_POINTWISE_MUTUAL_INFORMATION), $list_alt49), listS($APMI_SUM_WEIGHTED_BY_SELECTIVENESS, symbol_function(ADJUSTED_POINTWISE_MUTUAL_INFORMATION), $list_alt52)));
		classes.subloop_initialize_slot(new_instance, LEARNED_NOUNS, CALCULATE_TAG_METHODS, append(list_utilities.alist_keys(instances.get_slot(LEARNED_NOUNS, TYPICALITY_SUM_CALCULATE_TAG_METHODS)), $list_alt53));
		return NIL;
	}

	public static final SubLObject subloop_reserved_initialize_learned_nouns_instance(SubLObject new_instance) {
		classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
		classes.subloop_initialize_slot(new_instance, LEARNED_NOUNS, DICTIONARY_OF_NOUNS, NIL);
		classes.subloop_initialize_slot(new_instance, LEARNED_NOUNS, CALCULATE_TAG_METHOD, NIL);
		classes.subloop_initialize_slot(new_instance, LEARNED_NOUNS, NOUN_RELEVANCE_COUNT_THRESHOLD, NIL);
		return NIL;
	}

	public static final SubLObject learned_nouns_p(SubLObject v_learned_nouns) {
		return classes.subloop_instanceof_class(v_learned_nouns, LEARNED_NOUNS);
	}

	public static final SubLObject new_learned_nouns(SubLObject noun_relevance_count_threshold, SubLObject calculate_tag_method, SubLObject size) {
		if (calculate_tag_method == UNPROVIDED) {
			calculate_tag_method = NIL;
		}
		if (size == UNPROVIDED) {
			size = ZERO_INTEGER;
		}
		{
			SubLObject learned = object.new_class_instance(LEARNED_NOUNS);
			set_learned_nouns_noun_relevance_count_threshold(learned, noun_relevance_count_threshold);
			if (NIL != calculate_tag_method) {
				set_learned_nouns_calculate_tag_method(learned, calculate_tag_method);
			} else {
				methods.funcall_instance_method_with_0_args(learned, SET_CALCULATE_TAG_METHOD_TO_DEFAULT);
			}
			set_learned_nouns_dictionary_of_nouns(learned, dictionary.new_dictionary(symbol_function(EQUALP), size));
			return learned;
		}
	}

	public static final SubLObject learned_nouns_set_calculate_tag_method_to_default_method(SubLObject self) {
		{
			SubLObject catch_var_for_learned_nouns_method = NIL;
			SubLObject default_calculate_tag_method = get_learned_nouns_default_calculate_tag_method(self);
			SubLObject calculate_tag_method = get_learned_nouns_calculate_tag_method(self);
			try {
				try {
					calculate_tag_method = default_calculate_tag_method;
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_learned_nouns_default_calculate_tag_method(self, default_calculate_tag_method);
							set_learned_nouns_calculate_tag_method(self, calculate_tag_method);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_learned_nouns_method = Errors.handleThrowable(ccatch_env_var, $sym61$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD);
			}
			return catch_var_for_learned_nouns_method;
		}
	}

	public static final SubLObject learned_nouns_typicality_sum_calculate_tag_method_p_method(SubLObject self, SubLObject v_object) {
		{
			SubLObject catch_var_for_learned_nouns_method = NIL;
			SubLObject typicality_sum_calculate_tag_methods = get_learned_nouns_typicality_sum_calculate_tag_methods(self);
			try {
				try {
					sublisp_throw($sym67$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD, member(v_object, typicality_sum_calculate_tag_methods, symbol_function(EQ), symbol_function(CAR)));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_learned_nouns_typicality_sum_calculate_tag_methods(self, typicality_sum_calculate_tag_methods);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_learned_nouns_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD);
			}
			return catch_var_for_learned_nouns_method;
		}
	}

	public static final SubLObject learned_nouns_calculate_tag_method_p_method(SubLObject self, SubLObject v_object) {
		{
			SubLObject catch_var_for_learned_nouns_method = NIL;
			SubLObject calculate_tag_methods = get_learned_nouns_calculate_tag_methods(self);
			try {
				try {
					sublisp_throw($sym72$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD, member(v_object, calculate_tag_methods, symbol_function(EQ), UNPROVIDED));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_learned_nouns_calculate_tag_methods(self, calculate_tag_methods);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_learned_nouns_method = Errors.handleThrowable(ccatch_env_var, $sym72$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD);
			}
			return catch_var_for_learned_nouns_method;
		}
	}

	public static final SubLObject learned_nouns_associated_typicality_metric_method(SubLObject self, SubLObject typicality_sum_calculate_tag_method) {
		{
			SubLObject catch_var_for_learned_nouns_method = NIL;
			SubLObject typicality_sum_calculate_tag_methods = get_learned_nouns_typicality_sum_calculate_tag_methods(self);
			try {
				try {
					sublisp_throw($sym77$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD, list_utilities.alist_lookup(typicality_sum_calculate_tag_methods, typicality_sum_calculate_tag_method, symbol_function(EQ), UNPROVIDED).first());
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_learned_nouns_typicality_sum_calculate_tag_methods(self, typicality_sum_calculate_tag_methods);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_learned_nouns_method = Errors.handleThrowable(ccatch_env_var, $sym77$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD);
			}
			return catch_var_for_learned_nouns_method;
		}
	}

	public static final SubLObject learned_nouns_associated_summand_weightingP_method(SubLObject self, SubLObject typicality_sum_calculate_tag_method) {
		{
			SubLObject catch_var_for_learned_nouns_method = NIL;
			SubLObject typicality_sum_calculate_tag_methods = get_learned_nouns_typicality_sum_calculate_tag_methods(self);
			try {
				try {
					sublisp_throw($sym81$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD, second(list_utilities.alist_lookup(typicality_sum_calculate_tag_methods, typicality_sum_calculate_tag_method, symbol_function(EQ), UNPROVIDED)));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_learned_nouns_typicality_sum_calculate_tag_methods(self, typicality_sum_calculate_tag_methods);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_learned_nouns_method = Errors.handleThrowable(ccatch_env_var, $sym81$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD);
			}
			return catch_var_for_learned_nouns_method;
		}
	}

	/**
	 * Create a new constant with a name based on NAME, and assert in MT that it was reified using TOOL.
	 *
	 * @return constant-p: the newly-created constant
	 */
	public static final SubLObject create_constant_using_tool(SubLObject name, SubLObject tool, SubLObject mt, SubLObject suffix) {
		if (suffix == UNPROVIDED) {
			suffix = $str_alt83$;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLSystemTrampolineFile.checkType(name, STRINGP);
			{
				SubLObject new_constant = NIL;
				{
					SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
					SubLObject _prev_bind_1 = rkf_term_utilities.$rkf_name_suffix$.currentBinding(thread);
					try {
						rkf_term_utilities.$rkf_name_prefix$.bind($str_alt83$, thread);
						rkf_term_utilities.$rkf_name_suffix$.bind(suffix, thread);
						new_constant = rkf_term_utilities.rkf_create(name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					} finally {
						rkf_term_utilities.$rkf_name_suffix$.rebind(_prev_bind_1, thread);
						rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
					}
				}
				ke.ke_assert_now(list($$reifiedUsingTool, new_constant, tool), mt, UNPROVIDED, UNPROVIDED);
				return new_constant;
			}
		}
	}

	public static final SubLObject ke_assert_using_tool_now_or_push_error_onto(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject formula = NIL;
			SubLObject mt = NIL;
			SubLObject tool = NIL;
			SubLObject error_data = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt86);
			formula = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt86);
			mt = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt86);
			tool = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt86);
			error_data = current.first();
			current = current.rest();
			{
				SubLObject allow_other_keys_p = NIL;
				SubLObject rest = current;
				SubLObject bad = NIL;
				SubLObject current_3 = NIL;
				for (; NIL != rest;) {
					destructuring_bind_must_consp(rest, datum, $list_alt86);
					current_3 = rest.first();
					rest = rest.rest();
					destructuring_bind_must_consp(rest, datum, $list_alt86);
					if (NIL == member(current_3, $list_alt87, UNPROVIDED, UNPROVIDED)) {
						bad = T;
					}
					if (current_3 == $ALLOW_OTHER_KEYS) {
						allow_other_keys_p = rest.first();
					}
					rest = rest.rest();
				}
				if ((NIL != bad) && (NIL == allow_other_keys_p)) {
					cdestructuring_bind_error(datum, $list_alt86);
				}
				{
					SubLObject meta_mt_tail = property_list_member($META_MT, current);
					SubLObject meta_mt = (NIL != meta_mt_tail) ? ((SubLObject) (cadr(meta_mt_tail))) : mt;
					SubLObject strength_tail = property_list_member($STRENGTH, current);
					SubLObject strength = (NIL != strength_tail) ? ((SubLObject) (cadr(strength_tail))) : $DEFAULT;
					SubLObject direction_tail = property_list_member($DIRECTION, current);
					SubLObject direction = (NIL != direction_tail) ? ((SubLObject) (cadr(direction_tail))) : NIL;
					SubLObject meta_strength_tail = property_list_member($META_STRENGTH, current);
					SubLObject meta_strength = (NIL != meta_strength_tail) ? ((SubLObject) (cadr(meta_strength_tail))) : strength;
					SubLObject meta_direction_tail = property_list_member($META_DIRECTION, current);
					SubLObject meta_direction = (NIL != meta_direction_tail) ? ((SubLObject) (cadr(meta_direction_tail))) : direction;
					SubLObject success_var = $sym94$SUCCESS_VAR;
					SubLObject error_datum_var = $sym95$ERROR_DATUM_VAR;
					return list(CMULTIPLE_VALUE_BIND, list(success_var, error_datum_var), list(new SubLObject[] { KE_ASSERT_USING_TOOL_NOW, formula, mt, tool, meta_mt, strength, direction, meta_strength, meta_direction }), list(PUNLESS, listS(EQ, success_var, $list_alt99), list(CPUSH, error_datum_var, error_data)));
				}
			}
		}
	}

	public static final SubLObject ke_assert_now_or_push_error_onto(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject formula = NIL;
			SubLObject mt = NIL;
			SubLObject error_data = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt101);
			formula = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt101);
			mt = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt101);
			error_data = current.first();
			current = current.rest();
			{
				SubLObject allow_other_keys_p = NIL;
				SubLObject rest = current;
				SubLObject bad = NIL;
				SubLObject current_4 = NIL;
				for (; NIL != rest;) {
					destructuring_bind_must_consp(rest, datum, $list_alt101);
					current_4 = rest.first();
					rest = rest.rest();
					destructuring_bind_must_consp(rest, datum, $list_alt101);
					if (NIL == member(current_4, $list_alt102, UNPROVIDED, UNPROVIDED)) {
						bad = T;
					}
					if (current_4 == $ALLOW_OTHER_KEYS) {
						allow_other_keys_p = rest.first();
					}
					rest = rest.rest();
				}
				if ((NIL != bad) && (NIL == allow_other_keys_p)) {
					cdestructuring_bind_error(datum, $list_alt101);
				}
				{
					SubLObject strength_tail = property_list_member($STRENGTH, current);
					SubLObject strength = (NIL != strength_tail) ? ((SubLObject) (cadr(strength_tail))) : $DEFAULT;
					SubLObject direction_tail = property_list_member($DIRECTION, current);
					SubLObject direction = (NIL != direction_tail) ? ((SubLObject) (cadr(direction_tail))) : NIL;
					SubLObject successP_var = $sym103$SUCCESS__VAR;
					SubLObject error_datum_var = $sym104$ERROR_DATUM_VAR;
					return list(CMULTIPLE_VALUE_BIND, list(successP_var, error_datum_var), list(KE_ASSERT_NOW, formula, mt, strength, direction), list(PUNLESS, successP_var, list(CPUSH, error_datum_var, error_data)));
				}
			}
		}
	}

	/**
	 * Attempt to assert FORMULA in MT now and add operation to transcript.
	 * If successful, subsequently attempt to meta-assert (#$assertedUsingTool FORMULA TOOL) in META-MT.
	 *
	 * @return 0 keywordp; :SUCCESS         if both assertions succeeded
	:FAILURE-PARTIAL if the first succeeded and the second failed
	:FAILURE         if the first failed (in which case the second was not attempted)
	 * @return 1 listp; error list of form (ERROR-TYPE ERROR-STRING), if there was any failure
	 */
	public static final SubLObject ke_assert_using_tool_now(SubLObject formula, SubLObject mt, SubLObject tool, SubLObject meta_mt, SubLObject strength, SubLObject direction, SubLObject meta_strength, SubLObject meta_direction) {
		if (meta_mt == UNPROVIDED) {
			meta_mt = mt;
		}
		if (strength == UNPROVIDED) {
			strength = $DEFAULT;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		if (meta_strength == UNPROVIDED) {
			meta_strength = strength;
		}
		if (meta_direction == UNPROVIDED) {
			meta_direction = direction;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject initial_successP = ke.ke_assert_now(formula, mt, strength, direction);
				SubLObject error = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL != initial_successP) {
					thread.resetMultipleValues();
					{
						SubLObject meta_successP = ke.ke_assert_now(list($$assertedUsingTool, formula, tool), meta_mt, meta_strength, meta_direction);
						SubLObject error_5 = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (NIL != meta_successP) {
							return $SUCCESS;
						} else {
							return values($FAILURE_PARTIAL, error_5);
						}
					}
				} else {
					return values($FAILURE, error);
				}
			}
		}
	}

	public static final SubLObject get_sophisticated_isas_based_on_genls(SubLObject list_of_genls, SubLObject mt) {
		{
			SubLObject isas = NIL;
			SubLObject done = NIL;
			{
				SubLObject rest = NIL;
				for (rest = list_of_genls; !((NIL != done) || (NIL == rest)); rest = rest.rest()) {
					{
						SubLObject genl = rest.first();
						if (NIL != isa.isaP(genl, $$ExistingObjectType, mt, UNPROVIDED)) {
							{
								SubLObject item_var = $$ExistingObjectType;
								if (NIL == member(item_var, isas, symbol_function(EQ), symbol_function(IDENTITY))) {
									isas = cons(item_var, isas);
								}
							}
							done = T;
						}
					}
				}
			}
			{
				SubLObject rest = NIL;
				for (rest = list_of_genls; !((NIL != done) || (NIL == rest)); rest = rest.rest()) {
					{
						SubLObject genl = rest.first();
						if (NIL != isa.isaP(genl, $$TemporalStuffType, mt, UNPROVIDED)) {
							{
								SubLObject item_var = $$TemporalStuffType;
								if (NIL == member(item_var, isas, symbol_function(EQ), symbol_function(IDENTITY))) {
									isas = cons(item_var, isas);
								}
							}
							done = T;
						}
					}
				}
			}
			{
				SubLObject rest = NIL;
				for (rest = list_of_genls; !((NIL != done) || (NIL == rest)); rest = rest.rest()) {
					{
						SubLObject genl = rest.first();
						SubLObject collection_orders = isa.all_isas_wrt(genl, $$CollectionOrder, mt, UNPROVIDED);
						if (NIL == list_utilities.empty_list_p(collection_orders)) {
							{
								SubLObject item_var = collection_orders.first();
								if (NIL == member(item_var, isas, symbol_function(EQL), symbol_function(IDENTITY))) {
									isas = cons(item_var, isas);
								}
							}
							done = T;
						}
					}
				}
			}
			if (NIL != list_utilities.empty_list_p(isas)) {
				isas = cons($$Collection, isas);
			}
			return isas;
		}
	}

	/**
	 *
	 *
	 * @return list-of-list-p; a list (hopefully empty) of errors that occurred while attempting to make assertions,
	each of the form (ERROR-TYPE ERROR-STRING)
	 */
	public static final SubLObject learned_nouns_reify_noun_as_method(SubLObject self, SubLObject noun_string, SubLObject collection_or_individual, SubLObject list_of_types, SubLObject gloss, SubLObject needs_oeP, SubLObject taxonomy_mt, SubLObject lexical_mt) {
		if (gloss == UNPROVIDED) {
			gloss = NIL;
		}
		if (needs_oeP == UNPROVIDED) {
			needs_oeP = NIL;
		}
		if (taxonomy_mt == UNPROVIDED) {
			taxonomy_mt = $$TheMotleyFoolUKCorpusMt;
		}
		if (lexical_mt == UNPROVIDED) {
			lexical_mt = $$GeneralEnglishMt;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLSystemTrampolineFile.checkType(noun_string, STRINGP);
			{
				SubLObject tool = $$CycNounLearnerTool;
				SubLObject new_constant = create_constant_using_tool(noun_string, tool, taxonomy_mt, UNPROVIDED);
				SubLObject isa_or_genls = NIL;
				SubLObject error_data = NIL;
				SubLObject pcase_var = collection_or_individual;
				if (pcase_var.eql($COLLECTION)) {
					{
						SubLObject sophisticated_isas = get_sophisticated_isas_based_on_genls(list_of_types, taxonomy_mt);
						SubLObject cdolist_list_var = sophisticated_isas;
						SubLObject v_isa = NIL;
						for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_isa = cdolist_list_var.first()) {
							thread.resetMultipleValues();
							{
								SubLObject success_var = ke_assert_using_tool_now(list($$isa, new_constant, v_isa), taxonomy_mt, tool, taxonomy_mt, $DEFAULT, NIL, $DEFAULT, NIL);
								SubLObject error_datum_var = thread.secondMultipleValue();
								thread.resetMultipleValues();
								if (success_var != $SUCCESS) {
									error_data = cons(error_datum_var, error_data);
								}
							}
						}
					}
					isa_or_genls = $$genls;
				} else if (pcase_var.eql($INDIVIDUAL)) {
					isa_or_genls = $$isa;
				} else {
					Errors.error($str_alt124$_S_is_not__COLLECTION_or__INDIVID, collection_or_individual);
				}

				{
					SubLObject cdolist_list_var = list_of_types;
					SubLObject type = NIL;
					for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), type = cdolist_list_var.first()) {
						thread.resetMultipleValues();
						{
							SubLObject success_var = ke_assert_using_tool_now(list(isa_or_genls, new_constant, type), taxonomy_mt, tool, taxonomy_mt, $DEFAULT, NIL, $DEFAULT, NIL);
							SubLObject error_datum_var = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if (success_var != $SUCCESS) {
								error_data = cons(error_datum_var, error_data);
							}
						}
					}
				}
				thread.resetMultipleValues();
				{
					SubLObject success_var = ke_assert_using_tool_now(list($$termStrings, new_constant, noun_string), lexical_mt, tool, lexical_mt, $DEFAULT, NIL, $DEFAULT, NIL);
					SubLObject error_datum_var = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (success_var != $SUCCESS) {
						error_data = cons(error_datum_var, error_data);
					}
				}
				if (NIL != gloss) {
					thread.resetMultipleValues();
					{
						SubLObject success_var = ke_assert_using_tool_now(list($$nounLearnerSenseGloss, new_constant, gloss), taxonomy_mt, tool, taxonomy_mt, $DEFAULT, NIL, $DEFAULT, NIL);
						SubLObject error_datum_var = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (success_var != $SUCCESS) {
							error_data = cons(error_datum_var, error_data);
						}
					}
				}
				if (NIL != needs_oeP) {
					thread.resetMultipleValues();
					{
						SubLObject success_var = ke_assert_using_tool_now(list($$isa, new_constant, $$PoorlyOntologized), taxonomy_mt, tool, taxonomy_mt, $DEFAULT, NIL, $DEFAULT, NIL);
						SubLObject error_datum_var = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (success_var != $SUCCESS) {
							error_data = cons(error_datum_var, error_data);
						}
					}
				}
				return nreverse(error_data);
			}
		}
	}

	public static final SubLObject learned_nouns_lexify_term_as_noun_method(SubLObject self, SubLObject v_term, SubLObject noun_string, SubLObject lexical_mt) {
		if (lexical_mt == UNPROVIDED) {
			lexical_mt = $$GeneralEnglishMt;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject tool = $$CycNounLearnerTool;
				thread.resetMultipleValues();
				{
					SubLObject success = ke_assert_using_tool_now(list($$termStrings, v_term, noun_string), lexical_mt, tool, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					SubLObject error = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != error) {
						return list(error);
					} else {
						return NIL;
					}
				}
			}
		}
	}

	public static final SubLObject learned_nouns_reify_surname_method(SubLObject self, SubLObject name_string, SubLObject taxonony_mt, SubLObject lexical_mt) {
		if (taxonony_mt == UNPROVIDED) {
			taxonony_mt = $$TheMotleyFoolUKCorpusMt;
		}
		if (lexical_mt == UNPROVIDED) {
			lexical_mt = $$GeneralEnglishMt;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLSystemTrampolineFile.checkType(name_string, STRINGP);
			{
				SubLObject tool = $$CycNounLearnerTool;
				SubLObject error_data = NIL;
				SubLObject query_result = ask_utilities.ask_variable($sym136$_NAME, list($$and, list($$isa, $sym136$_NAME, $$Name), list($$nameSpelling, $sym136$_NAME, name_string)), $$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject name_constant = (NIL != query_result) ? ((SubLObject) (query_result.first())) : create_constant_using_tool(name_string, tool, taxonony_mt, $str_alt141$_TheName);
				if (NIL == isa.isa_in_any_mtP(name_constant, $$HumanSurname)) {
					thread.resetMultipleValues();
					{
						SubLObject success_var = ke_assert_using_tool_now(list($$isa, name_constant, $$HumanSurname), taxonony_mt, tool, taxonony_mt, $DEFAULT, NIL, $DEFAULT, NIL);
						SubLObject error_datum_var = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (success_var != $SUCCESS) {
							error_data = cons(error_datum_var, error_data);
						}
					}
				}
				if (NIL == query_result) {
					thread.resetMultipleValues();
					{
						SubLObject success_var = ke_assert_using_tool_now(list($$nameSpelling, name_constant, name_string), lexical_mt, tool, lexical_mt, $DEFAULT, NIL, $DEFAULT, NIL);
						SubLObject error_datum_var = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (success_var != $SUCCESS) {
							error_data = cons(error_datum_var, error_data);
						}
					}
				}
				return nreverse(error_data);
			}
		}
	}

	/**
	 * Record in the KB that NOUN-STRING was skipped in the #$CycNounLearnerTool by THE-CYCLIST just #$Now.
	 */
	public static final SubLObject learned_nouns_skip_noun_method(SubLObject self, SubLObject noun_string) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLSystemTrampolineFile.checkType(noun_string, STRINGP);
			{
				SubLObject mt = $$CycNounLearnerToolUserActivityMt;
				SubLObject new_skipping_event = NIL;
				SubLObject error_data = NIL;
				{
					SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
					try {
						rkf_term_utilities.$rkf_name_prefix$.bind($str_alt83$, thread);
						new_skipping_event = rkf_term_utilities.rkf_create(cconcatenate($str_alt148$skipping_of_, noun_string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					} finally {
						rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
					}
				}
				thread.resetMultipleValues();
				{
					SubLObject successP_var = ke.ke_assert_now(list($$isa, new_skipping_event, $$SkippingAStringInNounLearnerTool), mt, $DEFAULT, NIL);
					SubLObject error_datum_var = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL == successP_var) {
						error_data = cons(error_datum_var, error_data);
					}
				}
				thread.resetMultipleValues();
				{
					SubLObject successP_var = ke.ke_assert_now(list($$performedBy, new_skipping_event, operation_communication.the_cyclist()), mt, $DEFAULT, NIL);
					SubLObject error_datum_var = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL == successP_var) {
						error_data = cons(error_datum_var, error_data);
					}
				}
				thread.resetMultipleValues();
				{
					SubLObject successP_var = ke.ke_assert_now(list($$stringSkipped, new_skipping_event, noun_string), mt, $DEFAULT, NIL);
					SubLObject error_datum_var = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL == successP_var) {
						error_data = cons(error_datum_var, error_data);
					}
				}
				thread.resetMultipleValues();
				{
					SubLObject successP_var = ke.ke_assert_now(list($$endingDate, new_skipping_event, date_utilities.indexical_now()), mt, $DEFAULT, NIL);
					SubLObject error_datum_var = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL == successP_var) {
						error_data = cons(error_datum_var, error_data);
					}
				}
				return nreverse(error_data);
			}
		}
	}

	/**
	 * Return a list-representation of this object, where the elements of the list are lists of the following form:
	 * (<noun-string> <cyc-constant> <:genls or :isa or :equals>)
	 */
	public static final SubLObject learned_nouns_listify_method(SubLObject self) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
				SubLObject result = NIL;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_of_nouns));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject noun_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject noun_object = thread.secondMultipleValue();
						thread.resetMultipleValues();
						{
							SubLObject tag = methods.funcall_instance_method_with_0_args(noun_object, GET_TAG);
							SubLObject confidence = methods.funcall_instance_method_with_0_args(noun_object, GET_CONFIDENCE_LEVEL);
							SubLObject status = methods.funcall_instance_method_with_0_args(noun_object, GET_STATUS_IN_CYC);
							if (!tag.isKeyword()) {
								{
									SubLObject pcase_var = status;
									if (pcase_var.eql($KNOWN_AND_LEXIFIED)) {
									} else if (pcase_var.eql($KNOWN_BUT_UNLEXIFIED)) {
										result = cons(list(noun_string, tag, $EQUALS, confidence), result);
									} else if (pcase_var.eql($UNKNOWN)) {
										{
											SubLObject collection_or_individualP = methods.funcall_instance_method_with_0_args(noun_object, $sym164$COLLECTION_OR_INDIVIDUAL_);
											SubLObject genls_or_isa = NIL;
											SubLObject pcase_var_6 = collection_or_individualP;
											if (pcase_var_6.eql($COLLECTION)) {
												genls_or_isa = $GENLS;
											} else if (pcase_var_6.eql($INDIVIDUAL)) {
												genls_or_isa = $ISA;
											} else {
												Errors.error($str_alt167$Expecting__COLLECTION_or__INDIVID, collection_or_individualP);
											}

											result = cons(list(noun_string, tag, genls_or_isa, confidence), result);
										}
									} else {
										Errors.warn($str_alt168$The_noun__S_has_the_status__S_, noun_string, status);
									}

								}
							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				return result;
			}
		}
	}

	public static final SubLObject learned_nouns_print_tags_method(SubLObject self) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_of_nouns));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject noun_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject noun_object = thread.secondMultipleValue();
						thread.resetMultipleValues();
						{
							SubLObject tag = methods.funcall_instance_method_with_0_args(noun_object, GET_TAG);
							SubLObject confidence = methods.funcall_instance_method_with_0_args(noun_object, GET_CONFIDENCE_LEVEL);
							SubLObject status = methods.funcall_instance_method_with_0_args(noun_object, GET_STATUS_IN_CYC);
							if (!tag.isKeyword()) {
								{
									SubLObject pcase_var = status;
									if (pcase_var.eql($KNOWN_AND_LEXIFIED)) {
									} else if (pcase_var.eql($KNOWN_BUT_UNLEXIFIED)) {
										format(T, $str_alt172$___S_means__S__confidence___S___, new SubLObject[] { noun_string, tag, confidence });
										force_output(UNPROVIDED);
									} else if (pcase_var.eql($UNKNOWN)) {
										{
											SubLObject collection_or_individualP = methods.funcall_instance_method_with_0_args(noun_object, $sym164$COLLECTION_OR_INDIVIDUAL_);
											SubLObject genls_or_isa = NIL;
											SubLObject pcase_var_7 = collection_or_individualP;
											if (pcase_var_7.eql($COLLECTION)) {
												genls_or_isa = $$$is_a_spec_of;
											} else if (pcase_var_7.eql($INDIVIDUAL)) {
												genls_or_isa = $$$is_an_instance_of;
											} else {
												Errors.error($str_alt167$Expecting__COLLECTION_or__INDIVID, collection_or_individualP);
											}

											format(T, $str_alt175$___S__A__S__confidence___S___, new SubLObject[] { noun_string, genls_or_isa, tag, confidence });
										}
										force_output(UNPROVIDED);
									} else {
										Errors.warn($str_alt168$The_noun__S_has_the_status__S_, noun_string, status);
									}

								}
							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				return NIL;
			}
		}
	}

	public static final SubLObject learned_nouns_print_unknown_simple_noun_tags_ordered_by_confidence_method(SubLObject self, SubLObject confidence_threshold) {
		if (confidence_threshold == UNPROVIDED) {
			confidence_threshold = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject list = NIL;
				SubLObject count_threshold_var = ZERO_INTEGER;
				SubLObject confidence_threshold_var = confidence_threshold;
				SubLObject statuses_var = $list_alt180;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_learned_nouns_dictionary_of_nouns(self)));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject string_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject simple_noun = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if ((((NIL != noun_learner_noun_classes.simple_noun_p(simple_noun)) && methods.funcall_instance_method_with_0_args(simple_noun, GET_TOTAL_COUNT).numGE(count_threshold_var)) && ((NIL == confidence_threshold_var) || methods.funcall_instance_method_with_0_args(simple_noun, GET_CONFIDENCE_LEVEL).numG(confidence_threshold_var)))
								&& ((statuses_var == $ALL) || (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(simple_noun, GET_STATUS_IN_CYC), statuses_var, EQ, UNPROVIDED)))) {
							{
								SubLObject tag = methods.funcall_instance_method_with_0_args(simple_noun, GET_TAG);
								if (!tag.isKeyword()) {
									list = cons(simple_noun, list);
								}
							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				list = Sort.sort(list, symbol_function($sym28$_), symbol_function(SIMPLE_NOUN_GET_CONFIDENCE_LEVEL_METHOD));
				{
					SubLObject cdolist_list_var = list;
					SubLObject simple_noun = NIL;
					for (simple_noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), simple_noun = cdolist_list_var.first()) {
						format(T, $str_alt183$___S___S____confidence___S_, new SubLObject[] { methods.funcall_instance_method_with_0_args(simple_noun, GET_STRING), methods.funcall_instance_method_with_0_args(simple_noun, GET_TAG), methods.funcall_instance_method_with_0_args(simple_noun, GET_CONFIDENCE_LEVEL) });
					}
				}
				return NIL;
			}
		}
	}

	public static final SubLObject learned_nouns_print_unknown_simple_noun_top_n_tags_ordered_by_confidence_method(SubLObject self, SubLObject n, SubLObject confidence_threshold) {
		if (n == UNPROVIDED) {
			n = FIVE_INTEGER;
		}
		if (confidence_threshold == UNPROVIDED) {
			confidence_threshold = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject list = NIL;
				SubLObject count_threshold_var = ZERO_INTEGER;
				SubLObject confidence_threshold_var = confidence_threshold;
				SubLObject statuses_var = $list_alt180;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_learned_nouns_dictionary_of_nouns(self)));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject string_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject simple_noun = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if ((((NIL != noun_learner_noun_classes.simple_noun_p(simple_noun)) && methods.funcall_instance_method_with_0_args(simple_noun, GET_TOTAL_COUNT).numGE(count_threshold_var)) && ((NIL == confidence_threshold_var) || methods.funcall_instance_method_with_0_args(simple_noun, GET_CONFIDENCE_LEVEL).numG(confidence_threshold_var)))
								&& ((statuses_var == $ALL) || (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(simple_noun, GET_STATUS_IN_CYC), statuses_var, EQ, UNPROVIDED)))) {
							{
								SubLObject top_n_tags = methods.funcall_instance_method_with_1_args(simple_noun, GET_TOP_N_TAGS, n);
								if (!top_n_tags.isKeyword()) {
									list = cons(simple_noun, list);
								}
							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				list = Sort.sort(list, symbol_function($sym28$_), symbol_function(SIMPLE_NOUN_GET_CONFIDENCE_LEVEL_METHOD));
				{
					SubLObject cdolist_list_var = list;
					SubLObject simple_noun = NIL;
					for (simple_noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), simple_noun = cdolist_list_var.first()) {
						terpri(UNPROVIDED);
						terpri(UNPROVIDED);
						write_string(methods.funcall_instance_method_with_0_args(simple_noun, GET_STRING), UNPROVIDED, UNPROVIDED, UNPROVIDED);
						{
							SubLObject cdolist_list_var_8 = methods.funcall_instance_method_with_1_args(simple_noun, GET_TOP_N_TAGS, n);
							SubLObject tag = NIL;
							for (tag = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest(), tag = cdolist_list_var_8.first()) {
								print(tag, UNPROVIDED);
							}
						}
						format(T, $str_alt190$__confidence___S, methods.funcall_instance_method_with_0_args(simple_noun, GET_CONFIDENCE_LEVEL));
					}
				}
				return NIL;
			}
		}
	}

	/**
	 * Get rid of cached tags in order to cause them to be recalculated.
	 */
	public static final SubLObject learned_nouns_annihilate_tags_method(SubLObject self) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_of_nouns));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject noun_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject noun_object = thread.secondMultipleValue();
						thread.resetMultipleValues();
						methods.funcall_instance_method_with_0_args(noun_object, REINITIALIZE);
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				return NIL;
			}
		}
	}

	/**
	 * Get rid of irrelevant nouns in order to reclaim the memory they are using
	 */
	public static final SubLObject learned_nouns_purge_irrelevant_nouns_method(SubLObject self) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject catch_var_for_learned_nouns_method = NIL;
				SubLObject noun_relevance_count_threshold = get_learned_nouns_noun_relevance_count_threshold(self);
				SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
				try {
					try {
						{
							SubLObject irrelevant_noun_strings = NIL;
							SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_of_nouns));
							while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
								thread.resetMultipleValues();
								{
									SubLObject noun_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
									SubLObject noun_object = thread.secondMultipleValue();
									thread.resetMultipleValues();
									{
										SubLObject total_count = (NIL != noun_learner_noun_classes.simple_noun_p(noun_object)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(noun_object, GET_TOTAL_COUNT))) : methods.funcall_instance_method_with_0_args(noun_object, GET_TOTAL_COUNT_AS_WHOLE_NOUN);
										if (total_count.numL(noun_relevance_count_threshold)) {
											irrelevant_noun_strings = cons(noun_string, irrelevant_noun_strings);
										}
									}
									iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
								}
							}
							dictionary_contents.do_dictionary_contents_finalize(iteration_state);
							{
								SubLObject cdolist_list_var = irrelevant_noun_strings;
								SubLObject noun_string = NIL;
								for (noun_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), noun_string = cdolist_list_var.first()) {
									dictionary.dictionary_remove(dictionary_of_nouns, noun_string);
								}
							}
							sublisp_throw($sym198$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD, NIL);
						}
					} finally {
						{
							SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								set_learned_nouns_noun_relevance_count_threshold(self, noun_relevance_count_threshold);
								set_learned_nouns_dictionary_of_nouns(self, dictionary_of_nouns);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
							}
						}
					}
				} catch (Throwable ccatch_env_var) {
					catch_var_for_learned_nouns_method = Errors.handleThrowable(ccatch_env_var, $sym198$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD);
				}
				return catch_var_for_learned_nouns_method;
			}
		}
	}

	/**
	 *
	 *
	 * @return integerp; the number of times NOUN occurred in the data in the RELATION position,
	or in total if RELATION is nil
	 */
	public static final SubLObject learned_nouns_noun_count_method(SubLObject self, SubLObject noun_string, SubLObject relation) {
		if (relation == UNPROVIDED) {
			relation = NIL;
		}
		if (NIL != relation) {
			SubLSystemTrampolineFile.checkType(relation, NL_STATS_SUPPORTED_VERB_ARG_POSITION_P);
		}
		{
			SubLObject noun_object = methods.funcall_instance_method_with_1_args(self, FIND_NOUN, noun_string);
			if (NIL != noun_learner_noun_classes.simple_noun_p(noun_object)) {
				return methods.funcall_instance_method_with_1_args(noun_object, GET_TOTAL_COUNT, relation);
			} else if (NIL != noun_learner_noun_classes.complex_noun_p(noun_object)) {
				if (NIL != relation) {
					Errors.warn($str_alt206$We_don_t_keep_track_of_occurrence);
					return NIL;
				} else {
					return methods.funcall_instance_method_with_0_args(noun_object, GET_TOTAL_COUNT);
				}
			} else if (NIL == noun_object) {
				return ZERO_INTEGER;
			}

		}
		return NIL;
	}

	/**
	 * Returns the tag (i.e. most likely collection) of the noun NOUN-STRING.
	 */
	public static final SubLObject learned_nouns_tag_for_noun_method(SubLObject self, SubLObject noun_string) {
		{
			SubLObject noun_object = methods.funcall_instance_method_with_1_args(self, FIND_NOUN, noun_string);
			if (NIL != noun_object) {
				return methods.funcall_instance_method_with_0_args(noun_object, GET_TAG);
			} else {
				return NIL;
			}
		}
	}

	/**
	 * Returns a measure of our confidence in the tag of the noun NOUN-STRING.
	 */
	public static final SubLObject learned_nouns_confidence_level_method(SubLObject self, SubLObject noun_string) {
		{
			SubLObject noun_object = methods.funcall_instance_method_with_1_args(self, FIND_NOUN, noun_string);
			if (NIL != noun_object) {
				return methods.funcall_instance_method_with_0_args(noun_object, GET_CONFIDENCE_LEVEL);
			} else {
				return NIL;
			}
		}
	}

	public static final SubLObject learned_nouns_print_counts_method(SubLObject self, SubLObject simple_noun_string) {
		{
			SubLObject simple_noun = methods.funcall_instance_method_with_1_args(self, FIND_NOUN, simple_noun_string);
			if (NIL != noun_learner_noun_classes.simple_noun_p(simple_noun)) {
				methods.funcall_instance_method_with_0_args(simple_noun, PRINT_COUNTS);
			} else {
				format(T, $str_alt218$__Can_t_find_the_simple_noun__S__, simple_noun_string);
			}
			return NIL;
		}
	}

	public static final SubLObject learned_nouns_why_not_tagged_as_method(SubLObject self, SubLObject simple_noun_string, SubLObject better_tag) {
		{
			SubLObject simple_noun = methods.funcall_instance_method_with_1_args(self, FIND_NOUN, simple_noun_string);
			if (NIL != noun_learner_noun_classes.simple_noun_p(simple_noun)) {
				methods.funcall_instance_method_with_2_args(self, WHY_NOT_TAGGED_AS_INT, simple_noun, better_tag);
			} else {
				format(T, $str_alt218$__Can_t_find_the_simple_noun__S__, simple_noun_string);
			}
			return NIL;
		}
	}

	public static final SubLObject learned_nouns_find_noun_method(SubLObject self, SubLObject noun_string) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			SubLSystemTrampolineFile.checkType(noun_string, STRINGP);
			return dictionary.dictionary_lookup(dictionary_of_nouns, noun_string, UNPROVIDED);
		}
	}

	public static final SubLObject learned_nouns_get_calculate_tag_method_method(SubLObject self) {
		{
			SubLObject calculate_tag_method = get_learned_nouns_calculate_tag_method(self);
			return calculate_tag_method;
		}
	}

	public static final SubLObject learned_nouns_get_typicality_metric_method(SubLObject self) {
		return methods.funcall_class_method_with_1_args(self, ASSOCIATED_TYPICALITY_METRIC, methods.funcall_instance_method_with_0_args(self, GET_CALCULATE_TAG_METHOD));
	}

	public static final SubLObject learned_nouns_weight_summands_by_selectivenessP_method(SubLObject self) {
		return methods.funcall_class_method_with_1_args(self, $sym79$ASSOCIATED_SUMMAND_WEIGHTING_, methods.funcall_instance_method_with_0_args(self, GET_CALCULATE_TAG_METHOD));
	}

	public static final SubLObject learned_nouns_get_noun_relevance_count_threshold_method(SubLObject self) {
		{
			SubLObject noun_relevance_count_threshold = get_learned_nouns_noun_relevance_count_threshold(self);
			return noun_relevance_count_threshold;
		}
	}

	public static final SubLObject learned_nouns_get_size_method(SubLObject self) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			return NIL != dictionary.dictionary_p(dictionary_of_nouns) ? ((SubLObject) (dictionary.dictionary_length(dictionary_of_nouns))) : ZERO_INTEGER;
		}
	}

	public static final SubLObject learned_nouns_find_or_create_simple_noun_method(SubLObject self, SubLObject noun_string) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			SubLObject noun_object = methods.funcall_instance_method_with_1_args(self, FIND_NOUN, noun_string);
			if (NIL == noun_object) {
				noun_object = noun_learner_noun_classes.new_simple_noun(self, noun_string);
				dictionary.dictionary_enter(dictionary_of_nouns, noun_string, noun_object);
			}
			return noun_object;
		}
	}

	public static final SubLObject learned_nouns_find_or_create_complex_noun_method(SubLObject self, SubLObject complex_noun_string, SubLObject head_noun_object) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			SubLObject complex_noun_object = methods.funcall_instance_method_with_1_args(self, FIND_NOUN, complex_noun_string);
			if (NIL == complex_noun_object) {
				complex_noun_object = noun_learner_noun_classes.new_complex_noun(self, complex_noun_string, head_noun_object);
				dictionary.dictionary_enter(dictionary_of_nouns, complex_noun_string, complex_noun_object);
				methods.funcall_instance_method_with_1_args(head_noun_object, LINK_COMPLEX_NOUN, complex_noun_object);
			}
			return complex_noun_object;
		}
	}

	public static final SubLObject learned_nouns_generate_ke_text_method(SubLObject self, SubLObject ke_file_path, SubLObject notes_file_path) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
				SubLSystemTrampolineFile.checkType(ke_file_path, STRINGP);
				SubLSystemTrampolineFile.checkType(notes_file_path, STRINGP);
				{
					SubLObject stream = NIL;
					try {
						stream = compatibility.open_text(ke_file_path, $OUTPUT, NIL);
						if (!stream.isStream()) {
							Errors.error($str_alt255$Unable_to_open__S, ke_file_path);
						}
						{
							SubLObject ke_stream = stream;
							SubLObject stream_9 = NIL;
							try {
								stream_9 = compatibility.open_text(notes_file_path, $OUTPUT, NIL);
								if (!stream_9.isStream()) {
									Errors.error($str_alt255$Unable_to_open__S, notes_file_path);
								}
								{
									SubLObject notes_stream = stream_9;
									SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_of_nouns));
									while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
										thread.resetMultipleValues();
										{
											SubLObject noun_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
											SubLObject noun_object = thread.secondMultipleValue();
											thread.resetMultipleValues();
											{
												SubLObject tag = methods.funcall_instance_method_with_0_args(noun_object, GET_TAG);
												SubLObject status = methods.funcall_instance_method_with_0_args(noun_object, GET_STATUS_IN_CYC);
												if (!tag.isKeyword()) {
													{
														SubLObject pcase_var = status;
														if (pcase_var.eql($KNOWN_AND_LEXIFIED)) {
														} else if (pcase_var.eql($KNOWN_BUT_UNLEXIFIED)) {
															if (NIL != forts.fort_p(tag)) {
																methods.funcall_instance_method_with_3_args(self, KE_TEXT_LEXIFICATION, noun_string, tag, ke_stream);
															} else {
																format(notes_stream, $str_alt257$____Not_lexifying__S_because__S_i, noun_string, tag);
															}
														} else if (pcase_var.eql($UNKNOWN)) {
															{
																SubLObject collection_or_individualP = methods.funcall_instance_method_with_0_args(noun_object, $sym164$COLLECTION_OR_INDIVIDUAL_);
																SubLObject new_constant_name = generate_constant_name_for_noun(noun_string);
																methods.funcall_instance_method_with_4_args(self, KE_TEXT_REIFICATION, new_constant_name, tag, collection_or_individualP, ke_stream);
																methods.funcall_instance_method_with_3_args(self, KE_TEXT_LEXIFICATION, noun_string, new_constant_name, ke_stream);
															}
														} else {
															Errors.error($str_alt259$I_don_t_understand_the_status__S_, status);
														}

													}
												}
											}
											iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
										}
									}
									dictionary_contents.do_dictionary_contents_finalize(iteration_state);
								}
							} finally {
								{
									SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if (stream_9.isStream()) {
											close(stream_9, UNPROVIDED);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
									}
								}
							}
						}
					} finally {
						{
							SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								if (stream.isStream()) {
									close(stream, UNPROVIDED);
								}
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
							}
						}
					}
				}
				return NIL;
			}
		}
	}

	public static final SubLObject learned_nouns_ke_text_reification_method(SubLObject self, SubLObject constant_name, SubLObject tag, SubLObject collection_or_individualP, SubLObject stream) {
		{
			SubLObject predicate = (collection_or_individualP == $COLLECTION) ? ((SubLObject) ($$$genls)) : collection_or_individualP == $INDIVIDUAL ? ((SubLObject) ($$$isa)) : NIL;
			tag = narts_high.nart_expand(tag);
			format(stream, $str_alt266$____Constant___A___, constant_name);
			format(stream, $str_alt267$_A___S_____, predicate, tag);
			return NIL;
		}
	}

	public static final SubLObject learned_nouns_ke_text_lexification_method(SubLObject self, SubLObject lex_string, SubLObject v_term, SubLObject stream) {
		format(stream, $str_alt271$____nameString__S__S____, v_term, lex_string);
		return NIL;
	}

	/**
	 * Partition nouns that are to be worked on in the java tool into groups of approximately MIN-LIST-LENGTH,
	 * which is a reasonable number for a person to work on at a time.
	 * For now, I'm keeping :UNKNOWN simple nouns separate from :KNOWN-BUT-UNLEXIFIED simple nouns, because the tool is not
	 * set up to handle :KNOWN-BUT-UNLEXIFIED nouns intelligently.  Complex nouns are stuck in after their heads if their
	 * heads are included, the rest are shoved into a third group.
	 * For now, I'm ordering simple nouns by number of occurrences (ignoring confidence).
	 *
	 * @return triple? of listp of listp of noun-p:
	(1) a list of manageable lists of unknown simple nouns and associated complex nouns
	(2) a list of manageable lists of known-but-unlexified simple nouns and associated complex nouns
	(3) a list of manageable lists of complex nouns whose heads are known-and-lexified (and thus not included)
	 */
	public static final SubLObject learned_nouns_group_nouns_into_lists_for_java_tool_method(SubLObject self, SubLObject min_list_length) {
		if (min_list_length == UNPROVIDED) {
			min_list_length = $int$50;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject noun_relevance_count_threshold = get_learned_nouns_noun_relevance_count_threshold(self);
				SubLObject list_of_relevant_unknown_simple_nouns = NIL;
				SubLObject list_of_relevant_known_but_unlexified_simple_nouns = NIL;
				SubLObject list_of_relevant_known_and_lexified_simple_nouns = NIL;
				SubLObject count_threshold_var = noun_relevance_count_threshold;
				SubLObject confidence_threshold_var = NIL;
				SubLObject statuses_var = $ALL;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_learned_nouns_dictionary_of_nouns(self)));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject string_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject simple_noun = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if ((((NIL != noun_learner_noun_classes.simple_noun_p(simple_noun)) && methods.funcall_instance_method_with_0_args(simple_noun, GET_TOTAL_COUNT).numGE(count_threshold_var)) && ((NIL == confidence_threshold_var) || methods.funcall_instance_method_with_0_args(simple_noun, GET_CONFIDENCE_LEVEL).numG(confidence_threshold_var)))
								&& ((statuses_var == $ALL) || (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(simple_noun, GET_STATUS_IN_CYC), statuses_var, EQ, UNPROVIDED)))) {
							{
								SubLObject pcase_var = methods.funcall_instance_method_with_0_args(simple_noun, GET_STATUS_IN_CYC);
								if (pcase_var.eql($UNKNOWN)) {
									list_of_relevant_unknown_simple_nouns = cons(simple_noun, list_of_relevant_unknown_simple_nouns);
								} else if (pcase_var.eql($KNOWN_BUT_UNLEXIFIED)) {
									list_of_relevant_known_but_unlexified_simple_nouns = cons(simple_noun, list_of_relevant_known_but_unlexified_simple_nouns);
								} else if (pcase_var.eql($KNOWN_AND_LEXIFIED)) {
									list_of_relevant_known_and_lexified_simple_nouns = cons(simple_noun, list_of_relevant_known_and_lexified_simple_nouns);
								}

							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				Sort.sort(list_of_relevant_unknown_simple_nouns, symbol_function($sym28$_), symbol_function(SIMPLE_NOUN_GET_TOTAL_COUNT_METHOD));
				Sort.sort(list_of_relevant_known_but_unlexified_simple_nouns, symbol_function($sym28$_), symbol_function(SIMPLE_NOUN_GET_TOTAL_COUNT_METHOD));
				{
					SubLObject list_of_lists_of_relevant_unknown_nouns = NIL;
					SubLObject list_of_lists_of_relevant_known_but_unlexified_nouns = NIL;
					SubLObject list_of_lists_of_relevant_orphan_complex_nouns = NIL;
					SubLObject current_small_list = NIL;
					{
						SubLObject cdolist_list_var = list_of_relevant_unknown_simple_nouns;
						SubLObject simple_noun = NIL;
						for (simple_noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), simple_noun = cdolist_list_var.first()) {
							current_small_list = cons(simple_noun, current_small_list);
							{
								SubLObject complex_nouns = methods.funcall_instance_method_with_0_args(simple_noun, GET_COMPLEX_NOUNS_HEADED_BY_THIS_NOUN);
								SubLObject cdolist_list_var_10 = complex_nouns;
								SubLObject complex_noun = NIL;
								for (complex_noun = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest(), complex_noun = cdolist_list_var_10.first()) {
									if (methods.funcall_instance_method_with_0_args(complex_noun, GET_TOTAL_COUNT_AS_WHOLE_NOUN).numGE(noun_relevance_count_threshold) && ($KNOWN_AND_LEXIFIED != methods.funcall_instance_method_with_0_args(complex_noun, GET_STATUS_IN_CYC))) {
										current_small_list = cons(complex_noun, current_small_list);
									}
								}
							}
							if (NIL != list_utilities.lengthGE(current_small_list, min_list_length, UNPROVIDED)) {
								current_small_list = nreverse(current_small_list);
								list_of_lists_of_relevant_unknown_nouns = cons(current_small_list, list_of_lists_of_relevant_unknown_nouns);
								current_small_list = NIL;
							}
						}
					}
					if (NIL == list_utilities.empty_list_p(current_small_list)) {
						current_small_list = nreverse(current_small_list);
						list_of_lists_of_relevant_unknown_nouns = cons(current_small_list, list_of_lists_of_relevant_unknown_nouns);
						current_small_list = NIL;
					}
					{
						SubLObject cdolist_list_var = list_of_relevant_known_but_unlexified_simple_nouns;
						SubLObject simple_noun = NIL;
						for (simple_noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), simple_noun = cdolist_list_var.first()) {
							current_small_list = cons(simple_noun, current_small_list);
							{
								SubLObject complex_nouns = methods.funcall_instance_method_with_0_args(simple_noun, GET_COMPLEX_NOUNS_HEADED_BY_THIS_NOUN);
								SubLObject cdolist_list_var_11 = complex_nouns;
								SubLObject complex_noun = NIL;
								for (complex_noun = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest(), complex_noun = cdolist_list_var_11.first()) {
									if (methods.funcall_instance_method_with_0_args(complex_noun, GET_TOTAL_COUNT_AS_WHOLE_NOUN).numGE(noun_relevance_count_threshold) && ($KNOWN_AND_LEXIFIED != methods.funcall_instance_method_with_0_args(complex_noun, GET_STATUS_IN_CYC))) {
										current_small_list = cons(complex_noun, current_small_list);
									}
								}
							}
							if (NIL != list_utilities.lengthGE(current_small_list, min_list_length, UNPROVIDED)) {
								current_small_list = nreverse(current_small_list);
								list_of_lists_of_relevant_known_but_unlexified_nouns = cons(current_small_list, list_of_lists_of_relevant_known_but_unlexified_nouns);
								current_small_list = NIL;
							}
						}
					}
					if (NIL == list_utilities.empty_list_p(current_small_list)) {
						current_small_list = nreverse(current_small_list);
						list_of_lists_of_relevant_known_but_unlexified_nouns = cons(current_small_list, list_of_lists_of_relevant_known_but_unlexified_nouns);
						current_small_list = NIL;
					}
					{
						SubLObject cdolist_list_var = list_of_relevant_known_and_lexified_simple_nouns;
						SubLObject simple_noun = NIL;
						for (simple_noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), simple_noun = cdolist_list_var.first()) {
							{
								SubLObject complex_nouns = methods.funcall_instance_method_with_0_args(simple_noun, GET_COMPLEX_NOUNS_HEADED_BY_THIS_NOUN);
								SubLObject cdolist_list_var_12 = complex_nouns;
								SubLObject complex_noun = NIL;
								for (complex_noun = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest(), complex_noun = cdolist_list_var_12.first()) {
									if (methods.funcall_instance_method_with_0_args(complex_noun, GET_TOTAL_COUNT_AS_WHOLE_NOUN).numGE(noun_relevance_count_threshold) && ($KNOWN_AND_LEXIFIED != methods.funcall_instance_method_with_0_args(complex_noun, GET_STATUS_IN_CYC))) {
										current_small_list = cons(complex_noun, current_small_list);
									}
								}
							}
							if (NIL != list_utilities.lengthGE(current_small_list, min_list_length, UNPROVIDED)) {
								current_small_list = nreverse(current_small_list);
								list_of_lists_of_relevant_orphan_complex_nouns = cons(current_small_list, list_of_lists_of_relevant_orphan_complex_nouns);
								current_small_list = NIL;
							}
						}
					}
					if (NIL == list_utilities.empty_list_p(current_small_list)) {
						current_small_list = nreverse(current_small_list);
						list_of_lists_of_relevant_orphan_complex_nouns = cons(current_small_list, list_of_lists_of_relevant_orphan_complex_nouns);
					}
					return list(list_of_lists_of_relevant_unknown_nouns, list_of_lists_of_relevant_known_but_unlexified_nouns, list_of_lists_of_relevant_orphan_complex_nouns);
				}
			}
		}
	}

	public static final SubLObject learned_nouns_group_javafied_nouns_into_lists_for_java_tool_method(SubLObject self, SubLObject min_list_length, SubLObject max_ranking_length) {
		if (min_list_length == UNPROVIDED) {
			min_list_length = $int$50;
		}
		if (max_ranking_length == UNPROVIDED) {
			max_ranking_length = $int$200;
		}
		{
			SubLObject unjavafied_result = methods.funcall_instance_method_with_1_args(self, GROUP_NOUNS_INTO_LISTS_FOR_JAVA_TOOL, min_list_length);
			SubLObject javafied_result = NIL;
			SubLObject cdolist_list_var = unjavafied_result;
			SubLObject list_of_lists_of_nouns = NIL;
			for (list_of_lists_of_nouns = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), list_of_lists_of_nouns = cdolist_list_var.first()) {
				{
					SubLObject list_of_lists_of_javafied_nouns = NIL;
					SubLObject cdolist_list_var_13 = list_of_lists_of_nouns;
					SubLObject list_of_nouns = NIL;
					for (list_of_nouns = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest(), list_of_nouns = cdolist_list_var_13.first()) {
						{
							SubLObject list_of_javafied_nouns = NIL;
							SubLObject cdolist_list_var_14 = list_of_nouns;
							SubLObject noun = NIL;
							for (noun = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest(), noun = cdolist_list_var_14.first()) {
								list_of_javafied_nouns = cons(methods.funcall_instance_method_with_1_args(noun, JAVAFY, max_ranking_length), list_of_javafied_nouns);
							}
							list_of_javafied_nouns = nreverse(list_of_javafied_nouns);
							list_of_lists_of_javafied_nouns = cons(list_of_javafied_nouns, list_of_lists_of_javafied_nouns);
						}
					}
					list_of_lists_of_javafied_nouns = nreverse(list_of_lists_of_javafied_nouns);
					javafied_result = cons(list_of_lists_of_javafied_nouns, javafied_result);
				}
			}
			return nreverse(javafied_result);
		}
	}

	public static final SubLObject learned_nouns_save_javafied_noun_lists_for_java_tool_method(SubLObject self, SubLObject directory, SubLObject min_list_length, SubLObject max_ranking_length) {
		if (min_list_length == UNPROVIDED) {
			min_list_length = $int$50;
		}
		if (max_ranking_length == UNPROVIDED) {
			max_ranking_length = $int$200;
		}
		SubLSystemTrampolineFile.checkType(directory, DIRECTORY_P);
		directory = normalize_directory_name(directory);
		{
			SubLObject unknown_prefix = $str_alt290$unknown_javafied_noun_list_;
			SubLObject known_but_unlexified_prefix = $str_alt291$known_but_unlexified_javafied_nou;
			SubLObject orphan_complex_prefix = $str_alt292$orphan_complex_javafied_noun_list;
			SubLObject suffix = $str_alt293$_cfasl;
			SubLObject datum = methods.funcall_instance_method_with_1_args(self, GROUP_NOUNS_INTO_LISTS_FOR_JAVA_TOOL, min_list_length);
			SubLObject current = datum;
			SubLObject list_of_lists_of_relevant_unknown_nouns = NIL;
			SubLObject list_of_lists_of_relevant_known_but_unlexified_nouns = NIL;
			SubLObject list_of_lists_of_relevant_orphan_complex_nouns = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt294);
			list_of_lists_of_relevant_unknown_nouns = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt294);
			list_of_lists_of_relevant_known_but_unlexified_nouns = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt294);
			list_of_lists_of_relevant_orphan_complex_nouns = current.first();
			current = current.rest();
			if (NIL == current) {
				{
					SubLObject list_var = NIL;
					SubLObject list_of_unknown_nouns = NIL;
					SubLObject index = NIL;
					for (list_var = list_of_lists_of_relevant_unknown_nouns, list_of_unknown_nouns = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), list_of_unknown_nouns = list_var.first(), index = add(ONE_INTEGER, index)) {
						methods.funcall_class_method_with_3_args(self, SAVE_NOUN_LIST, list_of_unknown_nouns, cconcatenate(directory, new SubLObject[] { unknown_prefix, string_utilities.to_string(index), suffix }), max_ranking_length);
					}
				}
				{
					SubLObject list_var = NIL;
					SubLObject list_of_known_but_unlexified_nouns = NIL;
					SubLObject index = NIL;
					for (list_var = list_of_lists_of_relevant_known_but_unlexified_nouns, list_of_known_but_unlexified_nouns = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), list_of_known_but_unlexified_nouns = list_var.first(), index = add(ONE_INTEGER, index)) {
						methods.funcall_class_method_with_3_args(self, SAVE_NOUN_LIST, list_of_known_but_unlexified_nouns, cconcatenate(directory, new SubLObject[] { known_but_unlexified_prefix, string_utilities.to_string(index), suffix }), max_ranking_length);
					}
				}
				{
					SubLObject list_var = NIL;
					SubLObject list_of_orphan_complex_nouns = NIL;
					SubLObject index = NIL;
					for (list_var = list_of_lists_of_relevant_orphan_complex_nouns, list_of_orphan_complex_nouns = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), list_of_orphan_complex_nouns = list_var.first(), index = add(ONE_INTEGER, index)) {
						methods.funcall_class_method_with_3_args(self, SAVE_NOUN_LIST, list_of_orphan_complex_nouns, cconcatenate(directory, new SubLObject[] { orphan_complex_prefix, string_utilities.to_string(index), suffix }), max_ranking_length);
					}
				}
			} else {
				cdestructuring_bind_error(datum, $list_alt294);
			}
		}
		return NIL;
	}

	public static final SubLObject learned_nouns_save_noun_list_method(SubLObject self, SubLObject unjavafied_noun_list, SubLObject filename, SubLObject max_ranking_length) {
		SubLSystemTrampolineFile.checkType(unjavafied_noun_list, LISTP);
		SubLSystemTrampolineFile.checkType(filename, STRINGP);
		SubLSystemTrampolineFile.checkType(max_ranking_length, POSITIVE_INTEGER_P);
		{
			SubLObject javafied_noun_list = NIL;
			SubLObject cdolist_list_var = unjavafied_noun_list;
			SubLObject unjavafied_noun = NIL;
			for (unjavafied_noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), unjavafied_noun = cdolist_list_var.first()) {
				javafied_noun_list = cons(methods.funcall_instance_method_with_1_args(unjavafied_noun, JAVAFY, max_ranking_length), javafied_noun_list);
			}
			javafied_noun_list = nreverse(javafied_noun_list);
			format(T, $str_alt301$__Saving__A, filename);
			force_output(UNPROVIDED);
			cfasl_utilities.cfasl_save_externalized(javafied_noun_list, filename);
		}
		return NIL;
	}

	/**
	 * Call @xref CFASL-LOAD and weed out any invalid forts from the result.
	 */
	public static final SubLObject learned_nouns_load_javafied_noun_file_method(SubLObject self, SubLObject filename) {
		{
			SubLObject javafied_nouns = cfasl_utilities.cfasl_load(filename);
			SubLObject result = NIL;
			if (javafied_nouns.isList()) {
				{
					SubLObject cdolist_list_var = javafied_nouns;
					SubLObject javafied_noun = NIL;
					for (javafied_noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), javafied_noun = cdolist_list_var.first()) {
						result = cons(methods.funcall_class_method_with_1_args(self, WEED_OUT_INVALID_FORTS, javafied_noun), result);
					}
					result = nreverse(result);
				}
			} else {
				result = javafied_nouns;
			}
			return result;
		}
	}

	public static final SubLObject javafied_noun_p(SubLObject v_object) {
		return makeBoolean((NIL != list_utilities.non_dotted_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TEN_INTEGER, UNPROVIDED)));
	}

	public static final SubLObject get_javafied_noun_refined_tag(SubLObject javafied_noun) {
		SubLSystemTrampolineFile.checkType(javafied_noun, JAVAFIED_NOUN_P);
		return nth(THREE_INTEGER, javafied_noun);
	}

	public static final SubLObject set_javafied_noun_refined_tag(SubLObject javafied_noun, SubLObject refined_tag) {
		SubLSystemTrampolineFile.checkType(javafied_noun, JAVAFIED_NOUN_P);
		set_nth(THREE_INTEGER, javafied_noun, refined_tag);
		return NIL;
	}

	public static final SubLObject get_javafied_noun_conjectures(SubLObject javafied_noun) {
		SubLSystemTrampolineFile.checkType(javafied_noun, JAVAFIED_NOUN_P);
		return nth(FOUR_INTEGER, javafied_noun);
	}

	public static final SubLObject set_javafied_noun_conjectures(SubLObject javafied_noun, SubLObject conjectures) {
		SubLSystemTrampolineFile.checkType(javafied_noun, JAVAFIED_NOUN_P);
		set_nth(FOUR_INTEGER, javafied_noun, conjectures);
		return NIL;
	}

	public static final SubLObject weed_out_invalid_forts_from_conjectures(SubLObject conjectures) {
		{
			SubLObject list_var = conjectures;
			SubLSystemTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
			{
				SubLObject cdolist_list_var = list_var;
				SubLObject elem = NIL;
				for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
					SubLSystemTrampolineFile.checkType(elem, LISTP);
				}
			}
		}
		{
			SubLObject result = NIL;
			SubLObject cdolist_list_var = conjectures;
			SubLObject conjecture = NIL;
			for (conjecture = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), conjecture = cdolist_list_var.first()) {
				if (NIL == forts.invalid_fortP(conjecture.first())) {
					result = cons(conjecture, result);
				}
			}
			return nreverse(result);
		}
	}

	public static final SubLObject learned_nouns_weed_out_invalid_forts_method(SubLObject self, SubLObject javafied_noun) {
		if (NIL != javafied_noun_p(javafied_noun)) {
			set_javafied_noun_conjectures(javafied_noun, weed_out_invalid_forts_from_conjectures(get_javafied_noun_conjectures(javafied_noun)));
			if (NIL != forts.invalid_fortP(get_javafied_noun_refined_tag(javafied_noun))) {
				set_javafied_noun_refined_tag(javafied_noun, get_javafied_noun_conjectures(javafied_noun).first().first());
			}
		} else {
			Errors.warn($str_alt312$_S_is_not_a_javafied_noun, javafied_noun);
		}
		return javafied_noun;
	}

	public static final SubLObject learned_nouns_dump_noun_strings_ordered_by_prevalence_method(SubLObject self, SubLObject filename) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			SubLObject nouns = dictionary.dictionary_values(dictionary_of_nouns);
			nouns = Sort.sort(nouns, symbol_function($sym28$_), symbol_function(NOUN_GET_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD));
			{
				SubLObject stream = NIL;
				try {
					stream = compatibility.open_text(filename, $OUTPUT, NIL);
					if (!stream.isStream()) {
						Errors.error($str_alt255$Unable_to_open__S, filename);
					}
					{
						SubLObject stream_15 = stream;
						SubLObject cdolist_list_var = nouns;
						SubLObject noun = NIL;
						for (noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), noun = cdolist_list_var.first()) {
							{
								SubLObject count = methods.funcall_instance_method_with_0_args(noun, GET_TOTAL_COUNT_AS_WHOLE_NOUN);
								if (NIL != number_utilities.positive_number_p(count)) {
									print(methods.funcall_instance_method_with_0_args(noun, GET_STRING), stream_15);
									princ($str_alt317$__, stream_15);
									princ(count, stream_15);
								}
							}
						}
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							if (stream.isStream()) {
								close(stream, UNPROVIDED);
							}
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			}
			return filename;
		}
	}

	public static final SubLObject learned_nouns_dump_known_nouns_with_meanings_method(SubLObject self, SubLObject filename) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			SubLObject nouns = dictionary.dictionary_values(dictionary_of_nouns);
			nouns = Sort.sort(nouns, symbol_function($sym28$_), symbol_function(NOUN_GET_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD));
			{
				SubLObject stream = NIL;
				try {
					stream = compatibility.open_text(filename, $OUTPUT, NIL);
					if (!stream.isStream()) {
						Errors.error($str_alt255$Unable_to_open__S, filename);
					}
					{
						SubLObject stream_16 = stream;
						SubLObject cdolist_list_var = nouns;
						SubLObject noun = NIL;
						for (noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), noun = cdolist_list_var.first()) {
							if (NIL != number_utilities.positive_number_p(methods.funcall_instance_method_with_0_args(noun, GET_TOTAL_COUNT_AS_WHOLE_NOUN))) {
								{
									SubLObject meaning = methods.funcall_instance_method_with_0_args(noun, GET_BEST_MEANING_IN_CYC);
									if (NIL != meaning) {
										format(stream_16, $str_alt322$_S___S__, methods.funcall_instance_method_with_0_args(noun, GET_STRING), meaning);
									}
								}
							}
						}
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							if (stream.isStream()) {
								close(stream, UNPROVIDED);
							}
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			}
			return filename;
		}
	}

	public static final SubLObject learned_nouns_dump_unknown_nouns_with_conjectures_method(SubLObject self, SubLObject filename) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			SubLObject nouns = dictionary.dictionary_values(dictionary_of_nouns);
			nouns = Sort.sort(nouns, symbol_function($sym28$_), symbol_function(NOUN_GET_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD));
			{
				SubLObject stream = NIL;
				try {
					stream = compatibility.open_text(filename, $OUTPUT, NIL);
					if (!stream.isStream()) {
						Errors.error($str_alt255$Unable_to_open__S, filename);
					}
					{
						SubLObject stream_17 = stream;
						SubLObject cdolist_list_var = nouns;
						SubLObject noun = NIL;
						for (noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), noun = cdolist_list_var.first()) {
							if (NIL != number_utilities.positive_number_p(methods.funcall_instance_method_with_0_args(noun, GET_TOTAL_COUNT_AS_WHOLE_NOUN))) {
								{
									SubLObject meanings = methods.funcall_instance_method_with_0_args(noun, GET_MEANINGS_IN_CYC);
									if (NIL != list_utilities.empty_list_p(meanings)) {
										print(methods.funcall_instance_method_with_0_args(noun, GET_STRING), stream_17);
										princ($str_alt317$__, stream_17);
										{
											SubLObject tag = methods.funcall_instance_method_with_0_args(noun, GET_REFINED_TAG);
											if (NIL != kb_accessors.kb_individual_p(tag)) {
												prin1(el_utilities.make_binary_formula($$equals, $MEANING, tag), stream_17);
											} else if (NIL != fort_types_interface.collection_p(tag)) {
												{
													SubLObject coll_or_indP = methods.funcall_instance_method_with_0_args(noun, $sym164$COLLECTION_OR_INDIVIDUAL_);
													if (coll_or_indP == $INDIVIDUAL) {
														prin1(el_utilities.make_binary_formula($$isa, $MEANING, tag), stream_17);
													} else {
														{
															SubLObject isas = get_sophisticated_isas_based_on_genls(list(tag), $const330$CurrentWorldDataCollectorMt_NonHo);
															format(stream_17, $str_alt331$_S, el_utilities.make_binary_formula($$genls, $MEANING, tag));
															{
																SubLObject cdolist_list_var_18 = isas;
																SubLObject v_isa = NIL;
																for (v_isa = cdolist_list_var_18.first(); NIL != cdolist_list_var_18; cdolist_list_var_18 = cdolist_list_var_18.rest(), v_isa = cdolist_list_var_18.first()) {
																	format(stream_17, $str_alt332$___S, el_utilities.make_binary_formula($$isa, $MEANING, v_isa));
																}
															}
														}
													}
												}
											} else if (tag.isKeyword()) {
											}

										}
									}
								}
							}
						}
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							if (stream.isStream()) {
								close(stream, UNPROVIDED);
							}
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			}
			return filename;
		}
	}

	public static final SubLObject learned_nouns_listify_all_nouns_with_counts_for_mysentient_method(SubLObject self) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			SubLObject nouns = dictionary.dictionary_values(dictionary_of_nouns);
			SubLObject noun_count_list = NIL;
			nouns = Sort.sort(nouns, symbol_function($sym336$_), symbol_function(NOUN_GET_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD));
			{
				SubLObject cdolist_list_var = nouns;
				SubLObject noun = NIL;
				for (noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), noun = cdolist_list_var.first()) {
					{
						SubLObject count = methods.funcall_instance_method_with_0_args(noun, GET_TOTAL_COUNT_AS_WHOLE_NOUN);
						if (NIL != number_utilities.positive_number_p(count)) {
							noun_count_list = cons(list(methods.funcall_instance_method_with_0_args(noun, GET_STRING), count), noun_count_list);
						}
					}
				}
			}
			return noun_count_list;
		}
	}

	public static final SubLObject learned_nouns_listify_known_nouns_with_meanings_for_mysentient_method(SubLObject self, SubLObject corpus, SubLObject corpus_mt, SubLObject graphing_mt) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			SubLSystemTrampolineFile.checkType(corpus, CYCL_TERM_P);
			SubLSystemTrampolineFile.checkType(graphing_mt, CYCL_TERM_P);
			{
				SubLObject nouns = dictionary.dictionary_values(dictionary_of_nouns);
				SubLObject listified_known_nouns = NIL;
				nouns = Sort.sort(nouns, symbol_function($sym336$_), symbol_function(NOUN_GET_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD));
				{
					SubLObject cdolist_list_var = nouns;
					SubLObject noun = NIL;
					for (noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), noun = cdolist_list_var.first()) {
						if (NIL != number_utilities.positive_number_p(methods.funcall_instance_method_with_0_args(noun, GET_TOTAL_COUNT_AS_WHOLE_NOUN))) {
							{
								SubLObject noun_string = methods.funcall_instance_method_with_0_args(noun, GET_STRING);
								SubLObject meaning = methods.funcall_instance_method_with_0_args(noun, GET_BEST_MEANING_IN_CYC);
								if (NIL != meaning) {
									methods.funcall_instance_method_with_4_args(self, ASSERT_CORPUS_MENTION_FOR_MYSENTIENT, meaning, corpus, graphing_mt, $$TheMySentientTermMapperTool);
									listified_known_nouns = cons(list(noun_string, meaning), listified_known_nouns);
								}
							}
						}
					}
				}
				return listified_known_nouns;
			}
		}
	}

	public static final SubLObject learned_nouns_listify_unknown_nouns_with_conjectures_for_mysentient_method(SubLObject self, SubLObject corpus, SubLObject corpus_mt, SubLObject graphing_mt) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			SubLSystemTrampolineFile.checkType(corpus, CYCL_TERM_P);
			SubLSystemTrampolineFile.checkType(graphing_mt, CYCL_TERM_P);
			{
				SubLObject nouns = dictionary.dictionary_values(dictionary_of_nouns);
				SubLObject listified_unknown_nouns = NIL;
				nouns = Sort.sort(nouns, symbol_function($sym336$_), symbol_function(NOUN_GET_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD));
				{
					SubLObject cdolist_list_var = nouns;
					SubLObject noun = NIL;
					for (noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), noun = cdolist_list_var.first()) {
						if (NIL != number_utilities.positive_number_p(methods.funcall_instance_method_with_0_args(noun, GET_TOTAL_COUNT_AS_WHOLE_NOUN))) {
							{
								SubLObject meanings = methods.funcall_instance_method_with_0_args(noun, GET_MEANINGS_IN_CYC);
								if (NIL != list_utilities.empty_list_p(meanings)) {
									{
										SubLObject conjectures = NIL;
										SubLObject tag = methods.funcall_instance_method_with_0_args(noun, GET_REFINED_TAG);
										if (NIL != kb_accessors.kb_individual_p(tag)) {
											conjectures = cons(el_utilities.make_binary_formula($$equals, $MEANING, tag), conjectures);
										} else if (NIL != fort_types_interface.collection_p(tag)) {
											{
												SubLObject coll_or_indP = methods.funcall_instance_method_with_0_args(noun, $sym164$COLLECTION_OR_INDIVIDUAL_);
												if (coll_or_indP == $INDIVIDUAL) {
													conjectures = cons(el_utilities.make_binary_formula($$isa, $MEANING, tag), conjectures);
												} else {
													{
														SubLObject isas = get_sophisticated_isas_based_on_genls(list(tag), $const330$CurrentWorldDataCollectorMt_NonHo);
														conjectures = cons(el_utilities.make_binary_formula($$genls, $MEANING, tag), conjectures);
														{
															SubLObject cdolist_list_var_19 = isas;
															SubLObject v_isa = NIL;
															for (v_isa = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest(), v_isa = cdolist_list_var_19.first()) {
																conjectures = cons(el_utilities.make_binary_formula($$isa, $MEANING, v_isa), conjectures);
															}
														}
													}
												}
											}
										} else if (tag.isKeyword()) {
										}

										{
											SubLObject noun_string = methods.funcall_instance_method_with_0_args(noun, GET_STRING);
											methods.funcall_instance_method_with_4_args(self, REIFY_UNKNOWN_NOUN_FROM_CORPUS_FOR_MYSENTIENT, noun_string, corpus, graphing_mt, conjectures);
											listified_unknown_nouns = cons(list(noun_string, conjectures), listified_unknown_nouns);
										}
									}
								}
							}
						}
					}
				}
				return listified_unknown_nouns;
			}
		}
	}

	public static final SubLObject learned_nouns_listify_for_mysentient_method(SubLObject self) {
		{
			SubLObject dictionary_of_nouns = get_learned_nouns_dictionary_of_nouns(self);
			SubLObject nouns = dictionary.dictionary_values(dictionary_of_nouns);
			SubLObject listified_known_nouns = NIL;
			SubLObject listified_unknown_nouns = NIL;
			nouns = Sort.sort(nouns, symbol_function($sym336$_), symbol_function(NOUN_GET_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD));
			{
				SubLObject cdolist_list_var = nouns;
				SubLObject noun = NIL;
				for (noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), noun = cdolist_list_var.first()) {
					if (NIL != number_utilities.positive_number_p(methods.funcall_instance_method_with_0_args(noun, GET_TOTAL_COUNT_AS_WHOLE_NOUN))) {
						{
							SubLObject noun_string = methods.funcall_instance_method_with_0_args(noun, GET_STRING);
							SubLObject meaning = methods.funcall_instance_method_with_0_args(noun, GET_BEST_MEANING_IN_CYC);
							if (NIL != meaning) {
								listified_known_nouns = cons(list(noun_string, meaning), listified_known_nouns);
							} else {
								{
									SubLObject conjectures = NIL;
									SubLObject tag = methods.funcall_instance_method_with_0_args(noun, GET_REFINED_TAG);
									if (NIL != kb_accessors.kb_individual_p(tag)) {
										conjectures = cons(el_utilities.make_binary_formula($$equals, $MEANING, tag), conjectures);
									} else if (NIL != fort_types_interface.collection_p(tag)) {
										{
											SubLObject coll_or_indP = methods.funcall_instance_method_with_0_args(noun, $sym164$COLLECTION_OR_INDIVIDUAL_);
											if (coll_or_indP == $INDIVIDUAL) {
												conjectures = cons(el_utilities.make_binary_formula($$isa, $MEANING, tag), conjectures);
											} else {
												{
													SubLObject isas = get_sophisticated_isas_based_on_genls(list(tag), $const330$CurrentWorldDataCollectorMt_NonHo);
													conjectures = cons(el_utilities.make_binary_formula($$genls, $MEANING, tag), conjectures);
													{
														SubLObject cdolist_list_var_20 = isas;
														SubLObject v_isa = NIL;
														for (v_isa = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest(), v_isa = cdolist_list_var_20.first()) {
															conjectures = cons(el_utilities.make_binary_formula($$isa, $MEANING, v_isa), conjectures);
														}
													}
												}
											}
										}
									} else if (tag.isKeyword()) {
									}

									listified_unknown_nouns = cons(list(noun_string, conjectures), listified_unknown_nouns);
								}
							}
						}
					}
				}
			}
			return list(listified_known_nouns, listified_unknown_nouns);
		}
	}

	/**
	 * Assert that TERM was mentioned (i.e. some NL expression referring to TERM occurred) in CORPUS.
	 */
	public static final SubLObject learned_nouns_assert_corpus_mention_for_mysentient_method(SubLObject self, SubLObject v_term, SubLObject corpus, SubLObject graphing_mt, SubLObject tool) {
		{
			SubLObject old_cyclist = operation_communication.the_cyclist();
			try {
				operation_communication.set_the_cyclist($$TheMySentientSystem);
				mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$documentMentions, corpus, v_term), $$PCWDataMt);
				mysentient_utilities.myse_assert_now(el_utilities.make_ternary_formula($$extractedFromCorpusUsingTool, v_term, corpus, tool), $$BookkeepingMt);
				mysentient_utilities.myse_assert_now(el_utilities.make_ternary_formula($$glfComponentSemanticsWRTGraph, el_utilities.make_binary_formula($$GLFNodeSemanticsWRTGraphFn, v_term, $$TheCycOntologyGraph), v_term, $$TheCycOntologyGraph), $$GLFMt);
				mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$defaultCandidateFocalNodeInSystem, el_utilities.make_binary_formula($$GLFNodeSemanticsWRTGraphFn, v_term, $$TheCycOntologyGraph), mysentient_concept_extractor.ais_for($$TheCycOntologyGraph)), graphing_mt);
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						operation_communication.set_the_cyclist(old_cyclist);
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
			return v_term;
		}
	}

	public static final SubLObject learned_nouns_reify_unknown_noun_from_corpus_for_mysentient_method(SubLObject self, SubLObject noun_string, SubLObject corpus, SubLObject graphing_mt, SubLObject conjectures) {
		{
			SubLObject new_term = NIL;
			SubLObject old_cyclist = operation_communication.the_cyclist();
			try {
				operation_communication.set_the_cyclist($$TheMySentientSystem);
				new_term = mysentient_utilities.myse_create(noun_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				{
					SubLObject cdolist_list_var = conjectures;
					SubLObject conjecture = NIL;
					for (conjecture = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), conjecture = cdolist_list_var.first()) {
						{
							SubLObject formula = cycl_utilities.expression_subst(new_term, $MEANING, conjecture, symbol_function(EQ), UNPROVIDED);
							mysentient_utilities.myse_assert_now(formula, $$UniversalVocabularyMt);
						}
					}
				}
				mysentient_utilities.myse_assert_now(el_utilities.make_binary_formula($$termStrings, new_term, noun_string), $$GeneralEnglishMt);
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						operation_communication.set_the_cyclist(old_cyclist);
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
			methods.funcall_class_method_with_4_args(LEARNED_NOUNS, ASSERT_CORPUS_MENTION_FOR_MYSENTIENT, new_term, corpus, graphing_mt, $const368$TheMySentientDefinitionSuggestorT);
			return new_term;
		}
	}

	public static final SubLObject learned_nouns_compile_raw_data_from_text_files_method(SubLObject self, SubLObject subj_pairs_file, SubLObject obj_pairs_file, SubLObject complex_nouns_file) {
		methods.funcall_instance_method_with_2_args(self, COMPILE_RAW_DATA_FOR_ARG_FROM_TEXT_FILE, $SUBJ, subj_pairs_file);
		methods.funcall_instance_method_with_2_args(self, COMPILE_RAW_DATA_FOR_ARG_FROM_TEXT_FILE, $OBJ, obj_pairs_file);
		methods.funcall_instance_method_with_1_args(self, COMPILE_COMPLEX_NOUN_DATA_FROM_TEXT_FILE, complex_nouns_file);
		return self;
	}

	public static final SubLObject learned_nouns_compile_raw_data_from_text_files_directory_method(SubLObject self, SubLObject input_directory, SubLObject subj_pairs_file_suffix, SubLObject obj_pairs_file_suffix, SubLObject complex_nouns_file_suffix) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject complex_nouns_files = NIL;
				SubLSystemTrampolineFile.checkType(input_directory, DIRECTORY_P);
				{
					SubLObject directory_list_var = list(input_directory);
					SubLObject current_directory_var = NIL;
					for (current_directory_var = directory_list_var.first(); NIL != directory_list_var; current_directory_var = directory_list_var.first()) {
						directory_list_var = directory_list_var.rest();
						SubLSystemTrampolineFile.checkType(current_directory_var, DIRECTORY_P);
						{
							SubLObject directory_contents_var = Filesys.directory(current_directory_var, T);
							SubLObject progress_message_var = ($str_alt381$Processing_directory_tree_files__.isString()) ? ((SubLObject) (cconcatenate($str_alt381$Processing_directory_tree_files__, cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { $str_alt382$_Directory__, format_nil.format_nil_s_no_copy(current_directory_var) })))) : NIL;
							{
								SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
								try {
									utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
									{
										SubLObject list_var = directory_contents_var;
										utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
										utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
										utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
										utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
										{
											SubLObject _prev_bind_0_21 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
											SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
											SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
											SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
											try {
												utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
												utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
												utilities_macros.$within_noting_percent_progress$.bind(T, thread);
												utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
												utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
												{
													SubLObject csome_list_var = list_var;
													SubLObject file = NIL;
													for (file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), file = csome_list_var.first()) {
														utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
														utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
														if (NIL != Filesys.directory_p(file)) {
															directory_list_var = cons(file, directory_list_var);
														} else {
															if (NIL != string_utilities.ends_with(file, subj_pairs_file_suffix, UNPROVIDED)) {
																methods.funcall_instance_method_with_2_args(self, COMPILE_RAW_DATA_FOR_ARG_FROM_TEXT_FILE, $SUBJ, file);
															} else if (NIL != string_utilities.ends_with(file, obj_pairs_file_suffix, UNPROVIDED)) {
																methods.funcall_instance_method_with_2_args(self, COMPILE_RAW_DATA_FOR_ARG_FROM_TEXT_FILE, $OBJ, file);
															} else if (NIL != string_utilities.ends_with(file, complex_nouns_file_suffix, UNPROVIDED)) {
																complex_nouns_files = cons(file, complex_nouns_files);
															} else {
																format(T, $str_alt383$__Ignoring_file___S__, file);
															}

														}
													}
												}
												utilities_macros.noting_percent_progress_postamble();
											} finally {
												utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
												utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
												utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
												utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_21, thread);
											}
										}
									}
								} finally {
									utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
								}
							}
						}
					}
				}
				{
					SubLObject cdolist_list_var = complex_nouns_files;
					SubLObject complex_nouns_file = NIL;
					for (complex_nouns_file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), complex_nouns_file = cdolist_list_var.first()) {
						methods.funcall_instance_method_with_1_args(self, COMPILE_COMPLEX_NOUN_DATA_FROM_TEXT_FILE, complex_nouns_file);
					}
				}
				return self;
			}
		}
	}

	public static final SubLObject learned_nouns_compile_raw_data_from_verbal_matches_lists_method(SubLObject self, SubLObject verb_subjects_list, SubLObject verb_objects_list, SubLObject nouns_without_verbs_list) {
		if (nouns_without_verbs_list == UNPROVIDED) {
			nouns_without_verbs_list = NIL;
		}
		methods.funcall_instance_method_with_2_args(self, COMPILE_RAW_DATA_FOR_ARG_FROM_VERBAL_MATCHES_LIST, $SUBJ, verb_subjects_list);
		methods.funcall_instance_method_with_2_args(self, COMPILE_RAW_DATA_FOR_ARG_FROM_VERBAL_MATCHES_LIST, $OBJ, verb_objects_list);
		methods.funcall_instance_method_with_2_args(self, COMPILE_COMPLEX_NOUN_DATA_FROM_VERBAL_MATCHES_LISTS, verb_subjects_list, verb_objects_list);
		return self;
	}

	public static final SubLObject learned_nouns_compile_raw_data_for_arg_from_text_file_method(SubLObject self, SubLObject relation, SubLObject pairs_file) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject first_lineP = T;
				{
					SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
					SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
					SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
					SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
					try {
						utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
						utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
						utilities_macros.$within_noting_percent_progress$.bind(T, thread);
						utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
						utilities_macros.noting_percent_progress_preamble(cconcatenate(string_utilities.uncapitalize_smart(string_utilities.to_string(relation)), new SubLObject[] { $str_alt393$ect_file__, pairs_file }));
						{
							SubLObject file_var = pairs_file;
							SubLObject stream = NIL;
							try {
								{
									SubLObject _prev_bind_0_22 = stream_macros.$stream_requires_locking$.currentBinding(thread);
									try {
										stream_macros.$stream_requires_locking$.bind(NIL, thread);
										stream = compatibility.open_text(file_var, $INPUT, NIL);
									} finally {
										stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_22, thread);
									}
								}
								if (!stream.isStream()) {
									Errors.error($str_alt255$Unable_to_open__S, file_var);
								}
								{
									SubLObject stream_var = stream;
									if (stream_var.isStream()) {
										{
											SubLObject length_var = file_length(stream_var);
											SubLObject stream_var_23 = stream_var;
											SubLObject line_number_var = NIL;
											SubLObject line = NIL;
											for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_23, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var), line = read_line(stream_var_23, NIL, NIL, UNPROVIDED)) {
												if (NIL != first_lineP) {
													first_lineP = NIL;
												} else {
													{
														SubLObject datum = string_utilities.break_words(line, symbol_function(NON_TAB_CHAR_P), UNPROVIDED);
														SubLObject current = datum;
														SubLObject sentence = NIL;
														SubLObject arg_verb_pairs = NIL;
														destructuring_bind_must_consp(current, datum, $list_alt396);
														sentence = current.first();
														current = current.rest();
														arg_verb_pairs = current;
														{
															SubLObject cdolist_list_var = arg_verb_pairs;
															SubLObject pair = NIL;
															for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
																{
																	SubLObject datum_24 = string_utilities.break_words(pair, symbol_function(NON_SPACE_CHAR_P), UNPROVIDED);
																	SubLObject current_25 = datum_24;
																	SubLObject noun_string_with_suffix = NIL;
																	SubLObject verb_with_suffix = NIL;
																	destructuring_bind_must_consp(current_25, datum_24, $list_alt398);
																	noun_string_with_suffix = current_25.first();
																	current_25 = current_25.rest();
																	destructuring_bind_must_consp(current_25, datum_24, $list_alt398);
																	verb_with_suffix = current_25.first();
																	current_25 = current_25.rest();
																	if (NIL == current_25) {
																		methods.funcall_instance_method_with_3_args(self, COMPILE_RAW_DATA_FOR_ARG_INT, relation, noun_string_with_suffix, verb_with_suffix);
																	} else {
																		cdestructuring_bind_error(datum_24, $list_alt398);
																	}
																}
															}
														}
													}
												}
												utilities_macros.note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
											}
										}
									}
								}
							} finally {
								{
									SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										if (stream.isStream()) {
											close(stream, UNPROVIDED);
										}
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
									}
								}
							}
						}
						utilities_macros.noting_percent_progress_postamble();
					} finally {
						utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
						utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
						utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
						utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
					}
				}
				return NIL;
			}
		}
	}

	public static final SubLObject learned_nouns_compile_raw_data_for_arg_from_verbal_matches_list_method(SubLObject self, SubLObject relation, SubLObject list) {
		{
			SubLObject cdolist_list_var = list;
			SubLObject arg_verb_pair = NIL;
			for (arg_verb_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), arg_verb_pair = cdolist_list_var.first()) {
				{
					SubLObject datum = arg_verb_pair;
					SubLObject current = datum;
					SubLObject noun_head_with_suffix = NIL;
					SubLObject verb_with_suffix = NIL;
					SubLObject whole_noun = NIL;
					SubLObject determiner = NIL;
					SubLObject caveat = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt403);
					noun_head_with_suffix = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt403);
					verb_with_suffix = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt403);
					whole_noun = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt403);
					determiner = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt403);
					caveat = current.first();
					current = current.rest();
					if (NIL == current) {
						if (NIL == subl_promotions.memberP(caveat, $list_alt404, UNPROVIDED, UNPROVIDED)) {
							noun_head_with_suffix = string_utilities.string_substitute($str_alt405$_, $str_alt406$_, noun_head_with_suffix, UNPROVIDED);
							verb_with_suffix = string_utilities.string_substitute($str_alt405$_, $str_alt406$_, verb_with_suffix, UNPROVIDED);
							methods.funcall_instance_method_with_3_args(self, COMPILE_RAW_DATA_FOR_ARG_INT, relation, noun_head_with_suffix, verb_with_suffix);
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt403);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject learned_nouns_compile_raw_data_for_arg_int_method(SubLObject self, SubLObject relation, SubLObject noun_string_with_suffix, SubLObject verb_with_suffix) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject error = NIL;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								thread.resetMultipleValues();
								{
									SubLObject verb = detach_pos_suffix(verb_with_suffix);
									SubLObject verb_pos_suffix = thread.secondMultipleValue();
									thread.resetMultipleValues();
									if (!verb_pos_suffix.equal($$$VB)) {
										Errors.warn($str_alt412$The_verb__S_does_not_have_the_exp, verb_with_suffix);
									} else {
										thread.resetMultipleValues();
										{
											SubLObject noun_string = detach_pos_suffix(noun_string_with_suffix);
											SubLObject noun_pos_suffix = thread.secondMultipleValue();
											thread.resetMultipleValues();
											if (!(noun_pos_suffix.equal($$$NN) || noun_pos_suffix.equal($$$NP))) {
											} else {
												if (NIL != Strings.string_equal(verb, $$$cum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
													verb = $$$come;
												}
												if ((NIL != Strings.string_equal(verb, $str_alt417$_m, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.string_equal(verb, $str_alt418$_s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
													verb = $$$be;
												}
												if (!((NIL != string_utilities.non_alphabetic_stringP(noun_string)) || (NIL != lexicon_accessors.closed_lexical_class_stringP(noun_string, UNPROVIDED)))) {
													methods.funcall_instance_method_with_3_args(self, INCREMENT_RELEVANT_COUNTS_FOR_ARG_VERB_RELATION_TRIPLE, Strings.string_downcase(noun_string, UNPROVIDED, UNPROVIDED), verb, relation);
												}
											}
										}
									}
								}
							} catch (Throwable catch_var) {
								Errors.handleThrowable(catch_var, NIL);
							}
						} finally {
							Errors.$error_handler$.rebind(_prev_bind_0, thread);
						}
					}
				} catch (Throwable ccatch_env_var) {
					error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error) {
					Errors.warn($str_alt421$In_COMPILE_RAW_DATA_FOR_ARG_INT__, error);
				}
				return NIL;
			}
		}
	}

	/**
	 * Note that a noun headed by NOUN-STRING (i.e. either the simple noun NOUN-STRING itself or a complex noun headed by it) occurred
	 * in the RELATION relation with the verb VERB.
	 */
	public static final SubLObject learned_nouns_increment_relevant_counts_for_arg_verb_relation_triple_method(SubLObject self, SubLObject noun_string, SubLObject verb, SubLObject relation) {
		{
			SubLObject noun_object = methods.funcall_instance_method_with_1_args(self, FIND_OR_CREATE_SIMPLE_NOUN, noun_string);
			methods.funcall_instance_method_with_2_args(noun_object, RECORD_OCCURRENCE_WITH_VERB, verb, relation);
			return NIL;
		}
	}

	/**
	 * Note that a noun headed by HEAD-STRING (i.e. either the simple noun HEAD-STRING itself or a complex noun headed by it) occurred,
	 * but not as the subject or direct object of any verb.
	 */
	public static final SubLObject learned_nouns_note_occurrence_of_head_noun_with_no_verb_method(SubLObject self, SubLObject head_string) {
		{
			SubLObject noun_object = methods.funcall_instance_method_with_1_args(self, FIND_OR_CREATE_SIMPLE_NOUN, head_string);
			methods.funcall_instance_method_with_0_args(noun_object, RECORD_OCCURRENCE_WITH_NO_VERB);
			return NIL;
		}
	}

	public static final SubLObject learned_nouns_compile_complex_noun_data_from_text_file_method(SubLObject self, SubLObject complex_nouns_file) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
				SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
				SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
				SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
				try {
					utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
					utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
					utilities_macros.$within_noting_percent_progress$.bind(T, thread);
					utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
					utilities_macros.noting_percent_progress_preamble(cconcatenate($str_alt434$Nouns_file__, complex_nouns_file));
					{
						SubLObject file_var = complex_nouns_file;
						SubLObject stream = NIL;
						try {
							{
								SubLObject _prev_bind_0_27 = stream_macros.$stream_requires_locking$.currentBinding(thread);
								try {
									stream_macros.$stream_requires_locking$.bind(NIL, thread);
									stream = compatibility.open_text(file_var, $INPUT, NIL);
								} finally {
									stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_27, thread);
								}
							}
							if (!stream.isStream()) {
								Errors.error($str_alt255$Unable_to_open__S, file_var);
							}
							{
								SubLObject stream_var = stream;
								if (stream_var.isStream()) {
									{
										SubLObject length_var = file_length(stream_var);
										SubLObject stream_var_28 = stream_var;
										SubLObject line_number_var = NIL;
										SubLObject line = NIL;
										for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_28, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var), line = read_line(stream_var_28, NIL, NIL, UNPROVIDED)) {
											if (!((NIL != string_utilities.empty_string_p(line)) || CHAR_semicolon.eql(string_utilities.first_char(line)))) {
												{
													SubLObject whole_noun_string = NIL;
													SubLObject head_string_with_suffix = NIL;
													SubLObject determiner = NIL;
													SubLObject error = NIL;
													try {
														{
															SubLObject _prev_bind_0_29 = Errors.$error_handler$.currentBinding(thread);
															try {
																Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
																try {
																	{
																		SubLObject datum_evaluated_var = string_utilities.break_words(line, symbol_function(NON_TAB_CHAR_P), UNPROVIDED);
																		whole_noun_string = datum_evaluated_var.first();
																		head_string_with_suffix = cadr(datum_evaluated_var);
																		determiner = cddr(datum_evaluated_var).first();
																	}
																	if (NIL == determiner) {
																		Errors.error($str_alt435$The_line__S_failed_to_match_the_p, line);
																	}
																} catch (Throwable catch_var) {
																	Errors.handleThrowable(catch_var, NIL);
																}
															} finally {
																Errors.$error_handler$.rebind(_prev_bind_0_29, thread);
															}
														}
													} catch (Throwable ccatch_env_var) {
														error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
													}
													if (NIL != error) {
														Errors.warn(error);
													} else {
														methods.funcall_instance_method_with_3_args(self, COMPILE_COMPLEX_NOUN_DATA_INT, whole_noun_string, head_string_with_suffix, determiner);
													}
												}
											}
											utilities_macros.note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
										}
									}
								}
							}
						} finally {
							{
								SubLObject _prev_bind_0_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									if (stream.isStream()) {
										close(stream, UNPROVIDED);
									}
								} finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0_30, thread);
								}
							}
						}
					}
					utilities_macros.noting_percent_progress_postamble();
				} finally {
					utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
					utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
					utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
					utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
				}
			}
			return NIL;
		}
	}

	public static final SubLObject learned_nouns_compile_complex_noun_data_from_verbal_matches_lists_method(SubLObject self, SubLObject verb_subject_matches_list, SubLObject verb_object_matches_list) {
		{
			SubLObject cdolist_list_var = append(verb_subject_matches_list, verb_object_matches_list);
			SubLObject match = NIL;
			for (match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), match = cdolist_list_var.first()) {
				{
					SubLObject datum = match;
					SubLObject current = datum;
					SubLObject head_string_with_suffix = NIL;
					SubLObject verb = NIL;
					SubLObject whole_noun_string = NIL;
					SubLObject determiner = NIL;
					SubLObject caveat = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt440);
					head_string_with_suffix = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt440);
					verb = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt440);
					whole_noun_string = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt440);
					determiner = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt440);
					caveat = current.first();
					current = current.rest();
					if (NIL == current) {
						if (NIL == subl_promotions.memberP(caveat, $list_alt404, UNPROVIDED, UNPROVIDED)) {
							methods.funcall_instance_method_with_3_args(self, COMPILE_COMPLEX_NOUN_DATA_INT, whole_noun_string, head_string_with_suffix, determiner);
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt440);
					}
				}
			}
			return NIL;
		}
	}

	public static final SubLObject learned_nouns_compile_complex_noun_data_int_method(SubLObject self, SubLObject whole_noun_string, SubLObject head_string_with_suffix, SubLObject determiner) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject error = NIL;
				try {
					{
						SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								thread.resetMultipleValues();
								{
									SubLObject head_string = detach_pos_suffix(head_string_with_suffix);
									SubLObject head_pos_suffix = thread.secondMultipleValue();
									thread.resetMultipleValues();
									if (head_pos_suffix.equal($$$NN) || head_pos_suffix.equal($$$NP)) {
										if (NIL == lexicon_accessors.closed_lexical_class_stringP(head_string, UNPROVIDED)) {
											{
												SubLObject head_noun = methods.funcall_instance_method_with_1_args(self, FIND_NOUN, head_string);
												if (NIL == head_noun) {
													Errors.warn($str_alt444$Ignoring_data_for__S_because_its_, whole_noun_string, head_string);
												} else {
													{
														SubLObject whole_noun_noun = NIL;
														if (NIL != string_utilities.multi_word_string(whole_noun_string)) {
															{
																SubLObject whole_noun_string_normalized = singularize_complex_noun(whole_noun_string, head_string);
																whole_noun_noun = methods.funcall_instance_method_with_2_args(self, FIND_OR_CREATE_COMPLEX_NOUN, whole_noun_string_normalized, head_noun);
															}
														} else {
															whole_noun_noun = head_noun;
														}
														methods.funcall_instance_method_with_0_args(whole_noun_noun, INCREMENT_TOTAL_COUNT_AS_WHOLE_NOUN);
														if (NIL != plural_form_ofP(whole_noun_string, head_string)) {
															methods.funcall_instance_method_with_0_args(whole_noun_noun, INCREMENT_APPEARANCES_AS_PLURAL);
														}
														if (NIL != lexicon_accessors.string_is_posP(determiner, $$Determiner, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
															methods.funcall_instance_method_with_0_args(whole_noun_noun, INCREMENT_APPEARANCES_WITH_DETERMINER);
														}
														if (NIL != string_utilities.capitalized_string_p(whole_noun_string)) {
															methods.funcall_instance_method_with_0_args(whole_noun_noun, INCREMENT_APPEARANCES_IN_ALL_CAPS);
															if (NIL != Strings.string_equal(determiner, $$$the, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
																methods.funcall_instance_method_with_0_args(whole_noun_noun, INCREMENT_APPEARANCES_IN_ALL_CAPS_WITH_THE);
															}
														}
													}
												}
											}
										}
									}
								}
							} catch (Throwable catch_var) {
								Errors.handleThrowable(catch_var, NIL);
							}
						} finally {
							Errors.$error_handler$.rebind(_prev_bind_0, thread);
						}
					}
				} catch (Throwable ccatch_env_var) {
					error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				}
				if (NIL != error) {
					Errors.warn($str_alt452$In_COMPILE_COMPLEX_NOUN_DATA_INT_, error);
				}
				return NIL;
			}
		}
	}

	public static final SubLObject learned_nouns_accuracy_method(SubLObject self, SubLObject sample_size, SubLObject count_threshold, SubLObject generality_cutoff) {
		if (sample_size == UNPROVIDED) {
			sample_size = $int$100;
		}
		if (count_threshold == UNPROVIDED) {
			count_threshold = get_learned_nouns_noun_relevance_count_threshold(self);
		}
		if (generality_cutoff == UNPROVIDED) {
			generality_cutoff = $int$230000;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject scores = NIL;
				SubLObject count_threshold_var = count_threshold;
				SubLObject confidence_threshold_var = NIL;
				SubLObject statuses_var = $ALL;
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_learned_nouns_dictionary_of_nouns(self)));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject string_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject simple_noun = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if ((((NIL != noun_learner_noun_classes.simple_noun_p(simple_noun)) && methods.funcall_instance_method_with_0_args(simple_noun, GET_TOTAL_COUNT).numGE(count_threshold_var)) && ((NIL == confidence_threshold_var) || methods.funcall_instance_method_with_0_args(simple_noun, GET_CONFIDENCE_LEVEL).numG(confidence_threshold_var)))
								&& ((statuses_var == $ALL) || (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(simple_noun, GET_STATUS_IN_CYC), statuses_var, EQ, UNPROVIDED)))) {
							if (length(scores).numL(sample_size)) {
								{
									SubLObject denots = lexicon_accessors.denots_of_string(noun_learner_noun_classes.get_noun_string(simple_noun), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									if (NIL != list_utilities.singletonP(denots)) {
										{
											SubLObject denot = denots.first();
											if ((NIL != forts.fort_p(denot)) && (NIL == genls_hierarchy_problems.fort_not_properly_in_genls_hierarchyP(denot))) {
												{
													SubLObject all_types = NIL;
													SubLObject types = NIL;
													{
														SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
														SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
														try {
															mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
															mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
															if (NIL != fort_types_interface.collection_p(denot)) {
																all_types = genls.all_genls(denot, UNPROVIDED, UNPROVIDED);
															} else {
																all_types = isa.all_isa(denot, UNPROVIDED, UNPROVIDED);
															}
														} finally {
															mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
															mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
														}
													}
													{
														SubLObject cdolist_list_var = all_types;
														SubLObject type = NIL;
														for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), type = cdolist_list_var.first()) {
															if ((NIL != fort_types_interface.collection_p(type)) && cardinality_estimates.generality_estimate(type).numL(generality_cutoff)) {
																types = cons(type, types);
															}
														}
													}
													if (NIL != types) {
														{
															SubLObject best_ranking_among_types = NIL;
															SubLObject best_ranked_type = NIL;
															SubLObject cdolist_list_var = types;
															SubLObject type = NIL;
															for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), type = cdolist_list_var.first()) {
																{
																	SubLObject ranking_of_this_type = methods.funcall_instance_method_with_1_args(simple_noun, GET_RANKING_OF, type);
																	if (ranking_of_this_type.isInteger() && ((NIL == best_ranking_among_types) || ranking_of_this_type.numL(best_ranking_among_types))) {
																		best_ranking_among_types = ranking_of_this_type;
																		best_ranked_type = type;
																	}
																}
															}
															scores = cons(best_ranking_among_types, scores);
															format(T, $str_alt462$__Noun___S__Highest_ranked___S__R, new SubLObject[] { noun_learner_noun_classes.get_noun_string(simple_noun), best_ranked_type, best_ranking_among_types });
														}
													}
												}
											}
										}
									}
								}
							}
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				{
					SubLObject number_top_ranked = ZERO_INTEGER;
					SubLObject number_in_top_5 = ZERO_INTEGER;
					SubLObject number_in_top_10 = ZERO_INTEGER;
					SubLObject number_in_top_25 = ZERO_INTEGER;
					SubLObject number_in_top_50 = ZERO_INTEGER;
					SubLObject number_unranked = ZERO_INTEGER;
					SubLObject cdolist_list_var = scores;
					SubLObject score = NIL;
					for (score = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), score = cdolist_list_var.first()) {
						if (NIL != score) {
							if (score.isZero()) {
								number_top_ranked = add(number_top_ranked, ONE_INTEGER);
							}
							if (score.numL(FIVE_INTEGER)) {
								number_in_top_5 = add(number_in_top_5, ONE_INTEGER);
							}
							if (score.numL(TEN_INTEGER)) {
								number_in_top_10 = add(number_in_top_10, ONE_INTEGER);
							}
							if (score.numL($int$25)) {
								number_in_top_25 = add(number_in_top_25, ONE_INTEGER);
							}
							if (score.numL($int$50)) {
								number_in_top_50 = add(number_in_top_50, ONE_INTEGER);
							}
						} else {
							number_unranked = add(number_unranked, ONE_INTEGER);
						}
					}
					format(T, $str_alt464$__Top_ranked___S__In_top_5___S__I, new SubLObject[] { number_top_ranked, number_in_top_5, number_in_top_10, number_in_top_25, number_in_top_50, number_unranked });
					format(T, $str_alt465$__Sample_size___S__, length(scores));
				}
				return NIL;
			}
		}
	}

	/**
	 * Create a file hash table that maps each noun string to its top 20 calculated types.
	 *
	 * @return file-hash-table-p; maps string -> list of forts
	 */
	public static final SubLObject learned_nouns_dump_calculated_tags_method(SubLObject self, SubLObject filename, SubLObject tempstem) {
		if (tempstem == UNPROVIDED) {
			tempstem = $str_alt470$__tmp_;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			SubLSystemTrampolineFile.checkType(filename, STRINGP);
			{
				SubLObject fht = file_hash_table.fast_create_file_hash_table(filename, tempstem, symbol_function(EQUAL), $IMAGE_INDEPENDENT_CFASL);
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_learned_nouns_dictionary_of_nouns(self)));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject string_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject noun = thread.secondMultipleValue();
						thread.resetMultipleValues();
						{
							SubLObject noun_string = methods.funcall_instance_method_with_0_args(noun, GET_STRING);
							SubLObject top_n_tags = methods.funcall_instance_method_with_1_args(noun, GET_TOP_N_TAGS, TWENTY_INTEGER);
							file_hash_table.fast_put_file_hash_table(noun_string, fht, top_n_tags);
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				file_hash_table.finalize_fast_create_file_hash_table(fht, UNPROVIDED, UNPROVIDED);
				return fht;
			}
		}
	}

	public static final SubLObject learned_nouns_calculate_typicality_sum_by_collection_method(SubLObject self, SubLObject simple_noun) {
		{
			SubLObject noun_relevance_count_threshold = get_learned_nouns_noun_relevance_count_threshold(self);
			SubLSystemTrampolineFile.checkType(simple_noun, SIMPLE_NOUN_P);
			{
				SubLObject count_threshold = methods.funcall_instance_method_with_0_args(self, GET_NOUN_RELEVANCE_COUNT_THRESHOLD);
				SubLObject total_count = methods.funcall_instance_method_with_0_args(simple_noun, GET_TOTAL_COUNT);
				if (total_count.numL(count_threshold)) {
					return $DONT_CARE;
				} else {
					{
						SubLObject count_as_subject_by_verb = noun_learner_noun_classes.get_simple_noun_count_as_subject_by_verb(simple_noun);
						SubLObject count_as_object_by_verb = noun_learner_noun_classes.get_simple_noun_count_as_object_by_verb(simple_noun);
						SubLObject typicality_metric = methods.funcall_instance_method_with_0_args(self, GET_TYPICALITY_METRIC);
						SubLObject weight_summands_by_selectivenessP = methods.funcall_instance_method_with_0_args(self, $sym233$WEIGHT_SUMMANDS_BY_SELECTIVENESS_);
						return typicality_sum_by_collection_based_on_noun_usages(count_as_subject_by_verb, count_as_object_by_verb, noun_relevance_count_threshold, typicality_metric, weight_summands_by_selectivenessP);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @return alist-p mapping collections to typicality sums, sorted by typicality sum; or :CANT-TELL
	 */
	public static final SubLObject typicality_sum_by_collection_based_on_noun_usages(SubLObject count_as_subject_by_verb, SubLObject count_as_object_by_verb, SubLObject noun_relevance_count_threshold, SubLObject typicality_metric, SubLObject weight_summands_by_selectivenessP) {
		if (noun_relevance_count_threshold == UNPROVIDED) {
			noun_relevance_count_threshold = ONE_INTEGER;
		}
		if (typicality_metric == UNPROVIDED) {
			typicality_metric = symbol_function(ADJUSTED_POINTWISE_MUTUAL_INFORMATION);
		}
		if (weight_summands_by_selectivenessP == UNPROVIDED) {
			weight_summands_by_selectivenessP = T;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject verbs_with_typical_subj = verb_argument_lookups.verbs_with_known_typical_subject();
				SubLObject verbs_with_typical_obj = verb_argument_lookups.verbs_with_known_typical_object();
				SubLObject count_as_subject_by_verb_filtered = dictionary_utilities.copy_dictionary(count_as_subject_by_verb);
				SubLObject count_as_object_by_verb_filtered = dictionary_utilities.copy_dictionary(count_as_object_by_verb);
				{
					SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(count_as_subject_by_verb));
					while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
						thread.resetMultipleValues();
						{
							SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
							SubLObject value = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if (NIL == subl_promotions.memberP(verb, verbs_with_typical_subj, symbol_function(EQUAL), UNPROVIDED)) {
								dictionary.dictionary_remove(count_as_subject_by_verb_filtered, verb);
							}
							iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
						}
					}
					dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				}
				{
					SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(count_as_object_by_verb));
					while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
						thread.resetMultipleValues();
						{
							SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
							SubLObject value = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if (NIL == subl_promotions.memberP(verb, verbs_with_typical_obj, symbol_function(EQUAL), UNPROVIDED)) {
								dictionary.dictionary_remove(count_as_object_by_verb_filtered, verb);
							}
							iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
						}
					}
					dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				}
				if (add(dictionary_utilities.dictionary_total(count_as_subject_by_verb_filtered), dictionary_utilities.dictionary_total(count_as_object_by_verb_filtered)).numL(noun_relevance_count_threshold)) {
					return $CANT_TELL;
				} else {
					{
						SubLObject possible_collections = possible_collections_for_noun_conjecture(count_as_subject_by_verb_filtered, count_as_object_by_verb_filtered);
						SubLObject result = NIL;
						if (NIL == possible_collections) {
							result = acons($$Nothing, NIL, result);
						} else {
							{
								SubLObject cdolist_list_var = possible_collections;
								SubLObject collection = NIL;
								for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collection = cdolist_list_var.first()) {
									{
										SubLObject typicality_sum = typicality_sum_based_on_noun_usages(collection, count_as_subject_by_verb_filtered, count_as_object_by_verb_filtered, typicality_metric, weight_summands_by_selectivenessP);
										result = acons(collection, typicality_sum, result);
									}
								}
								result = list_utilities.sort_alist_by_values(result, symbol_function($sym28$_));
							}
						}
						return result;
					}
				}
			}
		}
	}

	/**
	 * Consider only those collections which we know can occur with any of the verbs with which the unknown noun occurs
	 */
	public static final SubLObject possible_collections_for_noun_conjecture(SubLObject verb_counts_as_subj, SubLObject verb_counts_as_obj) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject possible_collections_subj = NIL;
				SubLObject possible_collections_obj = NIL;
				if (NIL == dictionary.dictionary_empty_p(verb_counts_as_subj)) {
					{
						SubLObject arbitrary_verb = dictionary_utilities.dictionary_arbitrary_key(verb_counts_as_subj);
						possible_collections_subj = verb_argument_lookups.possible_subjects(arbitrary_verb);
						{
							SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(verb_counts_as_subj));
							while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
								thread.resetMultipleValues();
								{
									SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
									SubLObject count = thread.secondMultipleValue();
									thread.resetMultipleValues();
									if (verb != arbitrary_verb) {
										possible_collections_subj = intersection(possible_collections_subj, verb_argument_lookups.possible_subjects(verb), UNPROVIDED, UNPROVIDED);
									}
									iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
								}
							}
							dictionary_contents.do_dictionary_contents_finalize(iteration_state);
						}
					}
				}
				if (NIL == dictionary.dictionary_empty_p(verb_counts_as_obj)) {
					{
						SubLObject arbitrary_verb = dictionary_utilities.dictionary_arbitrary_key(verb_counts_as_obj);
						possible_collections_obj = verb_argument_lookups.possible_objects(arbitrary_verb);
						{
							SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(verb_counts_as_obj));
							while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
								thread.resetMultipleValues();
								{
									SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
									SubLObject count = thread.secondMultipleValue();
									thread.resetMultipleValues();
									if (verb != arbitrary_verb) {
										possible_collections_obj = intersection(possible_collections_obj, verb_argument_lookups.possible_objects(verb), UNPROVIDED, UNPROVIDED);
									}
									iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
								}
							}
							dictionary_contents.do_dictionary_contents_finalize(iteration_state);
						}
					}
				}
				return NIL != dictionary.dictionary_empty_p(verb_counts_as_subj) ? ((SubLObject) (possible_collections_obj)) : NIL != dictionary.dictionary_empty_p(verb_counts_as_obj) ? ((SubLObject) (possible_collections_subj)) : intersection(possible_collections_subj, possible_collections_obj, UNPROVIDED, UNPROVIDED);
			}
		}
	}

	/**
	 * Return the sum of:
	 * the pairwise products (optionally weighted by verb selectiveness) of:
	 * the typicality between COLLECTION and each verb as measured by TYPICALITY-METRIC;
	 * and the number of times the unknown noun appeared with that verb
	 * See the example in the comment for @xref CALCULATE-TAG-TYPICALITY-SUM-METHOD,
	 * for which this is a helper.
	 */
	public static final SubLObject typicality_sum_based_on_noun_usages(SubLObject collection, SubLObject verb_counts_as_subj, SubLObject verb_counts_as_obj, SubLObject typicality_metric, SubLObject weight_summands_by_selectivenessP) {
		if (typicality_metric == UNPROVIDED) {
			typicality_metric = symbol_function(ADJUSTED_POINTWISE_MUTUAL_INFORMATION);
		}
		if (weight_summands_by_selectivenessP == UNPROVIDED) {
			weight_summands_by_selectivenessP = T;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = ZERO_INTEGER;
				{
					SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(verb_counts_as_subj));
					while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
						thread.resetMultipleValues();
						{
							SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
							SubLObject count = thread.secondMultipleValue();
							thread.resetMultipleValues();
							{
								SubLObject _prev_bind_0 = $suspend_type_checkingP$.currentBinding(thread);
								try {
									$suspend_type_checkingP$.bind(T, thread);
									{
										SubLObject typicality = funcall(typicality_metric, verb, collection, $SUBJ);
										if (NIL != typicality) {
											{
												SubLObject typicality_times_count = multiply(typicality, count);
												if (NIL != weight_summands_by_selectivenessP) {
													{
														SubLObject selectiveness_of_verb = verb_argument_lookups.selectiveness(verb, $SUBJ);
														result = add(result, multiply(typicality_times_count, selectiveness_of_verb));
													}
												} else {
													result = add(result, typicality_times_count);
												}
											}
										}
									}
								} finally {
									$suspend_type_checkingP$.rebind(_prev_bind_0, thread);
								}
							}
							iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
						}
					}
					dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				}
				{
					SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(verb_counts_as_obj));
					while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
						thread.resetMultipleValues();
						{
							SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
							SubLObject count = thread.secondMultipleValue();
							thread.resetMultipleValues();
							{
								SubLObject _prev_bind_0 = $suspend_type_checkingP$.currentBinding(thread);
								try {
									$suspend_type_checkingP$.bind(T, thread);
									{
										SubLObject typicality = funcall(typicality_metric, verb, collection, $OBJ);
										if (NIL != typicality) {
											{
												SubLObject typicality_times_count = multiply(typicality, count);
												if (NIL != weight_summands_by_selectivenessP) {
													{
														SubLObject selectiveness_of_verb = verb_argument_lookups.selectiveness(verb, $OBJ);
														result = add(result, multiply(typicality_times_count, selectiveness_of_verb));
													}
												} else {
													result = add(result, typicality_times_count);
												}
											}
										}
									}
								} finally {
									$suspend_type_checkingP$.rebind(_prev_bind_0, thread);
								}
							}
							iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
						}
					}
					dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				}
				return result;
			}
		}
	}

	public static final SubLObject learned_nouns_why_not_tagged_as_int_method(SubLObject self, SubLObject simple_noun, SubLObject better_tag) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject typicality_sum_calculate_tag_methods = get_learned_nouns_typicality_sum_calculate_tag_methods(self);
				SubLObject calculate_tag_method = get_learned_nouns_calculate_tag_method(self);
				SubLSystemTrampolineFile.checkType(better_tag, COLLECTION_P);
				if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
					if (NIL == methods.funcall_class_method_with_1_args(self, TYPICALITY_SUM_CALCULATE_TAG_METHOD_P, calculate_tag_method)) {
						Errors.error($str_alt483$The_method_WHY_NOT_TAGGED_AS_is_o, list_utilities.alist_keys(typicality_sum_calculate_tag_methods));
					}
				}
				{
					SubLObject calculated_tag = methods.funcall_instance_method_with_0_args(simple_noun, GET_CALCULATED_TAG);
					format(T, $str_alt485$__The_calculated_tag_for__S_is__S, simple_noun, calculated_tag);
					if (!(calculated_tag.isKeyword() || (better_tag == calculated_tag))) {
						{
							SubLObject typicality_metric = methods.funcall_instance_method_with_0_args(self, GET_TYPICALITY_METRIC);
							SubLObject verb_counts_as_subj = noun_learner_noun_classes.get_simple_noun_count_as_subject_by_verb(simple_noun);
							SubLObject verb_counts_as_obj = noun_learner_noun_classes.get_simple_noun_count_as_object_by_verb(simple_noun);
							SubLObject calculated_tag_typicality_sum = ZERO_INTEGER;
							SubLObject better_tag_typicality_sum = ZERO_INTEGER;
							{
								SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(verb_counts_as_subj));
								while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
									thread.resetMultipleValues();
									{
										SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
										SubLObject count = thread.secondMultipleValue();
										thread.resetMultipleValues();
										{
											SubLObject calculated_tag_summand = funcall(typicality_metric, verb, calculated_tag, $SUBJ);
											SubLObject better_tag_summand = funcall(typicality_metric, verb, better_tag, $SUBJ);
											SubLObject weight_summands_by_selectivenessP = eq(calculate_tag_method, $APMI_SUM_WEIGHTED_BY_SELECTIVENESS);
											if (NIL != calculated_tag_summand) {
												format(T, $str_alt486$____As_subject____S_____S__, verb, count);
												format(T, $str_alt487$__typicality_subj__S__S_____S, new SubLObject[] { verb, calculated_tag, calculated_tag_summand });
												format(T, $str_alt488$__typicality_subj__S__S_____S__, new SubLObject[] { verb, better_tag, better_tag_summand });
												if (count.numG(ONE_INTEGER)) {
													calculated_tag_summand = multiply(calculated_tag_summand, count);
													better_tag_summand = multiply(better_tag_summand, count);
													format(T, $str_alt489$__Multiplied_by_count_of__S___, count);
													format(T, $str_alt490$_S____S__, calculated_tag, calculated_tag_summand);
													format(T, $str_alt490$_S____S__, better_tag, better_tag_summand);
												}
												if (NIL != weight_summands_by_selectivenessP) {
													{
														SubLObject selectiveness = verb_argument_lookups.selectiveness_wrt_subject(verb);
														calculated_tag_summand = multiply(calculated_tag_summand, selectiveness);
														better_tag_summand = multiply(better_tag_summand, selectiveness);
														format(T, $str_alt491$__Multiplied_by_selectiveness_wrt, verb, selectiveness);
														format(T, $str_alt490$_S____S__, calculated_tag, calculated_tag_summand);
														format(T, $str_alt490$_S____S__, better_tag, better_tag_summand);
													}
												}
												calculated_tag_typicality_sum = add(calculated_tag_typicality_sum, calculated_tag_summand);
												better_tag_typicality_sum = add(better_tag_typicality_sum, better_tag_summand);
												format(T, $str_alt492$__Total_so_far___);
												format(T, $str_alt490$_S____S__, calculated_tag, calculated_tag_typicality_sum);
												format(T, $str_alt490$_S____S__, better_tag, better_tag_typicality_sum);
											}
										}
										iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
									}
								}
								dictionary_contents.do_dictionary_contents_finalize(iteration_state);
							}
							format(T, $str_alt493$_________________________________);
							{
								SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(verb_counts_as_obj));
								while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
									thread.resetMultipleValues();
									{
										SubLObject verb = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
										SubLObject count = thread.secondMultipleValue();
										thread.resetMultipleValues();
										{
											SubLObject calculated_tag_summand = funcall(typicality_metric, verb, calculated_tag, $OBJ);
											SubLObject better_tag_summand = funcall(typicality_metric, verb, better_tag, $OBJ);
											SubLObject weight_summands_by_selectivenessP = eq(calculate_tag_method, $APMI_SUM_WEIGHTED_BY_SELECTIVENESS);
											if (NIL != calculated_tag_summand) {
												format(T, $str_alt494$____As_object____S_____S__, verb, count);
												format(T, $str_alt495$__typicality_obj__S__S_____S, new SubLObject[] { verb, calculated_tag, calculated_tag_summand });
												format(T, $str_alt496$__typicality_obj__S__S_____S__, new SubLObject[] { verb, better_tag, better_tag_summand });
												if (count.numG(ONE_INTEGER)) {
													calculated_tag_summand = multiply(calculated_tag_summand, count);
													better_tag_summand = multiply(better_tag_summand, count);
													format(T, $str_alt489$__Multiplied_by_count_of__S___, count);
													format(T, $str_alt490$_S____S__, calculated_tag, calculated_tag_summand);
													format(T, $str_alt490$_S____S__, better_tag, better_tag_summand);
												}
												if (NIL != weight_summands_by_selectivenessP) {
													{
														SubLObject selectiveness = verb_argument_lookups.selectiveness_wrt_object(verb);
														calculated_tag_summand = multiply(calculated_tag_summand, selectiveness);
														better_tag_summand = multiply(better_tag_summand, selectiveness);
														format(T, $str_alt497$__Multiplied_by_selectiveness_wrt, verb, selectiveness);
														format(T, $str_alt490$_S____S__, calculated_tag, calculated_tag_summand);
														format(T, $str_alt490$_S____S__, better_tag, better_tag_summand);
													}
												}
												calculated_tag_typicality_sum = add(calculated_tag_typicality_sum, calculated_tag_summand);
												better_tag_typicality_sum = add(better_tag_typicality_sum, better_tag_summand);
												format(T, $str_alt492$__Total_so_far___);
												format(T, $str_alt490$_S____S__, calculated_tag, calculated_tag_typicality_sum);
												format(T, $str_alt490$_S____S__, better_tag, better_tag_typicality_sum);
											}
										}
										iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
									}
								}
								dictionary_contents.do_dictionary_contents_finalize(iteration_state);
							}
						}
					}
				}
				return NIL;
			}
		}
	}

	/**
	 * This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.
	 * Use the public function @xref CFASL-OUTPUT or the like.
	 */
	public static final SubLObject learned_nouns_cfasl_output_method(SubLObject self, SubLObject stream) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject _prev_bind_0 = noun_learner_noun_classes.$warn_about_noun_serializationP$.currentBinding(thread);
				try {
					noun_learner_noun_classes.$warn_about_noun_serializationP$.bind(NIL, thread);
					object.object_cfasl_output_method(self, stream);
				} finally {
					noun_learner_noun_classes.$warn_about_noun_serializationP$.rebind(_prev_bind_0, thread);
				}
			}
			return self;
		}
	}

	/**
	 * This is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.
	 * Use the public function @xref CFASL-INPUT or the like.
	 */
	public static final SubLObject learned_nouns_cfasl_input_method(SubLObject self, SubLObject stream) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject learned = object.object_cfasl_input_method(self, stream);
				SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_learned_nouns_dictionary_of_nouns(learned)));
				while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
					thread.resetMultipleValues();
					{
						SubLObject string_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
						SubLObject noun = thread.secondMultipleValue();
						thread.resetMultipleValues();
						noun_learner_noun_classes.set_noun_learned(noun, learned);
						if (NIL != noun_learner_noun_classes.simple_noun_p(noun)) {
							{
								SubLObject complex_noun_strings = noun_learner_noun_classes.get_simple_noun_complex_nouns(noun);
								SubLObject complex_nouns = NIL;
								SubLObject cdolist_list_var = complex_noun_strings;
								SubLObject string = NIL;
								for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), string = cdolist_list_var.first()) {
									complex_nouns = cons(methods.funcall_instance_method_with_1_args(learned, FIND_NOUN, string), complex_nouns);
								}
								noun_learner_noun_classes.set_simple_noun_complex_nouns(noun, nreverse(complex_nouns));
							}
						} else {
							noun_learner_noun_classes.set_complex_noun_head(noun, methods.funcall_instance_method_with_1_args(learned, FIND_NOUN, noun_learner_noun_classes.get_complex_noun_head(noun)));
						}
						iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
					}
				}
				dictionary_contents.do_dictionary_contents_finalize(iteration_state);
				return learned;
			}
		}
	}

	/**
	 * Assuming that COMPLEX-NOUN-STRING is an English multi-word noun whose head (in singular form) is HEAD-STRING,
	 * return COMPLEX-NOUN-STRING in singular form (which may actually be its current form)
	 */
	public static final SubLObject singularize_complex_noun(SubLObject complex_noun_string, SubLObject head_string) {
		{
			SubLObject result = morphology.singularize_string_wXlexicon(complex_noun_string, $$EnglishMt);
			if (NIL != string_utilities.single_word_string_p(result)) {
				result = substitute(string_utilities.$space_char$.getGlobalValue(), CHAR_hyphen, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL == result) {
				{
					SubLObject head_string_pluralized = lexification_utilities.pluralize_word(head_string, UNPROVIDED_SYM);
					if (head_string.equalp(head_string_pluralized)) {
						result = complex_noun_string;
					} else {
						result = string_utilities.string_substitute_word(head_string, head_string_pluralized, complex_noun_string, symbol_function(EQUALP), UNPROVIDED);
					}
				}
			}
			return result;
		}
	}

	/**
	 * Assuming that WHOLE-NOUN-STRING is an English (possibly multi-word) noun whose head (in singular form) is HEAD-STRING,
	 * take a best guess at whether WHOLE-NOUN-STRING is a plural form.
	 */
	public static final SubLObject plural_form_ofP(SubLObject whole_noun_string, SubLObject head_string) {
		{
			SubLObject head_string_pluralized = lexification_utilities.pluralize_word(head_string, UNPROVIDED_SYM);
			if (head_string.equalp(head_string_pluralized)) {
				return NIL;
			} else {
				return list_utilities.sublisp_boolean(string_utilities.substringP(head_string_pluralized, whole_noun_string, UNPROVIDED, UNPROVIDED, UNPROVIDED));
			}
		}
	}

	public static final SubLObject detach_pos_suffix(SubLObject string_with_suffix) {
		{
			SubLObject length = length(string_with_suffix);
			return values(string_utilities.string_first_n(subtract(length, THREE_INTEGER), string_with_suffix), string_utilities.string_last_n(TWO_INTEGER, string_with_suffix));
		}
	}

	/**
	 * For each collection in SPECS, finds all the genls of it;  then returns all of
	 * those lists of genls appended to each other (duplicates optionally deleted).
	 * Like @xref UNION-ALL-GENLS except far less efficient, and gives the option of
	 * not deleting duplicates.
	 *
	 * @param SPECS;
	 * 		listp of collection-p
	 * @return listp of collection-p
	 */
	public static final SubLObject all_genls_of_any(SubLObject specs, SubLObject delete_duplicatesP) {
		if (delete_duplicatesP == UNPROVIDED) {
			delete_duplicatesP = T;
		}
		SubLSystemTrampolineFile.checkType(specs, LISTP);
		{
			SubLObject result = apply(symbol_function(APPEND), Mapping.mapcar(symbol_function(ALL_GENLS_IN_ANY_MT), specs));
			return NIL != delete_duplicatesP ? ((SubLObject) (list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : result;
		}
	}

	public static final SubLObject normalize_directory_name(SubLObject dir) {
		if (string_utilities.last_char(dir).eql(CHAR_slash)) {
			return dir;
		} else {
			return string_utilities.post_add_character_to_string(CHAR_slash, dir);
		}
	}

	public static final SubLObject declare_learned_nouns_file() {
		declareMacro("do_learned_nouns", "DO-LEARNED-NOUNS");
		declareMacro("do_learned_simple_nouns", "DO-LEARNED-SIMPLE-NOUNS");
		declareFunction("generate_constant_name_for_noun", "GENERATE-CONSTANT-NAME-FOR-NOUN", 1, 0, false);
		declareFunction("get_learned_nouns_noun_relevance_count_threshold", "GET-LEARNED-NOUNS-NOUN-RELEVANCE-COUNT-THRESHOLD", 1, 0, false);
		declareFunction("set_learned_nouns_noun_relevance_count_threshold", "SET-LEARNED-NOUNS-NOUN-RELEVANCE-COUNT-THRESHOLD", 2, 0, false);
		declareFunction("get_learned_nouns_calculate_tag_method", "GET-LEARNED-NOUNS-CALCULATE-TAG-METHOD", 1, 0, false);
		declareFunction("set_learned_nouns_calculate_tag_method", "SET-LEARNED-NOUNS-CALCULATE-TAG-METHOD", 2, 0, false);
		declareFunction("get_learned_nouns_dictionary_of_nouns", "GET-LEARNED-NOUNS-DICTIONARY-OF-NOUNS", 1, 0, false);
		declareFunction("set_learned_nouns_dictionary_of_nouns", "SET-LEARNED-NOUNS-DICTIONARY-OF-NOUNS", 2, 0, false);
		declareFunction("get_learned_nouns_calculate_tag_methods", "GET-LEARNED-NOUNS-CALCULATE-TAG-METHODS", 1, 0, false);
		declareFunction("set_learned_nouns_calculate_tag_methods", "SET-LEARNED-NOUNS-CALCULATE-TAG-METHODS", 2, 0, false);
		declareFunction("get_learned_nouns_typicality_sum_calculate_tag_methods", "GET-LEARNED-NOUNS-TYPICALITY-SUM-CALCULATE-TAG-METHODS", 1, 0, false);
		declareFunction("set_learned_nouns_typicality_sum_calculate_tag_methods", "SET-LEARNED-NOUNS-TYPICALITY-SUM-CALCULATE-TAG-METHODS", 2, 0, false);
		declareFunction("get_learned_nouns_default_calculate_tag_method", "GET-LEARNED-NOUNS-DEFAULT-CALCULATE-TAG-METHOD", 1, 0, false);
		declareFunction("set_learned_nouns_default_calculate_tag_method", "SET-LEARNED-NOUNS-DEFAULT-CALCULATE-TAG-METHOD", 2, 0, false);
		declareFunction("get_learned_nouns_default_magic_number", "GET-LEARNED-NOUNS-DEFAULT-MAGIC-NUMBER", 1, 0, false);
		declareFunction("set_learned_nouns_default_magic_number", "SET-LEARNED-NOUNS-DEFAULT-MAGIC-NUMBER", 2, 0, false);
		declareFunction("subloop_reserved_initialize_learned_nouns_class", "SUBLOOP-RESERVED-INITIALIZE-LEARNED-NOUNS-CLASS", 1, 0, false);
		declareFunction("subloop_reserved_initialize_learned_nouns_instance", "SUBLOOP-RESERVED-INITIALIZE-LEARNED-NOUNS-INSTANCE", 1, 0, false);
		declareFunction("learned_nouns_p", "LEARNED-NOUNS-P", 1, 0, false);
		declareFunction("new_learned_nouns", "NEW-LEARNED-NOUNS", 1, 2, false);
		declareFunction("learned_nouns_set_calculate_tag_method_to_default_method", "LEARNED-NOUNS-SET-CALCULATE-TAG-METHOD-TO-DEFAULT-METHOD", 1, 0, false);
		declareFunction("learned_nouns_typicality_sum_calculate_tag_method_p_method", "LEARNED-NOUNS-TYPICALITY-SUM-CALCULATE-TAG-METHOD-P-METHOD", 2, 0, false);
		declareFunction("learned_nouns_calculate_tag_method_p_method", "LEARNED-NOUNS-CALCULATE-TAG-METHOD-P-METHOD", 2, 0, false);
		declareFunction("learned_nouns_associated_typicality_metric_method", "LEARNED-NOUNS-ASSOCIATED-TYPICALITY-METRIC-METHOD", 2, 0, false);
		declareFunction("learned_nouns_associated_summand_weightingP_method", "LEARNED-NOUNS-ASSOCIATED-SUMMAND-WEIGHTING?-METHOD", 2, 0, false);
		declareFunction("create_constant_using_tool", "CREATE-CONSTANT-USING-TOOL", 3, 1, false);
		declareMacro("ke_assert_using_tool_now_or_push_error_onto", "KE-ASSERT-USING-TOOL-NOW-OR-PUSH-ERROR-ONTO");
		declareMacro("ke_assert_now_or_push_error_onto", "KE-ASSERT-NOW-OR-PUSH-ERROR-ONTO");
		declareFunction("ke_assert_using_tool_now", "KE-ASSERT-USING-TOOL-NOW", 3, 5, false);
		declareFunction("get_sophisticated_isas_based_on_genls", "GET-SOPHISTICATED-ISAS-BASED-ON-GENLS", 2, 0, false);
		declareFunction("learned_nouns_reify_noun_as_method", "LEARNED-NOUNS-REIFY-NOUN-AS-METHOD", 4, 4, false);
		declareFunction("learned_nouns_lexify_term_as_noun_method", "LEARNED-NOUNS-LEXIFY-TERM-AS-NOUN-METHOD", 3, 1, false);
		declareFunction("learned_nouns_reify_surname_method", "LEARNED-NOUNS-REIFY-SURNAME-METHOD", 2, 2, false);
		declareFunction("learned_nouns_skip_noun_method", "LEARNED-NOUNS-SKIP-NOUN-METHOD", 2, 0, false);
		declareFunction("learned_nouns_listify_method", "LEARNED-NOUNS-LISTIFY-METHOD", 1, 0, false);
		declareFunction("learned_nouns_print_tags_method", "LEARNED-NOUNS-PRINT-TAGS-METHOD", 1, 0, false);
		declareFunction("learned_nouns_print_unknown_simple_noun_tags_ordered_by_confidence_method", "LEARNED-NOUNS-PRINT-UNKNOWN-SIMPLE-NOUN-TAGS-ORDERED-BY-CONFIDENCE-METHOD", 1, 1, false);
		declareFunction("learned_nouns_print_unknown_simple_noun_top_n_tags_ordered_by_confidence_method", "LEARNED-NOUNS-PRINT-UNKNOWN-SIMPLE-NOUN-TOP-N-TAGS-ORDERED-BY-CONFIDENCE-METHOD", 1, 2, false);
		declareFunction("learned_nouns_annihilate_tags_method", "LEARNED-NOUNS-ANNIHILATE-TAGS-METHOD", 1, 0, false);
		declareFunction("learned_nouns_purge_irrelevant_nouns_method", "LEARNED-NOUNS-PURGE-IRRELEVANT-NOUNS-METHOD", 1, 0, false);
		declareFunction("learned_nouns_noun_count_method", "LEARNED-NOUNS-NOUN-COUNT-METHOD", 2, 1, false);
		declareFunction("learned_nouns_tag_for_noun_method", "LEARNED-NOUNS-TAG-FOR-NOUN-METHOD", 2, 0, false);
		declareFunction("learned_nouns_confidence_level_method", "LEARNED-NOUNS-CONFIDENCE-LEVEL-METHOD", 2, 0, false);
		declareFunction("learned_nouns_print_counts_method", "LEARNED-NOUNS-PRINT-COUNTS-METHOD", 2, 0, false);
		declareFunction("learned_nouns_why_not_tagged_as_method", "LEARNED-NOUNS-WHY-NOT-TAGGED-AS-METHOD", 3, 0, false);
		declareFunction("learned_nouns_find_noun_method", "LEARNED-NOUNS-FIND-NOUN-METHOD", 2, 0, false);
		declareFunction("learned_nouns_get_calculate_tag_method_method", "LEARNED-NOUNS-GET-CALCULATE-TAG-METHOD-METHOD", 1, 0, false);
		declareFunction("learned_nouns_get_typicality_metric_method", "LEARNED-NOUNS-GET-TYPICALITY-METRIC-METHOD", 1, 0, false);
		declareFunction("learned_nouns_weight_summands_by_selectivenessP_method", "LEARNED-NOUNS-WEIGHT-SUMMANDS-BY-SELECTIVENESS?-METHOD", 1, 0, false);
		declareFunction("learned_nouns_get_noun_relevance_count_threshold_method", "LEARNED-NOUNS-GET-NOUN-RELEVANCE-COUNT-THRESHOLD-METHOD", 1, 0, false);
		declareFunction("learned_nouns_get_size_method", "LEARNED-NOUNS-GET-SIZE-METHOD", 1, 0, false);
		declareFunction("learned_nouns_find_or_create_simple_noun_method", "LEARNED-NOUNS-FIND-OR-CREATE-SIMPLE-NOUN-METHOD", 2, 0, false);
		declareFunction("learned_nouns_find_or_create_complex_noun_method", "LEARNED-NOUNS-FIND-OR-CREATE-COMPLEX-NOUN-METHOD", 3, 0, false);
		declareFunction("learned_nouns_generate_ke_text_method", "LEARNED-NOUNS-GENERATE-KE-TEXT-METHOD", 3, 0, false);
		declareFunction("learned_nouns_ke_text_reification_method", "LEARNED-NOUNS-KE-TEXT-REIFICATION-METHOD", 5, 0, false);
		declareFunction("learned_nouns_ke_text_lexification_method", "LEARNED-NOUNS-KE-TEXT-LEXIFICATION-METHOD", 4, 0, false);
		declareFunction("learned_nouns_group_nouns_into_lists_for_java_tool_method", "LEARNED-NOUNS-GROUP-NOUNS-INTO-LISTS-FOR-JAVA-TOOL-METHOD", 1, 1, false);
		declareFunction("learned_nouns_group_javafied_nouns_into_lists_for_java_tool_method", "LEARNED-NOUNS-GROUP-JAVAFIED-NOUNS-INTO-LISTS-FOR-JAVA-TOOL-METHOD", 1, 2, false);
		declareFunction("learned_nouns_save_javafied_noun_lists_for_java_tool_method", "LEARNED-NOUNS-SAVE-JAVAFIED-NOUN-LISTS-FOR-JAVA-TOOL-METHOD", 2, 2, false);
		declareFunction("learned_nouns_save_noun_list_method", "LEARNED-NOUNS-SAVE-NOUN-LIST-METHOD", 4, 0, false);
		declareFunction("learned_nouns_load_javafied_noun_file_method", "LEARNED-NOUNS-LOAD-JAVAFIED-NOUN-FILE-METHOD", 2, 0, false);
		declareFunction("javafied_noun_p", "JAVAFIED-NOUN-P", 1, 0, false);
		declareFunction("get_javafied_noun_refined_tag", "GET-JAVAFIED-NOUN-REFINED-TAG", 1, 0, false);
		declareFunction("set_javafied_noun_refined_tag", "SET-JAVAFIED-NOUN-REFINED-TAG", 2, 0, false);
		declareFunction("get_javafied_noun_conjectures", "GET-JAVAFIED-NOUN-CONJECTURES", 1, 0, false);
		declareFunction("set_javafied_noun_conjectures", "SET-JAVAFIED-NOUN-CONJECTURES", 2, 0, false);
		declareFunction("weed_out_invalid_forts_from_conjectures", "WEED-OUT-INVALID-FORTS-FROM-CONJECTURES", 1, 0, false);
		declareFunction("learned_nouns_weed_out_invalid_forts_method", "LEARNED-NOUNS-WEED-OUT-INVALID-FORTS-METHOD", 2, 0, false);
		declareFunction("learned_nouns_dump_noun_strings_ordered_by_prevalence_method", "LEARNED-NOUNS-DUMP-NOUN-STRINGS-ORDERED-BY-PREVALENCE-METHOD", 2, 0, false);
		declareFunction("learned_nouns_dump_known_nouns_with_meanings_method", "LEARNED-NOUNS-DUMP-KNOWN-NOUNS-WITH-MEANINGS-METHOD", 2, 0, false);
		declareFunction("learned_nouns_dump_unknown_nouns_with_conjectures_method", "LEARNED-NOUNS-DUMP-UNKNOWN-NOUNS-WITH-CONJECTURES-METHOD", 2, 0, false);
		declareFunction("learned_nouns_listify_all_nouns_with_counts_for_mysentient_method", "LEARNED-NOUNS-LISTIFY-ALL-NOUNS-WITH-COUNTS-FOR-MYSENTIENT-METHOD", 1, 0, false);
		declareFunction("learned_nouns_listify_known_nouns_with_meanings_for_mysentient_method", "LEARNED-NOUNS-LISTIFY-KNOWN-NOUNS-WITH-MEANINGS-FOR-MYSENTIENT-METHOD", 4, 0, false);
		declareFunction("learned_nouns_listify_unknown_nouns_with_conjectures_for_mysentient_method", "LEARNED-NOUNS-LISTIFY-UNKNOWN-NOUNS-WITH-CONJECTURES-FOR-MYSENTIENT-METHOD", 4, 0, false);
		declareFunction("learned_nouns_listify_for_mysentient_method", "LEARNED-NOUNS-LISTIFY-FOR-MYSENTIENT-METHOD", 1, 0, false);
		declareFunction("learned_nouns_assert_corpus_mention_for_mysentient_method", "LEARNED-NOUNS-ASSERT-CORPUS-MENTION-FOR-MYSENTIENT-METHOD", 5, 0, false);
		declareFunction("learned_nouns_reify_unknown_noun_from_corpus_for_mysentient_method", "LEARNED-NOUNS-REIFY-UNKNOWN-NOUN-FROM-CORPUS-FOR-MYSENTIENT-METHOD", 5, 0, false);
		declareFunction("learned_nouns_compile_raw_data_from_text_files_method", "LEARNED-NOUNS-COMPILE-RAW-DATA-FROM-TEXT-FILES-METHOD", 4, 0, false);
		declareFunction("learned_nouns_compile_raw_data_from_text_files_directory_method", "LEARNED-NOUNS-COMPILE-RAW-DATA-FROM-TEXT-FILES-DIRECTORY-METHOD", 5, 0, false);
		declareFunction("learned_nouns_compile_raw_data_from_verbal_matches_lists_method", "LEARNED-NOUNS-COMPILE-RAW-DATA-FROM-VERBAL-MATCHES-LISTS-METHOD", 3, 1, false);
		declareFunction("learned_nouns_compile_raw_data_for_arg_from_text_file_method", "LEARNED-NOUNS-COMPILE-RAW-DATA-FOR-ARG-FROM-TEXT-FILE-METHOD", 3, 0, false);
		declareFunction("learned_nouns_compile_raw_data_for_arg_from_verbal_matches_list_method", "LEARNED-NOUNS-COMPILE-RAW-DATA-FOR-ARG-FROM-VERBAL-MATCHES-LIST-METHOD", 3, 0, false);
		declareFunction("learned_nouns_compile_raw_data_for_arg_int_method", "LEARNED-NOUNS-COMPILE-RAW-DATA-FOR-ARG-INT-METHOD", 4, 0, false);
		declareFunction("learned_nouns_increment_relevant_counts_for_arg_verb_relation_triple_method", "LEARNED-NOUNS-INCREMENT-RELEVANT-COUNTS-FOR-ARG-VERB-RELATION-TRIPLE-METHOD", 4, 0, false);
		declareFunction("learned_nouns_note_occurrence_of_head_noun_with_no_verb_method", "LEARNED-NOUNS-NOTE-OCCURRENCE-OF-HEAD-NOUN-WITH-NO-VERB-METHOD", 2, 0, false);
		declareFunction("learned_nouns_compile_complex_noun_data_from_text_file_method", "LEARNED-NOUNS-COMPILE-COMPLEX-NOUN-DATA-FROM-TEXT-FILE-METHOD", 2, 0, false);
		declareFunction("learned_nouns_compile_complex_noun_data_from_verbal_matches_lists_method", "LEARNED-NOUNS-COMPILE-COMPLEX-NOUN-DATA-FROM-VERBAL-MATCHES-LISTS-METHOD", 3, 0, false);
		declareFunction("learned_nouns_compile_complex_noun_data_int_method", "LEARNED-NOUNS-COMPILE-COMPLEX-NOUN-DATA-INT-METHOD", 4, 0, false);
		declareFunction("learned_nouns_accuracy_method", "LEARNED-NOUNS-ACCURACY-METHOD", 1, 3, false);
		declareFunction("learned_nouns_dump_calculated_tags_method", "LEARNED-NOUNS-DUMP-CALCULATED-TAGS-METHOD", 2, 1, false);
		declareFunction("learned_nouns_calculate_typicality_sum_by_collection_method", "LEARNED-NOUNS-CALCULATE-TYPICALITY-SUM-BY-COLLECTION-METHOD", 2, 0, false);
		declareFunction("typicality_sum_by_collection_based_on_noun_usages", "TYPICALITY-SUM-BY-COLLECTION-BASED-ON-NOUN-USAGES", 2, 3, false);
		declareFunction("possible_collections_for_noun_conjecture", "POSSIBLE-COLLECTIONS-FOR-NOUN-CONJECTURE", 2, 0, false);
		declareFunction("typicality_sum_based_on_noun_usages", "TYPICALITY-SUM-BASED-ON-NOUN-USAGES", 3, 2, false);
		declareFunction("learned_nouns_why_not_tagged_as_int_method", "LEARNED-NOUNS-WHY-NOT-TAGGED-AS-INT-METHOD", 3, 0, false);
		declareFunction("learned_nouns_cfasl_output_method", "LEARNED-NOUNS-CFASL-OUTPUT-METHOD", 2, 0, false);
		declareFunction("learned_nouns_cfasl_input_method", "LEARNED-NOUNS-CFASL-INPUT-METHOD", 2, 0, false);
		declareFunction("singularize_complex_noun", "SINGULARIZE-COMPLEX-NOUN", 2, 0, false);
		declareFunction("plural_form_ofP", "PLURAL-FORM-OF?", 2, 0, false);
		declareFunction("detach_pos_suffix", "DETACH-POS-SUFFIX", 1, 0, false);
		declareFunction("all_genls_of_any", "ALL-GENLS-OF-ANY", 1, 1, false);
		declareFunction("normalize_directory_name", "NORMALIZE-DIRECTORY-NAME", 1, 0, false);
		return NIL;
	}

	public static final SubLObject init_learned_nouns_file() {
		return NIL;
	}

	public static final SubLObject setup_learned_nouns_file() {
		classes.subloop_new_class(LEARNED_NOUNS, OBJECT, NIL, NIL, $list_alt36);
		classes.class_set_implements_slot_listeners(LEARNED_NOUNS, NIL);
		classes.subloop_note_class_initialization_function(LEARNED_NOUNS, SUBLOOP_RESERVED_INITIALIZE_LEARNED_NOUNS_CLASS);
		classes.subloop_note_instance_initialization_function(LEARNED_NOUNS, SUBLOOP_RESERVED_INITIALIZE_LEARNED_NOUNS_INSTANCE);
		subloop_reserved_initialize_learned_nouns_class(LEARNED_NOUNS);
		methods.methods_incorporate_instance_method(SET_CALCULATE_TAG_METHOD_TO_DEFAULT, LEARNED_NOUNS, $list_alt59, NIL, $list_alt60);
		methods.subloop_register_instance_method(LEARNED_NOUNS, SET_CALCULATE_TAG_METHOD_TO_DEFAULT, LEARNED_NOUNS_SET_CALCULATE_TAG_METHOD_TO_DEFAULT_METHOD);
		methods.methods_incorporate_class_method(TYPICALITY_SUM_CALCULATE_TAG_METHOD_P, LEARNED_NOUNS, $list_alt64, $list_alt65, $list_alt66);
		methods.subloop_register_class_method(LEARNED_NOUNS, TYPICALITY_SUM_CALCULATE_TAG_METHOD_P, LEARNED_NOUNS_TYPICALITY_SUM_CALCULATE_TAG_METHOD_P_METHOD);
		methods.methods_incorporate_class_method(CALCULATE_TAG_METHOD_P, LEARNED_NOUNS, $list_alt64, $list_alt65, $list_alt71);
		methods.subloop_register_class_method(LEARNED_NOUNS, CALCULATE_TAG_METHOD_P, LEARNED_NOUNS_CALCULATE_TAG_METHOD_P_METHOD);
		methods.methods_incorporate_class_method(ASSOCIATED_TYPICALITY_METRIC, LEARNED_NOUNS, $list_alt64, $list_alt75, $list_alt76);
		methods.subloop_register_class_method(LEARNED_NOUNS, ASSOCIATED_TYPICALITY_METRIC, LEARNED_NOUNS_ASSOCIATED_TYPICALITY_METRIC_METHOD);
		methods.methods_incorporate_class_method($sym79$ASSOCIATED_SUMMAND_WEIGHTING_, LEARNED_NOUNS, $list_alt64, $list_alt75, $list_alt80);
		methods.subloop_register_class_method(LEARNED_NOUNS, $sym79$ASSOCIATED_SUMMAND_WEIGHTING_, $sym82$LEARNED_NOUNS_ASSOCIATED_SUMMAND_WEIGHTING__METHOD);
		methods.methods_incorporate_class_method(REIFY_NOUN_AS, LEARNED_NOUNS, $list_alt64, $list_alt115, $list_alt116);
		methods.subloop_register_class_method(LEARNED_NOUNS, REIFY_NOUN_AS, LEARNED_NOUNS_REIFY_NOUN_AS_METHOD);
		methods.methods_incorporate_class_method(LEXIFY_TERM_AS_NOUN, LEARNED_NOUNS, $list_alt64, $list_alt130, $list_alt131);
		methods.subloop_register_class_method(LEARNED_NOUNS, LEXIFY_TERM_AS_NOUN, LEARNED_NOUNS_LEXIFY_TERM_AS_NOUN_METHOD);
		methods.methods_incorporate_class_method(REIFY_SURNAME, LEARNED_NOUNS, $list_alt64, $list_alt134, $list_alt135);
		methods.subloop_register_class_method(LEARNED_NOUNS, REIFY_SURNAME, LEARNED_NOUNS_REIFY_SURNAME_METHOD);
		methods.methods_incorporate_class_method(SKIP_NOUN, LEARNED_NOUNS, $list_alt64, $list_alt145, $list_alt146);
		methods.subloop_register_class_method(LEARNED_NOUNS, SKIP_NOUN, LEARNED_NOUNS_SKIP_NOUN_METHOD);
		methods.methods_incorporate_instance_method(LISTIFY, LEARNED_NOUNS, $list_alt155, NIL, $list_alt156);
		methods.subloop_register_instance_method(LEARNED_NOUNS, LISTIFY, LEARNED_NOUNS_LISTIFY_METHOD);
		methods.methods_incorporate_instance_method(PRINT_TAGS, LEARNED_NOUNS, $list_alt155, NIL, $list_alt171);
		methods.subloop_register_instance_method(LEARNED_NOUNS, PRINT_TAGS, LEARNED_NOUNS_PRINT_TAGS_METHOD);
		methods.methods_incorporate_instance_method(PRINT_UNKNOWN_SIMPLE_NOUN_TAGS_ORDERED_BY_CONFIDENCE, LEARNED_NOUNS, $list_alt155, $list_alt178, $list_alt179);
		methods.subloop_register_instance_method(LEARNED_NOUNS, PRINT_UNKNOWN_SIMPLE_NOUN_TAGS_ORDERED_BY_CONFIDENCE, $sym185$LEARNED_NOUNS_PRINT_UNKNOWN_SIMPLE_NOUN_TAGS_ORDERED_BY_CONFIDENC);
		methods.methods_incorporate_instance_method(PRINT_UNKNOWN_SIMPLE_NOUN_TOP_N_TAGS_ORDERED_BY_CONFIDENCE, LEARNED_NOUNS, $list_alt155, $list_alt187, $list_alt188);
		methods.subloop_register_instance_method(LEARNED_NOUNS, PRINT_UNKNOWN_SIMPLE_NOUN_TOP_N_TAGS_ORDERED_BY_CONFIDENCE, $sym191$LEARNED_NOUNS_PRINT_UNKNOWN_SIMPLE_NOUN_TOP_N_TAGS_ORDERED_BY_CON);
		methods.methods_incorporate_instance_method(ANNIHILATE_TAGS, LEARNED_NOUNS, $list_alt155, NIL, $list_alt193);
		methods.subloop_register_instance_method(LEARNED_NOUNS, ANNIHILATE_TAGS, LEARNED_NOUNS_ANNIHILATE_TAGS_METHOD);
		methods.methods_incorporate_instance_method(PURGE_IRRELEVANT_NOUNS, LEARNED_NOUNS, $list_alt64, NIL, $list_alt197);
		methods.subloop_register_instance_method(LEARNED_NOUNS, PURGE_IRRELEVANT_NOUNS, LEARNED_NOUNS_PURGE_IRRELEVANT_NOUNS_METHOD);
		methods.methods_incorporate_instance_method(NOUN_COUNT, LEARNED_NOUNS, $list_alt155, $list_alt202, $list_alt203);
		methods.subloop_register_instance_method(LEARNED_NOUNS, NOUN_COUNT, LEARNED_NOUNS_NOUN_COUNT_METHOD);
		methods.methods_incorporate_instance_method(TAG_FOR_NOUN, LEARNED_NOUNS, $list_alt209, $list_alt145, $list_alt210);
		methods.subloop_register_instance_method(LEARNED_NOUNS, TAG_FOR_NOUN, LEARNED_NOUNS_TAG_FOR_NOUN_METHOD);
		methods.methods_incorporate_instance_method(CONFIDENCE_LEVEL, LEARNED_NOUNS, $list_alt209, $list_alt145, $list_alt213);
		methods.subloop_register_instance_method(LEARNED_NOUNS, CONFIDENCE_LEVEL, LEARNED_NOUNS_CONFIDENCE_LEVEL_METHOD);
		methods.methods_incorporate_instance_method(PRINT_COUNTS, LEARNED_NOUNS, $list_alt209, $list_alt216, $list_alt217);
		methods.subloop_register_instance_method(LEARNED_NOUNS, PRINT_COUNTS, LEARNED_NOUNS_PRINT_COUNTS_METHOD);
		methods.methods_incorporate_instance_method(WHY_NOT_TAGGED_AS, LEARNED_NOUNS, $list_alt209, $list_alt221, $list_alt222);
		methods.subloop_register_instance_method(LEARNED_NOUNS, WHY_NOT_TAGGED_AS, LEARNED_NOUNS_WHY_NOT_TAGGED_AS_METHOD);
		methods.methods_incorporate_instance_method(FIND_NOUN, LEARNED_NOUNS, $list_alt155, $list_alt145, $list_alt225);
		methods.subloop_register_instance_method(LEARNED_NOUNS, FIND_NOUN, LEARNED_NOUNS_FIND_NOUN_METHOD);
		methods.methods_incorporate_instance_method(GET_CALCULATE_TAG_METHOD, LEARNED_NOUNS, $list_alt155, NIL, $list_alt228);
		methods.subloop_register_instance_method(LEARNED_NOUNS, GET_CALCULATE_TAG_METHOD, LEARNED_NOUNS_GET_CALCULATE_TAG_METHOD_METHOD);
		methods.methods_incorporate_instance_method(GET_TYPICALITY_METRIC, LEARNED_NOUNS, $list_alt209, NIL, $list_alt231);
		methods.subloop_register_instance_method(LEARNED_NOUNS, GET_TYPICALITY_METRIC, LEARNED_NOUNS_GET_TYPICALITY_METRIC_METHOD);
		methods.methods_incorporate_instance_method($sym233$WEIGHT_SUMMANDS_BY_SELECTIVENESS_, LEARNED_NOUNS, $list_alt209, NIL, $list_alt234);
		methods.subloop_register_instance_method(LEARNED_NOUNS, $sym233$WEIGHT_SUMMANDS_BY_SELECTIVENESS_, $sym235$LEARNED_NOUNS_WEIGHT_SUMMANDS_BY_SELECTIVENESS__METHOD);
		methods.methods_incorporate_instance_method(GET_NOUN_RELEVANCE_COUNT_THRESHOLD, LEARNED_NOUNS, $list_alt155, NIL, $list_alt237);
		methods.subloop_register_instance_method(LEARNED_NOUNS, GET_NOUN_RELEVANCE_COUNT_THRESHOLD, LEARNED_NOUNS_GET_NOUN_RELEVANCE_COUNT_THRESHOLD_METHOD);
		methods.methods_incorporate_instance_method(GET_SIZE, LEARNED_NOUNS, $list_alt155, NIL, $list_alt240);
		methods.subloop_register_instance_method(LEARNED_NOUNS, GET_SIZE, LEARNED_NOUNS_GET_SIZE_METHOD);
		methods.methods_incorporate_instance_method(FIND_OR_CREATE_SIMPLE_NOUN, LEARNED_NOUNS, $list_alt243, $list_alt145, $list_alt244);
		methods.subloop_register_instance_method(LEARNED_NOUNS, FIND_OR_CREATE_SIMPLE_NOUN, LEARNED_NOUNS_FIND_OR_CREATE_SIMPLE_NOUN_METHOD);
		methods.methods_incorporate_instance_method(FIND_OR_CREATE_COMPLEX_NOUN, LEARNED_NOUNS, $list_alt243, $list_alt247, $list_alt248);
		methods.subloop_register_instance_method(LEARNED_NOUNS, FIND_OR_CREATE_COMPLEX_NOUN, LEARNED_NOUNS_FIND_OR_CREATE_COMPLEX_NOUN_METHOD);
		methods.methods_incorporate_instance_method(GENERATE_KE_TEXT, LEARNED_NOUNS, $list_alt155, $list_alt252, $list_alt253);
		methods.subloop_register_instance_method(LEARNED_NOUNS, GENERATE_KE_TEXT, LEARNED_NOUNS_GENERATE_KE_TEXT_METHOD);
		methods.methods_incorporate_class_method(KE_TEXT_REIFICATION, LEARNED_NOUNS, $list_alt261, $list_alt262, $list_alt263);
		methods.subloop_register_class_method(LEARNED_NOUNS, KE_TEXT_REIFICATION, LEARNED_NOUNS_KE_TEXT_REIFICATION_METHOD);
		methods.methods_incorporate_class_method(KE_TEXT_LEXIFICATION, LEARNED_NOUNS, $list_alt261, $list_alt269, $list_alt270);
		methods.subloop_register_class_method(LEARNED_NOUNS, KE_TEXT_LEXIFICATION, LEARNED_NOUNS_KE_TEXT_LEXIFICATION_METHOD);
		methods.methods_incorporate_instance_method(GROUP_NOUNS_INTO_LISTS_FOR_JAVA_TOOL, LEARNED_NOUNS, $list_alt243, $list_alt274, $list_alt275);
		methods.subloop_register_instance_method(LEARNED_NOUNS, GROUP_NOUNS_INTO_LISTS_FOR_JAVA_TOOL, LEARNED_NOUNS_GROUP_NOUNS_INTO_LISTS_FOR_JAVA_TOOL_METHOD);
		methods.methods_incorporate_instance_method(GROUP_JAVAFIED_NOUNS_INTO_LISTS_FOR_JAVA_TOOL, LEARNED_NOUNS, $list_alt243, $list_alt281, $list_alt282);
		methods.subloop_register_instance_method(LEARNED_NOUNS, GROUP_JAVAFIED_NOUNS_INTO_LISTS_FOR_JAVA_TOOL, $sym285$LEARNED_NOUNS_GROUP_JAVAFIED_NOUNS_INTO_LISTS_FOR_JAVA_TOOL_METHO);
		methods.methods_incorporate_instance_method(SAVE_JAVAFIED_NOUN_LISTS_FOR_JAVA_TOOL, LEARNED_NOUNS, $list_alt155, $list_alt287, $list_alt288);
		methods.subloop_register_instance_method(LEARNED_NOUNS, SAVE_JAVAFIED_NOUN_LISTS_FOR_JAVA_TOOL, LEARNED_NOUNS_SAVE_JAVAFIED_NOUN_LISTS_FOR_JAVA_TOOL_METHOD);
		methods.methods_incorporate_class_method(SAVE_NOUN_LIST, LEARNED_NOUNS, $list_alt59, $list_alt297, $list_alt298);
		methods.subloop_register_class_method(LEARNED_NOUNS, SAVE_NOUN_LIST, LEARNED_NOUNS_SAVE_NOUN_LIST_METHOD);
		methods.methods_incorporate_class_method(LOAD_JAVAFIED_NOUN_FILE, LEARNED_NOUNS, $list_alt64, $list_alt304, $list_alt305);
		methods.subloop_register_class_method(LEARNED_NOUNS, LOAD_JAVAFIED_NOUN_FILE, LEARNED_NOUNS_LOAD_JAVAFIED_NOUN_FILE_METHOD);
		methods.methods_incorporate_class_method(WEED_OUT_INVALID_FORTS, LEARNED_NOUNS, $list_alt59, $list_alt310, $list_alt311);
		methods.subloop_register_class_method(LEARNED_NOUNS, WEED_OUT_INVALID_FORTS, LEARNED_NOUNS_WEED_OUT_INVALID_FORTS_METHOD);
		methods.methods_incorporate_instance_method(DUMP_NOUN_STRINGS_ORDERED_BY_PREVALENCE, LEARNED_NOUNS, $list_alt155, $list_alt304, $list_alt315);
		methods.subloop_register_instance_method(LEARNED_NOUNS, DUMP_NOUN_STRINGS_ORDERED_BY_PREVALENCE, LEARNED_NOUNS_DUMP_NOUN_STRINGS_ORDERED_BY_PREVALENCE_METHOD);
		methods.methods_incorporate_instance_method(DUMP_KNOWN_NOUNS_WITH_MEANINGS, LEARNED_NOUNS, $list_alt155, $list_alt304, $list_alt320);
		methods.subloop_register_instance_method(LEARNED_NOUNS, DUMP_KNOWN_NOUNS_WITH_MEANINGS, LEARNED_NOUNS_DUMP_KNOWN_NOUNS_WITH_MEANINGS_METHOD);
		methods.methods_incorporate_instance_method(DUMP_UNKNOWN_NOUNS_WITH_CONJECTURES, LEARNED_NOUNS, $list_alt155, $list_alt304, $list_alt325);
		methods.subloop_register_instance_method(LEARNED_NOUNS, DUMP_UNKNOWN_NOUNS_WITH_CONJECTURES, LEARNED_NOUNS_DUMP_UNKNOWN_NOUNS_WITH_CONJECTURES_METHOD);
		methods.methods_incorporate_instance_method(LISTIFY_ALL_NOUNS_WITH_COUNTS_FOR_MYSENTIENT, LEARNED_NOUNS, $list_alt155, NIL, $list_alt335);
		methods.subloop_register_instance_method(LEARNED_NOUNS, LISTIFY_ALL_NOUNS_WITH_COUNTS_FOR_MYSENTIENT, LEARNED_NOUNS_LISTIFY_ALL_NOUNS_WITH_COUNTS_FOR_MYSENTIENT_METHOD);
		methods.methods_incorporate_instance_method(LISTIFY_KNOWN_NOUNS_WITH_MEANINGS_FOR_MYSENTIENT, LEARNED_NOUNS, $list_alt155, $list_alt339, $list_alt340);
		methods.subloop_register_instance_method(LEARNED_NOUNS, LISTIFY_KNOWN_NOUNS_WITH_MEANINGS_FOR_MYSENTIENT, $sym344$LEARNED_NOUNS_LISTIFY_KNOWN_NOUNS_WITH_MEANINGS_FOR_MYSENTIENT_ME);
		methods.methods_incorporate_instance_method(LISTIFY_UNKNOWN_NOUNS_WITH_CONJECTURES_FOR_MYSENTIENT, LEARNED_NOUNS, $list_alt155, $list_alt339, $list_alt346);
		methods.subloop_register_instance_method(LEARNED_NOUNS, LISTIFY_UNKNOWN_NOUNS_WITH_CONJECTURES_FOR_MYSENTIENT, $sym348$LEARNED_NOUNS_LISTIFY_UNKNOWN_NOUNS_WITH_CONJECTURES_FOR_MYSENTIE);
		methods.methods_incorporate_instance_method(LISTIFY_FOR_MYSENTIENT, LEARNED_NOUNS, $list_alt155, NIL, $list_alt350);
		methods.subloop_register_instance_method(LEARNED_NOUNS, LISTIFY_FOR_MYSENTIENT, LEARNED_NOUNS_LISTIFY_FOR_MYSENTIENT_METHOD);
		methods.methods_incorporate_class_method(ASSERT_CORPUS_MENTION_FOR_MYSENTIENT, LEARNED_NOUNS, $list_alt59, $list_alt352, $list_alt353);
		methods.subloop_register_class_method(LEARNED_NOUNS, ASSERT_CORPUS_MENTION_FOR_MYSENTIENT, LEARNED_NOUNS_ASSERT_CORPUS_MENTION_FOR_MYSENTIENT_METHOD);
		methods.methods_incorporate_class_method(REIFY_UNKNOWN_NOUN_FROM_CORPUS_FOR_MYSENTIENT, LEARNED_NOUNS, $list_alt59, $list_alt365, $list_alt366);
		methods.subloop_register_class_method(LEARNED_NOUNS, REIFY_UNKNOWN_NOUN_FROM_CORPUS_FOR_MYSENTIENT, $sym369$LEARNED_NOUNS_REIFY_UNKNOWN_NOUN_FROM_CORPUS_FOR_MYSENTIENT_METHO);
		methods.methods_incorporate_instance_method(COMPILE_RAW_DATA_FROM_TEXT_FILES, LEARNED_NOUNS, $list_alt243, $list_alt371, $list_alt372);
		methods.subloop_register_instance_method(LEARNED_NOUNS, COMPILE_RAW_DATA_FROM_TEXT_FILES, LEARNED_NOUNS_COMPILE_RAW_DATA_FROM_TEXT_FILES_METHOD);
		methods.methods_incorporate_instance_method(COMPILE_RAW_DATA_FROM_TEXT_FILES_DIRECTORY, LEARNED_NOUNS, $list_alt243, $list_alt379, $list_alt380);
		methods.subloop_register_instance_method(LEARNED_NOUNS, COMPILE_RAW_DATA_FROM_TEXT_FILES_DIRECTORY, LEARNED_NOUNS_COMPILE_RAW_DATA_FROM_TEXT_FILES_DIRECTORY_METHOD);
		methods.methods_incorporate_instance_method(COMPILE_RAW_DATA_FROM_VERBAL_MATCHES_LISTS, LEARNED_NOUNS, $list_alt243, $list_alt386, $list_alt387);
		methods.subloop_register_instance_method(LEARNED_NOUNS, COMPILE_RAW_DATA_FROM_VERBAL_MATCHES_LISTS, LEARNED_NOUNS_COMPILE_RAW_DATA_FROM_VERBAL_MATCHES_LISTS_METHOD);
		methods.methods_incorporate_instance_method(COMPILE_RAW_DATA_FOR_ARG_FROM_TEXT_FILE, LEARNED_NOUNS, $list_alt261, $list_alt391, $list_alt392);
		methods.subloop_register_instance_method(LEARNED_NOUNS, COMPILE_RAW_DATA_FOR_ARG_FROM_TEXT_FILE, LEARNED_NOUNS_COMPILE_RAW_DATA_FOR_ARG_FROM_TEXT_FILE_METHOD);
		methods.methods_incorporate_instance_method(COMPILE_RAW_DATA_FOR_ARG_FROM_VERBAL_MATCHES_LIST, LEARNED_NOUNS, $list_alt261, $list_alt401, $list_alt402);
		methods.subloop_register_instance_method(LEARNED_NOUNS, COMPILE_RAW_DATA_FOR_ARG_FROM_VERBAL_MATCHES_LIST, $sym407$LEARNED_NOUNS_COMPILE_RAW_DATA_FOR_ARG_FROM_VERBAL_MATCHES_LIST_M);
		methods.methods_incorporate_instance_method(COMPILE_RAW_DATA_FOR_ARG_INT, LEARNED_NOUNS, $list_alt261, $list_alt408, $list_alt409);
		methods.subloop_register_instance_method(LEARNED_NOUNS, COMPILE_RAW_DATA_FOR_ARG_INT, LEARNED_NOUNS_COMPILE_RAW_DATA_FOR_ARG_INT_METHOD);
		methods.methods_incorporate_instance_method(INCREMENT_RELEVANT_COUNTS_FOR_ARG_VERB_RELATION_TRIPLE, LEARNED_NOUNS, $list_alt59, $list_alt423, $list_alt424);
		methods.subloop_register_instance_method(LEARNED_NOUNS, INCREMENT_RELEVANT_COUNTS_FOR_ARG_VERB_RELATION_TRIPLE, $sym426$LEARNED_NOUNS_INCREMENT_RELEVANT_COUNTS_FOR_ARG_VERB_RELATION_TRI);
		methods.methods_incorporate_instance_method(NOTE_OCCURRENCE_OF_HEAD_NOUN_WITH_NO_VERB, LEARNED_NOUNS, $list_alt59, $list_alt428, $list_alt429);
		methods.subloop_register_instance_method(LEARNED_NOUNS, NOTE_OCCURRENCE_OF_HEAD_NOUN_WITH_NO_VERB, LEARNED_NOUNS_NOTE_OCCURRENCE_OF_HEAD_NOUN_WITH_NO_VERB_METHOD);
		methods.methods_incorporate_instance_method(COMPILE_COMPLEX_NOUN_DATA_FROM_TEXT_FILE, LEARNED_NOUNS, $list_alt59, $list_alt432, $list_alt433);
		methods.subloop_register_instance_method(LEARNED_NOUNS, COMPILE_COMPLEX_NOUN_DATA_FROM_TEXT_FILE, LEARNED_NOUNS_COMPILE_COMPLEX_NOUN_DATA_FROM_TEXT_FILE_METHOD);
		methods.methods_incorporate_instance_method(COMPILE_COMPLEX_NOUN_DATA_FROM_VERBAL_MATCHES_LISTS, LEARNED_NOUNS, $list_alt59, $list_alt438, $list_alt439);
		methods.subloop_register_instance_method(LEARNED_NOUNS, COMPILE_COMPLEX_NOUN_DATA_FROM_VERBAL_MATCHES_LISTS, $sym441$LEARNED_NOUNS_COMPILE_COMPLEX_NOUN_DATA_FROM_VERBAL_MATCHES_LISTS);
		methods.methods_incorporate_instance_method(COMPILE_COMPLEX_NOUN_DATA_INT, LEARNED_NOUNS, $list_alt59, $list_alt442, $list_alt443);
		methods.subloop_register_instance_method(LEARNED_NOUNS, COMPILE_COMPLEX_NOUN_DATA_INT, LEARNED_NOUNS_COMPILE_COMPLEX_NOUN_DATA_INT_METHOD);
		methods.methods_incorporate_instance_method(ACCURACY, LEARNED_NOUNS, $list_alt155, $list_alt455, $list_alt456);
		methods.subloop_register_instance_method(LEARNED_NOUNS, ACCURACY, LEARNED_NOUNS_ACCURACY_METHOD);
		methods.methods_incorporate_instance_method(DUMP_CALCULATED_TAGS, LEARNED_NOUNS, $list_alt155, $list_alt468, $list_alt469);
		methods.subloop_register_instance_method(LEARNED_NOUNS, DUMP_CALCULATED_TAGS, LEARNED_NOUNS_DUMP_CALCULATED_TAGS_METHOD);
		methods.methods_incorporate_instance_method(CALCULATE_TYPICALITY_SUM_BY_COLLECTION, LEARNED_NOUNS, $list_alt243, $list_alt474, $list_alt475);
		methods.subloop_register_instance_method(LEARNED_NOUNS, CALCULATE_TYPICALITY_SUM_BY_COLLECTION, LEARNED_NOUNS_CALCULATE_TYPICALITY_SUM_BY_COLLECTION_METHOD);
		methods.methods_incorporate_instance_method(WHY_NOT_TAGGED_AS_INT, LEARNED_NOUNS, $list_alt243, $list_alt480, $list_alt481);
		methods.subloop_register_instance_method(LEARNED_NOUNS, WHY_NOT_TAGGED_AS_INT, LEARNED_NOUNS_WHY_NOT_TAGGED_AS_INT_METHOD);
		methods.methods_incorporate_instance_method(CFASL_OUTPUT, LEARNED_NOUNS, $list_alt261, $list_alt500, $list_alt501);
		methods.subloop_register_instance_method(LEARNED_NOUNS, CFASL_OUTPUT, LEARNED_NOUNS_CFASL_OUTPUT_METHOD);
		methods.methods_incorporate_class_method(CFASL_INPUT, LEARNED_NOUNS, $list_alt59, $list_alt500, $list_alt504);
		methods.subloop_register_class_method(LEARNED_NOUNS, CFASL_INPUT, LEARNED_NOUNS_CFASL_INPUT_METHOD);
		return NIL;
	}

	// // Internal Constants
	static private final SubLList $list_alt0 = list(list(makeSymbol("NOUN-VAR"), makeSymbol("&KEY"), list(makeSymbol("LEARNED"), list(QUOTE, makeSymbol("SELF")))), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt1 = list(makeKeyword("LEARNED"));

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	private static final SubLSymbol $LEARNED = makeKeyword("LEARNED");

	static private final SubLSymbol $sym5$STRING_VAR = makeUninternedSymbol("STRING-VAR");

	private static final SubLSymbol GET_LEARNED_NOUNS_DICTIONARY_OF_NOUNS = makeSymbol("GET-LEARNED-NOUNS-DICTIONARY-OF-NOUNS");

	static private final SubLList $list_alt9 = list(list(makeSymbol("NOUN-VAR"), makeSymbol("&KEY"), list(makeSymbol("LEARNED"), list(QUOTE, makeSymbol("SELF"))), list(makeSymbol("COUNT-THRESHOLD"), ZERO_INTEGER), makeSymbol("CONFIDENCE-THRESHOLD"), list(makeSymbol("STATUSES"), makeKeyword("ALL"))), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLList $list_alt10 = list(makeKeyword("LEARNED"), makeKeyword("COUNT-THRESHOLD"), makeKeyword("CONFIDENCE-THRESHOLD"), makeKeyword("STATUSES"));

	private static final SubLSymbol $COUNT_THRESHOLD = makeKeyword("COUNT-THRESHOLD");

	private static final SubLSymbol $CONFIDENCE_THRESHOLD = makeKeyword("CONFIDENCE-THRESHOLD");

	private static final SubLSymbol $STATUSES = makeKeyword("STATUSES");

	static private final SubLSymbol $sym15$COUNT_THRESHOLD_VAR = makeUninternedSymbol("COUNT-THRESHOLD-VAR");

	static private final SubLSymbol $sym16$CONFIDENCE_THRESHOLD_VAR = makeUninternedSymbol("CONFIDENCE-THRESHOLD-VAR");

	static private final SubLSymbol $sym17$STATUSES_VAR = makeUninternedSymbol("STATUSES-VAR");

	static private final SubLSymbol $sym18$STRING_VAR = makeUninternedSymbol("STRING-VAR");

	private static final SubLSymbol SIMPLE_NOUN_P = makeSymbol("SIMPLE-NOUN-P");

	static private final SubLSymbol $sym23$__ = makeSymbol(">=");

	static private final SubLList $list_alt25 = list(list(QUOTE, makeSymbol("GET-TOTAL-COUNT")));

	static private final SubLSymbol $sym28$_ = makeSymbol(">");

	static private final SubLList $list_alt29 = list(list(QUOTE, makeSymbol("GET-CONFIDENCE-LEVEL")));

	static private final SubLList $list_alt30 = list(makeKeyword("ALL"));

	static private final SubLSymbol $sym31$MEMBER_ = makeSymbol("MEMBER?");

	static private final SubLList $list_alt32 = list(list(QUOTE, makeSymbol("GET-STATUS-IN-CYC")));

	static private final SubLList $list_alt33 = list(list(QUOTE, EQ));

	private static final SubLSymbol LEARNED_NOUNS = makeSymbol("LEARNED-NOUNS");

	public static final SubLObject $list_alt36 = _constant_36_initializer();

	private static final SubLSymbol CALCULATE_TAG_METHOD = makeSymbol("CALCULATE-TAG-METHOD");

	private static final SubLSymbol CALCULATE_TAG_METHODS = makeSymbol("CALCULATE-TAG-METHODS");

	private static final SubLSymbol TYPICALITY_SUM_CALCULATE_TAG_METHODS = makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHODS");

	private static final SubLSymbol DEFAULT_MAGIC_NUMBER = makeSymbol("DEFAULT-MAGIC-NUMBER");

	public static final SubLFloat $float$0_51 = makeDouble(0.51);

	private static final SubLSymbol DEFAULT_CALCULATE_TAG_METHOD = makeSymbol("DEFAULT-CALCULATE-TAG-METHOD");

	private static final SubLSymbol $APMI_SUM_WEIGHTED_BY_SELECTIVENESS = makeKeyword("APMI-SUM-WEIGHTED-BY-SELECTIVENESS");

	private static final SubLSymbol $SA_SUM = makeKeyword("SA-SUM");

	private static final SubLSymbol SELECTIONAL_ASSOCIATION = makeSymbol("SELECTIONAL-ASSOCIATION");

	static private final SubLList $list_alt49 = list(NIL);

	private static final SubLSymbol $APMI_SUM = makeKeyword("APMI-SUM");

	private static final SubLSymbol ADJUSTED_POINTWISE_MUTUAL_INFORMATION = makeSymbol("ADJUSTED-POINTWISE-MUTUAL-INFORMATION");

	static private final SubLList $list_alt52 = list(T);

	static private final SubLList $list_alt53 = list(makeKeyword("BASIC"), makeKeyword("SPS"));

	private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEARNED_NOUNS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEARNED-NOUNS-CLASS");

	private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEARNED_NOUNS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEARNED-NOUNS-INSTANCE");

	private static final SubLSymbol SET_CALCULATE_TAG_METHOD_TO_DEFAULT = makeSymbol("SET-CALCULATE-TAG-METHOD-TO-DEFAULT");

	static private final SubLList $list_alt59 = list(makeKeyword("PROTECTED"));

	static private final SubLList $list_alt60 = list(list(makeSymbol("CSETQ"), makeSymbol("CALCULATE-TAG-METHOD"), makeSymbol("DEFAULT-CALCULATE-TAG-METHOD")));

	static private final SubLSymbol $sym61$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEARNED-NOUNS-METHOD");

	private static final SubLSymbol LEARNED_NOUNS_SET_CALCULATE_TAG_METHOD_TO_DEFAULT_METHOD = makeSymbol("LEARNED-NOUNS-SET-CALCULATE-TAG-METHOD-TO-DEFAULT-METHOD");

	private static final SubLSymbol TYPICALITY_SUM_CALCULATE_TAG_METHOD_P = makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHOD-P");

	static private final SubLList $list_alt64 = list(makeKeyword("PUBLIC"));

	static private final SubLList $list_alt65 = list(makeSymbol("OBJECT"));

	static private final SubLList $list_alt66 = list(list(RET, list(makeSymbol("MEMBER"), makeSymbol("OBJECT"), makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHODS"), list(makeSymbol("FUNCTION"), EQ), list(makeSymbol("FUNCTION"), makeSymbol("CAR")))));

	static private final SubLSymbol $sym67$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEARNED-NOUNS-METHOD");

	private static final SubLSymbol LEARNED_NOUNS_TYPICALITY_SUM_CALCULATE_TAG_METHOD_P_METHOD = makeSymbol("LEARNED-NOUNS-TYPICALITY-SUM-CALCULATE-TAG-METHOD-P-METHOD");

	private static final SubLSymbol CALCULATE_TAG_METHOD_P = makeSymbol("CALCULATE-TAG-METHOD-P");

	static private final SubLList $list_alt71 = list(list(RET, list(makeSymbol("MEMBER"), makeSymbol("OBJECT"), makeSymbol("CALCULATE-TAG-METHODS"), list(makeSymbol("FUNCTION"), EQ))));

	static private final SubLSymbol $sym72$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEARNED-NOUNS-METHOD");

	private static final SubLSymbol LEARNED_NOUNS_CALCULATE_TAG_METHOD_P_METHOD = makeSymbol("LEARNED-NOUNS-CALCULATE-TAG-METHOD-P-METHOD");

	private static final SubLSymbol ASSOCIATED_TYPICALITY_METRIC = makeSymbol("ASSOCIATED-TYPICALITY-METRIC");

	static private final SubLList $list_alt75 = list(makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHOD"));

	static private final SubLList $list_alt76 = list(list(RET, list(makeSymbol("FIRST"), list(makeSymbol("ALIST-LOOKUP"), makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHODS"), makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHOD"), list(makeSymbol("FUNCTION"), EQ)))));

	static private final SubLSymbol $sym77$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEARNED-NOUNS-METHOD");

	private static final SubLSymbol LEARNED_NOUNS_ASSOCIATED_TYPICALITY_METRIC_METHOD = makeSymbol("LEARNED-NOUNS-ASSOCIATED-TYPICALITY-METRIC-METHOD");

	static private final SubLSymbol $sym79$ASSOCIATED_SUMMAND_WEIGHTING_ = makeSymbol("ASSOCIATED-SUMMAND-WEIGHTING?");

	static private final SubLList $list_alt80 = list(list(RET, list(makeSymbol("SECOND"), list(makeSymbol("ALIST-LOOKUP"), makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHODS"), makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHOD"), list(makeSymbol("FUNCTION"), EQ)))));

	static private final SubLSymbol $sym81$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEARNED-NOUNS-METHOD");

	static private final SubLSymbol $sym82$LEARNED_NOUNS_ASSOCIATED_SUMMAND_WEIGHTING__METHOD = makeSymbol("LEARNED-NOUNS-ASSOCIATED-SUMMAND-WEIGHTING?-METHOD");

	static private final SubLString $str_alt83$ = makeString("");

	public static final SubLObject $$reifiedUsingTool = constant_handles.reader_make_constant_shell(makeString("reifiedUsingTool"));

	static private final SubLList $list_alt86 = list(
			new SubLObject[] { makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("TOOL"), makeSymbol("ERROR-DATA"), makeSymbol("&KEY"), list(makeSymbol("META-MT"), makeSymbol("MT")), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"), list(makeSymbol("META-STRENGTH"), makeSymbol("STRENGTH")), list(makeSymbol("META-DIRECTION"), makeSymbol("DIRECTION")) });

	static private final SubLList $list_alt87 = list(makeKeyword("META-MT"), makeKeyword("STRENGTH"), makeKeyword("DIRECTION"), makeKeyword("META-STRENGTH"), makeKeyword("META-DIRECTION"));

	private static final SubLSymbol $META_MT = makeKeyword("META-MT");

	private static final SubLSymbol $META_STRENGTH = makeKeyword("META-STRENGTH");

	private static final SubLSymbol $META_DIRECTION = makeKeyword("META-DIRECTION");

	static private final SubLSymbol $sym94$SUCCESS_VAR = makeUninternedSymbol("SUCCESS-VAR");

	static private final SubLSymbol $sym95$ERROR_DATUM_VAR = makeUninternedSymbol("ERROR-DATUM-VAR");

	private static final SubLSymbol KE_ASSERT_USING_TOOL_NOW = makeSymbol("KE-ASSERT-USING-TOOL-NOW");

	static private final SubLList $list_alt99 = list(makeKeyword("SUCCESS"));

	static private final SubLList $list_alt101 = list(makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("ERROR-DATA"), makeSymbol("&KEY"), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));

	static private final SubLList $list_alt102 = list(makeKeyword("STRENGTH"), makeKeyword("DIRECTION"));

	static private final SubLSymbol $sym103$SUCCESS__VAR = makeUninternedSymbol("SUCCESS?-VAR");

	static private final SubLSymbol $sym104$ERROR_DATUM_VAR = makeUninternedSymbol("ERROR-DATUM-VAR");

	private static final SubLSymbol KE_ASSERT_NOW = makeSymbol("KE-ASSERT-NOW");

	public static final SubLObject $$assertedUsingTool = constant_handles.reader_make_constant_shell(makeString("assertedUsingTool"));

	private static final SubLSymbol $FAILURE_PARTIAL = makeKeyword("FAILURE-PARTIAL");

	public static final SubLObject $$ExistingObjectType = constant_handles.reader_make_constant_shell(makeString("ExistingObjectType"));

	public static final SubLObject $$TemporalStuffType = constant_handles.reader_make_constant_shell(makeString("TemporalStuffType"));

	public static final SubLObject $$CollectionOrder = constant_handles.reader_make_constant_shell(makeString("CollectionOrder"));

	public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

	private static final SubLSymbol REIFY_NOUN_AS = makeSymbol("REIFY-NOUN-AS");

	static private final SubLList $list_alt115 = list(makeSymbol("NOUN-STRING"), makeSymbol("COLLECTION-OR-INDIVIDUAL"), makeSymbol("LIST-OF-TYPES"), makeSymbol("&OPTIONAL"), makeSymbol("GLOSS"), makeSymbol("NEEDS-OE?"), list(makeSymbol("TAXONOMY-MT"), constant_handles.reader_make_constant_shell(makeString("TheMotleyFoolUKCorpusMt"))),
			list(makeSymbol("LEXICAL-MT"), constant_handles.reader_make_constant_shell(makeString("GeneralEnglishMt"))));

	static private final SubLList $list_alt116 = list(makeString("@return list-of-list-p; a list (hopefully empty) of errors that occurred while attempting to make assertions,\n                           each of the form (ERROR-TYPE ERROR-STRING)"), list(makeSymbol("CHECK-TYPE"), makeSymbol("NOUN-STRING"), makeSymbol("STRINGP")),
			list(makeSymbol("CLET"), list(list(makeSymbol("TOOL"), constant_handles.reader_make_constant_shell(makeString("CycNounLearnerTool"))), list(makeSymbol("NEW-CONSTANT"), list(makeSymbol("CREATE-CONSTANT-USING-TOOL"), makeSymbol("NOUN-STRING"), makeSymbol("TOOL"), makeSymbol("TAXONOMY-MT"))), makeSymbol("ISA-OR-GENLS"), list(makeSymbol("ERROR-DATA"), NIL)),
					list(makeSymbol("PCASE"), makeSymbol("COLLECTION-OR-INDIVIDUAL"),
							list(makeKeyword("COLLECTION"),
									list(makeSymbol("CLET"), list(list(makeSymbol("SOPHISTICATED-ISAS"), list(makeSymbol("GET-SOPHISTICATED-ISAS-BASED-ON-GENLS"), makeSymbol("LIST-OF-TYPES"), makeSymbol("TAXONOMY-MT")))),
											list(makeSymbol("DO-LIST"), list(makeSymbol("ISA"), makeSymbol("SOPHISTICATED-ISAS")), list(makeSymbol("KE-ASSERT-USING-TOOL-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("NEW-CONSTANT"), makeSymbol("ISA")), makeSymbol("TAXONOMY-MT"), makeSymbol("TOOL"), makeSymbol("ERROR-DATA")))),
									list(makeSymbol("CSETQ"), makeSymbol("ISA-OR-GENLS"), constant_handles.reader_make_constant_shell(makeString("genls")))),
							list(makeKeyword("INDIVIDUAL"), list(makeSymbol("CSETQ"), makeSymbol("ISA-OR-GENLS"), constant_handles.reader_make_constant_shell(makeString("isa")))), list(makeSymbol("OTHERWISE"), list(makeSymbol("ERROR"), makeString("~S is not :COLLECTION or :INDIVIDUAL"), makeSymbol("COLLECTION-OR-INDIVIDUAL")))),
					list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE"), makeSymbol("LIST-OF-TYPES")), list(makeSymbol("KE-ASSERT-USING-TOOL-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), makeSymbol("ISA-OR-GENLS"), makeSymbol("NEW-CONSTANT"), makeSymbol("TYPE")), makeSymbol("TAXONOMY-MT"), makeSymbol("TOOL"), makeSymbol("ERROR-DATA"))),
					list(makeSymbol("KE-ASSERT-USING-TOOL-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("termStrings")), makeSymbol("NEW-CONSTANT"), makeSymbol("NOUN-STRING")), makeSymbol("LEXICAL-MT"), makeSymbol("TOOL"), makeSymbol("ERROR-DATA")),
					list(makeSymbol("PWHEN"), makeSymbol("GLOSS"), list(makeSymbol("KE-ASSERT-USING-TOOL-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("nounLearnerSenseGloss")), makeSymbol("NEW-CONSTANT"), makeSymbol("GLOSS")), makeSymbol("TAXONOMY-MT"), makeSymbol("TOOL"), makeSymbol("ERROR-DATA"))),
					list(makeSymbol("PWHEN"), makeSymbol("NEEDS-OE?"), list(makeSymbol("KE-ASSERT-USING-TOOL-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("NEW-CONSTANT"), constant_handles.reader_make_constant_shell(makeString("PoorlyOntologized"))), makeSymbol("TAXONOMY-MT"), makeSymbol("TOOL"), makeSymbol("ERROR-DATA"))),
					list(RET, list(makeSymbol("NREVERSE"), makeSymbol("ERROR-DATA")))));

	public static final SubLObject $$TheMotleyFoolUKCorpusMt = constant_handles.reader_make_constant_shell(makeString("TheMotleyFoolUKCorpusMt"));

	public static final SubLObject $$GeneralEnglishMt = constant_handles.reader_make_constant_shell(makeString("GeneralEnglishMt"));

	public static final SubLObject $$CycNounLearnerTool = constant_handles.reader_make_constant_shell(makeString("CycNounLearnerTool"));

	public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

	public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

	static private final SubLString $str_alt124$_S_is_not__COLLECTION_or__INDIVID = makeString("~S is not :COLLECTION or :INDIVIDUAL");

	public static final SubLObject $$termStrings = constant_handles.reader_make_constant_shell(makeString("termStrings"));

	public static final SubLObject $$nounLearnerSenseGloss = constant_handles.reader_make_constant_shell(makeString("nounLearnerSenseGloss"));

	public static final SubLObject $$PoorlyOntologized = constant_handles.reader_make_constant_shell(makeString("PoorlyOntologized"));

	private static final SubLSymbol LEARNED_NOUNS_REIFY_NOUN_AS_METHOD = makeSymbol("LEARNED-NOUNS-REIFY-NOUN-AS-METHOD");

	private static final SubLSymbol LEXIFY_TERM_AS_NOUN = makeSymbol("LEXIFY-TERM-AS-NOUN");

	static private final SubLList $list_alt130 = list(makeSymbol("TERM"), makeSymbol("NOUN-STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("LEXICAL-MT"), constant_handles.reader_make_constant_shell(makeString("GeneralEnglishMt"))));

	static private final SubLList $list_alt131 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TOOL"), constant_handles.reader_make_constant_shell(makeString("CycNounLearnerTool")))),
			list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("SUCCESS"), makeSymbol("ERROR")), list(makeSymbol("KE-ASSERT-USING-TOOL-NOW"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("termStrings")), makeSymbol("TERM"), makeSymbol("NOUN-STRING")), makeSymbol("LEXICAL-MT"), makeSymbol("TOOL")), list(makeSymbol("IGNORE"), makeSymbol("SUCCESS")),
					list(makeSymbol("PIF"), makeSymbol("ERROR"), list(RET, list(makeSymbol("LIST"), makeSymbol("ERROR"))), list(RET, NIL)))));

	private static final SubLSymbol LEARNED_NOUNS_LEXIFY_TERM_AS_NOUN_METHOD = makeSymbol("LEARNED-NOUNS-LEXIFY-TERM-AS-NOUN-METHOD");

	private static final SubLSymbol REIFY_SURNAME = makeSymbol("REIFY-SURNAME");

	static private final SubLList $list_alt134 = list(makeSymbol("NAME-STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("TAXONONY-MT"), constant_handles.reader_make_constant_shell(makeString("TheMotleyFoolUKCorpusMt"))), list(makeSymbol("LEXICAL-MT"), constant_handles.reader_make_constant_shell(makeString("GeneralEnglishMt"))));

	static private final SubLList $list_alt135 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NAME-STRING"), makeSymbol("STRINGP")),
			list(makeSymbol("CLET"),
					list(list(makeSymbol("TOOL"), constant_handles.reader_make_constant_shell(makeString("CycNounLearnerTool"))), list(makeSymbol("ERROR-DATA"), NIL),
							list(makeSymbol("QUERY-RESULT"),
									list(makeSymbol("ASK-VARIABLE"), list(QUOTE, makeSymbol("?NAME")),
											list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("and")), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("isa")), list(QUOTE, makeSymbol("?NAME")), constant_handles.reader_make_constant_shell(makeString("Name"))),
													list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("nameSpelling")), list(QUOTE, makeSymbol("?NAME")), makeSymbol("NAME-STRING"))),
											constant_handles.reader_make_constant_shell(makeString("InferencePSC")))),
							list(makeSymbol("NAME-CONSTANT"), list(makeSymbol("FIF"), makeSymbol("QUERY-RESULT"), list(makeSymbol("FIRST"), makeSymbol("QUERY-RESULT")), list(makeSymbol("CREATE-CONSTANT-USING-TOOL"), makeSymbol("NAME-STRING"), makeSymbol("TOOL"), makeSymbol("TAXONONY-MT"), makeString("-TheName"))))),
					list(makeSymbol("PUNLESS"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("NAME-CONSTANT"), constant_handles.reader_make_constant_shell(makeString("HumanSurname"))),
							list(makeSymbol("KE-ASSERT-USING-TOOL-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("NAME-CONSTANT"), constant_handles.reader_make_constant_shell(makeString("HumanSurname"))), makeSymbol("TAXONONY-MT"), makeSymbol("TOOL"), makeSymbol("ERROR-DATA"))),
					list(makeSymbol("PUNLESS"), makeSymbol("QUERY-RESULT"), list(makeSymbol("KE-ASSERT-USING-TOOL-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("nameSpelling")), makeSymbol("NAME-CONSTANT"), makeSymbol("NAME-STRING")), makeSymbol("LEXICAL-MT"), makeSymbol("TOOL"), makeSymbol("ERROR-DATA"))),
					list(RET, list(makeSymbol("NREVERSE"), makeSymbol("ERROR-DATA")))));

	static private final SubLSymbol $sym136$_NAME = makeSymbol("?NAME");

	public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

	public static final SubLObject $$Name = constant_handles.reader_make_constant_shell(makeString("Name"));

	public static final SubLObject $$nameSpelling = constant_handles.reader_make_constant_shell(makeString("nameSpelling"));

	public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

	static private final SubLString $str_alt141$_TheName = makeString("-TheName");

	public static final SubLObject $$HumanSurname = constant_handles.reader_make_constant_shell(makeString("HumanSurname"));

	private static final SubLSymbol LEARNED_NOUNS_REIFY_SURNAME_METHOD = makeSymbol("LEARNED-NOUNS-REIFY-SURNAME-METHOD");

	private static final SubLSymbol SKIP_NOUN = makeSymbol("SKIP-NOUN");

	static private final SubLList $list_alt145 = list(makeSymbol("NOUN-STRING"));

	static private final SubLList $list_alt146 = list(makeString("Record in the KB that NOUN-STRING was skipped in the #$CycNounLearnerTool by THE-CYCLIST just #$Now."), list(makeSymbol("CHECK-TYPE"), makeSymbol("NOUN-STRING"), makeSymbol("STRINGP")),
			list(makeSymbol("CLET"), list(list(makeSymbol("MT"), constant_handles.reader_make_constant_shell(makeString("CycNounLearnerToolUserActivityMt"))), makeSymbol("NEW-SKIPPING-EVENT"), list(makeSymbol("ERROR-DATA"), NIL)),
					list(makeSymbol("WITH-RKF-NAME-PREFIX"), list(makeString("")), list(makeSymbol("CSETQ"), makeSymbol("NEW-SKIPPING-EVENT"), list(makeSymbol("RKF-CREATE"), list(makeSymbol("CCONCATENATE"), makeString("skipping of "), makeSymbol("NOUN-STRING"))))),
					list(makeSymbol("KE-ASSERT-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("NEW-SKIPPING-EVENT"), constant_handles.reader_make_constant_shell(makeString("SkippingAStringInNounLearnerTool"))), makeSymbol("MT"), makeSymbol("ERROR-DATA")),
					list(makeSymbol("KE-ASSERT-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("performedBy")), makeSymbol("NEW-SKIPPING-EVENT"), list(makeSymbol("THE-CYCLIST"))), makeSymbol("MT"), makeSymbol("ERROR-DATA")),
					list(makeSymbol("KE-ASSERT-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("stringSkipped")), makeSymbol("NEW-SKIPPING-EVENT"), makeSymbol("NOUN-STRING")), makeSymbol("MT"), makeSymbol("ERROR-DATA")),
					list(makeSymbol("KE-ASSERT-NOW-OR-PUSH-ERROR-ONTO"), list(makeSymbol("LIST"), constant_handles.reader_make_constant_shell(makeString("endingDate")), makeSymbol("NEW-SKIPPING-EVENT"), list(makeSymbol("INDEXICAL-NOW"))), makeSymbol("MT"), makeSymbol("ERROR-DATA")), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("ERROR-DATA")))));

	public static final SubLObject $$CycNounLearnerToolUserActivityMt = constant_handles.reader_make_constant_shell(makeString("CycNounLearnerToolUserActivityMt"));

	static private final SubLString $str_alt148$skipping_of_ = makeString("skipping of ");

	public static final SubLObject $$SkippingAStringInNounLearnerTool = constant_handles.reader_make_constant_shell(makeString("SkippingAStringInNounLearnerTool"));

	public static final SubLObject $$performedBy = constant_handles.reader_make_constant_shell(makeString("performedBy"));

	public static final SubLObject $$stringSkipped = constant_handles.reader_make_constant_shell(makeString("stringSkipped"));

	public static final SubLObject $$endingDate = constant_handles.reader_make_constant_shell(makeString("endingDate"));

	private static final SubLSymbol LEARNED_NOUNS_SKIP_NOUN_METHOD = makeSymbol("LEARNED-NOUNS-SKIP-NOUN-METHOD");

	static private final SubLList $list_alt155 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

	static private final SubLList $list_alt156 = list(makeString("Return a list-representation of this object, where the elements of the list are lists of the following form:\n     (<noun-string> <cyc-constant> <:genls or :isa or :equals>)"), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("DO-DICTIONARY"),
			list(makeSymbol("NOUN-STRING"), makeSymbol("NOUN-OBJECT"), makeSymbol("DICTIONARY-OF-NOUNS")),
			list(makeSymbol("CLET"), list(list(makeSymbol("TAG"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-TAG")))), list(makeSymbol("CONFIDENCE"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-CONFIDENCE-LEVEL")))), list(makeSymbol("STATUS"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-STATUS-IN-CYC"))))),
					list(makeSymbol("PUNLESS"), list(makeSymbol("KEYWORDP"), makeSymbol("TAG")),
							list(makeSymbol("PCASE"), makeSymbol("STATUS"), list(makeKeyword("KNOWN-AND-LEXIFIED"), list(makeSymbol("IGNORE"))), list(makeKeyword("KNOWN-BUT-UNLEXIFIED"), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("NOUN-STRING"), makeSymbol("TAG"), makeKeyword("EQUALS"), makeSymbol("CONFIDENCE")), makeSymbol("RESULT"))),
									list(makeKeyword("UNKNOWN"),
											list(makeSymbol("CLET"), list(list(makeSymbol("COLLECTION-OR-INDIVIDUAL?"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("COLLECTION-OR-INDIVIDUAL?")))), makeSymbol("GENLS-OR-ISA")),
													list(makeSymbol("PCASE"), makeSymbol("COLLECTION-OR-INDIVIDUAL?"), list(makeKeyword("COLLECTION"), list(makeSymbol("CSETQ"), makeSymbol("GENLS-OR-ISA"), makeKeyword("GENLS"))), list(makeKeyword("INDIVIDUAL"), list(makeSymbol("CSETQ"), makeSymbol("GENLS-OR-ISA"), makeKeyword("ISA"))),
															list(makeSymbol("OTHERWISE"), list(makeSymbol("ERROR"), makeString("Expecting :COLLECTION or :INDIVIDUAL, got ~S."), makeSymbol("COLLECTION-OR-INDIVIDUAL?")))),
													list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("NOUN-STRING"), makeSymbol("TAG"), makeSymbol("GENLS-OR-ISA"), makeSymbol("CONFIDENCE")), makeSymbol("RESULT")))),
									list(makeSymbol("OTHERWISE"), list(makeSymbol("WARN"), makeString("The noun ~S has the status ~S."), makeSymbol("NOUN-STRING"), makeSymbol("STATUS"))))))),
			list(RET, makeSymbol("RESULT"))));

	private static final SubLSymbol $KNOWN_AND_LEXIFIED = makeKeyword("KNOWN-AND-LEXIFIED");

	private static final SubLSymbol $KNOWN_BUT_UNLEXIFIED = makeKeyword("KNOWN-BUT-UNLEXIFIED");

	static private final SubLSymbol $sym164$COLLECTION_OR_INDIVIDUAL_ = makeSymbol("COLLECTION-OR-INDIVIDUAL?");

	static private final SubLString $str_alt167$Expecting__COLLECTION_or__INDIVID = makeString("Expecting :COLLECTION or :INDIVIDUAL, got ~S.");

	static private final SubLString $str_alt168$The_noun__S_has_the_status__S_ = makeString("The noun ~S has the status ~S.");

	private static final SubLSymbol LEARNED_NOUNS_LISTIFY_METHOD = makeSymbol("LEARNED-NOUNS-LISTIFY-METHOD");

	private static final SubLSymbol PRINT_TAGS = makeSymbol("PRINT-TAGS");

	static private final SubLList $list_alt171 = list(list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("NOUN-STRING"), makeSymbol("NOUN-OBJECT"), makeSymbol("DICTIONARY-OF-NOUNS")), list(makeSymbol("CLET"),
			list(list(makeSymbol("TAG"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-TAG")))), list(makeSymbol("CONFIDENCE"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-CONFIDENCE-LEVEL")))), list(makeSymbol("STATUS"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-STATUS-IN-CYC"))))),
			list(makeSymbol("PUNLESS"), list(makeSymbol("KEYWORDP"), makeSymbol("TAG")),
					list(makeSymbol("PCASE"), makeSymbol("STATUS"), list(makeKeyword("KNOWN-AND-LEXIFIED"), list(makeSymbol("IGNORE"))), list(makeKeyword("KNOWN-BUT-UNLEXIFIED"), list(makeSymbol("FORMAT"), T, makeString("~&~S means ~S (confidence: ~S)~%"), makeSymbol("NOUN-STRING"), makeSymbol("TAG"), makeSymbol("CONFIDENCE")), list(makeSymbol("FORCE-OUTPUT"))), list(makeKeyword("UNKNOWN"),
							list(makeSymbol("CLET"), list(list(makeSymbol("COLLECTION-OR-INDIVIDUAL?"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("COLLECTION-OR-INDIVIDUAL?")))), makeSymbol("GENLS-OR-ISA")),
									list(makeSymbol("PCASE"), makeSymbol("COLLECTION-OR-INDIVIDUAL?"), list(makeKeyword("COLLECTION"), list(makeSymbol("CSETQ"), makeSymbol("GENLS-OR-ISA"), makeString("is a spec of"))), list(makeKeyword("INDIVIDUAL"), list(makeSymbol("CSETQ"), makeSymbol("GENLS-OR-ISA"), makeString("is an instance of"))),
											list(makeSymbol("OTHERWISE"), list(makeSymbol("ERROR"), makeString("Expecting :COLLECTION or :INDIVIDUAL, got ~S."), makeSymbol("COLLECTION-OR-INDIVIDUAL?")))),
									list(makeSymbol("FORMAT"), T, makeString("~&~S ~A ~S (confidence: ~S)~%"), makeSymbol("NOUN-STRING"), makeSymbol("GENLS-OR-ISA"), makeSymbol("TAG"), makeSymbol("CONFIDENCE"))),
							list(makeSymbol("FORCE-OUTPUT"))), list(makeSymbol("OTHERWISE"), list(makeSymbol("WARN"), makeString("The noun ~S has the status ~S."), makeSymbol("NOUN-STRING"), makeSymbol("STATUS"))))))),
			list(RET, NIL));

	static private final SubLString $str_alt172$___S_means__S__confidence___S___ = makeString("~&~S means ~S (confidence: ~S)~%");

	static private final SubLString $$$is_a_spec_of = makeString("is a spec of");

	static private final SubLString $$$is_an_instance_of = makeString("is an instance of");

	static private final SubLString $str_alt175$___S__A__S__confidence___S___ = makeString("~&~S ~A ~S (confidence: ~S)~%");

	private static final SubLSymbol LEARNED_NOUNS_PRINT_TAGS_METHOD = makeSymbol("LEARNED-NOUNS-PRINT-TAGS-METHOD");

	private static final SubLSymbol PRINT_UNKNOWN_SIMPLE_NOUN_TAGS_ORDERED_BY_CONFIDENCE = makeSymbol("PRINT-UNKNOWN-SIMPLE-NOUN-TAGS-ORDERED-BY-CONFIDENCE");

	static private final SubLList $list_alt178 = list(makeSymbol("&OPTIONAL"), makeSymbol("CONFIDENCE-THRESHOLD"));

	static private final SubLList $list_alt179 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LIST"), NIL)),
			list(makeSymbol("DO-LEARNED-SIMPLE-NOUNS"), list(makeSymbol("SIMPLE-NOUN"), makeKeyword("CONFIDENCE-THRESHOLD"), makeSymbol("CONFIDENCE-THRESHOLD"), makeKeyword("STATUSES"), list(QUOTE, list(makeKeyword("UNKNOWN")))),
					list(makeSymbol("CLET"), list(list(makeSymbol("TAG"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-TAG"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("KEYWORDP"), makeSymbol("TAG")), list(makeSymbol("CPUSH"), makeSymbol("SIMPLE-NOUN"), makeSymbol("LIST"))))),
			list(makeSymbol("CSETQ"), makeSymbol("LIST"), list(makeSymbol("SORT"), makeSymbol("LIST"), list(makeSymbol("FUNCTION"), makeSymbol(">")), list(makeSymbol("FUNCTION"), makeSymbol("SIMPLE-NOUN-GET-CONFIDENCE-LEVEL-METHOD")))), list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-NOUN"), makeSymbol("LIST")),
					list(makeSymbol("FORMAT"), T, makeString("~%~S  ~S   (confidence: ~S)"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-STRING"))), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-TAG"))), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-CONFIDENCE-LEVEL")))))),
			list(RET, NIL));

	static private final SubLList $list_alt180 = list(makeKeyword("UNKNOWN"));

	private static final SubLSymbol SIMPLE_NOUN_GET_CONFIDENCE_LEVEL_METHOD = makeSymbol("SIMPLE-NOUN-GET-CONFIDENCE-LEVEL-METHOD");

	static private final SubLString $str_alt183$___S___S____confidence___S_ = makeString("~%~S  ~S   (confidence: ~S)");

	static private final SubLSymbol $sym185$LEARNED_NOUNS_PRINT_UNKNOWN_SIMPLE_NOUN_TAGS_ORDERED_BY_CONFIDENC = makeSymbol("LEARNED-NOUNS-PRINT-UNKNOWN-SIMPLE-NOUN-TAGS-ORDERED-BY-CONFIDENCE-METHOD");

	private static final SubLSymbol PRINT_UNKNOWN_SIMPLE_NOUN_TOP_N_TAGS_ORDERED_BY_CONFIDENCE = makeSymbol("PRINT-UNKNOWN-SIMPLE-NOUN-TOP-N-TAGS-ORDERED-BY-CONFIDENCE");

	static private final SubLList $list_alt187 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("N"), FIVE_INTEGER), makeSymbol("CONFIDENCE-THRESHOLD"));

	static private final SubLList $list_alt188 = list(
			list(makeSymbol("CLET"), list(list(makeSymbol("LIST"), NIL)),
					list(makeSymbol("DO-LEARNED-SIMPLE-NOUNS"), list(makeSymbol("SIMPLE-NOUN"), makeKeyword("CONFIDENCE-THRESHOLD"), makeSymbol("CONFIDENCE-THRESHOLD"), makeKeyword("STATUSES"), list(QUOTE, list(makeKeyword("UNKNOWN")))),
							list(makeSymbol("CLET"), list(list(makeSymbol("TOP-N-TAGS"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-TOP-N-TAGS")), makeSymbol("N")))), list(makeSymbol("PUNLESS"), list(makeSymbol("KEYWORDP"), makeSymbol("TOP-N-TAGS")), list(makeSymbol("CPUSH"), makeSymbol("SIMPLE-NOUN"), makeSymbol("LIST"))))),
					list(makeSymbol("CSETQ"), makeSymbol("LIST"), list(makeSymbol("SORT"), makeSymbol("LIST"), list(makeSymbol("FUNCTION"), makeSymbol(">")), list(makeSymbol("FUNCTION"), makeSymbol("SIMPLE-NOUN-GET-CONFIDENCE-LEVEL-METHOD")))),
					list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-NOUN"), makeSymbol("LIST")), list(makeSymbol("TERPRI")), list(makeSymbol("TERPRI")), list(makeSymbol("WRITE-STRING"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-STRING")))),
							list(makeSymbol("CDOLIST"), list(makeSymbol("TAG"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-TOP-N-TAGS")), makeSymbol("N"))), list(makeSymbol("PRINT"), makeSymbol("TAG"))), list(makeSymbol("FORMAT"), T, makeString("~%confidence: ~S"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-CONFIDENCE-LEVEL")))))),
			list(RET, NIL));

	private static final SubLSymbol GET_TOP_N_TAGS = makeSymbol("GET-TOP-N-TAGS");

	static private final SubLString $str_alt190$__confidence___S = makeString("~%confidence: ~S");

	static private final SubLSymbol $sym191$LEARNED_NOUNS_PRINT_UNKNOWN_SIMPLE_NOUN_TOP_N_TAGS_ORDERED_BY_CON = makeSymbol("LEARNED-NOUNS-PRINT-UNKNOWN-SIMPLE-NOUN-TOP-N-TAGS-ORDERED-BY-CONFIDENCE-METHOD");

	private static final SubLSymbol ANNIHILATE_TAGS = makeSymbol("ANNIHILATE-TAGS");

	static private final SubLList $list_alt193 = list(makeString("Get rid of cached tags in order to cause them to be recalculated."), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("NOUN-STRING"), makeSymbol("NOUN-OBJECT"), makeSymbol("DICTIONARY-OF-NOUNS")), list(makeSymbol("IGNORE"), makeSymbol("NOUN-STRING")), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("REINITIALIZE")))),
			list(RET, NIL));

	private static final SubLSymbol REINITIALIZE = makeSymbol("REINITIALIZE");

	private static final SubLSymbol LEARNED_NOUNS_ANNIHILATE_TAGS_METHOD = makeSymbol("LEARNED-NOUNS-ANNIHILATE-TAGS-METHOD");

	private static final SubLSymbol PURGE_IRRELEVANT_NOUNS = makeSymbol("PURGE-IRRELEVANT-NOUNS");

	static private final SubLList $list_alt197 = list(makeString("Get rid of irrelevant nouns in order to reclaim the memory they are using"),
			list(makeSymbol("CLET"), list(list(makeSymbol("IRRELEVANT-NOUN-STRINGS"), NIL)),
					list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("NOUN-STRING"), makeSymbol("NOUN-OBJECT"), makeSymbol("DICTIONARY-OF-NOUNS")),
							list(makeSymbol("CLET"), list(list(makeSymbol("TOTAL-COUNT"), list(makeSymbol("FIF"), list(makeSymbol("SIMPLE-NOUN-P"), makeSymbol("NOUN-OBJECT")), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT"))), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN")))))),
									list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("TOTAL-COUNT"), makeSymbol("NOUN-RELEVANCE-COUNT-THRESHOLD")), list(makeSymbol("CPUSH"), makeSymbol("NOUN-STRING"), makeSymbol("IRRELEVANT-NOUN-STRINGS"))))),
					list(makeSymbol("CDOLIST"), list(makeSymbol("NOUN-STRING"), makeSymbol("IRRELEVANT-NOUN-STRINGS")), list(makeSymbol("DICTIONARY-REMOVE"), makeSymbol("DICTIONARY-OF-NOUNS"), makeSymbol("NOUN-STRING")))),
			list(RET, NIL));

	static private final SubLSymbol $sym198$OUTER_CATCH_FOR_LEARNED_NOUNS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEARNED-NOUNS-METHOD");

	private static final SubLSymbol LEARNED_NOUNS_PURGE_IRRELEVANT_NOUNS_METHOD = makeSymbol("LEARNED-NOUNS-PURGE-IRRELEVANT-NOUNS-METHOD");

	private static final SubLSymbol NOUN_COUNT = makeSymbol("NOUN-COUNT");

	static private final SubLList $list_alt202 = list(makeSymbol("NOUN-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("RELATION"));

	static private final SubLList $list_alt203 = list(makeString("@return integerp; the number of times NOUN occurred in the data in the RELATION position,\n                     or in total if RELATION is nil"), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("RELATION"), makeSymbol("NL-STATS-SUPPORTED-VERB-ARG-POSITION-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUN-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-NOUN")), makeSymbol("NOUN-STRING")))),
					list(makeSymbol("PCOND"), list(list(makeSymbol("SIMPLE-NOUN-P"), makeSymbol("NOUN-OBJECT")), list(RET, list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT")), makeSymbol("RELATION")))),
							list(list(makeSymbol("COMPLEX-NOUN-P"), makeSymbol("NOUN-OBJECT")),
									list(makeSymbol("PIF"), makeSymbol("RELATION"), list(makeSymbol("PROGN"), list(makeSymbol("WARN"), makeString("We don't keep track of occurrences of complex nouns by subject position, only in total.")), list(RET, NIL)), list(RET, list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT")))))),
							list(list(makeSymbol("NULL"), makeSymbol("NOUN-OBJECT")), list(RET, ZERO_INTEGER)))));

	private static final SubLSymbol NL_STATS_SUPPORTED_VERB_ARG_POSITION_P = makeSymbol("NL-STATS-SUPPORTED-VERB-ARG-POSITION-P");

	static private final SubLString $str_alt206$We_don_t_keep_track_of_occurrence = makeString("We don't keep track of occurrences of complex nouns by subject position, only in total.");

	private static final SubLSymbol LEARNED_NOUNS_NOUN_COUNT_METHOD = makeSymbol("LEARNED-NOUNS-NOUN-COUNT-METHOD");

	private static final SubLSymbol TAG_FOR_NOUN = makeSymbol("TAG-FOR-NOUN");

	static private final SubLList $list_alt209 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

	static private final SubLList $list_alt210 = list(makeString("Returns the tag (i.e. most likely collection) of the noun NOUN-STRING."),
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUN-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-NOUN")), makeSymbol("NOUN-STRING")))), list(makeSymbol("PIF"), makeSymbol("NOUN-OBJECT"), list(RET, list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-TAG")))), list(RET, NIL))));

	private static final SubLSymbol LEARNED_NOUNS_TAG_FOR_NOUN_METHOD = makeSymbol("LEARNED-NOUNS-TAG-FOR-NOUN-METHOD");

	private static final SubLSymbol CONFIDENCE_LEVEL = makeSymbol("CONFIDENCE-LEVEL");

	static private final SubLList $list_alt213 = list(makeString("Returns a measure of our confidence in the tag of the noun NOUN-STRING."),
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUN-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-NOUN")), makeSymbol("NOUN-STRING")))), list(makeSymbol("PIF"), makeSymbol("NOUN-OBJECT"), list(RET, list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-CONFIDENCE-LEVEL")))), list(RET, NIL))));

	private static final SubLSymbol LEARNED_NOUNS_CONFIDENCE_LEVEL_METHOD = makeSymbol("LEARNED-NOUNS-CONFIDENCE-LEVEL-METHOD");

	private static final SubLSymbol PRINT_COUNTS = makeSymbol("PRINT-COUNTS");

	static private final SubLList $list_alt216 = list(makeSymbol("SIMPLE-NOUN-STRING"));

	static private final SubLList $list_alt217 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SIMPLE-NOUN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-NOUN")), makeSymbol("SIMPLE-NOUN-STRING")))),
			list(makeSymbol("PIF"), list(makeSymbol("SIMPLE-NOUN-P"), makeSymbol("SIMPLE-NOUN")), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("PRINT-COUNTS"))), list(makeSymbol("FORMAT"), T, makeString("~&Can't find the simple noun ~S~%"), makeSymbol("SIMPLE-NOUN-STRING")))), list(RET, NIL));

	static private final SubLString $str_alt218$__Can_t_find_the_simple_noun__S__ = makeString("~&Can't find the simple noun ~S~%");

	private static final SubLSymbol LEARNED_NOUNS_PRINT_COUNTS_METHOD = makeSymbol("LEARNED-NOUNS-PRINT-COUNTS-METHOD");

	private static final SubLSymbol WHY_NOT_TAGGED_AS = makeSymbol("WHY-NOT-TAGGED-AS");

	static private final SubLList $list_alt221 = list(makeSymbol("SIMPLE-NOUN-STRING"), makeSymbol("BETTER-TAG"));

	static private final SubLList $list_alt222 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SIMPLE-NOUN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-NOUN")), makeSymbol("SIMPLE-NOUN-STRING")))),
			list(makeSymbol("PIF"), list(makeSymbol("SIMPLE-NOUN-P"), makeSymbol("SIMPLE-NOUN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("WHY-NOT-TAGGED-AS-INT")), makeSymbol("SIMPLE-NOUN"), makeSymbol("BETTER-TAG")), list(makeSymbol("FORMAT"), T, makeString("~&Can't find the simple noun ~S~%"), makeSymbol("SIMPLE-NOUN-STRING")))), list(RET, NIL));

	private static final SubLSymbol WHY_NOT_TAGGED_AS_INT = makeSymbol("WHY-NOT-TAGGED-AS-INT");

	private static final SubLSymbol LEARNED_NOUNS_WHY_NOT_TAGGED_AS_METHOD = makeSymbol("LEARNED-NOUNS-WHY-NOT-TAGGED-AS-METHOD");

	static private final SubLList $list_alt225 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NOUN-STRING"), makeSymbol("STRINGP")), list(RET, list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY-OF-NOUNS"), makeSymbol("NOUN-STRING"))));

	private static final SubLSymbol LEARNED_NOUNS_FIND_NOUN_METHOD = makeSymbol("LEARNED-NOUNS-FIND-NOUN-METHOD");

	private static final SubLSymbol GET_CALCULATE_TAG_METHOD = makeSymbol("GET-CALCULATE-TAG-METHOD");

	static private final SubLList $list_alt228 = list(list(RET, makeSymbol("CALCULATE-TAG-METHOD")));

	private static final SubLSymbol LEARNED_NOUNS_GET_CALCULATE_TAG_METHOD_METHOD = makeSymbol("LEARNED-NOUNS-GET-CALCULATE-TAG-METHOD-METHOD");

	private static final SubLSymbol GET_TYPICALITY_METRIC = makeSymbol("GET-TYPICALITY-METRIC");

	static private final SubLList $list_alt231 = list(list(RET, list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ASSOCIATED-TYPICALITY-METRIC")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CALCULATE-TAG-METHOD"))))));

	private static final SubLSymbol LEARNED_NOUNS_GET_TYPICALITY_METRIC_METHOD = makeSymbol("LEARNED-NOUNS-GET-TYPICALITY-METRIC-METHOD");

	static private final SubLSymbol $sym233$WEIGHT_SUMMANDS_BY_SELECTIVENESS_ = makeSymbol("WEIGHT-SUMMANDS-BY-SELECTIVENESS?");

	static private final SubLList $list_alt234 = list(list(RET, list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ASSOCIATED-SUMMAND-WEIGHTING?")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CALCULATE-TAG-METHOD"))))));

	static private final SubLSymbol $sym235$LEARNED_NOUNS_WEIGHT_SUMMANDS_BY_SELECTIVENESS__METHOD = makeSymbol("LEARNED-NOUNS-WEIGHT-SUMMANDS-BY-SELECTIVENESS?-METHOD");

	private static final SubLSymbol GET_NOUN_RELEVANCE_COUNT_THRESHOLD = makeSymbol("GET-NOUN-RELEVANCE-COUNT-THRESHOLD");

	static private final SubLList $list_alt237 = list(list(RET, makeSymbol("NOUN-RELEVANCE-COUNT-THRESHOLD")));

	private static final SubLSymbol LEARNED_NOUNS_GET_NOUN_RELEVANCE_COUNT_THRESHOLD_METHOD = makeSymbol("LEARNED-NOUNS-GET-NOUN-RELEVANCE-COUNT-THRESHOLD-METHOD");

	private static final SubLSymbol GET_SIZE = makeSymbol("GET-SIZE");

	static private final SubLList $list_alt240 = list(list(RET, list(makeSymbol("FIF"), list(makeSymbol("DICTIONARY-P"), makeSymbol("DICTIONARY-OF-NOUNS")), list(makeSymbol("DICTIONARY-LENGTH"), makeSymbol("DICTIONARY-OF-NOUNS")), ZERO_INTEGER)));

	private static final SubLSymbol LEARNED_NOUNS_GET_SIZE_METHOD = makeSymbol("LEARNED-NOUNS-GET-SIZE-METHOD");

	private static final SubLSymbol FIND_OR_CREATE_SIMPLE_NOUN = makeSymbol("FIND-OR-CREATE-SIMPLE-NOUN");

	static private final SubLList $list_alt243 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

	static private final SubLList $list_alt244 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NOUN-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-NOUN")), makeSymbol("NOUN-STRING")))),
			list(makeSymbol("PUNLESS"), makeSymbol("NOUN-OBJECT"), list(makeSymbol("CSETQ"), makeSymbol("NOUN-OBJECT"), list(makeSymbol("NEW-SIMPLE-NOUN"), makeSymbol("SELF"), makeSymbol("NOUN-STRING"))), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("DICTIONARY-OF-NOUNS"), makeSymbol("NOUN-STRING"), makeSymbol("NOUN-OBJECT"))), list(RET, makeSymbol("NOUN-OBJECT"))));

	private static final SubLSymbol LEARNED_NOUNS_FIND_OR_CREATE_SIMPLE_NOUN_METHOD = makeSymbol("LEARNED-NOUNS-FIND-OR-CREATE-SIMPLE-NOUN-METHOD");

	private static final SubLSymbol FIND_OR_CREATE_COMPLEX_NOUN = makeSymbol("FIND-OR-CREATE-COMPLEX-NOUN");

	static private final SubLList $list_alt247 = list(makeSymbol("COMPLEX-NOUN-STRING"), makeSymbol("HEAD-NOUN-OBJECT"));

	static private final SubLList $list_alt248 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEX-NOUN-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-NOUN")), makeSymbol("COMPLEX-NOUN-STRING")))),
			list(makeSymbol("PUNLESS"), makeSymbol("COMPLEX-NOUN-OBJECT"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEX-NOUN-OBJECT"), list(makeSymbol("NEW-COMPLEX-NOUN"), makeSymbol("SELF"), makeSymbol("COMPLEX-NOUN-STRING"), makeSymbol("HEAD-NOUN-OBJECT"))), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("DICTIONARY-OF-NOUNS"), makeSymbol("COMPLEX-NOUN-STRING"), makeSymbol("COMPLEX-NOUN-OBJECT")),
					list(makeSymbol("FIM"), makeSymbol("HEAD-NOUN-OBJECT"), list(QUOTE, makeSymbol("LINK-COMPLEX-NOUN")), makeSymbol("COMPLEX-NOUN-OBJECT"))),
			list(RET, makeSymbol("COMPLEX-NOUN-OBJECT"))));

	private static final SubLSymbol LINK_COMPLEX_NOUN = makeSymbol("LINK-COMPLEX-NOUN");

	private static final SubLSymbol LEARNED_NOUNS_FIND_OR_CREATE_COMPLEX_NOUN_METHOD = makeSymbol("LEARNED-NOUNS-FIND-OR-CREATE-COMPLEX-NOUN-METHOD");

	private static final SubLSymbol GENERATE_KE_TEXT = makeSymbol("GENERATE-KE-TEXT");

	static private final SubLList $list_alt252 = list(makeSymbol("KE-FILE-PATH"), makeSymbol("NOTES-FILE-PATH"));

	static private final SubLList $list_alt253 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("KE-FILE-PATH"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("NOTES-FILE-PATH"), makeSymbol("STRINGP")),
			list(makeSymbol("WITH-TEXT-FILE"), list(makeSymbol("KE-STREAM"), makeSymbol("KE-FILE-PATH"), makeKeyword("OUTPUT")),
					list(makeSymbol("WITH-TEXT-FILE"), list(makeSymbol("NOTES-STREAM"), makeSymbol("NOTES-FILE-PATH"), makeKeyword("OUTPUT")),
							list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("NOUN-STRING"), makeSymbol("NOUN-OBJECT"), makeSymbol("DICTIONARY-OF-NOUNS")),
									list(makeSymbol("CLET"), list(list(makeSymbol("TAG"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-TAG")))), list(makeSymbol("STATUS"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("GET-STATUS-IN-CYC"))))),
											list(makeSymbol("PUNLESS"), list(makeSymbol("KEYWORDP"), makeSymbol("TAG")),
													list(makeSymbol("PCASE"), makeSymbol("STATUS"), list(makeKeyword("KNOWN-AND-LEXIFIED"), list(makeSymbol("IGNORE"))),
															list(makeKeyword("KNOWN-BUT-UNLEXIFIED"),
																	list(makeSymbol("PIF"), list(makeSymbol("FORT-P"), makeSymbol("TAG")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("KE-TEXT-LEXIFICATION")), makeSymbol("NOUN-STRING"), makeSymbol("TAG"), makeSymbol("KE-STREAM")),
																			list(makeSymbol("FORMAT"), makeSymbol("NOTES-STREAM"), makeString("~&~%Not lexifying ~S because ~S is not reified.~%"), makeSymbol("NOUN-STRING"), makeSymbol("TAG")))),
															list(makeKeyword("UNKNOWN"),
																	list(makeSymbol("CLET"), list(list(makeSymbol("COLLECTION-OR-INDIVIDUAL?"), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("COLLECTION-OR-INDIVIDUAL?")))), list(makeSymbol("NEW-CONSTANT-NAME"), list(makeSymbol("GENERATE-CONSTANT-NAME-FOR-NOUN"), makeSymbol("NOUN-STRING")))),
																			list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("KE-TEXT-REIFICATION")), makeSymbol("NEW-CONSTANT-NAME"), makeSymbol("TAG"), makeSymbol("COLLECTION-OR-INDIVIDUAL?"), makeSymbol("KE-STREAM")),
																			list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("KE-TEXT-LEXIFICATION")), makeSymbol("NOUN-STRING"), makeSymbol("NEW-CONSTANT-NAME"), makeSymbol("KE-STREAM")))),
															list(makeSymbol("OTHERWISE"), list(makeSymbol("ERROR"), makeString("I don't understand the status ~S."), makeSymbol("STATUS"))))))))),
			list(RET, NIL));

	static private final SubLString $str_alt255$Unable_to_open__S = makeString("Unable to open ~S");

	private static final SubLSymbol KE_TEXT_LEXIFICATION = makeSymbol("KE-TEXT-LEXIFICATION");

	static private final SubLString $str_alt257$____Not_lexifying__S_because__S_i = makeString("~&~%Not lexifying ~S because ~S is not reified.~%");

	private static final SubLSymbol KE_TEXT_REIFICATION = makeSymbol("KE-TEXT-REIFICATION");

	static private final SubLString $str_alt259$I_don_t_understand_the_status__S_ = makeString("I don't understand the status ~S.");

	private static final SubLSymbol LEARNED_NOUNS_GENERATE_KE_TEXT_METHOD = makeSymbol("LEARNED-NOUNS-GENERATE-KE-TEXT-METHOD");

	static private final SubLList $list_alt261 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

	static private final SubLList $list_alt262 = list(makeSymbol("CONSTANT-NAME"), makeSymbol("TAG"), makeSymbol("COLLECTION-OR-INDIVIDUAL?"), makeSymbol("STREAM"));

	static private final SubLList $list_alt263 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PREDICATE"), list(makeSymbol("FCOND"), list(list(EQ, makeSymbol("COLLECTION-OR-INDIVIDUAL?"), makeKeyword("COLLECTION")), makeString("genls")), list(list(EQ, makeSymbol("COLLECTION-OR-INDIVIDUAL?"), makeKeyword("INDIVIDUAL")), makeString("isa"))))),
			list(makeSymbol("CSETQ"), makeSymbol("TAG"), list(makeSymbol("NART-EXPAND"), makeSymbol("TAG"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~&~%Constant: ~A.~%"), makeSymbol("CONSTANT-NAME")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~A: ~S.~%~%"), makeSymbol("PREDICATE"), makeSymbol("TAG")), list(RET, NIL)));

	static private final SubLString $$$genls = makeString("genls");

	static private final SubLString $$$isa = makeString("isa");

	static private final SubLString $str_alt266$____Constant___A___ = makeString("~&~%Constant: ~A.~%");

	static private final SubLString $str_alt267$_A___S_____ = makeString("~A: ~S.~%~%");

	private static final SubLSymbol LEARNED_NOUNS_KE_TEXT_REIFICATION_METHOD = makeSymbol("LEARNED-NOUNS-KE-TEXT-REIFICATION-METHOD");

	static private final SubLList $list_alt269 = list(makeSymbol("LEX-STRING"), makeSymbol("TERM"), makeSymbol("STREAM"));

	static private final SubLList $list_alt270 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~&~%nameString ~S ~S~%~%"), makeSymbol("TERM"), makeSymbol("LEX-STRING")), list(RET, NIL));

	static private final SubLString $str_alt271$____nameString__S__S____ = makeString("~&~%nameString ~S ~S~%~%");

	private static final SubLSymbol LEARNED_NOUNS_KE_TEXT_LEXIFICATION_METHOD = makeSymbol("LEARNED-NOUNS-KE-TEXT-LEXIFICATION-METHOD");

	private static final SubLSymbol GROUP_NOUNS_INTO_LISTS_FOR_JAVA_TOOL = makeSymbol("GROUP-NOUNS-INTO-LISTS-FOR-JAVA-TOOL");

	static private final SubLList $list_alt274 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("MIN-LIST-LENGTH"), makeInteger(50)));

	static private final SubLList $list_alt275 = list(makeString(
			"Partition nouns that are to be worked on in the java tool into groups of approximately MIN-LIST-LENGTH,\n   which is a reasonable number for a person to work on at a time.\n   For now, I\'m keeping :UNKNOWN simple nouns separate from :KNOWN-BUT-UNLEXIFIED simple nouns, because the tool is not\n   set up to handle :KNOWN-BUT-UNLEXIFIED nouns intelligently.  Complex nouns are stuck in after their heads if their\n   heads are included, the rest are shoved into a third group.\n   For now, I\'m ordering simple nouns by number of occurrences (ignoring confidence).\n   @return triple? of listp of listp of noun-p:\n           (1) a list of manageable lists of unknown simple nouns and associated complex nouns\n           (2) a list of manageable lists of known-but-unlexified simple nouns and associated complex nouns\n           (3) a list of manageable lists of complex nouns whose heads are known-and-lexified (and thus not included)"),
			list(makeSymbol("CLET"), list(list(makeSymbol("LIST-OF-RELEVANT-UNKNOWN-SIMPLE-NOUNS"), NIL), list(makeSymbol("LIST-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-SIMPLE-NOUNS"), NIL), list(makeSymbol("LIST-OF-RELEVANT-KNOWN-AND-LEXIFIED-SIMPLE-NOUNS"), NIL)),
					list(makeSymbol("DO-LEARNED-SIMPLE-NOUNS"), list(makeSymbol("SIMPLE-NOUN"), makeKeyword("COUNT-THRESHOLD"), makeSymbol("NOUN-RELEVANCE-COUNT-THRESHOLD")),
							list(makeSymbol("PCASE"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-STATUS-IN-CYC"))), list(makeKeyword("UNKNOWN"), list(makeSymbol("CPUSH"), makeSymbol("SIMPLE-NOUN"), makeSymbol("LIST-OF-RELEVANT-UNKNOWN-SIMPLE-NOUNS"))),
									list(makeKeyword("KNOWN-BUT-UNLEXIFIED"), list(makeSymbol("CPUSH"), makeSymbol("SIMPLE-NOUN"), makeSymbol("LIST-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-SIMPLE-NOUNS"))), list(makeKeyword("KNOWN-AND-LEXIFIED"), list(makeSymbol("CPUSH"), makeSymbol("SIMPLE-NOUN"), makeSymbol("LIST-OF-RELEVANT-KNOWN-AND-LEXIFIED-SIMPLE-NOUNS"))))),
					list(makeSymbol("SORT"), makeSymbol("LIST-OF-RELEVANT-UNKNOWN-SIMPLE-NOUNS"), list(makeSymbol("FUNCTION"), makeSymbol(">")), list(makeSymbol("FUNCTION"), makeSymbol("SIMPLE-NOUN-GET-TOTAL-COUNT-METHOD"))),
					list(makeSymbol("SORT"), makeSymbol("LIST-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-SIMPLE-NOUNS"), list(makeSymbol("FUNCTION"), makeSymbol(">")), list(makeSymbol("FUNCTION"), makeSymbol("SIMPLE-NOUN-GET-TOTAL-COUNT-METHOD"))),
					list(new SubLObject[] { makeSymbol("CLET"), list(list(makeSymbol("LIST-OF-LISTS-OF-RELEVANT-UNKNOWN-NOUNS"), NIL), list(makeSymbol("LIST-OF-LISTS-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-NOUNS"), NIL), list(makeSymbol("LIST-OF-LISTS-OF-RELEVANT-ORPHAN-COMPLEX-NOUNS"), NIL), list(makeSymbol("CURRENT-SMALL-LIST"), NIL)),
							list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-NOUN"), makeSymbol("LIST-OF-RELEVANT-UNKNOWN-SIMPLE-NOUNS")), list(makeSymbol("CPUSH"), makeSymbol("SIMPLE-NOUN"), makeSymbol("CURRENT-SMALL-LIST")),
									list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEX-NOUNS"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-COMPLEX-NOUNS-HEADED-BY-THIS-NOUN"))))),
											list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEX-NOUN"), makeSymbol("COMPLEX-NOUNS")),
													list(makeSymbol("PWHEN"),
															list(makeSymbol("CAND"), list(makeSymbol(">="), list(makeSymbol("FIM"), makeSymbol("COMPLEX-NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN"))), makeSymbol("NOUN-RELEVANCE-COUNT-THRESHOLD")),
																	list(makeSymbol("CNOT"), list(EQ, makeKeyword("KNOWN-AND-LEXIFIED"), list(makeSymbol("FIM"), makeSymbol("COMPLEX-NOUN"), list(QUOTE, makeSymbol("GET-STATUS-IN-CYC")))))),
															list(makeSymbol("CPUSH"), makeSymbol("COMPLEX-NOUN"), makeSymbol("CURRENT-SMALL-LIST"))))),
									list(makeSymbol("PWHEN"), list(makeSymbol("LENGTH>="), makeSymbol("CURRENT-SMALL-LIST"), makeSymbol("MIN-LIST-LENGTH")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), list(makeSymbol("NREVERSE"), makeSymbol("CURRENT-SMALL-LIST"))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-SMALL-LIST"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-UNKNOWN-NOUNS")),
											list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), NIL))),
							list(makeSymbol("PUNLESS"), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("CURRENT-SMALL-LIST")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), list(makeSymbol("NREVERSE"), makeSymbol("CURRENT-SMALL-LIST"))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-SMALL-LIST"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-UNKNOWN-NOUNS")),
									list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), NIL)),
							list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-NOUN"), makeSymbol("LIST-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-SIMPLE-NOUNS")), list(makeSymbol("CPUSH"), makeSymbol("SIMPLE-NOUN"), makeSymbol("CURRENT-SMALL-LIST")),
									list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEX-NOUNS"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-COMPLEX-NOUNS-HEADED-BY-THIS-NOUN"))))),
											list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEX-NOUN"), makeSymbol("COMPLEX-NOUNS")),
													list(makeSymbol("PWHEN"),
															list(makeSymbol("CAND"), list(makeSymbol(">="), list(makeSymbol("FIM"), makeSymbol("COMPLEX-NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN"))), makeSymbol("NOUN-RELEVANCE-COUNT-THRESHOLD")),
																	list(makeSymbol("CNOT"), list(EQ, makeKeyword("KNOWN-AND-LEXIFIED"), list(makeSymbol("FIM"), makeSymbol("COMPLEX-NOUN"), list(QUOTE, makeSymbol("GET-STATUS-IN-CYC")))))),
															list(makeSymbol("CPUSH"), makeSymbol("COMPLEX-NOUN"), makeSymbol("CURRENT-SMALL-LIST"))))),
									list(makeSymbol("PWHEN"), list(makeSymbol("LENGTH>="), makeSymbol("CURRENT-SMALL-LIST"), makeSymbol("MIN-LIST-LENGTH")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), list(makeSymbol("NREVERSE"), makeSymbol("CURRENT-SMALL-LIST"))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-SMALL-LIST"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-NOUNS")),
											list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), NIL))),
							list(makeSymbol("PUNLESS"), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("CURRENT-SMALL-LIST")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), list(makeSymbol("NREVERSE"), makeSymbol("CURRENT-SMALL-LIST"))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-SMALL-LIST"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-NOUNS")),
									list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), NIL)),
							list(makeSymbol("CDOLIST"), list(makeSymbol("SIMPLE-NOUN"), makeSymbol("LIST-OF-RELEVANT-KNOWN-AND-LEXIFIED-SIMPLE-NOUNS")),
									list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEX-NOUNS"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-COMPLEX-NOUNS-HEADED-BY-THIS-NOUN"))))),
											list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEX-NOUN"), makeSymbol("COMPLEX-NOUNS")),
													list(makeSymbol("PWHEN"),
															list(makeSymbol("CAND"), list(makeSymbol(">="), list(makeSymbol("FIM"), makeSymbol("COMPLEX-NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN"))), makeSymbol("NOUN-RELEVANCE-COUNT-THRESHOLD")),
																	list(makeSymbol("CNOT"), list(EQ, makeKeyword("KNOWN-AND-LEXIFIED"), list(makeSymbol("FIM"), makeSymbol("COMPLEX-NOUN"), list(QUOTE, makeSymbol("GET-STATUS-IN-CYC")))))),
															list(makeSymbol("CPUSH"), makeSymbol("COMPLEX-NOUN"), makeSymbol("CURRENT-SMALL-LIST"))))),
									list(makeSymbol("PWHEN"), list(makeSymbol("LENGTH>="), makeSymbol("CURRENT-SMALL-LIST"), makeSymbol("MIN-LIST-LENGTH")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), list(makeSymbol("NREVERSE"), makeSymbol("CURRENT-SMALL-LIST"))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-SMALL-LIST"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-ORPHAN-COMPLEX-NOUNS")),
											list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), NIL))),
							list(makeSymbol("PUNLESS"), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("CURRENT-SMALL-LIST")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SMALL-LIST"), list(makeSymbol("NREVERSE"), makeSymbol("CURRENT-SMALL-LIST"))), list(makeSymbol("CPUSH"), makeSymbol("CURRENT-SMALL-LIST"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-ORPHAN-COMPLEX-NOUNS"))),
							list(RET, list(makeSymbol("LIST"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-UNKNOWN-NOUNS"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-NOUNS"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-ORPHAN-COMPLEX-NOUNS"))) })));

	public static final SubLInteger $int$50 = makeInteger(50);

	private static final SubLSymbol SIMPLE_NOUN_GET_TOTAL_COUNT_METHOD = makeSymbol("SIMPLE-NOUN-GET-TOTAL-COUNT-METHOD");

	private static final SubLSymbol GET_COMPLEX_NOUNS_HEADED_BY_THIS_NOUN = makeSymbol("GET-COMPLEX-NOUNS-HEADED-BY-THIS-NOUN");

	private static final SubLSymbol LEARNED_NOUNS_GROUP_NOUNS_INTO_LISTS_FOR_JAVA_TOOL_METHOD = makeSymbol("LEARNED-NOUNS-GROUP-NOUNS-INTO-LISTS-FOR-JAVA-TOOL-METHOD");

	private static final SubLSymbol GROUP_JAVAFIED_NOUNS_INTO_LISTS_FOR_JAVA_TOOL = makeSymbol("GROUP-JAVAFIED-NOUNS-INTO-LISTS-FOR-JAVA-TOOL");

	static private final SubLList $list_alt281 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("MIN-LIST-LENGTH"), makeInteger(50)), list(makeSymbol("MAX-RANKING-LENGTH"), makeInteger(200)));

	static private final SubLList $list_alt282 = list(list(makeSymbol("CLET"), list(list(makeSymbol("UNJAVAFIED-RESULT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GROUP-NOUNS-INTO-LISTS-FOR-JAVA-TOOL")), makeSymbol("MIN-LIST-LENGTH"))), list(makeSymbol("JAVAFIED-RESULT"), NIL)),
			list(makeSymbol("CDOLIST"), list(makeSymbol("LIST-OF-LISTS-OF-NOUNS"), makeSymbol("UNJAVAFIED-RESULT")),
					list(makeSymbol("CLET"), list(list(makeSymbol("LIST-OF-LISTS-OF-JAVAFIED-NOUNS"), NIL)),
							list(makeSymbol("CDOLIST"), list(makeSymbol("LIST-OF-NOUNS"), makeSymbol("LIST-OF-LISTS-OF-NOUNS")),
									list(makeSymbol("CLET"), list(list(makeSymbol("LIST-OF-JAVAFIED-NOUNS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("NOUN"), makeSymbol("LIST-OF-NOUNS")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("JAVAFY")), makeSymbol("MAX-RANKING-LENGTH")), makeSymbol("LIST-OF-JAVAFIED-NOUNS"))),
											list(makeSymbol("CSETQ"), makeSymbol("LIST-OF-JAVAFIED-NOUNS"), list(makeSymbol("NREVERSE"), makeSymbol("LIST-OF-JAVAFIED-NOUNS"))), list(makeSymbol("CPUSH"), makeSymbol("LIST-OF-JAVAFIED-NOUNS"), makeSymbol("LIST-OF-LISTS-OF-JAVAFIED-NOUNS")))),
							list(makeSymbol("CSETQ"), makeSymbol("LIST-OF-LISTS-OF-JAVAFIED-NOUNS"), list(makeSymbol("NREVERSE"), makeSymbol("LIST-OF-LISTS-OF-JAVAFIED-NOUNS"))), list(makeSymbol("CPUSH"), makeSymbol("LIST-OF-LISTS-OF-JAVAFIED-NOUNS"), makeSymbol("JAVAFIED-RESULT")))),
			list(RET, list(makeSymbol("NREVERSE"), makeSymbol("JAVAFIED-RESULT")))));

	public static final SubLInteger $int$200 = makeInteger(200);

	private static final SubLSymbol JAVAFY = makeSymbol("JAVAFY");

	static private final SubLSymbol $sym285$LEARNED_NOUNS_GROUP_JAVAFIED_NOUNS_INTO_LISTS_FOR_JAVA_TOOL_METHO = makeSymbol("LEARNED-NOUNS-GROUP-JAVAFIED-NOUNS-INTO-LISTS-FOR-JAVA-TOOL-METHOD");

	private static final SubLSymbol SAVE_JAVAFIED_NOUN_LISTS_FOR_JAVA_TOOL = makeSymbol("SAVE-JAVAFIED-NOUN-LISTS-FOR-JAVA-TOOL");

	static private final SubLList $list_alt287 = list(makeSymbol("DIRECTORY"), makeSymbol("&OPTIONAL"), list(makeSymbol("MIN-LIST-LENGTH"), makeInteger(50)), list(makeSymbol("MAX-RANKING-LENGTH"), makeInteger(200)));

	static private final SubLList $list_alt288 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("DIRECTORY"), makeSymbol("DIRECTORY-P")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTORY"), list(makeSymbol("NORMALIZE-DIRECTORY-NAME"), makeSymbol("DIRECTORY"))),
			list(makeSymbol("CLET"), list(list(makeSymbol("UNKNOWN-PREFIX"), makeString("unknown-javafied-noun-list-")), list(makeSymbol("KNOWN-BUT-UNLEXIFIED-PREFIX"), makeString("known-but-unlexified-javafied-noun-list-")), list(makeSymbol("ORPHAN-COMPLEX-PREFIX"), makeString("orphan-complex-javafied-noun-list-")), list(makeSymbol("SUFFIX"), makeString(".cfasl"))),
					list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("LIST-OF-LISTS-OF-RELEVANT-UNKNOWN-NOUNS"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-NOUNS"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-ORPHAN-COMPLEX-NOUNS")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GROUP-NOUNS-INTO-LISTS-FOR-JAVA-TOOL")), makeSymbol("MIN-LIST-LENGTH")),
							list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("LIST-OF-UNKNOWN-NOUNS"), makeSymbol("INDEX"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-UNKNOWN-NOUNS")),
									list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SAVE-NOUN-LIST")), makeSymbol("LIST-OF-UNKNOWN-NOUNS"), list(makeSymbol("CCONCATENATE"), makeSymbol("DIRECTORY"), makeSymbol("UNKNOWN-PREFIX"), list(makeSymbol("TO-STRING"), makeSymbol("INDEX")), makeSymbol("SUFFIX")), makeSymbol("MAX-RANKING-LENGTH"))),
							list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("LIST-OF-KNOWN-BUT-UNLEXIFIED-NOUNS"), makeSymbol("INDEX"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-NOUNS")),
									list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SAVE-NOUN-LIST")), makeSymbol("LIST-OF-KNOWN-BUT-UNLEXIFIED-NOUNS"), list(makeSymbol("CCONCATENATE"), makeSymbol("DIRECTORY"), makeSymbol("KNOWN-BUT-UNLEXIFIED-PREFIX"), list(makeSymbol("TO-STRING"), makeSymbol("INDEX")), makeSymbol("SUFFIX")), makeSymbol("MAX-RANKING-LENGTH"))),
							list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("LIST-OF-ORPHAN-COMPLEX-NOUNS"), makeSymbol("INDEX"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-ORPHAN-COMPLEX-NOUNS")),
									list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SAVE-NOUN-LIST")), makeSymbol("LIST-OF-ORPHAN-COMPLEX-NOUNS"), list(makeSymbol("CCONCATENATE"), makeSymbol("DIRECTORY"), makeSymbol("ORPHAN-COMPLEX-PREFIX"), list(makeSymbol("TO-STRING"), makeSymbol("INDEX")), makeSymbol("SUFFIX")), makeSymbol("MAX-RANKING-LENGTH"))))),
			list(RET, NIL));

	static private final SubLString $str_alt290$unknown_javafied_noun_list_ = makeString("unknown-javafied-noun-list-");

	static private final SubLString $str_alt291$known_but_unlexified_javafied_nou = makeString("known-but-unlexified-javafied-noun-list-");

	static private final SubLString $str_alt292$orphan_complex_javafied_noun_list = makeString("orphan-complex-javafied-noun-list-");

	static private final SubLString $str_alt293$_cfasl = makeString(".cfasl");

	static private final SubLList $list_alt294 = list(makeSymbol("LIST-OF-LISTS-OF-RELEVANT-UNKNOWN-NOUNS"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-KNOWN-BUT-UNLEXIFIED-NOUNS"), makeSymbol("LIST-OF-LISTS-OF-RELEVANT-ORPHAN-COMPLEX-NOUNS"));

	private static final SubLSymbol SAVE_NOUN_LIST = makeSymbol("SAVE-NOUN-LIST");

	private static final SubLSymbol LEARNED_NOUNS_SAVE_JAVAFIED_NOUN_LISTS_FOR_JAVA_TOOL_METHOD = makeSymbol("LEARNED-NOUNS-SAVE-JAVAFIED-NOUN-LISTS-FOR-JAVA-TOOL-METHOD");

	static private final SubLList $list_alt297 = list(makeSymbol("UNJAVAFIED-NOUN-LIST"), makeSymbol("FILENAME"), makeSymbol("MAX-RANKING-LENGTH"));

	static private final SubLList $list_alt298 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("UNJAVAFIED-NOUN-LIST"), makeSymbol("LISTP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("FILENAME"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("MAX-RANKING-LENGTH"), makeSymbol("POSITIVE-INTEGER-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("JAVAFIED-NOUN-LIST"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("UNJAVAFIED-NOUN"), makeSymbol("UNJAVAFIED-NOUN-LIST")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("UNJAVAFIED-NOUN"), list(QUOTE, makeSymbol("JAVAFY")), makeSymbol("MAX-RANKING-LENGTH")), makeSymbol("JAVAFIED-NOUN-LIST"))),
					list(makeSymbol("CSETQ"), makeSymbol("JAVAFIED-NOUN-LIST"), list(makeSymbol("NREVERSE"), makeSymbol("JAVAFIED-NOUN-LIST"))), list(makeSymbol("FORMAT"), T, makeString("~%Saving ~A"), makeSymbol("FILENAME")), list(makeSymbol("FORCE-OUTPUT")), list(makeSymbol("CFASL-SAVE-EXTERNALIZED"), makeSymbol("JAVAFIED-NOUN-LIST"), makeSymbol("FILENAME"))),
			list(RET, NIL));

	static private final SubLString $str_alt301$__Saving__A = makeString("~%Saving ~A");

	private static final SubLSymbol LEARNED_NOUNS_SAVE_NOUN_LIST_METHOD = makeSymbol("LEARNED-NOUNS-SAVE-NOUN-LIST-METHOD");

	private static final SubLSymbol LOAD_JAVAFIED_NOUN_FILE = makeSymbol("LOAD-JAVAFIED-NOUN-FILE");

	static private final SubLList $list_alt304 = list(makeSymbol("FILENAME"));

	static private final SubLList $list_alt305 = list(makeString("Call @xref CFASL-LOAD and weed out any invalid forts from the result."),
			list(makeSymbol("CLET"), list(list(makeSymbol("JAVAFIED-NOUNS"), list(makeSymbol("CFASL-LOAD"), makeSymbol("FILENAME"))), list(makeSymbol("RESULT"), NIL)), list(makeSymbol("PIF"), list(makeSymbol("LISTP"), makeSymbol("JAVAFIED-NOUNS")),
					list(makeSymbol("PROGN"), list(makeSymbol("CDOLIST"), list(makeSymbol("JAVAFIED-NOUN"), makeSymbol("JAVAFIED-NOUNS")), list(makeSymbol("CPUSH"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("WEED-OUT-INVALID-FORTS")), makeSymbol("JAVAFIED-NOUN")), makeSymbol("RESULT"))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("NREVERSE"), makeSymbol("RESULT")))),
					list(makeSymbol("CSETQ"), makeSymbol("RESULT"), makeSymbol("JAVAFIED-NOUNS"))), list(RET, makeSymbol("RESULT"))));

	private static final SubLSymbol WEED_OUT_INVALID_FORTS = makeSymbol("WEED-OUT-INVALID-FORTS");

	private static final SubLSymbol LEARNED_NOUNS_LOAD_JAVAFIED_NOUN_FILE_METHOD = makeSymbol("LEARNED-NOUNS-LOAD-JAVAFIED-NOUN-FILE-METHOD");

	private static final SubLSymbol JAVAFIED_NOUN_P = makeSymbol("JAVAFIED-NOUN-P");

	static private final SubLList $list_alt310 = list(makeSymbol("JAVAFIED-NOUN"));

	static private final SubLList $list_alt311 = list(list(makeSymbol("PIF"), list(makeSymbol("JAVAFIED-NOUN-P"), makeSymbol("JAVAFIED-NOUN")),
			list(makeSymbol("PROGN"), list(makeSymbol("SET-JAVAFIED-NOUN-CONJECTURES"), makeSymbol("JAVAFIED-NOUN"), list(makeSymbol("WEED-OUT-INVALID-FORTS-FROM-CONJECTURES"), list(makeSymbol("GET-JAVAFIED-NOUN-CONJECTURES"), makeSymbol("JAVAFIED-NOUN")))),
					list(makeSymbol("PWHEN"), list(makeSymbol("INVALID-FORT?"), list(makeSymbol("GET-JAVAFIED-NOUN-REFINED-TAG"), makeSymbol("JAVAFIED-NOUN"))), list(makeSymbol("SET-JAVAFIED-NOUN-REFINED-TAG"), makeSymbol("JAVAFIED-NOUN"), list(makeSymbol("CAR"), list(makeSymbol("FIRST"), list(makeSymbol("GET-JAVAFIED-NOUN-CONJECTURES"), makeSymbol("JAVAFIED-NOUN"))))))),
			list(makeSymbol("WARN"), makeString("~S is not a javafied noun"), makeSymbol("JAVAFIED-NOUN"))), list(RET, makeSymbol("JAVAFIED-NOUN")));

	static private final SubLString $str_alt312$_S_is_not_a_javafied_noun = makeString("~S is not a javafied noun");

	private static final SubLSymbol LEARNED_NOUNS_WEED_OUT_INVALID_FORTS_METHOD = makeSymbol("LEARNED-NOUNS-WEED-OUT-INVALID-FORTS-METHOD");

	private static final SubLSymbol DUMP_NOUN_STRINGS_ORDERED_BY_PREVALENCE = makeSymbol("DUMP-NOUN-STRINGS-ORDERED-BY-PREVALENCE");

	static private final SubLList $list_alt315 = list(
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUNS"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("DICTIONARY-OF-NOUNS")))), list(makeSymbol("CSETQ"), makeSymbol("NOUNS"), list(makeSymbol("SORT"), makeSymbol("NOUNS"), list(makeSymbol("FUNCTION"), makeSymbol(">")), list(makeSymbol("FUNCTION"), makeSymbol("NOUN-GET-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD")))),
					list(makeSymbol("WITH-TEXT-FILE"), list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeKeyword("OUTPUT")),
							list(makeSymbol("DO-LIST"), list(makeSymbol("NOUN"), makeSymbol("NOUNS")),
									list(makeSymbol("CLET"), list(list(makeSymbol("COUNT"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN"))))),
											list(makeSymbol("PWHEN"), list(makeSymbol("POSITIVE-NUMBER-P"), makeSymbol("COUNT")), list(makeSymbol("PRINT"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeString("  "), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("COUNT"), makeSymbol("STREAM"))))))),
			list(RET, makeSymbol("FILENAME")));

	private static final SubLSymbol NOUN_GET_TOTAL_COUNT_AS_WHOLE_NOUN_METHOD = makeSymbol("NOUN-GET-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD");

	static private final SubLString $str_alt317$__ = makeString("  ");

	private static final SubLSymbol LEARNED_NOUNS_DUMP_NOUN_STRINGS_ORDERED_BY_PREVALENCE_METHOD = makeSymbol("LEARNED-NOUNS-DUMP-NOUN-STRINGS-ORDERED-BY-PREVALENCE-METHOD");

	private static final SubLSymbol DUMP_KNOWN_NOUNS_WITH_MEANINGS = makeSymbol("DUMP-KNOWN-NOUNS-WITH-MEANINGS");

	static private final SubLList $list_alt320 = list(
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUNS"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("DICTIONARY-OF-NOUNS")))), list(makeSymbol("CSETQ"), makeSymbol("NOUNS"), list(makeSymbol("SORT"), makeSymbol("NOUNS"), list(makeSymbol("FUNCTION"), makeSymbol(">")), list(makeSymbol("FUNCTION"), makeSymbol("NOUN-GET-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD")))), list(makeSymbol("WITH-TEXT-FILE"),
					list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeKeyword("OUTPUT")),
					list(makeSymbol("DO-LIST"), list(makeSymbol("NOUN"), makeSymbol("NOUNS")), list(makeSymbol("PWHEN"), list(makeSymbol("POSITIVE-NUMBER-P"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN")))),
							list(makeSymbol("CLET"), list(list(makeSymbol("MEANING"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-BEST-MEANING-IN-CYC"))))), list(makeSymbol("PWHEN"), makeSymbol("MEANING"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S  ~S~%"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("MEANING")))))))),
			list(RET, makeSymbol("FILENAME")));

	private static final SubLSymbol GET_BEST_MEANING_IN_CYC = makeSymbol("GET-BEST-MEANING-IN-CYC");

	static private final SubLString $str_alt322$_S___S__ = makeString("~S  ~S~%");

	private static final SubLSymbol LEARNED_NOUNS_DUMP_KNOWN_NOUNS_WITH_MEANINGS_METHOD = makeSymbol("LEARNED-NOUNS-DUMP-KNOWN-NOUNS-WITH-MEANINGS-METHOD");

	private static final SubLSymbol DUMP_UNKNOWN_NOUNS_WITH_CONJECTURES = makeSymbol("DUMP-UNKNOWN-NOUNS-WITH-CONJECTURES");

	static private final SubLList $list_alt325 = list(
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUNS"), list(makeSymbol("DICTIONARY-VALUES"),
					makeSymbol("DICTIONARY-OF-NOUNS")))), list(makeSymbol(
							"CSETQ"), makeSymbol("NOUNS"), list(makeSymbol("SORT"), makeSymbol("NOUNS"), list(makeSymbol("FUNCTION"), makeSymbol(">")), list(makeSymbol("FUNCTION"), makeSymbol("NOUN-GET-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD")))),
					list(makeSymbol("WITH-TEXT-FILE"), list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeKeyword("OUTPUT")),
							list(makeSymbol("DO-LIST"), list(makeSymbol("NOUN"), makeSymbol("NOUNS")),
									list(makeSymbol("PWHEN"), list(makeSymbol("POSITIVE-NUMBER-P"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN")))),
											list(makeSymbol("CLET"), list(list(makeSymbol("MEANINGS"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-MEANINGS-IN-CYC"))))),
													list(makeSymbol("PWHEN"), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("MEANINGS")), list(makeSymbol("PRINT"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeString("  "), makeSymbol("STREAM")),
															list(makeSymbol("CLET"), list(list(makeSymbol("TAG"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-REFINED-TAG"))))),
																	list(makeSymbol("PCOND"), list(list(makeSymbol("KB-INDIVIDUAL-P"), makeSymbol("TAG")), list(makeSymbol("PRIN1"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("equals")), makeKeyword("MEANING"), makeSymbol("TAG")), makeSymbol("STREAM"))),
																			list(list(makeSymbol("COLLECTION-P"), makeSymbol("TAG")),
																					list(makeSymbol("CLET"), list(list(makeSymbol("COLL-OR-IND?"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("COLLECTION-OR-INDIVIDUAL?"))))),
																							list(makeSymbol("PIF"), list(EQ, makeSymbol("COLL-OR-IND?"), makeKeyword("INDIVIDUAL")), list(makeSymbol("PRIN1"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("MEANING"), makeSymbol("TAG")), makeSymbol("STREAM")),
																									list(makeSymbol("CLET"), list(list(makeSymbol("ISAS"), list(makeSymbol("GET-SOPHISTICATED-ISAS-BASED-ON-GENLS"), list(makeSymbol("LIST"), makeSymbol("TAG")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"))))),
																											list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("MEANING"), makeSymbol("TAG"))),
																											list(makeSymbol("DO-LIST"), list(makeSymbol("ISA"), makeSymbol("ISAS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("  ~S"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("MEANING"), makeSymbol("ISA")))))))),
																			list(list(makeSymbol("KEYWORDP"), makeSymbol("TAG")), list(makeSymbol("PROGN"))))))))))),
			list(RET, makeSymbol("FILENAME")));

	private static final SubLSymbol GET_MEANINGS_IN_CYC = makeSymbol("GET-MEANINGS-IN-CYC");

	public static final SubLObject $$equals = constant_handles.reader_make_constant_shell(makeString("equals"));

	public static final SubLObject $const330$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"));

	static private final SubLString $str_alt331$_S = makeString("~S");

	static private final SubLString $str_alt332$___S = makeString("  ~S");

	private static final SubLSymbol LEARNED_NOUNS_DUMP_UNKNOWN_NOUNS_WITH_CONJECTURES_METHOD = makeSymbol("LEARNED-NOUNS-DUMP-UNKNOWN-NOUNS-WITH-CONJECTURES-METHOD");

	private static final SubLSymbol LISTIFY_ALL_NOUNS_WITH_COUNTS_FOR_MYSENTIENT = makeSymbol("LISTIFY-ALL-NOUNS-WITH-COUNTS-FOR-MYSENTIENT");

	static private final SubLList $list_alt335 = list(
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUNS"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("DICTIONARY-OF-NOUNS"))), list(makeSymbol("NOUN-COUNT-LIST"))), list(makeSymbol("CSETQ"), makeSymbol("NOUNS"), list(makeSymbol("SORT"), makeSymbol("NOUNS"), list(makeSymbol("FUNCTION"), makeSymbol("<")), list(makeSymbol("FUNCTION"), makeSymbol("NOUN-GET-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD")))),
					list(makeSymbol("DO-LIST"), list(makeSymbol("NOUN"), makeSymbol("NOUNS")), list(makeSymbol("CLET"), list(list(makeSymbol("COUNT"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN"))))),
							list(makeSymbol("PWHEN"), list(makeSymbol("POSITIVE-NUMBER-P"), makeSymbol("COUNT")), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("COUNT")), makeSymbol("NOUN-COUNT-LIST"))))),
					list(RET, makeSymbol("NOUN-COUNT-LIST"))));

	static private final SubLSymbol $sym336$_ = makeSymbol("<");

	private static final SubLSymbol LEARNED_NOUNS_LISTIFY_ALL_NOUNS_WITH_COUNTS_FOR_MYSENTIENT_METHOD = makeSymbol("LEARNED-NOUNS-LISTIFY-ALL-NOUNS-WITH-COUNTS-FOR-MYSENTIENT-METHOD");

	private static final SubLSymbol LISTIFY_KNOWN_NOUNS_WITH_MEANINGS_FOR_MYSENTIENT = makeSymbol("LISTIFY-KNOWN-NOUNS-WITH-MEANINGS-FOR-MYSENTIENT");

	static private final SubLList $list_alt339 = list(makeSymbol("CORPUS"), makeSymbol("CORPUS-MT"), makeSymbol("GRAPHING-MT"));

	static private final SubLList $list_alt340 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("CORPUS"), makeSymbol("CYCL-TERM-P")), list(makeSymbol("IGNORE"), makeSymbol("CORPUS-MT")), list(makeSymbol("CHECK-TYPE"), makeSymbol("GRAPHING-MT"), makeSymbol("CYCL-TERM-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUNS"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("DICTIONARY-OF-NOUNS"))), list(makeSymbol("LISTIFIED-KNOWN-NOUNS"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("NOUNS"), list(makeSymbol("SORT"), makeSymbol("NOUNS"), list(makeSymbol("FUNCTION"), makeSymbol("<")), list(makeSymbol("FUNCTION"), makeSymbol("NOUN-GET-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD")))),
					list(makeSymbol("DO-LIST"), list(makeSymbol("NOUN"), makeSymbol("NOUNS")),
							list(makeSymbol("PWHEN"), list(makeSymbol("POSITIVE-NUMBER-P"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN")))),
									list(makeSymbol("CLET"), list(list(makeSymbol("NOUN-STRING"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-STRING")))), list(makeSymbol("MEANING"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-BEST-MEANING-IN-CYC"))))),
											list(makeSymbol("PWHEN"), makeSymbol("MEANING"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ASSERT-CORPUS-MENTION-FOR-MYSENTIENT")), makeSymbol("MEANING"), makeSymbol("CORPUS"), makeSymbol("GRAPHING-MT"), constant_handles.reader_make_constant_shell(makeString("TheMySentientTermMapperTool"))),
													list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("NOUN-STRING"), makeSymbol("MEANING")), makeSymbol("LISTIFIED-KNOWN-NOUNS")))))),
					list(RET, makeSymbol("LISTIFIED-KNOWN-NOUNS"))));

	private static final SubLSymbol ASSERT_CORPUS_MENTION_FOR_MYSENTIENT = makeSymbol("ASSERT-CORPUS-MENTION-FOR-MYSENTIENT");

	public static final SubLObject $$TheMySentientTermMapperTool = constant_handles.reader_make_constant_shell(makeString("TheMySentientTermMapperTool"));

	static private final SubLSymbol $sym344$LEARNED_NOUNS_LISTIFY_KNOWN_NOUNS_WITH_MEANINGS_FOR_MYSENTIENT_ME = makeSymbol("LEARNED-NOUNS-LISTIFY-KNOWN-NOUNS-WITH-MEANINGS-FOR-MYSENTIENT-METHOD");

	private static final SubLSymbol LISTIFY_UNKNOWN_NOUNS_WITH_CONJECTURES_FOR_MYSENTIENT = makeSymbol("LISTIFY-UNKNOWN-NOUNS-WITH-CONJECTURES-FOR-MYSENTIENT");

	static private final SubLList $list_alt346 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("CORPUS"), makeSymbol("CYCL-TERM-P")), list(makeSymbol("IGNORE"), makeSymbol("CORPUS-MT")), list(makeSymbol("CHECK-TYPE"), makeSymbol("GRAPHING-MT"), makeSymbol("CYCL-TERM-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUNS"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("DICTIONARY-OF-NOUNS"))), list(makeSymbol("LISTIFIED-UNKNOWN-NOUNS"), NIL)),
					list(makeSymbol("CSETQ"), makeSymbol("NOUNS"), list(makeSymbol("SORT"), makeSymbol("NOUNS"), list(makeSymbol("FUNCTION"), makeSymbol("<")), list(makeSymbol("FUNCTION"), makeSymbol("NOUN-GET-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD")))),
					list(makeSymbol("DO-LIST"), list(makeSymbol("NOUN"), makeSymbol("NOUNS")),
							list(makeSymbol("PWHEN"), list(makeSymbol("POSITIVE-NUMBER-P"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN")))),
									list(makeSymbol("CLET"), list(list(makeSymbol("MEANINGS"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-MEANINGS-IN-CYC"))))),
											list(makeSymbol("PWHEN"), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("MEANINGS")),
													list(makeSymbol("CLET"), list(list(makeSymbol("CONJECTURES"), NIL), list(makeSymbol("TAG"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-REFINED-TAG"))))),
															list(makeSymbol("PCOND"), list(list(makeSymbol("KB-INDIVIDUAL-P"), makeSymbol("TAG")), list(makeSymbol("CPUSH"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("equals")), makeKeyword("MEANING"), makeSymbol("TAG")), makeSymbol("CONJECTURES"))),
																	list(list(makeSymbol("COLLECTION-P"), makeSymbol("TAG")),
																			list(makeSymbol("CLET"), list(list(makeSymbol("COLL-OR-IND?"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("COLLECTION-OR-INDIVIDUAL?"))))),
																					list(makeSymbol("PIF"), list(EQ, makeSymbol("COLL-OR-IND?"), makeKeyword("INDIVIDUAL")), list(makeSymbol("CPUSH"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("MEANING"), makeSymbol("TAG")), makeSymbol("CONJECTURES")),
																							list(makeSymbol("CLET"), list(list(makeSymbol("ISAS"), list(makeSymbol("GET-SOPHISTICATED-ISAS-BASED-ON-GENLS"), list(makeSymbol("LIST"), makeSymbol("TAG")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"))))),
																									list(makeSymbol("CPUSH"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("MEANING"), makeSymbol("TAG")), makeSymbol("CONJECTURES")),
																									list(makeSymbol("DO-LIST"), list(makeSymbol("ISA"), makeSymbol("ISAS")), list(makeSymbol("CPUSH"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("MEANING"), makeSymbol("ISA")), makeSymbol("CONJECTURES"))))))),
																	list(list(makeSymbol("KEYWORDP"), makeSymbol("TAG")), list(makeSymbol("PROGN")))),
															list(makeSymbol("CLET"), list(list(makeSymbol("NOUN-STRING"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-STRING"))))),
																	list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("REIFY-UNKNOWN-NOUN-FROM-CORPUS-FOR-MYSENTIENT")), makeSymbol("NOUN-STRING"), makeSymbol("CORPUS"), makeSymbol("GRAPHING-MT"), makeSymbol("CONJECTURES")),
																	list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("NOUN-STRING"), makeSymbol("CONJECTURES")), makeSymbol("LISTIFIED-UNKNOWN-NOUNS")))))))),
					list(RET, makeSymbol("LISTIFIED-UNKNOWN-NOUNS"))));

	private static final SubLSymbol REIFY_UNKNOWN_NOUN_FROM_CORPUS_FOR_MYSENTIENT = makeSymbol("REIFY-UNKNOWN-NOUN-FROM-CORPUS-FOR-MYSENTIENT");

	static private final SubLSymbol $sym348$LEARNED_NOUNS_LISTIFY_UNKNOWN_NOUNS_WITH_CONJECTURES_FOR_MYSENTIE = makeSymbol("LEARNED-NOUNS-LISTIFY-UNKNOWN-NOUNS-WITH-CONJECTURES-FOR-MYSENTIENT-METHOD");

	private static final SubLSymbol LISTIFY_FOR_MYSENTIENT = makeSymbol("LISTIFY-FOR-MYSENTIENT");

	static private final SubLList $list_alt350 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NOUNS"), list(makeSymbol("DICTIONARY-VALUES"), makeSymbol("DICTIONARY-OF-NOUNS"))), list(makeSymbol("LISTIFIED-KNOWN-NOUNS"), NIL), list(makeSymbol("LISTIFIED-UNKNOWN-NOUNS"), NIL)),
			list(makeSymbol("CSETQ"), makeSymbol("NOUNS"), list(makeSymbol("SORT"), makeSymbol("NOUNS"), list(makeSymbol("FUNCTION"), makeSymbol("<")), list(makeSymbol("FUNCTION"), makeSymbol("NOUN-GET-TOTAL-COUNT-AS-WHOLE-NOUN-METHOD")))),
			list(makeSymbol("DO-LIST"), list(makeSymbol("NOUN"), makeSymbol("NOUNS")),
					list(makeSymbol("PWHEN"), list(makeSymbol("POSITIVE-NUMBER-P"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT-AS-WHOLE-NOUN")))),
							list(makeSymbol("CLET"), list(list(makeSymbol("NOUN-STRING"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-STRING")))), list(makeSymbol("MEANING"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-BEST-MEANING-IN-CYC"))))),
									list(makeSymbol("PIF"), makeSymbol("MEANING"), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("NOUN-STRING"), makeSymbol("MEANING")), makeSymbol("LISTIFIED-KNOWN-NOUNS")),
											list(makeSymbol("CLET"), list(list(makeSymbol("CONJECTURES"), NIL), list(makeSymbol("TAG"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-REFINED-TAG"))))),
													list(makeSymbol("PCOND"), list(list(makeSymbol("KB-INDIVIDUAL-P"), makeSymbol("TAG")), list(makeSymbol("CPUSH"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("equals")), makeKeyword("MEANING"), makeSymbol("TAG")), makeSymbol("CONJECTURES"))),
															list(list(makeSymbol("COLLECTION-P"), makeSymbol("TAG")),
																	list(makeSymbol("CLET"), list(list(makeSymbol("COLL-OR-IND?"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("COLLECTION-OR-INDIVIDUAL?"))))),
																			list(makeSymbol("PIF"), list(EQ, makeSymbol("COLL-OR-IND?"), makeKeyword("INDIVIDUAL")), list(makeSymbol("CPUSH"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("MEANING"), makeSymbol("TAG")), makeSymbol("CONJECTURES")),
																					list(makeSymbol("CLET"), list(list(makeSymbol("ISAS"), list(makeSymbol("GET-SOPHISTICATED-ISAS-BASED-ON-GENLS"), list(makeSymbol("LIST"), makeSymbol("TAG")), constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"))))),
																							list(makeSymbol("CPUSH"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("MEANING"), makeSymbol("TAG")), makeSymbol("CONJECTURES")),
																							list(makeSymbol("DO-LIST"), list(makeSymbol("ISA"), makeSymbol("ISAS")), list(makeSymbol("CPUSH"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("MEANING"), makeSymbol("ISA")), makeSymbol("CONJECTURES"))))))),
															list(list(makeSymbol("KEYWORDP"), makeSymbol("TAG")), list(makeSymbol("PROGN")))),
													list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("NOUN-STRING"), makeSymbol("CONJECTURES")), makeSymbol("LISTIFIED-UNKNOWN-NOUNS"))))))),
			list(RET, list(makeSymbol("LIST"), makeSymbol("LISTIFIED-KNOWN-NOUNS"), makeSymbol("LISTIFIED-UNKNOWN-NOUNS")))));

	private static final SubLSymbol LEARNED_NOUNS_LISTIFY_FOR_MYSENTIENT_METHOD = makeSymbol("LEARNED-NOUNS-LISTIFY-FOR-MYSENTIENT-METHOD");

	static private final SubLList $list_alt352 = list(makeSymbol("TERM"), makeSymbol("CORPUS"), makeSymbol("GRAPHING-MT"), makeSymbol("TOOL"));

	static private final SubLList $list_alt353 = list(makeString("Assert that TERM was mentioned (i.e. some NL expression referring to TERM occurred) in CORPUS."), list(makeSymbol("ASSERT-TYPE"), makeSymbol("TERM"), makeSymbol("CYCL-TERM-P")),
			list(makeSymbol("WITH-THE-CYCLIST"), list(constant_handles.reader_make_constant_shell(makeString("TheMySentientSystem"))), list(makeSymbol("MYSE-ASSERT-NOW"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("documentMentions")), makeSymbol("CORPUS"), makeSymbol("TERM")), constant_handles.reader_make_constant_shell(makeString("PCWDataMt"))),
					list(makeSymbol("MYSE-ASSERT-NOW"), list(makeSymbol("MAKE-TERNARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("extractedFromCorpusUsingTool")), makeSymbol("TERM"), makeSymbol("CORPUS"), makeSymbol("TOOL")), constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"))),
					list(makeSymbol("MYSE-ASSERT-NOW"),
							list(makeSymbol("MAKE-TERNARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("glfComponentSemanticsWRTGraph")), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("GLFNodeSemanticsWRTGraphFn")), makeSymbol("TERM"), constant_handles.reader_make_constant_shell(makeString("TheCycOntologyGraph"))), makeSymbol("TERM"),
									constant_handles.reader_make_constant_shell(makeString("TheCycOntologyGraph"))),
							constant_handles.reader_make_constant_shell(makeString("GLFMt"))),
					list(makeSymbol("MYSE-ASSERT-NOW"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("defaultCandidateFocalNodeInSystem")), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("GLFNodeSemanticsWRTGraphFn")), makeSymbol("TERM"), constant_handles.reader_make_constant_shell(makeString("TheCycOntologyGraph"))),
							list(makeSymbol("AIS-FOR"), constant_handles.reader_make_constant_shell(makeString("TheCycOntologyGraph")))), makeSymbol("GRAPHING-MT"))),
			list(RET, makeSymbol("TERM")));

	public static final SubLObject $$TheMySentientSystem = constant_handles.reader_make_constant_shell(makeString("TheMySentientSystem"));

	public static final SubLObject $$documentMentions = constant_handles.reader_make_constant_shell(makeString("documentMentions"));

	public static final SubLObject $$PCWDataMt = constant_handles.reader_make_constant_shell(makeString("PCWDataMt"));

	public static final SubLObject $$extractedFromCorpusUsingTool = constant_handles.reader_make_constant_shell(makeString("extractedFromCorpusUsingTool"));

	public static final SubLObject $$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));

	public static final SubLObject $$glfComponentSemanticsWRTGraph = constant_handles.reader_make_constant_shell(makeString("glfComponentSemanticsWRTGraph"));

	public static final SubLObject $$GLFNodeSemanticsWRTGraphFn = constant_handles.reader_make_constant_shell(makeString("GLFNodeSemanticsWRTGraphFn"));

	public static final SubLObject $$TheCycOntologyGraph = constant_handles.reader_make_constant_shell(makeString("TheCycOntologyGraph"));

	public static final SubLObject $$GLFMt = constant_handles.reader_make_constant_shell(makeString("GLFMt"));

	public static final SubLObject $$defaultCandidateFocalNodeInSystem = constant_handles.reader_make_constant_shell(makeString("defaultCandidateFocalNodeInSystem"));

	private static final SubLSymbol LEARNED_NOUNS_ASSERT_CORPUS_MENTION_FOR_MYSENTIENT_METHOD = makeSymbol("LEARNED-NOUNS-ASSERT-CORPUS-MENTION-FOR-MYSENTIENT-METHOD");

	static private final SubLList $list_alt365 = list(makeSymbol("NOUN-STRING"), makeSymbol("CORPUS"), makeSymbol("GRAPHING-MT"), makeSymbol("CONJECTURES"));

	static private final SubLList $list_alt366 = list(list(makeSymbol("CLET"), list(makeSymbol("NEW-TERM")),
			list(makeSymbol("WITH-THE-CYCLIST"), list(constant_handles.reader_make_constant_shell(makeString("TheMySentientSystem"))), list(makeSymbol("CSETQ"), makeSymbol("NEW-TERM"), list(makeSymbol("MYSE-CREATE"), makeSymbol("NOUN-STRING"))),
					list(makeSymbol("DO-LIST"), list(makeSymbol("CONJECTURE"), makeSymbol("CONJECTURES")),
							list(makeSymbol("CLET"), list(list(makeSymbol("FORMULA"), list(makeSymbol("EXPRESSION-SUBST"), makeSymbol("NEW-TERM"), makeKeyword("MEANING"), makeSymbol("CONJECTURE"), list(makeSymbol("FUNCTION"), EQ)))), list(makeSymbol("MYSE-ASSERT-NOW"), makeSymbol("FORMULA"), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"))))),
					list(makeSymbol("MYSE-ASSERT-NOW"), list(makeSymbol("MAKE-BINARY-FORMULA"), constant_handles.reader_make_constant_shell(makeString("termStrings")), makeSymbol("NEW-TERM"), makeSymbol("NOUN-STRING")), constant_handles.reader_make_constant_shell(makeString("GeneralEnglishMt")))),
			list(makeSymbol("FCM"), list(QUOTE, makeSymbol("LEARNED-NOUNS")), list(QUOTE, makeSymbol("ASSERT-CORPUS-MENTION-FOR-MYSENTIENT")), makeSymbol("NEW-TERM"), makeSymbol("CORPUS"), makeSymbol("GRAPHING-MT"), constant_handles.reader_make_constant_shell(makeString("TheMySentientDefinitionSuggestorTool"))), list(RET, makeSymbol("NEW-TERM"))));

	public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

	public static final SubLObject $const368$TheMySentientDefinitionSuggestorT = constant_handles.reader_make_constant_shell(makeString("TheMySentientDefinitionSuggestorTool"));

	static private final SubLSymbol $sym369$LEARNED_NOUNS_REIFY_UNKNOWN_NOUN_FROM_CORPUS_FOR_MYSENTIENT_METHO = makeSymbol("LEARNED-NOUNS-REIFY-UNKNOWN-NOUN-FROM-CORPUS-FOR-MYSENTIENT-METHOD");

	private static final SubLSymbol COMPILE_RAW_DATA_FROM_TEXT_FILES = makeSymbol("COMPILE-RAW-DATA-FROM-TEXT-FILES");

	static private final SubLList $list_alt371 = list(makeSymbol("SUBJ-PAIRS-FILE"), makeSymbol("OBJ-PAIRS-FILE"), makeSymbol("COMPLEX-NOUNS-FILE"));

	static private final SubLList $list_alt372 = list(list(makeSymbol("ASSERT-TYPE"), makeSymbol("SUBJ-PAIRS-FILE"), makeSymbol("STRINGP")), list(makeSymbol("ASSERT-TYPE"), makeSymbol("OBJ-PAIRS-FILE"), makeSymbol("STRINGP")), list(makeSymbol("ASSERT-TYPE"), makeSymbol("COMPLEX-NOUNS-FILE"), makeSymbol("STRINGP")),
			list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-RAW-DATA-FOR-ARG-FROM-TEXT-FILE")), $SUBJ, makeSymbol("SUBJ-PAIRS-FILE")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-RAW-DATA-FOR-ARG-FROM-TEXT-FILE")), makeKeyword("OBJ"), makeSymbol("OBJ-PAIRS-FILE")),
			list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-COMPLEX-NOUN-DATA-FROM-TEXT-FILE")), makeSymbol("COMPLEX-NOUNS-FILE")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol COMPILE_RAW_DATA_FOR_ARG_FROM_TEXT_FILE = makeSymbol("COMPILE-RAW-DATA-FOR-ARG-FROM-TEXT-FILE");

	private static final SubLSymbol COMPILE_COMPLEX_NOUN_DATA_FROM_TEXT_FILE = makeSymbol("COMPILE-COMPLEX-NOUN-DATA-FROM-TEXT-FILE");

	private static final SubLSymbol LEARNED_NOUNS_COMPILE_RAW_DATA_FROM_TEXT_FILES_METHOD = makeSymbol("LEARNED-NOUNS-COMPILE-RAW-DATA-FROM-TEXT-FILES-METHOD");

	private static final SubLSymbol COMPILE_RAW_DATA_FROM_TEXT_FILES_DIRECTORY = makeSymbol("COMPILE-RAW-DATA-FROM-TEXT-FILES-DIRECTORY");

	static private final SubLList $list_alt379 = list(makeSymbol("INPUT-DIRECTORY"), makeSymbol("SUBJ-PAIRS-FILE-SUFFIX"), makeSymbol("OBJ-PAIRS-FILE-SUFFIX"), makeSymbol("COMPLEX-NOUNS-FILE-SUFFIX"));

	static private final SubLList $list_alt380 = list(list(makeSymbol("ASSERT-TYPE"), makeSymbol("INPUT-DIRECTORY"), makeSymbol("DIRECTORY-P")), list(makeSymbol("ASSERT-TYPE"), makeSymbol("SUBJ-PAIRS-FILE-SUFFIX"), makeSymbol("STRINGP")), list(makeSymbol("ASSERT-TYPE"), makeSymbol("OBJ-PAIRS-FILE-SUFFIX"), makeSymbol("STRINGP")),
			list(makeSymbol("ASSERT-TYPE"), makeSymbol("COMPLEX-NOUNS-FILE-SUFFIX"), makeSymbol("STRINGP")),
			list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEX-NOUNS-FILES"), NIL)),
					list(makeSymbol("DO-DIRECTORY-TREE-FILES"), list(makeSymbol("FILE"), makeSymbol("INPUT-DIRECTORY")),
							list(makeSymbol("PCOND"), list(list(makeSymbol("ENDS-WITH"), makeSymbol("FILE"), makeSymbol("SUBJ-PAIRS-FILE-SUFFIX")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-RAW-DATA-FOR-ARG-FROM-TEXT-FILE")), $SUBJ, makeSymbol("FILE"))),
									list(list(makeSymbol("ENDS-WITH"), makeSymbol("FILE"), makeSymbol("OBJ-PAIRS-FILE-SUFFIX")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-RAW-DATA-FOR-ARG-FROM-TEXT-FILE")), makeKeyword("OBJ"), makeSymbol("FILE"))),
									list(list(makeSymbol("ENDS-WITH"), makeSymbol("FILE"), makeSymbol("COMPLEX-NOUNS-FILE-SUFFIX")), list(makeSymbol("CPUSH"), makeSymbol("FILE"), makeSymbol("COMPLEX-NOUNS-FILES"))), list(T, list(makeSymbol("FORMAT"), T, makeString("~&Ignoring file: ~S~%"), makeSymbol("FILE"))))),
					list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEX-NOUNS-FILE"), makeSymbol("COMPLEX-NOUNS-FILES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-COMPLEX-NOUN-DATA-FROM-TEXT-FILE")), makeSymbol("COMPLEX-NOUNS-FILE")))),
			list(RET, makeSymbol("SELF")));

	static private final SubLString $str_alt381$Processing_directory_tree_files__ = makeString("Processing directory tree files...");

	static private final SubLString $str_alt382$_Directory__ = makeString(" Directory: ");

	static private final SubLString $str_alt383$__Ignoring_file___S__ = makeString("~&Ignoring file: ~S~%");

	private static final SubLSymbol LEARNED_NOUNS_COMPILE_RAW_DATA_FROM_TEXT_FILES_DIRECTORY_METHOD = makeSymbol("LEARNED-NOUNS-COMPILE-RAW-DATA-FROM-TEXT-FILES-DIRECTORY-METHOD");

	private static final SubLSymbol COMPILE_RAW_DATA_FROM_VERBAL_MATCHES_LISTS = makeSymbol("COMPILE-RAW-DATA-FROM-VERBAL-MATCHES-LISTS");

	static private final SubLList $list_alt386 = list(makeSymbol("VERB-SUBJECTS-LIST"), makeSymbol("VERB-OBJECTS-LIST"), makeSymbol("&OPTIONAL"), makeSymbol("NOUNS-WITHOUT-VERBS-LIST"));

	static private final SubLList $list_alt387 = list(list(makeSymbol("IGNORE"), makeSymbol("NOUNS-WITHOUT-VERBS-LIST")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-RAW-DATA-FOR-ARG-FROM-VERBAL-MATCHES-LIST")), $SUBJ, makeSymbol("VERB-SUBJECTS-LIST")),
			list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-RAW-DATA-FOR-ARG-FROM-VERBAL-MATCHES-LIST")), makeKeyword("OBJ"), makeSymbol("VERB-OBJECTS-LIST")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-COMPLEX-NOUN-DATA-FROM-VERBAL-MATCHES-LISTS")), makeSymbol("VERB-SUBJECTS-LIST"), makeSymbol("VERB-OBJECTS-LIST")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol COMPILE_RAW_DATA_FOR_ARG_FROM_VERBAL_MATCHES_LIST = makeSymbol("COMPILE-RAW-DATA-FOR-ARG-FROM-VERBAL-MATCHES-LIST");

	private static final SubLSymbol COMPILE_COMPLEX_NOUN_DATA_FROM_VERBAL_MATCHES_LISTS = makeSymbol("COMPILE-COMPLEX-NOUN-DATA-FROM-VERBAL-MATCHES-LISTS");

	private static final SubLSymbol LEARNED_NOUNS_COMPILE_RAW_DATA_FROM_VERBAL_MATCHES_LISTS_METHOD = makeSymbol("LEARNED-NOUNS-COMPILE-RAW-DATA-FROM-VERBAL-MATCHES-LISTS-METHOD");

	static private final SubLList $list_alt391 = list(makeSymbol("RELATION"), makeSymbol("PAIRS-FILE"));

	static private final SubLList $list_alt392 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FIRST-LINE?"), T)),
			list(makeSymbol("DO-FILE-LINES"), list(makeSymbol("LINE"), makeSymbol("PAIRS-FILE"), makeKeyword("PROGRESS-MESSAGE"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("UNCAPITALIZE-SMART"), list(makeSymbol("TO-STRING"), makeSymbol("RELATION"))), makeString("ect file: "), makeSymbol("PAIRS-FILE"))),
					list(makeSymbol("PIF"), makeSymbol("FIRST-LINE?"), list(makeSymbol("CSETQ"), makeSymbol("FIRST-LINE?"), NIL),
							list(makeSymbol("CDESTRUCTURING-BIND"), cons(makeSymbol("SENTENCE"), makeSymbol("ARG-VERB-PAIRS")), list(makeSymbol("BREAK-WORDS"), makeSymbol("LINE"), list(makeSymbol("FUNCTION"), makeSymbol("NON-TAB-CHAR-P"))), list(makeSymbol("IGNORE"), makeSymbol("SENTENCE")),
									list(makeSymbol("CDOLIST"), list(makeSymbol("PAIR"), makeSymbol("ARG-VERB-PAIRS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("NOUN-STRING-WITH-SUFFIX"), makeSymbol("VERB-WITH-SUFFIX")), list(makeSymbol("BREAK-WORDS"), makeSymbol("PAIR"), list(makeSymbol("FUNCTION"), makeSymbol("NON-SPACE-CHAR-P"))),
											list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-RAW-DATA-FOR-ARG-INT")), makeSymbol("RELATION"), makeSymbol("NOUN-STRING-WITH-SUFFIX"), makeSymbol("VERB-WITH-SUFFIX")))))))),
			list(RET, NIL));

	static private final SubLString $str_alt393$ect_file__ = makeString("ect file: ");

	private static final SubLSymbol NON_TAB_CHAR_P = makeSymbol("NON-TAB-CHAR-P");

	static private final SubLList $list_alt396 = cons(makeSymbol("SENTENCE"), makeSymbol("ARG-VERB-PAIRS"));

	private static final SubLSymbol NON_SPACE_CHAR_P = makeSymbol("NON-SPACE-CHAR-P");

	static private final SubLList $list_alt398 = list(makeSymbol("NOUN-STRING-WITH-SUFFIX"), makeSymbol("VERB-WITH-SUFFIX"));

	private static final SubLSymbol COMPILE_RAW_DATA_FOR_ARG_INT = makeSymbol("COMPILE-RAW-DATA-FOR-ARG-INT");

	private static final SubLSymbol LEARNED_NOUNS_COMPILE_RAW_DATA_FOR_ARG_FROM_TEXT_FILE_METHOD = makeSymbol("LEARNED-NOUNS-COMPILE-RAW-DATA-FOR-ARG-FROM-TEXT-FILE-METHOD");

	static private final SubLList $list_alt401 = list(makeSymbol("RELATION"), makeSymbol("LIST"));

	static private final SubLList $list_alt402 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("ARG-VERB-PAIR"), makeSymbol("LIST")),
			list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("NOUN-HEAD-WITH-SUFFIX"), makeSymbol("VERB-WITH-SUFFIX"), makeSymbol("WHOLE-NOUN"), makeSymbol("DETERMINER"), makeSymbol("CAVEAT")), makeSymbol("ARG-VERB-PAIR"), list(makeSymbol("IGNORE"), makeSymbol("WHOLE-NOUN"), makeSymbol("DETERMINER")),
					list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("CAVEAT"), list(QUOTE, list(makeKeyword("PROBLEM"), makeKeyword("PHRASELESS"), makeKeyword("QP-TREE")))), list(makeSymbol("CSETQ"), makeSymbol("NOUN-HEAD-WITH-SUFFIX"), list(makeSymbol("STRING-SUBSTITUTE"), makeString("-"), makeString(" "), makeSymbol("NOUN-HEAD-WITH-SUFFIX"))),
							list(makeSymbol("CSETQ"), makeSymbol("VERB-WITH-SUFFIX"), list(makeSymbol("STRING-SUBSTITUTE"), makeString("-"), makeString(" "), makeSymbol("VERB-WITH-SUFFIX"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-RAW-DATA-FOR-ARG-INT")), makeSymbol("RELATION"), makeSymbol("NOUN-HEAD-WITH-SUFFIX"), makeSymbol("VERB-WITH-SUFFIX"))))),
			list(RET, NIL));

	static private final SubLList $list_alt403 = list(makeSymbol("NOUN-HEAD-WITH-SUFFIX"), makeSymbol("VERB-WITH-SUFFIX"), makeSymbol("WHOLE-NOUN"), makeSymbol("DETERMINER"), makeSymbol("CAVEAT"));

	static private final SubLList $list_alt404 = list(makeKeyword("PROBLEM"), makeKeyword("PHRASELESS"), makeKeyword("QP-TREE"));

	static private final SubLString $str_alt405$_ = makeString("-");

	static private final SubLString $str_alt406$_ = makeString(" ");

	static private final SubLSymbol $sym407$LEARNED_NOUNS_COMPILE_RAW_DATA_FOR_ARG_FROM_VERBAL_MATCHES_LIST_M = makeSymbol("LEARNED-NOUNS-COMPILE-RAW-DATA-FOR-ARG-FROM-VERBAL-MATCHES-LIST-METHOD");

	static private final SubLList $list_alt408 = list(makeSymbol("RELATION"), makeSymbol("NOUN-STRING-WITH-SUFFIX"), makeSymbol("VERB-WITH-SUFFIX"));

	static private final SubLList $list_alt409 = list(list(makeSymbol("CLET"), list(makeSymbol("ERROR")),
			list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")),
					list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("VERB"), makeSymbol("VERB-POS-SUFFIX")), list(makeSymbol("DETACH-POS-SUFFIX"), makeSymbol("VERB-WITH-SUFFIX")),
							list(makeSymbol("PIF"), list(makeSymbol("CNOT"), list(EQUAL, makeSymbol("VERB-POS-SUFFIX"), makeString("VB"))), list(makeSymbol("WARN"), makeString("The verb ~S does not have the expected suffix '_VB'.  Pair ignored."), makeSymbol("VERB-WITH-SUFFIX")),
									list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NOUN-STRING"), makeSymbol("NOUN-POS-SUFFIX")), list(makeSymbol("DETACH-POS-SUFFIX"), makeSymbol("NOUN-STRING-WITH-SUFFIX")),
											list(makeSymbol("PIF"), list(makeSymbol("CNOT"), list(makeSymbol("COR"), list(EQUAL, makeSymbol("NOUN-POS-SUFFIX"), makeString("NN")), list(EQUAL, makeSymbol("NOUN-POS-SUFFIX"), makeString("NP")))), list(makeSymbol("PROGN")),
													list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), list(makeSymbol("STRING-EQUAL"), makeSymbol("VERB"), makeString("cum")), list(makeSymbol("CSETQ"), makeSymbol("VERB"), makeString("come"))),
															list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("STRING-EQUAL"), makeSymbol("VERB"), makeString("'m")), list(makeSymbol("STRING-EQUAL"), makeSymbol("VERB"), makeString("'s"))), list(makeSymbol("CSETQ"), makeSymbol("VERB"), makeString("be"))),
															list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("NON-ALPHABETIC-STRING?"), makeSymbol("NOUN-STRING")), list(makeSymbol("CLOSED-LEXICAL-CLASS-STRING?"), makeSymbol("NOUN-STRING"))),
																	list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INCREMENT-RELEVANT-COUNTS-FOR-ARG-VERB-RELATION-TRIPLE")), list(makeSymbol("STRING-DOWNCASE"), makeSymbol("NOUN-STRING")), makeSymbol("VERB"), makeSymbol("RELATION"))))))))),
			list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeString("In COMPILE-RAW-DATA-FOR-ARG-INT: ~A"), makeSymbol("ERROR")))), list(RET, NIL));

	static private final SubLString $$$VB = makeString("VB");

	static private final SubLString $str_alt412$The_verb__S_does_not_have_the_exp = makeString("The verb ~S does not have the expected suffix '_VB'.  Pair ignored.");

	static private final SubLString $$$NN = makeString("NN");

	static private final SubLString $$$NP = makeString("NP");

	static private final SubLString $$$cum = makeString("cum");

	static private final SubLString $$$come = makeString("come");

	static private final SubLString $str_alt417$_m = makeString("'m");

	static private final SubLString $str_alt418$_s = makeString("'s");

	static private final SubLString $$$be = makeString("be");

	private static final SubLSymbol INCREMENT_RELEVANT_COUNTS_FOR_ARG_VERB_RELATION_TRIPLE = makeSymbol("INCREMENT-RELEVANT-COUNTS-FOR-ARG-VERB-RELATION-TRIPLE");

	static private final SubLString $str_alt421$In_COMPILE_RAW_DATA_FOR_ARG_INT__ = makeString("In COMPILE-RAW-DATA-FOR-ARG-INT: ~A");

	private static final SubLSymbol LEARNED_NOUNS_COMPILE_RAW_DATA_FOR_ARG_INT_METHOD = makeSymbol("LEARNED-NOUNS-COMPILE-RAW-DATA-FOR-ARG-INT-METHOD");

	static private final SubLList $list_alt423 = list(makeSymbol("NOUN-STRING"), makeSymbol("VERB"), makeSymbol("RELATION"));

	static private final SubLList $list_alt424 = list(makeString("Note that a noun headed by NOUN-STRING (i.e. either the simple noun NOUN-STRING itself or a complex noun headed by it) occurred\n   in the RELATION relation with the verb VERB."),
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUN-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-OR-CREATE-SIMPLE-NOUN")), makeSymbol("NOUN-STRING")))), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("RECORD-OCCURRENCE-WITH-VERB")), makeSymbol("VERB"), makeSymbol("RELATION"))), list(RET, NIL));

	private static final SubLSymbol RECORD_OCCURRENCE_WITH_VERB = makeSymbol("RECORD-OCCURRENCE-WITH-VERB");

	static private final SubLSymbol $sym426$LEARNED_NOUNS_INCREMENT_RELEVANT_COUNTS_FOR_ARG_VERB_RELATION_TRI = makeSymbol("LEARNED-NOUNS-INCREMENT-RELEVANT-COUNTS-FOR-ARG-VERB-RELATION-TRIPLE-METHOD");

	private static final SubLSymbol NOTE_OCCURRENCE_OF_HEAD_NOUN_WITH_NO_VERB = makeSymbol("NOTE-OCCURRENCE-OF-HEAD-NOUN-WITH-NO-VERB");

	static private final SubLList $list_alt428 = list(makeSymbol("HEAD-STRING"));

	static private final SubLList $list_alt429 = list(makeString("Note that a noun headed by HEAD-STRING (i.e. either the simple noun HEAD-STRING itself or a complex noun headed by it) occurred,\n   but not as the subject or direct object of any verb."),
			list(makeSymbol("CLET"), list(list(makeSymbol("NOUN-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-OR-CREATE-SIMPLE-NOUN")), makeSymbol("HEAD-STRING")))), list(makeSymbol("FIM"), makeSymbol("NOUN-OBJECT"), list(QUOTE, makeSymbol("RECORD-OCCURRENCE-WITH-NO-VERB")))), list(RET, NIL));

	private static final SubLSymbol RECORD_OCCURRENCE_WITH_NO_VERB = makeSymbol("RECORD-OCCURRENCE-WITH-NO-VERB");

	private static final SubLSymbol LEARNED_NOUNS_NOTE_OCCURRENCE_OF_HEAD_NOUN_WITH_NO_VERB_METHOD = makeSymbol("LEARNED-NOUNS-NOTE-OCCURRENCE-OF-HEAD-NOUN-WITH-NO-VERB-METHOD");

	static private final SubLList $list_alt432 = list(makeSymbol("COMPLEX-NOUNS-FILE"));

	static private final SubLList $list_alt433 = list(list(makeSymbol("DO-FILE-LINES"), list(makeSymbol("LINE"), makeSymbol("COMPLEX-NOUNS-FILE"), makeKeyword("PROGRESS-MESSAGE"), list(makeSymbol("CCONCATENATE"), makeString("Nouns file: "), makeSymbol("COMPLEX-NOUNS-FILE"))),
			list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("EMPTY-STRING-P"), makeSymbol("LINE")), list(EQL, CHAR_semicolon, list(makeSymbol("FIRST-CHAR"), makeSymbol("LINE")))),
					list(makeSymbol("CLET"), list(makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("HEAD-STRING-WITH-SUFFIX"), makeSymbol("DETERMINER"), makeSymbol("ERROR")),
							list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CDESTRUCTURING-SETQ"), list(makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("HEAD-STRING-WITH-SUFFIX"), makeSymbol("DETERMINER")), list(makeSymbol("BREAK-WORDS"), makeSymbol("LINE"), list(makeSymbol("FUNCTION"), makeSymbol("NON-TAB-CHAR-P")))),
									list(makeSymbol("PUNLESS"), makeSymbol("DETERMINER"), list(makeSymbol("ERROR"), makeString("The line ~S failed to match the pattern (WHOLE-NOUN-STRING HEAD-STRING-WITH-SUFFIX DETERMINER)."), makeSymbol("LINE")))),
							list(makeSymbol("PIF"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeSymbol("ERROR")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-COMPLEX-NOUN-DATA-INT")), makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("HEAD-STRING-WITH-SUFFIX"), makeSymbol("DETERMINER")))))),
			list(RET, NIL));

	static private final SubLString $str_alt434$Nouns_file__ = makeString("Nouns file: ");

	static private final SubLString $str_alt435$The_line__S_failed_to_match_the_p = makeString("The line ~S failed to match the pattern (WHOLE-NOUN-STRING HEAD-STRING-WITH-SUFFIX DETERMINER).");

	private static final SubLSymbol COMPILE_COMPLEX_NOUN_DATA_INT = makeSymbol("COMPILE-COMPLEX-NOUN-DATA-INT");

	private static final SubLSymbol LEARNED_NOUNS_COMPILE_COMPLEX_NOUN_DATA_FROM_TEXT_FILE_METHOD = makeSymbol("LEARNED-NOUNS-COMPILE-COMPLEX-NOUN-DATA-FROM-TEXT-FILE-METHOD");

	static private final SubLList $list_alt438 = list(makeSymbol("VERB-SUBJECT-MATCHES-LIST"), makeSymbol("VERB-OBJECT-MATCHES-LIST"));

	static private final SubLList $list_alt439 = list(
			list(makeSymbol("CDOLIST"), list(makeSymbol("MATCH"), list(makeSymbol("APPEND"), makeSymbol("VERB-SUBJECT-MATCHES-LIST"), makeSymbol("VERB-OBJECT-MATCHES-LIST"))),
					list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("HEAD-STRING-WITH-SUFFIX"), makeSymbol("VERB"), makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("DETERMINER"), makeSymbol("CAVEAT")), makeSymbol("MATCH"), list(makeSymbol("IGNORE"), makeSymbol("VERB")),
							list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("CAVEAT"), list(QUOTE, list(makeKeyword("PROBLEM"), makeKeyword("PHRASELESS"), makeKeyword("QP-TREE")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COMPILE-COMPLEX-NOUN-DATA-INT")), makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("HEAD-STRING-WITH-SUFFIX"), makeSymbol("DETERMINER"))))),
			list(RET, NIL));

	static private final SubLList $list_alt440 = list(makeSymbol("HEAD-STRING-WITH-SUFFIX"), makeSymbol("VERB"), makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("DETERMINER"), makeSymbol("CAVEAT"));

	static private final SubLSymbol $sym441$LEARNED_NOUNS_COMPILE_COMPLEX_NOUN_DATA_FROM_VERBAL_MATCHES_LISTS = makeSymbol("LEARNED-NOUNS-COMPILE-COMPLEX-NOUN-DATA-FROM-VERBAL-MATCHES-LISTS-METHOD");

	static private final SubLList $list_alt442 = list(makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("HEAD-STRING-WITH-SUFFIX"), makeSymbol("DETERMINER"));

	static private final SubLList $list_alt443 = list(
			list(makeSymbol("CLET"), list(makeSymbol("ERROR")),
					list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")),
							list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("HEAD-STRING"), makeSymbol("HEAD-POS-SUFFIX")), list(makeSymbol("DETACH-POS-SUFFIX"), makeSymbol("HEAD-STRING-WITH-SUFFIX")),
									list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(EQUAL, makeSymbol("HEAD-POS-SUFFIX"), makeString("NN")), list(EQUAL, makeSymbol("HEAD-POS-SUFFIX"), makeString("NP"))),
											list(makeSymbol("PUNLESS"), list(makeSymbol("CLOSED-LEXICAL-CLASS-STRING?"), makeSymbol("HEAD-STRING")), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD-NOUN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-NOUN")), makeSymbol("HEAD-STRING")))),
													list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("HEAD-NOUN")), list(makeSymbol("WARN"), makeString("Ignoring data for ~S because its head ~S is not represented."), makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("HEAD-STRING")), list(makeSymbol("CLET"), list(makeSymbol("WHOLE-NOUN-NOUN")),
															list(makeSymbol("PIF"), list(makeSymbol("MULTI-WORD-STRING"), makeSymbol("WHOLE-NOUN-STRING")),
																	list(makeSymbol("CLET"), list(list(makeSymbol("WHOLE-NOUN-STRING-NORMALIZED"), list(makeSymbol("SINGULARIZE-COMPLEX-NOUN"), makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("HEAD-STRING")))),
																			list(makeSymbol("CSETQ"), makeSymbol("WHOLE-NOUN-NOUN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-OR-CREATE-COMPLEX-NOUN")), makeSymbol("WHOLE-NOUN-STRING-NORMALIZED"), makeSymbol("HEAD-NOUN")))),
																	list(makeSymbol("CSETQ"), makeSymbol("WHOLE-NOUN-NOUN"), makeSymbol("HEAD-NOUN"))),
															list(makeSymbol("FIM"), makeSymbol("WHOLE-NOUN-NOUN"), list(QUOTE, makeSymbol("INCREMENT-TOTAL-COUNT-AS-WHOLE-NOUN"))), list(makeSymbol("PWHEN"), list(makeSymbol("PLURAL-FORM-OF?"), makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("HEAD-STRING")), list(makeSymbol("FIM"), makeSymbol("WHOLE-NOUN-NOUN"), list(QUOTE, makeSymbol("INCREMENT-APPEARANCES-AS-PLURAL")))),
															list(makeSymbol("PWHEN"), list(makeSymbol("STRING-IS-POS?"), makeSymbol("DETERMINER"), constant_handles.reader_make_constant_shell(makeString("Determiner"))), list(makeSymbol("FIM"), makeSymbol("WHOLE-NOUN-NOUN"), list(QUOTE, makeSymbol("INCREMENT-APPEARANCES-WITH-DETERMINER")))),
															list(makeSymbol("PWHEN"), list(makeSymbol("CAPITALIZED-STRING-P"), makeSymbol("WHOLE-NOUN-STRING")), list(makeSymbol("FIM"), makeSymbol("WHOLE-NOUN-NOUN"), list(QUOTE, makeSymbol("INCREMENT-APPEARANCES-IN-ALL-CAPS"))),
																	list(makeSymbol("PWHEN"), list(makeSymbol("STRING-EQUAL"), makeSymbol("DETERMINER"), makeString("the")), list(makeSymbol("FIM"), makeSymbol("WHOLE-NOUN-NOUN"), list(QUOTE, makeSymbol("INCREMENT-APPEARANCES-IN-ALL-CAPS-WITH-THE")))))))))))),
					list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeString("In COMPILE-COMPLEX-NOUN-DATA-INT: ~A"), makeSymbol("ERROR")))),
			list(RET, NIL));

	static private final SubLString $str_alt444$Ignoring_data_for__S_because_its_ = makeString("Ignoring data for ~S because its head ~S is not represented.");

	private static final SubLSymbol INCREMENT_TOTAL_COUNT_AS_WHOLE_NOUN = makeSymbol("INCREMENT-TOTAL-COUNT-AS-WHOLE-NOUN");

	private static final SubLSymbol INCREMENT_APPEARANCES_AS_PLURAL = makeSymbol("INCREMENT-APPEARANCES-AS-PLURAL");

	public static final SubLObject $$Determiner = constant_handles.reader_make_constant_shell(makeString("Determiner"));

	private static final SubLSymbol INCREMENT_APPEARANCES_WITH_DETERMINER = makeSymbol("INCREMENT-APPEARANCES-WITH-DETERMINER");

	private static final SubLSymbol INCREMENT_APPEARANCES_IN_ALL_CAPS = makeSymbol("INCREMENT-APPEARANCES-IN-ALL-CAPS");

	static private final SubLString $$$the = makeString("the");

	private static final SubLSymbol INCREMENT_APPEARANCES_IN_ALL_CAPS_WITH_THE = makeSymbol("INCREMENT-APPEARANCES-IN-ALL-CAPS-WITH-THE");

	static private final SubLString $str_alt452$In_COMPILE_COMPLEX_NOUN_DATA_INT_ = makeString("In COMPILE-COMPLEX-NOUN-DATA-INT: ~A");

	private static final SubLSymbol LEARNED_NOUNS_COMPILE_COMPLEX_NOUN_DATA_INT_METHOD = makeSymbol("LEARNED-NOUNS-COMPILE-COMPLEX-NOUN-DATA-INT-METHOD");

	private static final SubLSymbol ACCURACY = makeSymbol("ACCURACY");

	static private final SubLList $list_alt455 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("SAMPLE-SIZE"), makeInteger(100)), list(makeSymbol("COUNT-THRESHOLD"), list(makeSymbol("GET-LEARNED-NOUNS-NOUN-RELEVANCE-COUNT-THRESHOLD"), makeSymbol("SELF"))), list(makeSymbol("GENERALITY-CUTOFF"), makeInteger(230000)));

	static private final SubLList $list_alt456 = list(list(
			makeSymbol("CLET"), list(list(makeSymbol("SCORES"),
					NIL)),
			list(makeSymbol("DO-LEARNED-SIMPLE-NOUNS"), list(makeSymbol("SIMPLE-NOUN"), makeKeyword("COUNT-THRESHOLD"), makeSymbol("COUNT-THRESHOLD")),
					list(makeSymbol("PWHEN"), list(makeSymbol("<"), list(makeSymbol("LENGTH"), makeSymbol("SCORES")), makeSymbol("SAMPLE-SIZE")),
							list(makeSymbol("CLET"), list(list(makeSymbol("DENOTS"), list(makeSymbol("DENOTS-OF-STRING"), list(makeSymbol("GET-NOUN-STRING"), makeSymbol("SIMPLE-NOUN"))))), list(makeSymbol("PWHEN"), list(makeSymbol("SINGLETON?"), makeSymbol("DENOTS")), list(makeSymbol("CLET"), list(list(makeSymbol("DENOT"), list(makeSymbol("FIRST"), makeSymbol("DENOTS")))),
									list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("FORT-P"), makeSymbol("DENOT")), list(makeSymbol("CNOT"), list(makeSymbol("FORT-NOT-PROPERLY-IN-GENLS-HIERARCHY?"), makeSymbol("DENOT")))), list(makeSymbol("CLET"), list(makeSymbol("ALL-TYPES"), list(makeSymbol("TYPES"), NIL)),
											list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("PIF"), list(makeSymbol("COLLECTION-P"), makeSymbol("DENOT")), list(makeSymbol("CSETQ"), makeSymbol("ALL-TYPES"), list(makeSymbol("ALL-GENLS"), makeSymbol("DENOT"))), list(makeSymbol("CSETQ"), makeSymbol("ALL-TYPES"), list(makeSymbol("ALL-ISA"), makeSymbol("DENOT"))))),
											list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE"), makeSymbol("ALL-TYPES")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("COLLECTION-P"), makeSymbol("TYPE")), list(makeSymbol("<"), list(makeSymbol("GENERALITY-ESTIMATE"), makeSymbol("TYPE")), makeSymbol("GENERALITY-CUTOFF"))), list(makeSymbol("CPUSH"), makeSymbol("TYPE"), makeSymbol("TYPES")))),
											list(makeSymbol("PWHEN"), makeSymbol("TYPES"),
													list(makeSymbol("CLET"), list(makeSymbol("BEST-RANKING-AMONG-TYPES"), makeSymbol("BEST-RANKED-TYPE")),
															list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE"), makeSymbol("TYPES")),
																	list(makeSymbol("CLET"), list(list(makeSymbol("RANKING-OF-THIS-TYPE"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-RANKING-OF")), makeSymbol("TYPE")))),
																			list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("RANKING-OF-THIS-TYPE")), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("BEST-RANKING-AMONG-TYPES")), list(makeSymbol("<"), makeSymbol("RANKING-OF-THIS-TYPE"), makeSymbol("BEST-RANKING-AMONG-TYPES")))),
																					list(makeSymbol("CSETQ"), makeSymbol("BEST-RANKING-AMONG-TYPES"), makeSymbol("RANKING-OF-THIS-TYPE"), makeSymbol("BEST-RANKED-TYPE"), makeSymbol("TYPE"))))),
															list(makeSymbol("CPUSH"), makeSymbol("BEST-RANKING-AMONG-TYPES"), makeSymbol("SCORES")), list(makeSymbol("FORMAT"), T, makeString("~%Noun: ~S~%Highest ranked: ~S~%Rank: ~S~%"), list(makeSymbol("GET-NOUN-STRING"), makeSymbol("SIMPLE-NOUN")), makeSymbol("BEST-RANKED-TYPE"), makeSymbol("BEST-RANKING-AMONG-TYPES"))))))))))),
			list(makeSymbol("CLET"), list(list(makeSymbol("NUMBER-TOP-RANKED"), ZERO_INTEGER), list(makeSymbol("NUMBER-IN-TOP-5"), ZERO_INTEGER), list(makeSymbol("NUMBER-IN-TOP-10"), ZERO_INTEGER), list(makeSymbol("NUMBER-IN-TOP-25"), ZERO_INTEGER), list(makeSymbol("NUMBER-IN-TOP-50"), ZERO_INTEGER), list(makeSymbol("NUMBER-UNRANKED"), ZERO_INTEGER)),
					list(makeSymbol("CDOLIST"), list(makeSymbol("SCORE"), makeSymbol("SCORES")),
							list(makeSymbol("PIF"), makeSymbol("SCORE"),
									list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), list(makeSymbol("ZEROP"), makeSymbol("SCORE")), list(makeSymbol("CINC"), makeSymbol("NUMBER-TOP-RANKED"))), list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("SCORE"), FIVE_INTEGER), list(makeSymbol("CINC"), makeSymbol("NUMBER-IN-TOP-5"))),
											list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("SCORE"), TEN_INTEGER), list(makeSymbol("CINC"), makeSymbol("NUMBER-IN-TOP-10"))), list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("SCORE"), makeInteger(25)), list(makeSymbol("CINC"), makeSymbol("NUMBER-IN-TOP-25"))),
											list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("SCORE"), makeInteger(50)), list(makeSymbol("CINC"), makeSymbol("NUMBER-IN-TOP-50")))),
									list(makeSymbol("CINC"), makeSymbol("NUMBER-UNRANKED")))),
					list(new SubLObject[] { makeSymbol("FORMAT"), T, makeString("~%Top ranked: ~S~%In top 5: ~S~%In top 10: ~S~%In top 25: ~S~%In top 50: ~S~%Unranked: ~S~%"), makeSymbol("NUMBER-TOP-RANKED"), makeSymbol("NUMBER-IN-TOP-5"), makeSymbol("NUMBER-IN-TOP-10"), makeSymbol("NUMBER-IN-TOP-25"), makeSymbol("NUMBER-IN-TOP-50"), makeSymbol("NUMBER-UNRANKED") }),
					list(makeSymbol("FORMAT"), T, makeString("~%Sample size: ~S~%"), list(makeSymbol("LENGTH"), makeSymbol("SCORES"))))),
			list(RET, NIL));

	public static final SubLInteger $int$230000 = makeInteger(230000);

	public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

	private static final SubLSymbol GET_RANKING_OF = makeSymbol("GET-RANKING-OF");

	static private final SubLString $str_alt462$__Noun___S__Highest_ranked___S__R = makeString("~%Noun: ~S~%Highest ranked: ~S~%Rank: ~S~%");

	public static final SubLInteger $int$25 = makeInteger(25);

	static private final SubLString $str_alt464$__Top_ranked___S__In_top_5___S__I = makeString("~%Top ranked: ~S~%In top 5: ~S~%In top 10: ~S~%In top 25: ~S~%In top 50: ~S~%Unranked: ~S~%");

	static private final SubLString $str_alt465$__Sample_size___S__ = makeString("~%Sample size: ~S~%");

	private static final SubLSymbol LEARNED_NOUNS_ACCURACY_METHOD = makeSymbol("LEARNED-NOUNS-ACCURACY-METHOD");

	private static final SubLSymbol DUMP_CALCULATED_TAGS = makeSymbol("DUMP-CALCULATED-TAGS");

	static private final SubLList $list_alt468 = list(makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEMPSTEM"), makeString("~/tmp/")));

	static private final SubLList $list_alt469 = list(makeString("Create a file hash table that maps each noun string to its top 20 calculated types.\n   @return file-hash-table-p; maps string -> list of forts"), list(makeSymbol("CHECK-TYPE"), makeSymbol("FILENAME"), makeSymbol("STRINGP")),
			list(makeSymbol("CLET"), list(list(makeSymbol("FHT"), list(makeSymbol("FAST-CREATE-FILE-HASH-TABLE"), makeSymbol("FILENAME"), makeSymbol("TEMPSTEM"), list(makeSymbol("FUNCTION"), EQUAL), makeKeyword("IMAGE-INDEPENDENT-CFASL")))), list(makeSymbol("DO-LEARNED-NOUNS"), list(makeSymbol("NOUN")), list(makeSymbol("CLET"),
					list(list(makeSymbol("NOUN-STRING"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-STRING")))), list(makeSymbol("TOP-N-TAGS"), list(makeSymbol("FIM"), makeSymbol("NOUN"), list(QUOTE, makeSymbol("GET-TOP-N-TAGS")), TWENTY_INTEGER))), list(makeSymbol("FAST-PUT-FILE-HASH-TABLE"), makeSymbol("NOUN-STRING"), makeSymbol("FHT"), makeSymbol("TOP-N-TAGS")))),
					list(makeSymbol("FINALIZE-FAST-CREATE-FILE-HASH-TABLE"), makeSymbol("FHT")), list(RET, makeSymbol("FHT"))));

	static private final SubLString $str_alt470$__tmp_ = makeString("~/tmp/");

	private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

	private static final SubLSymbol LEARNED_NOUNS_DUMP_CALCULATED_TAGS_METHOD = makeSymbol("LEARNED-NOUNS-DUMP-CALCULATED-TAGS-METHOD");

	private static final SubLSymbol CALCULATE_TYPICALITY_SUM_BY_COLLECTION = makeSymbol("CALCULATE-TYPICALITY-SUM-BY-COLLECTION");

	static private final SubLList $list_alt474 = list(makeSymbol("SIMPLE-NOUN"));

	static private final SubLList $list_alt475 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("SIMPLE-NOUN"), makeSymbol("SIMPLE-NOUN-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("COUNT-THRESHOLD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-NOUN-RELEVANCE-COUNT-THRESHOLD")))), list(makeSymbol("TOTAL-COUNT"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-TOTAL-COUNT"))))),
					list(makeSymbol("PIF"), list(makeSymbol("<"), makeSymbol("TOTAL-COUNT"), makeSymbol("COUNT-THRESHOLD")), list(RET, makeKeyword("DONT-CARE")),
							list(makeSymbol("CLET"),
									list(list(makeSymbol("COUNT-AS-SUBJECT-BY-VERB"), list(makeSymbol("GET-SIMPLE-NOUN-COUNT-AS-SUBJECT-BY-VERB"), makeSymbol("SIMPLE-NOUN"))), list(makeSymbol("COUNT-AS-OBJECT-BY-VERB"), list(makeSymbol("GET-SIMPLE-NOUN-COUNT-AS-OBJECT-BY-VERB"), makeSymbol("SIMPLE-NOUN"))),
											list(makeSymbol("TYPICALITY-METRIC"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TYPICALITY-METRIC")))), list(makeSymbol("WEIGHT-SUMMANDS-BY-SELECTIVENESS?"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("WEIGHT-SUMMANDS-BY-SELECTIVENESS?"))))),
									list(RET, list(makeSymbol("TYPICALITY-SUM-BY-COLLECTION-BASED-ON-NOUN-USAGES"), makeSymbol("COUNT-AS-SUBJECT-BY-VERB"), makeSymbol("COUNT-AS-OBJECT-BY-VERB"), makeSymbol("NOUN-RELEVANCE-COUNT-THRESHOLD"), makeSymbol("TYPICALITY-METRIC"), makeSymbol("WEIGHT-SUMMANDS-BY-SELECTIVENESS?")))))));

	private static final SubLSymbol LEARNED_NOUNS_CALCULATE_TYPICALITY_SUM_BY_COLLECTION_METHOD = makeSymbol("LEARNED-NOUNS-CALCULATE-TYPICALITY-SUM-BY-COLLECTION-METHOD");

	private static final SubLSymbol $CANT_TELL = makeKeyword("CANT-TELL");

	public static final SubLObject $$Nothing = constant_handles.reader_make_constant_shell(makeString("Nothing"));

	static private final SubLList $list_alt480 = list(makeSymbol("SIMPLE-NOUN"), makeSymbol("BETTER-TAG"));

	public static final SubLObject $list_alt481 = _constant_481_initializer();

	static private final SubLString $str_alt483$The_method_WHY_NOT_TAGGED_AS_is_o = makeString("The method WHY-NOT-TAGGED-AS is only applicable when the calculate-tag-method is one of ~S.");

	private static final SubLSymbol GET_CALCULATED_TAG = makeSymbol("GET-CALCULATED-TAG");

	static private final SubLString $str_alt485$__The_calculated_tag_for__S_is__S = makeString("~%The calculated tag for ~S is ~S.~%");

	static private final SubLString $str_alt486$____As_subject____S_____S__ = makeString("~%~%As subject:  ~S -> ~S~%");

	static private final SubLString $str_alt487$__typicality_subj__S__S_____S = makeString("~%typicality-subj(~S,~S) = ~S");

	static private final SubLString $str_alt488$__typicality_subj__S__S_____S__ = makeString("~%typicality-subj(~S,~S) = ~S~%");

	static private final SubLString $str_alt489$__Multiplied_by_count_of__S___ = makeString("~%Multiplied by count of ~S:~%");

	static private final SubLString $str_alt490$_S____S__ = makeString("~S:  ~S~%");

	static private final SubLString $str_alt491$__Multiplied_by_selectiveness_wrt = makeString("~%Multiplied by selectiveness-wrt-subject(~S) = ~S~%");

	static private final SubLString $str_alt492$__Total_so_far___ = makeString("~%Total so far:~%");

	static private final SubLString $str_alt493$_________________________________ = makeString("~%~%--------------------------------------------------------------------~%");

	static private final SubLString $str_alt494$____As_object____S_____S__ = makeString("~%~%As object:  ~S -> ~S~%");

	static private final SubLString $str_alt495$__typicality_obj__S__S_____S = makeString("~%typicality-obj(~S,~S) = ~S");

	static private final SubLString $str_alt496$__typicality_obj__S__S_____S__ = makeString("~%typicality-obj(~S,~S) = ~S~%");

	static private final SubLString $str_alt497$__Multiplied_by_selectiveness_wrt = makeString("~%Multiplied by selectiveness-wrt-object(~S) = ~S~%");

	private static final SubLSymbol LEARNED_NOUNS_WHY_NOT_TAGGED_AS_INT_METHOD = makeSymbol("LEARNED-NOUNS-WHY-NOT-TAGGED-AS-INT-METHOD");

	static private final SubLList $list_alt500 = list(makeSymbol("STREAM"));

	static private final SubLList $list_alt501 = list(makeString("This is called by @xref CFASL-OUTPUT-OBJECT.  It is not meant to be called directly.\n   Use the public function @xref CFASL-OUTPUT or the like."), list(makeSymbol("CLET"), list(list(makeSymbol("*WARN-ABOUT-NOUN-SERIALIZATION?*"), NIL)), list(makeSymbol("CFASL-OUTPUT"), makeSymbol("SUPER"), makeSymbol("STREAM"))), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol LEARNED_NOUNS_CFASL_OUTPUT_METHOD = makeSymbol("LEARNED-NOUNS-CFASL-OUTPUT-METHOD");

	static private final SubLList $list_alt504 = list(makeString("This is called by @xref CFASL-INPUT-INSTANCE.  Not meant to be called directly.\n   Use the public function @xref CFASL-INPUT or the like."),
			list(makeSymbol("CLET"), list(list(makeSymbol("LEARNED"), list(makeSymbol("CFASL-INPUT"), makeSymbol("SUPER"), makeSymbol("STREAM")))), list(makeSymbol("DO-LEARNED-NOUNS"), list(makeSymbol("NOUN"), makeKeyword("LEARNED"), makeSymbol("LEARNED")), list(makeSymbol("SET-NOUN-LEARNED"), makeSymbol("NOUN"), makeSymbol("LEARNED")),
					list(makeSymbol("PIF"), list(makeSymbol("SIMPLE-NOUN-P"), makeSymbol("NOUN")), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEX-NOUN-STRINGS"), list(makeSymbol("GET-SIMPLE-NOUN-COMPLEX-NOUNS"), makeSymbol("NOUN"))), list(makeSymbol("COMPLEX-NOUNS"), NIL)),
							list(makeSymbol("CDOLIST"), list(makeSymbol("STRING"), makeSymbol("COMPLEX-NOUN-STRINGS")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("LEARNED"), list(QUOTE, makeSymbol("FIND-NOUN")), makeSymbol("STRING")), makeSymbol("COMPLEX-NOUNS"))), list(makeSymbol("SET-SIMPLE-NOUN-COMPLEX-NOUNS"), makeSymbol("NOUN"), list(makeSymbol("NREVERSE"), makeSymbol("COMPLEX-NOUNS")))),
							list(makeSymbol("SET-COMPLEX-NOUN-HEAD"), makeSymbol("NOUN"), list(makeSymbol("FIM"), makeSymbol("LEARNED"), list(QUOTE, makeSymbol("FIND-NOUN")), list(makeSymbol("GET-COMPLEX-NOUN-HEAD"), makeSymbol("NOUN")))))),
					list(RET, makeSymbol("LEARNED"))));

	private static final SubLSymbol LEARNED_NOUNS_CFASL_INPUT_METHOD = makeSymbol("LEARNED-NOUNS-CFASL-INPUT-METHOD");

	public static final SubLObject $$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));

	private static final SubLSymbol ALL_GENLS_IN_ANY_MT = makeSymbol("ALL-GENLS-IN-ANY-MT");

	// // Internal Constant Initializer Methods
	private static final SubLObject _constant_36_initializer() {
		return list(new SubLObject[] { list(makeSymbol("DEFAULT-MAGIC-NUMBER"), makeKeyword("CLASS"), makeKeyword("VALUE"), makeDouble(0.51), makeKeyword("PUBLIC")), list(makeSymbol("DEFAULT-CALCULATE-TAG-METHOD"), makeKeyword("CLASS"), makeKeyword("VALUE"), makeKeyword("APMI-SUM-WEIGHTED-BY-SELECTIVENESS"), makeKeyword("PUBLIC")),
				list(makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHODS"), makeKeyword("CLASS"), makeKeyword("VALUE"),
						list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST*"), makeKeyword("SA-SUM"), list(makeSymbol("FUNCTION"), makeSymbol("SELECTIONAL-ASSOCIATION")), list(QUOTE, list(NIL))), list(makeSymbol("BQ-LIST*"), makeKeyword("APMI-SUM"), list(makeSymbol("FUNCTION"), makeSymbol("ADJUSTED-POINTWISE-MUTUAL-INFORMATION")), list(QUOTE, list(NIL))),
								list(makeSymbol("BQ-LIST*"), makeKeyword("APMI-SUM-WEIGHTED-BY-SELECTIVENESS"), list(makeSymbol("FUNCTION"), makeSymbol("ADJUSTED-POINTWISE-MUTUAL-INFORMATION")), list(QUOTE, list(T)))),
						makeKeyword("PROTECTED")),
				list(makeSymbol("CALCULATE-TAG-METHODS"), makeKeyword("CLASS"), makeKeyword("VALUE"), list(makeSymbol("APPEND"), list(makeSymbol("ALIST-KEYS"), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEARNED-NOUNS")), list(QUOTE, makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHODS")))), list(QUOTE, list(makeKeyword("BASIC"), makeKeyword("SPS")))), makeKeyword("PROTECTED")),
				list(makeSymbol("DICTIONARY-OF-NOUNS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CALCULATE-TAG-METHOD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NOUN-RELEVANCE-COUNT-THRESHOLD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHOD-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CALCULATE-TAG-METHOD-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ASSOCIATED-TYPICALITY-METRIC"), list(makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHOD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ASSOCIATED-SUMMAND-WEIGHTING?"), list(makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHOD")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REIFY-NOUN-AS"), list(makeSymbol("NOUN-STRING"), makeSymbol("COLLECTION-OR-INDIVIDUAL"), makeSymbol("LIST-OF-TYPES"), makeSymbol("&OPTIONAL"), makeSymbol("GLOSS"), makeSymbol("MT")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("LEXIFY-FORT-AS-NOUN"), list(makeSymbol("FORT"), makeSymbol("NOUN-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LISTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-TAGS"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-UNKNOWN-SIMPLE-NOUN-TAGS-ORDERED-BY-CONFIDENCE"), list(makeSymbol("&OPTIONAL"), makeSymbol("CONFIDENCE-THRESHOLD")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-UNKNOWN-SIMPLE-NOUN-TOP-N-TAGS-ORDERED-BY-CONFIDENCE"), list(makeSymbol("&OPTIONAL"), makeSymbol("N"), makeSymbol("CONFIDENCE-THRESHOLD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANNIHILATE-TAGS"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PURGE-IRRELEVANT-NOUNS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOUN-COUNT"), list(makeSymbol("NOUN-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("RELATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TAG-FOR-NOUN"), list(makeSymbol("NOUN-STRING")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TOP-N-TAGS-FOR-NOUN"), list(makeSymbol("NOUN-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONFIDENCE-LEVEL"), list(makeSymbol("NOUN-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-COUNTS"), list(makeSymbol("SIMPLE-NOUN-STRING")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WHY-NOT-TAGGED-AS"), list(makeSymbol("SIMPLE-NOUN-STRING"), makeSymbol("COLLECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-NOUN"), list(makeSymbol("NOUN-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CALCULATE-TAG-METHOD"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPICALITY-METRIC"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WEIGHT-SUMMANDS-BY-SELECTIVENESS?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NOUN-RELEVANCE-COUNT-THRESHOLD"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SIZE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CALCULATE-TAG-METHOD-TO-DEFAULT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KE-TEXT"), list(makeSymbol("KE-FILE-PATH"), makeSymbol("NOTES-FILE-PATH")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("KE-TEXT-REIFICATION"), list(makeSymbol("CONSTANT-NAME"), makeSymbol("TAG"), makeSymbol("COLLECTION-OR-INDIVIDUAL?"), makeSymbol("STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("KE-TEXT-LEXIFICATION"), list(makeSymbol("LEX-STRING"), makeSymbol("TERM"), makeSymbol("STREAM")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GROUP-NOUNS-INTO-LISTS-FOR-JAVA-TOOL"), list(makeSymbol("&OPTIONAL"), makeSymbol("MIN-LIST-LENGTH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DUMP-NOUN-STRINGS-ORDERED-BY-PREVALENCE"), list(makeSymbol("FILENAME")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DUMP-KNOWN-NOUNS-WITH-MEANINGS"), list(makeSymbol("FILENAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DUMP-UNKNOWN-NOUNS-WITH-CONJECTURES"), list(makeSymbol("FILENAME")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-RAW-DATA-FROM-TEXT-FILES"), list(makeSymbol("SUBJ-PAIRS-FILE"), makeSymbol("OBJ-PAIRS-FILE"), makeSymbol("COMPLEX-NOUNS-FILE")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-RAW-DATA-FROM-TEXT-FILES-DIRECTORY"), list(makeSymbol("INPUT-DIRECTORY"), makeSymbol("SUBJ-PAIRS-FILE-SUFFIX"), makeSymbol("OBJ-PAIRS-FILE-SUFFIX"), makeSymbol("COMPLEX-NOUNS-FILE-SUFFIX")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-RAW-DATA-FOR-ARG-FROM-TEXT-FILE"), list(makeSymbol("RELATION"), makeSymbol("PAIRS-FILE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-COMPLEX-NOUN-DATA-FROM-TEXT-FILE"), list(makeSymbol("COMPLEX-NOUNS-FILE")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-RAW-DATA-FROM-VERBAL-MATCHES-LISTS"), list(makeSymbol("PAIR-OF-LISTS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-RAW-DATA-FOR-ARG-FROM-VERBAL-MATCHES-LIST"), list(makeSymbol("RELATION"), makeSymbol("LIST")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-COMPLEX-NOUN-DATA-FROM-VERBAL-MATCHES-LISTS"), list(makeSymbol("VERB-SUBJECT-MATCHES-LIST"), makeSymbol("VERB-OBJECT-MATCHES-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACCURACY"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-RAW-DATA-FOR-ARG-INT"), list(makeSymbol("RELATION"), makeSymbol("NOUN-STRING-WITH-SUFFIX"), makeSymbol("VERB-WITH-SUFFIX")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-COMPLEX-NOUN-DATA-INT"), list(makeSymbol("WHOLE-NOUN-STRING"), makeSymbol("HEAD-STRING-WITH-SUFFIX"), makeSymbol("DETERMINER")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCREMENT-RELEVANT-COUNTS-FOR-ARG-VERB-RELATION-TRIPLE"), list(makeSymbol("NOUN-STRING"), makeSymbol("VERB"), makeSymbol("RELATION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTE-OCCURRENCE-OF-HEAD-NOUN-WITH-NO-VERB"), list(makeSymbol("HEAD-STRING")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCREMENT-OCCURRENCES-OF-WHOLE-NOUN"), list(makeSymbol("WHOLE-NOUN-STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CALCULATE-TYPICALITY-SUM-BY-COLLECTION"), list(makeSymbol("SIMPLE-NOUN")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WHY-NOT-TAGGED-AS-INT"), list(makeSymbol("SIMPLE-NOUN"), makeSymbol("BETTER-TAG")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CFASL-OUTPUT"), list(makeSymbol("STREAM")), makeKeyword("PROTECTED")) });
	}

	private static final SubLObject _constant_481_initializer() {
		return list(list(makeSymbol("CHECK-TYPE"), makeSymbol("BETTER-TAG"), makeSymbol("COLLECTION-P")),
				list(makeSymbol("MUST"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol(
						"TYPICALITY-SUM-CALCULATE-TAG-METHOD-P")), makeSymbol(
								"CALCULATE-TAG-METHOD")),
						makeString("The method WHY-NOT-TAGGED-AS is only applicable when the calculate-tag-method is one of ~S."), list(makeSymbol("ALIST-KEYS"), makeSymbol("TYPICALITY-SUM-CALCULATE-TAG-METHODS"))),
				list(makeSymbol("CLET"), list(list(makeSymbol("CALCULATED-TAG"), list(makeSymbol("FIM"), makeSymbol("SIMPLE-NOUN"), list(QUOTE, makeSymbol("GET-CALCULATED-TAG"))))), list(makeSymbol("FORMAT"), T, makeString("~%The calculated tag for ~S is ~S.~%"), makeSymbol("SIMPLE-NOUN"), makeSymbol("CALCULATED-TAG")),
						list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("KEYWORDP"), makeSymbol("CALCULATED-TAG")), list(EQ, makeSymbol("BETTER-TAG"), makeSymbol("CALCULATED-TAG"))),
								list(makeSymbol("CLET"),
										list(list(makeSymbol("TYPICALITY-METRIC"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TYPICALITY-METRIC")))), list(makeSymbol("VERB-COUNTS-AS-SUBJ"), list(makeSymbol("GET-SIMPLE-NOUN-COUNT-AS-SUBJECT-BY-VERB"), makeSymbol("SIMPLE-NOUN"))),
												list(makeSymbol("VERB-COUNTS-AS-OBJ"), list(makeSymbol("GET-SIMPLE-NOUN-COUNT-AS-OBJECT-BY-VERB"), makeSymbol("SIMPLE-NOUN"))), list(makeSymbol("CALCULATED-TAG-TYPICALITY-SUM"), ZERO_INTEGER), list(makeSymbol("BETTER-TAG-TYPICALITY-SUM"), ZERO_INTEGER)),
										list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("VERB"), makeSymbol("COUNT"), makeSymbol("VERB-COUNTS-AS-SUBJ")),
												list(makeSymbol("CLET"),
														list(list(makeSymbol("CALCULATED-TAG-SUMMAND"), list(makeSymbol("FUNCALL"), makeSymbol("TYPICALITY-METRIC"), makeSymbol("VERB"), makeSymbol("CALCULATED-TAG"), $SUBJ)), list(makeSymbol("BETTER-TAG-SUMMAND"), list(makeSymbol("FUNCALL"), makeSymbol("TYPICALITY-METRIC"), makeSymbol("VERB"), makeSymbol("BETTER-TAG"), $SUBJ)),
																list(makeSymbol("WEIGHT-SUMMANDS-BY-SELECTIVENESS?"), list(EQ, makeSymbol("CALCULATE-TAG-METHOD"), makeKeyword("APMI-SUM-WEIGHTED-BY-SELECTIVENESS")))),
														list(new SubLObject[] { makeSymbol("PWHEN"), makeSymbol("CALCULATED-TAG-SUMMAND"), list(makeSymbol("FORMAT"), T, makeString("~%~%As subject:  ~S -> ~S~%"), makeSymbol("VERB"), makeSymbol("COUNT")), list(makeSymbol("FORMAT"), T, makeString("~%typicality-subj(~S,~S) = ~S"), makeSymbol("VERB"), makeSymbol("CALCULATED-TAG"), makeSymbol("CALCULATED-TAG-SUMMAND")),
																list(makeSymbol("FORMAT"), T, makeString("~%typicality-subj(~S,~S) = ~S~%"), makeSymbol("VERB"), makeSymbol("BETTER-TAG"), makeSymbol("BETTER-TAG-SUMMAND")),
																list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("COUNT"), ONE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CALCULATED-TAG-SUMMAND"), list(makeSymbol("*"), makeSymbol("CALCULATED-TAG-SUMMAND"), makeSymbol("COUNT")), makeSymbol("BETTER-TAG-SUMMAND"), list(makeSymbol("*"), makeSymbol("BETTER-TAG-SUMMAND"), makeSymbol("COUNT"))),
																		list(makeSymbol("FORMAT"), T, makeString("~%Multiplied by count of ~S:~%"), makeSymbol("COUNT")), list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("CALCULATED-TAG"), makeSymbol("CALCULATED-TAG-SUMMAND")), list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("BETTER-TAG"), makeSymbol("BETTER-TAG-SUMMAND"))),
																list(makeSymbol("PWHEN"), makeSymbol("WEIGHT-SUMMANDS-BY-SELECTIVENESS?"),
																		list(makeSymbol("CLET"), list(list(makeSymbol("SELECTIVENESS"), list(makeSymbol("SELECTIVENESS-WRT-SUBJECT"), makeSymbol("VERB")))),
																				list(makeSymbol("CSETQ"), makeSymbol("CALCULATED-TAG-SUMMAND"), list(makeSymbol("*"), makeSymbol("CALCULATED-TAG-SUMMAND"), makeSymbol("SELECTIVENESS")), makeSymbol("BETTER-TAG-SUMMAND"), list(makeSymbol("*"), makeSymbol("BETTER-TAG-SUMMAND"), makeSymbol("SELECTIVENESS"))),
																				list(makeSymbol("FORMAT"), T, makeString("~%Multiplied by selectiveness-wrt-subject(~S) = ~S~%"), makeSymbol("VERB"), makeSymbol("SELECTIVENESS")), list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("CALCULATED-TAG"), makeSymbol("CALCULATED-TAG-SUMMAND")),
																				list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("BETTER-TAG"), makeSymbol("BETTER-TAG-SUMMAND")))),
																list(makeSymbol("CINC"), makeSymbol("CALCULATED-TAG-TYPICALITY-SUM"), makeSymbol("CALCULATED-TAG-SUMMAND")), list(makeSymbol("CINC"), makeSymbol("BETTER-TAG-TYPICALITY-SUM"), makeSymbol("BETTER-TAG-SUMMAND")), list(makeSymbol("FORMAT"), T, makeString("~%Total so far:~%")),
																list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("CALCULATED-TAG"), makeSymbol("CALCULATED-TAG-TYPICALITY-SUM")), list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("BETTER-TAG"), makeSymbol("BETTER-TAG-TYPICALITY-SUM")) }))),
										list(makeSymbol("FORMAT"), T, makeString("~%~%--------------------------------------------------------------------~%")),
										list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("VERB"), makeSymbol("COUNT"), makeSymbol("VERB-COUNTS-AS-OBJ")),
												list(makeSymbol("CLET"),
														list(list(makeSymbol("CALCULATED-TAG-SUMMAND"), list(makeSymbol("FUNCALL"), makeSymbol("TYPICALITY-METRIC"), makeSymbol("VERB"), makeSymbol("CALCULATED-TAG"), makeKeyword("OBJ"))), list(makeSymbol("BETTER-TAG-SUMMAND"), list(makeSymbol("FUNCALL"), makeSymbol("TYPICALITY-METRIC"), makeSymbol("VERB"), makeSymbol("BETTER-TAG"), makeKeyword("OBJ"))),
																list(makeSymbol("WEIGHT-SUMMANDS-BY-SELECTIVENESS?"), list(EQ, makeSymbol("CALCULATE-TAG-METHOD"), makeKeyword("APMI-SUM-WEIGHTED-BY-SELECTIVENESS")))),
														list(new SubLObject[] { makeSymbol("PWHEN"), makeSymbol("CALCULATED-TAG-SUMMAND"), list(makeSymbol("FORMAT"), T, makeString("~%~%As object:  ~S -> ~S~%"), makeSymbol("VERB"), makeSymbol("COUNT")), list(makeSymbol("FORMAT"), T, makeString("~%typicality-obj(~S,~S) = ~S"), makeSymbol("VERB"), makeSymbol("CALCULATED-TAG"), makeSymbol("CALCULATED-TAG-SUMMAND")),
																list(makeSymbol("FORMAT"), T, makeString("~%typicality-obj(~S,~S) = ~S~%"), makeSymbol("VERB"), makeSymbol("BETTER-TAG"), makeSymbol("BETTER-TAG-SUMMAND")),
																list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("COUNT"), ONE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CALCULATED-TAG-SUMMAND"), list(makeSymbol("*"), makeSymbol("CALCULATED-TAG-SUMMAND"), makeSymbol("COUNT")), makeSymbol("BETTER-TAG-SUMMAND"), list(makeSymbol("*"), makeSymbol("BETTER-TAG-SUMMAND"), makeSymbol("COUNT"))),
																		list(makeSymbol("FORMAT"), T, makeString("~%Multiplied by count of ~S:~%"), makeSymbol("COUNT")), list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("CALCULATED-TAG"), makeSymbol("CALCULATED-TAG-SUMMAND")), list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("BETTER-TAG"), makeSymbol("BETTER-TAG-SUMMAND"))),
																list(makeSymbol("PWHEN"), makeSymbol("WEIGHT-SUMMANDS-BY-SELECTIVENESS?"),
																		list(makeSymbol("CLET"), list(list(makeSymbol("SELECTIVENESS"), list(makeSymbol("SELECTIVENESS-WRT-OBJECT"), makeSymbol("VERB")))),
																				list(makeSymbol("CSETQ"), makeSymbol("CALCULATED-TAG-SUMMAND"), list(makeSymbol("*"), makeSymbol("CALCULATED-TAG-SUMMAND"), makeSymbol("SELECTIVENESS")), makeSymbol("BETTER-TAG-SUMMAND"), list(makeSymbol("*"), makeSymbol("BETTER-TAG-SUMMAND"), makeSymbol("SELECTIVENESS"))),
																				list(makeSymbol("FORMAT"), T, makeString("~%Multiplied by selectiveness-wrt-object(~S) = ~S~%"), makeSymbol("VERB"), makeSymbol("SELECTIVENESS")), list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("CALCULATED-TAG"), makeSymbol("CALCULATED-TAG-SUMMAND")),
																				list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("BETTER-TAG"), makeSymbol("BETTER-TAG-SUMMAND")))),
																list(makeSymbol("CINC"), makeSymbol("CALCULATED-TAG-TYPICALITY-SUM"), makeSymbol("CALCULATED-TAG-SUMMAND")), list(makeSymbol("CINC"), makeSymbol("BETTER-TAG-TYPICALITY-SUM"), makeSymbol("BETTER-TAG-SUMMAND")), list(makeSymbol("FORMAT"), T, makeString("~%Total so far:~%")),
																list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("CALCULATED-TAG"), makeSymbol("CALCULATED-TAG-TYPICALITY-SUM")), list(makeSymbol("FORMAT"), T, makeString("~S:  ~S~%"), makeSymbol("BETTER-TAG"), makeSymbol("BETTER-TAG-TYPICALITY-SUM")) })))))),
				list(RET, NIL));
	}

	// // Initializers
	public void declareFunctions() {
		declare_learned_nouns_file();
	}

	public void initializeVariables() {
		init_learned_nouns_file();
	}

	public void runTopLevelForms() {
		setup_learned_nouns_file();
	}
}
