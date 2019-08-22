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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class strie extends SubLTranslatedFile {
    public static final SubLFile me = new strie();

    public static final String myName = "com.cyc.cycjava.cycl.strie";

    public static final String myFingerPrint = "519cd0b830b3cb1c7a3015d97b1e947bb04f3386a1dab7a38c4ad3d41b1e2f1a";

    // defconstant
    public static final SubLSymbol $strie_null_key$ = makeSymbol("*STRIE-NULL-KEY*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("KEY"), makeSymbol("VALUE"));



    public static final SubLList $list2 = list(makeSymbol("OBJECT"));



    public static final SubLList $list4 = list(makeSymbol("INFO-NODE"));





    public static final SubLList $list7 = list(makeSymbol("INFO-NODE"), makeSymbol("KEY"));



    public static final SubLList $list9 = list(makeSymbol("INFO-NODE"), makeSymbol("VALUE"));





    public static final SubLSymbol STRIE_P = makeSymbol("STRIE-P");

    public static final SubLList $list13 = list(list(makeSymbol("KEY"), makeSymbol("VALUES"), makeSymbol("STRIE"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("PROGRESS-NOTE"), list(makeSymbol("FORMAT"), NIL, makeString("Mapping ~S..."), makeSymbol("STRIE")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list14 = list(makeKeyword("DONE"), makeKeyword("PROGRESS-NOTE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLString $str18$Mapping__S___ = makeString("Mapping ~S...");

    public static final SubLSymbol $sym19$STACK = makeUninternedSymbol("STACK");

    public static final SubLSymbol $sym20$ENTRY = makeUninternedSymbol("ENTRY");

    public static final SubLSymbol $sym21$STRIE_DICT_KEY = makeUninternedSymbol("STRIE-DICT-KEY");

    public static final SubLSymbol $sym22$STRIE_DICT_VALUE = makeUninternedSymbol("STRIE-DICT-VALUE");



    public static final SubLList $list24 = list(list(makeSymbol("CREATE-STACK")));

    public static final SubLSymbol DO_MAP = makeSymbol("DO-MAP");







    public static final SubLSymbol MAP_P = makeSymbol("MAP-P");







    public static final SubLSymbol STACK_EMPTY_P = makeSymbol("STACK-EMPTY-P");



    public static final SubLSymbol DO_STRIE_INTERIOR_NODE = makeSymbol("DO-STRIE-INTERIOR-NODE");

    public static final SubLSymbol INFO_NODE_P = makeSymbol("INFO-NODE-P");

    public static final SubLSymbol INFO_NODE_KEY = makeSymbol("INFO-NODE-KEY");

    public static final SubLSymbol INFO_NODE_VALUE = makeSymbol("INFO-NODE-VALUE");

    public static final SubLList $list39 = list(list(makeSymbol("KEY"), makeSymbol("VALUES"), makeSymbol("STRIE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list40 = list(makeKeyword("DONE"));

    public static final SubLSymbol $sym41$STACK = makeUninternedSymbol("STACK");

    public static final SubLSymbol $sym42$ENTRY = makeUninternedSymbol("ENTRY");

    public static final SubLList $list43 = list(list(makeSymbol("KEY"), makeSymbol("VALUES"), makeSymbol("DICT-NODE"), makeSymbol("DONE"), makeSymbol("STACK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym44$DICT_KEY = makeUninternedSymbol("DICT-KEY");

    public static final SubLSymbol $sym45$DICT_VALUE = makeUninternedSymbol("DICT-VALUE");

    public static final SubLList $list46 = list(makeSymbol("MAP-ITERATOR"), makeSymbol("STACK"));

    public static final SubLSymbol STRIE_ITERATOR_DONE_P = makeSymbol("STRIE-ITERATOR-DONE-P");

    public static final SubLSymbol STRIE_ITERATOR_NEXT = makeSymbol("STRIE-ITERATOR-NEXT");

    public static final SubLList $list49 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));

    public static final SubLSymbol STRIE_KEY_P = makeSymbol("STRIE-KEY-P");







    public static final SubLSymbol HIERARCHICAL_VISITOR_P = makeSymbol("HIERARCHICAL-VISITOR-P");



    public static final SubLList $list56 = list(makeSymbol("TASK"), makeSymbol("PATH"), makeSymbol("&OPTIONAL"), makeSymbol("STRIE"));



    public static final SubLList $list58 = list(makeSymbol("DICT-KEY"), makeSymbol("PAYLOAD"));

    public static final SubLString $str59$Invalid_STRIE_entry__A_____neithe = makeString("Invalid STRIE entry ~A ... neither sub-tree nor info node.");

    public static final SubLString $str60$Invalid_state_transition__A_in_vi = makeString("Invalid state transition ~A in visitng of STRIE.");

    public static final SubLSymbol STRIE_P_INTERNAL = makeSymbol("STRIE-P-INTERNAL");











    public static final SubLString $str67$_A_is_not_an_integer = makeString("~A is not an integer");

    public static final SubLString $str68$END_must_not_be_smaller_than_STAR = makeString("END must not be smaller than START");

    public static final SubLString $str69$_A_is_not_a_sequence = makeString("~A is not a sequence");

    public static final SubLSymbol TEST_EXERCISE_STRIE = makeSymbol("TEST-EXERCISE-STRIE");













    private static final SubLList $list77 = list(list(list(list(makeString("George Washington Carver"), makeString("George Washington"), makeString("George Washington Adams"), makeString("George Washington Curtis Lee"))), makeKeyword("SUCCESS")));

    private static final SubLString $str78$There_are_already__A_entries_in_t = makeString("There are already ~A entries in the trie???");

    private static final SubLString $str79$Cannot_retrieve__A_with_lookup_ke = makeString("Cannot retrieve ~A with lookup-key ~A.");

    private static final SubLSymbol $sym80$_ = makeSymbol(">");



    private static final SubLString $str82$The_deletion_of_key__A_did_not_mo = makeString("The deletion of key ~A did not modify the STrie!");

    private static final SubLString $str83$There_are_still__A_entries_left_o = makeString("There are still ~A entries left over: ~A");



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

    public static SubLObject new_strie(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) " + test;
        return dictionary.new_dictionary(test, UNPROVIDED);
    }

    public static SubLObject strie_clear(final SubLObject v_strie) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        return map_utilities.map_remove_all(v_strie);
    }

    public static SubLObject strie_p(final SubLObject v_object, SubLObject sloppyP) {
        if (sloppyP == UNPROVIDED) {
            sloppyP = T;
        }
        return makeBoolean((NIL != map_utilities.map_p(v_object)) && (NIL != (NIL != sloppyP ? T : strie_p_internal(v_object))));
    }

    public static SubLObject strie_test(final SubLObject v_strie) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        return map_utilities.map_test(v_strie);
    }

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

    public static SubLObject new_strie_iterator(final SubLObject v_strie) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        return make_strie_iterator(v_strie);
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

    public static SubLObject make_strie_iterator(final SubLObject v_strie) {
        final SubLObject map_iterator = map_utilities.new_map_iterator(v_strie);
        final SubLObject map_stack = stacks.create_stack();
        final SubLObject state = list(map_iterator, map_stack);
        return iteration.new_iterator(state, symbol_function(STRIE_ITERATOR_DONE_P), symbol_function(STRIE_ITERATOR_NEXT), UNPROVIDED);
    }

    public static SubLObject strie_size(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
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

    public static SubLObject strie_empty_p(final SubLObject v_strie) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        return map_utilities.map_empty_p(v_strie);
    }

    public static SubLObject strie_replace(final SubLObject v_strie, final SubLObject key, final SubLObject value) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        assert NIL != strie_key_p(key) : "strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) " + key;
        final SubLObject remove = strie_remove(v_strie, key);
        final SubLObject insert = strie_insert(v_strie, key, value);
        if (remove == $VOID) {
            return insert;
        }
        return $ADDED;
    }

    public static SubLObject strie_insert(final SubLObject v_strie, final SubLObject key, final SubLObject value) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        assert NIL != strie_key_p(key) : "strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) " + key;
        return strie_insert_internal(v_strie, sequence_null_pad(key), list(value), ONE_INTEGER, key);
    }

    public static SubLObject strie_remove(final SubLObject v_strie, final SubLObject key) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        assert NIL != strie_key_p(key) : "strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) " + key;
        return strie_remove_internal(v_strie, sequence_null_pad(key), key);
    }

    public static SubLObject strie_unassociate(final SubLObject v_strie, final SubLObject key, final SubLObject value) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        assert NIL != strie_key_p(key) : "strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) " + key;
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
    }

    public static SubLObject strie_lookup(final SubLObject v_strie, final SubLObject key) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        assert NIL != strie_key_p(key) : "strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) " + key;
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

    public static SubLObject strie_keys(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
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

    public static SubLObject strie_values(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
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

    public static SubLObject strie_entries(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
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

    public static SubLObject strie_prefixes(final SubLObject v_strie, final SubLObject key) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        assert NIL != strie_key_p(key) : "strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) " + key;
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

    public static SubLObject strie_completions(final SubLObject v_strie, final SubLObject key) {
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        assert NIL != strie_key_p(key) : "strie.strie_key_p(key) " + "CommonSymbols.NIL != strie.strie_key_p(key) " + key;
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

    public static SubLObject map_strie(final SubLObject v_strie, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        assert NIL != functionp(function) : "Types.functionp(function) " + "CommonSymbols.NIL != Types.functionp(function) " + function;
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

    public static SubLObject visit_strie_hierarchically(final SubLObject v_strie, final SubLObject visitor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != strie_p(v_strie, UNPROVIDED) : "strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != strie.strie_p(v_strie, CommonSymbols.UNPROVIDED) " + v_strie;
        assert NIL != hierarchical_visitor.hierarchical_visitor_p(visitor) : "hierarchical_visitor.hierarchical_visitor_p(visitor) " + "CommonSymbols.NIL != hierarchical_visitor.hierarchical_visitor_p(visitor) " + visitor;
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
    }

    public static SubLObject strie_p_internal(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() || ((NIL != map_utilities.map_p(v_object)) && (NIL == list_utilities.find_if_not(symbol_function(STRIE_P_INTERNAL), map_utilities.map_values(v_object), UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

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
    }

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
    }

    public static SubLObject strie_modified_in_removal_p(final SubLObject result) {
        return makeBoolean(($REMOVED == result) || ($SHRUNK == result));
    }

    public static SubLObject element(final SubLObject sequence, final SubLObject index) {
        return NIL != sequence ? elt(sequence, index) : NIL;
    }

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

    public static SubLObject sequence_slice(final SubLObject sequence, final SubLObject start, SubLObject end) {
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(start) : "Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) " + start;
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

    public static SubLObject vector_slice(final SubLObject vector, final SubLObject start, SubLObject end) {
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLObject vector_length = length(vector);
        final SubLObject end2 = ((NIL == end) || end.numG(vector_length)) ? vector_length : end;
        return start.numGE(vector_length) ? NIL : subseq(vector, start, end2);
    }

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
        declareMacro(me, "new_info_node", "NEW-INFO-NODE");
        declareMacro(me, "info_node_p", "INFO-NODE-P");
        declareMacro(me, "info_node_key", "INFO-NODE-KEY");
        declareMacro(me, "info_node_value", "INFO-NODE-VALUE");
        declareMacro(me, "info_node_entry", "INFO-NODE-ENTRY");
        declareMacro(me, "info_node_key_set", "INFO-NODE-KEY-SET");
        declareMacro(me, "info_node_value_set", "INFO-NODE-VALUE-SET");
        declareFunction(me, "new_strie", "NEW-STRIE", 0, 1, false);
        declareFunction(me, "strie_clear", "STRIE-CLEAR", 1, 0, false);
        declareFunction(me, "strie_p", "STRIE-P", 1, 1, false);
        declareFunction(me, "strie_test", "STRIE-TEST", 1, 0, false);
        declareMacro(me, "do_strie_progress", "DO-STRIE-PROGRESS");
        declareMacro(me, "do_strie", "DO-STRIE");
        declareMacro(me, "do_strie_interior_node", "DO-STRIE-INTERIOR-NODE");
        declareFunction(me, "new_strie_iterator", "NEW-STRIE-ITERATOR", 1, 0, false);
        declareFunction(me, "strie_iterator_done_p", "STRIE-ITERATOR-DONE-P", 1, 0, false);
        declareFunction(me, "strie_iterator_next", "STRIE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "make_strie_iterator", "MAKE-STRIE-ITERATOR", 1, 0, false);
        declareFunction(me, "strie_size", "STRIE-SIZE", 1, 0, false);
        declareFunction(me, "strie_empty_p", "STRIE-EMPTY-P", 1, 0, false);
        declareFunction(me, "strie_replace", "STRIE-REPLACE", 3, 0, false);
        declareFunction(me, "strie_insert", "STRIE-INSERT", 3, 0, false);
        declareFunction(me, "strie_remove", "STRIE-REMOVE", 2, 0, false);
        declareFunction(me, "strie_unassociate", "STRIE-UNASSOCIATE", 3, 0, false);
        declareFunction(me, "strie_lookup", "STRIE-LOOKUP", 2, 0, false);
        declareFunction(me, "strie_keys", "STRIE-KEYS", 1, 0, false);
        declareFunction(me, "strie_values", "STRIE-VALUES", 1, 0, false);
        declareFunction(me, "strie_entries", "STRIE-ENTRIES", 1, 0, false);
        declareFunction(me, "strie_prefixes", "STRIE-PREFIXES", 2, 0, false);
        declareFunction(me, "strie_completions", "STRIE-COMPLETIONS", 2, 0, false);
        declareFunction(me, "map_strie", "MAP-STRIE", 2, 0, false);
        declareFunction(me, "strie_key_p", "STRIE-KEY-P", 1, 0, false);
        declareFunction(me, "visit_strie_hierarchically", "VISIT-STRIE-HIERARCHICALLY", 2, 0, false);
        declareFunction(me, "strie_p_internal", "STRIE-P-INTERNAL", 1, 0, false);
        declareFunction(me, "strie_insert_internal", "STRIE-INSERT-INTERNAL", 5, 0, false);
        declareFunction(me, "strie_remove_internal", "STRIE-REMOVE-INTERNAL", 3, 0, false);
        declareFunction(me, "strie_modified_in_removal_p", "STRIE-MODIFIED-IN-REMOVAL-P", 1, 0, false);
        declareFunction(me, "element", "ELEMENT", 2, 0, false);
        declareFunction(me, "sequence_null_pad", "SEQUENCE-NULL-PAD", 1, 0, false);
        declareFunction(me, "sequence_slice", "SEQUENCE-SLICE", 2, 1, false);
        declareFunction(me, "vector_slice", "VECTOR-SLICE", 2, 1, false);
        declareFunction(me, "sequal", "SEQUAL", 2, 1, false);
        declareFunction(me, "lvequal", "LVEQUAL", 3, 0, false);
        declareFunction(me, "vequal", "VEQUAL", 3, 0, false);
        declareFunction(me, "test_exercise_strie", "TEST-EXERCISE-STRIE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_strie_file() {
        defconstant("*STRIE-NULL-KEY*", CHAR_vertical);
        return NIL;
    }

    public static SubLObject setup_strie_file() {
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

    
}

/**
 * Total time: 368 ms
 */
