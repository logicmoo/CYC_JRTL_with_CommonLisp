/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.nl_stats.noun_learner;
import com.cyc.cycjava.cycl.quirk.external_interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class semtrans_lexicon extends SubLTranslatedFile implements V12 {
    public static final SubLObject semtrans_lexicon_stanford_learn_tightened_test(SubLObject string) {
	{
	    SubLObject lexicon = object.new_class_instance(SEMTRANS_LEXICON);
	    SubLObject lex_entries = methods.funcall_instance_method_with_1_args(lexicon, STANFORD_NER_LEARN_TIGHTENED_TYPES, string);
	    SubLObject result = NIL;
	    SubLObject cdolist_list_var = lex_entries;
	    SubLObject lex_entry = NIL;
	    for (lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex_entry = cdolist_list_var.first()) {
		result = cons(methods.funcall_instance_method_with_1_args(lex_entry, GET, $SEMTRANS), result);
	    }
	    return result;
	}
    }

    public static final SubLObject semtrans_lexicon_stanford_learn_simple_test(SubLObject string) {
	{
	    SubLObject lexicon = object.new_class_instance(SEMTRANS_LEXICON);
	    SubLObject lex_entries = methods.funcall_instance_method_with_1_args(lexicon, STANFORD_NER_LEARN, string);
	    SubLObject result = NIL;
	    SubLObject cdolist_list_var = lex_entries;
	    SubLObject lex_entry = NIL;
	    for (lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex_entry = cdolist_list_var.first()) {
		result = cons(methods.funcall_instance_method_with_1_args(lex_entry, GET, $SEMTRANS), result);
	    }
	    return result;
	}
    }

    public static final SubLFile me = new semtrans_lexicon();


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $manufacture_semtrans_assertionsP$ = makeSymbol("*MANUFACTURE-SEMTRANS-ASSERTIONS?*");

    // defparameter
    @LispMethod(comment = "the singleton semtrans lexicon\ndefparameter")
    private static final SubLSymbol $semtrans_lexicon$ = makeSymbol("*SEMTRANS-LEXICON*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $default_verbal_lex_entry_literals$ = makeSymbol("*DEFAULT-VERBAL-LEX-ENTRY-LITERALS*");

    // defparameter
    // What learners should be available by default to semtrans-lexica?
    /**
     * What learners should be available by default to semtrans-lexica?
     */
    @LispMethod(comment = "What learners should be available by default to semtrans-lexica?\ndefparameter")
    public static final SubLSymbol $semtrans_lexicon_learners$ = makeSymbol("*SEMTRANS-LEXICON-LEARNERS*");

    private static final SubLSymbol ABSTRACT_LEXICON = makeSymbol("ABSTRACT-LEXICON");

    static private final SubLList $list2 = list(new SubLObject[] { list(makeSymbol("DEFAULT-KB-SPEC"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell("SemTransLexiconSpecification")),
	    list(makeSymbol("MY-TERM-LEXICON"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), NIL), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-VERBAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-NOMINAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-ADJECTIVAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-ADVERBIAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-VERBAL-SEMTRANS"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-NOMINAL-SEMTRANS"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES"), list(makeSymbol("ENTRY"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESPORATOR-TO-LEX-ENTRIES"), list(makeSymbol("TYPE.STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TERM-LEXICON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TERM-LEXICON"), list(makeSymbol("TERM-LEXICON")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TEXTRACT-LEMMA-TO-LEX-ENTRY"), list(makeSymbol("LEMMA")), makeKeyword("PROTECTED")) });

    static private final SubLList $list7 = list(new SubLObject[] { reader_make_constant_shell("WebSearchDataMt"), reader_make_constant_shell("CyclistsMt"), reader_make_constant_shell("RelationParaphraseMt"), reader_make_constant_shell("WordNetMappingMt"),
	    reader_make_constant_shell("PornographyJargonMt"), reader_make_constant_shell("CommonEnglishMisspellingsMt"), reader_make_constant_shell("ComputereseLexicalMt"), reader_make_constant_shell("CyclishMt"), reader_make_constant_shell("TemporaryLexicalAssertionsMt"),
	    reader_make_constant_shell("EnglishWordSenseAssertions-HoldingMt"), reader_make_constant_shell("TemporaryLexicalAssertions-WordNetImportMt"), reader_make_constant_shell("RedundantLexicalMt"), reader_make_constant_shell("PDATemplateTestMt"),
	    reader_make_constant_shell("EnglishParaphraseMt"), reader_make_constant_shell("SupplementalDeterminerSemTransLexicalMt") });

    private static final SubLObject $const10$AllGeneralEnglishValidatedLexical = reader_make_constant_shell("AllGeneralEnglishValidatedLexicalMicrotheoryPSC");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-CLASS");

    static private final SubLSymbol $sym25$IGNORE_CACHE_ = makeSymbol("IGNORE-CACHE?");

    static private final SubLSymbol $sym27$ALLOW_FABRICATION_ = makeSymbol("ALLOW-FABRICATION?");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-INSTANCE");

    static private final SubLList $list34 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list35 = list(makeString("Initializes this semtrans lexicon"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXCLUDE-PREDICATE")), reader_make_constant_shell("preferredNameString")),
	    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXCLUDE-PREDICATE")), reader_make_constant_shell("denotationPlaceholder")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXCLUDE-PREDICATE")), reader_make_constant_shell("denotationRelatedTo")),
	    list(RET, makeSymbol("SELF")));

    private static final SubLSymbol SEMTRANS_LEXICON_INITIALIZE_METHOD = makeSymbol("SEMTRANS-LEXICON-INITIALIZE-METHOD");

    private static final SubLSymbol GET_TERM_LEXICON = makeSymbol("GET-TERM-LEXICON");

    static private final SubLList $list42 = list(makeString("Returns a term-lexicon that should have the same basic parameters as this semtrans-lexicon"),
	    list(makeSymbol("PUNLESS"), makeSymbol("MY-TERM-LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("MY-TERM-LEXICON"), list(makeSymbol("NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON"), makeSymbol("SELF")))), list(RET, makeSymbol("MY-TERM-LEXICON")));

    static private final SubLSymbol $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");

    private static final SubLSymbol SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD = makeSymbol("SEMTRANS-LEXICON-GET-TERM-LEXICON-METHOD");

    private static final SubLSymbol SEMTRANS_LEXICON_P = makeSymbol("SEMTRANS-LEXICON-P");

    private static final SubLSymbol SET_TERM_LEXICON = makeSymbol("SET-TERM-LEXICON");

    static private final SubLList $list48 = list(makeSymbol("LEXICON"));

    static private final SubLList $list49 = list(list(makeSymbol("CSETQ"), makeSymbol("MY-TERM-LEXICON"), makeSymbol("LEXICON")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");

    private static final SubLSymbol SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD = makeSymbol("SEMTRANS-LEXICON-SET-TERM-LEXICON-METHOD");

    static private final SubLList $list53 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list54 = list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"));

    static private final SubLList $list55 = list(makeString(
	    "@param STRING stringp; the string for which to fabricate some lex entries\n   @param KEYWORDS listp; the syntactic dependents of STRING\n   @param PENN keywordp; the part-of-speech tag of STRING\n   @return listp; a list of lexical entries for word STRING with dependents KEYWORDS \n   and part-of-speech tag PENN"),
	    list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("PENN"), makeSymbol("KEYWORDP")),
	    list(RET,
		    list(makeSymbol("FCOND"), list(list(makeSymbol("CNOT"), makeSymbol("ALLOW-FABRICATION?")), NIL),
			    list(list(makeSymbol("NOMINAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-NOMINAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))),
			    list(list(makeSymbol("VERBAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-VERBAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))),
			    list(list(makeSymbol("ADJECTIVAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-ADJECTIVAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))),
			    list(list(makeSymbol("ADVERBIAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-ADVERBIAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))), list(T, NIL))));

    static private final SubLSymbol $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");

    private static final SubLSymbol FABRICATE_NOMINAL = makeSymbol("FABRICATE-NOMINAL");

    private static final SubLSymbol FABRICATE_VERBAL = makeSymbol("FABRICATE-VERBAL");

    private static final SubLSymbol FABRICATE_ADJECTIVAL = makeSymbol("FABRICATE-ADJECTIVAL");

    private static final SubLSymbol FABRICATE_ADVERBIAL = makeSymbol("FABRICATE-ADVERBIAL");

    private static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-METHOD");

    static private final SubLList $list65 = list(makeString("@param STRING string; the surface string of the lex entry\n   @param KEYWORDS listp; a list of keywords, indicating the noun frame required\n   @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS"),
	    list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-NOMINAL-SEMTRANS")), makeSymbol("STRING"), makeSymbol("KEYWORDS"))),
		    list(RET, list(makeSymbol("LIST"), makeSymbol("LEX")))));

    private static final SubLSymbol FABRICATE_NOMINAL_SEMTRANS = makeSymbol("FABRICATE-NOMINAL-SEMTRANS");

    private static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-NOMINAL-METHOD");

    static private final SubLList $list73 = list(makeSymbol("STRING"), makeSymbol("KEYWORDS"));

    static private final SubLList $list74 = list(list(makeSymbol("CLET"), list(makeSymbol("LITERALS")),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), makeSymbol("KEYWORDS")),
		    list(makeSymbol("PCASE"), makeSymbol("KEYWORD"),
			    list($NOUN, list(makeSymbol("CPUSH"),
				    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN,
					    list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("ThingDescribableAsFn"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("WordFn"), makeSymbol("STRING")), list(QUOTE, list(reader_make_constant_shell("Noun"))))),
				    makeSymbol("LITERALS"))),
			    list(makeKeyword("POSSESSOR"), list(makeSymbol("CPUSH"), list(QUOTE, list(reader_make_constant_shell("possessiveRelation"), makeKeyword("POSSESSOR"), $NOUN)), makeSymbol("LITERALS"))))),
	    list(RET, list(makeSymbol("CONJOIN"), makeSymbol("LITERALS")))));

    static private final SubLList $list79 = list(reader_make_constant_shell("Noun"));

    static private final SubLList $list81 = list(reader_make_constant_shell("possessiveRelation"), makeKeyword("POSSESSOR"), $NOUN);

    private static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-NOMINAL-SEMTRANS-METHOD");

    static private final SubLList $list83 = list(makeString("@param STRING string; the surface string of the lex entry\n   @param KEYWORDS listp; a list of keywords, indicating the verb frame required\n   @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS"),
	    list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), NIL)),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-VERBAL-SEMTRANS")), makeSymbol("STRING"), makeSymbol("KEYWORDS"))),
			    list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
				    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))),
				    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), makeSymbol("SEMTRANS")), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES")))),
		    list(RET, makeSymbol("LEXES"))));

    private static final SubLSymbol FABRICATE_VERBAL_SEMTRANS = makeSymbol("FABRICATE-VERBAL-SEMTRANS");

    private static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-VERBAL-METHOD");

    static private final SubLList $list86 = list(makeString("@return listp; a list of cycl semtrans templates made up from STRING and KEYWORDS"),
	    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQ)),
		    list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANSES"), NIL)),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("ENTRY"), list(makeSymbol("NL-TRIE-SEARCH"), makeSymbol("STRING"), makeSymbol("TRIE"), makeSymbol("CASE-SENSITIVITY"))),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES")), makeSymbol("ENTRY"), makeSymbol("KEYWORDS"))),
					    list(makeSymbol("CPUSH"), makeSymbol("SEMTRANS"), makeSymbol("SEMTRANSES")))),
			    list(makeSymbol("PUNLESS"), makeSymbol("SEMTRANSES"),
				    list(makeSymbol("CLET"),
					    list(makeSymbol("KEYWORD-LITERAL"),
						    list(makeSymbol("LITERALS"), list(makeSymbol("BQ-LIST"),
							    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), makeKeyword("ACTION"),
								    list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("ThingDescribableAsFn"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("WordFn"), makeSymbol("STRING")), list(QUOTE, list(reader_make_constant_shell("Verb")))))))),
					    list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), makeSymbol("KEYWORDS")), list(makeSymbol("CSETQ"), makeSymbol("KEYWORD-LITERAL"), list(makeSymbol("KEYWORD-TO-SEMTRANS-LITERAL"), makeSymbol("KEYWORD"))),
						    list(makeSymbol("PWHEN"), makeSymbol("KEYWORD-LITERAL"), list(makeSymbol("CPUSH"), makeSymbol("KEYWORD-LITERAL"), makeSymbol("LITERALS")))),
					    list(makeSymbol("PWHEN"), makeSymbol("LITERALS"), list(makeSymbol("CPUSH"), list(makeSymbol("CONJOIN"), makeSymbol("LITERALS")), makeSymbol("SEMTRANSES"))))),
			    list(RET, makeSymbol("SEMTRANSES")))));

    static private final SubLSymbol $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");

    private static final SubLSymbol NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES = makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES");

    static private final SubLList $list90 = list(reader_make_constant_shell("Verb"));

    private static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD");

    static private final SubLList $list92 = list(makeSymbol("ENTRY"), makeSymbol("KEYWORDS"));

    static private final SubLList $list93 = list(makeString("@return listp; a list of semtrans templates for nl-trie-entry ENTRY with actor slots \n   for each syntactic relation keyword in KEYWORDS"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANSES"), NIL)),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NL-TRIE-WORD-P"), makeSymbol("ENTRY")), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQ))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("ENTRY"))), list(makeSymbol("CPUSH"), list(makeSymbol("DENOT-TO-VERBAL-SEMTRANS"), makeSymbol("DENOT"), makeSymbol("KEYWORDS")), makeSymbol("SEMTRANSES")))),
		    list(RET, makeSymbol("SEMTRANSES"))));

    private static final SubLSymbol SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD = makeSymbol("SEMTRANS-LEXICON-NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES-METHOD");

    static private final SubLList $list95 = list(reader_make_constant_shell("MtSpace"), reader_make_constant_shell("AllEnglishValidatedLexicalMicrotheoryPSC"), reader_make_constant_shell("AnytimePSC"));

    static private final SubLList $list100 = list(list(makeKeyword("ACTION"), reader_make_constant_shell("isa"), makeKeyword("ACTION"), reader_make_constant_shell("Situation")), list(makeKeyword("SUBJECT"), reader_make_constant_shell("doneBy"), makeKeyword("ACTION"), makeKeyword("SUBJECT")),
	    list(makeKeyword("OBJECT"), reader_make_constant_shell("patient-Generic"), makeKeyword("ACTION"), makeKeyword("OBJECT")), list(makeKeyword("OBLIQUE-OBJECT"), reader_make_constant_shell("to-UnderspecifiedLocation"), makeKeyword("ACTION"), makeKeyword("OBLIQUE-OBJECT")),
	    list(makeKeyword("CLAUSE"), reader_make_constant_shell("awareOfProp"), makeKeyword("SUBJECT"), makeKeyword("CLAUSE")));

    static private final SubLList $list101 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("IGNORE"), makeSymbol("KEYWORDS")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
			    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN,
				    list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("ThingDescribableAsFn"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("WordFn"), makeSymbol("STRING")), list(QUOTE, list(reader_make_constant_shell("Adjective")))))),
		    list(RET, list(makeSymbol("LIST"), makeSymbol("LEX")))));

    static private final SubLList $list102 = list(reader_make_constant_shell("Adjective"));

    private static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-ADJECTIVAL-METHOD");

    static private final SubLList $list104 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("IGNORE"), makeSymbol("KEYWORDS")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
			    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), makeKeyword("ACTION"),
				    list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("ThingDescribableAsFn"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("WordFn"), makeSymbol("STRING")), list(QUOTE, list(reader_make_constant_shell("Adverb")))))),
		    list(RET, list(makeSymbol("LIST"), makeSymbol("LEX")))));

    static private final SubLList $list105 = list(reader_make_constant_shell("Adverb"));

    private static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-ADVERBIAL-METHOD");

    static private final SubLList $list108 = list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY"));

    static private final SubLList $list109 = list(makeString(
	    "@param STRING stringp; a string for which to create a list of lex-entries\n   @param NL-TRIE-ENTRY nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\n   to construct a lexical entry\n   @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY"),
	    list(makeSymbol("PCOND"), list(list(makeSymbol("NL-TRIE-WORD-P"), makeSymbol("NL-TRIE-ENTRY")), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))),
		    list(list(makeSymbol("NL-TRIE-NAME-P"), makeSymbol("NL-TRIE-ENTRY")), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))),
		    list(list(makeSymbol("NL-TRIE-TERM-PHRASES-ENTRY-P"), makeSymbol("NL-TRIE-ENTRY")), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))),
		    list(list(makeSymbol("LEX-ENTRY-P"), makeSymbol("NL-TRIE-ENTRY")), list(RET, list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("NL-TRIE-ENTRY"), list(QUOTE, makeSymbol("COPY"))))))));

    private static final SubLSymbol CREATE_LEX_ENTRIES_NL_TRIE_WORD = makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD");

    private static final SubLSymbol CREATE_LEX_ENTRIES_NL_TRIE_NAME = makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME");

    private static final SubLSymbol CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY = makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY");

    private static final SubLSymbol SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD = makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-METHOD");

    private static final SubLSymbol TEXTRACT_LEMMA_TO_LEX_ENTRY = makeSymbol("TEXTRACT-LEMMA-TO-LEX-ENTRY");

    static private final SubLList $list115 = list(makeSymbol("LEMMA"));

    static private final SubLList $list116 = list(makeString("@param LEMMA textract-lemma-p\n   @return lex-entry-p or nil; the lex entry equivalent of LEMMA,\n   or nil if one can\'t be obtained"),
	    list(makeSymbol("CLET"), list(makeSymbol("CYCL"), makeSymbol("LEX-ENTRY")),
		    list(new SubLObject[] { makeSymbol("PCASE"), list(makeSymbol("TEXTRACT-LEMMA-TYPE"), makeSymbol("LEMMA")),
			    list(makeKeyword("PERSON"),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCL"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(QUOTE, list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Person"))),
						    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))),
			    list(makeKeyword("PERSON?"),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCL"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(QUOTE, list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Person"))),
						    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))),
			    list(makeKeyword("PLACE"),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCL"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(QUOTE, list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Place"))),
						    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))),
			    list(makeKeyword("PLACE?"),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCL"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(QUOTE, list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Place"))),
						    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))),
			    list(makeKeyword("ORG"),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCL"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(QUOTE, list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Organization"))),
						    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))),
			    list(makeKeyword("UNAME"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA"))))),
			    list(makeSymbol("OTHERWISE"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), NIL)) }),
		    list(makeSymbol("PWHEN"), makeSymbol("CYCL"), list(makeSymbol("CSETQ"), makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY")))),
			    list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell("ProperNoun")),
			    list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("LIST"), makeSymbol("CYCL"))),
			    list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
			    list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))),
		    list(RET, makeSymbol("LEX-ENTRY"))));

    static private final SubLList $list119 = list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Person"));

    static private final SubLList $list123 = list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Place"));

    static private final SubLList $list126 = list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Organization"));

    private static final SubLSymbol SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD = makeSymbol("SEMTRANS-LEXICON-TEXTRACT-LEMMA-TO-LEX-ENTRY-METHOD");

    private static final SubLSymbol RESPORATOR_TO_LEX_ENTRIES = makeSymbol("RESPORATOR-TO-LEX-ENTRIES");

    static private final SubLList $list134 = list(makeSymbol("TYPE.STRING"));

    static private final SubLList $list135 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL)),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("PARSE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RESPORATOR-TO-CYCL")), makeSymbol("TYPE.STRING"))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), list(makeSymbol("CDR"), makeSymbol("TYPE.STRING"))),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell("ProperNoun")),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
				    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN, makeSymbol("PARSE")),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("CDR"), makeSymbol("TYPE.STRING"))))),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("ABSTRACT-LEXICON")), list(QUOTE, makeSymbol("RESPORATOR-TO-INFLECTIONS")), makeSymbol("TYPE.STRING"))),
			    list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")))),
	    list(RET, makeSymbol("LEX-ENTRIES"))));

    private static final SubLSymbol RESPORATOR_TO_INFLECTIONS = makeSymbol("RESPORATOR-TO-INFLECTIONS");

    private static final SubLSymbol RESPORATOR_TO_CYCL = makeSymbol("RESPORATOR-TO-CYCL");

    private static final SubLSymbol SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD = makeSymbol("SEMTRANS-LEXICON-RESPORATOR-TO-LEX-ENTRIES-METHOD");

    private static final SubLSymbol RESPORATOR_LEARN = makeSymbol("RESPORATOR-LEARN");

    static private final SubLList $list141 = list(makeSymbol("TEXT"));

    static private final SubLList $list142 = list(makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), NIL)),
		    list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-QUIRK"),
			    list(makeSymbol("CLET"), list(makeSymbol("TYPINGS"), makeSymbol("ERROR?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR?")), list(makeSymbol("CSETQ"), makeSymbol("TYPINGS"), list(makeSymbol("RESPORATOR"), makeSymbol("TEXT")))),
				    list(makeSymbol("PWHEN"), makeSymbol("ERROR?"), list(makeSymbol("WARN"), makeSymbol("ERROR?")), list(RET, NIL)),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE.STRING"), makeSymbol("TYPINGS")),
					    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RESPORATOR-TO-LEX-ENTRIES")), makeSymbol("TYPE.STRING"))), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES")))))),
		    list(RET, makeSymbol("LEXES"))));

    private static final SubLSymbol SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-RESPORATOR-LEARN-METHOD");

    static private final SubLSymbol $sym145$RESPORATOR___LEARN = makeSymbol("RESPORATOR++-LEARN");

    static private final SubLList $list146 = list(makeString(
	    "@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT\n   @note this is a \'lazy\' variation of resporator that attempts to discover\n   shorter strings of type PERSON that exclude additional information like \n   \'French Prime Minister\' from the string \'French Prime Minister Jacques Chirac\'\n   and just returns \'Jacques Chirac\'."),
	    list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), NIL)),
		    list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-QUIRK"),
			    list(makeSymbol("CLET"), list(makeSymbol("TYPINGS"), makeSymbol("ERROR?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR?")), list(makeSymbol("CSETQ"), makeSymbol("TYPINGS"), list(makeSymbol("RESPORATOR++"), makeSymbol("TEXT")))),
				    list(makeSymbol("PWHEN"), makeSymbol("ERROR?"), list(makeSymbol("WARN"), makeSymbol("ERROR?")), list(RET, NIL)),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE.STRING"), makeSymbol("TYPINGS")),
					    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RESPORATOR-TO-LEX-ENTRIES")), makeSymbol("TYPE.STRING"))), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES")))))),
		    list(RET, makeSymbol("LEXES"))));

    static private final SubLSymbol $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-RESPORATOR++-LEARN-METHOD");

    static private final SubLList $list149 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STANFORD-NER-LEARN-INT")), makeSymbol("TEXT"), NIL)));

    private static final SubLSymbol STANFORD_NER_LEARN_INT = makeSymbol("STANFORD-NER-LEARN-INT");

    private static final SubLSymbol SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-STANFORD-NER-LEARN-METHOD");

    private static final SubLSymbol STANFORD_NER_LEARN_TIGHTENED_TYPES = makeSymbol("STANFORD-NER-LEARN-TIGHTENED-TYPES");

    static private final SubLList $list153 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STANFORD-NER-LEARN-INT")), makeSymbol("TEXT"), T)));

    private static final SubLSymbol SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD = makeSymbol("SEMTRANS-LEXICON-STANFORD-NER-LEARN-TIGHTENED-TYPES-METHOD");

    static private final SubLList $list155 = list(makeSymbol("TEXT"), makeSymbol("TIGHTEN-TYPES?"));

    public static final SubLObject $list156 = _constant_156_initializer();

    private static final SubLSymbol TIGHTEN_TYPE = makeSymbol("TIGHTEN-TYPE");

    static private final SubLList $list166 = list(reader_make_constant_shell("pnNonPlural-Generic"));

    static private final SubLString $str168$___S = makeString("~%~S");

    private static final SubLSymbol SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD = makeSymbol("SEMTRANS-LEXICON-STANFORD-NER-LEARN-INT-METHOD");

    static private final SubLList $list171 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NUMBERS"), list(makeSymbol("NUMBER-MEANINGS"), makeSymbol("TEXT"))), list(makeSymbol("RESULT"), NIL)),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("NUMBER"), makeSymbol("NUMBERS")),
		    list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("NUMBER-STRING"), makeSymbol("MEANING")), makeSymbol("NUMBER"),
			    list(makeSymbol("CLET"),
				    list(list(makeSymbol("KNOWN-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeSymbol("NUMBER-STRING"))),
					    list(makeSymbol("ALREADY-KNOWN"), list(makeSymbol("MEMBER?"), makeSymbol("MEANING"), makeSymbol("KNOWN-ENTRIES"), list(QUOTE, EQUAL), list(QUOTE, makeSymbol("LEX-ENTRY-SEMTRANS"))))),
				    list(makeSymbol("PUNLESS"), makeSymbol("ALREADY-KNOWN"), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NUMBER-SEMTRANS-LEX-ENTRY"), makeSymbol("NUMBER-STRING"), makeSymbol("MEANING")))),
					    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("RESULT"))))))),
	    list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list172 = list(makeSymbol("NUMBER-STRING"), makeSymbol("MEANING"));

    private static final SubLSymbol LEX_ENTRY_SEMTRANS = makeSymbol("LEX-ENTRY-SEMTRANS");

    private static final SubLSymbol SEMTRANS_LEXICON_NUMBER_LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-NUMBER-LEARN-METHOD");

    static private final SubLList $list175 = list(makeKeyword("CD"));

    private static final SubLObject $$Number_SP = reader_make_constant_shell("Number-SP");

    static private final SubLList $list177 = list(makeSymbol("STANFORD-NER-LEARN"), makeSymbol("RESPORATOR++-LEARN"), makeSymbol("NUMBER-LEARN"));

    static private final SubLList $list178 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("PRED"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-ENTRY"), NIL))),
	    list(makeSymbol("PCOND"),
		    list(list(makeSymbol("SEMTRANS-PRED?"), makeSymbol("PRED")),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("HL-TO-EL"), list(makeSymbol("NL-TRIE-WORD-SEMTRANS-TEMPLATES"), makeSymbol("NL-TRIE-ENTRY")))), list(new SubLObject[] { makeSymbol("CLET"),
				    list(list(makeSymbol("WU"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("POS"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("NL-TRIE-ENTRY"))),
					    list(makeSymbol("FRAME"), list(makeSymbol("NL-TRIE-WORD-FRAME"), makeSymbol("NL-TRIE-ENTRY"))),
					    list(makeSymbol("INFLECTIONS"),
						    list(makeSymbol("FIF"), makeSymbol("WU"), list(makeSymbol("PPH-FILTER-PREDS"), list(makeSymbol("PREDS-OF-STRING&WORD"), makeSymbol("STRING"), makeSymbol("WU")), list(makeSymbol("PREDS-OF-POS"), makeSymbol("POS"))),
							    list(QUOTE, list(reader_make_constant_shell("singular"), reader_make_constant_shell("plural"))))),
					    list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), makeSymbol("POS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), makeSymbol("SEMTRANS")),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), makeSymbol("FRAME")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("WORD-UNIT"), makeSymbol("WU")),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), makeSymbol("INFLECTIONS")),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) }))),
		    list(list(makeSymbol("CAND"), makeSymbol("*MANUFACTURE-SEMTRANS-ASSERTIONS?*"), list(makeSymbol("MEMBER?"), makeSymbol("PRED"), list(QUOTE, list(reader_make_constant_shell("denotation"), reader_make_constant_shell("multiWordString")))),
			    list(makeSymbol("GENL-POS?"), list(makeSymbol("NL-TRIE-WORD-POS"), makeSymbol("NL-TRIE-ENTRY")), reader_make_constant_shell("Noun"))),
			    list(makeSymbol("WITH-ALL-MTS"),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-ENTRY"))),
					    list(makeSymbol("PUNLESS"), list(makeSymbol("PREDICATE-P"), makeSymbol("DENOT")), list(new SubLObject[] { makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("NL-TRIE-WORD-POS-PREDS"), makeSymbol("NL-TRIE-ENTRY"))),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), list(makeSymbol("NL-TRIE-WORD-POS"), makeSymbol("NL-TRIE-ENTRY"))),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
							    list(makeSymbol("LIST"), list(makeSymbol("FIF"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("DENOT"), reader_make_constant_shell("Collection")), reader_make_constant_shell("isa"), reader_make_constant_shell("equals")),
								    $NOUN, list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("WORD-UNIT"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-ENTRY"), NIL)),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })))))),
	    list(RET, makeSymbol("LEX-ENTRIES"))));

    static private final SubLList $list179 = list(reader_make_constant_shell("singular"), reader_make_constant_shell("plural"));

    static private final SubLList $list182 = list(reader_make_constant_shell("denotation"), reader_make_constant_shell("multiWordString"));

    private static final SubLSymbol SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD = makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD");

    static private final SubLList $list188 = list(
	    makeString("@param STRING stringp; the string of the lex entries to be constructed\n   @param NL-TRIE-ENTRY; the nl trie entry out of which to construct a list of lex entries\n   @return listp; a list of semtrans lex entries for STRING and NL-TRIE-ENTRY"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL)),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-ENTRY"))),
			    list(new SubLObject[] { makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY")))), list(makeSymbol("COLLECTION?"), list(makeSymbol("COLLECTION-P"), makeSymbol("DENOT")))),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
					    list(makeSymbol("LIST"), list(makeSymbol("FIF"), makeSymbol("COLLECTION?"), reader_make_constant_shell("isa"), reader_make_constant_shell("equals")), $NOUN, list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell("ProperNoun")),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(QUOTE, list(reader_make_constant_shell("pnNonPlural-Generic")))),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-ENTRY")),
				    list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })),
		    list(RET, makeSymbol("LEX-ENTRIES"))));

    private static final SubLSymbol SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD = makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-NAME-METHOD");

    static private final SubLList $list190 = list(makeSymbol("STRING"), makeSymbol("TP-ENTRY"));

    static private final SubLList $list191 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("POS"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("TP-ENTRY"))), list(makeSymbol("INFLECTIONS"), list(makeSymbol("NL-TRIE-ENTRY-POS-PREDS"), makeSymbol("TP-ENTRY"))),
		    list(makeSymbol("PREDICATE"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("TP-ENTRY"), NIL)), list(makeSymbol("PRAGMATICS"), list(makeSymbol("NL-TRIE-ENTRY-PRAGMATICS"), makeSymbol("TP-ENTRY")))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("TP-ENTRY"))),
		    list(new SubLObject[] { makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY")))), list(makeSymbol("COLLECTION?"), list(makeSymbol("COLLECTION-P"), makeSymbol("DENOT")))),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("PRAGMATICS"), makeSymbol("PRAGMATICS")),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
				    list(makeSymbol("LIST"), list(makeSymbol("FIF"), makeSymbol("COLLECTION?"), reader_make_constant_shell("isa"), reader_make_constant_shell("equals")), $NOUN, list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("PREDICATE"), makeSymbol("PREDICATE")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), makeSymbol("POS")),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), makeSymbol("INFLECTIONS")),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("TP-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })),
	    list(RET, makeSymbol("LEX-ENTRIES"))));

    static private final SubLSymbol $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME = makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY-METHOD");

    private static final SubLSymbol CREATE_LEX_ENTRIES_NUMBER = makeSymbol("CREATE-LEX-ENTRIES-NUMBER");

    static private final SubLList $list196 = list(makeSymbol("NUMBER-STRING"));

    static private final SubLList $list197 = list(list(makeSymbol("IGNORE"), makeSymbol("NUMBER-STRING")), list(RET, NIL));

    private static final SubLSymbol SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD = makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD");

    private static final SubLSymbol NOUN_COMPOUND_LEARN = makeSymbol("NOUN-COMPOUND-LEARN");

    static private final SubLList $list200 = list(list(RET, list(makeSymbol("TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES"), makeSymbol("TEXT"))));

    private static final SubLSymbol SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-NOUN-COMPOUND-LEARN-METHOD");

    static private final SubLList $list203 = list(reader_make_constant_shell("plural-Generic"));

    static private final SubLList $list204 = list(makeKeyword("NNS"));

    static private final SubLList $list205 = list(makeKeyword("NN"));

    private static final SubLSymbol COOCCURRENCE_STATISTICS_LEARN = makeSymbol("COOCCURRENCE-STATISTICS-LEARN");

    static private final SubLList $list207 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("PARSE"), list(makeSymbol("FIM"), list(makeSymbol("NEW-STANFORD-PARSER")), list(QUOTE, makeSymbol("PARSE")), makeSymbol("TEXT"))),
		    list(makeSymbol("WORDS"), list(makeSymbol("FWHEN"), makeSymbol("PARSE"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("YIELD"))))), list(makeSymbol("LEXES"), NIL), list(makeSymbol("LEARNED-NOUNS"), NIL)),
	    list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-NOUNLEARNER"), list(makeSymbol("CSETQ"), makeSymbol("LEARNED-NOUNS"), list(makeSymbol("LEARN-UNKNOWN-NOUNS-FROM-PARSE-TREE"), makeSymbol("PARSE")))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("LEARNED-NOUN"), makeSymbol("LEARNED-NOUNS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("LEARNED-STRING"), makeSymbol("TYPE"), makeSymbol("RELATIONSHIP"), makeSymbol("CONFIDENCE")), makeSymbol("LEARNED-NOUN"),
		    list(makeSymbol("IGNORE"), makeSymbol("CONFIDENCE")),
		    list(makeSymbol("CLET"), list(list(makeSymbol("PENN-TAGS"), NIL), makeSymbol("PARSED-STRING"), makeSymbol("SINGULARIZED-STRING"), makeSymbol("SEMTRANS")),
			    list(makeSymbol("CSOME"), list(makeSymbol("WORD"), makeSymbol("WORDS"), makeSymbol("PENN-TAGS")), list(makeSymbol("CSETQ"), makeSymbol("PARSED-STRING"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-STRING")))),
				    list(makeSymbol("PWHEN"), makeSymbol("PARSED-STRING"), list(makeSymbol("CSETQ"), makeSymbol("SINGULARIZED-STRING"), list(makeSymbol("SINGULARIZE-WORD"), makeSymbol("PARSED-STRING")))),
				    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("SINGULARIZED-STRING"), makeSymbol("LEARNED-STRING")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-CATEGORY"))), makeSymbol("PENN-TAGS")))),
			    list(makeSymbol("PCASE"), makeSymbol("RELATIONSHIP"), list(makeKeyword("ISA"), list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("equals"), $NOUN, makeSymbol("TYPE")))), list(makeKeyword("GENLS"),
				    list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN, list(makeSymbol("BQ-LIST"), reader_make_constant_shell("SubCollectionNamedFn"), makeSymbol("SINGULARIZED-STRING"), makeSymbol("TYPE")))))),
			    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("PENN-TAGS"), makeSymbol("SEMTRANS")),
				    list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("PARSED-STRING")),
					    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), makeSymbol("PENN-TAGS")),
					    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
					    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), makeSymbol("SEMTRANS")), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES"))))))),
	    list(RET, makeSymbol("LEXES"))));

    static private final SubLList $list210 = list(makeSymbol("LEARNED-STRING"), makeSymbol("TYPE"), makeSymbol("RELATIONSHIP"), makeSymbol("CONFIDENCE"));

    private static final SubLSymbol SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD");

    private static final SubLSymbol INSTANCEFN_CLAUSE = makeSymbol("INSTANCEFN-CLAUSE");

    static private final SubLList $list220 = list(TWO_INTEGER, ZERO_INTEGER);

    private static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell("InstanceNamedFn-Ternary");

    public static final SubLObject new_semtrans_lexicon_alt() {
	return object.new_class_instance(SEMTRANS_LEXICON);
    }

    public static SubLObject new_semtrans_lexicon() {
	return object.new_class_instance(SEMTRANS_LEXICON);
    }

    /**
     *
     *
     * @return semtrans-lexicon-p; the singleton semtrans lexicon
     */
    @LispMethod(comment = "@return semtrans-lexicon-p; the singleton semtrans lexicon")
    public static final SubLObject get_semtrans_lexicon_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == com.cyc.cycjava.cycl.semtrans_lexicon.semtrans_lexicon_p($semtrans_lexicon$.getDynamicValue(thread))) {
		$semtrans_lexicon$.setDynamicValue(com.cyc.cycjava.cycl.semtrans_lexicon.new_semtrans_lexicon(), thread);
	    }
	    return $semtrans_lexicon$.getDynamicValue(thread);
	}
    }

    /**
     *
     *
     * @return semtrans-lexicon-p; the singleton semtrans lexicon
     */
    @LispMethod(comment = "@return semtrans-lexicon-p; the singleton semtrans lexicon")
    public static SubLObject get_semtrans_lexicon() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == semtrans_lexicon_p($semtrans_lexicon$.getDynamicValue(thread))) {
	    $semtrans_lexicon$.setDynamicValue(new_semtrans_lexicon(), thread);
	}
	return $semtrans_lexicon$.getDynamicValue(thread);
    }

    public static final SubLObject get_semtrans_lexicon_my_term_lexicon_alt(SubLObject v_semtrans_lexicon) {
	return classes.subloop_get_access_protected_instance_slot(v_semtrans_lexicon, SIXTEEN_INTEGER, MY_TERM_LEXICON);
    }

    public static SubLObject get_semtrans_lexicon_my_term_lexicon(final SubLObject v_semtrans_lexicon) {
	return classes.subloop_get_access_protected_instance_slot(v_semtrans_lexicon, SIXTEEN_INTEGER, MY_TERM_LEXICON);
    }

    public static final SubLObject set_semtrans_lexicon_my_term_lexicon_alt(SubLObject v_semtrans_lexicon, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(v_semtrans_lexicon, value, SIXTEEN_INTEGER, MY_TERM_LEXICON);
    }

    public static SubLObject set_semtrans_lexicon_my_term_lexicon(final SubLObject v_semtrans_lexicon, final SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(v_semtrans_lexicon, value, SIXTEEN_INTEGER, MY_TERM_LEXICON);
    }

    public static final SubLObject subloop_reserved_initialize_semtrans_lexicon_class_alt(SubLObject new_instance) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	    classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list_alt7);
	    classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
	    classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical);
	    classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
	    return NIL;
	}
    }

    public static SubLObject subloop_reserved_initialize_semtrans_lexicon_class(final SubLObject new_instance) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list7);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_semtrans_lexicon_instance_alt(SubLObject new_instance) {
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
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
	classes.subloop_initialize_slot(new_instance, SEMTRANS_LEXICON, MY_TERM_LEXICON, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_semtrans_lexicon_instance(final SubLObject new_instance) {
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
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
	classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
	classes.subloop_initialize_slot(new_instance, SEMTRANS_LEXICON, MY_TERM_LEXICON, NIL);
	return NIL;
    }

    public static final SubLObject semtrans_lexicon_p_alt(SubLObject v_semtrans_lexicon) {
	return classes.subloop_instanceof_class(v_semtrans_lexicon, SEMTRANS_LEXICON);
    }

    public static SubLObject semtrans_lexicon_p(final SubLObject v_semtrans_lexicon) {
	return classes.subloop_instanceof_class(v_semtrans_lexicon, SEMTRANS_LEXICON);
    }

    /**
     * Initializes this semtrans lexicon
     */
    @LispMethod(comment = "Initializes this semtrans lexicon")
    public static final SubLObject semtrans_lexicon_initialize_method_alt(SubLObject self) {
	abstract_lexicon.abstract_lexicon_initialize_method(self);
	methods.funcall_instance_method_with_1_args(self, EXCLUDE_PREDICATE, $$preferredNameString);
	methods.funcall_instance_method_with_1_args(self, EXCLUDE_PREDICATE, $$denotationPlaceholder);
	methods.funcall_instance_method_with_1_args(self, EXCLUDE_PREDICATE, $$denotationRelatedTo);
	return self;
    }

    /**
     * Initializes this semtrans lexicon
     */
    @LispMethod(comment = "Initializes this semtrans lexicon")
    public static SubLObject semtrans_lexicon_initialize_method(final SubLObject self) {
	abstract_lexicon.abstract_lexicon_initialize_method(self);
	methods.funcall_instance_method_with_1_args(self, EXCLUDE_PREDICATE, $$preferredNameString);
	methods.funcall_instance_method_with_1_args(self, EXCLUDE_PREDICATE, $$denotationPlaceholder);
	methods.funcall_instance_method_with_1_args(self, EXCLUDE_PREDICATE, $$denotationRelatedTo);
	return self;
    }

    /**
     * Returns a term-lexicon that should have the same basic parameters as this semtrans-lexicon
     */
    @LispMethod(comment = "Returns a term-lexicon that should have the same basic parameters as this semtrans-lexicon")
    public static final SubLObject semtrans_lexicon_get_term_lexicon_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_semtrans_lexicon_method = NIL;
	    SubLObject my_term_lexicon = com.cyc.cycjava.cycl.semtrans_lexicon.get_semtrans_lexicon_my_term_lexicon(self);
	    try {
		try {
		    if (NIL == my_term_lexicon) {
			my_term_lexicon = com.cyc.cycjava.cycl.semtrans_lexicon.new_term_lexicon_from_semtrans_lexicon(self);
		    }
		    sublisp_throw($sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, my_term_lexicon);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.semtrans_lexicon.set_semtrans_lexicon_my_term_lexicon(self, my_term_lexicon);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	    }
	    return catch_var_for_semtrans_lexicon_method;
	}
    }

    /**
     * Returns a term-lexicon that should have the same basic parameters as this semtrans-lexicon
     */
    @LispMethod(comment = "Returns a term-lexicon that should have the same basic parameters as this semtrans-lexicon")
    public static SubLObject semtrans_lexicon_get_term_lexicon_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_semtrans_lexicon_method = NIL;
	SubLObject my_term_lexicon = get_semtrans_lexicon_my_term_lexicon(self);
	try {
	    thread.throwStack.push($sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	    try {
		if (NIL == my_term_lexicon) {
		    my_term_lexicon = new_term_lexicon_from_semtrans_lexicon(self);
		}
		sublisp_throw($sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, my_term_lexicon);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_semtrans_lexicon_my_term_lexicon(self, my_term_lexicon);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_semtrans_lexicon_method;
    }

    /**
     *
     *
     * @return a new SEMTRANS-LEXICON-P clone of LEXICON
     */
    @LispMethod(comment = "@return a new SEMTRANS-LEXICON-P clone of LEXICON")
    public static final SubLObject new_term_lexicon_from_semtrans_lexicon_alt(SubLObject lexicon) {
	SubLTrampolineFile.checkType(lexicon, SEMTRANS_LEXICON_P);
	{
	    SubLObject v_term_lexicon = methods.funcall_instance_method_with_1_args(lexicon, COPY, term_lexicon.new_term_lexicon());
	    return v_term_lexicon;
	}
    }

    /**
     *
     *
     * @return a new SEMTRANS-LEXICON-P clone of LEXICON
     */
    @LispMethod(comment = "@return a new SEMTRANS-LEXICON-P clone of LEXICON")
    public static SubLObject new_term_lexicon_from_semtrans_lexicon(final SubLObject lexicon) {
	assert NIL != semtrans_lexicon_p(lexicon) : "! semtrans_lexicon.semtrans_lexicon_p(lexicon) " + ("semtrans_lexicon.semtrans_lexicon_p(lexicon) " + "CommonSymbols.NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon) ") + lexicon;
	final SubLObject v_term_lexicon = methods.funcall_instance_method_with_1_args(lexicon, COPY, term_lexicon.new_term_lexicon());
	return v_term_lexicon;
    }

    public static final SubLObject semtrans_lexicon_set_term_lexicon_method_alt(SubLObject self, SubLObject lexicon) {
	{
	    SubLObject catch_var_for_semtrans_lexicon_method = NIL;
	    SubLObject my_term_lexicon = com.cyc.cycjava.cycl.semtrans_lexicon.get_semtrans_lexicon_my_term_lexicon(self);
	    try {
		try {
		    my_term_lexicon = lexicon;
		    sublisp_throw($sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, self);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.semtrans_lexicon.set_semtrans_lexicon_my_term_lexicon(self, my_term_lexicon);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	    }
	    return catch_var_for_semtrans_lexicon_method;
	}
    }

    public static SubLObject semtrans_lexicon_set_term_lexicon_method(final SubLObject self, final SubLObject lexicon) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_semtrans_lexicon_method = NIL;
	SubLObject my_term_lexicon = get_semtrans_lexicon_my_term_lexicon(self);
	try {
	    thread.throwStack.push($sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	    try {
		my_term_lexicon = lexicon;
		sublisp_throw($sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, self);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_semtrans_lexicon_my_term_lexicon(self, my_term_lexicon);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_semtrans_lexicon_method;
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; the string for which to fabricate some lex entries
     * @param KEYWORDS
     * 		listp; the syntactic dependents of STRING
     * @param PENN
     * 		keywordp; the part-of-speech tag of STRING
     * @return listp; a list of lexical entries for word STRING with dependents KEYWORDS
    and part-of-speech tag PENN
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; the string for which to fabricate some lex entries\r\n@param KEYWORDS\r\n\t\tlistp; the syntactic dependents of STRING\r\n@param PENN\r\n\t\tkeywordp; the part-of-speech tag of STRING\r\n@return listp; a list of lexical entries for word STRING with dependents KEYWORDS\r\nand part-of-speech tag PENN")
    public static final SubLObject semtrans_lexicon_fabricate_method_alt(SubLObject self, SubLObject string, SubLObject keywords, SubLObject penn) {
	{
	    SubLObject catch_var_for_semtrans_lexicon_method = NIL;
	    SubLObject allow_fabricationP = abstract_lexicon.get_abstract_lexicon_allow_fabricationP(self);
	    try {
		try {
		    SubLTrampolineFile.checkType(string, STRINGP);
		    SubLTrampolineFile.checkType(keywords, LISTP);
		    SubLTrampolineFile.checkType(penn, KEYWORDP);
		    sublisp_throw($sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD,
			    NIL == allow_fabricationP ? ((SubLObject) (NIL))
				    : NIL != com.cyc.cycjava.cycl.semtrans_lexicon.nominal_penn_tag(penn) ? ((SubLObject) (methods.funcall_instance_method_with_3_args(self, FABRICATE_NOMINAL, string, keywords, penn)))
					    : NIL != com.cyc.cycjava.cycl.semtrans_lexicon.verbal_penn_tag(penn) ? ((SubLObject) (methods.funcall_instance_method_with_3_args(self, FABRICATE_VERBAL, string, keywords, penn)))
						    : NIL != com.cyc.cycjava.cycl.semtrans_lexicon.adjectival_penn_tag(penn) ? ((SubLObject) (methods.funcall_instance_method_with_3_args(self, FABRICATE_ADJECTIVAL, string, keywords, penn)))
							    : NIL != com.cyc.cycjava.cycl.semtrans_lexicon.adverbial_penn_tag(penn) ? ((SubLObject) (methods.funcall_instance_method_with_3_args(self, FABRICATE_ADVERBIAL, string, keywords, penn))) : NIL);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    abstract_lexicon.set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	    }
	    return catch_var_for_semtrans_lexicon_method;
	}
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; the string for which to fabricate some lex entries
     * @param KEYWORDS
     * 		listp; the syntactic dependents of STRING
     * @param PENN
     * 		keywordp; the part-of-speech tag of STRING
     * @return listp; a list of lexical entries for word STRING with dependents KEYWORDS
    and part-of-speech tag PENN
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; the string for which to fabricate some lex entries\r\n@param KEYWORDS\r\n\t\tlistp; the syntactic dependents of STRING\r\n@param PENN\r\n\t\tkeywordp; the part-of-speech tag of STRING\r\n@return listp; a list of lexical entries for word STRING with dependents KEYWORDS\r\nand part-of-speech tag PENN")
    public static SubLObject semtrans_lexicon_fabricate_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_semtrans_lexicon_method = NIL;
	final SubLObject allow_fabricationP = abstract_lexicon.get_abstract_lexicon_allow_fabricationP(self);
	try {
	    thread.throwStack.push($sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	    try {
		assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
		assert NIL != listp(keywords) : "! listp(keywords) " + ("Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) ") + keywords;
		assert NIL != keywordp(penn) : "! keywordp(penn) " + ("Types.keywordp(penn) " + "CommonSymbols.NIL != Types.keywordp(penn) ") + penn;
		sublisp_throw($sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD,
			NIL == allow_fabricationP ? NIL
				: NIL != nominal_penn_tag(penn) ? methods.funcall_instance_method_with_3_args(self, FABRICATE_NOMINAL, string, keywords, penn)
					: NIL != verbal_penn_tag(penn) ? methods.funcall_instance_method_with_3_args(self, FABRICATE_VERBAL, string, keywords, penn)
						: NIL != adjectival_penn_tag(penn) ? methods.funcall_instance_method_with_3_args(self, FABRICATE_ADJECTIVAL, string, keywords, penn)
							: NIL != adverbial_penn_tag(penn) ? methods.funcall_instance_method_with_3_args(self, FABRICATE_ADVERBIAL, string, keywords, penn) : NIL);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    abstract_lexicon.set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_semtrans_lexicon_method;
    }

    public static final SubLObject nominal_penn_tag_alt(SubLObject tag) {
	return member(tag, abstract_lexicon.$nominal_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static SubLObject nominal_penn_tag(final SubLObject tag) {
	return member(tag, abstract_lexicon.$nominal_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static final SubLObject verbal_penn_tag_alt(SubLObject tag) {
	return member(tag, abstract_lexicon.$verbal_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static SubLObject verbal_penn_tag(final SubLObject tag) {
	return member(tag, abstract_lexicon.$verbal_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static final SubLObject adjectival_penn_tag_alt(SubLObject tag) {
	return member(tag, abstract_lexicon.$adjectival_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static SubLObject adjectival_penn_tag(final SubLObject tag) {
	return member(tag, abstract_lexicon.$adjectival_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static final SubLObject adverbial_penn_tag_alt(SubLObject tag) {
	return member(tag, abstract_lexicon.$adverbial_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static SubLObject adverbial_penn_tag(final SubLObject tag) {
	return member(tag, abstract_lexicon.$adverbial_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    /**
     *
     *
     * @param STRING
     * 		string; the surface string of the lex entry
     * @param KEYWORDS
     * 		listp; a list of keywords, indicating the noun frame required
     * @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the surface string of the lex entry\r\n@param KEYWORDS\r\n\t\tlistp; a list of keywords, indicating the noun frame required\r\n@return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS")
    public static final SubLObject semtrans_lexicon_fabricate_nominal_method_alt(SubLObject self, SubLObject string, SubLObject keywords, SubLObject penn) {
	SubLTrampolineFile.checkType(string, STRINGP);
	SubLTrampolineFile.checkType(keywords, LISTP);
	{
	    SubLObject lex = object.new_class_instance(LEX_ENTRY);
	    methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	    methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
	    methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, methods.funcall_instance_method_with_2_args(self, FABRICATE_NOMINAL_SEMTRANS, string, keywords));
	    return list(lex);
	}
    }

    /**
     *
     *
     * @param STRING
     * 		string; the surface string of the lex entry
     * @param KEYWORDS
     * 		listp; a list of keywords, indicating the noun frame required
     * @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the surface string of the lex entry\r\n@param KEYWORDS\r\n\t\tlistp; a list of keywords, indicating the noun frame required\r\n@return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS")
    public static SubLObject semtrans_lexicon_fabricate_nominal_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
	assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
	assert NIL != listp(keywords) : "! listp(keywords) " + ("Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) ") + keywords;
	final SubLObject lex = object.new_class_instance(LEX_ENTRY);
	methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
	methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, methods.funcall_instance_method_with_2_args(self, FABRICATE_NOMINAL_SEMTRANS, string, keywords));
	return list(lex);
    }

    public static final SubLObject semtrans_lexicon_fabricate_nominal_semtrans_method_alt(SubLObject self, SubLObject string, SubLObject keywords) {
	{
	    SubLObject literals = NIL;
	    SubLObject cdolist_list_var = keywords;
	    SubLObject keyword = NIL;
	    for (keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), keyword = cdolist_list_var.first()) {
		{
		    SubLObject pcase_var = keyword;
		    if (pcase_var.eql($NOUN)) {
			literals = cons(list($$isa, $NOUN, listS($$ThingDescribableAsFn, list($$WordFn, string), $list_alt79)), literals);
		    } else {
			if (pcase_var.eql($POSSESSOR)) {
			    literals = cons($list_alt81, literals);
			}
		    }
		}
	    }
	    return simplifier.conjoin(literals, UNPROVIDED);
	}
    }

    public static SubLObject semtrans_lexicon_fabricate_nominal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords) {
	SubLObject literals = NIL;
	SubLObject cdolist_list_var = keywords;
	SubLObject keyword = NIL;
	keyword = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject pcase_var = keyword;
	    if (pcase_var.eql($NOUN)) {
		literals = cons(list($$isa, $NOUN, listS($$ThingDescribableAsFn, list($$WordFn, string), $list79)), literals);
	    } else if (pcase_var.eql($POSSESSOR)) {
		literals = cons($list81, literals);
	    }

	    cdolist_list_var = cdolist_list_var.rest();
	    keyword = cdolist_list_var.first();
	}
	return simplifier.conjoin(literals, UNPROVIDED);
    }

    /**
     *
     *
     * @param STRING
     * 		string; the surface string of the lex entry
     * @param KEYWORDS
     * 		listp; a list of keywords, indicating the verb frame required
     * @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the surface string of the lex entry\r\n@param KEYWORDS\r\n\t\tlistp; a list of keywords, indicating the verb frame required\r\n@return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS")
    public static final SubLObject semtrans_lexicon_fabricate_verbal_method_alt(SubLObject self, SubLObject string, SubLObject keywords, SubLObject penn) {
	SubLTrampolineFile.checkType(string, STRINGP);
	SubLTrampolineFile.checkType(keywords, LISTP);
	{
	    SubLObject lexes = NIL;
	    SubLObject cdolist_list_var = methods.funcall_instance_method_with_2_args(self, FABRICATE_VERBAL_SEMTRANS, string, keywords);
	    SubLObject semtrans = NIL;
	    for (semtrans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), semtrans = cdolist_list_var.first()) {
		{
		    SubLObject lex = object.new_class_instance(LEX_ENTRY);
		    methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
		    methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
		    methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, semtrans);
		    lexes = cons(lex, lexes);
		}
	    }
	    return lexes;
	}
    }

    /**
     *
     *
     * @param STRING
     * 		string; the surface string of the lex entry
     * @param KEYWORDS
     * 		listp; a list of keywords, indicating the verb frame required
     * @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the surface string of the lex entry\r\n@param KEYWORDS\r\n\t\tlistp; a list of keywords, indicating the verb frame required\r\n@return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS")
    public static SubLObject semtrans_lexicon_fabricate_verbal_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
	assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
	assert NIL != listp(keywords) : "! listp(keywords) " + ("Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) ") + keywords;
	SubLObject lexes = NIL;
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_2_args(self, FABRICATE_VERBAL_SEMTRANS, string, keywords);
	SubLObject semtrans = NIL;
	semtrans = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject lex = object.new_class_instance(LEX_ENTRY);
	    methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	    methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
	    methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, semtrans);
	    lexes = cons(lex, lexes);
	    cdolist_list_var = cdolist_list_var.rest();
	    semtrans = cdolist_list_var.first();
	}
	return lexes;
    }

    /**
     *
     *
     * @return listp; a list of cycl semtrans templates made up from STRING and KEYWORDS
     */
    @LispMethod(comment = "@return listp; a list of cycl semtrans templates made up from STRING and KEYWORDS")
    public static final SubLObject semtrans_lexicon_fabricate_verbal_semtrans_method_alt(SubLObject self, SubLObject string, SubLObject keywords) {
	{
	    SubLObject catch_var_for_semtrans_lexicon_method = NIL;
	    SubLObject case_sensitivity = abstract_lexicon.get_abstract_lexicon_case_sensitivity(self);
	    SubLObject trie = abstract_lexicon.get_abstract_lexicon_trie(self);
	    try {
		try {
		    if (NIL != subl_promotions.memberP($ACTION, keywords, EQ, UNPROVIDED)) {
			{
			    SubLObject semtranses = NIL;
			    {
				SubLObject cdolist_list_var = nl_trie.nl_trie_search(string, trie, case_sensitivity);
				SubLObject entry = NIL;
				for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
				    {
					SubLObject cdolist_list_var_1 = methods.funcall_instance_method_with_2_args(self, NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, entry, keywords);
					SubLObject semtrans = NIL;
					for (semtrans = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest(), semtrans = cdolist_list_var_1.first()) {
					    semtranses = cons(semtrans, semtranses);
					}
				    }
				}
			    }
			    if (NIL == semtranses) {
				{
				    SubLObject keyword_literal = NIL;
				    SubLObject literals = list(list($$isa, $ACTION, listS($$ThingDescribableAsFn, list($$WordFn, string), $list_alt90)));
				    SubLObject cdolist_list_var = keywords;
				    SubLObject keyword = NIL;
				    for (keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), keyword = cdolist_list_var.first()) {
					keyword_literal = com.cyc.cycjava.cycl.semtrans_lexicon.keyword_to_semtrans_literal(keyword, UNPROVIDED);
					if (NIL != keyword_literal) {
					    literals = cons(keyword_literal, literals);
					}
				    }
				    if (NIL != literals) {
					semtranses = cons(simplifier.conjoin(literals, UNPROVIDED), semtranses);
				    }
				}
			    }
			    sublisp_throw($sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, semtranses);
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    abstract_lexicon.set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
			    abstract_lexicon.set_abstract_lexicon_trie(self, trie);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	    }
	    return catch_var_for_semtrans_lexicon_method;
	}
    }

    /**
     *
     *
     * @return listp; a list of cycl semtrans templates made up from STRING and KEYWORDS
     */
    @LispMethod(comment = "@return listp; a list of cycl semtrans templates made up from STRING and KEYWORDS")
    public static SubLObject semtrans_lexicon_fabricate_verbal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_semtrans_lexicon_method = NIL;
	final SubLObject case_sensitivity = abstract_lexicon.get_abstract_lexicon_case_sensitivity(self);
	final SubLObject trie = abstract_lexicon.get_abstract_lexicon_trie(self);
	try {
	    thread.throwStack.push($sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	    try {
		if (NIL != subl_promotions.memberP($ACTION, keywords, EQ, UNPROVIDED)) {
		    SubLObject semtranses = NIL;
		    SubLObject cdolist_list_var = nl_trie.nl_trie_search(string, trie, case_sensitivity);
		    SubLObject entry = NIL;
		    entry = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_2_args(self, NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, entry, keywords);
			SubLObject semtrans = NIL;
			semtrans = cdolist_list_var_$1.first();
			while (NIL != cdolist_list_var_$1) {
			    semtranses = cons(semtrans, semtranses);
			    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
			    semtrans = cdolist_list_var_$1.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		    }
		    if (NIL == semtranses) {
			SubLObject keyword_literal = NIL;
			SubLObject literals = list(list($$isa, $ACTION, listS($$ThingDescribableAsFn, list($$WordFn, string), $list90)));
			SubLObject cdolist_list_var2 = keywords;
			SubLObject keyword = NIL;
			keyword = cdolist_list_var2.first();
			while (NIL != cdolist_list_var2) {
			    keyword_literal = keyword_to_semtrans_literal(keyword, UNPROVIDED);
			    if (NIL != keyword_literal) {
				literals = cons(keyword_literal, literals);
			    }
			    cdolist_list_var2 = cdolist_list_var2.rest();
			    keyword = cdolist_list_var2.first();
			}
			if (NIL != literals) {
			    semtranses = cons(simplifier.conjoin(literals, UNPROVIDED), semtranses);
			}
		    }
		    sublisp_throw($sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, semtranses);
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    abstract_lexicon.set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
		    abstract_lexicon.set_abstract_lexicon_trie(self, trie);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_semtrans_lexicon_method;
    }

    /**
     *
     *
     * @return listp; a list of semtrans templates for nl-trie-entry ENTRY with actor slots
    for each syntactic relation keyword in KEYWORDS
     */
    @LispMethod(comment = "@return listp; a list of semtrans templates for nl-trie-entry ENTRY with actor slots\r\nfor each syntactic relation keyword in KEYWORDS")
    public static final SubLObject semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method_alt(SubLObject self, SubLObject entry, SubLObject keywords) {
	{
	    SubLObject semtranses = NIL;
	    if ((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != member($ACTION, keywords, EQ, UNPROVIDED))) {
		{
		    SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(entry);
		    SubLObject denot = NIL;
		    for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), denot = cdolist_list_var.first()) {
			semtranses = cons(com.cyc.cycjava.cycl.semtrans_lexicon.denot_to_verbal_semtrans(denot, keywords), semtranses);
		    }
		}
	    }
	    return semtranses;
	}
    }

    /**
     *
     *
     * @return listp; a list of semtrans templates for nl-trie-entry ENTRY with actor slots
    for each syntactic relation keyword in KEYWORDS
     */
    @LispMethod(comment = "@return listp; a list of semtrans templates for nl-trie-entry ENTRY with actor slots\r\nfor each syntactic relation keyword in KEYWORDS")
    public static SubLObject semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method(final SubLObject self, final SubLObject entry, final SubLObject keywords) {
	SubLObject semtranses = NIL;
	if ((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != member($ACTION, keywords, EQ, UNPROVIDED))) {
	    SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(entry);
	    SubLObject denot = NIL;
	    denot = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		semtranses = cons(denot_to_verbal_semtrans(denot, keywords), semtranses);
		cdolist_list_var = cdolist_list_var.rest();
		denot = cdolist_list_var.first();
	    }
	}
	return semtranses;
    }

    /**
     *
     *
     * @return el-formula;  a single semtrans template for DENOT with syntactic relations KEYWORDS
     */
    @LispMethod(comment = "@return el-formula;  a single semtrans template for DENOT with syntactic relations KEYWORDS")
    public static final SubLObject denot_to_verbal_semtrans_alt(SubLObject denot, SubLObject keywords) {
	{
	    SubLObject literals = NIL;
	    SubLObject literal = NIL;
	    SubLObject cdolist_list_var = keywords;
	    SubLObject keyword = NIL;
	    for (keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), keyword = cdolist_list_var.first()) {
		literal = com.cyc.cycjava.cycl.semtrans_lexicon.keyword_to_semtrans_literal(keyword, denot);
		if (NIL != literal) {
		    literals = cons(literal, literals);
		}
	    }
	    return simplifier.conjoin(literals, UNPROVIDED);
	}
    }

    /**
     *
     *
     * @return el-formula;  a single semtrans template for DENOT with syntactic relations KEYWORDS
     */
    @LispMethod(comment = "@return el-formula;  a single semtrans template for DENOT with syntactic relations KEYWORDS")
    public static SubLObject denot_to_verbal_semtrans(final SubLObject denot, final SubLObject keywords) {
	SubLObject literals = NIL;
	SubLObject literal = NIL;
	SubLObject cdolist_list_var = keywords;
	SubLObject keyword = NIL;
	keyword = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    literal = keyword_to_semtrans_literal(keyword, denot);
	    if (NIL != literal) {
		literals = cons(literal, literals);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    keyword = cdolist_list_var.first();
	}
	return simplifier.conjoin(literals, UNPROVIDED);
    }

    /**
     *
     *
     * @return el-formula-p; a single literal generated from syntactic role KEYWORD and DENOT
     */
    @LispMethod(comment = "@return el-formula-p; a single literal generated from syntactic role KEYWORD and DENOT")
    public static final SubLObject keyword_to_semtrans_literal_alt(SubLObject keyword, SubLObject denot) {
	if (denot == UNPROVIDED) {
	    denot = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != denot) {
		{
		    SubLObject mt = $list_alt95;
		    SubLObject pcase_var = keyword;
		    if (pcase_var.eql($ACTION)) {
			if (NIL != fort_types_interface.collectionP(denot)) {
			    return list($$isa, $ACTION, denot);
			} else {
			    return list($$equals, $ACTION, denot);
			}
		    } else {
			if (pcase_var.eql($SUBJECT)) {
			    return list(parsing_utilities.known_subject_roles_for_denot(denot, mt, T), $ACTION, $SUBJECT);
			} else {
			    if (pcase_var.eql($OBJECT)) {
				return list(parsing_utilities.known_direct_object_roles_for_denot(denot, mt, T), $ACTION, $OBJECT);
			    } else {
				if (pcase_var.eql($OBLIQUE_OBJECT)) {
				    return list(parsing_utilities.known_indirect_object_roles_for_denot(denot, mt, T), $ACTION, $OBLIQUE_OBJECT);
				} else {
				    return NIL;
				}
			    }
			}
		    }
		}
	    } else {
		return assoc(keyword, $default_verbal_lex_entry_literals$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
	    }
	}
    }

    /**
     *
     *
     * @return el-formula-p; a single literal generated from syntactic role KEYWORD and DENOT
     */
    @LispMethod(comment = "@return el-formula-p; a single literal generated from syntactic role KEYWORD and DENOT")
    public static SubLObject keyword_to_semtrans_literal(final SubLObject keyword, SubLObject denot) {
	if (denot == UNPROVIDED) {
	    denot = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == denot) {
	    return assoc(keyword, $default_verbal_lex_entry_literals$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
	}
	final SubLObject mt = $list95;
	if (keyword.eql($ACTION)) {
	    if (NIL != fort_types_interface.collectionP(denot)) {
		return list($$isa, $ACTION, denot);
	    }
	    return list($$equals, $ACTION, denot);
	} else {
	    if (keyword.eql($SUBJECT)) {
		return list(parsing_utilities.known_subject_roles_for_denot(denot, mt, T), $ACTION, $SUBJECT);
	    }
	    if (keyword.eql($OBJECT)) {
		return list(parsing_utilities.known_direct_object_roles_for_denot(denot, mt, T), $ACTION, $OBJECT);
	    }
	    if (keyword.eql($OBLIQUE_OBJECT)) {
		return list(parsing_utilities.known_indirect_object_roles_for_denot(denot, mt, T), $ACTION, $OBLIQUE_OBJECT);
	    }
	    return NIL;
	}
    }

    public static final SubLObject semtrans_lexicon_fabricate_adjectival_method_alt(SubLObject self, SubLObject string, SubLObject keywords, SubLObject penn) {
	SubLTrampolineFile.checkType(string, STRINGP);
	SubLTrampolineFile.checkType(keywords, LISTP);
	{
	    SubLObject lex = object.new_class_instance(LEX_ENTRY);
	    methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	    methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
	    methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list($$isa, $NOUN, listS($$ThingDescribableAsFn, list($$WordFn, string), $list_alt102)));
	    return list(lex);
	}
    }

    public static SubLObject semtrans_lexicon_fabricate_adjectival_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
	assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
	assert NIL != listp(keywords) : "! listp(keywords) " + ("Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) ") + keywords;
	final SubLObject lex = object.new_class_instance(LEX_ENTRY);
	methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
	methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list($$isa, $NOUN, listS($$ThingDescribableAsFn, list($$WordFn, string), $list102)));
	return list(lex);
    }

    public static final SubLObject semtrans_lexicon_fabricate_adverbial_method_alt(SubLObject self, SubLObject string, SubLObject keywords, SubLObject penn) {
	SubLTrampolineFile.checkType(string, STRINGP);
	SubLTrampolineFile.checkType(keywords, LISTP);
	{
	    SubLObject lex = object.new_class_instance(LEX_ENTRY);
	    methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	    methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
	    methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list($$isa, $ACTION, listS($$ThingDescribableAsFn, list($$WordFn, string), $list_alt105)));
	    return list(lex);
	}
    }

    public static SubLObject semtrans_lexicon_fabricate_adverbial_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
	assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
	assert NIL != listp(keywords) : "! listp(keywords) " + ("Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) ") + keywords;
	final SubLObject lex = object.new_class_instance(LEX_ENTRY);
	methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
	methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list($$isa, $ACTION, listS($$ThingDescribableAsFn, list($$WordFn, string), $list105)));
	return list(lex);
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; a string for which to create a list of lex-entries
     * @param NL-TRIE-ENTRY
     * 		nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which
     * 		to construct a lexical entry
     * @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; a string for which to create a list of lex-entries\r\n@param NL-TRIE-ENTRY\r\n\t\tnl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\r\n\t\tto construct a lexical entry\r\n@return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY")
    public static final SubLObject semtrans_lexicon_create_lex_entries_method_alt(SubLObject self, SubLObject string, SubLObject nl_trie_entry) {
	if (NIL != nl_trie.nl_trie_word_p(nl_trie_entry, UNPROVIDED)) {
	    return methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES_NL_TRIE_WORD, string, nl_trie_entry);
	} else {
	    if (NIL != nl_trie.nl_trie_name_p(nl_trie_entry, UNPROVIDED)) {
		return methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES_NL_TRIE_NAME, string, nl_trie_entry);
	    } else {
		if (NIL != nl_trie.nl_trie_term_phrases_entry_p(nl_trie_entry, UNPROVIDED)) {
		    return methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, string, nl_trie_entry);
		} else {
		    if (NIL != abstract_lexicon.lex_entry_p(nl_trie_entry)) {
			return list(methods.funcall_instance_method_with_0_args(nl_trie_entry, COPY));
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; a string for which to create a list of lex-entries
     * @param NL-TRIE-ENTRY
     * 		nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which
     * 		to construct a lexical entry
     * @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; a string for which to create a list of lex-entries\r\n@param NL-TRIE-ENTRY\r\n\t\tnl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\r\n\t\tto construct a lexical entry\r\n@return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY")
    public static SubLObject semtrans_lexicon_create_lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
	if (NIL != nl_trie.nl_trie_word_p(nl_trie_entry, UNPROVIDED)) {
	    return methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES_NL_TRIE_WORD, string, nl_trie_entry);
	}
	if (NIL != nl_trie.nl_trie_name_p(nl_trie_entry, UNPROVIDED)) {
	    return methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES_NL_TRIE_NAME, string, nl_trie_entry);
	}
	if (NIL != nl_trie.nl_trie_term_phrases_entry_p(nl_trie_entry, UNPROVIDED)) {
	    return methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, string, nl_trie_entry);
	}
	if (NIL != abstract_lexicon.lex_entry_p(nl_trie_entry)) {
	    return list(methods.funcall_instance_method_with_0_args(nl_trie_entry, COPY));
	}
	return NIL;
    }

    /**
     *
     *
     * @param LEMMA
    textract-lemma-p
     * 		
     * @return lex-entry-p or nil; the lex entry equivalent of LEMMA,
    or nil if one can't be obtained
     */
    @LispMethod(comment = "@param LEMMA\ntextract-lemma-p\r\n\t\t\r\n@return lex-entry-p or nil; the lex entry equivalent of LEMMA,\r\nor nil if one can\'t be obtained")
    public static final SubLObject semtrans_lexicon_textract_lemma_to_lex_entry_method_alt(SubLObject self, SubLObject lemma) {
	{
	    SubLObject cycl = NIL;
	    SubLObject lex_entry = NIL;
	    SubLObject pcase_var = abstract_lexicon.textract_lemma_type(lemma);
	    if (pcase_var.eql($PERSON)) {
		cycl = list($$and, $list_alt119, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
	    } else {
		if (pcase_var.eql($PERSON_)) {
		    cycl = list($$and, $list_alt119, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
		} else {
		    if (pcase_var.eql($PLACE)) {
			cycl = list($$and, $list_alt123, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
		    } else {
			if (pcase_var.eql($PLACE_)) {
			    cycl = list($$and, $list_alt123, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
			} else {
			    if (pcase_var.eql($ORG)) {
				cycl = list($$and, $list_alt126, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
			    } else {
				if (pcase_var.eql($UNAME)) {
				    cycl = list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma));
				} else {
				    cycl = NIL;
				}
			    }
			}
		    }
		}
	    }
	    if (NIL != cycl) {
		lex_entry = object.new_class_instance(LEX_ENTRY);
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(cycl));
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, abstract_lexicon.textract_lemma_string(lemma));
	    }
	    return lex_entry;
	}
    }

    /**
     *
     *
     * @param LEMMA
    textract-lemma-p
     * 		
     * @return lex-entry-p or nil; the lex entry equivalent of LEMMA,
    or nil if one can't be obtained
     */
    @LispMethod(comment = "@param LEMMA\ntextract-lemma-p\r\n\t\t\r\n@return lex-entry-p or nil; the lex entry equivalent of LEMMA,\r\nor nil if one can\'t be obtained")
    public static SubLObject semtrans_lexicon_textract_lemma_to_lex_entry_method(final SubLObject self, final SubLObject lemma) {
	SubLObject cycl = NIL;
	SubLObject lex_entry = NIL;
	final SubLObject pcase_var = abstract_lexicon.textract_lemma_type(lemma);
	if (pcase_var.eql($PERSON)) {
	    cycl = list($$and, $list119, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
	} else if (pcase_var.eql($PERSON_)) {
	    cycl = list($$and, $list119, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
	} else if (pcase_var.eql($PLACE)) {
	    cycl = list($$and, $list123, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
	} else if (pcase_var.eql($PLACE_)) {
	    cycl = list($$and, $list123, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
	} else if (pcase_var.eql($ORG)) {
	    cycl = list($$and, $list126, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
	} else if (pcase_var.eql($UNAME)) {
	    cycl = list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma));
	} else {
	    cycl = NIL;
	}

	if (NIL != cycl) {
	    lex_entry = object.new_class_instance(LEX_ENTRY);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(cycl));
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, abstract_lexicon.textract_lemma_string(lemma));
	}
	return lex_entry;
    }

    public static final SubLObject semtrans_lexicon_resporator_to_lex_entries_method_alt(SubLObject self, SubLObject typeXstring) {
	{
	    SubLObject lex_entries = NIL;
	    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, RESPORATOR_TO_CYCL, typeXstring);
	    SubLObject parse = NIL;
	    for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), parse = cdolist_list_var.first()) {
		{
		    SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, typeXstring.rest());
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list($$and, list($$isa, $NOUN, parse), list($$nameString, $NOUN, typeXstring.rest())));
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, methods.funcall_class_method_with_1_args(ABSTRACT_LEXICON, RESPORATOR_TO_INFLECTIONS, typeXstring));
		    lex_entries = cons(lex_entry, lex_entries);
		}
	    }
	    return lex_entries;
	}
    }

    public static SubLObject semtrans_lexicon_resporator_to_lex_entries_method(final SubLObject self, final SubLObject typeXstring) {
	SubLObject lex_entries = NIL;
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, RESPORATOR_TO_CYCL, typeXstring);
	SubLObject parse = NIL;
	parse = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, typeXstring.rest());
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list($$and, list($$isa, $NOUN, parse), list($$nameString, $NOUN, typeXstring.rest())));
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, methods.funcall_class_method_with_1_args(ABSTRACT_LEXICON, RESPORATOR_TO_INFLECTIONS, typeXstring));
	    lex_entries = cons(lex_entry, lex_entries);
	    cdolist_list_var = cdolist_list_var.rest();
	    parse = cdolist_list_var.first();
	}
	return lex_entries;
    }

    /**
     *
     *
     * @param TEXT
     * 		stringp; the text from which to learn lexical entries
     * @return listp; a list of lexical entries learned from TEXT
     */
    @LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@return listp; a list of lexical entries learned from TEXT")
    public static final SubLObject semtrans_lexicon_resporator_learn_method_alt(SubLObject self, SubLObject text) {
	SubLTrampolineFile.checkType(text, STRINGP);
	{
	    SubLObject lexes = NIL;
	    SubLObject typings = NIL;
	    SubLObject errorP = NIL;
	    try {
		{
		    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
		    try {
			bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
			try {
			    typings = external_interfaces.resporator(text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} catch (Throwable catch_var) {
			    Errors.handleThrowable(catch_var, NIL);
			}
		    } finally {
			rebind(Errors.$error_handler$, _prev_bind_0);
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		errorP = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    }
	    if (NIL != errorP) {
		Errors.warn(errorP);
		return NIL;
	    }
	    {
		SubLObject cdolist_list_var = typings;
		SubLObject typeXstring = NIL;
		for (typeXstring = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), typeXstring = cdolist_list_var.first()) {
		    {
			SubLObject cdolist_list_var_2 = methods.funcall_instance_method_with_1_args(self, RESPORATOR_TO_LEX_ENTRIES, typeXstring);
			SubLObject lex = NIL;
			for (lex = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest(), lex = cdolist_list_var_2.first()) {
			    lexes = cons(lex, lexes);
			}
		    }
		}
	    }
	    return lexes;
	}
    }

    /**
     *
     *
     * @param TEXT
     * 		stringp; the text from which to learn lexical entries
     * @return listp; a list of lexical entries learned from TEXT
     */
    @LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@return listp; a list of lexical entries learned from TEXT")
    public static SubLObject semtrans_lexicon_resporator_learn_method(final SubLObject self, final SubLObject text) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != stringp(text) : "! stringp(text) " + ("Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) ") + text;
	SubLObject lexes = NIL;
	SubLObject typings = NIL;
	SubLObject errorP = NIL;
	try {
	    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
	    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
	    try {
		Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		try {
		    typings = external_interfaces.resporator(text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} catch (final Throwable catch_var) {
		    Errors.handleThrowable(catch_var, NIL);
		}
	    } finally {
		Errors.$error_handler$.rebind(_prev_bind_0, thread);
	    }
	} catch (final Throwable ccatch_env_var) {
	    errorP = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	} finally {
	    thread.throwStack.pop();
	}
	if (NIL != errorP) {
	    Errors.warn(errorP);
	    return NIL;
	}
	SubLObject cdolist_list_var = typings;
	SubLObject typeXstring = NIL;
	typeXstring = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_1_args(self, RESPORATOR_TO_LEX_ENTRIES, typeXstring);
	    SubLObject lex = NIL;
	    lex = cdolist_list_var_$2.first();
	    while (NIL != cdolist_list_var_$2) {
		lexes = cons(lex, lexes);
		cdolist_list_var_$2 = cdolist_list_var_$2.rest();
		lex = cdolist_list_var_$2.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    typeXstring = cdolist_list_var.first();
	}
	return lexes;
    }

    /**
     *
     *
     * @param TEXT
     * 		stringp; the text from which to learn lexical entries
     * @return listp; a list of lexical entries learned from TEXT
     * @unknown this is a 'lazy' variation of resporator that attempts to discover
    shorter strings of type PERSON that exclude additional information like
    'French Prime Minister' from the string 'French Prime Minister Jacques Chirac'
    and just returns 'Jacques Chirac'.
     */
    @LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@return listp; a list of lexical entries learned from TEXT\r\n@unknown this is a \'lazy\' variation of resporator that attempts to discover\r\nshorter strings of type PERSON that exclude additional information like\r\n\'French Prime Minister\' from the string \'French Prime Minister Jacques Chirac\'\r\nand just returns \'Jacques Chirac\'.")
    public static final SubLObject semtrans_lexicon_resporatorXX_learn_method_alt(SubLObject self, SubLObject text) {
	SubLTrampolineFile.checkType(text, STRINGP);
	{
	    SubLObject lexes = NIL;
	    SubLObject typings = NIL;
	    SubLObject errorP = NIL;
	    try {
		{
		    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
		    try {
			bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
			try {
			    typings = external_interfaces.resporatorXX(text);
			} catch (Throwable catch_var) {
			    Errors.handleThrowable(catch_var, NIL);
			}
		    } finally {
			rebind(Errors.$error_handler$, _prev_bind_0);
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		errorP = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    }
	    if (NIL != errorP) {
		Errors.warn(errorP);
		return NIL;
	    }
	    {
		SubLObject cdolist_list_var = typings;
		SubLObject typeXstring = NIL;
		for (typeXstring = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), typeXstring = cdolist_list_var.first()) {
		    {
			SubLObject cdolist_list_var_3 = methods.funcall_instance_method_with_1_args(self, RESPORATOR_TO_LEX_ENTRIES, typeXstring);
			SubLObject lex = NIL;
			for (lex = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest(), lex = cdolist_list_var_3.first()) {
			    lexes = cons(lex, lexes);
			}
		    }
		}
	    }
	    return lexes;
	}
    }

    /**
     *
     *
     * @param TEXT
     * 		stringp; the text from which to learn lexical entries
     * @return listp; a list of lexical entries learned from TEXT
     * @unknown this is a 'lazy' variation of resporator that attempts to discover
    shorter strings of type PERSON that exclude additional information like
    'French Prime Minister' from the string 'French Prime Minister Jacques Chirac'
    and just returns 'Jacques Chirac'.
     */
    @LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@return listp; a list of lexical entries learned from TEXT\r\n@unknown this is a \'lazy\' variation of resporator that attempts to discover\r\nshorter strings of type PERSON that exclude additional information like\r\n\'French Prime Minister\' from the string \'French Prime Minister Jacques Chirac\'\r\nand just returns \'Jacques Chirac\'.")
    public static SubLObject semtrans_lexicon_resporatorXX_learn_method(final SubLObject self, final SubLObject text) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != stringp(text) : "! stringp(text) " + ("Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) ") + text;
	SubLObject lexes = NIL;
	SubLObject typings = NIL;
	SubLObject errorP = NIL;
	try {
	    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
	    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
	    try {
		Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		try {
		    typings = external_interfaces.resporatorXX(text);
		} catch (final Throwable catch_var) {
		    Errors.handleThrowable(catch_var, NIL);
		}
	    } finally {
		Errors.$error_handler$.rebind(_prev_bind_0, thread);
	    }
	} catch (final Throwable ccatch_env_var) {
	    errorP = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	} finally {
	    thread.throwStack.pop();
	}
	if (NIL != errorP) {
	    Errors.warn(errorP);
	    return NIL;
	}
	SubLObject cdolist_list_var = typings;
	SubLObject typeXstring = NIL;
	typeXstring = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_1_args(self, RESPORATOR_TO_LEX_ENTRIES, typeXstring);
	    SubLObject lex = NIL;
	    lex = cdolist_list_var_$3.first();
	    while (NIL != cdolist_list_var_$3) {
		lexes = cons(lex, lexes);
		cdolist_list_var_$3 = cdolist_list_var_$3.rest();
		lex = cdolist_list_var_$3.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    typeXstring = cdolist_list_var.first();
	}
	return lexes;
    }

    public static final SubLObject semtrans_lexicon_stanford_ner_learn_method_alt(SubLObject self, SubLObject text) {
	return methods.funcall_instance_method_with_2_args(self, STANFORD_NER_LEARN_INT, text, NIL);
    }

    public static SubLObject semtrans_lexicon_stanford_ner_learn_method(final SubLObject self, final SubLObject text) {
	return methods.funcall_instance_method_with_2_args(self, STANFORD_NER_LEARN_INT, text, NIL);
    }

    public static final SubLObject semtrans_lexicon_stanford_ner_learn_tightened_types_method_alt(SubLObject self, SubLObject text) {
	return methods.funcall_instance_method_with_2_args(self, STANFORD_NER_LEARN_INT, text, T);
    }

    public static SubLObject semtrans_lexicon_stanford_ner_learn_tightened_types_method(final SubLObject self, final SubLObject text) {
	return methods.funcall_instance_method_with_2_args(self, STANFORD_NER_LEARN_INT, text, T);
    }

    /**
     *
     *
     * @param TEXT
     * 		stringp; the text from which to learn lexical entries
     * @return listp; a list of semtrans lexical entries learned from TEXT
     */
    @LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@return listp; a list of semtrans lexical entries learned from TEXT")
    public static final SubLObject semtrans_lexicon_stanford_ner_learn_int_method_alt(SubLObject self, SubLObject text, SubLObject tighten_typesP) {
	SubLTrampolineFile.checkType(text, STRINGP);
	{
	    SubLObject new_lexes = NIL;
	    SubLObject sner = object.new_class_instance(STANFORD_NER);
	    SubLObject entity_clusters = methods.funcall_instance_method_with_1_args(sner, RUN, text);
	    SubLObject v_term_lexicon = methods.funcall_instance_method_with_0_args(self, GET_TERM_LEXICON);
	    SubLObject error = NIL;
	    try {
		{
		    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
		    try {
			bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
			try {
			    {
				SubLObject cdolist_list_var = entity_clusters;
				SubLObject ec = NIL;
				for (ec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ec = cdolist_list_var.first()) {
				    {
					SubLObject cdolist_list_var_4 = ec;
					SubLObject nament = NIL;
					for (nament = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest(), nament = cdolist_list_var_4.first()) {
					    methods.funcall_instance_method_with_1_args(nament, SET_LEXICON, v_term_lexicon);
					    if (!O.eql(methods.funcall_instance_method_with_0_args(nament, GET_TYPE))) {
						{
						    SubLObject type = methods.funcall_instance_method_with_0_args(nament, GET_CYC);
						    SubLObject subtypes = ((NIL != tighten_typesP) && (NIL != type)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(nament, TIGHTEN_TYPE).first())) : NIL;
						    SubLObject instance_meanings = named_entity_recognizer.get_nament_instance_meaning(nament);
						    SubLObject string = methods.funcall_instance_method_with_0_args(nament, GET_STRING);
						    SubLObject existing_entries = methods.funcall_instance_method_with_1_args(v_term_lexicon, GET, string);
						    SubLObject entity_lexes = NIL;
						    if (NIL != instance_meanings) {
							{
							    SubLObject cdolist_list_var_5 = instance_meanings;
							    SubLObject instance_meaning = NIL;
							    for (instance_meaning = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest(), instance_meaning = cdolist_list_var_5.first()) {
								{
								    SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
								    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
								    methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list($$equals, $NOUN, instance_meaning));
								    methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
								    methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list_alt166);
								    if (NIL == com.cyc.cycjava.cycl.semtrans_lexicon.contains_semtrans_lexicon_usable_entryP(existing_entries)) {
									methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
									entity_lexes = cons(lex_entry, entity_lexes);
								    }
								}
							    }
							}
						    } else {
							{
							    SubLObject cdolist_list_var_6 = subtypes;
							    SubLObject subtype = NIL;
							    for (subtype = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest(), subtype = cdolist_list_var_6.first()) {
								{
								    SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
								    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
								    methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list($$and, list($$isa, $NOUN, subtype), list($$nameString, $NOUN, string)));
								    methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
								    methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list_alt166);
								    if (NIL == com.cyc.cycjava.cycl.semtrans_lexicon.contains_semtrans_lexicon_usable_entryP(existing_entries)) {
									methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
									entity_lexes = cons(lex_entry, entity_lexes);
								    }
								}
							    }
							}
						    }
						    if (!((NIL != entity_lexes) || (NIL == type))) {
							{
							    SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
							    SubLObject existing_entries_7 = methods.funcall_instance_method_with_1_args(v_term_lexicon, GET, string);
							    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
							    methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list($$and, list($$isa, $NOUN, type), list($$nameString, $NOUN, string)));
							    methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
							    methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list_alt166);
							    if (NIL == com.cyc.cycjava.cycl.semtrans_lexicon.contains_semtrans_lexicon_usable_entryP(existing_entries_7)) {
								methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
								entity_lexes = cons(lex_entry, entity_lexes);
							    }
							}
						    }
						    {
							SubLObject items_var = entity_lexes;
							if (items_var.isVector()) {
							    {
								SubLObject vector_var = entity_lexes;
								SubLObject backwardP_var = NIL;
								SubLObject length = length(vector_var);
								SubLObject v_iteration = NIL;
								for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
								    {
									SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
									SubLObject item = aref(vector_var, element_num);
									new_lexes = cons(item, new_lexes);
								    }
								}
							    }
							} else {
							    {
								SubLObject cdolist_list_var_8 = entity_lexes;
								SubLObject item = NIL;
								for (item = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest(), item = cdolist_list_var_8.first()) {
								    new_lexes = cons(item, new_lexes);
								}
							    }
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
			rebind(Errors.$error_handler$, _prev_bind_0);
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
	    }
	    if (NIL != error) {
		Errors.warn($str_alt168$___S, error);
	    }
	    return new_lexes;
	}
    }

    /**
     *
     *
     * @param TEXT
     * 		stringp; the text from which to learn lexical entries
     * @return listp; a list of semtrans lexical entries learned from TEXT
     */
    @LispMethod(comment = "@param TEXT\r\n\t\tstringp; the text from which to learn lexical entries\r\n@return listp; a list of semtrans lexical entries learned from TEXT")
    public static SubLObject semtrans_lexicon_stanford_ner_learn_int_method(final SubLObject self, final SubLObject text, final SubLObject tighten_typesP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != stringp(text) : "! stringp(text) " + ("Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) ") + text;
	SubLObject new_lexes = NIL;
	final SubLObject sner = object.new_class_instance(STANFORD_NER);
	final SubLObject entity_clusters = methods.funcall_instance_method_with_1_args(sner, RUN, text);
	final SubLObject v_term_lexicon = methods.funcall_instance_method_with_0_args(self, GET_TERM_LEXICON);
	SubLObject error = NIL;
	try {
	    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
	    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
	    try {
		Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
		try {
		    SubLObject cdolist_list_var = entity_clusters;
		    SubLObject ec = NIL;
		    ec = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$4 = ec;
			SubLObject nament = NIL;
			nament = cdolist_list_var_$4.first();
			while (NIL != cdolist_list_var_$4) {
			    methods.funcall_instance_method_with_1_args(nament, SET_LEXICON, v_term_lexicon);
			    if (!O.eql(methods.funcall_instance_method_with_0_args(nament, GET_TYPE))) {
				final SubLObject type = methods.funcall_instance_method_with_0_args(nament, GET_CYC);
				final SubLObject subtypes = ((NIL != tighten_typesP) && (NIL != type)) ? methods.funcall_instance_method_with_0_args(nament, TIGHTEN_TYPE).first() : NIL;
				final SubLObject instance_meanings = named_entity_recognizer.get_nament_instance_meaning(nament);
				final SubLObject string = methods.funcall_instance_method_with_0_args(nament, GET_STRING);
				final SubLObject existing_entries = methods.funcall_instance_method_with_1_args(v_term_lexicon, GET, string);
				SubLObject entity_lexes = NIL;
				if (NIL != instance_meanings) {
				    SubLObject cdolist_list_var_$5 = instance_meanings;
				    SubLObject instance_meaning = NIL;
				    instance_meaning = cdolist_list_var_$5.first();
				    while (NIL != cdolist_list_var_$5) {
					final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
					methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
					methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list($$equals, $NOUN, instance_meaning));
					methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
					methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list166);
					if (NIL == contains_semtrans_lexicon_usable_entryP(existing_entries)) {
					    methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
					    entity_lexes = cons(lex_entry, entity_lexes);
					}
					cdolist_list_var_$5 = cdolist_list_var_$5.rest();
					instance_meaning = cdolist_list_var_$5.first();
				    }
				} else {
				    SubLObject cdolist_list_var_$6 = subtypes;
				    SubLObject subtype = NIL;
				    subtype = cdolist_list_var_$6.first();
				    while (NIL != cdolist_list_var_$6) {
					final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
					methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
					methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list($$and, list($$isa, $NOUN, subtype), list($$nameString, $NOUN, string)));
					methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
					methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list166);
					if (NIL == contains_semtrans_lexicon_usable_entryP(existing_entries)) {
					    methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
					    entity_lexes = cons(lex_entry, entity_lexes);
					}
					cdolist_list_var_$6 = cdolist_list_var_$6.rest();
					subtype = cdolist_list_var_$6.first();
				    }
				}
				if ((NIL == entity_lexes) && (NIL != type)) {
				    final SubLObject lex_entry2 = object.new_class_instance(LEX_ENTRY);
				    final SubLObject existing_entries_$7 = methods.funcall_instance_method_with_1_args(v_term_lexicon, GET, string);
				    methods.funcall_instance_method_with_2_args(lex_entry2, SET, $STRING, string);
				    methods.funcall_instance_method_with_2_args(lex_entry2, SET, $SEMTRANS, list($$and, list($$isa, $NOUN, type), list($$nameString, $NOUN, string)));
				    methods.funcall_instance_method_with_2_args(lex_entry2, SET, $FRAME, $$RegularNounFrame);
				    methods.funcall_instance_method_with_2_args(lex_entry2, SET, $INFLECTIONS, $list166);
				    if (NIL == contains_semtrans_lexicon_usable_entryP(existing_entries_$7)) {
					methods.funcall_instance_method_with_1_args(self, ADD, lex_entry2);
					entity_lexes = cons(lex_entry2, entity_lexes);
				    }
				}
				final SubLObject items_var = entity_lexes;
				if (items_var.isVector()) {
				    final SubLObject vector_var = items_var;
				    final SubLObject backwardP_var = NIL;
				    SubLObject length;
				    SubLObject v_iteration;
				    SubLObject element_num;
				    SubLObject item;
				    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
					element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
					item = aref(vector_var, element_num);
					new_lexes = cons(item, new_lexes);
				    }
				} else {
				    SubLObject cdolist_list_var_$7 = items_var;
				    SubLObject item2 = NIL;
				    item2 = cdolist_list_var_$7.first();
				    while (NIL != cdolist_list_var_$7) {
					new_lexes = cons(item2, new_lexes);
					cdolist_list_var_$7 = cdolist_list_var_$7.rest();
					item2 = cdolist_list_var_$7.first();
				    }
				}
			    }
			    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
			    nament = cdolist_list_var_$4.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			ec = cdolist_list_var.first();
		    }
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
	    Errors.warn($str168$___S, error);
	}
	return new_lexes;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[] { list(makeSymbol("DEFAULT-KB-SPEC"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell("SemTransLexiconSpecification")),
	    list(makeSymbol("MY-TERM-LEXICON"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), NIL), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-VERBAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-NOMINAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-ADJECTIVAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-ADVERBIAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-VERBAL-SEMTRANS"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-NOMINAL-SEMTRANS"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES"), list(makeSymbol("ENTRY"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESPORATOR-TO-LEX-ENTRIES"), list(makeSymbol("TYPE.STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TERM-LEXICON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TERM-LEXICON"), list(makeSymbol("TERM-LEXICON")), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TEXTRACT-LEMMA-TO-LEX-ENTRY"), list(makeSymbol("LEMMA")), makeKeyword("PROTECTED")) });

    public static final SubLObject contains_semtrans_lexicon_usable_entryP_alt(SubLObject lex_entries) {
	{
	    SubLObject usableP = NIL;
	    if (NIL == usableP) {
		{
		    SubLObject csome_list_var = lex_entries;
		    SubLObject entry = NIL;
		    for (entry = csome_list_var.first(); !((NIL != usableP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), entry = csome_list_var.first()) {
			if (NIL == abstract_lexicon.lex_entry_p(abstract_lexicon.lex_entry_trie_entry(entry))) {
			    usableP = T;
			} else {
			    if ((NIL != abstract_lexicon.lex_entry_p(entry)) && (NIL != abstract_lexicon.lex_entry_semtrans(entry))) {
				usableP = T;
			    } else {
				usableP = NIL;
			    }
			}
		    }
		}
	    }
	    return usableP;
	}
    }

    public static SubLObject contains_semtrans_lexicon_usable_entryP(final SubLObject lex_entries) {
	SubLObject usableP = NIL;
	if (NIL == usableP) {
	    SubLObject csome_list_var = lex_entries;
	    SubLObject entry = NIL;
	    entry = csome_list_var.first();
	    while ((NIL == usableP) && (NIL != csome_list_var)) {
		if (NIL == abstract_lexicon.lex_entry_p(abstract_lexicon.lex_entry_trie_entry(entry))) {
		    usableP = T;
		} else if ((NIL != abstract_lexicon.lex_entry_p(entry)) && (NIL != abstract_lexicon.lex_entry_semtrans(entry))) {
		    usableP = T;
		} else {
		    usableP = NIL;
		}

		csome_list_var = csome_list_var.rest();
		entry = csome_list_var.first();
	    }
	}
	return usableP;
    }

    public static final SubLObject semtrans_lexicon_number_learn_method_alt(SubLObject self, SubLObject text) {
	{
	    SubLObject numbers = abstract_lexicon.number_meanings(text);
	    SubLObject result = NIL;
	    SubLObject cdolist_list_var = numbers;
	    SubLObject number = NIL;
	    for (number = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), number = cdolist_list_var.first()) {
		{
		    SubLObject datum = number;
		    SubLObject current = datum;
		    SubLObject number_string = NIL;
		    SubLObject meaning = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt172);
		    number_string = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt172);
		    meaning = current.first();
		    current = current.rest();
		    if (NIL == current) {
			{
			    SubLObject known_entries = methods.funcall_instance_method_with_1_args(self, GET, number_string);
			    SubLObject already_known = subl_promotions.memberP(meaning, known_entries, EQUAL, LEX_ENTRY_SEMTRANS);
			    if (NIL == already_known) {
				{
				    SubLObject lex_entry = com.cyc.cycjava.cycl.semtrans_lexicon.number_semtrans_lex_entry(number_string, meaning);
				    methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
				    result = cons(lex_entry, result);
				}
			    }
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt172);
		    }
		}
	    }
	    return result;
	}
    }

    public static SubLObject semtrans_lexicon_number_learn_method(final SubLObject self, final SubLObject text) {
	final SubLObject numbers = abstract_lexicon.number_meanings(text);
	SubLObject result = NIL;
	SubLObject cdolist_list_var = numbers;
	SubLObject number = NIL;
	number = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject current;
	    final SubLObject datum = current = number;
	    SubLObject number_string = NIL;
	    SubLObject meaning = NIL;
	    destructuring_bind_must_consp(current, datum, $list172);
	    number_string = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list172);
	    meaning = current.first();
	    current = current.rest();
	    if (NIL == current) {
		final SubLObject known_entries = methods.funcall_instance_method_with_1_args(self, GET, number_string);
		final SubLObject already_known = subl_promotions.memberP(meaning, known_entries, EQUAL, LEX_ENTRY_SEMTRANS);
		if (NIL == already_known) {
		    final SubLObject lex_entry = number_semtrans_lex_entry(number_string, meaning);
		    methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
		    result = cons(lex_entry, result);
		}
	    } else {
		cdestructuring_bind_error(datum, $list172);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    number = cdolist_list_var.first();
	}
	return result;
    }

    static private final SubLList $list_alt7 = list(new SubLObject[] { reader_make_constant_shell("WebSearchDataMt"), reader_make_constant_shell("CyclistsMt"), reader_make_constant_shell("RelationParaphraseMt"), reader_make_constant_shell("WordNetMappingMt"),
	    reader_make_constant_shell("PornographyJargonMt"), reader_make_constant_shell("CommonEnglishMisspellingsMt"), reader_make_constant_shell("ComputereseLexicalMt"), reader_make_constant_shell("CyclishMt"), reader_make_constant_shell("TemporaryLexicalAssertionsMt"),
	    reader_make_constant_shell("EnglishWordSenseAssertions-HoldingMt"), reader_make_constant_shell("TemporaryLexicalAssertions-WordNetImportMt"), reader_make_constant_shell("RedundantLexicalMt"), reader_make_constant_shell("PDATemplateTestMt"),
	    reader_make_constant_shell("EnglishParaphraseMt"), reader_make_constant_shell("SupplementalDeterminerSemTransLexicalMt") });

    public static final SubLObject number_semtrans_lex_entry_alt(SubLObject string, SubLObject number) {
	{
	    SubLObject lex = object.new_class_instance(LEX_ENTRY);
	    methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	    methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, $list_alt175);
	    methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Number_SP);
	    methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list($$equals, $NOUN, number));
	    return lex;
	}
    }

    public static SubLObject number_semtrans_lex_entry(final SubLObject string, final SubLObject number) {
	final SubLObject lex = object.new_class_instance(LEX_ENTRY);
	methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, $list175);
	methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Number_SP);
	methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list($$equals, $NOUN, number));
	return lex;
    }

    public static final SubLObject semtrans_lexicon_create_lex_entries_nl_trie_word_method_alt(SubLObject self, SubLObject string, SubLObject nl_trie_entry) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject lex_entries = NIL;
		SubLObject pred = nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, NIL);
		if (NIL != lexicon_vars.semtrans_predP(pred)) {
		    {
			SubLObject cdolist_list_var = cycl_utilities.hl_to_el(nl_trie.nl_trie_word_semtrans_templates(nl_trie_entry));
			SubLObject semtrans = NIL;
			for (semtrans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), semtrans = cdolist_list_var.first()) {
			    {
				SubLObject wu = nl_trie.nl_trie_word_word_unit(nl_trie_entry, UNPROVIDED);
				SubLObject pos = nl_trie.nl_trie_entry_pos(nl_trie_entry);
				SubLObject frame = nl_trie.nl_trie_word_frame(nl_trie_entry);
				SubLObject inflections = (NIL != wu) ? ((SubLObject) (intersection(lexicon_accessors.preds_of_stringXword(string, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon_utilities.preds_of_pos(pos, UNPROVIDED), UNPROVIDED, UNPROVIDED))) : $list_alt179;
				SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
				methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, pos);
				methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, semtrans);
				methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, frame);
				methods.funcall_instance_method_with_2_args(lex_entry, SET, $WORD_UNIT, wu);
				methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
				methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, inflections);
				methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, nl_trie_entry);
				lex_entries = cons(lex_entry, lex_entries);
			    }
			}
		    }
		} else {
		    if ((NIL != subl_promotions.memberP(pred, $list_alt182, UNPROVIDED, UNPROVIDED)) && (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(nl_trie_entry), $$Noun, UNPROVIDED))) {
			{
			    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
			    try {
				mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
				mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
				{
				    SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(nl_trie_entry);
				    SubLObject denot = NIL;
				    for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), denot = cdolist_list_var.first()) {
					if (NIL == fort_types_interface.predicate_p(denot)) {
					    {
						SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
						methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, nl_trie.nl_trie_word_pos_preds(nl_trie_entry));
						methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, nl_trie.nl_trie_word_pos(nl_trie_entry));
						methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(NIL != isa.isa_in_any_mtP(denot, $$Collection) ? ((SubLObject) ($$isa)) : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
						methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
						methods.funcall_instance_method_with_2_args(lex_entry, SET, $WORD_UNIT, nl_trie.nl_trie_word_word_unit(nl_trie_entry, NIL));
						methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
						methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, nl_trie_entry);
						lex_entries = cons(lex_entry, lex_entries);
					    }
					}
				    }
				}
			    } finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
		return lex_entries;
	    }
	}
    }

    public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_word_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject lex_entries = NIL;
	final SubLObject pred = nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, NIL);
	if (NIL != lexicon_vars.semtrans_predP(pred)) {
	    SubLObject cdolist_list_var = cycl_utilities.hl_to_el(nl_trie.nl_trie_word_semtrans_templates(nl_trie_entry));
	    SubLObject semtrans = NIL;
	    semtrans = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		final SubLObject wu = nl_trie.nl_trie_word_word_unit(nl_trie_entry, UNPROVIDED);
		final SubLObject pos = nl_trie.nl_trie_entry_pos(nl_trie_entry);
		final SubLObject frame = nl_trie.nl_trie_word_frame(nl_trie_entry);
		final SubLObject inflections = (NIL != wu) ? pph_utilities.pph_filter_preds(lexicon_accessors.preds_of_stringXword(string, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon_utilities.preds_of_pos(pos, UNPROVIDED), UNPROVIDED) : $list179;
		final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, pos);
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, semtrans);
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, frame);
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $WORD_UNIT, wu);
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, inflections);
		methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, nl_trie_entry);
		lex_entries = cons(lex_entry, lex_entries);
		cdolist_list_var = cdolist_list_var.rest();
		semtrans = cdolist_list_var.first();
	    }
	} else if (((NIL != $manufacture_semtrans_assertionsP$.getDynamicValue(thread)) && (NIL != subl_promotions.memberP(pred, $list182, UNPROVIDED, UNPROVIDED))) && (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(nl_trie_entry), $$Noun, UNPROVIDED))) {
	    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
	    try {
		mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
		mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
		SubLObject cdolist_list_var2 = nl_trie.nl_trie_entry_denots(nl_trie_entry);
		SubLObject denot = NIL;
		denot = cdolist_list_var2.first();
		while (NIL != cdolist_list_var2) {
		    if (NIL == fort_types_interface.predicate_p(denot)) {
			final SubLObject lex_entry2 = object.new_class_instance(LEX_ENTRY);
			methods.funcall_instance_method_with_2_args(lex_entry2, SET, $INFLECTIONS, nl_trie.nl_trie_word_pos_preds(nl_trie_entry));
			methods.funcall_instance_method_with_2_args(lex_entry2, SET, $CYC_POS, nl_trie.nl_trie_word_pos(nl_trie_entry));
			methods.funcall_instance_method_with_2_args(lex_entry2, SET, $SEMTRANS, list(NIL != isa.isa_in_any_mtP(denot, $$Collection) ? $$isa : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
			methods.funcall_instance_method_with_2_args(lex_entry2, SET, $FRAME, $$RegularNounFrame);
			methods.funcall_instance_method_with_2_args(lex_entry2, SET, $WORD_UNIT, nl_trie.nl_trie_word_word_unit(nl_trie_entry, NIL));
			methods.funcall_instance_method_with_2_args(lex_entry2, SET, $STRING, string);
			methods.funcall_instance_method_with_2_args(lex_entry2, SET, $TRIE_ENTRY, nl_trie_entry);
			lex_entries = cons(lex_entry2, lex_entries);
		    }
		    cdolist_list_var2 = cdolist_list_var2.rest();
		    denot = cdolist_list_var2.first();
		}
	    } finally {
		mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
		mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
	    }
	}

	return lex_entries;
    }

    static private final SubLList $list_alt34 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt35 = list(makeString("Initializes this semtrans lexicon"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXCLUDE-PREDICATE")), reader_make_constant_shell("preferredNameString")),
	    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXCLUDE-PREDICATE")), reader_make_constant_shell("denotationPlaceholder")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EXCLUDE-PREDICATE")), reader_make_constant_shell("denotationRelatedTo")),
	    list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt42 = list(makeString("Returns a term-lexicon that should have the same basic parameters as this semtrans-lexicon"),
	    list(makeSymbol("PUNLESS"), makeSymbol("MY-TERM-LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("MY-TERM-LEXICON"), list(makeSymbol("NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON"), makeSymbol("SELF")))), list(RET, makeSymbol("MY-TERM-LEXICON")));

    static private final SubLList $list_alt48 = list(makeSymbol("LEXICON"));

    static private final SubLList $list_alt49 = list(list(makeSymbol("CSETQ"), makeSymbol("MY-TERM-LEXICON"), makeSymbol("LEXICON")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt53 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt54 = list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"));

    static private final SubLList $list_alt55 = list(makeString(
	    "@param STRING stringp; the string for which to fabricate some lex entries\n   @param KEYWORDS listp; the syntactic dependents of STRING\n   @param PENN keywordp; the part-of-speech tag of STRING\n   @return listp; a list of lexical entries for word STRING with dependents KEYWORDS \n   and part-of-speech tag PENN"),
	    list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("PENN"), makeSymbol("KEYWORDP")),
	    list(RET,
		    list(makeSymbol("FCOND"), list(list(makeSymbol("CNOT"), makeSymbol("ALLOW-FABRICATION?")), NIL),
			    list(list(makeSymbol("NOMINAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-NOMINAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))),
			    list(list(makeSymbol("VERBAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-VERBAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))),
			    list(list(makeSymbol("ADJECTIVAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-ADJECTIVAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))),
			    list(list(makeSymbol("ADVERBIAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-ADVERBIAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))), list(T, NIL))));

    /**
     *
     *
     * @param STRING
     * 		stringp; the string of the lex entries to be constructed
     * @param NL-TRIE-ENTRY;
     * 		the nl trie entry out of which to construct a list of lex entries
     * @return listp; a list of semtrans lex entries for STRING and NL-TRIE-ENTRY
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; the string of the lex entries to be constructed\r\n@param NL-TRIE-ENTRY;\r\n\t\tthe nl trie entry out of which to construct a list of lex entries\r\n@return listp; a list of semtrans lex entries for STRING and NL-TRIE-ENTRY")
    public static final SubLObject semtrans_lexicon_create_lex_entries_nl_trie_name_method_alt(SubLObject self, SubLObject string, SubLObject nl_trie_entry) {
	{
	    SubLObject lex_entries = NIL;
	    SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(nl_trie_entry);
	    SubLObject denot = NIL;
	    for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), denot = cdolist_list_var.first()) {
		{
		    SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
		    SubLObject collectionP = fort_types_interface.collection_p(denot);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(NIL != collectionP ? ((SubLObject) ($$isa)) : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list_alt166);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, nl_trie_entry);
		    lex_entries = cons(lex_entry, lex_entries);
		}
	    }
	    return lex_entries;
	}
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; the string of the lex entries to be constructed
     * @param NL-TRIE-ENTRY;
     * 		the nl trie entry out of which to construct a list of lex entries
     * @return listp; a list of semtrans lex entries for STRING and NL-TRIE-ENTRY
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; the string of the lex entries to be constructed\r\n@param NL-TRIE-ENTRY;\r\n\t\tthe nl trie entry out of which to construct a list of lex entries\r\n@return listp; a list of semtrans lex entries for STRING and NL-TRIE-ENTRY")
    public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_name_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
	SubLObject lex_entries = NIL;
	SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(nl_trie_entry);
	SubLObject denot = NIL;
	denot = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
	    final SubLObject collectionP = fort_types_interface.collection_p(denot);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(NIL != collectionP ? $$isa : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list166);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, nl_trie_entry);
	    lex_entries = cons(lex_entry, lex_entries);
	    cdolist_list_var = cdolist_list_var.rest();
	    denot = cdolist_list_var.first();
	}
	return lex_entries;
    }

    static private final SubLList $list_alt65 = list(makeString("@param STRING string; the surface string of the lex entry\n   @param KEYWORDS listp; a list of keywords, indicating the noun frame required\n   @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS"),
	    list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-NOMINAL-SEMTRANS")), makeSymbol("STRING"), makeSymbol("KEYWORDS"))),
		    list(RET, list(makeSymbol("LIST"), makeSymbol("LEX")))));

    public static final SubLObject semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method_alt(SubLObject self, SubLObject string, SubLObject tp_entry) {
	{
	    SubLObject lex_entries = NIL;
	    SubLObject pos = nl_trie.nl_trie_entry_pos(tp_entry);
	    SubLObject inflections = nl_trie.nl_trie_entry_pos_preds(tp_entry);
	    SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred(tp_entry, NIL);
	    SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics(tp_entry);
	    SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(tp_entry);
	    SubLObject denot = NIL;
	    for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), denot = cdolist_list_var.first()) {
		{
		    SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
		    SubLObject collectionP = fort_types_interface.collection_p(denot);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $PRAGMATICS, pragmatics);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(NIL != collectionP ? ((SubLObject) ($$isa)) : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $PREDICATE, predicate);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, pos);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, inflections);
		    methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, tp_entry);
		    lex_entries = cons(lex_entry, lex_entries);
		}
	    }
	    return lex_entries;
	}
    }

    public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method(final SubLObject self, final SubLObject string, final SubLObject tp_entry) {
	SubLObject lex_entries = NIL;
	final SubLObject pos = nl_trie.nl_trie_entry_pos(tp_entry);
	final SubLObject inflections = nl_trie.nl_trie_entry_pos_preds(tp_entry);
	final SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred(tp_entry, NIL);
	final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics(tp_entry);
	SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(tp_entry);
	SubLObject denot = NIL;
	denot = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
	    final SubLObject collectionP = fort_types_interface.collection_p(denot);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $PRAGMATICS, pragmatics);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(NIL != collectionP ? $$isa : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $PREDICATE, predicate);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, pos);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, inflections);
	    methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, tp_entry);
	    lex_entries = cons(lex_entry, lex_entries);
	    cdolist_list_var = cdolist_list_var.rest();
	    denot = cdolist_list_var.first();
	}
	return lex_entries;
    }

    static private final SubLList $list_alt73 = list(makeSymbol("STRING"), makeSymbol("KEYWORDS"));

    static private final SubLList $list_alt74 = list(list(makeSymbol("CLET"), list(makeSymbol("LITERALS")),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), makeSymbol("KEYWORDS")),
		    list(makeSymbol("PCASE"), makeSymbol("KEYWORD"),
			    list($NOUN, list(makeSymbol("CPUSH"),
				    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN,
					    list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("ThingDescribableAsFn"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("WordFn"), makeSymbol("STRING")), list(QUOTE, list(reader_make_constant_shell("Noun"))))),
				    makeSymbol("LITERALS"))),
			    list(makeKeyword("POSSESSOR"), list(makeSymbol("CPUSH"), list(QUOTE, list(reader_make_constant_shell("possessiveRelation"), makeKeyword("POSSESSOR"), $NOUN)), makeSymbol("LITERALS"))))),
	    list(RET, list(makeSymbol("CONJOIN"), makeSymbol("LITERALS")))));

    public static final SubLObject semtrans_lexicon_create_lex_entries_number_method_alt(SubLObject self, SubLObject number_string) {
	return NIL;
    }

    public static SubLObject semtrans_lexicon_create_lex_entries_number_method(final SubLObject self, final SubLObject number_string) {
	return NIL;
    }

    public static final SubLObject semtrans_lexicon_noun_compound_learn_method_alt(SubLObject self, SubLObject text) {
	return com.cyc.cycjava.cycl.semtrans_lexicon.text_noun_compound_semtrans_lex_entries(text);
    }

    public static SubLObject semtrans_lexicon_noun_compound_learn_method(final SubLObject self, final SubLObject text) {
	return text_noun_compound_semtrans_lex_entries(text);
    }

    public static final SubLObject noun_compound_semtrans_lex_entry_alt(SubLObject string, SubLObject denotation, SubLObject number) {
	{
	    SubLObject lex = object.new_class_instance(LEX_ENTRY);
	    SubLObject penn_tags = (NIL != backward.removal_ask(listS($$genlPreds, number, $list_alt203), UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($list_alt204)) : $list_alt205;
	    SubLObject base_sem_trans = list($$isa, $NOUN, denotation);
	    SubLObject reformulated_sem_trans = reformulator_hub.reformulate_cycl(base_sem_trans, $$EverythingPSC, UNPROVIDED);
	    SubLObject final_sem_trans = (NIL != reformulated_sem_trans) ? ((SubLObject) (reformulated_sem_trans)) : base_sem_trans;
	    methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	    methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, penn_tags);
	    methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Noun);
	    methods.funcall_instance_method_with_2_args(lex, SET, $FRAME, $$RegularNounFrame);
	    methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, final_sem_trans);
	    methods.funcall_instance_method_with_2_args(lex, SET, $INFLECTIONS, list(number));
	    return lex;
	}
    }

    public static SubLObject noun_compound_semtrans_lex_entry(final SubLObject string, final SubLObject denotation, final SubLObject number) {
	final SubLObject lex = object.new_class_instance(LEX_ENTRY);
	final SubLObject penn_tags = (NIL != backward.removal_ask(listS($$genlPreds, number, $list203), UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? $list204 : $list205;
	final SubLObject base_sem_trans = list($$isa, $NOUN, denotation);
	final SubLObject reformulated_sem_trans = reformulator_hub.reformulate_cycl(base_sem_trans, $$EverythingPSC, UNPROVIDED);
	final SubLObject final_sem_trans = (NIL != reformulated_sem_trans) ? reformulated_sem_trans : base_sem_trans;
	methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
	methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, penn_tags);
	methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Noun);
	methods.funcall_instance_method_with_2_args(lex, SET, $FRAME, $$RegularNounFrame);
	methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, final_sem_trans);
	methods.funcall_instance_method_with_2_args(lex, SET, $INFLECTIONS, list(number));
	return lex;
    }

    static private final SubLList $list_alt79 = list(reader_make_constant_shell("Noun"));

    static private final SubLList $list_alt81 = list(reader_make_constant_shell("possessiveRelation"), makeKeyword("POSSESSOR"), $NOUN);

    static private final SubLList $list_alt83 = list(makeString("@param STRING string; the surface string of the lex entry\n   @param KEYWORDS listp; a list of keywords, indicating the verb frame required\n   @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS"),
	    list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), NIL)),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FABRICATE-VERBAL-SEMTRANS")), makeSymbol("STRING"), makeSymbol("KEYWORDS"))),
			    list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
				    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))),
				    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), makeSymbol("SEMTRANS")), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES")))),
		    list(RET, makeSymbol("LEXES"))));

    public static final SubLObject text_noun_compound_semtrans_lex_entries_alt(SubLObject str) {
	{
	    SubLObject compounds = abstract_lexicon.noun_compound_meanings(str);
	    SubLObject res = NIL;
	    SubLObject cdolist_list_var = compounds;
	    SubLObject compound = NIL;
	    for (compound = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), compound = cdolist_list_var.first()) {
		{
		    SubLObject cdolist_list_var_9 = compound.rest();
		    SubLObject meaning = NIL;
		    for (meaning = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest(), meaning = cdolist_list_var_9.first()) {
			res = cons(com.cyc.cycjava.cycl.semtrans_lexicon.noun_compound_semtrans_lex_entry(compound.first(), meaning.first(), second(meaning)), res);
		    }
		}
	    }
	    return res;
	}
    }

    public static SubLObject text_noun_compound_semtrans_lex_entries(final SubLObject str) {
	final SubLObject compounds = abstract_lexicon.noun_compound_meanings(str);
	SubLObject res = NIL;
	SubLObject cdolist_list_var = compounds;
	SubLObject compound = NIL;
	compound = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject cdolist_list_var_$9 = compound.rest();
	    SubLObject meaning = NIL;
	    meaning = cdolist_list_var_$9.first();
	    while (NIL != cdolist_list_var_$9) {
		res = cons(noun_compound_semtrans_lex_entry(compound.first(), meaning.first(), second(meaning)), res);
		cdolist_list_var_$9 = cdolist_list_var_$9.rest();
		meaning = cdolist_list_var_$9.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    compound = cdolist_list_var.first();
	}
	return res;
    }

    public static final SubLObject semtrans_lexicon_cooccurrence_statistics_learn_method_alt(SubLObject self, SubLObject text) {
	{
	    SubLObject parse = methods.funcall_instance_method_with_1_args(parser.new_stanford_parser(UNPROVIDED, UNPROVIDED), PARSE, text);
	    SubLObject words = (NIL != parse) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(parse, YIELD))) : NIL;
	    SubLObject lexes = NIL;
	    SubLObject v_learned_nouns = NIL;
	    v_learned_nouns = noun_learner.learn_unknown_nouns_from_parse_tree(parse, UNPROVIDED);
	    {
		SubLObject cdolist_list_var = v_learned_nouns;
		SubLObject learned_noun = NIL;
		for (learned_noun = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), learned_noun = cdolist_list_var.first()) {
		    {
			SubLObject datum = learned_noun;
			SubLObject current = datum;
			SubLObject learned_string = NIL;
			SubLObject type = NIL;
			SubLObject relationship = NIL;
			SubLObject confidence = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt210);
			learned_string = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt210);
			type = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt210);
			relationship = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt210);
			confidence = current.first();
			current = current.rest();
			if (NIL == current) {
			    {
				SubLObject penn_tags = NIL;
				SubLObject parsed_string = NIL;
				SubLObject singularized_string = NIL;
				SubLObject semtrans = NIL;
				if (NIL == penn_tags) {
				    {
					SubLObject csome_list_var = words;
					SubLObject word = NIL;
					for (word = csome_list_var.first(); !((NIL != penn_tags) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), word = csome_list_var.first()) {
					    parsed_string = methods.funcall_instance_method_with_0_args(word, GET_STRING);
					    if (NIL != parsed_string) {
						singularized_string = lexification_utilities.singularize_word(parsed_string);
					    }
					    if (singularized_string.equalp(learned_string)) {
						penn_tags = cons(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY), penn_tags);
					    }
					}
				    }
				}
				{
				    SubLObject pcase_var = relationship;
				    if (pcase_var.eql($ISA)) {
					semtrans = list($$equals, $NOUN, type);
				    } else {
					if (pcase_var.eql($GENLS)) {
					    semtrans = list($$isa, $NOUN, list($$SubCollectionNamedFn, singularized_string, type));
					}
				    }
				}
				if ((NIL != penn_tags) && (NIL != semtrans)) {
				    {
					SubLObject lex = object.new_class_instance(LEX_ENTRY);
					methods.funcall_instance_method_with_2_args(lex, SET, $STRING, parsed_string);
					methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, penn_tags);
					methods.funcall_instance_method_with_2_args(lex, SET, $FRAME, $$RegularNounFrame);
					methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, semtrans);
					lexes = cons(lex, lexes);
				    }
				}
			    }
			} else {
			    cdestructuring_bind_error(datum, $list_alt210);
			}
		    }
		}
	    }
	    return lexes;
	}
    }

    public static SubLObject semtrans_lexicon_cooccurrence_statistics_learn_method(final SubLObject self, final SubLObject text) {
	final SubLObject parse = methods.funcall_instance_method_with_1_args(parser.new_stanford_parser(UNPROVIDED, UNPROVIDED), PARSE, text);
	final SubLObject words = (NIL != parse) ? methods.funcall_instance_method_with_0_args(parse, YIELD) : NIL;
	SubLObject lexes = NIL;
	SubLObject cdolist_list_var;
	final SubLObject learned_nouns = cdolist_list_var = NIL;
	SubLObject learned_noun = NIL;
	learned_noun = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    SubLObject current;
	    final SubLObject datum = current = learned_noun;
	    SubLObject learned_string = NIL;
	    SubLObject type = NIL;
	    SubLObject relationship = NIL;
	    SubLObject confidence = NIL;
	    destructuring_bind_must_consp(current, datum, $list210);
	    learned_string = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list210);
	    type = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list210);
	    relationship = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list210);
	    confidence = current.first();
	    current = current.rest();
	    if (NIL == current) {
		SubLObject penn_tags = NIL;
		SubLObject parsed_string = NIL;
		SubLObject singularized_string = NIL;
		SubLObject semtrans = NIL;
		if (NIL == penn_tags) {
		    SubLObject csome_list_var = words;
		    SubLObject word = NIL;
		    word = csome_list_var.first();
		    while ((NIL == penn_tags) && (NIL != csome_list_var)) {
			parsed_string = methods.funcall_instance_method_with_0_args(word, GET_STRING);
			if (NIL != parsed_string) {
			    singularized_string = lexification_utilities.singularize_word(parsed_string, UNPROVIDED);
			}
			if (singularized_string.equalp(learned_string)) {
			    penn_tags = cons(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY), penn_tags);
			}
			csome_list_var = csome_list_var.rest();
			word = csome_list_var.first();
		    }
		}
		final SubLObject pcase_var = relationship;
		if (pcase_var.eql($ISA)) {
		    semtrans = list($$equals, $NOUN, type);
		} else if (pcase_var.eql($GENLS)) {
		    semtrans = list($$isa, $NOUN, list($$SubCollectionNamedFn, singularized_string, type));
		}

		if ((NIL != penn_tags) && (NIL != semtrans)) {
		    final SubLObject lex = object.new_class_instance(LEX_ENTRY);
		    methods.funcall_instance_method_with_2_args(lex, SET, $STRING, parsed_string);
		    methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, penn_tags);
		    methods.funcall_instance_method_with_2_args(lex, SET, $FRAME, $$RegularNounFrame);
		    methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, semtrans);
		    lexes = cons(lex, lexes);
		}
	    } else {
		cdestructuring_bind_error(datum, $list210);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    learned_noun = cdolist_list_var.first();
	}
	return lexes;
    }

    static private final SubLList $list_alt86 = list(makeString("@return listp; a list of cycl semtrans templates made up from STRING and KEYWORDS"),
	    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQ)),
		    list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANSES"), NIL)),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("ENTRY"), list(makeSymbol("NL-TRIE-SEARCH"), makeSymbol("STRING"), makeSymbol("TRIE"), makeSymbol("CASE-SENSITIVITY"))),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES")), makeSymbol("ENTRY"), makeSymbol("KEYWORDS"))),
					    list(makeSymbol("CPUSH"), makeSymbol("SEMTRANS"), makeSymbol("SEMTRANSES")))),
			    list(makeSymbol("PUNLESS"), makeSymbol("SEMTRANSES"),
				    list(makeSymbol("CLET"),
					    list(makeSymbol("KEYWORD-LITERAL"),
						    list(makeSymbol("LITERALS"), list(makeSymbol("BQ-LIST"),
							    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), makeKeyword("ACTION"),
								    list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("ThingDescribableAsFn"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("WordFn"), makeSymbol("STRING")), list(QUOTE, list(reader_make_constant_shell("Verb")))))))),
					    list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), makeSymbol("KEYWORDS")), list(makeSymbol("CSETQ"), makeSymbol("KEYWORD-LITERAL"), list(makeSymbol("KEYWORD-TO-SEMTRANS-LITERAL"), makeSymbol("KEYWORD"))),
						    list(makeSymbol("PWHEN"), makeSymbol("KEYWORD-LITERAL"), list(makeSymbol("CPUSH"), makeSymbol("KEYWORD-LITERAL"), makeSymbol("LITERALS")))),
					    list(makeSymbol("PWHEN"), makeSymbol("LITERALS"), list(makeSymbol("CPUSH"), list(makeSymbol("CONJOIN"), makeSymbol("LITERALS")), makeSymbol("SEMTRANSES"))))),
			    list(RET, makeSymbol("SEMTRANSES")))));

    static private final SubLList $list_alt90 = list(reader_make_constant_shell("Verb"));

    static private final SubLList $list_alt92 = list(makeSymbol("ENTRY"), makeSymbol("KEYWORDS"));

    static private final SubLList $list_alt93 = list(makeString("@return listp; a list of semtrans templates for nl-trie-entry ENTRY with actor slots \n   for each syntactic relation keyword in KEYWORDS"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANSES"), NIL)),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NL-TRIE-WORD-P"), makeSymbol("ENTRY")), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQ))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("ENTRY"))), list(makeSymbol("CPUSH"), list(makeSymbol("DENOT-TO-VERBAL-SEMTRANS"), makeSymbol("DENOT"), makeSymbol("KEYWORDS")), makeSymbol("SEMTRANSES")))),
		    list(RET, makeSymbol("SEMTRANSES"))));

    static private final SubLList $list_alt95 = list(reader_make_constant_shell("MtSpace"), reader_make_constant_shell("AllEnglishValidatedLexicalMicrotheoryPSC"), reader_make_constant_shell("AnytimePSC"));

    public static final SubLObject semtrans_lexicon_from_term_lexicon_alt(SubLObject v_term_lexicon) {
	{
	    SubLObject v_semtrans_lexicon = com.cyc.cycjava.cycl.semtrans_lexicon.new_semtrans_lexicon();
	    instances.set_slot(v_semtrans_lexicon, DEFAULT_KB_SPEC, instances.get_slot(v_term_lexicon, DEFAULT_KB_SPEC));
	    methods.funcall_instance_method_with_1_args(v_semtrans_lexicon, SET_CASE_SENSITIVITY, instances.get_slot(v_term_lexicon, CASE_SENSITIVITY));
	    return v_semtrans_lexicon;
	}
    }

    public static SubLObject semtrans_lexicon_from_term_lexicon(final SubLObject v_term_lexicon) {
	final SubLObject v_semtrans_lexicon = new_semtrans_lexicon();
	instances.set_slot(v_semtrans_lexicon, DEFAULT_KB_SPEC, instances.get_slot(v_term_lexicon, DEFAULT_KB_SPEC));
	methods.funcall_instance_method_with_1_args(v_semtrans_lexicon, SET_CASE_SENSITIVITY, instances.get_slot(v_term_lexicon, CASE_SENSITIVITY));
	return v_semtrans_lexicon;
    }

    static private final SubLList $list_alt100 = list(list(makeKeyword("ACTION"), reader_make_constant_shell("isa"), makeKeyword("ACTION"), reader_make_constant_shell("Situation")), list(makeKeyword("SUBJECT"), reader_make_constant_shell("doneBy"), makeKeyword("ACTION"), makeKeyword("SUBJECT")),
	    list(makeKeyword("OBJECT"), reader_make_constant_shell("patient-Generic"), makeKeyword("ACTION"), makeKeyword("OBJECT")), list(makeKeyword("OBLIQUE-OBJECT"), reader_make_constant_shell("to-UnderspecifiedLocation"), makeKeyword("ACTION"), makeKeyword("OBLIQUE-OBJECT")),
	    list(makeKeyword("CLAUSE"), reader_make_constant_shell("awareOfProp"), makeKeyword("SUBJECT"), makeKeyword("CLAUSE")));

    /**
     *
     *
     * @param LEX-ENTRY
     * 		lex-entry-p; a lexical entry from a semtrans-lexicon
     * @return a CycL expression representing the semantics of this LEX-ENTRY.
    The point of this helper function is that many semtrans assertions can
    be presented to a user in a much terser form. This function tersifies
    the denotation when it is possible and leaves things as is when it is
    not.
     */
    @LispMethod(comment = "@param LEX-ENTRY\r\n\t\tlex-entry-p; a lexical entry from a semtrans-lexicon\r\n@return a CycL expression representing the semantics of this LEX-ENTRY.\r\nThe point of this helper function is that many semtrans assertions can\r\nbe presented to a user in a much terser form. This function tersifies\r\nthe denotation when it is possible and leaves things as is when it is\r\nnot.")
    public static final SubLObject extract_cycl_from_semtrans_lex_entry_alt(SubLObject lex_entry, SubLObject lexicon) {
	if (lexicon == UNPROVIDED) {
	    lexicon = NIL;
	}
	SubLTrampolineFile.checkType(lex_entry, LEX_ENTRY_P);
	{
	    SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex_entry, GET, $SEMTRANS);
	    return com.cyc.cycjava.cycl.semtrans_lexicon.extract_cycl_from_semtrans_sentence(semtrans, lexicon);
	}
    }

    /**
     *
     *
     * @param LEX-ENTRY
     * 		lex-entry-p; a lexical entry from a semtrans-lexicon
     * @return a CycL expression representing the semantics of this LEX-ENTRY.
    The point of this helper function is that many semtrans assertions can
    be presented to a user in a much terser form. This function tersifies
    the denotation when it is possible and leaves things as is when it is
    not.
     */
    @LispMethod(comment = "@param LEX-ENTRY\r\n\t\tlex-entry-p; a lexical entry from a semtrans-lexicon\r\n@return a CycL expression representing the semantics of this LEX-ENTRY.\r\nThe point of this helper function is that many semtrans assertions can\r\nbe presented to a user in a much terser form. This function tersifies\r\nthe denotation when it is possible and leaves things as is when it is\r\nnot.")
    public static SubLObject extract_cycl_from_semtrans_lex_entry(final SubLObject lex_entry, SubLObject lexicon) {
	if (lexicon == UNPROVIDED) {
	    lexicon = NIL;
	}
	assert NIL != abstract_lexicon.lex_entry_p(lex_entry) : "! abstract_lexicon.lex_entry_p(lex_entry) " + ("abstract_lexicon.lex_entry_p(lex_entry) " + "CommonSymbols.NIL != abstract_lexicon.lex_entry_p(lex_entry) ") + lex_entry;
	final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex_entry, GET, $SEMTRANS);
	return extract_cycl_from_semtrans_sentence(semtrans, lexicon);
    }

    static private final SubLList $list_alt101 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("IGNORE"), makeSymbol("KEYWORDS")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
			    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN,
				    list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("ThingDescribableAsFn"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("WordFn"), makeSymbol("STRING")), list(QUOTE, list(reader_make_constant_shell("Adjective")))))),
		    list(RET, list(makeSymbol("LIST"), makeSymbol("LEX")))));

    public static final SubLObject extract_cycl_from_semtrans_sentence_alt(SubLObject semtrans, SubLObject lexicon) {
	if (lexicon == UNPROVIDED) {
	    lexicon = NIL;
	}
	{
	    SubLObject concise_cycl = NIL;
	    if (NIL != com.cyc.cycjava.cycl.semtrans_lexicon.likely_ner_result_semtransP(semtrans, lexicon)) {
		concise_cycl = com.cyc.cycjava.cycl.semtrans_lexicon.extract_concise_cycl_from_ner_semtrans(semtrans, lexicon);
	    } else {
		if (cycl_utilities.formula_arg0(semtrans) == $$isa) {
		    concise_cycl = cycl_utilities.formula_arg2(semtrans, UNPROVIDED);
		} else {
		    if (cycl_utilities.formula_arg0(semtrans) == $$equals) {
			concise_cycl = cycl_utilities.formula_arg2(semtrans, UNPROVIDED);
		    } else {
			if (NIL != cycl_grammar.cycl_formula_p(cycl_utilities.formula_arg1(semtrans, UNPROVIDED))) {
			    if (NIL != cycl_utilities.expression_find($$InstanceFn, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
				semtrans = simplifier.simplify_cycl_sentence_syntax(semtrans, UNPROVIDED);
				semtrans = remove_if(INSTANCEFN_CLAUSE, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			    if (NIL == concise_cycl) {
				{
				    SubLObject csome_list_var = semtrans;
				    SubLObject clause = NIL;
				    for (clause = csome_list_var.first(); !((NIL != concise_cycl) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), clause = csome_list_var.first()) {
					{
					    SubLObject pred = cycl_utilities.formula_arg0(clause);
					    if (pred == $$isa) {
						concise_cycl = cycl_utilities.formula_arg2(clause, UNPROVIDED);
					    } else {
						if ((pred == $$equals) && (!((NIL != narts_high.naut_p(cycl_utilities.formula_arg2(clause, UNPROVIDED))) && (cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(clause, UNPROVIDED)) == $$InstanceFn)))) {
						    concise_cycl = cycl_utilities.formula_arg2(clause, UNPROVIDED);
						}
					    }
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (concise_cycl.isKeyword() || (NIL == concise_cycl)) {
		concise_cycl = semtrans;
	    }
	    if (concise_cycl.isKeyword()) {
		concise_cycl = NIL;
	    }
	    return narts_high.nart_substitute(concise_cycl);
	}
    }

    public static SubLObject extract_cycl_from_semtrans_sentence(SubLObject semtrans, SubLObject lexicon) {
	if (lexicon == UNPROVIDED) {
	    lexicon = NIL;
	}
	SubLObject concise_cycl = NIL;
	if (NIL != likely_ner_result_semtransP(semtrans, lexicon)) {
	    concise_cycl = extract_concise_cycl_from_ner_semtrans(semtrans, lexicon);
	} else if (cycl_utilities.formula_arg0(semtrans).eql($$isa)) {
	    concise_cycl = cycl_utilities.formula_arg2(semtrans, UNPROVIDED);
	} else if (cycl_utilities.formula_arg0(semtrans).eql($$equals)) {
	    concise_cycl = cycl_utilities.formula_arg2(semtrans, UNPROVIDED);
	} else if (NIL != cycl_grammar.cycl_formula_p(cycl_utilities.formula_arg1(semtrans, UNPROVIDED))) {
	    if (NIL != cycl_utilities.expression_find($$InstanceFn, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		semtrans = simplifier.simplify_cycl_sentence_syntax(semtrans, UNPROVIDED);
		semtrans = remove_if(INSTANCEFN_CLAUSE, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    if (NIL == concise_cycl) {
		SubLObject csome_list_var = semtrans;
		SubLObject clause = NIL;
		clause = csome_list_var.first();
		while ((NIL == concise_cycl) && (NIL != csome_list_var)) {
		    final SubLObject pred = cycl_utilities.formula_arg0(clause);
		    if (pred.eql($$isa)) {
			concise_cycl = cycl_utilities.formula_arg2(clause, UNPROVIDED);
		    } else if (pred.eql($$equals) && ((NIL == narts_high.naut_p(cycl_utilities.formula_arg2(clause, UNPROVIDED))) || (!cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(clause, UNPROVIDED)).eql($$InstanceFn)))) {
			concise_cycl = cycl_utilities.formula_arg2(clause, UNPROVIDED);
		    }

		    csome_list_var = csome_list_var.rest();
		    clause = csome_list_var.first();
		}
	    }
	}

	if (concise_cycl.isKeyword() || (NIL == concise_cycl)) {
	    concise_cycl = semtrans;
	}
	if (concise_cycl.isKeyword()) {
	    concise_cycl = NIL;
	}
	return narts_high.nart_substitute(concise_cycl);
    }

    static private final SubLList $list_alt102 = list(reader_make_constant_shell("Adjective"));

    static private final SubLList $list_alt104 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("IGNORE"), makeSymbol("KEYWORDS")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))),
		    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
			    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), makeKeyword("ACTION"),
				    list(makeSymbol("BQ-LIST*"), reader_make_constant_shell("ThingDescribableAsFn"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("WordFn"), makeSymbol("STRING")), list(QUOTE, list(reader_make_constant_shell("Adverb")))))),
		    list(RET, list(makeSymbol("LIST"), makeSymbol("LEX")))));

    static private final SubLList $list_alt105 = list(reader_make_constant_shell("Adverb"));

    public static final SubLObject instancefn_clause_alt(SubLObject clause) {
	return makeBoolean((cycl_utilities.formula_arg0(clause) == $$equals) && (cycl_utilities.formula_arg_position(clause, $list_alt220, UNPROVIDED) == $$InstanceFn));
    }

    public static SubLObject instancefn_clause(final SubLObject clause) {
	return makeBoolean(cycl_utilities.formula_arg0(clause).eql($$equals) && cycl_utilities.formula_arg_position(clause, $list220, UNPROVIDED).eql($$InstanceFn));
    }

    static private final SubLList $list_alt108 = list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY"));

    public static final SubLObject likely_ner_result_semtransP_alt(SubLObject semtrans, SubLObject lexicon) {
	if (lexicon == UNPROVIDED) {
	    lexicon = NIL;
	}
	{
	    SubLObject isa_restriction = NIL;
	    SubLObject name = NIL;
	    SubLObject instancefnP = NIL;
	    SubLObject other_stuffP = NIL;
	    if (semtrans.isList()) {
		{
		    SubLObject terms = cycl_utilities.formula_terms(simplifier.simplify_cycl_sentence_syntax(semtrans, UNPROVIDED), $IGNORE);
		    SubLObject cdolist_list_var = terms;
		    SubLObject clause = NIL;
		    for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), clause = cdolist_list_var.first()) {
			if (NIL == el_formula_p(clause)) {
			} else {
			    if ((cycl_utilities.formula_arg0(clause) == $$isa) && (NIL == isa_restriction)) {
				isa_restriction = cycl_utilities.formula_arg2(clause, UNPROVIDED);
			    } else {
				if (cycl_utilities.formula_arg0(clause) == $$nameString) {
				    name = cycl_utilities.formula_arg2(clause, UNPROVIDED);
				} else {
				    other_stuffP = T;
				}
			    }
			}
		    }
		}
		if ((NIL != isa_restriction) && (NIL != name)) {
		    return com.cyc.cycjava.cycl.semtrans_lexicon.get_infnt_nart_with_specification(name, isa_restriction, lexicon);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject likely_ner_result_semtransP(final SubLObject semtrans, SubLObject lexicon) {
	if (lexicon == UNPROVIDED) {
	    lexicon = NIL;
	}
	SubLObject isa_restriction = NIL;
	SubLObject name = NIL;
	final SubLObject instancefnP = NIL;
	SubLObject other_stuffP = NIL;
	if (semtrans.isList()) {
	    SubLObject cdolist_list_var;
	    final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(simplifier.simplify_cycl_sentence_syntax(semtrans, UNPROVIDED), $IGNORE);
	    SubLObject clause = NIL;
	    clause = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != el_formula_p(clause)) {
		    if (cycl_utilities.formula_arg0(clause).eql($$isa) && (NIL == isa_restriction)) {
			isa_restriction = cycl_utilities.formula_arg2(clause, UNPROVIDED);
		    } else if (cycl_utilities.formula_arg0(clause).eql($$nameString)) {
			name = cycl_utilities.formula_arg2(clause, UNPROVIDED);
		    } else {
			other_stuffP = T;
		    }

		}
		cdolist_list_var = cdolist_list_var.rest();
		clause = cdolist_list_var.first();
	    }
	    if ((NIL != isa_restriction) && (NIL != name)) {
		return get_infnt_nart_with_specification(name, isa_restriction, lexicon);
	    }
	}
	return NIL;
    }

    static private final SubLList $list_alt109 = list(makeString(
	    "@param STRING stringp; a string for which to create a list of lex-entries\n   @param NL-TRIE-ENTRY nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\n   to construct a lexical entry\n   @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY"),
	    list(makeSymbol("PCOND"), list(list(makeSymbol("NL-TRIE-WORD-P"), makeSymbol("NL-TRIE-ENTRY")), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))),
		    list(list(makeSymbol("NL-TRIE-NAME-P"), makeSymbol("NL-TRIE-ENTRY")), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))),
		    list(list(makeSymbol("NL-TRIE-TERM-PHRASES-ENTRY-P"), makeSymbol("NL-TRIE-ENTRY")), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))),
		    list(list(makeSymbol("LEX-ENTRY-P"), makeSymbol("NL-TRIE-ENTRY")), list(RET, list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("NL-TRIE-ENTRY"), list(QUOTE, makeSymbol("COPY"))))))));

    public static final SubLObject extract_concise_cycl_from_ner_semtrans_alt(SubLObject semtrans, SubLObject lexicon) {
	if (lexicon == UNPROVIDED) {
	    lexicon = NIL;
	}
	return com.cyc.cycjava.cycl.semtrans_lexicon.likely_ner_result_semtransP(semtrans, lexicon);
    }

    public static SubLObject extract_concise_cycl_from_ner_semtrans(final SubLObject semtrans, SubLObject lexicon) {
	if (lexicon == UNPROVIDED) {
	    lexicon = NIL;
	}
	return likely_ner_result_semtransP(semtrans, lexicon);
    }

    public static final SubLObject get_infnt_nart_with_specification_alt(SubLObject name, SubLObject isa_restriction, SubLObject lexicon) {
	if (lexicon == UNPROVIDED) {
	    lexicon = NIL;
	}
	{
	    SubLObject result = NIL;
	    result = com.cyc.cycjava.cycl.semtrans_lexicon.find_infnt_nart_with_specification(name, isa_restriction);
	    if (NIL == result) {
		if (NIL != lexicon) {
		    methods.funcall_instance_method_with_1_args(lexicon, DELETE, name);
		}
		result = czer_main.cyc_find_or_create_nart(list($$InstanceNamedFn_Ternary, name, isa_restriction, Guids.guid_to_string(Guids.new_guid())), UNPROVIDED);
		if (cycl_utilities.formula_arg0(isa_restriction).equal($$CollectionIntersection2Fn)) {
		    {
			SubLObject cdolist_list_var = cycl_utilities.formula_args(isa_restriction, UNPROVIDED);
			SubLObject v_isa = NIL;
			for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_isa = cdolist_list_var.first()) {
			    ke.ke_assert_now(list($$isa, result, v_isa), $$BaseKB, UNPROVIDED, UNPROVIDED);
			}
		    }
		}
	    }
	    return result;
	}
    }

    public static SubLObject get_infnt_nart_with_specification(final SubLObject name, final SubLObject isa_restriction, SubLObject lexicon) {
	if (lexicon == UNPROVIDED) {
	    lexicon = NIL;
	}
	SubLObject result = NIL;
	result = find_infnt_nart_with_specification(name, isa_restriction);
	if (NIL == result) {
	    if (NIL != lexicon) {
		methods.funcall_instance_method_with_1_args(lexicon, DELETE, name);
	    }
	    result = czer_main.cyc_find_or_create_nart(list($$InstanceNamedFn_Ternary, name, isa_restriction, Guids.guid_to_string(Guids.new_guid())), UNPROVIDED);
	    if (cycl_utilities.formula_arg0(isa_restriction).equal($$CollectionIntersection2Fn)) {
		SubLObject cdolist_list_var = cycl_utilities.formula_args(isa_restriction, UNPROVIDED);
		SubLObject v_isa = NIL;
		v_isa = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    ke.ke_assert_now(list($$isa, result, v_isa), $$BaseKB, UNPROVIDED, UNPROVIDED);
		    cdolist_list_var = cdolist_list_var.rest();
		    v_isa = cdolist_list_var.first();
		}
	    }
	}
	return result;
    }

    static private final SubLList $list_alt115 = list(makeSymbol("LEMMA"));

    static private final SubLList $list_alt116 = list(makeString("@param LEMMA textract-lemma-p\n   @return lex-entry-p or nil; the lex entry equivalent of LEMMA,\n   or nil if one can\'t be obtained"),
	    list(makeSymbol("CLET"), list(makeSymbol("CYCL"), makeSymbol("LEX-ENTRY")),
		    list(new SubLObject[] { makeSymbol("PCASE"), list(makeSymbol("TEXTRACT-LEMMA-TYPE"), makeSymbol("LEMMA")),
			    list(makeKeyword("PERSON"),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCL"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(QUOTE, list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Person"))),
						    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))),
			    list(makeKeyword("PERSON?"),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCL"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(QUOTE, list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Person"))),
						    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))),
			    list(makeKeyword("PLACE"),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCL"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(QUOTE, list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Place"))),
						    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))),
			    list(makeKeyword("PLACE?"),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCL"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(QUOTE, list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Place"))),
						    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))),
			    list(makeKeyword("ORG"),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCL"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(QUOTE, list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Organization"))),
						    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))),
			    list(makeKeyword("UNAME"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA"))))),
			    list(makeSymbol("OTHERWISE"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), NIL)) }),
		    list(makeSymbol("PWHEN"), makeSymbol("CYCL"), list(makeSymbol("CSETQ"), makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY")))),
			    list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell("ProperNoun")),
			    list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("LIST"), makeSymbol("CYCL"))),
			    list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
			    list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))),
		    list(RET, makeSymbol("LEX-ENTRY"))));

    public static final SubLObject find_infnt_nart_with_specification_alt(SubLObject name, SubLObject isa_restriction) {
	{
	    SubLObject isa_forts = cycl_utilities.expression_gather(isa_restriction, FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    SubLObject tou_asserts = virtual_indexing.assertions_mentioning_terms(cons($$termOfUnit, isa_forts), UNPROVIDED);
	    SubLObject result = NIL;
	    if (NIL == result) {
		{
		    SubLObject csome_list_var = tou_asserts;
		    SubLObject v_assert = NIL;
		    for (v_assert = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), v_assert = csome_list_var.first()) {
			{
			    SubLObject nart = (cycl_utilities.formula_arg0(v_assert) == $$termOfUnit) ? ((SubLObject) (cycl_utilities.formula_arg1(v_assert, UNPROVIDED))) : NIL;
			    if (((cycl_utilities.formula_arg0(nart) == $$InstanceNamedFn_Ternary) && cycl_utilities.formula_arg1(nart, UNPROVIDED).equal(name)) && cycl_utilities.formula_arg2(nart, UNPROVIDED).equal(isa_restriction)) {
				result = nart;
			    }
			}
		    }
		}
	    }
	    return result;
	}
    }

    public static SubLObject find_infnt_nart_with_specification(final SubLObject name, final SubLObject isa_restriction) {
	final SubLObject isa_forts = cycl_utilities.expression_gather(isa_restriction, FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	final SubLObject tou_asserts = virtual_indexing.assertions_mentioning_terms(cons($$termOfUnit, isa_forts), UNPROVIDED);
	SubLObject result = NIL;
	if (NIL == result) {
	    SubLObject csome_list_var = tou_asserts;
	    SubLObject v_assert = NIL;
	    v_assert = csome_list_var.first();
	    while ((NIL == result) && (NIL != csome_list_var)) {
		final SubLObject nart = (cycl_utilities.formula_arg0(v_assert).eql($$termOfUnit)) ? cycl_utilities.formula_arg1(v_assert, UNPROVIDED) : NIL;
		if ((cycl_utilities.formula_arg0(nart).eql($$InstanceNamedFn_Ternary) && cycl_utilities.formula_arg1(nart, UNPROVIDED).equal(name)) && cycl_utilities.formula_arg2(nart, UNPROVIDED).equal(isa_restriction)) {
		    result = nart;
		}
		csome_list_var = csome_list_var.rest();
		v_assert = csome_list_var.first();
	    }
	}
	return result;
    }

    public static final SubLObject declare_semtrans_lexicon_file_alt() {
	declareFunction("new_semtrans_lexicon", "NEW-SEMTRANS-LEXICON", 0, 0, false);
	declareFunction("get_semtrans_lexicon", "GET-SEMTRANS-LEXICON", 0, 0, false);
	declareFunction("get_semtrans_lexicon_my_term_lexicon", "GET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 1, 0, false);
	declareFunction("set_semtrans_lexicon_my_term_lexicon", "SET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 2, 0, false);
	declareFunction("subloop_reserved_initialize_semtrans_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_semtrans_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-INSTANCE", 1, 0, false);
	declareFunction("semtrans_lexicon_p", "SEMTRANS-LEXICON-P", 1, 0, false);
	declareFunction("semtrans_lexicon_initialize_method", "SEMTRANS-LEXICON-INITIALIZE-METHOD", 1, 0, false);
	declareFunction("semtrans_lexicon_get_term_lexicon_method", "SEMTRANS-LEXICON-GET-TERM-LEXICON-METHOD", 1, 0, false);
	declareFunction("new_term_lexicon_from_semtrans_lexicon", "NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON", 1, 0, false);
	declareFunction("semtrans_lexicon_set_term_lexicon_method", "SEMTRANS-LEXICON-SET-TERM-LEXICON-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_fabricate_method", "SEMTRANS-LEXICON-FABRICATE-METHOD", 4, 0, false);
	declareFunction("nominal_penn_tag", "NOMINAL-PENN-TAG", 1, 0, false);
	declareFunction("verbal_penn_tag", "VERBAL-PENN-TAG", 1, 0, false);
	declareFunction("adjectival_penn_tag", "ADJECTIVAL-PENN-TAG", 1, 0, false);
	declareFunction("adverbial_penn_tag", "ADVERBIAL-PENN-TAG", 1, 0, false);
	declareFunction("semtrans_lexicon_fabricate_nominal_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-METHOD", 4, 0, false);
	declareFunction("semtrans_lexicon_fabricate_nominal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-SEMTRANS-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_fabricate_verbal_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-METHOD", 4, 0, false);
	declareFunction("semtrans_lexicon_fabricate_verbal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method", "SEMTRANS-LEXICON-NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES-METHOD", 3, 0, false);
	declareFunction("denot_to_verbal_semtrans", "DENOT-TO-VERBAL-SEMTRANS", 2, 0, false);
	declareFunction("keyword_to_semtrans_literal", "KEYWORD-TO-SEMTRANS-LITERAL", 1, 1, false);
	declareFunction("semtrans_lexicon_fabricate_adjectival_method", "SEMTRANS-LEXICON-FABRICATE-ADJECTIVAL-METHOD", 4, 0, false);
	declareFunction("semtrans_lexicon_fabricate_adverbial_method", "SEMTRANS-LEXICON-FABRICATE-ADVERBIAL-METHOD", 4, 0, false);
	declareFunction("semtrans_lexicon_create_lex_entries_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_textract_lemma_to_lex_entry_method", "SEMTRANS-LEXICON-TEXTRACT-LEMMA-TO-LEX-ENTRY-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_resporator_to_lex_entries_method", "SEMTRANS-LEXICON-RESPORATOR-TO-LEX-ENTRIES-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_resporator_learn_method", "SEMTRANS-LEXICON-RESPORATOR-LEARN-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_resporatorXX_learn_method", "SEMTRANS-LEXICON-RESPORATOR++-LEARN-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_stanford_ner_learn_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_stanford_ner_learn_tightened_types_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-TIGHTENED-TYPES-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_stanford_ner_learn_int_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-INT-METHOD", 3, 0, false);
	declareFunction("contains_semtrans_lexicon_usable_entryP", "CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?", 1, 0, false);
	declareFunction("semtrans_lexicon_number_learn_method", "SEMTRANS-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
	declareFunction("number_semtrans_lex_entry", "NUMBER-SEMTRANS-LEX-ENTRY", 2, 0, false);
	declareFunction("semtrans_lexicon_create_lex_entries_nl_trie_word_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_create_lex_entries_nl_trie_name_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-NAME-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_create_lex_entries_number_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_noun_compound_learn_method", "SEMTRANS-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
	declareFunction("noun_compound_semtrans_lex_entry", "NOUN-COMPOUND-SEMTRANS-LEX-ENTRY", 3, 0, false);
	declareFunction("text_noun_compound_semtrans_lex_entries", "TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES", 1, 0, false);
	declareFunction("semtrans_lexicon_cooccurrence_statistics_learn_method", "SEMTRANS-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_from_term_lexicon", "SEMTRANS-LEXICON-FROM-TERM-LEXICON", 1, 0, false);
	declareFunction("extract_cycl_from_semtrans_lex_entry", "EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY", 1, 1, false);
	declareFunction("extract_cycl_from_semtrans_sentence", "EXTRACT-CYCL-FROM-SEMTRANS-SENTENCE", 1, 1, false);
	declareFunction("instancefn_clause", "INSTANCEFN-CLAUSE", 1, 0, false);
	declareFunction("likely_ner_result_semtransP", "LIKELY-NER-RESULT-SEMTRANS?", 1, 1, false);
	declareFunction("extract_concise_cycl_from_ner_semtrans", "EXTRACT-CONCISE-CYCL-FROM-NER-SEMTRANS", 1, 1, false);
	declareFunction("get_infnt_nart_with_specification", "GET-INFNT-NART-WITH-SPECIFICATION", 2, 1, false);
	declareFunction("find_infnt_nart_with_specification", "FIND-INFNT-NART-WITH-SPECIFICATION", 2, 0, false);
	declareFunction("semtrans_lexicon_stanford_learn_simple_test", "SEMTRANS-LEXICON-STANFORD-LEARN-SIMPLE-TEST", 1, 0, false);
	declareFunction("semtrans_lexicon_stanford_learn_tightened_test", "SEMTRANS-LEXICON-STANFORD-LEARN-TIGHTENED-TEST", 1, 0, false);
	return NIL;
    }

    public static SubLObject declare_semtrans_lexicon_file() {
	if (SubLFiles.USE_V1) {
	    declareFunction("new_semtrans_lexicon", "NEW-SEMTRANS-LEXICON", 0, 0, false);
	    declareFunction("get_semtrans_lexicon", "GET-SEMTRANS-LEXICON", 0, 0, false);
	    declareFunction("get_semtrans_lexicon_my_term_lexicon", "GET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 1, 0, false);
	    declareFunction("set_semtrans_lexicon_my_term_lexicon", "SET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_semtrans_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_semtrans_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-INSTANCE", 1, 0, false);
	    declareFunction("semtrans_lexicon_p", "SEMTRANS-LEXICON-P", 1, 0, false);
	    declareFunction("semtrans_lexicon_initialize_method", "SEMTRANS-LEXICON-INITIALIZE-METHOD", 1, 0, false);
	    declareFunction("semtrans_lexicon_get_term_lexicon_method", "SEMTRANS-LEXICON-GET-TERM-LEXICON-METHOD", 1, 0, false);
	    declareFunction("new_term_lexicon_from_semtrans_lexicon", "NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON", 1, 0, false);
	    declareFunction("semtrans_lexicon_set_term_lexicon_method", "SEMTRANS-LEXICON-SET-TERM-LEXICON-METHOD", 2, 0, false);
	    declareFunction("semtrans_lexicon_fabricate_method", "SEMTRANS-LEXICON-FABRICATE-METHOD", 4, 0, false);
	    declareFunction("nominal_penn_tag", "NOMINAL-PENN-TAG", 1, 0, false);
	    declareFunction("verbal_penn_tag", "VERBAL-PENN-TAG", 1, 0, false);
	    declareFunction("adjectival_penn_tag", "ADJECTIVAL-PENN-TAG", 1, 0, false);
	    declareFunction("adverbial_penn_tag", "ADVERBIAL-PENN-TAG", 1, 0, false);
	    declareFunction("semtrans_lexicon_fabricate_nominal_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-METHOD", 4, 0, false);
	    declareFunction("semtrans_lexicon_fabricate_nominal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-SEMTRANS-METHOD", 3, 0, false);
	    declareFunction("semtrans_lexicon_fabricate_verbal_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-METHOD", 4, 0, false);
	    declareFunction("semtrans_lexicon_fabricate_verbal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD", 3, 0, false);
	    declareFunction("semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method", "SEMTRANS-LEXICON-NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES-METHOD", 3, 0, false);
	    declareFunction("denot_to_verbal_semtrans", "DENOT-TO-VERBAL-SEMTRANS", 2, 0, false);
	    declareFunction("keyword_to_semtrans_literal", "KEYWORD-TO-SEMTRANS-LITERAL", 1, 1, false);
	    declareFunction("semtrans_lexicon_fabricate_adjectival_method", "SEMTRANS-LEXICON-FABRICATE-ADJECTIVAL-METHOD", 4, 0, false);
	    declareFunction("semtrans_lexicon_fabricate_adverbial_method", "SEMTRANS-LEXICON-FABRICATE-ADVERBIAL-METHOD", 4, 0, false);
	    declareFunction("semtrans_lexicon_create_lex_entries_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false);
	    declareFunction("semtrans_lexicon_textract_lemma_to_lex_entry_method", "SEMTRANS-LEXICON-TEXTRACT-LEMMA-TO-LEX-ENTRY-METHOD", 2, 0, false);
	    declareFunction("semtrans_lexicon_resporator_to_lex_entries_method", "SEMTRANS-LEXICON-RESPORATOR-TO-LEX-ENTRIES-METHOD", 2, 0, false);
	    declareFunction("semtrans_lexicon_resporator_learn_method", "SEMTRANS-LEXICON-RESPORATOR-LEARN-METHOD", 2, 0, false);
	    declareFunction("semtrans_lexicon_resporatorXX_learn_method", "SEMTRANS-LEXICON-RESPORATOR++-LEARN-METHOD", 2, 0, false);
	    declareFunction("semtrans_lexicon_stanford_ner_learn_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-METHOD", 2, 0, false);
	    declareFunction("semtrans_lexicon_stanford_ner_learn_tightened_types_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-TIGHTENED-TYPES-METHOD", 2, 0, false);
	    declareFunction("semtrans_lexicon_stanford_ner_learn_int_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-INT-METHOD", 3, 0, false);
	    declareFunction("contains_semtrans_lexicon_usable_entryP", "CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?", 1, 0, false);
	    declareFunction("semtrans_lexicon_number_learn_method", "SEMTRANS-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
	    declareFunction("number_semtrans_lex_entry", "NUMBER-SEMTRANS-LEX-ENTRY", 2, 0, false);
	    declareFunction("semtrans_lexicon_create_lex_entries_nl_trie_word_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD", 3, 0, false);
	    declareFunction("semtrans_lexicon_create_lex_entries_nl_trie_name_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-NAME-METHOD", 3, 0, false);
	    declareFunction("semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY-METHOD", 3, 0, false);
	    declareFunction("semtrans_lexicon_create_lex_entries_number_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD", 2, 0, false);
	    declareFunction("semtrans_lexicon_noun_compound_learn_method", "SEMTRANS-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
	    declareFunction("noun_compound_semtrans_lex_entry", "NOUN-COMPOUND-SEMTRANS-LEX-ENTRY", 3, 0, false);
	    declareFunction("text_noun_compound_semtrans_lex_entries", "TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES", 1, 0, false);
	    declareFunction("semtrans_lexicon_cooccurrence_statistics_learn_method", "SEMTRANS-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD", 2, 0, false);
	    declareFunction("semtrans_lexicon_from_term_lexicon", "SEMTRANS-LEXICON-FROM-TERM-LEXICON", 1, 0, false);
	    declareFunction("extract_cycl_from_semtrans_lex_entry", "EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY", 1, 1, false);
	    declareFunction("extract_cycl_from_semtrans_sentence", "EXTRACT-CYCL-FROM-SEMTRANS-SENTENCE", 1, 1, false);
	    declareFunction("instancefn_clause", "INSTANCEFN-CLAUSE", 1, 0, false);
	    declareFunction("likely_ner_result_semtransP", "LIKELY-NER-RESULT-SEMTRANS?", 1, 1, false);
	    declareFunction("extract_concise_cycl_from_ner_semtrans", "EXTRACT-CONCISE-CYCL-FROM-NER-SEMTRANS", 1, 1, false);
	    declareFunction("get_infnt_nart_with_specification", "GET-INFNT-NART-WITH-SPECIFICATION", 2, 1, false);
	    declareFunction("find_infnt_nart_with_specification", "FIND-INFNT-NART-WITH-SPECIFICATION", 2, 0, false);
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("semtrans_lexicon_stanford_learn_simple_test", "SEMTRANS-LEXICON-STANFORD-LEARN-SIMPLE-TEST", 1, 0, false);
	    declareFunction("semtrans_lexicon_stanford_learn_tightened_test", "SEMTRANS-LEXICON-STANFORD-LEARN-TIGHTENED-TEST", 1, 0, false);
	}
	return NIL;
    }

    public static SubLObject declare_semtrans_lexicon_file_Previous() {
	declareFunction("new_semtrans_lexicon", "NEW-SEMTRANS-LEXICON", 0, 0, false);
	declareFunction("get_semtrans_lexicon", "GET-SEMTRANS-LEXICON", 0, 0, false);
	declareFunction("get_semtrans_lexicon_my_term_lexicon", "GET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 1, 0, false);
	declareFunction("set_semtrans_lexicon_my_term_lexicon", "SET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 2, 0, false);
	declareFunction("subloop_reserved_initialize_semtrans_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_semtrans_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-INSTANCE", 1, 0, false);
	declareFunction("semtrans_lexicon_p", "SEMTRANS-LEXICON-P", 1, 0, false);
	declareFunction("semtrans_lexicon_initialize_method", "SEMTRANS-LEXICON-INITIALIZE-METHOD", 1, 0, false);
	declareFunction("semtrans_lexicon_get_term_lexicon_method", "SEMTRANS-LEXICON-GET-TERM-LEXICON-METHOD", 1, 0, false);
	declareFunction("new_term_lexicon_from_semtrans_lexicon", "NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON", 1, 0, false);
	declareFunction("semtrans_lexicon_set_term_lexicon_method", "SEMTRANS-LEXICON-SET-TERM-LEXICON-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_fabricate_method", "SEMTRANS-LEXICON-FABRICATE-METHOD", 4, 0, false);
	declareFunction("nominal_penn_tag", "NOMINAL-PENN-TAG", 1, 0, false);
	declareFunction("verbal_penn_tag", "VERBAL-PENN-TAG", 1, 0, false);
	declareFunction("adjectival_penn_tag", "ADJECTIVAL-PENN-TAG", 1, 0, false);
	declareFunction("adverbial_penn_tag", "ADVERBIAL-PENN-TAG", 1, 0, false);
	declareFunction("semtrans_lexicon_fabricate_nominal_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-METHOD", 4, 0, false);
	declareFunction("semtrans_lexicon_fabricate_nominal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-SEMTRANS-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_fabricate_verbal_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-METHOD", 4, 0, false);
	declareFunction("semtrans_lexicon_fabricate_verbal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method", "SEMTRANS-LEXICON-NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES-METHOD", 3, 0, false);
	declareFunction("denot_to_verbal_semtrans", "DENOT-TO-VERBAL-SEMTRANS", 2, 0, false);
	declareFunction("keyword_to_semtrans_literal", "KEYWORD-TO-SEMTRANS-LITERAL", 1, 1, false);
	declareFunction("semtrans_lexicon_fabricate_adjectival_method", "SEMTRANS-LEXICON-FABRICATE-ADJECTIVAL-METHOD", 4, 0, false);
	declareFunction("semtrans_lexicon_fabricate_adverbial_method", "SEMTRANS-LEXICON-FABRICATE-ADVERBIAL-METHOD", 4, 0, false);
	declareFunction("semtrans_lexicon_create_lex_entries_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_textract_lemma_to_lex_entry_method", "SEMTRANS-LEXICON-TEXTRACT-LEMMA-TO-LEX-ENTRY-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_resporator_to_lex_entries_method", "SEMTRANS-LEXICON-RESPORATOR-TO-LEX-ENTRIES-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_resporator_learn_method", "SEMTRANS-LEXICON-RESPORATOR-LEARN-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_resporatorXX_learn_method", "SEMTRANS-LEXICON-RESPORATOR++-LEARN-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_stanford_ner_learn_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_stanford_ner_learn_tightened_types_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-TIGHTENED-TYPES-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_stanford_ner_learn_int_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-INT-METHOD", 3, 0, false);
	declareFunction("contains_semtrans_lexicon_usable_entryP", "CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?", 1, 0, false);
	declareFunction("semtrans_lexicon_number_learn_method", "SEMTRANS-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
	declareFunction("number_semtrans_lex_entry", "NUMBER-SEMTRANS-LEX-ENTRY", 2, 0, false);
	declareFunction("semtrans_lexicon_create_lex_entries_nl_trie_word_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_create_lex_entries_nl_trie_name_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-NAME-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY-METHOD", 3, 0, false);
	declareFunction("semtrans_lexicon_create_lex_entries_number_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_noun_compound_learn_method", "SEMTRANS-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
	declareFunction("noun_compound_semtrans_lex_entry", "NOUN-COMPOUND-SEMTRANS-LEX-ENTRY", 3, 0, false);
	declareFunction("text_noun_compound_semtrans_lex_entries", "TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES", 1, 0, false);
	declareFunction("semtrans_lexicon_cooccurrence_statistics_learn_method", "SEMTRANS-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD", 2, 0, false);
	declareFunction("semtrans_lexicon_from_term_lexicon", "SEMTRANS-LEXICON-FROM-TERM-LEXICON", 1, 0, false);
	declareFunction("extract_cycl_from_semtrans_lex_entry", "EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY", 1, 1, false);
	declareFunction("extract_cycl_from_semtrans_sentence", "EXTRACT-CYCL-FROM-SEMTRANS-SENTENCE", 1, 1, false);
	declareFunction("instancefn_clause", "INSTANCEFN-CLAUSE", 1, 0, false);
	declareFunction("likely_ner_result_semtransP", "LIKELY-NER-RESULT-SEMTRANS?", 1, 1, false);
	declareFunction("extract_concise_cycl_from_ner_semtrans", "EXTRACT-CONCISE-CYCL-FROM-NER-SEMTRANS", 1, 1, false);
	declareFunction("get_infnt_nart_with_specification", "GET-INFNT-NART-WITH-SPECIFICATION", 2, 1, false);
	declareFunction("find_infnt_nart_with_specification", "FIND-INFNT-NART-WITH-SPECIFICATION", 2, 0, false);
	return NIL;
    }

    static private final SubLList $list_alt119 = list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Person"));

    static private final SubLList $list_alt123 = list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Place"));

    static private final SubLList $list_alt126 = list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Organization"));

    static private final SubLList $list_alt134 = list(makeSymbol("TYPE.STRING"));

    static private final SubLList $list_alt135 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL)),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("PARSE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RESPORATOR-TO-CYCL")), makeSymbol("TYPE.STRING"))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), list(makeSymbol("CDR"), makeSymbol("TYPE.STRING"))),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell("ProperNoun")),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
				    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN, makeSymbol("PARSE")),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, list(makeSymbol("CDR"), makeSymbol("TYPE.STRING"))))),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("ABSTRACT-LEXICON")), list(QUOTE, makeSymbol("RESPORATOR-TO-INFLECTIONS")), makeSymbol("TYPE.STRING"))),
			    list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")))),
	    list(RET, makeSymbol("LEX-ENTRIES"))));

    static private final SubLList $list_alt141 = list(makeSymbol("TEXT"));

    static private final SubLList $list_alt142 = list(makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), NIL)),
		    list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-QUIRK"),
			    list(makeSymbol("CLET"), list(makeSymbol("TYPINGS"), makeSymbol("ERROR?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR?")), list(makeSymbol("CSETQ"), makeSymbol("TYPINGS"), list(makeSymbol("RESPORATOR"), makeSymbol("TEXT")))),
				    list(makeSymbol("PWHEN"), makeSymbol("ERROR?"), list(makeSymbol("WARN"), makeSymbol("ERROR?")), list(RET, NIL)),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE.STRING"), makeSymbol("TYPINGS")),
					    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RESPORATOR-TO-LEX-ENTRIES")), makeSymbol("TYPE.STRING"))), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES")))))),
		    list(RET, makeSymbol("LEXES"))));

    public static SubLObject init_semtrans_lexicon_file() {
	defparameter("*MANUFACTURE-SEMTRANS-ASSERTIONS?*", T);
	defparameter("*SEMTRANS-LEXICON*", NIL);
	defvar("*DEFAULT-VERBAL-LEX-ENTRY-LITERALS*", $list100);
	defparameter("*SEMTRANS-LEXICON-LEARNERS*", $list177);
	return NIL;
    }

    public static final SubLObject setup_semtrans_lexicon_file_alt() {
	classes.subloop_new_class(SEMTRANS_LEXICON, ABSTRACT_LEXICON, NIL, NIL, $list_alt2);
	classes.class_set_implements_slot_listeners(SEMTRANS_LEXICON, NIL);
	classes.subloop_note_class_initialization_function(SEMTRANS_LEXICON, SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS);
	classes.subloop_note_instance_initialization_function(SEMTRANS_LEXICON, SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE);
	com.cyc.cycjava.cycl.semtrans_lexicon.subloop_reserved_initialize_semtrans_lexicon_class(SEMTRANS_LEXICON);
	methods.methods_incorporate_instance_method(INITIALIZE, SEMTRANS_LEXICON, $list_alt34, NIL, $list_alt35);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, INITIALIZE, SEMTRANS_LEXICON_INITIALIZE_METHOD);
	methods.methods_incorporate_instance_method(GET_TERM_LEXICON, SEMTRANS_LEXICON, $list_alt34, NIL, $list_alt42);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, GET_TERM_LEXICON, SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD);
	methods.methods_incorporate_instance_method(SET_TERM_LEXICON, SEMTRANS_LEXICON, $list_alt34, $list_alt48, $list_alt49);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, SET_TERM_LEXICON, SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE, SEMTRANS_LEXICON, $list_alt53, $list_alt54, $list_alt55);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE, SEMTRANS_LEXICON_FABRICATE_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_NOMINAL, SEMTRANS_LEXICON, $list_alt53, $list_alt54, $list_alt65);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_NOMINAL, SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_NOMINAL_SEMTRANS, SEMTRANS_LEXICON, $list_alt34, $list_alt73, $list_alt74);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_NOMINAL_SEMTRANS, SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_VERBAL, SEMTRANS_LEXICON, $list_alt53, $list_alt54, $list_alt83);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_VERBAL, SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_VERBAL_SEMTRANS, SEMTRANS_LEXICON, $list_alt34, $list_alt73, $list_alt86);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_VERBAL_SEMTRANS, SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD);
	methods.methods_incorporate_instance_method(NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, SEMTRANS_LEXICON, $list_alt34, $list_alt92, $list_alt93);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_ADJECTIVAL, SEMTRANS_LEXICON, $list_alt53, $list_alt54, $list_alt101);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_ADJECTIVAL, SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_ADVERBIAL, SEMTRANS_LEXICON, $list_alt53, $list_alt54, $list_alt104);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_ADVERBIAL, SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD);
	methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES, SEMTRANS_LEXICON, $list_alt34, $list_alt108, $list_alt109);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD);
	methods.methods_incorporate_class_method(TEXTRACT_LEMMA_TO_LEX_ENTRY, SEMTRANS_LEXICON, $list_alt34, $list_alt115, $list_alt116);
	methods.subloop_register_class_method(SEMTRANS_LEXICON, TEXTRACT_LEMMA_TO_LEX_ENTRY, SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD);
	methods.methods_incorporate_instance_method(RESPORATOR_TO_LEX_ENTRIES, SEMTRANS_LEXICON, $list_alt34, $list_alt134, $list_alt135);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, RESPORATOR_TO_LEX_ENTRIES, SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD);
	methods.methods_incorporate_instance_method(RESPORATOR_LEARN, SEMTRANS_LEXICON, $list_alt34, $list_alt141, $list_alt142);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, RESPORATOR_LEARN, SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD);
	methods.methods_incorporate_instance_method($sym145$RESPORATOR___LEARN, SEMTRANS_LEXICON, $list_alt34, $list_alt141, $list_alt146);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, $sym145$RESPORATOR___LEARN, $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD);
	methods.methods_incorporate_instance_method(STANFORD_NER_LEARN, SEMTRANS_LEXICON, $list_alt34, $list_alt141, $list_alt149);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN, SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD);
	methods.methods_incorporate_instance_method(STANFORD_NER_LEARN_TIGHTENED_TYPES, SEMTRANS_LEXICON, $list_alt34, $list_alt141, $list_alt153);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN_TIGHTENED_TYPES, SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD);
	methods.methods_incorporate_instance_method(STANFORD_NER_LEARN_INT, SEMTRANS_LEXICON, $list_alt34, $list_alt155, $list_alt156);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN_INT, SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD);
	methods.methods_incorporate_instance_method(NUMBER_LEARN, SEMTRANS_LEXICON, $list_alt34, $list_alt141, $list_alt171);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, NUMBER_LEARN, SEMTRANS_LEXICON_NUMBER_LEARN_METHOD);
	methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_WORD, SEMTRANS_LEXICON, $list_alt34, $list_alt108, $list_alt178);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_WORD, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD);
	methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_NAME, SEMTRANS_LEXICON, $list_alt34, $list_alt108, $list_alt188);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_NAME, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD);
	methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, SEMTRANS_LEXICON, $list_alt34, $list_alt190, $list_alt191);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME);
	methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NUMBER, SEMTRANS_LEXICON, $list_alt34, $list_alt196, $list_alt197);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NUMBER, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD);
	methods.methods_incorporate_instance_method(NOUN_COMPOUND_LEARN, SEMTRANS_LEXICON, $list_alt34, $list_alt141, $list_alt200);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, NOUN_COMPOUND_LEARN, SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
	methods.methods_incorporate_instance_method(COOCCURRENCE_STATISTICS_LEARN, SEMTRANS_LEXICON, $list_alt34, $list_alt141, $list_alt207);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, COOCCURRENCE_STATISTICS_LEARN, SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD);
	define_test_case_table_int(SEMTRANS_LEXICON_STANFORD_LEARN_TIGHTENED_TEST, list(new SubLObject[] { $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt236);
	define_test_case_table_int(SEMTRANS_LEXICON_STANFORD_LEARN_SIMPLE_TEST, list(new SubLObject[] { $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt238);
	return NIL;
    }

    public static SubLObject setup_semtrans_lexicon_file() {
	if (SubLFiles.USE_V1) {
	    classes.subloop_new_class(SEMTRANS_LEXICON, ABSTRACT_LEXICON, NIL, NIL, $list2);
	    classes.class_set_implements_slot_listeners(SEMTRANS_LEXICON, NIL);
	    classes.subloop_note_class_initialization_function(SEMTRANS_LEXICON, SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS);
	    classes.subloop_note_instance_initialization_function(SEMTRANS_LEXICON, SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE);
	    subloop_reserved_initialize_semtrans_lexicon_class(SEMTRANS_LEXICON);
	    methods.methods_incorporate_instance_method(INITIALIZE, SEMTRANS_LEXICON, $list34, NIL, $list35);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, INITIALIZE, SEMTRANS_LEXICON_INITIALIZE_METHOD);
	    methods.methods_incorporate_instance_method(GET_TERM_LEXICON, SEMTRANS_LEXICON, $list34, NIL, $list42);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, GET_TERM_LEXICON, SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD);
	    methods.methods_incorporate_instance_method(SET_TERM_LEXICON, SEMTRANS_LEXICON, $list34, $list48, $list49);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, SET_TERM_LEXICON, SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD);
	    methods.methods_incorporate_instance_method(FABRICATE, SEMTRANS_LEXICON, $list53, $list54, $list55);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE, SEMTRANS_LEXICON_FABRICATE_METHOD);
	    methods.methods_incorporate_instance_method(FABRICATE_NOMINAL, SEMTRANS_LEXICON, $list53, $list54, $list65);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_NOMINAL, SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD);
	    methods.methods_incorporate_instance_method(FABRICATE_NOMINAL_SEMTRANS, SEMTRANS_LEXICON, $list34, $list73, $list74);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_NOMINAL_SEMTRANS, SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD);
	    methods.methods_incorporate_instance_method(FABRICATE_VERBAL, SEMTRANS_LEXICON, $list53, $list54, $list83);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_VERBAL, SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD);
	    methods.methods_incorporate_instance_method(FABRICATE_VERBAL_SEMTRANS, SEMTRANS_LEXICON, $list34, $list73, $list86);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_VERBAL_SEMTRANS, SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD);
	    methods.methods_incorporate_instance_method(NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, SEMTRANS_LEXICON, $list34, $list92, $list93);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD);
	    methods.methods_incorporate_instance_method(FABRICATE_ADJECTIVAL, SEMTRANS_LEXICON, $list53, $list54, $list101);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_ADJECTIVAL, SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD);
	    methods.methods_incorporate_instance_method(FABRICATE_ADVERBIAL, SEMTRANS_LEXICON, $list53, $list54, $list104);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_ADVERBIAL, SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD);
	    methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES, SEMTRANS_LEXICON, $list34, $list108, $list109);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD);
	    methods.methods_incorporate_class_method(TEXTRACT_LEMMA_TO_LEX_ENTRY, SEMTRANS_LEXICON, $list34, $list115, $list116);
	    methods.subloop_register_class_method(SEMTRANS_LEXICON, TEXTRACT_LEMMA_TO_LEX_ENTRY, SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD);
	    methods.methods_incorporate_instance_method(RESPORATOR_TO_LEX_ENTRIES, SEMTRANS_LEXICON, $list34, $list134, $list135);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, RESPORATOR_TO_LEX_ENTRIES, SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD);
	    methods.methods_incorporate_instance_method(RESPORATOR_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list142);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, RESPORATOR_LEARN, SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD);
	    methods.methods_incorporate_instance_method($sym145$RESPORATOR___LEARN, SEMTRANS_LEXICON, $list34, $list141, $list146);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, $sym145$RESPORATOR___LEARN, $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD);
	    methods.methods_incorporate_instance_method(STANFORD_NER_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list149);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN, SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD);
	    methods.methods_incorporate_instance_method(STANFORD_NER_LEARN_TIGHTENED_TYPES, SEMTRANS_LEXICON, $list34, $list141, $list153);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN_TIGHTENED_TYPES, SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD);
	    methods.methods_incorporate_instance_method(STANFORD_NER_LEARN_INT, SEMTRANS_LEXICON, $list34, $list155, $list156);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN_INT, SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD);
	    methods.methods_incorporate_instance_method(NUMBER_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list171);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, NUMBER_LEARN, SEMTRANS_LEXICON_NUMBER_LEARN_METHOD);
	    methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_WORD, SEMTRANS_LEXICON, $list34, $list108, $list178);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_WORD, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD);
	    methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_NAME, SEMTRANS_LEXICON, $list34, $list108, $list188);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_NAME, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD);
	    methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, SEMTRANS_LEXICON, $list34, $list190, $list191);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME);
	    methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NUMBER, SEMTRANS_LEXICON, $list34, $list196, $list197);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NUMBER, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD);
	    methods.methods_incorporate_instance_method(NOUN_COMPOUND_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list200);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, NOUN_COMPOUND_LEARN, SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
	    methods.methods_incorporate_instance_method(COOCCURRENCE_STATISTICS_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list207);
	    methods.subloop_register_instance_method(SEMTRANS_LEXICON, COOCCURRENCE_STATISTICS_LEARN, SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD);
	}
	if (SubLFiles.USE_V2) {
	    define_test_case_table_int(SEMTRANS_LEXICON_STANFORD_LEARN_TIGHTENED_TEST, list(new SubLObject[] { $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt236);
	    define_test_case_table_int(SEMTRANS_LEXICON_STANFORD_LEARN_SIMPLE_TEST, list(new SubLObject[] { $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt238);
	}
	return NIL;
    }

    public static SubLObject setup_semtrans_lexicon_file_Previous() {
	classes.subloop_new_class(SEMTRANS_LEXICON, ABSTRACT_LEXICON, NIL, NIL, $list2);
	classes.class_set_implements_slot_listeners(SEMTRANS_LEXICON, NIL);
	classes.subloop_note_class_initialization_function(SEMTRANS_LEXICON, SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS);
	classes.subloop_note_instance_initialization_function(SEMTRANS_LEXICON, SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE);
	subloop_reserved_initialize_semtrans_lexicon_class(SEMTRANS_LEXICON);
	methods.methods_incorporate_instance_method(INITIALIZE, SEMTRANS_LEXICON, $list34, NIL, $list35);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, INITIALIZE, SEMTRANS_LEXICON_INITIALIZE_METHOD);
	methods.methods_incorporate_instance_method(GET_TERM_LEXICON, SEMTRANS_LEXICON, $list34, NIL, $list42);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, GET_TERM_LEXICON, SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD);
	methods.methods_incorporate_instance_method(SET_TERM_LEXICON, SEMTRANS_LEXICON, $list34, $list48, $list49);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, SET_TERM_LEXICON, SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE, SEMTRANS_LEXICON, $list53, $list54, $list55);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE, SEMTRANS_LEXICON_FABRICATE_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_NOMINAL, SEMTRANS_LEXICON, $list53, $list54, $list65);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_NOMINAL, SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_NOMINAL_SEMTRANS, SEMTRANS_LEXICON, $list34, $list73, $list74);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_NOMINAL_SEMTRANS, SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_VERBAL, SEMTRANS_LEXICON, $list53, $list54, $list83);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_VERBAL, SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_VERBAL_SEMTRANS, SEMTRANS_LEXICON, $list34, $list73, $list86);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_VERBAL_SEMTRANS, SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD);
	methods.methods_incorporate_instance_method(NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, SEMTRANS_LEXICON, $list34, $list92, $list93);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_ADJECTIVAL, SEMTRANS_LEXICON, $list53, $list54, $list101);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_ADJECTIVAL, SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD);
	methods.methods_incorporate_instance_method(FABRICATE_ADVERBIAL, SEMTRANS_LEXICON, $list53, $list54, $list104);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_ADVERBIAL, SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD);
	methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES, SEMTRANS_LEXICON, $list34, $list108, $list109);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD);
	methods.methods_incorporate_class_method(TEXTRACT_LEMMA_TO_LEX_ENTRY, SEMTRANS_LEXICON, $list34, $list115, $list116);
	methods.subloop_register_class_method(SEMTRANS_LEXICON, TEXTRACT_LEMMA_TO_LEX_ENTRY, SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD);
	methods.methods_incorporate_instance_method(RESPORATOR_TO_LEX_ENTRIES, SEMTRANS_LEXICON, $list34, $list134, $list135);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, RESPORATOR_TO_LEX_ENTRIES, SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD);
	methods.methods_incorporate_instance_method(RESPORATOR_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list142);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, RESPORATOR_LEARN, SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD);
	methods.methods_incorporate_instance_method($sym145$RESPORATOR___LEARN, SEMTRANS_LEXICON, $list34, $list141, $list146);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, $sym145$RESPORATOR___LEARN, $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD);
	methods.methods_incorporate_instance_method(STANFORD_NER_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list149);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN, SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD);
	methods.methods_incorporate_instance_method(STANFORD_NER_LEARN_TIGHTENED_TYPES, SEMTRANS_LEXICON, $list34, $list141, $list153);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN_TIGHTENED_TYPES, SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD);
	methods.methods_incorporate_instance_method(STANFORD_NER_LEARN_INT, SEMTRANS_LEXICON, $list34, $list155, $list156);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN_INT, SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD);
	methods.methods_incorporate_instance_method(NUMBER_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list171);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, NUMBER_LEARN, SEMTRANS_LEXICON_NUMBER_LEARN_METHOD);
	methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_WORD, SEMTRANS_LEXICON, $list34, $list108, $list178);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_WORD, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD);
	methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_NAME, SEMTRANS_LEXICON, $list34, $list108, $list188);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_NAME, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD);
	methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, SEMTRANS_LEXICON, $list34, $list190, $list191);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME);
	methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NUMBER, SEMTRANS_LEXICON, $list34, $list196, $list197);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NUMBER, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD);
	methods.methods_incorporate_instance_method(NOUN_COMPOUND_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list200);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, NOUN_COMPOUND_LEARN, SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
	methods.methods_incorporate_instance_method(COOCCURRENCE_STATISTICS_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list207);
	methods.subloop_register_instance_method(SEMTRANS_LEXICON, COOCCURRENCE_STATISTICS_LEARN, SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD);
	return NIL;
    }

    static private final SubLList $list_alt146 = list(makeString(
	    "@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT\n   @note this is a \'lazy\' variation of resporator that attempts to discover\n   shorter strings of type PERSON that exclude additional information like \n   \'French Prime Minister\' from the string \'French Prime Minister Jacques Chirac\'\n   and just returns \'Jacques Chirac\'."),
	    list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), NIL)),
		    list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-QUIRK"),
			    list(makeSymbol("CLET"), list(makeSymbol("TYPINGS"), makeSymbol("ERROR?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR?")), list(makeSymbol("CSETQ"), makeSymbol("TYPINGS"), list(makeSymbol("RESPORATOR++"), makeSymbol("TEXT")))),
				    list(makeSymbol("PWHEN"), makeSymbol("ERROR?"), list(makeSymbol("WARN"), makeSymbol("ERROR?")), list(RET, NIL)),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE.STRING"), makeSymbol("TYPINGS")),
					    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RESPORATOR-TO-LEX-ENTRIES")), makeSymbol("TYPE.STRING"))), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES")))))),
		    list(RET, makeSymbol("LEXES"))));

    static private final SubLList $list_alt149 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STANFORD-NER-LEARN-INT")), makeSymbol("TEXT"), NIL)));

    static private final SubLList $list_alt153 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STANFORD-NER-LEARN-INT")), makeSymbol("TEXT"), T)));

    static private final SubLList $list_alt155 = list(makeSymbol("TEXT"), makeSymbol("TIGHTEN-TYPES?"));

    public static final SubLObject $list_alt156 = com.cyc.cycjava.cycl.semtrans_lexicon._constant_156_initializer();

    static private final SubLList $list_alt166 = list(reader_make_constant_shell("pnNonPlural-Generic"));

    static private final SubLString $str_alt168$___S = makeString("~%~S");

    static private final SubLList $list_alt171 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NUMBERS"), list(makeSymbol("NUMBER-MEANINGS"), makeSymbol("TEXT"))), list(makeSymbol("RESULT"), NIL)),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("NUMBER"), makeSymbol("NUMBERS")),
		    list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("NUMBER-STRING"), makeSymbol("MEANING")), makeSymbol("NUMBER"),
			    list(makeSymbol("CLET"),
				    list(list(makeSymbol("KNOWN-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET")), makeSymbol("NUMBER-STRING"))),
					    list(makeSymbol("ALREADY-KNOWN"), list(makeSymbol("MEMBER?"), makeSymbol("MEANING"), makeSymbol("KNOWN-ENTRIES"), list(QUOTE, EQUAL), list(QUOTE, makeSymbol("LEX-ENTRY-SEMTRANS"))))),
				    list(makeSymbol("PUNLESS"), makeSymbol("ALREADY-KNOWN"), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NUMBER-SEMTRANS-LEX-ENTRY"), makeSymbol("NUMBER-STRING"), makeSymbol("MEANING")))),
					    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("RESULT"))))))),
	    list(RET, makeSymbol("RESULT"))));

    static private final SubLList $list_alt172 = list(makeSymbol("NUMBER-STRING"), makeSymbol("MEANING"));

    static private final SubLList $list_alt175 = list(makeKeyword("CD"));

    static private final SubLList $list_alt177 = list(makeSymbol("STANFORD-NER-LEARN"), makeSymbol("RESPORATOR++-LEARN"), makeSymbol("NUMBER-LEARN"));

    static private final SubLList $list_alt178 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("PRED"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-ENTRY"), NIL))),
	    list(makeSymbol("PCOND"),
		    list(list(makeSymbol("SEMTRANS-PRED?"), makeSymbol("PRED")),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("HL-TO-EL"), list(makeSymbol("NL-TRIE-WORD-SEMTRANS-TEMPLATES"), makeSymbol("NL-TRIE-ENTRY")))), list(new SubLObject[] { makeSymbol("CLET"),
				    list(list(makeSymbol("WU"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("POS"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("NL-TRIE-ENTRY"))),
					    list(makeSymbol("FRAME"), list(makeSymbol("NL-TRIE-WORD-FRAME"), makeSymbol("NL-TRIE-ENTRY"))),
					    list(makeSymbol("INFLECTIONS"),
						    list(makeSymbol("FIF"), makeSymbol("WU"), list(makeSymbol("INTERSECTION"), list(makeSymbol("PREDS-OF-STRING&WORD"), makeSymbol("STRING"), makeSymbol("WU")), list(makeSymbol("PREDS-OF-POS"), makeSymbol("POS"))),
							    list(QUOTE, list(reader_make_constant_shell("singular"), reader_make_constant_shell("plural"))))),
					    list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), makeSymbol("POS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), makeSymbol("SEMTRANS")),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), makeSymbol("FRAME")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("WORD-UNIT"), makeSymbol("WU")),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), makeSymbol("INFLECTIONS")),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) }))),
		    list(list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), makeSymbol("PRED"), list(QUOTE, list(reader_make_constant_shell("denotation"), reader_make_constant_shell("multiWordString")))),
			    list(makeSymbol("GENL-POS?"), list(makeSymbol("NL-TRIE-WORD-POS"), makeSymbol("NL-TRIE-ENTRY")), reader_make_constant_shell("Noun"))),
			    list(makeSymbol("WITH-ALL-MTS"),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-ENTRY"))),
					    list(makeSymbol("PUNLESS"), list(makeSymbol("PREDICATE-P"), makeSymbol("DENOT")), list(new SubLObject[] { makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("NL-TRIE-WORD-POS-PREDS"), makeSymbol("NL-TRIE-ENTRY"))),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), list(makeSymbol("NL-TRIE-WORD-POS"), makeSymbol("NL-TRIE-ENTRY"))),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
							    list(makeSymbol("LIST"), list(makeSymbol("FIF"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("DENOT"), reader_make_constant_shell("Collection")), reader_make_constant_shell("isa"), reader_make_constant_shell("equals")),
								    $NOUN, list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("WORD-UNIT"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-ENTRY"), NIL)),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
						    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })))))),
	    list(RET, makeSymbol("LEX-ENTRIES"))));

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_156_initializer_alt() {
	return list(makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of semtrans lexical entries learned from TEXT"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("CLET"),
		list(list(makeSymbol("NEW-LEXES"), NIL), list(makeSymbol("SNER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("STANFORD-NER")))), list(makeSymbol("ENTITY-CLUSTERS"), list(makeSymbol("FIM"), makeSymbol("SNER"), list(QUOTE, makeSymbol("RUN")), makeSymbol("TEXT"))),
			list(makeSymbol("TERM-LEXICON"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TERM-LEXICON")))), makeSymbol("ERROR")),
		list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")),
			list(makeSymbol("CDOLIST"), list(makeSymbol("EC"), makeSymbol("ENTITY-CLUSTERS")), list(makeSymbol("CDOLIST"), list(makeSymbol("NAMENT"), makeSymbol("EC")), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(QUOTE, makeSymbol("SET-LEXICON")), makeSymbol("TERM-LEXICON")),
				list(makeSymbol("PUNLESS"), list(EQL, list(QUOTE, makeSymbol("O")), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(QUOTE, makeSymbol("GET-TYPE")))),
					list(makeSymbol("CLET"), list(list(makeSymbol("TYPE"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(QUOTE, makeSymbol("GET-CYC")))),
						list(makeSymbol("SUBTYPES"), list(makeSymbol("FWHEN"), list(makeSymbol("CAND"), makeSymbol("TIGHTEN-TYPES?"), makeSymbol("TYPE")), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(QUOTE, makeSymbol("TIGHTEN-TYPE")))))),
						list(makeSymbol("INSTANCE-MEANINGS"), list(makeSymbol("GET-NAMENT-INSTANCE-MEANING"), makeSymbol("NAMENT"))), list(makeSymbol("STRING"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(QUOTE, makeSymbol("GET-STRING")))),
						list(makeSymbol("EXISTING-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("TERM-LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("STRING"))), list(makeSymbol("ENTITY-LEXES"))),
						list(makeSymbol("PIF"), makeSymbol("INSTANCE-MEANINGS"),
							list(makeSymbol("CDOLIST"), list(makeSymbol("INSTANCE-MEANING"), makeSymbol("INSTANCE-MEANINGS")),
								list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("equals"), $NOUN, makeSymbol("INSTANCE-MEANING"))),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(QUOTE, list(reader_make_constant_shell("pnNonPlural-Generic")))),
									list(makeSymbol("PUNLESS"), list(makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), makeSymbol("EXISTING-ENTRIES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD")), makeSymbol("LEX-ENTRY")),
										list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("ENTITY-LEXES"))))),
							list(makeSymbol("CDOLIST"), list(makeSymbol("SUBTYPE"), makeSymbol("SUBTYPES")),
								list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
										list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN, makeSymbol("SUBTYPE")),
											list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, makeSymbol("STRING")))),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(QUOTE, list(reader_make_constant_shell("pnNonPlural-Generic")))),
									list(makeSymbol("PUNLESS"), list(makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), makeSymbol("EXISTING-ENTRIES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD")), makeSymbol("LEX-ENTRY")),
										list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("ENTITY-LEXES")))))),
						list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), makeSymbol("ENTITY-LEXES"), list(makeSymbol("NULL"), makeSymbol("TYPE"))),
							list(makeSymbol("CLET"),
								list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY")))),
									list(makeSymbol("EXISTING-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("TERM-LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("STRING")))),
								list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
								list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
									list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN, makeSymbol("TYPE")),
										list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, makeSymbol("STRING")))),
								list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
								list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(QUOTE, list(reader_make_constant_shell("pnNonPlural-Generic")))),
								list(makeSymbol("PUNLESS"), list(makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), makeSymbol("EXISTING-ENTRIES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD")), makeSymbol("LEX-ENTRY")),
									list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("ENTITY-LEXES"))))),
						list(makeSymbol("CPUSH-ALL"), makeSymbol("ENTITY-LEXES"), makeSymbol("NEW-LEXES"))))))),
		list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeString("~%~S"), makeSymbol("ERROR"))), list(RET, makeSymbol("NEW-LEXES"))));
    }

    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static SubLObject _constant_156_initializer() {
	return list(makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of semtrans lexical entries learned from TEXT"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("CLET"),
		list(list(makeSymbol("NEW-LEXES"), NIL), list(makeSymbol("SNER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("STANFORD-NER")))), list(makeSymbol("ENTITY-CLUSTERS"), list(makeSymbol("FIM"), makeSymbol("SNER"), list(QUOTE, makeSymbol("RUN")), makeSymbol("TEXT"))),
			list(makeSymbol("TERM-LEXICON"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-TERM-LEXICON")))), makeSymbol("ERROR")),
		list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")),
			list(makeSymbol("CDOLIST"), list(makeSymbol("EC"), makeSymbol("ENTITY-CLUSTERS")), list(makeSymbol("CDOLIST"), list(makeSymbol("NAMENT"), makeSymbol("EC")), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(QUOTE, makeSymbol("SET-LEXICON")), makeSymbol("TERM-LEXICON")),
				list(makeSymbol("PUNLESS"), list(EQL, list(QUOTE, makeSymbol("O")), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(QUOTE, makeSymbol("GET-TYPE")))),
					list(makeSymbol("CLET"), list(list(makeSymbol("TYPE"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(QUOTE, makeSymbol("GET-CYC")))),
						list(makeSymbol("SUBTYPES"), list(makeSymbol("FWHEN"), list(makeSymbol("CAND"), makeSymbol("TIGHTEN-TYPES?"), makeSymbol("TYPE")), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(QUOTE, makeSymbol("TIGHTEN-TYPE")))))),
						list(makeSymbol("INSTANCE-MEANINGS"), list(makeSymbol("GET-NAMENT-INSTANCE-MEANING"), makeSymbol("NAMENT"))), list(makeSymbol("STRING"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(QUOTE, makeSymbol("GET-STRING")))),
						list(makeSymbol("EXISTING-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("TERM-LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("STRING"))), list(makeSymbol("ENTITY-LEXES"))),
						list(makeSymbol("PIF"), makeSymbol("INSTANCE-MEANINGS"),
							list(makeSymbol("CDOLIST"), list(makeSymbol("INSTANCE-MEANING"), makeSymbol("INSTANCE-MEANINGS")),
								list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("equals"), $NOUN, makeSymbol("INSTANCE-MEANING"))),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(QUOTE, list(reader_make_constant_shell("pnNonPlural-Generic")))),
									list(makeSymbol("PUNLESS"), list(makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), makeSymbol("EXISTING-ENTRIES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD")), makeSymbol("LEX-ENTRY")),
										list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("ENTITY-LEXES"))))),
							list(makeSymbol("CDOLIST"), list(makeSymbol("SUBTYPE"), makeSymbol("SUBTYPES")),
								list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
										list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN, makeSymbol("SUBTYPE")),
											list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, makeSymbol("STRING")))),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
									list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(QUOTE, list(reader_make_constant_shell("pnNonPlural-Generic")))),
									list(makeSymbol("PUNLESS"), list(makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), makeSymbol("EXISTING-ENTRIES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD")), makeSymbol("LEX-ENTRY")),
										list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("ENTITY-LEXES")))))),
						list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), makeSymbol("ENTITY-LEXES"), list(makeSymbol("NULL"), makeSymbol("TYPE"))),
							list(makeSymbol("CLET"),
								list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY")))),
									list(makeSymbol("EXISTING-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("TERM-LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("STRING")))),
								list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")),
								list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
									list(makeSymbol("BQ-LIST"), reader_make_constant_shell("and"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN, makeSymbol("TYPE")),
										list(makeSymbol("BQ-LIST"), reader_make_constant_shell("nameString"), $NOUN, makeSymbol("STRING")))),
								list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
								list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(QUOTE, list(reader_make_constant_shell("pnNonPlural-Generic")))),
								list(makeSymbol("PUNLESS"), list(makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), makeSymbol("EXISTING-ENTRIES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ADD")), makeSymbol("LEX-ENTRY")),
									list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("ENTITY-LEXES"))))),
						list(makeSymbol("CPUSH-ALL"), makeSymbol("ENTITY-LEXES"), makeSymbol("NEW-LEXES"))))))),
		list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeString("~%~S"), makeSymbol("ERROR"))), list(RET, makeSymbol("NEW-LEXES"))));
    }// Internal Constant Initializer Methods

    static private final SubLList $list_alt179 = list(reader_make_constant_shell("singular"), reader_make_constant_shell("plural"));

    static private final SubLList $list_alt182 = list(reader_make_constant_shell("denotation"), reader_make_constant_shell("multiWordString"));

    static private final SubLList $list_alt188 = list(
	    makeString("@param STRING stringp; the string of the lex entries to be constructed\n   @param NL-TRIE-ENTRY; the nl trie entry out of which to construct a list of lex entries\n   @return listp; a list of semtrans lex entries for STRING and NL-TRIE-ENTRY"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL)),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-ENTRY"))),
			    list(new SubLObject[] { makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY")))), list(makeSymbol("COLLECTION?"), list(makeSymbol("COLLECTION-P"), makeSymbol("DENOT")))),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
					    list(makeSymbol("LIST"), list(makeSymbol("FIF"), makeSymbol("COLLECTION?"), reader_make_constant_shell("isa"), reader_make_constant_shell("equals")), $NOUN, list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell("ProperNoun")),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(QUOTE, list(reader_make_constant_shell("pnNonPlural-Generic")))),
				    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-ENTRY")),
				    list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })),
		    list(RET, makeSymbol("LEX-ENTRIES"))));

    static private final SubLList $list_alt190 = list(makeSymbol("STRING"), makeSymbol("TP-ENTRY"));

    static private final SubLList $list_alt191 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("POS"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("TP-ENTRY"))), list(makeSymbol("INFLECTIONS"), list(makeSymbol("NL-TRIE-ENTRY-POS-PREDS"), makeSymbol("TP-ENTRY"))),
		    list(makeSymbol("PREDICATE"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("TP-ENTRY"), NIL)), list(makeSymbol("PRAGMATICS"), list(makeSymbol("NL-TRIE-ENTRY-PRAGMATICS"), makeSymbol("TP-ENTRY")))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("TP-ENTRY"))),
		    list(new SubLObject[] { makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY")))), list(makeSymbol("COLLECTION?"), list(makeSymbol("COLLECTION-P"), makeSymbol("DENOT")))),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("PRAGMATICS"), makeSymbol("PRAGMATICS")),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"),
				    list(makeSymbol("LIST"), list(makeSymbol("FIF"), makeSymbol("COLLECTION?"), reader_make_constant_shell("isa"), reader_make_constant_shell("equals")), $NOUN, list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("PREDICATE"), makeSymbol("PREDICATE")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("CYC-POS"), makeSymbol("POS")),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("INFLECTIONS"), makeSymbol("INFLECTIONS")),
			    list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(QUOTE, makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("TP-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })),
	    list(RET, makeSymbol("LEX-ENTRIES"))));

    @Override
    public void declareFunctions() {
	declare_semtrans_lexicon_file();
    }

    @Override
    public void initializeVariables() {
	init_semtrans_lexicon_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_semtrans_lexicon_file();
    }

    static {
    }

    static private final SubLList $list_alt196 = list(makeSymbol("NUMBER-STRING"));

    static private final SubLList $list_alt197 = list(list(makeSymbol("IGNORE"), makeSymbol("NUMBER-STRING")), list(RET, NIL));

    static private final SubLList $list_alt200 = list(list(RET, list(makeSymbol("TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES"), makeSymbol("TEXT"))));

    static private final SubLList $list_alt203 = list(reader_make_constant_shell("plural-Generic"));

    static private final SubLList $list_alt204 = list(makeKeyword("NNS"));

    static private final SubLList $list_alt205 = list(makeKeyword("NN"));

    static private final SubLList $list_alt207 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("PARSE"), list(makeSymbol("FIM"), list(makeSymbol("NEW-STANFORD-PARSER")), list(QUOTE, makeSymbol("PARSE")), makeSymbol("TEXT"))),
		    list(makeSymbol("WORDS"), list(makeSymbol("FWHEN"), makeSymbol("PARSE"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("YIELD"))))), list(makeSymbol("LEXES"), NIL), list(makeSymbol("LEARNED-NOUNS"), NIL)),
	    list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-NOUNLEARNER"), list(makeSymbol("CSETQ"), makeSymbol("LEARNED-NOUNS"), list(makeSymbol("LEARN-UNKNOWN-NOUNS-FROM-PARSE-TREE"), makeSymbol("PARSE")))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("LEARNED-NOUN"), makeSymbol("LEARNED-NOUNS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("LEARNED-STRING"), makeSymbol("TYPE"), makeSymbol("RELATIONSHIP"), makeSymbol("CONFIDENCE")), makeSymbol("LEARNED-NOUN"),
		    list(makeSymbol("IGNORE"), makeSymbol("CONFIDENCE")),
		    list(makeSymbol("CLET"), list(list(makeSymbol("PENN-TAGS"), NIL), makeSymbol("PARSED-STRING"), makeSymbol("SINGULARIZED-STRING"), makeSymbol("SEMTRANS")),
			    list(makeSymbol("CSOME"), list(makeSymbol("WORD"), makeSymbol("WORDS"), makeSymbol("PENN-TAGS")), list(makeSymbol("CSETQ"), makeSymbol("PARSED-STRING"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-STRING")))),
				    list(makeSymbol("PWHEN"), makeSymbol("PARSED-STRING"), list(makeSymbol("CSETQ"), makeSymbol("SINGULARIZED-STRING"), list(makeSymbol("SINGULARIZE-WORD"), makeSymbol("PARSED-STRING")))),
				    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("SINGULARIZED-STRING"), makeSymbol("LEARNED-STRING")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-CATEGORY"))), makeSymbol("PENN-TAGS")))),
			    list(makeSymbol("PCASE"), makeSymbol("RELATIONSHIP"), list(makeKeyword("ISA"), list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("equals"), $NOUN, makeSymbol("TYPE")))), list(makeKeyword("GENLS"),
				    list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS"),
					    list(makeSymbol("BQ-LIST"), reader_make_constant_shell("isa"), $NOUN, list(makeSymbol("BQ-LIST"), reader_make_constant_shell("SubCollectionNamedFn"), makeSymbol("SINGULARIZED-STRING"), makeSymbol("TYPE")))))),
			    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("PENN-TAGS"), makeSymbol("SEMTRANS")),
				    list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("PARSED-STRING")),
					    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("PENN-TAGS"), makeSymbol("PENN-TAGS")),
					    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell("RegularNounFrame")),
					    list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("SET")), makeKeyword("SEMTRANS"), makeSymbol("SEMTRANS")), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES"))))))),
	    list(RET, makeSymbol("LEXES"))));

    static private final SubLList $list_alt210 = list(makeSymbol("LEARNED-STRING"), makeSymbol("TYPE"), makeSymbol("RELATIONSHIP"), makeSymbol("CONFIDENCE"));

    static private final SubLList $list_alt220 = list(TWO_INTEGER, ZERO_INTEGER);

    private static final SubLSymbol SEMTRANS_LEXICON_STANFORD_LEARN_TIGHTENED_TEST = makeSymbol("SEMTRANS-LEXICON-STANFORD-LEARN-TIGHTENED-TEST");

    static private final SubLString $$$daves = makeString("daves");

    static private final SubLList $list_alt236 = list(list(list(makeString("Canadian David Slizer lives in the woods")),
	    list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("CanadianPerson")), list(reader_make_constant_shell("nameString"), $NOUN, makeString("David Slizer"))))));

    private static final SubLSymbol SEMTRANS_LEXICON_STANFORD_LEARN_SIMPLE_TEST = makeSymbol("SEMTRANS-LEXICON-STANFORD-LEARN-SIMPLE-TEST");

    static private final SubLList $list_alt238 = list(list(list(makeString("Canadian David Slizer lives in the woods")),
	    list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), $NOUN, reader_make_constant_shell("Person")), list(reader_make_constant_shell("nameString"), $NOUN, makeString("David Slizer"))))));
}

/**
 * Total time: 1195 ms
 */
