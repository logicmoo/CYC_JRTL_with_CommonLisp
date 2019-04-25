package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class strie extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.strie";
    public static final String myFingerPrint = "519cd0b830b3cb1c7a3015d97b1e947bb04f3386a1dab7a38c4ad3d41b1e2f1a";
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 3065L)
    public static SubLSymbol $strie_null_key$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CONS;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CONSP;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$CAR;
    private static final SubLSymbol $sym6$CDR;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$RPLACA;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$RPLACD;
    private static final SubLSymbol $sym11$VALID_HASH_TEST_P;
    private static final SubLSymbol $sym12$STRIE_P;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw16$DONE;
    private static final SubLSymbol $kw17$PROGRESS_NOTE;
    private static final SubLString $str18$Mapping__S___;
    private static final SubLSymbol $sym19$STACK;
    private static final SubLSymbol $sym20$ENTRY;
    private static final SubLSymbol $sym21$STRIE_DICT_KEY;
    private static final SubLSymbol $sym22$STRIE_DICT_VALUE;
    private static final SubLSymbol $sym23$CLET;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$DO_MAP;
    private static final SubLSymbol $kw26$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym27$IGNORE;
    private static final SubLSymbol $sym28$PCOND;
    private static final SubLSymbol $sym29$MAP_P;
    private static final SubLSymbol $sym30$STACK_PUSH;
    private static final SubLSymbol $sym31$UNTIL;
    private static final SubLSymbol $sym32$COR;
    private static final SubLSymbol $sym33$STACK_EMPTY_P;
    private static final SubLSymbol $sym34$STACK_POP;
    private static final SubLSymbol $sym35$DO_STRIE_INTERIOR_NODE;
    private static final SubLSymbol $sym36$INFO_NODE_P;
    private static final SubLSymbol $sym37$INFO_NODE_KEY;
    private static final SubLSymbol $sym38$INFO_NODE_VALUE;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$STACK;
    private static final SubLSymbol $sym42$ENTRY;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$DICT_KEY;
    private static final SubLSymbol $sym45$DICT_VALUE;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$STRIE_ITERATOR_DONE_P;
    private static final SubLSymbol $sym48$STRIE_ITERATOR_NEXT;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$STRIE_KEY_P;
    private static final SubLSymbol $kw51$VOID;
    private static final SubLSymbol $kw52$ADDED;
    private static final SubLSymbol $sym53$FUNCTIONP;
    private static final SubLSymbol $sym54$HIERARCHICAL_VISITOR_P;
    private static final SubLSymbol $kw55$VISIT;
    private static final SubLList $list56;
    private static final SubLSymbol $kw57$FINISH;
    private static final SubLList $list58;
    private static final SubLString $str59$Invalid_STRIE_entry__A_____neithe;
    private static final SubLString $str60$Invalid_state_transition__A_in_vi;
    private static final SubLSymbol $sym61$STRIE_P_INTERNAL;
    private static final SubLSymbol $kw62$CREATED;
    private static final SubLSymbol $kw63$SPLICED;
    private static final SubLSymbol $kw64$SHRUNK;
    private static final SubLSymbol $kw65$REMOVED;
    private static final SubLSymbol $sym66$INTEGERP;
    private static final SubLString $str67$_A_is_not_an_integer;
    private static final SubLString $str68$END_must_not_be_smaller_than_STAR;
    private static final SubLString $str69$_A_is_not_a_sequence;
    private static final SubLSymbol $sym70$TEST_EXERCISE_STRIE;
    private static final SubLSymbol $kw71$TEST;
    private static final SubLSymbol $kw72$OWNER;
    private static final SubLSymbol $kw73$CLASSES;
    private static final SubLSymbol $kw74$KB;
    private static final SubLSymbol $kw75$TINY;
    private static final SubLSymbol $kw76$WORKING_;
    private static final SubLList $list77;
    private static final SubLString $str78$There_are_already__A_entries_in_t;
    private static final SubLString $str79$Cannot_retrieve__A_with_lookup_ke;
    private static final SubLSymbol $sym80$_;
    private static final SubLSymbol $sym81$LENGTH;
    private static final SubLString $str82$The_deletion_of_key__A_did_not_mo;
    private static final SubLString $str83$There_are_still__A_entries_left_o;
    private static final SubLSymbol $kw84$SUCCESS;
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 3288L)
    public static SubLObject new_info_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)strie.NIL;
        SubLObject value = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list0);
        value = current.first();
        current = current.rest();
        if (strie.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)strie.$sym1$CONS, key, value);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list0);
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 3542L)
    public static SubLObject info_node_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list2);
        v_object = current.first();
        current = current.rest();
        if (strie.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)strie.$sym3$CONSP, v_object);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list2);
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 3673L)
    public static SubLObject info_node_key(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject info_node = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list4);
        info_node = current.first();
        current = current.rest();
        if (strie.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)strie.$sym5$CAR, info_node);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list4);
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 3837L)
    public static SubLObject info_node_value(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject info_node = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list4);
        info_node = current.first();
        current = current.rest();
        if (strie.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)strie.$sym6$CDR, info_node);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list4);
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 3989L)
    public static SubLObject info_node_entry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject info_node = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list4);
        info_node = current.first();
        current = current.rest();
        if (strie.NIL == current) {
            return info_node;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list4);
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 4215L)
    public static SubLObject info_node_key_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject info_node = (SubLObject)strie.NIL;
        SubLObject key = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list7);
        info_node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list7);
        key = current.first();
        current = current.rest();
        if (strie.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)strie.$sym8$RPLACA, info_node, key);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list7);
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 4390L)
    public static SubLObject info_node_value_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject info_node = (SubLObject)strie.NIL;
        SubLObject value = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list9);
        info_node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list9);
        value = current.first();
        current = current.rest();
        if (strie.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)strie.$sym10$RPLACD, info_node, value);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list9);
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 4575L)
    public static SubLObject new_strie(SubLObject test) {
        if (test == strie.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)strie.EQUAL);
        }
        assert strie.NIL != hash_table_utilities.valid_hash_test_p(test) : test;
        return dictionary.new_dictionary(test, (SubLObject)strie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 4904L)
    public static SubLObject strie_clear(final SubLObject v_strie) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        return map_utilities.map_remove_all(v_strie);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 5065L)
    public static SubLObject strie_p(final SubLObject v_object, SubLObject sloppyP) {
        if (sloppyP == strie.UNPROVIDED) {
            sloppyP = (SubLObject)strie.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL != map_utilities.map_p(v_object) && strie.NIL != ((strie.NIL != sloppyP) ? strie.T : strie_p_internal(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 5367L)
    public static SubLObject strie_test(final SubLObject v_strie) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        return map_utilities.map_test(v_strie);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 5515L)
    public static SubLObject do_strie_progress(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)strie.NIL;
        SubLObject values = (SubLObject)strie.NIL;
        SubLObject v_strie = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list13);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list13);
        values = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list13);
        v_strie = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)strie.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)strie.NIL;
        SubLObject current_$1 = (SubLObject)strie.NIL;
        while (strie.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)strie.$list13);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)strie.$list13);
            if (strie.NIL == conses_high.member(current_$1, (SubLObject)strie.$list14, (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED)) {
                bad = (SubLObject)strie.T;
            }
            if (current_$1 == strie.$kw15$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (strie.NIL != bad && strie.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list13);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)strie.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((strie.NIL != done_tail) ? conses_high.cadr(done_tail) : strie.NIL);
        final SubLObject progress_note_tail = cdestructuring_bind.property_list_member((SubLObject)strie.$kw17$PROGRESS_NOTE, current);
        final SubLObject progress_note = (strie.NIL != progress_note_tail) ? conses_high.cadr(progress_note_tail) : PrintLow.format((SubLObject)strie.NIL, (SubLObject)strie.$str18$Mapping__S___, v_strie);
        final SubLObject body;
        current = (body = temp);
        final SubLObject stack = (SubLObject)strie.$sym19$STACK;
        final SubLObject entry = (SubLObject)strie.$sym20$ENTRY;
        final SubLObject strie_dict_key = (SubLObject)strie.$sym21$STRIE_DICT_KEY;
        final SubLObject strie_dict_value = (SubLObject)strie.$sym22$STRIE_DICT_VALUE;
        return (SubLObject)ConsesLow.list((SubLObject)strie.$sym23$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stack, (SubLObject)strie.$list24)), (SubLObject)ConsesLow.list((SubLObject)strie.$sym25$DO_MAP, (SubLObject)ConsesLow.list(strie_dict_key, strie_dict_value, v_strie, (SubLObject)strie.$kw16$DONE, done, (SubLObject)strie.$kw26$PROGRESS_MESSAGE, progress_note), (SubLObject)ConsesLow.list((SubLObject)strie.$sym27$IGNORE, strie_dict_key), (SubLObject)ConsesLow.list((SubLObject)strie.$sym28$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)strie.$sym29$MAP_P, strie_dict_value), (SubLObject)ConsesLow.list((SubLObject)strie.$sym30$STACK_PUSH, strie_dict_value, stack), (SubLObject)ConsesLow.list((SubLObject)strie.$sym31$UNTIL, (SubLObject)ConsesLow.list((SubLObject)strie.$sym32$COR, done, (SubLObject)ConsesLow.list((SubLObject)strie.$sym33$STACK_EMPTY_P, stack)), (SubLObject)ConsesLow.list((SubLObject)strie.$sym23$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(entry, (SubLObject)ConsesLow.list((SubLObject)strie.$sym34$STACK_POP, stack))), (SubLObject)ConsesLow.listS((SubLObject)strie.$sym35$DO_STRIE_INTERIOR_NODE, (SubLObject)ConsesLow.list(key, values, entry, done, stack), ConsesLow.append(body, (SubLObject)strie.NIL))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)strie.$sym36$INFO_NODE_P, strie_dict_value), (SubLObject)ConsesLow.listS((SubLObject)strie.$sym23$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(key, (SubLObject)ConsesLow.list((SubLObject)strie.$sym37$INFO_NODE_KEY, strie_dict_value)), (SubLObject)ConsesLow.list(values, (SubLObject)ConsesLow.list((SubLObject)strie.$sym38$INFO_NODE_VALUE, strie_dict_value))), ConsesLow.append(body, (SubLObject)strie.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 6538L)
    public static SubLObject do_strie(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)strie.NIL;
        SubLObject values = (SubLObject)strie.NIL;
        SubLObject v_strie = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list39);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list39);
        values = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list39);
        v_strie = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)strie.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)strie.NIL;
        SubLObject current_$2 = (SubLObject)strie.NIL;
        while (strie.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)strie.$list39);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)strie.$list39);
            if (strie.NIL == conses_high.member(current_$2, (SubLObject)strie.$list40, (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED)) {
                bad = (SubLObject)strie.T;
            }
            if (current_$2 == strie.$kw15$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (strie.NIL != bad && strie.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list39);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)strie.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((strie.NIL != done_tail) ? conses_high.cadr(done_tail) : strie.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject stack = (SubLObject)strie.$sym41$STACK;
        final SubLObject entry = (SubLObject)strie.$sym42$ENTRY;
        return (SubLObject)ConsesLow.list((SubLObject)strie.$sym23$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stack, (SubLObject)strie.$list24)), (SubLObject)ConsesLow.listS((SubLObject)strie.$sym35$DO_STRIE_INTERIOR_NODE, (SubLObject)ConsesLow.list(key, values, v_strie, done, stack), ConsesLow.append(body, (SubLObject)strie.NIL)), (SubLObject)ConsesLow.list((SubLObject)strie.$sym31$UNTIL, (SubLObject)ConsesLow.list((SubLObject)strie.$sym32$COR, done, (SubLObject)ConsesLow.list((SubLObject)strie.$sym33$STACK_EMPTY_P, stack)), (SubLObject)ConsesLow.list((SubLObject)strie.$sym23$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(entry, (SubLObject)ConsesLow.list((SubLObject)strie.$sym34$STACK_POP, stack))), (SubLObject)ConsesLow.listS((SubLObject)strie.$sym35$DO_STRIE_INTERIOR_NODE, (SubLObject)ConsesLow.list(key, values, entry, done, stack), ConsesLow.append(body, (SubLObject)strie.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 7071L)
    public static SubLObject do_strie_interior_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)strie.NIL;
        SubLObject values = (SubLObject)strie.NIL;
        SubLObject dict_node = (SubLObject)strie.NIL;
        SubLObject done = (SubLObject)strie.NIL;
        SubLObject stack = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list43);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list43);
        values = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list43);
        dict_node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list43);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list43);
        stack = current.first();
        current = current.rest();
        if (strie.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject dict_key = (SubLObject)strie.$sym44$DICT_KEY;
            final SubLObject dict_value = (SubLObject)strie.$sym45$DICT_VALUE;
            return (SubLObject)ConsesLow.list((SubLObject)strie.$sym25$DO_MAP, (SubLObject)ConsesLow.list(dict_key, dict_value, dict_node, (SubLObject)strie.$kw16$DONE, done), (SubLObject)ConsesLow.list((SubLObject)strie.$sym27$IGNORE, dict_key), (SubLObject)ConsesLow.list((SubLObject)strie.$sym28$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)strie.$sym29$MAP_P, dict_value), (SubLObject)ConsesLow.list((SubLObject)strie.$sym30$STACK_PUSH, dict_value, stack)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)strie.$sym36$INFO_NODE_P, dict_value), (SubLObject)ConsesLow.listS((SubLObject)strie.$sym23$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(key, (SubLObject)ConsesLow.list((SubLObject)strie.$sym37$INFO_NODE_KEY, dict_value)), (SubLObject)ConsesLow.list(values, (SubLObject)ConsesLow.list((SubLObject)strie.$sym38$INFO_NODE_VALUE, dict_value))), ConsesLow.append(body, (SubLObject)strie.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list43);
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 7572L)
    public static SubLObject new_strie_iterator(final SubLObject v_strie) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        return make_strie_iterator(v_strie);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 7742L)
    public static SubLObject strie_iterator_done_p(final SubLObject state) {
        SubLObject map_iterator = (SubLObject)strie.NIL;
        SubLObject stack = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)strie.$list46);
        map_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)strie.$list46);
        stack = current.first();
        current = current.rest();
        if (strie.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL != iteration.iteration_done(map_iterator) && strie.NIL != stacks.stack_empty_p(stack));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)strie.$list46);
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 7926L)
    public static SubLObject strie_iterator_next(final SubLObject state) {
        SubLObject key = (SubLObject)strie.NIL;
        SubLObject values = (SubLObject)strie.NIL;
        SubLObject map_iterator = (SubLObject)strie.NIL;
        SubLObject stack = (SubLObject)strie.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)strie.$list46);
        map_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)strie.$list46);
        stack = current.first();
        current = current.rest();
        if (strie.NIL == current) {
            while ((strie.NIL == iteration.iteration_done(map_iterator) || strie.NIL == stacks.stack_empty_p(stack)) && strie.NIL == key) {
                if (strie.NIL != iteration.iteration_done(map_iterator)) {
                    final SubLObject next_map = stacks.stack_pop(stack);
                    map_iterator = map_utilities.new_map_iterator(next_map);
                }
                final SubLObject dict_value = conses_high.second(iteration.iteration_next(map_iterator));
                if (strie.NIL != map_utilities.map_p(dict_value)) {
                    stacks.stack_push(dict_value, stack);
                }
                else {
                    if (!dict_value.isCons()) {
                        continue;
                    }
                    key = dict_value.first();
                    values = dict_value.rest();
                    ConsesLow.rplaca(state, map_iterator);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)strie.$list46);
        }
        return Values.values((SubLObject)((strie.NIL != key) ? ConsesLow.list(key, values) : strie.NIL), state, Types.sublisp_null(key));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 8628L)
    public static SubLObject make_strie_iterator(final SubLObject v_strie) {
        final SubLObject map_iterator = map_utilities.new_map_iterator(v_strie);
        final SubLObject map_stack = stacks.create_stack();
        final SubLObject state = (SubLObject)ConsesLow.list(map_iterator, map_stack);
        return iteration.new_iterator(state, Symbols.symbol_function((SubLObject)strie.$sym47$STRIE_ITERATOR_DONE_P), Symbols.symbol_function((SubLObject)strie.$sym48$STRIE_ITERATOR_NEXT), (SubLObject)strie.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 8880L)
    public static SubLObject strie_size(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        SubLObject size = (SubLObject)strie.ZERO_INTEGER;
        final SubLObject stack = stacks.create_stack();
        final SubLObject iterator = map_utilities.new_map_iterator(v_strie);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)strie.NIL; strie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (strie.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject dict_key = (SubLObject)strie.NIL;
                SubLObject dict_value = (SubLObject)strie.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list49);
                dict_key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list49);
                dict_value = current.first();
                current = current.rest();
                if (strie.NIL == current) {
                    if (strie.NIL != map_utilities.map_p(dict_value)) {
                        stacks.stack_push(dict_value, stack);
                    }
                    else if (dict_value.isCons()) {
                        final SubLObject key = dict_value.first();
                        final SubLObject value = dict_value.rest();
                        size = Numbers.add(size, (SubLObject)strie.ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list49);
                }
            }
        }
        while (strie.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
            SubLObject valid2;
            for (SubLObject done_var2 = (SubLObject)strie.NIL; strie.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid2)) {
                thread.resetMultipleValues();
                final SubLObject var2 = iteration.iteration_next(iterator2);
                valid2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (strie.NIL != valid2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = var2;
                    SubLObject dict_key2 = (SubLObject)strie.NIL;
                    SubLObject dict_value2 = (SubLObject)strie.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)strie.$list49);
                    dict_key2 = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)strie.$list49);
                    dict_value2 = current2.first();
                    current2 = current2.rest();
                    if (strie.NIL == current2) {
                        if (strie.NIL != map_utilities.map_p(dict_value2)) {
                            stacks.stack_push(dict_value2, stack);
                        }
                        else if (dict_value2.isCons()) {
                            final SubLObject key2 = dict_value2.first();
                            final SubLObject value2 = dict_value2.rest();
                            size = Numbers.add(size, (SubLObject)strie.ONE_INTEGER);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)strie.$list49);
                    }
                }
            }
        }
        return size;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 9131L)
    public static SubLObject strie_empty_p(final SubLObject v_strie) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        return map_utilities.map_empty_p(v_strie);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 9303L)
    public static SubLObject strie_replace(final SubLObject v_strie, final SubLObject key, final SubLObject value) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        assert strie.NIL != strie_key_p(key) : key;
        final SubLObject remove = strie_remove(v_strie, key);
        final SubLObject insert = strie_insert(v_strie, key, value);
        if (remove == strie.$kw51$VOID) {
            return insert;
        }
        return (SubLObject)strie.$kw52$ADDED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 9899L)
    public static SubLObject strie_insert(final SubLObject v_strie, final SubLObject key, final SubLObject value) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        assert strie.NIL != strie_key_p(key) : key;
        return strie_insert_internal(v_strie, sequence_null_pad(key), (SubLObject)ConsesLow.list(value), (SubLObject)strie.ONE_INTEGER, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 10478L)
    public static SubLObject strie_remove(final SubLObject v_strie, final SubLObject key) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        assert strie.NIL != strie_key_p(key) : key;
        return strie_remove_internal(v_strie, sequence_null_pad(key), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 10940L)
    public static SubLObject strie_unassociate(final SubLObject v_strie, final SubLObject key, final SubLObject value) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        assert strie.NIL != strie_key_p(key) : key;
        final SubLObject new_values = Sequences.delete(value, strie_lookup(v_strie, key), strie_test(v_strie), (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED);
        strie_remove(v_strie, key);
        SubLObject cdolist_list_var = new_values;
        SubLObject v = (SubLObject)strie.NIL;
        v = cdolist_list_var.first();
        while (strie.NIL != cdolist_list_var) {
            strie_insert(v_strie, key, v);
            cdolist_list_var = cdolist_list_var.rest();
            v = cdolist_list_var.first();
        }
        return new_values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 11409L)
    public static SubLObject strie_lookup(final SubLObject v_strie, final SubLObject key) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        assert strie.NIL != strie_key_p(key) : key;
        final SubLObject int_key = sequence_null_pad(key);
        SubLObject node;
        SubLObject key_element;
        SubLObject remaining_key;
        for (node = v_strie, key_element = (SubLObject)strie.NIL, remaining_key = (SubLObject)strie.NIL, key_element = element(int_key, (SubLObject)strie.ZERO_INTEGER), remaining_key = sequence_slice(int_key, (SubLObject)strie.ONE_INTEGER, (SubLObject)strie.UNPROVIDED); strie.NIL != node && !node.isCons(); node = map_utilities.map_get_without_values(node, key_element, (SubLObject)strie.UNPROVIDED), key_element = element(remaining_key, (SubLObject)strie.ZERO_INTEGER), remaining_key = sequence_slice(remaining_key, (SubLObject)strie.ONE_INTEGER, (SubLObject)strie.UNPROVIDED)) {}
        if (strie.NIL != node && strie.NIL != sequal(key, node.first(), strie_test(v_strie))) {
            return node.rest();
        }
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 12115L)
    public static SubLObject strie_keys(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        SubLObject keys = (SubLObject)strie.NIL;
        final SubLObject stack = stacks.create_stack();
        final SubLObject iterator = map_utilities.new_map_iterator(v_strie);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)strie.NIL; strie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (strie.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject dict_key = (SubLObject)strie.NIL;
                SubLObject dict_value = (SubLObject)strie.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list49);
                dict_key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list49);
                dict_value = current.first();
                current = current.rest();
                if (strie.NIL == current) {
                    if (strie.NIL != map_utilities.map_p(dict_value)) {
                        stacks.stack_push(dict_value, stack);
                    }
                    else if (dict_value.isCons()) {
                        final SubLObject key = dict_value.first();
                        final SubLObject value = dict_value.rest();
                        keys = (SubLObject)ConsesLow.cons(key, keys);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list49);
                }
            }
        }
        while (strie.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
            SubLObject valid2;
            for (SubLObject done_var2 = (SubLObject)strie.NIL; strie.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid2)) {
                thread.resetMultipleValues();
                final SubLObject var2 = iteration.iteration_next(iterator2);
                valid2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (strie.NIL != valid2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = var2;
                    SubLObject dict_key2 = (SubLObject)strie.NIL;
                    SubLObject dict_value2 = (SubLObject)strie.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)strie.$list49);
                    dict_key2 = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)strie.$list49);
                    dict_value2 = current2.first();
                    current2 = current2.rest();
                    if (strie.NIL == current2) {
                        if (strie.NIL != map_utilities.map_p(dict_value2)) {
                            stacks.stack_push(dict_value2, stack);
                        }
                        else if (dict_value2.isCons()) {
                            final SubLObject key2 = dict_value2.first();
                            final SubLObject value2 = dict_value2.rest();
                            keys = (SubLObject)ConsesLow.cons(key2, keys);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)strie.$list49);
                    }
                }
            }
        }
        return keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 12443L)
    public static SubLObject strie_values(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        SubLObject values = (SubLObject)strie.NIL;
        final SubLObject stack = stacks.create_stack();
        final SubLObject iterator = map_utilities.new_map_iterator(v_strie);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)strie.NIL; strie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (strie.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject dict_key = (SubLObject)strie.NIL;
                SubLObject dict_value = (SubLObject)strie.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list49);
                dict_key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list49);
                dict_value = current.first();
                current = current.rest();
                if (strie.NIL == current) {
                    if (strie.NIL != map_utilities.map_p(dict_value)) {
                        stacks.stack_push(dict_value, stack);
                    }
                    else if (dict_value.isCons()) {
                        final SubLObject key = dict_value.first();
                        final SubLObject value = dict_value.rest();
                        values = (SubLObject)ConsesLow.cons(value, values);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list49);
                }
            }
        }
        while (strie.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
            SubLObject valid2;
            for (SubLObject done_var2 = (SubLObject)strie.NIL; strie.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid2)) {
                thread.resetMultipleValues();
                final SubLObject var2 = iteration.iteration_next(iterator2);
                valid2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (strie.NIL != valid2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = var2;
                    SubLObject dict_key2 = (SubLObject)strie.NIL;
                    SubLObject dict_value2 = (SubLObject)strie.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)strie.$list49);
                    dict_key2 = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)strie.$list49);
                    dict_value2 = current2.first();
                    current2 = current2.rest();
                    if (strie.NIL == current2) {
                        if (strie.NIL != map_utilities.map_p(dict_value2)) {
                            stacks.stack_push(dict_value2, stack);
                        }
                        else if (dict_value2.isCons()) {
                            final SubLObject key2 = dict_value2.first();
                            final SubLObject value2 = dict_value2.rest();
                            values = (SubLObject)ConsesLow.cons(value2, values);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)strie.$list49);
                    }
                }
            }
        }
        return values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 12781L)
    public static SubLObject strie_entries(final SubLObject v_strie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        SubLObject entries = (SubLObject)strie.NIL;
        final SubLObject stack = stacks.create_stack();
        final SubLObject iterator = map_utilities.new_map_iterator(v_strie);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)strie.NIL; strie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (strie.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject dict_key = (SubLObject)strie.NIL;
                SubLObject dict_value = (SubLObject)strie.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list49);
                dict_key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list49);
                dict_value = current.first();
                current = current.rest();
                if (strie.NIL == current) {
                    if (strie.NIL != map_utilities.map_p(dict_value)) {
                        stacks.stack_push(dict_value, stack);
                    }
                    else if (dict_value.isCons()) {
                        final SubLObject key = dict_value.first();
                        final SubLObject value = dict_value.rest();
                        entries = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(key, value), entries);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list49);
                }
            }
        }
        while (strie.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
            SubLObject valid2;
            for (SubLObject done_var2 = (SubLObject)strie.NIL; strie.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid2)) {
                thread.resetMultipleValues();
                final SubLObject var2 = iteration.iteration_next(iterator2);
                valid2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (strie.NIL != valid2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = var2;
                    SubLObject dict_key2 = (SubLObject)strie.NIL;
                    SubLObject dict_value2 = (SubLObject)strie.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)strie.$list49);
                    dict_key2 = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)strie.$list49);
                    dict_value2 = current2.first();
                    current2 = current2.rest();
                    if (strie.NIL == current2) {
                        if (strie.NIL != map_utilities.map_p(dict_value2)) {
                            stacks.stack_push(dict_value2, stack);
                        }
                        else if (dict_value2.isCons()) {
                            final SubLObject key2 = dict_value2.first();
                            final SubLObject value2 = dict_value2.rest();
                            entries = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(key2, value2), entries);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)strie.$list49);
                    }
                }
            }
        }
        return entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 13225L)
    public static SubLObject strie_prefixes(final SubLObject v_strie, final SubLObject key) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        assert strie.NIL != strie_key_p(key) : key;
        SubLObject results = (SubLObject)strie.NIL;
        SubLObject node = v_strie;
        SubLObject prefix_node = (SubLObject)strie.NIL;
        SubLObject key_element;
        SubLObject remaining_key;
        for (key_element = (SubLObject)strie.NIL, remaining_key = (SubLObject)strie.NIL, key_element = element(key, (SubLObject)strie.ZERO_INTEGER), remaining_key = sequence_slice(key, (SubLObject)strie.ONE_INTEGER, (SubLObject)strie.UNPROVIDED); strie.NIL != node && !node.isCons(); node = map_utilities.map_get_without_values(node, key_element, (SubLObject)strie.UNPROVIDED), key_element = element(remaining_key, (SubLObject)strie.ZERO_INTEGER), remaining_key = sequence_slice(remaining_key, (SubLObject)strie.ONE_INTEGER, (SubLObject)strie.UNPROVIDED)) {
            if (strie.NIL != map_utilities.map_p(node)) {
                prefix_node = map_utilities.map_get_without_values(node, strie.$strie_null_key$.getGlobalValue(), (SubLObject)strie.UNPROVIDED);
                if (strie.NIL != prefix_node) {
                    results = (SubLObject)ConsesLow.cons(prefix_node, results);
                }
            }
        }
        if (strie.NIL != node && strie.NIL != sequal(node.first(), sequence_slice(key, (SubLObject)strie.ZERO_INTEGER, Sequences.length(node.first())), strie_test(v_strie))) {
            results = (SubLObject)ConsesLow.cons(node, results);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 14199L)
    public static SubLObject strie_completions(final SubLObject v_strie, final SubLObject key) {
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        assert strie.NIL != strie_key_p(key) : key;
        SubLObject node;
        SubLObject key_element;
        SubLObject remaining_key;
        for (node = v_strie, key_element = (SubLObject)strie.NIL, remaining_key = (SubLObject)strie.NIL, key_element = element(key, (SubLObject)strie.ZERO_INTEGER), remaining_key = sequence_slice(key, (SubLObject)strie.ONE_INTEGER, (SubLObject)strie.UNPROVIDED); strie.NIL != node && !node.isCons() && strie.NIL != key_element; node = map_utilities.map_get_without_values(node, key_element, (SubLObject)strie.UNPROVIDED), key_element = (SubLObject)(Sequences.length(remaining_key).numG((SubLObject)strie.ZERO_INTEGER) ? element(remaining_key, (SubLObject)strie.ZERO_INTEGER) : strie.NIL), remaining_key = sequence_slice(remaining_key, (SubLObject)strie.ONE_INTEGER, (SubLObject)strie.UNPROVIDED)) {}
        if (strie.NIL == node) {
            return (SubLObject)strie.NIL;
        }
        if (node.isCons() && strie.NIL != sequal(sequence_slice(node.first(), (SubLObject)strie.ZERO_INTEGER, Sequences.length(key)), key, strie_test(v_strie))) {
            return (SubLObject)ConsesLow.list(node);
        }
        if (strie.NIL != map_utilities.map_p(node)) {
            return strie_entries(node);
        }
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 15061L)
    public static SubLObject map_strie(final SubLObject v_strie, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        assert strie.NIL != Types.functionp(function) : function;
        final SubLObject stack = stacks.create_stack();
        final SubLObject iterator = map_utilities.new_map_iterator(v_strie);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)strie.NIL; strie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (strie.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject dict_key = (SubLObject)strie.NIL;
                SubLObject dict_value = (SubLObject)strie.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list49);
                dict_key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list49);
                dict_value = current.first();
                current = current.rest();
                if (strie.NIL == current) {
                    if (strie.NIL != map_utilities.map_p(dict_value)) {
                        stacks.stack_push(dict_value, stack);
                    }
                    else if (dict_value.isCons()) {
                        final SubLObject key = dict_value.first();
                        final SubLObject value = dict_value.rest();
                        Functions.funcall(function, key, value);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list49);
                }
            }
        }
        while (strie.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
            SubLObject valid2;
            for (SubLObject done_var2 = (SubLObject)strie.NIL; strie.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid2)) {
                thread.resetMultipleValues();
                final SubLObject var2 = iteration.iteration_next(iterator2);
                valid2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (strie.NIL != valid2) {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = var2;
                    SubLObject dict_key2 = (SubLObject)strie.NIL;
                    SubLObject dict_value2 = (SubLObject)strie.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)strie.$list49);
                    dict_key2 = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)strie.$list49);
                    dict_value2 = current2.first();
                    current2 = current2.rest();
                    if (strie.NIL == current2) {
                        if (strie.NIL != map_utilities.map_p(dict_value2)) {
                            stacks.stack_push(dict_value2, stack);
                        }
                        else if (dict_value2.isCons()) {
                            final SubLObject key2 = dict_value2.first();
                            final SubLObject value2 = dict_value2.rest();
                            Functions.funcall(function, key2, value2);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)strie.$list49);
                    }
                }
            }
        }
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 15435L)
    public static SubLObject strie_key_p(final SubLObject v_object) {
        if (v_object.isList()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == subl_promotions.memberP(strie.$strie_null_key$.getGlobalValue(), v_object, Symbols.symbol_function((SubLObject)strie.EQUAL), (SubLObject)strie.UNPROVIDED));
        }
        if (v_object.isString()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == string_utilities.char_position(strie.$strie_null_key$.getGlobalValue(), v_object, (SubLObject)strie.UNPROVIDED));
        }
        if (v_object.isVector()) {
            return (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == subl_promotions.memberP(strie.$strie_null_key$.getGlobalValue(), vector_utilities.vector_elements(v_object, (SubLObject)strie.UNPROVIDED), (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED));
        }
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 15809L)
    public static SubLObject visit_strie_hierarchically(final SubLObject v_strie, final SubLObject visitor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert strie.NIL != strie_p(v_strie, (SubLObject)strie.UNPROVIDED) : v_strie;
        assert strie.NIL != hierarchical_visitor.hierarchical_visitor_p(visitor) : visitor;
        hierarchical_visitor.hierarchical_visitor_begin_visit(visitor);
        final SubLObject stack = stacks.create_stack();
        stacks.stack_push((SubLObject)ConsesLow.list((SubLObject)strie.$kw55$VISIT, (SubLObject)strie.NIL, v_strie), stack);
        while (strie.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject current_task = stacks.stack_pop(stack);
            SubLObject current;
            final SubLObject datum = current = current_task;
            SubLObject task = (SubLObject)strie.NIL;
            SubLObject path = (SubLObject)strie.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list56);
            task = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)strie.$list56);
            path = current.first();
            current = current.rest();
            final SubLObject v_strie_$3 = (SubLObject)(current.isCons() ? current.first() : strie.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)strie.$list56);
            current = current.rest();
            if (strie.NIL == current) {
                final SubLObject pcase_var = task;
                if (pcase_var.eql((SubLObject)strie.$kw55$VISIT)) {
                    hierarchical_visitor.show_hierarchical_visitor_path_begin(visitor, path);
                    stacks.stack_push((SubLObject)ConsesLow.list((SubLObject)strie.$kw57$FINISH, path), stack);
                    final SubLObject iterator = map_utilities.new_map_iterator(v_strie_$3);
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)strie.NIL; strie.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (strie.NIL != valid) {
                            SubLObject current_$5;
                            final SubLObject datum_$4 = current_$5 = var;
                            SubLObject dict_key = (SubLObject)strie.NIL;
                            SubLObject payload = (SubLObject)strie.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, (SubLObject)strie.$list58);
                            dict_key = current_$5.first();
                            current_$5 = current_$5.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$5, datum_$4, (SubLObject)strie.$list58);
                            payload = current_$5.first();
                            current_$5 = current_$5.rest();
                            if (strie.NIL == current_$5) {
                                if (strie.NIL != map_utilities.map_p(payload)) {
                                    final SubLObject new_path = (SubLObject)ConsesLow.cons(dict_key, path);
                                    final SubLObject new_task = (SubLObject)ConsesLow.list((SubLObject)strie.$kw55$VISIT, new_path, payload);
                                    stacks.stack_push(new_task, stack);
                                }
                                else if (payload.isCons()) {
                                    final SubLObject value = (SubLObject)ConsesLow.cons(dict_key, payload);
                                    hierarchical_visitor.show_hierarchical_visitor_node(visitor, value);
                                }
                                else {
                                    Errors.error((SubLObject)strie.$str59$Invalid_STRIE_entry__A_____neithe, payload);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$4, (SubLObject)strie.$list58);
                            }
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)strie.$kw57$FINISH)) {
                    hierarchical_visitor.show_hierarchical_visitor_path_end(visitor, path);
                }
                else {
                    Errors.error((SubLObject)strie.$str60$Invalid_state_transition__A_in_vi, current_task);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)strie.$list56);
            }
        }
        hierarchical_visitor.hierarchical_visitor_end_visit(visitor);
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 17551L)
    public static SubLObject strie_p_internal(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() || (strie.NIL != map_utilities.map_p(v_object) && strie.NIL == list_utilities.find_if_not(Symbols.symbol_function((SubLObject)strie.$sym61$STRIE_P_INTERNAL), map_utilities.map_values(v_object), (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 17862L)
    public static SubLObject strie_insert_internal(final SubLObject v_strie, final SubLObject sequence, final SubLObject value, final SubLObject depth, final SubLObject internal_key) {
        final SubLObject key_element = element(sequence, (SubLObject)strie.ZERO_INTEGER);
        final SubLObject found = map_utilities.map_get_without_values(v_strie, key_element, (SubLObject)strie.UNPROVIDED);
        if (strie.NIL == found) {
            map_utilities.map_put(v_strie, key_element, (SubLObject)ConsesLow.cons(internal_key, value));
            return (SubLObject)strie.$kw62$CREATED;
        }
        if (strie.NIL != map_utilities.map_p(found)) {
            final SubLObject result = strie_insert_internal(found, sequence_slice(sequence, (SubLObject)strie.ONE_INTEGER, (SubLObject)strie.UNPROVIDED), value, Numbers.add(depth, (SubLObject)strie.ONE_INTEGER), internal_key);
            map_utilities.map_touch(v_strie, key_element);
            return result;
        }
        if (strie.NIL != sequal(internal_key, found.first(), strie_test(v_strie))) {
            map_utilities.map_put(v_strie, key_element, (SubLObject)ConsesLow.cons(internal_key, ConsesLow.append(value, found.rest())));
            return (SubLObject)strie.$kw52$ADDED;
        }
        final SubLObject sub_trie = dictionary.new_dictionary(strie_test(v_strie), (SubLObject)strie.UNPROVIDED);
        map_utilities.map_put(v_strie, key_element, sub_trie);
        strie_insert_internal(sub_trie, sequence_slice(sequence_null_pad(found.first()), depth, (SubLObject)strie.UNPROVIDED), found.rest(), Numbers.add(depth, (SubLObject)strie.ONE_INTEGER), found.first());
        strie_insert_internal(sub_trie, sequence_slice(sequence, (SubLObject)strie.ONE_INTEGER, (SubLObject)strie.UNPROVIDED), value, Numbers.add(depth, (SubLObject)strie.ONE_INTEGER), internal_key);
        return (SubLObject)strie.$kw63$SPLICED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 20471L)
    public static SubLObject strie_remove_internal(final SubLObject v_strie, final SubLObject sequence, final SubLObject internal_key) {
        final SubLObject key_element = element(sequence, (SubLObject)strie.ZERO_INTEGER);
        final SubLObject found = map_utilities.map_get_without_values(v_strie, key_element, (SubLObject)strie.UNPROVIDED);
        SubLObject result = (SubLObject)strie.NIL;
        if (strie.NIL == found) {
            return (SubLObject)strie.$kw51$VOID;
        }
        if (strie.NIL != map_utilities.map_p(found)) {
            result = strie_remove_internal(found, sequence_slice(sequence, (SubLObject)strie.ONE_INTEGER, (SubLObject)strie.UNPROVIDED), internal_key);
            if (strie.NIL != strie_modified_in_removal_p(result)) {
                if (map_utilities.map_size(found).numE((SubLObject)strie.ONE_INTEGER)) {
                    final SubLObject values = map_utilities.map_values(found);
                    if (values.first().isCons()) {
                        map_utilities.map_put(v_strie, key_element, values.first());
                        result = (SubLObject)strie.$kw64$SHRUNK;
                    }
                    else {
                        map_utilities.map_touch(v_strie, key_element);
                    }
                }
                else if (strie.NIL != map_utilities.map_empty_p(found)) {
                    map_utilities.map_remove(v_strie, key_element);
                    result = (SubLObject)strie.$kw64$SHRUNK;
                }
                else {
                    map_utilities.map_touch(v_strie, key_element);
                }
            }
            return result;
        }
        if (strie.NIL != sequal(internal_key, found.first(), strie_test(v_strie))) {
            map_utilities.map_remove(v_strie, key_element);
            return (SubLObject)strie.$kw65$REMOVED;
        }
        return (SubLObject)strie.$kw51$VOID;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 22598L)
    public static SubLObject strie_modified_in_removal_p(final SubLObject result) {
        return (SubLObject)SubLObjectFactory.makeBoolean(strie.$kw65$REMOVED == result || strie.$kw64$SHRUNK == result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 22788L)
    public static SubLObject element(final SubLObject sequence, final SubLObject index) {
        return (SubLObject)((strie.NIL != sequence) ? Sequences.elt(sequence, index) : strie.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 23224L)
    public static SubLObject sequence_null_pad(final SubLObject sequence) {
        if (sequence.isList()) {
            return Sequences.cconcatenate(sequence, (SubLObject)ConsesLow.list(strie.$strie_null_key$.getGlobalValue()));
        }
        if (sequence.isString()) {
            return Sequences.cconcatenate(sequence, Strings.string(strie.$strie_null_key$.getGlobalValue()));
        }
        if (sequence.isVector()) {
            return Sequences.cconcatenate(sequence, Strings.string(strie.$strie_null_key$.getGlobalValue()));
        }
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 23568L)
    public static SubLObject sequence_slice(final SubLObject sequence, final SubLObject start, SubLObject end) {
        if (end == strie.UNPROVIDED) {
            end = (SubLObject)strie.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert strie.NIL != Types.integerp(start) : start;
        if (strie.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && strie.NIL != end && !end.isInteger()) {
            Errors.error(Errors.error((SubLObject)strie.$str67$_A_is_not_an_integer));
        }
        if (strie.NIL != end && start.numG(end)) {
            Errors.error((SubLObject)strie.$str68$END_must_not_be_smaller_than_STAR);
        }
        if (sequence.isList()) {
            return (strie.NIL != end) ? list_utilities.first_n(Numbers.subtract(end, start), conses_high.nthcdr(start, sequence)) : conses_high.nthcdr(start, sequence);
        }
        if (sequence.isVector()) {
            return vector_slice(sequence, start, end);
        }
        if (sequence.isString()) {
            return vector_slice(sequence, start, end);
        }
        Errors.error((SubLObject)strie.$str69$_A_is_not_a_sequence, sequence);
        return (SubLObject)strie.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 24274L)
    public static SubLObject vector_slice(final SubLObject vector, final SubLObject start, SubLObject end) {
        if (end == strie.UNPROVIDED) {
            end = (SubLObject)strie.NIL;
        }
        final SubLObject vector_length = Sequences.length(vector);
        final SubLObject end2 = (strie.NIL == end || end.numG(vector_length)) ? vector_length : end;
        return (SubLObject)(start.numGE(vector_length) ? strie.NIL : Sequences.subseq(vector, start, end2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 24694L)
    public static SubLObject sequal(final SubLObject seq1, final SubLObject seq2, SubLObject test) {
        if (test == strie.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)strie.EQL);
        }
        if (seq1.isList()) {
            if (seq2.isList()) {
                return (SubLObject)SubLObjectFactory.makeBoolean(strie.NIL == Sequences.mismatch(seq1, seq2, test, (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED, (SubLObject)strie.UNPROVIDED));
            }
            return lvequal(seq1, seq2, test);
        }
        else {
            if (seq2.isList()) {
                return lvequal(seq2, seq1, test);
            }
            return vequal(seq1, seq2, test);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 25152L)
    public static SubLObject lvequal(final SubLObject list, final SubLObject vector, final SubLObject test) {
        SubLObject equal;
        SubLObject rem_list;
        SubLObject i;
        SubLObject length;
        for (equal = (SubLObject)strie.T, rem_list = list, i = (SubLObject)strie.ZERO_INTEGER, length = Sequences.length(vector); strie.NIL != equal && i.numL(length) && strie.NIL != rem_list; equal = Functions.funcall(test, rem_list.first(), Vectors.aref(vector, i)), rem_list = rem_list.rest(), i = Numbers.add(i, (SubLObject)strie.ONE_INTEGER)) {}
        if (i.numE(length)) {
            if (strie.NIL != rem_list) {
                equal = (SubLObject)strie.NIL;
            }
        }
        else if (strie.NIL == rem_list) {
            equal = (SubLObject)strie.NIL;
        }
        return equal;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 25688L)
    public static SubLObject vequal(final SubLObject vec1, final SubLObject vec2, final SubLObject test) {
        SubLObject equal = (SubLObject)strie.T;
        final SubLObject length1 = Sequences.length(vec1);
        final SubLObject length2 = Sequences.length(vec2);
        SubLObject i = (SubLObject)strie.ZERO_INTEGER;
        if (length1.eql(length2)) {
            while (strie.NIL != equal && i.numL(length1)) {
                equal = Functions.funcall(test, Vectors.aref(vec1, i), Vectors.aref(vec2, i));
                i = Numbers.add(i, (SubLObject)strie.ONE_INTEGER);
            }
        }
        else {
            equal = (SubLObject)strie.NIL;
        }
        return equal;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/strie.lisp", position = 26408L)
    public static SubLObject test_exercise_strie(final SubLObject name_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_strie = new_strie(Symbols.symbol_function((SubLObject)strie.EQUALP));
        final SubLObject lookaside = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)strie.EQUALP), (SubLObject)strie.UNPROVIDED);
        SubLObject cdolist_list_var = name_list;
        SubLObject name = (SubLObject)strie.NIL;
        name = cdolist_list_var.first();
        while (strie.NIL != cdolist_list_var) {
            map_utilities.map_put(lookaside, name, string_utilities.split_string(name, (SubLObject)strie.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        if (strie.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && strie.NIL == strie_empty_p(v_strie)) {
            Errors.error((SubLObject)strie.$str78$There_are_already__A_entries_in_t, strie_size(v_strie));
        }
        cdolist_list_var = name_list;
        name = (SubLObject)strie.NIL;
        name = cdolist_list_var.first();
        while (strie.NIL != cdolist_list_var) {
            final SubLObject key = map_utilities.map_get_without_values(lookaside, name, (SubLObject)strie.UNPROVIDED);
            strie_insert(v_strie, key, name);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        cdolist_list_var = name_list;
        name = (SubLObject)strie.NIL;
        name = cdolist_list_var.first();
        while (strie.NIL != cdolist_list_var) {
            final SubLObject key = map_utilities.map_get_without_values(lookaside, name, (SubLObject)strie.UNPROVIDED);
            if (strie.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !name.equalp(strie_lookup(v_strie, key).first())) {
                Errors.error((SubLObject)strie.$str79$Cannot_retrieve__A_with_lookup_ke, name, key);
            }
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2;
        final SubLObject long_names = cdolist_list_var2 = Sort.sort(conses_high.copy_list(name_list), Symbols.symbol_function((SubLObject)strie.$sym80$_), Symbols.symbol_function((SubLObject)strie.$sym81$LENGTH));
        SubLObject name2 = (SubLObject)strie.NIL;
        name2 = cdolist_list_var2.first();
        while (strie.NIL != cdolist_list_var2) {
            final SubLObject key2 = map_utilities.map_get_without_values(lookaside, name2, (SubLObject)strie.UNPROVIDED);
            final SubLObject result = strie_remove(v_strie, key2);
            if (strie.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && strie.NIL == strie_modified_in_removal_p(result)) {
                Errors.error((SubLObject)strie.$str82$The_deletion_of_key__A_did_not_mo, key2);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            name2 = cdolist_list_var2.first();
        }
        if (strie.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && strie.NIL == strie_empty_p(v_strie)) {
            Errors.error((SubLObject)strie.$str83$There_are_still__A_entries_left_o, strie_size(v_strie), map_utilities.map_values(v_strie));
        }
        return (SubLObject)strie.$kw84$SUCCESS;
    }
    
    public static SubLObject declare_strie_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.strie", "new_info_node", "NEW-INFO-NODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.strie", "info_node_p", "INFO-NODE-P");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.strie", "info_node_key", "INFO-NODE-KEY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.strie", "info_node_value", "INFO-NODE-VALUE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.strie", "info_node_entry", "INFO-NODE-ENTRY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.strie", "info_node_key_set", "INFO-NODE-KEY-SET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.strie", "info_node_value_set", "INFO-NODE-VALUE-SET");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "new_strie", "NEW-STRIE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_clear", "STRIE-CLEAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_p", "STRIE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_test", "STRIE-TEST", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.strie", "do_strie_progress", "DO-STRIE-PROGRESS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.strie", "do_strie", "DO-STRIE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.strie", "do_strie_interior_node", "DO-STRIE-INTERIOR-NODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "new_strie_iterator", "NEW-STRIE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_iterator_done_p", "STRIE-ITERATOR-DONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_iterator_next", "STRIE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "make_strie_iterator", "MAKE-STRIE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_size", "STRIE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_empty_p", "STRIE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_replace", "STRIE-REPLACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_insert", "STRIE-INSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_remove", "STRIE-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_unassociate", "STRIE-UNASSOCIATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_lookup", "STRIE-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_keys", "STRIE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_values", "STRIE-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_entries", "STRIE-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_prefixes", "STRIE-PREFIXES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_completions", "STRIE-COMPLETIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "map_strie", "MAP-STRIE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_key_p", "STRIE-KEY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "visit_strie_hierarchically", "VISIT-STRIE-HIERARCHICALLY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_p_internal", "STRIE-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_insert_internal", "STRIE-INSERT-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_remove_internal", "STRIE-REMOVE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "strie_modified_in_removal_p", "STRIE-MODIFIED-IN-REMOVAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "element", "ELEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "sequence_null_pad", "SEQUENCE-NULL-PAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "sequence_slice", "SEQUENCE-SLICE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "vector_slice", "VECTOR-SLICE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "sequal", "SEQUAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "lvequal", "LVEQUAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "vequal", "VEQUAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.strie", "test_exercise_strie", "TEST-EXERCISE-STRIE", 1, 0, false);
        return (SubLObject)strie.NIL;
    }
    
    public static SubLObject init_strie_file() {
        strie.$strie_null_key$ = SubLFiles.defconstant("*STRIE-NULL-KEY*", (SubLObject)Characters.CHAR_vertical);
        return (SubLObject)strie.NIL;
    }
    
    public static SubLObject setup_strie_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)strie.$sym47$STRIE_ITERATOR_DONE_P);
        utilities_macros.note_funcall_helper_function((SubLObject)strie.$sym48$STRIE_ITERATOR_NEXT);
        generic_testing.define_test_case_table_int((SubLObject)strie.$sym70$TEST_EXERCISE_STRIE, (SubLObject)ConsesLow.list(new SubLObject[] { strie.$kw71$TEST, strie.EQUAL, strie.$kw72$OWNER, strie.NIL, strie.$kw73$CLASSES, strie.NIL, strie.$kw74$KB, strie.$kw75$TINY, strie.$kw76$WORKING_, strie.T }), (SubLObject)strie.$list77);
        return (SubLObject)strie.NIL;
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
        me = (SubLFile)new strie();
        strie.$strie_null_key$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym1$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $sym3$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFO-NODE"));
        $sym5$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym6$CDR = SubLObjectFactory.makeSymbol("CDR");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFO-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"));
        $sym8$RPLACA = SubLObjectFactory.makeSymbol("RPLACA");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFO-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym10$RPLACD = SubLObjectFactory.makeSymbol("RPLACD");
        $sym11$VALID_HASH_TEST_P = SubLObjectFactory.makeSymbol("VALID-HASH-TEST-P");
        $sym12$STRIE_P = SubLObjectFactory.makeSymbol("STRIE-P");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("STRIE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-NOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)strie.NIL, (SubLObject)SubLObjectFactory.makeString("Mapping ~S..."), (SubLObject)SubLObjectFactory.makeSymbol("STRIE")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-NOTE"));
        $kw15$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw16$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw17$PROGRESS_NOTE = SubLObjectFactory.makeKeyword("PROGRESS-NOTE");
        $str18$Mapping__S___ = SubLObjectFactory.makeString("Mapping ~S...");
        $sym19$STACK = SubLObjectFactory.makeUninternedSymbol("STACK");
        $sym20$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $sym21$STRIE_DICT_KEY = SubLObjectFactory.makeUninternedSymbol("STRIE-DICT-KEY");
        $sym22$STRIE_DICT_VALUE = SubLObjectFactory.makeUninternedSymbol("STRIE-DICT-VALUE");
        $sym23$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-STACK")));
        $sym25$DO_MAP = SubLObjectFactory.makeSymbol("DO-MAP");
        $kw26$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym27$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym28$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym29$MAP_P = SubLObjectFactory.makeSymbol("MAP-P");
        $sym30$STACK_PUSH = SubLObjectFactory.makeSymbol("STACK-PUSH");
        $sym31$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym32$COR = SubLObjectFactory.makeSymbol("COR");
        $sym33$STACK_EMPTY_P = SubLObjectFactory.makeSymbol("STACK-EMPTY-P");
        $sym34$STACK_POP = SubLObjectFactory.makeSymbol("STACK-POP");
        $sym35$DO_STRIE_INTERIOR_NODE = SubLObjectFactory.makeSymbol("DO-STRIE-INTERIOR-NODE");
        $sym36$INFO_NODE_P = SubLObjectFactory.makeSymbol("INFO-NODE-P");
        $sym37$INFO_NODE_KEY = SubLObjectFactory.makeSymbol("INFO-NODE-KEY");
        $sym38$INFO_NODE_VALUE = SubLObjectFactory.makeSymbol("INFO-NODE-VALUE");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("STRIE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym41$STACK = SubLObjectFactory.makeUninternedSymbol("STACK");
        $sym42$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("DICT-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("STACK")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym44$DICT_KEY = SubLObjectFactory.makeUninternedSymbol("DICT-KEY");
        $sym45$DICT_VALUE = SubLObjectFactory.makeUninternedSymbol("DICT-VALUE");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAP-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("STACK"));
        $sym47$STRIE_ITERATOR_DONE_P = SubLObjectFactory.makeSymbol("STRIE-ITERATOR-DONE-P");
        $sym48$STRIE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("STRIE-ITERATOR-NEXT");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("DICT-KEY"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DICT-VALUE"));
        $sym50$STRIE_KEY_P = SubLObjectFactory.makeSymbol("STRIE-KEY-P");
        $kw51$VOID = SubLObjectFactory.makeKeyword("VOID");
        $kw52$ADDED = SubLObjectFactory.makeKeyword("ADDED");
        $sym53$FUNCTIONP = SubLObjectFactory.makeSymbol("FUNCTIONP");
        $sym54$HIERARCHICAL_VISITOR_P = SubLObjectFactory.makeSymbol("HIERARCHICAL-VISITOR-P");
        $kw55$VISIT = SubLObjectFactory.makeKeyword("VISIT");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("PATH"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("STRIE"));
        $kw57$FINISH = SubLObjectFactory.makeKeyword("FINISH");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICT-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PAYLOAD"));
        $str59$Invalid_STRIE_entry__A_____neithe = SubLObjectFactory.makeString("Invalid STRIE entry ~A ... neither sub-tree nor info node.");
        $str60$Invalid_state_transition__A_in_vi = SubLObjectFactory.makeString("Invalid state transition ~A in visitng of STRIE.");
        $sym61$STRIE_P_INTERNAL = SubLObjectFactory.makeSymbol("STRIE-P-INTERNAL");
        $kw62$CREATED = SubLObjectFactory.makeKeyword("CREATED");
        $kw63$SPLICED = SubLObjectFactory.makeKeyword("SPLICED");
        $kw64$SHRUNK = SubLObjectFactory.makeKeyword("SHRUNK");
        $kw65$REMOVED = SubLObjectFactory.makeKeyword("REMOVED");
        $sym66$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str67$_A_is_not_an_integer = SubLObjectFactory.makeString("~A is not an integer");
        $str68$END_must_not_be_smaller_than_STAR = SubLObjectFactory.makeString("END must not be smaller than START");
        $str69$_A_is_not_a_sequence = SubLObjectFactory.makeString("~A is not a sequence");
        $sym70$TEST_EXERCISE_STRIE = SubLObjectFactory.makeSymbol("TEST-EXERCISE-STRIE");
        $kw71$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw72$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw73$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw74$KB = SubLObjectFactory.makeKeyword("KB");
        $kw75$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw76$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("George Washington Carver"), (SubLObject)SubLObjectFactory.makeString("George Washington"), (SubLObject)SubLObjectFactory.makeString("George Washington Adams"), (SubLObject)SubLObjectFactory.makeString("George Washington Curtis Lee"))), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str78$There_are_already__A_entries_in_t = SubLObjectFactory.makeString("There are already ~A entries in the trie???");
        $str79$Cannot_retrieve__A_with_lookup_ke = SubLObjectFactory.makeString("Cannot retrieve ~A with lookup-key ~A.");
        $sym80$_ = SubLObjectFactory.makeSymbol(">");
        $sym81$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $str82$The_deletion_of_key__A_did_not_mo = SubLObjectFactory.makeString("The deletion of key ~A did not modify the STrie!");
        $str83$There_are_still__A_entries_left_o = SubLObjectFactory.makeString("There are still ~A entries left over: ~A");
        $kw84$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
    }
}

/*

	Total time: 368 ms
	
*/