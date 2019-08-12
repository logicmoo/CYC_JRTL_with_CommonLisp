/**
 *
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONSTANTS-LOW
 * source file: /cyc/top/cycl/constants-low.lisp
 * created:     2019/07/03 17:37:20
 */
public final class constants_low extends SubLTranslatedFile implements V12 {
    public static final SubLObject arete_note_constant_touched(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != arete.$arete_log_kb_touchesP$.getDynamicValue(thread)) {
                dictionary_utilities.dictionary_increment($arete_constants_touched$.getGlobalValue(), constant, UNPROVIDED);
            }
            return NIL;
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $arete_constants_touched$ = makeSymbol("*ARETE-CONSTANTS-TOUCHED*");

    public static final SubLFile me = new constants_low();

 public static final String myName = "com.cyc.cycjava.cycl.constants_low";


    private static final SubLSymbol $constant_guid_table$ = makeSymbol("*CONSTANT-GUID-TABLE*");

    private static final SubLSymbol $constant_merged_guid_table$ = makeSymbol("*CONSTANT-MERGED-GUID-TABLE*");

    private static final SubLSymbol $constant_from_guid$ = makeSymbol("*CONSTANT-FROM-GUID*");

    private static final SubLInteger $int$750 = makeInteger(750);

    private static final SubLSymbol CONSTANT_INFO = makeSymbol("CONSTANT-INFO");

    private static final SubLString $str6$A_constant_with_the_name__s_alrea = makeString("A constant with the name ~s already exists.");

    public static final SubLObject setup_constant_guid_table_alt(SubLObject size, SubLObject exactP) {
        {
            SubLObject setupP = NIL;
            if (NIL == id_index_p($constant_guid_table$.getGlobalValue())) {
                $constant_guid_table$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
                setupP = T;
            }
            if (NIL == id_index_p($constant_merged_guid_table$.getGlobalValue())) {
                $constant_merged_guid_table$.setGlobalValue(new_id_index($int$750, ZERO_INTEGER));
                setupP = T;
            }
            if (!$constant_from_guid$.getGlobalValue().isHashtable()) {
                $constant_from_guid$.setGlobalValue(make_hash_table(size, symbol_function(EQUALP), UNPROVIDED));
                setupP = T;
            }
            return setupP;
        }
    }

    public static SubLObject setup_constant_guid_table(final SubLObject size, final SubLObject exactP) {
        SubLObject setupP = NIL;
        if (NIL == id_index_p($constant_guid_table$.getGlobalValue())) {
            $constant_guid_table$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
            setupP = T;
        }
        if (NIL == id_index_p($constant_merged_guid_table$.getGlobalValue())) {
            $constant_merged_guid_table$.setGlobalValue(new_id_index($int$750, ZERO_INTEGER));
            setupP = T;
        }
        if (!$constant_from_guid$.getGlobalValue().isHashtable()) {
            $constant_from_guid$.setGlobalValue(make_hash_table(size, symbol_function(EQUALP), UNPROVIDED));
            setupP = T;
        }
        return setupP;
    }

