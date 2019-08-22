/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.replace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_macros;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.tries;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TM-DATASTRUCTURES
 *  source file: /cyc/top/cycl/thesaurus/tm-datastructures.lisp
 *  created:     2019/07/03 17:38:29
 */
public final class tm_datastructures extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tm_datastructures() {
    }

    public static final SubLFile me = new tm_datastructures();


























    /**
     * Debugging control flag
     */
    // defparameter
    public static final SubLSymbol $tm_debug$ = makeSymbol("*TM-DEBUG*");

    /**
     * Should the Basic Interface be available?
     */
    // defparameter
    public static final SubLSymbol $tm_basic_interface_availableP$ = makeSymbol("*TM-BASIC-INTERFACE-AVAILABLE?*");



    /**
     * Do we require every user to be known?
     */
    // defparameter
    public static final SubLSymbol $tm_accept_only_known_usersP$ = makeSymbol("*TM-ACCEPT-ONLY-KNOWN-USERS?*");



    /**
     * the upper limit on the number of child levels to show in the Hierarchy Display.
     */
    // defparameter
    public static final SubLSymbol $tm_max_child_depth_limit$ = makeSymbol("*TM-MAX-CHILD-DEPTH-LIMIT*");

    /**
     * the upper limit on the number of parent levels to show in the Hierarchy Display.
     */
    // defparameter
    public static final SubLSymbol $tm_max_parent_depth_limit$ = makeSymbol("*TM-MAX-PARENT-DEPTH-LIMIT*");

    /**
     * Number of levels of the hierarchy that should be
     * displayed in the basic interface.
     */
    // defparameter
    public static final SubLSymbol $tm_basic_interface_hierarchy_depth$ = makeSymbol("*TM-BASIC-INTERFACE-HIERARCHY-DEPTH*");

    /**
     * An a-list of (<keyword> <template>) CycL templates for use
     * by various functions in the thesaurus manager application
     */
    // defparameter
    public static final SubLSymbol $thesaurus_cycl_templates$ = makeSymbol("*THESAURUS-CYCL-TEMPLATES*");

    /**
     * Is the thesaurus init file in the process of loading?
     */
    // defparameter
    public static final SubLSymbol $tm_init_file_loadingP$ = makeSymbol("*TM-INIT-FILE-LOADING?*");

    /**
     * Is the thesaurus init file in the process of loading?
     */
    public static final SubLObject tm_init_file_loadingP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $tm_init_file_loadingP$.getDynamicValue(thread);
        }
    }

    /**
     * Has an init file been successfully loaded?
     */
    // deflexical
    public static final SubLSymbol $tm_init_file_loadedP$ = makeSymbol("*TM-INIT-FILE-LOADED?*");

    /**
     * Has an init file been successfully loaded?
     */
    public static final SubLObject tm_init_file_loadedP() {
        return $tm_init_file_loadedP$.getGlobalValue();
    }



    /**
     * tokens for the various thes. relns.  They can't be predicates, since nt and bt map to the same thing.
     */
    // defconstant
    public static final SubLSymbol $tm_core_relations$ = makeSymbol("*TM-CORE-RELATIONS*");



    public static final SubLObject init_tm_relation_predicate_map_from_kb() {
        {
            SubLObject relations = isa.all_fort_instances($$ThesaurusContentPredicate, $tm_mt$.getGlobalValue(), UNPROVIDED);
            SubLObject result = NIL;
            $tm_relation_predicate_map$.setGlobalValue(NIL);
            {
                SubLObject cdolist_list_var = relations;
                SubLObject relation = NIL;
                for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                    if (NIL != relation) {
                        {
                            SubLObject rel_symbol = kb_mapping_utilities.fpred_value_in_mt(relation, $$tmSymbol, $tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject inv_symbol = kb_mapping_utilities.fpred_value_in_mt(relation, $$tmInverseSymbol, $tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != rel_symbol) {
                                result = cons(list(rel_symbol, relation, ONE_INTEGER), result);
                            }
                            if (NIL == inv_symbol) {
                                if (NIL != kb_accessors.symmetric_predicateP(relation)) {
                                    inv_symbol = rel_symbol;
                                }
                            }
                            if (NIL != inv_symbol) {
                                result = cons(list(inv_symbol, relation, TWO_INTEGER), result);
                            }
                        }
                    }
                    $tm_relation_predicate_map$.setGlobalValue(delete_duplicates(result, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            }
        }
        return $tm_relation_predicate_map$.getGlobalValue();
    }

















    /**
     * Each element of this list is a thesaurus which is currently (temporarily)
     * not to be read from, because it is in the process of being edited.
     */
    // defparameter
    private static final SubLSymbol $tm_unreadable_thesauri$ = makeSymbol("*TM-UNREADABLE-THESAURI*");

    /**
     * Each element of this list is a thesaurus which is currently (temporarily)
     * not to be written to, because it is in the process of being read from or written to.
     */
    // defparameter
    private static final SubLSymbol $tm_unwritable_thesauri$ = makeSymbol("*TM-UNWRITABLE-THESAURI*");

    /**
     * Protects all accesses to *TM-UNREADABLE-THESAURI* and *TM-UNWRITABLE-THESAURI*
     */
    // defparameter
    private static final SubLSymbol $tm_thesaurus_protection_lock$ = makeSymbol("*TM-THESAURUS-PROTECTION-LOCK*");

    /**
     * Returns T iff THESAURUS is at that moment involved in some write
     * operation and thus should not be read from.  Use this only to determine
     * whether to show options in the interface.  To safely begin a read
     * operation, TM-START-READ-OPERATION must be used.
     */
    public static final SubLObject tm_thesaurus_unreadableP(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $tm_thesaurus_protection_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = list_utilities.sublisp_boolean(member(thesaurus, $tm_unreadable_thesauri$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns T iff THESAURUS is at that moment involved in some read or write
     * operation and thus should not be written to.  Use this only to determine
     * whether to show options in the interface.  To safely begin a write
     * operation, TM-START-WRITE-OPERATION must be used.
     */
    public static final SubLObject tm_thesaurus_unwritableP(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $tm_thesaurus_protection_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = list_utilities.sublisp_boolean(member(thesaurus, $tm_unwritable_thesauri$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Safely checks to make sure THESARUS is readable, and if so, declares it
     * unwritable.  Returns T if success, NIL otherwise.  This must be called
     * before starting a large-scaled read operation such as Output Thesaurus.
     */
    public static final SubLObject tm_start_read_operation(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(thesaurus, $sym47$THESAURUS_);
            {
                SubLObject failureP = NIL;
                SubLObject lock = $tm_thesaurus_protection_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != tm_thesaurus_unreadableP(thesaurus)) {
                        failureP = T;
                    } else {
                        tm_make_thesaurus_unwritable(thesaurus);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return makeBoolean(NIL == failureP);
            }
        }
    }

    /**
     * Safely checks to make sure THESAURUS is writable, and if so, declares it
     * both unreadable and unwritable.  Returns T if success, NIL otherwise.  This
     * must be called before starting a large-scaled write operation like Load Thesaurus.
     */
    public static final SubLObject tm_start_write_operation(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(thesaurus, $sym47$THESAURUS_);
            {
                SubLObject failureP = NIL;
                SubLObject lock = $tm_thesaurus_protection_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != tm_thesaurus_unwritableP(thesaurus)) {
                        failureP = T;
                    } else {
                        tm_make_thesaurus_unreadable(thesaurus);
                        tm_make_thesaurus_unwritable(thesaurus);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return makeBoolean(NIL == failureP);
            }
        }
    }

    /**
     * Declares THESAURUS to be writable.  This should only appear in the body of
     * a cunwind-protect.
     */
    public static final SubLObject tm_finish_read_operation(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $tm_thesaurus_protection_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    tm_make_thesaurus_writable(thesaurus);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Declares a THESAURUS writable and readable.  This should only appear in the body of
     * a cunwind-protect.
     */
    public static final SubLObject tm_finish_write_operation(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $tm_thesaurus_protection_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    tm_make_thesaurus_readable(thesaurus);
                    tm_make_thesaurus_writable(thesaurus);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Mark each of THESAURI unwritable, so long as none of them are unreadable.
     */
    public static final SubLObject tm_start_multi_thesaurus_read_operation(SubLObject thesauri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unreadable = NIL;
                SubLObject unwritable = NIL;
                SubLObject lock = $tm_thesaurus_protection_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL == unreadable) {
                        {
                            SubLObject csome_list_var = thesauri;
                            SubLObject thesaurus = NIL;
                            for (thesaurus = csome_list_var.first(); !((NIL != unreadable) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , thesaurus = csome_list_var.first()) {
                                if (NIL != tm_thesaurus_unreadableP(thesaurus)) {
                                    unreadable = thesaurus;
                                } else {
                                    tm_make_thesaurus_unwritable(thesaurus);
                                    unwritable = cons(thesaurus, unwritable);
                                }
                            }
                        }
                    }
                    if (NIL != unreadable) {
                        {
                            SubLObject cdolist_list_var = unwritable;
                            SubLObject thesaurus = NIL;
                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                tm_make_thesaurus_writable(thesaurus);
                            }
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return values(makeBoolean(NIL == unreadable), unreadable);
            }
        }
    }

    /**
     * Declares each of THESAURI to be writable.  This should only appear in the body of
     * a cunwind-protect.
     */
    public static final SubLObject tm_finish_multi_thesaurus_read_operation(SubLObject thesauri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $tm_thesaurus_protection_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject cdolist_list_var = thesauri;
                        SubLObject thesaurus = NIL;
                        for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                            tm_make_thesaurus_writable(thesaurus);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_make_thesaurus_unreadable(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unreadable_thesauri = $tm_unreadable_thesauri$.getDynamicValue(thread);
                SubLObject item_var = thesaurus;
                if (NIL == member(item_var, unreadable_thesauri, symbol_function(EQL), symbol_function(IDENTITY))) {
                    unreadable_thesauri = cons(item_var, unreadable_thesauri);
                }
                $tm_unreadable_thesauri$.setDynamicValue(unreadable_thesauri, thread);
                return unreadable_thesauri;
            }
        }
    }

    public static final SubLObject tm_make_thesaurus_readable(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $tm_unreadable_thesauri$.setDynamicValue(remove(thesaurus, $tm_unreadable_thesauri$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            return $tm_unreadable_thesauri$.getDynamicValue(thread);
        }
    }

    public static final SubLObject tm_make_thesaurus_unwritable(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unwritable_thesauri = $tm_unwritable_thesauri$.getDynamicValue(thread);
                SubLObject item_var = thesaurus;
                if (NIL == member(item_var, unwritable_thesauri, symbol_function(EQL), symbol_function(IDENTITY))) {
                    unwritable_thesauri = cons(item_var, unwritable_thesauri);
                }
                $tm_unwritable_thesauri$.setDynamicValue(unwritable_thesauri, thread);
                return unwritable_thesauri;
            }
        }
    }

    public static final SubLObject tm_make_thesaurus_writable(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $tm_unwritable_thesauri$.setDynamicValue(remove(thesaurus, $tm_unwritable_thesauri$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            return $tm_unwritable_thesauri$.getDynamicValue(thread);
        }
    }



    // deflexical
    private static final SubLSymbol $tm_state_vector_length$ = makeSymbol("*TM-STATE-VECTOR-LENGTH*");



    public static final SubLObject reinit_tm_state() {
        {
            SubLObject cdolist_list_var = $tm_state$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject old = pair.rest();
                    SubLObject v_new = make_tm_state_vector(UNPROVIDED);
                    SubLObject cdotimes_end_var = length(old);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        set_aref(v_new, i, aref(old, i));
                    }
                    rplacd(pair, v_new);
                }
            }
        }
        return NIL;
    }

    /**
     * Default init values for keys in *tm-state-keys*.
     * Keys not listed here default to NIL
     */
    // defparameter
    private static final SubLSymbol $tm_state_defaults$ = makeSymbol("*TM-STATE-DEFAULTS*");

    public static final SubLObject make_tm_state_vector(SubLObject length) {
        if (length == UNPROVIDED) {
            length = $tm_state_vector_length$.getGlobalValue();
        }
        if (!length.isInteger()) {
            length = $int$100;
        }
        return make_vector(length, UNPROVIDED);
    }

    /**
     * Returns the vector that contains the tm state information
     * for user.  The vectors are contained in the table (a-list)
     * bound to *tm-state*
     */
    public static final SubLObject get_tm_state(SubLObject user) {
        return misc_utilities.get_indexed_obj(user, $tm_state$.getGlobalValue(), symbol_function(EQUAL));
    }

    /**
     * Adds a tm state vector for user to *tm-state*
     * if one is not already present.
     */
    public static final SubLObject add_tm_vector(SubLObject user) {
        {
            SubLObject vec = get_tm_state(user);
            if (!vec.isVector()) {
                vec = make_tm_state_vector(UNPROVIDED);
                $tm_state$.setGlobalValue(cons(cons(user, vec), $tm_state$.getGlobalValue()));
                reset_tm_state(user);
            }
        }
        return return_tm_state(user);
    }

    /**
     * Get the value for key in user's *tm-state* vector
     */
    public static final SubLObject tm_value(SubLObject user, SubLObject key) {
        return misc_utilities.get_vector_indexed_val(user, $tm_state$.getGlobalValue(), key, $tm_state_keys$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    /**
     * Change the value for KEY in USER's *tm-state* vector by
     * replacing or augmenting the old value with NEW.  METHOD specifies
     * how the value will be updated with NEW.  The methods currently
     * supported are :replace, :cons, :adjoin, :append, and :union.
     */
    public static final SubLObject change_tm_value(SubLObject user, SubLObject key, SubLObject v_new, SubLObject method) {
        if (method == UNPROVIDED) {
            method = $REPLACE;
        }
        return misc_utilities.update_vector_indexed_val(user, $tm_state$.getGlobalValue(), key, $tm_state_keys$.getGlobalValue(), v_new, method, symbol_function(EQUALP), symbol_function(EQUAL), symbol_function(EQUAL));
    }

    public static final SubLObject clear_utility_tables(SubLObject user) {
        {
            SubLObject cdolist_list_var = $list_alt57;
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                {
                    SubLObject table = tm_value(user, key);
                    if (table.isHashtable()) {
                        clrhash(table);
                    } else {
                        {
                            SubLObject pcase_var = key;
                            if (((pcase_var.eql($USER_EVENT_LOG_TABLE) || pcase_var.eql($THESAURUS_EVENT_LOG_TABLE)) || pcase_var.eql($APPLICATION_TMAP_LOG_TABLE)) || pcase_var.eql($THESAURUS_TMAP_LOG_TABLE)) {
                                change_tm_value(user, key, make_hash_table($int$100, symbol_function(EQUALP), UNPROVIDED), UNPROVIDED);
                            } else {
                                change_tm_value(user, key, make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED), UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject reset_tm_state(SubLObject user) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vec = get_tm_state(user);
                if (vec.isVector()) {
                    {
                        SubLObject cdotimes_end_var = length(vec);
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                            set_aref(vec, i, NIL);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = $tm_state_keys$.getGlobalValue();
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            {
                                SubLObject key = pair.first();
                                SubLObject v_default = assoc(key, $tm_state_defaults$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                                if (NIL == find(key, $list_alt58, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    change_tm_value(user, key, v_default, $REPLACE);
                                }
                            }
                        }
                    }
                }
            }
            clear_utility_tables(user);
            return get_tm_state(user);
        }
    }

    public static final SubLObject return_tm_state(SubLObject user) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(CAR), $tm_state_keys$.getGlobalValue());
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                ans = cons(list(key, tm_value(user, key)), ans);
            }
            return nreverse(ans);
        }
    }

    public static final SubLObject print_tm_state(SubLObject user) {
        {
            SubLObject result = return_tm_state(user);
            SubLObject longest = ZERO_INTEGER;
            {
                SubLObject cdolist_list_var = result;
                SubLObject x = NIL;
                for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                    {
                        SubLObject len1 = length(format(NIL, $str_alt60$_s, x.first()));
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
                        SubLObject key = format(NIL, $str_alt60$_s, x.first());
                        SubLObject len2 = length(key);
                        SubLObject fill = Strings.make_string(subtract(longest, len2), UNPROVIDED);
                        format(T, $str_alt61$___a_a____s, new SubLObject[]{ key, fill, second(x) });
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Reset (clear) tm state info for keys in key-list, else
     * for all keys except exception-list, else for all keys
     * in *tm-state-keys*
     */
    public static final SubLObject clear_tm_state(SubLObject user, SubLObject key_list, SubLObject exception_list) {
        if (key_list == UNPROVIDED) {
            key_list = NIL;
        }
        if (exception_list == UNPROVIDED) {
            exception_list = NIL;
        }
        clear_utility_tables(user);
        {
            SubLObject all_keys = Mapping.mapcar(symbol_function(CAR), $tm_state_keys$.getGlobalValue());
            SubLObject keys_to_use = (NIL != key_list) ? ((SubLObject) (key_list)) : NIL != exception_list ? ((SubLObject) (set_difference(all_keys, exception_list, UNPROVIDED, UNPROVIDED))) : all_keys;
            SubLObject cdolist_list_var = keys_to_use;
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                if (NIL == find(key, $list_alt62, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    change_tm_value(user, key, NIL, $REPLACE);
                }
            }
            return get_tm_state(user);
        }
    }

    public static final SubLObject blast_tm_state() {
        $tm_state$.setGlobalValue(NIL);
        return $tm_state$.getGlobalValue();
    }

    public static final SubLObject clear_thesaurus_from_tm_state(SubLObject thesaurus) {
        {
            SubLObject cdolist_list_var = $tm_state$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject user = pair.first();
                    SubLObject thesauri = tm_value(user, $THESAURI);
                    SubLObject new_thesauri = remove(thesaurus, thesauri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject edit_thesauri = tm_value(user, $EDIT_THESAURI);
                    SubLObject new_edit_thesauri = remove(thesaurus, edit_thesauri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject selected = tm_value(user, $SELECTED_THESAURUS);
                    SubLObject correlate_thesaurus = tm_value(user, $CORRELATE_THESAURUS);
                    SubLObject integrity_thesaurus = tm_value(user, $INTEGRITY_THESAURUS);
                    change_tm_value(user, $THESAURI, new_thesauri, UNPROVIDED);
                    change_tm_value(user, $EDIT_THESAURI, new_edit_thesauri, UNPROVIDED);
                    if (selected.equal(thesaurus)) {
                        change_tm_value(user, $SELECTED_THESAURUS, NIL, UNPROVIDED);
                    }
                    if (correlate_thesaurus.equal(thesaurus)) {
                        change_tm_value(user, $CORRELATE_THESAURUS, NIL, UNPROVIDED);
                    }
                    if (integrity_thesaurus.equal(thesaurus)) {
                        change_tm_value(user, $INTEGRITY_THESAURUS, NIL, UNPROVIDED);
                    }
                }
            }
        }
        tm_io.tm_clear_thesaurus_from_update_load_state(thesaurus);
        return NIL;
    }

    public static final SubLObject clear_output_filter_from_tm_state(SubLObject filter_name) {
        {
            SubLObject cdolist_list_var = $tm_state$.getGlobalValue();
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject user = pair.first();
                    SubLObject output_filter = tm_value(user, $OUTPUT_FILTER);
                    SubLObject display_filter = tm_value(user, $DISPLAY_FILTER);
                    if (output_filter.first().equalp(filter_name)) {
                        change_tm_value(user, $OUTPUT_FILTER, NIL, UNPROVIDED);
                    }
                    if (display_filter.first().equalp(filter_name)) {
                        change_tm_value(user, $DISPLAY_FILTER, NIL, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_init(SubLObject user) {
        add_tm_vector(user);
        {
            SubLObject user_constant = tm_internals.tm_user_constant_from_user_name(user);
            change_tm_value(user, $LEVEL, tm_internals.user_level(user_constant), UNPROVIDED);
            change_tm_value(user, $EDITABLE_THESAURI, tm_internals.editable_thesauri(user_constant, UNPROVIDED), UNPROVIDED);
            tm_internals.tm_init_preferences_from_file(user);
            tm_internals.tm_set_thesauri_if_necessary(user);
            $tm_bg_color_default$.setDynamicValue(tm_value(user, $BG_COLOR_DEFAULT));
        }
        return get_tm_state(user);
    }

    /**
     * Special testing version - initialize USER at permission level LEVEL.
     */
    public static final SubLObject tm_change_init(SubLObject user, SubLObject level) {
        {
            SubLObject user_constant = tm_internals.tm_user_constant_from_user_name(user);
            change_tm_value(user, $LEVEL, level, UNPROVIDED);
            change_tm_value(user, $EDITABLE_THESAURI, tm_internals.editable_thesauri(user_constant, level), UNPROVIDED);
            tm_internals.tm_init_preferences_from_file(user);
            tm_internals.tm_set_thesauri_if_necessary(user);
            $tm_bg_color_default$.setDynamicValue(tm_value(user, $BG_COLOR_DEFAULT));
        }
        return get_tm_state(user);
    }

    public static final SubLObject tm_guest_init(SubLObject user) {
        add_tm_vector(user);
        change_tm_value(user, $LEVEL, $str_alt73$end_user, UNPROVIDED);
        change_tm_value(user, $SHOW_TERM_THESAURI, NIL, UNPROVIDED);
        change_tm_value(user, $kw75$FD_SEPARATE_, NIL, UNPROVIDED);
        change_tm_value(user, $DISPLAY_CASE, $UPPER, UNPROVIDED);
        change_tm_value(user, $SHOW_HD_RELATION_LINKS, NIL, UNPROVIDED);
        change_tm_value(user, $FILTER_IN_BASIC, $ON, UNPROVIDED);
        tm_internals.tm_init_preferences_from_file(user);
        tm_internals.tm_set_thesauri_if_necessary(user);
        $tm_bg_color_default$.setDynamicValue(tm_value(user, $BG_COLOR_DEFAULT));
        return get_tm_state(user);
    }

    /**
     * TRIE implementing the thesaurus manager stoplist
     */
    // defvar
    private static final SubLSymbol $tm_stoplist_trie$ = makeSymbol("*TM-STOPLIST-TRIE*");

    // defparameter
    private static final SubLSymbol $tm_rotate_characters$ = makeSymbol("*TM-ROTATE-CHARACTERS*");

    // defparameter
    private static final SubLSymbol $tm_rotate_point_char$ = makeSymbol("*TM-ROTATE-POINT-CHAR*");

    // defparameter
    private static final SubLSymbol $tm_rotate_point_string$ = makeSymbol("*TM-ROTATE-POINT-STRING*");

    // defparameter
    private static final SubLSymbol $tm_valid_rotation_start_test$ = makeSymbol("*TM-VALID-ROTATION-START-TEST*");

    /**
     * Return T iff STRING is a thesaurus manager stoplist word
     */
    public static final SubLObject tm_stoplist_wordP(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            return tries.trie_exact($tm_stoplist_trie$.getDynamicValue(thread), string, NIL, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject tm_stoplist_words() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return Mapping.mapcar(symbol_function(GAF_ARG1), tries.trie_prefix($tm_stoplist_trie$.getDynamicValue(thread), $str_alt86$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    /**
     * Return all rotated versions of STRING using the thesaurus manager stoplist
     */
    public static final SubLObject tm_rotations(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            return string_utilities.string_rotations(string, $tm_stoplist_trie$.getDynamicValue(thread), $tm_rotate_characters$.getDynamicValue(thread), $tm_rotate_point_string$.getDynamicValue(thread), $tm_valid_rotation_start_test$.getDynamicValue(thread));
        }
    }

    /**
     * Assume STRING is a rotation, so return 2 values:
     * pre-rotation point string (or NIL)
     * post-rotation point string
     */
    public static final SubLObject tm_determine_rotation_split(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rotation_point = search($tm_rotate_point_string$.getDynamicValue(thread), string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == rotation_point) {
                    return values(NIL, string);
                } else {
                    return values(string_utilities.substring(string, add(rotation_point, length($tm_rotate_point_string$.getDynamicValue(thread))), UNPROVIDED), string_utilities.substring(string, ZERO_INTEGER, rotation_point));
                }
            }
        }
    }

    /**
     * return the string for a rotation index based on POST-ROTATION and PRE-ROTATION.
     * I.e. Texas Austin -> Texas<rot>Austin, Houston NIL -> Houston
     */
    public static final SubLObject tm_rotated_index_string(SubLObject post_rotation, SubLObject pre_rotation) {
        if (pre_rotation == UNPROVIDED) {
            pre_rotation = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pre_rotation) {
                return cconcatenate(post_rotation, new SubLObject[]{ $tm_rotate_point_string$.getDynamicValue(thread), pre_rotation });
            } else {
                return post_rotation;
            }
        }
    }

    /**
     * Add index to SIGN off the lexical string (and its rotations), unless updating is deferred.  Return T if it was indexed.
     */
    public static final SubLObject tm_add_lexical_entry(SubLObject sign) {
        SubLTrampolineFile.checkType(sign, SIGNP);
        {
            SubLObject string = sign_term(sign);
            SubLObject words = string_utilities.split_string(string, UNPROVIDED);
            if (NIL != list_utilities.not_every_in_list(symbol_function($sym88$TM_STOPLIST_WORD_), words, UNPROVIDED)) {
                return tm_lexical_index.add_lexical_entry(sign);
            }
            return NIL;
        }
    }

    /**
     * Remove index to SIGN off the perferred term string (& its rotations) in the lexical indices
     */
    public static final SubLObject tm_remove_lexical_entry(SubLObject sign) {
        SubLTrampolineFile.checkType(sign, SIGNP);
        {
            SubLObject thesaurus = sign_thesaurus(sign);
            if (NIL != tm_perform_index_removal_for_thesaurus(thesaurus)) {
                tm_lexical_index.remove_lexical_entry(sign, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Turns off useless lexical index updating on a delete of a thesaurus.
     */
    // defparameter
    private static final SubLSymbol $tm_delete_thesaurus_speedup$ = makeSymbol("*TM-DELETE-THESAURUS-SPEEDUP*");

    public static final SubLObject tm_perform_index_removal_for_thesaurus(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL == $tm_delete_thesaurus_speedup$.getDynamicValue(thread)) || (NIL == kb_macros.fort_being_removedP(thesaurus)));
        }
    }

    /**
     * Add STRING (arg1 of ASSERTION) as a new stop word.  If STRING is a valid stop word, return total number of
     * indexed rotations removed as a result of adding this stop word. Else return:
     * NIL LEXPRED if string an entry of the lexical predicate, LEXPRED.
     */
    public static final SubLObject tm_add_stop_word(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            {
                SubLObject string = assertions_high.gaf_arg1(assertion);
                SubLTrampolineFile.checkType(string, STRINGP);
                if (NIL != tries.trie_exact($tm_stoplist_trie$.getDynamicValue(thread), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return ZERO_INTEGER;
                }
                {
                    SubLObject cdolist_list_var = tm_lexical_index.all_lexpreds();
                    SubLObject lexpred = NIL;
                    for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                        if (NIL != tm_lexical_index.lexpred_lookup(string, lexpred, NIL, T, UNPROVIDED)) {
                            return values(NIL, lexpred);
                        }
                    }
                }
                tries.trie_insert($tm_stoplist_trie$.getDynamicValue(thread), string, assertion, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject total = ZERO_INTEGER;
                    SubLObject cdolist_list_var = tm_lexical_index.all_lexpreds();
                    SubLObject lexpred = NIL;
                    for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                        if (NIL == tm_lexical_index.lexpred_index_emptyP(lexpred, T)) {
                            total = add(total, tm_remove_rotations_via(string, lexpred));
                        }
                    }
                    return total;
                }
            }
        }
    }

    /**
     * Remove all rotations prefixed by STRING in the index for LEXPRED.  Return the total count of rotations removed.
     */
    public static final SubLObject tm_remove_rotations_via(SubLObject string, SubLObject lexpred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            {
                SubLObject length = length(string);
                SubLObject prefix_string = Strings.make_string(add(length, ONE_INTEGER), $tm_rotate_point_char$.getDynamicValue(thread));
                SubLObject total = ZERO_INTEGER;
                replace(prefix_string, string, ZERO_INTEGER, length, ZERO_INTEGER, length);
                total = add(total, tm_lexical_index.lexpred_remove_all(prefix_string, lexpred, $ALL, T));
                {
                    SubLObject cdolist_list_var = $tm_rotate_characters$.getDynamicValue(thread);
                    SubLObject v_char = NIL;
                    for (v_char = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_char = cdolist_list_var.first()) {
                        Strings.set_char(prefix_string, length, v_char);
                        total = add(total, tm_lexical_index.lexpred_remove_all(prefix_string, lexpred, $ALL, T));
                    }
                }
                return total;
            }
        }
    }

    /**
     * Remove STRING (arg1 of ASSERTION) from the stop word set.  Return the total number of new rotations indexed
     */
    public static final SubLObject tm_remove_stop_word(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            {
                SubLObject string = assertions_high.gaf_arg1(assertion);
                SubLTrampolineFile.checkType(string, STRINGP);
                if (NIL != tries.trie_exact($tm_stoplist_trie$.getDynamicValue(thread), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject reindex_lexical_signs = NIL;
                        SubLObject cdolist_list_var = tm_lexical_index.all_lexpreds();
                        SubLObject lexpred = NIL;
                        for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                            reindex_lexical_signs = append(tm_lexical_index.lexpred_search(string, lexpred, UNPROVIDED, UNPROVIDED, UNPROVIDED), reindex_lexical_signs);
                        }
                        {
                            SubLObject list_var = reindex_lexical_signs;
                            utilities_macros.$progress_note$.setDynamicValue($$$Removing_lexical_indices, thread);
                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject sign = NIL;
                                        for (sign = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , sign = csome_list_var.first()) {
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            tm_remove_lexical_entry(sign);
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        tries.trie_remove($tm_stoplist_trie$.getDynamicValue(thread), string, assertion, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject list_var = reindex_lexical_signs;
                            utilities_macros.$progress_note$.setDynamicValue($$$Adding_lexical_indices, thread);
                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject sign = NIL;
                                        for (sign = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , sign = csome_list_var.first()) {
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            tm_add_lexical_entry(sign);
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        return length(reindex_lexical_signs);
                    }
                }
                return ZERO_INTEGER;
            }
        }
    }

    /**
     * Has the alphabtical index been built?
     */
    // defvar
    private static final SubLSymbol $tm_alphabetical_index_built$ = makeSymbol("*TM-ALPHABETICAL-INDEX-BUILT*");

    /**
     * Recompute lexical indices from scratch if
     * a. They are completely missing or
     * b. FORCE? and BLAST-FIRST? are non-nil.
     * Otherwise, if FORCE? is non-nil but existing indices aren't empty,
     * only update missing entries.
     */
    public static final SubLObject tm_rebuild_alphabetical_index(SubLObject forceP, SubLObject blast_firstP) {
        if (forceP == UNPROVIDED) {
            forceP = NIL;
        }
        if (blast_firstP == UNPROVIDED) {
            blast_firstP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != forceP) || (NIL == $tm_alphabetical_index_built$.getDynamicValue(thread))) {
                tries.clear_trie($tm_stoplist_trie$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($$$building_stoplist);
                        {
                            SubLObject total = kb_indexing.num_predicate_extent_index($$tmStoplistWord, UNPROVIDED);
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    {
                                        SubLObject pred_var = $$tmStoplistWord;
                                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                SubLObject done_var = NIL;
                                                SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    {
                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject final_index_iterator = NIL;
                                                                try {
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                    {
                                                                        SubLObject done_var_3 = NIL;
                                                                        SubLObject token_var_4 = NIL;
                                                                        while (NIL == done_var_3) {
                                                                            {
                                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                                                SubLObject valid_5 = makeBoolean(token_var_4 != ass);
                                                                                if (NIL != valid_5) {
                                                                                    utilities_macros.note_percent_progress(sofar, total);
                                                                                    sofar = add(sofar, ONE_INTEGER);
                                                                                    if (NIL != assertion_handles.assertion_p(ass)) {
                                                                                        tm_add_stop_word(ass);
                                                                                    }
                                                                                }
                                                                                done_var_3 = makeBoolean(NIL == valid_5);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                if ((NIL != blast_firstP) || (NIL == $tm_alphabetical_index_built$.getDynamicValue(thread))) {
                    {
                        SubLObject cdolist_list_var = tm_internals.all_thesauri();
                        SubLObject thesaurus = NIL;
                        for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                            tm_lexical_index.remove_thesaurus_from_lexical_indices(thesaurus);
                        }
                    }
                    tm_lexical_index.initialize_lexical_index();
                    {
                        SubLObject cdolist_list_var = tm_internals.all_thesauri();
                        SubLObject thesaurus = NIL;
                        for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                            tm_lexical_index.add_thesaurus_to_lexical_indices(thesaurus);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = tm_lexical_index.all_lexpreds();
                        SubLObject lexpred = NIL;
                        for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                            {
                                SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(format(NIL, $str_alt99$indexing__A, lexpred));
                                    {
                                        SubLObject total = kb_indexing.num_predicate_extent_index(lexpred, UNPROVIDED);
                                        SubLObject sofar = ZERO_INTEGER;
                                        {
                                            SubLObject _prev_bind_0_7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1_8 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                {
                                                    SubLObject pred_var = lexpred;
                                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                                        {
                                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                            SubLObject done_var = NIL;
                                                            SubLObject token_var = NIL;
                                                            while (NIL == done_var) {
                                                                {
                                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                    if (NIL != valid) {
                                                                        {
                                                                            SubLObject final_index_iterator = NIL;
                                                                            try {
                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                {
                                                                                    SubLObject done_var_9 = NIL;
                                                                                    SubLObject token_var_10 = NIL;
                                                                                    while (NIL == done_var_9) {
                                                                                        {
                                                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                                                            SubLObject valid_11 = makeBoolean(token_var_10 != ass);
                                                                                            if (NIL != valid_11) {
                                                                                                utilities_macros.note_percent_progress(sofar, total);
                                                                                                sofar = add(sofar, ONE_INTEGER);
                                                                                                if (NIL != assertion_handles.assertion_p(ass)) {
                                                                                                    tm_add_lexical_entry(ass);
                                                                                                }
                                                                                            }
                                                                                            done_var_9 = makeBoolean(NIL == valid_11);
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if (NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var = makeBoolean(NIL == valid);
                                                                }
                                                            } 
                                                        }
                                                    }
                                                }
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_8, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } else {
                    tm_verify_update_alphabetical_index();
                }
                $tm_alphabetical_index_built$.setDynamicValue(T, thread);
            }
            return $tm_alphabetical_index_built$.getDynamicValue(thread);
        }
    }

    // defparameter
    private static final SubLSymbol $indexing_thesaurus$ = makeSymbol("*INDEXING-THESAURUS*");

    // defparameter
    private static final SubLSymbol $indexing_lexpred$ = makeSymbol("*INDEXING-LEXPRED*");

    public static final SubLObject tm_possibly_add_lexical_entry(SubLObject sign) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_term = sign_term(sign);
                SubLObject thesaurus = $indexing_thesaurus$.getDynamicValue(thread);
                SubLObject lexpred = $indexing_lexpred$.getDynamicValue(thread);
                SubLObject signs = tm_lexical_index.lexical_lookup(v_term, lexpred, thesaurus, UNPROVIDED, UNPROVIDED);
                if (NIL == subl_promotions.memberP(sign, signs, UNPROVIDED, UNPROVIDED)) {
                    tm_add_lexical_entry(sign);
                }
            }
            return NIL;
        }
    }

    /**
     * Map all lexpred/thesaurus pred-mt indices, adding missing signs to the lexical indices.
     */
    public static final SubLObject tm_verify_update_alphabetical_index() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_lexical_index.tm_possibly_update_index_buckets();
            {
                SubLObject cdolist_list_var = tm_lexical_index.all_lexpreds();
                SubLObject lexpred = NIL;
                for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_13 = tm_internals.all_thesauri();
                        SubLObject thesaurus = NIL;
                        for (thesaurus = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , thesaurus = cdolist_list_var_13.first()) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == tm_lexical_index.lexical_index_for_lexpred_thesaurusP(lexpred, thesaurus, UNPROVIDED)) {
                                    Errors.error($str_alt100$Error__no_lexical_index_for__A___, lexpred, thesaurus);
                                }
                            }
                            {
                                SubLObject _prev_bind_0 = $indexing_lexpred$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $indexing_thesaurus$.currentBinding(thread);
                                try {
                                    $indexing_lexpred$.bind(lexpred, thread);
                                    $indexing_thesaurus$.bind(thesaurus, thread);
                                    kb_mapping.map_predicate_extent_index(symbol_function(TM_POSSIBLY_ADD_LEXICAL_ENTRY), lexpred, NIL, thesaurus);
                                } finally {
                                    $indexing_thesaurus$.rebind(_prev_bind_1, thread);
                                    $indexing_lexpred$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_alpha_complete_in_thesauri(SubLObject string, SubLObject thesauri, SubLObject exactP, SubLObject include_use_forsP, SubLObject include_rotationsP) {
        if (exactP == UNPROVIDED) {
            exactP = NIL;
        }
        if (include_use_forsP == UNPROVIDED) {
            include_use_forsP = NIL;
        }
        if (include_rotationsP == UNPROVIDED) {
            include_rotationsP = NIL;
        }
        return tm_alpha_complete(string, thesauri, exactP, include_use_forsP, include_rotationsP);
    }

    public static final SubLObject tm_alpha_complete(SubLObject string, SubLObject relevant_thesauri, SubLObject exactP, SubLObject include_use_forsP, SubLObject include_rotationsP) {
        {
            SubLObject pt = NIL;
            SubLObject pt_rot = NIL;
            SubLObject uf = NIL;
            SubLObject uf_rot = NIL;
            pt = (NIL != exactP) ? ((SubLObject) (tm_lexical_index.lexpred_lookup(string, $$preferredTerm, relevant_thesauri, UNPROVIDED, UNPROVIDED))) : tm_lexical_index.lexpred_prefix(string, $$preferredTerm, relevant_thesauri, UNPROVIDED, UNPROVIDED);
            if (NIL != include_rotationsP) {
                pt_rot = (NIL != exactP) ? ((SubLObject) (tm_lexical_index.lexpred_lookup(string, $$preferredTerm, relevant_thesauri, NIL, T))) : tm_lexical_index.lexpred_prefix(string, $$preferredTerm, relevant_thesauri, NIL, T);
            }
            if (NIL != include_use_forsP) {
                uf = (NIL != exactP) ? ((SubLObject) (tm_lexical_index.lexpred_lookup(string, $$useFor, relevant_thesauri, UNPROVIDED, UNPROVIDED))) : tm_lexical_index.lexpred_prefix(string, $$useFor, relevant_thesauri, UNPROVIDED, UNPROVIDED);
                if (NIL != include_rotationsP) {
                    uf_rot = (NIL != exactP) ? ((SubLObject) (tm_lexical_index.lexpred_lookup(string, $$useFor, relevant_thesauri, NIL, T))) : tm_lexical_index.lexpred_prefix(string, $$useFor, relevant_thesauri, NIL, T);
                }
            }
            return values(pt, pt_rot, uf, uf_rot);
        }
    }

    public static final SubLObject tm_alpha_around(SubLObject string, SubLObject n_before, SubLObject n_after, SubLObject include_variantsP, SubLObject include_rotationsP) {
        if (include_variantsP == UNPROVIDED) {
            include_variantsP = NIL;
        }
        if (include_rotationsP == UNPROVIDED) {
            include_rotationsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_value($tm_user$.getDynamicValue(thread), $SEARCHING_ALL)) {
                return tm_alpha_around_thesauri(string, tm_internals.browsable_thesauri($tm_user$.getDynamicValue(thread), UNPROVIDED), n_before, n_after, include_variantsP, include_rotationsP);
            } else {
                return tm_alpha_around_thesauri(string, tm_value($tm_user$.getDynamicValue(thread), $THESAURI), n_before, n_after, include_variantsP, include_rotationsP);
            }
        }
    }

    public static final SubLObject tm_alpha_around_thesauri(SubLObject string, SubLObject relevant_thesauri, SubLObject n_before, SubLObject n_after, SubLObject include_variantsP, SubLObject include_rotationsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject search_relations = (tm_value($tm_user$.getDynamicValue(thread), $INTERFACE) == $BASIC) ? ((SubLObject) ($ALL)) : tm_value($tm_user$.getDynamicValue(thread), $SEARCH_RELATIONS);
                SubLObject lexpreds = (search_relations == $ALL) ? ((SubLObject) (tm_lexical_index.all_lexpreds())) : search_relations;
                SubLObject before = NIL;
                SubLObject after = NIL;
                before = nconc(before, tm_alpha_around_thesauri_internal(string, relevant_thesauri, $$preferredTerm, n_before, NIL, NIL, TM_ADD_FROM_INDEX_MAP, symbol_function(STRING_GREATERP)));
                after = nconc(after, tm_alpha_around_thesauri_internal(string, relevant_thesauri, $$preferredTerm, n_after, T, NIL, TM_ADD_FROM_INDEX_MAP, symbol_function(STRING_LESSP)));
                if (NIL != include_variantsP) {
                    {
                        SubLObject cdolist_list_var = lexpreds;
                        SubLObject lexpred = NIL;
                        for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                            if (lexpred != $$preferredTerm) {
                                before = nconc(before, tm_alpha_around_thesauri_internal(string, relevant_thesauri, lexpred, n_before, NIL, NIL, TM_ADD_FROM_INDEX_MAP, symbol_function(STRING_GREATERP)));
                                after = nconc(after, tm_alpha_around_thesauri_internal(string, relevant_thesauri, lexpred, n_after, T, NIL, TM_ADD_FROM_INDEX_MAP, symbol_function(STRING_LESSP)));
                            }
                        }
                    }
                }
                if (NIL != include_rotationsP) {
                    before = nconc(before, tm_alpha_around_thesauri_internal(string, relevant_thesauri, $$preferredTerm, n_before, NIL, T, TM_ADD_ROTATION_FROM_INDEX_MAP, symbol_function(STRING_GREATERP)));
                    after = nconc(after, tm_alpha_around_thesauri_internal(string, relevant_thesauri, $$preferredTerm, n_after, T, T, TM_ADD_ROTATION_FROM_INDEX_MAP, symbol_function(STRING_LESSP)));
                }
                if ((NIL != include_rotationsP) && (NIL != include_variantsP)) {
                    {
                        SubLObject cdolist_list_var = lexpreds;
                        SubLObject lexpred = NIL;
                        for (lexpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexpred = cdolist_list_var.first()) {
                            if (lexpred != $$preferredTerm) {
                                before = nconc(before, tm_alpha_around_thesauri_internal(string, relevant_thesauri, lexpred, n_before, NIL, T, TM_ADD_ROTATION_FROM_INDEX_MAP, symbol_function(STRING_GREATERP)));
                                after = nconc(after, tm_alpha_around_thesauri_internal(string, relevant_thesauri, lexpred, n_after, T, T, TM_ADD_ROTATION_FROM_INDEX_MAP, symbol_function(STRING_LESSP)));
                            }
                        }
                    }
                }
                before = Sort.sort(before, symbol_function(STRING_GREATERP), symbol_function(CAR));
                after = Sort.sort(after, symbol_function(STRING_LESSP), symbol_function(CAR));
                if (NIL != n_before) {
                    before = list_utilities.first_n(n_before, before);
                }
                if (NIL != n_after) {
                    after = list_utilities.first_n(n_after, after);
                }
                return values(nreverse(before), after);
            }
        }
    }

    // defparameter
    private static final SubLSymbol $tm_alpha_total$ = makeSymbol("*TM-ALPHA-TOTAL*");

    // defparameter
    private static final SubLSymbol $tm_alpha_sofar$ = makeSymbol("*TM-ALPHA-SOFAR*");

    // defparameter
    private static final SubLSymbol $tm_alpha_gather$ = makeSymbol("*TM-ALPHA-GATHER*");

    public static final SubLObject tm_add_from_index_map(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = find_if(symbol_function(STRINGP), assertions_high.gaf_formula(v_object), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (!string.equalp($tm_alpha_gather$.getDynamicValue(thread).first().first())) {
                    $tm_alpha_sofar$.setDynamicValue(add($tm_alpha_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    $tm_alpha_gather$.setDynamicValue(cons(list(string), $tm_alpha_gather$.getDynamicValue(thread)), thread);
                }
                rplacd($tm_alpha_gather$.getDynamicValue(thread).first(), cons(v_object, $tm_alpha_gather$.getDynamicValue(thread).first().rest()));
                if ((NIL != $tm_alpha_total$.getDynamicValue(thread)) && $tm_alpha_sofar$.getDynamicValue(thread).numGE($tm_alpha_total$.getDynamicValue(thread))) {
                    utilities_macros.mapping_finished();
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_add_rotation_from_index_map(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = v_object;
                SubLObject current = datum;
                SubLObject rotation = NIL;
                SubLObject assertion = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt112);
                rotation = current.first();
                current = current.rest();
                assertion = current;
                if (!rotation.equalp($tm_alpha_gather$.getDynamicValue(thread).first().first())) {
                    $tm_alpha_sofar$.setDynamicValue(add($tm_alpha_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    $tm_alpha_gather$.setDynamicValue(cons(list(rotation), $tm_alpha_gather$.getDynamicValue(thread)), thread);
                }
                rplacd($tm_alpha_gather$.getDynamicValue(thread).first(), cons(assertion, $tm_alpha_gather$.getDynamicValue(thread).first().rest()));
                if ((NIL != $tm_alpha_total$.getDynamicValue(thread)) && $tm_alpha_sofar$.getDynamicValue(thread).numGE($tm_alpha_total$.getDynamicValue(thread))) {
                    utilities_macros.mapping_finished();
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_alpha_around_thesauri_internal(SubLObject string, SubLObject thesauri, SubLObject lexpred, SubLObject count, SubLObject forwardP, SubLObject rotationP, SubLObject add_func, SubLObject sort_func) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = thesauri;
                SubLObject thesaurus = NIL;
                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                    {
                        SubLObject _prev_bind_0 = $tm_alpha_total$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $tm_alpha_sofar$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $tm_alpha_gather$.currentBinding(thread);
                        try {
                            $tm_alpha_total$.bind(count, thread);
                            $tm_alpha_sofar$.bind(ZERO_INTEGER, thread);
                            $tm_alpha_gather$.bind(NIL, thread);
                            {
                                SubLObject catch_var = NIL;
                                try {
                                    tm_lexical_index.map_lexical_direction(add_func, string, lexpred, thesaurus, forwardP, rotationP);
                                } catch (Throwable ccatch_env_var) {
                                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                                }
                                ans = nconc(ans, $tm_alpha_gather$.getDynamicValue(thread));
                            }
                        } finally {
                            $tm_alpha_gather$.rebind(_prev_bind_2, thread);
                            $tm_alpha_sofar$.rebind(_prev_bind_1, thread);
                            $tm_alpha_total$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return tm_alpha_around_sort(ans, sort_func, count);
            }
        }
    }

    public static final SubLObject tm_alpha_around_sort(SubLObject items, SubLObject sort_pred, SubLObject max_count) {
        items = Sort.sort(items, sort_pred, symbol_function(FIRST));
        {
            SubLObject total_answer = NIL;
            SubLObject current_item = NIL;
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL == current_item) {
                    current_item = item;
                } else {
                    {
                        SubLObject datum = item;
                        SubLObject current = datum;
                        SubLObject string = NIL;
                        SubLObject signs = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt115);
                        string = current.first();
                        current = current.rest();
                        signs = current;
                        {
                            SubLObject datum_14 = current_item;
                            SubLObject current_15 = datum_14;
                            SubLObject current_string = NIL;
                            SubLObject current_signs = NIL;
                            destructuring_bind_must_consp(current_15, datum_14, $list_alt116);
                            current_string = current_15.first();
                            current_15 = current_15.rest();
                            current_signs = current_15;
                            if (!string.equalp(current_string)) {
                                total_answer = cons(current_item, total_answer);
                                current_item = item;
                            } else {
                                rplacd(current_item, append(signs, current_signs));
                            }
                        }
                    }
                }
            }
            if (NIL != current_item) {
                total_answer = cons(current_item, total_answer);
            }
            total_answer = nreverse(total_answer);
            return list_utilities.first_n(max_count, total_answer);
        }
    }

    public static final SubLObject signp(SubLObject v_object) {
        if ((NIL != assertion_handles.assertion_p(v_object)) && (NIL != assertions_high.valid_assertion(v_object, UNPROVIDED))) {
            {
                SubLObject predicate = assertions_high.gaf_arg0(v_object);
                if (NIL != tm_internals.tm_lexical_predicateP(predicate)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        } else {
            return NIL;
        }
    }

    public static final SubLObject sign_relation(SubLObject sign) {
        return assertions_high.gaf_arg0(sign);
    }

    public static final SubLObject sign_concept(SubLObject sign) {
        return assertions_high.gaf_arg1(sign);
    }

    public static final SubLObject sign_term(SubLObject sign) {
        return assertions_high.gaf_arg2(sign);
    }

    public static final SubLObject sign_thesaurus(SubLObject sign) {
        return assertions_high.assertion_mt(sign);
    }

    public static final SubLObject pt_signP(SubLObject sign) {
        return makeBoolean((NIL != signp(sign)) && (sign_relation(sign) == $$preferredTerm));
    }

    /**
     * Iterate over all signs in THESAURUS, successively binding SIGN-VAR for the evaluation of BODY.  Halt iteration
     * if the variable indicated by :DONE becomes non-NIL.
     */
    public static final SubLObject do_all_signs(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt117);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sign_var = NIL;
                    SubLObject thesaurus = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    sign_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    thesaurus = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_16 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt117);
                            current_16 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt117);
                            if (NIL == member(current_16, $list_alt118, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_16 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt117);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(WITH_MT, thesaurus, listS(DO_PREDICATE_EXTENT_INDEX, list(sign_var, $$preferredTerm, $TRUTH, $TRUE, $DONE, done), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Returns _the_ sign for TERM and LEXPRED in THESAURUS.  Assumes LEXPRED is singleEntryFormatInArgs on arg2.
     */
    public static final SubLObject unique_lexpred_sign_in_thesaurus(SubLObject v_term, SubLObject lexpred, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == tm_utilities.tm_single_entry_formatP(lexpred, TWO_INTEGER, $tm_mt$.getGlobalValue())) {
                    Errors.error($str_alt124$_A_is_not___singleEntryFormatInAr, tm_internals.tm_pred_arg_symbol(lexpred, ONE_INTEGER));
                }
            }
            {
                SubLObject signs = tm_lexical_index.lexpred_signs_in_thesaurus(v_term, lexpred, thesaurus);
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = signs;
                SubLObject sign = NIL;
                for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sign = cdolist_list_var.first()) {
                    if ((sign_thesaurus(sign) == thesaurus) && (sign_relation(sign) == lexpred)) {
                        if (NIL != ans) {
                            sublisp_throw($MULTIPLE_LEXPRED, lexpred);
                        } else {
                            ans = sign;
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Returns the sign for TERM in THESAURUS, as long as the sign is a preferred-term sign, or the sign is a singleton use-for sign.  An error is generated if both are found, and NIL is returned if there's more than one use-for sign for TERM.
     */
    public static final SubLObject term_sign(SubLObject v_term, SubLObject thesaurus) {
        SubLTrampolineFile.checkType(v_term, STRINGP);
        SubLTrampolineFile.checkType(thesaurus, $sym47$THESAURUS_);
        {
            SubLObject preferred = unique_lexpred_sign_in_thesaurus(v_term, $$preferredTerm, thesaurus);
            SubLObject use_fors = tm_lexical_index.lexpred_signs_in_thesaurus(v_term, $$useFor, thesaurus);
            if ((NIL != preferred) && (NIL != use_fors)) {
                Errors.error($str_alt126$_S_is_both__S_and__S_in__S_, new SubLObject[]{ v_term, $$preferredTerm, $$useFor, thesaurus });
            } else
                if (NIL != preferred) {
                    return preferred;
                } else
                    if (NIL != list_utilities.singletonP(use_fors)) {
                        return use_fors.first();
                    } else {
                        return NIL;
                    }


        }
        return NIL;
    }

    public static final SubLObject concept_term(SubLObject concept, SubLObject thesaurus) {
        SubLTrampolineFile.checkType(concept, FORT_P);
        SubLTrampolineFile.checkType(thesaurus, $sym47$THESAURUS_);
        return kb_mapping_utilities.fpred_value_in_mt(concept, $$preferredTerm, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject term_concept(SubLObject v_term, SubLObject thesaurus) {
        SubLTrampolineFile.checkType(v_term, STRINGP);
        SubLTrampolineFile.checkType(thesaurus, $sym47$THESAURUS_);
        return sign_concept(term_sign(v_term, thesaurus));
    }

    /**
     * Returns the LEXPRED sign for CONCEPT in THESAURUS.  Assumes LEXPRED is #$singleEntryFormatInArgs in arg2.
     */
    public static final SubLObject sign_from_concept(SubLObject concept, SubLObject lexpred, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == tm_utilities.tm_single_entry_formatP(lexpred, TWO_INTEGER, $tm_mt$.getGlobalValue())) {
                    Errors.error($str_alt124$_A_is_not___singleEntryFormatInAr, lexpred);
                }
            }
            return kb_mapping.gather_gaf_arg_index(concept, ONE_INTEGER, lexpred, thesaurus, UNPROVIDED).first();
        }
    }

    /**
     * Returns the LEXPRED signs for CONCEPT in THESAURUS.
     */
    public static final SubLObject signs_from_concept(SubLObject concept, SubLObject lexpred, SubLObject thesaurus) {
        return kb_mapping.gather_gaf_arg_index(concept, ONE_INTEGER, lexpred, thesaurus, UNPROVIDED);
    }

    /**
     * Returns the Cyc FORTs which have TERM as a useFor in THESAURUS.
     */
    public static final SubLObject use_for_concepts(SubLObject v_term, SubLObject thesaurus) {
        {
            SubLObject signs = tm_lexical_index.lexpred_signs_in_thesaurus(v_term, $$useFor, thesaurus);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = signs;
            SubLObject sign = NIL;
            for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sign = cdolist_list_var.first()) {
                {
                    SubLObject item_var = sign_concept(sign);
                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    /**
     * Returns the Cyc FORT which has TERM as a preferredTerm in THESAURUS.
     */
    public static final SubLObject preferred_term_concept(SubLObject v_term, SubLObject thesaurus) {
        {
            SubLObject sign = unique_lexpred_sign_in_thesaurus(v_term, $$preferredTerm, thesaurus);
            if (NIL != signp(sign)) {
                return sign_concept(sign);
            }
        }
        return NIL;
    }

    /**
     * Return a list, each element of which is a pair of 1. a Cyc FORT having
     * TERM as it's preferred term in some thesaurus, and 2. a Cyc FORT which
     * is the thesaurus in which the FORT has TERM as a preferred term.
     */
    public static final SubLObject pt_concepts_in_thesauri(SubLObject v_term) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = tm_lexical_index.lexpred_lookup(v_term, $$preferredTerm, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject sign = NIL;
            for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sign = cdolist_list_var.first()) {
                result = cons(list(sign_concept(sign), sign_thesaurus(sign)), result);
            }
            return nreverse(result);
        }
    }

    // defparameter
    private static final SubLSymbol $tm_opcodes$ = makeSymbol("*TM-OPCODES*");

    /**
     * Returns T iFF OBJECT is one of the known opcodes.
     */
    public static final SubLObject tm_opcodeP(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return member(v_object, $tm_opcodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static final class $tm_op_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return tm_datastructures.$tm_op_native.structDecl;
        }

        public SubLObject getField2() {
            return $opcode;
        }

        public SubLObject getField3() {
            return $relation;
        }

        public SubLObject getField4() {
            return $inverseP;
        }

        public SubLObject getField5() {
            return $args;
        }

        public SubLObject getField6() {
            return $thesaurus;
        }

        public SubLObject getField7() {
            return $status;
        }

        public SubLObject getField8() {
            return $verifyP;
        }

        public SubLObject getField9() {
            return $description;
        }

        public SubLObject getField10() {
            return $description_args;
        }

        public SubLObject getField11() {
            return $hiddenP;
        }

        public SubLObject getField12() {
            return $english;
        }

        public SubLObject setField2(SubLObject value) {
            return $opcode = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $relation = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $inverseP = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $args = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $thesaurus = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $status = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $verifyP = value;
        }

        public SubLObject setField9(SubLObject value) {
            return $description = value;
        }

        public SubLObject setField10(SubLObject value) {
            return $description_args = value;
        }

        public SubLObject setField11(SubLObject value) {
            return $hiddenP = value;
        }

        public SubLObject setField12(SubLObject value) {
            return $english = value;
        }

        public SubLObject $opcode = Lisp.NIL;

        public SubLObject $relation = Lisp.NIL;

        public SubLObject $inverseP = Lisp.NIL;

        public SubLObject $args = Lisp.NIL;

        public SubLObject $thesaurus = Lisp.NIL;

        public SubLObject $status = Lisp.NIL;

        public SubLObject $verifyP = Lisp.NIL;

        public SubLObject $description = Lisp.NIL;

        public SubLObject $description_args = Lisp.NIL;

        public SubLObject $hiddenP = Lisp.NIL;

        public SubLObject $english = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(tm_datastructures.$tm_op_native.class, TM_OP, TM_OP_P, $list_alt132, $list_alt133, new String[]{ "$opcode", "$relation", "$inverseP", "$args", "$thesaurus", "$status", "$verifyP", "$description", "$description_args", "$hiddenP", "$english" }, $list_alt134, $list_alt135, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_tm_op$ = makeSymbol("*DTP-TM-OP*");

    public static final SubLObject tm_op_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject tm_op_p(SubLObject v_object) {
        return v_object.getJavaClass() ==tm_datastructures.$tm_op_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $tm_op_p$UnaryFunction extends UnaryFunction {
        public $tm_op_p$UnaryFunction() {
            super(extractFunctionNamed("TM-OP-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return tm_op_p(arg1);
        }
    }

    public static final SubLObject tm_op_opcode(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField2();
    }

    public static final SubLObject tm_op_relation(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField3();
    }

    public static final SubLObject tm_op_inverseP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField4();
    }

    public static final SubLObject tm_op_args(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField5();
    }

    public static final SubLObject tm_op_thesaurus(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField6();
    }

    public static final SubLObject tm_op_status(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField7();
    }

    public static final SubLObject tm_op_verifyP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField8();
    }

    public static final SubLObject tm_op_description(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField9();
    }

    public static final SubLObject tm_op_description_args(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField10();
    }

    public static final SubLObject tm_op_hiddenP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField11();
    }

    public static final SubLObject tm_op_english(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.getField12();
    }

    public static final SubLObject _csetf_tm_op_opcode(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tm_op_relation(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tm_op_inverseP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tm_op_args(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tm_op_thesaurus(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tm_op_status(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tm_op_verifyP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_tm_op_description(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_tm_op_description_args(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_tm_op_hiddenP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_tm_op_english(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        return v_object.setField12(value);
    }

    public static final SubLObject make_tm_op(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new tm_datastructures.$tm_op_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($OPCODE)) {
                        _csetf_tm_op_opcode(v_new, current_value);
                    } else
                        if (pcase_var.eql($RELATION)) {
                            _csetf_tm_op_relation(v_new, current_value);
                        } else
                            if (pcase_var.eql($INVERSE_)) {
                                _csetf_tm_op_inverseP(v_new, current_value);
                            } else
                                if (pcase_var.eql($ARGS)) {
                                    _csetf_tm_op_args(v_new, current_value);
                                } else
                                    if (pcase_var.eql($THESAURUS)) {
                                        _csetf_tm_op_thesaurus(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($STATUS)) {
                                            _csetf_tm_op_status(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($kw166$VERIFY_)) {
                                                _csetf_tm_op_verifyP(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($DESCRIPTION)) {
                                                    _csetf_tm_op_description(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($DESCRIPTION_ARGS)) {
                                                        _csetf_tm_op_description_args(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($kw169$HIDDEN_)) {
                                                            _csetf_tm_op_hiddenP(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($ENGLISH)) {
                                                                _csetf_tm_op_english(v_new, current_value);
                                                            } else {
                                                                Errors.error($str_alt171$Invalid_slot__S_for_construction_, current_arg);
                                                            }










                }
            }
            return v_new;
        }
    }

    /**
     * Free list for TM-OP objects
     */
    // deflexical
    private static final SubLSymbol $tm_op_free_list$ = makeSymbol("*TM-OP-FREE-LIST*");

    /**
     * Lock for TM-OP object free list
     */
    // deflexical
    private static final SubLSymbol $tm_op_free_lock$ = makeSymbol("*TM-OP-FREE-LOCK*");

    /**
     * Make a new TM-OP in the static area
     */
    public static final SubLObject make_static_tm_op() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_object = NIL;
                {
                    SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
                    try {
                        Storage.$current_area$.bind(Storage.get_static_area(), thread);
                        v_object = make_tm_op(UNPROVIDED);
                    } finally {
                        Storage.$current_area$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_object;
            }
        }
    }

    /**
     * Initialize a TM-OP for use
     */
    public static final SubLObject init_tm_op(SubLObject tm_op) {
        _csetf_tm_op_opcode(tm_op, NIL);
        _csetf_tm_op_relation(tm_op, NIL);
        _csetf_tm_op_inverseP(tm_op, NIL);
        _csetf_tm_op_args(tm_op, NIL);
        _csetf_tm_op_thesaurus(tm_op, NIL);
        _csetf_tm_op_status(tm_op, NIL);
        _csetf_tm_op_verifyP(tm_op, NIL);
        _csetf_tm_op_description(tm_op, NIL);
        _csetf_tm_op_description_args(tm_op, NIL);
        _csetf_tm_op_hiddenP(tm_op, NIL);
        _csetf_tm_op_english(tm_op, NIL);
        return tm_op;
    }

    /**
     * Check if OBJECT is a TM-OP that has been explicitly freed
     */
    public static final SubLObject free_tm_op_p(SubLObject v_object) {
        return makeBoolean((NIL != tm_op_p(v_object)) && (tm_op_opcode(v_object) == $FREE));
    }

    /**
     * Place a TM-OP onto the free list
     */
    public static final SubLObject free_tm_op(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TM_OP_P);
        if (NIL == free_tm_op_p(v_object)) {
            v_object = init_tm_op(v_object);
            _csetf_tm_op_opcode(v_object, $FREE);
            if (NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue()) {
                {
                    SubLObject lock = $tm_op_free_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        _csetf_tm_op_relation(v_object, $tm_op_free_list$.getGlobalValue());
                        $tm_op_free_list$.setGlobalValue(v_object);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Get a TM-OP from the free list, or make a new one if needed
     */
    public static final SubLObject get_tm_op() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == utilities_macros.$structure_resourcing_enabled$.getGlobalValue()) {
                if (NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread)) {
                    return init_tm_op(make_static_tm_op());
                } else {
                    return init_tm_op(make_tm_op(UNPROVIDED));
                }
            }
            {
                SubLObject v_object = NIL;
                SubLObject found = NIL;
                SubLObject lock = $tm_op_free_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    v_object = $tm_op_free_list$.getGlobalValue();
                    for (; !((NIL != found) || (NIL == v_object));) {
                        if (NIL != free_tm_op_p(v_object)) {
                            $tm_op_free_list$.setGlobalValue(tm_op_relation(v_object));
                            found = T;
                        } else {
                            v_object = tm_op_relation(v_object);
                        }
                    }
                    if (NIL == found) {
                        if (NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread)) {
                            v_object = make_static_tm_op();
                        } else {
                            v_object = make_tm_op(UNPROVIDED);
                        }
                        $tm_op_free_list$.setGlobalValue(NIL);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return init_tm_op(v_object);
            }
        }
    }

    /**
     * Returns T iff OBJ is a TM-OP and it is not :FREE
     */
    public static final SubLObject valid_tm_opP(SubLObject obj) {
        return makeBoolean((NIL != tm_op_p(obj)) && (tm_op_opcode(obj) != $FREE));
    }

    public static final SubLObject tm_op_thesaurus_abbrev(SubLObject tm_op) {
        if (NIL != forts.fort_p(tm_op_thesaurus(tm_op))) {
            return tm_internals.thesaurus_abbreviation(tm_op_thesaurus(tm_op));
        } else {
            return tm_op_thesaurus(tm_op);
        }
    }

    public static final SubLObject tm_op_thesaurus_name(SubLObject tm_op) {
        if (NIL != forts.fort_p(tm_op_thesaurus(tm_op))) {
            return tm_internals.thesaurus_name(tm_op_thesaurus(tm_op));
        } else {
            return tm_op_thesaurus(tm_op);
        }
    }

    public static final SubLObject tm_op_relation_abbrev(SubLObject tm_op) {
        {
            SubLObject relation = tm_op_relation(tm_op);
            if (NIL != forts.fort_p(relation)) {
                return tm_internals.tm_pred_arg_symbol(tm_op_relation(tm_op), NIL != tm_op_inverseP(tm_op) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER);
            } else {
                return relation;
            }
        }
    }

    public static final SubLObject tm_op_term(SubLObject tm_op) {
        if (NIL != tm_op_inverseP(tm_op)) {
            return second(tm_op_args(tm_op));
        } else {
            return tm_op_args(tm_op).first();
        }
    }

    public static final SubLObject tm_op_value(SubLObject tm_op) {
        if (NIL != tm_op_inverseP(tm_op)) {
            return tm_op_args(tm_op).first();
        } else {
            return second(tm_op_args(tm_op));
        }
    }

    public static final SubLObject arg_string(SubLObject arg) {
        if (NIL != signp(arg)) {
            return sign_term(arg);
        } else
            if (NIL != forts.fort_p(arg)) {
                return pph_main.generate_text(arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (arg.isString()) {
                    return arg;
                } else {
                    return princ_to_string(arg);
                }


    }

    public static final SubLObject set_op_status(SubLObject op, SubLObject status, SubLObject description, SubLObject description_args) {
        _csetf_tm_op_status(op, status);
        _csetf_tm_op_description(op, description);
        _csetf_tm_op_description_args(op, description_args);
        return op;
    }

    public static final SubLObject note_op_verify(SubLObject op, SubLObject description, SubLObject description_args) {
        if (NIL != tm_op_description(op)) {
            _csetf_tm_op_verifyP(op, T);
            _csetf_tm_op_description(op, cconcatenate(tm_op_description(op), description));
            _csetf_tm_op_description_args(op, append(tm_op_description_args(op), description_args));
        } else {
            _csetf_tm_op_verifyP(op, T);
            _csetf_tm_op_description(op, description);
            _csetf_tm_op_description_args(op, description_args);
        }
        return op;
    }

    public static final SubLObject initialize_operation(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject tm_op = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt174);
            tm_op = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_17 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt174);
                    current_17 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt174);
                    if (NIL == member(current_17, $list_alt175, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_17 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt174);
                }
                {
                    SubLObject opcode_tail = property_list_member($OPCODE, current);
                    SubLObject opcode = (NIL != opcode_tail) ? ((SubLObject) (cadr(opcode_tail))) : NIL;
                    SubLObject relation_tail = property_list_member($RELATION, current);
                    SubLObject relation = (NIL != relation_tail) ? ((SubLObject) (cadr(relation_tail))) : NIL;
                    SubLObject inverseP_tail = property_list_member($INVERSE_, current);
                    SubLObject inverseP = (NIL != inverseP_tail) ? ((SubLObject) (cadr(inverseP_tail))) : NIL;
                    SubLObject args_tail = property_list_member($ARGS, current);
                    SubLObject args = (NIL != args_tail) ? ((SubLObject) (cadr(args_tail))) : NIL;
                    SubLObject thesaurus_tail = property_list_member($THESAURUS, current);
                    SubLObject thesaurus = (NIL != thesaurus_tail) ? ((SubLObject) (cadr(thesaurus_tail))) : NIL;
                    SubLObject status_tail = property_list_member($STATUS, current);
                    SubLObject status = (NIL != status_tail) ? ((SubLObject) (cadr(status_tail))) : NIL;
                    SubLObject verifyP_tail = property_list_member($kw166$VERIFY_, current);
                    SubLObject verifyP = (NIL != verifyP_tail) ? ((SubLObject) (cadr(verifyP_tail))) : NIL;
                    SubLObject hiddenP_tail = property_list_member($kw169$HIDDEN_, current);
                    SubLObject hiddenP = (NIL != hiddenP_tail) ? ((SubLObject) (cadr(hiddenP_tail))) : NIL;
                    SubLObject description_tail = property_list_member($DESCRIPTION, current);
                    SubLObject description = (NIL != description_tail) ? ((SubLObject) (cadr(description_tail))) : NIL;
                    SubLObject description_args_tail = property_list_member($DESCRIPTION_ARGS, current);
                    SubLObject description_args = (NIL != description_args_tail) ? ((SubLObject) (cadr(description_args_tail))) : NIL;
                    SubLObject english_tail = property_list_member($ENGLISH, current);
                    SubLObject english = (NIL != english_tail) ? ((SubLObject) (cadr(english_tail))) : NIL;
                    SubLObject op = $sym176$OP;
                    return list(new SubLObject[]{ CLET, list(list(op, tm_op)), list(CSETF, list(TM_OP_OPCODE, op), opcode), list(CSETF, list(TM_OP_RELATION, op), relation), list(CSETF, list($sym142$TM_OP_INVERSE_, op), inverseP), list(CSETF, list(TM_OP_ARGS, op), args), list(CSETF, list(TM_OP_THESAURUS, op), thesaurus), list(CSETF, list(TM_OP_STATUS, op), status), list(CSETF, list($sym150$TM_OP_VERIFY_, op), verifyP), list(CSETF, list($sym156$TM_OP_HIDDEN_, op), hiddenP), list(CSETF, list(TM_OP_DESCRIPTION, op), description), list(CSETF, list(TM_OP_DESCRIPTION_ARGS, op), description_args), list(PIF, list(STRINGP, english), list(SET_OP_ENGLISH, op, english), list(SET_OP_ENGLISH, op)) });
                }
            }
        }
    }

    // defparameter
    private static final SubLSymbol $operation_cache_lock$ = makeSymbol("*OPERATION-CACHE-LOCK*");

    public static final SubLObject cache_operation(SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $operation_cache_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL == tm_value($tm_user$.getDynamicValue(thread), $OPERATION_CACHE)) {
                        change_tm_value($tm_user$.getDynamicValue(thread), $OPERATION_CACHE, make_hash_table($int$50, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    }
                    if (NIL == tm_value($tm_user$.getDynamicValue(thread), $OPERATION_CACHE_KEY)) {
                        change_tm_value($tm_user$.getDynamicValue(thread), $OPERATION_CACHE_KEY, ZERO_INTEGER, UNPROVIDED);
                    }
                    {
                        SubLObject key = tm_value($tm_user$.getDynamicValue(thread), $OPERATION_CACHE_KEY);
                        sethash(key, tm_value($tm_user$.getDynamicValue(thread), $OPERATION_CACHE), op);
                        change_tm_value($tm_user$.getDynamicValue(thread), $OPERATION_CACHE_KEY, add(key, ONE_INTEGER), UNPROVIDED);
                        ans = key;
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject lookup_operation(SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $operation_cache_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject table = tm_value($tm_user$.getDynamicValue(thread), $OPERATION_CACHE);
                        if (NIL != table) {
                            result = gethash(key, table, UNPROVIDED);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject decache_operation(SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = tm_value($tm_user$.getDynamicValue(thread), $OPERATION_CACHE);
                if (NIL != table) {
                    remhash(key, table);
                }
            }
            return NIL;
        }
    }



    public static final SubLObject init_tm_name_string_hash_from_kb() {
        kb_mapping.map_predicate_extent_index(symbol_function(ADD_TO_TM_NAME_STRING_HASH), $tm_name_pred$.getGlobalValue(), NIL, $tm_mt$.getGlobalValue());
        return $tm_name_string_hash$.getGlobalValue();
    }

    public static final SubLObject add_to_tm_name_string_hash(SubLObject assertion) {
        {
            SubLObject name = assertions_high.gaf_arg2(assertion);
            SubLObject constant = assertions_high.gaf_arg1(assertion);
            SubLObject current = gethash(name, $tm_name_string_hash$.getGlobalValue(), UNPROVIDED);
            if ((NIL != tm_internals.thesaurusP(constant)) || (NIL != tm_internals.tm_filterP(constant))) {
                if ((NIL != current) && (current != constant)) {
                    return Errors.error($str_alt187$Error_updating__tm_name_string_ha, name, current);
                } else {
                    return sethash(name, $tm_name_string_hash$.getGlobalValue(), constant);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject remove_from_tm_name_string_hash(SubLObject assertion) {
        {
            SubLObject name = assertions_high.gaf_arg2(assertion);
            SubLObject constant = assertions_high.gaf_arg1(assertion);
            SubLObject current = gethash(name, $tm_name_string_hash$.getGlobalValue(), UNPROVIDED);
            if ((NIL != current) && (current != constant)) {
                return Errors.error($str_alt188$Error_updating__tm_name_string_ha, current, name, constant);
            } else {
                return remhash(name, $tm_name_string_hash$.getGlobalValue());
            }
        }
    }

    public static final SubLObject tm_name_string_lookup(SubLObject name) {
        return gethash(name, $tm_name_string_hash$.getGlobalValue(), UNPROVIDED);
    }



    public static final SubLObject init_tm_abbreviation_hash_from_kb() {
        {
            SubLObject cdolist_list_var = $list_alt191;
            SubLObject relation = NIL;
            for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                kb_mapping.map_predicate_extent_index(symbol_function(ADD_TO_TM_ABBREVIATION_HASH), relation, NIL, $tm_mt$.getGlobalValue());
            }
        }
        return $tm_abbreviation_hash$.getGlobalValue();
    }

    public static final SubLObject add_to_tm_abbreviation_hash(SubLObject assertion) {
        {
            SubLObject abbrev = assertions_high.gaf_arg2(assertion);
            SubLObject constant = assertions_high.gaf_arg1(assertion);
            SubLObject current = gethash(abbrev, $tm_abbreviation_hash$.getGlobalValue(), UNPROVIDED);
            if ((NIL != tm_internals.thesaurusP(constant)) || (NIL != tm_internals.thesaurus_predicateP(constant))) {
                if ((NIL != current) && (current != constant)) {
                    return Errors.error($str_alt192$Error_updating__tm_abbreviation_h, abbrev, current);
                } else {
                    return sethash(abbrev, $tm_abbreviation_hash$.getGlobalValue(), constant);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject remove_from_tm_abbreviation_hash(SubLObject assertion) {
        {
            SubLObject string = assertions_high.gaf_arg2(assertion);
            SubLObject constant = assertions_high.gaf_arg1(assertion);
            SubLObject current = gethash(string, $tm_abbreviation_hash$.getGlobalValue(), UNPROVIDED);
            if ((NIL != current) && (current != constant)) {
                return Errors.error($str_alt193$Error_updating__tm_abbreviation_h, current, string, constant);
            } else {
                return remhash(string, $tm_abbreviation_hash$.getGlobalValue());
            }
        }
    }

    public static final SubLObject tm_abbreviation_lookup(SubLObject abbreviation) {
        return gethash(abbreviation, $tm_abbreviation_hash$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Hash table to map external (http) user ids into corresponding constants
     */
    // defparameter
    private static final SubLSymbol $tm_user_id_hash$ = makeSymbol("*TM-USER-ID-HASH*");

    /**
     * initialize *tm-user-id-hash*.
     */
    public static final SubLObject tm_init_user_id_hash_from_kb() {
        kb_mapping.map_predicate_extent_index(symbol_function(TM_ADD_TO_USER_ID_HASH), $$tmHttpUserID, NIL, $tm_mt$.getGlobalValue());
        return NIL;
    }

    /**
     * Return the constant corresponding to ENTITY-NAME, if any.
     */
    public static final SubLObject tm_user_id_lookup(SubLObject entity_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(entity_name, STRINGP);
            return gethash(entity_name, $tm_user_id_hash$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    /**
     * Return a count of the number of entities (users and applications) that have
     * string->constant mappings recorded.
     */
    public static final SubLObject tm_user_id_count() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return hash_table_count($tm_user_id_hash$.getDynamicValue(thread));
        }
    }

    /**
     * Add method for *tm-user-id-hash*
     */
    public static final SubLObject tm_add_to_user_id_hash(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_constant = assertions_high.gaf_arg1(assertion);
                SubLObject user_name = assertions_high.gaf_arg2(assertion);
                SubLObject current = gethash(user_name, $tm_user_id_hash$.getDynamicValue(thread), UNPROVIDED);
                if ((NIL != current) && (current != user_constant)) {
                    return Errors.error($str_alt196$Error_updating__tm_user_id_hash__, user_name, current);
                }
                return sethash(user_name, $tm_user_id_hash$.getDynamicValue(thread), user_constant);
            }
        }
    }

    /**
     * remove method for *tm-user-id-hash*
     */
    public static final SubLObject tm_remove_from_user_id_hash(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user_constant = assertions_high.gaf_arg1(assertion);
                SubLObject user_name = assertions_high.gaf_arg2(assertion);
                SubLObject current = gethash(user_name, $tm_user_id_hash$.getDynamicValue(thread), UNPROVIDED);
                if ((NIL != current) && (current != user_constant)) {
                    return Errors.error($str_alt197$Error_updating__tm_user_id_hash__, current, user_name, user_constant);
                }
                return remhash(user_name, $tm_user_id_hash$.getDynamicValue(thread));
            }
        }
    }

    public static final SubLObject declare_tm_datastructures_file() {
        declareFunction("tm_init_file_loadingP", "TM-INIT-FILE-LOADING?", 0, 0, false);
        declareFunction("tm_init_file_loadedP", "TM-INIT-FILE-LOADED?", 0, 0, false);
        declareFunction("init_tm_relation_predicate_map_from_kb", "INIT-TM-RELATION-PREDICATE-MAP-FROM-KB", 0, 0, false);
        declareFunction("tm_thesaurus_unreadableP", "TM-THESAURUS-UNREADABLE?", 1, 0, false);
        declareFunction("tm_thesaurus_unwritableP", "TM-THESAURUS-UNWRITABLE?", 1, 0, false);
        declareFunction("tm_start_read_operation", "TM-START-READ-OPERATION", 1, 0, false);
        declareFunction("tm_start_write_operation", "TM-START-WRITE-OPERATION", 1, 0, false);
        declareFunction("tm_finish_read_operation", "TM-FINISH-READ-OPERATION", 1, 0, false);
        declareFunction("tm_finish_write_operation", "TM-FINISH-WRITE-OPERATION", 1, 0, false);
        declareFunction("tm_start_multi_thesaurus_read_operation", "TM-START-MULTI-THESAURUS-READ-OPERATION", 1, 0, false);
        declareFunction("tm_finish_multi_thesaurus_read_operation", "TM-FINISH-MULTI-THESAURUS-READ-OPERATION", 1, 0, false);
        declareFunction("tm_make_thesaurus_unreadable", "TM-MAKE-THESAURUS-UNREADABLE", 1, 0, false);
        declareFunction("tm_make_thesaurus_readable", "TM-MAKE-THESAURUS-READABLE", 1, 0, false);
        declareFunction("tm_make_thesaurus_unwritable", "TM-MAKE-THESAURUS-UNWRITABLE", 1, 0, false);
        declareFunction("tm_make_thesaurus_writable", "TM-MAKE-THESAURUS-WRITABLE", 1, 0, false);
        declareFunction("reinit_tm_state", "REINIT-TM-STATE", 0, 0, false);
        declareFunction("make_tm_state_vector", "MAKE-TM-STATE-VECTOR", 0, 1, false);
        declareFunction("get_tm_state", "GET-TM-STATE", 1, 0, false);
        declareFunction("add_tm_vector", "ADD-TM-VECTOR", 1, 0, false);
        declareFunction("tm_value", "TM-VALUE", 2, 0, false);
        declareFunction("change_tm_value", "CHANGE-TM-VALUE", 3, 1, false);
        declareFunction("clear_utility_tables", "CLEAR-UTILITY-TABLES", 1, 0, false);
        declareFunction("reset_tm_state", "RESET-TM-STATE", 1, 0, false);
        declareFunction("return_tm_state", "RETURN-TM-STATE", 1, 0, false);
        declareFunction("print_tm_state", "PRINT-TM-STATE", 1, 0, false);
        declareFunction("clear_tm_state", "CLEAR-TM-STATE", 1, 2, false);
        declareFunction("blast_tm_state", "BLAST-TM-STATE", 0, 0, false);
        declareFunction("clear_thesaurus_from_tm_state", "CLEAR-THESAURUS-FROM-TM-STATE", 1, 0, false);
        declareFunction("clear_output_filter_from_tm_state", "CLEAR-OUTPUT-FILTER-FROM-TM-STATE", 1, 0, false);
        declareFunction("tm_init", "TM-INIT", 1, 0, false);
        declareFunction("tm_change_init", "TM-CHANGE-INIT", 2, 0, false);
        declareFunction("tm_guest_init", "TM-GUEST-INIT", 1, 0, false);
        declareFunction("tm_stoplist_wordP", "TM-STOPLIST-WORD?", 1, 0, false);
        declareFunction("tm_stoplist_words", "TM-STOPLIST-WORDS", 0, 0, false);
        declareFunction("tm_rotations", "TM-ROTATIONS", 1, 0, false);
        declareFunction("tm_determine_rotation_split", "TM-DETERMINE-ROTATION-SPLIT", 1, 0, false);
        declareFunction("tm_rotated_index_string", "TM-ROTATED-INDEX-STRING", 1, 1, false);
        declareFunction("tm_add_lexical_entry", "TM-ADD-LEXICAL-ENTRY", 1, 0, false);
        declareFunction("tm_remove_lexical_entry", "TM-REMOVE-LEXICAL-ENTRY", 1, 0, false);
        declareFunction("tm_perform_index_removal_for_thesaurus", "TM-PERFORM-INDEX-REMOVAL-FOR-THESAURUS", 1, 0, false);
        declareFunction("tm_add_stop_word", "TM-ADD-STOP-WORD", 1, 0, false);
        declareFunction("tm_remove_rotations_via", "TM-REMOVE-ROTATIONS-VIA", 2, 0, false);
        declareFunction("tm_remove_stop_word", "TM-REMOVE-STOP-WORD", 1, 0, false);
        declareFunction("tm_rebuild_alphabetical_index", "TM-REBUILD-ALPHABETICAL-INDEX", 0, 2, false);
        declareFunction("tm_possibly_add_lexical_entry", "TM-POSSIBLY-ADD-LEXICAL-ENTRY", 1, 0, false);
        declareFunction("tm_verify_update_alphabetical_index", "TM-VERIFY-UPDATE-ALPHABETICAL-INDEX", 0, 0, false);
        declareFunction("tm_alpha_complete_in_thesauri", "TM-ALPHA-COMPLETE-IN-THESAURI", 2, 3, false);
        declareFunction("tm_alpha_complete", "TM-ALPHA-COMPLETE", 5, 0, false);
        declareFunction("tm_alpha_around", "TM-ALPHA-AROUND", 3, 2, false);
        declareFunction("tm_alpha_around_thesauri", "TM-ALPHA-AROUND-THESAURI", 6, 0, false);
        declareFunction("tm_add_from_index_map", "TM-ADD-FROM-INDEX-MAP", 1, 0, false);
        declareFunction("tm_add_rotation_from_index_map", "TM-ADD-ROTATION-FROM-INDEX-MAP", 1, 0, false);
        declareFunction("tm_alpha_around_thesauri_internal", "TM-ALPHA-AROUND-THESAURI-INTERNAL", 8, 0, false);
        declareFunction("tm_alpha_around_sort", "TM-ALPHA-AROUND-SORT", 3, 0, false);
        declareFunction("signp", "SIGNP", 1, 0, false);
        declareFunction("sign_relation", "SIGN-RELATION", 1, 0, false);
        declareFunction("sign_concept", "SIGN-CONCEPT", 1, 0, false);
        declareFunction("sign_term", "SIGN-TERM", 1, 0, false);
        declareFunction("sign_thesaurus", "SIGN-THESAURUS", 1, 0, false);
        declareFunction("pt_signP", "PT-SIGN?", 1, 0, false);
        declareMacro("do_all_signs", "DO-ALL-SIGNS");
        declareFunction("unique_lexpred_sign_in_thesaurus", "UNIQUE-LEXPRED-SIGN-IN-THESAURUS", 3, 0, false);
        declareFunction("term_sign", "TERM-SIGN", 2, 0, false);
        declareFunction("concept_term", "CONCEPT-TERM", 2, 0, false);
        declareFunction("term_concept", "TERM-CONCEPT", 2, 0, false);
        declareFunction("sign_from_concept", "SIGN-FROM-CONCEPT", 3, 0, false);
        declareFunction("signs_from_concept", "SIGNS-FROM-CONCEPT", 3, 0, false);
        declareFunction("use_for_concepts", "USE-FOR-CONCEPTS", 2, 0, false);
        declareFunction("preferred_term_concept", "PREFERRED-TERM-CONCEPT", 2, 0, false);
        declareFunction("pt_concepts_in_thesauri", "PT-CONCEPTS-IN-THESAURI", 1, 0, false);
        declareFunction("tm_opcodeP", "TM-OPCODE?", 1, 0, false);
        declareFunction("tm_op_print_function_trampoline", "TM-OP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tm_op_p", "TM-OP-P", 1, 0, false);
        new tm_datastructures.$tm_op_p$UnaryFunction();
        declareFunction("tm_op_opcode", "TM-OP-OPCODE", 1, 0, false);
        declareFunction("tm_op_relation", "TM-OP-RELATION", 1, 0, false);
        declareFunction("tm_op_inverseP", "TM-OP-INVERSE?", 1, 0, false);
        declareFunction("tm_op_args", "TM-OP-ARGS", 1, 0, false);
        declareFunction("tm_op_thesaurus", "TM-OP-THESAURUS", 1, 0, false);
        declareFunction("tm_op_status", "TM-OP-STATUS", 1, 0, false);
        declareFunction("tm_op_verifyP", "TM-OP-VERIFY?", 1, 0, false);
        declareFunction("tm_op_description", "TM-OP-DESCRIPTION", 1, 0, false);
        declareFunction("tm_op_description_args", "TM-OP-DESCRIPTION-ARGS", 1, 0, false);
        declareFunction("tm_op_hiddenP", "TM-OP-HIDDEN?", 1, 0, false);
        declareFunction("tm_op_english", "TM-OP-ENGLISH", 1, 0, false);
        declareFunction("_csetf_tm_op_opcode", "_CSETF-TM-OP-OPCODE", 2, 0, false);
        declareFunction("_csetf_tm_op_relation", "_CSETF-TM-OP-RELATION", 2, 0, false);
        declareFunction("_csetf_tm_op_inverseP", "_CSETF-TM-OP-INVERSE?", 2, 0, false);
        declareFunction("_csetf_tm_op_args", "_CSETF-TM-OP-ARGS", 2, 0, false);
        declareFunction("_csetf_tm_op_thesaurus", "_CSETF-TM-OP-THESAURUS", 2, 0, false);
        declareFunction("_csetf_tm_op_status", "_CSETF-TM-OP-STATUS", 2, 0, false);
        declareFunction("_csetf_tm_op_verifyP", "_CSETF-TM-OP-VERIFY?", 2, 0, false);
        declareFunction("_csetf_tm_op_description", "_CSETF-TM-OP-DESCRIPTION", 2, 0, false);
        declareFunction("_csetf_tm_op_description_args", "_CSETF-TM-OP-DESCRIPTION-ARGS", 2, 0, false);
        declareFunction("_csetf_tm_op_hiddenP", "_CSETF-TM-OP-HIDDEN?", 2, 0, false);
        declareFunction("_csetf_tm_op_english", "_CSETF-TM-OP-ENGLISH", 2, 0, false);
        declareFunction("make_tm_op", "MAKE-TM-OP", 0, 1, false);
        declareFunction("make_static_tm_op", "MAKE-STATIC-TM-OP", 0, 0, false);
        declareFunction("init_tm_op", "INIT-TM-OP", 1, 0, false);
        declareFunction("free_tm_op_p", "FREE-TM-OP-P", 1, 0, false);
        declareFunction("free_tm_op", "FREE-TM-OP", 1, 0, false);
        declareFunction("get_tm_op", "GET-TM-OP", 0, 0, false);
        declareFunction("valid_tm_opP", "VALID-TM-OP?", 1, 0, false);
        declareFunction("tm_op_thesaurus_abbrev", "TM-OP-THESAURUS-ABBREV", 1, 0, false);
        declareFunction("tm_op_thesaurus_name", "TM-OP-THESAURUS-NAME", 1, 0, false);
        declareFunction("tm_op_relation_abbrev", "TM-OP-RELATION-ABBREV", 1, 0, false);
        declareFunction("tm_op_term", "TM-OP-TERM", 1, 0, false);
        declareFunction("tm_op_value", "TM-OP-VALUE", 1, 0, false);
        declareFunction("arg_string", "ARG-STRING", 1, 0, false);
        declareFunction("set_op_status", "SET-OP-STATUS", 4, 0, false);
        declareFunction("note_op_verify", "NOTE-OP-VERIFY", 3, 0, false);
        declareMacro("initialize_operation", "INITIALIZE-OPERATION");
        declareFunction("cache_operation", "CACHE-OPERATION", 1, 0, false);
        declareFunction("lookup_operation", "LOOKUP-OPERATION", 1, 0, false);
        declareFunction("decache_operation", "DECACHE-OPERATION", 1, 0, false);
        declareFunction("init_tm_name_string_hash_from_kb", "INIT-TM-NAME-STRING-HASH-FROM-KB", 0, 0, false);
        declareFunction("add_to_tm_name_string_hash", "ADD-TO-TM-NAME-STRING-HASH", 1, 0, false);
        declareFunction("remove_from_tm_name_string_hash", "REMOVE-FROM-TM-NAME-STRING-HASH", 1, 0, false);
        declareFunction("tm_name_string_lookup", "TM-NAME-STRING-LOOKUP", 1, 0, false);
        declareFunction("init_tm_abbreviation_hash_from_kb", "INIT-TM-ABBREVIATION-HASH-FROM-KB", 0, 0, false);
        declareFunction("add_to_tm_abbreviation_hash", "ADD-TO-TM-ABBREVIATION-HASH", 1, 0, false);
        declareFunction("remove_from_tm_abbreviation_hash", "REMOVE-FROM-TM-ABBREVIATION-HASH", 1, 0, false);
        declareFunction("tm_abbreviation_lookup", "TM-ABBREVIATION-LOOKUP", 1, 0, false);
        declareFunction("tm_init_user_id_hash_from_kb", "TM-INIT-USER-ID-HASH-FROM-KB", 0, 0, false);
        declareFunction("tm_user_id_lookup", "TM-USER-ID-LOOKUP", 1, 0, false);
        declareFunction("tm_user_id_count", "TM-USER-ID-COUNT", 0, 0, false);
        declareFunction("tm_add_to_user_id_hash", "TM-ADD-TO-USER-ID-HASH", 1, 0, false);
        declareFunction("tm_remove_from_user_id_hash", "TM-REMOVE-FROM-USER-ID-HASH", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_tm_datastructures_file() {
        deflexical("*TM-MT*", NIL != boundp($tm_mt$) ? ((SubLObject) ($tm_mt$.getGlobalValue())) : $$ThesaurusManagementMt);
        deflexical("*TM-THESAURUS-COLLECTION*", NIL != boundp($tm_thesaurus_collection$) ? ((SubLObject) ($tm_thesaurus_collection$.getGlobalValue())) : $$Thesaurus_Represented);
        deflexical("*TM-LEXICAL-PREDICATE-PRED*", NIL != boundp($tm_lexical_predicate_pred$) ? ((SubLObject) ($tm_lexical_predicate_pred$.getGlobalValue())) : $$tmLexicalPredicate);
        deflexical("*TM-THESAURUS-PRED*", NIL != boundp($tm_thesaurus_pred$) ? ((SubLObject) ($tm_thesaurus_pred$.getGlobalValue())) : $$tmThesaurus);
        deflexical("*TM-RELEASED-THESAURUS-PRED*", NIL != boundp($tm_released_thesaurus_pred$) ? ((SubLObject) ($tm_released_thesaurus_pred$.getGlobalValue())) : $$tmReleasedThesaurus);
        deflexical("*TM-UNARY-ACTIVE-PRED*", NIL != boundp($tm_unary_active_pred$) ? ((SubLObject) ($tm_unary_active_pred$.getGlobalValue())) : $$tmActiveRelation);
        deflexical("*TM-DOC-PRED-PRED*", NIL != boundp($tm_doc_pred_pred$) ? ((SubLObject) ($tm_doc_pred_pred$.getGlobalValue())) : $$tmDocumentationPredicate);
        deflexical("*TM-URL-PRED-PRED*", NIL != boundp($tm_url_pred_pred$) ? ((SubLObject) ($tm_url_pred_pred$.getGlobalValue())) : $$tmURLPredicate);
        deflexical("*TM-NAME-PRED*", NIL != boundp($tm_name_pred$) ? ((SubLObject) ($tm_name_pred$.getGlobalValue())) : $$tmNameString);
        deflexical("*THESAURUS-SUBDIRECTORIES*", NIL != boundp($thesaurus_subdirectories$) ? ((SubLObject) ($thesaurus_subdirectories$.getGlobalValue())) : $list_alt19);
        deflexical("*THESAURUS-FILENAME*", NIL != boundp($thesaurus_filename$) ? ((SubLObject) ($thesaurus_filename$.getGlobalValue())) : $str_alt21$gw_thesaurus_init);
        deflexical("*THESAURUS-FILENAME-EXTENSION*", NIL != boundp($thesaurus_filename_extension$) ? ((SubLObject) ($thesaurus_filename_extension$.getGlobalValue())) : $$$lisp);
        defparameter("*TM-DEBUG*", NIL);
        defparameter("*TM-BASIC-INTERFACE-AVAILABLE?*", T);
        defparameter("*TM-USER*", NIL);
        defparameter("*TM-ACCEPT-ONLY-KNOWN-USERS?*", NIL);
        deflexical("*TM-USER-LEVELS*", NIL != boundp($tm_user_levels$) ? ((SubLObject) ($tm_user_levels$.getGlobalValue())) : $list_alt26);
        defparameter("*TM-MAX-CHILD-DEPTH-LIMIT*", $int$100);
        defparameter("*TM-MAX-PARENT-DEPTH-LIMIT*", $int$100);
        defparameter("*TM-BASIC-INTERFACE-HIERARCHY-DEPTH*", ONE_INTEGER);
        defparameter("*THESAURUS-CYCL-TEMPLATES*", NIL);
        defparameter("*TM-INIT-FILE-LOADING?*", NIL);
        deflexical("*TM-INIT-FILE-LOADED?*", NIL);
        deflexical("*TM-OPERATIONS*", NIL != boundp($tm_operations$) ? ((SubLObject) ($tm_operations$.getGlobalValue())) : $list_alt29);
        defconstant("*TM-CORE-RELATIONS*", $list_alt30);
        deflexical("*TM-RELATION-PREDICATE-MAP*", NIL != boundp($tm_relation_predicate_map$) ? ((SubLObject) ($tm_relation_predicate_map$.getGlobalValue())) : $list_alt32);
        deflexical("*TM-OUTPUT-DIRECTORY*", NIL != boundp($tm_output_directory$) ? ((SubLObject) ($tm_output_directory$.getGlobalValue())) : NIL);
        deflexical("*TM-REPORT-DIRECTORY*", NIL != boundp($tm_report_directory$) ? ((SubLObject) ($tm_report_directory$.getGlobalValue())) : NIL);
        deflexical("*TM-LOG-DIRECTORY*", NIL != boundp($tm_log_directory$) ? ((SubLObject) ($tm_log_directory$.getGlobalValue())) : NIL);
        deflexical("*TM-LOAD-THESAURUS-DIRECTORY*", NIL != boundp($tm_load_thesaurus_directory$) ? ((SubLObject) ($tm_load_thesaurus_directory$.getGlobalValue())) : NIL);
        deflexical("*TM-PREFERENCES-DIRECTORY*", NIL != boundp($tm_preferences_directory$) ? ((SubLObject) ($tm_preferences_directory$.getGlobalValue())) : NIL);
        deflexical("*TM-PARTITION-DIRECTORY*", NIL != boundp($tm_partition_directory$) ? ((SubLObject) ($tm_partition_directory$.getGlobalValue())) : NIL);
        deflexical("*TM-PARTITION-FILENAME-EXTENSION*", NIL != boundp($tm_partition_filename_extension$) ? ((SubLObject) ($tm_partition_filename_extension$.getGlobalValue())) : $$$cfasl);
        defparameter("*TM-BG-COLOR-DEFAULT*", $LIGHT_GRAY);
        defparameter("*TM-UNREADABLE-THESAURI*", NIL);
        defparameter("*TM-UNWRITABLE-THESAURI*", NIL);
        defparameter("*TM-THESAURUS-PROTECTION-LOCK*", make_lock($$$Thesaurus_Protection_Lock));
        deflexical("*TM-STATE*", NIL != boundp($tm_state$) ? ((SubLObject) ($tm_state$.getGlobalValue())) : NIL);
        deflexical("*TM-STATE-VECTOR-LENGTH*", $int$100);
        deflexical("*TM-STATE-KEYS*", NIL != boundp($tm_state_keys$) ? ((SubLObject) ($tm_state_keys$.getGlobalValue())) : $list_alt50);
        defparameter("*TM-STATE-DEFAULTS*", $list_alt51);
        defvar("*TM-STOPLIST-TRIE*", tries.create_trie(T, $$$thesaurus_stoplist, NIL, UNPROVIDED));
        defparameter("*TM-ROTATE-CHARACTERS*", $list_alt82);
        defparameter("*TM-ROTATE-POINT-CHAR*", code_char(SEVEN_INTEGER));
        defparameter("*TM-ROTATE-POINT-STRING*", Strings.string($tm_rotate_point_char$.getDynamicValue()));
        defparameter("*TM-VALID-ROTATION-START-TEST*", symbol_function(ALPHANUMERICP));
        defparameter("*TM-DELETE-THESAURUS-SPEEDUP*", NIL);
        defvar("*TM-ALPHABETICAL-INDEX-BUILT*", NIL);
        defparameter("*INDEXING-THESAURUS*", NIL);
        defparameter("*INDEXING-LEXPRED*", NIL);
        defparameter("*TM-ALPHA-TOTAL*", NIL);
        defparameter("*TM-ALPHA-SOFAR*", NIL);
        defparameter("*TM-ALPHA-GATHER*", NIL);
        defparameter("*TM-OPCODES*", $list_alt128);
        defconstant("*DTP-TM-OP*", TM_OP);
        deflexical("*TM-OP-FREE-LIST*", NIL);
        deflexical("*TM-OP-FREE-LOCK*", make_lock($str_alt172$TM_OP_resource_lock));
        defparameter("*OPERATION-CACHE-LOCK*", make_lock($$$Operation_cache_lock));
        deflexical("*TM-NAME-STRING-HASH*", NIL != boundp($tm_name_string_hash$) ? ((SubLObject) ($tm_name_string_hash$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*TM-ABBREVIATION-HASH*", NIL != boundp($tm_abbreviation_hash$) ? ((SubLObject) ($tm_abbreviation_hash$.getGlobalValue())) : make_hash_table($int$100, symbol_function(EQUALP), UNPROVIDED));
        defparameter("*TM-USER-ID-HASH*", make_hash_table(TEN_INTEGER, symbol_function(EQUALP), UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_tm_datastructures_file() {
                subl_macro_promotions.declare_defglobal($tm_mt$);
        subl_macro_promotions.declare_defglobal($tm_thesaurus_collection$);
        subl_macro_promotions.declare_defglobal($tm_lexical_predicate_pred$);
        subl_macro_promotions.declare_defglobal($tm_thesaurus_pred$);
        subl_macro_promotions.declare_defglobal($tm_released_thesaurus_pred$);
        subl_macro_promotions.declare_defglobal($tm_unary_active_pred$);
        subl_macro_promotions.declare_defglobal($tm_doc_pred_pred$);
        subl_macro_promotions.declare_defglobal($tm_url_pred_pred$);
        subl_macro_promotions.declare_defglobal($tm_name_pred$);
        subl_macro_promotions.declare_defglobal($thesaurus_subdirectories$);
        subl_macro_promotions.declare_defglobal($thesaurus_filename$);
        subl_macro_promotions.declare_defglobal($thesaurus_filename_extension$);
        utilities_macros.register_html_state_variable($tm_user$);
        subl_macro_promotions.declare_defglobal($tm_user_levels$);
        subl_macro_promotions.declare_defglobal($tm_operations$);
        subl_macro_promotions.declare_defglobal($tm_relation_predicate_map$);
        subl_macro_promotions.declare_defglobal($tm_output_directory$);
        subl_macro_promotions.declare_defglobal($tm_report_directory$);
        subl_macro_promotions.declare_defglobal($tm_log_directory$);
        subl_macro_promotions.declare_defglobal($tm_load_thesaurus_directory$);
        subl_macro_promotions.declare_defglobal($tm_preferences_directory$);
        subl_macro_promotions.declare_defglobal($tm_partition_directory$);
        subl_macro_promotions.declare_defglobal($tm_partition_filename_extension$);
        utilities_macros.register_html_state_variable($tm_bg_color_default$);
        subl_macro_promotions.declare_defglobal($tm_state$);
        subl_macro_promotions.declare_defglobal($tm_state_keys$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tm_op$.getGlobalValue(), symbol_function(TM_OP_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TM_OP_OPCODE, _CSETF_TM_OP_OPCODE);
        def_csetf(TM_OP_RELATION, _CSETF_TM_OP_RELATION);
        def_csetf($sym142$TM_OP_INVERSE_, $sym143$_CSETF_TM_OP_INVERSE_);
        def_csetf(TM_OP_ARGS, _CSETF_TM_OP_ARGS);
        def_csetf(TM_OP_THESAURUS, _CSETF_TM_OP_THESAURUS);
        def_csetf(TM_OP_STATUS, _CSETF_TM_OP_STATUS);
        def_csetf($sym150$TM_OP_VERIFY_, $sym151$_CSETF_TM_OP_VERIFY_);
        def_csetf(TM_OP_DESCRIPTION, _CSETF_TM_OP_DESCRIPTION);
        def_csetf(TM_OP_DESCRIPTION_ARGS, _CSETF_TM_OP_DESCRIPTION_ARGS);
        def_csetf($sym156$TM_OP_HIDDEN_, $sym157$_CSETF_TM_OP_HIDDEN_);
        def_csetf(TM_OP_ENGLISH, _CSETF_TM_OP_ENGLISH);
        identity(TM_OP);
        subl_macro_promotions.declare_defglobal($tm_name_string_hash$);
        subl_macro_promotions.declare_defglobal($tm_abbreviation_hash$);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $tm_mt$ = makeSymbol("*TM-MT*");

    public static final SubLObject $$ThesaurusManagementMt = constant_handles.reader_make_constant_shell(makeString("ThesaurusManagementMt"));

    public static final SubLSymbol $tm_thesaurus_collection$ = makeSymbol("*TM-THESAURUS-COLLECTION*");

    public static final SubLObject $$Thesaurus_Represented = constant_handles.reader_make_constant_shell(makeString("Thesaurus-Represented"));

    public static final SubLSymbol $tm_lexical_predicate_pred$ = makeSymbol("*TM-LEXICAL-PREDICATE-PRED*");

    public static final SubLObject $$tmLexicalPredicate = constant_handles.reader_make_constant_shell(makeString("tmLexicalPredicate"));

    public static final SubLSymbol $tm_thesaurus_pred$ = makeSymbol("*TM-THESAURUS-PRED*");

    public static final SubLObject $$tmThesaurus = constant_handles.reader_make_constant_shell(makeString("tmThesaurus"));

    public static final SubLSymbol $tm_released_thesaurus_pred$ = makeSymbol("*TM-RELEASED-THESAURUS-PRED*");

    public static final SubLObject $$tmReleasedThesaurus = constant_handles.reader_make_constant_shell(makeString("tmReleasedThesaurus"));

    public static final SubLSymbol $tm_unary_active_pred$ = makeSymbol("*TM-UNARY-ACTIVE-PRED*");

    public static final SubLObject $$tmActiveRelation = constant_handles.reader_make_constant_shell(makeString("tmActiveRelation"));

    public static final SubLSymbol $tm_doc_pred_pred$ = makeSymbol("*TM-DOC-PRED-PRED*");

    public static final SubLObject $$tmDocumentationPredicate = constant_handles.reader_make_constant_shell(makeString("tmDocumentationPredicate"));

    public static final SubLSymbol $tm_url_pred_pred$ = makeSymbol("*TM-URL-PRED-PRED*");

    public static final SubLObject $$tmURLPredicate = constant_handles.reader_make_constant_shell(makeString("tmURLPredicate"));

    public static final SubLSymbol $tm_name_pred$ = makeSymbol("*TM-NAME-PRED*");

    public static final SubLObject $$tmNameString = constant_handles.reader_make_constant_shell(makeString("tmNameString"));

    public static final SubLSymbol $thesaurus_subdirectories$ = makeSymbol("*THESAURUS-SUBDIRECTORIES*");

    static private final SubLList $list_alt19 = list(makeString("init"), makeString("applications"));

    public static final SubLSymbol $thesaurus_filename$ = makeSymbol("*THESAURUS-FILENAME*");

    static private final SubLString $str_alt21$gw_thesaurus_init = makeString("gw-thesaurus-init");

    public static final SubLSymbol $thesaurus_filename_extension$ = makeSymbol("*THESAURUS-FILENAME-EXTENSION*");

    static private final SubLString $$$lisp = makeString("lisp");

    public static final SubLSymbol $tm_user$ = makeSymbol("*TM-USER*");

    public static final SubLSymbol $tm_user_levels$ = makeSymbol("*TM-USER-LEVELS*");

    static private final SubLList $list_alt26 = list(cons(makeString("end-user"), ONE_INTEGER), cons(makeString("advanced-user"), TWO_INTEGER), cons(makeString("limited-editor"), THREE_INTEGER), cons(makeString("full-editor"), FOUR_INTEGER), cons(makeString("administrator"), FIVE_INTEGER));



    public static final SubLSymbol $tm_operations$ = makeSymbol("*TM-OPERATIONS*");

    static private final SubLList $list_alt29 = list(makeKeyword("ADD"), makeKeyword("DELETE"), $EDIT);

    static private final SubLList $list_alt30 = list(makeString("SN"), makeString("UF"), makeString("USE"), makeString("BT"), makeString("NT"), makeString("RT"));

    public static final SubLSymbol $tm_relation_predicate_map$ = makeSymbol("*TM-RELATION-PREDICATE-MAP*");

    static private final SubLList $list_alt32 = list(list(makeString("SN"), constant_handles.reader_make_constant_shell(makeString("scopeNote")), ONE_INTEGER), list(makeString("UF"), constant_handles.reader_make_constant_shell(makeString("useFor")), ONE_INTEGER), list(makeString("USE"), constant_handles.reader_make_constant_shell(makeString("useFor")), TWO_INTEGER), list(makeString("BT"), constant_handles.reader_make_constant_shell(makeString("broaderTerm")), ONE_INTEGER), list(makeString("NT"), constant_handles.reader_make_constant_shell(makeString("broaderTerm")), TWO_INTEGER), list(makeString("RT"), constant_handles.reader_make_constant_shell(makeString("relatedTerm")), ONE_INTEGER));

    public static final SubLObject $$ThesaurusContentPredicate = constant_handles.reader_make_constant_shell(makeString("ThesaurusContentPredicate"));

    public static final SubLObject $$tmSymbol = constant_handles.reader_make_constant_shell(makeString("tmSymbol"));

    public static final SubLObject $$tmInverseSymbol = constant_handles.reader_make_constant_shell(makeString("tmInverseSymbol"));

    public static final SubLSymbol $tm_output_directory$ = makeSymbol("*TM-OUTPUT-DIRECTORY*");

    public static final SubLSymbol $tm_report_directory$ = makeSymbol("*TM-REPORT-DIRECTORY*");

    public static final SubLSymbol $tm_log_directory$ = makeSymbol("*TM-LOG-DIRECTORY*");

    public static final SubLSymbol $tm_load_thesaurus_directory$ = makeSymbol("*TM-LOAD-THESAURUS-DIRECTORY*");

    public static final SubLSymbol $tm_preferences_directory$ = makeSymbol("*TM-PREFERENCES-DIRECTORY*");

    public static final SubLSymbol $tm_partition_directory$ = makeSymbol("*TM-PARTITION-DIRECTORY*");

    public static final SubLSymbol $tm_partition_filename_extension$ = makeSymbol("*TM-PARTITION-FILENAME-EXTENSION*");

    static private final SubLString $$$cfasl = makeString("cfasl");



    public static final SubLSymbol $tm_bg_color_default$ = makeSymbol("*TM-BG-COLOR-DEFAULT*");

    static private final SubLString $$$Thesaurus_Protection_Lock = makeString("Thesaurus Protection Lock");

    static private final SubLSymbol $sym47$THESAURUS_ = makeSymbol("THESAURUS?");

    public static final SubLSymbol $tm_state$ = makeSymbol("*TM-STATE*");

    public static final SubLSymbol $tm_state_keys$ = makeSymbol("*TM-STATE-KEYS*");

    static private final SubLList $list_alt50 = list(new SubLObject[]{ cons(makeKeyword("THESAURI"), ZERO_INTEGER), cons($TERM, ONE_INTEGER), cons(makeKeyword("EDITING-ENABLED"), TWO_INTEGER), cons(makeKeyword("FULL-ALPHABETICAL"), THREE_INTEGER), cons(makeKeyword("ANNOTATED-LINKS"), FOUR_INTEGER), cons(makeKeyword("PARENT-DEPTH"), FIVE_INTEGER), cons(makeKeyword("CHILD-DEPTH"), SIX_INTEGER), cons(makeKeyword("SHOW-DESCENDANT-PARMS"), SEVEN_INTEGER), cons(makeKeyword("DISPLAY-CASE"), EIGHT_INTEGER), cons(makeKeyword("ALPHABETICAL-SHOW-USE-FORS"), NINE_INTEGER), cons(makeKeyword("DEFAULT-OPERATION"), TEN_INTEGER), cons(makeKeyword("DEFAULT-RELATION"), ELEVEN_INTEGER), cons(makeKeyword("DEFAULT-OUTPUT-MODE"), TWELVE_INTEGER), cons(makeKeyword("DEFAULT-OUTPUT-FORMAT"), THIRTEEN_INTEGER), cons(makeKeyword("USE-IMAGES"), FOURTEEN_INTEGER), cons(makeKeyword("BG-COLOR-DEFAULT"), FIFTEEN_INTEGER), cons(makeKeyword("BG-COLOR-HIERARCHICAL"), SIXTEEN_INTEGER), cons(makeKeyword("BG-COLOR-ALPHABETICAL"), SEVENTEEN_INTEGER), cons(makeKeyword("BG-COLOR-FULL-RECORD"), EIGHTEEN_INTEGER), cons(makeKeyword("GRAPH-RELATION"), NINETEEN_INTEGER), cons(makeKeyword("GRAPH-PATHS"), TWENTY_INTEGER), cons(makeKeyword("LONGEST-PATH"), makeInteger(21)), cons(makeKeyword("UTILITY-TABLE-1"), makeInteger(22)), cons(makeKeyword("DEPTH-CHAR"), makeInteger(23)), cons(makeKeyword("FULL-RECORD-HISTORY"), makeInteger(24)), cons(makeKeyword("SHOW-TERM-THESAURI"), makeInteger(25)), cons(makeKeyword("SHOW-STATUS-LINE"), makeInteger(26)), cons(makeKeyword("SAVE-OPERATIONS"), makeInteger(27)), cons(makeKeyword("OPERATION-CACHE-KEY"), makeInteger(28)), cons(makeKeyword("OPERATION-CACHE"), makeInteger(29)), cons(makeKeyword("FD-SEPARATE?"), makeInteger(30)), cons(makeKeyword("FD-TOKENIZED-DISPLAY"), makeInteger(31)), cons(makeKeyword("FD-TOKENIZED-EDITS"), makeInteger(32)), cons(makeKeyword("FD-ADD-OPS"), makeInteger(33)), cons(makeKeyword("FD-DELETE-OPS"), makeInteger(34)), cons(makeKeyword("FD-EDITING-MT-STRING"), makeInteger(35)), cons(makeKeyword("MAX-CHILDREN"), makeInteger(36)), cons(makeKeyword("CHILDREN-COUNT"), makeInteger(37)), cons(makeKeyword("COMPUTED-MAX-DEPTH"), makeInteger(38)), cons(makeKeyword("UTILITY-TABLE-2"), makeInteger(39)), cons(makeKeyword("EXPAND-PARENT-PATHS"), makeInteger(40)), cons(makeKeyword("DETAILED-HIERARCHY-TERM"), makeInteger(41)), cons(makeKeyword("SELECTED-THESAURUS"), makeInteger(42)), cons(makeKeyword("LEVEL"), makeInteger(43)), cons(makeKeyword("EDITABLE-THESAURI"), makeInteger(44)), cons(makeKeyword("OUTPUT-FILTER"), makeInteger(45)), cons(makeKeyword("DISPLAY-FILTER"), makeInteger(46)), cons(makeKeyword("SHOW-REASONS?"), makeInteger(47)), cons(makeKeyword("DEPTH-SPACING"), makeInteger(48)), cons(makeKeyword("DETAILS-SHOWN?"), makeInteger(49)), cons(makeKeyword("CORRELATE-THESAURUS"), makeInteger(50)), cons(makeKeyword("VIEW-MULTIPLE"), makeInteger(51)), cons(makeKeyword("DEFINE-RELATION-STATE"), makeInteger(52)), cons(makeKeyword("OUTPUT-THESAURUS-STATE"), makeInteger(53)), cons(makeKeyword("MONTH-EVENT-LOG-TABLE"), makeInteger(54)), cons(makeKeyword("USER-EVENT-LOG-TABLE"), makeInteger(55)), cons(makeKeyword("THESAURUS-EVENT-LOG-TABLE"), makeInteger(56)), cons(makeKeyword("INTEGRITY-THESAURUS"), makeInteger(57)), cons(makeKeyword("SEPARATE-HELP-PAGE"), makeInteger(58)), cons(makeKeyword("SHOW-HD-RELATION-LINKS"), makeInteger(59)), cons(makeKeyword("BATCH-OUTPUT"), makeInteger(60)), cons(makeKeyword("BATCH-OUTPUT-RESULT"), makeInteger(61)), cons(makeKeyword("SEARCH-RELATIONS"), makeInteger(62)), cons(makeKeyword("ASSIMILATE-THESAURUS"), makeInteger(63)), cons(makeKeyword("ASSIMILATE-CONCEPT"), makeInteger(64)), cons(makeKeyword("ASSIMILATE-CASSERTIONS"), makeInteger(65)), cons(makeKeyword("ASSIMILATE-CHOSEN-CASSERTIONS"), makeInteger(66)), cons(makeKeyword("ASSIMILATE-CHOSEN-NAME"), makeInteger(67)), cons(makeKeyword("ASSIMILATE-COMMENT"), makeInteger(68)), cons(makeKeyword("ASSIMILATE-LOGFILES"), makeInteger(69)), cons(makeKeyword("INTERFACE"), makeInteger(70)), cons(makeKeyword("SEARCHING-ALL"), makeInteger(71)), cons(makeKeyword("UPDATE-LOAD-CHANGES"), makeInteger(72)), cons(makeKeyword("UPDATE-LOAD-THESAURUS"), makeInteger(73)), cons(makeKeyword("UPDATE-LOAD-TYPE"), makeInteger(74)), cons(makeKeyword("SHOW-BY-ID"), makeInteger(75)), cons(makeKeyword("FILTER-IN-BASIC"), makeInteger(76)), cons(makeKeyword("APPLICATION-TMAP-LOG-TABLE"), makeInteger(77)), cons(makeKeyword("THESAURUS-TMAP-LOG-TABLE"), makeInteger(78)), cons(makeKeyword("EDIT-THESAURI"), makeInteger(79)), cons(makeKeyword("CORRELATION-MESSAGES"), makeInteger(80)), cons(makeKeyword("THINKINGS"), makeInteger(81)) });

    static private final SubLList $list_alt51 = list(new SubLObject[]{ cons(makeKeyword("PARENT-DEPTH"), ONE_INTEGER), cons(makeKeyword("CHILD-DEPTH"), ONE_INTEGER), cons(makeKeyword("DISPLAY-CASE"), makeKeyword("MIXED")), cons(makeKeyword("ALPHABETICAL-SHOW-USE-FORS"), T), cons(makeKeyword("DEFAULT-OPERATION"), makeKeyword("ADD")), cons(makeKeyword("DEFAULT-RELATION"), makeString("BT")), cons(makeKeyword("DEFAULT-OUTPUT-MODE"), $FILE), cons(makeKeyword("DEFAULT-OUTPUT-FORMAT"), makeKeyword("ASCII")), cons(makeKeyword("USE-IMAGES"), T), cons(makeKeyword("BG-COLOR-DEFAULT"), makeKeyword("LIGHT-GRAY")), cons(makeKeyword("BG-COLOR-HIERARCHICAL"), makeKeyword("LIGHT-YELLOW")), cons(makeKeyword("BG-COLOR-ALPHABETICAL"), makeKeyword("LIGHT-RED")), cons(makeKeyword("BG-COLOR-FULL-RECORD"), makeKeyword("LIGHT-BLUE")), cons(makeKeyword("GRAPH-RELATION"), constant_handles.reader_make_constant_shell(makeString("broaderTerm"))), cons(makeKeyword("LONGEST-PATH"), ZERO_INTEGER), cons(makeKeyword("DEPTH-CHAR"), CHAR_space), cons(makeKeyword("SHOW-TERM-THESAURI"), T), cons(makeKeyword("SHOW-STATUS-LINE"), T), list(makeKeyword("SAVE-OPERATIONS")), cons(makeKeyword("OPERATION-CACHE-KEY"), ZERO_INTEGER), list(makeKeyword("OPERATION-CACHE")), cons(makeKeyword("FD-SEPARATE?"), T), cons(makeKeyword("MAX-CHILDREN"), makeInteger(200)), cons(makeKeyword("COMPUTED-MAX-DEPTH"), ZERO_INTEGER), cons(makeKeyword("EXPAND-PARENT-PATHS"), T), cons(makeKeyword("DETAILED-HIERARCHY-TERM"), T), list(makeKeyword("SHOW-REASONS?")), cons(makeKeyword("DEPTH-SPACING"), TWO_INTEGER), list(makeKeyword("VIEW-MULTIPLE")), cons(makeKeyword("SHOW-HD-RELATION-LINKS"), T), cons(makeKeyword("SEARCH-RELATIONS"), makeKeyword("ALL")), cons(makeKeyword("INTERFACE"), makeKeyword("BASIC")), cons(makeKeyword("SHOW-BY-ID"), T) });



    private static final SubLSymbol $USER_EVENT_LOG_TABLE = makeKeyword("USER-EVENT-LOG-TABLE");

    private static final SubLSymbol $THESAURUS_EVENT_LOG_TABLE = makeKeyword("THESAURUS-EVENT-LOG-TABLE");

    private static final SubLSymbol $APPLICATION_TMAP_LOG_TABLE = makeKeyword("APPLICATION-TMAP-LOG-TABLE");

    private static final SubLSymbol $THESAURUS_TMAP_LOG_TABLE = makeKeyword("THESAURUS-TMAP-LOG-TABLE");

    static private final SubLList $list_alt57 = list(makeKeyword("UTILITY-TABLE-1"), makeKeyword("UTILITY-TABLE-2"), makeKeyword("APPLICATION-TMAP-LOG-TABLE"), makeKeyword("THESAURUS-TMAP-LOG-TABLE"), makeKeyword("MONTH-EVENT-LOG-TABLE"), makeKeyword("USER-EVENT-LOG-TABLE"), makeKeyword("THESAURUS-EVENT-LOG-TABLE"));

    static private final SubLList $list_alt58 = list(makeKeyword("UTILITY-TABLE-1"), makeKeyword("UTILITY-TABLE-2"), makeKeyword("MONTH-EVENT-LOG-TABLE"), makeKeyword("USER-EVENT-LOG-TABLE"), makeKeyword("THESAURUS-EVENT-LOG-TABLE"), makeKeyword("APPLICATION-TMAP-LOG-TABLE"), makeKeyword("THESAURUS-TMAP-LOG-TABLE"), makeKeyword("OPERATION-CACHE"));



    static private final SubLString $str_alt60$_s = makeString("~s");

    static private final SubLString $str_alt61$___a_a____s = makeString("~%~a~a . ~s");

    static private final SubLList $list_alt62 = list(makeKeyword("UTILITY-TABLE-1"), makeKeyword("UTILITY-TABLE-2"), makeKeyword("OPERATION-CACHE"));

    private static final SubLSymbol $THESAURI = makeKeyword("THESAURI");

    private static final SubLSymbol $EDIT_THESAURI = makeKeyword("EDIT-THESAURI");

    private static final SubLSymbol $SELECTED_THESAURUS = makeKeyword("SELECTED-THESAURUS");

    private static final SubLSymbol $CORRELATE_THESAURUS = makeKeyword("CORRELATE-THESAURUS");

    private static final SubLSymbol $INTEGRITY_THESAURUS = makeKeyword("INTEGRITY-THESAURUS");

    private static final SubLSymbol $OUTPUT_FILTER = makeKeyword("OUTPUT-FILTER");

    private static final SubLSymbol $DISPLAY_FILTER = makeKeyword("DISPLAY-FILTER");

    private static final SubLSymbol $LEVEL = makeKeyword("LEVEL");

    private static final SubLSymbol $EDITABLE_THESAURI = makeKeyword("EDITABLE-THESAURI");

    private static final SubLSymbol $BG_COLOR_DEFAULT = makeKeyword("BG-COLOR-DEFAULT");

    static private final SubLString $str_alt73$end_user = makeString("end-user");

    private static final SubLSymbol $SHOW_TERM_THESAURI = makeKeyword("SHOW-TERM-THESAURI");

    public static final SubLSymbol $kw75$FD_SEPARATE_ = makeKeyword("FD-SEPARATE?");

    private static final SubLSymbol $DISPLAY_CASE = makeKeyword("DISPLAY-CASE");



    private static final SubLSymbol $SHOW_HD_RELATION_LINKS = makeKeyword("SHOW-HD-RELATION-LINKS");

    private static final SubLSymbol $FILTER_IN_BASIC = makeKeyword("FILTER-IN-BASIC");



    static private final SubLString $$$thesaurus_stoplist = makeString("thesaurus stoplist");

    static private final SubLList $list_alt82 = list(CHAR_space);







    static private final SubLString $str_alt86$ = makeString("");

    private static final SubLSymbol SIGNP = makeSymbol("SIGNP");

    static private final SubLSymbol $sym88$TM_STOPLIST_WORD_ = makeSymbol("TM-STOPLIST-WORD?");





    static private final SubLString $$$Removing_lexical_indices = makeString("Removing lexical indices");

    static private final SubLString $$$Adding_lexical_indices = makeString("Adding lexical indices");

    static private final SubLString $$$building_stoplist = makeString("building stoplist");

    public static final SubLObject $$tmStoplistWord = constant_handles.reader_make_constant_shell(makeString("tmStoplistWord"));



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));





    static private final SubLString $str_alt99$indexing__A = makeString("indexing ~A");

    static private final SubLString $str_alt100$Error__no_lexical_index_for__A___ = makeString("Error: no lexical index for ~A, ~A.");

    private static final SubLSymbol TM_POSSIBLY_ADD_LEXICAL_ENTRY = makeSymbol("TM-POSSIBLY-ADD-LEXICAL-ENTRY");

    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));

    public static final SubLObject $$useFor = constant_handles.reader_make_constant_shell(makeString("useFor"));

    private static final SubLSymbol $SEARCHING_ALL = makeKeyword("SEARCHING-ALL");

    private static final SubLSymbol $INTERFACE = makeKeyword("INTERFACE");

    private static final SubLSymbol $BASIC = makeKeyword("BASIC");

    private static final SubLSymbol $SEARCH_RELATIONS = makeKeyword("SEARCH-RELATIONS");

    private static final SubLSymbol TM_ADD_FROM_INDEX_MAP = makeSymbol("TM-ADD-FROM-INDEX-MAP");

    private static final SubLSymbol STRING_GREATERP = makeSymbol("STRING-GREATERP");



    private static final SubLSymbol TM_ADD_ROTATION_FROM_INDEX_MAP = makeSymbol("TM-ADD-ROTATION-FROM-INDEX-MAP");

    static private final SubLList $list_alt112 = cons(makeSymbol("ROTATION"), makeSymbol("ASSERTION"));





    static private final SubLList $list_alt115 = cons(makeSymbol("STRING"), makeSymbol("SIGNS"));

    static private final SubLList $list_alt116 = cons(makeSymbol("CURRENT-STRING"), makeSymbol("CURRENT-SIGNS"));

    static private final SubLList $list_alt117 = list(list(makeSymbol("SIGN-VAR"), makeSymbol("THESAURUS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt118 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    static private final SubLString $str_alt124$_A_is_not___singleEntryFormatInAr = makeString("~A is not #$singleEntryFormatInArgs in arg2.");

    private static final SubLSymbol $MULTIPLE_LEXPRED = makeKeyword("MULTIPLE-LEXPRED");

    static private final SubLString $str_alt126$_S_is_both__S_and__S_in__S_ = makeString("~S is both ~S and ~S in ~S.");



    static private final SubLList $list_alt128 = list(new SubLObject[]{ $EDIT, makeKeyword("ADD"), makeKeyword("DELETE"), makeKeyword("CREATE"), makeKeyword("REPLACE"), makeKeyword("SPLICE-OUT"), $NUKE, makeKeyword("CONVERT-NT-UF"), $SWAP });

    private static final SubLSymbol TM_OP = makeSymbol("TM-OP");

    private static final SubLSymbol TM_OP_P = makeSymbol("TM-OP-P");

    public static final SubLInteger $int$200 = makeInteger(200);

    static private final SubLList $list_alt132 = list(new SubLObject[]{ makeSymbol("OPCODE"), makeSymbol("RELATION"), makeSymbol("INVERSE?"), makeSymbol("ARGS"), makeSymbol("THESAURUS"), makeSymbol("STATUS"), makeSymbol("VERIFY?"), makeSymbol("DESCRIPTION"), makeSymbol("DESCRIPTION-ARGS"), makeSymbol("HIDDEN?"), makeSymbol("ENGLISH") });

    static private final SubLList $list_alt133 = list(new SubLObject[]{ makeKeyword("OPCODE"), makeKeyword("RELATION"), makeKeyword("INVERSE?"), $ARGS, makeKeyword("THESAURUS"), makeKeyword("STATUS"), makeKeyword("VERIFY?"), makeKeyword("DESCRIPTION"), makeKeyword("DESCRIPTION-ARGS"), makeKeyword("HIDDEN?"), makeKeyword("ENGLISH") });

    static private final SubLList $list_alt134 = list(new SubLObject[]{ makeSymbol("TM-OP-OPCODE"), makeSymbol("TM-OP-RELATION"), makeSymbol("TM-OP-INVERSE?"), makeSymbol("TM-OP-ARGS"), makeSymbol("TM-OP-THESAURUS"), makeSymbol("TM-OP-STATUS"), makeSymbol("TM-OP-VERIFY?"), makeSymbol("TM-OP-DESCRIPTION"), makeSymbol("TM-OP-DESCRIPTION-ARGS"), makeSymbol("TM-OP-HIDDEN?"), makeSymbol("TM-OP-ENGLISH") });

    static private final SubLList $list_alt135 = list(new SubLObject[]{ makeSymbol("_CSETF-TM-OP-OPCODE"), makeSymbol("_CSETF-TM-OP-RELATION"), makeSymbol("_CSETF-TM-OP-INVERSE?"), makeSymbol("_CSETF-TM-OP-ARGS"), makeSymbol("_CSETF-TM-OP-THESAURUS"), makeSymbol("_CSETF-TM-OP-STATUS"), makeSymbol("_CSETF-TM-OP-VERIFY?"), makeSymbol("_CSETF-TM-OP-DESCRIPTION"), makeSymbol("_CSETF-TM-OP-DESCRIPTION-ARGS"), makeSymbol("_CSETF-TM-OP-HIDDEN?"), makeSymbol("_CSETF-TM-OP-ENGLISH") });



    private static final SubLSymbol TM_OP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TM-OP-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol TM_OP_OPCODE = makeSymbol("TM-OP-OPCODE");

    public static final SubLSymbol _CSETF_TM_OP_OPCODE = makeSymbol("_CSETF-TM-OP-OPCODE");

    private static final SubLSymbol TM_OP_RELATION = makeSymbol("TM-OP-RELATION");

    public static final SubLSymbol _CSETF_TM_OP_RELATION = makeSymbol("_CSETF-TM-OP-RELATION");

    static private final SubLSymbol $sym142$TM_OP_INVERSE_ = makeSymbol("TM-OP-INVERSE?");

    static private final SubLSymbol $sym143$_CSETF_TM_OP_INVERSE_ = makeSymbol("_CSETF-TM-OP-INVERSE?");

    private static final SubLSymbol TM_OP_ARGS = makeSymbol("TM-OP-ARGS");

    public static final SubLSymbol _CSETF_TM_OP_ARGS = makeSymbol("_CSETF-TM-OP-ARGS");

    private static final SubLSymbol TM_OP_THESAURUS = makeSymbol("TM-OP-THESAURUS");

    public static final SubLSymbol _CSETF_TM_OP_THESAURUS = makeSymbol("_CSETF-TM-OP-THESAURUS");

    private static final SubLSymbol TM_OP_STATUS = makeSymbol("TM-OP-STATUS");

    public static final SubLSymbol _CSETF_TM_OP_STATUS = makeSymbol("_CSETF-TM-OP-STATUS");

    static private final SubLSymbol $sym150$TM_OP_VERIFY_ = makeSymbol("TM-OP-VERIFY?");

    static private final SubLSymbol $sym151$_CSETF_TM_OP_VERIFY_ = makeSymbol("_CSETF-TM-OP-VERIFY?");

    private static final SubLSymbol TM_OP_DESCRIPTION = makeSymbol("TM-OP-DESCRIPTION");

    public static final SubLSymbol _CSETF_TM_OP_DESCRIPTION = makeSymbol("_CSETF-TM-OP-DESCRIPTION");

    private static final SubLSymbol TM_OP_DESCRIPTION_ARGS = makeSymbol("TM-OP-DESCRIPTION-ARGS");

    public static final SubLSymbol _CSETF_TM_OP_DESCRIPTION_ARGS = makeSymbol("_CSETF-TM-OP-DESCRIPTION-ARGS");

    static private final SubLSymbol $sym156$TM_OP_HIDDEN_ = makeSymbol("TM-OP-HIDDEN?");

    static private final SubLSymbol $sym157$_CSETF_TM_OP_HIDDEN_ = makeSymbol("_CSETF-TM-OP-HIDDEN?");

    private static final SubLSymbol TM_OP_ENGLISH = makeSymbol("TM-OP-ENGLISH");

    public static final SubLSymbol _CSETF_TM_OP_ENGLISH = makeSymbol("_CSETF-TM-OP-ENGLISH");

    private static final SubLSymbol $OPCODE = makeKeyword("OPCODE");







    private static final SubLSymbol $THESAURUS = makeKeyword("THESAURUS");



    public static final SubLSymbol $kw166$VERIFY_ = makeKeyword("VERIFY?");



    private static final SubLSymbol $DESCRIPTION_ARGS = makeKeyword("DESCRIPTION-ARGS");

    public static final SubLSymbol $kw169$HIDDEN_ = makeKeyword("HIDDEN?");



    static private final SubLString $str_alt171$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt172$TM_OP_resource_lock = makeString("TM-OP resource lock");



    static private final SubLList $list_alt174 = list(new SubLObject[]{ makeSymbol("TM-OP"), makeSymbol("&KEY"), makeSymbol("OPCODE"), makeSymbol("RELATION"), makeSymbol("INVERSE?"), makeSymbol("ARGS"), makeSymbol("THESAURUS"), makeSymbol("STATUS"), makeSymbol("VERIFY?"), makeSymbol("HIDDEN?"), makeSymbol("DESCRIPTION"), makeSymbol("DESCRIPTION-ARGS"), makeSymbol("ENGLISH") });

    static private final SubLList $list_alt175 = list(new SubLObject[]{ makeKeyword("OPCODE"), makeKeyword("RELATION"), makeKeyword("INVERSE?"), $ARGS, makeKeyword("THESAURUS"), makeKeyword("STATUS"), makeKeyword("VERIFY?"), makeKeyword("HIDDEN?"), makeKeyword("DESCRIPTION"), makeKeyword("DESCRIPTION-ARGS"), makeKeyword("ENGLISH") });

    static private final SubLSymbol $sym176$OP = makeUninternedSymbol("OP");







    private static final SubLSymbol SET_OP_ENGLISH = makeSymbol("SET-OP-ENGLISH");

    static private final SubLString $$$Operation_cache_lock = makeString("Operation cache lock");

    private static final SubLSymbol $OPERATION_CACHE = makeKeyword("OPERATION-CACHE");

    public static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol $OPERATION_CACHE_KEY = makeKeyword("OPERATION-CACHE-KEY");

    public static final SubLSymbol $tm_name_string_hash$ = makeSymbol("*TM-NAME-STRING-HASH*");

    private static final SubLSymbol ADD_TO_TM_NAME_STRING_HASH = makeSymbol("ADD-TO-TM-NAME-STRING-HASH");

    static private final SubLString $str_alt187$Error_updating__tm_name_string_ha = makeString("Error updating *tm-name-string-hash*: ~s already in use by ~a");

    static private final SubLString $str_alt188$Error_updating__tm_name_string_ha = makeString("Error updating *tm-name-string-hash*: ~a recorded as having ~s, not ~a");

    public static final SubLSymbol $tm_abbreviation_hash$ = makeSymbol("*TM-ABBREVIATION-HASH*");

    private static final SubLSymbol ADD_TO_TM_ABBREVIATION_HASH = makeSymbol("ADD-TO-TM-ABBREVIATION-HASH");

    static private final SubLList $list_alt191 = list(constant_handles.reader_make_constant_shell(makeString("tmSymbol")), constant_handles.reader_make_constant_shell(makeString("tmInverseSymbol")));

    static private final SubLString $str_alt192$Error_updating__tm_abbreviation_h = makeString("Error updating *tm-abbreviation-hash*: ~s already in use by ~a");

    static private final SubLString $str_alt193$Error_updating__tm_abbreviation_h = makeString("Error updating *tm-abbreviation-hash*: ~a recorded as having ~s, not ~a");

    private static final SubLSymbol TM_ADD_TO_USER_ID_HASH = makeSymbol("TM-ADD-TO-USER-ID-HASH");

    public static final SubLObject $$tmHttpUserID = constant_handles.reader_make_constant_shell(makeString("tmHttpUserID"));

    static private final SubLString $str_alt196$Error_updating__tm_user_id_hash__ = makeString("Error updating *tm-user-id-hash*: ~S already in use by ~A.");

    static private final SubLString $str_alt197$Error_updating__tm_user_id_hash__ = makeString("Error updating *tm-user-id-hash*: ~A recorded as having ~S, not ~A.");

    // // Initializers
    public void declareFunctions() {
        declare_tm_datastructures_file();
    }

    public void initializeVariables() {
        init_tm_datastructures_file();
    }

    public void runTopLevelForms() {
        setup_tm_datastructures_file();
    }
}

