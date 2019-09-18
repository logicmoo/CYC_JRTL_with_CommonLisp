/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.seventh;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.forward_propagate_assertions;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      IMAGE-DEMO-INTERNALS
 *  source file: /cyc/top/cycl/image-demo-internals.lisp
 *  created:     2019/07/03 17:38:27
 */
public final class image_demo_internals extends SubLTranslatedFile implements V02 {
    // // Constructor
    private image_demo_internals() {
    }

    public static final SubLFile me = new image_demo_internals();




    // defparameter
    public static final SubLSymbol $ir_state_keys$ = makeSymbol("*IR-STATE-KEYS*");

    // defparameter
    public static final SubLSymbol $ir_state_defaults$ = makeSymbol("*IR-STATE-DEFAULTS*");

    /**
     * The list of keys indicating the types of objects
     * currently eligible for retrieval
     */
    // defparameter
    public static final SubLSymbol $ir_cached_keys$ = makeSymbol("*IR-CACHED-KEYS*");

    // defparameter
    public static final SubLSymbol $ir_query_function$ = makeSymbol("*IR-QUERY-FUNCTION*");

    // defparameter
    private static final SubLSymbol $ir_state_vector_length$ = makeSymbol("*IR-STATE-VECTOR-LENGTH*");

    // defparameter
    public static final SubLSymbol $ir_types$ = makeSymbol("*IR-TYPES*");

    public static final SubLObject ir_reinit() {
        {
            SubLObject users = Mapping.mapcar(symbol_function(CAR), $ir_state$.getGlobalValue());
            SubLObject cdolist_list_var = users;
            SubLObject u = NIL;
            for (u = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , u = cdolist_list_var.first()) {
                reset_ir_state(u);
            }
        }
        return NIL;
    }

    public static final SubLObject make_ir_state_vector(SubLObject length) {
        if (length == UNPROVIDED) {
            length = $ir_state_vector_length$.getDynamicValue();
        }
        return make_vector(length, MINUS_ONE_INTEGER);
    }

    /**
     * Returns the vector that contains the ir state information
     * for user.  The vectors are contained in the table (a-list)
     * bound to *ir-state*
     */
    public static final SubLObject get_ir_state(SubLObject user) {
        return misc_utilities.get_indexed_obj(user, $ir_state$.getGlobalValue(), symbol_function(EQUAL));
    }

    /**
     * Adds a state vector for user to *ir-state* if a
     * state vector is not already present.
     */
    public static final SubLObject add_ir_vector(SubLObject user) {
        {
            SubLObject vec = get_ir_state(user);
            if (!vec.isVector()) {
                vec = make_ir_state_vector(UNPROVIDED);
                $ir_state$.setGlobalValue(cons(cons(user, vec), $ir_state$.getGlobalValue()));
                reset_ir_state(user);
            }
        }
        return return_ir_state(user);
    }

    /**
     * Get the value for key in user's *ir-state* vector
     */
    public static final SubLObject ir_value(SubLObject user, SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return misc_utilities.get_vector_indexed_val(user, $ir_state$.getGlobalValue(), key, $ir_state_keys$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
        }
    }

    /**
     * Change the value for KEY in USER's *ir-state* vector by
     * replacing or augmenting the old value with NEW.  METHOD specifies
     * how the value will be updated with NEW.  The methods currently
     * supported are :replace, :cons, :adjoin, :append, :union, :rplaca,
     * :rplacd, :inc, :dec, :car, :cdr, and :remove.  Meta-point on
     * update-vector-indexed-val to see the current set of update
     * options.
     */
    public static final SubLObject change_ir_value(SubLObject user, SubLObject key, SubLObject method, SubLObject v_new) {
        if (method == UNPROVIDED) {
            method = $REPLACE;
        }
        if (v_new == UNPROVIDED) {
            v_new = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return misc_utilities.update_vector_indexed_val(user, $ir_state$.getGlobalValue(), key, $ir_state_keys$.getDynamicValue(thread), v_new, method, symbol_function(EQUAL), symbol_function(EQUAL), symbol_function(EQUAL));
        }
    }

