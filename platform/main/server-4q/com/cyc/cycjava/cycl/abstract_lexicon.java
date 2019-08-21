/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.hlmt.hlmt_p;
import static com.cyc.cycjava.cycl.hlmt.possibly_hlmt_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.replace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.USE_V1;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ABSTRACT-LEXICON
 * source file: /cyc/top/cycl/abstract-lexicon.lisp
 * created:     2019/07/03 17:38:53
 */
public final class abstract_lexicon extends SubLTranslatedFile implements V12 {
	// Internal Constant Initializer Methods
	@LispMethod(comment = "Internal Constant Initializer Methods")
	private static final SubLObject _constant_169_initializer() {
		return list(new SubLObject[] {
				list(makeSymbol("DEFAULT-EXCLUDE-MTS"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"),
						list(QUOTE,
								list(new SubLObject[] { reader_make_constant_shell("WebSearchDataMt"), reader_make_constant_shell("CyclistsMt"), reader_make_constant_shell("RelationParaphraseMt"), reader_make_constant_shell("WordNetMappingMt"), reader_make_constant_shell("PornographyJargonMt"), reader_make_constant_shell("CommonEnglishMisspellingsMt"), reader_make_constant_shell("ComputereseLexicalMt"),
										reader_make_constant_shell("CyclishMt"), reader_make_constant_shell("TemporaryLexicalAssertionsMt"), reader_make_constant_shell("EnglishWordSenseAssertions-HoldingMt"), reader_make_constant_shell("TemporaryLexicalAssertions-WordNetImportMt"), reader_make_constant_shell("RedundantLexicalMt"), reader_make_constant_shell("PDATemplateTestMt"),
										reader_make_constant_shell("EnglishParaphraseMt"), reader_make_constant_shell("SupplementalDeterminerSemTransLexicalMt") }))),
				list(makeSymbol("DEFAULT-EXCLUDE-PREDICATES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("SET-ELEMENT-LIST"), makeSymbol("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*"))),
				list(makeSymbol("DEFAULT-BASE-MT"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell("AllGeneralEnglishValidatedLexicalMicrotheoryPSC")), list(makeSymbol("DEFAULT-KB-SPEC"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell("AbstractLexiconSpecification")),
				list(makeSymbol("ALLOWED-MTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("EXCLUDED-MTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("BASE-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeKeyword("UNINITIALIZED")),
				list(makeSymbol("ROOT-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("EXCLUDED-PREDS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("EXCLUDED-POS-LIST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), NIL),
				list(makeSymbol("TRIE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IGNORE-CACHE?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CASE-SENSITIVITY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")),
				list(makeSymbol("ALLOW-FABRICATION?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), T), list(makeSymbol("LEARNED"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ACTIVE-LEARNERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ALLOW-STEMMING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), T),
				list(makeSymbol("STOP-WORDS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), NIL), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("RESPORATOR-CYC-POS"), list(makeSymbol("TYPE.STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("RESPORATOR-TO-INFLECTIONS"), list(makeSymbol("TYPE.STRING")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESPORATOR-TO-CYCL"), list(makeSymbol("TYPE.STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALID-NL-TRIE-ENTRY?"), list(makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPY"), list(makeSymbol("&OPTIONAL"), makeSymbol("TARGET")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("LEX-ENTRY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORGET"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREFIXES"), list(makeSymbol("STRINGS")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREFIXES-FROM-STRING"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-DOCUMENT"), list(makeSymbol("DOCUMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-PARAGRAPH"), list(makeSymbol("PARAGRAPH")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-SENTENCE"), list(makeSymbol("SENTENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TOKENIZE"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-WORDS"), list(makeSymbol("WORDS")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-ALLOWED-MTS"), list(makeSymbol("KB-SPEC")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BASE-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BASE-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-GENL-MTS"), list(makeSymbol("MT")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORBID-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-EXCLUDED-PREDS"), list(makeSymbol("PRED-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-PREDICATE"), list(makeSymbol("PRED")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXCLUDE-PREDICATE"), list(makeSymbol("PRED")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-POS"), list(makeSymbol("POS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXCLUDE-POS"), list(makeSymbol("POS")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-LEARNER"), list(makeSymbol("LEARNER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-LEARNER"), list(makeSymbol("LEARNER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEARNERS"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IGNORE-CACHE"), list(makeSymbol("BOOLEAN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IGNORE-CACHE?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-STEMMING"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CASE-SENSITIVITY"), list(makeSymbol("SENSITIVITY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CASE-SENSITIVITY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORBID-STEMMING"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-FABRICATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORBID-FABRICATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATION-FORBIDDEN?"), NIL, makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATION-ALLOWED?"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOUN-COMPOUND-LEARN"), list(makeSymbol("TEXT")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COOCCURRENCE-STATISTICS-LEARN"), list(makeSymbol("TEXT")), makeKeyword("PROTECTED")) });
	}

	static private final SubLString $str_alt482$ = makeString("");

	public static final class $abstract_lexicon_iterator_state_native extends SubLStructNative {
		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native.this.$trie_iterator;
		}

		@Override
		public SubLObject getField3() {
			return com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native.this.$next_entries;
		}

		@Override
		public SubLObject getField4() {
			return com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native.this.$lexicon;
		}

		@Override
		public SubLObject setField2(SubLObject value) {
			return com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native.this.$trie_iterator = value;
		}

		@Override
		public SubLObject setField3(SubLObject value) {
			return com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native.this.$next_entries = value;
		}

		@Override
		public SubLObject setField4(SubLObject value) {
			return com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native.this.$lexicon = value;
		}

		public SubLObject $trie_iterator = Lisp.NIL;

		public SubLObject $next_entries = Lisp.NIL;

		public SubLObject $lexicon = Lisp.NIL;

		private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native.class, ABSTRACT_LEXICON_ITERATOR_STATE, ABSTRACT_LEXICON_ITERATOR_STATE_P, $list_alt539, $list_alt540, new String[] { "$trie_iterator", "$next_entries", "$lexicon" }, $list_alt541, $list_alt542, DEFAULT_STRUCT_PRINT_FUNCTION);
	}

	public static final SubLFile me = new abstract_lexicon();

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $cyc_to_penn_list$ = makeSymbol("*CYC-TO-PENN-LIST*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $cyc_to_penn_map$ = makeSymbol("*CYC-TO-PENN-MAP*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $cyc_to_supertag_map$ = makeSymbol("*CYC-TO-SUPERTAG-MAP*");

	// defparameter
	@LispMethod(comment = "defparameter")
	private static final SubLSymbol $cyc_to_supertag_list$ = makeSymbol("*CYC-TO-SUPERTAG-LIST*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dtp_textract_lemma$ = makeSymbol("*DTP-TEXTRACT-LEMMA*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $nominal_tags$ = makeSymbol("*NOMINAL-TAGS*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $verbal_tags$ = makeSymbol("*VERBAL-TAGS*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $adjectival_tags$ = makeSymbol("*ADJECTIVAL-TAGS*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $adverbial_tags$ = makeSymbol("*ADVERBIAL-TAGS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	private static final SubLSymbol $penn_tag_backoffs$ = makeSymbol("*PENN-TAG-BACKOFFS*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $scalar_functionP_caching_state$ = makeSymbol("*SCALAR-FUNCTION?-CACHING-STATE*");

	// defparameter
	// temporary control parameter, eventually to be hardcoded to T
	/**
	 * temporary control parameter, eventually to be hardcoded to T
	 */
	@LispMethod(comment = "temporary control parameter, eventually to be hardcoded to T\ndefparameter")
	private static final SubLSymbol $lexify_sentence_ignore_pos_for_multiword_tokens$ = makeSymbol("*LEXIFY-SENTENCE-IGNORE-POS-FOR-MULTIWORD-TOKENS*");

	// defconstant
	@LispMethod(comment = "defconstant")
	public static final SubLSymbol $dtp_abstract_lexicon_iterator_state$ = makeSymbol("*DTP-ABSTRACT-LEXICON-ITERATOR-STATE*");

	// Internal Constants
	@LispMethod(comment = "Internal Constants")
	static private final SubLList $list0 = list(new SubLObject[] { list(makeKeyword("."), reader_make_constant_shell("Punctuation-SP"), NIL), list(makeKeyword("WP"), reader_make_constant_shell("WHPronoun"), reader_make_constant_shell("pronounStrings")), list(makeKeyword("``"), reader_make_constant_shell("Punctuation-SP"), NIL),
			list(makeKeyword("POS"), reader_make_constant_shell("PossessiveMarker"), reader_make_constant_shell("possessiveMarkerStrings")), list(makeKeyword("RB"), reader_make_constant_shell("Adverb"), reader_make_constant_shell("regularAdverb")), list(makeKeyword("JJ"), reader_make_constant_shell("Adjective"), reader_make_constant_shell("regularDegree")),
			list(makeKeyword("''"), reader_make_constant_shell("Punctuation-SP"), NIL), list(makeKeyword("MD"), reader_make_constant_shell("Modal"), reader_make_constant_shell("verbStrings")), list(makeKeyword("AUX"), reader_make_constant_shell("AuxVerb"), reader_make_constant_shell("verbStrings")), list(makeKeyword("VB"), reader_make_constant_shell("Verb"), reader_make_constant_shell("infinitive")),
			list(makeKeyword("DT"), reader_make_constant_shell("Determiner"), reader_make_constant_shell("determinerStrings")), list(makeKeyword("VBD"), reader_make_constant_shell("Verb"), reader_make_constant_shell("pastTense-Generic")), list(makeKeyword("NN"), reader_make_constant_shell("Noun"), reader_make_constant_shell("nonPlural-Generic")),
			list(makeKeyword("NNS"), reader_make_constant_shell("Noun"), reader_make_constant_shell("plural-Generic")), list(makeKeyword("VBG"), reader_make_constant_shell("Verb"), reader_make_constant_shell("presentParticiple")), list(makeKeyword("RP"), reader_make_constant_shell("VerbParticle"), NIL), list(makeKeyword("TO"), reader_make_constant_shell("InfinitiveComp"), NIL),
			list(makeKeyword("TO"), reader_make_constant_shell("Preposition"), reader_make_constant_shell("prepositionStrings")), list(makeKeyword("CC"), reader_make_constant_shell("CoordinatingConjunction"), NIL), list(makeKeyword("JJR"), reader_make_constant_shell("Adjective"), reader_make_constant_shell("comparativeDegree")),
			list(makeKeyword("RBR"), reader_make_constant_shell("Adverb"), reader_make_constant_shell("comparativeAdverb")), list(makeKeyword("VBN"), reader_make_constant_shell("Verb"), reader_make_constant_shell("perfect")), list(makeKeyword("VBN"), reader_make_constant_shell("Verb"), reader_make_constant_shell("passiveParticiple")), list(makeKeyword("CD"), reader_make_constant_shell("Number-SP"), NIL),
			list(makeKeyword("JJS"), reader_make_constant_shell("Adjective"), reader_make_constant_shell("superlativeDegree")), list(makeKeyword("RBS"), reader_make_constant_shell("Adverb"), reader_make_constant_shell("superlativeAdverb")), list(makeKeyword("PDT"), reader_make_constant_shell("Predeterminer"), NIL),
			list(makeKeyword("VBP"), reader_make_constant_shell("Verb"), reader_make_constant_shell("nonThirdSg-Present")), list(makeKeyword("WRB"), reader_make_constant_shell("WHAdverb"), reader_make_constant_shell("regularAdverb")), list(makeKeyword("WP$"), reader_make_constant_shell("WHPossessive"), NIL),
			list(makeKeyword("NNP"), reader_make_constant_shell("ProperNoun"), reader_make_constant_shell("nonPlural-Generic")), list(makeKeyword("NNP"), reader_make_constant_shell("ProperNoun"), reader_make_constant_shell("nameSpelling")), list($NNPS, reader_make_constant_shell("ProperNoun"), reader_make_constant_shell("plural-Generic")),
			list(makeKeyword("WDT"), reader_make_constant_shell("WHDeterminer"), reader_make_constant_shell("determinerStrings")), list(makeKeyword("PRP"), reader_make_constant_shell("Pronoun"), reader_make_constant_shell("pronounStrings")), list(makeKeyword("VBZ"), reader_make_constant_shell("Verb"), reader_make_constant_shell("thirdPersonSg-Present")),
			list(makeKeyword("PRP$"), reader_make_constant_shell("PossessivePronoun"), NIL), list(makeKeyword("IN"), reader_make_constant_shell("Preposition"), reader_make_constant_shell("prepositionStrings")), list(makeKeyword("IN"), reader_make_constant_shell("Complementizer"), NIL), list(makeKeyword("IN"), reader_make_constant_shell("SubordinatingConjunction"), NIL),
			list(makeKeyword("EX"), reader_make_constant_shell("There-Existential"), NIL), list(makeKeyword("UH"), reader_make_constant_shell("Interjection-SpeechPart"), NIL), list(makeKeyword(":"), reader_make_constant_shell("Punctuation-SP"), NIL), list(makeKeyword("$"), reader_make_constant_shell("Punctuation-SP"), NIL), list(makeKeyword(","), reader_make_constant_shell("Punctuation-SP"), NIL),
			list(makeKeyword(")"), reader_make_constant_shell("Punctuation-SP"), NIL), list(makeKeyword("("), reader_make_constant_shell("Punctuation-SP"), NIL) });

	static private final SubLSymbol $sym1$GENL_IN_ANY_MT_ = makeSymbol("GENL-IN-ANY-MT?");

	private static final SubLInteger $int$500 = makeInteger(500);

	static private final SubLList $list8 = list(new SubLObject[] { list(list(makeString("A_nx0V")), reader_make_constant_shell("Verb"), reader_make_constant_shell("IntransitiveVerbFrame"), reader_make_constant_shell("tensed")), list(list(makeString("A_nx0V")), reader_make_constant_shell("Verb"), reader_make_constant_shell("MiddleVoiceFrame"), reader_make_constant_shell("tensed")),
			list(list(makeString("A_nx0Vnx1")), reader_make_constant_shell("Verb"), reader_make_constant_shell("TransitiveNPFrame"), reader_make_constant_shell("tensed")), list(list(makeString("A_nx0Vnx1nx2"), makeString("A_nx0Vnx2nx1")), reader_make_constant_shell("Verb"), reader_make_constant_shell("DitransitiveNP-NPFrame"), reader_make_constant_shell("tensed")),
			list(list(makeString("A_nx0Vpnx1"), makeString("A_nx0Vpx1")), reader_make_constant_shell("Verb"), reader_make_constant_shell("TransitivePPFrameType"), reader_make_constant_shell("tensed")), list(list(makeString("A_nx0Vnx1pnx2"), makeString("A_nx0Vnx1px2")), reader_make_constant_shell("Verb"), reader_make_constant_shell("DitransitivePPFrameType"), reader_make_constant_shell("tensed")),
			list(list(makeString("A_nx0V")), reader_make_constant_shell("Verb"), reader_make_constant_shell("UnderstoodReciprocalObjectFrame"), reader_make_constant_shell("tensed")), list(list(makeString("A_Gnx0V")), reader_make_constant_shell("Verb"), reader_make_constant_shell("IntransitiveVerbFrame"), reader_make_constant_shell("presentParticiple")),
			list(list(makeString("A_Gnx0Vnx1")), reader_make_constant_shell("Verb"), reader_make_constant_shell("TransitiveNPFrame"), reader_make_constant_shell("presentParticiple")), list(list(makeString("A_Gnx0Vnx1nx2")), reader_make_constant_shell("Verb"), reader_make_constant_shell("DitransitiveNP-NPFrame"), reader_make_constant_shell("presentParticiple")),
			list(list(makeString("A_Gnx0Vpnx1"), makeString("A_Gnx0Vpx1")), reader_make_constant_shell("Verb"), reader_make_constant_shell("TransitivePPFrameType"), reader_make_constant_shell("presentParticiple")),
			list(list(makeString("A_Gnx0Vnx1pnx2"), makeString("A_Gnx0Vnx1px2"), makeString("B_Nn")), reader_make_constant_shell("Verb"), reader_make_constant_shell("DitransitivePPFrameType"), reader_make_constant_shell("presentParticiple")), list(list(makeString("B_Vvx")), reader_make_constant_shell("AuxVerb")),
			list(list(makeString("A_NXN"), makeString("B_Nn")), reader_make_constant_shell("Noun"), reader_make_constant_shell("RegularNounFrame"), reader_make_constant_shell("nounStrings")), list(list(makeString("A_NXN")), reader_make_constant_shell("Noun"), reader_make_constant_shell("GenitiveFrame"), reader_make_constant_shell("nounStrings")),
			list(list(makeString("B_nxPnx")), reader_make_constant_shell("Preposition"), reader_make_constant_shell("Post-NounPhraseModifyingFrame"), reader_make_constant_shell("prepositionStrings")), list(list(makeString("B_vxPnx")), reader_make_constant_shell("Preposition"), reader_make_constant_shell("VerbPhraseModifyingFrame"), reader_make_constant_shell("prepositionStrings")),
			list(list(makeString("B_Dnx")), reader_make_constant_shell("Determiner")), list(list(makeString("B_An")), reader_make_constant_shell("Adjective"), reader_make_constant_shell("RegularAdjFrame"), reader_make_constant_shell("adjStrings")),
			list(list(makeString("B_vxARB"), makeString("B_ARBvx"), makeString("B_ARBs")), reader_make_constant_shell("Adverb"), reader_make_constant_shell("VerbPhraseModifyingFrame"), reader_make_constant_shell("adverbStrings")) });

	private static final SubLSymbol TEXTRACT_LEMMA = makeSymbol("TEXTRACT-LEMMA");

	private static final SubLSymbol TEXTRACT_LEMMA_P = makeSymbol("TEXTRACT-LEMMA-P");

	static private final SubLList $list12 = list(makeSymbol("PARAGRAPH"), makeSymbol("SENTENCE"), makeSymbol("WORD"), makeSymbol("STRING"), makeSymbol("CANON"), makeSymbol("TYPE"));

	static private final SubLList $list13 = list(makeKeyword("PARAGRAPH"), makeKeyword("SENTENCE"), $WORD, makeKeyword("STRING"), makeKeyword("CANON"), $TYPE);

	static private final SubLList $list14 = list(makeSymbol("TEXTRACT-LEMMA-PARAGRAPH"), makeSymbol("TEXTRACT-LEMMA-SENTENCE"), makeSymbol("TEXTRACT-LEMMA-WORD"), makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("TEXTRACT-LEMMA-CANON"), makeSymbol("TEXTRACT-LEMMA-TYPE"));

	static private final SubLList $list15 = list(makeSymbol("_CSETF-TEXTRACT-LEMMA-PARAGRAPH"), makeSymbol("_CSETF-TEXTRACT-LEMMA-SENTENCE"), makeSymbol("_CSETF-TEXTRACT-LEMMA-WORD"), makeSymbol("_CSETF-TEXTRACT-LEMMA-STRING"), makeSymbol("_CSETF-TEXTRACT-LEMMA-CANON"), makeSymbol("_CSETF-TEXTRACT-LEMMA-TYPE"));

	private static final SubLSymbol TEXTRACT_LEMMA_PRINT = makeSymbol("TEXTRACT-LEMMA-PRINT");

	private static final SubLSymbol TEXTRACT_LEMMA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TEXTRACT-LEMMA-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list18 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TEXTRACT-LEMMA-P"));

	private static final SubLSymbol TEXTRACT_LEMMA_PARAGRAPH = makeSymbol("TEXTRACT-LEMMA-PARAGRAPH");

	private static final SubLSymbol _CSETF_TEXTRACT_LEMMA_PARAGRAPH = makeSymbol("_CSETF-TEXTRACT-LEMMA-PARAGRAPH");

	private static final SubLSymbol TEXTRACT_LEMMA_SENTENCE = makeSymbol("TEXTRACT-LEMMA-SENTENCE");

	private static final SubLSymbol _CSETF_TEXTRACT_LEMMA_SENTENCE = makeSymbol("_CSETF-TEXTRACT-LEMMA-SENTENCE");

	private static final SubLSymbol TEXTRACT_LEMMA_WORD = makeSymbol("TEXTRACT-LEMMA-WORD");

	private static final SubLSymbol _CSETF_TEXTRACT_LEMMA_WORD = makeSymbol("_CSETF-TEXTRACT-LEMMA-WORD");

	private static final SubLSymbol _CSETF_TEXTRACT_LEMMA_STRING = makeSymbol("_CSETF-TEXTRACT-LEMMA-STRING");

	private static final SubLSymbol TEXTRACT_LEMMA_CANON = makeSymbol("TEXTRACT-LEMMA-CANON");

	private static final SubLSymbol _CSETF_TEXTRACT_LEMMA_CANON = makeSymbol("_CSETF-TEXTRACT-LEMMA-CANON");

	private static final SubLSymbol TEXTRACT_LEMMA_TYPE = makeSymbol("TEXTRACT-LEMMA-TYPE");

	private static final SubLSymbol _CSETF_TEXTRACT_LEMMA_TYPE = makeSymbol("_CSETF-TEXTRACT-LEMMA-TYPE");

	private static final SubLString $str37$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	private static final SubLSymbol MAKE_TEXTRACT_LEMMA = makeSymbol("MAKE-TEXTRACT-LEMMA");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TEXTRACT_LEMMA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TEXTRACT-LEMMA-METHOD");

	private static final SubLList $list45 = list(CHAR_lparen, CHAR_lbracket);

	static private final SubLList $list46 = list(CHAR_lbracket, CHAR_rbracket);

	private static final SubLString $str47$__TEXTRACT_LEMMA_ = makeString("#<TEXTRACT-LEMMA ");

	private static final SubLString $str48$_ = makeString("/");

	private static final SubLString $str49$_ = makeString(">");

	static private final SubLList $list52 = list(new SubLObject[] {
			list(makeSymbol("STORED-PROPERTIES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"),
					list(QUOTE, list(new SubLObject[] { makeKeyword("STRING"), makeKeyword("WORD-UNIT"), makeKeyword("INFLECTIONS"), makeKeyword("PREDICATE"), makeKeyword("DENOTS"), makeKeyword("DENOT"), makeKeyword("PRAGMATICS"), makeKeyword("MT"), makeKeyword("SEMTRANS"), makeKeyword("FRAME"), makeKeyword("TRIE-ENTRY") }))),
			list(makeSymbol("COMPUTED-PROPERTIES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"),
					list(QUOTE,
							list(cons(makeKeyword("PENN-TAGS"), makeSymbol("COMPUTE-PENN-TAGS")), cons(makeKeyword("BACKOFF-PENN-TAGS"), makeSymbol("COMPUTE-BACKOFF-PENN-TAGS")), cons($TERM, makeSymbol("COMPUTE-TERM")), cons(makeKeyword("GENDER"), makeSymbol("COMPUTE-GENDER")), cons(makeKeyword("SUPER-TAGS"), makeSymbol("COMPUTE-SUPER-TAGS")), cons(makeKeyword("CYC-POS"), makeSymbol("COMPUTE-CYC-POS")),
									cons(makeKeyword("CYC-CATEGORY"), makeSymbol("COMPUTE-CYC-CATEGORY")), cons(makeKeyword("IS-NER-ENTRY?"), makeSymbol("COMPUTE-IS-NER-ENTRY"))))),
			list(makeSymbol("SUPPORTED-PROPERTIES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"),
					list(makeSymbol("APPEND"), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEX-ENTRY")), list(QUOTE, makeSymbol("STORED-PROPERTIES"))), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("CAR")), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEX-ENTRY")), list(QUOTE, makeSymbol("COMPUTED-PROPERTIES")))))),
			list(makeSymbol("PROPERTIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPY"), NIL, makeKeyword("PROTECTED")),
			list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), list(makeSymbol("PROPERTY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET"), list(makeSymbol("PROPERTY"), makeSymbol("VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOMINAL-P"), NIL, makeKeyword("PUBLIC")),
			list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VERBAL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADJECTIVAL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADVERBIAL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-PENN-TAGS"), NIL, makeKeyword("PROTECTED")),
			list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-BACKOFF-PENN-TAGS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-SUPER-TAGS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOUN?"), NIL, makeKeyword("PUBLIC")) });

	private static final SubLSymbol SUPPORTED_PROPERTIES = makeSymbol("SUPPORTED-PROPERTIES");

	private static final SubLSymbol COMPUTED_PROPERTIES = makeSymbol("COMPUTED-PROPERTIES");

	private static final SubLSymbol STORED_PROPERTIES = makeSymbol("STORED-PROPERTIES");

	private static final SubLList $list58 = list(new SubLObject[] { makeKeyword("STRING"), makeKeyword("WORD-UNIT"), makeKeyword("INFLECTIONS"), makeKeyword("PREDICATE"), makeKeyword("DENOTS"), makeKeyword("DENOT"), makeKeyword("PRAGMATICS"), makeKeyword("MT"), makeKeyword("SEMTRANS"), makeKeyword("FRAME"), makeKeyword("TRIE-ENTRY") });

	private static final SubLList $list59 = list(cons(makeKeyword("PENN-TAGS"), makeSymbol("COMPUTE-PENN-TAGS")), cons(makeKeyword("BACKOFF-PENN-TAGS"), makeSymbol("COMPUTE-BACKOFF-PENN-TAGS")), cons($TERM, makeSymbol("COMPUTE-TERM")), cons(makeKeyword("GENDER"), makeSymbol("COMPUTE-GENDER")), cons(makeKeyword("SUPER-TAGS"), makeSymbol("COMPUTE-SUPER-TAGS")),
			cons(makeKeyword("CYC-POS"), makeSymbol("COMPUTE-CYC-POS")), cons(makeKeyword("CYC-CATEGORY"), makeSymbol("COMPUTE-CYC-CATEGORY")), cons(makeKeyword("IS-NER-ENTRY?"), makeSymbol("COMPUTE-IS-NER-ENTRY")));

	private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-CLASS");

	private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-INSTANCE");

	static private final SubLList $list66 = list(makeKeyword("PROTECTED"));

	static private final SubLList $list67 = list(makeString("@return lex-entry-p; a new empty lex-entry"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PROPERTIES"), NIL), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");

	private static final SubLSymbol LEX_ENTRY_INITIALIZE_METHOD = makeSymbol("LEX-ENTRY-INITIALIZE-METHOD");

	private static final SubLList $list71 = list(makeKeyword("PUBLIC"));

	private static final SubLList $list72 = list(makeSymbol("PROPERTY"));

	private static final SubLList $list73 = list(makeString("@return object; the property value associated with PROPERTY"), list(makeSymbol("MUST"), list(makeSymbol("MEMBER"), makeSymbol("PROPERTY"), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEX-ENTRY")), list(QUOTE, makeSymbol("SUPPORTED-PROPERTIES")))), makeString("Unsupported lexical property ~a"), makeSymbol("PROPERTY")),
			list(makeSymbol("CLET"), list(list(makeSymbol("VALUE"), list(makeSymbol("CDR"), list(makeSymbol("ASSOC"), makeSymbol("PROPERTY"), makeSymbol("PROPERTIES"))))),
					list(makeSymbol("PUNLESS"), makeSymbol("VALUE"),
							list(makeSymbol("CLET"), list(list(makeSymbol("PROPERTY-METHOD"), list(makeSymbol("CDR"), list(makeSymbol("ASSOC"), makeSymbol("PROPERTY"), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEX-ENTRY")), list(QUOTE, makeSymbol("COMPUTED-PROPERTIES"))))))),
									list(makeSymbol("PWHEN"), makeSymbol("PROPERTY-METHOD"), list(makeSymbol("CSETQ"), makeSymbol("VALUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), makeSymbol("PROPERTY-METHOD"))), list(makeSymbol("PWHEN"), makeSymbol("VALUE"), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("PROPERTY"), makeSymbol("VALUE")), makeSymbol("PROPERTIES")))))),
					list(RET, makeSymbol("VALUE"))));

	private static final SubLSymbol $sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");

	private static final SubLString $str75$Unsupported_lexical_property__a = makeString("Unsupported lexical property ~a");

	private static final SubLSymbol LEX_ENTRY_GET_METHOD = makeSymbol("LEX-ENTRY-GET-METHOD");

	static private final SubLList $list81 = list(makeSymbol("PROPERTY"), makeSymbol("VALUE"));

	private static final SubLList $list82 = list(makeString("Sets this lex-entry's PROPERTY to VALUE"), list(makeSymbol("MUST"), list(makeSymbol("MEMBER"), makeSymbol("PROPERTY"), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEX-ENTRY")), list(QUOTE, makeSymbol("SUPPORTED-PROPERTIES")))), makeString("Unsupported lexical property ~a"), makeSymbol("PROPERTY")),
			list(makeSymbol("CSETQ"), makeSymbol("PROPERTIES"), list(makeSymbol("REMOVE"), makeSymbol("PROPERTY"), makeSymbol("PROPERTIES"), list(QUOTE, EQ), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("PROPERTY"), makeSymbol("VALUE")), makeSymbol("PROPERTIES")), list(RET, makeSymbol("VALUE")));

	private static final SubLSymbol $sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");

	private static final SubLSymbol LEX_ENTRY_SET_METHOD = makeSymbol("LEX-ENTRY-SET-METHOD");

	static private final SubLList $list87 = list(makeString("make a deep-copy of self"),
			list(makeSymbol("CLET"), list(list(makeSymbol("NEW-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY")))), list(makeSymbol("NEW-PROPERTIES"), NIL)),
					list(makeSymbol("CDOLIST"), list(makeSymbol("KEY.VAL"), makeSymbol("PROPERTIES")),
							list(makeSymbol("CLET"), list(list(makeSymbol("NEW-KEY"), list(makeSymbol("CAR"), makeSymbol("KEY.VAL"))), list(makeSymbol("VAL"), list(makeSymbol("CDR"), makeSymbol("KEY.VAL"))), list(makeSymbol("NEW-VAL"), list(makeSymbol("FIF"), list(makeSymbol("LISTP"), makeSymbol("VAL")), list(makeSymbol("COPY-LIST"), makeSymbol("VAL")), makeSymbol("VAL")))),
									list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("NEW-KEY"), makeSymbol("NEW-VAL")), makeSymbol("NEW-PROPERTIES")))),
					list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ENTRY"), list(QUOTE, makeSymbol("PROPERTIES")), makeSymbol("NEW-PROPERTIES")), list(RET, makeSymbol("NEW-ENTRY"))));

	private static final SubLSymbol $sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");

	private static final SubLSymbol LEX_ENTRY_COPY_METHOD = makeSymbol("LEX-ENTRY-COPY-METHOD");

	private static final SubLSymbol $sym90$NOUN_ = makeSymbol("NOUN?");

	private static final SubLList $list91 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

	private static final SubLList $list92 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeKeyword("ANY")));

	static private final SubLList $list93 = list(makeString("@return booleanp; Does this LEX-ENTRY represent a noun?\n                     i.e. Is its :CYC-POS property value a spec of #$Noun?"), list(makeSymbol("CLET"), list(list(makeSymbol("POS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("CYC-POS")))),
			list(makeSymbol("PIF"), list(EQ, makeSymbol("MT"), makeKeyword("ANY")), list(RET, list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("POS"), reader_make_constant_shell("Noun"))), list(RET, list(makeSymbol("GENL?"), makeSymbol("POS"), reader_make_constant_shell("Noun"), makeSymbol("MT"))))));

	private static final SubLSymbol $sym97$LEX_ENTRY_NOUN__METHOD = makeSymbol("LEX-ENTRY-NOUN?-METHOD");

	static private final SubLList $list99 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

	static private final SubLList $list100 = list(makeString("Prints this lex-entry to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<LEX-ENTRY "), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")),
			list(makeSymbol("CDOLIST"), list(makeSymbol("PROPERTY"), makeSymbol("PROPERTIES")), list(makeSymbol("PRIN1"), list(makeSymbol("CAR"), makeSymbol("PROPERTY")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" -> "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("CDR"), makeSymbol("PROPERTY")), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM"))),
			list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");

	private static final SubLString $str102$__LEX_ENTRY_ = makeString("#<LEX-ENTRY ");

	private static final SubLString $str103$____ = makeString(" -> ");

	private static final SubLSymbol LEX_ENTRY_PRINT_METHOD = makeSymbol("LEX-ENTRY-PRINT-METHOD");

	private static final SubLList $list105 = list(makeKeyword("NN"), makeKeyword("NNS"), makeKeyword("NNP"), $NNPS, makeKeyword("WP"), makeKeyword("PP"), makeKeyword("PRP"), makeKeyword("FW"));

	private static final SubLList $list106 = list(makeKeyword("VBZ"), makeKeyword("VBN"), makeKeyword("VBD"), makeKeyword("VBP"), makeKeyword("VB"), makeKeyword("VBG"));

	private static final SubLList $list107 = list(makeKeyword("JJ"), makeKeyword("JJR"), makeKeyword("JJS"));

	static private final SubLList $list108 = list(makeKeyword("RB"), makeKeyword("RBR"), makeKeyword("RBS"), makeKeyword("WRB"));

	private static final SubLSymbol NOMINAL_P = makeSymbol("NOMINAL-P");

	private static final SubLList $list110 = list(list(RET, list(makeSymbol("INTERSECTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")), makeSymbol("*NOMINAL-TAGS*"))));

	private static final SubLSymbol LEX_ENTRY_NOMINAL_P_METHOD = makeSymbol("LEX-ENTRY-NOMINAL-P-METHOD");

	private static final SubLSymbol VERBAL_P = makeSymbol("VERBAL-P");

	static private final SubLList $list114 = list(list(RET, list(makeSymbol("INTERSECTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")), makeSymbol("*VERBAL-TAGS*"))));

	private static final SubLSymbol LEX_ENTRY_VERBAL_P_METHOD = makeSymbol("LEX-ENTRY-VERBAL-P-METHOD");

	private static final SubLSymbol ADJECTIVAL_P = makeSymbol("ADJECTIVAL-P");

	static private final SubLList $list117 = list(list(RET, list(makeSymbol("INTERSECTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")), makeSymbol("*ADJECTIVAL-TAGS*"))));

	private static final SubLSymbol LEX_ENTRY_ADJECTIVAL_P_METHOD = makeSymbol("LEX-ENTRY-ADJECTIVAL-P-METHOD");

	private static final SubLSymbol ADVERBIAL_P = makeSymbol("ADVERBIAL-P");

	private static final SubLList $list120 = list(list(RET, list(makeSymbol("INTERSECTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")), makeSymbol("*ADVERBIAL-TAGS*"))));

	private static final SubLSymbol LEX_ENTRY_ADVERBIAL_P_METHOD = makeSymbol("LEX-ENTRY-ADVERBIAL-P-METHOD");

	private static final SubLSymbol COMPUTE_TERM = makeSymbol("COMPUTE-TERM");

	private static final SubLList $list123 = list(makeString("@return constantp; a single constant derived from this lex entry\'s\n    semantics"),
			list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NOMINAL-P"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("VERBAL-P")))), list(makeSymbol("ERROR"), makeString("Invalid lexical property :term called on ~a"), makeSymbol("SELF"))),
			list(makeSymbol("CLET"), list(list(makeSymbol("TERM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("DENOT")))),
					list(makeSymbol("PUNLESS"), makeSymbol("TERM"),
							list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS")))),
									list(makeSymbol("PWHEN"), makeSymbol("SEMTRANS"), list(makeSymbol("CLET"), list(list(makeSymbol("OPERATOR"), list(makeSymbol("FORMULA-OPERATOR"), makeSymbol("SEMTRANS")))),
											list(makeSymbol("PCOND"), list(list(makeSymbol("COR"), list(EQL, makeSymbol("OPERATOR"), reader_make_constant_shell("equals")), list(EQL, makeSymbol("OPERATOR"), reader_make_constant_shell("isa")), list(EQL, makeSymbol("OPERATOR"), reader_make_constant_shell("genls"))), list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("SEMTRANS")))),
													list(list(makeSymbol("COR"), list(makeSymbol("LOGICAL-CONNECTIVE-P"), list(makeSymbol("FORMULA-OPERATOR"), makeSymbol("SEMTRANS"))), list(makeSymbol("QUANTIFIER-P"), list(makeSymbol("FORMULA-OPERATOR"), makeSymbol("SEMTRANS")))),
															list(makeSymbol("CLET"), list(list(makeSymbol("CENTRAL-KEYWORD"), list(makeSymbol("FCOND"), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NOMINAL-P"))), $NOUN), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("VERBAL-P"))), makeKeyword("ACTION"))))),
																	list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("MAIN-COLLECTION"), makeSymbol("SEMTRANS"), makeSymbol("CENTRAL-KEYWORD"))))),
													list(T, list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("FORMULA-OPERATOR"), makeSymbol("SEMTRANS"))))))))),
					list(RET, makeSymbol("TERM"))));

	private static final SubLString $str124$Invalid_lexical_property__term_ca = makeString("Invalid lexical property :term called on ~a");

	private static final SubLSymbol LEX_ENTRY_COMPUTE_TERM_METHOD = makeSymbol("LEX-ENTRY-COMPUTE-TERM-METHOD");

	private static final SubLSymbol COMPUTE_GENDER = makeSymbol("COMPUTE-GENDER");

	static private final SubLList $list132 = list(makeString("@return listp;  a list of genders of this lex entry with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"), list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NOMINAL-P"))), list(makeSymbol("ERROR"), makeString("Invalid lexical property :gender called on ~a"), makeSymbol("SELF"))),
			list(makeSymbol("CLET"), list(makeSymbol("GENDERS"), list(makeSymbol("TERM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), $TERM))),
					list(makeSymbol("PIF"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), reader_make_constant_shell("MaleAnimal"), reader_make_constant_shell("EverythingPSC")), list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(QUOTE, list(makeKeyword("MASCULINE")))),
							list(makeSymbol("PIF"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), reader_make_constant_shell("FemaleAnimal"), reader_make_constant_shell("EverythingPSC")), list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(QUOTE, list(makeKeyword("FEMININE")))),
									list(makeSymbol("PIF"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), reader_make_constant_shell("Person"), reader_make_constant_shell("EverythingPSC")), list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(QUOTE, list(makeKeyword("MASCULINE"), makeKeyword("FEMININE")))),
											list(makeSymbol("PWHEN"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), reader_make_constant_shell("SentientAnimal"), reader_make_constant_shell("EverythingPSC")), list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(QUOTE, list(makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")))))))),
					list(makeSymbol("PUNLESS"), makeSymbol("GENDERS"), list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(QUOTE, list(makeKeyword("NEUTER"))))), list(RET, makeSymbol("GENDERS"))));

	private static final SubLString $str133$Invalid_lexical_property__gender_ = makeString("Invalid lexical property :gender called on ~a");

	static private final SubLList $list136 = list(makeKeyword("MASCULINE"));

	private static final SubLList $list138 = list(makeKeyword("FEMININE"));

	static private final SubLList $list140 = list(makeKeyword("MASCULINE"), makeKeyword("FEMININE"));

	private static final SubLList $list142 = list(makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER"));

	private static final SubLList $list143 = list(makeKeyword("NEUTER"));

	private static final SubLSymbol LEX_ENTRY_COMPUTE_GENDER_METHOD = makeSymbol("LEX-ENTRY-COMPUTE-GENDER-METHOD");

	private static final SubLSymbol COMPUTE_PENN_TAGS = makeSymbol("COMPUTE-PENN-TAGS");

	private static final SubLList $list146 = list(makeString("@return listp; the Penn part-of-speech tags of this lex-entry"),
			list(makeSymbol("CLET"), list(list(makeSymbol("POS"), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("CYC-POS"))), list(makeSymbol("INFLECTIONS"), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("INFLECTIONS"))), list(makeSymbol("STRING"), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("STRING"))), list(makeSymbol("PENN-TAGS"), NIL)),
					list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(EQL, makeSymbol("POS"), reader_make_constant_shell("Preposition")), list(EQUALP, makeSymbol("STRING"), makeString("to"))), list(makeSymbol("CPUSH"), makeKeyword("TO"), makeSymbol("PENN-TAGS"))),
							list(T, list(makeSymbol("CDOLIST"), list(makeSymbol("INFLECTION"), makeSymbol("INFLECTIONS")), list(makeSymbol("CLET"), list(list(makeSymbol("PENN-TAG"), list(makeSymbol("MAP-FROM-CYC-TO-PENN-POS"), makeSymbol("POS"), makeSymbol("INFLECTION")))), list(makeSymbol("PWHEN"), makeSymbol("PENN-TAG"), list(makeSymbol("CPUSH"), makeSymbol("PENN-TAG"), makeSymbol("PENN-TAGS"))))))),
					list(RET, list(makeSymbol("REMOVE-DUPLICATES"), makeSymbol("PENN-TAGS"), list(QUOTE, EQ)))));

	private static final SubLString $$$to = makeString("to");

	private static final SubLSymbol LEX_ENTRY_COMPUTE_PENN_TAGS_METHOD = makeSymbol("LEX-ENTRY-COMPUTE-PENN-TAGS-METHOD");

	private static final SubLSymbol COMPUTE_BACKOFF_PENN_TAGS = makeSymbol("COMPUTE-BACKOFF-PENN-TAGS");

	private static final SubLList $list153 = list(makeString("@return listp; the Penn part-of-speech tags of this lex-entry, plus additional tags\n   that are easily confused with the accurate ones"), list(makeSymbol("CLET"), list(list(makeSymbol("PENN-TAGS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")))),
			list(makeSymbol("CDOLIST"), list(makeSymbol("TAG"), makeSymbol("PENN-TAGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("BACKOFF"), list(makeSymbol("TAG-BACKOFFS"), makeSymbol("TAG"))), list(makeSymbol("PUNLESS"), list(EQ, makeSymbol("BACKOFF"), makeSymbol("TAG")), list(makeSymbol("CPUSH"), makeSymbol("BACKOFF"), makeSymbol("PENN-TAGS"))))), list(RET, makeSymbol("PENN-TAGS"))));

	private static final SubLSymbol LEX_ENTRY_COMPUTE_BACKOFF_PENN_TAGS_METHOD = makeSymbol("LEX-ENTRY-COMPUTE-BACKOFF-PENN-TAGS-METHOD");

	static private final SubLList $list155 = list(list(makeKeyword("NN"), makeKeyword("VBG")), list(makeKeyword("JJ"), makeKeyword("VBN"), makeKeyword("VBD")), list(makeKeyword("NNP"), $NNPS, makeKeyword("NN"), makeKeyword("NNS"), makeKeyword("$"), makeKeyword("CD")));

	private static final SubLSymbol COMPUTE_SUPER_TAGS = makeSymbol("COMPUTE-SUPER-TAGS");

	private static final SubLList $list157 = list(makeString("@return stringp; the super tag of this lex-entry"),
			list(makeSymbol("CLET"), list(list(makeSymbol("SUPERTAGS"), NIL)),
					list(makeSymbol("CDOLIST"), list(makeSymbol("INFL"), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("INFLECTIONS"))), list(makeSymbol("CDOLIST"),
							list(makeSymbol("SUPERTAG"), list(makeSymbol("GETHASH"), list(makeSymbol("LIST"), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("CYC-POS")), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("FRAME")), makeSymbol("INFL")), makeSymbol("*CYC-TO-SUPERTAG-MAP*"))), list(makeSymbol("CPUSHNEW"), makeSymbol("SUPERTAG"), makeSymbol("SUPERTAGS"), list(QUOTE, EQUAL)))),
					list(RET, makeSymbol("SUPERTAGS"))));

	private static final SubLSymbol LEX_ENTRY_COMPUTE_SUPER_TAGS_METHOD = makeSymbol("LEX-ENTRY-COMPUTE-SUPER-TAGS-METHOD");

	private static final SubLSymbol COMPUTE_CYC_POS = makeSymbol("COMPUTE-CYC-POS");

	static private final SubLList $list161 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-ENTRY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("TRIE-ENTRY")))),
			list(makeSymbol("PCOND"), list(makeSymbol("TRIE-ENTRY"), list(RET, list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("TRIE-ENTRY")))), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("INFLECTIONS")),
					list(makeSymbol("CDOLIST"), list(makeSymbol("PRED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("INFLECTIONS"))), list(makeSymbol("CLET"), list(list(makeSymbol("POS"), list(makeSymbol("POS-OF-PRED"), makeSymbol("PRED")))), list(makeSymbol("PWHEN"), makeSymbol("POS"), list(RET, makeSymbol("POS"))))))),
			list(RET, NIL)));

	private static final SubLSymbol LEX_ENTRY_COMPUTE_CYC_POS_METHOD = makeSymbol("LEX-ENTRY-COMPUTE-CYC-POS-METHOD");

	private static final SubLSymbol COMPUTE_IS_NER_ENTRY = makeSymbol("COMPUTE-IS-NER-ENTRY");

	private static final SubLList $list164 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-ENTRY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("TRIE-ENTRY")))), list(RET, list(makeSymbol("CNOT"), makeSymbol("TRIE-ENTRY")))));

	private static final SubLSymbol LEX_ENTRY_COMPUTE_IS_NER_ENTRY_METHOD = makeSymbol("LEX-ENTRY-COMPUTE-IS-NER-ENTRY-METHOD");

	private static final SubLSymbol COMPUTE_CYC_CATEGORY = makeSymbol("COMPUTE-CYC-CATEGORY");

	private static final SubLList $list167 = list(makeString("What is the syntactic category of this lexical entry.  Unlike cyc-pos, this does not assume that each \n   entry is a part-of-speech.  In some cases, the category may be a XP, not just an X0"), list(makeSymbol("CLET"), list(list(makeSymbol("PRED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PREDICATE")))),
			list(makeSymbol("PWHEN"), list(makeSymbol("NAME-STRING-PRED?"), makeSymbol("PRED")), list(RET, reader_make_constant_shell("NounPhrase"))), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("CYC-POS")))));

	private static final SubLSymbol LEX_ENTRY_COMPUTE_CYC_CATEGORY_METHOD = makeSymbol("LEX-ENTRY-COMPUTE-CYC-CATEGORY-METHOD");

	private static final SubLSymbol COMPUTE_INFLECTIONS = makeSymbol("COMPUTE-INFLECTIONS");

	private static final SubLList $list172 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-ENTRY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("TRIE-ENTRY")))), list(makeSymbol("PWHEN"), makeSymbol("TRIE-ENTRY"), list(RET, list(makeSymbol("NL-TRIE-ENTRY-POS-PREDS"), makeSymbol("TRIE-ENTRY")))), list(RET, NIL)));

	private static final SubLSymbol LEX_ENTRY_COMPUTE_INFLECTIONS_METHOD = makeSymbol("LEX-ENTRY-COMPUTE-INFLECTIONS-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON = makeSymbol("ABSTRACT-LEXICON");

	private static final SubLObject $list175 = _constant_175_initializer();

	private static final SubLSymbol $sym180$ALLOW_FABRICATION_ = makeSymbol("ALLOW-FABRICATION?");

	private static final SubLSymbol $sym182$IGNORE_CACHE_ = makeSymbol("IGNORE-CACHE?");

	static private final SubLList $list195 = list(new SubLObject[] { reader_make_constant_shell("WebSearchDataMt"), reader_make_constant_shell("CyclistsMt"), reader_make_constant_shell("RelationParaphraseMt"), reader_make_constant_shell("WordNetMappingMt"), reader_make_constant_shell("PornographyJargonMt"), reader_make_constant_shell("CommonEnglishMisspellingsMt"), reader_make_constant_shell("ComputereseLexicalMt"),
			reader_make_constant_shell("CyclishMt"), reader_make_constant_shell("TemporaryLexicalAssertionsMt"), reader_make_constant_shell("EnglishWordSenseAssertions-HoldingMt"), reader_make_constant_shell("TemporaryLexicalAssertions-WordNetImportMt"), reader_make_constant_shell("RedundantLexicalMt"), reader_make_constant_shell("PDATemplateTestMt"), reader_make_constant_shell("EnglishParaphraseMt"),
			reader_make_constant_shell("SupplementalDeterminerSemTransLexicalMt") });

	private static final SubLObject $const196$AllGeneralEnglishValidatedLexical = reader_make_constant_shell("AllGeneralEnglishValidatedLexicalMicrotheoryPSC");

	private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-CLASS");

	private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-INSTANCE");

	private static final SubLList $list201 = list(new SubLObject[] { makeString("@return lexicon-p; a newly created lexicon"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TRIE"), list(makeSymbol("GET-NL-TRIE"))), list(makeSymbol("CSETQ"), makeSymbol("CACHE"), list(makeSymbol("NEW-CACHE"), makeInteger(2000), list(QUOTE, EQUAL))),
			list(makeSymbol("CSETQ"), makeSymbol("CASE-SENSITIVITY"), makeKeyword("ON")), list(makeSymbol("ENSURE-CYC-TO-PENN-MAP")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INITIALIZE-EXCLUDED-PREDS"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INITIALIZE-ALLOWED-MTS"))), list(makeSymbol("CSETQ"), makeSymbol("LEARNED"), NIL), list(RET, makeSymbol("SELF")) });

	private static final SubLSymbol $sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLInteger $int$2000 = makeInteger(2000);

	private static final SubLSymbol INITIALIZE_EXCLUDED_PREDS = makeSymbol("INITIALIZE-EXCLUDED-PREDS");

	private static final SubLSymbol INITIALIZE_ALLOWED_MTS = makeSymbol("INITIALIZE-ALLOWED-MTS");

	private static final SubLSymbol ABSTRACT_LEXICON_INITIALIZE_METHOD = makeSymbol("ABSTRACT-LEXICON-INITIALIZE-METHOD");

	private static final SubLList $list209 = list(makeString("Finalizes this lexicon"), list(makeSymbol("CSETQ"), makeSymbol("CACHE"), NIL), list(makeSymbol("ISOLATE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_ISOLATE_METHOD = makeSymbol("ABSTRACT-LEXICON-ISOLATE-METHOD");

	static private final SubLList $list213 = list(list(makeSymbol("CSETQ"), makeSymbol("IGNORE-CACHE?"), T), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_IGNORE_CACHE_METHOD = makeSymbol("ABSTRACT-LEXICON-IGNORE-CACHE-METHOD");

	private static final SubLList $list216 = list(list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("IGNORE-CACHE?")))));

	private static final SubLSymbol $sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym218$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD = makeSymbol("ABSTRACT-LEXICON-IGNORE-CACHE?-METHOD");

	private static final SubLList $list219 = list(list(makeSymbol("CSETQ"), makeSymbol("ALLOW-STEMMING"), T), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_ALLOW_STEMMING_METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOW-STEMMING-METHOD");

	private static final SubLSymbol FORBID_STEMMING = makeSymbol("FORBID-STEMMING");

	private static final SubLList $list223 = list(list(makeSymbol("CSETQ"), makeSymbol("ALLOW-STEMMING"), NIL), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_FORBID_STEMMING_METHOD = makeSymbol("ABSTRACT-LEXICON-FORBID-STEMMING-METHOD");

	private static final SubLSymbol ALLOW_FABRICATION = makeSymbol("ALLOW-FABRICATION");

	private static final SubLList $list227 = list(list(makeSymbol("CSETQ"), makeSymbol("ALLOW-FABRICATION?"), T), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_ALLOW_FABRICATION_METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOW-FABRICATION-METHOD");

	private static final SubLSymbol FORBID_FABRICATION = makeSymbol("FORBID-FABRICATION");

	private static final SubLList $list231 = list(list(makeSymbol("CSETQ"), makeSymbol("ALLOW-FABRICATION?"), NIL), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_FORBID_FABRICATION_METHOD = makeSymbol("ABSTRACT-LEXICON-FORBID-FABRICATION-METHOD");

	private static final SubLSymbol $sym234$FABRICATION_FORBIDDEN_ = makeSymbol("FABRICATION-FORBIDDEN?");

	private static final SubLList $list235 = list(list(RET, list(makeSymbol("CNOT"), makeSymbol("ALLOW-FABRICATION?"))));

	private static final SubLSymbol $sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym237$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD = makeSymbol("ABSTRACT-LEXICON-FABRICATION-FORBIDDEN?-METHOD");

	private static final SubLSymbol $sym238$FABRICATION_ALLOWED_ = makeSymbol("FABRICATION-ALLOWED?");

	static private final SubLList $list239 = list(list(RET, makeSymbol("ALLOW-FABRICATION?")));

	private static final SubLSymbol $sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym241$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD = makeSymbol("ABSTRACT-LEXICON-FABRICATION-ALLOWED?-METHOD");

	private static final SubLSymbol $sym242$VALID_NL_TRIE_ENTRY_ = makeSymbol("VALID-NL-TRIE-ENTRY?");

	private static final SubLList $list243 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

	private static final SubLList $list244 = list(makeSymbol("NL-TRIE-ENTRY"));

	private static final SubLList $list245 = list(makeString("Returns t if LEX-ENTRY is a contextually valid nl-trie-entry, nil otherwise\n   Lexicons derived from abstract-lexicon will typically override this method"), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STOP-WORD-P")), list(makeSymbol("NL-TRIE-ENTRY-STRING"), makeSymbol("NL-TRIE-ENTRY"))), list(RET, NIL)),
			list(RET,
					list(makeSymbol("COR"), list(makeSymbol("CAND"), list(makeSymbol("LEX-ENTRY-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOWED-POS?")), list(makeSymbol("FIM"), makeSymbol("NL-TRIE-ENTRY"), list(QUOTE, makeSymbol("GET")), makeKeyword("CYC-POS")))),
							list(makeSymbol("CAND"), list(makeSymbol("NL-TRIE-WORD-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("MEMBER"), reader_make_constant_shell("nameSpelling"), list(makeSymbol("NL-TRIE-WORD-POS-PREDS"), makeSymbol("NL-TRIE-ENTRY")), list(QUOTE, EQL)), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?")), makeSymbol("NL-TRIE-ENTRY")),
									list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOWED-MT?")), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-MT"), makeSymbol("NL-TRIE-ENTRY")))),
							list(makeSymbol("CAND"), list(makeSymbol("VALID-DENOTS?"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?")), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-POS?")), makeSymbol("NL-TRIE-ENTRY")),
									list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOWED-MT?")), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-MT"), makeSymbol("NL-TRIE-ENTRY")))))));

	private static final SubLSymbol STOP_WORD_P = makeSymbol("STOP-WORD-P");

	private static final SubLSymbol $sym247$ALLOWED_POS_ = makeSymbol("ALLOWED-POS?");

	private static final SubLSymbol $sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_ = makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?");

	private static final SubLSymbol $sym250$ALLOWED_MT_ = makeSymbol("ALLOWED-MT?");

	private static final SubLSymbol $sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_ = makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-POS?");

	private static final SubLSymbol $sym252$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD = makeSymbol("ABSTRACT-LEXICON-VALID-NL-TRIE-ENTRY?-METHOD");

	private static final SubLList $list254 = list(makeSymbol("KEYWORD"));

	private static final SubLList $list255 = list(makeString("Used for setting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred"), list(makeSymbol("CSETQ"), makeSymbol("CASE-SENSITIVITY"), makeSymbol("KEYWORD")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_SET_CASE_SENSITIVITY_METHOD = makeSymbol("ABSTRACT-LEXICON-SET-CASE-SENSITIVITY-METHOD");

	private static final SubLSymbol GET_CASE_SENSITIVITY = makeSymbol("GET-CASE-SENSITIVITY");

	private static final SubLList $list259 = list(makeString("Used for getting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred"), list(RET, makeSymbol("CASE-SENSITIVITY")));

	private static final SubLSymbol $sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_GET_CASE_SENSITIVITY_METHOD = makeSymbol("ABSTRACT-LEXICON-GET-CASE-SENSITIVITY-METHOD");

	static private final SubLList $list262 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("PREDS-TO-EXCLUDE"), makeKeyword("DEFAULT")));

	static private final SubLList $list263 = list(makeString("exclude assertions using the predicates in PREDS-TO-EXCLUDE from use by this lexicon.\n   If PREDS-TO-EXCLUDE is :default, \n   all preds in the class variable DEFAULT-EXCLUDE-PREDS will be excluded"),
			list(makeSymbol("PIF"), list(EQ, makeSymbol("PREDS-TO-EXCLUDE"), makeKeyword("DEFAULT")), list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-PREDS"), makeSymbol("DEFAULT-EXCLUDE-PREDICATES")), list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-PREDS"), makeSymbol("PREDS-TO-EXCLUDE"))), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_INITIALIZE_EXCLUDED_PREDS_METHOD = makeSymbol("ABSTRACT-LEXICON-INITIALIZE-EXCLUDED-PREDS-METHOD");

	private static final SubLList $list268 = list(makeSymbol("POS-PRED"));

	private static final SubLList $list269 = list(makeString("allow POS-PRED to be used by this lexicon for lexical lookup"), list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-PREDS"), list(makeSymbol("REMOVE"), makeSymbol("POS-PRED"), makeSymbol("EXCLUDED-PREDS"))), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_ALLOW_PREDICATE_METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOW-PREDICATE-METHOD");

	private static final SubLList $list273 = list(makeString("do not allow POS-PRED to be used by this lexicon for lexical lookup"), list(makeSymbol("CPUSHNEW"), makeSymbol("POS-PRED"), makeSymbol("EXCLUDED-PREDS")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_EXCLUDE_PREDICATE_METHOD = makeSymbol("ABSTRACT-LEXICON-EXCLUDE-PREDICATE-METHOD");

	private static final SubLSymbol $sym276$EXCLUDED_PREDICATE_ = makeSymbol("EXCLUDED-PREDICATE?");

	private static final SubLList $list277 = list(makeString("is POS-PRED a predicate that can not be used in from this lexicon?"), list(RET, list(makeSymbol("MEMBER"), makeSymbol("POS-PRED"), makeSymbol("EXCLUDED-PREDS"))));

	private static final SubLSymbol $sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym279$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD = makeSymbol("ABSTRACT-LEXICON-EXCLUDED-PREDICATE?-METHOD");

	private static final SubLSymbol $sym280$ALLOWED_PREDICATE_ = makeSymbol("ALLOWED-PREDICATE?");

	private static final SubLList $list281 = list(makeString("is POS-PRED a predicate that can not be used in from this lexicon?"), list(RET, list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), makeSymbol("POS-PRED"), makeSymbol("EXCLUDED-PREDS")))));

	private static final SubLSymbol $sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym283$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOWED-PREDICATE?-METHOD");

	private static final SubLList $list284 = list(makeString("is POS-PRED of NL-TRIE-ENTRY a predicate that can not be used in from this lexicon?"), list(RET, list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("EXCLUDED-PREDS")), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-ENTRY")), makeSymbol("EXCLUDED-PREDS"))))));

	private static final SubLSymbol $sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym286$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD = makeSymbol("ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?-METHOD");

	private static final SubLSymbol ALLOW_POS = makeSymbol("ALLOW-POS");

	private static final SubLList $list288 = list(makeSymbol("POS"));

	private static final SubLList $list289 = list(makeString("allow POS to be used by this lexicon for lexical lookup"), list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-POS-LIST"), list(makeSymbol("REMOVE"), makeSymbol("POS"), makeSymbol("EXCLUDED-POS-LIST"))), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_ALLOW_POS_METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOW-POS-METHOD");

	private static final SubLList $list293 = list(makeString("do not allow POS to be used by this lexicon for lexical lookup"), list(makeSymbol("CPUSHNEW"), makeSymbol("POS"), makeSymbol("EXCLUDED-POS-LIST")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_EXCLUDE_POS_METHOD = makeSymbol("ABSTRACT-LEXICON-EXCLUDE-POS-METHOD");

	private static final SubLSymbol $sym296$EXCLUDED_POS_ = makeSymbol("EXCLUDED-POS?");

	static private final SubLList $list297 = list(makeString("is POS a part of speech that can not be used in from this lexicon?"), list(RET, list(makeSymbol("GENL-POS-MEMBER?"), makeSymbol("POS"), makeSymbol("EXCLUDED-POS-LIST"))));

	static private final SubLSymbol $sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym299$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD = makeSymbol("ABSTRACT-LEXICON-EXCLUDED-POS?-METHOD");

	private static final SubLList $list300 = list(makeString("is POS a part of speech that can not be used in from this lexicon?"), list(RET, list(makeSymbol("CNOT"), list(makeSymbol("GENL-POS-MEMBER?"), makeSymbol("POS"), makeSymbol("EXCLUDED-POS-LIST")))));

	private static final SubLSymbol $sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym302$ABSTRACT_LEXICON_ALLOWED_POS__METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOWED-POS?-METHOD");

	private static final SubLList $list303 = list(makeString("does NL-TRIE-ENTRY have a part of speech that can not be used in from this lexicon?"), list(RET, list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("EXCLUDED-POS-LIST")), list(makeSymbol("CNOT"), list(makeSymbol("GENL-POS-MEMBER?"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("NL-TRIE-ENTRY")), makeSymbol("EXCLUDED-POS-LIST"))))));

	private static final SubLSymbol $sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym305$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD = makeSymbol("ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-POS?-METHOD");

	private static final SubLList $list307 = list(makeSymbol("LEARNER"));

	private static final SubLList $list308 = list(makeString("add LEARNER (a method-name) as a learner to lexicon"), list(makeSymbol("CPUSHNEW"), makeSymbol("LEARNER"), makeSymbol("ACTIVE-LEARNERS")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_ADD_LEARNER_METHOD = makeSymbol("ABSTRACT-LEXICON-ADD-LEARNER-METHOD");

	private static final SubLSymbol REMOVE_LEARNER = makeSymbol("REMOVE-LEARNER");

	private static final SubLList $list312 = list(makeString("remove LEARNER (a method-name) as a learner for this lexicon"), list(makeSymbol("CSETQ"), makeSymbol("ACTIVE-LEARNERS"), list(makeSymbol("REMOVE"), makeSymbol("LEARNER"), makeSymbol("ACTIVE-LEARNERS"))), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_REMOVE_LEARNER_METHOD = makeSymbol("ABSTRACT-LEXICON-REMOVE-LEARNER-METHOD");

	private static final SubLSymbol GET_LEARNERS = makeSymbol("GET-LEARNERS");

	private static final SubLList $list316 = list(list(RET, makeSymbol("ACTIVE-LEARNERS")));

	private static final SubLSymbol $sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_GET_LEARNERS_METHOD = makeSymbol("ABSTRACT-LEXICON-GET-LEARNERS-METHOD");

	private static final SubLSymbol SET_LEARNERS = makeSymbol("SET-LEARNERS");

	static private final SubLList $list320 = list(makeSymbol("LEARNERS"));

	private static final SubLList $list321 = list(makeString("set learners for lexicon to be all and only those learners specified in LEARNERS"), list(makeSymbol("CSETQ"), makeSymbol("ACTIVE-LEARNERS"), makeSymbol("LEARNERS")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_SET_LEARNERS_METHOD = makeSymbol("ABSTRACT-LEXICON-SET-LEARNERS-METHOD");

	private static final SubLList $list324 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PROTECTED"));

	static private final SubLList $list325 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KB-SPEC"), makeKeyword("DEFAULT")));

	private static final SubLList $list326 = list(makeString("allow all mts visible from BASE-MT to be used by this lexicon.  If the value is :default, the value of the class variable DEFAULT-BASE-MT will be\n   used, and all mts in the class variable DEFAULT-EXCLUDED-MTS will be removed"), list(makeSymbol("CSETQ"), makeSymbol("ALLOWED-MTS"), list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQUAL))),
			list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-MTS"), list(makeSymbol("CONSTRUCT-SET-FROM-LIST"), makeSymbol("DEFAULT-EXCLUDE-MTS"), list(makeSymbol("FUNCTION"), EQUAL))),
			list(makeSymbol("PUNLESS"), list(EQ, makeKeyword("DEFAULT"), makeSymbol("KB-SPEC")),
					list(makeSymbol("CLET"),
							list(list(makeSymbol("BASE-MTS"), list(makeSymbol("QUERY-VARIABLE"), list(QUOTE, makeSymbol("?MT")), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("defaultBaseLexicalMt"), makeSymbol("KB-SPEC"), list(QUOTE, list(makeSymbol("?MT")))), reader_make_constant_shell("InferencePSC"), list(QUOTE, list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"))))),
									list(makeSymbol("SPEC-ALLOWED-MTS"), list(makeSymbol("QUERY-VARIABLE"), list(QUOTE, makeSymbol("?MT")), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("allowedLexicalMt"), makeSymbol("KB-SPEC"), list(QUOTE, list(makeSymbol("?MT")))), reader_make_constant_shell("InferencePSC"), list(QUOTE, list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"))))),
									list(makeSymbol("SPEC-DISALLOWED-MTS"), list(makeSymbol("QUERY-VARIABLE"), list(QUOTE, makeSymbol("?MT")), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("disallowedLexicalMt"), makeSymbol("KB-SPEC"), list(QUOTE, list(makeSymbol("?MT")))), reader_make_constant_shell("InferencePSC"), list(QUOTE, list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL")))))),
							list(makeSymbol("PCOND"), list(list(makeSymbol("SINGLETON?"), makeSymbol("BASE-MTS")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("BASE-MT")), list(makeSymbol("COPY-EXPRESSION"), list(makeSymbol("ONLY-ONE"), makeSymbol("BASE-MTS"))))),
									list(list(makeSymbol("EMPTY-LIST-P"), makeSymbol("BASE-MTS")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("BASE-MT")), list(makeSymbol("COPY-EXPRESSION"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEFAULT-BASE-MT"))))), list(makeSymbol("IGNORE"), makeSymbol("BASE-MTS"))),
									list(T, list(makeSymbol("CSETQ"), makeSymbol("BASE-MT"), list(makeSymbol("COPY-EXPRESSION"), list(makeSymbol("CANONICALIZE-HLMT"), list(makeSymbol("MAKE-EL-FORMULA"), reader_make_constant_shell("MtUnionFn"), makeSymbol("BASE-MTS"))))))),
							list(makeSymbol("CDOLIST"), list(makeSymbol("MT"), makeSymbol("SPEC-ALLOWED-MTS")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOW-MT")), makeSymbol("MT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("MT"), makeSymbol("SPEC-DISALLOWED-MTS")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FORBID-MT")), makeSymbol("MT"))))),
			list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym327$_MT = makeSymbol("?MT");

	private static final SubLList $list329 = list(makeSymbol("?MT"));

	private static final SubLList $list331 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

	private static final SubLSymbol ABSTRACT_LEXICON_INITIALIZE_ALLOWED_MTS_METHOD = makeSymbol("ABSTRACT-LEXICON-INITIALIZE-ALLOWED-MTS-METHOD");

	private static final SubLSymbol SET_BASE_MT = makeSymbol("SET-BASE-MT");

	private static final SubLList $list339 = list(makeSymbol("MT"));

	private static final SubLList $list340 = list(makeString("base-mt represents the standard mt-reasoning-based Mt for this lexicon. Using allow-mt and forbid-mt allow\n   for minor tweaks to the base-mt, but in general, this is the Mt for this lexicon\n   @note that this method will override any excluded-mts if they are visible from the newly-set base-mt"),
			list(makeSymbol("CSETQ"), makeSymbol("BASE-MT"), list(makeSymbol("COPY-EXPRESSION"), makeSymbol("MT"))),
			list(makeSymbol("DO-SET"), list(makeSymbol("EXCLUDED-MT"), makeSymbol("EXCLUDED-MTS")), list(makeSymbol("PWHEN"), list(makeSymbol("GENL-LEXICON-MT?"), makeSymbol("MT"), makeSymbol("EXCLUDED-MT")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOW-MT")), makeSymbol("EXCLUDED-MT")))), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_SET_BASE_MT_METHOD = makeSymbol("ABSTRACT-LEXICON-SET-BASE-MT-METHOD");

	private static final SubLSymbol GET_BASE_MT = makeSymbol("GET-BASE-MT");

	private static final SubLList $list344 = list(list(makeSymbol("PWHEN"), list(makeSymbol("INITIALIZED-P"), makeSymbol("BASE-MT")), list(RET, makeSymbol("BASE-MT"))), list(makeSymbol("CSETQ"), makeSymbol("BASE-MT"), makeSymbol("DEFAULT-BASE-MT")), list(RET, makeSymbol("DEFAULT-BASE-MT")));

	private static final SubLSymbol $sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_GET_BASE_MT_METHOD = makeSymbol("ABSTRACT-LEXICON-GET-BASE-MT-METHOD");

	private static final SubLList $list347 = list(makeString("@param MT possibly-hlmt-p; the mt to be allowed for retrieval of lex entries"), list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("SET-ADD"), makeSymbol("MT"), makeSymbol("ALLOWED-MTS")), list(makeSymbol("SET-REMOVE"), makeSymbol("MT"), makeSymbol("EXCLUDED-MTS")),
			list(makeSymbol("CSETQ"), makeSymbol("ROOT-MT"), makeKeyword("UNINITIALIZED")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_ALLOW_MT_METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOW-MT-METHOD");

	private static final SubLSymbol ALLOW_GENL_MTS = makeSymbol("ALLOW-GENL-MTS");

	static private final SubLList $list352 = list(
			makeString("@param MT possibly-hlmt-p; the mt and all its genlMTs to be allowed for \n     retrieval of lex entries"), list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("SET-ADD"), makeSymbol("MT"), makeSymbol("ALLOWED-MTS")), list(makeSymbol("SET-REMOVE"), makeSymbol("MT"), makeSymbol("EXCLUDED-MTS")), list(makeSymbol("CDOLIST"),
					list(makeSymbol("GENL-MT"), list(makeSymbol("QUERY-VARIABLE"), list(QUOTE, makeSymbol("?GENLMT")), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("genlMt"), makeSymbol("MT"), list(QUOTE, list(makeSymbol("?GENLMT")))))), list(makeSymbol("SET-ADD"), makeSymbol("GENL-MT"), makeSymbol("ALLOWED-MTS")), list(makeSymbol("SET-REMOVE"), makeSymbol("GENL-MT"), makeSymbol("EXCLUDED-MTS"))),
			list(makeSymbol("CSETQ"), makeSymbol("ROOT-MT"), makeKeyword("UNINITIALIZED")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym354$_GENLMT = makeSymbol("?GENLMT");

	static private final SubLList $list356 = list(makeSymbol("?GENLMT"));

	private static final SubLSymbol ABSTRACT_LEXICON_ALLOW_GENL_MTS_METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOW-GENL-MTS-METHOD");

	private static final SubLList $list358 = list(makeString("@param MT possibly-hlmt-p; the mt to be forbidden for retrieval of lex entries"), list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("SET-ADD"), makeSymbol("MT"), makeSymbol("EXCLUDED-MTS")), list(makeSymbol("SET-REMOVE"), makeSymbol("MT"), makeSymbol("ALLOWED-MTS")),
			list(makeSymbol("CSETQ"), makeSymbol("ROOT-MT"), makeKeyword("UNINITIALIZED")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol ABSTRACT_LEXICON_FORBID_MT_METHOD = makeSymbol("ABSTRACT-LEXICON-FORBID-MT-METHOD");

	static private final SubLList $list360 = list(makeString("@param MT possibly-hlmt-p; are assertions in MT allowed in this lexicon?"), list(makeSymbol("PUNLESS"), makeSymbol("MT"), list(RET, NIL)),
			list(makeSymbol("PCOND"), list(list(makeSymbol("SET-MEMBER?"), makeSymbol("MT"), makeSymbol("ALLOWED-MTS")), list(RET, T)), list(list(makeSymbol("SET-MEMBER?"), makeSymbol("MT"), makeSymbol("EXCLUDED-MTS")), list(RET, NIL)),
					list(list(makeSymbol("CNOT"), list(makeSymbol("HLMT-P"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-BASE-MT"))))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FORBID-MT")), makeSymbol("MT")), list(RET, NIL)),
					list(list(makeSymbol("GENL-LEXICON-MT?"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-BASE-MT"))), makeSymbol("MT")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOW-MT")), makeSymbol("MT")), list(RET, T)), list(T, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FORBID-MT")), makeSymbol("MT")), list(RET, NIL))));

	private static final SubLSymbol $sym361$ABSTRACT_LEXICON_ALLOWED_MT__METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOWED-MT?-METHOD");

	private static final SubLList $list362 = list(makeKeyword("PROTECTED"), makeKeyword("AUTO-UPDATE"));

	private static final SubLList $list363 = list(makeString("return the one Mt that is the composition of all the allowed/disallowed mts, an MtUnionFn of all the Mts"),
			list(makeSymbol("PUNLESS"), list(makeSymbol("INITIALIZED-P"), makeSymbol("ROOT-MT")),
					list(makeSymbol("CLET"),
							list(list(makeSymbol("THIS-ALLOWED-MTS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOWED-MTS")))), list(makeSymbol("THIS-BASE-MT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-BASE-MT")))),
									list(makeSymbol("MTS"), list(makeSymbol("FIF"), list(makeSymbol("POSSIBLY-HLMT-P"), makeSymbol("THIS-BASE-MT")), list(makeSymbol("CONS"), makeSymbol("THIS-BASE-MT"), list(makeSymbol("SET-ELEMENT-LIST"), makeSymbol("THIS-ALLOWED-MTS"))), list(makeSymbol("SET-ELEMENT-LIST"), makeSymbol("ALLOWED-MTS")))), list(makeSymbol("MIN-MTS"), list(makeSymbol("MIN-MTS"), makeSymbol("MTS")))),
							list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ROOT-MT")), list(makeSymbol("CANONICALIZE-HLMT"), list(makeSymbol("MAKE-EL-FORMULA"), reader_make_constant_shell("MtUnionFn"), makeSymbol("MIN-MTS")))))),
			list(RET, makeSymbol("ROOT-MT")));

	private static final SubLSymbol ABSTRACT_LEXICON_ROOT_MT_METHOD = makeSymbol("ABSTRACT-LEXICON-ROOT-MT-METHOD");

	private static final SubLSymbol ADD_STOP_WORD = makeSymbol("ADD-STOP-WORD");

	private static final SubLList $list366 = list(makeSymbol("STRING"));

	private static final SubLList $list367 = list(list(makeSymbol("CLET"), list(list(makeSymbol("STOP-WORD-SET"), makeSymbol("STOP-WORDS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("SET-P"), makeSymbol("STOP-WORD-SET")), list(makeSymbol("CSETQ"), makeSymbol("STOP-WORD-SET"), list(makeSymbol("NEW-SET"), list(QUOTE, EQUAL)))), list(makeSymbol("SET-ADD"), makeSymbol("STRING"), makeSymbol("STOP-WORD-SET")),
			list(makeSymbol("CSETQ"), makeSymbol("STOP-WORDS"), makeSymbol("STOP-WORD-SET")), list(RET, makeSymbol("STOP-WORDS"))));

	private static final SubLSymbol $sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_ADD_STOP_WORD_METHOD = makeSymbol("ABSTRACT-LEXICON-ADD-STOP-WORD-METHOD");

	private static final SubLList $list370 = list(list(RET, list(makeSymbol("CAND"), makeSymbol("STOP-WORDS"), list(makeSymbol("BOOLEAN"), list(makeSymbol("SET-MEMBER?"), makeSymbol("STRING"), makeSymbol("STOP-WORDS"))))));

	private static final SubLSymbol $sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_STOP_WORD_P_METHOD = makeSymbol("ABSTRACT-LEXICON-STOP-WORD-P-METHOD");

	private static final SubLSymbol GET_STOP_WORDS = makeSymbol("GET-STOP-WORDS");

	private static final SubLList $list374 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("SET-P"), makeSymbol("STOP-WORDS")), list(makeSymbol("CSETQ"), makeSymbol("STOP-WORDS"), list(makeSymbol("NEW-SET"), list(QUOTE, EQUAL)))), list(RET, makeSymbol("STOP-WORDS")));

	private static final SubLSymbol $sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_GET_STOP_WORDS_METHOD = makeSymbol("ABSTRACT-LEXICON-GET-STOP-WORDS-METHOD");

	static private final SubLList $list377 = list(makeSymbol("&OPTIONAL"), makeSymbol("TARGET"));

	private static final SubLList $list378 = list(makeString("@return ABSTRACT-LEXICON-P; a copy of this lexicon.\n@note -- list values are copied with copy-list.\n@note -- cache and trie are set to their defaults."), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("TARGET"), makeSymbol("ABSTRACT-LEXICON-P")),
			list(makeSymbol("PUNLESS"), makeSymbol("TARGET"), list(makeSymbol("CSETQ"), makeSymbol("TARGET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CLONE")))), list(makeSymbol("WARN"), makeString("Cloned instance: ~S"), makeSymbol("TARGET"))),
			list(makeSymbol("CDOLIST"), list(makeSymbol("SLOT"), list(QUOTE, list(makeSymbol("ALLOWED-MTS"), makeSymbol("EXCLUDED-MTS"), makeSymbol("EXCLUDED-PREDS"), makeSymbol("EXCLUDED-POS-LIST"), makeSymbol("IGNORE-CACHE?"), makeSymbol("CASE-SENSITIVITY"), makeSymbol("ACTIVE-LEARNERS")))),
					list(makeSymbol("CLET"), list(list(makeSymbol("VALUE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT")))),
							list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("VALUE")), list(makeSymbol("SET-SLOT"), makeSymbol("TARGET"), makeSymbol("SLOT"), list(makeSymbol("COPY-LIST"), makeSymbol("VALUE")))), list(T, list(makeSymbol("SET-SLOT"), makeSymbol("TARGET"), makeSymbol("SLOT"), makeSymbol("VALUE")))))),
			list(RET, makeSymbol("TARGET")));

	private static final SubLSymbol $sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLString $str382$Cloned_instance___S = makeString("Cloned instance: ~S");

	private static final SubLList $list383 = list(makeSymbol("ALLOWED-MTS"), makeSymbol("EXCLUDED-MTS"), makeSymbol("EXCLUDED-PREDS"), makeSymbol("EXCLUDED-POS-LIST"), makeSymbol("IGNORE-CACHE?"), makeSymbol("CASE-SENSITIVITY"), makeSymbol("ACTIVE-LEARNERS"));

	private static final SubLSymbol ABSTRACT_LEXICON_COPY_METHOD = makeSymbol("ABSTRACT-LEXICON-COPY-METHOD");

	private static final SubLList $list385 = list(makeString("@param STRING stringp;\n   @return listp; the list of  lex-entry-p associated with STRING in this lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("CYCL-STRING-P")), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STOP-WORD-P")), makeSymbol("STRING")), list(RET, NIL)),
			list(makeSymbol("PUNLESS"), makeSymbol("IGNORE-CACHE?"), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("LEX-ENTRIES"), makeSymbol("EXISTS?")), list(makeSymbol("CACHE-GET"), makeSymbol("CACHE"), makeSymbol("STRING")), list(makeSymbol("PWHEN"), makeSymbol("EXISTS?"), list(RET, makeSymbol("LEX-ENTRIES"))))),
			list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-LEX-ENTRIES")), makeSymbol("STRING"), NIL)), list(makeSymbol("NL-TRIE-ENTRIES"), list(makeSymbol("NL-TRIE-SEARCH"), makeSymbol("STRING"), makeSymbol("TRIE"), makeSymbol("CASE-SENSITIVITY")))),
					list(makeSymbol("CSETQ"), makeSymbol("LEX-ENTRIES"), list(makeSymbol("ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES"), makeSymbol("NL-TRIE-ENTRIES"), makeSymbol("STRING"), makeSymbol("SELF"), makeSymbol("LEX-ENTRIES"))),
					list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NULL"), makeSymbol("LEX-ENTRIES")), list(EQ, makeSymbol("CASE-SENSITIVITY"), makeKeyword("PREFERRED"))),
							list(makeSymbol("CLET"), list(list(makeSymbol("NL-TRIE-ENTRIES"), list(makeSymbol("NL-TRIE-SEARCH"), makeSymbol("STRING"), makeSymbol("TRIE"), makeKeyword("OFF")))), list(makeSymbol("CSETQ"), makeSymbol("LEX-ENTRIES"), list(makeSymbol("ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES"), makeSymbol("NL-TRIE-ENTRIES"), makeSymbol("STRING"), makeSymbol("SELF"), makeSymbol("LEX-ENTRIES"))))),
					list(makeSymbol("PUNLESS"), makeSymbol("IGNORE-CACHE?"), list(makeSymbol("CACHE-SET"), makeSymbol("CACHE"), makeSymbol("STRING"), makeSymbol("LEX-ENTRIES"))), list(RET, makeSymbol("LEX-ENTRIES"))));

	private static final SubLSymbol $sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

	private static final SubLSymbol ABSTRACT_LEXICON_GET_METHOD = makeSymbol("ABSTRACT-LEXICON-GET-METHOD");

	private static final SubLSymbol LEX_ENTRY_EQUAL_P = makeSymbol("LEX-ENTRY-EQUAL-P");

	private static final SubLList $list394 = list(makeString("Deletes all entries for STRING from this lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("CYCL-STRING-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-ENTRIES"), list(makeSymbol("NL-TRIE-SEARCH"), makeSymbol("STRING"), makeSymbol("TRIE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CASE-SENSITIVITY")))))),
					list(makeSymbol("CDOLIST"), list(makeSymbol("TRIE-ENTRY"), makeSymbol("TRIE-ENTRIES")),
							list(makeSymbol("PWHEN"), list(makeSymbol("LEX-ENTRY-P"), makeSymbol("TRIE-ENTRY")), list(makeSymbol("CDOLIST"), list(makeSymbol("TRIE-KEY"), list(makeSymbol("NL-TRIE-ENTRY-KEYS"), makeSymbol("TRIE-ENTRY"))), list(makeSymbol("NL-TRIE-DELETE-ENTRY"), makeSymbol("TRIE"), makeSymbol("TRIE-KEY"), makeSymbol("TRIE-ENTRY")))))),
			list(makeSymbol("CACHE-REMOVE"), makeSymbol("CACHE"), makeSymbol("STRING")), list(RET, makeSymbol("SELF")));

	private static final SubLSymbol $sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_DELETE_METHOD = makeSymbol("ABSTRACT-LEXICON-DELETE-METHOD");

	private static final SubLSymbol DELETE_ENTRY_FROM_STRING = makeSymbol("DELETE-ENTRY-FROM-STRING");

	static private final SubLList $list398 = list(makeSymbol("LEX-ENTRY"), makeSymbol("STRING"));

	static private final SubLList $list399 = list(makeString("Deletes the entry associating STRING with LEX-ENTRY from this lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRY-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-KEY"), list(makeSymbol("NL-TRIE-STRING-TOKENIZE"), makeSymbol("STRING")))), list(makeSymbol("NL-TRIE-DELETE-ENTRY"), makeSymbol("TRIE"), makeSymbol("TRIE-KEY"), makeSymbol("LEX-ENTRY"))),
			list(makeSymbol("CLET"), list(list(makeSymbol("CACHE-ENTRIES"), list(makeSymbol("REMOVE"), makeSymbol("LEX-ENTRY"), list(makeSymbol("CACHE-GET"), makeSymbol("CACHE"), makeSymbol("STRING")), list(QUOTE, EQUAL)))), list(makeSymbol("CACHE-SET"), makeSymbol("CACHE"), makeSymbol("STRING"), makeSymbol("CACHE-ENTRIES"))), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_DELETE_ENTRY_FROM_STRING_METHOD = makeSymbol("ABSTRACT-LEXICON-DELETE-ENTRY-FROM-STRING-METHOD");

	private static final SubLSymbol NL_TRIE_LEX_ENTRY_P = makeSymbol("NL-TRIE-LEX-ENTRY-P");

	private static final SubLList $list405 = list(makeSymbol("LEX-ENTRY"));

	private static final SubLList $list406 = list(makeString("Adds LEX-ENTRY to this lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRY-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("STRING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("GET")), makeKeyword("STRING"))), makeSymbol("RESULT")), list(makeSymbol("PUNLESS"), list(makeSymbol("CHAR-POSITION"), makeSymbol("*STRIE-NULL-KEY*"), makeSymbol("STRING")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEARNED")),
					list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("NL-TRIE-INSERT-ENTRY"), makeSymbol("TRIE"), list(makeSymbol("NL-TRIE-STRING-TOKENIZE"), makeSymbol("STRING")), list(makeSymbol("LEX-ENTRY2NL-TRIE-ENTRY"), makeSymbol("LEX-ENTRY")))), list(makeSymbol("CACHE-REMOVE"), makeSymbol("CACHE"), makeSymbol("STRING")), list(RET, makeSymbol("RESULT"))), list(RET, NIL)));

	private static final SubLSymbol $sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_ADD_METHOD = makeSymbol("ABSTRACT-LEXICON-ADD-METHOD");

	private static final SubLSymbol $sym409$LEARNED_ = makeSymbol("LEARNED?");

	private static final SubLList $list410 = list(makeString("Check to see if this lex entry was learned by this lexicon"), list(RET, list(makeSymbol("MEMBER?"), makeSymbol("LEX-ENTRY"), makeSymbol("LEARNED"))));

	private static final SubLSymbol $sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol $sym412$ABSTRACT_LEXICON_LEARNED__METHOD = makeSymbol("ABSTRACT-LEXICON-LEARNED?-METHOD");

	private static final SubLSymbol FORGET = makeSymbol("FORGET");

	private static final SubLList $list414 = list(makeString("Delete all entries previously learned from this lexicon"), list(makeSymbol("CLET"), list(list(makeSymbol("DELETED"), makeSymbol("LEARNED"))),
			list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), makeSymbol("LEARNED")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DELETE")), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("STRING")))), list(makeSymbol("CSETQ"), makeSymbol("LEARNED"), NIL), list(RET, makeSymbol("DELETED"))));

	private static final SubLSymbol $sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_FORGET_METHOD = makeSymbol("ABSTRACT-LEXICON-FORGET-METHOD");

	private static final SubLSymbol PREFIXES = makeSymbol("PREFIXES");

	private static final SubLList $list418 = list(makeSymbol("STRINGS"));

	private static final SubLList $list419 = list(makeString("@param STRINGS; listp\n   @return listp; a list of conses whose car is a list of strings which are\n   in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\n   with that string"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRINGS"), makeSymbol("LISTP")),
			list(RET, list(makeSymbol("VALID-PREFIXES"), list(makeSymbol("NL-TRIE-PREFIXES"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY")), makeSymbol("SELF"))));

	private static final SubLSymbol $sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_PREFIXES_METHOD = makeSymbol("ABSTRACT-LEXICON-PREFIXES-METHOD");

	private static final SubLSymbol PREFIXES_FROM_STRING = makeSymbol("PREFIXES-FROM-STRING");

	private static final SubLList $list424 = list(makeString("@param STRING stringp\n   @return listp; a list of conses whose car is a list of strings which are\n   in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\n   with that string"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")),
			list(makeSymbol("CLET"),
					list(list(makeSymbol("PREFIX-KEYS"), list(makeSymbol("NL-TRIE-PREFIX-KEYS-FROM-STRING"), makeSymbol("TRIE"), makeSymbol("STRING"), makeSymbol("CASE-SENSITIVITY"))), list(makeSymbol("NL-TRIE-ENTRY"), list(makeSymbol("SECOND"), list(makeSymbol("FIRST"), makeSymbol("PREFIX-KEYS")))), list(makeSymbol("PREFIX-STRING"), list(makeSymbol("NL-TRIE-ENTRY-STRING"), makeSymbol("NL-TRIE-ENTRY")))),
					list(RET, list(makeSymbol("LIST"), list(makeSymbol("VALID-PREFIXES"), makeSymbol("PREFIX-KEYS"), makeSymbol("SELF")), makeSymbol("PREFIX-STRING")))));

	private static final SubLSymbol $sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_PREFIXES_FROM_STRING_METHOD = makeSymbol("ABSTRACT-LEXICON-PREFIXES-FROM-STRING-METHOD");

	private static final SubLString $str428$Don_t_recognize_lexicon_case_sens = makeString("Don't recognize lexicon case sensitivity value of ~S");

	private static final SubLSymbol PREFIX_KEYS = makeSymbol("PREFIX-KEYS");

	private static final SubLList $list430 = list(makeString("@param STRINGS; listp\n   @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRINGS"), makeSymbol("LISTP")),
			list(RET, list(makeSymbol("VALID-PREFIX-KEYS"), list(makeSymbol("NL-TRIE-PREFIXES"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY")), makeSymbol("SELF"), makeSymbol("CASE-SENSITIVITY"))));

	private static final SubLSymbol $sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_PREFIX_KEYS_METHOD = makeSymbol("ABSTRACT-LEXICON-PREFIX-KEYS-METHOD");

	private static final SubLSymbol PREFIX_KEYS_FROM_STRING = makeSymbol("PREFIX-KEYS-FROM-STRING");

	private static final SubLList $list434 = list(makeString("@param STRING stringp\n   @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")),
			list(makeSymbol("CLET"),
					list(list(makeSymbol("MY-PREFIX-KEYS"), list(makeSymbol("NL-TRIE-PREFIX-KEYS-FROM-STRING"), makeSymbol("TRIE"), makeSymbol("STRING"), makeSymbol("CASE-SENSITIVITY"))), list(makeSymbol("NL-TRIE-ENTRY"), list(makeSymbol("SECOND"), list(makeSymbol("FIRST"), makeSymbol("MY-PREFIX-KEYS")))), list(makeSymbol("PREFIX-STRING"), list(makeSymbol("NL-TRIE-ENTRY-STRING"), makeSymbol("NL-TRIE-ENTRY")))),
					list(RET, list(makeSymbol("LIST"), list(makeSymbol("VALID-PREFIX-KEYS"), makeSymbol("MY-PREFIX-KEYS"), makeSymbol("SELF"), makeSymbol("CASE-SENSITIVITY")), makeSymbol("PREFIX-STRING")))));

	private static final SubLSymbol $sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_PREFIX_KEYS_FROM_STRING_METHOD = makeSymbol("ABSTRACT-LEXICON-PREFIX-KEYS-FROM-STRING-METHOD");

	private static final SubLList $list438 = list(makeSymbol("TEXT"), makeSymbol("&OPTIONAL"), list(makeSymbol("LEARNERS")));

	private static final SubLList $list439 = list(
			makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @param LEARNERS listp; a list of learning methods. Each such method\n   is expected to take a natural language string as input and return a \n   list of lex-entries\n   @return non-negative-integerp; the number of entries learned\n   @note it is the responsibility of each learner to add any entries to the lexicon"),
			list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("PUNLESS"), makeSymbol("LEARNERS"), list(makeSymbol("CSETQ"), makeSymbol("LEARNERS"), makeSymbol("ACTIVE-LEARNERS"))),
			list(makeSymbol("CLET"), list(makeSymbol("LEARNED-HERE")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEARNER"), makeSymbol("LEARNERS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), makeSymbol("LEARNER"), makeSymbol("TEXT"))), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEARNED-HERE")))), list(RET, makeSymbol("LEARNED-HERE"))));

	private static final SubLSymbol $sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_LEARN_METHOD = makeSymbol("ABSTRACT-LEXICON-LEARN-METHOD");

	private static final SubLList $list443 = list(makeSymbol("TEXT"));

	private static final SubLList $list444 = list(list(makeSymbol("IGNORE"), makeSymbol("TEXT")), list(RET, NIL));

	private static final SubLSymbol ABSTRACT_LEXICON_NUMBER_LEARN_METHOD = makeSymbol("ABSTRACT-LEXICON-NUMBER-LEARN-METHOD");

	private static final SubLString $str447$_ = makeString("-");

	private static final SubLSymbol RKF_STANDARD_STRING_WORDIFY = makeSymbol("RKF-STANDARD-STRING-WORDIFY");

	private static final SubLString $str450$_ = makeString(".");

	private static final SubLSymbol $sym452$SCALAR_FUNCTION_ = makeSymbol("SCALAR-FUNCTION?");

	private static final SubLSymbol $sym453$_SCALAR_FUNCTION__CACHING_STATE_ = makeSymbol("*SCALAR-FUNCTION?-CACHING-STATE*");

	private static final SubLSymbol NOUN_COMPOUND_LEARN = makeSymbol("NOUN-COMPOUND-LEARN");

	static private final SubLList $list456 = list(makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT\n   This is a stub just to make sure that all subclasses will be have a base\n   implementation of this method, although we don\'t wish to give it a real\n   implementation as a method of this class."),
			list(makeSymbol("IGNORE"), makeSymbol("TEXT")), list(RET, NIL));

	private static final SubLSymbol ABSTRACT_LEXICON_NOUN_COMPOUND_LEARN_METHOD = makeSymbol("ABSTRACT-LEXICON-NOUN-COMPOUND-LEARN-METHOD");

	private static final SubLSymbol COMPOUNDS_FROM_TREE = makeSymbol("COMPOUNDS-FROM-TREE");

	private static final SubLList $list461 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

	private static final SubLSymbol EXTRACT_PARSE_POS_PRED = makeSymbol("EXTRACT-PARSE-POS-PRED");

	private static final SubLList $list463 = list(reader_make_constant_shell("NLNumberFn"), reader_make_constant_shell("Plural-NLAttr"), makeKeyword("ANYTHING"));

	private static final SubLObject $$plural_Generic = reader_make_constant_shell("plural-Generic");

	private static final SubLList $list465 = list(reader_make_constant_shell("NLNumberFn"), reader_make_constant_shell("Singular-NLAttr"), makeKeyword("ANYTHING"));

	private static final SubLObject $$singular_Generic = reader_make_constant_shell("singular-Generic");

	static private final SubLList $list467 = list(reader_make_constant_shell("NLNumberFn"), reader_make_constant_shell("Mass-NLAttr"), makeKeyword("ANYTHING"));

	private static final SubLObject $$massNumber_Generic = reader_make_constant_shell("massNumber-Generic");

	private static final SubLSymbol COOCCURRENCE_STATISTICS_LEARN = makeSymbol("COOCCURRENCE-STATISTICS-LEARN");

	private static final SubLSymbol ABSTRACT_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD = makeSymbol("ABSTRACT-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD");

	private static final SubLSymbol LEXIFY_DOCUMENT = makeSymbol("LEXIFY-DOCUMENT");

	static private final SubLList $list473 = list(makeSymbol("DOC"));

	private static final SubLList $list474 = list(makeString("@param DOC document-p; \n   @return document-p; a new version of DOC with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in DOC"), list(makeSymbol("CHECK-TYPE"), makeSymbol("DOC"), makeSymbol("DOCUMENT-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("LEXIFIED"), list(makeSymbol("MAKE-DOCUMENT"))), list(makeSymbol("PARAGRAPHS"), NIL)),
					list(makeSymbol("DOCUMENT-DO-PARAGRAPHS"), list(makeSymbol("PARAGRAPH"), makeSymbol("DOC")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXIFY-PARAGRAPH")), makeSymbol("PARAGRAPH")), makeSymbol("PARAGRAPHS"))),
					list(makeSymbol("CSETF"), list(makeSymbol("DOCUMENT-PARAGRAPHS"), makeSymbol("LEXIFIED")), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("VECTOR")), list(makeSymbol("NREVERSE"), makeSymbol("PARAGRAPHS")))), list(RET, makeSymbol("LEXIFIED"))));

	private static final SubLSymbol DOCUMENT_P = makeSymbol("DOCUMENT-P");

	private static final SubLSymbol LEXIFY_PARAGRAPH = makeSymbol("LEXIFY-PARAGRAPH");

	private static final SubLSymbol ABSTRACT_LEXICON_LEXIFY_DOCUMENT_METHOD = makeSymbol("ABSTRACT-LEXICON-LEXIFY-DOCUMENT-METHOD");

	private static final SubLSymbol LEXIFY_DOCUMENT_EXHAUSTIVELY = makeSymbol("LEXIFY-DOCUMENT-EXHAUSTIVELY");

	private static final SubLList $list480 = list(makeString("@param DOC document-p; \n   @return document-p; a new version of DOC with all possible lexical matches included.  \n   The document will contain exhaustive-word-p\'s, each of which will contain zero or more \n   word-p\'s with attached nl-trie-entries"), list(makeSymbol("CHECK-TYPE"), makeSymbol("DOC"), makeSymbol("DOCUMENT-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("LEXIFIED"), list(makeSymbol("MAKE-DOCUMENT"))), list(makeSymbol("PARAGRAPHS"), NIL)),
					list(makeSymbol("DOCUMENT-DO-PARAGRAPHS"), list(makeSymbol("PARAGRAPH"), makeSymbol("DOC")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXIFY-PARAGRAPH-EXHAUSTIVELY")), makeSymbol("PARAGRAPH")), makeSymbol("PARAGRAPHS"))),
					list(makeSymbol("CSETF"), list(makeSymbol("DOCUMENT-PARAGRAPHS"), makeSymbol("LEXIFIED")), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("VECTOR")), list(makeSymbol("NREVERSE"), makeSymbol("PARAGRAPHS")))), list(RET, makeSymbol("LEXIFIED"))));

	private static final SubLSymbol LEXIFY_PARAGRAPH_EXHAUSTIVELY = makeSymbol("LEXIFY-PARAGRAPH-EXHAUSTIVELY");

	private static final SubLSymbol ABSTRACT_LEXICON_LEXIFY_DOCUMENT_EXHAUSTIVELY_METHOD = makeSymbol("ABSTRACT-LEXICON-LEXIFY-DOCUMENT-EXHAUSTIVELY-METHOD");

	private static final SubLList $list483 = list(makeSymbol("PAR"));

	private static final SubLList $list484 = list(makeString("@param PAR paragraph-p;\n   @return paraphraph-p; a new version of PAR with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in PAR"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PAR"), makeSymbol("PARAGRAPH-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("LEXIFIED"), list(makeSymbol("MAKE-PARAGRAPH"))), list(makeSymbol("SENTENCES"), NIL)),
					list(makeSymbol("PARAGRAPH-DO-SENTENCES"), list(makeSymbol("SENTENCE"), makeSymbol("PAR")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXIFY-SENTENCE")), makeSymbol("SENTENCE")), makeSymbol("SENTENCES"))),
					list(makeSymbol("CSETF"), list(makeSymbol("PARAGRAPH-SENTENCES"), makeSymbol("LEXIFIED")), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("VECTOR")), list(makeSymbol("NREVERSE"), makeSymbol("SENTENCES")))), list(RET, makeSymbol("LEXIFIED"))));

	private static final SubLSymbol PARAGRAPH_P = makeSymbol("PARAGRAPH-P");

	private static final SubLSymbol ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_METHOD = makeSymbol("ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-METHOD");

	private static final SubLList $list488 = list(makeString("@param PAR paragraph-p;\n   @return paraphraph-p; a new version of PAR with all possible lexical matches included.  \n   The document will contain exhaustive-word-p\'s, each of which will contain zero or more \n   word-p\'s with attached nl-trie-entries"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PAR"), makeSymbol("PARAGRAPH-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("LEXIFIED"), list(makeSymbol("MAKE-PARAGRAPH"))), list(makeSymbol("SENTENCES"), NIL)),
					list(makeSymbol("PARAGRAPH-DO-SENTENCES"), list(makeSymbol("SENTENCE"), makeSymbol("PAR")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXIFY-SENTENCE-EXHAUSTIVELY")), makeSymbol("SENTENCE")), makeSymbol("SENTENCES"))),
					list(makeSymbol("CSETF"), list(makeSymbol("PARAGRAPH-SENTENCES"), makeSymbol("LEXIFIED")), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("VECTOR")), list(makeSymbol("NREVERSE"), makeSymbol("SENTENCES")))), list(RET, makeSymbol("LEXIFIED"))));

	private static final SubLSymbol LEXIFY_SENTENCE_EXHAUSTIVELY = makeSymbol("LEXIFY-SENTENCE-EXHAUSTIVELY");

	private static final SubLSymbol ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_EXHAUSTIVELY_METHOD = makeSymbol("ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-EXHAUSTIVELY-METHOD");

	static private final SubLList $list491 = list(makeSymbol("SENTENCE"));

	private static final SubLList $list492 = list(makeString("@param sentence sentence-p;\n   @return sentence-p; a new version of SENTENCE with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in SENTENCE"), list(makeSymbol("CHECK-TYPE"), makeSymbol("SENTENCE"), makeSymbol("SENTENCE-P")),
			list(makeSymbol("PWHEN"), list(makeSymbol("ZEROP"), list(makeSymbol("SENTENCE-LENGTH"), makeSymbol("SENTENCE"))), list(RET,
					makeSymbol("SENTENCE"))),
			list(new SubLObject[] { makeSymbol("CLET"),
					list(list(makeSymbol("LEXIFIED"), list(makeSymbol("NEW-SENTENCE"))), list(makeSymbol("WORD-VEC"), list(makeSymbol("SENTENCE-YIELD"), makeSymbol("SENTENCE"))), list(makeSymbol("FIRST-WORD"), list(makeSymbol("WORD-STRING"), list(makeSymbol("AREF"), makeSymbol("WORD-VEC"), ZERO_INTEGER))), list(makeSymbol("RECORD-LENGTH"), ZERO_INTEGER), list(makeSymbol("LEXIFIED-TOKENS"), NIL), makeSymbol("WORDS"),
							list(makeSymbol("TOKENIZING-STREAM"), list(makeSymbol("MAKE-PRIVATE-STRING-OUTPUT-STREAM")))),
					list(makeSymbol("TAGGER-NORMALIZE-INITIAL-CAPITALIZATION"), list(makeSymbol("GET-TAGGER")), makeSymbol("WORD-VEC")), list(makeSymbol("CSETQ"), makeSymbol("WORDS"), list(makeSymbol("VECTOR-ELEMENTS"), makeSymbol("WORD-VEC"))),
					list(makeSymbol("CLET"), list(list(makeSymbol("*LEXICON-LOOKUP-MT*"), reader_make_constant_shell("InferencePSC"))),
							list(makeSymbol("CDO"), list(list(makeSymbol("INDEX"), ZERO_INTEGER, list(makeSymbol("+"), makeSymbol("INDEX"), makeSymbol("RECORD-LENGTH"))), list(makeSymbol("TOKENS"), makeSymbol("WORDS"), list(makeSymbol("NTHCDR"), makeSymbol("RECORD-LENGTH"), makeSymbol("TOKENS")))), list(list(makeSymbol("NULL"), makeSymbol("TOKENS"))),
									list(makeSymbol("CLET"), list(list(makeSymbol("NEW-TOKEN-ADDED?"), NIL)),
											list(makeSymbol("CSOME"), list(makeSymbol("STRINGS"), list(makeSymbol("NL-TRIE-STRING-TOKENIZE-MULTIPLE"), list(makeSymbol("CONSTRUCT-STRING-FROM-WORDS"), makeSymbol("TOKENS"), NIL, makeSymbol("TOKENIZING-STREAM"))), makeSymbol("NEW-TOKEN-ADDED?")),
													list(makeSymbol("CLET"), list(list(makeSymbol("PREFIXES"), list(makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY"))), list(makeSymbol("NEW-TOKEN"), NIL), list(makeSymbol("LOCAL-CASE-SENSITIVITY"), makeSymbol("CASE-SENSITIVITY")), list(makeSymbol("ITERATION-COUNT"), ZERO_INTEGER)),
															list(makeSymbol("UNTIL"), list(makeSymbol("COR"), list(makeSymbol("LEXIFIED-WORD-P"), makeSymbol("NEW-TOKEN")), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("PREFIXES"))), list(makeSymbol("CINC"), makeSymbol("ITERATION-COUNT")),
																	list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("ITERATION-COUNT"), TWENTY_INTEGER), list(makeSymbol("BREAK"), makeString("20 iterations hit inside abstract-lexicon:lexify-sentence.  We seem to be stuck.  Please report this problem through standard bug-reporting channels. '~S'"), makeSymbol("SENTENCE"))),
																	list(makeSymbol("POP-BIND"), list(makeSymbol("RECORD"), makeSymbol("PREFIXES")), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("NEW-TOKEN"), makeSymbol("RECORD-LENGTH")), list(makeSymbol("GET-LEX-ENTRIES-FOR-PREFIX"), makeSymbol("SELF"), makeSymbol("TOKENS"), makeSymbol("STRINGS"), makeSymbol("RECORD"), makeSymbol("LEXIFIED")))),
																	list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("PREFIXES")), list(makeSymbol("NULL"), list(makeSymbol("WORD-INFO"), makeSymbol("NEW-TOKEN"))), list(EQ, makeSymbol("LOCAL-CASE-SENSITIVITY"), makeKeyword("PREFERRED"))), list(makeSymbol("CSETQ"), makeSymbol("LOCAL-CASE-SENSITIVITY"), makeKeyword("OFF")),
																			list(makeSymbol("CSETQ"), makeSymbol("PREFIXES"), list(makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("LOCAL-CASE-SENSITIVITY"))))),
															list(makeSymbol("PUNLESS"), list(makeSymbol("WORD-P"), makeSymbol("NEW-TOKEN")), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("NEW-TOKEN"), makeSymbol("RECORD-LENGTH")), list(makeSymbol("GET-LEX-ENTRIES-FOR-PREFIX"), makeSymbol("SELF"), makeSymbol("TOKENS"), makeSymbol("STRINGS"), NIL, makeSymbol("LEXIFIED")))),
															list(makeSymbol("PUNLESS"), list(makeSymbol("="), makeSymbol("RECORD-LENGTH"), ZERO_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("NEW-TOKEN"), makeSymbol("LEXIFIED-TOKENS")), list(makeSymbol("CSETQ"), makeSymbol("NEW-TOKEN-ADDED?"), T))))))),
					list(makeSymbol("CSETF"), list(makeSymbol("SIGN-CONSTITUENTS"), makeSymbol("LEXIFIED")), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("VECTOR")), list(makeSymbol("NREVERSE"), makeSymbol("LEXIFIED-TOKENS")))),
					list(makeSymbol("PUNLESS"), list(EQUAL, list(makeSymbol("WORD-STRING"), list(makeSymbol("SENTENCE-GET"), makeSymbol("LEXIFIED"), ZERO_INTEGER)), makeSymbol("FIRST-WORD")),
							list(makeSymbol("WORD-UPDATE"), list(makeSymbol("SENTENCE-GET"), makeSymbol("LEXIFIED"), ZERO_INTEGER), list(makeSymbol("LIST"), makeKeyword("STRING"), list(makeSymbol("REPLACE"), list(makeSymbol("WORD-STRING"), list(makeSymbol("SENTENCE-GET"), makeSymbol("LEXIFIED"), ZERO_INTEGER)), makeSymbol("FIRST-WORD"))))),
					list(makeSymbol("CSETF"), list(makeSymbol("SIGN-STRING"), makeSymbol("LEXIFIED")), list(makeSymbol("SENTENCE-STRING"), makeSymbol("SENTENCE"))),
					list(makeSymbol("PWHEN"), list(makeSymbol("SENTENCE-MOTHER"), makeSymbol("SENTENCE")), list(makeSymbol("PARAGRAPH-SET"), list(makeSymbol("SENTENCE-MOTHER"), makeSymbol("SENTENCE")), list(makeSymbol("SENTENCE-INDEX"), makeSymbol("SENTENCE")), makeSymbol("LEXIFIED"))), list(RET, makeSymbol("LEXIFIED")) }));

	private static final SubLSymbol $sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLString $str495$20_iterations_hit_inside_abstract = makeString("20 iterations hit inside abstract-lexicon:lexify-sentence.  We seem to be stuck.  Please report this problem through standard bug-reporting channels. '~S'");

	private static final SubLSymbol ABSTRACT_LEXICON_LEXIFY_SENTENCE_METHOD = makeSymbol("ABSTRACT-LEXICON-LEXIFY-SENTENCE-METHOD");

	private static final SubLList $list497 = list(makeString("@param sentence sentence-p;\n   @return sentence-p; a new version of SENTENCE with all possible lexical matches included.  \n   The document will contain exhaustive-word-p\'s, each of which will contain zero or more \n   word-p\'s with attached nl-trie-entries"), list(makeSymbol("CHECK-TYPE"), makeSymbol("SENTENCE"), makeSymbol("SENTENCE-P")),
			list(makeSymbol("PWHEN"), list(makeSymbol("ZEROP"), list(makeSymbol("SENTENCE-LENGTH"), makeSymbol("SENTENCE"))), list(RET, makeSymbol("SENTENCE"))),
			list(new SubLObject[] { makeSymbol("CLET"), list(list(makeSymbol("LEXIFIED"), list(makeSymbol("NEW-SENTENCE"))), list(makeSymbol("WORD-VEC"), list(makeSymbol("SENTENCE-YIELD"), makeSymbol("SENTENCE"))), list(makeSymbol("FIRST-WORD"), list(makeSymbol("WORD-STRING"), list(makeSymbol("AREF"), makeSymbol("WORD-VEC"), ZERO_INTEGER))), list(makeSymbol("EXHAUSTIVE-WORDS"), NIL), makeSymbol("WORDS")),
					list(makeSymbol("TAGGER-NORMALIZE-INITIAL-CAPITALIZATION"), list(makeSymbol("GET-TAGGER")), makeSymbol("WORD-VEC")), list(makeSymbol("CSETQ"), makeSymbol("WORDS"), list(makeSymbol("VECTOR-ELEMENTS"), makeSymbol("WORD-VEC"))),
					list(makeSymbol("CLET"), list(list(makeSymbol("*LEXICON-LOOKUP-MT*"), reader_make_constant_shell("InferencePSC"))),
							list(makeSymbol("CDO"),
									list(list(makeSymbol("INDEX"), ZERO_INTEGER, list(makeSymbol("+"), makeSymbol("INDEX"), ONE_INTEGER)), list(makeSymbol("TOKENS"), makeSymbol("WORDS"), list(makeSymbol("CDR"), makeSymbol("TOKENS"))), list(makeSymbol("STRINGS"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("WORD-STRING")), makeSymbol("TOKENS")), list(makeSymbol("CDR"), makeSymbol("STRINGS")))),
									list(list(makeSymbol("NULL"), makeSymbol("TOKENS"))),
									list(makeSymbol("CLET"),
											list(list(makeSymbol("PREFIXES"), list(makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY"))), list(makeSymbol("PARENT-WORD"), list(makeSymbol("NEW-EXHAUSTIVE-WORD-FROM-WORD"), list(makeSymbol("FIRST"), makeSymbol("TOKENS")))),
													list(makeSymbol("PREFIX-WORDS"), list(makeSymbol("GET-ALL-PREFIX-WORDS"), makeSymbol("SELF"), makeSymbol("PREFIXES"), makeSymbol("TOKENS"), makeSymbol("STRINGS"), makeSymbol("LEXIFIED"), makeSymbol("PARENT-WORD")))),
											list(makeSymbol("CSETF"), list(makeSymbol("SIGN-CONSTITUENTS"), makeSymbol("PARENT-WORD")), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("VECTOR")), makeSymbol("PREFIX-WORDS"))), list(makeSymbol("CPUSH"), makeSymbol("PARENT-WORD"), makeSymbol("EXHAUSTIVE-WORDS"))))),
					list(makeSymbol("CSETF"), list(makeSymbol("SIGN-CONSTITUENTS"), makeSymbol("LEXIFIED")), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("VECTOR")), list(makeSymbol("NREVERSE"), makeSymbol("EXHAUSTIVE-WORDS")))),
					list(makeSymbol("CDOLIST"), list(makeSymbol("FIRST-WORD-OBJ"), list(makeSymbol("CONS"), list(makeSymbol("SENTENCE-GET"), makeSymbol("LEXIFIED"), ZERO_INTEGER), list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("WORD-CONSTITUENTS"), list(makeSymbol("SENTENCE-GET"), makeSymbol("LEXIFIED"), ZERO_INTEGER))))),
							list(makeSymbol("WORD-UPDATE"), makeSymbol("FIRST-WORD-OBJ"), list(makeSymbol("LIST"), makeKeyword("STRING"), list(makeSymbol("REPLACE"), list(makeSymbol("WORD-STRING"), makeSymbol("FIRST-WORD-OBJ")), makeSymbol("FIRST-WORD"))))),
					list(makeSymbol("CSETF"), list(makeSymbol("SIGN-STRING"), makeSymbol("LEXIFIED")), list(makeSymbol("SENTENCE-STRING"), makeSymbol("SENTENCE"))),
					list(makeSymbol("PWHEN"), list(makeSymbol("SENTENCE-MOTHER"), makeSymbol("SENTENCE")), list(makeSymbol("PARAGRAPH-SET"), list(makeSymbol("SENTENCE-MOTHER"), makeSymbol("SENTENCE")), list(makeSymbol("SENTENCE-INDEX"), makeSymbol("SENTENCE")), makeSymbol("LEXIFIED"))), list(RET, makeSymbol("LEXIFIED")) }));

	private static final SubLSymbol $sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol ABSTRACT_LEXICON_LEXIFY_SENTENCE_EXHAUSTIVELY_METHOD = makeSymbol("ABSTRACT-LEXICON-LEXIFY-SENTENCE-EXHAUSTIVELY-METHOD");

	private static final SubLString $str500$ = makeString("");

	private static final SubLString $str501$_ = makeString("'");

	private static final SubLString $$$word_has_no_offset = makeString("word has no offset");

	static private final SubLList $list507 = list(makeKeyword("VB"), makeKeyword("VBN"), makeKeyword("VBZ"), makeKeyword("VBD"));

	private static final SubLList $list508 = list(makeKeyword("CD"));

	private static final SubLSymbol $BACKOFF_PENN_TAGS = makeKeyword("BACKOFF-PENN-TAGS");

	private static final SubLList $list513 = list(makeKeyword("NNP"), $NNPS, makeKeyword("NN"), makeKeyword("NNS"));

	private static final SubLSymbol LEXIFY_WORDS = makeSymbol("LEXIFY-WORDS");

	static private final SubLList $list515 = list(makeSymbol("WORDS"));

	private static final SubLList $list516 = list(makeString("@param WORDS listp;\n   @return listp; a list of <string, category, lex-entries> triples for WORDS, where\n   STRING may be several of WORDS collapsed into a single entry"), list(makeSymbol("CHECK-TYPE"), makeSymbol("WORDS"), makeSymbol("LISTP")),
			list(makeSymbol("CLET"), list(list(makeSymbol("RECORD-LENGTH"), ZERO_INTEGER), list(makeSymbol("LEXIFIED-TOKENS"), NIL), makeSymbol("CATEGORY"), makeSymbol("STRING")),
					list(makeSymbol("CDO"),
							list(list(makeSymbol("INDEX"), ZERO_INTEGER, list(makeSymbol("+"), makeSymbol("INDEX"), makeSymbol("RECORD-LENGTH"))), list(makeSymbol("TOKENS"), makeSymbol("WORDS"), list(makeSymbol("NTHCDR"), makeSymbol("RECORD-LENGTH"), makeSymbol("TOKENS"))),
									list(makeSymbol("STRINGS"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("GET-PARSE-TREE-STRING")), makeSymbol("TOKENS")), list(makeSymbol("NTHCDR"), makeSymbol("RECORD-LENGTH"), makeSymbol("STRINGS"))),
									list(makeSymbol("RECORDS"), list(makeSymbol("NL-TRIE-PREFIXES"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY")), list(makeSymbol("NL-TRIE-PREFIXES"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY")))),
							list(list(makeSymbol("NULL"), makeSymbol("TOKENS"))), list(makeSymbol("CSETQ"), makeSymbol("RECORDS"), list(makeSymbol("ADD-TO-END"), list(makeSymbol("NEW-NL-TRIE-RECORD"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), makeSymbol("TOKENS")), list(QUOTE, makeSymbol("GET-STRING")))), NIL), makeSymbol("RECORDS"))),
							list(makeSymbol("CLET"), list(makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE")),
									list(makeSymbol("CSOME"), list(makeSymbol("RECORD"), makeSymbol("RECORDS"), makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE")), list(makeSymbol("CSETQ"), makeSymbol("RECORD-LENGTH"), list(makeSymbol("LENGTH"), list(makeSymbol("NL-TRIE-RECORD-KEY"), makeSymbol("RECORD")))),
											list(makeSymbol("CSETQ"), makeSymbol("STRING"), list(makeSymbol("BUILD-MULTI-WORD-LEXEME"), list(makeSymbol("FIRST-N"), makeSymbol("RECORD-LENGTH"), makeSymbol("STRINGS")))), list(makeSymbol("CSETQ"), makeSymbol("CATEGORY"), list(makeSymbol("GUESS-CATEGORY"), makeSymbol("SELF"), makeSymbol("STRING"), makeSymbol("TOKENS"))),
											list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), makeSymbol("LEX-ENTRIES0"), makeSymbol("EXISTS?")), list(makeSymbol("PUNLESS"), makeSymbol("IGNORE-CACHE?"), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("LEX-ENTRIES0"), makeSymbol("EXISTS?")), list(makeSymbol("CACHE-GET"), makeSymbol("CACHE"), makeSymbol("STRING")))),
													list(makeSymbol("PUNLESS"), makeSymbol("EXISTS?"),
															list(makeSymbol("CDOLIST"), list(makeSymbol("NL-TRIE-ENTRY"), list(makeSymbol("NL-TRIE-RECORD-ENTRIES"), makeSymbol("RECORD"))),
																	list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("VALID-NL-TRIE-ENTRY?")), makeSymbol("NL-TRIE-ENTRY")),
																			list(makeSymbol("CDOLIST"), list(makeSymbol("LEX-ENTRY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-LEX-ENTRIES")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES0"))))),
															list(makeSymbol("PUNLESS"), makeSymbol("IGNORE-CACHE?"), list(makeSymbol("CACHE-SET"), makeSymbol("CACHE"), makeSymbol("STRING"), makeSymbol("LEX-ENTRIES0")))),
													list(makeSymbol("CDOLIST"), list(makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES0")),
															list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("CATEGORY"), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS"))), list(makeSymbol("CPUSHNEW"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES"), list(QUOTE, makeSymbol("LEX-ENTRY-EQUAL-P"))))),
													list(makeSymbol("PUNLESS"), makeSymbol("LEX-ENTRIES"),
															list(makeSymbol("CDOLIST"), list(makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES0")),
																	list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("CATEGORY"), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("GET")), makeKeyword("BACKOFF-PENN-TAGS"))), list(makeSymbol("CPUSHNEW"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES"), list(QUOTE, makeSymbol("LEX-ENTRY-EQUAL-P")))))),
													list(makeSymbol("PWHEN"), list(makeSymbol("COR"), makeSymbol("LEX-ENTRIES"), list(makeSymbol("NULL"), list(makeSymbol("NL-TRIE-RECORD-ENTRIES"), makeSymbol("RECORD")))),
															list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE"), T), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("STRING"), makeSymbol("CATEGORY"), makeSymbol("LEX-ENTRIES")), makeSymbol("LEXIFIED-TOKENS")))))))),
					list(RET, list(makeSymbol("NREVERSE"), makeSymbol("LEXIFIED-TOKENS")))));

	private static final SubLSymbol $sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	private static final SubLSymbol GET_PARSE_TREE_STRING = makeSymbol("GET-PARSE-TREE-STRING");

	private static final SubLSymbol ABSTRACT_LEXICON_LEXIFY_WORDS_METHOD = makeSymbol("ABSTRACT-LEXICON-LEXIFY-WORDS-METHOD");

	private static final SubLString $$$_ = makeString(" ");

	private static final SubLSymbol TOKENIZE = makeSymbol("TOKENIZE");

	private static final SubLList $list522 = list(makeString("@param STRING stringp; an English string\n   @return listp; a list of English string tokens from STRING\n   @note Not the most efficient way since words and lexical entries are painfully constructed\n   and then discarded...this should duplicate only the tokenization part of the \'lexify method"),
			list(makeSymbol("CLET"), list(list(makeSymbol("WORDS"), list(makeSymbol("LEXIFY-SENTENCE"), makeSymbol("SELF"), list(makeSymbol("NEW-SENTENCE"), makeSymbol("STRING"), list(QUOTE, makeSymbol("FST-STRING-WORDIFY"))))), list(makeSymbol("STRINGS"), NIL)),
					list(makeSymbol("SENTENCE-DO-WORDS"), list(makeSymbol("WORD"), makeSymbol("WORDS")), list(makeSymbol("CPUSH"), list(makeSymbol("WORD-STRING"), makeSymbol("WORD")), makeSymbol("STRINGS"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("STRINGS")))));

	private static final SubLSymbol FST_STRING_WORDIFY = makeSymbol("FST-STRING-WORDIFY");

	private static final SubLSymbol ABSTRACT_LEXICON_TOKENIZE_METHOD = makeSymbol("ABSTRACT-LEXICON-TOKENIZE-METHOD");

	private static final SubLList $list525 = list(list(makeSymbol("STRING"), makeSymbol("LEX-ENTRY"), makeSymbol("LEXICON")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym526$ITERATOR = makeUninternedSymbol("ITERATOR");

	private static final SubLSymbol NEW_LEXICON_ITERATOR = makeSymbol("NEW-LEXICON-ITERATOR");

	private static final SubLSymbol ITERATION_DONE = makeSymbol("ITERATION-DONE");

	private static final SubLSymbol ITERATION_NEXT = makeSymbol("ITERATION-NEXT");

	private static final SubLList $list533 = list(list(QUOTE, makeSymbol("GET")), makeKeyword("STRING"));

	private static final SubLList $list535 = list(makeString("@return iterator-p; an iterator for this lexicon"), list(RET, list(makeSymbol("NEW-LEXICON-ITERATOR"), makeSymbol("SELF"))));

	private static final SubLSymbol ABSTRACT_LEXICON_ITERATOR_METHOD = makeSymbol("ABSTRACT-LEXICON-ITERATOR-METHOD");

	private static final SubLSymbol NEW_LEXICON_FROM_KB_SPEC = makeSymbol("NEW-LEXICON-FROM-KB-SPEC");

	static private final SubLList $list539 = list(makeSymbol("KB-SPEC"));

	private static final SubLString $str540$_param_KB_SPEC__the_CycL_type_of_ = makeString("@param KB-SPEC; the CycL type of the lexicon that you want to create.  This must be a specialization of #$AbstractLexiconSpecification\n   @return ABSTRACT-LEXICON-P; the fully-instantiated lexicon object");

	static private final SubLList $list541 = list(list(makeSymbol("KB-SPEC"), makeSymbol("FORT-P")));

	static private final SubLList $list542 = list(makeSymbol("ABSTRACT-LEXICON-P"));

	private static final SubLSymbol $sym543$_CLASS_NAME = makeSymbol("?CLASS-NAME");

	private static final SubLList $list545 = list(makeSymbol("?CLASS-NAME"));

	private static final SubLSymbol PREDS_FOR_LEXICON_EXCLUSION = makeSymbol("PREDS-FOR-LEXICON-EXCLUSION");

	private static final SubLSymbol $sym547$_PRED = makeSymbol("?PRED");

	private static final SubLList $list549 = list(makeSymbol("?PRED"));

	private static final SubLList $list550 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

	private static final SubLSymbol $preds_for_lexicon_exclusion_caching_state$ = makeSymbol("*PREDS-FOR-LEXICON-EXCLUSION-CACHING-STATE*");

	private static final SubLSymbol CLEAR_PREDS_FOR_LEXICON_EXCLUSION = makeSymbol("CLEAR-PREDS-FOR-LEXICON-EXCLUSION");

	private static final SubLSymbol ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P = makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-DONE-P");

	private static final SubLSymbol ABSTRACT_LEXICON_ITERATOR_STATE_NEXT = makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-NEXT");

	private static final SubLSymbol ABSTRACT_LEXICON_ITERATOR_STATE = makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE");

	private static final SubLSymbol ABSTRACT_LEXICON_ITERATOR_STATE_P = makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-P");

	private static final SubLList $list557 = list(makeSymbol("TRIE-ITERATOR"), makeSymbol("NEXT-ENTRIES"), makeSymbol("LEXICON"));

	static private final SubLList $list558 = list(makeKeyword("TRIE-ITERATOR"), makeKeyword("NEXT-ENTRIES"), makeKeyword("LEXICON"));

	private static final SubLList $list559 = list(makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR"), makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES"), makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON"));

	private static final SubLList $list560 = list(makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR"), makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES"), makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON"));

	private static final SubLSymbol ABSTRACT_LEXICON_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list563 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-P"));

	private static final SubLSymbol ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR = makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR");

	private static final SubLSymbol _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR = makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR");

	private static final SubLSymbol ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES = makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES");

	private static final SubLSymbol _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES = makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES");

	private static final SubLSymbol ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON = makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON");

	private static final SubLSymbol _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON = makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON");

	private static final SubLSymbol MAKE_ABSTRACT_LEXICON_ITERATOR_STATE = makeSymbol("MAKE-ABSTRACT-LEXICON-ITERATOR-STATE");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ABSTRACT_LEXICON_ITERATOR_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ABSTRACT-LEXICON-ITERATOR-STATE-METHOD");

	private static final SubLList $list575 = list(makeSymbol("KEY"), makeSymbol("TRIE-ENTRIES"));

	static private final SubLList $list576 = list(list(makeSymbol("TERM"), makeSymbol("FORMULA")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $sym577$STACK = makeUninternedSymbol("STACK");

	private static final SubLSymbol $sym578$ENTRY = makeUninternedSymbol("ENTRY");

	private static final SubLList $list579 = list(list(makeSymbol("CREATE-STACK")));

	private static final SubLSymbol STACK_EMPTY_P = makeSymbol("STACK-EMPTY-P");

	private static final SubLSymbol $sym584$FIRST_ORDER_TERM_ = makeSymbol("FIRST-ORDER-TERM?");

	private static final SubLSymbol FORMULA_TERMS = makeSymbol("FORMULA-TERMS");

	private static final SubLSymbol SCALAR_INTERVAL_MEANINGS = makeSymbol("SCALAR-INTERVAL-MEANINGS");

	private static final SubLList $list596 = list(new SubLObject[] { list(list(makeString("0.4")), list(list(makeString("0.4"), makeDouble(0.4)))), list(list(makeString("-0.4")), list(list(makeString("-0.4"), makeDouble(-0.4)))), list(list(makeString("-.4")), list(list(makeString("-.4"), makeDouble(-0.4)))),
			list(list(makeString("0.4%")), list(list(makeString("0.4%"), list(reader_make_constant_shell("Percent"), makeDouble(0.4))))), list(list(makeString("4%")), list(list(makeString("4%"), list(reader_make_constant_shell("Percent"), FOUR_INTEGER)))), list(list(makeString(".4%")), list(list(makeString(".4%"), list(reader_make_constant_shell("Percent"), makeDouble(0.4))))),
			list(list(makeString("-0.4%")), list(list(makeString("-0.4%"), list(reader_make_constant_shell("Percent"), makeDouble(-0.4))))), list(list(makeString("-.4%")), list(list(makeString("-.4%"), list(reader_make_constant_shell("Percent"), makeDouble(-0.4))))), list(list(makeString("-4%")), list(list(makeString("-4%"), list(reader_make_constant_shell("Percent"), makeInteger(-4))))) });

	private static final SubLSymbol TEXT_NUMBERS = makeSymbol("TEXT-NUMBERS");

	private static final SubLList $list598 = list(list(list(makeString("3.4   billion dogs and 2 cats")), list(makeString("3.4   billion"), makeString("2"))), list(list(makeString("3.4   billion 2")), list(makeString("3.4   billion"), makeString("2"))), list(list(makeString("3.1415926 is pi")), list(makeString("3.1415926"))), list(list(makeString("November 12 1832")), list(makeString("12"), makeString("1832"))),
			list(list(makeString("3.1415926, 2.3456789 and 1.3254 are numbers")), list(makeString("3.1415926"), makeString("2.3456789"), makeString("1.3254"))), list(list(makeString("3.1415926, -2.3456789 and 1.3254 are numbers")), list(makeString("3.1415926"), makeString("-2.3456789"), makeString("1.3254"))));

	private static final SubLList $list599 = list(makeSymbol("STRING1"), makeSymbol("NUMBER1"));

	private static final SubLList $list600 = list(makeSymbol("STRING2"), makeSymbol("NUMBER2"));

	private static final SubLSymbol $sym601$NUMBER_MEANINGS_EQUAL_ = makeSymbol("NUMBER-MEANINGS-EQUAL?");

	private static final SubLSymbol NUMBER_MEANINGS = makeSymbol("NUMBER-MEANINGS");

	private static final SubLSymbol $sym603$NUMBER_MEANINGS_RESULTS_EQUAL_ = makeSymbol("NUMBER-MEANINGS-RESULTS-EQUAL?");

	private static final SubLList $list604 = list(list(list(makeString("3.4   billion dogs and 2 cats")), list(list(makeString("2"), TWO_INTEGER), list(makeString("3.4   billion"), makeDouble(3.4E9)))), list(list(makeString("3.1415926 is pi")), list(list(makeString("3.1415926"), makeDouble(3.1415926)))),
			list(list(makeString("3.1415926, 2.3456789 and 1.3254 are numbers")), list(list(makeString("1.3254"), makeDouble(1.3254)), list(makeString("2.3456789"), makeDouble(2.3456789)), list(makeString("3.1415926"), makeDouble(3.1415926)))),
			list(list(makeString("3.1415926, -2.3456789 and 1.3254 are numbers")), list(list(makeString("1.3254"), makeDouble(1.3254)), list(makeString("-2.3456789"), makeDouble(-2.3456789)), list(makeString("3.1415926"), makeDouble(3.1415926)))));

	private static final SubLSymbol TOKENIZING_TEST_COVERING = makeSymbol("TOKENIZING-TEST-COVERING");

	private static final SubLList $list606 = list(list(list(makeString("glyceraldehdyde 3-phosphate (G3P) sleep"), list(reader_make_constant_shell("Glyceraldehyde3Phosphate"))), NIL), list(list(makeString("glyceraldehdyde 3-phosphate (G3P)"), list(reader_make_constant_shell("Glyceraldehyde3Phosphate"))), T));

	public static final SubLObject get_cyc_to_penn_map_alt() {
		ensure_cyc_to_penn_map();
		return $cyc_to_penn_map$.getGlobalValue();
	}

	public static SubLObject get_cyc_to_penn_map() {
		ensure_cyc_to_penn_map();
		return $cyc_to_penn_map$.getGlobalValue();
	}

	public static final SubLObject ensure_cyc_to_penn_map_alt() {
		if (NIL == $cyc_to_penn_map$.getGlobalValue()) {
			$cyc_to_penn_map$.setGlobalValue(build_cyc_to_penn_map());
		}
		return $cyc_to_penn_map$.getGlobalValue();
	}

	public static SubLObject ensure_cyc_to_penn_map() {
		if (NIL == $cyc_to_penn_map$.getGlobalValue()) {
			$cyc_to_penn_map$.setGlobalValue(build_cyc_to_penn_map());
		}
		return $cyc_to_penn_map$.getGlobalValue();
	}

	public static final SubLObject reinitialize_cyc_to_penn_map_alt() {
		$cyc_to_penn_map$.setGlobalValue(NIL);
		$cyc_to_penn_list$.setGlobalValue(NIL);
		return get_cyc_to_penn_map();
	}

	public static SubLObject reinitialize_cyc_to_penn_map() {
		$cyc_to_penn_map$.setGlobalValue(NIL);
		$cyc_to_penn_list$.setGlobalValue(NIL);
		return get_cyc_to_penn_map();
	}

	public static final SubLObject get_cyc_to_penn_list_alt() {
		ensure_cyc_to_penn_list();
		return $cyc_to_penn_list$.getGlobalValue();
	}

	public static SubLObject get_cyc_to_penn_list() {
		ensure_cyc_to_penn_list();
		return $cyc_to_penn_list$.getGlobalValue();
	}

	public static final SubLObject ensure_cyc_to_penn_list_alt() {
		if (NIL == $cyc_to_penn_list$.getGlobalValue()) {
			$cyc_to_penn_list$.setGlobalValue(nreverse(list_utilities.partial_order_sort($list_alt0, $sym1$GENL_IN_ANY_MT_, SECOND)));
		}
		return $cyc_to_penn_list$.getGlobalValue();
	}

	public static SubLObject ensure_cyc_to_penn_list() {
		if (NIL == $cyc_to_penn_list$.getGlobalValue()) {
			$cyc_to_penn_list$.setGlobalValue(nreverse(list_utilities.partial_order_sort($list0, $sym1$GENL_IN_ANY_MT_, SECOND)));
		}
		return $cyc_to_penn_list$.getGlobalValue();
	}

	public static final SubLObject rebuild_cyc_to_penn_map_alt() {
		$cyc_to_penn_list$.setGlobalValue(NIL);
		$cyc_to_penn_map$.setGlobalValue(build_cyc_to_penn_map());
		return $cyc_to_penn_map$.getGlobalValue();
	}

	public static SubLObject rebuild_cyc_to_penn_map() {
		$cyc_to_penn_list$.setGlobalValue(NIL);
		$cyc_to_penn_map$.setGlobalValue(build_cyc_to_penn_map());
		return $cyc_to_penn_map$.getGlobalValue();
	}

	/**
	 *
	 *
	 * @return hashtable-p; a hashtable mapping pairs of lexical Cyc constants to
	Penn part-of-speech tags
	 */
	@LispMethod(comment = "@return hashtable-p; a hashtable mapping pairs of lexical Cyc constants to\r\nPenn part-of-speech tags")
	public static final SubLObject build_cyc_to_penn_map_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject cyc_to_penn = make_hash_table($int$500, symbol_function(EQUAL), UNPROVIDED);
				SubLObject super_pos = NIL;
				SubLObject super_pred = NIL;
				{
					SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						{
							SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
							{
								SubLObject _prev_bind_0_1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
								SubLObject _prev_bind_1_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
								SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
								try {
									sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
									sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
									sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
									{
										SubLObject cdolist_list_var = get_cyc_to_penn_list();
										SubLObject mapentry = NIL;
										for (mapentry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), mapentry = cdolist_list_var.first()) {
											super_pos = second(mapentry);
											super_pred = (NIL != third(mapentry)) ? ((SubLObject) (third(mapentry))) : $$partOfSpeech;
											{
												SubLObject cdolist_list_var_3 = genls.all_specs(super_pos, $$GeneralLexiconMt, UNPROVIDED);
												SubLObject sub_pos = NIL;
												for (sub_pos = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest(), sub_pos = cdolist_list_var_3.first()) {
													{
														SubLObject cdolist_list_var_4 = genl_predicates.all_spec_predicates(super_pred, UNPROVIDED, UNPROVIDED);
														SubLObject sub_pred = NIL;
														for (sub_pred = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest(), sub_pred = cdolist_list_var_4.first()) {
															sethash(cons(sub_pos, sub_pred), cyc_to_penn, mapentry.first());
														}
													}
												}
											}
										}
									}
								} finally {
									sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
									sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_2, thread);
									sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_1, thread);
								}
							}
						}
					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
					}
				}
				return cyc_to_penn;
			}
		}
	}

	/**
	 *
	 *
	 * @return hashtable-p; a hashtable mapping pairs of lexical Cyc constants to
	Penn part-of-speech tags
	 */
	@LispMethod(comment = "@return hashtable-p; a hashtable mapping pairs of lexical Cyc constants to\r\nPenn part-of-speech tags")
	public static SubLObject build_cyc_to_penn_map() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject cyc_to_penn = make_hash_table($int$500, symbol_function(EQUAL), UNPROVIDED);
		SubLObject super_pos = NIL;
		SubLObject super_pred = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
			final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
			final SubLObject _prev_bind_1_$2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
			final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
			try {
				sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
				sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
				sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
				SubLObject cdolist_list_var = get_cyc_to_penn_list();
				SubLObject mapentry = NIL;
				mapentry = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					super_pos = second(mapentry);
					super_pred = (NIL != third(mapentry)) ? third(mapentry) : $$partOfSpeech;
					SubLObject cdolist_list_var_$3 = genls.all_specs(super_pos, $$GeneralLexiconMt, UNPROVIDED);
					SubLObject sub_pos = NIL;
					sub_pos = cdolist_list_var_$3.first();
					while (NIL != cdolist_list_var_$3) {
						SubLObject cdolist_list_var_$4 = genl_predicates.all_spec_predicates(super_pred, UNPROVIDED, UNPROVIDED);
						SubLObject sub_pred = NIL;
						sub_pred = cdolist_list_var_$4.first();
						while (NIL != cdolist_list_var_$4) {
							sethash(cons(sub_pos, sub_pred), cyc_to_penn, mapentry.first());
							cdolist_list_var_$4 = cdolist_list_var_$4.rest();
							sub_pred = cdolist_list_var_$4.first();
						}
						cdolist_list_var_$3 = cdolist_list_var_$3.rest();
						sub_pos = cdolist_list_var_$3.first();
					}
					cdolist_list_var = cdolist_list_var.rest();
					mapentry = cdolist_list_var.first();
				}
			} finally {
				sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
				sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$2, thread);
				sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$1, thread);
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return cyc_to_penn;
	}

	/**
	 *
	 *
	 * @return hashtable-p; a hashtable mapping <part-of-speech . frame> pairs to supertags
	 */
	@LispMethod(comment = "@return hashtable-p; a hashtable mapping <part-of-speech . frame> pairs to supertags")
	public static final SubLObject build_cyc_to_supertag_map_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject cyc_to_supertag = make_hash_table($int$500, symbol_function(EQUAL), UNPROVIDED);
				SubLObject cyc = NIL;
				SubLObject supertag = NIL;
				SubLObject super_pos = NIL;
				SubLObject super_frame = NIL;
				SubLObject super_pred = NIL;
				SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
				{
					SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
					SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
					SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
					try {
						sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
						sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
						sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
						{
							SubLObject cdolist_list_var = $cyc_to_supertag_list$.getDynamicValue(thread);
							SubLObject mapentry = NIL;
							for (mapentry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), mapentry = cdolist_list_var.first()) {
								supertag = mapentry.first();
								cyc = mapentry.rest();
								super_pos = cyc.first();
								super_frame = second(cyc);
								super_pred = third(cyc);
								{
									SubLObject cdolist_list_var_5 = genls.all_specs(super_pos, $$GeneralEnglishMt, UNPROVIDED);
									SubLObject sub_pos = NIL;
									for (sub_pos = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest(), sub_pos = cdolist_list_var_5.first()) {
										{
											SubLObject cdolist_list_var_6 = cons(super_frame, isa.all_fort_instances(super_frame, $$GeneralEnglishMt, UNPROVIDED));
											SubLObject sub_frame = NIL;
											for (sub_frame = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest(), sub_frame = cdolist_list_var_6.first()) {
												{
													SubLObject cdolist_list_var_7 = (NIL != super_pred) ? ((SubLObject) (genl_predicates.all_spec_preds(super_pred, $$GeneralEnglishMt, UNPROVIDED))) : list(NIL);
													SubLObject sub_pred = NIL;
													for (sub_pred = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest(), sub_pred = cdolist_list_var_7.first()) {
														sethash(list(sub_pos, sub_frame, sub_pred), cyc_to_supertag, supertag);
													}
												}
											}
										}
									}
								}
							}
						}
					} finally {
						sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
						sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
						sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
					}
				}
				return cyc_to_supertag;
			}
		}
	}

	/**
	 *
	 *
	 * @return hashtable-p; a hashtable mapping <part-of-speech . frame> pairs to supertags
	 */
	@LispMethod(comment = "@return hashtable-p; a hashtable mapping <part-of-speech . frame> pairs to supertags")
	public static SubLObject build_cyc_to_supertag_map() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject cyc_to_supertag = make_hash_table($int$500, symbol_function(EQUAL), UNPROVIDED);
		SubLObject cyc = NIL;
		SubLObject supertag = NIL;
		SubLObject super_pos = NIL;
		SubLObject super_frame = NIL;
		SubLObject super_pred = NIL;
		final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
		final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
		final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
		final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
		try {
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
			SubLObject cdolist_list_var = $cyc_to_supertag_list$.getDynamicValue(thread);
			SubLObject mapentry = NIL;
			mapentry = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				supertag = mapentry.first();
				cyc = mapentry.rest();
				super_pos = cyc.first();
				super_frame = second(cyc);
				super_pred = third(cyc);
				SubLObject cdolist_list_var_$5 = genls.all_specs(super_pos, $$GeneralEnglishMt, UNPROVIDED);
				SubLObject sub_pos = NIL;
				sub_pos = cdolist_list_var_$5.first();
				while (NIL != cdolist_list_var_$5) {
					SubLObject cdolist_list_var_$6 = cons(super_frame, isa.all_fort_instances(super_frame, $$GeneralEnglishMt, UNPROVIDED));
					SubLObject sub_frame = NIL;
					sub_frame = cdolist_list_var_$6.first();
					while (NIL != cdolist_list_var_$6) {
						SubLObject cdolist_list_var_$7 = (NIL != super_pred) ? genl_predicates.all_spec_preds(super_pred, $$GeneralEnglishMt, UNPROVIDED) : list(NIL);
						SubLObject sub_pred = NIL;
						sub_pred = cdolist_list_var_$7.first();
						while (NIL != cdolist_list_var_$7) {
							sethash(list(sub_pos, sub_frame, sub_pred), cyc_to_supertag, supertag);
							cdolist_list_var_$7 = cdolist_list_var_$7.rest();
							sub_pred = cdolist_list_var_$7.first();
						}
						cdolist_list_var_$6 = cdolist_list_var_$6.rest();
						sub_frame = cdolist_list_var_$6.first();
					}
					cdolist_list_var_$5 = cdolist_list_var_$5.rest();
					sub_pos = cdolist_list_var_$5.first();
				}
				cdolist_list_var = cdolist_list_var.rest();
				mapentry = cdolist_list_var.first();
			}
		} finally {
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
		}
		return cyc_to_supertag;
	}

	public static final SubLObject textract_lemma_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
		textract_lemma_print(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject textract_lemma_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		textract_lemma_print(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static final SubLObject textract_lemma_p_alt(SubLObject v_object) {
		return v_object.getClass() == com.cyc.cycjava.cycl.abstract_lexicon.$textract_lemma_native.class ? ((SubLObject) (T)) : NIL;
	}

	public static SubLObject textract_lemma_p(final SubLObject v_object) {
		return v_object.getClass() == com.cyc.cycjava.cycl.abstract_lexicon.$textract_lemma_native.class ? T : NIL;
	}

	public static final SubLObject textract_lemma_paragraph_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.getField2();
	}

	public static SubLObject textract_lemma_paragraph(final SubLObject v_object) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.getField2();
	}

	public static final SubLObject textract_lemma_sentence_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.getField3();
	}

	public static SubLObject textract_lemma_sentence(final SubLObject v_object) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.getField3();
	}

	public static final SubLObject textract_lemma_word_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.getField4();
	}

	public static SubLObject textract_lemma_word(final SubLObject v_object) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.getField4();
	}

	public static final SubLObject textract_lemma_string_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.getField5();
	}

	public static SubLObject textract_lemma_string(final SubLObject v_object) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.getField5();
	}

	public static final SubLObject textract_lemma_canon_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.getField6();
	}

	public static SubLObject textract_lemma_canon(final SubLObject v_object) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.getField6();
	}

	public static final SubLObject textract_lemma_type_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.getField7();
	}

	public static SubLObject textract_lemma_type(final SubLObject v_object) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.getField7();
	}

	public static final SubLObject _csetf_textract_lemma_paragraph_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_textract_lemma_paragraph(final SubLObject v_object, final SubLObject value) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static final SubLObject _csetf_textract_lemma_sentence_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.setField3(value);
	}

	public static SubLObject _csetf_textract_lemma_sentence(final SubLObject v_object, final SubLObject value) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static final SubLObject _csetf_textract_lemma_word_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.setField4(value);
	}

	public static SubLObject _csetf_textract_lemma_word(final SubLObject v_object, final SubLObject value) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.setField4(value);
	}

	public static final SubLObject _csetf_textract_lemma_string_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.setField5(value);
	}

	public static SubLObject _csetf_textract_lemma_string(final SubLObject v_object, final SubLObject value) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.setField5(value);
	}

	public static final SubLObject _csetf_textract_lemma_canon_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.setField6(value);
	}

	public static SubLObject _csetf_textract_lemma_canon(final SubLObject v_object, final SubLObject value) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.setField6(value);
	}

	public static final SubLObject _csetf_textract_lemma_type_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, TEXTRACT_LEMMA_P);
		return v_object.setField7(value);
	}

	public static SubLObject _csetf_textract_lemma_type(final SubLObject v_object, final SubLObject value) {
		assert NIL != textract_lemma_p(v_object) : "! abstract_lexicon.textract_lemma_p(v_object) " + "abstract_lexicon.textract_lemma_p error :" + v_object;
		return v_object.setField7(value);
	}

	public static final SubLObject make_textract_lemma_alt(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		{
			SubLObject v_new = new com.cyc.cycjava.cycl.abstract_lexicon.$textract_lemma_native();
			SubLObject next = NIL;
			for (next = arglist; NIL != next; next = cddr(next)) {
				{
					SubLObject current_arg = next.first();
					SubLObject current_value = cadr(next);
					SubLObject pcase_var = current_arg;
					if (pcase_var.eql($PARAGRAPH)) {
						_csetf_textract_lemma_paragraph(v_new, current_value);
					} else {
						if (pcase_var.eql($SENTENCE)) {
							_csetf_textract_lemma_sentence(v_new, current_value);
						} else {
							if (pcase_var.eql($WORD)) {
								_csetf_textract_lemma_word(v_new, current_value);
							} else {
								if (pcase_var.eql($STRING)) {
									_csetf_textract_lemma_string(v_new, current_value);
								} else {
									if (pcase_var.eql($CANON)) {
										_csetf_textract_lemma_canon(v_new, current_value);
									} else {
										if (pcase_var.eql($TYPE)) {
											_csetf_textract_lemma_type(v_new, current_value);
										} else {
											Errors.error($str_alt36$Invalid_slot__S_for_construction_, current_arg);
										}
									}
								}
							}
						}
					}
				}
			}
			return v_new;
		}
	}

	public static SubLObject make_textract_lemma(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new com.cyc.cycjava.cycl.abstract_lexicon.$textract_lemma_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($PARAGRAPH)) {
				_csetf_textract_lemma_paragraph(v_new, current_value);
			} else if (pcase_var.eql($SENTENCE)) {
				_csetf_textract_lemma_sentence(v_new, current_value);
			} else if (pcase_var.eql($WORD)) {
				_csetf_textract_lemma_word(v_new, current_value);
			} else if (pcase_var.eql($STRING)) {
				_csetf_textract_lemma_string(v_new, current_value);
			} else if (pcase_var.eql($CANON)) {
				_csetf_textract_lemma_canon(v_new, current_value);
			} else if (pcase_var.eql($TYPE)) {
				_csetf_textract_lemma_type(v_new, current_value);
			} else {
				Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_textract_lemma(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_TEXTRACT_LEMMA, SIX_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $PARAGRAPH, textract_lemma_paragraph(obj));
		funcall(visitor_fn, obj, $SLOT, $SENTENCE, textract_lemma_sentence(obj));
		funcall(visitor_fn, obj, $SLOT, $WORD, textract_lemma_word(obj));
		funcall(visitor_fn, obj, $SLOT, $STRING, textract_lemma_string(obj));
		funcall(visitor_fn, obj, $SLOT, $CANON, textract_lemma_canon(obj));
		funcall(visitor_fn, obj, $SLOT, $TYPE, textract_lemma_type(obj));
		funcall(visitor_fn, obj, $END, MAKE_TEXTRACT_LEMMA, SIX_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_textract_lemma_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_textract_lemma(obj, visitor_fn);
	}

	/**
	 * Returns a new textract lemma whose fields are those in LINE, nil if LINE couldn't be parsed
	 */
	@LispMethod(comment = "Returns a new textract lemma whose fields are those in LINE, nil if LINE couldn\'t be parsed")
	public static final SubLObject new_textract_lemma_alt(SubLObject line) {
		SubLTrampolineFile.checkType(line, STRINGP);
		{
			SubLObject lemma = make_textract_lemma(UNPROVIDED);
			SubLObject coordsXstring = string_utilities.split_string(string_utilities.trim_whitespace(string_utilities.string_upto(line, CHAR_lparen)), UNPROVIDED);
			SubLObject error = NIL;
			try {
				{
					SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
					try {
						bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
						try {
							_csetf_textract_lemma_paragraph(lemma, parse_integer(coordsXstring.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
							_csetf_textract_lemma_sentence(lemma, parse_integer(second(coordsXstring), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
							_csetf_textract_lemma_word(lemma, parse_integer(third(coordsXstring), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
							_csetf_textract_lemma_string(lemma, string_utilities.bunge(nthcdr(THREE_INTEGER, coordsXstring), UNPROVIDED));
							_csetf_textract_lemma_canon(lemma, string_utilities.trim_whitespace(string_utilities.string_between(line, $list_alt39, UNPROVIDED)));
							_csetf_textract_lemma_type(lemma, make_keyword(string_utilities.string_between(line, $list_alt40, UNPROVIDED)));
						} catch (Throwable catch_var) {
							Errors.handleThrowable(catch_var, NIL);
						}
					} finally {
						rebind(Errors.$error_handler$, _prev_bind_0);
					}
				}
			} catch (Throwable ccatch_env_var) {
				error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
			}
			if (NIL != error) {
				lemma = NIL;
			}
			return lemma;
		}
	}

	/**
	 * Returns a new textract lemma whose fields are those in LINE, nil if LINE couldn't be parsed
	 */
	@LispMethod(comment = "Returns a new textract lemma whose fields are those in LINE, nil if LINE couldn\'t be parsed")
	public static SubLObject new_textract_lemma(final SubLObject line) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(line) : "! stringp(line) " + ("Types.stringp(line) " + "CommonSymbols.NIL != Types.stringp(line) ") + line;
		SubLObject lemma = make_textract_lemma(UNPROVIDED);
		final SubLObject coordsXstring = string_utilities.split_string(string_utilities.trim_whitespace(string_utilities.string_upto(line, CHAR_lparen)), UNPROVIDED);
		SubLObject error = NIL;
		try {
			thread.throwStack.push($catch_error_message_target$.getGlobalValue());
			final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
				try {
					_csetf_textract_lemma_paragraph(lemma, parse_integer(coordsXstring.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
					_csetf_textract_lemma_sentence(lemma, parse_integer(second(coordsXstring), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
					_csetf_textract_lemma_word(lemma, parse_integer(third(coordsXstring), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
					_csetf_textract_lemma_string(lemma, string_utilities.bunge(nthcdr(THREE_INTEGER, coordsXstring), UNPROVIDED));
					_csetf_textract_lemma_canon(lemma, string_utilities.trim_whitespace(string_utilities.string_between(line, $list45, UNPROVIDED)));
					_csetf_textract_lemma_type(lemma, make_keyword(string_utilities.string_between(line, $list46, UNPROVIDED)));
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
		if (NIL != error) {
			lemma = NIL;
		}
		return lemma;
	}

	public static final SubLObject textract_lemma_print_alt(SubLObject lemma, SubLObject stream, SubLObject depth) {
		write_string($str_alt41$__TEXTRACT_LEMMA_, stream, UNPROVIDED, UNPROVIDED);
		princ(textract_lemma_paragraph(lemma), stream);
		write_string($str_alt42$_, stream, UNPROVIDED, UNPROVIDED);
		princ(textract_lemma_sentence(lemma), stream);
		write_string($str_alt42$_, stream, UNPROVIDED, UNPROVIDED);
		princ(textract_lemma_word(lemma), stream);
		write_string($str_alt42$_, stream, UNPROVIDED, UNPROVIDED);
		write_string(textract_lemma_string(lemma), stream, UNPROVIDED, UNPROVIDED);
		write_string($str_alt42$_, stream, UNPROVIDED, UNPROVIDED);
		write_string(textract_lemma_canon(lemma), stream, UNPROVIDED, UNPROVIDED);
		write_string($str_alt42$_, stream, UNPROVIDED, UNPROVIDED);
		princ(textract_lemma_type(lemma), stream);
		write_string($str_alt43$_, stream, UNPROVIDED, UNPROVIDED);
		return lemma;
	}

	public static SubLObject textract_lemma_print(final SubLObject lemma, final SubLObject stream, final SubLObject depth) {
		write_string($str47$__TEXTRACT_LEMMA_, stream, UNPROVIDED, UNPROVIDED);
		princ(textract_lemma_paragraph(lemma), stream);
		write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
		princ(textract_lemma_sentence(lemma), stream);
		write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
		princ(textract_lemma_word(lemma), stream);
		write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
		write_string(textract_lemma_string(lemma), stream, UNPROVIDED, UNPROVIDED);
		write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
		write_string(textract_lemma_canon(lemma), stream, UNPROVIDED, UNPROVIDED);
		write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
		princ(textract_lemma_type(lemma), stream);
		write_string($str49$_, stream, UNPROVIDED, UNPROVIDED);
		return lemma;
	}

	public static final SubLObject get_lex_entry_properties_alt(SubLObject lex_entry) {
		return classes.subloop_get_access_protected_instance_slot(lex_entry, ONE_INTEGER, PROPERTIES);
	}

	public static SubLObject get_lex_entry_properties(final SubLObject lex_entry) {
		return classes.subloop_get_access_protected_instance_slot(lex_entry, ONE_INTEGER, PROPERTIES);
	}

	public static final SubLObject set_lex_entry_properties_alt(SubLObject lex_entry, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(lex_entry, value, ONE_INTEGER, PROPERTIES);
	}

	public static SubLObject set_lex_entry_properties(final SubLObject lex_entry, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(lex_entry, value, ONE_INTEGER, PROPERTIES);
	}

	public static final SubLObject get_lex_entry_supported_properties_alt(SubLObject lex_entry) {
		{
			SubLObject v_class = (lex_entry.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(lex_entry))) : NIL != subloop_structures.class_p(lex_entry) ? ((SubLObject) (lex_entry)) : NIL != subloop_structures.instance_p(lex_entry) ? ((SubLObject) (subloop_structures.instance_class(lex_entry))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(SUPPORTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
			}
			return NIL;
		}
	}

	public static SubLObject get_lex_entry_supported_properties(final SubLObject lex_entry) {
		final SubLObject v_class = (lex_entry.isSymbol()) ? classes.classes_retrieve_class(lex_entry) : NIL != subloop_structures.class_p(lex_entry) ? lex_entry : NIL != subloop_structures.instance_p(lex_entry) ? subloop_structures.instance_class(lex_entry) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(SUPPORTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
		}
		return NIL;
	}

	public static final SubLObject set_lex_entry_supported_properties_alt(SubLObject lex_entry, SubLObject value) {
		{
			SubLObject v_class = (lex_entry.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(lex_entry))) : NIL != subloop_structures.class_p(lex_entry) ? ((SubLObject) (lex_entry)) : NIL != subloop_structures.instance_p(lex_entry) ? ((SubLObject) (subloop_structures.instance_class(lex_entry))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(SUPPORTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
			}
			return NIL;
		}
	}

	public static SubLObject set_lex_entry_supported_properties(final SubLObject lex_entry, final SubLObject value) {
		final SubLObject v_class = (lex_entry.isSymbol()) ? classes.classes_retrieve_class(lex_entry) : NIL != subloop_structures.class_p(lex_entry) ? lex_entry : NIL != subloop_structures.instance_p(lex_entry) ? subloop_structures.instance_class(lex_entry) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(SUPPORTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
		}
		return NIL;
	}

	public static final SubLObject get_lex_entry_computed_properties_alt(SubLObject lex_entry) {
		{
			SubLObject v_class = (lex_entry.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(lex_entry))) : NIL != subloop_structures.class_p(lex_entry) ? ((SubLObject) (lex_entry)) : NIL != subloop_structures.instance_p(lex_entry) ? ((SubLObject) (subloop_structures.instance_class(lex_entry))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(COMPUTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
			}
			return NIL;
		}
	}

	public static SubLObject get_lex_entry_computed_properties(final SubLObject lex_entry) {
		final SubLObject v_class = (lex_entry.isSymbol()) ? classes.classes_retrieve_class(lex_entry) : NIL != subloop_structures.class_p(lex_entry) ? lex_entry : NIL != subloop_structures.instance_p(lex_entry) ? subloop_structures.instance_class(lex_entry) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(COMPUTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
		}
		return NIL;
	}

	public static final SubLObject set_lex_entry_computed_properties_alt(SubLObject lex_entry, SubLObject value) {
		{
			SubLObject v_class = (lex_entry.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(lex_entry))) : NIL != subloop_structures.class_p(lex_entry) ? ((SubLObject) (lex_entry)) : NIL != subloop_structures.instance_p(lex_entry) ? ((SubLObject) (subloop_structures.instance_class(lex_entry))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(COMPUTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
			}
			return NIL;
		}
	}

	public static SubLObject set_lex_entry_computed_properties(final SubLObject lex_entry, final SubLObject value) {
		final SubLObject v_class = (lex_entry.isSymbol()) ? classes.classes_retrieve_class(lex_entry) : NIL != subloop_structures.class_p(lex_entry) ? lex_entry : NIL != subloop_structures.instance_p(lex_entry) ? subloop_structures.instance_class(lex_entry) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(COMPUTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
		}
		return NIL;
	}

	public static final SubLObject get_lex_entry_stored_properties_alt(SubLObject lex_entry) {
		{
			SubLObject v_class = (lex_entry.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(lex_entry))) : NIL != subloop_structures.class_p(lex_entry) ? ((SubLObject) (lex_entry)) : NIL != subloop_structures.instance_p(lex_entry) ? ((SubLObject) (subloop_structures.instance_class(lex_entry))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(STORED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
			}
			return NIL;
		}
	}

	public static SubLObject get_lex_entry_stored_properties(final SubLObject lex_entry) {
		final SubLObject v_class = (lex_entry.isSymbol()) ? classes.classes_retrieve_class(lex_entry) : NIL != subloop_structures.class_p(lex_entry) ? lex_entry : NIL != subloop_structures.instance_p(lex_entry) ? subloop_structures.instance_class(lex_entry) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(STORED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
		}
		return NIL;
	}

	public static final SubLObject set_lex_entry_stored_properties_alt(SubLObject lex_entry, SubLObject value) {
		{
			SubLObject v_class = (lex_entry.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(lex_entry))) : NIL != subloop_structures.class_p(lex_entry) ? ((SubLObject) (lex_entry)) : NIL != subloop_structures.instance_p(lex_entry) ? ((SubLObject) (subloop_structures.instance_class(lex_entry))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(STORED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
			}
			return NIL;
		}
	}

	public static SubLObject set_lex_entry_stored_properties(final SubLObject lex_entry, final SubLObject value) {
		final SubLObject v_class = (lex_entry.isSymbol()) ? classes.classes_retrieve_class(lex_entry) : NIL != subloop_structures.class_p(lex_entry) ? lex_entry : NIL != subloop_structures.instance_p(lex_entry) ? subloop_structures.instance_class(lex_entry) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(STORED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
		}
		return NIL;
	}

	public static final SubLObject subloop_reserved_initialize_lex_entry_class_alt(SubLObject new_instance) {
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
		classes.subloop_initialize_slot(new_instance, LEX_ENTRY, STORED_PROPERTIES, $list_alt52);
		classes.subloop_initialize_slot(new_instance, LEX_ENTRY, COMPUTED_PROPERTIES, $list_alt53);
		classes.subloop_initialize_slot(new_instance, LEX_ENTRY, SUPPORTED_PROPERTIES, append(instances.get_slot(LEX_ENTRY, STORED_PROPERTIES), Mapping.mapcar(CAR, instances.get_slot(LEX_ENTRY, COMPUTED_PROPERTIES))));
		return NIL;
	}

	public static SubLObject subloop_reserved_initialize_lex_entry_class(final SubLObject new_instance) {
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
		classes.subloop_initialize_slot(new_instance, LEX_ENTRY, STORED_PROPERTIES, $list58);
		classes.subloop_initialize_slot(new_instance, LEX_ENTRY, COMPUTED_PROPERTIES, $list59);
		classes.subloop_initialize_slot(new_instance, LEX_ENTRY, SUPPORTED_PROPERTIES, append(instances.get_slot(LEX_ENTRY, STORED_PROPERTIES), Mapping.mapcar(CAR, instances.get_slot(LEX_ENTRY, COMPUTED_PROPERTIES))));
		return NIL;
	}

	public static final SubLObject subloop_reserved_initialize_lex_entry_instance_alt(SubLObject new_instance) {
		classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
		classes.subloop_initialize_slot(new_instance, LEX_ENTRY, PROPERTIES, NIL);
		return NIL;
	}

	public static SubLObject subloop_reserved_initialize_lex_entry_instance(final SubLObject new_instance) {
		classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
		classes.subloop_initialize_slot(new_instance, LEX_ENTRY, PROPERTIES, NIL);
		return NIL;
	}

	public static final SubLObject lex_entry_p_alt(SubLObject lex_entry) {
		return classes.subloop_instanceof_class(lex_entry, LEX_ENTRY);
	}

	public static SubLObject lex_entry_p(final SubLObject lex_entry) {
		return classes.subloop_instanceof_class(lex_entry, LEX_ENTRY);
	}

	/**
	 *
	 *
	 * @return lex-entry-p; a new empty lex-entry
	 */
	@LispMethod(comment = "@return lex-entry-p; a new empty lex-entry")
	public static final SubLObject lex_entry_initialize_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_lex_entry_method = NIL;
			SubLObject v_properties = get_lex_entry_properties(self);
			try {
				try {
					object.object_initialize_method(self);
					v_properties = NIL;
					sublisp_throw($sym62$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_lex_entry_properties(self, v_properties);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			}
			return catch_var_for_lex_entry_method;
		}
	}

	/**
	 *
	 *
	 * @return lex-entry-p; a new empty lex-entry
	 */
	@LispMethod(comment = "@return lex-entry-p; a new empty lex-entry")
	public static SubLObject lex_entry_initialize_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_lex_entry_method = NIL;
		SubLObject v_properties = get_lex_entry_properties(self);
		try {
			thread.throwStack.push($sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			try {
				object.object_initialize_method(self);
				v_properties = NIL;
				sublisp_throw($sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_lex_entry_properties(self, v_properties);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_lex_entry_method;
	}

	/**
	 *
	 *
	 * @return object; the property value associated with PROPERTY
	 */
	@LispMethod(comment = "@return object; the property value associated with PROPERTY")
	public static final SubLObject lex_entry_get_method_alt(SubLObject self, SubLObject property) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject catch_var_for_lex_entry_method = NIL;
				SubLObject supported_properties = get_lex_entry_supported_properties(self);
				SubLObject computed_properties = get_lex_entry_computed_properties(self);
				SubLObject v_properties = get_lex_entry_properties(self);
				try {
					try {
						if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
							if (NIL == member(property, instances.get_slot(LEX_ENTRY, SUPPORTED_PROPERTIES), UNPROVIDED, UNPROVIDED)) {
								Errors.error($str_alt69$Unsupported_lexical_property__a, property);
							}
						}
						{
							SubLObject value = assoc(property, v_properties, UNPROVIDED, UNPROVIDED).rest();
							if (NIL == value) {
								{
									SubLObject property_method = assoc(property, instances.get_slot(LEX_ENTRY, COMPUTED_PROPERTIES), UNPROVIDED, UNPROVIDED).rest();
									if (NIL != property_method) {
										value = methods.funcall_instance_method_with_0_args(self, property_method);
										if (NIL != value) {
											v_properties = cons(cons(property, value), v_properties);
										}
									}
								}
							}
							sublisp_throw($sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, value);
						}
					} finally {
						{
							SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								set_lex_entry_supported_properties(self, supported_properties);
								set_lex_entry_computed_properties(self, computed_properties);
								set_lex_entry_properties(self, v_properties);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
							}
						}
					}
				} catch (Throwable ccatch_env_var) {
					catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
				}
				return catch_var_for_lex_entry_method;
			}
		}
	}

	/**
	 *
	 *
	 * @return object; the property value associated with PROPERTY
	 */
	@LispMethod(comment = "@return object; the property value associated with PROPERTY")
	public static SubLObject lex_entry_get_method(final SubLObject self, final SubLObject property) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_lex_entry_method = NIL;
		final SubLObject supported_properties = get_lex_entry_supported_properties(self);
		final SubLObject computed_properties = get_lex_entry_computed_properties(self);
		SubLObject v_properties = get_lex_entry_properties(self);
		try {
			thread.throwStack.push($sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			try {
				if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(property, instances.get_slot(LEX_ENTRY, SUPPORTED_PROPERTIES), UNPROVIDED, UNPROVIDED))) {
					Errors.error($str75$Unsupported_lexical_property__a, property);
				}
				SubLObject value = assoc(property, v_properties, UNPROVIDED, UNPROVIDED).rest();
				if (NIL == value) {
					final SubLObject property_method = assoc(property, instances.get_slot(LEX_ENTRY, COMPUTED_PROPERTIES), UNPROVIDED, UNPROVIDED).rest();
					if (NIL != property_method) {
						value = methods.funcall_instance_method_with_0_args(self, property_method);
						if (NIL != value) {
							v_properties = cons(cons(property, value), v_properties);
						}
					}
				}
				sublisp_throw($sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, value);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_lex_entry_supported_properties(self, supported_properties);
					set_lex_entry_computed_properties(self, computed_properties);
					set_lex_entry_properties(self, v_properties);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_lex_entry_method;
	}

	public static final SubLObject lex_entry_denot_alt(SubLObject entry) {
		return methods.funcall_instance_method_with_1_args(entry, GET, $DENOT);
	}

	public static SubLObject lex_entry_denot(final SubLObject entry) {
		return methods.funcall_instance_method_with_1_args(entry, GET, $DENOT);
	}

	public static final SubLObject lex_entry_semtrans_alt(SubLObject entry) {
		return methods.funcall_instance_method_with_1_args(entry, GET, $SEMTRANS);
	}

	public static SubLObject lex_entry_semtrans(final SubLObject entry) {
		return methods.funcall_instance_method_with_1_args(entry, GET, $SEMTRANS);
	}

	public static final SubLObject lex_entry_trie_entry_alt(SubLObject entry) {
		return methods.funcall_instance_method_with_1_args(entry, GET, $TRIE_ENTRY);
	}

	public static SubLObject lex_entry_trie_entry(final SubLObject entry) {
		return methods.funcall_instance_method_with_1_args(entry, GET, $TRIE_ENTRY);
	}

	/**
	 * Sets this lex-entry's PROPERTY to VALUE
	 */
	@LispMethod(comment = "Sets this lex-entry\'s PROPERTY to VALUE")
	public static final SubLObject lex_entry_set_method_alt(SubLObject self, SubLObject property, SubLObject value) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject catch_var_for_lex_entry_method = NIL;
				SubLObject supported_properties = get_lex_entry_supported_properties(self);
				SubLObject v_properties = get_lex_entry_properties(self);
				try {
					try {
						if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
							if (NIL == member(property, instances.get_slot(LEX_ENTRY, SUPPORTED_PROPERTIES), UNPROVIDED, UNPROVIDED)) {
								Errors.error($str_alt69$Unsupported_lexical_property__a, property);
							}
						}
						v_properties = remove(property, v_properties, EQ, FIRST, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						v_properties = cons(cons(property, value), v_properties);
						sublisp_throw($sym77$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, value);
					} finally {
						{
							SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								set_lex_entry_supported_properties(self, supported_properties);
								set_lex_entry_properties(self, v_properties);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
							}
						}
					}
				} catch (Throwable ccatch_env_var) {
					catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym77$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
				}
				return catch_var_for_lex_entry_method;
			}
		}
	}

	/**
	 * Sets this lex-entry's PROPERTY to VALUE
	 */
	@LispMethod(comment = "Sets this lex-entry\'s PROPERTY to VALUE")
	public static SubLObject lex_entry_set_method(final SubLObject self, final SubLObject property, final SubLObject value) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_lex_entry_method = NIL;
		final SubLObject supported_properties = get_lex_entry_supported_properties(self);
		SubLObject v_properties = get_lex_entry_properties(self);
		try {
			thread.throwStack.push($sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			try {
				final SubLObject get_slot2 = instances.get_slot(LEX_ENTRY, SUPPORTED_PROPERTIES);
				if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(property, get_slot2, UNPROVIDED, UNPROVIDED))) {
					Errors.error($str75$Unsupported_lexical_property__a, property);
				}
				v_properties = remove(property, v_properties, EQ, FIRST, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				v_properties = cons(cons(property, value), v_properties);
				sublisp_throw($sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, value);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_lex_entry_supported_properties(self, supported_properties);
					set_lex_entry_properties(self, v_properties);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_lex_entry_method;
	}

	/**
	 * make a deep-copy of self
	 */
	@LispMethod(comment = "make a deep-copy of self")
	public static final SubLObject lex_entry_copy_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_lex_entry_method = NIL;
			SubLObject v_properties = get_lex_entry_properties(self);
			try {
				try {
					{
						SubLObject new_entry = object.new_class_instance(LEX_ENTRY);
						SubLObject new_properties = NIL;
						SubLObject cdolist_list_var = v_properties;
						SubLObject keyXval = NIL;
						for (keyXval = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), keyXval = cdolist_list_var.first()) {
							{
								SubLObject new_key = keyXval.first();
								SubLObject val = keyXval.rest();
								SubLObject new_val = (val.isList()) ? ((SubLObject) (copy_list(val))) : val;
								new_properties = cons(cons(new_key, new_val), new_properties);
							}
						}
						instances.set_slot(new_entry, PROPERTIES, new_properties);
						sublisp_throw($sym82$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, new_entry);
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_lex_entry_properties(self, v_properties);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			}
			return catch_var_for_lex_entry_method;
		}
	}

	/**
	 * make a deep-copy of self
	 */
	@LispMethod(comment = "make a deep-copy of self")
	public static SubLObject lex_entry_copy_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_lex_entry_method = NIL;
		final SubLObject v_properties = get_lex_entry_properties(self);
		try {
			thread.throwStack.push($sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			try {
				final SubLObject new_entry = object.new_class_instance(LEX_ENTRY);
				SubLObject new_properties = NIL;
				SubLObject cdolist_list_var = v_properties;
				SubLObject keyXval = NIL;
				keyXval = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					final SubLObject new_key = keyXval.first();
					final SubLObject val = keyXval.rest();
					final SubLObject new_val = (val.isList()) ? copy_list(val) : val;
					new_properties = cons(cons(new_key, new_val), new_properties);
					cdolist_list_var = cdolist_list_var.rest();
					keyXval = cdolist_list_var.first();
				}
				instances.set_slot(new_entry, PROPERTIES, new_properties);
				sublisp_throw($sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, new_entry);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_lex_entry_properties(self, v_properties);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_lex_entry_method;
	}

	/**
	 *
	 *
	 * @return booleanp; Does this LEX-ENTRY represent a noun?
	i.e. Is its :CYC-POS property value a spec of #$Noun?
	 */
	@LispMethod(comment = "@return booleanp; Does this LEX-ENTRY represent a noun?\r\ni.e. Is its :CYC-POS property value a spec of #$Noun?")
	public static final SubLObject lex_entry_nounP_method_alt(SubLObject self, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $ANY;
		}
		{
			SubLObject pos = methods.funcall_instance_method_with_1_args(self, GET, $CYC_POS);
			if (mt == $ANY) {
				return genls.genl_in_any_mtP(pos, $$Noun);
			} else {
				return genls.genlP(pos, $$Noun, mt, UNPROVIDED);
			}
		}
	}

	/**
	 *
	 *
	 * @return booleanp; Does this LEX-ENTRY represent a noun?
	i.e. Is its :CYC-POS property value a spec of #$Noun?
	 */
	@LispMethod(comment = "@return booleanp; Does this LEX-ENTRY represent a noun?\r\ni.e. Is its :CYC-POS property value a spec of #$Noun?")
	public static SubLObject lex_entry_nounP_method(final SubLObject self, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $ANY;
		}
		final SubLObject pos = methods.funcall_instance_method_with_1_args(self, GET, $CYC_POS);
		if (mt == $ANY) {
			return genls.genl_in_any_mtP(pos, $$Noun);
		}
		return genls.genlP(pos, $$Noun, mt, UNPROVIDED);
	}

	/**
	 * Prints this lex-entry to STREAM, ignoring DEPTH
	 */
	@LispMethod(comment = "Prints this lex-entry to STREAM, ignoring DEPTH")
	public static final SubLObject lex_entry_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
		{
			SubLObject catch_var_for_lex_entry_method = NIL;
			SubLObject v_properties = get_lex_entry_properties(self);
			try {
				try {
					write_string($str_alt96$__LEX_ENTRY_, stream, UNPROVIDED, UNPROVIDED);
					terpri(stream);
					{
						SubLObject cdolist_list_var = v_properties;
						SubLObject property = NIL;
						for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), property = cdolist_list_var.first()) {
							prin1(property.first(), stream);
							write_string($str_alt97$____, stream, UNPROVIDED, UNPROVIDED);
							prin1(property.rest(), stream);
							terpri(stream);
						}
					}
					write_string($str_alt43$_, stream, UNPROVIDED, UNPROVIDED);
					terpri(stream);
					sublisp_throw($sym95$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_lex_entry_properties(self, v_properties);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym95$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			}
			return catch_var_for_lex_entry_method;
		}
	}

	/**
	 * Prints this lex-entry to STREAM, ignoring DEPTH
	 */
	@LispMethod(comment = "Prints this lex-entry to STREAM, ignoring DEPTH")
	public static SubLObject lex_entry_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_lex_entry_method = NIL;
		final SubLObject v_properties = get_lex_entry_properties(self);
		try {
			thread.throwStack.push($sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			try {
				write_string($str102$__LEX_ENTRY_, stream, UNPROVIDED, UNPROVIDED);
				terpri(stream);
				SubLObject cdolist_list_var = v_properties;
				SubLObject property = NIL;
				property = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					prin1(property.first(), stream);
					write_string($str103$____, stream, UNPROVIDED, UNPROVIDED);
					prin1(property.rest(), stream);
					terpri(stream);
					cdolist_list_var = cdolist_list_var.rest();
					property = cdolist_list_var.first();
				}
				write_string($str49$_, stream, UNPROVIDED, UNPROVIDED);
				terpri(stream);
				sublisp_throw($sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_lex_entry_properties(self, v_properties);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_lex_entry_method;
	}

	public static final SubLObject lex_entry_nominal_p_method_alt(SubLObject self) {
		return intersection(methods.funcall_instance_method_with_1_args(self, GET, $PENN_TAGS), $nominal_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject lex_entry_nominal_p_method(final SubLObject self) {
		return intersection(methods.funcall_instance_method_with_1_args(self, GET, $PENN_TAGS), $nominal_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject lex_entry_verbal_p_method_alt(SubLObject self) {
		return intersection(methods.funcall_instance_method_with_1_args(self, GET, $PENN_TAGS), $verbal_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject lex_entry_verbal_p_method(final SubLObject self) {
		return intersection(methods.funcall_instance_method_with_1_args(self, GET, $PENN_TAGS), $verbal_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject lex_entry_adjectival_p_method_alt(SubLObject self) {
		return intersection(methods.funcall_instance_method_with_1_args(self, GET, $PENN_TAGS), $adjectival_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject lex_entry_adjectival_p_method(final SubLObject self) {
		return intersection(methods.funcall_instance_method_with_1_args(self, GET, $PENN_TAGS), $adjectival_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject lex_entry_adverbial_p_method_alt(SubLObject self) {
		return intersection(methods.funcall_instance_method_with_1_args(self, GET, $PENN_TAGS), $adverbial_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject lex_entry_adverbial_p_method(final SubLObject self) {
		return intersection(methods.funcall_instance_method_with_1_args(self, GET, $PENN_TAGS), $adverbial_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	/**
	 *
	 *
	 * @return constantp; a single constant derived from this lex entry's
	semantics
	 */
	@LispMethod(comment = "@return constantp; a single constant derived from this lex entry\'s\r\nsemantics")
	public static final SubLObject lex_entry_compute_term_method_alt(SubLObject self) {
		if (!((NIL != methods.funcall_instance_method_with_0_args(self, NOMINAL_P)) || (NIL != methods.funcall_instance_method_with_0_args(self, VERBAL_P)))) {
			Errors.error($str_alt118$Invalid_lexical_property__term_ca, self);
		}
		{
			SubLObject v_term = methods.funcall_instance_method_with_1_args(self, GET, $DENOT);
			if (NIL == v_term) {
				{
					SubLObject semtrans = methods.funcall_instance_method_with_1_args(self, GET, $SEMTRANS);
					if (NIL != semtrans) {
						{
							SubLObject operator = cycl_utilities.formula_operator(semtrans);
							if ((operator.eql($$equals) || operator.eql($$isa)) || operator.eql($$genls)) {
								v_term = cycl_utilities.formula_arg2(semtrans, UNPROVIDED);
							} else {
								if ((NIL != fort_types_interface.logical_connective_p(cycl_utilities.formula_operator(semtrans))) || (NIL != fort_types_interface.quantifier_p(cycl_utilities.formula_operator(semtrans)))) {
									{
										SubLObject central_keyword = (NIL != methods.funcall_instance_method_with_0_args(self, NOMINAL_P)) ? ((SubLObject) ($NOUN)) : NIL != methods.funcall_instance_method_with_0_args(self, VERBAL_P) ? ((SubLObject) ($ACTION)) : NIL;
										v_term = parse_tree.main_collection(semtrans, central_keyword);
									}
								} else {
									v_term = cycl_utilities.formula_operator(semtrans);
								}
							}
						}
					}
				}
			}
			return v_term;
		}
	}

	/**
	 *
	 *
	 * @return constantp; a single constant derived from this lex entry's
	semantics
	 */
	@LispMethod(comment = "@return constantp; a single constant derived from this lex entry\'s\r\nsemantics")
	public static SubLObject lex_entry_compute_term_method(final SubLObject self) {
		if ((NIL == methods.funcall_instance_method_with_0_args(self, NOMINAL_P)) && (NIL == methods.funcall_instance_method_with_0_args(self, VERBAL_P))) {
			Errors.error($str124$Invalid_lexical_property__term_ca, self);
		}
		SubLObject v_term = methods.funcall_instance_method_with_1_args(self, GET, $DENOT);
		if (NIL == v_term) {
			final SubLObject semtrans = methods.funcall_instance_method_with_1_args(self, GET, $SEMTRANS);
			if (NIL != semtrans) {
				final SubLObject operator = cycl_utilities.formula_operator(semtrans);
				if ((operator.eql($$equals) || operator.eql($$isa)) || operator.eql($$genls)) {
					v_term = cycl_utilities.formula_arg2(semtrans, UNPROVIDED);
				} else if ((NIL != fort_types_interface.logical_connective_p(cycl_utilities.formula_operator(semtrans))) || (NIL != fort_types_interface.quantifier_p(cycl_utilities.formula_operator(semtrans)))) {
					final SubLObject central_keyword = (NIL != methods.funcall_instance_method_with_0_args(self, NOMINAL_P)) ? $NOUN : NIL != methods.funcall_instance_method_with_0_args(self, VERBAL_P) ? $ACTION : NIL;
					v_term = parse_tree.main_collection(semtrans, central_keyword);
				} else {
					v_term = cycl_utilities.formula_operator(semtrans);
				}

			}
		}
		return v_term;
	}

	/**
	 *
	 *
	 * @return listp;  a list of genders of this lex entry with possible gender values
	:FEMININE, :MASCULINE and :NEUTER
	 */
	@LispMethod(comment = "@return listp;  a list of genders of this lex entry with possible gender values\r\n:FEMININE, :MASCULINE and :NEUTER")
	public static final SubLObject lex_entry_compute_gender_method_alt(SubLObject self) {
		if (NIL == methods.funcall_instance_method_with_0_args(self, NOMINAL_P)) {
			Errors.error($str_alt127$Invalid_lexical_property__gender_, self);
		}
		{
			SubLObject genders = NIL;
			SubLObject v_term = methods.funcall_instance_method_with_1_args(self, GET, $TERM);
			if (NIL != at_utilities.more_specific_p(v_term, $$MaleAnimal, $$EverythingPSC)) {
				genders = $list_alt130;
			} else {
				if (NIL != at_utilities.more_specific_p(v_term, $$FemaleAnimal, $$EverythingPSC)) {
					genders = $list_alt132;
				} else {
					if (NIL != at_utilities.more_specific_p(v_term, $$Person, $$EverythingPSC)) {
						genders = $list_alt134;
					} else {
						if (NIL != at_utilities.more_specific_p(v_term, $$SentientAnimal, $$EverythingPSC)) {
							genders = $list_alt136;
						}
					}
				}
			}
			if (NIL == genders) {
				genders = $list_alt137;
			}
			return genders;
		}
	}

	/**
	 *
	 *
	 * @return listp;  a list of genders of this lex entry with possible gender values
	:FEMININE, :MASCULINE and :NEUTER
	 */
	@LispMethod(comment = "@return listp;  a list of genders of this lex entry with possible gender values\r\n:FEMININE, :MASCULINE and :NEUTER")
	public static SubLObject lex_entry_compute_gender_method(final SubLObject self) {
		if (NIL == methods.funcall_instance_method_with_0_args(self, NOMINAL_P)) {
			Errors.error($str133$Invalid_lexical_property__gender_, self);
		}
		SubLObject genders = NIL;
		final SubLObject v_term = methods.funcall_instance_method_with_1_args(self, GET, $TERM);
		if (NIL != at_utilities.more_specific_p(v_term, $$MaleAnimal, $$EverythingPSC)) {
			genders = $list136;
		} else if (NIL != at_utilities.more_specific_p(v_term, $$FemaleAnimal, $$EverythingPSC)) {
			genders = $list138;
		} else if (NIL != at_utilities.more_specific_p(v_term, $$Person, $$EverythingPSC)) {
			genders = $list140;
		} else if (NIL != at_utilities.more_specific_p(v_term, $$SentientAnimal, $$EverythingPSC)) {
			genders = $list142;
		}

		if (NIL == genders) {
			genders = $list143;
		}
		return genders;
	}

	/**
	 *
	 *
	 * @return listp; the Penn part-of-speech tags of this lex-entry
	 */
	@LispMethod(comment = "@return listp; the Penn part-of-speech tags of this lex-entry")
	public static final SubLObject lex_entry_compute_penn_tags_method_alt(SubLObject self) {
		{
			SubLObject pos = lex_entry_get_method(self, $CYC_POS);
			SubLObject inflections = lex_entry_get_method(self, $INFLECTIONS);
			SubLObject string = lex_entry_get_method(self, $STRING);
			SubLObject penn_tags = NIL;
			if ((pos == $$Preposition) && string.equalp($$$to)) {
				penn_tags = cons($TO, penn_tags);
			} else {
				{
					SubLObject cdolist_list_var = inflections;
					SubLObject inflection = NIL;
					for (inflection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), inflection = cdolist_list_var.first()) {
						{
							SubLObject penn_tag = map_from_cyc_to_penn_pos(pos, inflection);
							if (NIL != penn_tag) {
								penn_tags = cons(penn_tag, penn_tags);
							}
						}
					}
				}
			}
			return remove_duplicates(penn_tags, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
	}

	/**
	 *
	 *
	 * @return listp; the Penn part-of-speech tags of this lex-entry
	 */
	@LispMethod(comment = "@return listp; the Penn part-of-speech tags of this lex-entry")
	public static SubLObject lex_entry_compute_penn_tags_method(final SubLObject self) {
		final SubLObject pos = lex_entry_get_method(self, $CYC_POS);
		final SubLObject inflections = lex_entry_get_method(self, $INFLECTIONS);
		final SubLObject string = lex_entry_get_method(self, $STRING);
		SubLObject penn_tags = NIL;
		if (pos.eql($$Preposition) && string.equalp($$$to)) {
			penn_tags = cons($TO, penn_tags);
		} else {
			SubLObject cdolist_list_var = inflections;
			SubLObject inflection = NIL;
			inflection = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				final SubLObject penn_tag = map_from_cyc_to_penn_pos(pos, inflection);
				if (NIL != penn_tag) {
					penn_tags = cons(penn_tag, penn_tags);
				}
				cdolist_list_var = cdolist_list_var.rest();
				inflection = cdolist_list_var.first();
			}
		}
		return remove_duplicates(penn_tags, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	/**
	 *
	 *
	 * @return listp; the Penn part-of-speech tags of this lex-entry, plus additional tags
	that are easily confused with the accurate ones
	 */
	@LispMethod(comment = "@return listp; the Penn part-of-speech tags of this lex-entry, plus additional tags\r\nthat are easily confused with the accurate ones")
	public static final SubLObject lex_entry_compute_backoff_penn_tags_method_alt(SubLObject self) {
		{
			SubLObject penn_tags = methods.funcall_instance_method_with_1_args(self, GET, $PENN_TAGS);
			SubLObject cdolist_list_var = penn_tags;
			SubLObject tag = NIL;
			for (tag = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tag = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_8 = tag_backoffs(tag);
					SubLObject backoff = NIL;
					for (backoff = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest(), backoff = cdolist_list_var_8.first()) {
						if (backoff != tag) {
							penn_tags = cons(backoff, penn_tags);
						}
					}
				}
			}
			return penn_tags;
		}
	}

	/**
	 *
	 *
	 * @return listp; the Penn part-of-speech tags of this lex-entry, plus additional tags
	that are easily confused with the accurate ones
	 */
	@LispMethod(comment = "@return listp; the Penn part-of-speech tags of this lex-entry, plus additional tags\r\nthat are easily confused with the accurate ones")
	public static SubLObject lex_entry_compute_backoff_penn_tags_method(final SubLObject self) {
		SubLObject cdolist_list_var;
		SubLObject penn_tags = cdolist_list_var = methods.funcall_instance_method_with_1_args(self, GET, $PENN_TAGS);
		SubLObject tag = NIL;
		tag = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$8 = tag_backoffs(tag);
			SubLObject backoff = NIL;
			backoff = cdolist_list_var_$8.first();
			while (NIL != cdolist_list_var_$8) {
				if (!backoff.eql(tag)) {
					penn_tags = cons(backoff, penn_tags);
				}
				cdolist_list_var_$8 = cdolist_list_var_$8.rest();
				backoff = cdolist_list_var_$8.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			tag = cdolist_list_var.first();
		}
		return penn_tags;
	}

	public static final SubLObject tag_backoffs_alt(SubLObject tag) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				SubLObject cdolist_list_var = $penn_tag_backoffs$.getDynamicValue(thread);
				SubLObject tags = NIL;
				for (tags = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tags = cdolist_list_var.first()) {
					if (NIL != subl_promotions.memberP(tag, tags, EQ, UNPROVIDED)) {
						result = cconcatenate(tags, result);
					}
				}
				return remove_duplicates(remove(tag, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		}
	}

	public static SubLObject tag_backoffs(final SubLObject tag) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		SubLObject cdolist_list_var = $penn_tag_backoffs$.getDynamicValue(thread);
		SubLObject tags = NIL;
		tags = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != subl_promotions.memberP(tag, tags, EQ, UNPROVIDED)) {
				result = cconcatenate(tags, result);
			}
			cdolist_list_var = cdolist_list_var.rest();
			tags = cdolist_list_var.first();
		}
		return remove_duplicates(remove(tag, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	/**
	 *
	 *
	 * @return stringp; the super tag of this lex-entry
	 */
	@LispMethod(comment = "@return stringp; the super tag of this lex-entry")
	public static final SubLObject lex_entry_compute_super_tags_method_alt(SubLObject self) {
		{
			SubLObject supertags = NIL;
			SubLObject cdolist_list_var = lex_entry_get_method(self, $INFLECTIONS);
			SubLObject infl = NIL;
			for (infl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), infl = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_9 = gethash(list(lex_entry_get_method(self, $CYC_POS), lex_entry_get_method(self, $FRAME), infl), $cyc_to_supertag_map$.getGlobalValue(), UNPROVIDED);
					SubLObject supertag = NIL;
					for (supertag = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest(), supertag = cdolist_list_var_9.first()) {
						{
							SubLObject item_var = supertag;
							if (NIL == member(item_var, supertags, EQUAL, symbol_function(IDENTITY))) {
								supertags = cons(item_var, supertags);
							}
						}
					}
				}
			}
			return supertags;
		}
	}

	/**
	 *
	 *
	 * @return stringp; the super tag of this lex-entry
	 */
	@LispMethod(comment = "@return stringp; the super tag of this lex-entry")
	public static SubLObject lex_entry_compute_super_tags_method(final SubLObject self) {
		SubLObject supertags = NIL;
		SubLObject cdolist_list_var = lex_entry_get_method(self, $INFLECTIONS);
		SubLObject infl = NIL;
		infl = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$9 = gethash(list(lex_entry_get_method(self, $CYC_POS), lex_entry_get_method(self, $FRAME), infl), $cyc_to_supertag_map$.getGlobalValue(), UNPROVIDED);
			SubLObject supertag = NIL;
			supertag = cdolist_list_var_$9.first();
			while (NIL != cdolist_list_var_$9) {
				final SubLObject item_var = supertag;
				if (NIL == member(item_var, supertags, EQUAL, symbol_function(IDENTITY))) {
					supertags = cons(item_var, supertags);
				}
				cdolist_list_var_$9 = cdolist_list_var_$9.rest();
				supertag = cdolist_list_var_$9.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			infl = cdolist_list_var.first();
		}
		return supertags;
	}

	public static final SubLObject lex_entry_compute_cyc_pos_method_alt(SubLObject self) {
		{
			SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, GET, $TRIE_ENTRY);
			if (NIL != trie_entry) {
				return nl_trie.nl_trie_entry_pos(trie_entry);
			} else {
				if (NIL != methods.funcall_instance_method_with_1_args(self, GET, $INFLECTIONS)) {
					{
						SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, GET, $INFLECTIONS);
						SubLObject pred = NIL;
						for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), pred = cdolist_list_var.first()) {
							{
								SubLObject pos = lexicon_accessors.pos_of_pred(pred);
								if (NIL != pos) {
									return pos;
								}
							}
						}
					}
				}
			}
			return NIL;
		}
	}

	public static SubLObject lex_entry_compute_cyc_pos_method(final SubLObject self) {
		final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, GET, $TRIE_ENTRY);
		if (NIL != trie_entry) {
			return nl_trie.nl_trie_entry_pos(trie_entry);
		}
		if (NIL != methods.funcall_instance_method_with_1_args(self, GET, $INFLECTIONS)) {
			SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, GET, $INFLECTIONS);
			SubLObject pred = NIL;
			pred = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				final SubLObject pos = lexicon_accessors.pos_of_pred(pred);
				if (NIL != pos) {
					return pos;
				}
				cdolist_list_var = cdolist_list_var.rest();
				pred = cdolist_list_var.first();
			}
		}
		return NIL;
	}

	public static final SubLObject lex_entry_compute_is_ner_entry_method_alt(SubLObject self) {
		{
			SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, GET, $TRIE_ENTRY);
			return makeBoolean(NIL == trie_entry);
		}
	}

	public static SubLObject lex_entry_compute_is_ner_entry_method(final SubLObject self) {
		final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, GET, $TRIE_ENTRY);
		return makeBoolean(NIL == trie_entry);
	}

	/**
	 * What is the syntactic category of this lexical entry.  Unlike cyc-pos, this does not assume that each
	 * entry is a part-of-speech.  In some cases, the category may be a XP, not just an X0
	 */
	@LispMethod(comment = "What is the syntactic category of this lexical entry.  Unlike cyc-pos, this does not assume that each\r\nentry is a part-of-speech.  In some cases, the category may be a XP, not just an X0\nWhat is the syntactic category of this lexical entry.  Unlike cyc-pos, this does not assume that each\nentry is a part-of-speech.  In some cases, the category may be a XP, not just an X0")
	public static final SubLObject lex_entry_compute_cyc_category_method_alt(SubLObject self) {
		{
			SubLObject pred = methods.funcall_instance_method_with_1_args(self, GET, $PREDICATE);
			if (NIL != lexicon_vars.name_string_predP(pred)) {
				return $$NounPhrase;
			}
			return methods.funcall_instance_method_with_1_args(self, GET, $CYC_POS);
		}
	}

	/**
	 * What is the syntactic category of this lexical entry.  Unlike cyc-pos, this does not assume that each
	 * entry is a part-of-speech.  In some cases, the category may be a XP, not just an X0
	 */
	@LispMethod(comment = "What is the syntactic category of this lexical entry.  Unlike cyc-pos, this does not assume that each\r\nentry is a part-of-speech.  In some cases, the category may be a XP, not just an X0\nWhat is the syntactic category of this lexical entry.  Unlike cyc-pos, this does not assume that each\nentry is a part-of-speech.  In some cases, the category may be a XP, not just an X0")
	public static SubLObject lex_entry_compute_cyc_category_method(final SubLObject self) {
		final SubLObject pred = methods.funcall_instance_method_with_1_args(self, GET, $PREDICATE);
		if (NIL != lexicon_vars.name_string_predP(pred)) {
			return $$NounPhrase;
		}
		return methods.funcall_instance_method_with_1_args(self, GET, $CYC_POS);
	}

	public static final SubLObject lex_entry_compute_inflections_method_alt(SubLObject self) {
		{
			SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, GET, $TRIE_ENTRY);
			if (NIL != trie_entry) {
				return nl_trie.nl_trie_entry_pos_preds(trie_entry);
			}
			return NIL;
		}
	}

	public static SubLObject lex_entry_compute_inflections_method(final SubLObject self) {
		final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, GET, $TRIE_ENTRY);
		if (NIL != trie_entry) {
			return nl_trie.nl_trie_entry_pos_preds(trie_entry);
		}
		return NIL;
	}

	public static final SubLObject get_abstract_lexicon_stop_words_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FIFTEEN_INTEGER, STOP_WORDS);
	}

	public static SubLObject get_abstract_lexicon_stop_words(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FIFTEEN_INTEGER, STOP_WORDS);
	}

	public static final SubLObject set_abstract_lexicon_stop_words_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FIFTEEN_INTEGER, STOP_WORDS);
	}

	public static SubLObject set_abstract_lexicon_stop_words(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FIFTEEN_INTEGER, STOP_WORDS);
	}

	public static final SubLObject get_abstract_lexicon_allow_stemming_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FOURTEEN_INTEGER, ALLOW_STEMMING);
	}

	public static SubLObject get_abstract_lexicon_allow_stemming(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FOURTEEN_INTEGER, ALLOW_STEMMING);
	}

	public static final SubLObject set_abstract_lexicon_allow_stemming_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FOURTEEN_INTEGER, ALLOW_STEMMING);
	}

	public static SubLObject set_abstract_lexicon_allow_stemming(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FOURTEEN_INTEGER, ALLOW_STEMMING);
	}

	public static final SubLObject get_abstract_lexicon_active_learners_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, THIRTEEN_INTEGER, ACTIVE_LEARNERS);
	}

	public static SubLObject get_abstract_lexicon_active_learners(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, THIRTEEN_INTEGER, ACTIVE_LEARNERS);
	}

	public static final SubLObject set_abstract_lexicon_active_learners_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, THIRTEEN_INTEGER, ACTIVE_LEARNERS);
	}

	public static SubLObject set_abstract_lexicon_active_learners(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, THIRTEEN_INTEGER, ACTIVE_LEARNERS);
	}

	public static final SubLObject get_abstract_lexicon_learned_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, TWELVE_INTEGER, LEARNED);
	}

	public static SubLObject get_abstract_lexicon_learned(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, TWELVE_INTEGER, LEARNED);
	}

	public static final SubLObject set_abstract_lexicon_learned_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, TWELVE_INTEGER, LEARNED);
	}

	public static SubLObject set_abstract_lexicon_learned(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, TWELVE_INTEGER, LEARNED);
	}

	public static final SubLObject get_abstract_lexicon_allow_fabricationP_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, ELEVEN_INTEGER, $sym174$ALLOW_FABRICATION_);
	}

	public static SubLObject get_abstract_lexicon_allow_fabricationP(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, ELEVEN_INTEGER, $sym180$ALLOW_FABRICATION_);
	}

	public static final SubLObject set_abstract_lexicon_allow_fabricationP_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, ELEVEN_INTEGER, $sym174$ALLOW_FABRICATION_);
	}

	public static SubLObject set_abstract_lexicon_allow_fabricationP(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, ELEVEN_INTEGER, $sym180$ALLOW_FABRICATION_);
	}

	public static final SubLObject get_abstract_lexicon_case_sensitivity_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, TEN_INTEGER, CASE_SENSITIVITY);
	}

	public static SubLObject get_abstract_lexicon_case_sensitivity(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, TEN_INTEGER, CASE_SENSITIVITY);
	}

	public static final SubLObject set_abstract_lexicon_case_sensitivity_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, TEN_INTEGER, CASE_SENSITIVITY);
	}

	public static SubLObject set_abstract_lexicon_case_sensitivity(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, TEN_INTEGER, CASE_SENSITIVITY);
	}

	public static final SubLObject get_abstract_lexicon_ignore_cacheP_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, NINE_INTEGER, $sym176$IGNORE_CACHE_);
	}

	public static SubLObject get_abstract_lexicon_ignore_cacheP(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, NINE_INTEGER, $sym182$IGNORE_CACHE_);
	}

	public static final SubLObject set_abstract_lexicon_ignore_cacheP_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, NINE_INTEGER, $sym176$IGNORE_CACHE_);
	}

	public static SubLObject set_abstract_lexicon_ignore_cacheP(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, NINE_INTEGER, $sym182$IGNORE_CACHE_);
	}

	public static final SubLObject get_abstract_lexicon_cache_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, EIGHT_INTEGER, CACHE);
	}

	public static SubLObject get_abstract_lexicon_cache(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, EIGHT_INTEGER, CACHE);
	}

	public static final SubLObject set_abstract_lexicon_cache_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, EIGHT_INTEGER, CACHE);
	}

	public static SubLObject set_abstract_lexicon_cache(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, EIGHT_INTEGER, CACHE);
	}

	public static final SubLObject get_abstract_lexicon_trie_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, SEVEN_INTEGER, TRIE);
	}

	public static SubLObject get_abstract_lexicon_trie(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, SEVEN_INTEGER, TRIE);
	}

	public static final SubLObject set_abstract_lexicon_trie_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, SEVEN_INTEGER, TRIE);
	}

	public static SubLObject set_abstract_lexicon_trie(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, SEVEN_INTEGER, TRIE);
	}

	public static final SubLObject get_abstract_lexicon_excluded_pos_list_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, SIX_INTEGER, EXCLUDED_POS_LIST);
	}

	public static SubLObject get_abstract_lexicon_excluded_pos_list(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, SIX_INTEGER, EXCLUDED_POS_LIST);
	}

	public static final SubLObject set_abstract_lexicon_excluded_pos_list_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, SIX_INTEGER, EXCLUDED_POS_LIST);
	}

	public static SubLObject set_abstract_lexicon_excluded_pos_list(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, SIX_INTEGER, EXCLUDED_POS_LIST);
	}

	public static final SubLObject get_abstract_lexicon_excluded_preds_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FIVE_INTEGER, EXCLUDED_PREDS);
	}

	public static SubLObject get_abstract_lexicon_excluded_preds(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FIVE_INTEGER, EXCLUDED_PREDS);
	}

	public static final SubLObject set_abstract_lexicon_excluded_preds_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FIVE_INTEGER, EXCLUDED_PREDS);
	}

	public static SubLObject set_abstract_lexicon_excluded_preds(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FIVE_INTEGER, EXCLUDED_PREDS);
	}

	public static final SubLObject get_abstract_lexicon_root_mt_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FOUR_INTEGER, ROOT_MT);
	}

	public static SubLObject get_abstract_lexicon_root_mt(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FOUR_INTEGER, ROOT_MT);
	}

	public static final SubLObject set_abstract_lexicon_root_mt_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FOUR_INTEGER, ROOT_MT);
	}

	public static SubLObject set_abstract_lexicon_root_mt(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FOUR_INTEGER, ROOT_MT);
	}

	public static final SubLObject get_abstract_lexicon_base_mt_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, THREE_INTEGER, BASE_MT);
	}

	public static SubLObject get_abstract_lexicon_base_mt(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, THREE_INTEGER, BASE_MT);
	}

	public static final SubLObject set_abstract_lexicon_base_mt_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, THREE_INTEGER, BASE_MT);
	}

	public static SubLObject set_abstract_lexicon_base_mt(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, THREE_INTEGER, BASE_MT);
	}

	public static final SubLObject get_abstract_lexicon_excluded_mts_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, TWO_INTEGER, EXCLUDED_MTS);
	}

	public static SubLObject get_abstract_lexicon_excluded_mts(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, TWO_INTEGER, EXCLUDED_MTS);
	}

	public static final SubLObject set_abstract_lexicon_excluded_mts_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, TWO_INTEGER, EXCLUDED_MTS);
	}

	public static SubLObject set_abstract_lexicon_excluded_mts(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, TWO_INTEGER, EXCLUDED_MTS);
	}

	public static final SubLObject get_abstract_lexicon_allowed_mts_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, ONE_INTEGER, ALLOWED_MTS);
	}

	public static SubLObject get_abstract_lexicon_allowed_mts(final SubLObject v_abstract_lexicon) {
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, ONE_INTEGER, ALLOWED_MTS);
	}

	public static final SubLObject set_abstract_lexicon_allowed_mts_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, ONE_INTEGER, ALLOWED_MTS);
	}

	public static SubLObject set_abstract_lexicon_allowed_mts(final SubLObject v_abstract_lexicon, final SubLObject value) {
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, ONE_INTEGER, ALLOWED_MTS);
	}

	public static final SubLObject get_abstract_lexicon_default_kb_spec_alt(SubLObject v_abstract_lexicon) {
		{
			SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_abstract_lexicon))) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? ((SubLObject) (v_abstract_lexicon)) : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? ((SubLObject) (subloop_structures.instance_class(v_abstract_lexicon))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_KB_SPEC, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
			}
			return NIL;
		}
	}

	public static SubLObject get_abstract_lexicon_default_kb_spec(final SubLObject v_abstract_lexicon) {
		final SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? classes.classes_retrieve_class(v_abstract_lexicon) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? v_abstract_lexicon : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_KB_SPEC, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
		}
		return NIL;
	}

	public static final SubLObject set_abstract_lexicon_default_kb_spec_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		{
			SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_abstract_lexicon))) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? ((SubLObject) (v_abstract_lexicon)) : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? ((SubLObject) (subloop_structures.instance_class(v_abstract_lexicon))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_KB_SPEC, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
			}
			return NIL;
		}
	}

	public static SubLObject set_abstract_lexicon_default_kb_spec(final SubLObject v_abstract_lexicon, final SubLObject value) {
		final SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? classes.classes_retrieve_class(v_abstract_lexicon) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? v_abstract_lexicon : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_KB_SPEC, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
		}
		return NIL;
	}

	public static final SubLObject get_abstract_lexicon_default_base_mt_alt(SubLObject v_abstract_lexicon) {
		{
			SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_abstract_lexicon))) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? ((SubLObject) (v_abstract_lexicon)) : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? ((SubLObject) (subloop_structures.instance_class(v_abstract_lexicon))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_BASE_MT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
			}
			return NIL;
		}
	}

	public static SubLObject get_abstract_lexicon_default_base_mt(final SubLObject v_abstract_lexicon) {
		final SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? classes.classes_retrieve_class(v_abstract_lexicon) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? v_abstract_lexicon : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_BASE_MT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
		}
		return NIL;
	}

	public static final SubLObject set_abstract_lexicon_default_base_mt_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		{
			SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_abstract_lexicon))) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? ((SubLObject) (v_abstract_lexicon)) : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? ((SubLObject) (subloop_structures.instance_class(v_abstract_lexicon))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_BASE_MT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
			}
			return NIL;
		}
	}

	public static SubLObject set_abstract_lexicon_default_base_mt(final SubLObject v_abstract_lexicon, final SubLObject value) {
		final SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? classes.classes_retrieve_class(v_abstract_lexicon) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? v_abstract_lexicon : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_BASE_MT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
		}
		return NIL;
	}

	public static final SubLObject get_abstract_lexicon_default_exclude_predicates_alt(SubLObject v_abstract_lexicon) {
		{
			SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_abstract_lexicon))) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? ((SubLObject) (v_abstract_lexicon)) : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? ((SubLObject) (subloop_structures.instance_class(v_abstract_lexicon))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_EXCLUDE_PREDICATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
			}
			return NIL;
		}
	}

	public static SubLObject get_abstract_lexicon_default_exclude_predicates(final SubLObject v_abstract_lexicon) {
		final SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? classes.classes_retrieve_class(v_abstract_lexicon) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? v_abstract_lexicon : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_EXCLUDE_PREDICATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
		}
		return NIL;
	}

	public static final SubLObject set_abstract_lexicon_default_exclude_predicates_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		{
			SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_abstract_lexicon))) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? ((SubLObject) (v_abstract_lexicon)) : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? ((SubLObject) (subloop_structures.instance_class(v_abstract_lexicon))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_EXCLUDE_PREDICATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
			}
			return NIL;
		}
	}

	public static SubLObject set_abstract_lexicon_default_exclude_predicates(final SubLObject v_abstract_lexicon, final SubLObject value) {
		final SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? classes.classes_retrieve_class(v_abstract_lexicon) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? v_abstract_lexicon : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_EXCLUDE_PREDICATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
		}
		return NIL;
	}

	public static final SubLObject get_abstract_lexicon_default_exclude_mts_alt(SubLObject v_abstract_lexicon) {
		{
			SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_abstract_lexicon))) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? ((SubLObject) (v_abstract_lexicon)) : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? ((SubLObject) (subloop_structures.instance_class(v_abstract_lexicon))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_EXCLUDE_MTS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
			}
			return NIL;
		}
	}

	public static SubLObject get_abstract_lexicon_default_exclude_mts(final SubLObject v_abstract_lexicon) {
		final SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? classes.classes_retrieve_class(v_abstract_lexicon) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? v_abstract_lexicon : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_EXCLUDE_MTS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
		}
		return NIL;
	}

	public static final SubLObject set_abstract_lexicon_default_exclude_mts_alt(SubLObject v_abstract_lexicon, SubLObject value) {
		{
			SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_abstract_lexicon))) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? ((SubLObject) (v_abstract_lexicon)) : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? ((SubLObject) (subloop_structures.instance_class(v_abstract_lexicon))) : NIL;
			if (NIL != v_class) {
				classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_EXCLUDE_MTS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
				return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
			}
			return NIL;
		}
	}

	public static SubLObject set_abstract_lexicon_default_exclude_mts(final SubLObject v_abstract_lexicon, final SubLObject value) {
		final SubLObject v_class = (v_abstract_lexicon.isSymbol()) ? classes.classes_retrieve_class(v_abstract_lexicon) : NIL != subloop_structures.class_p(v_abstract_lexicon) ? v_abstract_lexicon : NIL != subloop_structures.instance_p(v_abstract_lexicon) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL;
		if (NIL != v_class) {
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc(DEFAULT_EXCLUDE_MTS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
		}
		return NIL;
	}

	public static final SubLObject subloop_reserved_initialize_abstract_lexicon_class_alt(SubLObject new_instance) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
			classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list_alt189);
			classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
			classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const190$AllGeneralEnglishValidatedLexical);
			classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
			return NIL;
		}
	}

	public static SubLObject subloop_reserved_initialize_abstract_lexicon_class(final SubLObject new_instance) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list195);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const196$AllGeneralEnglishValidatedLexical);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
		return NIL;
	}

	public static final SubLObject subloop_reserved_initialize_abstract_lexicon_instance_alt(SubLObject new_instance) {
		classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOWED_MTS, $UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_MTS, $UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, BASE_MT, $UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ROOT_MT, $UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_PREDS, $UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_POS_LIST, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, TRIE, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CACHE, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym176$IGNORE_CACHE_, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym174$ALLOW_FABRICATION_, T);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
		return NIL;
	}

	public static SubLObject subloop_reserved_initialize_abstract_lexicon_instance(final SubLObject new_instance) {
		classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
		classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOWED_MTS, $UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_MTS, $UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, BASE_MT, $UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ROOT_MT, $UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_PREDS, $UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_POS_LIST, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, TRIE, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CACHE, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym182$IGNORE_CACHE_, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym180$ALLOW_FABRICATION_, T);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
		classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
		return NIL;
	}

	public static final SubLObject abstract_lexicon_p_alt(SubLObject v_abstract_lexicon) {
		return classes.subloop_instanceof_class(v_abstract_lexicon, ABSTRACT_LEXICON);
	}

	public static SubLObject abstract_lexicon_p(final SubLObject v_abstract_lexicon) {
		return classes.subloop_instanceof_class(v_abstract_lexicon, ABSTRACT_LEXICON);
	}

	/**
	 *
	 *
	 * @return lexicon-p; a newly created lexicon
	 */
	@LispMethod(comment = "@return lexicon-p; a newly created lexicon")
	public static final SubLObject abstract_lexicon_initialize_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject learned = get_abstract_lexicon_learned(self);
			SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
			SubLObject v_cache = get_abstract_lexicon_cache(self);
			SubLObject trie = get_abstract_lexicon_trie(self);
			try {
				try {
					object.object_initialize_method(self);
					trie = nl_trie.get_nl_trie();
					v_cache = cache.new_cache($int$2000, EQUAL);
					case_sensitivity = $ON;
					ensure_cyc_to_penn_map();
					methods.funcall_instance_method_with_0_args(self, INITIALIZE_EXCLUDED_PREDS);
					methods.funcall_instance_method_with_0_args(self, INITIALIZE_ALLOWED_MTS);
					learned = NIL;
					sublisp_throw($sym196$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_learned(self, learned);
							set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
							set_abstract_lexicon_cache(self, v_cache);
							set_abstract_lexicon_trie(self, trie);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym196$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 *
	 *
	 * @return lexicon-p; a newly created lexicon
	 */
	@LispMethod(comment = "@return lexicon-p; a newly created lexicon")
	public static SubLObject abstract_lexicon_initialize_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject learned = get_abstract_lexicon_learned(self);
		SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		SubLObject v_cache = get_abstract_lexicon_cache(self);
		SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				object.object_initialize_method(self);
				trie = nl_trie.get_nl_trie();
				v_cache = cache.new_cache($int$2000, EQUAL);
				case_sensitivity = $ON;
				ensure_cyc_to_penn_map();
				methods.funcall_instance_method_with_0_args(self, INITIALIZE_EXCLUDED_PREDS);
				methods.funcall_instance_method_with_0_args(self, INITIALIZE_ALLOWED_MTS);
				learned = NIL;
				sublisp_throw($sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_learned(self, learned);
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * Finalizes this lexicon
	 */
	@LispMethod(comment = "Finalizes this lexicon")
	public static final SubLObject abstract_lexicon_isolate_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject v_cache = get_abstract_lexicon_cache(self);
			try {
				try {
					v_cache = NIL;
					object.object_isolate_method(self);
					sublisp_throw($sym204$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_cache(self, v_cache);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym204$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * Finalizes this lexicon
	 */
	@LispMethod(comment = "Finalizes this lexicon")
	public static SubLObject abstract_lexicon_isolate_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject v_cache = get_abstract_lexicon_cache(self);
		try {
			thread.throwStack.push($sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				v_cache = NIL;
				object.object_isolate_method(self);
				sublisp_throw($sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_cache(self, v_cache);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_ignore_cache_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
			try {
				try {
					ignore_cacheP = T;
					sublisp_throw($sym208$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym208$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_ignore_cache_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
		try {
			thread.throwStack.push($sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				ignore_cacheP = T;
				sublisp_throw($sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_ignore_cacheP_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
			try {
				try {
					sublisp_throw($sym211$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, instances.get_slot(self, $sym176$IGNORE_CACHE_));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym211$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_ignore_cacheP_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
		try {
			thread.throwStack.push($sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, instances.get_slot(self, $sym182$IGNORE_CACHE_));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_allow_stemming_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject allow_stemming = get_abstract_lexicon_allow_stemming(self);
			try {
				try {
					allow_stemming = T;
					sublisp_throw($sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_allow_stemming(self, allow_stemming);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_allow_stemming_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject allow_stemming = get_abstract_lexicon_allow_stemming(self);
		try {
			thread.throwStack.push($sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				allow_stemming = T;
				sublisp_throw($sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_allow_stemming(self, allow_stemming);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_forbid_stemming_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject allow_stemming = get_abstract_lexicon_allow_stemming(self);
			try {
				try {
					allow_stemming = NIL;
					sublisp_throw($sym218$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_allow_stemming(self, allow_stemming);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym218$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_forbid_stemming_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject allow_stemming = get_abstract_lexicon_allow_stemming(self);
		try {
			thread.throwStack.push($sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				allow_stemming = NIL;
				sublisp_throw($sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_allow_stemming(self, allow_stemming);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_allow_fabrication_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
			try {
				try {
					allow_fabricationP = T;
					sublisp_throw($sym222$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym222$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_allow_fabrication_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
		try {
			thread.throwStack.push($sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				allow_fabricationP = T;
				sublisp_throw($sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_forbid_fabrication_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
			try {
				try {
					allow_fabricationP = NIL;
					sublisp_throw($sym226$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym226$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_forbid_fabrication_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
		try {
			thread.throwStack.push($sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				allow_fabricationP = NIL;
				sublisp_throw($sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_fabrication_forbiddenP_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
			try {
				try {
					sublisp_throw($sym230$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean(NIL == allow_fabricationP));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym230$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_fabrication_forbiddenP_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
		try {
			thread.throwStack.push($sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean(NIL == allow_fabricationP));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_fabrication_allowedP_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
			try {
				try {
					sublisp_throw($sym234$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, allow_fabricationP);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym234$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_fabrication_allowedP_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
		try {
			thread.throwStack.push($sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, allow_fabricationP);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * Returns t if LEX-ENTRY is a contextually valid nl-trie-entry, nil otherwise
	 * Lexicons derived from abstract-lexicon will typically override this method
	 */
	@LispMethod(comment = "Returns t if LEX-ENTRY is a contextually valid nl-trie-entry, nil otherwise\r\nLexicons derived from abstract-lexicon will typically override this method\nReturns t if LEX-ENTRY is a contextually valid nl-trie-entry, nil otherwise\nLexicons derived from abstract-lexicon will typically override this method")
	public static final SubLObject abstract_lexicon_valid_nl_trie_entryP_method_alt(SubLObject self, SubLObject nl_trie_entry) {
		if (NIL != methods.funcall_instance_method_with_1_args(self, STOP_WORD_P, nl_trie.nl_trie_entry_string(nl_trie_entry))) {
			return NIL;
		}
		return makeBoolean((((NIL != lex_entry_p(nl_trie_entry)) && (NIL != methods.funcall_instance_method_with_1_args(self, $sym241$ALLOWED_POS_, methods.funcall_instance_method_with_1_args(nl_trie_entry, GET, $CYC_POS))))
				|| ((((NIL != nl_trie.nl_trie_word_p(nl_trie_entry, UNPROVIDED)) && (NIL != member($$nameSpelling, nl_trie.nl_trie_word_pos_preds(nl_trie_entry), EQL, UNPROVIDED))) && (NIL != methods.funcall_instance_method_with_1_args(self, $sym243$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, nl_trie_entry)))
						&& (NIL != methods.funcall_instance_method_with_1_args(self, $sym244$ALLOWED_MT_, nl_trie.nl_trie_entry_semantic_mt(nl_trie_entry)))))
				|| ((((NIL != valid_denotsP(nl_trie_entry)) && (NIL != methods.funcall_instance_method_with_1_args(self, $sym243$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, nl_trie_entry))) && (NIL != methods.funcall_instance_method_with_1_args(self, $sym245$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, nl_trie_entry)))
						&& (NIL != methods.funcall_instance_method_with_1_args(self, $sym244$ALLOWED_MT_, nl_trie.nl_trie_entry_semantic_mt(nl_trie_entry)))));
	}

	/**
	 * Returns t if LEX-ENTRY is a contextually valid nl-trie-entry, nil otherwise
	 * Lexicons derived from abstract-lexicon will typically override this method
	 */
	@LispMethod(comment = "Returns t if LEX-ENTRY is a contextually valid nl-trie-entry, nil otherwise\r\nLexicons derived from abstract-lexicon will typically override this method\nReturns t if LEX-ENTRY is a contextually valid nl-trie-entry, nil otherwise\nLexicons derived from abstract-lexicon will typically override this method")
	public static SubLObject abstract_lexicon_valid_nl_trie_entryP_method(final SubLObject self, final SubLObject nl_trie_entry) {
		if (NIL != methods.funcall_instance_method_with_1_args(self, STOP_WORD_P, nl_trie.nl_trie_entry_string(nl_trie_entry))) {
			return NIL;
		}
		return makeBoolean((((NIL != lex_entry_p(nl_trie_entry)) && (NIL != methods.funcall_instance_method_with_1_args(self, $sym247$ALLOWED_POS_, methods.funcall_instance_method_with_1_args(nl_trie_entry, GET, $CYC_POS))))
				|| ((((NIL != nl_trie.nl_trie_word_p(nl_trie_entry, UNPROVIDED)) && (NIL != member($$nameSpelling, nl_trie.nl_trie_word_pos_preds(nl_trie_entry), EQL, UNPROVIDED))) && (NIL != methods.funcall_instance_method_with_1_args(self, $sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, nl_trie_entry)))
						&& (NIL != methods.funcall_instance_method_with_1_args(self, $sym250$ALLOWED_MT_, nl_trie.nl_trie_entry_semantic_mt(nl_trie_entry)))))
				|| ((((NIL != valid_denotsP(nl_trie_entry)) && (NIL != methods.funcall_instance_method_with_1_args(self, $sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, nl_trie_entry))) && (NIL != methods.funcall_instance_method_with_1_args(self, $sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, nl_trie_entry)))
						&& (NIL != methods.funcall_instance_method_with_1_args(self, $sym250$ALLOWED_MT_, nl_trie.nl_trie_entry_semantic_mt(nl_trie_entry)))));
	}

	/**
	 * Used for setting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred
	 */
	@LispMethod(comment = "Used for setting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred")
	public static final SubLObject abstract_lexicon_set_case_sensitivity_method_alt(SubLObject self, SubLObject keyword) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
			try {
				try {
					case_sensitivity = keyword;
					sublisp_throw($sym250$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym250$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * Used for setting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred
	 */
	@LispMethod(comment = "Used for setting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred")
	public static SubLObject abstract_lexicon_set_case_sensitivity_method(final SubLObject self, final SubLObject keyword) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		try {
			thread.throwStack.push($sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				case_sensitivity = keyword;
				sublisp_throw($sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * Used for getting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred
	 */
	@LispMethod(comment = "Used for getting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred")
	public static final SubLObject abstract_lexicon_get_case_sensitivity_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
			try {
				try {
					sublisp_throw($sym254$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, case_sensitivity);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym254$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * Used for getting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred
	 */
	@LispMethod(comment = "Used for getting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred")
	public static SubLObject abstract_lexicon_get_case_sensitivity_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		try {
			thread.throwStack.push($sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, case_sensitivity);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * exclude assertions using the predicates in PREDS-TO-EXCLUDE from use by this lexicon.
	 * If PREDS-TO-EXCLUDE is :default,
	 * all preds in the class variable DEFAULT-EXCLUDE-PREDS will be excluded
	 */
	@LispMethod(comment = "exclude assertions using the predicates in PREDS-TO-EXCLUDE from use by this lexicon.\r\nIf PREDS-TO-EXCLUDE is :default,\r\nall preds in the class variable DEFAULT-EXCLUDE-PREDS will be excluded\nexclude assertions using the predicates in PREDS-TO-EXCLUDE from use by this lexicon.\nIf PREDS-TO-EXCLUDE is :default,\nall preds in the class variable DEFAULT-EXCLUDE-PREDS will be excluded")
	public static final SubLObject abstract_lexicon_initialize_excluded_preds_method_alt(SubLObject self, SubLObject preds_to_exclude) {
		if (preds_to_exclude == UNPROVIDED) {
			preds_to_exclude = $DEFAULT;
		}
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject default_exclude_predicates = get_abstract_lexicon_default_exclude_predicates(self);
			SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
			try {
				try {
					if (preds_to_exclude == $DEFAULT) {
						excluded_preds = default_exclude_predicates;
					} else {
						excluded_preds = preds_to_exclude;
					}
					sublisp_throw($sym259$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_default_exclude_predicates(self, default_exclude_predicates);
							set_abstract_lexicon_excluded_preds(self, excluded_preds);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym259$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * exclude assertions using the predicates in PREDS-TO-EXCLUDE from use by this lexicon.
	 * If PREDS-TO-EXCLUDE is :default,
	 * all preds in the class variable DEFAULT-EXCLUDE-PREDS will be excluded
	 */
	@LispMethod(comment = "exclude assertions using the predicates in PREDS-TO-EXCLUDE from use by this lexicon.\r\nIf PREDS-TO-EXCLUDE is :default,\r\nall preds in the class variable DEFAULT-EXCLUDE-PREDS will be excluded\nexclude assertions using the predicates in PREDS-TO-EXCLUDE from use by this lexicon.\nIf PREDS-TO-EXCLUDE is :default,\nall preds in the class variable DEFAULT-EXCLUDE-PREDS will be excluded")
	public static SubLObject abstract_lexicon_initialize_excluded_preds_method(final SubLObject self, SubLObject preds_to_exclude) {
		if (preds_to_exclude == UNPROVIDED) {
			preds_to_exclude = $DEFAULT;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject default_exclude_predicates = get_abstract_lexicon_default_exclude_predicates(self);
		SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try {
			thread.throwStack.push($sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				if (preds_to_exclude == $DEFAULT) {
					excluded_preds = default_exclude_predicates;
				} else {
					excluded_preds = preds_to_exclude;
				}
				sublisp_throw($sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_default_exclude_predicates(self, default_exclude_predicates);
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * allow POS-PRED to be used by this lexicon for lexical lookup
	 */
	@LispMethod(comment = "allow POS-PRED to be used by this lexicon for lexical lookup")
	public static final SubLObject abstract_lexicon_allow_predicate_method_alt(SubLObject self, SubLObject pos_pred) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
			try {
				try {
					excluded_preds = remove(pos_pred, excluded_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					sublisp_throw($sym264$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_excluded_preds(self, excluded_preds);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym264$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * allow POS-PRED to be used by this lexicon for lexical lookup
	 */
	@LispMethod(comment = "allow POS-PRED to be used by this lexicon for lexical lookup")
	public static SubLObject abstract_lexicon_allow_predicate_method(final SubLObject self, final SubLObject pos_pred) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try {
			thread.throwStack.push($sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				excluded_preds = remove(pos_pred, excluded_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				sublisp_throw($sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * do not allow POS-PRED to be used by this lexicon for lexical lookup
	 */
	@LispMethod(comment = "do not allow POS-PRED to be used by this lexicon for lexical lookup")
	public static final SubLObject abstract_lexicon_exclude_predicate_method_alt(SubLObject self, SubLObject pos_pred) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
			try {
				try {
					{
						SubLObject item_var = pos_pred;
						if (NIL == member(item_var, excluded_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
							excluded_preds = cons(item_var, excluded_preds);
						}
						sublisp_throw($sym268$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_excluded_preds(self, excluded_preds);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym268$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * do not allow POS-PRED to be used by this lexicon for lexical lookup
	 */
	@LispMethod(comment = "do not allow POS-PRED to be used by this lexicon for lexical lookup")
	public static SubLObject abstract_lexicon_exclude_predicate_method(final SubLObject self, final SubLObject pos_pred) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try {
			thread.throwStack.push($sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				if (NIL == member(pos_pred, excluded_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
					excluded_preds = cons(pos_pred, excluded_preds);
				}
				sublisp_throw($sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * is POS-PRED a predicate that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "is POS-PRED a predicate that can not be used in from this lexicon?")
	public static final SubLObject abstract_lexicon_excluded_predicateP_method_alt(SubLObject self, SubLObject pos_pred) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
			try {
				try {
					sublisp_throw($sym272$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, member(pos_pred, excluded_preds, UNPROVIDED, UNPROVIDED));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_excluded_preds(self, excluded_preds);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym272$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * is POS-PRED a predicate that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "is POS-PRED a predicate that can not be used in from this lexicon?")
	public static SubLObject abstract_lexicon_excluded_predicateP_method(final SubLObject self, final SubLObject pos_pred) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try {
			thread.throwStack.push($sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, member(pos_pred, excluded_preds, UNPROVIDED, UNPROVIDED));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * is POS-PRED a predicate that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "is POS-PRED a predicate that can not be used in from this lexicon?")
	public static final SubLObject abstract_lexicon_allowed_predicateP_method_alt(SubLObject self, SubLObject pos_pred) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
			try {
				try {
					sublisp_throw($sym276$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean(NIL == subl_promotions.memberP(pos_pred, excluded_preds, UNPROVIDED, UNPROVIDED)));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_excluded_preds(self, excluded_preds);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym276$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * is POS-PRED a predicate that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "is POS-PRED a predicate that can not be used in from this lexicon?")
	public static SubLObject abstract_lexicon_allowed_predicateP_method(final SubLObject self, final SubLObject pos_pred) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try {
			thread.throwStack.push($sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean(NIL == subl_promotions.memberP(pos_pred, excluded_preds, UNPROVIDED, UNPROVIDED)));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * is POS-PRED of NL-TRIE-ENTRY a predicate that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "is POS-PRED of NL-TRIE-ENTRY a predicate that can not be used in from this lexicon?")
	public static final SubLObject abstract_lexicon_nl_trie_entry_has_allowed_predicateP_method_alt(SubLObject self, SubLObject nl_trie_entry) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
			try {
				try {
					sublisp_throw($sym279$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean((NIL == excluded_preds) || (NIL == subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, UNPROVIDED), excluded_preds, UNPROVIDED, UNPROVIDED))));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_excluded_preds(self, excluded_preds);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym279$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * is POS-PRED of NL-TRIE-ENTRY a predicate that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "is POS-PRED of NL-TRIE-ENTRY a predicate that can not be used in from this lexicon?")
	public static SubLObject abstract_lexicon_nl_trie_entry_has_allowed_predicateP_method(final SubLObject self, final SubLObject nl_trie_entry) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try {
			thread.throwStack.push($sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean((NIL == excluded_preds) || (NIL == subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, UNPROVIDED), excluded_preds, UNPROVIDED, UNPROVIDED))));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * allow POS to be used by this lexicon for lexical lookup
	 */
	@LispMethod(comment = "allow POS to be used by this lexicon for lexical lookup")
	public static final SubLObject abstract_lexicon_allow_pos_method_alt(SubLObject self, SubLObject pos) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
			try {
				try {
					excluded_pos_list = remove(pos, excluded_pos_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					sublisp_throw($sym284$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym284$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * allow POS to be used by this lexicon for lexical lookup
	 */
	@LispMethod(comment = "allow POS to be used by this lexicon for lexical lookup")
	public static SubLObject abstract_lexicon_allow_pos_method(final SubLObject self, final SubLObject pos) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		try {
			thread.throwStack.push($sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				excluded_pos_list = remove(pos, excluded_pos_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				sublisp_throw($sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * do not allow POS to be used by this lexicon for lexical lookup
	 */
	@LispMethod(comment = "do not allow POS to be used by this lexicon for lexical lookup")
	public static final SubLObject abstract_lexicon_exclude_pos_method_alt(SubLObject self, SubLObject pos) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
			try {
				try {
					{
						SubLObject item_var = pos;
						if (NIL == member(item_var, excluded_pos_list, symbol_function(EQL), symbol_function(IDENTITY))) {
							excluded_pos_list = cons(item_var, excluded_pos_list);
						}
						sublisp_throw($sym288$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym288$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * do not allow POS to be used by this lexicon for lexical lookup
	 */
	@LispMethod(comment = "do not allow POS to be used by this lexicon for lexical lookup")
	public static SubLObject abstract_lexicon_exclude_pos_method(final SubLObject self, final SubLObject pos) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		try {
			thread.throwStack.push($sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				if (NIL == member(pos, excluded_pos_list, symbol_function(EQL), symbol_function(IDENTITY))) {
					excluded_pos_list = cons(pos, excluded_pos_list);
				}
				sublisp_throw($sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * is POS a part of speech that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "is POS a part of speech that can not be used in from this lexicon?")
	public static final SubLObject abstract_lexicon_excluded_posP_method_alt(SubLObject self, SubLObject pos) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
			try {
				try {
					sublisp_throw($sym292$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexicon_accessors.genl_pos_memberP(pos, excluded_pos_list));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym292$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * is POS a part of speech that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "is POS a part of speech that can not be used in from this lexicon?")
	public static SubLObject abstract_lexicon_excluded_posP_method(final SubLObject self, final SubLObject pos) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		try {
			thread.throwStack.push($sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexicon_accessors.genl_pos_memberP(pos, excluded_pos_list));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * is POS a part of speech that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "is POS a part of speech that can not be used in from this lexicon?")
	public static final SubLObject abstract_lexicon_allowed_posP_method_alt(SubLObject self, SubLObject pos) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
			try {
				try {
					sublisp_throw($sym295$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean(NIL == lexicon_accessors.genl_pos_memberP(pos, excluded_pos_list)));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym295$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * is POS a part of speech that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "is POS a part of speech that can not be used in from this lexicon?")
	public static SubLObject abstract_lexicon_allowed_posP_method(final SubLObject self, final SubLObject pos) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		try {
			thread.throwStack.push($sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean(NIL == lexicon_accessors.genl_pos_memberP(pos, excluded_pos_list)));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * does NL-TRIE-ENTRY have a part of speech that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "does NL-TRIE-ENTRY have a part of speech that can not be used in from this lexicon?")
	public static final SubLObject abstract_lexicon_nl_trie_entry_has_allowed_posP_method_alt(SubLObject self, SubLObject nl_trie_entry) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
			try {
				try {
					sublisp_throw($sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean((NIL == excluded_pos_list) || (NIL == lexicon_accessors.genl_pos_memberP(nl_trie.nl_trie_entry_pos(nl_trie_entry), excluded_pos_list))));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * does NL-TRIE-ENTRY have a part of speech that can not be used in from this lexicon?
	 */
	@LispMethod(comment = "does NL-TRIE-ENTRY have a part of speech that can not be used in from this lexicon?")
	public static SubLObject abstract_lexicon_nl_trie_entry_has_allowed_posP_method(final SubLObject self, final SubLObject nl_trie_entry) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		try {
			thread.throwStack.push($sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean((NIL == excluded_pos_list) || (NIL == lexicon_accessors.genl_pos_memberP(nl_trie.nl_trie_entry_pos(nl_trie_entry), excluded_pos_list))));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * add LEARNER (a method-name) as a learner to lexicon
	 */
	@LispMethod(comment = "add LEARNER (a method-name) as a learner to lexicon")
	public static final SubLObject abstract_lexicon_add_learner_method_alt(SubLObject self, SubLObject learner) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject active_learners = get_abstract_lexicon_active_learners(self);
			try {
				try {
					{
						SubLObject item_var = learner;
						if (NIL == member(item_var, active_learners, symbol_function(EQL), symbol_function(IDENTITY))) {
							active_learners = cons(item_var, active_learners);
						}
						sublisp_throw($sym303$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_active_learners(self, active_learners);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym303$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * add LEARNER (a method-name) as a learner to lexicon
	 */
	@LispMethod(comment = "add LEARNER (a method-name) as a learner to lexicon")
	public static SubLObject abstract_lexicon_add_learner_method(final SubLObject self, final SubLObject learner) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		try {
			thread.throwStack.push($sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				if (NIL == member(learner, active_learners, symbol_function(EQL), symbol_function(IDENTITY))) {
					active_learners = cons(learner, active_learners);
				}
				sublisp_throw($sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * remove LEARNER (a method-name) as a learner for this lexicon
	 */
	@LispMethod(comment = "remove LEARNER (a method-name) as a learner for this lexicon")
	public static final SubLObject abstract_lexicon_remove_learner_method_alt(SubLObject self, SubLObject learner) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject active_learners = get_abstract_lexicon_active_learners(self);
			try {
				try {
					active_learners = remove(learner, active_learners, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					sublisp_throw($sym307$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_active_learners(self, active_learners);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym307$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * remove LEARNER (a method-name) as a learner for this lexicon
	 */
	@LispMethod(comment = "remove LEARNER (a method-name) as a learner for this lexicon")
	public static SubLObject abstract_lexicon_remove_learner_method(final SubLObject self, final SubLObject learner) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		try {
			thread.throwStack.push($sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				active_learners = remove(learner, active_learners, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				sublisp_throw($sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_get_learners_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject active_learners = get_abstract_lexicon_active_learners(self);
			try {
				try {
					sublisp_throw($sym311$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, active_learners);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_active_learners(self, active_learners);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym311$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_get_learners_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		try {
			thread.throwStack.push($sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, active_learners);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * set learners for lexicon to be all and only those learners specified in LEARNERS
	 */
	@LispMethod(comment = "set learners for lexicon to be all and only those learners specified in LEARNERS")
	public static final SubLObject abstract_lexicon_set_learners_method_alt(SubLObject self, SubLObject learners) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject active_learners = get_abstract_lexicon_active_learners(self);
			try {
				try {
					active_learners = learners;
					sublisp_throw($sym316$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_active_learners(self, active_learners);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym316$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * set learners for lexicon to be all and only those learners specified in LEARNERS
	 */
	@LispMethod(comment = "set learners for lexicon to be all and only those learners specified in LEARNERS")
	public static SubLObject abstract_lexicon_set_learners_method(final SubLObject self, final SubLObject learners) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		try {
			thread.throwStack.push($sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				active_learners = learners;
				sublisp_throw($sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * allow all mts visible from BASE-MT to be used by this lexicon.  If the value is :default, the value of the class variable DEFAULT-BASE-MT will be
	 * used, and all mts in the class variable DEFAULT-EXCLUDED-MTS will be removed
	 */
	@LispMethod(comment = "allow all mts visible from BASE-MT to be used by this lexicon.  If the value is :default, the value of the class variable DEFAULT-BASE-MT will be\r\nused, and all mts in the class variable DEFAULT-EXCLUDED-MTS will be removed\nallow all mts visible from BASE-MT to be used by this lexicon.  If the value is :default, the value of the class variable DEFAULT-BASE-MT will be\nused, and all mts in the class variable DEFAULT-EXCLUDED-MTS will be removed")
	public static final SubLObject abstract_lexicon_initialize_allowed_mts_method_alt(SubLObject self, SubLObject kb_spec) {
		if (kb_spec == UNPROVIDED) {
			kb_spec = $DEFAULT;
		}
		{
			SubLObject default_base_mt = get_abstract_lexicon_default_base_mt(self);
			SubLObject default_exclude_mts = get_abstract_lexicon_default_exclude_mts(self);
			SubLObject base_mt = get_abstract_lexicon_base_mt(self);
			SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
			SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
			allowed_mts = set.new_set(symbol_function(EQUAL), UNPROVIDED);
			set_abstract_lexicon_allowed_mts(self, allowed_mts);
			excluded_mts = set_utilities.construct_set_from_list(default_exclude_mts, symbol_function(EQUAL), UNPROVIDED);
			set_abstract_lexicon_excluded_mts(self, excluded_mts);
			if ($DEFAULT != kb_spec) {
				{
					SubLObject base_mts = ask_utilities.query_variable($sym321$_MT, listS($$defaultBaseLexicalMt, kb_spec, $list_alt323), $$InferencePSC, $list_alt325);
					SubLObject spec_allowed_mts = ask_utilities.query_variable($sym321$_MT, listS($$allowedLexicalMt, kb_spec, $list_alt323), $$InferencePSC, $list_alt325);
					SubLObject spec_disallowed_mts = ask_utilities.query_variable($sym321$_MT, listS($$disallowedLexicalMt, kb_spec, $list_alt323), $$InferencePSC, $list_alt325);
					if (NIL != list_utilities.singletonP(base_mts)) {
						instances.set_slot(self, BASE_MT, copy_expression(list_utilities.only_one(base_mts)));
					} else {
						if (NIL != list_utilities.empty_list_p(base_mts)) {
							instances.set_slot(self, BASE_MT, copy_expression(instances.get_slot(self, DEFAULT_BASE_MT)));
						} else {
							base_mt = copy_expression(hlmt_czer.canonicalize_hlmt(make_el_formula($$MtUnionFn, base_mts, UNPROVIDED)));
							set_abstract_lexicon_base_mt(self, base_mt);
						}
					}
					{
						SubLObject cdolist_list_var = spec_allowed_mts;
						SubLObject mt = NIL;
						for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), mt = cdolist_list_var.first()) {
							methods.funcall_instance_method_with_1_args(self, ALLOW_MT, mt);
						}
					}
					{
						SubLObject cdolist_list_var = spec_disallowed_mts;
						SubLObject mt = NIL;
						for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), mt = cdolist_list_var.first()) {
							methods.funcall_instance_method_with_1_args(self, FORBID_MT, mt);
						}
					}
				}
			}
			return self;
		}
	}

	/**
	 * allow all mts visible from BASE-MT to be used by this lexicon.  If the value is :default, the value of the class variable DEFAULT-BASE-MT will be
	 * used, and all mts in the class variable DEFAULT-EXCLUDED-MTS will be removed
	 */
	@LispMethod(comment = "allow all mts visible from BASE-MT to be used by this lexicon.  If the value is :default, the value of the class variable DEFAULT-BASE-MT will be\r\nused, and all mts in the class variable DEFAULT-EXCLUDED-MTS will be removed\nallow all mts visible from BASE-MT to be used by this lexicon.  If the value is :default, the value of the class variable DEFAULT-BASE-MT will be\nused, and all mts in the class variable DEFAULT-EXCLUDED-MTS will be removed")
	public static SubLObject abstract_lexicon_initialize_allowed_mts_method(final SubLObject self, SubLObject kb_spec) {
		if (kb_spec == UNPROVIDED) {
			kb_spec = $DEFAULT;
		}
		final SubLObject default_base_mt = get_abstract_lexicon_default_base_mt(self);
		final SubLObject default_exclude_mts = get_abstract_lexicon_default_exclude_mts(self);
		SubLObject base_mt = get_abstract_lexicon_base_mt(self);
		SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		allowed_mts = set.new_set(symbol_function(EQUAL), UNPROVIDED);
		set_abstract_lexicon_allowed_mts(self, allowed_mts);
		excluded_mts = set_utilities.construct_set_from_list(default_exclude_mts, symbol_function(EQUAL), UNPROVIDED);
		set_abstract_lexicon_excluded_mts(self, excluded_mts);
		if ($DEFAULT != kb_spec) {
			final SubLObject base_mts = ask_utilities.query_variable($sym327$_MT, listS($$defaultBaseLexicalMt, kb_spec, $list329), $$InferencePSC, $list331);
			final SubLObject spec_allowed_mts = ask_utilities.query_variable($sym327$_MT, listS($$allowedLexicalMt, kb_spec, $list329), $$InferencePSC, $list331);
			final SubLObject spec_disallowed_mts = ask_utilities.query_variable($sym327$_MT, listS($$disallowedLexicalMt, kb_spec, $list329), $$InferencePSC, $list331);
			if (NIL != list_utilities.singletonP(base_mts)) {
				instances.set_slot(self, BASE_MT, copy_expression(list_utilities.only_one(base_mts)));
			} else if (NIL != list_utilities.empty_list_p(base_mts)) {
				instances.set_slot(self, BASE_MT, copy_expression(instances.get_slot(self, DEFAULT_BASE_MT)));
			} else {
				base_mt = copy_expression(hlmt_czer.canonicalize_hlmt(make_el_formula($$MtUnionFn, base_mts, UNPROVIDED)));
				set_abstract_lexicon_base_mt(self, base_mt);
			}

			SubLObject cdolist_list_var = spec_allowed_mts;
			SubLObject mt = NIL;
			mt = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				methods.funcall_instance_method_with_1_args(self, ALLOW_MT, mt);
				cdolist_list_var = cdolist_list_var.rest();
				mt = cdolist_list_var.first();
			}
			cdolist_list_var = spec_disallowed_mts;
			mt = NIL;
			mt = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				methods.funcall_instance_method_with_1_args(self, FORBID_MT, mt);
				cdolist_list_var = cdolist_list_var.rest();
				mt = cdolist_list_var.first();
			}
		}
		return self;
	}

	/**
	 * base-mt represents the standard mt-reasoning-based Mt for this lexicon. Using allow-mt and forbid-mt allow
	 * for minor tweaks to the base-mt, but in general, this is the Mt for this lexicon
	 *
	 * @unknown that this method will override any excluded-mts if they are visible from the newly-set base-mt
	 */
	@LispMethod(comment = "base-mt represents the standard mt-reasoning-based Mt for this lexicon. Using allow-mt and forbid-mt allow\r\nfor minor tweaks to the base-mt, but in general, this is the Mt for this lexicon\r\n\r\n@unknown that this method will override any excluded-mts if they are visible from the newly-set base-mt\nbase-mt represents the standard mt-reasoning-based Mt for this lexicon. Using allow-mt and forbid-mt allow\nfor minor tweaks to the base-mt, but in general, this is the Mt for this lexicon")
	public static final SubLObject abstract_lexicon_set_base_mt_method_alt(SubLObject self, SubLObject mt) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject base_mt = get_abstract_lexicon_base_mt(self);
			SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
			try {
				try {
					base_mt = copy_expression(mt);
					{
						SubLObject set_contents_var = set.do_set_internal(excluded_mts);
						SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
						SubLObject state = NIL;
						for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
							{
								SubLObject excluded_mt = set_contents.do_set_contents_next(basis_object, state);
								if (NIL != set_contents.do_set_contents_element_validP(state, excluded_mt)) {
									if (NIL != lexicon_accessors.genl_lexicon_mtP(mt, excluded_mt)) {
										methods.funcall_instance_method_with_1_args(self, ALLOW_MT, excluded_mt);
									}
								}
							}
						}
					}
					sublisp_throw($sym335$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_base_mt(self, base_mt);
							set_abstract_lexicon_excluded_mts(self, excluded_mts);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym335$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * base-mt represents the standard mt-reasoning-based Mt for this lexicon. Using allow-mt and forbid-mt allow
	 * for minor tweaks to the base-mt, but in general, this is the Mt for this lexicon
	 *
	 * @unknown that this method will override any excluded-mts if they are visible from the newly-set base-mt
	 */
	@LispMethod(comment = "base-mt represents the standard mt-reasoning-based Mt for this lexicon. Using allow-mt and forbid-mt allow\r\nfor minor tweaks to the base-mt, but in general, this is the Mt for this lexicon\r\n\r\n@unknown that this method will override any excluded-mts if they are visible from the newly-set base-mt\nbase-mt represents the standard mt-reasoning-based Mt for this lexicon. Using allow-mt and forbid-mt allow\nfor minor tweaks to the base-mt, but in general, this is the Mt for this lexicon")
	public static SubLObject abstract_lexicon_set_base_mt_method(final SubLObject self, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject base_mt = get_abstract_lexicon_base_mt(self);
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		try {
			thread.throwStack.push($sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				base_mt = copy_expression(mt);
				final SubLObject set_contents_var = set.do_set_internal(excluded_mts);
				SubLObject basis_object;
				SubLObject state;
				SubLObject excluded_mt;
				for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
					excluded_mt = set_contents.do_set_contents_next(basis_object, state);
					if ((NIL != set_contents.do_set_contents_element_validP(state, excluded_mt)) && (NIL != lexicon_accessors.genl_lexicon_mtP(mt, excluded_mt))) {
						methods.funcall_instance_method_with_1_args(self, ALLOW_MT, excluded_mt);
					}
				}
				sublisp_throw($sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_base_mt(self, base_mt);
					set_abstract_lexicon_excluded_mts(self, excluded_mts);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_get_base_mt_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject default_base_mt = get_abstract_lexicon_default_base_mt(self);
			SubLObject base_mt = get_abstract_lexicon_base_mt(self);
			try {
				try {
					if (NIL != misc_utilities.initialized_p(base_mt)) {
						sublisp_throw($sym339$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, base_mt);
					}
					base_mt = default_base_mt;
					sublisp_throw($sym339$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, default_base_mt);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_default_base_mt(self, default_base_mt);
							set_abstract_lexicon_base_mt(self, base_mt);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym339$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_get_base_mt_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject default_base_mt = get_abstract_lexicon_default_base_mt(self);
		SubLObject base_mt = get_abstract_lexicon_base_mt(self);
		try {
			thread.throwStack.push($sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				if (NIL != misc_utilities.initialized_p(base_mt)) {
					sublisp_throw($sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, base_mt);
				}
				base_mt = default_base_mt;
				sublisp_throw($sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, default_base_mt);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_default_base_mt(self, default_base_mt);
					set_abstract_lexicon_base_mt(self, base_mt);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 *
	 *
	 * @param MT
	 * 		possibly-hlmt-p; the mt to be allowed for retrieval of lex entries
	 */
	@LispMethod(comment = "@param MT\r\n\t\tpossibly-hlmt-p; the mt to be allowed for retrieval of lex entries")
	public static final SubLObject abstract_lexicon_allow_mt_method_alt(SubLObject self, SubLObject mt) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject root_mt = get_abstract_lexicon_root_mt(self);
			SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
			SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
			try {
				try {
					SubLTrampolineFile.checkType(mt, POSSIBLY_HLMT_P);
					set.set_add(mt, allowed_mts);
					set.set_remove(mt, excluded_mts);
					root_mt = $UNINITIALIZED;
					sublisp_throw($sym342$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_root_mt(self, root_mt);
							set_abstract_lexicon_excluded_mts(self, excluded_mts);
							set_abstract_lexicon_allowed_mts(self, allowed_mts);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym342$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 *
	 *
	 * @param MT
	 * 		possibly-hlmt-p; the mt to be allowed for retrieval of lex entries
	 */
	@LispMethod(comment = "@param MT\r\n\t\tpossibly-hlmt-p; the mt to be allowed for retrieval of lex entries")
	public static SubLObject abstract_lexicon_allow_mt_method(final SubLObject self, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject root_mt = get_abstract_lexicon_root_mt(self);
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		try {
			thread.throwStack.push($sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != hlmt.possibly_hlmt_p(mt) : "! hlmt.possibly_hlmt_p(mt) " + ("hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) ") + mt;
				set.set_add(mt, allowed_mts);
				set.set_remove(mt, excluded_mts);
				root_mt = $UNINITIALIZED;
				sublisp_throw($sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_root_mt(self, root_mt);
					set_abstract_lexicon_excluded_mts(self, excluded_mts);
					set_abstract_lexicon_allowed_mts(self, allowed_mts);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 *
	 *
	 * @param MT
	 * 		possibly-hlmt-p; the mt and all its genlMTs to be allowed for
	 * 		retrieval of lex entries
	 */
	@LispMethod(comment = "@param MT\r\n\t\tpossibly-hlmt-p; the mt and all its genlMTs to be allowed for\r\n\t\tretrieval of lex entries")
	public static final SubLObject abstract_lexicon_allow_genl_mts_method_alt(SubLObject self, SubLObject mt) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject root_mt = get_abstract_lexicon_root_mt(self);
			SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
			SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
			try {
				try {
					SubLTrampolineFile.checkType(mt, POSSIBLY_HLMT_P);
					set.set_add(mt, allowed_mts);
					set.set_remove(mt, excluded_mts);
					{
						SubLObject cdolist_list_var = ask_utilities.query_variable($sym348$_GENLMT, listS($$genlMt, mt, $list_alt350), UNPROVIDED, UNPROVIDED);
						SubLObject genl_mt = NIL;
						for (genl_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), genl_mt = cdolist_list_var.first()) {
							set.set_add(genl_mt, allowed_mts);
							set.set_remove(genl_mt, excluded_mts);
						}
					}
					root_mt = $UNINITIALIZED;
					sublisp_throw($sym347$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_root_mt(self, root_mt);
							set_abstract_lexicon_excluded_mts(self, excluded_mts);
							set_abstract_lexicon_allowed_mts(self, allowed_mts);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym347$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 *
	 *
	 * @param MT
	 * 		possibly-hlmt-p; the mt and all its genlMTs to be allowed for
	 * 		retrieval of lex entries
	 */
	@LispMethod(comment = "@param MT\r\n\t\tpossibly-hlmt-p; the mt and all its genlMTs to be allowed for\r\n\t\tretrieval of lex entries")
	public static SubLObject abstract_lexicon_allow_genl_mts_method(final SubLObject self, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject root_mt = get_abstract_lexicon_root_mt(self);
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		try {
			thread.throwStack.push($sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != hlmt.possibly_hlmt_p(mt) : "! hlmt.possibly_hlmt_p(mt) " + ("hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) ") + mt;
				set.set_add(mt, allowed_mts);
				set.set_remove(mt, excluded_mts);
				SubLObject cdolist_list_var = ask_utilities.query_variable($sym354$_GENLMT, listS($$genlMt, mt, $list356), UNPROVIDED, UNPROVIDED);
				SubLObject genl_mt = NIL;
				genl_mt = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					set.set_add(genl_mt, allowed_mts);
					set.set_remove(genl_mt, excluded_mts);
					cdolist_list_var = cdolist_list_var.rest();
					genl_mt = cdolist_list_var.first();
				}
				root_mt = $UNINITIALIZED;
				sublisp_throw($sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_root_mt(self, root_mt);
					set_abstract_lexicon_excluded_mts(self, excluded_mts);
					set_abstract_lexicon_allowed_mts(self, allowed_mts);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 *
	 *
	 * @param MT
	 * 		possibly-hlmt-p; the mt to be forbidden for retrieval of lex entries
	 */
	@LispMethod(comment = "@param MT\r\n\t\tpossibly-hlmt-p; the mt to be forbidden for retrieval of lex entries")
	public static final SubLObject abstract_lexicon_forbid_mt_method_alt(SubLObject self, SubLObject mt) {
		{
			SubLObject root_mt = get_abstract_lexicon_root_mt(self);
			SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
			SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
			SubLTrampolineFile.checkType(mt, POSSIBLY_HLMT_P);
			set.set_add(mt, excluded_mts);
			set.set_remove(mt, allowed_mts);
			root_mt = $UNINITIALIZED;
			set_abstract_lexicon_root_mt(self, root_mt);
			return self;
		}
	}

	/**
	 *
	 *
	 * @param MT
	 * 		possibly-hlmt-p; the mt to be forbidden for retrieval of lex entries
	 */
	@LispMethod(comment = "@param MT\r\n\t\tpossibly-hlmt-p; the mt to be forbidden for retrieval of lex entries")
	public static SubLObject abstract_lexicon_forbid_mt_method(final SubLObject self, final SubLObject mt) {
		SubLObject root_mt = get_abstract_lexicon_root_mt(self);
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		assert NIL != hlmt.possibly_hlmt_p(mt) : "! hlmt.possibly_hlmt_p(mt) " + ("hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) ") + mt;
		set.set_add(mt, excluded_mts);
		set.set_remove(mt, allowed_mts);
		root_mt = $UNINITIALIZED;
		set_abstract_lexicon_root_mt(self, root_mt);
		return self;
	}

	/**
	 *
	 *
	 * @param MT
	 * 		possibly-hlmt-p; are assertions in MT allowed in this lexicon?
	 */
	@LispMethod(comment = "@param MT\r\n\t\tpossibly-hlmt-p; are assertions in MT allowed in this lexicon?")
	public static final SubLObject abstract_lexicon_allowed_mtP_method_alt(SubLObject self, SubLObject mt) {
		{
			SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
			SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
			if (NIL == mt) {
				return NIL;
			}
			if (NIL != set.set_memberP(mt, allowed_mts)) {
				return T;
			} else {
				if (NIL != set.set_memberP(mt, excluded_mts)) {
					return NIL;
				} else {
					if (NIL == hlmt_p(methods.funcall_instance_method_with_0_args(self, GET_BASE_MT))) {
						methods.funcall_instance_method_with_1_args(self, FORBID_MT, mt);
						return NIL;
					} else {
						if (NIL != lexicon_accessors.genl_lexicon_mtP(methods.funcall_instance_method_with_0_args(self, GET_BASE_MT), mt)) {
							methods.funcall_instance_method_with_1_args(self, ALLOW_MT, mt);
							return T;
						} else {
							methods.funcall_instance_method_with_1_args(self, FORBID_MT, mt);
							return NIL;
						}
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @param MT
	 * 		possibly-hlmt-p; are assertions in MT allowed in this lexicon?
	 */
	@LispMethod(comment = "@param MT\r\n\t\tpossibly-hlmt-p; are assertions in MT allowed in this lexicon?")
	public static SubLObject abstract_lexicon_allowed_mtP_method(final SubLObject self, final SubLObject mt) {
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		if (NIL == mt) {
			return NIL;
		}
		if (NIL != set.set_memberP(mt, allowed_mts)) {
			return T;
		}
		if (NIL != set.set_memberP(mt, excluded_mts)) {
			return NIL;
		}
		if (NIL == hlmt.hlmt_p(methods.funcall_instance_method_with_0_args(self, GET_BASE_MT))) {
			methods.funcall_instance_method_with_1_args(self, FORBID_MT, mt);
			return NIL;
		}
		if (NIL != lexicon_accessors.genl_lexicon_mtP(methods.funcall_instance_method_with_0_args(self, GET_BASE_MT), mt)) {
			methods.funcall_instance_method_with_1_args(self, ALLOW_MT, mt);
			return T;
		}
		methods.funcall_instance_method_with_1_args(self, FORBID_MT, mt);
		return NIL;
	}

	/**
	 * return the one Mt that is the composition of all the allowed/disallowed mts, an MtUnionFn of all the Mts
	 */
	@LispMethod(comment = "return the one Mt that is the composition of all the allowed/disallowed mts, an MtUnionFn of all the Mts")
	public static final SubLObject abstract_lexicon_root_mt_method_alt(SubLObject self) {
		{
			SubLObject root_mt = get_abstract_lexicon_root_mt(self);
			SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
			if (NIL == misc_utilities.initialized_p(root_mt)) {
				{
					SubLObject this_allowed_mts = instances.get_slot(self, ALLOWED_MTS);
					SubLObject this_base_mt = methods.funcall_instance_method_with_0_args(self, GET_BASE_MT);
					SubLObject mts = (NIL != possibly_hlmt_p(this_base_mt)) ? ((SubLObject) (cons(this_base_mt, set.set_element_list(this_allowed_mts)))) : set.set_element_list(allowed_mts);
					SubLObject min_mts = genl_mts.min_mts(mts, UNPROVIDED);
					instances.set_slot(self, ROOT_MT, hlmt_czer.canonicalize_hlmt(make_el_formula($$MtUnionFn, min_mts, UNPROVIDED)));
				}
			}
			return root_mt;
		}
	}

	/**
	 * return the one Mt that is the composition of all the allowed/disallowed mts, an MtUnionFn of all the Mts
	 */
	@LispMethod(comment = "return the one Mt that is the composition of all the allowed/disallowed mts, an MtUnionFn of all the Mts")
	public static SubLObject abstract_lexicon_root_mt_method(final SubLObject self) {
		final SubLObject root_mt = get_abstract_lexicon_root_mt(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		if (NIL == misc_utilities.initialized_p(root_mt)) {
			final SubLObject this_allowed_mts = instances.get_slot(self, ALLOWED_MTS);
			final SubLObject this_base_mt = methods.funcall_instance_method_with_0_args(self, GET_BASE_MT);
			final SubLObject mts = (NIL != hlmt.possibly_hlmt_p(this_base_mt)) ? cons(this_base_mt, set.set_element_list(this_allowed_mts)) : set.set_element_list(allowed_mts);
			final SubLObject min_mts = genl_mts.min_mts(mts, UNPROVIDED);
			instances.set_slot(self, ROOT_MT, hlmt_czer.canonicalize_hlmt(make_el_formula($$MtUnionFn, min_mts, UNPROVIDED)));
		}
		return root_mt;
	}

	public static final SubLObject abstract_lexicon_add_stop_word_method_alt(SubLObject self, SubLObject string) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject stop_words = get_abstract_lexicon_stop_words(self);
			try {
				try {
					{
						SubLObject stop_word_set = stop_words;
						if (NIL == set.set_p(stop_word_set)) {
							stop_word_set = set.new_set(EQUAL, UNPROVIDED);
						}
						set.set_add(string, stop_word_set);
						stop_words = stop_word_set;
						sublisp_throw($sym362$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, stop_words);
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_stop_words(self, stop_words);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym362$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_add_stop_word_method(final SubLObject self, final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject stop_words = get_abstract_lexicon_stop_words(self);
		try {
			thread.throwStack.push($sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				SubLObject stop_word_set = stop_words;
				if (NIL == set.set_p(stop_word_set)) {
					stop_word_set = set.new_set(EQUAL, UNPROVIDED);
				}
				set.set_add(string, stop_word_set);
				stop_words = stop_word_set;
				sublisp_throw($sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, stop_words);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_stop_words(self, stop_words);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_stop_word_p_method_alt(SubLObject self, SubLObject string) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject stop_words = get_abstract_lexicon_stop_words(self);
			try {
				try {
					sublisp_throw($sym365$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean((NIL != stop_words) && (NIL != list_utilities.sublisp_boolean(set.set_memberP(string, stop_words)))));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_stop_words(self, stop_words);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym365$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_stop_word_p_method(final SubLObject self, final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject stop_words = get_abstract_lexicon_stop_words(self);
		try {
			thread.throwStack.push($sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, makeBoolean((NIL != stop_words) && (NIL != list_utilities.sublisp_boolean(set.set_memberP(string, stop_words)))));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_stop_words(self, stop_words);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_get_stop_words_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject stop_words = get_abstract_lexicon_stop_words(self);
			try {
				try {
					if (NIL == set.set_p(stop_words)) {
						stop_words = set.new_set(EQUAL, UNPROVIDED);
					}
					sublisp_throw($sym369$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, stop_words);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_stop_words(self, stop_words);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym369$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	public static SubLObject abstract_lexicon_get_stop_words_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject stop_words = get_abstract_lexicon_stop_words(self);
		try {
			thread.throwStack.push($sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				if (NIL == set.set_p(stop_words)) {
					stop_words = set.new_set(EQUAL, UNPROVIDED);
				}
				sublisp_throw($sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, stop_words);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_stop_words(self, stop_words);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 *
	 *
	 * @return ABSTRACT-LEXICON-P; a copy of this lexicon.
	 * @unknown -- list values are copied with copy-list.
	 * @unknown -- cache and trie are set to their defaults.
	 */
	@LispMethod(comment = "@return ABSTRACT-LEXICON-P; a copy of this lexicon.\r\n@unknown -- list values are copied with copy-list.\r\n@unknown -- cache and trie are set to their defaults.")
	public static final SubLObject abstract_lexicon_copy_method_alt(SubLObject self, SubLObject target) {
		if (target == UNPROVIDED) {
			target = NIL;
		}
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject active_learners = get_abstract_lexicon_active_learners(self);
			SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
			SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
			SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
			SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
			SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
			SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
			try {
				try {
					if (NIL != target) {
						SubLTrampolineFile.checkType(target, ABSTRACT_LEXICON_P);
					}
					if (NIL == target) {
						target = methods.funcall_instance_method_with_0_args(self, CLONE);
						Errors.warn($str_alt376$Cloned_instance___S, target);
					}
					{
						SubLObject cdolist_list_var = $list_alt377;
						SubLObject slot = NIL;
						for (slot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), slot = cdolist_list_var.first()) {
							{
								SubLObject value = instances.get_slot(self, slot);
								if (value.isList()) {
									instances.set_slot(target, slot, copy_list(value));
								} else {
									instances.set_slot(target, slot, value);
								}
							}
						}
					}
					sublisp_throw($sym373$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, target);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_active_learners(self, active_learners);
							set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
							set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
							set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
							set_abstract_lexicon_excluded_preds(self, excluded_preds);
							set_abstract_lexicon_excluded_mts(self, excluded_mts);
							set_abstract_lexicon_allowed_mts(self, allowed_mts);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym373$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 *
	 *
	 * @return ABSTRACT-LEXICON-P; a copy of this lexicon.
	 * @unknown -- list values are copied with copy-list.
	 * @unknown -- cache and trie are set to their defaults.
	 */
	@LispMethod(comment = "@return ABSTRACT-LEXICON-P; a copy of this lexicon.\r\n@unknown -- list values are copied with copy-list.\r\n@unknown -- cache and trie are set to their defaults.")
	public static SubLObject abstract_lexicon_copy_method(final SubLObject self, SubLObject target) {
		if (target == UNPROVIDED) {
			target = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
		final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		try {
			thread.throwStack.push($sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				if (((NIL != target) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == abstract_lexicon_p(target))) {
					throw new AssertionError(target);
				}
				if (NIL == target) {
					target = methods.funcall_instance_method_with_0_args(self, CLONE);
					Errors.warn($str382$Cloned_instance___S, target);
				}
				SubLObject cdolist_list_var = $list383;
				SubLObject slot = NIL;
				slot = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					final SubLObject value = instances.get_slot(self, slot);
					if (value.isList()) {
						instances.set_slot(target, slot, copy_list(value));
					} else {
						instances.set_slot(target, slot, value);
					}
					cdolist_list_var = cdolist_list_var.rest();
					slot = cdolist_list_var.first();
				}
				sublisp_throw($sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, target);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					set_abstract_lexicon_excluded_mts(self, excluded_mts);
					set_abstract_lexicon_allowed_mts(self, allowed_mts);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 *
	 *
	 * @param STRING
	stringp;
	 * 		
	 * @return listp; the list of  lex-entry-p associated with STRING in this lexicon
	 */
	@LispMethod(comment = "@param STRING\nstringp;\r\n\t\t\r\n@return listp; the list of  lex-entry-p associated with STRING in this lexicon")
	public static final SubLObject abstract_lexicon_get_method_alt(SubLObject self, SubLObject string) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject catch_var_for_abstract_lexicon_method = NIL;
				SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
				SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
				SubLObject v_cache = get_abstract_lexicon_cache(self);
				SubLObject trie = get_abstract_lexicon_trie(self);
				try {
					try {
						SubLTrampolineFile.checkType(string, STRINGP);
						if (NIL != methods.funcall_instance_method_with_1_args(self, STOP_WORD_P, string)) {
							sublisp_throw($sym380$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, NIL);
						}
						if (NIL == ignore_cacheP) {
							thread.resetMultipleValues();
							{
								SubLObject lex_entries = cache.cache_get(v_cache, string);
								SubLObject existsP = thread.secondMultipleValue();
								thread.resetMultipleValues();
								if (NIL != existsP) {
									sublisp_throw($sym380$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lex_entries);
								}
							}
						}
						{
							SubLObject lex_entries = methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES, string, NIL);
							SubLObject nl_trie_entries = nl_trie.nl_trie_search(string, trie, case_sensitivity);
							lex_entries = add_lex_entries_for_trie_entries(nl_trie_entries, string, self, lex_entries);
							if ((NIL == lex_entries) && (case_sensitivity == $PREFERRED)) {
								{
									SubLObject nl_trie_entries_10 = nl_trie.nl_trie_search(string, trie, $OFF);
									lex_entries = add_lex_entries_for_trie_entries(nl_trie_entries_10, string, self, lex_entries);
								}
							}
							if (NIL == ignore_cacheP) {
								cache.cache_set(v_cache, string, lex_entries);
							}
							sublisp_throw($sym380$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lex_entries);
						}
					} finally {
						{
							SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
								set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
								set_abstract_lexicon_cache(self, v_cache);
								set_abstract_lexicon_trie(self, trie);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
							}
						}
					}
				} catch (Throwable ccatch_env_var) {
					catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym380$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
				}
				return catch_var_for_abstract_lexicon_method;
			}
		}
	}

	/**
	 *
	 *
	 * @param STRING
	stringp;
	 * 		
	 * @return listp; the list of  lex-entry-p associated with STRING in this lexicon
	 */
	@LispMethod(comment = "@param STRING\nstringp;\r\n\t\t\r\n@return listp; the list of  lex-entry-p associated with STRING in this lexicon")
	public static SubLObject abstract_lexicon_get_method(final SubLObject self, final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
		final SubLObject v_cache = get_abstract_lexicon_cache(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != cycl_string.cycl_string_p(string) : "! cycl_string.cycl_string_p(string) " + ("cycl_string.cycl_string_p(string) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(string) ") + string;
				if (NIL != methods.funcall_instance_method_with_1_args(self, STOP_WORD_P, string)) {
					sublisp_throw($sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, NIL);
				}
				if (NIL == ignore_cacheP) {
					thread.resetMultipleValues();
					final SubLObject lex_entries = cache.cache_get(v_cache, string);
					final SubLObject existsP = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != existsP) {
						sublisp_throw($sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lex_entries);
					}
				}
				SubLObject lex_entries = methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES, string, NIL);
				final SubLObject nl_trie_entries = nl_trie.nl_trie_search(string, trie, case_sensitivity);
				lex_entries = add_lex_entries_for_trie_entries(nl_trie_entries, string, self, lex_entries);
				if ((NIL == lex_entries) && (case_sensitivity == $PREFERRED)) {
					final SubLObject nl_trie_entries_$10 = nl_trie.nl_trie_search(string, trie, $OFF);
					lex_entries = add_lex_entries_for_trie_entries(nl_trie_entries_$10, string, self, lex_entries);
				}
				if (NIL == ignore_cacheP) {
					cache.cache_set(v_cache, string, lex_entries);
				}
				sublisp_throw($sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lex_entries);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject add_lex_entries_for_trie_entries_alt(SubLObject trie_entries, SubLObject string, SubLObject lexicon, SubLObject lex_entries) {
		{
			SubLObject cdolist_list_var = trie_entries;
			SubLObject nl_trie_entry = NIL;
			for (nl_trie_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), nl_trie_entry = cdolist_list_var.first()) {
				if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym236$VALID_NL_TRIE_ENTRY_, nl_trie_entry)) {
					{
						SubLObject lex_entries0 = methods.funcall_instance_method_with_2_args(lexicon, CREATE_LEX_ENTRIES, string, nl_trie_entry);
						SubLObject cdolist_list_var_11 = lex_entries0;
						SubLObject lex_entry = NIL;
						for (lex_entry = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest(), lex_entry = cdolist_list_var_11.first()) {
							{
								SubLObject item_var = lex_entry;
								if (NIL == member(item_var, lex_entries, LEX_ENTRY_EQUAL_P, symbol_function(IDENTITY))) {
									lex_entries = cons(item_var, lex_entries);
								}
							}
						}
					}
				}
			}
		}
		return lex_entries;
	}

	public static SubLObject add_lex_entries_for_trie_entries(final SubLObject trie_entries, final SubLObject string, final SubLObject lexicon, SubLObject lex_entries) {
		SubLObject cdolist_list_var = trie_entries;
		SubLObject nl_trie_entry = NIL;
		nl_trie_entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym242$VALID_NL_TRIE_ENTRY_, nl_trie_entry)) {
				SubLObject cdolist_list_var_$11;
				final SubLObject lex_entries2 = cdolist_list_var_$11 = methods.funcall_instance_method_with_2_args(lexicon, CREATE_LEX_ENTRIES, string, nl_trie_entry);
				SubLObject lex_entry = NIL;
				lex_entry = cdolist_list_var_$11.first();
				while (NIL != cdolist_list_var_$11) {
					final SubLObject item_var = lex_entry;
					if (NIL == member(item_var, lex_entries, LEX_ENTRY_EQUAL_P, symbol_function(IDENTITY))) {
						lex_entries = cons(item_var, lex_entries);
					}
					cdolist_list_var_$11 = cdolist_list_var_$11.rest();
					lex_entry = cdolist_list_var_$11.first();
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			nl_trie_entry = cdolist_list_var.first();
		}
		return lex_entries;
	}

	/**
	 *
	 *
	 * @return boolan; t if LEX1 and LEX2 are equal, nil otherwise
	 */
	@LispMethod(comment = "@return boolan; t if LEX1 and LEX2 are equal, nil otherwise")
	public static final SubLObject lex_entry_equal_p_alt(SubLObject lex1, SubLObject lex2) {
		{
			SubLObject equalP = T;
			SubLObject properties2 = get_lex_entry_properties(lex2);
			SubLObject keyXvalue1 = NIL;
			SubLObject properties1 = NIL;
			for (keyXvalue1 = get_lex_entry_properties(lex1).first(), properties1 = get_lex_entry_properties(lex1).rest(); !((NIL == keyXvalue1) || (NIL == equalP)); keyXvalue1 = properties1.first(), properties1 = properties1.rest()) {
				equalP = makeBoolean((NIL != equalP) && (NIL != member(keyXvalue1, properties2, EQUAL, UNPROVIDED)));
			}
			return equalP;
		}
	}

	/**
	 *
	 *
	 * @return boolan; t if LEX1 and LEX2 are equal, nil otherwise
	 */
	@LispMethod(comment = "@return boolan; t if LEX1 and LEX2 are equal, nil otherwise")
	public static SubLObject lex_entry_equal_p(final SubLObject lex1, final SubLObject lex2) {
		SubLObject equalP;
		SubLObject properties2;
		SubLObject keyXvalue1;
		SubLObject properties3;
		for (equalP = T, properties2 = get_lex_entry_properties(lex2), keyXvalue1 = NIL, properties3 = NIL, keyXvalue1 = get_lex_entry_properties(lex1).first(), properties3 = get_lex_entry_properties(lex1).rest(); (NIL != keyXvalue1)
				&& (NIL != equalP); equalP = makeBoolean((NIL != equalP) && (NIL != member(keyXvalue1, properties2, EQUAL, UNPROVIDED))), keyXvalue1 = properties3.first(), properties3 = properties3.rest()) {
		}
		return equalP;
	}

	/**
	 * Deletes all entries for STRING from this lexicon
	 */
	@LispMethod(comment = "Deletes all entries for STRING from this lexicon")
	public static final SubLObject abstract_lexicon_delete_method_alt(SubLObject self, SubLObject string) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject v_cache = get_abstract_lexicon_cache(self);
			SubLObject trie = get_abstract_lexicon_trie(self);
			try {
				try {
					SubLTrampolineFile.checkType(string, STRINGP);
					{
						SubLObject trie_key = nl_trie.nl_trie_string_tokenize(string);
						SubLObject trie_entries = strie.strie_lookup(trie, trie_key);
						SubLObject cdolist_list_var = trie_entries;
						SubLObject trie_entry = NIL;
						for (trie_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), trie_entry = cdolist_list_var.first()) {
							if (NIL != lex_entry_p(trie_entry)) {
								strie.strie_unassociate(trie, trie_key, trie_entry);
							}
						}
					}
					cache.cache_remove(v_cache, string);
					sublisp_throw($sym388$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_cache(self, v_cache);
							set_abstract_lexicon_trie(self, trie);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym388$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * Deletes all entries for STRING from this lexicon
	 */
	@LispMethod(comment = "Deletes all entries for STRING from this lexicon")
	public static SubLObject abstract_lexicon_delete_method(final SubLObject self, final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject v_cache = get_abstract_lexicon_cache(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != cycl_string.cycl_string_p(string) : "! cycl_string.cycl_string_p(string) " + ("cycl_string.cycl_string_p(string) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(string) ") + string;
				SubLObject cdolist_list_var;
				final SubLObject trie_entries = cdolist_list_var = nl_trie.nl_trie_search(string, trie, methods.funcall_instance_method_with_0_args(self, GET_CASE_SENSITIVITY));
				SubLObject trie_entry = NIL;
				trie_entry = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (NIL != lex_entry_p(trie_entry)) {
						SubLObject cdolist_list_var_$12 = nl_trie.nl_trie_entry_keys(trie_entry, UNPROVIDED);
						SubLObject trie_key = NIL;
						trie_key = cdolist_list_var_$12.first();
						while (NIL != cdolist_list_var_$12) {
							nl_trie.nl_trie_delete_entry(trie, trie_key, trie_entry);
							cdolist_list_var_$12 = cdolist_list_var_$12.rest();
							trie_key = cdolist_list_var_$12.first();
						}
					}
					cdolist_list_var = cdolist_list_var.rest();
					trie_entry = cdolist_list_var.first();
				}
				cache.cache_remove(v_cache, string);
				sublisp_throw($sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * Deletes the entry associating STRING with LEX-ENTRY from this lexicon
	 */
	@LispMethod(comment = "Deletes the entry associating STRING with LEX-ENTRY from this lexicon")
	public static final SubLObject abstract_lexicon_delete_entry_from_string_method_alt(SubLObject self, SubLObject lex_entry, SubLObject string) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject v_cache = get_abstract_lexicon_cache(self);
			SubLObject trie = get_abstract_lexicon_trie(self);
			try {
				try {
					SubLTrampolineFile.checkType(string, STRINGP);
					SubLTrampolineFile.checkType(lex_entry, LEX_ENTRY_P);
					{
						SubLObject trie_key = nl_trie.nl_trie_string_tokenize(string);
						strie.strie_unassociate(trie, trie_key, lex_entry);
					}
					{
						SubLObject cache_entries = remove(lex_entry, cache.cache_get(v_cache, string), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						cache.cache_set(v_cache, string, cache_entries);
					}
					sublisp_throw($sym393$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_cache(self, v_cache);
							set_abstract_lexicon_trie(self, trie);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym393$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * Deletes the entry associating STRING with LEX-ENTRY from this lexicon
	 */
	@LispMethod(comment = "Deletes the entry associating STRING with LEX-ENTRY from this lexicon")
	public static SubLObject abstract_lexicon_delete_entry_from_string_method(final SubLObject self, final SubLObject lex_entry, final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject v_cache = get_abstract_lexicon_cache(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
				assert NIL != lex_entry_p(lex_entry) : "! abstract_lexicon.lex_entry_p(lex_entry) " + ("abstract_lexicon.lex_entry_p(lex_entry) " + "CommonSymbols.NIL != abstract_lexicon.lex_entry_p(lex_entry) ") + lex_entry;
				final SubLObject trie_key = nl_trie.nl_trie_string_tokenize(string);
				nl_trie.nl_trie_delete_entry(trie, trie_key, lex_entry);
				final SubLObject cache_entries = remove(lex_entry, cache.cache_get(v_cache, string), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				cache.cache_set(v_cache, string, cache_entries);
				sublisp_throw($sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * remove all lex-entry-p's for STRING from the *nl-trie*
	 */
	@LispMethod(comment = "remove all lex-entry-p\'s for STRING from the *nl-trie*")
	public static final SubLObject delete_nl_trie_lex_entries_for_string_alt(SubLObject string) {
		{
			SubLObject all_entries = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
			SubLObject lex_entries = list_utilities.remove_if_not(NL_TRIE_LEX_ENTRY_P, all_entries, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject cdolist_list_var = lex_entries;
			SubLObject entry = NIL;
			for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_12 = nl_trie.nl_trie_entry_keys(entry, UNPROVIDED);
					SubLObject key = NIL;
					for (key = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest(), key = cdolist_list_var_12.first()) {
						nl_trie.nl_trie_delete_entry(nl_trie.get_nl_trie(), key, entry);
					}
				}
			}
			return lex_entries;
		}
	}

	/**
	 * remove all lex-entry-p's for STRING from the *nl-trie*
	 */
	@LispMethod(comment = "remove all lex-entry-p\'s for STRING from the *nl-trie*")
	public static SubLObject delete_nl_trie_lex_entries_for_string(final SubLObject string) {
		final SubLObject all_entries = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject lex_entries = cdolist_list_var = list_utilities.remove_if_not(NL_TRIE_LEX_ENTRY_P, all_entries, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject entry = NIL;
		entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$13 = nl_trie.nl_trie_entry_keys(entry, UNPROVIDED);
			SubLObject key = NIL;
			key = cdolist_list_var_$13.first();
			while (NIL != cdolist_list_var_$13) {
				nl_trie.nl_trie_delete_entry(nl_trie.get_nl_trie(), key, entry);
				cdolist_list_var_$13 = cdolist_list_var_$13.rest();
				key = cdolist_list_var_$13.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		return lex_entries;
	}

	/**
	 * Adds LEX-ENTRY to this lexicon
	 */
	@LispMethod(comment = "Adds LEX-ENTRY to this lexicon")
	public static final SubLObject abstract_lexicon_add_method_alt(SubLObject self, SubLObject lex_entry) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject learned = get_abstract_lexicon_learned(self);
			SubLObject v_cache = get_abstract_lexicon_cache(self);
			SubLObject trie = get_abstract_lexicon_trie(self);
			try {
				try {
					SubLTrampolineFile.checkType(lex_entry, LEX_ENTRY_P);
					{
						SubLObject string = methods.funcall_instance_method_with_1_args(lex_entry, GET, $STRING);
						SubLObject result = NIL;
						if (NIL == string_utilities.char_position(strie.$strie_null_key$.getGlobalValue(), string, UNPROVIDED)) {
							learned = cons(lex_entry, learned);
							result = nl_trie.nl_trie_insert_entry(trie, nl_trie.nl_trie_string_tokenize(string), lex_entry2nl_trie_entry(lex_entry));
							cache.cache_remove(v_cache, string);
							sublisp_throw($sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, result);
						}
						sublisp_throw($sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, NIL);
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_learned(self, learned);
							set_abstract_lexicon_cache(self, v_cache);
							set_abstract_lexicon_trie(self, trie);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * Adds LEX-ENTRY to this lexicon
	 */
	@LispMethod(comment = "Adds LEX-ENTRY to this lexicon")
	public static SubLObject abstract_lexicon_add_method(final SubLObject self, final SubLObject lex_entry) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject learned = get_abstract_lexicon_learned(self);
		final SubLObject v_cache = get_abstract_lexicon_cache(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != lex_entry_p(lex_entry) : "! abstract_lexicon.lex_entry_p(lex_entry) " + ("abstract_lexicon.lex_entry_p(lex_entry) " + "CommonSymbols.NIL != abstract_lexicon.lex_entry_p(lex_entry) ") + lex_entry;
				final SubLObject string = methods.funcall_instance_method_with_1_args(lex_entry, GET, $STRING);
				SubLObject result = NIL;
				if (NIL == string_utilities.char_position(strie.$strie_null_key$.getGlobalValue(), string, UNPROVIDED)) {
					learned = cons(lex_entry, learned);
					result = nl_trie.nl_trie_insert_entry(trie, nl_trie.nl_trie_string_tokenize(string), lex_entry2nl_trie_entry(lex_entry));
					cache.cache_remove(v_cache, string);
					sublisp_throw($sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, result);
				}
				sublisp_throw($sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, NIL);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_learned(self, learned);
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * Check to see if this lex entry was learned by this lexicon
	 */
	@LispMethod(comment = "Check to see if this lex entry was learned by this lexicon")
	public static final SubLObject abstract_lexicon_learnedP_method_alt(SubLObject self, SubLObject lex_entry) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject learned = get_abstract_lexicon_learned(self);
			try {
				try {
					sublisp_throw($sym404$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, subl_promotions.memberP(lex_entry, learned, UNPROVIDED, UNPROVIDED));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_learned(self, learned);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym404$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * Check to see if this lex entry was learned by this lexicon
	 */
	@LispMethod(comment = "Check to see if this lex entry was learned by this lexicon")
	public static SubLObject abstract_lexicon_learnedP_method(final SubLObject self, final SubLObject lex_entry) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject learned = get_abstract_lexicon_learned(self);
		try {
			thread.throwStack.push($sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				sublisp_throw($sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, subl_promotions.memberP(lex_entry, learned, UNPROVIDED, UNPROVIDED));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_learned(self, learned);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 * Delete all entries previously learned from this lexicon
	 */
	@LispMethod(comment = "Delete all entries previously learned from this lexicon")
	public static final SubLObject abstract_lexicon_forget_method_alt(SubLObject self) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject learned = get_abstract_lexicon_learned(self);
			try {
				try {
					{
						SubLObject deleted = learned;
						SubLObject cdolist_list_var = learned;
						SubLObject lex = NIL;
						for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex = cdolist_list_var.first()) {
							methods.funcall_instance_method_with_1_args(self, DELETE, methods.funcall_instance_method_with_1_args(lex, GET, $STRING));
						}
						learned = NIL;
						sublisp_throw($sym408$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, deleted);
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_learned(self, learned);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym408$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 * Delete all entries previously learned from this lexicon
	 */
	@LispMethod(comment = "Delete all entries previously learned from this lexicon")
	public static SubLObject abstract_lexicon_forget_method(final SubLObject self) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject learned = get_abstract_lexicon_learned(self);
		try {
			thread.throwStack.push($sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				final SubLObject deleted = learned;
				SubLObject cdolist_list_var = learned;
				SubLObject lex = NIL;
				lex = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					methods.funcall_instance_method_with_1_args(self, DELETE, methods.funcall_instance_method_with_1_args(lex, GET, $STRING));
					cdolist_list_var = cdolist_list_var.rest();
					lex = cdolist_list_var.first();
				}
				learned = NIL;
				sublisp_throw($sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, deleted);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_learned(self, learned);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject valid_prefixes_alt(SubLObject prefixes, SubLObject lexicon) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject results = NIL;
				SubLObject cdolist_list_var = prefixes;
				SubLObject prefixXentries = NIL;
				for (prefixXentries = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), prefixXentries = cdolist_list_var.first()) {
					{
						SubLObject prefix = prefixXentries.first();
						SubLObject string = string_utilities.bunge(prefix, UNPROVIDED);
						SubLObject entries = prefixXentries.rest();
						SubLObject ignore_cacheP = methods.funcall_instance_method_with_0_args(lexicon, $sym176$IGNORE_CACHE_);
						SubLObject v_cache = instances.get_slot(lexicon, CACHE);
						SubLObject lexes = NIL;
						SubLObject existsP = NIL;
						if (NIL == ignore_cacheP) {
							thread.resetMultipleValues();
							{
								SubLObject lexes_13 = cache.cache_get(v_cache, string);
								SubLObject existsP_14 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								lexes = lexes_13;
								existsP = existsP_14;
							}
						}
						if (NIL == existsP) {
							{
								SubLObject cdolist_list_var_15 = entries;
								SubLObject entry = NIL;
								for (entry = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest(), entry = cdolist_list_var_15.first()) {
									if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym236$VALID_NL_TRIE_ENTRY_, entry)) {
										{
											SubLObject cdolist_list_var_16 = methods.funcall_instance_method_with_2_args(lexicon, CREATE_LEX_ENTRIES, string, entry);
											SubLObject lex = NIL;
											for (lex = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest(), lex = cdolist_list_var_16.first()) {
												lexes = cons(lex, lexes);
											}
										}
									}
								}
							}
							if (NIL == ignore_cacheP) {
								cache.cache_set(v_cache, string, lexes);
							}
						}
						{
							SubLObject cdolist_list_var_17 = lexes;
							SubLObject lex = NIL;
							for (lex = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest(), lex = cdolist_list_var_17.first()) {
								results = cons(cons(prefix, lex), results);
							}
						}
					}
				}
				return nreverse(results);
			}
		}
	}

	public static SubLObject valid_prefixes(final SubLObject prefixes, final SubLObject lexicon) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject results = NIL;
		SubLObject cdolist_list_var = prefixes;
		SubLObject prefixXentries = NIL;
		prefixXentries = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject prefix = prefixXentries.first();
			final SubLObject string = string_utilities.bunge(prefix, UNPROVIDED);
			final SubLObject entries = prefixXentries.rest();
			final SubLObject ignore_cacheP = methods.funcall_instance_method_with_0_args(lexicon, $sym182$IGNORE_CACHE_);
			final SubLObject v_cache = instances.get_slot(lexicon, CACHE);
			SubLObject lexes = NIL;
			SubLObject existsP = NIL;
			if (NIL == ignore_cacheP) {
				thread.resetMultipleValues();
				final SubLObject lexes_$14 = cache.cache_get(v_cache, string);
				final SubLObject existsP_$15 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				lexes = lexes_$14;
				existsP = existsP_$15;
			}
			if (NIL == existsP) {
				SubLObject cdolist_list_var_$16 = entries;
				SubLObject entry = NIL;
				entry = cdolist_list_var_$16.first();
				while (NIL != cdolist_list_var_$16) {
					if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym242$VALID_NL_TRIE_ENTRY_, entry)) {
						SubLObject cdolist_list_var_$17 = methods.funcall_instance_method_with_2_args(lexicon, CREATE_LEX_ENTRIES, string, entry);
						SubLObject lex = NIL;
						lex = cdolist_list_var_$17.first();
						while (NIL != cdolist_list_var_$17) {
							lexes = cons(lex, lexes);
							cdolist_list_var_$17 = cdolist_list_var_$17.rest();
							lex = cdolist_list_var_$17.first();
						}
					}
					cdolist_list_var_$16 = cdolist_list_var_$16.rest();
					entry = cdolist_list_var_$16.first();
				}
				if (NIL == ignore_cacheP) {
					cache.cache_set(v_cache, string, lexes);
				}
			}
			SubLObject cdolist_list_var_$18 = lexes;
			SubLObject lex2 = NIL;
			lex2 = cdolist_list_var_$18.first();
			while (NIL != cdolist_list_var_$18) {
				results = cons(cons(prefix, lex2), results);
				cdolist_list_var_$18 = cdolist_list_var_$18.rest();
				lex2 = cdolist_list_var_$18.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			prefixXentries = cdolist_list_var.first();
		}
		return nreverse(results);
	}

	/**
	 *
	 *
	 * @param STRINGS;
	listp
	 * 		
	 * @return listp; a list of conses whose car is a list of strings which are
	in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry
	with that string
	 */
	@LispMethod(comment = "@param STRINGS;\nlistp\r\n\t\t\r\n@return listp; a list of conses whose car is a list of strings which are\r\nin this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\r\nwith that string")
	public static final SubLObject abstract_lexicon_prefixes_method_alt(SubLObject self, SubLObject strings) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
			SubLObject trie = get_abstract_lexicon_trie(self);
			try {
				try {
					SubLTrampolineFile.checkType(strings, LISTP);
					sublisp_throw($sym413$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, valid_prefixes(nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity), self));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
							set_abstract_lexicon_trie(self, trie);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym413$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 *
	 *
	 * @param STRINGS;
	listp
	 * 		
	 * @return listp; a list of conses whose car is a list of strings which are
	in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry
	with that string
	 */
	@LispMethod(comment = "@param STRINGS;\nlistp\r\n\t\t\r\n@return listp; a list of conses whose car is a list of strings which are\r\nin this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\r\nwith that string")
	public static SubLObject abstract_lexicon_prefixes_method(final SubLObject self, final SubLObject strings) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != listp(strings) : "! listp(strings) " + ("Types.listp(strings) " + "CommonSymbols.NIL != Types.listp(strings) ") + strings;
				sublisp_throw($sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, valid_prefixes(nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity), self));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 *
	 *
	 * @param STRING
	stringp
	 * 		
	 * @return listp; a list of conses whose car is a list of strings which are
	in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry
	with that string
	 */
	@LispMethod(comment = "@param STRING\nstringp\r\n\t\t\r\n@return listp; a list of conses whose car is a list of strings which are\r\nin this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\r\nwith that string")
	public static final SubLObject abstract_lexicon_prefixes_from_string_method_alt(SubLObject self, SubLObject string) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
			SubLObject trie = get_abstract_lexicon_trie(self);
			try {
				try {
					SubLTrampolineFile.checkType(string, STRINGP);
					{
						SubLObject prefix_keys = nl_trie_accessors.nl_trie_prefix_keys_from_string(trie, string, case_sensitivity);
						SubLObject nl_trie_entry = second(prefix_keys.first());
						SubLObject prefix_string = nl_trie.nl_trie_entry_string(nl_trie_entry);
						sublisp_throw($sym418$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, list(valid_prefixes(prefix_keys, self), prefix_string));
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
							set_abstract_lexicon_trie(self, trie);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym418$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 *
	 *
	 * @param STRING
	stringp
	 * 		
	 * @return listp; a list of conses whose car is a list of strings which are
	in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry
	with that string
	 */
	@LispMethod(comment = "@param STRING\nstringp\r\n\t\t\r\n@return listp; a list of conses whose car is a list of strings which are\r\nin this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\r\nwith that string")
	public static SubLObject abstract_lexicon_prefixes_from_string_method(final SubLObject self, final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
				final SubLObject prefix_keys = nl_trie_accessors.nl_trie_prefix_keys_from_string(trie, string, case_sensitivity);
				final SubLObject nl_trie_entry = second(prefix_keys.first());
				final SubLObject prefix_string = nl_trie.nl_trie_entry_string(nl_trie_entry);
				sublisp_throw($sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, list(valid_prefixes(prefix_keys, self), prefix_string));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject valid_prefix_keys_alt(SubLObject prefixes, SubLObject lexicon, SubLObject case_sensitivity) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject strings = NIL;
				SubLObject cdolist_list_var = prefixes;
				SubLObject prefixXentries = NIL;
				for (prefixXentries = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), prefixXentries = cdolist_list_var.first()) {
					{
						SubLObject prefix = prefixXentries.first();
						SubLObject string = string_utilities.bunge(prefix, UNPROVIDED);
						SubLObject equality = lexicon_equality_from_case_sensitivity(case_sensitivity);
						SubLObject entries = prefixXentries.rest();
						SubLObject v_cache = instances.get_slot(lexicon, CACHE);
						SubLObject lexes = NIL;
						SubLObject existsP = NIL;
						if (NIL == methods.funcall_instance_method_with_0_args(lexicon, $sym176$IGNORE_CACHE_)) {
							thread.resetMultipleValues();
							{
								SubLObject lexes_18 = cache.cache_get(v_cache, string);
								SubLObject existsP_19 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								lexes = lexes_18;
								existsP = existsP_19;
							}
						}
						if (NIL != existsP) {
							{
								SubLObject item_var = prefix;
								if (NIL == member(item_var, strings, equality, symbol_function(IDENTITY))) {
									strings = cons(item_var, strings);
								}
							}
						} else {
							{
								SubLObject cdolist_list_var_20 = entries;
								SubLObject entry = NIL;
								for (entry = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest(), entry = cdolist_list_var_20.first()) {
									if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym236$VALID_NL_TRIE_ENTRY_, entry)) {
										{
											SubLObject item_var = prefix;
											if (NIL == member(item_var, strings, equality, symbol_function(IDENTITY))) {
												strings = cons(item_var, strings);
											}
										}
									}
								}
							}
						}
					}
				}
				return nreverse(strings);
			}
		}
	}

	public static SubLObject valid_prefix_keys(final SubLObject prefixes, final SubLObject lexicon, final SubLObject case_sensitivity) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject strings = NIL;
		SubLObject cdolist_list_var = prefixes;
		SubLObject prefixXentries = NIL;
		prefixXentries = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject prefix = prefixXentries.first();
			final SubLObject string = string_utilities.bunge(prefix, UNPROVIDED);
			final SubLObject equality = lexicon_equality_from_case_sensitivity(case_sensitivity);
			final SubLObject entries = prefixXentries.rest();
			final SubLObject v_cache = instances.get_slot(lexicon, CACHE);
			SubLObject lexes = NIL;
			SubLObject existsP = NIL;
			if (NIL == methods.funcall_instance_method_with_0_args(lexicon, $sym182$IGNORE_CACHE_)) {
				thread.resetMultipleValues();
				final SubLObject lexes_$19 = cache.cache_get(v_cache, string);
				final SubLObject existsP_$20 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				lexes = lexes_$19;
				existsP = existsP_$20;
			}
			if (NIL != existsP) {
				final SubLObject item_var = prefix;
				if (NIL == member(item_var, strings, equality, symbol_function(IDENTITY))) {
					strings = cons(item_var, strings);
				}
			} else {
				SubLObject cdolist_list_var_$21 = entries;
				SubLObject entry = NIL;
				entry = cdolist_list_var_$21.first();
				while (NIL != cdolist_list_var_$21) {
					if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym242$VALID_NL_TRIE_ENTRY_, entry)) {
						final SubLObject item_var2 = prefix;
						if (NIL == member(item_var2, strings, equality, symbol_function(IDENTITY))) {
							strings = cons(item_var2, strings);
						}
					}
					cdolist_list_var_$21 = cdolist_list_var_$21.rest();
					entry = cdolist_list_var_$21.first();
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			prefixXentries = cdolist_list_var.first();
		}
		return nreverse(strings);
	}

	public static final SubLObject lexicon_equality_from_case_sensitivity_alt(SubLObject case_sensitivity) {
		if (case_sensitivity.isFunction()) {
			return case_sensitivity;
		} else {
			if (case_sensitivity.isKeyword()) {
				{
					SubLObject pcase_var = case_sensitivity;
					if (pcase_var.eql($ON)) {
						return symbol_function(EQUAL);
					} else {
						if (pcase_var.eql($OFF)) {
							return symbol_function(EQUALP);
						} else {
							if (pcase_var.eql($FALLBACK)) {
								return symbol_function(EQUALP);
							}
						}
					}
				}
			} else {
				Errors.error($str_alt421$Don_t_recognize_lexicon_case_sens, case_sensitivity);
			}
		}
		return NIL;
	}

	public static SubLObject lexicon_equality_from_case_sensitivity(final SubLObject case_sensitivity) {
		if (case_sensitivity.isFunction()) {
			return case_sensitivity;
		}
		if (case_sensitivity.isKeyword()) {
			if (case_sensitivity.eql($ON)) {
				return symbol_function(EQUAL);
			}
			if (case_sensitivity.eql($OFF)) {
				return symbol_function(EQUALP);
			}
			if (case_sensitivity.eql($FALLBACK)) {
				return symbol_function(EQUALP);
			}
		} else {
			Errors.error($str428$Don_t_recognize_lexicon_case_sens, case_sensitivity);
		}
		return NIL;
	}

	/**
	 *
	 *
	 * @param STRINGS;
	listp
	 * 		
	 * @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS
	 */
	@LispMethod(comment = "@param STRINGS;\nlistp\r\n\t\t\r\n@return listp; a list of strings which are both in this lexicon and a prefix of STRINGS")
	public static final SubLObject abstract_lexicon_prefix_keys_method_alt(SubLObject self, SubLObject strings) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
			SubLObject trie = get_abstract_lexicon_trie(self);
			try {
				try {
					SubLTrampolineFile.checkType(strings, LISTP);
					sublisp_throw($sym424$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, valid_prefix_keys(nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity), self, case_sensitivity));
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
							set_abstract_lexicon_trie(self, trie);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym424$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 *
	 *
	 * @param STRINGS;
	listp
	 * 		
	 * @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS
	 */
	@LispMethod(comment = "@param STRINGS;\nlistp\r\n\t\t\r\n@return listp; a list of strings which are both in this lexicon and a prefix of STRINGS")
	public static SubLObject abstract_lexicon_prefix_keys_method(final SubLObject self, final SubLObject strings) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != listp(strings) : "! listp(strings) " + ("Types.listp(strings) " + "CommonSymbols.NIL != Types.listp(strings) ") + strings;
				sublisp_throw($sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, valid_prefix_keys(nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity), self, case_sensitivity));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 *
	 *
	 * @param STRING
	stringp
	 * 		
	 * @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS
	 */
	@LispMethod(comment = "@param STRING\nstringp\r\n\t\t\r\n@return listp; a list of strings which are both in this lexicon and a prefix of STRINGS")
	public static final SubLObject abstract_lexicon_prefix_keys_from_string_method_alt(SubLObject self, SubLObject string) {
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
			SubLObject trie = get_abstract_lexicon_trie(self);
			try {
				try {
					SubLTrampolineFile.checkType(string, STRINGP);
					{
						SubLObject my_prefix_keys = nl_trie_accessors.nl_trie_prefix_keys_from_string(trie, string, case_sensitivity);
						SubLObject nl_trie_entry = second(my_prefix_keys.first());
						SubLObject prefix_string = nl_trie.nl_trie_entry_string(nl_trie_entry);
						sublisp_throw($sym428$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, list(valid_prefix_keys(my_prefix_keys, self, case_sensitivity), prefix_string));
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
							set_abstract_lexicon_trie(self, trie);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym428$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 *
	 *
	 * @param STRING
	stringp
	 * 		
	 * @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS
	 */
	@LispMethod(comment = "@param STRING\nstringp\r\n\t\t\r\n@return listp; a list of strings which are both in this lexicon and a prefix of STRINGS")
	public static SubLObject abstract_lexicon_prefix_keys_from_string_method(final SubLObject self, final SubLObject string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
				final SubLObject my_prefix_keys = nl_trie_accessors.nl_trie_prefix_keys_from_string(trie, string, case_sensitivity);
				final SubLObject nl_trie_entry = second(my_prefix_keys.first());
				final SubLObject prefix_string = nl_trie.nl_trie_entry_string(nl_trie_entry);
				sublisp_throw($sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, list(valid_prefix_keys(my_prefix_keys, self, case_sensitivity), prefix_string));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	/**
	 *
	 *
	 * @param TEXT
	 * 		stringp; the text from which to learn lexical entries
	 * @param LEARNERS
	 * 		listp; a list of learning methods. Each such method
	 * 		is expected to take a natural language string as input and return a
	 * 		list of lex-entries
	 * @return non-negative-integerp; the number of entries learned
	 * @unknown it is the responsibility of each learner to add any entries to the lexicon
	 */
	@LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@param LEARNERS\r\n\t\tlistp; a list of learning methods. Each such method\r\n\t\tis expected to take a natural language string as input and return a\r\n\t\tlist of lex-entries\r\n@return non-negative-integerp; the number of entries learned\r\n@unknown it is the responsibility of each learner to add any entries to the lexicon")
	public static final SubLObject abstract_lexicon_learn_method_alt(SubLObject self, SubLObject text, SubLObject learners) {
		if (learners == UNPROVIDED) {
			learners = NIL;
		}
		{
			SubLObject catch_var_for_abstract_lexicon_method = NIL;
			SubLObject active_learners = get_abstract_lexicon_active_learners(self);
			try {
				try {
					SubLTrampolineFile.checkType(text, STRINGP);
					if (NIL == learners) {
						learners = active_learners;
					}
					{
						SubLObject learned_here = NIL;
						SubLObject cdolist_list_var = learners;
						SubLObject learner = NIL;
						for (learner = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), learner = cdolist_list_var.first()) {
							{
								SubLObject cdolist_list_var_21 = methods.funcall_instance_method_with_1_args(self, learner, text);
								SubLObject lex = NIL;
								for (lex = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest(), lex = cdolist_list_var_21.first()) {
									learned_here = cons(lex, learned_here);
								}
							}
						}
						sublisp_throw($sym433$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, learned_here);
					}
				} finally {
					{
						SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
						try {
							bind($is_thread_performing_cleanupP$, T);
							set_abstract_lexicon_active_learners(self, active_learners);
						} finally {
							rebind($is_thread_performing_cleanupP$, _prev_bind_0);
						}
					}
				}
			} catch (Throwable ccatch_env_var) {
				catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym433$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			}
			return catch_var_for_abstract_lexicon_method;
		}
	}

	/**
	 *
	 *
	 * @param TEXT
	 * 		stringp; the text from which to learn lexical entries
	 * @param LEARNERS
	 * 		listp; a list of learning methods. Each such method
	 * 		is expected to take a natural language string as input and return a
	 * 		list of lex-entries
	 * @return non-negative-integerp; the number of entries learned
	 * @unknown it is the responsibility of each learner to add any entries to the lexicon
	 */
	@LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@param LEARNERS\r\n\t\tlistp; a list of learning methods. Each such method\r\n\t\tis expected to take a natural language string as input and return a\r\n\t\tlist of lex-entries\r\n@return non-negative-integerp; the number of entries learned\r\n@unknown it is the responsibility of each learner to add any entries to the lexicon")
	public static SubLObject abstract_lexicon_learn_method(final SubLObject self, final SubLObject text, SubLObject learners) {
		if (learners == UNPROVIDED) {
			learners = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		try {
			thread.throwStack.push($sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != stringp(text) : "! stringp(text) " + ("Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) ") + text;
				if (NIL == learners) {
					learners = active_learners;
				}
				SubLObject learned_here = NIL;
				SubLObject cdolist_list_var = learners;
				SubLObject learner = NIL;
				learner = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject cdolist_list_var_$22 = methods.funcall_instance_method_with_1_args(self, learner, text);
					SubLObject lex = NIL;
					lex = cdolist_list_var_$22.first();
					while (NIL != cdolist_list_var_$22) {
						learned_here = cons(lex, learned_here);
						cdolist_list_var_$22 = cdolist_list_var_$22.rest();
						lex = cdolist_list_var_$22.first();
					}
					cdolist_list_var = cdolist_list_var.rest();
					learner = cdolist_list_var.first();
				}
				sublisp_throw($sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, learned_here);
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	public static final SubLObject abstract_lexicon_number_learn_method_alt(SubLObject self, SubLObject text) {
		return NIL;
	}

	public static SubLObject abstract_lexicon_number_learn_method(final SubLObject self, final SubLObject text) {
		return NIL;
	}

	/**
	 *
	 *
	 * @param TEXT;
	 * 		a string in which to find the numbers
	 * @return LISTP a list of pairs of (<STRING> <NUMBER>) pairs, such as @example (('4' 4) ('2' 2))
	 */
	@LispMethod(comment = "@param TEXT;\r\n\t\ta string in which to find the numbers\r\n@return LISTP a list of pairs of (<STRING> <NUMBER>) pairs, such as @example ((\'4\' 4) (\'2\' 2))")
	public static final SubLObject number_meanings_alt(SubLObject text) {
		{
			SubLObject result = NIL;
			SubLObject number_strings = text_numbers(text);
			SubLObject cdolist_list_var = number_strings;
			SubLObject number_string = NIL;
			for (number_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), number_string = cdolist_list_var.first()) {
				{
					SubLObject number_meaning = numeral_parser.string_to_interval(number_string);
					if (NIL != number_meaning) {
						result = cons(list(number_string, number_meaning), result);
					}
				}
			}
			return result;
		}
	}

	/**
	 *
	 *
	 * @param TEXT;
	 * 		a string in which to find the numbers
	 * @return LISTP a list of pairs of (<STRING> <NUMBER>) pairs, such as @example (('4' 4) ('2' 2))
	 */
	@LispMethod(comment = "@param TEXT;\r\n\t\ta string in which to find the numbers\r\n@return LISTP a list of pairs of (<STRING> <NUMBER>) pairs, such as @example ((\'4\' 4) (\'2\' 2))")
	public static SubLObject number_meanings(final SubLObject text) {
		SubLObject result = NIL;
		SubLObject cdolist_list_var;
		final SubLObject number_strings = cdolist_list_var = text_numbers(text);
		SubLObject number_string = NIL;
		number_string = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject number_meaning = numeral_parser.string_to_interval(number_string);
			if (NIL != number_meaning) {
				result = cons(list(number_string, number_meaning), result);
			}
			cdolist_list_var = cdolist_list_var.rest();
			number_string = cdolist_list_var.first();
		}
		return result;
	}

	public static final SubLObject text_numbers_alt(SubLObject text) {
		{
			SubLObject sentence = document.new_sentence(text, UNPROVIDED);
			SubLObject result = NIL;
			pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
			{
				SubLObject current_word_indices = NIL;
				SubLObject word_index = ZERO_INTEGER;
				SubLObject vector_var = document.sentence_yield(sentence);
				SubLObject backwardP_var = NIL;
				SubLObject length = length(vector_var);
				SubLObject v_iteration = NIL;
				for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					{
						SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
						SubLObject word = aref(vector_var, element_num);
						if ((NIL == current_word_indices) && (document.word_category(word) == $CD)) {
							current_word_indices = cons(word_index, current_word_indices);
						} else {
							if (document.word_category(word) == $CD) {
								current_word_indices = cons(word_index, current_word_indices);
							} else {
								if (NIL != current_word_indices) {
									result = cons(document.sentence_reconstruct_substring(last(current_word_indices, UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
									current_word_indices = NIL;
								}
							}
						}
						word_index = add(word_index, ONE_INTEGER);
					}
				}
				if (NIL != current_word_indices) {
					result = cons(document.sentence_reconstruct_substring(last(current_word_indices, UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
				}
				return nreverse(result);
			}
		}
	}

	public static SubLObject text_numbers(final SubLObject text) {
		final SubLObject sentence = document.new_sentence(text, UNPROVIDED);
		SubLObject result = NIL;
		pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
		SubLObject current_word_indices = NIL;
		SubLObject word_index = ZERO_INTEGER;
		SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
		SubLObject word = NIL;
		word = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (((((document.word_category(word) == $CD) && (NIL != string_utilities.partially_numeric_stringP(document.word_string(word)))) && word_index.numG(ZERO_INTEGER)) && (NIL != list_utilities.lengthG(current_word_indices, ZERO_INTEGER, UNPROVIDED))) && (!document.word_string(document.sentence_get(sentence, subtract(word_index, ONE_INTEGER))).equal($str447$_))) {
				result = cons(document.sentence_reconstruct_substring(last(current_word_indices, UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
				current_word_indices = list(word_index);
			} else if (document.word_category(word) == $CD) {
				current_word_indices = cons(word_index, current_word_indices);
			} else if (NIL != current_word_indices) {
				result = cons(document.sentence_reconstruct_substring(last(current_word_indices, UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
				current_word_indices = NIL;
			}

			word_index = add(word_index, ONE_INTEGER);
			cdolist_list_var = cdolist_list_var.rest();
			word = cdolist_list_var.first();
		}
		if (NIL != current_word_indices) {
			result = cons(document.sentence_reconstruct_substring(last(current_word_indices, UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
		}
		return nreverse(result);
	}

	/**
	 *
	 *
	 * @return listp; a list of the form (STRING (MEANING-1 ... MEANING-N)), where MEANING-N is a CycL term
	that is a scalar interval meaning of STRING
	 */
	@LispMethod(comment = "@return listp; a list of the form (STRING (MEANING-1 ... MEANING-N)), where MEANING-N is a CycL term\r\nthat is a scalar interval meaning of STRING")
	public static final SubLObject scalar_interval_meanings_alt(SubLObject text) {
		{
			SubLObject result = NIL;
			SubLObject scalar_strings = text_scalar_intervals(text);
			SubLObject cdolist_list_var = scalar_strings;
			SubLObject scalar_string_set = NIL;
			for (scalar_string_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), scalar_string_set = cdolist_list_var.first()) {
				{
					SubLObject doneP = NIL;
					if (NIL == doneP) {
						{
							SubLObject csome_list_var = scalar_string_set;
							SubLObject scalar_string = NIL;
							for (scalar_string = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), scalar_string = csome_list_var.first()) {
								{
									SubLObject cdolist_list_var_22 = parsing_utilities.parse_dates_and_numbers(scalar_string, list($$ScalarInterval), NIL, UNPROVIDED, UNPROVIDED);
									SubLObject scalar_meaning = NIL;
									for (scalar_meaning = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest(), scalar_meaning = cdolist_list_var_22.first()) {
										result = cons(list(scalar_string, scalar_meaning), result);
										doneP = T;
									}
								}
							}
						}
					}
				}
			}
			return result;
		}
	}

	/**
	 *
	 *
	 * @return listp; a list of the form (STRING (MEANING-1 ... MEANING-N)), where MEANING-N is a CycL term
	that is a scalar interval meaning of STRING
	 */
	@LispMethod(comment = "@return listp; a list of the form (STRING (MEANING-1 ... MEANING-N)), where MEANING-N is a CycL term\r\nthat is a scalar interval meaning of STRING")
	public static SubLObject scalar_interval_meanings(final SubLObject text) {
		SubLObject result = NIL;
		SubLObject cdolist_list_var;
		final SubLObject scalar_strings = cdolist_list_var = text_scalar_intervals(text);
		SubLObject scalar_string_set = NIL;
		scalar_string_set = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject doneP = NIL;
			if (NIL == doneP) {
				SubLObject csome_list_var = scalar_string_set;
				SubLObject scalar_string = NIL;
				scalar_string = csome_list_var.first();
				while ((NIL == doneP) && (NIL != csome_list_var)) {
					SubLObject cdolist_list_var_$23 = parsing_utilities.parse_dates_and_numbers(scalar_string, list($$ScalarInterval), NIL, UNPROVIDED, UNPROVIDED);
					SubLObject scalar_meaning = NIL;
					scalar_meaning = cdolist_list_var_$23.first();
					while (NIL != cdolist_list_var_$23) {
						result = cons(list(scalar_string, scalar_meaning), result);
						doneP = T;
						cdolist_list_var_$23 = cdolist_list_var_$23.rest();
						scalar_meaning = cdolist_list_var_$23.first();
					}
					csome_list_var = csome_list_var.rest();
					scalar_string = csome_list_var.first();
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			scalar_string_set = cdolist_list_var.first();
		}
		return result;
	}

	/**
	 *
	 *
	 * @return listp of stringp; a list of lists of strings in TEXT that probably represent scalar intervals
	 */
	@LispMethod(comment = "@return listp of stringp; a list of lists of strings in TEXT that probably represent scalar intervals")
	public static final SubLObject text_scalar_intervals_alt(SubLObject text) {
		{
			SubLObject sentence = document.new_sentence(text, RKF_STANDARD_STRING_WORDIFY);
			SubLObject result = NIL;
			pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
			{
				SubLObject word_vector = document.sentence_yield(sentence);
				SubLObject current_word_index = ZERO_INTEGER;
				SubLObject current_words = NIL;
				while (current_word_index.numL(length(word_vector))) {
					{
						SubLObject current_word = aref(word_vector, current_word_index);
						SubLObject scalar_word_count = NIL;
						if ((document.word_category(current_word) == $CD) || ((NIL != string_utilities.starts_with(document.word_string(current_word), $str_alt442$_)) && (NIL != number_utilities.number_string_p(document.word_string(current_word))))) {
							current_words = cons(current_word, current_words);
							current_word_index = add(current_word_index, ONE_INTEGER);
						} else {
							if (NIL != scalar_prefix(word_vector, current_word_index)) {
								scalar_word_count = scalar_prefix(word_vector, current_word_index);
								{
									SubLObject n = NIL;
									for (n = ZERO_INTEGER; n.numL(scalar_word_count); n = add(n, ONE_INTEGER)) {
										current_words = cons(aref(word_vector, current_word_index), current_words);
										current_word_index = add(current_word_index, ONE_INTEGER);
									}
								}
							} else {
								if (NIL != current_words) {
									result = cons(prefix_strings_from_words(nreverse(current_words)), result);
									current_words = NIL;
									current_word_index = add(current_word_index, ONE_INTEGER);
								} else {
									current_word_index = add(current_word_index, ONE_INTEGER);
								}
							}
						}
					}
				}
				if (NIL != current_words) {
					result = cons(prefix_strings_from_words(nreverse(current_words)), result);
				}
			}
			return nreverse(result);
		}
	}

	/**
	 *
	 *
	 * @return listp of stringp; a list of lists of strings in TEXT that probably represent scalar intervals
	 */
	@LispMethod(comment = "@return listp of stringp; a list of lists of strings in TEXT that probably represent scalar intervals")
	public static SubLObject text_scalar_intervals(final SubLObject text) {
		final SubLObject sentence = document.new_sentence(text, RKF_STANDARD_STRING_WORDIFY);
		SubLObject result = NIL;
		pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
		final SubLObject word_vector = document.sentence_yield(sentence);
		SubLObject current_word_index = ZERO_INTEGER;
		SubLObject current_words = NIL;
		while (current_word_index.numL(length(word_vector))) {
			final SubLObject current_word = aref(word_vector, current_word_index);
			SubLObject scalar_word_count = NIL;
			if ((document.word_string(current_word).equal($str447$_) || (document.word_category(current_word) == $CD)) || ((NIL != string_utilities.starts_with(document.word_string(current_word), $str450$_)) && (NIL != number_utilities.number_string_p(document.word_string(current_word))))) {
				current_words = cons(current_word, current_words);
				current_word_index = add(current_word_index, ONE_INTEGER);
			} else if (NIL != scalar_prefix(word_vector, current_word_index)) {
				SubLObject n;
				for (scalar_word_count = scalar_prefix(word_vector, current_word_index), n = NIL, n = ZERO_INTEGER; n.numL(scalar_word_count); n = add(n, ONE_INTEGER)) {
					current_words = cons(aref(word_vector, current_word_index), current_words);
					current_word_index = add(current_word_index, ONE_INTEGER);
				}
			} else if (NIL != current_words) {
				result = cons(prefix_strings_from_words(nreverse(current_words)), result);
				current_words = NIL;
				current_word_index = add(current_word_index, ONE_INTEGER);
			} else {
				current_word_index = add(current_word_index, ONE_INTEGER);
			}

		}
		if (NIL != current_words) {
			result = cons(prefix_strings_from_words(nreverse(current_words)), result);
		}
		return nreverse(result);
	}

	/**
	 *
	 *
	 * @return integerp; the number of words in word-vector starting at start-index that containing the largest
	scalar functor
	 */
	@LispMethod(comment = "@return integerp; the number of words in word-vector starting at start-index that containing the largest\r\nscalar functor")
	public static final SubLObject scalar_prefix_alt(SubLObject word_vector, SubLObject start_index) {
		{
			SubLObject words = vector_utilities.vector_elements(word_vector, start_index);
			SubLObject strings = Mapping.mapcar(WORD_STRING, words);
			SubLObject prefix_records = nl_trie_accessors.nl_trie_prefixes(nl_trie.get_nl_trie(), strings, UNPROVIDED);
			SubLObject cdolist_list_var = prefix_records;
			SubLObject record = NIL;
			for (record = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), record = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_23 = nl_trie.nl_trie_record_entries(record);
					SubLObject trie_entry = NIL;
					for (trie_entry = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest(), trie_entry = cdolist_list_var_23.first()) {
						if (NIL != find_if($sym444$SCALAR_FUNCTION_, nl_trie.nl_trie_entry_denots(trie_entry), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
							return length(nl_trie.nl_trie_record_key(record));
						}
					}
				}
			}
			return NIL;
		}
	}

	/**
	 *
	 *
	 * @return integerp; the number of words in word-vector starting at start-index that containing the largest
	scalar functor
	 */
	@LispMethod(comment = "@return integerp; the number of words in word-vector starting at start-index that containing the largest\r\nscalar functor")
	public static SubLObject scalar_prefix(final SubLObject word_vector, final SubLObject start_index) {
		final SubLObject words = vector_utilities.vector_elements(word_vector, start_index);
		final SubLObject strings = Mapping.mapcar(WORD_STRING, words);
		SubLObject cdolist_list_var;
		final SubLObject prefix_records = cdolist_list_var = nl_trie_accessors.nl_trie_prefixes(nl_trie.get_nl_trie(), strings, UNPROVIDED);
		SubLObject record = NIL;
		record = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$24 = nl_trie.nl_trie_record_entries(record);
			SubLObject trie_entry = NIL;
			trie_entry = cdolist_list_var_$24.first();
			while (NIL != cdolist_list_var_$24) {
				if (NIL != find_if($sym452$SCALAR_FUNCTION_, nl_trie.nl_trie_entry_denots(trie_entry), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
					return length(nl_trie.nl_trie_record_key(record));
				}
				cdolist_list_var_$24 = cdolist_list_var_$24.rest();
				trie_entry = cdolist_list_var_$24.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			record = cdolist_list_var.first();
		}
		return NIL;
	}

	/**
	 *
	 *
	 * @return listp; a list of string-prefixes of WORD-LIST
	 */
	@LispMethod(comment = "@return listp; a list of string-prefixes of WORD-LIST")
	public static final SubLObject prefix_strings_from_words_alt(SubLObject word_list) {
		{
			SubLObject prefix_strings = NIL;
			SubLObject cdotimes_end_var = length(word_list);
			SubLObject n = NIL;
			for (n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
				prefix_strings = cons(combine_words_into_string(subseq(word_list, ZERO_INTEGER, number_utilities.f_1X(n))), prefix_strings);
			}
			return prefix_strings;
		}
	}

	/**
	 *
	 *
	 * @return listp; a list of string-prefixes of WORD-LIST
	 */
	@LispMethod(comment = "@return listp; a list of string-prefixes of WORD-LIST")
	public static SubLObject prefix_strings_from_words(final SubLObject word_list) {
		SubLObject prefix_strings = NIL;
		SubLObject cdotimes_end_var;
		SubLObject n;
		for (cdotimes_end_var = length(word_list), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
			prefix_strings = cons(combine_words_into_string(subseq(word_list, ZERO_INTEGER, number_utilities.f_1X(n))), prefix_strings);
		}
		return prefix_strings;
	}

	public static final SubLObject combine_words_into_string_alt(SubLObject words) {
		{
			SubLObject combined_word_string = document.word_string(words.first());
			SubLObject end_of_last_word = add(document.word_offset(words.first()), document.word_length(words.first()));
			SubLObject cdolist_list_var = words.rest();
			SubLObject word = NIL;
			for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), word = cdolist_list_var.first()) {
				combined_word_string = cconcatenate(combined_word_string, new SubLObject[] { spaces(subtract(document.word_offset(word), end_of_last_word)), document.word_string(word) });
				end_of_last_word = add(document.word_offset(word), document.word_length(word));
			}
			return combined_word_string;
		}
	}

	public static SubLObject combine_words_into_string(final SubLObject words) {
		SubLObject combined_word_string = document.word_string(words.first());
		SubLObject end_of_last_word = add(document.word_offset(words.first()), document.word_length(words.first()));
		SubLObject cdolist_list_var = words.rest();
		SubLObject word = NIL;
		word = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			combined_word_string = cconcatenate(combined_word_string, new SubLObject[] { spaces(subtract(document.word_offset(word), end_of_last_word)), document.word_string(word) });
			end_of_last_word = add(document.word_offset(word), document.word_length(word));
			cdolist_list_var = cdolist_list_var.rest();
			word = cdolist_list_var.first();
		}
		return combined_word_string;
	}

	public static final SubLObject spaces_alt(SubLObject n) {
		return Strings.make_string(n, CHAR_space);
	}

	public static SubLObject spaces(final SubLObject n) {
		return Strings.make_string(n, CHAR_space);
	}

	public static final SubLObject clear_scalar_functionP_alt() {
		{
			SubLObject cs = $scalar_functionP_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static SubLObject clear_scalar_functionP() {
		final SubLObject cs = $scalar_functionP_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static final SubLObject remove_scalar_functionP_alt(SubLObject v_term, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $$InferencePSC;
		}
		return memoization_state.caching_state_remove_function_results_with_args($scalar_functionP_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject remove_scalar_functionP(final SubLObject v_term, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $$InferencePSC;
		}
		return memoization_state.caching_state_remove_function_results_with_args($scalar_functionP_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
	}

	public static final SubLObject scalar_functionP_internal_alt(SubLObject v_term, SubLObject mt) {
		return isa.result_isa_colP(v_term, $$ScalarInterval, mt);
	}

	public static SubLObject scalar_functionP_internal(final SubLObject v_term, final SubLObject mt) {
		return makeBoolean((NIL != fort_types_interface.functionP(v_term)) && (NIL != isa.result_isa_colP(v_term, $$ScalarInterval, mt)));
	}

	public static final SubLObject scalar_functionP_alt(SubLObject v_term, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $$InferencePSC;
		}
		{
			SubLObject caching_state = $scalar_functionP_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name($sym444$SCALAR_FUNCTION_, $sym445$_SCALAR_FUNCTION__CACHING_STATE_, $int$512, EQUAL, TWO_INTEGER, ZERO_INTEGER);
			}
			{
				SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
				SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
				if (collisions != $kw447$_MEMOIZED_ITEM_NOT_FOUND_) {
					{
						SubLObject cdolist_list_var = collisions;
						SubLObject collision = NIL;
						for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
							{
								SubLObject cached_args = collision.first();
								SubLObject results2 = second(collision);
								if (v_term.equal(cached_args.first())) {
									cached_args = cached_args.rest();
									if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
										return memoization_state.caching_results(results2);
									}
								}
							}
						}
					}
				}
				{
					SubLObject results = arg2(resetMultipleValues(), multiple_value_list(scalar_functionP_internal(v_term, mt)));
					memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt));
					return memoization_state.caching_results(results);
				}
			}
		}
	}

	public static SubLObject scalar_functionP(final SubLObject v_term, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $$InferencePSC;
		}
		SubLObject caching_state = $scalar_functionP_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name($sym452$SCALAR_FUNCTION_, $sym453$_SCALAR_FUNCTION__CACHING_STATE_, $int$512, EQUAL, TWO_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
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
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(scalar_functionP_internal(v_term, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
		return memoization_state.caching_results(results3);
	}

	/**
	 *
	 *
	 * @param TEXT
	 * 		stringp; the text from which to learn lexical entries
	 * @return listp; a list of lexical entries learned from TEXT
	This is a stub just to make sure that all subclasses will be have a base
	implementation of this method, although we don't wish to give it a real
	implementation as a method of this class.
	 */
	@LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@return listp; a list of lexical entries learned from TEXT\r\nThis is a stub just to make sure that all subclasses will be have a base\r\nimplementation of this method, although we don\'t wish to give it a real\r\nimplementation as a method of this class.")
	public static final SubLObject abstract_lexicon_noun_compound_learn_method_alt(SubLObject self, SubLObject text) {
		return NIL;
	}

	/**
	 *
	 *
	 * @param TEXT
	 * 		stringp; the text from which to learn lexical entries
	 * @return listp; a list of lexical entries learned from TEXT
	This is a stub just to make sure that all subclasses will be have a base
	implementation of this method, although we don't wish to give it a real
	implementation as a method of this class.
	 */
	@LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@return listp; a list of lexical entries learned from TEXT\r\nThis is a stub just to make sure that all subclasses will be have a base\r\nimplementation of this method, although we don\'t wish to give it a real\r\nimplementation as a method of this class.")
	public static SubLObject abstract_lexicon_noun_compound_learn_method(final SubLObject self, final SubLObject text) {
		return NIL;
	}

	public static final SubLObject tree_nps_alt(SubLObject tree, SubLObject allow_trivial_npsP) {
		if (allow_trivial_npsP == UNPROVIDED) {
			allow_trivial_npsP = NIL;
		}
		{
			SubLObject result = NIL;
			if (NIL != np_treeP(tree, allow_trivial_npsP)) {
				result = cons(tree, result);
			} else {
				if (tree.isList()) {
					{
						SubLObject cdolist_list_var = tree.rest();
						SubLObject node = NIL;
						for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
							result = append(tree_nps(node, allow_trivial_npsP), result);
						}
					}
				}
			}
			return result;
		}
	}

	public static SubLObject tree_nps(final SubLObject tree, SubLObject allow_trivial_npsP) {
		if (allow_trivial_npsP == UNPROVIDED) {
			allow_trivial_npsP = NIL;
		}
		SubLObject result = NIL;
		if (NIL != np_treeP(tree, allow_trivial_npsP)) {
			result = cons(tree, result);
		} else if (tree.isList()) {
			SubLObject cdolist_list_var = tree.rest();
			SubLObject node = NIL;
			node = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				result = append(tree_nps(node, allow_trivial_npsP), result);
				cdolist_list_var = cdolist_list_var.rest();
				node = cdolist_list_var.first();
			}
		}

		return result;
	}

	// Internal Constants
	@LispMethod(comment = "Internal Constants")
	static private final SubLList $list_alt0 = list(new SubLObject[] { list(makeKeyword("."), reader_make_constant_shell("Punctuation-SP"), NIL), list(makeKeyword("WP"), reader_make_constant_shell("WHPronoun"), reader_make_constant_shell("pronounStrings")), list(makeKeyword("``"), reader_make_constant_shell("Punctuation-SP"), NIL),
			list(makeKeyword("POS"), reader_make_constant_shell("PossessiveMarker"), reader_make_constant_shell("possessiveMarkerStrings")), list(makeKeyword("RB"), reader_make_constant_shell("Adverb"), reader_make_constant_shell("regularAdverb")), list(makeKeyword("JJ"), reader_make_constant_shell("Adjective"), reader_make_constant_shell("regularDegree")),
			list(makeKeyword("''"), reader_make_constant_shell("Punctuation-SP"), NIL), list(makeKeyword("MD"), reader_make_constant_shell("Modal"), reader_make_constant_shell("verbStrings")), list(makeKeyword("AUX"), reader_make_constant_shell("AuxVerb"), reader_make_constant_shell("verbStrings")), list(makeKeyword("VB"), reader_make_constant_shell("Verb"), reader_make_constant_shell("infinitive")),
			list(makeKeyword("DT"), reader_make_constant_shell("Determiner"), reader_make_constant_shell("determinerStrings")), list(makeKeyword("VBD"), reader_make_constant_shell("Verb"), reader_make_constant_shell("pastTense-Generic")), list(makeKeyword("NN"), reader_make_constant_shell("Noun"), reader_make_constant_shell("nonPlural-Generic")),
			list(makeKeyword("NNS"), reader_make_constant_shell("Noun"), reader_make_constant_shell("plural-Generic")), list(makeKeyword("VBG"), reader_make_constant_shell("Verb"), reader_make_constant_shell("presentParticiple")), list(makeKeyword("RP"), reader_make_constant_shell("VerbParticle"), NIL), list(makeKeyword("TO"), reader_make_constant_shell("InfinitiveComp"), NIL),
			list(makeKeyword("TO"), reader_make_constant_shell("Preposition"), reader_make_constant_shell("prepositionStrings")), list(makeKeyword("CC"), reader_make_constant_shell("CoordinatingConjunction"), NIL), list(makeKeyword("JJR"), reader_make_constant_shell("Adjective"), reader_make_constant_shell("comparativeDegree")),
			list(makeKeyword("RBR"), reader_make_constant_shell("Adverb"), reader_make_constant_shell("comparativeAdverb")), list(makeKeyword("VBN"), reader_make_constant_shell("Verb"), reader_make_constant_shell("perfect")), list(makeKeyword("VBN"), reader_make_constant_shell("Verb"), reader_make_constant_shell("passiveParticiple")), list(makeKeyword("CD"), reader_make_constant_shell("Number-SP"), NIL),
			list(makeKeyword("JJS"), reader_make_constant_shell("Adjective"), reader_make_constant_shell("superlativeDegree")), list(makeKeyword("RBS"), reader_make_constant_shell("Adverb"), reader_make_constant_shell("superlativeAdverb")), list(makeKeyword("PDT"), reader_make_constant_shell("Predeterminer"), NIL),
			list(makeKeyword("VBP"), reader_make_constant_shell("Verb"), reader_make_constant_shell("nonThirdSg-Present")), list(makeKeyword("WRB"), reader_make_constant_shell("WHAdverb"), reader_make_constant_shell("regularAdverb")), list(makeKeyword("WP$"), reader_make_constant_shell("WHPossessive"), NIL),
			list(makeKeyword("NNP"), reader_make_constant_shell("ProperNoun"), reader_make_constant_shell("nonPlural-Generic")), list(makeKeyword("NNP"), reader_make_constant_shell("ProperNoun"), reader_make_constant_shell("nameSpelling")), list($NNPS, reader_make_constant_shell("ProperNoun"), reader_make_constant_shell("plural-Generic")),
			list(makeKeyword("WDT"), reader_make_constant_shell("WHDeterminer"), reader_make_constant_shell("determinerStrings")), list(makeKeyword("PRP"), reader_make_constant_shell("Pronoun"), reader_make_constant_shell("pronounStrings")), list(makeKeyword("VBZ"), reader_make_constant_shell("Verb"), reader_make_constant_shell("thirdPersonSg-Present")),
			list(makeKeyword("PRP$"), reader_make_constant_shell("PossessivePronoun"), NIL), list(makeKeyword("IN"), reader_make_constant_shell("Preposition"), reader_make_constant_shell("prepositionStrings")), list(makeKeyword("IN"), reader_make_constant_shell("Complementizer"), NIL), list(makeKeyword("IN"), reader_make_constant_shell("SubordinatingConjunction"), NIL),
			list(makeKeyword("EX"), reader_make_constant_shell("There-Existential"), NIL), list(makeKeyword("UH"), reader_make_constant_shell("Interjection-SpeechPart"), NIL), list(makeKeyword(":"), reader_make_constant_shell("Punctuation-SP"), NIL), list(makeKeyword("$"), reader_make_constant_shell("Punctuation-SP"), NIL), list(makeKeyword(","), reader_make_constant_shell("Punctuation-SP"), NIL),
			list(makeKeyword(")"), reader_make_constant_shell("Punctuation-SP"), NIL), list(makeKeyword("("), reader_make_constant_shell("Punctuation-SP"), NIL) });

	public static final SubLObject np_treeP_alt(SubLObject tree, SubLObject allow_trivial_npsP) {
		if (allow_trivial_npsP == UNPROVIDED) {
			allow_trivial_npsP = NIL;
		}
		return makeBoolean((tree.isList() && (tree.first() == $NP)) && ((NIL != allow_trivial_npsP) || length(tree).numG(TWO_INTEGER)));
	}

	public static SubLObject np_treeP(final SubLObject tree, SubLObject allow_trivial_npsP) {
		if (allow_trivial_npsP == UNPROVIDED) {
			allow_trivial_npsP = NIL;
		}
		return makeBoolean((tree.isList() && (tree.first() == $NP)) && ((NIL != allow_trivial_npsP) || length(tree).numG(TWO_INTEGER)));
	}

	public static final SubLObject compounds_from_tree_alt(SubLObject np_tree) {
		{
			SubLObject compound_strings = NIL;
			SubLObject current_string = NIL;
			SubLObject cdolist_list_var = np_tree;
			SubLObject node = NIL;
			for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
				if ((node.isList() && second(node).isString()) && ((NIL != subl_promotions.memberP(node.first(), $adjectival_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(node.first(), $nominal_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED)))) {
					current_string = cons(second(node), current_string);
				} else {
					if ((node.isList() && (NIL != list_utilities.lengthE(node, TWO_INTEGER, UNPROVIDED))) && second(node).isString()) {
						if (NIL != list_utilities.lengthG(current_string, ONE_INTEGER, UNPROVIDED)) {
							compound_strings = cons(string_utilities.bunge(nreverse(current_string), UNPROVIDED), compound_strings);
						}
						current_string = NIL;
					} else {
						if (node.isList()) {
							compound_strings = cconcatenate(compound_strings, compounds_from_tree(node));
						}
					}
				}
			}
			if ((NIL != current_string) && (NIL != list_utilities.lengthG(current_string, ONE_INTEGER, UNPROVIDED))) {
				compound_strings = cons(string_utilities.bunge(nreverse(current_string), UNPROVIDED), compound_strings);
				current_string = NIL;
			}
			return compound_strings;
		}
	}

	public static SubLObject compounds_from_tree(final SubLObject np_tree) {
		SubLObject compound_strings = NIL;
		SubLObject current_string = NIL;
		SubLObject cdolist_list_var = np_tree;
		SubLObject node = NIL;
		node = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ((node.isList() && second(node).isString()) && ((NIL != subl_promotions.memberP(node.first(), $adjectival_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP(node.first(), $nominal_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED)))) {
				current_string = cons(second(node), current_string);
			} else if ((node.isList() && (NIL != list_utilities.lengthE(node, TWO_INTEGER, UNPROVIDED))) && second(node).isString()) {
				if (NIL != list_utilities.lengthG(current_string, ONE_INTEGER, UNPROVIDED)) {
					compound_strings = cons(string_utilities.bunge(nreverse(current_string), UNPROVIDED), compound_strings);
				}
				current_string = NIL;
			} else if (node.isList()) {
				compound_strings = cconcatenate(compound_strings, compounds_from_tree(node));
			}

			cdolist_list_var = cdolist_list_var.rest();
			node = cdolist_list_var.first();
		}
		if ((NIL != current_string) && (NIL != list_utilities.lengthG(current_string, ONE_INTEGER, UNPROVIDED))) {
			compound_strings = cons(string_utilities.bunge(nreverse(current_string), UNPROVIDED), compound_strings);
			current_string = NIL;
		}
		return compound_strings;
	}

	public static final SubLObject text_noun_compounds_alt(SubLObject str) {
		{
			SubLObject parse = parser.stanford_parse(str, UNPROVIDED, UNPROVIDED);
			SubLObject tree_nps = tree_nps(parse, UNPROVIDED);
			SubLObject compounds = Mapping.mapcan(COMPOUNDS_FROM_TREE, tree_nps, EMPTY_SUBL_OBJECT_ARRAY);
			return compounds;
		}
	}

	public static SubLObject text_noun_compounds(final SubLObject str) {
		final SubLObject parse = parser.stanford_parse(str, UNPROVIDED, UNPROVIDED);
		final SubLObject tree_nps = tree_nps(parse, UNPROVIDED);
		final SubLObject compounds = Mapping.mapcan(COMPOUNDS_FROM_TREE, tree_nps, EMPTY_SUBL_OBJECT_ARRAY);
		return compounds;
	}

	public static final SubLObject noun_compound_meanings_alt(SubLObject str) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject res = NIL;
				SubLObject ncs = text_noun_compounds(str);
				SubLObject cdolist_list_var = ncs;
				SubLObject nc = NIL;
				for (nc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), nc = cdolist_list_var.first()) {
					{
						SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
						SubLObject _prev_bind_1 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
						try {
							parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
							parsing_vars.$npp_use_nl_tagsP$.bind(T, thread);
							{
								SubLObject parses = psp_main.ps_get_cycls_for_phrase(nc, $list_alt454, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								res = cons(cons(nc, Mapping.mapcar(EXTRACT_PARSE_POS_PRED, parses)), res);
							}
						} finally {
							parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_1, thread);
							parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
						}
					}
				}
				return res;
			}
		}
	}

	public static SubLObject noun_compound_meanings(final SubLObject str) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject res = NIL;
		SubLObject cdolist_list_var;
		final SubLObject ncs = cdolist_list_var = text_noun_compounds(str);
		SubLObject nc = NIL;
		nc = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
			final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
			try {
				parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
				parsing_vars.$npp_use_nl_tagsP$.bind(T, thread);
				final SubLObject parses = psp_main.ps_get_cycls_for_phrase(nc, $list461, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				res = cons(cons(nc, Mapping.mapcar(EXTRACT_PARSE_POS_PRED, parses)), res);
			} finally {
				parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
				parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
			}
			cdolist_list_var = cdolist_list_var.rest();
			nc = cdolist_list_var.first();
		}
		return res;
	}

	public static final SubLObject noun_compound_meanings_of_string_alt(SubLObject str) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject parses = NIL;
				{
					SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
					SubLObject _prev_bind_1 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
					try {
						parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
						parsing_vars.$npp_use_nl_tagsP$.bind(T, thread);
						parses = psp_main.ps_get_cycls_for_phrase(str, $list_alt454, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					} finally {
						parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_1, thread);
						parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
					}
				}
				if (NIL != parses) {
					return cons(str, Mapping.mapcar(EXTRACT_PARSE_POS_PRED, parses));
				}
			}
			return NIL;
		}
	}

	public static SubLObject noun_compound_meanings_of_string(final SubLObject str) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject parses = NIL;
		final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
		final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
		try {
			parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
			parsing_vars.$npp_use_nl_tagsP$.bind(T, thread);
			parses = psp_main.ps_get_cycls_for_phrase(str, $list461, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
			parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
			parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
		}
		if (NIL != parses) {
			return cons(str, Mapping.mapcar(EXTRACT_PARSE_POS_PRED, parses));
		}
		return NIL;
	}

	public static final SubLObject extract_parse_pos_pred_alt(SubLObject parse) {
		{
			SubLObject pos_pred = pos_pred_from_nc_parse(parse);
			return list(parsing_utilities.strip_nl_tags(parse, UNPROVIDED), pos_pred);
		}
	}

	public static SubLObject extract_parse_pos_pred(final SubLObject parse) {
		final SubLObject pos_pred = pos_pred_from_nc_parse(parse);
		return list(parsing_utilities.strip_nl_tags(parse, UNPROVIDED), pos_pred);
	}

	public static final SubLObject pos_pred_from_nc_parse_alt(SubLObject parse) {
		if (NIL != formula_pattern_match.formula_matches_pattern(parse, $list_alt456)) {
			return $$plural_Generic;
		} else {
			if (NIL != formula_pattern_match.formula_matches_pattern(parse, $list_alt458)) {
				return $$singular_Generic;
			} else {
				if (NIL != formula_pattern_match.formula_matches_pattern(parse, $list_alt460)) {
					return $$massNumber_Generic;
				} else {
					return $$nounStrings;
				}
			}
		}
	}

	public static SubLObject pos_pred_from_nc_parse(final SubLObject parse) {
		if (NIL != formula_pattern_match.formula_matches_pattern(parse, $list463)) {
			return $$plural_Generic;
		}
		if (NIL != formula_pattern_match.formula_matches_pattern(parse, $list465)) {
			return $$singular_Generic;
		}
		if (NIL != formula_pattern_match.formula_matches_pattern(parse, $list467)) {
			return $$massNumber_Generic;
		}
		return $$nounStrings;
	}

	/**
	 *
	 *
	 * @param TEXT
	 * 		stringp; the text from which to learn lexical entries
	 * @return listp; a list of lexical entries learned from TEXT
	This is a stub just to make sure that all subclasses will be have a base
	implementation of this method, although we don't wish to give it a real
	implementation as a method of this class.
	 */
	@LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@return listp; a list of lexical entries learned from TEXT\r\nThis is a stub just to make sure that all subclasses will be have a base\r\nimplementation of this method, although we don\'t wish to give it a real\r\nimplementation as a method of this class.")
	public static final SubLObject abstract_lexicon_cooccurrence_statistics_learn_method_alt(SubLObject self, SubLObject text) {
		return NIL;
	}

	/**
	 *
	 *
	 * @param TEXT
	 * 		stringp; the text from which to learn lexical entries
	 * @return listp; a list of lexical entries learned from TEXT
	This is a stub just to make sure that all subclasses will be have a base
	implementation of this method, although we don't wish to give it a real
	implementation as a method of this class.
	 */
	@LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@return listp; a list of lexical entries learned from TEXT\r\nThis is a stub just to make sure that all subclasses will be have a base\r\nimplementation of this method, although we don\'t wish to give it a real\r\nimplementation as a method of this class.")
	public static SubLObject abstract_lexicon_cooccurrence_statistics_learn_method(final SubLObject self, final SubLObject text) {
		return NIL;
	}

	/**
	 *
	 *
	 * @param DOC
	document-p;
	 * 		
	 * @return document-p; a new version of DOC with adjacent words collapsed into
	single words and nl-trie-entries associated with the words in DOC
	 */
	@LispMethod(comment = "@param DOC\ndocument-p;\r\n\t\t\r\n@return document-p; a new version of DOC with adjacent words collapsed into\r\nsingle words and nl-trie-entries associated with the words in DOC")
	public static final SubLObject abstract_lexicon_lexify_document_method_alt(SubLObject self, SubLObject doc) {
		SubLTrampolineFile.checkType(doc, DOCUMENT_P);
		{
			SubLObject lexified = document.make_document(UNPROVIDED);
			SubLObject paragraphs = NIL;
			SubLObject vector_var = document.document_paragraphs(doc);
			SubLObject backwardP_var = NIL;
			SubLObject length = length(vector_var);
			SubLObject v_iteration = NIL;
			for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
				{
					SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
					SubLObject paragraph = aref(vector_var, element_num);
					paragraphs = cons(methods.funcall_instance_method_with_1_args(self, LEXIFY_PARAGRAPH, paragraph), paragraphs);
				}
			}
			document._csetf_document_paragraphs(lexified, apply(symbol_function(VECTOR), nreverse(paragraphs)));
			return lexified;
		}
	}

	/**
	 *
	 *
	 * @param DOC
	document-p;
	 * 		
	 * @return document-p; a new version of DOC with adjacent words collapsed into
	single words and nl-trie-entries associated with the words in DOC
	 */
	@LispMethod(comment = "@param DOC\ndocument-p;\r\n\t\t\r\n@return document-p; a new version of DOC with adjacent words collapsed into\r\nsingle words and nl-trie-entries associated with the words in DOC")
	public static SubLObject abstract_lexicon_lexify_document_method(final SubLObject self, final SubLObject doc) {
		assert NIL != document.document_p(doc) : "! document.document_p(doc) " + ("document.document_p(doc) " + "CommonSymbols.NIL != document.document_p(doc) ") + doc;
		final SubLObject lexified = document.make_document(UNPROVIDED);
		SubLObject paragraphs = NIL;
		final SubLObject vector_var = document.document_paragraphs(doc);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject element_num;
		SubLObject paragraph;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			paragraph = aref(vector_var, element_num);
			paragraphs = cons(methods.funcall_instance_method_with_1_args(self, LEXIFY_PARAGRAPH, paragraph), paragraphs);
		}
		document._csetf_document_paragraphs(lexified, apply(symbol_function(VECTOR), nreverse(paragraphs)));
		return lexified;
	}

	static private final SubLList $list_alt8 = list(new SubLObject[] { list(list(makeString("A_nx0V")), reader_make_constant_shell("Verb"), reader_make_constant_shell("IntransitiveVerbFrame"), reader_make_constant_shell("tensed")), list(list(makeString("A_nx0V")), reader_make_constant_shell("Verb"), reader_make_constant_shell("MiddleVoiceFrame"), reader_make_constant_shell("tensed")),
			list(list(makeString("A_nx0Vnx1")), reader_make_constant_shell("Verb"), reader_make_constant_shell("TransitiveNPFrame"), reader_make_constant_shell("tensed")), list(list(makeString("A_nx0Vnx1nx2"), makeString("A_nx0Vnx2nx1")), reader_make_constant_shell("Verb"), reader_make_constant_shell("DitransitiveNP-NPFrame"), reader_make_constant_shell("tensed")),
			list(list(makeString("A_nx0Vpnx1"), makeString("A_nx0Vpx1")), reader_make_constant_shell("Verb"), reader_make_constant_shell("TransitivePPFrameType"), reader_make_constant_shell("tensed")), list(list(makeString("A_nx0Vnx1pnx2"), makeString("A_nx0Vnx1px2")), reader_make_constant_shell("Verb"), reader_make_constant_shell("DitransitivePPFrameType"), reader_make_constant_shell("tensed")),
			list(list(makeString("A_nx0V")), reader_make_constant_shell("Verb"), reader_make_constant_shell("UnderstoodReciprocalObjectFrame"), reader_make_constant_shell("tensed")), list(list(makeString("A_Gnx0V")), reader_make_constant_shell("Verb"), reader_make_constant_shell("IntransitiveVerbFrame"), reader_make_constant_shell("presentParticiple")),
			list(list(makeString("A_Gnx0Vnx1")), reader_make_constant_shell("Verb"), reader_make_constant_shell("TransitiveNPFrame"), reader_make_constant_shell("presentParticiple")), list(list(makeString("A_Gnx0Vnx1nx2")), reader_make_constant_shell("Verb"), reader_make_constant_shell("DitransitiveNP-NPFrame"), reader_make_constant_shell("presentParticiple")),
			list(list(makeString("A_Gnx0Vpnx1"), makeString("A_Gnx0Vpx1")), reader_make_constant_shell("Verb"), reader_make_constant_shell("TransitivePPFrameType"), reader_make_constant_shell("presentParticiple")),
			list(list(makeString("A_Gnx0Vnx1pnx2"), makeString("A_Gnx0Vnx1px2"), makeString("B_Nn")), reader_make_constant_shell("Verb"), reader_make_constant_shell("DitransitivePPFrameType"), reader_make_constant_shell("presentParticiple")), list(list(makeString("B_Vvx")), reader_make_constant_shell("AuxVerb")),
			list(list(makeString("A_NXN"), makeString("B_Nn")), reader_make_constant_shell("Noun"), reader_make_constant_shell("RegularNounFrame"), reader_make_constant_shell("nounStrings")), list(list(makeString("A_NXN")), reader_make_constant_shell("Noun"), reader_make_constant_shell("GenitiveFrame"), reader_make_constant_shell("nounStrings")),
			list(list(makeString("B_nxPnx")), reader_make_constant_shell("Preposition"), reader_make_constant_shell("Post-NounPhraseModifyingFrame"), reader_make_constant_shell("prepositionStrings")), list(list(makeString("B_vxPnx")), reader_make_constant_shell("Preposition"), reader_make_constant_shell("VerbPhraseModifyingFrame"), reader_make_constant_shell("prepositionStrings")),
			list(list(makeString("B_Dnx")), reader_make_constant_shell("Determiner")), list(list(makeString("B_An")), reader_make_constant_shell("Adjective"), reader_make_constant_shell("RegularAdjFrame"), reader_make_constant_shell("adjStrings")),
			list(list(makeString("B_vxARB"), makeString("B_ARBvx"), makeString("B_ARBs")), reader_make_constant_shell("Adverb"), reader_make_constant_shell("VerbPhraseModifyingFrame"), reader_make_constant_shell("adverbStrings")) });

	public static SubLObject abstract_lexicon_lexify_document_exhaustively_method(final SubLObject self, final SubLObject doc) {
		assert NIL != document.document_p(doc) : "! document.document_p(doc) " + ("document.document_p(doc) " + "CommonSymbols.NIL != document.document_p(doc) ") + doc;
		final SubLObject lexified = document.make_document(UNPROVIDED);
		SubLObject paragraphs = NIL;
		final SubLObject vector_var = document.document_paragraphs(doc);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject element_num;
		SubLObject paragraph;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			paragraph = aref(vector_var, element_num);
			paragraphs = cons(methods.funcall_instance_method_with_1_args(self, LEXIFY_PARAGRAPH_EXHAUSTIVELY, paragraph), paragraphs);
		}
		document._csetf_document_paragraphs(lexified, apply(symbol_function(VECTOR), nreverse(paragraphs)));
		return lexified;
	}

	/**
	 *
	 *
	 * @param PAR
	paragraph-p;
	 * 		
	 * @return paraphraph-p; a new version of PAR with adjacent words collapsed into
	single words and nl-trie-entries associated with the words in PAR
	 */
	@LispMethod(comment = "@param PAR\nparagraph-p;\r\n\t\t\r\n@return paraphraph-p; a new version of PAR with adjacent words collapsed into\r\nsingle words and nl-trie-entries associated with the words in PAR")
	public static final SubLObject abstract_lexicon_lexify_paragraph_method_alt(SubLObject self, SubLObject par) {
		SubLTrampolineFile.checkType(par, PARAGRAPH_P);
		{
			SubLObject lexified = document.make_paragraph(UNPROVIDED);
			SubLObject sentences = NIL;
			SubLObject vector_var = document.paragraph_sentences(par);
			SubLObject backwardP_var = NIL;
			SubLObject length = length(vector_var);
			SubLObject v_iteration = NIL;
			for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
				{
					SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
					SubLObject sentence = aref(vector_var, element_num);
					sentences = cons(methods.funcall_instance_method_with_1_args(self, LEXIFY_SENTENCE, sentence), sentences);
				}
			}
			document._csetf_paragraph_sentences(lexified, apply(symbol_function(VECTOR), nreverse(sentences)));
			return lexified;
		}
	}

	/**
	 *
	 *
	 * @param PAR
	paragraph-p;
	 * 		
	 * @return paraphraph-p; a new version of PAR with adjacent words collapsed into
	single words and nl-trie-entries associated with the words in PAR
	 */
	@LispMethod(comment = "@param PAR\nparagraph-p;\r\n\t\t\r\n@return paraphraph-p; a new version of PAR with adjacent words collapsed into\r\nsingle words and nl-trie-entries associated with the words in PAR")
	public static SubLObject abstract_lexicon_lexify_paragraph_method(final SubLObject self, final SubLObject par) {
		assert NIL != document.paragraph_p(par) : "! document.paragraph_p(par) " + ("document.paragraph_p(par) " + "CommonSymbols.NIL != document.paragraph_p(par) ") + par;
		final SubLObject lexified = document.make_paragraph(UNPROVIDED);
		SubLObject sentences = NIL;
		final SubLObject vector_var = document.paragraph_sentences(par);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject element_num;
		SubLObject sentence;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			sentence = aref(vector_var, element_num);
			sentences = cons(methods.funcall_instance_method_with_1_args(self, LEXIFY_SENTENCE, sentence), sentences);
		}
		document._csetf_paragraph_sentences(lexified, apply(symbol_function(VECTOR), nreverse(sentences)));
		return lexified;
	}

	public static SubLObject abstract_lexicon_lexify_paragraph_exhaustively_method(final SubLObject self, final SubLObject par) {
		assert NIL != document.paragraph_p(par) : "! document.paragraph_p(par) " + ("document.paragraph_p(par) " + "CommonSymbols.NIL != document.paragraph_p(par) ") + par;
		final SubLObject lexified = document.make_paragraph(UNPROVIDED);
		SubLObject sentences = NIL;
		final SubLObject vector_var = document.paragraph_sentences(par);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject element_num;
		SubLObject sentence;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			sentence = aref(vector_var, element_num);
			sentences = cons(methods.funcall_instance_method_with_1_args(self, LEXIFY_SENTENCE_EXHAUSTIVELY, sentence), sentences);
		}
		document._csetf_paragraph_sentences(lexified, apply(symbol_function(VECTOR), nreverse(sentences)));
		return lexified;
	}

	/**
	 *
	 *
	 * @param sentence
	sentence-p;
	 * 		
	 * @return sentence-p; a new version of SENTENCE with adjacent words collapsed into
	single words and nl-trie-entries associated with the words in SENTENCE
	 */
	@LispMethod(comment = "@param sentence\nsentence-p;\r\n\t\t\r\n@return sentence-p; a new version of SENTENCE with adjacent words collapsed into\r\nsingle words and nl-trie-entries associated with the words in SENTENCE")
	public static final SubLObject abstract_lexicon_lexify_sentence_method_alt(SubLObject self, SubLObject sentence) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject catch_var_for_abstract_lexicon_method = NIL;
				SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
				SubLObject trie = get_abstract_lexicon_trie(self);
				try {
					try {
						SubLTrampolineFile.checkType(sentence, SENTENCE_P);
						if (document.sentence_length(sentence).isZero()) {
							sublisp_throw($sym479$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, sentence);
						}
						{
							SubLObject lexified = document.new_sentence(UNPROVIDED, UNPROVIDED);
							SubLObject word_vec = document.sentence_yield(sentence);
							SubLObject first_word = document.word_string(aref(word_vec, ZERO_INTEGER));
							SubLObject record_length = ZERO_INTEGER;
							SubLObject lexified_tokens = NIL;
							SubLObject words = NIL;
							pos_tagger.tagger_normalize_initial_capitalization(pos_tagger.get_tagger(), word_vec);
							words = vector_utilities.vector_elements(word_vec, UNPROVIDED);
							{
								SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
								try {
									lexicon_vars.$lexicon_lookup_mt$.bind($$InferencePSC, thread);
									{
										SubLObject index = NIL;
										SubLObject tokens = NIL;
										SubLObject strings = NIL;
										for (index = ZERO_INTEGER, tokens = words, strings = Mapping.mapcar(symbol_function(WORD_STRING), tokens); NIL != tokens; index = add(index, record_length), tokens = nthcdr(record_length, tokens), strings = nthcdr(record_length, strings)) {
											{
												SubLObject prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, case_sensitivity, UNPROVIDED);
												SubLObject new_token = NIL;
												SubLObject local_case_sensitivity = case_sensitivity;
												while (!((NIL != lexified_word_p(new_token)) || (NIL != list_utilities.empty_list_p(prefixes)))) {
													{
														SubLObject record = prefixes.first();
														prefixes = prefixes.rest();
														thread.resetMultipleValues();
														{
															SubLObject new_token_24 = get_lex_entries_for_prefix(self, tokens, strings, record, lexified);
															SubLObject record_length_25 = thread.secondMultipleValue();
															thread.resetMultipleValues();
															new_token = new_token_24;
															record_length = record_length_25;
														}
													}
													if (((NIL != list_utilities.empty_list_p(prefixes)) && (NIL == document.word_info(new_token))) && (local_case_sensitivity == $PREFERRED)) {
														local_case_sensitivity = $OFF;
														prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, local_case_sensitivity, UNPROVIDED);
													}
												}
												if (NIL == document.word_p(new_token)) {
													thread.resetMultipleValues();
													{
														SubLObject new_token_26 = get_lex_entries_for_prefix(self, tokens, strings, NIL, lexified);
														SubLObject record_length_27 = thread.secondMultipleValue();
														thread.resetMultipleValues();
														new_token = new_token_26;
														record_length = record_length_27;
													}
												}
												lexified_tokens = cons(new_token, lexified_tokens);
											}
										}
									}
								} finally {
									lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
								}
							}
							document._csetf_sign_constituents(lexified, apply(symbol_function(VECTOR), nreverse(lexified_tokens)));
							document.word_update(document.sentence_get(lexified, ZERO_INTEGER), list($STRING, replace(document.word_string(document.sentence_get(lexified, ZERO_INTEGER)), first_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
							document._csetf_sign_string(lexified, document.sentence_string(sentence));
							if (NIL != document.sentence_mother(sentence)) {
								document.paragraph_set(document.sentence_mother(sentence), document.sentence_index(sentence), lexified);
							}
							sublisp_throw($sym479$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexified);
						}
					} finally {
						{
							SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
								set_abstract_lexicon_trie(self, trie);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
							}
						}
					}
				} catch (Throwable ccatch_env_var) {
					catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym479$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
				}
				return catch_var_for_abstract_lexicon_method;
			}
		}
	}

	/**
	 *
	 *
	 * @param sentence
	sentence-p;
	 * 		
	 * @return sentence-p; a new version of SENTENCE with adjacent words collapsed into
	single words and nl-trie-entries associated with the words in SENTENCE
	 */
	@LispMethod(comment = "@param sentence\nsentence-p;\r\n\t\t\r\n@return sentence-p; a new version of SENTENCE with adjacent words collapsed into\r\nsingle words and nl-trie-entries associated with the words in SENTENCE")
	public static SubLObject abstract_lexicon_lexify_sentence_method(final SubLObject self, final SubLObject sentence) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != document.sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
				if (document.sentence_length(sentence).isZero()) {
					sublisp_throw($sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, sentence);
				}
				final SubLObject lexified = document.new_sentence(UNPROVIDED, UNPROVIDED);
				final SubLObject word_vec = document.sentence_yield(sentence);
				final SubLObject first_word = document.word_string(aref(word_vec, ZERO_INTEGER));
				SubLObject record_length = ZERO_INTEGER;
				SubLObject lexified_tokens = NIL;
				SubLObject words = NIL;
				final SubLObject tokenizing_stream = make_private_string_output_stream();
				pos_tagger.tagger_normalize_initial_capitalization(pos_tagger.get_tagger(), word_vec);
				words = vector_utilities.vector_elements(word_vec, UNPROVIDED);
				final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
				try {
					lexicon_vars.$lexicon_lookup_mt$.bind($$InferencePSC, thread);
					SubLObject index = NIL;
					SubLObject tokens = NIL;
					index = ZERO_INTEGER;
					for (tokens = words; NIL != tokens; tokens = nthcdr(record_length, tokens)) {
						SubLObject new_token_addedP = NIL;
						if (NIL == new_token_addedP) {
							SubLObject csome_list_var = nl_trie.nl_trie_string_tokenize_multiple(document.construct_string_from_words(tokens, NIL, tokenizing_stream));
							SubLObject strings = NIL;
							strings = csome_list_var.first();
							while ((NIL == new_token_addedP) && (NIL != csome_list_var)) {
								SubLObject prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, case_sensitivity, UNPROVIDED);
								SubLObject new_token = NIL;
								SubLObject local_case_sensitivity = case_sensitivity;
								SubLObject iteration_count = ZERO_INTEGER;
								while ((NIL == lexified_word_p(new_token)) && (NIL == list_utilities.empty_list_p(prefixes))) {
									iteration_count = add(iteration_count, ONE_INTEGER);
									if (iteration_count.numG(TWENTY_INTEGER)) {
										Errors.sublisp_break($str495$20_iterations_hit_inside_abstract, new SubLObject[] { sentence });
									}
									final SubLObject record = prefixes.first();
									prefixes = prefixes.rest();
									thread.resetMultipleValues();
									final SubLObject new_token_$25 = get_lex_entries_for_prefix(self, tokens, strings, record, lexified, UNPROVIDED);
									final SubLObject record_length_$26 = thread.secondMultipleValue();
									thread.resetMultipleValues();
									new_token = new_token_$25;
									record_length = record_length_$26;
									if (((NIL != list_utilities.empty_list_p(prefixes)) && (NIL == document.word_info(new_token))) && (local_case_sensitivity == $PREFERRED)) {
										local_case_sensitivity = $OFF;
										prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, local_case_sensitivity, UNPROVIDED);
									}
								}
								if (NIL == document.word_p(new_token)) {
									thread.resetMultipleValues();
									final SubLObject new_token_$26 = get_lex_entries_for_prefix(self, tokens, strings, NIL, lexified, UNPROVIDED);
									final SubLObject record_length_$27 = thread.secondMultipleValue();
									thread.resetMultipleValues();
									new_token = new_token_$26;
									record_length = record_length_$27;
								}
								if (!record_length.numE(ZERO_INTEGER)) {
									lexified_tokens = cons(new_token, lexified_tokens);
									new_token_addedP = T;
								}
								csome_list_var = csome_list_var.rest();
								strings = csome_list_var.first();
							}
						}
						index = add(index, record_length);
					}
				} finally {
					lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
				}
				document._csetf_sign_constituents(lexified, apply(symbol_function(VECTOR), nreverse(lexified_tokens)));
				if (!document.word_string(document.sentence_get(lexified, ZERO_INTEGER)).equal(first_word)) {
					document.word_update(document.sentence_get(lexified, ZERO_INTEGER), list($STRING, replace(document.word_string(document.sentence_get(lexified, ZERO_INTEGER)), first_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
				}
				document._csetf_sign_string(lexified, document.sentence_string(sentence));
				if (NIL != document.sentence_mother(sentence)) {
					document.paragraph_set(document.sentence_mother(sentence), document.sentence_index(sentence), lexified);
				}
				sublisp_throw($sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexified);
			} finally {
				final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	static private final SubLList $list_alt12 = list(makeSymbol("PARAGRAPH"), makeSymbol("SENTENCE"), makeSymbol("WORD"), makeSymbol("STRING"), makeSymbol("CANON"), makeSymbol("TYPE"));

	static private final SubLList $list_alt13 = list(makeKeyword("PARAGRAPH"), makeKeyword("SENTENCE"), $WORD, makeKeyword("STRING"), makeKeyword("CANON"), $TYPE);

	static private final SubLList $list_alt14 = list(makeSymbol("TEXTRACT-LEMMA-PARAGRAPH"), makeSymbol("TEXTRACT-LEMMA-SENTENCE"), makeSymbol("TEXTRACT-LEMMA-WORD"), makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("TEXTRACT-LEMMA-CANON"), makeSymbol("TEXTRACT-LEMMA-TYPE"));

	static private final SubLList $list_alt15 = list(makeSymbol("_CSETF-TEXTRACT-LEMMA-PARAGRAPH"), makeSymbol("_CSETF-TEXTRACT-LEMMA-SENTENCE"), makeSymbol("_CSETF-TEXTRACT-LEMMA-WORD"), makeSymbol("_CSETF-TEXTRACT-LEMMA-STRING"), makeSymbol("_CSETF-TEXTRACT-LEMMA-CANON"), makeSymbol("_CSETF-TEXTRACT-LEMMA-TYPE"));

	static private final SubLString $str_alt36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	static private final SubLList $list_alt39 = list(CHAR_lparen, CHAR_lbracket);

	static private final SubLList $list_alt40 = list(CHAR_lbracket, CHAR_rbracket);

	static private final SubLString $str_alt41$__TEXTRACT_LEMMA_ = makeString("#<TEXTRACT-LEMMA ");

	static private final SubLString $str_alt42$_ = makeString("/");

	static private final SubLString $str_alt43$_ = makeString(">");

	static private final SubLList $list_alt46 = list(new SubLObject[] {
			list(makeSymbol("STORED-PROPERTIES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"),
					list(QUOTE, list(new SubLObject[] { makeKeyword("STRING"), makeKeyword("WORD-UNIT"), makeKeyword("INFLECTIONS"), makeKeyword("PREDICATE"), makeKeyword("DENOTS"), makeKeyword("DENOT"), makeKeyword("PRAGMATICS"), makeKeyword("MT"), makeKeyword("SEMTRANS"), makeKeyword("FRAME"), makeKeyword("TRIE-ENTRY") }))),
			list(makeSymbol("COMPUTED-PROPERTIES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"),
					list(QUOTE,
							list(cons(makeKeyword("PENN-TAGS"), makeSymbol("COMPUTE-PENN-TAGS")), cons(makeKeyword("BACKOFF-PENN-TAGS"), makeSymbol("COMPUTE-BACKOFF-PENN-TAGS")), cons($TERM, makeSymbol("COMPUTE-TERM")), cons(makeKeyword("GENDER"), makeSymbol("COMPUTE-GENDER")), cons(makeKeyword("SUPER-TAGS"), makeSymbol("COMPUTE-SUPER-TAGS")), cons(makeKeyword("CYC-POS"), makeSymbol("COMPUTE-CYC-POS")),
									cons(makeKeyword("CYC-CATEGORY"), makeSymbol("COMPUTE-CYC-CATEGORY")), cons(makeKeyword("IS-NER-ENTRY?"), makeSymbol("COMPUTE-IS-NER-ENTRY"))))),
			list(makeSymbol("SUPPORTED-PROPERTIES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"),
					list(makeSymbol("APPEND"), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEX-ENTRY")), list(QUOTE, makeSymbol("STORED-PROPERTIES"))), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("CAR")), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEX-ENTRY")), list(QUOTE, makeSymbol("COMPUTED-PROPERTIES")))))),
			list(makeSymbol("PROPERTIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPY"), NIL, makeKeyword("PROTECTED")),
			list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), list(makeSymbol("PROPERTY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET"), list(makeSymbol("PROPERTY"), makeSymbol("VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOMINAL-P"), NIL, makeKeyword("PUBLIC")),
			list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VERBAL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADJECTIVAL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADVERBIAL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-PENN-TAGS"), NIL, makeKeyword("PROTECTED")),
			list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-BACKOFF-PENN-TAGS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-SUPER-TAGS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOUN?"), NIL, makeKeyword("PUBLIC")) });

	static private final SubLList $list_alt52 = list(new SubLObject[] { makeKeyword("STRING"), makeKeyword("WORD-UNIT"), makeKeyword("INFLECTIONS"), makeKeyword("PREDICATE"), makeKeyword("DENOTS"), makeKeyword("DENOT"), makeKeyword("PRAGMATICS"), makeKeyword("MT"), makeKeyword("SEMTRANS"), makeKeyword("FRAME"), makeKeyword("TRIE-ENTRY") });

	static private final SubLList $list_alt53 = list(cons(makeKeyword("PENN-TAGS"), makeSymbol("COMPUTE-PENN-TAGS")), cons(makeKeyword("BACKOFF-PENN-TAGS"), makeSymbol("COMPUTE-BACKOFF-PENN-TAGS")), cons($TERM, makeSymbol("COMPUTE-TERM")), cons(makeKeyword("GENDER"), makeSymbol("COMPUTE-GENDER")), cons(makeKeyword("SUPER-TAGS"), makeSymbol("COMPUTE-SUPER-TAGS")),
			cons(makeKeyword("CYC-POS"), makeSymbol("COMPUTE-CYC-POS")), cons(makeKeyword("CYC-CATEGORY"), makeSymbol("COMPUTE-CYC-CATEGORY")), cons(makeKeyword("IS-NER-ENTRY?"), makeSymbol("COMPUTE-IS-NER-ENTRY")));

	public static SubLObject abstract_lexicon_lexify_sentence_exhaustively_method(final SubLObject self, final SubLObject sentence) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != document.sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
				if (document.sentence_length(sentence).isZero()) {
					sublisp_throw($sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, sentence);
				}
				final SubLObject lexified = document.new_sentence(UNPROVIDED, UNPROVIDED);
				final SubLObject word_vec = document.sentence_yield(sentence);
				final SubLObject first_word = document.word_string(aref(word_vec, ZERO_INTEGER));
				SubLObject exhaustive_words = NIL;
				SubLObject words = NIL;
				pos_tagger.tagger_normalize_initial_capitalization(pos_tagger.get_tagger(), word_vec);
				words = vector_utilities.vector_elements(word_vec, UNPROVIDED);
				final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
				try {
					lexicon_vars.$lexicon_lookup_mt$.bind($$InferencePSC, thread);
					SubLObject index = NIL;
					SubLObject tokens = NIL;
					SubLObject strings = NIL;
					index = ZERO_INTEGER;
					for (tokens = words, strings = Mapping.mapcar(symbol_function(WORD_STRING), tokens); NIL != tokens; tokens = tokens.rest(), strings = strings.rest()) {
						final SubLObject prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, case_sensitivity, UNPROVIDED);
						final SubLObject parent_word = document.new_exhaustive_word_from_word(tokens.first());
						final SubLObject prefix_words = get_all_prefix_words(self, prefixes, tokens, strings, lexified, parent_word);
						document._csetf_sign_constituents(parent_word, apply(symbol_function(VECTOR), prefix_words));
						exhaustive_words = cons(parent_word, exhaustive_words);
						index = add(index, ONE_INTEGER);
					}
				} finally {
					lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
				}
				document._csetf_sign_constituents(lexified, apply(symbol_function(VECTOR), nreverse(exhaustive_words)));
				SubLObject cdolist_list_var = cons(document.sentence_get(lexified, ZERO_INTEGER), vector_utilities.vector_elements(document.word_constituents(document.sentence_get(lexified, ZERO_INTEGER)), UNPROVIDED));
				SubLObject first_word_obj = NIL;
				first_word_obj = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					document.word_update(first_word_obj, list($STRING, replace(document.word_string(first_word_obj), first_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
					cdolist_list_var = cdolist_list_var.rest();
					first_word_obj = cdolist_list_var.first();
				}
				document._csetf_sign_string(lexified, document.sentence_string(sentence));
				if (NIL != document.sentence_mother(sentence)) {
					document.paragraph_set(document.sentence_mother(sentence), document.sentence_index(sentence), lexified);
				}
				sublisp_throw($sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexified);
			} finally {
				final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	static private final SubLList $list_alt60 = list(makeKeyword("PROTECTED"));

	static private final SubLList $list_alt61 = list(makeString("@return lex-entry-p; a new empty lex-entry"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PROPERTIES"), NIL), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym62$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");

	static private final SubLList $list_alt65 = list(makeKeyword("PUBLIC"));

	static private final SubLList $list_alt66 = list(makeSymbol("PROPERTY"));

	static private final SubLList $list_alt67 = list(makeString("@return object; the property value associated with PROPERTY"), list(makeSymbol("MUST"), list(makeSymbol("MEMBER"), makeSymbol("PROPERTY"), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEX-ENTRY")), list(QUOTE, makeSymbol("SUPPORTED-PROPERTIES")))), makeString("Unsupported lexical property ~a"), makeSymbol("PROPERTY")),
			list(makeSymbol("CLET"), list(list(makeSymbol("VALUE"), list(makeSymbol("CDR"), list(makeSymbol("ASSOC"), makeSymbol("PROPERTY"), makeSymbol("PROPERTIES"))))),
					list(makeSymbol("PUNLESS"), makeSymbol("VALUE"),
							list(makeSymbol("CLET"), list(list(makeSymbol("PROPERTY-METHOD"), list(makeSymbol("CDR"), list(makeSymbol("ASSOC"), makeSymbol("PROPERTY"), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEX-ENTRY")), list(QUOTE, makeSymbol("COMPUTED-PROPERTIES"))))))),
									list(makeSymbol("PWHEN"), makeSymbol("PROPERTY-METHOD"), list(makeSymbol("CSETQ"), makeSymbol("VALUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), makeSymbol("PROPERTY-METHOD"))), list(makeSymbol("PWHEN"), makeSymbol("VALUE"), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("PROPERTY"), makeSymbol("VALUE")), makeSymbol("PROPERTIES")))))),
					list(RET, makeSymbol("VALUE"))));

	static private final SubLString $str_alt69$Unsupported_lexical_property__a = makeString("Unsupported lexical property ~a");

	static private final SubLList $list_alt75 = list(makeSymbol("PROPERTY"), makeSymbol("VALUE"));

	static private final SubLList $list_alt76 = list(makeString("Sets this lex-entry's PROPERTY to VALUE"), list(makeSymbol("MUST"), list(makeSymbol("MEMBER"), makeSymbol("PROPERTY"), list(makeSymbol("GET-SLOT"), list(QUOTE, makeSymbol("LEX-ENTRY")), list(QUOTE, makeSymbol("SUPPORTED-PROPERTIES")))), makeString("Unsupported lexical property ~a"), makeSymbol("PROPERTY")),
			list(makeSymbol("CSETQ"), makeSymbol("PROPERTIES"), list(makeSymbol("REMOVE"), makeSymbol("PROPERTY"), makeSymbol("PROPERTIES"), list(QUOTE, EQ), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("PROPERTY"), makeSymbol("VALUE")), makeSymbol("PROPERTIES")), list(RET, makeSymbol("VALUE")));

	static private final SubLSymbol $sym77$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");

	static private final SubLList $list_alt81 = list(makeString("make a deep-copy of self"),
			list(makeSymbol("CLET"), list(list(makeSymbol("NEW-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY")))), list(makeSymbol("NEW-PROPERTIES"), NIL)),
					list(makeSymbol("CDOLIST"), list(makeSymbol("KEY.VAL"), makeSymbol("PROPERTIES")),
							list(makeSymbol("CLET"), list(list(makeSymbol("NEW-KEY"), list(makeSymbol("CAR"), makeSymbol("KEY.VAL"))), list(makeSymbol("VAL"), list(makeSymbol("CDR"), makeSymbol("KEY.VAL"))), list(makeSymbol("NEW-VAL"), list(makeSymbol("FIF"), list(makeSymbol("LISTP"), makeSymbol("VAL")), list(makeSymbol("COPY-LIST"), makeSymbol("VAL")), makeSymbol("VAL")))),
									list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeSymbol("NEW-KEY"), makeSymbol("NEW-VAL")), makeSymbol("NEW-PROPERTIES")))),
					list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ENTRY"), list(QUOTE, makeSymbol("PROPERTIES")), makeSymbol("NEW-PROPERTIES")), list(RET, makeSymbol("NEW-ENTRY"))));

	public static SubLObject get_all_prefix_words(final SubLObject self, SubLObject prefixes, final SubLObject tokens, final SubLObject strings, final SubLObject lexified, final SubLObject parent_word) {
		SubLObject prefix_words = NIL;
		while (NIL == list_utilities.empty_list_p(prefixes)) {
			final SubLObject record = prefixes.first();
			prefixes = prefixes.rest();
			final SubLObject word_for_prefix = get_lex_entries_for_prefix(self, tokens, strings, record, lexified, NIL);
			if (NIL != word_for_prefix) {
				document._csetf_sign_mother(word_for_prefix, parent_word);
				prefix_words = cons(word_for_prefix, prefix_words);
			}
		}
		prefix_words = remove(NIL, prefix_words, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL == find(document.word_string(parent_word), prefix_words, symbol_function(EQUAL), WORD_STRING, UNPROVIDED, UNPROVIDED)) {
			prefix_words = cons(document.copy_word(tokens.first()), prefix_words);
		}
		return prefix_words;
	}

	static private final SubLSymbol $sym82$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");

	static private final SubLSymbol $sym84$NOUN_ = makeSymbol("NOUN?");

	static private final SubLList $list_alt85 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

	static private final SubLList $list_alt86 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeKeyword("ANY")));

	static private final SubLList $list_alt87 = list(makeString("@return booleanp; Does this LEX-ENTRY represent a noun?\n                     i.e. Is its :CYC-POS property value a spec of #$Noun?"), list(makeSymbol("CLET"), list(list(makeSymbol("POS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("CYC-POS")))),
			list(makeSymbol("PIF"), list(EQ, makeSymbol("MT"), makeKeyword("ANY")), list(RET, list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("POS"), reader_make_constant_shell("Noun"))), list(RET, list(makeSymbol("GENL?"), makeSymbol("POS"), reader_make_constant_shell("Noun"), makeSymbol("MT"))))));

	public static final SubLObject lexified_word_p_alt(SubLObject v_object) {
		return makeBoolean((NIL != document.word_p(v_object)) && (NIL != list_utilities.non_empty_list_p(document.word_info(v_object))));
	}

	public static SubLObject lexified_word_p(final SubLObject v_object) {
		return makeBoolean((NIL != document.word_p(v_object)) && (NIL != list_utilities.non_empty_list_p(document.word_info(v_object))));
	}

	public static final SubLObject possibly_merge_tokens_alt(SubLObject tokens) {
		{
			SubLObject result_tokens = NIL;
			SubLObject current_token = $str_alt482$;
			SubLObject cdolist_list_var = tokens;
			SubLObject token = NIL;
			for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), token = cdolist_list_var.first()) {
				if (NIL != Strings.stringE(token, $str_alt483$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
					current_token = token;
				} else {
					result_tokens = cons(cconcatenate(current_token, token), result_tokens);
					current_token = $str_alt482$;
				}
			}
			return nreverse(result_tokens);
		}
	}

	public static SubLObject possibly_merge_tokens(final SubLObject tokens) {
		SubLObject result_tokens = NIL;
		SubLObject current_token = $str500$;
		SubLObject cdolist_list_var = tokens;
		SubLObject token = NIL;
		token = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != Strings.stringE(token, $str501$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
				current_token = token;
			} else {
				result_tokens = cons(cconcatenate(current_token, token), result_tokens);
				current_token = $str500$;
			}
			cdolist_list_var = cdolist_list_var.rest();
			token = cdolist_list_var.first();
		}
		return nreverse(result_tokens);
	}

	static private final SubLSymbol $sym91$LEX_ENTRY_NOUN__METHOD = makeSymbol("LEX-ENTRY-NOUN?-METHOD");

	static private final SubLList $list_alt93 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

	static private final SubLList $list_alt94 = list(makeString("Prints this lex-entry to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<LEX-ENTRY "), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")),
			list(makeSymbol("CDOLIST"), list(makeSymbol("PROPERTY"), makeSymbol("PROPERTIES")), list(makeSymbol("PRIN1"), list(makeSymbol("CAR"), makeSymbol("PROPERTY")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" -> "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("CDR"), makeSymbol("PROPERTY")), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM"))),
			list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

	/**
	 *
	 *
	 * @param LEXICON
			abstract-lexicon-p
	 * 		
	 * @param TOKENS
	 * 		listp of words
	 * @param STRINGS
	 * 		listp of strings that can be used for nl-trie-prefixing
	 * @param RECORD
	 * 		nl-trie-record-p; and nl-trie-record that we're trying to use to create lexical entries
	 * @param LEXIFIED-SENTENCE
			sentence-p
	 * 		
	 * @unknown word-p; a new, fully-lexified word that is the first word the system could find from tokens
	 * @unknown integerp; how many strings from STRINGS did we use up?
	 */
	@LispMethod(comment = "@param LEXICON\n\t\tabstract-lexicon-p\r\n\t\t\r\n@param TOKENS\r\n\t\tlistp of words\r\n@param STRINGS\r\n\t\tlistp of strings that can be used for nl-trie-prefixing\r\n@param RECORD\r\n\t\tnl-trie-record-p; and nl-trie-record that we\'re trying to use to create lexical entries\r\n@param LEXIFIED-SENTENCE\n\t\tsentence-p\r\n\t\t\r\n@unknown word-p; a new, fully-lexified word that is the first word the system could find from tokens\r\n@unknown integerp; how many strings from STRINGS did we use up?")
	public static final SubLObject get_lex_entries_for_prefix(SubLObject lexicon, SubLObject tokens, SubLObject strings, SubLObject record, SubLObject lexified_sentence) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject new_word = NIL;
				SubLObject string = NIL;
				SubLObject first_token = tokens.first();
				SubLObject current_offset = (NIL != document.word_p(first_token)) ? ((SubLObject) (document.word_offset(first_token))) : Errors.error($$$word_has_no_offset);
				SubLObject record_length = NIL;
				SubLObject ignore_cacheP = methods.funcall_instance_method_with_0_args(lexicon, $sym176$IGNORE_CACHE_);
				SubLObject v_cache = instances.get_slot(lexicon, CACHE);
				SubLObject categories = NIL;
				SubLObject categories_orderedP = NIL;
				SubLObject lex_entries0 = NIL;
				SubLObject existsP = NIL;
				if (NIL == record) {
					record = nl_trie.new_nl_trie_record(list(document.word_string(tokens.first())), NIL);
				}
				record_length = length(nl_trie.nl_trie_record_key(record));
				string = reconstruct_string_from_tokens(list_utilities.first_n(record_length, strings), tokens);
				if (NIL == ignore_cacheP) {
					thread.resetMultipleValues();
					{
						SubLObject lex_entries0_28 = cache.cache_get(v_cache, string);
						SubLObject existsP_29 = thread.secondMultipleValue();
						thread.resetMultipleValues();
						lex_entries0 = lex_entries0_28;
						existsP = existsP_29;
					}
				}
				if (NIL == existsP) {
					{
						SubLObject cdolist_list_var = nl_trie.nl_trie_record_entries(record);
						SubLObject nl_trie_entry = NIL;
						for (nl_trie_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), nl_trie_entry = cdolist_list_var.first()) {
							if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym236$VALID_NL_TRIE_ENTRY_, nl_trie_entry)) {
								lex_entries0 = cconcatenate(lex_entries0, methods.funcall_instance_method_with_2_args(lexicon, CREATE_LEX_ENTRIES, string, nl_trie_entry));
							} else {
								if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym402$LEARNED_, nl_trie_entry)) {
									lex_entries0 = cons(nl_trie_entry, lex_entries0);
								}
							}
						}
					}
					if (NIL == ignore_cacheP) {
						cache.cache_set(v_cache, string, lex_entries0);
					}
				}
				thread.resetMultipleValues();
				{
					SubLObject categories_30 = order_penn_tags(list_utilities.first_n(record_length, tokens), lex_entries0);
					SubLObject categories_orderedP_31 = thread.secondMultipleValue();
					thread.resetMultipleValues();
					categories = categories_30;
					categories_orderedP = categories_orderedP_31;
				}
				{
					SubLObject lex_entries = NIL;
					SubLObject lex_entry_cat = categories.first();
					SubLObject doneP = NIL;
					if (((NIL != $lexify_sentence_ignore_pos_for_multiword_tokens$.getDynamicValue(thread)) && record_length.numG(ONE_INTEGER)) || (NIL == categories)) {
						lex_entries = lex_entries0;
					} else {
						if (NIL == doneP) {
							{
								SubLObject csome_list_var = categories;
								SubLObject category = NIL;
								for (category = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), category = csome_list_var.first()) {
									{
										SubLObject cdolist_list_var = lex_entries0;
										SubLObject lex_entry = NIL;
										for (lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex_entry = cdolist_list_var.first()) {
											if ((NIL == category) || (NIL != member(category, methods.funcall_instance_method_with_1_args(lex_entry, GET, $PENN_TAGS), EQ, UNPROVIDED))) {
												{
													SubLObject item_var = lex_entry;
													if (NIL == member(item_var, lex_entries, LEX_ENTRY_EQUAL_P, symbol_function(IDENTITY))) {
														lex_entries = cons(item_var, lex_entries);
													}
												}
												lex_entry_cat = category;
											}
										}
									}
									doneP = makeBoolean((NIL != categories_orderedP) && (NIL != lex_entries));
								}
							}
						}
					}
					new_word = document.new_word(list(new SubLObject[] { $STRING, string, $CATEGORY, lex_entry_cat, $MOTHER, lexified_sentence, $INFO, lex_entries, $OFFSET, current_offset }));
					if (!((NIL != lex_entries) || (NIL == instances.get_slot(lexicon, ALLOW_STEMMING)))) {
						{
							SubLObject copy_of_tokens = copy_list(tokens);
							thread.resetMultipleValues();
							{
								SubLObject unstemmed_tokens = unstemmed_tokens_from_tokens(copy_of_tokens, record, strings);
								SubLObject strings_32 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								if (NIL == token_list_equalp(unstemmed_tokens, tokens, UNPROVIDED)) {
									{
										SubLObject record_33 = nl_trie_accessors.nl_trie_prefixes_memoized(instances.get_slot(lexicon, TRIE), strings_32, instances.get_slot(lexicon, CASE_SENSITIVITY), UNPROVIDED).first();
										SubLObject my_new_word = NIL;
										thread.resetMultipleValues();
										{
											SubLObject my_new_word_34 = get_lex_entries_for_prefix(lexicon, unstemmed_tokens, strings_32, record_33, lexified_sentence);
											SubLObject record_length_35 = thread.secondMultipleValue();
											thread.resetMultipleValues();
											my_new_word = my_new_word_34;
											record_length = record_length_35;
										}
										if (NIL != my_new_word) {
											document.sign_update(new_word, list($INFO, document.sign_info(my_new_word), $STRING, document.sign_string(my_new_word)));
										}
									}
								}
							}
						}
					}
				}
				if (NIL != document.word_info(new_word)) {
					return values(new_word, record_length);
				} else {
					return values(tokens.first(), ONE_INTEGER);
				}
			}
		}
	}

	public static SubLObject get_lex_entries_for_prefix(final SubLObject lexicon, final SubLObject tokens, final SubLObject strings, SubLObject record, final SubLObject lexified_sentence, SubLObject return_empty_word_if_no_lex_entries) {
		if (return_empty_word_if_no_lex_entries == UNPROVIDED) {
			return_empty_word_if_no_lex_entries = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject new_word = NIL;
		SubLObject string = NIL;
		SubLObject relevant_tokens = NIL;
		final SubLObject first_token = tokens.first();
		final SubLObject current_offset = (NIL != document.word_p(first_token)) ? document.word_offset(first_token) : Errors.error($$$word_has_no_offset);
		SubLObject record_length = NIL;
		final SubLObject ignore_cacheP = methods.funcall_instance_method_with_0_args(lexicon, $sym182$IGNORE_CACHE_);
		final SubLObject v_cache = instances.get_slot(lexicon, CACHE);
		SubLObject categories = NIL;
		SubLObject categories_orderedP = NIL;
		SubLObject lex_entries0 = NIL;
		SubLObject existsP = NIL;
		if (NIL == record) {
			record = nl_trie.new_nl_trie_record(list(document.word_string(tokens.first())), NIL);
		}
		record_length = length(nl_trie.nl_trie_record_key(record));
		thread.resetMultipleValues();
		final SubLObject string_$29 = reconstruct_string_from_tokens(list_utilities.first_n(record_length, strings), tokens);
		final SubLObject relevant_tokens_$30 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		string = string_$29;
		relevant_tokens = relevant_tokens_$30;
		if (NIL == ignore_cacheP) {
			thread.resetMultipleValues();
			final SubLObject lex_entries0_$31 = cache.cache_get(v_cache, string);
			final SubLObject existsP_$32 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			lex_entries0 = lex_entries0_$31;
			existsP = existsP_$32;
		}
		if (NIL == existsP) {
			SubLObject cdolist_list_var = nl_trie.nl_trie_record_entries(record);
			SubLObject nl_trie_entry = NIL;
			nl_trie_entry = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym242$VALID_NL_TRIE_ENTRY_, nl_trie_entry)) {
					lex_entries0 = cconcatenate(lex_entries0, methods.funcall_instance_method_with_2_args(lexicon, CREATE_LEX_ENTRIES, string, nl_trie_entry));
				} else if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym409$LEARNED_, nl_trie_entry)) {
					lex_entries0 = cons(nl_trie_entry, lex_entries0);
				}

				cdolist_list_var = cdolist_list_var.rest();
				nl_trie_entry = cdolist_list_var.first();
			}
			if (NIL == ignore_cacheP) {
				cache.cache_set(v_cache, string, lex_entries0);
			}
		}
		thread.resetMultipleValues();
		final SubLObject categories_$33 = order_penn_tags(list_utilities.first_n(record_length, tokens), lex_entries0);
		final SubLObject categories_orderedP_$34 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		categories = categories_$33;
		categories_orderedP = categories_orderedP_$34;
		SubLObject lex_entries2 = NIL;
		SubLObject lex_entry_cat = categories.first();
		SubLObject doneP = NIL;
		if (((NIL != $lexify_sentence_ignore_pos_for_multiword_tokens$.getDynamicValue(thread)) && record_length.numG(ONE_INTEGER)) || (NIL == categories)) {
			lex_entries2 = lex_entries0;
		} else if (NIL == doneP) {
			SubLObject csome_list_var = categories;
			SubLObject category = NIL;
			category = csome_list_var.first();
			while ((NIL == doneP) && (NIL != csome_list_var)) {
				SubLObject cdolist_list_var2 = lex_entries0;
				SubLObject lex_entry = NIL;
				lex_entry = cdolist_list_var2.first();
				while (NIL != cdolist_list_var2) {
					if ((NIL == category) || (NIL != member(category, methods.funcall_instance_method_with_1_args(lex_entry, GET, $PENN_TAGS), EQ, UNPROVIDED))) {
						final SubLObject item_var = lex_entry;
						if (NIL == member(item_var, lex_entries2, LEX_ENTRY_EQUAL_P, symbol_function(IDENTITY))) {
							lex_entries2 = cons(item_var, lex_entries2);
						}
						lex_entry_cat = category;
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					lex_entry = cdolist_list_var2.first();
				}
				doneP = makeBoolean((NIL != categories_orderedP) && (NIL != lex_entries2));
				csome_list_var = csome_list_var.rest();
				category = csome_list_var.first();
			}
		}

		if (NIL != string) {
			new_word = document.new_word(list(new SubLObject[] { $STRING, string, $CATEGORY, lex_entry_cat, $MOTHER, lexified_sentence, $INFO, lex_entries2, $OFFSET, current_offset }));
			if ((NIL == lex_entries2) && (NIL != instances.get_slot(lexicon, ALLOW_STEMMING))) {
				final SubLObject copy_of_tokens = copy_list(tokens);
				thread.resetMultipleValues();
				final SubLObject unstemmed_tokens = unstemmed_tokens_from_tokens(copy_of_tokens, record, strings);
				final SubLObject strings_$35 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL == token_list_equalp(unstemmed_tokens, tokens, UNPROVIDED)) {
					final SubLObject record_$36 = nl_trie_accessors.nl_trie_prefixes_memoized(instances.get_slot(lexicon, TRIE), strings_$35, instances.get_slot(lexicon, CASE_SENSITIVITY), UNPROVIDED).first();
					SubLObject my_new_word = NIL;
					thread.resetMultipleValues();
					final SubLObject my_new_word_$37 = get_lex_entries_for_prefix(lexicon, unstemmed_tokens, strings_$35, record_$36, lexified_sentence, UNPROVIDED);
					final SubLObject record_length_$38 = thread.secondMultipleValue();
					thread.resetMultipleValues();
					my_new_word = my_new_word_$37;
					record_length = record_length_$38;
					if (NIL != my_new_word) {
						document.sign_update(new_word, list($INFO, document.sign_info(my_new_word), $STRING, document.sign_string(my_new_word)));
					}
				}
			}
		}
		if (((NIL != document.word_p(new_word)) && (NIL != document.word_info(new_word))) && (NIL != relevant_tokens)) {
			return values(new_word, length(relevant_tokens));
		}
		if (NIL != return_empty_word_if_no_lex_entries) {
			return values(tokens.first(), ONE_INTEGER);
		}
		return values(NIL, ONE_INTEGER);
	}

	static private final SubLSymbol $sym95$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");

	static private final SubLString $str_alt96$__LEX_ENTRY_ = makeString("#<LEX-ENTRY ");

	static private final SubLString $str_alt97$____ = makeString(" -> ");

	static private final SubLList $list_alt99 = list(makeKeyword("NN"), makeKeyword("NNS"), makeKeyword("NNP"), $NNPS, makeKeyword("WP"), makeKeyword("PP"), makeKeyword("PRP"), makeKeyword("FW"));

	static private final SubLList $list_alt100 = list(makeKeyword("VBZ"), makeKeyword("VBN"), makeKeyword("VBD"), makeKeyword("VBP"), makeKeyword("VB"), makeKeyword("VBG"));

	static private final SubLList $list_alt101 = list(makeKeyword("JJ"), makeKeyword("JJR"), makeKeyword("JJS"));

	static private final SubLList $list_alt102 = list(makeKeyword("RB"), makeKeyword("RBR"), makeKeyword("RBS"), makeKeyword("WRB"));

	static private final SubLList $list_alt104 = list(list(RET, list(makeSymbol("INTERSECTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")), makeSymbol("*NOMINAL-TAGS*"))));

	static private final SubLList $list_alt108 = list(list(RET, list(makeSymbol("INTERSECTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")), makeSymbol("*VERBAL-TAGS*"))));

	static private final SubLList $list_alt111 = list(list(RET, list(makeSymbol("INTERSECTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")), makeSymbol("*ADJECTIVAL-TAGS*"))));

	static private final SubLList $list_alt114 = list(list(RET, list(makeSymbol("INTERSECTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")), makeSymbol("*ADVERBIAL-TAGS*"))));

	static private final SubLList $list_alt117 = list(makeString("@return constantp; a single constant derived from this lex entry\'s\n    semantics"),
			list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NOMINAL-P"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("VERBAL-P")))), list(makeSymbol("ERROR"), makeString("Invalid lexical property :term called on ~a"), makeSymbol("SELF"))),
			list(makeSymbol("CLET"), list(list(makeSymbol("TERM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("DENOT")))),
					list(makeSymbol("PUNLESS"), makeSymbol("TERM"),
							list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS")))),
									list(makeSymbol("PWHEN"), makeSymbol("SEMTRANS"), list(makeSymbol("CLET"), list(list(makeSymbol("OPERATOR"), list(makeSymbol("FORMULA-OPERATOR"), makeSymbol("SEMTRANS")))),
											list(makeSymbol("PCOND"), list(list(makeSymbol("COR"), list(EQL, makeSymbol("OPERATOR"), reader_make_constant_shell("equals")), list(EQL, makeSymbol("OPERATOR"), reader_make_constant_shell("isa")), list(EQL, makeSymbol("OPERATOR"), reader_make_constant_shell("genls"))), list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("SEMTRANS")))),
													list(list(makeSymbol("COR"), list(makeSymbol("LOGICAL-CONNECTIVE-P"), list(makeSymbol("FORMULA-OPERATOR"), makeSymbol("SEMTRANS"))), list(makeSymbol("QUANTIFIER-P"), list(makeSymbol("FORMULA-OPERATOR"), makeSymbol("SEMTRANS")))),
															list(makeSymbol("CLET"), list(list(makeSymbol("CENTRAL-KEYWORD"), list(makeSymbol("FCOND"), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NOMINAL-P"))), $NOUN), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("VERBAL-P"))), makeKeyword("ACTION"))))),
																	list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("MAIN-COLLECTION"), makeSymbol("SEMTRANS"), makeSymbol("CENTRAL-KEYWORD"))))),
													list(T, list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("FORMULA-OPERATOR"), makeSymbol("SEMTRANS"))))))))),
					list(RET, makeSymbol("TERM"))));

	static private final SubLString $str_alt118$Invalid_lexical_property__term_ca = makeString("Invalid lexical property :term called on ~a");

	static private final SubLList $list_alt126 = list(makeString("@return listp;  a list of genders of this lex entry with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"), list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NOMINAL-P"))), list(makeSymbol("ERROR"), makeString("Invalid lexical property :gender called on ~a"), makeSymbol("SELF"))),
			list(makeSymbol("CLET"), list(makeSymbol("GENDERS"), list(makeSymbol("TERM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), $TERM))),
					list(makeSymbol("PIF"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), reader_make_constant_shell("MaleAnimal"), reader_make_constant_shell("EverythingPSC")), list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(QUOTE, list(makeKeyword("MASCULINE")))),
							list(makeSymbol("PIF"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), reader_make_constant_shell("FemaleAnimal"), reader_make_constant_shell("EverythingPSC")), list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(QUOTE, list(makeKeyword("FEMININE")))),
									list(makeSymbol("PIF"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), reader_make_constant_shell("Person"), reader_make_constant_shell("EverythingPSC")), list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(QUOTE, list(makeKeyword("MASCULINE"), makeKeyword("FEMININE")))),
											list(makeSymbol("PWHEN"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), reader_make_constant_shell("SentientAnimal"), reader_make_constant_shell("EverythingPSC")), list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(QUOTE, list(makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")))))))),
					list(makeSymbol("PUNLESS"), makeSymbol("GENDERS"), list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(QUOTE, list(makeKeyword("NEUTER"))))), list(RET, makeSymbol("GENDERS"))));

	/**
	 *
	 *
	 * @param STRINGS;
	 * 		listp of stringp
	 * @param TOKENS;
	 * 		listp of word-p
	 * @return stringp; a string correctly reconstructed from TOKENS consisting of just the words/phrases in STRINGS
	 */
	@LispMethod(comment = "@param STRINGS;\r\n\t\tlistp of stringp\r\n@param TOKENS;\r\n\t\tlistp of word-p\r\n@return stringp; a string correctly reconstructed from TOKENS consisting of just the words/phrases in STRINGS")
	public static final SubLObject reconstruct_string_from_tokens_alt(SubLObject strings, SubLObject tokens) {
		{
			SubLObject previous_word_end = document.word_offset(tokens.first());
			SubLObject done = NIL;
			SubLObject result_string = $str_alt482$;
			if (NIL == done) {
				{
					SubLObject string = NIL;
					SubLObject string_36 = NIL;
					SubLObject token = NIL;
					SubLObject token_37 = NIL;
					for (string = strings, string_36 = string.first(), token = tokens, token_37 = token.first(); !((NIL != done) || ((NIL == token) && (NIL == string))); string = string.rest(), string_36 = string.first(), token = token.rest(), token_37 = token.first()) {
						if (NIL != string_36) {
							{
								SubLObject cdotimes_end_var = subtract(document.word_offset(token_37), previous_word_end);
								SubLObject n = NIL;
								for (n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
									result_string = cconcatenate(result_string, $str_alt489$_);
								}
							}
							result_string = cconcatenate(result_string, string_36);
							previous_word_end = add(document.word_offset(token_37), document.word_length(token_37));
						} else {
							done = T;
						}
					}
				}
			}
			return result_string;
		}
	}

	/**
	 *
	 *
	 * @param STRINGS;
	 * 		listp of stringp
	 * @param TOKENS;
	 * 		listp of word-p
	 * @return stringp; a string correctly reconstructed from TOKENS consisting of just the words/phrases in STRINGS
	 */
	@LispMethod(comment = "@param STRINGS;\r\n\t\tlistp of stringp\r\n@param TOKENS;\r\n\t\tlistp of word-p\r\n@return stringp; a string correctly reconstructed from TOKENS consisting of just the words/phrases in STRINGS")
	public static SubLObject reconstruct_string_from_tokens(final SubLObject strings, final SubLObject tokens) {
		final SubLObject token_string = document.construct_string_from_words(tokens, T, UNPROVIDED);
		SubLObject current_search_result = NIL;
		SubLObject relevant_string = NIL;
		SubLObject token_count = ZERO_INTEGER;
		SubLObject current_search_result_$39 = NIL;
		SubLObject end = ZERO_INTEGER;
		SubLObject cdolist_list_var = strings;
		SubLObject str = NIL;
		str = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			current_search_result_$39 = search(str, token_string, EQUAL, IDENTITY, ZERO_INTEGER, NIL, end, UNPROVIDED);
			if (NIL == current_search_result_$39) {
				return NIL;
			}
			end = add(length(str), current_search_result_$39);
			cdolist_list_var = cdolist_list_var.rest();
			str = cdolist_list_var.first();
		}
		relevant_string = subseq(token_string, ZERO_INTEGER, end);
		SubLObject token_search_end = ZERO_INTEGER;
		SubLObject doneP = NIL;
		if (NIL == doneP) {
			SubLObject csome_list_var = tokens;
			SubLObject token = NIL;
			token = csome_list_var.first();
			while ((NIL == doneP) && (NIL != csome_list_var)) {
				final SubLObject standardized_token_strings = nl_trie.nl_trie_standardize_strings(list(document.word_string(token))).first();
				final SubLObject standardized_token_string = (NIL == standardized_token_strings) ? document.word_string(token) : standardized_token_strings.first();
				current_search_result = search(standardized_token_string, relevant_string, EQUAL, IDENTITY, ZERO_INTEGER, NIL, token_search_end, UNPROVIDED);
				if ((NIL == doneP) && (NIL != current_search_result)) {
					token_count = add(token_count, ONE_INTEGER);
					token_search_end = add(length(document.word_string(token)), current_search_result);
				} else {
					doneP = T;
				}
				csome_list_var = csome_list_var.rest();
				token = csome_list_var.first();
			}
		}
		return values(relevant_string, subseq(tokens, ZERO_INTEGER, token_count));
	}

	static private final SubLString $str_alt127$Invalid_lexical_property__gender_ = makeString("Invalid lexical property :gender called on ~a");

	static private final SubLList $list_alt130 = list(makeKeyword("MASCULINE"));

	static private final SubLList $list_alt132 = list(makeKeyword("FEMININE"));

	static private final SubLList $list_alt134 = list(makeKeyword("MASCULINE"), makeKeyword("FEMININE"));

	static private final SubLList $list_alt136 = list(makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER"));

	static private final SubLList $list_alt137 = list(makeKeyword("NEUTER"));

	/**
	 *
	 *
	 * @param TOKEN-LIST1
	 * 		listp of words
	 * @param TOKEN-LIST2
	 * 		listp of words
	 * @return boolean; are the strings for the words in TOKEN-LIST1 the same as in TOKEN-LIST2
	 */
	@LispMethod(comment = "@param TOKEN-LIST1\r\n\t\tlistp of words\r\n@param TOKEN-LIST2\r\n\t\tlistp of words\r\n@return boolean; are the strings for the words in TOKEN-LIST1 the same as in TOKEN-LIST2")
	public static final SubLObject token_list_equalp_alt(SubLObject token_list1, SubLObject token_list2, SubLObject test) {
		if (test == UNPROVIDED) {
			test = EQUAL;
		}
		{
			SubLObject token1 = NIL;
			SubLObject token1_38 = NIL;
			SubLObject token2 = NIL;
			SubLObject token2_39 = NIL;
			for (token1 = token_list1, token1_38 = token1.first(), token2 = token_list2, token2_39 = token2.first(); !((NIL == token2) && (NIL == token1)); token1 = token1.rest(), token1_38 = token1.first(), token2 = token2.rest(), token2_39 = token2.first()) {
				if (NIL == funcall(test, document.word_string(token1_38), document.word_string(token2_39))) {
					return NIL;
				}
			}
		}
		return T;
	}

	/**
	 *
	 *
	 * @param TOKEN-LIST1
	 * 		listp of words
	 * @param TOKEN-LIST2
	 * 		listp of words
	 * @return boolean; are the strings for the words in TOKEN-LIST1 the same as in TOKEN-LIST2
	 */
	@LispMethod(comment = "@param TOKEN-LIST1\r\n\t\tlistp of words\r\n@param TOKEN-LIST2\r\n\t\tlistp of words\r\n@return boolean; are the strings for the words in TOKEN-LIST1 the same as in TOKEN-LIST2")
	public static SubLObject token_list_equalp(final SubLObject token_list1, final SubLObject token_list2, SubLObject test) {
		if (test == UNPROVIDED) {
			test = EQUAL;
		}
		SubLObject token1 = NIL;
		SubLObject token1_$40 = NIL;
		SubLObject token2 = NIL;
		SubLObject token2_$41 = NIL;
		token1 = token_list1;
		token1_$40 = token1.first();
		token2 = token_list2;
		token2_$41 = token2.first();
		while ((NIL != token2) || (NIL != token1)) {
			if (NIL == funcall(test, document.word_string(token1_$40), document.word_string(token2_$41))) {
				return NIL;
			}
			token1 = token1.rest();
			token1_$40 = token1.first();
			token2 = token2.rest();
			token2_$41 = token2.first();
		}
		return T;
	}

	static private final SubLList $list_alt140 = list(makeString("@return listp; the Penn part-of-speech tags of this lex-entry"),
			list(makeSymbol("CLET"), list(list(makeSymbol("POS"), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("CYC-POS"))), list(makeSymbol("INFLECTIONS"), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("INFLECTIONS"))), list(makeSymbol("STRING"), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("STRING"))), list(makeSymbol("PENN-TAGS"), NIL)),
					list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(EQ, makeSymbol("POS"), reader_make_constant_shell("Preposition")), list(EQUALP, makeSymbol("STRING"), makeString("to"))), list(makeSymbol("CPUSH"), makeKeyword("TO"), makeSymbol("PENN-TAGS"))),
							list(T, list(makeSymbol("CDOLIST"), list(makeSymbol("INFLECTION"), makeSymbol("INFLECTIONS")), list(makeSymbol("CLET"), list(list(makeSymbol("PENN-TAG"), list(makeSymbol("MAP-FROM-CYC-TO-PENN-POS"), makeSymbol("POS"), makeSymbol("INFLECTION")))), list(makeSymbol("PWHEN"), makeSymbol("PENN-TAG"), list(makeSymbol("CPUSH"), makeSymbol("PENN-TAG"), makeSymbol("PENN-TAGS"))))))),
					list(RET, list(makeSymbol("REMOVE-DUPLICATES"), makeSymbol("PENN-TAGS"), list(QUOTE, EQ)))));

	/**
	 *
	 *
	 * @param TOKENS
	 * 		listp of words
	 * @param RECORD
	nl-trie-record-p
	 * 		
	 * @param STRINGS
	 * 		listp of strings
	 * @unknown listp; a new list of tokens with a stemmed version of the head-word of RECORD
	 * @unknown listp; a list of strings that can be used for looking up new trie entries
	 */
	@LispMethod(comment = "@param TOKENS\r\n\t\tlistp of words\r\n@param RECORD\nnl-trie-record-p\r\n\t\t\r\n@param STRINGS\r\n\t\tlistp of strings\r\n@unknown listp; a new list of tokens with a stemmed version of the head-word of RECORD\r\n@unknown listp; a list of strings that can be used for looking up new trie entries")
	public static final SubLObject unstemmed_tokens_from_tokens_alt(SubLObject tokens, SubLObject record, SubLObject strings) {
		{
			SubLObject last_word_string = last(nl_trie.nl_trie_record_key(record), UNPROVIDED).first();
			SubLObject stemmed_last_word_string = morphology.find_stem_memoized(last_word_string, UNPROVIDED);
			SubLObject corresponding_token_list = nthcdr(subtract(length(nl_trie.nl_trie_record_key(record)), ONE_INTEGER), tokens);
			SubLObject unstemmed_last_token = document.copy_word(corresponding_token_list.first());
			SubLObject new_strings = list_utilities.replace_nth(subtract(length(nl_trie.nl_trie_record_key(record)), ONE_INTEGER), stemmed_last_word_string, strings);
			document.set_word_string(unstemmed_last_token, stemmed_last_word_string);
			rplaca(corresponding_token_list, unstemmed_last_token);
			return values(tokens, new_strings);
		}
	}

	/**
	 *
	 *
	 * @param TOKENS
	 * 		listp of words
	 * @param RECORD
	nl-trie-record-p
	 * 		
	 * @param STRINGS
	 * 		listp of strings
	 * @unknown listp; a new list of tokens with a stemmed version of the head-word of RECORD
	 * @unknown listp; a list of strings that can be used for looking up new trie entries
	 */
	@LispMethod(comment = "@param TOKENS\r\n\t\tlistp of words\r\n@param RECORD\nnl-trie-record-p\r\n\t\t\r\n@param STRINGS\r\n\t\tlistp of strings\r\n@unknown listp; a new list of tokens with a stemmed version of the head-word of RECORD\r\n@unknown listp; a list of strings that can be used for looking up new trie entries")
	public static SubLObject unstemmed_tokens_from_tokens(final SubLObject tokens, final SubLObject record, final SubLObject strings) {
		final SubLObject last_word_string = last(nl_trie.nl_trie_record_key(record), UNPROVIDED).first();
		final SubLObject stemmed_last_word_string = morphology.find_stem_memoized(last_word_string, UNPROVIDED);
		final SubLObject corresponding_token_list = nthcdr(subtract(length(nl_trie.nl_trie_record_key(record)), ONE_INTEGER), tokens);
		final SubLObject unstemmed_last_token = document.copy_word(corresponding_token_list.first());
		final SubLObject new_strings = list_utilities.replace_nth(subtract(length(nl_trie.nl_trie_record_key(record)), ONE_INTEGER), stemmed_last_word_string, strings);
		document.set_word_string(unstemmed_last_token, stemmed_last_word_string);
		rplaca(corresponding_token_list, unstemmed_last_token);
		return values(tokens, new_strings);
	}

	static private final SubLList $list_alt147 = list(makeString("@return listp; the Penn part-of-speech tags of this lex-entry, plus additional tags\n   that are easily confused with the accurate ones"), list(makeSymbol("CLET"), list(list(makeSymbol("PENN-TAGS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")))),
			list(makeSymbol("CDOLIST"), list(makeSymbol("TAG"), makeSymbol("PENN-TAGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("BACKOFF"), list(makeSymbol("TAG-BACKOFFS"), makeSymbol("TAG"))), list(makeSymbol("PUNLESS"), list(EQ, makeSymbol("BACKOFF"), makeSymbol("TAG")), list(makeSymbol("CPUSH"), makeSymbol("BACKOFF"), makeSymbol("PENN-TAGS"))))), list(RET, makeSymbol("PENN-TAGS"))));

	/**
	 *
	 *
	 * @param TOKENS
	listp
	 * 		
	 * @return listp of keywordp's; the (heuristically ordered) Penn part-of-speech tags for
	identified multi-word lexeme TOKENS
	 * @unknown this function currently just puts the best tag first, and the rest of the tags are
	arbitrarily ordered.
	 */
	@LispMethod(comment = "@param TOKENS\nlistp\r\n\t\t\r\n@return listp of keywordp\'s; the (heuristically ordered) Penn part-of-speech tags for\r\nidentified multi-word lexeme TOKENS\r\n@unknown this function currently just puts the best tag first, and the rest of the tags are\r\narbitrarily ordered.")
	public static final SubLObject order_penn_tags_alt(SubLObject tokens, SubLObject lex_entries) {
		{
			SubLObject first_word = tokens.first();
			SubLObject first_tag = document.word_category(first_word);
			SubLObject last_word = last(tokens, UNPROVIDED).first();
			SubLObject last_tag = document.word_category(last_word);
			SubLObject record_tags = entries_tags(lex_entries);
			SubLObject orderedP = makeBoolean((NIL != last_tag) || (NIL != first_tag));
			if (NIL == subl_promotions.memberP(first_tag, $list_alt490, UNPROVIDED, UNPROVIDED)) {
				if (NIL != member(last_tag, record_tags, UNPROVIDED, UNPROVIDED)) {
					return values(cons(last_tag, remove(last_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP);
				} else {
					if (NIL != member(last_tag, $list_alt491, UNPROVIDED, UNPROVIDED)) {
						return values(cons(first_tag, remove(first_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP);
					} else {
						if (NIL != member(last_tag, entries_backoff_tags(lex_entries), UNPROVIDED, UNPROVIDED)) {
							return values(record_tags, orderedP);
						} else {
							if ((NIL != subl_promotions.memberP(first_tag, record_tags, UNPROVIDED, UNPROVIDED)) && (NIL != some_head_initial_lex_entry_has_tag(lex_entries, first_tag))) {
								return values(cons(first_tag, remove(first_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP);
							} else {
								if (NIL != last_tag) {
									return values(list(last_tag), orderedP);
								} else {
									return values(record_tags, orderedP);
								}
							}
						}
					}
				}
			} else {
				if (NIL != member(first_tag, record_tags, UNPROVIDED, UNPROVIDED)) {
					return values(cons(first_tag, remove(first_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP);
				} else {
					if (NIL != member(first_tag, entries_backoff_tags(lex_entries), UNPROVIDED, UNPROVIDED)) {
						return values(tags_matching_backoff_tags(first_tag, lex_entries), orderedP);
					} else {
						return values(cons(first_tag, tag_backoffs(first_tag)), orderedP);
					}
				}
			}
		}
	}

	/**
	 *
	 *
	 * @param TOKENS
	listp
	 * 		
	 * @return listp of keywordp's; the (heuristically ordered) Penn part-of-speech tags for
	identified multi-word lexeme TOKENS
	 * @unknown this function currently just puts the best tag first, and the rest of the tags are
	arbitrarily ordered.
	 */
	@LispMethod(comment = "@param TOKENS\nlistp\r\n\t\t\r\n@return listp of keywordp\'s; the (heuristically ordered) Penn part-of-speech tags for\r\nidentified multi-word lexeme TOKENS\r\n@unknown this function currently just puts the best tag first, and the rest of the tags are\r\narbitrarily ordered.")
	public static SubLObject order_penn_tags(final SubLObject tokens, final SubLObject lex_entries) {
		final SubLObject first_word = tokens.first();
		final SubLObject first_tag = document.word_category(first_word);
		final SubLObject last_word = last(tokens, UNPROVIDED).first();
		final SubLObject last_tag = document.word_category(last_word);
		final SubLObject record_tags = entries_tags(lex_entries);
		final SubLObject orderedP = makeBoolean((NIL != last_tag) || (NIL != first_tag));
		if (NIL == subl_promotions.memberP(first_tag, $list507, UNPROVIDED, UNPROVIDED)) {
			if (NIL != member(last_tag, record_tags, UNPROVIDED, UNPROVIDED)) {
				return values(cons(last_tag, remove(last_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP);
			}
			if (NIL != member(last_tag, $list508, UNPROVIDED, UNPROVIDED)) {
				return values(cons(first_tag, remove(first_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP);
			}
			if (NIL != member(last_tag, entries_backoff_tags(lex_entries), UNPROVIDED, UNPROVIDED)) {
				return values(record_tags, orderedP);
			}
			if ((NIL != subl_promotions.memberP(first_tag, record_tags, UNPROVIDED, UNPROVIDED)) && (NIL != some_head_initial_lex_entry_has_tag(lex_entries, first_tag))) {
				return values(cons(first_tag, remove(first_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP);
			}
			if (NIL != last_tag) {
				return values(list(last_tag), orderedP);
			}
			return values(record_tags, orderedP);
		} else {
			if (NIL != member(first_tag, record_tags, UNPROVIDED, UNPROVIDED)) {
				return values(cons(first_tag, remove(first_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP);
			}
			if (NIL != member(first_tag, entries_backoff_tags(lex_entries), UNPROVIDED, UNPROVIDED)) {
				return values(tags_matching_backoff_tags(first_tag, lex_entries), orderedP);
			}
			return values(cons(first_tag, tag_backoffs(first_tag)), orderedP);
		}
	}

	static private final SubLList $list_alt149 = list(list(makeKeyword("NN"), makeKeyword("VBG")), list(makeKeyword("JJ"), makeKeyword("VBN"), makeKeyword("VBD")), list(makeKeyword("NNP"), $NNPS, makeKeyword("NN"), makeKeyword("NNS"), makeKeyword("$"), makeKeyword("CD")));

	static private final SubLList $list_alt151 = list(makeString("@return stringp; the super tag of this lex-entry"),
			list(makeSymbol("CLET"), list(list(makeSymbol("SUPERTAGS"), NIL)),
					list(makeSymbol("CDOLIST"), list(makeSymbol("INFL"), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("INFLECTIONS"))), list(makeSymbol("CDOLIST"),
							list(makeSymbol("SUPERTAG"), list(makeSymbol("GETHASH"), list(makeSymbol("LIST"), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("CYC-POS")), list(makeSymbol("GET"), makeSymbol("SELF"), makeKeyword("FRAME")), makeSymbol("INFL")), makeSymbol("*CYC-TO-SUPERTAG-MAP*"))), list(makeSymbol("CPUSHNEW"), makeSymbol("SUPERTAG"), makeSymbol("SUPERTAGS"), list(QUOTE, EQUAL)))),
					list(RET, makeSymbol("SUPERTAGS"))));

	static private final SubLList $list_alt155 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-ENTRY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("TRIE-ENTRY")))),
			list(makeSymbol("PCOND"), list(makeSymbol("TRIE-ENTRY"), list(RET, list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("TRIE-ENTRY")))), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("INFLECTIONS")),
					list(makeSymbol("CDOLIST"), list(makeSymbol("PRED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("INFLECTIONS"))), list(makeSymbol("CLET"), list(list(makeSymbol("POS"), list(makeSymbol("POS-OF-PRED"), makeSymbol("PRED")))), list(makeSymbol("PWHEN"), makeSymbol("POS"), list(RET, makeSymbol("POS"))))))),
			list(RET, NIL)));

	public static final SubLObject some_head_initial_lex_entry_has_tag_alt(SubLObject lex_entries, SubLObject tag) {
		{
			SubLObject cdolist_list_var = lex_entries;
			SubLObject lex_entry = NIL;
			for (lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex_entry = cdolist_list_var.first()) {
				if ((methods.funcall_instance_method_with_1_args(lex_entry, GET, $PENN_TAGS) == tag) && (methods.funcall_instance_method_with_1_args(lex_entry, GET, $PREDICATE) == $$multiWordString)) {
					return T;
				}
			}
		}
		return NIL;
	}

	public static SubLObject some_head_initial_lex_entry_has_tag(final SubLObject lex_entries, final SubLObject tag) {
		SubLObject cdolist_list_var = lex_entries;
		SubLObject lex_entry = NIL;
		lex_entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (methods.funcall_instance_method_with_1_args(lex_entry, GET, $PENN_TAGS).eql(tag) && methods.funcall_instance_method_with_1_args(lex_entry, GET, $PREDICATE).eql($$multiWordString)) {
				return T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			lex_entry = cdolist_list_var.first();
		}
		return NIL;
	}

	public static final SubLObject entries_tags_alt(SubLObject entries) {
		{
			SubLObject tags = NIL;
			SubLObject cdolist_list_var = entries;
			SubLObject entry = NIL;
			for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_40 = methods.funcall_instance_method_with_1_args(entry, GET, $PENN_TAGS);
					SubLObject tag = NIL;
					for (tag = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest(), tag = cdolist_list_var_40.first()) {
						{
							SubLObject item_var = tag;
							if (NIL == member(item_var, tags, symbol_function(EQL), symbol_function(IDENTITY))) {
								tags = cons(item_var, tags);
							}
						}
					}
				}
			}
			return tags;
		}
	}

	public static SubLObject entries_tags(final SubLObject entries) {
		SubLObject tags = NIL;
		SubLObject cdolist_list_var = entries;
		SubLObject entry = NIL;
		entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$42 = methods.funcall_instance_method_with_1_args(entry, GET, $PENN_TAGS);
			SubLObject tag = NIL;
			tag = cdolist_list_var_$42.first();
			while (NIL != cdolist_list_var_$42) {
				final SubLObject item_var = tag;
				if (NIL == member(item_var, tags, symbol_function(EQL), symbol_function(IDENTITY))) {
					tags = cons(item_var, tags);
				}
				cdolist_list_var_$42 = cdolist_list_var_$42.rest();
				tag = cdolist_list_var_$42.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		return tags;
	}

	static private final SubLList $list_alt158 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-ENTRY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("TRIE-ENTRY")))), list(RET, list(makeSymbol("CNOT"), makeSymbol("TRIE-ENTRY")))));

	static private final SubLList $list_alt161 = list(makeString("What is the syntactic category of this lexical entry.  Unlike cyc-pos, this does not assume that each \n   entry is a part-of-speech.  In some cases, the category may be a XP, not just an X0"), list(makeSymbol("CLET"), list(list(makeSymbol("PRED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("PREDICATE")))),
			list(makeSymbol("PWHEN"), list(makeSymbol("NAME-STRING-PRED?"), makeSymbol("PRED")), list(RET, reader_make_constant_shell("NounPhrase"))), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("CYC-POS")))));

	public static final SubLObject entries_backoff_tags_alt(SubLObject entries) {
		{
			SubLObject backoff_tags = NIL;
			SubLObject cdolist_list_var = entries;
			SubLObject entry = NIL;
			for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
				{
					SubLObject cdolist_list_var_41 = methods.funcall_instance_method_with_1_args(entry, GET, $BACKOFF_PENN_TAGS);
					SubLObject tag = NIL;
					for (tag = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest(), tag = cdolist_list_var_41.first()) {
						{
							SubLObject item_var = tag;
							if (NIL == member(item_var, backoff_tags, symbol_function(EQL), symbol_function(IDENTITY))) {
								backoff_tags = cons(item_var, backoff_tags);
							}
						}
					}
				}
			}
			return backoff_tags;
		}
	}

	public static SubLObject entries_backoff_tags(final SubLObject entries) {
		SubLObject backoff_tags = NIL;
		SubLObject cdolist_list_var = entries;
		SubLObject entry = NIL;
		entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$43 = methods.funcall_instance_method_with_1_args(entry, GET, $BACKOFF_PENN_TAGS);
			SubLObject tag = NIL;
			tag = cdolist_list_var_$43.first();
			while (NIL != cdolist_list_var_$43) {
				final SubLObject item_var = tag;
				if (NIL == member(item_var, backoff_tags, symbol_function(EQL), symbol_function(IDENTITY))) {
					backoff_tags = cons(item_var, backoff_tags);
				}
				cdolist_list_var_$43 = cdolist_list_var_$43.rest();
				tag = cdolist_list_var_$43.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		return backoff_tags;
	}

	static private final SubLList $list_alt166 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-ENTRY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeKeyword("TRIE-ENTRY")))), list(makeSymbol("PWHEN"), makeSymbol("TRIE-ENTRY"), list(RET, list(makeSymbol("NL-TRIE-ENTRY-POS-PREDS"), makeSymbol("TRIE-ENTRY")))), list(RET, NIL)));

	public static final SubLObject tags_matching_backoff_tags_alt(SubLObject known_tag, SubLObject lex_entries) {
		{
			SubLObject matching_tags = NIL;
			SubLObject cdolist_list_var = lex_entries;
			SubLObject lex_entry = NIL;
			for (lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex_entry = cdolist_list_var.first()) {
				if (NIL != subl_promotions.memberP(known_tag, methods.funcall_instance_method_with_1_args(lex_entry, GET, $BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
					matching_tags = union(matching_tags, methods.funcall_instance_method_with_1_args(lex_entry, GET, $PENN_TAGS), UNPROVIDED, UNPROVIDED);
				}
			}
			return matching_tags;
		}
	}

	public static SubLObject tags_matching_backoff_tags(final SubLObject known_tag, final SubLObject lex_entries) {
		SubLObject matching_tags = NIL;
		SubLObject cdolist_list_var = lex_entries;
		SubLObject lex_entry = NIL;
		lex_entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != subl_promotions.memberP(known_tag, methods.funcall_instance_method_with_1_args(lex_entry, GET, $BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
				matching_tags = union(matching_tags, methods.funcall_instance_method_with_1_args(lex_entry, GET, $PENN_TAGS), UNPROVIDED, UNPROVIDED);
			}
			cdolist_list_var = cdolist_list_var.rest();
			lex_entry = cdolist_list_var.first();
		}
		return matching_tags;
	}

	public static final SubLObject $list_alt169 = _constant_169_initializer();

	static private final SubLSymbol $sym174$ALLOW_FABRICATION_ = makeSymbol("ALLOW-FABRICATION?");

	static private final SubLSymbol $sym176$IGNORE_CACHE_ = makeSymbol("IGNORE-CACHE?");

	static private final SubLList $list_alt189 = list(new SubLObject[] { reader_make_constant_shell("WebSearchDataMt"), reader_make_constant_shell("CyclistsMt"), reader_make_constant_shell("RelationParaphraseMt"), reader_make_constant_shell("WordNetMappingMt"), reader_make_constant_shell("PornographyJargonMt"), reader_make_constant_shell("CommonEnglishMisspellingsMt"),
			reader_make_constant_shell("ComputereseLexicalMt"), reader_make_constant_shell("CyclishMt"), reader_make_constant_shell("TemporaryLexicalAssertionsMt"), reader_make_constant_shell("EnglishWordSenseAssertions-HoldingMt"), reader_make_constant_shell("TemporaryLexicalAssertions-WordNetImportMt"), reader_make_constant_shell("RedundantLexicalMt"), reader_make_constant_shell("PDATemplateTestMt"),
			reader_make_constant_shell("EnglishParaphraseMt"), reader_make_constant_shell("SupplementalDeterminerSemTransLexicalMt") });

	/**
	 * guess the category of multi-word lexeme TOKENS
	 */
	@LispMethod(comment = "guess the category of multi-word lexeme TOKENS")
	public static final SubLObject guess_category_alt(SubLObject lexicon, SubLObject string, SubLObject tokens) {
		SubLTrampolineFile.checkType(lexicon, ABSTRACT_LEXICON_P);
		SubLTrampolineFile.checkType(string, STRINGP);
		SubLTrampolineFile.checkType(tokens, LISTP);
		{
			SubLObject first_word = tokens.first();
			SubLObject last_word = last(tokens, UNPROVIDED).first();
			SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, GET, string);
			if (methods.funcall_instance_method_with_0_args(first_word, GET_STRING).equal(string)) {
				return methods.funcall_instance_method_with_0_args(first_word, GET_CATEGORY);
			} else {
				if (NIL != lexes) {
					return methods.funcall_instance_method_with_1_args(lexes.first(), GET, $PENN_TAGS).first();
				} else {
					if ((NIL != member(methods.funcall_instance_method_with_0_args(first_word, GET_CATEGORY), $list_alt496, UNPROVIDED, UNPROVIDED)) && methods.funcall_instance_method_with_0_args(last_word, GET_CATEGORY).eql($CD)) {
						return methods.funcall_instance_method_with_0_args(first_word, GET_CATEGORY);
					} else {
						return methods.funcall_instance_method_with_0_args(last_word, GET_CATEGORY);
					}
				}
			}
		}
	}

	/**
	 * guess the category of multi-word lexeme TOKENS
	 */
	@LispMethod(comment = "guess the category of multi-word lexeme TOKENS")
	public static SubLObject guess_category(final SubLObject lexicon, final SubLObject string, final SubLObject tokens) {
		assert NIL != abstract_lexicon_p(lexicon) : "! abstract_lexicon.abstract_lexicon_p(lexicon) " + ("abstract_lexicon.abstract_lexicon_p(lexicon) " + "CommonSymbols.NIL != abstract_lexicon.abstract_lexicon_p(lexicon) ") + lexicon;
		assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
		assert NIL != listp(tokens) : "! listp(tokens) " + ("Types.listp(tokens) " + "CommonSymbols.NIL != Types.listp(tokens) ") + tokens;
		final SubLObject first_word = tokens.first();
		final SubLObject last_word = last(tokens, UNPROVIDED).first();
		final SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, GET, string);
		if (methods.funcall_instance_method_with_0_args(first_word, GET_STRING).equal(string)) {
			return methods.funcall_instance_method_with_0_args(first_word, GET_CATEGORY);
		}
		if (NIL != lexes) {
			return methods.funcall_instance_method_with_1_args(lexes.first(), GET, $PENN_TAGS).first();
		}
		if ((NIL != member(methods.funcall_instance_method_with_0_args(first_word, GET_CATEGORY), $list513, UNPROVIDED, UNPROVIDED)) && methods.funcall_instance_method_with_0_args(last_word, GET_CATEGORY).eql($CD)) {
			return methods.funcall_instance_method_with_0_args(first_word, GET_CATEGORY);
		}
		return methods.funcall_instance_method_with_0_args(last_word, GET_CATEGORY);
	}

	public static final SubLObject $const190$AllGeneralEnglishValidatedLexical = reader_make_constant_shell("AllGeneralEnglishValidatedLexicalMicrotheoryPSC");

	/**
	 *
	 *
	 * @param WORDS
	listp;
	 * 		
	 * @return listp; a list of <string, category, lex-entries> triples for WORDS, where
	STRING may be several of WORDS collapsed into a single entry
	 */
	@LispMethod(comment = "@param WORDS\nlistp;\r\n\t\t\r\n@return listp; a list of <string, category, lex-entries> triples for WORDS, where\r\nSTRING may be several of WORDS collapsed into a single entry")
	public static final SubLObject abstract_lexicon_lexify_words_method_alt(SubLObject self, SubLObject words) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject catch_var_for_abstract_lexicon_method = NIL;
				SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
				SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
				SubLObject v_cache = get_abstract_lexicon_cache(self);
				SubLObject trie = get_abstract_lexicon_trie(self);
				try {
					try {
						SubLTrampolineFile.checkType(words, LISTP);
						{
							SubLObject record_length = ZERO_INTEGER;
							SubLObject lexified_tokens = NIL;
							SubLObject category = NIL;
							SubLObject string = NIL;
							SubLObject index = NIL;
							SubLObject tokens = NIL;
							SubLObject strings = NIL;
							SubLObject records = NIL;
							for (index = ZERO_INTEGER, tokens = words, strings = Mapping.mapcar(symbol_function(GET_PARSE_TREE_STRING), tokens), records = nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity); NIL != tokens; index = add(index, record_length), tokens = nthcdr(record_length, tokens), strings = nthcdr(record_length, strings), records = nl_trie_accessors.nl_trie_prefixes(trie, strings,
									case_sensitivity)) {
								records = list_utilities.add_to_end(nl_trie.new_nl_trie_record(list(methods.funcall_instance_method_with_0_args(tokens.first(), GET_STRING)), NIL), records);
								{
									SubLObject new_token_added_for_prefixe = NIL;
									if (NIL == new_token_added_for_prefixe) {
										{
											SubLObject csome_list_var = records;
											SubLObject record = NIL;
											for (record = csome_list_var.first(); !((NIL != new_token_added_for_prefixe) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), record = csome_list_var.first()) {
												record_length = length(nl_trie.nl_trie_record_key(record));
												string = build_multi_word_lexeme(list_utilities.first_n(record_length, strings));
												category = guess_category(self, string, tokens);
												{
													SubLObject lex_entries = NIL;
													SubLObject lex_entries0 = NIL;
													SubLObject existsP = NIL;
													if (NIL == ignore_cacheP) {
														thread.resetMultipleValues();
														{
															SubLObject lex_entries0_42 = cache.cache_get(v_cache, string);
															SubLObject existsP_43 = thread.secondMultipleValue();
															thread.resetMultipleValues();
															lex_entries0 = lex_entries0_42;
															existsP = existsP_43;
														}
													}
													if (NIL == existsP) {
														{
															SubLObject cdolist_list_var = nl_trie.nl_trie_record_entries(record);
															SubLObject nl_trie_entry = NIL;
															for (nl_trie_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), nl_trie_entry = cdolist_list_var.first()) {
																if (NIL != methods.funcall_instance_method_with_1_args(self, $sym236$VALID_NL_TRIE_ENTRY_, nl_trie_entry)) {
																	{
																		SubLObject cdolist_list_var_44 = methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES, string, nl_trie_entry);
																		SubLObject lex_entry = NIL;
																		for (lex_entry = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest(), lex_entry = cdolist_list_var_44.first()) {
																			lex_entries0 = cons(lex_entry, lex_entries0);
																		}
																	}
																}
															}
														}
														if (NIL == ignore_cacheP) {
															cache.cache_set(v_cache, string, lex_entries0);
														}
													}
													{
														SubLObject cdolist_list_var = lex_entries0;
														SubLObject lex_entry = NIL;
														for (lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex_entry = cdolist_list_var.first()) {
															if (NIL != subl_promotions.memberP(category, methods.funcall_instance_method_with_1_args(lex_entry, GET, $PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
																{
																	SubLObject item_var = lex_entry;
																	if (NIL == member(item_var, lex_entries, LEX_ENTRY_EQUAL_P, symbol_function(IDENTITY))) {
																		lex_entries = cons(item_var, lex_entries);
																	}
																}
															}
														}
													}
													if (NIL == lex_entries) {
														{
															SubLObject cdolist_list_var = lex_entries0;
															SubLObject lex_entry = NIL;
															for (lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex_entry = cdolist_list_var.first()) {
																if (NIL != subl_promotions.memberP(category, methods.funcall_instance_method_with_1_args(lex_entry, GET, $BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
																	{
																		SubLObject item_var = lex_entry;
																		if (NIL == member(item_var, lex_entries, LEX_ENTRY_EQUAL_P, symbol_function(IDENTITY))) {
																			lex_entries = cons(item_var, lex_entries);
																		}
																	}
																}
															}
														}
													}
													if ((NIL != lex_entries) || (NIL == nl_trie.nl_trie_record_entries(record))) {
														new_token_added_for_prefixe = T;
														lexified_tokens = cons(list(string, category, lex_entries), lexified_tokens);
													}
												}
											}
										}
									}
								}
							}
							sublisp_throw($sym500$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, nreverse(lexified_tokens));
						}
					} finally {
						{
							SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
								set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
								set_abstract_lexicon_cache(self, v_cache);
								set_abstract_lexicon_trie(self, trie);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
							}
						}
					}
				} catch (Throwable ccatch_env_var) {
					catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym500$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
				}
				return catch_var_for_abstract_lexicon_method;
			}
		}
	}

	/**
	 *
	 *
	 * @param WORDS
	listp;
	 * 		
	 * @return listp; a list of <string, category, lex-entries> triples for WORDS, where
	STRING may be several of WORDS collapsed into a single entry
	 */
	@LispMethod(comment = "@param WORDS\nlistp;\r\n\t\t\r\n@return listp; a list of <string, category, lex-entries> triples for WORDS, where\r\nSTRING may be several of WORDS collapsed into a single entry")
	public static SubLObject abstract_lexicon_lexify_words_method(final SubLObject self, final SubLObject words) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
		final SubLObject v_cache = get_abstract_lexicon_cache(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try {
			thread.throwStack.push($sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try {
				assert NIL != listp(words) : "! listp(words) " + ("Types.listp(words) " + "CommonSymbols.NIL != Types.listp(words) ") + words;
				SubLObject record_length = ZERO_INTEGER;
				SubLObject lexified_tokens = NIL;
				SubLObject category = NIL;
				SubLObject string = NIL;
				SubLObject index = NIL;
				SubLObject tokens = NIL;
				SubLObject strings = NIL;
				SubLObject records = NIL;
				index = ZERO_INTEGER;
				tokens = words;
				strings = Mapping.mapcar(symbol_function(GET_PARSE_TREE_STRING), tokens);
				records = nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity);
				while (NIL != tokens) {
					records = list_utilities.add_to_end(nl_trie.new_nl_trie_record(list(methods.funcall_instance_method_with_0_args(tokens.first(), GET_STRING)), NIL), records);
					SubLObject new_token_added_for_prefixe = NIL;
					if (NIL == new_token_added_for_prefixe) {
						SubLObject csome_list_var = records;
						SubLObject record = NIL;
						record = csome_list_var.first();
						while ((NIL == new_token_added_for_prefixe) && (NIL != csome_list_var)) {
							record_length = length(nl_trie.nl_trie_record_key(record));
							string = build_multi_word_lexeme(list_utilities.first_n(record_length, strings));
							category = guess_category(self, string, tokens);
							SubLObject lex_entries = NIL;
							SubLObject lex_entries2 = NIL;
							SubLObject existsP = NIL;
							if (NIL == ignore_cacheP) {
								thread.resetMultipleValues();
								final SubLObject lex_entries0_$44 = cache.cache_get(v_cache, string);
								final SubLObject existsP_$45 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								lex_entries2 = lex_entries0_$44;
								existsP = existsP_$45;
							}
							if (NIL == existsP) {
								SubLObject cdolist_list_var = nl_trie.nl_trie_record_entries(record);
								SubLObject nl_trie_entry = NIL;
								nl_trie_entry = cdolist_list_var.first();
								while (NIL != cdolist_list_var) {
									if (NIL != methods.funcall_instance_method_with_1_args(self, $sym242$VALID_NL_TRIE_ENTRY_, nl_trie_entry)) {
										SubLObject cdolist_list_var_$46 = methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES, string, nl_trie_entry);
										SubLObject lex_entry = NIL;
										lex_entry = cdolist_list_var_$46.first();
										while (NIL != cdolist_list_var_$46) {
											lex_entries2 = cons(lex_entry, lex_entries2);
											cdolist_list_var_$46 = cdolist_list_var_$46.rest();
											lex_entry = cdolist_list_var_$46.first();
										}
									}
									cdolist_list_var = cdolist_list_var.rest();
									nl_trie_entry = cdolist_list_var.first();
								}
								if (NIL == ignore_cacheP) {
									cache.cache_set(v_cache, string, lex_entries2);
								}
							}
							SubLObject cdolist_list_var = lex_entries2;
							SubLObject lex_entry2 = NIL;
							lex_entry2 = cdolist_list_var.first();
							while (NIL != cdolist_list_var) {
								if (NIL != subl_promotions.memberP(category, methods.funcall_instance_method_with_1_args(lex_entry2, GET, $PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
									final SubLObject item_var = lex_entry2;
									if (NIL == member(item_var, lex_entries, LEX_ENTRY_EQUAL_P, symbol_function(IDENTITY))) {
										lex_entries = cons(item_var, lex_entries);
									}
								}
								cdolist_list_var = cdolist_list_var.rest();
								lex_entry2 = cdolist_list_var.first();
							}
							if (NIL == lex_entries) {
								cdolist_list_var = lex_entries2;
								lex_entry2 = NIL;
								lex_entry2 = cdolist_list_var.first();
								while (NIL != cdolist_list_var) {
									if (NIL != subl_promotions.memberP(category, methods.funcall_instance_method_with_1_args(lex_entry2, GET, $BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
										final SubLObject item_var = lex_entry2;
										if (NIL == member(item_var, lex_entries, LEX_ENTRY_EQUAL_P, symbol_function(IDENTITY))) {
											lex_entries = cons(item_var, lex_entries);
										}
									}
									cdolist_list_var = cdolist_list_var.rest();
									lex_entry2 = cdolist_list_var.first();
								}
							}
							if ((NIL != lex_entries) || (NIL == nl_trie.nl_trie_record_entries(record))) {
								new_token_added_for_prefixe = T;
								lexified_tokens = cons(list(string, category, lex_entries), lexified_tokens);
							}
							csome_list_var = csome_list_var.rest();
							record = csome_list_var.first();
						}
					}
					index = add(index, record_length);
					tokens = nthcdr(record_length, tokens);
					strings = nthcdr(record_length, strings);
					records = nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity);
				}
				sublisp_throw($sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, nreverse(lexified_tokens));
			} finally {
				final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (final Throwable ccatch_env_var) {
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally {
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	static private final SubLList $list_alt195 = list(new SubLObject[] { makeString("@return lexicon-p; a newly created lexicon"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TRIE"), list(makeSymbol("GET-NL-TRIE"))), list(makeSymbol("CSETQ"), makeSymbol("CACHE"), list(makeSymbol("NEW-CACHE"), makeInteger(2000), list(QUOTE, EQUAL))),
			list(makeSymbol("CSETQ"), makeSymbol("CASE-SENSITIVITY"), makeKeyword("ON")), list(makeSymbol("ENSURE-CYC-TO-PENN-MAP")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INITIALIZE-EXCLUDED-PREDS"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INITIALIZE-ALLOWED-MTS"))), list(makeSymbol("CSETQ"), makeSymbol("LEARNED"), NIL), list(RET, makeSymbol("SELF")) });

	static private final SubLSymbol $sym196$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt203 = list(makeString("Finalizes this lexicon"), list(makeSymbol("CSETQ"), makeSymbol("CACHE"), NIL), list(makeSymbol("ISOLATE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym204$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt207 = list(list(makeSymbol("CSETQ"), makeSymbol("IGNORE-CACHE?"), T), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym208$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt210 = list(list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("IGNORE-CACHE?")))));

	static private final SubLSymbol $sym211$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLSymbol $sym212$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD = makeSymbol("ABSTRACT-LEXICON-IGNORE-CACHE?-METHOD");

	static private final SubLList $list_alt213 = list(list(makeSymbol("CSETQ"), makeSymbol("ALLOW-STEMMING"), T), list(RET, makeSymbol("SELF")));

	static private final SubLList $list_alt217 = list(list(makeSymbol("CSETQ"), makeSymbol("ALLOW-STEMMING"), NIL), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym218$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt221 = list(list(makeSymbol("CSETQ"), makeSymbol("ALLOW-FABRICATION?"), T), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym222$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt225 = list(list(makeSymbol("CSETQ"), makeSymbol("ALLOW-FABRICATION?"), NIL), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym226$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLSymbol $sym228$FABRICATION_FORBIDDEN_ = makeSymbol("FABRICATION-FORBIDDEN?");

	static private final SubLList $list_alt229 = list(list(RET, list(makeSymbol("CNOT"), makeSymbol("ALLOW-FABRICATION?"))));

	static private final SubLSymbol $sym230$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLSymbol $sym231$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD = makeSymbol("ABSTRACT-LEXICON-FABRICATION-FORBIDDEN?-METHOD");

	static private final SubLSymbol $sym232$FABRICATION_ALLOWED_ = makeSymbol("FABRICATION-ALLOWED?");

	static private final SubLList $list_alt233 = list(list(RET, makeSymbol("ALLOW-FABRICATION?")));

	static private final SubLSymbol $sym234$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLSymbol $sym235$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD = makeSymbol("ABSTRACT-LEXICON-FABRICATION-ALLOWED?-METHOD");

	static private final SubLSymbol $sym236$VALID_NL_TRIE_ENTRY_ = makeSymbol("VALID-NL-TRIE-ENTRY?");

	static private final SubLList $list_alt237 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

	static private final SubLList $list_alt238 = list(makeSymbol("NL-TRIE-ENTRY"));

	static private final SubLList $list_alt239 = list(makeString("Returns t if LEX-ENTRY is a contextually valid nl-trie-entry, nil otherwise\n   Lexicons derived from abstract-lexicon will typically override this method"),
			list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STOP-WORD-P")), list(makeSymbol("NL-TRIE-ENTRY-STRING"), makeSymbol("NL-TRIE-ENTRY"))), list(RET, NIL)),
			list(RET,
					list(makeSymbol("COR"), list(makeSymbol("CAND"), list(makeSymbol("LEX-ENTRY-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOWED-POS?")), list(makeSymbol("FIM"), makeSymbol("NL-TRIE-ENTRY"), list(QUOTE, makeSymbol("GET")), makeKeyword("CYC-POS")))),
							list(makeSymbol("CAND"), list(makeSymbol("NL-TRIE-WORD-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("MEMBER"), reader_make_constant_shell("nameSpelling"), list(makeSymbol("NL-TRIE-WORD-POS-PREDS"), makeSymbol("NL-TRIE-ENTRY")), list(QUOTE, EQL)), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?")), makeSymbol("NL-TRIE-ENTRY")),
									list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOWED-MT?")), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-MT"), makeSymbol("NL-TRIE-ENTRY")))),
							list(makeSymbol("CAND"), list(makeSymbol("VALID-DENOTS?"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?")), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-POS?")), makeSymbol("NL-TRIE-ENTRY")),
									list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOWED-MT?")), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-MT"), makeSymbol("NL-TRIE-ENTRY")))))));

	static private final SubLSymbol $sym241$ALLOWED_POS_ = makeSymbol("ALLOWED-POS?");

	/**
	 * build a single string out of word tokens STRINGS
	 */
	@LispMethod(comment = "build a single string out of word tokens STRINGS")
	public static final SubLObject build_multi_word_lexeme_alt(SubLObject strings) {
		{
			SubLObject result = NIL;
			SubLObject in = NIL;
			try {
				in = make_private_string_output_stream();
				princ(strings.first(), in);
				{
					SubLObject cdolist_list_var = strings.rest();
					SubLObject string = NIL;
					for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), string = cdolist_list_var.first()) {
						if (NIL == string_utilities.punctuation_string_p(string)) {
							princ($str_alt489$_, in);
						}
						princ(string, in);
					}
				}
				result = get_output_stream_string(in);
			} finally {
				{
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
						bind($is_thread_performing_cleanupP$, T);
						close(in, UNPROVIDED);
					} finally {
						rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				}
			}
			return result;
		}
	}

	/**
	 * build a single string out of word tokens STRINGS
	 */
	@LispMethod(comment = "build a single string out of word tokens STRINGS")
	public static SubLObject build_multi_word_lexeme(final SubLObject strings) {
		SubLObject result = NIL;
		SubLObject in = NIL;
		try {
			in = make_private_string_output_stream();
			princ(strings.first(), in);
			SubLObject cdolist_list_var = strings.rest();
			SubLObject string = NIL;
			string = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL == string_utilities.punctuation_string_p(string)) {
					princ($$$_, in);
				}
				princ(string, in);
				cdolist_list_var = cdolist_list_var.rest();
				string = cdolist_list_var.first();
			}
			result = get_output_stream_string(in);
		} finally {
			final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
				bind($is_thread_performing_cleanupP$, T);
				final SubLObject _values = getValuesAsVector();
				close(in, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
		return result;
	}

	static private final SubLSymbol $sym243$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_ = makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?");

	static private final SubLSymbol $sym244$ALLOWED_MT_ = makeSymbol("ALLOWED-MT?");

	static private final SubLSymbol $sym245$NL_TRIE_ENTRY_HAS_ALLOWED_POS_ = makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-POS?");

	static private final SubLSymbol $sym246$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD = makeSymbol("ABSTRACT-LEXICON-VALID-NL-TRIE-ENTRY?-METHOD");

	static private final SubLList $list_alt248 = list(makeSymbol("KEYWORD"));

	static private final SubLList $list_alt249 = list(makeString("Used for setting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred"), list(makeSymbol("CSETQ"), makeSymbol("CASE-SENSITIVITY"), makeSymbol("KEYWORD")), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym250$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	/**
	 *
	 *
	 * @param STRING
	 * 		stringp; an English string
	 * @return listp; a list of English string tokens from STRING
	 * @unknown Not the most efficient way since words and lexical entries are painfully constructed
	and then discarded...this should duplicate only the tokenization part of the 'lexify method
	 */
	@LispMethod(comment = "@param STRING\r\n\t\tstringp; an English string\r\n@return listp; a list of English string tokens from STRING\r\n@unknown Not the most efficient way since words and lexical entries are painfully constructed\r\nand then discarded...this should duplicate only the tokenization part of the \'lexify method")
	public static final SubLObject abstract_lexicon_tokenize_method_alt(SubLObject self, SubLObject string) {
		{
			SubLObject words = abstract_lexicon_lexify_sentence_method(self, document.new_sentence(string, FST_STRING_WORDIFY));
			SubLObject strings = NIL;
			SubLObject vector_var = document.sentence_yield(words);
			SubLObject backwardP_var = NIL;
			SubLObject length = length(vector_var);
			SubLObject v_iteration = NIL;
			for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
				{
					SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
					SubLObject word = aref(vector_var, element_num);
					strings = cons(document.word_string(word), strings);
				}
			}
			return nreverse(strings);
		}
	}

	/**
	 *
	 *
	 * @param STRING
	 * 		stringp; an English string
	 * @return listp; a list of English string tokens from STRING
	 * @unknown Not the most efficient way since words and lexical entries are painfully constructed
	and then discarded...this should duplicate only the tokenization part of the 'lexify method
	 */
	@LispMethod(comment = "@param STRING\r\n\t\tstringp; an English string\r\n@return listp; a list of English string tokens from STRING\r\n@unknown Not the most efficient way since words and lexical entries are painfully constructed\r\nand then discarded...this should duplicate only the tokenization part of the \'lexify method")
	public static SubLObject abstract_lexicon_tokenize_method(final SubLObject self, final SubLObject string) {
		final SubLObject words = abstract_lexicon_lexify_sentence_method(self, document.new_sentence(string, FST_STRING_WORDIFY));
		SubLObject strings = NIL;
		SubLObject cdolist_list_var = document.sentence_yield_exhaustive(words);
		SubLObject word = NIL;
		word = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			strings = cons(document.word_string(word), strings);
			cdolist_list_var = cdolist_list_var.rest();
			word = cdolist_list_var.first();
		}
		return nreverse(strings);
	}

	static private final SubLList $list_alt253 = list(makeString("Used for getting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred"), list(RET, makeSymbol("CASE-SENSITIVITY")));

	static private final SubLSymbol $sym254$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt256 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("PREDS-TO-EXCLUDE"), makeKeyword("DEFAULT")));

	/**
	 * Execute BODY with STRINGS and LEX-ENTRY successively bound to each key and
	 * lexical entry in LEXICON
	 */
	@LispMethod(comment = "Execute BODY with STRINGS and LEX-ENTRY successively bound to each key and\r\nlexical entry in LEXICON\nExecute BODY with STRINGS and LEX-ENTRY successively bound to each key and\nlexical entry in LEXICON")
	public static final SubLObject do_lexicon_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt507);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject string = NIL;
					SubLObject lex_entry = NIL;
					SubLObject lexicon = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt507);
					string = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt507);
					lex_entry = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt507);
					lexicon = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							SubLObject iterator = $sym508$ITERATOR;
							return list(CLET, list(list(iterator, list(NEW_LEXICON_ITERATOR, lexicon))), list(UNTIL, list(ITERATION_DONE, iterator), listS(CLET, list(list(lex_entry, list(ITERATION_NEXT, iterator)), list(string, listS(FIM, lex_entry, $list_alt515))), append(body, NIL))));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt507);
					}
				}
			}
		}
		return NIL;
	}

	/**
	 * Execute BODY with STRINGS and LEX-ENTRY successively bound to each key and
	 * lexical entry in LEXICON
	 */
	@LispMethod(comment = "Execute BODY with STRINGS and LEX-ENTRY successively bound to each key and\r\nlexical entry in LEXICON\nExecute BODY with STRINGS and LEX-ENTRY successively bound to each key and\nlexical entry in LEXICON")
	public static SubLObject do_lexicon(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list525);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject string = NIL;
		SubLObject lex_entry = NIL;
		SubLObject lexicon = NIL;
		destructuring_bind_must_consp(current, datum, $list525);
		string = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list525);
		lex_entry = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list525);
		lexicon = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject iterator = $sym526$ITERATOR;
			return list(CLET, list(list(iterator, list(NEW_LEXICON_ITERATOR, lexicon))), list(UNTIL, list(ITERATION_DONE, iterator), listS(CLET, list(list(lex_entry, list(ITERATION_NEXT, iterator)), list(string, listS(FIM, lex_entry, $list533))), append(body, NIL))));
		}
		cdestructuring_bind_error(datum, $list525);
		return NIL;
	}

	static private final SubLList $list_alt257 = list(makeString("exclude assertions using the predicates in PREDS-TO-EXCLUDE from use by this lexicon.\n   If PREDS-TO-EXCLUDE is :default, \n   all preds in the class variable DEFAULT-EXCLUDE-PREDS will be excluded"),
			list(makeSymbol("PIF"), list(EQ, makeSymbol("PREDS-TO-EXCLUDE"), makeKeyword("DEFAULT")), list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-PREDS"), makeSymbol("DEFAULT-EXCLUDE-PREDICATES")), list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-PREDS"), makeSymbol("PREDS-TO-EXCLUDE"))), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym259$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt262 = list(makeSymbol("POS-PRED"));

	static private final SubLList $list_alt263 = list(makeString("allow POS-PRED to be used by this lexicon for lexical lookup"), list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-PREDS"), list(makeSymbol("REMOVE"), makeSymbol("POS-PRED"), makeSymbol("EXCLUDED-PREDS"))), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym264$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	/**
	 *
	 *
	 * @return iterator-p; an iterator for this lexicon
	 */
	@LispMethod(comment = "@return iterator-p; an iterator for this lexicon")
	public static final SubLObject abstract_lexicon_iterator_method_alt(SubLObject self) {
		return new_lexicon_iterator(self);
	}

	/**
	 *
	 *
	 * @return iterator-p; an iterator for this lexicon
	 */
	@LispMethod(comment = "@return iterator-p; an iterator for this lexicon")
	public static SubLObject abstract_lexicon_iterator_method(final SubLObject self) {
		return new_lexicon_iterator(self);
	}

	/**
	 *
	 *
	 * @param KB-SPEC;
	 * 		the CycL type of the lexicon that you want to create.  This must be a specialization of #$AbstractLexiconSpecification
	 * @return ABSTRACT-LEXICON-P; the fully-instantiated lexicon object
	 */
	@LispMethod(comment = "@param KB-SPEC;\r\n\t\tthe CycL type of the lexicon that you want to create.  This must be a specialization of #$AbstractLexiconSpecification\r\n@return ABSTRACT-LEXICON-P; the fully-instantiated lexicon object")
	public static final SubLObject new_lexicon_from_kb_spec_alt(SubLObject kb_spec) {
		SubLTrampolineFile.checkType(kb_spec, FORT_P);
		{
			SubLObject class_name = lexicon_spec_class_name(kb_spec);
			SubLObject lex = object.new_class_instance(class_name);
			methods.funcall_instance_method_with_1_args(lex, INITIALIZE_ALLOWED_MTS, kb_spec);
			methods.funcall_instance_method_with_1_args(lex, INITIALIZE_EXCLUDED_PREDS, preds_for_lexicon_exclusion(kb_spec));
			return lex;
		}
	}

	/**
	 *
	 *
	 * @param KB-SPEC;
	 * 		the CycL type of the lexicon that you want to create.  This must be a specialization of #$AbstractLexiconSpecification
	 * @return ABSTRACT-LEXICON-P; the fully-instantiated lexicon object
	 */
	@LispMethod(comment = "@param KB-SPEC;\r\n\t\tthe CycL type of the lexicon that you want to create.  This must be a specialization of #$AbstractLexiconSpecification\r\n@return ABSTRACT-LEXICON-P; the fully-instantiated lexicon object")
	public static SubLObject new_lexicon_from_kb_spec(final SubLObject kb_spec) {
		SubLTrampolineFile.enforceType(kb_spec, FORT_P);
		final SubLObject class_name = lexicon_spec_class_name(kb_spec);
		final SubLObject lex = object.new_class_instance(class_name);
		methods.funcall_instance_method_with_1_args(lex, INITIALIZE_ALLOWED_MTS, kb_spec);
		methods.funcall_instance_method_with_1_args(lex, INITIALIZE_EXCLUDED_PREDS, preds_for_lexicon_exclusion(kb_spec));
		return lex;
	}

	static private final SubLList $list_alt267 = list(makeString("do not allow POS-PRED to be used by this lexicon for lexical lookup"), list(makeSymbol("CPUSHNEW"), makeSymbol("POS-PRED"), makeSymbol("EXCLUDED-PREDS")), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym268$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	public static final SubLObject lexicon_spec_class_name_alt(SubLObject kb_spec) {
		return cycl_utilities.formula_arg1(ask_utilities.query_variable($sym525$_CLASS_NAME, listS($$objectClassName, kb_spec, $list_alt527), $$InferencePSC, UNPROVIDED).first(), UNPROVIDED);
	}

	public static SubLObject lexicon_spec_class_name(final SubLObject kb_spec) {
		return cycl_utilities.formula_arg1(ask_utilities.query_variable($sym543$_CLASS_NAME, listS($$objectClassName, kb_spec, $list545), $$InferencePSC, UNPROVIDED).first(), UNPROVIDED);
	}

	static private final SubLSymbol $sym270$EXCLUDED_PREDICATE_ = makeSymbol("EXCLUDED-PREDICATE?");

	static private final SubLList $list_alt271 = list(makeString("is POS-PRED a predicate that can not be used in from this lexicon?"), list(RET, list(makeSymbol("MEMBER"), makeSymbol("POS-PRED"), makeSymbol("EXCLUDED-PREDS"))));

	public static final SubLObject clear_preds_for_lexicon_exclusion_alt() {
		{
			SubLObject cs = $preds_for_lexicon_exclusion_caching_state$.getGlobalValue();
			if (NIL != cs) {
				memoization_state.caching_state_clear(cs);
			}
		}
		return NIL;
	}

	public static SubLObject clear_preds_for_lexicon_exclusion() {
		final SubLObject cs = $preds_for_lexicon_exclusion_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	static private final SubLSymbol $sym272$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	public static final SubLObject remove_preds_for_lexicon_exclusion_alt(SubLObject kb_spec) {
		return memoization_state.caching_state_remove_function_results_with_args($preds_for_lexicon_exclusion_caching_state$.getGlobalValue(), list(kb_spec), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject remove_preds_for_lexicon_exclusion(final SubLObject kb_spec) {
		return memoization_state.caching_state_remove_function_results_with_args($preds_for_lexicon_exclusion_caching_state$.getGlobalValue(), list(kb_spec), UNPROVIDED, UNPROVIDED);
	}

	static private final SubLSymbol $sym273$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD = makeSymbol("ABSTRACT-LEXICON-EXCLUDED-PREDICATE?-METHOD");

	static private final SubLSymbol $sym274$ALLOWED_PREDICATE_ = makeSymbol("ALLOWED-PREDICATE?");

	public static final SubLObject preds_for_lexicon_exclusion_internal_alt(SubLObject kb_spec) {
		return ask_utilities.query_variable($sym529$_PRED, listS($$disallowedLexicalPredicate, kb_spec, $list_alt531), $$InferencePSC, $list_alt532);
	}

	public static SubLObject preds_for_lexicon_exclusion_internal(final SubLObject kb_spec) {
		return ask_utilities.query_variable($sym547$_PRED, listS($$disallowedLexicalPredicate, kb_spec, $list549), $$InferencePSC, $list550);
	}

	static private final SubLList $list_alt275 = list(makeString("is POS-PRED a predicate that can not be used in from this lexicon?"), list(RET, list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), makeSymbol("POS-PRED"), makeSymbol("EXCLUDED-PREDS")))));

	public static final SubLObject preds_for_lexicon_exclusion_alt(SubLObject kb_spec) {
		{
			SubLObject caching_state = $preds_for_lexicon_exclusion_caching_state$.getGlobalValue();
			if (NIL == caching_state) {
				caching_state = memoization_state.create_global_caching_state_for_name(PREDS_FOR_LEXICON_EXCLUSION, $preds_for_lexicon_exclusion_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
				memoization_state.register_hl_store_cache_clear_callback(CLEAR_PREDS_FOR_LEXICON_EXCLUSION);
			}
			{
				SubLObject results = memoization_state.caching_state_lookup(caching_state, kb_spec, $kw447$_MEMOIZED_ITEM_NOT_FOUND_);
				if (results == $kw447$_MEMOIZED_ITEM_NOT_FOUND_) {
					results = arg2(resetMultipleValues(), multiple_value_list(preds_for_lexicon_exclusion_internal(kb_spec)));
					memoization_state.caching_state_put(caching_state, kb_spec, results, UNPROVIDED);
				}
				return memoization_state.caching_results(results);
			}
		}
	}

	public static SubLObject preds_for_lexicon_exclusion(final SubLObject kb_spec) {
		SubLObject caching_state = $preds_for_lexicon_exclusion_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(PREDS_FOR_LEXICON_EXCLUSION, $preds_for_lexicon_exclusion_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
			memoization_state.register_hl_store_cache_clear_callback(CLEAR_PREDS_FOR_LEXICON_EXCLUSION);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, kb_spec, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(preds_for_lexicon_exclusion_internal(kb_spec)));
			memoization_state.caching_state_put(caching_state, kb_spec, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	static private final SubLSymbol $sym276$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLSymbol $sym277$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOWED-PREDICATE?-METHOD");

	static private final SubLList $list_alt278 = list(makeString("is POS-PRED of NL-TRIE-ENTRY a predicate that can not be used in from this lexicon?"), list(RET, list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("EXCLUDED-PREDS")), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-ENTRY")), makeSymbol("EXCLUDED-PREDS"))))));

	static private final SubLSymbol $sym279$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLSymbol $sym280$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD = makeSymbol("ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?-METHOD");

	public static final SubLObject new_lexicon_iterator_alt(SubLObject lexicon) {
		return iteration.new_iterator(new_abstract_lexicon_iterator_state(lexicon), ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P, ABSTRACT_LEXICON_ITERATOR_STATE_NEXT, UNPROVIDED);
	}

	public static SubLObject new_lexicon_iterator(final SubLObject lexicon) {
		return iteration.new_iterator(new_abstract_lexicon_iterator_state(lexicon), ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P, ABSTRACT_LEXICON_ITERATOR_STATE_NEXT, UNPROVIDED);
	}

	static private final SubLList $list_alt282 = list(makeSymbol("POS"));

	static private final SubLList $list_alt283 = list(makeString("allow POS to be used by this lexicon for lexical lookup"), list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-POS-LIST"), list(makeSymbol("REMOVE"), makeSymbol("POS"), makeSymbol("EXCLUDED-POS-LIST"))), list(RET, makeSymbol("SELF")));

	public static final SubLObject abstract_lexicon_iterator_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
		compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject abstract_lexicon_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	static private final SubLSymbol $sym284$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	public static final SubLObject abstract_lexicon_iterator_state_p_alt(SubLObject v_object) {
		return v_object.getClass() == com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native.class ? ((SubLObject) (T)) : NIL;
	}

	public static SubLObject abstract_lexicon_iterator_state_p(final SubLObject v_object) {
		return v_object.getClass() == com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native.class ? T : NIL;
	}

	public static final SubLObject abstract_lexicon_iterator_state_trie_iterator_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, ABSTRACT_LEXICON_ITERATOR_STATE_P);
		return v_object.getField2();
	}

	public static SubLObject abstract_lexicon_iterator_state_trie_iterator(final SubLObject v_object) {
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : "! abstract_lexicon.abstract_lexicon_iterator_state_p(v_object) " + "abstract_lexicon.abstract_lexicon_iterator_state_p error :" + v_object;
		return v_object.getField2();
	}

	static private final SubLList $list_alt287 = list(makeString("do not allow POS to be used by this lexicon for lexical lookup"), list(makeSymbol("CPUSHNEW"), makeSymbol("POS"), makeSymbol("EXCLUDED-POS-LIST")), list(RET, makeSymbol("SELF")));

	public static final SubLObject abstract_lexicon_iterator_state_next_entries_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, ABSTRACT_LEXICON_ITERATOR_STATE_P);
		return v_object.getField3();
	}

	public static SubLObject abstract_lexicon_iterator_state_next_entries(final SubLObject v_object) {
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : "! abstract_lexicon.abstract_lexicon_iterator_state_p(v_object) " + "abstract_lexicon.abstract_lexicon_iterator_state_p error :" + v_object;
		return v_object.getField3();
	}

	static private final SubLSymbol $sym288$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	public static final SubLObject abstract_lexicon_iterator_state_lexicon_alt(SubLObject v_object) {
		SubLTrampolineFile.checkType(v_object, ABSTRACT_LEXICON_ITERATOR_STATE_P);
		return v_object.getField4();
	}

	public static SubLObject abstract_lexicon_iterator_state_lexicon(final SubLObject v_object) {
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : "! abstract_lexicon.abstract_lexicon_iterator_state_p(v_object) " + "abstract_lexicon.abstract_lexicon_iterator_state_p error :" + v_object;
		return v_object.getField4();
	}

	static private final SubLSymbol $sym290$EXCLUDED_POS_ = makeSymbol("EXCLUDED-POS?");

	static private final SubLList $list_alt291 = list(makeString("is POS a part of speech that can not be used in from this lexicon?"), list(RET, list(makeSymbol("GENL-POS-MEMBER?"), makeSymbol("POS"), makeSymbol("EXCLUDED-POS-LIST"))));

	public static final SubLObject _csetf_abstract_lexicon_iterator_state_trie_iterator_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, ABSTRACT_LEXICON_ITERATOR_STATE_P);
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_abstract_lexicon_iterator_state_trie_iterator(final SubLObject v_object, final SubLObject value) {
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : "! abstract_lexicon.abstract_lexicon_iterator_state_p(v_object) " + "abstract_lexicon.abstract_lexicon_iterator_state_p error :" + v_object;
		return v_object.setField2(value);
	}

	static private final SubLSymbol $sym292$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLSymbol $sym293$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD = makeSymbol("ABSTRACT-LEXICON-EXCLUDED-POS?-METHOD");

	public static final SubLObject _csetf_abstract_lexicon_iterator_state_next_entries_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, ABSTRACT_LEXICON_ITERATOR_STATE_P);
		return v_object.setField3(value);
	}

	public static SubLObject _csetf_abstract_lexicon_iterator_state_next_entries(final SubLObject v_object, final SubLObject value) {
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : "! abstract_lexicon.abstract_lexicon_iterator_state_p(v_object) " + "abstract_lexicon.abstract_lexicon_iterator_state_p error :" + v_object;
		return v_object.setField3(value);
	}

	static private final SubLList $list_alt294 = list(makeString("is POS a part of speech that can not be used in from this lexicon?"), list(RET, list(makeSymbol("CNOT"), list(makeSymbol("GENL-POS-MEMBER?"), makeSymbol("POS"), makeSymbol("EXCLUDED-POS-LIST")))));

	static private final SubLSymbol $sym295$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	public static final SubLObject _csetf_abstract_lexicon_iterator_state_lexicon_alt(SubLObject v_object, SubLObject value) {
		SubLTrampolineFile.checkType(v_object, ABSTRACT_LEXICON_ITERATOR_STATE_P);
		return v_object.setField4(value);
	}

	public static SubLObject _csetf_abstract_lexicon_iterator_state_lexicon(final SubLObject v_object, final SubLObject value) {
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : "! abstract_lexicon.abstract_lexicon_iterator_state_p(v_object) " + "abstract_lexicon.abstract_lexicon_iterator_state_p error :" + v_object;
		return v_object.setField4(value);
	}

	static private final SubLSymbol $sym296$ABSTRACT_LEXICON_ALLOWED_POS__METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOWED-POS?-METHOD");

	static private final SubLList $list_alt297 = list(makeString("does NL-TRIE-ENTRY have a part of speech that can not be used in from this lexicon?"), list(RET, list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("EXCLUDED-POS-LIST")), list(makeSymbol("CNOT"), list(makeSymbol("GENL-POS-MEMBER?"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("NL-TRIE-ENTRY")), makeSymbol("EXCLUDED-POS-LIST"))))));

	public static final SubLObject make_abstract_lexicon_iterator_state_alt(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		{
			SubLObject v_new = new com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native();
			SubLObject next = NIL;
			for (next = arglist; NIL != next; next = cddr(next)) {
				{
					SubLObject current_arg = next.first();
					SubLObject current_value = cadr(next);
					SubLObject pcase_var = current_arg;
					if (pcase_var.eql($TRIE_ITERATOR)) {
						_csetf_abstract_lexicon_iterator_state_trie_iterator(v_new, current_value);
					} else {
						if (pcase_var.eql($NEXT_ENTRIES)) {
							_csetf_abstract_lexicon_iterator_state_next_entries(v_new, current_value);
						} else {
							if (pcase_var.eql($LEXICON)) {
								_csetf_abstract_lexicon_iterator_state_lexicon(v_new, current_value);
							} else {
								Errors.error($str_alt36$Invalid_slot__S_for_construction_, current_arg);
							}
						}
					}
				}
			}
			return v_new;
		}
	}

	public static SubLObject make_abstract_lexicon_iterator_state(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($TRIE_ITERATOR)) {
				_csetf_abstract_lexicon_iterator_state_trie_iterator(v_new, current_value);
			} else if (pcase_var.eql($NEXT_ENTRIES)) {
				_csetf_abstract_lexicon_iterator_state_next_entries(v_new, current_value);
			} else if (pcase_var.eql($LEXICON)) {
				_csetf_abstract_lexicon_iterator_state_lexicon(v_new, current_value);
			} else {
				Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	static private final SubLSymbol $sym299$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD = makeSymbol("ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-POS?-METHOD");

	static private final SubLList $list_alt301 = list(makeSymbol("LEARNER"));

	static private final SubLList $list_alt302 = list(makeString("add LEARNER (a method-name) as a learner to lexicon"), list(makeSymbol("CPUSHNEW"), makeSymbol("LEARNER"), makeSymbol("ACTIVE-LEARNERS")), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym303$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	public static SubLObject visit_defstruct_abstract_lexicon_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_ABSTRACT_LEXICON_ITERATOR_STATE, THREE_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $TRIE_ITERATOR, abstract_lexicon_iterator_state_trie_iterator(obj));
		funcall(visitor_fn, obj, $SLOT, $NEXT_ENTRIES, abstract_lexicon_iterator_state_next_entries(obj));
		funcall(visitor_fn, obj, $SLOT, $LEXICON, abstract_lexicon_iterator_state_lexicon(obj));
		funcall(visitor_fn, obj, $END, MAKE_ABSTRACT_LEXICON_ITERATOR_STATE, THREE_INTEGER);
		return obj;
	}

	static private final SubLList $list_alt306 = list(makeString("remove LEARNER (a method-name) as a learner for this lexicon"), list(makeSymbol("CSETQ"), makeSymbol("ACTIVE-LEARNERS"), list(makeSymbol("REMOVE"), makeSymbol("LEARNER"), makeSymbol("ACTIVE-LEARNERS"))), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym307$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	public static SubLObject visit_defstruct_object_abstract_lexicon_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_abstract_lexicon_iterator_state(obj, visitor_fn);
	}

	static private final SubLList $list_alt310 = list(list(RET, makeSymbol("ACTIVE-LEARNERS")));

	public static final SubLObject new_abstract_lexicon_iterator_state_alt(SubLObject lexicon) {
		{
			SubLObject iterator = make_abstract_lexicon_iterator_state(UNPROVIDED);
			_csetf_abstract_lexicon_iterator_state_trie_iterator(iterator, nl_trie.new_nl_trie_iterator(get_abstract_lexicon_trie(lexicon)));
			_csetf_abstract_lexicon_iterator_state_lexicon(iterator, lexicon);
			return iterator;
		}
	}

	public static SubLObject new_abstract_lexicon_iterator_state(final SubLObject lexicon) {
		final SubLObject iterator = make_abstract_lexicon_iterator_state(UNPROVIDED);
		_csetf_abstract_lexicon_iterator_state_trie_iterator(iterator, nl_trie.new_nl_trie_iterator(get_abstract_lexicon_trie(lexicon)));
		_csetf_abstract_lexicon_iterator_state_lexicon(iterator, lexicon);
		return iterator;
	}

	static private final SubLSymbol $sym311$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	public static final SubLObject abstract_lexicon_iterator_state_done_p_alt(SubLObject state) {
		{
			SubLObject lexicon = abstract_lexicon_iterator_state_lexicon(state);
			SubLObject trie_iterator = abstract_lexicon_iterator_state_trie_iterator(state);
			if (NIL != abstract_lexicon_iterator_state_next_entries(state)) {
				return NIL;
			}
			if (NIL != iteration.iteration_done(trie_iterator)) {
				return T;
			}
			while (!((NIL != abstract_lexicon_iterator_state_next_entries(state)) || (NIL != iteration.iteration_done(trie_iterator)))) {
				{
					SubLObject next_entry = iteration.iteration_next(trie_iterator);
					if (NIL != next_entry) {
						{
							SubLObject datum = next_entry;
							SubLObject current = datum;
							SubLObject key = NIL;
							SubLObject trie_entries = NIL;
							destructuring_bind_must_consp(current, datum, $list_alt554);
							key = current.first();
							current = current.rest();
							destructuring_bind_must_consp(current, datum, $list_alt554);
							trie_entries = current.first();
							current = current.rest();
							if (NIL == current) {
								{
									SubLObject cdolist_list_var = trie_entries;
									SubLObject trie_entry = NIL;
									for (trie_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), trie_entry = cdolist_list_var.first()) {
										{
											SubLObject string = nl_trie.nl_trie_entry_string(trie_entry);
											if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym236$VALID_NL_TRIE_ENTRY_, trie_entry)) {
												{
													SubLObject cdolist_list_var_45 = methods.funcall_instance_method_with_2_args(lexicon, CREATE_LEX_ENTRIES, string, trie_entry);
													SubLObject lex_entry = NIL;
													for (lex_entry = cdolist_list_var_45.first(); NIL != cdolist_list_var_45; cdolist_list_var_45 = cdolist_list_var_45.rest(), lex_entry = cdolist_list_var_45.first()) {
														_csetf_abstract_lexicon_iterator_state_next_entries(state, cons(lex_entry, abstract_lexicon_iterator_state_next_entries(state)));
													}
												}
											}
										}
									}
								}
							} else {
								cdestructuring_bind_error(datum, $list_alt554);
							}
						}
					}
				}
			}
		}
		return makeBoolean(NIL == abstract_lexicon_iterator_state_next_entries(state));
	}

	public static SubLObject abstract_lexicon_iterator_state_done_p(final SubLObject state) {
		final SubLObject lexicon = abstract_lexicon_iterator_state_lexicon(state);
		final SubLObject trie_iterator = abstract_lexicon_iterator_state_trie_iterator(state);
		if (NIL != abstract_lexicon_iterator_state_next_entries(state)) {
			return NIL;
		}
		if (NIL != iteration.iteration_done(trie_iterator)) {
			return T;
		}
		while ((NIL == abstract_lexicon_iterator_state_next_entries(state)) && (NIL == iteration.iteration_done(trie_iterator))) {
			final SubLObject next_entry = iteration.iteration_next(trie_iterator);
			if (NIL != next_entry) {
				SubLObject current;
				final SubLObject datum = current = next_entry;
				SubLObject key = NIL;
				SubLObject trie_entries = NIL;
				destructuring_bind_must_consp(current, datum, $list575);
				key = current.first();
				current = current.rest();
				destructuring_bind_must_consp(current, datum, $list575);
				trie_entries = current.first();
				current = current.rest();
				if (NIL == current) {
					SubLObject cdolist_list_var = trie_entries;
					SubLObject trie_entry = NIL;
					trie_entry = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						final SubLObject string = nl_trie.nl_trie_entry_string(trie_entry);
						if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym242$VALID_NL_TRIE_ENTRY_, trie_entry)) {
							SubLObject cdolist_list_var_$47 = methods.funcall_instance_method_with_2_args(lexicon, CREATE_LEX_ENTRIES, string, trie_entry);
							SubLObject lex_entry = NIL;
							lex_entry = cdolist_list_var_$47.first();
							while (NIL != cdolist_list_var_$47) {
								_csetf_abstract_lexicon_iterator_state_next_entries(state, cons(lex_entry, abstract_lexicon_iterator_state_next_entries(state)));
								cdolist_list_var_$47 = cdolist_list_var_$47.rest();
								lex_entry = cdolist_list_var_$47.first();
							}
						}
						cdolist_list_var = cdolist_list_var.rest();
						trie_entry = cdolist_list_var.first();
					}
				} else {
					cdestructuring_bind_error(datum, $list575);
				}
			}
		}
		return makeBoolean(NIL == abstract_lexicon_iterator_state_next_entries(state));
	}

	static private final SubLList $list_alt314 = list(makeSymbol("LEARNERS"));

	static private final SubLList $list_alt315 = list(makeString("set learners for lexicon to be all and only those learners specified in LEARNERS"), list(makeSymbol("CSETQ"), makeSymbol("ACTIVE-LEARNERS"), makeSymbol("LEARNERS")), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym316$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt318 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PROTECTED"));

	static private final SubLList $list_alt319 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KB-SPEC"), makeKeyword("DEFAULT")));

	static private final SubLList $list_alt320 = list(makeString("allow all mts visible from BASE-MT to be used by this lexicon.  If the value is :default, the value of the class variable DEFAULT-BASE-MT will be\n   used, and all mts in the class variable DEFAULT-EXCLUDED-MTS will be removed"), list(makeSymbol("CSETQ"), makeSymbol("ALLOWED-MTS"), list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQUAL))),
			list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-MTS"), list(makeSymbol("CONSTRUCT-SET-FROM-LIST"), makeSymbol("DEFAULT-EXCLUDE-MTS"), list(makeSymbol("FUNCTION"), EQUAL))),
			list(makeSymbol("PUNLESS"), list(EQ, makeKeyword("DEFAULT"), makeSymbol("KB-SPEC")),
					list(makeSymbol("CLET"),
							list(list(makeSymbol("BASE-MTS"), list(makeSymbol("QUERY-VARIABLE"), list(QUOTE, makeSymbol("?MT")), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("defaultBaseLexicalMt"), makeSymbol("KB-SPEC"), list(QUOTE, list(makeSymbol("?MT")))), reader_make_constant_shell("InferencePSC"), list(QUOTE, list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"))))),
									list(makeSymbol("SPEC-ALLOWED-MTS"), list(makeSymbol("QUERY-VARIABLE"), list(QUOTE, makeSymbol("?MT")), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("allowedLexicalMt"), makeSymbol("KB-SPEC"), list(QUOTE, list(makeSymbol("?MT")))), reader_make_constant_shell("InferencePSC"), list(QUOTE, list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"))))),
									list(makeSymbol("SPEC-DISALLOWED-MTS"), list(makeSymbol("QUERY-VARIABLE"), list(QUOTE, makeSymbol("?MT")), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("disallowedLexicalMt"), makeSymbol("KB-SPEC"), list(QUOTE, list(makeSymbol("?MT")))), reader_make_constant_shell("InferencePSC"), list(QUOTE, list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL")))))),
							list(makeSymbol("PCOND"), list(list(makeSymbol("SINGLETON?"), makeSymbol("BASE-MTS")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("BASE-MT")), list(makeSymbol("COPY-EXPRESSION"), list(makeSymbol("ONLY-ONE"), makeSymbol("BASE-MTS"))))),
									list(list(makeSymbol("EMPTY-LIST-P"), makeSymbol("BASE-MTS")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("BASE-MT")), list(makeSymbol("COPY-EXPRESSION"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEFAULT-BASE-MT"))))), list(makeSymbol("IGNORE"), makeSymbol("BASE-MTS"))),
									list(T, list(makeSymbol("CSETQ"), makeSymbol("BASE-MT"), list(makeSymbol("COPY-EXPRESSION"), list(makeSymbol("CANONICALIZE-HLMT"), list(makeSymbol("MAKE-EL-FORMULA"), reader_make_constant_shell("MtUnionFn"), makeSymbol("BASE-MTS"))))))),
							list(makeSymbol("CDOLIST"), list(makeSymbol("MT"), makeSymbol("SPEC-ALLOWED-MTS")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOW-MT")), makeSymbol("MT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("MT"), makeSymbol("SPEC-DISALLOWED-MTS")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FORBID-MT")), makeSymbol("MT"))))),
			list(RET, makeSymbol("SELF")));

	public static final SubLObject abstract_lexicon_iterator_state_next_alt(SubLObject state) {
		if (NIL != abstract_lexicon_iterator_state_done_p(state)) {
			return values(NIL, state, T);
		}
		{
			SubLObject entry = abstract_lexicon_iterator_state_next_entries(state).first();
			_csetf_abstract_lexicon_iterator_state_next_entries(state, abstract_lexicon_iterator_state_next_entries(state).rest());
			return values(entry, state, NIL);
		}
	}

	public static SubLObject abstract_lexicon_iterator_state_next(final SubLObject state) {
		if (NIL != abstract_lexicon_iterator_state_done_p(state)) {
			return values(NIL, state, T);
		}
		final SubLObject entry = abstract_lexicon_iterator_state_next_entries(state).first();
		_csetf_abstract_lexicon_iterator_state_next_entries(state, abstract_lexicon_iterator_state_next_entries(state).rest());
		return values(entry, state, NIL);
	}

	public static final SubLObject valid_denotsP_alt(SubLObject nl_trie_entry) {
		return T;
	}

	public static SubLObject valid_denotsP(final SubLObject nl_trie_entry) {
		return T;
	}

	/**
	 *
	 *
	 * @param LEX-ENTRY
	lex-entry-p
	 * 		
	 * @return object; an object suitable for insertion into the nl-trie
	 */
	@LispMethod(comment = "@param LEX-ENTRY\nlex-entry-p\r\n\t\t\r\n@return object; an object suitable for insertion into the nl-trie")
	public static final SubLObject lex_entry2nl_trie_entry_alt(SubLObject lex_entry) {
		return lex_entry;
	}

	/**
	 *
	 *
	 * @param LEX-ENTRY
	lex-entry-p
	 * 		
	 * @return object; an object suitable for insertion into the nl-trie
	 */
	@LispMethod(comment = "@param LEX-ENTRY\nlex-entry-p\r\n\t\t\r\n@return object; an object suitable for insertion into the nl-trie")
	public static SubLObject lex_entry2nl_trie_entry(final SubLObject lex_entry) {
		return lex_entry;
	}

	/**
	 *
	 *
	 * @param POS;
	 * 		a FORT intended to be a #$SpeechPart
	 * @param PRED;
	 * 		a FORT intended to be a #$SpeechPartPredicate
	 * @return the KEYWORD that corresponds to the Penn POS tag corresponding to
	the <POS PRED> combination
	 * @unknown bertolo
	 */
	@LispMethod(comment = "@param POS;\r\n\t\ta FORT intended to be a #$SpeechPart\r\n@param PRED;\r\n\t\ta FORT intended to be a #$SpeechPartPredicate\r\n@return the KEYWORD that corresponds to the Penn POS tag corresponding to\r\nthe <POS PRED> combination\r\n@unknown bertolo")
	public static final SubLObject map_from_cyc_to_penn_pos_alt(SubLObject pos, SubLObject pred) {
		return gethash(cons(pos, pred), get_cyc_to_penn_map(), UNPROVIDED);
	}

	/**
	 *
	 *
	 * @param POS;
	 * 		a FORT intended to be a #$SpeechPart
	 * @param PRED;
	 * 		a FORT intended to be a #$SpeechPartPredicate
	 * @return the KEYWORD that corresponds to the Penn POS tag corresponding to
	the <POS PRED> combination
	 * @unknown bertolo
	 */
	@LispMethod(comment = "@param POS;\r\n\t\ta FORT intended to be a #$SpeechPart\r\n@param PRED;\r\n\t\ta FORT intended to be a #$SpeechPartPredicate\r\n@return the KEYWORD that corresponds to the Penn POS tag corresponding to\r\nthe <POS PRED> combination\r\n@unknown bertolo")
	public static SubLObject map_from_cyc_to_penn_pos(final SubLObject pos, final SubLObject pred) {
		return gethash(cons(pos, pred), get_cyc_to_penn_map(), UNPROVIDED);
	}

	/**
	 *
	 *
	 * @param FORMULA
	 * 		el-formula-p;
	 * 		Execute BODY with COMPONENT successively bound to each term in FORMULA
	 */
	@LispMethod(comment = "@param FORMULA\r\n\t\tel-formula-p;\r\n\t\tExecute BODY with COMPONENT successively bound to each term in FORMULA")
	public static final SubLObject with_el_formula_terms_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			destructuring_bind_must_consp(current, datum, $list_alt555);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject v_term = NIL;
					SubLObject formula = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt555);
					v_term = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt555);
					formula = current.first();
					current = current.rest();
					if (NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							SubLObject stack = $sym556$STACK;
							SubLObject entry = $sym557$ENTRY;
							return list(CLET, list(bq_cons(stack, $list_alt558), v_term), list(STACK_PUSH, formula, stack), list(UNTIL, list(STACK_EMPTY_P, stack), list(CLET, list(list(entry, list(STACK_POP, stack))), listS(PWHEN, list($sym563$FIRST_ORDER_TERM_, entry), list(CSETQ, v_term, entry), append(body, NIL)), list(CDOLIST, list(ARG, list(FORMULA_TERMS, entry)), list(STACK_PUSH, ARG, stack)))));
						}
					} else {
						cdestructuring_bind_error(datum, $list_alt555);
					}
				}
			}
		}
		return NIL;
	}

	/**
	 *
	 *
	 * @param FORMULA
	 * 		el-formula-p;
	 * 		Execute BODY with COMPONENT successively bound to each term in FORMULA
	 */
	@LispMethod(comment = "@param FORMULA\r\n\t\tel-formula-p;\r\n\t\tExecute BODY with COMPONENT successively bound to each term in FORMULA")
	public static SubLObject with_el_formula_terms(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list576);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject v_term = NIL;
		SubLObject formula = NIL;
		destructuring_bind_must_consp(current, datum, $list576);
		v_term = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list576);
		formula = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject stack = $sym577$STACK;
			final SubLObject entry = $sym578$ENTRY;
			return list(CLET, list(bq_cons(stack, $list579), v_term), list(STACK_PUSH, formula, stack), list(UNTIL, list(STACK_EMPTY_P, stack), list(CLET, list(list(entry, list(STACK_POP, stack))), listS(PWHEN, list($sym584$FIRST_ORDER_TERM_, entry), list(CSETQ, v_term, entry), append(body, NIL)), list(CDOLIST, list(ARG, list(FORMULA_TERMS, entry)), list(STACK_PUSH, ARG, stack)))));
		}
		cdestructuring_bind_error(datum, $list576);
		return NIL;
	}

	static private final SubLSymbol $sym321$_MT = makeSymbol("?MT");

	static private final SubLList $list_alt323 = list(makeSymbol("?MT"));

	static private final SubLList $list_alt325 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

	public static SubLObject number_meanings_equalP(final SubLObject parse1, final SubLObject parse2) {
		SubLObject string1 = NIL;
		SubLObject number1 = NIL;
		destructuring_bind_must_consp(parse1, parse1, $list599);
		string1 = parse1.first();
		SubLObject current = parse1.rest();
		destructuring_bind_must_consp(current, parse1, $list599);
		number1 = current.first();
		current = current.rest();
		if (NIL == current) {
			SubLObject string2 = NIL;
			SubLObject number2 = NIL;
			destructuring_bind_must_consp(parse2, parse2, $list600);
			string2 = parse2.first();
			SubLObject current_$49 = parse2.rest();
			destructuring_bind_must_consp(current_$49, parse2, $list600);
			number2 = current_$49.first();
			current_$49 = current_$49.rest();
			if (NIL == current_$49) {
				return makeBoolean(string1.equal(string2) && number1.numE(number2));
			}
			cdestructuring_bind_error(parse2, $list600);
		} else {
			cdestructuring_bind_error(parse1, $list599);
		}
		return NIL;
	}

	static private final SubLList $list_alt333 = list(makeSymbol("MT"));

	static private final SubLList $list_alt334 = list(makeString("base-mt represents the standard mt-reasoning-based Mt for this lexicon. Using allow-mt and forbid-mt allow\n   for minor tweaks to the base-mt, but in general, this is the Mt for this lexicon\n   @note that this method will override any excluded-mts if they are visible from the newly-set base-mt"),
			list(makeSymbol("CSETQ"), makeSymbol("BASE-MT"), list(makeSymbol("COPY-EXPRESSION"), makeSymbol("MT"))),
			list(makeSymbol("DO-SET"), list(makeSymbol("EXCLUDED-MT"), makeSymbol("EXCLUDED-MTS")), list(makeSymbol("PWHEN"), list(makeSymbol("GENL-LEXICON-MT?"), makeSymbol("MT"), makeSymbol("EXCLUDED-MT")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOW-MT")), makeSymbol("EXCLUDED-MT")))), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym335$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	public static SubLObject number_meanings_results_equalP(final SubLObject results1, final SubLObject results2) {
		return list_utilities.sets_equalP(results1, results2, $sym601$NUMBER_MEANINGS_EQUAL_);
	}

	public static SubLObject tokenizing_test_covering(final SubLObject string, final SubLObject cycls) {
		SubLObject word_count = ZERO_INTEGER;
		final SubLObject vector_var = document.document_paragraphs(document_annotation_widgets.new_tagged_document(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject element_num;
		SubLObject paragraph;
		SubLObject vector_var_$50;
		SubLObject backwardP_var_$51;
		SubLObject length_$52;
		SubLObject v_iteration_$53;
		SubLObject element_num_$54;
		SubLObject sentence;
		SubLObject cdolist_list_var;
		SubLObject word;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			paragraph = aref(vector_var, element_num);
			vector_var_$50 = document.paragraph_sentences(paragraph);
			backwardP_var_$51 = NIL;
			for (length_$52 = length(vector_var_$50), v_iteration_$53 = NIL, v_iteration_$53 = ZERO_INTEGER; v_iteration_$53.numL(length_$52); v_iteration_$53 = add(v_iteration_$53, ONE_INTEGER)) {
				element_num_$54 = (NIL != backwardP_var_$51) ? subtract(length_$52, v_iteration_$53, ONE_INTEGER) : v_iteration_$53;
				sentence = aref(vector_var_$50, element_num_$54);
				cdolist_list_var = document.sentence_yield_exhaustive(sentence);
				word = NIL;
				word = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					word_count = add(word_count, ONE_INTEGER);
					if (NIL == list_utilities.same_length_p(intersection(cycls, document.word_cycls(word), EQUAL, UNPROVIDED), document.word_cycls(word))) {
						return NIL;
					}
					cdolist_list_var = cdolist_list_var.rest();
					word = cdolist_list_var.first();
				}
			}
		}
		return numE(word_count, ONE_INTEGER);
	}

	static private final SubLList $list_alt338 = list(list(makeSymbol("PWHEN"), list(makeSymbol("INITIALIZED-P"), makeSymbol("BASE-MT")), list(RET, makeSymbol("BASE-MT"))), list(makeSymbol("CSETQ"), makeSymbol("BASE-MT"), makeSymbol("DEFAULT-BASE-MT")), list(RET, makeSymbol("DEFAULT-BASE-MT")));

	static private final SubLSymbol $sym339$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt341 = list(makeString("@param MT possibly-hlmt-p; the mt to be allowed for retrieval of lex entries"), list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("SET-ADD"), makeSymbol("MT"), makeSymbol("ALLOWED-MTS")), list(makeSymbol("SET-REMOVE"), makeSymbol("MT"), makeSymbol("EXCLUDED-MTS")),
			list(makeSymbol("CSETQ"), makeSymbol("ROOT-MT"), makeKeyword("UNINITIALIZED")), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym342$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt346 = list(
			makeString("@param MT possibly-hlmt-p; the mt and all its genlMTs to be allowed for \n     retrieval of lex entries"), list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("SET-ADD"), makeSymbol("MT"), makeSymbol("ALLOWED-MTS")), list(makeSymbol("SET-REMOVE"), makeSymbol("MT"), makeSymbol("EXCLUDED-MTS")), list(makeSymbol("CDOLIST"),
					list(makeSymbol("GENL-MT"), list(makeSymbol("QUERY-VARIABLE"), list(QUOTE, makeSymbol("?GENLMT")), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("genlMt"), makeSymbol("MT"), list(QUOTE, list(makeSymbol("?GENLMT")))))), list(makeSymbol("SET-ADD"), makeSymbol("GENL-MT"), makeSymbol("ALLOWED-MTS")), list(makeSymbol("SET-REMOVE"), makeSymbol("GENL-MT"), makeSymbol("EXCLUDED-MTS"))),
			list(makeSymbol("CSETQ"), makeSymbol("ROOT-MT"), makeKeyword("UNINITIALIZED")), list(RET, makeSymbol("SELF")));

	public static final SubLObject declare_abstract_lexicon_file_alt() {
		declareFunction("get_cyc_to_penn_map", "GET-CYC-TO-PENN-MAP", 0, 0, false);
		declareFunction("ensure_cyc_to_penn_map", "ENSURE-CYC-TO-PENN-MAP", 0, 0, false);
		declareFunction("reinitialize_cyc_to_penn_map", "REINITIALIZE-CYC-TO-PENN-MAP", 0, 0, false);
		declareFunction("get_cyc_to_penn_list", "GET-CYC-TO-PENN-LIST", 0, 0, false);
		declareFunction("ensure_cyc_to_penn_list", "ENSURE-CYC-TO-PENN-LIST", 0, 0, false);
		declareFunction("rebuild_cyc_to_penn_map", "REBUILD-CYC-TO-PENN-MAP", 0, 0, false);
		declareFunction("build_cyc_to_penn_map", "BUILD-CYC-TO-PENN-MAP", 0, 0, false);
		declareFunction("build_cyc_to_supertag_map", "BUILD-CYC-TO-SUPERTAG-MAP", 0, 0, false);
		declareFunction("textract_lemma_print_function_trampoline", "TEXTRACT-LEMMA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("textract_lemma_p", "TEXTRACT-LEMMA-P", 1, 0, false);
		new com.cyc.cycjava.cycl.abstract_lexicon.$textract_lemma_p$UnaryFunction();
		declareFunction("textract_lemma_paragraph", "TEXTRACT-LEMMA-PARAGRAPH", 1, 0, false);
		declareFunction("textract_lemma_sentence", "TEXTRACT-LEMMA-SENTENCE", 1, 0, false);
		declareFunction("textract_lemma_word", "TEXTRACT-LEMMA-WORD", 1, 0, false);
		declareFunction("textract_lemma_string", "TEXTRACT-LEMMA-STRING", 1, 0, false);
		declareFunction("textract_lemma_canon", "TEXTRACT-LEMMA-CANON", 1, 0, false);
		declareFunction("textract_lemma_type", "TEXTRACT-LEMMA-TYPE", 1, 0, false);
		declareFunction("_csetf_textract_lemma_paragraph", "_CSETF-TEXTRACT-LEMMA-PARAGRAPH", 2, 0, false);
		declareFunction("_csetf_textract_lemma_sentence", "_CSETF-TEXTRACT-LEMMA-SENTENCE", 2, 0, false);
		declareFunction("_csetf_textract_lemma_word", "_CSETF-TEXTRACT-LEMMA-WORD", 2, 0, false);
		declareFunction("_csetf_textract_lemma_string", "_CSETF-TEXTRACT-LEMMA-STRING", 2, 0, false);
		declareFunction("_csetf_textract_lemma_canon", "_CSETF-TEXTRACT-LEMMA-CANON", 2, 0, false);
		declareFunction("_csetf_textract_lemma_type", "_CSETF-TEXTRACT-LEMMA-TYPE", 2, 0, false);
		declareFunction("make_textract_lemma", "MAKE-TEXTRACT-LEMMA", 0, 1, false);
		declareFunction("new_textract_lemma", "NEW-TEXTRACT-LEMMA", 1, 0, false);
		declareFunction("textract_lemma_print", "TEXTRACT-LEMMA-PRINT", 3, 0, false);
		declareFunction("get_lex_entry_properties", "GET-LEX-ENTRY-PROPERTIES", 1, 0, false);
		declareFunction("set_lex_entry_properties", "SET-LEX-ENTRY-PROPERTIES", 2, 0, false);
		declareFunction("get_lex_entry_supported_properties", "GET-LEX-ENTRY-SUPPORTED-PROPERTIES", 1, 0, false);
		declareFunction("set_lex_entry_supported_properties", "SET-LEX-ENTRY-SUPPORTED-PROPERTIES", 2, 0, false);
		declareFunction("get_lex_entry_computed_properties", "GET-LEX-ENTRY-COMPUTED-PROPERTIES", 1, 0, false);
		declareFunction("set_lex_entry_computed_properties", "SET-LEX-ENTRY-COMPUTED-PROPERTIES", 2, 0, false);
		declareFunction("get_lex_entry_stored_properties", "GET-LEX-ENTRY-STORED-PROPERTIES", 1, 0, false);
		declareFunction("set_lex_entry_stored_properties", "SET-LEX-ENTRY-STORED-PROPERTIES", 2, 0, false);
		declareFunction("subloop_reserved_initialize_lex_entry_class", "SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-CLASS", 1, 0, false);
		declareFunction("subloop_reserved_initialize_lex_entry_instance", "SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-INSTANCE", 1, 0, false);
		declareFunction("lex_entry_p", "LEX-ENTRY-P", 1, 0, false);
		declareFunction("lex_entry_initialize_method", "LEX-ENTRY-INITIALIZE-METHOD", 1, 0, false);
		declareFunction("lex_entry_get_method", "LEX-ENTRY-GET-METHOD", 2, 0, false);
		declareFunction("lex_entry_denot", "LEX-ENTRY-DENOT", 1, 0, false);
		declareFunction("lex_entry_semtrans", "LEX-ENTRY-SEMTRANS", 1, 0, false);
		declareFunction("lex_entry_trie_entry", "LEX-ENTRY-TRIE-ENTRY", 1, 0, false);
		declareFunction("lex_entry_set_method", "LEX-ENTRY-SET-METHOD", 3, 0, false);
		declareFunction("lex_entry_copy_method", "LEX-ENTRY-COPY-METHOD", 1, 0, false);
		declareFunction("lex_entry_nounP_method", "LEX-ENTRY-NOUN?-METHOD", 1, 1, false);
		declareFunction("lex_entry_print_method", "LEX-ENTRY-PRINT-METHOD", 3, 0, false);
		declareFunction("lex_entry_nominal_p_method", "LEX-ENTRY-NOMINAL-P-METHOD", 1, 0, false);
		declareFunction("lex_entry_verbal_p_method", "LEX-ENTRY-VERBAL-P-METHOD", 1, 0, false);
		declareFunction("lex_entry_adjectival_p_method", "LEX-ENTRY-ADJECTIVAL-P-METHOD", 1, 0, false);
		declareFunction("lex_entry_adverbial_p_method", "LEX-ENTRY-ADVERBIAL-P-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_term_method", "LEX-ENTRY-COMPUTE-TERM-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_gender_method", "LEX-ENTRY-COMPUTE-GENDER-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_penn_tags_method", "LEX-ENTRY-COMPUTE-PENN-TAGS-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_backoff_penn_tags_method", "LEX-ENTRY-COMPUTE-BACKOFF-PENN-TAGS-METHOD", 1, 0, false);
		declareFunction("tag_backoffs", "TAG-BACKOFFS", 1, 0, false);
		declareFunction("lex_entry_compute_super_tags_method", "LEX-ENTRY-COMPUTE-SUPER-TAGS-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_cyc_pos_method", "LEX-ENTRY-COMPUTE-CYC-POS-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_is_ner_entry_method", "LEX-ENTRY-COMPUTE-IS-NER-ENTRY-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_cyc_category_method", "LEX-ENTRY-COMPUTE-CYC-CATEGORY-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_inflections_method", "LEX-ENTRY-COMPUTE-INFLECTIONS-METHOD", 1, 0, false);
		declareFunction("get_abstract_lexicon_stop_words", "GET-ABSTRACT-LEXICON-STOP-WORDS", 1, 0, false);
		declareFunction("set_abstract_lexicon_stop_words", "SET-ABSTRACT-LEXICON-STOP-WORDS", 2, 0, false);
		declareFunction("get_abstract_lexicon_allow_stemming", "GET-ABSTRACT-LEXICON-ALLOW-STEMMING", 1, 0, false);
		declareFunction("set_abstract_lexicon_allow_stemming", "SET-ABSTRACT-LEXICON-ALLOW-STEMMING", 2, 0, false);
		declareFunction("get_abstract_lexicon_active_learners", "GET-ABSTRACT-LEXICON-ACTIVE-LEARNERS", 1, 0, false);
		declareFunction("set_abstract_lexicon_active_learners", "SET-ABSTRACT-LEXICON-ACTIVE-LEARNERS", 2, 0, false);
		declareFunction("get_abstract_lexicon_learned", "GET-ABSTRACT-LEXICON-LEARNED", 1, 0, false);
		declareFunction("set_abstract_lexicon_learned", "SET-ABSTRACT-LEXICON-LEARNED", 2, 0, false);
		declareFunction("get_abstract_lexicon_allow_fabricationP", "GET-ABSTRACT-LEXICON-ALLOW-FABRICATION?", 1, 0, false);
		declareFunction("set_abstract_lexicon_allow_fabricationP", "SET-ABSTRACT-LEXICON-ALLOW-FABRICATION?", 2, 0, false);
		declareFunction("get_abstract_lexicon_case_sensitivity", "GET-ABSTRACT-LEXICON-CASE-SENSITIVITY", 1, 0, false);
		declareFunction("set_abstract_lexicon_case_sensitivity", "SET-ABSTRACT-LEXICON-CASE-SENSITIVITY", 2, 0, false);
		declareFunction("get_abstract_lexicon_ignore_cacheP", "GET-ABSTRACT-LEXICON-IGNORE-CACHE?", 1, 0, false);
		declareFunction("set_abstract_lexicon_ignore_cacheP", "SET-ABSTRACT-LEXICON-IGNORE-CACHE?", 2, 0, false);
		declareFunction("get_abstract_lexicon_cache", "GET-ABSTRACT-LEXICON-CACHE", 1, 0, false);
		declareFunction("set_abstract_lexicon_cache", "SET-ABSTRACT-LEXICON-CACHE", 2, 0, false);
		declareFunction("get_abstract_lexicon_trie", "GET-ABSTRACT-LEXICON-TRIE", 1, 0, false);
		declareFunction("set_abstract_lexicon_trie", "SET-ABSTRACT-LEXICON-TRIE", 2, 0, false);
		declareFunction("get_abstract_lexicon_excluded_pos_list", "GET-ABSTRACT-LEXICON-EXCLUDED-POS-LIST", 1, 0, false);
		declareFunction("set_abstract_lexicon_excluded_pos_list", "SET-ABSTRACT-LEXICON-EXCLUDED-POS-LIST", 2, 0, false);
		declareFunction("get_abstract_lexicon_excluded_preds", "GET-ABSTRACT-LEXICON-EXCLUDED-PREDS", 1, 0, false);
		declareFunction("set_abstract_lexicon_excluded_preds", "SET-ABSTRACT-LEXICON-EXCLUDED-PREDS", 2, 0, false);
		declareFunction("get_abstract_lexicon_root_mt", "GET-ABSTRACT-LEXICON-ROOT-MT", 1, 0, false);
		declareFunction("set_abstract_lexicon_root_mt", "SET-ABSTRACT-LEXICON-ROOT-MT", 2, 0, false);
		declareFunction("get_abstract_lexicon_base_mt", "GET-ABSTRACT-LEXICON-BASE-MT", 1, 0, false);
		declareFunction("set_abstract_lexicon_base_mt", "SET-ABSTRACT-LEXICON-BASE-MT", 2, 0, false);
		declareFunction("get_abstract_lexicon_excluded_mts", "GET-ABSTRACT-LEXICON-EXCLUDED-MTS", 1, 0, false);
		declareFunction("set_abstract_lexicon_excluded_mts", "SET-ABSTRACT-LEXICON-EXCLUDED-MTS", 2, 0, false);
		declareFunction("get_abstract_lexicon_allowed_mts", "GET-ABSTRACT-LEXICON-ALLOWED-MTS", 1, 0, false);
		declareFunction("set_abstract_lexicon_allowed_mts", "SET-ABSTRACT-LEXICON-ALLOWED-MTS", 2, 0, false);
		declareFunction("get_abstract_lexicon_default_kb_spec", "GET-ABSTRACT-LEXICON-DEFAULT-KB-SPEC", 1, 0, false);
		declareFunction("set_abstract_lexicon_default_kb_spec", "SET-ABSTRACT-LEXICON-DEFAULT-KB-SPEC", 2, 0, false);
		declareFunction("get_abstract_lexicon_default_base_mt", "GET-ABSTRACT-LEXICON-DEFAULT-BASE-MT", 1, 0, false);
		declareFunction("set_abstract_lexicon_default_base_mt", "SET-ABSTRACT-LEXICON-DEFAULT-BASE-MT", 2, 0, false);
		declareFunction("get_abstract_lexicon_default_exclude_predicates", "GET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-PREDICATES", 1, 0, false);
		declareFunction("set_abstract_lexicon_default_exclude_predicates", "SET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-PREDICATES", 2, 0, false);
		declareFunction("get_abstract_lexicon_default_exclude_mts", "GET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-MTS", 1, 0, false);
		declareFunction("set_abstract_lexicon_default_exclude_mts", "SET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-MTS", 2, 0, false);
		declareFunction("subloop_reserved_initialize_abstract_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-CLASS", 1, 0, false);
		declareFunction("subloop_reserved_initialize_abstract_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-INSTANCE", 1, 0, false);
		declareFunction("abstract_lexicon_p", "ABSTRACT-LEXICON-P", 1, 0, false);
		declareFunction("abstract_lexicon_initialize_method", "ABSTRACT-LEXICON-INITIALIZE-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_isolate_method", "ABSTRACT-LEXICON-ISOLATE-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_ignore_cache_method", "ABSTRACT-LEXICON-IGNORE-CACHE-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_ignore_cacheP_method", "ABSTRACT-LEXICON-IGNORE-CACHE?-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_allow_stemming_method", "ABSTRACT-LEXICON-ALLOW-STEMMING-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_forbid_stemming_method", "ABSTRACT-LEXICON-FORBID-STEMMING-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_allow_fabrication_method", "ABSTRACT-LEXICON-ALLOW-FABRICATION-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_forbid_fabrication_method", "ABSTRACT-LEXICON-FORBID-FABRICATION-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_fabrication_forbiddenP_method", "ABSTRACT-LEXICON-FABRICATION-FORBIDDEN?-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_fabrication_allowedP_method", "ABSTRACT-LEXICON-FABRICATION-ALLOWED?-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_valid_nl_trie_entryP_method", "ABSTRACT-LEXICON-VALID-NL-TRIE-ENTRY?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_set_case_sensitivity_method", "ABSTRACT-LEXICON-SET-CASE-SENSITIVITY-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_get_case_sensitivity_method", "ABSTRACT-LEXICON-GET-CASE-SENSITIVITY-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_initialize_excluded_preds_method", "ABSTRACT-LEXICON-INITIALIZE-EXCLUDED-PREDS-METHOD", 1, 1, false);
		declareFunction("abstract_lexicon_allow_predicate_method", "ABSTRACT-LEXICON-ALLOW-PREDICATE-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_exclude_predicate_method", "ABSTRACT-LEXICON-EXCLUDE-PREDICATE-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_excluded_predicateP_method", "ABSTRACT-LEXICON-EXCLUDED-PREDICATE?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_allowed_predicateP_method", "ABSTRACT-LEXICON-ALLOWED-PREDICATE?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_nl_trie_entry_has_allowed_predicateP_method", "ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_allow_pos_method", "ABSTRACT-LEXICON-ALLOW-POS-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_exclude_pos_method", "ABSTRACT-LEXICON-EXCLUDE-POS-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_excluded_posP_method", "ABSTRACT-LEXICON-EXCLUDED-POS?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_allowed_posP_method", "ABSTRACT-LEXICON-ALLOWED-POS?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_nl_trie_entry_has_allowed_posP_method", "ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-POS?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_add_learner_method", "ABSTRACT-LEXICON-ADD-LEARNER-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_remove_learner_method", "ABSTRACT-LEXICON-REMOVE-LEARNER-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_get_learners_method", "ABSTRACT-LEXICON-GET-LEARNERS-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_set_learners_method", "ABSTRACT-LEXICON-SET-LEARNERS-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_initialize_allowed_mts_method", "ABSTRACT-LEXICON-INITIALIZE-ALLOWED-MTS-METHOD", 1, 1, false);
		declareFunction("abstract_lexicon_set_base_mt_method", "ABSTRACT-LEXICON-SET-BASE-MT-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_get_base_mt_method", "ABSTRACT-LEXICON-GET-BASE-MT-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_allow_mt_method", "ABSTRACT-LEXICON-ALLOW-MT-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_allow_genl_mts_method", "ABSTRACT-LEXICON-ALLOW-GENL-MTS-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_forbid_mt_method", "ABSTRACT-LEXICON-FORBID-MT-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_allowed_mtP_method", "ABSTRACT-LEXICON-ALLOWED-MT?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_root_mt_method", "ABSTRACT-LEXICON-ROOT-MT-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_add_stop_word_method", "ABSTRACT-LEXICON-ADD-STOP-WORD-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_stop_word_p_method", "ABSTRACT-LEXICON-STOP-WORD-P-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_get_stop_words_method", "ABSTRACT-LEXICON-GET-STOP-WORDS-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_copy_method", "ABSTRACT-LEXICON-COPY-METHOD", 1, 1, false);
		declareFunction("abstract_lexicon_get_method", "ABSTRACT-LEXICON-GET-METHOD", 2, 0, false);
		declareFunction("add_lex_entries_for_trie_entries", "ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES", 4, 0, false);
		declareFunction("lex_entry_equal_p", "LEX-ENTRY-EQUAL-P", 2, 0, false);
		declareFunction("abstract_lexicon_delete_method", "ABSTRACT-LEXICON-DELETE-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_delete_entry_from_string_method", "ABSTRACT-LEXICON-DELETE-ENTRY-FROM-STRING-METHOD", 3, 0, false);
		declareFunction("delete_nl_trie_lex_entries_for_string", "DELETE-NL-TRIE-LEX-ENTRIES-FOR-STRING", 1, 0, false);
		declareFunction("abstract_lexicon_add_method", "ABSTRACT-LEXICON-ADD-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_learnedP_method", "ABSTRACT-LEXICON-LEARNED?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_forget_method", "ABSTRACT-LEXICON-FORGET-METHOD", 1, 0, false);
		declareFunction("valid_prefixes", "VALID-PREFIXES", 2, 0, false);
		declareFunction("abstract_lexicon_prefixes_method", "ABSTRACT-LEXICON-PREFIXES-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_prefixes_from_string_method", "ABSTRACT-LEXICON-PREFIXES-FROM-STRING-METHOD", 2, 0, false);
		declareFunction("valid_prefix_keys", "VALID-PREFIX-KEYS", 3, 0, false);
		declareFunction("lexicon_equality_from_case_sensitivity", "LEXICON-EQUALITY-FROM-CASE-SENSITIVITY", 1, 0, false);
		declareFunction("abstract_lexicon_prefix_keys_method", "ABSTRACT-LEXICON-PREFIX-KEYS-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_prefix_keys_from_string_method", "ABSTRACT-LEXICON-PREFIX-KEYS-FROM-STRING-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_learn_method", "ABSTRACT-LEXICON-LEARN-METHOD", 2, 1, false);
		declareFunction("abstract_lexicon_number_learn_method", "ABSTRACT-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
		declareFunction("number_meanings", "NUMBER-MEANINGS", 1, 0, false);
		declareFunction("text_numbers", "TEXT-NUMBERS", 1, 0, false);
		declareFunction("scalar_interval_meanings", "SCALAR-INTERVAL-MEANINGS", 1, 0, false);
		declareFunction("text_scalar_intervals", "TEXT-SCALAR-INTERVALS", 1, 0, false);
		declareFunction("scalar_prefix", "SCALAR-PREFIX", 2, 0, false);
		declareFunction("prefix_strings_from_words", "PREFIX-STRINGS-FROM-WORDS", 1, 0, false);
		declareFunction("combine_words_into_string", "COMBINE-WORDS-INTO-STRING", 1, 0, false);
		declareFunction("spaces", "SPACES", 1, 0, false);
		declareFunction("clear_scalar_functionP", "CLEAR-SCALAR-FUNCTION?", 0, 0, false);
		declareFunction("remove_scalar_functionP", "REMOVE-SCALAR-FUNCTION?", 1, 1, false);
		declareFunction("scalar_functionP_internal", "SCALAR-FUNCTION?-INTERNAL", 2, 0, false);
		declareFunction("scalar_functionP", "SCALAR-FUNCTION?", 1, 1, false);
		declareFunction("abstract_lexicon_noun_compound_learn_method", "ABSTRACT-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
		declareFunction("tree_nps", "TREE-NPS", 1, 1, false);
		declareFunction("np_treeP", "NP-TREE?", 1, 1, false);
		declareFunction("compounds_from_tree", "COMPOUNDS-FROM-TREE", 1, 0, false);
		declareFunction("text_noun_compounds", "TEXT-NOUN-COMPOUNDS", 1, 0, false);
		declareFunction("noun_compound_meanings", "NOUN-COMPOUND-MEANINGS", 1, 0, false);
		declareFunction("noun_compound_meanings_of_string", "NOUN-COMPOUND-MEANINGS-OF-STRING", 1, 0, false);
		declareFunction("extract_parse_pos_pred", "EXTRACT-PARSE-POS-PRED", 1, 0, false);
		declareFunction("pos_pred_from_nc_parse", "POS-PRED-FROM-NC-PARSE", 1, 0, false);
		declareFunction("abstract_lexicon_cooccurrence_statistics_learn_method", "ABSTRACT-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_lexify_document_method", "ABSTRACT-LEXICON-LEXIFY-DOCUMENT-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_lexify_paragraph_method", "ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_lexify_sentence_method", "ABSTRACT-LEXICON-LEXIFY-SENTENCE-METHOD", 2, 0, false);
		declareFunction("lexified_word_p", "LEXIFIED-WORD-P", 1, 0, false);
		declareFunction("possibly_merge_tokens", "POSSIBLY-MERGE-TOKENS", 1, 0, false);
		declareFunction("get_lex_entries_for_prefix", "GET-LEX-ENTRIES-FOR-PREFIX", 5, 0, false);
		declareFunction("reconstruct_string_from_tokens", "RECONSTRUCT-STRING-FROM-TOKENS", 2, 0, false);
		declareFunction("token_list_equalp", "TOKEN-LIST-EQUALP", 2, 1, false);
		declareFunction("unstemmed_tokens_from_tokens", "UNSTEMMED-TOKENS-FROM-TOKENS", 3, 0, false);
		declareFunction("order_penn_tags", "ORDER-PENN-TAGS", 2, 0, false);
		declareFunction("some_head_initial_lex_entry_has_tag", "SOME-HEAD-INITIAL-LEX-ENTRY-HAS-TAG", 2, 0, false);
		declareFunction("entries_tags", "ENTRIES-TAGS", 1, 0, false);
		declareFunction("entries_backoff_tags", "ENTRIES-BACKOFF-TAGS", 1, 0, false);
		declareFunction("tags_matching_backoff_tags", "TAGS-MATCHING-BACKOFF-TAGS", 2, 0, false);
		declareFunction("guess_category", "GUESS-CATEGORY", 3, 0, false);
		declareFunction("abstract_lexicon_lexify_words_method", "ABSTRACT-LEXICON-LEXIFY-WORDS-METHOD", 2, 0, false);
		declareFunction("build_multi_word_lexeme", "BUILD-MULTI-WORD-LEXEME", 1, 0, false);
		declareFunction("abstract_lexicon_tokenize_method", "ABSTRACT-LEXICON-TOKENIZE-METHOD", 2, 0, false);
		declareMacro("do_lexicon", "DO-LEXICON");
		declareFunction("abstract_lexicon_iterator_method", "ABSTRACT-LEXICON-ITERATOR-METHOD", 1, 0, false);
		declareFunction("new_lexicon_from_kb_spec", "NEW-LEXICON-FROM-KB-SPEC", 1, 0, false);
		declareFunction("lexicon_spec_class_name", "LEXICON-SPEC-CLASS-NAME", 1, 0, false);
		declareFunction("clear_preds_for_lexicon_exclusion", "CLEAR-PREDS-FOR-LEXICON-EXCLUSION", 0, 0, false);
		new com.cyc.cycjava.cycl.abstract_lexicon.$clear_preds_for_lexicon_exclusion$ZeroArityFunction();
		declareFunction("remove_preds_for_lexicon_exclusion", "REMOVE-PREDS-FOR-LEXICON-EXCLUSION", 1, 0, false);
		declareFunction("preds_for_lexicon_exclusion_internal", "PREDS-FOR-LEXICON-EXCLUSION-INTERNAL", 1, 0, false);
		declareFunction("preds_for_lexicon_exclusion", "PREDS-FOR-LEXICON-EXCLUSION", 1, 0, false);
		declareFunction("new_lexicon_iterator", "NEW-LEXICON-ITERATOR", 1, 0, false);
		declareFunction("abstract_lexicon_iterator_state_print_function_trampoline", "ABSTRACT-LEXICON-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("abstract_lexicon_iterator_state_p", "ABSTRACT-LEXICON-ITERATOR-STATE-P", 1, 0, false);
		new com.cyc.cycjava.cycl.abstract_lexicon.$abstract_lexicon_iterator_state_p$UnaryFunction();
		declareFunction("abstract_lexicon_iterator_state_trie_iterator", "ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR", 1, 0, false);
		declareFunction("abstract_lexicon_iterator_state_next_entries", "ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES", 1, 0, false);
		declareFunction("abstract_lexicon_iterator_state_lexicon", "ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON", 1, 0, false);
		declareFunction("_csetf_abstract_lexicon_iterator_state_trie_iterator", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR", 2, 0, false);
		declareFunction("_csetf_abstract_lexicon_iterator_state_next_entries", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES", 2, 0, false);
		declareFunction("_csetf_abstract_lexicon_iterator_state_lexicon", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON", 2, 0, false);
		declareFunction("make_abstract_lexicon_iterator_state", "MAKE-ABSTRACT-LEXICON-ITERATOR-STATE", 0, 1, false);
		declareFunction("new_abstract_lexicon_iterator_state", "NEW-ABSTRACT-LEXICON-ITERATOR-STATE", 1, 0, false);
		declareFunction("abstract_lexicon_iterator_state_done_p", "ABSTRACT-LEXICON-ITERATOR-STATE-DONE-P", 1, 0, false);
		declareFunction("abstract_lexicon_iterator_state_next", "ABSTRACT-LEXICON-ITERATOR-STATE-NEXT", 1, 0, false);
		declareFunction("valid_denotsP", "VALID-DENOTS?", 1, 0, false);
		declareFunction("lex_entry2nl_trie_entry", "LEX-ENTRY2NL-TRIE-ENTRY", 1, 0, false);
		declareFunction("map_from_cyc_to_penn_pos", "MAP-FROM-CYC-TO-PENN-POS", 2, 0, false);
		declareMacro("with_el_formula_terms", "WITH-EL-FORMULA-TERMS");
		return NIL;
	}

	public static SubLObject declare_abstract_lexicon_file() {
		if (USE_V1) {
			declareFunction("get_cyc_to_penn_map", "GET-CYC-TO-PENN-MAP", 0, 0, false);
			declareFunction("ensure_cyc_to_penn_map", "ENSURE-CYC-TO-PENN-MAP", 0, 0, false);
			declareFunction("reinitialize_cyc_to_penn_map", "REINITIALIZE-CYC-TO-PENN-MAP", 0, 0, false);
			declareFunction("get_cyc_to_penn_list", "GET-CYC-TO-PENN-LIST", 0, 0, false);
			declareFunction("ensure_cyc_to_penn_list", "ENSURE-CYC-TO-PENN-LIST", 0, 0, false);
			declareFunction("rebuild_cyc_to_penn_map", "REBUILD-CYC-TO-PENN-MAP", 0, 0, false);
			declareFunction("build_cyc_to_penn_map", "BUILD-CYC-TO-PENN-MAP", 0, 0, false);
			declareFunction("build_cyc_to_supertag_map", "BUILD-CYC-TO-SUPERTAG-MAP", 0, 0, false);
			declareFunction("textract_lemma_print_function_trampoline", "TEXTRACT-LEMMA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
			declareFunction("textract_lemma_p", "TEXTRACT-LEMMA-P", 1, 0, false);
			new abstract_lexicon.$textract_lemma_p$UnaryFunction();
			declareFunction("textract_lemma_paragraph", "TEXTRACT-LEMMA-PARAGRAPH", 1, 0, false);
			declareFunction("textract_lemma_sentence", "TEXTRACT-LEMMA-SENTENCE", 1, 0, false);
			declareFunction("textract_lemma_word", "TEXTRACT-LEMMA-WORD", 1, 0, false);
			declareFunction("textract_lemma_string", "TEXTRACT-LEMMA-STRING", 1, 0, false);
			declareFunction("textract_lemma_canon", "TEXTRACT-LEMMA-CANON", 1, 0, false);
			declareFunction("textract_lemma_type", "TEXTRACT-LEMMA-TYPE", 1, 0, false);
			declareFunction("_csetf_textract_lemma_paragraph", "_CSETF-TEXTRACT-LEMMA-PARAGRAPH", 2, 0, false);
			declareFunction("_csetf_textract_lemma_sentence", "_CSETF-TEXTRACT-LEMMA-SENTENCE", 2, 0, false);
			declareFunction("_csetf_textract_lemma_word", "_CSETF-TEXTRACT-LEMMA-WORD", 2, 0, false);
			declareFunction("_csetf_textract_lemma_string", "_CSETF-TEXTRACT-LEMMA-STRING", 2, 0, false);
			declareFunction("_csetf_textract_lemma_canon", "_CSETF-TEXTRACT-LEMMA-CANON", 2, 0, false);
			declareFunction("_csetf_textract_lemma_type", "_CSETF-TEXTRACT-LEMMA-TYPE", 2, 0, false);
			declareFunction("make_textract_lemma", "MAKE-TEXTRACT-LEMMA", 0, 1, false);
			declareFunction("visit_defstruct_textract_lemma", "VISIT-DEFSTRUCT-TEXTRACT-LEMMA", 2, 0, false);
			declareFunction("visit_defstruct_object_textract_lemma_method", "VISIT-DEFSTRUCT-OBJECT-TEXTRACT-LEMMA-METHOD", 2, 0, false);
			declareFunction("new_textract_lemma", "NEW-TEXTRACT-LEMMA", 1, 0, false);
			declareFunction("textract_lemma_print", "TEXTRACT-LEMMA-PRINT", 3, 0, false);
			declareFunction("get_lex_entry_properties", "GET-LEX-ENTRY-PROPERTIES", 1, 0, false);
			declareFunction("set_lex_entry_properties", "SET-LEX-ENTRY-PROPERTIES", 2, 0, false);
			declareFunction("get_lex_entry_supported_properties", "GET-LEX-ENTRY-SUPPORTED-PROPERTIES", 1, 0, false);
			declareFunction("set_lex_entry_supported_properties", "SET-LEX-ENTRY-SUPPORTED-PROPERTIES", 2, 0, false);
			declareFunction("get_lex_entry_computed_properties", "GET-LEX-ENTRY-COMPUTED-PROPERTIES", 1, 0, false);
			declareFunction("set_lex_entry_computed_properties", "SET-LEX-ENTRY-COMPUTED-PROPERTIES", 2, 0, false);
			declareFunction("get_lex_entry_stored_properties", "GET-LEX-ENTRY-STORED-PROPERTIES", 1, 0, false);
			declareFunction("set_lex_entry_stored_properties", "SET-LEX-ENTRY-STORED-PROPERTIES", 2, 0, false);
			declareFunction("subloop_reserved_initialize_lex_entry_class", "SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-CLASS", 1, 0, false);
			declareFunction("subloop_reserved_initialize_lex_entry_instance", "SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-INSTANCE", 1, 0, false);
			declareFunction("lex_entry_p", "LEX-ENTRY-P", 1, 0, false);
			declareFunction("lex_entry_initialize_method", "LEX-ENTRY-INITIALIZE-METHOD", 1, 0, false);
			declareFunction("lex_entry_get_method", "LEX-ENTRY-GET-METHOD", 2, 0, false);
			declareFunction("lex_entry_denot", "LEX-ENTRY-DENOT", 1, 0, false);
			declareFunction("lex_entry_semtrans", "LEX-ENTRY-SEMTRANS", 1, 0, false);
			declareFunction("lex_entry_trie_entry", "LEX-ENTRY-TRIE-ENTRY", 1, 0, false);
			declareFunction("lex_entry_set_method", "LEX-ENTRY-SET-METHOD", 3, 0, false);
			declareFunction("lex_entry_copy_method", "LEX-ENTRY-COPY-METHOD", 1, 0, false);
			declareFunction("lex_entry_nounP_method", "LEX-ENTRY-NOUN?-METHOD", 1, 1, false);
			declareFunction("lex_entry_print_method", "LEX-ENTRY-PRINT-METHOD", 3, 0, false);
			declareFunction("lex_entry_nominal_p_method", "LEX-ENTRY-NOMINAL-P-METHOD", 1, 0, false);
			declareFunction("lex_entry_verbal_p_method", "LEX-ENTRY-VERBAL-P-METHOD", 1, 0, false);
			declareFunction("lex_entry_adjectival_p_method", "LEX-ENTRY-ADJECTIVAL-P-METHOD", 1, 0, false);
			declareFunction("lex_entry_adverbial_p_method", "LEX-ENTRY-ADVERBIAL-P-METHOD", 1, 0, false);
			declareFunction("lex_entry_compute_term_method", "LEX-ENTRY-COMPUTE-TERM-METHOD", 1, 0, false);
			declareFunction("lex_entry_compute_gender_method", "LEX-ENTRY-COMPUTE-GENDER-METHOD", 1, 0, false);
			declareFunction("lex_entry_compute_penn_tags_method", "LEX-ENTRY-COMPUTE-PENN-TAGS-METHOD", 1, 0, false);
			declareFunction("lex_entry_compute_backoff_penn_tags_method", "LEX-ENTRY-COMPUTE-BACKOFF-PENN-TAGS-METHOD", 1, 0, false);
			declareFunction("tag_backoffs", "TAG-BACKOFFS", 1, 0, false);
			declareFunction("lex_entry_compute_super_tags_method", "LEX-ENTRY-COMPUTE-SUPER-TAGS-METHOD", 1, 0, false);
			declareFunction("lex_entry_compute_cyc_pos_method", "LEX-ENTRY-COMPUTE-CYC-POS-METHOD", 1, 0, false);
			declareFunction("lex_entry_compute_is_ner_entry_method", "LEX-ENTRY-COMPUTE-IS-NER-ENTRY-METHOD", 1, 0, false);
			declareFunction("lex_entry_compute_cyc_category_method", "LEX-ENTRY-COMPUTE-CYC-CATEGORY-METHOD", 1, 0, false);
			declareFunction("lex_entry_compute_inflections_method", "LEX-ENTRY-COMPUTE-INFLECTIONS-METHOD", 1, 0, false);
			declareFunction("get_abstract_lexicon_stop_words", "GET-ABSTRACT-LEXICON-STOP-WORDS", 1, 0, false);
			declareFunction("set_abstract_lexicon_stop_words", "SET-ABSTRACT-LEXICON-STOP-WORDS", 2, 0, false);
			declareFunction("get_abstract_lexicon_allow_stemming", "GET-ABSTRACT-LEXICON-ALLOW-STEMMING", 1, 0, false);
			declareFunction("set_abstract_lexicon_allow_stemming", "SET-ABSTRACT-LEXICON-ALLOW-STEMMING", 2, 0, false);
			declareFunction("get_abstract_lexicon_active_learners", "GET-ABSTRACT-LEXICON-ACTIVE-LEARNERS", 1, 0, false);
			declareFunction("set_abstract_lexicon_active_learners", "SET-ABSTRACT-LEXICON-ACTIVE-LEARNERS", 2, 0, false);
			declareFunction("get_abstract_lexicon_learned", "GET-ABSTRACT-LEXICON-LEARNED", 1, 0, false);
			declareFunction("set_abstract_lexicon_learned", "SET-ABSTRACT-LEXICON-LEARNED", 2, 0, false);
			declareFunction("get_abstract_lexicon_allow_fabricationP", "GET-ABSTRACT-LEXICON-ALLOW-FABRICATION?", 1, 0, false);
			declareFunction("set_abstract_lexicon_allow_fabricationP", "SET-ABSTRACT-LEXICON-ALLOW-FABRICATION?", 2, 0, false);
			declareFunction("get_abstract_lexicon_case_sensitivity", "GET-ABSTRACT-LEXICON-CASE-SENSITIVITY", 1, 0, false);
			declareFunction("set_abstract_lexicon_case_sensitivity", "SET-ABSTRACT-LEXICON-CASE-SENSITIVITY", 2, 0, false);
			declareFunction("get_abstract_lexicon_ignore_cacheP", "GET-ABSTRACT-LEXICON-IGNORE-CACHE?", 1, 0, false);
			declareFunction("set_abstract_lexicon_ignore_cacheP", "SET-ABSTRACT-LEXICON-IGNORE-CACHE?", 2, 0, false);
			declareFunction("get_abstract_lexicon_cache", "GET-ABSTRACT-LEXICON-CACHE", 1, 0, false);
			declareFunction("set_abstract_lexicon_cache", "SET-ABSTRACT-LEXICON-CACHE", 2, 0, false);
			declareFunction("get_abstract_lexicon_trie", "GET-ABSTRACT-LEXICON-TRIE", 1, 0, false);
			declareFunction("set_abstract_lexicon_trie", "SET-ABSTRACT-LEXICON-TRIE", 2, 0, false);
			declareFunction("get_abstract_lexicon_excluded_pos_list", "GET-ABSTRACT-LEXICON-EXCLUDED-POS-LIST", 1, 0, false);
			declareFunction("set_abstract_lexicon_excluded_pos_list", "SET-ABSTRACT-LEXICON-EXCLUDED-POS-LIST", 2, 0, false);
			declareFunction("get_abstract_lexicon_excluded_preds", "GET-ABSTRACT-LEXICON-EXCLUDED-PREDS", 1, 0, false);
			declareFunction("set_abstract_lexicon_excluded_preds", "SET-ABSTRACT-LEXICON-EXCLUDED-PREDS", 2, 0, false);
			declareFunction("get_abstract_lexicon_root_mt", "GET-ABSTRACT-LEXICON-ROOT-MT", 1, 0, false);
			declareFunction("set_abstract_lexicon_root_mt", "SET-ABSTRACT-LEXICON-ROOT-MT", 2, 0, false);
			declareFunction("get_abstract_lexicon_base_mt", "GET-ABSTRACT-LEXICON-BASE-MT", 1, 0, false);
			declareFunction("set_abstract_lexicon_base_mt", "SET-ABSTRACT-LEXICON-BASE-MT", 2, 0, false);
			declareFunction("get_abstract_lexicon_excluded_mts", "GET-ABSTRACT-LEXICON-EXCLUDED-MTS", 1, 0, false);
			declareFunction("set_abstract_lexicon_excluded_mts", "SET-ABSTRACT-LEXICON-EXCLUDED-MTS", 2, 0, false);
			declareFunction("get_abstract_lexicon_allowed_mts", "GET-ABSTRACT-LEXICON-ALLOWED-MTS", 1, 0, false);
			declareFunction("set_abstract_lexicon_allowed_mts", "SET-ABSTRACT-LEXICON-ALLOWED-MTS", 2, 0, false);
			declareFunction("get_abstract_lexicon_default_kb_spec", "GET-ABSTRACT-LEXICON-DEFAULT-KB-SPEC", 1, 0, false);
			declareFunction("set_abstract_lexicon_default_kb_spec", "SET-ABSTRACT-LEXICON-DEFAULT-KB-SPEC", 2, 0, false);
			declareFunction("get_abstract_lexicon_default_base_mt", "GET-ABSTRACT-LEXICON-DEFAULT-BASE-MT", 1, 0, false);
			declareFunction("set_abstract_lexicon_default_base_mt", "SET-ABSTRACT-LEXICON-DEFAULT-BASE-MT", 2, 0, false);
			declareFunction("get_abstract_lexicon_default_exclude_predicates", "GET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-PREDICATES", 1, 0, false);
			declareFunction("set_abstract_lexicon_default_exclude_predicates", "SET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-PREDICATES", 2, 0, false);
			declareFunction("get_abstract_lexicon_default_exclude_mts", "GET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-MTS", 1, 0, false);
			declareFunction("set_abstract_lexicon_default_exclude_mts", "SET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-MTS", 2, 0, false);
			declareFunction("subloop_reserved_initialize_abstract_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-CLASS", 1, 0, false);
			declareFunction("subloop_reserved_initialize_abstract_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-INSTANCE", 1, 0, false);
			declareFunction("abstract_lexicon_p", "ABSTRACT-LEXICON-P", 1, 0, false);
			declareFunction("abstract_lexicon_initialize_method", "ABSTRACT-LEXICON-INITIALIZE-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_isolate_method", "ABSTRACT-LEXICON-ISOLATE-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_ignore_cache_method", "ABSTRACT-LEXICON-IGNORE-CACHE-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_ignore_cacheP_method", "ABSTRACT-LEXICON-IGNORE-CACHE?-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_allow_stemming_method", "ABSTRACT-LEXICON-ALLOW-STEMMING-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_forbid_stemming_method", "ABSTRACT-LEXICON-FORBID-STEMMING-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_allow_fabrication_method", "ABSTRACT-LEXICON-ALLOW-FABRICATION-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_forbid_fabrication_method", "ABSTRACT-LEXICON-FORBID-FABRICATION-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_fabrication_forbiddenP_method", "ABSTRACT-LEXICON-FABRICATION-FORBIDDEN?-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_fabrication_allowedP_method", "ABSTRACT-LEXICON-FABRICATION-ALLOWED?-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_valid_nl_trie_entryP_method", "ABSTRACT-LEXICON-VALID-NL-TRIE-ENTRY?-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_set_case_sensitivity_method", "ABSTRACT-LEXICON-SET-CASE-SENSITIVITY-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_get_case_sensitivity_method", "ABSTRACT-LEXICON-GET-CASE-SENSITIVITY-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_initialize_excluded_preds_method", "ABSTRACT-LEXICON-INITIALIZE-EXCLUDED-PREDS-METHOD", 1, 1, false);
			declareFunction("abstract_lexicon_allow_predicate_method", "ABSTRACT-LEXICON-ALLOW-PREDICATE-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_exclude_predicate_method", "ABSTRACT-LEXICON-EXCLUDE-PREDICATE-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_excluded_predicateP_method", "ABSTRACT-LEXICON-EXCLUDED-PREDICATE?-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_allowed_predicateP_method", "ABSTRACT-LEXICON-ALLOWED-PREDICATE?-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_nl_trie_entry_has_allowed_predicateP_method", "ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_allow_pos_method", "ABSTRACT-LEXICON-ALLOW-POS-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_exclude_pos_method", "ABSTRACT-LEXICON-EXCLUDE-POS-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_excluded_posP_method", "ABSTRACT-LEXICON-EXCLUDED-POS?-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_allowed_posP_method", "ABSTRACT-LEXICON-ALLOWED-POS?-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_nl_trie_entry_has_allowed_posP_method", "ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-POS?-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_add_learner_method", "ABSTRACT-LEXICON-ADD-LEARNER-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_remove_learner_method", "ABSTRACT-LEXICON-REMOVE-LEARNER-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_get_learners_method", "ABSTRACT-LEXICON-GET-LEARNERS-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_set_learners_method", "ABSTRACT-LEXICON-SET-LEARNERS-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_initialize_allowed_mts_method", "ABSTRACT-LEXICON-INITIALIZE-ALLOWED-MTS-METHOD", 1, 1, false);
			declareFunction("abstract_lexicon_set_base_mt_method", "ABSTRACT-LEXICON-SET-BASE-MT-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_get_base_mt_method", "ABSTRACT-LEXICON-GET-BASE-MT-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_allow_mt_method", "ABSTRACT-LEXICON-ALLOW-MT-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_allow_genl_mts_method", "ABSTRACT-LEXICON-ALLOW-GENL-MTS-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_forbid_mt_method", "ABSTRACT-LEXICON-FORBID-MT-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_allowed_mtP_method", "ABSTRACT-LEXICON-ALLOWED-MT?-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_root_mt_method", "ABSTRACT-LEXICON-ROOT-MT-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_add_stop_word_method", "ABSTRACT-LEXICON-ADD-STOP-WORD-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_stop_word_p_method", "ABSTRACT-LEXICON-STOP-WORD-P-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_get_stop_words_method", "ABSTRACT-LEXICON-GET-STOP-WORDS-METHOD", 1, 0, false);
			declareFunction("abstract_lexicon_copy_method", "ABSTRACT-LEXICON-COPY-METHOD", 1, 1, false);
			declareFunction("abstract_lexicon_get_method", "ABSTRACT-LEXICON-GET-METHOD", 2, 0, false);
			declareFunction("add_lex_entries_for_trie_entries", "ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES", 4, 0, false);
			declareFunction("lex_entry_equal_p", "LEX-ENTRY-EQUAL-P", 2, 0, false);
			declareFunction("abstract_lexicon_delete_method", "ABSTRACT-LEXICON-DELETE-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_delete_entry_from_string_method", "ABSTRACT-LEXICON-DELETE-ENTRY-FROM-STRING-METHOD", 3, 0, false);
			declareFunction("delete_nl_trie_lex_entries_for_string", "DELETE-NL-TRIE-LEX-ENTRIES-FOR-STRING", 1, 0, false);
			declareFunction("abstract_lexicon_add_method", "ABSTRACT-LEXICON-ADD-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_learnedP_method", "ABSTRACT-LEXICON-LEARNED?-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_forget_method", "ABSTRACT-LEXICON-FORGET-METHOD", 1, 0, false);
			declareFunction("valid_prefixes", "VALID-PREFIXES", 2, 0, false);
			declareFunction("abstract_lexicon_prefixes_method", "ABSTRACT-LEXICON-PREFIXES-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_prefixes_from_string_method", "ABSTRACT-LEXICON-PREFIXES-FROM-STRING-METHOD", 2, 0, false);
			declareFunction("valid_prefix_keys", "VALID-PREFIX-KEYS", 3, 0, false);
			declareFunction("lexicon_equality_from_case_sensitivity", "LEXICON-EQUALITY-FROM-CASE-SENSITIVITY", 1, 0, false);
			declareFunction("abstract_lexicon_prefix_keys_method", "ABSTRACT-LEXICON-PREFIX-KEYS-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_prefix_keys_from_string_method", "ABSTRACT-LEXICON-PREFIX-KEYS-FROM-STRING-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_learn_method", "ABSTRACT-LEXICON-LEARN-METHOD", 2, 1, false);
			declareFunction("abstract_lexicon_number_learn_method", "ABSTRACT-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
			declareFunction("number_meanings", "NUMBER-MEANINGS", 1, 0, false);
			declareFunction("text_numbers", "TEXT-NUMBERS", 1, 0, false);
			declareFunction("scalar_interval_meanings", "SCALAR-INTERVAL-MEANINGS", 1, 0, false);
			declareFunction("text_scalar_intervals", "TEXT-SCALAR-INTERVALS", 1, 0, false);
			declareFunction("scalar_prefix", "SCALAR-PREFIX", 2, 0, false);
			declareFunction("prefix_strings_from_words", "PREFIX-STRINGS-FROM-WORDS", 1, 0, false);
			declareFunction("combine_words_into_string", "COMBINE-WORDS-INTO-STRING", 1, 0, false);
			declareFunction("spaces", "SPACES", 1, 0, false);
			declareFunction("clear_scalar_functionP", "CLEAR-SCALAR-FUNCTION?", 0, 0, false);
			declareFunction("remove_scalar_functionP", "REMOVE-SCALAR-FUNCTION?", 1, 1, false);
			declareFunction("scalar_functionP_internal", "SCALAR-FUNCTION?-INTERNAL", 2, 0, false);
			declareFunction("scalar_functionP", "SCALAR-FUNCTION?", 1, 1, false);
			declareFunction("abstract_lexicon_noun_compound_learn_method", "ABSTRACT-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
			declareFunction("tree_nps", "TREE-NPS", 1, 1, false);
			declareFunction("np_treeP", "NP-TREE?", 1, 1, false);
			declareFunction("compounds_from_tree", "COMPOUNDS-FROM-TREE", 1, 0, false);
			declareFunction("text_noun_compounds", "TEXT-NOUN-COMPOUNDS", 1, 0, false);
			declareFunction("noun_compound_meanings", "NOUN-COMPOUND-MEANINGS", 1, 0, false);
			declareFunction("noun_compound_meanings_of_string", "NOUN-COMPOUND-MEANINGS-OF-STRING", 1, 0, false);
			declareFunction("extract_parse_pos_pred", "EXTRACT-PARSE-POS-PRED", 1, 0, false);
			declareFunction("pos_pred_from_nc_parse", "POS-PRED-FROM-NC-PARSE", 1, 0, false);
			declareFunction("abstract_lexicon_cooccurrence_statistics_learn_method", "ABSTRACT-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_lexify_document_method", "ABSTRACT-LEXICON-LEXIFY-DOCUMENT-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_lexify_document_exhaustively_method", "ABSTRACT-LEXICON-LEXIFY-DOCUMENT-EXHAUSTIVELY-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_lexify_paragraph_method", "ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_lexify_paragraph_exhaustively_method", "ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-EXHAUSTIVELY-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_lexify_sentence_method", "ABSTRACT-LEXICON-LEXIFY-SENTENCE-METHOD", 2, 0, false);
			declareFunction("abstract_lexicon_lexify_sentence_exhaustively_method", "ABSTRACT-LEXICON-LEXIFY-SENTENCE-EXHAUSTIVELY-METHOD", 2, 0, false);
			declareFunction("get_all_prefix_words", "GET-ALL-PREFIX-WORDS", 6, 0, false);
			declareFunction("lexified_word_p", "LEXIFIED-WORD-P", 1, 0, false);
			declareFunction("possibly_merge_tokens", "POSSIBLY-MERGE-TOKENS", 1, 0, false);
			declareFunction("get_lex_entries_for_prefix", "GET-LEX-ENTRIES-FOR-PREFIX", 5, 1, false);
			declareFunction("reconstruct_string_from_tokens", "RECONSTRUCT-STRING-FROM-TOKENS", 2, 0, false);
			declareFunction("token_list_equalp", "TOKEN-LIST-EQUALP", 2, 1, false);
			declareFunction("unstemmed_tokens_from_tokens", "UNSTEMMED-TOKENS-FROM-TOKENS", 3, 0, false);
			declareFunction("order_penn_tags", "ORDER-PENN-TAGS", 2, 0, false);
			declareFunction("some_head_initial_lex_entry_has_tag", "SOME-HEAD-INITIAL-LEX-ENTRY-HAS-TAG", 2, 0, false);
			declareFunction("entries_tags", "ENTRIES-TAGS", 1, 0, false);
			declareFunction("entries_backoff_tags", "ENTRIES-BACKOFF-TAGS", 1, 0, false);
			declareFunction("tags_matching_backoff_tags", "TAGS-MATCHING-BACKOFF-TAGS", 2, 0, false);
			declareFunction("guess_category", "GUESS-CATEGORY", 3, 0, false);
			declareFunction("abstract_lexicon_lexify_words_method", "ABSTRACT-LEXICON-LEXIFY-WORDS-METHOD", 2, 0, false);
			declareFunction("build_multi_word_lexeme", "BUILD-MULTI-WORD-LEXEME", 1, 0, false);
			declareFunction("abstract_lexicon_tokenize_method", "ABSTRACT-LEXICON-TOKENIZE-METHOD", 2, 0, false);
			declareMacro("do_lexicon", "DO-LEXICON");
			declareFunction("abstract_lexicon_iterator_method", "ABSTRACT-LEXICON-ITERATOR-METHOD", 1, 0, false);
			declareFunction("new_lexicon_from_kb_spec", "NEW-LEXICON-FROM-KB-SPEC", 1, 0, false);
			declareFunction("lexicon_spec_class_name", "LEXICON-SPEC-CLASS-NAME", 1, 0, false);
			declareFunction("clear_preds_for_lexicon_exclusion", "CLEAR-PREDS-FOR-LEXICON-EXCLUSION", 0, 0, false);
			new abstract_lexicon.$clear_preds_for_lexicon_exclusion$ZeroArityFunction();
			declareFunction("remove_preds_for_lexicon_exclusion", "REMOVE-PREDS-FOR-LEXICON-EXCLUSION", 1, 0, false);
			declareFunction("preds_for_lexicon_exclusion_internal", "PREDS-FOR-LEXICON-EXCLUSION-INTERNAL", 1, 0, false);
			declareFunction("preds_for_lexicon_exclusion", "PREDS-FOR-LEXICON-EXCLUSION", 1, 0, false);
			declareFunction("new_lexicon_iterator", "NEW-LEXICON-ITERATOR", 1, 0, false);
			declareFunction("abstract_lexicon_iterator_state_print_function_trampoline", "ABSTRACT-LEXICON-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
			declareFunction("abstract_lexicon_iterator_state_p", "ABSTRACT-LEXICON-ITERATOR-STATE-P", 1, 0, false);
			new abstract_lexicon.$abstract_lexicon_iterator_state_p$UnaryFunction();
			declareFunction("abstract_lexicon_iterator_state_trie_iterator", "ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR", 1, 0, false);
			declareFunction("abstract_lexicon_iterator_state_next_entries", "ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES", 1, 0, false);
			declareFunction("abstract_lexicon_iterator_state_lexicon", "ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON", 1, 0, false);
			declareFunction("_csetf_abstract_lexicon_iterator_state_trie_iterator", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR", 2, 0, false);
			declareFunction("_csetf_abstract_lexicon_iterator_state_next_entries", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES", 2, 0, false);
			declareFunction("_csetf_abstract_lexicon_iterator_state_lexicon", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON", 2, 0, false);
			declareFunction("make_abstract_lexicon_iterator_state", "MAKE-ABSTRACT-LEXICON-ITERATOR-STATE", 0, 1, false);
			declareFunction("visit_defstruct_abstract_lexicon_iterator_state", "VISIT-DEFSTRUCT-ABSTRACT-LEXICON-ITERATOR-STATE", 2, 0, false);
			declareFunction("visit_defstruct_object_abstract_lexicon_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-ABSTRACT-LEXICON-ITERATOR-STATE-METHOD", 2, 0, false);
			declareFunction("new_abstract_lexicon_iterator_state", "NEW-ABSTRACT-LEXICON-ITERATOR-STATE", 1, 0, false);
			declareFunction("abstract_lexicon_iterator_state_done_p", "ABSTRACT-LEXICON-ITERATOR-STATE-DONE-P", 1, 0, false);
			declareFunction("abstract_lexicon_iterator_state_next", "ABSTRACT-LEXICON-ITERATOR-STATE-NEXT", 1, 0, false);
			declareFunction("valid_denotsP", "VALID-DENOTS?", 1, 0, false);
			declareFunction("lex_entry2nl_trie_entry", "LEX-ENTRY2NL-TRIE-ENTRY", 1, 0, false);
			declareFunction("map_from_cyc_to_penn_pos", "MAP-FROM-CYC-TO-PENN-POS", 2, 0, false);
			declareMacro("with_el_formula_terms", "WITH-EL-FORMULA-TERMS");
			declareFunction("number_meanings_equalP", "NUMBER-MEANINGS-EQUAL?", 2, 0, false);
			declareFunction("number_meanings_results_equalP", "NUMBER-MEANINGS-RESULTS-EQUAL?", 2, 0, false);
			declareFunction("tokenizing_test_covering", "TOKENIZING-TEST-COVERING", 2, 0, false);
		}
		if (SubLFiles.USE_V2) {
			declareFunction("get_lex_entries_for_prefix", "GET-LEX-ENTRIES-FOR-PREFIX", 5, 0, false);
		}
		return NIL;
	}

	public static SubLObject declare_abstract_lexicon_file_Previous() {
		declareFunction("get_cyc_to_penn_map", "GET-CYC-TO-PENN-MAP", 0, 0, false);
		declareFunction("ensure_cyc_to_penn_map", "ENSURE-CYC-TO-PENN-MAP", 0, 0, false);
		declareFunction("reinitialize_cyc_to_penn_map", "REINITIALIZE-CYC-TO-PENN-MAP", 0, 0, false);
		declareFunction("get_cyc_to_penn_list", "GET-CYC-TO-PENN-LIST", 0, 0, false);
		declareFunction("ensure_cyc_to_penn_list", "ENSURE-CYC-TO-PENN-LIST", 0, 0, false);
		declareFunction("rebuild_cyc_to_penn_map", "REBUILD-CYC-TO-PENN-MAP", 0, 0, false);
		declareFunction("build_cyc_to_penn_map", "BUILD-CYC-TO-PENN-MAP", 0, 0, false);
		declareFunction("build_cyc_to_supertag_map", "BUILD-CYC-TO-SUPERTAG-MAP", 0, 0, false);
		declareFunction("textract_lemma_print_function_trampoline", "TEXTRACT-LEMMA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("textract_lemma_p", "TEXTRACT-LEMMA-P", 1, 0, false);
		new abstract_lexicon.$textract_lemma_p$UnaryFunction();
		declareFunction("textract_lemma_paragraph", "TEXTRACT-LEMMA-PARAGRAPH", 1, 0, false);
		declareFunction("textract_lemma_sentence", "TEXTRACT-LEMMA-SENTENCE", 1, 0, false);
		declareFunction("textract_lemma_word", "TEXTRACT-LEMMA-WORD", 1, 0, false);
		declareFunction("textract_lemma_string", "TEXTRACT-LEMMA-STRING", 1, 0, false);
		declareFunction("textract_lemma_canon", "TEXTRACT-LEMMA-CANON", 1, 0, false);
		declareFunction("textract_lemma_type", "TEXTRACT-LEMMA-TYPE", 1, 0, false);
		declareFunction("_csetf_textract_lemma_paragraph", "_CSETF-TEXTRACT-LEMMA-PARAGRAPH", 2, 0, false);
		declareFunction("_csetf_textract_lemma_sentence", "_CSETF-TEXTRACT-LEMMA-SENTENCE", 2, 0, false);
		declareFunction("_csetf_textract_lemma_word", "_CSETF-TEXTRACT-LEMMA-WORD", 2, 0, false);
		declareFunction("_csetf_textract_lemma_string", "_CSETF-TEXTRACT-LEMMA-STRING", 2, 0, false);
		declareFunction("_csetf_textract_lemma_canon", "_CSETF-TEXTRACT-LEMMA-CANON", 2, 0, false);
		declareFunction("_csetf_textract_lemma_type", "_CSETF-TEXTRACT-LEMMA-TYPE", 2, 0, false);
		declareFunction("make_textract_lemma", "MAKE-TEXTRACT-LEMMA", 0, 1, false);
		declareFunction("visit_defstruct_textract_lemma", "VISIT-DEFSTRUCT-TEXTRACT-LEMMA", 2, 0, false);
		declareFunction("visit_defstruct_object_textract_lemma_method", "VISIT-DEFSTRUCT-OBJECT-TEXTRACT-LEMMA-METHOD", 2, 0, false);
		declareFunction("new_textract_lemma", "NEW-TEXTRACT-LEMMA", 1, 0, false);
		declareFunction("textract_lemma_print", "TEXTRACT-LEMMA-PRINT", 3, 0, false);
		declareFunction("get_lex_entry_properties", "GET-LEX-ENTRY-PROPERTIES", 1, 0, false);
		declareFunction("set_lex_entry_properties", "SET-LEX-ENTRY-PROPERTIES", 2, 0, false);
		declareFunction("get_lex_entry_supported_properties", "GET-LEX-ENTRY-SUPPORTED-PROPERTIES", 1, 0, false);
		declareFunction("set_lex_entry_supported_properties", "SET-LEX-ENTRY-SUPPORTED-PROPERTIES", 2, 0, false);
		declareFunction("get_lex_entry_computed_properties", "GET-LEX-ENTRY-COMPUTED-PROPERTIES", 1, 0, false);
		declareFunction("set_lex_entry_computed_properties", "SET-LEX-ENTRY-COMPUTED-PROPERTIES", 2, 0, false);
		declareFunction("get_lex_entry_stored_properties", "GET-LEX-ENTRY-STORED-PROPERTIES", 1, 0, false);
		declareFunction("set_lex_entry_stored_properties", "SET-LEX-ENTRY-STORED-PROPERTIES", 2, 0, false);
		declareFunction("subloop_reserved_initialize_lex_entry_class", "SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-CLASS", 1, 0, false);
		declareFunction("subloop_reserved_initialize_lex_entry_instance", "SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-INSTANCE", 1, 0, false);
		declareFunction("lex_entry_p", "LEX-ENTRY-P", 1, 0, false);
		declareFunction("lex_entry_initialize_method", "LEX-ENTRY-INITIALIZE-METHOD", 1, 0, false);
		declareFunction("lex_entry_get_method", "LEX-ENTRY-GET-METHOD", 2, 0, false);
		declareFunction("lex_entry_denot", "LEX-ENTRY-DENOT", 1, 0, false);
		declareFunction("lex_entry_semtrans", "LEX-ENTRY-SEMTRANS", 1, 0, false);
		declareFunction("lex_entry_trie_entry", "LEX-ENTRY-TRIE-ENTRY", 1, 0, false);
		declareFunction("lex_entry_set_method", "LEX-ENTRY-SET-METHOD", 3, 0, false);
		declareFunction("lex_entry_copy_method", "LEX-ENTRY-COPY-METHOD", 1, 0, false);
		declareFunction("lex_entry_nounP_method", "LEX-ENTRY-NOUN?-METHOD", 1, 1, false);
		declareFunction("lex_entry_print_method", "LEX-ENTRY-PRINT-METHOD", 3, 0, false);
		declareFunction("lex_entry_nominal_p_method", "LEX-ENTRY-NOMINAL-P-METHOD", 1, 0, false);
		declareFunction("lex_entry_verbal_p_method", "LEX-ENTRY-VERBAL-P-METHOD", 1, 0, false);
		declareFunction("lex_entry_adjectival_p_method", "LEX-ENTRY-ADJECTIVAL-P-METHOD", 1, 0, false);
		declareFunction("lex_entry_adverbial_p_method", "LEX-ENTRY-ADVERBIAL-P-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_term_method", "LEX-ENTRY-COMPUTE-TERM-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_gender_method", "LEX-ENTRY-COMPUTE-GENDER-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_penn_tags_method", "LEX-ENTRY-COMPUTE-PENN-TAGS-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_backoff_penn_tags_method", "LEX-ENTRY-COMPUTE-BACKOFF-PENN-TAGS-METHOD", 1, 0, false);
		declareFunction("tag_backoffs", "TAG-BACKOFFS", 1, 0, false);
		declareFunction("lex_entry_compute_super_tags_method", "LEX-ENTRY-COMPUTE-SUPER-TAGS-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_cyc_pos_method", "LEX-ENTRY-COMPUTE-CYC-POS-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_is_ner_entry_method", "LEX-ENTRY-COMPUTE-IS-NER-ENTRY-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_cyc_category_method", "LEX-ENTRY-COMPUTE-CYC-CATEGORY-METHOD", 1, 0, false);
		declareFunction("lex_entry_compute_inflections_method", "LEX-ENTRY-COMPUTE-INFLECTIONS-METHOD", 1, 0, false);
		declareFunction("get_abstract_lexicon_stop_words", "GET-ABSTRACT-LEXICON-STOP-WORDS", 1, 0, false);
		declareFunction("set_abstract_lexicon_stop_words", "SET-ABSTRACT-LEXICON-STOP-WORDS", 2, 0, false);
		declareFunction("get_abstract_lexicon_allow_stemming", "GET-ABSTRACT-LEXICON-ALLOW-STEMMING", 1, 0, false);
		declareFunction("set_abstract_lexicon_allow_stemming", "SET-ABSTRACT-LEXICON-ALLOW-STEMMING", 2, 0, false);
		declareFunction("get_abstract_lexicon_active_learners", "GET-ABSTRACT-LEXICON-ACTIVE-LEARNERS", 1, 0, false);
		declareFunction("set_abstract_lexicon_active_learners", "SET-ABSTRACT-LEXICON-ACTIVE-LEARNERS", 2, 0, false);
		declareFunction("get_abstract_lexicon_learned", "GET-ABSTRACT-LEXICON-LEARNED", 1, 0, false);
		declareFunction("set_abstract_lexicon_learned", "SET-ABSTRACT-LEXICON-LEARNED", 2, 0, false);
		declareFunction("get_abstract_lexicon_allow_fabricationP", "GET-ABSTRACT-LEXICON-ALLOW-FABRICATION?", 1, 0, false);
		declareFunction("set_abstract_lexicon_allow_fabricationP", "SET-ABSTRACT-LEXICON-ALLOW-FABRICATION?", 2, 0, false);
		declareFunction("get_abstract_lexicon_case_sensitivity", "GET-ABSTRACT-LEXICON-CASE-SENSITIVITY", 1, 0, false);
		declareFunction("set_abstract_lexicon_case_sensitivity", "SET-ABSTRACT-LEXICON-CASE-SENSITIVITY", 2, 0, false);
		declareFunction("get_abstract_lexicon_ignore_cacheP", "GET-ABSTRACT-LEXICON-IGNORE-CACHE?", 1, 0, false);
		declareFunction("set_abstract_lexicon_ignore_cacheP", "SET-ABSTRACT-LEXICON-IGNORE-CACHE?", 2, 0, false);
		declareFunction("get_abstract_lexicon_cache", "GET-ABSTRACT-LEXICON-CACHE", 1, 0, false);
		declareFunction("set_abstract_lexicon_cache", "SET-ABSTRACT-LEXICON-CACHE", 2, 0, false);
		declareFunction("get_abstract_lexicon_trie", "GET-ABSTRACT-LEXICON-TRIE", 1, 0, false);
		declareFunction("set_abstract_lexicon_trie", "SET-ABSTRACT-LEXICON-TRIE", 2, 0, false);
		declareFunction("get_abstract_lexicon_excluded_pos_list", "GET-ABSTRACT-LEXICON-EXCLUDED-POS-LIST", 1, 0, false);
		declareFunction("set_abstract_lexicon_excluded_pos_list", "SET-ABSTRACT-LEXICON-EXCLUDED-POS-LIST", 2, 0, false);
		declareFunction("get_abstract_lexicon_excluded_preds", "GET-ABSTRACT-LEXICON-EXCLUDED-PREDS", 1, 0, false);
		declareFunction("set_abstract_lexicon_excluded_preds", "SET-ABSTRACT-LEXICON-EXCLUDED-PREDS", 2, 0, false);
		declareFunction("get_abstract_lexicon_root_mt", "GET-ABSTRACT-LEXICON-ROOT-MT", 1, 0, false);
		declareFunction("set_abstract_lexicon_root_mt", "SET-ABSTRACT-LEXICON-ROOT-MT", 2, 0, false);
		declareFunction("get_abstract_lexicon_base_mt", "GET-ABSTRACT-LEXICON-BASE-MT", 1, 0, false);
		declareFunction("set_abstract_lexicon_base_mt", "SET-ABSTRACT-LEXICON-BASE-MT", 2, 0, false);
		declareFunction("get_abstract_lexicon_excluded_mts", "GET-ABSTRACT-LEXICON-EXCLUDED-MTS", 1, 0, false);
		declareFunction("set_abstract_lexicon_excluded_mts", "SET-ABSTRACT-LEXICON-EXCLUDED-MTS", 2, 0, false);
		declareFunction("get_abstract_lexicon_allowed_mts", "GET-ABSTRACT-LEXICON-ALLOWED-MTS", 1, 0, false);
		declareFunction("set_abstract_lexicon_allowed_mts", "SET-ABSTRACT-LEXICON-ALLOWED-MTS", 2, 0, false);
		declareFunction("get_abstract_lexicon_default_kb_spec", "GET-ABSTRACT-LEXICON-DEFAULT-KB-SPEC", 1, 0, false);
		declareFunction("set_abstract_lexicon_default_kb_spec", "SET-ABSTRACT-LEXICON-DEFAULT-KB-SPEC", 2, 0, false);
		declareFunction("get_abstract_lexicon_default_base_mt", "GET-ABSTRACT-LEXICON-DEFAULT-BASE-MT", 1, 0, false);
		declareFunction("set_abstract_lexicon_default_base_mt", "SET-ABSTRACT-LEXICON-DEFAULT-BASE-MT", 2, 0, false);
		declareFunction("get_abstract_lexicon_default_exclude_predicates", "GET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-PREDICATES", 1, 0, false);
		declareFunction("set_abstract_lexicon_default_exclude_predicates", "SET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-PREDICATES", 2, 0, false);
		declareFunction("get_abstract_lexicon_default_exclude_mts", "GET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-MTS", 1, 0, false);
		declareFunction("set_abstract_lexicon_default_exclude_mts", "SET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-MTS", 2, 0, false);
		declareFunction("subloop_reserved_initialize_abstract_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-CLASS", 1, 0, false);
		declareFunction("subloop_reserved_initialize_abstract_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-INSTANCE", 1, 0, false);
		declareFunction("abstract_lexicon_p", "ABSTRACT-LEXICON-P", 1, 0, false);
		declareFunction("abstract_lexicon_initialize_method", "ABSTRACT-LEXICON-INITIALIZE-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_isolate_method", "ABSTRACT-LEXICON-ISOLATE-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_ignore_cache_method", "ABSTRACT-LEXICON-IGNORE-CACHE-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_ignore_cacheP_method", "ABSTRACT-LEXICON-IGNORE-CACHE?-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_allow_stemming_method", "ABSTRACT-LEXICON-ALLOW-STEMMING-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_forbid_stemming_method", "ABSTRACT-LEXICON-FORBID-STEMMING-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_allow_fabrication_method", "ABSTRACT-LEXICON-ALLOW-FABRICATION-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_forbid_fabrication_method", "ABSTRACT-LEXICON-FORBID-FABRICATION-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_fabrication_forbiddenP_method", "ABSTRACT-LEXICON-FABRICATION-FORBIDDEN?-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_fabrication_allowedP_method", "ABSTRACT-LEXICON-FABRICATION-ALLOWED?-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_valid_nl_trie_entryP_method", "ABSTRACT-LEXICON-VALID-NL-TRIE-ENTRY?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_set_case_sensitivity_method", "ABSTRACT-LEXICON-SET-CASE-SENSITIVITY-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_get_case_sensitivity_method", "ABSTRACT-LEXICON-GET-CASE-SENSITIVITY-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_initialize_excluded_preds_method", "ABSTRACT-LEXICON-INITIALIZE-EXCLUDED-PREDS-METHOD", 1, 1, false);
		declareFunction("abstract_lexicon_allow_predicate_method", "ABSTRACT-LEXICON-ALLOW-PREDICATE-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_exclude_predicate_method", "ABSTRACT-LEXICON-EXCLUDE-PREDICATE-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_excluded_predicateP_method", "ABSTRACT-LEXICON-EXCLUDED-PREDICATE?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_allowed_predicateP_method", "ABSTRACT-LEXICON-ALLOWED-PREDICATE?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_nl_trie_entry_has_allowed_predicateP_method", "ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_allow_pos_method", "ABSTRACT-LEXICON-ALLOW-POS-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_exclude_pos_method", "ABSTRACT-LEXICON-EXCLUDE-POS-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_excluded_posP_method", "ABSTRACT-LEXICON-EXCLUDED-POS?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_allowed_posP_method", "ABSTRACT-LEXICON-ALLOWED-POS?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_nl_trie_entry_has_allowed_posP_method", "ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-POS?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_add_learner_method", "ABSTRACT-LEXICON-ADD-LEARNER-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_remove_learner_method", "ABSTRACT-LEXICON-REMOVE-LEARNER-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_get_learners_method", "ABSTRACT-LEXICON-GET-LEARNERS-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_set_learners_method", "ABSTRACT-LEXICON-SET-LEARNERS-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_initialize_allowed_mts_method", "ABSTRACT-LEXICON-INITIALIZE-ALLOWED-MTS-METHOD", 1, 1, false);
		declareFunction("abstract_lexicon_set_base_mt_method", "ABSTRACT-LEXICON-SET-BASE-MT-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_get_base_mt_method", "ABSTRACT-LEXICON-GET-BASE-MT-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_allow_mt_method", "ABSTRACT-LEXICON-ALLOW-MT-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_allow_genl_mts_method", "ABSTRACT-LEXICON-ALLOW-GENL-MTS-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_forbid_mt_method", "ABSTRACT-LEXICON-FORBID-MT-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_allowed_mtP_method", "ABSTRACT-LEXICON-ALLOWED-MT?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_root_mt_method", "ABSTRACT-LEXICON-ROOT-MT-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_add_stop_word_method", "ABSTRACT-LEXICON-ADD-STOP-WORD-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_stop_word_p_method", "ABSTRACT-LEXICON-STOP-WORD-P-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_get_stop_words_method", "ABSTRACT-LEXICON-GET-STOP-WORDS-METHOD", 1, 0, false);
		declareFunction("abstract_lexicon_copy_method", "ABSTRACT-LEXICON-COPY-METHOD", 1, 1, false);
		declareFunction("abstract_lexicon_get_method", "ABSTRACT-LEXICON-GET-METHOD", 2, 0, false);
		declareFunction("add_lex_entries_for_trie_entries", "ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES", 4, 0, false);
		declareFunction("lex_entry_equal_p", "LEX-ENTRY-EQUAL-P", 2, 0, false);
		declareFunction("abstract_lexicon_delete_method", "ABSTRACT-LEXICON-DELETE-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_delete_entry_from_string_method", "ABSTRACT-LEXICON-DELETE-ENTRY-FROM-STRING-METHOD", 3, 0, false);
		declareFunction("delete_nl_trie_lex_entries_for_string", "DELETE-NL-TRIE-LEX-ENTRIES-FOR-STRING", 1, 0, false);
		declareFunction("abstract_lexicon_add_method", "ABSTRACT-LEXICON-ADD-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_learnedP_method", "ABSTRACT-LEXICON-LEARNED?-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_forget_method", "ABSTRACT-LEXICON-FORGET-METHOD", 1, 0, false);
		declareFunction("valid_prefixes", "VALID-PREFIXES", 2, 0, false);
		declareFunction("abstract_lexicon_prefixes_method", "ABSTRACT-LEXICON-PREFIXES-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_prefixes_from_string_method", "ABSTRACT-LEXICON-PREFIXES-FROM-STRING-METHOD", 2, 0, false);
		declareFunction("valid_prefix_keys", "VALID-PREFIX-KEYS", 3, 0, false);
		declareFunction("lexicon_equality_from_case_sensitivity", "LEXICON-EQUALITY-FROM-CASE-SENSITIVITY", 1, 0, false);
		declareFunction("abstract_lexicon_prefix_keys_method", "ABSTRACT-LEXICON-PREFIX-KEYS-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_prefix_keys_from_string_method", "ABSTRACT-LEXICON-PREFIX-KEYS-FROM-STRING-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_learn_method", "ABSTRACT-LEXICON-LEARN-METHOD", 2, 1, false);
		declareFunction("abstract_lexicon_number_learn_method", "ABSTRACT-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
		declareFunction("number_meanings", "NUMBER-MEANINGS", 1, 0, false);
		declareFunction("text_numbers", "TEXT-NUMBERS", 1, 0, false);
		declareFunction("scalar_interval_meanings", "SCALAR-INTERVAL-MEANINGS", 1, 0, false);
		declareFunction("text_scalar_intervals", "TEXT-SCALAR-INTERVALS", 1, 0, false);
		declareFunction("scalar_prefix", "SCALAR-PREFIX", 2, 0, false);
		declareFunction("prefix_strings_from_words", "PREFIX-STRINGS-FROM-WORDS", 1, 0, false);
		declareFunction("combine_words_into_string", "COMBINE-WORDS-INTO-STRING", 1, 0, false);
		declareFunction("spaces", "SPACES", 1, 0, false);
		declareFunction("clear_scalar_functionP", "CLEAR-SCALAR-FUNCTION?", 0, 0, false);
		declareFunction("remove_scalar_functionP", "REMOVE-SCALAR-FUNCTION?", 1, 1, false);
		declareFunction("scalar_functionP_internal", "SCALAR-FUNCTION?-INTERNAL", 2, 0, false);
		declareFunction("scalar_functionP", "SCALAR-FUNCTION?", 1, 1, false);
		declareFunction("abstract_lexicon_noun_compound_learn_method", "ABSTRACT-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
		declareFunction("tree_nps", "TREE-NPS", 1, 1, false);
		declareFunction("np_treeP", "NP-TREE?", 1, 1, false);
		declareFunction("compounds_from_tree", "COMPOUNDS-FROM-TREE", 1, 0, false);
		declareFunction("text_noun_compounds", "TEXT-NOUN-COMPOUNDS", 1, 0, false);
		declareFunction("noun_compound_meanings", "NOUN-COMPOUND-MEANINGS", 1, 0, false);
		declareFunction("noun_compound_meanings_of_string", "NOUN-COMPOUND-MEANINGS-OF-STRING", 1, 0, false);
		declareFunction("extract_parse_pos_pred", "EXTRACT-PARSE-POS-PRED", 1, 0, false);
		declareFunction("pos_pred_from_nc_parse", "POS-PRED-FROM-NC-PARSE", 1, 0, false);
		declareFunction("abstract_lexicon_cooccurrence_statistics_learn_method", "ABSTRACT-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_lexify_document_method", "ABSTRACT-LEXICON-LEXIFY-DOCUMENT-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_lexify_document_exhaustively_method", "ABSTRACT-LEXICON-LEXIFY-DOCUMENT-EXHAUSTIVELY-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_lexify_paragraph_method", "ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_lexify_paragraph_exhaustively_method", "ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-EXHAUSTIVELY-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_lexify_sentence_method", "ABSTRACT-LEXICON-LEXIFY-SENTENCE-METHOD", 2, 0, false);
		declareFunction("abstract_lexicon_lexify_sentence_exhaustively_method", "ABSTRACT-LEXICON-LEXIFY-SENTENCE-EXHAUSTIVELY-METHOD", 2, 0, false);
		declareFunction("get_all_prefix_words", "GET-ALL-PREFIX-WORDS", 6, 0, false);
		declareFunction("lexified_word_p", "LEXIFIED-WORD-P", 1, 0, false);
		declareFunction("possibly_merge_tokens", "POSSIBLY-MERGE-TOKENS", 1, 0, false);
		declareFunction("get_lex_entries_for_prefix", "GET-LEX-ENTRIES-FOR-PREFIX", 5, 1, false);
		declareFunction("reconstruct_string_from_tokens", "RECONSTRUCT-STRING-FROM-TOKENS", 2, 0, false);
		declareFunction("token_list_equalp", "TOKEN-LIST-EQUALP", 2, 1, false);
		declareFunction("unstemmed_tokens_from_tokens", "UNSTEMMED-TOKENS-FROM-TOKENS", 3, 0, false);
		declareFunction("order_penn_tags", "ORDER-PENN-TAGS", 2, 0, false);
		declareFunction("some_head_initial_lex_entry_has_tag", "SOME-HEAD-INITIAL-LEX-ENTRY-HAS-TAG", 2, 0, false);
		declareFunction("entries_tags", "ENTRIES-TAGS", 1, 0, false);
		declareFunction("entries_backoff_tags", "ENTRIES-BACKOFF-TAGS", 1, 0, false);
		declareFunction("tags_matching_backoff_tags", "TAGS-MATCHING-BACKOFF-TAGS", 2, 0, false);
		declareFunction("guess_category", "GUESS-CATEGORY", 3, 0, false);
		declareFunction("abstract_lexicon_lexify_words_method", "ABSTRACT-LEXICON-LEXIFY-WORDS-METHOD", 2, 0, false);
		declareFunction("build_multi_word_lexeme", "BUILD-MULTI-WORD-LEXEME", 1, 0, false);
		declareFunction("abstract_lexicon_tokenize_method", "ABSTRACT-LEXICON-TOKENIZE-METHOD", 2, 0, false);
		declareMacro("do_lexicon", "DO-LEXICON");
		declareFunction("abstract_lexicon_iterator_method", "ABSTRACT-LEXICON-ITERATOR-METHOD", 1, 0, false);
		declareFunction("new_lexicon_from_kb_spec", "NEW-LEXICON-FROM-KB-SPEC", 1, 0, false);
		declareFunction("lexicon_spec_class_name", "LEXICON-SPEC-CLASS-NAME", 1, 0, false);
		declareFunction("clear_preds_for_lexicon_exclusion", "CLEAR-PREDS-FOR-LEXICON-EXCLUSION", 0, 0, false);
		new abstract_lexicon.$clear_preds_for_lexicon_exclusion$ZeroArityFunction();
		declareFunction("remove_preds_for_lexicon_exclusion", "REMOVE-PREDS-FOR-LEXICON-EXCLUSION", 1, 0, false);
		declareFunction("preds_for_lexicon_exclusion_internal", "PREDS-FOR-LEXICON-EXCLUSION-INTERNAL", 1, 0, false);
		declareFunction("preds_for_lexicon_exclusion", "PREDS-FOR-LEXICON-EXCLUSION", 1, 0, false);
		declareFunction("new_lexicon_iterator", "NEW-LEXICON-ITERATOR", 1, 0, false);
		declareFunction("abstract_lexicon_iterator_state_print_function_trampoline", "ABSTRACT-LEXICON-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction("abstract_lexicon_iterator_state_p", "ABSTRACT-LEXICON-ITERATOR-STATE-P", 1, 0, false);
		new abstract_lexicon.$abstract_lexicon_iterator_state_p$UnaryFunction();
		declareFunction("abstract_lexicon_iterator_state_trie_iterator", "ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR", 1, 0, false);
		declareFunction("abstract_lexicon_iterator_state_next_entries", "ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES", 1, 0, false);
		declareFunction("abstract_lexicon_iterator_state_lexicon", "ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON", 1, 0, false);
		declareFunction("_csetf_abstract_lexicon_iterator_state_trie_iterator", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR", 2, 0, false);
		declareFunction("_csetf_abstract_lexicon_iterator_state_next_entries", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES", 2, 0, false);
		declareFunction("_csetf_abstract_lexicon_iterator_state_lexicon", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON", 2, 0, false);
		declareFunction("make_abstract_lexicon_iterator_state", "MAKE-ABSTRACT-LEXICON-ITERATOR-STATE", 0, 1, false);
		declareFunction("visit_defstruct_abstract_lexicon_iterator_state", "VISIT-DEFSTRUCT-ABSTRACT-LEXICON-ITERATOR-STATE", 2, 0, false);
		declareFunction("visit_defstruct_object_abstract_lexicon_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-ABSTRACT-LEXICON-ITERATOR-STATE-METHOD", 2, 0, false);
		declareFunction("new_abstract_lexicon_iterator_state", "NEW-ABSTRACT-LEXICON-ITERATOR-STATE", 1, 0, false);
		declareFunction("abstract_lexicon_iterator_state_done_p", "ABSTRACT-LEXICON-ITERATOR-STATE-DONE-P", 1, 0, false);
		declareFunction("abstract_lexicon_iterator_state_next", "ABSTRACT-LEXICON-ITERATOR-STATE-NEXT", 1, 0, false);
		declareFunction("valid_denotsP", "VALID-DENOTS?", 1, 0, false);
		declareFunction("lex_entry2nl_trie_entry", "LEX-ENTRY2NL-TRIE-ENTRY", 1, 0, false);
		declareFunction("map_from_cyc_to_penn_pos", "MAP-FROM-CYC-TO-PENN-POS", 2, 0, false);
		declareMacro("with_el_formula_terms", "WITH-EL-FORMULA-TERMS");
		declareFunction("number_meanings_equalP", "NUMBER-MEANINGS-EQUAL?", 2, 0, false);
		declareFunction("number_meanings_results_equalP", "NUMBER-MEANINGS-RESULTS-EQUAL?", 2, 0, false);
		declareFunction("tokenizing_test_covering", "TOKENIZING-TEST-COVERING", 2, 0, false);
		return NIL;
	}

	static private final SubLSymbol $sym347$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLSymbol $sym348$_GENLMT = makeSymbol("?GENLMT");

	static private final SubLList $list_alt350 = list(makeSymbol("?GENLMT"));

	static private final SubLList $list_alt352 = list(makeString("@param MT possibly-hlmt-p; the mt to be forbidden for retrieval of lex entries"), list(makeSymbol("CHECK-TYPE"), makeSymbol("MT"), makeSymbol("POSSIBLY-HLMT-P")), list(makeSymbol("SET-ADD"), makeSymbol("MT"), makeSymbol("EXCLUDED-MTS")), list(makeSymbol("SET-REMOVE"), makeSymbol("MT"), makeSymbol("ALLOWED-MTS")),
			list(makeSymbol("CSETQ"), makeSymbol("ROOT-MT"), makeKeyword("UNINITIALIZED")), list(RET, makeSymbol("SELF")));

	static private final SubLList $list_alt354 = list(makeString("@param MT possibly-hlmt-p; are assertions in MT allowed in this lexicon?"), list(makeSymbol("PUNLESS"), makeSymbol("MT"), list(RET, NIL)),
			list(makeSymbol("PCOND"), list(list(makeSymbol("SET-MEMBER?"), makeSymbol("MT"), makeSymbol("ALLOWED-MTS")), list(RET, T)), list(list(makeSymbol("SET-MEMBER?"), makeSymbol("MT"), makeSymbol("EXCLUDED-MTS")), list(RET, NIL)),
					list(list(makeSymbol("CNOT"), list(makeSymbol("HLMT-P"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-BASE-MT"))))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FORBID-MT")), makeSymbol("MT")), list(RET, NIL)),
					list(list(makeSymbol("GENL-LEXICON-MT?"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-BASE-MT"))), makeSymbol("MT")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOW-MT")), makeSymbol("MT")), list(RET, T)), list(T, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FORBID-MT")), makeSymbol("MT")), list(RET, NIL))));

	static private final SubLSymbol $sym355$ABSTRACT_LEXICON_ALLOWED_MT__METHOD = makeSymbol("ABSTRACT-LEXICON-ALLOWED-MT?-METHOD");

	static private final SubLList $list_alt356 = list(makeKeyword("PROTECTED"), makeKeyword("AUTO-UPDATE"));

	static private final SubLList $list_alt357 = list(makeString("return the one Mt that is the composition of all the allowed/disallowed mts, an MtUnionFn of all the Mts"),
			list(makeSymbol("PUNLESS"), list(makeSymbol("INITIALIZED-P"), makeSymbol("ROOT-MT")),
					list(makeSymbol("CLET"),
							list(list(makeSymbol("THIS-ALLOWED-MTS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ALLOWED-MTS")))), list(makeSymbol("THIS-BASE-MT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-BASE-MT")))),
									list(makeSymbol("MTS"), list(makeSymbol("FIF"), list(makeSymbol("POSSIBLY-HLMT-P"), makeSymbol("THIS-BASE-MT")), list(makeSymbol("CONS"), makeSymbol("THIS-BASE-MT"), list(makeSymbol("SET-ELEMENT-LIST"), makeSymbol("THIS-ALLOWED-MTS"))), list(makeSymbol("SET-ELEMENT-LIST"), makeSymbol("ALLOWED-MTS")))), list(makeSymbol("MIN-MTS"), list(makeSymbol("MIN-MTS"), makeSymbol("MTS")))),
							list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ROOT-MT")), list(makeSymbol("CANONICALIZE-HLMT"), list(makeSymbol("MAKE-EL-FORMULA"), reader_make_constant_shell("MtUnionFn"), makeSymbol("MIN-MTS")))))),
			list(RET, makeSymbol("ROOT-MT")));

	static private final SubLList $list_alt360 = list(makeSymbol("STRING"));

	static private final SubLList $list_alt361 = list(list(makeSymbol("CLET"), list(list(makeSymbol("STOP-WORD-SET"), makeSymbol("STOP-WORDS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("SET-P"), makeSymbol("STOP-WORD-SET")), list(makeSymbol("CSETQ"), makeSymbol("STOP-WORD-SET"), list(makeSymbol("NEW-SET"), list(QUOTE, EQUAL)))), list(makeSymbol("SET-ADD"), makeSymbol("STRING"), makeSymbol("STOP-WORD-SET")),
			list(makeSymbol("CSETQ"), makeSymbol("STOP-WORDS"), makeSymbol("STOP-WORD-SET")), list(RET, makeSymbol("STOP-WORDS"))));

	static private final SubLSymbol $sym362$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt364 = list(list(RET, list(makeSymbol("CAND"), makeSymbol("STOP-WORDS"), list(makeSymbol("BOOLEAN"), list(makeSymbol("SET-MEMBER?"), makeSymbol("STRING"), makeSymbol("STOP-WORDS"))))));

	static private final SubLSymbol $sym365$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt368 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("SET-P"), makeSymbol("STOP-WORDS")), list(makeSymbol("CSETQ"), makeSymbol("STOP-WORDS"), list(makeSymbol("NEW-SET"), list(QUOTE, EQUAL)))), list(RET, makeSymbol("STOP-WORDS")));

	static private final SubLSymbol $sym369$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt371 = list(makeSymbol("&OPTIONAL"), makeSymbol("TARGET"));

	static private final SubLList $list_alt372 = list(makeString("@return ABSTRACT-LEXICON-P; a copy of this lexicon.\n@note -- list values are copied with copy-list.\n@note -- cache and trie are set to their defaults."), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("TARGET"), makeSymbol("ABSTRACT-LEXICON-P")),
			list(makeSymbol("PUNLESS"), makeSymbol("TARGET"), list(makeSymbol("CSETQ"), makeSymbol("TARGET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CLONE")))), list(makeSymbol("WARN"), makeString("Cloned instance: ~S"), makeSymbol("TARGET"))),
			list(makeSymbol("CDOLIST"), list(makeSymbol("SLOT"), list(QUOTE, list(makeSymbol("ALLOWED-MTS"), makeSymbol("EXCLUDED-MTS"), makeSymbol("EXCLUDED-PREDS"), makeSymbol("EXCLUDED-POS-LIST"), makeSymbol("IGNORE-CACHE?"), makeSymbol("CASE-SENSITIVITY"), makeSymbol("ACTIVE-LEARNERS")))),
					list(makeSymbol("CLET"), list(list(makeSymbol("VALUE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT")))),
							list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("VALUE")), list(makeSymbol("SET-SLOT"), makeSymbol("TARGET"), makeSymbol("SLOT"), list(makeSymbol("COPY-LIST"), makeSymbol("VALUE")))), list(T, list(makeSymbol("SET-SLOT"), makeSymbol("TARGET"), makeSymbol("SLOT"), makeSymbol("VALUE")))))),
			list(RET, makeSymbol("TARGET")));

	static private final SubLSymbol $sym373$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLString $str_alt376$Cloned_instance___S = makeString("Cloned instance: ~S");

	static private final SubLList $list_alt377 = list(makeSymbol("ALLOWED-MTS"), makeSymbol("EXCLUDED-MTS"), makeSymbol("EXCLUDED-PREDS"), makeSymbol("EXCLUDED-POS-LIST"), makeSymbol("IGNORE-CACHE?"), makeSymbol("CASE-SENSITIVITY"), makeSymbol("ACTIVE-LEARNERS"));

	static private final SubLList $list_alt379 = list(makeString("@param STRING stringp;\n   @return listp; the list of  lex-entry-p associated with STRING in this lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STOP-WORD-P")), makeSymbol("STRING")), list(RET, NIL)),
			list(makeSymbol("PUNLESS"), makeSymbol("IGNORE-CACHE?"), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("LEX-ENTRIES"), makeSymbol("EXISTS?")), list(makeSymbol("CACHE-GET"), makeSymbol("CACHE"), makeSymbol("STRING")), list(makeSymbol("PWHEN"), makeSymbol("EXISTS?"), list(RET, makeSymbol("LEX-ENTRIES"))))),
			list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-LEX-ENTRIES")), makeSymbol("STRING"), NIL)), list(makeSymbol("NL-TRIE-ENTRIES"), list(makeSymbol("NL-TRIE-SEARCH"), makeSymbol("STRING"), makeSymbol("TRIE"), makeSymbol("CASE-SENSITIVITY")))),
					list(makeSymbol("CSETQ"), makeSymbol("LEX-ENTRIES"), list(makeSymbol("ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES"), makeSymbol("NL-TRIE-ENTRIES"), makeSymbol("STRING"), makeSymbol("SELF"), makeSymbol("LEX-ENTRIES"))),
					list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NULL"), makeSymbol("LEX-ENTRIES")), list(EQ, makeSymbol("CASE-SENSITIVITY"), makeKeyword("PREFERRED"))),
							list(makeSymbol("CLET"), list(list(makeSymbol("NL-TRIE-ENTRIES"), list(makeSymbol("NL-TRIE-SEARCH"), makeSymbol("STRING"), makeSymbol("TRIE"), makeKeyword("OFF")))), list(makeSymbol("CSETQ"), makeSymbol("LEX-ENTRIES"), list(makeSymbol("ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES"), makeSymbol("NL-TRIE-ENTRIES"), makeSymbol("STRING"), makeSymbol("SELF"), makeSymbol("LEX-ENTRIES"))))),
					list(makeSymbol("PUNLESS"), makeSymbol("IGNORE-CACHE?"), list(makeSymbol("CACHE-SET"), makeSymbol("CACHE"), makeSymbol("STRING"), makeSymbol("LEX-ENTRIES"))), list(RET, makeSymbol("LEX-ENTRIES"))));

	static private final SubLSymbol $sym380$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt387 = list(makeString("Deletes all entries for STRING from this lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")),
			list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-KEY"), list(makeSymbol("NL-TRIE-STRING-TOKENIZE"), makeSymbol("STRING"))), list(makeSymbol("TRIE-ENTRIES"), list(makeSymbol("STRIE-LOOKUP"), makeSymbol("TRIE"), makeSymbol("TRIE-KEY")))),
					list(makeSymbol("CDOLIST"), list(makeSymbol("TRIE-ENTRY"), makeSymbol("TRIE-ENTRIES")), list(makeSymbol("PWHEN"), list(makeSymbol("LEX-ENTRY-P"), makeSymbol("TRIE-ENTRY")), list(makeSymbol("STRIE-UNASSOCIATE"), makeSymbol("TRIE"), makeSymbol("TRIE-KEY"), makeSymbol("TRIE-ENTRY"))))),
			list(makeSymbol("CACHE-REMOVE"), makeSymbol("CACHE"), makeSymbol("STRING")), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym388$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt391 = list(makeSymbol("LEX-ENTRY"), makeSymbol("STRING"));

	static private final SubLList $list_alt392 = list(makeString("Deletes the entry associating STRING with LEX-ENTRY from this lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRY-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-KEY"), list(makeSymbol("NL-TRIE-STRING-TOKENIZE"), makeSymbol("STRING")))), list(makeSymbol("STRIE-UNASSOCIATE"), makeSymbol("TRIE"), makeSymbol("TRIE-KEY"), makeSymbol("LEX-ENTRY"))),
			list(makeSymbol("CLET"), list(list(makeSymbol("CACHE-ENTRIES"), list(makeSymbol("REMOVE"), makeSymbol("LEX-ENTRY"), list(makeSymbol("CACHE-GET"), makeSymbol("CACHE"), makeSymbol("STRING")), list(QUOTE, EQUAL)))), list(makeSymbol("CACHE-SET"), makeSymbol("CACHE"), makeSymbol("STRING"), makeSymbol("CACHE-ENTRIES"))), list(RET, makeSymbol("SELF")));

	static private final SubLSymbol $sym393$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt398 = list(makeSymbol("LEX-ENTRY"));

	static private final SubLList $list_alt399 = list(makeString("Adds LEX-ENTRY to this lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRY-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("STRING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("GET")), makeKeyword("STRING"))), makeSymbol("RESULT")), list(makeSymbol("PUNLESS"), list(makeSymbol("CHAR-POSITION"), makeSymbol("*STRIE-NULL-KEY*"), makeSymbol("STRING")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEARNED")),
					list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("NL-TRIE-INSERT-ENTRY"), makeSymbol("TRIE"), list(makeSymbol("NL-TRIE-STRING-TOKENIZE"), makeSymbol("STRING")), list(makeSymbol("LEX-ENTRY2NL-TRIE-ENTRY"), makeSymbol("LEX-ENTRY")))), list(makeSymbol("CACHE-REMOVE"), makeSymbol("CACHE"), makeSymbol("STRING")), list(RET, makeSymbol("RESULT"))), list(RET, NIL)));

	static private final SubLSymbol $sym402$LEARNED_ = makeSymbol("LEARNED?");

	static private final SubLList $list_alt403 = list(makeString("Check to see if this lex entry was learned by this lexicon"), list(RET, list(makeSymbol("MEMBER?"), makeSymbol("LEX-ENTRY"), makeSymbol("LEARNED"))));

	static private final SubLSymbol $sym404$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLSymbol $sym405$ABSTRACT_LEXICON_LEARNED__METHOD = makeSymbol("ABSTRACT-LEXICON-LEARNED?-METHOD");

	static private final SubLList $list_alt407 = list(makeString("Delete all entries previously learned from this lexicon"), list(makeSymbol("CLET"), list(list(makeSymbol("DELETED"), makeSymbol("LEARNED"))),
			list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), makeSymbol("LEARNED")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DELETE")), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("STRING")))), list(makeSymbol("CSETQ"), makeSymbol("LEARNED"), NIL), list(RET, makeSymbol("DELETED"))));

	static private final SubLSymbol $sym408$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt411 = list(makeSymbol("STRINGS"));

	static private final SubLList $list_alt412 = list(makeString("@param STRINGS; listp\n   @return listp; a list of conses whose car is a list of strings which are\n   in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\n   with that string"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRINGS"), makeSymbol("LISTP")),
			list(RET, list(makeSymbol("VALID-PREFIXES"), list(makeSymbol("NL-TRIE-PREFIXES"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY")), makeSymbol("SELF"))));

	static private final SubLSymbol $sym413$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt417 = list(makeString("@param STRING stringp\n   @return listp; a list of conses whose car is a list of strings which are\n   in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\n   with that string"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")),
			list(makeSymbol("CLET"),
					list(list(makeSymbol("PREFIX-KEYS"), list(makeSymbol("NL-TRIE-PREFIX-KEYS-FROM-STRING"), makeSymbol("TRIE"), makeSymbol("STRING"), makeSymbol("CASE-SENSITIVITY"))), list(makeSymbol("NL-TRIE-ENTRY"), list(makeSymbol("SECOND"), list(makeSymbol("FIRST"), makeSymbol("PREFIX-KEYS")))), list(makeSymbol("PREFIX-STRING"), list(makeSymbol("NL-TRIE-ENTRY-STRING"), makeSymbol("NL-TRIE-ENTRY")))),
					list(RET, list(makeSymbol("LIST"), list(makeSymbol("VALID-PREFIXES"), makeSymbol("PREFIX-KEYS"), makeSymbol("SELF")), makeSymbol("PREFIX-STRING")))));

	static private final SubLSymbol $sym418$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLString $str_alt421$Don_t_recognize_lexicon_case_sens = makeString("Don't recognize lexicon case sensitivity value of ~S");

	static private final SubLList $list_alt423 = list(makeString("@param STRINGS; listp\n   @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRINGS"), makeSymbol("LISTP")),
			list(RET, list(makeSymbol("VALID-PREFIX-KEYS"), list(makeSymbol("NL-TRIE-PREFIXES"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY")), makeSymbol("SELF"), makeSymbol("CASE-SENSITIVITY"))));

	static private final SubLSymbol $sym424$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt427 = list(makeString("@param STRING stringp\n   @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")),
			list(makeSymbol("CLET"),
					list(list(makeSymbol("MY-PREFIX-KEYS"), list(makeSymbol("NL-TRIE-PREFIX-KEYS-FROM-STRING"), makeSymbol("TRIE"), makeSymbol("STRING"), makeSymbol("CASE-SENSITIVITY"))), list(makeSymbol("NL-TRIE-ENTRY"), list(makeSymbol("SECOND"), list(makeSymbol("FIRST"), makeSymbol("MY-PREFIX-KEYS")))), list(makeSymbol("PREFIX-STRING"), list(makeSymbol("NL-TRIE-ENTRY-STRING"), makeSymbol("NL-TRIE-ENTRY")))),
					list(RET, list(makeSymbol("LIST"), list(makeSymbol("VALID-PREFIX-KEYS"), makeSymbol("MY-PREFIX-KEYS"), makeSymbol("SELF"), makeSymbol("CASE-SENSITIVITY")), makeSymbol("PREFIX-STRING")))));

	static private final SubLSymbol $sym428$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt431 = list(makeSymbol("TEXT"), makeSymbol("&OPTIONAL"), list(makeSymbol("LEARNERS")));

	static private final SubLList $list_alt432 = list(
			makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @param LEARNERS listp; a list of learning methods. Each such method\n   is expected to take a natural language string as input and return a \n   list of lex-entries\n   @return non-negative-integerp; the number of entries learned\n   @note it is the responsibility of each learner to add any entries to the lexicon"),
			list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("PUNLESS"), makeSymbol("LEARNERS"), list(makeSymbol("CSETQ"), makeSymbol("LEARNERS"), makeSymbol("ACTIVE-LEARNERS"))),
			list(makeSymbol("CLET"), list(makeSymbol("LEARNED-HERE")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEARNER"), makeSymbol("LEARNERS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), makeSymbol("LEARNER"), makeSymbol("TEXT"))), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEARNED-HERE")))), list(RET, makeSymbol("LEARNED-HERE"))));

	static private final SubLSymbol $sym433$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt436 = list(makeSymbol("TEXT"));

	static private final SubLList $list_alt437 = list(list(makeSymbol("IGNORE"), makeSymbol("TEXT")), list(RET, NIL));

	static private final SubLString $str_alt442$_ = makeString(".");

	static private final SubLSymbol $sym444$SCALAR_FUNCTION_ = makeSymbol("SCALAR-FUNCTION?");

	static private final SubLSymbol $sym445$_SCALAR_FUNCTION__CACHING_STATE_ = makeSymbol("*SCALAR-FUNCTION?-CACHING-STATE*");

	public static final SubLSymbol $kw447$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

	static private final SubLList $list_alt449 = list(makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT\n   This is a stub just to make sure that all subclasses will be have a base\n   implementation of this method, although we don\'t wish to give it a real\n   implementation as a method of this class."),
			list(makeSymbol("IGNORE"), makeSymbol("TEXT")), list(RET, NIL));

	static private final SubLList $list_alt454 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

	static private final SubLList $list_alt456 = list(reader_make_constant_shell("NLNumberFn"), reader_make_constant_shell("Plural-NLAttr"), makeKeyword("ANYTHING"));

	static private final SubLList $list_alt458 = list(reader_make_constant_shell("NLNumberFn"), reader_make_constant_shell("Singular-NLAttr"), makeKeyword("ANYTHING"));

	static private final SubLList $list_alt460 = list(reader_make_constant_shell("NLNumberFn"), reader_make_constant_shell("Mass-NLAttr"), makeKeyword("ANYTHING"));

	public static final SubLObject init_abstract_lexicon_file_alt() {
		deflexical("*CYC-TO-PENN-LIST*", NIL);
		deflexical("*CYC-TO-PENN-MAP*", NIL);
		deflexical("*CYC-TO-SUPERTAG-MAP*", NIL);
		defparameter("*CYC-TO-SUPERTAG-LIST*", $list_alt8);
		defconstant("*DTP-TEXTRACT-LEMMA*", TEXTRACT_LEMMA);
		defconstant("*NOMINAL-TAGS*", $list_alt99);
		defconstant("*VERBAL-TAGS*", $list_alt100);
		defconstant("*ADJECTIVAL-TAGS*", $list_alt101);
		defconstant("*ADVERBIAL-TAGS*", $list_alt102);
		defparameter("*PENN-TAG-BACKOFFS*", $list_alt149);
		deflexical("*SCALAR-FUNCTION?-CACHING-STATE*", NIL);
		defparameter("*LEXIFY-SENTENCE-IGNORE-POS-FOR-MULTIWORD-TOKENS*", T);
		deflexical("*PREDS-FOR-LEXICON-EXCLUSION-CACHING-STATE*", NIL);
		defconstant("*DTP-ABSTRACT-LEXICON-ITERATOR-STATE*", ABSTRACT_LEXICON_ITERATOR_STATE);
		return NIL;
	}

	public static SubLObject init_abstract_lexicon_file() {
		if (SubLFiles.USE_V1) {
			deflexical("*CYC-TO-PENN-LIST*", NIL);
			deflexical("*CYC-TO-PENN-MAP*", NIL);
			deflexical("*CYC-TO-SUPERTAG-MAP*", NIL);
			defparameter("*CYC-TO-SUPERTAG-LIST*", $list8);
			defconstant("*DTP-TEXTRACT-LEMMA*", TEXTRACT_LEMMA);
			defconstant("*NOMINAL-TAGS*", $list105);
			defconstant("*VERBAL-TAGS*", $list106);
			defconstant("*ADJECTIVAL-TAGS*", $list107);
			defconstant("*ADVERBIAL-TAGS*", $list108);
			defparameter("*PENN-TAG-BACKOFFS*", $list155);
			deflexical("*SCALAR-FUNCTION?-CACHING-STATE*", NIL);
			defparameter("*LEXIFY-SENTENCE-IGNORE-POS-FOR-MULTIWORD-TOKENS*", T);
			deflexical("*PREDS-FOR-LEXICON-EXCLUSION-CACHING-STATE*", NIL);
			defconstant("*DTP-ABSTRACT-LEXICON-ITERATOR-STATE*", ABSTRACT_LEXICON_ITERATOR_STATE);
		}
		if (SubLFiles.USE_V2) {
			defconstant("*NOMINAL-TAGS*", $list_alt99);
			defconstant("*VERBAL-TAGS*", $list_alt100);
			defconstant("*ADJECTIVAL-TAGS*", $list_alt101);
			defconstant("*ADVERBIAL-TAGS*", $list_alt102);
			defparameter("*PENN-TAG-BACKOFFS*", $list_alt149);
		}
		return NIL;
	}

	public static SubLObject init_abstract_lexicon_file_Previous() {
		deflexical("*CYC-TO-PENN-LIST*", NIL);
		deflexical("*CYC-TO-PENN-MAP*", NIL);
		deflexical("*CYC-TO-SUPERTAG-MAP*", NIL);
		defparameter("*CYC-TO-SUPERTAG-LIST*", $list8);
		defconstant("*DTP-TEXTRACT-LEMMA*", TEXTRACT_LEMMA);
		defconstant("*NOMINAL-TAGS*", $list105);
		defconstant("*VERBAL-TAGS*", $list106);
		defconstant("*ADJECTIVAL-TAGS*", $list107);
		defconstant("*ADVERBIAL-TAGS*", $list108);
		defparameter("*PENN-TAG-BACKOFFS*", $list155);
		deflexical("*SCALAR-FUNCTION?-CACHING-STATE*", NIL);
		defparameter("*LEXIFY-SENTENCE-IGNORE-POS-FOR-MULTIWORD-TOKENS*", T);
		deflexical("*PREDS-FOR-LEXICON-EXCLUSION-CACHING-STATE*", NIL);
		defconstant("*DTP-ABSTRACT-LEXICON-ITERATOR-STATE*", ABSTRACT_LEXICON_ITERATOR_STATE);
		return NIL;
	}

	static private final SubLList $list_alt466 = list(makeSymbol("DOC"));

	static private final SubLList $list_alt467 = list(makeString("@param DOC document-p; \n   @return document-p; a new version of DOC with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in DOC"), list(makeSymbol("CHECK-TYPE"), makeSymbol("DOC"), makeSymbol("DOCUMENT-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("LEXIFIED"), list(makeSymbol("MAKE-DOCUMENT"))), list(makeSymbol("PARAGRAPHS"), NIL)),
					list(makeSymbol("DOCUMENT-DO-PARAGRAPHS"), list(makeSymbol("PARAGRAPH"), makeSymbol("DOC")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXIFY-PARAGRAPH")), makeSymbol("PARAGRAPH")), makeSymbol("PARAGRAPHS"))),
					list(makeSymbol("CSETF"), list(makeSymbol("DOCUMENT-PARAGRAPHS"), makeSymbol("LEXIFIED")), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("VECTOR")), list(makeSymbol("NREVERSE"), makeSymbol("PARAGRAPHS")))), list(RET, makeSymbol("LEXIFIED"))));

	public static final SubLObject setup_abstract_lexicon_file_alt() {
		register_method($print_object_method_table$.getGlobalValue(), $dtp_textract_lemma$.getGlobalValue(), symbol_function(TEXTRACT_LEMMA_PRINT_FUNCTION_TRAMPOLINE));
		def_csetf(TEXTRACT_LEMMA_PARAGRAPH, _CSETF_TEXTRACT_LEMMA_PARAGRAPH);
		def_csetf(TEXTRACT_LEMMA_SENTENCE, _CSETF_TEXTRACT_LEMMA_SENTENCE);
		def_csetf(TEXTRACT_LEMMA_WORD, _CSETF_TEXTRACT_LEMMA_WORD);
		def_csetf(TEXTRACT_LEMMA_STRING, _CSETF_TEXTRACT_LEMMA_STRING);
		def_csetf(TEXTRACT_LEMMA_CANON, _CSETF_TEXTRACT_LEMMA_CANON);
		def_csetf(TEXTRACT_LEMMA_TYPE, _CSETF_TEXTRACT_LEMMA_TYPE);
		identity(TEXTRACT_LEMMA);
		classes.subloop_new_class(LEX_ENTRY, OBJECT, NIL, NIL, $list_alt46);
		classes.class_set_implements_slot_listeners(LEX_ENTRY, NIL);
		classes.subloop_note_class_initialization_function(LEX_ENTRY, SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_CLASS);
		classes.subloop_note_instance_initialization_function(LEX_ENTRY, SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_INSTANCE);
		subloop_reserved_initialize_lex_entry_class(LEX_ENTRY);
		methods.methods_incorporate_instance_method(INITIALIZE, LEX_ENTRY, $list_alt60, NIL, $list_alt61);
		methods.subloop_register_instance_method(LEX_ENTRY, INITIALIZE, LEX_ENTRY_INITIALIZE_METHOD);
		methods.methods_incorporate_instance_method(GET, LEX_ENTRY, $list_alt65, $list_alt66, $list_alt67);
		methods.subloop_register_instance_method(LEX_ENTRY, GET, LEX_ENTRY_GET_METHOD);
		methods.methods_incorporate_instance_method(SET, LEX_ENTRY, $list_alt65, $list_alt75, $list_alt76);
		methods.subloop_register_instance_method(LEX_ENTRY, SET, LEX_ENTRY_SET_METHOD);
		methods.methods_incorporate_instance_method(COPY, LEX_ENTRY, $list_alt65, NIL, $list_alt81);
		methods.subloop_register_instance_method(LEX_ENTRY, COPY, LEX_ENTRY_COPY_METHOD);
		methods.methods_incorporate_instance_method($sym84$NOUN_, LEX_ENTRY, $list_alt85, $list_alt86, $list_alt87);
		methods.subloop_register_instance_method(LEX_ENTRY, $sym84$NOUN_, $sym91$LEX_ENTRY_NOUN__METHOD);
		methods.methods_incorporate_instance_method(PRINT, LEX_ENTRY, $list_alt65, $list_alt93, $list_alt94);
		methods.subloop_register_instance_method(LEX_ENTRY, PRINT, LEX_ENTRY_PRINT_METHOD);
		methods.methods_incorporate_instance_method(NOMINAL_P, LEX_ENTRY, $list_alt60, NIL, $list_alt104);
		methods.subloop_register_instance_method(LEX_ENTRY, NOMINAL_P, LEX_ENTRY_NOMINAL_P_METHOD);
		methods.methods_incorporate_instance_method(VERBAL_P, LEX_ENTRY, $list_alt60, NIL, $list_alt108);
		methods.subloop_register_instance_method(LEX_ENTRY, VERBAL_P, LEX_ENTRY_VERBAL_P_METHOD);
		methods.methods_incorporate_instance_method(ADJECTIVAL_P, LEX_ENTRY, $list_alt60, NIL, $list_alt111);
		methods.subloop_register_instance_method(LEX_ENTRY, ADJECTIVAL_P, LEX_ENTRY_ADJECTIVAL_P_METHOD);
		methods.methods_incorporate_instance_method(ADVERBIAL_P, LEX_ENTRY, $list_alt60, NIL, $list_alt114);
		methods.subloop_register_instance_method(LEX_ENTRY, ADVERBIAL_P, LEX_ENTRY_ADVERBIAL_P_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_TERM, LEX_ENTRY, $list_alt60, NIL, $list_alt117);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_TERM, LEX_ENTRY_COMPUTE_TERM_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_GENDER, LEX_ENTRY, $list_alt60, NIL, $list_alt126);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_GENDER, LEX_ENTRY_COMPUTE_GENDER_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_PENN_TAGS, LEX_ENTRY, $list_alt60, NIL, $list_alt140);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_PENN_TAGS, LEX_ENTRY_COMPUTE_PENN_TAGS_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_BACKOFF_PENN_TAGS, LEX_ENTRY, $list_alt60, NIL, $list_alt147);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_BACKOFF_PENN_TAGS, LEX_ENTRY_COMPUTE_BACKOFF_PENN_TAGS_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_SUPER_TAGS, LEX_ENTRY, $list_alt60, NIL, $list_alt151);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_SUPER_TAGS, LEX_ENTRY_COMPUTE_SUPER_TAGS_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_CYC_POS, LEX_ENTRY, $list_alt60, NIL, $list_alt155);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_CYC_POS, LEX_ENTRY_COMPUTE_CYC_POS_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_IS_NER_ENTRY, LEX_ENTRY, $list_alt60, NIL, $list_alt158);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_IS_NER_ENTRY, LEX_ENTRY_COMPUTE_IS_NER_ENTRY_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_CYC_CATEGORY, LEX_ENTRY, $list_alt60, NIL, $list_alt161);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_CYC_CATEGORY, LEX_ENTRY_COMPUTE_CYC_CATEGORY_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_INFLECTIONS, LEX_ENTRY, $list_alt60, NIL, $list_alt166);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_INFLECTIONS, LEX_ENTRY_COMPUTE_INFLECTIONS_METHOD);
		classes.subloop_new_class(ABSTRACT_LEXICON, OBJECT, NIL, T, $list_alt169);
		classes.class_set_implements_slot_listeners(ABSTRACT_LEXICON, NIL);
		classes.subloop_note_class_initialization_function(ABSTRACT_LEXICON, SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_CLASS);
		classes.subloop_note_instance_initialization_function(ABSTRACT_LEXICON, SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_INSTANCE);
		subloop_reserved_initialize_abstract_lexicon_class(ABSTRACT_LEXICON);
		methods.methods_incorporate_instance_method(INITIALIZE, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt195);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, INITIALIZE, ABSTRACT_LEXICON_INITIALIZE_METHOD);
		methods.methods_incorporate_instance_method(ISOLATE, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt203);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ISOLATE, ABSTRACT_LEXICON_ISOLATE_METHOD);
		methods.methods_incorporate_instance_method(IGNORE_CACHE, ABSTRACT_LEXICON, $list_alt65, NIL, $list_alt207);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, IGNORE_CACHE, ABSTRACT_LEXICON_IGNORE_CACHE_METHOD);
		methods.methods_incorporate_instance_method($sym176$IGNORE_CACHE_, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt210);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym176$IGNORE_CACHE_, $sym212$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD);
		methods.methods_incorporate_instance_method(ALLOW_STEMMING, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt213);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_STEMMING, ABSTRACT_LEXICON_ALLOW_STEMMING_METHOD);
		methods.methods_incorporate_instance_method(FORBID_STEMMING, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt217);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORBID_STEMMING, ABSTRACT_LEXICON_FORBID_STEMMING_METHOD);
		methods.methods_incorporate_instance_method(ALLOW_FABRICATION, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt221);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_FABRICATION, ABSTRACT_LEXICON_ALLOW_FABRICATION_METHOD);
		methods.methods_incorporate_instance_method(FORBID_FABRICATION, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt225);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORBID_FABRICATION, ABSTRACT_LEXICON_FORBID_FABRICATION_METHOD);
		methods.methods_incorporate_instance_method($sym228$FABRICATION_FORBIDDEN_, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt229);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym228$FABRICATION_FORBIDDEN_, $sym231$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD);
		methods.methods_incorporate_instance_method($sym232$FABRICATION_ALLOWED_, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt233);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym232$FABRICATION_ALLOWED_, $sym235$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD);
		methods.methods_incorporate_instance_method($sym236$VALID_NL_TRIE_ENTRY_, ABSTRACT_LEXICON, $list_alt237, $list_alt238, $list_alt239);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym236$VALID_NL_TRIE_ENTRY_, $sym246$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD);
		methods.methods_incorporate_instance_method(SET_CASE_SENSITIVITY, ABSTRACT_LEXICON, $list_alt60, $list_alt248, $list_alt249);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, SET_CASE_SENSITIVITY, ABSTRACT_LEXICON_SET_CASE_SENSITIVITY_METHOD);
		methods.methods_incorporate_instance_method(GET_CASE_SENSITIVITY, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt253);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_CASE_SENSITIVITY, ABSTRACT_LEXICON_GET_CASE_SENSITIVITY_METHOD);
		methods.methods_incorporate_instance_method(INITIALIZE_EXCLUDED_PREDS, ABSTRACT_LEXICON, $list_alt60, $list_alt256, $list_alt257);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, INITIALIZE_EXCLUDED_PREDS, ABSTRACT_LEXICON_INITIALIZE_EXCLUDED_PREDS_METHOD);
		methods.methods_incorporate_instance_method(ALLOW_PREDICATE, ABSTRACT_LEXICON, $list_alt60, $list_alt262, $list_alt263);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_PREDICATE, ABSTRACT_LEXICON_ALLOW_PREDICATE_METHOD);
		methods.methods_incorporate_instance_method(EXCLUDE_PREDICATE, ABSTRACT_LEXICON, $list_alt60, $list_alt262, $list_alt267);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, EXCLUDE_PREDICATE, ABSTRACT_LEXICON_EXCLUDE_PREDICATE_METHOD);
		methods.methods_incorporate_instance_method($sym270$EXCLUDED_PREDICATE_, ABSTRACT_LEXICON, $list_alt60, $list_alt262, $list_alt271);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym270$EXCLUDED_PREDICATE_, $sym273$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD);
		methods.methods_incorporate_instance_method($sym274$ALLOWED_PREDICATE_, ABSTRACT_LEXICON, $list_alt60, $list_alt262, $list_alt275);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym274$ALLOWED_PREDICATE_, $sym277$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD);
		methods.methods_incorporate_instance_method($sym243$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, ABSTRACT_LEXICON, $list_alt60, $list_alt238, $list_alt278);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym243$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, $sym280$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD);
		methods.methods_incorporate_instance_method(ALLOW_POS, ABSTRACT_LEXICON, $list_alt60, $list_alt282, $list_alt283);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_POS, ABSTRACT_LEXICON_ALLOW_POS_METHOD);
		methods.methods_incorporate_instance_method(EXCLUDE_POS, ABSTRACT_LEXICON, $list_alt60, $list_alt282, $list_alt287);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, EXCLUDE_POS, ABSTRACT_LEXICON_EXCLUDE_POS_METHOD);
		methods.methods_incorporate_instance_method($sym290$EXCLUDED_POS_, ABSTRACT_LEXICON, $list_alt60, $list_alt282, $list_alt291);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym290$EXCLUDED_POS_, $sym293$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD);
		methods.methods_incorporate_instance_method($sym241$ALLOWED_POS_, ABSTRACT_LEXICON, $list_alt60, $list_alt282, $list_alt294);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym241$ALLOWED_POS_, $sym296$ABSTRACT_LEXICON_ALLOWED_POS__METHOD);
		methods.methods_incorporate_instance_method($sym245$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, ABSTRACT_LEXICON, $list_alt60, $list_alt238, $list_alt297);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym245$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, $sym299$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD);
		methods.methods_incorporate_instance_method(ADD_LEARNER, ABSTRACT_LEXICON, $list_alt65, $list_alt301, $list_alt302);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ADD_LEARNER, ABSTRACT_LEXICON_ADD_LEARNER_METHOD);
		methods.methods_incorporate_instance_method(REMOVE_LEARNER, ABSTRACT_LEXICON, $list_alt65, $list_alt301, $list_alt306);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, REMOVE_LEARNER, ABSTRACT_LEXICON_REMOVE_LEARNER_METHOD);
		methods.methods_incorporate_instance_method(GET_LEARNERS, ABSTRACT_LEXICON, $list_alt65, NIL, $list_alt310);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_LEARNERS, ABSTRACT_LEXICON_GET_LEARNERS_METHOD);
		methods.methods_incorporate_instance_method(SET_LEARNERS, ABSTRACT_LEXICON, $list_alt65, $list_alt314, $list_alt315);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, SET_LEARNERS, ABSTRACT_LEXICON_SET_LEARNERS_METHOD);
		methods.methods_incorporate_instance_method(INITIALIZE_ALLOWED_MTS, ABSTRACT_LEXICON, $list_alt318, $list_alt319, $list_alt320);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, INITIALIZE_ALLOWED_MTS, ABSTRACT_LEXICON_INITIALIZE_ALLOWED_MTS_METHOD);
		methods.methods_incorporate_instance_method(SET_BASE_MT, ABSTRACT_LEXICON, $list_alt65, $list_alt333, $list_alt334);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, SET_BASE_MT, ABSTRACT_LEXICON_SET_BASE_MT_METHOD);
		methods.methods_incorporate_instance_method(GET_BASE_MT, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt338);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_BASE_MT, ABSTRACT_LEXICON_GET_BASE_MT_METHOD);
		methods.methods_incorporate_instance_method(ALLOW_MT, ABSTRACT_LEXICON, $list_alt65, $list_alt333, $list_alt341);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_MT, ABSTRACT_LEXICON_ALLOW_MT_METHOD);
		methods.methods_incorporate_instance_method(ALLOW_GENL_MTS, ABSTRACT_LEXICON, $list_alt65, $list_alt333, $list_alt346);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_GENL_MTS, ABSTRACT_LEXICON_ALLOW_GENL_MTS_METHOD);
		methods.methods_incorporate_instance_method(FORBID_MT, ABSTRACT_LEXICON, $list_alt237, $list_alt333, $list_alt352);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORBID_MT, ABSTRACT_LEXICON_FORBID_MT_METHOD);
		methods.methods_incorporate_instance_method($sym244$ALLOWED_MT_, ABSTRACT_LEXICON, $list_alt318, $list_alt333, $list_alt354);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym244$ALLOWED_MT_, $sym355$ABSTRACT_LEXICON_ALLOWED_MT__METHOD);
		methods.methods_incorporate_instance_method(ROOT_MT, ABSTRACT_LEXICON, $list_alt356, NIL, $list_alt357);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ROOT_MT, ABSTRACT_LEXICON_ROOT_MT_METHOD);
		methods.methods_incorporate_instance_method(ADD_STOP_WORD, ABSTRACT_LEXICON, $list_alt60, $list_alt360, $list_alt361);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ADD_STOP_WORD, ABSTRACT_LEXICON_ADD_STOP_WORD_METHOD);
		methods.methods_incorporate_instance_method(STOP_WORD_P, ABSTRACT_LEXICON, $list_alt60, $list_alt360, $list_alt364);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, STOP_WORD_P, ABSTRACT_LEXICON_STOP_WORD_P_METHOD);
		methods.methods_incorporate_instance_method(GET_STOP_WORDS, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt368);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_STOP_WORDS, ABSTRACT_LEXICON_GET_STOP_WORDS_METHOD);
		methods.methods_incorporate_instance_method(COPY, ABSTRACT_LEXICON, $list_alt65, $list_alt371, $list_alt372);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, COPY, ABSTRACT_LEXICON_COPY_METHOD);
		methods.methods_incorporate_instance_method(GET, ABSTRACT_LEXICON, $list_alt65, $list_alt360, $list_alt379);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET, ABSTRACT_LEXICON_GET_METHOD);
		methods.methods_incorporate_instance_method(DELETE, ABSTRACT_LEXICON, $list_alt65, $list_alt360, $list_alt387);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, DELETE, ABSTRACT_LEXICON_DELETE_METHOD);
		methods.methods_incorporate_instance_method(DELETE_ENTRY_FROM_STRING, ABSTRACT_LEXICON, $list_alt65, $list_alt391, $list_alt392);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, DELETE_ENTRY_FROM_STRING, ABSTRACT_LEXICON_DELETE_ENTRY_FROM_STRING_METHOD);
		methods.methods_incorporate_instance_method(ADD, ABSTRACT_LEXICON, $list_alt65, $list_alt398, $list_alt399);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ADD, ABSTRACT_LEXICON_ADD_METHOD);
		methods.methods_incorporate_instance_method($sym402$LEARNED_, ABSTRACT_LEXICON, $list_alt65, $list_alt398, $list_alt403);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym402$LEARNED_, $sym405$ABSTRACT_LEXICON_LEARNED__METHOD);
		methods.methods_incorporate_instance_method(FORGET, ABSTRACT_LEXICON, $list_alt65, NIL, $list_alt407);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORGET, ABSTRACT_LEXICON_FORGET_METHOD);
		methods.methods_incorporate_instance_method(PREFIXES, ABSTRACT_LEXICON, $list_alt65, $list_alt411, $list_alt412);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIXES, ABSTRACT_LEXICON_PREFIXES_METHOD);
		methods.methods_incorporate_instance_method(PREFIXES_FROM_STRING, ABSTRACT_LEXICON, $list_alt65, $list_alt360, $list_alt417);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIXES_FROM_STRING, ABSTRACT_LEXICON_PREFIXES_FROM_STRING_METHOD);
		methods.methods_incorporate_instance_method(PREFIX_KEYS, ABSTRACT_LEXICON, $list_alt65, $list_alt411, $list_alt423);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIX_KEYS, ABSTRACT_LEXICON_PREFIX_KEYS_METHOD);
		methods.methods_incorporate_instance_method(PREFIX_KEYS_FROM_STRING, ABSTRACT_LEXICON, $list_alt65, $list_alt360, $list_alt427);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIX_KEYS_FROM_STRING, ABSTRACT_LEXICON_PREFIX_KEYS_FROM_STRING_METHOD);
		methods.methods_incorporate_instance_method(LEARN, ABSTRACT_LEXICON, $list_alt65, $list_alt431, $list_alt432);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEARN, ABSTRACT_LEXICON_LEARN_METHOD);
		methods.methods_incorporate_instance_method(NUMBER_LEARN, ABSTRACT_LEXICON, $list_alt60, $list_alt436, $list_alt437);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, NUMBER_LEARN, ABSTRACT_LEXICON_NUMBER_LEARN_METHOD);
		memoization_state.note_globally_cached_function($sym444$SCALAR_FUNCTION_);
		methods.methods_incorporate_instance_method(NOUN_COMPOUND_LEARN, ABSTRACT_LEXICON, $list_alt60, $list_alt436, $list_alt449);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, NOUN_COMPOUND_LEARN, ABSTRACT_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
		methods.methods_incorporate_instance_method(COOCCURRENCE_STATISTICS_LEARN, ABSTRACT_LEXICON, $list_alt60, $list_alt436, $list_alt449);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, COOCCURRENCE_STATISTICS_LEARN, ABSTRACT_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_DOCUMENT, ABSTRACT_LEXICON, $list_alt65, $list_alt466, $list_alt467);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_DOCUMENT, ABSTRACT_LEXICON_LEXIFY_DOCUMENT_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_PARAGRAPH, ABSTRACT_LEXICON, $list_alt65, $list_alt472, $list_alt473);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_PARAGRAPH, ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_SENTENCE, ABSTRACT_LEXICON, $list_alt65, $list_alt477, $list_alt478);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_SENTENCE, ABSTRACT_LEXICON_LEXIFY_SENTENCE_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_WORDS, ABSTRACT_LEXICON, $list_alt65, $list_alt498, $list_alt499);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_WORDS, ABSTRACT_LEXICON_LEXIFY_WORDS_METHOD);
		methods.methods_incorporate_instance_method(TOKENIZE, ABSTRACT_LEXICON, $list_alt65, $list_alt360, $list_alt504);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, TOKENIZE, ABSTRACT_LEXICON_TOKENIZE_METHOD);
		methods.methods_incorporate_instance_method(ITERATOR, ABSTRACT_LEXICON, $list_alt65, NIL, $list_alt517);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ITERATOR, ABSTRACT_LEXICON_ITERATOR_METHOD);
		register_cyc_api_function(NEW_LEXICON_FROM_KB_SPEC, $list_alt521, $str_alt522$_param_KB_SPEC__the_CycL_type_of_, $list_alt523, $list_alt524);
		memoization_state.note_globally_cached_function(PREDS_FOR_LEXICON_EXCLUSION);
		register_method($print_object_method_table$.getGlobalValue(), $dtp_abstract_lexicon_iterator_state$.getGlobalValue(), symbol_function(ABSTRACT_LEXICON_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
		def_csetf(ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR, _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR);
		def_csetf(ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES, _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES);
		def_csetf(ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON, _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON);
		identity(ABSTRACT_LEXICON_ITERATOR_STATE);
		note_funcall_helper_function(ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P);
		note_funcall_helper_function(ABSTRACT_LEXICON_ITERATOR_STATE_NEXT);
		define_test_case_table_int(TEXT_NUMBERS, list(new SubLObject[] { $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKINGp, T }), $list_alt576);
		define_test_case_table_int(NUMBER_MEANINGS, list(new SubLObject[] { $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt578);
		return NIL;
	}

	public static SubLObject setup_abstract_lexicon_file() {
		if (SubLFiles.USE_V1) {
			register_method($print_object_method_table$.getGlobalValue(), $dtp_textract_lemma$.getGlobalValue(), symbol_function(TEXTRACT_LEMMA_PRINT_FUNCTION_TRAMPOLINE));
			SubLSpecialOperatorDeclarations.proclaim($list18);
			def_csetf(TEXTRACT_LEMMA_PARAGRAPH, _CSETF_TEXTRACT_LEMMA_PARAGRAPH);
			def_csetf(TEXTRACT_LEMMA_SENTENCE, _CSETF_TEXTRACT_LEMMA_SENTENCE);
			def_csetf(TEXTRACT_LEMMA_WORD, _CSETF_TEXTRACT_LEMMA_WORD);
			def_csetf(TEXTRACT_LEMMA_STRING, _CSETF_TEXTRACT_LEMMA_STRING);
			def_csetf(TEXTRACT_LEMMA_CANON, _CSETF_TEXTRACT_LEMMA_CANON);
			def_csetf(TEXTRACT_LEMMA_TYPE, _CSETF_TEXTRACT_LEMMA_TYPE);
			identity(TEXTRACT_LEMMA);
			register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_textract_lemma$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TEXTRACT_LEMMA_METHOD));
			classes.subloop_new_class(LEX_ENTRY, OBJECT, NIL, NIL, $list52);
			classes.class_set_implements_slot_listeners(LEX_ENTRY, NIL);
			classes.subloop_note_class_initialization_function(LEX_ENTRY, SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_CLASS);
			classes.subloop_note_instance_initialization_function(LEX_ENTRY, SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_INSTANCE);
			subloop_reserved_initialize_lex_entry_class(LEX_ENTRY);
			methods.methods_incorporate_instance_method(INITIALIZE, LEX_ENTRY, $list66, NIL, $list67);
			methods.subloop_register_instance_method(LEX_ENTRY, INITIALIZE, LEX_ENTRY_INITIALIZE_METHOD);
			methods.methods_incorporate_instance_method(GET, LEX_ENTRY, $list71, $list72, $list73);
			methods.subloop_register_instance_method(LEX_ENTRY, GET, LEX_ENTRY_GET_METHOD);
			methods.methods_incorporate_instance_method(SET, LEX_ENTRY, $list71, $list81, $list82);
			methods.subloop_register_instance_method(LEX_ENTRY, SET, LEX_ENTRY_SET_METHOD);
			methods.methods_incorporate_instance_method(COPY, LEX_ENTRY, $list71, NIL, $list87);
			methods.subloop_register_instance_method(LEX_ENTRY, COPY, LEX_ENTRY_COPY_METHOD);
			methods.methods_incorporate_instance_method($sym90$NOUN_, LEX_ENTRY, $list91, $list92, $list93);
			methods.subloop_register_instance_method(LEX_ENTRY, $sym90$NOUN_, $sym97$LEX_ENTRY_NOUN__METHOD);
			methods.methods_incorporate_instance_method(PRINT, LEX_ENTRY, $list71, $list99, $list100);
			methods.subloop_register_instance_method(LEX_ENTRY, PRINT, LEX_ENTRY_PRINT_METHOD);
			methods.methods_incorporate_instance_method(NOMINAL_P, LEX_ENTRY, $list66, NIL, $list110);
			methods.subloop_register_instance_method(LEX_ENTRY, NOMINAL_P, LEX_ENTRY_NOMINAL_P_METHOD);
			methods.methods_incorporate_instance_method(VERBAL_P, LEX_ENTRY, $list66, NIL, $list114);
			methods.subloop_register_instance_method(LEX_ENTRY, VERBAL_P, LEX_ENTRY_VERBAL_P_METHOD);
			methods.methods_incorporate_instance_method(ADJECTIVAL_P, LEX_ENTRY, $list66, NIL, $list117);
			methods.subloop_register_instance_method(LEX_ENTRY, ADJECTIVAL_P, LEX_ENTRY_ADJECTIVAL_P_METHOD);
			methods.methods_incorporate_instance_method(ADVERBIAL_P, LEX_ENTRY, $list66, NIL, $list120);
			methods.subloop_register_instance_method(LEX_ENTRY, ADVERBIAL_P, LEX_ENTRY_ADVERBIAL_P_METHOD);
			methods.methods_incorporate_instance_method(COMPUTE_TERM, LEX_ENTRY, $list66, NIL, $list123);
			methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_TERM, LEX_ENTRY_COMPUTE_TERM_METHOD);
			methods.methods_incorporate_instance_method(COMPUTE_GENDER, LEX_ENTRY, $list66, NIL, $list132);
			methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_GENDER, LEX_ENTRY_COMPUTE_GENDER_METHOD);
			methods.methods_incorporate_instance_method(COMPUTE_PENN_TAGS, LEX_ENTRY, $list66, NIL, $list146);
			methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_PENN_TAGS, LEX_ENTRY_COMPUTE_PENN_TAGS_METHOD);
			methods.methods_incorporate_instance_method(COMPUTE_BACKOFF_PENN_TAGS, LEX_ENTRY, $list66, NIL, $list153);
			methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_BACKOFF_PENN_TAGS, LEX_ENTRY_COMPUTE_BACKOFF_PENN_TAGS_METHOD);
			methods.methods_incorporate_instance_method(COMPUTE_SUPER_TAGS, LEX_ENTRY, $list66, NIL, $list157);
			methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_SUPER_TAGS, LEX_ENTRY_COMPUTE_SUPER_TAGS_METHOD);
			methods.methods_incorporate_instance_method(COMPUTE_CYC_POS, LEX_ENTRY, $list66, NIL, $list161);
			methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_CYC_POS, LEX_ENTRY_COMPUTE_CYC_POS_METHOD);
			methods.methods_incorporate_instance_method(COMPUTE_IS_NER_ENTRY, LEX_ENTRY, $list66, NIL, $list164);
			methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_IS_NER_ENTRY, LEX_ENTRY_COMPUTE_IS_NER_ENTRY_METHOD);
			methods.methods_incorporate_instance_method(COMPUTE_CYC_CATEGORY, LEX_ENTRY, $list66, NIL, $list167);
			methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_CYC_CATEGORY, LEX_ENTRY_COMPUTE_CYC_CATEGORY_METHOD);
			methods.methods_incorporate_instance_method(COMPUTE_INFLECTIONS, LEX_ENTRY, $list66, NIL, $list172);
			methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_INFLECTIONS, LEX_ENTRY_COMPUTE_INFLECTIONS_METHOD);
			classes.subloop_new_class(ABSTRACT_LEXICON, OBJECT, NIL, T, $list175);
			classes.class_set_implements_slot_listeners(ABSTRACT_LEXICON, NIL);
			classes.subloop_note_class_initialization_function(ABSTRACT_LEXICON, SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_CLASS);
			classes.subloop_note_instance_initialization_function(ABSTRACT_LEXICON, SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_INSTANCE);
			subloop_reserved_initialize_abstract_lexicon_class(ABSTRACT_LEXICON);
			methods.methods_incorporate_instance_method(INITIALIZE, ABSTRACT_LEXICON, $list66, NIL, $list201);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, INITIALIZE, ABSTRACT_LEXICON_INITIALIZE_METHOD);
			methods.methods_incorporate_instance_method(ISOLATE, ABSTRACT_LEXICON, $list66, NIL, $list209);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ISOLATE, ABSTRACT_LEXICON_ISOLATE_METHOD);
			methods.methods_incorporate_instance_method(IGNORE_CACHE, ABSTRACT_LEXICON, $list71, NIL, $list213);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, IGNORE_CACHE, ABSTRACT_LEXICON_IGNORE_CACHE_METHOD);
			methods.methods_incorporate_instance_method($sym182$IGNORE_CACHE_, ABSTRACT_LEXICON, $list66, NIL, $list216);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym182$IGNORE_CACHE_, $sym218$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD);
			methods.methods_incorporate_instance_method(ALLOW_STEMMING, ABSTRACT_LEXICON, $list66, NIL, $list219);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_STEMMING, ABSTRACT_LEXICON_ALLOW_STEMMING_METHOD);
			methods.methods_incorporate_instance_method(FORBID_STEMMING, ABSTRACT_LEXICON, $list66, NIL, $list223);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORBID_STEMMING, ABSTRACT_LEXICON_FORBID_STEMMING_METHOD);
			methods.methods_incorporate_instance_method(ALLOW_FABRICATION, ABSTRACT_LEXICON, $list66, NIL, $list227);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_FABRICATION, ABSTRACT_LEXICON_ALLOW_FABRICATION_METHOD);
			methods.methods_incorporate_instance_method(FORBID_FABRICATION, ABSTRACT_LEXICON, $list66, NIL, $list231);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORBID_FABRICATION, ABSTRACT_LEXICON_FORBID_FABRICATION_METHOD);
			methods.methods_incorporate_instance_method($sym234$FABRICATION_FORBIDDEN_, ABSTRACT_LEXICON, $list66, NIL, $list235);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym234$FABRICATION_FORBIDDEN_, $sym237$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD);
			methods.methods_incorporate_instance_method($sym238$FABRICATION_ALLOWED_, ABSTRACT_LEXICON, $list66, NIL, $list239);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym238$FABRICATION_ALLOWED_, $sym241$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD);
			methods.methods_incorporate_instance_method($sym242$VALID_NL_TRIE_ENTRY_, ABSTRACT_LEXICON, $list243, $list244, $list245);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym242$VALID_NL_TRIE_ENTRY_, $sym252$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD);
			methods.methods_incorporate_instance_method(SET_CASE_SENSITIVITY, ABSTRACT_LEXICON, $list66, $list254, $list255);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, SET_CASE_SENSITIVITY, ABSTRACT_LEXICON_SET_CASE_SENSITIVITY_METHOD);
			methods.methods_incorporate_instance_method(GET_CASE_SENSITIVITY, ABSTRACT_LEXICON, $list66, NIL, $list259);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_CASE_SENSITIVITY, ABSTRACT_LEXICON_GET_CASE_SENSITIVITY_METHOD);
			methods.methods_incorporate_instance_method(INITIALIZE_EXCLUDED_PREDS, ABSTRACT_LEXICON, $list66, $list262, $list263);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, INITIALIZE_EXCLUDED_PREDS, ABSTRACT_LEXICON_INITIALIZE_EXCLUDED_PREDS_METHOD);
			methods.methods_incorporate_instance_method(ALLOW_PREDICATE, ABSTRACT_LEXICON, $list66, $list268, $list269);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_PREDICATE, ABSTRACT_LEXICON_ALLOW_PREDICATE_METHOD);
			methods.methods_incorporate_instance_method(EXCLUDE_PREDICATE, ABSTRACT_LEXICON, $list66, $list268, $list273);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, EXCLUDE_PREDICATE, ABSTRACT_LEXICON_EXCLUDE_PREDICATE_METHOD);
			methods.methods_incorporate_instance_method($sym276$EXCLUDED_PREDICATE_, ABSTRACT_LEXICON, $list66, $list268, $list277);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym276$EXCLUDED_PREDICATE_, $sym279$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD);
			methods.methods_incorporate_instance_method($sym280$ALLOWED_PREDICATE_, ABSTRACT_LEXICON, $list66, $list268, $list281);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym280$ALLOWED_PREDICATE_, $sym283$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD);
			methods.methods_incorporate_instance_method($sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, ABSTRACT_LEXICON, $list66, $list244, $list284);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, $sym286$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD);
			methods.methods_incorporate_instance_method(ALLOW_POS, ABSTRACT_LEXICON, $list66, $list288, $list289);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_POS, ABSTRACT_LEXICON_ALLOW_POS_METHOD);
			methods.methods_incorporate_instance_method(EXCLUDE_POS, ABSTRACT_LEXICON, $list66, $list288, $list293);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, EXCLUDE_POS, ABSTRACT_LEXICON_EXCLUDE_POS_METHOD);
			methods.methods_incorporate_instance_method($sym296$EXCLUDED_POS_, ABSTRACT_LEXICON, $list66, $list288, $list297);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym296$EXCLUDED_POS_, $sym299$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD);
			methods.methods_incorporate_instance_method($sym247$ALLOWED_POS_, ABSTRACT_LEXICON, $list66, $list288, $list300);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym247$ALLOWED_POS_, $sym302$ABSTRACT_LEXICON_ALLOWED_POS__METHOD);
			methods.methods_incorporate_instance_method($sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, ABSTRACT_LEXICON, $list66, $list244, $list303);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, $sym305$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD);
			methods.methods_incorporate_instance_method(ADD_LEARNER, ABSTRACT_LEXICON, $list71, $list307, $list308);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ADD_LEARNER, ABSTRACT_LEXICON_ADD_LEARNER_METHOD);
			methods.methods_incorporate_instance_method(REMOVE_LEARNER, ABSTRACT_LEXICON, $list71, $list307, $list312);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, REMOVE_LEARNER, ABSTRACT_LEXICON_REMOVE_LEARNER_METHOD);
			methods.methods_incorporate_instance_method(GET_LEARNERS, ABSTRACT_LEXICON, $list71, NIL, $list316);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_LEARNERS, ABSTRACT_LEXICON_GET_LEARNERS_METHOD);
			methods.methods_incorporate_instance_method(SET_LEARNERS, ABSTRACT_LEXICON, $list71, $list320, $list321);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, SET_LEARNERS, ABSTRACT_LEXICON_SET_LEARNERS_METHOD);
			methods.methods_incorporate_instance_method(INITIALIZE_ALLOWED_MTS, ABSTRACT_LEXICON, $list324, $list325, $list326);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, INITIALIZE_ALLOWED_MTS, ABSTRACT_LEXICON_INITIALIZE_ALLOWED_MTS_METHOD);
			methods.methods_incorporate_instance_method(SET_BASE_MT, ABSTRACT_LEXICON, $list71, $list339, $list340);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, SET_BASE_MT, ABSTRACT_LEXICON_SET_BASE_MT_METHOD);
			methods.methods_incorporate_instance_method(GET_BASE_MT, ABSTRACT_LEXICON, $list66, NIL, $list344);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_BASE_MT, ABSTRACT_LEXICON_GET_BASE_MT_METHOD);
			methods.methods_incorporate_instance_method(ALLOW_MT, ABSTRACT_LEXICON, $list71, $list339, $list347);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_MT, ABSTRACT_LEXICON_ALLOW_MT_METHOD);
			methods.methods_incorporate_instance_method(ALLOW_GENL_MTS, ABSTRACT_LEXICON, $list71, $list339, $list352);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_GENL_MTS, ABSTRACT_LEXICON_ALLOW_GENL_MTS_METHOD);
			methods.methods_incorporate_instance_method(FORBID_MT, ABSTRACT_LEXICON, $list243, $list339, $list358);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORBID_MT, ABSTRACT_LEXICON_FORBID_MT_METHOD);
			methods.methods_incorporate_instance_method($sym250$ALLOWED_MT_, ABSTRACT_LEXICON, $list324, $list339, $list360);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym250$ALLOWED_MT_, $sym361$ABSTRACT_LEXICON_ALLOWED_MT__METHOD);
			methods.methods_incorporate_instance_method(ROOT_MT, ABSTRACT_LEXICON, $list362, NIL, $list363);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ROOT_MT, ABSTRACT_LEXICON_ROOT_MT_METHOD);
			methods.methods_incorporate_instance_method(ADD_STOP_WORD, ABSTRACT_LEXICON, $list66, $list366, $list367);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ADD_STOP_WORD, ABSTRACT_LEXICON_ADD_STOP_WORD_METHOD);
			methods.methods_incorporate_instance_method(STOP_WORD_P, ABSTRACT_LEXICON, $list66, $list366, $list370);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, STOP_WORD_P, ABSTRACT_LEXICON_STOP_WORD_P_METHOD);
			methods.methods_incorporate_instance_method(GET_STOP_WORDS, ABSTRACT_LEXICON, $list66, NIL, $list374);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_STOP_WORDS, ABSTRACT_LEXICON_GET_STOP_WORDS_METHOD);
			methods.methods_incorporate_instance_method(COPY, ABSTRACT_LEXICON, $list71, $list377, $list378);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, COPY, ABSTRACT_LEXICON_COPY_METHOD);
			methods.methods_incorporate_instance_method(GET, ABSTRACT_LEXICON, $list71, $list366, $list385);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET, ABSTRACT_LEXICON_GET_METHOD);
			methods.methods_incorporate_instance_method(DELETE, ABSTRACT_LEXICON, $list71, $list366, $list394);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, DELETE, ABSTRACT_LEXICON_DELETE_METHOD);
			methods.methods_incorporate_instance_method(DELETE_ENTRY_FROM_STRING, ABSTRACT_LEXICON, $list71, $list398, $list399);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, DELETE_ENTRY_FROM_STRING, ABSTRACT_LEXICON_DELETE_ENTRY_FROM_STRING_METHOD);
			methods.methods_incorporate_instance_method(ADD, ABSTRACT_LEXICON, $list71, $list405, $list406);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ADD, ABSTRACT_LEXICON_ADD_METHOD);
			methods.methods_incorporate_instance_method($sym409$LEARNED_, ABSTRACT_LEXICON, $list71, $list405, $list410);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym409$LEARNED_, $sym412$ABSTRACT_LEXICON_LEARNED__METHOD);
			methods.methods_incorporate_instance_method(FORGET, ABSTRACT_LEXICON, $list71, NIL, $list414);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORGET, ABSTRACT_LEXICON_FORGET_METHOD);
			methods.methods_incorporate_instance_method(PREFIXES, ABSTRACT_LEXICON, $list71, $list418, $list419);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIXES, ABSTRACT_LEXICON_PREFIXES_METHOD);
			methods.methods_incorporate_instance_method(PREFIXES_FROM_STRING, ABSTRACT_LEXICON, $list71, $list366, $list424);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIXES_FROM_STRING, ABSTRACT_LEXICON_PREFIXES_FROM_STRING_METHOD);
			methods.methods_incorporate_instance_method(PREFIX_KEYS, ABSTRACT_LEXICON, $list71, $list418, $list430);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIX_KEYS, ABSTRACT_LEXICON_PREFIX_KEYS_METHOD);
			methods.methods_incorporate_instance_method(PREFIX_KEYS_FROM_STRING, ABSTRACT_LEXICON, $list71, $list366, $list434);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIX_KEYS_FROM_STRING, ABSTRACT_LEXICON_PREFIX_KEYS_FROM_STRING_METHOD);
			methods.methods_incorporate_instance_method(LEARN, ABSTRACT_LEXICON, $list71, $list438, $list439);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEARN, ABSTRACT_LEXICON_LEARN_METHOD);
			methods.methods_incorporate_instance_method(NUMBER_LEARN, ABSTRACT_LEXICON, $list66, $list443, $list444);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, NUMBER_LEARN, ABSTRACT_LEXICON_NUMBER_LEARN_METHOD);
			memoization_state.note_globally_cached_function($sym452$SCALAR_FUNCTION_);
			methods.methods_incorporate_instance_method(NOUN_COMPOUND_LEARN, ABSTRACT_LEXICON, $list66, $list443, $list456);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, NOUN_COMPOUND_LEARN, ABSTRACT_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
			methods.methods_incorporate_instance_method(COOCCURRENCE_STATISTICS_LEARN, ABSTRACT_LEXICON, $list66, $list443, $list456);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, COOCCURRENCE_STATISTICS_LEARN, ABSTRACT_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD);
			methods.methods_incorporate_instance_method(LEXIFY_DOCUMENT, ABSTRACT_LEXICON, $list71, $list473, $list474);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_DOCUMENT, ABSTRACT_LEXICON_LEXIFY_DOCUMENT_METHOD);
			methods.methods_incorporate_instance_method(LEXIFY_DOCUMENT_EXHAUSTIVELY, ABSTRACT_LEXICON, $list71, $list473, $list480);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_DOCUMENT_EXHAUSTIVELY, ABSTRACT_LEXICON_LEXIFY_DOCUMENT_EXHAUSTIVELY_METHOD);
			methods.methods_incorporate_instance_method(LEXIFY_PARAGRAPH, ABSTRACT_LEXICON, $list71, $list483, $list484);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_PARAGRAPH, ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_METHOD);
			methods.methods_incorporate_instance_method(LEXIFY_PARAGRAPH_EXHAUSTIVELY, ABSTRACT_LEXICON, $list71, $list483, $list488);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_PARAGRAPH_EXHAUSTIVELY, ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_EXHAUSTIVELY_METHOD);
			methods.methods_incorporate_instance_method(LEXIFY_SENTENCE, ABSTRACT_LEXICON, $list71, $list491, $list492);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_SENTENCE, ABSTRACT_LEXICON_LEXIFY_SENTENCE_METHOD);
			methods.methods_incorporate_instance_method(LEXIFY_SENTENCE_EXHAUSTIVELY, ABSTRACT_LEXICON, $list71, $list491, $list497);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_SENTENCE_EXHAUSTIVELY, ABSTRACT_LEXICON_LEXIFY_SENTENCE_EXHAUSTIVELY_METHOD);
			methods.methods_incorporate_instance_method(LEXIFY_WORDS, ABSTRACT_LEXICON, $list71, $list515, $list516);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_WORDS, ABSTRACT_LEXICON_LEXIFY_WORDS_METHOD);
			methods.methods_incorporate_instance_method(TOKENIZE, ABSTRACT_LEXICON, $list71, $list366, $list522);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, TOKENIZE, ABSTRACT_LEXICON_TOKENIZE_METHOD);
			methods.methods_incorporate_instance_method(ITERATOR, ABSTRACT_LEXICON, $list71, NIL, $list535);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, ITERATOR, ABSTRACT_LEXICON_ITERATOR_METHOD);
			register_cyc_api_function(NEW_LEXICON_FROM_KB_SPEC, $list539, $str540$_param_KB_SPEC__the_CycL_type_of_, $list541, $list542);
			memoization_state.note_globally_cached_function(PREDS_FOR_LEXICON_EXCLUSION);
			register_method($print_object_method_table$.getGlobalValue(), $dtp_abstract_lexicon_iterator_state$.getGlobalValue(), symbol_function(ABSTRACT_LEXICON_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
			SubLSpecialOperatorDeclarations.proclaim($list563);
			def_csetf(ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR, _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR);
			def_csetf(ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES, _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES);
			def_csetf(ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON, _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON);
			identity(ABSTRACT_LEXICON_ITERATOR_STATE);
			register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_abstract_lexicon_iterator_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ABSTRACT_LEXICON_ITERATOR_STATE_METHOD));
			note_funcall_helper_function(ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P);
			note_funcall_helper_function(ABSTRACT_LEXICON_ITERATOR_STATE_NEXT);
			define_test_case_table_int(SCALAR_INTERVAL_MEANINGS, list(new SubLObject[] { $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list596);
			define_test_case_table_int(TEXT_NUMBERS, list(new SubLObject[] { $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list598);
			define_test_case_table_int(NUMBER_MEANINGS, list(new SubLObject[] { $TEST, $sym603$NUMBER_MEANINGS_RESULTS_EQUAL_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list604);
			define_test_case_table_int(TOKENIZING_TEST_COVERING, list(new SubLObject[] { $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list606);
		}
		if (SubLFiles.USE_V2) {
			classes.subloop_new_class(LEX_ENTRY, OBJECT, NIL, NIL, $list_alt46);
			methods.methods_incorporate_instance_method(INITIALIZE, LEX_ENTRY, $list_alt60, NIL, $list_alt61);
			methods.methods_incorporate_instance_method(GET, LEX_ENTRY, $list_alt65, $list_alt66, $list_alt67);
			methods.methods_incorporate_instance_method(SET, LEX_ENTRY, $list_alt65, $list_alt75, $list_alt76);
			methods.methods_incorporate_instance_method(COPY, LEX_ENTRY, $list_alt65, NIL, $list_alt81);
			methods.methods_incorporate_instance_method($sym84$NOUN_, LEX_ENTRY, $list_alt85, $list_alt86, $list_alt87);
			methods.subloop_register_instance_method(LEX_ENTRY, $sym84$NOUN_, $sym91$LEX_ENTRY_NOUN__METHOD);
			methods.methods_incorporate_instance_method(PRINT, LEX_ENTRY, $list_alt65, $list_alt93, $list_alt94);
			methods.methods_incorporate_instance_method(NOMINAL_P, LEX_ENTRY, $list_alt60, NIL, $list_alt104);
			methods.methods_incorporate_instance_method(VERBAL_P, LEX_ENTRY, $list_alt60, NIL, $list_alt108);
			methods.methods_incorporate_instance_method(ADJECTIVAL_P, LEX_ENTRY, $list_alt60, NIL, $list_alt111);
			methods.methods_incorporate_instance_method(ADVERBIAL_P, LEX_ENTRY, $list_alt60, NIL, $list_alt114);
			methods.methods_incorporate_instance_method(COMPUTE_TERM, LEX_ENTRY, $list_alt60, NIL, $list_alt117);
			methods.methods_incorporate_instance_method(COMPUTE_GENDER, LEX_ENTRY, $list_alt60, NIL, $list_alt126);
			methods.methods_incorporate_instance_method(COMPUTE_PENN_TAGS, LEX_ENTRY, $list_alt60, NIL, $list_alt140);
			methods.methods_incorporate_instance_method(COMPUTE_BACKOFF_PENN_TAGS, LEX_ENTRY, $list_alt60, NIL, $list_alt147);
			methods.methods_incorporate_instance_method(COMPUTE_SUPER_TAGS, LEX_ENTRY, $list_alt60, NIL, $list_alt151);
			methods.methods_incorporate_instance_method(COMPUTE_CYC_POS, LEX_ENTRY, $list_alt60, NIL, $list_alt155);
			methods.methods_incorporate_instance_method(COMPUTE_IS_NER_ENTRY, LEX_ENTRY, $list_alt60, NIL, $list_alt158);
			methods.methods_incorporate_instance_method(COMPUTE_CYC_CATEGORY, LEX_ENTRY, $list_alt60, NIL, $list_alt161);
			methods.methods_incorporate_instance_method(COMPUTE_INFLECTIONS, LEX_ENTRY, $list_alt60, NIL, $list_alt166);
			classes.subloop_new_class(ABSTRACT_LEXICON, OBJECT, NIL, T, $list_alt169);
			methods.methods_incorporate_instance_method(INITIALIZE, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt195);
			methods.methods_incorporate_instance_method(ISOLATE, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt203);
			methods.methods_incorporate_instance_method(IGNORE_CACHE, ABSTRACT_LEXICON, $list_alt65, NIL, $list_alt207);
			methods.methods_incorporate_instance_method($sym176$IGNORE_CACHE_, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt210);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym176$IGNORE_CACHE_, $sym212$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD);
			methods.methods_incorporate_instance_method(ALLOW_STEMMING, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt213);
			methods.methods_incorporate_instance_method(FORBID_STEMMING, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt217);
			methods.methods_incorporate_instance_method(ALLOW_FABRICATION, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt221);
			methods.methods_incorporate_instance_method(FORBID_FABRICATION, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt225);
			methods.methods_incorporate_instance_method($sym228$FABRICATION_FORBIDDEN_, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt229);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym228$FABRICATION_FORBIDDEN_, $sym231$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD);
			methods.methods_incorporate_instance_method($sym232$FABRICATION_ALLOWED_, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt233);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym232$FABRICATION_ALLOWED_, $sym235$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD);
			methods.methods_incorporate_instance_method($sym236$VALID_NL_TRIE_ENTRY_, ABSTRACT_LEXICON, $list_alt237, $list_alt238, $list_alt239);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym236$VALID_NL_TRIE_ENTRY_, $sym246$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD);
			methods.methods_incorporate_instance_method(SET_CASE_SENSITIVITY, ABSTRACT_LEXICON, $list_alt60, $list_alt248, $list_alt249);
			methods.methods_incorporate_instance_method(GET_CASE_SENSITIVITY, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt253);
			methods.methods_incorporate_instance_method(INITIALIZE_EXCLUDED_PREDS, ABSTRACT_LEXICON, $list_alt60, $list_alt256, $list_alt257);
			methods.methods_incorporate_instance_method(ALLOW_PREDICATE, ABSTRACT_LEXICON, $list_alt60, $list_alt262, $list_alt263);
			methods.methods_incorporate_instance_method(EXCLUDE_PREDICATE, ABSTRACT_LEXICON, $list_alt60, $list_alt262, $list_alt267);
			methods.methods_incorporate_instance_method($sym270$EXCLUDED_PREDICATE_, ABSTRACT_LEXICON, $list_alt60, $list_alt262, $list_alt271);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym270$EXCLUDED_PREDICATE_, $sym273$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD);
			methods.methods_incorporate_instance_method($sym274$ALLOWED_PREDICATE_, ABSTRACT_LEXICON, $list_alt60, $list_alt262, $list_alt275);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym274$ALLOWED_PREDICATE_, $sym277$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD);
			methods.methods_incorporate_instance_method($sym243$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, ABSTRACT_LEXICON, $list_alt60, $list_alt238, $list_alt278);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym243$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, $sym280$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD);
			methods.methods_incorporate_instance_method(ALLOW_POS, ABSTRACT_LEXICON, $list_alt60, $list_alt282, $list_alt283);
			methods.methods_incorporate_instance_method(EXCLUDE_POS, ABSTRACT_LEXICON, $list_alt60, $list_alt282, $list_alt287);
			methods.methods_incorporate_instance_method($sym290$EXCLUDED_POS_, ABSTRACT_LEXICON, $list_alt60, $list_alt282, $list_alt291);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym290$EXCLUDED_POS_, $sym293$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD);
			methods.methods_incorporate_instance_method($sym241$ALLOWED_POS_, ABSTRACT_LEXICON, $list_alt60, $list_alt282, $list_alt294);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym241$ALLOWED_POS_, $sym296$ABSTRACT_LEXICON_ALLOWED_POS__METHOD);
			methods.methods_incorporate_instance_method($sym245$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, ABSTRACT_LEXICON, $list_alt60, $list_alt238, $list_alt297);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym245$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, $sym299$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD);
			methods.methods_incorporate_instance_method(ADD_LEARNER, ABSTRACT_LEXICON, $list_alt65, $list_alt301, $list_alt302);
			methods.methods_incorporate_instance_method(REMOVE_LEARNER, ABSTRACT_LEXICON, $list_alt65, $list_alt301, $list_alt306);
			methods.methods_incorporate_instance_method(GET_LEARNERS, ABSTRACT_LEXICON, $list_alt65, NIL, $list_alt310);
			methods.methods_incorporate_instance_method(SET_LEARNERS, ABSTRACT_LEXICON, $list_alt65, $list_alt314, $list_alt315);
			methods.methods_incorporate_instance_method(INITIALIZE_ALLOWED_MTS, ABSTRACT_LEXICON, $list_alt318, $list_alt319, $list_alt320);
			methods.methods_incorporate_instance_method(SET_BASE_MT, ABSTRACT_LEXICON, $list_alt65, $list_alt333, $list_alt334);
			methods.methods_incorporate_instance_method(GET_BASE_MT, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt338);
			methods.methods_incorporate_instance_method(ALLOW_MT, ABSTRACT_LEXICON, $list_alt65, $list_alt333, $list_alt341);
			methods.methods_incorporate_instance_method(ALLOW_GENL_MTS, ABSTRACT_LEXICON, $list_alt65, $list_alt333, $list_alt346);
			methods.methods_incorporate_instance_method(FORBID_MT, ABSTRACT_LEXICON, $list_alt237, $list_alt333, $list_alt352);
			methods.methods_incorporate_instance_method($sym244$ALLOWED_MT_, ABSTRACT_LEXICON, $list_alt318, $list_alt333, $list_alt354);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym244$ALLOWED_MT_, $sym355$ABSTRACT_LEXICON_ALLOWED_MT__METHOD);
			methods.methods_incorporate_instance_method(ROOT_MT, ABSTRACT_LEXICON, $list_alt356, NIL, $list_alt357);
			methods.methods_incorporate_instance_method(ADD_STOP_WORD, ABSTRACT_LEXICON, $list_alt60, $list_alt360, $list_alt361);
			methods.methods_incorporate_instance_method(STOP_WORD_P, ABSTRACT_LEXICON, $list_alt60, $list_alt360, $list_alt364);
			methods.methods_incorporate_instance_method(GET_STOP_WORDS, ABSTRACT_LEXICON, $list_alt60, NIL, $list_alt368);
			methods.methods_incorporate_instance_method(COPY, ABSTRACT_LEXICON, $list_alt65, $list_alt371, $list_alt372);
			methods.methods_incorporate_instance_method(GET, ABSTRACT_LEXICON, $list_alt65, $list_alt360, $list_alt379);
			methods.methods_incorporate_instance_method(DELETE, ABSTRACT_LEXICON, $list_alt65, $list_alt360, $list_alt387);
			methods.methods_incorporate_instance_method(DELETE_ENTRY_FROM_STRING, ABSTRACT_LEXICON, $list_alt65, $list_alt391, $list_alt392);
			methods.methods_incorporate_instance_method(ADD, ABSTRACT_LEXICON, $list_alt65, $list_alt398, $list_alt399);
			methods.methods_incorporate_instance_method($sym402$LEARNED_, ABSTRACT_LEXICON, $list_alt65, $list_alt398, $list_alt403);
			methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym402$LEARNED_, $sym405$ABSTRACT_LEXICON_LEARNED__METHOD);
			methods.methods_incorporate_instance_method(FORGET, ABSTRACT_LEXICON, $list_alt65, NIL, $list_alt407);
			methods.methods_incorporate_instance_method(PREFIXES, ABSTRACT_LEXICON, $list_alt65, $list_alt411, $list_alt412);
			methods.methods_incorporate_instance_method(PREFIXES_FROM_STRING, ABSTRACT_LEXICON, $list_alt65, $list_alt360, $list_alt417);
			methods.methods_incorporate_instance_method(PREFIX_KEYS, ABSTRACT_LEXICON, $list_alt65, $list_alt411, $list_alt423);
			methods.methods_incorporate_instance_method(PREFIX_KEYS_FROM_STRING, ABSTRACT_LEXICON, $list_alt65, $list_alt360, $list_alt427);
			methods.methods_incorporate_instance_method(LEARN, ABSTRACT_LEXICON, $list_alt65, $list_alt431, $list_alt432);
			methods.methods_incorporate_instance_method(NUMBER_LEARN, ABSTRACT_LEXICON, $list_alt60, $list_alt436, $list_alt437);
			memoization_state.note_globally_cached_function($sym444$SCALAR_FUNCTION_);
			methods.methods_incorporate_instance_method(NOUN_COMPOUND_LEARN, ABSTRACT_LEXICON, $list_alt60, $list_alt436, $list_alt449);
			methods.methods_incorporate_instance_method(COOCCURRENCE_STATISTICS_LEARN, ABSTRACT_LEXICON, $list_alt60, $list_alt436, $list_alt449);
			methods.methods_incorporate_instance_method(LEXIFY_DOCUMENT, ABSTRACT_LEXICON, $list_alt65, $list_alt466, $list_alt467);
			methods.methods_incorporate_instance_method(LEXIFY_PARAGRAPH, ABSTRACT_LEXICON, $list_alt65, $list_alt472, $list_alt473);
			methods.methods_incorporate_instance_method(LEXIFY_SENTENCE, ABSTRACT_LEXICON, $list_alt65, $list_alt477, $list_alt478);
			methods.methods_incorporate_instance_method(LEXIFY_WORDS, ABSTRACT_LEXICON, $list_alt65, $list_alt498, $list_alt499);
			methods.methods_incorporate_instance_method(TOKENIZE, ABSTRACT_LEXICON, $list_alt65, $list_alt360, $list_alt504);
			methods.methods_incorporate_instance_method(ITERATOR, ABSTRACT_LEXICON, $list_alt65, NIL, $list_alt517);
			register_cyc_api_function(NEW_LEXICON_FROM_KB_SPEC, $list_alt521, $str_alt522$_param_KB_SPEC__the_CycL_type_of_, $list_alt523, $list_alt524);
			define_test_case_table_int(TEXT_NUMBERS, list(new SubLObject[] { $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt576);
			define_test_case_table_int(NUMBER_MEANINGS, list(new SubLObject[] { $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt578);
		}
		return NIL;
	}

	public static SubLObject setup_abstract_lexicon_file_Previous() {
		register_method($print_object_method_table$.getGlobalValue(), $dtp_textract_lemma$.getGlobalValue(), symbol_function(TEXTRACT_LEMMA_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list18);
		def_csetf(TEXTRACT_LEMMA_PARAGRAPH, _CSETF_TEXTRACT_LEMMA_PARAGRAPH);
		def_csetf(TEXTRACT_LEMMA_SENTENCE, _CSETF_TEXTRACT_LEMMA_SENTENCE);
		def_csetf(TEXTRACT_LEMMA_WORD, _CSETF_TEXTRACT_LEMMA_WORD);
		def_csetf(TEXTRACT_LEMMA_STRING, _CSETF_TEXTRACT_LEMMA_STRING);
		def_csetf(TEXTRACT_LEMMA_CANON, _CSETF_TEXTRACT_LEMMA_CANON);
		def_csetf(TEXTRACT_LEMMA_TYPE, _CSETF_TEXTRACT_LEMMA_TYPE);
		identity(TEXTRACT_LEMMA);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_textract_lemma$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TEXTRACT_LEMMA_METHOD));
		classes.subloop_new_class(LEX_ENTRY, OBJECT, NIL, NIL, $list52);
		classes.class_set_implements_slot_listeners(LEX_ENTRY, NIL);
		classes.subloop_note_class_initialization_function(LEX_ENTRY, SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_CLASS);
		classes.subloop_note_instance_initialization_function(LEX_ENTRY, SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_INSTANCE);
		subloop_reserved_initialize_lex_entry_class(LEX_ENTRY);
		methods.methods_incorporate_instance_method(INITIALIZE, LEX_ENTRY, $list66, NIL, $list67);
		methods.subloop_register_instance_method(LEX_ENTRY, INITIALIZE, LEX_ENTRY_INITIALIZE_METHOD);
		methods.methods_incorporate_instance_method(GET, LEX_ENTRY, $list71, $list72, $list73);
		methods.subloop_register_instance_method(LEX_ENTRY, GET, LEX_ENTRY_GET_METHOD);
		methods.methods_incorporate_instance_method(SET, LEX_ENTRY, $list71, $list81, $list82);
		methods.subloop_register_instance_method(LEX_ENTRY, SET, LEX_ENTRY_SET_METHOD);
		methods.methods_incorporate_instance_method(COPY, LEX_ENTRY, $list71, NIL, $list87);
		methods.subloop_register_instance_method(LEX_ENTRY, COPY, LEX_ENTRY_COPY_METHOD);
		methods.methods_incorporate_instance_method($sym90$NOUN_, LEX_ENTRY, $list91, $list92, $list93);
		methods.subloop_register_instance_method(LEX_ENTRY, $sym90$NOUN_, $sym97$LEX_ENTRY_NOUN__METHOD);
		methods.methods_incorporate_instance_method(PRINT, LEX_ENTRY, $list71, $list99, $list100);
		methods.subloop_register_instance_method(LEX_ENTRY, PRINT, LEX_ENTRY_PRINT_METHOD);
		methods.methods_incorporate_instance_method(NOMINAL_P, LEX_ENTRY, $list66, NIL, $list110);
		methods.subloop_register_instance_method(LEX_ENTRY, NOMINAL_P, LEX_ENTRY_NOMINAL_P_METHOD);
		methods.methods_incorporate_instance_method(VERBAL_P, LEX_ENTRY, $list66, NIL, $list114);
		methods.subloop_register_instance_method(LEX_ENTRY, VERBAL_P, LEX_ENTRY_VERBAL_P_METHOD);
		methods.methods_incorporate_instance_method(ADJECTIVAL_P, LEX_ENTRY, $list66, NIL, $list117);
		methods.subloop_register_instance_method(LEX_ENTRY, ADJECTIVAL_P, LEX_ENTRY_ADJECTIVAL_P_METHOD);
		methods.methods_incorporate_instance_method(ADVERBIAL_P, LEX_ENTRY, $list66, NIL, $list120);
		methods.subloop_register_instance_method(LEX_ENTRY, ADVERBIAL_P, LEX_ENTRY_ADVERBIAL_P_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_TERM, LEX_ENTRY, $list66, NIL, $list123);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_TERM, LEX_ENTRY_COMPUTE_TERM_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_GENDER, LEX_ENTRY, $list66, NIL, $list132);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_GENDER, LEX_ENTRY_COMPUTE_GENDER_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_PENN_TAGS, LEX_ENTRY, $list66, NIL, $list146);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_PENN_TAGS, LEX_ENTRY_COMPUTE_PENN_TAGS_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_BACKOFF_PENN_TAGS, LEX_ENTRY, $list66, NIL, $list153);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_BACKOFF_PENN_TAGS, LEX_ENTRY_COMPUTE_BACKOFF_PENN_TAGS_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_SUPER_TAGS, LEX_ENTRY, $list66, NIL, $list157);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_SUPER_TAGS, LEX_ENTRY_COMPUTE_SUPER_TAGS_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_CYC_POS, LEX_ENTRY, $list66, NIL, $list161);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_CYC_POS, LEX_ENTRY_COMPUTE_CYC_POS_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_IS_NER_ENTRY, LEX_ENTRY, $list66, NIL, $list164);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_IS_NER_ENTRY, LEX_ENTRY_COMPUTE_IS_NER_ENTRY_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_CYC_CATEGORY, LEX_ENTRY, $list66, NIL, $list167);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_CYC_CATEGORY, LEX_ENTRY_COMPUTE_CYC_CATEGORY_METHOD);
		methods.methods_incorporate_instance_method(COMPUTE_INFLECTIONS, LEX_ENTRY, $list66, NIL, $list172);
		methods.subloop_register_instance_method(LEX_ENTRY, COMPUTE_INFLECTIONS, LEX_ENTRY_COMPUTE_INFLECTIONS_METHOD);
		classes.subloop_new_class(ABSTRACT_LEXICON, OBJECT, NIL, T, $list175);
		classes.class_set_implements_slot_listeners(ABSTRACT_LEXICON, NIL);
		classes.subloop_note_class_initialization_function(ABSTRACT_LEXICON, SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_CLASS);
		classes.subloop_note_instance_initialization_function(ABSTRACT_LEXICON, SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_INSTANCE);
		subloop_reserved_initialize_abstract_lexicon_class(ABSTRACT_LEXICON);
		methods.methods_incorporate_instance_method(INITIALIZE, ABSTRACT_LEXICON, $list66, NIL, $list201);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, INITIALIZE, ABSTRACT_LEXICON_INITIALIZE_METHOD);
		methods.methods_incorporate_instance_method(ISOLATE, ABSTRACT_LEXICON, $list66, NIL, $list209);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ISOLATE, ABSTRACT_LEXICON_ISOLATE_METHOD);
		methods.methods_incorporate_instance_method(IGNORE_CACHE, ABSTRACT_LEXICON, $list71, NIL, $list213);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, IGNORE_CACHE, ABSTRACT_LEXICON_IGNORE_CACHE_METHOD);
		methods.methods_incorporate_instance_method($sym182$IGNORE_CACHE_, ABSTRACT_LEXICON, $list66, NIL, $list216);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym182$IGNORE_CACHE_, $sym218$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD);
		methods.methods_incorporate_instance_method(ALLOW_STEMMING, ABSTRACT_LEXICON, $list66, NIL, $list219);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_STEMMING, ABSTRACT_LEXICON_ALLOW_STEMMING_METHOD);
		methods.methods_incorporate_instance_method(FORBID_STEMMING, ABSTRACT_LEXICON, $list66, NIL, $list223);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORBID_STEMMING, ABSTRACT_LEXICON_FORBID_STEMMING_METHOD);
		methods.methods_incorporate_instance_method(ALLOW_FABRICATION, ABSTRACT_LEXICON, $list66, NIL, $list227);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_FABRICATION, ABSTRACT_LEXICON_ALLOW_FABRICATION_METHOD);
		methods.methods_incorporate_instance_method(FORBID_FABRICATION, ABSTRACT_LEXICON, $list66, NIL, $list231);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORBID_FABRICATION, ABSTRACT_LEXICON_FORBID_FABRICATION_METHOD);
		methods.methods_incorporate_instance_method($sym234$FABRICATION_FORBIDDEN_, ABSTRACT_LEXICON, $list66, NIL, $list235);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym234$FABRICATION_FORBIDDEN_, $sym237$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD);
		methods.methods_incorporate_instance_method($sym238$FABRICATION_ALLOWED_, ABSTRACT_LEXICON, $list66, NIL, $list239);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym238$FABRICATION_ALLOWED_, $sym241$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD);
		methods.methods_incorporate_instance_method($sym242$VALID_NL_TRIE_ENTRY_, ABSTRACT_LEXICON, $list243, $list244, $list245);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym242$VALID_NL_TRIE_ENTRY_, $sym252$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD);
		methods.methods_incorporate_instance_method(SET_CASE_SENSITIVITY, ABSTRACT_LEXICON, $list66, $list254, $list255);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, SET_CASE_SENSITIVITY, ABSTRACT_LEXICON_SET_CASE_SENSITIVITY_METHOD);
		methods.methods_incorporate_instance_method(GET_CASE_SENSITIVITY, ABSTRACT_LEXICON, $list66, NIL, $list259);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_CASE_SENSITIVITY, ABSTRACT_LEXICON_GET_CASE_SENSITIVITY_METHOD);
		methods.methods_incorporate_instance_method(INITIALIZE_EXCLUDED_PREDS, ABSTRACT_LEXICON, $list66, $list262, $list263);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, INITIALIZE_EXCLUDED_PREDS, ABSTRACT_LEXICON_INITIALIZE_EXCLUDED_PREDS_METHOD);
		methods.methods_incorporate_instance_method(ALLOW_PREDICATE, ABSTRACT_LEXICON, $list66, $list268, $list269);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_PREDICATE, ABSTRACT_LEXICON_ALLOW_PREDICATE_METHOD);
		methods.methods_incorporate_instance_method(EXCLUDE_PREDICATE, ABSTRACT_LEXICON, $list66, $list268, $list273);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, EXCLUDE_PREDICATE, ABSTRACT_LEXICON_EXCLUDE_PREDICATE_METHOD);
		methods.methods_incorporate_instance_method($sym276$EXCLUDED_PREDICATE_, ABSTRACT_LEXICON, $list66, $list268, $list277);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym276$EXCLUDED_PREDICATE_, $sym279$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD);
		methods.methods_incorporate_instance_method($sym280$ALLOWED_PREDICATE_, ABSTRACT_LEXICON, $list66, $list268, $list281);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym280$ALLOWED_PREDICATE_, $sym283$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD);
		methods.methods_incorporate_instance_method($sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, ABSTRACT_LEXICON, $list66, $list244, $list284);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, $sym286$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD);
		methods.methods_incorporate_instance_method(ALLOW_POS, ABSTRACT_LEXICON, $list66, $list288, $list289);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_POS, ABSTRACT_LEXICON_ALLOW_POS_METHOD);
		methods.methods_incorporate_instance_method(EXCLUDE_POS, ABSTRACT_LEXICON, $list66, $list288, $list293);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, EXCLUDE_POS, ABSTRACT_LEXICON_EXCLUDE_POS_METHOD);
		methods.methods_incorporate_instance_method($sym296$EXCLUDED_POS_, ABSTRACT_LEXICON, $list66, $list288, $list297);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym296$EXCLUDED_POS_, $sym299$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD);
		methods.methods_incorporate_instance_method($sym247$ALLOWED_POS_, ABSTRACT_LEXICON, $list66, $list288, $list300);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym247$ALLOWED_POS_, $sym302$ABSTRACT_LEXICON_ALLOWED_POS__METHOD);
		methods.methods_incorporate_instance_method($sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, ABSTRACT_LEXICON, $list66, $list244, $list303);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, $sym305$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD);
		methods.methods_incorporate_instance_method(ADD_LEARNER, ABSTRACT_LEXICON, $list71, $list307, $list308);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ADD_LEARNER, ABSTRACT_LEXICON_ADD_LEARNER_METHOD);
		methods.methods_incorporate_instance_method(REMOVE_LEARNER, ABSTRACT_LEXICON, $list71, $list307, $list312);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, REMOVE_LEARNER, ABSTRACT_LEXICON_REMOVE_LEARNER_METHOD);
		methods.methods_incorporate_instance_method(GET_LEARNERS, ABSTRACT_LEXICON, $list71, NIL, $list316);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_LEARNERS, ABSTRACT_LEXICON_GET_LEARNERS_METHOD);
		methods.methods_incorporate_instance_method(SET_LEARNERS, ABSTRACT_LEXICON, $list71, $list320, $list321);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, SET_LEARNERS, ABSTRACT_LEXICON_SET_LEARNERS_METHOD);
		methods.methods_incorporate_instance_method(INITIALIZE_ALLOWED_MTS, ABSTRACT_LEXICON, $list324, $list325, $list326);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, INITIALIZE_ALLOWED_MTS, ABSTRACT_LEXICON_INITIALIZE_ALLOWED_MTS_METHOD);
		methods.methods_incorporate_instance_method(SET_BASE_MT, ABSTRACT_LEXICON, $list71, $list339, $list340);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, SET_BASE_MT, ABSTRACT_LEXICON_SET_BASE_MT_METHOD);
		methods.methods_incorporate_instance_method(GET_BASE_MT, ABSTRACT_LEXICON, $list66, NIL, $list344);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_BASE_MT, ABSTRACT_LEXICON_GET_BASE_MT_METHOD);
		methods.methods_incorporate_instance_method(ALLOW_MT, ABSTRACT_LEXICON, $list71, $list339, $list347);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_MT, ABSTRACT_LEXICON_ALLOW_MT_METHOD);
		methods.methods_incorporate_instance_method(ALLOW_GENL_MTS, ABSTRACT_LEXICON, $list71, $list339, $list352);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ALLOW_GENL_MTS, ABSTRACT_LEXICON_ALLOW_GENL_MTS_METHOD);
		methods.methods_incorporate_instance_method(FORBID_MT, ABSTRACT_LEXICON, $list243, $list339, $list358);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORBID_MT, ABSTRACT_LEXICON_FORBID_MT_METHOD);
		methods.methods_incorporate_instance_method($sym250$ALLOWED_MT_, ABSTRACT_LEXICON, $list324, $list339, $list360);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym250$ALLOWED_MT_, $sym361$ABSTRACT_LEXICON_ALLOWED_MT__METHOD);
		methods.methods_incorporate_instance_method(ROOT_MT, ABSTRACT_LEXICON, $list362, NIL, $list363);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ROOT_MT, ABSTRACT_LEXICON_ROOT_MT_METHOD);
		methods.methods_incorporate_instance_method(ADD_STOP_WORD, ABSTRACT_LEXICON, $list66, $list366, $list367);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ADD_STOP_WORD, ABSTRACT_LEXICON_ADD_STOP_WORD_METHOD);
		methods.methods_incorporate_instance_method(STOP_WORD_P, ABSTRACT_LEXICON, $list66, $list366, $list370);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, STOP_WORD_P, ABSTRACT_LEXICON_STOP_WORD_P_METHOD);
		methods.methods_incorporate_instance_method(GET_STOP_WORDS, ABSTRACT_LEXICON, $list66, NIL, $list374);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET_STOP_WORDS, ABSTRACT_LEXICON_GET_STOP_WORDS_METHOD);
		methods.methods_incorporate_instance_method(COPY, ABSTRACT_LEXICON, $list71, $list377, $list378);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, COPY, ABSTRACT_LEXICON_COPY_METHOD);
		methods.methods_incorporate_instance_method(GET, ABSTRACT_LEXICON, $list71, $list366, $list385);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, GET, ABSTRACT_LEXICON_GET_METHOD);
		methods.methods_incorporate_instance_method(DELETE, ABSTRACT_LEXICON, $list71, $list366, $list394);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, DELETE, ABSTRACT_LEXICON_DELETE_METHOD);
		methods.methods_incorporate_instance_method(DELETE_ENTRY_FROM_STRING, ABSTRACT_LEXICON, $list71, $list398, $list399);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, DELETE_ENTRY_FROM_STRING, ABSTRACT_LEXICON_DELETE_ENTRY_FROM_STRING_METHOD);
		methods.methods_incorporate_instance_method(ADD, ABSTRACT_LEXICON, $list71, $list405, $list406);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ADD, ABSTRACT_LEXICON_ADD_METHOD);
		methods.methods_incorporate_instance_method($sym409$LEARNED_, ABSTRACT_LEXICON, $list71, $list405, $list410);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, $sym409$LEARNED_, $sym412$ABSTRACT_LEXICON_LEARNED__METHOD);
		methods.methods_incorporate_instance_method(FORGET, ABSTRACT_LEXICON, $list71, NIL, $list414);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, FORGET, ABSTRACT_LEXICON_FORGET_METHOD);
		methods.methods_incorporate_instance_method(PREFIXES, ABSTRACT_LEXICON, $list71, $list418, $list419);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIXES, ABSTRACT_LEXICON_PREFIXES_METHOD);
		methods.methods_incorporate_instance_method(PREFIXES_FROM_STRING, ABSTRACT_LEXICON, $list71, $list366, $list424);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIXES_FROM_STRING, ABSTRACT_LEXICON_PREFIXES_FROM_STRING_METHOD);
		methods.methods_incorporate_instance_method(PREFIX_KEYS, ABSTRACT_LEXICON, $list71, $list418, $list430);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIX_KEYS, ABSTRACT_LEXICON_PREFIX_KEYS_METHOD);
		methods.methods_incorporate_instance_method(PREFIX_KEYS_FROM_STRING, ABSTRACT_LEXICON, $list71, $list366, $list434);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, PREFIX_KEYS_FROM_STRING, ABSTRACT_LEXICON_PREFIX_KEYS_FROM_STRING_METHOD);
		methods.methods_incorporate_instance_method(LEARN, ABSTRACT_LEXICON, $list71, $list438, $list439);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEARN, ABSTRACT_LEXICON_LEARN_METHOD);
		methods.methods_incorporate_instance_method(NUMBER_LEARN, ABSTRACT_LEXICON, $list66, $list443, $list444);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, NUMBER_LEARN, ABSTRACT_LEXICON_NUMBER_LEARN_METHOD);
		memoization_state.note_globally_cached_function($sym452$SCALAR_FUNCTION_);
		methods.methods_incorporate_instance_method(NOUN_COMPOUND_LEARN, ABSTRACT_LEXICON, $list66, $list443, $list456);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, NOUN_COMPOUND_LEARN, ABSTRACT_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
		methods.methods_incorporate_instance_method(COOCCURRENCE_STATISTICS_LEARN, ABSTRACT_LEXICON, $list66, $list443, $list456);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, COOCCURRENCE_STATISTICS_LEARN, ABSTRACT_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_DOCUMENT, ABSTRACT_LEXICON, $list71, $list473, $list474);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_DOCUMENT, ABSTRACT_LEXICON_LEXIFY_DOCUMENT_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_DOCUMENT_EXHAUSTIVELY, ABSTRACT_LEXICON, $list71, $list473, $list480);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_DOCUMENT_EXHAUSTIVELY, ABSTRACT_LEXICON_LEXIFY_DOCUMENT_EXHAUSTIVELY_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_PARAGRAPH, ABSTRACT_LEXICON, $list71, $list483, $list484);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_PARAGRAPH, ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_PARAGRAPH_EXHAUSTIVELY, ABSTRACT_LEXICON, $list71, $list483, $list488);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_PARAGRAPH_EXHAUSTIVELY, ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_EXHAUSTIVELY_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_SENTENCE, ABSTRACT_LEXICON, $list71, $list491, $list492);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_SENTENCE, ABSTRACT_LEXICON_LEXIFY_SENTENCE_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_SENTENCE_EXHAUSTIVELY, ABSTRACT_LEXICON, $list71, $list491, $list497);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_SENTENCE_EXHAUSTIVELY, ABSTRACT_LEXICON_LEXIFY_SENTENCE_EXHAUSTIVELY_METHOD);
		methods.methods_incorporate_instance_method(LEXIFY_WORDS, ABSTRACT_LEXICON, $list71, $list515, $list516);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, LEXIFY_WORDS, ABSTRACT_LEXICON_LEXIFY_WORDS_METHOD);
		methods.methods_incorporate_instance_method(TOKENIZE, ABSTRACT_LEXICON, $list71, $list366, $list522);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, TOKENIZE, ABSTRACT_LEXICON_TOKENIZE_METHOD);
		methods.methods_incorporate_instance_method(ITERATOR, ABSTRACT_LEXICON, $list71, NIL, $list535);
		methods.subloop_register_instance_method(ABSTRACT_LEXICON, ITERATOR, ABSTRACT_LEXICON_ITERATOR_METHOD);
		register_cyc_api_function(NEW_LEXICON_FROM_KB_SPEC, $list539, $str540$_param_KB_SPEC__the_CycL_type_of_, $list541, $list542);
		memoization_state.note_globally_cached_function(PREDS_FOR_LEXICON_EXCLUSION);
		register_method($print_object_method_table$.getGlobalValue(), $dtp_abstract_lexicon_iterator_state$.getGlobalValue(), symbol_function(ABSTRACT_LEXICON_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list563);
		def_csetf(ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR, _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR);
		def_csetf(ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES, _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES);
		def_csetf(ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON, _CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON);
		identity(ABSTRACT_LEXICON_ITERATOR_STATE);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_abstract_lexicon_iterator_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ABSTRACT_LEXICON_ITERATOR_STATE_METHOD));
		note_funcall_helper_function(ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P);
		note_funcall_helper_function(ABSTRACT_LEXICON_ITERATOR_STATE_NEXT);
		define_test_case_table_int(SCALAR_INTERVAL_MEANINGS, list(new SubLObject[] { $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list596);
		define_test_case_table_int(TEXT_NUMBERS, list(new SubLObject[] { $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list598);
		define_test_case_table_int(NUMBER_MEANINGS, list(new SubLObject[] { $TEST, $sym603$NUMBER_MEANINGS_RESULTS_EQUAL_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list604);
		define_test_case_table_int(TOKENIZING_TEST_COVERING, list(new SubLObject[] { $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list606);
		return NIL;
	}

	static private final SubLList $list_alt472 = list(makeSymbol("PAR"));

	static private final SubLList $list_alt473 = list(makeString("@param PAR paragraph-p;\n   @return paraphraph-p; a new version of PAR with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in PAR"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PAR"), makeSymbol("PARAGRAPH-P")),
			list(makeSymbol("CLET"), list(list(makeSymbol("LEXIFIED"), list(makeSymbol("MAKE-PARAGRAPH"))), list(makeSymbol("SENTENCES"), NIL)),
					list(makeSymbol("PARAGRAPH-DO-SENTENCES"), list(makeSymbol("SENTENCE"), makeSymbol("PAR")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXIFY-SENTENCE")), makeSymbol("SENTENCE")), makeSymbol("SENTENCES"))),
					list(makeSymbol("CSETF"), list(makeSymbol("PARAGRAPH-SENTENCES"), makeSymbol("LEXIFIED")), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("VECTOR")), list(makeSymbol("NREVERSE"), makeSymbol("SENTENCES")))), list(RET, makeSymbol("LEXIFIED"))));

	static private final SubLList $list_alt477 = list(makeSymbol("SENTENCE"));

	static private final SubLList $list_alt478 = list(makeString("@param sentence sentence-p;\n   @return sentence-p; a new version of SENTENCE with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in SENTENCE"), list(makeSymbol("CHECK-TYPE"), makeSymbol("SENTENCE"), makeSymbol("SENTENCE-P")),
			list(makeSymbol("PWHEN"), list(makeSymbol("ZEROP"), list(makeSymbol("SENTENCE-LENGTH"), makeSymbol("SENTENCE"))), list(RET, makeSymbol("SENTENCE"))),
			list(new SubLObject[] { makeSymbol("CLET"),
					list(list(makeSymbol("LEXIFIED"), list(makeSymbol("NEW-SENTENCE"))), list(makeSymbol("WORD-VEC"), list(makeSymbol("SENTENCE-YIELD"), makeSymbol("SENTENCE"))), list(makeSymbol("FIRST-WORD"), list(makeSymbol("WORD-STRING"), list(makeSymbol("AREF"), makeSymbol("WORD-VEC"), ZERO_INTEGER))), list(makeSymbol("RECORD-LENGTH"), ZERO_INTEGER), list(makeSymbol("LEXIFIED-TOKENS"), NIL), makeSymbol("WORDS")),
					list(makeSymbol("TAGGER-NORMALIZE-INITIAL-CAPITALIZATION"), list(makeSymbol("GET-TAGGER")), makeSymbol("WORD-VEC")), list(makeSymbol("CSETQ"), makeSymbol("WORDS"), list(makeSymbol("VECTOR-ELEMENTS"), makeSymbol("WORD-VEC"))),
					list(makeSymbol("CLET"), list(list(makeSymbol("*LEXICON-LOOKUP-MT*"), reader_make_constant_shell("InferencePSC"))),
							list(makeSymbol("CDO"),
									list(list(makeSymbol("INDEX"), ZERO_INTEGER, list(makeSymbol("+"), makeSymbol("INDEX"), makeSymbol("RECORD-LENGTH"))), list(makeSymbol("TOKENS"), makeSymbol("WORDS"), list(makeSymbol("NTHCDR"), makeSymbol("RECORD-LENGTH"), makeSymbol("TOKENS"))),
											list(makeSymbol("STRINGS"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("WORD-STRING")), makeSymbol("TOKENS")), list(makeSymbol("NTHCDR"), makeSymbol("RECORD-LENGTH"), makeSymbol("STRINGS")))),
									list(list(makeSymbol("NULL"), makeSymbol("TOKENS"))),
									list(makeSymbol("CLET"), list(list(makeSymbol("PREFIXES"), list(makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY"))), list(makeSymbol("NEW-TOKEN"), NIL), list(makeSymbol("LOCAL-CASE-SENSITIVITY"), makeSymbol("CASE-SENSITIVITY"))),
											list(makeSymbol("UNTIL"), list(makeSymbol("COR"), list(makeSymbol("LEXIFIED-WORD-P"), makeSymbol("NEW-TOKEN")), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("PREFIXES"))),
													list(makeSymbol("POP-BIND"), list(makeSymbol("RECORD"), makeSymbol("PREFIXES")), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("NEW-TOKEN"), makeSymbol("RECORD-LENGTH")), list(makeSymbol("GET-LEX-ENTRIES-FOR-PREFIX"), makeSymbol("SELF"), makeSymbol("TOKENS"), makeSymbol("STRINGS"), makeSymbol("RECORD"), makeSymbol("LEXIFIED")))),
													list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("PREFIXES")), list(makeSymbol("NULL"), list(makeSymbol("WORD-INFO"), makeSymbol("NEW-TOKEN"))), list(EQ, makeSymbol("LOCAL-CASE-SENSITIVITY"), makeKeyword("PREFERRED"))), list(makeSymbol("CSETQ"), makeSymbol("LOCAL-CASE-SENSITIVITY"), makeKeyword("OFF")),
															list(makeSymbol("CSETQ"), makeSymbol("PREFIXES"), list(makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("LOCAL-CASE-SENSITIVITY"))))),
											list(makeSymbol("PUNLESS"), list(makeSymbol("WORD-P"), makeSymbol("NEW-TOKEN")), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("NEW-TOKEN"), makeSymbol("RECORD-LENGTH")), list(makeSymbol("GET-LEX-ENTRIES-FOR-PREFIX"), makeSymbol("SELF"), makeSymbol("TOKENS"), makeSymbol("STRINGS"), NIL, makeSymbol("LEXIFIED")))),
											list(makeSymbol("CPUSH"), makeSymbol("NEW-TOKEN"), makeSymbol("LEXIFIED-TOKENS"))))),
					list(makeSymbol("CSETF"), list(makeSymbol("SIGN-CONSTITUENTS"), makeSymbol("LEXIFIED")), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("VECTOR")), list(makeSymbol("NREVERSE"), makeSymbol("LEXIFIED-TOKENS")))),
					list(makeSymbol("WORD-UPDATE"), list(makeSymbol("SENTENCE-GET"), makeSymbol("LEXIFIED"), ZERO_INTEGER), list(makeSymbol("LIST"), makeKeyword("STRING"), list(makeSymbol("REPLACE"), list(makeSymbol("WORD-STRING"), list(makeSymbol("SENTENCE-GET"), makeSymbol("LEXIFIED"), ZERO_INTEGER)), makeSymbol("FIRST-WORD")))),
					list(makeSymbol("CSETF"), list(makeSymbol("SIGN-STRING"), makeSymbol("LEXIFIED")), list(makeSymbol("SENTENCE-STRING"), makeSymbol("SENTENCE"))),
					list(makeSymbol("PWHEN"), list(makeSymbol("SENTENCE-MOTHER"), makeSymbol("SENTENCE")), list(makeSymbol("PARAGRAPH-SET"), list(makeSymbol("SENTENCE-MOTHER"), makeSymbol("SENTENCE")), list(makeSymbol("SENTENCE-INDEX"), makeSymbol("SENTENCE")), makeSymbol("LEXIFIED"))), list(RET, makeSymbol("LEXIFIED")) }));

	static private final SubLSymbol $sym479$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLString $str_alt483$_ = makeString("'");

	static private final SubLString $str_alt489$_ = makeString(" ");

	static private final SubLList $list_alt490 = list(makeKeyword("VB"), makeKeyword("VBN"), makeKeyword("VBZ"), makeKeyword("VBD"));

	static private final SubLList $list_alt491 = list(makeKeyword("CD"));

	static private final SubLList $list_alt496 = list(makeKeyword("NNP"), $NNPS, makeKeyword("NN"), makeKeyword("NNS"));

	static private final SubLList $list_alt498 = list(makeSymbol("WORDS"));

	static private final SubLList $list_alt499 = list(makeString("@param WORDS listp;\n   @return listp; a list of <string, category, lex-entries> triples for WORDS, where\n   STRING may be several of WORDS collapsed into a single entry"), list(makeSymbol("CHECK-TYPE"), makeSymbol("WORDS"), makeSymbol("LISTP")),
			list(makeSymbol("CLET"), list(list(makeSymbol("RECORD-LENGTH"), ZERO_INTEGER), list(makeSymbol("LEXIFIED-TOKENS"), NIL), makeSymbol("CATEGORY"), makeSymbol("STRING")),
					list(makeSymbol("CDO"),
							list(list(makeSymbol("INDEX"), ZERO_INTEGER, list(makeSymbol("+"), makeSymbol("INDEX"), makeSymbol("RECORD-LENGTH"))), list(makeSymbol("TOKENS"), makeSymbol("WORDS"), list(makeSymbol("NTHCDR"), makeSymbol("RECORD-LENGTH"), makeSymbol("TOKENS"))),
									list(makeSymbol("STRINGS"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("GET-PARSE-TREE-STRING")), makeSymbol("TOKENS")), list(makeSymbol("NTHCDR"), makeSymbol("RECORD-LENGTH"), makeSymbol("STRINGS"))),
									list(makeSymbol("RECORDS"), list(makeSymbol("NL-TRIE-PREFIXES"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY")), list(makeSymbol("NL-TRIE-PREFIXES"), makeSymbol("TRIE"), makeSymbol("STRINGS"), makeSymbol("CASE-SENSITIVITY")))),
							list(list(makeSymbol("NULL"), makeSymbol("TOKENS"))), list(makeSymbol("CSETQ"), makeSymbol("RECORDS"), list(makeSymbol("ADD-TO-END"), list(makeSymbol("NEW-NL-TRIE-RECORD"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), makeSymbol("TOKENS")), list(QUOTE, makeSymbol("GET-STRING")))), NIL), makeSymbol("RECORDS"))),
							list(makeSymbol("CLET"), list(makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE")),
									list(makeSymbol("CSOME"), list(makeSymbol("RECORD"), makeSymbol("RECORDS"), makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE")), list(makeSymbol("CSETQ"), makeSymbol("RECORD-LENGTH"), list(makeSymbol("LENGTH"), list(makeSymbol("NL-TRIE-RECORD-KEY"), makeSymbol("RECORD")))),
											list(makeSymbol("CSETQ"), makeSymbol("STRING"), list(makeSymbol("BUILD-MULTI-WORD-LEXEME"), list(makeSymbol("FIRST-N"), makeSymbol("RECORD-LENGTH"), makeSymbol("STRINGS")))), list(makeSymbol("CSETQ"), makeSymbol("CATEGORY"), list(makeSymbol("GUESS-CATEGORY"), makeSymbol("SELF"), makeSymbol("STRING"), makeSymbol("TOKENS"))),
											list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), makeSymbol("LEX-ENTRIES0"), makeSymbol("EXISTS?")), list(makeSymbol("PUNLESS"), makeSymbol("IGNORE-CACHE?"), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("LEX-ENTRIES0"), makeSymbol("EXISTS?")), list(makeSymbol("CACHE-GET"), makeSymbol("CACHE"), makeSymbol("STRING")))),
													list(makeSymbol("PUNLESS"), makeSymbol("EXISTS?"),
															list(makeSymbol("CDOLIST"), list(makeSymbol("NL-TRIE-ENTRY"), list(makeSymbol("NL-TRIE-RECORD-ENTRIES"), makeSymbol("RECORD"))),
																	list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("VALID-NL-TRIE-ENTRY?")), makeSymbol("NL-TRIE-ENTRY")),
																			list(makeSymbol("CDOLIST"), list(makeSymbol("LEX-ENTRY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-LEX-ENTRIES")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES0"))))),
															list(makeSymbol("PUNLESS"), makeSymbol("IGNORE-CACHE?"), list(makeSymbol("CACHE-SET"), makeSymbol("CACHE"), makeSymbol("STRING"), makeSymbol("LEX-ENTRIES0")))),
													list(makeSymbol("CDOLIST"), list(makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES0")),
															list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("CATEGORY"), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS"))), list(makeSymbol("CPUSHNEW"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES"), list(QUOTE, makeSymbol("LEX-ENTRY-EQUAL-P"))))),
													list(makeSymbol("PUNLESS"), makeSymbol("LEX-ENTRIES"),
															list(makeSymbol("CDOLIST"), list(makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES0")),
																	list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("CATEGORY"), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("GET")), makeKeyword("BACKOFF-PENN-TAGS"))), list(makeSymbol("CPUSHNEW"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES"), list(QUOTE, makeSymbol("LEX-ENTRY-EQUAL-P")))))),
													list(makeSymbol("PWHEN"), list(makeSymbol("COR"), makeSymbol("LEX-ENTRIES"), list(makeSymbol("NULL"), list(makeSymbol("NL-TRIE-RECORD-ENTRIES"), makeSymbol("RECORD")))),
															list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE"), T), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("STRING"), makeSymbol("CATEGORY"), makeSymbol("LEX-ENTRIES")), makeSymbol("LEXIFIED-TOKENS")))))))),
					list(RET, list(makeSymbol("NREVERSE"), makeSymbol("LEXIFIED-TOKENS")))));

	static private final SubLSymbol $sym500$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");

	static private final SubLList $list_alt504 = list(makeString("@param STRING stringp; an English string\n   @return listp; a list of English string tokens from STRING\n   @note Not the most efficient way since words and lexical entries are painfully constructed\n   and then discarded...this should duplicate only the tokenization part of the \'lexify method"),
			list(makeSymbol("CLET"), list(list(makeSymbol("WORDS"), list(makeSymbol("LEXIFY-SENTENCE"), makeSymbol("SELF"), list(makeSymbol("NEW-SENTENCE"), makeSymbol("STRING"), list(QUOTE, makeSymbol("FST-STRING-WORDIFY"))))), list(makeSymbol("STRINGS"), NIL)),
					list(makeSymbol("SENTENCE-DO-WORDS"), list(makeSymbol("WORD"), makeSymbol("WORDS")), list(makeSymbol("CPUSH"), list(makeSymbol("WORD-STRING"), makeSymbol("WORD")), makeSymbol("STRINGS"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("STRINGS")))));

	static private final SubLList $list_alt507 = list(list(makeSymbol("STRING"), makeSymbol("LEX-ENTRY"), makeSymbol("LEXICON")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLSymbol $sym508$ITERATOR = makeUninternedSymbol("ITERATOR");

	static private final SubLList $list_alt515 = list(list(QUOTE, makeSymbol("GET")), makeKeyword("STRING"));

	static private final SubLList $list_alt517 = list(makeString("@return iterator-p; an iterator for this lexicon"), list(RET, list(makeSymbol("NEW-LEXICON-ITERATOR"), makeSymbol("SELF"))));

	static private final SubLList $list_alt521 = list(makeSymbol("KB-SPEC"));

	static private final SubLString $str_alt522$_param_KB_SPEC__the_CycL_type_of_ = makeString("@param KB-SPEC; the CycL type of the lexicon that you want to create.  This must be a specialization of #$AbstractLexiconSpecification\n   @return ABSTRACT-LEXICON-P; the fully-instantiated lexicon object");

	static private final SubLList $list_alt523 = list(list(makeSymbol("KB-SPEC"), makeSymbol("FORT-P")));

	static private final SubLList $list_alt524 = list(makeSymbol("ABSTRACT-LEXICON-P"));

	static private final SubLSymbol $sym525$_CLASS_NAME = makeSymbol("?CLASS-NAME");

	static private final SubLList $list_alt527 = list(makeSymbol("?CLASS-NAME"));

	static private final SubLSymbol $sym529$_PRED = makeSymbol("?PRED");

	static private final SubLList $list_alt531 = list(makeSymbol("?PRED"));

	static private final SubLList $list_alt532 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

	static private final SubLList $list_alt539 = list(makeSymbol("TRIE-ITERATOR"), makeSymbol("NEXT-ENTRIES"), makeSymbol("LEXICON"));

	static private final SubLList $list_alt540 = list(makeKeyword("TRIE-ITERATOR"), makeKeyword("NEXT-ENTRIES"), makeKeyword("LEXICON"));

	static private final SubLList $list_alt541 = list(makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR"), makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES"), makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON"));

	static private final SubLList $list_alt542 = list(makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR"), makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES"), makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON"));

	static private final SubLList $list_alt554 = list(makeSymbol("KEY"), makeSymbol("TRIE-ENTRIES"));

	static private final SubLList $list_alt555 = list(list(makeSymbol("TERM"), makeSymbol("FORMULA")), makeSymbol("&BODY"), makeSymbol("BODY"));

	static private final SubLSymbol $sym556$STACK = makeUninternedSymbol("STACK");

	static private final SubLSymbol $sym557$ENTRY = makeUninternedSymbol("ENTRY");

	static private final SubLList $list_alt558 = list(list(makeSymbol("CREATE-STACK")));

	static private final SubLSymbol $sym563$FIRST_ORDER_TERM_ = makeSymbol("FIRST-ORDER-TERM?");

	static private final SubLString $$$daves = makeString("daves");

	static private final SubLList $list_alt576 = list(list(list(makeString("3.4   billion dogs and 2 cats")), list(makeString("3.4   billion"), makeString("2"))), list(list(makeString("3.1415926 is pi")), list(makeString("3.1415926"))), list(list(makeString("3.1415926, 2.3456789 and 1.3254 are numbers")), list(makeString("3.1415926"), makeString("2.3456789"), makeString("1.3254"))),
			list(list(makeString("3.1415926, -2.3456789 and 1.3254 are numbers")), list(makeString("3.1415926"), makeString("-2.3456789"), makeString("1.3254"))));

	static private final SubLList $list_alt578 = list(list(list(makeString("3.4   billion dogs and 2 cats")), list(list(makeString("2"), TWO_INTEGER), list(makeString("3.4   billion"), makeDouble(3.4E9)))), list(list(makeString("3.1415926 is pi")), list(list(makeString("3.1415926"), makeDouble(3.1415926)))),
			list(list(makeString("3.1415926, 2.3456789 and 1.3254 are numbers")), list(list(makeString("1.3254"), makeDouble(1.3254)), list(makeString("2.3456789"), makeDouble(2.3456789)), list(makeString("3.1415926"), makeDouble(3.1415926)))),
			list(list(makeString("3.1415926, -2.3456789 and 1.3254 are numbers")), list(list(makeString("1.3254"), makeDouble(1.3254)), list(makeString("-2.3456789"), makeDouble(-2.3456789)), list(makeString("3.1415926"), makeDouble(3.1415926)))));

	private static SubLObject _constant_175_initializer() {
		return list(new SubLObject[] {
				list(makeSymbol("DEFAULT-EXCLUDE-MTS"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"),
						list(QUOTE,
								list(new SubLObject[] { reader_make_constant_shell("WebSearchDataMt"), reader_make_constant_shell("CyclistsMt"), reader_make_constant_shell("RelationParaphraseMt"), reader_make_constant_shell("WordNetMappingMt"), reader_make_constant_shell("PornographyJargonMt"), reader_make_constant_shell("CommonEnglishMisspellingsMt"), reader_make_constant_shell("ComputereseLexicalMt"),
										reader_make_constant_shell("CyclishMt"), reader_make_constant_shell("TemporaryLexicalAssertionsMt"), reader_make_constant_shell("EnglishWordSenseAssertions-HoldingMt"), reader_make_constant_shell("TemporaryLexicalAssertions-WordNetImportMt"), reader_make_constant_shell("RedundantLexicalMt"), reader_make_constant_shell("PDATemplateTestMt"),
										reader_make_constant_shell("EnglishParaphraseMt"), reader_make_constant_shell("SupplementalDeterminerSemTransLexicalMt") }))),
				list(makeSymbol("DEFAULT-EXCLUDE-PREDICATES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("SET-ELEMENT-LIST"), makeSymbol("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*"))),
				list(makeSymbol("DEFAULT-BASE-MT"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell("AllGeneralEnglishValidatedLexicalMicrotheoryPSC")), list(makeSymbol("DEFAULT-KB-SPEC"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell("AbstractLexiconSpecification")),
				list(makeSymbol("ALLOWED-MTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("EXCLUDED-MTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("BASE-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeKeyword("UNINITIALIZED")),
				list(makeSymbol("ROOT-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("EXCLUDED-PREDS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("EXCLUDED-POS-LIST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), NIL),
				list(makeSymbol("TRIE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IGNORE-CACHE?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CASE-SENSITIVITY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")),
				list(makeSymbol("ALLOW-FABRICATION?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), T), list(makeSymbol("LEARNED"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ACTIVE-LEARNERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ALLOW-STEMMING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), T),
				list(makeSymbol("STOP-WORDS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), NIL), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("RESPORATOR-CYC-POS"), list(makeSymbol("TYPE.STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("RESPORATOR-TO-INFLECTIONS"), list(makeSymbol("TYPE.STRING")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESPORATOR-TO-CYCL"), list(makeSymbol("TYPE.STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALID-NL-TRIE-ENTRY?"), list(makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPY"), list(makeSymbol("&OPTIONAL"), makeSymbol("TARGET")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("LEX-ENTRY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORGET"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREFIXES"), list(makeSymbol("STRINGS")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREFIXES-FROM-STRING"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-DOCUMENT"), list(makeSymbol("DOCUMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-PARAGRAPH"), list(makeSymbol("PARAGRAPH")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-SENTENCE"), list(makeSymbol("SENTENCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TOKENIZE"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-WORDS"), list(makeSymbol("WORDS")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-ALLOWED-MTS"), list(makeSymbol("KB-SPEC")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BASE-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BASE-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-GENL-MTS"), list(makeSymbol("MT")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORBID-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-EXCLUDED-PREDS"), list(makeSymbol("PRED-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-PREDICATE"), list(makeSymbol("PRED")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXCLUDE-PREDICATE"), list(makeSymbol("PRED")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-POS"), list(makeSymbol("POS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXCLUDE-POS"), list(makeSymbol("POS")), makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-LEARNER"), list(makeSymbol("LEARNER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-LEARNER"), list(makeSymbol("LEARNER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEARNERS"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IGNORE-CACHE"), list(makeSymbol("BOOLEAN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IGNORE-CACHE?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-STEMMING"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CASE-SENSITIVITY"), list(makeSymbol("SENSITIVITY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CASE-SENSITIVITY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORBID-STEMMING"), NIL, makeKeyword("PUBLIC")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOW-FABRICATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORBID-FABRICATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATION-FORBIDDEN?"), NIL, makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATION-ALLOWED?"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOUN-COMPOUND-LEARN"), list(makeSymbol("TEXT")), makeKeyword("PROTECTED")),
				list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COOCCURRENCE-STATISTICS-LEARN"), list(makeSymbol("TEXT")), makeKeyword("PROTECTED")) });
	}

	@Override
	public void declareFunctions() {
		declare_abstract_lexicon_file();
	}

	@Override
	public void initializeVariables() {
		init_abstract_lexicon_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_abstract_lexicon_file();
	}

	static {
	}

	public static final class $textract_lemma_native extends SubLStructNative {
		public SubLObject $paragraph;

		public SubLObject $sentence;

		public SubLObject $word;

		public SubLObject $string;

		public SubLObject $canon;

		public SubLObject $type;

		private static final SubLStructDeclNative structDecl;

		public $textract_lemma_native() {
			abstract_lexicon.$textract_lemma_native.this.$paragraph = Lisp.NIL;
			abstract_lexicon.$textract_lemma_native.this.$sentence = Lisp.NIL;
			abstract_lexicon.$textract_lemma_native.this.$word = Lisp.NIL;
			abstract_lexicon.$textract_lemma_native.this.$string = Lisp.NIL;
			abstract_lexicon.$textract_lemma_native.this.$canon = Lisp.NIL;
			abstract_lexicon.$textract_lemma_native.this.$type = Lisp.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return abstract_lexicon.$textract_lemma_native.this.$paragraph;
		}

		@Override
		public SubLObject getField3() {
			return abstract_lexicon.$textract_lemma_native.this.$sentence;
		}

		@Override
		public SubLObject getField4() {
			return abstract_lexicon.$textract_lemma_native.this.$word;
		}

		@Override
		public SubLObject getField5() {
			return abstract_lexicon.$textract_lemma_native.this.$string;
		}

		@Override
		public SubLObject getField6() {
			return abstract_lexicon.$textract_lemma_native.this.$canon;
		}

		@Override
		public SubLObject getField7() {
			return abstract_lexicon.$textract_lemma_native.this.$type;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return abstract_lexicon.$textract_lemma_native.this.$paragraph = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value) {
			return abstract_lexicon.$textract_lemma_native.this.$sentence = value;
		}

		@Override
		public SubLObject setField4(final SubLObject value) {
			return abstract_lexicon.$textract_lemma_native.this.$word = value;
		}

		@Override
		public SubLObject setField5(final SubLObject value) {
			return abstract_lexicon.$textract_lemma_native.this.$string = value;
		}

		@Override
		public SubLObject setField6(final SubLObject value) {
			return abstract_lexicon.$textract_lemma_native.this.$canon = value;
		}

		@Override
		public SubLObject setField7(final SubLObject value) {
			return abstract_lexicon.$textract_lemma_native.this.$type = value;
		}

		static {
			structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.abstract_lexicon.$textract_lemma_native.class, TEXTRACT_LEMMA, TEXTRACT_LEMMA_P, $list12, $list13, new String[] { "$paragraph", "$sentence", "$word", "$string", "$canon", "$type" }, $list14, $list15, TEXTRACT_LEMMA_PRINT);
		}
	}

	public static final class $textract_lemma_p$UnaryFunction extends UnaryFunction {
		public $textract_lemma_p$UnaryFunction() {
			super(extractFunctionNamed("TEXTRACT-LEMMA-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return textract_lemma_p(arg1);
		}
	}

	public static final class $clear_preds_for_lexicon_exclusion$ZeroArityFunction extends ZeroArityFunction {
		public $clear_preds_for_lexicon_exclusion$ZeroArityFunction() {
			super(extractFunctionNamed("CLEAR-PREDS-FOR-LEXICON-EXCLUSION"));
		}

		@Override
		public SubLObject processItem() {
			return clear_preds_for_lexicon_exclusion();
		}
	}

	public static final class $abstract_lexicon_iterator_state_p$UnaryFunction extends UnaryFunction {
		public $abstract_lexicon_iterator_state_p$UnaryFunction() {
			super(extractFunctionNamed("ABSTRACT-LEXICON-ITERATOR-STATE-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return abstract_lexicon_iterator_state_p(arg1);
		}
	}
}

/**
 * Total time: 3214 ms synthetic
 */
