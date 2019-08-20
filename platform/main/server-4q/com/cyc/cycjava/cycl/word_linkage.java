/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WORD-LINKAGE
 * source file: /cyc/top/cycl/word-linkage.lisp
 * created:     2019/07/03 17:38:56
 */
public final class word_linkage extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new word_linkage();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol WORD_LINKAGE_WORD = makeSymbol("WORD-LINKAGE-WORD");

    static private final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("LINKAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("POS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEFT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RIGHT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEXES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LINKAGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ABS-INDEX"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CATEGORY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDEX"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEFT-LINKS"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RIGHT-LINKS"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LINKS"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTLY-RELATED"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RELATED"), list(makeSymbol("LINK-PATH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY"), list(makeSymbol("LEXICON")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POS-FILTER-LEXES"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-INSTANCE");

    static private final SubLList $list17 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list18 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list19 = list(new SubLObject[]{ makeString("Prints this link word to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<LW"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString("("), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("POS"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString("): "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("STRING"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");

    static private final SubLString $str21$__LW = makeString("#<LW");

    static private final SubLString $str22$_ = makeString("(");

    static private final SubLString $str23$___ = makeString("): ");

    static private final SubLString $str24$_ = makeString(">");

    private static final SubLSymbol WORD_LINKAGE_WORD_PRINT_METHOD = makeSymbol("WORD-LINKAGE-WORD-PRINT-METHOD");

    static private final SubLList $list27 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list28 = list(makeString("@return word-linkage-p; the linkage this word is a part of"), list(RET, makeSymbol("LINKAGE")));

    static private final SubLSymbol $sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_LINKAGE_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-LINKAGE-METHOD");

    static private final SubLList $list32 = list(makeString("@return string; the surface string of this word"), list(RET, makeSymbol("STRING")));

    static private final SubLSymbol $sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_STRING_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-STRING-METHOD");

    private static final SubLSymbol GET_ABS_INDEX = makeSymbol("GET-ABS-INDEX");

    static private final SubLList $list36 = list(makeString("@return numberp; the absolute index of this word"), list(RET, makeSymbol("INDEX")));

    static private final SubLSymbol $sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_ABS_INDEX_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-ABS-INDEX-METHOD");

    private static final SubLSymbol GET_POS = makeSymbol("GET-POS");

    static private final SubLList $list40 = list(makeString("@return keywordp; the part of speech of this word"), list(RET, makeSymbol("POS")));

    static private final SubLSymbol $sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_POS_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-POS-METHOD");

    static private final SubLList $list44 = list(makeString("@return keywordp; the part of speech of this word"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POS")))));

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_CATEGORY_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-CATEGORY-METHOD");

    static private final SubLList $list47 = list(makeString("@return numberp; the index of this word"), list(RET, makeSymbol("INDEX")));

    static private final SubLSymbol $sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_INDEX_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-INDEX-METHOD");

    static private final SubLList $list51 = list(makeString("@return numberp; the lexical items for this word"), list(RET, makeSymbol("LEXES")));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_LEXES_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-LEXES-METHOD");

    static private final SubLList $list55 = list(makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATTERN"));

    static private final SubLList $list56 = list(list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LINK-PATTERN"), makeSymbol("REGEX-PATTERN-P")), list(makeSymbol("PUNLESS"), makeSymbol("LINK-PATTERN"), list(RET, makeSymbol("LEFT-LINKS"))), list(makeSymbol("CLET"), list(makeSymbol("LINKS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LINK"), makeSymbol("LEFT-LINKS")), list(makeSymbol("PWHEN"), list(makeSymbol("REGEX-MATCH?"), makeSymbol("LINK-PATTERN"), list(makeSymbol("LINK-NAME"), makeSymbol("LINK"))), list(makeSymbol("CPUSH"), makeSymbol("LINK"), makeSymbol("LINKS")))), list(RET, makeSymbol("LINKS"))));

    static private final SubLSymbol $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_LEFT_LINKS_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-LEFT-LINKS-METHOD");

    static private final SubLList $list61 = list(list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LINK-PATTERN"), makeSymbol("REGEX-PATTERN-P")), list(makeSymbol("PUNLESS"), makeSymbol("LINK-PATTERN"), list(RET, makeSymbol("RIGHT-LINKS"))), list(makeSymbol("CLET"), list(makeSymbol("LINKS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LINK"), makeSymbol("RIGHT-LINKS")), list(makeSymbol("PWHEN"), list(makeSymbol("REGEX-MATCH?"), makeSymbol("LINK-PATTERN"), list(makeSymbol("LINK-NAME"), makeSymbol("LINK"))), list(makeSymbol("CPUSH"), makeSymbol("LINK"), makeSymbol("LINKS")))), list(RET, makeSymbol("LINKS"))));

    static private final SubLSymbol $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_RIGHT_LINKS_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-RIGHT-LINKS-METHOD");

    private static final SubLSymbol GET_LINKS = makeSymbol("GET-LINKS");

    static private final SubLList $list65 = list(list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LINK-PATTERN"), makeSymbol("REGEX-PATTERN-P")), list(RET, list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LEFT-LINKS")), makeSymbol("LINK-PATTERN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RIGHT-LINKS")), makeSymbol("LINK-PATTERN")))));

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_LINKS_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-LINKS-METHOD");

    static private final SubLList $list68 = list(makeSymbol("PATTERN-KEYWORD"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"));

    static private final SubLList $list69 = list(makeString("@param PATTERN-KEYWORD keywordp;\n   @return list; the list of words that is related to this word via \n     PATTERN-KEYWORD"), list(makeSymbol("CLET"), list(list(makeSymbol("LINK-PATTERN"), list(makeSymbol("GET-LINK-PATTERN"), makeSymbol("PATTERN-KEYWORD"))), list(makeSymbol("LINK-GETTER"), list(makeSymbol("FCOND"), list(list(makeSymbol("NULL"), makeSymbol("DIRECTION")), list(QUOTE, makeSymbol("GET-LINKS"))), list(list(EQL, makeSymbol("DIRECTION"), $LEFT), list(QUOTE, makeSymbol("GET-LEFT-LINKS"))), list(list(EQL, makeSymbol("DIRECTION"), makeKeyword("RIGHT")), list(QUOTE, makeSymbol("GET-RIGHT-LINKS"))), list(T, list(makeSymbol("ERROR"), makeString("Invalid link direction ~a"), makeSymbol("DIRECTION"))))), makeSymbol("WORDS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LINK"), list(makeSymbol("FIM"), makeSymbol("SELF"), makeSymbol("LINK-GETTER"), makeSymbol("LINK-PATTERN"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("LINK-LEFT-WORD"), makeSymbol("LINK")), makeSymbol("SELF")), list(makeSymbol("CPUSH"), list(makeSymbol("LINK-RIGHT-WORD"), makeSymbol("LINK")), makeSymbol("WORDS")), list(makeSymbol("CPUSH"), list(makeSymbol("LINK-LEFT-WORD"), makeSymbol("LINK")), makeSymbol("WORDS")))), list(RET, makeSymbol("WORDS"))));

    static private final SubLString $str72$Invalid_link_direction__a = makeString("Invalid link direction ~a");

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_DIRECTLY_RELATED_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-DIRECTLY-RELATED-METHOD");

    static private final SubLList $list75 = list(makeSymbol("LINK-PATH"));

    static private final SubLList $list76 = list(makeString("@param LINK-PATH list; a sequence of link-patterns\n   @return list; the list of words that is related to this word via LINK-PATH, \n      in that order"), list(makeSymbol("PUNLESS"), makeSymbol("LINK-PATH"), list(RET, list(makeSymbol("LIST"), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(makeSymbol("WORDS")), list(makeSymbol("CDOLIST"), list(makeSymbol("RELATED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DIRECTLY-RELATED")), list(makeSymbol("CAR"), makeSymbol("LINK-PATH")))), list(makeSymbol("CSETQ"), makeSymbol("WORDS"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("RELATED"), list(QUOTE, makeSymbol("GET-RELATED")), list(makeSymbol("CDR"), makeSymbol("LINK-PATH"))), makeSymbol("WORDS")))), list(RET, makeSymbol("WORDS"))));

    private static final SubLSymbol WORD_LINKAGE_WORD_GET_RELATED_METHOD = makeSymbol("WORD-LINKAGE-WORD-GET-RELATED-METHOD");

    static private final SubLList $list79 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list80 = list(makeSymbol("LEXICON"));

    static private final SubLList $list81 = list(makeString("@param LEXICON semtrans-lexicon-p; the lexicon to lexify this word with\n   @return listp; the list of lex entries used to lexify this word\n   @side-effects alters this word\'s lexes slot\n   see @xref link-word:lexify; this is a simpler version of that function"), list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("STRING"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STRING"))))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")), list(makeSymbol("NEW-EVEN-LEX-ENTRY-DISTRIBUTION"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("STRING")))), list(makeSymbol("PWHEN"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES"))), list(makeSymbol("CSETQ"), makeSymbol("FILTERED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POS-FILTER-LEXES"))))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")), makeSymbol("FILTERED")), list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES"))))));

    private static final SubLSymbol WORD_LINKAGE_WORD_LEXIFY_METHOD = makeSymbol("WORD-LINKAGE-WORD-LEXIFY-METHOD");

    static private final SubLList $list85 = list(makeString("Removes any lexical entries that don't match the part-of-speech of this word"), list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("PCOND"), list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POS"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS"))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))), list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POS"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("BACKOFF-PENN-TAGS"))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), makeDouble(0.75)), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(RET, makeSymbol("LEXES"))));

    static private final SubLSymbol $sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-WORD-METHOD");

    private static final SubLSymbol $BACKOFF_PENN_TAGS = makeKeyword("BACKOFF-PENN-TAGS");

    private static final SubLFloat $float$0_75 = makeDouble(0.75);

    private static final SubLSymbol WORD_LINKAGE_WORD_POS_FILTER_LEXES_METHOD = makeSymbol("WORD-LINKAGE-WORD-POS-FILTER-LEXES-METHOD");

    static private final SubLList $list91 = list(makeString("LEFT-WALL"), makeString("RIGHT-WALL"));

    private static final SubLSymbol WORD_LINKAGE = makeSymbol("WORD-LINKAGE");

    static private final SubLList $list93 = list(new SubLObject[]{ list(makeSymbol("LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WORDS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DIAGRAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TREE-STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-DIAGRAM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("XML"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TREE-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-WORD"), list(makeSymbol("I")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY"), list(makeSymbol("LEXICON")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("YIELD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEARCH"), list(makeSymbol("WORD-STRING")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol TREE_STRING = makeSymbol("TREE-STRING");

    private static final SubLSymbol DIAGRAM = makeSymbol("DIAGRAM");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-INSTANCE");

    static private final SubLString $$$ID = makeString("ID");

    static private final SubLSymbol $sym101$INCOMPLETE_LINK_ = makeSymbol("INCOMPLETE-LINK?");

    static private final SubLString $str103$word_linkage = makeString("word-linkage");

    static private final SubLString $str104$_a_is_not_a_linkage_xml_string = makeString("~a is not a linkage xml string");

    static private final SubLString $$$words = makeString("words");

    static private final SubLString $$$links = makeString("links");

    static private final SubLString $$$cat = makeString("cat");

    static private final SubLString $str108$_ = makeString(".");

    static private final SubLList $list109 = list(makeSymbol("&KEY"), list(makeSymbol("OPTIONS"), makeSymbol("*LINK-PARSE-OPTIONS*")), list(makeSymbol("LEXICON"), NIL), list(makeSymbol("USE-STANDARDIZED-WORD-STRINGS?"), T));

    static private final SubLList $list110 = list(makeKeyword("OPTIONS"), makeKeyword("LEXICON"), makeKeyword("USE-STANDARDIZED-WORD-STRINGS?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $kw114$USE_STANDARDIZED_WORD_STRINGS_ = makeKeyword("USE-STANDARDIZED-WORD-STRINGS?");

    static private final SubLList $list117 = list(makeString("Prints this word-linkage to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CDOVECTOR"), list(makeSymbol("WORD"), makeSymbol("WORDS")), list(makeSymbol("PRINC"), makeSymbol("WORD"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");

    private static final SubLSymbol WORD_LINKAGE_PRINT_METHOD = makeSymbol("WORD-LINKAGE-PRINT-METHOD");

    private static final SubLSymbol PRINT_DIAGRAM = makeSymbol("PRINT-DIAGRAM");

    static private final SubLList $list121 = list(makeString("Prints this word-linkage's diagram"), list(makeSymbol("PRINC"), makeSymbol("DIAGRAM")), list(RET, NIL));

    static private final SubLSymbol $sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");

    private static final SubLSymbol WORD_LINKAGE_PRINT_DIAGRAM_METHOD = makeSymbol("WORD-LINKAGE-PRINT-DIAGRAM-METHOD");

    static private final SubLList $list125 = list(makeString("@return stringp; the XML string representation of this linkage"), list(makeSymbol("CLET"), list(makeSymbol("XML"), list(makeSymbol("INDENT"), ZERO_INTEGER)), list(new SubLObject[]{ makeSymbol("CWITH-OUTPUT-TO-STRING"), list(makeSymbol("STREAM"), makeSymbol("XML")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<word-linkage>~%")), list(makeSymbol("TAB"), list(makeSymbol("+"), makeSymbol("INDENT"), THREE_INTEGER), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<words>~%")), list(makeSymbol("DO-LINKAGE-WORDS"), list(makeSymbol("WORD"), makeSymbol("SELF")), list(makeSymbol("WORD-LINKAGE-WORD-XML"), makeSymbol("WORD"), makeSymbol("STREAM"), list(makeSymbol("+"), makeSymbol("INDENT"), SIX_INTEGER))), list(makeSymbol("TAB"), list(makeSymbol("+"), makeSymbol("INDENT"), THREE_INTEGER), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("</words>~%")), list(makeSymbol("LINKS-XML"), list(makeSymbol("GET-WORD-LINKAGE-LINKS"), makeSymbol("SELF")), makeSymbol("STREAM"), list(makeSymbol("+"), makeSymbol("INDENT"), THREE_INTEGER)), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("</word-linkage>~%")) }), list(RET, makeSymbol("XML"))));

    static private final SubLString $str126$_word_linkage___ = makeString("<word-linkage>~%");

    static private final SubLString $str127$_words___ = makeString("<words>~%");

    static private final SubLString $str128$__words___ = makeString("</words>~%");

    static private final SubLString $str129$__word_linkage___ = makeString("</word-linkage>~%");

    private static final SubLSymbol WORD_LINKAGE_XML_METHOD = makeSymbol("WORD-LINKAGE-XML-METHOD");

    static private final SubLString $str131$_word_cat___a___a__word___ = makeString("<word cat=\"~a\">~a</word>~%");

    static private final SubLList $list133 = list(makeString("@return integerp; the number of words in this word-linkage"), list(RET, list(makeSymbol("-"), list(makeSymbol("LENGTH"), makeSymbol("WORDS")), TWO_INTEGER)));

    static private final SubLSymbol $sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");

    private static final SubLSymbol WORD_LINKAGE_LENGTH_METHOD = makeSymbol("WORD-LINKAGE-LENGTH-METHOD");

    private static final SubLSymbol GET_TREE_STRING = makeSymbol("GET-TREE-STRING");

    static private final SubLList $list137 = list(makeString("@return stringp; the tree of this word-linkage, as a string"), list(RET, makeSymbol("TREE-STRING")));

    static private final SubLSymbol $sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");

    private static final SubLSymbol WORD_LINKAGE_GET_TREE_STRING_METHOD = makeSymbol("WORD-LINKAGE-GET-TREE-STRING-METHOD");

    static private final SubLList $list141 = list(makeSymbol("I"));

    static private final SubLList $list142 = list(makeString("@param I non-negative-integer\n   @return word-linkage-word-p; the Ith word of this word-linkage"), list(makeSymbol("CHECK-TYPE"), makeSymbol("I"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("PUNLESS"), list(makeSymbol(">"), makeSymbol("I"), list(makeSymbol("1-"), list(makeSymbol("LENGTH"), makeSymbol("WORDS")))), list(RET, list(makeSymbol("AREF"), makeSymbol("WORDS"), makeSymbol("I")))));

    static private final SubLSymbol $sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");

    private static final SubLSymbol WORD_LINKAGE_GET_WORD_METHOD = makeSymbol("WORD-LINKAGE-GET-WORD-METHOD");

    static private final SubLList $list146 = list(makeString("@param LEXICON semtrans-lexicon-p; the lexicon to lexify with\n   @return word-linkage-p; this word-linkage destructively lexified with \n     lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("LEXICON"), makeSymbol("ABSTRACT-LEXICON-P")), list(makeSymbol("DO-LINKAGE-WORDS"), list(makeSymbol("WORD"), makeSymbol("SELF")), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("LEXIFY")), makeSymbol("LEXICON"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol WORD_LINKAGE_LEXIFY_METHOD = makeSymbol("WORD-LINKAGE-LEXIFY-METHOD");

    static private final SubLList $list150 = list(list(makeSymbol("CLET"), list(makeSymbol("YIELD")), list(makeSymbol("DO-LINKAGE-WORDS"), list(makeSymbol("WORD"), makeSymbol("SELF")), list(makeSymbol("CPUSH"), makeSymbol("WORD"), makeSymbol("YIELD"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("YIELD")))));

    private static final SubLSymbol WORD_LINKAGE_YIELD_METHOD = makeSymbol("WORD-LINKAGE-YIELD-METHOD");

    static private final SubLList $list153 = list(makeSymbol("WORD-STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("N"), ONE_INTEGER));

    static private final SubLList $list154 = list(makeString("@return word-linkage-word-p; the Nth word with string WORD-STRING"), list(makeSymbol("CHECK-TYPE"), makeSymbol("WORD-STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("N"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("CLET"), list(list(makeSymbol("COUNTER"), ZERO_INTEGER)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), list(makeSymbol("LENGTH"), makeSymbol("WORDS"))), list(makeSymbol("PWHEN"), list(EQUALP, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-WORD")), makeSymbol("I")), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("WORD-STRING")), list(makeSymbol("CINC"), makeSymbol("COUNTER")), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("COUNTER"), makeSymbol("N")), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-WORD")), makeSymbol("I")))))), list(RET, NIL)));

    static private final SubLSymbol $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-LINKAGE-METHOD");

    private static final SubLSymbol WORD_LINKAGE_SEARCH_METHOD = makeSymbol("WORD-LINKAGE-SEARCH-METHOD");

    private static final SubLSymbol WORD_LINKAGE_P = makeSymbol("WORD-LINKAGE-P");

    static private final SubLList $list158 = list(makeKeyword("CC"), makeKeyword(","));

    static private final SubLString $str159$Failure_causing_word___S_has_link = makeString("Failure-causing word: ~S has links: ~S~%");

    static private final SubLSymbol $sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_ = makeSymbol("WORD-LINKAGE-WITH-RETOKENIZATION-FAILED?");

    private static final SubLList $list167 = list(list(list(makeString("You are likely to find a grape in grocery store")), T), list(list(makeString("Canfor Corporation today reported net income of $18.9 million for the first quarter of 2006, or $0.13 per share on a diluted basis.")), NIL), list(list(makeString("The man, the woman and the child slept")), NIL));

    // Definitions
    public static final SubLObject get_word_linkage_word_lexes_alt(SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, SEVEN_INTEGER, LEXES);
    }

    // Definitions
    public static SubLObject get_word_linkage_word_lexes(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, SEVEN_INTEGER, LEXES);
    }

    public static final SubLObject set_word_linkage_word_lexes_alt(SubLObject word_linkage_word, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, SEVEN_INTEGER, LEXES);
    }

    public static SubLObject set_word_linkage_word_lexes(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, SEVEN_INTEGER, LEXES);
    }

    public static final SubLObject get_word_linkage_word_right_links_alt(SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, SIX_INTEGER, RIGHT_LINKS);
    }

    public static SubLObject get_word_linkage_word_right_links(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, SIX_INTEGER, RIGHT_LINKS);
    }

    public static final SubLObject set_word_linkage_word_right_links_alt(SubLObject word_linkage_word, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, SIX_INTEGER, RIGHT_LINKS);
    }

    public static SubLObject set_word_linkage_word_right_links(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, SIX_INTEGER, RIGHT_LINKS);
    }

    public static final SubLObject get_word_linkage_word_left_links_alt(SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, FIVE_INTEGER, LEFT_LINKS);
    }

    public static SubLObject get_word_linkage_word_left_links(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, FIVE_INTEGER, LEFT_LINKS);
    }

    public static final SubLObject set_word_linkage_word_left_links_alt(SubLObject word_linkage_word, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, FIVE_INTEGER, LEFT_LINKS);
    }

    public static SubLObject set_word_linkage_word_left_links(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, FIVE_INTEGER, LEFT_LINKS);
    }

    public static final SubLObject get_word_linkage_word_index_alt(SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, FOUR_INTEGER, INDEX);
    }

    public static SubLObject get_word_linkage_word_index(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, FOUR_INTEGER, INDEX);
    }

    public static final SubLObject set_word_linkage_word_index_alt(SubLObject word_linkage_word, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, FOUR_INTEGER, INDEX);
    }

    public static SubLObject set_word_linkage_word_index(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, FOUR_INTEGER, INDEX);
    }

    public static final SubLObject get_word_linkage_word_pos_alt(SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, THREE_INTEGER, POS);
    }

    public static SubLObject get_word_linkage_word_pos(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, THREE_INTEGER, POS);
    }

    public static final SubLObject set_word_linkage_word_pos_alt(SubLObject word_linkage_word, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, THREE_INTEGER, POS);
    }

    public static SubLObject set_word_linkage_word_pos(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, THREE_INTEGER, POS);
    }

    public static final SubLObject get_word_linkage_word_string_alt(SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, TWO_INTEGER, STRING);
    }

    public static SubLObject get_word_linkage_word_string(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, TWO_INTEGER, STRING);
    }

    public static final SubLObject set_word_linkage_word_string_alt(SubLObject word_linkage_word, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, TWO_INTEGER, STRING);
    }

    public static SubLObject set_word_linkage_word_string(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, TWO_INTEGER, STRING);
    }

    public static final SubLObject get_word_linkage_word_linkage_alt(SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, ONE_INTEGER, LINKAGE);
    }

    public static SubLObject get_word_linkage_word_linkage(final SubLObject word_linkage_word) {
        return classes.subloop_get_access_protected_instance_slot(word_linkage_word, ONE_INTEGER, LINKAGE);
    }

    public static final SubLObject set_word_linkage_word_linkage_alt(SubLObject word_linkage_word, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, ONE_INTEGER, LINKAGE);
    }

    public static SubLObject set_word_linkage_word_linkage(final SubLObject word_linkage_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(word_linkage_word, value, ONE_INTEGER, LINKAGE);
    }

    public static final SubLObject subloop_reserved_initialize_word_linkage_word_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_word_linkage_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_word_linkage_word_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, POS, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, LEXES, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_word_linkage_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, POS, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE_WORD, LEXES, NIL);
        return NIL;
    }

    public static final SubLObject word_linkage_word_p_alt(SubLObject word_linkage_word) {
        return classes.subloop_instanceof_class(word_linkage_word, WORD_LINKAGE_WORD);
    }

    public static SubLObject word_linkage_word_p(final SubLObject word_linkage_word) {
        return classes.subloop_instanceof_class(word_linkage_word, WORD_LINKAGE_WORD);
    }

    /**
     *
     *
     * @param STRING.POS
     * 		stringp; a word with an optional part-of-speech, seperated
     * 		by '.'
     * @param LLINKS
     * 		listp; a list of links, occurring to the left of STRING.POS
     * @param RLINKS
     * 		listp; a list of links, occurring to the right of STRING.POS
     */
    @LispMethod(comment = "@param STRING.POS\r\n\t\tstringp; a word with an optional part-of-speech, seperated\r\n\t\tby \'.\'\r\n@param LLINKS\r\n\t\tlistp; a list of links, occurring to the left of STRING.POS\r\n@param RLINKS\r\n\t\tlistp; a list of links, occurring to the right of STRING.POS")
    public static final SubLObject new_word_linkage_word_alt(SubLObject v_linkage, SubLObject stringXpos, SubLObject index, SubLObject llinks, SubLObject rlinks, SubLObject penn_pos) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word = object.new_class_instance(WORD_LINKAGE_WORD);
                thread.resetMultipleValues();
                {
                    SubLObject string = linkage.split_link_word(stringXpos);
                    SubLObject link_pos = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject v_class = linkage.get_link_word_class(string, link_pos, Mapping.mapcar(LINK_NAME, llinks), Mapping.mapcar(LINK_NAME, rlinks), penn_pos);
                        SubLObject derived_pos = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        instances.set_slot(word, LINKAGE, v_linkage);
                        instances.set_slot(word, STRING, string);
                        instances.set_slot(word, POS, derived_pos);
                        instances.set_slot(word, INDEX, index);
                        instances.set_slot(word, LEFT_LINKS, llinks);
                        instances.set_slot(word, RIGHT_LINKS, rlinks);
                    }
                }
                {
                    SubLObject cdolist_list_var = llinks;
                    SubLObject llink = NIL;
                    for (llink = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , llink = cdolist_list_var.first()) {
                        linkage._csetf_link_right_word(llink, word);
                    }
                }
                {
                    SubLObject cdolist_list_var = rlinks;
                    SubLObject rlink = NIL;
                    for (rlink = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rlink = cdolist_list_var.first()) {
                        linkage._csetf_link_left_word(rlink, word);
                    }
                }
                return word;
            }
        }
    }

    /**
     *
     *
     * @param STRING.POS
     * 		stringp; a word with an optional part-of-speech, seperated
     * 		by '.'
     * @param LLINKS
     * 		listp; a list of links, occurring to the left of STRING.POS
     * @param RLINKS
     * 		listp; a list of links, occurring to the right of STRING.POS
     */
    @LispMethod(comment = "@param STRING.POS\r\n\t\tstringp; a word with an optional part-of-speech, seperated\r\n\t\tby \'.\'\r\n@param LLINKS\r\n\t\tlistp; a list of links, occurring to the left of STRING.POS\r\n@param RLINKS\r\n\t\tlistp; a list of links, occurring to the right of STRING.POS")
    public static SubLObject new_word_linkage_word(final SubLObject v_linkage, final SubLObject stringXpos, final SubLObject index, final SubLObject llinks, final SubLObject rlinks, final SubLObject penn_pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = object.new_class_instance(WORD_LINKAGE_WORD);
        thread.resetMultipleValues();
        final SubLObject string = linkage.split_link_word(stringXpos);
        final SubLObject link_pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject v_class = linkage.get_link_word_class(string, link_pos, Mapping.mapcar(LINK_NAME, llinks), Mapping.mapcar(LINK_NAME, rlinks), penn_pos);
        final SubLObject derived_pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        instances.set_slot(word, LINKAGE, v_linkage);
        instances.set_slot(word, STRING, string);
        instances.set_slot(word, POS, derived_pos);
        instances.set_slot(word, INDEX, index);
        instances.set_slot(word, LEFT_LINKS, llinks);
        instances.set_slot(word, RIGHT_LINKS, rlinks);
        SubLObject cdolist_list_var = llinks;
        SubLObject llink = NIL;
        llink = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            linkage._csetf_link_right_word(llink, word);
            cdolist_list_var = cdolist_list_var.rest();
            llink = cdolist_list_var.first();
        } 
        cdolist_list_var = rlinks;
        SubLObject rlink = NIL;
        rlink = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            linkage._csetf_link_left_word(rlink, word);
            cdolist_list_var = cdolist_list_var.rest();
            rlink = cdolist_list_var.first();
        } 
        return word;
    }

    /**
     * Prints this link word to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints this link word to STREAM, ignoring DEPTH")
    public static final SubLObject word_linkage_word_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_word_linkage_word_method = NIL;
            SubLObject pos = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_pos(self);
            SubLObject string = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_string(self);
            try {
                try {
                    write_string($str_alt21$__LW, stream, UNPROVIDED, UNPROVIDED);
                    write_string($str_alt22$_, stream, UNPROVIDED, UNPROVIDED);
                    princ(pos, stream);
                    write_string($str_alt23$___, stream, UNPROVIDED, UNPROVIDED);
                    write_string(string, stream, UNPROVIDED, UNPROVIDED);
                    write_string($str_alt24$_, stream, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_pos(self, pos);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_string(self, string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            }
            return catch_var_for_word_linkage_word_method;
        }
    }

    /**
     * Prints this link word to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints this link word to STREAM, ignoring DEPTH")
    public static SubLObject word_linkage_word_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = NIL;
        final SubLObject pos = get_word_linkage_word_pos(self);
        final SubLObject string = get_word_linkage_word_string(self);
        try {
            thread.throwStack.push($sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                write_string($str21$__LW, stream, UNPROVIDED, UNPROVIDED);
                write_string($str22$_, stream, UNPROVIDED, UNPROVIDED);
                princ(pos, stream);
                write_string($str23$___, stream, UNPROVIDED, UNPROVIDED);
                write_string(string, stream, UNPROVIDED, UNPROVIDED);
                write_string($str24$_, stream, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_word_pos(self, pos);
                    set_word_linkage_word_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym20$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }

    /**
     *
     *
     * @return word-linkage-p; the linkage this word is a part of
     */
    @LispMethod(comment = "@return word-linkage-p; the linkage this word is a part of")
    public static final SubLObject word_linkage_word_get_linkage_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_linkage_word_method = NIL;
            SubLObject v_linkage = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_linkage(self);
            try {
                try {
                    sublisp_throw($sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, v_linkage);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_linkage(self, v_linkage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            }
            return catch_var_for_word_linkage_word_method;
        }
    }

    /**
     *
     *
     * @return word-linkage-p; the linkage this word is a part of
     */
    @LispMethod(comment = "@return word-linkage-p; the linkage this word is a part of")
    public static SubLObject word_linkage_word_get_linkage_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = NIL;
        final SubLObject v_linkage = get_word_linkage_word_linkage(self);
        try {
            thread.throwStack.push($sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                sublisp_throw($sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, v_linkage);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_word_linkage(self, v_linkage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym29$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }

    /**
     *
     *
     * @return string; the surface string of this word
     */
    @LispMethod(comment = "@return string; the surface string of this word")
    public static final SubLObject word_linkage_word_get_string_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_linkage_word_method = NIL;
            SubLObject string = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_string(self);
            try {
                try {
                    sublisp_throw($sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, string);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_string(self, string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            }
            return catch_var_for_word_linkage_word_method;
        }
    }

    /**
     *
     *
     * @return string; the surface string of this word
     */
    @LispMethod(comment = "@return string; the surface string of this word")
    public static SubLObject word_linkage_word_get_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = NIL;
        final SubLObject string = get_word_linkage_word_string(self);
        try {
            thread.throwStack.push($sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                sublisp_throw($sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, string);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_word_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }

    /**
     *
     *
     * @return numberp; the absolute index of this word
     */
    @LispMethod(comment = "@return numberp; the absolute index of this word")
    public static final SubLObject word_linkage_word_get_abs_index_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_linkage_word_method = NIL;
            SubLObject index = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_index(self);
            try {
                try {
                    sublisp_throw($sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, index);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_index(self, index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            }
            return catch_var_for_word_linkage_word_method;
        }
    }

    /**
     *
     *
     * @return numberp; the absolute index of this word
     */
    @LispMethod(comment = "@return numberp; the absolute index of this word")
    public static SubLObject word_linkage_word_get_abs_index_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = NIL;
        final SubLObject index = get_word_linkage_word_index(self);
        try {
            thread.throwStack.push($sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                sublisp_throw($sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, index);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_word_index(self, index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }

    /**
     *
     *
     * @return keywordp; the part of speech of this word
     */
    @LispMethod(comment = "@return keywordp; the part of speech of this word")
    public static final SubLObject word_linkage_word_get_pos_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_linkage_word_method = NIL;
            SubLObject pos = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_pos(self);
            try {
                try {
                    sublisp_throw($sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, pos);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_pos(self, pos);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            }
            return catch_var_for_word_linkage_word_method;
        }
    }

    /**
     *
     *
     * @return keywordp; the part of speech of this word
     */
    @LispMethod(comment = "@return keywordp; the part of speech of this word")
    public static SubLObject word_linkage_word_get_pos_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = NIL;
        final SubLObject pos = get_word_linkage_word_pos(self);
        try {
            thread.throwStack.push($sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                sublisp_throw($sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, pos);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_word_pos(self, pos);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }

    /**
     *
     *
     * @return keywordp; the part of speech of this word
     */
    @LispMethod(comment = "@return keywordp; the part of speech of this word")
    public static final SubLObject word_linkage_word_get_category_method_alt(SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_POS);
    }

    /**
     *
     *
     * @return keywordp; the part of speech of this word
     */
    @LispMethod(comment = "@return keywordp; the part of speech of this word")
    public static SubLObject word_linkage_word_get_category_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_POS);
    }

    /**
     *
     *
     * @return numberp; the index of this word
     */
    @LispMethod(comment = "@return numberp; the index of this word")
    public static final SubLObject word_linkage_word_get_index_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_linkage_word_method = NIL;
            SubLObject index = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_index(self);
            try {
                try {
                    sublisp_throw($sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, index);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_index(self, index);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            }
            return catch_var_for_word_linkage_word_method;
        }
    }

    /**
     *
     *
     * @return numberp; the index of this word
     */
    @LispMethod(comment = "@return numberp; the index of this word")
    public static SubLObject word_linkage_word_get_index_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = NIL;
        final SubLObject index = get_word_linkage_word_index(self);
        try {
            thread.throwStack.push($sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                sublisp_throw($sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, index);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_word_index(self, index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }

    /**
     *
     *
     * @return numberp; the lexical items for this word
     */
    @LispMethod(comment = "@return numberp; the lexical items for this word")
    public static final SubLObject word_linkage_word_get_lexes_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_linkage_word_method = NIL;
            SubLObject lexes = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_lexes(self);
            try {
                try {
                    sublisp_throw($sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, lexes);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_lexes(self, lexes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            }
            return catch_var_for_word_linkage_word_method;
        }
    }

    /**
     *
     *
     * @return numberp; the lexical items for this word
     */
    @LispMethod(comment = "@return numberp; the lexical items for this word")
    public static SubLObject word_linkage_word_get_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = NIL;
        final SubLObject lexes = get_word_linkage_word_lexes(self);
        try {
            thread.throwStack.push($sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                sublisp_throw($sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, lexes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_word_lexes(self, lexes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }

    public static final SubLObject word_linkage_word_get_left_links_method_alt(SubLObject self, SubLObject link_pattern) {
        if (link_pattern == UNPROVIDED) {
            link_pattern = NIL;
        }
        {
            SubLObject catch_var_for_word_linkage_word_method = NIL;
            SubLObject left_links = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_left_links(self);
            try {
                try {
                    if (NIL != link_pattern) {
                        SubLTrampolineFile.checkType(link_pattern, REGEX_PATTERN_P);
                    }
                    if (NIL == link_pattern) {
                        sublisp_throw($sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, left_links);
                    }
                    {
                        SubLObject links = NIL;
                        SubLObject cdolist_list_var = left_links;
                        SubLObject link = NIL;
                        for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                            if (NIL != regular_expression_utilities.regex_matchP(link_pattern, linkage.link_name(link))) {
                                links = cons(link, links);
                            }
                        }
                        sublisp_throw($sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, links);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_left_links(self, left_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            }
            return catch_var_for_word_linkage_word_method;
        }
    }

    public static SubLObject word_linkage_word_get_left_links_method(final SubLObject self, SubLObject link_pattern) {
        if (link_pattern == UNPROVIDED) {
            link_pattern = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = NIL;
        final SubLObject left_links = get_word_linkage_word_left_links(self);
        try {
            thread.throwStack.push($sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                if (((NIL != link_pattern) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == regular_expressions.regex_pattern_p(link_pattern))) {
                    throw new AssertionError(link_pattern);
                }
                if (NIL == link_pattern) {
                    sublisp_throw($sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, left_links);
                }
                SubLObject links = NIL;
                SubLObject cdolist_list_var = left_links;
                SubLObject link = NIL;
                link = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != regular_expression_utilities.regex_matchP(link_pattern, linkage.link_name(link))) {
                        links = cons(link, links);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    link = cdolist_list_var.first();
                } 
                sublisp_throw($sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, links);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_word_left_links(self, left_links);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }

    public static final SubLObject word_linkage_word_get_right_links_method_alt(SubLObject self, SubLObject link_pattern) {
        if (link_pattern == UNPROVIDED) {
            link_pattern = NIL;
        }
        {
            SubLObject catch_var_for_word_linkage_word_method = NIL;
            SubLObject right_links = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_right_links(self);
            try {
                try {
                    if (NIL != link_pattern) {
                        SubLTrampolineFile.checkType(link_pattern, REGEX_PATTERN_P);
                    }
                    if (NIL == link_pattern) {
                        sublisp_throw($sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, right_links);
                    }
                    {
                        SubLObject links = NIL;
                        SubLObject cdolist_list_var = right_links;
                        SubLObject link = NIL;
                        for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                            if (NIL != regular_expression_utilities.regex_matchP(link_pattern, linkage.link_name(link))) {
                                links = cons(link, links);
                            }
                        }
                        sublisp_throw($sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, links);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_right_links(self, right_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            }
            return catch_var_for_word_linkage_word_method;
        }
    }

    public static SubLObject word_linkage_word_get_right_links_method(final SubLObject self, SubLObject link_pattern) {
        if (link_pattern == UNPROVIDED) {
            link_pattern = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = NIL;
        final SubLObject right_links = get_word_linkage_word_right_links(self);
        try {
            thread.throwStack.push($sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                if (((NIL != link_pattern) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == regular_expressions.regex_pattern_p(link_pattern))) {
                    throw new AssertionError(link_pattern);
                }
                if (NIL == link_pattern) {
                    sublisp_throw($sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, right_links);
                }
                SubLObject links = NIL;
                SubLObject cdolist_list_var = right_links;
                SubLObject link = NIL;
                link = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != regular_expression_utilities.regex_matchP(link_pattern, linkage.link_name(link))) {
                        links = cons(link, links);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    link = cdolist_list_var.first();
                } 
                sublisp_throw($sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, links);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_word_right_links(self, right_links);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }

    public static final SubLObject word_linkage_word_get_links_method_alt(SubLObject self, SubLObject link_pattern) {
        if (link_pattern == UNPROVIDED) {
            link_pattern = NIL;
        }
        if (NIL != link_pattern) {
            SubLTrampolineFile.checkType(link_pattern, REGEX_PATTERN_P);
        }
        return append(methods.funcall_instance_method_with_1_args(self, GET_LEFT_LINKS, link_pattern), methods.funcall_instance_method_with_1_args(self, GET_RIGHT_LINKS, link_pattern));
    }

    public static SubLObject word_linkage_word_get_links_method(final SubLObject self, SubLObject link_pattern) {
        if (link_pattern == UNPROVIDED) {
            link_pattern = NIL;
        }
        if (((NIL != link_pattern) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == regular_expressions.regex_pattern_p(link_pattern))) {
            throw new AssertionError(link_pattern);
        }
        return append(methods.funcall_instance_method_with_1_args(self, GET_LEFT_LINKS, link_pattern), methods.funcall_instance_method_with_1_args(self, GET_RIGHT_LINKS, link_pattern));
    }

    /**
     *
     *
     * @param PATTERN-KEYWORD
    keywordp;
     * 		
     * @return list; the list of words that is related to this word via
    PATTERN-KEYWORD
     */
    @LispMethod(comment = "@param PATTERN-KEYWORD\nkeywordp;\r\n\t\t\r\n@return list; the list of words that is related to this word via\r\nPATTERN-KEYWORD")
    public static final SubLObject word_linkage_word_get_directly_related_method_alt(SubLObject self, SubLObject pattern_keyword, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            SubLObject link_pattern = linkage.get_link_pattern(pattern_keyword);
            SubLObject link_getter = (NIL == direction) ? ((SubLObject) (GET_LINKS)) : direction.eql($LEFT) ? ((SubLObject) (GET_LEFT_LINKS)) : direction.eql($RIGHT) ? ((SubLObject) (GET_RIGHT_LINKS)) : Errors.error($str_alt72$Invalid_link_direction__a, direction);
            SubLObject words = NIL;
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, link_getter, link_pattern);
            SubLObject link = NIL;
            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                if (linkage.link_left_word(link) == self) {
                    words = cons(linkage.link_right_word(link), words);
                } else {
                    words = cons(linkage.link_left_word(link), words);
                }
            }
            return words;
        }
    }

    /**
     *
     *
     * @param PATTERN-KEYWORD
    keywordp;
     * 		
     * @return list; the list of words that is related to this word via
    PATTERN-KEYWORD
     */
    @LispMethod(comment = "@param PATTERN-KEYWORD\nkeywordp;\r\n\t\t\r\n@return list; the list of words that is related to this word via\r\nPATTERN-KEYWORD")
    public static SubLObject word_linkage_word_get_directly_related_method(final SubLObject self, final SubLObject pattern_keyword, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLObject link_pattern = linkage.get_link_pattern(pattern_keyword);
        final SubLObject link_getter = (NIL == direction) ? GET_LINKS : direction.eql($LEFT) ? GET_LEFT_LINKS : direction.eql($RIGHT) ? GET_RIGHT_LINKS : Errors.error($str72$Invalid_link_direction__a, direction);
        SubLObject words = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, link_getter, link_pattern);
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (linkage.link_left_word(link).eql(self)) {
                words = cons(linkage.link_right_word(link), words);
            } else {
                words = cons(linkage.link_left_word(link), words);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return words;
    }

    /**
     *
     *
     * @param LINK-PATH
     * 		list; a sequence of link-patterns
     * @return list; the list of words that is related to this word via LINK-PATH,
    in that order
     */
    @LispMethod(comment = "@param LINK-PATH\r\n\t\tlist; a sequence of link-patterns\r\n@return list; the list of words that is related to this word via LINK-PATH,\r\nin that order")
    public static final SubLObject word_linkage_word_get_related_method_alt(SubLObject self, SubLObject link_path) {
        if (NIL == link_path) {
            return list(self);
        }
        {
            SubLObject words = NIL;
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, link_path.first());
            SubLObject related = NIL;
            for (related = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , related = cdolist_list_var.first()) {
                words = append(methods.funcall_instance_method_with_1_args(related, GET_RELATED, link_path.rest()), words);
            }
            return words;
        }
    }

    /**
     *
     *
     * @param LINK-PATH
     * 		list; a sequence of link-patterns
     * @return list; the list of words that is related to this word via LINK-PATH,
    in that order
     */
    @LispMethod(comment = "@param LINK-PATH\r\n\t\tlist; a sequence of link-patterns\r\n@return list; the list of words that is related to this word via LINK-PATH,\r\nin that order")
    public static SubLObject word_linkage_word_get_related_method(final SubLObject self, final SubLObject link_path) {
        if (NIL == link_path) {
            return list(self);
        }
        SubLObject words = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, link_path.first());
        SubLObject related = NIL;
        related = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words = append(methods.funcall_instance_method_with_1_args(related, GET_RELATED, link_path.rest()), words);
            cdolist_list_var = cdolist_list_var.rest();
            related = cdolist_list_var.first();
        } 
        return words;
    }

    /**
     *
     *
     * @param LEXICON
     * 		semtrans-lexicon-p; the lexicon to lexify this word with
     * @return listp; the list of lex entries used to lexify this word
     * @unknown alters this word's lexes slot
    see @xref link-word:lexify; this is a simpler version of that function
     */
    @LispMethod(comment = "@param LEXICON\r\n\t\tsemtrans-lexicon-p; the lexicon to lexify this word with\r\n@return listp; the list of lex entries used to lexify this word\r\n@unknown alters this word\'s lexes slot\r\nsee @xref link-word:lexify; this is a simpler version of that function")
    public static final SubLObject word_linkage_word_lexify_method_alt(SubLObject self, SubLObject lexicon) {
        {
            SubLObject filtered = NIL;
            SubLObject string = instances.get_slot(self, STRING);
            instances.set_slot(self, LEXES, cyclifier.new_even_lex_entry_distribution(methods.funcall_instance_method_with_1_args(lexicon, GET, string)));
            if (NIL != instances.get_slot(self, LEXES)) {
                filtered = methods.funcall_instance_method_with_0_args(self, POS_FILTER_LEXES);
            }
            instances.set_slot(self, LEXES, filtered);
            return instances.get_slot(self, LEXES);
        }
    }

    /**
     *
     *
     * @param LEXICON
     * 		semtrans-lexicon-p; the lexicon to lexify this word with
     * @return listp; the list of lex entries used to lexify this word
     * @unknown alters this word's lexes slot
    see @xref link-word:lexify; this is a simpler version of that function
     */
    @LispMethod(comment = "@param LEXICON\r\n\t\tsemtrans-lexicon-p; the lexicon to lexify this word with\r\n@return listp; the list of lex entries used to lexify this word\r\n@unknown alters this word\'s lexes slot\r\nsee @xref link-word:lexify; this is a simpler version of that function")
    public static SubLObject word_linkage_word_lexify_method(final SubLObject self, final SubLObject lexicon) {
        SubLObject filtered = NIL;
        final SubLObject string = instances.get_slot(self, STRING);
        instances.set_slot(self, LEXES, cyclifier.new_even_lex_entry_distribution(methods.funcall_instance_method_with_1_args(lexicon, GET, string)));
        if (NIL != instances.get_slot(self, LEXES)) {
            filtered = methods.funcall_instance_method_with_0_args(self, POS_FILTER_LEXES);
        }
        instances.set_slot(self, LEXES, filtered);
        return instances.get_slot(self, LEXES);
    }

    /**
     * Removes any lexical entries that don't match the part-of-speech of this word
     */
    @LispMethod(comment = "Removes any lexical entries that don\'t match the part-of-speech of this word")
    public static final SubLObject word_linkage_word_pos_filter_lexes_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_linkage_word_method = NIL;
            SubLObject lexes = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_lexes(self);
            SubLObject pos = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_pos(self);
            try {
                try {
                    {
                        SubLObject filtered = NIL;
                        SubLObject cdolist_list_var = lexes;
                        SubLObject rle = NIL;
                        for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rle = cdolist_list_var.first()) {
                            if (NIL != member(instances.get_slot(self, POS), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
                                cyclifier.rle_set_confidence(rle, ONE_INTEGER);
                                filtered = cons(rle, filtered);
                            } else {
                                if (NIL != member(instances.get_slot(self, POS), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
                                    cyclifier.rle_set_confidence(rle, $float$0_75);
                                    filtered = cons(rle, filtered);
                                }
                            }
                        }
                        lexes = filtered;
                        sublisp_throw($sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, lexes);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_lexes(self, lexes);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_word_pos(self, pos);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            }
            return catch_var_for_word_linkage_word_method;
        }
    }

    /**
     * Removes any lexical entries that don't match the part-of-speech of this word
     */
    @LispMethod(comment = "Removes any lexical entries that don\'t match the part-of-speech of this word")
    public static SubLObject word_linkage_word_pos_filter_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_word_method = NIL;
        SubLObject lexes = get_word_linkage_word_lexes(self);
        final SubLObject pos = get_word_linkage_word_pos(self);
        try {
            thread.throwStack.push($sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
            try {
                SubLObject filtered = NIL;
                SubLObject cdolist_list_var = lexes;
                SubLObject rle = NIL;
                rle = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != member(instances.get_slot(self, POS), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
                        cyclifier.rle_set_confidence(rle, ONE_INTEGER);
                        filtered = cons(rle, filtered);
                    } else
                        if (NIL != member(instances.get_slot(self, POS), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
                            cyclifier.rle_set_confidence(rle, $float$0_75);
                            filtered = cons(rle, filtered);
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                } 
                lexes = filtered;
                sublisp_throw($sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD, lexes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_word_lexes(self, lexes);
                    set_word_linkage_word_pos(self, pos);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_word_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_WORD_LINKAGE_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_word_method;
    }

    /**
     * Checks if WORD is a 'wall' word-linkage-word.
     *
     * @return booleanp
     */
    @LispMethod(comment = "Checks if WORD is a \'wall\' word-linkage-word.\r\n\r\n@return booleanp")
    public static final SubLObject wall_word_linkage_wordP_alt(SubLObject word) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.word_linkage.word_linkage_word_p(word)) && (NIL == methods.funcall_instance_method_with_0_args(word, GET_POS))) && (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(word, GET_STRING), $list_alt91, symbol_function(EQUAL), UNPROVIDED)));
    }

    /**
     * Checks if WORD is a 'wall' word-linkage-word.
     *
     * @return booleanp
     */
    @LispMethod(comment = "Checks if WORD is a \'wall\' word-linkage-word.\r\n\r\n@return booleanp")
    public static SubLObject wall_word_linkage_wordP(final SubLObject word) {
        return makeBoolean(((NIL != word_linkage_word_p(word)) && (NIL == methods.funcall_instance_method_with_0_args(word, GET_POS))) && (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(word, GET_STRING), $list91, symbol_function(EQUAL), UNPROVIDED)));
    }

    public static final SubLObject get_word_linkage_tree_string_alt(SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, FOUR_INTEGER, TREE_STRING);
    }

    public static SubLObject get_word_linkage_tree_string(final SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, FOUR_INTEGER, TREE_STRING);
    }

    public static final SubLObject set_word_linkage_tree_string_alt(SubLObject v_word_linkage, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, FOUR_INTEGER, TREE_STRING);
    }

    public static SubLObject set_word_linkage_tree_string(final SubLObject v_word_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, FOUR_INTEGER, TREE_STRING);
    }

    public static final SubLObject get_word_linkage_diagram_alt(SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, THREE_INTEGER, DIAGRAM);
    }

    public static SubLObject get_word_linkage_diagram(final SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, THREE_INTEGER, DIAGRAM);
    }

    public static final SubLObject set_word_linkage_diagram_alt(SubLObject v_word_linkage, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, THREE_INTEGER, DIAGRAM);
    }

    public static SubLObject set_word_linkage_diagram(final SubLObject v_word_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, THREE_INTEGER, DIAGRAM);
    }

    public static final SubLObject get_word_linkage_words_alt(SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, TWO_INTEGER, WORDS);
    }

    public static SubLObject get_word_linkage_words(final SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, TWO_INTEGER, WORDS);
    }

    public static final SubLObject set_word_linkage_words_alt(SubLObject v_word_linkage, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, TWO_INTEGER, WORDS);
    }

    public static SubLObject set_word_linkage_words(final SubLObject v_word_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, TWO_INTEGER, WORDS);
    }

    public static final SubLObject get_word_linkage_links_alt(SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, ONE_INTEGER, LINKS);
    }

    public static SubLObject get_word_linkage_links(final SubLObject v_word_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_word_linkage, ONE_INTEGER, LINKS);
    }

    public static final SubLObject set_word_linkage_links_alt(SubLObject v_word_linkage, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, ONE_INTEGER, LINKS);
    }

    public static SubLObject set_word_linkage_links(final SubLObject v_word_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_word_linkage, value, ONE_INTEGER, LINKS);
    }

    public static final SubLObject subloop_reserved_initialize_word_linkage_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_word_linkage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_word_linkage_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE, LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE, WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE, DIAGRAM, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE, TREE_STRING, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_word_linkage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE, LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE, WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE, DIAGRAM, NIL);
        classes.subloop_initialize_slot(new_instance, WORD_LINKAGE, TREE_STRING, NIL);
        return NIL;
    }

    public static final SubLObject word_linkage_p_alt(SubLObject v_word_linkage) {
        return classes.subloop_instanceof_class(v_word_linkage, WORD_LINKAGE);
    }

    public static SubLObject word_linkage_p(final SubLObject v_word_linkage) {
        return classes.subloop_instanceof_class(v_word_linkage, WORD_LINKAGE);
    }

    public static final SubLObject new_word_linkage_from_link_structure_alt(SubLObject link_structure, SubLObject tagged_sent, SubLObject input_sentence, SubLObject respect_id_linksP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_linkage = object.new_class_instance(WORD_LINKAGE);
                SubLObject word_count = linkage.ls_number_of_words(link_structure);
                SubLObject link_count = linkage.ls_number_of_links(link_structure);
                SubLObject links = make_vector(link_count, UNPROVIDED);
                SubLObject word_links = make_vector(word_count, UNPROVIDED);
                SubLObject idiom_offset = ZERO_INTEGER;
                SubLObject tagged_sent_length = document.sentence_length(tagged_sent);
                SubLObject words = NIL;
                SubLObject idiom_word_ids = NIL;
                SubLObject idioms = NIL;
                SubLObject llinksXrlinks = NIL;
                SubLObject link_name = NIL;
                SubLObject index = NIL;
                SubLObject string = NIL;
                SubLObject pos = NIL;
                {
                    SubLObject wi = NIL;
                    for (wi = ZERO_INTEGER; wi.numL(word_count); wi = add(wi, ONE_INTEGER)) {
                        set_aref(word_links, wi, cons(NIL, NIL));
                    }
                }
                {
                    SubLObject li = NIL;
                    for (li = ZERO_INTEGER; li.numL(link_count); li = add(li, ONE_INTEGER)) {
                        index = linkage.ls_lword_index_of_link(link_structure, li);
                        llinksXrlinks = aref(word_links, index);
                        rplacd(llinksXrlinks, cons(li, llinksXrlinks.rest()));
                        index = linkage.ls_rword_index_of_link(link_structure, li);
                        llinksXrlinks = aref(word_links, index);
                        rplaca(llinksXrlinks, cons(li, llinksXrlinks.first()));
                    }
                }
                {
                    SubLObject wi = NIL;
                    for (wi = ZERO_INTEGER; wi.numL(word_count); wi = add(wi, ONE_INTEGER)) {
                        if (NIL == subl_promotions.memberP(wi, idiom_word_ids, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject llinks = NIL;
                                SubLObject rlinks = NIL;
                                SubLObject llink = NIL;
                                SubLObject rlink = NIL;
                                thread.resetMultipleValues();
                                {
                                    SubLObject string_1 = com.cyc.cycjava.cycl.word_linkage.retrieve_link_word(wi, link_structure, word_links, input_sentence);
                                    SubLObject idioms_2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    string = string_1;
                                    idioms = idioms_2;
                                }
                                idiom_word_ids = append(idioms, idiom_word_ids);
                                pos = (wi.numL(ONE_INTEGER) || wi.numG(tagged_sent_length)) ? ((SubLObject) (NIL)) : document.word_category(document.sentence_get(tagged_sent, number_utilities.f_1_(NIL != idioms ? ((SubLObject) (last(idioms, UNPROVIDED).first())) : wi)));
                                if (NIL != idioms) {
                                    llinksXrlinks = com.cyc.cycjava.cycl.word_linkage.get_idiom_links(idioms, word_links, link_structure);
                                } else {
                                    llinksXrlinks = aref(word_links, wi);
                                }
                                {
                                    SubLObject cdolist_list_var = llinksXrlinks.first();
                                    SubLObject llink_id = NIL;
                                    for (llink_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , llink_id = cdolist_list_var.first()) {
                                        link_name = linkage.ls_name_of_link(link_structure, llink_id);
                                        llink = aref(links, llink_id);
                                        if (NIL == llink) {
                                            llink = linkage.new_link(link_name);
                                            set_aref(links, llink_id, llink);
                                        }
                                        llinks = cons(llink, llinks);
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = llinksXrlinks.rest();
                                    SubLObject rlink_id = NIL;
                                    for (rlink_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rlink_id = cdolist_list_var.first()) {
                                        link_name = linkage.ls_name_of_link(link_structure, rlink_id);
                                        if (NIL == string_utilities.starts_with(link_name, $$$ID)) {
                                            rlink = aref(links, rlink_id);
                                            if (NIL == rlink) {
                                                rlink = linkage.new_link(link_name);
                                                set_aref(links, rlink_id, rlink);
                                            }
                                            rlinks = cons(rlink, rlinks);
                                        }
                                    }
                                }
                                words = cons(com.cyc.cycjava.cycl.word_linkage.new_word_linkage_word(v_linkage, string, subtract(wi, idiom_offset), llinks, rlinks, pos), words);
                                if (NIL != idioms) {
                                    idiom_offset = add(idiom_offset, subtract(second(idioms), idioms.first()));
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = words;
                    SubLObject word = NIL;
                    for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                        instances.set_slot(word, LEFT_LINKS, remove_if($sym101$INCOMPLETE_LINK_, com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_left_links(word), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        instances.set_slot(word, RIGHT_LINKS, remove_if($sym101$INCOMPLETE_LINK_, com.cyc.cycjava.cycl.word_linkage.get_word_linkage_word_right_links(word), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    }
                }
                instances.set_slot(v_linkage, DIAGRAM, linkage.ls_diagram(link_structure));
                instances.set_slot(v_linkage, LINKS, remove_if($sym101$INCOMPLETE_LINK_, links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                instances.set_slot(v_linkage, WORDS, apply(VECTOR, nreverse(words)));
                instances.set_slot(v_linkage, TREE_STRING, linkage.ls_tree(link_structure));
                return v_linkage;
            }
        }
    }

    public static SubLObject new_word_linkage_from_link_structure(final SubLObject link_structure, final SubLObject tagged_sent, final SubLObject input_sentence, final SubLObject respect_id_linksP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_linkage = object.new_class_instance(WORD_LINKAGE);
        final SubLObject word_count = linkage.ls_number_of_words(link_structure);
        final SubLObject link_count = linkage.ls_number_of_links(link_structure);
        final SubLObject links = make_vector(link_count, UNPROVIDED);
        final SubLObject word_links = make_vector(word_count, UNPROVIDED);
        SubLObject idiom_offset = ZERO_INTEGER;
        final SubLObject tagged_sent_length = document.sentence_length(tagged_sent);
        SubLObject words = NIL;
        SubLObject idiom_word_ids = NIL;
        SubLObject idioms = NIL;
        SubLObject llinksXrlinks = NIL;
        SubLObject link_name = NIL;
        SubLObject index = NIL;
        SubLObject string = NIL;
        SubLObject pos = NIL;
        SubLObject wi;
        for (wi = NIL, wi = ZERO_INTEGER; wi.numL(word_count); wi = add(wi, ONE_INTEGER)) {
            set_aref(word_links, wi, cons(NIL, NIL));
        }
        SubLObject li;
        for (li = NIL, li = ZERO_INTEGER; li.numL(link_count); li = add(li, ONE_INTEGER)) {
            index = linkage.ls_lword_index_of_link(link_structure, li);
            llinksXrlinks = aref(word_links, index);
            rplacd(llinksXrlinks, cons(li, llinksXrlinks.rest()));
            index = linkage.ls_rword_index_of_link(link_structure, li);
            llinksXrlinks = aref(word_links, index);
            rplaca(llinksXrlinks, cons(li, llinksXrlinks.first()));
        }
        SubLObject llinks;
        SubLObject rlinks;
        SubLObject llink;
        SubLObject rlink;
        SubLObject string_$1;
        SubLObject idioms_$2;
        SubLObject cdolist_list_var;
        SubLObject llink_id;
        SubLObject rlink_id;
        for (wi = NIL, wi = ZERO_INTEGER; wi.numL(word_count); wi = add(wi, ONE_INTEGER)) {
            if (NIL == subl_promotions.memberP(wi, idiom_word_ids, UNPROVIDED, UNPROVIDED)) {
                llinks = NIL;
                rlinks = NIL;
                llink = NIL;
                rlink = NIL;
                thread.resetMultipleValues();
                string_$1 = retrieve_link_word(wi, link_structure, word_links, input_sentence);
                idioms_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                string = string_$1;
                idioms = idioms_$2;
                idiom_word_ids = append(idioms, idiom_word_ids);
                pos = (wi.numL(ONE_INTEGER) || wi.numG(tagged_sent_length)) ? NIL : document.word_category(document.sentence_get(tagged_sent, number_utilities.f_1_(NIL != idioms ? last(idioms, UNPROVIDED).first() : wi)));
                if (NIL != idioms) {
                    llinksXrlinks = get_idiom_links(idioms, word_links, link_structure);
                } else {
                    llinksXrlinks = aref(word_links, wi);
                }
                cdolist_list_var = llinksXrlinks.first();
                llink_id = NIL;
                llink_id = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    link_name = linkage.ls_name_of_link(link_structure, llink_id);
                    llink = aref(links, llink_id);
                    if (NIL == llink) {
                        llink = linkage.new_link(link_name);
                        set_aref(links, llink_id, llink);
                    }
                    llinks = cons(llink, llinks);
                    cdolist_list_var = cdolist_list_var.rest();
                    llink_id = cdolist_list_var.first();
                } 
                cdolist_list_var = llinksXrlinks.rest();
                rlink_id = NIL;
                rlink_id = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    link_name = linkage.ls_name_of_link(link_structure, rlink_id);
                    if (NIL == string_utilities.starts_with(link_name, $$$ID)) {
                        rlink = aref(links, rlink_id);
                        if (NIL == rlink) {
                            rlink = linkage.new_link(link_name);
                            set_aref(links, rlink_id, rlink);
                        }
                        rlinks = cons(rlink, rlinks);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rlink_id = cdolist_list_var.first();
                } 
                words = cons(new_word_linkage_word(v_linkage, string, subtract(wi, idiom_offset), llinks, rlinks, pos), words);
                if (NIL != idioms) {
                    idiom_offset = add(idiom_offset, subtract(second(idioms), idioms.first()));
                }
            }
        }
        SubLObject cdolist_list_var2 = words;
        SubLObject word = NIL;
        word = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            instances.set_slot(word, LEFT_LINKS, remove_if($sym101$INCOMPLETE_LINK_, get_word_linkage_word_left_links(word), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            instances.set_slot(word, RIGHT_LINKS, remove_if($sym101$INCOMPLETE_LINK_, get_word_linkage_word_right_links(word), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            cdolist_list_var2 = cdolist_list_var2.rest();
            word = cdolist_list_var2.first();
        } 
        instances.set_slot(v_linkage, DIAGRAM, linkage.ls_diagram(link_structure));
        instances.set_slot(v_linkage, LINKS, remove_if($sym101$INCOMPLETE_LINK_, links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        instances.set_slot(v_linkage, WORDS, apply(VECTOR, nreverse(words)));
        instances.set_slot(v_linkage, TREE_STRING, linkage.ls_tree(link_structure));
        return v_linkage;
    }

    /**
     *
     *
     * @param XML
     * 		stringp; a word-linkage XML string
     * @return word-linkage-p; a new word-linkage from XML
     */
    @LispMethod(comment = "@param XML\r\n\t\tstringp; a word-linkage XML string\r\n@return word-linkage-p; a new word-linkage from XML")
    public static final SubLObject xml_to_word_linkage_alt(SubLObject xml) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sexpr = web_utilities.xml_tokens_to_sexpr(web_utilities.xml_string_tokenize(xml, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == Strings.stringE(web_utilities.xml_sexpr_type(sexpr), $str_alt103$word_linkage, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        Errors.error($str_alt104$_a_is_not_a_linkage_xml_string, sexpr);
                    }
                }
                {
                    SubLObject v_linkage = object.new_class_instance(WORD_LINKAGE);
                    SubLObject words_sexpr = web_utilities.xml_sexpr_daughter(sexpr, $$$words);
                    SubLObject words = com.cyc.cycjava.cycl.word_linkage.words_sexpr_to_word_vector(words_sexpr);
                    SubLObject links_sexpr = web_utilities.xml_sexpr_daughter(sexpr, $$$links);
                    SubLObject i = ZERO_INTEGER;
                    SubLObject links = NIL;
                    SubLObject vector_var = words;
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject word = aref(vector_var, element_num);
                            instances.set_slot(word, LINKAGE, v_linkage);
                            instances.set_slot(word, INDEX, i);
                            i = add(i, ONE_INTEGER);
                        }
                    }
                    links = linkage.xml_sexpr_to_links(links_sexpr, words);
                    instances.set_slot(v_linkage, LINKS, links);
                    instances.set_slot(v_linkage, WORDS, words);
                    return v_linkage;
                }
            }
        }
    }

    /**
     *
     *
     * @param XML
     * 		stringp; a word-linkage XML string
     * @return word-linkage-p; a new word-linkage from XML
     */
    @LispMethod(comment = "@param XML\r\n\t\tstringp; a word-linkage XML string\r\n@return word-linkage-p; a new word-linkage from XML")
    public static SubLObject xml_to_word_linkage(final SubLObject xml) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sexpr = xml_parsing_utilities.xml_tokens_to_sexpr(xml_parsing_utilities.xml_string_tokenize(xml, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == Strings.stringE(xml_parsing_utilities.xml_sexpr_type(sexpr), $str103$word_linkage, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str104$_a_is_not_a_linkage_xml_string, sexpr);
        }
        final SubLObject v_linkage = object.new_class_instance(WORD_LINKAGE);
        final SubLObject words_sexpr = xml_parsing_utilities.xml_sexpr_daughter(sexpr, $$$words);
        final SubLObject words = words_sexpr_to_word_vector(words_sexpr);
        final SubLObject links_sexpr = xml_parsing_utilities.xml_sexpr_daughter(sexpr, $$$links);
        SubLObject i = ZERO_INTEGER;
        SubLObject links = NIL;
        final SubLObject vector_var = words;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            word = aref(vector_var, element_num);
            instances.set_slot(word, LINKAGE, v_linkage);
            instances.set_slot(word, INDEX, i);
            i = add(i, ONE_INTEGER);
        }
        links = linkage.xml_sexpr_to_links(links_sexpr, words);
        instances.set_slot(v_linkage, LINKS, links);
        instances.set_slot(v_linkage, WORDS, words);
        return v_linkage;
    }

    /**
     * returns a vector of word-linkage-words from WORDS-SEXPR
     */
    @LispMethod(comment = "returns a vector of word-linkage-words from WORDS-SEXPR")
    public static final SubLObject words_sexpr_to_word_vector_alt(SubLObject words_sexpr) {
        {
            SubLObject xml_words = web_utilities.xml_sexpr_daughters(words_sexpr, UNPROVIDED);
            SubLObject words = make_vector(length(xml_words), UNPROVIDED);
            SubLObject i = ZERO_INTEGER;
            SubLObject cdolist_list_var = xml_words;
            SubLObject xml_word = NIL;
            for (xml_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , xml_word = cdolist_list_var.first()) {
                {
                    SubLObject lw = object.new_class_instance(WORD_LINKAGE_WORD);
                    instances.set_slot(lw, STRING, web_utilities.xml_sexpr_daughters(xml_word, UNPROVIDED).first());
                    instances.set_slot(lw, POS, make_keyword(web_utilities.xml_sexpr_attribute_value(xml_word, $$$cat)));
                    set_aref(words, i, lw);
                    i = add(i, ONE_INTEGER);
                }
            }
            return words;
        }
    }

    /**
     * returns a vector of word-linkage-words from WORDS-SEXPR
     */
    @LispMethod(comment = "returns a vector of word-linkage-words from WORDS-SEXPR")
    public static SubLObject words_sexpr_to_word_vector(final SubLObject words_sexpr) {
        final SubLObject xml_words = xml_parsing_utilities.xml_sexpr_daughters(words_sexpr, UNPROVIDED);
        final SubLObject words = make_vector(length(xml_words), UNPROVIDED);
        SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var = xml_words;
        SubLObject xml_word = NIL;
        xml_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lw = object.new_class_instance(WORD_LINKAGE_WORD);
            instances.set_slot(lw, STRING, xml_parsing_utilities.xml_sexpr_daughters(xml_word, UNPROVIDED).first());
            instances.set_slot(lw, POS, make_keyword(xml_parsing_utilities.xml_sexpr_attribute_value(xml_word, $$$cat)));
            set_aref(words, i, lw);
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            xml_word = cdolist_list_var.first();
        } 
        return words;
    }

    /**
     * If the input WORD is a part of an idiom, all the idiom parts are merged to
     * create the idiom.  The idiom string and the idiom-parts are returned.
     */
    @LispMethod(comment = "If the input WORD is a part of an idiom, all the idiom parts are merged to\r\ncreate the idiom.  The idiom string and the idiom-parts are returned.\nIf the input WORD is a part of an idiom, all the idiom parts are merged to\ncreate the idiom.  The idiom string and the idiom-parts are returned.")
    public static final SubLObject retrieve_link_word_alt(SubLObject word, SubLObject link_structure, SubLObject word_links, SubLObject input_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject wi = word;
                SubLObject rlinks = aref(word_links, wi).rest();
                SubLObject idiom_link = com.cyc.cycjava.cycl.word_linkage.find_link_id($$$ID, link_structure, rlinks);
                SubLObject string = NIL;
                SubLObject pos = NIL;
                SubLObject idioms = NIL;
                SubLObject idiom_parts = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject string_3 = linkage.split_link_word(linkage.ls_word_of_linkage(link_structure, wi));
                    SubLObject pos_4 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    string = string_3;
                    pos = pos_4;
                }
                if (NIL != idiom_link) {
                    idioms = cons(wi, idioms);
                    idiom_parts = cons(string, idiom_parts);
                    while (NIL != idiom_link) {
                        wi = linkage.ls_rword_index_of_link(link_structure, idiom_link);
                        idiom_parts = cons(linkage.split_link_word(linkage.ls_word_of_linkage(link_structure, wi)), idiom_parts);
                        rlinks = aref(word_links, wi).rest();
                        idiom_link = com.cyc.cycjava.cycl.word_linkage.find_link_id($$$ID, link_structure, rlinks);
                        idioms = cons(wi, idioms);
                    } 
                    string = string_utilities.bunge_according_to_string(nreverse(idiom_parts), input_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != pos) {
                    string = cconcatenate(string, new SubLObject[]{ $str_alt108$_, princ_to_string(pos) });
                }
                return values(string, nreverse(idioms));
            }
        }
    }

    /**
     * If the input WORD is a part of an idiom, all the idiom parts are merged to
     * create the idiom.  The idiom string and the idiom-parts are returned.
     */
    @LispMethod(comment = "If the input WORD is a part of an idiom, all the idiom parts are merged to\r\ncreate the idiom.  The idiom string and the idiom-parts are returned.\nIf the input WORD is a part of an idiom, all the idiom parts are merged to\ncreate the idiom.  The idiom string and the idiom-parts are returned.")
    public static SubLObject retrieve_link_word(final SubLObject word, final SubLObject link_structure, final SubLObject word_links, final SubLObject input_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rlinks = aref(word_links, word).rest();
        SubLObject idiom_link = find_link_id($$$ID, link_structure, rlinks);
        SubLObject string = NIL;
        SubLObject pos = NIL;
        SubLObject idioms = NIL;
        SubLObject idiom_parts = NIL;
        thread.resetMultipleValues();
        final SubLObject string_$3 = linkage.split_link_word(linkage.ls_word_of_linkage(link_structure, word));
        final SubLObject pos_$4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        string = string_$3;
        pos = pos_$4;
        if (NIL != idiom_link) {
            idioms = cons(word, idioms);
            idiom_parts = cons(string, idiom_parts);
            while (NIL != idiom_link) {
                final SubLObject wi = linkage.ls_rword_index_of_link(link_structure, idiom_link);
                idiom_parts = cons(linkage.split_link_word(linkage.ls_word_of_linkage(link_structure, wi)), idiom_parts);
                rlinks = aref(word_links, wi).rest();
                idiom_link = find_link_id($$$ID, link_structure, rlinks);
                idioms = cons(wi, idioms);
            } 
            string = string_utilities.bunge_according_to_string(nreverse(idiom_parts), input_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != pos) {
            string = cconcatenate(string, new SubLObject[]{ $str108$_, princ_to_string(pos) });
        }
        return values(string, nreverse(idioms));
    }

    public static final SubLObject find_link_id_alt(SubLObject link_name, SubLObject link_structure, SubLObject links) {
        {
            SubLObject cdolist_list_var = links;
            SubLObject link = NIL;
            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                if (NIL != string_utilities.starts_with(linkage.ls_name_of_link(link_structure, link), link_name)) {
                    return link;
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_link_id(final SubLObject link_name, final SubLObject link_structure, final SubLObject links) {
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.starts_with(linkage.ls_name_of_link(link_structure, link), link_name)) {
                return link;
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject get_idiom_links_alt(SubLObject idiom_ids, SubLObject word_links, SubLObject link_structure) {
        {
            SubLObject llinks = NIL;
            SubLObject rlinks = NIL;
            SubLObject dup_link_id = NIL;
            SubLObject cdolist_list_var = idiom_ids;
            SubLObject word_id = NIL;
            for (word_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word_id = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_5 = aref(word_links, word_id).first();
                    SubLObject llink_id = NIL;
                    for (llink_id = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , llink_id = cdolist_list_var_5.first()) {
                        {
                            SubLObject internal_linkP = NIL;
                            SubLObject remaining = NIL;
                            SubLObject wi = NIL;
                            for (remaining = idiom_ids, wi = remaining.first(); !((NIL != internal_linkP) || wi.numGE(word_id)); remaining = remaining.rest() , wi = remaining.first()) {
                                internal_linkP = makeBoolean((NIL != internal_linkP) || (NIL != member(llink_id, aref(word_links, wi).rest(), UNPROVIDED, UNPROVIDED)));
                            }
                            dup_link_id = com.cyc.cycjava.cycl.word_linkage.link_member_p(llink_id, llinks, link_structure);
                            if (NIL != dup_link_id) {
                                set_aref(linkage.ls_links(link_structure), llink_id, NIL);
                            } else {
                                if (NIL == internal_linkP) {
                                    llinks = cons(llink_id, llinks);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var_6 = aref(word_links, word_id).rest();
                    SubLObject rlink_id = NIL;
                    for (rlink_id = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , rlink_id = cdolist_list_var_6.first()) {
                        {
                            SubLObject internal_linkP = NIL;
                            SubLObject remaining = NIL;
                            SubLObject wi = NIL;
                            for (remaining = reverse(idiom_ids), wi = remaining.first(); !((NIL != internal_linkP) || wi.numLE(word_id)); remaining = remaining.rest() , wi = remaining.first()) {
                                internal_linkP = makeBoolean((NIL != internal_linkP) || (NIL != member(rlink_id, aref(word_links, wi).first(), UNPROVIDED, UNPROVIDED)));
                            }
                            dup_link_id = com.cyc.cycjava.cycl.word_linkage.link_member_p(rlink_id, rlinks, link_structure);
                            if (NIL != dup_link_id) {
                                set_aref(linkage.ls_links(link_structure), rlink_id, NIL);
                            } else {
                                if (NIL == internal_linkP) {
                                    rlinks = cons(rlink_id, rlinks);
                                }
                            }
                        }
                    }
                }
            }
            return cons(llinks, rlinks);
        }
    }

    public static SubLObject get_idiom_links(final SubLObject idiom_ids, final SubLObject word_links, final SubLObject link_structure) {
        SubLObject llinks = NIL;
        SubLObject rlinks = NIL;
        SubLObject dup_link_id = NIL;
        SubLObject cdolist_list_var = idiom_ids;
        SubLObject word_id = NIL;
        word_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = aref(word_links, word_id).first();
            SubLObject llink_id = NIL;
            llink_id = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                SubLObject internal_linkP;
                SubLObject remaining;
                SubLObject wi;
                for (internal_linkP = NIL, remaining = NIL, wi = NIL, remaining = idiom_ids, wi = remaining.first(); (NIL == internal_linkP) && (!wi.numGE(word_id)); internal_linkP = makeBoolean((NIL != internal_linkP) || (NIL != member(llink_id, aref(word_links, wi).rest(), UNPROVIDED, UNPROVIDED))) , remaining = remaining.rest() , wi = remaining.first()) {
                }
                dup_link_id = link_member_p(llink_id, llinks, link_structure);
                if (NIL != dup_link_id) {
                    set_aref(linkage.ls_links(link_structure), llink_id, NIL);
                } else
                    if (NIL == internal_linkP) {
                        llinks = cons(llink_id, llinks);
                    }

                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                llink_id = cdolist_list_var_$5.first();
            } 
            SubLObject cdolist_list_var_$6 = aref(word_links, word_id).rest();
            SubLObject rlink_id = NIL;
            rlink_id = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                SubLObject internal_linkP;
                SubLObject remaining;
                SubLObject wi;
                for (internal_linkP = NIL, remaining = NIL, wi = NIL, remaining = reverse(idiom_ids), wi = remaining.first(); (NIL == internal_linkP) && (!wi.numLE(word_id)); internal_linkP = makeBoolean((NIL != internal_linkP) || (NIL != member(rlink_id, aref(word_links, wi).first(), UNPROVIDED, UNPROVIDED))) , remaining = remaining.rest() , wi = remaining.first()) {
                }
                dup_link_id = link_member_p(rlink_id, rlinks, link_structure);
                if (NIL != dup_link_id) {
                    set_aref(linkage.ls_links(link_structure), rlink_id, NIL);
                } else
                    if (NIL == internal_linkP) {
                        rlinks = cons(rlink_id, rlinks);
                    }

                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                rlink_id = cdolist_list_var_$6.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word_id = cdolist_list_var.first();
        } 
        return cons(llinks, rlinks);
    }

    /**
     *
     *
     * @param LINK
    linkp;
     * 		
     * @return boolean; t if LINK is incomplete, nil otherwise
     */
    @LispMethod(comment = "@param LINK\nlinkp;\r\n\t\t\r\n@return boolean; t if LINK is incomplete, nil otherwise")
    public static final SubLObject incomplete_linkP_alt(SubLObject link) {
        if (NIL != link) {
            return makeBoolean(!((NIL != linkage.link_left_word(link)) && (NIL != linkage.link_right_word(link))));
        }
        return NIL;
    }

    /**
     *
     *
     * @param LINK
    linkp;
     * 		
     * @return boolean; t if LINK is incomplete, nil otherwise
     */
    @LispMethod(comment = "@param LINK\nlinkp;\r\n\t\t\r\n@return boolean; t if LINK is incomplete, nil otherwise")
    public static SubLObject incomplete_linkP(final SubLObject link) {
        if (NIL != link) {
            return makeBoolean((NIL == linkage.link_left_word(link)) || (NIL == linkage.link_right_word(link)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; the first link in LINKS 'equivalent' to LINK-ID (according to LINK-STRUCTURE)
    or nil if there is none
     */
    @LispMethod(comment = "@return boolean; the first link in LINKS \'equivalent\' to LINK-ID (according to LINK-STRUCTURE)\r\nor nil if there is none")
    public static final SubLObject link_member_p_alt(SubLObject link_id, SubLObject links, SubLObject link_structure) {
        {
            SubLObject name = linkage.ls_name_of_link(link_structure, link_id);
            SubLObject left_word = linkage.ls_lword_index_of_link(link_structure, link_id);
            SubLObject right_word = linkage.ls_rword_index_of_link(link_structure, link_id);
            SubLObject cdolist_list_var = links;
            SubLObject link = NIL;
            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                if ((((NIL != name) && (NIL != linkage.ls_name_of_link(link_structure, link))) && (NIL != Strings.stringE(name, linkage.ls_name_of_link(link_structure, link), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (left_word.numE(linkage.ls_lword_index_of_link(link_structure, link)) || right_word.numE(linkage.ls_rword_index_of_link(link_structure, link)))) {
                    return linkage.ls_link(link_structure, link);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; the first link in LINKS 'equivalent' to LINK-ID (according to LINK-STRUCTURE)
    or nil if there is none
     */
    @LispMethod(comment = "@return boolean; the first link in LINKS \'equivalent\' to LINK-ID (according to LINK-STRUCTURE)\r\nor nil if there is none")
    public static SubLObject link_member_p(final SubLObject link_id, final SubLObject links, final SubLObject link_structure) {
        final SubLObject name = linkage.ls_name_of_link(link_structure, link_id);
        final SubLObject left_word = linkage.ls_lword_index_of_link(link_structure, link_id);
        final SubLObject right_word = linkage.ls_rword_index_of_link(link_structure, link_id);
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((((NIL != name) && (NIL != linkage.ls_name_of_link(link_structure, link))) && (NIL != Strings.stringE(name, linkage.ls_name_of_link(link_structure, link), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (left_word.numE(linkage.ls_lword_index_of_link(link_structure, link)) || right_word.numE(linkage.ls_rword_index_of_link(link_structure, link)))) {
                return linkage.ls_link(link_structure, link);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
     * 		stringp; the sentence for which a word-linkage is requested
     * @return listp; word-linkages for SENTENCE, ordered from best to worst, paying
    attention to the Link Parser Options that are passed in.
     */
    @LispMethod(comment = "@param SENTENCE\r\n\t\tstringp; the sentence for which a word-linkage is requested\r\n@return listp; word-linkages for SENTENCE, ordered from best to worst, paying\r\nattention to the Link Parser Options that are passed in.")
    public static final SubLObject new_word_linkages_alt(SubLObject sentence, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = v_properties;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_7 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt109);
                    current_7 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt109);
                    if (NIL == member(current_7, $list_alt110, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_7 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt109);
                }
                {
                    SubLObject options_tail = property_list_member($OPTIONS, current);
                    SubLObject options = (NIL != options_tail) ? ((SubLObject) (cadr(options_tail))) : linkage.$link_parse_options$.getDynamicValue(thread);
                    SubLObject lexicon_tail = property_list_member($LEXICON, current);
                    SubLObject lexicon = (NIL != lexicon_tail) ? ((SubLObject) (cadr(lexicon_tail))) : NIL;
                    SubLObject use_standardized_word_stringsP_tail = property_list_member($kw114$USE_STANDARDIZED_WORD_STRINGS_, current);
                    SubLObject use_standardized_word_stringsP = (NIL != use_standardized_word_stringsP_tail) ? ((SubLObject) (cadr(use_standardized_word_stringsP_tail))) : T;
                    SubLTrampolineFile.checkType(sentence, STRINGP);
                    SubLTrampolineFile.checkType(options, LISTP);
                    {
                        SubLObject link_structures = linkage.link_parse(sentence, options, lexicon, use_standardized_word_stringsP);
                        SubLObject linkages = NIL;
                        SubLObject tagged_sent = NIL;
                        if (NIL == link_structures) {
                            return NIL;
                        }
                        tagged_sent = linkage.words_to_sentence(linkage.ls_words(link_structures.first()));
                        pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
                        linkage.auxify_sentence(tagged_sent);
                        {
                            SubLObject cdolist_list_var = link_structures;
                            SubLObject link_structure = NIL;
                            for (link_structure = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link_structure = cdolist_list_var.first()) {
                                linkages = cons(com.cyc.cycjava.cycl.word_linkage.new_word_linkage_from_link_structure(link_structure, tagged_sent, sentence, NIL != lexicon ? ((SubLObject) (T)) : NIL), linkages);
                            }
                        }
                        return linkages;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param SENTENCE
     * 		stringp; the sentence for which a word-linkage is requested
     * @return listp; word-linkages for SENTENCE, ordered from best to worst, paying
    attention to the Link Parser Options that are passed in.
     */
    @LispMethod(comment = "@param SENTENCE\r\n\t\tstringp; the sentence for which a word-linkage is requested\r\n@return listp; word-linkages for SENTENCE, ordered from best to worst, paying\r\nattention to the Link Parser Options that are passed in.")
    public static SubLObject new_word_linkages(final SubLObject sentence, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list109);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list109);
            if (NIL == member(current_$7, $list110, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list109);
        }
        final SubLObject options_tail = property_list_member($OPTIONS, current);
        final SubLObject options = (NIL != options_tail) ? cadr(options_tail) : linkage.$link_parse_options$.getDynamicValue(thread);
        final SubLObject lexicon_tail = property_list_member($LEXICON, current);
        final SubLObject lexicon = (NIL != lexicon_tail) ? cadr(lexicon_tail) : NIL;
        final SubLObject use_standardized_word_stringsP_tail = property_list_member($kw114$USE_STANDARDIZED_WORD_STRINGS_, current);
        final SubLObject use_standardized_word_stringsP = (NIL != use_standardized_word_stringsP_tail) ? cadr(use_standardized_word_stringsP_tail) : T;
        assert NIL != stringp(sentence) : "! stringp(sentence) " + ("Types.stringp(sentence) " + "CommonSymbols.NIL != Types.stringp(sentence) ") + sentence;
        assert NIL != listp(options) : "! listp(options) " + ("Types.listp(options) " + "CommonSymbols.NIL != Types.listp(options) ") + options;
        final SubLObject link_structures = linkage.link_parse(sentence, options, lexicon, use_standardized_word_stringsP);
        SubLObject linkages = NIL;
        SubLObject tagged_sent = NIL;
        if (NIL == link_structures) {
            return NIL;
        }
        tagged_sent = linkage.words_to_sentence(linkage.ls_words(link_structures.first()));
        pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
        linkage.auxify_sentence(tagged_sent);
        SubLObject cdolist_list_var = link_structures;
        SubLObject link_structure = NIL;
        link_structure = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            linkages = cons(new_word_linkage_from_link_structure(link_structure, tagged_sent, sentence, NIL != lexicon ? T : NIL), linkages);
            cdolist_list_var = cdolist_list_var.rest();
            link_structure = cdolist_list_var.first();
        } 
        return linkages;
    }

    /**
     *
     *
     * @param SENTENCE
     * 		stringp; the sentence for which a word-linkage is requested
     * @return word-linkage-p; the best word-linkage for SENTENCE, paying attention
    to PROPERTIES
     */
    @LispMethod(comment = "@param SENTENCE\r\n\t\tstringp; the sentence for which a word-linkage is requested\r\n@return word-linkage-p; the best word-linkage for SENTENCE, paying attention\r\nto PROPERTIES")
    public static final SubLObject new_word_linkage_alt(SubLObject sentence, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        linkage.ensure_linkage_initialized();
        return com.cyc.cycjava.cycl.word_linkage.new_word_linkages(sentence, v_properties).first();
    }

    /**
     *
     *
     * @param SENTENCE
     * 		stringp; the sentence for which a word-linkage is requested
     * @return word-linkage-p; the best word-linkage for SENTENCE, paying attention
    to PROPERTIES
     */
    @LispMethod(comment = "@param SENTENCE\r\n\t\tstringp; the sentence for which a word-linkage is requested\r\n@return word-linkage-p; the best word-linkage for SENTENCE, paying attention\r\nto PROPERTIES")
    public static SubLObject new_word_linkage(final SubLObject sentence, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        linkage.ensure_linkage_initialized();
        return new_word_linkages(sentence, v_properties).first();
    }

    /**
     * Prints this word-linkage to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints this word-linkage to STREAM, ignoring DEPTH")
    public static final SubLObject word_linkage_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_word_linkage_method = NIL;
            SubLObject words = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_words(self);
            try {
                try {
                    {
                        SubLObject vector_var = words;
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject word = aref(vector_var, element_num);
                                princ(word, stream);
                                terpri(stream);
                            }
                        }
                        sublisp_throw($sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, self);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_words(self, words);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            }
            return catch_var_for_word_linkage_method;
        }
    }

    /**
     * Prints this word-linkage to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints this word-linkage to STREAM, ignoring DEPTH")
    public static SubLObject word_linkage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = NIL;
        final SubLObject words = get_word_linkage_words(self);
        try {
            thread.throwStack.push($sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                final SubLObject vector_var = words;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject word;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    word = aref(vector_var, element_num);
                    princ(word, stream);
                    terpri(stream);
                }
                sublisp_throw($sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_words(self, words);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }

    /**
     * Prints this word-linkage's diagram
     */
    @LispMethod(comment = "Prints this word-linkage\'s diagram")
    public static final SubLObject word_linkage_print_diagram_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_linkage_method = NIL;
            SubLObject diagram = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_diagram(self);
            try {
                try {
                    princ(diagram, UNPROVIDED);
                    sublisp_throw($sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_diagram(self, diagram);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            }
            return catch_var_for_word_linkage_method;
        }
    }

    /**
     * Prints this word-linkage's diagram
     */
    @LispMethod(comment = "Prints this word-linkage\'s diagram")
    public static SubLObject word_linkage_print_diagram_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = NIL;
        final SubLObject diagram = get_word_linkage_diagram(self);
        try {
            thread.throwStack.push($sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                princ(diagram, UNPROVIDED);
                sublisp_throw($sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_diagram(self, diagram);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym122$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }

    /**
     *
     *
     * @return stringp; the XML string representation of this linkage
     */
    @LispMethod(comment = "@return stringp; the XML string representation of this linkage")
    public static final SubLObject word_linkage_xml_method_alt(SubLObject self) {
        {
            SubLObject xml = NIL;
            SubLObject indent = ZERO_INTEGER;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                format(stream, $str_alt126$_word_linkage___);
                string_utilities.tab(add(indent, THREE_INTEGER), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                format(stream, $str_alt127$_words___);
                {
                    SubLObject word = NIL;
                    SubLObject vector_var = instances.get_slot(self, WORDS);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject w = aref(vector_var, element_num);
                            word = w;
                            com.cyc.cycjava.cycl.word_linkage.word_linkage_word_xml(word, stream, add(indent, SIX_INTEGER));
                        }
                    }
                }
                string_utilities.tab(add(indent, THREE_INTEGER), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                format(stream, $str_alt128$__words___);
                linkage.links_xml(com.cyc.cycjava.cycl.word_linkage.get_word_linkage_links(self), stream, add(indent, THREE_INTEGER));
                format(stream, $str_alt129$__word_linkage___);
                xml = get_output_stream_string(stream);
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
            return xml;
        }
    }

    /**
     *
     *
     * @return stringp; the XML string representation of this linkage
     */
    @LispMethod(comment = "@return stringp; the XML string representation of this linkage")
    public static SubLObject word_linkage_xml_method(final SubLObject self) {
        SubLObject xml = NIL;
        final SubLObject indent = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            format(stream, $str126$_word_linkage___);
            string_utilities.tab(add(indent, THREE_INTEGER), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            format(stream, $str127$_words___);
            SubLObject word = NIL;
            final SubLObject vector_var = instances.get_slot(self, WORDS);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject w;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                w = word = aref(vector_var, element_num);
                word_linkage_word_xml(word, stream, add(indent, SIX_INTEGER));
            }
            string_utilities.tab(add(indent, THREE_INTEGER), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            format(stream, $str128$__words___);
            linkage.links_xml(get_word_linkage_links(self), stream, add(indent, THREE_INTEGER));
            format(stream, $str129$__word_linkage___);
            xml = get_output_stream_string(stream);
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
        return xml;
    }

    /**
     * prints the XML representation of link word LW to STREAM with INDENT indentation
     */
    @LispMethod(comment = "prints the XML representation of link word LW to STREAM with INDENT indentation")
    public static final SubLObject word_linkage_word_xml_alt(SubLObject lw, SubLObject stream, SubLObject indent) {
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return format(stream, $str_alt131$_word_cat___a___a__word___, methods.funcall_instance_method_with_0_args(lw, GET_CATEGORY), methods.funcall_instance_method_with_0_args(lw, GET_STRING));
    }

    /**
     * prints the XML representation of link word LW to STREAM with INDENT indentation
     */
    @LispMethod(comment = "prints the XML representation of link word LW to STREAM with INDENT indentation")
    public static SubLObject word_linkage_word_xml(final SubLObject lw, final SubLObject stream, final SubLObject indent) {
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return format(stream, $str131$_word_cat___a___a__word___, methods.funcall_instance_method_with_0_args(lw, GET_CATEGORY), methods.funcall_instance_method_with_0_args(lw, GET_STRING));
    }

    /**
     *
     *
     * @return integerp; the number of words in this word-linkage
     */
    @LispMethod(comment = "@return integerp; the number of words in this word-linkage")
    public static final SubLObject word_linkage_length_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_linkage_method = NIL;
            SubLObject words = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_words(self);
            try {
                try {
                    sublisp_throw($sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, subtract(length(words), TWO_INTEGER));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_words(self, words);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            }
            return catch_var_for_word_linkage_method;
        }
    }

    /**
     *
     *
     * @return integerp; the number of words in this word-linkage
     */
    @LispMethod(comment = "@return integerp; the number of words in this word-linkage")
    public static SubLObject word_linkage_length_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = NIL;
        final SubLObject words = get_word_linkage_words(self);
        try {
            thread.throwStack.push($sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                sublisp_throw($sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, subtract(length(words), TWO_INTEGER));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_words(self, words);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym134$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }

    /**
     *
     *
     * @return stringp; the tree of this word-linkage, as a string
     */
    @LispMethod(comment = "@return stringp; the tree of this word-linkage, as a string")
    public static final SubLObject word_linkage_get_tree_string_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_linkage_method = NIL;
            SubLObject tree_string = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_tree_string(self);
            try {
                try {
                    sublisp_throw($sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, tree_string);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_tree_string(self, tree_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            }
            return catch_var_for_word_linkage_method;
        }
    }

    /**
     *
     *
     * @return stringp; the tree of this word-linkage, as a string
     */
    @LispMethod(comment = "@return stringp; the tree of this word-linkage, as a string")
    public static SubLObject word_linkage_get_tree_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = NIL;
        final SubLObject tree_string = get_word_linkage_tree_string(self);
        try {
            thread.throwStack.push($sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                sublisp_throw($sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, tree_string);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_tree_string(self, tree_string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym138$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ list(makeSymbol("LINKAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("POS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEFT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RIGHT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEXES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LINKAGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ABS-INDEX"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CATEGORY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDEX"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEFT-LINKS"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RIGHT-LINKS"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LINKS"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTLY-RELATED"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RELATED"), list(makeSymbol("LINK-PATH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY"), list(makeSymbol("LEXICON")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POS-FILTER-LEXES"), NIL, makeKeyword("PROTECTED")) });

    /**
     *
     *
     * @param I
    non-negative-integer
     * 		
     * @return word-linkage-word-p; the Ith word of this word-linkage
     */
    @LispMethod(comment = "@param I\nnon-negative-integer\r\n\t\t\r\n@return word-linkage-word-p; the Ith word of this word-linkage")
    public static final SubLObject word_linkage_get_word_method_alt(SubLObject self, SubLObject i) {
        {
            SubLObject catch_var_for_word_linkage_method = NIL;
            SubLObject words = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_words(self);
            try {
                try {
                    SubLTrampolineFile.checkType(i, NON_NEGATIVE_INTEGER_P);
                    if (!i.numG(number_utilities.f_1_(length(words)))) {
                        sublisp_throw($sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, aref(words, i));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_words(self, words);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            }
            return catch_var_for_word_linkage_method;
        }
    }

    /**
     *
     *
     * @param I
    non-negative-integer
     * 		
     * @return word-linkage-word-p; the Ith word of this word-linkage
     */
    @LispMethod(comment = "@param I\nnon-negative-integer\r\n\t\t\r\n@return word-linkage-word-p; the Ith word of this word-linkage")
    public static SubLObject word_linkage_get_word_method(final SubLObject self, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = NIL;
        final SubLObject words = get_word_linkage_words(self);
        try {
            thread.throwStack.push($sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                assert NIL != subl_promotions.non_negative_integer_p(i) : "! subl_promotions.non_negative_integer_p(i) " + ("subl_promotions.non_negative_integer_p(i) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(i) ") + i;
                if (!i.numG(number_utilities.f_1_(length(words)))) {
                    sublisp_throw($sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, aref(words, i));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_words(self, words);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym143$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }

    /**
     *
     *
     * @param LEXICON
     * 		semtrans-lexicon-p; the lexicon to lexify with
     * @return word-linkage-p; this word-linkage destructively lexified with
    lexicon
     */
    @LispMethod(comment = "@param LEXICON\r\n\t\tsemtrans-lexicon-p; the lexicon to lexify with\r\n@return word-linkage-p; this word-linkage destructively lexified with\r\nlexicon")
    public static final SubLObject word_linkage_lexify_method_alt(SubLObject self, SubLObject lexicon) {
        SubLTrampolineFile.checkType(lexicon, ABSTRACT_LEXICON_P);
        {
            SubLObject word = NIL;
            SubLObject vector_var = instances.get_slot(self, WORDS);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject w = aref(vector_var, element_num);
                    word = w;
                    methods.funcall_instance_method_with_1_args(word, LEXIFY, lexicon);
                }
            }
        }
        return self;
    }

    /**
     *
     *
     * @param LEXICON
     * 		semtrans-lexicon-p; the lexicon to lexify with
     * @return word-linkage-p; this word-linkage destructively lexified with
    lexicon
     */
    @LispMethod(comment = "@param LEXICON\r\n\t\tsemtrans-lexicon-p; the lexicon to lexify with\r\n@return word-linkage-p; this word-linkage destructively lexified with\r\nlexicon")
    public static SubLObject word_linkage_lexify_method(final SubLObject self, final SubLObject lexicon) {
        assert NIL != abstract_lexicon.abstract_lexicon_p(lexicon) : "! abstract_lexicon.abstract_lexicon_p(lexicon) " + ("abstract_lexicon.abstract_lexicon_p(lexicon) " + "CommonSymbols.NIL != abstract_lexicon.abstract_lexicon_p(lexicon) ") + lexicon;
        SubLObject word = NIL;
        final SubLObject vector_var = instances.get_slot(self, WORDS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            w = word = aref(vector_var, element_num);
            methods.funcall_instance_method_with_1_args(word, LEXIFY, lexicon);
        }
        return self;
    }

    static private final SubLList $list_alt17 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt18 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt19 = list(new SubLObject[]{ makeString("Prints this link word to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<LW"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString("("), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("POS"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString("): "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("STRING"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")) });

    public static final SubLObject word_linkage_yield_method_alt(SubLObject self) {
        {
            SubLObject yield = NIL;
            SubLObject word = NIL;
            SubLObject vector_var = instances.get_slot(self, WORDS);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject w = aref(vector_var, element_num);
                    word = w;
                    yield = cons(word, yield);
                }
            }
            return nreverse(yield);
        }
    }

    public static SubLObject word_linkage_yield_method(final SubLObject self) {
        SubLObject yield = NIL;
        SubLObject word = NIL;
        final SubLObject vector_var = instances.get_slot(self, WORDS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            w = word = aref(vector_var, element_num);
            yield = cons(word, yield);
        }
        return nreverse(yield);
    }

    static private final SubLString $str_alt21$__LW = makeString("#<LW");

    static private final SubLString $str_alt22$_ = makeString("(");

    static private final SubLString $str_alt23$___ = makeString("): ");

    static private final SubLString $str_alt24$_ = makeString(">");

    static private final SubLList $list_alt27 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt28 = list(makeString("@return word-linkage-p; the linkage this word is a part of"), list(RET, makeSymbol("LINKAGE")));

    /**
     *
     *
     * @return word-linkage-word-p; the Nth word with string WORD-STRING
     */
    @LispMethod(comment = "@return word-linkage-word-p; the Nth word with string WORD-STRING")
    public static final SubLObject word_linkage_search_method_alt(SubLObject self, SubLObject word_string, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        {
            SubLObject catch_var_for_word_linkage_method = NIL;
            SubLObject words = com.cyc.cycjava.cycl.word_linkage.get_word_linkage_words(self);
            try {
                try {
                    SubLTrampolineFile.checkType(word_string, STRINGP);
                    SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
                    {
                        SubLObject counter = ZERO_INTEGER;
                        SubLObject cdotimes_end_var = length(words);
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                            if (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(self, GET_WORD, i), GET_STRING).equalp(word_string)) {
                                counter = add(counter, ONE_INTEGER);
                                if (counter.numE(n)) {
                                    sublisp_throw($sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, methods.funcall_instance_method_with_1_args(self, GET_WORD, i));
                                }
                            }
                        }
                        sublisp_throw($sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.word_linkage.set_word_linkage_words(self, words);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            }
            return catch_var_for_word_linkage_method;
        }
    }

    /**
     *
     *
     * @return word-linkage-word-p; the Nth word with string WORD-STRING
     */
    @LispMethod(comment = "@return word-linkage-word-p; the Nth word with string WORD-STRING")
    public static SubLObject word_linkage_search_method(final SubLObject self, final SubLObject word_string, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_linkage_method = NIL;
        final SubLObject words = get_word_linkage_words(self);
        try {
            thread.throwStack.push($sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
            try {
                assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
                assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
                SubLObject counter = ZERO_INTEGER;
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = length(words), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    if (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(self, GET_WORD, i), GET_STRING).equalp(word_string)) {
                        counter = add(counter, ONE_INTEGER);
                        if (counter.numE(n)) {
                            sublisp_throw($sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, methods.funcall_instance_method_with_1_args(self, GET_WORD, i));
                        }
                    }
                }
                sublisp_throw($sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_linkage_words(self, words);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym155$OUTER_CATCH_FOR_WORD_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_linkage_method;
    }

    static private final SubLList $list_alt32 = list(makeString("@return string; the surface string of this word"), list(RET, makeSymbol("STRING")));

    static private final SubLList $list_alt36 = list(makeString("@return numberp; the absolute index of this word"), list(RET, makeSymbol("INDEX")));

    static private final SubLList $list_alt40 = list(makeString("@return keywordp; the part of speech of this word"), list(RET, makeSymbol("POS")));

    static private final SubLList $list_alt44 = list(makeString("@return keywordp; the part of speech of this word"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POS")))));

    static private final SubLList $list_alt47 = list(makeString("@return numberp; the index of this word"), list(RET, makeSymbol("INDEX")));

    /**
     * Returns T if the Link Parser failed to parse the English sentence for which
     * the linkage WORD-LINKAGE was obtained.
     */
    @LispMethod(comment = "Returns T if the Link Parser failed to parse the English sentence for which\r\nthe linkage WORD-LINKAGE was obtained.\nReturns T if the Link Parser failed to parse the English sentence for which\nthe linkage WORD-LINKAGE was obtained.")
    public static final SubLObject word_linkage_failedP_alt(SubLObject v_word_linkage, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        SubLTrampolineFile.checkType(v_word_linkage, WORD_LINKAGE_P);
        {
            SubLObject word = NIL;
            SubLObject vector_var = instances.get_slot(v_word_linkage, WORDS);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject w = aref(vector_var, element_num);
                    word = w;
                    if (!((NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(word, GET_POS), $list_alt158, symbol_function(EQ), UNPROVIDED)) || (NIL != methods.funcall_instance_method_with_0_args(word, GET_LINKS)))) {
                        if (NIL != verboseP) {
                            format(T, $str_alt159$Failure_causing_word___S_has_link, word, methods.funcall_instance_method_with_0_args(word, GET_LINKS));
                        }
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Returns T if the Link Parser failed to parse the English sentence for which
     * the linkage WORD-LINKAGE was obtained.
     */
    @LispMethod(comment = "Returns T if the Link Parser failed to parse the English sentence for which\r\nthe linkage WORD-LINKAGE was obtained.\nReturns T if the Link Parser failed to parse the English sentence for which\nthe linkage WORD-LINKAGE was obtained.")
    public static SubLObject word_linkage_failedP(final SubLObject v_word_linkage, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        assert NIL != word_linkage_p(v_word_linkage) : "! word_linkage.word_linkage_p(v_word_linkage) " + ("word_linkage.word_linkage_p(v_word_linkage) " + "CommonSymbols.NIL != word_linkage.word_linkage_p(v_word_linkage) ") + v_word_linkage;
        SubLObject word = NIL;
        final SubLObject vector_var = instances.get_slot(v_word_linkage, WORDS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            w = word = aref(vector_var, element_num);
            if ((NIL == subl_promotions.memberP(methods.funcall_instance_method_with_0_args(word, GET_POS), $list158, symbol_function(EQ), UNPROVIDED)) && (NIL == methods.funcall_instance_method_with_0_args(word, GET_LINKS))) {
                if (NIL != verboseP) {
                    format(T, $str159$Failure_causing_word___S_has_link, word, methods.funcall_instance_method_with_0_args(word, GET_LINKS));
                }
                return T;
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt51 = list(makeString("@return numberp; the lexical items for this word"), list(RET, makeSymbol("LEXES")));

    static private final SubLList $list_alt55 = list(makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATTERN"));

    static private final SubLList $list_alt56 = list(list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LINK-PATTERN"), makeSymbol("REGEX-PATTERN-P")), list(makeSymbol("PUNLESS"), makeSymbol("LINK-PATTERN"), list(RET, makeSymbol("LEFT-LINKS"))), list(makeSymbol("CLET"), list(makeSymbol("LINKS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LINK"), makeSymbol("LEFT-LINKS")), list(makeSymbol("PWHEN"), list(makeSymbol("REGEX-MATCH?"), makeSymbol("LINK-PATTERN"), list(makeSymbol("LINK-NAME"), makeSymbol("LINK"))), list(makeSymbol("CPUSH"), makeSymbol("LINK"), makeSymbol("LINKS")))), list(RET, makeSymbol("LINKS"))));

    public static final SubLObject word_linkage_with_retokenization_failedP_alt(SubLObject nl_sentence) {
        return com.cyc.cycjava.cycl.word_linkage.word_linkage_failedP(com.cyc.cycjava.cycl.word_linkage.new_word_linkage(nl_sentence, list($LEXICON, semtrans_lexicon.new_semtrans_lexicon())), UNPROVIDED);
    }

    public static SubLObject word_linkage_with_retokenization_failedP(final SubLObject nl_sentence) {
        return word_linkage_failedP(new_word_linkage(nl_sentence, list($LEXICON, semtrans_lexicon.new_semtrans_lexicon())), UNPROVIDED);
    }

    static private final SubLList $list_alt61 = list(list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LINK-PATTERN"), makeSymbol("REGEX-PATTERN-P")), list(makeSymbol("PUNLESS"), makeSymbol("LINK-PATTERN"), list(RET, makeSymbol("RIGHT-LINKS"))), list(makeSymbol("CLET"), list(makeSymbol("LINKS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LINK"), makeSymbol("RIGHT-LINKS")), list(makeSymbol("PWHEN"), list(makeSymbol("REGEX-MATCH?"), makeSymbol("LINK-PATTERN"), list(makeSymbol("LINK-NAME"), makeSymbol("LINK"))), list(makeSymbol("CPUSH"), makeSymbol("LINK"), makeSymbol("LINKS")))), list(RET, makeSymbol("LINKS"))));

    public static SubLObject declare_word_linkage_file() {
        declareFunction("get_word_linkage_word_lexes", "GET-WORD-LINKAGE-WORD-LEXES", 1, 0, false);
        declareFunction("set_word_linkage_word_lexes", "SET-WORD-LINKAGE-WORD-LEXES", 2, 0, false);
        declareFunction("get_word_linkage_word_right_links", "GET-WORD-LINKAGE-WORD-RIGHT-LINKS", 1, 0, false);
        declareFunction("set_word_linkage_word_right_links", "SET-WORD-LINKAGE-WORD-RIGHT-LINKS", 2, 0, false);
        declareFunction("get_word_linkage_word_left_links", "GET-WORD-LINKAGE-WORD-LEFT-LINKS", 1, 0, false);
        declareFunction("set_word_linkage_word_left_links", "SET-WORD-LINKAGE-WORD-LEFT-LINKS", 2, 0, false);
        declareFunction("get_word_linkage_word_index", "GET-WORD-LINKAGE-WORD-INDEX", 1, 0, false);
        declareFunction("set_word_linkage_word_index", "SET-WORD-LINKAGE-WORD-INDEX", 2, 0, false);
        declareFunction("get_word_linkage_word_pos", "GET-WORD-LINKAGE-WORD-POS", 1, 0, false);
        declareFunction("set_word_linkage_word_pos", "SET-WORD-LINKAGE-WORD-POS", 2, 0, false);
        declareFunction("get_word_linkage_word_string", "GET-WORD-LINKAGE-WORD-STRING", 1, 0, false);
        declareFunction("set_word_linkage_word_string", "SET-WORD-LINKAGE-WORD-STRING", 2, 0, false);
        declareFunction("get_word_linkage_word_linkage", "GET-WORD-LINKAGE-WORD-LINKAGE", 1, 0, false);
        declareFunction("set_word_linkage_word_linkage", "SET-WORD-LINKAGE-WORD-LINKAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_word_linkage_word_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_word_linkage_word_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-WORD-INSTANCE", 1, 0, false);
        declareFunction("word_linkage_word_p", "WORD-LINKAGE-WORD-P", 1, 0, false);
        declareFunction("new_word_linkage_word", "NEW-WORD-LINKAGE-WORD", 6, 0, false);
        declareFunction("word_linkage_word_print_method", "WORD-LINKAGE-WORD-PRINT-METHOD", 3, 0, false);
        declareFunction("word_linkage_word_get_linkage_method", "WORD-LINKAGE-WORD-GET-LINKAGE-METHOD", 1, 0, false);
        declareFunction("word_linkage_word_get_string_method", "WORD-LINKAGE-WORD-GET-STRING-METHOD", 1, 0, false);
        declareFunction("word_linkage_word_get_abs_index_method", "WORD-LINKAGE-WORD-GET-ABS-INDEX-METHOD", 1, 0, false);
        declareFunction("word_linkage_word_get_pos_method", "WORD-LINKAGE-WORD-GET-POS-METHOD", 1, 0, false);
        declareFunction("word_linkage_word_get_category_method", "WORD-LINKAGE-WORD-GET-CATEGORY-METHOD", 1, 0, false);
        declareFunction("word_linkage_word_get_index_method", "WORD-LINKAGE-WORD-GET-INDEX-METHOD", 1, 0, false);
        declareFunction("word_linkage_word_get_lexes_method", "WORD-LINKAGE-WORD-GET-LEXES-METHOD", 1, 0, false);
        declareFunction("word_linkage_word_get_left_links_method", "WORD-LINKAGE-WORD-GET-LEFT-LINKS-METHOD", 1, 1, false);
        declareFunction("word_linkage_word_get_right_links_method", "WORD-LINKAGE-WORD-GET-RIGHT-LINKS-METHOD", 1, 1, false);
        declareFunction("word_linkage_word_get_links_method", "WORD-LINKAGE-WORD-GET-LINKS-METHOD", 1, 1, false);
        declareFunction("word_linkage_word_get_directly_related_method", "WORD-LINKAGE-WORD-GET-DIRECTLY-RELATED-METHOD", 2, 1, false);
        declareFunction("word_linkage_word_get_related_method", "WORD-LINKAGE-WORD-GET-RELATED-METHOD", 2, 0, false);
        declareFunction("word_linkage_word_lexify_method", "WORD-LINKAGE-WORD-LEXIFY-METHOD", 2, 0, false);
        declareFunction("word_linkage_word_pos_filter_lexes_method", "WORD-LINKAGE-WORD-POS-FILTER-LEXES-METHOD", 1, 0, false);
        declareFunction("wall_word_linkage_wordP", "WALL-WORD-LINKAGE-WORD?", 1, 0, false);
        declareFunction("get_word_linkage_tree_string", "GET-WORD-LINKAGE-TREE-STRING", 1, 0, false);
        declareFunction("set_word_linkage_tree_string", "SET-WORD-LINKAGE-TREE-STRING", 2, 0, false);
        declareFunction("get_word_linkage_diagram", "GET-WORD-LINKAGE-DIAGRAM", 1, 0, false);
        declareFunction("set_word_linkage_diagram", "SET-WORD-LINKAGE-DIAGRAM", 2, 0, false);
        declareFunction("get_word_linkage_words", "GET-WORD-LINKAGE-WORDS", 1, 0, false);
        declareFunction("set_word_linkage_words", "SET-WORD-LINKAGE-WORDS", 2, 0, false);
        declareFunction("get_word_linkage_links", "GET-WORD-LINKAGE-LINKS", 1, 0, false);
        declareFunction("set_word_linkage_links", "SET-WORD-LINKAGE-LINKS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_word_linkage_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_word_linkage_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-LINKAGE-INSTANCE", 1, 0, false);
        declareFunction("word_linkage_p", "WORD-LINKAGE-P", 1, 0, false);
        declareFunction("new_word_linkage_from_link_structure", "NEW-WORD-LINKAGE-FROM-LINK-STRUCTURE", 4, 0, false);
        declareFunction("xml_to_word_linkage", "XML-TO-WORD-LINKAGE", 1, 0, false);
        declareFunction("words_sexpr_to_word_vector", "WORDS-SEXPR-TO-WORD-VECTOR", 1, 0, false);
        declareFunction("retrieve_link_word", "RETRIEVE-LINK-WORD", 4, 0, false);
        declareFunction("find_link_id", "FIND-LINK-ID", 3, 0, false);
        declareFunction("get_idiom_links", "GET-IDIOM-LINKS", 3, 0, false);
        declareFunction("incomplete_linkP", "INCOMPLETE-LINK?", 1, 0, false);
        declareFunction("link_member_p", "LINK-MEMBER-P", 3, 0, false);
        declareFunction("new_word_linkages", "NEW-WORD-LINKAGES", 1, 1, false);
        declareFunction("new_word_linkage", "NEW-WORD-LINKAGE", 1, 1, false);
        declareFunction("word_linkage_print_method", "WORD-LINKAGE-PRINT-METHOD", 3, 0, false);
        declareFunction("word_linkage_print_diagram_method", "WORD-LINKAGE-PRINT-DIAGRAM-METHOD", 1, 0, false);
        declareFunction("word_linkage_xml_method", "WORD-LINKAGE-XML-METHOD", 1, 0, false);
        declareFunction("word_linkage_word_xml", "WORD-LINKAGE-WORD-XML", 3, 0, false);
        declareFunction("word_linkage_length_method", "WORD-LINKAGE-LENGTH-METHOD", 1, 0, false);
        declareFunction("word_linkage_get_tree_string_method", "WORD-LINKAGE-GET-TREE-STRING-METHOD", 1, 0, false);
        declareFunction("word_linkage_get_word_method", "WORD-LINKAGE-GET-WORD-METHOD", 2, 0, false);
        declareFunction("word_linkage_lexify_method", "WORD-LINKAGE-LEXIFY-METHOD", 2, 0, false);
        declareFunction("word_linkage_yield_method", "WORD-LINKAGE-YIELD-METHOD", 1, 0, false);
        declareFunction("word_linkage_search_method", "WORD-LINKAGE-SEARCH-METHOD", 2, 1, false);
        declareFunction("word_linkage_failedP", "WORD-LINKAGE-FAILED?", 1, 1, false);
        declareFunction("word_linkage_with_retokenization_failedP", "WORD-LINKAGE-WITH-RETOKENIZATION-FAILED?", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt65 = list(list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LINK-PATTERN"), makeSymbol("REGEX-PATTERN-P")), list(RET, list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LEFT-LINKS")), makeSymbol("LINK-PATTERN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RIGHT-LINKS")), makeSymbol("LINK-PATTERN")))));

    static private final SubLList $list_alt68 = list(makeSymbol("PATTERN-KEYWORD"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"));

    static private final SubLList $list_alt69 = list(makeString("@param PATTERN-KEYWORD keywordp;\n   @return list; the list of words that is related to this word via \n     PATTERN-KEYWORD"), list(makeSymbol("CLET"), list(list(makeSymbol("LINK-PATTERN"), list(makeSymbol("GET-LINK-PATTERN"), makeSymbol("PATTERN-KEYWORD"))), list(makeSymbol("LINK-GETTER"), list(makeSymbol("FCOND"), list(list(makeSymbol("NULL"), makeSymbol("DIRECTION")), list(QUOTE, makeSymbol("GET-LINKS"))), list(list(EQL, makeSymbol("DIRECTION"), $LEFT), list(QUOTE, makeSymbol("GET-LEFT-LINKS"))), list(list(EQL, makeSymbol("DIRECTION"), makeKeyword("RIGHT")), list(QUOTE, makeSymbol("GET-RIGHT-LINKS"))), list(T, list(makeSymbol("ERROR"), makeString("Invalid link direction ~a"), makeSymbol("DIRECTION"))))), makeSymbol("WORDS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LINK"), list(makeSymbol("FIM"), makeSymbol("SELF"), makeSymbol("LINK-GETTER"), makeSymbol("LINK-PATTERN"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("LINK-LEFT-WORD"), makeSymbol("LINK")), makeSymbol("SELF")), list(makeSymbol("CPUSH"), list(makeSymbol("LINK-RIGHT-WORD"), makeSymbol("LINK")), makeSymbol("WORDS")), list(makeSymbol("CPUSH"), list(makeSymbol("LINK-LEFT-WORD"), makeSymbol("LINK")), makeSymbol("WORDS")))), list(RET, makeSymbol("WORDS"))));

    static private final SubLString $str_alt72$Invalid_link_direction__a = makeString("Invalid link direction ~a");

    static private final SubLList $list_alt75 = list(makeSymbol("LINK-PATH"));

    static private final SubLList $list_alt76 = list(makeString("@param LINK-PATH list; a sequence of link-patterns\n   @return list; the list of words that is related to this word via LINK-PATH, \n      in that order"), list(makeSymbol("PUNLESS"), makeSymbol("LINK-PATH"), list(RET, list(makeSymbol("LIST"), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(makeSymbol("WORDS")), list(makeSymbol("CDOLIST"), list(makeSymbol("RELATED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DIRECTLY-RELATED")), list(makeSymbol("CAR"), makeSymbol("LINK-PATH")))), list(makeSymbol("CSETQ"), makeSymbol("WORDS"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("RELATED"), list(QUOTE, makeSymbol("GET-RELATED")), list(makeSymbol("CDR"), makeSymbol("LINK-PATH"))), makeSymbol("WORDS")))), list(RET, makeSymbol("WORDS"))));

    static private final SubLList $list_alt79 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt80 = list(makeSymbol("LEXICON"));

    static private final SubLList $list_alt81 = list(makeString("@param LEXICON semtrans-lexicon-p; the lexicon to lexify this word with\n   @return listp; the list of lex entries used to lexify this word\n   @side-effects alters this word\'s lexes slot\n   see @xref link-word:lexify; this is a simpler version of that function"), list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("STRING"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STRING"))))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")), list(makeSymbol("NEW-EVEN-LEX-ENTRY-DISTRIBUTION"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("STRING")))), list(makeSymbol("PWHEN"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES"))), list(makeSymbol("CSETQ"), makeSymbol("FILTERED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POS-FILTER-LEXES"))))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")), makeSymbol("FILTERED")), list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES"))))));

    static private final SubLList $list_alt85 = list(makeString("Removes any lexical entries that don't match the part-of-speech of this word"), list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("PCOND"), list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POS"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS"))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))), list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POS"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("BACKOFF-PENN-TAGS"))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), makeDouble(0.75)), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(RET, makeSymbol("LEXES"))));

    public static SubLObject init_word_linkage_file() {
        return NIL;
    }

    public static final SubLObject setup_word_linkage_file_alt() {
        classes.subloop_new_class(WORD_LINKAGE_WORD, OBJECT, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(WORD_LINKAGE_WORD, NIL);
        classes.subloop_note_class_initialization_function(WORD_LINKAGE_WORD, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(WORD_LINKAGE_WORD, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_INSTANCE);
        com.cyc.cycjava.cycl.word_linkage.subloop_reserved_initialize_word_linkage_word_class(WORD_LINKAGE_WORD);
        methods.methods_incorporate_instance_method(PRINT, WORD_LINKAGE_WORD, $list_alt17, $list_alt18, $list_alt19);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, PRINT, WORD_LINKAGE_WORD_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_LINKAGE, WORD_LINKAGE_WORD, $list_alt27, NIL, $list_alt28);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LINKAGE, WORD_LINKAGE_WORD_GET_LINKAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_STRING, WORD_LINKAGE_WORD, $list_alt27, NIL, $list_alt32);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_STRING, WORD_LINKAGE_WORD_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_ABS_INDEX, WORD_LINKAGE_WORD, $list_alt27, NIL, $list_alt36);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_ABS_INDEX, WORD_LINKAGE_WORD_GET_ABS_INDEX_METHOD);
        methods.methods_incorporate_instance_method(GET_POS, WORD_LINKAGE_WORD, $list_alt27, NIL, $list_alt40);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_POS, WORD_LINKAGE_WORD_GET_POS_METHOD);
        methods.methods_incorporate_instance_method(GET_CATEGORY, WORD_LINKAGE_WORD, $list_alt27, NIL, $list_alt44);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_CATEGORY, WORD_LINKAGE_WORD_GET_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method(GET_INDEX, WORD_LINKAGE_WORD, $list_alt27, NIL, $list_alt47);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_INDEX, WORD_LINKAGE_WORD_GET_INDEX_METHOD);
        methods.methods_incorporate_instance_method(GET_LEXES, WORD_LINKAGE_WORD, $list_alt27, NIL, $list_alt51);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LEXES, WORD_LINKAGE_WORD_GET_LEXES_METHOD);
        methods.methods_incorporate_instance_method(GET_LEFT_LINKS, WORD_LINKAGE_WORD, $list_alt17, $list_alt55, $list_alt56);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LEFT_LINKS, WORD_LINKAGE_WORD_GET_LEFT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_RIGHT_LINKS, WORD_LINKAGE_WORD, $list_alt17, $list_alt55, $list_alt61);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_RIGHT_LINKS, WORD_LINKAGE_WORD_GET_RIGHT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_LINKS, WORD_LINKAGE_WORD, $list_alt17, $list_alt55, $list_alt65);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LINKS, WORD_LINKAGE_WORD_GET_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECTLY_RELATED, WORD_LINKAGE_WORD, $list_alt17, $list_alt68, $list_alt69);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_DIRECTLY_RELATED, WORD_LINKAGE_WORD_GET_DIRECTLY_RELATED_METHOD);
        methods.methods_incorporate_instance_method(GET_RELATED, WORD_LINKAGE_WORD, $list_alt17, $list_alt75, $list_alt76);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_RELATED, WORD_LINKAGE_WORD_GET_RELATED_METHOD);
        methods.methods_incorporate_instance_method(LEXIFY, WORD_LINKAGE_WORD, $list_alt79, $list_alt80, $list_alt81);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, LEXIFY, WORD_LINKAGE_WORD_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method(POS_FILTER_LEXES, WORD_LINKAGE_WORD, $list_alt17, NIL, $list_alt85);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, POS_FILTER_LEXES, WORD_LINKAGE_WORD_POS_FILTER_LEXES_METHOD);
        classes.subloop_new_class(WORD_LINKAGE, OBJECT, NIL, NIL, $list_alt93);
        classes.class_set_implements_slot_listeners(WORD_LINKAGE, NIL);
        classes.subloop_note_class_initialization_function(WORD_LINKAGE, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_CLASS);
        classes.subloop_note_instance_initialization_function(WORD_LINKAGE, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_INSTANCE);
        com.cyc.cycjava.cycl.word_linkage.subloop_reserved_initialize_word_linkage_class(WORD_LINKAGE);
        methods.methods_incorporate_instance_method(PRINT, WORD_LINKAGE, $list_alt27, $list_alt18, $list_alt117);
        methods.subloop_register_instance_method(WORD_LINKAGE, PRINT, WORD_LINKAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(PRINT_DIAGRAM, WORD_LINKAGE, $list_alt27, NIL, $list_alt121);
        methods.subloop_register_instance_method(WORD_LINKAGE, PRINT_DIAGRAM, WORD_LINKAGE_PRINT_DIAGRAM_METHOD);
        methods.methods_incorporate_instance_method(XML, WORD_LINKAGE, $list_alt27, NIL, $list_alt125);
        methods.subloop_register_instance_method(WORD_LINKAGE, XML, WORD_LINKAGE_XML_METHOD);
        methods.methods_incorporate_instance_method(LENGTH, WORD_LINKAGE, $list_alt27, NIL, $list_alt133);
        methods.subloop_register_instance_method(WORD_LINKAGE, LENGTH, WORD_LINKAGE_LENGTH_METHOD);
        methods.methods_incorporate_instance_method(GET_TREE_STRING, WORD_LINKAGE, $list_alt27, NIL, $list_alt137);
        methods.subloop_register_instance_method(WORD_LINKAGE, GET_TREE_STRING, WORD_LINKAGE_GET_TREE_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_WORD, WORD_LINKAGE, $list_alt27, $list_alt141, $list_alt142);
        methods.subloop_register_instance_method(WORD_LINKAGE, GET_WORD, WORD_LINKAGE_GET_WORD_METHOD);
        methods.methods_incorporate_instance_method(LEXIFY, WORD_LINKAGE, $list_alt27, $list_alt80, $list_alt146);
        methods.subloop_register_instance_method(WORD_LINKAGE, LEXIFY, WORD_LINKAGE_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method(YIELD, WORD_LINKAGE, $list_alt27, NIL, $list_alt150);
        methods.subloop_register_instance_method(WORD_LINKAGE, YIELD, WORD_LINKAGE_YIELD_METHOD);
        methods.methods_incorporate_instance_method(SEARCH, WORD_LINKAGE, $list_alt27, $list_alt153, $list_alt154);
        methods.subloop_register_instance_method(WORD_LINKAGE, SEARCH, WORD_LINKAGE_SEARCH_METHOD);
        define_test_case_table_int($sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_, list(new SubLObject[]{ $TEST, EQ, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt168);
        return NIL;
    }

    public static SubLObject setup_word_linkage_file() {
        if (SubLFiles.USE_V1) {
            classes.subloop_new_class(WORD_LINKAGE_WORD, OBJECT, NIL, NIL, $list2);
            classes.class_set_implements_slot_listeners(WORD_LINKAGE_WORD, NIL);
            classes.subloop_note_class_initialization_function(WORD_LINKAGE_WORD, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_CLASS);
            classes.subloop_note_instance_initialization_function(WORD_LINKAGE_WORD, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_INSTANCE);
            subloop_reserved_initialize_word_linkage_word_class(WORD_LINKAGE_WORD);
            methods.methods_incorporate_instance_method(PRINT, WORD_LINKAGE_WORD, $list17, $list18, $list19);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, PRINT, WORD_LINKAGE_WORD_PRINT_METHOD);
            methods.methods_incorporate_instance_method(GET_LINKAGE, WORD_LINKAGE_WORD, $list27, NIL, $list28);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LINKAGE, WORD_LINKAGE_WORD_GET_LINKAGE_METHOD);
            methods.methods_incorporate_instance_method(GET_STRING, WORD_LINKAGE_WORD, $list27, NIL, $list32);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_STRING, WORD_LINKAGE_WORD_GET_STRING_METHOD);
            methods.methods_incorporate_instance_method(GET_ABS_INDEX, WORD_LINKAGE_WORD, $list27, NIL, $list36);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_ABS_INDEX, WORD_LINKAGE_WORD_GET_ABS_INDEX_METHOD);
            methods.methods_incorporate_instance_method(GET_POS, WORD_LINKAGE_WORD, $list27, NIL, $list40);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_POS, WORD_LINKAGE_WORD_GET_POS_METHOD);
            methods.methods_incorporate_instance_method(GET_CATEGORY, WORD_LINKAGE_WORD, $list27, NIL, $list44);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_CATEGORY, WORD_LINKAGE_WORD_GET_CATEGORY_METHOD);
            methods.methods_incorporate_instance_method(GET_INDEX, WORD_LINKAGE_WORD, $list27, NIL, $list47);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_INDEX, WORD_LINKAGE_WORD_GET_INDEX_METHOD);
            methods.methods_incorporate_instance_method(GET_LEXES, WORD_LINKAGE_WORD, $list27, NIL, $list51);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LEXES, WORD_LINKAGE_WORD_GET_LEXES_METHOD);
            methods.methods_incorporate_instance_method(GET_LEFT_LINKS, WORD_LINKAGE_WORD, $list17, $list55, $list56);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LEFT_LINKS, WORD_LINKAGE_WORD_GET_LEFT_LINKS_METHOD);
            methods.methods_incorporate_instance_method(GET_RIGHT_LINKS, WORD_LINKAGE_WORD, $list17, $list55, $list61);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_RIGHT_LINKS, WORD_LINKAGE_WORD_GET_RIGHT_LINKS_METHOD);
            methods.methods_incorporate_instance_method(GET_LINKS, WORD_LINKAGE_WORD, $list17, $list55, $list65);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LINKS, WORD_LINKAGE_WORD_GET_LINKS_METHOD);
            methods.methods_incorporate_instance_method(GET_DIRECTLY_RELATED, WORD_LINKAGE_WORD, $list17, $list68, $list69);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_DIRECTLY_RELATED, WORD_LINKAGE_WORD_GET_DIRECTLY_RELATED_METHOD);
            methods.methods_incorporate_instance_method(GET_RELATED, WORD_LINKAGE_WORD, $list17, $list75, $list76);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_RELATED, WORD_LINKAGE_WORD_GET_RELATED_METHOD);
            methods.methods_incorporate_instance_method(LEXIFY, WORD_LINKAGE_WORD, $list79, $list80, $list81);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, LEXIFY, WORD_LINKAGE_WORD_LEXIFY_METHOD);
            methods.methods_incorporate_instance_method(POS_FILTER_LEXES, WORD_LINKAGE_WORD, $list17, NIL, $list85);
            methods.subloop_register_instance_method(WORD_LINKAGE_WORD, POS_FILTER_LEXES, WORD_LINKAGE_WORD_POS_FILTER_LEXES_METHOD);
            classes.subloop_new_class(WORD_LINKAGE, OBJECT, NIL, NIL, $list93);
            classes.class_set_implements_slot_listeners(WORD_LINKAGE, NIL);
            classes.subloop_note_class_initialization_function(WORD_LINKAGE, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_CLASS);
            classes.subloop_note_instance_initialization_function(WORD_LINKAGE, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_INSTANCE);
            subloop_reserved_initialize_word_linkage_class(WORD_LINKAGE);
            methods.methods_incorporate_instance_method(PRINT, WORD_LINKAGE, $list27, $list18, $list117);
            methods.subloop_register_instance_method(WORD_LINKAGE, PRINT, WORD_LINKAGE_PRINT_METHOD);
            methods.methods_incorporate_instance_method(PRINT_DIAGRAM, WORD_LINKAGE, $list27, NIL, $list121);
            methods.subloop_register_instance_method(WORD_LINKAGE, PRINT_DIAGRAM, WORD_LINKAGE_PRINT_DIAGRAM_METHOD);
            methods.methods_incorporate_instance_method(XML, WORD_LINKAGE, $list27, NIL, $list125);
            methods.subloop_register_instance_method(WORD_LINKAGE, XML, WORD_LINKAGE_XML_METHOD);
            methods.methods_incorporate_instance_method(LENGTH, WORD_LINKAGE, $list27, NIL, $list133);
            methods.subloop_register_instance_method(WORD_LINKAGE, LENGTH, WORD_LINKAGE_LENGTH_METHOD);
            methods.methods_incorporate_instance_method(GET_TREE_STRING, WORD_LINKAGE, $list27, NIL, $list137);
            methods.subloop_register_instance_method(WORD_LINKAGE, GET_TREE_STRING, WORD_LINKAGE_GET_TREE_STRING_METHOD);
            methods.methods_incorporate_instance_method(GET_WORD, WORD_LINKAGE, $list27, $list141, $list142);
            methods.subloop_register_instance_method(WORD_LINKAGE, GET_WORD, WORD_LINKAGE_GET_WORD_METHOD);
            methods.methods_incorporate_instance_method(LEXIFY, WORD_LINKAGE, $list27, $list80, $list146);
            methods.subloop_register_instance_method(WORD_LINKAGE, LEXIFY, WORD_LINKAGE_LEXIFY_METHOD);
            methods.methods_incorporate_instance_method(YIELD, WORD_LINKAGE, $list27, NIL, $list150);
            methods.subloop_register_instance_method(WORD_LINKAGE, YIELD, WORD_LINKAGE_YIELD_METHOD);
            methods.methods_incorporate_instance_method(SEARCH, WORD_LINKAGE, $list27, $list153, $list154);
            methods.subloop_register_instance_method(WORD_LINKAGE, SEARCH, WORD_LINKAGE_SEARCH_METHOD);
            define_test_case_table_int($sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_, list(new SubLObject[]{ $TEST, EQ, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list167);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int($sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_, list(new SubLObject[]{ $TEST, EQ, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt168);
        }
        return NIL;
    }

    public static SubLObject setup_word_linkage_file_Previous() {
        classes.subloop_new_class(WORD_LINKAGE_WORD, OBJECT, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(WORD_LINKAGE_WORD, NIL);
        classes.subloop_note_class_initialization_function(WORD_LINKAGE_WORD, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(WORD_LINKAGE_WORD, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_WORD_INSTANCE);
        subloop_reserved_initialize_word_linkage_word_class(WORD_LINKAGE_WORD);
        methods.methods_incorporate_instance_method(PRINT, WORD_LINKAGE_WORD, $list17, $list18, $list19);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, PRINT, WORD_LINKAGE_WORD_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_LINKAGE, WORD_LINKAGE_WORD, $list27, NIL, $list28);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LINKAGE, WORD_LINKAGE_WORD_GET_LINKAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_STRING, WORD_LINKAGE_WORD, $list27, NIL, $list32);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_STRING, WORD_LINKAGE_WORD_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_ABS_INDEX, WORD_LINKAGE_WORD, $list27, NIL, $list36);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_ABS_INDEX, WORD_LINKAGE_WORD_GET_ABS_INDEX_METHOD);
        methods.methods_incorporate_instance_method(GET_POS, WORD_LINKAGE_WORD, $list27, NIL, $list40);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_POS, WORD_LINKAGE_WORD_GET_POS_METHOD);
        methods.methods_incorporate_instance_method(GET_CATEGORY, WORD_LINKAGE_WORD, $list27, NIL, $list44);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_CATEGORY, WORD_LINKAGE_WORD_GET_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method(GET_INDEX, WORD_LINKAGE_WORD, $list27, NIL, $list47);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_INDEX, WORD_LINKAGE_WORD_GET_INDEX_METHOD);
        methods.methods_incorporate_instance_method(GET_LEXES, WORD_LINKAGE_WORD, $list27, NIL, $list51);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LEXES, WORD_LINKAGE_WORD_GET_LEXES_METHOD);
        methods.methods_incorporate_instance_method(GET_LEFT_LINKS, WORD_LINKAGE_WORD, $list17, $list55, $list56);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LEFT_LINKS, WORD_LINKAGE_WORD_GET_LEFT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_RIGHT_LINKS, WORD_LINKAGE_WORD, $list17, $list55, $list61);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_RIGHT_LINKS, WORD_LINKAGE_WORD_GET_RIGHT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_LINKS, WORD_LINKAGE_WORD, $list17, $list55, $list65);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_LINKS, WORD_LINKAGE_WORD_GET_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECTLY_RELATED, WORD_LINKAGE_WORD, $list17, $list68, $list69);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_DIRECTLY_RELATED, WORD_LINKAGE_WORD_GET_DIRECTLY_RELATED_METHOD);
        methods.methods_incorporate_instance_method(GET_RELATED, WORD_LINKAGE_WORD, $list17, $list75, $list76);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, GET_RELATED, WORD_LINKAGE_WORD_GET_RELATED_METHOD);
        methods.methods_incorporate_instance_method(LEXIFY, WORD_LINKAGE_WORD, $list79, $list80, $list81);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, LEXIFY, WORD_LINKAGE_WORD_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method(POS_FILTER_LEXES, WORD_LINKAGE_WORD, $list17, NIL, $list85);
        methods.subloop_register_instance_method(WORD_LINKAGE_WORD, POS_FILTER_LEXES, WORD_LINKAGE_WORD_POS_FILTER_LEXES_METHOD);
        classes.subloop_new_class(WORD_LINKAGE, OBJECT, NIL, NIL, $list93);
        classes.class_set_implements_slot_listeners(WORD_LINKAGE, NIL);
        classes.subloop_note_class_initialization_function(WORD_LINKAGE, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_CLASS);
        classes.subloop_note_instance_initialization_function(WORD_LINKAGE, SUBLOOP_RESERVED_INITIALIZE_WORD_LINKAGE_INSTANCE);
        subloop_reserved_initialize_word_linkage_class(WORD_LINKAGE);
        methods.methods_incorporate_instance_method(PRINT, WORD_LINKAGE, $list27, $list18, $list117);
        methods.subloop_register_instance_method(WORD_LINKAGE, PRINT, WORD_LINKAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(PRINT_DIAGRAM, WORD_LINKAGE, $list27, NIL, $list121);
        methods.subloop_register_instance_method(WORD_LINKAGE, PRINT_DIAGRAM, WORD_LINKAGE_PRINT_DIAGRAM_METHOD);
        methods.methods_incorporate_instance_method(XML, WORD_LINKAGE, $list27, NIL, $list125);
        methods.subloop_register_instance_method(WORD_LINKAGE, XML, WORD_LINKAGE_XML_METHOD);
        methods.methods_incorporate_instance_method(LENGTH, WORD_LINKAGE, $list27, NIL, $list133);
        methods.subloop_register_instance_method(WORD_LINKAGE, LENGTH, WORD_LINKAGE_LENGTH_METHOD);
        methods.methods_incorporate_instance_method(GET_TREE_STRING, WORD_LINKAGE, $list27, NIL, $list137);
        methods.subloop_register_instance_method(WORD_LINKAGE, GET_TREE_STRING, WORD_LINKAGE_GET_TREE_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_WORD, WORD_LINKAGE, $list27, $list141, $list142);
        methods.subloop_register_instance_method(WORD_LINKAGE, GET_WORD, WORD_LINKAGE_GET_WORD_METHOD);
        methods.methods_incorporate_instance_method(LEXIFY, WORD_LINKAGE, $list27, $list80, $list146);
        methods.subloop_register_instance_method(WORD_LINKAGE, LEXIFY, WORD_LINKAGE_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method(YIELD, WORD_LINKAGE, $list27, NIL, $list150);
        methods.subloop_register_instance_method(WORD_LINKAGE, YIELD, WORD_LINKAGE_YIELD_METHOD);
        methods.methods_incorporate_instance_method(SEARCH, WORD_LINKAGE, $list27, $list153, $list154);
        methods.subloop_register_instance_method(WORD_LINKAGE, SEARCH, WORD_LINKAGE_SEARCH_METHOD);
        define_test_case_table_int($sym160$WORD_LINKAGE_WITH_RETOKENIZATION_FAILED_, list(new SubLObject[]{ $TEST, EQ, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list167);
        return NIL;
    }

    static private final SubLList $list_alt91 = list(makeString("LEFT-WALL"), makeString("RIGHT-WALL"));

    static private final SubLList $list_alt93 = list(new SubLObject[]{ list(makeSymbol("LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WORDS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DIAGRAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TREE-STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-DIAGRAM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("XML"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TREE-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-WORD"), list(makeSymbol("I")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY"), list(makeSymbol("LEXICON")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("YIELD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEARCH"), list(makeSymbol("WORD-STRING")), makeKeyword("PUBLIC")) });

    static private final SubLString $str_alt103$word_linkage = makeString("word-linkage");

    static private final SubLString $str_alt104$_a_is_not_a_linkage_xml_string = makeString("~a is not a linkage xml string");

    static private final SubLString $str_alt108$_ = makeString(".");

    static private final SubLList $list_alt109 = list(makeSymbol("&KEY"), list(makeSymbol("OPTIONS"), makeSymbol("*LINK-PARSE-OPTIONS*")), list(makeSymbol("LEXICON"), NIL), list(makeSymbol("USE-STANDARDIZED-WORD-STRINGS?"), T));

    static private final SubLList $list_alt110 = list(makeKeyword("OPTIONS"), makeKeyword("LEXICON"), makeKeyword("USE-STANDARDIZED-WORD-STRINGS?"));

    static private final SubLList $list_alt117 = list(makeString("Prints this word-linkage to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CDOVECTOR"), list(makeSymbol("WORD"), makeSymbol("WORDS")), list(makeSymbol("PRINC"), makeSymbol("WORD"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM"))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt121 = list(makeString("Prints this word-linkage's diagram"), list(makeSymbol("PRINC"), makeSymbol("DIAGRAM")), list(RET, NIL));

    static private final SubLList $list_alt125 = list(makeString("@return stringp; the XML string representation of this linkage"), list(makeSymbol("CLET"), list(makeSymbol("XML"), list(makeSymbol("INDENT"), ZERO_INTEGER)), list(new SubLObject[]{ makeSymbol("CWITH-OUTPUT-TO-STRING"), list(makeSymbol("STREAM"), makeSymbol("XML")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<word-linkage>~%")), list(makeSymbol("TAB"), list(makeSymbol("+"), makeSymbol("INDENT"), THREE_INTEGER), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<words>~%")), list(makeSymbol("DO-LINKAGE-WORDS"), list(makeSymbol("WORD"), makeSymbol("SELF")), list(makeSymbol("WORD-LINKAGE-WORD-XML"), makeSymbol("WORD"), makeSymbol("STREAM"), list(makeSymbol("+"), makeSymbol("INDENT"), SIX_INTEGER))), list(makeSymbol("TAB"), list(makeSymbol("+"), makeSymbol("INDENT"), THREE_INTEGER), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("</words>~%")), list(makeSymbol("LINKS-XML"), list(makeSymbol("GET-WORD-LINKAGE-LINKS"), makeSymbol("SELF")), makeSymbol("STREAM"), list(makeSymbol("+"), makeSymbol("INDENT"), THREE_INTEGER)), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("</word-linkage>~%")) }), list(RET, makeSymbol("XML"))));

    static private final SubLString $str_alt126$_word_linkage___ = makeString("<word-linkage>~%");

    static private final SubLString $str_alt127$_words___ = makeString("<words>~%");

    static private final SubLString $str_alt128$__words___ = makeString("</words>~%");

    @Override
    public void declareFunctions() {
        declare_word_linkage_file();
    }

    static private final SubLString $str_alt129$__word_linkage___ = makeString("</word-linkage>~%");

    @Override
    public void initializeVariables() {
        init_word_linkage_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_word_linkage_file();
    }

    static private final SubLString $str_alt131$_word_cat___a___a__word___ = makeString("<word cat=\"~a\">~a</word>~%");

    static {
    }

    static private final SubLList $list_alt133 = list(makeString("@return integerp; the number of words in this word-linkage"), list(RET, list(makeSymbol("-"), list(makeSymbol("LENGTH"), makeSymbol("WORDS")), TWO_INTEGER)));

    static private final SubLList $list_alt137 = list(makeString("@return stringp; the tree of this word-linkage, as a string"), list(RET, makeSymbol("TREE-STRING")));

    static private final SubLList $list_alt141 = list(makeSymbol("I"));

    static private final SubLList $list_alt142 = list(makeString("@param I non-negative-integer\n   @return word-linkage-word-p; the Ith word of this word-linkage"), list(makeSymbol("CHECK-TYPE"), makeSymbol("I"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("PUNLESS"), list(makeSymbol(">"), makeSymbol("I"), list(makeSymbol("1-"), list(makeSymbol("LENGTH"), makeSymbol("WORDS")))), list(RET, list(makeSymbol("AREF"), makeSymbol("WORDS"), makeSymbol("I")))));

    static private final SubLList $list_alt146 = list(makeString("@param LEXICON semtrans-lexicon-p; the lexicon to lexify with\n   @return word-linkage-p; this word-linkage destructively lexified with \n     lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("LEXICON"), makeSymbol("ABSTRACT-LEXICON-P")), list(makeSymbol("DO-LINKAGE-WORDS"), list(makeSymbol("WORD"), makeSymbol("SELF")), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("LEXIFY")), makeSymbol("LEXICON"))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt150 = list(list(makeSymbol("CLET"), list(makeSymbol("YIELD")), list(makeSymbol("DO-LINKAGE-WORDS"), list(makeSymbol("WORD"), makeSymbol("SELF")), list(makeSymbol("CPUSH"), makeSymbol("WORD"), makeSymbol("YIELD"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("YIELD")))));

    static private final SubLList $list_alt153 = list(makeSymbol("WORD-STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("N"), ONE_INTEGER));

    static private final SubLList $list_alt154 = list(makeString("@return word-linkage-word-p; the Nth word with string WORD-STRING"), list(makeSymbol("CHECK-TYPE"), makeSymbol("WORD-STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("N"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("CLET"), list(list(makeSymbol("COUNTER"), ZERO_INTEGER)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), list(makeSymbol("LENGTH"), makeSymbol("WORDS"))), list(makeSymbol("PWHEN"), list(EQUALP, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-WORD")), makeSymbol("I")), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("WORD-STRING")), list(makeSymbol("CINC"), makeSymbol("COUNTER")), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("COUNTER"), makeSymbol("N")), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-WORD")), makeSymbol("I")))))), list(RET, NIL)));

    static private final SubLList $list_alt158 = list(makeKeyword("CC"), makeKeyword(","));

    static private final SubLString $str_alt159$Failure_causing_word___S_has_link = makeString("Failure-causing word: ~S has links: ~S~%");

    static private final SubLString $$$daves = makeString("daves");

    static private final SubLList $list_alt168 = list(list(list(makeString("You are likely to find a grape in grocery store")), T), list(list(makeString("Canfor Corporation today reported net income of $18.9 million for the first quarter of 2006, or $0.13 per share on a diluted basis.")), NIL), list(list(makeString("The man, the woman and the child slept")), NIL));
}

/**
 * Total time: 664 ms synthetic
 */
