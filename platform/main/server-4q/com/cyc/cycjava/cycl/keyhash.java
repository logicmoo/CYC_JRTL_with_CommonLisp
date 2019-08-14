/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_raw_write_byte;
import static com.cyc.cycjava.cycl.cfasl.register_cfasl_input_function;
import static com.cyc.cycjava.cycl.hash_table_utilities.hash_test_to_symbol;
import static com.cyc.cycjava.cycl.iteration.new_filter_iterator;
import static com.cyc.cycjava.cycl.iteration.new_vector_iterator;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_size;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_test;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.fixnumMultiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KEYHASH
 * source file: /cyc/top/cycl/keyhash.lisp
 * created:     2019/07/03 17:37:10
 */
public final class keyhash extends SubLTranslatedFile implements V12 {
    public static final SubLObject store_in_keyhash(SubLObject node_key, SubLObject node_keycode, SubLObject v_keyhash) {
        {
            SubLObject index = keyhash_lookup_key(node_key, node_keycode, v_keyhash);
            if (!index.isNumber()) {
                Errors.error($str_alt62$The_keyhash__A_mysteriously_overf, v_keyhash);
            }
            {
                SubLObject nodes = khash_nodes(v_keyhash);
                SubLObject hash_stash = khash_hash_stash(v_keyhash);
                set_aref(nodes, index, node_key);
                set_aref(hash_stash, index, node_keycode);
            }
        }
        return v_keyhash;
    }