    /**
     * Reset the values for USER in *ir-state* to the defaults
     * listed in *ir-state-defaults*.
     */
    public static final SubLObject reset_ir_state(SubLObject user) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vec = get_ir_state(user);
                if (vec.isVector()) {
                    {
                        SubLObject cdotimes_end_var = length(vec);
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                            set_aref(vec, i, MINUS_ONE_INTEGER);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = $ir_state_keys$.getDynamicValue(thread);
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            {
                                SubLObject key = pair.first();
                                SubLObject v_default = assoc(key, $ir_state_defaults$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                                if (NIL != find(key, $list_alt8, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    v_default = make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED);
                                }
                                change_ir_value(user, key, $REPLACE, v_default);
                            }
                        }
                    }
                }
            }
            return get_ir_state(user);
        }
    }

    public static final SubLObject return_ir_state(SubLObject user) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(CAR), $ir_state_keys$.getDynamicValue(thread));
                SubLObject key = NIL;
                for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                    ans = cons(list(key, ir_value(user, key)), ans);
                }
                return nreverse(ans);
            }
        }
    }

    public static final SubLObject print_ir_state(SubLObject user) {
        {
            SubLObject result = return_ir_state(user);
            SubLObject longest = ZERO_INTEGER;
            {
                SubLObject cdolist_list_var = result;
                SubLObject x = NIL;
                for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                    {
                        SubLObject len1 = length(format(NIL, $str_alt9$_s, x.first()));
                        if (len1.numG(longest)) {
                            longest = len1;
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = result;
                SubLObject x = NIL;
                for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                    {
                        SubLObject key = format(NIL, $str_alt9$_s, x.first());
                        SubLObject len2 = length(key);
                        SubLObject fill = Strings.make_string(subtract(longest, len2), UNPROVIDED);
                        format(T, $str_alt10$___a_a____s, new SubLObject[]{ key, fill, second(x) });
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Reset (clear) ir state info for keys in key-list, else
     * for all keys except exception-list, else for all keys
     * in *ir-state-keys*
     */
    public static final SubLObject clear_ir_state(SubLObject user, SubLObject key_list, SubLObject exception_list) {
        if (key_list == UNPROVIDED) {
            key_list = NIL;
        }
        if (exception_list == UNPROVIDED) {
            exception_list = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_keys = Mapping.mapcar(symbol_function(CAR), $ir_state_keys$.getDynamicValue(thread));
                SubLObject keys_to_use = (NIL != key_list) ? ((SubLObject) (key_list)) : NIL != exception_list ? ((SubLObject) (set_difference(all_keys, exception_list, UNPROVIDED, UNPROVIDED))) : all_keys;
                SubLObject cdolist_list_var = keys_to_use;
                SubLObject key = NIL;
                for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                    change_ir_value(user, key, UNPROVIDED, UNPROVIDED);
                }
                return get_ir_state(user);
            }
        }
    }

    public static final SubLObject blast_ir_state() {
        $ir_state$.setGlobalValue(NIL);
        return $ir_state$.getGlobalValue();
    }

    public static final SubLObject ir_init(SubLObject user) {
        add_ir_vector(user);
        reset_ir_state(user);
        return get_ir_state(user);
    }

    public static final SubLObject ir_clear_data() {
        clear_ir_state(operation_communication.the_cyclist(), $list_alt11, UNPROVIDED);
        {
            SubLObject cdolist_list_var = $list_alt8;
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                {
                    SubLObject table = ir_value(operation_communication.the_cyclist(), key);
                    if (table.isHashtable()) {
                        clrhash(table);
                    } else {
                        change_ir_value(operation_communication.the_cyclist(), key, $REPLACE, make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject ir_debug(SubLObject user) {
        change_ir_value(user, $DEBUG, $REPLACE, T);
        return ir_value(user, $DEBUG);
    }

    public static final SubLObject ir_no_debug(SubLObject user) {
        change_ir_value(user, $DEBUG, $REPLACE, NIL);
        return ir_value(user, $DEBUG);
    }

    public static final SubLObject pit_caption(SubLObject pit) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject el_list_ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        el_list_ans = kb_mapping_utilities.fpred_value(pit, $$pitEnglishCaption, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != el_utilities.el_list_p(el_list_ans)) {
                            ans = el_utilities.el_list_items(el_list_ans);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Is form an #$isa literal with an EL variable in the arg1 position,
     * and is the arg2 a spec of one of the collections in *ir-types*
     * for (ir-value (the-cyclist) :object-keys)?
     */
    public static final SubLObject isa_var_literalP(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (((form.isCons() && length(form).numE(THREE_INTEGER)) && (form.first() == $$isa)) && (NIL != cycl_variables.el_varP(second(form)))) {
                    {
                        SubLObject keys = ir_value(operation_communication.the_cyclist(), $OBJECT_KEYS);
                        SubLObject key = (length(keys).numG(ONE_INTEGER)) ? ((SubLObject) ($PIT)) : keys.first();
                        SubLObject collections = fourth(assoc(key, $ir_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                        SubLObject term3 = third(form);
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(ir_value(operation_communication.the_cyclist(), $PSC), thread);
                                if (NIL == ans) {
                                    {
                                        SubLObject csome_list_var = collections;
                                        SubLObject c = NIL;
                                        for (c = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , c = csome_list_var.first()) {
                                            if (NIL != genls.genlP(term3, c, UNPROVIDED, UNPROVIDED)) {
                                                ans = T;
                                            }
                                        }
                                    }
                                }
                                if (term3.isCons() && (term3.first() == $$GroupFn)) {
                                    if (NIL == ans) {
                                        {
                                            SubLObject csome_list_var = collections;
                                            SubLObject c = NIL;
                                            for (c = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , c = csome_list_var.first()) {
                                                if (NIL != genls.genlP(second(term3), c, UNPROVIDED, UNPROVIDED)) {
                                                    ans = T;
                                                }
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
                return ans;
            }
        }
    }

    /**
     * Returns appropriate content variables for the type of context
     */
    public static final SubLObject gather_isa_content_variables(SubLObject obj) {
        {
            SubLObject lits = NIL;
            SubLObject ans = NIL;
            if (obj.isCons()) {
                lits = list_utilities.cons_tree_gather(obj, symbol_function($sym22$ISA_VAR_LITERAL_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = lits;
                    SubLObject lit = NIL;
                    for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                        {
                            SubLObject item_var = second(lit);
                            if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                ans = cons(item_var, ans);
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Extract el variables from obj and return them
     */
    public static final SubLObject extract_variables(SubLObject obj) {
        {
            SubLObject ans = NIL;
            if (obj.isCons()) {
                ans = list_utilities.cons_tree_gather(obj, symbol_function($sym23$EL_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != cycl_variables.el_varP(obj)) {
                    ans = cons(obj, ans);
                }

            return ans;
        }
    }

    /**
     * Return a list of the type constraints on el variables in formula
     */
    public static final SubLObject variable_type_constraints(SubLObject formula, SubLObject mt) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = extract_variables(formula);
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                ans = cons(cons(var, at_var_types.formula_variable_isa_constraints(var, formula, mt, UNPROVIDED)), ans);
            }
            return ans;
        }
    }

    public static final SubLObject content_variables(SubLObject formula, SubLObject key, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != ir_value(operation_communication.the_cyclist(), $USE_ISA_VAR_LITS)) {
                    ans = gather_isa_content_variables(formula);
                } else {
                    {
                        SubLObject target_types = fourth(assoc(key, $ir_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(mt, thread);
                                {
                                    SubLObject cdolist_list_var = variable_type_constraints(formula, mt);
                                    SubLObject form = NIL;
                                    for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                                        {
                                            SubLObject done = NIL;
                                            if (NIL == done) {
                                                {
                                                    SubLObject csome_list_var = target_types;
                                                    SubLObject c1 = NIL;
                                                    for (c1 = csome_list_var.first(); !((NIL != done) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , c1 = csome_list_var.first()) {
                                                        if (NIL == done) {
                                                            {
                                                                SubLObject csome_list_var_1 = form.rest();
                                                                SubLObject c2 = NIL;
                                                                for (c2 = csome_list_var_1.first(); !((NIL != done) || (NIL == csome_list_var_1)); csome_list_var_1 = csome_list_var_1.rest() , c2 = csome_list_var_1.first()) {
                                                                    if (NIL != genls.genlP(c2, c1, UNPROVIDED, UNPROVIDED)) {
                                                                        ans = cons(form.first(), ans);
                                                                        done = T;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL != list_utilities.cons_tree_find($$GroupFn, formula, UNPROVIDED, UNPROVIDED)) {
                                        ans = union(ans, gather_isa_content_variables(formula), UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject content_constantP(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject keys = ir_value(operation_communication.the_cyclist(), $OBJECT_KEYS);
                SubLObject key = (length(keys).numG(ONE_INTEGER)) ? ((SubLObject) ($PIT)) : keys.first();
                SubLObject target_types = fourth(assoc(key, $ir_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                SubLObject v_boolean = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(ir_value(operation_communication.the_cyclist(), $PSC), thread);
                        if ((NIL != misc_kb_utilities.constant_or_natP(obj)) && (NIL == kb_accessors.relationP(obj))) {
                            if (NIL == v_boolean) {
                                {
                                    SubLObject csome_list_var = target_types;
                                    SubLObject c = NIL;
                                    for (c = csome_list_var.first(); !((NIL != v_boolean) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , c = csome_list_var.first()) {
                                        if (NIL != isa.isaP(obj, c, UNPROVIDED, UNPROVIDED)) {
                                            v_boolean = T;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_boolean;
            }
        }
    }

    public static final SubLObject content_constants(SubLObject obj) {
        {
            SubLObject ans = NIL;
            if (obj.isCons()) {
                ans = list_utilities.cons_tree_gather(obj, symbol_function($sym25$CONTENT_CONSTANT_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != content_constantP(obj)) {
                    ans = cons(obj, ans);
                }

            return ans;
        }
    }

    public static final SubLObject extract_content_objects(SubLObject formula, SubLObject key, SubLObject mt) {
        {
            SubLObject v_variables = content_variables(formula, key, mt);
            SubLObject constants = Mapping.mapcar(symbol_function(NART_TO_NAUT), content_constants(formula));
            return nconc(v_variables, constants);
        }
    }

    public static final SubLObject temporally_qualify_literalP(SubLObject literal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_boolean = NIL;
                if (literal.isCons()) {
                    {
                        SubLObject pred = literal.first();
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                v_boolean = makeBoolean((NIL != constant_handles.valid_constantP(pred, UNPROVIDED)) && ((NIL != isa.isaP(pred, $$CotemporalPredicate, UNPROVIDED, UNPROVIDED)) || (NIL != kb_mapping_utilities.fpred_value(pred, $$temporallyIntrinsicArg, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return v_boolean;
            }
        }
    }

    public static final SubLObject ir_temporally_convert_pos_lit(SubLObject literal) {
        if (literal.isCons() && (NIL != temporally_qualify_literalP(literal))) {
            literal = list($$holdsIn, $sym30$_MT_TIME, literal);
        }
        return literal;
    }

    public static final SubLObject ir_temporally_convert_neg_lit(SubLObject literal) {
        if (literal.isCons()) {
            literal = (NIL != temporally_qualify_literalP(literal)) ? ((SubLObject) (list($$holdsIn, $sym30$_MT_TIME, list($$not, literal)))) : list($$not, literal);
        }
        return literal;
    }

    public static final SubLObject insert_content_literals(SubLObject cycl_expr) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mode = ir_value(operation_communication.the_cyclist(), $MODE);
                SubLObject mt = (mode == $CAPTION) ? ((SubLObject) (ir_value(operation_communication.the_cyclist(), $MT))) : $$PSC_ImageQuery;
                SubLObject insert_obj = (mode == $QUERY) ? ((SubLObject) ($sym37$_CONTEXT)) : mt;
                SubLObject insert_time = (mode == $QUERY) ? ((SubLObject) ($sym30$_MT_TIME)) : list($$MtTimeFn, mt);
                SubLObject dnf = clausifier.dnf_clausal_form(cycl_expr, mt);
                SubLObject keys = ir_value(operation_communication.the_cyclist(), $OBJECT_KEYS);
                SubLObject key = (length(keys).numG(ONE_INTEGER)) ? ((SubLObject) ($PIT)) : keys.first();
                SubLObject v_psc = ir_value(operation_communication.the_cyclist(), $PSC);
                SubLObject ans = NIL;
                if (!dnf.isCons()) {
                    return NIL;
                }
                {
                    SubLObject cdolist_list_var = dnf;
                    SubLObject pair = NIL;
                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                        {
                            SubLObject neg_lits = pair.first();
                            SubLObject pos_lits = second(pair);
                            SubLObject formula1 = cons($$and, pos_lits);
                            SubLObject formula2 = cons($$and, neg_lits);
                            SubLObject terms1 = extract_content_objects(formula1, key, v_psc);
                            SubLObject terms2 = extract_content_objects(formula2, key, v_psc);
                            SubLObject pred = second(assoc(key, $ir_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                            SubLObject temporally_qualifyP = NIL;
                            if (NIL == temporally_qualifyP) {
                                {
                                    SubLObject csome_list_var = append(neg_lits, pos_lits);
                                    SubLObject lit = NIL;
                                    for (lit = csome_list_var.first(); !((NIL != temporally_qualifyP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit = csome_list_var.first()) {
                                        if (NIL != temporally_qualify_literalP(lit)) {
                                            temporally_qualifyP = T;
                                        }
                                    }
                                }
                            }
                            if (NIL != temporally_qualifyP) {
                                pos_lits = Mapping.mapcar(symbol_function(IR_TEMPORALLY_CONVERT_POS_LIT), pos_lits);
                                pos_lits = cons(list($$mtTime, insert_obj, insert_time), pos_lits);
                            }
                            neg_lits = Mapping.mapcar(symbol_function(IR_TEMPORALLY_CONVERT_NEG_LIT), neg_lits);
                            {
                                SubLObject cdolist_list_var_2 = terms1;
                                SubLObject x = NIL;
                                for (x = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , x = cdolist_list_var_2.first()) {
                                    pos_lits = cons(list(pred, insert_obj, x), pos_lits);
                                }
                            }
                            {
                                SubLObject cdolist_list_var_3 = terms2;
                                SubLObject x = NIL;
                                for (x = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , x = cdolist_list_var_3.first()) {
                                    neg_lits = cons(list(pred, insert_obj, x), neg_lits);
                                }
                            }
                            pos_lits = append(pos_lits, neg_lits);
                            if (NIL != pos_lits) {
                                if (length(pos_lits).numE(ONE_INTEGER)) {
                                    ans = cons(pos_lits.first(), ans);
                                } else {
                                    ans = cons(cons($$and, pos_lits), ans);
                                }
                            }
                        }
                    }
                }
                if (NIL != ans) {
                    if (length(ans).numE(ONE_INTEGER)) {
                        ans = ans.first();
                    } else {
                        ans = cons($$or, ans);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject ir_clear_results_table() {
        {
            SubLObject table = ir_value(operation_communication.the_cyclist(), $RESULTS_TABLE);
            if (table.isHashtable()) {
                clrhash(table);
            } else {
                change_ir_value(operation_communication.the_cyclist(), $RESULTS_TABLE, $REPLACE, make_hash_table($int$50, symbol_function(EQUAL), UNPROVIDED));
            }
        }
        return ir_value(operation_communication.the_cyclist(), $RESULTS_TABLE);
    }

    public static final SubLObject ir_clear_utility_tables() {
        {
            SubLObject keys = $list_alt46;
            SubLObject cdolist_list_var = keys;
            SubLObject k = NIL;
            for (k = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , k = cdolist_list_var.first()) {
                {
                    SubLObject table = ir_value(operation_communication.the_cyclist(), k);
                    if (table.isHashtable()) {
                        clrhash(table);
                    } else {
                        change_ir_value(operation_communication.the_cyclist(), k, $REPLACE, make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject ir_types_from_keys(SubLObject keys) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != find($PIT, keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    keys = $list_alt47;
                }
                {
                    SubLObject cdolist_list_var = keys;
                    SubLObject key = NIL;
                    for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                        {
                            SubLObject collection = third(assoc(key, $ir_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                            if (NIL != collection) {
                                {
                                    SubLObject item_var = collection;
                                    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject ir_ask_query(SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject keys = ir_value(operation_communication.the_cyclist(), $OBJECT_KEYS);
                SubLObject function = $ir_query_function$.getDynamicValue(thread);
                SubLObject result = NIL;
                ir_clear_results_table();
                if (NIL != fboundp(function)) {
                    result = funcall(function, query, keys);
                }
                return result;
            }
        }
    }

    public static final SubLObject ir_set_psc(SubLObject object_keys) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (length(object_keys).numG(ONE_INTEGER)) {
                    object_keys = $list_alt47;
                }
                ans = seventh(assoc(object_keys.first(), $ir_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                if (NIL == ans) {
                    ans = ir_value(operation_communication.the_cyclist(), $GENERAL_PSC);
                }
                change_ir_value(operation_communication.the_cyclist(), $PSC, $REPLACE, ans);
                return ans;
            }
        }
    }

    public static final SubLObject ir_set_focus_predicate(SubLObject object_keys) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (length(object_keys).numG(ONE_INTEGER)) {
                    object_keys = $list_alt47;
                }
                ans = second(assoc(object_keys.first(), $ir_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                if (NIL == ans) {
                    ans = $$propositionalInfoAbout;
                }
                change_ir_value(operation_communication.the_cyclist(), $FOCUS_PREDICATE, $REPLACE, ans);
                return ans;
            }
        }
    }

    public static final SubLObject extract_context_test(SubLObject obj) {
        {
            SubLObject pred = (obj.isCons()) ? ((SubLObject) (obj.first())) : NIL;
            return makeBoolean((NIL != constant_handles.valid_constantP(pred, UNPROVIDED)) && pred.equal(ir_value(operation_communication.the_cyclist(), $FOCUS_PREDICATE)));
        }
    }

    public static final SubLObject extract_context(SubLObject cycl) {
        {
            SubLObject ans = list_utilities.cons_tree_find_if(symbol_function(EXTRACT_CONTEXT_TEST), cycl, UNPROVIDED);
            ans = second(ans);
            return ans;
        }
    }

    public static final SubLObject ir_psc_ask(SubLObject query, SubLObject object_keys) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject backchain = ir_value(operation_communication.the_cyclist(), $BACKCHAIN);
                SubLObject number = ir_value(operation_communication.the_cyclist(), $NUMBER);
                SubLObject time = ir_value(operation_communication.the_cyclist(), $TIME);
                SubLObject depth = ir_value(operation_communication.the_cyclist(), $DEPTH);
                SubLObject v_psc = ir_set_psc(object_keys);
                SubLObject table = ir_value(operation_communication.the_cyclist(), $RESULTS_TABLE);
                SubLObject found = NIL;
                SubLObject ans = NIL;
                ir_set_focus_predicate(object_keys);
                ans = ir_ask_internal(query, v_psc, backchain, number, time, depth);
                {
                    SubLObject cdolist_list_var = ans;
                    SubLObject form = NIL;
                    for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                        {
                            SubLObject cycl = form.first();
                            SubLObject mt = extract_context(cycl);
                            SubLObject id = misc_kb_utilities.get_term_id(mt);
                            SubLObject key = NIL;
                            if (!((NIL != find(mt, found, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL == id))) {
                                if (length(object_keys).numE(ONE_INTEGER)) {
                                    key = object_keys.first();
                                } else {
                                    if (NIL == key) {
                                        {
                                            SubLObject csome_list_var = Mapping.mapcar(symbol_function(THIRD), $ir_types$.getDynamicValue(thread));
                                            SubLObject collection = NIL;
                                            for (collection = csome_list_var.first(); !((NIL != key) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , collection = csome_list_var.first()) {
                                                if (NIL != isa.isa_in_any_mtP(mt, collection)) {
                                                    key = find(collection, $ir_types$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(THIRD), UNPROVIDED, UNPROVIDED).first();
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL == key) {
                                    key = $PIT;
                                }
                                sethash(id, table, list(key, form));
                                found = cons(mt, found);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * What actually calls the ASK in the information retrieval prototype
     */
    public static final SubLObject ir_ask_internal(SubLObject query, SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == UNPROVIDED) {
            backchainP = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answers = NIL;
                SubLObject v_properties = NIL;
                if (NIL != backchainP) {
                    v_properties = putf(v_properties, $MAX_TRANSFORMATION_DEPTH, T == backchainP ? ((SubLObject) (NIL)) : backchainP);
                }
                if (NIL != number) {
                    v_properties = putf(v_properties, $MAX_NUMBER, number);
                    v_properties = putf(v_properties, $kw59$FORGET_EXTRA_RESULTS_, T);
                }
                if (NIL != time) {
                    v_properties = putf(v_properties, $MAX_TIME, time);
                }
                if (NIL != depth) {
                    v_properties = putf(v_properties, $MAX_PROOF_DEPTH, depth);
                }
                v_properties = putf(v_properties, $RETURN, $BINDINGS_AND_SUPPORTS);
                v_properties = putf(v_properties, $ANSWER_LANGUAGE, $HL);
                v_properties = putf(v_properties, $DISJUNCTION_FREE_EL_VARS_POLICY, $COMPUTE_INTERSECTION);
                v_properties = putf(v_properties, $PRODUCTIVITY_LIMIT, $int$400000);
                thread.resetMultipleValues();
                {
                    SubLObject inference_results = inference_kernel.new_cyc_query(query, mt, v_properties);
                    SubLObject reason = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    change_ir_value(operation_communication.the_cyclist(), $FAILURE_REASON, $REPLACE, reason);
                    {
                        SubLObject cdolist_list_var = inference_results;
                        SubLObject inference_result = NIL;
                        for (inference_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inference_result = cdolist_list_var.first()) {
                            {
                                SubLObject datum = inference_result;
                                SubLObject current = datum;
                                SubLObject v_bindings = NIL;
                                SubLObject supports = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt71);
                                v_bindings = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt71);
                                supports = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject substituted_query = sublis(v_bindings, query, symbol_function(EQUAL), UNPROVIDED);
                                        answers = cons(list(substituted_query, supports), answers);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt71);
                                }
                            }
                        }
                    }
                }
                return nreverse(answers);
            }
        }
    }

    public static final SubLObject ir_generate_parses(SubLObject string) {
        {
            SubLObject function = (ir_value(operation_communication.the_cyclist(), $MODE) == $CAPTION) ? ((SubLObject) (ir_value(operation_communication.the_cyclist(), $CAPTION_PARSING_FUNCTION))) : ir_value(operation_communication.the_cyclist(), $QUERY_PARSING_FUNCTION);
            SubLObject ans = NIL;
            if ((NIL != fboundp(function)) && string.isString()) {
                ans = funcall(function, string);
            }
            return ans;
        }
    }

    public static final SubLObject ir_iterative_forward_propagate(SubLObject mts, SubLObject number, SubLObject time, SubLObject depth, SubLObject allow_forward_skolemizationP, SubLObject verboseP) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (allow_forward_skolemizationP == UNPROVIDED) {
            allow_forward_skolemizationP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = forward.$tracing_forward_inference$.currentBinding(thread);
                SubLObject _prev_bind_1 = control_vars.$allow_forward_skolemization$.currentBinding(thread);
                try {
                    forward.$tracing_forward_inference$.bind(verboseP, thread);
                    control_vars.$allow_forward_skolemization$.bind(allow_forward_skolemizationP, thread);
                    {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt = NIL;
                        for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                            if (NIL != verboseP) {
                                format(T, $str_alt74$____Starting_forward_propagation_, mt);
                            }
                            forward_propagate_assertions.forward_propagate_mt(mt, mt, number, time, depth);
                            if (NIL != verboseP) {
                                format(T, $str_alt75$__Finished__apropagating_in__s_a, new SubLObject[]{ NIL == depth ? ((SubLObject) (format(NIL, $str_alt76$exhaustively_))) : $str_alt77$, mt, NIL == depth ? ((SubLObject) ($str_alt78$_)) : format(NIL, $str_alt79$_to_a_depth_cutoff_of__a_, depth) });
                            }
                        }
                    }
                } finally {
                    control_vars.$allow_forward_skolemization$.rebind(_prev_bind_1, thread);
                    forward.$tracing_forward_inference$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_clear_nl_caches() {
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * When T, lookaside caches are used for parsing.
     */
    // defconstant
    private static final SubLSymbol $ir_use_parse_caches$ = makeSymbol("*IR-USE-PARSE-CACHES*");

    public static final SubLObject ir_parse_query(SubLObject string) {
        return ir_parse_query_cache_lookup(string);
    }

    public static final SubLObject ir_parse_caption(SubLObject string) {
        return ir_parse_caption_cache_lookup(string);
    }

    public static final SubLObject make_ir_cache(SubLObject name, SubLObject database) {
        if (database == UNPROVIDED) {
            database = NIL;
        }
        return cons(name, database);
    }

    public static final SubLObject ir_cache_name(SubLObject ir_cache) {
        return ir_cache.first();
    }

    public static final SubLObject ir_cache_database(SubLObject ir_cache) {
        return ir_cache.rest();
    }

    public static final SubLObject ir_cache_set_database(SubLObject ir_cache, SubLObject database) {
        rplacd(ir_cache, database);
        return NIL;
    }

    public static final SubLObject ir_cache_lookup(SubLObject key, SubLObject ir_cache) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject value = gethash(key, ir_cache_database(ir_cache), NIL);
                SubLObject found = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(value, found);
            }
        }
    }

    public static final SubLObject ir_cache_store(SubLObject key, SubLObject ir_cache, SubLObject value) {
        return sethash(key, ir_cache.rest(), value);
    }

    public static final SubLObject ir_cache_values(SubLObject ir_cache) {
        return hash_table_utilities.get_table_values(ir_cache_database(ir_cache));
    }

    public static final SubLObject ir_cache_initialized_p(SubLObject ir_cache) {
        {
            SubLObject database = ir_cache_database(ir_cache);
            return makeBoolean(database.isHashtable() && (NIL == hash_table_utilities.hash_table_empty_p(database)));
        }
    }

    /**
     * Populate IR-CACHE from FILENAME
     */
    public static final SubLObject ir_initialize_cache(SubLObject filename, SubLObject ir_cache, SubLObject test, SubLObject key_preprocessor) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key_preprocessor == UNPROVIDED) {
            key_preprocessor = symbol_function(IDENTITY);
        }
        SubLSystemTrampolineFile.checkType(filename, STRINGP);
        if (NIL == Filesys.probe_file(filename)) {
            return NIL;
        }
        {
            SubLObject database = NIL;
            SubLObject cache_items = NIL;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt82$Unable_to_open__S, filename);
                }
                {
                    SubLObject stream_4 = stream;
                    SubLObject cache_item = NIL;
                    while ($EOF != cache_item) {
                        cache_item = read(stream_4, NIL, $EOF, UNPROVIDED);
                        if ($EOF != cache_item) {
                            cache_items = cons(cache_item, cache_items);
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
            if (NIL != cache_items) {
                database = make_hash_table(multiply(TWO_INTEGER, length(cache_items)), test, UNPROVIDED);
                ir_cache_set_database(ir_cache, database);
                {
                    SubLObject cdolist_list_var = cache_items;
                    SubLObject cache_item = NIL;
                    for (cache_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cache_item = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cache_item;
                            SubLObject current = datum;
                            SubLObject input_items = NIL;
                            SubLObject result_items = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt84);
                            input_items = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt84);
                            result_items = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject cdolist_list_var_5 = input_items;
                                    SubLObject input_item = NIL;
                                    for (input_item = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , input_item = cdolist_list_var_5.first()) {
                                        {
                                            SubLObject key = funcall(key_preprocessor, input_item);
                                            ir_cache_store(key, ir_cache, result_items);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt84);
                            }
                        }
                    }
                }
            }
            return list_utilities.sublisp_boolean(ir_cache_database(ir_cache));
        }
    }





    /**
     * Parse STRING using the IR parse query cache.  Return 2 values: a list of CycL
     * sentences for the parse, and a boolean indicating whether STRING was present
     * as a key.
     */
    public static final SubLObject ir_parse_query_cache_lookup(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(string, STRINGP);
            if (NIL != $ir_parse_query_cache$.getGlobalValue()) {
                thread.resetMultipleValues();
                {
                    SubLObject value = ir_cache_lookup(string, $ir_parse_query_cache$.getGlobalValue());
                    SubLObject found = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(copy_tree(value), found);
                }
            }
            return values(NIL, NIL);
        }
    }

    /**
     * Populate IR parse query cache from FILENAME, unless it's already initialzed and
     * FORCE is NIL.
     */
    public static final SubLObject ir_initialize_parse_query_cache(SubLObject filename, SubLObject force) {
        if (force == UNPROVIDED) {
            force = NIL;
        }
        if (!((NIL != $ir_parse_query_initialized_p$.getGlobalValue()) && (NIL == force))) {
            {
                SubLObject result = ir_initialize_cache(filename, $ir_parse_query_cache$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
                $ir_parse_query_initialized_p$.setGlobalValue(T);
                return result;
            }
        }
        return NIL;
    }

    /**
     * Parse STRING using the IR parse caption cache.
     */
    public static final SubLObject ir_parse_caption_cache_lookup(SubLObject string) {
        SubLSystemTrampolineFile.checkType(string, STRINGP);
        return NIL;
    }





    /**
     * Retrieve the answers to CANONICALIZED-QUERY using the IR result supports cache.
     * Return 2 values: a list of HL supports for the answer, and a boolean indicating
     * whether CANONICALIZED-QUERY was present as a key.
     */
    public static final SubLObject ir_query_result_lookup(SubLObject canonicalized_query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $ir_query_result_supports$.getGlobalValue()) {
                thread.resetMultipleValues();
                {
                    SubLObject value = ir_cache_lookup(canonicalized_query, $ir_query_result_supports$.getGlobalValue());
                    SubLObject found = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(copy_tree(value), found);
                }
            }
            return values(NIL, NIL);
        }
    }

    /**
     * Populate IR query result supports cache from FILENAME, unless it's already initialzed and
     * FORCE is NIL.
     */
    public static final SubLObject ir_initialize_query_result_supports(SubLObject filename, SubLObject force) {
        if (force == UNPROVIDED) {
            force = NIL;
        }
        if (!((NIL != $ir_query_result_supports_initialized_p$.getGlobalValue()) && (NIL == force))) {
            {
                SubLObject result = ir_initialize_cache(filename, $ir_query_result_supports$.getGlobalValue(), symbol_function(EQUAL), symbol_function(IR_CANONICALIZE_QUERY));
                $ir_query_result_supports_initialized_p$.setGlobalValue(T);
                return result;
            }
        }
        return NIL;
    }

    /**
     * Returns a DNF representation of QUERY (minus the variable bindings) for the
     * purpose of successful #'equal comparison to other queries that are equivalent
     * save for maybe literal order and variable names.
     */
    public static final SubLObject ir_canonicalize_query(SubLObject query) {
        SubLSystemTrampolineFile.checkType(query, $sym92$EL_SENTENCE_ASKABLE_);
        {
            SubLObject canonical_forms = czer_main.canonicalize_query(query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = canonical_forms;
            SubLObject form = NIL;
            for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                result = cons(form.first(), result);
            }
            return nreverse(result);
        }
    }





    /**
     * Retrieve the answers to CANONICALIZED-QUERY using the IR result mts cache.
     * Return 2 values: a list of image mts for the answer, and a boolean value
     * indicating whether CANONICALIZED-QUERY was present as a key.
     */
    public static final SubLObject ir_query_result_mt_lookup(SubLObject canonicalized_query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $ir_query_result_mts$.getGlobalValue()) {
                thread.resetMultipleValues();
                {
                    SubLObject value = ir_cache_lookup(canonicalized_query, $ir_query_result_mts$.getGlobalValue());
                    SubLObject found = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(copy_tree(value), found);
                }
            }
            return values(NIL, NIL);
        }
    }

    /**
     * Populate IR query result mts cache from FILENAME, unless it's already
     * initialized and FORCE is NIL.
     */
    public static final SubLObject ir_initialize_query_result_mts(SubLObject filename, SubLObject force) {
        if (force == UNPROVIDED) {
            force = NIL;
        }
        if (!((NIL != $ir_query_result_mts_initialized_p$.getGlobalValue()) && (NIL == force))) {
            {
                SubLObject result = ir_initialize_cache(filename, $ir_query_result_mts$.getGlobalValue(), symbol_function(EQUAL), symbol_function(IR_CANONICALIZE_QUERY));
                $ir_query_result_mts_initialized_p$.setGlobalValue(T);
                return result;
            }
        }
        return NIL;
    }

    /**
     * Runs all the parsing and query tests for the Information Retrieval prototype.
     */
    public static final SubLObject run_all_ir_tests() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = $SUCCESS;
                ir_test_init();
                thread.resetMultipleValues();
                {
                    SubLObject successes = run_ir_parse_tests(UNPROVIDED);
                    SubLObject failures = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (failures.numG(ZERO_INTEGER)) {
                        result = $FAILURE;
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject successes = run_ir_query_mt_tests(UNPROVIDED);
                    SubLObject failures = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (failures.numG(ZERO_INTEGER)) {
                        result = $FAILURE;
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject run_one_ir_test(SubLObject test, SubLObject query_string) {
        ir_test_init();
        {
            SubLObject pcase_var = test;
            if (pcase_var.eql($IR_PARSING)) {
                return run_one_ir_parse_test(query_string);
            } else
                if (pcase_var.eql($IR_MTS)) {
                    return run_one_ir_query_mt_test(query_string);
                } else
                    if (pcase_var.eql($IR_SUPPORTS)) {
                        return run_one_ir_query_support_test(query_string);
                    } else {
                        Errors.error($str_alt101$Unknown_test_type__A, test);
                    }


        }
        return NIL;
    }

    public static final SubLObject ir_test_init() {
        ir_init(operation_communication.the_cyclist());
        ir_set_focus_predicate($list_alt102);
        ir_initialize_parse_query_cache(file_utilities.cyc_home_filename($list_alt103, $str_alt104$ir_parse_query_tests, $$$lisp), UNPROVIDED);
        ir_initialize_query_result_mts(file_utilities.cyc_home_filename($list_alt103, $str_alt106$ir_query_context_tests, $$$lisp), UNPROVIDED);
        return NIL;
    }

    /**
     * Runs the parsing tests for the Information Retrieval prototype as specified by
     * IR-PARSE-TESTS.  If IR-PARSE-TESTS is NIL, runs all known tests.  Outputs
     * results to *STANDARD-OUTPUT*.  Returns 2 values: The number of successes,
     * and the number of failures.
     */
    public static final SubLObject run_ir_parse_tests(SubLObject ir_parse_tests) {
        if (ir_parse_tests == UNPROVIDED) {
            ir_parse_tests = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ir_test_init();
            if (NIL == ir_parse_tests) {
                ir_parse_tests = ir_query_test_cases_from_cache();
            }
            {
                SubLObject success_count = ZERO_INTEGER;
                SubLObject failure_count = ZERO_INTEGER;
                SubLObject cdolist_list_var = ir_parse_tests;
                SubLObject ir_parse_test = NIL;
                for (ir_parse_test = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ir_parse_test = cdolist_list_var.first()) {
                    if (NIL != run_ir_parse_test(ir_parse_test)) {
                        success_count = add(success_count, ONE_INTEGER);
                    } else {
                        failure_count = add(failure_count, ONE_INTEGER);
                    }
                }
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt107$__Parse_test_summary___A_sucesses, success_count, failure_count);
                return values(success_count, failure_count);
            }
        }
    }

    /**
     * Runs a single test of parsing QUERY-STRING.  Outputs results to *STANDARD-OUTPUT* and
     * returns T or NIL for success or failure.
     */
    public static final SubLObject run_one_ir_parse_test(SubLObject query_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ir_test_init();
            thread.resetMultipleValues();
            {
                SubLObject expected = ir_parse_query_cache_lookup(query_string);
                SubLObject found = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == found) {
                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt108$No_test_case_known_for__S, query_string);
                    return NIL;
                }
                return run_one_ir_parse_test_int(query_string, expected);
            }
        }
    }

    public static final SubLObject run_ir_parse_test(SubLObject ir_parse_test) {
        {
            SubLObject datum = ir_parse_test;
            SubLObject current = datum;
            SubLObject query_string = NIL;
            SubLObject expected = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt109);
            query_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt109);
            expected = current.first();
            current = current.rest();
            if (NIL == current) {
                return run_one_ir_parse_test_int(query_string, expected);
            } else {
                cdestructuring_bind_error(datum, $list_alt109);
            }
        }
        return NIL;
    }

    public static final SubLObject run_one_ir_parse_test_int(SubLObject query_string, SubLObject expected) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject error = NIL;
                SubLObject result = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject results = ir_parse_query(query_string);
                                    SubLObject missing = ir_parse_missing(results, expected);
                                    SubLObject unexpected = ir_parse_unexpected(results, expected);
                                    if ((NIL != missing) || (NIL != unexpected)) {
                                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt111$___FAILURE__IRT___IR_PARSING__S__, query_string);
                                        {
                                            SubLObject cdolist_list_var = missing;
                                            SubLObject item = NIL;
                                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt112$____Missing___S, item);
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = unexpected;
                                            SubLObject item = NIL;
                                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt113$____Unexpected___S, item);
                                            }
                                        }
                                        result = NIL;
                                    } else {
                                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt114$___SUCCESS__IRT___IR_PARSING__S__, query_string);
                                        result = T;
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
                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt115$___ERROR__IRT___IR_PARSING__S__, query_string);
                }
                return result;
            }
        }
    }

    public static final SubLObject ir_parse_missing(SubLObject results, SubLObject expected) {
        {
            SubLObject missing = NIL;
            SubLObject cdolist_list_var = expected;
            SubLObject query = NIL;
            for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                {
                    SubLObject temp = ir_canonicalize_query(query);
                    if (NIL == find(temp, results, symbol_function(EQUAL), symbol_function(IR_CANONICALIZE_QUERY), UNPROVIDED, UNPROVIDED)) {
                        missing = cons(query, missing);
                    }
                }
            }
            return nreverse(missing);
        }
    }

    public static final SubLObject ir_parse_unexpected(SubLObject results, SubLObject expected) {
        {
            SubLObject unexpected = NIL;
            SubLObject cdolist_list_var = results;
            SubLObject query = NIL;
            for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                {
                    SubLObject temp = ir_canonicalize_query(query);
                    if (NIL == find(temp, expected, symbol_function(EQUAL), symbol_function(IR_CANONICALIZE_QUERY), UNPROVIDED, UNPROVIDED)) {
                        unexpected = cons(query, unexpected);
                    }
                }
            }
            return nreverse(unexpected);
        }
    }

    /**
     * Mt-comparison tests check to see whether expected image mts are retrieved for each
     * query.  Runs the Mt-comparison test cases for inference in the Information Retrieval prototype,
     * as specified by IR-QUERY-TESTS (a list of the form (query-string list-of-parses)).
     * If IR-QUERY-TESTS is NIL, runs all known tests.
     * Reports results to *STANDARD-OUTPUT*.  Returns 2 values: the number of successes
     * and the number of failures.
     */
    public static final SubLObject run_ir_query_mt_tests(SubLObject ir_query_tests) {
        if (ir_query_tests == UNPROVIDED) {
            ir_query_tests = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ir_test_init();
            if (NIL == ir_query_tests) {
                ir_query_tests = ir_query_test_cases_from_cache();
            }
            thread.resetMultipleValues();
            {
                SubLObject success_count = run_ir_query_tests($MTS, ir_query_tests);
                SubLObject failure_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(success_count, failure_count);
            }
        }
    }

    /**
     * Runs a single Mt-comparison test, indicated by QUERY-STRING, for inference in
     * the Information Retrieval prototype.
     * Mt-comparison tests check to see whether expected image mts are retrieved for each
     * query.  Reports results to *STANDARD-OUTPUT*.  Returns T for successful test, NIL for
     * failure or error.
     */
    public static final SubLObject run_one_ir_query_mt_test(SubLObject query_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ir_test_init();
            thread.resetMultipleValues();
            {
                SubLObject raw_parses = ir_parse_query_cache_lookup(query_string);
                SubLObject found = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == found) {
                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt117$No_assumed_parse_found_for__S, query_string);
                    return NIL;
                }
                return run_ir_query_test_int($MTS, raw_parses, query_string);
            }
        }
    }

    /**
     * Supports-comparison tests check to see whether the expected supports are retrieved for each
     * query.
     * Runs the Supports-comparison test cases for inference in the Information Retrieval prototype,
     * as specified by IR-QUERY-TESTS (a list of the form (query-string list-of-parses)).
     * If IR-QUERY-TESTS is NIL, runs all known tests.
     * Reports results to *STANDARD-OUTPUT*.  Returns 2 values: the number of successes
     * and the number of failures.
     */
    public static final SubLObject run_ir_query_support_tests(SubLObject ir_query_tests) {
        if (ir_query_tests == UNPROVIDED) {
            ir_query_tests = NIL;
        }
        ir_test_init();
        if (NIL == ir_query_tests) {
            ir_query_tests = ir_query_test_cases_from_cache();
        }
        return run_ir_query_tests($SUPPORTS, ir_query_tests);
    }

    /**
     * Runs a single Supports-comparison test, indicated by QUERY-STRING, for inference in
     * the Information Retrieval prototype.
     * Supports-comparison tests check to see whether the expected supports are retrieved for each
     * query.  Reports results to *STANDARD-OUTPUT*.  Returns T for successful test, NIL for
     * failure or error.
     */
    public static final SubLObject run_one_ir_query_support_test(SubLObject query_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ir_test_init();
            thread.resetMultipleValues();
            {
                SubLObject raw_parses = ir_parse_query_cache_lookup(query_string);
                SubLObject found = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == found) {
                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt117$No_assumed_parse_found_for__S, query_string);
                    return NIL;
                }
                return run_ir_query_test_int($SUPPORTS, raw_parses, query_string);
            }
        }
    }

    /**
     * Return the standard image demo query used for QUERY-STRING.
     */
    public static final SubLObject ir_query_string_to_standard_query(SubLObject query_string) {
        {
            SubLObject raw_parses = ir_parse_query_cache_lookup(query_string);
            if (NIL != raw_parses) {
                return ir_raw_parses_to_standard_query(raw_parses);
            }
        }
        return NIL;
    }

    /**
     * Return the standard image demo query used for RAW-PARSES.
     */
    public static final SubLObject ir_raw_parses_to_standard_query(SubLObject raw_parses) {
        {
            SubLObject parses = remove(NIL, Mapping.mapcar(symbol_function(INSERT_CONTENT_LITERALS), raw_parses), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject query = (NIL != list_utilities.singletonP(parses)) ? ((SubLObject) (parses.first())) : el_utilities.make_disjunction(parses);
            return query;
        }
    }

    /**
     * Return the standard results from running the image demo QUERY.
     */
    public static final SubLObject ir_standard_query(SubLObject query) {
        return ir_ask_internal(query, $list_alt120, NIL, TEN_INTEGER, TWENTY_INTEGER, NIL);
    }

    /**
     * Return alist of (QUERY-STRING RAW-PARSES) test cases based on the parse query cache.
     */
    public static final SubLObject ir_query_test_cases_from_cache() {
        return ir_cache_values($ir_parse_query_cache$.getGlobalValue());
    }

    /**
     * Run all the IR query tests in IR-QUERY-TESTS.
     * Return 2 values, SUCCESS-COUNT and FAILURE-COUNT, which are the numbers of successes and failures.
     */
    public static final SubLObject run_ir_query_tests(SubLObject type, SubLObject ir_query_tests) {
        if (ir_query_tests == UNPROVIDED) {
            ir_query_tests = ir_query_test_cases_from_cache();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject success_count = ZERO_INTEGER;
                SubLObject failure_count = ZERO_INTEGER;
                SubLObject cdolist_list_var = ir_query_tests;
                SubLObject ir_query_test = NIL;
                for (ir_query_test = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ir_query_test = cdolist_list_var.first()) {
                    {
                        SubLObject datum = ir_query_test;
                        SubLObject current = datum;
                        SubLObject query_string = NIL;
                        SubLObject raw_parses = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt121);
                        query_string = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt121);
                        raw_parses = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != run_ir_query_test_int(type, raw_parses, query_string)) {
                                success_count = add(success_count, ONE_INTEGER);
                            } else {
                                failure_count = add(failure_count, ONE_INTEGER);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt121);
                        }
                    }
                }
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt122$__Query_test_summary___A_comparis, new SubLObject[]{ type == $MTS ? ((SubLObject) ($$$Mts)) : type == $SUPPORTS ? ((SubLObject) ($$$Supports)) : $$$Unknown, success_count, failure_count });
                return values(success_count, failure_count);
            }
        }
    }

    public static final SubLObject run_ir_query_test_int(SubLObject type, SubLObject raw_parses, SubLObject query_string) {
        if (query_string == UNPROVIDED) {
            query_string = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject error = NIL;
                SubLObject result = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject query = ir_raw_parses_to_standard_query(raw_parses);
                                    SubLObject answers = ir_standard_query(query);
                                    SubLObject pcase_var = type;
                                    if (pcase_var.eql($MTS)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject expected_mts = ir_query_result_mt_lookup(ir_canonicalize_query(query));
                                            SubLObject found = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != found) {
                                                {
                                                    SubLObject answer_mts = Mapping.mapcar(symbol_function(EXTRACT_CONTEXT), Mapping.mapcar(symbol_function(FIRST), answers));
                                                    SubLObject missing_mts = ir_query_missing(answer_mts, expected_mts, symbol_function(EQL));
                                                    SubLObject unexpected_mts = ir_query_unexpected(answer_mts, expected_mts, symbol_function(EQL));
                                                    if (NIL != query_string) {
                                                        if ((NIL != missing_mts) || (NIL != unexpected_mts)) {
                                                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt128$___FAILURE__IRT___IR_MTS__S__, query_string);
                                                            {
                                                                SubLObject cdolist_list_var = missing_mts;
                                                                SubLObject item = NIL;
                                                                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt129$____MISSING___S, item);
                                                                }
                                                            }
                                                            {
                                                                SubLObject cdolist_list_var = unexpected_mts;
                                                                SubLObject item = NIL;
                                                                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt130$____UNEXPECTED___S, item);
                                                                }
                                                            }
                                                            result = NIL;
                                                        } else {
                                                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt131$___SUCCESS__IRT___IR_MTS__S__, query_string);
                                                            result = T;
                                                        }
                                                    }
                                                }
                                            } else {
                                                format(T, $str_alt132$___ERROR__IRT___MTS__S___No_expec, query_string);
                                                result = NIL;
                                            }
                                        }
                                    } else
                                        if (pcase_var.eql($SUPPORTS)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject expected = ir_query_result_lookup(ir_canonicalize_query(query));
                                                SubLObject found = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != found) {
                                                    {
                                                        SubLObject answer_supports = Mapping.mapcar(symbol_function(SECOND), answers);
                                                        SubLObject missing = ir_query_missing(answer_supports, expected, symbol_function(IR_EQUIVALENT_ANSWERS));
                                                        SubLObject unexpected = ir_query_unexpected(answer_supports, expected, symbol_function(IR_EQUIVALENT_ANSWERS));
                                                        if (NIL != query_string) {
                                                            if ((NIL != missing) || (NIL != unexpected)) {
                                                                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt135$___FAILURE__IRT___IR_SUPPORTS__S_, query_string);
                                                                {
                                                                    SubLObject cdolist_list_var = missing;
                                                                    SubLObject item = NIL;
                                                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt129$____MISSING___S, item);
                                                                    }
                                                                }
                                                                {
                                                                    SubLObject cdolist_list_var = unexpected;
                                                                    SubLObject item = NIL;
                                                                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt130$____UNEXPECTED___S, item);
                                                                    }
                                                                }
                                                                result = NIL;
                                                            } else {
                                                                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt136$___SUCCESS__IRT___IR_SUPPORTS__S_, query_string);
                                                                result = T;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    format(T, $str_alt137$_ERROR__IRT___IR_SUPPORTS__S___No, query_string);
                                                    result = NIL;
                                                }
                                            }
                                        }

                                }
                                if (NIL != error) {
                                    {
                                        SubLObject pcase_var = type;
                                        if (pcase_var.eql($MTS)) {
                                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt138$___ERROR__IRT___IR_MTS__S__, error);
                                        } else
                                            if (pcase_var.eql($SUPPORTS)) {
                                                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt139$___ERROR__IRT___IR_SUPPORTS__S__, error);
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
                return result;
            }
        }
    }

    public static final SubLObject ir_query_missing(SubLObject answers, SubLObject expected, SubLObject comparison_func) {
        {
            SubLObject missing = NIL;
            SubLObject cdolist_list_var = expected;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL == find(item, answers, comparison_func, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    missing = cons(item, missing);
                }
            }
            return missing;
        }
    }

    public static final SubLObject ir_query_unexpected(SubLObject answers, SubLObject expected, SubLObject comparison_func) {
        {
            SubLObject unexpected = NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL == find(item, expected, comparison_func, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    unexpected = cons(item, unexpected);
                }
            }
            return unexpected;
        }
    }

    public static final SubLObject ir_equivalent_answers(SubLObject item1, SubLObject item2) {
        if (!length(item1).numE(length(item2))) {
            return NIL;
        } else {
            return ir_equivalent_answers_int(item1, item2);
        }
    }

    public static final SubLObject ir_equivalent_answers_int(SubLObject item1, SubLObject item2) {
        {
            SubLObject answer1 = ir_standardize_answer(item1);
            SubLObject answer2 = ir_standardize_answer(item2);
            SubLObject missing = NIL;
            if (NIL == missing) {
                {
                    SubLObject csome_list_var = answer1;
                    SubLObject support = NIL;
                    for (support = csome_list_var.first(); !((NIL != missing) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
                        if (NIL == find(support, answer2, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            missing = support;
                        }
                    }
                }
            }
            if (NIL != missing) {
                return NIL;
            }
            if (NIL == missing) {
                {
                    SubLObject csome_list_var = answer2;
                    SubLObject support = NIL;
                    for (support = csome_list_var.first(); !((NIL != missing) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
                        if (NIL == find(support, answer1, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            missing = support;
                        }
                    }
                }
            }
            if (NIL != missing) {
                return NIL;
            }
            return T;
        }
    }

    public static final SubLObject ir_standardize_answer(SubLObject v_answer) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_answer;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL != arguments.hl_support_p(item)) {
                    {
                        SubLObject datum = item;
                        SubLObject current = datum;
                        SubLObject module = NIL;
                        SubLObject sentence = NIL;
                        SubLObject mt = NIL;
                        SubLObject tv = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        module = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        sentence = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt140);
                        tv = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            result = cons(list(module, cycl_utilities.hl_to_el(sentence), mt, tv), result);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt140);
                        }
                    }
                } else
                    if (NIL != assertion_handles.assertion_p(item)) {
                        {
                            SubLObject sentence = uncanonicalizer.assertion_el_formula(item);
                            SubLObject mt = assertions_high.assertion_mt(item);
                            SubLObject tv = assertions_high.cyc_assertion_tv(item);
                            result = cons(list($ASSERTION, sentence, mt, tv), result);
                        }
                    } else {
                        Errors.error($str_alt142$Unexpected_item_in_answer___S, item);
                    }

            }
            return result;
        }
    }

    public static final SubLObject declare_image_demo_internals_file() {
        declareFunction("ir_reinit", "IR-REINIT", 0, 0, false);
        declareFunction("make_ir_state_vector", "MAKE-IR-STATE-VECTOR", 0, 1, false);
        declareFunction("get_ir_state", "GET-IR-STATE", 1, 0, false);
        declareFunction("add_ir_vector", "ADD-IR-VECTOR", 1, 0, false);
        declareFunction("ir_value", "IR-VALUE", 2, 0, false);
        declareFunction("change_ir_value", "CHANGE-IR-VALUE", 2, 2, false);
        declareFunction("reset_ir_state", "RESET-IR-STATE", 1, 0, false);
        declareFunction("return_ir_state", "RETURN-IR-STATE", 1, 0, false);
        declareFunction("print_ir_state", "PRINT-IR-STATE", 1, 0, false);
        declareFunction("clear_ir_state", "CLEAR-IR-STATE", 1, 2, false);
        declareFunction("blast_ir_state", "BLAST-IR-STATE", 0, 0, false);
        declareFunction("ir_init", "IR-INIT", 1, 0, false);
        declareFunction("ir_clear_data", "IR-CLEAR-DATA", 0, 0, false);
        declareFunction("ir_debug", "IR-DEBUG", 1, 0, false);
        declareFunction("ir_no_debug", "IR-NO-DEBUG", 1, 0, false);
        declareFunction("pit_caption", "PIT-CAPTION", 1, 0, false);
        declareFunction("isa_var_literalP", "ISA-VAR-LITERAL?", 1, 0, false);
        declareFunction("gather_isa_content_variables", "GATHER-ISA-CONTENT-VARIABLES", 1, 0, false);
        declareFunction("extract_variables", "EXTRACT-VARIABLES", 1, 0, false);
        declareFunction("variable_type_constraints", "VARIABLE-TYPE-CONSTRAINTS", 2, 0, false);
        declareFunction("content_variables", "CONTENT-VARIABLES", 3, 0, false);
        declareFunction("content_constantP", "CONTENT-CONSTANT?", 1, 0, false);
        declareFunction("content_constants", "CONTENT-CONSTANTS", 1, 0, false);
        declareFunction("extract_content_objects", "EXTRACT-CONTENT-OBJECTS", 3, 0, false);
        declareFunction("temporally_qualify_literalP", "TEMPORALLY-QUALIFY-LITERAL?", 1, 0, false);
        declareFunction("ir_temporally_convert_pos_lit", "IR-TEMPORALLY-CONVERT-POS-LIT", 1, 0, false);
        declareFunction("ir_temporally_convert_neg_lit", "IR-TEMPORALLY-CONVERT-NEG-LIT", 1, 0, false);
        declareFunction("insert_content_literals", "INSERT-CONTENT-LITERALS", 1, 0, false);
        declareFunction("ir_clear_results_table", "IR-CLEAR-RESULTS-TABLE", 0, 0, false);
        declareFunction("ir_clear_utility_tables", "IR-CLEAR-UTILITY-TABLES", 0, 0, false);
        declareFunction("ir_types_from_keys", "IR-TYPES-FROM-KEYS", 1, 0, false);
        declareFunction("ir_ask_query", "IR-ASK-QUERY", 1, 0, false);
        declareFunction("ir_set_psc", "IR-SET-PSC", 1, 0, false);
        declareFunction("ir_set_focus_predicate", "IR-SET-FOCUS-PREDICATE", 1, 0, false);
        declareFunction("extract_context_test", "EXTRACT-CONTEXT-TEST", 1, 0, false);
        declareFunction("extract_context", "EXTRACT-CONTEXT", 1, 0, false);
        declareFunction("ir_psc_ask", "IR-PSC-ASK", 2, 0, false);
        declareFunction("ir_ask_internal", "IR-ASK-INTERNAL", 2, 4, false);
        declareFunction("ir_generate_parses", "IR-GENERATE-PARSES", 1, 0, false);
        declareFunction("ir_iterative_forward_propagate", "IR-ITERATIVE-FORWARD-PROPAGATE", 1, 5, false);
        declareFunction("ir_clear_nl_caches", "IR-CLEAR-NL-CACHES", 0, 0, false);
        declareFunction("ir_parse_query", "IR-PARSE-QUERY", 1, 0, false);
        declareFunction("ir_parse_caption", "IR-PARSE-CAPTION", 1, 0, false);
        declareFunction("make_ir_cache", "MAKE-IR-CACHE", 1, 1, false);
        declareFunction("ir_cache_name", "IR-CACHE-NAME", 1, 0, false);
        declareFunction("ir_cache_database", "IR-CACHE-DATABASE", 1, 0, false);
        declareFunction("ir_cache_set_database", "IR-CACHE-SET-DATABASE", 2, 0, false);
        declareFunction("ir_cache_lookup", "IR-CACHE-LOOKUP", 2, 0, false);
        declareFunction("ir_cache_store", "IR-CACHE-STORE", 3, 0, false);
        declareFunction("ir_cache_values", "IR-CACHE-VALUES", 1, 0, false);
        declareFunction("ir_cache_initialized_p", "IR-CACHE-INITIALIZED-P", 1, 0, false);
        declareFunction("ir_initialize_cache", "IR-INITIALIZE-CACHE", 2, 2, false);
        declareFunction("ir_parse_query_cache_lookup", "IR-PARSE-QUERY-CACHE-LOOKUP", 1, 0, false);
        declareFunction("ir_initialize_parse_query_cache", "IR-INITIALIZE-PARSE-QUERY-CACHE", 1, 1, false);
        declareFunction("ir_parse_caption_cache_lookup", "IR-PARSE-CAPTION-CACHE-LOOKUP", 1, 0, false);
        declareFunction("ir_query_result_lookup", "IR-QUERY-RESULT-LOOKUP", 1, 0, false);
        declareFunction("ir_initialize_query_result_supports", "IR-INITIALIZE-QUERY-RESULT-SUPPORTS", 1, 1, false);
        declareFunction("ir_canonicalize_query", "IR-CANONICALIZE-QUERY", 1, 0, false);
        declareFunction("ir_query_result_mt_lookup", "IR-QUERY-RESULT-MT-LOOKUP", 1, 0, false);
        declareFunction("ir_initialize_query_result_mts", "IR-INITIALIZE-QUERY-RESULT-MTS", 1, 1, false);
        declareFunction("run_all_ir_tests", "RUN-ALL-IR-TESTS", 0, 0, false);
        declareFunction("run_one_ir_test", "RUN-ONE-IR-TEST", 2, 0, false);
        declareFunction("ir_test_init", "IR-TEST-INIT", 0, 0, false);
        declareFunction("run_ir_parse_tests", "RUN-IR-PARSE-TESTS", 0, 1, false);
        declareFunction("run_one_ir_parse_test", "RUN-ONE-IR-PARSE-TEST", 1, 0, false);
        declareFunction("run_ir_parse_test", "RUN-IR-PARSE-TEST", 1, 0, false);
        declareFunction("run_one_ir_parse_test_int", "RUN-ONE-IR-PARSE-TEST-INT", 2, 0, false);
        declareFunction("ir_parse_missing", "IR-PARSE-MISSING", 2, 0, false);
        declareFunction("ir_parse_unexpected", "IR-PARSE-UNEXPECTED", 2, 0, false);
        declareFunction("run_ir_query_mt_tests", "RUN-IR-QUERY-MT-TESTS", 0, 1, false);
        declareFunction("run_one_ir_query_mt_test", "RUN-ONE-IR-QUERY-MT-TEST", 1, 0, false);
        declareFunction("run_ir_query_support_tests", "RUN-IR-QUERY-SUPPORT-TESTS", 0, 1, false);
        declareFunction("run_one_ir_query_support_test", "RUN-ONE-IR-QUERY-SUPPORT-TEST", 1, 0, false);
        declareFunction("ir_query_string_to_standard_query", "IR-QUERY-STRING-TO-STANDARD-QUERY", 1, 0, false);
        declareFunction("ir_raw_parses_to_standard_query", "IR-RAW-PARSES-TO-STANDARD-QUERY", 1, 0, false);
        declareFunction("ir_standard_query", "IR-STANDARD-QUERY", 1, 0, false);
        declareFunction("ir_query_test_cases_from_cache", "IR-QUERY-TEST-CASES-FROM-CACHE", 0, 0, false);
        declareFunction("run_ir_query_tests", "RUN-IR-QUERY-TESTS", 1, 1, false);
        declareFunction("run_ir_query_test_int", "RUN-IR-QUERY-TEST-INT", 2, 1, false);
        declareFunction("ir_query_missing", "IR-QUERY-MISSING", 3, 0, false);
        declareFunction("ir_query_unexpected", "IR-QUERY-UNEXPECTED", 3, 0, false);
        declareFunction("ir_equivalent_answers", "IR-EQUIVALENT-ANSWERS", 2, 0, false);
        declareFunction("ir_equivalent_answers_int", "IR-EQUIVALENT-ANSWERS-INT", 2, 0, false);
        declareFunction("ir_standardize_answer", "IR-STANDARDIZE-ANSWER", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_image_demo_internals_file() {
        deflexical("*IR-STATE*", NIL != boundp($ir_state$) ? ((SubLObject) ($ir_state$.getGlobalValue())) : NIL);
        defparameter("*IR-STATE-KEYS*", $list_alt1);
        defparameter("*IR-STATE-DEFAULTS*", $list_alt2);
        defparameter("*IR-CACHED-KEYS*", NIL);
        defparameter("*IR-QUERY-FUNCTION*", IR_PSC_ASK);
        defparameter("*IR-STATE-VECTOR-LENGTH*", $int$100);
        defparameter("*IR-TYPES*", $list_alt5);
        defconstant("*IR-USE-PARSE-CACHES*", T);
        deflexical("*IR-PARSE-QUERY-CACHE*", NIL != boundp($ir_parse_query_cache$) ? ((SubLObject) ($ir_parse_query_cache$.getGlobalValue())) : make_ir_cache($$$IR_Parse_Query_Cache, UNPROVIDED));
        deflexical("*IR-PARSE-QUERY-INITIALIZED-P*", NIL != boundp($ir_parse_query_initialized_p$) ? ((SubLObject) ($ir_parse_query_initialized_p$.getGlobalValue())) : NIL);
        deflexical("*IR-QUERY-RESULT-SUPPORTS*", NIL != boundp($ir_query_result_supports$) ? ((SubLObject) ($ir_query_result_supports$.getGlobalValue())) : make_ir_cache($$$IR_Query_Result_Supports, UNPROVIDED));
        deflexical("*IR-QUERY-RESULT-SUPPORTS-INITIALIZED-P*", NIL != boundp($ir_query_result_supports_initialized_p$) ? ((SubLObject) ($ir_query_result_supports_initialized_p$.getGlobalValue())) : NIL);
        deflexical("*IR-QUERY-RESULT-MTS*", NIL != boundp($ir_query_result_mts$) ? ((SubLObject) ($ir_query_result_mts$.getGlobalValue())) : make_ir_cache($$$IR_Query_Result_Mts, UNPROVIDED));
        deflexical("*IR-QUERY-RESULT-MTS-INITIALIZED-P*", NIL != boundp($ir_query_result_mts_initialized_p$) ? ((SubLObject) ($ir_query_result_mts_initialized_p$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static final SubLObject setup_image_demo_internals_file() {
                subl_macro_promotions.declare_defglobal($ir_state$);
        subl_macro_promotions.declare_defglobal($ir_parse_query_cache$);
        subl_macro_promotions.declare_defglobal($ir_parse_query_initialized_p$);
        subl_macro_promotions.declare_defglobal($ir_query_result_supports$);
        subl_macro_promotions.declare_defglobal($ir_query_result_supports_initialized_p$);
        subl_macro_promotions.declare_defglobal($ir_query_result_mts$);
        subl_macro_promotions.declare_defglobal($ir_query_result_mts_initialized_p$);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $ir_state$ = makeSymbol("*IR-STATE*");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ cons(makeKeyword("LAST-INPUT-STRING"), ONE_INTEGER), cons(makeKeyword("LAST-PARSES"), TWO_INTEGER), cons(makeKeyword("LAST-INPUT-CYCL"), THREE_INTEGER), cons(makeKeyword("LAST-INPUT-ENGLISH"), FOUR_INTEGER), cons(makeKeyword("INLINE-IMAGES"), FIVE_INTEGER), cons(makeKeyword("INCLUDE-JUSTIFICATIONS"), SIX_INTEGER), cons(makeKeyword("SHOW-PROPRIETARY-IMAGES"), SEVEN_INTEGER), cons(makeKeyword("PARTIAL-SEMANTICS"), EIGHT_INTEGER), cons(makeKeyword("PARSER-TIME-LIMIT"), NINE_INTEGER), cons(makeKeyword("SEMANTICS-TIME-LIMIT"), TEN_INTEGER), cons(makeKeyword("OBJECT-KEYS"), ELEVEN_INTEGER), cons(makeKeyword("PSC"), TWELVE_INTEGER), cons(makeKeyword("MT"), THIRTEEN_INTEGER), cons(makeKeyword("USE-ISA-VAR-LITS"), FOURTEEN_INTEGER), cons(makeKeyword("DEBUG"), FIFTEEN_INTEGER), cons(makeKeyword("TEST-PARSE"), SIXTEEN_INTEGER), cons(makeKeyword("BACKCHAIN"), SEVENTEEN_INTEGER), cons(makeKeyword("NUMBER"), EIGHTEEN_INTEGER), cons($TIME, NINETEEN_INTEGER), cons(makeKeyword("DEPTH"), TWENTY_INTEGER), cons(makeKeyword("MINIMUM-BACKCHAIN-TIME"), makeInteger(21)), cons(makeKeyword("ELAPSED-TIME"), makeInteger(22)), cons(makeKeyword("RETRIEVAL-METHOD"), makeInteger(23)), cons($MODE, makeInteger(24)), cons(makeKeyword("RESULTS-TABLE"), makeInteger(25)), cons(makeKeyword("QUERY-PARSING-FUNCTION"), makeInteger(26)), cons(makeKeyword("TOP-SOURCE"), makeInteger(27)), cons(makeKeyword("BOTTOM-LEFT-SOURCE"), makeInteger(28)), cons(makeKeyword("BOTTOM-RIGHT-SOURCE"), makeInteger(29)), cons(makeKeyword("FLOATING-SOURCE"), makeInteger(30)), cons(makeKeyword("MESSAGE"), makeInteger(31)), cons(makeKeyword("STANDARD-BG-COLOR"), makeInteger(32)), cons(makeKeyword("ALT-BG-COLOR"), makeInteger(33)), cons(makeKeyword("MESSAGE-COLOR"), makeInteger(34)), cons(makeKeyword("STARTUP-MESSAGE"), makeInteger(35)), cons(makeKeyword("CAPTION-PARSING-FUNCTION"), makeInteger(36)), cons(makeKeyword("SHOW-ENGLISH"), makeInteger(37)), cons(makeKeyword("SHOW-CYCL"), makeInteger(38)), cons(makeKeyword("SHOW-CAPTION"), makeInteger(39)), cons(makeKeyword("UTILITY-TABLE-1"), makeInteger(40)), cons(makeKeyword("INDENT-QUANTUM"), makeInteger(41)), cons(makeKeyword("GENERAL-PSC"), makeInteger(42)), cons(makeKeyword("FOCUS-PREDICATE"), makeInteger(43)), cons(makeKeyword("ANNOTATE-JUSTIFICATION"), makeInteger(44)), cons(makeKeyword("MESSAGE-PAGE-MESSAGE"), makeInteger(45)), cons(makeKeyword("USE-FLOATING-PAGE"), makeInteger(46)), cons(makeKeyword("GROUP-PLURALS"), makeInteger(47)), cons(makeKeyword("FAILURE-REASON"), makeInteger(48)) });

    static private final SubLList $list_alt2 = list(new SubLObject[]{ cons(makeKeyword("LAST-INPUT-STRING"), makeString("a girl hugging a goat")), cons(makeKeyword("INLINE-IMAGES"), T), cons(makeKeyword("INCLUDE-JUSTIFICATIONS"), T), list(makeKeyword("OBJECT-KEYS"), makeKeyword("IMAGE")), cons(makeKeyword("PSC"), constant_handles.reader_make_constant_shell(makeString("IR-Prototype-PSC"))), list(makeKeyword("TEST-PARSE"), constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?SUBJECT"), constant_handles.reader_make_constant_shell(makeString("FemaleChild"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?ACTION"), constant_handles.reader_make_constant_shell(makeString("Hugging"))), list(constant_handles.reader_make_constant_shell(makeString("performedBy")), makeSymbol("?ACTION"), makeSymbol("?SUBJECT")), list(constant_handles.reader_make_constant_shell(makeString("objectActedOn")), makeSymbol("?ACTION"), makeSymbol("?OBJECT")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJECT"), constant_handles.reader_make_constant_shell(makeString("Goat")))), cons(makeKeyword("NUMBER"), TEN_INTEGER), cons($TIME, TWENTY_INTEGER), cons(makeKeyword("MINIMUM-BACKCHAIN-TIME"), FIVE_INTEGER), cons(makeKeyword("ELAPSED-TIME"), ZERO_INTEGER), cons($MODE, makeKeyword("QUERY")), cons(makeKeyword("QUERY-PARSING-FUNCTION"), makeSymbol("IR-PARSE-QUERY")), cons(makeKeyword("CAPTION-PARSING-FUNCTION"), makeSymbol("IR-PARSE-CAPTION")), cons(makeKeyword("STARTUP-MESSAGE"), makeString("Welcome to the Cyc Information Retrieval prototype.")), cons(makeKeyword("STANDARD-BG-COLOR"), makeKeyword("LIGHT-GRAY")), cons(makeKeyword("ALT-BG-COLOR"), makeKeyword("GREEN")), cons(makeKeyword("MESSAGE-COLOR"), $BLUE), cons(makeKeyword("SHOW-ENGLISH"), T), cons(makeKeyword("SHOW-CYCL"), T), cons(makeKeyword("SHOW-CAPTION"), T), cons(makeKeyword("INDENT-QUANTUM"), TWO_INTEGER), cons(makeKeyword("GENERAL-PSC"), constant_handles.reader_make_constant_shell(makeString("IR-Prototype-PSC"))), cons(makeKeyword("ANNOTATE-JUSTIFICATION"), T), cons(makeKeyword("GROUP-PLURALS"), T) });

    private static final SubLSymbol IR_PSC_ASK = makeSymbol("IR-PSC-ASK");



    static private final SubLList $list_alt5 = list(list(makeKeyword("IMAGE"), constant_handles.reader_make_constant_shell(makeString("mtImageDepicts")), constant_handles.reader_make_constant_shell(makeString("ImageMicrotheory")), list(constant_handles.reader_make_constant_shell(makeString("SpatialThing"))), makeString("image"), makeSymbol("IR-PRESENT-IMAGE"), list(constant_handles.reader_make_constant_shell(makeString("MtSpace")), constant_handles.reader_make_constant_shell(makeString("PSC-ImageQuery")), constant_handles.reader_make_constant_shell(makeString("AnytimePSC")))), list($TEXT, constant_handles.reader_make_constant_shell(makeString("documentMentions")), constant_handles.reader_make_constant_shell(makeString("TextMicrotheory")), list(constant_handles.reader_make_constant_shell(makeString("Individual"))), makeString("text document"), makeSymbol("IR-PRESENT-DOCUMENT"), constant_handles.reader_make_constant_shell(makeString("IR-Text-PSC"))), list(makeKeyword("WEB-PAGE"), constant_handles.reader_make_constant_shell(makeString("webPageInfoAbout")), constant_handles.reader_make_constant_shell(makeString("WebPageMicrotheory")), list(constant_handles.reader_make_constant_shell(makeString("Individual"))), makeString("web page"), makeSymbol("IR-PRESENT-WEB-PAGE"), constant_handles.reader_make_constant_shell(makeString("IR-WebPage-PSC"))), list(makeKeyword("PIT"), constant_handles.reader_make_constant_shell(makeString("propositionalInfoAbout")), constant_handles.reader_make_constant_shell(makeString("PropositionalInformationThing")), list(constant_handles.reader_make_constant_shell(makeString("Individual"))), makeString("information source"), makeSymbol("IR-PRESENT-PIT"), constant_handles.reader_make_constant_shell(makeString("IR-Prototype-PSC"))));





    static private final SubLList $list_alt8 = list(makeKeyword("RESULTS-TABLE"), makeKeyword("UTILITY-TABLE-1"));

    static private final SubLString $str_alt9$_s = makeString("~s");

    static private final SubLString $str_alt10$___a_a____s = makeString("~%~a~a . ~s");

    static private final SubLList $list_alt11 = list(makeKeyword("LAST-INPUT-STRING"), makeKeyword("LAST-PARSES"), makeKeyword("LAST-INPUT-CYCL"), makeKeyword("LAST-INPUT-ENGLISH"), makeKeyword("MESSAGE"));





    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$pitEnglishCaption = constant_handles.reader_make_constant_shell(makeString("pitEnglishCaption"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $OBJECT_KEYS = makeKeyword("OBJECT-KEYS");

    private static final SubLSymbol $PIT = makeKeyword("PIT");



    private static final SubLSymbol $PSC = makeKeyword("PSC");

    public static final SubLObject $$GroupFn = constant_handles.reader_make_constant_shell(makeString("GroupFn"));

    static private final SubLSymbol $sym22$ISA_VAR_LITERAL_ = makeSymbol("ISA-VAR-LITERAL?");

    static private final SubLSymbol $sym23$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol $USE_ISA_VAR_LITS = makeKeyword("USE-ISA-VAR-LITS");

    static private final SubLSymbol $sym25$CONTENT_CONSTANT_ = makeSymbol("CONTENT-CONSTANT?");

    private static final SubLSymbol NART_TO_NAUT = makeSymbol("NART-TO-NAUT");

    public static final SubLObject $$CotemporalPredicate = constant_handles.reader_make_constant_shell(makeString("CotemporalPredicate"));

    public static final SubLObject $$temporallyIntrinsicArg = constant_handles.reader_make_constant_shell(makeString("temporallyIntrinsicArg"));

    public static final SubLObject $$holdsIn = constant_handles.reader_make_constant_shell(makeString("holdsIn"));

    static private final SubLSymbol $sym30$_MT_TIME = makeSymbol("?MT-TIME");

    public static final SubLObject $$not = constant_handles.reader_make_constant_shell(makeString("not"));







    public static final SubLObject $$PSC_ImageQuery = constant_handles.reader_make_constant_shell(makeString("PSC-ImageQuery"));



    static private final SubLSymbol $sym37$_CONTEXT = makeSymbol("?CONTEXT");

    public static final SubLObject $$MtTimeFn = constant_handles.reader_make_constant_shell(makeString("MtTimeFn"));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    private static final SubLSymbol IR_TEMPORALLY_CONVERT_POS_LIT = makeSymbol("IR-TEMPORALLY-CONVERT-POS-LIT");

    public static final SubLObject $$mtTime = constant_handles.reader_make_constant_shell(makeString("mtTime"));

    private static final SubLSymbol IR_TEMPORALLY_CONVERT_NEG_LIT = makeSymbol("IR-TEMPORALLY-CONVERT-NEG-LIT");

    public static final SubLObject $$or = constant_handles.reader_make_constant_shell(makeString("or"));

    private static final SubLSymbol $RESULTS_TABLE = makeKeyword("RESULTS-TABLE");

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLList $list_alt46 = list(makeKeyword("UTILITY-TABLE-1"));

    static private final SubLList $list_alt47 = list(makeKeyword("PIT"));

    private static final SubLSymbol $GENERAL_PSC = makeKeyword("GENERAL-PSC");

    public static final SubLObject $$propositionalInfoAbout = constant_handles.reader_make_constant_shell(makeString("propositionalInfoAbout"));

    private static final SubLSymbol $FOCUS_PREDICATE = makeKeyword("FOCUS-PREDICATE");

    private static final SubLSymbol EXTRACT_CONTEXT_TEST = makeSymbol("EXTRACT-CONTEXT-TEST");











    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");



    public static final SubLSymbol $kw59$FORGET_EXTRA_RESULTS_ = makeKeyword("FORGET-EXTRA-RESULTS?");



    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");



    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");





    private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");





    public static final SubLInteger $int$400000 = makeInteger(400000);



    static private final SubLList $list_alt71 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    private static final SubLSymbol $CAPTION_PARSING_FUNCTION = makeKeyword("CAPTION-PARSING-FUNCTION");

    private static final SubLSymbol $QUERY_PARSING_FUNCTION = makeKeyword("QUERY-PARSING-FUNCTION");

    static private final SubLString $str_alt74$____Starting_forward_propagation_ = makeString("~%~%Starting forward propagation in ~s ...");

    static private final SubLString $str_alt75$__Finished__apropagating_in__s_a = makeString("~%Finished ~apropagating in ~s~a");

    static private final SubLString $str_alt76$exhaustively_ = makeString("exhaustively ");

    static private final SubLString $str_alt77$ = makeString("");

    static private final SubLString $str_alt78$_ = makeString(".");

    static private final SubLString $str_alt79$_to_a_depth_cutoff_of__a_ = makeString(" to a depth cutoff of ~a.");





    static private final SubLString $str_alt82$Unable_to_open__S = makeString("Unable to open ~S");



    static private final SubLList $list_alt84 = list(makeSymbol("INPUT-ITEMS"), makeSymbol("RESULT-ITEMS"));

    public static final SubLSymbol $ir_parse_query_cache$ = makeSymbol("*IR-PARSE-QUERY-CACHE*");

    static private final SubLString $$$IR_Parse_Query_Cache = makeString("IR Parse Query Cache");

    public static final SubLSymbol $ir_parse_query_initialized_p$ = makeSymbol("*IR-PARSE-QUERY-INITIALIZED-P*");

    public static final SubLSymbol $ir_query_result_supports$ = makeSymbol("*IR-QUERY-RESULT-SUPPORTS*");

    static private final SubLString $$$IR_Query_Result_Supports = makeString("IR Query Result Supports");

    public static final SubLSymbol $ir_query_result_supports_initialized_p$ = makeSymbol("*IR-QUERY-RESULT-SUPPORTS-INITIALIZED-P*");

    private static final SubLSymbol IR_CANONICALIZE_QUERY = makeSymbol("IR-CANONICALIZE-QUERY");

    static private final SubLSymbol $sym92$EL_SENTENCE_ASKABLE_ = makeSymbol("EL-SENTENCE-ASKABLE?");

    public static final SubLSymbol $ir_query_result_mts$ = makeSymbol("*IR-QUERY-RESULT-MTS*");

    static private final SubLString $$$IR_Query_Result_Mts = makeString("IR Query Result Mts");

    public static final SubLSymbol $ir_query_result_mts_initialized_p$ = makeSymbol("*IR-QUERY-RESULT-MTS-INITIALIZED-P*");





    private static final SubLSymbol $IR_PARSING = makeKeyword("IR-PARSING");

    private static final SubLSymbol $IR_MTS = makeKeyword("IR-MTS");

    private static final SubLSymbol $IR_SUPPORTS = makeKeyword("IR-SUPPORTS");

    static private final SubLString $str_alt101$Unknown_test_type__A = makeString("Unknown test type ~A");

    static private final SubLList $list_alt102 = list(makeKeyword("IMAGE"));

    static private final SubLList $list_alt103 = list(makeString("tests"));

    static private final SubLString $str_alt104$ir_parse_query_tests = makeString("ir-parse-query-tests");

    static private final SubLString $$$lisp = makeString("lisp");

    static private final SubLString $str_alt106$ir_query_context_tests = makeString("ir-query-context-tests");

    static private final SubLString $str_alt107$__Parse_test_summary___A_sucesses = makeString("~%Parse test summary: ~A sucesses, ~A failures.~%");

    static private final SubLString $str_alt108$No_test_case_known_for__S = makeString("No test case known for ~S");

    static private final SubLList $list_alt109 = list(makeSymbol("QUERY-STRING"), makeSymbol("EXPECTED"));



    static private final SubLString $str_alt111$___FAILURE__IRT___IR_PARSING__S__ = makeString("~%:FAILURE :IRT (:IR-PARSING ~S) ");

    static private final SubLString $str_alt112$____Missing___S = makeString("~%  Missing: ~S");

    static private final SubLString $str_alt113$____Unexpected___S = makeString("~%  Unexpected: ~S");

    static private final SubLString $str_alt114$___SUCCESS__IRT___IR_PARSING__S__ = makeString("~%:SUCCESS :IRT (:IR-PARSING ~S) ");

    static private final SubLString $str_alt115$___ERROR__IRT___IR_PARSING__S__ = makeString("~%:ERROR :IRT (:IR-PARSING ~S) ");



    static private final SubLString $str_alt117$No_assumed_parse_found_for__S = makeString("No assumed parse found for ~S");



    private static final SubLSymbol INSERT_CONTENT_LITERALS = makeSymbol("INSERT-CONTENT-LITERALS");

    static private final SubLList $list_alt120 = list(constant_handles.reader_make_constant_shell(makeString("MtSpace")), constant_handles.reader_make_constant_shell(makeString("PSC-ImageQuery")), constant_handles.reader_make_constant_shell(makeString("AnytimePSC")));

    static private final SubLList $list_alt121 = list(makeSymbol("QUERY-STRING"), makeSymbol("RAW-PARSES"));

    static private final SubLString $str_alt122$__Query_test_summary___A_comparis = makeString("~%Query test summary (~A comparison): ~A sucesses, ~A failures.~%");

    static private final SubLString $$$Mts = makeString("Mts");

    static private final SubLString $$$Supports = makeString("Supports");

    static private final SubLString $$$Unknown = makeString("Unknown");

    private static final SubLSymbol EXTRACT_CONTEXT = makeSymbol("EXTRACT-CONTEXT");



    static private final SubLString $str_alt128$___FAILURE__IRT___IR_MTS__S__ = makeString("~%:FAILURE :IRT (:IR-MTS ~S) ");

    static private final SubLString $str_alt129$____MISSING___S = makeString("~%  MISSING: ~S");

    static private final SubLString $str_alt130$____UNEXPECTED___S = makeString("~%  UNEXPECTED: ~S");

    static private final SubLString $str_alt131$___SUCCESS__IRT___IR_MTS__S__ = makeString("~%:SUCCESS :IRT (:IR-MTS ~S) ");

    static private final SubLString $str_alt132$___ERROR__IRT___MTS__S___No_expec = makeString("~%:ERROR :IRT (:MTS ~S) \"No expected answer found in cache\"");



    private static final SubLSymbol IR_EQUIVALENT_ANSWERS = makeSymbol("IR-EQUIVALENT-ANSWERS");

    static private final SubLString $str_alt135$___FAILURE__IRT___IR_SUPPORTS__S_ = makeString("~%:FAILURE :IRT (:IR-SUPPORTS ~S) ");

    static private final SubLString $str_alt136$___SUCCESS__IRT___IR_SUPPORTS__S_ = makeString("~%:SUCCESS :IRT (:IR-SUPPORTS ~S) ");

    static private final SubLString $str_alt137$_ERROR__IRT___IR_SUPPORTS__S___No = makeString(":ERROR :IRT (:IR-SUPPORTS ~S) \"No expected answer found in cache\"");

    static private final SubLString $str_alt138$___ERROR__IRT___IR_MTS__S__ = makeString("~%:ERROR :IRT (:IR-MTS ~S) ");

    static private final SubLString $str_alt139$___ERROR__IRT___IR_SUPPORTS__S__ = makeString("~%:ERROR :IRT (:IR-SUPPORTS ~S) ");

    static private final SubLList $list_alt140 = list(makeSymbol("MODULE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));



    static private final SubLString $str_alt142$Unexpected_item_in_answer___S = makeString("Unexpected item in answer: ~S");

    // // Initializers
    public void declareFunctions() {
        declare_image_demo_internals_file();
    }

    public void initializeVariables() {
        init_image_demo_internals_file();
    }

    public void runTopLevelForms() {
        setup_image_demo_internals_file();
    }
}

