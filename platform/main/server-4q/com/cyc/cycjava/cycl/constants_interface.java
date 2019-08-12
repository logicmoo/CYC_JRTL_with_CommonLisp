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


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONSTANTS-INTERFACE
 * source file: /cyc/top/cycl/constants-interface.lisp
 * created:     2019/07/03 17:37:20
 */
public final class constants_interface extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new constants_interface();

 public static final String myName = "com.cyc.cycjava.cycl.constants_interface";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CONSTANT_NAME_SPEC_P = makeSymbol("CONSTANT-NAME-SPEC-P");

    private static final SubLSymbol KB_CREATE_CONSTANT = makeSymbol("KB-CREATE-CONSTANT");

    static private final SubLSymbol $sym3$_EXIT = makeSymbol("%EXIT");

    static private final SubLList $list4 = list(makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));

    static private final SubLString $str5$Return_a_new_constant_named_NAME_ = makeString("Return a new constant named NAME with EXTERNAL-ID.\n   If NAME is :unnamed, returns a constant with no name.");

    static private final SubLList $list6 = list(list(makeSymbol("NAME"), makeSymbol("CONSTANT-NAME-SPEC-P")), list(makeSymbol("EXTERNAL-ID"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));

    static private final SubLList $list7 = list(makeSymbol("CONSTANT-P"));

    private static final SubLSymbol KB_CREATE_CONSTANT_KB_STORE = makeSymbol("KB-CREATE-CONSTANT-KB-STORE");

    private static final SubLSymbol KB_REMOVE_CONSTANT = makeSymbol("KB-REMOVE-CONSTANT");

    static private final SubLList $list12 = list(makeSymbol("CONSTANT"));

    static private final SubLString $str13$Remove_CONSTANT_from_the_KB_ = makeString("Remove CONSTANT from the KB.");

    static private final SubLList $list14 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));

    static private final SubLList $list15 = list(makeSymbol("NULL"));

    private static final SubLSymbol KB_LOOKUP_CONSTANT_BY_NAME = makeSymbol("KB-LOOKUP-CONSTANT-BY-NAME");

    static private final SubLList $list18 = list(makeSymbol("NAME"));

    static private final SubLString $str19$Return_the_constant_named_NAME__i = makeString("Return the constant named NAME, if it exists.\n   Return NIL otherwise.");

    static private final SubLList $list20 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));

    static private final SubLList $list21 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));

    private static final SubLSymbol KB_CONSTANT_NAME = makeSymbol("KB-CONSTANT-NAME");

    static private final SubLString $str23$Return_the_name_for_CONSTANT_ = makeString("Return the name for CONSTANT.");

    static private final SubLList $list24 = list(makeSymbol("CONSTANT-NAME-SPEC-P"));

    private static final SubLSymbol KB_LOOKUP_CONSTANT_BY_GUID = makeSymbol("KB-LOOKUP-CONSTANT-BY-GUID");

    static private final SubLList $list27 = list(makeSymbol("GUID"));

    static private final SubLString $str28$Return_the_constant_with_GUID__if = makeString("Return the constant with GUID, if it exists.\n   Return NIL otherwise.");

    static private final SubLList $list29 = list(list(makeSymbol("GUID"), makeSymbol("GUID-P")));

    private static final SubLSymbol KB_CONSTANT_GUID = makeSymbol("KB-CONSTANT-GUID");

    static private final SubLString $str31$Return_the_external_ID_for_CONSTA = makeString("Return the external ID for CONSTANT.");

    static private final SubLList $list32 = list(makeSymbol("CONSTANT-EXTERNAL-ID-P"));

    private static final SubLSymbol KB_CONSTANT_MERGED_GUID = makeSymbol("KB-CONSTANT-MERGED-GUID");

    static private final SubLString $str34$Return_the_external_merged_ID_for = makeString("Return the external merged ID for CONSTANT.");

    private static final SubLSymbol KB_RENAME_CONSTANT = makeSymbol("KB-RENAME-CONSTANT");

    static private final SubLList $list37 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"));

    static private final SubLString $str38$Rename_CONSTANT_to_have_NEW_NAME_ = makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");

    static private final SubLList $list39 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NEW-NAME"), makeSymbol("VALID-CONSTANT-NAME-P")));

    static private final SubLList $list40 = list(makeSymbol("KB-NEW-CONSTANT-INFO-ITERATOR-INTERNAL"));

    // Definitions
    /**
     * Return a new constant named NAME with EXTERNAL-ID.
     * If NAME is :unnamed, returns a constant with no name.
     */
    @LispMethod(comment = "Return a new constant named NAME with EXTERNAL-ID.\r\nIf NAME is :unnamed, returns a constant with no name.\nReturn a new constant named NAME with EXTERNAL-ID.\nIf NAME is :unnamed, returns a constant with no name.")
    public static final SubLObject kb_create_constant_alt(SubLObject name, SubLObject external_id) {
        SubLTrampolineFile.checkType(name, CONSTANT_NAME_SPEC_P);
        SubLTrampolineFile.checkType(external_id, CONSTANT_EXTERNAL_ID_P);
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_CREATE_CONSTANT, name, external_id, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_anywhereP()) {
            {
                SubLObject lock = $hl_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject constant = (NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? ((SubLObject) (com.cyc.cycjava.cycl.constants_interface.kb_create_constant_remote(name, external_id))) : com.cyc.cycjava.cycl.constants_interface.kb_create_constant_local(name, external_id);
                        kb_modification_event.post_kb_modify_create_constant_event(name, external_id);
                        hl_interface_infrastructure.define_hl_modifier_postamble();
                        return constant;
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
        } else {
            return NIL;
        }
    }

    // Definitions
    /**
     * Return a new constant named NAME with EXTERNAL-ID.
     * If NAME is :unnamed, returns a constant with no name.
     */
    @LispMethod(comment = "Return a new constant named NAME with EXTERNAL-ID.\r\nIf NAME is :unnamed, returns a constant with no name.\nReturn a new constant named NAME with EXTERNAL-ID.\nIf NAME is :unnamed, returns a constant with no name.")
    public static SubLObject kb_create_constant(final SubLObject name, final SubLObject external_id) {
        SubLTrampolineFile.enforceType(name, CONSTANT_NAME_SPEC_P);
        SubLTrampolineFile.enforceType(external_id, CONSTANT_EXTERNAL_ID_P);
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_CREATE_CONSTANT, name, external_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_anywhereP()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($hl_lock$.getGlobalValue());
                final SubLObject constant = (NIL != hl_interface_infrastructure.hl_modify_remoteP()) ? kb_create_constant_remote(name, external_id) : kb_create_constant_local(name, external_id);
                kb_modification_event.post_kb_modify_create_constant_event(name, external_id);
                hl_transcript_tracing.note_hlt_find_or_create(constant);
                hl_interface_infrastructure.define_hl_modifier_postamble();
                return constant;
            } finally {
                if (NIL != release) {
                    release_lock($hl_lock$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kb_create_constant_remote_alt(SubLObject name, SubLObject external_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval(list(KB_CREATE_CONSTANT_KB_STORE, list_utilities.quotify(name), list_utilities.quotify(external_id)));
                SubLObject constant = NIL;
                {
                    SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
                    try {
                        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                        constant = constants_low.kb_create_constant_cyc(name, internal_id);
                        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                            constants_low.kb_create_constant_int(constant, name, external_id);
                        }
                    } finally {
                        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
                    }
                }
                return constant;
            }
        }
    }

    public static SubLObject kb_create_constant_remote(final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval(list(KB_CREATE_CONSTANT_KB_STORE, list_utilities.quotify(name), list_utilities.quotify(external_id)));
        SubLObject constant = NIL;
        final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
        try {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
            constant = constants_low.kb_create_constant_cyc(name, internal_id);
            if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                constants_low.kb_create_constant_int(constant, name, external_id);
            }
        } finally {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
        }
        return constant;
    }

    public static final SubLObject kb_create_constant_local_alt(SubLObject name, SubLObject external_id) {
        {
            SubLObject internal_id = constants_low.kb_create_constant_kb_store(name, external_id);
            return constants_high.find_constant_by_internal_id(internal_id);
        }
    }

    public static SubLObject kb_create_constant_local(final SubLObject name, final SubLObject external_id) {
        final SubLObject internal_id = constants_low.kb_create_constant_kb_store(name, external_id);
        return constants_high.find_constant_by_internal_id(internal_id);
    }

    /**
     * Remove CONSTANT from the KB.
     */
    @LispMethod(comment = "Remove CONSTANT from the KB.")
    public static final SubLObject kb_remove_constant_alt(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(constant, CONSTANT_P);
            {
                SubLObject result = NIL;
                hl_interface_infrastructure.define_hl_modifier_preamble();
                hl_interface_infrastructure.note_hl_modifier_invocation(KB_REMOVE_CONSTANT, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
                    result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_REMOVE_CONSTANT, list(QUOTE, constant)));
                }
                if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                    {
                        SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
                        try {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                            {
                                SubLObject lock = $hl_lock$.getGlobalValue();
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    kb_modification_event.post_kb_modify_remove_constant_event(constant);
                                    return constants_low.kb_remove_constant_internal(constant);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                        } finally {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    return result;
                }
            }
        }
    }

    /**
     * Remove CONSTANT from the KB.
     */
    @LispMethod(comment = "Remove CONSTANT from the KB.")
    public static SubLObject kb_remove_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_REMOVE_CONSTANT, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_REMOVE_CONSTANT, list(QUOTE, constant)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    hl_transcript_tracing.note_hlt_remove_constant(constant);
                    kb_modification_event.post_kb_modify_remove_constant_event(constant);
                    return constants_low.kb_remove_constant_internal(constant);
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     * Return the constant named NAME, if it exists.
     * Return NIL otherwise.
     */
    @LispMethod(comment = "Return the constant named NAME, if it exists.\r\nReturn NIL otherwise.\nReturn the constant named NAME, if it exists.\nReturn NIL otherwise.")
    public static final SubLObject kb_lookup_constant_by_name_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, STRINGP);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_LOOKUP_CONSTANT_BY_NAME, list(QUOTE, name)));
        } else {
            return constant_completion_low.constant_shell_from_name(name);
        }
    }

    /**
     * Return the constant named NAME, if it exists.
     * Return NIL otherwise.
     */
    @LispMethod(comment = "Return the constant named NAME, if it exists.\r\nReturn NIL otherwise.\nReturn the constant named NAME, if it exists.\nReturn NIL otherwise.")
    public static SubLObject kb_lookup_constant_by_name(final SubLObject name) {
        SubLTrampolineFile.enforceType(name, STRINGP);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_LOOKUP_CONSTANT_BY_NAME, list(QUOTE, name)));
        }
        return constant_completion_low.constant_shell_from_name(name);
    }

    /**
     * Return the name for CONSTANT.
     */
    @LispMethod(comment = "Return the name for CONSTANT.")
    public static final SubLObject kb_constant_name_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_NAME, list(QUOTE, constant)));
        } else {
            return constants_low.constant_name_internal(constant);
        }
    }

    /**
     * Return the name for CONSTANT.
     */
    @LispMethod(comment = "Return the name for CONSTANT.")
    public static SubLObject kb_constant_name(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_NAME, list(QUOTE, constant)));
        }
        return constants_low.constant_name_internal(constant);
    }

    /**
     * Return the constant with GUID, if it exists.
     * Return NIL otherwise.
     */
    @LispMethod(comment = "Return the constant with GUID, if it exists.\r\nReturn NIL otherwise.\nReturn the constant with GUID, if it exists.\nReturn NIL otherwise.")
    public static final SubLObject kb_lookup_constant_by_guid_alt(SubLObject guid) {
        SubLTrampolineFile.checkType(guid, GUID_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_LOOKUP_CONSTANT_BY_GUID, list(QUOTE, guid)));
        } else {
            return constants_low.lookup_constant_by_guid(guid);
        }
    }

    /**
     * Return the constant with GUID, if it exists.
     * Return NIL otherwise.
     */
    @LispMethod(comment = "Return the constant with GUID, if it exists.\r\nReturn NIL otherwise.\nReturn the constant with GUID, if it exists.\nReturn NIL otherwise.")
    public static SubLObject kb_lookup_constant_by_guid(final SubLObject guid) {
        SubLTrampolineFile.enforceType(guid, GUID_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_LOOKUP_CONSTANT_BY_GUID, list(QUOTE, guid)));
        }
        return constants_low.lookup_constant_by_guid(guid);
    }

    /**
     * Return the external ID for CONSTANT.
     */
    @LispMethod(comment = "Return the external ID for CONSTANT.")
    public static final SubLObject kb_constant_guid_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_GUID, list(QUOTE, constant)));
        } else {
            return constants_low.constant_guid_internal(constant);
        }
    }

    /**
     * Return the external ID for CONSTANT.
     */
    @LispMethod(comment = "Return the external ID for CONSTANT.")
    public static SubLObject kb_constant_guid(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_GUID, list(QUOTE, constant)));
        }
        return constants_low.constant_guid_internal(constant);
    }

    /**
     * Return the external merged ID for CONSTANT.
     */
    @LispMethod(comment = "Return the external merged ID for CONSTANT.")
    public static final SubLObject kb_constant_merged_guid_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_MERGED_GUID, list(QUOTE, constant)));
        } else {
            return constants_low.constant_merged_guid_internal(constant);
        }
    }

    /**
     * Return the external merged ID for CONSTANT.
     */
    @LispMethod(comment = "Return the external merged ID for CONSTANT.")
    public static SubLObject kb_constant_merged_guid(final SubLObject constant) {
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        if (NIL != hl_interface_infrastructure.hl_access_remoteP()) {
            return hl_interface_infrastructure.hl_store_remote_eval(list(KB_CONSTANT_MERGED_GUID, list(QUOTE, constant)));
        }
        return constants_low.constant_merged_guid_internal(constant);
    }

    /**
     * Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.
     */
    @LispMethod(comment = "Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.")
    public static final SubLObject kb_rename_constant_alt(SubLObject constant, SubLObject new_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(constant, CONSTANT_P);
            SubLTrampolineFile.checkType(new_name, VALID_CONSTANT_NAME_P);
            {
                SubLObject result = NIL;
                hl_interface_infrastructure.define_hl_modifier_preamble();
                hl_interface_infrastructure.note_hl_modifier_invocation(KB_RENAME_CONSTANT, constant, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
                    result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_RENAME_CONSTANT, list(QUOTE, constant), list(QUOTE, new_name)));
                }
                if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                    {
                        SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
                        try {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                            {
                                SubLObject lock = $hl_lock$.getGlobalValue();
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    {
                                        SubLObject old_name = constants_high.constant_name(constant);
                                        SubLObject result_1 = constants_low.kb_rename_constant_internal(constant, new_name);
                                        kb_modification_event.post_kb_modify_rename_constant_event(constant, old_name, new_name);
                                        return result_1;
                                    }
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                        } finally {
                            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    return result;
                }
            }
        }
    }

    /**
     * Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.
     */
    @LispMethod(comment = "Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.")
    public static SubLObject kb_rename_constant(final SubLObject constant, final SubLObject new_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(constant, CONSTANT_P);
        SubLTrampolineFile.enforceType(new_name, VALID_CONSTANT_NAME_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(KB_RENAME_CONSTANT, constant, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(KB_RENAME_CONSTANT, list(QUOTE, constant), list(QUOTE, new_name)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    final SubLObject old_name = constants_high.constant_name(constant);
                    SubLObject result_$1 = NIL;
                    hl_transcript_tracing.note_hlt_rename(constant, new_name);
                    result_$1 = constants_low.kb_rename_constant_internal(constant, new_name);
                    kb_modification_event.post_kb_modify_rename_constant_event(constant, old_name, new_name);
                    return result_$1;
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static final SubLObject kb_new_constant_info_iterator_alt(SubLObject buffer_size) {
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return hl_interface_infrastructure.new_hl_store_iterator($list_alt40, buffer_size);
    }

    public static SubLObject kb_new_constant_info_iterator(SubLObject buffer_size) {
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return hl_interface_infrastructure.new_hl_store_iterator($list40, buffer_size);
    }

    public static SubLObject declare_constants_interface_file() {
        declareFunction("kb_create_constant", "KB-CREATE-CONSTANT", 2, 0, false);
        declareFunction("kb_create_constant_remote", "KB-CREATE-CONSTANT-REMOTE", 2, 0, false);
        declareFunction("kb_create_constant_local", "KB-CREATE-CONSTANT-LOCAL", 2, 0, false);
        declareFunction("kb_remove_constant", "KB-REMOVE-CONSTANT", 1, 0, false);
        declareFunction("kb_lookup_constant_by_name", "KB-LOOKUP-CONSTANT-BY-NAME", 1, 0, false);
        declareFunction("kb_constant_name", "KB-CONSTANT-NAME", 1, 0, false);
        declareFunction("kb_lookup_constant_by_guid", "KB-LOOKUP-CONSTANT-BY-GUID", 1, 0, false);
        declareFunction("kb_constant_guid", "KB-CONSTANT-GUID", 1, 0, false);
        declareFunction("kb_constant_merged_guid", "KB-CONSTANT-MERGED-GUID", 1, 0, false);
        declareFunction("kb_rename_constant", "KB-RENAME-CONSTANT", 2, 0, false);
        declareFunction("kb_new_constant_info_iterator", "KB-NEW-CONSTANT-INFO-ITERATOR", 0, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt4 = list(makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));

    public static SubLObject init_constants_interface_file() {
        return NIL;
    }

    static private final SubLString $str_alt5$Return_a_new_constant_named_NAME_ = makeString("Return a new constant named NAME with EXTERNAL-ID.\n   If NAME is :unnamed, returns a constant with no name.");

    public static SubLObject setup_constants_interface_file() {
        register_cyc_api_function(KB_CREATE_CONSTANT, $list4, $str5$Return_a_new_constant_named_NAME_, $list6, $list7);
        register_cyc_api_function(KB_REMOVE_CONSTANT, $list12, $str13$Remove_CONSTANT_from_the_KB_, $list14, $list15);
        register_cyc_api_function(KB_LOOKUP_CONSTANT_BY_NAME, $list18, $str19$Return_the_constant_named_NAME__i, $list20, $list21);
        register_cyc_api_function(KB_CONSTANT_NAME, $list12, $str23$Return_the_name_for_CONSTANT_, $list14, $list24);
        register_cyc_api_function(KB_LOOKUP_CONSTANT_BY_GUID, $list27, $str28$Return_the_constant_with_GUID__if, $list29, $list21);
        register_cyc_api_function(KB_CONSTANT_GUID, $list12, $str31$Return_the_external_ID_for_CONSTA, $list14, $list32);
        register_cyc_api_function(KB_CONSTANT_MERGED_GUID, $list12, $str34$Return_the_external_merged_ID_for, $list14, $list32);
        register_cyc_api_function(KB_RENAME_CONSTANT, $list37, $str38$Rename_CONSTANT_to_have_NEW_NAME_, $list39, $list7);
        return NIL;
    }

    static private final SubLList $list_alt6 = list(list(makeSymbol("NAME"), makeSymbol("CONSTANT-NAME-SPEC-P")), list(makeSymbol("EXTERNAL-ID"), makeSymbol("CONSTANT-EXTERNAL-ID-P")));

    static private final SubLList $list_alt7 = list(makeSymbol("CONSTANT-P"));

    static private final SubLList $list_alt12 = list(makeSymbol("CONSTANT"));

    static private final SubLString $str_alt13$Remove_CONSTANT_from_the_KB_ = makeString("Remove CONSTANT from the KB.");

    static private final SubLList $list_alt14 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")));

    static private final SubLList $list_alt15 = list(makeSymbol("NULL"));

    @Override
    public void declareFunctions() {
        declare_constants_interface_file();
    }

    static private final SubLList $list_alt18 = list(makeSymbol("NAME"));

    @Override
    public void initializeVariables() {
        init_constants_interface_file();
    }

    static private final SubLString $str_alt19$Return_the_constant_named_NAME__i = makeString("Return the constant named NAME, if it exists.\n   Return NIL otherwise.");

    @Override
    public void runTopLevelForms() {
        setup_constants_interface_file();
    }

    static {
    }

    static private final SubLList $list_alt20 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));

    static private final SubLList $list_alt21 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));

    static private final SubLString $str_alt23$Return_the_name_for_CONSTANT_ = makeString("Return the name for CONSTANT.");

    static private final SubLList $list_alt24 = list(makeSymbol("CONSTANT-NAME-SPEC-P"));

    static private final SubLList $list_alt27 = list(makeSymbol("GUID"));

    static private final SubLString $str_alt28$Return_the_constant_with_GUID__if = makeString("Return the constant with GUID, if it exists.\n   Return NIL otherwise.");

    static private final SubLList $list_alt29 = list(list(makeSymbol("GUID"), makeSymbol("GUID-P")));

    static private final SubLString $str_alt31$Return_the_external_ID_for_CONSTA = makeString("Return the external ID for CONSTANT.");

    static private final SubLList $list_alt32 = list(makeSymbol("CONSTANT-EXTERNAL-ID-P"));

    static private final SubLString $str_alt34$Return_the_external_merged_ID_for = makeString("Return the external merged ID for CONSTANT.");

    static private final SubLList $list_alt37 = list(makeSymbol("CONSTANT"), makeSymbol("NEW-NAME"));

    static private final SubLString $str_alt38$Rename_CONSTANT_to_have_NEW_NAME_ = makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");

    static private final SubLList $list_alt39 = list(list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeSymbol("NEW-NAME"), makeSymbol("VALID-CONSTANT-NAME-P")));

    static private final SubLList $list_alt40 = list(makeSymbol("KB-NEW-CONSTANT-INFO-ITERATOR-INTERNAL"));
}