    public static final SubLObject set_to_next_probe_index(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject index = NIL;
            SubLObject capacity = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt37);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt37);
            capacity = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PROGN, listS(CDEC, index, $list_alt40), list(PWHEN, list(MINUSP, index), list(CINC, index, capacity)));
            } else {
                cdestructuring_bind_error(datum, $list_alt37);
            }
        }
        return NIL;
    }

    public static final SubLObject scale_keycode_to_keyhash(SubLObject keycode, SubLObject v_keyhash) {
        {
            SubLObject capacity = keyhash_capacity_internal(v_keyhash);
            SubLObject mask = subtract(capacity, ONE_INTEGER);
            return logand(fixnumMultiply(logand(keycode, mask), $keyhash_a$.getGlobalValue()), mask);
        }
    }

    public static final SubLObject potentially_grow_keyhash(SubLObject v_keyhash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject capacity = keyhash_capacity_internal(v_keyhash);
                SubLObject count = keyhash_count(v_keyhash);
                SubLObject growth_tuple = assoc(capacity, $keyhash_grow_sizes$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!growth_tuple.isCons()) {
                        Errors.error($str_alt35$Keyhash_capacity__A_has_exceeded_, capacity, keyhash_table_size_limit_tuple());
                    }
                }
                {
                    SubLObject datum = growth_tuple;
                    SubLObject current = datum;
                    SubLObject the_capacity = NIL;
                    SubLObject the_limit = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt36);
                    the_capacity = current.first();
                    current = current.rest();
                    the_limit = current;
                    if (!count.numL(the_limit)) {
                        grow_keyhash(v_keyhash);
                    }
                }
            }
            return v_keyhash;
        }
    }

    public static final SubLObject keyhash_table_size_limit_tuple() {
        return last($keyhash_grow_sizes$.getGlobalValue(), UNPROVIDED).first();
    }

    public static final SubLObject keyhash_lookup_loop(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject test_function = NIL;
            SubLObject key = NIL;
            SubLObject keycode = NIL;
            SubLObject nodes = NIL;
            SubLObject hash_stash = NIL;
            SubLObject capacity = NIL;
            SubLObject index = NIL;
            SubLObject wrapped_around = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            test_function = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            keycode = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            nodes = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            hash_stash = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            capacity = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt44);
            wrapped_around = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CLET, $list_alt46, list(WHILE, $list_alt48, list(CLET, list(list(NODE_KEY, list(AREF, nodes, index))), list(PCOND, $list_alt52, bq_cons(list(CAND, list($sym54$_, keycode, list(AREF, hash_stash, index)), listS(test_function, key, $list_alt55)), $list_alt56), bq_cons(list($sym54$_, index, wrapped_around), $list_alt57), list(T, list(SET_TO_NEXT_PROBE_INDEX, index, capacity))))));
            } else {
                cdestructuring_bind_error(datum, $list_alt44);
            }
        }
        return NIL;
    }

    public static final SubLObject keyhash_lookup_key_equalp(SubLObject key, SubLObject keycode, SubLObject nodes, SubLObject hash_stash, SubLObject capacity, SubLObject index, SubLObject wrapped_around) {
        {
            SubLObject done = NIL;
            while (NIL == done) {
                {
                    SubLObject node_key = aref(nodes, index);
                    if (node_key == $keyhash_empty_key$.getGlobalValue()) {
                        done = T;
                    } else {
                        if (keycode.numE(aref(hash_stash, index)) && key.equalp(node_key)) {
                            done = T;
                        } else {
                            if (index.numE(wrapped_around)) {
                                return $NO_NODE;
                            } else {
                                index = subtract(index, $keyhash_step$.getGlobalValue());
                                if (index.isNegative()) {
                                    index = add(index, capacity);
                                }
                            }
                        }
                    }
                }
            } 
        }
        return index;
    }

    public static final SubLObject keyhash_lookup_key_equal(SubLObject key, SubLObject keycode, SubLObject nodes, SubLObject hash_stash, SubLObject capacity, SubLObject index, SubLObject wrapped_around) {
        {
            SubLObject done = NIL;
            while (NIL == done) {
                {
                    SubLObject node_key = aref(nodes, index);
                    if (node_key == $keyhash_empty_key$.getGlobalValue()) {
                        done = T;
                    } else {
                        if (keycode.numE(aref(hash_stash, index)) && key.equal(node_key)) {
                            done = T;
                        } else {
                            if (index.numE(wrapped_around)) {
                                return $NO_NODE;
                            } else {
                                index = subtract(index, $keyhash_step$.getGlobalValue());
                                if (index.isNegative()) {
                                    index = add(index, capacity);
                                }
                            }
                        }
                    }
                }
            } 
        }
        return index;
    }

    public static final SubLObject keyhash_lookup_key_eql(SubLObject key, SubLObject keycode, SubLObject nodes, SubLObject hash_stash, SubLObject capacity, SubLObject index, SubLObject wrapped_around) {
        {
            SubLObject done = NIL;
            while (NIL == done) {
                {
                    SubLObject node_key = aref(nodes, index);
                    if (node_key == $keyhash_empty_key$.getGlobalValue()) {
                        done = T;
                    } else {
                        if (keycode.numE(aref(hash_stash, index)) && key.eql(node_key)) {
                            done = T;
                        } else {
                            if (index.numE(wrapped_around)) {
                                return $NO_NODE;
                            } else {
                                index = subtract(index, $keyhash_step$.getGlobalValue());
                                if (index.isNegative()) {
                                    index = add(index, capacity);
                                }
                            }
                        }
                    }
                }
            } 
        }
        return index;
    }

    public static final SubLObject keyhash_lookup_key_eq(SubLObject key, SubLObject keycode, SubLObject nodes, SubLObject hash_stash, SubLObject capacity, SubLObject index, SubLObject wrapped_around) {
        {
            SubLObject done = NIL;
            while (NIL == done) {
                {
                    SubLObject node_key = aref(nodes, index);
                    if (node_key == $keyhash_empty_key$.getGlobalValue()) {
                        done = T;
                    } else {
                        if (keycode.numE(aref(hash_stash, index)) && (key == node_key)) {
                            done = T;
                        } else {
                            if (index.numE(wrapped_around)) {
                                return $NO_NODE;
                            } else {
                                index = subtract(index, $keyhash_step$.getGlobalValue());
                                if (index.isNegative()) {
                                    index = add(index, capacity);
                                }
                            }
                        }
                    }
                }
            } 
        }
        return index;
    }

    public static final SubLObject keyhash_lookup_key(SubLObject key, SubLObject keycode, SubLObject v_keyhash) {
        {
            SubLObject test_function = keyhash_test(v_keyhash);
            SubLObject nodes = khash_nodes(v_keyhash);
            SubLObject hash_stash = khash_hash_stash(v_keyhash);
            SubLObject capacity = keyhash_capacity_internal(v_keyhash);
            SubLObject index = scale_keycode_to_keyhash(keycode, v_keyhash);
            SubLObject wrapped_around = add(index, $keyhash_step$.getGlobalValue());
            if (wrapped_around.numG(capacity)) {
                wrapped_around = subtract(wrapped_around, capacity);
            }
            {
                SubLObject pcase_var = test_function;
                if (pcase_var.eql(QUOTE) || pcase_var.eql(EQ)) {
                    return keyhash_lookup_key_eq(key, keycode, nodes, hash_stash, capacity, index, wrapped_around);
                } else {
                    if (pcase_var.eql(QUOTE) || pcase_var.eql(EQL)) {
                        return keyhash_lookup_key_eql(key, keycode, nodes, hash_stash, capacity, index, wrapped_around);
                    } else {
                        if (pcase_var.eql(QUOTE) || pcase_var.eql(EQUAL)) {
                            return keyhash_lookup_key_equal(key, keycode, nodes, hash_stash, capacity, index, wrapped_around);
                        } else {
                            if (pcase_var.eql(QUOTE) || pcase_var.eql(EQUALP)) {
                                return keyhash_lookup_key_equalp(key, keycode, nodes, hash_stash, capacity, index, wrapped_around);
                            } else {
                                Errors.error($str_alt61$Unsupported_test_function__s, test_function);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject keyhash_find_key(SubLObject key, SubLObject v_keyhash) {
        return keyhash_lookup_key(key, Sxhash.sxhash(key), v_keyhash);
    }

    /**
     * Given the index of a gap in the hashtable, walk down the probe chain
     * and swap up any items that belong to the same chain.
     */
    @LispMethod(comment = "Given the index of a gap in the hashtable, walk down the probe chain\r\nand swap up any items that belong to the same chain.\nGiven the index of a gap in the hashtable, walk down the probe chain\nand swap up any items that belong to the same chain.")
    public static final SubLObject keyhash_fill_gap(SubLObject gap_index, SubLObject v_keyhash) {
        {
            SubLObject capacity = keyhash_capacity_internal(v_keyhash);
            SubLObject nodes = khash_nodes(v_keyhash);
            SubLObject hash_stash = khash_hash_stash(v_keyhash);
            SubLObject empty = gap_index;
            SubLObject done = NIL;
            clear_keyhash_node(v_keyhash, empty);
            while (NIL == done) {
                gap_index = subtract(gap_index, $keyhash_step$.getGlobalValue());
                if (gap_index.isNegative()) {
                    gap_index = add(gap_index, capacity);
                }
                {
                    SubLObject node_key = aref(nodes, gap_index);
                    if (node_key == $keyhash_empty_key$.getGlobalValue()) {
                        done = T;
                    } else {
                        {
                            SubLObject node_keycode = aref(hash_stash, gap_index);
                            SubLObject new_index = keyhash_lookup_key(node_key, node_keycode, v_keyhash);
                            if (new_index.numE(empty)) {
                                set_aref(nodes, empty, node_key);
                                set_aref(hash_stash, empty, node_keycode);
                                empty = gap_index;
                                clear_keyhash_node(v_keyhash, empty);
                            }
                        }
                    }
                }
            } 
        }
        return v_keyhash;
    }

    /**
     * Return both the system wide hashcode and the localized hash code value,
     * i.e. the one scaled to our keyhash size.
     */
    @LispMethod(comment = "Return both the system wide hashcode and the localized hash code value,\r\ni.e. the one scaled to our keyhash size.\nReturn both the system wide hashcode and the localized hash code value,\ni.e. the one scaled to our keyhash size.")
    public static final SubLObject keyhash_compute_hash(SubLObject key, SubLObject v_keyhash) {
        {
            SubLObject keycode = Sxhash.sxhash(key);
            SubLObject index = scale_keycode_to_keyhash(keycode, v_keyhash);
            return values(keycode, index);
        }
    }

    public static final SubLObject keyhash_cannot_find_empty_nodeP(SubLObject val) {
        return eq(val, $NO_NODE);
    }

    public static final SubLObject keyhash_allocate_nodes(SubLObject v_keyhash, SubLObject capacity) {
        _csetf_khash_nodes(v_keyhash, make_vector(capacity, $keyhash_empty_key$.getGlobalValue()));
        _csetf_khash_hash_stash(v_keyhash, make_vector(capacity, $keyhash_empty_hash$.getGlobalValue()));
        return v_keyhash;
    }

    public static final SubLObject keyhash_allocate(SubLObject v_keyhash, SubLObject proposed_size) {
        {
            SubLObject capacity = compute_keyhash_capacity(proposed_size);
            keyhash_allocate_nodes(v_keyhash, capacity);
            _csetf_khash_count(v_keyhash, ZERO_INTEGER);
        }
        return v_keyhash;
    }

    public static final SubLObject iterate_keyhash_necessary(SubLObject key) {
        return makeBoolean(key != $keyhash_empty_key$.getGlobalValue());
    }

    public static final SubLObject is_occupied_keyhash_index_p(SubLObject v_keyhash, SubLObject index) {
        return makeBoolean(aref(khash_nodes(v_keyhash), index) != $keyhash_empty_key$.getGlobalValue());
    }

    public static final SubLObject is_empty_hash_stash_value_p(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject val = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            val = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(EQ, val, $list_alt33);
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    public static final SubLObject grow_keyhash(SubLObject v_keyhash) {
        {
            SubLObject old_nodes = khash_nodes(v_keyhash);
            SubLObject old_hash_stash = khash_hash_stash(v_keyhash);
            SubLObject capacity = keyhash_capacity_internal(v_keyhash);
            SubLObject new_capacity = add(capacity, capacity);
            keyhash_allocate_nodes(v_keyhash, new_capacity);
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject node_key = aref(old_nodes, i);
                        if (node_key != $keyhash_empty_key$.getGlobalValue()) {
                            {
                                SubLObject node_keycode = aref(old_hash_stash, i);
                                store_in_keyhash(node_key, node_keycode, v_keyhash);
                            }
                        }
                    }
                }
            }
        }
        return v_keyhash;
    }

    public static final SubLObject get_occupied_keyhash_index(SubLObject v_keyhash, SubLObject index) {
        return aref(khash_nodes(v_keyhash), index);
    }

    /**
     * Compute the sizes and the respective grow sizes, and return that as an
     * association list of size - grow-size tupplies.
     */
    @LispMethod(comment = "Compute the sizes and the respective grow sizes, and return that as an\r\nassociation list of size - grow-size tupplies.\nCompute the sizes and the respective grow sizes, and return that as an\nassociation list of size - grow-size tupplies.")
    public static final SubLObject compute_keyhash_grow_sizes(SubLObject lower_bound, SubLObject upper_bound) {
        {
            SubLObject start = ceiling(log(lower_bound, TWO_INTEGER), UNPROVIDED);
            SubLObject top = ceiling(log(upper_bound, TWO_INTEGER), UNPROVIDED);
            SubLObject iterations = subtract(top, start);
            SubLObject size = expt(TWO_INTEGER, start);
            SubLObject sizes = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(iterations); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject grow_size = integerDivide(multiply(size, FOUR_INTEGER), FIVE_INTEGER);
                    sizes = acons(size, grow_size, sizes);
                    size = add(size, size);
                }
            }
            return nreverse(sizes);
        }
    }

    /**
     * We assume that no hash-table can be bigger than the most-positive-fixnum.
     */
    @LispMethod(comment = "We assume that no hash-table can be bigger than the most-positive-fixnum.")
    public static final SubLObject compute_keyhash_capacity(SubLObject initial_size) {
        {
            SubLObject size = integerDivide(multiply(initial_size, FOUR_INTEGER), THREE_INTEGER);
            SubLObject final_size = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = $keyhash_grow_sizes$.getGlobalValue();
                    SubLObject tuple = NIL;
                    for (tuple = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , tuple = csome_list_var.first()) {
                        {
                            SubLObject datum = tuple;
                            SubLObject current = datum;
                            SubLObject table_size = NIL;
                            SubLObject grow_size = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt34);
                            table_size = current.first();
                            current = current.rest();
                            grow_size = current;
                            final_size = table_size;
                            doneP = numL(size, table_size);
                        }
                    }
                }
            }
            return final_size;
        }
    }

    public static final SubLObject clear_keyhash_node(SubLObject v_keyhash, SubLObject index) {
        set_aref(khash_nodes(v_keyhash), index, $keyhash_empty_key$.getGlobalValue());
        set_aref(khash_hash_stash(v_keyhash), index, $keyhash_empty_hash$.getGlobalValue());
        return v_keyhash;
    }

    public static final SubLSymbol $keyhash_empty_hash$ = makeSymbol("*KEYHASH-EMPTY-HASH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $keyhash_grow_sizes$ = makeSymbol("*KEYHASH-GROW-SIZES*");

    /**
     * The step size during collision resolution -- see Donald E. Knuth's discussion of the hash algorithm for details.
     */
    // defconstant
    @LispMethod(comment = "The step size during collision resolution -- see Donald E. Knuth\'s discussion of the hash algorithm for details.\ndefconstant")
    private static final SubLSymbol $keyhash_step$ = makeSymbol("*KEYHASH-STEP*");

    /**
     * The constant A -- see Donald E. Knuth's dicussion of the hash algorithm for details.
     */
    // defconstant
    @LispMethod(comment = "The constant A -- see Donald E. Knuth\'s dicussion of the hash algorithm for details.\ndefconstant")
    private static final SubLSymbol $keyhash_a$ = makeSymbol("*KEYHASH-A*");

    public static final class $iterate_keyhash_necessary$UnaryFunction extends UnaryFunction {
        public $iterate_keyhash_necessary$UnaryFunction() {
            super(extractFunctionNamed("ITERATE-KEYHASH-NECESSARY"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return iterate_keyhash_necessary(arg1);
        }
    }

    public static final SubLFile me = new keyhash();

 public static final String myName = "com.cyc.cycjava.cycl.keyhash";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_keyhash$ = makeSymbol("*DTP-KEYHASH*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_keyhash$ = makeSymbol("*CFASL-OPCODE-KEYHASH*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol KEYHASH = makeSymbol("KEYHASH");

    private static final SubLSymbol KEYHASH_P = makeSymbol("KEYHASH-P");

    private static final SubLInteger $int$137 = makeInteger(137);

    static private final SubLList $list3 = list(makeSymbol("NODES"), makeSymbol("TEST"), makeSymbol("COUNT"), makeSymbol("HASH-STASH"));

    static private final SubLList $list4 = list(makeKeyword("NODES"), $TEST, makeKeyword("COUNT"), makeKeyword("HASH-STASH"));

    static private final SubLList $list5 = list(makeSymbol("KHASH-NODES"), makeSymbol("KHASH-TEST"), makeSymbol("KHASH-COUNT"), makeSymbol("KHASH-HASH-STASH"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-KHASH-NODES"), makeSymbol("_CSETF-KHASH-TEST"), makeSymbol("_CSETF-KHASH-COUNT"), makeSymbol("_CSETF-KHASH-HASH-STASH"));

    private static final SubLSymbol PRINT_KEY_HASH = makeSymbol("PRINT-KEY-HASH");

    private static final SubLSymbol KEYHASH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KEYHASH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KEYHASH-P"));

    private static final SubLSymbol KHASH_NODES = makeSymbol("KHASH-NODES");

    private static final SubLSymbol _CSETF_KHASH_NODES = makeSymbol("_CSETF-KHASH-NODES");

    private static final SubLSymbol KHASH_TEST = makeSymbol("KHASH-TEST");

    private static final SubLSymbol _CSETF_KHASH_TEST = makeSymbol("_CSETF-KHASH-TEST");

    private static final SubLSymbol KHASH_COUNT = makeSymbol("KHASH-COUNT");

    private static final SubLSymbol _CSETF_KHASH_COUNT = makeSymbol("_CSETF-KHASH-COUNT");

    private static final SubLSymbol KHASH_HASH_STASH = makeSymbol("KHASH-HASH-STASH");

    private static final SubLSymbol _CSETF_KHASH_HASH_STASH = makeSymbol("_CSETF-KHASH-HASH-STASH");

    private static final SubLString $str22$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_KEYHASH = makeSymbol("MAKE-KEYHASH");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KEYHASH_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KEYHASH-METHOD");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str29$_ = makeString("/");

    private static final SubLSymbol $keyhash_empty_key$ = makeSymbol("*KEYHASH-EMPTY-KEY*");

    private static final SubLString $$$The_Empty_KEYHASH_Key = makeString("The Empty KEYHASH Key");

    static private final SubLList $list32 = list(makeSymbol("VAL"));

    static private final SubLList $list33 = list(makeSymbol("*KEYHASH-EMPTY-KEY*"));

    static private final SubLList $list34 = list(makeKeyword("VALUES"), NIL);

    private static final SubLSymbol LEGACY_KEYHASH_FORMAT_P = makeSymbol("LEGACY-KEYHASH-FORMAT-P");

    private static final SubLList $list38 = list(list(makeSymbol("KEY"), makeSymbol("KEYHASH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list39 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym42$THE_VALUE = makeUninternedSymbol("THE-VALUE");

    private static final SubLSymbol DO_KEYHASH_NODES = makeSymbol("DO-KEYHASH-NODES");

    static private final SubLList $list46 = list(list(makeSymbol("KEY"), makeSymbol("KEYHASH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_KEYHASH = makeSymbol("DO-KEYHASH");

    static private final SubLList $list48 = list(makeSymbol("DO-KEYHASH"), makeSymbol("DO-SET-CONTENTS"));

    private static final SubLSymbol KEYHASH_EMPTY_KEY = makeSymbol("KEYHASH-EMPTY-KEY");

    private static final SubLList $list50 = list(makeSymbol("DO-SET-CONTENTS"));

    private static final SubLSymbol DO_KEYHASH_VALID_KEY_P = makeSymbol("DO-KEYHASH-VALID-KEY-P");

    private static final SubLInteger $int$68 = makeInteger(68);

    private static final SubLSymbol CFASL_INPUT_KEYHASH = makeSymbol("CFASL-INPUT-KEYHASH");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_KEYHASH_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-KEYHASH-METHOD");

    public static final SubLObject keyhash_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_key_hash(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject keyhash_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_key_hash(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject keyhash_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.keyhash.$keyhash_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject keyhash_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.keyhash.$keyhash_native.class ? T : NIL;
    }

    public static final SubLObject khash_nodes_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KEYHASH_P);
        return v_object.getField2();
    }

    public static SubLObject khash_nodes(final SubLObject v_object) {
        assert NIL != keyhash_p(v_object) : "! keyhash.keyhash_p(v_object) " + "keyhash.keyhash_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject khash_test_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KEYHASH_P);
        return v_object.getField3();
    }

    public static SubLObject khash_test(final SubLObject v_object) {
        assert NIL != keyhash_p(v_object) : "! keyhash.keyhash_p(v_object) " + "keyhash.keyhash_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject khash_count_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KEYHASH_P);
        return v_object.getField4();
    }

    public static SubLObject khash_count(final SubLObject v_object) {
        assert NIL != keyhash_p(v_object) : "! keyhash.keyhash_p(v_object) " + "keyhash.keyhash_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject khash_hash_stash_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KEYHASH_P);
        return v_object.getField5();
    }

    public static SubLObject khash_hash_stash(final SubLObject v_object) {
        assert NIL != keyhash_p(v_object) : "! keyhash.keyhash_p(v_object) " + "keyhash.keyhash_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_khash_nodes_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KEYHASH_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_khash_nodes(final SubLObject v_object, final SubLObject value) {
        assert NIL != keyhash_p(v_object) : "! keyhash.keyhash_p(v_object) " + "keyhash.keyhash_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_khash_test_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KEYHASH_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_khash_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != keyhash_p(v_object) : "! keyhash.keyhash_p(v_object) " + "keyhash.keyhash_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_khash_count_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KEYHASH_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_khash_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != keyhash_p(v_object) : "! keyhash.keyhash_p(v_object) " + "keyhash.keyhash_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_khash_hash_stash_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KEYHASH_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_khash_hash_stash(final SubLObject v_object, final SubLObject value) {
        assert NIL != keyhash_p(v_object) : "! keyhash.keyhash_p(v_object) " + "keyhash.keyhash_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_keyhash_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.keyhash.$keyhash_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NODES)) {
                        _csetf_khash_nodes(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TEST)) {
                            _csetf_khash_test(v_new, current_value);
                        } else {
                            if (pcase_var.eql($COUNT)) {
                                _csetf_khash_count(v_new, current_value);
                            } else {
                                if (pcase_var.eql($HASH_STASH)) {
                                    _csetf_khash_hash_stash(v_new, current_value);
                                } else {
                                    Errors.error($str_alt21$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_keyhash(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.keyhash.$keyhash_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NODES)) {
                _csetf_khash_nodes(v_new, current_value);
            } else
                if (pcase_var.eql($TEST)) {
                    _csetf_khash_test(v_new, current_value);
                } else
                    if (pcase_var.eql($COUNT)) {
                        _csetf_khash_count(v_new, current_value);
                    } else
                        if (pcase_var.eql($HASH_STASH)) {
                            _csetf_khash_hash_stash(v_new, current_value);
                        } else {
                            Errors.error($str22$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_keyhash(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_KEYHASH, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NODES, khash_nodes(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST, khash_test(obj));
        funcall(visitor_fn, obj, $SLOT, $COUNT, khash_count(obj));
        funcall(visitor_fn, obj, $SLOT, $HASH_STASH, khash_hash_stash(obj));
        funcall(visitor_fn, obj, $END, MAKE_KEYHASH, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_keyhash_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_keyhash(obj, visitor_fn);
    }

    public static final SubLObject print_key_hash_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt22$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    princ(keyhash_test(v_object), stream);
                    write_string($str_alt24$_, stream, UNPROVIDED, UNPROVIDED);
                    princ(khash_count(v_object), stream);
                    write_string($str_alt25$_, stream, UNPROVIDED, UNPROVIDED);
                    princ(keyhash_capacity_internal(v_object), stream);
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_key_hash(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            princ(keyhash_test(v_object), stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            princ(keyhash_count(v_object), stream);
            write_string($str29$_, stream, UNPROVIDED, UNPROVIDED);
            princ(keyhash_capacity(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject is_empty_keyhash_key_p_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject val = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            val = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(EQ, val, $list_alt32);
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    public static SubLObject is_empty_keyhash_key_p(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject val = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        val = current.first();
        current = current.rest();
        if (NIL == current) {
            return listS(EQ, val, $list33);
        }
        cdestructuring_bind_error(datum, $list32);
        return NIL;
    }

    public static SubLObject set_keyhash_nodes(final SubLObject v_keyhash, final SubLObject nodes) {
        _csetf_khash_nodes(v_keyhash, nodes);
        return v_keyhash;
    }

    public static SubLObject keyhash_nodes(final SubLObject v_keyhash) {
        return khash_nodes(v_keyhash);
    }

    public static SubLObject allocate_keyhash_nodes(final SubLObject size, final SubLObject test) {
        return make_hash_table(size, test, $list34);
    }

    public static final SubLObject clear_all_keyhash_nodes_alt(SubLObject v_keyhash) {
        {
            SubLObject capacity = keyhash_capacity_internal(v_keyhash);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                clear_keyhash_node(v_keyhash, i);
            }
        }
        return v_keyhash;
    }

    public static SubLObject clear_all_keyhash_nodes(final SubLObject v_keyhash) {
        clrhash(keyhash_nodes(v_keyhash));
        return v_keyhash;
    }

    public static SubLObject keyhash_test_internal(final SubLObject v_keyhash) {
        return hash_table_test(keyhash_nodes(v_keyhash));
    }

    public static SubLObject keyhash_count_internal(final SubLObject v_keyhash) {
        return hash_table_count(keyhash_nodes(v_keyhash));
    }

    public static final SubLObject keyhash_capacity_internal_alt(SubLObject v_keyhash) {
        return length(khash_nodes(v_keyhash));
    }

    public static SubLObject keyhash_capacity_internal(final SubLObject v_keyhash) {
        return hash_table_size(keyhash_nodes(v_keyhash));
    }

    public static SubLObject keyhash_matching_key_internal(final SubLObject key, final SubLObject v_keyhash) {
        return gethash_without_values(key, keyhash_nodes(v_keyhash), UNPROVIDED);
    }

    public static SubLObject keyhash_set_key(final SubLObject key, final SubLObject v_keyhash) {
        sethash(key, keyhash_nodes(v_keyhash), key);
        return key;
    }

    public static SubLObject keyhash_remove_key(final SubLObject key, final SubLObject v_keyhash) {
        return remhash(key, keyhash_nodes(v_keyhash));
    }

    public static SubLObject new_keyhash_iterator_internal(final SubLObject v_keyhash) {
        return iteration.new_hash_table_keys_iterator(keyhash_nodes(v_keyhash));
    }

    public static SubLObject keyhash_random_key_internal(final SubLObject v_keyhash) {
        return hash_table_utilities.hash_table_random_key(keyhash_nodes(v_keyhash));
    }

    public static SubLObject legacy_keyhash_test_function(final SubLObject v_keyhash) {
        return khash_test(v_keyhash);
    }

    public static SubLObject clear_legacy_keyhash_data(final SubLObject v_keyhash) {
        _csetf_khash_test(v_keyhash, NIL);
        _csetf_khash_count(v_keyhash, NIL);
        _csetf_khash_hash_stash(v_keyhash, NIL);
        return v_keyhash;
    }

    public static SubLObject legacy_keyhash_format_p(final SubLObject v_keyhash) {
        return vectorp(keyhash_nodes(v_keyhash));
    }

    public static SubLObject new_keyhash_format_p(final SubLObject v_keyhash) {
        return hash_table_p(keyhash_nodes(v_keyhash));
    }

    public static SubLObject maybe_swizzle_old_vector_to_hash(final SubLObject v_keyhash) {
        if (NIL == new_keyhash_format_p(v_keyhash)) {
            SubLTrampolineFile.enforceType(v_keyhash, LEGACY_KEYHASH_FORMAT_P);
            final SubLObject old_nodes = keyhash_nodes(v_keyhash);
            final SubLObject size = length(old_nodes);
            final SubLObject test = legacy_keyhash_test_function(v_keyhash);
            clear_legacy_keyhash_data(v_keyhash);
            set_keyhash_nodes(v_keyhash, allocate_keyhash_nodes(size, test));
            final SubLObject vector_var = old_nodes;
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject key;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                key = aref(vector_var, element_num);
                if (!key.eql($keyhash_empty_key$.getGlobalValue())) {
                    setkeyhash(key, v_keyhash);
                }
            }
        }
        return v_keyhash;
    }

    /**
     * Allocate a new keyhash with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return keyhash
     */
    @LispMethod(comment = "Allocate a new keyhash with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return keyhash\nAllocate a new keyhash with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static final SubLObject new_keyhash_alt(SubLObject size, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLTrampolineFile.checkType(size, FIXNUMP);
        SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
        if (test.isFunction()) {
            test = hash_test_to_symbol(test);
        }
        {
            SubLObject v_keyhash = make_keyhash(UNPROVIDED);
            keyhash_allocate(v_keyhash, size);
            _csetf_khash_test(v_keyhash, test);
            return v_keyhash;
        }
    }

    @LispMethod(comment = "Allocate a new keyhash with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return keyhash\nAllocate a new keyhash with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static SubLObject new_keyhash(final SubLObject size, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != fixnump(size) : "! fixnump(size) " + ("Types.fixnump(size) " + "CommonSymbols.NIL != Types.fixnump(size) ") + size;
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
        if (test.isFunction()) {
            test = hash_table_utilities.hash_test_to_symbol(test);
        }
        final SubLObject v_keyhash = make_keyhash(UNPROVIDED);
        set_keyhash_nodes(v_keyhash, allocate_keyhash_nodes(size, test));
        return v_keyhash;
    }/**
     * Allocate a new keyhash with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return keyhash
     */


    /**
     * Reset KEYHASH to the status of being just allocated.
     *
     * @return keyhash
     */
    @LispMethod(comment = "Reset KEYHASH to the status of being just allocated.\r\n\r\n@return keyhash")
    public static final SubLObject clrkeyhash_alt(SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        clear_all_keyhash_nodes(v_keyhash);
        _csetf_khash_count(v_keyhash, ZERO_INTEGER);
        return v_keyhash;
    }

    @LispMethod(comment = "Reset KEYHASH to the status of being just allocated.\r\n\r\n@return keyhash")
    public static SubLObject clrkeyhash(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        clear_all_keyhash_nodes(v_keyhash);
        return v_keyhash;
    }/**
     * Reset KEYHASH to the status of being just allocated.
     *
     * @return keyhash
     */


    /**
     * Return the equality test used in KEYHASH.
     *
     * @return valid-hash-test-p.
     */
    @LispMethod(comment = "Return the equality test used in KEYHASH.\r\n\r\n@return valid-hash-test-p.")
    public static final SubLObject keyhash_test_alt(SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        {
            SubLObject test = khash_test(v_keyhash);
            if (test.isFunction()) {
                _csetf_khash_test(v_keyhash, hash_test_to_symbol(test));
                return keyhash_test(v_keyhash);
            }
            return test;
        }
    }

    @LispMethod(comment = "Return the equality test used in KEYHASH.\r\n\r\n@return valid-hash-test-p.")
    public static SubLObject keyhash_test(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_test_internal(v_keyhash);
    }/**
     * Return the equality test used in KEYHASH.
     *
     * @return valid-hash-test-p.
     */


    /**
     * Return the number of items currently stored in KEYHASH.
     *
     * @return integerp.
     */
    @LispMethod(comment = "Return the number of items currently stored in KEYHASH.\r\n\r\n@return integerp.")
    public static final SubLObject keyhash_count_alt(SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        return khash_count(v_keyhash);
    }

    @LispMethod(comment = "Return the number of items currently stored in KEYHASH.\r\n\r\n@return integerp.")
    public static SubLObject keyhash_count(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_count_internal(v_keyhash);
    }/**
     * Return the number of items currently stored in KEYHASH.
     *
     * @return integerp.
     */


    /**
     * Return the current capacity of KEYHASH.
     *
     * @return integerp.
     */
    @LispMethod(comment = "Return the current capacity of KEYHASH.\r\n\r\n@return integerp.")
    public static final SubLObject keyhash_capacity_alt(SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        return keyhash_capacity_internal(v_keyhash);
    }

    @LispMethod(comment = "Return the current capacity of KEYHASH.\r\n\r\n@return integerp.")
    public static SubLObject keyhash_capacity(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        return keyhash_capacity_internal(v_keyhash);
    }/**
     * Return the current capacity of KEYHASH.
     *
     * @return integerp.
     */


    /**
     * Return T iff KEY is currently stored in KEYHASH.
     *
     * @return boolean.
     */
    @LispMethod(comment = "Return T iff KEY is currently stored in KEYHASH.\r\n\r\n@return boolean.")
    public static final SubLObject getkeyhash_alt(SubLObject key, SubLObject v_keyhash) {
        {
            SubLObject matching_key = keyhash_matching_key(key, v_keyhash);
            return list_utilities.sublisp_boolean(matching_key);
        }
    }

    @LispMethod(comment = "Return T iff KEY is currently stored in KEYHASH.\r\n\r\n@return boolean.")
    public static SubLObject getkeyhash(final SubLObject key, final SubLObject v_keyhash) {
        final SubLObject matching_key = keyhash_matching_key(key, v_keyhash);
        return list_utilities.sublisp_boolean(matching_key);
    }/**
     * Return T iff KEY is currently stored in KEYHASH.
     *
     * @return boolean.
     */


    /**
     * If there is a key in KEYHASH that matches KEY, then return it.
     * Otherwise return NIL.
     */
    @LispMethod(comment = "If there is a key in KEYHASH that matches KEY, then return it.\r\nOtherwise return NIL.\nIf there is a key in KEYHASH that matches KEY, then return it.\nOtherwise return NIL.")
    public static final SubLObject keyhash_matching_key_alt(SubLObject key, SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        {
            SubLObject position = keyhash_find_key(key, v_keyhash);
            if (position.isFixnum()) {
                {
                    SubLObject node_key = aref(khash_nodes(v_keyhash), position);
                    if (node_key == $keyhash_empty_key$.getGlobalValue()) {
                        return NIL;
                    } else {
                        return node_key;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "If there is a key in KEYHASH that matches KEY, then return it.\r\nOtherwise return NIL.\nIf there is a key in KEYHASH that matches KEY, then return it.\nOtherwise return NIL.")
    public static SubLObject keyhash_matching_key(final SubLObject key, final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_matching_key_internal(key, v_keyhash);
    }/**
     * If there is a key in KEYHASH that matches KEY, then return it.
     * Otherwise return NIL.
     */


    /**
     * Note that KEY is stored in KEYHASH.
     *
     * @return KEY.
     */
    @LispMethod(comment = "Note that KEY is stored in KEYHASH.\r\n\r\n@return KEY.")
    public static final SubLObject setkeyhash_alt(SubLObject key, SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        {
            SubLObject keycode = Sxhash.sxhash(key);
            SubLObject position = keyhash_lookup_key(key, keycode, v_keyhash);
            if (NIL != keyhash_cannot_find_empty_nodeP(position)) {
                grow_keyhash(v_keyhash);
                position = keyhash_lookup_key(key, keycode, v_keyhash);
                if (NIL != keyhash_cannot_find_empty_nodeP(position)) {
                    Errors.error($str_alt65$Cannot_grow_keyhash__A_any_more_, v_keyhash);
                }
            }
            if (aref(khash_nodes(v_keyhash), position) == $keyhash_empty_key$.getGlobalValue()) {
                _csetf_khash_count(v_keyhash, add(khash_count(v_keyhash), ONE_INTEGER));
                set_aref(khash_nodes(v_keyhash), position, key);
                set_aref(khash_hash_stash(v_keyhash), position, keycode);
                potentially_grow_keyhash(v_keyhash);
            }
        }
        return key;
    }

    @LispMethod(comment = "Note that KEY is stored in KEYHASH.\r\n\r\n@return KEY.")
    public static SubLObject setkeyhash(final SubLObject key, final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_set_key(key, v_keyhash);
    }/**
     * Note that KEY is stored in KEYHASH.
     *
     * @return KEY.
     */


    /**
     * Remove KEY from KEYHASH.  Return T iff KEY was stored in KEYHASH.
     *
     * @return boolean.
     */
    @LispMethod(comment = "Remove KEY from KEYHASH.  Return T iff KEY was stored in KEYHASH.\r\n\r\n@return boolean.")
    public static final SubLObject remkeyhash_alt(SubLObject key, SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        {
            SubLObject keycode = Sxhash.sxhash(key);
            SubLObject position = keyhash_lookup_key(key, keycode, v_keyhash);
            if (position.isFixnum()) {
                if (aref(khash_nodes(v_keyhash), position) != $keyhash_empty_key$.getGlobalValue()) {
                    _csetf_khash_count(v_keyhash, subtract(khash_count(v_keyhash), ONE_INTEGER));
                    clear_keyhash_node(v_keyhash, position);
                    keyhash_fill_gap(position, v_keyhash);
                    return T;
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Remove KEY from KEYHASH.  Return T iff KEY was stored in KEYHASH.\r\n\r\n@return boolean.")
    public static SubLObject remkeyhash(final SubLObject key, final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_remove_key(key, v_keyhash);
    }/**
     * Remove KEY from KEYHASH.  Return T iff KEY was stored in KEYHASH.
     *
     * @return boolean.
     */


    /**
     * Returns an iterator for the keys of KEYHASH.
     *
     * @return iterator-p
     */
    @LispMethod(comment = "Returns an iterator for the keys of KEYHASH.\r\n\r\n@return iterator-p")
    public static final SubLObject new_keyhash_iterator_alt(SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        return new_filter_iterator(new_vector_iterator(khash_nodes(v_keyhash)), ITERATE_KEYHASH_NECESSARY, UNPROVIDED);
    }

    @LispMethod(comment = "Returns an iterator for the keys of KEYHASH.\r\n\r\n@return iterator-p")
    public static SubLObject new_keyhash_iterator(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return new_keyhash_iterator_internal(v_keyhash);
    }/**
     * Returns an iterator for the keys of KEYHASH.
     *
     * @return iterator-p
     */


    public static SubLObject keyhash_iterator_next(final SubLObject it) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject element = iteration.iteration_next(it);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return NIL != validP ? element : $keyhash_empty_key$.getGlobalValue();
    }

    /**
     * Iterate over KEYHASH, binding KEY to each key indexed.
     * BODY is executed once within the scope of each binding of KEY.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over KEYHASH, binding KEY to each key indexed.\r\nBODY is executed once within the scope of each binding of KEY.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over KEYHASH, binding KEY to each key indexed.\nBODY is executed once within the scope of each binding of KEY.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_keyhash_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt67);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject v_keyhash = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt67);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt67);
                    v_keyhash = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt67);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt67);
                            if (NIL == member(current_3, $list_alt68, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt67);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_VECTOR, list(key, list(DO_KEYHASH_NODES, v_keyhash), $DONE, done), listS(PWHEN, list(DO_KEYHASH_VALID_KEY_P, key), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Iterate over KEYHASH, binding KEY to each key indexed.\r\nBODY is executed once within the scope of each binding of KEY.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over KEYHASH, binding KEY to each key indexed.\nBODY is executed once within the scope of each binding of KEY.\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_keyhash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject v_keyhash = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        v_keyhash = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list38);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list38);
            if (NIL == member(current_$1, $list39, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list38);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject the_value = $sym42$THE_VALUE;
        return listS(DO_HASH_TABLE, list(key, the_value, list(DO_KEYHASH_NODES, v_keyhash), $DONE, done), list(IGNORE, the_value), append(body, NIL));
    }/**
     * Iterate over KEYHASH, binding KEY to each key indexed.
     * BODY is executed once within the scope of each binding of KEY.
     * Iteration halts as soon as DONE becomes non-nil.
     */


    /**
     * Similar to CSOME, except the iteration is over KEYHASH
     */
    @LispMethod(comment = "Similar to CSOME, except the iteration is over KEYHASH")
    public static final SubLObject some_keyhash_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt74);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject v_keyhash = NIL;
                    SubLObject done = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    v_keyhash = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    done = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_KEYHASH, list(key, v_keyhash, $DONE, done), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt74);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Similar to CSOME, except the iteration is over KEYHASH")
    public static SubLObject some_keyhash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject v_keyhash = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list46);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        v_keyhash = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        done = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_KEYHASH, list(key, v_keyhash, $DONE, done), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list46);
        return NIL;
    }/**
     * Similar to CSOME, except the iteration is over KEYHASH
     */


    public static final SubLObject do_keyhash_nodes_alt(SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        return khash_nodes(v_keyhash);
    }

    public static SubLObject do_keyhash_nodes(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_nodes(v_keyhash);
    }

    public static SubLObject keyhash_empty_key() {
        return $keyhash_empty_key$.getGlobalValue();
    }

    public static final SubLObject do_keyhash_valid_key_p_alt(SubLObject key) {
        return makeBoolean(key != $keyhash_empty_key$.getGlobalValue());
    }

    public static SubLObject do_keyhash_valid_key_p(final SubLObject key) {
        return keyhash_valid_key_p(key);
    }

    public static SubLObject keyhash_valid_key_p(final SubLObject key) {
        return makeBoolean(!key.eql($keyhash_empty_key$.getGlobalValue()));
    }

    /**
     * Map across KEYHASH, calling FUNCTION on each entry.
     * FUNCTION should have a formal parameter list of (key).
     *
     * @return NIL
     */
    @LispMethod(comment = "Map across KEYHASH, calling FUNCTION on each entry.\r\nFUNCTION should have a formal parameter list of (key).\r\n\r\n@return NIL\nMap across KEYHASH, calling FUNCTION on each entry.\nFUNCTION should have a formal parameter list of (key).")
    public static final SubLObject mapkeyhash_alt(SubLObject function, SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        {
            SubLObject vector_var = do_keyhash_nodes(v_keyhash);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject node_key = aref(vector_var, element_num);
                    if (NIL != do_keyhash_valid_key_p(node_key)) {
                        funcall(function, node_key);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Map across KEYHASH, calling FUNCTION on each entry.\r\nFUNCTION should have a formal parameter list of (key).\r\n\r\n@return NIL\nMap across KEYHASH, calling FUNCTION on each entry.\nFUNCTION should have a formal parameter list of (key).")
    public static SubLObject mapkeyhash(final SubLObject function, final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        final SubLObject cdohash_table = do_keyhash_nodes(v_keyhash);
        SubLObject node_key = NIL;
        SubLObject the_value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                node_key = getEntryKey(cdohash_entry);
                the_value = getEntryValue(cdohash_entry);
                funcall(function, node_key);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }/**
     * Map across KEYHASH, calling FUNCTION on each entry.
     * FUNCTION should have a formal parameter list of (key).
     *
     * @return NIL
     */


    public static final SubLObject cfasl_output_object_keyhash_method_alt(SubLObject v_object, SubLObject stream) {
        return cfasl_output_keyhash(v_object, stream);
    }

    public static SubLObject cfasl_output_object_keyhash_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_keyhash(v_object, stream);
    }

    public static final SubLObject cfasl_output_keyhash_alt(SubLObject v_object, SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_keyhash$.getGlobalValue(), stream);
        {
            SubLObject test = keyhash_test(v_object);
            SubLObject size = keyhash_count(v_object);
            cfasl_output(test, stream);
            cfasl_output(size, stream);
            {
                SubLObject vector_var = do_keyhash_nodes(v_object);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject key = aref(vector_var, element_num);
                        if (NIL != do_keyhash_valid_key_p(key)) {
                            cfasl_output(key, stream);
                        }
                    }
                }
            }
        }
        return v_object;
    }

    public static SubLObject cfasl_output_keyhash(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_keyhash$.getGlobalValue(), stream);
        final SubLObject test = hash_table_utilities.hash_test_to_symbol(keyhash_test(v_object));
        final SubLObject size = keyhash_count(v_object);
        cfasl_output(test, stream);
        cfasl_output(size, stream);
        final SubLObject cdohash_table = do_keyhash_nodes(v_object);
        SubLObject key = NIL;
        SubLObject the_value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                the_value = getEntryValue(cdohash_entry);
                cfasl_output(key, stream);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return v_object;
    }

    public static final SubLObject cfasl_input_keyhash_alt(SubLObject stream) {
        {
            SubLObject type = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject test = NIL;
            SubLObject v_keyhash = NIL;
            SubLObject pcase_var = type;
            if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
                test = symbol_function(type);
            }
            v_keyhash = new_keyhash(size, test);
            {
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; index.numL(size); index = add(index, ONE_INTEGER)) {
                    {
                        SubLObject key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                        setkeyhash(key, v_keyhash);
                    }
                }
            }
            return v_keyhash;
        }
    }

    public static SubLObject cfasl_input_keyhash(final SubLObject stream) {
        final SubLObject type = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject test = NIL;
        SubLObject v_keyhash = NIL;
        final SubLObject pcase_var = type;
        if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
            test = symbol_function(type);
        }
        v_keyhash = new_keyhash(size, test);
        SubLObject index;
        SubLObject key;
        for (index = NIL, index = ZERO_INTEGER; index.numL(size); index = add(index, ONE_INTEGER)) {
            key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            setkeyhash(key, v_keyhash);
        }
        return v_keyhash;
    }

    /**
     * Return a copy of KEYHASH.
     *
     * @return keyhash-p
     */
    @LispMethod(comment = "Return a copy of KEYHASH.\r\n\r\n@return keyhash-p")
    public static final SubLObject copy_keyhash_alt(SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        {
            SubLObject size = keyhash_count(v_keyhash);
            SubLObject test = keyhash_test(v_keyhash);
            SubLObject new_keyhash = new_keyhash(size, test);
            SubLObject vector_var = do_keyhash_nodes(v_keyhash);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject key = aref(vector_var, element_num);
                    if (NIL != do_keyhash_valid_key_p(key)) {
                        setkeyhash(key, new_keyhash);
                    }
                }
            }
            return new_keyhash;
        }
    }

    @LispMethod(comment = "Return a copy of KEYHASH.\r\n\r\n@return keyhash-p")
    public static SubLObject copy_keyhash(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        final SubLObject size = keyhash_count(v_keyhash);
        final SubLObject test = keyhash_test(v_keyhash);
        final SubLObject new_keyhash = new_keyhash(size, test);
        final SubLObject cdohash_table = do_keyhash_nodes(v_keyhash);
        SubLObject key = NIL;
        SubLObject the_value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                the_value = getEntryValue(cdohash_entry);
                setkeyhash(key, new_keyhash);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return new_keyhash;
    }/**
     * Return a copy of KEYHASH.
     *
     * @return keyhash-p
     */


    /**
     * Return a randomly chosen key in KEYHASH, if any.
     */
    @LispMethod(comment = "Return a randomly chosen key in KEYHASH, if any.")
    public static final SubLObject keyhash_random_key_alt(SubLObject v_keyhash) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        {
            SubLObject size = keyhash_count(v_keyhash);
            SubLObject capacity = keyhash_capacity(v_keyhash);
            if (size.isZero()) {
                return NIL;
            } else {
                if (number_utilities.f_2X(size).numGE(capacity)) {
                    while (true) {
                        {
                            SubLObject node_key = aref(khash_nodes(v_keyhash), random.random(capacity));
                            if (node_key != $keyhash_empty_key$.getGlobalValue()) {
                                return node_key;
                            }
                        }
                    } 
                } else {
                    {
                        SubLObject index = random.random(size);
                        SubLObject vector_var = do_keyhash_nodes(v_keyhash);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject node_key = aref(vector_var, element_num);
                                if (NIL != do_keyhash_valid_key_p(node_key)) {
                                    if (index.isZero()) {
                                        return node_key;
                                    }
                                    index = subtract(index, ONE_INTEGER);
                                }
                            }
                        }
                        return NIL;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Return a randomly chosen key in KEYHASH, if any.")
    public static SubLObject keyhash_random_key(final SubLObject v_keyhash) {
        assert NIL != keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        maybe_swizzle_old_vector_to_hash(v_keyhash);
        return keyhash_random_key_internal(v_keyhash);
    }/**
     * Return a randomly chosen key in KEYHASH, if any.
     */


    public static final SubLObject declare_keyhash_file_alt() {
        declareFunction("keyhash_print_function_trampoline", "KEYHASH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("keyhash_p", "KEYHASH-P", 1, 0, false);
        new com.cyc.cycjava.cycl.keyhash.$keyhash_p$UnaryFunction();
        declareFunction("khash_nodes", "KHASH-NODES", 1, 0, false);
        declareFunction("khash_test", "KHASH-TEST", 1, 0, false);
        declareFunction("khash_count", "KHASH-COUNT", 1, 0, false);
        declareFunction("khash_hash_stash", "KHASH-HASH-STASH", 1, 0, false);
        declareFunction("_csetf_khash_nodes", "_CSETF-KHASH-NODES", 2, 0, false);
        declareFunction("_csetf_khash_test", "_CSETF-KHASH-TEST", 2, 0, false);
        declareFunction("_csetf_khash_count", "_CSETF-KHASH-COUNT", 2, 0, false);
        declareFunction("_csetf_khash_hash_stash", "_CSETF-KHASH-HASH-STASH", 2, 0, false);
        declareFunction("make_keyhash", "MAKE-KEYHASH", 0, 1, false);
        declareFunction("print_key_hash", "PRINT-KEY-HASH", 3, 0, false);
        declareFunction("keyhash_capacity_internal", "KEYHASH-CAPACITY-INTERNAL", 1, 0, false);
        declareMacro("is_empty_keyhash_key_p", "IS-EMPTY-KEYHASH-KEY-P");
        declareMacro("is_empty_hash_stash_value_p", "IS-EMPTY-HASH-STASH-VALUE-P");
        declareFunction("compute_keyhash_grow_sizes", "COMPUTE-KEYHASH-GROW-SIZES", 2, 0, false);
        declareFunction("compute_keyhash_capacity", "COMPUTE-KEYHASH-CAPACITY", 1, 0, false);
        declareFunction("keyhash_table_size_limit_tuple", "KEYHASH-TABLE-SIZE-LIMIT-TUPLE", 0, 0, false);
        declareFunction("keyhash_allocate", "KEYHASH-ALLOCATE", 2, 0, false);
        declareFunction("keyhash_allocate_nodes", "KEYHASH-ALLOCATE-NODES", 2, 0, false);
        declareFunction("grow_keyhash", "GROW-KEYHASH", 1, 0, false);
        declareFunction("potentially_grow_keyhash", "POTENTIALLY-GROW-KEYHASH", 1, 0, false);
        declareFunction("clear_keyhash_node", "CLEAR-KEYHASH-NODE", 2, 0, false);
        declareFunction("clear_all_keyhash_nodes", "CLEAR-ALL-KEYHASH-NODES", 1, 0, false);
        declareFunction("keyhash_compute_hash", "KEYHASH-COMPUTE-HASH", 2, 0, false);
        declareFunction("scale_keycode_to_keyhash", "SCALE-KEYCODE-TO-KEYHASH", 2, 0, false);
        declareMacro("set_to_next_probe_index", "SET-TO-NEXT-PROBE-INDEX");
        declareMacro("keyhash_lookup_loop", "KEYHASH-LOOKUP-LOOP");
        declareFunction("keyhash_lookup_key_eq", "KEYHASH-LOOKUP-KEY-EQ", 7, 0, false);
        declareFunction("keyhash_lookup_key_eql", "KEYHASH-LOOKUP-KEY-EQL", 7, 0, false);
        declareFunction("keyhash_lookup_key_equal", "KEYHASH-LOOKUP-KEY-EQUAL", 7, 0, false);
        declareFunction("keyhash_lookup_key_equalp", "KEYHASH-LOOKUP-KEY-EQUALP", 7, 0, false);
        declareFunction("keyhash_lookup_key", "KEYHASH-LOOKUP-KEY", 3, 0, false);
        declareFunction("keyhash_find_key", "KEYHASH-FIND-KEY", 2, 0, false);
        declareFunction("keyhash_cannot_find_empty_nodeP", "KEYHASH-CANNOT-FIND-EMPTY-NODE?", 1, 0, false);
        declareFunction("store_in_keyhash", "STORE-IN-KEYHASH", 3, 0, false);
        declareFunction("keyhash_fill_gap", "KEYHASH-FILL-GAP", 2, 0, false);
        declareFunction("new_keyhash", "NEW-KEYHASH", 1, 1, false);
        declareFunction("clrkeyhash", "CLRKEYHASH", 1, 0, false);
        declareFunction("keyhash_test", "KEYHASH-TEST", 1, 0, false);
        declareFunction("keyhash_count", "KEYHASH-COUNT", 1, 0, false);
        declareFunction("keyhash_capacity", "KEYHASH-CAPACITY", 1, 0, false);
        declareFunction("getkeyhash", "GETKEYHASH", 2, 0, false);
        declareFunction("keyhash_matching_key", "KEYHASH-MATCHING-KEY", 2, 0, false);
        declareFunction("setkeyhash", "SETKEYHASH", 2, 0, false);
        declareFunction("remkeyhash", "REMKEYHASH", 2, 0, false);
        declareFunction("new_keyhash_iterator", "NEW-KEYHASH-ITERATOR", 1, 0, false);
        declareFunction("iterate_keyhash_necessary", "ITERATE-KEYHASH-NECESSARY", 1, 0, false);
        new com.cyc.cycjava.cycl.keyhash.$iterate_keyhash_necessary$UnaryFunction();
        declareMacro("do_keyhash", "DO-KEYHASH");
        declareMacro("some_keyhash", "SOME-KEYHASH");
        declareFunction("do_keyhash_nodes", "DO-KEYHASH-NODES", 1, 0, false);
        declareFunction("do_keyhash_valid_key_p", "DO-KEYHASH-VALID-KEY-P", 1, 0, false);
        declareFunction("is_occupied_keyhash_index_p", "IS-OCCUPIED-KEYHASH-INDEX-P", 2, 0, false);
        declareFunction("get_occupied_keyhash_index", "GET-OCCUPIED-KEYHASH-INDEX", 2, 0, false);
        declareFunction("mapkeyhash", "MAPKEYHASH", 2, 0, false);
        declareFunction("cfasl_output_object_keyhash_method", "CFASL-OUTPUT-OBJECT-KEYHASH-METHOD", 2, 0, false);
        declareFunction("cfasl_output_keyhash", "CFASL-OUTPUT-KEYHASH", 2, 0, false);
        declareFunction("cfasl_input_keyhash", "CFASL-INPUT-KEYHASH", 1, 0, false);
        declareFunction("copy_keyhash", "COPY-KEYHASH", 1, 0, false);
        declareFunction("keyhash_random_key", "KEYHASH-RANDOM-KEY", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_keyhash_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("keyhash_print_function_trampoline", "KEYHASH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("keyhash_p", "KEYHASH-P", 1, 0, false);
            new keyhash.$keyhash_p$UnaryFunction();
            declareFunction("khash_nodes", "KHASH-NODES", 1, 0, false);
            declareFunction("khash_test", "KHASH-TEST", 1, 0, false);
            declareFunction("khash_count", "KHASH-COUNT", 1, 0, false);
            declareFunction("khash_hash_stash", "KHASH-HASH-STASH", 1, 0, false);
            declareFunction("_csetf_khash_nodes", "_CSETF-KHASH-NODES", 2, 0, false);
            declareFunction("_csetf_khash_test", "_CSETF-KHASH-TEST", 2, 0, false);
            declareFunction("_csetf_khash_count", "_CSETF-KHASH-COUNT", 2, 0, false);
            declareFunction("_csetf_khash_hash_stash", "_CSETF-KHASH-HASH-STASH", 2, 0, false);
            declareFunction("make_keyhash", "MAKE-KEYHASH", 0, 1, false);
            declareFunction("visit_defstruct_keyhash", "VISIT-DEFSTRUCT-KEYHASH", 2, 0, false);
            declareFunction("visit_defstruct_object_keyhash_method", "VISIT-DEFSTRUCT-OBJECT-KEYHASH-METHOD", 2, 0, false);
            declareFunction("print_key_hash", "PRINT-KEY-HASH", 3, 0, false);
            declareMacro("is_empty_keyhash_key_p", "IS-EMPTY-KEYHASH-KEY-P");
            declareFunction("set_keyhash_nodes", "SET-KEYHASH-NODES", 2, 0, false);
            declareFunction("keyhash_nodes", "KEYHASH-NODES", 1, 0, false);
            declareFunction("allocate_keyhash_nodes", "ALLOCATE-KEYHASH-NODES", 2, 0, false);
            declareFunction("clear_all_keyhash_nodes", "CLEAR-ALL-KEYHASH-NODES", 1, 0, false);
            declareFunction("keyhash_test_internal", "KEYHASH-TEST-INTERNAL", 1, 0, false);
            declareFunction("keyhash_count_internal", "KEYHASH-COUNT-INTERNAL", 1, 0, false);
            declareFunction("keyhash_capacity_internal", "KEYHASH-CAPACITY-INTERNAL", 1, 0, false);
            declareFunction("keyhash_matching_key_internal", "KEYHASH-MATCHING-KEY-INTERNAL", 2, 0, false);
            declareFunction("keyhash_set_key", "KEYHASH-SET-KEY", 2, 0, false);
            declareFunction("keyhash_remove_key", "KEYHASH-REMOVE-KEY", 2, 0, false);
            declareFunction("new_keyhash_iterator_internal", "NEW-KEYHASH-ITERATOR-INTERNAL", 1, 0, false);
            declareFunction("keyhash_random_key_internal", "KEYHASH-RANDOM-KEY-INTERNAL", 1, 0, false);
            declareFunction("legacy_keyhash_test_function", "LEGACY-KEYHASH-TEST-FUNCTION", 1, 0, false);
            declareFunction("clear_legacy_keyhash_data", "CLEAR-LEGACY-KEYHASH-DATA", 1, 0, false);
            declareFunction("legacy_keyhash_format_p", "LEGACY-KEYHASH-FORMAT-P", 1, 0, false);
            declareFunction("new_keyhash_format_p", "NEW-KEYHASH-FORMAT-P", 1, 0, false);
            declareFunction("maybe_swizzle_old_vector_to_hash", "MAYBE-SWIZZLE-OLD-VECTOR-TO-HASH", 1, 0, false);
            declareFunction("new_keyhash", "NEW-KEYHASH", 1, 1, false);
            declareFunction("clrkeyhash", "CLRKEYHASH", 1, 0, false);
            declareFunction("keyhash_test", "KEYHASH-TEST", 1, 0, false);
            declareFunction("keyhash_count", "KEYHASH-COUNT", 1, 0, false);
            declareFunction("keyhash_capacity", "KEYHASH-CAPACITY", 1, 0, false);
            declareFunction("getkeyhash", "GETKEYHASH", 2, 0, false);
            declareFunction("keyhash_matching_key", "KEYHASH-MATCHING-KEY", 2, 0, false);
            declareFunction("setkeyhash", "SETKEYHASH", 2, 0, false);
            declareFunction("remkeyhash", "REMKEYHASH", 2, 0, false);
            declareFunction("new_keyhash_iterator", "NEW-KEYHASH-ITERATOR", 1, 0, false);
            declareFunction("keyhash_iterator_next", "KEYHASH-ITERATOR-NEXT", 1, 0, false);
            declareMacro("do_keyhash", "DO-KEYHASH");
            declareMacro("some_keyhash", "SOME-KEYHASH");
            declareFunction("do_keyhash_nodes", "DO-KEYHASH-NODES", 1, 0, false);
            declareFunction("keyhash_empty_key", "KEYHASH-EMPTY-KEY", 0, 0, false);
            declareFunction("do_keyhash_valid_key_p", "DO-KEYHASH-VALID-KEY-P", 1, 0, false);
            declareFunction("keyhash_valid_key_p", "KEYHASH-VALID-KEY-P", 1, 0, false);
            declareFunction("mapkeyhash", "MAPKEYHASH", 2, 0, false);
            declareFunction("cfasl_output_object_keyhash_method", "CFASL-OUTPUT-OBJECT-KEYHASH-METHOD", 2, 0, false);
            declareFunction("cfasl_output_keyhash", "CFASL-OUTPUT-KEYHASH", 2, 0, false);
            declareFunction("cfasl_input_keyhash", "CFASL-INPUT-KEYHASH", 1, 0, false);
            declareFunction("copy_keyhash", "COPY-KEYHASH", 1, 0, false);
            declareFunction("keyhash_random_key", "KEYHASH-RANDOM-KEY", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareMacro("is_empty_hash_stash_value_p", "IS-EMPTY-HASH-STASH-VALUE-P");
            declareFunction("compute_keyhash_grow_sizes", "COMPUTE-KEYHASH-GROW-SIZES", 2, 0, false);
            declareFunction("compute_keyhash_capacity", "COMPUTE-KEYHASH-CAPACITY", 1, 0, false);
            declareFunction("keyhash_table_size_limit_tuple", "KEYHASH-TABLE-SIZE-LIMIT-TUPLE", 0, 0, false);
            declareFunction("keyhash_allocate", "KEYHASH-ALLOCATE", 2, 0, false);
            declareFunction("keyhash_allocate_nodes", "KEYHASH-ALLOCATE-NODES", 2, 0, false);
            declareFunction("grow_keyhash", "GROW-KEYHASH", 1, 0, false);
            declareFunction("potentially_grow_keyhash", "POTENTIALLY-GROW-KEYHASH", 1, 0, false);
            declareFunction("clear_keyhash_node", "CLEAR-KEYHASH-NODE", 2, 0, false);
            declareFunction("keyhash_compute_hash", "KEYHASH-COMPUTE-HASH", 2, 0, false);
            declareFunction("scale_keycode_to_keyhash", "SCALE-KEYCODE-TO-KEYHASH", 2, 0, false);
            declareMacro("set_to_next_probe_index", "SET-TO-NEXT-PROBE-INDEX");
            declareMacro("keyhash_lookup_loop", "KEYHASH-LOOKUP-LOOP");
            declareFunction("keyhash_lookup_key_eq", "KEYHASH-LOOKUP-KEY-EQ", 7, 0, false);
            declareFunction("keyhash_lookup_key_eql", "KEYHASH-LOOKUP-KEY-EQL", 7, 0, false);
            declareFunction("keyhash_lookup_key_equal", "KEYHASH-LOOKUP-KEY-EQUAL", 7, 0, false);
            declareFunction("keyhash_lookup_key_equalp", "KEYHASH-LOOKUP-KEY-EQUALP", 7, 0, false);
            declareFunction("keyhash_lookup_key", "KEYHASH-LOOKUP-KEY", 3, 0, false);
            declareFunction("keyhash_find_key", "KEYHASH-FIND-KEY", 2, 0, false);
            declareFunction("keyhash_cannot_find_empty_nodeP", "KEYHASH-CANNOT-FIND-EMPTY-NODE?", 1, 0, false);
            declareFunction("store_in_keyhash", "STORE-IN-KEYHASH", 3, 0, false);
            declareFunction("keyhash_fill_gap", "KEYHASH-FILL-GAP", 2, 0, false);
            declareFunction("iterate_keyhash_necessary", "ITERATE-KEYHASH-NECESSARY", 1, 0, false);
            new com.cyc.cycjava.cycl.keyhash.$iterate_keyhash_necessary$UnaryFunction();
            declareFunction("is_occupied_keyhash_index_p", "IS-OCCUPIED-KEYHASH-INDEX-P", 2, 0, false);
            declareFunction("get_occupied_keyhash_index", "GET-OCCUPIED-KEYHASH-INDEX", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_keyhash_file_Previous() {
        declareFunction("keyhash_print_function_trampoline", "KEYHASH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("keyhash_p", "KEYHASH-P", 1, 0, false);
        new keyhash.$keyhash_p$UnaryFunction();
        declareFunction("khash_nodes", "KHASH-NODES", 1, 0, false);
        declareFunction("khash_test", "KHASH-TEST", 1, 0, false);
        declareFunction("khash_count", "KHASH-COUNT", 1, 0, false);
        declareFunction("khash_hash_stash", "KHASH-HASH-STASH", 1, 0, false);
        declareFunction("_csetf_khash_nodes", "_CSETF-KHASH-NODES", 2, 0, false);
        declareFunction("_csetf_khash_test", "_CSETF-KHASH-TEST", 2, 0, false);
        declareFunction("_csetf_khash_count", "_CSETF-KHASH-COUNT", 2, 0, false);
        declareFunction("_csetf_khash_hash_stash", "_CSETF-KHASH-HASH-STASH", 2, 0, false);
        declareFunction("make_keyhash", "MAKE-KEYHASH", 0, 1, false);
        declareFunction("visit_defstruct_keyhash", "VISIT-DEFSTRUCT-KEYHASH", 2, 0, false);
        declareFunction("visit_defstruct_object_keyhash_method", "VISIT-DEFSTRUCT-OBJECT-KEYHASH-METHOD", 2, 0, false);
        declareFunction("print_key_hash", "PRINT-KEY-HASH", 3, 0, false);
        declareMacro("is_empty_keyhash_key_p", "IS-EMPTY-KEYHASH-KEY-P");
        declareFunction("set_keyhash_nodes", "SET-KEYHASH-NODES", 2, 0, false);
        declareFunction("keyhash_nodes", "KEYHASH-NODES", 1, 0, false);
        declareFunction("allocate_keyhash_nodes", "ALLOCATE-KEYHASH-NODES", 2, 0, false);
        declareFunction("clear_all_keyhash_nodes", "CLEAR-ALL-KEYHASH-NODES", 1, 0, false);
        declareFunction("keyhash_test_internal", "KEYHASH-TEST-INTERNAL", 1, 0, false);
        declareFunction("keyhash_count_internal", "KEYHASH-COUNT-INTERNAL", 1, 0, false);
        declareFunction("keyhash_capacity_internal", "KEYHASH-CAPACITY-INTERNAL", 1, 0, false);
        declareFunction("keyhash_matching_key_internal", "KEYHASH-MATCHING-KEY-INTERNAL", 2, 0, false);
        declareFunction("keyhash_set_key", "KEYHASH-SET-KEY", 2, 0, false);
        declareFunction("keyhash_remove_key", "KEYHASH-REMOVE-KEY", 2, 0, false);
        declareFunction("new_keyhash_iterator_internal", "NEW-KEYHASH-ITERATOR-INTERNAL", 1, 0, false);
        declareFunction("keyhash_random_key_internal", "KEYHASH-RANDOM-KEY-INTERNAL", 1, 0, false);
        declareFunction("legacy_keyhash_test_function", "LEGACY-KEYHASH-TEST-FUNCTION", 1, 0, false);
        declareFunction("clear_legacy_keyhash_data", "CLEAR-LEGACY-KEYHASH-DATA", 1, 0, false);
        declareFunction("legacy_keyhash_format_p", "LEGACY-KEYHASH-FORMAT-P", 1, 0, false);
        declareFunction("new_keyhash_format_p", "NEW-KEYHASH-FORMAT-P", 1, 0, false);
        declareFunction("maybe_swizzle_old_vector_to_hash", "MAYBE-SWIZZLE-OLD-VECTOR-TO-HASH", 1, 0, false);
        declareFunction("new_keyhash", "NEW-KEYHASH", 1, 1, false);
        declareFunction("clrkeyhash", "CLRKEYHASH", 1, 0, false);
        declareFunction("keyhash_test", "KEYHASH-TEST", 1, 0, false);
        declareFunction("keyhash_count", "KEYHASH-COUNT", 1, 0, false);
        declareFunction("keyhash_capacity", "KEYHASH-CAPACITY", 1, 0, false);
        declareFunction("getkeyhash", "GETKEYHASH", 2, 0, false);
        declareFunction("keyhash_matching_key", "KEYHASH-MATCHING-KEY", 2, 0, false);
        declareFunction("setkeyhash", "SETKEYHASH", 2, 0, false);
        declareFunction("remkeyhash", "REMKEYHASH", 2, 0, false);
        declareFunction("new_keyhash_iterator", "NEW-KEYHASH-ITERATOR", 1, 0, false);
        declareFunction("keyhash_iterator_next", "KEYHASH-ITERATOR-NEXT", 1, 0, false);
        declareMacro("do_keyhash", "DO-KEYHASH");
        declareMacro("some_keyhash", "SOME-KEYHASH");
        declareFunction("do_keyhash_nodes", "DO-KEYHASH-NODES", 1, 0, false);
        declareFunction("keyhash_empty_key", "KEYHASH-EMPTY-KEY", 0, 0, false);
        declareFunction("do_keyhash_valid_key_p", "DO-KEYHASH-VALID-KEY-P", 1, 0, false);
        declareFunction("keyhash_valid_key_p", "KEYHASH-VALID-KEY-P", 1, 0, false);
        declareFunction("mapkeyhash", "MAPKEYHASH", 2, 0, false);
        declareFunction("cfasl_output_object_keyhash_method", "CFASL-OUTPUT-OBJECT-KEYHASH-METHOD", 2, 0, false);
        declareFunction("cfasl_output_keyhash", "CFASL-OUTPUT-KEYHASH", 2, 0, false);
        declareFunction("cfasl_input_keyhash", "CFASL-INPUT-KEYHASH", 1, 0, false);
        declareFunction("copy_keyhash", "COPY-KEYHASH", 1, 0, false);
        declareFunction("keyhash_random_key", "KEYHASH-RANDOM-KEY", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_keyhash_file_alt() {
        defconstant("*DTP-KEYHASH*", KEYHASH);
        defconstant("*KEYHASH-A*", $int$10009);
        defconstant("*KEYHASH-STEP*", THIRTEEN_INTEGER);
        deflexical("*KEYHASH-EMPTY-KEY*", NIL != boundp($keyhash_empty_key$) ? ((SubLObject) ($keyhash_empty_key$.getGlobalValue())) : make_symbol($$$The_Empty_KEYHASH_Key));
        deflexical("*KEYHASH-EMPTY-HASH*", NIL != boundp($keyhash_empty_hash$) ? ((SubLObject) ($keyhash_empty_hash$.getGlobalValue())) : NIL);
        deflexical("*KEYHASH-GROW-SIZES*", compute_keyhash_grow_sizes($keyhash_step$.getGlobalValue(), $most_positive_fixnum$.getGlobalValue()));
        defconstant("*CFASL-OPCODE-KEYHASH*", $int$68);
        return NIL;
    }

    public static SubLObject init_keyhash_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-KEYHASH*", KEYHASH);
            deflexical("*KEYHASH-EMPTY-KEY*", SubLTrampolineFile.maybeDefault($keyhash_empty_key$, $keyhash_empty_key$, () -> make_symbol($$$The_Empty_KEYHASH_Key)));
            defconstant("*CFASL-OPCODE-KEYHASH*", $int$68);
        }
        if (SubLFiles.USE_V2) {
            defconstant("*KEYHASH-A*", $int$10009);
            defconstant("*KEYHASH-STEP*", THIRTEEN_INTEGER);
            deflexical("*KEYHASH-EMPTY-KEY*", NIL != boundp($keyhash_empty_key$) ? ((SubLObject) ($keyhash_empty_key$.getGlobalValue())) : make_symbol($$$The_Empty_KEYHASH_Key));
            deflexical("*KEYHASH-EMPTY-HASH*", NIL != boundp($keyhash_empty_hash$) ? ((SubLObject) ($keyhash_empty_hash$.getGlobalValue())) : NIL);
            deflexical("*KEYHASH-GROW-SIZES*", compute_keyhash_grow_sizes($keyhash_step$.getGlobalValue(), $most_positive_fixnum$.getGlobalValue()));
        }
        return NIL;
    }

    public static SubLObject init_keyhash_file_Previous() {
        defconstant("*DTP-KEYHASH*", KEYHASH);
        deflexical("*KEYHASH-EMPTY-KEY*", SubLTrampolineFile.maybeDefault($keyhash_empty_key$, $keyhash_empty_key$, () -> make_symbol($$$The_Empty_KEYHASH_Key)));
        defconstant("*CFASL-OPCODE-KEYHASH*", $int$68);
        return NIL;
    }

    public static final SubLObject setup_keyhash_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(KEYHASH_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(KHASH_NODES, _CSETF_KHASH_NODES);
        def_csetf(KHASH_TEST, _CSETF_KHASH_TEST);
        def_csetf(KHASH_COUNT, _CSETF_KHASH_COUNT);
        def_csetf(KHASH_HASH_STASH, _CSETF_KHASH_HASH_STASH);
        identity(KEYHASH);
        declare_defglobal($keyhash_empty_key$);
        declare_defglobal($keyhash_empty_hash$);
        register_macro_helper(DO_KEYHASH_NODES, $list_alt76);
        register_macro_helper(DO_KEYHASH_VALID_KEY_P, $list_alt76);
        define_obsolete_register(IS_OCCUPIED_KEYHASH_INDEX_P, $list_alt78);
        define_obsolete_register(GET_OCCUPIED_KEYHASH_INDEX, $list_alt80);
        register_cfasl_input_function($cfasl_opcode_keyhash$.getGlobalValue(), CFASL_INPUT_KEYHASH);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_KEYHASH_METHOD));
        return NIL;
    }

    public static SubLObject setup_keyhash_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(KEYHASH_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list9);
            def_csetf(KHASH_NODES, _CSETF_KHASH_NODES);
            def_csetf(KHASH_TEST, _CSETF_KHASH_TEST);
            def_csetf(KHASH_COUNT, _CSETF_KHASH_COUNT);
            def_csetf(KHASH_HASH_STASH, _CSETF_KHASH_HASH_STASH);
            identity(KEYHASH);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KEYHASH_METHOD));
            declare_defglobal($keyhash_empty_key$);
            register_macro_helper(DO_KEYHASH_NODES, $list48);
            register_macro_helper(KEYHASH_EMPTY_KEY, $list50);
            register_macro_helper(DO_KEYHASH_VALID_KEY_P, $list50);
            register_cfasl_input_function($cfasl_opcode_keyhash$.getGlobalValue(), CFASL_INPUT_KEYHASH);
            register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_KEYHASH_METHOD));
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($keyhash_empty_hash$);
            register_macro_helper(DO_KEYHASH_NODES, $list_alt76);
            register_macro_helper(DO_KEYHASH_VALID_KEY_P, $list_alt76);
            define_obsolete_register(IS_OCCUPIED_KEYHASH_INDEX_P, $list_alt78);
            define_obsolete_register(GET_OCCUPIED_KEYHASH_INDEX, $list_alt80);
        }
        return NIL;
    }

    public static SubLObject setup_keyhash_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(KEYHASH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(KHASH_NODES, _CSETF_KHASH_NODES);
        def_csetf(KHASH_TEST, _CSETF_KHASH_TEST);
        def_csetf(KHASH_COUNT, _CSETF_KHASH_COUNT);
        def_csetf(KHASH_HASH_STASH, _CSETF_KHASH_HASH_STASH);
        identity(KEYHASH);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KEYHASH_METHOD));
        declare_defglobal($keyhash_empty_key$);
        register_macro_helper(DO_KEYHASH_NODES, $list48);
        register_macro_helper(KEYHASH_EMPTY_KEY, $list50);
        register_macro_helper(DO_KEYHASH_VALID_KEY_P, $list50);
        register_cfasl_input_function($cfasl_opcode_keyhash$.getGlobalValue(), CFASL_INPUT_KEYHASH);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_KEYHASH_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_keyhash_file();
    }

    @Override
    public void initializeVariables() {
        init_keyhash_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_keyhash_file();
    }

    static {
    }

    public static final class $keyhash_native extends SubLStructNative {
        public SubLObject $nodes;

        public SubLObject $test;

        public SubLObject $count;

        public SubLObject $hash_stash;

        private static final SubLStructDeclNative structDecl;

        public $keyhash_native() {
            keyhash.$keyhash_native.this.$nodes = Lisp.NIL;
            keyhash.$keyhash_native.this.$test = Lisp.NIL;
            keyhash.$keyhash_native.this.$count = Lisp.NIL;
            keyhash.$keyhash_native.this.$hash_stash = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return keyhash.$keyhash_native.this.$nodes;
        }

        @Override
        public SubLObject getField3() {
            return keyhash.$keyhash_native.this.$test;
        }

        @Override
        public SubLObject getField4() {
            return keyhash.$keyhash_native.this.$count;
        }

        @Override
        public SubLObject getField5() {
            return keyhash.$keyhash_native.this.$hash_stash;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return keyhash.$keyhash_native.this.$nodes = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return keyhash.$keyhash_native.this.$test = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return keyhash.$keyhash_native.this.$count = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return keyhash.$keyhash_native.this.$hash_stash = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.keyhash.$keyhash_native.class, KEYHASH, KEYHASH_P, $list3, $list4, new String[]{ "$nodes", "$test", "$count", "$hash_stash" }, $list5, $list6, PRINT_KEY_HASH);
        }
    }

    public static final class $keyhash_p$UnaryFunction extends UnaryFunction {
        public $keyhash_p$UnaryFunction() {
            super(extractFunctionNamed("KEYHASH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return keyhash_p(arg1);
        }
    }

    static private final SubLList $list_alt3 = list(makeSymbol("NODES"), makeSymbol("TEST"), makeSymbol("COUNT"), makeSymbol("HASH-STASH"));

    static private final SubLList $list_alt4 = list(makeKeyword("NODES"), $TEST, makeKeyword("COUNT"), makeKeyword("HASH-STASH"));

    static private final SubLList $list_alt5 = list(makeSymbol("KHASH-NODES"), makeSymbol("KHASH-TEST"), makeSymbol("KHASH-COUNT"), makeSymbol("KHASH-HASH-STASH"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-KHASH-NODES"), makeSymbol("_CSETF-KHASH-TEST"), makeSymbol("_CSETF-KHASH-COUNT"), makeSymbol("_CSETF-KHASH-HASH-STASH"));

    static private final SubLString $str_alt21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt22$__ = makeString("#<");

    static private final SubLString $str_alt24$_ = makeString(" ");

    static private final SubLString $str_alt25$_ = makeString("/");

    public static final SubLInteger $int$10009 = makeInteger(10009);

    static private final SubLList $list_alt31 = list(makeSymbol("VAL"));

    static private final SubLList $list_alt32 = list(makeSymbol("*KEYHASH-EMPTY-KEY*"));

    static private final SubLList $list_alt33 = list(makeSymbol("*KEYHASH-EMPTY-HASH*"));

    static private final SubLList $list_alt34 = cons(makeSymbol("TABLE-SIZE"), makeSymbol("GROW-SIZE"));

    static private final SubLString $str_alt35$Keyhash_capacity__A_has_exceeded_ = makeString("Keyhash capacity ~A has exceeded the limit ~A for this platform.");

    static private final SubLList $list_alt36 = cons(makeSymbol("THE-CAPACITY"), makeSymbol("THE-LIMIT"));

    static private final SubLList $list_alt37 = list(makeSymbol("INDEX"), makeSymbol("CAPACITY"));

    static private final SubLList $list_alt40 = list(makeSymbol("*KEYHASH-STEP*"));

    static private final SubLList $list_alt44 = list(makeSymbol("TEST-FUNCTION"), makeSymbol("KEY"), makeSymbol("KEYCODE"), makeSymbol("NODES"), makeSymbol("HASH-STASH"), makeSymbol("CAPACITY"), makeSymbol("INDEX"), makeSymbol("WRAPPED-AROUND"));

    static private final SubLList $list_alt46 = list(makeSymbol("DONE"));

    static private final SubLList $list_alt48 = list(makeSymbol("CNOT"), makeSymbol("DONE"));

    private static final SubLSymbol NODE_KEY = makeSymbol("NODE-KEY");

    static private final SubLList $list_alt52 = list(list(makeSymbol("IS-EMPTY-KEYHASH-KEY-P"), makeSymbol("NODE-KEY")), list(makeSymbol("CSETQ"), makeSymbol("DONE"), T));

    static private final SubLSymbol $sym54$_ = makeSymbol("=");

    static private final SubLList $list_alt55 = list(makeSymbol("NODE-KEY"));

    static private final SubLList $list_alt56 = list(list(makeSymbol("CSETQ"), makeSymbol("DONE"), T));

    static private final SubLList $list_alt57 = list(list(RET, makeKeyword("NO-NODE")));

    private static final SubLSymbol SET_TO_NEXT_PROBE_INDEX = makeSymbol("SET-TO-NEXT-PROBE-INDEX");

    private static final SubLSymbol $NO_NODE = makeKeyword("NO-NODE");

    static private final SubLString $str_alt61$Unsupported_test_function__s = makeString("Unsupported test function ~s");

    static private final SubLString $str_alt62$The_keyhash__A_mysteriously_overf = makeString("The keyhash ~A mysteriously overflowed.");

    static private final SubLString $str_alt65$Cannot_grow_keyhash__A_any_more_ = makeString("Cannot grow keyhash ~A any more.");

    private static final SubLSymbol ITERATE_KEYHASH_NECESSARY = makeSymbol("ITERATE-KEYHASH-NECESSARY");

    static private final SubLList $list_alt67 = list(list(makeSymbol("KEY"), makeSymbol("KEYHASH"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt68 = list($DONE);

    static private final SubLList $list_alt74 = list(list(makeSymbol("KEY"), makeSymbol("KEYHASH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt76 = list(makeSymbol("DO-KEYHASH"), makeSymbol("DO-SET-CONTENTS"));

    private static final SubLSymbol IS_OCCUPIED_KEYHASH_INDEX_P = makeSymbol("IS-OCCUPIED-KEYHASH-INDEX-P");

    static private final SubLList $list_alt78 = list(makeSymbol("DO-KEYHASH-VALID-KEY-P"));

    private static final SubLSymbol GET_OCCUPIED_KEYHASH_INDEX = makeSymbol("GET-OCCUPIED-KEYHASH-INDEX");

    static private final SubLList $list_alt80 = list(makeSymbol("DO-KEYHASH-NODES"));
}

/**
 * Total time: 210 ms
 */
