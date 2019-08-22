package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_raw_write_byte;
import static com.cyc.cycjava.cycl.cfasl.register_cfasl_input_function;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$pgia_activeP$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.copy_formula;
import static com.cyc.cycjava.cycl.el_utilities.cycl_subl_symbol_symbol_list;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_any_of_operators_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityGE;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_universal;
import static com.cyc.cycjava.cycl.el_utilities.map_formula_terms;
import static com.cyc.cycjava.cycl.el_utilities.maybe_add_sequence_var_to_end;
import static com.cyc.cycjava.cycl.el_utilities.next_named_var;
import static com.cyc.cycjava.cycl.el_utilities.optimize_el_formula_variable_names;
import static com.cyc.cycjava.cycl.el_utilities.possibly_fo_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_nat_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.string_to_el_var_name;
import static com.cyc.cycjava.cycl.html_utilities.html_escape;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_a;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_y;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nsubstitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.caar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sixth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_utilities extends SubLTranslatedFile {
	public static final SubLFile me = new pph_utilities();

	public static final String myName = "com.cyc.cycjava.cycl.pph_utilities";

	public static final String myFingerPrint = "47f86661ad9bab98420ecf8faad12a7f7bd619dffe5ec03a2df7b79387a7ba41";

	// defconstant
	// Definitions
	private static final SubLSymbol $force_prefix_with_a$ = makeSymbol("*FORCE-PREFIX-WITH-A*");

	// defconstant
	/**
	 * Special strings before which `an' is the proper indefinite article to use.
	 * Strings added to this list should always be lower case.
	 */
	private static final SubLSymbol $prefix_with_an$ = makeSymbol("*PREFIX-WITH-AN*");

	// defconstant
	/**
	 * Special strings before which `a' is the proper indefinite article to use.
	 * Strings added to this list should always be lower case.
	 */
	private static final SubLSymbol $prefix_with_a$ = makeSymbol("*PREFIX-WITH-A*");

	// defvar
	// Always use the names of these constants for generation, no matter what
	public static final SubLSymbol $always_use_names$ = makeSymbol("*ALWAYS-USE-NAMES*");

	// defconstant
	public static final SubLSymbol $pph_default_np_agr_pred$ = makeSymbol("*PPH-DEFAULT-NP-AGR-PRED*");

	// defconstant
	/**
	 * Always use the names of instances of these constants for generation, no
	 * matter what
	 */
	public static final SubLSymbol $always_use_instances_names$ = makeSymbol("*ALWAYS-USE-INSTANCES-NAMES*");

	// defconstant
	private static final SubLSymbol $pph_remove_spaces_before$ = makeSymbol("*PPH-REMOVE-SPACES-BEFORE*");

	// defconstant
	private static final SubLSymbol $pph_remove_spaces_after$ = makeSymbol("*PPH-REMOVE-SPACES-AFTER*");

	// deflexical
	/**
	 * A representative sample of the KB constants that paraphrase module depends
	 * on.
	 */
	private static final SubLSymbol $paraphrase_core_constants$ = makeSymbol("*PARAPHRASE-CORE-CONSTANTS*");

	// defparameter
	/**
	 * This variable is used to keep a stack of keywords that indicate environment
	 * information. Since the generation process is recursive, it's sometimes
	 * helpful (or essential) to know if a call to some function (sometimes the same
	 * function) further up the stack has affected local state.
	 */
	public static final SubLSymbol $pph_current_environment$ = makeSymbol("*PPH-CURRENT-ENVIRONMENT*");

	// deflexical
	private static final SubLSymbol $resourced_pph_environment_stacks$ = makeSymbol("*RESOURCED-PPH-ENVIRONMENT-STACKS*");

	// deflexical
	private static final SubLSymbol $resourced_pph_environment_stacks_lock$ = makeSymbol("*RESOURCED-PPH-ENVIRONMENT-STACKS-LOCK*");

	// defparameter
	// A list of all possible, currently supported determiner keys
	private static final SubLSymbol $determiner_keys$ = makeSymbol("*DETERMINER-KEYS*");

	// defparameter
	private static final SubLSymbol $determiner_words$ = makeSymbol("*DETERMINER-WORDS*");

	// deflexical
	// Known acronyms that start with U
	private static final SubLSymbol $ucronyms$ = makeSymbol("*UCRONYMS*");

	// defconstant
	private static final SubLSymbol $pph_case_keywords$ = makeSymbol("*PPH-CASE-KEYWORDS*");

	// defconstant
	private static final SubLSymbol $pph_definiteness_keywords$ = makeSymbol("*PPH-DEFINITENESS-KEYWORDS*");

	// defconstant
	private static final SubLSymbol $pph_definite_english_determiner_types$ = makeSymbol("*PPH-DEFINITE-ENGLISH-DETERMINER-TYPES*");

	// deflexical
	private static final SubLSymbol $pph_var_typing_predicates$ = makeSymbol("*PPH-VAR-TYPING-PREDICATES*");

	// deflexical
	private static final SubLSymbol $pph_word_final_punctuation_chars$ = makeSymbol("*PPH-WORD-FINAL-PUNCTUATION-CHARS*");

	// defconstant
	// Don't capitalize these strings.
	private static final SubLSymbol $pph_strings_to_not_capitalize$ = makeSymbol("*PPH-STRINGS-TO-NOT-CAPITALIZE*");

	// defparameter
	private static final SubLSymbol $pph_unresolvable_indexicals$ = makeSymbol("*PPH-UNRESOLVABLE-INDEXICALS*");

	// deflexical
	private static final SubLSymbol $pph_subject_role_preds$ = makeSymbol("*PPH-SUBJECT-ROLE-PREDS*");

	// defconstant
	// The template that, when applied to something, returns the thing itself
	private static final SubLSymbol $pph_identity_template$ = makeSymbol("*PPH-IDENTITY-TEMPLATE*");

	// defconstant
	// The template that, when applied to something, errors.
	private static final SubLSymbol $pph_impossible_template$ = makeSymbol("*PPH-IMPOSSIBLE-TEMPLATE*");

	// defparameter
	private static final SubLSymbol $resolve_arg_position_specifiersP$ = makeSymbol("*RESOLVE-ARG-POSITION-SPECIFIERS?*");

	// defparameter
	private static final SubLSymbol $pph_query_stack$ = makeSymbol("*PPH-QUERY-STACK*");

	// defparameter
	private static final SubLSymbol $pph_query_stack_max_size$ = makeSymbol("*PPH-QUERY-STACK-MAX-SIZE*");

	// deflexical
	private static final SubLSymbol $pph_inference_destroyer_grace_period$ = makeSymbol("*PPH-INFERENCE-DESTROYER-GRACE-PERIOD*");

	// defparameter
	public static final SubLSymbol $pph_query_cumulative_time$ = makeSymbol("*PPH-QUERY-CUMULATIVE-TIME*");

	// defparameter
	private static final SubLSymbol $verify_pph_removal_ask_booleanP$ = makeSymbol("*VERIFY-PPH-REMOVAL-ASK-BOOLEAN?*");

	// defparameter
	// ALIST-P of variable->new-name mappings
	private static final SubLSymbol $pph_optimized_vars$ = makeSymbol("*PPH-OPTIMIZED-VARS*");

	// deflexical
	private static final SubLSymbol $pph_optimized_var_name_max_length$ = makeSymbol("*PPH-OPTIMIZED-VAR-NAME-MAX-LENGTH*");

	// defparameter
	private static final SubLSymbol $optimize_depth$ = makeSymbol("*OPTIMIZE-DEPTH*");

	// defconstant
	private static final SubLSymbol $pph_bullet_chars$ = makeSymbol("*PPH-BULLET-CHARS*");

	// defconstant
	// LISTP of terms that appear only in HL.
	private static final SubLSymbol $pph_hl_only_terms$ = makeSymbol("*PPH-HL-ONLY-TERMS*");

	// deflexical
	private static final SubLSymbol $pph_english_contextP_caching_state$ = makeSymbol("*PPH-ENGLISH-CONTEXT?-CACHING-STATE*");

	// deflexical
	private static final SubLSymbol $pph_prefer_assertionP_caching_state$ = makeSymbol("*PPH-PREFER-ASSERTION?-CACHING-STATE*");

	// defparameter
	private static final SubLSymbol $pph_isa_context$ = makeSymbol("*PPH-ISA-CONTEXT*");

	// deflexical
	private static final SubLSymbol $pph_genl_predicateP_caching_state$ = makeSymbol("*PPH-GENL-PREDICATE?-CACHING-STATE*");

	// defconstant
	public static final SubLSymbol $dtp_pph_nth_phrase$ = makeSymbol("*DTP-PPH-NTH-PHRASE*");

	// defconstant
	private static final SubLSymbol $cfasl_opcode_pph_nth_phrase$ = makeSymbol("*CFASL-OPCODE-PPH-NTH-PHRASE*");

	// deflexical
	private static final SubLSymbol $pph_generation_preds$ = makeSymbol("*PPH-GENERATION-PREDS*");

	// deflexical
	private static final SubLSymbol $pph_genl_categoryP_caching_state$ = makeSymbol("*PPH-GENL-CATEGORY?-CACHING-STATE*");

	// defconstant
	private static final SubLSymbol $pph_np_category$ = makeSymbol("*PPH-NP-CATEGORY*");

	// defconstant
	private static final SubLSymbol $pph_pp_category$ = makeSymbol("*PPH-PP-CATEGORY*");

	// defconstant
	// NL-PREDS that allow for any lexical form.
	private static final SubLSymbol $pph_failsafe_nl_preds$ = makeSymbol("*PPH-FAILSAFE-NL-PREDS*");

	// deflexical
	private static final SubLSymbol $pph_default_agr_preds_for_type_pred$ = makeSymbol("*PPH-DEFAULT-AGR-PREDS-FOR-TYPE-PRED*");

	// defconstant
	private static final SubLSymbol $pph_agr_constraint_types$ = makeSymbol("*PPH-AGR-CONSTRAINT-TYPES*");

	// defconstant
	// AGR-CONSTRAINT types shared between a phrase and its syntactic head dtr
	private static final SubLSymbol $pph_inheritable_agr_constraint_types$ = makeSymbol("*PPH-INHERITABLE-AGR-CONSTRAINT-TYPES*");

	// defconstant
	// AGR-CONSTRAINT types that don't specify agreement with another phrase
	private static final SubLSymbol $pph_absolute_agr_constraint_types$ = makeSymbol("*PPH-ABSOLUTE-AGR-CONSTRAINT-TYPES*");

	// defconstant
	// AGR-CONSTRAINT types that specify agreement with another phrase
	private static final SubLSymbol $pph_relative_agr_constraint_types$ = makeSymbol("*PPH-RELATIVE-AGR-CONSTRAINT-TYPES*");

	// defconstant
	private static final SubLSymbol $pph_open_tag_grep_regex$ = makeSymbol("*PPH-OPEN-TAG-GREP-REGEX*");

	// defconstant
	private static final SubLSymbol $pph_close_tag_grep_regex$ = makeSymbol("*PPH-CLOSE-TAG-GREP-REGEX*");

	// deflexical
	private static final SubLSymbol $pph_regex_availableP$ = makeSymbol("*PPH-REGEX-AVAILABLE?*");

	// defconstant
	/**
	 * What the Arg-Position slot of a PPH phrase is set to if we don't know what
	 * arg it denotes.
	 */
	private static final SubLSymbol $pph_unknown_arg_position$ = makeSymbol("*PPH-UNKNOWN-ARG-POSITION*");

	// deflexical
	private static final SubLSymbol $pph_identity_map$ = makeSymbol("*PPH-IDENTITY-MAP*");

	// defconstant
	private static final SubLSymbol $pph_mt_scope_predicates$ = makeSymbol("*PPH-MT-SCOPE-PREDICATES*");

	// defparameter
	public static final SubLSymbol $pph_null_mt_scope$ = makeSymbol("*PPH-NULL-MT-SCOPE*");

	// defparameter
	public static final SubLSymbol $all_pretty_strings_soft_timeout$ = makeSymbol("*ALL-PRETTY-STRINGS-SOFT-TIMEOUT*");

	// defparameter
	public static final SubLSymbol $all_pretty_strings_hard_timeout$ = makeSymbol("*ALL-PRETTY-STRINGS-HARD-TIMEOUT*");

	// defparameter
	public static final SubLSymbol $all_pretty_strings_max_number$ = makeSymbol("*ALL-PRETTY-STRINGS-MAX-NUMBER*");

	// deflexical
	private static final SubLSymbol $pretty_string_generation_mt$ = makeSymbol("*PRETTY-STRING-GENERATION-MT*");

	// Internal Constants
	public static final SubLList $list0 = list(makeString("herbi"), makeString("mcd"));

	public static final SubLList $list1 = list(makeString("herb"), makeString("su-"), makeString("unide"), makeString("unin"), makeString("hono"), makeString("hour"), makeString("ush"), makeString("oner"));

	public static final SubLList $list2 = list(new SubLObject[] { makeString("rhy"), makeString("rha"), makeString("rhi"), makeString("rhe"), makeString("rho"), makeString("uni"), makeString("una"), makeString("us"), makeString("uti"), makeString("ute"), makeString("utop"), makeString("uri"), makeString("ura"), makeString("eu"), makeString("one"), makeString("u."), makeString("ub") });

	private static final SubLObject $$nonPlural_Generic = reader_make_constant_shell(makeString("nonPlural-Generic"));

	public static final SubLList $list4 = list(makeString(","), makeString(" "), makeString("]"), makeString("'s"), makeString("%"), makeString(";"), makeString(": "));

	public static final SubLList $list5 = list(makeString("["));

	public static final SubLSymbol $pph_nbar_nart$ = makeSymbol("*PPH-NBAR-NART*");

	public static final SubLList $list7 = list(reader_make_constant_shell(makeString("PhraseFn-Bar1")), reader_make_constant_shell(makeString("Noun")));

	public static final SubLList $list8 = list(reader_make_constant_shell(makeString("genTemplate")), reader_make_constant_shell(makeString("genFormat")), reader_make_constant_shell(makeString("ParaphraseMt")), reader_make_constant_shell(makeString("FormulaArgFn")), reader_make_constant_shell(makeString("generateQuantOverArg")));

	public static final SubLSymbol $sym9$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

	public static final SubLSymbol PPH_PUSH_ENVIRONMENT = makeSymbol("PPH-PUSH-ENVIRONMENT");

	public static final SubLSymbol WITH_PARAPHRASE_CONTEXT = makeSymbol("WITH-PARAPHRASE-CONTEXT");

	public static final SubLString $str12$__Pushing__S_onto_ENVIRONMENT___S = makeString("~&Pushing ~S onto ENVIRONMENT: ~S -> ");

	public static final SubLString $str13$_S__ = makeString("~S~%");

	public static final SubLSymbol PPH_POP_ENVIRONMENT = makeSymbol("PPH-POP-ENVIRONMENT");

	public static final SubLString $str15$__Popping_ENVIRONMENT___S____ = makeString("~&Popping ENVIRONMENT: ~S -> ");

	private static final SubLString $$$Resourced_PPH_Environment_Stacks = makeString("Resourced PPH Environment Stacks");

	private static final SubLSymbol FIND_OR_CREATE_PPH_CONTEXT = makeSymbol("FIND-OR-CREATE-PPH-CONTEXT");

	private static final SubLList $list18 = list(makeSymbol("KEYWORD"), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLList $list20 = list(list(makeSymbol("*PPH-CURRENT-ENVIRONMENT*"), list(makeSymbol("FIND-OR-CREATE-PPH-CONTEXT"))));

	private static final SubLList $list22 = list(list(makeSymbol("PPH-POP-ENVIRONMENT")));

	private static final SubLString $str23$__Checking_environment_for__S___S = makeString("~&Checking environment for ~S: ~S~%");

	private static final SubLString $str24$__Changing_paraphrase_precision_f = makeString("~&Changing paraphrase precision from ~S to ~S.~%");

	private static final SubLSymbol GET_GENERIC_ARG = makeSymbol("GET-GENERIC-ARG");

	private static final SubLString $str26$__Changing_precision_from__S_to__ = makeString("~&Changing precision from ~S to ~S.~%");

	private static final SubLList $list27 = list(list(makeSymbol("ARGNUM"), makeSymbol("FORMULA")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol WITH_PARAPHRASE_PRECISION = makeSymbol("WITH-PARAPHRASE-PRECISION");

	private static final SubLSymbol PARAPHRASE_PRECISION_FOR_ARG = makeSymbol("PARAPHRASE-PRECISION-FOR-ARG");

	private static final SubLSymbol PPH_HL_TO_EL = makeSymbol("PPH-HL-TO-EL");

	private static final SubLSymbol PPH_PRECISION_FOR_OBJECT_INT = makeSymbol("PPH-PRECISION-FOR-OBJECT-INT");

	private static final SubLSymbol SELECT_STRING_FOR_TERM = makeSymbol("SELECT-STRING-FOR-TERM");

	private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_STRING = makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING");

	private static final SubLObject $$typedGenlPreds = reader_make_constant_shell(makeString("typedGenlPreds"));

	private static final SubLSymbol PPH_TYPED_GENL_PREDS_VIA_INFERENCE = makeSymbol("PPH-TYPED-GENL-PREDS-VIA-INFERENCE");

	private static final SubLSymbol $sym39$_TGP = makeSymbol("?TGP");

	private static final SubLList $list40 = list(makeKeyword("NOT"), makeKeyword("REMOVAL-REFLEXIVE-ONE-ARG"));

	private static final SubLSymbol $pph_typed_genl_preds_via_inference_caching_state$ = makeSymbol("*PPH-TYPED-GENL-PREDS-VIA-INFERENCE-CACHING-STATE*");

	private static final SubLObject $$genFormat = reader_make_constant_shell(makeString("genFormat"));

	private static final SubLObject $$preferredGenUnit = reader_make_constant_shell(makeString("preferredGenUnit"));

	private static final SubLObject $$genPhrase = reader_make_constant_shell(makeString("genPhrase"));

	private static final SubLObject $$denotation = reader_make_constant_shell(makeString("denotation"));

	private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));

	private static final SubLObject $$Determiner_Definite = reader_make_constant_shell(makeString("Determiner-Definite"));

	private static final SubLObject $$Determiner_Indefinite = reader_make_constant_shell(makeString("Determiner-Indefinite"));

	private static final SubLList $list52 = list(new SubLObject[] { makeKeyword("A"), makeKeyword("AN"), makeKeyword("A-THE-WORD"), makeKeyword("EIN"), makeKeyword("THE"), makeKeyword("THE-THE-WORD"), makeKeyword("ALL"), makeKeyword("ALL-THE-WORD"), makeKeyword("SOME"), makeKeyword("SOME-THE-WORD"), makeKeyword("EVERY"), makeKeyword("EVERY-THE-WORD"), makeKeyword("ANY"), makeKeyword("ANY-THE-WORD"),
			makeKeyword("THAT"), makeKeyword("THAT-THE-WORD"), makeKeyword("THIS"), makeKeyword("THIS-THE-WORD"), makeKeyword("THESE"), makeKeyword("THESE-THE-WORD"), makeKeyword("THOSE"), makeKeyword("THOSE-THE-WORD") });

	private static final SubLList $list53 = list(reader_make_constant_shell(makeString("A-TheWord")), reader_make_constant_shell(makeString("The-TheWord")), reader_make_constant_shell(makeString("All-TheWord")), reader_make_constant_shell(makeString("Some-TheWord")), reader_make_constant_shell(makeString("Every-TheWord")), reader_make_constant_shell(makeString("Any-TheWord")));

	private static final SubLSymbol $sym55$PPH_GENL_PREDICATE_ = makeSymbol("PPH-GENL-PREDICATE?");

	private static final SubLSymbol $sym56$PPH_DETERMINER_ = makeSymbol("PPH-DETERMINER?");

	private static final SubLString $str58$__Adding_determiner__S___ = makeString("~&Adding determiner ~S.~%");

	private static final SubLString $str59$__Couldn_t_find_a_determiner_for_ = makeString("~&Couldn't find a determiner for ~S.~%");

	public static final SubLString $$$_ = makeString(" ");

	private static final SubLObject $$posForms = reader_make_constant_shell(makeString("posForms"));

	private static final SubLString $$$aefhilmnorsx = makeString("aefhilmnorsx");

	private static final SubLList $list63 = list(new SubLObject[] { makeString("uaa"), makeString("uab"), makeString("uae"), makeString("uam"), makeString("uapb"), makeString("uav"), makeString("ublf"), makeString("uc"), makeString("uca"), makeString("ucaa"), makeString("ucf"), makeString("ucla"), makeString("uco"), makeString("ucsc"), makeString("uda"), makeString("udp"), makeString("uff"), makeString("ufo"),
			makeString("ufop"), makeString("ufs"), makeString("uga"), makeString("ugb"), makeString("ugi"), makeString("uh"), makeString("uhl"), makeString("ui"), makeString("uia"), makeString("uid"), makeString("uiu"), makeString("uiuc"), makeString("uk"), makeString("uka"), makeString("ukc"), makeString("uklf"), makeString("ulfa"), makeString("ull"), makeString("ulm"), makeString("ulv"), makeString("umac"),
			makeString("umb"), makeString("umbc"), makeString("umd"), makeString("umda"), makeString("umhb"), makeString("uml"), makeString("umms"), makeString("un"), makeString("una"), makeString("unc"), makeString("unclos"), makeString("unctad"), makeString("und"), makeString("unesco"), makeString("unfccc"), makeString("unficyp"), makeString("unh"), makeString("unhcr"), makeString("uni"), makeString("unicef"),
			makeString("unido"), makeString("unifil"), makeString("unikom"), makeString("unita"), makeString("unitar"), makeString("unk"), makeString("unlv"), makeString("unm"), makeString("unmibh"), makeString("unmih"), makeString("uno"), makeString("unomil"), makeString("unomoz"), makeString("unosom"), makeString("unprofor"), makeString("unsc"), makeString("unscom"), makeString("untso"), makeString("unu"),
			makeString("upds"), makeString("upi"), makeString("upn"), makeString("ups"), makeString("upu"), makeString("ur"), makeString("ura"), makeString("uri"), makeString("url"), makeString("usacap"), makeString("usace"), makeString("usaf"), makeString("usafe"), makeString("usah"), makeString("usaid"), makeString("usar"), makeString("usarak"), makeString("usc"), makeString("uscga"), makeString("usd"),
			makeString("usda"), makeString("usda fs"), makeString("usdafs"), makeString("usdol"), makeString("usdot"), makeString("usf"), makeString("usfs"), makeString("usfws"), makeString("usgs"), makeString("usmc"), makeString("usno"), makeString("uspacom"), makeString("usps"), makeString("uss"), makeString("usstratcom"), makeString("ust"), makeString("usu"), makeString("ut"), makeString("uta"),
			makeString("utep"), makeString("uti"), makeString("utn"), makeString("uto"), makeString("uvf"), makeString("uwa"), makeString("uwec"), makeString("uwg"), makeString("uwlax"), makeString("uwlc"), makeString("uwo"), makeString("uwp"), makeString("uwrf"), makeString("uws"), makeString("uwsp"), makeString("uww"), makeString("ulfbv") });

	private static final SubLSymbol ALPHANUMERIC_CHAR_P = makeSymbol("ALPHANUMERIC-CHAR-P");

	private static final SubLSymbol INTEGER_CHAR_P = makeSymbol("INTEGER-CHAR-P");

	private static final SubLString $str66$Using__a____S_starts_with_one_of_ = makeString("Using \"a\". ~S starts with one of *FORCE-PREFIX-WITH-A*");

	private static final SubLString $str68$Using__an____S_starts_with_one_of = makeString("Using \"an\". ~S starts with one of *PREFIX-WITH-AN*");

	private static final SubLString $str70$Using__a____S_starts_with_one_of_ = makeString("Using \"a\". ~S starts with one of *PREFIX-WITH-A*");

	private static final SubLString $$$u = makeString("u");

	private static final SubLString $str72$Using__a____S_is_an_acronym_start = makeString("Using \"a\". ~S is an acronym starting with \"u\".");

	private static final SubLString $str73$Using__an____S_starts_with_a_vowe = makeString("Using \"an\". ~S starts with a vowel: ~S.");

	private static final SubLString $str74$Using__a____S_starts_with_a_non_v = makeString("Using \"a\". ~S starts with a non-vowel-sounding consonant: ~S.");

	private static final SubLString $str75$Using__an____S_is_one_character_l = makeString("Using \"an\". ~S is one character long and starts with a vowel-sounding consonant: ~S.");

	private static final SubLString $$$sf = makeString("sf");

	private static final SubLString $str77$Using__an____S_starts_with_a_vowe = makeString("Using \"an\". ~S starts with a vowel-sounding consonant, and the second character is not a vowel: ~S.");

	private static final SubLString $str79$Using__an____S_is_an_acronym_star = makeString("Using \"an\". ~S is an acronym starting with ~S.");

	private static final SubLString $str80$Defaulting_to__a__for__S_ = makeString("Defaulting to \"a\" for ~S.");

	private static final SubLList $list81 = list(makeKeyword("NOMINATIVE"), makeKeyword("ACCUSATIVE"));

	private static final SubLString $str82$ = makeString("");

	public static final SubLList $list83 = list(makeSymbol("OPEN"), makeSymbol("CLOSE"));

	private static final SubLList $list84 = cons(makeSymbol("START"), makeSymbol("END"));

	private static final SubLSymbol $sym85$DET_INVISIBLE_CHAR_ = makeSymbol("DET-INVISIBLE-CHAR?");

	private static final SubLList $list86 = list(makeSymbol("DET"), makeSymbol("CASE"));

	private static final SubLSymbol $A_THE_WORD = makeKeyword("A-THE-WORD");

	private static final SubLString $$$an = makeString("an");

	private static final SubLString $$$a = makeString("a");

	private static final SubLSymbol $THE_THE_WORD = makeKeyword("THE-THE-WORD");

	private static final SubLString $$$the = makeString("the");

	private static final SubLSymbol $EVERY_THE_WORD = makeKeyword("EVERY-THE-WORD");

	private static final SubLString $$$every = makeString("every");

	private static final SubLSymbol $SOME_THE_WORD = makeKeyword("SOME-THE-WORD");

	private static final SubLString $$$some = makeString("some");

	private static final SubLSymbol $ALL_THE_WORD = makeKeyword("ALL-THE-WORD");

	private static final SubLString $$$all = makeString("all");

	private static final SubLSymbol $ANY_THE_WORD = makeKeyword("ANY-THE-WORD");

	private static final SubLString $$$any = makeString("any");

	private static final SubLSymbol $THAT_THE_WORD = makeKeyword("THAT-THE-WORD");

	private static final SubLString $$$that = makeString("that");

	private static final SubLSymbol $THIS_THE_WORD = makeKeyword("THIS-THE-WORD");

	private static final SubLString $$$this = makeString("this");

	private static final SubLSymbol $THESE_THE_WORD = makeKeyword("THESE-THE-WORD");

	private static final SubLString $$$these = makeString("these");

	private static final SubLSymbol $THOSE_THE_WORD = makeKeyword("THOSE-THE-WORD");

	private static final SubLString $$$those = makeString("those");

	private static final SubLObject $$singular_Generic = reader_make_constant_shell(makeString("singular-Generic"));

	private static final SubLList $list119 = list(
			new SubLObject[] { makeKeyword("UNIVERSAL"), makeKeyword("INDEFINITE"), makeKeyword("DEFINITE"), makeKeyword("NO"), makeKeyword("ANY"), makeKeyword("DEMONSTRATIVE-CLASSA"), makeKeyword("DEMONSTRATIVE-CLASSB"), makeKeyword("DEMONSTRATIVE-CLASSC"), makeKeyword("BACKREFERENCE-CLASSA"), makeKeyword("BACKREFERENCE-CLASSB"), makeKeyword("BACKREFERENCE-CLASSC"), makeKeyword("WHAT") });

	private static final SubLObject $$Place = reader_make_constant_shell(makeString("Place"));

	private static final SubLObject $$ScalarInterval = reader_make_constant_shell(makeString("ScalarInterval"));

	private static final SubLList $list124 = list(reader_make_constant_shell(makeString("PhraseFn")), reader_make_constant_shell(makeString("Determiner")));

	private static final SubLList $list125 = list(reader_make_constant_shell(makeString("Of-TheWord")));

	private static final SubLList $list126 = list(reader_make_constant_shell(makeString("Agent-Generic")), reader_make_constant_shell(makeString("Person")));

	private static final SubLString $$$everything = makeString("everything");

	private static final SubLString $$$something = makeString("something");

	private static final SubLString $$$it = makeString("it");

	private static final SubLString $$$that_thing = makeString("that thing");

	private static final SubLString $$$nothing = makeString("nothing");

	private static final SubLString $$$anything = makeString("anything");

	private static final SubLString $$$what = makeString("what");

	private static final SubLString $str143$_PPH_error_level_ = makeString("(PPH error level ");

	private static final SubLString $str144$__ = makeString(") ");

	private static final SubLString $str145$Don_t_know_how_to_make_thing_stri = makeString("Don't know how to make thing string from ~S. Using 'something'.");

	private static final SubLObject $$singular = reader_make_constant_shell(makeString("singular"));

	private static final SubLString $$$PhraseCycLFn = makeString("PhraseCycLFn");

	private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

	private static final SubLString $$$everyplace = makeString("everyplace");

	private static final SubLString $$$someplace = makeString("someplace");

	private static final SubLString $$$nowhere = makeString("nowhere");

	private static final SubLString $$$anywhere = makeString("anywhere");

	private static final SubLString $$$what_places = makeString("what places");

	private static final SubLString $$$that_place = makeString("that place");

	private static final SubLString $str155$Don_t_know_how_to_make_place_stri = makeString("Don't know how to make place string from ~S.");

	private static final SubLString $$$everyone = makeString("everyone");

	private static final SubLString $$$someone = makeString("someone");

	private static final SubLString $$$noone = makeString("noone");

	private static final SubLString $$$anyone = makeString("anyone");

	private static final SubLString $$$who = makeString("who");

	private static final SubLString $str162$Don_t_know_how_to_make_an_agent_s = makeString("Don't know how to make an agent string from ~S.");

	private static final SubLList $list163 = list(makeKeyword("DEFINITE"), makeKeyword("DEMONSTRATIVE-CLASSA"), makeKeyword("DEMONSTRATIVE-CLASSB"), makeKeyword("DEMONSTRATIVE-CLASSC"), makeKeyword("BACKREFERENCE-CLASSA"), makeKeyword("BACKREFERENCE-CLASSB"), makeKeyword("BACKREFERENCE-CLASSC"));

	private static final SubLList $list164 = list(reader_make_constant_shell(makeString("Every-NLAttr")));

	private static final SubLList $list165 = list(reader_make_constant_shell(makeString("Some-NLAttr")));

	private static final SubLList $list166 = list(reader_make_constant_shell(makeString("Definite-NLAttr")));

	private static final SubLList $list167 = list(makeString("what"));

	private static final SubLList $list168 = list(reader_make_constant_shell(makeString("No-NLAttr")));

	private static final SubLList $list169 = list(reader_make_constant_shell(makeString("Any-NLAttr")));

	private static final SubLList $list170 = list(reader_make_constant_shell(makeString("Demonstrative-ClassA-NLAttr")));

	private static final SubLList $list171 = list(reader_make_constant_shell(makeString("Demonstrative-ClassB-NLAttr")));

	private static final SubLList $list172 = list(reader_make_constant_shell(makeString("Demonstrative-ClassC-NLAttr")));

	private static final SubLList $list173 = list(reader_make_constant_shell(makeString("Backreference-ClassA-NLAttr")));

	private static final SubLList $list174 = list(reader_make_constant_shell(makeString("Backreference-ClassB-NLAttr")));

	private static final SubLList $list175 = list(reader_make_constant_shell(makeString("Backreference-ClassC-NLAttr")));

	private static final SubLObject $$Demonstrative_ClassC_NLAttr = reader_make_constant_shell(makeString("Demonstrative-ClassC-NLAttr"));

	private static final SubLObject $$Demonstrative_ClassB_NLAttr = reader_make_constant_shell(makeString("Demonstrative-ClassB-NLAttr"));

	private static final SubLObject $$Backreference_ClassC_NLAttr = reader_make_constant_shell(makeString("Backreference-ClassC-NLAttr"));

	private static final SubLObject $$Backreference_ClassB_NLAttr = reader_make_constant_shell(makeString("Backreference-ClassB-NLAttr"));

	private static final SubLObject $$SpecsFn = reader_make_constant_shell(makeString("SpecsFn"));

	private static final SubLList $list181 = list(makeString("other"));

	private static final SubLObject $$simpleNounStrings = reader_make_constant_shell(makeString("simpleNounStrings"));

	private static final SubLObject $$NounPhrase = reader_make_constant_shell(makeString("NounPhrase"));

	private static final SubLList $list184 = list(reader_make_constant_shell(makeString("CountNoun")), reader_make_constant_shell(makeString("Instance-TheWord")));

	private static final SubLString $$$of = makeString("of");

	private static final SubLObject $$singular_Feminine = reader_make_constant_shell(makeString("singular-Feminine"));

	private static final SubLString $$$eine = makeString("eine");

	private static final SubLObject $$singular_Masculine = reader_make_constant_shell(makeString("singular-Masculine"));

	private static final SubLString $$$ein = makeString("ein");

	public static final SubLList $list191 = list(list(makeKeyword("OR"), reader_make_constant_shell(makeString("IntervalMinFn")), reader_make_constant_shell(makeString("IntervalMaxFn"))), ONE_INTEGER);

	private static final SubLObject $$plural_Generic = reader_make_constant_shell(makeString("plural-Generic"));

	public static final SubLList $list193 = list(reader_make_constant_shell(makeString("IntervalMinFn")), reader_make_constant_shell(makeString("IntervalMaxFn")));

	private static final SubLObject $$NumericInterval = reader_make_constant_shell(makeString("NumericInterval"));

	public static final SubLList $list195 = list(cons(reader_make_constant_shell(makeString("isa")), makeKeyword("SELF")), cons(reader_make_constant_shell(makeString("rdf-type")), makeKeyword("SELF")), list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("SpecsFn")), makeKeyword("SELF")));

	private static final SubLSymbol PPH_VAR_TYPING_PREDICATES = makeSymbol("PPH-VAR-TYPING-PREDICATES");

	private static final SubLSymbol $pph_var_typing_predicates_caching_state$ = makeSymbol("*PPH-VAR-TYPING-PREDICATES-CACHING-STATE*");

	private static final SubLList $list201 = list(makeSymbol("PRED"), makeSymbol("VAR"), makeSymbol("RAW-TYPE"));

	private static final SubLSymbol ALL_PPH_VAR_TYPING_PREDICATES = makeSymbol("ALL-PPH-VAR-TYPING-PREDICATES");

	private static final SubLList $list204 = cons(makeSymbol("PRED"), makeUninternedSymbol("VALUE"));

	private static final SubLSymbol $all_pph_var_typing_predicates_caching_state$ = makeSymbol("*ALL-PPH-VAR-TYPING-PREDICATES-CACHING-STATE*");

	private static final SubLSymbol CLEAR_ALL_PPH_VAR_TYPING_PREDICATES = makeSymbol("CLEAR-ALL-PPH-VAR-TYPING-PREDICATES");

	private static final SubLSymbol PPH_VAR_TYPE_POSITION = makeSymbol("PPH-VAR-TYPE-POSITION");

	private static final SubLSymbol $pph_var_type_position_caching_state$ = makeSymbol("*PPH-VAR-TYPE-POSITION-CACHING-STATE*");

	private static final SubLSymbol $sym209$PPH_VALID_VAR_TYPE_ = makeSymbol("PPH-VALID-VAR-TYPE?");

	private static final SubLString $$$for_any_ = makeString("for any ");

	private static final SubLString $str211$__it_is_the_case_that_ = makeString(", it is the case that ");

	private static final SubLSymbol PPH_REMOVE_EXTRA_SPACES_INT = makeSymbol("PPH-REMOVE-EXTRA-SPACES-INT");

	private static final SubLInteger $int$250 = makeInteger(250);

	private static final SubLString $str215$____ = makeString(",;:%");

	private static final SubLString $str216$__ = makeString("?.");

	private static final SubLSymbol $sym217$NON_EMPTY_PPH_STRING_ = makeSymbol("NON-EMPTY-PPH-STRING?");

	private static final SubLString $str219$_ = makeString(".");

	private static final SubLString $str220$_ = makeString("?");

	private static final SubLString $str221$__ = makeString("\'\"");

	private static final SubLString $str222$__ = makeString("\"\'");

	public static final SubLList $list223 = list(makeString("pH"), makeString("pOH"));

	private static final SubLSymbol PPH_POSSIBLY_NARTIFY_INTERNAL = makeSymbol("PPH-POSSIBLY-NARTIFY-INTERNAL");

	private static final SubLSymbol RELEVANT_PRED_IS_EVERYTHING = makeSymbol("RELEVANT-PRED-IS-EVERYTHING");

	private static final SubLInteger $int$128 = makeInteger(128);

	private static final SubLSymbol PPH_NART_SUBSTITUTE = makeSymbol("PPH-NART-SUBSTITUTE");

	private static final SubLString $str229$Rephrased_CycL_to__S = makeString("Rephrased CycL to ~S");

	private static final SubLList $list230 = list(makeSymbol("CYCL"), makeSymbol("TEMPLATE"), makeSymbol("JUSTIFICATIONS"), makeSymbol("NEW-TEMPLATE"), makeSymbol("NEW-JUSTS"));

	private static final SubLSymbol PPH_IDENTITY_TEMPLATE_P = makeSymbol("PPH-IDENTITY-TEMPLATE-P");

	private static final SubLString $str234$__Rephrasing__S___ = makeString("~&Rephrasing ~S.~%");

	private static final SubLSymbol PPH_APPLY_TEMPLATE = makeSymbol("PPH-APPLY-TEMPLATE");

	private static final SubLString $str237$New_CycL___S___ = makeString("New CycL: ~S.~%");

	private static final SubLString $str240$Justifications___S___ = makeString("Justifications: ~S.~%");

	private static final SubLSymbol EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");

	private static final SubLList $list242 = list(reader_make_constant_shell(makeString("TheUser")));

	public static final SubLList $list243 = cons(reader_make_constant_shell(makeString("IndexicalReferentFn")), makeKeyword("ANYTHING"));

	private static final SubLSymbol PPH_POSSIBLY_PROCESSABLE_INDEXICAL_P = makeSymbol("PPH-POSSIBLY-PROCESSABLE-INDEXICAL-P");

	private static final SubLSymbol PPH_PROCESS_INDEXICAL = makeSymbol("PPH-PROCESS-INDEXICAL");

	private static final SubLSymbol PPH_FIND_INDEXICAL_TEMPLATE_FOR_DATES = makeSymbol("PPH-FIND-INDEXICAL-TEMPLATE-FOR-DATES");

	private static final SubLSymbol $sym249$PPH_DATE_MATCHES_INDEXICAL_ = makeSymbol("PPH-DATE-MATCHES-INDEXICAL?");

	private static final SubLObject $$Addressee = reader_make_constant_shell(makeString("Addressee"));

	private static final SubLSymbol PPH_INDEXICAL_DATE_P = makeSymbol("PPH-INDEXICAL-DATE-P");

	private static final SubLSymbol PPH_FIND_TEMPLATE_FOR_INDEXICAL_DATES = makeSymbol("PPH-FIND-TEMPLATE-FOR-INDEXICAL-DATES");

	private static final SubLSymbol $sym253$_ABSOLUTE = makeSymbol("?ABSOLUTE");

	private static final SubLObject $$indexicalReferent = reader_make_constant_shell(makeString("indexicalReferent"));

	private static final SubLList $list255 = list(makeSymbol("?ABSOLUTE"));

	private static final SubLSymbol PPH_INDEXICAL_DATES = makeSymbol("PPH-INDEXICAL-DATES");

	private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

	private static final SubLObject $$IndexicalFirstOrderTerm = reader_make_constant_shell(makeString("IndexicalFirstOrderTerm"));

	private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

	private static final SubLString $str266$_A_is_not_a__A = makeString("~A is not a ~A");

	private static final SubLString $$$continue_anyway = makeString("continue anyway");

	private static final SubLString $str271$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

	private static final SubLObject $$Date = reader_make_constant_shell(makeString("Date"));

	private static final SubLString $str273$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

	private static final SubLString $str274$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

	private static final SubLList $list275 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

	private static final SubLString $str276$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

	private static final SubLSymbol $pph_indexical_dates_caching_state$ = makeSymbol("*PPH-INDEXICAL-DATES-CACHING-STATE*");

	private static final SubLSymbol PPH_INDEXICAL_DATE_REFERENT_CACHED = makeSymbol("PPH-INDEXICAL-DATE-REFERENT-CACHED");

	private static final SubLSymbol $sym279$_DATE = makeSymbol("?DATE");

	private static final SubLList $list280 = list(makeSymbol("?DATE"));

	private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

	private static final SubLSymbol $pph_indexical_date_referent_cached_caching_state$ = makeSymbol("*PPH-INDEXICAL-DATE-REFERENT-CACHED-CACHING-STATE*");

	private static final SubLObject $$CalendarDay = reader_make_constant_shell(makeString("CalendarDay"));

	private static final SubLString $str284$Don_t_know_expiration_date_for__S = makeString("Don't know expiration date for ~S.");

	private static final SubLObject $$SubjectRolePredicate = reader_make_constant_shell(makeString("SubjectRolePredicate"));

	private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

	private static final SubLObject $$TheVPParse = reader_make_constant_shell(makeString("TheVPParse"));

	private static final SubLList $list289 = list(ONE_INTEGER, ONE_INTEGER);

	private static final SubLList $list290 = list(ONE_INTEGER, TWO_INTEGER);

	private static final SubLObject $$SomeFn = reader_make_constant_shell(makeString("SomeFn"));

	private static final SubLObject $$StateFn = reader_make_constant_shell(makeString("StateFn"));

	private static final SubLList $list295 = list(ONE_INTEGER, ONE_INTEGER, ONE_INTEGER);

	private static final SubLSymbol PPH_REPHRASE_TEMPLATE_FOR_SUBJ_ROLE_FORMULA = makeSymbol("PPH-REPHRASE-TEMPLATE-FOR-SUBJ-ROLE-FORMULA");

	private static final SubLSymbol $sym297$EL_VAR_ = makeSymbol("EL-VAR?");

	private static final SubLList $list299 = list(list(makeSymbol("FORMULA"), makeSymbol("TEMPLATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym300$IST_MT_STACK = makeUninternedSymbol("IST-MT-STACK");

	private static final SubLList $list301 = list(NIL);

	private static final SubLSymbol PPH_STACK_ISTS = makeSymbol("PPH-STACK-ISTS");

	private static final SubLSymbol PPH_UNSTACK_ISTS = makeSymbol("PPH-UNSTACK-ISTS");

	private static final SubLSymbol PPH_UNPACKING_ISTS = makeSymbol("PPH-UNPACKING-ISTS");

	private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

	private static final SubLList $list307 = list(makeSymbol("CURRENT-IST"), makeSymbol("CURRENT-IST-MT"));

	private static final SubLSymbol UNIVERSAL_INTRODUCTION = makeSymbol("UNIVERSAL-INTRODUCTION");

	private static final SubLSymbol CONJUNCT_REORDERING = makeSymbol("CONJUNCT-REORDERING");

	private static final SubLSymbol $sym311$PPH_PREFER_NUMBERED_JUNCT_ = makeSymbol("PPH-PREFER-NUMBERED-JUNCT?");

	private static final SubLObject $$causeArg = reader_make_constant_shell(makeString("causeArg"));

	private static final SubLObject $$effectArg = reader_make_constant_shell(makeString("effectArg"));

	private static final SubLSymbol $sym314$PPH_VARIABLE__ = makeSymbol("PPH-VARIABLE-<");

	private static final SubLSymbol VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");

	private static final SubLSymbol $sym316$STRING_ = makeSymbol("STRING<");

	private static final SubLObject $$OrderingPredicate = reader_make_constant_shell(makeString("OrderingPredicate"));

	private static final SubLString $str319$__Using_expansion__S_for__S__ = makeString("~&Using expansion ~S for ~S~%");

	private static final SubLObject $$expansion = reader_make_constant_shell(makeString("expansion"));

	private static final SubLObject $$CollectionSubsetFn = reader_make_constant_shell(makeString("CollectionSubsetFn"));

	private static final SubLSymbol $sym325$PPH_BAD_EXPANSION_TEMPLATE_ = makeSymbol("PPH-BAD-EXPANSION-TEMPLATE?");

	private static final SubLInteger $int$24 = makeInteger(24);

	private static final SubLObject $$ModalOperator = reader_make_constant_shell(makeString("ModalOperator"));

	private static final SubLSymbol $sym328$TOU_ATOMIC_SENTENCE_ = makeSymbol("TOU-ATOMIC-SENTENCE?");

	private static final SubLSymbol $sym329$PPH_ARG_POSITION_SPECIFIER_ = makeSymbol("PPH-ARG-POSITION-SPECIFIER?");

	private static final SubLSymbol $PPH_IMPOSSIBLE_TEMPLATE = makeKeyword("PPH-IMPOSSIBLE-TEMPLATE");

	private static final SubLObject $$FormulaArgFn = reader_make_constant_shell(makeString("FormulaArgFn"));

	private static final SubLSymbol PPH_RESOLVE_FORMULA_ARG_NAUTS = makeSymbol("PPH-RESOLVE-FORMULA-ARG-NAUTS");

	private static final SubLString $str336$Don_t_know_how_to_resolve_formula = makeString("Don't know how to resolve formula-arg nauts in ~S");

	private static final SubLList $list337 = list(makeSymbol("ARG-NUM"), makeSymbol("FORMULA"));

	private static final SubLString $str338$Arg_position_contains_non_integer = makeString("Arg-position contains non-integer: ~S");

	private static final SubLString $str339$__Problem_in_PPH_ARG_POSITION_FRO = makeString("~&Problem in PPH-ARG-POSITION-FROM-FORMULA-ARG-NAUT.~%");

	private static final SubLString $str340$Applying_template__S_to_NIL___Cur = makeString("Applying template ~S to NIL.~%Current phrase: ~S");

	private static final SubLString $str341$Applying_null_template_to__S___Cu = makeString("Applying null template to ~S.~%Current phrase: ~S");

	private static final SubLSymbol $pph_apply_template_caching_state$ = makeSymbol("*PPH-APPLY-TEMPLATE-CACHING-STATE*");

	private static final SubLList $list343 = list(makeSymbol("ARGNUM"), makeSymbol("CORE-TEMPLATE"));

	private static final SubLString $str344$Can_t_apply__S_to__S___ = makeString("Can't apply ~S to ~S.~%");

	private static final SubLString $str345$PPH_TEST_DNF_passed_NIL_ = makeString("PPH-TEST-DNF passed NIL.");

	private static final SubLList $list346 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

	private static final SubLString $str347$_S_was_required_to_be_false__but_ = makeString("~S was required to be false, but is true in ~S.");

	private static final SubLString $str349$_S_is_not_known_to_be_true_in__S_ = makeString("~S is not known to be true in ~S.");

	private static final SubLString $str350$__Condition_passed___S = makeString("~&Condition passed: ~S");

	private static final SubLString $str351$__Condition_not_known_true__so_fa = makeString("~&Condition not known true, so failed: ~S");

	private static final SubLString $str352$__Condition_failed___S = makeString("~&Condition failed: ~S");

	private static final SubLSymbol PPH_ASK_LIT = makeSymbol("PPH-ASK-LIT");

	private static final SubLList $list354 = list(reader_make_constant_shell(makeString("equals")), reader_make_constant_shell(makeString("equalSymbols")));

	private static final SubLObject $$termFormulas = reader_make_constant_shell(makeString("termFormulas"));

	private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

	private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

	private static final SubLObject $$quotedFormulaArity = reader_make_constant_shell(makeString("quotedFormulaArity"));

	private static final SubLObject $$natFunction = reader_make_constant_shell(makeString("natFunction"));

	private static final SubLObject $$operatorFormulas = reader_make_constant_shell(makeString("operatorFormulas"));

	private static final SubLList $list361 = list(reader_make_constant_shell(makeString("lengthOfList")), cons(reader_make_constant_shell(makeString("TheList")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")));

	private static final SubLObject $$longerDurationThan = reader_make_constant_shell(makeString("longerDurationThan"));

	private static final SubLList $list363 = list(makeSymbol("THING1"), makeSymbol("THING2"));

	private static final SubLObject $$posPredOfConstituent = reader_make_constant_shell(makeString("posPredOfConstituent"));

	private static final SubLObject $$posOfPhrase = reader_make_constant_shell(makeString("posOfPhrase"));

	private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

	private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

	private static final SubLObject $$generatesAsFirstOrder = reader_make_constant_shell(makeString("generatesAsFirstOrder"));

	private static final SubLSymbol GENERATE_CONSTANT_DEFAULT = makeSymbol("GENERATE-CONSTANT-DEFAULT");

	private static final SubLSymbol $sym371$NAUT_ = makeSymbol("NAUT?");

	private static final SubLObject $$greaterThan = reader_make_constant_shell(makeString("greaterThan"));

	public static final SubLList $list373 = list(reader_make_constant_shell(makeString("DurationFn")), list(makeKeyword("OR"), reader_make_constant_shell(makeString("Always-TimeInterval")),
			cons(list(makeKeyword("OR"), reader_make_constant_shell(makeString("IntervalEndedByFn")), reader_make_constant_shell(makeString("IntervalStartedByFn")), reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")), reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive"))), makeKeyword("ANYTHING"))));

	private static final SubLList $list374 = cons(reader_make_constant_shell(makeString("DurationFn")), makeKeyword("ANYTHING"));

	private static final SubLObject $$DayFn = reader_make_constant_shell(makeString("DayFn"));

	private static final SubLList $list378 = list(reader_make_constant_shell(makeString("DaysDuration")), ONE_INTEGER);

	private static final SubLObject $$MonthFn = reader_make_constant_shell(makeString("MonthFn"));

	private static final SubLList $list380 = list(reader_make_constant_shell(makeString("MonthsDuration")), ONE_INTEGER);

	private static final SubLObject $$YearFn = reader_make_constant_shell(makeString("YearFn"));

	private static final SubLList $list382 = list(reader_make_constant_shell(makeString("YearsDuration")), ONE_INTEGER);

	private static final SubLObject $$TimeIntervalInclusiveFn = reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));

	private static final SubLObject $$TimeIntervalBetweenFn = reader_make_constant_shell(makeString("TimeIntervalBetweenFn"));

	private static final SubLSymbol $sym385$_DUR = makeSymbol("?DUR");

	private static final SubLObject $$duration = reader_make_constant_shell(makeString("duration"));

	private static final SubLList $list387 = list(makeSymbol("?DUR"));

	public static final SubLList $list388 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

	private static final SubLObject $$DurationFn = reader_make_constant_shell(makeString("DurationFn"));

	public static final SubLList $list390 = list(makeSymbol("START"), makeSymbol("END"));

	private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

	private static final SubLObject $$TimeElapsedFn = reader_make_constant_shell(makeString("TimeElapsedFn"));

	private static final SubLList $list393 = cons(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), makeKeyword("ANYTHING"));

	private static final SubLInteger $int$600 = makeInteger(600);

	private static final SubLSymbol $pph_inference_destroyer$ = makeSymbol("*PPH-INFERENCE-DESTROYER*");

	private static final SubLSymbol $sym397$DESTROYABLE_PPH_INFERENCE_ = makeSymbol("DESTROYABLE-PPH-INFERENCE?");

	private static final SubLSymbol PPH_DESTROY_INFERENCE = makeSymbol("PPH-DESTROY-INFERENCE");

	private static final SubLList $list399 = list(list(makeKeyword("TEST"), makeSymbol("INFERENCE-P")), makeKeyword("TEST"), makeSymbol("PROBLEM-STORE-P"));

	private static final SubLSymbol SMITE_DOOMED_PPH_INFERENCES_NEXT_TIME_AROUND = makeSymbol("SMITE-DOOMED-PPH-INFERENCES-NEXT-TIME-AROUND");

	private static final SubLList $list401 = list(list(makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("REAL-INFERENCE")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-P"))), makeKeyword("AND"), list(makeKeyword("BIND"), makeSymbol("REAL-STORE"), list(makeKeyword("TEST"), makeSymbol("PROBLEM-STORE-P"))));

	private static final SubLSymbol REAL_STORE = makeSymbol("REAL-STORE");

	private static final SubLSymbol REAL_INFERENCE = makeSymbol("REAL-INFERENCE");

	private static final SubLSymbol PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");

	private static final SubLSymbol $kw406$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

	private static final SubLString $str408$Asking__S_without_a_valid_cached_ = makeString("Asking ~S without a valid cached PPH problem store: ~S");

	private static final SubLString $str409$Using__S_for_query_ = makeString("Using ~S for query.");

	private static final SubLString $str410$Bad_mt_to_PPH_QUERY___S = makeString("Bad mt to PPH-QUERY: ~S");

	private static final SubLString $str411$Recursive_call_to_PPH_QUERY_on_fo = makeString("Recursive call to PPH-QUERY on formula ~S");

	private static final SubLString $str412$Too_many_nested_calls_to_PPH_QUER = makeString("Too many nested calls to PPH-QUERY: ~S.");

	private static final SubLString $str414$Ill_formed_PPH_query_____S___in__ = makeString("Ill-formed PPH query:~% ~S~% in ~S");

	private static final SubLString $str416$Couldn_t_resolve__S_in__S_seconds = makeString("Couldn't resolve ~S in ~S seconds.~%");

	private static final SubLSymbol PPH_REMOVAL_ASK_VARIABLE = makeSymbol("PPH-REMOVAL-ASK-VARIABLE");

	private static final SubLSymbol PPH_REMOVAL_ASK_BOOLEAN = makeSymbol("PPH-REMOVAL-ASK-BOOLEAN");

	private static final SubLList $list421 = list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("SKSI")));

	private static final SubLString $str422$Inference_Error_while_asking__S__ = makeString("Inference Error while asking ~S:~% ~S");

	private static final SubLSymbol $kw424$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

	private static final SubLString $str425$Inconsistent_removal_ask_results_ = makeString("Inconsistent removal ask results for~% ~S~%REMOVAL-ASK: ~S~%PPH-QUERY: ~S~%");

	private static final SubLSymbol PPH_ASK_BOOLEAN = makeSymbol("PPH-ASK-BOOLEAN");

	private static final SubLSymbol $sym427$_EXIT = makeSymbol("%EXIT");

	private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

	private static final SubLSymbol $kw429$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

	private static final SubLSymbol PPH_ASK_BINDINGS = makeSymbol("PPH-ASK-BINDINGS");

	private static final SubLSymbol PPH_ASK_TEMPLATE_NEW = makeSymbol("PPH-ASK-TEMPLATE-NEW");

	private static final SubLString $str435$Recording__S_as_a_type_level_viol = makeString("Recording ~S as a type-level violation:~% arg ~S of ~S");

	private static final SubLList $list436 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

	private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

	private static final SubLSymbol $sym438$__TERM = makeSymbol("??TERM");

	private static final SubLSymbol $sym439$PPH_SPEC_ = makeSymbol("PPH-SPEC?");

	private static final SubLString $str440$Paraphrasing__S_as_a_type_level_v = makeString("Paraphrasing ~S as a type-level violation.");

	private static final SubLObject $$nameString = reader_make_constant_shell(makeString("nameString"));

	private static final SubLInteger $int$30 = makeInteger(30);

	private static final SubLList $list444 = cons(makeSymbol("VAR"), makeSymbol("NEW-NAME"));

	private static final SubLSymbol $sym446$HLMT_ = makeSymbol("HLMT?");

	private static final SubLSymbol PPH_OPTIMIZED_NAMES_FOR_VARIABLES = makeSymbol("PPH-OPTIMIZED-NAMES-FOR-VARIABLES");

	private static final SubLList $list449 = list(makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), list(makeSymbol("LANGUAGE-MT"), makeSymbol("*PPH-LANGUAGE-MT*")), list(makeSymbol("DOMAIN-MT"), makeSymbol("*PPH-DOMAIN-MT*")), makeSymbol("MINIMIZE-CHANGE-FROM-FORMULA"));

	private static final SubLString $str450$returns_an_association_list_mappi = makeString("returns an association-list mapping between variables in FORMULA and natural-language strings that \n   should be good representations of the argument-types for the variable.");

	private static final SubLList $list451 = list(list(makeSymbol("FORMULA"), makeSymbol("EL-FORMULA-P")), list(makeSymbol("LANGUAGE-MT"), makeSymbol("HLMT?")), list(makeSymbol("DOMAIN-MT"), makeSymbol("HLMT?")), list(makeSymbol("MINIMIZE-CHANGE-FROM-FORMULA"), list(makeSymbol("NIL-OR"), makeSymbol("EL-FORMULA-P"))));

	private static final SubLList $list452 = list(makeSymbol("LISTP"));

	private static final SubLList $list453 = cons(makeSymbol("RELN"), makeSymbol("ARG-NUM"));

	private static final SubLList $list454 = list(makeSymbol("LEADING-STRINGS"), makeSymbol("WU"), makeSymbol("FOLLOWING-STRINGS"), makeSymbol("POS"));

	public static final SubLList $list455 = list(reader_make_constant_shell(makeString("nonPlural-Generic")));

	private static final SubLSymbol $sym456$_ = makeSymbol("+");

	public static final SubLList $list458 = cons(makeSymbol("OTHER-VAR"), makeUninternedSymbol("VALUE"));

	private static final SubLSymbol PPH_VAR_RELN_ARG_POSITION_PAIRS = makeSymbol("PPH-VAR-RELN-ARG-POSITION-PAIRS");

	private static final SubLSymbol $sym460$PPH_OPTIMIZE_FORMULA_VALID_VAR_TYPE_ = makeSymbol("PPH-OPTIMIZE-FORMULA-VALID-VAR-TYPE?");

	private static final SubLList $list461 = cons(makeSymbol("OTHER-VAR"), makeSymbol("VAR-NAME"));

	private static final SubLSymbol PPH_SALIENT_GENERALIZATIONS_FOR_VARIABLE_OPTIMIZATION = makeSymbol("PPH-SALIENT-GENERALIZATIONS-FOR-VARIABLE-OPTIMIZATION");

	private static final SubLSymbol $sym463$PPH_LESS_GENERAL_COLLECTION_ = makeSymbol("PPH-LESS-GENERAL-COLLECTION?");

	private static final SubLSymbol $sym464$PPH_GENERALITY_ESTIMATE_ = makeSymbol("PPH-GENERALITY-ESTIMATE<");

	private static final SubLSymbol EL_VAR_NAME_WITHOUT_PREFIX = makeSymbol("EL-VAR-NAME-WITHOUT-PREFIX");

	private static final SubLString $str466$Too_deep_ = makeString("Too deep.");

	private static final SubLString $str468$Variable_optimized_____S_____S = makeString("Variable optimized:~% ~S -> ~S");

	private static final SubLString $$$X = makeString("X");

	private static final SubLSymbol EL_VAR_NAME = makeSymbol("EL-VAR-NAME");

	private static final SubLSymbol PPH_JAVALIST_ITEM_P = makeSymbol("PPH-JAVALIST-ITEM-P");

	private static final SubLSymbol PPH_JAVALIST_ITEM_COPY = makeSymbol("PPH-JAVALIST-ITEM-COPY");

	private static final SubLSymbol PPH_JAVALIST_P = makeSymbol("PPH-JAVALIST-P");

	private static final SubLSymbol PPH_JAVALIST_NAT_FUNCTOR_ITEM_P = makeSymbol("PPH-JAVALIST-NAT-FUNCTOR-ITEM-P");

	private static final SubLSymbol PPH_JAVALIST_ITEM_ARG_POSITION = makeSymbol("PPH-JAVALIST-ITEM-ARG-POSITION");

	private static final SubLSymbol $sym477$PPH_ARG_POSITION_PRECEDES_ = makeSymbol("PPH-ARG-POSITION-PRECEDES?");

	private static final SubLSymbol PPH_JAVALIST_ITEM_CYCL = makeSymbol("PPH-JAVALIST-ITEM-CYCL");

	private static final SubLSymbol PPH_JAVALIST_ITEM_STRING = makeSymbol("PPH-JAVALIST-ITEM-STRING");

	private static final SubLSymbol CB_NAUT_FRAME = makeSymbol("CB-NAUT-FRAME");

	private static final SubLSymbol PPH_NAUT_ID_FN = makeSymbol("PPH-NAUT-ID-FN");

	private static final SubLSymbol PPH_JAVALIST_SINGLETON_P = makeSymbol("PPH-JAVALIST-SINGLETON-P");

	private static final SubLSymbol $PPH_UNKNOWN_ARG_POSITION = makeKeyword("PPH-UNKNOWN-ARG-POSITION");

	private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

	private static final SubLObject $$FormulaArgPositionFn = reader_make_constant_shell(makeString("FormulaArgPositionFn"));

	private static final SubLList $list486 = list(makeSymbol("STRING"), makeSymbol("SUBPARAPHRASES"));

	private static final SubLList $list487 = list(makeSymbol("STRING"), makeSymbol("QUOTED-CYCL"), makeSymbol("EL-ARG-POSITION"), makeSymbol("OPEN-TAG"), makeSymbol("CLOSE-TAG"), makeSymbol("OFFSET"));

	private static final SubLList $list488 = list(makeSymbol("STRING"), makeSymbol("OPEN-TAG"), makeSymbol("CLOSE-TAG"), makeSymbol("OFFSET"));

	private static final SubLList $list489 = list(makeSymbol("STRING"), makeSymbol("OFFSET"));

	private static final SubLString $str490$Can_t_interpret__S = makeString("Can't interpret ~S");

	private static final SubLSymbol PPH_STRING_P = makeSymbol("PPH-STRING-P");

	private static final SubLString $str493$__START_CHAR__S_is_off_for__S___i = makeString("~&START-CHAR ~S is off for ~S~% in ~S.~%");

	private static final SubLSymbol POSSIBLY_OPTIMIZE_PPH_ANNOTATED_JAVALIST_FOR_ALPHABETIZATION = makeSymbol("POSSIBLY-OPTIMIZE-PPH-ANNOTATED-JAVALIST-FOR-ALPHABETIZATION");

	public static final SubLList $list495 = cons(makeSymbol("PLAIN-JAVALIST"), makeSymbol("OBJECT"));

	private static final SubLString $$$the_ = makeString("the ");

	private static final SubLString $str497$__the = makeString(", the");

	private static final SubLString $str499$Adding__S_tabs_to_bulleted_list_i = makeString("Adding ~S tabs to bulleted list item ~S");

	private static final SubLString $str500$_li_ = makeString("<li>");

	private static final SubLString $str501$__li_ = makeString("</li>");

	private static final SubLString $str502$____ = makeString("*=-+");

	private static final SubLString $str503$Don_t_know_how_to_make_ordered_li = makeString("Don't know how to make ordered list bullets yet.");

	private static final SubLSymbol PPH_ANNOTATED_JAVALIST_STRING = makeSymbol("PPH-ANNOTATED-JAVALIST-STRING");

	private static final SubLList $list506 = list(list(makeSymbol("PROPERTY-LIST"), makeSymbol("DEFAULT-PROPERTY-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol GET_PROPERTY_WITH_DEFAULTS = makeSymbol("GET-PROPERTY-WITH-DEFAULTS");

	private static final SubLList $list518 = list(makeSymbol("PUNLESS"), makeSymbol("FORCE"), list(makeSymbol("CSETQ"), makeSymbol("FORCE"), makeKeyword("NONE")));

	private static final SubLList $list519 = list(makeSymbol("PUNLESS"), makeSymbol("LANGUAGE-MT"), list(makeSymbol("CSETQ"), makeSymbol("LANGUAGE-MT"), makeSymbol("*PPH-LANGUAGE-MT*")));

	private static final SubLList $list520 = list(makeSymbol("PUNLESS"), makeSymbol("DOMAIN-MT"), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN-MT"), makeSymbol("*PPH-DOMAIN-MT*")));

	private static final SubLList $list521 = list(makeSymbol("PUNLESS"), makeSymbol("MODE"), list(makeSymbol("CSETQ"), makeSymbol("MODE"), makeKeyword("HTML")));

	private static final SubLSymbol PPH_JAVALIST_SORT_XYZ_PARAPHRASES = makeSymbol("PPH-JAVALIST-SORT-XYZ-PARAPHRASES");

	private static final SubLSymbol $pph_javalist_sort_xyz_paraphrases_caching_state$ = makeSymbol("*PPH-JAVALIST-SORT-XYZ-PARAPHRASES-CACHING-STATE*");

	private static final SubLSymbol TEST_XYZ_SORT_STRINGS = makeSymbol("TEST-XYZ-SORT-STRINGS");

	private static final SubLList $list530 = list(makeSymbol("PPH-TEST-CASE-TABLES"));

	private static final SubLObject $list534 = _constant_534_initializer();

	private static final SubLString $str535$Trying_to_add_do_support_but_no_h = makeString("Trying to add do support but no head dtr in phrase ~S~%");

	private static final SubLObject $$infinitive = reader_make_constant_shell(makeString("infinitive"));

	private static final SubLObject $$adverbStrings = reader_make_constant_shell(makeString("adverbStrings"));

	private static final SubLString $str539$Inserting_do_support_before_adver = makeString("Inserting do support before adverbial ~S");

	private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

	private static final SubLObject $$Do_TheWord = reader_make_constant_shell(makeString("Do-TheWord"));

	private static final SubLSymbol PPH_SALIENT_GENERALIZATIONS_INT = makeSymbol("PPH-SALIENT-GENERALIZATIONS-INT");

	private static final SubLSymbol PPH_MAKE_TYPE_LEVEL = makeSymbol("PPH-MAKE-TYPE-LEVEL");

	private static final SubLObject $$Number_General = reader_make_constant_shell(makeString("Number-General"));

	private static final SubLObject $$CharacterString = reader_make_constant_shell(makeString("CharacterString"));

	private static final SubLString $str547$_S_does_not_unambiguously_denote_ = makeString("~S does not unambiguously denote ~S");

	private static final SubLString $str548$_S_is_a_forbidden_paraphrase_for_ = makeString("~S is a forbidden paraphrase for ~S");

	private static final SubLSymbol PPH_SENTENCE_FROM_ASSERTION = makeSymbol("PPH-SENTENCE-FROM-ASSERTION");

	private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

	private static final SubLSymbol SKOLEM_FUNCTION_P = makeSymbol("SKOLEM-FUNCTION-P");

	private static final SubLInteger $int$500 = makeInteger(500);

	private static final SubLObject $$InteractionHistoryMicrotheory = reader_make_constant_shell(makeString("InteractionHistoryMicrotheory"));

	private static final SubLObject $$AgentModelingAtTimeMicrotheory = reader_make_constant_shell(makeString("AgentModelingAtTimeMicrotheory"));

	private static final SubLObject $const556$likelihoodOfAgentHavingMathBelief = reader_make_constant_shell(makeString("likelihoodOfAgentHavingMathBeliefOrSkill"));

	private static final SubLSymbol $sym557$PPH_HL_ONLY_TERM_ = makeSymbol("PPH-HL-ONLY-TERM?");

	private static final SubLList $list558 = list(reader_make_constant_shell(makeString("abnormal")));

	private static final SubLSymbol $sym559$PPH_ENGLISH_CONTEXT_ = makeSymbol("PPH-ENGLISH-CONTEXT?");

	private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

	private static final SubLSymbol $sym561$_PPH_ENGLISH_CONTEXT__CACHING_STATE_ = makeSymbol("*PPH-ENGLISH-CONTEXT?-CACHING-STATE*");

	private static final SubLSymbol $sym562$PPH_PREFER_ASSERTION_ = makeSymbol("PPH-PREFER-ASSERTION?");

	private static final SubLSymbol $sym565$_PPH_PREFER_ASSERTION__CACHING_STATE_ = makeSymbol("*PPH-PREFER-ASSERTION?-CACHING-STATE*");

	private static final SubLInteger $int$200 = makeInteger(200);

	private static final SubLObject $$EnglishLanguage = reader_make_constant_shell(makeString("EnglishLanguage"));

	private static final SubLSymbol PPH_STRING_FREQUENCY = makeSymbol("PPH-STRING-FREQUENCY");

	private static final SubLString $str569$Finding_forts_with_multiple_possi = makeString("Finding forts with multiple possible paraphrase assertions");

	private static final SubLObject $$genStringAssertion = reader_make_constant_shell(makeString("genStringAssertion"));

	private static final SubLObject $$webFrequencyForLexicalAssertion = reader_make_constant_shell(makeString("webFrequencyForLexicalAssertion"));

	private static final SubLObject $$nameableCollection = reader_make_constant_shell(makeString("nameableCollection"));

	private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

	private static final SubLSymbol $sym575$_NAME = makeSymbol("?NAME");

	private static final SubLList $list576 = list(makeSymbol("?NAME"));

	private static final SubLObject $$adjStrings = reader_make_constant_shell(makeString("adjStrings"));

	private static final SubLObject $$untensed = reader_make_constant_shell(makeString("untensed"));

	private static final SubLSymbol PPH_PEER_AGR_FOR_PREDS = makeSymbol("PPH-PEER-AGR-FOR-PREDS");

	private static final SubLSymbol $sym580$PPH_SPEECH_PART_PRED_ = makeSymbol("PPH-SPEECH-PART-PRED?");

	private static final SubLString $str581$Failed_to_find_peer_agr_for__S_ = makeString("Failed to find peer agr for ~S.");

	private static final SubLSymbol PPH_PEER_AGR_FOR_PRED = makeSymbol("PPH-PEER-AGR-FOR-PRED");

	private static final SubLList $list583 = list(reader_make_constant_shell(makeString("plural-Generic")), reader_make_constant_shell(makeString("nonPlural-Generic")), reader_make_constant_shell(makeString("tensed")));

	private static final SubLList $list584 = list(reader_make_constant_shell(makeString("tensed")));

	public static final SubLList $list585 = list(reader_make_constant_shell(makeString("presentTense-Generic")));

	public static final SubLList $list586 = list(reader_make_constant_shell(makeString("SchemaObjectFn")), reader_make_constant_shell(makeString("CCF-SDB-Bnode-CMLS")), makeKeyword("ANYTHING"));

	private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

	private static final SubLSymbol $sym588$_PRED = makeSymbol("?PRED");

	private static final SubLObject $$generateArgOfRelnWithForm = reader_make_constant_shell(makeString("generateArgOfRelnWithForm"));

	private static final SubLList $list590 = list(makeSymbol("?PRED"));

	private static final SubLObject $$DeclarativeUtterance = reader_make_constant_shell(makeString("DeclarativeUtterance"));

	private static final SubLObject $$InterrogativeUtterance = reader_make_constant_shell(makeString("InterrogativeUtterance"));

	private static final SubLSymbol PPH_GENERIC_SPEECH_PART_PREDS_WITH_TENSE_AND_ASPECT = makeSymbol("PPH-GENERIC-SPEECH-PART-PREDS-WITH-TENSE-AND-ASPECT");

	private static final SubLObject $$presentPerfect_Generic = reader_make_constant_shell(makeString("presentPerfect-Generic"));

	private static final SubLObject $$pastPerfect_Generic = reader_make_constant_shell(makeString("pastPerfect-Generic"));

	private static final SubLObject $$futurePerfect_Generic = reader_make_constant_shell(makeString("futurePerfect-Generic"));

	private static final SubLObject $$presentTense_Generic = reader_make_constant_shell(makeString("presentTense-Generic"));

	private static final SubLString $str600$presentPerfect_Generic = makeString("presentPerfect-Generic");

	private static final SubLObject $$pastTense_Generic = reader_make_constant_shell(makeString("pastTense-Generic"));

	private static final SubLObject $$futureTense_Generic = reader_make_constant_shell(makeString("futureTense-Generic"));

	private static final SubLSymbol PPH_TENSE_PRED_FOR_INTERVAL_SUBSUMING_DATE = makeSymbol("PPH-TENSE-PRED-FOR-INTERVAL-SUBSUMING-DATE");

	private static final SubLObject $$Now = reader_make_constant_shell(makeString("Now"));

	private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell(makeString("Always-TimeInterval"));

	private static final SubLObject $$Tomorrow_Indexical = reader_make_constant_shell(makeString("Tomorrow-Indexical"));

	private static final SubLList $list607 = list(list(makeKeyword("OR"), reader_make_constant_shell(makeString("TimeIntervalBetweenFn")), reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"))), makeKeyword("ANYTHING"), reader_make_constant_shell(makeString("Now")));

	public static final SubLList $list608 = cons(list(makeKeyword("OR"), reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")), reader_make_constant_shell(makeString("IntervalStartedByFn"))), makeKeyword("ANYTHING"));

	private static final SubLObject $$startsAfterEndingOf = reader_make_constant_shell(makeString("startsAfterEndingOf"));

	private static final SubLList $list610 = list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

	private static final SubLList $list611 = list(list(makeKeyword("OR"), reader_make_constant_shell(makeString("STIB")), reader_make_constant_shell(makeString("STIF")), reader_make_constant_shell(makeString("EarlyPartFn")), reader_make_constant_shell(makeString("LatePartFn"))), makeKeyword("ANYTHING"));

	private static final SubLObject $$temporallySubsumes = reader_make_constant_shell(makeString("temporallySubsumes"));

	private static final SubLSymbol EL_JUNCTION_P = makeSymbol("EL-JUNCTION-P");

	private static final SubLSymbol $sym614$PPH_NAMED_ENTITY_ = makeSymbol("PPH-NAMED-ENTITY?");

	private static final SubLSymbol $sym615$PPH_ISA_ANY_ = makeSymbol("PPH-ISA-ANY?");

	private static final SubLInteger $int$300 = makeInteger(300);

	public static final SubLList $list617 = list(list(makeSymbol("OBJ1"), makeSymbol("OBJ2"), makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym618$ARG_LIST = makeUninternedSymbol("ARG-LIST");

	public static final SubLList $list619 = list(makeSymbol("*PPH-ISA-CONTEXT*"), list(makeSymbol("FIND-OR-CREATE-PPH-ISA-CONTEXT")));

	private static final SubLList $list621 = list(makeSymbol("*PPH-ISA-CONTEXT*"));

	private static final SubLSymbol SET_REMOVE = makeSymbol("SET-REMOVE");

	private static final SubLSymbol FIND_OR_CREATE_PPH_ISA_CONTEXT = makeSymbol("FIND-OR-CREATE-PPH-ISA-CONTEXT");

	private static final SubLSymbol NOTING_PPH_ISA_CONTEXT = makeSymbol("NOTING-PPH-ISA-CONTEXT");

	private static final SubLSymbol $sym626$PPH_ISA_ = makeSymbol("PPH-ISA?");

	private static final SubLString $str627$Nested_call___PPH_ISA___S__S__S_ = makeString("Nested call: (PPH-ISA? ~S ~S ~S)");

	private static final SubLObject $$Function_Denotational = reader_make_constant_shell(makeString("Function-Denotational"));

	private static final SubLSymbol $sym629$PPH_QUOTED_ISA_ = makeSymbol("PPH-QUOTED-ISA?");

	private static final SubLObject $$quotedDefnSufficient = reader_make_constant_shell(makeString("quotedDefnSufficient"));

	private static final SubLObject $$quotedDefnIff = reader_make_constant_shell(makeString("quotedDefnIff"));

	private static final SubLObject $$defnSufficient = reader_make_constant_shell(makeString("defnSufficient"));

	private static final SubLObject $$defnIff = reader_make_constant_shell(makeString("defnIff"));

	private static final SubLSymbol $sym636$PPH_GENL_ = makeSymbol("PPH-GENL?");

	private static final SubLInteger $int$50000 = makeInteger(50000);

	private static final SubLSymbol $sym638$PPH_GENL_MT_ = makeSymbol("PPH-GENL-MT?");

	private static final SubLSymbol $sym640$_PPH_GENL_PREDICATE__CACHING_STATE_ = makeSymbol("*PPH-GENL-PREDICATE?-CACHING-STATE*");

	private static final SubLInteger $int$1024 = makeInteger(1024);

	private static final SubLSymbol $sym642$CLEAR_PPH_GENL_PREDICATE_ = makeSymbol("CLEAR-PPH-GENL-PREDICATE?");

	private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

	private static final SubLObject $$genlFunctions = reader_make_constant_shell(makeString("genlFunctions"));

	private static final SubLSymbol $sym645$PPH_POSSIBLE_PRONOUN_DENOT__PERMISSIVE = makeSymbol("PPH-POSSIBLE-PRONOUN-DENOT?-PERMISSIVE");

	private static final SubLSymbol $sym646$PPH_POSSIBLE_PRONOUN_DENOT__STRICT = makeSymbol("PPH-POSSIBLE-PRONOUN-DENOT?-STRICT");

	private static final SubLObject $$SomethingExisting = reader_make_constant_shell(makeString("SomethingExisting"));

	private static final SubLObject $$IndeterminateTerm = reader_make_constant_shell(makeString("IndeterminateTerm"));

	private static final SubLSymbol PPH_NTH_PHRASE = makeSymbol("PPH-NTH-PHRASE");

	private static final SubLSymbol PPH_NTH_PHRASE_P = makeSymbol("PPH-NTH-PHRASE-P");

	public static final SubLList $list651 = list(makeSymbol("NUM"), makeSymbol("CONSTRAINTS"));

	private static final SubLList $list652 = list(makeKeyword("NUM"), makeKeyword("CONSTRAINTS"));

	private static final SubLList $list653 = list(makeSymbol("PPH-NTH-PHRASE-NUM"), makeSymbol("PPH-NTH-PHRASE-CONSTRAINTS"));

	private static final SubLList $list654 = list(makeSymbol("_CSETF-PPH-NTH-PHRASE-NUM"), makeSymbol("_CSETF-PPH-NTH-PHRASE-CONSTRAINTS"));

	private static final SubLSymbol PPRINT_PPH_NTH_PHRASE = makeSymbol("PPRINT-PPH-NTH-PHRASE");

	private static final SubLSymbol PPH_NTH_PHRASE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-NTH-PHRASE-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list657 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-NTH-PHRASE-P"));

	private static final SubLSymbol PPH_NTH_PHRASE_NUM = makeSymbol("PPH-NTH-PHRASE-NUM");

	private static final SubLSymbol _CSETF_PPH_NTH_PHRASE_NUM = makeSymbol("_CSETF-PPH-NTH-PHRASE-NUM");

	private static final SubLSymbol PPH_NTH_PHRASE_CONSTRAINTS = makeSymbol("PPH-NTH-PHRASE-CONSTRAINTS");

	private static final SubLSymbol _CSETF_PPH_NTH_PHRASE_CONSTRAINTS = makeSymbol("_CSETF-PPH-NTH-PHRASE-CONSTRAINTS");

	private static final SubLString $str664$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	private static final SubLSymbol MAKE_PPH_NTH_PHRASE = makeSymbol("MAKE-PPH-NTH-PHRASE");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_NTH_PHRASE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-NTH-PHRASE-METHOD");

	private static final SubLString $str670$__PPH_NTH_PHRASE___S = makeString("#<PPH-NTH-PHRASE: ~S");

	private static final SubLString $str671$__S = makeString(" ~S");

	private static final SubLString $str672$_ = makeString(">");

	private static final SubLInteger $int$75 = makeInteger(75);

	private static final SubLSymbol CFASL_INPUT_PPH_NTH_PHRASE = makeSymbol("CFASL-INPUT-PPH-NTH-PHRASE");

	private static final SubLSymbol CFASL_OUTPUT_OBJECT_PPH_NTH_PHRASE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PPH-NTH-PHRASE-METHOD");

	private static final SubLObject $$NLGenerationPredicate = reader_make_constant_shell(makeString("NLGenerationPredicate"));

	private static final SubLObject $$multiWordString = reader_make_constant_shell(makeString("multiWordString"));

	private static final SubLObject $$compoundString = reader_make_constant_shell(makeString("compoundString"));

	private static final SubLObject $$headMedialString = reader_make_constant_shell(makeString("headMedialString"));

	private static final SubLSymbol $sym681$PPH_GENL_CATEGORY_ = makeSymbol("PPH-GENL-CATEGORY?");

	private static final SubLObject $$SententialConstituent = reader_make_constant_shell(makeString("SententialConstituent"));

	private static final SubLSymbol $sym683$_PPH_GENL_CATEGORY__CACHING_STATE_ = makeSymbol("*PPH-GENL-CATEGORY?-CACHING-STATE*");

	private static final SubLSymbol PPH_POS_OF_CATEGORY = makeSymbol("PPH-POS-OF-CATEGORY");

	private static final SubLSymbol $pph_pos_of_category_caching_state$ = makeSymbol("*PPH-POS-OF-CATEGORY-CACHING-STATE*");

	private static final SubLObject $$NLPhrase = reader_make_constant_shell(makeString("NLPhrase"));

	private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

	private static final SubLList $list688 = list(reader_make_constant_shell(makeString("Pronoun")), list(reader_make_constant_shell(makeString("PhraseFn")), reader_make_constant_shell(makeString("Pronoun"))));

	private static final SubLObject $$NLSentence = reader_make_constant_shell(makeString("NLSentence"));

	private static final SubLObject $$PrepositionalPhrase = reader_make_constant_shell(makeString("PrepositionalPhrase"));

	private static final SubLObject $$Preposition = reader_make_constant_shell(makeString("Preposition"));

	private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

	private static final SubLList $list693 = list(reader_make_constant_shell(makeString("PhraseFn-Bar1")), reader_make_constant_shell(makeString("Verb")));

	private static final SubLSymbol PPH_FILTER_TWO_PREDS_MEMOIZED = makeSymbol("PPH-FILTER-TWO-PREDS-MEMOIZED");

	private static final SubLString $str695$__Filtering_preds__S_and__S___ = makeString("~&Filtering preds ~S and ~S.~%");

	private static final SubLString $str696$__max_floor_preds___S___ = makeString("~&max-floor preds: ~S.~%");

	private static final SubLSymbol PPH_FILTER_PREDS_MEMOIZED = makeSymbol("PPH-FILTER-PREDS-MEMOIZED");

	private static final SubLSymbol $sym698$PPH_PREFER_POS_PRED_ = makeSymbol("PPH-PREFER-POS-PRED?");

	private static final SubLSymbol $sym699$PPH_SPEC_POS_PRED_ = makeSymbol("PPH-SPEC-POS-PRED?");

	private static final SubLList $list700 = list(reader_make_constant_shell(makeString("wordStrings")), reader_make_constant_shell(makeString("properNameStrings")));

	private static final SubLString $str701$defaultAgreementPredsForInstanceL = makeString("defaultAgreementPredsForInstanceList");

	private static final SubLSymbol $sym702$_PREDS = makeSymbol("?PREDS");

	private static final SubLSymbol $sym704$_ROOT_MT = makeSymbol("?ROOT-MT");

	private static final SubLObject $$paraphraseRootMtForLanguage = reader_make_constant_shell(makeString("paraphraseRootMtForLanguage"));

	private static final SubLSymbol $sym706$_MT = makeSymbol("?MT");

	private static final SubLObject $$validatedLexicalMtsForLanguage = reader_make_constant_shell(makeString("validatedLexicalMtsForLanguage"));

	public static final SubLList $list708 = list(makeSymbol("?MT"));

	private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

	private static final SubLString $str710$__Based_on_morphology__using_new_ = makeString("~&Based on morphology, using new agr pred: ~S.");

	private static final SubLString $str713$____genTemplate_Constrained_is_av = makeString("~&#$genTemplate-Constrained is available for~% ~S.~%");

	private static final SubLString $str714$____genFormat_ArgFixed_is_availab = makeString("~&#$genFormat-ArgFixed is available for~% ~S.~%");

	private static final SubLSymbol $sym715$FORMULA_WITH_SEQUENCE_TERM_ = makeSymbol("FORMULA-WITH-SEQUENCE-TERM?");

	private static final SubLObject $$examplePredSentences = reader_make_constant_shell(makeString("examplePredSentences"));

	private static final SubLObject $$exampleNATs = reader_make_constant_shell(makeString("exampleNATs"));

	private static final SubLSymbol $sym718$_ARITY = makeSymbol("?ARITY");

	private static final SubLObject $$arity = reader_make_constant_shell(makeString("arity"));

	public static final SubLList $list720 = list(makeSymbol("?ARITY"));

	private static final SubLList $list721 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

	private static final SubLSymbol EL_VAR_TO_KEYWORD = makeSymbol("EL-VAR-TO-KEYWORD");

	private static final SubLList $list723 = list(new SubLObject[] { makeKeyword("SUBJECT-VERB"), makeKeyword("DET-NBAR"), makeKeyword("POS-PRED"), makeKeyword("CLARIFYING"), makeKeyword("NL-PREDS"), makeKeyword("PEER"), makeKeyword("TENSE"), makeKeyword("DONT-CARE"), makeKeyword("IMPOSSIBLE") });

	private static final SubLList $list724 = list(makeKeyword("POS-PRED"), makeKeyword("NL-PREDS"), makeKeyword("DONT-CARE"), makeKeyword("IMPOSSIBLE"));

	private static final SubLList $list725 = list(makeKeyword("SUBJECT-VERB"), makeKeyword("DET-NBAR"), makeKeyword("PEER"), makeKeyword("TENSE"), makeKeyword("CLARIFYING"));

	private static final SubLObject $$NLIndexAttribute = reader_make_constant_shell(makeString("NLIndexAttribute"));

	private static final SubLString $str730$__a_z________ = makeString("<[a-z]+[^>]*>");

	private static final SubLString $str731$___a_z________ = makeString("</[a-z]+[^>]*>");

	public static final SubLList $list732 = list(makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION"), makeString("a"), makeString("a"));

	private static final SubLList $list733 = list(makeString("a"));

	private static final SubLString $str734$Regex_is_not_behaving_as_expected = makeString("Regex is not behaving as expected.~% ~S~% returned ~S instead of ~S~%");

	private static final SubLSymbol $sym735$PPH_HTML_TAG_MATCH_ = makeSymbol("PPH-HTML-TAG-MATCH?");

	public static final SubLList $list736 = list(makeKeyword("CASELESS"));

	private static final SubLString $str737$Regex_error_finding_open_tags____ = makeString("Regex error finding open tags:~% ~A");

	private static final SubLString $str738$Don_t_have_valid_grep_patterns_fo = makeString("Don't have valid grep patterns for html tags.");

	private static final SubLString $str739$Regex_error_finding_close_tags___ = makeString("Regex error finding close tags:~% ~A");

	private static final SubLList $list742 = cons(makeSymbol("FROM-PREFIX"), makeSymbol("TO-PREFIX"));

	private static final SubLSymbol PPH_ARG_POSITION_LOOKUP = makeSymbol("PPH-ARG-POSITION-LOOKUP");

	private static final SubLSymbol $pph_arg_position_lookup_caching_state$ = makeSymbol("*PPH-ARG-POSITION-LOOKUP-CACHING-STATE*");

	private static final SubLSymbol $sym745$PPH_ARG_POSITION_SUBSUMES_ = makeSymbol("PPH-ARG-POSITION-SUBSUMES?");

	private static final SubLString $$$Paraphrase_Utilities = makeString("Paraphrase Utilities");

	private static final SubLList $list749 = list(new SubLObject[] { list(list(T), T), list(list(NIL), T), list(list(list(ONE_INTEGER)), T), list(list(list(list(ONE_INTEGER, TWO_INTEGER))), T), list(list(list(ZERO_INTEGER)), T), list(list(cons(makeSymbol("A"), makeSymbol("B"))), NIL), list(list(list(NIL)), NIL), list(list(list(MINUS_ONE_INTEGER)), NIL), list(list(makeKeyword("PRECISE")), NIL) });

	private static final SubLSymbol PPH_OPTIMIZE_FORMULA_VARIABLE_NAMES = makeSymbol("PPH-OPTIMIZE-FORMULA-VARIABLE-NAMES");

	private static final SubLObject $list751 = _constant_751_initializer();

	private static final SubLSymbol PPH_OPTIMIZE_FORMULA_VARIABLE_NAME = makeSymbol("PPH-OPTIMIZE-FORMULA-VARIABLE-NAME");

	private static final SubLList $list753 = list(new SubLObject[] { list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("quantity")), list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("makesProductType")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("organization")),
			list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("makesProductType")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("product type")), list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("investmentSymbol")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("type of investment vehicle")),
			list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("investmentSymbol")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("identification string")), list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("startingDate")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("temporal thing")),
			list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("origin-RoundTrip")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("round trip")), list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("origin-RoundTrip")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("origin")),
			list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("destination-RoundTrip")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("destination")), list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("travellerInTrip")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("travel")),
			list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("objectFoundInLocation")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("location")), list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("politicalPartyMembers")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("political party")),
			list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("politicalPartyMembers")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("member")), list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("hasMembers")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("group of agents")),
			list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("hasMembers")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("member")), list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("father")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("animal")),
			list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("father")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("pop")), list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("mother")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("mom")),
			list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("brothers")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("brother")), list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("sisters")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("sister")),
			list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("birthPlace")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("place of birth")), list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("dateOfDeathEvent")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("being")),
			list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("twitterScreenNameOfAgent")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("intelligent agent")), list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("twitterScreenNameOfAgent")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("screen name")),
			list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("isInvestmentType")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("investment vehicle")), list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("age")), makeSymbol("?X"), makeSymbol("?Y"))), makeString("age")) });

	private static final SubLObject $$MedicalResearchCAEGuidanceMt = reader_make_constant_shell(makeString("MedicalResearchCAEGuidanceMt"));

	private static final SubLSymbol GENERATE_PHRASE_FOR_JAVA = makeSymbol("GENERATE-PHRASE-FOR-JAVA");

	private static final SubLSymbol TEST_NCONCATENATE_PPH_JAVALISTS = makeSymbol("TEST-NCONCATENATE-PPH-JAVALISTS");

	private static final SubLList $list757 = list(list(list(list(makeString("George"), makeString(" "), makeString("Bill"), makeString(" "), makeString("George"), makeString(" "), makeString("Barack")), NIL), list(NINETEEN_INTEGER, NIL)), list(list(list(makeString("George"), makeString(" "), makeString("Bill")), NIL), list(SEVEN_INTEGER, NIL)),
			list(list(list(makeString("George"), makeString(" "), makeString("Bill"), makeString(" "), makeString("George"), makeString(" "), makeString("Barack")), list(ONE_INTEGER)), list(NINETEEN_INTEGER, list(ONE_INTEGER))));

	private static final SubLList $list758 = list(list(list(list(reader_make_constant_shell(makeString("STIF")), makeSymbol("?X")), reader_make_constant_shell(makeString("TimeInterval"))), T), list(list(list(reader_make_constant_shell(makeString("Quote")), makeSymbol("?X")), reader_make_constant_shell(makeString("CycLVariable"))), T), list(list(reader_make_constant_shell(makeString("Thing")), NIL), NIL),
			list(list(makeSymbol("?THING"), reader_make_constant_shell(makeString("Collection"))), NIL));

	private static final SubLList $list759 = list(list(list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Thing"))), T), list(list(list(reader_make_constant_shell(makeString("SpecsFn")), reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("SpecsFn")), reader_make_constant_shell(makeString("Collection")))), T),
			list(list(list(reader_make_constant_shell(makeString("SpecsFn")), reader_make_constant_shell(makeString("Collection"))), reader_make_constant_shell(makeString("Collection"))), T));

	private static final SubLList $list760 = list(list(list(reader_make_constant_shell(makeString("isa")), NIL), NIL), list(list(NIL, reader_make_constant_shell(makeString("isa"))), NIL));

	public static final SubLList $list761 = list(new SubLObject[] { list(list(list(reader_make_constant_shell(makeString("equals")), ONE_INTEGER, ONE_INTEGER)), T), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("equals")), ONE_INTEGER, TWO_INTEGER))), T),
			list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("Quote")), reader_make_constant_shell(makeString("Thing"))), reader_make_constant_shell(makeString("CycLVariable"))))), T),
			list(list(list(reader_make_constant_shell(makeString("quotedIsa")), makeSymbol("?X"), reader_make_constant_shell(makeString("CycLVariable")))), T),
			list(list(list(reader_make_constant_shell(makeString("not")),
					list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("Quote")), THREE_INTEGER), reader_make_constant_shell(makeString("CycLVariable"))),
							list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("Quote")), TWO_INTEGER), reader_make_constant_shell(makeString("CycLVariable")))))),
					T),
			list(list(list(reader_make_constant_shell(makeString("longerDurationThan")),
					list(reader_make_constant_shell(makeString("DurationFn")),
							list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1968)), makeString("31e5bc2c-fb7f-41d8-8e8c-b088706b0c6d")),
									list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1980)), makeString("31e5fcb4-fb7f-41d8-8478-d09298296e27")))),
					list(reader_make_constant_shell(makeString("DaysDuration")), ONE_INTEGER))), T),
			list(list(list(reader_make_constant_shell(makeString("equals")), makeSymbol("?NUMBER"), ONE_INTEGER)), NIL), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("equals")), ONE_INTEGER, ONE_INTEGER))), NIL), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("or")),
					list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("Quote")), THREE_INTEGER), reader_make_constant_shell(makeString("CycLVariable"))), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("Quote")), makeSymbol("?FOO")), reader_make_constant_shell(makeString("CycLVariable")))))), NIL) });

	private static final SubLSymbol PPH_FIGURE_NEW_ARG_POSITION_MAP = makeSymbol("PPH-FIGURE-NEW-ARG-POSITION-MAP");

	private static final SubLList $list763 = list(new SubLObject[] {
			list(list(list(list(list(TWO_INTEGER, ONE_INTEGER), ONE_INTEGER)), makeKeyword("ARG2")), list(list(list(ONE_INTEGER), ONE_INTEGER))), list(
					list(list(list(list(TWO_INTEGER))),
							list(reader_make_constant_shell(makeString("forAll")), makeKeyword("ARG1"),
									list(reader_make_constant_shell(makeString("thereExists")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG2")), list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG2")))))),
					list(list(list(TWO_INTEGER, ONE_INTEGER), ONE_INTEGER), list(list(TWO_INTEGER, TWO_INTEGER), TWO_INTEGER, TWO_INTEGER))),
			list(list(list(list(list(TWO_INTEGER))), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG2"))), list(list(NIL, ONE_INTEGER))),
			list(list(list(list(list(TWO_INTEGER))), list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG2")))), list(list(NIL, TWO_INTEGER, TWO_INTEGER))),
			list(list(list(list(list(TWO_INTEGER))), list(reader_make_constant_shell(makeString("thereExists")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG2")), list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG2"))))),
					list(list(list(ONE_INTEGER), ONE_INTEGER), list(list(TWO_INTEGER), TWO_INTEGER, TWO_INTEGER))),
			list(list(list(list(list(TWO_INTEGER))), makeKeyword("ARG1")), NIL), list(list(list(list(NIL, ONE_INTEGER)), makeKeyword("ARG2")), list(list(NIL, ONE_INTEGER, TWO_INTEGER))),
			list(list(list(list(NIL)), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG2"))))), list(list(NIL, TWO_INTEGER, TWO_INTEGER, ONE_INTEGER, ONE_INTEGER))),
			list(list(list(list(NIL)), list(reader_make_constant_shell(makeString("FormulaArgFn")), THREE_INTEGER, makeKeyword("ARG2"))), list(list(NIL, TWO_INTEGER, THREE_INTEGER))),
			list(list(list(list(NIL)), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("relationAllExistsUnique")), makeKeyword("ARG1"), makeKeyword("ARG2"), makeKeyword("ARG3")), list(reader_make_constant_shell(makeString("relationExistsUniqueAll")), makeKeyword("ARG1"), makeKeyword("ARG2"), makeKeyword("ARG3")))),
					list(list(list(ONE_INTEGER, ONE_INTEGER), ONE_INTEGER), list(list(ONE_INTEGER, TWO_INTEGER), TWO_INTEGER), list(list(ONE_INTEGER, THREE_INTEGER), THREE_INTEGER), list(list(TWO_INTEGER, ONE_INTEGER), ONE_INTEGER), list(list(TWO_INTEGER, TWO_INTEGER), TWO_INTEGER), list(list(TWO_INTEGER, THREE_INTEGER), THREE_INTEGER))),
			list(list(list(list(NIL)), list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG2")))), makeKeyword("SELF"))),
					list(list(list(ONE_INTEGER), TWO_INTEGER, TWO_INTEGER, ONE_INTEGER, ONE_INTEGER), list(list(TWO_INTEGER)))),
			list(list(list(list(NIL)), list(reader_make_constant_shell(makeString("relationAllExistsUnique")), makeKeyword("ARG1"), makeKeyword("ARG2"), makeKeyword("ARG3"))), list(list(list(ONE_INTEGER), ONE_INTEGER), list(list(TWO_INTEGER), TWO_INTEGER), list(list(THREE_INTEGER), THREE_INTEGER))),
			list(list(list(list(NIL)), list(reader_make_constant_shell(makeString("relationExistsUniqueAll")), makeKeyword("ARG1"), makeKeyword("ARG2"), makeKeyword("ARG3"))), list(list(list(ONE_INTEGER), ONE_INTEGER), list(list(TWO_INTEGER), TWO_INTEGER), list(list(THREE_INTEGER), THREE_INTEGER))), list(list(list(list(NIL)), makeKeyword("ARG1")), list(list(NIL, ONE_INTEGER))),
			list(list(list(list(NIL)), makeKeyword("ARG2")), list(list(NIL, TWO_INTEGER))), list(list(list(list(NIL)), makeKeyword("ARG3")), list(list(NIL, THREE_INTEGER))), list(list(list(list(NIL)), makeKeyword("SELF")), list(list(NIL))) });

	public static final SubLList $list764 = list(new SubLObject[] {
			list(list(list(ONE_INTEGER, ONE_INTEGER), list(list(list(ONE_INTEGER, TWO_INTEGER), TWO_INTEGER), list(list(ONE_INTEGER, THREE_INTEGER), THREE_INTEGER), list(list(TWO_INTEGER, ONE_INTEGER), ONE_INTEGER), list(list(TWO_INTEGER, TWO_INTEGER), TWO_INTEGER), list(list(TWO_INTEGER, THREE_INTEGER), THREE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")),
			list(list(list(ONE_INTEGER, ONE_INTEGER), NIL), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(ONE_INTEGER, TWO_INTEGER), list(list(list(ONE_INTEGER, ONE_INTEGER), ONE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")),
			list(list(list(ONE_INTEGER, TWO_INTEGER), list(list(list(ONE_INTEGER, THREE_INTEGER), THREE_INTEGER), list(list(TWO_INTEGER, ONE_INTEGER), ONE_INTEGER), list(list(TWO_INTEGER, TWO_INTEGER), TWO_INTEGER), list(list(TWO_INTEGER, THREE_INTEGER), THREE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")),
			list(list(list(ONE_INTEGER, THREE_INTEGER), list(list(list(ONE_INTEGER, TWO_INTEGER), TWO_INTEGER), list(list(ONE_INTEGER, ONE_INTEGER), ONE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")),
			list(list(list(ONE_INTEGER, THREE_INTEGER), list(list(list(TWO_INTEGER, ONE_INTEGER), ONE_INTEGER), list(list(TWO_INTEGER, TWO_INTEGER), TWO_INTEGER), list(list(TWO_INTEGER, THREE_INTEGER), THREE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(ONE_INTEGER), list(list(list(ONE_INTEGER), TWO_INTEGER, ONE_INTEGER))), list(TWO_INTEGER, ONE_INTEGER)),
			list(list(list(ONE_INTEGER), list(list(list(TWO_INTEGER), TWO_INTEGER, TWO_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(ONE_INTEGER), list(list(list(TWO_INTEGER), TWO_INTEGER), list(list(THREE_INTEGER), THREE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(ONE_INTEGER), list(list(list(TWO_INTEGER)))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")),
			list(list(list(ONE_INTEGER), list(list(NIL, ONE_INTEGER))), list(ONE_INTEGER, ONE_INTEGER)), list(list(list(ONE_INTEGER), list(list(NIL))), list(ONE_INTEGER)), list(list(list(ONE_INTEGER), NIL), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(TWO_INTEGER, ONE_INTEGER), list(list(list(ONE_INTEGER), TWO_INTEGER, ONE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")),
			list(list(list(TWO_INTEGER, ONE_INTEGER), list(list(list(TWO_INTEGER, TWO_INTEGER), TWO_INTEGER, TWO_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(TWO_INTEGER, ONE_INTEGER), list(list(list(TWO_INTEGER, TWO_INTEGER), TWO_INTEGER), list(list(TWO_INTEGER, THREE_INTEGER), THREE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")),
			list(list(list(TWO_INTEGER, ONE_INTEGER), list(list(list(TWO_INTEGER)))), list(ONE_INTEGER)), list(list(list(TWO_INTEGER, ONE_INTEGER), list(list(NIL, ONE_INTEGER))), list(ONE_INTEGER, TWO_INTEGER, ONE_INTEGER)), list(list(list(TWO_INTEGER, ONE_INTEGER), list(list(NIL))), list(TWO_INTEGER, ONE_INTEGER)), list(list(list(TWO_INTEGER, ONE_INTEGER), NIL), makeKeyword("PPH-UNKNOWN-ARG-POSITION")),
			list(list(list(TWO_INTEGER, TWO_INTEGER, TWO_INTEGER), list(list(list(TWO_INTEGER)))), list(TWO_INTEGER, TWO_INTEGER)), list(list(list(TWO_INTEGER, TWO_INTEGER), list(list(list(TWO_INTEGER, ONE_INTEGER), ONE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(TWO_INTEGER, TWO_INTEGER), list(list(list(TWO_INTEGER, THREE_INTEGER), THREE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")),
			list(list(list(TWO_INTEGER, TWO_INTEGER), NIL), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(TWO_INTEGER, THREE_INTEGER), list(list(list(TWO_INTEGER, TWO_INTEGER), TWO_INTEGER), list(list(TWO_INTEGER, ONE_INTEGER), ONE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(TWO_INTEGER, THREE_INTEGER), NIL), makeKeyword("PPH-UNKNOWN-ARG-POSITION")),
			list(list(list(TWO_INTEGER), list(list(list(THREE_INTEGER), THREE_INTEGER))), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(TWO_INTEGER), NIL), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(list(THREE_INTEGER), NIL), makeKeyword("PPH-UNKNOWN-ARG-POSITION")), list(list(NIL, list(list(NIL, ONE_INTEGER))), list(ONE_INTEGER)),
			list(list(NIL, list(list(NIL, TWO_INTEGER, THREE_INTEGER))), list(TWO_INTEGER, THREE_INTEGER)), list(list(NIL, list(list(NIL))), NIL), list(list(NIL, NIL), makeKeyword("PPH-UNKNOWN-ARG-POSITION")) });

	private static final SubLObject $list765 = _constant_765_initializer();

	private static final SubLSymbol PPH_FILTER_PREDS = makeSymbol("PPH-FILTER-PREDS");

	private static final SubLSymbol $sym767$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

	private static final SubLObject $list768 = _constant_768_initializer();

	private static final SubLSymbol $sym769$AN_STRING_ = makeSymbol("AN-STRING?");

	private static final SubLList $list770 = list(new SubLObject[] { list(list(makeString("area")), T), list(list(makeString("ear")), T), list(list(makeString("iceberg")), T), list(list(makeString("onion")), T), list(list(makeString("RPM")), T), list(list(makeString("LPX")), T), list(list(makeString("FHA")), T), list(list(makeString("uncle")), T), list(list(makeString("+11")), T), list(list(makeString("herbal")), T),
			list(list(makeString("su-1000")), T), list(list(makeString("unidentified")), T), list(list(makeString("unintentional")), T), list(list(makeString("honorary")), T), list(list(makeString("hour")), T), list(list(makeString("usher")), T), list(list(makeString("onerous")), T), list(list(makeString("bicycle")), NIL), list(list(makeString("car")), NIL), list(list(makeString("door")), NIL),
			list(list(makeString("frog")), NIL), list(list(makeString("gerbil")), NIL), list(list(makeString("hamster")), NIL), list(list(makeString("juniper")), NIL), list(list(makeString("kangaroo")), NIL), list(list(makeString("lion")), NIL), list(list(makeString("mouse")), NIL), list(list(makeString("nephew")), NIL), list(list(makeString("pet")), NIL), list(list(makeString("queen")), NIL),
			list(list(makeString("rat")), NIL), list(list(makeString("sister")), NIL), list(list(makeString("toad")), NIL), list(list(makeString("vacuum")), NIL), list(list(makeString("sea")), NIL), list(list(makeString("worm")), NIL), list(list(makeString("xylophone")), NIL), list(list(makeString("youth")), NIL), list(list(makeString("zebra")), NIL), list(list(makeString("UIA")), NIL),
			list(list(makeString("uracil")), NIL), list(list(makeString("unicorn")), NIL), list(list(makeString("+1")), NIL), list(list(makeString("utopian")), NIL), list(list(makeString("herbicide")), NIL), list(list(makeString("rhyme")), NIL), list(list(makeString("rhapsody")), NIL), list(list(makeString("rhino")), NIL), list(list(makeString("rhetorical")), NIL), list(list(makeString("rhododendron")), NIL),
			list(list(makeString("unicycle")), NIL), list(list(makeString("unary")), NIL), list(list(makeString("used")), NIL), list(list(makeString("utility")), NIL), list(list(makeString("uterus")), NIL), list(list(makeString("utopian")), NIL), list(list(makeString("urine")), NIL), list(list(makeString("european")), NIL), list(list(makeString("one")), NIL), list(list(makeString("U.S.")), NIL),
			list(list(makeString("ubiquitous")), NIL), list(list(makeString("McDonald's restaurant")), NIL) });

	private static final SubLSymbol $sym771$PPH_CLOSED_HTML_TAGS_ = makeSymbol("PPH-CLOSED-HTML-TAGS?");

	private static final SubLList $list772 = list(list(list(makeString("<a href>"), makeString("</a>")), T), list(list(makeString("<a href><ul>"), makeString("</a>")), NIL), list(list(makeString("<ul>"), makeString("</ul>")), T), list(list(makeString("<a href><ul>"), makeString("</ul></a>")), T));

	private static final SubLString $$$Paraphrase_Utilities_Test_Suite = makeString("Paraphrase Utilities Test Suite");

	private static final SubLList $list774 = list(makeString("Paraphrase Utilities"));

	public static final SubLList $list775 = list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("ist-Intermediate")));

	private static final SubLSymbol $PPH_NULL_MT_SCOPE = makeKeyword("PPH-NULL-MT-SCOPE");

	private static final SubLObject $$TemporalMicrotheory = reader_make_constant_shell(makeString("TemporalMicrotheory"));

	private static final SubLObject $$PolyadicMicrotheory = reader_make_constant_shell(makeString("PolyadicMicrotheory"));

	private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

	private static final SubLSymbol $sym780$EL_WFT_ = makeSymbol("EL-WFT?");

	private static final SubLObject $$TimeInterval = reader_make_constant_shell(makeString("TimeInterval"));

	private static final SubLSymbol GET_ALL_PRETTY_STRINGS = makeSymbol("GET-ALL-PRETTY-STRINGS");

	private static final SubLObject $$prettyString = reader_make_constant_shell(makeString("prettyString"));

	private static final SubLSymbol GET_PRETTY_STRING_CANONICAL = makeSymbol("GET-PRETTY-STRING-CANONICAL");

	private static final SubLObject $$prettyString_Canonical = reader_make_constant_shell(makeString("prettyString-Canonical"));

	private static final SubLInteger $int$100000 = makeInteger(100000);

	private static final SubLObject $$EnglishParaphraseMt = reader_make_constant_shell(makeString("EnglishParaphraseMt"));

	private static final SubLString $str788$Generating_pretty_strings___ = makeString("Generating pretty strings...");

	private static final SubLSymbol ACCUMULATOR_P = makeSymbol("ACCUMULATOR-P");

	public static final SubLList $list790 = list(makeSymbol("NL-GENERATION-CACHE-METHOD"));

	private static final SubLObject $$UnaryFunction = reader_make_constant_shell(makeString("UnaryFunction"));

	private static final SubLInteger $int$60 = makeInteger(60);

	private static final SubLInteger $int$120 = makeInteger(120);

	private static final SubLObject $$PrettyStringGenerationMt = reader_make_constant_shell(makeString("PrettyStringGenerationMt"));

	private static final SubLSymbol $sym796$_EXCLUDE_VULGARITIES__ = makeSymbol("*EXCLUDE-VULGARITIES?*");

	private static final SubLList $list797 = list(makeSymbol("*EXCLUDE-SLANG?*"), makeSymbol("*EXCLUDE-VULGARITIES?*"));

	private static final SubLSymbol $sym798$_EXCLUDE_SLANG__ = makeSymbol("*EXCLUDE-SLANG?*");

	private static final SubLSymbol $sym799$_EXCLUDE_ARCHAIC_SPEECH__ = makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*");

	private static final SubLSymbol $sym800$_EXCLUDE_INDIRECT_RELATIONS__ = makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*");

	private static final SubLString $str801$Hit_hard_timeout_of__D_seconds_ge = makeString("Hit hard timeout of ~D seconds generating pretty strings for~% ~S");

	private static final SubLString $str802$Hit_soft_timeout_of__D_seconds_ge = makeString("Hit soft timeout of ~D seconds generating pretty strings for~% ~S");

	public static SubLObject initialize_pph_nbar_nart() {
		$pph_nbar_nart$.setGlobalValue(function_terms.naut_to_nart($list7));
		return $pph_nbar_nart$.getGlobalValue();
	}

	public static SubLObject pph_nbar_nart() {
		if (NIL == $pph_nbar_nart$.getGlobalValue()) {
			initialize_pph_nbar_nart();
		}
		return $pph_nbar_nart$.getGlobalValue();
	}

	public static SubLObject initialize_paraphrase_kb_feature() {
		if (NIL != list_utilities.every_in_list($sym9$VALID_CONSTANT_, $paraphrase_core_constants$.getGlobalValue(), UNPROVIDED)) {
			kb_control_vars.set_paraphrase_kb_loaded();
		} else {
			kb_control_vars.unset_paraphrase_kb_loaded();
		}
		return kb_control_vars.paraphrase_kb_loaded_p();
	}

	public static SubLObject pph_push_environment(final SubLObject keyword) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != stacks.stack_p($pph_current_environment$.getDynamicValue(thread))) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
				format_nil.force_format(T, $str12$__Pushing__S_onto_ENVIRONMENT___S, keyword, $pph_current_environment$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			stacks.stack_push(keyword, $pph_current_environment$.getDynamicValue(thread));
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
				format_nil.force_format(T, $str13$_S__, $pph_current_environment$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		}
		return $pph_current_environment$.getDynamicValue(thread);
	}

	public static SubLObject pph_pop_environment() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != stacks.stack_p($pph_current_environment$.getDynamicValue(thread))) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
				format_nil.force_format(T, $str15$__Popping_ENVIRONMENT___S____, $pph_current_environment$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			stacks.stack_pop($pph_current_environment$.getDynamicValue(thread));
			if (NIL != stacks.stack_empty_p($pph_current_environment$.getDynamicValue(thread))) {
				resource_pph_environment_stack($pph_current_environment$.getDynamicValue(thread));
			}
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
				format_nil.force_format(T, $str13$_S__, $pph_current_environment$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		}
		return $pph_current_environment$.getDynamicValue(thread);
	}

	public static SubLObject resource_pph_environment_stack(final SubLObject stack) {
		SubLObject release = NIL;
		try {
			release = seize_lock($resourced_pph_environment_stacks_lock$.getGlobalValue());
			queues.enqueue(stack, $resourced_pph_environment_stacks$.getGlobalValue());
		} finally {
			if (NIL != release) {
				release_lock($resourced_pph_environment_stacks_lock$.getGlobalValue());
			}
		}
		return NIL;
	}

	public static SubLObject get_resourced_pph_environment_stack() {
		SubLObject stack = NIL;
		SubLObject release = NIL;
		try {
			release = seize_lock($resourced_pph_environment_stacks_lock$.getGlobalValue());
			stack = queues.dequeue($resourced_pph_environment_stacks$.getGlobalValue());
		} finally {
			if (NIL != release) {
				release_lock($resourced_pph_environment_stacks_lock$.getGlobalValue());
			}
		}
		return stack;
	}

	public static SubLObject find_or_create_pph_context() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != stacks.stack_p($pph_current_environment$.getDynamicValue(thread))) {
			return $pph_current_environment$.getDynamicValue(thread);
		}
		final SubLObject resourced = get_resourced_pph_environment_stack();
		return NIL != resourced ? resourced : stacks.create_stack();
	}

	public static SubLObject with_paraphrase_context(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject keyword = NIL;
		destructuring_bind_must_consp(current, datum, $list18);
		keyword = current.first();
		final SubLObject body;
		current = body = current.rest();
		return list(CLET, $list20, list(PPH_PUSH_ENVIRONMENT, keyword), bq_cons(CUNWIND_PROTECT, append(body, $list22)));
	}

	public static SubLObject pph_environment_search(final SubLObject item) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
			format_nil.force_format(T, $str23$__Checking_environment_for__S___S, item, $pph_current_environment$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return makeBoolean((NIL != stacks.stack_p($pph_current_environment$.getDynamicValue(thread))) && (NIL != stacks.stack_find(item, $pph_current_environment$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject pph_precision_p(final SubLObject obj) {
		return makeBoolean((obj == T) || (NIL != pph_macros.pph_nested_arg_list_p(obj)));
	}

	public static SubLObject pph_current_precision() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return pph_vars.$paraphrase_precision$.getDynamicValue(thread);
	}

	public static SubLObject pph_terse_mode_p() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return list_utilities.sublisp_boolean(pph_vars.$pph_terse_modeP$.getDynamicValue(thread));
	}

	public static SubLObject pph_set_precision(final SubLObject new_precision) {
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
			format_nil.force_format(T, $str24$__Changing_paraphrase_precision_f, pph_current_precision(), new_precision, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		pph_vars.$paraphrase_precision$.setDynamicValue(new_precision);
		return pph_current_precision();
	}

	public static SubLObject pph_reset_precision(final SubLObject template) {
		if (pph_current_precision().isList()) {
			SubLObject new_precision = NIL;
			if (NIL != el_formula_p(template)) {
				SubLObject cdolist_list_var = pph_current_precision();
				SubLObject item = NIL;
				item = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (item.isInteger()) {
						SubLObject cdolist_list_var_$1 = list_utilities.tree_positions(at_utilities.get_generic_arg(item), template, UNPROVIDED, UNPROVIDED);
						SubLObject position = NIL;
						position = cdolist_list_var_$1.first();
						while (NIL != cdolist_list_var_$1) {
							new_precision = cons(position, new_precision);
							cdolist_list_var_$1 = cdolist_list_var_$1.rest();
							position = cdolist_list_var_$1.first();
						}
					} else if (item.isList()) {
						final SubLObject top_level = item.first();
						final SubLObject rest = item.rest();
						SubLObject cdolist_list_var_$2 = list_utilities.tree_positions(at_utilities.get_generic_arg(top_level), template, UNPROVIDED, UNPROVIDED);
						SubLObject position2 = NIL;
						position2 = cdolist_list_var_$2.first();
						while (NIL != cdolist_list_var_$2) {
							if (position2.isCons()) {
								new_precision = cons(append(position2, rest), new_precision);
							} else {
								new_precision = cons(cons(position2, rest), new_precision);
							}
							cdolist_list_var_$2 = cdolist_list_var_$2.rest();
							position2 = cdolist_list_var_$2.first();
						}
					}

					cdolist_list_var = cdolist_list_var.rest();
					item = cdolist_list_var.first();
				}
			} else if (NIL != find(template, pph_current_precision(), EQL, GET_GENERIC_ARG, UNPROVIDED, UNPROVIDED)) {
				new_precision = T;
			} else if (NIL != at_admitted.generic_arg_p(template)) {
				SubLObject cdolist_list_var = pph_current_precision();
				SubLObject item = NIL;
				item = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (item.isList() && template.eql(pph_cycl_template_from_arg_position(item))) {
						final SubLObject rest2 = item.rest();
						final SubLObject v_new = (NIL != list_utilities.singletonP(rest2)) ? rest2.first() : rest2;
						new_precision = cons(v_new, new_precision);
					}
					cdolist_list_var = cdolist_list_var.rest();
					item = cdolist_list_var.first();
				}
			}

			if ((!new_precision.equal(pph_current_precision())) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
				format_nil.force_format(T, $str26$__Changing_precision_from__S_to__, pph_current_precision(), new_precision, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			pph_set_precision(new_precision);
		}
		return pph_current_precision();
	}

	public static SubLObject pph_top_level_preciseP() {
		return eq(pph_current_precision(), T);
	}

	public static SubLObject pph_precise_in_argP(final SubLObject argnum) {
		if (pph_current_precision().isList()) {
			return subl_promotions.memberP(argnum, pph_current_precision(), UNPROVIDED, UNPROVIDED);
		}
		return list_utilities.sublisp_boolean(pph_current_precision());
	}

	public static SubLObject paraphrase_precision_for_arg(final SubLObject argnum, SubLObject formula) {
		if (formula == UNPROVIDED) {
			formula = NIL;
		}
		final SubLObject current = pph_current_precision();
		if (current.isAtom()) {
			return current;
		}
		if (NIL == argnum) {
			return current;
		}
		if (NIL != member(argnum, current, UNPROVIDED, UNPROVIDED)) {
			return T;
		}
		SubLObject precision = NIL;
		SubLObject cdolist_list_var = current;
		SubLObject item = NIL;
		item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (item.isCons() && item.first().eql(argnum)) {
				final SubLObject rest = item.rest();
				precision = cons(NIL != list_utilities.singletonP(rest) ? rest.first() : rest, precision);
			}
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		if ((NIL == precision) && (NIL != formula)) {
			precision = pph_precision_for_object(cycl_utilities.formula_arg(formula, argnum, UNPROVIDED), cycl_utilities.formula_args(formula, UNPROVIDED));
		}
		return precision;
	}

	public static SubLObject with_paraphrase_precision_for_arg(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list27);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject argnum = NIL;
		SubLObject formula = NIL;
		destructuring_bind_must_consp(current, datum, $list27);
		argnum = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list27);
		formula = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(WITH_PARAPHRASE_PRECISION, list(PARAPHRASE_PRECISION_FOR_ARG, argnum, formula), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list27);
		return NIL;
	}

	public static SubLObject pph_precision_for_object(final SubLObject v_object, final SubLObject objects) {
		if (NIL != list_utilities.lengthL(objects, TWO_INTEGER, UNPROVIDED)) {
			return NIL;
		}
		return pph_precision_for_object_int(pph_hl_to_el(v_object), Mapping.mapcar(PPH_HL_TO_EL, objects));
	}

	public static SubLObject pph_precision_for_object_int_internal(final SubLObject v_object, final SubLObject objects) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != el_formula_p(v_object)) {
			SubLObject precision = NIL;
			SubLObject cdolist_list_var = objects;
			SubLObject other = NIL;
			other = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != assertion_handles.assertion_p(other)) {
					other = pph_sentence_from_assertion(other);
				}
				if (((NIL != el_formula_p(other)) && (!other.equal(v_object))) && (NIL == pph_formula_with_dotsP(other))) {
					SubLObject cdolist_list_var_$3;
					final SubLObject different_args = cdolist_list_var_$3 = pph_different_args_remove_duplicates(pph_different_arg_positions(v_object, other), v_object);
					SubLObject different_arg = NIL;
					different_arg = cdolist_list_var_$3.first();
					while (NIL != cdolist_list_var_$3) {
						precision = cons(different_arg, precision);
						cdolist_list_var_$3 = cdolist_list_var_$3.rest();
						different_arg = cdolist_list_var_$3.first();
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				other = cdolist_list_var.first();
			}
			precision = pph_remove_subsumed(precision);
			return precision;
		}
		if (NIL != forts.fort_p(v_object)) {
			SubLObject precision = NIL;
			final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
			try {
				pph_vars.$paraphrase_mode$.bind($TEXT, thread);
				final SubLObject object_phrase = pph_methods.select_string_for_term(v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				precision = makeBoolean((NIL != object_phrase)
						&& (NIL != subl_promotions.memberP(pph_phrase.pph_phrase_output_list_string(object_phrase, UNPROVIDED), Mapping.mapcar(SELECT_STRING_FOR_TERM, list_utilities.remove_if_not(INDEXED_TERM_P, remove(v_object, objects, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), symbol_function(EQUALP), PPH_PHRASE_OUTPUT_LIST_STRING)));
			} finally {
				pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
			}
			return precision;
		}
		return NIL;
	}

	public static SubLObject pph_precision_for_object_int(final SubLObject v_object, final SubLObject objects) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_precision_for_object_int_internal(v_object, objects);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_PRECISION_FOR_OBJECT_INT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_PRECISION_FOR_OBJECT_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_PRECISION_FOR_OBJECT_INT, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(v_object, objects);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (v_object.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && objects.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_precision_for_object_int_internal(v_object, objects)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_object, objects));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_remove_subsumed(final SubLObject lists) {
		SubLObject ans = NIL;
		SubLObject cdolist_list_var = delete_duplicates(lists, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject this_list = NIL;
		this_list = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject subsumedP = NIL;
			if (NIL == subsumedP) {
				SubLObject csome_list_var = remove(this_list, lists, symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject other_list = NIL;
				other_list = csome_list_var.first();
				while ((NIL == subsumedP) && (NIL != csome_list_var)) {
					if (NIL != pph_prefix_listP(other_list, this_list, UNPROVIDED)) {
						subsumedP = T;
					}
					csome_list_var = csome_list_var.rest();
					other_list = csome_list_var.first();
				}
			}
			if (NIL == subsumedP) {
				ans = cons(this_list, ans);
			}
			cdolist_list_var = cdolist_list_var.rest();
			this_list = cdolist_list_var.first();
		}
		return ans;
	}

	public static SubLObject pph_prefix_listP(final SubLObject v_short, final SubLObject v_long, SubLObject test) {
		if (test == UNPROVIDED) {
			test = EQL;
		}
		if (v_long.isList() && (NIL == v_short)) {
			return T;
		}
		if ((NIL == list_utilities.proper_list_p(v_short)) || (NIL == list_utilities.proper_list_p(v_long))) {
			return NIL;
		}
		if (NIL != list_utilities.same_length_p(v_short, v_long)) {
			return NIL;
		}
		SubLObject diffP = NIL;
		SubLObject sameP = NIL;
		SubLObject list_var = NIL;
		SubLObject short_item = NIL;
		SubLObject n = NIL;
		list_var = v_short;
		short_item = list_var.first();
		for (n = ZERO_INTEGER; (NIL == diffP) && (NIL != list_var); diffP = makeBoolean(NIL == sameP), list_var = list_var.rest(), short_item = list_var.first(), n = add(ONE_INTEGER, n)) {
			final SubLObject long_item = nth(n, v_long);
			final SubLObject pcase_var = test;
			if (pcase_var.eql(EQ)) {
				sameP = eq(short_item, long_item);
			} else if (pcase_var.eql(EQL)) {
				sameP = eql(short_item, long_item);
			} else if (pcase_var.eql(EQUAL)) {
				sameP = equal(short_item, long_item);
			} else if (pcase_var.eql(EQUALP)) {
				sameP = equalp(short_item, long_item);
			} else {
				sameP = funcall(test, short_item, long_item);
			}

		}
		return makeBoolean(NIL == diffP);
	}

	public static SubLObject pph_get_nested_nth(final SubLObject items, SubLObject position) {
		return position.isList() ? list_utilities.get_nested_nth(items, position, UNPROVIDED) : nth(position, items);
	}

	public static SubLObject pph_set_nested_nth(final SubLObject items, SubLObject position, final SubLObject v_new) {
		if (position.isList()) {
			list_utilities.nreplace_nested_nth(items, position, v_new);
		} else {
			set_nth(position, items, v_new);
		}
		return items;
	}

	public static SubLObject pph_different_args_remove_duplicates(final SubLObject args, final SubLObject v_object) {
		SubLObject ans = NIL;
		SubLObject registered_terms = NIL;
		SubLObject cdolist_list_var = args;
		SubLObject arg = NIL;
		arg = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject v_term = pph_get_nested_nth(v_object, arg);
			if (NIL == subl_promotions.memberP(v_term, registered_terms, symbol_function(EQUAL), UNPROVIDED)) {
				registered_terms = cons(v_term, registered_terms);
				ans = cons(arg, ans);
			}
			cdolist_list_var = cdolist_list_var.rest();
			arg = cdolist_list_var.first();
		}
		return nreverse(ans);
	}

	public static SubLObject pph_different_arg_positions(final SubLObject formula1, final SubLObject formula2) {
		SubLObject different_args = NIL;
		SubLObject list_var = NIL;
		SubLObject arg1 = NIL;
		SubLObject arg_num = NIL;
		list_var = formula1;
		arg1 = list_var.first();
		for (arg_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg1 = list_var.first(), arg_num = add(ONE_INTEGER, arg_num)) {
			final SubLObject arg2 = cycl_utilities.formula_arg(formula2, arg_num, UNPROVIDED);
			if (!arg1.equal(arg2)) {
				if ((NIL != el_formula_p(arg1)) && (NIL != el_formula_p(arg2))) {
					SubLObject cdolist_list_var = pph_different_arg_positions(arg1, arg2);
					SubLObject sub_dif = NIL;
					sub_dif = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						if (sub_dif.isInteger()) {
							different_args = cons(list(arg_num, sub_dif), different_args);
						} else {
							different_args = cons(cons(arg_num, sub_dif), different_args);
						}
						cdolist_list_var = cdolist_list_var.rest();
						sub_dif = cdolist_list_var.first();
					}
				} else {
					different_args = cons(arg_num, different_args);
				}
			}
		}
		return nreverse(different_args);
	}

	public static SubLObject pph_dereference_arg_position(final SubLObject formula, final SubLObject arg_position) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject arg = pph_phrase.pph_unknown_cycl();
		SubLObject error_message = NIL;
		if (NIL == arg_position) {
			arg = formula;
		} else {
			try {
				thread.throwStack.push($catch_error_message_target$.getGlobalValue());
				final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
				try {
					Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
					try {
						arg = cycl_utilities.formula_arg_position(cycl_utilities.hl_to_el(formula), arg_position, arg);
					} catch (final Throwable catch_var) {
						Errors.handleThrowable(catch_var, NIL);
					}
				} finally {
					Errors.$error_handler$.rebind(_prev_bind_0, thread);
				}
			} catch (final Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
			} finally {
				thread.throwStack.pop();
			}
		}
		if (((NIL != error_message) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
			Errors.warn(error_message);
			force_output(StreamsLow.$error_output$.getDynamicValue(thread));
		}
		return values(arg, list_utilities.sublisp_boolean(error_message));
	}

	public static SubLObject pph_search_limit() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return NIL != pph_precise_in_argP(ZERO_INTEGER) ? ZERO_INTEGER : pph_vars.$pph_search_limit$.getDynamicValue(thread);
	}

	public static SubLObject pph_typed_genl_preds(final SubLObject pred, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		return (NIL != indexed_term_p(pred)) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$typedGenlPreds, pred, ONE_INTEGER, UNPROVIDED)) ? pph_typed_genl_preds_via_inference(pred, mt) : NIL;
	}

	public static SubLObject clear_pph_typed_genl_preds_via_inference() {
		final SubLObject cs = $pph_typed_genl_preds_via_inference_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_typed_genl_preds_via_inference(final SubLObject pred, final SubLObject mt) {
		return memoization_state.caching_state_remove_function_results_with_args($pph_typed_genl_preds_via_inference_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_typed_genl_preds_via_inference_internal(final SubLObject pred, final SubLObject mt) {
		final SubLObject var = $sym39$_TGP;
		final SubLObject allowed_modules_spec = $list40;
		final SubLObject tgps = pph_removal_ask_variable(var, list($$typedGenlPreds, pred, var), mt, allowed_modules_spec);
		return cardinality_estimates.sort_by_generality_estimate(tgps, $ASCENDING);
	}

	public static SubLObject pph_typed_genl_preds_via_inference(final SubLObject pred, final SubLObject mt) {
		SubLObject caching_state = $pph_typed_genl_preds_via_inference_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(PPH_TYPED_GENL_PREDS_VIA_INFERENCE, $pph_typed_genl_preds_via_inference_caching_state$, $int$64, EQL, TWO_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (pred.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pph_typed_genl_preds_via_inference_internal(pred, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject get_genformats(final SubLObject pred, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			ans = kb_mapping.gather_gaf_arg_index_with_predicate(pred, ONE_INTEGER, $$genFormat, UNPROVIDED, UNPROVIDED);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject get_pgus(final SubLObject v_term, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			ans = kb_mapping.gather_gaf_arg_index_with_predicate(v_term, ONE_INTEGER, $$preferredGenUnit, UNPROVIDED, UNPROVIDED);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject get_genphrases(final SubLObject v_term, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			ans = kb_mapping.gather_gaf_arg_index_with_predicate(v_term, ONE_INTEGER, $$genPhrase, UNPROVIDED, UNPROVIDED);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject get_words_denoting_col(final SubLObject col) {
		return kb_mapping_utilities.pred_values_in_any_mt(col, $$denotation, lexicon_utilities.denotatum_arg_of_pred_cached($$denotation), ONE_INTEGER, UNPROVIDED);
	}

	public static SubLObject determiner_stringP(final SubLObject string) {
		return pph_variable_handling.pph_string_is_posP(string, $$Determiner, $NEVER, UNPROVIDED);
	}

	public static SubLObject definite_determiner_stringP(final SubLObject string) {
		return pph_variable_handling.pph_string_is_posP(string, $$Determiner_Definite, $NEVER, UNPROVIDED);
	}

	public static SubLObject indefinite_determiner_stringP(final SubLObject string) {
		return pph_variable_handling.pph_string_is_posP(string, $$Determiner_Indefinite, $NEVER, UNPROVIDED);
	}

	public static SubLObject alternate_determiner(final SubLObject pred, final SubLObject list) {
		if (NIL == pred) {
			return NIL;
		}
		SubLObject ans = NIL;
		if (NIL == ans) {
			SubLObject csome_list_var = list;
			SubLObject element = NIL;
			element = csome_list_var.first();
			while ((NIL == ans) && (NIL != csome_list_var)) {
				if (element.isCons() && (NIL != member(pred, list_utilities.remove_if_not(FORT_P, element, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym55$PPH_GENL_PREDICATE_), UNPROVIDED))) {
					ans = find_if(symbol_function($sym56$PPH_DETERMINER_), element, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					if (NIL == ans) {
						ans = $NONE;
					}
				}
				csome_list_var = csome_list_var.rest();
				element = csome_list_var.first();
			}
		}
		return NIL != ans ? list(ans, NIL) : NIL;
	}

	public static SubLObject pph_add_determiner(final SubLObject determiner, final SubLObject string, SubLObject pred) {
		if (pred == UNPROVIDED) {
			pred = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((!string.isString()) || (!determiner.isCons())) {
			return string;
		}
		final SubLObject det_string = select_determiner_string(determiner, string, pred);
		if (NIL != det_string) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str58$__Adding_determiner__S___, det_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		} else if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
			Errors.warn($str59$__Couldn_t_find_a_determiner_for_, determiner);
			force_output(StreamsLow.$error_output$.getDynamicValue(thread));
		}

		return NIL != string_utilities.null_stringP(det_string) ? string : cconcatenate(det_string, new SubLObject[] { $$$_, string });
	}

	public static SubLObject pph_determinerP(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		if (NIL != subl_promotions.memberP(v_object, $determiner_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
			ans = T;
		}
		if ((NIL == ans) && (NIL != valid_constantP(v_object, UNPROVIDED))) {
			if ((NIL != v_object) && (NIL != member(v_object, $determiner_words$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
				ans = T;
			}
			if (NIL == ans) {
				final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
				final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
				final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
				try {
					mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
					mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
					mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
					final SubLObject val = kb_mapping_utilities.pred_values(v_object, $$posForms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					if (NIL == ans) {
						SubLObject csome_list_var;
						SubLObject x;
						for (csome_list_var = val, x = NIL, x = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = pph_genl_posP(x, $$Determiner, UNPROVIDED), csome_list_var = csome_list_var.rest(), x = csome_list_var.first()) {
						}
					}
				} finally {
					mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
					mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
				}
			}
		}
		return ans;
	}

	public static SubLObject letter_name_starts_with_vowelP(final SubLObject ch) {
		return find(ch, $$$aefhilmnorsx, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject consonant_or_yP(final SubLObject ch) {
		return makeBoolean((NIL != morphology.consonant_charP(ch)) || ch.equalp(CHAR_y));
	}

	public static SubLObject an_stringP(final SubLObject string) {
		if (NIL == string_utilities.non_empty_stringP(string)) {
			return NIL;
		}
		final SubLObject first_alphanumeric = position_if(symbol_function(ALPHANUMERIC_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject down_string = Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
		SubLObject ans = NIL;
		if (NIL != first_alphanumeric) {
			down_string = string_utilities.substring(down_string, first_alphanumeric, UNPROVIDED);
		}
		final SubLObject found_position = list_utilities.position_if_not(INTEGER_CHAR_P, down_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject first_non_int = (NIL != found_position) ? found_position : length(down_string);
		if (first_non_int.isPositive()) {
			final SubLObject v_int = read_from_string(string_utilities.substring(down_string, ZERO_INTEGER, first_non_int), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			final SubLObject int_paraphrase = (v_int.isInteger()) ? pph_methods.generate_integer_as_word(v_int) : NIL;
			down_string = (NIL != int_paraphrase) ? int_paraphrase : down_string;
		}
		if (NIL != string_utilities.starts_with_one_of(down_string, $force_prefix_with_a$.getGlobalValue())) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
				format_nil.force_format(T, $str66$Using__a____S_starts_with_one_of_, down_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			ans = $A;
		} else if (NIL != string_utilities.starts_with_one_of(down_string, $prefix_with_an$.getGlobalValue())) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
				format_nil.force_format(T, $str68$Using__an____S_starts_with_one_of, down_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			ans = $AN;
		} else if (NIL != string_utilities.starts_with_one_of(down_string, $prefix_with_a$.getGlobalValue())) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
				format_nil.force_format(T, $str70$Using__a____S_starts_with_one_of_, down_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			ans = $A;
		} else if ((NIL != string_utilities.starts_with(down_string, $$$u)) && ((NIL != string_utilities.upper_case_string_p(string)) || (NIL != member(down_string, $ucronyms$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)))) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
				format_nil.force_format(T, $str72$Using__a____S_is_an_acronym_start, down_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			ans = $A;
		}

		if (NIL == ans) {
			final SubLObject ch1 = Strings.sublisp_char(down_string, ZERO_INTEGER);
			final SubLObject ch2 = (NIL != list_utilities.lengthG(string, ONE_INTEGER, UNPROVIDED)) ? Strings.sublisp_char(down_string, ONE_INTEGER) : NIL;
			if ((NIL != list_utilities.lengthG(string, ONE_INTEGER, UNPROVIDED)) && (NIL != morphology.vowel_charP(ch1, UNPROVIDED))) {
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
					format_nil.force_format(T, $str73$Using__an____S_starts_with_a_vowe, string, ch1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				ans = $AN;
			} else if (NIL == letter_name_starts_with_vowelP(ch1)) {
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
					format_nil.force_format(T, $str74$Using__a____S_starts_with_a_non_v, string, ch1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				ans = $A;
			} else if (NIL != list_utilities.lengthE(string, ONE_INTEGER, UNPROVIDED)) {
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
					format_nil.force_format(T, $str75$Using__an____S_is_one_character_l, string, ch1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				ans = $AN;
			} else if ((NIL == morphology.vowel_charP(ch2, T)) && (NIL == find(ch1, $$$sf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
					format_nil.force_format(T, $str77$Using__an____S_starts_with_a_vowe, string, ch2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				ans = $AN;
			} else if (((NIL != letter_name_starts_with_vowelP(ch1)) && (NIL != pph_denots_of_acronym_string(string))) && (NIL != list_utilities.empty_list_p(pph_denots_of_string(string, NIL, $DENOT, T)))) {
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
					format_nil.force_format(T, $str79$Using__an____S_is_an_acronym_star, down_string, ch1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				ans = $AN;
			} else {
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
					format_nil.force_format(T, $str80$Defaulting_to__a__for__S_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				ans = $A;
			}

		}
		return eq(ans, $AN);
	}

	public static SubLObject pph_denots_of_acronym_string(final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject denots = NIL;
		final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
		final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				denots = lexicon_accessors.denots_of_acronym_string(string, UNPROVIDED, UNPROVIDED);
			} finally {
				final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return denots;
	}

	public static SubLObject pph_denots_of_string(final SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject skip_namestringsP) {
		if (abbrev_types == UNPROVIDED) {
			abbrev_types = NIL;
		}
		if (denot_type == UNPROVIDED) {
			denot_type = $DENOT;
		}
		if (skip_namestringsP == UNPROVIDED) {
			skip_namestringsP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject denots = NIL;
		final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
		final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				denots = lexicon_accessors.denots_of_string(string, abbrev_types, denot_type, skip_namestringsP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} finally {
				final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return denots;
	}

	public static SubLObject pph_case_kwP(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $pph_case_keywords$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject det_invisible_charP(final SubLObject v_char) {
		return eq(v_char, CHAR_question);
	}

	public static SubLObject pph_remove_html_tags(final SubLObject string, SubLObject just_anchor_tagsP) {
		if (just_anchor_tagsP == UNPROVIDED) {
			just_anchor_tagsP = NIL;
		}
		final SubLObject open = CHAR_less;
		final SubLObject close = CHAR_greater;
		if ((NIL == pph_string.pph_string_p(string)) || (NIL == pph_string.pph_string_position(open, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
			return string;
		}
		SubLObject non_tag_string = pph_string.pph_string_copy(string);
		SubLObject in_tagP = NIL;
		SubLObject next_char_to_set = ZERO_INTEGER;
		for (SubLObject sequence_var = string, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), original_char_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(original_char_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(original_char_num, end_index, sequence_var)) {
			final SubLObject item = subl_macros.do_sequence_index_valueP(original_char_num, sequence_var);
			if ((!original_char_num.isInteger()) || (!original_char_num.numL(ZERO_INTEGER))) {
				if (((!NIL.isInteger()) || (!original_char_num.isInteger())) || (!original_char_num.numGE(NIL))) {
					final SubLObject v_char = (item.isChar()) ? item : pph_string.pph_code_char(item);
					if (((NIL != pph_string.pph_char_E(v_char, open)) && (NIL != pph_html_tag_starts_atP(string, original_char_num))) && ((NIL == just_anchor_tagsP) || (NIL != pph_anchor_tagP(string, original_char_num)))) {
						in_tagP = T;
					} else if ((NIL != in_tagP) && (NIL != pph_string.pph_char_E(v_char, close))) {
						in_tagP = NIL;
					} else if (NIL == in_tagP) {
						pph_string.pph_set_nth_char(next_char_to_set, non_tag_string, v_char, NIL);
						next_char_to_set = add(next_char_to_set, ONE_INTEGER);
					}

				}
			}
			sequence_var = subl_macros.do_sequence_index_update(sequence_var);
			original_char_num = add(original_char_num, ONE_INTEGER);
		}
		non_tag_string = pph_string.pph_substring(non_tag_string, ZERO_INTEGER, next_char_to_set);
		return non_tag_string;
	}

	public static SubLObject pph_html_string_to_output_item(final SubLObject string) {
		final SubLObject tag_start_char = CHAR_less;
		final SubLObject tag_end_char = CHAR_greater;
		SubLObject sub_items = NIL;
		SubLObject curr_open_tag_chars = NIL;
		SubLObject curr_close_tag_chars = NIL;
		SubLObject in_open_tagP = NIL;
		SubLObject in_close_tagP = NIL;
		SubLObject curr_sub_item = pph_data_structures.new_pph_phrase_output_item($str82$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL == pph_string.pph_string_position(tag_start_char, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			return pph_data_structures.new_pph_phrase_output_item(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		for (SubLObject sequence_var = string, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), char_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(char_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(char_num, end_index, sequence_var)) {
			final SubLObject item = subl_macros.do_sequence_index_valueP(char_num, sequence_var);
			if ((!char_num.isInteger()) || (!char_num.numL(ZERO_INTEGER))) {
				if (((!NIL.isInteger()) || (!char_num.isInteger())) || (!char_num.numGE(NIL))) {
					final SubLObject v_char = (item.isChar()) ? item : pph_string.pph_code_char(item);
					if ((NIL != pph_string.pph_char_E(v_char, tag_start_char)) && (NIL != pph_html_tag_starts_atP(string, char_num))) {
						if (NIL != pph_string.pph_char_E(CHAR_slash, pph_string.pph_string_char(string, number_utilities.f_1X(char_num)))) {
							in_close_tagP = T;
							curr_close_tag_chars = cons(v_char, curr_close_tag_chars);
						} else {
							in_open_tagP = T;
							if (NIL == pph_string.pph_string_equalP($str82$, pph_data_structures.pph_phrase_output_item_string(curr_sub_item))) {
								sub_items = cons(curr_sub_item, sub_items);
								curr_sub_item = pph_data_structures.new_pph_phrase_output_item($str82$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							}
							curr_open_tag_chars = cons(v_char, curr_open_tag_chars);
						}
					} else if (NIL != in_open_tagP) {
						curr_open_tag_chars = cons(v_char, curr_open_tag_chars);
						if (NIL != pph_string.pph_char_E(v_char, tag_end_char)) {
							SubLObject current;
							final SubLObject datum = current = pph_data_structures.pph_phrase_output_item_html_tags(curr_sub_item);
							SubLObject open = NIL;
							SubLObject close = NIL;
							destructuring_bind_must_consp(current, datum, $list83);
							open = current.first();
							current = current.rest();
							destructuring_bind_must_consp(current, datum, $list83);
							close = current.first();
							current = current.rest();
							if (NIL == current) {
								final SubLObject new_tag = pph_string.pph_string_from_char_list(nreverse(curr_open_tag_chars));
								pph_data_structures.pph_phrase_output_item_set_html_tags(curr_sub_item, NIL != pph_string.pph_string_p(open) ? pph_string.pph_string_concatenate(open, new_tag) : new_tag, close);
								curr_open_tag_chars = NIL;
							} else {
								cdestructuring_bind_error(datum, $list83);
							}
							in_open_tagP = NIL;
						}
					} else if (NIL != in_close_tagP) {
						curr_close_tag_chars = cons(v_char, curr_close_tag_chars);
						if (NIL != pph_string.pph_char_E(v_char, tag_end_char)) {
							SubLObject current;
							final SubLObject datum = current = pph_data_structures.pph_phrase_output_item_html_tags(curr_sub_item);
							SubLObject open = NIL;
							SubLObject close = NIL;
							destructuring_bind_must_consp(current, datum, $list83);
							open = current.first();
							current = current.rest();
							destructuring_bind_must_consp(current, datum, $list83);
							close = current.first();
							current = current.rest();
							if (NIL == current) {
								final SubLObject new_tag = pph_string.pph_string_from_char_list(nreverse(curr_close_tag_chars));
								pph_data_structures.pph_phrase_output_item_set_html_tags(curr_sub_item, open, NIL != pph_string.pph_string_p(close) ? pph_string.pph_string_concatenate(close, new_tag) : new_tag);
								curr_close_tag_chars = NIL;
								in_close_tagP = NIL;
							} else {
								cdestructuring_bind_error(datum, $list83);
							}
						}
					} else {
						if (NIL != pph_data_structures.pph_phrase_output_item_html_close_tag(curr_sub_item)) {
							sub_items = cons(curr_sub_item, sub_items);
							curr_sub_item = pph_data_structures.new_pph_phrase_output_item($str82$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						}
						pph_data_structures.pph_phrase_output_item_set_string(curr_sub_item, cconcatenate(pph_data_structures.pph_phrase_output_item_string(curr_sub_item), pph_string.pph_string_from_char_list(list(v_char))));
					}

				}
			}
			sequence_var = subl_macros.do_sequence_index_update(sequence_var);
			char_num = add(char_num, ONE_INTEGER);
		}
		if ((NIL == pph_string.pph_string_equalP($str82$, pph_data_structures.pph_phrase_output_item_string(curr_sub_item))) || (NIL != pph_data_structures.pph_phrase_output_item_html_close_tag(curr_sub_item))) {
			sub_items = cons(curr_sub_item, sub_items);
		}
		return NIL != list_utilities.singletonP(sub_items) ? list_utilities.only_one(sub_items) : pph_data_structures.new_pph_phrase_output_item_nospace_group(nreverse(sub_items));
	}

	public static SubLObject pph_html_tag_starts_atP(final SubLObject string, final SubLObject left_angle_bracket_position) {
		final SubLObject preceded_by_hashP = makeBoolean(left_angle_bracket_position.isPositive() && CHAR_hash.eql(pph_string.pph_string_char(string, number_utilities.f_1_(left_angle_bracket_position))));
		final SubLObject tag_string = pph_string.pph_substring(string, left_angle_bracket_position, UNPROVIDED);
		if (NIL != preceded_by_hashP) {
			return NIL;
		}
		SubLObject cdolist_list_var = pph_vars.$pph_html_tags_added_by_system$.getGlobalValue();
		SubLObject tag = NIL;
		tag = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != pph_string.pph_string_starts_with(tag_string, tag, UNPROVIDED)) {
				return T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			tag = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject pph_anchor_tagP(final SubLObject string, final SubLObject left_angle_bracket_position) {
		return makeBoolean(Strings.sublisp_char(string, number_utilities.f_1X(left_angle_bracket_position)).equalp(CHAR_a) || Strings.sublisp_char(string, add(TWO_INTEGER, left_angle_bracket_position)).equalp(CHAR_a));
	}

	public static SubLObject pph_escape(SubLObject string) {
		SubLObject cdolist_list_var;
		final SubLObject non_pph_tag_locations = cdolist_list_var = non_pph_html_tag_locations(string);
		SubLObject location = NIL;
		location = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = location;
			SubLObject start = NIL;
			SubLObject end = NIL;
			destructuring_bind_must_consp(current, datum, $list84);
			start = current.first();
			current = end = current.rest();
			final SubLObject html_string = string_utilities.substring(string, start, number_utilities.f_1X(end));
			string = string_utilities.string_subst(html_escape(html_string, T), html_string, string, EQUAL);
			cdolist_list_var = cdolist_list_var.rest();
			location = cdolist_list_var.first();
		}
		return string;
	}

	public static SubLObject non_pph_html_tag_locations(final SubLObject string) {
		final SubLObject open = CHAR_less;
		final SubLObject close = CHAR_greater;
		if ((!string.isString()) || (NIL == find(open, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
			return NIL;
		}
		SubLObject start_of_current_tag = NIL;
		SubLObject tag_locations = NIL;
		for (SubLObject sequence_var = string, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), char_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(char_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(char_num, end_index, sequence_var)) {
			final SubLObject item = subl_macros.do_sequence_index_valueP(char_num, sequence_var);
			if ((!char_num.isInteger()) || (!char_num.numL(ZERO_INTEGER))) {
				if (((!NIL.isInteger()) || (!char_num.isInteger())) || (!char_num.numGE(NIL))) {
					final SubLObject v_char = (item.isChar()) ? item : pph_string.pph_code_char(item);
					if ((NIL != pph_string.pph_char_E(v_char, open)) && (NIL == pph_html_tag_starts_atP(string, char_num))) {
						start_of_current_tag = char_num;
					} else if ((NIL != start_of_current_tag) && (NIL != pph_string.pph_char_E(v_char, close))) {
						tag_locations = cons(cons(start_of_current_tag, char_num), tag_locations);
						start_of_current_tag = NIL;
					}

				}
			}
			sequence_var = subl_macros.do_sequence_index_update(sequence_var);
			char_num = add(char_num, ONE_INTEGER);
		}
		return tag_locations;
	}

	public static SubLObject remove_leading_html(final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject word = string;
		SubLObject html = string_utilities.$empty_string$.getGlobalValue();
		if ((NIL != pph_string.non_empty_pph_stringP(word)) && pph_string.pph_string_char(word, ZERO_INTEGER).eql(CHAR_less)) {
			final SubLObject pos = pph_string.pph_string_position(CHAR_greater, word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL != pos) {
				html = pph_string.pph_substring(word, ZERO_INTEGER, number_utilities.f_1X(pos));
				word = pph_string.pph_substring(word, number_utilities.f_1X(pos), UNPROVIDED);
				thread.resetMultipleValues();
				final SubLObject new_word = remove_leading_html(word);
				final SubLObject new_html = thread.secondMultipleValue();
				thread.resetMultipleValues();
				html = pph_string.pph_string_concatenate(html, new_html);
				word = new_word;
			}
		}
		return values(word, html);
	}

	public static SubLObject select_determiner_string(final SubLObject determiner, final SubLObject string, final SubLObject pred) {
		SubLObject word = remove_if($sym85$DET_INVISIBLE_CHAR_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL == determiner) {
			return string_utilities.$empty_string$.getGlobalValue();
		}
		SubLObject det = NIL;
		SubLObject v_case = NIL;
		destructuring_bind_must_consp(determiner, determiner, $list86);
		det = determiner.first();
		SubLObject current = determiner.rest();
		destructuring_bind_must_consp(current, determiner, $list86);
		v_case = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(determiner, $list86);
			return NIL;
		}
		if (det == $NONE) {
			return string_utilities.$empty_string$.getGlobalValue();
		}
		if ((NIL == det) || (NIL == pph_string.non_empty_pph_stringP(word))) {
			return string_utilities.$empty_string$.getGlobalValue();
		}
		word = pph_string.pph_string_downcase(remove_leading_html(word));
		if (NIL != determiner_stringP(pph_first_word(word, UNPROVIDED))) {
			return string_utilities.$empty_string$.getGlobalValue();
		}
		final SubLObject pcase_var = det;
		if ((pcase_var.eql($A) || pcase_var.eql($AN)) || pcase_var.eql($A_THE_WORD)) {
			return NIL != pph_pred_takes_indefinite_detP(pred) ? NIL != an_stringP(pph_string.pph_string_if_non_null_to_output_format(word, UNPROVIDED)) ? $$$an : $$$a : string_utilities.$empty_string$.getGlobalValue();
		}
		if (pcase_var.eql($THE) || pcase_var.eql($THE_THE_WORD)) {
			return NIL != definite_stringP(word) ? string_utilities.$empty_string$.getGlobalValue() : $$$the;
		}
		if (pcase_var.eql($EVERY) || pcase_var.eql($EVERY_THE_WORD)) {
			return $$$every;
		}
		if (pcase_var.eql($SOME) || pcase_var.eql($SOME_THE_WORD)) {
			return $$$some;
		}
		if (pcase_var.eql($ALL) || pcase_var.eql($ALL_THE_WORD)) {
			return $$$all;
		}
		if (pcase_var.eql($ANY) || pcase_var.eql($ANY_THE_WORD)) {
			return $$$any;
		}
		if (pcase_var.eql($THAT) || pcase_var.eql($THAT_THE_WORD)) {
			return $$$that;
		}
		if (pcase_var.eql($THIS) || pcase_var.eql($THIS_THE_WORD)) {
			return $$$this;
		}
		if (pcase_var.eql($THESE) || pcase_var.eql($THESE_THE_WORD)) {
			return $$$these;
		}
		if (pcase_var.eql($THOSE) || pcase_var.eql($THOSE_THE_WORD)) {
			return $$$those;
		}
		if (pcase_var.eql($EIN)) {
			return get_german_determiner_string(det, v_case, pred);
		}
		if (NIL != pph_types.pph_lexical_wordP(det)) {
			return lexicon_accessors.get_strings_of_type(det, $$Determiner, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
		}
		return string_utilities.$empty_string$.getGlobalValue();
	}

	public static SubLObject pph_pred_takes_indefinite_detP(final SubLObject pred) {
		SubLObject ans = T;
		ans = pph_genl_pos_predP(pred, $$singular_Generic, UNPROVIDED);
		return ans;
	}

	public static SubLObject pph_first_word(final SubLObject string, SubLObject split_char) {
		if (split_char == UNPROVIDED) {
			split_char = CHAR_space;
		}
		final SubLObject first_split = pph_string.pph_string_position(split_char, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject first_word = pph_string.pph_substring(string, ZERO_INTEGER, first_split);
		final SubLObject rest = (first_split.isInteger()) ? pph_string.pph_substring(string, number_utilities.f_1X(first_split), UNPROVIDED) : string_utilities.$empty_string$.getGlobalValue();
		return values(first_word, rest);
	}

	public static SubLObject definite_stringP(final SubLObject string) {
		final SubLObject first_word = pph_first_word(string, UNPROVIDED);
		return makeBoolean((NIL != lexicon_accessors.closed_lexical_class_string_case_insensitiveP(first_word, UNPROVIDED)) && (NIL != definite_determiner_stringP(first_word)));
	}

	public static SubLObject pph_definiteness_keyword_p(final SubLObject obj) {
		return subl_promotions.memberP(obj, $pph_definiteness_keywords$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_np_cycl_template_for_term_type(final SubLObject term_type, final SubLObject definiteness, SubLObject agr_pred, SubLObject use_otherP) {
		if (agr_pred == UNPROVIDED) {
			agr_pred = $$singular_Generic;
		}
		if (use_otherP == UNPROVIDED) {
			use_otherP = NIL;
		}
		if (NIL != definiteness) {
		}
		if (NIL == use_otherP) {
			if (((NIL != pph_english_contextP(UNPROVIDED)) && (NIL != definiteness)) && term_type.eql(pph_variable_handling.pph_default_var_type())) {
				return pph_thing_phrase_naut(definiteness);
			}
			if (((NIL != pph_english_contextP(UNPROVIDED)) && (NIL != definiteness)) && term_type.eql($$Place)) {
				final SubLObject place_phrase_naut = pph_place_phrase_naut(definiteness);
				if (NIL != pph_types.pph_phrase_nautP(place_phrase_naut)) {
					return place_phrase_naut;
				}
			} else if (((NIL != pph_english_contextP(UNPROVIDED)) && (NIL != definiteness)) && (NIL != pph_indefinite_personal_pronoun_referent_typeP(term_type))) {
				final SubLObject agent_phrase_naut = pph_agent_phrase_naut(definiteness);
				if (NIL != pph_types.pph_phrase_nautP(agent_phrase_naut)) {
					return agent_phrase_naut;
				}
			}

		}
		if (((NIL != pph_top_level_preciseP()) && ($UNIVERSAL == definiteness)) && (NIL != pph_genl_pos_predP($$singular_Generic, agr_pred, UNPROVIDED))) {
			agr_pred = $$singular_Generic;
		}
		final SubLObject nbar_definiteness = (definiteness == $BACKREFERENCE_CLASSB) ? NIL : definiteness;
		final SubLObject nbar_template = pph_nbar_cycl_template_for_term_type(term_type, nbar_definiteness, agr_pred, use_otherP);
		return pph_np_for_nbar(nbar_template, definiteness);
	}

	public static SubLObject pph_detp_cycl_template_for_term_type(final SubLObject term_type, final SubLObject definiteness, SubLObject agr_pred, SubLObject use_otherP) {
		if (agr_pred == UNPROVIDED) {
			agr_pred = $$singular_Generic;
		}
		if (use_otherP == UNPROVIDED) {
			use_otherP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		return NIL != pph_genlP(term_type, $$ScalarInterval, pph_vars.$pph_domain_mt$.getDynamicValue(thread)) ? make_binary_formula(pph_functions.phraseformfn(), $list124, make_el_formula(pph_functions.concatenatephrasesfn(), list(pph_np_cycl_template_for_term_type(term_type, definiteness, agr_pred, use_otherP), bq_cons(pph_functions.bestnlwordformoflexemefn(), $list125)), UNPROVIDED))
				: make_binary_formula(pph_functions.phraseformfn(), $list124, pph_det_naut_for_definiteness(definiteness));
	}

	public static SubLObject pph_indefinite_personal_pronoun_referent_typeP(final SubLObject term_type) {
		return subl_promotions.memberP(term_type, $list126, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_np_cycl_for_term_type(final SubLObject term_type, final SubLObject definiteness, SubLObject agr_pred) {
		if (agr_pred == UNPROVIDED) {
			agr_pred = $$singular_Generic;
		}
		return pph_apply_template(pph_np_cycl_template_for_term_type(term_type, definiteness, agr_pred, UNPROVIDED), term_type);
	}

	public static SubLObject pph_thing_phrase_naut(final SubLObject definiteness) {
		SubLObject thing_string = NIL;
		if (definiteness.eql($UNIVERSAL)) {
			thing_string = $$$everything;
		} else if (definiteness.eql($INDEFINITE)) {
			thing_string = $$$something;
		} else if (definiteness.eql($DEFINITE)) {
			thing_string = $$$it;
		} else if ((definiteness.eql($DEMONSTRATIVE_CLASSA) || definiteness.eql($DEMONSTRATIVE_CLASSB)) || definiteness.eql($DEMONSTRATIVE_CLASSC)) {
			thing_string = $$$that;
		} else if ((definiteness.eql($BACKREFERENCE_CLASSA) || definiteness.eql($BACKREFERENCE_CLASSB)) || definiteness.eql($BACKREFERENCE_CLASSC)) {
			thing_string = $$$that_thing;
		} else if (definiteness.eql($NO)) {
			thing_string = $$$nothing;
		} else if (definiteness.eql($ANY)) {
			thing_string = $$$anything;
		} else if (definiteness.eql($WHAT)) {
			thing_string = $$$what;
		} else {
			final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy($str145$Don_t_know_how_to_make_thing_stri) });
			pph_error.pph_handle_error(new_format_string, list(definiteness));
			thing_string = $$$something;
		}

		SubLObject ans = make_binary_formula(pph_functions.phraseformfn(), $$singular, pph_types.pph_phrase_naut_for_string(thing_string));
		final SubLObject phrase_cycl_fn = constants_high.find_constant($$$PhraseCycLFn);
		if (NIL != valid_constantP(phrase_cycl_fn, UNPROVIDED)) {
			ans = make_binary_formula(phrase_cycl_fn, $$Thing, ans);
		}
		return ans;
	}

	public static SubLObject pph_place_phrase_naut(final SubLObject definiteness) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject place_string = NIL;
		if (definiteness.eql($UNIVERSAL)) {
			place_string = $$$everyplace;
		} else if (definiteness.eql($INDEFINITE)) {
			place_string = $$$someplace;
		} else if (definiteness.eql($NO)) {
			place_string = $$$nowhere;
		} else if (definiteness.eql($ANY)) {
			place_string = $$$anywhere;
		} else if (definiteness.eql($WHAT)) {
			place_string = $$$what_places;
		}

		if (NIL != pph_definite_english_determiner_type_p(definiteness)) {
			place_string = $$$that_place;
			return make_binary_formula(pph_functions.phraseformfn(), $$singular, pph_types.pph_phrase_naut_for_string(place_string));
		}
		if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
			Errors.warn($str155$Don_t_know_how_to_make_place_stri, definiteness);
			force_output(StreamsLow.$error_output$.getDynamicValue(thread));
		}
		return $UNKNOWN;
	}

	public static SubLObject pph_agent_phrase_naut(final SubLObject definiteness) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject agent_string = NIL;
		if (definiteness.eql($UNIVERSAL)) {
			agent_string = $$$everyone;
		} else if (definiteness.eql($INDEFINITE)) {
			agent_string = $$$someone;
		} else if (definiteness.eql($NO)) {
			agent_string = $$$noone;
		} else if (definiteness.eql($ANY)) {
			agent_string = $$$anyone;
		} else {
			if (!definiteness.eql($WHAT)) {
				if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
					Errors.warn($str162$Don_t_know_how_to_make_an_agent_s, definiteness);
					force_output(StreamsLow.$error_output$.getDynamicValue(thread));
				}
				return $UNKNOWN;
			}
			agent_string = $$$who;
		}

		return make_binary_formula(pph_functions.phraseformfn(), $$singular, pph_types.pph_phrase_naut_for_string(agent_string));
	}

	public static SubLObject pph_definite_english_determiner_type_p(final SubLObject determiner_type) {
		return subl_promotions.memberP(determiner_type, $pph_definite_english_determiner_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_np_for_nbar(final SubLObject nbar_cycl, final SubLObject definiteness) {
		if (NIL != definiteness) {
		}
		final SubLObject det = pph_det_naut_for_definiteness(definiteness);
		return NIL != det ? list(pph_functions.bestdetnbarfn(), det, nbar_cycl) : nbar_cycl;
	}

	public static SubLObject pph_det_naut_for_definiteness(final SubLObject definiteness) {
		if (definiteness.eql($UNIVERSAL)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list164);
		}
		if (definiteness.eql($INDEFINITE)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list165);
		}
		if (definiteness.eql($DEFINITE)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list166);
		}
		if (definiteness.eql($WHAT)) {
			return bq_cons(pph_functions.bestnlphraseofstringfn(), $list167);
		}
		if (definiteness.eql($NO)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list168);
		}
		if (definiteness.eql($ANY)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list169);
		}
		if (definiteness.eql($DEMONSTRATIVE_CLASSA)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list170);
		}
		if (definiteness.eql($DEMONSTRATIVE_CLASSB)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list171);
		}
		if (definiteness.eql($DEMONSTRATIVE_CLASSC)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list172);
		}
		if (definiteness.eql($BACKREFERENCE_CLASSA)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list173);
		}
		if (definiteness.eql($BACKREFERENCE_CLASSB)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list174);
		}
		if (definiteness.eql($BACKREFERENCE_CLASSC)) {
			return bq_cons(pph_functions.termparaphrasefn(), $list175);
		}
		return NIL;
	}

	public static SubLObject pph_best_demonstrative_attr_cXb(final SubLObject nbar_cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return NIL != kb_mapping.gather_gaf_arg_index_with_predicate($$Demonstrative_ClassC_NLAttr, FOUR_INTEGER, $$denotation, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED) ? $$Demonstrative_ClassC_NLAttr : $$Demonstrative_ClassB_NLAttr;
	}

	public static SubLObject pph_best_backreference_attr_cXb(final SubLObject nbar_cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return NIL != kb_mapping.gather_gaf_arg_index_with_predicate($$Backreference_ClassC_NLAttr, FOUR_INTEGER, $$denotation, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED) ? $$Backreference_ClassC_NLAttr : $$Backreference_ClassB_NLAttr;
	}

	public static SubLObject specs_fn_natP(final SubLObject v_term) {
		return makeBoolean((NIL != possibly_nat_p(v_term)) && cycl_utilities.nat_function(v_term).eql($$SpecsFn));
	}

	public static SubLObject pph_make_type_level(final SubLObject constraint_col) {
		return make_unary_formula($$SpecsFn, constraint_col);
	}

	public static SubLObject pph_nbar_cycl_template_for_term_type(final SubLObject term_type, SubLObject definiteness, SubLObject agr_pred, SubLObject add_otherP) {
		if (definiteness == UNPROVIDED) {
			definiteness = NIL;
		}
		if (agr_pred == UNPROVIDED) {
			agr_pred = $$singular_Generic;
		}
		if (add_otherP == UNPROVIDED) {
			add_otherP = NIL;
		}
		if (NIL != definiteness) {
		}
		final SubLObject term_type_template = pph_identity_template();
		SubLObject core_phrase_naut = NIL;
		if ((NIL != pph_top_level_preciseP()) && (NIL != specs_fn_natP(term_type))) {
			core_phrase_naut = make_instance_of_naut(agr_pred, term_type_template, definiteness);
		} else if (NIL != cycl_variables.el_varP(term_type)) {
			core_phrase_naut = make_instance_of_naut(agr_pred, term_type_template, definiteness);
		} else if (definiteness == $BACKREFERENCE_CLASSB) {
			final SubLObject core_nbar_naut = pph_nbar_cycl_template_for_term_type(term_type, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			final SubLObject backreference_naut = pph_np_for_nbar(core_nbar_naut, definiteness);
			final SubLObject instance_of_naut = core_phrase_naut = make_instance_of_naut_from_np_naut(agr_pred, backreference_naut);
		} else {
			core_phrase_naut = list(pph_functions.termparaphrasefn_constrained(), agr_pred, term_type_template);
		}

		if (NIL != add_otherP) {
			core_phrase_naut = list(pph_functions.concatenatephrasesfn(), bq_cons(pph_functions.bestnlphraseofstringfn(), $list181), list(pph_functions.headwordofphrasefn(), core_phrase_naut));
		}
		return list(pph_functions.phraseformfn(), $list7, core_phrase_naut);
	}

	public static SubLObject pph_nbar_cycl_for_term_type(final SubLObject term_type, SubLObject definiteness, SubLObject agr_pred, SubLObject add_otherP) {
		if (definiteness == UNPROVIDED) {
			definiteness = NIL;
		}
		if (agr_pred == UNPROVIDED) {
			agr_pred = $$singular_Generic;
		}
		if (add_otherP == UNPROVIDED) {
			add_otherP = NIL;
		}
		return pph_apply_template(pph_nbar_cycl_template_for_term_type(term_type, definiteness, agr_pred, add_otherP), term_type);
	}

	public static SubLObject make_instance_of_naut(SubLObject agr_pred, final SubLObject term_type, final SubLObject definiteness) {
		if (NIL == pph_genl_pos_predP(agr_pred, $$simpleNounStrings, UNPROVIDED)) {
			agr_pred = $$singular_Generic;
		}
		return make_instance_of_naut_from_np_naut(agr_pred, list(pph_functions.phraseformfn(), $$NounPhrase, list(pph_functions.termparaphrasefn_constrained(), $$singular_Generic, term_type)));
	}

	public static SubLObject make_instance_of_naut_from_np_naut(final SubLObject agr_pred, final SubLObject np_naut) {
		return list(pph_functions.concatenatephrasesfn(), list(pph_functions.headwordofphrasefn(), list(pph_functions.phraseformfn(), agr_pred, bq_cons(pph_functions.bestnlwordformoflexemefn_constrained(), $list184))), pph_types.pph_phrase_naut_for_string($$$of), np_naut);
	}

	public static SubLObject get_german_determiner_string(final SubLObject determiner, final SubLObject v_case, final SubLObject pred) {
		if ((v_case != $NOMINATIVE) || (determiner != $EIN)) {
			return string_utilities.$empty_string$.getGlobalValue();
		}
		if (pred.eql($$singular_Feminine)) {
			return $$$eine;
		}
		if (pred.eql($$singular_Masculine)) {
			return $$$ein;
		}
		return string_utilities.$empty_string$.getGlobalValue();
	}

	public static SubLObject numeric_det_agr_pred(final SubLObject cycl) {
		if (cycl.isNumber() && cycl.numE(ONE_INTEGER)) {
			return $$singular_Generic;
		}
		if (NIL != formula_pattern_match.formula_matches_pattern(cycl, $list191)) {
			return $$singular_Generic;
		}
		return $$plural_Generic;
	}

	public static SubLObject pph_numeric_det_cyclP(final SubLObject cycl) {
		if (cycl.isNumber()) {
			return T;
		}
		if ((NIL != narts_high.naut_p(cycl)) && (NIL != member(cycl_utilities.nat_functor(cycl), $list193, UNPROVIDED, UNPROVIDED))) {
			return T;
		}
		if (NIL != parsing_utilities.nl_tagP(cycl, UNPROVIDED)) {
			return NIL;
		}
		if (NIL != pph_isaP(cycl, $$NumericInterval, UNPROVIDED)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject clear_pph_var_typing_predicates() {
		final SubLObject cs = $pph_var_typing_predicates_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_var_typing_predicates() {
		return memoization_state.caching_state_remove_function_results_with_args($pph_var_typing_predicates_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_var_typing_predicates_internal() {
		final SubLObject alist = transform_list_utilities.transform(copy_tree($pph_var_typing_predicates$.getGlobalValue()), STRINGP, FIND_CONSTANT, UNPROVIDED);
		return delete(NIL, alist, symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_var_typing_predicates() {
		SubLObject caching_state = $pph_var_typing_predicates_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(PPH_VAR_TYPING_PREDICATES, $pph_var_typing_predicates_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(pph_var_typing_predicates_internal()));
			memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_var_type_from_asent(final SubLObject asent) {
		return nth_value_step_2(nth_value_step_1(ONE_INTEGER), pph_parse_var_typing_clause(asent, UNPROVIDED));
	}

	public static SubLObject pph_parse_var_typing_clause(final SubLObject asent, SubLObject arg_position_map) {
		if (arg_position_map == UNPROVIDED) {
			arg_position_map = pph_new_empty_map();
		}
		SubLObject current;
		final SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
		SubLObject pred = NIL;
		SubLObject var = NIL;
		SubLObject raw_type = NIL;
		destructuring_bind_must_consp(current, datum, $list201);
		pred = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list201);
		var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list201);
		raw_type = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject template = (NIL != pph_var_typing_predicateP(pred, UNPROVIDED)) ? list_utilities.alist_lookup_without_values(pph_var_typing_predicates(), pred, symbol_function($sym55$PPH_GENL_PREDICATE_), NIL) : NIL;
			final SubLObject type = (NIL != template) ? pph_apply_template(template, raw_type) : NIL;
			final SubLObject arg2_map = pph_figure_new_arg_position_map(arg_position_map, $ARG2);
			final SubLObject var_type_position = (NIL != template) ? pph_var_type_position(template) : NIL;
			final SubLObject type_map = pph_contextualize_map(var_type_position, arg2_map);
			return values(var, type, type_map);
		}
		cdestructuring_bind_error(datum, $list201);
		return NIL;
	}

	public static SubLObject pph_var_typing_predicateP(final SubLObject pred, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		return set.set_memberP(pred, all_pph_var_typing_predicates(mt));
	}

	public static SubLObject clear_all_pph_var_typing_predicates() {
		final SubLObject cs = $all_pph_var_typing_predicates_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_all_pph_var_typing_predicates(SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		return memoization_state.caching_state_remove_function_results_with_args($all_pph_var_typing_predicates_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject all_pph_var_typing_predicates_internal(final SubLObject mt) {
		final SubLObject preds = set.new_set(EQUAL, UNPROVIDED);
		SubLObject cdolist_list_var = pph_var_typing_predicates();
		SubLObject cons = NIL;
		cons = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = cons;
			SubLObject pred = NIL;
			SubLObject value = NIL;
			destructuring_bind_must_consp(current, datum, $list204);
			pred = current.first();
			current = value = current.rest();
			set_utilities.set_add_all(genl_predicates.all_spec_preds(pred, mt, UNPROVIDED), preds);
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		return preds;
	}

	public static SubLObject all_pph_var_typing_predicates(SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		SubLObject caching_state = $all_pph_var_typing_predicates_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(ALL_PPH_VAR_TYPING_PREDICATES, $all_pph_var_typing_predicates_caching_state$, EIGHT_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
			memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_ALL_PPH_VAR_TYPING_PREDICATES);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(all_pph_var_typing_predicates_internal(mt)));
			memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject clear_pph_var_type_position() {
		final SubLObject cs = $pph_var_type_position_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_var_type_position(final SubLObject construction_template) {
		return memoization_state.caching_state_remove_function_results_with_args($pph_var_type_position_caching_state$.getGlobalValue(), list(construction_template), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_var_type_position_internal(final SubLObject construction_template) {
		if (NIL != pph_identity_template_p(construction_template)) {
			return NIL;
		}
		if (NIL != el_formula_p(construction_template)) {
			return pph_arg_position(pph_identity_template(), construction_template, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject pph_var_type_position(final SubLObject construction_template) {
		SubLObject caching_state = $pph_var_type_position_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(PPH_VAR_TYPE_POSITION, $pph_var_type_position_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, construction_template, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(pph_var_type_position_internal(construction_template)));
			memoization_state.caching_state_put(caching_state, construction_template, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_arg_position(final SubLObject item, final SubLObject cycl, SubLObject test) {
		if (test == UNPROVIDED) {
			test = symbol_function(EQL);
		}
		final SubLObject arg_positions = cycl_utilities.arg_positions_bfs(item, cycl, test);
		final SubLObject arg_position = (NIL != arg_positions) ? arg_positions.first() : pph_unknown_arg_position();
		return arg_position;
	}

	public static SubLObject pph_var_typing_clauseP(final SubLObject asent, SubLObject var, SubLObject validity_test) {
		if (var == UNPROVIDED) {
			var = NIL;
		}
		if (validity_test == UNPROVIDED) {
			validity_test = $sym209$PPH_VALID_VAR_TYPE_;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != formula_arityE(asent, TWO_INTEGER, UNPROVIDED)) {
			thread.resetMultipleValues();
			final SubLObject arg1 = pph_parse_var_typing_clause(asent, UNPROVIDED);
			final SubLObject type = thread.secondMultipleValue();
			final SubLObject type_arg_position = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			return makeBoolean((((NIL != cycl_variables.el_varP(arg1)) && ((NIL == var) || arg1.eql(var))) && (NIL == pph_methods_formulas.pph_exceptional_var_p(arg1))) && (NIL != funcall(validity_test, type)));
		}
		return NIL;
	}

	public static SubLObject pph_valid_relevant_var_typeP(final SubLObject type) {
		return makeBoolean(((NIL != pph_valid_var_typeP(type)) && (NIL == pph_irrelevant_fort(type, UNPROVIDED, UNPROVIDED))) && (NIL == pph_proof.pph_irrelevant_formulaP(type, UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject pph_valid_var_typeP(final SubLObject type) {
		return makeBoolean((((NIL != indexed_term_p(type)) || (NIL != cycl_variables.el_varP(type))) || (NIL != term.nautP(type, UNPROVIDED))) && (NIL == pph_variable_handling.pph_quoted_collectionP(type)));
	}

	public static SubLObject pph_prepend_explicit_universal_string(final SubLObject unbound_vars, final SubLObject var_type_string, final SubLObject string) {
		final SubLObject universal_string = cconcatenate($$$for_any_, new SubLObject[] { format_nil.format_nil_a_no_copy(NIL != var_type_string ? var_type_string : pph_methods_formulas.generate_conjunctive_sequence(unbound_vars)), $str211$__it_is_the_case_that_ });
		return cconcatenate(universal_string, string);
	}

	public static SubLObject pph_remove_extra_spaces(final SubLObject string) {
		if (NIL != pph_string.pph_string_find_if(WHITESPACEP, string)) {
			return pph_remove_extra_spaces_int(string);
		}
		return string;
	}

	public static SubLObject pph_remove_extra_spaces_int_internal(SubLObject string) {
		SubLObject chars = NIL;
		SubLObject changedP = NIL;
		for (SubLObject sequence_var = string, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), char_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(char_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(char_num, end_index, sequence_var)) {
			final SubLObject item = subl_macros.do_sequence_index_valueP(char_num, sequence_var);
			if ((!char_num.isInteger()) || (!char_num.numL(ZERO_INTEGER))) {
				if (((!NIL.isInteger()) || (!char_num.isInteger())) || (!char_num.numGE(NIL))) {
					final SubLObject v_char = (item.isChar()) ? item : pph_string.pph_code_char(item);
					if (NIL != pph_space_to_zapP(v_char, string, char_num, chars)) {
						changedP = T;
					} else {
						chars = cons(v_char, chars);
					}
				}
			}
			sequence_var = subl_macros.do_sequence_index_update(sequence_var);
			char_num = add(char_num, ONE_INTEGER);
		}
		if (NIL != changedP) {
			final SubLObject new_string = string = pph_string.pph_string_from_char_list(nreverse(chars));
		}
		return string;
	}

	public static SubLObject pph_remove_extra_spaces_int(final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_remove_extra_spaces_int_internal(string);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_REMOVE_EXTRA_SPACES_INT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_REMOVE_EXTRA_SPACES_INT, ONE_INTEGER, $int$250, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_REMOVE_EXTRA_SPACES_INT, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_remove_extra_spaces_int_internal(string)));
			memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_space_to_zapP(final SubLObject v_char, final SubLObject string, final SubLObject char_num, final SubLObject found_non_spaceP) {
		return makeBoolean(v_char.eql(CHAR_space) && (((NIL == found_non_spaceP) || (NIL != pph_zap_leading_space_at_char_numP(string, char_num))) || (NIL != pph_zap_following_space_at_char_numP(string, char_num))));
	}

	public static SubLObject pph_zap_leading_space_at_char_numP(final SubLObject string, final SubLObject char_num) {
		final SubLObject next_char_num = number_utilities.f_1X(char_num);
		return pph_remove_space_beforeP(string, next_char_num);
	}

	public static SubLObject pph_remove_space_beforeP(final SubLObject string, SubLObject start) {
		if (start == UNPROVIDED) {
			start = ZERO_INTEGER;
		}
		SubLObject zapP = list_utilities.lengthE(string, start, UNPROVIDED);
		if (NIL != pph_final_punctuation_string_p(string)) {
			zapP = T;
		} else if ((NIL == zapP) && (NIL == zapP)) {
			SubLObject csome_list_var;
			SubLObject punc;
			SubLObject end;
			for (csome_list_var = $pph_remove_spaces_before$.getGlobalValue(), punc = NIL, punc = csome_list_var.first(); (NIL == zapP)
					&& (NIL != csome_list_var); zapP = makeBoolean((string_utilities.first_char(punc).eql(pph_string.pph_string_char(string, start)) && (NIL != list_utilities.lengthGE(string, end, UNPROVIDED))) && (NIL != pph_string.pph_substringP(punc, string, symbol_function(EQUAL), start, end))), csome_list_var = csome_list_var.rest(), punc = csome_list_var.first()) {
				end = add(start, length(punc));
			}
		}

		return zapP;
	}

	public static SubLObject pph_final_punctuation_string_p(final SubLObject string) {
		return makeBoolean((NIL != pph_word_final_punctuation_string_p(string)) || (NIL != pph_sentence_final_punctuation_string_p(string)));
	}

	public static SubLObject pph_word_final_punctuation_string_p(final SubLObject string) {
		return makeBoolean((string.isString() && (NIL != list_utilities.lengthE(string, ONE_INTEGER, UNPROVIDED))) && (NIL != find(string_utilities.first_char(string), $pph_word_final_punctuation_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject pph_sentence_final_punctuation_string_p(final SubLObject string) {
		return makeBoolean((string.isString() && (NIL != list_utilities.lengthE(string, ONE_INTEGER, UNPROVIDED))) && (NIL != pph_sentence_final_punctuation_char_p(string_utilities.first_char(string))));
	}

	public static SubLObject pph_sentence_final_punctuation_char_p(final SubLObject v_char) {
		return find(v_char, $str216$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_zap_following_space_at_char_numP(final SubLObject string, final SubLObject char_num) {
		SubLObject zapP = NIL;
		final SubLObject prev_char_num = number_utilities.f_1_(char_num);
		if (NIL == zapP) {
			SubLObject csome_list_var;
			SubLObject punc;
			for (csome_list_var = $pph_remove_spaces_after$.getGlobalValue(), punc = NIL, punc = csome_list_var.first(); (NIL == zapP)
					&& (NIL != csome_list_var); zapP = makeBoolean(string_utilities.last_char(punc).eql(pph_string.pph_string_char(string, prev_char_num)) && (NIL != pph_string.pph_string_ends_with(pph_string.pph_substring(string, ZERO_INTEGER, char_num), punc, UNPROVIDED))), csome_list_var = csome_list_var.rest(), punc = csome_list_var.first()) {
			}
		}
		return zapP;
	}

	public static SubLObject clean_bunge_nreverse(SubLObject strings, SubLObject add_spaceP) {
		if (add_spaceP == UNPROVIDED) {
			add_spaceP = T;
		}
		strings = list_utilities.delete_if_not($sym217$NON_EMPTY_PPH_STRING_, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject strings_to_bunge = (NIL != list_utilities.lengthL(strings, TWO_INTEGER, UNPROVIDED)) ? strings : clean_reverse(strings);
		return NIL != add_spaceP ? pph_string.pph_bunge(strings_to_bunge) : apply(symbol_function(CCONCATENATE), strings_to_bunge);
	}

	public static SubLObject clean_reverse(final SubLObject strings) {
		SubLObject curr_string = NIL;
		SubLObject strings_to_bunge = NIL;
		SubLObject cdolist_list_var = strings;
		SubLObject prev_string = NIL;
		prev_string = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ((NIL != pph_string.pph_string_p(curr_string))
					&& (((((NIL != pph_string.pph_string_starts_with(curr_string, html_macros.$html_superscript_head$.getGlobalValue(), UNPROVIDED)) || (NIL != pph_string.pph_string_ends_with(prev_string, html_macros.$html_unordered_list_tail$.getGlobalValue(), UNPROVIDED))) || (NIL != pph_string.pph_string_ends_with(prev_string, html_macros.$html_ordered_list_tail$.getGlobalValue(), UNPROVIDED)))
							|| pph_string.pph_string_last_char(prev_string).eql(CHAR_newline)) || (NIL != pph_remove_space_beforeP(pph_remove_html_tags(curr_string, UNPROVIDED), UNPROVIDED)))) {
				curr_string = pph_string.pph_string_concatenate(prev_string, curr_string);
			} else {
				if (NIL != pph_string.pph_string_p(curr_string)) {
					strings_to_bunge = cons(curr_string, strings_to_bunge);
				}
				curr_string = prev_string;
			}
			cdolist_list_var = cdolist_list_var.rest();
			prev_string = cdolist_list_var.first();
		}
		strings_to_bunge = cons(curr_string, strings_to_bunge);
		return strings_to_bunge;
	}

	public static SubLObject add_period_smart(final SubLObject string) {
		return add_final_punctuation_smart(string, $str219$_);
	}

	public static SubLObject add_question_mark_smart(final SubLObject string) {
		return add_final_punctuation_smart(string, $str220$_);
	}

	public static SubLObject add_final_punctuation_smart(final SubLObject string, SubLObject punc_string) {
		if (punc_string == UNPROVIDED) {
			punc_string = $str219$_;
		}
		if (NIL != pph_punctuation_ok_after_stringP(string, punc_string)) {
			return cconcatenate(string, punc_string);
		}
		return string;
	}

	public static SubLObject pph_punctuation_ok_after_stringP(final SubLObject string, final SubLObject punc_string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean(((NIL != pph_string.non_empty_pph_stringP(string)) && (NIL == subl_promotions.memberP(punc_string, pph_vars.$pph_suppressed_final_punctuation_strings$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED))) && (((NIL == string_utilities.punctuation_p(pph_string.pph_string_last_char(string))) || pph_string.pph_string_last_char(string).eql(CHAR_rparen))
				|| ((NIL != find(pph_string.pph_string_last_char(string), $str221$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((NIL == list_utilities.lengthG(string, ONE_INTEGER, UNPROVIDED)) || (NIL == pph_sentence_final_punctuation_char_p(pph_string.pph_string_char_from_end(string, ONE_INTEGER)))))));
	}

	public static SubLObject add_quotes_smart(SubLObject string) {
		if ((!string.isString()) || (NIL == find(Strings.sublisp_char(string, ZERO_INTEGER), $str222$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
			string = format_nil.format_nil_s(string);
		}
		return string;
	}

	public static SubLObject pph_dont_capitalizeP(final SubLObject string) {
		if (NIL != string_utilities.starts_with_one_of(string, $pph_strings_to_not_capitalize$.getGlobalValue())) {
			return T;
		}
		return NIL;
	}

	public static SubLObject upcase_leading_smart(final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject string_sans_leading_html = remove_leading_html(string);
		final SubLObject leading_html = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == pph_dont_capitalizeP(string_sans_leading_html)) {
			SubLObject doneP = NIL;
			final SubLObject blank = string_utilities.first_char(pph_vars.$pph_blank_string$.getGlobalValue());
			for (SubLObject sequence_var = string_sans_leading_html, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), i = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(i, end_index, sequence_var); (NIL == sequence_doneP) && (NIL == doneP); sequence_doneP = subl_macros.do_sequence_index_doneP(i, end_index, sequence_var)) {
				final SubLObject item = subl_macros.do_sequence_index_valueP(i, sequence_var);
				if ((!i.isInteger()) || (!i.numL(ZERO_INTEGER))) {
					if (((!NIL.isInteger()) || (!i.isInteger())) || (!i.numGE(NIL))) {
						SubLObject v_char = (item.isChar()) ? item : pph_string.pph_code_char(item);
						if (v_char.isInteger()) {
							v_char = code_char(v_char);
						}
						if (NIL != string_utilities.alphanumeric_char_p(v_char)) {
							if ((NIL != alpha_char_p(v_char)) && ((!i.numGE(TWO_INTEGER)) || (NIL == pph_string.pph_string_equalP(constant_reader.constant_reader_prefix(), pph_string.pph_substring(string_sans_leading_html, subtract(i, TWO_INTEGER), i))))) {
								pph_string.pph_nupcase_nth(string_sans_leading_html, i, UNPROVIDED);
							}
							doneP = T;
						} else if (v_char.eql(blank)) {
							doneP = T;
						}

					}
				}
				sequence_var = subl_macros.do_sequence_index_update(sequence_var);
				i = add(i, ONE_INTEGER);
			}
		}
		return pph_string.pph_string_concatenate(leading_html, string_sans_leading_html);
	}

	public static SubLObject add_title_capitalization(final SubLObject string) {
		assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
		SubLObject new_strings = NIL;
		final SubLObject break_chars = $$$_;
		SubLObject word_chars = NIL;
		SubLObject first_word_doneP = NIL;
		SubLObject end_var_$6;
		SubLObject end_var;
		SubLObject char_num;
		SubLObject v_char;
		SubLObject break_charP;
		SubLObject word;
		for (end_var = end_var_$6 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$6); char_num = number_utilities.f_1X(char_num)) {
			v_char = Strings.sublisp_char(string, char_num);
			break_charP = find(v_char, break_chars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL == break_charP) {
				word_chars = cons(v_char, word_chars);
			} else if (NIL != list_utilities.non_empty_list_p(word_chars)) {
				word = pph_case_correct_word_from_chars(word_chars, first_word_doneP);
				new_strings = cons(word, new_strings);
				new_strings = cons(Strings.make_string(ONE_INTEGER, v_char), new_strings);
				first_word_doneP = T;
				word_chars = NIL;
			} else {
				new_strings = cons(Strings.make_string(ONE_INTEGER, v_char), new_strings);
			}

		}
		if (NIL != list_utilities.non_empty_list_p(word_chars)) {
			final SubLObject word2 = pph_case_correct_word_from_chars(word_chars, first_word_doneP);
			new_strings = cons(word2, new_strings);
		}
		return upcase_leading_smart(apply(symbol_function(CCONCATENATE), nreverse(new_strings)));
	}

	public static SubLObject pph_case_correct_word_from_chars(final SubLObject word_chars, final SubLObject first_word_doneP) {
		final SubLObject word = pph_string.pph_string_from_char_list(nreverse(word_chars));
		final SubLObject case_correct = (NIL != first_word_doneP) ? pph_ncapitalize_for_title(word) : word;
		return case_correct;
	}

	public static SubLObject pph_ncapitalize_for_title(final SubLObject word) {
		if (NIL != string_utilities.empty_string_p(word)) {
			return word;
		}
		if (NIL != upper_case_p(string_utilities.first_char(word))) {
			return word;
		}
		if (NIL != lexicon_accessors.closed_lexical_class_string_case_insensitiveP(word, UNPROVIDED)) {
			return word;
		}
		if (NIL != pph_dont_capitalizeP(word)) {
			return word;
		}
		return upcase_leading_smart(word);
	}

	public static SubLObject pph_rephrase_cycl(SubLObject cycl) {
		SubLObject template = pph_identity_template();
		if (NIL != el_formula_p(cycl)) {
			cycl = pph_possibly_nartify(cycl);
			template = pph_rephrase_template_for_cycl(cycl);
			if (NIL == pph_identity_template_p(template)) {
				cycl = pph_apply_template(template, cycl);
			}
		}
		return values(cycl, template);
	}

	public static SubLObject pph_possibly_nartify(SubLObject cycl) {
		if ((NIL != possibly_naut_p(cycl)) && ((NIL != indexed_term_p(cycl_utilities.nat_functor(cycl))) || (NIL != possibly_naut_p(cycl_utilities.nat_functor(cycl))))) {
			cycl = pph_possibly_nartify_internal(cycl);
		}
		return cycl;
	}

	public static SubLObject pph_possibly_nartify_internal_internal(SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != possibly_naut_p(cycl)) && ((NIL != indexed_term_p(cycl_utilities.nat_functor(cycl))) || (NIL != possibly_naut_p(cycl_utilities.nat_functor(cycl))))) {
			final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
			try {
				pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EVERYTHING, thread);
				final SubLObject nart = narts_high.find_nart(cycl);
				if (NIL != nart_handles.nart_p(nart)) {
					cycl = nart;
				}
			} finally {
				pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
			}
		}
		return cycl;
	}

	public static SubLObject pph_possibly_nartify_internal(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_possibly_nartify_internal_internal(cycl);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_POSSIBLY_NARTIFY_INTERNAL, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_POSSIBLY_NARTIFY_INTERNAL, ONE_INTEGER, $int$128, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_POSSIBLY_NARTIFY_INTERNAL, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_possibly_nartify_internal_internal(cycl)));
			memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_nart_substitute_internal(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
		try {
			pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EVERYTHING, thread);
			ans = narts_high.nart_substitute(cycl);
		} finally {
			pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject pph_nart_substitute(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_nart_substitute_internal(cycl);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_NART_SUBSTITUTE, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_NART_SUBSTITUTE, ONE_INTEGER, $int$32, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_NART_SUBSTITUTE, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_nart_substitute_internal(cycl)));
			memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_possibly_nartify_phrase(final SubLObject phrase) {
		final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
		final SubLObject nart = pph_possibly_nartify(cycl);
		if (NIL != nart_handles.nart_p(nart)) {
			pph_phrase.pph_phrase_set_cycl(phrase, nart);
		}
		return phrase;
	}

	public static SubLObject pph_phrase_rephrase_cycl(final SubLObject phrase, SubLObject template, SubLObject justs) {
		if (template == UNPROVIDED) {
			template = NIL;
		}
		if (justs == UNPROVIDED) {
			justs = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == pph_vars.pph_maximize_linksP()) {
			pph_phrase_resolution.pph_phrase_resolve_current_list_items(phrase);
			final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
			if (NIL != el_formula_p(cycl)) {
				if (NIL == template) {
					thread.resetMultipleValues();
					final SubLObject indexical_cycl = pph_process_indexicals(cycl);
					final SubLObject indexical_justs = thread.secondMultipleValue();
					thread.resetMultipleValues();
					SubLObject cdolist_list_var = indexical_justs;
					SubLObject just = NIL;
					just = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						pph_phrase.pph_phrase_add_justification(phrase, just);
						cdolist_list_var = cdolist_list_var.rest();
						just = cdolist_list_var.first();
					}
					pph_phrase.pph_phrase_set_cycl(phrase, indexical_cycl);
					thread.resetMultipleValues();
					final SubLObject template_$7 = pph_rephrase_template_for_cycl(indexical_cycl);
					final SubLObject justs_$8 = thread.secondMultipleValue();
					thread.resetMultipleValues();
					template = template_$7;
					justs = justs_$8;
				}
				if (NIL == pph_identity_template_p(template)) {
					pph_phrase.pph_phrase_reset_cycl(phrase, template);
					if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
						format_nil.force_format(T, $str229$Rephrased_CycL_to__S, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					SubLObject cdolist_list_var2 = justs;
					SubLObject just2 = NIL;
					just2 = cdolist_list_var2.first();
					while (NIL != cdolist_list_var2) {
						pph_phrase.pph_phrase_add_justification(phrase, just2);
						cdolist_list_var2 = cdolist_list_var2.rest();
						just2 = cdolist_list_var2.first();
					}
				}
			}
		}
		return values(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), pph_phrase.pph_phrase_arg_position_map(phrase));
	}

	public static SubLObject pph_rephrase_update(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject cycl = NIL;
		SubLObject template = NIL;
		SubLObject justifications = NIL;
		SubLObject new_template = NIL;
		SubLObject new_justs = NIL;
		destructuring_bind_must_consp(current, datum, $list230);
		cycl = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list230);
		template = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list230);
		justifications = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list230);
		new_template = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list230);
		new_justs = current.first();
		current = current.rest();
		if (NIL == current) {
			return list(PUNLESS, list(PPH_IDENTITY_TEMPLATE_P, new_template), list(PPH_NOTE, ONE_INTEGER, $str234$__Rephrasing__S___, cycl), list(CSETQ, cycl, list(PPH_APPLY_TEMPLATE, new_template, cycl)), list(PPH_NOTE, ONE_INTEGER, $str237$New_CycL___S___, cycl), list(CSETQ, template, list(PPH_APPLY_TEMPLATE, new_template, template)), list(CSETQ, justifications, list(APPEND, justifications, new_justs)),
					list(PWHEN, justifications, list(PPH_NOTE, ONE_INTEGER, $str240$Justifications___S___, justifications)));
		}
		cdestructuring_bind_error(datum, $list230);
		return NIL;
	}

	public static SubLObject pph_rephrase_template_for_cycl(SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject template = pph_identity_template();
		SubLObject justifications = NIL;
		thread.resetMultipleValues();
		SubLObject new_template = pph_rephrase_template_for_subj_role_formula(cycl);
		SubLObject new_justs = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == pph_identity_template_p(new_template)) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str234$__Rephrasing__S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			cycl = pph_apply_template(new_template, cycl);
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str237$New_CycL___S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			template = pph_apply_template(new_template, template);
			justifications = append(justifications, new_justs);
			if ((NIL != justifications) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
				format_nil.force_format(T, $str240$Justifications___S___, justifications, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		}
		thread.resetMultipleValues();
		new_template = pph_rephrase_template_from_expansion(cycl);
		new_justs = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == pph_identity_template_p(new_template)) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str234$__Rephrasing__S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			cycl = pph_apply_template(new_template, cycl);
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str237$New_CycL___S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			template = pph_apply_template(new_template, template);
			justifications = append(justifications, new_justs);
			if ((NIL != justifications) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
				format_nil.force_format(T, $str240$Justifications___S___, justifications, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		}
		if ((NIL != el_negation_p(cycl)) && (NIL != el_conjunction_p(cycl_utilities.formula_arg1(cycl, UNPROVIDED)))) {
			thread.resetMultipleValues();
			new_template = pph_rephrase_template_from_negated_conjunction(cycl);
			new_justs = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL == pph_identity_template_p(new_template)) {
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
					format_nil.force_format(T, $str234$__Rephrasing__S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				cycl = pph_apply_template(new_template, cycl);
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
					format_nil.force_format(T, $str237$New_CycL___S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				template = pph_apply_template(new_template, template);
				justifications = append(justifications, new_justs);
				if ((NIL != justifications) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
					format_nil.force_format(T, $str240$Justifications___S___, justifications, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
			}
		}
		thread.resetMultipleValues();
		new_template = pph_rephrase_template_from_universal_introduction(cycl);
		new_justs = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == pph_identity_template_p(new_template)) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str234$__Rephrasing__S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			cycl = pph_apply_template(new_template, cycl);
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str237$New_CycL___S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			template = pph_apply_template(new_template, template);
			justifications = append(justifications, new_justs);
			if ((NIL != justifications) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
				format_nil.force_format(T, $str240$Justifications___S___, justifications, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		}
		if (NIL != cycl_utilities.expression_find_if(EL_CONJUNCTION_P, cycl, UNPROVIDED, UNPROVIDED)) {
			thread.resetMultipleValues();
			new_template = pph_rephrase_template_from_conjunct_reordering(cycl);
			new_justs = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL == pph_identity_template_p(new_template)) {
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
					format_nil.force_format(T, $str234$__Rephrasing__S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				cycl = pph_apply_template(new_template, cycl);
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
					format_nil.force_format(T, $str237$New_CycL___S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				template = pph_apply_template(new_template, template);
				justifications = append(justifications, new_justs);
				if ((NIL != justifications) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
					format_nil.force_format(T, $str240$Justifications___S___, justifications, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
			}
		}
		return values(template, justifications);
	}

	public static SubLObject pph_indexicals_to_resolve() {
		return $list242;
	}

	public static SubLObject pph_indexical_to_resolve_p(final SubLObject cycl) {
		return makeBoolean((NIL != subl_promotions.memberP(cycl, pph_indexicals_to_resolve(), UNPROVIDED, UNPROVIDED)) || ((NIL != el_formula_p(cycl)) && (NIL != formula_pattern_match.formula_matches_pattern(cycl, $list243))));
	}

	public static SubLObject pph_process_indexicals(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject new_cycl = cycl;
		final SubLObject justifications = NIL;
		final SubLObject _prev_bind_0 = $pph_unresolvable_indexicals$.currentBinding(thread);
		try {
			$pph_unresolvable_indexicals$.bind(set.new_set(symbol_function(EQUAL), UNPROVIDED), thread);
			new_cycl = cycl_utilities.expression_transform(new_cycl, PPH_POSSIBLY_PROCESSABLE_INDEXICAL_P, PPH_PROCESS_INDEXICAL, UNPROVIDED, UNPROVIDED);
		} finally {
			$pph_unresolvable_indexicals$.rebind(_prev_bind_0, thread);
		}
		return values(new_cycl, justifications);
	}

	public static SubLObject pph_possibly_processable_indexical_p(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean((NIL == set.set_memberP(cycl, $pph_unresolvable_indexicals$.getDynamicValue(thread))) && ((NIL != pph_possibly_resolvable_indexical_p(cycl, UNPROVIDED)) || (NIL != pph_possibly_indexicalizeable_cycl_p(cycl))));
	}

	public static SubLObject pph_possibly_indexicalizeable_cycl_p(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != pph_vars.$pph_use_indexical_datesP$.getDynamicValue(thread)) && (NIL != date_utilities.date_p(cycl))) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_resolve_if_explicit_indexical(final SubLObject cycl) {
		final SubLObject ans = (NIL != pph_possibly_resolvable_indexical_p(cycl, UNPROVIDED)) ? pph_explicit_indexical_referent(cycl, UNPROVIDED) : cycl;
		final SubLObject justifications = NIL;
		return values(ans, justifications);
	}

	public static SubLObject pph_possibly_resolvable_indexical_p(final SubLObject cycl, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		return pph_indexical_to_resolve_p(cycl);
	}

	public static SubLObject pph_introduce_indexicals(SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject template = pph_identity_template();
		SubLObject justifications = NIL;
		thread.resetMultipleValues();
		final SubLObject new_template = pph_introduce_indexicals_for_dates(cycl);
		final SubLObject new_justs = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == pph_identity_template_p(new_template)) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str234$__Rephrasing__S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			cycl = pph_apply_template(new_template, cycl);
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str237$New_CycL___S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			template = pph_apply_template(new_template, template);
			justifications = append(justifications, new_justs);
			if ((NIL != justifications) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
				format_nil.force_format(T, $str240$Justifications___S___, justifications, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		}
		if (NIL == pph_identity_template_p(template)) {
			cycl = pph_apply_template(template, cycl);
		}
		return values(cycl, justifications);
	}

	public static SubLObject pph_introduce_indexicals_for_dates(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject template = pph_identity_template();
		SubLObject justs = NIL;
		if ((NIL != pph_vars.$pph_use_indexical_datesP$.getDynamicValue(thread)) && (NIL != cycl_utilities.expression_find_if(DATE_P, v_object, UNPROVIDED, UNPROVIDED))) {
			final SubLObject raw_template = pph_find_indexical_template_for_dates(v_object);
			if (!raw_template.equal(v_object)) {
				template = raw_template;
				justs = list(pph_phrase.pph_code_justification($INDEXICAL_DATE, UNPROVIDED));
			}
		}
		return values(template, justs);
	}

	public static SubLObject pph_find_indexical_template_for_dates(final SubLObject v_object) {
		if (NIL != date_utilities.date_p(v_object)) {
			return pph_find_indexical_template_for_date(v_object);
		}
		if (NIL != el_formula_p(v_object)) {
			return map_formula_terms(PPH_FIND_INDEXICAL_TEMPLATE_FOR_DATES, v_object, UNPROVIDED);
		}
		return v_object;
	}

	public static SubLObject pph_find_indexical_template_for_date(final SubLObject v_object) {
		final SubLObject matching_indexical = find(v_object, pph_indexical_dates(), $sym249$PPH_DATE_MATCHES_INDEXICAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject template = (NIL != matching_indexical) ? matching_indexical : NIL != el_formula_p(v_object) ? map_formula_terms(PPH_FIND_INDEXICAL_TEMPLATE_FOR_DATES, v_object, UNPROVIDED) : v_object;
		return template;
	}

	public static SubLObject pph_resolve_indexicals(SubLObject cycl, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject template = pph_identity_template();
		SubLObject justifications = NIL;
		thread.resetMultipleValues();
		final SubLObject new_template = pph_resolve_indexicals_for_dates(cycl, mt);
		final SubLObject new_justs = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == pph_identity_template_p(new_template)) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str234$__Rephrasing__S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			cycl = pph_apply_template(new_template, cycl);
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str237$New_CycL___S___, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			template = pph_apply_template(new_template, template);
			justifications = append(justifications, new_justs);
			if ((NIL != justifications) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
				format_nil.force_format(T, $str240$Justifications___S___, justifications, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		}
		if (NIL == pph_identity_template_p(template)) {
			cycl = pph_apply_template(template, cycl);
		}
		if (NIL != pph_speech_act.pph_addressee_known_p()) {
			cycl = cycl_utilities.formula_subst(pph_vars.$pph_addressee$.getDynamicValue(thread), $$Addressee, cycl, UNPROVIDED, UNPROVIDED);
		}
		return values(cycl, justifications);
	}

	public static SubLObject pph_resolve_indexicals_for_dates(final SubLObject v_object, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		SubLObject template = pph_identity_template();
		if (NIL != cycl_utilities.expression_find_if(PPH_INDEXICAL_DATE_P, v_object, UNPROVIDED, UNPROVIDED)) {
			final SubLObject raw_template = pph_find_template_for_indexical_dates(v_object, mt);
			if (!raw_template.equal(v_object)) {
				template = raw_template;
			}
		}
		return template;
	}

	public static SubLObject pph_find_template_for_indexical_dates(final SubLObject v_object, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != pph_indexical_date_p(v_object)) {
			return pph_find_template_for_indexical_date(v_object, mt);
		}
		if (NIL != el_formula_p(v_object)) {
			SubLObject ans = NIL;
			final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
			try {
				pph_vars.$pph_domain_mt$.bind(mt, thread);
				ans = map_formula_terms(PPH_FIND_TEMPLATE_FOR_INDEXICAL_DATES, v_object, UNPROVIDED);
			} finally {
				pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
			}
			return ans;
		}
		return v_object;
	}

	public static SubLObject pph_find_template_for_indexical_date(final SubLObject v_object, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLObject template;
		final SubLObject matching_date = template = pph_indexical_referent(v_object, mt);
		return template;
	}

	public static SubLObject pph_explicit_indexical_indexical(final SubLObject explicit_indexical) {
		if (NIL != formula_pattern_match.formula_matches_pattern(explicit_indexical, $list243)) {
			return cycl_utilities.nat_arg1(explicit_indexical, UNPROVIDED);
		}
		return explicit_indexical;
	}

	public static SubLObject pph_process_indexical(final SubLObject indexical) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject referent = indexical;
		if (NIL != pph_possibly_resolvable_indexical_p(indexical, UNPROVIDED)) {
			referent = pph_explicit_indexical_referent(indexical, UNPROVIDED);
		} else if (NIL != pph_possibly_indexicalizeable_cycl_p(indexical)) {
			referent = pph_find_indexical_template_for_date(indexical);
		}

		if (referent.equal(indexical)) {
			set.set_add(indexical, $pph_unresolvable_indexicals$.getDynamicValue(thread));
		}
		return referent;
	}

	public static SubLObject pph_explicit_indexical_referent(final SubLObject explicit_indexical, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLObject indexical = pph_explicit_indexical_indexical(explicit_indexical);
		final SubLObject referent = pph_ask_variable($sym253$_ABSOLUTE, listS($$indexicalReferent, indexical, $list255), mt, ZERO_INTEGER, ONE_INTEGER).first();
		return referent;
	}

	public static SubLObject pph_indexical_referent(final SubLObject indexical, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLObject referent = pph_ask_variable($sym253$_ABSOLUTE, listS($$indexicalReferent, indexical, $list255), mt, ZERO_INTEGER, ONE_INTEGER).first();
		return referent;
	}

	public static SubLObject clear_pph_indexical_dates() {
		final SubLObject cs = $pph_indexical_dates_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_indexical_dates() {
		return memoization_state.caching_state_remove_function_results_with_args($pph_indexical_dates_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_indexical_dates_internal() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject dates = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			final SubLObject node_var = $$IndexicalFirstOrderTerm;
			final SubLObject _prev_bind_0_$9 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
			final SubLObject _prev_bind_1_$10 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
			try {
				sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$quotedIsa), thread);
				sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
				try {
					SubLObject node_var_$11 = node_var;
					final SubLObject deck_type = $STACK;
					final SubLObject recur_deck = deck.create_deck(deck_type);
					final SubLObject _prev_bind_0_$10 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
					try {
						sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
						try {
							final SubLObject tv_var = NIL;
							final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
							final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
							try {
								sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
								sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
								if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
									final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
									if (pcase_var.eql($ERROR)) {
										sbhl_paranoia.sbhl_error(ONE_INTEGER, $str266$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									} else if (pcase_var.eql($CERROR)) {
										sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str266$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									} else if (pcase_var.eql($WARN)) {
										Errors.warn($str266$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
									} else {
										Errors.warn($str271$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
										Errors.cerror($$$continue_anyway, $str266$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
									}

								}
								final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
								final SubLObject _prev_bind_1_$12 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
								final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
								final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
								final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
								try {
									sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
									sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
									sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
									sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
									sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
									if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
										final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
										final SubLObject _prev_bind_1_$13 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
										final SubLObject _prev_bind_2_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
										try {
											sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
											sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
											sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
											sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$11, UNPROVIDED);
											while (NIL != node_var_$11) {
												final SubLObject tt_node_var = node_var_$11;
												SubLObject cdolist_list_var;
												final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$quotedIsa));
												SubLObject module_var = NIL;
												module_var = cdolist_list_var.first();
												while (NIL != cdolist_list_var) {
													final SubLObject _prev_bind_0_$14 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
													final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
													try {
														sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
														sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
														final SubLObject node = function_terms.naut_to_nart(tt_node_var);
														if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
															final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
															if (NIL != d_link) {
																final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																if (NIL != mt_links) {
																	SubLObject iteration_state;
																	for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
																		thread.resetMultipleValues();
																		final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
																		final SubLObject tv_links = thread.secondMultipleValue();
																		thread.resetMultipleValues();
																		if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
																			final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																			try {
																				sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
																				SubLObject iteration_state_$23;
																				for (iteration_state_$23 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$23); iteration_state_$23 = dictionary_contents.do_dictionary_contents_next(iteration_state_$23)) {
																					thread.resetMultipleValues();
																					final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$23);
																					final SubLObject link_nodes = thread.secondMultipleValue();
																					thread.resetMultipleValues();
																					if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
																						final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																						try {
																							sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
																							final SubLObject sol = link_nodes;
																							if (NIL != set.set_p(sol)) {
																								final SubLObject set_contents_var = set.do_set_internal(sol);
																								SubLObject basis_object;
																								SubLObject state;
																								SubLObject indexical;
																								SubLObject expiration_date;
																								for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
																									indexical = set_contents.do_set_contents_next(basis_object, state);
																									if ((NIL != set_contents.do_set_contents_element_validP(state, indexical)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(indexical, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																										sbhl_marking_utilities.sbhl_mark_node_marked(indexical, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																										if (NIL != isa.isaP(indexical, $$Date, UNPROVIDED, UNPROVIDED)) {
																											expiration_date = nth_value_step_2(nth_value_step_1(ONE_INTEGER), pph_indexical_date_referent_cached(indexical));
																											if ((NIL != expiration_date) && (NIL == pph_expiration_date_pastP(expiration_date))) {
																												dates = cons(indexical, dates);
																											}
																										}
																									}
																								}
																							} else if (sol.isList()) {
																								SubLObject csome_list_var = sol;
																								SubLObject indexical2 = NIL;
																								indexical2 = csome_list_var.first();
																								while (NIL != csome_list_var) {
																									if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(indexical2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																										sbhl_marking_utilities.sbhl_mark_node_marked(indexical2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																										if (NIL != isa.isaP(indexical2, $$Date, UNPROVIDED, UNPROVIDED)) {
																											final SubLObject expiration_date2 = nth_value_step_2(nth_value_step_1(ONE_INTEGER), pph_indexical_date_referent_cached(indexical2));
																											if ((NIL != expiration_date2) && (NIL == pph_expiration_date_pastP(expiration_date2))) {
																												dates = cons(indexical2, dates);
																											}
																										}
																									}
																									csome_list_var = csome_list_var.rest();
																									indexical2 = csome_list_var.first();
																								}
																							} else {
																								Errors.error($str273$_A_is_neither_SET_P_nor_LISTP_, sol);
																							}

																						} finally {
																							sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$16, thread);
																						}
																					}
																				}
																				dictionary_contents.do_dictionary_contents_finalize(iteration_state_$23);
																			} finally {
																				sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$15, thread);
																			}
																		}
																	}
																	dictionary_contents.do_dictionary_contents_finalize(iteration_state);
																}
															} else {
																sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str274$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
															}
															if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
																SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
																SubLObject instance_tuple = NIL;
																instance_tuple = csome_list_var2.first();
																while (NIL != csome_list_var2) {
																	SubLObject current;
																	final SubLObject datum = current = instance_tuple;
																	SubLObject link_node = NIL;
																	SubLObject mt2 = NIL;
																	SubLObject tv2 = NIL;
																	destructuring_bind_must_consp(current, datum, $list275);
																	link_node = current.first();
																	current = current.rest();
																	destructuring_bind_must_consp(current, datum, $list275);
																	mt2 = current.first();
																	current = current.rest();
																	destructuring_bind_must_consp(current, datum, $list275);
																	tv2 = current.first();
																	current = current.rest();
																	if (NIL == current) {
																		if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
																			final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																			try {
																				sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
																				if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
																					final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																					try {
																						sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
																						final SubLObject sol;
																						final SubLObject link_nodes2 = sol = list(link_node);
																						if (NIL != set.set_p(sol)) {
																							final SubLObject set_contents_var = set.do_set_internal(sol);
																							SubLObject basis_object;
																							SubLObject state;
																							SubLObject indexical;
																							SubLObject expiration_date;
																							for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
																								indexical = set_contents.do_set_contents_next(basis_object, state);
																								if ((NIL != set_contents.do_set_contents_element_validP(state, indexical)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(indexical, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																									sbhl_marking_utilities.sbhl_mark_node_marked(indexical, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																									if (NIL != isa.isaP(indexical, $$Date, UNPROVIDED, UNPROVIDED)) {
																										expiration_date = nth_value_step_2(nth_value_step_1(ONE_INTEGER), pph_indexical_date_referent_cached(indexical));
																										if ((NIL != expiration_date) && (NIL == pph_expiration_date_pastP(expiration_date))) {
																											dates = cons(indexical, dates);
																										}
																									}
																								}
																							}
																						} else if (sol.isList()) {
																							SubLObject csome_list_var_$27 = sol;
																							SubLObject indexical2 = NIL;
																							indexical2 = csome_list_var_$27.first();
																							while (NIL != csome_list_var_$27) {
																								if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(indexical2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																									sbhl_marking_utilities.sbhl_mark_node_marked(indexical2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																									if (NIL != isa.isaP(indexical2, $$Date, UNPROVIDED, UNPROVIDED)) {
																										final SubLObject expiration_date2 = nth_value_step_2(nth_value_step_1(ONE_INTEGER), pph_indexical_date_referent_cached(indexical2));
																										if ((NIL != expiration_date2) && (NIL == pph_expiration_date_pastP(expiration_date2))) {
																											dates = cons(indexical2, dates);
																										}
																									}
																								}
																								csome_list_var_$27 = csome_list_var_$27.rest();
																								indexical2 = csome_list_var_$27.first();
																							}
																						} else {
																							Errors.error($str273$_A_is_neither_SET_P_nor_LISTP_, sol);
																						}

																					} finally {
																						sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$18, thread);
																					}
																				}
																			} finally {
																				sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$17, thread);
																			}
																		}
																	} else {
																		cdestructuring_bind_error(datum, $list275);
																	}
																	csome_list_var2 = csome_list_var2.rest();
																	instance_tuple = csome_list_var2.first();
																}
															}
														} else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
															SubLObject cdolist_list_var_$28;
															final SubLObject new_list = cdolist_list_var_$28 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p())
																	? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																	: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
															SubLObject generating_fn = NIL;
															generating_fn = cdolist_list_var_$28.first();
															while (NIL != cdolist_list_var_$28) {
																final SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																try {
																	sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
																	final SubLObject sol2;
																	final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
																	if (NIL != set.set_p(sol2)) {
																		final SubLObject set_contents_var2 = set.do_set_internal(sol2);
																		SubLObject basis_object2;
																		SubLObject state2;
																		SubLObject indexical3;
																		SubLObject expiration_date3;
																		for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
																			indexical3 = set_contents.do_set_contents_next(basis_object2, state2);
																			if ((NIL != set_contents.do_set_contents_element_validP(state2, indexical3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(indexical3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																				sbhl_marking_utilities.sbhl_mark_node_marked(indexical3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																				if (NIL != isa.isaP(indexical3, $$Date, UNPROVIDED, UNPROVIDED)) {
																					expiration_date3 = nth_value_step_2(nth_value_step_1(ONE_INTEGER), pph_indexical_date_referent_cached(indexical3));
																					if ((NIL != expiration_date3) && (NIL == pph_expiration_date_pastP(expiration_date3))) {
																						dates = cons(indexical3, dates);
																					}
																				}
																			}
																		}
																	} else if (sol2.isList()) {
																		SubLObject csome_list_var3 = sol2;
																		SubLObject indexical4 = NIL;
																		indexical4 = csome_list_var3.first();
																		while (NIL != csome_list_var3) {
																			if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(indexical4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																				sbhl_marking_utilities.sbhl_mark_node_marked(indexical4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																				if (NIL != isa.isaP(indexical4, $$Date, UNPROVIDED, UNPROVIDED)) {
																					final SubLObject expiration_date4 = nth_value_step_2(nth_value_step_1(ONE_INTEGER), pph_indexical_date_referent_cached(indexical4));
																					if ((NIL != expiration_date4) && (NIL == pph_expiration_date_pastP(expiration_date4))) {
																						dates = cons(indexical4, dates);
																					}
																				}
																			}
																			csome_list_var3 = csome_list_var3.rest();
																			indexical4 = csome_list_var3.first();
																		}
																	} else {
																		Errors.error($str273$_A_is_neither_SET_P_nor_LISTP_, sol2);
																	}

																} finally {
																	sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$19, thread);
																}
																cdolist_list_var_$28 = cdolist_list_var_$28.rest();
																generating_fn = cdolist_list_var_$28.first();
															}
														}

													} finally {
														sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$14, thread);
														sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$14, thread);
													}
													cdolist_list_var = cdolist_list_var.rest();
													module_var = cdolist_list_var.first();
												}
												SubLObject cdolist_list_var2;
												final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)));
												SubLObject module_var2 = NIL;
												module_var2 = cdolist_list_var2.first();
												while (NIL != cdolist_list_var2) {
													final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
													final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
													try {
														sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
														sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
														final SubLObject node2 = function_terms.naut_to_nart(node_var_$11);
														if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
															final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
															if (NIL != d_link2) {
																final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																if (NIL != mt_links2) {
																	SubLObject iteration_state2;
																	for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
																		thread.resetMultipleValues();
																		final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
																		final SubLObject tv_links2 = thread.secondMultipleValue();
																		thread.resetMultipleValues();
																		if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
																			final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																			try {
																				sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
																				SubLObject iteration_state_$24;
																				for (iteration_state_$24 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$24); iteration_state_$24 = dictionary_contents.do_dictionary_contents_next(iteration_state_$24)) {
																					thread.resetMultipleValues();
																					final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$24);
																					final SubLObject link_nodes4 = thread.secondMultipleValue();
																					thread.resetMultipleValues();
																					if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
																						final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																						try {
																							sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
																							final SubLObject sol3 = link_nodes4;
																							if (NIL != set.set_p(sol3)) {
																								final SubLObject set_contents_var3 = set.do_set_internal(sol3);
																								SubLObject basis_object3;
																								SubLObject state3;
																								SubLObject node_vars_link_node;
																								for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
																									node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
																									if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
																										sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
																										deck.deck_push(node_vars_link_node, recur_deck);
																									}
																								}
																							} else if (sol3.isList()) {
																								SubLObject csome_list_var4 = sol3;
																								SubLObject node_vars_link_node2 = NIL;
																								node_vars_link_node2 = csome_list_var4.first();
																								while (NIL != csome_list_var4) {
																									if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
																										sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
																										deck.deck_push(node_vars_link_node2, recur_deck);
																									}
																									csome_list_var4 = csome_list_var4.rest();
																									node_vars_link_node2 = csome_list_var4.first();
																								}
																							} else {
																								Errors.error($str273$_A_is_neither_SET_P_nor_LISTP_, sol3);
																							}

																						} finally {
																							sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
																						}
																					}
																				}
																				dictionary_contents.do_dictionary_contents_finalize(iteration_state_$24);
																			} finally {
																				sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
																			}
																		}
																	}
																	dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
																}
															} else {
																sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str274$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
															}
														} else if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
															SubLObject cdolist_list_var_$29;
															final SubLObject new_list2 = cdolist_list_var_$29 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																	: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
															SubLObject generating_fn2 = NIL;
															generating_fn2 = cdolist_list_var_$29.first();
															while (NIL != cdolist_list_var_$29) {
																final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																try {
																	sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
																	final SubLObject sol4;
																	final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
																	if (NIL != set.set_p(sol4)) {
																		final SubLObject set_contents_var4 = set.do_set_internal(sol4);
																		SubLObject basis_object4;
																		SubLObject state4;
																		SubLObject node_vars_link_node3;
																		for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
																			node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
																			if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
																				sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
																				deck.deck_push(node_vars_link_node3, recur_deck);
																			}
																		}
																	} else if (sol4.isList()) {
																		SubLObject csome_list_var5 = sol4;
																		SubLObject node_vars_link_node4 = NIL;
																		node_vars_link_node4 = csome_list_var5.first();
																		while (NIL != csome_list_var5) {
																			if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
																				sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
																				deck.deck_push(node_vars_link_node4, recur_deck);
																			}
																			csome_list_var5 = csome_list_var5.rest();
																			node_vars_link_node4 = csome_list_var5.first();
																		}
																	} else {
																		Errors.error($str273$_A_is_neither_SET_P_nor_LISTP_, sol4);
																	}

																} finally {
																	sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$23, thread);
																}
																cdolist_list_var_$29 = cdolist_list_var_$29.rest();
																generating_fn2 = cdolist_list_var_$29.first();
															}
														}

													} finally {
														sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$15, thread);
														sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
													}
													cdolist_list_var2 = cdolist_list_var2.rest();
													module_var2 = cdolist_list_var2.first();
												}
												node_var_$11 = deck.deck_pop(recur_deck);
											}
										} finally {
											sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$19, thread);
											sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$13, thread);
											sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$13, thread);
										}
									} else {
										sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str276$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
									}
								} finally {
									sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
									sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
									sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
									sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$12, thread);
									sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$12, thread);
								}
							} finally {
								sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$11, thread);
								sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$11, thread);
							}
						} finally {
							final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								final SubLObject _values = getValuesAsVector();
								sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
								restoreValuesFromVector(_values);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
							}
						}
					} finally {
						sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$10, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
					}
				}
			} finally {
				sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$10, thread);
				sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$9, thread);
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return delete_duplicates(dates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_indexical_dates() {
		SubLObject caching_state = $pph_indexical_dates_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(PPH_INDEXICAL_DATES, $pph_indexical_dates_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(pph_indexical_dates_internal()));
			memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_indexical_date_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, pph_indexical_dates(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_date_matches_indexicalP(final SubLObject date, final SubLObject indexical) {
		return equal(date, pph_indexical_date_referent(indexical));
	}

	public static SubLObject pph_indexical_date_referent(final SubLObject indexical) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject stored_value = pph_indexical_date_referent_cached(indexical);
		final SubLObject expiration_date = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ((NIL != pph_expiration_date_pastP(expiration_date)) || stored_value.equal(indexical)) {
			remove_pph_indexical_date_referent_cached(indexical);
			stored_value = pph_indexical_date_referent_cached(indexical);
		}
		return stored_value;
	}

	public static SubLObject pph_expiration_date_pastP(final SubLObject expiration_date) {
		return numL(expiration_date, get_universal_time());
	}

	public static SubLObject clear_pph_indexical_date_referent_cached() {
		final SubLObject cs = $pph_indexical_date_referent_cached_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_indexical_date_referent_cached(final SubLObject indexical) {
		return memoization_state.caching_state_remove_function_results_with_args($pph_indexical_date_referent_cached_caching_state$.getGlobalValue(), list(indexical), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_indexical_date_referent_cached_internal(final SubLObject indexical) {
		final SubLObject current_value = pph_ask_variable_new($sym279$_DATE, listS($$indexicalReferent, indexical, $list280), $$InferencePSC, UNPROVIDED).first();
		final SubLObject expiration_date = pph_indexical_date_expiration_date(indexical);
		return values(current_value, expiration_date);
	}

	public static SubLObject pph_indexical_date_referent_cached(final SubLObject indexical) {
		SubLObject caching_state = $pph_indexical_date_referent_cached_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(PPH_INDEXICAL_DATE_REFERENT_CACHED, $pph_indexical_date_referent_cached_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, indexical, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(pph_indexical_date_referent_cached_internal(indexical)));
			memoization_state.caching_state_put(caching_state, indexical, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_indexical_date_expiration_date(final SubLObject indexical) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != isa.isaP(indexical, $$CalendarDay, UNPROVIDED, UNPROVIDED)) {
			return date_utilities.cycl_date_to_universal_time(date_utilities.cycl_date_final_second(date_utilities.indexical_today()));
		}
		if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
			Errors.warn($str284$Don_t_know_expiration_date_for__S, indexical);
			force_output(StreamsLow.$error_output$.getDynamicValue(thread));
		}
		return NIL;
	}

	public static SubLObject pph_rephrase_template_for_subj_role_formula(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject template = pph_identity_template();
		SubLObject justs = NIL;
		if (((NIL != el_formula_p(v_object)) && (NIL != possibly_nat_p(cycl_utilities.formula_arg1(v_object, UNPROVIDED)))) && (((NIL != pph_types.pph_subcol_fnP(cycl_utilities.formula_arg0(v_object))) && (NIL != pph_subject_role_predP(cycl_utilities.formula_arg2(v_object, UNPROVIDED)))) || (NIL != pph_subject_role_predP(cycl_utilities.formula_operator(v_object))))) {
			thread.resetMultipleValues();
			final SubLObject template_$39 = pph_find_rephrase_template_for_subj_role_formula(v_object);
			final SubLObject justs_$40 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			template = template_$39;
			justs = justs_$40;
		}
		return values(template, justs);
	}

	public static SubLObject initialize_pph_subject_role_preds() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		set.clear_set($pph_subject_role_preds$.getGlobalValue());
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			final SubLObject node_var = $$SubjectRolePredicate;
			final SubLObject _prev_bind_0_$41 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
			final SubLObject _prev_bind_1_$42 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
			try {
				sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
				sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
				try {
					SubLObject node_var_$43 = node_var;
					final SubLObject deck_type = $STACK;
					final SubLObject recur_deck = deck.create_deck(deck_type);
					final SubLObject _prev_bind_0_$42 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
					try {
						sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
						try {
							final SubLObject tv_var = NIL;
							final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
							final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
							try {
								sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
								sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
								if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
									final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
									if (pcase_var.eql($ERROR)) {
										sbhl_paranoia.sbhl_error(ONE_INTEGER, $str266$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									} else if (pcase_var.eql($CERROR)) {
										sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str266$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									} else if (pcase_var.eql($WARN)) {
										Errors.warn($str266$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
									} else {
										Errors.warn($str271$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
										Errors.cerror($$$continue_anyway, $str266$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
									}

								}
								final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
								final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
								final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
								final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
								final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
								try {
									sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
									sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
									sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
									sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
									sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
									if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
										final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
										final SubLObject _prev_bind_1_$45 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
										final SubLObject _prev_bind_2_$51 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
										try {
											sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
											sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
											sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
											sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$43, UNPROVIDED);
											while (NIL != node_var_$43) {
												final SubLObject tt_node_var = node_var_$43;
												SubLObject cdolist_list_var;
												final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
												SubLObject module_var = NIL;
												module_var = cdolist_list_var.first();
												while (NIL != cdolist_list_var) {
													final SubLObject _prev_bind_0_$46 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
													final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
													try {
														sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
														sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
														final SubLObject node = function_terms.naut_to_nart(tt_node_var);
														if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
															final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
															if (NIL != d_link) {
																final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																if (NIL != mt_links) {
																	SubLObject iteration_state;
																	for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
																		thread.resetMultipleValues();
																		final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
																		final SubLObject tv_links = thread.secondMultipleValue();
																		thread.resetMultipleValues();
																		if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
																			final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																			try {
																				sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
																				SubLObject iteration_state_$55;
																				for (iteration_state_$55 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$55); iteration_state_$55 = dictionary_contents.do_dictionary_contents_next(iteration_state_$55)) {
																					thread.resetMultipleValues();
																					final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$55);
																					final SubLObject link_nodes = thread.secondMultipleValue();
																					thread.resetMultipleValues();
																					if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
																						final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																						try {
																							sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
																							final SubLObject sol = link_nodes;
																							if (NIL != set.set_p(sol)) {
																								final SubLObject set_contents_var = set.do_set_internal(sol);
																								SubLObject basis_object;
																								SubLObject state;
																								SubLObject pred;
																								for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
																									pred = set_contents.do_set_contents_next(basis_object, state);
																									if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																										sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																										set.set_add(pred, $pph_subject_role_preds$.getGlobalValue());
																									}
																								}
																							} else if (sol.isList()) {
																								SubLObject csome_list_var = sol;
																								SubLObject pred2 = NIL;
																								pred2 = csome_list_var.first();
																								while (NIL != csome_list_var) {
																									if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																										sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																										set.set_add(pred2, $pph_subject_role_preds$.getGlobalValue());
																									}
																									csome_list_var = csome_list_var.rest();
																									pred2 = csome_list_var.first();
																								}
																							} else {
																								Errors.error($str273$_A_is_neither_SET_P_nor_LISTP_, sol);
																							}

																						} finally {
																							sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$48, thread);
																						}
																					}
																				}
																				dictionary_contents.do_dictionary_contents_finalize(iteration_state_$55);
																			} finally {
																				sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$47, thread);
																			}
																		}
																	}
																	dictionary_contents.do_dictionary_contents_finalize(iteration_state);
																}
															} else {
																sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str274$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
															}
															if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
																SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
																SubLObject instance_tuple = NIL;
																instance_tuple = csome_list_var2.first();
																while (NIL != csome_list_var2) {
																	SubLObject current;
																	final SubLObject datum = current = instance_tuple;
																	SubLObject link_node = NIL;
																	SubLObject mt2 = NIL;
																	SubLObject tv2 = NIL;
																	destructuring_bind_must_consp(current, datum, $list275);
																	link_node = current.first();
																	current = current.rest();
																	destructuring_bind_must_consp(current, datum, $list275);
																	mt2 = current.first();
																	current = current.rest();
																	destructuring_bind_must_consp(current, datum, $list275);
																	tv2 = current.first();
																	current = current.rest();
																	if (NIL == current) {
																		if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
																			final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																			try {
																				sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
																				if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
																					final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																					try {
																						sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
																						final SubLObject sol;
																						final SubLObject link_nodes2 = sol = list(link_node);
																						if (NIL != set.set_p(sol)) {
																							final SubLObject set_contents_var = set.do_set_internal(sol);
																							SubLObject basis_object;
																							SubLObject state;
																							SubLObject pred;
																							for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
																								pred = set_contents.do_set_contents_next(basis_object, state);
																								if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																									sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																									set.set_add(pred, $pph_subject_role_preds$.getGlobalValue());
																								}
																							}
																						} else if (sol.isList()) {
																							SubLObject csome_list_var_$59 = sol;
																							SubLObject pred2 = NIL;
																							pred2 = csome_list_var_$59.first();
																							while (NIL != csome_list_var_$59) {
																								if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																									sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																									set.set_add(pred2, $pph_subject_role_preds$.getGlobalValue());
																								}
																								csome_list_var_$59 = csome_list_var_$59.rest();
																								pred2 = csome_list_var_$59.first();
																							}
																						} else {
																							Errors.error($str273$_A_is_neither_SET_P_nor_LISTP_, sol);
																						}

																					} finally {
																						sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$50, thread);
																					}
																				}
																			} finally {
																				sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$49, thread);
																			}
																		}
																	} else {
																		cdestructuring_bind_error(datum, $list275);
																	}
																	csome_list_var2 = csome_list_var2.rest();
																	instance_tuple = csome_list_var2.first();
																}
															}
														} else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
															SubLObject cdolist_list_var_$60;
															final SubLObject new_list = cdolist_list_var_$60 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p())
																	? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																	: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
															SubLObject generating_fn = NIL;
															generating_fn = cdolist_list_var_$60.first();
															while (NIL != cdolist_list_var_$60) {
																final SubLObject _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																try {
																	sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
																	final SubLObject sol2;
																	final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
																	if (NIL != set.set_p(sol2)) {
																		final SubLObject set_contents_var2 = set.do_set_internal(sol2);
																		SubLObject basis_object2;
																		SubLObject state2;
																		SubLObject pred3;
																		for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
																			pred3 = set_contents.do_set_contents_next(basis_object2, state2);
																			if ((NIL != set_contents.do_set_contents_element_validP(state2, pred3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																				sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																				set.set_add(pred3, $pph_subject_role_preds$.getGlobalValue());
																			}
																		}
																	} else if (sol2.isList()) {
																		SubLObject csome_list_var3 = sol2;
																		SubLObject pred4 = NIL;
																		pred4 = csome_list_var3.first();
																		while (NIL != csome_list_var3) {
																			if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																				sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																				set.set_add(pred4, $pph_subject_role_preds$.getGlobalValue());
																			}
																			csome_list_var3 = csome_list_var3.rest();
																			pred4 = csome_list_var3.first();
																		}
																	} else {
																		Errors.error($str273$_A_is_neither_SET_P_nor_LISTP_, sol2);
																	}

																} finally {
																	sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$51, thread);
																}
																cdolist_list_var_$60 = cdolist_list_var_$60.rest();
																generating_fn = cdolist_list_var_$60.first();
															}
														}

													} finally {
														sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$46, thread);
														sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$46, thread);
													}
													cdolist_list_var = cdolist_list_var.rest();
													module_var = cdolist_list_var.first();
												}
												SubLObject cdolist_list_var2;
												final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
												SubLObject module_var2 = NIL;
												module_var2 = cdolist_list_var2.first();
												while (NIL != cdolist_list_var2) {
													final SubLObject _prev_bind_0_$52 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
													final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
													try {
														sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
														sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
														final SubLObject node2 = function_terms.naut_to_nart(node_var_$43);
														if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
															final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
															if (NIL != d_link2) {
																final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																if (NIL != mt_links2) {
																	SubLObject iteration_state2;
																	for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
																		thread.resetMultipleValues();
																		final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
																		final SubLObject tv_links2 = thread.secondMultipleValue();
																		thread.resetMultipleValues();
																		if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
																			final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																			try {
																				sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
																				SubLObject iteration_state_$56;
																				for (iteration_state_$56 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$56); iteration_state_$56 = dictionary_contents.do_dictionary_contents_next(iteration_state_$56)) {
																					thread.resetMultipleValues();
																					final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$56);
																					final SubLObject link_nodes4 = thread.secondMultipleValue();
																					thread.resetMultipleValues();
																					if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
																						final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																						try {
																							sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
																							final SubLObject sol3 = link_nodes4;
																							if (NIL != set.set_p(sol3)) {
																								final SubLObject set_contents_var3 = set.do_set_internal(sol3);
																								SubLObject basis_object3;
																								SubLObject state3;
																								SubLObject node_vars_link_node;
																								for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
																									node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
																									if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
																										sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
																										deck.deck_push(node_vars_link_node, recur_deck);
																									}
																								}
																							} else if (sol3.isList()) {
																								SubLObject csome_list_var4 = sol3;
																								SubLObject node_vars_link_node2 = NIL;
																								node_vars_link_node2 = csome_list_var4.first();
																								while (NIL != csome_list_var4) {
																									if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
																										sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
																										deck.deck_push(node_vars_link_node2, recur_deck);
																									}
																									csome_list_var4 = csome_list_var4.rest();
																									node_vars_link_node2 = csome_list_var4.first();
																								}
																							} else {
																								Errors.error($str273$_A_is_neither_SET_P_nor_LISTP_, sol3);
																							}

																						} finally {
																							sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$54, thread);
																						}
																					}
																				}
																				dictionary_contents.do_dictionary_contents_finalize(iteration_state_$56);
																			} finally {
																				sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$53, thread);
																			}
																		}
																	}
																	dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
																}
															} else {
																sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str274$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
															}
														} else if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
															SubLObject cdolist_list_var_$61;
															final SubLObject new_list2 = cdolist_list_var_$61 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																	: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
															SubLObject generating_fn2 = NIL;
															generating_fn2 = cdolist_list_var_$61.first();
															while (NIL != cdolist_list_var_$61) {
																final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																try {
																	sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
																	final SubLObject sol4;
																	final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
																	if (NIL != set.set_p(sol4)) {
																		final SubLObject set_contents_var4 = set.do_set_internal(sol4);
																		SubLObject basis_object4;
																		SubLObject state4;
																		SubLObject node_vars_link_node3;
																		for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
																			node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
																			if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
																				sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
																				deck.deck_push(node_vars_link_node3, recur_deck);
																			}
																		}
																	} else if (sol4.isList()) {
																		SubLObject csome_list_var5 = sol4;
																		SubLObject node_vars_link_node4 = NIL;
																		node_vars_link_node4 = csome_list_var5.first();
																		while (NIL != csome_list_var5) {
																			if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
																				sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
																				deck.deck_push(node_vars_link_node4, recur_deck);
																			}
																			csome_list_var5 = csome_list_var5.rest();
																			node_vars_link_node4 = csome_list_var5.first();
																		}
																	} else {
																		Errors.error($str273$_A_is_neither_SET_P_nor_LISTP_, sol4);
																	}

																} finally {
																	sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$55, thread);
																}
																cdolist_list_var_$61 = cdolist_list_var_$61.rest();
																generating_fn2 = cdolist_list_var_$61.first();
															}
														}

													} finally {
														sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$47, thread);
														sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$52, thread);
													}
													cdolist_list_var2 = cdolist_list_var2.rest();
													module_var2 = cdolist_list_var2.first();
												}
												node_var_$43 = deck.deck_pop(recur_deck);
											}
										} finally {
											sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$51, thread);
											sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$45, thread);
											sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$45, thread);
										}
									} else {
										sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str276$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
									}
								} finally {
									sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
									sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
									sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
									sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$44, thread);
									sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$44, thread);
								}
							} finally {
								sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$43, thread);
								sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$43, thread);
							}
						} finally {
							final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								final SubLObject _values = getValuesAsVector();
								sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
								restoreValuesFromVector(_values);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
							}
						}
					} finally {
						sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$42, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
					}
				}
			} finally {
				sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$42, thread);
				sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$41, thread);
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return $INITIALIZED;
	}

	public static SubLObject pph_subject_role_predP(final SubLObject v_object) {
		if (NIL != set.set_emptyP($pph_subject_role_preds$.getGlobalValue())) {
			initialize_pph_subject_role_preds();
		}
		return set.set_memberP(v_object, $pph_subject_role_preds$.getGlobalValue());
	}

	public static SubLObject pph_find_rephrase_template_for_subj_role_formula(final SubLObject sent) {
		final SubLObject arg1 = cycl_utilities.formula_arg1(sent, UNPROVIDED);
		SubLObject template = pph_identity_template();
		SubLObject justs = NIL;
		if (cycl_utilities.nat_functor(arg1).eql($$TheVPParse)) {
			final SubLObject event_template = pph_cycl_template_from_arg_position($list289);
			final SubLObject role_template = pph_cycl_template_from_arg_position($list290);
			if (NIL != pph_types.pph_subcol_fnP(cycl_utilities.formula_arg0(sent))) {
				template = make_ternary_formula($ARG0, event_template, role_template, $ARG3);
			} else {
				template = make_binary_formula(role_template, event_template, $ARG2);
			}
		} else if ((cycl_utilities.nat_functor(arg1).eql($$SomeFn) && (NIL != possibly_naut_p(cycl_utilities.nat_arg1(arg1, UNPROVIDED)))) && cycl_utilities.nat_functor(cycl_utilities.nat_arg1(arg1, UNPROVIDED)).eql($$StateFn)) {
			template = pph_cycl_template_from_arg_position($list295);
		}

		if (NIL == pph_identity_template_p(template)) {
			justs = list(pph_phrase.pph_code_justification(PPH_REPHRASE_TEMPLATE_FOR_SUBJ_ROLE_FORMULA, UNPROVIDED));
		}
		return values(template, justs);
	}

	public static SubLObject var_template_in_formula(final SubLObject var, final SubLObject formula) {
		if (NIL != pph_formula_with_dotsP(formula)) {
			return NIL;
		}
		final SubLObject var_position = list_utilities.tree_position_bfs(var, formula, UNPROVIDED);
		return pph_cycl_template_from_arg_position(var_position);
	}

	public static SubLObject pph_vars_to_quantify(final SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == pph_vars.$pph_quantify_varsP$.getDynamicValue(thread)) {
			return NIL;
		}
		if (NIL != pph_cycl_template_p(formula)) {
			return NIL;
		}
		final SubLObject candidates = cycl_utilities.expression_gather(formula, $sym297$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject filtered_candidates = NIL;
		SubLObject bound_candidates = NIL;
		SubLObject cdolist_list_var = candidates;
		SubLObject var = NIL;
		var = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != pph_variable_handling.pph_var_registeredP(var)) {
				bound_candidates = cons(var, bound_candidates);
			} else {
				filtered_candidates = cons(var, filtered_candidates);
			}
			cdolist_list_var = cdolist_list_var.rest();
			var = cdolist_list_var.first();
		}
		return NIL != filtered_candidates ? intersection(filtered_candidates, pph_variable_handling.pph_formula_free_variables(formula, bound_candidates), UNPROVIDED, UNPROVIDED) : NIL;
	}

	public static SubLObject pph_rephrase_template_from_universal_introduction(final SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == el_formula_p(formula)) {
			return values(pph_identity_template(), NIL);
		}
		thread.resetMultipleValues();
		final SubLObject core_formula = pph_find_core_formula(formula);
		final SubLObject core_formula_context = thread.secondMultipleValue();
		final SubLObject matrix_template = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		thread.resetMultipleValues();
		final SubLObject core_universal_intro_template = pph_rephrase_template_from_universal_introduction_int(core_formula);
		final SubLObject justs = thread.secondMultipleValue();
		thread.resetMultipleValues();
		final SubLObject contextualized = (NIL != pph_identity_template_p(core_formula_context)) ? core_universal_intro_template : pph_apply_template(core_universal_intro_template, core_formula_context);
		final SubLObject ans = cycl_utilities.expression_subst(contextualized, $CORE, matrix_template, UNPROVIDED, UNPROVIDED);
		return values(ans, justs);
	}

	public static SubLObject pph_unpacking_ists(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list299);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject formula = NIL;
		SubLObject template = NIL;
		destructuring_bind_must_consp(current, datum, $list299);
		formula = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list299);
		template = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject ist_mt_stack = $sym300$IST_MT_STACK;
			return listS(CLET, list(bq_cons(ist_mt_stack, $list301)), list(CMULTIPLE_VALUE_SETQ, list(ist_mt_stack, formula, template), list(PPH_STACK_ISTS, formula, template)), append(body, list(list(CSETQ, template, list(PPH_UNSTACK_ISTS, ist_mt_stack, template)))));
		}
		cdestructuring_bind_error(datum, $list299);
		return NIL;
	}

	public static SubLObject pph_stack_ists(SubLObject formula, SubLObject template) {
		SubLObject ist_mt_stack = NIL;
		while (NIL != el_formula_with_operator_p(formula, $$ist)) {
			final SubLObject current_ist = make_formula_arg_naut(ZERO_INTEGER, template);
			final SubLObject current_ist_mt = make_formula_arg_naut(ONE_INTEGER, template);
			ist_mt_stack = cons(list(current_ist, current_ist_mt), ist_mt_stack);
			formula = cycl_utilities.formula_arg2(formula, UNPROVIDED);
			template = make_formula_arg_naut(TWO_INTEGER, template);
		}
		return values(ist_mt_stack, formula, template);
	}

	public static SubLObject pph_unstack_ists(SubLObject ist_mt_stack, SubLObject template) {
		while (NIL != ist_mt_stack) {
			SubLObject current;
			final SubLObject datum = current = ist_mt_stack.first();
			SubLObject current_ist = NIL;
			SubLObject current_ist_mt = NIL;
			destructuring_bind_must_consp(current, datum, $list307);
			current_ist = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list307);
			current_ist_mt = current.first();
			current = current.rest();
			if (NIL == current) {
				ist_mt_stack = ist_mt_stack.rest();
				template = make_binary_formula(current_ist, current_ist_mt, template);
			} else {
				cdestructuring_bind_error(datum, $list307);
			}
		}
		return template;
	}

	public static SubLObject pph_rephrase_template_from_universal_introduction_int(final SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject template = pph_identity_template();
		SubLObject vars_bound = NIL;
		SubLObject justs = NIL;
		if (NIL != pph_types.pph_cycl_sentenceP(formula)) {
			SubLObject ist_mt_stack = NIL;
			thread.resetMultipleValues();
			final SubLObject ist_mt_stack_$71 = pph_stack_ists(formula, template);
			final SubLObject core_formula_$72 = thread.secondMultipleValue();
			final SubLObject template_$73 = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			ist_mt_stack = ist_mt_stack_$71;
			final SubLObject core_formula = core_formula_$72;
			template = template_$73;
			if (NIL != el_formula_p(core_formula)) {
				SubLObject cdolist_list_var = pph_vars_to_quantify(core_formula);
				SubLObject free_var = NIL;
				free_var = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					final SubLObject var_position_template = var_template_in_formula(free_var, formula);
					if (NIL != var_position_template) {
						template = make_universal(var_position_template, template);
						vars_bound = cons(free_var, vars_bound);
					}
					cdolist_list_var = cdolist_list_var.rest();
					free_var = cdolist_list_var.first();
				}
			}
			justs = cons(pph_phrase.pph_code_justification(UNIVERSAL_INTRODUCTION, list(vars_bound)), justs);
			template = pph_unstack_ists(ist_mt_stack, template);
		}
		return values(template, justs);
	}

	public static SubLObject pph_find_core_formula(final SubLObject formula) {
		final SubLObject free_vars = pph_vars_to_quantify(formula);
		SubLObject core_formula = formula;
		SubLObject core_formula_context = pph_identity_template();
		SubLObject matrix_template = $CORE;
		if ((NIL != list_utilities.singletonP(free_vars)) && ((NIL != el_conjunction_p(formula)) || (NIL != el_disjunction_p(formula)))) {
			SubLObject abortP = NIL;
			final SubLObject free_var = free_vars.first();
			SubLObject core_clause_num = NIL;
			SubLObject matrix_template_args = NIL;
			SubLObject clause_num = ZERO_INTEGER;
			final SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
			SubLObject rest;
			SubLObject clause;
			for (rest = NIL, rest = args; (NIL == abortP) && (NIL != rest); rest = rest.rest()) {
				clause = rest.first();
				clause_num = add(clause_num, ONE_INTEGER);
				if (NIL != subl_promotions.memberP(free_var, pph_vars_to_quantify(clause), UNPROVIDED, UNPROVIDED)) {
					if (core_clause_num.isInteger()) {
						abortP = T;
					} else {
						core_clause_num = clause_num;
						matrix_template_args = cons($CORE, matrix_template_args);
					}
				} else {
					matrix_template_args = cons(pph_cycl_template_from_arg_position(list(clause_num)), matrix_template_args);
				}
			}
			if (core_clause_num.isInteger() && (NIL == abortP)) {
				core_formula = cycl_utilities.formula_arg(formula, core_clause_num, UNPROVIDED);
				core_formula_context = pph_cycl_template_from_arg_position(list(core_clause_num));
				matrix_template = make_formula($ARG0, nreverse(matrix_template_args), UNPROVIDED);
			}
		}
		return values(core_formula, core_formula_context, matrix_template);
	}

	public static SubLObject pph_rephrase_template_from_negated_conjunction(final SubLObject formula) {
		final SubLObject ans = pph_identity_template();
		final SubLObject justs = NIL;
		return values(ans, justs);
	}

	public static SubLObject pph_rephrase_template_from_conjunct_reordering(final SubLObject formula) {
		SubLObject ans = pph_identity_template();
		SubLObject justs = NIL;
		if (NIL != el_conjunction_p(formula)) {
			final SubLObject numbered_juncts = pph_number_juncts(cycl_utilities.formula_args(formula, UNPROVIDED));
			SubLObject sorted = pph_sort_numbered_juncts(numbered_juncts);
			sorted = pph_optimize_variable_distance(sorted);
			if (NIL != pph_numbered_juncts_reordered_p(sorted)) {
				final SubLObject junct_templates = pph_templates_from_numbered_juncts(sorted);
				ans = make_el_formula($ARG0, junct_templates, UNPROVIDED);
				justs = cons(pph_phrase.pph_code_justification(CONJUNCT_REORDERING, UNPROVIDED), justs);
			}
		}
		return values(ans, justs);
	}

	public static SubLObject pph_sort_numbered_juncts(final SubLObject numbered_juncts) {
		return Sort.stable_sort(numbered_juncts, $sym311$PPH_PREFER_NUMBERED_JUNCT_, UNPROVIDED);
	}

	public static SubLObject pph_numbered_juncts_reordered_p(final SubLObject sorted) {
		SubLObject reorderedP = NIL;
		SubLObject last_index = ZERO_INTEGER;
		if (NIL == reorderedP) {
			SubLObject csome_list_var = sorted;
			SubLObject pair = NIL;
			pair = csome_list_var.first();
			while ((NIL == reorderedP) && (NIL != csome_list_var)) {
				final SubLObject current_index = pair.rest();
				if (current_index.numG(last_index)) {
					last_index = current_index;
				} else {
					reorderedP = T;
				}
				csome_list_var = csome_list_var.rest();
				pair = csome_list_var.first();
			}
		}
		return reorderedP;
	}

	public static SubLObject pph_number_juncts(final SubLObject juncts) {
		SubLObject ans = NIL;
		SubLObject list_var = NIL;
		SubLObject junct = NIL;
		SubLObject i = NIL;
		list_var = juncts;
		junct = list_var.first();
		for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), junct = list_var.first(), i = add(ONE_INTEGER, i)) {
			final SubLObject argnum = number_utilities.f_1X(i);
			ans = cons(cons(junct, argnum), ans);
		}
		return nreverse(ans);
	}

	public static SubLObject pph_prefer_numbered_junctP(final SubLObject numbered_junct1, final SubLObject numbered_junct2) {
		final SubLObject junct1 = numbered_junct1.first();
		final SubLObject junct2 = numbered_junct2.first();
		if ((NIL != pph_unbound_arg0_clauseP(junct2)) && (NIL == pph_unbound_arg0_clauseP(junct1))) {
			return T;
		}
		if ((NIL != pph_unbound_arg0_clauseP(junct1)) && (NIL == pph_unbound_arg0_clauseP(junct2))) {
			return NIL;
		}
		if ((NIL != pph_var_typing_clauseP(junct1, UNPROVIDED, UNPROVIDED)) && (NIL == pph_var_typing_clauseP(junct2, UNPROVIDED, UNPROVIDED))) {
			return T;
		}
		if ((NIL != pph_ordering_clauseP(junct2)) && (NIL == pph_ordering_clauseP(junct1))) {
			return T;
		}
		if (((NIL != pph_causal_predP(cycl_utilities.formula_arg0(junct1))) && (NIL != pph_causal_predP(cycl_utilities.formula_arg0(junct2)))) && pph_effect_arg(junct1).equal(pph_cause_arg(junct2))) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_causal_predP(final SubLObject pred) {
		return kb_mapping_utilities.some_pred_value_in_any_mt(pred, $$causeArg, ONE_INTEGER, UNPROVIDED);
	}

	public static SubLObject pph_cause_arg(final SubLObject sentence) {
		final SubLObject pred = cycl_utilities.formula_arg0(sentence);
		final SubLObject cause_argnum = kb_mapping_utilities.fpred_value_in_any_mt(pred, $$causeArg, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
		return NIL != cause_argnum ? cycl_utilities.formula_arg(sentence, cause_argnum, UNPROVIDED) : NIL;
	}

	public static SubLObject pph_effect_arg(final SubLObject sentence) {
		final SubLObject pred = cycl_utilities.formula_arg0(sentence);
		final SubLObject effect_argnum = kb_mapping_utilities.fpred_value_in_any_mt(pred, $$effectArg, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
		return NIL != effect_argnum ? cycl_utilities.formula_arg(sentence, effect_argnum, UNPROVIDED) : NIL;
	}

	public static SubLObject pph_free_variable_distance(final SubLObject formula1, final SubLObject formula2) {
		final SubLObject formula1_vars = pph_sort_variables(obsolete.formula_free_variables(formula1, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		final SubLObject formula2_vars = pph_sort_variables(obsolete.formula_free_variables(formula2, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		if (formula1_vars.equal(formula2_vars)) {
			return ZERO_INTEGER;
		}
		if (NIL != list_utilities.intersect_sortedP(formula1_vars, formula2_vars, $sym314$PPH_VARIABLE__, UNPROVIDED)) {
			return ONE_INTEGER;
		}
		return TWO_INTEGER;
	}

	public static SubLObject pph_sort_variables(final SubLObject vars) {
		return Sort.sort(vars, $sym314$PPH_VARIABLE__, UNPROVIDED);
	}

	public static SubLObject pph_sort_bindings(final SubLObject v_bindings) {
		return Sort.sort(v_bindings, $sym314$PPH_VARIABLE__, VARIABLE_BINDING_VARIABLE);
	}

	public static SubLObject pph_variable_L(final SubLObject var1, final SubLObject var2) {
		return Strings.stringL(princ_to_string(var1), princ_to_string(var2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_choose_next_conjunct(final SubLObject current_conjunct, final SubLObject next_conjuncts) {
		if (NIL == next_conjuncts) {
			return NIL;
		}
		SubLObject first_choice_numbered = next_conjuncts.first();
		final SubLObject first_choice = first_choice_numbered.first();
		SubLObject first_choice_distance = pph_free_variable_distance(current_conjunct.first(), first_choice);
		SubLObject cdolist_list_var = next_conjuncts;
		SubLObject next_choice_numbered = NIL;
		next_choice_numbered = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject next_choice = next_choice_numbered.first();
			final SubLObject next_choice_distance = pph_free_variable_distance(current_conjunct.first(), next_choice);
			if (next_choice_distance.numL(first_choice_distance)) {
				first_choice_distance = next_choice_distance;
				first_choice_numbered = next_choice_numbered;
			}
			cdolist_list_var = cdolist_list_var.rest();
			next_choice_numbered = cdolist_list_var.first();
		}
		return first_choice_numbered;
	}

	public static SubLObject pph_choose_first_conjunct(final SubLObject conjuncts) {
		SubLObject choice = NIL;
		SubLObject cdolist_list_var = conjuncts;
		SubLObject conjunct = NIL;
		conjunct = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != pph_sort_conjunct_earlierP(conjunct, choice)) {
				choice = conjunct;
			}
			cdolist_list_var = cdolist_list_var.rest();
			conjunct = cdolist_list_var.first();
		}
		return choice;
	}

	public static SubLObject pph_sort_conjunct_earlierP(final SubLObject conjunct1, final SubLObject conjunct2) {
		if (NIL == conjunct2) {
			return T;
		}
		final SubLObject vars1 = cycl_utilities.expression_gather(conjunct1.first(), $sym297$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject vars2 = cycl_utilities.expression_gather(conjunct2.first(), $sym297$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if ((NIL != list_utilities.empty_list_p(vars2)) && (NIL == list_utilities.empty_list_p(vars1))) {
			return T;
		}
		if (NIL != Strings.stringL(princ_to_string(list_utilities.extremal(vars1, symbol_function($sym316$STRING_), symbol_function(PRINC_TO_STRING))), princ_to_string(list_utilities.extremal(vars2, symbol_function($sym316$STRING_), symbol_function(PRINC_TO_STRING))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			return T;
		}
		if (NIL != pph_variable_L(list_utilities.extremal(vars1, symbol_function($sym316$STRING_), symbol_function(PRINC_TO_STRING)), list_utilities.extremal(vars2, symbol_function($sym316$STRING_), symbol_function(PRINC_TO_STRING)))) {
			return T;
		}
		if (NIL != list_utilities.lesser_length_p(vars1, vars2)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_optimize_variable_distance(final SubLObject conjuncts) {
		if (NIL == conjuncts) {
			return NIL;
		}
		SubLObject current_conjunct = pph_choose_first_conjunct(conjuncts);
		SubLObject optimized_list = list(current_conjunct);
		SubLObject next_conjunct;
		for (SubLObject choices = remove(current_conjunct, conjuncts, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED); NIL != choices; choices = remove(next_conjunct, choices, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), current_conjunct = next_conjunct) {
			next_conjunct = pph_choose_next_conjunct(current_conjunct, choices);
			optimized_list = cons(next_conjunct, optimized_list);
		}
		return reverse(optimized_list);
	}

	public static SubLObject pph_unbound_arg0_clauseP(final SubLObject lit) {
		return makeBoolean((NIL != el_formula_p(lit)) && (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg0(lit))));
	}

	public static SubLObject pph_ordering_clauseP(final SubLObject lit) {
		return makeBoolean((NIL != el_formula_p(lit)) && (NIL != pph_isaP(cycl_utilities.formula_arg0(lit), $$OrderingPredicate, UNPROVIDED)));
	}

	public static SubLObject pph_templates_from_numbered_juncts(final SubLObject numbered_juncts) {
		SubLObject templates = NIL;
		SubLObject cdolist_list_var = numbered_juncts;
		SubLObject numbered_junct = NIL;
		numbered_junct = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject number = numbered_junct.rest();
			final SubLObject template = at_utilities.get_generic_arg(number);
			templates = cons(template, templates);
			cdolist_list_var = cdolist_list_var.rest();
			numbered_junct = cdolist_list_var.first();
		}
		return nreverse(templates);
	}

	public static SubLObject pph_rephrase_template_from_expansion(final SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject expansion_as = NIL;
		SubLObject template = pph_identity_template();
		SubLObject justs = NIL;
		if (((NIL != pph_precise_in_argP(ZERO_INTEGER)) && (NIL != pph_vars.$pph_use_expansions_for_precisionP$.getDynamicValue(thread))) && (NIL != el_formula_p(formula))) {
			final SubLObject operator = cycl_utilities.find_when_closed_naut(cycl_utilities.formula_operator(formula));
			if ((NIL != indexed_term_p(operator)) && (NIL == pph_methods_formulas.pph_reln_has_precise_templateP(operator))) {
				thread.resetMultipleValues();
				final SubLObject template_$74 = find_el_macro_expansion(formula, UNPROVIDED);
				final SubLObject expansion_as_$75 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				template = template_$74;
				expansion_as = expansion_as_$75;
				if (NIL == pph_identity_template_p(template)) {
					pph_vars.$pph_use_expansions_for_precisionP$.setDynamicValue(NIL, thread);
					if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
						format_nil.force_format(T, $str319$__Using_expansion__S_for__S__, template, operator, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					final SubLObject var = expansion_as;
					if (NIL != var) {
						justs = cons(var, justs);
					}
				}
			}
		}
		return values(template, justs);
	}

	public static SubLObject find_el_macro_expansion(final SubLObject v_object, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject expansion_as = NIL;
		final SubLObject relation = cycl_utilities.find_when_closed_naut(cycl_utilities.formula_arg0(v_object));
		SubLObject template = pph_identity_template();
		SubLObject doneP = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
		final SubLObject _prev_bind_5 = pred_relevance_macros.$pred$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EQ, thread);
			pred_relevance_macros.$pred$.bind($$expansion, thread);
			final SubLObject pred_var = NIL;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
				final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
				SubLObject done_var = doneP;
				final SubLObject token_var = NIL;
				while (NIL == done_var) {
					final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
					final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
							SubLObject done_var_$76 = doneP;
							final SubLObject token_var_$77 = NIL;
							while (NIL == done_var_$76) {
								final SubLObject this_expansion_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$77);
								final SubLObject valid_$78 = makeBoolean(!token_var_$77.eql(this_expansion_as));
								if (NIL != valid_$78) {
									template = pph_get_expansion(this_expansion_as);
									if (NIL == pph_identity_template_p(template)) {
										doneP = T;
										expansion_as = this_expansion_as;
									}
								}
								done_var_$76 = makeBoolean((NIL == valid_$78) || (NIL != doneP));
							}
						} finally {
							final SubLObject _prev_bind_0_$79 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								final SubLObject _values = getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								restoreValuesFromVector(_values);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
							}
						}
					}
					done_var = makeBoolean((NIL == valid) || (NIL != doneP));
				}
			}
		} finally {
			pred_relevance_macros.$pred$.rebind(_prev_bind_5, thread);
			pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return values(template, expansion_as);
	}

	public static SubLObject pph_get_expansion(final SubLObject expansion_as) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject template = assertions_high.gaf_arg2(expansion_as);
		if (NIL != pph_bad_expansion_templateP(template)) {
			return pph_identity_template();
		}
		if ((NIL != term.nautP(template, UNPROVIDED)) && cycl_utilities.nat_function(template).eql($$CollectionSubsetFn)) {
			thread.resetMultipleValues();
			final SubLObject coll = parsing_utilities.parse_collection_expression(template);
			final SubLObject var = thread.secondMultipleValue();
			final SubLObject constraints = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			SubLObject new_constraints = NIL;
			SubLObject cdolist_list_var = constraints;
			SubLObject constraint = NIL;
			constraint = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (((NIL == el_formula_with_operator_p(constraint, $$isa)) || (!cycl_utilities.formula_arg1(constraint, UNPROVIDED).eql(var))) || (!cycl_utilities.formula_arg2(constraint, UNPROVIDED).eql(coll))) {
					new_constraints = cons(constraint, new_constraints);
				}
				cdolist_list_var = cdolist_list_var.rest();
				constraint = cdolist_list_var.first();
			}
			return parsing_utilities.make_collection_expression(coll, var, new_constraints);
		}
		return template;
	}

	public static SubLObject pph_bad_expansion_templateP_internal(final SubLObject template) {
		return makeBoolean((NIL != pph_formula_with_dotsP(template)) || (NIL != pph_modal_sentenceP(template)));
	}

	public static SubLObject pph_bad_expansion_templateP(final SubLObject template) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_bad_expansion_templateP_internal(template);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym325$PPH_BAD_EXPANSION_TEMPLATE_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym325$PPH_BAD_EXPANSION_TEMPLATE_, ONE_INTEGER, $int$24, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym325$PPH_BAD_EXPANSION_TEMPLATE_, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, template, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_bad_expansion_templateP_internal(template)));
			memoization_state.caching_state_put(caching_state, template, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_modal_sentenceP(final SubLObject v_object) {
		return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != pph_modal_operatorP(cycl_utilities.formula_arg0(v_object))));
	}

	public static SubLObject pph_modal_operatorP(final SubLObject v_object) {
		return makeBoolean((NIL != fort_types_interface.predicateP(v_object)) && (NIL != pph_isaP(v_object, $$ModalOperator, UNPROVIDED)));
	}

	public static SubLObject do_tou_substitution(SubLObject formula) {
		if (((NIL != el_formula_p(formula)) && (NIL == tou_atomic_sentenceP(formula))) && (NIL != list_utilities.cons_tree_find_if(symbol_function($sym328$TOU_ATOMIC_SENTENCE_), formula, UNPROVIDED))) {
			final SubLObject arg1 = cycl_utilities.formula_arg1(formula, UNPROVIDED);
			final SubLObject arg2 = cycl_utilities.formula_arg2(formula, UNPROVIDED);
			if (NIL == tou_atomic_sentenceP(arg2)) {
				if ((NIL != el_implication_p(formula)) && (NIL != tou_atomic_sentenceP(arg1))) {
					final SubLObject nart = cycl_utilities.formula_arg1(arg1, UNPROVIDED);
					final SubLObject naut = cycl_utilities.formula_arg2(arg1, UNPROVIDED);
					formula = subst(naut, nart, arg2, symbol_function(EQUAL), UNPROVIDED);
				} else {
					final SubLObject toufs = list_utilities.tree_gather(formula, symbol_function($sym328$TOU_ATOMIC_SENTENCE_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
					formula = list_utilities.tree_remove_all_if(symbol_function($sym328$TOU_ATOMIC_SENTENCE_), formula, UNPROVIDED);
					SubLObject cdolist_list_var = toufs;
					SubLObject touf = NIL;
					touf = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						final SubLObject nart2 = cycl_utilities.formula_arg1(touf, UNPROVIDED);
						final SubLObject naut2 = cycl_utilities.formula_arg2(touf, UNPROVIDED);
						formula = subst(naut2, nart2, formula, symbol_function(EQUAL), UNPROVIDED);
						cdolist_list_var = cdolist_list_var.rest();
						touf = cdolist_list_var.first();
					}
					formula = clean_up_connectives(formula);
				}
			}
		}
		return formula;
	}

	public static SubLObject pph_cycl_template_p(final SubLObject obj) {
		return list_utilities.sublisp_boolean(cycl_utilities.expression_find_if($sym329$PPH_ARG_POSITION_SPECIFIER_, obj, UNPROVIDED, UNPROVIDED));
	}

	public static SubLObject pph_arg_position_specifierP(final SubLObject obj) {
		return makeBoolean(((NIL != pph_identity_template_p(obj)) || (((NIL != formula_arg_nautP(obj)) && (NIL != subl_promotions.non_negative_integer_p(cycl_utilities.nat_arg1(obj, UNPROVIDED)))) && (NIL != pph_arg_position_specifierP(cycl_utilities.nat_arg2(obj, UNPROVIDED))))) || (NIL != at_admitted.generic_arg_p(obj)));
	}

	public static SubLObject pph_identity_template() {
		return $pph_identity_template$.getGlobalValue();
	}

	public static SubLObject pph_identity_template_p(final SubLObject obj) {
		return eq(obj, $pph_identity_template$.getGlobalValue());
	}

	public static SubLObject pph_impossible_template() {
		return $pph_impossible_template$.getGlobalValue();
	}

	public static SubLObject pph_impossible_template_p(final SubLObject obj) {
		return eq(obj, $pph_impossible_template$.getGlobalValue());
	}

	public static SubLObject formula_arg_nautP(final SubLObject v_object) {
		return makeBoolean((NIL != possibly_naut_p(v_object)) && cycl_utilities.nat_functor(v_object).eql($$FormulaArgFn));
	}

	public static SubLObject make_formula_arg_naut(final SubLObject argnum, final SubLObject formula) {
		if (NIL != pph_identity_template_p(formula)) {
			return pph_cycl_template_from_arg_position(list(argnum));
		}
		return make_binary_formula($$FormulaArgFn, argnum, formula);
	}

	public static SubLObject pph_resolve_formula_arg_nauts(final SubLObject cycl, SubLObject resolve_arg_position_specifiersP) {
		if (resolve_arg_position_specifiersP == UNPROVIDED) {
			resolve_arg_position_specifiersP = $resolve_arg_position_specifiersP$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != formula_arg_nautP(cycl)) && ((NIL != resolve_arg_position_specifiersP) || (NIL == pph_arg_position_specifierP(cycl)))) {
			return pph_resolve_formula_arg_naut(cycl, resolve_arg_position_specifiersP);
		}
		if (NIL != pph_arg_position_specifierP(cycl)) {
			return values(cycl, $OPAQUE);
		}
		if (cycl.isAtom()) {
			return values(cycl, $TRANSPARENT);
		}
		if (NIL != el_formula_p(cycl)) {
			SubLObject ans = NIL;
			final SubLObject _prev_bind_0 = $resolve_arg_position_specifiersP$.currentBinding(thread);
			try {
				$resolve_arg_position_specifiersP$.bind(resolve_arg_position_specifiersP, thread);
				ans = map_formula_terms(PPH_RESOLVE_FORMULA_ARG_NAUTS, cycl, UNPROVIDED);
			} finally {
				$resolve_arg_position_specifiersP$.rebind(_prev_bind_0, thread);
			}
			return values(ans, $TRANSPARENT);
		}
		if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
			Errors.warn($str336$Don_t_know_how_to_resolve_formula, cycl);
			force_output(StreamsLow.$error_output$.getDynamicValue(thread));
		}
		return cycl;
	}

	public static SubLObject pph_resolve_formula_arg_naut(final SubLObject formula_arg_naut, SubLObject resolve_arg_position_specifiersP) {
		if (resolve_arg_position_specifiersP == UNPROVIDED) {
			resolve_arg_position_specifiersP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject current;
		final SubLObject datum = current = cycl_utilities.nat_args(formula_arg_naut, UNPROVIDED);
		SubLObject arg_num = NIL;
		SubLObject formula = NIL;
		destructuring_bind_must_consp(current, datum, $list337);
		arg_num = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list337);
		formula = current.first();
		current = current.rest();
		if (NIL != current) {
			cdestructuring_bind_error(datum, $list337);
			return NIL;
		}
		thread.resetMultipleValues();
		final SubLObject resolved_formula = pph_resolve_formula_arg_nauts(formula, resolve_arg_position_specifiersP);
		final SubLObject opacity = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (opacity == $OPAQUE) {
			return values(formula_arg_naut, $OPAQUE);
		}
		if ((NIL == resolve_arg_position_specifiersP) && (NIL != pph_arg_position_specifierP(resolved_formula))) {
			final SubLObject ans = replace_formula_arg(TWO_INTEGER, resolved_formula, formula_arg_naut);
			return values(ans, $OPAQUE);
		}
		return values(cycl_utilities.formula_arg(resolved_formula, arg_num, UNPROVIDED), $TRANSPARENT);
	}

	public static SubLObject pph_arg_position_from_template(final SubLObject template) {
		if (NIL != at_admitted.generic_arg_p(template)) {
			return pph_arg_position_from_generic_arg(template);
		}
		if (NIL != formula_arg_nautP(template)) {
			return pph_arg_position_from_formula_arg_naut(template);
		}
		if (NIL != pph_identity_template_p(template)) {
			return NIL;
		}
		return pph_unknown_arg_position();
	}

	public static SubLObject pph_formula_positions(final SubLObject item, final SubLObject formula, SubLObject test) {
		if (test == UNPROVIDED) {
			test = symbol_function(EQL);
		}
		SubLObject ans = cycl_utilities.arg_positions_bfs(item, formula, test);
		if (item.equal(formula)) {
			ans = cons(NIL, ans);
		}
		return nreverse(ans);
	}

	public static SubLObject pph_cycl_template_from_arg_position(final SubLObject arg_position) {
		if (NIL == arg_position) {
			return pph_identity_template();
		}
		if (NIL != pph_unknown_arg_position_p(arg_position)) {
			return pph_impossible_template();
		}
		if (arg_position.isNumber()) {
			return at_utilities.get_generic_arg(arg_position);
		}
		SubLObject argnums;
		SubLObject top;
		SubLObject next;
		SubLObject ans;
		for (argnums = NIL, top = NIL, next = NIL, ans = NIL, argnums = arg_position, top = argnums.first(), next = second(argnums), ans = at_utilities.get_generic_arg(top); next.isInteger(); next = second(argnums), ans = make_formula_arg_naut(top, ans)) {
			argnums = argnums.rest();
			top = next;
		}
		if (NIL != next) {
			final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy($str338$Arg_position_contains_non_integer) });
			pph_error.pph_handle_error(new_format_string, list(arg_position));
		}
		return ans;
	}

	public static SubLObject pph_template_for_cycl_variable(final SubLObject var, final SubLObject formula) {
		final SubLObject positions = list_utilities.tree_positions(var, formula, UNPROVIDED, UNPROVIDED);
		return NIL != positions ? pph_cycl_template_from_arg_position(positions.first()) : NIL;
	}

	public static SubLObject pph_arg_position_from_generic_arg(final SubLObject generic_arg) {
		final SubLObject integer = at_utilities.generic_arg_num(generic_arg);
		return list(integer);
	}

	public static SubLObject pph_arg_position_from_formula_arg_naut(final SubLObject formula_arg_naut) {
		SubLObject arg_pos = NIL;
		SubLObject v_core;
		for (v_core = formula_arg_naut; NIL != formula_arg_nautP(v_core); v_core = cycl_utilities.nat_arg2(v_core, UNPROVIDED)) {
			arg_pos = cons(cycl_utilities.nat_arg1(v_core, UNPROVIDED), arg_pos);
		}
		if (NIL != pph_identity_template_p(v_core)) {
			return arg_pos;
		}
		if (NIL != at_admitted.generic_arg_p(v_core)) {
			arg_pos = append(pph_arg_position_from_generic_arg(v_core), arg_pos);
			return arg_pos;
		}
		final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy($str339$__Problem_in_PPH_ARG_POSITION_FRO) });
		pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		return NIL;
	}

	public static SubLObject pph_simplify_template(final SubLObject template, final SubLObject original_formula) {
		if (NIL != el_formula_p(template)) {
			return pph_simplify_template_recursive(template, original_formula);
		}
		return template;
	}

	public static SubLObject pph_simplify_template_recursive(final SubLObject template, final SubLObject original_formula) {
		if (NIL != formula_arg_nautP(template)) {
			return template;
		}
		if (NIL != pph_expanded_identity_template_p(template, original_formula)) {
			return pph_identity_template();
		}
		return template;
	}

	public static SubLObject pph_expanded_identity_template_p(final SubLObject template, final SubLObject original_formula) {
		SubLObject okP = NIL;
		if (((NIL != list_utilities.proper_list_p(template)) && (NIL != list_utilities.proper_list_p(original_formula))) && (NIL != list_utilities.same_length_p(template, original_formula))) {
			SubLObject badP = NIL;
			if (NIL == badP) {
				SubLObject template_item = NIL;
				SubLObject template_item_$80 = NIL;
				SubLObject original_item = NIL;
				SubLObject original_item_$81 = NIL;
				template_item = template;
				template_item_$80 = template_item.first();
				original_item = original_formula;
				original_item_$81 = original_item.first();
				while ((NIL == badP) && ((NIL != original_item) || (NIL != template_item))) {
					if (!original_item_$81.equal(pph_apply_template(template_item_$80, original_formula))) {
						badP = T;
					}
					template_item = template_item.rest();
					template_item_$80 = template_item.first();
					original_item = original_item.rest();
					original_item_$81 = original_item.first();
				}
			}
			okP = makeBoolean(NIL == badP);
		}
		return okP;
	}

	public static SubLObject clear_pph_apply_template() {
		final SubLObject cs = $pph_apply_template_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_apply_template(final SubLObject template, final SubLObject formula) {
		return memoization_state.caching_state_remove_function_results_with_args($pph_apply_template_caching_state$.getGlobalValue(), list(template, formula), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_apply_template_internal(SubLObject template, final SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == pph_cycl_template_p(template)) {
			return template;
		}
		if (NIL != pph_identity_template_p(formula)) {
			return template;
		}
		if (NIL == formula) {
			final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy($str340$Applying_template__S_to_NIL___Cur) });
			pph_error.pph_handle_error(new_format_string, list(template, pph_vars.$last_pph_sentence$.getDynamicValue(thread)));
		}
		if (NIL == template) {
			final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy($str341$Applying_null_template_to__S___Cu) });
			pph_error.pph_handle_error(new_format_string, list(formula, pph_vars.$last_pph_sentence$.getDynamicValue(thread)));
		}
		SubLObject cdolist_list_var = cycl_utilities.expression_gather(template, $sym297$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject template_var = NIL;
		template_var = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != cycl_utilities.expression_find(template_var, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
				final SubLObject new_var = pph_unique_el_var_wrt_expression(formula, cycl_variables.el_var_name_without_prefix(template_var), UNPROVIDED);
				template = subst(new_var, template_var, template, UNPROVIDED, UNPROVIDED);
			}
			cdolist_list_var = cdolist_list_var.rest();
			template_var = cdolist_list_var.first();
		}
		return NIL != pph_identity_template_p(template) ? formula : do_pph_apply_template(template, formula);
	}

	public static SubLObject pph_apply_template(final SubLObject template, final SubLObject formula) {
		SubLObject caching_state = $pph_apply_template_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(PPH_APPLY_TEMPLATE, $pph_apply_template_caching_state$, $int$128, EQUAL, TWO_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(template, formula);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (template.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && formula.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pph_apply_template_internal(template, formula)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, formula));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject do_pph_apply_template(final SubLObject template, SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != pph_identity_template_p(template)) {
			return formula;
		}
		if (NIL != pph_impossible_template_p(template)) {
			return pph_bad_template(template, formula);
		}
		if (NIL != pph_phrase.pph_unknown_cycl_p(formula)) {
			return template;
		}
		if ((NIL != formula_arg_nautP(template)) && (NIL != pph_arg_position_specifierP(cycl_utilities.nat_arg2(template, UNPROVIDED)))) {
			SubLObject current;
			final SubLObject datum = current = cycl_utilities.nat_args(template, UNPROVIDED);
			SubLObject argnum = NIL;
			SubLObject core_template = NIL;
			destructuring_bind_must_consp(current, datum, $list343);
			argnum = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list343);
			core_template = current.first();
			current = current.rest();
			if (NIL != current) {
				cdestructuring_bind_error(datum, $list343);
				return NIL;
			}
			final SubLObject core_ans = do_pph_apply_template(core_template, formula);
			if (NIL != pph_arg_position_specifierP(core_ans)) {
				return make_formula_arg_naut(argnum, core_ans);
			}
			if (NIL != cycl_utilities.expression_find(pph_vars.$pph_bad_template_dummy$.getGlobalValue(), core_ans, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
				return make_formula_arg_naut(argnum, core_ans);
			}
			if (NIL != cycl_variables.el_varP(core_ans)) {
				return make_formula_arg_naut(argnum, core_ans);
			}
			if ((NIL != ok_for_formula_arg_p(core_ans)) && (NIL != formula_arityGE(core_ans, argnum, UNPROVIDED))) {
				return cycl_utilities.formula_arg(core_ans, argnum, UNPROVIDED);
			}
			return pph_bad_template(template, formula);
		} else if (NIL != at_admitted.generic_arg_p(template)) {
			final SubLObject argnum2 = at_utilities.generic_arg_num(template);
			if (NIL != pph_arg_position_specifierP(formula)) {
				SubLObject wrappers = NIL;
				while (NIL != formula_arg_nautP(formula)) {
					wrappers = cons(butlast(formula, UNPROVIDED), wrappers);
					formula = list_utilities.last_one(formula);
				}
				final SubLObject argnum_$82 = at_utilities.generic_arg_num(template);
				SubLObject ans = formula;
				SubLObject cdolist_list_var = wrappers;
				SubLObject wrapper = NIL;
				wrapper = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					ans = append(wrapper, list(ans));
					cdolist_list_var = cdolist_list_var.rest();
					wrapper = cdolist_list_var.first();
				}
				return make_formula_arg_naut(argnum_$82, ans);
			}
			if ((NIL != ok_for_formula_arg_p(formula)) && ((NIL == ok_for_formula_arity_p(formula)) || (NIL != formula_arityGE(formula, argnum2, UNPROVIDED)))) {
				return cycl_utilities.formula_arg(formula, argnum2, UNPROVIDED);
			}
			if (pph_vars.$pph_bad_template_dummy$.getGlobalValue().eql(formula)) {
				return make_formula_arg_naut(argnum2, formula);
			}
			return pph_bad_template(template, formula);
		} else {
			if (template.equal(formula)) {
				return formula;
			}
			if (NIL != el_formula_p(template)) {
				SubLObject new_formula_terms = NIL;
				SubLObject seq_var = NIL;
				final SubLObject _prev_bind_0 = pph_vars.$pph_error_on_bad_templatesP$.currentBinding(thread);
				try {
					pph_vars.$pph_error_on_bad_templatesP$.bind(NIL, thread);
					seq_var = do_pph_apply_template(sequence_var(template, UNPROVIDED), formula);
					SubLObject cdolist_list_var;
					final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(template, $IGNORE);
					SubLObject item = NIL;
					item = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						new_formula_terms = cons(do_pph_apply_template(item, formula), new_formula_terms);
						cdolist_list_var = cdolist_list_var.rest();
						item = cdolist_list_var.first();
					}
				} finally {
					pph_vars.$pph_error_on_bad_templatesP$.rebind(_prev_bind_0, thread);
				}
				final SubLObject new_formula = list_to_elf(nreverse(new_formula_terms));
				return maybe_add_sequence_var_to_end(seq_var, new_formula);
			}
			return template;
		}

	}

	public static SubLObject pph_bad_template(final SubLObject template, final SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != pph_vars.$pph_error_on_bad_templatesP$.getDynamicValue(thread)) {
			final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy($str344$Can_t_apply__S_to__S___) });
			pph_error.pph_handle_error(new_format_string, list(template, formula));
			return NIL;
		}
		if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
			Errors.warn($str344$Can_t_apply__S_to__S___, template, formula);
			force_output(StreamsLow.$error_output$.getDynamicValue(thread));
		}
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$pph_error_on_bad_templatesP$.currentBinding(thread);
		try {
			pph_vars.$pph_error_on_bad_templatesP$.bind(T, thread);
			final SubLObject dummy = do_pph_apply_template(template, pph_vars.$pph_bad_template_dummy$.getGlobalValue());
			ans = cycl_utilities.expression_subst(formula, pph_vars.$pph_bad_template_dummy$.getGlobalValue(), dummy, UNPROVIDED, UNPROVIDED);
		} finally {
			pph_vars.$pph_error_on_bad_templatesP$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject ok_for_formula_arg_p(final SubLObject v_object) {
		return makeBoolean(((NIL != nart_handles.nart_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object))) || (NIL != el_formula_p(v_object)));
	}

	public static SubLObject ok_for_formula_terms_p(final SubLObject v_object) {
		return makeBoolean(((NIL != nart_handles.nart_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object))) || (NIL != el_formula_p(v_object)));
	}

	public static SubLObject ok_for_formula_arity_p(final SubLObject v_object) {
		return makeBoolean(((NIL != nart_handles.nart_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object))) || (NIL != el_formula_p(v_object)));
	}

	public static SubLObject pph_test_dnf_new(final SubLObject dnf) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject hl_dnf = copy_tree(dnf);
		SubLObject ans = NIL;
		SubLObject list_var = NIL;
		SubLObject el_var = NIL;
		SubLObject varnum = NIL;
		list_var = list_utilities.tree_gather(hl_dnf, $sym297$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		el_var = list_var.first();
		for (varnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), varnum = add(ONE_INTEGER, varnum)) {
			hl_dnf = subst(variables.get_variable(varnum), el_var, hl_dnf, UNPROVIDED, UNPROVIDED);
		}
		if (NIL == ans) {
			SubLObject csome_list_var = hl_dnf;
			SubLObject clause = NIL;
			clause = csome_list_var.first();
			while ((NIL == ans) && (NIL != csome_list_var)) {
				if (NIL == inference_kernel.new_cyc_query_from_dnf(clause, pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
					ans = $UNKNOWN;
				}
				csome_list_var = csome_list_var.rest();
				clause = csome_list_var.first();
			}
		}
		if (ans != $UNKNOWN) {
			ans = $TRUE;
		}
		return ans;
	}

	public static SubLObject pph_test_dnf(final SubLObject dnf) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == dnf) {
			final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy($str345$PPH_TEST_DNF_passed_NIL_) });
			pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		}
		SubLObject result = NIL;
		SubLObject unknown_disjunctP = NIL;
		if (NIL == result) {
			SubLObject csome_list_var = dnf;
			SubLObject disjunct = NIL;
			disjunct = csome_list_var.first();
			while ((NIL == result) && (NIL != csome_list_var)) {
				SubLObject curr_result = NIL;
				SubLObject current;
				final SubLObject datum = current = disjunct;
				SubLObject neg_lits = NIL;
				SubLObject pos_lits = NIL;
				destructuring_bind_must_consp(current, datum, $list346);
				neg_lits = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list346);
				pos_lits = current.first();
				current = current.rest();
				if (NIL == current) {
					if (NIL == curr_result) {
						SubLObject csome_list_var_$83 = neg_lits;
						SubLObject neg_lit = NIL;
						neg_lit = csome_list_var_$83.first();
						while ((NIL == curr_result) && (NIL != csome_list_var_$83)) {
							if (NIL != pph_ask_lit(neg_lit, UNPROVIDED)) {
								if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
									format_nil.force_format(T, $str347$_S_was_required_to_be_false__but_, neg_lit, pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								}
								curr_result = $FALSE;
							}
							csome_list_var_$83 = csome_list_var_$83.rest();
							neg_lit = csome_list_var_$83.first();
						}
					}
					if (NIL == curr_result) {
						SubLObject csome_list_var_$84 = pos_lits;
						SubLObject pos_lit = NIL;
						pos_lit = csome_list_var_$84.first();
						while ((NIL == curr_result) && (NIL != csome_list_var_$84)) {
							if (NIL == pph_ask_lit(pos_lit, UNPROVIDED)) {
								if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
									format_nil.force_format(T, $str349$_S_is_not_known_to_be_true_in__S_, pos_lit, pph_vars.$pph_domain_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								}
								curr_result = $UNKNOWN;
							}
							csome_list_var_$84 = csome_list_var_$84.rest();
							pos_lit = csome_list_var_$84.first();
						}
					}
				} else {
					cdestructuring_bind_error(datum, $list346);
				}
				final SubLObject pcase_var = curr_result;
				if (!pcase_var.eql($FALSE)) {
					if (pcase_var.eql($UNKNOWN)) {
						unknown_disjunctP = T;
					} else {
						result = $TRUE;
					}
				}
				csome_list_var = csome_list_var.rest();
				disjunct = csome_list_var.first();
			}
		}
		if (result == $TRUE) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str350$__Condition_passed___S, dnf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			return $TRUE;
		}
		if (NIL != unknown_disjunctP) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str351$__Condition_not_known_true__so_fa, dnf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			return $UNKNOWN;
		}
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
			format_nil.force_format(T, $str352$__Condition_failed___S, dnf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return $FALSE;
	}

	public static SubLObject pph_ask_lit_internal(final SubLObject literal, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		SubLObject confirmedP = pph_ask_lit_int(literal, mt);
		if (NIL == confirmedP) {
			final SubLObject non_indexical_literal = pph_resolve_indexicals(literal, mt);
			confirmedP = makeBoolean((!literal.equal(non_indexical_literal)) && (NIL != pph_ask_lit_int(non_indexical_literal, mt)));
		}
		return confirmedP;
	}

	public static SubLObject pph_ask_lit(final SubLObject literal, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_ask_lit_internal(literal, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_ASK_LIT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_ASK_LIT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_ASK_LIT, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(literal, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (literal.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_ask_lit_internal(literal, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(literal, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_ask_lit_int(final SubLObject literal, final SubLObject mt) {
		final SubLObject special_case_result = pph_ask_lit_special_case_result(literal);
		final SubLObject nart_substituted = pph_nart_substitute(literal);
		if ($TRUE == special_case_result) {
			return T;
		}
		if ($FALSE == special_case_result) {
			return NIL;
		}
		if (NIL != pph_use_removal_askP(nart_substituted)) {
			return pph_removal_ask_boolean(nart_substituted, mt);
		}
		return pph_ask_boolean(nart_substituted, mt, UNPROVIDED);
	}

	public static SubLObject pph_ask_lit_special_case_result(final SubLObject literal) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = $UNKNOWN;
		final SubLObject mt = (NIL != pph_types.pph_phrase_nautP(cycl_utilities.atomic_sentence_arg1(literal, UNPROVIDED))) ? pph_vars.$pph_language_mt$.getDynamicValue(thread) : pph_vars.$pph_domain_mt$.getDynamicValue(thread);
		if (NIL != el_formula_with_any_of_operators_p(literal, $list354)) {
			final SubLObject thing1 = cycl_utilities.formula_arg1(literal, UNPROVIDED);
			final SubLObject thing2 = cycl_utilities.formula_arg2(literal, UNPROVIDED);
			if (thing1.equal(thing2)) {
				result = $TRUE;
			} else if (narts_high.nart_substitute(thing1).equal(narts_high.nart_substitute(thing2))) {
				result = $TRUE;
			} else {
				result = $FALSE;
			}

		} else if (NIL != el_formula_with_operator_p(literal, $$isa)) {
			result = (NIL != pph_isaP(cycl_utilities.formula_arg1(literal, UNPROVIDED), cycl_utilities.formula_arg2(literal, UNPROVIDED), mt)) ? $TRUE : $FALSE;
		} else if (NIL != el_formula_with_operator_p(literal, $$termFormulas)) {
			result = (NIL != cycl_utilities.expression_find(cycl_utilities.formula_arg1(literal, UNPROVIDED), cycl_utilities.formula_arg2(literal, UNPROVIDED), T, UNPROVIDED, UNPROVIDED)) ? $TRUE : $FALSE;
		} else if (NIL != el_formula_with_operator_p(literal, $$genls)) {
			result = (NIL != pph_genlP(cycl_utilities.formula_arg1(literal, UNPROVIDED), cycl_utilities.formula_arg2(literal, UNPROVIDED), mt)) ? $TRUE : $FALSE;
		} else if (NIL != el_formula_with_operator_p(literal, $$genlPreds)) {
			result = (NIL != pph_genl_predicateP(cycl_utilities.formula_arg1(literal, UNPROVIDED), cycl_utilities.formula_arg2(literal, UNPROVIDED), UNPROVIDED)) ? $TRUE : $UNKNOWN;
		} else if (NIL != el_formula_with_operator_p(literal, $$quotedIsa)) {
			result = (NIL != pph_quoted_isaP(cycl_utilities.formula_arg1(literal, UNPROVIDED), cycl_utilities.formula_arg2(literal, UNPROVIDED))) ? $TRUE : $FALSE;
		} else if (NIL != el_formula_with_operator_p(literal, $$quotedFormulaArity)) {
			result = (NIL != formula_arityE(czer_main.unquote_quoted_term(cycl_utilities.formula_arg1(literal, UNPROVIDED), UNPROVIDED), cycl_utilities.formula_arg2(literal, UNPROVIDED), UNPROVIDED)) ? $TRUE : $FALSE;
		} else if (NIL != el_formula_with_operator_p(literal, $$natFunction)) {
			result = (function_terms.nart_to_naut(cycl_utilities.nat_function(cycl_utilities.formula_arg1(literal, UNPROVIDED))).equal(function_terms.nart_to_naut(cycl_utilities.formula_arg2(literal, UNPROVIDED)))) ? $TRUE : $FALSE;
		} else if (NIL != el_formula_with_operator_p(literal, $$operatorFormulas)) {
			result = (NIL != el_formula_with_operator_p(cycl_utilities.formula_arg2(literal, UNPROVIDED), cycl_utilities.formula_arg1(literal, UNPROVIDED))) ? $TRUE : $FALSE;
		} else if (NIL != formula_pattern_match.formula_matches_pattern(literal, $list361)) {
			result = (NIL != formula_arityE(cycl_utilities.atomic_sentence_arg1(literal, UNPROVIDED), cycl_utilities.atomic_sentence_arg2(literal, UNPROVIDED), UNPROVIDED)) ? $TRUE : $FALSE;
		} else if (NIL != el_formula_with_operator_p(literal, $$longerDurationThan)) {
			SubLObject current;
			final SubLObject datum = current = cycl_utilities.formula_args(literal, UNPROVIDED);
			SubLObject thing3 = NIL;
			SubLObject thing4 = NIL;
			destructuring_bind_must_consp(current, datum, $list363);
			thing3 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list363);
			thing4 = current.first();
			current = current.rest();
			if (NIL == current) {
				result = (NIL != pph_longer_durationP(thing3, thing4)) ? $TRUE : NIL != pph_longer_durationP(thing4, thing3) ? $FALSE : $UNKNOWN;
			} else {
				cdestructuring_bind_error(datum, $list363);
			}
		} else if (NIL != el_formula_with_operator_p(literal, $$posPredOfConstituent)) {
			result = (NIL != pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(cycl_utilities.formula_arg1(literal, UNPROVIDED)), cycl_utilities.formula_arg2(literal, UNPROVIDED), UNPROVIDED)) ? $TRUE : $FALSE;
		} else if (NIL != el_formula_with_operator_p(literal, $$posOfPhrase)) {
			result = (NIL != pph_genl_posP(pph_phrase.pph_phrase_head_pos(cycl_utilities.formula_arg1(literal, UNPROVIDED)), cycl_utilities.formula_arg2(literal, UNPROVIDED), UNPROVIDED)) ? $TRUE : $FALSE;
		} else if (NIL != el_formula_with_operator_p(literal, $$unknownSentence)) {
			final SubLObject pcase_var = pph_ask_lit_special_case_result(cycl_utilities.atomic_sentence_arg1(literal, UNPROVIDED));
			if (pcase_var.eql($TRUE)) {
				result = $FALSE;
			} else if (pcase_var.eql($FALSE)) {
				result = $TRUE;
			}

		} else if (NIL != el_formula_with_operator_p(literal, $$not)) {
			result = (pph_ask_lit_special_case_result(cycl_utilities.atomic_sentence_arg1(literal, UNPROVIDED)).eql($FALSE)) ? $TRUE : $FALSE;
		} else if ((NIL != el_formula_with_operator_p(literal, $$generatesAsFirstOrder)) && (NIL == member(GENERATE_CONSTANT_DEFAULT, pph_types.get_paraphrase_methods(cycl_utilities.atomic_sentence_arg1(literal, UNPROVIDED)), symbol_function(EQL), symbol_function(FIRST)))) {
			result = $FALSE;
		} else if ((NIL == closedP(literal, UNPROVIDED)) || (NIL == pph_cycl_sentence_askableP(literal))) {
			result = $FALSE;
		}

		return result;
	}

	public static SubLObject pph_cycl_sentence_askableP(final SubLObject literal) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
		final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				ans = collection_defns.cycl_sentence_askableP(literal);
			} finally {
				final SubLObject _prev_bind_0_$85 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject pph_usable_condition_testP(final SubLObject test) {
		return makeBoolean((NIL != closedP(test, UNPROVIDED)) || ((NIL != atomic_sentenceP(test)) && ($UNKNOWN != pph_ask_lit_special_case_result(test))));
	}

	public static SubLObject pph_use_removal_askP(final SubLObject literal) {
		return makeBoolean(NIL == cycl_utilities.expression_find_if($sym371$NAUT_, literal, UNPROVIDED, UNPROVIDED));
	}

	public static SubLObject pph_ask_variable(final SubLObject var, final SubLObject sentence, SubLObject mt, SubLObject backchain, SubLObject number) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (backchain == UNPROVIDED) {
			backchain = NIL;
		}
		if (number == UNPROVIDED) {
			number = NIL;
		}
		return pph_ask_template(var, sentence, mt, backchain, number);
	}

	public static SubLObject pph_ask_variable_new(final SubLObject variable, final SubLObject sentence, SubLObject mt, SubLObject other_properties) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (other_properties == UNPROVIDED) {
			other_properties = NIL;
		}
		return pph_ask_template_new(variable, sentence, mt, other_properties);
	}

	public static SubLObject pph_longer_durationP(final SubLObject duration1, final SubLObject duration2) {
		final SubLObject dur1 = pph_min_duration(duration1);
		final SubLObject dur2 = pph_max_duration(duration2);
		return makeBoolean((NIL != pph_removal_ask_boolean(list($$greaterThan, dur1, dur2), $$InferencePSC)) || ((NIL != pph_unbounded_duration_p(dur1)) && (NIL == pph_unbounded_duration_p(dur2))));
	}

	public static SubLObject pph_unbounded_duration_p(final SubLObject duration) {
		if (NIL != formula_pattern_match.formula_matches_pattern(duration, $list373)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_min_duration(final SubLObject duration) {
		if (NIL != formula_pattern_match.formula_matches_pattern(duration, $list374)) {
			return pph_cycl_duration(cycl_utilities.formula_arg1(duration, UNPROVIDED), $MIN);
		}
		return duration;
	}

	public static SubLObject pph_max_duration(final SubLObject duration) {
		if (NIL != formula_pattern_match.formula_matches_pattern(duration, $list374)) {
			return pph_cycl_duration(cycl_utilities.formula_arg1(duration, UNPROVIDED), $MAX);
		}
		return duration;
	}

	public static SubLObject pph_cycl_duration(final SubLObject temporal_thing, final SubLObject min_or_max) {
		if (NIL != term.nautP(temporal_thing, UNPROVIDED)) {
			final SubLObject pcase_var = cycl_utilities.nat_function(temporal_thing);
			if (pcase_var.eql($$DayFn)) {
				return $list378;
			}
			if (pcase_var.eql($$MonthFn)) {
				return $list380;
			}
			if (pcase_var.eql($$YearFn)) {
				return $list382;
			}
			if (pcase_var.eql($$TimeIntervalInclusiveFn) || pcase_var.eql($$TimeIntervalBetweenFn)) {
				return pph_time_interval_cycl_duration(temporal_thing, min_or_max);
			}
		}
		final SubLObject durations = (NIL != term.el_fort_p(temporal_thing)) ? pph_ask_variable_new($sym385$_DUR, listS($$duration, temporal_thing, $list387), $$InferencePSC, $list388) : NIL;
		return NIL != durations ? durations.first() : make_unary_formula($$DurationFn, temporal_thing);
	}

	public static SubLObject pph_time_interval_cycl_duration(final SubLObject nat, final SubLObject min_or_max) {
		SubLObject duration = NIL;
		SubLObject current;
		final SubLObject datum = current = cycl_utilities.nat_args(nat, UNPROVIDED);
		SubLObject start = NIL;
		SubLObject end = NIL;
		destructuring_bind_must_consp(current, datum, $list390);
		start = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list390);
		end = current.first();
		current = current.rest();
		if (NIL == current) {
			if (min_or_max.eql($MIN)) {
				start = pph_find_end_date(start);
				end = pph_find_start_date(end);
			} else {
				start = pph_find_start_date(start);
				end = pph_find_end_date(end);
			}
			final SubLObject raw_duration = pph_ask_variable($sym385$_DUR, list($$evaluate, $sym385$_DUR, list($$TimeElapsedFn, start, end)), UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
			if (NIL != raw_duration) {
				duration = pph_adjust_time_interval_cycl_duration(nat, raw_duration);
			}
		} else {
			cdestructuring_bind_error(datum, $list390);
		}
		return duration;
	}

	public static SubLObject pph_find_start_date(final SubLObject time_interval) {
		if (NIL != formula_pattern_match.formula_matches_pattern(time_interval, $list393)) {
			return cycl_utilities.nat_arg1(time_interval, UNPROVIDED);
		}
		return time_interval;
	}

	public static SubLObject pph_find_end_date(final SubLObject time_interval) {
		if (NIL != formula_pattern_match.formula_matches_pattern(time_interval, $list393)) {
			return cycl_utilities.nat_arg1(time_interval, UNPROVIDED);
		}
		return time_interval;
	}

	public static SubLObject pph_adjust_time_interval_cycl_duration(final SubLObject nat, final SubLObject raw_duration) {
		final SubLObject pcase_var = cycl_utilities.nat_functor(nat);
		if (pcase_var.eql($$TimeIntervalInclusiveFn)) {
			return pph_increment_cycl_duration(raw_duration);
		}
		if (pcase_var.eql($$TimeIntervalBetweenFn)) {
			return pph_decrement_cycl_duration(raw_duration);
		}
		return raw_duration;
	}

	public static SubLObject pph_increment_cycl_duration(final SubLObject raw_duration) {
		if (NIL != pph_adjustable_duration_p(raw_duration)) {
			return replace_formula_arg(ONE_INTEGER, number_utilities.f_1X(cycl_utilities.nat_arg1(raw_duration, UNPROVIDED)), raw_duration);
		}
		return raw_duration;
	}

	public static SubLObject pph_decrement_cycl_duration(final SubLObject raw_duration) {
		if (NIL != pph_adjustable_duration_p(raw_duration)) {
			return replace_formula_arg(ONE_INTEGER, number_utilities.f_1_(cycl_utilities.nat_arg1(raw_duration, UNPROVIDED)), raw_duration);
		}
		return raw_duration;
	}

	public static SubLObject pph_adjustable_duration_p(final SubLObject raw_duration) {
		return makeBoolean(((NIL != possibly_naut_p(raw_duration)) && (NIL != formula_arityE(raw_duration, ONE_INTEGER, UNPROVIDED))) && cycl_utilities.nat_arg1(raw_duration, UNPROVIDED).isInteger());
	}

	public static SubLObject pph_maybe_add_query_to_top_20(final SubLObject query_sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject time) {
		return NIL;
	}

	public static SubLObject destroyable_pph_inferenceP(final SubLObject obj) {
		return makeBoolean((NIL != inference_datastructures_inference.valid_inference_p(obj)) || (NIL != pattern_match.tree_matches_pattern(obj, $list399)));
	}

	public static SubLObject pph_inference_destroyer() {
		return $pph_inference_destroyer$.getGlobalValue();
	}

	public static SubLObject smite_doomed_pph_inferences_next_time_around() {
		return delayed_processor.delayed_processor_flush_next_time_around(pph_inference_destroyer());
	}

	public static SubLObject pph_destroy_inference(final SubLObject inference, SubLObject store) {
		if (store == UNPROVIDED) {
			store = (NIL != inference_datastructures_inference.inference_p(inference)) ? inference_datastructures_inference.inference_problem_store(inference) : NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject success = pattern_match.tree_matches_pattern(inference, $list401);
		final SubLObject v_bindings = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != success) {
			final SubLObject real_store = list_utilities.alist_lookup_without_values(v_bindings, REAL_STORE, UNPROVIDED, UNPROVIDED);
			final SubLObject real_inference = list_utilities.alist_lookup_without_values(v_bindings, REAL_INFERENCE, UNPROVIDED, UNPROVIDED);
			return pph_destroy_inference(real_inference, real_store);
		}
		inference_datastructures_inference.destroy_inference(inference);
		return pph_macros.pph_maybe_destroy_problem_store(store);
	}

	public static SubLObject set_pph_inference_destruction_grace_period(final SubLObject seconds) {
		return delayed_processor.delayed_processor_set_delay_seconds($pph_inference_destroyer$.getGlobalValue(), seconds);
	}

	public static SubLObject pph_query(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (v_properties == UNPROVIDED) {
			v_properties = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (((NIL == pph_vars.$meter_pph_queriesP$.getDynamicValue(thread)) && (NIL == inference_datastructures_problem_store.valid_problem_store_p(inference_datastructures_enumerated_types.inference_properties_problem_store(v_properties)))) && (NIL == list_utilities.filter_plist(v_properties, PROBLEM_STORE_PROPERTY_P))) {
			v_properties = putf(copy_list(v_properties), $PROBLEM_STORE, pph_macros.pph_problem_store(T));
		}
		if (NIL == getf(v_properties, $kw406$ALLOW_INDETERMINATE_RESULTS_, NIL)) {
			v_properties = putf(copy_list(v_properties), $kw406$ALLOW_INDETERMINATE_RESULTS_, NIL);
		}
		if ((NIL != pph_vars.retain_pph_queriesP()) && (NIL == list_utilities.plist_has_keyP(v_properties, $BROWSABLE_))) {
			v_properties = putf(copy_list(v_properties), $BROWSABLE_, T);
		}
		final SubLObject store = pph_macros.pph_problem_store(UNPROVIDED);
		if (NIL == inference_datastructures_problem_store.valid_problem_store_p(store)) {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str408$Asking__S_without_a_valid_cached_, sentence, store);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
		} else if (inference_datastructures_problem_store.problem_store_size(store).isZero() && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
			format_nil.force_format(T, $str409$Using__S_for_query_, store, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}

		SubLObject ans = NIL;
		SubLObject inference = NIL;
		SubLObject query_runP = NIL;
		SubLObject suspend_status = NIL;
		final SubLObject query_signature = list(sentence, mt, v_properties);
		if (NIL == hlmt.hlmt_p(mt)) {
			final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy($str410$Bad_mt_to_PPH_QUERY___S) });
			pph_error.pph_handle_error(new_format_string, list(mt));
		}
		if ((NIL != stacks.stack_p($pph_query_stack$.getDynamicValue(thread))) && (NIL != stacks.stack_find(query_signature, $pph_query_stack$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED))) {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str411$Recursive_call_to_PPH_QUERY_on_fo, sentence);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
		} else if ((NIL != stacks.stack_p($pph_query_stack$.getDynamicValue(thread))) && stacks.stack_size($pph_query_stack$.getDynamicValue(thread)).numG($pph_query_stack_max_size$.getDynamicValue(thread))) {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str412$Too_many_nested_calls_to_PPH_QUER, stacks.stack_size($pph_query_stack$.getDynamicValue(thread)));
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
		} else {
			final SubLObject _prev_bind_0 = $pph_query_stack$.currentBinding(thread);
			try {
				$pph_query_stack$.bind(NIL != stacks.stack_p($pph_query_stack$.getDynamicValue(thread)) ? $pph_query_stack$.getDynamicValue(thread) : stacks.create_stack(), thread);
				SubLObject time = NIL;
				stacks.stack_push(query_signature, $pph_query_stack$.getDynamicValue(thread));
				final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
				final SubLObject _prev_bind_0_$86 = memoization_state.$memoization_state$.currentBinding(thread);
				try {
					memoization_state.$memoization_state$.bind(local_state, thread);
					final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
					try {
						final SubLObject time_var = get_internal_real_time();
						thread.resetMultipleValues();
						final SubLObject ans_$87 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
						final SubLObject suspend_status_$88 = thread.secondMultipleValue();
						final SubLObject inference_$89 = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						ans = ans_$87;
						suspend_status = suspend_status_$88;
						inference = inference_$89;
						time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
					} finally {
						final SubLObject _prev_bind_0_$87 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values = getValuesAsVector();
							memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
							restoreValuesFromVector(_values);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
						}
					}
				} finally {
					memoization_state.$memoization_state$.rebind(_prev_bind_0_$86, thread);
				}
				if (NIL != misc_utilities.initialized_p($pph_query_cumulative_time$.getDynamicValue(thread))) {
					$pph_query_cumulative_time$.setDynamicValue(add($pph_query_cumulative_time$.getDynamicValue(thread), time), thread);
				}
				pph_maybe_add_query_to_top_20(sentence, mt, v_properties, time);
				if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
					if (NIL == pph_vars.retain_pph_queriesP()) {
						pph_destroy_inference(inference, UNPROVIDED);
					} else if (NIL != inference_datastructures_inference.inference_browsableP(inference)) {
						delayed_processor.schedule(pph_inference_destroyer(), cons(inference, inference_datastructures_inference.inference_problem_store(inference)));
					}

				}
				query_runP = T;
				stacks.stack_pop($pph_query_stack$.getDynamicValue(thread));
			} finally {
				$pph_query_stack$.rebind(_prev_bind_0, thread);
			}
		}

		if (NIL != ans) {
			return values(ans, query_runP, inference);
		}
		if (NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p(suspend_status)) {
			final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy(inference_datastructures_enumerated_types.inference_error_suspend_status_message(suspend_status)) });
			pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
		} else if ($ILL_FORMED == suspend_status) {
			final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy($str414$Ill_formed_PPH_query_____S___in__) });
			pph_error.pph_handle_error(new_format_string, list(sentence, mt));
		} else if (suspend_status == $MAX_TIME) {
			final SubLObject ask_time = inference_datastructures_enumerated_types.inference_properties_max_time(v_properties);
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str416$Couldn_t_resolve__S_in__S_seconds, sentence, ask_time);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
		}

		return values(ans, query_runP, NIL != inference_datastructures_inference.valid_inference_p(inference) ? inference : NIL);
	}

	public static SubLObject pph_removal_ask_variable_internal(final SubLObject variable_token, final SubLObject asent, SubLObject mt, SubLObject allowed_modules_spec) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (allowed_modules_spec == UNPROVIDED) {
			allowed_modules_spec = $ALL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		if (NIL != cycl_grammar.cycl_atomic_sentence_p(asent)) {
			final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
			final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
			try {
				memoization_state.$memoization_state$.bind(local_state, thread);
				final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
				try {
					ans = backward.removal_ask_variable(variable_token, asent, mt, $TRUE, list($ALLOWED_MODULES, allowed_modules_spec));
				} finally {
					final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
						restoreValuesFromVector(_values);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
					}
				}
			} finally {
				memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
			}
		}
		return ans;
	}

	public static SubLObject pph_removal_ask_variable(final SubLObject variable_token, final SubLObject asent, SubLObject mt, SubLObject allowed_modules_spec) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (allowed_modules_spec == UNPROVIDED) {
			allowed_modules_spec = $ALL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_removal_ask_variable_internal(variable_token, asent, mt, allowed_modules_spec);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_REMOVAL_ASK_VARIABLE, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_REMOVAL_ASK_VARIABLE, FOUR_INTEGER, $int$100, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_REMOVAL_ASK_VARIABLE, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_4(variable_token, asent, mt, allowed_modules_spec);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (variable_token.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (asent.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (mt.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (((NIL != cached_args) && (NIL == cached_args.rest())) && allowed_modules_spec.equal(cached_args.first())) {
								return memoization_state.caching_results(results2);
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_removal_ask_variable_internal(variable_token, asent, mt, allowed_modules_spec)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(variable_token, asent, mt, allowed_modules_spec));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_removal_ask_boolean_internal(SubLObject literal, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject allowed_modules_spec = $list421;
		SubLObject ans = NIL;
		SubLObject query_runP = NIL;
		SubLObject time = NIL;
		if (NIL != cycl_grammar.cycl_atomic_sentence_p(literal)) {
			literal = narts_high.nart_substitute(literal);
			final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
			final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
			try {
				memoization_state.$memoization_state$.bind(local_state, thread);
				final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
				try {
					final SubLObject _prev_bind_0_$92 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
					try {
						pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EVERYTHING, thread);
						SubLObject removal_ask_result = NIL;
						SubLObject error_message = NIL;
						final SubLObject time_var = get_internal_real_time();
						try {
							thread.throwStack.push($catch_error_message_target$.getGlobalValue());
							final SubLObject _prev_bind_0_$93 = Errors.$error_handler$.currentBinding(thread);
							try {
								Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
								try {
									removal_ask_result = backward.removal_ask(literal, mt, $TRUE, list($ALLOWED_MODULES, allowed_modules_spec));
								} catch (final Throwable catch_var) {
									Errors.handleThrowable(catch_var, NIL);
								}
							} finally {
								Errors.$error_handler$.rebind(_prev_bind_0_$93, thread);
							}
						} catch (final Throwable ccatch_env_var) {
							error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
						} finally {
							thread.throwStack.pop();
						}
						time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
						if (((NIL != error_message) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
							Errors.warn($str422$Inference_Error_while_asking__S__, literal, error_message);
							force_output(StreamsLow.$error_output$.getDynamicValue(thread));
						}
						pph_maybe_add_query_to_top_20(literal, mt, NIL, time);
						query_runP = T;
						if (NIL != $verify_pph_removal_ask_booleanP$.getDynamicValue(thread)) {
							verify_pph_removal_ask_boolean(literal, mt, removal_ask_result, allowed_modules_spec);
						}
						ans = list_utilities.sublisp_boolean(removal_ask_result);
					} finally {
						pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$92, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
						restoreValuesFromVector(_values);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
					}
				}
			} finally {
				memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
			}
		}
		return values(ans, query_runP);
	}

	public static SubLObject pph_removal_ask_boolean(final SubLObject literal, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_removal_ask_boolean_internal(literal, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_REMOVAL_ASK_BOOLEAN, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_REMOVAL_ASK_BOOLEAN, TWO_INTEGER, $int$1000, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_REMOVAL_ASK_BOOLEAN, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(literal, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (literal.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_removal_ask_boolean_internal(literal, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(literal, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject verify_pph_removal_ask_boolean(final SubLObject literal, final SubLObject mt, final SubLObject removal_ask_result, final SubLObject allowed_modules_spec) {
		final SubLObject pph_query_result = pph_query(literal, mt, list($kw424$TRANSFORMATION_ALLOWED_, NIL, $ALLOWED_MODULES, allowed_modules_spec));
		SubLObject okP = NIL;
		okP = eq(cyc_kernel.closed_query_success_result_p(pph_query_result), list_utilities.sublisp_boolean(removal_ask_result));
		if (NIL == okP) {
			Errors.sublisp_break($str425$Inconsistent_removal_ask_results_, new SubLObject[] { literal, removal_ask_result, pph_query_result });
		}
		return okP;
	}

	public static SubLObject pph_irrelevant_fort(final SubLObject v_object, SubLObject pph_relevance_safe_list, SubLObject domain_mt) {
		if (pph_relevance_safe_list == UNPROVIDED) {
			pph_relevance_safe_list = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLObject irrelevantP = makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL == cycl_utilities.expression_find(v_object, make_el_list(pph_relevance_safe_list, UNPROVIDED), T, symbol_function(EQ), UNPROVIDED))) && (NIL != rkf_relevance_utilities.rkf_irrelevant_term(v_object, domain_mt)));
		if (NIL != irrelevantP) {
		}
		return irrelevantP;
	}

	public static SubLObject pph_ask_boolean_internal(final SubLObject sentence, SubLObject mt, SubLObject backchains) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (backchains == UNPROVIDED) {
			backchains = ZERO_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != ist_sentence_p(sentence, UNPROVIDED)) {
			return pph_ask_boolean(cycl_utilities.formula_arg2(sentence, UNPROVIDED), cycl_utilities.formula_arg1(sentence, UNPROVIDED), backchains);
		}
		if ((((NIL != el_conjunction_p(sentence)) || (NIL != el_disjunction_p(sentence))) || (NIL != el_negation_p(sentence))) || (NIL != atomic_sentenceP(sentence))) {
			SubLObject all_clauses_so_far_falseP = T;
			final SubLObject v_clauses = pph_templates.pph_dnf_clausal_form(sentence);
			final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
			try {
				pph_vars.$pph_domain_mt$.bind(mt, thread);
				SubLObject cdolist_list_var = v_clauses;
				SubLObject dnf = NIL;
				dnf = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject doneP = NIL;
					SubLObject result_so_far = NIL;
					if (NIL == doneP) {
						SubLObject csome_list_var = clauses.pos_lits(dnf);
						SubLObject lit = NIL;
						lit = csome_list_var.first();
						while ((NIL == doneP) && (NIL != csome_list_var)) {
							final SubLObject pcase_var;
							final SubLObject lit_result = pcase_var = pph_ask_lit_special_case_result(lit);
							if (pcase_var.eql($TRUE)) {
								if (NIL == result_so_far) {
									result_so_far = $TRUE;
								}
							} else if (pcase_var.eql($FALSE)) {
								result_so_far = $FALSE;
								doneP = T;
							} else if (pcase_var.eql($UNKNOWN)) {
								result_so_far = $UNKNOWN;
							}

							csome_list_var = csome_list_var.rest();
							lit = csome_list_var.first();
						}
					}
					if (NIL == doneP) {
						SubLObject csome_list_var = clauses.neg_lits(dnf);
						SubLObject lit = NIL;
						lit = csome_list_var.first();
						while ((NIL == doneP) && (NIL != csome_list_var)) {
							final SubLObject pcase_var;
							final SubLObject lit_result = pcase_var = pph_ask_lit_special_case_result(lit);
							if (pcase_var.eql($FALSE)) {
								if (NIL == result_so_far) {
									result_so_far = $TRUE;
								}
							} else if (pcase_var.eql($TRUE)) {
								result_so_far = $FALSE;
								doneP = T;
							} else if (pcase_var.eql($UNKNOWN)) {
								result_so_far = $UNKNOWN;
							}

							csome_list_var = csome_list_var.rest();
							lit = csome_list_var.first();
						}
					}
					final SubLObject pcase_var2 = result_so_far;
					if (pcase_var2.eql($TRUE)) {
						return T;
					}
					if (pcase_var2.eql($UNKNOWN)) {
						all_clauses_so_far_falseP = NIL;
					}
					cdolist_list_var = cdolist_list_var.rest();
					dnf = cdolist_list_var.first();
				}
				if (NIL != all_clauses_so_far_falseP) {
					return NIL;
				}
			} finally {
				pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
			}
		}
		final SubLObject v_properties = list($MAX_TIME, THREE_INTEGER, $MAX_TRANSFORMATION_DEPTH, backchains, $kw429$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL, $MAX_NUMBER, ONE_INTEGER);
		return cyc_kernel.closed_query_success_result_p(pph_query(sentence, mt, v_properties));
	}

	public static SubLObject pph_ask_boolean(final SubLObject sentence, SubLObject mt, SubLObject backchains) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (backchains == UNPROVIDED) {
			backchains = ZERO_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_ask_boolean_internal(sentence, mt, backchains);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_ASK_BOOLEAN, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_ASK_BOOLEAN, THREE_INTEGER, $int$1000, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_ASK_BOOLEAN, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, backchains);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (sentence.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && backchains.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_ask_boolean_internal(sentence, mt, backchains)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, backchains));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_ask_bindings_internal(final SubLObject sentence, final SubLObject mt, SubLObject backchain, SubLObject number) {
		if (backchain == UNPROVIDED) {
			backchain = NIL;
		}
		if (number == UNPROVIDED) {
			number = NIL;
		}
		final SubLObject v_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, UNPROVIDED, UNPROVIDED);
		return pph_query(sentence, mt, v_properties);
	}

	public static SubLObject pph_ask_bindings(final SubLObject sentence, final SubLObject mt, SubLObject backchain, SubLObject number) {
		if (backchain == UNPROVIDED) {
			backchain = NIL;
		}
		if (number == UNPROVIDED) {
			number = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_ask_bindings_internal(sentence, mt, backchain, number);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_ASK_BINDINGS, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_ASK_BINDINGS, FOUR_INTEGER, $int$24, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_ASK_BINDINGS, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_4(sentence, mt, backchain, number);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (sentence.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (backchain.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (((NIL != cached_args) && (NIL == cached_args.rest())) && number.equal(cached_args.first())) {
								return memoization_state.caching_results(results2);
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_ask_bindings_internal(sentence, mt, backchain, number)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, backchain, number));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_ask_template(final SubLObject template, final SubLObject sentence, final SubLObject mt, SubLObject backchain, SubLObject number) {
		if (backchain == UNPROVIDED) {
			backchain = NIL;
		}
		if (number == UNPROVIDED) {
			number = NIL;
		}
		final SubLObject other_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchain, number, UNPROVIDED, UNPROVIDED);
		return pph_ask_template_new(template, sentence, mt, other_properties);
	}

	public static SubLObject pph_ask_template_new_internal(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject other_properties) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (other_properties == UNPROVIDED) {
			other_properties = NIL;
		}
		final SubLObject v_properties = putf(copy_list(other_properties), $RETURN, list($TEMPLATE, template));
		return pph_query(sentence, mt, v_properties);
	}

	public static SubLObject pph_ask_template_new(final SubLObject template, final SubLObject sentence, SubLObject mt, SubLObject other_properties) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (other_properties == UNPROVIDED) {
			other_properties = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_ask_template_new_internal(template, sentence, mt, other_properties);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_ASK_TEMPLATE_NEW, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_ASK_TEMPLATE_NEW, FOUR_INTEGER, $int$100, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_ASK_TEMPLATE_NEW, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_4(template, sentence, mt, other_properties);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (template.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (sentence.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (mt.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (((NIL != cached_args) && (NIL == cached_args.rest())) && other_properties.equal(cached_args.first())) {
								return memoization_state.caching_results(results2);
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_ask_template_new_internal(template, sentence, mt, other_properties)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, sentence, mt, other_properties));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_type_level_violations(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject violations = set.new_set(symbol_function(EQUAL), UNPROVIDED);
		if ((NIL != pph_vars.$pph_show_type_level_violationsP$.getDynamicValue(thread)) && (NIL != el_formula_p(cycl))) {
			SubLObject argnum = ZERO_INTEGER;
			SubLObject cdolist_list_var;
			final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl, $IGNORE);
			SubLObject arg = NIL;
			arg = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				argnum = add(argnum, ONE_INTEGER);
				if ((NIL != pph_collectionP(arg)) && (NIL != pph_formula_arg_individualP(cycl, argnum))) {
					if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
						format_nil.force_format(T, $str435$Recording__S_as_a_type_level_viol, arg, argnum, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					}
					set.set_add(list(argnum), violations);
				}
				final SubLObject set_var = pph_type_level_violations(arg);
				final SubLObject set_contents_var = set.do_set_internal(set_var);
				SubLObject basis_object;
				SubLObject state;
				SubLObject subviolation;
				for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
					subviolation = set_contents.do_set_contents_next(basis_object, state);
					if (NIL != set_contents.do_set_contents_element_validP(state, subviolation)) {
						set.set_add(cons(argnum, subviolation), violations);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				arg = cdolist_list_var.first();
			}
		}
		return violations;
	}

	public static SubLObject pph_formula_arg_individualP(final SubLObject formula, final SubLObject argnum) {
		if (NIL == el_formula_p(formula)) {
			return NIL;
		}
		if (NIL != pph_methods_formulas.pph_reln_type_level_in_argP(cycl_utilities.formula_arg0(formula), argnum, UNPROVIDED)) {
			return NIL;
		}
		if (NIL != formula_pattern_match.formula_matches_pattern(formula, $list436)) {
			return makeBoolean((argnum.eql(ONE_INTEGER) && (NIL != indexed_term_p(cycl_utilities.formula_arg2(formula, UNPROVIDED)))) && (NIL != pph_genlP(cycl_utilities.formula_arg2(formula, UNPROVIDED), $$Individual, UNPROVIDED)));
		}
		final SubLObject replacement_var = $sym438$__TERM;
		final SubLObject subbed_formula = replace_formula_arg(argnum, replacement_var, formula);
		final SubLObject constraint_cols = pph_variable_handling.pph_variable_isa_constraints(replacement_var, subbed_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return subl_promotions.memberP($$Individual, constraint_cols, $sym439$PPH_SPEC_, UNPROVIDED);
	}

	public static SubLObject pph_phrase_type_level_violation_p(final SubLObject phrase) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean((NIL != set.set_p(pph_vars.$pph_type_level_violations$.getDynamicValue(thread))) && (NIL != set.set_memberP(pph_phrase.pph_phrase_arg_position_from_map(phrase), pph_vars.$pph_type_level_violations$.getDynamicValue(thread))));
	}

	public static SubLObject pph_phrase_maybe_mark_type_level_violation(final SubLObject phrase) {
		if ((NIL != pph_phrase_type_level_violation_p(phrase)) && (NIL == pph_phrase.pph_quoted_paraphrase_phrase_p(phrase))) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str440$Paraphrasing__S_as_a_type_level_v, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != pph_nameable_collectionP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) {
				pph_phrase.pph_phrase_set_agr_pred(phrase, $$nameString, UNPROVIDED);
			} else {
				pph_phrase.quote_pph_phrase(phrase);
			}
		}
		return phrase;
	}

	public static SubLObject pph_optimize_formula_variable_names(final SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject minimize_change_from_formula) {
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (minimize_change_from_formula == UNPROVIDED) {
			minimize_change_from_formula = NIL;
		}
		return pph_noptimize_formula_variable_names(copy_expression(formula), language_mt, domain_mt, minimize_change_from_formula);
	}

	public static SubLObject pph_noptimize_formula_variable_names(SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject minimize_change_from_formula) {
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (minimize_change_from_formula == UNPROVIDED) {
			minimize_change_from_formula = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
		final SubLObject var_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$95 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$96 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$97 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$98 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$99 = $pph_optimized_vars$.currentBinding(thread);
									try {
										$pph_optimized_vars$.bind(pph_optimized_names_for_variables(formula, language_mt, domain_mt, minimize_change_from_formula), thread);
										if (NIL != list_utilities.tree_find_if(symbol_function(STRINGP), $pph_optimized_vars$.getDynamicValue(thread), UNPROVIDED)) {
											SubLObject cdolist_list_var = $pph_optimized_vars$.getDynamicValue(thread);
											SubLObject cons = NIL;
											cons = cdolist_list_var.first();
											while (NIL != cdolist_list_var) {
												SubLObject current;
												final SubLObject datum = current = cons;
												SubLObject var = NIL;
												SubLObject new_name = NIL;
												destructuring_bind_must_consp(current, datum, $list444);
												var = current.first();
												current = new_name = current.rest();
												if (NIL != new_name) {
													formula = pph_optimize_var_from_string(new_name, var, formula, var_map);
												}
												cdolist_list_var = cdolist_list_var.rest();
												cons = cdolist_list_var.first();
											}
										}
									} finally {
										$pph_optimized_vars$.rebind(_prev_bind_0_$99, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$100 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$98, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$97, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$96, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$101 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$95, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return values(formula, dictionary_utilities.dictionary_to_alist(var_map));
	}

	public static SubLObject pph_optimized_names_for_variables(final SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject minimize_change_from_formula) {
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (minimize_change_from_formula == UNPROVIDED) {
			minimize_change_from_formula = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLTrampolineFile.enforceType(formula, EL_FORMULA_P);
		SubLTrampolineFile.enforceType(language_mt, $sym446$HLMT_);
		SubLTrampolineFile.enforceType(domain_mt, $sym446$HLMT_);
		if (NIL != minimize_change_from_formula) {
			SubLTrampolineFile.enforceType(minimize_change_from_formula, EL_FORMULA_P);
		}
		assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
		final SubLObject vars_to_optimize = pph_vars_to_optimize(formula, domain_mt, minimize_change_from_formula);
		SubLObject optimized_vars = Mapping.mapcar(LIST, vars_to_optimize);
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$102 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$103 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$104 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$105 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									SubLObject cdolist_list_var = vars_to_optimize;
									SubLObject var = NIL;
									var = cdolist_list_var.first();
									while (NIL != cdolist_list_var) {
										final SubLObject _prev_bind_0_$106 = pph_vars.$paraphrase_mode$.currentBinding(thread);
										try {
											pph_vars.$paraphrase_mode$.bind($TEXT, thread);
											final SubLObject new_name = pph_optimize_formula_variable_name(var, formula, language_mt, domain_mt, UNPROVIDED);
											optimized_vars = list_utilities.alist_enter(optimized_vars, var, new_name, UNPROVIDED);
										} finally {
											pph_vars.$paraphrase_mode$.rebind(_prev_bind_0_$106, thread);
										}
										cdolist_list_var = cdolist_list_var.rest();
										var = cdolist_list_var.first();
									}
								} finally {
									final SubLObject _prev_bind_0_$107 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$105, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$104, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$103, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$108 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$102, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return optimized_vars;
	}

	public static SubLObject pph_vars_to_optimize(final SubLObject formula, SubLObject domain_mt, SubLObject minimize_change_from_formula) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (minimize_change_from_formula == UNPROVIDED) {
			minimize_change_from_formula = NIL;
		}
		if (NIL == minimize_change_from_formula) {
			return nreverse(cycl_utilities.expression_gather(formula, $sym297$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		}
		SubLObject vars_to_optimize = NIL;
		SubLObject cdolist_list_var = cycl_utilities.expression_gather(formula, $sym297$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject var = NIL;
		var = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL == cycl_utilities.expression_find(var, minimize_change_from_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
				vars_to_optimize = cons(var, vars_to_optimize);
			} else {
				final SubLObject prior_var_isa_constraints = at_var_types.formula_variable_isa_constraints(var, minimize_change_from_formula, domain_mt, UNPROVIDED);
				final SubLObject current_var_isa_constraints = at_var_types.formula_variable_isa_constraints(var, formula, domain_mt, UNPROVIDED);
				final SubLObject prior_var_genls_constraints = at_var_types.formula_variable_genl_constraints(var, minimize_change_from_formula, domain_mt, UNPROVIDED);
				final SubLObject current_var_genls_constraints = at_var_types.formula_variable_genl_constraints(var, formula, domain_mt, UNPROVIDED);
				final SubLObject clean_prior_var_isa_constraints = set_difference(prior_var_isa_constraints, current_var_isa_constraints, UNPROVIDED, UNPROVIDED);
				final SubLObject clean_current_var_isa_constraints = set_difference(current_var_isa_constraints, prior_var_isa_constraints, UNPROVIDED, UNPROVIDED);
				final SubLObject clean_prior_var_genls_constraints = set_difference(prior_var_genls_constraints, current_var_genls_constraints, UNPROVIDED, UNPROVIDED);
				final SubLObject clean_current_var_genls_constraints = set_difference(current_var_genls_constraints, prior_var_genls_constraints, UNPROVIDED, UNPROVIDED);
				if (NIL != genls.any_genl_anyP(clean_prior_var_isa_constraints, clean_current_var_isa_constraints, domain_mt, UNPROVIDED)) {
					vars_to_optimize = cons(var, vars_to_optimize);
				} else if (NIL != genls.any_genl_anyP(clean_prior_var_genls_constraints, clean_current_var_genls_constraints, domain_mt, UNPROVIDED)) {
					vars_to_optimize = cons(var, vars_to_optimize);
				}

			}
			cdolist_list_var = cdolist_list_var.rest();
			var = cdolist_list_var.first();
		}
		return vars_to_optimize;
	}

	public static SubLObject pph_optimize_formula_variable_name(final SubLObject var, final SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject use_var_typing_clauses_directlyP) {
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (use_var_typing_clauses_directlyP == UNPROVIDED) {
			use_var_typing_clauses_directlyP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != cycl_variables.el_varP(var) : "cycl_variables.el_varP(var) " + "CommonSymbols.NIL != cycl_variables.el_varP(var) " + var;
		assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
		final SubLObject formula_copy = copy_formula(formula);
		SubLObject optimized_var_name = NIL;
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$109 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$110 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$111 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$112 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									thread.resetMultipleValues();
									final SubLObject arg_in_reln_string = pph_optimize_formula_variable_name_via_arg_in_reln(var, formula_copy, language_mt);
									final SubLObject reln_used = thread.secondMultipleValue();
									thread.resetMultipleValues();
									thread.resetMultipleValues();
									final SubLObject arg_type_string = pph_optimize_formula_variable_name_via_arg_types(var, formula_copy, language_mt, domain_mt, use_var_typing_clauses_directlyP);
									final SubLObject coll_used = thread.secondMultipleValue();
									thread.resetMultipleValues();
									if (!arg_in_reln_string.isString()) {
										optimized_var_name = arg_type_string;
									} else if (!arg_type_string.isString()) {
										optimized_var_name = arg_in_reln_string;
									} else if (NIL != pph_generality_estimateL(reln_used, coll_used)) {
										optimized_var_name = arg_in_reln_string;
									} else {
										optimized_var_name = arg_type_string;
									}

								} finally {
									final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$112, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$111, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$110, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$114 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$109, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return optimized_var_name.isString() ? optimized_var_name : NIL;
	}

	public static SubLObject pph_optimize_formula_variable_name_via_arg_in_reln(final SubLObject var, final SubLObject formula, final SubLObject language_mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject optimized_var_name = NIL;
		SubLObject reln_used = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
		try {
			pph_vars.$pph_language_mt$.bind(language_mt, thread);
			if (NIL == optimized_var_name) {
				SubLObject csome_list_var = pph_var_reln_arg_position_pairs(var, formula);
				SubLObject pair = NIL;
				pair = csome_list_var.first();
				while ((NIL == optimized_var_name) && (NIL != csome_list_var)) {
					if (NIL == other_optimized_var_has_same_arg_in_relnP(var, pair, formula)) {
						SubLObject current;
						final SubLObject datum = current = pair;
						SubLObject reln = NIL;
						SubLObject arg_num = NIL;
						destructuring_bind_must_consp(current, datum, $list453);
						reln = current.first();
						current = arg_num = current.rest();
						if ((((NIL != forts.fort_p(reln)) && (NIL != fort_types_interface.predicateP(reln))) && (NIL != pph_methods_formulas.pph_argnum_and_pred_ok_for_relational_nounP(arg_num, reln))) && (NIL == optimized_var_name)) {
							SubLObject csome_list_var_$115 = list_utilities.alist_lookup(pph_methods_formulas.relational_noun_args_for_pred(reln, UNPROVIDED), arg_num, UNPROVIDED, UNPROVIDED);
							SubLObject data = NIL;
							data = csome_list_var_$115.first();
							while ((NIL == optimized_var_name) && (NIL != csome_list_var_$115)) {
								SubLObject current_$117;
								final SubLObject datum_$116 = current_$117 = data;
								SubLObject leading_strings = NIL;
								SubLObject wu = NIL;
								SubLObject following_strings = NIL;
								SubLObject pos = NIL;
								destructuring_bind_must_consp(current_$117, datum_$116, $list454);
								leading_strings = current_$117.first();
								current_$117 = current_$117.rest();
								destructuring_bind_must_consp(current_$117, datum_$116, $list454);
								wu = current_$117.first();
								current_$117 = current_$117.rest();
								destructuring_bind_must_consp(current_$117, datum_$116, $list454);
								following_strings = current_$117.first();
								current_$117 = current_$117.rest();
								destructuring_bind_must_consp(current_$117, datum_$116, $list454);
								pos = current_$117.first();
								current_$117 = current_$117.rest();
								if (NIL == current_$117) {
									SubLObject paraphrase = pph_methods_lexicon.pph_first_string_of_wordXspeech_part(wu, pos, $list455, language_mt);
									if (paraphrase.isString() && (NIL != list_utilities.lengthLE(paraphrase, $pph_optimized_var_name_max_length$.getGlobalValue(), UNPROVIDED))) {
										if (NIL != list_utilities.non_empty_list_p(leading_strings)) {
											final SubLObject expanded_length = add(length(paraphrase), apply(symbol_function($sym456$_), Mapping.mapcar(symbol_function(LENGTH), leading_strings)), length(leading_strings));
											if (expanded_length.numLE($pph_optimized_var_name_max_length$.getGlobalValue())) {
												paraphrase = cconcatenate(string_utilities.bunge(leading_strings, UNPROVIDED), new SubLObject[] { $$$_, paraphrase });
											}
										}
										optimized_var_name = paraphrase;
										reln_used = reln;
									}
								} else {
									cdestructuring_bind_error(datum_$116, $list454);
								}
								csome_list_var_$115 = csome_list_var_$115.rest();
								data = csome_list_var_$115.first();
							}
						}
					}
					csome_list_var = csome_list_var.rest();
					pair = csome_list_var.first();
				}
			}
		} finally {
			pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
		}
		return values(optimized_var_name, reln_used);
	}

	public static SubLObject other_optimized_var_has_same_arg_in_relnP(final SubLObject var, final SubLObject pair, final SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject duplicateP;
		SubLObject rest;
		SubLObject cons;
		SubLObject current;
		SubLObject datum;
		SubLObject other_var;
		SubLObject value;
		for (duplicateP = NIL, rest = NIL, rest = $pph_optimized_vars$.getDynamicValue(thread); (NIL == duplicateP) && (NIL != rest); duplicateP = makeBoolean((!var.eql(other_var)) && (NIL != member(pair, pph_var_reln_arg_position_pairs(other_var, formula), symbol_function(EQUAL), UNPROVIDED))), rest = rest.rest()) {
			cons = rest.first();
			datum = current = cons;
			other_var = NIL;
			value = NIL;
			destructuring_bind_must_consp(current, datum, $list458);
			other_var = current.first();
			current = value = current.rest();
		}
		return duplicateP;
	}

	public static SubLObject pph_var_reln_arg_position_pairs_internal(final SubLObject var, final SubLObject formula) {
		SubLObject ans = NIL;
		SubLObject cdolist_list_var = cycl_utilities.arg_positions_bfs(var, formula, UNPROVIDED);
		SubLObject var_position = NIL;
		var_position = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject arg_num = list_utilities.last_one(var_position);
			final SubLObject reln_position = list_utilities.replace_last(var_position, ZERO_INTEGER);
			final SubLObject reln = cycl_utilities.formula_arg_position(formula, reln_position, UNPROVIDED);
			final SubLObject item_var = cons(reln, arg_num);
			if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
				ans = cons(item_var, ans);
			}
			cdolist_list_var = cdolist_list_var.rest();
			var_position = cdolist_list_var.first();
		}
		return ans;
	}

	public static SubLObject pph_var_reln_arg_position_pairs(final SubLObject var, final SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_var_reln_arg_position_pairs_internal(var, formula);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_VAR_RELN_ARG_POSITION_PAIRS, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_VAR_RELN_ARG_POSITION_PAIRS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_VAR_RELN_ARG_POSITION_PAIRS, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(var, formula);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (var.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && formula.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_var_reln_arg_position_pairs_internal(var, formula)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, formula));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_optimize_formula_variable_name_via_arg_types(final SubLObject var, final SubLObject formula, final SubLObject language_mt, final SubLObject domain_mt, SubLObject use_var_typing_clauses_directlyP) {
		if (use_var_typing_clauses_directlyP == UNPROVIDED) {
			use_var_typing_clauses_directlyP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject isa_constraints = resolve_disjoint_isa_constraints(pph_variable_handling.pph_variable_isa_constraints(var, formula, domain_mt, T, use_var_typing_clauses_directlyP, $sym460$PPH_OPTIMIZE_FORMULA_VALID_VAR_TYPE_), domain_mt);
		SubLObject optimized_var_name = NIL;
		SubLObject coll_used = NIL;
		SubLObject duplicate_types = NIL;
		SubLObject non_duplicate_types = NIL;
		if (NIL == optimized_var_name) {
			SubLObject csome_list_var = isa_constraints;
			SubLObject isa_constraint = NIL;
			isa_constraint = csome_list_var.first();
			while ((NIL == optimized_var_name) && (NIL != csome_list_var)) {
				SubLObject duplicateP;
				SubLObject rest;
				SubLObject cons;
				SubLObject current;
				SubLObject datum;
				SubLObject other_var;
				SubLObject var_name;
				for (duplicateP = NIL, rest = NIL, rest = $pph_optimized_vars$.getDynamicValue(thread); (NIL == duplicateP) && (NIL != rest); duplicateP = makeBoolean((!var.eql(other_var)) && (NIL != member(isa_constraint, pph_variable_handling.pph_variable_isa_constraints(other_var, formula, domain_mt, T, T, $sym460$PPH_OPTIMIZE_FORMULA_VALID_VAR_TYPE_), UNPROVIDED, UNPROVIDED))), rest = rest.rest()) {
					cons = rest.first();
					datum = current = cons;
					other_var = NIL;
					var_name = NIL;
					destructuring_bind_must_consp(current, datum, $list461);
					other_var = current.first();
					current = var_name = current.rest();
				}
				if (NIL != duplicateP) {
					duplicate_types = cons(isa_constraint, duplicate_types);
				} else {
					non_duplicate_types = cons(isa_constraint, non_duplicate_types);
				}
				csome_list_var = csome_list_var.rest();
				isa_constraint = csome_list_var.first();
			}
		}
		final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
		try {
			pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
			final SubLObject all_genls = Mapping.mapcan(PPH_SALIENT_GENERALIZATIONS_FOR_VARIABLE_OPTIMIZATION, non_duplicate_types, EMPTY_SUBL_OBJECT_ARRAY);
			final SubLObject sorted = pph_sort_collections_by_generality(all_genls);
			if (NIL == optimized_var_name) {
				SubLObject csome_list_var2;
				SubLObject type;
				for (csome_list_var2 = sorted, type = NIL, type = csome_list_var2.first(); (NIL == optimized_var_name) && (NIL != csome_list_var2); optimized_var_name = pph_optimized_var_name_from_type(type, language_mt), coll_used = type, csome_list_var2 = csome_list_var2.rest(), type = csome_list_var2.first()) {
				}
			}
		} finally {
			pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
		}
		if (NIL == optimized_var_name) {
			SubLObject csome_list_var;
			SubLObject isa_constraint;
			for (csome_list_var = nreverse(duplicate_types), isa_constraint = NIL, isa_constraint = csome_list_var.first(); (NIL == optimized_var_name) && (NIL != csome_list_var); optimized_var_name = pph_optimized_var_name_from_type(isa_constraint, language_mt), coll_used = isa_constraint, csome_list_var = csome_list_var.rest(), isa_constraint = csome_list_var.first()) {
			}
		}
		return values(optimized_var_name, coll_used);
	}

	public static SubLObject pph_salient_generalizations_for_variable_optimization(final SubLObject v_term, SubLObject number, SubLObject mt) {
		if (number == UNPROVIDED) {
			number = TEN_INTEGER;
		}
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		return pph_salient_generalizations(v_term, number, mt, NIL, NIL);
	}

	public static SubLObject pph_sort_collections_by_generality(final SubLObject cols) {
		return Sort.sort(cols, $sym463$PPH_LESS_GENERAL_COLLECTION_, UNPROVIDED);
	}

	public static SubLObject pph_less_general_collectionP(final SubLObject col1, final SubLObject col2) {
		if (col1.equal(col2)) {
			return NIL;
		}
		if ((NIL != pph_genlP(col1, col2, UNPROVIDED)) && (NIL == pph_genlP(col2, col1, UNPROVIDED))) {
			return T;
		}
		if ((NIL != pph_genlP(col2, col1, UNPROVIDED)) && (NIL == pph_genlP(col1, col2, UNPROVIDED))) {
			return NIL;
		}
		if (NIL != cardinality_estimates.generality_estimateL(col1, col2)) {
			return T;
		}
		if (NIL != cardinality_estimates.generality_estimateL(col2, col1)) {
			return NIL;
		}
		return Strings.stringL(kb_utilities.hl_external_id_string(col1), kb_utilities.hl_external_id_string(col2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject resolve_disjoint_isa_constraints(SubLObject isa_constraints, final SubLObject domain_mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		for (SubLObject disjoint_pair = disjoint_with.any_disjoint_collection_pair(isa_constraints, domain_mt); NIL != disjoint_pair; disjoint_pair = disjoint_with.any_disjoint_collection_pair(isa_constraints, domain_mt)) {
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				final SubLObject min_ceilings = genls.min_ceiling_cols(disjoint_pair, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				isa_constraints = union(min_ceilings, list_utilities.fast_set_difference(isa_constraints, disjoint_pair, symbol_function(EQUAL)), symbol_function(EQUAL), UNPROVIDED);
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		}
		return Sort.sort(isa_constraints, $sym464$PPH_GENERALITY_ESTIMATE_, UNPROVIDED);
	}

	public static SubLObject pph_optimized_var_name_from_type(final SubLObject isa_constraint, final SubLObject language_mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
		try {
			pph_vars.$pph_language_mt$.bind(language_mt, thread);
			final SubLObject phrase_naut = list(pph_functions.terseparaphrasefn(), list(pph_functions.termparaphrasefn_constrained(), $$nonPlural_Generic, isa_constraint));
			final SubLObject paraphrase = pph_main.generate_phrase_no_checks(phrase_naut, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL != list_utilities.lengthLE(paraphrase, $pph_optimized_var_name_max_length$.getGlobalValue(), UNPROVIDED)) {
				ans = paraphrase;
			}
		} finally {
			pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject pph_optimize_var_from_string(final SubLObject paraphrase, final SubLObject var, SubLObject formula, final SubLObject var_map) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject name = pph_paraphrase_to_var_name(paraphrase);
		final SubLObject original_name = cycl_variables.el_var_name_without_prefix(var);
		SubLObject new_var = var;
		if (name.isString()) {
			if (!original_name.equal(name)) {
				thread.resetMultipleValues();
				final SubLObject formula_$118 = pph_optimize_var_using_name(var, formula, name, var_map);
				final SubLObject new_var_$119 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				formula = formula_$118;
				new_var = new_var_$119;
			}
		}
		return values(formula, new_var);
	}

	public static SubLObject pph_optimize_var_using_name(final SubLObject var, SubLObject formula, final SubLObject name, final SubLObject var_map) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject base_var = find(name, cycl_utilities.expression_gather(formula, $sym297$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), EL_VAR_NAME_WITHOUT_PREFIX, UNPROVIDED, UNPROVIDED);
		final SubLObject _prev_bind_0 = $optimize_depth$.currentBinding(thread);
		try {
			$optimize_depth$.bind(number_utilities.f_1X($optimize_depth$.getDynamicValue(thread)), thread);
			final SubLObject require_suffixP = makeBoolean((NIL != base_var) && (!base_var.eql(var)));
			if ($optimize_depth$.getDynamicValue(thread).numG(FIVE_INTEGER)) {
				Errors.sublisp_break($str466$Too_deep_, EMPTY_SUBL_OBJECT_ARRAY);
			}
			SubLObject optimized_var = pph_unique_el_var_wrt_expression(cycl_utilities.formula_subst($DUMMY, var, formula, UNPROVIDED, UNPROVIDED), name, require_suffixP);
			if (NIL == cycl_variables.valid_el_varP(optimized_var)) {
				optimized_var = var;
			}
			if (!var.eql(optimized_var)) {
				if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
					format_nil.force_format(T, $str468$Variable_optimized_____S_____S, var, optimized_var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
				formula = cycl_utilities.expression_nsubst(optimized_var, var, formula, UNPROVIDED, UNPROVIDED);
				update_optimized_var_map(var, optimized_var, var_map);
			}
		} finally {
			$optimize_depth$.rebind(_prev_bind_0, thread);
		}
		return formula;
	}

	public static SubLObject update_optimized_var_map(final SubLObject old_var, final SubLObject new_var, final SubLObject var_map) {
		final SubLObject older_var = dictionary_utilities.dictionary_reverse_lookup(var_map, old_var, NIL);
		if (NIL != older_var) {
			dictionary.dictionary_enter(var_map, older_var, new_var);
		} else {
			dictionary.dictionary_enter(var_map, old_var, new_var);
		}
		return var_map;
	}

	public static SubLObject pph_unique_el_var_wrt_expression(final SubLObject formula, SubLObject default_name, SubLObject require_suffixP) {
		if (default_name == UNPROVIDED) {
			default_name = NIL;
		}
		if (require_suffixP == UNPROVIDED) {
			require_suffixP = NIL;
		}
		if (!default_name.isString()) {
			default_name = $$$X;
		}
		final SubLObject disallowed_names = pph_disallowed_var_names(formula, default_name, require_suffixP);
		final SubLObject new_var_name = czer_utilities.unique_var_name_wrt(default_name, disallowed_names);
		return cycl_variables.make_el_var(new_var_name);
	}

	public static SubLObject pph_disallowed_var_names(final SubLObject formula, final SubLObject default_name, final SubLObject require_suffixP) {
		final SubLObject vars = cycl_utilities.expression_gather(formula, $sym297$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject default_var_name = cycl_variables.el_var_name(cycl_variables.make_el_var(default_name));
		SubLObject disallowed_var_names = Mapping.mapcar(EL_VAR_NAME, vars);
		if (NIL != member(default_var_name, disallowed_var_names, symbol_function(EQUALP), UNPROVIDED)) {
			final SubLObject item_var = czer_utilities.unique_var_name_wrt(default_name, list(default_var_name));
			if (NIL == member(item_var, disallowed_var_names, symbol_function(EQUALP), symbol_function(IDENTITY))) {
				disallowed_var_names = cons(item_var, disallowed_var_names);
			}
		}
		if (NIL != require_suffixP) {
			disallowed_var_names = cons(default_var_name, disallowed_var_names);
		}
		return disallowed_var_names;
	}

	public static SubLObject pph_optimize_formula_valid_var_typeP(final SubLObject type) {
		final SubLObject core_term = pph_core_term(type);
		return makeBoolean((NIL != forts.fort_p(core_term)) && (!core_term.eql($$Thing)));
	}

	public static SubLObject pph_paraphrase_to_var_name(final SubLObject paraphrase) {
		return string_to_el_var_name(paraphrase);
	}

	public static SubLObject pph_javalist_p(final SubLObject v_object) {
		return makeBoolean((v_object.isList() && v_object.first().isString()) && (NIL != list_utilities.list_of_type_p(PPH_JAVALIST_ITEM_P, second(v_object))));
	}

	public static SubLObject new_pph_javalist(final SubLObject string, final SubLObject items) {
		assert NIL != list_utilities.non_dotted_list_p(items) : "list_utilities.non_dotted_list_p(items) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(items) " + items;
		SubLObject cdolist_list_var = items;
		SubLObject elem = NIL;
		elem = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			assert NIL != pph_javalist_item_p(elem) : "pph_utilities.pph_javalist_item_p(elem) " + "CommonSymbols.NIL != pph_utilities.pph_javalist_item_p(elem) " + elem;
			cdolist_list_var = cdolist_list_var.rest();
			elem = cdolist_list_var.first();
		}
		return list(pph_string.pph_string_if_non_null_to_utf8(string), items);
	}

	public static SubLObject pph_javalist_copy(final SubLObject javalist) {
		return new_pph_javalist(string_utilities.copy_string(pph_javalist_string(javalist)), Mapping.mapcar(PPH_JAVALIST_ITEM_COPY, pph_javalist_items(javalist)));
	}

	public static SubLObject pph_javalist_item_copy(final SubLObject item) {
		final SubLObject new_item = make_list(length(item), UNPROVIDED);
		SubLObject list_var = NIL;
		SubLObject old = NIL;
		SubLObject i = NIL;
		list_var = item;
		old = list_var.first();
		for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), old = list_var.first(), i = add(ONE_INTEGER, i)) {
			SubLObject v_new = old;
			if (old.isString()) {
				v_new = string_utilities.copy_string(old);
			} else if (old.isCons()) {
				v_new = copy_tree(old);
			}

			set_nth(i, new_item, v_new);
		}
		return new_item;
	}

	public static SubLObject pph_javalist_string(final SubLObject javalist) {
		assert NIL != pph_javalist_p(javalist) : "pph_utilities.pph_javalist_p(javalist) " + "CommonSymbols.NIL != pph_utilities.pph_javalist_p(javalist) " + javalist;
		return javalist.first();
	}

	public static SubLObject pph_javalist_string_as_utf8(final SubLObject javalist) {
		assert NIL != pph_javalist_p(javalist) : "pph_utilities.pph_javalist_p(javalist) " + "CommonSymbols.NIL != pph_utilities.pph_javalist_p(javalist) " + javalist;
		return pph_string.pph_string_to_utf8(javalist.first());
	}

	public static SubLObject pph_javalist_string_as_cycl(final SubLObject javalist) {
		assert NIL != pph_javalist_p(javalist) : "pph_utilities.pph_javalist_p(javalist) " + "CommonSymbols.NIL != pph_utilities.pph_javalist_p(javalist) " + javalist;
		return pph_string.pph_string_to_cycl(javalist.first());
	}

	public static SubLObject pph_javalist_html_string(SubLObject javalist, SubLObject construct_naut_linksP) {
		if (construct_naut_linksP == UNPROVIDED) {
			construct_naut_linksP = T;
		}
		assert NIL != pph_javalist_p(javalist) : "pph_utilities.pph_javalist_p(javalist) " + "CommonSymbols.NIL != pph_utilities.pph_javalist_p(javalist) " + javalist;
		if (NIL != construct_naut_linksP) {
			javalist = pph_javalist_construct_naut_links(javalist);
		}
		SubLObject ans = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			SubLObject csome_list_var = pph_njavalist_items(javalist);
			SubLObject item = NIL;
			item = csome_list_var.first();
			while (NIL != csome_list_var) {
				princ(pph_javalist_item_html_string(item), stream);
				csome_list_var = csome_list_var.rest();
				item = csome_list_var.first();
			}
			ans = get_output_stream_string(stream);
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
		return ans;
	}

	public static SubLObject pph_javalist_item_html_string(final SubLObject item) {
		assert NIL != pph_javalist_item_p(item) : "pph_utilities.pph_javalist_item_p(item) " + "CommonSymbols.NIL != pph_utilities.pph_javalist_item_p(item) " + item;
		SubLObject ans = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			final SubLObject open_tag = pph_javalist_item_open_tag(item);
			if (NIL != pph_javalist_item_use_tagP(item, open_tag)) {
				princ(open_tag, stream);
			}
			princ(pph_javalist_item_string(item), stream);
			final SubLObject close_tag = pph_javalist_item_close_tag(item);
			if (NIL != pph_javalist_item_use_tagP(item, close_tag)) {
				princ(close_tag, stream);
			}
			ans = get_output_stream_string(stream);
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
		return ans;
	}

	public static SubLObject pph_javalist_item_use_tagP(final SubLObject item, final SubLObject tag) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean(tag.isString() && ((NIL != pph_vars.$pph_link_arg0P$.getDynamicValue(thread)) || (NIL == pph_phrase.pph_arg0_position_p(pph_javalist_item_arg_position(item)))));
	}

	public static SubLObject pph_javalist_construct_naut_links(final SubLObject javalist) {
		SubLObject new_items = NIL;
		SubLObject current_naut_items = NIL;
		SubLObject csome_list_var = pph_njavalist_items(javalist);
		SubLObject old_item = NIL;
		old_item = csome_list_var.first();
		while (NIL != csome_list_var) {
			if (NIL != pph_javalist_item_compatible_with_current_naut_itemsP(old_item, current_naut_items)) {
				current_naut_items = cons(old_item, current_naut_items);
			} else {
				new_items = pph_javalist_update_naut_items(new_items, current_naut_items);
				current_naut_items = list(old_item);
			}
			csome_list_var = csome_list_var.rest();
			old_item = csome_list_var.first();
		}
		if (NIL != current_naut_items) {
			new_items = pph_javalist_update_naut_items(new_items, current_naut_items);
		}
		return list(pph_javalist_string(javalist), nreverse(new_items));
	}

	public static SubLObject pph_javalist_item_compatible_with_current_naut_itemsP(final SubLObject old_item, final SubLObject current_naut_items) {
		final SubLObject old_item_arg_position = pph_javalist_item_arg_position(old_item);
		SubLObject badP = NIL;
		if ((NIL != pph_known_arg_position_p(old_item_arg_position)) && (NIL == badP)) {
			SubLObject csome_list_var = current_naut_items;
			SubLObject current_naut_item = NIL;
			current_naut_item = csome_list_var.first();
			while ((NIL == badP) && (NIL != csome_list_var)) {
				final SubLObject current_item_arg_position = pph_javalist_item_arg_position(current_naut_item);
				badP = makeBoolean((NIL != pph_known_arg_position_p(current_item_arg_position)) && (!butlast(old_item_arg_position, UNPROVIDED).equal(butlast(current_item_arg_position, UNPROVIDED))));
				csome_list_var = csome_list_var.rest();
				current_naut_item = csome_list_var.first();
			}
		}
		return makeBoolean(NIL == badP);
	}

	public static SubLObject pph_javalist_nat_functor_item_p(final SubLObject javalist_item) {
		return makeBoolean((NIL != pph_phrase.pph_arg0_position_p(pph_javalist_item_arg_position(javalist_item))) && (NIL != fort_types_interface.functor_p(pph_javalist_item_cycl(javalist_item))));
	}

	public static SubLObject pph_javalist_update_naut_items(final SubLObject new_items, final SubLObject current_naut_items) {
		if (NIL == find_if(PPH_JAVALIST_NAT_FUNCTOR_ITEM_P, current_naut_items, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			return append(current_naut_items, new_items);
		}
		SubLObject pre_naut_items = NIL;
		SubLObject naut_items = NIL;
		SubLObject post_naut_items = NIL;
		SubLObject found_naut_itemP = NIL;
		SubLObject naut_and_pre_naut_items = NIL;
		SubLObject cdolist_list_var = current_naut_items;
		SubLObject current_naut_item = NIL;
		current_naut_item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ((NIL == found_naut_itemP) && (NIL == pph_phrase.pph_known_cycl_p(pph_javalist_item_cycl(current_naut_item)))) {
				post_naut_items = cons(current_naut_item, post_naut_items);
			} else {
				found_naut_itemP = T;
				naut_and_pre_naut_items = cons(current_naut_item, naut_and_pre_naut_items);
			}
			cdolist_list_var = cdolist_list_var.rest();
			current_naut_item = cdolist_list_var.first();
		}
		post_naut_items = nreverse(post_naut_items);
		found_naut_itemP = NIL;
		cdolist_list_var = naut_and_pre_naut_items;
		SubLObject naut_or_pre_naut_item = NIL;
		naut_or_pre_naut_item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ((NIL == found_naut_itemP) && (NIL == pph_phrase.pph_known_cycl_p(pph_javalist_item_cycl(naut_or_pre_naut_item)))) {
				pre_naut_items = cons(naut_or_pre_naut_item, pre_naut_items);
			} else {
				found_naut_itemP = T;
				naut_items = cons(naut_or_pre_naut_item, naut_items);
			}
			cdolist_list_var = cdolist_list_var.rest();
			naut_or_pre_naut_item = cdolist_list_var.first();
		}
		final SubLObject naut_item = pph_javalist_construct_naut_item(naut_items);
		return append(post_naut_items, list(naut_item), pre_naut_items, new_items);
	}

	public static SubLObject pph_javalist_construct_naut_item(SubLObject naut_items) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject items_with_arg_positions = remove(pph_unknown_arg_position(), naut_items, symbol_function(EQL), symbol_function(PPH_JAVALIST_ITEM_ARG_POSITION), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject sorted_naut_term_items = Sort.sort(copy_list(items_with_arg_positions), $sym477$PPH_ARG_POSITION_PRECEDES_, symbol_function(PPH_JAVALIST_ITEM_ARG_POSITION));
		final SubLObject naut = list_to_elf(Mapping.mapcar(symbol_function(PPH_JAVALIST_ITEM_CYCL), sorted_naut_term_items));
		final SubLObject naut_arg_position = butlast(pph_javalist_item_arg_position(sorted_naut_term_items.first()), UNPROVIDED);
		SubLObject naut_string = NIL;
		naut_items = nreverse(naut_items);
		naut_string = apply(symbol_function(CCONCATENATE), Mapping.mapcar(symbol_function(PPH_JAVALIST_ITEM_STRING), naut_items));
		final SubLObject naut_start_char = pph_javalist_item_start_char(naut_items.first());
		SubLObject naut_item = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
		final SubLObject _prev_bind_3 = pph_vars.$html_generation_term_id_function$.currentBinding(thread);
		try {
			pph_vars.$constant_link_function$.bind(CB_NAUT_FRAME, thread);
			pph_vars.$html_generation_target$.bind(pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
			pph_vars.$html_generation_term_id_function$.bind(PPH_NAUT_ID_FN, thread);
			thread.resetMultipleValues();
			final SubLObject open_tag = pph_html.pph_anchor_tags_for_term(naut);
			final SubLObject close_tag = thread.secondMultipleValue();
			thread.resetMultipleValues();
			naut_item = new_pph_javalist_item(naut_string, naut, naut_arg_position, open_tag, close_tag, naut_start_char);
		} finally {
			pph_vars.$html_generation_term_id_function$.rebind(_prev_bind_3, thread);
			pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
			pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
		}
		return naut_item;
	}

	public static SubLObject pph_javalist_set_string(final SubLObject javalist, final SubLObject string) {
		return rplaca(javalist, string);
	}

	public static SubLObject pph_javalist_items(final SubLObject javalist) {
		assert NIL != pph_javalist_p(javalist) : "pph_utilities.pph_javalist_p(javalist) " + "CommonSymbols.NIL != pph_utilities.pph_javalist_p(javalist) " + javalist;
		return copy_list(pph_njavalist_items(javalist));
	}

	public static SubLObject pph_njavalist_items(final SubLObject javalist) {
		return second(javalist);
	}

	public static SubLObject pph_javalist_singleton_p(final SubLObject javalist) {
		return list_utilities.singletonP(pph_njavalist_items(javalist));
	}

	public static SubLObject pph_javalist_sole_item(final SubLObject javalist) {
		assert NIL != pph_javalist_singleton_p(javalist) : "pph_utilities.pph_javalist_singleton_p(javalist) " + "CommonSymbols.NIL != pph_utilities.pph_javalist_singleton_p(javalist) " + javalist;
		return pph_njavalist_items(javalist).first();
	}

	public static SubLObject pph_javalist_last_item(final SubLObject javalist) {
		return list_utilities.last_one(pph_njavalist_items(javalist));
	}

	public static SubLObject pph_javalist_item_p(final SubLObject v_object) {
		return makeBoolean((v_object.isList() && (NIL != list_utilities.lengthE(v_object, SIX_INTEGER, UNPROVIDED))) && v_object.first().isString());
	}

	public static SubLObject new_pph_javalist_item(final SubLObject string, final SubLObject cycl, final SubLObject arg_position, final SubLObject open_tag, final SubLObject close_tag, final SubLObject start_char) {
		return list(pph_string.pph_string_if_non_null_to_utf8(string), cycl, arg_position, open_tag, close_tag, start_char);
	}

	public static SubLObject pph_javalist_item_string(final SubLObject item) {
		return item.first();
	}

	public static SubLObject pph_javalist_item_set_string(final SubLObject item, final SubLObject string) {
		return rplaca(item, string);
	}

	public static SubLObject pph_javalist_item_cycl(final SubLObject item) {
		return second(item);
	}

	public static SubLObject pph_javalist_item_set_cycl(final SubLObject item, final SubLObject arg_position) {
		return set_nth(ONE_INTEGER, item, arg_position);
	}

	public static SubLObject pph_javalist_item_arg_position(final SubLObject item) {
		return third(item);
	}

	public static SubLObject pph_javalist_item_set_arg_position(final SubLObject item, final SubLObject arg_position) {
		return set_nth(TWO_INTEGER, item, arg_position);
	}

	public static SubLObject pph_javalist_item_open_tag(final SubLObject item) {
		return fourth(item);
	}

	public static SubLObject pph_javalist_item_set_open_tag(final SubLObject item, final SubLObject open_tag) {
		return set_nth(THREE_INTEGER, item, open_tag);
	}

	public static SubLObject pph_javalist_item_close_tag(final SubLObject item) {
		return fifth(item);
	}

	public static SubLObject pph_javalist_item_set_close_tag(final SubLObject item, final SubLObject close_tag) {
		return set_nth(FOUR_INTEGER, item, close_tag);
	}

	public static SubLObject pph_javalist_item_start_char(final SubLObject item) {
		return sixth(item);
	}

	public static SubLObject pph_javalist_item_set_start_char(final SubLObject item, final SubLObject start_char) {
		return set_nth(FIVE_INTEGER, item, start_char);
	}

	public static SubLObject pph_item_from_javalist(final SubLObject javalist) {
		final SubLObject string = pph_javalist_string(javalist);
		final SubLObject v_term = pph_javalist_cycl(javalist);
		final SubLObject arg_position = (NIL != v_term) ? pph_javalist_arg_position(javalist) : NIL;
		final SubLObject open_tag = (NIL != pph_arg_position_p(arg_position)) ? pph_javalist_open_tag(javalist) : NIL;
		final SubLObject close_tag = ((NIL == open_tag) || open_tag.isString()) ? pph_javalist_close_tag(javalist) : NIL;
		final SubLObject pph_item = ((NIL == close_tag) || close_tag.isString()) ? pph_data_structures.new_pph_phrase_output_item(string, arg_position, v_term, open_tag, close_tag, UNPROVIDED) : NIL;
		return pph_item;
	}

	public static SubLObject pph_javalist_cycl(final SubLObject javalist) {
		SubLObject cycl = $ERROR;
		SubLObject found_mismatchP = NIL;
		if (NIL == found_mismatchP) {
			SubLObject csome_list_var = pph_njavalist_items(javalist);
			SubLObject item = NIL;
			item = csome_list_var.first();
			while ((NIL == found_mismatchP) && (NIL != csome_list_var)) {
				if (cycl.eql($ERROR)) {
					cycl = pph_javalist_item_cycl(item);
				} else if (!cycl.equal(pph_javalist_item_cycl(item))) {
					found_mismatchP = T;
				}

				csome_list_var = csome_list_var.rest();
				item = csome_list_var.first();
			}
		}
		return NIL != found_mismatchP ? $ERROR : cycl;
	}

	public static SubLObject pph_javalist_arg_position(final SubLObject javalist) {
		SubLObject arg_position = $ERROR;
		SubLObject found_mismatchP = NIL;
		if (NIL == found_mismatchP) {
			SubLObject csome_list_var = pph_njavalist_items(javalist);
			SubLObject item = NIL;
			item = csome_list_var.first();
			while ((NIL == found_mismatchP) && (NIL != csome_list_var)) {
				if (arg_position.eql($ERROR)) {
					arg_position = pph_javalist_item_arg_position(item);
				} else if (!arg_position.equal(pph_javalist_item_arg_position(item))) {
					found_mismatchP = T;
				}

				csome_list_var = csome_list_var.rest();
				item = csome_list_var.first();
			}
		}
		return NIL != found_mismatchP ? $ERROR : arg_position;
	}

	public static SubLObject pph_javalist_open_tag(final SubLObject javalist) {
		SubLObject open_tag = $ERROR;
		SubLObject found_mismatchP = NIL;
		if (NIL == found_mismatchP) {
			SubLObject csome_list_var = pph_njavalist_items(javalist);
			SubLObject item = NIL;
			item = csome_list_var.first();
			while ((NIL == found_mismatchP) && (NIL != csome_list_var)) {
				if (open_tag.eql($ERROR)) {
					open_tag = pph_javalist_item_open_tag(item);
				} else if (NIL != pph_javalist_item_open_tag(item)) {
					if (!open_tag.equal(pph_javalist_item_open_tag(item))) {
						found_mismatchP = T;
					}
				}

				csome_list_var = csome_list_var.rest();
				item = csome_list_var.first();
			}
		}
		return NIL != found_mismatchP ? $ERROR : open_tag;
	}

	public static SubLObject pph_javalist_close_tag(final SubLObject javalist) {
		final SubLObject last_item = pph_javalist_last_item(javalist);
		final SubLObject close_tag = pph_javalist_item_close_tag(last_item);
		SubLObject found_mismatchP = NIL;
		if (NIL == found_mismatchP) {
			SubLObject csome_list_var = pph_njavalist_items(javalist);
			SubLObject item = NIL;
			item = csome_list_var.first();
			while ((NIL == found_mismatchP) && (NIL != csome_list_var)) {
				if (NIL != pph_javalist_item_close_tag(item)) {
					if (!item.eql(last_item)) {
						if (!close_tag.equal(pph_javalist_item_close_tag(item))) {
							found_mismatchP = T;
						}
					}
				}
				csome_list_var = csome_list_var.rest();
				item = csome_list_var.first();
			}
		}
		return NIL != found_mismatchP ? $ERROR : close_tag;
	}

	public static SubLObject nconcatenate_pph_javalists(final SubLObject javalists, SubLObject preserve_argpositions_for_lists) {
		if (preserve_argpositions_for_lists == UNPROVIDED) {
			preserve_argpositions_for_lists = NIL;
		}
		SubLObject current_offset = ZERO_INTEGER;
		SubLObject combined_string = $str82$;
		SubLObject combined_javalist_items = NIL;
		SubLObject list_var = NIL;
		SubLObject javalist = NIL;
		SubLObject n = NIL;
		list_var = javalists;
		javalist = list_var.first();
		for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), javalist = list_var.first(), n = add(ONE_INTEGER, n)) {
			combined_string = cconcatenate(combined_string, pph_javalist_string(javalist));
			SubLObject cdolist_list_var = pph_javalist_items(javalist);
			SubLObject item = NIL;
			item = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				pph_javalist_item_set_start_char(item, add(pph_javalist_item_start_char(item), current_offset));
				if ((preserve_argpositions_for_lists != $ALL) && (NIL == member(n, preserve_argpositions_for_lists, UNPROVIDED, UNPROVIDED))) {
					pph_javalist_item_set_arg_position(item, $PPH_UNKNOWN_ARG_POSITION);
				}
				combined_javalist_items = cons(item, combined_javalist_items);
				cdolist_list_var = cdolist_list_var.rest();
				item = cdolist_list_var.first();
			}
			current_offset = add(current_offset, length(pph_javalist_string(javalist)));
		}
		return new_pph_javalist(combined_string, nreverse(combined_javalist_items));
	}

	public static SubLObject pph_javalist_to_cycl_structured_paraphrase(final SubLObject javalist) {
		return make_binary_formula(pph_functions.structuredparaphrasefn(), pph_javalist_string(javalist), make_el_list(pph_javalist_structured_subparaphrases(javalist), UNPROVIDED));
	}

	public static SubLObject pph_javalist_structured_subparaphrases(final SubLObject javalist) {
		SubLObject subparaphrases = NIL;
		SubLObject cdolist_list_var = pph_javalist_items(javalist);
		SubLObject item = NIL;
		item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			subparaphrases = cons(pph_javalist_item_to_structured_subparaphrase(item), subparaphrases);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return nreverse(subparaphrases);
	}

	public static SubLObject pph_javalist_item_to_structured_subparaphrase(final SubLObject item) {
		if ((NIL != pph_phrase.pph_known_cycl_p(pph_javalist_item_cycl(item))) && (NIL != pph_known_arg_position_p(pph_javalist_item_arg_position(item)))) {
			return make_el_formula(pph_functions.subparaphrasefn(), list(pph_javalist_item_string(item), make_unary_formula($$Quote, pph_javalist_item_cycl(item)), make_el_formula($$FormulaArgPositionFn, pph_javalist_item_arg_position(item), UNPROVIDED), empty_string_if_nil(pph_javalist_item_open_tag(item)), empty_string_if_nil(pph_javalist_item_close_tag(item)), pph_javalist_item_start_char(item)), UNPROVIDED);
		}
		if ((NIL == pph_javalist_item_open_tag(item)) && (NIL == pph_javalist_item_close_tag(item))) {
			return make_binary_formula(pph_functions.unlinkedsubparaphrasefn(), pph_javalist_item_string(item), pph_javalist_item_start_char(item));
		}
		return make_el_formula(pph_functions.unlinkedsubparaphrasewithhtmlfn(), list(pph_javalist_item_string(item), pph_javalist_item_start_char(item), empty_string_if_nil(pph_javalist_item_open_tag(item)), empty_string_if_nil(pph_javalist_item_close_tag(item))), UNPROVIDED);
	}

	public static SubLObject empty_string_if_nil(final SubLObject obj) {
		return NIL == obj ? string_utilities.$empty_string$.getGlobalValue() : obj;
	}

	public static SubLObject cycl_structured_paraphrase_to_pph_javalist(final SubLObject structured_paraphrase) {
		SubLObject current;
		final SubLObject datum = current = cycl_utilities.nat_args(structured_paraphrase, UNPROVIDED);
		SubLObject string = NIL;
		SubLObject subparaphrases = NIL;
		destructuring_bind_must_consp(current, datum, $list486);
		string = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list486);
		subparaphrases = current.first();
		current = current.rest();
		if (NIL == current) {
			SubLObject items = NIL;
			SubLObject cdolist_list_var = el_list_items(subparaphrases);
			SubLObject subparaphrase = NIL;
			subparaphrase = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				items = cons(structured_subparaphrase_to_pph_javalist_item(subparaphrase), items);
				cdolist_list_var = cdolist_list_var.rest();
				subparaphrase = cdolist_list_var.first();
			}
			return new_pph_javalist(string, nreverse(items));
		}
		cdestructuring_bind_error(datum, $list486);
		return NIL;
	}

	public static SubLObject structured_subparaphrase_to_pph_javalist_item(final SubLObject subparaphrase) {
		final SubLObject fn = cycl_utilities.nat_functor(subparaphrase);
		if (NIL != kb_utilities.kbeq(fn, pph_functions.subparaphrasefn())) {
			SubLObject current;
			final SubLObject datum = current = cycl_utilities.nat_args(subparaphrase, UNPROVIDED);
			SubLObject string = NIL;
			SubLObject quoted_cycl = NIL;
			SubLObject el_arg_position = NIL;
			SubLObject open_tag = NIL;
			SubLObject close_tag = NIL;
			SubLObject offset = NIL;
			destructuring_bind_must_consp(current, datum, $list487);
			string = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list487);
			quoted_cycl = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list487);
			el_arg_position = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list487);
			open_tag = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list487);
			close_tag = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list487);
			offset = current.first();
			current = current.rest();
			if (NIL == current) {
				return new_pph_javalist_item(string, cycl_utilities.nat_arg1(quoted_cycl, UNPROVIDED), cycl_utilities.nat_args(el_arg_position, UNPROVIDED), open_tag, close_tag, offset);
			}
			cdestructuring_bind_error(datum, $list487);
		} else if (NIL != kb_utilities.kbeq(fn, pph_functions.unlinkedsubparaphrasewithhtmlfn())) {
			SubLObject current;
			final SubLObject datum = current = cycl_utilities.nat_args(subparaphrase, UNPROVIDED);
			SubLObject string = NIL;
			SubLObject open_tag2 = NIL;
			SubLObject close_tag2 = NIL;
			SubLObject offset2 = NIL;
			destructuring_bind_must_consp(current, datum, $list488);
			string = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list488);
			open_tag2 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list488);
			close_tag2 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list488);
			offset2 = current.first();
			current = current.rest();
			if (NIL == current) {
				return new_pph_javalist_item(string, pph_phrase.pph_empty_cycl(), pph_unknown_arg_position(), open_tag2, close_tag2, offset2);
			}
			cdestructuring_bind_error(datum, $list488);
		} else if (NIL != kb_utilities.kbeq(fn, pph_functions.unlinkedsubparaphrasefn())) {
			SubLObject current;
			final SubLObject datum = current = cycl_utilities.nat_args(subparaphrase, UNPROVIDED);
			SubLObject string = NIL;
			SubLObject offset3 = NIL;
			destructuring_bind_must_consp(current, datum, $list489);
			string = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list489);
			offset3 = current.first();
			current = current.rest();
			if (NIL == current) {
				return new_pph_javalist_item(string, pph_phrase.pph_empty_cycl(), pph_unknown_arg_position(), NIL, NIL, offset3);
			}
			cdestructuring_bind_error(datum, $list489);
		} else {
			Errors.error($str490$Can_t_interpret__S, subparaphrase);
		}

		return NIL;
	}

	public static SubLObject pph_output_list_to_javalist(final SubLObject olist) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) && (NIL != pph_vars.$pph_replace_bulleted_list_tagsP$.getDynamicValue(thread))) {
			pph_output_list_replace_bulleted_list_tags(olist);
		}
		SubLObject cdolist_list_var = olist;
		SubLObject item = NIL;
		item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			pph_data_structures.pph_phrase_output_item_set_agr_pred(item, NIL);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		SubLObject items = NIL;
		SubLObject current_item = NIL;
		SubLObject ans_whole_string = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
		try {
			pph_vars.$paraphrase_mode$.bind($TEXT, thread);
			assert NIL != pph_phrase.pph_phrase_output_list_p(olist) : "pph_phrase.pph_phrase_output_list_p(olist) " + "CommonSymbols.NIL != pph_phrase.pph_phrase_output_list_p(olist) " + olist;
			SubLObject start_char = ZERO_INTEGER;
			SubLObject end_char_index = ZERO_INTEGER;
			final SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string(olist, T);
			final SubLObject whole_string = pph_remove_html_tags(whole_html_string, NIL);
			final SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator(olist);
			while (NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p(iterator)) {
				final SubLObject item2 = pph_data_structures.pph_phrase_output_list_iterator_next(iterator);
				final SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string(item2, NIL);
				start_char = pph_macros.pph_output_list_find_start_char(raw_item_string, whole_string, end_char_index);
				if (start_char.numG(end_char_index)) {
					final SubLObject in_string = pph_macros.pph_make_space_string(start_char, end_char_index);
					final SubLObject arg_position = pph_unknown_arg_position();
					final SubLObject open_tag = NIL;
					final SubLObject close_tag = NIL;
					final SubLObject cycl = pph_phrase.pph_empty_cycl();
					final SubLObject output_item = pph_question.new_pph_phrase_filler_item(in_string);
					SubLObject start_char_$120 = end_char_index;
					assert NIL != pph_string.pph_string_p(whole_string) : "pph_string.pph_string_p(whole_string) " + "CommonSymbols.NIL != pph_string.pph_string_p(whole_string) " + whole_string;
					assert NIL != pph_string.pph_string_p(in_string) : "pph_string.pph_string_p(in_string) " + "CommonSymbols.NIL != pph_string.pph_string_p(in_string) " + in_string;
					ans_whole_string = whole_string;
					final SubLObject strings = ((NIL != pph_vars.$pph_consolidate_javalistsP$.getDynamicValue(thread)) || (!in_string.isString())) ? list(in_string) : string_utilities.string_tokenize(in_string, string_utilities.whitespace_chars(), NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					final SubLObject string_count = length(strings);
					SubLObject list_var = NIL;
					SubLObject string = NIL;
					SubLObject i = NIL;
					list_var = strings;
					string = list_var.first();
					for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), string = list_var.first(), i = add(ONE_INTEGER, i)) {
						final SubLObject first_stringP = eql(i, ZERO_INTEGER);
						final SubLObject last_stringP = eql(i, number_utilities.f_1_(string_count));
						if ((((NIL == string_utilities.empty_stringP(string)) || cycl.equal(string_utilities.$empty_string$.getGlobalValue())) || ((NIL != first_stringP) && (NIL != string_utilities.non_empty_stringP(open_tag)))) || ((NIL != last_stringP) && (NIL != string_utilities.non_empty_stringP(close_tag)))) {
							pph_start_char_sanity_check(whole_string, start_char_$120, string);
							final SubLObject my_open_tag = (NIL != first_stringP) ? open_tag : NIL;
							final SubLObject my_close_tag = (NIL != last_stringP) ? close_tag : NIL;
							final SubLObject new_item = new_pph_javalist_item(string, cycl, arg_position, my_open_tag, my_close_tag, start_char_$120);
							if (NIL == current_item) {
								current_item = new_item;
							} else {
								items = cons(current_item, items);
								current_item = new_item;
							}
							start_char_$120 = add(start_char_$120, length(string));
						}
					}
				}
				end_char_index = pph_macros.pph_update_end_char_index(start_char, raw_item_string);
				final SubLObject in_string = pph_phrase.pph_phrase_output_item_get_string(item2, NIL);
				final SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item2);
				final SubLObject open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item2);
				final SubLObject close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item2);
				final SubLObject cycl = pph_data_structures.pph_phrase_output_item_cycl(item2);
				final SubLObject output_item = item2;
				assert NIL != pph_string.pph_string_p(whole_string) : "pph_string.pph_string_p(whole_string) " + "CommonSymbols.NIL != pph_string.pph_string_p(whole_string) " + whole_string;
				assert NIL != pph_string.pph_string_p(in_string) : "pph_string.pph_string_p(in_string) " + "CommonSymbols.NIL != pph_string.pph_string_p(in_string) " + in_string;
				ans_whole_string = whole_string;
				final SubLObject strings2 = ((NIL != pph_vars.$pph_consolidate_javalistsP$.getDynamicValue(thread)) || (!in_string.isString())) ? list(in_string) : string_utilities.string_tokenize(in_string, string_utilities.whitespace_chars(), NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				final SubLObject string_count2 = length(strings2);
				SubLObject list_var2 = NIL;
				SubLObject string2 = NIL;
				SubLObject j = NIL;
				list_var2 = strings2;
				string2 = list_var2.first();
				for (j = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest(), string2 = list_var2.first(), j = add(ONE_INTEGER, j)) {
					final SubLObject first_stringP2 = eql(j, ZERO_INTEGER);
					final SubLObject last_stringP2 = eql(j, number_utilities.f_1_(string_count2));
					if ((((NIL == string_utilities.empty_stringP(string2)) || cycl.equal(string_utilities.$empty_string$.getGlobalValue())) || ((NIL != first_stringP2) && (NIL != string_utilities.non_empty_stringP(open_tag)))) || ((NIL != last_stringP2) && (NIL != string_utilities.non_empty_stringP(close_tag)))) {
						pph_start_char_sanity_check(whole_string, start_char, string2);
						final SubLObject my_open_tag2 = (NIL != first_stringP2) ? open_tag : NIL;
						final SubLObject my_close_tag2 = (NIL != last_stringP2) ? close_tag : NIL;
						final SubLObject new_item2 = new_pph_javalist_item(string2, cycl, arg_position, my_open_tag2, my_close_tag2, start_char);
						if (NIL == current_item) {
							current_item = new_item2;
						} else {
							items = cons(current_item, items);
							current_item = new_item2;
						}
						start_char = add(start_char, length(string2));
					}
				}
			}
		} finally {
			pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
		}
		if (NIL != current_item) {
			items = cons(current_item, items);
		}
		return new_pph_javalist(ans_whole_string, nreverse(items));
	}

	public static SubLObject pph_start_char_sanity_check(final SubLObject whole_string, final SubLObject start_char, final SubLObject this_string) {
		final SubLObject saneP = makeBoolean((NIL != string_utilities.empty_string_p(this_string)) || ((NIL != list_utilities.lengthG(whole_string, start_char, UNPROVIDED)) && pph_string.pph_string_char(this_string, ZERO_INTEGER).eql(pph_string.pph_string_char(whole_string, start_char))));
		if (NIL == saneP) {
			final SubLObject new_format_string = cconcatenate($str143$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy(ONE_INTEGER), $str144$__, format_nil.format_nil_a_no_copy($str493$__START_CHAR__S_is_off_for__S___i) });
			pph_error.pph_handle_error(new_format_string, list(start_char, this_string, whole_string));
		}
		return saneP;
	}

	public static SubLObject possibly_optimize_pph_annotated_javalists_for_alphabetization(final SubLObject annotated_javalists) {
		return Mapping.mapcar(POSSIBLY_OPTIMIZE_PPH_ANNOTATED_JAVALIST_FOR_ALPHABETIZATION, annotated_javalists);
	}

	public static SubLObject possibly_optimize_pph_annotated_javalist_for_alphabetization(final SubLObject annotated_javalist) {
		SubLObject plain_javalist = NIL;
		SubLObject v_object = NIL;
		destructuring_bind_must_consp(annotated_javalist, annotated_javalist, $list495);
		plain_javalist = annotated_javalist.first();
		final SubLObject current = v_object = annotated_javalist.rest();
		final SubLObject optimized = possibly_optimize_pph_javalist_for_alphabetization(plain_javalist);
		return annotate_pph_javalist(optimized, v_object);
	}

	public static SubLObject possibly_optimize_pph_javalist_for_alphabetization(final SubLObject javalist) {
		if ((NIL != pph_javalist_singleton_p(javalist)) && (NIL != string_utilities.starts_with_by_test(pph_javalist_string(javalist), $$$the_, symbol_function(EQUALP)))) {
			final SubLObject old_string = pph_javalist_string(javalist);
			final SubLObject new_string = cconcatenate(string_utilities.substring(old_string, FOUR_INTEGER, UNPROVIDED), $str497$__the);
			final SubLObject copy = copy_list(javalist);
			pph_javalist_item_set_string(pph_javalist_sole_item(copy), new_string);
			pph_javalist_set_string(copy, new_string);
			return copy;
		}
		return javalist;
	}

	public static SubLObject pph_output_list_replace_bulleted_list_tags(final SubLObject olist) {
		SubLObject current_depth = ZERO_INTEGER;
		SubLObject list_types = NIL;
		SubLObject cdolist_list_var = olist;
		SubLObject item = NIL;
		item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != pph_bulleted_list_start_itemP(item)) {
				current_depth = add(current_depth, ONE_INTEGER);
				list_types = cons(pph_phrase_output_item_replace_start_item(item), list_types);
			} else if (NIL != pph_bulleted_list_item_start_itemP(item)) {
				final SubLObject item_number = NIL;
				pph_phrase_output_item_replace_list_item_start_item(item, current_depth, list_types.first(), item_number);
			} else if (NIL != pph_bulleted_list_item_end_itemP(item)) {
				pph_phrase_output_item_replace_list_item_end_item(item);
			} else if (NIL != pph_bulleted_list_end_itemP(item)) {
				current_depth = subtract(current_depth, ONE_INTEGER);
				list_types = list_types.rest();
				pph_phrase_output_item_replace_end_item(item);
			}

			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return olist;
	}

	public static SubLObject pph_bulleted_list_start_itemP(final SubLObject item) {
		final SubLObject open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
		SubLObject ans = NIL;
		ans = makeBoolean(open_tag.isString() && ((NIL != search(html_macros.$html_unordered_list_head$.getGlobalValue(), open_tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != search(html_macros.$html_ordered_list_head$.getGlobalValue(), open_tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
		return ans;
	}

	public static SubLObject pph_bulleted_list_end_itemP(final SubLObject item) {
		final SubLObject close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
		SubLObject ans = NIL;
		ans = makeBoolean(close_tag.isString() && ((NIL != search(html_macros.$html_unordered_list_tail$.getGlobalValue(), close_tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != search(html_macros.$html_ordered_list_tail$.getGlobalValue(), close_tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
		return ans;
	}

	public static SubLObject pph_bulleted_list_item_end_itemP(final SubLObject item) {
		final SubLObject close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag(item);
		SubLObject ans = NIL;
		ans = makeBoolean(close_tag.isString() && (NIL != search(html_macros.$html_list_item_tail$.getGlobalValue(), close_tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
		return ans;
	}

	public static SubLObject pph_bulleted_list_item_start_itemP(final SubLObject item) {
		final SubLObject open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
		SubLObject ans = NIL;
		ans = makeBoolean(open_tag.isString() && (NIL != search(html_macros.$html_list_item_head$.getGlobalValue(), open_tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
		return ans;
	}

	public static SubLObject pph_phrase_output_item_replace_start_item(final SubLObject item) {
		final SubLObject open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag(item);
		final SubLObject list_type = (NIL != search(html_macros.$html_unordered_list_head$.getGlobalValue(), open_tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? $UNORDERED : html_list_type_from_open_tag(open_tag);
		pph_data_structures.pph_phrase_output_item_set_html_tags(item, string_utilities.$empty_string$.getGlobalValue(), string_utilities.$empty_string$.getGlobalValue());
		return list_type;
	}

	public static SubLObject html_list_type_from_open_tag(final SubLObject open_tag) {
		SubLObject list_type = NIL;
		if (NIL == list_type) {
			SubLObject csome_list_var = html_macros.$html_valid_list_types$.getGlobalValue();
			SubLObject this_type = NIL;
			this_type = csome_list_var.first();
			while ((NIL == list_type) && (NIL != csome_list_var)) {
				if (NIL != search(string_utilities.str(this_type), open_tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
					list_type = this_type;
				}
				csome_list_var = csome_list_var.rest();
				this_type = csome_list_var.first();
			}
		}
		return list_type;
	}

	public static SubLObject pph_phrase_output_item_replace_end_item(final SubLObject item) {
		final SubLObject item_string = pph_data_structures.pph_phrase_output_item_string(item);
		final SubLObject newline_string = Strings.make_string(ONE_INTEGER, CHAR_newline);
		pph_data_structures.pph_phrase_output_item_set_string(item, cconcatenate(newline_string, item_string));
		pph_data_structures.pph_phrase_output_item_set_html_tags(item, string_utilities.$empty_string$.getGlobalValue(), string_utilities.$empty_string$.getGlobalValue());
		return item;
	}

	public static SubLObject pph_phrase_output_item_replace_list_item_start_item(final SubLObject item, final SubLObject current_depth, final SubLObject list_type, final SubLObject item_number) {
		final SubLObject tab_count = number_utilities.f_1X(current_depth);
		final SubLObject tab_string = Strings.make_string(tab_count, CHAR_tab);
		final SubLObject bullet_string = pph_bullet_string(list_type, current_depth, item_number);
		string_utilities.set_nth_char(ZERO_INTEGER, tab_string, CHAR_newline, UNPROVIDED);
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
			format_nil.force_format(T, $str499$Adding__S_tabs_to_bulleted_list_i, current_depth, item, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		pph_data_structures.pph_phrase_output_item_set_html_tags(item, string_utilities.remove_substring(pph_data_structures.pph_phrase_output_item_html_open_tag(item), $str500$_li_), pph_data_structures.pph_phrase_output_item_html_close_tag(item));
		pph_data_structures.pph_phrase_output_item_set_string(item, cconcatenate(tab_string, bullet_string));
		return item;
	}

	public static SubLObject pph_phrase_output_item_replace_list_item_end_item(final SubLObject item) {
		pph_data_structures.pph_phrase_output_item_set_html_tags(item, pph_data_structures.pph_phrase_output_item_html_open_tag(item), string_utilities.remove_substring(pph_data_structures.pph_phrase_output_item_html_close_tag(item), $str501$__li_));
		return item;
	}

	public static SubLObject pph_bullet_string(final SubLObject list_type, final SubLObject current_depth, final SubLObject item_number) {
		if (list_type != $UNORDERED) {
			Errors.warn($str503$Don_t_know_how_to_make_ordered_li);
		}
		final SubLObject bullet_char = Strings.sublisp_char($pph_bullet_chars$.getGlobalValue(), mod(number_utilities.f_1_(current_depth), length($pph_bullet_chars$.getGlobalValue())));
		return Strings.make_string(ONE_INTEGER, bullet_char);
	}

	public static SubLObject pph_annotate_javalists(final SubLObject javalists, final SubLObject objects) {
		SubLObject annotated = NIL;
		SubLObject javalist = NIL;
		SubLObject javalist_$121 = NIL;
		SubLObject v_object = NIL;
		SubLObject v_object_$122 = NIL;
		javalist = javalists;
		javalist_$121 = javalist.first();
		v_object = objects;
		v_object_$122 = v_object.first();
		while ((NIL != v_object) || (NIL != javalist)) {
			annotated = cons(annotate_pph_javalist(javalist_$121, v_object_$122), annotated);
			javalist = javalist.rest();
			javalist_$121 = javalist.first();
			v_object = v_object.rest();
			v_object_$122 = v_object.first();
		}
		return nreverse(annotated);
	}

	public static SubLObject annotate_pph_javalist(final SubLObject javalist, final SubLObject v_object) {
		return cons(javalist, v_object);
	}

	public static SubLObject pph_annotated_javalist_string(final SubLObject annotated_javalist) {
		final SubLObject plain_javalist = annotated_javalist.first();
		final SubLObject string = plain_javalist.first();
		return string;
	}

	public static SubLObject unannotate_pph_javalists(final SubLObject annotated_javalists) {
		SubLObject plain_javalists = NIL;
		SubLObject objects = NIL;
		SubLObject cdolist_list_var = annotated_javalists;
		SubLObject annotated_javalist = NIL;
		annotated_javalist = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = annotated_javalist;
			SubLObject plain_javalist = NIL;
			SubLObject v_object = NIL;
			destructuring_bind_must_consp(current, datum, $list495);
			plain_javalist = current.first();
			current = v_object = current.rest();
			plain_javalists = cons(plain_javalist, plain_javalists);
			objects = cons(v_object, objects);
			cdolist_list_var = cdolist_list_var.rest();
			annotated_javalist = cdolist_list_var.first();
		}
		return values(nreverse(plain_javalists), nreverse(objects));
	}

	public static SubLObject sort_pph_annotated_javalists(final SubLObject annotated_javalists, final SubLObject case_sensitiveP) {
		final SubLObject test = (NIL != case_sensitiveP) ? symbol_function($sym316$STRING_) : symbol_function(STRING_LESSP);
		return Sort.sort(annotated_javalists, test, symbol_function(PPH_ANNOTATED_JAVALIST_STRING));
	}

	public static SubLObject pph_javalist_to_output_map(final SubLObject javalist, final SubLObject cycl) {
		return list(cycl, javalist);
	}

	public static SubLObject pph_javalist_items_to_output_maps(final SubLObject javalist_items) {
		return javalist_items;
	}

	public static SubLObject pph_output_map_javalist(final SubLObject map) {
		return second(map);
	}

	public static SubLObject with_generate_phrase_for_java_parameters(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list506);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject property_list = NIL;
		SubLObject default_property_list = NIL;
		destructuring_bind_must_consp(current, datum, $list506);
		property_list = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list506);
		default_property_list = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(CLET, new SubLObject[] { list(list(NL_PREDS, list(GET_PROPERTY_WITH_DEFAULTS, $NL_PREDS, property_list, default_property_list)), list(FORCE, list(GET_PROPERTY_WITH_DEFAULTS, $FORCE, property_list, default_property_list)), list(LANGUAGE_MT, list(GET_PROPERTY_WITH_DEFAULTS, $LANGUAGE_MT, property_list, default_property_list)),
					list(DOMAIN_MT, list(GET_PROPERTY_WITH_DEFAULTS, $DOMAIN_MT, property_list, default_property_list)), list(MODE, list(GET_PROPERTY_WITH_DEFAULTS, $MODE, property_list, default_property_list))), $list518, $list519, $list520, $list521, append(body, NIL) });
		}
		cdestructuring_bind_error(datum, $list506);
		return NIL;
	}

	public static SubLObject generate_phrase_for_java_no_checks_with_property_list(final SubLObject v_object, final SubLObject property_list, SubLObject default_property_list) {
		if (default_property_list == UNPROVIDED) {
			default_property_list = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != list_utilities.property_list_p(property_list) : "list_utilities.property_list_p(property_list) " + "CommonSymbols.NIL != list_utilities.property_list_p(property_list) " + property_list;
		final SubLObject nl_preds = list_utilities.get_property_with_defaults($NL_PREDS, property_list, default_property_list, UNPROVIDED);
		SubLObject force = list_utilities.get_property_with_defaults($FORCE, property_list, default_property_list, UNPROVIDED);
		SubLObject language_mt = list_utilities.get_property_with_defaults($LANGUAGE_MT, property_list, default_property_list, UNPROVIDED);
		SubLObject domain_mt = list_utilities.get_property_with_defaults($DOMAIN_MT, property_list, default_property_list, UNPROVIDED);
		SubLObject mode = list_utilities.get_property_with_defaults($MODE, property_list, default_property_list, UNPROVIDED);
		if (NIL == force) {
			force = $NONE;
		}
		if (NIL == language_mt) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue(thread);
		}
		if (NIL == domain_mt) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
		}
		if (NIL == mode) {
			mode = $HTML;
		}
		return pph_main.generate_phrase_for_java_no_checks(v_object, nl_preds, force, language_mt, domain_mt, mode);
	}

	public static SubLObject generate_phrase_for_java_property_list_p(final SubLObject property_list) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject nl_preds = list_utilities.get_property_with_defaults($NL_PREDS, property_list, NIL, UNPROVIDED);
		SubLObject force = list_utilities.get_property_with_defaults($FORCE, property_list, NIL, UNPROVIDED);
		SubLObject language_mt = list_utilities.get_property_with_defaults($LANGUAGE_MT, property_list, NIL, UNPROVIDED);
		SubLObject domain_mt = list_utilities.get_property_with_defaults($DOMAIN_MT, property_list, NIL, UNPROVIDED);
		SubLObject mode = list_utilities.get_property_with_defaults($MODE, property_list, NIL, UNPROVIDED);
		if (NIL == force) {
			force = $NONE;
		}
		if (NIL == language_mt) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue(thread);
		}
		if (NIL == domain_mt) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
		}
		if (NIL == mode) {
			mode = $HTML;
		}
		return makeBoolean((((((NIL == nl_preds) || (NIL != valid_external_pph_nl_predsP(nl_preds))) && ((NIL == force) || (NIL != pph_speech_act.pph_force_p(force)))) && ((NIL == language_mt) || (NIL != hlmt.possibly_mt_p(language_mt)))) && ((NIL == domain_mt) || (NIL != hlmt.possibly_mt_p(domain_mt)))) && ((NIL == mode) || mode.isKeyword()));
	}

	public static SubLObject nadjust_javalist_wrt_map(final SubLObject javalist, final SubLObject arg_position_map) {
		SubLObject cdolist_list_var = pph_javalist_items(javalist);
		SubLObject item = NIL;
		item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject local_arg_position = pph_javalist_item_arg_position(item);
			if (NIL != pph_known_arg_position_p(local_arg_position)) {
				pph_javalist_item_set_arg_position(item, pph_arg_position_lookup(local_arg_position, arg_position_map));
			}
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return javalist;
	}

	public static SubLObject nadjust_javalist_wrt_var_map(final SubLObject javalist, final SubLObject var_map) {
		SubLObject cdolist_list_var = pph_javalist_items(javalist);
		SubLObject item = NIL;
		item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject cycl = pph_javalist_item_cycl(item);
			if (NIL != cycl_variables.el_varP(cycl)) {
				pph_javalist_item_set_cycl(item, list_utilities.alist_lookup_without_values(var_map, cycl, symbol_function(EQL), cycl));
			}
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return javalist;
	}

	public static SubLObject clear_pph_javalist_sort_xyz_paraphrases() {
		final SubLObject cs = $pph_javalist_sort_xyz_paraphrases_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_javalist_sort_xyz_paraphrases(final SubLObject javalist) {
		return memoization_state.caching_state_remove_function_results_with_args($pph_javalist_sort_xyz_paraphrases_caching_state$.getGlobalValue(), list(javalist), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_javalist_sort_xyz_paraphrases_internal(final SubLObject javalist) {
		return pph_javalist_nsort_xyz_paraphrases(pph_javalist_copy(javalist));
	}

	public static SubLObject pph_javalist_sort_xyz_paraphrases(final SubLObject javalist) {
		SubLObject caching_state = $pph_javalist_sort_xyz_paraphrases_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(PPH_JAVALIST_SORT_XYZ_PARAPHRASES, $pph_javalist_sort_xyz_paraphrases_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, javalist, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(pph_javalist_sort_xyz_paraphrases_internal(javalist)));
			memoization_state.caching_state_put(caching_state, javalist, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_javalist_nsort_xyz_paraphrases(final SubLObject javalist) {
		final SubLObject whole_string = pph_javalist_string(javalist);
		SubLObject used_vars = NIL;
		SubLObject cdolist_list_var = pph_javalist_items(javalist);
		SubLObject item = NIL;
		item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject cycl = pph_javalist_item_cycl(item);
			if ((NIL != cycl_variables.el_varP(cycl)) && (NIL != list_utilities.lengthE(cycl_variables.el_var_name_without_prefix(cycl), ONE_INTEGER, UNPROVIDED))) {
				final SubLObject var_char = string_utilities.first_char(cycl_variables.el_var_name_without_prefix(cycl));
				if (NIL != find(var_char, pph_javalist_item_string(item), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
					final SubLObject used_var = list_utilities.alist_lookup_without_values(used_vars, cycl, UNPROVIDED, UNPROVIDED);
					final SubLObject var_to_use = (NIL != used_var) ? used_var : next_named_var(list_utilities.alist_values(used_vars), cycl);
					if (!var_to_use.eql(cycl)) {
						final SubLObject var_name = cycl_variables.el_var_name_without_prefix(var_to_use);
						pph_javalist_item_set_string(item, var_name);
						final SubLObject start = pph_javalist_item_start_char(item);
						final SubLObject end = add(pph_javalist_item_start_char(item), length(pph_javalist_item_string(item)));
						nsubstitute(string_utilities.first_char(var_name), var_char, whole_string, symbol_function(EQ), symbol_function(IDENTITY), start, end, UNPROVIDED);
					}
					if (NIL == used_var) {
						used_vars = list_utilities.alist_enter(used_vars, cycl, var_to_use, UNPROVIDED);
					}
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return javalist;
	}

	public static SubLObject test_xyz_sort_strings(final SubLObject javalist) {
		return pph_javalist_string(pph_javalist_sort_xyz_paraphrases(javalist));
	}

	public static SubLObject needs_do_supportP(final SubLObject phrase) {
		final SubLObject head_dtr = pph_sentence.pph_sentence_head_verb(phrase);
		return (NIL != pph_phrase.pph_copula_phraseP(head_dtr)) || (NIL != pph_phrase.pph_aux_verb_phraseP(head_dtr)) ? NIL : T;
	}

	public static SubLObject pph_phrase_add_do_support(final SubLObject phrase) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject head_dtr = pph_sentence.pph_sentence_head_verb(phrase);
		final SubLObject subj_dtr = pph_sentence.pph_sentence_subject(phrase);
		final SubLObject main_clause = pph_sentence.pph_sentence_main_clause(phrase);
		if (NIL == head_dtr) {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str535$Trying_to_add_do_support_but_no_h, phrase);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
			return NIL;
		}
		final SubLObject do_phrase = new_pph_do_phrase_matching_head_verb_and_subject(head_dtr, subj_dtr);
		pph_phrase.pph_phrase_set_agr(head_dtr, pph_data_structures.new_pph_phrase_agr(new_pph_agr_constraint($POS_PRED, $$infinitive), UNPROVIDED), UNPROVIDED);
		pph_phrase.pph_phrase_note_not_done(head_dtr);
		SubLObject insert_loc;
		for (final SubLObject head_dtr_num = insert_loc = pph_phrase.pph_phrase_head_dtr_num(main_clause); (NIL != subl_promotions.positive_integer_p(insert_loc)) && (NIL != pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(pph_phrase.pph_phrase_nth_dtr(main_clause, number_utilities.f_1_(insert_loc))), $$adverbStrings, UNPROVIDED)); insert_loc = subtract(insert_loc, ONE_INTEGER)) {
			final SubLObject adv = pph_phrase.pph_phrase_nth_dtr(main_clause, number_utilities.f_1_(insert_loc));
			final SubLObject adv_string = pph_phrase.pph_phrase_string(adv, UNPROVIDED);
			Errors.warn($str539$Inserting_do_support_before_adver, NIL != adv_string ? adv_string : pph_phrase.pph_phrase_wu(adv, UNPROVIDED));
		}
		pph_phrase.pph_phrase_insert_dtr(main_clause, do_phrase, insert_loc);
		pph_phrase.pph_phrase_set_head_dtr_num(main_clause, insert_loc);
		return phrase;
	}

	public static SubLObject new_pph_do_phrase_matching_head_verb_and_subject(final SubLObject head_dtr, final SubLObject subj_dtr) {
		final SubLObject do_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
		final SubLObject do_agr = new_pph_agr_constraint($SUBJECT_VERB, subj_dtr);
		pph_phrase.pph_phrase_set_agr_constraint(do_phrase, pph_data_structures.pph_phrase_agr_absolute_constraint(pph_phrase.pph_phrase_agr(head_dtr)), UNPROVIDED);
		pph_phrase.pph_phrase_set_agr_constraint(do_phrase, do_agr, UNPROVIDED);
		pph_phrase.pph_phrase_set_category(do_phrase, $$Verb, UNPROVIDED);
		pph_phrase.pph_phrase_set_wu(do_phrase, $$Do_TheWord);
		pph_phrase.pph_phrase_set_cycl(do_phrase, pph_phrase.pph_empty_cycl());
		return do_phrase;
	}

	public static SubLObject pph_fort_paraphrase_cache_lookup(final SubLObject fort, SubLObject nl_preds, SubLObject demerit_cutoff) {
		if (nl_preds == UNPROVIDED) {
			nl_preds = $ANY;
		}
		if (demerit_cutoff == UNPROVIDED) {
			demerit_cutoff = pph_vars.$pph_demerit_cutoff$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject abortP = NIL;
		thread.resetMultipleValues();
		SubLObject string = nl_generation_fort_cache.nl_generation_cache_lookup(fort, UNPROVIDED, UNPROVIDED);
		SubLObject cached_pred = thread.secondMultipleValue();
		final SubLObject demerits = thread.thirdMultipleValue();
		SubLObject justification = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		if (demerits.isNumber() && (NIL != pph_vars.pph_too_many_demerits_p(demerits, demerit_cutoff))) {
			abortP = T;
		} else if (NIL == pph_cached_pred_okP(cached_pred, nl_preds)) {
			abortP = T;
		}

		if (NIL != abortP) {
			string = NIL;
			cached_pred = NIL;
			justification = NIL;
		}
		return values(string, cached_pred, demerits, justification);
	}

	public static SubLObject pph_cached_pred_okP(final SubLObject cached_pred, final SubLObject nl_preds) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean(nl_preds.eql($ANY) || ((NIL != list_utilities.non_empty_list_p(nl_preds)) && (NIL != pph_genl_pos_predP(cached_pred, nl_preds.first(), pph_vars.$pph_language_mt$.getDynamicValue(thread)))));
	}

	public static SubLObject pph_salient_generalization(final SubLObject v_term, SubLObject mt, SubLObject disallow_term_itselfP) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (disallow_term_itselfP == UNPROVIDED) {
			disallow_term_itselfP = T;
		}
		return pph_salient_generalizations(v_term, ONE_INTEGER, mt, disallow_term_itselfP, UNPROVIDED).first();
	}

	public static SubLObject pph_salient_generalizations(final SubLObject v_term, SubLObject number, SubLObject mt, SubLObject disallow_term_itselfP, SubLObject strict_clarification_checkingP) {
		if (number == UNPROVIDED) {
			number = THREE_INTEGER;
		}
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (disallow_term_itselfP == UNPROVIDED) {
			disallow_term_itselfP = T;
		}
		if (strict_clarification_checkingP == UNPROVIDED) {
			strict_clarification_checkingP = T;
		}
		return copy_list(pph_salient_generalizations_int(v_term, number, mt, disallow_term_itselfP, strict_clarification_checkingP));
	}

	public static SubLObject pph_salient_generalizations_int_internal(SubLObject v_term, SubLObject number, SubLObject mt, SubLObject disallow_term_itselfP, SubLObject strict_clarification_checkingP) {
		if (number == UNPROVIDED) {
			number = THREE_INTEGER;
		}
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (disallow_term_itselfP == UNPROVIDED) {
			disallow_term_itselfP = T;
		}
		if (strict_clarification_checkingP == UNPROVIDED) {
			strict_clarification_checkingP = T;
		}
		SubLObject ans = NIL;
		v_term = parsing_utilities.strip_nl_tags(v_term, UNPROVIDED);
		if (NIL != specs_fn_natP(v_term)) {
			return Mapping.mapcar(PPH_MAKE_TYPE_LEVEL, pph_salient_generalizations_int(pph_core_term(v_term), number, mt, disallow_term_itselfP, UNPROVIDED));
		}
		if (v_term.isNumber()) {
			ans = list($$Number_General);
		} else if (v_term.isString()) {
			ans = list($$CharacterString);
		} else if (NIL != pph_genlP(v_term, $$Number_General, UNPROVIDED)) {
			ans = list($$Number_General);
		} else {
			ans = rkf_concept_clarifier.rkf_salient_generalizations(v_term, mt, disallow_term_itselfP, T, number, strict_clarification_checkingP, UNPROVIDED);
		}

		return ans;
	}

	public static SubLObject pph_salient_generalizations_int(final SubLObject v_term, SubLObject number, SubLObject mt, SubLObject disallow_term_itselfP, SubLObject strict_clarification_checkingP) {
		if (number == UNPROVIDED) {
			number = THREE_INTEGER;
		}
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (disallow_term_itselfP == UNPROVIDED) {
			disallow_term_itselfP = T;
		}
		if (strict_clarification_checkingP == UNPROVIDED) {
			strict_clarification_checkingP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_salient_generalizations_int_internal(v_term, number, mt, disallow_term_itselfP, strict_clarification_checkingP);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_SALIENT_GENERALIZATIONS_INT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_SALIENT_GENERALIZATIONS_INT, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_SALIENT_GENERALIZATIONS_INT, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_5(v_term, number, mt, disallow_term_itselfP, strict_clarification_checkingP);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (v_term.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (number.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (mt.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (disallow_term_itselfP.equal(cached_args.first())) {
								cached_args = cached_args.rest();
								if (((NIL != cached_args) && (NIL == cached_args.rest())) && strict_clarification_checkingP.equal(cached_args.first())) {
									return memoization_state.caching_results(results2);
								}
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_salient_generalizations_int_internal(v_term, number, mt, disallow_term_itselfP, strict_clarification_checkingP)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, number, mt, disallow_term_itselfP, strict_clarification_checkingP));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_string_ok_for_termP(final SubLObject string, final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != pph_disambiguation.pph_string_ambiguous_p(string)) {
			if (((NIL != pph_top_level_preciseP()) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str547$_S_does_not_unambiguously_denote_, string, v_term);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
			return NIL;
		}
		if (NIL != pph_vars.pph_forbidden_string_for_termP(v_term, string)) {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str548$_S_is_a_forbidden_paraphrase_for_, string, v_term);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
			return NIL;
		}
		return T;
	}

	public static SubLObject pph_canonicalize_hlmt(final SubLObject v_hlmt) {
		return hlmt_czer.canonicalize_hlmt(v_hlmt);
	}

	public static SubLObject pph_list_ofP(final SubLObject test, final SubLObject v_object) {
		return makeBoolean((v_object.isList() && (NIL == list_utilities.find_if_not(test, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && ((NIL == member(NIL, v_object, UNPROVIDED, UNPROVIDED)) || (NIL != funcall(test, NIL))));
	}

	public static SubLObject pph_hl_to_el(final SubLObject obj) {
		if (NIL != assertion_handles.assertion_p(obj)) {
			return pph_sentence_from_assertion(obj);
		}
		if (NIL != nart_handles.nart_p(obj)) {
			return narts_high.nart_el_formula(obj);
		}
		return obj;
	}

	public static SubLObject pph_sentence_from_assertion_internal(final SubLObject assertion) {
		SubLObject sentence = NIL;
		if (((NIL != assertions_high.gaf_assertionP(assertion)) && (assertions_high.assertion_truth(assertion) == $TRUE)) && (NIL != pph_no_hl_only_termsP(assertion))) {
			sentence = assertions_high.gaf_formula(assertion);
		} else if (((((NIL != assertions_high.rule_assertionP(assertion)) && (NIL != list_utilities.non_empty_list_p(clauses.pos_lits(assertions_high.assertion_cnf(assertion))))) && (NIL != find($$evaluate, clauses.neg_lits(assertions_high.assertion_cnf(assertion)), symbol_function(EQL), symbol_function(ATOMIC_SENTENCE_PREDICATE), UNPROVIDED, UNPROVIDED)))
				&& (NIL == find($$termOfUnit, clauses.neg_lits(assertions_high.assertion_cnf(assertion)), symbol_function(EQL), symbol_function(ATOMIC_SENTENCE_PREDICATE), UNPROVIDED, UNPROVIDED))) && (NIL == list_utilities.tree_find_if(SKOLEM_FUNCTION_P, assertions_high.assertion_cnf(assertion), UNPROVIDED))) {
			sentence = fi.assertion_hl_formula(assertion, T);
		} else {
			final SubLObject sent = sentence = pph_nart_substitute(uncanonicalizer.assertion_el_formula(assertion));
		}

		return sentence;
	}

	public static SubLObject pph_sentence_from_assertion(final SubLObject assertion) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_sentence_from_assertion_internal(assertion);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_SENTENCE_FROM_ASSERTION, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_SENTENCE_FROM_ASSERTION, ONE_INTEGER, $int$500, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_SENTENCE_FROM_ASSERTION, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_sentence_from_assertion_internal(assertion)));
			memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_include_mt_in_assertion_sentenceP(final SubLObject assertion) {
		if ((((NIL != pph_isaP(assertions_high.assertion_mt(assertion), $$InteractionHistoryMicrotheory, UNPROVIDED)) || (NIL != pph_isaP(assertions_high.assertion_mt(assertion), $$AgentModelingAtTimeMicrotheory, UNPROVIDED))) && (NIL != assertions_high.gaf_assertionP(assertion))) && (NIL != pph_genl_predicateP(assertions_high.gaf_arg0(assertion), $const556$likelihoodOfAgentHavingMathBelief, UNPROVIDED))) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_no_hl_only_termsP(final SubLObject assertion) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			ans = makeBoolean(NIL == cycl_utilities.expression_find_if($sym557$PPH_HL_ONLY_TERM_, assertion, T, UNPROVIDED));
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject pph_hl_only_termP(final SubLObject v_term) {
		return makeBoolean((NIL != cycl_utilities.reified_term_p(v_term)) && (NIL != member(v_term, $pph_hl_only_terms$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject pph_no_skolemsP(final SubLObject assertion) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			ans = makeBoolean(NIL == cycl_utilities.expression_find_if(SKOLEM_FUNCTION_P, assertion, T, UNPROVIDED));
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject clear_pph_english_contextP() {
		final SubLObject cs = $pph_english_contextP_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_english_contextP(SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		return memoization_state.caching_state_remove_function_results_with_args($pph_english_contextP_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_english_contextP_internal(final SubLObject mt) {
		return pph_genl_mtP(mt, $$EnglishMt);
	}

	public static SubLObject pph_english_contextP(SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		SubLObject caching_state = $pph_english_contextP_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name($sym559$PPH_ENGLISH_CONTEXT_, $sym561$_PPH_ENGLISH_CONTEXT__CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(pph_english_contextP_internal(mt)));
			memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_assertion_wrong_languageP(final SubLObject assertion) {
		return makeBoolean((NIL != pph_english_contextP(UNPROVIDED)) && (NIL != pph_methods.pph_non_english_lexical_mtP(assertions_high.assertion_mt(assertion))));
	}

	public static SubLObject pph_sort_assertions(final SubLObject assertions, SubLObject key, SubLObject mt) {
		if (key == UNPROVIDED) {
			key = symbol_function(IDENTITY);
		}
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			ans = Sort.sort(assertions, $sym562$PPH_PREFER_ASSERTION_, key);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject pph_stable_sort_assertions(final SubLObject assertions, SubLObject key, SubLObject mt) {
		if (key == UNPROVIDED) {
			key = symbol_function(IDENTITY);
		}
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			ans = Sort.stable_sort(assertions, $sym562$PPH_PREFER_ASSERTION_, key);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject clear_pph_prefer_assertionP() {
		final SubLObject cs = $pph_prefer_assertionP_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_prefer_assertionP(final SubLObject as1, final SubLObject as2, SubLObject language_mt, SubLObject terseP, SubLObject preciseP) {
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (terseP == UNPROVIDED) {
			terseP = pph_terse_mode_p();
		}
		if (preciseP == UNPROVIDED) {
			preciseP = pph_top_level_preciseP();
		}
		return memoization_state.caching_state_remove_function_results_with_args($pph_prefer_assertionP_caching_state$.getGlobalValue(), list(as1, as2, language_mt, terseP, preciseP), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_prefer_assertionP_internal(final SubLObject as1, final SubLObject as2, final SubLObject language_mt, final SubLObject terseP, final SubLObject preciseP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject terseness = (NIL != terseP) ? $TERSE : NIL != preciseP ? $PRECISE : NIL;
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
		try {
			pph_vars.$pph_language_mt$.bind(language_mt, thread);
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
			final SubLObject _prev_bind_0_$123 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				if ((NIL != pph_assertion_wrong_languageP(as1)) && (NIL == pph_assertion_wrong_languageP(as2))) {
					ans = NIL;
				} else if ((NIL != pph_assertion_wrong_languageP(as2)) && (NIL == pph_assertion_wrong_languageP(as1))) {
					ans = T;
				} else if (NIL != lexicon_cache.prefer_lexical_assertionP(as1, as2, terseness)) {
					ans = T;
				} else if (NIL != lexicon_cache.prefer_lexical_assertionP(as2, as1, terseness)) {
					ans = NIL;
				} else if ((((NIL != assertions_high.gaf_assertionP(as1)) && (NIL != assertions_high.gaf_assertionP(as2))) && (NIL != member(assertions_high.gaf_arg0(as2), pph_methods_lexicon.pph_arg_in_reln_preds(UNPROVIDED), UNPROVIDED, UNPROVIDED))) && (NIL == subl_promotions.memberP(assertions_high.gaf_arg0(as1), pph_methods_lexicon.pph_arg_in_reln_preds(UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
					ans = T;
				}

			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0_$123, thread);
			}
		} finally {
			pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject pph_prefer_assertionP(final SubLObject as1, final SubLObject as2, SubLObject language_mt, SubLObject terseP, SubLObject preciseP) {
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (terseP == UNPROVIDED) {
			terseP = pph_terse_mode_p();
		}
		if (preciseP == UNPROVIDED) {
			preciseP = pph_top_level_preciseP();
		}
		SubLObject caching_state = $pph_prefer_assertionP_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name($sym562$PPH_PREFER_ASSERTION_, $sym565$_PPH_PREFER_ASSERTION__CACHING_STATE_, $int$200, EQUAL, FIVE_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_5(as1, as2, language_mt, terseP, preciseP);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (as1.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (as2.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (language_mt.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (terseP.equal(cached_args.first())) {
								cached_args = cached_args.rest();
								if (((NIL != cached_args) && (NIL == cached_args.rest())) && preciseP.equal(cached_args.first())) {
									return memoization_state.caching_results(results2);
								}
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pph_prefer_assertionP_internal(as1, as2, language_mt, terseP, preciseP)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(as1, as2, language_mt, terseP, preciseP));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_prefer_stringP(final SubLObject string1, final SubLObject string2) {
		if (NIL != pph_string_frequencies_availableP()) {
			return NIL != pph_top_level_preciseP() ? pph_more_frequent_stringP(string2, string1) : pph_more_frequent_stringP(string1, string2);
		}
		return NIL != pph_top_level_preciseP() ? list_utilities.greater_length_p(string1, string2) : list_utilities.greater_length_p(string2, string1);
	}

	public static SubLObject pph_string_frequencies_availableP() {
		return NIL;
	}

	public static SubLObject pph_more_frequent_stringP(final SubLObject string1, final SubLObject string2) {
		final SubLObject language = (NIL != pph_english_contextP(UNPROVIDED)) ? $$EnglishLanguage : NIL;
		return numG(pph_string_frequency(string1, language), pph_string_frequency(string2, language));
	}

	public static SubLObject pph_string_frequency_internal(final SubLObject string, SubLObject language) {
		if (language == UNPROVIDED) {
			language = NIL;
		}
		return ZERO_INTEGER;
	}

	public static SubLObject pph_string_frequency(final SubLObject string, SubLObject language) {
		if (language == UNPROVIDED) {
			language = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_string_frequency_internal(string, language);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_STRING_FREQUENCY, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_STRING_FREQUENCY, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_STRING_FREQUENCY, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(string, language);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (string.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && language.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_string_frequency_internal(string, language)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, language));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject multiple_paraphrase_forts() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject v_forts = NIL;
		final SubLObject message = $str569$Finding_forts_with_multiple_possi;
		final SubLObject total = forts.fort_count();
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
				SubLObject cdolist_list_var = forts.do_forts_tables();
				SubLObject table_var = NIL;
				table_var = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					final SubLObject idx = table_var;
					if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
						final SubLObject idx_$124 = idx;
						if (NIL == id_index_dense_objects_empty_p(idx_$124, $SKIP)) {
							final SubLObject vector_var = id_index_dense_objects(idx_$124);
							final SubLObject backwardP_var = NIL;
							SubLObject length;
							SubLObject v_iteration;
							SubLObject id;
							SubLObject fort;
							for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
								id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
								fort = aref(vector_var, id);
								if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
									if (NIL != id_index_tombstone_p(fort)) {
										fort = $SKIP;
									}
									sofar = add(sofar, ONE_INTEGER);
									note_percent_progress(sofar, total);
									if (NIL != multiple_paraphrase_fortP(fort, UNPROVIDED)) {
										v_forts = cons(fort, v_forts);
										print(fort, UNPROVIDED);
									}
								}
							}
						}
						final SubLObject idx_$125 = idx;
						if ((NIL == id_index_sparse_objects_empty_p(idx_$125)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
							final SubLObject sparse = id_index_sparse_objects(idx_$125);
							SubLObject id2 = id_index_sparse_id_threshold(idx_$125);
							final SubLObject end_id = id_index_next_id(idx_$125);
							final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
							while (id2.numL(end_id)) {
								final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
								if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
									sofar = add(sofar, ONE_INTEGER);
									note_percent_progress(sofar, total);
									if (NIL != multiple_paraphrase_fortP(fort2, UNPROVIDED)) {
										v_forts = cons(fort2, v_forts);
										print(fort2, UNPROVIDED);
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
				final SubLObject _prev_bind_0_$126 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					noting_percent_progress_postamble();
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$126, thread);
				}
			}
		} finally {
			$percent_progress_start_time$.rebind(_prev_bind_4, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
			$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
		return v_forts;
	}

	public static SubLObject multiple_paraphrase_fortP(final SubLObject fort, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
		try {
			pph_vars.$pph_language_mt$.bind(mt, thread);
			final SubLObject lexifications = pph_methods_lexicon.pph_lexifications_for_term(fort, UNPROVIDED, UNPROVIDED);
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
			final SubLObject _prev_bind_0_$127 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				ans = makeBoolean(((NIL != list_utilities.lengthG(lexifications, ONE_INTEGER, UNPROVIDED)) && (NIL == kb_mapping_utilities.some_pred_value(fort, $$preferredGenUnit, UNPROVIDED, UNPROVIDED))) && (NIL == kb_mapping_utilities.some_pred_value(fort, $$genStringAssertion, UNPROVIDED, UNPROVIDED)));
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0_$127, thread);
			}
		} finally {
			pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject assert_assertion_web_frequency(final SubLObject as, final SubLObject score) {
		ke.ke_assert(list($$webFrequencyForLexicalAssertion, as, score), assertions_high.assertion_mt(as), UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject pph_nameable_collectionP(final SubLObject cycl) {
		return makeBoolean((NIL != pph_ask_lit(list($$nameableCollection, cycl), UNPROVIDED)) || (NIL != pph_removal_ask_boolean(list($$thereExists, $sym575$_NAME, listS($$nameString, cycl, $list576)), UNPROVIDED)));
	}

	public static SubLObject pph_generality_estimateL_internal(final SubLObject term1, final SubLObject term2) {
		return cardinality_estimates.generality_estimateL(pph_core_term(term1), pph_core_term(term2));
	}

	public static SubLObject pph_generality_estimateL(final SubLObject term1, final SubLObject term2) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_generality_estimateL_internal(term1, term2);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym464$PPH_GENERALITY_ESTIMATE_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym464$PPH_GENERALITY_ESTIMATE_, TWO_INTEGER, $int$200, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym464$PPH_GENERALITY_ESTIMATE_, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(term1, term2);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (term1.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && term2.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_generality_estimateL_internal(term1, term2)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(term1, term2));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_core_term(final SubLObject v_term) {
		return NIL != specs_fn_natP(v_term) ? cycl_utilities.nat_arg1(v_term, UNPROVIDED) : v_term;
	}

	public static SubLObject pph_peer_agr_preds_for_preds(final SubLObject target_agr_preds, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (target_agr_preds == $ANY) {
			return $ANY;
		}
		if (target_agr_preds.isList()) {
			return pph_peer_agr_preds_for_preds_int(target_agr_preds, mt);
		}
		return NIL;
	}

	public static SubLObject pph_peer_agr_preds_for_preds_int(final SubLObject agr_preds, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		SubLObject result = pph_peer_agr_for_preds(agr_preds, mt);
		if ((NIL != pph_english_contextP(UNPROVIDED)) && (NIL == subl_promotions.memberP($$adjStrings, result, UNPROVIDED, UNPROVIDED))) {
			SubLObject adj_strings_okayP;
			SubLObject rest;
			SubLObject pred;
			for (adj_strings_okayP = NIL, rest = NIL, rest = result; (NIL == adj_strings_okayP) && (NIL != rest); rest = rest.rest()) {
				pred = rest.first();
				if (NIL != pph_phrase_resolution.pph_noun_predP(pred, mt)) {
					adj_strings_okayP = T;
				}
			}
			if (NIL != adj_strings_okayP) {
				result = cons($$adjStrings, result);
			}
		}
		if (NIL == subl_promotions.memberP($$untensed, result, UNPROVIDED, UNPROVIDED)) {
			SubLObject rest;
			SubLObject pred;
			SubLObject untensed_okayP;
			for (untensed_okayP = NIL, rest = NIL, rest = result; (NIL == untensed_okayP) && (NIL != rest); rest = rest.rest()) {
				pred = rest.first();
				if (NIL != pph_phrase_resolution.pph_noun_predP(pred, mt)) {
					untensed_okayP = T;
				}
			}
			if (NIL != untensed_okayP) {
				result = cons($$untensed, result);
			}
		}
		return result;
	}

	public static SubLObject pph_peer_agr_for_preds_internal(final SubLObject agr_preds, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != list_utilities.empty_list_p(agr_preds)) || (agr_preds == $ANY)) {
			return list($pph_default_np_agr_pred$.getGlobalValue());
		}
		SubLObject result = NIL;
		SubLObject cdolist_list_var = pph_generic_pos_preds();
		SubLObject generic_pred = NIL;
		generic_pred = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject doneP;
			SubLObject rest;
			SubLObject agr_pred;
			for (doneP = NIL, rest = NIL, rest = agr_preds; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
				agr_pred = rest.first();
				if (NIL != pph_genl_pos_predP(agr_pred, generic_pred, mt)) {
					result = cons(generic_pred, result);
					doneP = T;
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			generic_pred = cdolist_list_var.first();
		}
		if ((NIL == subl_promotions.memberP($pph_default_np_agr_pred$.getGlobalValue(), result, symbol_function(EQ), UNPROVIDED)) && (NIL != list_utilities.find_if_not(symbol_function($sym580$PPH_SPEECH_PART_PRED_), agr_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
			result = cons($pph_default_np_agr_pred$.getGlobalValue(), result);
		}
		if (NIL != list_utilities.empty_list_p(result)) {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str581$Failed_to_find_peer_agr_for__S_, agr_preds);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
			result = agr_preds;
		}
		return result;
	}

	public static SubLObject pph_peer_agr_for_preds(final SubLObject agr_preds, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_peer_agr_for_preds_internal(agr_preds, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_PEER_AGR_FOR_PREDS, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_PEER_AGR_FOR_PREDS, TWO_INTEGER, $int$64, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_PEER_AGR_FOR_PREDS, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(agr_preds, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (agr_preds.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_peer_agr_for_preds_internal(agr_preds, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(agr_preds, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_peer_agr_for_pred_internal(final SubLObject agr_pred, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (NIL == pph_speech_part_predP(agr_pred)) {
			return $pph_default_np_agr_pred$.getGlobalValue();
		}
		SubLObject csome_list_var = pph_generic_pos_preds();
		SubLObject generic_pred = NIL;
		generic_pred = csome_list_var.first();
		while (NIL != csome_list_var) {
			if (NIL != pph_genl_pos_predP(agr_pred, generic_pred, mt)) {
				return generic_pred;
			}
			csome_list_var = csome_list_var.rest();
			generic_pred = csome_list_var.first();
		}
		return agr_pred;
	}

	public static SubLObject pph_peer_agr_for_pred(final SubLObject agr_pred, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_peer_agr_for_pred_internal(agr_pred, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_PEER_AGR_FOR_PRED, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_PEER_AGR_FOR_PRED, TWO_INTEGER, $int$64, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_PEER_AGR_FOR_PRED, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(agr_pred, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (agr_pred.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_peer_agr_for_pred_internal(agr_pred, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(agr_pred, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_generic_pos_preds() {
		return $list583;
	}

	public static SubLObject pph_default_nl_preds_for_term(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (((NIL != el_formula_p(v_term)) || (NIL != assertion_handles.assertion_p(v_term))) && (NIL != cycl_grammar.cycl_sentence_p(v_term))) {
			return $list584;
		}
		if ((NIL != assertion_handles.assertion_p(v_term)) && (NIL != pph_proof.hypothetical_mtP(v_term))) {
			return $list585;
		}
		if (NIL != fort_types_interface.predicate_p(v_term)) {
			return $ANY;
		}
		if (NIL != pph_types.pph_nl_tagged_termP(v_term)) {
			return $ANY;
		}
		if (NIL != time_interval_utilities.date_interval_p(v_term)) {
			return $ANY;
		}
		if (NIL != formula_pattern_match.formula_matches_pattern(v_term, $list586)) {
			return $ANY;
		}
		if (NIL != inference_datastructures_inference.valid_inference_answer_p(pph_vars.$pph_inference_answer$.getDynamicValue(thread))) {
			return pph_default_nl_preds_for_term_from_inference_answer(v_term);
		}
		if (NIL != pph_isaP(v_term, $$Collection, UNPROVIDED)) {
			return $list455;
		}
		return $ANY;
	}

	public static SubLObject pph_default_nl_preds_for_term_from_inference_answer(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject sentence = pph_proven_sentence_from_inference_answer();
		SubLObject ans = NIL;
		if ((NIL != sentence) && (NIL == ans)) {
			SubLObject csome_list_var = pph_formula_positions(v_term, sentence, symbol_function(EQUAL));
			SubLObject position = NIL;
			position = csome_list_var.first();
			while ((NIL == ans) && (NIL != csome_list_var)) {
				if (NIL != list_utilities.proper_list_p(position)) {
					final SubLObject operator = cycl_utilities.formula_arg0(pph_apply_template(pph_cycl_template_from_arg_position(butlast(position, UNPROVIDED)), sentence));
					final SubLObject pred = pph_default_nl_pred_for_arg_of_reln(list_utilities.last_one(position), operator);
					if (NIL != pred) {
						ans = list(pred);
					}
				}
				csome_list_var = csome_list_var.rest();
				position = csome_list_var.first();
			}
		}
		if (NIL == ans) {
			final SubLObject _prev_bind_0 = pph_vars.$pph_inference_answer$.currentBinding(thread);
			try {
				pph_vars.$pph_inference_answer$.bind(NIL, thread);
				ans = pph_default_nl_preds_for_term(v_term);
			} finally {
				pph_vars.$pph_inference_answer$.rebind(_prev_bind_0, thread);
			}
		}
		return ans;
	}

	public static SubLObject pph_default_nl_pred_for_arg_of_reln(final SubLObject argnum, final SubLObject operator) {
		return pph_ask_variable($sym588$_PRED, listS($$generateArgOfRelnWithForm, argnum, operator, $list590), UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
	}

	public static SubLObject pph_proven_sentence_from_inference_answer() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject proven_sentence = NIL;
		if (NIL != inference_datastructures_inference.valid_inference_answer_p(pph_vars.$pph_inference_answer$.getDynamicValue(thread))) {
			proven_sentence = inference_datastructures_inference.inference_answer_el_sentence(pph_vars.$pph_inference_answer$.getDynamicValue(thread));
		}
		return proven_sentence;
	}

	public static SubLObject pph_default_force_for_term(final SubLObject v_term) {
		if (NIL != cycl_variables.el_varP(v_term)) {
			return $NONE;
		}
		if (NIL != cycl_grammar.cycl_sentence_p(v_term)) {
			return $DECLARATIVE;
		}
		return $NONE;
	}

	public static SubLObject pph_force_from_cycl_force(final SubLObject cycl_force) {
		if (cycl_force.eql($$DeclarativeUtterance)) {
			return $DECLARATIVE;
		}
		if (cycl_force.eql($$InterrogativeUtterance)) {
			return $INTERROGATIVE;
		}
		return $NONE;
	}

	public static SubLObject pph_expand_nl_preds(final SubLObject nl_preds) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		if (NIL != pph_nl_pred_listP(nl_preds)) {
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				SubLObject cdolist_list_var = nl_preds;
				SubLObject pred = NIL;
				pred = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					ans = append(ans, genl_predicates.all_spec_preds(pred, UNPROVIDED, UNPROVIDED));
					cdolist_list_var = cdolist_list_var.rest();
					pred = cdolist_list_var.first();
				}
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		}
		return ans;
	}

	public static SubLObject pph_generic_speech_part_preds_with_tense_and_aspect_internal() {
		return list_utilities.delete_if_not(symbol_function($sym9$VALID_CONSTANT_), list(pph_present_tense_pred(), pph_past_tense_pred(), pph_future_tense_pred(), $$presentPerfect_Generic, $$pastPerfect_Generic, $$futurePerfect_Generic), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_generic_speech_part_preds_with_tense_and_aspect() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_generic_speech_part_preds_with_tense_and_aspect_internal();
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_GENERIC_SPEECH_PART_PREDS_WITH_TENSE_AND_ASPECT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_GENERIC_SPEECH_PART_PREDS_WITH_TENSE_AND_ASPECT, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_GENERIC_SPEECH_PART_PREDS_WITH_TENSE_AND_ASPECT, caching_state);
		}
		SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_generic_speech_part_preds_with_tense_and_aspect_internal()));
			memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_present_tense_pred() {
		return $$presentTense_Generic;
	}

	public static SubLObject pph_present_perfect_tense_pred() {
		final SubLObject perfect_pred = constants_high.find_constant($str600$presentPerfect_Generic);
		return NIL != perfect_pred ? perfect_pred : pph_present_tense_pred();
	}

	public static SubLObject pph_past_tense_pred() {
		return $$pastTense_Generic;
	}

	public static SubLObject pph_future_tense_pred() {
		return $$futureTense_Generic;
	}

	public static SubLObject pph_tense_predP(final SubLObject pred) {
		return makeBoolean((pred.eql(pph_present_tense_pred()) || pred.eql(pph_past_tense_pred())) || pred.eql(pph_future_tense_pred()));
	}

	public static SubLObject pph_tense_pred_for_interval_subsuming_date_internal(final SubLObject interval, SubLObject date) {
		if (date == UNPROVIDED) {
			date = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject pred = NIL;
		final SubLObject best_date = (NIL != date) ? date : date_utilities.universal_time_to_cycl_date(get_universal_time());
		if (interval.eql($$Now) || interval.eql($$Always_TimeInterval)) {
			pred = pph_present_tense_pred();
		} else if (interval.eql($$Tomorrow_Indexical)) {
			pred = pph_future_tense_pred();
		} else if (NIL != formula_pattern_match.formula_matches_pattern(interval, $list607)) {
			pred = (NIL != pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.getDynamicValue(thread)) ? pph_present_perfect_tense_pred() : pph_present_tense_pred();
		} else if (NIL != formula_pattern_match.formula_matches_pattern(interval, $list608)) {
			final SubLObject temporal_thing = cycl_utilities.formula_arg1(interval, UNPROVIDED);
			if (NIL != pph_removal_ask_boolean(list($$startsAfterEndingOf, temporal_thing, best_date), UNPROVIDED)) {
				pred = pph_future_tense_pred();
			} else if (NIL != pph_vars.$pph_explicit_temporal_qualification_for_current_factsP$.getDynamicValue(thread)) {
				pred = pph_present_perfect_tense_pred();
			} else {
				pred = pph_present_tense_pred();
			}

		} else if (NIL != pph_time_interval_subsumesP(interval, best_date)) {
			pred = pph_present_tense_pred();
		} else if (NIL != pph_removal_ask_boolean(list($$startsAfterEndingOf, interval, best_date), UNPROVIDED)) {
			pred = pph_future_tense_pred();
		} else {
			pred = pph_past_tense_pred();
		}

		return pred;
	}

	public static SubLObject pph_tense_pred_for_interval_subsuming_date(final SubLObject interval, SubLObject date) {
		if (date == UNPROVIDED) {
			date = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_tense_pred_for_interval_subsuming_date_internal(interval, date);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_TENSE_PRED_FOR_INTERVAL_SUBSUMING_DATE, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_TENSE_PRED_FOR_INTERVAL_SUBSUMING_DATE, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_TENSE_PRED_FOR_INTERVAL_SUBSUMING_DATE, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(interval, date);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (interval.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && date.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_tense_pred_for_interval_subsuming_date_internal(interval, date)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(interval, date));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_time_interval_subsumesP(final SubLObject interval, final SubLObject date) {
		if (NIL != formula_pattern_match.formula_matches_pattern(interval, $list610)) {
			return pph_time_interval_subsumesP(cycl_utilities.formula_arg1(interval, UNPROVIDED), date);
		}
		if (NIL != formula_pattern_match.formula_matches_pattern(interval, $list611)) {
			return NIL;
		}
		return pph_removal_ask_boolean(list($$temporallySubsumes, interval, date), UNPROVIDED);
	}

	public static SubLObject tou_atomic_sentenceP(final SubLObject formula) {
		return el_formula_with_operator_p(formula, $$termOfUnit);
	}

	public static SubLObject clean_up_connectives(SubLObject formula) {
		SubLObject cdolist_list_var;
		final SubLObject cs_or_ds = cdolist_list_var = list_utilities.cons_tree_gather(formula, symbol_function(EL_JUNCTION_P), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
		SubLObject form = NIL;
		form = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != el_grammar.el_unary_sentence_p(form)) {
				formula = subst(cycl_utilities.formula_arg1(form, UNPROVIDED), form, formula, symbol_function(EQUAL), UNPROVIDED);
			}
			cdolist_list_var = cdolist_list_var.rest();
			form = cdolist_list_var.first();
		}
		return formula;
	}

	public static SubLObject always_use_nameP(final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean(((NIL != $always_use_instances_names$.getGlobalValue()) && (NIL != pph_isa_anyP(v_object, $always_use_instances_names$.getGlobalValue(), UNPROVIDED))) || (NIL != member(v_object, $always_use_names$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)));
	}

	public static SubLObject pph_named_entityP_internal(final SubLObject cycl, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		if (NIL != forts.fort_p(cycl)) {
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				if (NIL == ans) {
					SubLObject csome_list_var;
					SubLObject namestring_pred;
					for (csome_list_var = pph_methods.pph_name_string_preds(UNPROVIDED), namestring_pred = NIL, namestring_pred = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = kb_mapping_utilities.some_pred_value(cycl, namestring_pred, UNPROVIDED, UNPROVIDED), csome_list_var = csome_list_var.rest(), namestring_pred = csome_list_var.first()) {
					}
				}
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		}
		return ans;
	}

	public static SubLObject pph_named_entityP(final SubLObject cycl, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_named_entityP_internal(cycl, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym614$PPH_NAMED_ENTITY_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym614$PPH_NAMED_ENTITY_, TWO_INTEGER, $int$500, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym614$PPH_NAMED_ENTITY_, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(cycl, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (cycl.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_named_entityP_internal(cycl, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_isa_anyP_internal(final SubLObject v_object, final SubLObject types, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		if (NIL != term.el_fort_p(v_object)) {
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				ans = isa.isa_anyP(v_object, types, UNPROVIDED, UNPROVIDED);
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		} else if (NIL == ans) {
			SubLObject csome_list_var;
			SubLObject type;
			for (csome_list_var = types, type = NIL, type = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = pph_isaP(v_object, type, mt), csome_list_var = csome_list_var.rest(), type = csome_list_var.first()) {
			}
		}

		return ans;
	}

	public static SubLObject pph_isa_anyP(final SubLObject v_object, final SubLObject types, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_isa_anyP_internal(v_object, types, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym615$PPH_ISA_ANY_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym615$PPH_ISA_ANY_, THREE_INTEGER, $int$300, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym615$PPH_ISA_ANY_, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(v_object, types, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (v_object.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (types.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_isa_anyP_internal(v_object, types, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_object, types, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_isa_repeated_argsP(final SubLObject obj1, final SubLObject obj2, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean((NIL != set.set_p($pph_isa_context$.getDynamicValue(thread))) && (NIL != set.set_memberP(list(obj1, obj2, mt), $pph_isa_context$.getDynamicValue(thread))));
	}

	public static SubLObject noting_pph_isa_context(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list617);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject obj1 = NIL;
		SubLObject obj2 = NIL;
		SubLObject mt = NIL;
		destructuring_bind_must_consp(current, datum, $list617);
		obj1 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list617);
		obj2 = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list617);
		mt = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject arg_list = $sym618$ARG_LIST;
			return list(CLET, list($list619, list(arg_list, list(LIST, obj1, obj2, mt))), listS(SET_ADD, arg_list, $list621), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(SET_REMOVE, arg_list, $list621)));
		}
		cdestructuring_bind_error(datum, $list617);
		return NIL;
	}

	public static SubLObject find_or_create_pph_isa_context() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return NIL != set.set_p($pph_isa_context$.getDynamicValue(thread)) ? $pph_isa_context$.getDynamicValue(thread) : set.new_set(symbol_function(EQUAL), UNPROVIDED);
	}

	public static SubLObject pph_isaP_internal(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != pph_isa_repeated_argsP(obj1, obj2, mt)) {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str627$Nested_call___PPH_ISA___S__S__S_, obj1, obj2, mt);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
			return NIL;
		}
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = $pph_isa_context$.currentBinding(thread);
		try {
			$pph_isa_context$.bind(find_or_create_pph_isa_context(), thread);
			final SubLObject arg_list = list(obj1, obj2, mt);
			set.set_add(arg_list, $pph_isa_context$.getDynamicValue(thread));
			try {
				if (((NIL != possibly_fo_naut_p(obj1)) && (NIL != pph_isaP(obj1.first(), $$Function_Denotational, mt))) && (NIL != isa.nat_isaP(obj1, obj2, mt, UNPROVIDED))) {
					ans = T;
				} else if (((NIL != possibly_fo_naut_p(obj1)) && (NIL != pph_isaP(obj1.first(), $$Function_Denotational, mt))) && (NIL != disjoint_with.any_disjoint_withP(isa.nat_isa(obj1, mt, UNPROVIDED), obj2, mt, UNPROVIDED))) {
					ans = NIL;
				} else if (((NIL != cycl_variables.el_varP(obj1)) && (NIL != pph_vars.pph_tracking_var_types_p())) && (NIL != pph_genlP(pph_variable_handling.pph_var_type(obj1), obj2, mt))) {
					ans = T;
				} else if ((NIL != cycl_variables.el_varP(obj1)) && (NIL != pph_var_constrained_to_beP(obj1, obj2, mt))) {
					ans = T;
				} else if ((NIL != cycl_utilities.reified_term_p(obj1)) && (NIL != cycl_utilities.reified_term_p(obj2))) {
					ans = isa.isaP(obj1, obj2, mt, UNPROVIDED);
				} else if (obj1.isSymbol() || (NIL != cycl_variables.el_varP(obj2))) {
					ans = NIL;
				} else if (obj2.eql($$Collection)) {
					ans = fort_types_interface.isa_collection_in_any_mtP(obj1);
				} else {
					ans = pph_removal_ask_boolean(list($$isa, obj1, obj2), mt);
				}

			} finally {
				final SubLObject _prev_bind_0_$128 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set.set_remove(arg_list, $pph_isa_context$.getDynamicValue(thread));
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
				}
			}
		} finally {
			$pph_isa_context$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject pph_isaP(final SubLObject obj1, final SubLObject obj2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_isaP_internal(obj1, obj2, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym626$PPH_ISA_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym626$PPH_ISA_, THREE_INTEGER, $int$1000, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym626$PPH_ISA_, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(obj1, obj2, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (obj1.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (obj2.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_isaP_internal(obj1, obj2, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(obj1, obj2, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_var_constrained_to_beP(final SubLObject var, final SubLObject col, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		if (NIL == ans) {
			SubLObject csome_list_var = pph_vars.$pph_cycls$.getDynamicValue(thread);
			SubLObject formula = NIL;
			formula = csome_list_var.first();
			while ((NIL == ans) && (NIL != csome_list_var)) {
				if ((NIL != el_formula_p(formula)) && (NIL == ans)) {
					SubLObject csome_list_var_$129;
					SubLObject isa_constraint;
					for (csome_list_var_$129 = pph_variable_handling.pph_variable_isa_constraints(var, formula, mt_relevance_macros.$mt$.getDynamicValue(thread), T, T, UNPROVIDED), isa_constraint = NIL, isa_constraint = csome_list_var_$129.first(); (NIL == ans)
							&& (NIL != csome_list_var_$129); ans = pph_genlP(isa_constraint, col, mt), csome_list_var_$129 = csome_list_var_$129.rest(), isa_constraint = csome_list_var_$129.first()) {
					}
				}
				csome_list_var = csome_list_var.rest();
				formula = csome_list_var.first();
			}
		}
		return ans;
	}

	public static SubLObject pph_quoted_isaP_internal(final SubLObject obj1, final SubLObject obj2) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject narty_obj1 = narts_high.nart_substitute(obj1);
		if ((NIL != forts.fort_p(narty_obj1)) && (NIL != member(obj2, kb_mapping_utilities.pred_values_in_any_mt(narty_obj1, $$quotedIsa, ONE_INTEGER, TWO_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
			return T;
		}
		if (NIL != pph_symbol_meets_quoted_defnP(narty_obj1, obj2)) {
			return T;
		}
		if (NIL != narts_high.naut_p(narty_obj1)) {
			SubLObject ans = NIL;
			final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
				mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
				ans = subl_promotions.memberP(obj2, kb_accessors.result_quoted_isa(cycl_utilities.nat_functor(narty_obj1), UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
			return ans;
		}
		return NIL;
	}

	public static SubLObject pph_quoted_isaP(final SubLObject obj1, final SubLObject obj2) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_quoted_isaP_internal(obj1, obj2);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym629$PPH_QUOTED_ISA_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym629$PPH_QUOTED_ISA_, TWO_INTEGER, $int$256, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym629$PPH_QUOTED_ISA_, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(obj1, obj2);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (obj1.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && obj2.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_quoted_isaP_internal(obj1, obj2)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(obj1, obj2));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_symbol_meets_quoted_defnP(final SubLObject symbol, final SubLObject type) {
		SubLObject successP = NIL;
		if (NIL != indexed_term_p(type)) {
			if (NIL == successP) {
				SubLObject csome_list_var = cycl_subl_symbol_symbol_list(kb_mapping_utilities.pred_values_in_any_mt(type, $$quotedDefnSufficient, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				SubLObject test = NIL;
				test = csome_list_var.first();
				while ((NIL == successP) && (NIL != csome_list_var)) {
					if ((NIL != fboundp(test)) && (NIL != funcall(test, symbol))) {
						successP = T;
					}
					csome_list_var = csome_list_var.rest();
					test = csome_list_var.first();
				}
			}
			if ((NIL == successP) && (NIL == successP)) {
				SubLObject csome_list_var = cycl_subl_symbol_symbol_list(kb_mapping_utilities.pred_values_in_any_mt(type, $$quotedDefnIff, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				SubLObject test = NIL;
				test = csome_list_var.first();
				while ((NIL == successP) && (NIL != csome_list_var)) {
					if ((NIL != fboundp(test)) && (NIL != funcall(test, symbol))) {
						successP = T;
					}
					csome_list_var = csome_list_var.rest();
					test = csome_list_var.first();
				}
			}
		}
		return successP;
	}

	public static SubLObject pph_obj_meets_defnP(final SubLObject obj, final SubLObject type) {
		SubLObject successP = NIL;
		if (NIL != indexed_term_p(type)) {
			if (NIL == successP) {
				SubLObject csome_list_var = cycl_subl_symbol_symbol_list(kb_mapping_utilities.pred_values_in_any_mt(type, $$defnSufficient, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				SubLObject test = NIL;
				test = csome_list_var.first();
				while ((NIL == successP) && (NIL != csome_list_var)) {
					if ((NIL != fboundp(test)) && (NIL != funcall(test, obj))) {
						successP = T;
					}
					csome_list_var = csome_list_var.rest();
					test = csome_list_var.first();
				}
			}
			if ((NIL == successP) && (NIL == successP)) {
				SubLObject csome_list_var = cycl_subl_symbol_symbol_list(kb_mapping_utilities.pred_values_in_any_mt(type, $$defnIff, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				SubLObject test = NIL;
				test = csome_list_var.first();
				while ((NIL == successP) && (NIL != csome_list_var)) {
					if ((NIL != fboundp(test)) && (NIL != funcall(test, obj))) {
						successP = T;
					}
					csome_list_var = csome_list_var.rest();
					test = csome_list_var.first();
				}
			}
		}
		return successP;
	}

	public static SubLObject pph_collectionP(final SubLObject obj) {
		return rbp_wff.npp_collectionP(obj);
	}

	public static SubLObject pph_nl_tagP(final SubLObject v_term) {
		return parsing_utilities.nl_tagP(v_term, UNPROVIDED);
	}

	public static SubLObject pph_instanceP(final SubLObject col1, final SubLObject col2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		return pph_isaP(col2, col1, mt);
	}

	public static SubLObject pph_arg_isaP(final SubLObject reln, final SubLObject n, final SubLObject col) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject arg_isas = kb_accessors.argn_isa(reln, n, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
		return member(col, arg_isas, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_specP(final SubLObject col1, final SubLObject col2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		return pph_genlP(col2, col1, mt);
	}

	public static SubLObject pph_proper_specP(final SubLObject col1, final SubLObject col2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		return makeBoolean((!col1.equal(col2)) && (NIL != pph_genlP(col2, col1, mt)));
	}

	public static SubLObject pph_genlP_internal(final SubLObject col1, final SubLObject col2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject genlP = NIL;
		if (col1.equal(col2)) {
			genlP = T;
		} else if (((NIL != forts.fort_p(col1)) && (NIL != forts.fort_p(col2))) && (NIL != genls.genlP(col1, col2, mt, UNPROVIDED))) {
			genlP = T;
		} else if (((((NIL != possibly_fo_naut_p(col1)) && (NIL != pph_isaP(col1.first(), $$Function_Denotational, mt))) && (NIL != term.el_fort_p(col2))) && (NIL != closedP(col1, UNPROVIDED))) && (NIL != closedP(col2, UNPROVIDED))) {
			final SubLObject _prev_bind_0 = $pgia_activeP$.currentBinding(thread);
			try {
				$pgia_activeP$.bind(T, thread);
				if (NIL != genls.nat_genlP(col1, col2, mt)) {
					genlP = T;
				}
			} finally {
				$pgia_activeP$.rebind(_prev_bind_0, thread);
			}
		}

		return genlP;
	}

	public static SubLObject pph_genlP(final SubLObject col1, final SubLObject col2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_genlP_internal(col1, col2, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym636$PPH_GENL_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym636$PPH_GENL_, THREE_INTEGER, $int$50000, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym636$PPH_GENL_, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(col1, col2, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (col1.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (col2.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_genlP_internal(col1, col2, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col1, col2, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_genl_mtP_internal(final SubLObject mt1, final SubLObject mt2) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt1);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			ans = mt_relevance_macros.relevant_mtP(mt2);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject pph_genl_mtP(final SubLObject mt1, final SubLObject mt2) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_genl_mtP_internal(mt1, mt2);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym638$PPH_GENL_MT_, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym638$PPH_GENL_MT_, TWO_INTEGER, $int$24, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym638$PPH_GENL_MT_, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(mt1, mt2);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (mt1.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt2.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_genl_mtP_internal(mt1, mt2)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(mt1, mt2));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_spec_predicateP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		return NIL != hlmt.hlmt_p(mt) ? pph_genl_predicateP(pred2, pred1, mt) : pph_genl_predicateP(pred2, pred1, UNPROVIDED);
	}

	public static SubLObject clear_pph_genl_predicateP() {
		final SubLObject cs = $pph_genl_predicateP_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_genl_predicateP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		return memoization_state.caching_state_remove_function_results_with_args($pph_genl_predicateP_caching_state$.getGlobalValue(), list(pred1, pred2, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_genl_predicateP_internal(SubLObject pred1, SubLObject pred2, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		pred1 = narts_high.nart_substitute(pred1);
		pred2 = narts_high.nart_substitute(pred2);
		final SubLObject pcase_var;
		final SubLObject quick_ans = pcase_var = pph_genl_predicate_quickP(pred1, pred2, mt);
		if (pcase_var.eql($TRUE)) {
			return T;
		}
		if (pcase_var.eql($FALSE)) {
			return NIL;
		}
		if (pcase_var.eql($NOT_SURE)) {
			SubLObject ans = NIL;
			final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
				if ((NIL != forts.fort_p(pred1)) && (NIL != forts.fort_p(pred2))) {
					thread.resetMultipleValues();
					final SubLObject ask_result = pph_removal_ask_boolean(list($$genlPreds, pred1, pred2), mt);
					final SubLObject query_runP = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != query_runP) {
						ans = ask_result;
					} else {
						ans = genl_predicates.genl_predicateP(pred1, pred2, mt, UNPROVIDED);
					}
				}
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
			return ans;
		}
		return NIL;
	}

	public static SubLObject pph_genl_predicateP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		SubLObject caching_state = $pph_genl_predicateP_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name($sym55$PPH_GENL_PREDICATE_, $sym640$_PPH_GENL_PREDICATE__CACHING_STATE_, $int$1024, EQ, THREE_INTEGER, ZERO_INTEGER);
			memoization_state.register_genl_preds_dependent_cache_clear_callback($sym642$CLEAR_PPH_GENL_PREDICATE_);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(pred1, pred2, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (pred1.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (pred2.eql(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pph_genl_predicateP_internal(pred1, pred2, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred1, pred2, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_genl_predicate_quickP(final SubLObject pred1, final SubLObject pred2, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = (pred1.eql(pred2)) ? $TRUE : $NOT_SURE;
		if ($NOT_SURE == ans) {
			final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
				if (NIL != indexed_term_p(pred1)) {
					final SubLObject immediate_sups = pph_immediate_genl_preds(pred1);
					if (NIL != subl_promotions.memberP(pred2, immediate_sups, symbol_function(EQUAL), UNPROVIDED)) {
						ans = $TRUE;
					} else {
						SubLObject abortP = list_utilities.find_if_not(INDEXED_TERM_P, immediate_sups, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						if (NIL == abortP) {
							SubLObject csome_list_var;
							SubLObject sup;
							for (csome_list_var = immediate_sups, sup = NIL, sup = csome_list_var.first(); (NIL == abortP) && (NIL != csome_list_var); abortP = pph_immediate_genl_preds(sup), csome_list_var = csome_list_var.rest(), sup = csome_list_var.first()) {
							}
						}
						if (NIL == abortP) {
							ans = $FALSE;
						}
					}
				}
				if ((ans == $NOT_SURE) && (NIL != indexed_term_p(pred2))) {
					final SubLObject immediate_infs = pph_immediate_spec_preds(pred2);
					if (NIL != subl_promotions.memberP(pred1, immediate_infs, symbol_function(EQUAL), UNPROVIDED)) {
						ans = $TRUE;
					} else {
						SubLObject abortP = list_utilities.find_if_not(INDEXED_TERM_P, immediate_infs, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						if (NIL == abortP) {
							SubLObject csome_list_var;
							SubLObject inf;
							for (csome_list_var = immediate_infs, inf = NIL, inf = csome_list_var.first(); (NIL == abortP) && (NIL != csome_list_var); abortP = pph_immediate_spec_preds(inf), csome_list_var = csome_list_var.rest(), inf = csome_list_var.first()) {
							}
						}
						if (NIL == abortP) {
							ans = $FALSE;
						}
					}
				}
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
		}
		return ans;
	}

	public static SubLObject pph_immediate_genl_preds(final SubLObject pred) {
		return kb_mapping_utilities.pred_values(pred, $$genlPreds, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
	}

	public static SubLObject pph_immediate_spec_preds(final SubLObject pred) {
		return kb_mapping_utilities.pred_values(pred, $$genlPreds, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
	}

	public static SubLObject pph_genl_relationP(final SubLObject reln1, final SubLObject reln2) {
		if (NIL != pph_genl_predicateP(reln1, reln2, UNPROVIDED)) {
			return T;
		}
		if (NIL != member(reln2, pph_all_genl_relations(reln1), UNPROVIDED, UNPROVIDED)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_relationP(final SubLObject obj) {
		return at_defns.quiet_has_typeP(obj, $$Relation, UNPROVIDED);
	}

	public static SubLObject pph_all_genl_relations(final SubLObject reln) {
		final SubLObject reln_fort = function_terms.naut_to_nart(reln);
		SubLObject relns = NIL;
		if (NIL != forts.fort_p(reln_fort)) {
			if (NIL != kb_mapping_utilities.some_pred_value(reln_fort, $$genlFunctions, UNPROVIDED, UNPROVIDED)) {
				relns = gt_methods.gt_all_superiors($$genlFunctions, reln_fort, UNPROVIDED);
			} else if (NIL != fort_types_interface.predicate_in_any_mtP(reln_fort)) {
				relns = genl_predicates.all_genl_predicates(reln_fort, UNPROVIDED, UNPROVIDED);
			}

		}
		if (NIL == member(reln, relns, symbol_function(EQL), symbol_function(IDENTITY))) {
			relns = cons(reln, relns);
		}
		return relns;
	}

	public static SubLObject pph_min_ceiling_cols(final SubLObject cols, SubLObject candidates, SubLObject mt, SubLObject tv) {
		if (candidates == UNPROVIDED) {
			candidates = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (tv == UNPROVIDED) {
			tv = NIL;
		}
		SubLObject specsfn_collections = NIL;
		SubLObject non_specsfn_term = NIL;
		SubLObject ret_value = NIL;
		if (NIL == non_specsfn_term) {
			SubLObject csome_list_var = cols;
			SubLObject col = NIL;
			col = csome_list_var.first();
			while ((NIL == non_specsfn_term) && (NIL != csome_list_var)) {
				if (NIL != specs_fn_natP(col)) {
					specsfn_collections = cons(cycl_utilities.formula_arg1(col, UNPROVIDED), specsfn_collections);
				} else {
					non_specsfn_term = T;
				}
				csome_list_var = csome_list_var.rest();
				col = csome_list_var.first();
			}
		}
		if (NIL != non_specsfn_term) {
			return genls.min_ceiling_cols(cols, candidates, mt, tv);
		}
		SubLObject cdolist_list_var = genls.min_ceiling_cols(specsfn_collections, NIL, mt, tv);
		SubLObject col = NIL;
		col = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			ret_value = cons(list($$SpecsFn, col), ret_value);
			cdolist_list_var = cdolist_list_var.rest();
			col = cdolist_list_var.first();
		}
		return nreverse(ret_value);
	}

	public static SubLObject pph_possible_pronoun_denotP(final SubLObject cycl, SubLObject strictP) {
		if (strictP == UNPROVIDED) {
			strictP = NIL;
		}
		return NIL != strictP ? pph_possible_pronoun_denotP_strict(cycl) : pph_possible_pronoun_denotP_permissive(cycl);
	}

	public static SubLObject pph_possible_pronoun_denotP_permissive_internal(final SubLObject cycl) {
		return makeBoolean((NIL != cycl_grammar.el_variable_p(cycl)) || (NIL != cycl_grammar.cycl_denotational_term_p(cycl)));
	}

	public static SubLObject pph_possible_pronoun_denotP_permissive(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_possible_pronoun_denotP_permissive_internal(cycl);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym645$PPH_POSSIBLE_PRONOUN_DENOT__PERMISSIVE, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym645$PPH_POSSIBLE_PRONOUN_DENOT__PERMISSIVE, ONE_INTEGER, $int$1000, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym645$PPH_POSSIBLE_PRONOUN_DENOT__PERMISSIVE, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_possible_pronoun_denotP_permissive_internal(cycl)));
			memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_possible_pronoun_denotP_strict_internal(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean(((NIL != pph_possible_pronoun_denotP_permissive(cycl)) && (((NIL != fort_types_interface.predicateP(cycl)) || (NIL != pph_isaP(cycl, $$SomethingExisting, pph_vars.$pph_domain_mt$.getDynamicValue(thread)))) || (NIL != pph_genlP(cycl, $$SomethingExisting, pph_vars.$pph_domain_mt$.getDynamicValue(thread))))) && (NIL == pph_quoted_isaP(cycl, $$IndeterminateTerm)));
	}

	public static SubLObject pph_possible_pronoun_denotP_strict(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_possible_pronoun_denotP_strict_internal(cycl);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym646$PPH_POSSIBLE_PRONOUN_DENOT__STRICT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym646$PPH_POSSIBLE_PRONOUN_DENOT__STRICT, ONE_INTEGER, $int$1000, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, $sym646$PPH_POSSIBLE_PRONOUN_DENOT__STRICT, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, cycl, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_possible_pronoun_denotP_strict_internal(cycl)));
			memoization_state.caching_state_put(caching_state, cycl, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject pph_nth_phrase_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		pprint_pph_nth_phrase(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject pph_nth_phrase_p(final SubLObject v_object) {
		return v_object.getJavaClass() ==$pph_nth_phrase_native.class ? T : NIL;
	}

	public static SubLObject pph_nth_phrase_num(final SubLObject v_object) {
		assert NIL != pph_nth_phrase_p(v_object) : "pph_utilities.pph_nth_phrase_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject pph_nth_phrase_constraints(final SubLObject v_object) {
		assert NIL != pph_nth_phrase_p(v_object) : "pph_utilities.pph_nth_phrase_p error :" + v_object;
		return v_object.getField3();
	}

	public static SubLObject _csetf_pph_nth_phrase_num(final SubLObject v_object, final SubLObject value) {
		assert NIL != pph_nth_phrase_p(v_object) : "pph_utilities.pph_nth_phrase_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_pph_nth_phrase_constraints(final SubLObject v_object, final SubLObject value) {
		assert NIL != pph_nth_phrase_p(v_object) : "pph_utilities.pph_nth_phrase_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject make_pph_nth_phrase(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new $pph_nth_phrase_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($NUM)) {
				_csetf_pph_nth_phrase_num(v_new, current_value);
			} else if (pcase_var.eql($CONSTRAINTS)) {
				_csetf_pph_nth_phrase_constraints(v_new, current_value);
			} else {
				Errors.error($str664$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_pph_nth_phrase(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_NTH_PHRASE, TWO_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $NUM, pph_nth_phrase_num(obj));
		funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS, pph_nth_phrase_constraints(obj));
		funcall(visitor_fn, obj, $END, MAKE_PPH_NTH_PHRASE, TWO_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_pph_nth_phrase_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_pph_nth_phrase(obj, visitor_fn);
	}

	public static SubLObject pprint_pph_nth_phrase(final SubLObject nth_phrase, final SubLObject stream, final SubLObject depth) {
		format(stream, $str670$__PPH_NTH_PHRASE___S, pph_nth_phrase_num(nth_phrase));
		if (NIL != pph_nth_phrase_constraints(nth_phrase)) {
			format(stream, $str671$__S, pph_nth_phrase_constraints(nth_phrase));
		}
		format(stream, $str672$_);
		return nth_phrase;
	}

	public static SubLObject new_pph_nth_phrase(final SubLObject num, SubLObject constraints) {
		if (constraints == UNPROVIDED) {
			constraints = $ANY;
		}
		if (constraints != $ANY) {
		}
		final SubLObject v_new = make_pph_nth_phrase(UNPROVIDED);
		_csetf_pph_nth_phrase_num(v_new, num);
		_csetf_pph_nth_phrase_constraints(v_new, constraints);
		return v_new;
	}

	public static SubLObject set_pph_nth_phrase_num(final SubLObject nth_phrase, final SubLObject num) {
		_csetf_pph_nth_phrase_num(nth_phrase, num);
		return nth_phrase;
	}

	public static SubLObject set_pph_nth_phrase_constraints(final SubLObject nth_phrase, final SubLObject constraints) {
		if (constraints != $ANY) {
		}
		_csetf_pph_nth_phrase_constraints(nth_phrase, constraints);
		return nth_phrase;
	}

	public static SubLObject pph_add_constraints_to_nth_phrase(final SubLObject nth_phrase, final SubLObject constraints) {
		set_pph_nth_phrase_constraints(nth_phrase, pph_filter_preds(constraints, pph_nth_phrase_constraints(nth_phrase), UNPROVIDED));
		return nth_phrase;
	}

	public static SubLObject cfasl_output_object_pph_nth_phrase_method(final SubLObject v_object, final SubLObject stream) {
		return cfasl_output_pph_nth_phrase(v_object, stream);
	}

	public static SubLObject cfasl_output_pph_nth_phrase(final SubLObject pph_nth_phrase, final SubLObject stream) {
		cfasl_raw_write_byte($cfasl_opcode_pph_nth_phrase$.getGlobalValue(), stream);
		cfasl_output(pph_nth_phrase_num(pph_nth_phrase), stream);
		cfasl_output(pph_nth_phrase_constraints(pph_nth_phrase), stream);
		return pph_nth_phrase;
	}

	public static SubLObject cfasl_input_pph_nth_phrase(final SubLObject stream) {
		SubLObject pph_nth_phrase = NIL;
		pph_nth_phrase = make_pph_nth_phrase(UNPROVIDED);
		_csetf_pph_nth_phrase_num(pph_nth_phrase, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
		_csetf_pph_nth_phrase_constraints(pph_nth_phrase, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
		return pph_nth_phrase;
	}

	public static SubLObject maybe_initialize_pph_generation_preds() {
		if (NIL != misc_utilities.uninitialized_p($pph_generation_preds$.getGlobalValue())) {
			$pph_generation_preds$.setGlobalValue(set.new_set(UNPROVIDED, UNPROVIDED));
			SubLObject cdolist_list_var = isa.all_instances_in_all_mts($$NLGenerationPredicate);
			SubLObject pred = NIL;
			pred = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				set.set_add(pred, $pph_generation_preds$.getGlobalValue());
				cdolist_list_var = cdolist_list_var.rest();
				pred = cdolist_list_var.first();
			}
		}
		return NIL;
	}

	public static SubLObject clear_pph_nl_generation_predP() {
		$pph_generation_preds$.setGlobalValue(misc_utilities.uninitialized());
		return NIL;
	}

	public static SubLObject pph_nl_generation_predP(final SubLObject obj, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		maybe_initialize_pph_generation_preds();
		return set.set_memberP(obj, $pph_generation_preds$.getGlobalValue());
	}

	public static SubLObject pph_pos_of_denotationP(final SubLObject lex, SubLObject specifically) {
		if (specifically == UNPROVIDED) {
			specifically = NIL;
		}
		if (NIL != assertion_handles.assertion_p(lex)) {
			return pph_pos_of_denotationP(assertions_high.assertion_formula(lex), specifically);
		}
		if (NIL == el_formula_p(lex)) {
			return NIL;
		}
		final SubLObject the_pred = cycl_utilities.formula_arg0(lex);
		SubLObject the_pos = NIL;
		if (NIL != pph_genl_pos_predP(the_pred, $$denotation, UNPROVIDED)) {
			the_pos = cycl_utilities.formula_arg2(lex, UNPROVIDED);
		} else if ((NIL != pph_genl_pos_predP(the_pred, $$multiWordString, UNPROVIDED)) || (NIL != pph_genl_pos_predP(the_pred, $$compoundString, UNPROVIDED))) {
			the_pos = cycl_utilities.formula_arg3(lex, UNPROVIDED);
		} else if (NIL != pph_genl_pos_predP(the_pred, $$headMedialString, UNPROVIDED)) {
			the_pos = cycl_utilities.formula_arg4(lex, UNPROVIDED);
		}

		return NIL != specifically ? pph_genl_posP(the_pos, specifically, UNPROVIDED) : the_pos;
	}

	public static SubLObject pph_nl_pred_listP(final SubLObject obj) {
		if (NIL == list_utilities.non_empty_list_p(obj)) {
			return NIL;
		}
		SubLObject bogusP = NIL;
		if (NIL == bogusP) {
			SubLObject csome_list_var = obj;
			SubLObject item = NIL;
			item = csome_list_var.first();
			while ((NIL == bogusP) && (NIL != csome_list_var)) {
				if ((NIL == pph_speech_part_predP(item)) && (NIL == pph_name_string_predP(item))) {
					bogusP = T;
				}
				csome_list_var = csome_list_var.rest();
				item = csome_list_var.first();
			}
		}
		return makeBoolean(NIL == bogusP);
	}

	public static SubLObject valid_external_pph_nl_predsP(final SubLObject obj) {
		if (obj.eql($ANY) || obj.eql($DEFAULT)) {
			return T;
		}
		return pph_nl_pred_listP(obj);
	}

	public static SubLObject valid_internal_pph_nl_predsP(final SubLObject obj) {
		return makeBoolean((obj != $DEFAULT) && (NIL != valid_external_pph_nl_predsP(obj)));
	}

	public static SubLObject pph_name_string_predP(final SubLObject obj) {
		return lexicon_vars.name_string_predP(obj);
	}

	public static SubLObject pph_speech_part_predP(final SubLObject obj) {
		return lexicon_accessors.speech_part_predP(obj, UNPROVIDED);
	}

	public static SubLObject pph_speech_partP(final SubLObject obj) {
		return lexicon_accessors.speech_partP(obj, UNPROVIDED);
	}

	public static SubLObject clear_pph_genl_categoryP() {
		final SubLObject cs = $pph_genl_categoryP_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_genl_categoryP(final SubLObject cat1, final SubLObject cat2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		return memoization_state.caching_state_remove_function_results_with_args($pph_genl_categoryP_caching_state$.getGlobalValue(), list(cat1, cat2, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_genl_categoryP_internal(final SubLObject cat1, final SubLObject cat2, final SubLObject mt) {
		if (cat1.equal(cat2)) {
			return T;
		}
		return makeBoolean((((NIL != cycl_utilities.expression_find_if(FORT_P, cat1, UNPROVIDED, UNPROVIDED)) && (NIL != cycl_utilities.expression_find_if(FORT_P, cat2, UNPROVIDED, UNPROVIDED))) && (((NIL == pph_genlP(cat1, $$SententialConstituent, UNPROVIDED)) || (NIL == pph_genlP(cat2, $$SententialConstituent, UNPROVIDED))) || lexicon_utilities.bar_level(cat1, mt).eql(lexicon_utilities.bar_level(cat2, mt))))
				&& (NIL != pph_genl_posP(pph_pos_of_category(cat1, mt), pph_pos_of_category(cat2, mt), mt)));
	}

	public static SubLObject pph_genl_categoryP(final SubLObject cat1, final SubLObject cat2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		SubLObject caching_state = $pph_genl_categoryP_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name($sym681$PPH_GENL_CATEGORY_, $sym683$_PPH_GENL_CATEGORY__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(cat1, cat2, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (cat1.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (cat2.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pph_genl_categoryP_internal(cat1, cat2, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cat1, cat2, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject clear_pph_pos_of_category() {
		final SubLObject cs = $pph_pos_of_category_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_pos_of_category(final SubLObject category, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		return memoization_state.caching_state_remove_function_results_with_args($pph_pos_of_category_caching_state$.getGlobalValue(), list(category, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_pos_of_category_internal(final SubLObject category, final SubLObject mt) {
		return lexicon_utilities.pos_of_cat(category, mt);
	}

	public static SubLObject pph_pos_of_category(final SubLObject category, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		SubLObject caching_state = $pph_pos_of_category_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(PPH_POS_OF_CATEGORY, $pph_pos_of_category_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(category, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (category.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pph_pos_of_category_internal(category, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(category, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_genl_posP(SubLObject pos1, SubLObject pos2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		pos1 = pph_possibly_nartify(pos1);
		pos2 = pph_possibly_nartify(pos2);
		if ((NIL != indexed_term_p(pos1)) && (NIL != indexed_term_p(pos2))) {
			return lexicon_accessors.genl_posP(pos1, pos2, mt);
		}
		return pph_genlP(pos1, pos2, mt);
	}

	public static SubLObject pph_np_category() {
		return $pph_np_category$.getGlobalValue();
	}

	public static SubLObject pph_npP(final SubLObject cat) {
		if (NIL == cat) {
			return NIL;
		}
		if (cat.eql(pph_np_category())) {
			return T;
		}
		if (cat.isKeyword()) {
			return NIL;
		}
		if ((NIL != pph_genlP(cat, $$NLPhrase, UNPROVIDED)) && (NIL != pph_genl_posP(pph_pos_of_category(cat, UNPROVIDED), $$Noun, UNPROVIDED))) {
			return T;
		}
		if (NIL != subl_promotions.memberP(cat, $list688, UNPROVIDED, UNPROVIDED)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_sP(final SubLObject cat) {
		if (NIL == cat) {
			return NIL;
		}
		if (cat.eql($$NLSentence)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_verbP(final SubLObject cat) {
		if (NIL == cat) {
			return NIL;
		}
		if (cat.eql($$Verb)) {
			return T;
		}
		if (NIL != pph_genl_posP(cat, $$Verb, UNPROVIDED)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_pp_category() {
		return $pph_pp_category$.getGlobalValue();
	}

	public static SubLObject pph_ppP(final SubLObject cat) {
		if (NIL == cat) {
			return NIL;
		}
		if (cat.eql(pph_pp_category())) {
			return T;
		}
		if (cat.isKeyword()) {
			return NIL;
		}
		if ((NIL != pph_genlP(cat, $$NLPhrase, UNPROVIDED)) && (NIL != pph_genl_posP(pph_pos_of_category(cat, UNPROVIDED), $$Preposition, UNPROVIDED))) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_adjpP(final SubLObject cat) {
		if (NIL == cat) {
			return NIL;
		}
		if (cat.isKeyword()) {
			return NIL;
		}
		if ((NIL != pph_genlP(cat, $$NLPhrase, UNPROVIDED)) && (NIL != pph_genl_posP(pph_pos_of_category(cat, UNPROVIDED), $$Adjective, UNPROVIDED))) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_adjP(final SubLObject cat) {
		if (NIL == cat) {
			return NIL;
		}
		if (cat.isKeyword()) {
			return NIL;
		}
		if (lexicon_utilities.bar_level(cat, UNPROVIDED).eql(ZERO_INTEGER) && (NIL != pph_genl_posP(pph_pos_of_category(cat, UNPROVIDED), $$Adjective, UNPROVIDED))) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_clauseP(final SubLObject category) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return pph_genl_categoryP(category, $$NLSentence, pph_vars.$pph_language_mt$.getDynamicValue(thread));
	}

	public static SubLObject pph_nbar_category() {
		return narts_high.find_nart($list7);
	}

	public static SubLObject pph_nbarP(final SubLObject category) {
		return lexicon_accessors.nbarP(category);
	}

	public static SubLObject pph_vbar_category() {
		return narts_high.find_nart($list693);
	}

	public static SubLObject pph_spec_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		return pph_genl_pos_predP(pred2, pred1, mt);
	}

	public static SubLObject pph_genl_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == mt) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue(thread);
		}
		return lexicon_accessors.genl_pos_predP(pred1, pred2, mt);
	}

	public static SubLObject pph_filter_preds(final SubLObject preds1, final SubLObject preds2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if ($ANY == preds1) {
			return preds2;
		}
		if ($ANY == preds2) {
			return preds1;
		}
		if ((NIL != list_utilities.singletonP(preds1)) && (NIL != list_utilities.singletonP(preds2))) {
			return pph_filter_two_preds_memoized(preds1.first(), preds2.first(), mt);
		}
		return pph_filter_preds_memoized(preds1, preds2, mt, UNPROVIDED);
	}

	public static SubLObject pph_filter_ordered_preds(final SubLObject preds1, final SubLObject preds2, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if ($ANY == preds1) {
			return preds2;
		}
		if ($ANY == preds2) {
			return preds1;
		}
		if ((NIL != list_utilities.singletonP(preds1)) && (NIL != list_utilities.singletonP(preds2))) {
			return pph_filter_two_preds_memoized(preds1.first(), preds2.first(), mt);
		}
		return pph_filter_preds_memoized(preds1, preds2, mt, NIL);
	}

	public static SubLObject pph_pred_licensed_by_predsP(final SubLObject pred, final SubLObject agr_preds) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject pred_okP = eq($ANY, agr_preds);
		if (NIL != list_utilities.proper_list_p(agr_preds)) {
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				if (NIL == pred_okP) {
					SubLObject csome_list_var;
					SubLObject agr_pred;
					for (csome_list_var = agr_preds, agr_pred = NIL, agr_pred = csome_list_var.first(); (NIL == pred_okP) && (NIL != csome_list_var); pred_okP = pph_pred_licensed_by_predP(pred, agr_pred, UNPROVIDED), csome_list_var = csome_list_var.rest(), agr_pred = csome_list_var.first()) {
					}
				}
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		}
		return pred_okP;
	}

	public static SubLObject pph_pred_licensed_by_predP(final SubLObject actual_pred, final SubLObject specified_pred, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		return makeBoolean(actual_pred.eql(specified_pred) || (NIL != member(actual_pred, pph_filter_two_preds_memoized(actual_pred, specified_pred, mt), UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject pph_filter_two_preds_memoized_internal(final SubLObject pred1, final SubLObject pred2, final SubLObject mt) {
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
			format_nil.force_format(T, $str695$__Filtering_preds__S_and__S___, pred1, pred2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		final SubLObject filtered_preds = lexicon_utilities.filter_two_lexicon_preds(pred1, pred2, mt);
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
			format_nil.force_format(T, $str696$__max_floor_preds___S___, filtered_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return filtered_preds;
	}

	public static SubLObject pph_filter_two_preds_memoized(final SubLObject pred1, final SubLObject pred2, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_filter_two_preds_memoized_internal(pred1, pred2, mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FILTER_TWO_PREDS_MEMOIZED, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FILTER_TWO_PREDS_MEMOIZED, THREE_INTEGER, $int$128, EQL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_FILTER_TWO_PREDS_MEMOIZED, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(pred1, pred2, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (pred1.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (pred2.eql(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_filter_two_preds_memoized_internal(pred1, pred2, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred1, pred2, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_filter_preds_memoized_internal(final SubLObject preds1, final SubLObject preds2, final SubLObject mt, SubLObject remove_subsumed_itemsP) {
		if (remove_subsumed_itemsP == UNPROVIDED) {
			remove_subsumed_itemsP = T;
		}
		final SubLObject filtered_preds = lexicon_utilities.filter_lexicon_preds(preds1, preds2, mt, remove_subsumed_itemsP);
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
			format_nil.force_format(T, $str696$__max_floor_preds___S___, filtered_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return filtered_preds;
	}

	public static SubLObject pph_filter_preds_memoized(final SubLObject preds1, final SubLObject preds2, final SubLObject mt, SubLObject remove_subsumed_itemsP) {
		if (remove_subsumed_itemsP == UNPROVIDED) {
			remove_subsumed_itemsP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return pph_filter_preds_memoized_internal(preds1, preds2, mt, remove_subsumed_itemsP);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FILTER_PREDS_MEMOIZED, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FILTER_PREDS_MEMOIZED, FOUR_INTEGER, $int$128, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PPH_FILTER_PREDS_MEMOIZED, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_4(preds1, preds2, mt, remove_subsumed_itemsP);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (preds1.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (preds2.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (mt.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (((NIL != cached_args) && (NIL == cached_args.rest())) && remove_subsumed_itemsP.equal(cached_args.first())) {
								return memoization_state.caching_results(results2);
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_filter_preds_memoized_internal(preds1, preds2, mt, remove_subsumed_itemsP)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(preds1, preds2, mt, remove_subsumed_itemsP));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_max_spec_speech_part_preds(final SubLObject preds, SubLObject mt, SubLObject sort_by_preferednessP) {
		if (mt == UNPROVIDED) {
			mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (sort_by_preferednessP == UNPROVIDED) {
			sort_by_preferednessP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject spec_preds = NIL;
		spec_preds = lexicon_accessors.speech_part_pred_max_floors(preds, mt);
		if (NIL != sort_by_preferednessP) {
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt, thread);
				spec_preds = Sort.sort(spec_preds, symbol_function($sym698$PPH_PREFER_POS_PRED_), UNPROVIDED);
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		}
		return spec_preds;
	}

	public static SubLObject pph_union_preds(final SubLObject preds1, final SubLObject preds2) {
		if ($ANY == preds1) {
			return $ANY;
		}
		if ($ANY == preds2) {
			return $ANY;
		}
		return delete_duplicates(append(preds1, preds2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_unify_speech_part_preds(final SubLObject preds) {
		final SubLObject max_specs = pph_max_spec_speech_part_preds(preds, UNPROVIDED, UNPROVIDED);
		final SubLObject unsubsumed = list_utilities.remove_subsumed_items(max_specs, $sym699$PPH_SPEC_POS_PRED_, UNPROVIDED);
		return NIL != list_utilities.singletonP(unsubsumed) ? unsubsumed.first() : NIL;
	}

	public static SubLObject pph_unify_speech_part_preds_or_choose(final SubLObject pred1, final SubLObject pred2) {
		final SubLObject unified = pph_unify_speech_part_preds(list(pred1, pred2));
		return NIL != unified ? unified : pred1;
	}

	public static SubLObject pph_convert_required_nl_preds_to_preferred(SubLObject nl_preds) {
		if (nl_preds.isList()) {
			nl_preds = cconcatenate(nl_preds, $pph_failsafe_nl_preds$.getGlobalValue());
		}
		return nl_preds;
	}

	public static SubLObject pph_default_agr_preds_for_type_pred() {
		SubLObject stored = $pph_default_agr_preds_for_type_pred$.getGlobalValue();
		if (NIL == stored) {
			final SubLObject looked_up = constants_high.find_constant($str701$defaultAgreementPredsForInstanceL);
			if (NIL != valid_constantP(looked_up, UNPROVIDED)) {
				stored = looked_up;
			}
		}
		return stored;
	}

	public static SubLObject pph_default_nl_preds_for_type_list(final SubLObject collection, SubLObject language_mt) {
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLObject pred = pph_default_agr_preds_for_type_pred();
		final SubLObject el_list = (NIL != pred) ? pph_removal_ask_variable($sym702$_PREDS, make_binary_formula(pred, collection, $sym702$_PREDS), language_mt, UNPROVIDED).first() : NIL;
		return NIL != el_list ? el_list_items(el_list) : $list455;
	}

	public static SubLObject pph_default_nl_preds(final SubLObject v_object, SubLObject force, SubLObject language_mt, SubLObject domain_mt) {
		if (force == UNPROVIDED) {
			force = $NONE;
		}
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		final SubLObject pcase_var = force;
		if (pcase_var.eql($QUESTION) || pcase_var.eql($INTERROGATIVE)) {
			return pph_question.pph_default_question_preds();
		}
		return pph_default_nl_preds_for_term(v_object);
	}

	public static SubLObject pph_adjust_nl_preds_for_mt_scope(final SubLObject v_object, SubLObject nl_preds) {
		final SubLObject mt_scope = pph_mt_scope(v_object);
		if (NIL != pph_mt_scope_p(mt_scope)) {
			SubLObject filtered_nl_preds = pph_tensed_preds_for_mt_scope(mt_scope, nl_preds, UNPROVIDED);
			if (NIL == valid_internal_pph_nl_predsP(filtered_nl_preds)) {
				filtered_nl_preds = $ANY;
			}
			nl_preds = filtered_nl_preds;
		}
		return nl_preds;
	}

	public static SubLObject pph_language_mt_from_code(final SubLObject language_code) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject pph_root_mt = get_pph_mt_for_code(language_code);
		return NIL != pph_root_mt ? pph_vars.maybe_temporally_qualify_pph_language_mt(pph_root_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread);
	}

	public static SubLObject get_pph_mt_for_code(final SubLObject language_code) {
		final SubLObject language = lexicon_utilities.get_language_for_code(language_code);
		final SubLObject pph_mt = (NIL != language) ? pph_removal_ask_variable($sym704$_ROOT_MT, list($$paraphraseRootMtForLanguage, $sym704$_ROOT_MT, language), $$InferencePSC, UNPROVIDED).first() : NIL;
		if (NIL != pph_mt) {
			return pph_mt;
		}
		final SubLObject validated_lexical_mts = pph_removal_ask_variable($sym706$_MT, listS($$validatedLexicalMtsForLanguage, language, $list708), $$InferencePSC, UNPROVIDED);
		return NIL != list_utilities.empty_list_p(validated_lexical_mts) ? NIL : hlmt_czer.canonicalize_hlmt(make_el_formula($$MtUnionFn, validated_lexical_mts, UNPROVIDED));
	}

	public static SubLObject pph_guess_spp_for_string(final SubLObject string) {
		final SubLObject new_agr = (NIL != morphology.plural_nounP(string)) ? $$plural_Generic : $$nonPlural_Generic;
		if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
			format_nil.force_format(T, $str710$__Based_on_morphology__using_new_, new_agr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return new_agr;
	}

	public static SubLObject pph_switch_arg1_and_arg2(final SubLObject tree) {
		final SubLObject temp1 = subst($ASDF, $ARG1, tree, UNPROVIDED, UNPROVIDED);
		final SubLObject temp2 = subst($ARG1, $ARG2, temp1, UNPROVIDED, UNPROVIDED);
		final SubLObject result = subst($ARG2, $ASDF, temp2, UNPROVIDED, UNPROVIDED);
		return result;
	}

	public static SubLObject genformat_arg_fixed_matches_argsP(final SubLObject as, final SubLObject args) {
		if (NIL != assertions_high.gaf_assertionP(as)) {
			final SubLObject fixed_arg_num = assertions_high.gaf_arg2(as);
			final SubLObject fixed_arg = assertions_high.gaf_arg3(as);
			final SubLObject nth_arg = nth(subtract(fixed_arg_num, ONE_INTEGER), args);
			return makeBoolean((NIL == cycl_grammar.cycl_variable_p(nth_arg)) && (NIL != czer_utilities.equals_elP(fixed_arg, nth_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
		}
		return NIL;
	}

	public static SubLObject pph_special_handling_availableP(final SubLObject formula) {
		if (NIL != pph_templates.formula_has_gen_template_constrainedP(formula)) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str713$____genTemplate_Constrained_is_av, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			return T;
		}
		if (NIL != pph_templates.pph_formula_has_gf_arg_fixedP(formula)) {
			if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
				format_nil.force_format(T, $str714$____genFormat_ArgFixed_is_availab, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_formula_with_dotsP(final SubLObject formula) {
		return makeBoolean((NIL != el_formula_p(formula)) && (NIL != cycl_utilities.formula_find_if($sym715$FORMULA_WITH_SEQUENCE_TERM_, formula, UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject pph_mapcar(final SubLObject function, final SubLObject list) {
		if (NIL == list) {
			return NIL;
		}
		if (NIL != list_utilities.proper_list_p(list)) {
			return Mapping.mapcar(function, list);
		}
		return list_utilities.ndot_last(Mapping.mapcar(function, list_utilities.undot(list)));
	}

	public static SubLObject pph_example_formulas(final SubLObject reln) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			ans = (NIL != fort_types_interface.predicateP(reln)) ? kb_mapping_utilities.pred_values(reln, $$examplePredSentences, UNPROVIDED, UNPROVIDED, UNPROVIDED) : kb_mapping_utilities.pred_values(reln, $$exampleNATs, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject pph_arity(final SubLObject reln) {
		final SubLObject v_arity = arity.arity(reln);
		return NIL != v_arity ? v_arity : NIL != cycl_grammar.cycl_denotational_term_p(reln) ? pph_ask_variable_new($sym718$_ARITY, listS($$arity, reln, $list720), $$InferencePSC, $list721).first() : NIL;
	}

	public static SubLObject pph_dummy_formula(final SubLObject reln, SubLObject optimize_namesP) {
		if (optimize_namesP == UNPROVIDED) {
			optimize_namesP = NIL;
		}
		SubLObject formula_args = NIL;
		final SubLObject v_arity = pph_arity(reln);
		final SubLObject arity_min = arity.arity_min(reln);
		final SubLObject arity_max = arity.arity_max(reln);
		SubLObject formula_arity = NIL;
		if (v_arity.isInteger()) {
			formula_arity = v_arity;
		} else if (arity_max.isInteger()) {
			formula_arity = arity_max;
		} else if (arity_min.isInteger()) {
			formula_arity = number_utilities.maximum(list(arity_min, TWO_INTEGER), UNPROVIDED);
		}

		if (formula_arity.isInteger()) {
			SubLObject i;
			SubLObject generic_arg;
			SubLObject var;
			for (i = NIL, i = ZERO_INTEGER; i.numL(formula_arity); i = add(i, ONE_INTEGER)) {
				generic_arg = at_utilities.get_generic_arg(number_utilities.f_1X(i));
				var = cycl_variables.make_el_var(symbol_name(generic_arg));
				formula_args = cons(var, formula_args);
			}
		}
		SubLObject dummy_formula = make_el_formula(reln, nreverse(formula_args), UNPROVIDED);
		if (NIL != optimize_namesP) {
			dummy_formula = optimize_el_formula_variable_names(dummy_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return cycl_utilities.formula_transform(dummy_formula, $sym297$EL_VAR_, EL_VAR_TO_KEYWORD, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject el_var_to_keyword(final SubLObject el_var) {
		return make_keyword(cycl_variables.el_var_name_without_prefix(el_var));
	}

	public static SubLObject pph_agr_constraint_typeP(final SubLObject obj) {
		return subl_promotions.memberP(obj, $pph_agr_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_inheritable_agr_constraint_typeP(final SubLObject obj) {
		return subl_promotions.memberP(obj, $pph_inheritable_agr_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_absolute_agr_constraint_typeP(final SubLObject obj) {
		return subl_promotions.memberP(obj, $pph_absolute_agr_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_relative_agr_constraint_typeP(final SubLObject obj) {
		return subl_promotions.memberP(obj, $pph_relative_agr_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_relative_agr_constraint_types() {
		return $pph_relative_agr_constraint_types$.getGlobalValue();
	}

	public static SubLObject new_pph_agr_constraint(final SubLObject type, final SubLObject target) {
		return cons(type, target);
	}

	public static SubLObject new_pph_dont_care_agr_constraint() {
		return new_pph_agr_constraint($DONT_CARE, NIL);
	}

	public static SubLObject new_pph_impossible_agr_constraint() {
		return new_pph_agr_constraint($IMPOSSIBLE, NIL);
	}

	public static SubLObject pph_agr_constraint_p(final SubLObject obj) {
		return makeBoolean(obj.isCons() && (NIL != pph_agr_constraint_typeP(obj.first())));
	}

	public static SubLObject pph_inheritable_agr_constraint_p(final SubLObject obj) {
		return makeBoolean(obj.isCons() && (NIL != pph_inheritable_agr_constraint_typeP(obj.first())));
	}

	public static SubLObject pph_absolute_agr_constraint_p(final SubLObject obj) {
		return makeBoolean(obj.isCons() && (NIL != pph_absolute_agr_constraint_typeP(obj.first())));
	}

	public static SubLObject pph_relative_agr_constraint_p(final SubLObject obj) {
		return makeBoolean((obj == NIL) || (obj.isCons() && (NIL != pph_relative_agr_constraint_typeP(obj.first()))));
	}

	public static SubLObject pph_dont_care_agr_constraint_p(final SubLObject obj) {
		return makeBoolean(obj.isCons() && (pph_agr_constraint_type(obj) == $DONT_CARE));
	}

	public static SubLObject pph_impossible_agr_constraint_p(final SubLObject obj) {
		return makeBoolean(obj.isCons() && (pph_agr_constraint_type(obj) == $IMPOSSIBLE));
	}

	public static SubLObject pph_peer_agr_constraint_p(final SubLObject obj) {
		return makeBoolean(obj.isCons() && (pph_agr_constraint_type(obj) == $PEER));
	}

	public static SubLObject pph_agr_constraint_type(final SubLObject agr_constraint) {
		return agr_constraint.first();
	}

	public static SubLObject pph_agr_constraint_target(final SubLObject agr_constraint) {
		return agr_constraint.rest();
	}

	public static SubLObject pph_agr_constraint_set_target(final SubLObject agr_constraint, final SubLObject target) {
		rplacd(agr_constraint, target);
		return agr_constraint;
	}

	public static SubLObject pph_agr_constraint_set_type(final SubLObject agr_constraint, final SubLObject type) {
		rplaca(agr_constraint, type);
		return type;
	}

	public static SubLObject pph_agr_constraint_copy(final SubLObject agr_constraint, SubLObject copied_phrases) {
		if (copied_phrases == UNPROVIDED) {
			copied_phrases = NIL;
		}
		return new_pph_agr_constraint(pph_agr_constraint_type(agr_constraint), pph_agr_constraint_target_copy(pph_agr_constraint_target(agr_constraint), copied_phrases));
	}

	public static SubLObject pph_agr_constraint_target_copy(final SubLObject agr_constraint_target, SubLObject copied_phrases) {
		if (copied_phrases == UNPROVIDED) {
			copied_phrases = NIL;
		}
		if (NIL != pph_nth_phrase_p(agr_constraint_target)) {
			return new_pph_nth_phrase(pph_nth_phrase_num(agr_constraint_target), pph_nth_phrase_constraints(agr_constraint_target));
		}
		if (NIL != pph_phrase.pph_phrase_p(agr_constraint_target, UNPROVIDED)) {
			return pph_phrase.pph_phrase_copy_int(agr_constraint_target, copied_phrases, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return agr_constraint_target;
	}

	public static SubLObject pph_index_attrP(final SubLObject obj) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return isa.isaP(obj, $$NLIndexAttribute, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED);
	}

	public static SubLObject pph_open_tag_grep_regex() {
		return $pph_open_tag_grep_regex$.getGlobalValue();
	}

	public static SubLObject pph_close_tag_grep_regex() {
		return $pph_close_tag_grep_regex$.getGlobalValue();
	}

	public static SubLObject pph_regex_availableP() {
		if ($UNKNOWN == $pph_regex_availableP$.getGlobalValue()) {
			$pph_regex_availableP$.setGlobalValue(makeBoolean((NIL != regular_expressions.is_regular_expressions_support_availableP()) && (NIL != pph_regex_behaves_as_expectedP())));
		}
		return $pph_regex_availableP$.getGlobalValue();
	}

	public static SubLObject pph_regex_behaves_as_expectedP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		SubLObject error = NIL;
		final SubLObject form = $list732;
		final SubLObject right_answer = $list733;
		SubLObject result = NIL;
		try {
			thread.throwStack.push($catch_error_message_target$.getGlobalValue());
			final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
				try {
					result = eval(form);
				} catch (final Throwable catch_var) {
					Errors.handleThrowable(catch_var, NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (final Throwable ccatch_env_var) {
			error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
		} finally {
			thread.throwStack.pop();
		}
		if (error.isString()) {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn(error);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
		} else if (!result.equal(right_answer)) {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str734$Regex_is_not_behaving_as_expected, form, result, right_answer);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
		} else {
			ans = T;
		}

		return ans;
	}

	public static SubLObject pph_closed_html_tagsP(final SubLObject open, final SubLObject close) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject badP = NIL;
		if (NIL != pph_regex_availableP()) {
			SubLObject open_tags = NIL;
			SubLObject close_tags = NIL;
			thread.resetMultipleValues();
			final SubLObject open_tags_$130 = pph_html_open_tags_in_string(open);
			final SubLObject badP_$131 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			open_tags = open_tags_$130;
			badP = badP_$131;
			if (NIL == badP) {
				thread.resetMultipleValues();
				final SubLObject close_tags_$132 = pph_html_close_tags_in_string(close);
				final SubLObject badP_$132 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				close_tags = close_tags_$132;
				badP = badP_$132;
				if (NIL == badP) {
					badP = makeBoolean(NIL == list_utilities.same_length_p(open_tags, close_tags));
					if (NIL == badP) {
						SubLObject csome_list_var = open_tags;
						SubLObject open_tag = NIL;
						open_tag = csome_list_var.first();
						while ((NIL == badP) && (NIL != csome_list_var)) {
							if (NIL == subl_promotions.memberP(open_tag, close_tags, $sym735$PPH_HTML_TAG_MATCH_, UNPROVIDED)) {
								badP = T;
							}
							csome_list_var = csome_list_var.rest();
							open_tag = csome_list_var.first();
						}
					}
				}
			}
		} else {
			badP = T;
		}
		return makeBoolean(NIL == badP);
	}

	public static SubLObject pph_html_open_tags_in_string(final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject tags = NIL;
		SubLObject errorP = NIL;
		final SubLObject open_regex = pph_open_tag_grep_regex();
		if (NIL != regular_expressions.regex_p(open_regex)) {
			SubLObject error_message = NIL;
			try {
				thread.throwStack.push($catch_error_message_target$.getGlobalValue());
				final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
				try {
					Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
					try {
						tags = regular_expression_utilities.find_all_matches_for_regular_expression(open_regex, string, $list736, UNPROVIDED);
					} catch (final Throwable catch_var) {
						Errors.handleThrowable(catch_var, NIL);
					}
				} finally {
					Errors.$error_handler$.rebind(_prev_bind_0, thread);
				}
			} catch (final Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
			} finally {
				thread.throwStack.pop();
			}
			if (NIL != error_message) {
				if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
					Errors.warn($str737$Regex_error_finding_open_tags____, error_message);
					force_output(StreamsLow.$error_output$.getDynamicValue(thread));
				}
				errorP = T;
			}
		} else {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str738$Don_t_have_valid_grep_patterns_fo);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
			errorP = T;
		}
		return values(tags, errorP);
	}

	public static SubLObject pph_html_close_tags_in_string(final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject tags = NIL;
		SubLObject errorP = NIL;
		final SubLObject close_regex = pph_close_tag_grep_regex();
		if (NIL != regular_expressions.regex_p(close_regex)) {
			SubLObject error_message = NIL;
			try {
				thread.throwStack.push($catch_error_message_target$.getGlobalValue());
				final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
				try {
					Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
					try {
						tags = regular_expression_utilities.find_all_matches_for_regular_expression(close_regex, string, $list736, UNPROVIDED);
					} catch (final Throwable catch_var) {
						Errors.handleThrowable(catch_var, NIL);
					}
				} finally {
					Errors.$error_handler$.rebind(_prev_bind_0, thread);
				}
			} catch (final Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
			} finally {
				thread.throwStack.pop();
			}
			if (NIL != error_message) {
				if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
					Errors.warn($str739$Regex_error_finding_close_tags___, error_message);
					force_output(StreamsLow.$error_output$.getDynamicValue(thread));
				}
				errorP = T;
			}
		} else {
			if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
				Errors.warn($str738$Don_t_have_valid_grep_patterns_fo);
				force_output(StreamsLow.$error_output$.getDynamicValue(thread));
			}
			errorP = T;
		}
		return values(tags, errorP);
	}

	public static SubLObject pph_html_tag_matchP(final SubLObject open, final SubLObject close) {
		final SubLObject open_stop = number_utilities.minimum(remove(NIL, list(position(CHAR_space, open, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), position(CHAR_greater, open, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
		final SubLObject close_stop = number_utilities.minimum(remove(NIL, list(position(CHAR_space, close, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), position(CHAR_greater, close, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
		return search(open, close, symbol_function(EQUALP), symbol_function(IDENTITY), ONE_INTEGER, open_stop, ONE_INTEGER, close_stop);
	}

	public static SubLObject pph_arg_position_p(final SubLObject obj) {
		return makeBoolean((NIL != pph_unknown_arg_position_p(obj)) || (NIL != pph_known_arg_position_p(obj)));
	}

	public static SubLObject pph_known_arg_position_p(final SubLObject obj) {
		return pph_list_ofP(symbol_function(NON_NEGATIVE_INTEGER_P), obj);
	}

	public static SubLObject pph_unknown_arg_position() {
		return $pph_unknown_arg_position$.getGlobalValue();
	}

	public static SubLObject pph_unknown_arg_position_p(final SubLObject obj) {
		return eq(obj, $pph_unknown_arg_position$.getGlobalValue());
	}

	public static SubLObject pph_arg_position_prefix_p(final SubLObject obj) {
		return makeBoolean((NIL == obj) || (NIL != pph_arg_position_p(obj)));
	}

	public static SubLObject pph_arg_position_mapping_p(final SubLObject obj) {
		return makeBoolean((obj.isCons() && (NIL != pph_arg_position_p(obj.first()))) && (NIL != pph_arg_position_p(obj.rest())));
	}

	public static SubLObject pph_new_empty_map() {
		return NIL;
	}

	public static SubLObject pph_empty_map_p(final SubLObject obj) {
		return sublisp_null(obj);
	}

	public static SubLObject pph_add_mapping(SubLObject map, final SubLObject from_prefix, final SubLObject to_prefix) {
		if (NIL == pph_map_has_more_general_from_prefixP(map, from_prefix)) {
			map = list_utilities.alist_enter(map, from_prefix, to_prefix, symbol_function(EQUAL));
		}
		return map;
	}

	public static SubLObject pph_map_has_more_general_from_prefixP(final SubLObject map, final SubLObject from_prefix) {
		return makeBoolean(NIL == pph_unknown_arg_position_p(pph_arg_position_lookup(from_prefix, map)));
	}

	public static SubLObject pph_prefix_no_more_generalP(final SubLObject p1, final SubLObject p2) {
		return makeBoolean(NIL == pph_prefix_more_generalP(p1, p2));
	}

	public static SubLObject pph_prefix_more_generalP(final SubLObject p1, final SubLObject p2) {
		if (NIL != list_utilities.greater_length_p(p2, p1)) {
			return T;
		}
		if (p1.equal(p2)) {
			return NIL;
		}
		if (NIL != pph_arg_position_subsumesP(p2, p1, UNPROVIDED)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject pph_prefix_map_p(final SubLObject obj) {
		return makeBoolean(((NIL != pph_arg_position_map_p(obj)) && (NIL != list_utilities.singletonP(obj))) && (NIL == caar(obj)));
	}

	public static SubLObject pph_new_prefix_map(final SubLObject to_prefix) {
		return pph_add_mapping(pph_new_empty_map(), NIL, to_prefix);
	}

	public static SubLObject pph_identity_map() {
		if ($pph_identity_map$.getGlobalValue().isKeyword()) {
			$pph_identity_map$.setGlobalValue(pph_new_prefix_map(NIL));
		}
		return $pph_identity_map$.getGlobalValue();
	}

	public static SubLObject pph_identity_map_p(final SubLObject obj) {
		return equal(obj, pph_identity_map());
	}

	public static SubLObject pph_new_identity_map() {
		return pph_arg_position_map_copy(pph_identity_map());
	}

	public static SubLObject pph_prefix_map_prefix(final SubLObject map) {
		return map.first().rest();
	}

	public static SubLObject pph_arg_position_map_p(final SubLObject obj) {
		if (NIL == list_utilities.alist_p(obj)) {
			return NIL;
		}
		if (NIL != find_if(symbol_function(ATOM), obj, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			return NIL;
		}
		SubLObject cdolist_list_var = obj;
		SubLObject cons = NIL;
		cons = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = cons;
			SubLObject from_prefix = NIL;
			SubLObject to_prefix = NIL;
			destructuring_bind_must_consp(current, datum, $list742);
			from_prefix = current.first();
			current = to_prefix = current.rest();
			if ((NIL == pph_arg_position_prefix_p(from_prefix)) || (NIL == pph_arg_position_prefix_p(to_prefix))) {
				return NIL;
			}
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		return T;
	}

	public static SubLObject pph_arg_position_map_copy(final SubLObject old_map) {
		return copy_list(old_map);
	}

	public static SubLObject pph_figure_new_arg_position_map(final SubLObject old_map, final SubLObject template) {
		if (NIL != pph_empty_map_p(old_map)) {
			return old_map;
		}
		if (NIL != pph_arg_position_specifierP(template)) {
			final SubLObject arg_position = pph_arg_position_from_template(template);
			if (NIL != pph_prefix_map_p(old_map)) {
				return pph_new_prefix_map(append(pph_prefix_map_prefix(old_map), arg_position));
			}
			SubLObject new_map = pph_new_empty_map();
			SubLObject cdolist_list_var = old_map;
			SubLObject cons = NIL;
			cons = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject current;
				final SubLObject datum = current = cons;
				SubLObject from_prefix = NIL;
				SubLObject to_prefix = NIL;
				destructuring_bind_must_consp(current, datum, $list742);
				from_prefix = current.first();
				current = to_prefix = current.rest();
				if (from_prefix.equal(arg_position)) {
					return pph_new_prefix_map(to_prefix);
				}
				if (NIL != pph_arg_position_subsumesP(from_prefix, arg_position, UNPROVIDED)) {
					final SubLObject new_from = nthcdr(length(arg_position), from_prefix);
					new_map = pph_add_mapping(new_map, new_from, to_prefix);
				} else if (NIL != pph_arg_position_subsumesP(arg_position, from_prefix, UNPROVIDED)) {
					final SubLObject new_to = pph_arg_position_lookup(arg_position, old_map);
					if (NIL != new_to) {
						new_map = pph_add_mapping(new_map, NIL, new_to);
					}
				}

				cdolist_list_var = cdolist_list_var.rest();
				cons = cdolist_list_var.first();
			}
			return new_map;
		} else {
			if (NIL == list_utilities.proper_list_p(template)) {
				return NIL;
			}
			SubLObject new_maps = NIL;
			SubLObject non_trivialP = makeBoolean(NIL == pph_identity_map_p(old_map));
			SubLObject list_var = NIL;
			SubLObject arg = NIL;
			SubLObject argnum = NIL;
			list_var = template;
			arg = list_var.first();
			for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = add(ONE_INTEGER, argnum)) {
				if (NIL != list_utilities.tree_find_if($sym329$PPH_ARG_POSITION_SPECIFIER_, arg, UNPROVIDED)) {
					final SubLObject my_pos = list(argnum);
					final SubLObject my_map = pph_figure_new_arg_position_map(old_map, arg);
					new_maps = cons(pph_contextualize_map(my_pos, my_map), new_maps);
					if ((NIL == non_trivialP) && (!my_pos.equal(pph_arg_position_from_template(arg)))) {
						non_trivialP = T;
					}
				} else {
					non_trivialP = T;
				}
			}
			if (NIL != non_trivialP) {
				return pph_combine_maps(new_maps);
			}
			return old_map;
		}
	}

	public static SubLObject pph_combine_maps(final SubLObject maps) {
		SubLObject new_map = pph_new_empty_map();
		SubLObject cdolist_list_var = maps;
		SubLObject map = NIL;
		map = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$134 = map;
			SubLObject cons = NIL;
			cons = cdolist_list_var_$134.first();
			while (NIL != cdolist_list_var_$134) {
				SubLObject current;
				final SubLObject datum = current = cons;
				SubLObject from_prefix = NIL;
				SubLObject to_prefix = NIL;
				destructuring_bind_must_consp(current, datum, $list742);
				from_prefix = current.first();
				current = to_prefix = current.rest();
				new_map = pph_add_mapping(new_map, from_prefix, to_prefix);
				cdolist_list_var_$134 = cdolist_list_var_$134.rest();
				cons = cdolist_list_var_$134.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			map = cdolist_list_var.first();
		}
		return new_map;
	}

	public static SubLObject pph_contextualize_map(final SubLObject v_context, final SubLObject map) {
		if (NIL != pph_prefix_map_p(map)) {
			return pph_add_mapping(pph_new_empty_map(), v_context, pph_prefix_map_prefix(map));
		}
		SubLObject new_map = pph_new_empty_map();
		SubLObject cdolist_list_var = map;
		SubLObject cons = NIL;
		cons = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = cons;
			SubLObject from_prefix = NIL;
			SubLObject to_prefix = NIL;
			destructuring_bind_must_consp(current, datum, $list742);
			from_prefix = current.first();
			current = to_prefix = current.rest();
			new_map = pph_add_mapping(new_map, pph_contextualize_arg_position(v_context, from_prefix), to_prefix);
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		return new_map;
	}

	public static SubLObject pph_contextualize_arg_position(final SubLObject v_context, final SubLObject arg_position) {
		if (NIL != pph_unknown_arg_position_p(arg_position)) {
			return arg_position;
		}
		return append(v_context, arg_position);
	}

	public static SubLObject pph_contextualize_output_item_arg_position(final SubLObject v_context, final SubLObject output_item) {
		final SubLObject local_arg_position = pph_data_structures.pph_phrase_output_item_arg_position(output_item);
		final SubLObject global_arg_position = pph_contextualize_arg_position(v_context, local_arg_position);
		pph_data_structures.pph_phrase_output_item_set_arg_position(output_item, global_arg_position);
		return output_item;
	}

	public static SubLObject pph_arg_position_precedesP(final SubLObject earlier, final SubLObject later) {
		SubLObject earlier_arg_num = NIL;
		SubLObject earlier_arg_num_$135 = NIL;
		SubLObject later_arg_num = NIL;
		SubLObject later_arg_num_$136 = NIL;
		earlier_arg_num = earlier;
		earlier_arg_num_$135 = earlier_arg_num.first();
		later_arg_num = later;
		later_arg_num_$136 = later_arg_num.first();
		while ((NIL != later_arg_num) || (NIL != earlier_arg_num)) {
			if (earlier_arg_num_$135.numL(later_arg_num_$136)) {
				return T;
			}
			if (later_arg_num_$136.numL(earlier_arg_num_$135)) {
				return NIL;
			}
			earlier_arg_num = earlier_arg_num.rest();
			earlier_arg_num_$135 = earlier_arg_num.first();
			later_arg_num = later_arg_num.rest();
			later_arg_num_$136 = later_arg_num.first();
		}
		return NIL;
	}

	public static SubLObject pph_arg_position_subsumesP(final SubLObject specific, final SubLObject general, SubLObject properP) {
		if (properP == UNPROVIDED) {
			properP = NIL;
		}
		if ((NIL != pph_unknown_arg_position_p(specific)) || (NIL != pph_unknown_arg_position_p(general))) {
			return NIL;
		}
		SubLObject spec = NIL;
		SubLObject spec_$137 = NIL;
		SubLObject gen = NIL;
		SubLObject gen_$138 = NIL;
		spec = specific;
		spec_$137 = spec.first();
		gen = general;
		gen_$138 = gen.first();
		while ((NIL != gen) || (NIL != spec)) {
			if (spec_$137.eql(gen_$138)) {
				spec = spec.rest();
				spec_$137 = spec.first();
				gen = gen.rest();
				gen_$138 = gen.first();
			} else {
				if (NIL == gen_$138) {
					return T;
				}
				return NIL;
			}
		}
		return makeBoolean(NIL == properP);
	}

	public static SubLObject pph_nested_arg_position(final SubLObject item) {
		final SubLObject old_rest = item.rest();
		return NIL != list_utilities.singletonP(old_rest) ? old_rest.first() : old_rest;
	}

	public static SubLObject clear_pph_arg_position_lookup() {
		final SubLObject cs = $pph_arg_position_lookup_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_pph_arg_position_lookup(final SubLObject local_arg_position, final SubLObject map) {
		return memoization_state.caching_state_remove_function_results_with_args($pph_arg_position_lookup_caching_state$.getGlobalValue(), list(local_arg_position, map), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_arg_position_lookup_internal(final SubLObject local_arg_position, final SubLObject map) {
		final SubLObject mapping = pph_arg_position_find_mapping(local_arg_position, map);
		if (NIL == mapping) {
			return pph_unknown_arg_position();
		}
		SubLObject current;
		final SubLObject datum = current = mapping;
		SubLObject from_prefix = NIL;
		SubLObject to_prefix = NIL;
		destructuring_bind_must_consp(current, datum, $list742);
		from_prefix = current.first();
		current = to_prefix = current.rest();
		return pph_add_prefix(to_prefix, pph_remove_prefix(from_prefix, local_arg_position));
	}

	public static SubLObject pph_arg_position_lookup(final SubLObject local_arg_position, final SubLObject map) {
		SubLObject caching_state = $pph_arg_position_lookup_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(PPH_ARG_POSITION_LOOKUP, $pph_arg_position_lookup_caching_state$, $int$256, EQUAL, TWO_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(local_arg_position, map);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (local_arg_position.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && map.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pph_arg_position_lookup_internal(local_arg_position, map)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(local_arg_position, map));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject pph_top_level_arg_position(final SubLObject map) {
		return pph_arg_position_lookup(NIL, map);
	}

	public static SubLObject pph_arg_position_find_mapping(final SubLObject local_arg_position, final SubLObject map) {
		return assoc(local_arg_position, map, $sym745$PPH_ARG_POSITION_SUBSUMES_, UNPROVIDED);
	}

	public static SubLObject pph_remove_prefix(final SubLObject prefix, final SubLObject arg_position) {
		return nthcdr(length(prefix), arg_position);
	}

	public static SubLObject pph_add_prefix(final SubLObject prefix, final SubLObject arg_position) {
		return append(prefix, arg_position);
	}

	public static SubLObject test_medical_variable_name_optimization(final SubLObject var, final SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
		try {
			pph_vars.$pph_domain_mt$.bind($$MedicalResearchCAEGuidanceMt, thread);
			return pph_optimize_formula_variable_name(var, narts_high.nart_substitute(formula), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
			pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
		}
	}

	public static SubLObject test_nconcatenate_pph_javalists(final SubLObject strings, final SubLObject preserve_arg_positions_for_lists) {
		final SubLObject javalists = Mapping.mapcar(GENERATE_PHRASE_FOR_JAVA, strings);
		final SubLObject combined_javalist = nconcatenate_pph_javalists(javalists, preserve_arg_positions_for_lists);
		final SubLObject final_offset = pph_javalist_item_start_char(last(pph_javalist_items(combined_javalist), UNPROVIDED).first());
		SubLObject items_with_arg_positions = NIL;
		SubLObject list_var = NIL;
		SubLObject item = NIL;
		SubLObject n = NIL;
		list_var = pph_javalist_items(combined_javalist);
		item = list_var.first();
		for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), n = add(ONE_INTEGER, n)) {
			if (pph_javalist_item_arg_position(item) != $PPH_UNKNOWN_ARG_POSITION) {
				items_with_arg_positions = cons(n, items_with_arg_positions);
			}
		}
		return list(final_offset, nreverse(items_with_arg_positions));
	}

	public static SubLObject add_determiner(final SubLObject string) {
		SubLObject determiner = NIL;
		if (NIL != an_stringP(string)) {
			determiner = $$$an;
		}
		if ((NIL == determiner) && (NIL == string_utilities.starts_with(string, $$$the))) {
			determiner = $$$a;
		}
		return list(determiner, string);
	}

	public static SubLObject pph_formula_wXmt_scopeP(final SubLObject v_object) {
		return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != pph_mt_scope_predicate_p(cycl_utilities.formula_arg0(v_object))));
	}

	public static SubLObject pph_mt_scope_predicate_p(final SubLObject v_object) {
		return subl_promotions.memberP(v_object, $pph_mt_scope_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject pph_mt_scope_p(final SubLObject candidate) {
		return makeBoolean((NIL != list_utilities.non_empty_list_p(candidate)) && (NIL == pph_null_mt_scopeP(candidate)));
	}

	public static SubLObject pph_null_mt_scope() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $pph_null_mt_scope$.getDynamicValue(thread);
	}

	public static SubLObject pph_null_mt_scopeP(final SubLObject candidate) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return eql(candidate, $pph_null_mt_scope$.getDynamicValue(thread));
	}

	public static SubLObject pph_mt_scope(final SubLObject formula) {
		if (NIL != pph_formula_wXmt_scopeP(formula)) {
			SubLObject ans = pph_null_mt_scope();
			final SubLObject candidate = cycl_utilities.formula_arg1(formula, UNPROVIDED);
			final SubLObject functor = cycl_utilities.formula_arg0(candidate);
			if (NIL != fort_types_interface.microtheory_p(candidate)) {
				ans = list(candidate);
			} else if (NIL != isa.result_isa_colP(functor, $$TemporalMicrotheory, UNPROVIDED)) {
				ans = list(candidate);
			} else if (NIL != isa.result_isa_colP(functor, $$PolyadicMicrotheory, UNPROVIDED)) {
				ans = cycl_utilities.formula_args(candidate, UNPROVIDED);
			} else if (NIL != isa.result_isa_colP(functor, $$Microtheory, UNPROVIDED)) {
				ans = list(candidate);
			}

			if (!ans.eql(pph_null_mt_scope())) {
				ans = list_utilities.remove_if_not($sym780$EL_WFT_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			return ans;
		}
		return NIL;
	}

	public static SubLObject pph_tensed_preds_for_mt_scope(final SubLObject mt_scope, SubLObject nl_preds, SubLObject wrt_date) {
		if (nl_preds == UNPROVIDED) {
			nl_preds = $ANY;
		}
		if (wrt_date == UNPROVIDED) {
			wrt_date = NIL;
		}
		SubLObject pred = NIL;
		if (NIL == pred) {
			SubLObject csome_list_var = mt_scope;
			SubLObject v_object = NIL;
			v_object = csome_list_var.first();
			while ((NIL == pred) && (NIL != csome_list_var)) {
				if (NIL != pph_isaP(v_object, $$TimeInterval, UNPROVIDED)) {
					pred = pph_tense_pred_for_interval_subsuming_date(v_object, wrt_date);
				} else if (NIL != pph_isaP(v_object, $$TemporalMicrotheory, UNPROVIDED)) {
					pred = pph_tense_pred_for_interval_subsuming_date(cycl_utilities.formula_arg1(v_object, UNPROVIDED), wrt_date);
				}

				csome_list_var = csome_list_var.rest();
				v_object = csome_list_var.first();
			}
		}
		return pph_filter_preds(NIL != pred ? list(pred) : $ANY, nl_preds, UNPROVIDED);
	}

	public static SubLObject keyword_or_hlmtP(final SubLObject x) {
		return makeBoolean(x.isKeyword() || (NIL != hlmt.hlmtP(x)));
	}

	public static SubLObject string_or_nil_p(final SubLObject x) {
		return makeBoolean((NIL == x) || x.isString());
	}

	public static SubLObject keyword_or_nil_p(final SubLObject x) {
		return makeBoolean(x.isKeyword() || (NIL == x));
	}

	public static SubLObject predicate_or_nil_p(final SubLObject x) {
		return makeBoolean((NIL != fort_types_interface.predicateP(x)) || (NIL == x));
	}

	public static SubLObject non_negative_integer_or_nil_p(final SubLObject x) {
		return makeBoolean((NIL == x) || (NIL != subl_promotions.non_negative_integer_p(x)));
	}

	public static SubLObject get_all_pretty_strings(final SubLObject v_term) {
		if (NIL != current_kb_has_pretty_strings_assertedP()) {
			return kb_mapping_utilities.pred_values_in_any_mt(v_term, $$prettyString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return compute_all_pretty_strings(v_term);
	}

	public static SubLObject get_pretty_string_canonical(final SubLObject v_term) {
		if (NIL != current_kb_has_pretty_strings_assertedP()) {
			return kb_mapping_utilities.fpred_value_in_any_mt(v_term, $$prettyString_Canonical, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		return compute_pretty_string_canonical(v_term, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject current_kb_has_pretty_strings_assertedP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			result = numL($int$100000, kb_indexing.num_predicate_extent_index($$prettyString, UNPROVIDED));
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject assert_pretty_strings(final SubLObject fort, SubLObject assert_mt, SubLObject paraphrase_mt, SubLObject nl_preds) {
		if (assert_mt == UNPROVIDED) {
			assert_mt = $$EnglishMt;
		}
		if (paraphrase_mt == UNPROVIDED) {
			paraphrase_mt = $$EnglishParaphraseMt;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = $list455;
		}
		final SubLObject acc = accumulation.new_list_accumulator(UNPROVIDED);
		SubLObject assert_count = ZERO_INTEGER;
		accumulate_pretty_strings(fort, acc, assert_mt, paraphrase_mt, nl_preds);
		SubLObject cdolist_list_var = accumulation.accumulation_contents(acc, T);
		SubLObject sentence = NIL;
		sentence = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			cyc_kernel.cyc_assert_wff(sentence, UNPROVIDED, UNPROVIDED);
			assert_count = add(assert_count, ONE_INTEGER);
			cdolist_list_var = cdolist_list_var.rest();
			sentence = cdolist_list_var.first();
		}
		return assert_count;
	}

	public static SubLObject accumulate_pretty_strings_from_iterator(final SubLObject iterator, final SubLObject acc, SubLObject message, SubLObject approx_total, SubLObject assert_mt, SubLObject paraphrase_mt, SubLObject nl_preds) {
		if (message == UNPROVIDED) {
			message = $str788$Generating_pretty_strings___;
		}
		if (approx_total == UNPROVIDED) {
			approx_total = forts.fort_count();
		}
		if (assert_mt == UNPROVIDED) {
			assert_mt = $$EnglishMt;
		}
		if (paraphrase_mt == UNPROVIDED) {
			paraphrase_mt = $$EnglishParaphraseMt;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = $list455;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject done = ZERO_INTEGER;
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
				final SubLObject local_state;
				final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
				final SubLObject _prev_bind_0_$139 = memoization_state.$memoization_state$.currentBinding(thread);
				try {
					memoization_state.$memoization_state$.bind(local_state, thread);
					final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
					try {
						final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
						final SubLObject _prev_bind_0_$140 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
						final SubLObject _prev_bind_1_$141 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
						final SubLObject _prev_bind_2_$142 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
						try {
							sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
							sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
							sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
							SubLObject valid;
							for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
								thread.resetMultipleValues();
								final SubLObject fort = iteration.iteration_next(iterator);
								valid = thread.secondMultipleValue();
								thread.resetMultipleValues();
								if (NIL != valid) {
									accumulate_pretty_strings(fort, acc, assert_mt, paraphrase_mt, nl_preds);
									if (!done.numGE(approx_total)) {
										done = add(done, ONE_INTEGER);
										note_percent_progress(done, approx_total);
									}
								}
							}
						} finally {
							sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$142, thread);
							sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$141, thread);
							sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$140, thread);
						}
					} finally {
						final SubLObject _prev_bind_0_$141 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values = getValuesAsVector();
							memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
							restoreValuesFromVector(_values);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$141, thread);
						}
					}
				} finally {
					memoization_state.$memoization_state$.rebind(_prev_bind_0_$139, thread);
				}
				note_percent_progress(approx_total, approx_total);
			} finally {
				final SubLObject _prev_bind_0_$142 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values2 = getValuesAsVector();
					noting_percent_progress_postamble();
					restoreValuesFromVector(_values2);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
				}
			}
		} finally {
			$percent_progress_start_time$.rebind(_prev_bind_4, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
			$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
		return acc;
	}

	public static SubLObject accumulate_pretty_strings(final SubLObject fort, final SubLObject acc, SubLObject assert_mt, SubLObject paraphrase_mt, SubLObject nl_preds) {
		if (assert_mt == UNPROVIDED) {
			assert_mt = $$EnglishMt;
		}
		if (paraphrase_mt == UNPROVIDED) {
			paraphrase_mt = $$EnglishParaphraseMt;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = $list455;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != accumulation.accumulator_p(acc) : "accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) " + acc;
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$145 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$146 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$147 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$148 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									SubLObject generations = compute_all_pretty_strings(fort);
									final SubLObject preferred_generation = compute_pretty_string_canonical(fort, paraphrase_mt, nl_preds);
									if (NIL != string_utilities.non_empty_string_p(preferred_generation)) {
										accumulation.accumulation_add(acc, list($$ist, assert_mt, list($$prettyString_Canonical, fort, preferred_generation)));
										generations = remove(preferred_generation, generations, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									}
									SubLObject cdolist_list_var = generations;
									SubLObject generation = NIL;
									generation = cdolist_list_var.first();
									while (NIL != cdolist_list_var) {
										accumulation.accumulation_add(acc, list($$ist, assert_mt, list($$prettyString, fort, generation)));
										cdolist_list_var = cdolist_list_var.rest();
										generation = cdolist_list_var.first();
									}
								} finally {
									final SubLObject _prev_bind_0_$149 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$149, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$148, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$147, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$146, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$150 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$145, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		return acc;
	}

	public static SubLObject compute_pretty_string_canonical(final SubLObject v_term, SubLObject paraphrase_mt, SubLObject nl_preds) {
		if (paraphrase_mt == UNPROVIDED) {
			paraphrase_mt = $$EnglishParaphraseMt;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = $list455;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result_string = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
		final SubLObject _prev_bind_2 = pph_vars.$pph_track_discourse_referentsP$.currentBinding(thread);
		final SubLObject _prev_bind_3 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
		try {
			pph_vars.$select_string_methods_to_omit$.bind($list790, thread);
			pph_vars.$pph_track_discourse_referentsP$.bind(NIL, thread);
			pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
			result_string = pph_main.generate_phrase_no_checks(v_term, nl_preds, NIL, paraphrase_mt, $$InferencePSC, $TEXT, UNPROVIDED, UNPROVIDED);
			if (((NIL == result_string) && (NIL != pph_isaP(v_term, $$UnaryFunction, UNPROVIDED))) && (NIL == pph_functions.pph_phrase_fnP(v_term, UNPROVIDED))) {
				result_string = get_fallback_pretty_string_canonical_for_unary_function(v_term, paraphrase_mt, nl_preds);
			}
		} finally {
			pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_3, thread);
			pph_vars.$pph_track_discourse_referentsP$.rebind(_prev_bind_2, thread);
			pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_0, thread);
		}
		return result_string;
	}

	public static SubLObject get_fallback_pretty_string_canonical_for_unary_function(final SubLObject v_term, final SubLObject paraphrase_mt, final SubLObject nl_preds) {
		SubLObject result_string = NIL;
		SubLObject dummy_formula = pph_dummy_formula(v_term, NIL);
		SubLObject cdolist_list_var = cycl_utilities.expression_gather(dummy_formula, KEYWORDP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject var = NIL;
		var = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			dummy_formula = cycl_utilities.expression_subst(pph_vars.$pph_blank_string$.getGlobalValue(), var, dummy_formula, UNPROVIDED, UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			var = cdolist_list_var.first();
		}
		final SubLObject string_with_blanks = compute_pretty_string_canonical(dummy_formula, paraphrase_mt, nl_preds);
		if (((!string_utilities.trim_sides(string_with_blanks, CHAR_quotation).equal(pph_vars.$pph_blank_string$.getGlobalValue())) && (NIL != string_utilities.non_empty_string_p(string_with_blanks))) && (NIL == search(constant_reader.constant_reader_prefix(), string_with_blanks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
			result_string = string_with_blanks;
		}
		return result_string;
	}

	public static SubLObject compute_all_pretty_strings(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject pretty_strings = NIL;
		final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
		try {
			pph_vars.$pph_language_mt$.bind($pretty_string_generation_mt$.getGlobalValue(), thread);
			SubLObject hard_timeout = NIL;
			SubLObject soft_timeout = NIL;
			final SubLObject tag = with_timeout_make_tag();
			try {
				thread.throwStack.push(tag);
				final SubLObject _prev_bind_0_$151 = $within_with_timeout$.currentBinding(thread);
				try {
					$within_with_timeout$.bind(T, thread);
					SubLObject timer = NIL;
					try {
						final SubLObject _prev_bind_0_$152 = $with_timeout_nesting_depth$.currentBinding(thread);
						try {
							$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
							timer = with_timeout_start_timer($all_pretty_strings_hard_timeout$.getDynamicValue(thread), tag);
							final SubLObject _prev_bind_0_$153 = pph_macros.$pph_timeout_time_check_count$.currentBinding(thread);
							final SubLObject _prev_bind_2 = pph_macros.$pph_timeout_time$.currentBinding(thread);
							final SubLObject _prev_bind_3 = pph_macros.$pph_timeout_reachedP$.currentBinding(thread);
							try {
								pph_macros.$pph_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
								pph_macros.$pph_timeout_time$.bind(pph_macros.pph_compute_timeout_time($all_pretty_strings_soft_timeout$.getDynamicValue(thread)), thread);
								pph_macros.$pph_timeout_reachedP$.bind(pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread), thread);
								pph_macros.$pph_timeout_reachedP$.setDynamicValue(pph_macros.pph_timeout_time_reachedP(), thread);
								if (NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue(thread)) {
									final SubLObject _prev_bind_0_$154 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
									final SubLObject _prev_bind_1_$155 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
									final SubLObject _prev_bind_2_$156 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
									final SubLObject _prev_bind_4 = lexicon_vars.$exclude_archaic_speechP$.currentBinding(thread);
									final SubLObject _prev_bind_5 = lexicon_vars.$exclude_indirect_relationsP$.currentBinding(thread);
									try {
										pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
										lexicon_vars.$exclude_vulgaritiesP$.bind(subl_promotions.memberP($sym796$_EXCLUDE_VULGARITIES__, $list797, UNPROVIDED, UNPROVIDED), thread);
										lexicon_vars.$exclude_slangP$.bind(subl_promotions.memberP($sym798$_EXCLUDE_SLANG__, $list797, UNPROVIDED, UNPROVIDED), thread);
										lexicon_vars.$exclude_archaic_speechP$.bind(subl_promotions.memberP($sym799$_EXCLUDE_ARCHAIC_SPEECH__, $list797, UNPROVIDED, UNPROVIDED), thread);
										lexicon_vars.$exclude_indirect_relationsP$.bind(subl_promotions.memberP($sym800$_EXCLUDE_INDIRECT_RELATIONS__, $list797, UNPROVIDED, UNPROVIDED), thread);
										pretty_strings = list_utilities.first_n($all_pretty_strings_max_number$.getDynamicValue(thread), pph_methods_lexicon.all_phrases_for_term(v_term, $ALL, NIL, $TEXT, NIL, NIL, NIL, $all_pretty_strings_max_number$.getDynamicValue(thread)));
									} finally {
										lexicon_vars.$exclude_indirect_relationsP$.rebind(_prev_bind_5, thread);
										lexicon_vars.$exclude_archaic_speechP$.rebind(_prev_bind_4, thread);
										lexicon_vars.$exclude_slangP$.rebind(_prev_bind_2_$156, thread);
										lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_1_$155, thread);
										pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$154, thread);
									}
								}
								soft_timeout = pph_macros.pph_timeout_time_reachedP();
							} finally {
								pph_macros.$pph_timeout_reachedP$.rebind(_prev_bind_3, thread);
								pph_macros.$pph_timeout_time$.rebind(_prev_bind_2, thread);
								pph_macros.$pph_timeout_time_check_count$.rebind(_prev_bind_0_$153, thread);
							}
						} finally {
							$with_timeout_nesting_depth$.rebind(_prev_bind_0_$152, thread);
						}
					} finally {
						final SubLObject _prev_bind_0_$155 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values = getValuesAsVector();
							with_timeout_stop_timer(timer);
							restoreValuesFromVector(_values);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$155, thread);
						}
					}
				} finally {
					$within_with_timeout$.rebind(_prev_bind_0_$151, thread);
				}
			} catch (final Throwable ccatch_env_var) {
				hard_timeout = Errors.handleThrowable(ccatch_env_var, tag);
			} finally {
				thread.throwStack.pop();
			}
			if (NIL != hard_timeout) {
				Errors.warn($str801$Hit_hard_timeout_of__D_seconds_ge, $all_pretty_strings_hard_timeout$.getDynamicValue(thread), v_term);
			} else if (NIL != soft_timeout) {
				Errors.warn($str802$Hit_soft_timeout_of__D_seconds_ge, $all_pretty_strings_soft_timeout$.getDynamicValue(thread), v_term);
			}

			return pretty_strings;
		} finally {
			pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
		}
	}

	public static SubLObject declare_pph_utilities_file() {
		declareFunction(me, "initialize_pph_nbar_nart", "INITIALIZE-PPH-NBAR-NART", 0, 0, false);
		declareFunction(me, "pph_nbar_nart", "PPH-NBAR-NART", 0, 0, false);
		declareFunction(me, "initialize_paraphrase_kb_feature", "INITIALIZE-PARAPHRASE-KB-FEATURE", 0, 0, false);
		declareFunction(me, "pph_push_environment", "PPH-PUSH-ENVIRONMENT", 1, 0, false);
		declareFunction(me, "pph_pop_environment", "PPH-POP-ENVIRONMENT", 0, 0, false);
		declareFunction(me, "resource_pph_environment_stack", "RESOURCE-PPH-ENVIRONMENT-STACK", 1, 0, false);
		declareFunction(me, "get_resourced_pph_environment_stack", "GET-RESOURCED-PPH-ENVIRONMENT-STACK", 0, 0, false);
		declareFunction(me, "find_or_create_pph_context", "FIND-OR-CREATE-PPH-CONTEXT", 0, 0, false);
		declareMacro(me, "with_paraphrase_context", "WITH-PARAPHRASE-CONTEXT");
		declareFunction(me, "pph_environment_search", "PPH-ENVIRONMENT-SEARCH", 1, 0, false);
		declareFunction(me, "pph_precision_p", "PPH-PRECISION-P", 1, 0, false);
		declareFunction(me, "pph_current_precision", "PPH-CURRENT-PRECISION", 0, 0, false);
		declareFunction(me, "pph_terse_mode_p", "PPH-TERSE-MODE-P", 0, 0, false);
		declareFunction(me, "pph_set_precision", "PPH-SET-PRECISION", 1, 0, false);
		declareFunction(me, "pph_reset_precision", "PPH-RESET-PRECISION", 1, 0, false);
		declareFunction(me, "pph_top_level_preciseP", "PPH-TOP-LEVEL-PRECISE?", 0, 0, false);
		declareFunction(me, "pph_precise_in_argP", "PPH-PRECISE-IN-ARG?", 1, 0, false);
		declareFunction(me, "paraphrase_precision_for_arg", "PARAPHRASE-PRECISION-FOR-ARG", 1, 1, false);
		declareMacro(me, "with_paraphrase_precision_for_arg", "WITH-PARAPHRASE-PRECISION-FOR-ARG");
		declareFunction(me, "pph_precision_for_object", "PPH-PRECISION-FOR-OBJECT", 2, 0, false);
		declareFunction(me, "pph_precision_for_object_int_internal", "PPH-PRECISION-FOR-OBJECT-INT-INTERNAL", 2, 0, false);
		declareFunction(me, "pph_precision_for_object_int", "PPH-PRECISION-FOR-OBJECT-INT", 2, 0, false);
		declareFunction(me, "pph_remove_subsumed", "PPH-REMOVE-SUBSUMED", 1, 0, false);
		declareFunction(me, "pph_prefix_listP", "PPH-PREFIX-LIST?", 2, 1, false);
		declareFunction(me, "pph_get_nested_nth", "PPH-GET-NESTED-NTH", 2, 0, false);
		declareFunction(me, "pph_set_nested_nth", "PPH-SET-NESTED-NTH", 3, 0, false);
		declareFunction(me, "pph_different_args_remove_duplicates", "PPH-DIFFERENT-ARGS-REMOVE-DUPLICATES", 2, 0, false);
		declareFunction(me, "pph_different_arg_positions", "PPH-DIFFERENT-ARG-POSITIONS", 2, 0, false);
		declareFunction(me, "pph_dereference_arg_position", "PPH-DEREFERENCE-ARG-POSITION", 2, 0, false);
		declareFunction(me, "pph_search_limit", "PPH-SEARCH-LIMIT", 0, 0, false);
		declareFunction(me, "pph_typed_genl_preds", "PPH-TYPED-GENL-PREDS", 1, 1, false);
		declareFunction(me, "clear_pph_typed_genl_preds_via_inference", "CLEAR-PPH-TYPED-GENL-PREDS-VIA-INFERENCE", 0, 0, false);
		declareFunction(me, "remove_pph_typed_genl_preds_via_inference", "REMOVE-PPH-TYPED-GENL-PREDS-VIA-INFERENCE", 2, 0, false);
		declareFunction(me, "pph_typed_genl_preds_via_inference_internal", "PPH-TYPED-GENL-PREDS-VIA-INFERENCE-INTERNAL", 2, 0, false);
		declareFunction(me, "pph_typed_genl_preds_via_inference", "PPH-TYPED-GENL-PREDS-VIA-INFERENCE", 2, 0, false);
		declareFunction(me, "get_genformats", "GET-GENFORMATS", 1, 1, false);
		declareFunction(me, "get_pgus", "GET-PGUS", 1, 1, false);
		declareFunction(me, "get_genphrases", "GET-GENPHRASES", 1, 1, false);
		declareFunction(me, "get_words_denoting_col", "GET-WORDS-DENOTING-COL", 1, 0, false);
		declareFunction(me, "determiner_stringP", "DETERMINER-STRING?", 1, 0, false);
		declareFunction(me, "definite_determiner_stringP", "DEFINITE-DETERMINER-STRING?", 1, 0, false);
		declareFunction(me, "indefinite_determiner_stringP", "INDEFINITE-DETERMINER-STRING?", 1, 0, false);
		declareFunction(me, "alternate_determiner", "ALTERNATE-DETERMINER", 2, 0, false);
		declareFunction(me, "pph_add_determiner", "PPH-ADD-DETERMINER", 2, 1, false);
		declareFunction(me, "pph_determinerP", "PPH-DETERMINER?", 1, 0, false);
		declareFunction(me, "letter_name_starts_with_vowelP", "LETTER-NAME-STARTS-WITH-VOWEL?", 1, 0, false);
		declareFunction(me, "consonant_or_yP", "CONSONANT-OR-Y?", 1, 0, false);
		declareFunction(me, "an_stringP", "AN-STRING?", 1, 0, false);
		declareFunction(me, "pph_denots_of_acronym_string", "PPH-DENOTS-OF-ACRONYM-STRING", 1, 0, false);
		declareFunction(me, "pph_denots_of_string", "PPH-DENOTS-OF-STRING", 1, 3, false);
		declareFunction(me, "pph_case_kwP", "PPH-CASE-KW?", 1, 0, false);
		declareFunction(me, "det_invisible_charP", "DET-INVISIBLE-CHAR?", 1, 0, false);
		new pph_utilities.$det_invisible_charP$UnaryFunction();
		declareFunction(me, "pph_remove_html_tags", "PPH-REMOVE-HTML-TAGS", 1, 1, false);
		declareFunction(me, "pph_html_string_to_output_item", "PPH-HTML-STRING-TO-OUTPUT-ITEM", 1, 0, false);
		declareFunction(me, "pph_html_tag_starts_atP", "PPH-HTML-TAG-STARTS-AT?", 2, 0, false);
		declareFunction(me, "pph_anchor_tagP", "PPH-ANCHOR-TAG?", 2, 0, false);
		declareFunction(me, "pph_escape", "PPH-ESCAPE", 1, 0, false);
		declareFunction(me, "non_pph_html_tag_locations", "NON-PPH-HTML-TAG-LOCATIONS", 1, 0, false);
		declareFunction(me, "remove_leading_html", "REMOVE-LEADING-HTML", 1, 0, false);
		declareFunction(me, "select_determiner_string", "SELECT-DETERMINER-STRING", 3, 0, false);
		declareFunction(me, "pph_pred_takes_indefinite_detP", "PPH-PRED-TAKES-INDEFINITE-DET?", 1, 0, false);
		declareFunction(me, "pph_first_word", "PPH-FIRST-WORD", 1, 1, false);
		declareFunction(me, "definite_stringP", "DEFINITE-STRING?", 1, 0, false);
		declareFunction(me, "pph_definiteness_keyword_p", "PPH-DEFINITENESS-KEYWORD-P", 1, 0, false);
		declareFunction(me, "pph_np_cycl_template_for_term_type", "PPH-NP-CYCL-TEMPLATE-FOR-TERM-TYPE", 2, 2, false);
		declareFunction(me, "pph_detp_cycl_template_for_term_type", "PPH-DETP-CYCL-TEMPLATE-FOR-TERM-TYPE", 2, 2, false);
		declareFunction(me, "pph_indefinite_personal_pronoun_referent_typeP", "PPH-INDEFINITE-PERSONAL-PRONOUN-REFERENT-TYPE?", 1, 0, false);
		declareFunction(me, "pph_np_cycl_for_term_type", "PPH-NP-CYCL-FOR-TERM-TYPE", 2, 1, false);
		declareFunction(me, "pph_thing_phrase_naut", "PPH-THING-PHRASE-NAUT", 1, 0, false);
		declareFunction(me, "pph_place_phrase_naut", "PPH-PLACE-PHRASE-NAUT", 1, 0, false);
		declareFunction(me, "pph_agent_phrase_naut", "PPH-AGENT-PHRASE-NAUT", 1, 0, false);
		declareFunction(me, "pph_definite_english_determiner_type_p", "PPH-DEFINITE-ENGLISH-DETERMINER-TYPE-P", 1, 0, false);
		declareFunction(me, "pph_np_for_nbar", "PPH-NP-FOR-NBAR", 2, 0, false);
		declareFunction(me, "pph_det_naut_for_definiteness", "PPH-DET-NAUT-FOR-DEFINITENESS", 1, 0, false);
		declareFunction(me, "pph_best_demonstrative_attr_cXb", "PPH-BEST-DEMONSTRATIVE-ATTR-C/B", 1, 0, false);
		declareFunction(me, "pph_best_backreference_attr_cXb", "PPH-BEST-BACKREFERENCE-ATTR-C/B", 1, 0, false);
		declareFunction(me, "specs_fn_natP", "SPECS-FN-NAT?", 1, 0, false);
		new pph_utilities.$specs_fn_natP$UnaryFunction();
		declareFunction(me, "pph_make_type_level", "PPH-MAKE-TYPE-LEVEL", 1, 0, false);
		declareFunction(me, "pph_nbar_cycl_template_for_term_type", "PPH-NBAR-CYCL-TEMPLATE-FOR-TERM-TYPE", 1, 3, false);
		declareFunction(me, "pph_nbar_cycl_for_term_type", "PPH-NBAR-CYCL-FOR-TERM-TYPE", 1, 3, false);
		declareFunction(me, "make_instance_of_naut", "MAKE-INSTANCE-OF-NAUT", 3, 0, false);
		declareFunction(me, "make_instance_of_naut_from_np_naut", "MAKE-INSTANCE-OF-NAUT-FROM-NP-NAUT", 2, 0, false);
		declareFunction(me, "get_german_determiner_string", "GET-GERMAN-DETERMINER-STRING", 3, 0, false);
		declareFunction(me, "numeric_det_agr_pred", "NUMERIC-DET-AGR-PRED", 1, 0, false);
		declareFunction(me, "pph_numeric_det_cyclP", "PPH-NUMERIC-DET-CYCL?", 1, 0, false);
		declareFunction(me, "clear_pph_var_typing_predicates", "CLEAR-PPH-VAR-TYPING-PREDICATES", 0, 0, false);
		declareFunction(me, "remove_pph_var_typing_predicates", "REMOVE-PPH-VAR-TYPING-PREDICATES", 0, 0, false);
		declareFunction(me, "pph_var_typing_predicates_internal", "PPH-VAR-TYPING-PREDICATES-INTERNAL", 0, 0, false);
		declareFunction(me, "pph_var_typing_predicates", "PPH-VAR-TYPING-PREDICATES", 0, 0, false);
		declareFunction(me, "pph_var_type_from_asent", "PPH-VAR-TYPE-FROM-ASENT", 1, 0, false);
		declareFunction(me, "pph_parse_var_typing_clause", "PPH-PARSE-VAR-TYPING-CLAUSE", 1, 1, false);
		declareFunction(me, "pph_var_typing_predicateP", "PPH-VAR-TYPING-PREDICATE?", 1, 1, false);
		declareFunction(me, "clear_all_pph_var_typing_predicates", "CLEAR-ALL-PPH-VAR-TYPING-PREDICATES", 0, 0, false);
		declareFunction(me, "remove_all_pph_var_typing_predicates", "REMOVE-ALL-PPH-VAR-TYPING-PREDICATES", 0, 1, false);
		declareFunction(me, "all_pph_var_typing_predicates_internal", "ALL-PPH-VAR-TYPING-PREDICATES-INTERNAL", 1, 0, false);
		declareFunction(me, "all_pph_var_typing_predicates", "ALL-PPH-VAR-TYPING-PREDICATES", 0, 1, false);
		declareFunction(me, "clear_pph_var_type_position", "CLEAR-PPH-VAR-TYPE-POSITION", 0, 0, false);
		declareFunction(me, "remove_pph_var_type_position", "REMOVE-PPH-VAR-TYPE-POSITION", 1, 0, false);
		declareFunction(me, "pph_var_type_position_internal", "PPH-VAR-TYPE-POSITION-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_var_type_position", "PPH-VAR-TYPE-POSITION", 1, 0, false);
		declareFunction(me, "pph_arg_position", "PPH-ARG-POSITION", 2, 1, false);
		declareFunction(me, "pph_var_typing_clauseP", "PPH-VAR-TYPING-CLAUSE?", 1, 2, false);
		declareFunction(me, "pph_valid_relevant_var_typeP", "PPH-VALID-RELEVANT-VAR-TYPE?", 1, 0, false);
		declareFunction(me, "pph_valid_var_typeP", "PPH-VALID-VAR-TYPE?", 1, 0, false);
		new pph_utilities.$pph_valid_var_typeP$UnaryFunction();
		declareFunction(me, "pph_prepend_explicit_universal_string", "PPH-PREPEND-EXPLICIT-UNIVERSAL-STRING", 3, 0, false);
		declareFunction(me, "pph_remove_extra_spaces", "PPH-REMOVE-EXTRA-SPACES", 1, 0, false);
		declareFunction(me, "pph_remove_extra_spaces_int_internal", "PPH-REMOVE-EXTRA-SPACES-INT-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_remove_extra_spaces_int", "PPH-REMOVE-EXTRA-SPACES-INT", 1, 0, false);
		declareFunction(me, "pph_space_to_zapP", "PPH-SPACE-TO-ZAP?", 4, 0, false);
		declareFunction(me, "pph_zap_leading_space_at_char_numP", "PPH-ZAP-LEADING-SPACE-AT-CHAR-NUM?", 2, 0, false);
		declareFunction(me, "pph_remove_space_beforeP", "PPH-REMOVE-SPACE-BEFORE?", 1, 1, false);
		declareFunction(me, "pph_final_punctuation_string_p", "PPH-FINAL-PUNCTUATION-STRING-P", 1, 0, false);
		declareFunction(me, "pph_word_final_punctuation_string_p", "PPH-WORD-FINAL-PUNCTUATION-STRING-P", 1, 0, false);
		declareFunction(me, "pph_sentence_final_punctuation_string_p", "PPH-SENTENCE-FINAL-PUNCTUATION-STRING-P", 1, 0, false);
		declareFunction(me, "pph_sentence_final_punctuation_char_p", "PPH-SENTENCE-FINAL-PUNCTUATION-CHAR-P", 1, 0, false);
		declareFunction(me, "pph_zap_following_space_at_char_numP", "PPH-ZAP-FOLLOWING-SPACE-AT-CHAR-NUM?", 2, 0, false);
		declareFunction(me, "clean_bunge_nreverse", "CLEAN-BUNGE-NREVERSE", 1, 1, false);
		declareFunction(me, "clean_reverse", "CLEAN-REVERSE", 1, 0, false);
		declareFunction(me, "add_period_smart", "ADD-PERIOD-SMART", 1, 0, false);
		declareFunction(me, "add_question_mark_smart", "ADD-QUESTION-MARK-SMART", 1, 0, false);
		declareFunction(me, "add_final_punctuation_smart", "ADD-FINAL-PUNCTUATION-SMART", 1, 1, false);
		declareFunction(me, "pph_punctuation_ok_after_stringP", "PPH-PUNCTUATION-OK-AFTER-STRING?", 2, 0, false);
		declareFunction(me, "add_quotes_smart", "ADD-QUOTES-SMART", 1, 0, false);
		declareFunction(me, "pph_dont_capitalizeP", "PPH-DONT-CAPITALIZE?", 1, 0, false);
		declareFunction(me, "upcase_leading_smart", "UPCASE-LEADING-SMART", 1, 0, false);
		declareFunction(me, "add_title_capitalization", "ADD-TITLE-CAPITALIZATION", 1, 0, false);
		declareFunction(me, "pph_case_correct_word_from_chars", "PPH-CASE-CORRECT-WORD-FROM-CHARS", 2, 0, false);
		declareFunction(me, "pph_ncapitalize_for_title", "PPH-NCAPITALIZE-FOR-TITLE", 1, 0, false);
		declareFunction(me, "pph_rephrase_cycl", "PPH-REPHRASE-CYCL", 1, 0, false);
		declareFunction(me, "pph_possibly_nartify", "PPH-POSSIBLY-NARTIFY", 1, 0, false);
		declareFunction(me, "pph_possibly_nartify_internal_internal", "PPH-POSSIBLY-NARTIFY-INTERNAL-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_possibly_nartify_internal", "PPH-POSSIBLY-NARTIFY-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_nart_substitute_internal", "PPH-NART-SUBSTITUTE-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_nart_substitute", "PPH-NART-SUBSTITUTE", 1, 0, false);
		declareFunction(me, "pph_possibly_nartify_phrase", "PPH-POSSIBLY-NARTIFY-PHRASE", 1, 0, false);
		declareFunction(me, "pph_phrase_rephrase_cycl", "PPH-PHRASE-REPHRASE-CYCL", 1, 2, false);
		declareMacro(me, "pph_rephrase_update", "PPH-REPHRASE-UPDATE");
		declareFunction(me, "pph_rephrase_template_for_cycl", "PPH-REPHRASE-TEMPLATE-FOR-CYCL", 1, 0, false);
		declareFunction(me, "pph_indexicals_to_resolve", "PPH-INDEXICALS-TO-RESOLVE", 0, 0, false);
		declareFunction(me, "pph_indexical_to_resolve_p", "PPH-INDEXICAL-TO-RESOLVE-P", 1, 0, false);
		declareFunction(me, "pph_process_indexicals", "PPH-PROCESS-INDEXICALS", 1, 0, false);
		declareFunction(me, "pph_possibly_processable_indexical_p", "PPH-POSSIBLY-PROCESSABLE-INDEXICAL-P", 1, 0, false);
		new pph_utilities.$pph_possibly_processable_indexical_p$UnaryFunction();
		declareFunction(me, "pph_possibly_indexicalizeable_cycl_p", "PPH-POSSIBLY-INDEXICALIZEABLE-CYCL-P", 1, 0, false);
		declareFunction(me, "pph_resolve_if_explicit_indexical", "PPH-RESOLVE-IF-EXPLICIT-INDEXICAL", 1, 0, false);
		declareFunction(me, "pph_possibly_resolvable_indexical_p", "PPH-POSSIBLY-RESOLVABLE-INDEXICAL-P", 1, 1, false);
		declareFunction(me, "pph_introduce_indexicals", "PPH-INTRODUCE-INDEXICALS", 1, 0, false);
		declareFunction(me, "pph_introduce_indexicals_for_dates", "PPH-INTRODUCE-INDEXICALS-FOR-DATES", 1, 0, false);
		declareFunction(me, "pph_find_indexical_template_for_dates", "PPH-FIND-INDEXICAL-TEMPLATE-FOR-DATES", 1, 0, false);
		new pph_utilities.$pph_find_indexical_template_for_dates$UnaryFunction();
		declareFunction(me, "pph_find_indexical_template_for_date", "PPH-FIND-INDEXICAL-TEMPLATE-FOR-DATE", 1, 0, false);
		declareFunction(me, "pph_resolve_indexicals", "PPH-RESOLVE-INDEXICALS", 1, 1, false);
		declareFunction(me, "pph_resolve_indexicals_for_dates", "PPH-RESOLVE-INDEXICALS-FOR-DATES", 1, 1, false);
		declareFunction(me, "pph_find_template_for_indexical_dates", "PPH-FIND-TEMPLATE-FOR-INDEXICAL-DATES", 1, 1, false);
		declareFunction(me, "pph_find_template_for_indexical_date", "PPH-FIND-TEMPLATE-FOR-INDEXICAL-DATE", 1, 1, false);
		declareFunction(me, "pph_explicit_indexical_indexical", "PPH-EXPLICIT-INDEXICAL-INDEXICAL", 1, 0, false);
		declareFunction(me, "pph_process_indexical", "PPH-PROCESS-INDEXICAL", 1, 0, false);
		declareFunction(me, "pph_explicit_indexical_referent", "PPH-EXPLICIT-INDEXICAL-REFERENT", 1, 1, false);
		declareFunction(me, "pph_indexical_referent", "PPH-INDEXICAL-REFERENT", 1, 1, false);
		declareFunction(me, "clear_pph_indexical_dates", "CLEAR-PPH-INDEXICAL-DATES", 0, 0, false);
		declareFunction(me, "remove_pph_indexical_dates", "REMOVE-PPH-INDEXICAL-DATES", 0, 0, false);
		declareFunction(me, "pph_indexical_dates_internal", "PPH-INDEXICAL-DATES-INTERNAL", 0, 0, false);
		declareFunction(me, "pph_indexical_dates", "PPH-INDEXICAL-DATES", 0, 0, false);
		declareFunction(me, "pph_indexical_date_p", "PPH-INDEXICAL-DATE-P", 1, 0, false);
		new pph_utilities.$pph_indexical_date_p$UnaryFunction();
		declareFunction(me, "pph_date_matches_indexicalP", "PPH-DATE-MATCHES-INDEXICAL?", 2, 0, false);
		new pph_utilities.$pph_date_matches_indexicalP$BinaryFunction();
		declareFunction(me, "pph_indexical_date_referent", "PPH-INDEXICAL-DATE-REFERENT", 1, 0, false);
		declareFunction(me, "pph_expiration_date_pastP", "PPH-EXPIRATION-DATE-PAST?", 1, 0, false);
		declareFunction(me, "clear_pph_indexical_date_referent_cached", "CLEAR-PPH-INDEXICAL-DATE-REFERENT-CACHED", 0, 0, false);
		declareFunction(me, "remove_pph_indexical_date_referent_cached", "REMOVE-PPH-INDEXICAL-DATE-REFERENT-CACHED", 1, 0, false);
		declareFunction(me, "pph_indexical_date_referent_cached_internal", "PPH-INDEXICAL-DATE-REFERENT-CACHED-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_indexical_date_referent_cached", "PPH-INDEXICAL-DATE-REFERENT-CACHED", 1, 0, false);
		declareFunction(me, "pph_indexical_date_expiration_date", "PPH-INDEXICAL-DATE-EXPIRATION-DATE", 1, 0, false);
		declareFunction(me, "pph_rephrase_template_for_subj_role_formula", "PPH-REPHRASE-TEMPLATE-FOR-SUBJ-ROLE-FORMULA", 1, 0, false);
		declareFunction(me, "initialize_pph_subject_role_preds", "INITIALIZE-PPH-SUBJECT-ROLE-PREDS", 0, 0, false);
		declareFunction(me, "pph_subject_role_predP", "PPH-SUBJECT-ROLE-PRED?", 1, 0, false);
		declareFunction(me, "pph_find_rephrase_template_for_subj_role_formula", "PPH-FIND-REPHRASE-TEMPLATE-FOR-SUBJ-ROLE-FORMULA", 1, 0, false);
		declareFunction(me, "var_template_in_formula", "VAR-TEMPLATE-IN-FORMULA", 2, 0, false);
		declareFunction(me, "pph_vars_to_quantify", "PPH-VARS-TO-QUANTIFY", 1, 0, false);
		declareFunction(me, "pph_rephrase_template_from_universal_introduction", "PPH-REPHRASE-TEMPLATE-FROM-UNIVERSAL-INTRODUCTION", 1, 0, false);
		declareMacro(me, "pph_unpacking_ists", "PPH-UNPACKING-ISTS");
		declareFunction(me, "pph_stack_ists", "PPH-STACK-ISTS", 2, 0, false);
		declareFunction(me, "pph_unstack_ists", "PPH-UNSTACK-ISTS", 2, 0, false);
		declareFunction(me, "pph_rephrase_template_from_universal_introduction_int", "PPH-REPHRASE-TEMPLATE-FROM-UNIVERSAL-INTRODUCTION-INT", 1, 0, false);
		declareFunction(me, "pph_find_core_formula", "PPH-FIND-CORE-FORMULA", 1, 0, false);
		declareFunction(me, "pph_rephrase_template_from_negated_conjunction", "PPH-REPHRASE-TEMPLATE-FROM-NEGATED-CONJUNCTION", 1, 0, false);
		declareFunction(me, "pph_rephrase_template_from_conjunct_reordering", "PPH-REPHRASE-TEMPLATE-FROM-CONJUNCT-REORDERING", 1, 0, false);
		declareFunction(me, "pph_sort_numbered_juncts", "PPH-SORT-NUMBERED-JUNCTS", 1, 0, false);
		declareFunction(me, "pph_numbered_juncts_reordered_p", "PPH-NUMBERED-JUNCTS-REORDERED-P", 1, 0, false);
		declareFunction(me, "pph_number_juncts", "PPH-NUMBER-JUNCTS", 1, 0, false);
		declareFunction(me, "pph_prefer_numbered_junctP", "PPH-PREFER-NUMBERED-JUNCT?", 2, 0, false);
		declareFunction(me, "pph_causal_predP", "PPH-CAUSAL-PRED?", 1, 0, false);
		declareFunction(me, "pph_cause_arg", "PPH-CAUSE-ARG", 1, 0, false);
		declareFunction(me, "pph_effect_arg", "PPH-EFFECT-ARG", 1, 0, false);
		declareFunction(me, "pph_free_variable_distance", "PPH-FREE-VARIABLE-DISTANCE", 2, 0, false);
		declareFunction(me, "pph_sort_variables", "PPH-SORT-VARIABLES", 1, 0, false);
		declareFunction(me, "pph_sort_bindings", "PPH-SORT-BINDINGS", 1, 0, false);
		declareFunction(me, "pph_variable_L", "PPH-VARIABLE-<", 2, 0, false);
		declareFunction(me, "pph_choose_next_conjunct", "PPH-CHOOSE-NEXT-CONJUNCT", 2, 0, false);
		declareFunction(me, "pph_choose_first_conjunct", "PPH-CHOOSE-FIRST-CONJUNCT", 1, 0, false);
		declareFunction(me, "pph_sort_conjunct_earlierP", "PPH-SORT-CONJUNCT-EARLIER?", 2, 0, false);
		declareFunction(me, "pph_optimize_variable_distance", "PPH-OPTIMIZE-VARIABLE-DISTANCE", 1, 0, false);
		declareFunction(me, "pph_unbound_arg0_clauseP", "PPH-UNBOUND-ARG0-CLAUSE?", 1, 0, false);
		declareFunction(me, "pph_ordering_clauseP", "PPH-ORDERING-CLAUSE?", 1, 0, false);
		declareFunction(me, "pph_templates_from_numbered_juncts", "PPH-TEMPLATES-FROM-NUMBERED-JUNCTS", 1, 0, false);
		declareFunction(me, "pph_rephrase_template_from_expansion", "PPH-REPHRASE-TEMPLATE-FROM-EXPANSION", 1, 0, false);
		declareFunction(me, "find_el_macro_expansion", "FIND-EL-MACRO-EXPANSION", 1, 1, false);
		declareFunction(me, "pph_get_expansion", "PPH-GET-EXPANSION", 1, 0, false);
		declareFunction(me, "pph_bad_expansion_templateP_internal", "PPH-BAD-EXPANSION-TEMPLATE?-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_bad_expansion_templateP", "PPH-BAD-EXPANSION-TEMPLATE?", 1, 0, false);
		declareFunction(me, "pph_modal_sentenceP", "PPH-MODAL-SENTENCE?", 1, 0, false);
		declareFunction(me, "pph_modal_operatorP", "PPH-MODAL-OPERATOR?", 1, 0, false);
		declareFunction(me, "do_tou_substitution", "DO-TOU-SUBSTITUTION", 1, 0, false);
		declareFunction(me, "pph_cycl_template_p", "PPH-CYCL-TEMPLATE-P", 1, 0, false);
		declareFunction(me, "pph_arg_position_specifierP", "PPH-ARG-POSITION-SPECIFIER?", 1, 0, false);
		new pph_utilities.$pph_arg_position_specifierP$UnaryFunction();
		declareFunction(me, "pph_identity_template", "PPH-IDENTITY-TEMPLATE", 0, 0, false);
		declareFunction(me, "pph_identity_template_p", "PPH-IDENTITY-TEMPLATE-P", 1, 0, false);
		new pph_utilities.$pph_identity_template_p$UnaryFunction();
		declareFunction(me, "pph_impossible_template", "PPH-IMPOSSIBLE-TEMPLATE", 0, 0, false);
		declareFunction(me, "pph_impossible_template_p", "PPH-IMPOSSIBLE-TEMPLATE-P", 1, 0, false);
		declareFunction(me, "formula_arg_nautP", "FORMULA-ARG-NAUT?", 1, 0, false);
		declareFunction(me, "make_formula_arg_naut", "MAKE-FORMULA-ARG-NAUT", 2, 0, false);
		declareFunction(me, "pph_resolve_formula_arg_nauts", "PPH-RESOLVE-FORMULA-ARG-NAUTS", 1, 1, false);
		declareFunction(me, "pph_resolve_formula_arg_naut", "PPH-RESOLVE-FORMULA-ARG-NAUT", 1, 1, false);
		declareFunction(me, "pph_arg_position_from_template", "PPH-ARG-POSITION-FROM-TEMPLATE", 1, 0, false);
		declareFunction(me, "pph_formula_positions", "PPH-FORMULA-POSITIONS", 2, 1, false);
		declareFunction(me, "pph_cycl_template_from_arg_position", "PPH-CYCL-TEMPLATE-FROM-ARG-POSITION", 1, 0, false);
		declareFunction(me, "pph_template_for_cycl_variable", "PPH-TEMPLATE-FOR-CYCL-VARIABLE", 2, 0, false);
		declareFunction(me, "pph_arg_position_from_generic_arg", "PPH-ARG-POSITION-FROM-GENERIC-ARG", 1, 0, false);
		declareFunction(me, "pph_arg_position_from_formula_arg_naut", "PPH-ARG-POSITION-FROM-FORMULA-ARG-NAUT", 1, 0, false);
		declareFunction(me, "pph_simplify_template", "PPH-SIMPLIFY-TEMPLATE", 2, 0, false);
		declareFunction(me, "pph_simplify_template_recursive", "PPH-SIMPLIFY-TEMPLATE-RECURSIVE", 2, 0, false);
		declareFunction(me, "pph_expanded_identity_template_p", "PPH-EXPANDED-IDENTITY-TEMPLATE-P", 2, 0, false);
		declareFunction(me, "clear_pph_apply_template", "CLEAR-PPH-APPLY-TEMPLATE", 0, 0, false);
		declareFunction(me, "remove_pph_apply_template", "REMOVE-PPH-APPLY-TEMPLATE", 2, 0, false);
		declareFunction(me, "pph_apply_template_internal", "PPH-APPLY-TEMPLATE-INTERNAL", 2, 0, false);
		declareFunction(me, "pph_apply_template", "PPH-APPLY-TEMPLATE", 2, 0, false);
		declareFunction(me, "do_pph_apply_template", "DO-PPH-APPLY-TEMPLATE", 2, 0, false);
		declareFunction(me, "pph_bad_template", "PPH-BAD-TEMPLATE", 2, 0, false);
		declareFunction(me, "ok_for_formula_arg_p", "OK-FOR-FORMULA-ARG-P", 1, 0, false);
		declareFunction(me, "ok_for_formula_terms_p", "OK-FOR-FORMULA-TERMS-P", 1, 0, false);
		declareFunction(me, "ok_for_formula_arity_p", "OK-FOR-FORMULA-ARITY-P", 1, 0, false);
		declareFunction(me, "pph_test_dnf_new", "PPH-TEST-DNF-NEW", 1, 0, false);
		declareFunction(me, "pph_test_dnf", "PPH-TEST-DNF", 1, 0, false);
		declareFunction(me, "pph_ask_lit_internal", "PPH-ASK-LIT-INTERNAL", 1, 1, false);
		declareFunction(me, "pph_ask_lit", "PPH-ASK-LIT", 1, 1, false);
		declareFunction(me, "pph_ask_lit_int", "PPH-ASK-LIT-INT", 2, 0, false);
		declareFunction(me, "pph_ask_lit_special_case_result", "PPH-ASK-LIT-SPECIAL-CASE-RESULT", 1, 0, false);
		declareFunction(me, "pph_cycl_sentence_askableP", "PPH-CYCL-SENTENCE-ASKABLE?", 1, 0, false);
		declareFunction(me, "pph_usable_condition_testP", "PPH-USABLE-CONDITION-TEST?", 1, 0, false);
		declareFunction(me, "pph_use_removal_askP", "PPH-USE-REMOVAL-ASK?", 1, 0, false);
		declareFunction(me, "pph_ask_variable", "PPH-ASK-VARIABLE", 2, 3, false);
		declareFunction(me, "pph_ask_variable_new", "PPH-ASK-VARIABLE-NEW", 2, 2, false);
		declareFunction(me, "pph_longer_durationP", "PPH-LONGER-DURATION?", 2, 0, false);
		declareFunction(me, "pph_unbounded_duration_p", "PPH-UNBOUNDED-DURATION-P", 1, 0, false);
		declareFunction(me, "pph_min_duration", "PPH-MIN-DURATION", 1, 0, false);
		declareFunction(me, "pph_max_duration", "PPH-MAX-DURATION", 1, 0, false);
		declareFunction(me, "pph_cycl_duration", "PPH-CYCL-DURATION", 2, 0, false);
		declareFunction(me, "pph_time_interval_cycl_duration", "PPH-TIME-INTERVAL-CYCL-DURATION", 2, 0, false);
		declareFunction(me, "pph_find_start_date", "PPH-FIND-START-DATE", 1, 0, false);
		declareFunction(me, "pph_find_end_date", "PPH-FIND-END-DATE", 1, 0, false);
		declareFunction(me, "pph_adjust_time_interval_cycl_duration", "PPH-ADJUST-TIME-INTERVAL-CYCL-DURATION", 2, 0, false);
		declareFunction(me, "pph_increment_cycl_duration", "PPH-INCREMENT-CYCL-DURATION", 1, 0, false);
		declareFunction(me, "pph_decrement_cycl_duration", "PPH-DECREMENT-CYCL-DURATION", 1, 0, false);
		declareFunction(me, "pph_adjustable_duration_p", "PPH-ADJUSTABLE-DURATION-P", 1, 0, false);
		declareFunction(me, "pph_maybe_add_query_to_top_20", "PPH-MAYBE-ADD-QUERY-TO-TOP-20", 4, 0, false);
		declareFunction(me, "destroyable_pph_inferenceP", "DESTROYABLE-PPH-INFERENCE?", 1, 0, false);
		declareFunction(me, "pph_inference_destroyer", "PPH-INFERENCE-DESTROYER", 0, 0, false);
		declareFunction(me, "smite_doomed_pph_inferences_next_time_around", "SMITE-DOOMED-PPH-INFERENCES-NEXT-TIME-AROUND", 0, 0, false);
		declareFunction(me, "pph_destroy_inference", "PPH-DESTROY-INFERENCE", 1, 1, false);
		declareFunction(me, "set_pph_inference_destruction_grace_period", "SET-PPH-INFERENCE-DESTRUCTION-GRACE-PERIOD", 1, 0, false);
		declareFunction(me, "pph_query", "PPH-QUERY", 1, 2, false);
		declareFunction(me, "pph_removal_ask_variable_internal", "PPH-REMOVAL-ASK-VARIABLE-INTERNAL", 2, 2, false);
		declareFunction(me, "pph_removal_ask_variable", "PPH-REMOVAL-ASK-VARIABLE", 2, 2, false);
		declareFunction(me, "pph_removal_ask_boolean_internal", "PPH-REMOVAL-ASK-BOOLEAN-INTERNAL", 1, 1, false);
		declareFunction(me, "pph_removal_ask_boolean", "PPH-REMOVAL-ASK-BOOLEAN", 1, 1, false);
		declareFunction(me, "verify_pph_removal_ask_boolean", "VERIFY-PPH-REMOVAL-ASK-BOOLEAN", 4, 0, false);
		declareFunction(me, "pph_irrelevant_fort", "PPH-IRRELEVANT-FORT", 1, 2, false);
		declareFunction(me, "pph_ask_boolean_internal", "PPH-ASK-BOOLEAN-INTERNAL", 1, 2, false);
		declareFunction(me, "pph_ask_boolean", "PPH-ASK-BOOLEAN", 1, 2, false);
		declareFunction(me, "pph_ask_bindings_internal", "PPH-ASK-BINDINGS-INTERNAL", 2, 2, false);
		declareFunction(me, "pph_ask_bindings", "PPH-ASK-BINDINGS", 2, 2, false);
		declareFunction(me, "pph_ask_template", "PPH-ASK-TEMPLATE", 3, 2, false);
		declareFunction(me, "pph_ask_template_new_internal", "PPH-ASK-TEMPLATE-NEW-INTERNAL", 2, 2, false);
		declareFunction(me, "pph_ask_template_new", "PPH-ASK-TEMPLATE-NEW", 2, 2, false);
		declareFunction(me, "pph_type_level_violations", "PPH-TYPE-LEVEL-VIOLATIONS", 1, 0, false);
		declareFunction(me, "pph_formula_arg_individualP", "PPH-FORMULA-ARG-INDIVIDUAL?", 2, 0, false);
		declareFunction(me, "pph_phrase_type_level_violation_p", "PPH-PHRASE-TYPE-LEVEL-VIOLATION-P", 1, 0, false);
		declareFunction(me, "pph_phrase_maybe_mark_type_level_violation", "PPH-PHRASE-MAYBE-MARK-TYPE-LEVEL-VIOLATION", 1, 0, false);
		declareFunction(me, "pph_optimize_formula_variable_names", "PPH-OPTIMIZE-FORMULA-VARIABLE-NAMES", 1, 3, false);
		declareFunction(me, "pph_noptimize_formula_variable_names", "PPH-NOPTIMIZE-FORMULA-VARIABLE-NAMES", 1, 3, false);
		declareFunction(me, "pph_optimized_names_for_variables", "PPH-OPTIMIZED-NAMES-FOR-VARIABLES", 1, 3, false);
		declareFunction(me, "pph_vars_to_optimize", "PPH-VARS-TO-OPTIMIZE", 1, 2, false);
		declareFunction(me, "pph_optimize_formula_variable_name", "PPH-OPTIMIZE-FORMULA-VARIABLE-NAME", 2, 3, false);
		declareFunction(me, "pph_optimize_formula_variable_name_via_arg_in_reln", "PPH-OPTIMIZE-FORMULA-VARIABLE-NAME-VIA-ARG-IN-RELN", 3, 0, false);
		declareFunction(me, "other_optimized_var_has_same_arg_in_relnP", "OTHER-OPTIMIZED-VAR-HAS-SAME-ARG-IN-RELN?", 3, 0, false);
		declareFunction(me, "pph_var_reln_arg_position_pairs_internal", "PPH-VAR-RELN-ARG-POSITION-PAIRS-INTERNAL", 2, 0, false);
		declareFunction(me, "pph_var_reln_arg_position_pairs", "PPH-VAR-RELN-ARG-POSITION-PAIRS", 2, 0, false);
		declareFunction(me, "pph_optimize_formula_variable_name_via_arg_types", "PPH-OPTIMIZE-FORMULA-VARIABLE-NAME-VIA-ARG-TYPES", 4, 1, false);
		declareFunction(me, "pph_salient_generalizations_for_variable_optimization", "PPH-SALIENT-GENERALIZATIONS-FOR-VARIABLE-OPTIMIZATION", 1, 2, false);
		declareFunction(me, "pph_sort_collections_by_generality", "PPH-SORT-COLLECTIONS-BY-GENERALITY", 1, 0, false);
		declareFunction(me, "pph_less_general_collectionP", "PPH-LESS-GENERAL-COLLECTION?", 2, 0, false);
		declareFunction(me, "resolve_disjoint_isa_constraints", "RESOLVE-DISJOINT-ISA-CONSTRAINTS", 2, 0, false);
		declareFunction(me, "pph_optimized_var_name_from_type", "PPH-OPTIMIZED-VAR-NAME-FROM-TYPE", 2, 0, false);
		declareFunction(me, "pph_optimize_var_from_string", "PPH-OPTIMIZE-VAR-FROM-STRING", 4, 0, false);
		declareFunction(me, "pph_optimize_var_using_name", "PPH-OPTIMIZE-VAR-USING-NAME", 4, 0, false);
		declareFunction(me, "update_optimized_var_map", "UPDATE-OPTIMIZED-VAR-MAP", 3, 0, false);
		declareFunction(me, "pph_unique_el_var_wrt_expression", "PPH-UNIQUE-EL-VAR-WRT-EXPRESSION", 1, 2, false);
		declareFunction(me, "pph_disallowed_var_names", "PPH-DISALLOWED-VAR-NAMES", 3, 0, false);
		declareFunction(me, "pph_optimize_formula_valid_var_typeP", "PPH-OPTIMIZE-FORMULA-VALID-VAR-TYPE?", 1, 0, false);
		declareFunction(me, "pph_paraphrase_to_var_name", "PPH-PARAPHRASE-TO-VAR-NAME", 1, 0, false);
		declareFunction(me, "pph_javalist_p", "PPH-JAVALIST-P", 1, 0, false);
		declareFunction(me, "new_pph_javalist", "NEW-PPH-JAVALIST", 2, 0, false);
		declareFunction(me, "pph_javalist_copy", "PPH-JAVALIST-COPY", 1, 0, false);
		declareFunction(me, "pph_javalist_item_copy", "PPH-JAVALIST-ITEM-COPY", 1, 0, false);
		declareFunction(me, "pph_javalist_string", "PPH-JAVALIST-STRING", 1, 0, false);
		declareFunction(me, "pph_javalist_string_as_utf8", "PPH-JAVALIST-STRING-AS-UTF8", 1, 0, false);
		declareFunction(me, "pph_javalist_string_as_cycl", "PPH-JAVALIST-STRING-AS-CYCL", 1, 0, false);
		declareFunction(me, "pph_javalist_html_string", "PPH-JAVALIST-HTML-STRING", 1, 1, false);
		declareFunction(me, "pph_javalist_item_html_string", "PPH-JAVALIST-ITEM-HTML-STRING", 1, 0, false);
		declareFunction(me, "pph_javalist_item_use_tagP", "PPH-JAVALIST-ITEM-USE-TAG?", 2, 0, false);
		declareFunction(me, "pph_javalist_construct_naut_links", "PPH-JAVALIST-CONSTRUCT-NAUT-LINKS", 1, 0, false);
		declareFunction(me, "pph_javalist_item_compatible_with_current_naut_itemsP", "PPH-JAVALIST-ITEM-COMPATIBLE-WITH-CURRENT-NAUT-ITEMS?", 2, 0, false);
		declareFunction(me, "pph_javalist_nat_functor_item_p", "PPH-JAVALIST-NAT-FUNCTOR-ITEM-P", 1, 0, false);
		declareFunction(me, "pph_javalist_update_naut_items", "PPH-JAVALIST-UPDATE-NAUT-ITEMS", 2, 0, false);
		declareFunction(me, "pph_javalist_construct_naut_item", "PPH-JAVALIST-CONSTRUCT-NAUT-ITEM", 1, 0, false);
		declareFunction(me, "pph_javalist_set_string", "PPH-JAVALIST-SET-STRING", 2, 0, false);
		declareFunction(me, "pph_javalist_items", "PPH-JAVALIST-ITEMS", 1, 0, false);
		declareFunction(me, "pph_njavalist_items", "PPH-NJAVALIST-ITEMS", 1, 0, false);
		declareFunction(me, "pph_javalist_singleton_p", "PPH-JAVALIST-SINGLETON-P", 1, 0, false);
		declareFunction(me, "pph_javalist_sole_item", "PPH-JAVALIST-SOLE-ITEM", 1, 0, false);
		declareFunction(me, "pph_javalist_last_item", "PPH-JAVALIST-LAST-ITEM", 1, 0, false);
		declareFunction(me, "pph_javalist_item_p", "PPH-JAVALIST-ITEM-P", 1, 0, false);
		declareFunction(me, "new_pph_javalist_item", "NEW-PPH-JAVALIST-ITEM", 6, 0, false);
		declareFunction(me, "pph_javalist_item_string", "PPH-JAVALIST-ITEM-STRING", 1, 0, false);
		declareFunction(me, "pph_javalist_item_set_string", "PPH-JAVALIST-ITEM-SET-STRING", 2, 0, false);
		declareFunction(me, "pph_javalist_item_cycl", "PPH-JAVALIST-ITEM-CYCL", 1, 0, false);
		declareFunction(me, "pph_javalist_item_set_cycl", "PPH-JAVALIST-ITEM-SET-CYCL", 2, 0, false);
		declareFunction(me, "pph_javalist_item_arg_position", "PPH-JAVALIST-ITEM-ARG-POSITION", 1, 0, false);
		declareFunction(me, "pph_javalist_item_set_arg_position", "PPH-JAVALIST-ITEM-SET-ARG-POSITION", 2, 0, false);
		declareFunction(me, "pph_javalist_item_open_tag", "PPH-JAVALIST-ITEM-OPEN-TAG", 1, 0, false);
		declareFunction(me, "pph_javalist_item_set_open_tag", "PPH-JAVALIST-ITEM-SET-OPEN-TAG", 2, 0, false);
		declareFunction(me, "pph_javalist_item_close_tag", "PPH-JAVALIST-ITEM-CLOSE-TAG", 1, 0, false);
		declareFunction(me, "pph_javalist_item_set_close_tag", "PPH-JAVALIST-ITEM-SET-CLOSE-TAG", 2, 0, false);
		declareFunction(me, "pph_javalist_item_start_char", "PPH-JAVALIST-ITEM-START-CHAR", 1, 0, false);
		declareFunction(me, "pph_javalist_item_set_start_char", "PPH-JAVALIST-ITEM-SET-START-CHAR", 2, 0, false);
		declareFunction(me, "pph_item_from_javalist", "PPH-ITEM-FROM-JAVALIST", 1, 0, false);
		declareFunction(me, "pph_javalist_cycl", "PPH-JAVALIST-CYCL", 1, 0, false);
		declareFunction(me, "pph_javalist_arg_position", "PPH-JAVALIST-ARG-POSITION", 1, 0, false);
		declareFunction(me, "pph_javalist_open_tag", "PPH-JAVALIST-OPEN-TAG", 1, 0, false);
		declareFunction(me, "pph_javalist_close_tag", "PPH-JAVALIST-CLOSE-TAG", 1, 0, false);
		declareFunction(me, "nconcatenate_pph_javalists", "NCONCATENATE-PPH-JAVALISTS", 1, 1, false);
		declareFunction(me, "pph_javalist_to_cycl_structured_paraphrase", "PPH-JAVALIST-TO-CYCL-STRUCTURED-PARAPHRASE", 1, 0, false);
		declareFunction(me, "pph_javalist_structured_subparaphrases", "PPH-JAVALIST-STRUCTURED-SUBPARAPHRASES", 1, 0, false);
		declareFunction(me, "pph_javalist_item_to_structured_subparaphrase", "PPH-JAVALIST-ITEM-TO-STRUCTURED-SUBPARAPHRASE", 1, 0, false);
		declareFunction(me, "empty_string_if_nil", "EMPTY-STRING-IF-NIL", 1, 0, false);
		declareFunction(me, "cycl_structured_paraphrase_to_pph_javalist", "CYCL-STRUCTURED-PARAPHRASE-TO-PPH-JAVALIST", 1, 0, false);
		declareFunction(me, "structured_subparaphrase_to_pph_javalist_item", "STRUCTURED-SUBPARAPHRASE-TO-PPH-JAVALIST-ITEM", 1, 0, false);
		declareFunction(me, "pph_output_list_to_javalist", "PPH-OUTPUT-LIST-TO-JAVALIST", 1, 0, false);
		declareFunction(me, "pph_start_char_sanity_check", "PPH-START-CHAR-SANITY-CHECK", 3, 0, false);
		declareFunction(me, "possibly_optimize_pph_annotated_javalists_for_alphabetization", "POSSIBLY-OPTIMIZE-PPH-ANNOTATED-JAVALISTS-FOR-ALPHABETIZATION", 1, 0, false);
		declareFunction(me, "possibly_optimize_pph_annotated_javalist_for_alphabetization", "POSSIBLY-OPTIMIZE-PPH-ANNOTATED-JAVALIST-FOR-ALPHABETIZATION", 1, 0, false);
		declareFunction(me, "possibly_optimize_pph_javalist_for_alphabetization", "POSSIBLY-OPTIMIZE-PPH-JAVALIST-FOR-ALPHABETIZATION", 1, 0, false);
		declareFunction(me, "pph_output_list_replace_bulleted_list_tags", "PPH-OUTPUT-LIST-REPLACE-BULLETED-LIST-TAGS", 1, 0, false);
		declareFunction(me, "pph_bulleted_list_start_itemP", "PPH-BULLETED-LIST-START-ITEM?", 1, 0, false);
		declareFunction(me, "pph_bulleted_list_end_itemP", "PPH-BULLETED-LIST-END-ITEM?", 1, 0, false);
		declareFunction(me, "pph_bulleted_list_item_end_itemP", "PPH-BULLETED-LIST-ITEM-END-ITEM?", 1, 0, false);
		declareFunction(me, "pph_bulleted_list_item_start_itemP", "PPH-BULLETED-LIST-ITEM-START-ITEM?", 1, 0, false);
		declareFunction(me, "pph_phrase_output_item_replace_start_item", "PPH-PHRASE-OUTPUT-ITEM-REPLACE-START-ITEM", 1, 0, false);
		declareFunction(me, "html_list_type_from_open_tag", "HTML-LIST-TYPE-FROM-OPEN-TAG", 1, 0, false);
		declareFunction(me, "pph_phrase_output_item_replace_end_item", "PPH-PHRASE-OUTPUT-ITEM-REPLACE-END-ITEM", 1, 0, false);
		declareFunction(me, "pph_phrase_output_item_replace_list_item_start_item", "PPH-PHRASE-OUTPUT-ITEM-REPLACE-LIST-ITEM-START-ITEM", 4, 0, false);
		declareFunction(me, "pph_phrase_output_item_replace_list_item_end_item", "PPH-PHRASE-OUTPUT-ITEM-REPLACE-LIST-ITEM-END-ITEM", 1, 0, false);
		declareFunction(me, "pph_bullet_string", "PPH-BULLET-STRING", 3, 0, false);
		declareFunction(me, "pph_annotate_javalists", "PPH-ANNOTATE-JAVALISTS", 2, 0, false);
		declareFunction(me, "annotate_pph_javalist", "ANNOTATE-PPH-JAVALIST", 2, 0, false);
		declareFunction(me, "pph_annotated_javalist_string", "PPH-ANNOTATED-JAVALIST-STRING", 1, 0, false);
		declareFunction(me, "unannotate_pph_javalists", "UNANNOTATE-PPH-JAVALISTS", 1, 0, false);
		declareFunction(me, "sort_pph_annotated_javalists", "SORT-PPH-ANNOTATED-JAVALISTS", 2, 0, false);
		declareFunction(me, "pph_javalist_to_output_map", "PPH-JAVALIST-TO-OUTPUT-MAP", 2, 0, false);
		declareFunction(me, "pph_javalist_items_to_output_maps", "PPH-JAVALIST-ITEMS-TO-OUTPUT-MAPS", 1, 0, false);
		declareFunction(me, "pph_output_map_javalist", "PPH-OUTPUT-MAP-JAVALIST", 1, 0, false);
		declareMacro(me, "with_generate_phrase_for_java_parameters", "WITH-GENERATE-PHRASE-FOR-JAVA-PARAMETERS");
		declareFunction(me, "generate_phrase_for_java_no_checks_with_property_list", "GENERATE-PHRASE-FOR-JAVA-NO-CHECKS-WITH-PROPERTY-LIST", 2, 1, false);
		declareFunction(me, "generate_phrase_for_java_property_list_p", "GENERATE-PHRASE-FOR-JAVA-PROPERTY-LIST-P", 1, 0, false);
		declareFunction(me, "nadjust_javalist_wrt_map", "NADJUST-JAVALIST-WRT-MAP", 2, 0, false);
		declareFunction(me, "nadjust_javalist_wrt_var_map", "NADJUST-JAVALIST-WRT-VAR-MAP", 2, 0, false);
		declareFunction(me, "clear_pph_javalist_sort_xyz_paraphrases", "CLEAR-PPH-JAVALIST-SORT-XYZ-PARAPHRASES", 0, 0, false);
		declareFunction(me, "remove_pph_javalist_sort_xyz_paraphrases", "REMOVE-PPH-JAVALIST-SORT-XYZ-PARAPHRASES", 1, 0, false);
		declareFunction(me, "pph_javalist_sort_xyz_paraphrases_internal", "PPH-JAVALIST-SORT-XYZ-PARAPHRASES-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_javalist_sort_xyz_paraphrases", "PPH-JAVALIST-SORT-XYZ-PARAPHRASES", 1, 0, false);
		declareFunction(me, "pph_javalist_nsort_xyz_paraphrases", "PPH-JAVALIST-NSORT-XYZ-PARAPHRASES", 1, 0, false);
		declareFunction(me, "test_xyz_sort_strings", "TEST-XYZ-SORT-STRINGS", 1, 0, false);
		declareFunction(me, "needs_do_supportP", "NEEDS-DO-SUPPORT?", 1, 0, false);
		declareFunction(me, "pph_phrase_add_do_support", "PPH-PHRASE-ADD-DO-SUPPORT", 1, 0, false);
		declareFunction(me, "new_pph_do_phrase_matching_head_verb_and_subject", "NEW-PPH-DO-PHRASE-MATCHING-HEAD-VERB-AND-SUBJECT", 2, 0, false);
		declareFunction(me, "pph_fort_paraphrase_cache_lookup", "PPH-FORT-PARAPHRASE-CACHE-LOOKUP", 1, 2, false);
		declareFunction(me, "pph_cached_pred_okP", "PPH-CACHED-PRED-OK?", 2, 0, false);
		declareFunction(me, "pph_salient_generalization", "PPH-SALIENT-GENERALIZATION", 1, 2, false);
		declareFunction(me, "pph_salient_generalizations", "PPH-SALIENT-GENERALIZATIONS", 1, 4, false);
		declareFunction(me, "pph_salient_generalizations_int_internal", "PPH-SALIENT-GENERALIZATIONS-INT-INTERNAL", 1, 4, false);
		declareFunction(me, "pph_salient_generalizations_int", "PPH-SALIENT-GENERALIZATIONS-INT", 1, 4, false);
		declareFunction(me, "pph_string_ok_for_termP", "PPH-STRING-OK-FOR-TERM?", 2, 0, false);
		declareFunction(me, "pph_canonicalize_hlmt", "PPH-CANONICALIZE-HLMT", 1, 0, false);
		declareFunction(me, "pph_list_ofP", "PPH-LIST-OF?", 2, 0, false);
		declareFunction(me, "pph_hl_to_el", "PPH-HL-TO-EL", 1, 0, false);
		declareFunction(me, "pph_sentence_from_assertion_internal", "PPH-SENTENCE-FROM-ASSERTION-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_sentence_from_assertion", "PPH-SENTENCE-FROM-ASSERTION", 1, 0, false);
		declareFunction(me, "pph_include_mt_in_assertion_sentenceP", "PPH-INCLUDE-MT-IN-ASSERTION-SENTENCE?", 1, 0, false);
		declareFunction(me, "pph_no_hl_only_termsP", "PPH-NO-HL-ONLY-TERMS?", 1, 0, false);
		declareFunction(me, "pph_hl_only_termP", "PPH-HL-ONLY-TERM?", 1, 0, false);
		declareFunction(me, "pph_no_skolemsP", "PPH-NO-SKOLEMS?", 1, 0, false);
		declareFunction(me, "clear_pph_english_contextP", "CLEAR-PPH-ENGLISH-CONTEXT?", 0, 0, false);
		declareFunction(me, "remove_pph_english_contextP", "REMOVE-PPH-ENGLISH-CONTEXT?", 0, 1, false);
		declareFunction(me, "pph_english_contextP_internal", "PPH-ENGLISH-CONTEXT?-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_english_contextP", "PPH-ENGLISH-CONTEXT?", 0, 1, false);
		declareFunction(me, "pph_assertion_wrong_languageP", "PPH-ASSERTION-WRONG-LANGUAGE?", 1, 0, false);
		declareFunction(me, "pph_sort_assertions", "PPH-SORT-ASSERTIONS", 1, 2, false);
		declareFunction(me, "pph_stable_sort_assertions", "PPH-STABLE-SORT-ASSERTIONS", 1, 2, false);
		declareFunction(me, "clear_pph_prefer_assertionP", "CLEAR-PPH-PREFER-ASSERTION?", 0, 0, false);
		declareFunction(me, "remove_pph_prefer_assertionP", "REMOVE-PPH-PREFER-ASSERTION?", 2, 3, false);
		declareFunction(me, "pph_prefer_assertionP_internal", "PPH-PREFER-ASSERTION?-INTERNAL", 5, 0, false);
		declareFunction(me, "pph_prefer_assertionP", "PPH-PREFER-ASSERTION?", 2, 3, false);
		new pph_utilities.$pph_prefer_assertionP$BinaryFunction();
		declareFunction(me, "pph_prefer_stringP", "PPH-PREFER-STRING?", 2, 0, false);
		declareFunction(me, "pph_string_frequencies_availableP", "PPH-STRING-FREQUENCIES-AVAILABLE?", 0, 0, false);
		declareFunction(me, "pph_more_frequent_stringP", "PPH-MORE-FREQUENT-STRING?", 2, 0, false);
		declareFunction(me, "pph_string_frequency_internal", "PPH-STRING-FREQUENCY-INTERNAL", 1, 1, false);
		declareFunction(me, "pph_string_frequency", "PPH-STRING-FREQUENCY", 1, 1, false);
		declareFunction(me, "multiple_paraphrase_forts", "MULTIPLE-PARAPHRASE-FORTS", 0, 0, false);
		declareFunction(me, "multiple_paraphrase_fortP", "MULTIPLE-PARAPHRASE-FORT?", 1, 1, false);
		declareFunction(me, "assert_assertion_web_frequency", "ASSERT-ASSERTION-WEB-FREQUENCY", 2, 0, false);
		declareFunction(me, "pph_nameable_collectionP", "PPH-NAMEABLE-COLLECTION?", 1, 0, false);
		declareFunction(me, "pph_generality_estimateL_internal", "PPH-GENERALITY-ESTIMATE<-INTERNAL", 2, 0, false);
		declareFunction(me, "pph_generality_estimateL", "PPH-GENERALITY-ESTIMATE<", 2, 0, false);
		declareFunction(me, "pph_core_term", "PPH-CORE-TERM", 1, 0, false);
		declareFunction(me, "pph_peer_agr_preds_for_preds", "PPH-PEER-AGR-PREDS-FOR-PREDS", 1, 1, false);
		declareFunction(me, "pph_peer_agr_preds_for_preds_int", "PPH-PEER-AGR-PREDS-FOR-PREDS-INT", 1, 1, false);
		declareFunction(me, "pph_peer_agr_for_preds_internal", "PPH-PEER-AGR-FOR-PREDS-INTERNAL", 1, 1, false);
		declareFunction(me, "pph_peer_agr_for_preds", "PPH-PEER-AGR-FOR-PREDS", 1, 1, false);
		declareFunction(me, "pph_peer_agr_for_pred_internal", "PPH-PEER-AGR-FOR-PRED-INTERNAL", 1, 1, false);
		declareFunction(me, "pph_peer_agr_for_pred", "PPH-PEER-AGR-FOR-PRED", 1, 1, false);
		declareFunction(me, "pph_generic_pos_preds", "PPH-GENERIC-POS-PREDS", 0, 0, false);
		declareFunction(me, "pph_default_nl_preds_for_term", "PPH-DEFAULT-NL-PREDS-FOR-TERM", 1, 0, false);
		declareFunction(me, "pph_default_nl_preds_for_term_from_inference_answer", "PPH-DEFAULT-NL-PREDS-FOR-TERM-FROM-INFERENCE-ANSWER", 1, 0, false);
		declareFunction(me, "pph_default_nl_pred_for_arg_of_reln", "PPH-DEFAULT-NL-PRED-FOR-ARG-OF-RELN", 2, 0, false);
		declareFunction(me, "pph_proven_sentence_from_inference_answer", "PPH-PROVEN-SENTENCE-FROM-INFERENCE-ANSWER", 0, 0, false);
		declareFunction(me, "pph_default_force_for_term", "PPH-DEFAULT-FORCE-FOR-TERM", 1, 0, false);
		declareFunction(me, "pph_force_from_cycl_force", "PPH-FORCE-FROM-CYCL-FORCE", 1, 0, false);
		declareFunction(me, "pph_expand_nl_preds", "PPH-EXPAND-NL-PREDS", 1, 0, false);
		declareFunction(me, "pph_generic_speech_part_preds_with_tense_and_aspect_internal", "PPH-GENERIC-SPEECH-PART-PREDS-WITH-TENSE-AND-ASPECT-INTERNAL", 0, 0, false);
		declareFunction(me, "pph_generic_speech_part_preds_with_tense_and_aspect", "PPH-GENERIC-SPEECH-PART-PREDS-WITH-TENSE-AND-ASPECT", 0, 0, false);
		declareFunction(me, "pph_present_tense_pred", "PPH-PRESENT-TENSE-PRED", 0, 0, false);
		declareFunction(me, "pph_present_perfect_tense_pred", "PPH-PRESENT-PERFECT-TENSE-PRED", 0, 0, false);
		declareFunction(me, "pph_past_tense_pred", "PPH-PAST-TENSE-PRED", 0, 0, false);
		declareFunction(me, "pph_future_tense_pred", "PPH-FUTURE-TENSE-PRED", 0, 0, false);
		declareFunction(me, "pph_tense_predP", "PPH-TENSE-PRED?", 1, 0, false);
		declareFunction(me, "pph_tense_pred_for_interval_subsuming_date_internal", "PPH-TENSE-PRED-FOR-INTERVAL-SUBSUMING-DATE-INTERNAL", 1, 1, false);
		declareFunction(me, "pph_tense_pred_for_interval_subsuming_date", "PPH-TENSE-PRED-FOR-INTERVAL-SUBSUMING-DATE", 1, 1, false);
		declareFunction(me, "pph_time_interval_subsumesP", "PPH-TIME-INTERVAL-SUBSUMES?", 2, 0, false);
		declareFunction(me, "tou_atomic_sentenceP", "TOU-ATOMIC-SENTENCE?", 1, 0, false);
		new pph_utilities.$tou_atomic_sentenceP$UnaryFunction();
		declareFunction(me, "clean_up_connectives", "CLEAN-UP-CONNECTIVES", 1, 0, false);
		declareFunction(me, "always_use_nameP", "ALWAYS-USE-NAME?", 1, 0, false);
		declareFunction(me, "pph_named_entityP_internal", "PPH-NAMED-ENTITY?-INTERNAL", 1, 1, false);
		declareFunction(me, "pph_named_entityP", "PPH-NAMED-ENTITY?", 1, 1, false);
		declareFunction(me, "pph_isa_anyP_internal", "PPH-ISA-ANY?-INTERNAL", 2, 1, false);
		declareFunction(me, "pph_isa_anyP", "PPH-ISA-ANY?", 2, 1, false);
		declareFunction(me, "pph_isa_repeated_argsP", "PPH-ISA-REPEATED-ARGS?", 3, 0, false);
		declareMacro(me, "noting_pph_isa_context", "NOTING-PPH-ISA-CONTEXT");
		declareFunction(me, "find_or_create_pph_isa_context", "FIND-OR-CREATE-PPH-ISA-CONTEXT", 0, 0, false);
		declareFunction(me, "pph_isaP_internal", "PPH-ISA?-INTERNAL", 2, 1, false);
		declareFunction(me, "pph_isaP", "PPH-ISA?", 2, 1, false);
		declareFunction(me, "pph_var_constrained_to_beP", "PPH-VAR-CONSTRAINED-TO-BE?", 2, 1, false);
		declareFunction(me, "pph_quoted_isaP_internal", "PPH-QUOTED-ISA?-INTERNAL", 2, 0, false);
		declareFunction(me, "pph_quoted_isaP", "PPH-QUOTED-ISA?", 2, 0, false);
		declareFunction(me, "pph_symbol_meets_quoted_defnP", "PPH-SYMBOL-MEETS-QUOTED-DEFN?", 2, 0, false);
		declareFunction(me, "pph_obj_meets_defnP", "PPH-OBJ-MEETS-DEFN?", 2, 0, false);
		declareFunction(me, "pph_collectionP", "PPH-COLLECTION?", 1, 0, false);
		declareFunction(me, "pph_nl_tagP", "PPH-NL-TAG?", 1, 0, false);
		declareFunction(me, "pph_instanceP", "PPH-INSTANCE?", 2, 1, false);
		declareFunction(me, "pph_arg_isaP", "PPH-ARG-ISA?", 3, 0, false);
		declareFunction(me, "pph_specP", "PPH-SPEC?", 2, 1, false);
		new pph_utilities.$pph_specP$BinaryFunction();
		declareFunction(me, "pph_proper_specP", "PPH-PROPER-SPEC?", 2, 1, false);
		declareFunction(me, "pph_genlP_internal", "PPH-GENL?-INTERNAL", 2, 1, false);
		declareFunction(me, "pph_genlP", "PPH-GENL?", 2, 1, false);
		declareFunction(me, "pph_genl_mtP_internal", "PPH-GENL-MT?-INTERNAL", 2, 0, false);
		declareFunction(me, "pph_genl_mtP", "PPH-GENL-MT?", 2, 0, false);
		declareFunction(me, "pph_spec_predicateP", "PPH-SPEC-PREDICATE?", 2, 1, false);
		new pph_utilities.$pph_spec_predicateP$BinaryFunction();
		declareFunction(me, "clear_pph_genl_predicateP", "CLEAR-PPH-GENL-PREDICATE?", 0, 0, false);
		declareFunction(me, "remove_pph_genl_predicateP", "REMOVE-PPH-GENL-PREDICATE?", 2, 1, false);
		declareFunction(me, "pph_genl_predicateP_internal", "PPH-GENL-PREDICATE?-INTERNAL", 3, 0, false);
		declareFunction(me, "pph_genl_predicateP", "PPH-GENL-PREDICATE?", 2, 1, false);
		new pph_utilities.$pph_genl_predicateP$BinaryFunction();
		declareFunction(me, "pph_genl_predicate_quickP", "PPH-GENL-PREDICATE-QUICK?", 3, 0, false);
		declareFunction(me, "pph_immediate_genl_preds", "PPH-IMMEDIATE-GENL-PREDS", 1, 0, false);
		declareFunction(me, "pph_immediate_spec_preds", "PPH-IMMEDIATE-SPEC-PREDS", 1, 0, false);
		declareFunction(me, "pph_genl_relationP", "PPH-GENL-RELATION?", 2, 0, false);
		declareFunction(me, "pph_relationP", "PPH-RELATION?", 1, 0, false);
		declareFunction(me, "pph_all_genl_relations", "PPH-ALL-GENL-RELATIONS", 1, 0, false);
		declareFunction(me, "pph_min_ceiling_cols", "PPH-MIN-CEILING-COLS", 1, 3, false);
		declareFunction(me, "pph_possible_pronoun_denotP", "PPH-POSSIBLE-PRONOUN-DENOT?", 1, 1, false);
		declareFunction(me, "pph_possible_pronoun_denotP_permissive_internal", "PPH-POSSIBLE-PRONOUN-DENOT?-PERMISSIVE-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_possible_pronoun_denotP_permissive", "PPH-POSSIBLE-PRONOUN-DENOT?-PERMISSIVE", 1, 0, false);
		declareFunction(me, "pph_possible_pronoun_denotP_strict_internal", "PPH-POSSIBLE-PRONOUN-DENOT?-STRICT-INTERNAL", 1, 0, false);
		declareFunction(me, "pph_possible_pronoun_denotP_strict", "PPH-POSSIBLE-PRONOUN-DENOT?-STRICT", 1, 0, false);
		declareFunction(me, "pph_nth_phrase_print_function_trampoline", "PPH-NTH-PHRASE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction(me, "pph_nth_phrase_p", "PPH-NTH-PHRASE-P", 1, 0, false);
		new pph_utilities.$pph_nth_phrase_p$UnaryFunction();
		declareFunction(me, "pph_nth_phrase_num", "PPH-NTH-PHRASE-NUM", 1, 0, false);
		declareFunction(me, "pph_nth_phrase_constraints", "PPH-NTH-PHRASE-CONSTRAINTS", 1, 0, false);
		declareFunction(me, "_csetf_pph_nth_phrase_num", "_CSETF-PPH-NTH-PHRASE-NUM", 2, 0, false);
		declareFunction(me, "_csetf_pph_nth_phrase_constraints", "_CSETF-PPH-NTH-PHRASE-CONSTRAINTS", 2, 0, false);
		declareFunction(me, "make_pph_nth_phrase", "MAKE-PPH-NTH-PHRASE", 0, 1, false);
		declareFunction(me, "visit_defstruct_pph_nth_phrase", "VISIT-DEFSTRUCT-PPH-NTH-PHRASE", 2, 0, false);
		declareFunction(me, "visit_defstruct_object_pph_nth_phrase_method", "VISIT-DEFSTRUCT-OBJECT-PPH-NTH-PHRASE-METHOD", 2, 0, false);
		declareFunction(me, "pprint_pph_nth_phrase", "PPRINT-PPH-NTH-PHRASE", 3, 0, false);
		declareFunction(me, "new_pph_nth_phrase", "NEW-PPH-NTH-PHRASE", 1, 1, false);
		declareFunction(me, "set_pph_nth_phrase_num", "SET-PPH-NTH-PHRASE-NUM", 2, 0, false);
		declareFunction(me, "set_pph_nth_phrase_constraints", "SET-PPH-NTH-PHRASE-CONSTRAINTS", 2, 0, false);
		declareFunction(me, "pph_add_constraints_to_nth_phrase", "PPH-ADD-CONSTRAINTS-TO-NTH-PHRASE", 2, 0, false);
		declareFunction(me, "cfasl_output_object_pph_nth_phrase_method", "CFASL-OUTPUT-OBJECT-PPH-NTH-PHRASE-METHOD", 2, 0, false);
		declareFunction(me, "cfasl_output_pph_nth_phrase", "CFASL-OUTPUT-PPH-NTH-PHRASE", 2, 0, false);
		declareFunction(me, "cfasl_input_pph_nth_phrase", "CFASL-INPUT-PPH-NTH-PHRASE", 1, 0, false);
		declareFunction(me, "maybe_initialize_pph_generation_preds", "MAYBE-INITIALIZE-PPH-GENERATION-PREDS", 0, 0, false);
		declareFunction(me, "clear_pph_nl_generation_predP", "CLEAR-PPH-NL-GENERATION-PRED?", 0, 0, false);
		declareFunction(me, "pph_nl_generation_predP", "PPH-NL-GENERATION-PRED?", 1, 1, false);
		declareFunction(me, "pph_pos_of_denotationP", "PPH-POS-OF-DENOTATION?", 1, 1, false);
		declareFunction(me, "pph_nl_pred_listP", "PPH-NL-PRED-LIST?", 1, 0, false);
		declareFunction(me, "valid_external_pph_nl_predsP", "VALID-EXTERNAL-PPH-NL-PREDS?", 1, 0, false);
		declareFunction(me, "valid_internal_pph_nl_predsP", "VALID-INTERNAL-PPH-NL-PREDS?", 1, 0, false);
		declareFunction(me, "pph_name_string_predP", "PPH-NAME-STRING-PRED?", 1, 0, false);
		declareFunction(me, "pph_speech_part_predP", "PPH-SPEECH-PART-PRED?", 1, 0, false);
		declareFunction(me, "pph_speech_partP", "PPH-SPEECH-PART?", 1, 0, false);
		declareFunction(me, "clear_pph_genl_categoryP", "CLEAR-PPH-GENL-CATEGORY?", 0, 0, false);
		declareFunction(me, "remove_pph_genl_categoryP", "REMOVE-PPH-GENL-CATEGORY?", 2, 1, false);
		declareFunction(me, "pph_genl_categoryP_internal", "PPH-GENL-CATEGORY?-INTERNAL", 3, 0, false);
		declareFunction(me, "pph_genl_categoryP", "PPH-GENL-CATEGORY?", 2, 1, false);
		declareFunction(me, "clear_pph_pos_of_category", "CLEAR-PPH-POS-OF-CATEGORY", 0, 0, false);
		declareFunction(me, "remove_pph_pos_of_category", "REMOVE-PPH-POS-OF-CATEGORY", 1, 1, false);
		declareFunction(me, "pph_pos_of_category_internal", "PPH-POS-OF-CATEGORY-INTERNAL", 2, 0, false);
		declareFunction(me, "pph_pos_of_category", "PPH-POS-OF-CATEGORY", 1, 1, false);
		declareFunction(me, "pph_genl_posP", "PPH-GENL-POS?", 2, 1, false);
		declareFunction(me, "pph_np_category", "PPH-NP-CATEGORY", 0, 0, false);
		declareFunction(me, "pph_npP", "PPH-NP?", 1, 0, false);
		declareFunction(me, "pph_sP", "PPH-S?", 1, 0, false);
		declareFunction(me, "pph_verbP", "PPH-VERB?", 1, 0, false);
		declareFunction(me, "pph_pp_category", "PPH-PP-CATEGORY", 0, 0, false);
		declareFunction(me, "pph_ppP", "PPH-PP?", 1, 0, false);
		declareFunction(me, "pph_adjpP", "PPH-ADJP?", 1, 0, false);
		declareFunction(me, "pph_adjP", "PPH-ADJ?", 1, 0, false);
		declareFunction(me, "pph_clauseP", "PPH-CLAUSE?", 1, 0, false);
		declareFunction(me, "pph_nbar_category", "PPH-NBAR-CATEGORY", 0, 0, false);
		declareFunction(me, "pph_nbarP", "PPH-NBAR?", 1, 0, false);
		declareFunction(me, "pph_vbar_category", "PPH-VBAR-CATEGORY", 0, 0, false);
		declareFunction(me, "pph_spec_pos_predP", "PPH-SPEC-POS-PRED?", 2, 1, false);
		declareFunction(me, "pph_genl_pos_predP", "PPH-GENL-POS-PRED?", 2, 1, false);
		declareFunction(me, "pph_filter_preds", "PPH-FILTER-PREDS", 2, 1, false);
		declareFunction(me, "pph_filter_ordered_preds", "PPH-FILTER-ORDERED-PREDS", 2, 1, false);
		declareFunction(me, "pph_pred_licensed_by_predsP", "PPH-PRED-LICENSED-BY-PREDS?", 2, 0, false);
		declareFunction(me, "pph_pred_licensed_by_predP", "PPH-PRED-LICENSED-BY-PRED?", 2, 1, false);
		new pph_utilities.$pph_pred_licensed_by_predP$BinaryFunction();
		declareFunction(me, "pph_filter_two_preds_memoized_internal", "PPH-FILTER-TWO-PREDS-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction(me, "pph_filter_two_preds_memoized", "PPH-FILTER-TWO-PREDS-MEMOIZED", 3, 0, false);
		declareFunction(me, "pph_filter_preds_memoized_internal", "PPH-FILTER-PREDS-MEMOIZED-INTERNAL", 3, 1, false);
		declareFunction(me, "pph_filter_preds_memoized", "PPH-FILTER-PREDS-MEMOIZED", 3, 1, false);
		declareFunction(me, "pph_max_spec_speech_part_preds", "PPH-MAX-SPEC-SPEECH-PART-PREDS", 1, 2, false);
		declareFunction(me, "pph_union_preds", "PPH-UNION-PREDS", 2, 0, false);
		declareFunction(me, "pph_unify_speech_part_preds", "PPH-UNIFY-SPEECH-PART-PREDS", 1, 0, false);
		declareFunction(me, "pph_unify_speech_part_preds_or_choose", "PPH-UNIFY-SPEECH-PART-PREDS-OR-CHOOSE", 2, 0, false);
		declareFunction(me, "pph_convert_required_nl_preds_to_preferred", "PPH-CONVERT-REQUIRED-NL-PREDS-TO-PREFERRED", 1, 0, false);
		declareFunction(me, "pph_default_agr_preds_for_type_pred", "PPH-DEFAULT-AGR-PREDS-FOR-TYPE-PRED", 0, 0, false);
		declareFunction(me, "pph_default_nl_preds_for_type_list", "PPH-DEFAULT-NL-PREDS-FOR-TYPE-LIST", 1, 1, false);
		declareFunction(me, "pph_default_nl_preds", "PPH-DEFAULT-NL-PREDS", 1, 3, false);
		declareFunction(me, "pph_adjust_nl_preds_for_mt_scope", "PPH-ADJUST-NL-PREDS-FOR-MT-SCOPE", 2, 0, false);
		declareFunction(me, "pph_language_mt_from_code", "PPH-LANGUAGE-MT-FROM-CODE", 1, 0, false);
		declareFunction(me, "get_pph_mt_for_code", "GET-PPH-MT-FOR-CODE", 1, 0, false);
		declareFunction(me, "pph_guess_spp_for_string", "PPH-GUESS-SPP-FOR-STRING", 1, 0, false);
		declareFunction(me, "pph_switch_arg1_and_arg2", "PPH-SWITCH-ARG1-AND-ARG2", 1, 0, false);
		declareFunction(me, "genformat_arg_fixed_matches_argsP", "GENFORMAT-ARG-FIXED-MATCHES-ARGS?", 2, 0, false);
		declareFunction(me, "pph_special_handling_availableP", "PPH-SPECIAL-HANDLING-AVAILABLE?", 1, 0, false);
		declareFunction(me, "pph_formula_with_dotsP", "PPH-FORMULA-WITH-DOTS?", 1, 0, false);
		declareFunction(me, "pph_mapcar", "PPH-MAPCAR", 2, 0, false);
		declareFunction(me, "pph_example_formulas", "PPH-EXAMPLE-FORMULAS", 1, 0, false);
		declareFunction(me, "pph_arity", "PPH-ARITY", 1, 0, false);
		declareFunction(me, "pph_dummy_formula", "PPH-DUMMY-FORMULA", 1, 1, false);
		declareFunction(me, "el_var_to_keyword", "EL-VAR-TO-KEYWORD", 1, 0, false);
		declareFunction(me, "pph_agr_constraint_typeP", "PPH-AGR-CONSTRAINT-TYPE?", 1, 0, false);
		declareFunction(me, "pph_inheritable_agr_constraint_typeP", "PPH-INHERITABLE-AGR-CONSTRAINT-TYPE?", 1, 0, false);
		declareFunction(me, "pph_absolute_agr_constraint_typeP", "PPH-ABSOLUTE-AGR-CONSTRAINT-TYPE?", 1, 0, false);
		declareFunction(me, "pph_relative_agr_constraint_typeP", "PPH-RELATIVE-AGR-CONSTRAINT-TYPE?", 1, 0, false);
		declareFunction(me, "pph_relative_agr_constraint_types", "PPH-RELATIVE-AGR-CONSTRAINT-TYPES", 0, 0, false);
		declareFunction(me, "new_pph_agr_constraint", "NEW-PPH-AGR-CONSTRAINT", 2, 0, false);
		declareFunction(me, "new_pph_dont_care_agr_constraint", "NEW-PPH-DONT-CARE-AGR-CONSTRAINT", 0, 0, false);
		declareFunction(me, "new_pph_impossible_agr_constraint", "NEW-PPH-IMPOSSIBLE-AGR-CONSTRAINT", 0, 0, false);
		declareFunction(me, "pph_agr_constraint_p", "PPH-AGR-CONSTRAINT-P", 1, 0, false);
		declareFunction(me, "pph_inheritable_agr_constraint_p", "PPH-INHERITABLE-AGR-CONSTRAINT-P", 1, 0, false);
		declareFunction(me, "pph_absolute_agr_constraint_p", "PPH-ABSOLUTE-AGR-CONSTRAINT-P", 1, 0, false);
		declareFunction(me, "pph_relative_agr_constraint_p", "PPH-RELATIVE-AGR-CONSTRAINT-P", 1, 0, false);
		declareFunction(me, "pph_dont_care_agr_constraint_p", "PPH-DONT-CARE-AGR-CONSTRAINT-P", 1, 0, false);
		declareFunction(me, "pph_impossible_agr_constraint_p", "PPH-IMPOSSIBLE-AGR-CONSTRAINT-P", 1, 0, false);
		declareFunction(me, "pph_peer_agr_constraint_p", "PPH-PEER-AGR-CONSTRAINT-P", 1, 0, false);
		declareFunction(me, "pph_agr_constraint_type", "PPH-AGR-CONSTRAINT-TYPE", 1, 0, false);
		declareFunction(me, "pph_agr_constraint_target", "PPH-AGR-CONSTRAINT-TARGET", 1, 0, false);
		declareFunction(me, "pph_agr_constraint_set_target", "PPH-AGR-CONSTRAINT-SET-TARGET", 2, 0, false);
		declareFunction(me, "pph_agr_constraint_set_type", "PPH-AGR-CONSTRAINT-SET-TYPE", 2, 0, false);
		declareFunction(me, "pph_agr_constraint_copy", "PPH-AGR-CONSTRAINT-COPY", 1, 1, false);
		declareFunction(me, "pph_agr_constraint_target_copy", "PPH-AGR-CONSTRAINT-TARGET-COPY", 1, 1, false);
		declareFunction(me, "pph_index_attrP", "PPH-INDEX-ATTR?", 1, 0, false);
		declareFunction(me, "pph_open_tag_grep_regex", "PPH-OPEN-TAG-GREP-REGEX", 0, 0, false);
		declareFunction(me, "pph_close_tag_grep_regex", "PPH-CLOSE-TAG-GREP-REGEX", 0, 0, false);
		declareFunction(me, "pph_regex_availableP", "PPH-REGEX-AVAILABLE?", 0, 0, false);
		declareFunction(me, "pph_regex_behaves_as_expectedP", "PPH-REGEX-BEHAVES-AS-EXPECTED?", 0, 0, false);
		declareFunction(me, "pph_closed_html_tagsP", "PPH-CLOSED-HTML-TAGS?", 2, 0, false);
		declareFunction(me, "pph_html_open_tags_in_string", "PPH-HTML-OPEN-TAGS-IN-STRING", 1, 0, false);
		declareFunction(me, "pph_html_close_tags_in_string", "PPH-HTML-CLOSE-TAGS-IN-STRING", 1, 0, false);
		declareFunction(me, "pph_html_tag_matchP", "PPH-HTML-TAG-MATCH?", 2, 0, false);
		declareFunction(me, "pph_arg_position_p", "PPH-ARG-POSITION-P", 1, 0, false);
		declareFunction(me, "pph_known_arg_position_p", "PPH-KNOWN-ARG-POSITION-P", 1, 0, false);
		declareFunction(me, "pph_unknown_arg_position", "PPH-UNKNOWN-ARG-POSITION", 0, 0, false);
		declareFunction(me, "pph_unknown_arg_position_p", "PPH-UNKNOWN-ARG-POSITION-P", 1, 0, false);
		declareFunction(me, "pph_arg_position_prefix_p", "PPH-ARG-POSITION-PREFIX-P", 1, 0, false);
		declareFunction(me, "pph_arg_position_mapping_p", "PPH-ARG-POSITION-MAPPING-P", 1, 0, false);
		declareFunction(me, "pph_new_empty_map", "PPH-NEW-EMPTY-MAP", 0, 0, false);
		declareFunction(me, "pph_empty_map_p", "PPH-EMPTY-MAP-P", 1, 0, false);
		declareFunction(me, "pph_add_mapping", "PPH-ADD-MAPPING", 3, 0, false);
		declareFunction(me, "pph_map_has_more_general_from_prefixP", "PPH-MAP-HAS-MORE-GENERAL-FROM-PREFIX?", 2, 0, false);
		declareFunction(me, "pph_prefix_no_more_generalP", "PPH-PREFIX-NO-MORE-GENERAL?", 2, 0, false);
		declareFunction(me, "pph_prefix_more_generalP", "PPH-PREFIX-MORE-GENERAL?", 2, 0, false);
		declareFunction(me, "pph_prefix_map_p", "PPH-PREFIX-MAP-P", 1, 0, false);
		declareFunction(me, "pph_new_prefix_map", "PPH-NEW-PREFIX-MAP", 1, 0, false);
		declareFunction(me, "pph_identity_map", "PPH-IDENTITY-MAP", 0, 0, false);
		declareFunction(me, "pph_identity_map_p", "PPH-IDENTITY-MAP-P", 1, 0, false);
		declareFunction(me, "pph_new_identity_map", "PPH-NEW-IDENTITY-MAP", 0, 0, false);
		declareFunction(me, "pph_prefix_map_prefix", "PPH-PREFIX-MAP-PREFIX", 1, 0, false);
		declareFunction(me, "pph_arg_position_map_p", "PPH-ARG-POSITION-MAP-P", 1, 0, false);
		declareFunction(me, "pph_arg_position_map_copy", "PPH-ARG-POSITION-MAP-COPY", 1, 0, false);
		declareFunction(me, "pph_figure_new_arg_position_map", "PPH-FIGURE-NEW-ARG-POSITION-MAP", 2, 0, false);
		declareFunction(me, "pph_combine_maps", "PPH-COMBINE-MAPS", 1, 0, false);
		declareFunction(me, "pph_contextualize_map", "PPH-CONTEXTUALIZE-MAP", 2, 0, false);
		declareFunction(me, "pph_contextualize_arg_position", "PPH-CONTEXTUALIZE-ARG-POSITION", 2, 0, false);
		declareFunction(me, "pph_contextualize_output_item_arg_position", "PPH-CONTEXTUALIZE-OUTPUT-ITEM-ARG-POSITION", 2, 0, false);
		declareFunction(me, "pph_arg_position_precedesP", "PPH-ARG-POSITION-PRECEDES?", 2, 0, false);
		declareFunction(me, "pph_arg_position_subsumesP", "PPH-ARG-POSITION-SUBSUMES?", 2, 1, false);
		new pph_utilities.$pph_arg_position_subsumesP$BinaryFunction();
		declareFunction(me, "pph_nested_arg_position", "PPH-NESTED-ARG-POSITION", 1, 0, false);
		declareFunction(me, "clear_pph_arg_position_lookup", "CLEAR-PPH-ARG-POSITION-LOOKUP", 0, 0, false);
		declareFunction(me, "remove_pph_arg_position_lookup", "REMOVE-PPH-ARG-POSITION-LOOKUP", 2, 0, false);
		declareFunction(me, "pph_arg_position_lookup_internal", "PPH-ARG-POSITION-LOOKUP-INTERNAL", 2, 0, false);
		declareFunction(me, "pph_arg_position_lookup", "PPH-ARG-POSITION-LOOKUP", 2, 0, false);
		declareFunction(me, "pph_top_level_arg_position", "PPH-TOP-LEVEL-ARG-POSITION", 1, 0, false);
		declareFunction(me, "pph_arg_position_find_mapping", "PPH-ARG-POSITION-FIND-MAPPING", 2, 0, false);
		declareFunction(me, "pph_remove_prefix", "PPH-REMOVE-PREFIX", 2, 0, false);
		declareFunction(me, "pph_add_prefix", "PPH-ADD-PREFIX", 2, 0, false);
		declareFunction(me, "test_medical_variable_name_optimization", "TEST-MEDICAL-VARIABLE-NAME-OPTIMIZATION", 2, 0, false);
		declareFunction(me, "test_nconcatenate_pph_javalists", "TEST-NCONCATENATE-PPH-JAVALISTS", 2, 0, false);
		declareFunction(me, "add_determiner", "ADD-DETERMINER", 1, 0, false);
		declareFunction(me, "pph_formula_wXmt_scopeP", "PPH-FORMULA-W/MT-SCOPE?", 1, 0, false);
		declareFunction(me, "pph_mt_scope_predicate_p", "PPH-MT-SCOPE-PREDICATE-P", 1, 0, false);
		declareFunction(me, "pph_mt_scope_p", "PPH-MT-SCOPE-P", 1, 0, false);
		declareFunction(me, "pph_null_mt_scope", "PPH-NULL-MT-SCOPE", 0, 0, false);
		declareFunction(me, "pph_null_mt_scopeP", "PPH-NULL-MT-SCOPE?", 1, 0, false);
		declareFunction(me, "pph_mt_scope", "PPH-MT-SCOPE", 1, 0, false);
		declareFunction(me, "pph_tensed_preds_for_mt_scope", "PPH-TENSED-PREDS-FOR-MT-SCOPE", 1, 2, false);
		declareFunction(me, "keyword_or_hlmtP", "KEYWORD-OR-HLMT?", 1, 0, false);
		declareFunction(me, "string_or_nil_p", "STRING-OR-NIL-P", 1, 0, false);
		declareFunction(me, "keyword_or_nil_p", "KEYWORD-OR-NIL-P", 1, 0, false);
		declareFunction(me, "predicate_or_nil_p", "PREDICATE-OR-NIL-P", 1, 0, false);
		declareFunction(me, "non_negative_integer_or_nil_p", "NON-NEGATIVE-INTEGER-OR-NIL-P", 1, 0, false);
		declareFunction(me, "get_all_pretty_strings", "GET-ALL-PRETTY-STRINGS", 1, 0, false);
		declareFunction(me, "get_pretty_string_canonical", "GET-PRETTY-STRING-CANONICAL", 1, 0, false);
		declareFunction(me, "current_kb_has_pretty_strings_assertedP", "CURRENT-KB-HAS-PRETTY-STRINGS-ASSERTED?", 0, 0, false);
		declareFunction(me, "assert_pretty_strings", "ASSERT-PRETTY-STRINGS", 1, 3, false);
		declareFunction(me, "accumulate_pretty_strings_from_iterator", "ACCUMULATE-PRETTY-STRINGS-FROM-ITERATOR", 2, 5, false);
		declareFunction(me, "accumulate_pretty_strings", "ACCUMULATE-PRETTY-STRINGS", 2, 3, false);
		declareFunction(me, "compute_pretty_string_canonical", "COMPUTE-PRETTY-STRING-CANONICAL", 1, 2, false);
		declareFunction(me, "get_fallback_pretty_string_canonical_for_unary_function", "GET-FALLBACK-PRETTY-STRING-CANONICAL-FOR-UNARY-FUNCTION", 3, 0, false);
		declareFunction(me, "compute_all_pretty_strings", "COMPUTE-ALL-PRETTY-STRINGS", 1, 0, false);
		return NIL;
	}

	public static SubLObject init_pph_utilities_file() {
		defconstant("*FORCE-PREFIX-WITH-A*", $list0);
		defconstant("*PREFIX-WITH-AN*", $list1);
		defconstant("*PREFIX-WITH-A*", $list2);
		defvar("*ALWAYS-USE-NAMES*", NIL);
		defconstant("*PPH-DEFAULT-NP-AGR-PRED*", $$nonPlural_Generic);
		defconstant("*ALWAYS-USE-INSTANCES-NAMES*", NIL);
		defconstant("*PPH-REMOVE-SPACES-BEFORE*", $list4);
		defconstant("*PPH-REMOVE-SPACES-AFTER*", $list5);
		deflexical("*PPH-NBAR-NART*", SubLTrampolineFile.maybeDefault($pph_nbar_nart$, $pph_nbar_nart$, NIL));
		deflexical("*PARAPHRASE-CORE-CONSTANTS*", $list8);
		defparameter("*PPH-CURRENT-ENVIRONMENT*", NIL);
		deflexical("*RESOURCED-PPH-ENVIRONMENT-STACKS*", queues.create_queue(UNPROVIDED));
		deflexical("*RESOURCED-PPH-ENVIRONMENT-STACKS-LOCK*", make_lock($$$Resourced_PPH_Environment_Stacks));
		deflexical("*PPH-TYPED-GENL-PREDS-VIA-INFERENCE-CACHING-STATE*", NIL);
		defparameter("*DETERMINER-KEYS*", $list52);
		defparameter("*DETERMINER-WORDS*", $list53);
		deflexical("*UCRONYMS*", $list63);
		defconstant("*PPH-CASE-KEYWORDS*", $list81);
		defconstant("*PPH-DEFINITENESS-KEYWORDS*", $list119);
		defconstant("*PPH-DEFINITE-ENGLISH-DETERMINER-TYPES*", $list163);
		deflexical("*PPH-VAR-TYPING-PREDICATES*", $list195);
		deflexical("*PPH-VAR-TYPING-PREDICATES-CACHING-STATE*", NIL);
		deflexical("*ALL-PPH-VAR-TYPING-PREDICATES-CACHING-STATE*", NIL);
		deflexical("*PPH-VAR-TYPE-POSITION-CACHING-STATE*", NIL);
		deflexical("*PPH-WORD-FINAL-PUNCTUATION-CHARS*", $str215$____);
		defconstant("*PPH-STRINGS-TO-NOT-CAPITALIZE*", $list223);
		defparameter("*PPH-UNRESOLVABLE-INDEXICALS*", set.new_set(symbol_function(EQUAL), UNPROVIDED));
		deflexical("*PPH-INDEXICAL-DATES-CACHING-STATE*", NIL);
		deflexical("*PPH-INDEXICAL-DATE-REFERENT-CACHED-CACHING-STATE*", NIL);
		deflexical("*PPH-SUBJECT-ROLE-PREDS*", set.new_set(symbol_function(EQUAL), FOUR_INTEGER));
		defconstant("*PPH-IDENTITY-TEMPLATE*", $SELF);
		defconstant("*PPH-IMPOSSIBLE-TEMPLATE*", $PPH_IMPOSSIBLE_TEMPLATE);
		defparameter("*RESOLVE-ARG-POSITION-SPECIFIERS?*", T);
		deflexical("*PPH-APPLY-TEMPLATE-CACHING-STATE*", NIL);
		defparameter("*PPH-QUERY-STACK*", $UNINITIALIZED);
		defparameter("*PPH-QUERY-STACK-MAX-SIZE*", FOUR_INTEGER);
		deflexical("*PPH-INFERENCE-DESTROYER-GRACE-PERIOD*", $int$600);
		deflexical("*PPH-INFERENCE-DESTROYER*", SubLTrampolineFile.maybeDefault($pph_inference_destroyer$, $pph_inference_destroyer$, () -> delayed_processor.new_delayed_processor($pph_inference_destroyer_grace_period$.getGlobalValue(), $sym397$DESTROYABLE_PPH_INFERENCE_, PPH_DESTROY_INFERENCE)));
		defparameter("*PPH-QUERY-CUMULATIVE-TIME*", misc_utilities.uninitialized());
		defparameter("*VERIFY-PPH-REMOVAL-ASK-BOOLEAN?*", NIL);
		defparameter("*PPH-OPTIMIZED-VARS*", NIL);
		deflexical("*PPH-OPTIMIZED-VAR-NAME-MAX-LENGTH*", $int$30);
		defparameter("*OPTIMIZE-DEPTH*", ZERO_INTEGER);
		defconstant("*PPH-BULLET-CHARS*", $str502$____);
		deflexical("*PPH-JAVALIST-SORT-XYZ-PARAPHRASES-CACHING-STATE*", NIL);
		defconstant("*PPH-HL-ONLY-TERMS*", $list558);
		deflexical("*PPH-ENGLISH-CONTEXT?-CACHING-STATE*", NIL);
		deflexical("*PPH-PREFER-ASSERTION?-CACHING-STATE*", NIL);
		defparameter("*PPH-ISA-CONTEXT*", NIL);
		deflexical("*PPH-GENL-PREDICATE?-CACHING-STATE*", NIL);
		defconstant("*DTP-PPH-NTH-PHRASE*", PPH_NTH_PHRASE);
		defconstant("*CFASL-OPCODE-PPH-NTH-PHRASE*", $int$75);
		deflexical("*PPH-GENERATION-PREDS*", misc_utilities.uninitialized());
		deflexical("*PPH-GENL-CATEGORY?-CACHING-STATE*", NIL);
		deflexical("*PPH-POS-OF-CATEGORY-CACHING-STATE*", NIL);
		defconstant("*PPH-NP-CATEGORY*", $$NounPhrase);
		defconstant("*PPH-PP-CATEGORY*", $$PrepositionalPhrase);
		defconstant("*PPH-FAILSAFE-NL-PREDS*", $list700);
		deflexical("*PPH-DEFAULT-AGR-PREDS-FOR-TYPE-PRED*", NIL);
		defconstant("*PPH-AGR-CONSTRAINT-TYPES*", $list723);
		defconstant("*PPH-INHERITABLE-AGR-CONSTRAINT-TYPES*", $list724);
		defconstant("*PPH-ABSOLUTE-AGR-CONSTRAINT-TYPES*", $list724);
		defconstant("*PPH-RELATIVE-AGR-CONSTRAINT-TYPES*", $list725);
		defconstant("*PPH-OPEN-TAG-GREP-REGEX*", $str730$__a_z________);
		defconstant("*PPH-CLOSE-TAG-GREP-REGEX*", $str731$___a_z________);
		deflexical("*PPH-REGEX-AVAILABLE?*", $UNKNOWN);
		defconstant("*PPH-UNKNOWN-ARG-POSITION*", $PPH_UNKNOWN_ARG_POSITION);
		deflexical("*PPH-IDENTITY-MAP*", $UNINITIALIZED);
		deflexical("*PPH-ARG-POSITION-LOOKUP-CACHING-STATE*", NIL);
		defconstant("*PPH-MT-SCOPE-PREDICATES*", $list775);
		defparameter("*PPH-NULL-MT-SCOPE*", $PPH_NULL_MT_SCOPE);
		defparameter("*ALL-PRETTY-STRINGS-SOFT-TIMEOUT*", $int$60);
		defparameter("*ALL-PRETTY-STRINGS-HARD-TIMEOUT*", $int$120);
		defparameter("*ALL-PRETTY-STRINGS-MAX-NUMBER*", TWENTY_INTEGER);
		deflexical("*PRETTY-STRING-GENERATION-MT*", $$PrettyStringGenerationMt);
		return NIL;
	}

	public static SubLObject setup_pph_utilities_file() {
		declare_defglobal($pph_nbar_nart$);
		register_macro_helper(PPH_PUSH_ENVIRONMENT, WITH_PARAPHRASE_CONTEXT);
		register_macro_helper(PPH_POP_ENVIRONMENT, WITH_PARAPHRASE_CONTEXT);
		register_macro_helper(FIND_OR_CREATE_PPH_CONTEXT, WITH_PARAPHRASE_CONTEXT);
		memoization_state.note_memoized_function(PPH_PRECISION_FOR_OBJECT_INT);
		memoization_state.note_globally_cached_function(PPH_TYPED_GENL_PREDS_VIA_INFERENCE);
		memoization_state.note_globally_cached_function(PPH_VAR_TYPING_PREDICATES);
		memoization_state.note_globally_cached_function(ALL_PPH_VAR_TYPING_PREDICATES);
		memoization_state.note_globally_cached_function(PPH_VAR_TYPE_POSITION);
		memoization_state.note_memoized_function(PPH_REMOVE_EXTRA_SPACES_INT);
		memoization_state.note_memoized_function(PPH_POSSIBLY_NARTIFY_INTERNAL);
		memoization_state.note_memoized_function(PPH_NART_SUBSTITUTE);
		memoization_state.note_globally_cached_function(PPH_INDEXICAL_DATES);
		memoization_state.note_globally_cached_function(PPH_INDEXICAL_DATE_REFERENT_CACHED);
		register_macro_helper(PPH_STACK_ISTS, PPH_UNPACKING_ISTS);
		register_macro_helper(PPH_UNSTACK_ISTS, PPH_UNPACKING_ISTS);
		memoization_state.note_memoized_function($sym325$PPH_BAD_EXPANSION_TEMPLATE_);
		memoization_state.note_globally_cached_function(PPH_APPLY_TEMPLATE);
		memoization_state.note_memoized_function(PPH_ASK_LIT);
		declare_defglobal($pph_inference_destroyer$);
		note_funcall_helper_function($sym397$DESTROYABLE_PPH_INFERENCE_);
		note_funcall_helper_function(SMITE_DOOMED_PPH_INFERENCES_NEXT_TIME_AROUND);
		Storage.register_low_memory_callback(symbol_function(SMITE_DOOMED_PPH_INFERENCES_NEXT_TIME_AROUND));
		note_funcall_helper_function(PPH_DESTROY_INFERENCE);
		memoization_state.note_memoized_function(PPH_REMOVAL_ASK_VARIABLE);
		memoization_state.note_memoized_function(PPH_REMOVAL_ASK_BOOLEAN);
		memoization_state.note_memoized_function(PPH_ASK_BOOLEAN);
		memoization_state.note_memoized_function(PPH_ASK_BINDINGS);
		memoization_state.note_memoized_function(PPH_ASK_TEMPLATE_NEW);
		register_cyc_api_function(PPH_OPTIMIZED_NAMES_FOR_VARIABLES, $list449, $str450$returns_an_association_list_mappi, $list451, $list452);
		memoization_state.note_memoized_function(PPH_VAR_RELN_ARG_POSITION_PAIRS);
		memoization_state.note_globally_cached_function(PPH_JAVALIST_SORT_XYZ_PARAPHRASES);
		define_test_case_table_int(TEST_XYZ_SORT_STRINGS, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list534);
		memoization_state.note_memoized_function(PPH_SALIENT_GENERALIZATIONS_INT);
		memoization_state.note_memoized_function(PPH_SENTENCE_FROM_ASSERTION);
		memoization_state.note_globally_cached_function($sym559$PPH_ENGLISH_CONTEXT_);
		memoization_state.note_globally_cached_function($sym562$PPH_PREFER_ASSERTION_);
		memoization_state.note_memoized_function(PPH_STRING_FREQUENCY);
		memoization_state.note_memoized_function($sym464$PPH_GENERALITY_ESTIMATE_);
		memoization_state.note_memoized_function(PPH_PEER_AGR_FOR_PREDS);
		memoization_state.note_memoized_function(PPH_PEER_AGR_FOR_PRED);
		memoization_state.note_memoized_function(PPH_GENERIC_SPEECH_PART_PREDS_WITH_TENSE_AND_ASPECT);
		memoization_state.note_memoized_function(PPH_TENSE_PRED_FOR_INTERVAL_SUBSUMING_DATE);
		memoization_state.note_memoized_function($sym614$PPH_NAMED_ENTITY_);
		memoization_state.note_memoized_function($sym615$PPH_ISA_ANY_);
		register_macro_helper(FIND_OR_CREATE_PPH_ISA_CONTEXT, NOTING_PPH_ISA_CONTEXT);
		memoization_state.note_memoized_function($sym626$PPH_ISA_);
		memoization_state.note_memoized_function($sym629$PPH_QUOTED_ISA_);
		memoization_state.note_memoized_function($sym636$PPH_GENL_);
		memoization_state.note_memoized_function($sym638$PPH_GENL_MT_);
		memoization_state.note_globally_cached_function($sym55$PPH_GENL_PREDICATE_);
		memoization_state.note_memoized_function($sym645$PPH_POSSIBLE_PRONOUN_DENOT__PERMISSIVE);
		memoization_state.note_memoized_function($sym646$PPH_POSSIBLE_PRONOUN_DENOT__STRICT);
		register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_nth_phrase$.getGlobalValue(), symbol_function(PPH_NTH_PHRASE_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list657);
		def_csetf(PPH_NTH_PHRASE_NUM, _CSETF_PPH_NTH_PHRASE_NUM);
		def_csetf(PPH_NTH_PHRASE_CONSTRAINTS, _CSETF_PPH_NTH_PHRASE_CONSTRAINTS);
		identity(PPH_NTH_PHRASE);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_nth_phrase$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_NTH_PHRASE_METHOD));
		register_cfasl_input_function($cfasl_opcode_pph_nth_phrase$.getGlobalValue(), CFASL_INPUT_PPH_NTH_PHRASE);
		register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_pph_nth_phrase$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_PPH_NTH_PHRASE_METHOD));
		memoization_state.note_globally_cached_function($sym681$PPH_GENL_CATEGORY_);
		memoization_state.note_globally_cached_function(PPH_POS_OF_CATEGORY);
		memoization_state.note_memoized_function(PPH_FILTER_TWO_PREDS_MEMOIZED);
		memoization_state.note_memoized_function(PPH_FILTER_PREDS_MEMOIZED);
		memoization_state.note_globally_cached_function(PPH_ARG_POSITION_LOOKUP);
		sunit_external.define_test_category($$$Paraphrase_Utilities, UNPROVIDED);
		define_test_case_table_int(PPH_PRECISION_P, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $TINY, $WORKING_, T }), $list749);
		define_test_case_table_int(PPH_OPTIMIZE_FORMULA_VARIABLE_NAMES, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list751);
		define_test_case_table_int(PPH_OPTIMIZE_FORMULA_VARIABLE_NAME, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list753);
		define_test_case_table_int(TEST_NCONCATENATE_PPH_JAVALISTS, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list757);
		define_test_case_table_int($sym626$PPH_ISA_, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list758);
		define_test_case_table_int($sym636$PPH_GENL_, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list759);
		define_test_case_table_int($sym55$PPH_GENL_PREDICATE_, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list760);
		define_test_case_table_int(PPH_ASK_BOOLEAN, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list761);
		define_test_case_table_int(PPH_FIGURE_NEW_ARG_POSITION_MAP, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list763);
		define_test_case_table_int(PPH_ARG_POSITION_LOOKUP, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list764);
		define_test_case_table_int(PPH_APPLY_TEMPLATE, list(new SubLObject[] { $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list765);
		define_test_case_table_int(PPH_FILTER_PREDS, list(new SubLObject[] { $TEST, $sym767$SETS_EQUAL_, $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list768);
		define_test_case_table_int($sym769$AN_STRING_, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list770);
		define_test_case_table_int($sym771$PPH_CLOSED_HTML_TAGS_, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, $list530, $KB, $FULL, $WORKING_, T }), $list772);
		sunit_external.define_test_suite($$$Paraphrase_Utilities_Test_Suite, $list774, UNPROVIDED, UNPROVIDED);
		register_external_symbol(GET_ALL_PRETTY_STRINGS);
		register_external_symbol(GET_PRETTY_STRING_CANONICAL);
		return NIL;
	}

	private static SubLObject _constant_534_initializer() {
		return list(new SubLObject[] {
				list(list(list(makeString("Y is a leader of X."),
						list(new SubLObject[] { list(makeString("Y"), makeSymbol("?Y"), list(TWO_INTEGER), makeString("<i>"), makeString("</i>"), ZERO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ONE_INTEGER),
								list(makeString("is"), reader_make_constant_shell(makeString("hasLeaders")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&5458\" target=\"_self\">"), NIL, TWO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("hasLeaders")), list(ZERO_INTEGER), NIL, NIL, FOUR_INTEGER),
								list(makeString("a"), reader_make_constant_shell(makeString("hasLeaders")), list(ZERO_INTEGER), NIL, NIL, FIVE_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("hasLeaders")), list(ZERO_INTEGER), NIL, NIL, SIX_INTEGER), list(makeString("leader"), reader_make_constant_shell(makeString("hasLeaders")), list(ZERO_INTEGER), NIL, NIL, SEVEN_INTEGER),
								list(makeString(" "), reader_make_constant_shell(makeString("hasLeaders")), list(ZERO_INTEGER), NIL, NIL, THIRTEEN_INTEGER), list(makeString("of"), reader_make_constant_shell(makeString("hasLeaders")), list(ZERO_INTEGER), NIL, makeString("</a>"), FOURTEEN_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, SIXTEEN_INTEGER),
								list(makeString("X"), makeSymbol("?X"), list(ONE_INTEGER), makeString("<i>"), makeString("</i>"), SEVENTEEN_INTEGER), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, EIGHTEEN_INTEGER) }))),
						makeString("X is a leader of Y.")),
				list(list(list(makeString("Y is X's leader."),
						list(list(makeString("Y"), makeSymbol("?Y"), list(TWO_INTEGER), makeString("<i>"), makeString("</i>"), ZERO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ONE_INTEGER),
								list(makeString("is"), reader_make_constant_shell(makeString("isLedBy")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&140751\" target=\"_self\">"), makeString("</a>"), TWO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOUR_INTEGER),
								list(makeString("X's"), makeSymbol("?X"), list(ONE_INTEGER), makeString("<i>"), makeString("</i>"), FIVE_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, EIGHT_INTEGER),
								list(makeString("leader"), reader_make_constant_shell(makeString("isLedBy")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&140751\" target=\"_self\">"), makeString("</a>"), NINE_INTEGER), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FIFTEEN_INTEGER)))),
						makeString("X is Y's leader.")),
				list(list(list(makeString("Y is X's followers."),
						list(list(makeString("Y"), makeSymbol("?Y"), list(TWO_INTEGER), makeString("<i>"), makeString("</i>"), ZERO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ONE_INTEGER),
								list(makeString("is"), reader_make_constant_shell(makeString("isLeaderOf")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&140749\" target=\"_self\">"), makeString("</a>"), TWO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOUR_INTEGER),
								list(makeString("X's"), makeSymbol("?X"), list(ONE_INTEGER), makeString("<i>"), makeString("</i>"), FIVE_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, EIGHT_INTEGER),
								list(makeString("followers"), reader_make_constant_shell(makeString("isLeaderOf")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&140749\" target=\"_self\">"), makeString("</a>"), NINE_INTEGER), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, EIGHTEEN_INTEGER)))),
						makeString("X is Y's followers.")),
				list(list(list(makeString("Y is the cause of death of X."), list(new SubLObject[] { list(makeString("Y"), makeSymbol("?Y"), list(TWO_INTEGER), makeString("<i>"), makeString("</i>"), ZERO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYC"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ONE_INTEGER),
						list(makeString("is"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&217448\" target=\"_self\">"), NIL, TWO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, FOUR_INTEGER),
						list(makeString("the"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, FIVE_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, EIGHT_INTEGER), list(makeString("cause"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, NINE_INTEGER),
						list(makeString(" "), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, FOURTEEN_INTEGER), list(makeString("of"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, FIFTEEN_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, SEVENTEEN_INTEGER),
						list(makeString("death"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, EIGHTEEN_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, makeInteger(23)),
						list(makeString("of"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, makeString("</a>"), makeInteger(24)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(26)), list(makeString("X"), makeSymbol("?X"), list(ONE_INTEGER), makeString("<i>"), makeString("</i>"), makeInteger(27)),
						list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(28)) }))), makeString("X is the cause of death of Y.")),
				list(list(list(makeString("The reason for admission X was Y."),
						list(new SubLObject[] { list(makeString("The"), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&213677\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, THREE_INTEGER),
								list(makeString("reason"), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOUR_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, TEN_INTEGER),
								list(makeString("for"), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ELEVEN_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOURTEEN_INTEGER),
								list(makeString("admission"), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), FIFTEEN_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(24)),
								list(makeString("X"), makeSymbol("?X"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<i>"), makeString("</i>"), makeInteger(25)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(26)),
								list(makeString("was"), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&213677\" target=\"_self\">"), makeString("</a>"), makeInteger(27)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(30)),
								list(makeString("Y"), makeSymbol("?Y"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<i>"), makeString("</i>"), makeInteger(31)), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(32)) }))),
						makeString("The reason for admission X was Y.")),
				list(list(list(makeString("The cardiac cath complication Y occurred during or within 24 hours of the cardiac catheterization procedure X."),
						list(new SubLObject[] { list(makeString("The"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&213774\" target=\"_self\">"), NIL, ZERO_INTEGER),
								list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, THREE_INTEGER), list(makeString("cardiac"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOUR_INTEGER),
								list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ELEVEN_INTEGER), list(makeString("cath"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, TWELVE_INTEGER),
								list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, SIXTEEN_INTEGER), list(makeString("complication"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), SEVENTEEN_INTEGER),
								list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(29)), list(makeString("Y"), makeSymbol("?Y"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<i>"), makeString("</i>"), makeInteger(30)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(31)),
								list(makeString("occurred"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&213774\" target=\"_self\">"), NIL, makeInteger(32)), list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(40)),
								list(makeString("during"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(41)), list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(47)),
								list(makeString("or"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(48)), list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(50)),
								list(makeString("within"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(51)), list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(57)),
								list(makeString("24"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(58)), list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(60)),
								list(makeString("hours"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(61)), list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(66)),
								list(makeString("of"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(67)), list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(69)),
								list(makeString("the"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(70)), list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(73)),
								list(makeString("cardiac"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(74)), list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(81)),
								list(makeString("catheterization"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(82)), list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(97)),
								list(makeString("procedure"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), makeInteger(98)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(107)),
								list(makeString("X"), makeSymbol("?X"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<i>"), makeString("</i>"), makeInteger(108)), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(109)) }))),
						makeString("The cardiac cath complication X occurred during or within 24 hours of the cardiac catheterization procedure Y.")),
				list(list(list(makeString("Y contains information pertaining to X."),
						list(new SubLObject[] { list(makeString("Y"), makeSymbol("?Y"), list(TWO_INTEGER), makeString("<i>"), makeString("</i>"), ZERO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ONE_INTEGER),
								list(makeString("contains"), reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&217917\" target=\"_self\">"), NIL, TWO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), list(ZERO_INTEGER), NIL, NIL, TEN_INTEGER),
								list(makeString("information"), reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), list(ZERO_INTEGER), NIL, NIL, ELEVEN_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), list(ZERO_INTEGER), NIL, NIL, makeInteger(22)),
								list(makeString("pertaining"), reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), list(ZERO_INTEGER), NIL, NIL, makeInteger(23)), list(makeString(" "), reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), list(ZERO_INTEGER), NIL, NIL, makeInteger(33)),
								list(makeString("to"), reader_make_constant_shell(makeString("medicalEventHasAssociatedData")), list(ZERO_INTEGER), NIL, makeString("</a>"), makeInteger(34)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(36)),
								list(makeString("X"), makeSymbol("?X"), list(ONE_INTEGER), makeString("<i>"), makeString("</i>"), makeInteger(37)), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(38)) }))),
						makeString("X contains information pertaining to Y.")),
				list(list(list(makeString("The patient ID for X is Y."),
						list(new SubLObject[] { list(makeString("The"), reader_make_constant_shell(makeString("cCFCCFID")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&213809\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("cCFCCFID")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, THREE_INTEGER),
								list(makeString("patient"), reader_make_constant_shell(makeString("cCFCCFID")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOUR_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("cCFCCFID")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ELEVEN_INTEGER),
								list(makeString("ID"), reader_make_constant_shell(makeString("cCFCCFID")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, TWELVE_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("cCFCCFID")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOURTEEN_INTEGER),
								list(makeString("for"), reader_make_constant_shell(makeString("cCFCCFID")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), FIFTEEN_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, EIGHTEEN_INTEGER),
								list(makeString("X"), makeSymbol("?X"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<i>"), makeString("</i>"), NINETEEN_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, TWENTY_INTEGER),
								list(makeString("is"), reader_make_constant_shell(makeString("cCFCCFID")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&213809\" target=\"_self\">"), makeString("</a>"), makeInteger(21)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(23)),
								list(makeString("Y"), makeSymbol("?Y"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<i>"), makeString("</i>"), makeInteger(24)), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(25)) }))),
						makeString("The patient ID for X is Y.")),
				list(list(list(makeString("Myocardial infarctions are the cause of death of X."),
						list(new SubLObject[] { list(makeString("Myocardial"), reader_make_constant_shell(makeString("HeartAttack")), list(TWO_INTEGER), makeString("<a href=\"cg?CB-CF&214202\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("HeartAttack")), list(TWO_INTEGER), NIL, NIL, TEN_INTEGER),
								list(makeString("infarctions"), reader_make_constant_shell(makeString("HeartAttack")), list(TWO_INTEGER), NIL, makeString("</a>"), ELEVEN_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(22)),
								list(makeString("are"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&217448\" target=\"_self\">"), NIL, makeInteger(23)), list(makeString(" "), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, makeInteger(26)),
								list(makeString("the"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, makeInteger(27)), list(makeString(" "), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, makeInteger(30)),
								list(makeString("cause"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, makeInteger(31)), list(makeString(" "), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, makeInteger(36)),
								list(makeString("of"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, makeInteger(37)), list(makeString(" "), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, makeInteger(39)),
								list(makeString("death"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, makeInteger(40)), list(makeString(" "), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, NIL, makeInteger(45)),
								list(makeString("of"), reader_make_constant_shell(makeString("causeOfDeathEvent")), list(ZERO_INTEGER), NIL, makeString("</a>"), makeInteger(46)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(48)), list(makeString("X"), makeSymbol("?X"), list(ONE_INTEGER), makeString("<i>"), makeString("</i>"), makeInteger(49)),
								list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(50)) }))),
						makeString("Myocardial infarctions are the cause of death of X.")),
				list(list(list(makeString("X is a heart attack."),
						list(new SubLObject[] { list(makeString("X"), makeSymbol("?X"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<i>"), makeString("</i>"), ZERO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ONE_INTEGER),
								list(makeString("is"), reader_make_constant_shell(makeString("isa")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&15982\" target=\"_self\">"), NIL, TWO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("isa")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOUR_INTEGER),
								list(makeString("a"), reader_make_constant_shell(makeString("isa")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), FIVE_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, SIX_INTEGER),
								list(makeString("heart"), reader_make_constant_shell(makeString("HeartAttack")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&214202\" target=\"_self\">"), NIL, SEVEN_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("HeartAttack")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, TWELVE_INTEGER),
								list(makeString("attack"), reader_make_constant_shell(makeString("HeartAttack")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), THIRTEEN_INTEGER), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, NINETEEN_INTEGER) }))),
						makeString("X is a heart attack.")),
				list(list(list(makeString("The reason for admission X was myocardial infarctions."),
						list(new SubLObject[] { list(makeString("The"), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&213677\" target=\"_self\">"), NIL, ZERO_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, THREE_INTEGER),
								list(makeString("reason"), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOUR_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, TEN_INTEGER),
								list(makeString("for"), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ELEVEN_INTEGER), list(makeString(" "), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOURTEEN_INTEGER),
								list(makeString("admission"), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), FIFTEEN_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(24)),
								list(makeString("X"), makeSymbol("?X"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<i>"), makeString("</i>"), makeInteger(25)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(26)),
								list(makeString("was"), reader_make_constant_shell(makeString("cCFHospitalAdmitReason")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&213677\" target=\"_self\">"), makeString("</a>"), makeInteger(27)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(30)),
								list(makeString("myocardial"), reader_make_constant_shell(makeString("HeartAttack")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&214202\" target=\"_self\">"), NIL, makeInteger(31)), list(makeString(" "), reader_make_constant_shell(makeString("HeartAttack")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(41)),
								list(makeString("infarctions"), reader_make_constant_shell(makeString("HeartAttack")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), makeInteger(42)), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(53)) }))),
						makeString("The reason for admission X was myocardial infarctions.")),
				list(list(list(makeString("The cardiac cath complication myocardial infarctions occurred during or within 24 hours of the cardiac catheterization procedure X."), list(new SubLObject[] { list(makeString("The"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&213774\" target=\"_self\">"), NIL, ZERO_INTEGER),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, THREE_INTEGER), list(makeString("cardiac"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOUR_INTEGER),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, ELEVEN_INTEGER), list(makeString("cath"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, TWELVE_INTEGER),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, SIXTEEN_INTEGER), list(makeString("complication"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), SEVENTEEN_INTEGER),
						list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(29)), list(makeString("myocardial"), reader_make_constant_shell(makeString("HeartAttack")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&214202\" target=\"_self\">"), NIL, makeInteger(30)),
						list(makeString(" "), reader_make_constant_shell(makeString("HeartAttack")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(40)), list(makeString("infarctions"), reader_make_constant_shell(makeString("HeartAttack")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), makeInteger(41)),
						list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(52)), list(makeString("occurred"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<a href=\"cg?CB-CF&213774\" target=\"_self\">"), NIL, makeInteger(53)),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(61)), list(makeString("during"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(62)),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(68)), list(makeString("or"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(69)),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(71)), list(makeString("within"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(72)),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(78)), list(makeString("24"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(79)),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(81)), list(makeString("hours"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(82)),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(87)), list(makeString("of"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(88)),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(90)), list(makeString("the"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(91)),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(94)), list(makeString("cardiac"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(95)),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(102)), list(makeString("catheterization"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(103)),
						list(makeString(" "), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(118)), list(makeString("procedure"), reader_make_constant_shell(makeString("cCFCardiacCathComplication")), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, makeString("</a>"), makeInteger(119)),
						list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(128)), list(makeString("X"), makeSymbol("?X"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), makeString("<i>"), makeString("</i>"), makeInteger(129)), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(130)) }))),
						makeString("The cardiac cath complication myocardial infarctions occurred during or within 24 hours of the cardiac catheterization procedure X.")) });
	}

	private static SubLObject _constant_751_initializer() {
		return list(new SubLObject[] { list(list(list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?X"), makeSymbol("?Y"))), list(reader_make_constant_shell(makeString("lessThan")), makeSymbol("?QUANTITY"), makeSymbol("?QUANTITY-2"))),
				list(list(list(reader_make_constant_shell(makeString("playsRole")), makeSymbol("?SIT"), makeSymbol("?AG"), reader_make_constant_shell(makeString("directingAgent")))), list(reader_make_constant_shell(makeString("playsRole")), makeSymbol("?TEMPORALLY-EXTENDED-THING"), makeSymbol("?AG"), reader_make_constant_shell(makeString("directingAgent")))),
				list(list(list(reader_make_constant_shell(makeString("cost")), makeSymbol("?D2"), makeSymbol("?V2"))), list(reader_make_constant_shell(makeString("cost")), makeSymbol("?TEMPORAL-THING"), makeSymbol("?MONETARY-VALUE"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ICU"), reader_make_constant_shell(makeString("IntensiveCareUnit")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICAL-CARE-INSTITUTION"), reader_make_constant_shell(makeString("IntensiveCareUnit")))),
				list(list(list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?HCE"), makeSymbol("?ICU"))), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?LOCALIZED-EVENT"), makeSymbol("?LOCATION"))),
				list(list(list(reader_make_constant_shell(makeString("duration")), makeSymbol("?HCE"), list(reader_make_constant_shell(makeString("DaysDuration")), ONE_INTEGER))), list(reader_make_constant_shell(makeString("duration")), makeSymbol("?TEMPORAL-THING"), list(reader_make_constant_shell(makeString("DaysDuration")), ONE_INTEGER))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SNAKE"), reader_make_constant_shell(makeString("Snake")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SQUAMATA"), reader_make_constant_shell(makeString("Snake")))),
				list(list(list(reader_make_constant_shell(makeString("bodilyDoer")), makeSymbol("?SHEDDING"), makeSymbol("?SNAKE"))), list(reader_make_constant_shell(makeString("bodilyDoer")), makeSymbol("?PHYSICAL-EVENT"), makeSymbol("?BODILY-DOER"))),
				list(list(list(reader_make_constant_shell(makeString("primaryObjectMoving")), makeSymbol("?SHEDDING"), makeSymbol("?SKIN"))), list(reader_make_constant_shell(makeString("primaryObjectMoving")), makeSymbol("?MOVEMENT"), makeSymbol("?PRIMARY-MOVING-OBJECT"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SHEDDING"), reader_make_constant_shell(makeString("Shedding")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SPEWING"), reader_make_constant_shell(makeString("Shedding")))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MAMMAL"), reader_make_constant_shell(makeString("Mammal")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?AMNIOTE"), reader_make_constant_shell(makeString("Mammal")))),
				list(list(list(reader_make_constant_shell(makeString("bodilyDoer")), makeSymbol("?SHEDDING"), makeSymbol("?MAMMAL"))), list(reader_make_constant_shell(makeString("bodilyDoer")), makeSymbol("?PHYSICAL-EVENT"), makeSymbol("?BODILY-DOER"))),
				list(list(list(reader_make_constant_shell(makeString("primaryObjectMoving")), makeSymbol("?SHEDDING"), makeSymbol("?HAIR"))), list(reader_make_constant_shell(makeString("primaryObjectMoving")), makeSymbol("?MOVEMENT"), makeSymbol("?PRIMARY-MOVING-OBJECT"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SHEDDING"), reader_make_constant_shell(makeString("Shedding")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?SPEWING"), reader_make_constant_shell(makeString("Shedding")))),
				list(list(list(reader_make_constant_shell(makeString("equals")), makeSymbol("??VALUE"), makeSymbol("?FORM"))), list(reader_make_constant_shell(makeString("equals")), makeSymbol("??VALUE"), makeSymbol("?FORM"))),
				list(list(list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?N"), ONE_INTEGER)), list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?QUANTITY"), ONE_INTEGER)),
				list(list(list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?M"), ONE_INTEGER)), list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?QUANTITY"), ONE_INTEGER)),
				list(list(list(reader_make_constant_shell(makeString("greaterThan")), ONE_INTEGER, makeSymbol("?CARD"))), list(reader_make_constant_shell(makeString("greaterThan")), ONE_INTEGER, makeSymbol("?QUANTITY"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("LogicalSchema")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?AISES"), reader_make_constant_shell(makeString("LogicalSchema")))),
				list(list(list(reader_make_constant_shell(makeString("greaterThan")), ONE_INTEGER, makeSymbol("?CARD"))), list(reader_make_constant_shell(makeString("greaterThan")), ONE_INTEGER, makeSymbol("?QUANTITY"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("PhysicalSchema")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?AISES"), reader_make_constant_shell(makeString("PhysicalSchema")))),
				list(list(list(reader_make_constant_shell(makeString("cost")), makeSymbol("?EVT"), makeSymbol("?COST"))), list(reader_make_constant_shell(makeString("cost")), makeSymbol("?TEMPORAL-THING"), makeSymbol("?MONETARY-VALUE"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVT"), reader_make_constant_shell(makeString("MedicalTreatmentEvent")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TREATMENT-PROCEDURE"), reader_make_constant_shell(makeString("MedicalTreatmentEvent")))),
				list(list(list(reader_make_constant_shell(makeString("greaterThan")), ONE_INTEGER, makeSymbol("?CARD"))), list(reader_make_constant_shell(makeString("greaterThan")), ONE_INTEGER, makeSymbol("?QUANTITY"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("StructuredKnowledgeSource-TopLevel")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?STRUCTURED-KNOWLEDGE-SOURCE"), reader_make_constant_shell(makeString("StructuredKnowledgeSource-TopLevel")))),
				list(list(list(reader_make_constant_shell(makeString("greaterThan")), ONE_INTEGER, makeSymbol("?CARD"))), list(reader_make_constant_shell(makeString("greaterThan")), ONE_INTEGER, makeSymbol("?QUANTITY"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("StructuredKnowledgeSource-TopLevel")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?STRUCTURED-KNOWLEDGE-SOURCE"), reader_make_constant_shell(makeString("StructuredKnowledgeSource-TopLevel")))),
				list(list(list(reader_make_constant_shell(makeString("syntacticCategoryTags")), makeSymbol("?CATEGORY"), makeSymbol("?TAG"))), list(reader_make_constant_shell(makeString("syntacticCategoryTags")), makeSymbol("?TYPE-OF-SENTENTIAL-CONSTITUENT"), makeSymbol("?PENN-POS-TAG"))),
				list(list(list(reader_make_constant_shell(makeString("syntacticNodeTypeCategory")), makeSymbol("?TYPE"), makeSymbol("?CATEGORY"))), list(reader_make_constant_shell(makeString("syntacticNodeTypeCategory")), makeSymbol("?TYPE"), makeSymbol("?TYPE-OF-SENTENTIAL-CONSTITUENT"))),
				list(list(list(reader_make_constant_shell(makeString("syntacticNodePennTag")), makeSymbol("?NODE"), makeSymbol("?TAG"))), list(reader_make_constant_shell(makeString("syntacticNodePennTag")), makeSymbol("?SYNTACTIC-NODE"), makeSymbol("?PENN-POS-TAG"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?DRG"), reader_make_constant_shell(makeString("PrescriptionDrug")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEDICINE"), reader_make_constant_shell(makeString("PrescriptionDrug")))),
				list(list(list(reader_make_constant_shell(makeString("mainProduct")), makeSymbol("?FOR"), makeSymbol("?DRG"))), list(reader_make_constant_shell(makeString("mainProduct")), makeSymbol("?PACKAGED-PRODUCT"), makeSymbol("?ENDURING-THING-LOCALIZED"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?FOR"), reader_make_constant_shell(makeString("PackagedProduct")))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?PACKAGED-OBJECT"), reader_make_constant_shell(makeString("PackagedProduct")))),
				list(list(list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?N"), ONE_INTEGER)), list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?QUANTITY"), ONE_INTEGER)),
				list(list(list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?M"), ONE_INTEGER)), list(reader_make_constant_shell(makeString("greaterThan")), makeSymbol("?QUANTITY"), ONE_INTEGER)),
				list(list(list(reader_make_constant_shell(makeString("physicalSchemaFieldIndexicalWithName")), makeSymbol("?PS"), makeSymbol("?PFI"), makeSymbol("?FIELD-NAME"))), list(reader_make_constant_shell(makeString("physicalSchemaFieldIndexicalWithName")), makeSymbol("?AISES"), makeSymbol("?PFI"), makeSymbol("?CHARACTER-SEQUENCE"))),
				list(list(list(reader_make_constant_shell(makeString("logicalFieldValueWithFieldName")), makeSymbol("?LS"), makeSymbol("?FIELD-NAME"), makeSymbol("?LFI"))), list(reader_make_constant_shell(makeString("logicalFieldValueWithFieldName")), makeSymbol("?AISES"), makeSymbol("?CHARACTER-SEQUENCE"), makeSymbol("?LFI"))),
				list(list(list(reader_make_constant_shell(makeString("fieldValueIsTransformedViaInSKS")), makeSymbol("?KS"), makeSymbol("?FIELD-NAME"), reader_make_constant_shell(makeString("StemiFirstNoted-CathPCI-Transformation")))),
						list(reader_make_constant_shell(makeString("fieldValueIsTransformedViaInSKS")), makeSymbol("?STRUCTURED-KNOWLEDGE-SOURCE"), makeSymbol("?CHARACTER-SEQUENCE"), reader_make_constant_shell(makeString("StemiFirstNoted-CathPCI-Transformation")))),
				list(list(list(reader_make_constant_shell(makeString("logicalSchemaSourceMap")), makeSymbol("?LS"), makeSymbol("?KS"))), list(reader_make_constant_shell(makeString("logicalSchemaSourceMap")), makeSymbol("?AISES"), makeSymbol("?STRUCTURED-KNOWLEDGE-SOURCE"))) });
	}

	private static SubLObject _constant_765_initializer() {
		return list(list(list(makeKeyword("SELF"), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection")))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection")))),
				list(list(makeKeyword("ARG2"), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection")))), reader_make_constant_shell(makeString("Collection"))),
				list(list(list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG2")), list(reader_make_constant_shell(makeString("implies")), makeSymbol("?ANTECEDENT"), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Collection"))))), reader_make_constant_shell(makeString("Thing"))),
				list(list(makeKeyword("ARG2"), makeKeyword("ARG2")), list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG2"))),
				list(list(list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), makeKeyword("ARG2")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?X"), makeSymbol("?Y"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X-2"), makeSymbol("?Y"))), list(
						list(makeKeyword("ARG4"),
								list(reader_make_constant_shell(makeString("fieldEncoding")), reader_make_constant_shell(makeString("Usgs-Gnis-PS")), list(reader_make_constant_shell(makeString("ThePhysicalFieldValueFn")), reader_make_constant_shell(makeString("Usgs-Gnis-PS")), makeString("primary_long")), reader_make_constant_shell(makeString("Usgs-Gnis-LS")),
										list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("QuantityConversionFn")), reader_make_constant_shell(makeString("Degree-UnitOfAngularMeasure")), list(reader_make_constant_shell(makeString("TheNthFn")), reader_make_constant_shell(makeString("AngularDistance")), TWO_INTEGER))))),
						list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("QuantityConversionFn")), reader_make_constant_shell(makeString("Degree-UnitOfAngularMeasure")), list(reader_make_constant_shell(makeString("TheNthFn")), reader_make_constant_shell(makeString("AngularDistance")), TWO_INTEGER)))),
				list(list(list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG2")), makeKeyword("ARG2")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG2")))),
				list(list(
						list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG1"))),
								list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG1"))),
										list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG1"))),
												list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG1"))),
														list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), THREE_INTEGER, makeKeyword("ARG1"))),
																list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), FIVE_INTEGER, makeKeyword("ARG1"))), makeKeyword("SELF"))))))),
						list(makeKeyword("ARG0"), list(list(reader_make_constant_shell(makeString("FormulaArgFn")), ZERO_INTEGER, makeKeyword("ARG1")),
								list(reader_make_constant_shell(makeString("distanceBetween")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), SIX_INTEGER, makeKeyword("ARG1"))),
										list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), SIX_INTEGER, makeKeyword("ARG1"))), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), THREE_INTEGER, makeKeyword("ARG1")))),
								list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG1")), list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG1")), list(reader_make_constant_shell(makeString("FormulaArgFn")), FOUR_INTEGER, makeKeyword("ARG1")), list(reader_make_constant_shell(makeString("FormulaArgFn")), FIVE_INTEGER, makeKeyword("ARG1"))),
								makeKeyword("ARG2"))),
						list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), SIX_INTEGER, makeKeyword("ARG1"))), list(reader_make_constant_shell(makeString("forAll")),
								list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), SIX_INTEGER, makeKeyword("ARG1"))),
								list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), THREE_INTEGER, makeKeyword("ARG1"))),
										list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG1"))),
												list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG1"))),
														list(reader_make_constant_shell(makeString("forAll")), list(reader_make_constant_shell(makeString("FormulaArgFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), FIVE_INTEGER, makeKeyword("ARG1"))), list(makeKeyword("ARG0"),
																list(list(reader_make_constant_shell(makeString("FormulaArgFn")), ZERO_INTEGER, makeKeyword("ARG1")), list(reader_make_constant_shell(makeString("distanceBetween")), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), SIX_INTEGER, makeKeyword("ARG1"))),
																		list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), SIX_INTEGER, makeKeyword("ARG1"))), list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("FormulaArgFn")), THREE_INTEGER, makeKeyword("ARG1")))),
																		list(reader_make_constant_shell(makeString("FormulaArgFn")), ONE_INTEGER, makeKeyword("ARG1")), list(reader_make_constant_shell(makeString("FormulaArgFn")), TWO_INTEGER, makeKeyword("ARG1")), list(reader_make_constant_shell(makeString("FormulaArgFn")), FOUR_INTEGER, makeKeyword("ARG1")),
																		list(reader_make_constant_shell(makeString("FormulaArgFn")), FIVE_INTEGER, makeKeyword("ARG1"))),
																makeKeyword("ARG2"))))))))));
	}

	private static SubLObject _constant_768_initializer() {
		return list(new SubLObject[] { list(list(list(reader_make_constant_shell(makeString("agentive-Mass"))), list(reader_make_constant_shell(makeString("agentiveNounStrings")))), list(reader_make_constant_shell(makeString("agentive-Mass")))),
				list(list(list(reader_make_constant_shell(makeString("agentive-Mass")), reader_make_constant_shell(makeString("agentive-Sg"))), list(reader_make_constant_shell(makeString("agentive-Mass")), reader_make_constant_shell(makeString("agentive-Sg")))), list(reader_make_constant_shell(makeString("agentive-Mass")), reader_make_constant_shell(makeString("agentive-Sg")))),
				list(list(list(reader_make_constant_shell(makeString("agentiveNounStrings")), reader_make_constant_shell(makeString("agentiveNounStrings"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("agentive-Sg")), reader_make_constant_shell(makeString("agentive-Mass")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("agentiveNounStrings")))), list(reader_make_constant_shell(makeString("agentive-Sg")), reader_make_constant_shell(makeString("agentive-Mass")))),
				list(list(list(reader_make_constant_shell(makeString("presentTense-Generic"))), list(reader_make_constant_shell(makeString("thirdPersonSg-Present")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("termStrings"))), list(reader_make_constant_shell(makeString("termStrings")))), list(reader_make_constant_shell(makeString("termStrings")))),
				list(list(list(reader_make_constant_shell(makeString("properNameStrings")), reader_make_constant_shell(makeString("termStrings"))), list(reader_make_constant_shell(makeString("termStrings")))), list(reader_make_constant_shell(makeString("termStrings")))),
				list(list(list(reader_make_constant_shell(makeString("properNameStrings")), reader_make_constant_shell(makeString("termStrings"))), list(reader_make_constant_shell(makeString("nounStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")), reader_make_constant_shell(makeString("nounStrings")))),
				list(list(list(reader_make_constant_shell(makeString("abbreviationString"))), list(reader_make_constant_shell(makeString("pronounStrings")), reader_make_constant_shell(makeString("nonSingular-Generic")), reader_make_constant_shell(makeString("nameString")))), list(reader_make_constant_shell(makeString("abbreviationString")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("termStrings")))), list(reader_make_constant_shell(makeString("massNumber-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("termStrings")))), list(reader_make_constant_shell(makeString("singular-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("termStrings")))), list(reader_make_constant_shell(makeString("plural-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("termStrings")))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(list(list(reader_make_constant_shell(makeString("nameString"))), list(reader_make_constant_shell(makeString("singular")))), list(reader_make_constant_shell(makeString("nameString")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("nameString")))), list(reader_make_constant_shell(makeString("nameString")))),
				list(list(list(reader_make_constant_shell(makeString("nameString"))), list(reader_make_constant_shell(makeString("nonSingular-Generic")))), list(reader_make_constant_shell(makeString("nameString")))),
				list(list(list(reader_make_constant_shell(makeString("nameString"))), list(reader_make_constant_shell(makeString("placeName-ShortForm")))), list(reader_make_constant_shell(makeString("placeName-ShortForm")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("initialismString")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("termStrings-GuessedFromName"))), list(reader_make_constant_shell(makeString("termStrings-GuessedFromName")))), list(reader_make_constant_shell(makeString("termStrings-GuessedFromName")))),
				list(list(list(reader_make_constant_shell(makeString("properNameStrings")), reader_make_constant_shell(makeString("termStrings-GuessedFromName"))), list(reader_make_constant_shell(makeString("nameString")))), list(reader_make_constant_shell(makeString("nameString")))),
				list(list(list(reader_make_constant_shell(makeString("properNameStrings")), reader_make_constant_shell(makeString("termStrings-GuessedFromName"))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")))),
				list(list(list(reader_make_constant_shell(makeString("properNameStrings")), reader_make_constant_shell(makeString("termStrings-GuessedFromName"))), list(reader_make_constant_shell(makeString("nounStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")), reader_make_constant_shell(makeString("termStrings-GuessedFromName")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("termStrings-GuessedFromName")))), list(reader_make_constant_shell(makeString("termStrings-GuessedFromName")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("termStrings-GuessedFromName")))), list(reader_make_constant_shell(makeString("termStrings-GuessedFromName")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("termStrings-GuessedFromName")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("termStrings-GuessedFromName")))), list(reader_make_constant_shell(makeString("termStrings-GuessedFromName")))),
				list(list(list(reader_make_constant_shell(makeString("scientificName"))), list(reader_make_constant_shell(makeString("scientificName")))), list(reader_make_constant_shell(makeString("scientificName")))), list(list(list(reader_make_constant_shell(makeString("scientificName"))), list(reader_make_constant_shell(makeString("nounStrings")))), list(reader_make_constant_shell(makeString("scientificName")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("scientificName")))), list(reader_make_constant_shell(makeString("scientificName")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("scientificName")))), list(reader_make_constant_shell(makeString("scientificName")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("scientificName")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("scientificName")))), list(reader_make_constant_shell(makeString("scientificName")))),
				list(list(list(reader_make_constant_shell(makeString("nameString"))), list(reader_make_constant_shell(makeString("pronounStrings")), reader_make_constant_shell(makeString("nounStrings")), reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("nameString")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("agentive-Sg")))), list(reader_make_constant_shell(makeString("agentive-Sg")))), list(list(list(reader_make_constant_shell(makeString("agentive-Sg"))), list(reader_make_constant_shell(makeString("agentiveNounStrings")))), list(reader_make_constant_shell(makeString("agentive-Sg")))),
				list(list(list(reader_make_constant_shell(makeString("agentive-Sg")), reader_make_constant_shell(makeString("agentive-Mass"))), list(reader_make_constant_shell(makeString("agentive-Sg")), reader_make_constant_shell(makeString("agentive-Mass")))), list(reader_make_constant_shell(makeString("agentive-Sg")), reader_make_constant_shell(makeString("agentive-Mass")))),
				list(list(list(reader_make_constant_shell(makeString("agentiveNounStrings")), reader_make_constant_shell(makeString("agentiveNounStrings"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("agentive-Sg")), reader_make_constant_shell(makeString("agentive-Mass")))),
				list(list(list(reader_make_constant_shell(makeString("agentive-Sg"))), list(reader_make_constant_shell(makeString("agentive-Sg")))), list(reader_make_constant_shell(makeString("agentive-Sg")))), list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("massNumber")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("massNumber")), reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("singular-Generic")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("nonSingular-Generic"))), list(reader_make_constant_shell(makeString("initialismString")))), list(reader_make_constant_shell(makeString("initialismString")))),
				list(list(list(reader_make_constant_shell(makeString("pronounStrings")), reader_make_constant_shell(makeString("determinerStrings"))), list(reader_make_constant_shell(makeString("pronounStrings")))), list(reader_make_constant_shell(makeString("pronounStrings")))),
				list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), list(reader_make_constant_shell(makeString("plural")))), list(list(list(reader_make_constant_shell(makeString("nounStrings"))), list(reader_make_constant_shell(makeString("plural-Generic")))), list(reader_make_constant_shell(makeString("plural-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("chemicalFormulaString"))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber")), reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))),
				list(list(list(reader_make_constant_shell(makeString("chemicalFormulaString"))), list(reader_make_constant_shell(makeString("nonSingular-Generic")))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))),
				list(list(list(reader_make_constant_shell(makeString("nonSingular-Generic"))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))), list(reader_make_constant_shell(makeString("chemicalFormulaString")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("singular-Generic")))), list(reader_make_constant_shell(makeString("singular-Generic")))), list(list(NIL, list(reader_make_constant_shell(makeString("plural-Generic")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("plural-Generic")))), NIL), list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("wordStrings")))), list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("regularDegree")), reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("determinerStrings")), reader_make_constant_shell(makeString("pronounStrings"))), list(reader_make_constant_shell(makeString("pronounStrings")), reader_make_constant_shell(makeString("determinerStrings")))), list(reader_make_constant_shell(makeString("determinerStrings")), reader_make_constant_shell(makeString("pronounStrings")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber")), reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("massNumber-Generic")))), list(reader_make_constant_shell(makeString("massNumber")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber")), reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("massNumber")), reader_make_constant_shell(makeString("massNumber")))), list(reader_make_constant_shell(makeString("massNumber")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber")), reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("massNumber")))), list(reader_make_constant_shell(makeString("massNumber")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("singular")))), list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("properNameStrings"))), list(reader_make_constant_shell(makeString("preferredNameString")))), list(reader_make_constant_shell(makeString("preferredNameString")))),
				list(list(list(reader_make_constant_shell(makeString("properNameStrings"))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")))),
				list(list(list(reader_make_constant_shell(makeString("properNameStrings"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("properNameStrings")))),
				list(list(list(reader_make_constant_shell(makeString("presentTense-Generic"))), list(reader_make_constant_shell(makeString("tensed")))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), list(list(list(reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("nounStrings")))), list(reader_make_constant_shell(makeString("massNumber")))),
				list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("massNumber")))), NIL), list(list(list(reader_make_constant_shell(makeString("pluralVerb-Past"))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("pluralVerb-Past"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("pluralVerb-Past")))),
				list(list(list(reader_make_constant_shell(makeString("pluralVerb-Past"))), list(reader_make_constant_shell(makeString("pluralVerb-Past")))), list(reader_make_constant_shell(makeString("pluralVerb-Past")))),
				list(list(list(reader_make_constant_shell(makeString("pastTense-Generic"))), list(reader_make_constant_shell(makeString("thirdPersonSg-Past")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Past")))),
				list(list(list(reader_make_constant_shell(makeString("tensed"))), list(reader_make_constant_shell(makeString("thirdPersonSg-Present")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Present"))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Present"))), list(reader_make_constant_shell(makeString("thirdPersonSg-Present")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("pluralVerb-Present"))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), list(reader_make_constant_shell(makeString("pluralVerb-Present")))),
				list(list(list(reader_make_constant_shell(makeString("pluralVerb-Present"))), list(reader_make_constant_shell(makeString("pluralVerb-Present")))), list(reader_make_constant_shell(makeString("pluralVerb-Present")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("plural")))), list(reader_make_constant_shell(makeString("plural")))),
				list(list(list(reader_make_constant_shell(makeString("nounStrings"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(list(list(reader_make_constant_shell(makeString("regularDegree"))), list(reader_make_constant_shell(makeString("singular-Generic")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("regularDegree"))), list(reader_make_constant_shell(makeString("regularDegree")))), list(reader_make_constant_shell(makeString("regularDegree")))),
				list(list(list(reader_make_constant_shell(makeString("adjStrings")), reader_make_constant_shell(makeString("adjStrings"))), list(reader_make_constant_shell(makeString("regularDegree")))), list(reader_make_constant_shell(makeString("regularDegree")))), list(list(list(reader_make_constant_shell(makeString("regularDegree"))), list(reader_make_constant_shell(makeString("properNameStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("regularDegree")))), NIL), list(list(list(reader_make_constant_shell(makeString("firstPersonSg-Present"))), list(reader_make_constant_shell(makeString("firstPersonSg-Generic")))), list(reader_make_constant_shell(makeString("firstPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("firstPersonSg-Present"))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), list(reader_make_constant_shell(makeString("firstPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("firstPersonSg-Present"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("firstPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("firstPersonSg-Present"))), list(reader_make_constant_shell(makeString("firstPersonSg-Present")))), list(reader_make_constant_shell(makeString("firstPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("presentTense-Generic"))), list(reader_make_constant_shell(makeString("firstPersonSg-Present")))), list(reader_make_constant_shell(makeString("firstPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("simplePresent-Generic"))), list(reader_make_constant_shell(makeString("firstPersonSg-Generic")))), list(reader_make_constant_shell(makeString("firstPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("presentTense-Generic"))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), list(reader_make_constant_shell(makeString("presentTense-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("simplePresent-Generic"))), list(reader_make_constant_shell(makeString("simplePresent-Generic")))), list(reader_make_constant_shell(makeString("simplePresent-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("presentTense-Generic"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("presentTense-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("pronounStrings")), reader_make_constant_shell(makeString("determinerStrings"))), list(reader_make_constant_shell(makeString("determinerStrings")))), list(reader_make_constant_shell(makeString("determinerStrings")))),
				list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("singular-Generic")))), list(reader_make_constant_shell(makeString("singular")))), list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("nonSingular-Generic")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Past"))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), NIL), list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Past"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Past")))),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Past"))), list(reader_make_constant_shell(makeString("thirdPersonSg-Past")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Past")))),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Generic"))), list(reader_make_constant_shell(makeString("thirdPersonSg-Past")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Past")))),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Past"))), list(reader_make_constant_shell(makeString("thirdPersonSg-Generic")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Past")))),
				list(list(list(reader_make_constant_shell(makeString("simplePast-Generic"))), list(reader_make_constant_shell(makeString("thirdPersonSg-Generic")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Past")))), list(list(list(reader_make_constant_shell(makeString("pastTense-Generic"))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("pastTense-Generic"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("pastTense-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("simplePast-Generic"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("simplePast-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("pastTense-Generic"))), list(reader_make_constant_shell(makeString("pastTense-Generic")))), list(reader_make_constant_shell(makeString("pastTense-Generic")))), list(list(list(reader_make_constant_shell(makeString("perfect"))), list(reader_make_constant_shell(makeString("wordStrings")))), list(reader_make_constant_shell(makeString("perfect")))),
				list(list(list(reader_make_constant_shell(makeString("nonSingular-Generic"))), list(reader_make_constant_shell(makeString("massNumber")))), list(reader_make_constant_shell(makeString("massNumber")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber")), reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("nonSingular-Generic")))), list(reader_make_constant_shell(makeString("massNumber")))),
				list(list(list(reader_make_constant_shell(makeString("plural"))), list(reader_make_constant_shell(makeString("plural-Generic")))), list(reader_make_constant_shell(makeString("plural")))), list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("plural")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("nonSingular-Generic")))), NIL), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("nonSingular-Generic")))), list(reader_make_constant_shell(makeString("plural-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("nonSingular-Generic"))), list(reader_make_constant_shell(makeString("nonSingular-Generic")))), list(reader_make_constant_shell(makeString("nonSingular-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("massNumber")))), list(reader_make_constant_shell(makeString("massNumber")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber")), reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("massNumber")))),
				list(list(list(reader_make_constant_shell(makeString("nameString"))), list(reader_make_constant_shell(makeString("preferredNameString")))), list(reader_make_constant_shell(makeString("preferredNameString")))),
				list(list(list(reader_make_constant_shell(makeString("nounStrings"))), list(reader_make_constant_shell(makeString("singular-Generic")))), list(reader_make_constant_shell(makeString("singular-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("nounStrings")))), list(reader_make_constant_shell(makeString("singular-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("nounStrings")))), list(reader_make_constant_shell(makeString("massNumber-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("gerund-Singular")))), list(reader_make_constant_shell(makeString("gerund-Singular")))), list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("adjStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("adjStrings")))), NIL), list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("adjStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("adjStrings")))), NIL), list(list(list(reader_make_constant_shell(makeString("agentive-Sg"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("gerund-Singular"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("verbStrings")), reader_make_constant_shell(makeString("verbStrings")), reader_make_constant_shell(makeString("gerund-Plural")), reader_make_constant_shell(makeString("gerund-Singular")), reader_make_constant_shell(makeString("gerund")), reader_make_constant_shell(makeString("agentive-Sg"))),
						list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("gerund-Singular")), reader_make_constant_shell(makeString("gerund")), reader_make_constant_shell(makeString("agentive-Sg")))),
				list(list(list(reader_make_constant_shell(makeString("adjStrings")), reader_make_constant_shell(makeString("adjStrings"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), NIL), list(list(list(reader_make_constant_shell(makeString("pnSingular"))), list(reader_make_constant_shell(makeString("pnSingular")))), list(reader_make_constant_shell(makeString("pnSingular")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("pnSingular")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("pnSingular"))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("pnSingular")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("gerund-Plural")))), list(reader_make_constant_shell(makeString("gerund-Plural")))), list(list(list(reader_make_constant_shell(makeString("gerund"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL), list(list(list(reader_make_constant_shell(makeString("presentParticiple"))), list(reader_make_constant_shell(makeString("adjStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("gerund"))), list(reader_make_constant_shell(makeString("adjStrings")))), NIL), list(list(list(reader_make_constant_shell(makeString("plural"))), list(reader_make_constant_shell(makeString("adjStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("adjStrings")))), NIL), list(list(list(reader_make_constant_shell(makeString("gerund-Plural"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("verbStrings")), reader_make_constant_shell(makeString("verbStrings")), reader_make_constant_shell(makeString("gerund-Plural")), reader_make_constant_shell(makeString("gerund-Singular")), reader_make_constant_shell(makeString("gerund")), reader_make_constant_shell(makeString("agentive-Sg"))),
						list(reader_make_constant_shell(makeString("plural-Generic")))), list(reader_make_constant_shell(makeString("gerund-Plural")))),
				list(list(list(reader_make_constant_shell(makeString("adjStrings")), reader_make_constant_shell(makeString("adjStrings"))), list(reader_make_constant_shell(makeString("plural-Generic")))), NIL), list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("massNumber")))), list(reader_make_constant_shell(makeString("massNumber")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("massNumber-Generic")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("massNumber-Generic")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("nameString"))), list(reader_make_constant_shell(makeString("nameString")))), list(reader_make_constant_shell(makeString("nameString")))), list(list(list(reader_make_constant_shell(makeString("nameString"))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("nameString")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("nameString")))), list(reader_make_constant_shell(makeString("nameString")))), list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("nameString")))), list(reader_make_constant_shell(makeString("nameString")))),
				list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("nameString")))), NIL), list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("pnSingular")))), list(reader_make_constant_shell(makeString("pnSingular")))),
				list(list(list(reader_make_constant_shell(makeString("pnSingular"))), list(reader_make_constant_shell(makeString("pnPlural")), reader_make_constant_shell(makeString("pnSingular")))), list(reader_make_constant_shell(makeString("pnSingular")))),
				list(list(list(reader_make_constant_shell(makeString("pnPlural")), reader_make_constant_shell(makeString("pnSingular")), reader_make_constant_shell(makeString("pnPlural")), reader_make_constant_shell(makeString("pnSingular"))), list(reader_make_constant_shell(makeString("singular-Generic")))), list(reader_make_constant_shell(makeString("pnSingular")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("singular-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("massNumber-Generic")))), list(reader_make_constant_shell(makeString("massNumber-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("wordStrings")), reader_make_constant_shell(makeString("determinerStrings")), reader_make_constant_shell(makeString("pronounStrings"))), list(reader_make_constant_shell(makeString("determinerStrings")))), list(reader_make_constant_shell(makeString("determinerStrings")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("nonSingular-Generic")))), list(reader_make_constant_shell(makeString("massNumber-Generic")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic")), reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")), reader_make_constant_shell(makeString("singular-Generic")))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("singular-Generic")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("plural-Generic")))), NIL), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("properNameStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("placeName-Standard"))), list(reader_make_constant_shell(makeString("placeName-Standard")))), list(reader_make_constant_shell(makeString("placeName-Standard")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("placeName-Standard")))), list(reader_make_constant_shell(makeString("placeName-Standard")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("placeName-Standard")))), list(reader_make_constant_shell(makeString("placeName-Standard")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("placeName-Standard")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("geopoliticalEntityCodeDigraph"))), list(reader_make_constant_shell(makeString("geopoliticalEntityCodeDigraph")))), list(reader_make_constant_shell(makeString("geopoliticalEntityCodeDigraph")))),
				list(list(list(reader_make_constant_shell(makeString("geopoliticalEntityCodeDigraph"))), list(reader_make_constant_shell(makeString("abbreviationString")))), list(reader_make_constant_shell(makeString("geopoliticalEntityCodeDigraph")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("geopoliticalEntityCodeDigraph")))), list(reader_make_constant_shell(makeString("geopoliticalEntityCodeDigraph")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("geopoliticalEntityCodeDigraph")))), list(reader_make_constant_shell(makeString("geopoliticalEntityCodeDigraph")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("geopoliticalEntityCodeDigraph")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("regularAdverb")), reader_make_constant_shell(makeString("wordStrings")), reader_make_constant_shell(makeString("determinerStrings")), reader_make_constant_shell(makeString("pronounStrings"))), list(reader_make_constant_shell(makeString("determinerStrings")))), list(reader_make_constant_shell(makeString("determinerStrings")))),
				list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("singular")))), list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("singular")))), list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("singular-Generic")))), list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("singular-Generic")))), list(reader_make_constant_shell(makeString("singular-Generic")))), list(list(list(reader_make_constant_shell(makeString("tensed"))), list(reader_make_constant_shell(makeString("tensed")))), list(reader_make_constant_shell(makeString("tensed")))),
				list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("nounStrings")))), list(reader_make_constant_shell(makeString("singular")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("singular")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("prepositionStrings"))), list(reader_make_constant_shell(makeString("wordStrings")))), list(reader_make_constant_shell(makeString("prepositionStrings")))),
				list(list(list(reader_make_constant_shell(makeString("prepositionStrings"))), list(reader_make_constant_shell(makeString("prepositionStrings")))), list(reader_make_constant_shell(makeString("prepositionStrings")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("tensed"))), list(reader_make_constant_shell(makeString("thirdPersonSg-Generic")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("tensed"))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), list(list(list(reader_make_constant_shell(makeString("tensed"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("tensed")))),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Generic"))), list(reader_make_constant_shell(makeString("presentTense-Generic")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Present")), reader_make_constant_shell(makeString("thirdPersonSg-PresentPerfect")))),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Generic"))), list(reader_make_constant_shell(makeString("thirdPersonSg-Generic")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("singular")))), list(reader_make_constant_shell(makeString("singular")))), list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("singular")))), list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("plural")))), list(reader_make_constant_shell(makeString("plural")))),
				list(list(list(reader_make_constant_shell(makeString("plural"))), list(reader_make_constant_shell(makeString("plural")))), list(reader_make_constant_shell(makeString("plural")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("plural-Generic")))), list(reader_make_constant_shell(makeString("plural")))),
				list(list(list(reader_make_constant_shell(makeString("plural-Generic"))), list(reader_make_constant_shell(makeString("plural-Generic")))), list(reader_make_constant_shell(makeString("plural-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("pluralVerb-Generic"))), list(reader_make_constant_shell(makeString("simplePresent-Generic")))), list(reader_make_constant_shell(makeString("pluralVerb-Present")))),
				list(list(list(reader_make_constant_shell(makeString("pluralVerb-Generic"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("pluralVerb-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("pluralVerb-Generic"))), list(reader_make_constant_shell(makeString("pluralVerb-Generic")))), list(reader_make_constant_shell(makeString("pluralVerb-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("nonSingular-Generic"))), list(reader_make_constant_shell(makeString("plural")))), list(reader_make_constant_shell(makeString("plural")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("nonSingular-Generic")))), list(reader_make_constant_shell(makeString("plural")))),
				list(list(list(reader_make_constant_shell(makeString("nonSingular-Generic"))), list(reader_make_constant_shell(makeString("properNameStrings")))), list(reader_make_constant_shell(makeString("properNameStrings")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("simpleNounStrings")))), list(reader_make_constant_shell(makeString("simpleNounStrings")))),
				list(list(list(reader_make_constant_shell(makeString("pronounStrings"))), list(reader_make_constant_shell(makeString("pronounStrings")))), list(reader_make_constant_shell(makeString("pronounStrings")))), list(list(list(reader_make_constant_shell(makeString("pronounStrings"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("adjStrings"))), list(reader_make_constant_shell(makeString("adjStrings")))), list(reader_make_constant_shell(makeString("adjStrings")))),
				list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("plural-Generic")), reader_make_constant_shell(makeString("singular-Generic")))), list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("regularAdverb")), reader_make_constant_shell(makeString("determinerStrings"))), list(reader_make_constant_shell(makeString("determinerStrings")))), list(reader_make_constant_shell(makeString("determinerStrings")))),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Generic"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Generic")))),
				list(list(list(reader_make_constant_shell(makeString("pluralVerb-Present"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("pluralVerb-Present")))),
				list(list(list(new SubLObject[] { reader_make_constant_shell(makeString("singular")), reader_make_constant_shell(makeString("nounStrings")), reader_make_constant_shell(makeString("singular-Generic")), reader_make_constant_shell(makeString("plural-Generic")), reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("regularAdverb")),
						reader_make_constant_shell(makeString("adverbStrings")), reader_make_constant_shell(makeString("regularDegree")), reader_make_constant_shell(makeString("adjStrings")), reader_make_constant_shell(makeString("determinerStrings")), reader_make_constant_shell(makeString("wordStrings")) }), list(reader_make_constant_shell(makeString("determinerStrings")))),
						list(reader_make_constant_shell(makeString("determinerStrings")))),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Present"))), list(reader_make_constant_shell(makeString("wordStrings")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Present")))),
				list(list(list(reader_make_constant_shell(makeString("regularAdverb")), reader_make_constant_shell(makeString("determinerStrings")), reader_make_constant_shell(makeString("pronounStrings"))), list(reader_make_constant_shell(makeString("determinerStrings")))), list(reader_make_constant_shell(makeString("determinerStrings")))),
				list(list(list(reader_make_constant_shell(makeString("regularDegree")), reader_make_constant_shell(makeString("nounStrings")), reader_make_constant_shell(makeString("singular-Generic")), reader_make_constant_shell(makeString("plural-Generic")), reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("verbStrings")),
						reader_make_constant_shell(makeString("determinerStrings"))), list(reader_make_constant_shell(makeString("determinerStrings")))), list(reader_make_constant_shell(makeString("determinerStrings")))),
				list(list(list(reader_make_constant_shell(makeString("infinitive"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("infinitive")))), list(list(list(reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("massNumber")))), list(reader_make_constant_shell(makeString("massNumber")))),
				list(list(list(reader_make_constant_shell(makeString("pluralVerb-Present"))), list(reader_make_constant_shell(makeString("wordStrings")))), list(reader_make_constant_shell(makeString("pluralVerb-Present")))),
				list(list(list(reader_make_constant_shell(makeString("regularDegree")), reader_make_constant_shell(makeString("singular")), reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("adjStrings")))), list(reader_make_constant_shell(makeString("regularDegree")))),
				list(list(list(reader_make_constant_shell(makeString("regularDegree"))), list(reader_make_constant_shell(makeString("adjStrings")))), list(reader_make_constant_shell(makeString("regularDegree")))),
				list(list(list(reader_make_constant_shell(makeString("determinerStrings"))), list(reader_make_constant_shell(makeString("determinerStrings")))), list(reader_make_constant_shell(makeString("determinerStrings")))),
				list(list(list(reader_make_constant_shell(makeString("agentiveNounStrings"))), list(reader_make_constant_shell(makeString("agentiveNounStrings")))), list(reader_make_constant_shell(makeString("agentiveNounStrings")))),
				list(list(list(reader_make_constant_shell(makeString("simpleNounStrings"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), list(reader_make_constant_shell(makeString("simpleNounStrings")))),
				list(list(list(reader_make_constant_shell(makeString("secondPersonSg-Present")), reader_make_constant_shell(makeString("firstPersonSg-Present")), reader_make_constant_shell(makeString("pluralVerb-Present")), reader_make_constant_shell(makeString("infinitive")), reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))),
						list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("determinerStrings")), reader_make_constant_shell(makeString("pronounStrings"))), list(reader_make_constant_shell(makeString("determinerStrings")))), list(reader_make_constant_shell(makeString("determinerStrings")))),
				list(list(list(reader_make_constant_shell(makeString("determinerStrings")), reader_make_constant_shell(makeString("pronounStrings"))), list(reader_make_constant_shell(makeString("pronounStrings")))), list(reader_make_constant_shell(makeString("pronounStrings")))),
				list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("agentiveNounStrings")))), list(reader_make_constant_shell(makeString("agentive-Sg")), reader_make_constant_shell(makeString("agentive-Mass")))),
				list(list(list(reader_make_constant_shell(makeString("secondPersonSg-Present")), reader_make_constant_shell(makeString("firstPersonSg-Present")), reader_make_constant_shell(makeString("pluralVerb-Present")), reader_make_constant_shell(makeString("infinitive"))), list(reader_make_constant_shell(makeString("verbStrings")))),
						list(reader_make_constant_shell(makeString("secondPersonSg-Present")), reader_make_constant_shell(makeString("firstPersonSg-Present")), reader_make_constant_shell(makeString("pluralVerb-Present")), reader_make_constant_shell(makeString("infinitive")))),
				list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Present"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("thirdPersonSg-Present")))), list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("plural"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL), list(list(list(reader_make_constant_shell(makeString("nonSingular-Generic"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("presentParticiple"))), list(reader_make_constant_shell(makeString("verbStrings")))), list(reader_make_constant_shell(makeString("presentParticiple")))), list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL), list(list(list(reader_make_constant_shell(makeString("nonPlural-Generic"))), list(reader_make_constant_shell(makeString("verbStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("properNounStrings"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), NIL), list(list(list(reader_make_constant_shell(makeString("pnNonPlural-Generic"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("plural"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), list(reader_make_constant_shell(makeString("plural")))), list(list(list(reader_make_constant_shell(makeString("pnPlural"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), list(reader_make_constant_shell(makeString("singular")))), list(list(list(reader_make_constant_shell(makeString("pnSingular"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("massNumber-Generic"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), NIL), list(list(list(reader_make_constant_shell(makeString("singular-Generic"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), list(reader_make_constant_shell(makeString("singular")))),
				list(list(list(reader_make_constant_shell(makeString("massNumber"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), NIL),
				list(list(list(reader_make_constant_shell(makeString("plural")), reader_make_constant_shell(makeString("wordStrings")), reader_make_constant_shell(makeString("properNameStrings"))), list(reader_make_constant_shell(makeString("simpleNounStrings")))), list(reader_make_constant_shell(makeString("simpleNounStrings")), reader_make_constant_shell(makeString("properNameStrings")))),
				list(list(list(reader_make_constant_shell(makeString("gerund-Plural")), reader_make_constant_shell(makeString("wordStrings"))),
						list(reader_make_constant_shell(makeString("verbStrings")), reader_make_constant_shell(makeString("verbStrings")), reader_make_constant_shell(makeString("gerund-Plural")), reader_make_constant_shell(makeString("gerund-Singular")), reader_make_constant_shell(makeString("gerund")), reader_make_constant_shell(makeString("agentive-Sg"))),
						list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("CyclishParaphraseMt")), list(reader_make_constant_shell(makeString("MtTimeDimFn")), reader_make_constant_shell(makeString("Now"))))),
						list(reader_make_constant_shell(makeString("gerund-Plural")), reader_make_constant_shell(makeString("verbStrings")), reader_make_constant_shell(makeString("gerund-Singular")), reader_make_constant_shell(makeString("gerund")), reader_make_constant_shell(makeString("agentive-Sg")))) });
	}

	@Override
	public void declareFunctions() {
		declare_pph_utilities_file();
	}

	@Override
	public void initializeVariables() {
		init_pph_utilities_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_pph_utilities_file();
	}

	

	public static final class $det_invisible_charP$UnaryFunction extends UnaryFunction {
		public $det_invisible_charP$UnaryFunction() {
			super(extractFunctionNamed("DET-INVISIBLE-CHAR?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return det_invisible_charP(arg1);
		}
	}

	public static final class $specs_fn_natP$UnaryFunction extends UnaryFunction {
		public $specs_fn_natP$UnaryFunction() {
			super(extractFunctionNamed("SPECS-FN-NAT?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return specs_fn_natP(arg1);
		}
	}

	public static final class $pph_valid_var_typeP$UnaryFunction extends UnaryFunction {
		public $pph_valid_var_typeP$UnaryFunction() {
			super(extractFunctionNamed("PPH-VALID-VAR-TYPE?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return pph_valid_var_typeP(arg1);
		}
	}

	public static final class $pph_possibly_processable_indexical_p$UnaryFunction extends UnaryFunction {
		public $pph_possibly_processable_indexical_p$UnaryFunction() {
			super(extractFunctionNamed("PPH-POSSIBLY-PROCESSABLE-INDEXICAL-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return pph_possibly_processable_indexical_p(arg1);
		}
	}

	public static final class $pph_find_indexical_template_for_dates$UnaryFunction extends UnaryFunction {
		public $pph_find_indexical_template_for_dates$UnaryFunction() {
			super(extractFunctionNamed("PPH-FIND-INDEXICAL-TEMPLATE-FOR-DATES"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return pph_find_indexical_template_for_dates(arg1);
		}
	}

	public static final class $pph_indexical_date_p$UnaryFunction extends UnaryFunction {
		public $pph_indexical_date_p$UnaryFunction() {
			super(extractFunctionNamed("PPH-INDEXICAL-DATE-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return pph_indexical_date_p(arg1);
		}
	}

	public static final class $pph_date_matches_indexicalP$BinaryFunction extends BinaryFunction {
		public $pph_date_matches_indexicalP$BinaryFunction() {
			super(extractFunctionNamed("PPH-DATE-MATCHES-INDEXICAL?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return pph_date_matches_indexicalP(arg1, arg2);
		}
	}

	public static final class $pph_arg_position_specifierP$UnaryFunction extends UnaryFunction {
		public $pph_arg_position_specifierP$UnaryFunction() {
			super(extractFunctionNamed("PPH-ARG-POSITION-SPECIFIER?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return pph_arg_position_specifierP(arg1);
		}
	}

	public static final class $pph_identity_template_p$UnaryFunction extends UnaryFunction {
		public $pph_identity_template_p$UnaryFunction() {
			super(extractFunctionNamed("PPH-IDENTITY-TEMPLATE-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return pph_identity_template_p(arg1);
		}
	}

	public static final class $pph_prefer_assertionP$BinaryFunction extends BinaryFunction {
		public $pph_prefer_assertionP$BinaryFunction() {
			super(extractFunctionNamed("PPH-PREFER-ASSERTION?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return pph_prefer_assertionP(arg1, arg2, pph_utilities.$pph_prefer_assertionP$BinaryFunction.UNPROVIDED, pph_utilities.$pph_prefer_assertionP$BinaryFunction.UNPROVIDED, pph_utilities.$pph_prefer_assertionP$BinaryFunction.UNPROVIDED);
		}
	}

	public static final class $tou_atomic_sentenceP$UnaryFunction extends UnaryFunction {
		public $tou_atomic_sentenceP$UnaryFunction() {
			super(extractFunctionNamed("TOU-ATOMIC-SENTENCE?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return tou_atomic_sentenceP(arg1);
		}
	}

	public static final class $pph_specP$BinaryFunction extends BinaryFunction {
		public $pph_specP$BinaryFunction() {
			super(extractFunctionNamed("PPH-SPEC?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return pph_specP(arg1, arg2, pph_utilities.$pph_specP$BinaryFunction.UNPROVIDED);
		}
	}

	public static final class $pph_spec_predicateP$BinaryFunction extends BinaryFunction {
		public $pph_spec_predicateP$BinaryFunction() {
			super(extractFunctionNamed("PPH-SPEC-PREDICATE?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return pph_spec_predicateP(arg1, arg2, pph_utilities.$pph_spec_predicateP$BinaryFunction.UNPROVIDED);
		}
	}

	public static final class $pph_genl_predicateP$BinaryFunction extends BinaryFunction {
		public $pph_genl_predicateP$BinaryFunction() {
			super(extractFunctionNamed("PPH-GENL-PREDICATE?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return pph_genl_predicateP(arg1, arg2, pph_utilities.$pph_genl_predicateP$BinaryFunction.UNPROVIDED);
		}
	}

	public static final class $pph_nth_phrase_native extends SubLStructNative {
		public SubLObject $num;

		public SubLObject $constraints;

		private static final SubLStructDeclNative structDecl;

		private $pph_nth_phrase_native() {
			this.$num = Lisp.NIL;
			this.$constraints = Lisp.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return this.$num;
		}

		@Override
		public SubLObject getField3() {
			return this.$constraints;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return this.$num = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value) {
			return this.$constraints = value;
		}

		static {
			structDecl = makeStructDeclNative($pph_nth_phrase_native.class, PPH_NTH_PHRASE, PPH_NTH_PHRASE_P, $list651, $list652, new String[] { "$num", "$constraints" }, $list653, $list654, PPRINT_PPH_NTH_PHRASE);
		}
	}

	public static final class $pph_nth_phrase_p$UnaryFunction extends UnaryFunction {
		public $pph_nth_phrase_p$UnaryFunction() {
			super(extractFunctionNamed("PPH-NTH-PHRASE-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return pph_nth_phrase_p(arg1);
		}
	}

	public static final class $pph_pred_licensed_by_predP$BinaryFunction extends BinaryFunction {
		public $pph_pred_licensed_by_predP$BinaryFunction() {
			super(extractFunctionNamed("PPH-PRED-LICENSED-BY-PRED?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return pph_pred_licensed_by_predP(arg1, arg2, pph_utilities.$pph_pred_licensed_by_predP$BinaryFunction.UNPROVIDED);
		}
	}

	public static final class $pph_arg_position_subsumesP$BinaryFunction extends BinaryFunction {
		public $pph_arg_position_subsumesP$BinaryFunction() {
			super(extractFunctionNamed("PPH-ARG-POSITION-SUBSUMES?"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return pph_arg_position_subsumesP(arg1, arg2, pph_utilities.$pph_arg_position_subsumesP$BinaryFunction.UNPROVIDED);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param $standInDenotation
	 * @return
	 */
	public static SubLObject constant_from_key(SubLObject $standInDenotation) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param args
	 * @return
	 */
	public static SubLObject key_from_constant(SubLObject args) {
		// TODO Auto-generated method stub
		return null;
	}
}

/**
 * Total time: 12636 ms
 */
