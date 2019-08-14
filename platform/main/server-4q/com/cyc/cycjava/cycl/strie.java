/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.mismatch;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.functionp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      STRIE
 * source file: /cyc/top/cycl/strie.lisp
 * created:     2019/07/03 17:37:15
 */
public final class strie extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new strie();

 public static final String myName = "com.cyc.cycjava.cycl.strie";


    // defconstant
    @LispMethod(comment = "The element used as a key ender in the strie implementation and which is not allowed\r\nto be an element of a sequence key.\ndefconstant\nThe element used as a key ender in the strie implementation and which is not allowed\nto be an element of a sequence key.")
    // Definitions
    /**
     * The element used as a key ender in the strie implementation and which is not allowed
     * to be an element of a sequence key.
     */
    public static final SubLSymbol $strie_null_key$ = makeSymbol("*STRIE-NULL-KEY*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLList $list2 = list(makeSymbol("OBJECT"));

    static private final SubLList $list4 = list(makeSymbol("INFO-NODE"));

    static private final SubLList $list7 = list(makeSymbol("INFO-NODE"), makeSymbol("KEY"));

    static private final SubLList $list9 = list(makeSymbol("INFO-NODE"), makeSymbol("VALUE"));

    private static final SubLSymbol STRIE_P = makeSymbol("STRIE-P");

    static private final SubLList $list13 = list(list(makeSymbol("KEY"), makeSymbol("VALUES"), makeSymbol("STRIE"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("PROGRESS-NOTE"), list(makeSymbol("FORMAT"), NIL, makeString("Mapping ~S..."), makeSymbol("STRIE")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list14 = list($DONE, makeKeyword("PROGRESS-NOTE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $str18$Mapping__S___ = makeString("Mapping ~S...");

    static private final SubLSymbol $sym19$STACK = makeUninternedSymbol("STACK");

    static private final SubLSymbol $sym20$ENTRY = makeUninternedSymbol("ENTRY");

    static private final SubLSymbol $sym21$STRIE_DICT_KEY = makeUninternedSymbol("STRIE-DICT-KEY");

    static private final SubLSymbol $sym22$STRIE_DICT_VALUE = makeUninternedSymbol("STRIE-DICT-VALUE");

    static private final SubLList $list24 = list(list(makeSymbol("CREATE-STACK")));

    private static final SubLSymbol DO_MAP = makeSymbol("DO-MAP");

    private static final SubLSymbol MAP_P = makeSymbol("MAP-P");

    private static final SubLSymbol STACK_EMPTY_P = makeSymbol("STACK-EMPTY-P");

    private static final SubLSymbol DO_STRIE_INTERIOR_NODE = makeSymbol("DO-STRIE-INTERIOR-NODE");

    private static final SubLSymbol INFO_NODE_P = makeSymbol("INFO-NODE-P");

    private static final SubLSymbol INFO_NODE_KEY = makeSymbol("INFO-NODE-KEY");

    private static final SubLSymbol INFO_NODE_VALUE = makeSymbol("INFO-NODE-VALUE");

    static private final SubLList $list39 = list(list(makeSymbol("KEY"), makeSymbol("VALUES"), makeSymbol("STRIE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list40 = list($DONE);

    static private final SubLSymbol $sym41$STACK = makeUninternedSymbol("STACK");

    static private final SubLSymbol $sym42$ENTRY = makeUninternedSymbol("ENTRY");

    static private final SubLList $list43 = list(list(makeSymbol("KEY"), makeSymbol("VALUES"), makeSymbol("DICT-NODE"), makeSymbol("DONE"), makeSymbol("STACK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym44$DICT_KEY = makeUninternedSymbol("DICT-KEY");

    static private final SubLSymbol $sym45$DICT_VALUE = makeUninternedSymbol("DICT-VALUE");

    static private final SubLList $list46 = list(makeSymbol("MAP-ITERATOR"), makeSymbol("STACK"));

    private static final SubLSymbol STRIE_ITERATOR_DONE_P = makeSymbol("STRIE-ITERATOR-DONE-P");

    private static final SubLSymbol STRIE_ITERATOR_NEXT = makeSymbol("STRIE-ITERATOR-NEXT");

    static private final SubLList $list49 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));

    private static final SubLSymbol STRIE_KEY_P = makeSymbol("STRIE-KEY-P");

    private static final SubLSymbol HIERARCHICAL_VISITOR_P = makeSymbol("HIERARCHICAL-VISITOR-P");

    static private final SubLList $list56 = list(makeSymbol("TASK"), makeSymbol("PATH"), makeSymbol("&OPTIONAL"), makeSymbol("STRIE"));

    static private final SubLList $list58 = list(makeSymbol("DICT-KEY"), makeSymbol("PAYLOAD"));

    static private final SubLString $str59$Invalid_STRIE_entry__A_____neithe = makeString("Invalid STRIE entry ~A ... neither sub-tree nor info node.");

    static private final SubLString $str60$Invalid_state_transition__A_in_vi = makeString("Invalid state transition ~A in visitng of STRIE.");

    private static final SubLSymbol STRIE_P_INTERNAL = makeSymbol("STRIE-P-INTERNAL");

    static private final SubLString $str67$_A_is_not_an_integer = makeString("~A is not an integer");

    static private final SubLString $str68$END_must_not_be_smaller_than_STAR = makeString("END must not be smaller than START");

    static private final SubLString $str69$_A_is_not_a_sequence = makeString("~A is not a sequence");

    private static final SubLSymbol TEST_EXERCISE_STRIE = makeSymbol("TEST-EXERCISE-STRIE");

    private static final SubLList $list77 = list(list(list(list(makeString("George Washington Carver"), makeString("George Washington"), makeString("George Washington Adams"), makeString("George Washington Curtis Lee"))), makeKeyword("SUCCESS")));

    private static final SubLString $str78$There_are_already__A_entries_in_t = makeString("There are already ~A entries in the trie???");

    private static final SubLString $str79$Cannot_retrieve__A_with_lookup_ke = makeString("Cannot retrieve ~A with lookup-key ~A.");

    private static final SubLSymbol $sym80$_ = makeSymbol(">");

    private static final SubLString $str82$The_deletion_of_key__A_did_not_mo = makeString("The deletion of key ~A did not modify the STrie!");

    private static final SubLString $str83$There_are_still__A_entries_left_o = makeString("There are still ~A entries left over: ~A");

    /**
     *
     *
     * @param KEY
    sequence
     * 		
     * @return consp; a KEY VALUE pair
     */
    @LispMethod(comment = "@param KEY\nsequence\r\n\t\t\r\n@return consp; a KEY VALUE pair")
    public static final SubLObject new_info_node_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CONS, key, value);
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param KEY
    sequence
     * 		
     * @return consp; a KEY VALUE pair
     */
    @LispMethod(comment = "@param KEY\nsequence\r\n\t\t\r\n@return consp; a KEY VALUE pair")
    public static SubLObject new_info_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CONS, key, value);
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t if THING is an info-node, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if THING is an info-node, nil otherwise")
    public static final SubLObject info_node_p_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            v_object = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CONSP, v_object);
            } else {
                cdestructuring_bind_error(datum, $list_alt2);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t if THING is an info-node, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if THING is an info-node, nil otherwise")
    public static SubLObject info_node_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        v_object = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CONSP, v_object);
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    /**
     *
     *
     * @param INFO-NODE
    consp
     * 		
     * @return sequence; the sequence that is the key of INFO-NODE
     */
    @LispMethod(comment = "@param INFO-NODE\nconsp\r\n\t\t\r\n@return sequence; the sequence that is the key of INFO-NODE")
    public static final SubLObject info_node_key_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject info_node = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            info_node = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CAR, info_node);
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param INFO-NODE
    consp
     * 		
     * @return sequence; the sequence that is the key of INFO-NODE
     */
    @LispMethod(comment = "@param INFO-NODE\nconsp\r\n\t\t\r\n@return sequence; the sequence that is the key of INFO-NODE")
    public static SubLObject info_node_key(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject info_node = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        info_node = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CAR, info_node);
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    /**
     *
     *
     * @param INFO-NODE
    consp
     * 		
     * @return list; the list of values of INFO-NODE
     */
    @LispMethod(comment = "@param INFO-NODE\nconsp\r\n\t\t\r\n@return list; the list of values of INFO-NODE")
    public static final SubLObject info_node_value_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject info_node = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            info_node = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CDR, info_node);
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param INFO-NODE
    consp
     * 		
     * @return list; the list of values of INFO-NODE
     */
    @LispMethod(comment = "@param INFO-NODE\nconsp\r\n\t\t\r\n@return list; the list of values of INFO-NODE")
    public static SubLObject info_node_value(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject info_node = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        info_node = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CDR, info_node);
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    /**
     *
     *
     * @param INFO-NODE
    consp
     * 		
     * @return consp; the key-values pair INFO-NODE
     * @unknown trie usage often requires to not only return the value but also the key
     */
    @LispMethod(comment = "@param INFO-NODE\nconsp\r\n\t\t\r\n@return consp; the key-values pair INFO-NODE\r\n@unknown trie usage often requires to not only return the value but also the key")
    public static final SubLObject info_node_entry_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject info_node = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            info_node = current.first();
            current = current.rest();
            if (NIL == current) {
                return info_node;
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param INFO-NODE
    consp
     * 		
     * @return consp; the key-values pair INFO-NODE
     * @unknown trie usage often requires to not only return the value but also the key
     */
    @LispMethod(comment = "@param INFO-NODE\nconsp\r\n\t\t\r\n@return consp; the key-values pair INFO-NODE\r\n@unknown trie usage often requires to not only return the value but also the key")
    public static SubLObject info_node_entry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject info_node = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        info_node = current.first();
        current = current.rest();
        if (NIL == current) {
            return info_node;
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    /**
     * Set the key of INFO-NODE to KEY.
     * Destructively modifies INFO-NODE.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Set the key of INFO-NODE to KEY.\r\nDestructively modifies INFO-NODE.\r\n\r\n@unknown baxter\nSet the key of INFO-NODE to KEY.\nDestructively modifies INFO-NODE.")
    public static final SubLObject info_node_key_set_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject info_node = NIL;
            SubLObject key = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            info_node = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt7);
            key = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(RPLACA, info_node, key);
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    /**
     * Set the key of INFO-NODE to KEY.
     * Destructively modifies INFO-NODE.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Set the key of INFO-NODE to KEY.\r\nDestructively modifies INFO-NODE.\r\n\r\n@unknown baxter\nSet the key of INFO-NODE to KEY.\nDestructively modifies INFO-NODE.")
    public static SubLObject info_node_key_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject info_node = NIL;
        SubLObject key = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        info_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        key = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(RPLACA, info_node, key);
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    /**
     * Set the value of INFO-NODE to VALUE.
     * Destructively modifies INFO-NODE.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Set the value of INFO-NODE to VALUE.\r\nDestructively modifies INFO-NODE.\r\n\r\n@unknown baxter\nSet the value of INFO-NODE to VALUE.\nDestructively modifies INFO-NODE.")
    public static final SubLObject info_node_value_set_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject info_node = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            info_node = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(RPLACD, info_node, value);
            } else {
                cdestructuring_bind_error(datum, $list_alt9);
            }
        }
        return NIL;
    }

    /**
     * Set the value of INFO-NODE to VALUE.
     * Destructively modifies INFO-NODE.
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Set the value of INFO-NODE to VALUE.\r\nDestructively modifies INFO-NODE.\r\n\r\n@unknown baxter\nSet the value of INFO-NODE to VALUE.\nDestructively modifies INFO-NODE.")
    public static SubLObject info_node_value_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject info_node = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        info_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(RPLACD, info_node, value);
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    /**
     *
     *
     * @param TEST
     * 		function; the function used for equality testing
     * @return strie; an strie which will use TEST for equality testing of key-elements
     */
    @LispMethod(comment = "@param TEST\r\n\t\tfunction; the function used for equality testing\r\n@return strie; an strie which will use TEST for equality testing of key-elements")
    public static final SubLObject new_strie_alt(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
        return dictionary.new_dictionary(test, UNPROVIDED);
    }

    /**
     *
     *
     * @param TEST
     * 		function; the function used for equality testing
     * @return strie; an strie which will use TEST for equality testing of key-elements
     */
    @LispMethod(comment = "@param TEST\r\n\t\tfunction; the function used for equality testing\r\n@return strie; an strie which will use TEST for equality testing of key-elements")
    public static SubLObject new_strie(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
        return dictionary.new_dictionary(test, UNPROVIDED);
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return strie; empty STRIE completely
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return strie; empty STRIE completely")
    public static final SubLObject strie_clear_alt(SubLObject v_strie) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        return map_utilities.map_remove_all(v_strie);
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return strie; empty STRIE completely
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return strie; empty STRIE completely")
    public static SubLObject strie_clear(final SubLObject v_strie) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        return map_utilities.map_remove_all(v_strie);
    }

    /**
     *
     *
     * @return BOOLEAN; T if THING is an strie and nil otherwise If sloppy is non-nil, only
    an inexpensive quick check is done, otherwise an expensive complete check is done
     */
    @LispMethod(comment = "@return BOOLEAN; T if THING is an strie and nil otherwise If sloppy is non-nil, only\r\nan inexpensive quick check is done, otherwise an expensive complete check is done")
    public static final SubLObject strie_p_alt(SubLObject v_object, SubLObject sloppyP) {
        if (sloppyP == UNPROVIDED) {
            sloppyP = T;
        }
        return makeBoolean((NIL != map_utilities.map_p(v_object)) && (NIL != (NIL != sloppyP ? ((SubLObject) (T)) : com.cyc.cycjava.cycl.strie.strie_p_internal(v_object))));
    }

    /**
     *
     *
     * @return BOOLEAN; T if THING is an strie and nil otherwise If sloppy is non-nil, only
    an inexpensive quick check is done, otherwise an expensive complete check is done
     */
    @LispMethod(comment = "@return BOOLEAN; T if THING is an strie and nil otherwise If sloppy is non-nil, only\r\nan inexpensive quick check is done, otherwise an expensive complete check is done")
    public static SubLObject strie_p(final SubLObject v_object, SubLObject sloppyP) {
        if (sloppyP == UNPROVIDED) {
            sloppyP = T;
        }
        return makeBoolean((NIL != map_utilities.map_p(v_object)) && (NIL != (NIL != sloppyP ? T : strie_p_internal(v_object))));
    }

    /**
     *
     *
     * @return FUNCTION; the equality function used in STRIE
     */
    @LispMethod(comment = "@return FUNCTION; the equality function used in STRIE")
    public static final SubLObject strie_test_alt(SubLObject v_strie) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        return map_utilities.map_test(v_strie);
    }

    /**
     *
     *
     * @return FUNCTION; the equality function used in STRIE
     */
    @LispMethod(comment = "@return FUNCTION; the equality function used in STRIE")
    public static SubLObject strie_test(final SubLObject v_strie) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        return map_utilities.map_test(v_strie);
    }

    /**
     *
     *
     * @param STRIE
     * 		strie
     * 		Like @xref DO-STRIE, but reporting progress.
     */
    @LispMethod(comment = "@param STRIE\r\n\t\tstrie\r\n\t\tLike @xref DO-STRIE, but reporting progress.")
    public static final SubLObject do_strie_progress_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject values = NIL;
                    SubLObject v_strie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    values = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt13);
                    v_strie = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt13);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt13);
                            if (NIL == member(current_1, $list_alt14, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt13);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject progress_note_tail = property_list_member($PROGRESS_NOTE, current);
                            SubLObject progress_note = (NIL != progress_note_tail) ? ((SubLObject) (cadr(progress_note_tail))) : format(NIL, $str_alt18$Mapping__S___, v_strie);
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject stack = $sym19$STACK;
                                SubLObject entry = $sym20$ENTRY;
                                SubLObject strie_dict_key = $sym21$STRIE_DICT_KEY;
                                SubLObject strie_dict_value = $sym22$STRIE_DICT_VALUE;
                                return list(CLET, list(bq_cons(stack, $list_alt24)), list(DO_MAP, list(strie_dict_key, strie_dict_value, v_strie, $DONE, done, $PROGRESS_MESSAGE, progress_note), list(IGNORE, strie_dict_key), list(PCOND, list(list(MAP_P, strie_dict_value), list(STACK_PUSH, strie_dict_value, stack), list(UNTIL, list(COR, done, list(STACK_EMPTY_P, stack)), list(CLET, list(list(entry, list(STACK_POP, stack))), listS(DO_STRIE_INTERIOR_NODE, list(key, values, entry, done, stack), append(body, NIL))))), list(list(INFO_NODE_P, strie_dict_value), listS(CLET, list(list(key, list(INFO_NODE_KEY, strie_dict_value)), list(values, list(INFO_NODE_VALUE, strie_dict_value))), append(body, NIL))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param STRIE
     * 		strie
     * 		Like @xref DO-STRIE, but reporting progress.
     */
    @LispMethod(comment = "@param STRIE\r\n\t\tstrie\r\n\t\tLike @xref DO-STRIE, but reporting progress.")
    public static SubLObject do_strie_progress(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject values = NIL;
        SubLObject v_strie = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        values = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list13);
        v_strie = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list13);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list13);
            if (NIL == member(current_$1, $list14, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list13);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_note_tail = property_list_member($PROGRESS_NOTE, current);
        final SubLObject progress_note = (NIL != progress_note_tail) ? cadr(progress_note_tail) : format(NIL, $str18$Mapping__S___, v_strie);
        final SubLObject body;
        current = body = temp;
        final SubLObject stack = $sym19$STACK;
        final SubLObject entry = $sym20$ENTRY;
        final SubLObject strie_dict_key = $sym21$STRIE_DICT_KEY;
        final SubLObject strie_dict_value = $sym22$STRIE_DICT_VALUE;
        return list(CLET, list(bq_cons(stack, $list24)), list(DO_MAP, list(strie_dict_key, strie_dict_value, v_strie, $DONE, done, $PROGRESS_MESSAGE, progress_note), list(IGNORE, strie_dict_key), list(PCOND, list(list(MAP_P, strie_dict_value), list(STACK_PUSH, strie_dict_value, stack), list(UNTIL, list(COR, done, list(STACK_EMPTY_P, stack)), list(CLET, list(list(entry, list(STACK_POP, stack))), listS(DO_STRIE_INTERIOR_NODE, list(key, values, entry, done, stack), append(body, NIL))))), list(list(INFO_NODE_P, strie_dict_value), listS(CLET, list(list(key, list(INFO_NODE_KEY, strie_dict_value)), list(values, list(INFO_NODE_VALUE, strie_dict_value))), append(body, NIL))))));
    }

    /**
     *
     *
     * @param STRIE
     * 		strie
     * 		Execute BODY with KEY and VALUES successively bound to each key and value in STRIE,
     * 		stopping when DONE is non-nil.
     */
    @LispMethod(comment = "@param STRIE\r\n\t\tstrie\r\n\t\tExecute BODY with KEY and VALUES successively bound to each key and value in STRIE,\r\n\t\tstopping when DONE is non-nil.")
    public static final SubLObject do_strie_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject values = NIL;
                    SubLObject v_strie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    values = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    v_strie = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt39);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt39);
                            if (NIL == member(current_2, $list_alt40, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt39);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject stack = $sym41$STACK;
                                SubLObject entry = $sym42$ENTRY;
                                return list(CLET, list(bq_cons(stack, $list_alt24)), listS(DO_STRIE_INTERIOR_NODE, list(key, values, v_strie, done, stack), append(body, NIL)), list(UNTIL, list(COR, done, list(STACK_EMPTY_P, stack)), list(CLET, list(list(entry, list(STACK_POP, stack))), listS(DO_STRIE_INTERIOR_NODE, list(key, values, entry, done, stack), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @param STRIE
     * 		strie
     * 		Execute BODY with KEY and VALUES successively bound to each key and value in STRIE,
     * 		stopping when DONE is non-nil.
     */
    @LispMethod(comment = "@param STRIE\r\n\t\tstrie\r\n\t\tExecute BODY with KEY and VALUES successively bound to each key and value in STRIE,\r\n\t\tstopping when DONE is non-nil.")
    public static SubLObject do_strie(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject values = NIL;
        SubLObject v_strie = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        values = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        v_strie = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list39);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list39);
            if (NIL == member(current_$2, $list40, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list39);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject stack = $sym41$STACK;
        final SubLObject entry = $sym42$ENTRY;
        return list(CLET, list(bq_cons(stack, $list24)), listS(DO_STRIE_INTERIOR_NODE, list(key, values, v_strie, done, stack), append(body, NIL)), list(UNTIL, list(COR, done, list(STACK_EMPTY_P, stack)), list(CLET, list(list(entry, list(STACK_POP, stack))), listS(DO_STRIE_INTERIOR_NODE, list(key, values, entry, done, stack), append(body, NIL)))));
    }

    /**
     * Helper for DO-STRIE(-PROGRESS), for doing one dictionary node.
     */
    @LispMethod(comment = "Helper for DO-STRIE(-PROGRESS), for doing one dictionary node.")
    public static final SubLObject do_strie_interior_node_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject values = NIL;
                    SubLObject dict_node = NIL;
                    SubLObject done = NIL;
                    SubLObject stack = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    values = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    dict_node = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    done = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    stack = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject dict_key = $sym44$DICT_KEY;
                            SubLObject dict_value = $sym45$DICT_VALUE;
                            return list(DO_MAP, list(dict_key, dict_value, dict_node, $DONE, done), list(IGNORE, dict_key), list(PCOND, list(list(MAP_P, dict_value), list(STACK_PUSH, dict_value, stack)), list(list(INFO_NODE_P, dict_value), listS(CLET, list(list(key, list(INFO_NODE_KEY, dict_value)), list(values, list(INFO_NODE_VALUE, dict_value))), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt43);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Helper for DO-STRIE(-PROGRESS), for doing one dictionary node.
     */
    @LispMethod(comment = "Helper for DO-STRIE(-PROGRESS), for doing one dictionary node.")
    public static SubLObject do_strie_interior_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject values = NIL;
        SubLObject dict_node = NIL;
        SubLObject done = NIL;
        SubLObject stack = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        values = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        dict_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        stack = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject dict_key = $sym44$DICT_KEY;
            final SubLObject dict_value = $sym45$DICT_VALUE;
            return list(DO_MAP, list(dict_key, dict_value, dict_node, $DONE, done), list(IGNORE, dict_key), list(PCOND, list(list(MAP_P, dict_value), list(STACK_PUSH, dict_value, stack)), list(list(INFO_NODE_P, dict_value), listS(CLET, list(list(key, list(INFO_NODE_KEY, dict_value)), list(values, list(INFO_NODE_VALUE, dict_value))), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list43);
        return NIL;
    }

    /**
     *
     *
     * @return ITERATOR-P; an iterator for STRIE.
     * @unknown baxter
     */
    @LispMethod(comment = "@return ITERATOR-P; an iterator for STRIE.\r\n@unknown baxter")
    public static final SubLObject new_strie_iterator_alt(SubLObject v_strie) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        return com.cyc.cycjava.cycl.strie.make_strie_iterator(v_strie);
    }

    /**
     *
     *
     * @return ITERATOR-P; an iterator for STRIE.
     * @unknown baxter
     */
    @LispMethod(comment = "@return ITERATOR-P; an iterator for STRIE.\r\n@unknown baxter")
    public static SubLObject new_strie_iterator(final SubLObject v_strie) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        return make_strie_iterator(v_strie);
    }

    public static final SubLObject strie_iterator_done_p_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject map_iterator = NIL;
            SubLObject stack = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt46);
            map_iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt46);
            stack = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean((NIL != iteration.iteration_done(map_iterator)) && (NIL != stacks.stack_empty_p(stack)));
            } else {
                cdestructuring_bind_error(datum, $list_alt46);
            }
        }
        return NIL;
    }

    public static SubLObject strie_iterator_done_p(final SubLObject state) {
        SubLObject map_iterator = NIL;
        SubLObject stack = NIL;
        destructuring_bind_must_consp(state, state, $list46);
        map_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list46);
        stack = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != iteration.iteration_done(map_iterator)) && (NIL != stacks.stack_empty_p(stack)));
        }
        cdestructuring_bind_error(state, $list46);
        return NIL;
    }

    public static final SubLObject strie_iterator_next_alt(SubLObject state) {
        {
            SubLObject key = NIL;
            SubLObject values = NIL;
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject map_iterator = NIL;
            SubLObject stack = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt46);
            map_iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt46);
            stack = current.first();
            current = current.rest();
            if (NIL == current) {
                while (!(((NIL != iteration.iteration_done(map_iterator)) && (NIL != stacks.stack_empty_p(stack))) || (NIL != key))) {
                    if (NIL != iteration.iteration_done(map_iterator)) {
                        {
                            SubLObject next_map = stacks.stack_pop(stack);
                            map_iterator = map_utilities.new_map_iterator(next_map);
                        }
                    }
                    {
                        SubLObject dict_value = second(iteration.iteration_next(map_iterator));
                        if (NIL != map_utilities.map_p(dict_value)) {
                            stacks.stack_push(dict_value, stack);
                        } else {
                            if (dict_value.isCons()) {
                                key = dict_value.first();
                                values = dict_value.rest();
                                rplaca(state, map_iterator);
                            }
                        }
                    }
                } 
            } else {
                cdestructuring_bind_error(datum, $list_alt46);
            }
            return values(NIL != key ? ((SubLObject) (list(key, values))) : NIL, state, sublisp_null(key));
        }
    }

    public static SubLObject strie_iterator_next(final SubLObject state) {
        SubLObject key = NIL;
        SubLObject values = NIL;
        SubLObject map_iterator = NIL;
        SubLObject stack = NIL;
        destructuring_bind_must_consp(state, state, $list46);
        map_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list46);
        stack = current.first();
        current = current.rest();
        if (NIL == current) {
            while (((NIL == iteration.iteration_done(map_iterator)) || (NIL == stacks.stack_empty_p(stack))) && (NIL == key)) {
                if (NIL != iteration.iteration_done(map_iterator)) {
                    final SubLObject next_map = stacks.stack_pop(stack);
                    map_iterator = map_utilities.new_map_iterator(next_map);
                }
                final SubLObject dict_value = second(iteration.iteration_next(map_iterator));
                if (NIL != map_utilities.map_p(dict_value)) {
                    stacks.stack_push(dict_value, stack);
                } else {
                    if (!dict_value.isCons()) {
                        continue;
                    }
                    key = dict_value.first();
                    values = dict_value.rest();
                    rplaca(state, map_iterator);
                }
            } 
        } else {
            cdestructuring_bind_error(state, $list46);
        }
        return values(NIL != key ? list(key, values) : NIL, state, sublisp_null(key));
    }

    public static final SubLObject make_strie_iterator_alt(SubLObject v_strie) {
        {
            SubLObject map_iterator = map_utilities.new_map_iterator(v_strie);
            SubLObject map_stack = stacks.create_stack();
            SubLObject state = list(map_iterator, map_stack);
            return iteration.new_iterator(state, symbol_function(STRIE_ITERATOR_DONE_P), symbol_function(STRIE_ITERATOR_NEXT), UNPROVIDED);
        }
    }

    public static SubLObject make_strie_iterator(final SubLObject v_strie) {
        final SubLObject map_iterator = map_utilities.new_map_iterator(v_strie);
        final SubLObject map_stack = stacks.create_stack();
        final SubLObject state = list(map_iterator, map_stack);
        return iteration.new_iterator(state, symbol_function(STRIE_ITERATOR_DONE_P), symbol_function(STRIE_ITERATOR_NEXT), UNPROVIDED);
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return integer; the number of entries in STRIE
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return integer; the number of entries in STRIE")
    public static final SubLObject strie_size_alt(SubLObject v_strie) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_strie, STRIE_P);
            {
                SubLObject size = ZERO_INTEGER;
                SubLObject stack = stacks.create_stack();
                {
                    SubLObject iterator = map_utilities.new_map_iterator(v_strie);
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = iteration.iteration_next(iterator);
                            SubLObject valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                {
                                    SubLObject datum = var;
                                    SubLObject current = datum;
                                    SubLObject dict_key = NIL;
                                    SubLObject dict_value = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt49);
                                    dict_key = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt49);
                                    dict_value = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != map_utilities.map_p(dict_value)) {
                                            stacks.stack_push(dict_value, stack);
                                        } else {
                                            if (dict_value.isCons()) {
                                                {
                                                    SubLObject key = dict_value.first();
                                                    SubLObject value = dict_value.rest();
                                                    size = add(size, ONE_INTEGER);
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt49);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
                while (NIL == stacks.stack_empty_p(stack)) {
                    {
                        SubLObject entry = stacks.stack_pop(stack);
                        SubLObject iterator = map_utilities.new_map_iterator(entry);
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject var = iteration.iteration_next(iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject datum = var;
                                        SubLObject current = datum;
                                        SubLObject dict_key = NIL;
                                        SubLObject dict_value = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                        dict_key = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                        dict_value = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != map_utilities.map_p(dict_value)) {
                                                stacks.stack_push(dict_value, stack);
                                            } else {
                                                if (dict_value.isCons()) {
                                                    {
                                                        SubLObject key = dict_value.first();
                                                        SubLObject value = dict_value.rest();
                                                        size = add(size, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt49);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } 
                return size;
            }
        }
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return integer; the number of entries in STRIE
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return integer; the number of entries in STRIE")
    public static SubLObject strie_size(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        SubLObject size = ZERO_INTEGER;
        final SubLObject stack = stacks.create_stack();
        final SubLObject iterator = map_utilities.new_map_iterator(v_strie);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject dict_key = NIL;
                SubLObject dict_value = NIL;
                destructuring_bind_must_consp(current, datum, $list49);
                dict_key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list49);
                dict_value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != map_utilities.map_p(dict_value)) {
                        stacks.stack_push(dict_value, stack);
                    } else
                        if (dict_value.isCons()) {
                            final SubLObject key = dict_value.first();
                            final SubLObject value = dict_value.rest();
                            size = add(size, ONE_INTEGER);
                        }

                } else {
                    cdestructuring_bind_error(datum, $list49);
                }
            }
        }
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
            SubLObject valid2;
            for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                thread.resetMultipleValues();
                final SubLObject var2 = iteration.iteration_next(iterator2);
                valid2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = var2;
                    SubLObject dict_key2 = NIL;
                    SubLObject dict_value2 = NIL;
                    destructuring_bind_must_consp(current2, datum2, $list49);
                    dict_key2 = current2.first();
                    current2 = current2.rest();
                    destructuring_bind_must_consp(current2, datum2, $list49);
                    dict_value2 = current2.first();
                    current2 = current2.rest();
                    if (NIL == current2) {
                        if (NIL != map_utilities.map_p(dict_value2)) {
                            stacks.stack_push(dict_value2, stack);
                        } else
                            if (dict_value2.isCons()) {
                                final SubLObject key2 = dict_value2.first();
                                final SubLObject value2 = dict_value2.rest();
                                size = add(size, ONE_INTEGER);
                            }

                    } else {
                        cdestructuring_bind_error(datum2, $list49);
                    }
                }
            }
        } 
        return size;
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return boolean; T iff STRIE contains no entries.
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return boolean; T iff STRIE contains no entries.")
    public static final SubLObject strie_empty_p_alt(SubLObject v_strie) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        return map_utilities.map_empty_p(v_strie);
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return boolean; T iff STRIE contains no entries.
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return boolean; T iff STRIE contains no entries.")
    public static SubLObject strie_empty_p(final SubLObject v_strie) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        return map_utilities.map_empty_p(v_strie);
    }

    /**
     * Replace or create VALUE under KEY in STRIE
     *
     * @param STRIE
    strie
     * 		
     * @param KEY
    sequence
     * 		
     * @return keyword; :created if insertion was successful and did not require splicing and
    extending the tree, :added if a value for key already existed and was replaced by
    VALUE, and :spliced if the the trie needed to be spliced for the insertion
     */
    @LispMethod(comment = "Replace or create VALUE under KEY in STRIE\r\n\r\n@param STRIE\nstrie\r\n\t\t\r\n@param KEY\nsequence\r\n\t\t\r\n@return keyword; :created if insertion was successful and did not require splicing and\r\nextending the tree, :added if a value for key already existed and was replaced by\r\nVALUE, and :spliced if the the trie needed to be spliced for the insertion")
    public static final SubLObject strie_replace_alt(SubLObject v_strie, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        SubLTrampolineFile.checkType(key, STRIE_KEY_P);
        {
            SubLObject remove = com.cyc.cycjava.cycl.strie.strie_remove(v_strie, key);
            SubLObject insert = com.cyc.cycjava.cycl.strie.strie_insert(v_strie, key, value);
            if (remove == $VOID) {
                return insert;
            } else {
                return $ADDED;
            }
        }
    }

    @LispMethod(comment = "Replace or create VALUE under KEY in STRIE\r\n\r\n@param STRIE\n\t\tstrie\r\n\t\t\r\n@param KEY\n\t\tsequence\r\n\t\t\r\n@return keyword; :created if insertion was successful and did not require splicing and\r\nextending the tree, :added if a value for key already existed and was replaced by\r\nVALUE, and :spliced if the the trie needed to be spliced for the insertion")
    public static SubLObject strie_replace(final SubLObject v_strie, final SubLObject key, final SubLObject value) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        assert NIL != strie_key_p(key) : "! strie.strie_key_p(key) " + ("strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) ") + key;
        final SubLObject remove = strie_remove(v_strie, key);
        final SubLObject insert = strie_insert(v_strie, key, value);
        if (remove == $VOID) {
            return insert;
        }
        return $ADDED;
    }/**
     * Replace or create VALUE under KEY in STRIE
     *
     * @param STRIE
    		strie
     * 		
     * @param KEY
    		sequence
     * 		
     * @return keyword; :created if insertion was successful and did not require splicing and
    extending the tree, :added if a value for key already existed and was replaced by
    VALUE, and :spliced if the the trie needed to be spliced for the insertion
     */


    /**
     * Insert VALUE under key STRINGS in STRIE without removing possibly existing entries
     *
     * @param STRIE
    strie
     * 		
     * @param KEY
    sequence
     * 		
     * @return keyword; :created if insertion was successful and did not require splicing and
    extending the tree, :added if a value for key already existed and VALUE was newly
    inserted, and :spliced if the the trie needed to be spliced for the insertion
     */
    @LispMethod(comment = "Insert VALUE under key STRINGS in STRIE without removing possibly existing entries\r\n\r\n@param STRIE\nstrie\r\n\t\t\r\n@param KEY\nsequence\r\n\t\t\r\n@return keyword; :created if insertion was successful and did not require splicing and\r\nextending the tree, :added if a value for key already existed and VALUE was newly\r\ninserted, and :spliced if the the trie needed to be spliced for the insertion")
    public static final SubLObject strie_insert_alt(SubLObject v_strie, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        SubLTrampolineFile.checkType(key, STRIE_KEY_P);
        return com.cyc.cycjava.cycl.strie.strie_insert_internal(v_strie, com.cyc.cycjava.cycl.strie.sequence_null_pad(key), list(value), ONE_INTEGER, key);
    }

    @LispMethod(comment = "Insert VALUE under key STRINGS in STRIE without removing possibly existing entries\r\n\r\n@param STRIE\n\t\tstrie\r\n\t\t\r\n@param KEY\n\t\tsequence\r\n\t\t\r\n@return keyword; :created if insertion was successful and did not require splicing and\r\nextending the tree, :added if a value for key already existed and VALUE was newly\r\ninserted, and :spliced if the the trie needed to be spliced for the insertion")
    public static SubLObject strie_insert(final SubLObject v_strie, final SubLObject key, final SubLObject value) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        assert NIL != strie_key_p(key) : "! strie.strie_key_p(key) " + ("strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) ") + key;
        return strie_insert_internal(v_strie, sequence_null_pad(key), list(value), ONE_INTEGER, key);
    }/**
     * Insert VALUE under key STRINGS in STRIE without removing possibly existing entries
     *
     * @param STRIE
    		strie
     * 		
     * @param KEY
    		sequence
     * 		
     * @return keyword; :created if insertion was successful and did not require splicing and
    extending the tree, :added if a value for key already existed and VALUE was newly
    inserted, and :spliced if the the trie needed to be spliced for the insertion
     */


    /**
     * Remove the entry with key STRINGS from STRIE
     *
     * @param STRIE
    strie
     * 		
     * @param KEY
    sequence
     * 		
     * @return keyword; :void if the entry was not found, :removed if the entry was
    successfully removed without shrinking the trie, and :shrunk if the entry was removed
    and the trie was shrunk
     */
    @LispMethod(comment = "Remove the entry with key STRINGS from STRIE\r\n\r\n@param STRIE\nstrie\r\n\t\t\r\n@param KEY\nsequence\r\n\t\t\r\n@return keyword; :void if the entry was not found, :removed if the entry was\r\nsuccessfully removed without shrinking the trie, and :shrunk if the entry was removed\r\nand the trie was shrunk")
    public static final SubLObject strie_remove_alt(SubLObject v_strie, SubLObject key) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        SubLTrampolineFile.checkType(key, STRIE_KEY_P);
        return com.cyc.cycjava.cycl.strie.strie_remove_internal(v_strie, com.cyc.cycjava.cycl.strie.sequence_null_pad(key), key);
    }

    @LispMethod(comment = "Remove the entry with key STRINGS from STRIE\r\n\r\n@param STRIE\n\t\tstrie\r\n\t\t\r\n@param KEY\n\t\tsequence\r\n\t\t\r\n@return keyword; :void if the entry was not found, :removed if the entry was\r\nsuccessfully removed without shrinking the trie, and :shrunk if the entry was removed\r\nand the trie was shrunk")
    public static SubLObject strie_remove(final SubLObject v_strie, final SubLObject key) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        assert NIL != strie_key_p(key) : "! strie.strie_key_p(key) " + ("strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) ") + key;
        return strie_remove_internal(v_strie, sequence_null_pad(key), key);
    }/**
     * Remove the entry with key STRINGS from STRIE
     *
     * @param STRIE
    		strie
     * 		
     * @param KEY
    		sequence
     * 		
     * @return keyword; :void if the entry was not found, :removed if the entry was
    successfully removed without shrinking the trie, and :shrunk if the entry was removed
    and the trie was shrunk
     */


    /**
     * Unassociate VALUE with KEY in STRIE
     *
     * @param STRIE
    strie
     * 		
     * @param KEY
    sequence
     * 		
     * @param TEST
    functionp
     * 		
     * @return object; the new value list associated with KEY
     */
    @LispMethod(comment = "Unassociate VALUE with KEY in STRIE\r\n\r\n@param STRIE\nstrie\r\n\t\t\r\n@param KEY\nsequence\r\n\t\t\r\n@param TEST\nfunctionp\r\n\t\t\r\n@return object; the new value list associated with KEY")
    public static final SubLObject strie_unassociate_alt(SubLObject v_strie, SubLObject key, SubLObject value) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        SubLTrampolineFile.checkType(key, STRIE_KEY_P);
        {
            SubLObject new_values = delete(value, com.cyc.cycjava.cycl.strie.strie_lookup(v_strie, key), com.cyc.cycjava.cycl.strie.strie_test(v_strie), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.strie.strie_remove(v_strie, key);
            {
                SubLObject cdolist_list_var = new_values;
                SubLObject v = NIL;
                for (v = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.strie.strie_insert(v_strie, key, v);
                }
            }
            return new_values;
        }
    }

    @LispMethod(comment = "Unassociate VALUE with KEY in STRIE\r\n\r\n@param STRIE\n\t\tstrie\r\n\t\t\r\n@param KEY\n\t\tsequence\r\n\t\t\r\n@param TEST\n\t\tfunctionp\r\n\t\t\r\n@return object; the new value list associated with KEY")
    public static SubLObject strie_unassociate(final SubLObject v_strie, final SubLObject key, final SubLObject value) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        assert NIL != strie_key_p(key) : "! strie.strie_key_p(key) " + ("strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) ") + key;
        final SubLObject new_values = delete(value, strie_lookup(v_strie, key), strie_test(v_strie), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        strie_remove(v_strie, key);
        SubLObject cdolist_list_var = new_values;
        SubLObject v = NIL;
        v = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            strie_insert(v_strie, key, v);
            cdolist_list_var = cdolist_list_var.rest();
            v = cdolist_list_var.first();
        } 
        return new_values;
    }/**
     * Unassociate VALUE with KEY in STRIE
     *
     * @param STRIE
    		strie
     * 		
     * @param KEY
    		sequence
     * 		
     * @param TEST
    		functionp
     * 		
     * @return object; the new value list associated with KEY
     */


    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @param KEY
    sequence
     * 		
     * @return list; a list of all the entries in STRIE whose keys are prefixes of STRINGS in
    decreasing length
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@param KEY\nsequence\r\n\t\t\r\n@return list; a list of all the entries in STRIE whose keys are prefixes of STRINGS in\r\ndecreasing length")
    public static final SubLObject strie_lookup_alt(SubLObject v_strie, SubLObject key) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        SubLTrampolineFile.checkType(key, STRIE_KEY_P);
        {
            SubLObject int_key = com.cyc.cycjava.cycl.strie.sequence_null_pad(key);
            SubLObject node = v_strie;
            SubLObject key_element = NIL;
            SubLObject remaining_key = NIL;
            for (key_element = com.cyc.cycjava.cycl.strie.element(int_key, ZERO_INTEGER), remaining_key = com.cyc.cycjava.cycl.strie.sequence_slice(int_key, ONE_INTEGER, UNPROVIDED); !((NIL == node) || node.isCons()); key_element = com.cyc.cycjava.cycl.strie.element(remaining_key, ZERO_INTEGER) , remaining_key = com.cyc.cycjava.cycl.strie.sequence_slice(remaining_key, ONE_INTEGER, UNPROVIDED)) {
                node = map_utilities.map_get_without_values(node, key_element, UNPROVIDED);
            }
            if ((NIL != node) && (NIL != com.cyc.cycjava.cycl.strie.sequal(key, node.first(), com.cyc.cycjava.cycl.strie.strie_test(v_strie)))) {
                return node.rest();
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @param KEY
    sequence
     * 		
     * @return list; a list of all the entries in STRIE whose keys are prefixes of STRINGS in
    decreasing length
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@param KEY\nsequence\r\n\t\t\r\n@return list; a list of all the entries in STRIE whose keys are prefixes of STRINGS in\r\ndecreasing length")
    public static SubLObject strie_lookup(final SubLObject v_strie, final SubLObject key) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        assert NIL != strie_key_p(key) : "! strie.strie_key_p(key) " + ("strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) ") + key;
        final SubLObject int_key = sequence_null_pad(key);
        SubLObject node;
        SubLObject key_element;
        SubLObject remaining_key;
        for (node = v_strie, key_element = NIL, remaining_key = NIL, key_element = element(int_key, ZERO_INTEGER), remaining_key = sequence_slice(int_key, ONE_INTEGER, UNPROVIDED); (NIL != node) && (!node.isCons()); node = map_utilities.map_get_without_values(node, key_element, UNPROVIDED) , key_element = element(remaining_key, ZERO_INTEGER) , remaining_key = sequence_slice(remaining_key, ONE_INTEGER, UNPROVIDED)) {
        }
        if ((NIL != node) && (NIL != sequal(key, node.first(), strie_test(v_strie)))) {
            return node.rest();
        }
        return NIL;
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return list; the list of all keys of STRIE
     * @unknown a new list is constructed that can be modified without modifying the STRIE
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return list; the list of all keys of STRIE\r\n@unknown a new list is constructed that can be modified without modifying the STRIE")
    public static final SubLObject strie_keys_alt(SubLObject v_strie) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_strie, STRIE_P);
            {
                SubLObject keys = NIL;
                SubLObject stack = stacks.create_stack();
                {
                    SubLObject iterator = map_utilities.new_map_iterator(v_strie);
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = iteration.iteration_next(iterator);
                            SubLObject valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                {
                                    SubLObject datum = var;
                                    SubLObject current = datum;
                                    SubLObject dict_key = NIL;
                                    SubLObject dict_value = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt49);
                                    dict_key = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt49);
                                    dict_value = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != map_utilities.map_p(dict_value)) {
                                            stacks.stack_push(dict_value, stack);
                                        } else {
                                            if (dict_value.isCons()) {
                                                {
                                                    SubLObject key = dict_value.first();
                                                    SubLObject value = dict_value.rest();
                                                    keys = cons(key, keys);
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt49);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
                while (NIL == stacks.stack_empty_p(stack)) {
                    {
                        SubLObject entry = stacks.stack_pop(stack);
                        SubLObject iterator = map_utilities.new_map_iterator(entry);
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject var = iteration.iteration_next(iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject datum = var;
                                        SubLObject current = datum;
                                        SubLObject dict_key = NIL;
                                        SubLObject dict_value = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                        dict_key = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                        dict_value = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != map_utilities.map_p(dict_value)) {
                                                stacks.stack_push(dict_value, stack);
                                            } else {
                                                if (dict_value.isCons()) {
                                                    {
                                                        SubLObject key = dict_value.first();
                                                        SubLObject value = dict_value.rest();
                                                        keys = cons(key, keys);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt49);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } 
                return keys;
            }
        }
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return list; the list of all keys of STRIE
     * @unknown a new list is constructed that can be modified without modifying the STRIE
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return list; the list of all keys of STRIE\r\n@unknown a new list is constructed that can be modified without modifying the STRIE")
    public static SubLObject strie_keys(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        SubLObject keys = NIL;
        final SubLObject stack = stacks.create_stack();
        final SubLObject iterator = map_utilities.new_map_iterator(v_strie);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject dict_key = NIL;
                SubLObject dict_value = NIL;
                destructuring_bind_must_consp(current, datum, $list49);
                dict_key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list49);
                dict_value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != map_utilities.map_p(dict_value)) {
                        stacks.stack_push(dict_value, stack);
                    } else
                        if (dict_value.isCons()) {
                            final SubLObject key = dict_value.first();
                            final SubLObject value = dict_value.rest();
                            keys = cons(key, keys);
                        }

                } else {
                    cdestructuring_bind_error(datum, $list49);
                }
            }
        }
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
            SubLObject valid2;
            for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                thread.resetMultipleValues();
                final SubLObject var2 = iteration.iteration_next(iterator2);
                valid2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = var2;
                    SubLObject dict_key2 = NIL;
                    SubLObject dict_value2 = NIL;
                    destructuring_bind_must_consp(current2, datum2, $list49);
                    dict_key2 = current2.first();
                    current2 = current2.rest();
                    destructuring_bind_must_consp(current2, datum2, $list49);
                    dict_value2 = current2.first();
                    current2 = current2.rest();
                    if (NIL == current2) {
                        if (NIL != map_utilities.map_p(dict_value2)) {
                            stacks.stack_push(dict_value2, stack);
                        } else
                            if (dict_value2.isCons()) {
                                final SubLObject key2 = dict_value2.first();
                                final SubLObject value2 = dict_value2.rest();
                                keys = cons(key2, keys);
                            }

                    } else {
                        cdestructuring_bind_error(datum2, $list49);
                    }
                }
            }
        } 
        return keys;
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return list; the list of all values of STRIE
     * @unknown a new list is constructed that can be modified without modifying the STRIE
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return list; the list of all values of STRIE\r\n@unknown a new list is constructed that can be modified without modifying the STRIE")
    public static final SubLObject strie_values_alt(SubLObject v_strie) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_strie, STRIE_P);
            {
                SubLObject values = NIL;
                SubLObject stack = stacks.create_stack();
                {
                    SubLObject iterator = map_utilities.new_map_iterator(v_strie);
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = iteration.iteration_next(iterator);
                            SubLObject valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                {
                                    SubLObject datum = var;
                                    SubLObject current = datum;
                                    SubLObject dict_key = NIL;
                                    SubLObject dict_value = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt49);
                                    dict_key = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt49);
                                    dict_value = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != map_utilities.map_p(dict_value)) {
                                            stacks.stack_push(dict_value, stack);
                                        } else {
                                            if (dict_value.isCons()) {
                                                {
                                                    SubLObject key = dict_value.first();
                                                    SubLObject value = dict_value.rest();
                                                    values = cons(value, values);
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt49);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
                while (NIL == stacks.stack_empty_p(stack)) {
                    {
                        SubLObject entry = stacks.stack_pop(stack);
                        SubLObject iterator = map_utilities.new_map_iterator(entry);
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject var = iteration.iteration_next(iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject datum = var;
                                        SubLObject current = datum;
                                        SubLObject dict_key = NIL;
                                        SubLObject dict_value = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                        dict_key = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                        dict_value = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != map_utilities.map_p(dict_value)) {
                                                stacks.stack_push(dict_value, stack);
                                            } else {
                                                if (dict_value.isCons()) {
                                                    {
                                                        SubLObject key = dict_value.first();
                                                        SubLObject value = dict_value.rest();
                                                        values = cons(value, values);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt49);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } 
                return values;
            }
        }
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return list; the list of all values of STRIE
     * @unknown a new list is constructed that can be modified without modifying the STRIE
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return list; the list of all values of STRIE\r\n@unknown a new list is constructed that can be modified without modifying the STRIE")
    public static SubLObject strie_values(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        SubLObject values = NIL;
        final SubLObject stack = stacks.create_stack();
        final SubLObject iterator = map_utilities.new_map_iterator(v_strie);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject dict_key = NIL;
                SubLObject dict_value = NIL;
                destructuring_bind_must_consp(current, datum, $list49);
                dict_key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list49);
                dict_value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != map_utilities.map_p(dict_value)) {
                        stacks.stack_push(dict_value, stack);
                    } else
                        if (dict_value.isCons()) {
                            final SubLObject key = dict_value.first();
                            final SubLObject value = dict_value.rest();
                            values = cons(value, values);
                        }

                } else {
                    cdestructuring_bind_error(datum, $list49);
                }
            }
        }
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
            SubLObject valid2;
            for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                thread.resetMultipleValues();
                final SubLObject var2 = iteration.iteration_next(iterator2);
                valid2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = var2;
                    SubLObject dict_key2 = NIL;
                    SubLObject dict_value2 = NIL;
                    destructuring_bind_must_consp(current2, datum2, $list49);
                    dict_key2 = current2.first();
                    current2 = current2.rest();
                    destructuring_bind_must_consp(current2, datum2, $list49);
                    dict_value2 = current2.first();
                    current2 = current2.rest();
                    if (NIL == current2) {
                        if (NIL != map_utilities.map_p(dict_value2)) {
                            stacks.stack_push(dict_value2, stack);
                        } else
                            if (dict_value2.isCons()) {
                                final SubLObject key2 = dict_value2.first();
                                final SubLObject value2 = dict_value2.rest();
                                values = cons(value2, values);
                            }

                    } else {
                        cdestructuring_bind_error(datum2, $list49);
                    }
                }
            }
        } 
        return values;
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return list; the list of all entries (key-value pairs) of STRIE
     * @unknown trie usage often requires to not only return the value but also the key
     * @unknown a new list is constructed that can be modified without modifying the STRIE
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return list; the list of all entries (key-value pairs) of STRIE\r\n@unknown trie usage often requires to not only return the value but also the key\r\n@unknown a new list is constructed that can be modified without modifying the STRIE")
    public static final SubLObject strie_entries_alt(SubLObject v_strie) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_strie, STRIE_P);
            {
                SubLObject entries = NIL;
                SubLObject stack = stacks.create_stack();
                {
                    SubLObject iterator = map_utilities.new_map_iterator(v_strie);
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = iteration.iteration_next(iterator);
                            SubLObject valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                {
                                    SubLObject datum = var;
                                    SubLObject current = datum;
                                    SubLObject dict_key = NIL;
                                    SubLObject dict_value = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt49);
                                    dict_key = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt49);
                                    dict_value = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != map_utilities.map_p(dict_value)) {
                                            stacks.stack_push(dict_value, stack);
                                        } else {
                                            if (dict_value.isCons()) {
                                                {
                                                    SubLObject key = dict_value.first();
                                                    SubLObject value = dict_value.rest();
                                                    entries = cons(cons(key, value), entries);
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt49);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
                while (NIL == stacks.stack_empty_p(stack)) {
                    {
                        SubLObject entry = stacks.stack_pop(stack);
                        SubLObject iterator = map_utilities.new_map_iterator(entry);
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject var = iteration.iteration_next(iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject datum = var;
                                        SubLObject current = datum;
                                        SubLObject dict_key = NIL;
                                        SubLObject dict_value = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                        dict_key = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                        dict_value = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != map_utilities.map_p(dict_value)) {
                                                stacks.stack_push(dict_value, stack);
                                            } else {
                                                if (dict_value.isCons()) {
                                                    {
                                                        SubLObject key = dict_value.first();
                                                        SubLObject value = dict_value.rest();
                                                        entries = cons(cons(key, value), entries);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt49);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } 
                return entries;
            }
        }
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @return list; the list of all entries (key-value pairs) of STRIE
     * @unknown trie usage often requires to not only return the value but also the key
     * @unknown a new list is constructed that can be modified without modifying the STRIE
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@return list; the list of all entries (key-value pairs) of STRIE\r\n@unknown trie usage often requires to not only return the value but also the key\r\n@unknown a new list is constructed that can be modified without modifying the STRIE")
    public static SubLObject strie_entries(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        SubLObject entries = NIL;
        final SubLObject stack = stacks.create_stack();
        final SubLObject iterator = map_utilities.new_map_iterator(v_strie);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject dict_key = NIL;
                SubLObject dict_value = NIL;
                destructuring_bind_must_consp(current, datum, $list49);
                dict_key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list49);
                dict_value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != map_utilities.map_p(dict_value)) {
                        stacks.stack_push(dict_value, stack);
                    } else
                        if (dict_value.isCons()) {
                            final SubLObject key = dict_value.first();
                            final SubLObject value = dict_value.rest();
                            entries = cons(cons(key, value), entries);
                        }

                } else {
                    cdestructuring_bind_error(datum, $list49);
                }
            }
        }
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
            SubLObject valid2;
            for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                thread.resetMultipleValues();
                final SubLObject var2 = iteration.iteration_next(iterator2);
                valid2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = var2;
                    SubLObject dict_key2 = NIL;
                    SubLObject dict_value2 = NIL;
                    destructuring_bind_must_consp(current2, datum2, $list49);
                    dict_key2 = current2.first();
                    current2 = current2.rest();
                    destructuring_bind_must_consp(current2, datum2, $list49);
                    dict_value2 = current2.first();
                    current2 = current2.rest();
                    if (NIL == current2) {
                        if (NIL != map_utilities.map_p(dict_value2)) {
                            stacks.stack_push(dict_value2, stack);
                        } else
                            if (dict_value2.isCons()) {
                                final SubLObject key2 = dict_value2.first();
                                final SubLObject value2 = dict_value2.rest();
                                entries = cons(cons(key2, value2), entries);
                            }

                    } else {
                        cdestructuring_bind_error(datum2, $list49);
                    }
                }
            }
        } 
        return entries;
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @param KEY
    sequence
     * 		
     * @return list; the list of all entries in STRIE in decreasing length that are indexed
    under a key which is a prefix of KEY
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@param KEY\nsequence\r\n\t\t\r\n@return list; the list of all entries in STRIE in decreasing length that are indexed\r\nunder a key which is a prefix of KEY")
    public static final SubLObject strie_prefixes_alt(SubLObject v_strie, SubLObject key) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        SubLTrampolineFile.checkType(key, STRIE_KEY_P);
        {
            SubLObject results = NIL;
            SubLObject node = v_strie;
            SubLObject prefix_node = NIL;
            SubLObject key_element = NIL;
            SubLObject remaining_key = NIL;
            for (key_element = com.cyc.cycjava.cycl.strie.element(key, ZERO_INTEGER), remaining_key = com.cyc.cycjava.cycl.strie.sequence_slice(key, ONE_INTEGER, UNPROVIDED); !((NIL == node) || node.isCons()); key_element = com.cyc.cycjava.cycl.strie.element(remaining_key, ZERO_INTEGER) , remaining_key = com.cyc.cycjava.cycl.strie.sequence_slice(remaining_key, ONE_INTEGER, UNPROVIDED)) {
                if (NIL != map_utilities.map_p(node)) {
                    prefix_node = map_utilities.map_get_without_values(node, $strie_null_key$.getGlobalValue(), UNPROVIDED);
                    if (NIL != prefix_node) {
                        results = cons(prefix_node, results);
                    }
                }
                node = map_utilities.map_get_without_values(node, key_element, UNPROVIDED);
            }
            if ((NIL != node) && (NIL != com.cyc.cycjava.cycl.strie.sequal(node.first(), com.cyc.cycjava.cycl.strie.sequence_slice(key, ZERO_INTEGER, length(node.first())), com.cyc.cycjava.cycl.strie.strie_test(v_strie)))) {
                results = cons(node, results);
            }
            return results;
        }
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @param KEY
    sequence
     * 		
     * @return list; the list of all entries in STRIE in decreasing length that are indexed
    under a key which is a prefix of KEY
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@param KEY\nsequence\r\n\t\t\r\n@return list; the list of all entries in STRIE in decreasing length that are indexed\r\nunder a key which is a prefix of KEY")
    public static SubLObject strie_prefixes(final SubLObject v_strie, final SubLObject key) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        assert NIL != strie_key_p(key) : "! strie.strie_key_p(key) " + ("strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) ") + key;
        SubLObject results = NIL;
        SubLObject node = v_strie;
        SubLObject prefix_node = NIL;
        SubLObject key_element;
        SubLObject remaining_key;
        for (key_element = NIL, remaining_key = NIL, key_element = element(key, ZERO_INTEGER), remaining_key = sequence_slice(key, ONE_INTEGER, UNPROVIDED); (NIL != node) && (!node.isCons()); node = map_utilities.map_get_without_values(node, key_element, UNPROVIDED) , key_element = element(remaining_key, ZERO_INTEGER) , remaining_key = sequence_slice(remaining_key, ONE_INTEGER, UNPROVIDED)) {
            if (NIL != map_utilities.map_p(node)) {
                prefix_node = map_utilities.map_get_without_values(node, $strie_null_key$.getGlobalValue(), UNPROVIDED);
                if (NIL != prefix_node) {
                    results = cons(prefix_node, results);
                }
            }
        }
        if ((NIL != node) && (NIL != sequal(node.first(), sequence_slice(key, ZERO_INTEGER, length(node.first())), strie_test(v_strie)))) {
            results = cons(node, results);
        }
        return results;
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @param key
    list
     * 		
     * @return list; a list of all entries in STRIE (in no particular order) that are indexed
    under a key that has KEY as its prefix
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@param key\nlist\r\n\t\t\r\n@return list; a list of all entries in STRIE (in no particular order) that are indexed\r\nunder a key that has KEY as its prefix")
    public static final SubLObject strie_completions_alt(SubLObject v_strie, SubLObject key) {
        SubLTrampolineFile.checkType(v_strie, STRIE_P);
        SubLTrampolineFile.checkType(key, STRIE_KEY_P);
        {
            SubLObject node = v_strie;
            SubLObject key_element = NIL;
            SubLObject remaining_key = NIL;
            for (key_element = com.cyc.cycjava.cycl.strie.element(key, ZERO_INTEGER), remaining_key = com.cyc.cycjava.cycl.strie.sequence_slice(key, ONE_INTEGER, UNPROVIDED); !(((NIL == node) || node.isCons()) || (NIL == key_element)); key_element = (length(remaining_key).numG(ZERO_INTEGER)) ? ((SubLObject) (com.cyc.cycjava.cycl.strie.element(remaining_key, ZERO_INTEGER))) : NIL , remaining_key = com.cyc.cycjava.cycl.strie.sequence_slice(remaining_key, ONE_INTEGER, UNPROVIDED)) {
                node = map_utilities.map_get_without_values(node, key_element, UNPROVIDED);
            }
            if (NIL == node) {
                return NIL;
            } else {
                if (node.isCons() && (NIL != com.cyc.cycjava.cycl.strie.sequal(com.cyc.cycjava.cycl.strie.sequence_slice(node.first(), ZERO_INTEGER, length(key)), key, com.cyc.cycjava.cycl.strie.strie_test(v_strie)))) {
                    return list(node);
                } else {
                    if (NIL != map_utilities.map_p(node)) {
                        return com.cyc.cycjava.cycl.strie.strie_entries(node);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @param key
    list
     * 		
     * @return list; a list of all entries in STRIE (in no particular order) that are indexed
    under a key that has KEY as its prefix
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@param key\nlist\r\n\t\t\r\n@return list; a list of all entries in STRIE (in no particular order) that are indexed\r\nunder a key that has KEY as its prefix")
    public static SubLObject strie_completions(final SubLObject v_strie, final SubLObject key) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        assert NIL != strie_key_p(key) : "! strie.strie_key_p(key) " + ("strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) ") + key;
        SubLObject node;
        SubLObject key_element;
        SubLObject remaining_key;
        for (node = v_strie, key_element = NIL, remaining_key = NIL, key_element = element(key, ZERO_INTEGER), remaining_key = sequence_slice(key, ONE_INTEGER, UNPROVIDED); ((NIL != node) && (!node.isCons())) && (NIL != key_element); node = map_utilities.map_get_without_values(node, key_element, UNPROVIDED) , key_element = (length(remaining_key).numG(ZERO_INTEGER)) ? element(remaining_key, ZERO_INTEGER) : NIL , remaining_key = sequence_slice(remaining_key, ONE_INTEGER, UNPROVIDED)) {
        }
        if (NIL == node) {
            return NIL;
        }
        if (node.isCons() && (NIL != sequal(sequence_slice(node.first(), ZERO_INTEGER, length(key)), key, strie_test(v_strie)))) {
            return list(node);
        }
        if (NIL != map_utilities.map_p(node)) {
            return strie_entries(node);
        }
        return NIL;
    }

    /**
     *
     *
     * @param STRIE
    strie
     * 		
     * @param FUNCTION
    function
     * 		
     * @return NIL
    Map across STRIE, calling FUNCTION on each key-value pair. FUNCTION should have
    the lambda list (function key value).
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@param FUNCTION\nfunction\r\n\t\t\r\n@return NIL\r\nMap across STRIE, calling FUNCTION on each key-value pair. FUNCTION should have\r\nthe lambda list (function key value).")
    public static final SubLObject map_strie_alt(SubLObject v_strie, SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_strie, STRIE_P);
            SubLTrampolineFile.checkType(function, FUNCTIONP);
            {
                SubLObject stack = stacks.create_stack();
                {
                    SubLObject iterator = map_utilities.new_map_iterator(v_strie);
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = iteration.iteration_next(iterator);
                            SubLObject valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                {
                                    SubLObject datum = var;
                                    SubLObject current = datum;
                                    SubLObject dict_key = NIL;
                                    SubLObject dict_value = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt49);
                                    dict_key = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt49);
                                    dict_value = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL != map_utilities.map_p(dict_value)) {
                                            stacks.stack_push(dict_value, stack);
                                        } else {
                                            if (dict_value.isCons()) {
                                                {
                                                    SubLObject key = dict_value.first();
                                                    SubLObject value = dict_value.rest();
                                                    funcall(function, key, value);
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt49);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
                while (NIL == stacks.stack_empty_p(stack)) {
                    {
                        SubLObject entry = stacks.stack_pop(stack);
                        SubLObject iterator = map_utilities.new_map_iterator(entry);
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject var = iteration.iteration_next(iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject datum = var;
                                        SubLObject current = datum;
                                        SubLObject dict_key = NIL;
                                        SubLObject dict_value = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                        dict_key = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt49);
                                        dict_value = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL != map_utilities.map_p(dict_value)) {
                                                stacks.stack_push(dict_value, stack);
                                            } else {
                                                if (dict_value.isCons()) {
                                                    {
                                                        SubLObject key = dict_value.first();
                                                        SubLObject value = dict_value.rest();
                                                        funcall(function, key, value);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt49);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
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
     * @param STRIE
    strie
     * 		
     * @param FUNCTION
    function
     * 		
     * @return NIL
    Map across STRIE, calling FUNCTION on each key-value pair. FUNCTION should have
    the lambda list (function key value).
     */
    @LispMethod(comment = "@param STRIE\nstrie\r\n\t\t\r\n@param FUNCTION\nfunction\r\n\t\t\r\n@return NIL\r\nMap across STRIE, calling FUNCTION on each key-value pair. FUNCTION should have\r\nthe lambda list (function key value).")
    public static SubLObject map_strie(final SubLObject v_strie, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        assert NIL != functionp(function) : "! functionp(function) " + ("Types.functionp(function) " + "CommonSymbols.NIL != Types.functionp(function) ") + function;
        final SubLObject stack = stacks.create_stack();
        final SubLObject iterator = map_utilities.new_map_iterator(v_strie);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject dict_key = NIL;
                SubLObject dict_value = NIL;
                destructuring_bind_must_consp(current, datum, $list49);
                dict_key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list49);
                dict_value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != map_utilities.map_p(dict_value)) {
                        stacks.stack_push(dict_value, stack);
                    } else
                        if (dict_value.isCons()) {
                            final SubLObject key = dict_value.first();
                            final SubLObject value = dict_value.rest();
                            funcall(function, key, value);
                        }

                } else {
                    cdestructuring_bind_error(datum, $list49);
                }
            }
        }
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
            SubLObject valid2;
            for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                thread.resetMultipleValues();
                final SubLObject var2 = iteration.iteration_next(iterator2);
                valid2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = var2;
                    SubLObject dict_key2 = NIL;
                    SubLObject dict_value2 = NIL;
                    destructuring_bind_must_consp(current2, datum2, $list49);
                    dict_key2 = current2.first();
                    current2 = current2.rest();
                    destructuring_bind_must_consp(current2, datum2, $list49);
                    dict_value2 = current2.first();
                    current2 = current2.rest();
                    if (NIL == current2) {
                        if (NIL != map_utilities.map_p(dict_value2)) {
                            stacks.stack_push(dict_value2, stack);
                        } else
                            if (dict_value2.isCons()) {
                                final SubLObject key2 = dict_value2.first();
                                final SubLObject value2 = dict_value2.rest();
                                funcall(function, key2, value2);
                            }

                    } else {
                        cdestructuring_bind_error(datum2, $list49);
                    }
                }
            }
        } 
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t if THING is a valid strie key and nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if THING is a valid strie key and nil otherwise")
    public static final SubLObject strie_key_p_alt(SubLObject v_object) {
        if (v_object.isList()) {
            return makeBoolean(NIL == subl_promotions.memberP($strie_null_key$.getGlobalValue(), v_object, symbol_function(EQUAL), UNPROVIDED));
        } else {
            if (v_object.isString()) {
                return makeBoolean(NIL == string_utilities.char_position($strie_null_key$.getGlobalValue(), v_object, UNPROVIDED));
            } else {
                if (v_object.isVector()) {
                    return makeBoolean(NIL == subl_promotions.memberP($strie_null_key$.getGlobalValue(), vector_utilities.vector_elements(v_object, UNPROVIDED), UNPROVIDED, UNPROVIDED));
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return boolean; t if THING is a valid strie key and nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if THING is a valid strie key and nil otherwise")
    public static SubLObject strie_key_p(final SubLObject v_object) {
        if (v_object.isList()) {
            return makeBoolean(NIL == subl_promotions.memberP($strie_null_key$.getGlobalValue(), v_object, symbol_function(EQUAL), UNPROVIDED));
        }
        if (v_object.isString()) {
            return makeBoolean(NIL == string_utilities.char_position($strie_null_key$.getGlobalValue(), v_object, UNPROVIDED));
        }
        if (v_object.isVector()) {
            return makeBoolean(NIL == subl_promotions.memberP($strie_null_key$.getGlobalValue(), vector_utilities.vector_elements(v_object, UNPROVIDED), UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    /**
     * Visit the STRIE according to the hierarchical visitor pattern, invoking
     * the VISITOR's callbacks on the paths and their values
     * as appropriate
     *
     * @return the VISITOR
     */
    @LispMethod(comment = "Visit the STRIE according to the hierarchical visitor pattern, invoking\r\nthe VISITOR\'s callbacks on the paths and their values\r\nas appropriate\r\n\r\n@return the VISITOR\nVisit the STRIE according to the hierarchical visitor pattern, invoking\nthe VISITOR\'s callbacks on the paths and their values\nas appropriate")
    public static final SubLObject visit_strie_hierarchically_alt(SubLObject v_strie, SubLObject visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_strie, STRIE_P);
            SubLTrampolineFile.checkType(visitor, HIERARCHICAL_VISITOR_P);
            hierarchical_visitor.hierarchical_visitor_begin_visit(visitor);
            {
                SubLObject stack = stacks.create_stack();
                stacks.stack_push(list($VISIT, NIL, v_strie), stack);
                while (NIL == stacks.stack_empty_p(stack)) {
                    {
                        SubLObject current_task = stacks.stack_pop(stack);
                        SubLObject datum = current_task;
                        SubLObject current = datum;
                        SubLObject task = NIL;
                        SubLObject path = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt56);
                        task = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt56);
                        path = current.first();
                        current = current.rest();
                        {
                            SubLObject v_strie_3 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt56);
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject pcase_var = task;
                                    if (pcase_var.eql($VISIT)) {
                                        hierarchical_visitor.show_hierarchical_visitor_path_begin(visitor, path);
                                        stacks.stack_push(list($FINISH, path), stack);
                                        {
                                            SubLObject iterator = map_utilities.new_map_iterator(v_strie_3);
                                            SubLObject done_var = NIL;
                                            while (NIL == done_var) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject var = iteration.iteration_next(iterator);
                                                    SubLObject valid = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject datum_4 = var;
                                                            SubLObject current_5 = datum_4;
                                                            SubLObject dict_key = NIL;
                                                            SubLObject payload = NIL;
                                                            destructuring_bind_must_consp(current_5, datum_4, $list_alt58);
                                                            dict_key = current_5.first();
                                                            current_5 = current_5.rest();
                                                            destructuring_bind_must_consp(current_5, datum_4, $list_alt58);
                                                            payload = current_5.first();
                                                            current_5 = current_5.rest();
                                                            if (NIL == current_5) {
                                                                if (NIL != map_utilities.map_p(payload)) {
                                                                    {
                                                                        SubLObject new_path = cons(dict_key, path);
                                                                        SubLObject new_task = list($VISIT, new_path, payload);
                                                                        stacks.stack_push(new_task, stack);
                                                                    }
                                                                } else {
                                                                    if (payload.isCons()) {
                                                                        {
                                                                            SubLObject value = cons(dict_key, payload);
                                                                            hierarchical_visitor.show_hierarchical_visitor_node(visitor, value);
                                                                        }
                                                                    } else {
                                                                        Errors.error($str_alt59$Invalid_STRIE_entry__A_____neithe, payload);
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum_4, $list_alt58);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    } else {
                                        if (pcase_var.eql($FINISH)) {
                                            hierarchical_visitor.show_hierarchical_visitor_path_end(visitor, path);
                                        } else {
                                            Errors.error($str_alt60$Invalid_state_transition__A_in_vi, current_task);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt56);
                            }
                        }
                    }
                } 
            }
            hierarchical_visitor.hierarchical_visitor_end_visit(visitor);
            return visitor;
        }
    }

    @LispMethod(comment = "Visit the STRIE according to the hierarchical visitor pattern, invoking\r\nthe VISITOR\'s callbacks on the paths and their values\r\nas appropriate\r\n\r\n@return the VISITOR\nVisit the STRIE according to the hierarchical visitor pattern, invoking\nthe VISITOR\'s callbacks on the paths and their values\nas appropriate")
    public static SubLObject visit_strie_hierarchically(final SubLObject v_strie, final SubLObject visitor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "! strie.strie_p(v_strie, .UNPROVIDED) " + ("strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) ") + v_strie;
        assert NIL != hierarchical_visitor.hierarchical_visitor_p(visitor) : "! hierarchical_visitor.hierarchical_visitor_p(visitor) " + ("hierarchical_visitor.hierarchical_visitor_p(visitor) " + "CommonSymbols.NIL != hierarchical_visitor.hierarchical_visitor_p(visitor) ") + visitor;
        hierarchical_visitor.hierarchical_visitor_begin_visit(visitor);
        final SubLObject stack = stacks.create_stack();
        stacks.stack_push(list($VISIT, NIL, v_strie), stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            final SubLObject current_task = stacks.stack_pop(stack);
            SubLObject current;
            final SubLObject datum = current = current_task;
            SubLObject task = NIL;
            SubLObject path = NIL;
            destructuring_bind_must_consp(current, datum, $list56);
            task = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list56);
            path = current.first();
            current = current.rest();
            final SubLObject v_strie_$3 = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list56);
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = task;
                if (pcase_var.eql($VISIT)) {
                    hierarchical_visitor.show_hierarchical_visitor_path_begin(visitor, path);
                    stacks.stack_push(list($FINISH, path), stack);
                    final SubLObject iterator = map_utilities.new_map_iterator(v_strie_$3);
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current_$5;
                            final SubLObject datum_$4 = current_$5 = var;
                            SubLObject dict_key = NIL;
                            SubLObject payload = NIL;
                            destructuring_bind_must_consp(current_$5, datum_$4, $list58);
                            dict_key = current_$5.first();
                            current_$5 = current_$5.rest();
                            destructuring_bind_must_consp(current_$5, datum_$4, $list58);
                            payload = current_$5.first();
                            current_$5 = current_$5.rest();
                            if (NIL == current_$5) {
                                if (NIL != map_utilities.map_p(payload)) {
                                    final SubLObject new_path = cons(dict_key, path);
                                    final SubLObject new_task = list($VISIT, new_path, payload);
                                    stacks.stack_push(new_task, stack);
                                } else
                                    if (payload.isCons()) {
                                        final SubLObject value = cons(dict_key, payload);
                                        hierarchical_visitor.show_hierarchical_visitor_node(visitor, value);
                                    } else {
                                        Errors.error($str59$Invalid_STRIE_entry__A_____neithe, payload);
                                    }

                            } else {
                                cdestructuring_bind_error(datum_$4, $list58);
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($FINISH)) {
                        hierarchical_visitor.show_hierarchical_visitor_path_end(visitor, path);
                    } else {
                        Errors.error($str60$Invalid_state_transition__A_in_vi, current_task);
                    }

            } else {
                cdestructuring_bind_error(datum, $list56);
            }
        } 
        hierarchical_visitor.hierarchical_visitor_end_visit(visitor);
        return visitor;
    }/**
     * Visit the STRIE according to the hierarchical visitor pattern, invoking
     * the VISITOR's callbacks on the paths and their values
     * as appropriate
     *
     * @return the VISITOR
     */


    /**
     *
     *
     * @return boolean; t if THING is either an strie or info-node and nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if THING is either an strie or info-node and nil otherwise")
    public static final SubLObject strie_p_internal_alt(SubLObject v_object) {
        return makeBoolean(v_object.isCons() || ((NIL != map_utilities.map_p(v_object)) && (NIL == list_utilities.find_if_not(symbol_function(STRIE_P_INTERNAL), map_utilities.map_values(v_object), UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    /**
     *
     *
     * @return boolean; t if THING is either an strie or info-node and nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if THING is either an strie or info-node and nil otherwise")
    public static SubLObject strie_p_internal(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() || ((NIL != map_utilities.map_p(v_object)) && (NIL == list_utilities.find_if_not(symbol_function(STRIE_P_INTERNAL), map_utilities.map_values(v_object), UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    /**
     * Insert an info-node with key INTERNAL-KEY and value VALUE under key SEQUENCE in
     * STRIE at level DEPTH
     *
     * @param STRIE
    strie
     * 		
     * @param SEQUENCE
    sequence
     * 		
     * @param VALUE
    object
     * 		
     * @param DEPTH
    integer
     * 		
     * @param INTERNAL-KEY
    sequence;
     * 		
     * @return keyword; :created if insertion was successful and did not require splicing
    and extending the trie, :added if a value for key already existed and was replaced
    by VALUE, and :spliced if the the trie needed to be spliced for the insertion
     */
    @LispMethod(comment = "Insert an info-node with key INTERNAL-KEY and value VALUE under key SEQUENCE in\r\nSTRIE at level DEPTH\r\n\r\n@param STRIE\nstrie\r\n\t\t\r\n@param SEQUENCE\nsequence\r\n\t\t\r\n@param VALUE\nobject\r\n\t\t\r\n@param DEPTH\ninteger\r\n\t\t\r\n@param INTERNAL-KEY\nsequence;\r\n\t\t\r\n@return keyword; :created if insertion was successful and did not require splicing\r\nand extending the trie, :added if a value for key already existed and was replaced\r\nby VALUE, and :spliced if the the trie needed to be spliced for the insertion\nInsert an info-node with key INTERNAL-KEY and value VALUE under key SEQUENCE in\nSTRIE at level DEPTH")
    public static final SubLObject strie_insert_internal_alt(SubLObject v_strie, SubLObject sequence, SubLObject value, SubLObject depth, SubLObject internal_key) {
        {
            SubLObject key_element = com.cyc.cycjava.cycl.strie.element(sequence, ZERO_INTEGER);
            SubLObject found = map_utilities.map_get_without_values(v_strie, key_element, UNPROVIDED);
            if (NIL == found) {
                map_utilities.map_put(v_strie, key_element, cons(internal_key, value));
                return $CREATED;
            } else {
                if (NIL != map_utilities.map_p(found)) {
                    {
                        SubLObject result = com.cyc.cycjava.cycl.strie.strie_insert_internal(found, com.cyc.cycjava.cycl.strie.sequence_slice(sequence, ONE_INTEGER, UNPROVIDED), value, add(depth, ONE_INTEGER), internal_key);
                        map_utilities.map_touch(v_strie, key_element);
                        return result;
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.strie.sequal(internal_key, found.first(), com.cyc.cycjava.cycl.strie.strie_test(v_strie))) {
                        map_utilities.map_put(v_strie, key_element, cons(internal_key, append(value, found.rest())));
                        return $ADDED;
                    } else {
                        {
                            SubLObject sub_trie = dictionary.new_dictionary(com.cyc.cycjava.cycl.strie.strie_test(v_strie), UNPROVIDED);
                            map_utilities.map_put(v_strie, key_element, sub_trie);
                            com.cyc.cycjava.cycl.strie.strie_insert_internal(sub_trie, com.cyc.cycjava.cycl.strie.sequence_slice(com.cyc.cycjava.cycl.strie.sequence_null_pad(found.first()), depth, UNPROVIDED), found.rest(), add(depth, ONE_INTEGER), found.first());
                            com.cyc.cycjava.cycl.strie.strie_insert_internal(sub_trie, com.cyc.cycjava.cycl.strie.sequence_slice(sequence, ONE_INTEGER, UNPROVIDED), value, add(depth, ONE_INTEGER), internal_key);
                        }
                        return $SPLICED;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Insert an info-node with key INTERNAL-KEY and value VALUE under key SEQUENCE in\r\nSTRIE at level DEPTH\r\n\r\n@param STRIE\n\t\tstrie\r\n\t\t\r\n@param SEQUENCE\n\t\tsequence\r\n\t\t\r\n@param VALUE\n\t\tobject\r\n\t\t\r\n@param DEPTH\n\t\tinteger\r\n\t\t\r\n@param INTERNAL-KEY\n\t\tsequence;\r\n\t\t\r\n@return keyword; :created if insertion was successful and did not require splicing\r\nand extending the trie, :added if a value for key already existed and was replaced\r\nby VALUE, and :spliced if the the trie needed to be spliced for the insertion\nInsert an info-node with key INTERNAL-KEY and value VALUE under key SEQUENCE in\nSTRIE at level DEPTH")
    public static SubLObject strie_insert_internal(final SubLObject v_strie, final SubLObject sequence, final SubLObject value, final SubLObject depth, final SubLObject internal_key) {
        final SubLObject key_element = element(sequence, ZERO_INTEGER);
        final SubLObject found = map_utilities.map_get_without_values(v_strie, key_element, UNPROVIDED);
        if (NIL == found) {
            map_utilities.map_put(v_strie, key_element, cons(internal_key, value));
            return $CREATED;
        }
        if (NIL != map_utilities.map_p(found)) {
            final SubLObject result = strie_insert_internal(found, sequence_slice(sequence, ONE_INTEGER, UNPROVIDED), value, add(depth, ONE_INTEGER), internal_key);
            map_utilities.map_touch(v_strie, key_element);
            return result;
        }
        if (NIL != sequal(internal_key, found.first(), strie_test(v_strie))) {
            map_utilities.map_put(v_strie, key_element, cons(internal_key, append(value, found.rest())));
            return $ADDED;
        }
        final SubLObject sub_trie = dictionary.new_dictionary(strie_test(v_strie), UNPROVIDED);
        map_utilities.map_put(v_strie, key_element, sub_trie);
        strie_insert_internal(sub_trie, sequence_slice(sequence_null_pad(found.first()), depth, UNPROVIDED), found.rest(), add(depth, ONE_INTEGER), found.first());
        strie_insert_internal(sub_trie, sequence_slice(sequence, ONE_INTEGER, UNPROVIDED), value, add(depth, ONE_INTEGER), internal_key);
        return $SPLICED;
    }/**
     * Insert an info-node with key INTERNAL-KEY and value VALUE under key SEQUENCE in
     * STRIE at level DEPTH
     *
     * @param STRIE
    		strie
     * 		
     * @param SEQUENCE
    		sequence
     * 		
     * @param VALUE
    		object
     * 		
     * @param DEPTH
    		integer
     * 		
     * @param INTERNAL-KEY
    		sequence;
     * 		
     * @return keyword; :created if insertion was successful and did not require splicing
    and extending the trie, :added if a value for key already existed and was replaced
    by VALUE, and :spliced if the the trie needed to be spliced for the insertion
     */


    /**
     * Delete the entry for STRINGS in STRIE, shrinking STRIE as appropriate
     *
     * @param STRIE
    strie
     * 		
     * @param INTERNAL-KEY
    sequence
     * 		
     * @return keyword; :void if the entry was not found, :removed if the entry was
    successfully removed without shrinking the trie, and :shrunk if the entry was removed
    and the trie was shrunk
     */
    @LispMethod(comment = "Delete the entry for STRINGS in STRIE, shrinking STRIE as appropriate\r\n\r\n@param STRIE\nstrie\r\n\t\t\r\n@param INTERNAL-KEY\nsequence\r\n\t\t\r\n@return keyword; :void if the entry was not found, :removed if the entry was\r\nsuccessfully removed without shrinking the trie, and :shrunk if the entry was removed\r\nand the trie was shrunk")
    public static final SubLObject strie_remove_internal_alt(SubLObject v_strie, SubLObject sequence, SubLObject internal_key) {
        {
            SubLObject key_element = com.cyc.cycjava.cycl.strie.element(sequence, ZERO_INTEGER);
            SubLObject found = map_utilities.map_get_without_values(v_strie, key_element, UNPROVIDED);
            SubLObject result = NIL;
            if (NIL == found) {
                return $VOID;
            } else {
                if (NIL != map_utilities.map_p(found)) {
                    result = com.cyc.cycjava.cycl.strie.strie_remove_internal(found, com.cyc.cycjava.cycl.strie.sequence_slice(sequence, ONE_INTEGER, UNPROVIDED), internal_key);
                    if (NIL != com.cyc.cycjava.cycl.strie.strie_modified_in_removal_p(result)) {
                        if (map_utilities.map_size(found).numE(ONE_INTEGER)) {
                            {
                                SubLObject values = map_utilities.map_values(found);
                                if (values.first().isCons()) {
                                    map_utilities.map_put(v_strie, key_element, values.first());
                                    result = $SHRUNK;
                                } else {
                                    map_utilities.map_touch(v_strie, key_element);
                                }
                            }
                        } else {
                            if (NIL != map_utilities.map_empty_p(found)) {
                                map_utilities.map_remove(v_strie, key_element);
                                result = $SHRUNK;
                            } else {
                                map_utilities.map_touch(v_strie, key_element);
                            }
                        }
                    }
                    return result;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.strie.sequal(internal_key, found.first(), com.cyc.cycjava.cycl.strie.strie_test(v_strie))) {
                        map_utilities.map_remove(v_strie, key_element);
                        return $REMOVED;
                    } else {
                        return $VOID;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Delete the entry for STRINGS in STRIE, shrinking STRIE as appropriate\r\n\r\n@param STRIE\n\t\tstrie\r\n\t\t\r\n@param INTERNAL-KEY\n\t\tsequence\r\n\t\t\r\n@return keyword; :void if the entry was not found, :removed if the entry was\r\nsuccessfully removed without shrinking the trie, and :shrunk if the entry was removed\r\nand the trie was shrunk")
    public static SubLObject strie_remove_internal(final SubLObject v_strie, final SubLObject sequence, final SubLObject internal_key) {
        final SubLObject key_element = element(sequence, ZERO_INTEGER);
        final SubLObject found = map_utilities.map_get_without_values(v_strie, key_element, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL == found) {
            return $VOID;
        }
        if (NIL != map_utilities.map_p(found)) {
            result = strie_remove_internal(found, sequence_slice(sequence, ONE_INTEGER, UNPROVIDED), internal_key);
            if (NIL != strie_modified_in_removal_p(result)) {
                if (map_utilities.map_size(found).numE(ONE_INTEGER)) {
                    final SubLObject values = map_utilities.map_values(found);
                    if (values.first().isCons()) {
                        map_utilities.map_put(v_strie, key_element, values.first());
                        result = $SHRUNK;
                    } else {
                        map_utilities.map_touch(v_strie, key_element);
                    }
                } else
                    if (NIL != map_utilities.map_empty_p(found)) {
                        map_utilities.map_remove(v_strie, key_element);
                        result = $SHRUNK;
                    } else {
                        map_utilities.map_touch(v_strie, key_element);
                    }

            }
            return result;
        }
        if (NIL != sequal(internal_key, found.first(), strie_test(v_strie))) {
            map_utilities.map_remove(v_strie, key_element);
            return $REMOVED;
        }
        return $VOID;
    }/**
     * Delete the entry for STRINGS in STRIE, shrinking STRIE as appropriate
     *
     * @param STRIE
    		strie
     * 		
     * @param INTERNAL-KEY
    		sequence
     * 		
     * @return keyword; :void if the entry was not found, :removed if the entry was
    successfully removed without shrinking the trie, and :shrunk if the entry was removed
    and the trie was shrunk
     */


    /**
     * Determine if the REMOVAL caused any modifications to the trie.
     */
    @LispMethod(comment = "Determine if the REMOVAL caused any modifications to the trie.")
    public static final SubLObject strie_modified_in_removal_p_alt(SubLObject result) {
        return makeBoolean(($REMOVED == result) || ($SHRUNK == result));
    }

    @LispMethod(comment = "Determine if the REMOVAL caused any modifications to the trie.")
    public static SubLObject strie_modified_in_removal_p(final SubLObject result) {
        return makeBoolean(($REMOVED == result) || ($SHRUNK == result));
    }/**
     * Determine if the REMOVAL caused any modifications to the trie.
     */


    /**
     *
     *
     * @return object; the INDEXth element of SEQUENCE, nil if SEQUENCE is nil
     */
    @LispMethod(comment = "@return object; the INDEXth element of SEQUENCE, nil if SEQUENCE is nil")
    public static final SubLObject element_alt(SubLObject sequence, SubLObject index) {
        return NIL != sequence ? ((SubLObject) (elt(sequence, index))) : NIL;
    }

    /**
     *
     *
     * @return object; the INDEXth element of SEQUENCE, nil if SEQUENCE is nil
     */
    @LispMethod(comment = "@return object; the INDEXth element of SEQUENCE, nil if SEQUENCE is nil")
    public static SubLObject element(final SubLObject sequence, final SubLObject index) {
        return NIL != sequence ? elt(sequence, index) : NIL;
    }

    /**
     *
     *
     * @return SEQUENCE with a null element appended
     */
    @LispMethod(comment = "@return SEQUENCE with a null element appended")
    public static final SubLObject sequence_null_pad_alt(SubLObject sequence) {
        if (sequence.isList()) {
            return cconcatenate(sequence, list($strie_null_key$.getGlobalValue()));
        } else {
            if (sequence.isString()) {
                return cconcatenate(sequence, Strings.string($strie_null_key$.getGlobalValue()));
            } else {
                if (sequence.isVector()) {
                    return cconcatenate(sequence, Strings.string($strie_null_key$.getGlobalValue()));
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return SEQUENCE with a null element appended
     */
    @LispMethod(comment = "@return SEQUENCE with a null element appended")
    public static SubLObject sequence_null_pad(final SubLObject sequence) {
        if (sequence.isList()) {
            return cconcatenate(sequence, list($strie_null_key$.getGlobalValue()));
        }
        if (sequence.isString()) {
            return cconcatenate(sequence, Strings.string($strie_null_key$.getGlobalValue()));
        }
        if (sequence.isVector()) {
            return cconcatenate(sequence, Strings.string($strie_null_key$.getGlobalValue()));
        }
        return NIL;
    }

    /**
     *
     *
     * @return sequence; the portion of SEQUENCE and  of the same type as SEQUENCE starting at
    START and ending at END if such a sequence exists, nil otherwise
     */
    @LispMethod(comment = "@return sequence; the portion of SEQUENCE and  of the same type as SEQUENCE starting at\r\nSTART and ending at END if such a sequence exists, nil otherwise")
    public static final SubLObject sequence_slice_alt(SubLObject sequence, SubLObject start, SubLObject end) {
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(start, INTEGERP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == end) || end.isInteger())) {
                    Errors.error(Errors.error($str_alt67$_A_is_not_an_integer));
                }
            }
            if ((NIL != end) && start.numG(end)) {
                Errors.error($str_alt68$END_must_not_be_smaller_than_STAR);
            }
            if (sequence.isList()) {
                return NIL != end ? ((SubLObject) (list_utilities.first_n(subtract(end, start), nthcdr(start, sequence)))) : nthcdr(start, sequence);
            } else {
                if (sequence.isVector()) {
                    return com.cyc.cycjava.cycl.strie.vector_slice(sequence, start, end);
                } else {
                    if (sequence.isString()) {
                        return com.cyc.cycjava.cycl.strie.vector_slice(sequence, start, end);
                    } else {
                        Errors.error($str_alt69$_A_is_not_a_sequence, sequence);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return sequence; the portion of SEQUENCE and  of the same type as SEQUENCE starting at
    START and ending at END if such a sequence exists, nil otherwise
     */
    @LispMethod(comment = "@return sequence; the portion of SEQUENCE and  of the same type as SEQUENCE starting at\r\nSTART and ending at END if such a sequence exists, nil otherwise")
    public static SubLObject sequence_slice(final SubLObject sequence, final SubLObject start, SubLObject end) {
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(start) : "! integerp(start) " + ("Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) ") + start;
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != end)) && (!end.isInteger())) {
            Errors.error(Errors.error($str67$_A_is_not_an_integer));
        }
        if ((NIL != end) && start.numG(end)) {
            Errors.error($str68$END_must_not_be_smaller_than_STAR);
        }
        if (sequence.isList()) {
            return NIL != end ? list_utilities.first_n(subtract(end, start), nthcdr(start, sequence)) : nthcdr(start, sequence);
        }
        if (sequence.isVector()) {
            return vector_slice(sequence, start, end);
        }
        if (sequence.isString()) {
            return vector_slice(sequence, start, end);
        }
        Errors.error($str69$_A_is_not_a_sequence, sequence);
        return NIL;
    }

    /**
     *
     *
     * @return sequence; the portion of VECTOR and of the same type as VECTOR (a vector or
    string) starting at START and ending at END if such a sequence exists, nil otherwise
     */
    @LispMethod(comment = "@return sequence; the portion of VECTOR and of the same type as VECTOR (a vector or\r\nstring) starting at START and ending at END if such a sequence exists, nil otherwise")
    public static final SubLObject vector_slice_alt(SubLObject vector, SubLObject start, SubLObject end) {
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            SubLObject vector_length = length(vector);
            SubLObject end2 = ((NIL == end) || end.numG(vector_length)) ? ((SubLObject) (vector_length)) : end;
            return start.numGE(vector_length) ? ((SubLObject) (NIL)) : subseq(vector, start, end2);
        }
    }

    /**
     *
     *
     * @return sequence; the portion of VECTOR and of the same type as VECTOR (a vector or
    string) starting at START and ending at END if such a sequence exists, nil otherwise
     */
    @LispMethod(comment = "@return sequence; the portion of VECTOR and of the same type as VECTOR (a vector or\r\nstring) starting at START and ending at END if such a sequence exists, nil otherwise")
    public static SubLObject vector_slice(final SubLObject vector, final SubLObject start, SubLObject end) {
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLObject vector_length = length(vector);
        final SubLObject end2 = ((NIL == end) || end.numG(vector_length)) ? vector_length : end;
        return start.numGE(vector_length) ? NIL : subseq(vector, start, end2);
    }

    /**
     *
     *
     * @param SEQ1
    sequence
     * 		
     * @param SEQ2
    sequence
     * 		
     * @return t if SEQ1 and  SEQ2 match elementwise applying TEST and disregarding the type
    of the sequences, nil otherwise
     */
    @LispMethod(comment = "@param SEQ1\nsequence\r\n\t\t\r\n@param SEQ2\nsequence\r\n\t\t\r\n@return t if SEQ1 and  SEQ2 match elementwise applying TEST and disregarding the type\r\nof the sequences, nil otherwise")
    public static final SubLObject sequal_alt(SubLObject seq1, SubLObject seq2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (seq1.isList()) {
            if (seq2.isList()) {
                return makeBoolean(NIL == mismatch(seq1, seq2, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                return com.cyc.cycjava.cycl.strie.lvequal(seq1, seq2, test);
            }
        } else {
            if (seq2.isList()) {
                return com.cyc.cycjava.cycl.strie.lvequal(seq2, seq1, test);
            } else {
                return com.cyc.cycjava.cycl.strie.vequal(seq1, seq2, test);
            }
        }
    }

    /**
     *
     *
     * @param SEQ1
    sequence
     * 		
     * @param SEQ2
    sequence
     * 		
     * @return t if SEQ1 and  SEQ2 match elementwise applying TEST and disregarding the type
    of the sequences, nil otherwise
     */
    @LispMethod(comment = "@param SEQ1\nsequence\r\n\t\t\r\n@param SEQ2\nsequence\r\n\t\t\r\n@return t if SEQ1 and  SEQ2 match elementwise applying TEST and disregarding the type\r\nof the sequences, nil otherwise")
    public static SubLObject sequal(final SubLObject seq1, final SubLObject seq2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (seq1.isList()) {
            if (seq2.isList()) {
                return makeBoolean(NIL == mismatch(seq1, seq2, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
            return lvequal(seq1, seq2, test);
        } else {
            if (seq2.isList()) {
                return lvequal(seq2, seq1, test);
            }
            return vequal(seq1, seq2, test);
        }
    }

    /**
     *
     *
     * @param LIST
    list
     * 		
     * @param VECTOR
     * 		string or vector
     * @return t if LIST and VECTOR match elementwise applying TEST nil otherwise
     */
    @LispMethod(comment = "@param LIST\nlist\r\n\t\t\r\n@param VECTOR\r\n\t\tstring or vector\r\n@return t if LIST and VECTOR match elementwise applying TEST nil otherwise")
    public static final SubLObject lvequal_alt(SubLObject list, SubLObject vector, SubLObject test) {
        {
            SubLObject equal = T;
            SubLObject rem_list = list;
            SubLObject i = ZERO_INTEGER;
            SubLObject length = length(vector);
            while (((NIL != equal) && i.numL(length)) && (NIL != rem_list)) {
                equal = funcall(test, rem_list.first(), aref(vector, i));
                rem_list = rem_list.rest();
                i = add(i, ONE_INTEGER);
            } 
            if (i.numE(length)) {
                if (NIL != rem_list) {
                    equal = NIL;
                }
            } else {
                if (NIL == rem_list) {
                    equal = NIL;
                }
            }
            return equal;
        }
    }

    /**
     *
     *
     * @param LIST
    list
     * 		
     * @param VECTOR
     * 		string or vector
     * @return t if LIST and VECTOR match elementwise applying TEST nil otherwise
     */
    @LispMethod(comment = "@param LIST\nlist\r\n\t\t\r\n@param VECTOR\r\n\t\tstring or vector\r\n@return t if LIST and VECTOR match elementwise applying TEST nil otherwise")
    public static SubLObject lvequal(final SubLObject list, final SubLObject vector, final SubLObject test) {
        SubLObject equal;
        SubLObject rem_list;
        SubLObject i;
        SubLObject length;
        for (equal = T, rem_list = list, i = ZERO_INTEGER, length = length(vector); ((NIL != equal) && i.numL(length)) && (NIL != rem_list); equal = funcall(test, rem_list.first(), aref(vector, i)) , rem_list = rem_list.rest() , i = add(i, ONE_INTEGER)) {
        }
        if (i.numE(length)) {
            if (NIL != rem_list) {
                equal = NIL;
            }
        } else
            if (NIL == rem_list) {
                equal = NIL;
            }

        return equal;
    }

    /**
     *
     *
     * @param VEC1
     * 		vector or string
     * @param VEC2
     * 		vector or string
     * @return t if VEC1 and VEC2 match elementwise applying TEST,  nil otherwise
     */
    @LispMethod(comment = "@param VEC1\r\n\t\tvector or string\r\n@param VEC2\r\n\t\tvector or string\r\n@return t if VEC1 and VEC2 match elementwise applying TEST,  nil otherwise")
    public static final SubLObject vequal_alt(SubLObject vec1, SubLObject vec2, SubLObject test) {
        {
            SubLObject equal = T;
            SubLObject length1 = length(vec1);
            SubLObject length2 = length(vec2);
            SubLObject i = ZERO_INTEGER;
            if (length1.eql(length2)) {
                while ((NIL != equal) && i.numL(length1)) {
                    equal = funcall(test, aref(vec1, i), aref(vec2, i));
                    i = add(i, ONE_INTEGER);
                } 
            } else {
                equal = NIL;
            }
            return equal;
        }
    }

    /**
     *
     *
     * @param VEC1
     * 		vector or string
     * @param VEC2
     * 		vector or string
     * @return t if VEC1 and VEC2 match elementwise applying TEST,  nil otherwise
     */
    @LispMethod(comment = "@param VEC1\r\n\t\tvector or string\r\n@param VEC2\r\n\t\tvector or string\r\n@return t if VEC1 and VEC2 match elementwise applying TEST,  nil otherwise")
    public static SubLObject vequal(final SubLObject vec1, final SubLObject vec2, final SubLObject test) {
        SubLObject equal = T;
        final SubLObject length1 = length(vec1);
        final SubLObject length2 = length(vec2);
        SubLObject i = ZERO_INTEGER;
        if (length1.eql(length2)) {
            while ((NIL != equal) && i.numL(length1)) {
                equal = funcall(test, aref(vec1, i), aref(vec2, i));
                i = add(i, ONE_INTEGER);
            } 
        } else {
            equal = NIL;
        }
        return equal;
    }

    public static final SubLObject test_exercise_strie_alt(SubLObject name_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_strie = com.cyc.cycjava.cycl.strie.new_strie(symbol_function(EQUALP));
                SubLObject lookaside = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                {
                    SubLObject cdolist_list_var = name_list;
                    SubLObject name = NIL;
                    for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                        map_utilities.map_put(lookaside, name, string_utilities.split_string(name, UNPROVIDED));
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.strie.strie_empty_p(v_strie)) {
                        Errors.error($str_alt79$There_are_already__A_entries_in_t, com.cyc.cycjava.cycl.strie.strie_size(v_strie));
                    }
                }
                {
                    SubLObject cdolist_list_var = name_list;
                    SubLObject name = NIL;
                    for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                        {
                            SubLObject key = map_utilities.map_get_without_values(lookaside, name, UNPROVIDED);
                            com.cyc.cycjava.cycl.strie.strie_insert(v_strie, key, name);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = name_list;
                    SubLObject name = NIL;
                    for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                        {
                            SubLObject key = map_utilities.map_get_without_values(lookaside, name, UNPROVIDED);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!name.equalp(com.cyc.cycjava.cycl.strie.strie_lookup(v_strie, key).first())) {
                                    Errors.error($str_alt80$Cannot_retrieve__A_with_lookup_ke, name, key);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject long_names = Sort.sort(copy_list(name_list), symbol_function($sym81$_), symbol_function(LENGTH));
                    SubLObject cdolist_list_var = long_names;
                    SubLObject name = NIL;
                    for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                        {
                            SubLObject key = map_utilities.map_get_without_values(lookaside, name, UNPROVIDED);
                            SubLObject result = com.cyc.cycjava.cycl.strie.strie_remove(v_strie, key);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == com.cyc.cycjava.cycl.strie.strie_modified_in_removal_p(result)) {
                                    Errors.error($str_alt83$The_deletion_of_key__A_did_not_mo, key);
                                }
                            }
                        }
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == com.cyc.cycjava.cycl.strie.strie_empty_p(v_strie)) {
                        Errors.error($str_alt84$There_are_still__A_entries_left_o, com.cyc.cycjava.cycl.strie.strie_size(v_strie), map_utilities.map_values(v_strie));
                    }
                }
            }
            return $SUCCESS;
        }
    }

    public static SubLObject test_exercise_strie(final SubLObject name_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_strie = new_strie(symbol_function(EQUALP));
        final SubLObject lookaside = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
        SubLObject cdolist_list_var = name_list;
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            map_utilities.map_put(lookaside, name, string_utilities.split_string(name, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == strie_empty_p(v_strie))) {
            Errors.error($str78$There_are_already__A_entries_in_t, strie_size(v_strie));
        }
        cdolist_list_var = name_list;
        name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key = map_utilities.map_get_without_values(lookaside, name, UNPROVIDED);
            strie_insert(v_strie, key, name);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        cdolist_list_var = name_list;
        name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key = map_utilities.map_get_without_values(lookaside, name, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!name.equalp(strie_lookup(v_strie, key).first()))) {
                Errors.error($str79$Cannot_retrieve__A_with_lookup_ke, name, key);
            }
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2;
        final SubLObject long_names = cdolist_list_var2 = Sort.sort(copy_list(name_list), symbol_function($sym80$_), symbol_function(LENGTH));
        SubLObject name2 = NIL;
        name2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject key2 = map_utilities.map_get_without_values(lookaside, name2, UNPROVIDED);
            final SubLObject result = strie_remove(v_strie, key2);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == strie_modified_in_removal_p(result))) {
                Errors.error($str82$The_deletion_of_key__A_did_not_mo, key2);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            name2 = cdolist_list_var2.first();
        } 
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == strie_empty_p(v_strie))) {
            Errors.error($str83$There_are_still__A_entries_left_o, strie_size(v_strie), map_utilities.map_values(v_strie));
        }
        return $SUCCESS;
    }

    public static SubLObject declare_strie_file() {
        declareMacro("new_info_node", "NEW-INFO-NODE");
        declareMacro("info_node_p", "INFO-NODE-P");
        declareMacro("info_node_key", "INFO-NODE-KEY");
        declareMacro("info_node_value", "INFO-NODE-VALUE");
        declareMacro("info_node_entry", "INFO-NODE-ENTRY");
        declareMacro("info_node_key_set", "INFO-NODE-KEY-SET");
        declareMacro("info_node_value_set", "INFO-NODE-VALUE-SET");
        declareFunction("new_strie", "NEW-STRIE", 0, 1, false);
        declareFunction("strie_clear", "STRIE-CLEAR", 1, 0, false);
        declareFunction("strie_p", "STRIE-P", 1, 1, false);
        declareFunction("strie_test", "STRIE-TEST", 1, 0, false);
        declareMacro("do_strie_progress", "DO-STRIE-PROGRESS");
        declareMacro("do_strie", "DO-STRIE");
        declareMacro("do_strie_interior_node", "DO-STRIE-INTERIOR-NODE");
        declareFunction("new_strie_iterator", "NEW-STRIE-ITERATOR", 1, 0, false);
        declareFunction("strie_iterator_done_p", "STRIE-ITERATOR-DONE-P", 1, 0, false);
        declareFunction("strie_iterator_next", "STRIE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("make_strie_iterator", "MAKE-STRIE-ITERATOR", 1, 0, false);
        declareFunction("strie_size", "STRIE-SIZE", 1, 0, false);
        declareFunction("strie_empty_p", "STRIE-EMPTY-P", 1, 0, false);
        declareFunction("strie_replace", "STRIE-REPLACE", 3, 0, false);
        declareFunction("strie_insert", "STRIE-INSERT", 3, 0, false);
        declareFunction("strie_remove", "STRIE-REMOVE", 2, 0, false);
        declareFunction("strie_unassociate", "STRIE-UNASSOCIATE", 3, 0, false);
        declareFunction("strie_lookup", "STRIE-LOOKUP", 2, 0, false);
        declareFunction("strie_keys", "STRIE-KEYS", 1, 0, false);
        declareFunction("strie_values", "STRIE-VALUES", 1, 0, false);
        declareFunction("strie_entries", "STRIE-ENTRIES", 1, 0, false);
        declareFunction("strie_prefixes", "STRIE-PREFIXES", 2, 0, false);
        declareFunction("strie_completions", "STRIE-COMPLETIONS", 2, 0, false);
        declareFunction("map_strie", "MAP-STRIE", 2, 0, false);
        declareFunction("strie_key_p", "STRIE-KEY-P", 1, 0, false);
        declareFunction("visit_strie_hierarchically", "VISIT-STRIE-HIERARCHICALLY", 2, 0, false);
        declareFunction("strie_p_internal", "STRIE-P-INTERNAL", 1, 0, false);
        declareFunction("strie_insert_internal", "STRIE-INSERT-INTERNAL", 5, 0, false);
        declareFunction("strie_remove_internal", "STRIE-REMOVE-INTERNAL", 3, 0, false);
        declareFunction("strie_modified_in_removal_p", "STRIE-MODIFIED-IN-REMOVAL-P", 1, 0, false);
        declareFunction("element", "ELEMENT", 2, 0, false);
        declareFunction("sequence_null_pad", "SEQUENCE-NULL-PAD", 1, 0, false);
        declareFunction("sequence_slice", "SEQUENCE-SLICE", 2, 1, false);
        declareFunction("vector_slice", "VECTOR-SLICE", 2, 1, false);
        declareFunction("sequal", "SEQUAL", 2, 1, false);
        declareFunction("lvequal", "LVEQUAL", 3, 0, false);
        declareFunction("vequal", "VEQUAL", 3, 0, false);
        declareFunction("test_exercise_strie", "TEST-EXERCISE-STRIE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_strie_file() {
        defconstant("*STRIE-NULL-KEY*", CHAR_vertical);
        return NIL;
    }

    public static final SubLObject setup_strie_file_alt() {
        note_funcall_helper_function(STRIE_ITERATOR_DONE_P);
        note_funcall_helper_function(STRIE_ITERATOR_NEXT);
        define_test_case_table_int(TEST_EXERCISE_STRIE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt78);
        return NIL;
    }

    public static SubLObject setup_strie_file() {
        if (SubLFiles.USE_V1) {
            note_funcall_helper_function(STRIE_ITERATOR_DONE_P);
            note_funcall_helper_function(STRIE_ITERATOR_NEXT);
            define_test_case_table_int(TEST_EXERCISE_STRIE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list77);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_EXERCISE_STRIE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt78);
        }
        return NIL;
    }

    public static SubLObject setup_strie_file_Previous() {
        note_funcall_helper_function(STRIE_ITERATOR_DONE_P);
        note_funcall_helper_function(STRIE_ITERATOR_NEXT);
        define_test_case_table_int(TEST_EXERCISE_STRIE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list77);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_strie_file();
    }

    @Override
    public void initializeVariables() {
        init_strie_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_strie_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLList $list_alt2 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt4 = list(makeSymbol("INFO-NODE"));

    static private final SubLList $list_alt7 = list(makeSymbol("INFO-NODE"), makeSymbol("KEY"));

    static private final SubLList $list_alt9 = list(makeSymbol("INFO-NODE"), makeSymbol("VALUE"));

    static private final SubLList $list_alt13 = list(list(makeSymbol("KEY"), makeSymbol("VALUES"), makeSymbol("STRIE"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("PROGRESS-NOTE"), list(makeSymbol("FORMAT"), NIL, makeString("Mapping ~S..."), makeSymbol("STRIE")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt14 = list($DONE, makeKeyword("PROGRESS-NOTE"));

    static private final SubLString $str_alt18$Mapping__S___ = makeString("Mapping ~S...");

    static private final SubLList $list_alt24 = list(list(makeSymbol("CREATE-STACK")));

    static private final SubLList $list_alt39 = list(list(makeSymbol("KEY"), makeSymbol("VALUES"), makeSymbol("STRIE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt40 = list($DONE);

    static private final SubLList $list_alt43 = list(list(makeSymbol("KEY"), makeSymbol("VALUES"), makeSymbol("DICT-NODE"), makeSymbol("DONE"), makeSymbol("STACK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt46 = list(makeSymbol("MAP-ITERATOR"), makeSymbol("STACK"));

    static private final SubLList $list_alt49 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));

    static private final SubLList $list_alt56 = list(makeSymbol("TASK"), makeSymbol("PATH"), makeSymbol("&OPTIONAL"), makeSymbol("STRIE"));

    static private final SubLList $list_alt58 = list(makeSymbol("DICT-KEY"), makeSymbol("PAYLOAD"));

    static private final SubLString $str_alt59$Invalid_STRIE_entry__A_____neithe = makeString("Invalid STRIE entry ~A ... neither sub-tree nor info node.");

    static private final SubLString $str_alt60$Invalid_state_transition__A_in_vi = makeString("Invalid state transition ~A in visitng of STRIE.");

    static private final SubLString $str_alt67$_A_is_not_an_integer = makeString("~A is not an integer");

    static private final SubLString $str_alt68$END_must_not_be_smaller_than_STAR = makeString("END must not be smaller than START");

    static private final SubLString $str_alt69$_A_is_not_a_sequence = makeString("~A is not a sequence");

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt78 = list(list(list(list(makeString("George Washington Carver"), makeString("George Washington"), makeString("George Washington Adams"), makeString("George Washington Curtis Lee"))), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt79$There_are_already__A_entries_in_t = makeString("There are already ~A entries in the trie???");

    static private final SubLString $str_alt80$Cannot_retrieve__A_with_lookup_ke = makeString("Cannot retrieve ~A with lookup-key ~A.");

    static private final SubLSymbol $sym81$_ = makeSymbol(">");

    static private final SubLString $str_alt83$The_deletion_of_key__A_did_not_mo = makeString("The deletion of key ~A did not modify the STrie!");

    static private final SubLString $str_alt84$There_are_still__A_entries_left_o = makeString("There are still ~A entries left over: ~A");
}

/**
 * Total time: 368 ms
 */
