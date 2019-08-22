/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DICTIONARY-UTILITIES
 * source file: /cyc/top/cycl/dictionary-utilities.lisp
 * created:     2019/07/03 17:37:14
 */
public final class dictionary_utilities extends SubLTranslatedFile implements V12 {
    public static final class $synchronized_dictionary_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.dictionary_utilities.$synchronized_dictionary_native.this.$dictionary;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.dictionary_utilities.$synchronized_dictionary_native.this.$lock;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.dictionary_utilities.$synchronized_dictionary_native.this.$dictionary = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.dictionary_utilities.$synchronized_dictionary_native.this.$lock = value;
        }

        public SubLObject $dictionary = Lisp.NIL;

        public SubLObject $lock = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.dictionary_utilities.$synchronized_dictionary_native.class, SYNCHRONIZED_DICTIONARY, SYNCHRONIZED_DICTIONARY_P, $list_alt72, $list_alt73, new String[]{ "$dictionary", "$lock" }, $list_alt74, $list_alt75, PRINT_SYNCHRONIZED_DICTIONARY);
    }

    public static final SubLFile me = new dictionary_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.dictionary_utilities";


    // defparameter
    /**
     * A triple of dictionary, predicate and key that is used by the
     * DICTIONARY-KEYS-SORTED-BY-VALUES infrastructure to help apply the comparison
     * predicate to the values looked up from the dictionary.
     */
    @LispMethod(comment = "A triple of dictionary, predicate and key that is used by the\r\nDICTIONARY-KEYS-SORTED-BY-VALUES infrastructure to help apply the comparison\r\npredicate to the values looked up from the dictionary.\ndefparameter\nA triple of dictionary, predicate and key that is used by the\nDICTIONARY-KEYS-SORTED-BY-VALUES infrastructure to help apply the comparison\npredicate to the values looked up from the dictionary.")
    private static final SubLSymbol $dictionary_keys_sorter_current_sorting_information$ = makeSymbol("*DICTIONARY-KEYS-SORTER-CURRENT-SORTING-INFORMATION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $key_missing$ = makeSymbol("*KEY-MISSING*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_synchronized_dictionary$ = makeSymbol("*DTP-SYNCHRONIZED-DICTIONARY*");

    static private final SubLString $str1$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to push values on a non listp ~a.~%");

    private static final SubLSymbol DICTIONARY_CONTENTS_P = makeSymbol("DICTIONARY-CONTENTS-P");

    static private final SubLString $str3$Corrupted_dictionary_contents__at = makeString("Corrupted dictionary-contents; attempting to push values on a non listp ~a.~%");

    static private final SubLString $str4$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to pop a value from a non listp ~a.~%");

    static private final SubLSymbol $sym5$STRING__ = makeSymbol("STRING<=");

    static private final SubLString $str7$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to add values on a non-listp ~a.~%");

    static private final SubLString $str9$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to append to a non listp ~a.~%");

    static private final SubLString $str10$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to union with a non listp ~a.~%");

    static private final SubLString $str11$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to remove values from a non listp ~a.~%");

    static private final SubLString $str12$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to delete values from a non listp ~a.~%");

    private static final SubLSymbol NON_EMPTY_DICTIONARY_P = makeSymbol("NON-EMPTY-DICTIONARY-P");

    static private final SubLList $list17 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLList $list18 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("DICT-EXPRESSION"), makeSymbol("COLLECTION-VAR")), makeSymbol("ITERATED-EXPRESSION"));

    static private final SubLSymbol $sym19$DICT_EXPRESSION_VAR = makeUninternedSymbol("DICT-EXPRESSION-VAR");

    static private final SubLList $list22 = list(NIL);

    static private final SubLList $list29 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("NUMVAR"), makeSymbol("DICTIONARY"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list30 = list(ZERO_INTEGER);

    static private final SubLString $str33$_S_____S__ = makeString("~S -> ~S~%");

    static private final SubLString $str34$_S____ = makeString("~S -> ");

    static private final SubLString $str35$_S__ = makeString("~S~%");

    static private final SubLString $str37$_csv = makeString(".csv");

    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");

    static private final SubLString $str42$_A___A__ = makeString("~A, ~A~%");

    static private final SubLString $str43$_S___S__ = makeString("~S, ~S~%");

    private static final SubLString $str44$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str45$_ = makeString("\"");

    private static final SubLSymbol DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE = makeSymbol("DICTIONARY-KEYS-SORTER-COMPARISON-PREDICATE");

    private static final SubLList $list47 = list(makeSymbol("DICTIONARY"), makeSymbol("PREDICATE"), makeSymbol("KEY"));

    private static final SubLString $str48$For_key__A__the_computed_new_valu = makeString("For key ~A, the computed new value ~A does not ~A the  expected new value ~A.");

    private static final SubLSymbol $sym50$_ = makeSymbol(">");

    private static final SubLList $list51 = list(list(makeSymbol("KEY"), makeSymbol("DICTIONARY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list52 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym55$VALUE = makeUninternedSymbol("VALUE");

    static private final SubLList $list56 = list(list(makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym57$KEY = makeUninternedSymbol("KEY");

    private static final SubLList $list58 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLString $str59$KEY_MISSING = makeString("KEY-MISSING");

    private static final SubLString $str60$Overwriting__s_from__s_to__s = makeString("Overwriting ~s from ~s to ~s");

    private static final SubLSymbol $sub_dictionary_not_found$ = makeSymbol("*SUB-DICTIONARY-NOT-FOUND*");

    private static final SubLSymbol SYNCHRONIZED_DICTIONARY = makeSymbol("SYNCHRONIZED-DICTIONARY");

    private static final SubLSymbol SYNCHRONIZED_DICTIONARY_P = makeSymbol("SYNCHRONIZED-DICTIONARY-P");

    private static final SubLList $list64 = list(makeSymbol("DICTIONARY"), makeSymbol("LOCK"));

    static private final SubLList $list65 = list(makeKeyword("DICTIONARY"), $LOCK);

    private static final SubLList $list66 = list(makeSymbol("SYNCHRONIZED-DICTIONARY-DICTIONARY"), makeSymbol("SYNCHRONIZED-DICTIONARY-LOCK"));

    static private final SubLList $list67 = list(makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-DICTIONARY"), makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-LOCK"));

    private static final SubLSymbol PRINT_SYNCHRONIZED_DICTIONARY = makeSymbol("PRINT-SYNCHRONIZED-DICTIONARY");

    private static final SubLSymbol SYNCHRONIZED_DICTIONARY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SYNCHRONIZED-DICTIONARY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list70 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SYNCHRONIZED-DICTIONARY-P"));

    private static final SubLSymbol SYNCHRONIZED_DICTIONARY_DICTIONARY = makeSymbol("SYNCHRONIZED-DICTIONARY-DICTIONARY");

    private static final SubLSymbol _CSETF_SYNCHRONIZED_DICTIONARY_DICTIONARY = makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-DICTIONARY");

    private static final SubLSymbol SYNCHRONIZED_DICTIONARY_LOCK = makeSymbol("SYNCHRONIZED-DICTIONARY-LOCK");

    private static final SubLSymbol _CSETF_SYNCHRONIZED_DICTIONARY_LOCK = makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-LOCK");

    private static final SubLString $str77$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SYNCHRONIZED_DICTIONARY = makeSymbol("MAKE-SYNCHRONIZED-DICTIONARY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLString $$$Synchronized_Dictionary_Lock = makeString("Synchronized Dictionary Lock");

    private static final SubLString $str84$DICTIONARY___A___LOCK___A__ = makeString("DICTIONARY: ~A ~%LOCK: ~A~%");

    private static final SubLSymbol $sym85$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol IS_MAP_OBJECT_P_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("IS-MAP-OBJECT-P-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_SIZE_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-SIZE-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_TEST_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-TEST-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_PUT_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-PUT-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_PUT_UNLESS_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-PUT-UNLESS-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-GET-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_WITHOUT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-REMOVE-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol $sym95$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SYNCHRONIZED_DICTIONARY_METHO = makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_ARBITRARY_KEY_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-ARBITRARY-KEY-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_ITERATOR_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("NEW-MAP-OBJECT-ITERATOR-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_ALL_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-REMOVE-ALL-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_KEYS_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-KEYS-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLSymbol MAP_OBJECT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD = makeSymbol("MAP-OBJECT-VALUES-SYNCHRONIZED-DICTIONARY-METHOD");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLInteger $int$3000000 = makeInteger(3000000);

    private static final SubLString $str103$Testing_size__A_ALIST__A_HASHTABL = makeString("Testing size=~A ALIST=~A HASHTABLE=~A~%");

    private static final SubLSymbol TEST_DICTIONARY_KEYS_SORTED_BY_VALUES = makeSymbol("TEST-DICTIONARY-KEYS-SORTED-BY-VALUES");

    private static final SubLList $list111 = list(list(list(list(cons(makeString("eins"), ONE_INTEGER), cons(makeString("zwei"), TWO_INTEGER), cons(makeString("drei"), THREE_INTEGER), cons(makeString("vier"), FOUR_INTEGER), cons(makeString("fuenf"), FIVE_INTEGER), cons(makeString("sechs"), SIX_INTEGER)), makeSymbol("<")), list(makeString("eins"), makeString("zwei"), makeString("drei"), makeString("vier"), makeString("fuenf"), makeString("sechs"))), list(list(list(cons(makeString("one"), ONE_INTEGER), cons(makeString("two"), TWO_INTEGER), cons(makeString("three"), THREE_INTEGER), cons(makeString("four"), FOUR_INTEGER), cons(makeString("five"), FIVE_INTEGER), cons(makeString("six"), SIX_INTEGER)), makeSymbol(">")), list(makeString("six"), makeString("five"), makeString("four"), makeString("three"), makeString("two"), makeString("one"))), list(list(list(list(makeString("un"), ONE_INTEGER), list(makeString("deux"), TWO_INTEGER), list(makeString("trois"), THREE_INTEGER), list(makeString("quatre"), FOUR_INTEGER), list(makeString("cinq"), FIVE_INTEGER), list(makeString("seize"), SIX_INTEGER)), makeSymbol(">"), makeSymbol("FIRST")), list(makeString("seize"), makeString("cinq"), makeString("quatre"), makeString("trois"), makeString("deux"), makeString("un"))));

    private static final SubLSymbol TEST_MAP_DICTIONARY_VALUES = makeSymbol("TEST-MAP-DICTIONARY-VALUES");

    private static final SubLList $list113 = list(list(list(list(cons(makeString("eins"), ONE_INTEGER), cons(makeString("zwei"), TWO_INTEGER), cons(makeString("drei"), THREE_INTEGER), cons(makeString("vier"), FOUR_INTEGER), cons(makeString("fuenf"), FIVE_INTEGER), cons(makeString("sechs"), SIX_INTEGER)), makeSymbol("SQUARE"), makeSymbol("=")), makeKeyword("SUCCESS")), list(list(list(cons(makeString("one"), ONE_INTEGER), cons(makeString("two"), TWO_INTEGER), cons(makeString("three"), THREE_INTEGER), cons(makeString("four"), FOUR_INTEGER), cons(makeString("five"), FIVE_INTEGER), cons(makeString("six"), SIX_INTEGER)), makeSymbol("SQRT"), makeSymbol("=")), makeKeyword("SUCCESS")));

    private static final SubLSymbol TEST_DICTIONARY_KEY_CONFLATION = makeSymbol("TEST-DICTIONARY-KEY-CONFLATION");

    private static final SubLList $list115 = list(list(list(EQUALP, list(makeString("Sea"), makeString("sea"))), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[]{ makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("Sea"), makeString("sea") })), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[]{ makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("sea"), makeString("central") })), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[]{ makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("sea") })), makeKeyword("SUCCESS")));

    private static final SubLString $str117$Expected__A_entries__but_got__A_ = makeString("Expected ~A entries, but got ~A.");

    // Definitions
    /**
     * Returns an arbitrary key from DICTIONARY.
     */
    @LispMethod(comment = "Returns an arbitrary key from DICTIONARY.")
    public static final SubLObject dictionary_arbitrary_key_alt(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject found = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (!((NIL != found) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result = key;
                        found = T;
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return values(result, found);
            }
        }
    }

    // Definitions
    /**
     * Returns an arbitrary key from DICTIONARY.
     */
    @LispMethod(comment = "Returns an arbitrary key from DICTIONARY.")
    public static SubLObject dictionary_arbitrary_key(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject found;
        SubLObject iteration_state;
        for (found = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); (NIL == found) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); found = T , iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = key;
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return values(result, found);
    }

    /**
     * Return a dictionary just like DICTIONARY
     *
     * @return dictionary
     */
    @LispMethod(comment = "Return a dictionary just like DICTIONARY\r\n\r\n@return dictionary")
    public static final SubLObject copy_dictionary_alt(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
            {
                SubLObject test = dictionary.dictionary_test(v_dictionary);
                SubLObject size = dictionary.dictionary_length(v_dictionary);
                SubLObject new_dictionary = dictionary.new_dictionary(test, size);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject val = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        dictionary.dictionary_enter(new_dictionary, key, val);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return new_dictionary;
            }
        }
    }

    /**
     * Return a dictionary just like DICTIONARY
     *
     * @return dictionary
     */
    @LispMethod(comment = "Return a dictionary just like DICTIONARY\r\n\r\n@return dictionary")
    public static SubLObject copy_dictionary(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        final SubLObject test = dictionary.dictionary_test(v_dictionary);
        final SubLObject size = dictionary.dictionary_length(v_dictionary);
        final SubLObject new_dictionary = dictionary.new_dictionary(test, size);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject val = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_enter(new_dictionary, key, val);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_dictionary;
    }

    public static SubLObject copy_dictionary_recursive(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        final SubLObject test = dictionary.dictionary_test(v_dictionary);
        final SubLObject size = dictionary.dictionary_length(v_dictionary);
        final SubLObject new_dictionary = dictionary.new_dictionary(test, size);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject val = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != dictionary.dictionary_p(val)) {
                dictionary.dictionary_enter(new_dictionary, key, copy_dictionary_recursive(val));
            } else {
                dictionary.dictionary_enter(new_dictionary, key, val);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_dictionary;
    }

    /**
     * Returns the value associated with KEY in DICTIONARY, and removes that key and value from DICTIONARY
     */
    @LispMethod(comment = "Returns the value associated with KEY in DICTIONARY, and removes that key and value from DICTIONARY")
    public static final SubLObject dictionary_pop_alt(SubLObject v_dictionary, SubLObject key) {
        {
            SubLObject result = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            dictionary.dictionary_remove(v_dictionary, key);
            return result;
        }
    }

    /**
     * Returns the value associated with KEY in DICTIONARY, and removes that key and value from DICTIONARY
     */
    @LispMethod(comment = "Returns the value associated with KEY in DICTIONARY, and removes that key and value from DICTIONARY")
    public static SubLObject dictionary_pop(final SubLObject v_dictionary, final SubLObject key) {
        final SubLObject result = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        dictionary.dictionary_remove(v_dictionary, key);
        return result;
    }

    /**
     * Push VALUE onto the current value at KEY in DICTIONARY. Ensures that the
     * current value at KEY is a listp.  If the number of
     * entries would exceed the limit, revamp the dictionary
     * to the next better representation.
     *
     * @return key
     */
    @LispMethod(comment = "Push VALUE onto the current value at KEY in DICTIONARY. Ensures that the\r\ncurrent value at KEY is a listp.  If the number of\r\nentries would exceed the limit, revamp the dictionary\r\nto the next better representation.\r\n\r\n@return key\nPush VALUE onto the current value at KEY in DICTIONARY. Ensures that the\ncurrent value at KEY is a listp.  If the number of\nentries would exceed the limit, revamp the dictionary\nto the next better representation.")
    public static final SubLObject dictionary_push_alt(SubLObject v_dictionary, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        {
            SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            if (current_val.isList()) {
                current_val = cons(value, current_val);
                return dictionary.dictionary_enter(v_dictionary, key, current_val);
            } else {
                Errors.error($str_alt1$Corrupted_dictionary__attempting_, current_val);
            }
        }
        return NIL;
    }

    /**
     * Push VALUE onto the current value at KEY in DICTIONARY. Ensures that the
     * current value at KEY is a listp.  If the number of
     * entries would exceed the limit, revamp the dictionary
     * to the next better representation.
     *
     * @return key
     */
    @LispMethod(comment = "Push VALUE onto the current value at KEY in DICTIONARY. Ensures that the\r\ncurrent value at KEY is a listp.  If the number of\r\nentries would exceed the limit, revamp the dictionary\r\nto the next better representation.\r\n\r\n@return key\nPush VALUE onto the current value at KEY in DICTIONARY. Ensures that the\ncurrent value at KEY is a listp.  If the number of\nentries would exceed the limit, revamp the dictionary\nto the next better representation.")
    public static SubLObject dictionary_push(final SubLObject v_dictionary, final SubLObject key, final SubLObject value) {
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        if (current_val.isList()) {
            current_val = cons(value, current_val);
            return dictionary.dictionary_enter(v_dictionary, key, current_val);
        }
        Errors.error($str1$Corrupted_dictionary__attempting_, current_val);
        return NIL;
    }

    /**
     * Push VALUE onto the current value at KEY in DICTIONARY-CONTENTS. Ensures that the
     * current value at KEY is a listp.  If the number of
     * entries would exceed the limit, revamp the dictionary
     * to the next better representation.
     */
    @LispMethod(comment = "Push VALUE onto the current value at KEY in DICTIONARY-CONTENTS. Ensures that the\r\ncurrent value at KEY is a listp.  If the number of\r\nentries would exceed the limit, revamp the dictionary\r\nto the next better representation.\nPush VALUE onto the current value at KEY in DICTIONARY-CONTENTS. Ensures that the\ncurrent value at KEY is a listp.  If the number of\nentries would exceed the limit, revamp the dictionary\nto the next better representation.")
    public static final SubLObject dictionary_contents_push_alt(SubLObject v_dictionary_contents, SubLObject key, SubLObject value, SubLObject test) {
        SubLTrampolineFile.checkType(v_dictionary_contents, DICTIONARY_CONTENTS_P);
        {
            SubLObject current_val = dictionary_contents.dictionary_contents_lookup_without_values(v_dictionary_contents, key, test, UNPROVIDED);
            if (current_val.isList()) {
                current_val = cons(value, current_val);
                return dictionary_contents.dictionary_contents_enter(v_dictionary_contents, key, current_val, test);
            } else {
                Errors.error($str_alt3$Corrupted_dictionary_contents__at, current_val);
            }
        }
        return NIL;
    }

    /**
     * Push VALUE onto the current value at KEY in DICTIONARY-CONTENTS. Ensures that the
     * current value at KEY is a listp.  If the number of
     * entries would exceed the limit, revamp the dictionary
     * to the next better representation.
     */
    @LispMethod(comment = "Push VALUE onto the current value at KEY in DICTIONARY-CONTENTS. Ensures that the\r\ncurrent value at KEY is a listp.  If the number of\r\nentries would exceed the limit, revamp the dictionary\r\nto the next better representation.\nPush VALUE onto the current value at KEY in DICTIONARY-CONTENTS. Ensures that the\ncurrent value at KEY is a listp.  If the number of\nentries would exceed the limit, revamp the dictionary\nto the next better representation.")
    public static SubLObject dictionary_contents_push(final SubLObject v_dictionary_contents, final SubLObject key, final SubLObject value, final SubLObject test) {
        assert NIL != dictionary_contents.dictionary_contents_p(v_dictionary_contents) : "! dictionary_contents.dictionary_contents_p(v_dictionary_contents) " + ("dictionary_contents.dictionary_contents_p(v_dictionary_contents) " + "CommonSymbols.NIL != dictionary_contents.dictionary_contents_p(v_dictionary_contents) ") + v_dictionary_contents;
        SubLObject current_val = dictionary_contents.dictionary_contents_lookup_without_values(v_dictionary_contents, key, test, UNPROVIDED);
        if (current_val.isList()) {
            current_val = cons(value, current_val);
            return dictionary_contents.dictionary_contents_enter(v_dictionary_contents, key, current_val, test);
        }
        Errors.error($str3$Corrupted_dictionary_contents__at, current_val);
        return NIL;
    }

    /**
     * Removes and returns the first element from current value at KEY in DICTIONARY.
     * Ensures that the current value is a listp. If this removes the last element from current value,
     * then perform a @xref dictionary-remove.
     */
    @LispMethod(comment = "Removes and returns the first element from current value at KEY in DICTIONARY.\r\nEnsures that the current value is a listp. If this removes the last element from current value,\r\nthen perform a @xref dictionary-remove.\nRemoves and returns the first element from current value at KEY in DICTIONARY.\nEnsures that the current value is a listp. If this removes the last element from current value,\nthen perform a @xref dictionary-remove.")
    public static final SubLObject dictionary_pop_from_value_alt(SubLObject v_dictionary, SubLObject key) {
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        {
            SubLObject result = NIL;
            SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            if (current_val.isCons()) {
                result = current_val.first();
                {
                    SubLObject new_val = current_val.rest();
                    if (NIL == new_val) {
                        dictionary.dictionary_remove(v_dictionary, key);
                    } else {
                        if (new_val != current_val) {
                            dictionary.dictionary_enter(v_dictionary, key, new_val);
                        }
                    }
                }
            } else {
                if (NIL == current_val) {
                    result = NIL;
                } else {
                    Errors.error($str_alt4$Corrupted_dictionary__attempting_, current_val);
                }
            }
            return result;
        }
    }

    /**
     * Removes and returns the first element from current value at KEY in DICTIONARY.
     * Ensures that the current value is a listp. If this removes the last element from current value,
     * then perform a @xref dictionary-remove.
     */
    @LispMethod(comment = "Removes and returns the first element from current value at KEY in DICTIONARY.\r\nEnsures that the current value is a listp. If this removes the last element from current value,\r\nthen perform a @xref dictionary-remove.\nRemoves and returns the first element from current value at KEY in DICTIONARY.\nEnsures that the current value is a listp. If this removes the last element from current value,\nthen perform a @xref dictionary-remove.")
    public static SubLObject dictionary_pop_from_value(final SubLObject v_dictionary, final SubLObject key) {
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        SubLObject result = NIL;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        if (current_val.isCons()) {
            result = current_val.first();
            final SubLObject new_val = current_val.rest();
            if (NIL == new_val) {
                dictionary.dictionary_remove(v_dictionary, key);
            } else
                if (!new_val.eql(current_val)) {
                    dictionary.dictionary_enter(v_dictionary, key, new_val);
                }

        } else
            if (NIL == current_val) {
                result = NIL;
            } else {
                Errors.error($str4$Corrupted_dictionary__attempting_, current_val);
            }

        return result;
    }

    /**
     * Push VALUE onto the current value at KEY in DICTIONARY. Ensures that the
     * current value at KEY is a listp and that VALUE is not yet a member of
     * the list.  If the number of entries would exceed the limit, revamp
     * the dictionary to the next better representation.  TEST is a predicate
     * that tests elements for equality and KEY-ACCESSOR is a function
     * that represents the key field of the element.
     *
     * @return key
     * @unknown sdevoy
     */
    @LispMethod(comment = "Push VALUE onto the current value at KEY in DICTIONARY. Ensures that the\r\ncurrent value at KEY is a listp and that VALUE is not yet a member of\r\nthe list.  If the number of entries would exceed the limit, revamp\r\nthe dictionary to the next better representation.  TEST is a predicate\r\nthat tests elements for equality and KEY-ACCESSOR is a function\r\nthat represents the key field of the element.\r\n\r\n@return key\r\n@unknown sdevoy\nPush VALUE onto the current value at KEY in DICTIONARY. Ensures that the\ncurrent value at KEY is a listp and that VALUE is not yet a member of\nthe list.  If the number of entries would exceed the limit, revamp\nthe dictionary to the next better representation.  TEST is a predicate\nthat tests elements for equality and KEY-ACCESSOR is a function\nthat represents the key field of the element.")
    public static final SubLObject dictionary_pushnew_alt(SubLObject v_dictionary, SubLObject key, SubLObject value, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        {
            SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            if (current_val.isList()) {
                {
                    SubLObject item_var = value;
                    if (NIL == member(item_var, current_val, test, key_accessor)) {
                        current_val = cons(item_var, current_val);
                    }
                    return dictionary.dictionary_enter(v_dictionary, key, current_val);
                }
            } else {
                Errors.error($str_alt1$Corrupted_dictionary__attempting_, current_val);
            }
        }
        return NIL;
    }

    /**
     * Push VALUE onto the current value at KEY in DICTIONARY. Ensures that the
     * current value at KEY is a listp and that VALUE is not yet a member of
     * the list.  If the number of entries would exceed the limit, revamp
     * the dictionary to the next better representation.  TEST is a predicate
     * that tests elements for equality and KEY-ACCESSOR is a function
     * that represents the key field of the element.
     *
     * @return key
     * @unknown sdevoy
     */
    @LispMethod(comment = "Push VALUE onto the current value at KEY in DICTIONARY. Ensures that the\r\ncurrent value at KEY is a listp and that VALUE is not yet a member of\r\nthe list.  If the number of entries would exceed the limit, revamp\r\nthe dictionary to the next better representation.  TEST is a predicate\r\nthat tests elements for equality and KEY-ACCESSOR is a function\r\nthat represents the key field of the element.\r\n\r\n@return key\r\n@unknown sdevoy\nPush VALUE onto the current value at KEY in DICTIONARY. Ensures that the\ncurrent value at KEY is a listp and that VALUE is not yet a member of\nthe list.  If the number of entries would exceed the limit, revamp\nthe dictionary to the next better representation.  TEST is a predicate\nthat tests elements for equality and KEY-ACCESSOR is a function\nthat represents the key field of the element.")
    public static SubLObject dictionary_pushnew(final SubLObject v_dictionary, final SubLObject key, final SubLObject value, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        if (current_val.isList()) {
            if (NIL == member(value, current_val, test, key_accessor)) {
                current_val = cons(value, current_val);
            }
            return dictionary.dictionary_enter(v_dictionary, key, current_val);
        }
        Errors.error($str1$Corrupted_dictionary__attempting_, current_val);
        return NIL;
    }

    /**
     * Adds ITEM in the current value at KEY in DICTIONARY in a way that preserves its ``sortedness''
     * according to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.
     * If the number of entries would exceed the limit, revamp the dictionary  to the next better representation.
     *
     * @return key
     */
    @LispMethod(comment = "Adds ITEM in the current value at KEY in DICTIONARY in a way that preserves its ``sortedness\'\'\r\naccording to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.\r\nIf the number of entries would exceed the limit, revamp the dictionary  to the next better representation.\r\n\r\n@return key\nAdds ITEM in the current value at KEY in DICTIONARY in a way that preserves its ``sortedness\'\'\naccording to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.\nIf the number of entries would exceed the limit, revamp the dictionary  to the next better representation.")
    public static final SubLObject dictionary_add_to_value_sorted_alt(SubLObject v_dictionary, SubLObject key, SubLObject item, SubLObject predicate, SubLObject key_accessor) {
        if (predicate == UNPROVIDED) {
            predicate = $sym5$STRING__;
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(SYMBOL_NAME);
        }
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        {
            SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            if (current_val.isList()) {
                current_val = list_utilities.sorted_add_to_list(item, current_val, predicate, key_accessor);
                return dictionary.dictionary_enter(v_dictionary, key, current_val);
            } else {
                Errors.error($str_alt7$Corrupted_dictionary__attempting_, current_val);
            }
        }
        return NIL;
    }

    /**
     * Adds ITEM in the current value at KEY in DICTIONARY in a way that preserves its ``sortedness''
     * according to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.
     * If the number of entries would exceed the limit, revamp the dictionary  to the next better representation.
     *
     * @return key
     */
    @LispMethod(comment = "Adds ITEM in the current value at KEY in DICTIONARY in a way that preserves its ``sortedness\'\'\r\naccording to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.\r\nIf the number of entries would exceed the limit, revamp the dictionary  to the next better representation.\r\n\r\n@return key\nAdds ITEM in the current value at KEY in DICTIONARY in a way that preserves its ``sortedness\'\'\naccording to PREDICATE and KEY-ACCESSOR. Ensures that the current value at KEY is a listp.\nIf the number of entries would exceed the limit, revamp the dictionary  to the next better representation.")
    public static SubLObject dictionary_add_to_value_sorted(final SubLObject v_dictionary, final SubLObject key, final SubLObject item, SubLObject predicate, SubLObject key_accessor) {
        if (predicate == UNPROVIDED) {
            predicate = $sym5$STRING__;
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(SYMBOL_NAME);
        }
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        if (current_val.isList()) {
            current_val = list_utilities.sorted_add_to_list(item, current_val, predicate, key_accessor);
            return dictionary.dictionary_enter(v_dictionary, key, current_val);
        }
        Errors.error($str7$Corrupted_dictionary__attempting_, current_val);
        return NIL;
    }

    /**
     * Appends LIST to the current value at KEY in DICTIONARY.  Errors if the current value is a non-listp.
     *
     * @return key
     */
    @LispMethod(comment = "Appends LIST to the current value at KEY in DICTIONARY.  Errors if the current value is a non-listp.\r\n\r\n@return key")
    public static final SubLObject dictionary_append_alt(SubLObject v_dictionary, SubLObject key, SubLObject list) {
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        SubLTrampolineFile.checkType(list, LISTP);
        {
            SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            if (current_val.isList()) {
                {
                    SubLObject new_val = append(current_val, list);
                    return dictionary.dictionary_enter(v_dictionary, key, new_val);
                }
            } else {
                Errors.error($str_alt9$Corrupted_dictionary__attempting_, current_val);
            }
        }
        return NIL;
    }

    /**
     * Appends LIST to the current value at KEY in DICTIONARY.  Errors if the current value is a non-listp.
     *
     * @return key
     */
    @LispMethod(comment = "Appends LIST to the current value at KEY in DICTIONARY.  Errors if the current value is a non-listp.\r\n\r\n@return key")
    public static SubLObject dictionary_append(final SubLObject v_dictionary, final SubLObject key, final SubLObject list) {
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        assert NIL != listp(list) : "! listp(list) " + ("Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) ") + list;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        if (current_val.isList()) {
            final SubLObject new_val = append(current_val, list);
            return dictionary.dictionary_enter(v_dictionary, key, new_val);
        }
        Errors.error($str9$Corrupted_dictionary__attempting_, current_val);
        return NIL;
    }

    /**
     * Union LIST with the current value at KEY in DICTIONARY.  Errors if the current value is a non-listp.
     *
     * @return key
     */
    @LispMethod(comment = "Union LIST with the current value at KEY in DICTIONARY.  Errors if the current value is a non-listp.\r\n\r\n@return key")
    public static final SubLObject dictionary_union_alt(SubLObject v_dictionary, SubLObject key, SubLObject list, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        SubLTrampolineFile.checkType(list, LISTP);
        {
            SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            if (current_val.isList()) {
                {
                    SubLObject new_val = union(current_val, list, test, key_accessor);
                    return dictionary.dictionary_enter(v_dictionary, key, new_val);
                }
            } else {
                Errors.error($str_alt10$Corrupted_dictionary__attempting_, current_val);
            }
        }
        return NIL;
    }

    /**
     * Union LIST with the current value at KEY in DICTIONARY.  Errors if the current value is a non-listp.
     *
     * @return key
     */
    @LispMethod(comment = "Union LIST with the current value at KEY in DICTIONARY.  Errors if the current value is a non-listp.\r\n\r\n@return key")
    public static SubLObject dictionary_union(final SubLObject v_dictionary, final SubLObject key, final SubLObject list, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        assert NIL != listp(list) : "! listp(list) " + ("Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) ") + list;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        if (current_val.isList()) {
            final SubLObject new_val = union(current_val, list, test, key_accessor);
            return dictionary.dictionary_enter(v_dictionary, key, new_val);
        }
        Errors.error($str10$Corrupted_dictionary__attempting_, current_val);
        return NIL;
    }

    /**
     * Assumes that the values of DICTIONARY are property lists (plists).
     * Looks up KEY in DICTIONARY to get the plist, then gets the property indicated
     * by INDICATOR from that plist.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Assumes that the values of DICTIONARY are property lists (plists).\r\nLooks up KEY in DICTIONARY to get the plist, then gets the property indicated\r\nby INDICATOR from that plist.\r\n\r\n@unknown pace\nAssumes that the values of DICTIONARY are property lists (plists).\nLooks up KEY in DICTIONARY to get the plist, then gets the property indicated\nby INDICATOR from that plist.")
    public static final SubLObject dictionary_getf_alt(SubLObject v_dictionary, SubLObject key, SubLObject indicator, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject plist = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            SubLTrampolineFile.checkType(plist, LISTP);
            return getf(plist, indicator, v_default);
        }
    }

    /**
     * Assumes that the values of DICTIONARY are property lists (plists).
     * Looks up KEY in DICTIONARY to get the plist, then gets the property indicated
     * by INDICATOR from that plist.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Assumes that the values of DICTIONARY are property lists (plists).\r\nLooks up KEY in DICTIONARY to get the plist, then gets the property indicated\r\nby INDICATOR from that plist.\r\n\r\n@unknown pace\nAssumes that the values of DICTIONARY are property lists (plists).\nLooks up KEY in DICTIONARY to get the plist, then gets the property indicated\nby INDICATOR from that plist.")
    public static SubLObject dictionary_getf(final SubLObject v_dictionary, final SubLObject key, final SubLObject indicator, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject plist = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        assert NIL != listp(plist) : "! listp(plist) " + ("Types.listp(plist) " + "CommonSymbols.NIL != Types.listp(plist) ") + plist;
        return getf(plist, indicator, v_default);
    }

    /**
     * Assumes that the values of DICTIONARY are property lists (plists).
     * Looks up KEY in DICTIONARY to get the plist, then sets the property indicated
     * by INDICATOR on that plist to the value VALUE.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Assumes that the values of DICTIONARY are property lists (plists).\r\nLooks up KEY in DICTIONARY to get the plist, then sets the property indicated\r\nby INDICATOR on that plist to the value VALUE.\r\n\r\n@unknown pace\nAssumes that the values of DICTIONARY are property lists (plists).\nLooks up KEY in DICTIONARY to get the plist, then sets the property indicated\nby INDICATOR on that plist to the value VALUE.")
    public static final SubLObject dictionary_putf_alt(SubLObject v_dictionary, SubLObject key, SubLObject indicator, SubLObject value) {
        {
            SubLObject plist = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            SubLTrampolineFile.checkType(plist, LISTP);
            return dictionary.dictionary_enter(v_dictionary, key, putf(plist, indicator, value));
        }
    }

    /**
     * Assumes that the values of DICTIONARY are property lists (plists).
     * Looks up KEY in DICTIONARY to get the plist, then sets the property indicated
     * by INDICATOR on that plist to the value VALUE.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Assumes that the values of DICTIONARY are property lists (plists).\r\nLooks up KEY in DICTIONARY to get the plist, then sets the property indicated\r\nby INDICATOR on that plist to the value VALUE.\r\n\r\n@unknown pace\nAssumes that the values of DICTIONARY are property lists (plists).\nLooks up KEY in DICTIONARY to get the plist, then sets the property indicated\nby INDICATOR on that plist to the value VALUE.")
    public static SubLObject dictionary_putf(final SubLObject v_dictionary, final SubLObject key, final SubLObject indicator, final SubLObject value) {
        final SubLObject plist = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        assert NIL != listp(plist) : "! listp(plist) " + ("Types.listp(plist) " + "CommonSymbols.NIL != Types.listp(plist) ") + plist;
        return dictionary.dictionary_enter(v_dictionary, key, putf(plist, indicator, value));
    }

    /**
     * Removes ELT from current value at KEY in DICTIONARY. Ensures that the current
     * value is a listp. If this removes the last element from current value,
     * then perform an @see dictionary-remove. TEST is a predicate
     * that tests elements for equality and KEY-ACCESSOR is a function
     * that represents the key field of the element.
     */
    @LispMethod(comment = "Removes ELT from current value at KEY in DICTIONARY. Ensures that the current\r\nvalue is a listp. If this removes the last element from current value,\r\nthen perform an @see dictionary-remove. TEST is a predicate\r\nthat tests elements for equality and KEY-ACCESSOR is a function\r\nthat represents the key field of the element.\nRemoves ELT from current value at KEY in DICTIONARY. Ensures that the current\nvalue is a listp. If this removes the last element from current value,\nthen perform an @see dictionary-remove. TEST is a predicate\nthat tests elements for equality and KEY-ACCESSOR is a function\nthat represents the key field of the element.")
    public static final SubLObject dictionary_remove_from_value_alt(SubLObject v_dictionary, SubLObject key, SubLObject elt, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        {
            SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            if (current_val.isList()) {
                {
                    SubLObject new_val = remove(elt, current_val, test, key_accessor, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == new_val) {
                        dictionary.dictionary_remove(v_dictionary, key);
                    } else {
                        dictionary.dictionary_enter(v_dictionary, key, new_val);
                    }
                }
            } else {
                Errors.error($str_alt11$Corrupted_dictionary__attempting_, current_val);
            }
        }
        return NIL;
    }

    /**
     * Removes ELT from current value at KEY in DICTIONARY. Ensures that the current
     * value is a listp. If this removes the last element from current value,
     * then perform an @see dictionary-remove. TEST is a predicate
     * that tests elements for equality and KEY-ACCESSOR is a function
     * that represents the key field of the element.
     */
    @LispMethod(comment = "Removes ELT from current value at KEY in DICTIONARY. Ensures that the current\r\nvalue is a listp. If this removes the last element from current value,\r\nthen perform an @see dictionary-remove. TEST is a predicate\r\nthat tests elements for equality and KEY-ACCESSOR is a function\r\nthat represents the key field of the element.\nRemoves ELT from current value at KEY in DICTIONARY. Ensures that the current\nvalue is a listp. If this removes the last element from current value,\nthen perform an @see dictionary-remove. TEST is a predicate\nthat tests elements for equality and KEY-ACCESSOR is a function\nthat represents the key field of the element.")
    public static SubLObject dictionary_remove_from_value(final SubLObject v_dictionary, final SubLObject key, final SubLObject elt, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        if (current_val.isList()) {
            final SubLObject new_val = remove(elt, current_val, test, key_accessor, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == new_val) {
                dictionary.dictionary_remove(v_dictionary, key);
            } else {
                dictionary.dictionary_enter(v_dictionary, key, new_val);
            }
        } else {
            Errors.error($str11$Corrupted_dictionary__attempting_, current_val);
        }
        return NIL;
    }

    /**
     * Deletes ELT from current value at KEY in DICTIONARY. Ensures that the current
     * value is a listp. If this deletes the last element from current value,
     * then perform an @see dictionary-remove.
     */
    @LispMethod(comment = "Deletes ELT from current value at KEY in DICTIONARY. Ensures that the current\r\nvalue is a listp. If this deletes the last element from current value,\r\nthen perform an @see dictionary-remove.\nDeletes ELT from current value at KEY in DICTIONARY. Ensures that the current\nvalue is a listp. If this deletes the last element from current value,\nthen perform an @see dictionary-remove.")
    public static final SubLObject dictionary_delete_from_value_alt(SubLObject v_dictionary, SubLObject key, SubLObject elt, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        {
            SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            if (current_val.isList()) {
                {
                    SubLObject new_val = delete(elt, current_val, test, key_accessor, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == new_val) {
                        dictionary.dictionary_remove(v_dictionary, key);
                    } else {
                        if (new_val != current_val) {
                            dictionary.dictionary_enter(v_dictionary, key, new_val);
                        }
                    }
                }
            } else {
                Errors.error($str_alt12$Corrupted_dictionary__attempting_, current_val);
            }
        }
        return NIL;
    }

    /**
     * Deletes ELT from current value at KEY in DICTIONARY. Ensures that the current
     * value is a listp. If this deletes the last element from current value,
     * then perform an @see dictionary-remove.
     */
    @LispMethod(comment = "Deletes ELT from current value at KEY in DICTIONARY. Ensures that the current\r\nvalue is a listp. If this deletes the last element from current value,\r\nthen perform an @see dictionary-remove.\nDeletes ELT from current value at KEY in DICTIONARY. Ensures that the current\nvalue is a listp. If this deletes the last element from current value,\nthen perform an @see dictionary-remove.")
    public static SubLObject dictionary_delete_from_value(final SubLObject v_dictionary, final SubLObject key, final SubLObject elt, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        if (current_val.isList()) {
            final SubLObject new_val = delete(elt, current_val, test, key_accessor, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == new_val) {
                dictionary.dictionary_remove(v_dictionary, key);
            } else
                if (!new_val.eql(current_val)) {
                    dictionary.dictionary_enter(v_dictionary, key, new_val);
                }

        } else {
            Errors.error($str12$Corrupted_dictionary__attempting_, current_val);
        }
        return NIL;
    }

    /**
     * Deletes the first occurrence of ELT from current value at KEY in DICTIONARY.
     * Ensures that the current value is a listp. If this deletes the last element
     * from current value, then perform an @see dictionary-remove.
     */
    @LispMethod(comment = "Deletes the first occurrence of ELT from current value at KEY in DICTIONARY.\r\nEnsures that the current value is a listp. If this deletes the last element\r\nfrom current value, then perform an @see dictionary-remove.\nDeletes the first occurrence of ELT from current value at KEY in DICTIONARY.\nEnsures that the current value is a listp. If this deletes the last element\nfrom current value, then perform an @see dictionary-remove.")
    public static final SubLObject dictionary_delete_first_from_value_alt(SubLObject v_dictionary, SubLObject key, SubLObject elt, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        {
            SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            if (current_val.isList()) {
                {
                    SubLObject new_val = list_utilities.delete_first(elt, current_val, test);
                    if (NIL == new_val) {
                        dictionary.dictionary_remove(v_dictionary, key);
                    } else {
                        if (new_val != current_val) {
                            dictionary.dictionary_enter(v_dictionary, key, new_val);
                        }
                    }
                }
            } else {
                Errors.error($str_alt12$Corrupted_dictionary__attempting_, current_val);
            }
        }
        return NIL;
    }

    /**
     * Deletes the first occurrence of ELT from current value at KEY in DICTIONARY.
     * Ensures that the current value is a listp. If this deletes the last element
     * from current value, then perform an @see dictionary-remove.
     */
    @LispMethod(comment = "Deletes the first occurrence of ELT from current value at KEY in DICTIONARY.\r\nEnsures that the current value is a listp. If this deletes the last element\r\nfrom current value, then perform an @see dictionary-remove.\nDeletes the first occurrence of ELT from current value at KEY in DICTIONARY.\nEnsures that the current value is a listp. If this deletes the last element\nfrom current value, then perform an @see dictionary-remove.")
    public static SubLObject dictionary_delete_first_from_value(final SubLObject v_dictionary, final SubLObject key, final SubLObject elt, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        if (current_val.isList()) {
            final SubLObject new_val = list_utilities.delete_first(elt, current_val, test);
            if (NIL == new_val) {
                dictionary.dictionary_remove(v_dictionary, key);
            } else
                if (!new_val.eql(current_val)) {
                    dictionary.dictionary_enter(v_dictionary, key, new_val);
                }

        } else {
            Errors.error($str12$Corrupted_dictionary__attempting_, current_val);
        }
        return NIL;
    }

    /**
     * Deletes the items on ELTS from current value at KEY in DICTIONARY.
     * Ensures that the current value is a listp. If this deletes the last
     * element from current value, then perform an @see dictionary-remove.
     */
    @LispMethod(comment = "Deletes the items on ELTS from current value at KEY in DICTIONARY.\r\nEnsures that the current value is a listp. If this deletes the last\r\nelement from current value, then perform an @see dictionary-remove.\nDeletes the items on ELTS from current value at KEY in DICTIONARY.\nEnsures that the current value is a listp. If this deletes the last\nelement from current value, then perform an @see dictionary-remove.")
    public static final SubLObject dictionary_delete_items_from_value_alt(SubLObject v_dictionary, SubLObject key, SubLObject elts, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        {
            SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
            if (current_val.isList()) {
                {
                    SubLObject new_val = copy_list(current_val);
                    SubLObject cdolist_list_var = elts;
                    SubLObject elt = NIL;
                    for (elt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elt = cdolist_list_var.first()) {
                        new_val = delete(elt, new_val, test, key_accessor, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL == new_val) {
                        dictionary.dictionary_remove(v_dictionary, key);
                    } else {
                        if (new_val != current_val) {
                            dictionary.dictionary_enter(v_dictionary, key, new_val);
                        }
                    }
                }
            } else {
                Errors.error($str_alt12$Corrupted_dictionary__attempting_, current_val);
            }
        }
        return NIL;
    }

    /**
     * Deletes the items on ELTS from current value at KEY in DICTIONARY.
     * Ensures that the current value is a listp. If this deletes the last
     * element from current value, then perform an @see dictionary-remove.
     */
    @LispMethod(comment = "Deletes the items on ELTS from current value at KEY in DICTIONARY.\r\nEnsures that the current value is a listp. If this deletes the last\r\nelement from current value, then perform an @see dictionary-remove.\nDeletes the items on ELTS from current value at KEY in DICTIONARY.\nEnsures that the current value is a listp. If this deletes the last\nelement from current value, then perform an @see dictionary-remove.")
    public static SubLObject dictionary_delete_items_from_value(final SubLObject v_dictionary, final SubLObject key, final SubLObject elts, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        final SubLObject current_val = dictionary.dictionary_lookup_without_values(v_dictionary, key, UNPROVIDED);
        if (current_val.isList()) {
            SubLObject new_val = copy_list(current_val);
            SubLObject cdolist_list_var = elts;
            SubLObject elt = NIL;
            elt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                new_val = delete(elt, new_val, test, key_accessor, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                elt = cdolist_list_var.first();
            } 
            if (NIL == new_val) {
                dictionary.dictionary_remove(v_dictionary, key);
            } else
                if (!new_val.eql(current_val)) {
                    dictionary.dictionary_enter(v_dictionary, key, new_val);
                }

        } else {
            Errors.error($str12$Corrupted_dictionary__attempting_, current_val);
        }
        return NIL;
    }

    /**
     * Increments the value at KEY in DICTIONARY by INCREMENT.
     * Treats NIL as 0.
     */
    @LispMethod(comment = "Increments the value at KEY in DICTIONARY by INCREMENT.\r\nTreats NIL as 0.\nIncrements the value at KEY in DICTIONARY by INCREMENT.\nTreats NIL as 0.")
    public static final SubLObject dictionary_increment_alt(SubLObject v_dictionary, SubLObject key, SubLObject increment) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        {
            SubLObject value = dictionary.dictionary_lookup_without_values(v_dictionary, key, ZERO_INTEGER);
            value = add(value, increment);
            dictionary.dictionary_enter(v_dictionary, key, value);
        }
        return v_dictionary;
    }

    /**
     * Increments the value at KEY in DICTIONARY by INCREMENT.
     * Treats NIL as 0.
     */
    @LispMethod(comment = "Increments the value at KEY in DICTIONARY by INCREMENT.\r\nTreats NIL as 0.\nIncrements the value at KEY in DICTIONARY by INCREMENT.\nTreats NIL as 0.")
    public static SubLObject dictionary_increment(final SubLObject v_dictionary, final SubLObject key, SubLObject increment) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        SubLObject value = dictionary.dictionary_lookup_without_values(v_dictionary, key, ZERO_INTEGER);
        value = add(value, increment);
        dictionary.dictionary_enter(v_dictionary, key, value);
        return v_dictionary;
    }

    /**
     * Decrement the value at KEY in DICTIONARY by DECREMENT. Treats NIL as 0.
     */
    @LispMethod(comment = "Decrement the value at KEY in DICTIONARY by DECREMENT. Treats NIL as 0.")
    public static final SubLObject dictionary_decrement_alt(SubLObject v_dictionary, SubLObject key, SubLObject decrement) {
        if (decrement == UNPROVIDED) {
            decrement = ONE_INTEGER;
        }
        return dictionary_decrement_and_remove_if(v_dictionary, key, decrement, symbol_function(FALSE));
    }

    /**
     * Decrement the value at KEY in DICTIONARY by DECREMENT. Treats NIL as 0.
     */
    @LispMethod(comment = "Decrement the value at KEY in DICTIONARY by DECREMENT. Treats NIL as 0.")
    public static SubLObject dictionary_decrement(final SubLObject v_dictionary, final SubLObject key, SubLObject decrement) {
        if (decrement == UNPROVIDED) {
            decrement = ONE_INTEGER;
        }
        return dictionary_decrement_and_remove_if(v_dictionary, key, decrement, symbol_function(FALSE));
    }

    /**
     * Decrement the value at KEY in DICTIONARY by DECREMENT. If the resulting value passes
     * test then clear the key instead of entering the new value. Treat NIL as 0.
     */
    @LispMethod(comment = "Decrement the value at KEY in DICTIONARY by DECREMENT. If the resulting value passes\r\ntest then clear the key instead of entering the new value. Treat NIL as 0.\nDecrement the value at KEY in DICTIONARY by DECREMENT. If the resulting value passes\ntest then clear the key instead of entering the new value. Treat NIL as 0.")
    public static final SubLObject dictionary_decrement_and_remove_if_alt(SubLObject v_dictionary, SubLObject key, SubLObject decrement, SubLObject test) {
        if (decrement == UNPROVIDED) {
            decrement = ONE_INTEGER;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(ZEROP);
        }
        {
            SubLObject value = dictionary.dictionary_lookup_without_values(v_dictionary, key, ZERO_INTEGER);
            value = subtract(value, decrement);
            if (NIL != funcall(test, value)) {
                dictionary.dictionary_remove(v_dictionary, key);
            } else {
                dictionary.dictionary_enter(v_dictionary, key, value);
            }
        }
        return v_dictionary;
    }

    /**
     * Decrement the value at KEY in DICTIONARY by DECREMENT. If the resulting value passes
     * test then clear the key instead of entering the new value. Treat NIL as 0.
     */
    @LispMethod(comment = "Decrement the value at KEY in DICTIONARY by DECREMENT. If the resulting value passes\r\ntest then clear the key instead of entering the new value. Treat NIL as 0.\nDecrement the value at KEY in DICTIONARY by DECREMENT. If the resulting value passes\ntest then clear the key instead of entering the new value. Treat NIL as 0.")
    public static SubLObject dictionary_decrement_and_remove_if(final SubLObject v_dictionary, final SubLObject key, SubLObject decrement, SubLObject test) {
        if (decrement == UNPROVIDED) {
            decrement = ONE_INTEGER;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(ZEROP);
        }
        SubLObject value = dictionary.dictionary_lookup_without_values(v_dictionary, key, ZERO_INTEGER);
        value = subtract(value, decrement);
        if (NIL != funcall(test, value)) {
            dictionary.dictionary_remove(v_dictionary, key);
        } else {
            dictionary.dictionary_enter(v_dictionary, key, value);
        }
        return v_dictionary;
    }

    /**
     * Returns the key in DICTIONARY whose value maximizes TEST.
     * Secondly, returns the value itself.
     */
    @LispMethod(comment = "Returns the key in DICTIONARY whose value maximizes TEST.\r\nSecondly, returns the value itself.\nReturns the key in DICTIONARY whose value maximizes TEST.\nSecondly, returns the value itself.")
    public static final SubLObject dictionary_extremal_alt(SubLObject v_dictionary, SubLObject test) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_dictionary, NON_EMPTY_DICTIONARY_P);
            {
                SubLObject extreme_key = dictionary_arbitrary_key(v_dictionary);
                SubLObject extreme_value = dictionary.dictionary_lookup_without_values(v_dictionary, extreme_key, UNPROVIDED);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != funcall(test, value, extreme_value)) {
                            extreme_key = key;
                            extreme_value = value;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return values(extreme_key, extreme_value);
            }
        }
    }

    /**
     * Returns the key in DICTIONARY whose value maximizes TEST.
     * Secondly, returns the value itself.
     */
    @LispMethod(comment = "Returns the key in DICTIONARY whose value maximizes TEST.\r\nSecondly, returns the value itself.\nReturns the key in DICTIONARY whose value maximizes TEST.\nSecondly, returns the value itself.")
    public static SubLObject dictionary_extremal(final SubLObject v_dictionary, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.non_empty_dictionary_p(v_dictionary) : "! dictionary.non_empty_dictionary_p(v_dictionary) " + ("dictionary.non_empty_dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.non_empty_dictionary_p(v_dictionary) ") + v_dictionary;
        SubLObject extreme_key = dictionary_arbitrary_key(v_dictionary);
        SubLObject extreme_value = dictionary.dictionary_lookup_without_values(v_dictionary, extreme_key, UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != funcall(test, value, extreme_value)) {
                extreme_key = key;
                extreme_value = value;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return values(extreme_key, extreme_value);
    }

    /**
     * DICTIONARY maps keys to numbers.  Returns the total of all the values in DICTIONARY.
     */
    @LispMethod(comment = "DICTIONARY maps keys to numbers.  Returns the total of all the values in DICTIONARY.")
    public static final SubLObject dictionary_total_alt(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLTrampolineFile.checkType(value, NUMBERP);
                        total = add(total, value);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return total;
            }
        }
    }

    /**
     * DICTIONARY maps keys to numbers.  Returns the total of all the values in DICTIONARY.
     */
    @LispMethod(comment = "DICTIONARY maps keys to numbers.  Returns the total of all the values in DICTIONARY.")
    public static SubLObject dictionary_total(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            assert NIL != numberp(value) : "! numberp(value) " + ("Types.numberp(value) " + "CommonSymbols.NIL != Types.numberp(value) ") + value;
            total = add(total, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return total;
    }

    /**
     * Return an alist of all the (key . value) entries in DICTIONARY.
     * Second value returned is the equality test of DICTIONARY.
     */
    @LispMethod(comment = "Return an alist of all the (key . value) entries in DICTIONARY.\r\nSecond value returned is the equality test of DICTIONARY.\nReturn an alist of all the (key . value) entries in DICTIONARY.\nSecond value returned is the equality test of DICTIONARY.")
    public static final SubLObject dictionary_to_alist_alt(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
            {
                SubLObject test = dictionary.dictionary_test(v_dictionary);
                SubLObject alist = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        alist = cons(cons(key, value), alist);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return values(alist, test);
            }
        }
    }

    /**
     * Return an alist of all the (key . value) entries in DICTIONARY.
     * Second value returned is the equality test of DICTIONARY.
     */
    @LispMethod(comment = "Return an alist of all the (key . value) entries in DICTIONARY.\r\nSecond value returned is the equality test of DICTIONARY.\nReturn an alist of all the (key . value) entries in DICTIONARY.\nSecond value returned is the equality test of DICTIONARY.")
    public static SubLObject dictionary_to_alist(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        final SubLObject test = dictionary.dictionary_test(v_dictionary);
        SubLObject alist = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            alist = cons(cons(key, value), alist);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return values(alist, test);
    }

    public static final SubLObject new_dictionary_from_alist_alt(SubLObject alist, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject size = length(alist);
            SubLObject v_dictionary = dictionary.new_dictionary(test, size);
            SubLObject cdolist_list_var = alist;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt17);
                    key = current.first();
                    current = current.rest();
                    value = current;
                    dictionary.dictionary_enter(v_dictionary, key, value);
                }
            }
            return v_dictionary;
        }
    }

    public static SubLObject new_dictionary_from_alist(final SubLObject alist, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject size = length(alist);
        final SubLObject v_dictionary = dictionary.new_dictionary(test, size);
        SubLObject cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list17);
            key = current.first();
            current = value = current.rest();
            dictionary.dictionary_enter(v_dictionary, key, value);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return v_dictionary;
    }

    public static SubLObject dictionary_to_tuples(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        final SubLObject test = dictionary.dictionary_test(v_dictionary);
        SubLObject tuples = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            tuples = cons(list(key, value), tuples);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return values(tuples, test);
    }

    /**
     *
     *
     * @return doubleton?; paired lists - of the keys, and their corresponding values, in DICTIONARY
     */
    @LispMethod(comment = "@return doubleton?; paired lists - of the keys, and their corresponding values, in DICTIONARY")
    public static final SubLObject dictionary_to_paired_lists_alt(SubLObject v_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
            {
                SubLObject key_list = NIL;
                SubLObject val_list = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject val = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        key_list = cons(key, key_list);
                        val_list = cons(val, val_list);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return list(key_list, val_list);
            }
        }
    }

    /**
     *
     *
     * @return doubleton?; paired lists - of the keys, and their corresponding values, in DICTIONARY
     */
    @LispMethod(comment = "@return doubleton?; paired lists - of the keys, and their corresponding values, in DICTIONARY")
    public static SubLObject dictionary_to_paired_lists(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        SubLObject key_list = NIL;
        SubLObject val_list = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject val = thread.secondMultipleValue();
            thread.resetMultipleValues();
            key_list = cons(key, key_list);
            val_list = cons(val, val_list);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return list(key_list, val_list);
    }

    /**
     * Assumes no duplicates in KEY-LIST
     */
    @LispMethod(comment = "Assumes no duplicates in KEY-LIST")
    public static final SubLObject new_dictionary_from_paired_lists_unique_alt(SubLObject key_list, SubLObject value_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject dict = dictionary.new_dictionary(test, UNPROVIDED);
            SubLObject key = NIL;
            SubLObject key_1 = NIL;
            SubLObject value = NIL;
            SubLObject value_2 = NIL;
            for (key = key_list, key_1 = key.first(), value = value_list, value_2 = value.first(); !((NIL == value) && (NIL == key)); key = key.rest() , key_1 = key.first() , value = value.rest() , value_2 = value.first()) {
                dictionary.dictionary_enter(dict, key_1, value_2);
            }
            return dict;
        }
    }

    /**
     * Assumes no duplicates in KEY-LIST
     */
    @LispMethod(comment = "Assumes no duplicates in KEY-LIST")
    public static SubLObject new_dictionary_from_paired_lists_unique(final SubLObject key_list, final SubLObject value_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject dict = dictionary.new_dictionary(test, UNPROVIDED);
        SubLObject key = NIL;
        SubLObject key_$1 = NIL;
        SubLObject value = NIL;
        SubLObject value_$2 = NIL;
        key = key_list;
        key_$1 = key.first();
        value = value_list;
        value_$2 = value.first();
        while ((NIL != value) || (NIL != key)) {
            dictionary.dictionary_enter(dict, key_$1, value_$2);
            key = key.rest();
            key_$1 = key.first();
            value = value.rest();
            value_$2 = value.first();
        } 
        return dict;
    }

    /**
     * Uses dictionary-push instead of dictionary-enter, so each key maps to a list of values
     */
    @LispMethod(comment = "Uses dictionary-push instead of dictionary-enter, so each key maps to a list of values")
    public static final SubLObject new_dictionary_from_paired_lists_push_alt(SubLObject key_list, SubLObject value_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject dict = dictionary.new_dictionary(test, UNPROVIDED);
            SubLObject key = NIL;
            SubLObject key_3 = NIL;
            SubLObject value = NIL;
            SubLObject value_4 = NIL;
            for (key = key_list, key_3 = key.first(), value = value_list, value_4 = value.first(); !((NIL == value) && (NIL == key)); key = key.rest() , key_3 = key.first() , value = value.rest() , value_4 = value.first()) {
                dictionary_push(dict, key_3, value_4);
            }
            return dict;
        }
    }

    /**
     * Uses dictionary-push instead of dictionary-enter, so each key maps to a list of values
     */
    @LispMethod(comment = "Uses dictionary-push instead of dictionary-enter, so each key maps to a list of values")
    public static SubLObject new_dictionary_from_paired_lists_push(final SubLObject key_list, final SubLObject value_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject dict = dictionary.new_dictionary(test, UNPROVIDED);
        SubLObject key = NIL;
        SubLObject key_$3 = NIL;
        SubLObject value = NIL;
        SubLObject value_$4 = NIL;
        key = key_list;
        key_$3 = key.first();
        value = value_list;
        value_$4 = value.first();
        while ((NIL != value) || (NIL != key)) {
            dictionary_push(dict, key_$3, value_$4);
            key = key.rest();
            key_$3 = key.first();
            value = value.rest();
            value_$4 = value.first();
        } 
        return dict;
    }

    /**
     * Constructs keys from each value in VALUE-LIST by applying the unary KEY-FUNC to the value.
     * Then pushes the value onto the dictionary with the resultant key.
     * For example, given a list of strings, you could create a dictionary mapping characters
     * to all the strings that begin with that character, by passing in a key-func that returned
     * the first character of a string.
     */
    @LispMethod(comment = "Constructs keys from each value in VALUE-LIST by applying the unary KEY-FUNC to the value.\r\nThen pushes the value onto the dictionary with the resultant key.\r\nFor example, given a list of strings, you could create a dictionary mapping characters\r\nto all the strings that begin with that character, by passing in a key-func that returned\r\nthe first character of a string.\nConstructs keys from each value in VALUE-LIST by applying the unary KEY-FUNC to the value.\nThen pushes the value onto the dictionary with the resultant key.\nFor example, given a list of strings, you could create a dictionary mapping characters\nto all the strings that begin with that character, by passing in a key-func that returned\nthe first character of a string.")
    public static final SubLObject new_classification_dictionary_alt(SubLObject value_list, SubLObject key_func, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject key_list = Mapping.mapcar(key_func, value_list);
            return new_dictionary_from_paired_lists_push(key_list, value_list, test);
        }
    }

    /**
     * Constructs keys from each value in VALUE-LIST by applying the unary KEY-FUNC to the value.
     * Then pushes the value onto the dictionary with the resultant key.
     * For example, given a list of strings, you could create a dictionary mapping characters
     * to all the strings that begin with that character, by passing in a key-func that returned
     * the first character of a string.
     */
    @LispMethod(comment = "Constructs keys from each value in VALUE-LIST by applying the unary KEY-FUNC to the value.\r\nThen pushes the value onto the dictionary with the resultant key.\r\nFor example, given a list of strings, you could create a dictionary mapping characters\r\nto all the strings that begin with that character, by passing in a key-func that returned\r\nthe first character of a string.\nConstructs keys from each value in VALUE-LIST by applying the unary KEY-FUNC to the value.\nThen pushes the value onto the dictionary with the resultant key.\nFor example, given a list of strings, you could create a dictionary mapping characters\nto all the strings that begin with that character, by passing in a key-func that returned\nthe first character of a string.")
    public static SubLObject new_classification_dictionary(final SubLObject value_list, final SubLObject key_func, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject key_list = Mapping.mapcar(key_func, value_list);
        return new_dictionary_from_paired_lists_push(key_list, value_list, test);
    }

    /**
     * This macro is similar to do-dictionary.  Unlike do-dictionary
     * it takes an accumulation var and only one expression in its body.
     * Iterates over all object in the dictionary, binding key and val
     * each entry.  Iterated-expression is evaluated once for each
     * entry and the result of evaluating the expression is appended
     * to the end of the accumulator-var list.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "This macro is similar to do-dictionary.  Unlike do-dictionary\r\nit takes an accumulation var and only one expression in its body.\r\nIterates over all object in the dictionary, binding key and val\r\neach entry.  Iterated-expression is evaluated once for each\r\nentry and the result of evaluating the expression is appended\r\nto the end of the accumulator-var list.\r\n\r\n@unknown sdevoy\nThis macro is similar to do-dictionary.  Unlike do-dictionary\nit takes an accumulation var and only one expression in its body.\nIterates over all object in the dictionary, binding key and val\neach entry.  Iterated-expression is evaluated once for each\nentry and the result of evaluating the expression is appended\nto the end of the accumulator-var list.")
    public static final SubLObject do_dictionary_accumulating_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject val = NIL;
                    SubLObject dict_expression = NIL;
                    SubLObject collection_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    val = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    dict_expression = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    collection_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject iterated_expression = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt18);
                            iterated_expression = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject ignores = NIL;
                                    if (NIL == list_utilities.tree_find(val, iterated_expression, UNPROVIDED, UNPROVIDED)) {
                                        ignores = cons(val, ignores);
                                    }
                                    if (NIL == list_utilities.tree_find(key, iterated_expression, UNPROVIDED, UNPROVIDED)) {
                                        ignores = cons(key, ignores);
                                    }
                                    {
                                        SubLObject dict_expression_var = $sym19$DICT_EXPRESSION_VAR;
                                        return list(CLET, list(list(dict_expression_var, dict_expression)), listS(CSETQ, collection_var, $list_alt22), list(PWHEN, list(DICTIONARY_P, dict_expression_var), listS(DO_DICTIONARY, list(key, val, dict_expression), append(NIL != ignores ? ((SubLObject) (list(bq_cons(IGNORE, append(ignores, NIL))))) : NIL, list(list(CPUSH, iterated_expression, collection_var)))), list(CSETQ, collection_var, list(NREVERSE, collection_var))));
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt18);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt18);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * This macro is similar to do-dictionary.  Unlike do-dictionary
     * it takes an accumulation var and only one expression in its body.
     * Iterates over all object in the dictionary, binding key and val
     * each entry.  Iterated-expression is evaluated once for each
     * entry and the result of evaluating the expression is appended
     * to the end of the accumulator-var list.
     *
     * @unknown sdevoy
     */
    @LispMethod(comment = "This macro is similar to do-dictionary.  Unlike do-dictionary\r\nit takes an accumulation var and only one expression in its body.\r\nIterates over all object in the dictionary, binding key and val\r\neach entry.  Iterated-expression is evaluated once for each\r\nentry and the result of evaluating the expression is appended\r\nto the end of the accumulator-var list.\r\n\r\n@unknown sdevoy\nThis macro is similar to do-dictionary.  Unlike do-dictionary\nit takes an accumulation var and only one expression in its body.\nIterates over all object in the dictionary, binding key and val\neach entry.  Iterated-expression is evaluated once for each\nentry and the result of evaluating the expression is appended\nto the end of the accumulator-var list.")
    public static SubLObject do_dictionary_accumulating(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject val = NIL;
        SubLObject dict_expression = NIL;
        SubLObject collection_var = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        val = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        dict_expression = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        collection_var = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject iterated_expression = NIL;
            destructuring_bind_must_consp(current, datum, $list18);
            iterated_expression = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject ignores = NIL;
                if (NIL == list_utilities.tree_find(val, iterated_expression, UNPROVIDED, UNPROVIDED)) {
                    ignores = cons(val, ignores);
                }
                if (NIL == list_utilities.tree_find(key, iterated_expression, UNPROVIDED, UNPROVIDED)) {
                    ignores = cons(key, ignores);
                }
                final SubLObject dict_expression_var = $sym19$DICT_EXPRESSION_VAR;
                return list(CLET, list(list(dict_expression_var, dict_expression)), listS(CSETQ, collection_var, $list22), list(PWHEN, list(DICTIONARY_P, dict_expression_var), listS(DO_DICTIONARY, list(key, val, dict_expression), append(NIL != ignores ? list(bq_cons(IGNORE, append(ignores, NIL))) : NIL, list(list(CPUSH, iterated_expression, collection_var)))), list(CSETQ, collection_var, list(NREVERSE, collection_var))));
            }
            cdestructuring_bind_error(datum, $list18);
        } else {
            cdestructuring_bind_error(datum, $list18);
        }
        return NIL;
    }

    /**
     * returns a dictionary corresponding to pairings of words in lines of text.
     *
     * @unknown yogman
     */
    @LispMethod(comment = "returns a dictionary corresponding to pairings of words in lines of text.\r\n\r\n@unknown yogman")
    public static final SubLObject make_dictionary_from_text_alt(SubLObject path_string) {
        {
            SubLObject file_stream = compatibility.open_text(path_string, $INPUT, UNPROVIDED);
            SubLObject current_line_as_list = NIL;
            SubLObject doneP = NIL;
            SubLObject dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            while (NIL == doneP) {
                current_line_as_list = list_utilities.safe_read_delimited_list(CHAR_newline, file_stream, UNPROVIDED);
                if (current_line_as_list.isString()) {
                    doneP = T;
                } else {
                    dictionary.dictionary_enter(dict, current_line_as_list.first(), second(current_line_as_list));
                }
            } 
            close(file_stream, UNPROVIDED);
            return dict;
        }
    }

    /**
     * returns a dictionary corresponding to pairings of words in lines of text.
     *
     * @unknown yogman
     */
    @LispMethod(comment = "returns a dictionary corresponding to pairings of words in lines of text.\r\n\r\n@unknown yogman")
    public static SubLObject make_dictionary_from_text(final SubLObject path_string) {
        final SubLObject file_stream = compatibility.open_text(path_string, $INPUT);
        SubLObject current_line_as_list = NIL;
        SubLObject doneP = NIL;
        final SubLObject dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        while (NIL == doneP) {
            current_line_as_list = list_utilities.safe_read_delimited_list(CHAR_newline, file_stream, UNPROVIDED);
            if (current_line_as_list.isString()) {
                doneP = T;
            } else {
                dictionary.dictionary_enter(dict, current_line_as_list.first(), second(current_line_as_list));
            }
        } 
        close(file_stream, UNPROVIDED);
        return dict;
    }

    /**
     * Count the number of times through the dictionary; analog to cdolist-numbered etc/
     */
    @LispMethod(comment = "Count the number of times through the dictionary; analog to cdolist-numbered etc/")
    public static final SubLObject do_dictionary_numbered_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject numvar = NIL;
                    SubLObject v_dictionary = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    numvar = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    v_dictionary = current.first();
                    current = current.rest();
                    {
                        SubLObject done = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt29);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list(bq_cons(numvar, $list_alt30)), list(DO_DICTIONARY, list(key, value, v_dictionary, done), bq_cons(PROGN, append(body, NIL)), list(CINC, numvar)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt29);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Count the number of times through the dictionary; analog to cdolist-numbered etc/
     */
    @LispMethod(comment = "Count the number of times through the dictionary; analog to cdolist-numbered etc/")
    public static SubLObject do_dictionary_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject numvar = NIL;
        SubLObject v_dictionary = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        numvar = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        v_dictionary = current.first();
        current = current.rest();
        final SubLObject done = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list29);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(bq_cons(numvar, $list30)), list(DO_DICTIONARY, list(key, value, v_dictionary, done), bq_cons(PROGN, append(body, NIL)), list(CINC, numvar)));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }

    public static final SubLObject print_dictionary_contents_alt(SubLObject dict, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        format(stream, $str_alt33$_S_____S__, key, value);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    public static SubLObject print_dictionary_contents(final SubLObject dict, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format(stream, $str33$_S_____S__, key, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static final SubLObject print_dictionary_contents_wX_dictionary_values_alt(SubLObject dict, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        format(stream, $str_alt34$_S____, key);
                        if (NIL != dictionary.dictionary_p(value)) {
                            terpri(stream);
                            print_dictionary_contents(value, stream);
                            terpri(stream);
                        } else {
                            format(stream, $str_alt35$_S__, value);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    public static SubLObject print_dictionary_contents_wX_dictionary_values(final SubLObject dict, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format(stream, $str34$_S____, key);
            if (NIL != dictionary.dictionary_p(value)) {
                terpri(stream);
                print_dictionary_contents(value, stream);
                terpri(stream);
            } else {
                format(stream, $str35$_S__, value);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static SubLObject print_dictionary_contents_wX_hashtable_values(final SubLObject dict, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format(stream, $str34$_S____, key);
            if (value.isHashtable()) {
                terpri(stream);
                hash_table_utilities.printhash(value, stream);
                terpri(stream);
            } else {
                format(stream, $str35$_S__, value);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    /**
     * Output DICTIONARY to FILE-NAME as comma-separated values.
     */
    @LispMethod(comment = "Output DICTIONARY to FILE-NAME as comma-separated values.")
    public static final SubLObject print_dictionary_contents_to_csv_alt(SubLObject v_dictionary, SubLObject file_name, SubLObject key_header, SubLObject value_header) {
        if (key_header == UNPROVIDED) {
            key_header = NIL;
        }
        if (value_header == UNPROVIDED) {
            value_header = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(file_name, STRINGP);
            if (NIL == string_utilities.ends_with(file_name, $str_alt37$_csv, UNPROVIDED)) {
                file_name = cconcatenate(file_name, $str_alt37$_csv);
            }
            if (NIL != Filesys.probe_file(file_name)) {
                Filesys.delete_file(file_name);
            }
            {
                SubLObject stream_var = NIL;
                try {
                    stream_var = StreamsLow.open(file_name, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE });
                    {
                        SubLObject out_stream = stream_var;
                        if (key_header.isString() || value_header.isString()) {
                            format(out_stream, $str_alt42$_A___A__, key_header, value_header);
                        }
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject value = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    format(out_stream, $str_alt43$_S___S__, key, value);
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != stream_var) {
                                close(stream_var, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return file_name;
        }
    }

    /**
     * Output DICTIONARY to FILE-NAME as comma-separated values.
     */
    @LispMethod(comment = "Output DICTIONARY to FILE-NAME as comma-separated values.")
    public static SubLObject print_dictionary_contents_to_csv(final SubLObject v_dictionary, SubLObject file_name, SubLObject key_header, SubLObject value_header) {
        if (key_header == UNPROVIDED) {
            key_header = NIL;
        }
        if (value_header == UNPROVIDED) {
            value_header = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(file_name) : "! stringp(file_name) " + ("Types.stringp(file_name) " + "CommonSymbols.NIL != Types.stringp(file_name) ") + file_name;
        if (NIL == string_utilities.ends_with(file_name, $str37$_csv, UNPROVIDED)) {
            file_name = cconcatenate(file_name, $str37$_csv);
        }
        if (NIL != Filesys.probe_file(file_name)) {
            Filesys.delete_file(file_name);
        }
        SubLObject stream_var = NIL;
        try {
            final SubLObject out_stream;
            stream_var = out_stream = StreamsLow.open(file_name, new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE });
            if (key_header.isString() || value_header.isString()) {
                format(out_stream, $str42$_A___A__, key_header, value_header);
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject value = thread.secondMultipleValue();
                thread.resetMultipleValues();
                format(out_stream, $str43$_S___S__, key, value);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != stream_var) {
                    close(stream_var, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return file_name;
    }

    public static SubLObject new_dictionary_from_csv(final SubLObject file_name, SubLObject test, SubLObject has_header_rowP, SubLObject readP) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (has_header_rowP == UNPROVIDED) {
            has_header_rowP = NIL;
        }
        if (readP == UNPROVIDED) {
            readP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(test, UNPROVIDED);
        SubLObject first_lineP = T;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file_name, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str44$Unable_to_open__S, file_name);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$5 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$5); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$5)) {
                    final SubLObject tokenized_line = string_utilities.string_tokenize(line, list(CHAR_comma), list(list($str45$_, $str45$_)), NIL, NIL, list(CHAR_backslash), UNPROVIDED);
                    if ((NIL == first_lineP) || (NIL == has_header_rowP)) {
                        final SubLObject key = string_utilities.possibly_read_from_string_ignoring_errors(tokenized_line.first(), readP);
                        SubLObject value = NIL;
                        if (NIL != list_utilities.doubletonP(tokenized_line)) {
                            value = string_utilities.possibly_read_from_string_ignoring_errors(second(tokenized_line), readP);
                        } else {
                            SubLObject cdolist_list_var = tokenized_line.rest();
                            SubLObject value_piece = NIL;
                            value_piece = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                value = cons(string_utilities.possibly_read_from_string_ignoring_errors(value_piece, readP), value);
                                cdolist_list_var = cdolist_list_var.rest();
                                value_piece = cdolist_list_var.first();
                            } 
                            value = nreverse(value);
                        }
                        dictionary.dictionary_enter(dict, key, value);
                    }
                    first_lineP = NIL;
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return dict;
    }

    /**
     *
     *
     * @return alist-p
     * @unknown result is destructible.
     */
    @LispMethod(comment = "@return alist-p\r\n@unknown result is destructible.")
    public static final SubLObject sort_dictionary_by_keys_alt(SubLObject v_dictionary, SubLObject predicate) {
        {
            SubLObject alist = dictionary_to_alist(v_dictionary);
            SubLObject sorted_alist = list_utilities.sort_alist_by_keys(alist, predicate);
            return sorted_alist;
        }
    }

    /**
     *
     *
     * @return alist-p
     * @unknown result is destructible.
     */
    @LispMethod(comment = "@return alist-p\r\n@unknown result is destructible.")
    public static SubLObject sort_dictionary_by_keys(final SubLObject v_dictionary, final SubLObject predicate) {
        final SubLObject alist = dictionary_to_alist(v_dictionary);
        final SubLObject sorted_alist = list_utilities.sort_alist_by_keys(alist, predicate);
        return sorted_alist;
    }

    /**
     *
     *
     * @return alist-p
     * @unknown result is destructible.
     */
    @LispMethod(comment = "@return alist-p\r\n@unknown result is destructible.")
    public static final SubLObject sort_dictionary_by_values_alt(SubLObject v_dictionary, SubLObject predicate) {
        {
            SubLObject alist = dictionary_to_alist(v_dictionary);
            SubLObject sorted_alist = list_utilities.sort_alist_by_values(alist, predicate);
            return sorted_alist;
        }
    }

    /**
     *
     *
     * @return alist-p
     * @unknown result is destructible.
     */
    @LispMethod(comment = "@return alist-p\r\n@unknown result is destructible.")
    public static SubLObject sort_dictionary_by_values(final SubLObject v_dictionary, final SubLObject predicate) {
        final SubLObject alist = dictionary_to_alist(v_dictionary);
        final SubLObject sorted_alist = list_utilities.sort_alist_by_values(alist, predicate);
        return sorted_alist;
    }

    /**
     * Sorts the keys of the dictionary by applying the predicate to the
     * associated values.
     *
     * @return LISTP of keys
     * @unknown result is destructible
     */
    @LispMethod(comment = "Sorts the keys of the dictionary by applying the predicate to the\r\nassociated values.\r\n\r\n@return LISTP of keys\r\n@unknown result is destructible\nSorts the keys of the dictionary by applying the predicate to the\nassociated values.")
    public static final SubLObject dictionary_keys_sorted_by_values_alt(SubLObject v_dictionary, SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sorting_information = list(v_dictionary, predicate, key);
                SubLObject unsorted_keys = dictionary.dictionary_keys(v_dictionary);
                SubLObject sorted_keys = NIL;
                {
                    SubLObject _prev_bind_0 = $dictionary_keys_sorter_current_sorting_information$.currentBinding(thread);
                    try {
                        $dictionary_keys_sorter_current_sorting_information$.bind(sorting_information, thread);
                        sorted_keys = Sort.sort(unsorted_keys, DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE, UNPROVIDED);
                    } finally {
                        $dictionary_keys_sorter_current_sorting_information$.rebind(_prev_bind_0, thread);
                    }
                }
                return sorted_keys;
            }
        }
    }

    /**
     * Sorts the keys of the dictionary by applying the predicate to the
     * associated values.
     *
     * @return LISTP of keys
     * @unknown result is destructible
     */
    @LispMethod(comment = "Sorts the keys of the dictionary by applying the predicate to the\r\nassociated values.\r\n\r\n@return LISTP of keys\r\n@unknown result is destructible\nSorts the keys of the dictionary by applying the predicate to the\nassociated values.")
    public static SubLObject dictionary_keys_sorted_by_values(final SubLObject v_dictionary, final SubLObject predicate, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sorting_information = list(v_dictionary, predicate, key);
        final SubLObject unsorted_keys = dictionary.dictionary_keys(v_dictionary);
        SubLObject sorted_keys = NIL;
        final SubLObject _prev_bind_0 = $dictionary_keys_sorter_current_sorting_information$.currentBinding(thread);
        try {
            $dictionary_keys_sorter_current_sorting_information$.bind(sorting_information, thread);
            sorted_keys = Sort.sort(unsorted_keys, DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE, UNPROVIDED);
        } finally {
            $dictionary_keys_sorter_current_sorting_information$.rebind(_prev_bind_0, thread);
        }
        return sorted_keys;
    }

    /**
     * Helper method for DICTIONARY-KEYS-SORTED-BY-VALUES that takes the two
     * keys and applies the comparison predicate to their respective values
     * (possibly transformed by the key operator).
     */
    @LispMethod(comment = "Helper method for DICTIONARY-KEYS-SORTED-BY-VALUES that takes the two\r\nkeys and applies the comparison predicate to their respective values\r\n(possibly transformed by the key operator).\nHelper method for DICTIONARY-KEYS-SORTED-BY-VALUES that takes the two\nkeys and applies the comparison predicate to their respective values\n(possibly transformed by the key operator).")
    public static final SubLObject dictionary_keys_sorter_comparison_predicate_alt(SubLObject key_a, SubLObject key_b) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = $dictionary_keys_sorter_current_sorting_information$.getDynamicValue(thread);
                SubLObject current = datum;
                SubLObject v_dictionary = NIL;
                SubLObject predicate = NIL;
                SubLObject key = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt45);
                v_dictionary = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt45);
                predicate = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt45);
                key = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject raw_value_a = dictionary.dictionary_lookup_without_values(v_dictionary, key_a, UNPROVIDED);
                        SubLObject value_a = funcall(key, raw_value_a);
                        SubLObject raw_value_b = dictionary.dictionary_lookup_without_values(v_dictionary, key_b, UNPROVIDED);
                        SubLObject value_b = funcall(key, raw_value_b);
                        return funcall(predicate, value_a, value_b);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt45);
                }
            }
            return NIL;
        }
    }

    /**
     * Helper method for DICTIONARY-KEYS-SORTED-BY-VALUES that takes the two
     * keys and applies the comparison predicate to their respective values
     * (possibly transformed by the key operator).
     */
    @LispMethod(comment = "Helper method for DICTIONARY-KEYS-SORTED-BY-VALUES that takes the two\r\nkeys and applies the comparison predicate to their respective values\r\n(possibly transformed by the key operator).\nHelper method for DICTIONARY-KEYS-SORTED-BY-VALUES that takes the two\nkeys and applies the comparison predicate to their respective values\n(possibly transformed by the key operator).")
    public static SubLObject dictionary_keys_sorter_comparison_predicate(final SubLObject key_a, final SubLObject key_b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = $dictionary_keys_sorter_current_sorting_information$.getDynamicValue(thread);
        SubLObject v_dictionary = NIL;
        SubLObject predicate = NIL;
        SubLObject key = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        v_dictionary = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        key = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject raw_value_a = dictionary.dictionary_lookup_without_values(v_dictionary, key_a, UNPROVIDED);
            final SubLObject value_a = funcall(key, raw_value_a);
            final SubLObject raw_value_b = dictionary.dictionary_lookup_without_values(v_dictionary, key_b, UNPROVIDED);
            final SubLObject value_b = funcall(key, raw_value_b);
            return funcall(predicate, value_a, value_b);
        }
        cdestructuring_bind_error(datum, $list47);
        return NIL;
    }

    public static final SubLObject test_dictionary_keys_sorted_by_values_alt(SubLObject alist, SubLObject sort_pred, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject v_dictionary = new_dictionary_from_alist(alist, UNPROVIDED);
            return dictionary_keys_sorted_by_values(v_dictionary, sort_pred, key);
        }
    }

    public static SubLObject test_dictionary_keys_sorted_by_values(final SubLObject alist, final SubLObject sort_pred, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLObject v_dictionary = new_dictionary_from_alist(alist, UNPROVIDED);
        return dictionary_keys_sorted_by_values(v_dictionary, sort_pred, key);
    }

    /**
     * Create a new dictionary of equivalent size and equality operation, but replace the
     * dictionary values with the functor applied to the value in the original dictionary.
     *
     * @param FUNCTOR
     * 		function-spec-p the transformation operator to be applied to all values
     * @return new DICTIONARY-P of keys pointing to transformed values
     */
    @LispMethod(comment = "Create a new dictionary of equivalent size and equality operation, but replace the\r\ndictionary values with the functor applied to the value in the original dictionary.\r\n\r\n@param FUNCTOR\r\n\t\tfunction-spec-p the transformation operator to be applied to all values\r\n@return new DICTIONARY-P of keys pointing to transformed values\nCreate a new dictionary of equivalent size and equality operation, but replace the\ndictionary values with the functor applied to the value in the original dictionary.")
    public static final SubLObject map_dictionary_values_alt(SubLObject v_dictionary, SubLObject functor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_dictionary = v_dictionary;
                SubLObject new_dictionary = dictionary.new_dictionary(dictionary.dictionary_test(old_dictionary), dictionary.dictionary_length(old_dictionary));
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(old_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        dictionary.dictionary_enter(new_dictionary, key, funcall(functor, value));
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return new_dictionary;
            }
        }
    }

    /**
     * Create a new dictionary of equivalent size and equality operation, but replace the
     * dictionary values with the functor applied to the value in the original dictionary.
     *
     * @param FUNCTOR
     * 		function-spec-p the transformation operator to be applied to all values
     * @return new DICTIONARY-P of keys pointing to transformed values
     */
    @LispMethod(comment = "Create a new dictionary of equivalent size and equality operation, but replace the\r\ndictionary values with the functor applied to the value in the original dictionary.\r\n\r\n@param FUNCTOR\r\n\t\tfunction-spec-p the transformation operator to be applied to all values\r\n@return new DICTIONARY-P of keys pointing to transformed values\nCreate a new dictionary of equivalent size and equality operation, but replace the\ndictionary values with the functor applied to the value in the original dictionary.")
    public static SubLObject map_dictionary_values(final SubLObject v_dictionary, final SubLObject functor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_dictionary = dictionary.new_dictionary(dictionary.dictionary_test(v_dictionary), dictionary.dictionary_length(v_dictionary));
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_enter(new_dictionary, key, funcall(functor, value));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_dictionary;
    }

    public static final SubLObject test_map_dictionary_values_alt(SubLObject alist, SubLObject functor, SubLObject testfn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_dictionary = new_dictionary_from_alist(alist, UNPROVIDED);
                SubLObject new_dictionary = map_dictionary_values(old_dictionary, functor);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(old_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject expected_new_value = funcall(functor, value);
                            SubLObject resulting_new_value = dictionary.dictionary_lookup(new_dictionary, key, UNPROVIDED);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == funcall(testfn, expected_new_value, resulting_new_value)) {
                                    Errors.error($str_alt57$For_key__A__the_computed_new_valu, new SubLObject[]{ key, resulting_new_value, testfn, expected_new_value });
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return $SUCCESS;
        }
    }

    public static SubLObject test_map_dictionary_values(final SubLObject alist, final SubLObject functor, final SubLObject testfn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_dictionary = new_dictionary_from_alist(alist, UNPROVIDED);
        final SubLObject new_dictionary = map_dictionary_values(old_dictionary, functor);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(old_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject expected_new_value = funcall(functor, value);
            final SubLObject resulting_new_value = dictionary.dictionary_lookup(new_dictionary, key, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == funcall(testfn, expected_new_value, resulting_new_value))) {
                Errors.error($str48$For_key__A__the_computed_new_valu, new SubLObject[]{ key, resulting_new_value, testfn, expected_new_value });
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return $SUCCESS;
    }

    /**
     * Given a dictionary that maps keys to positive numbers, a descendingly ordered
     * list of the keys, and a number of tiles (as in percentiles, quintiles, quartiles,
     * etc), identify the keys that correspond to the start of the first, second, third,
     * etc. tile. If no ORDERED-KEYS are provided, then DICTIONARY-KEYS-SORTED-BY-VALUES
     * with predicate #'> is used to compute them.
     *
     * @return a LISTP of N+1 tuples consisting of the item, its position in the list of
    ordered keys, and the sum up to that point
     */
    @LispMethod(comment = "Given a dictionary that maps keys to positive numbers, a descendingly ordered\r\nlist of the keys, and a number of tiles (as in percentiles, quintiles, quartiles,\r\netc), identify the keys that correspond to the start of the first, second, third,\r\netc. tile. If no ORDERED-KEYS are provided, then DICTIONARY-KEYS-SORTED-BY-VALUES\r\nwith predicate #\'> is used to compute them.\r\n\r\n@return a LISTP of N+1 tuples consisting of the item, its position in the list of\r\nordered keys, and the sum up to that point\nGiven a dictionary that maps keys to positive numbers, a descendingly ordered\nlist of the keys, and a number of tiles (as in percentiles, quintiles, quartiles,\netc), identify the keys that correspond to the start of the first, second, third,\netc. tile. If no ORDERED-KEYS are provided, then DICTIONARY-KEYS-SORTED-BY-VALUES\nwith predicate #\'> is used to compute them.")
    public static final SubLObject partition_dictionary_keys_into_n_tiles_alt(SubLObject v_dictionary, SubLObject n, SubLObject ordered_keys) {
        if (ordered_keys == UNPROVIDED) {
            ordered_keys = NIL;
        }
        if (NIL != dictionary.dictionary_empty_p(v_dictionary)) {
            return NIL;
        }
        if (NIL == ordered_keys) {
            ordered_keys = dictionary_keys_sorted_by_values(v_dictionary, symbol_function($sym59$_), UNPROVIDED);
        }
        {
            SubLObject total = dictionary_total(v_dictionary);
            SubLObject tile_width = divide(total, n);
            SubLObject tile_border = ZERO_INTEGER;
            SubLObject last_tile_border = multiply(tile_width, subtract(n, ONE_INTEGER));
            SubLObject sum = ZERO_INTEGER;
            SubLObject partition = NIL;
            SubLObject doneP = NIL;
            SubLObject list_var = NIL;
            SubLObject key = NIL;
            SubLObject position = NIL;
            for (list_var = ordered_keys, key = list_var.first(), position = ZERO_INTEGER; !((NIL != doneP) || (NIL == list_var)); list_var = list_var.rest() , key = list_var.first() , position = add(ONE_INTEGER, position)) {
                {
                    SubLObject number = dictionary.dictionary_lookup_without_values(v_dictionary, key, ZERO_INTEGER);
                    sum = add(sum, number);
                    while (sum.numG(tile_border)) {
                        partition = cons(list(key, position, sum), partition);
                        tile_border = add(tile_border, tile_width);
                        doneP = numGE(tile_border, last_tile_border);
                    } 
                }
            }
            {
                SubLObject last_key = last(ordered_keys, UNPROVIDED).first();
                SubLObject last_pos = subtract(dictionary.dictionary_length(v_dictionary), ONE_INTEGER);
                partition = cons(list(last_key, last_pos, total), partition);
            }
            return nreverse(partition);
        }
    }

    /**
     * Given a dictionary that maps keys to positive numbers, a descendingly ordered
     * list of the keys, and a number of tiles (as in percentiles, quintiles, quartiles,
     * etc), identify the keys that correspond to the start of the first, second, third,
     * etc. tile. If no ORDERED-KEYS are provided, then DICTIONARY-KEYS-SORTED-BY-VALUES
     * with predicate #'> is used to compute them.
     *
     * @return a LISTP of N+1 tuples consisting of the item, its position in the list of
    ordered keys, and the sum up to that point
     */
    @LispMethod(comment = "Given a dictionary that maps keys to positive numbers, a descendingly ordered\r\nlist of the keys, and a number of tiles (as in percentiles, quintiles, quartiles,\r\netc), identify the keys that correspond to the start of the first, second, third,\r\netc. tile. If no ORDERED-KEYS are provided, then DICTIONARY-KEYS-SORTED-BY-VALUES\r\nwith predicate #\'> is used to compute them.\r\n\r\n@return a LISTP of N+1 tuples consisting of the item, its position in the list of\r\nordered keys, and the sum up to that point\nGiven a dictionary that maps keys to positive numbers, a descendingly ordered\nlist of the keys, and a number of tiles (as in percentiles, quintiles, quartiles,\netc), identify the keys that correspond to the start of the first, second, third,\netc. tile. If no ORDERED-KEYS are provided, then DICTIONARY-KEYS-SORTED-BY-VALUES\nwith predicate #\'> is used to compute them.")
    public static SubLObject partition_dictionary_keys_into_n_tiles(final SubLObject v_dictionary, final SubLObject n, SubLObject ordered_keys) {
        if (ordered_keys == UNPROVIDED) {
            ordered_keys = NIL;
        }
        if (NIL != dictionary.dictionary_empty_p(v_dictionary)) {
            return NIL;
        }
        if (NIL == ordered_keys) {
            ordered_keys = dictionary_keys_sorted_by_values(v_dictionary, symbol_function($sym50$_), UNPROVIDED);
        }
        final SubLObject total = dictionary_total(v_dictionary);
        final SubLObject tile_width = divide(total, n);
        SubLObject tile_border = ZERO_INTEGER;
        final SubLObject last_tile_border = multiply(tile_width, subtract(n, ONE_INTEGER));
        SubLObject sum = ZERO_INTEGER;
        SubLObject partition = NIL;
        SubLObject doneP = NIL;
        SubLObject list_var = NIL;
        SubLObject key = NIL;
        SubLObject position = NIL;
        list_var = ordered_keys;
        key = list_var.first();
        for (position = ZERO_INTEGER; (NIL == doneP) && (NIL != list_var); list_var = list_var.rest() , key = list_var.first() , position = add(ONE_INTEGER, position)) {
            final SubLObject number = dictionary.dictionary_lookup_without_values(v_dictionary, key, ZERO_INTEGER);
            for (sum = add(sum, number); sum.numG(tile_border); tile_border = add(tile_border, tile_width) , doneP = numGE(tile_border, last_tile_border)) {
                partition = cons(list(key, position, sum), partition);
            }
        }
        final SubLObject last_key = last(ordered_keys, UNPROVIDED).first();
        final SubLObject last_pos = subtract(dictionary.dictionary_length(v_dictionary), ONE_INTEGER);
        partition = cons(list(last_key, last_pos, total), partition);
        return nreverse(partition);
    }

    public static final SubLObject do_dictionary_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt60);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject v_dictionary = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt60);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt60);
                    v_dictionary = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt60);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt60);
                            if (NIL == member(current_5, $list_alt61, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt60);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject value = $sym64$VALUE;
                                return listS(DO_DICTIONARY, list(key, value, v_dictionary, done), list(IGNORE, value), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_dictionary_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject v_dictionary = NIL;
        destructuring_bind_must_consp(current, datum, $list51);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        v_dictionary = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list51);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list51);
            if (NIL == member(current_$6, $list52, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list51);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject value = $sym55$VALUE;
        return listS(DO_DICTIONARY, list(key, value, v_dictionary, done), list(IGNORE, value), append(body, NIL));
    }

    public static final SubLObject do_dictionary_values_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject value = NIL;
                    SubLObject v_dictionary = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    v_dictionary = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt65);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt65);
                            if (NIL == member(current_6, $list_alt61, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt65);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject key = $sym66$KEY;
                                return listS(DO_DICTIONARY, list(key, value, v_dictionary, done), list(IGNORE, key), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_dictionary_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = NIL;
        SubLObject v_dictionary = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        v_dictionary = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list56);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list56);
            if (NIL == member(current_$7, $list52, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list56);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject key = $sym57$KEY;
        return listS(DO_DICTIONARY, list(key, value, v_dictionary, done), list(IGNORE, key), append(body, NIL));
    }

    /**
     *
     *
     * @unknown the DICTIONARY with the tuple list added, or a new dictionary
    with the contents of the tuple-list added if dicttionary is not defined
     * @param TUPLE-LIST
     * 		listp of tuples where the first item is to be used
     * 		as a key and the second item as the value in the dictionary.
     */
    @LispMethod(comment = "@unknown the DICTIONARY with the tuple list added, or a new dictionary\r\nwith the contents of the tuple-list added if dicttionary is not defined\r\n@param TUPLE-LIST\r\n\t\tlistp of tuples where the first item is to be used\r\n\t\tas a key and the second item as the value in the dictionary.")
    public static final SubLObject add_tuple_list_to_dictionary_alt(SubLObject tuple_list, SubLObject v_dictionary) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = NIL;
        }
        if (NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        SubLTrampolineFile.checkType(tuple_list, LISTP);
        {
            SubLObject cdolist_list_var = tuple_list;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt67);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt67);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        dictionary.dictionary_enter(v_dictionary, key, value);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt67);
                    }
                }
            }
        }
        return v_dictionary;
    }

    /**
     *
     *
     * @unknown the DICTIONARY with the tuple list added, or a new dictionary
    with the contents of the tuple-list added if dicttionary is not defined
     * @param TUPLE-LIST
     * 		listp of tuples where the first item is to be used
     * 		as a key and the second item as the value in the dictionary.
     */
    @LispMethod(comment = "@unknown the DICTIONARY with the tuple list added, or a new dictionary\r\nwith the contents of the tuple-list added if dicttionary is not defined\r\n@param TUPLE-LIST\r\n\t\tlistp of tuples where the first item is to be used\r\n\t\tas a key and the second item as the value in the dictionary.")
    public static SubLObject add_tuple_list_to_dictionary(final SubLObject tuple_list, SubLObject v_dictionary) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = NIL;
        }
        if (NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        assert NIL != listp(tuple_list) : "! listp(tuple_list) " + ("Types.listp(tuple_list) " + "CommonSymbols.NIL != Types.listp(tuple_list) ") + tuple_list;
        SubLObject cdolist_list_var = tuple_list;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list58);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list58);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                dictionary.dictionary_enter(v_dictionary, key, value);
            } else {
                cdestructuring_bind_error(datum, $list58);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return v_dictionary;
    }

    /**
     *
     *
     * @unknown the DICTIONARY with the key-list entries added as keys and the
    the value-list entries added as the corresponding values.
     * @param KEY-LIST
     * 		listp of keys.
     * @param VALUE-LIST
     * 		listp of values.
     */
    @LispMethod(comment = "@unknown the DICTIONARY with the key-list entries added as keys and the\r\nthe value-list entries added as the corresponding values.\r\n@param KEY-LIST\r\n\t\tlistp of keys.\r\n@param VALUE-LIST\r\n\t\tlistp of values.")
    public static final SubLObject add_values_from_lists_to_dictionary_alt(SubLObject key_list, SubLObject value_list, SubLObject v_dictionary) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = NIL;
        }
        if (NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
        SubLTrampolineFile.checkType(key_list, LISTP);
        SubLTrampolineFile.checkType(value_list, LISTP);
        {
            SubLObject key = NIL;
            SubLObject key_7 = NIL;
            SubLObject value = NIL;
            SubLObject value_8 = NIL;
            for (key = key_list, key_7 = key.first(), value = value_list, value_8 = value.first(); !((NIL == value) && (NIL == key)); key = key.rest() , key_7 = key.first() , value = value.rest() , value_8 = value.first()) {
                dictionary.dictionary_enter(v_dictionary, key_7, value_8);
            }
        }
        return v_dictionary;
    }

    /**
     *
     *
     * @unknown the DICTIONARY with the key-list entries added as keys and the
    the value-list entries added as the corresponding values.
     * @param KEY-LIST
     * 		listp of keys.
     * @param VALUE-LIST
     * 		listp of values.
     */
    @LispMethod(comment = "@unknown the DICTIONARY with the key-list entries added as keys and the\r\nthe value-list entries added as the corresponding values.\r\n@param KEY-LIST\r\n\t\tlistp of keys.\r\n@param VALUE-LIST\r\n\t\tlistp of values.")
    public static SubLObject add_values_from_lists_to_dictionary(final SubLObject key_list, final SubLObject value_list, SubLObject v_dictionary) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = NIL;
        }
        if (NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        }
        assert NIL != dictionary.dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
        assert NIL != listp(key_list) : "! listp(key_list) " + ("Types.listp(key_list) " + "CommonSymbols.NIL != Types.listp(key_list) ") + key_list;
        assert NIL != listp(value_list) : "! listp(value_list) " + ("Types.listp(value_list) " + "CommonSymbols.NIL != Types.listp(value_list) ") + value_list;
        SubLObject key = NIL;
        SubLObject key_$8 = NIL;
        SubLObject value = NIL;
        SubLObject value_$9 = NIL;
        key = key_list;
        key_$8 = key.first();
        value = value_list;
        value_$9 = value.first();
        while ((NIL != value) || (NIL != key)) {
            dictionary.dictionary_enter(v_dictionary, key_$8, value_$9);
            key = key.rest();
            key_$8 = key.first();
            value = value.rest();
            value_$9 = value.first();
        } 
        return v_dictionary;
    }

    public static final SubLObject dictionary_reverse_lookup_alt(SubLObject v_dictionary, SubLObject value, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject candidate_value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (value.equal(candidate_value)) {
                            return key;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return not_found;
        }
    }

    public static SubLObject dictionary_reverse_lookup(final SubLObject v_dictionary, final SubLObject value, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject candidate_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (value.equal(candidate_value)) {
                return key;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return not_found;
    }

    public static SubLObject dictionary_keys_with_value(final SubLObject v_dictionary, final SubLObject value, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject candidate_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (value.equal(candidate_value)) {
                result = cons(key, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (NIL != result) {
            return nreverse(result);
        }
        return not_found;
    }

    /**
     *
     *
     * @return BOOLEANP; Does DICTIONARY have an entry for KEY?
     */
    @LispMethod(comment = "@return BOOLEANP; Does DICTIONARY have an entry for KEY?")
    public static final SubLObject dictionary_has_keyP_alt(SubLObject v_dictionary, SubLObject key) {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), dictionary.dictionary_lookup(v_dictionary, key, UNPROVIDED));
    }

    /**
     *
     *
     * @return BOOLEANP; Does DICTIONARY have an entry for KEY?
     */
    @LispMethod(comment = "@return BOOLEANP; Does DICTIONARY have an entry for KEY?")
    public static SubLObject dictionary_has_keyP(final SubLObject v_dictionary, final SubLObject key) {
        return makeBoolean(!$key_missing$.getGlobalValue().eql(dictionary.dictionary_lookup_without_values(v_dictionary, key, $key_missing$.getGlobalValue())));
    }

    /**
     *
     *
     * @return BOOLEANP; Does DICTIONARY have an entry whose value is VALUE?
     */
    @LispMethod(comment = "@return BOOLEANP; Does DICTIONARY have an entry whose value is VALUE?")
    public static final SubLObject dictionary_has_valueP_alt(SubLObject v_dictionary, SubLObject value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject this_value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != funcall(test, this_value, value)) {
                            return T;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Does DICTIONARY have an entry whose value is VALUE?
     */
    @LispMethod(comment = "@return BOOLEANP; Does DICTIONARY have an entry whose value is VALUE?")
    public static SubLObject dictionary_has_valueP(final SubLObject v_dictionary, final SubLObject value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject this_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != funcall(test, this_value, value)) {
                return T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    /**
     *
     *
     * @return dictionary-p; TARGET-DICT is modified to contain each entry in SOURCE-DICT.
    If entries are already present in TARGET-DICT, they are overwritten.
     * @param WARN-ON-CONFLICTS?;
     * 		if non-nil, will warn on merge conflicts.
     */
    @LispMethod(comment = "@return dictionary-p; TARGET-DICT is modified to contain each entry in SOURCE-DICT.\r\nIf entries are already present in TARGET-DICT, they are overwritten.\r\n@param WARN-ON-CONFLICTS?;\r\n\t\tif non-nil, will warn on merge conflicts.")
    public static final SubLObject dictionary_nmerge_alt(SubLObject target_dict, SubLObject source_dict, SubLObject warn_on_conflictsP) {
        if (warn_on_conflictsP == UNPROVIDED) {
            warn_on_conflictsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_dict));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != warn_on_conflictsP) {
                            thread.resetMultipleValues();
                            {
                                SubLObject old_value = dictionary.dictionary_lookup(target_dict, key, UNPROVIDED);
                                SubLObject foundP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != foundP) {
                                    Errors.warn($str_alt68$Overwriting__s_from__s_to__s, key, old_value, value);
                                }
                            }
                        }
                        dictionary.dictionary_enter(target_dict, key, value);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return target_dict;
        }
    }

    /**
     *
     *
     * @return dictionary-p; TARGET-DICT is modified to contain each entry in SOURCE-DICT.
    If entries are already present in TARGET-DICT, they are overwritten.
     * @param WARN-ON-CONFLICTS?;
     * 		if non-nil, will warn on merge conflicts.
     */
    @LispMethod(comment = "@return dictionary-p; TARGET-DICT is modified to contain each entry in SOURCE-DICT.\r\nIf entries are already present in TARGET-DICT, they are overwritten.\r\n@param WARN-ON-CONFLICTS?;\r\n\t\tif non-nil, will warn on merge conflicts.")
    public static SubLObject dictionary_nmerge(final SubLObject target_dict, final SubLObject source_dict, SubLObject warn_on_conflictsP) {
        if (warn_on_conflictsP == UNPROVIDED) {
            warn_on_conflictsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != warn_on_conflictsP) {
                thread.resetMultipleValues();
                final SubLObject old_value = dictionary.dictionary_lookup(target_dict, key, UNPROVIDED);
                final SubLObject foundP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != foundP) {
                    Errors.warn($str60$Overwriting__s_from__s_to__s, key, old_value, value);
                }
            }
            dictionary.dictionary_enter(target_dict, key, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return target_dict;
    }

    /**
     *
     *
     * @return dictionary-p; Creates a new dictionary containing all entries
    from both TARGET-DICT and SOURCE-DICT.  If a key is found in both, the value
    from SOURCE-DICT will be used and the value from TARGET-DICT will be lost.
     * @param WARN-ON-CONFLICTS?;
     * 		if non-nil, will warn on merge conflicts.
     */
    @LispMethod(comment = "@return dictionary-p; Creates a new dictionary containing all entries\r\nfrom both TARGET-DICT and SOURCE-DICT.  If a key is found in both, the value\r\nfrom SOURCE-DICT will be used and the value from TARGET-DICT will be lost.\r\n@param WARN-ON-CONFLICTS?;\r\n\t\tif non-nil, will warn on merge conflicts.")
    public static final SubLObject dictionary_merge_alt(SubLObject target_dict, SubLObject source_dict, SubLObject warn_on_conflictsP) {
        if (warn_on_conflictsP == UNPROVIDED) {
            warn_on_conflictsP = NIL;
        }
        {
            SubLObject new_dict = copy_dictionary(target_dict);
            return dictionary_nmerge(new_dict, source_dict, warn_on_conflictsP);
        }
    }

    /**
     *
     *
     * @return dictionary-p; Creates a new dictionary containing all entries
    from both TARGET-DICT and SOURCE-DICT.  If a key is found in both, the value
    from SOURCE-DICT will be used and the value from TARGET-DICT will be lost.
     * @param WARN-ON-CONFLICTS?;
     * 		if non-nil, will warn on merge conflicts.
     */
    @LispMethod(comment = "@return dictionary-p; Creates a new dictionary containing all entries\r\nfrom both TARGET-DICT and SOURCE-DICT.  If a key is found in both, the value\r\nfrom SOURCE-DICT will be used and the value from TARGET-DICT will be lost.\r\n@param WARN-ON-CONFLICTS?;\r\n\t\tif non-nil, will warn on merge conflicts.")
    public static SubLObject dictionary_merge(final SubLObject target_dict, final SubLObject source_dict, SubLObject warn_on_conflictsP) {
        if (warn_on_conflictsP == UNPROVIDED) {
            warn_on_conflictsP = NIL;
        }
        final SubLObject new_dict = copy_dictionary(target_dict);
        return dictionary_nmerge(new_dict, source_dict, warn_on_conflictsP);
    }

    /**
     *
     *
     * @return NIL; Mutates the TARGET-DICT (whose values are lists) to contain merged
    value lists from both TARGET-DICT and SOURCE-DICT.  If a key is found in both,
    the value list from SOURCE-DICT will be merged (no new duplicates) with the value list
    from  TARGET-DICT. Value list order is not preserved. TEST is a predicate that tests value
    elements for equality and KEY-ACCESSOR is a function that represents the key field of
    the value element.
     */
    @LispMethod(comment = "@return NIL; Mutates the TARGET-DICT (whose values are lists) to contain merged\r\nvalue lists from both TARGET-DICT and SOURCE-DICT.  If a key is found in both,\r\nthe value list from SOURCE-DICT will be merged (no new duplicates) with the value list\r\nfrom  TARGET-DICT. Value list order is not preserved. TEST is a predicate that tests value\r\nelements for equality and KEY-ACCESSOR is a function that represents the key field of\r\nthe value element.")
    public static final SubLObject dictionary_merge_list_values_alt(SubLObject target_dict, SubLObject source_dict, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(target_dict, DICTIONARY_P);
            SubLTrampolineFile.checkType(source_dict, DICTIONARY_P);
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_dict));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value_list = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != dictionary.dictionary_lookup(target_dict, key, UNPROVIDED)) {
                            {
                                SubLObject cdolist_list_var = value_list;
                                SubLObject value = NIL;
                                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                                    dictionary_pushnew(target_dict, key, value, test, key_accessor);
                                }
                            }
                        } else {
                            dictionary.dictionary_enter(target_dict, key, value_list);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return NIL; Mutates the TARGET-DICT (whose values are lists) to contain merged
    value lists from both TARGET-DICT and SOURCE-DICT.  If a key is found in both,
    the value list from SOURCE-DICT will be merged (no new duplicates) with the value list
    from  TARGET-DICT. Value list order is not preserved. TEST is a predicate that tests value
    elements for equality and KEY-ACCESSOR is a function that represents the key field of
    the value element.
     */
    @LispMethod(comment = "@return NIL; Mutates the TARGET-DICT (whose values are lists) to contain merged\r\nvalue lists from both TARGET-DICT and SOURCE-DICT.  If a key is found in both,\r\nthe value list from SOURCE-DICT will be merged (no new duplicates) with the value list\r\nfrom  TARGET-DICT. Value list order is not preserved. TEST is a predicate that tests value\r\nelements for equality and KEY-ACCESSOR is a function that represents the key field of\r\nthe value element.")
    public static SubLObject dictionary_merge_list_values(final SubLObject target_dict, final SubLObject source_dict, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != dictionary.dictionary_p(target_dict) : "! dictionary.dictionary_p(target_dict) " + ("dictionary.dictionary_p(target_dict) " + "CommonSymbols.NIL != dictionary.dictionary_p(target_dict) ") + target_dict;
        assert NIL != dictionary.dictionary_p(source_dict) : "! dictionary.dictionary_p(source_dict) " + ("dictionary.dictionary_p(source_dict) " + "CommonSymbols.NIL != dictionary.dictionary_p(source_dict) ") + source_dict;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != dictionary.dictionary_lookup(target_dict, key, UNPROVIDED)) {
                SubLObject cdolist_list_var = value_list;
                SubLObject value = NIL;
                value = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    dictionary_pushnew(target_dict, key, value, test, key_accessor);
                    cdolist_list_var = cdolist_list_var.rest();
                    value = cdolist_list_var.first();
                } 
            } else {
                dictionary.dictionary_enter(target_dict, key, value_list);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    /**
     *
     *
     * @return dictionary-p; TARGET-DICT is modified to add the values of TARGET-DICT and SOURCE-DICT.
    Assumes numerical values.
     * @see dictionary-increment
     */
    @LispMethod(comment = "@return dictionary-p; TARGET-DICT is modified to add the values of TARGET-DICT and SOURCE-DICT.\r\nAssumes numerical values.\r\n@see dictionary-increment")
    public static final SubLObject dictionary_nsum_alt(SubLObject target_dict, SubLObject source_dict) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_dict));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        dictionary_increment(target_dict, key, value);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return target_dict;
        }
    }

    /**
     *
     *
     * @return dictionary-p; TARGET-DICT is modified to add the values of TARGET-DICT and SOURCE-DICT.
    Assumes numerical values.
     * @see dictionary-increment
     */
    @LispMethod(comment = "@return dictionary-p; TARGET-DICT is modified to add the values of TARGET-DICT and SOURCE-DICT.\r\nAssumes numerical values.\r\n@see dictionary-increment")
    public static SubLObject dictionary_nsum(final SubLObject target_dict, final SubLObject source_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(source_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary_increment(target_dict, key, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return target_dict;
    }

    /**
     *
     *
     * @return dictionary-p; Creates a new dictionary containing all keys
    from both TARGET-DICT and SOURCE-DICT, with their values being the sum of the values
    from TARGET-DICT and SOURCE-DICT.
     */
    @LispMethod(comment = "@return dictionary-p; Creates a new dictionary containing all keys\r\nfrom both TARGET-DICT and SOURCE-DICT, with their values being the sum of the values\r\nfrom TARGET-DICT and SOURCE-DICT.")
    public static final SubLObject dictionary_sum_alt(SubLObject target_dict, SubLObject source_dict) {
        {
            SubLObject new_dict = copy_dictionary(target_dict);
            return dictionary_nsum(new_dict, source_dict);
        }
    }

    /**
     *
     *
     * @return dictionary-p; Creates a new dictionary containing all keys
    from both TARGET-DICT and SOURCE-DICT, with their values being the sum of the values
    from TARGET-DICT and SOURCE-DICT.
     */
    @LispMethod(comment = "@return dictionary-p; Creates a new dictionary containing all keys\r\nfrom both TARGET-DICT and SOURCE-DICT, with their values being the sum of the values\r\nfrom TARGET-DICT and SOURCE-DICT.")
    public static SubLObject dictionary_sum(final SubLObject target_dict, final SubLObject source_dict) {
        final SubLObject new_dict = copy_dictionary(target_dict);
        return dictionary_nsum(new_dict, source_dict);
    }

    /**
     *
     *
     * @return boolean iff every element in small has a value in big that
    is equal under the equality constraints of TEST, which defaults
    to the dictionary test of SMALL.
    if A and B are the same dictionary, this check trivially succeeds
     */
    @LispMethod(comment = "@return boolean iff every element in small has a value in big that\r\nis equal under the equality constraints of TEST, which defaults\r\nto the dictionary test of SMALL.\r\nif A and B are the same dictionary, this check trivially succeeds")
    public static final SubLObject sub_dictionaryP_alt(SubLObject small, SubLObject big, SubLObject test) {
        if (test == UNPROVIDED) {
            test = dictionary.dictionary_test(small);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (small == big) {
                return T;
            }
            {
                SubLObject failP = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(small));
                while (!((NIL != failP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject small_value = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject big_value = dictionary.dictionary_lookup(big, key, $sub_dictionary_not_found$.getGlobalValue());
                            failP = makeBoolean(NIL == funcall(test, small_value, big_value));
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return makeBoolean(NIL == failP);
            }
        }
    }

    /**
     *
     *
     * @return boolean iff every element in small has a value in big that
    is equal under the equality constraints of TEST, which defaults
    to the dictionary test of SMALL.
    if A and B are the same dictionary, this check trivially succeeds
     */
    @LispMethod(comment = "@return boolean iff every element in small has a value in big that\r\nis equal under the equality constraints of TEST, which defaults\r\nto the dictionary test of SMALL.\r\nif A and B are the same dictionary, this check trivially succeeds")
    public static SubLObject sub_dictionaryP(final SubLObject small, final SubLObject big, SubLObject test) {
        if (test == UNPROVIDED) {
            test = dictionary.dictionary_test(small);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (small.eql(big)) {
            return T;
        }
        SubLObject failP;
        SubLObject iteration_state;
        SubLObject small_value;
        SubLObject big_value;
        for (failP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(small)); (NIL == failP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); failP = makeBoolean(NIL == funcall(test, small_value, big_value)) , iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            small_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            big_value = dictionary.dictionary_lookup(big, key, $sub_dictionary_not_found$.getGlobalValue());
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return makeBoolean(NIL == failP);
    }

    /**
     *
     *
     * @return boolean iff A and B contain the same values according to TEST
    for every key, and every key in A is also a key in B.
    if A and B denote the same object, then they are trivially co-extensional
     */
    @LispMethod(comment = "@return boolean iff A and B contain the same values according to TEST\r\nfor every key, and every key in A is also a key in B.\r\nif A and B denote the same object, then they are trivially co-extensional")
    public static final SubLObject dictionaries_coextensionalP_alt(SubLObject dict_a, SubLObject dict_b, SubLObject test) {
        if (test == UNPROVIDED) {
            test = dictionary.dictionary_test(dict_a);
        }
        if (dict_a == dict_b) {
            return T;
        }
        if (dictionary.dictionary_length(dict_a).numE(dictionary.dictionary_length(dict_b))) {
            return makeBoolean((NIL != sub_dictionaryP(dict_a, dict_b, test)) && (NIL != sub_dictionaryP(dict_b, dict_a, test)));
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean iff A and B contain the same values according to TEST
    for every key, and every key in A is also a key in B.
    if A and B denote the same object, then they are trivially co-extensional
     */
    @LispMethod(comment = "@return boolean iff A and B contain the same values according to TEST\r\nfor every key, and every key in A is also a key in B.\r\nif A and B denote the same object, then they are trivially co-extensional")
    public static SubLObject dictionaries_coextensionalP(final SubLObject dict_a, final SubLObject dict_b, SubLObject test) {
        if (test == UNPROVIDED) {
            test = dictionary.dictionary_test(dict_a);
        }
        if (dict_a.eql(dict_b)) {
            return T;
        }
        if (dictionary.dictionary_length(dict_a).numE(dictionary.dictionary_length(dict_b))) {
            return makeBoolean((NIL != sub_dictionaryP(dict_a, dict_b, test)) && (NIL != sub_dictionaryP(dict_b, dict_a, test)));
        }
        return NIL;
    }

    public static final SubLObject synchronized_dictionary_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_synchronized_dictionary(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject synchronized_dictionary_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_synchronized_dictionary(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject synchronized_dictionary_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.dictionary_utilities.$synchronized_dictionary_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject synchronized_dictionary_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.dictionary_utilities.$synchronized_dictionary_native.class ? T : NIL;
    }

    public static final SubLObject synchronized_dictionary_dictionary_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYNCHRONIZED_DICTIONARY_P);
        return v_object.getField2();
    }

    public static SubLObject synchronized_dictionary_dictionary(final SubLObject v_object) {
        assert NIL != synchronized_dictionary_p(v_object) : "! dictionary_utilities.synchronized_dictionary_p(v_object) " + "dictionary_utilities.synchronized_dictionary_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject synchronized_dictionary_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYNCHRONIZED_DICTIONARY_P);
        return v_object.getField3();
    }

    public static SubLObject synchronized_dictionary_lock(final SubLObject v_object) {
        assert NIL != synchronized_dictionary_p(v_object) : "! dictionary_utilities.synchronized_dictionary_p(v_object) " + "dictionary_utilities.synchronized_dictionary_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_synchronized_dictionary_dictionary_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYNCHRONIZED_DICTIONARY_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_synchronized_dictionary_dictionary(final SubLObject v_object, final SubLObject value) {
        assert NIL != synchronized_dictionary_p(v_object) : "! dictionary_utilities.synchronized_dictionary_p(v_object) " + "dictionary_utilities.synchronized_dictionary_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_synchronized_dictionary_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYNCHRONIZED_DICTIONARY_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_synchronized_dictionary_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != synchronized_dictionary_p(v_object) : "! dictionary_utilities.synchronized_dictionary_p(v_object) " + "dictionary_utilities.synchronized_dictionary_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_synchronized_dictionary_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.dictionary_utilities.$synchronized_dictionary_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($DICTIONARY)) {
                        _csetf_synchronized_dictionary_dictionary(v_new, current_value);
                    } else {
                        if (pcase_var.eql($LOCK)) {
                            _csetf_synchronized_dictionary_lock(v_new, current_value);
                        } else {
                            Errors.error($str_alt84$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_synchronized_dictionary(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.dictionary_utilities.$synchronized_dictionary_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($DICTIONARY)) {
                _csetf_synchronized_dictionary_dictionary(v_new, current_value);
            } else
                if (pcase_var.eql($LOCK)) {
                    _csetf_synchronized_dictionary_lock(v_new, current_value);
                } else {
                    Errors.error($str77$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_synchronized_dictionary(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SYNCHRONIZED_DICTIONARY, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $DICTIONARY, synchronized_dictionary_dictionary(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, synchronized_dictionary_lock(obj));
        funcall(visitor_fn, obj, $END, MAKE_SYNCHRONIZED_DICTIONARY, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_synchronized_dictionary_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_synchronized_dictionary(obj, visitor_fn);
    }

    public static final SubLObject new_synchronized_dictionary_alt(SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        {
            SubLObject sd = make_synchronized_dictionary(UNPROVIDED);
            _csetf_synchronized_dictionary_dictionary(sd, dictionary.new_dictionary(test, size));
            _csetf_synchronized_dictionary_lock(sd, make_lock($$$Synchronized_Dictionary_Lock));
            return sd;
        }
    }

    public static SubLObject new_synchronized_dictionary(SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        final SubLObject sd = make_synchronized_dictionary(UNPROVIDED);
        _csetf_synchronized_dictionary_dictionary(sd, dictionary.new_dictionary(test, size));
        _csetf_synchronized_dictionary_lock(sd, make_lock($$$Synchronized_Dictionary_Lock));
        return sd;
    }

    public static SubLObject synchronized_dictionary_test(final SubLObject synchronized_dictionary) {
        assert NIL != synchronized_dictionary_p(synchronized_dictionary) : "! dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + ("dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + "CommonSymbols.NIL != dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) ") + synchronized_dictionary;
        SubLObject test = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            test = dictionary.dictionary_test(synchronized_dictionary_dictionary(synchronized_dictionary));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return test;
    }

    public static final SubLObject print_synchronized_dictionary_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_9 = v_object;
                    SubLObject stream_10 = stream;
                    write_string($str_alt86$__, stream_10, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_9), new SubLObject[]{ $STREAM, stream_10 });
                    write_char(CHAR_space, stream_10);
                    {
                        SubLObject lock = synchronized_dictionary_lock(v_object);
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            format(stream, $str_alt88$DICTIONARY___A___LOCK___A__, dictionary.print_dictionary(synchronized_dictionary_dictionary(v_object), stream, depth), synchronized_dictionary_lock(v_object));
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                    }
                    write_char(CHAR_space, stream_10);
                    write(pointer(v_object_9), new SubLObject[]{ $STREAM, stream_10, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_10);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_synchronized_dictionary(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            final SubLObject lock = synchronized_dictionary_lock(v_object);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                format(stream, $str84$DICTIONARY___A___LOCK___A__, dictionary.print_dictionary(synchronized_dictionary_dictionary(v_object), stream, depth), synchronized_dictionary_lock(v_object));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject clear_synchronized_dictionary_alt(SubLObject synchronized_dictionary) {
        SubLTrampolineFile.checkType(synchronized_dictionary, SYNCHRONIZED_DICTIONARY_P);
        {
            SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary.clear_dictionary(synchronized_dictionary_dictionary(synchronized_dictionary));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return synchronized_dictionary;
    }

    public static SubLObject clear_synchronized_dictionary(final SubLObject synchronized_dictionary) {
        assert NIL != synchronized_dictionary_p(synchronized_dictionary) : "! dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + ("dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + "CommonSymbols.NIL != dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) ") + synchronized_dictionary;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            dictionary.clear_dictionary(synchronized_dictionary_dictionary(synchronized_dictionary));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return synchronized_dictionary;
    }

    public static final SubLObject synchronized_dictionary_enter_alt(SubLObject synchronized_dictionary, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(synchronized_dictionary, SYNCHRONIZED_DICTIONARY_P);
        {
            SubLObject result = NIL;
            SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = dictionary.dictionary_enter(synchronized_dictionary_dictionary(synchronized_dictionary), key, value);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static SubLObject synchronized_dictionary_enter(final SubLObject synchronized_dictionary, final SubLObject key, final SubLObject value) {
        assert NIL != synchronized_dictionary_p(synchronized_dictionary) : "! dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + ("dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + "CommonSymbols.NIL != dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) ") + synchronized_dictionary;
        SubLObject result = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = dictionary.dictionary_enter(synchronized_dictionary_dictionary(synchronized_dictionary), key, value);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject synchronized_dictionary_enter_unless(final SubLObject synchronized_dictionary, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        assert NIL != synchronized_dictionary_p(synchronized_dictionary) : "! dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + ("dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + "CommonSymbols.NIL != dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) ") + synchronized_dictionary;
        SubLObject result = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            if (NIL == funcall(test_func, synchronized_dictionary_lookup(synchronized_dictionary, key, UNPROVIDED))) {
                result = dictionary.dictionary_enter(synchronized_dictionary_dictionary(synchronized_dictionary), key, value);
                return result;
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return $NOT_SET;
    }

    public static final SubLObject synchronized_dictionary_remove_alt(SubLObject synchronized_dictionary, SubLObject key) {
        SubLTrampolineFile.checkType(synchronized_dictionary, SYNCHRONIZED_DICTIONARY_P);
        {
            SubLObject result = NIL;
            SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = dictionary.dictionary_remove(synchronized_dictionary_dictionary(synchronized_dictionary), key);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static SubLObject synchronized_dictionary_remove(final SubLObject synchronized_dictionary, final SubLObject key) {
        assert NIL != synchronized_dictionary_p(synchronized_dictionary) : "! dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + ("dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + "CommonSymbols.NIL != dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) ") + synchronized_dictionary;
        SubLObject result = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = dictionary.dictionary_remove(synchronized_dictionary_dictionary(synchronized_dictionary), key);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static final SubLObject synchronized_dictionary_lookup_alt(SubLObject synchronized_dictionary, SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        SubLTrampolineFile.checkType(synchronized_dictionary, SYNCHRONIZED_DICTIONARY_P);
        {
            SubLObject result = NIL;
            SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = dictionary.dictionary_lookup(synchronized_dictionary_dictionary(synchronized_dictionary), key, not_found);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static SubLObject synchronized_dictionary_lookup(final SubLObject synchronized_dictionary, final SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        assert NIL != synchronized_dictionary_p(synchronized_dictionary) : "! dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + ("dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + "CommonSymbols.NIL != dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) ") + synchronized_dictionary;
        SubLObject result = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = dictionary.dictionary_lookup(synchronized_dictionary_dictionary(synchronized_dictionary), key, not_found);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject synchronized_dictionary_lookup_without_values(final SubLObject synchronized_dictionary, final SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        assert NIL != synchronized_dictionary_p(synchronized_dictionary) : "! dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + ("dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + "CommonSymbols.NIL != dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) ") + synchronized_dictionary;
        SubLObject result = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = dictionary.dictionary_lookup_without_values(synchronized_dictionary_dictionary(synchronized_dictionary), key, not_found);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static final SubLObject synchronized_dictionary_push_alt(SubLObject synchronized_dictionary, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(synchronized_dictionary, SYNCHRONIZED_DICTIONARY_P);
        {
            SubLObject result = NIL;
            SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = dictionary_push(synchronized_dictionary_dictionary(synchronized_dictionary), key, value);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static SubLObject synchronized_dictionary_push(final SubLObject synchronized_dictionary, final SubLObject key, final SubLObject value) {
        assert NIL != synchronized_dictionary_p(synchronized_dictionary) : "! dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + ("dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + "CommonSymbols.NIL != dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) ") + synchronized_dictionary;
        SubLObject result = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = dictionary_push(synchronized_dictionary_dictionary(synchronized_dictionary), key, value);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static final SubLObject synchronized_dictionary_delete_from_value_alt(SubLObject synchronized_dictionary, SubLObject key, SubLObject elt, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(synchronized_dictionary, SYNCHRONIZED_DICTIONARY_P);
        {
            SubLObject result = NIL;
            SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = dictionary_delete_from_value(synchronized_dictionary_dictionary(synchronized_dictionary), key, elt, test, key_accessor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static SubLObject synchronized_dictionary_delete_from_value(final SubLObject synchronized_dictionary, final SubLObject key, final SubLObject elt, SubLObject test, SubLObject key_accessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_accessor == UNPROVIDED) {
            key_accessor = symbol_function(IDENTITY);
        }
        assert NIL != synchronized_dictionary_p(synchronized_dictionary) : "! dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + ("dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) " + "CommonSymbols.NIL != dictionary_utilities.synchronized_dictionary_p(synchronized_dictionary) ") + synchronized_dictionary;
        SubLObject result = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = dictionary_delete_from_value(synchronized_dictionary_dictionary(synchronized_dictionary), key, elt, test, key_accessor);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    /**
     * Returns a list of the given SYNCHRONIZED-DICTIONARY's keys.
     */
    @LispMethod(comment = "Returns a list of the given SYNCHRONIZED-DICTIONARY\'s keys.")
    public static final SubLObject synchronized_dictionary_keys_alt(SubLObject synchronized_dictionary) {
        {
            SubLObject keys = NIL;
            SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                keys = dictionary.dictionary_keys(synchronized_dictionary_dictionary(synchronized_dictionary));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return keys;
        }
    }

    @LispMethod(comment = "Returns a list of the given SYNCHRONIZED-DICTIONARY\'s keys.")
    public static SubLObject synchronized_dictionary_keys(final SubLObject synchronized_dictionary) {
        SubLObject keys = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            keys = dictionary.dictionary_keys(synchronized_dictionary_dictionary(synchronized_dictionary));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return keys;
    }

    public static SubLObject synchronized_dictionary_values(final SubLObject synchronized_dictionary) {
        SubLObject values = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            values = dictionary.dictionary_values(synchronized_dictionary_dictionary(synchronized_dictionary));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return values;
    }

    public static SubLObject synchronized_dictionary_length(final SubLObject synchronized_dictionary) {
        SubLObject size = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            size = dictionary.dictionary_length(synchronized_dictionary_dictionary(synchronized_dictionary));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return size;
    }

    public static SubLObject synchronized_dictionary_arbitrary_key(final SubLObject synchronized_dictionary) {
        SubLObject key = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            key = dictionary_arbitrary_key(synchronized_dictionary_dictionary(synchronized_dictionary));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return key;
    }

    public static SubLObject new_synchronized_dictionary_iterator(final SubLObject synchronized_dictionary) {
        SubLObject replica = NIL;
        final SubLObject lock = synchronized_dictionary_lock(synchronized_dictionary);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            replica = copy_dictionary(synchronized_dictionary_dictionary(synchronized_dictionary));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return dictionary.new_dictionary_iterator(replica);
    }

    public static SubLObject is_map_object_p_synchronized_dictionary_method(final SubLObject v_object) {
        return T;
    }

    public static SubLObject map_object_size_synchronized_dictionary_method(final SubLObject v_object) {
        return synchronized_dictionary_length(v_object);
    }

    public static SubLObject map_object_test_synchronized_dictionary_method(final SubLObject v_object) {
        return synchronized_dictionary_test(v_object);
    }

    public static SubLObject map_object_put_synchronized_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return synchronized_dictionary_enter(v_object, key, value);
    }

    public static SubLObject map_object_put_unless_synchronized_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject value, final SubLObject test_func) {
        return synchronized_dictionary_enter_unless(v_object, key, value, test_func);
    }

    public static SubLObject map_object_get_synchronized_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return synchronized_dictionary_lookup(v_object, key, not_found);
    }

    public static SubLObject map_object_get_without_values_synchronized_dictionary_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return synchronized_dictionary_lookup_without_values(v_object, key, not_found);
    }

    public static SubLObject map_object_remove_synchronized_dictionary_method(final SubLObject v_object, final SubLObject key) {
        return synchronized_dictionary_remove(v_object, key);
    }

    public static SubLObject new_map_object_with_same_properties_synchronized_dictionary_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return new_synchronized_dictionary(test, size);
    }

    public static SubLObject map_object_arbitrary_key_synchronized_dictionary_method(final SubLObject v_object) {
        return synchronized_dictionary_arbitrary_key(v_object);
    }

    public static SubLObject new_map_object_iterator_synchronized_dictionary_method(final SubLObject v_object) {
        return new_synchronized_dictionary_iterator(v_object);
    }

    public static SubLObject map_object_remove_all_synchronized_dictionary_method(final SubLObject v_object) {
        return clear_synchronized_dictionary(v_object);
    }

    public static SubLObject map_object_keys_synchronized_dictionary_method(final SubLObject v_object) {
        return synchronized_dictionary_keys(v_object);
    }

    public static SubLObject map_object_values_synchronized_dictionary_method(final SubLObject v_object) {
        return synchronized_dictionary_values(v_object);
    }

    public static final SubLObject test_timings_of_alist_of_size_alt(SubLObject size, SubLObject repetitions) {
        {
            SubLObject the_alist = NIL;
            SubLObject v_timing = NIL;
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                    the_alist = list_utilities.alist_enter(the_alist, constants_high.find_constant_by_internal_id(i), i, UNPROVIDED);
                }
            }
            {
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject cdotimes_end_var = divide(repetitions, size);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject j = NIL;
                            for (j = ZERO_INTEGER; j.numL(size); j = add(j, ONE_INTEGER)) {
                                {
                                    SubLObject value = list_utilities.alist_lookup(the_alist, constants_high.find_constant_by_internal_id(j), UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                v_timing = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            }
            return v_timing;
        }
    }

    public static SubLObject test_timings_of_alist_of_size(final SubLObject size, final SubLObject repetitions) {
        SubLObject the_alist = NIL;
        SubLObject v_timing = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            the_alist = list_utilities.alist_enter(the_alist, constants_high.find_constant_by_internal_id(i), i, UNPROVIDED);
        }
        final SubLObject time_var = get_internal_real_time();
        SubLObject cdotimes_end_var;
        SubLObject j;
        SubLObject k;
        SubLObject value;
        for (cdotimes_end_var = divide(repetitions, size), j = NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var); j = add(j, ONE_INTEGER)) {
            for (k = NIL, k = ZERO_INTEGER; k.numL(size); k = add(k, ONE_INTEGER)) {
                value = list_utilities.alist_lookup(the_alist, constants_high.find_constant_by_internal_id(k), UNPROVIDED, UNPROVIDED);
            }
        }
        v_timing = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return v_timing;
    }

    public static final SubLObject test_timings_of_hashtable_of_size_alt(SubLObject size, SubLObject repetitions) {
        {
            SubLObject the_hashtable = make_hash_table(size, EQ, UNPROVIDED);
            SubLObject v_timing = NIL;
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                    sethash(constants_high.find_constant_by_internal_id(i), the_hashtable, i);
                }
            }
            {
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject cdotimes_end_var = divide(repetitions, size);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject j = NIL;
                            for (j = ZERO_INTEGER; j.numL(size); j = add(j, ONE_INTEGER)) {
                                {
                                    SubLObject value = gethash(constants_high.find_constant_by_internal_id(j), the_hashtable, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
                v_timing = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            }
            return v_timing;
        }
    }

    public static SubLObject test_timings_of_hashtable_of_size(final SubLObject size, final SubLObject repetitions) {
        final SubLObject the_hashtable = make_hash_table(size, EQ, UNPROVIDED);
        SubLObject v_timing = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            sethash(constants_high.find_constant_by_internal_id(i), the_hashtable, i);
        }
        final SubLObject time_var = get_internal_real_time();
        SubLObject cdotimes_end_var;
        SubLObject j;
        SubLObject k;
        SubLObject value;
        for (cdotimes_end_var = divide(repetitions, size), j = NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var); j = add(j, ONE_INTEGER)) {
            for (k = NIL, k = ZERO_INTEGER; k.numL(size); k = add(k, ONE_INTEGER)) {
                value = gethash(constants_high.find_constant_by_internal_id(k), the_hashtable, UNPROVIDED);
            }
        }
        v_timing = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return v_timing;
    }

    public static final SubLObject estimate_optimal_dictionary_watermark_alt(SubLObject max_size, SubLObject repetitions) {
        if (max_size == UNPROVIDED) {
            max_size = $int$50;
        }
        if (repetitions == UNPROVIDED) {
            repetitions = $int$3000000;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = MINUS_ONE_INTEGER;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(max_size); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject size = add(TWO_INTEGER, i);
                        SubLObject alist_timings = test_timings_of_alist_of_size(size, repetitions);
                        SubLObject hashtable_timings = test_timings_of_hashtable_of_size(size, repetitions);
                        format(T, $str_alt92$Testing_size__A_ALIST__A_HASHTABL, new SubLObject[]{ size, alist_timings, hashtable_timings });
                        force_output(StreamsLow.$terminal_io$.getDynamicValue(thread));
                        if (result.numE(MINUS_ONE_INTEGER) && hashtable_timings.numL(alist_timings)) {
                            result = size;
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject estimate_optimal_dictionary_watermark(SubLObject max_size, SubLObject repetitions) {
        if (max_size == UNPROVIDED) {
            max_size = $int$50;
        }
        if (repetitions == UNPROVIDED) {
            repetitions = $int$3000000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = MINUS_ONE_INTEGER;
        SubLObject i;
        SubLObject size;
        SubLObject alist_timings;
        SubLObject hashtable_timings;
        for (i = NIL, i = ZERO_INTEGER; i.numL(max_size); i = add(i, ONE_INTEGER)) {
            size = add(TWO_INTEGER, i);
            alist_timings = test_timings_of_alist_of_size(size, repetitions);
            hashtable_timings = test_timings_of_hashtable_of_size(size, repetitions);
            format(T, $str103$Testing_size__A_ALIST__A_HASHTABL, new SubLObject[]{ size, alist_timings, hashtable_timings });
            force_output(StreamsLow.$terminal_io$.getDynamicValue(thread));
            if (result.numE(MINUS_ONE_INTEGER) && hashtable_timings.numL(alist_timings)) {
                result = size;
            }
        }
        return result;
    }

    static private final SubLString $str_alt1$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to push values on a non listp ~a.~%");

    static private final SubLString $str_alt3$Corrupted_dictionary_contents__at = makeString("Corrupted dictionary-contents; attempting to push values on a non listp ~a.~%");

    static private final SubLString $str_alt4$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to pop a value from a non listp ~a.~%");

    /**
     * Tests whether the dictionary correctly conflates keys.
     */
    @LispMethod(comment = "Tests whether the dictionary correctly conflates keys.")
    public static final SubLObject test_dictionary_key_conflation_alt(SubLObject test, SubLObject raw_items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_dictionary = dictionary.new_dictionary(test, UNPROVIDED);
                SubLObject unique_items = remove_duplicates(raw_items, test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = raw_items;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    dictionary.dictionary_enter(v_dictionary, item, $PRESENT);
                }
                {
                    SubLObject expected = length(unique_items);
                    SubLObject actual = dictionary.dictionary_length(v_dictionary);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!expected.numE(actual)) {
                            Errors.error($str_alt96$Expected__A_entries__but_got__A_, expected, actual);
                        }
                    }
                }
            }
            return $SUCCESS;
        }
    }

    @LispMethod(comment = "Tests whether the dictionary correctly conflates keys.")
    public static SubLObject test_dictionary_key_conflation(final SubLObject test, final SubLObject raw_items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_dictionary = dictionary.new_dictionary(test, UNPROVIDED);
        final SubLObject unique_items = remove_duplicates(raw_items, test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = raw_items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary.dictionary_enter(v_dictionary, item, $PRESENT);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        final SubLObject expected = length(unique_items);
        final SubLObject actual = dictionary.dictionary_length(v_dictionary);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected.numE(actual))) {
            Errors.error($str117$Expected__A_entries__but_got__A_, expected, actual);
        }
        return $SUCCESS;
    }

    static private final SubLString $str_alt7$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to add values on a non-listp ~a.~%");

    static private final SubLString $str_alt9$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to append to a non listp ~a.~%");

    static private final SubLString $str_alt10$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to union with a non listp ~a.~%");

    static private final SubLString $str_alt11$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to remove values from a non listp ~a.~%");

    static private final SubLString $str_alt12$Corrupted_dictionary__attempting_ = makeString("Corrupted dictionary; attempting to delete values from a non listp ~a.~%");

    static private final SubLList $list_alt17 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLList $list_alt18 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("DICT-EXPRESSION"), makeSymbol("COLLECTION-VAR")), makeSymbol("ITERATED-EXPRESSION"));

    public static SubLObject test_hashtable_speed(final SubLObject initial_size, final SubLObject sethash_count, final SubLObject do_count) {
        final SubLObject hash = make_hash_table(initial_size, UNPROVIDED, UNPROVIDED);
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(sethash_count); n = add(n, ONE_INTEGER)) {
            sethash(n, hash, n);
        }
        SubLObject k;
        SubLObject v;
        Iterator cdohash_iterator;
        Map.Entry cdohash_entry;
        for (n = NIL, n = ZERO_INTEGER; n.numL(do_count); n = add(n, ONE_INTEGER)) {
            k = NIL;
            v = NIL;
            cdohash_iterator = getEntrySetIterator(hash);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    k = getEntryKey(cdohash_entry);
                    v = getEntryValue(cdohash_entry);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return NIL;
    }

    static private final SubLList $list_alt22 = list(NIL);

    static private final SubLList $list_alt29 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("NUMVAR"), makeSymbol("DICTIONARY"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt30 = list(ZERO_INTEGER);

    static private final SubLString $str_alt33$_S_____S__ = makeString("~S -> ~S~%");

    static private final SubLString $str_alt34$_S____ = makeString("~S -> ");

    static private final SubLString $str_alt35$_S__ = makeString("~S~%");

    static private final SubLString $str_alt37$_csv = makeString(".csv");

    static private final SubLString $str_alt42$_A___A__ = makeString("~A, ~A~%");

    public static SubLObject test_dictionary_speed(final SubLObject initial_size, final SubLObject sethash_count, final SubLObject do_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQL), initial_size);
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(sethash_count); n = add(n, ONE_INTEGER)) {
            dictionary.dictionary_enter(dict, n, n);
        }
        SubLObject iteration_state;
        SubLObject k;
        SubLObject v;
        for (n = NIL, n = ZERO_INTEGER; n.numL(do_count); n = add(n, ONE_INTEGER)) {
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                k = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                v = thread.secondMultipleValue();
                thread.resetMultipleValues();
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return NIL;
    }

    static private final SubLString $str_alt43$_S___S__ = makeString("~S, ~S~%");

    static private final SubLList $list_alt45 = list(makeSymbol("DICTIONARY"), makeSymbol("PREDICATE"), makeSymbol("KEY"));

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt54 = list(list(list(list(cons(makeString("eins"), ONE_INTEGER), cons(makeString("zwei"), TWO_INTEGER), cons(makeString("drei"), THREE_INTEGER), cons(makeString("vier"), FOUR_INTEGER), cons(makeString("fuenf"), FIVE_INTEGER), cons(makeString("sechs"), SIX_INTEGER)), makeSymbol("<")), list(makeString("eins"), makeString("zwei"), makeString("drei"), makeString("vier"), makeString("fuenf"), makeString("sechs"))), list(list(list(cons(makeString("one"), ONE_INTEGER), cons(makeString("two"), TWO_INTEGER), cons(makeString("three"), THREE_INTEGER), cons(makeString("four"), FOUR_INTEGER), cons(makeString("five"), FIVE_INTEGER), cons(makeString("six"), SIX_INTEGER)), makeSymbol(">")), list(makeString("six"), makeString("five"), makeString("four"), makeString("three"), makeString("two"), makeString("one"))), list(list(list(list(makeString("un"), ONE_INTEGER), list(makeString("deux"), TWO_INTEGER), list(makeString("trois"), THREE_INTEGER), list(makeString("quatre"), FOUR_INTEGER), list(makeString("cinq"), FIVE_INTEGER), list(makeString("seize"), SIX_INTEGER)), makeSymbol(">"), makeSymbol("FIRST")), list(makeString("seize"), makeString("cinq"), makeString("quatre"), makeString("trois"), makeString("deux"), makeString("un"))));

    public static SubLObject declare_dictionary_utilities_file() {
        declareFunction("dictionary_arbitrary_key", "DICTIONARY-ARBITRARY-KEY", 1, 0, false);
        declareFunction("copy_dictionary", "COPY-DICTIONARY", 1, 0, false);
        declareFunction("copy_dictionary_recursive", "COPY-DICTIONARY-RECURSIVE", 1, 0, false);
        declareFunction("dictionary_pop", "DICTIONARY-POP", 2, 0, false);
        declareFunction("dictionary_push", "DICTIONARY-PUSH", 3, 0, false);
        declareFunction("dictionary_contents_push", "DICTIONARY-CONTENTS-PUSH", 4, 0, false);
        declareFunction("dictionary_pop_from_value", "DICTIONARY-POP-FROM-VALUE", 2, 0, false);
        declareFunction("dictionary_pushnew", "DICTIONARY-PUSHNEW", 3, 2, false);
        declareFunction("dictionary_add_to_value_sorted", "DICTIONARY-ADD-TO-VALUE-SORTED", 3, 2, false);
        declareFunction("dictionary_append", "DICTIONARY-APPEND", 3, 0, false);
        declareFunction("dictionary_union", "DICTIONARY-UNION", 3, 2, false);
        declareFunction("dictionary_getf", "DICTIONARY-GETF", 3, 1, false);
        declareFunction("dictionary_putf", "DICTIONARY-PUTF", 4, 0, false);
        declareFunction("dictionary_remove_from_value", "DICTIONARY-REMOVE-FROM-VALUE", 3, 2, false);
        declareFunction("dictionary_delete_from_value", "DICTIONARY-DELETE-FROM-VALUE", 3, 2, false);
        declareFunction("dictionary_delete_first_from_value", "DICTIONARY-DELETE-FIRST-FROM-VALUE", 3, 1, false);
        declareFunction("dictionary_delete_items_from_value", "DICTIONARY-DELETE-ITEMS-FROM-VALUE", 3, 2, false);
        declareFunction("dictionary_increment", "DICTIONARY-INCREMENT", 2, 1, false);
        declareFunction("dictionary_decrement", "DICTIONARY-DECREMENT", 2, 1, false);
        declareFunction("dictionary_decrement_and_remove_if", "DICTIONARY-DECREMENT-AND-REMOVE-IF", 2, 2, false);
        declareFunction("dictionary_extremal", "DICTIONARY-EXTREMAL", 2, 0, false);
        declareFunction("dictionary_total", "DICTIONARY-TOTAL", 1, 0, false);
        declareFunction("dictionary_to_alist", "DICTIONARY-TO-ALIST", 1, 0, false);
        declareFunction("new_dictionary_from_alist", "NEW-DICTIONARY-FROM-ALIST", 1, 1, false);
        declareFunction("dictionary_to_tuples", "DICTIONARY-TO-TUPLES", 1, 0, false);
        declareFunction("dictionary_to_paired_lists", "DICTIONARY-TO-PAIRED-LISTS", 1, 0, false);
        declareFunction("new_dictionary_from_paired_lists_unique", "NEW-DICTIONARY-FROM-PAIRED-LISTS-UNIQUE", 2, 1, false);
        declareFunction("new_dictionary_from_paired_lists_push", "NEW-DICTIONARY-FROM-PAIRED-LISTS-PUSH", 2, 1, false);
        declareFunction("new_classification_dictionary", "NEW-CLASSIFICATION-DICTIONARY", 2, 1, false);
        declareMacro("do_dictionary_accumulating", "DO-DICTIONARY-ACCUMULATING");
        declareFunction("make_dictionary_from_text", "MAKE-DICTIONARY-FROM-TEXT", 1, 0, false);
        declareMacro("do_dictionary_numbered", "DO-DICTIONARY-NUMBERED");
        declareFunction("print_dictionary_contents", "PRINT-DICTIONARY-CONTENTS", 1, 1, false);
        declareFunction("print_dictionary_contents_wX_dictionary_values", "PRINT-DICTIONARY-CONTENTS-W/-DICTIONARY-VALUES", 1, 1, false);
        declareFunction("print_dictionary_contents_wX_hashtable_values", "PRINT-DICTIONARY-CONTENTS-W/-HASHTABLE-VALUES", 1, 1, false);
        declareFunction("print_dictionary_contents_to_csv", "PRINT-DICTIONARY-CONTENTS-TO-CSV", 2, 2, false);
        declareFunction("new_dictionary_from_csv", "NEW-DICTIONARY-FROM-CSV", 1, 3, false);
        declareFunction("sort_dictionary_by_keys", "SORT-DICTIONARY-BY-KEYS", 2, 0, false);
        declareFunction("sort_dictionary_by_values", "SORT-DICTIONARY-BY-VALUES", 2, 0, false);
        declareFunction("dictionary_keys_sorted_by_values", "DICTIONARY-KEYS-SORTED-BY-VALUES", 2, 1, false);
        declareFunction("dictionary_keys_sorter_comparison_predicate", "DICTIONARY-KEYS-SORTER-COMPARISON-PREDICATE", 2, 0, false);
        declareFunction("test_dictionary_keys_sorted_by_values", "TEST-DICTIONARY-KEYS-SORTED-BY-VALUES", 2, 1, false);
        declareFunction("map_dictionary_values", "MAP-DICTIONARY-VALUES", 2, 0, false);
        declareFunction("test_map_dictionary_values", "TEST-MAP-DICTIONARY-VALUES", 3, 0, false);
        declareFunction("partition_dictionary_keys_into_n_tiles", "PARTITION-DICTIONARY-KEYS-INTO-N-TILES", 2, 1, false);
        declareMacro("do_dictionary_keys", "DO-DICTIONARY-KEYS");
        declareMacro("do_dictionary_values", "DO-DICTIONARY-VALUES");
        declareFunction("add_tuple_list_to_dictionary", "ADD-TUPLE-LIST-TO-DICTIONARY", 1, 1, false);
        declareFunction("add_values_from_lists_to_dictionary", "ADD-VALUES-FROM-LISTS-TO-DICTIONARY", 2, 1, false);
        declareFunction("dictionary_reverse_lookup", "DICTIONARY-REVERSE-LOOKUP", 2, 1, false);
        declareFunction("dictionary_keys_with_value", "DICTIONARY-KEYS-WITH-VALUE", 2, 1, false);
        declareFunction("dictionary_has_keyP", "DICTIONARY-HAS-KEY?", 2, 0, false);
        declareFunction("dictionary_has_valueP", "DICTIONARY-HAS-VALUE?", 2, 1, false);
        declareFunction("dictionary_nmerge", "DICTIONARY-NMERGE", 2, 1, false);
        declareFunction("dictionary_merge", "DICTIONARY-MERGE", 2, 1, false);
        declareFunction("dictionary_merge_list_values", "DICTIONARY-MERGE-LIST-VALUES", 2, 2, false);
        declareFunction("dictionary_nsum", "DICTIONARY-NSUM", 2, 0, false);
        declareFunction("dictionary_sum", "DICTIONARY-SUM", 2, 0, false);
        declareFunction("sub_dictionaryP", "SUB-DICTIONARY?", 2, 1, false);
        declareFunction("dictionaries_coextensionalP", "DICTIONARIES-COEXTENSIONAL?", 2, 1, false);
        declareFunction("synchronized_dictionary_print_function_trampoline", "SYNCHRONIZED-DICTIONARY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("synchronized_dictionary_p", "SYNCHRONIZED-DICTIONARY-P", 1, 0, false);
        new dictionary_utilities.$synchronized_dictionary_p$UnaryFunction();
        declareFunction("synchronized_dictionary_dictionary", "SYNCHRONIZED-DICTIONARY-DICTIONARY", 1, 0, false);
        declareFunction("synchronized_dictionary_lock", "SYNCHRONIZED-DICTIONARY-LOCK", 1, 0, false);
        declareFunction("_csetf_synchronized_dictionary_dictionary", "_CSETF-SYNCHRONIZED-DICTIONARY-DICTIONARY", 2, 0, false);
        declareFunction("_csetf_synchronized_dictionary_lock", "_CSETF-SYNCHRONIZED-DICTIONARY-LOCK", 2, 0, false);
        declareFunction("make_synchronized_dictionary", "MAKE-SYNCHRONIZED-DICTIONARY", 0, 1, false);
        declareFunction("visit_defstruct_synchronized_dictionary", "VISIT-DEFSTRUCT-SYNCHRONIZED-DICTIONARY", 2, 0, false);
        declareFunction("visit_defstruct_object_synchronized_dictionary_method", "VISIT-DEFSTRUCT-OBJECT-SYNCHRONIZED-DICTIONARY-METHOD", 2, 0, false);
        declareFunction("new_synchronized_dictionary", "NEW-SYNCHRONIZED-DICTIONARY", 0, 2, false);
        declareFunction("synchronized_dictionary_test", "SYNCHRONIZED-DICTIONARY-TEST", 1, 0, false);
        declareFunction("print_synchronized_dictionary", "PRINT-SYNCHRONIZED-DICTIONARY", 3, 0, false);
        declareFunction("clear_synchronized_dictionary", "CLEAR-SYNCHRONIZED-DICTIONARY", 1, 0, false);
        declareFunction("synchronized_dictionary_enter", "SYNCHRONIZED-DICTIONARY-ENTER", 3, 0, false);
        declareFunction("synchronized_dictionary_enter_unless", "SYNCHRONIZED-DICTIONARY-ENTER-UNLESS", 4, 0, false);
        declareFunction("synchronized_dictionary_remove", "SYNCHRONIZED-DICTIONARY-REMOVE", 2, 0, false);
        declareFunction("synchronized_dictionary_lookup", "SYNCHRONIZED-DICTIONARY-LOOKUP", 2, 1, false);
        declareFunction("synchronized_dictionary_lookup_without_values", "SYNCHRONIZED-DICTIONARY-LOOKUP-WITHOUT-VALUES", 2, 1, false);
        declareFunction("synchronized_dictionary_push", "SYNCHRONIZED-DICTIONARY-PUSH", 3, 0, false);
        declareFunction("synchronized_dictionary_delete_from_value", "SYNCHRONIZED-DICTIONARY-DELETE-FROM-VALUE", 3, 2, false);
        declareFunction("synchronized_dictionary_keys", "SYNCHRONIZED-DICTIONARY-KEYS", 1, 0, false);
        declareFunction("synchronized_dictionary_values", "SYNCHRONIZED-DICTIONARY-VALUES", 1, 0, false);
        declareFunction("synchronized_dictionary_length", "SYNCHRONIZED-DICTIONARY-LENGTH", 1, 0, false);
        declareFunction("synchronized_dictionary_arbitrary_key", "SYNCHRONIZED-DICTIONARY-ARBITRARY-KEY", 1, 0, false);
        declareFunction("new_synchronized_dictionary_iterator", "NEW-SYNCHRONIZED-DICTIONARY-ITERATOR", 1, 0, false);
        declareFunction("is_map_object_p_synchronized_dictionary_method", "IS-MAP-OBJECT-P-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("map_object_size_synchronized_dictionary_method", "MAP-OBJECT-SIZE-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("map_object_test_synchronized_dictionary_method", "MAP-OBJECT-TEST-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("map_object_put_synchronized_dictionary_method", "MAP-OBJECT-PUT-SYNCHRONIZED-DICTIONARY-METHOD", 3, 0, false);
        declareFunction("map_object_put_unless_synchronized_dictionary_method", "MAP-OBJECT-PUT-UNLESS-SYNCHRONIZED-DICTIONARY-METHOD", 4, 0, false);
        declareFunction("map_object_get_synchronized_dictionary_method", "MAP-OBJECT-GET-SYNCHRONIZED-DICTIONARY-METHOD", 3, 0, false);
        declareFunction("map_object_get_without_values_synchronized_dictionary_method", "MAP-OBJECT-GET-WITHOUT-VALUES-SYNCHRONIZED-DICTIONARY-METHOD", 3, 0, false);
        declareFunction("map_object_remove_synchronized_dictionary_method", "MAP-OBJECT-REMOVE-SYNCHRONIZED-DICTIONARY-METHOD", 2, 0, false);
        declareFunction("new_map_object_with_same_properties_synchronized_dictionary_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-SYNCHRONIZED-DICTIONARY-METHOD", 3, 0, false);
        declareFunction("map_object_arbitrary_key_synchronized_dictionary_method", "MAP-OBJECT-ARBITRARY-KEY-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("new_map_object_iterator_synchronized_dictionary_method", "NEW-MAP-OBJECT-ITERATOR-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("map_object_remove_all_synchronized_dictionary_method", "MAP-OBJECT-REMOVE-ALL-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("map_object_keys_synchronized_dictionary_method", "MAP-OBJECT-KEYS-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("map_object_values_synchronized_dictionary_method", "MAP-OBJECT-VALUES-SYNCHRONIZED-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("test_timings_of_alist_of_size", "TEST-TIMINGS-OF-ALIST-OF-SIZE", 2, 0, false);
        declareFunction("test_timings_of_hashtable_of_size", "TEST-TIMINGS-OF-HASHTABLE-OF-SIZE", 2, 0, false);
        declareFunction("estimate_optimal_dictionary_watermark", "ESTIMATE-OPTIMAL-DICTIONARY-WATERMARK", 0, 2, false);
        declareFunction("test_dictionary_key_conflation", "TEST-DICTIONARY-KEY-CONFLATION", 2, 0, false);
        declareFunction("test_hashtable_speed", "TEST-HASHTABLE-SPEED", 3, 0, false);
        declareFunction("test_dictionary_speed", "TEST-DICTIONARY-SPEED", 3, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt56 = list(list(list(list(cons(makeString("eins"), ONE_INTEGER), cons(makeString("zwei"), TWO_INTEGER), cons(makeString("drei"), THREE_INTEGER), cons(makeString("vier"), FOUR_INTEGER), cons(makeString("fuenf"), FIVE_INTEGER), cons(makeString("sechs"), SIX_INTEGER)), makeSymbol("SQUARE"), makeSymbol("=")), makeKeyword("SUCCESS")), list(list(list(cons(makeString("one"), ONE_INTEGER), cons(makeString("two"), TWO_INTEGER), cons(makeString("three"), THREE_INTEGER), cons(makeString("four"), FOUR_INTEGER), cons(makeString("five"), FIVE_INTEGER), cons(makeString("six"), SIX_INTEGER)), makeSymbol("SQRT"), makeSymbol("=")), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt57$For_key__A__the_computed_new_valu = makeString("For key ~A, the computed new value ~A does not ~A the  expected new value ~A.");

    static private final SubLSymbol $sym59$_ = makeSymbol(">");

    static private final SubLList $list_alt60 = list(list(makeSymbol("KEY"), makeSymbol("DICTIONARY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt61 = list($DONE);

    static private final SubLSymbol $sym64$VALUE = makeUninternedSymbol("VALUE");

    static private final SubLList $list_alt65 = list(list(makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym66$KEY = makeUninternedSymbol("KEY");

    static private final SubLList $list_alt67 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLString $str_alt68$Overwriting__s_from__s_to__s = makeString("Overwriting ~s from ~s to ~s");

    static private final SubLList $list_alt72 = list(makeSymbol("DICTIONARY"), makeSymbol("LOCK"));

    static private final SubLList $list_alt73 = list(makeKeyword("DICTIONARY"), $LOCK);

    static private final SubLList $list_alt74 = list(makeSymbol("SYNCHRONIZED-DICTIONARY-DICTIONARY"), makeSymbol("SYNCHRONIZED-DICTIONARY-LOCK"));

    static private final SubLList $list_alt75 = list(makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-DICTIONARY"), makeSymbol("_CSETF-SYNCHRONIZED-DICTIONARY-LOCK"));

    static private final SubLString $str_alt84$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt86$__ = makeString("#<");

    static private final SubLString $str_alt88$DICTIONARY___A___LOCK___A__ = makeString("DICTIONARY: ~A ~%LOCK: ~A~%");

    static private final SubLString $str_alt92$Testing_size__A_ALIST__A_HASHTABL = makeString("Testing size=~A ALIST=~A HASHTABLE=~A~%");

    static private final SubLList $list_alt94 = list(list(list(EQUALP, list(makeString("Sea"), makeString("sea"))), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[]{ makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("Sea"), makeString("sea") })), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[]{ makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("sea"), makeString("central") })), makeKeyword("SUCCESS")), list(list(EQUALP, list(new SubLObject[]{ makeString("Sea"), makeString("Vancouver"), makeString("GOA"), makeString("Valley"), makeString("Anna"), makeString("Carolina"), makeString("point"), makeString("Rolandsay"), makeString("Dartmouth"), makeString("fork"), makeString("country"), makeString("East"), makeString("central"), makeString("sea") })), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt96$Expected__A_entries__but_got__A_ = makeString("Expected ~A entries, but got ~A.");

    public static final SubLObject init_dictionary_utilities_file_alt() {
        defparameter("*DICTIONARY-KEYS-SORTER-CURRENT-SORTING-INFORMATION*", NIL);
        deflexical("*SUB-DICTIONARY-NOT-FOUND*", NIL != boundp($sub_dictionary_not_found$) ? ((SubLObject) ($sub_dictionary_not_found$.getGlobalValue())) : gensym(UNPROVIDED));
        defconstant("*DTP-SYNCHRONIZED-DICTIONARY*", SYNCHRONIZED_DICTIONARY);
        return NIL;
    }

    public static SubLObject init_dictionary_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*DICTIONARY-KEYS-SORTER-CURRENT-SORTING-INFORMATION*", NIL);
            deflexical("*KEY-MISSING*", make_symbol($str59$KEY_MISSING));
            deflexical("*SUB-DICTIONARY-NOT-FOUND*", SubLTrampolineFile.maybeDefault($sub_dictionary_not_found$, $sub_dictionary_not_found$, () -> gensym(UNPROVIDED)));
            defconstant("*DTP-SYNCHRONIZED-DICTIONARY*", SYNCHRONIZED_DICTIONARY);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SUB-DICTIONARY-NOT-FOUND*", NIL != boundp($sub_dictionary_not_found$) ? ((SubLObject) ($sub_dictionary_not_found$.getGlobalValue())) : gensym(UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_dictionary_utilities_file_Previous() {
        defparameter("*DICTIONARY-KEYS-SORTER-CURRENT-SORTING-INFORMATION*", NIL);
        deflexical("*KEY-MISSING*", make_symbol($str59$KEY_MISSING));
        deflexical("*SUB-DICTIONARY-NOT-FOUND*", SubLTrampolineFile.maybeDefault($sub_dictionary_not_found$, $sub_dictionary_not_found$, () -> gensym(UNPROVIDED)));
        defconstant("*DTP-SYNCHRONIZED-DICTIONARY*", SYNCHRONIZED_DICTIONARY);
        return NIL;
    }

    public static final SubLObject setup_dictionary_utilities_file_alt() {
        note_funcall_helper_function(DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE);
        define_test_case_table_int(TEST_DICTIONARY_KEYS_SORTED_BY_VALUES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt54);
        define_test_case_table_int(TEST_MAP_DICTIONARY_VALUES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt56);
        declare_defglobal($sub_dictionary_not_found$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(SYNCHRONIZED_DICTIONARY_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SYNCHRONIZED_DICTIONARY_DICTIONARY, _CSETF_SYNCHRONIZED_DICTIONARY_DICTIONARY);
        def_csetf(SYNCHRONIZED_DICTIONARY_LOCK, _CSETF_SYNCHRONIZED_DICTIONARY_LOCK);
        identity(SYNCHRONIZED_DICTIONARY);
        define_test_case_table_int(TEST_DICTIONARY_KEY_CONFLATION, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt94);
        return NIL;
    }

    public static SubLObject setup_dictionary_utilities_file() {
        if (SubLFiles.USE_V1) {
            note_funcall_helper_function(DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE);
            declare_defglobal($sub_dictionary_not_found$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(SYNCHRONIZED_DICTIONARY_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list70);
            def_csetf(SYNCHRONIZED_DICTIONARY_DICTIONARY, _CSETF_SYNCHRONIZED_DICTIONARY_DICTIONARY);
            def_csetf(SYNCHRONIZED_DICTIONARY_LOCK, _CSETF_SYNCHRONIZED_DICTIONARY_LOCK);
            identity(SYNCHRONIZED_DICTIONARY);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(IS_MAP_OBJECT_P_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_SIZE_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_TEST_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$map_object_put_unless_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_UNLESS_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_WITHOUT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function($sym95$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SYNCHRONIZED_DICTIONARY_METHO));
            register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_ARBITRARY_KEY_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_ITERATOR_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_ALL_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$map_object_keys_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_KEYS_SYNCHRONIZED_DICTIONARY_METHOD));
            register_method(map_utilities.$map_object_values_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD));
            define_test_case_table_int(TEST_DICTIONARY_KEYS_SORTED_BY_VALUES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list111);
            define_test_case_table_int(TEST_MAP_DICTIONARY_VALUES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list113);
            define_test_case_table_int(TEST_DICTIONARY_KEY_CONFLATION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list115);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_DICTIONARY_KEYS_SORTED_BY_VALUES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt54);
            define_test_case_table_int(TEST_MAP_DICTIONARY_VALUES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt56);
            define_test_case_table_int(TEST_DICTIONARY_KEY_CONFLATION, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt94);
        }
        return NIL;
    }

    public static SubLObject setup_dictionary_utilities_file_Previous() {
        note_funcall_helper_function(DICTIONARY_KEYS_SORTER_COMPARISON_PREDICATE);
        declare_defglobal($sub_dictionary_not_found$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(SYNCHRONIZED_DICTIONARY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list70);
        def_csetf(SYNCHRONIZED_DICTIONARY_DICTIONARY, _CSETF_SYNCHRONIZED_DICTIONARY_DICTIONARY);
        def_csetf(SYNCHRONIZED_DICTIONARY_LOCK, _CSETF_SYNCHRONIZED_DICTIONARY_LOCK);
        identity(SYNCHRONIZED_DICTIONARY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(IS_MAP_OBJECT_P_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_SIZE_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_TEST_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$map_object_put_unless_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_UNLESS_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_WITHOUT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function($sym95$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_SYNCHRONIZED_DICTIONARY_METHO));
        register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_ARBITRARY_KEY_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_ITERATOR_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_ALL_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$map_object_keys_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_KEYS_SYNCHRONIZED_DICTIONARY_METHOD));
        register_method(map_utilities.$map_object_values_method_table$.getGlobalValue(), $dtp_synchronized_dictionary$.getGlobalValue(), symbol_function(MAP_OBJECT_VALUES_SYNCHRONIZED_DICTIONARY_METHOD));
        define_test_case_table_int(TEST_DICTIONARY_KEYS_SORTED_BY_VALUES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list111);
        define_test_case_table_int(TEST_MAP_DICTIONARY_VALUES, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list113);
        define_test_case_table_int(TEST_DICTIONARY_KEY_CONFLATION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list115);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_dictionary_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_dictionary_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_dictionary_utilities_file();
    }

    

    public static final class $synchronized_dictionary_p$UnaryFunction extends UnaryFunction {
        public $synchronized_dictionary_p$UnaryFunction() {
            super(extractFunctionNamed("SYNCHRONIZED-DICTIONARY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return synchronized_dictionary_p(arg1);
        }
    }
}

/**
 * Total time: 497 ms
 */