    public static final SubLObject lookup_constant_guid_alt(SubLObject id) {
        return id_index_lookup($constant_guid_table$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject lookup_constant_guid(final SubLObject id) {
        return id_index_lookup($constant_guid_table$.getGlobalValue(), id, UNPROVIDED);
    }

    public static final SubLObject lookup_constant_merged_guid_alt(SubLObject id) {
        return id_index_lookup($constant_merged_guid_table$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject lookup_constant_merged_guid(final SubLObject id) {
        return id_index_lookup($constant_merged_guid_table$.getGlobalValue(), id, UNPROVIDED);
    }

    public static final SubLObject lookup_constant_by_guid_alt(SubLObject guid) {
        return gethash_without_values(guid, $constant_from_guid$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject lookup_constant_by_guid(final SubLObject guid) {
        return gethash_without_values(guid, $constant_from_guid$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Note that ID will be used as the id for CONSTANT-GUID,
     * and that the constant with guid CONSTANT-GUID is CONSTANT.
     */
    @LispMethod(comment = "Note that ID will be used as the id for CONSTANT-GUID,\r\nand that the constant with guid CONSTANT-GUID is CONSTANT.\nNote that ID will be used as the id for CONSTANT-GUID,\nand that the constant with guid CONSTANT-GUID is CONSTANT.")
    public static final SubLObject register_constant_guid_alt(SubLObject id, SubLObject constant_guid, SubLObject constant) {
        id_index_enter($constant_guid_table$.getGlobalValue(), id, constant_guid);
        sethash(constant_guid, $constant_from_guid$.getGlobalValue(), constant);
        return constant_guid;
    }

    /**
     * Note that ID will be used as the id for CONSTANT-GUID,
     * and that the constant with guid CONSTANT-GUID is CONSTANT.
     */
    @LispMethod(comment = "Note that ID will be used as the id for CONSTANT-GUID,\r\nand that the constant with guid CONSTANT-GUID is CONSTANT.\nNote that ID will be used as the id for CONSTANT-GUID,\nand that the constant with guid CONSTANT-GUID is CONSTANT.")
    public static SubLObject register_constant_guid(final SubLObject id, final SubLObject constant_guid, final SubLObject constant) {
        id_index_enter($constant_guid_table$.getGlobalValue(), id, constant_guid);
        sethash(constant_guid, $constant_from_guid$.getGlobalValue(), constant);
        return constant_guid;
    }

    /**
     * Note that the constant with guid CONSTANT-GUID is CONSTANT.
     */
    @LispMethod(comment = "Note that the constant with guid CONSTANT-GUID is CONSTANT.")
    public static final SubLObject register_constant_merged_guid_alt(SubLObject id, SubLObject constant_guid, SubLObject constant) {
        id_index_enter($constant_merged_guid_table$.getGlobalValue(), id, constant_guid);
        sethash(constant_guid, $constant_from_guid$.getGlobalValue(), constant);
        return constant_guid;
    }

    /**
     * Note that the constant with guid CONSTANT-GUID is CONSTANT.
     */
    @LispMethod(comment = "Note that the constant with guid CONSTANT-GUID is CONSTANT.")
    public static SubLObject register_constant_merged_guid(final SubLObject id, final SubLObject constant_guid, final SubLObject constant) {
        id_index_enter($constant_merged_guid_table$.getGlobalValue(), id, constant_guid);
        sethash(constant_guid, $constant_from_guid$.getGlobalValue(), constant);
        return constant_guid;
    }

    /**
     * Note that ID is not in use as a CONSTANT id, i.e. no longer points to GUID.
     */
    @LispMethod(comment = "Note that ID is not in use as a CONSTANT id, i.e. no longer points to GUID.")
    public static final SubLObject deregister_constant_guid_alt(SubLObject id, SubLObject guid) {
        id_index_remove($constant_guid_table$.getGlobalValue(), id);
        remhash(guid, $constant_from_guid$.getGlobalValue());
        return NIL;
    }

    @LispMethod(comment = "Note that ID is not in use as a CONSTANT id, i.e. no longer points to GUID.")
    public static SubLObject deregister_constant_guid(final SubLObject id, final SubLObject guid) {
        id_index_remove($constant_guid_table$.getGlobalValue(), id);
        remhash(guid, $constant_from_guid$.getGlobalValue());
        return NIL;
    }/**
     * Note that ID is not in use as a CONSTANT id, i.e. no longer points to GUID.
     */


    /**
     * Note GUID no longer points to CONSTANT
     */
    @LispMethod(comment = "Note GUID no longer points to CONSTANT")
    public static final SubLObject deregister_constant_merged_guid_alt(SubLObject id, SubLObject guid) {
        id_index_remove($constant_merged_guid_table$.getGlobalValue(), id);
        remhash(guid, $constant_from_guid$.getGlobalValue());
        return NIL;
    }

    @LispMethod(comment = "Note GUID no longer points to CONSTANT")
    public static SubLObject deregister_constant_merged_guid(final SubLObject id, final SubLObject guid) {
        id_index_remove($constant_merged_guid_table$.getGlobalValue(), id);
        remhash(guid, $constant_from_guid$.getGlobalValue());
        return NIL;
    }/**
     * Note GUID no longer points to CONSTANT
     */


    public static final SubLObject clear_constant_guid_table_alt() {
        clear_id_index($constant_guid_table$.getGlobalValue());
        clear_id_index($constant_merged_guid_table$.getGlobalValue());
        clrhash($constant_from_guid$.getGlobalValue());
        return NIL;
    }

    public static SubLObject clear_constant_guid_table() {
        clear_id_index($constant_guid_table$.getGlobalValue());
        clear_id_index($constant_merged_guid_table$.getGlobalValue());
        clrhash($constant_from_guid$.getGlobalValue());
        return NIL;
    }

    /**
     * Create a new constant named NAME with id EXTERNAL-ID  Return a SUID.
     */
    @LispMethod(comment = "Create a new constant named NAME with id EXTERNAL-ID  Return a SUID.")
    public static final SubLObject kb_create_constant_kb_store_alt(SubLObject name, SubLObject external_id) {
        {
            SubLObject constant = com.cyc.cycjava.cycl.constants_low.lookup_constant_by_guid(external_id);
            if (NIL != constant) {
                return constants_high.constant_internal_id(constant);
            } else {
                {
                    SubLObject suid = make_constant_suid();
                    constant = make_constant_shell(name, T);
                    install_constant_suid(constant, suid);
                    if (name.isString()) {
                        deregister_invalid_constant_by_name(name);
                    }
                    com.cyc.cycjava.cycl.constants_low.kb_create_constant_int(constant, name, external_id);
                    return suid;
                }
            }
        }
    }

    /**
     * Create a new constant named NAME with id EXTERNAL-ID  Return a SUID.
     */
    @LispMethod(comment = "Create a new constant named NAME with id EXTERNAL-ID  Return a SUID.")
    public static SubLObject kb_create_constant_kb_store(final SubLObject name, final SubLObject external_id) {
        SubLObject constant = lookup_constant_by_guid(external_id);
        if (NIL != constant) {
            return constants_high.constant_internal_id(constant);
        }
        final SubLObject suid = make_constant_suid();
        constant = make_constant_shell(name, T);
        install_constant_suid(constant, suid);
        if (name.isString()) {
            deregister_invalid_constant_by_name(name);
        }
        kb_create_constant_int(constant, name, external_id);
        return suid;
    }

    public static final SubLObject kb_create_constant_int_alt(SubLObject constant, SubLObject name, SubLObject external_id) {
        com.cyc.cycjava.cycl.constants_low.install_constant_external_id(constant, external_id);
        if (name.isString()) {
            constant_completion_low.add_constant_to_completions(constant, name);
        }
        return NIL;
    }

    public static SubLObject kb_create_constant_int(final SubLObject constant, final SubLObject name, final SubLObject external_id) {
        install_constant_external_id(constant, external_id);
        if (name.isString()) {
            constant_completion_low.add_constant_to_completions(constant, name);
        }
        return NIL;
    }

    /**
     * Create a handle for a constant named NAME and with id SUID.
     */
    @LispMethod(comment = "Create a handle for a constant named NAME and with id SUID.")
    public static final SubLObject kb_create_constant_cyc_alt(SubLObject name, SubLObject internal_id) {
        {
            SubLObject constant = make_constant_shell(name, T);
            com.cyc.cycjava.cycl.constants_low.install_constant_internal_id(constant, internal_id);
            if (name.isString()) {
                deregister_invalid_constant_by_name(name);
            }
            return constant;
        }
    }

    @LispMethod(comment = "Create a handle for a constant named NAME and with id SUID.")
    public static SubLObject kb_create_constant_cyc(final SubLObject name, final SubLObject internal_id) {
        final SubLObject constant = make_constant_shell(name, T);
        install_constant_internal_id(constant, internal_id);
        if (name.isString()) {
            deregister_invalid_constant_by_name(name);
        }
        return constant;
    }/**
     * Create a handle for a constant named NAME and with id SUID.
     */


    /**
     * Install the ids for CONSTANT based on EXTERNAL-ID.
     */
    @LispMethod(comment = "Install the ids for CONSTANT based on EXTERNAL-ID.")
    public static final SubLObject install_constant_external_id_alt(SubLObject constant, SubLObject external_id) {
        {
            SubLObject guid = NIL;
            if (NIL != constants_high.constant_legacy_id_p(external_id)) {
                guid = constants_high.make_constant_legacy_guid(external_id);
            } else {
                if (NIL != Guids.guid_p(external_id)) {
                    guid = external_id;
                }
            }
            com.cyc.cycjava.cycl.constants_low.install_constant_guid(constant, guid);
            return constant;
        }
    }

    @LispMethod(comment = "Install the ids for CONSTANT based on EXTERNAL-ID.")
    public static SubLObject install_constant_external_id(final SubLObject constant, final SubLObject external_id) {
        SubLObject guid = NIL;
        if (NIL != constants_high.constant_legacy_id_p(external_id)) {
            guid = constants_high.make_constant_legacy_guid(external_id);
        } else
            if (NIL != Guids.guid_p(external_id)) {
                guid = external_id;
            }

        install_constant_guid(constant, guid);
        return constant;
    }/**
     * Install the ids for CONSTANT based on EXTERNAL-ID.
     */


    public static final SubLObject install_constant_internal_id_alt(SubLObject constant, SubLObject internal_id) {
        return install_constant_suid(constant, internal_id);
    }

    public static SubLObject install_constant_internal_id(final SubLObject constant, final SubLObject internal_id) {
        return install_constant_suid(constant, internal_id);
    }

    public static final SubLObject kb_remove_constant_internal_alt(SubLObject constant) {
        {
            SubLObject name = com.cyc.cycjava.cycl.constants_low.constant_name_internal(constant);
            if (name.isString()) {
                constant_completion_low.remove_constant_from_completions(constant, name);
                deregister_invalid_constant_by_name(name);
            }
        }
        com.cyc.cycjava.cycl.constants_low.deregister_constant_guts(constant);
        com.cyc.cycjava.cycl.constants_low.deregister_constant_ids(constant);
        free_constant(constant);
        return NIL;
    }

    public static SubLObject kb_remove_constant_internal(final SubLObject constant) {
        final SubLObject name = constant_name_internal(constant);
        if (name.isString()) {
            constant_completion_low.remove_constant_from_completions(constant, name);
            deregister_invalid_constant_by_name(name);
        }
        deregister_constant_guts(constant);
        deregister_constant_ids(constant);
        free_constant(constant);
        return NIL;
    }

    public static final SubLObject deregister_constant_guts_alt(SubLObject constant) {
        {
            SubLObject suid = constant_suid(constant);
            if (suid.isInteger()) {
                constant_index_manager.deregister_constant_index(suid);
            }
        }
        return constant;
    }

    public static SubLObject deregister_constant_guts(final SubLObject constant) {
        final SubLObject suid = constant_suid(constant);
        if (suid.isInteger()) {
            constant_index_manager.deregister_constant_index(suid);
        }
        return constant;
    }

    /**
     * Remove all the id indexing to CONSTANT.
     */
    @LispMethod(comment = "Remove all the id indexing to CONSTANT.")
    public static final SubLObject deregister_constant_ids_alt(SubLObject constant) {
        {
            SubLObject guid = constants_high.constant_guid(constant);
            if (NIL != Guids.guid_p(guid)) {
                com.cyc.cycjava.cycl.constants_low.deregister_constant_guid(constant_suid(constant), guid);
            }
        }
        {
            SubLObject guid = constants_high.constant_merged_guid(constant);
            if (NIL != Guids.guid_p(guid)) {
                com.cyc.cycjava.cycl.constants_low.deregister_constant_merged_guid(constant_suid(constant), guid);
            }
        }
        {
            SubLObject suid = constant_suid(constant);
            if (suid.isInteger()) {
                deregister_constant_suid(suid);
            }
        }
        return constant;
    }

    @LispMethod(comment = "Remove all the id indexing to CONSTANT.")
    public static SubLObject deregister_constant_ids(final SubLObject constant) {
        SubLObject guid = constants_high.constant_guid(constant);
        if (NIL != Guids.guid_p(guid)) {
            deregister_constant_guid(constant_suid(constant), guid);
        }
        guid = constants_high.constant_merged_guid(constant);
        if (NIL != Guids.guid_p(guid)) {
            deregister_constant_merged_guid(constant_suid(constant), guid);
        }
        final SubLObject suid = constant_suid(constant);
        if (suid.isInteger()) {
            deregister_constant_suid(suid);
        }
        return constant;
    }/**
     * Remove all the id indexing to CONSTANT.
     */


    public static final SubLObject constant_guid_internal_alt(SubLObject constant) {
        {
            SubLObject id = constant_suid(constant);
            return com.cyc.cycjava.cycl.constants_low.lookup_constant_guid(id);
        }
    }

    public static SubLObject constant_guid_internal(final SubLObject constant) {
        final SubLObject id = constant_suid(constant);
        return lookup_constant_guid(id);
    }

    public static final SubLObject constant_merged_guid_internal_alt(SubLObject constant) {
        {
            SubLObject id = constant_suid(constant);
            return com.cyc.cycjava.cycl.constants_low.lookup_constant_merged_guid(id);
        }
    }

    public static SubLObject constant_merged_guid_internal(final SubLObject constant) {
        final SubLObject id = constant_suid(constant);
        return lookup_constant_merged_guid(id);
    }

    public static final SubLObject constant_name_internal_alt(SubLObject constant) {
        return c_name(constant);
    }

    public static SubLObject constant_name_internal(final SubLObject constant) {
        return c_name(constant);
    }

    /**
     * Return the indexing structure for CONSTANT.
     */
    @LispMethod(comment = "Return the indexing structure for CONSTANT.")
    public static final SubLObject constant_index_alt(SubLObject constant) {
        {
            SubLObject id = constant_suid(constant);
            if (NIL != id) {
                return constant_index_manager.lookup_constant_index(id);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return the indexing structure for CONSTANT.")
    public static SubLObject constant_index(final SubLObject constant) {
        final SubLObject id = constant_suid(constant);
        if (NIL != id) {
            return constant_index_manager.lookup_constant_index(id);
        }
        return NIL;
    }/**
     * Return the indexing structure for CONSTANT.
     */


    public static SubLObject constant_index_swapped_inP(final SubLObject constant) {
        arete.arete_note_constant_touched(constant);
        final SubLObject id = constant_suid(constant);
        if (NIL != id) {
            return constant_index_manager.constant_index_cachedP(id);
        }
        return NIL;
    }

    public static final SubLObject kb_new_constant_info_iterator_internal_alt() {
        {
            SubLObject input_iterator = new_constants_iterator();
            return iteration.new_indirect_iterator(input_iterator, CONSTANT_INFO, UNPROVIDED);
        }
    }

    public static SubLObject kb_new_constant_info_iterator_internal() {
        final SubLObject input_iterator = new_constants_iterator();
        return iteration.new_indirect_iterator(input_iterator, CONSTANT_INFO, UNPROVIDED);
    }

    public static final SubLObject constant_info_alt(SubLObject constant) {
        {
            SubLObject suid = constant_suid(constant);
            SubLObject name = com.cyc.cycjava.cycl.constants_low.constant_name_internal(constant);
            SubLObject guid = (suid.isInteger()) ? ((SubLObject) (com.cyc.cycjava.cycl.constants_low.constant_guid_internal(constant))) : NIL;
            return list(suid, name, guid);
        }
    }

    public static SubLObject constant_info(final SubLObject constant) {
        final SubLObject suid = constant_suid(constant);
        final SubLObject name = constant_name_internal(constant);
        final SubLObject guid = (suid.isInteger()) ? constant_guid_internal(constant) : NIL;
        return list(suid, name, guid);
    }

    /**
     * Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.
     */
    @LispMethod(comment = "Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.")
    public static final SubLObject kb_rename_constant_internal_alt(SubLObject constant, SubLObject new_name) {
        if (NIL != constants_interface.kb_lookup_constant_by_name(new_name)) {
            Errors.error($str_alt7$A_constant_with_the_name__s_alrea, new_name);
        }
        {
            SubLObject old_name = constants_high.constant_name(constant);
            if (old_name.isString()) {
                constant_completion_low.remove_constant_from_completions(constant, old_name);
                deregister_invalid_constant_by_name(old_name);
            }
        }
        com.cyc.cycjava.cycl.constants_low.reset_constant_name(constant, new_name);
        if (new_name.isString()) {
            constant_completion_low.add_constant_to_completions(constant, new_name);
            register_invalid_constant_by_name(new_name, constant);
        }
        return constant;
    }

    @LispMethod(comment = "Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.")
    public static SubLObject kb_rename_constant_internal(final SubLObject constant, final SubLObject new_name) {
        if (NIL != constants_interface.kb_lookup_constant_by_name(new_name)) {
            Errors.error($str6$A_constant_with_the_name__s_alrea, new_name);
        }
        final SubLObject old_name = constants_high.constant_name(constant);
        if (old_name.isString()) {
            constant_completion_low.remove_constant_from_completions(constant, old_name);
            deregister_invalid_constant_by_name(old_name);
        }
        reset_constant_name(constant, new_name);
        if (new_name.isString()) {
            constant_completion_low.add_constant_to_completions(constant, new_name);
            register_invalid_constant_by_name(new_name, constant);
        }
        return constant;
    }/**
     * Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.
     */


    /**
     * Primitively change the name of CONSTANT to NEW-NAME.
     */
    @LispMethod(comment = "Primitively change the name of CONSTANT to NEW-NAME.")
    public static final SubLObject reset_constant_name_alt(SubLObject constant, SubLObject new_name) {
        _csetf_c_name(constant, new_name);
        return constant;
    }

    @LispMethod(comment = "Primitively change the name of CONSTANT to NEW-NAME.")
    public static SubLObject reset_constant_name(final SubLObject constant, final SubLObject new_name) {
        _csetf_c_name(constant, new_name);
        return constant;
    }/**
     * Primitively change the name of CONSTANT to NEW-NAME.
     */


    /**
     * Primitively change the assertion index for CONSTANT to NEW-INDEX.
     */
    @LispMethod(comment = "Primitively change the assertion index for CONSTANT to NEW-INDEX.")
    public static final SubLObject reset_constant_index_alt(SubLObject constant, SubLObject new_index) {
        constant_index_manager.register_constant_index(constant_suid(constant), new_index);
        return constant;
    }

    @LispMethod(comment = "Primitively change the assertion index for CONSTANT to NEW-INDEX.")
    public static SubLObject reset_constant_index(final SubLObject constant, final SubLObject new_index) {
        constant_index_manager.register_constant_index(constant_suid(constant), new_index);
        return constant;
    }/**
     * Primitively change the assertion index for CONSTANT to NEW-INDEX.
     */


    public static final SubLObject install_constant_guid_alt(SubLObject constant, SubLObject guid) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        SubLTrampolineFile.checkType(guid, GUID_P);
        if (NIL == Guids.guid_p(constants_high.constant_guid(constant))) {
            com.cyc.cycjava.cycl.constants_low.reset_constant_guid(constant, guid);
        }
        return constant;
    }

    public static SubLObject install_constant_guid(final SubLObject constant, final SubLObject guid) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        assert NIL != Guids.guid_p(guid) : "! Guids.guid_p(guid) " + ("Guids.guid_p(guid) " + "CommonSymbols.NIL != Guids.guid_p(guid) ") + guid;
        if (NIL == Guids.guid_p(constants_high.constant_guid(constant))) {
            reset_constant_guid(constant, guid);
        }
        return constant;
    }

    /**
     * Primitively change the GUID of CONSTANT to NEW-GUID.
     */
    @LispMethod(comment = "Primitively change the GUID of CONSTANT to NEW-GUID.")
    public static final SubLObject reset_constant_guid_alt(SubLObject constant, SubLObject new_guid) {
        com.cyc.cycjava.cycl.constants_low.register_constant_guid(constant_suid(constant), new_guid, constant);
        return constant;
    }

    @LispMethod(comment = "Primitively change the GUID of CONSTANT to NEW-GUID.")
    public static SubLObject reset_constant_guid(final SubLObject constant, final SubLObject new_guid) {
        register_constant_guid(constant_suid(constant), new_guid, constant);
        return constant;
    }/**
     * Primitively change the GUID of CONSTANT to NEW-GUID.
     */


    public static final SubLObject install_constant_merged_guid_alt(SubLObject constant, SubLObject new_guid) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        SubLTrampolineFile.checkType(new_guid, GUID_P);
        if (NIL != Guids.guid_p(constants_high.constant_guid(constant))) {
            com.cyc.cycjava.cycl.constants_low.register_constant_merged_guid(constant_suid(constant), new_guid, constant);
        }
        return constant;
    }

    public static SubLObject install_constant_merged_guid(final SubLObject constant, final SubLObject new_guid) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        assert NIL != Guids.guid_p(new_guid) : "! Guids.guid_p(new_guid) " + ("Guids.guid_p(new_guid) " + "CommonSymbols.NIL != Guids.guid_p(new_guid) ") + new_guid;
        if (NIL != Guids.guid_p(constants_high.constant_guid(constant))) {
            register_constant_merged_guid(constant_suid(constant), new_guid, constant);
        }
        return constant;
    }

    public static final SubLObject uninstall_constant_merged_guid_alt(SubLObject constant, SubLObject new_guid) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        SubLTrampolineFile.checkType(new_guid, GUID_P);
        if (NIL != Guids.guid_p(constants_high.constant_guid(constant))) {
            com.cyc.cycjava.cycl.constants_low.deregister_constant_merged_guid(constant_suid(constant), new_guid);
        }
        return constant;
    }

    public static SubLObject uninstall_constant_merged_guid(final SubLObject constant, final SubLObject new_guid) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        assert NIL != Guids.guid_p(new_guid) : "! Guids.guid_p(new_guid) " + ("Guids.guid_p(new_guid) " + "CommonSymbols.NIL != Guids.guid_p(new_guid) ") + new_guid;
        if (NIL != Guids.guid_p(constants_high.constant_guid(constant))) {
            deregister_constant_merged_guid(constant_suid(constant), new_guid);
        }
        return constant;
    }

    public static SubLObject random_constant_internal(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        if (constant_count().numG(ZERO_INTEGER)) {
            final SubLObject max_id = next_constant_suid();
            SubLObject v_answer;
            SubLObject candidate;
            for (v_answer = NIL; NIL == v_answer; v_answer = candidate) {
                candidate = find_constant_by_suid(random.random(max_id));
                if ((NIL != candidate) && (NIL != funcall(test, candidate))) {
                }
            }
            return v_answer;
        }
        return NIL;
    }

    /**
     * Install GUID for CONSTANT with DUMP-ID in a KB load.
     */
    @LispMethod(comment = "Install GUID for CONSTANT with DUMP-ID in a KB load.")
    public static final SubLObject load_install_constant_ids_alt(SubLObject constant, SubLObject dump_id, SubLObject guid) {
        {
            SubLObject name = com.cyc.cycjava.cycl.constants_low.constant_name_internal(constant);
            SubLObject suid = dump_id;
            install_constant_suid(constant, suid);
            deregister_invalid_constant_by_name(name);
            com.cyc.cycjava.cycl.constants_low.kb_create_constant_int(constant, name, guid);
            return constant;
        }
    }

    @LispMethod(comment = "Install GUID for CONSTANT with DUMP-ID in a KB load.")
    public static SubLObject load_install_constant_ids(final SubLObject constant, final SubLObject dump_id, final SubLObject guid) {
        final SubLObject name = constant_name_internal(constant);
        install_constant_suid(constant, dump_id);
        deregister_invalid_constant_by_name(name);
        kb_create_constant_int(constant, name, guid);
        return constant;
    }/**
     * Install GUID for CONSTANT with DUMP-ID in a KB load.
     */


    public static final SubLObject declare_constants_low_file_alt() {
        declareFunction("arete_note_constant_touched", "ARETE-NOTE-CONSTANT-TOUCHED", 1, 0, false);
        declareFunction("setup_constant_guid_table", "SETUP-CONSTANT-GUID-TABLE", 2, 0, false);
        declareFunction("lookup_constant_guid", "LOOKUP-CONSTANT-GUID", 1, 0, false);
        declareFunction("lookup_constant_merged_guid", "LOOKUP-CONSTANT-MERGED-GUID", 1, 0, false);
        declareFunction("lookup_constant_by_guid", "LOOKUP-CONSTANT-BY-GUID", 1, 0, false);
        declareFunction("register_constant_guid", "REGISTER-CONSTANT-GUID", 3, 0, false);
        declareFunction("register_constant_merged_guid", "REGISTER-CONSTANT-MERGED-GUID", 3, 0, false);
        declareFunction("deregister_constant_guid", "DEREGISTER-CONSTANT-GUID", 2, 0, false);
        declareFunction("deregister_constant_merged_guid", "DEREGISTER-CONSTANT-MERGED-GUID", 2, 0, false);
        declareFunction("clear_constant_guid_table", "CLEAR-CONSTANT-GUID-TABLE", 0, 0, false);
        declareFunction("kb_create_constant_kb_store", "KB-CREATE-CONSTANT-KB-STORE", 2, 0, false);
        declareFunction("kb_create_constant_int", "KB-CREATE-CONSTANT-INT", 3, 0, false);
        declareFunction("kb_create_constant_cyc", "KB-CREATE-CONSTANT-CYC", 2, 0, false);
        declareFunction("install_constant_external_id", "INSTALL-CONSTANT-EXTERNAL-ID", 2, 0, false);
        declareFunction("install_constant_internal_id", "INSTALL-CONSTANT-INTERNAL-ID", 2, 0, false);
        declareFunction("kb_remove_constant_internal", "KB-REMOVE-CONSTANT-INTERNAL", 1, 0, false);
        declareFunction("deregister_constant_guts", "DEREGISTER-CONSTANT-GUTS", 1, 0, false);
        declareFunction("deregister_constant_ids", "DEREGISTER-CONSTANT-IDS", 1, 0, false);
        declareFunction("constant_guid_internal", "CONSTANT-GUID-INTERNAL", 1, 0, false);
        declareFunction("constant_merged_guid_internal", "CONSTANT-MERGED-GUID-INTERNAL", 1, 0, false);
        declareFunction("constant_name_internal", "CONSTANT-NAME-INTERNAL", 1, 0, false);
        declareFunction("constant_index", "CONSTANT-INDEX", 1, 0, false);
        declareFunction("kb_new_constant_info_iterator_internal", "KB-NEW-CONSTANT-INFO-ITERATOR-INTERNAL", 0, 0, false);
        declareFunction("constant_info", "CONSTANT-INFO", 1, 0, false);
        declareFunction("kb_rename_constant_internal", "KB-RENAME-CONSTANT-INTERNAL", 2, 0, false);
        declareFunction("reset_constant_name", "RESET-CONSTANT-NAME", 2, 0, false);
        declareFunction("reset_constant_index", "RESET-CONSTANT-INDEX", 2, 0, false);
        declareFunction("install_constant_guid", "INSTALL-CONSTANT-GUID", 2, 0, false);
        declareFunction("reset_constant_guid", "RESET-CONSTANT-GUID", 2, 0, false);
        declareFunction("install_constant_merged_guid", "INSTALL-CONSTANT-MERGED-GUID", 2, 0, false);
        declareFunction("uninstall_constant_merged_guid", "UNINSTALL-CONSTANT-MERGED-GUID", 2, 0, false);
        declareFunction("load_install_constant_ids", "LOAD-INSTALL-CONSTANT-IDS", 3, 0, false);
        return NIL;
    }

    public static SubLObject declare_constants_low_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("setup_constant_guid_table", "SETUP-CONSTANT-GUID-TABLE", 2, 0, false);
            declareFunction("lookup_constant_guid", "LOOKUP-CONSTANT-GUID", 1, 0, false);
            declareFunction("lookup_constant_merged_guid", "LOOKUP-CONSTANT-MERGED-GUID", 1, 0, false);
            declareFunction("lookup_constant_by_guid", "LOOKUP-CONSTANT-BY-GUID", 1, 0, false);
            declareFunction("register_constant_guid", "REGISTER-CONSTANT-GUID", 3, 0, false);
            declareFunction("register_constant_merged_guid", "REGISTER-CONSTANT-MERGED-GUID", 3, 0, false);
            declareFunction("deregister_constant_guid", "DEREGISTER-CONSTANT-GUID", 2, 0, false);
            declareFunction("deregister_constant_merged_guid", "DEREGISTER-CONSTANT-MERGED-GUID", 2, 0, false);
            declareFunction("clear_constant_guid_table", "CLEAR-CONSTANT-GUID-TABLE", 0, 0, false);
            declareFunction("kb_create_constant_kb_store", "KB-CREATE-CONSTANT-KB-STORE", 2, 0, false);
            declareFunction("kb_create_constant_int", "KB-CREATE-CONSTANT-INT", 3, 0, false);
            declareFunction("kb_create_constant_cyc", "KB-CREATE-CONSTANT-CYC", 2, 0, false);
            declareFunction("install_constant_external_id", "INSTALL-CONSTANT-EXTERNAL-ID", 2, 0, false);
            declareFunction("install_constant_internal_id", "INSTALL-CONSTANT-INTERNAL-ID", 2, 0, false);
            declareFunction("kb_remove_constant_internal", "KB-REMOVE-CONSTANT-INTERNAL", 1, 0, false);
            declareFunction("deregister_constant_guts", "DEREGISTER-CONSTANT-GUTS", 1, 0, false);
            declareFunction("deregister_constant_ids", "DEREGISTER-CONSTANT-IDS", 1, 0, false);
            declareFunction("constant_guid_internal", "CONSTANT-GUID-INTERNAL", 1, 0, false);
            declareFunction("constant_merged_guid_internal", "CONSTANT-MERGED-GUID-INTERNAL", 1, 0, false);
            declareFunction("constant_name_internal", "CONSTANT-NAME-INTERNAL", 1, 0, false);
            declareFunction("constant_index", "CONSTANT-INDEX", 1, 0, false);
            declareFunction("constant_index_swapped_inP", "CONSTANT-INDEX-SWAPPED-IN?", 1, 0, false);
            declareFunction("kb_new_constant_info_iterator_internal", "KB-NEW-CONSTANT-INFO-ITERATOR-INTERNAL", 0, 0, false);
            declareFunction("constant_info", "CONSTANT-INFO", 1, 0, false);
            declareFunction("kb_rename_constant_internal", "KB-RENAME-CONSTANT-INTERNAL", 2, 0, false);
            declareFunction("reset_constant_name", "RESET-CONSTANT-NAME", 2, 0, false);
            declareFunction("reset_constant_index", "RESET-CONSTANT-INDEX", 2, 0, false);
            declareFunction("install_constant_guid", "INSTALL-CONSTANT-GUID", 2, 0, false);
            declareFunction("reset_constant_guid", "RESET-CONSTANT-GUID", 2, 0, false);
            declareFunction("install_constant_merged_guid", "INSTALL-CONSTANT-MERGED-GUID", 2, 0, false);
            declareFunction("uninstall_constant_merged_guid", "UNINSTALL-CONSTANT-MERGED-GUID", 2, 0, false);
            declareFunction("random_constant_internal", "RANDOM-CONSTANT-INTERNAL", 0, 1, false);
            declareFunction("load_install_constant_ids", "LOAD-INSTALL-CONSTANT-IDS", 3, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("arete_note_constant_touched", "ARETE-NOTE-CONSTANT-TOUCHED", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_constants_low_file_Previous() {
        declareFunction("setup_constant_guid_table", "SETUP-CONSTANT-GUID-TABLE", 2, 0, false);
        declareFunction("lookup_constant_guid", "LOOKUP-CONSTANT-GUID", 1, 0, false);
        declareFunction("lookup_constant_merged_guid", "LOOKUP-CONSTANT-MERGED-GUID", 1, 0, false);
        declareFunction("lookup_constant_by_guid", "LOOKUP-CONSTANT-BY-GUID", 1, 0, false);
        declareFunction("register_constant_guid", "REGISTER-CONSTANT-GUID", 3, 0, false);
        declareFunction("register_constant_merged_guid", "REGISTER-CONSTANT-MERGED-GUID", 3, 0, false);
        declareFunction("deregister_constant_guid", "DEREGISTER-CONSTANT-GUID", 2, 0, false);
        declareFunction("deregister_constant_merged_guid", "DEREGISTER-CONSTANT-MERGED-GUID", 2, 0, false);
        declareFunction("clear_constant_guid_table", "CLEAR-CONSTANT-GUID-TABLE", 0, 0, false);
        declareFunction("kb_create_constant_kb_store", "KB-CREATE-CONSTANT-KB-STORE", 2, 0, false);
        declareFunction("kb_create_constant_int", "KB-CREATE-CONSTANT-INT", 3, 0, false);
        declareFunction("kb_create_constant_cyc", "KB-CREATE-CONSTANT-CYC", 2, 0, false);
        declareFunction("install_constant_external_id", "INSTALL-CONSTANT-EXTERNAL-ID", 2, 0, false);
        declareFunction("install_constant_internal_id", "INSTALL-CONSTANT-INTERNAL-ID", 2, 0, false);
        declareFunction("kb_remove_constant_internal", "KB-REMOVE-CONSTANT-INTERNAL", 1, 0, false);
        declareFunction("deregister_constant_guts", "DEREGISTER-CONSTANT-GUTS", 1, 0, false);
        declareFunction("deregister_constant_ids", "DEREGISTER-CONSTANT-IDS", 1, 0, false);
        declareFunction("constant_guid_internal", "CONSTANT-GUID-INTERNAL", 1, 0, false);
        declareFunction("constant_merged_guid_internal", "CONSTANT-MERGED-GUID-INTERNAL", 1, 0, false);
        declareFunction("constant_name_internal", "CONSTANT-NAME-INTERNAL", 1, 0, false);
        declareFunction("constant_index", "CONSTANT-INDEX", 1, 0, false);
        declareFunction("constant_index_swapped_inP", "CONSTANT-INDEX-SWAPPED-IN?", 1, 0, false);
        declareFunction("kb_new_constant_info_iterator_internal", "KB-NEW-CONSTANT-INFO-ITERATOR-INTERNAL", 0, 0, false);
        declareFunction("constant_info", "CONSTANT-INFO", 1, 0, false);
        declareFunction("kb_rename_constant_internal", "KB-RENAME-CONSTANT-INTERNAL", 2, 0, false);
        declareFunction("reset_constant_name", "RESET-CONSTANT-NAME", 2, 0, false);
        declareFunction("reset_constant_index", "RESET-CONSTANT-INDEX", 2, 0, false);
        declareFunction("install_constant_guid", "INSTALL-CONSTANT-GUID", 2, 0, false);
        declareFunction("reset_constant_guid", "RESET-CONSTANT-GUID", 2, 0, false);
        declareFunction("install_constant_merged_guid", "INSTALL-CONSTANT-MERGED-GUID", 2, 0, false);
        declareFunction("uninstall_constant_merged_guid", "UNINSTALL-CONSTANT-MERGED-GUID", 2, 0, false);
        declareFunction("random_constant_internal", "RANDOM-CONSTANT-INTERNAL", 0, 1, false);
        declareFunction("load_install_constant_ids", "LOAD-INSTALL-CONSTANT-IDS", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_constants_low_file_alt() {
        deflexical("*ARETE-CONSTANTS-TOUCHED*", NIL != boundp($arete_constants_touched$) ? ((SubLObject) ($arete_constants_touched$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        deflexical("*CONSTANT-GUID-TABLE*", NIL != boundp($constant_guid_table$) ? ((SubLObject) ($constant_guid_table$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*CONSTANT-MERGED-GUID-TABLE*", NIL != boundp($constant_merged_guid_table$) ? ((SubLObject) ($constant_merged_guid_table$.getGlobalValue())) : $UNINITIALIZED);
        deflexical("*CONSTANT-FROM-GUID*", NIL != boundp($constant_from_guid$) ? ((SubLObject) ($constant_from_guid$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_constants_low_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CONSTANT-GUID-TABLE*", SubLTrampolineFile.maybeDefault($constant_guid_table$, $constant_guid_table$, $UNINITIALIZED));
            deflexical("*CONSTANT-MERGED-GUID-TABLE*", SubLTrampolineFile.maybeDefault($constant_merged_guid_table$, $constant_merged_guid_table$, $UNINITIALIZED));
            deflexical("*CONSTANT-FROM-GUID*", SubLTrampolineFile.maybeDefault($constant_from_guid$, $constant_from_guid$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ARETE-CONSTANTS-TOUCHED*", NIL != boundp($arete_constants_touched$) ? ((SubLObject) ($arete_constants_touched$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            deflexical("*CONSTANT-GUID-TABLE*", NIL != boundp($constant_guid_table$) ? ((SubLObject) ($constant_guid_table$.getGlobalValue())) : $UNINITIALIZED);
            deflexical("*CONSTANT-MERGED-GUID-TABLE*", NIL != boundp($constant_merged_guid_table$) ? ((SubLObject) ($constant_merged_guid_table$.getGlobalValue())) : $UNINITIALIZED);
            deflexical("*CONSTANT-FROM-GUID*", NIL != boundp($constant_from_guid$) ? ((SubLObject) ($constant_from_guid$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_constants_low_file_Previous() {
        deflexical("*CONSTANT-GUID-TABLE*", SubLTrampolineFile.maybeDefault($constant_guid_table$, $constant_guid_table$, $UNINITIALIZED));
        deflexical("*CONSTANT-MERGED-GUID-TABLE*", SubLTrampolineFile.maybeDefault($constant_merged_guid_table$, $constant_merged_guid_table$, $UNINITIALIZED));
        deflexical("*CONSTANT-FROM-GUID*", SubLTrampolineFile.maybeDefault($constant_from_guid$, $constant_from_guid$, NIL));
        return NIL;
    }

    public static final SubLObject setup_constants_low_file_alt() {
        declare_defglobal($arete_constants_touched$);
        declare_defglobal($constant_guid_table$);
        declare_defglobal($constant_merged_guid_table$);
        declare_defglobal($constant_from_guid$);
        return NIL;
    }

    public static SubLObject setup_constants_low_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($constant_guid_table$);
            declare_defglobal($constant_merged_guid_table$);
            declare_defglobal($constant_from_guid$);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($arete_constants_touched$);
        }
        return NIL;
    }

    public static SubLObject setup_constants_low_file_Previous() {
        declare_defglobal($constant_guid_table$);
        declare_defglobal($constant_merged_guid_table$);
        declare_defglobal($constant_from_guid$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constants_low_file();
    }

    @Override
    public void initializeVariables() {
        init_constants_low_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constants_low_file();
    }

    static {
    }

    static private final SubLString $str_alt7$A_constant_with_the_name__s_alrea = makeString("A constant with the name ~s already exists.");
}

