/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_channel_externalizedP$;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      HL-INTERFACE-INFRASTRUCTURE
 * source file: /cyc/top/cycl/hl-interface-infrastructure.lisp
 * created:     2019/07/03 17:37:18
 */
public final class hl_interface_infrastructure extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new hl_interface_infrastructure();



    // defvar
    @LispMethod(comment = "Where HL store modification and access should be done.  There\r\nare four valid values:\r\n:local-local   (modify and access locally)\r\n:remote-remote (modify and access remotely)\r\n:both-local    (modify and access locally, also modify remotely)\r\n:both-remote   (modify and access remotely, also modify locally)\r\n:none-local    (access locally, do not modify)\ndefvar\nWhere HL store modification and access should be done.  There\nare four valid values:\n:local-local   (modify and access locally)\n:remote-remote (modify and access remotely)\n:both-local    (modify and access locally, also modify remotely)\n:both-remote   (modify and access remotely, also modify locally)\n:none-local    (access locally, do not modify)")
    // Definitions
    /**
     * Where HL store modification and access should be done.  There
     * are four valid values:
     * :local-local   (modify and access locally)
     * :remote-remote (modify and access remotely)
     * :both-local    (modify and access locally, also modify remotely)
     * :both-remote   (modify and access remotely, also modify locally)
     * :none-local    (access locally, do not modify)
     */
    public static final SubLSymbol $hl_store_modification_and_access$ = makeSymbol("*HL-STORE-MODIFICATION-AND-ACCESS*");

    // defvar
    /**
     * A non-NIL value means that access will be done locally regardless of the
     * value of *hl-store-modification-and-access*.
     */
    @LispMethod(comment = "A non-NIL value means that access will be done locally regardless of the\r\nvalue of *hl-store-modification-and-access*.\ndefvar\nA non-NIL value means that access will be done locally regardless of the\nvalue of *hl-store-modification-and-access*.")
    public static final SubLSymbol $override_hl_store_remote_accessP$ = makeSymbol("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $remote_hl_store_connection_pool_lock$ = makeSymbol("*REMOTE-HL-STORE-CONNECTION-POOL-LOCK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $remote_hl_store_connection_pool_max_size$ = makeSymbol("*REMOTE-HL-STORE-CONNECTION-POOL-MAX-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $hl_store_iterator_lock$ = makeSymbol("*HL-STORE-ITERATOR-LOCK*");

    static private final SubLList $list6 = list(list(makeSymbol("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*"), T));

    static private final SubLList $list7 = list(list(makeSymbol("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*"), NIL));

    public static final SubLSymbol $remote_hl_store_image$ = makeSymbol("*REMOTE-HL-STORE-IMAGE*");

    public static final SubLSymbol $remote_hl_store_connection_pool$ = makeSymbol("*REMOTE-HL-STORE-CONNECTION-POOL*");

    static private final SubLString $str10$Remote_HL_Store_Connection_Pool_L = makeString("Remote HL Store Connection Pool Lock");

    static private final SubLString $str11$Could_not_open_a_connection_to__s = makeString("Could not open a connection to ~s");

    static private final SubLList $list14 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DEFINE_API = makeSymbol("DEFINE-API");

    static private final SubLList $list17 = list(makeSymbol("DEFINE-HL-MODIFIER-PREAMBLE"));

    private static final SubLSymbol NOTE_HL_MODIFIER_INVOCATION = makeSymbol("NOTE-HL-MODIFIER-INVOCATION");

    static private final SubLList $list21 = list(makeSymbol("HL-MODIFY-ANYWHERE?"));

    private static final SubLSymbol WITHIN_HL_MODIFICATION = makeSymbol("WITHIN-HL-MODIFICATION");

    static private final SubLList $list23 = list(list(RET, NIL));

    static private final SubLList $list25 = list(QUOTE, QUOTE);

    static private final SubLSymbol $sym26$RESULT = makeUninternedSymbol("RESULT");

    static private final SubLList $list28 = list(makeSymbol("HL-MODIFY-REMOTE?"));

    private static final SubLSymbol HL_STORE_REMOTE_EVAL = makeSymbol("HL-STORE-REMOTE-EVAL");

    static private final SubLList $list31 = list(makeSymbol("HL-MODIFY-LOCAL?"));

    private static final SubLSymbol OVERRIDE_REMOTE_HL_STORE_ACCESS = makeSymbol("OVERRIDE-REMOTE-HL-STORE-ACCESS");

    private static final SubLSymbol DEFINE_HL_MODIFIER_PREAMBLE = makeSymbol("DEFINE-HL-MODIFIER-PREAMBLE");

    static private final SubLList $list35 = list(makeSymbol("DEFINE-HL-MODIFIER"), makeSymbol("DEFINE-HL-CREATOR"));

    private static final SubLSymbol DEFINE_HL_MODIFIER_POSTAMBLE = makeSymbol("DEFINE-HL-MODIFIER-POSTAMBLE");

    static private final SubLList $list37 = list(makeSymbol("HL-ACCESS-REMOTE?"));

    static private final SubLList $list38 = list(makeKeyword("IGNORE"), $WARN, makeKeyword("BREAK"));

    static private final SubLList $list43 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list45 = list(makeSymbol("VALID-HL-STORE-ERROR-HANDLING-MODE-P"));

    public static final SubLSymbol $hl_store_error_handling_mode$ = makeSymbol("*HL-STORE-ERROR-HANDLING-MODE*");

    private static final SubLSymbol WITH_HL_STORE_ERROR_HANDLING_MODE = makeSymbol("WITH-HL-STORE-ERROR-HANDLING-MODE");

    static private final SubLList $list48 = list(list(makeSymbol("*INFERENCE-DEBUG?*"), T));

    public static final SubLSymbol $hl_store_iterators$ = makeSymbol("*HL-STORE-ITERATORS*");

    public static final SubLSymbol $next_hl_store_iterator_id$ = makeSymbol("*NEXT-HL-STORE-ITERATOR-ID*");

    static private final SubLString $$$HL_Store_Iterator_Lock = makeString("HL Store Iterator Lock");

    private static final SubLSymbol NEW_HL_STORE_ITERATOR_INT = makeSymbol("NEW-HL-STORE-ITERATOR-INT");

    static private final SubLSymbol $sym55$HL_STORE_ITERATOR_DONE_ = makeSymbol("HL-STORE-ITERATOR-DONE?");

    private static final SubLSymbol HL_STORE_ITERATOR_NEXT = makeSymbol("HL-STORE-ITERATOR-NEXT");

    private static final SubLSymbol HL_STORE_ITERATOR_DESTROY = makeSymbol("HL-STORE-ITERATOR-DESTROY");

    private static final SubLSymbol HL_STORE_ITERATOR_DONE_INT = makeSymbol("HL-STORE-ITERATOR-DONE-INT");

    private static final SubLSymbol HL_STORE_ITERATOR_NEXT_INT = makeSymbol("HL-STORE-ITERATOR-NEXT-INT");

    static private final SubLList $list60 = list(makeSymbol("NEXT"), makeSymbol("VALID?"));

    private static final SubLSymbol HL_STORE_ITERATOR_DESTROY_INT = makeSymbol("HL-STORE-ITERATOR-DESTROY-INT");

    static private final SubLSymbol $sym62$HL_STORE_BUFFERED_ITERATOR_DONE_ = makeSymbol("HL-STORE-BUFFERED-ITERATOR-DONE?");

    private static final SubLSymbol HL_STORE_BUFFERED_ITERATOR_NEXT = makeSymbol("HL-STORE-BUFFERED-ITERATOR-NEXT");

    private static final SubLSymbol HL_STORE_BUFFERED_ITERATOR_DESTROY = makeSymbol("HL-STORE-BUFFERED-ITERATOR-DESTROY");

    static private final SubLList $list65 = list(makeSymbol("BUFFER"), makeSymbol("ID"), makeSymbol("N"));

    private static final SubLSymbol HL_STORE_ITERATOR_NEXT_N_INT = makeSymbol("HL-STORE-ITERATOR-NEXT-N-INT");

    public static final SubLSymbol $hl_transcript_stream$ = makeSymbol("*HL-TRANSCRIPT-STREAM*");

    static private final SubLString $str71$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLObject hl_modify_localP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((($LOCAL_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread)) || ($BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread))) || ($BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread)));
        }
    }

    public static SubLObject hl_modify_localP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((($LOCAL_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread)) || ($BOTH_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread))) || ($BOTH_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread)));
    }

    public static final SubLObject hl_modify_remoteP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((($REMOTE_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread)) || ($BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread))) || ($BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread)));
        }
    }

    public static SubLObject hl_modify_remoteP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((($REMOTE_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread)) || ($BOTH_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread))) || ($BOTH_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread)));
    }

    public static final SubLObject hl_modify_anywhereP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((($LOCAL_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread)) || ($REMOTE_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread))) || ($BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread))) || ($BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread)));
        }
    }

    public static SubLObject hl_modify_anywhereP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((($LOCAL_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread)) || ($REMOTE_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread))) || ($BOTH_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread))) || ($BOTH_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread)));
    }

    public static final SubLObject hl_access_localP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((((NIL != $override_hl_store_remote_accessP$.getDynamicValue(thread)) || ($LOCAL_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread))) || ($BOTH_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread))) || ($NONE_LOCAL == $hl_store_modification_and_access$.getDynamicValue(thread)));
        }
    }

    public static SubLObject hl_access_localP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((NIL != hl_interface_infrastructure.$override_hl_store_remote_accessP$.getDynamicValue(thread)) || ($LOCAL_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread))) || ($BOTH_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread))) || ($NONE_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread)));
    }

    public static final SubLObject hl_access_remoteP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL == $override_hl_store_remote_accessP$.getDynamicValue(thread)) && (($REMOTE_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread)) || ($BOTH_REMOTE == $hl_store_modification_and_access$.getDynamicValue(thread))));
        }
    }

    public static SubLObject hl_access_remoteP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == hl_interface_infrastructure.$override_hl_store_remote_accessP$.getDynamicValue(thread)) && (($REMOTE_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread)) || ($BOTH_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread))));
    }

    public static final SubLObject override_remote_hl_store_access_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt6, append(body, NIL));
        }
    }

    public static SubLObject override_remote_hl_store_access(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, hl_interface_infrastructure.$list6, append(body, NIL));
    }

    public static final SubLObject do_not_override_remote_hl_store_access_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt7, append(body, NIL));
        }
    }

    public static SubLObject do_not_override_remote_hl_store_access(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, hl_interface_infrastructure.$list7, append(body, NIL));
    }

    public static final SubLObject set_remote_hl_store_image_alt(SubLObject machine, SubLObject port, SubLObject protocol) {
        $remote_hl_store_image$.setGlobalValue(remote_image.new_remote_image(machine, port, protocol));
        return remote_image.remote_image_p($remote_hl_store_image$.getGlobalValue());
    }

    public static SubLObject set_remote_hl_store_image(final SubLObject machine, final SubLObject port, final SubLObject protocol) {
        hl_interface_infrastructure.$remote_hl_store_image$.setGlobalValue(remote_image.new_remote_image(machine, port, protocol));
        return remote_image.remote_image_p(hl_interface_infrastructure.$remote_hl_store_image$.getGlobalValue());
    }

    public static final SubLObject unset_remote_hl_store_image_alt() {
        $remote_hl_store_image$.setGlobalValue(NIL);
        return T;
    }

    public static SubLObject unset_remote_hl_store_image() {
        hl_interface_infrastructure.$remote_hl_store_image$.setGlobalValue(NIL);
        return T;
    }

    public static final SubLObject clear_remote_hl_store_connection_pool_alt() {
        {
            SubLObject q = $remote_hl_store_connection_pool$.getGlobalValue();
            SubLObject done_var = queues.queue_empty_p(q);
            while (NIL == done_var) {
                {
                    SubLObject connection = queues.dequeue(q);
                    remote_image.close_remote_image_connection(connection);
                    done_var = queues.queue_empty_p(q);
                }
            } 
        }
        return T;
    }

    public static SubLObject clear_remote_hl_store_connection_pool() {
        for (SubLObject q = hl_interface_infrastructure.$remote_hl_store_connection_pool$.getGlobalValue(), done_var = queues.queue_empty_p(q); NIL == done_var; done_var = queues.queue_empty_p(q)) {
            final SubLObject connection = queues.dequeue(q);
            remote_image.close_remote_image_connection(connection);
        }
        return T;
    }

    public static final SubLObject create_remote_hl_store_connection_alt() {
        {
            SubLObject connection = remote_image.new_remote_image_connection($remote_hl_store_image$.getGlobalValue());
            if (NIL != remote_image.remote_image_connection_p(connection)) {
                remote_image.open_remote_image_connection(connection);
                return connection;
            }
        }
        return Errors.error($str_alt11$Could_not_open_a_connection_to__s, $remote_hl_store_image$.getGlobalValue());
    }

    public static SubLObject create_remote_hl_store_connection() {
        final SubLObject connection = remote_image.new_remote_image_connection(hl_interface_infrastructure.$remote_hl_store_image$.getGlobalValue());
        if (NIL != remote_image.remote_image_connection_p(connection)) {
            remote_image.open_remote_image_connection(connection);
            return connection;
        }
        return Errors.error(hl_interface_infrastructure.$str11$Could_not_open_a_connection_to__s, hl_interface_infrastructure.$remote_hl_store_image$.getGlobalValue());
    }

    public static final SubLObject release_hl_store_connection_alt(SubLObject connection) {
        {
            SubLObject lock = $remote_hl_store_connection_pool_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (queues.queue_size($remote_hl_store_connection_pool$.getGlobalValue()).numGE($remote_hl_store_connection_pool_max_size$.getGlobalValue())) {
                    remote_image.close_remote_image_connection(connection);
                } else {
                    queues.enqueue(connection, $remote_hl_store_connection_pool$.getGlobalValue());
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return T;
    }

    public static SubLObject release_hl_store_connection(final SubLObject connection) {
        SubLObject release = NIL;
        try {
            release = seize_lock(hl_interface_infrastructure.$remote_hl_store_connection_pool_lock$.getGlobalValue());
            if (queues.queue_size(hl_interface_infrastructure.$remote_hl_store_connection_pool$.getGlobalValue()).numGE(hl_interface_infrastructure.$remote_hl_store_connection_pool_max_size$.getGlobalValue())) {
                remote_image.close_remote_image_connection(connection);
            } else {
                queues.enqueue(connection, hl_interface_infrastructure.$remote_hl_store_connection_pool$.getGlobalValue());
            }
        } finally {
            if (NIL != release) {
                release_lock(hl_interface_infrastructure.$remote_hl_store_connection_pool_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static final SubLObject open_remote_hl_store_connection_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != remote_image.remote_image_connection_p(v_object)) && (NIL != remote_image.remote_image_connection_openP(v_object)));
    }

    public static SubLObject open_remote_hl_store_connection_p(final SubLObject v_object) {
        return makeBoolean((NIL != remote_image.remote_image_connection_p(v_object)) && (NIL != remote_image.remote_image_connection_openP(v_object)));
    }

    public static final SubLObject get_free_hl_store_connection_alt() {
        {
            SubLObject connection = NIL;
            SubLObject lock = $remote_hl_store_connection_pool_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject q = $remote_hl_store_connection_pool$.getGlobalValue();
                    SubLObject done_var = makeBoolean((NIL != connection) || (NIL != queues.queue_empty_p(q)));
                    while (NIL == done_var) {
                        {
                            SubLObject candidate = queues.dequeue(q);
                            if (NIL != com.cyc.cycjava.cycl.hl_interface_infrastructure.open_remote_hl_store_connection_p(candidate)) {
                                connection = candidate;
                            }
                            done_var = makeBoolean((NIL != connection) || (NIL != queues.queue_empty_p(q)));
                        }
                    } 
                }
                if (NIL == connection) {
                    connection = com.cyc.cycjava.cycl.hl_interface_infrastructure.create_remote_hl_store_connection();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return connection;
        }
    }

    public static SubLObject get_free_hl_store_connection() {
        SubLObject connection = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(hl_interface_infrastructure.$remote_hl_store_connection_pool_lock$.getGlobalValue());
            for (SubLObject q = hl_interface_infrastructure.$remote_hl_store_connection_pool$.getGlobalValue(), done_var = makeBoolean((NIL != connection) || (NIL != queues.queue_empty_p(q))); NIL == done_var; done_var = makeBoolean((NIL != connection) || (NIL != queues.queue_empty_p(q)))) {
                final SubLObject candidate = queues.dequeue(q);
                if (NIL != hl_interface_infrastructure.open_remote_hl_store_connection_p(candidate)) {
                    connection = candidate;
                }
            }
            if (NIL == connection) {
                connection = hl_interface_infrastructure.create_remote_hl_store_connection();
            }
        } finally {
            if (NIL != release) {
                release_lock(hl_interface_infrastructure.$remote_hl_store_connection_pool_lock$.getGlobalValue());
            }
        }
        return connection;
    }

    public static final SubLObject initialize_remote_hl_store_connections_alt() {
        return com.cyc.cycjava.cycl.hl_interface_infrastructure.clear_remote_hl_store_connection_pool();
    }

    public static SubLObject initialize_remote_hl_store_connections() {
        return hl_interface_infrastructure.clear_remote_hl_store_connection_pool();
    }

    public static final SubLObject declare_remote_hl_store_image_alt(SubLObject machine, SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        com.cyc.cycjava.cycl.hl_interface_infrastructure.set_remote_hl_store_image(machine, port, protocol);
        com.cyc.cycjava.cycl.hl_interface_infrastructure.clear_remote_hl_store_connection_pool();
        return T;
    }

    public static SubLObject declare_remote_hl_store_image(final SubLObject machine, final SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        hl_interface_infrastructure.set_remote_hl_store_image(machine, port, protocol);
        hl_interface_infrastructure.clear_remote_hl_store_connection_pool();
        return T;
    }

    public static final SubLObject undeclare_remote_hl_store_image_alt() {
        com.cyc.cycjava.cycl.hl_interface_infrastructure.unset_remote_hl_store_image();
        com.cyc.cycjava.cycl.hl_interface_infrastructure.clear_remote_hl_store_connection_pool();
        return T;
    }

    public static SubLObject undeclare_remote_hl_store_image() {
        hl_interface_infrastructure.unset_remote_hl_store_image();
        hl_interface_infrastructure.clear_remote_hl_store_connection_pool();
        return T;
    }

    public static final SubLObject hl_store_remote_eval_alt(SubLObject form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject connection = com.cyc.cycjava.cycl.hl_interface_infrastructure.get_free_hl_store_connection();
                                    {
                                        SubLObject _prev_bind_0_1 = $cfasl_common_symbols$.currentBinding(thread);
                                        try {
                                            $cfasl_common_symbols$.bind(NIL, thread);
                                            cfasl_set_common_symbols(NIL);
                                            {
                                                SubLObject _prev_bind_0_2 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
                                                SubLObject _prev_bind_3 = $cfasl_channel_externalizedP$.currentBinding(thread);
                                                try {
                                                    api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
                                                    api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
                                                    api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
                                                    $cfasl_channel_externalizedP$.bind(NIL, thread);
                                                    {
                                                        SubLObject success_var = NIL;
                                                        try {
                                                            result = remote_image.remote_image_connection_eval(connection, form);
                                                            com.cyc.cycjava.cycl.hl_interface_infrastructure.release_hl_store_connection(connection);
                                                            success_var = T;
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL == success_var) {
                                                                        remote_image.close_remote_image_connection(connection);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $cfasl_channel_externalizedP$.rebind(_prev_bind_3, thread);
                                                    api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_2, thread);
                                                    api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_1, thread);
                                                    api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                        } finally {
                                            $cfasl_common_symbols$.rebind(_prev_bind_0_1, thread);
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
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_error(error_message);
                }
                return result;
            }
        }
    }

    public static SubLObject hl_store_remote_eval(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject connection = hl_interface_infrastructure.get_free_hl_store_connection();
                    final SubLObject _prev_bind_0_$1 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(NIL);
                        final SubLObject _prev_bind_0_$2 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $cfasl_channel_externalizedP$.currentBinding(thread);
                        try {
                            api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
                            api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
                            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
                            $cfasl_channel_externalizedP$.bind(NIL, thread);
                            SubLObject success_var = NIL;
                            try {
                                result = remote_image.remote_image_connection_eval(connection, form);
                                hl_interface_infrastructure.release_hl_store_connection(connection);
                                success_var = T;
                            } finally {
                                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL == success_var) {
                                        remote_image.close_remote_image_connection(connection);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                        } finally {
                            $cfasl_channel_externalizedP$.rebind(_prev_bind_4, thread);
                            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
                            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
                            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            hl_interface_infrastructure.hl_store_error(error_message);
        }
        return result;
    }

    /**
     * define NAME as a (public) Cyc API function which creates an object in the HL store
     * and a handle in the local Cyc image.
     *
     * @see define-api
     */
    @LispMethod(comment = "define NAME as a (public) Cyc API function which creates an object in the HL store\r\nand a handle in the local Cyc image.\r\n\r\n@see define-api\ndefine NAME as a (public) Cyc API function which creates an object in the HL store\nand a handle in the local Cyc image.")
    public static final SubLObject define_hl_creator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            SubLObject documentation_string = NIL;
            SubLObject type_declarations = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            arglist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            documentation_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            type_declarations = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject formal_args = memoization_state.define_formal_args(arglist);
                return list(DEFINE_API, name, arglist, documentation_string, type_declarations, list(PROGN, $list_alt17, listS(NOTE_HL_MODIFIER_INVOCATION, list(QUOTE, name), append(formal_args, NIL)), listS(PIF, $list_alt21, bq_cons(WITHIN_HL_MODIFICATION, append(body, NIL)), $list_alt23)));
            }
        }
    }

    /**
     * define NAME as a (public) Cyc API function which creates an object in the HL store
     * and a handle in the local Cyc image.
     *
     * @see define-api
     */
    @LispMethod(comment = "define NAME as a (public) Cyc API function which creates an object in the HL store\r\nand a handle in the local Cyc image.\r\n\r\n@see define-api\ndefine NAME as a (public) Cyc API function which creates an object in the HL store\nand a handle in the local Cyc image.")
    public static SubLObject define_hl_creator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        SubLObject documentation_string = NIL;
        SubLObject type_declarations = NIL;
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        arglist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        documentation_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        type_declarations = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject formal_args = memoization_state.define_formal_args(arglist);
        return list(hl_interface_infrastructure.DEFINE_API, name, arglist, documentation_string, type_declarations, list(PROGN, hl_interface_infrastructure.$list17, listS(hl_interface_infrastructure.NOTE_HL_MODIFIER_INVOCATION, list(QUOTE, name), append(formal_args, NIL)), listS(PIF, hl_interface_infrastructure.$list21, bq_cons(hl_interface_infrastructure.WITHIN_HL_MODIFICATION, append(body, NIL)), hl_interface_infrastructure.$list23)));
    }

    /**
     * define NAME as a (public) Cyc API function which modifies the HL store.
     *
     * @see define-api
     */
    @LispMethod(comment = "define NAME as a (public) Cyc API function which modifies the HL store.\r\n\r\n@see define-api")
    public static final SubLObject define_hl_modifier_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            SubLObject documentation_string = NIL;
            SubLObject type_declarations = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            arglist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            documentation_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            type_declarations = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject formal_args = memoization_state.define_formal_args(arglist);
                SubLObject eval_args = NIL;
                SubLObject cdolist_list_var = formal_args;
                SubLObject formal_arg = NIL;
                for (formal_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formal_arg = cdolist_list_var.first()) {
                    {
                        SubLObject eval_arg = list(LIST, $list_alt25, formal_arg);
                        eval_args = cons(eval_arg, eval_args);
                    }
                }
                eval_args = nreverse(eval_args);
                {
                    SubLObject result = $sym26$RESULT;
                    return list(DEFINE_API, name, arglist, documentation_string, type_declarations, list(CLET, list(result), $list_alt17, listS(NOTE_HL_MODIFIER_INVOCATION, list(QUOTE, name), append(formal_args, NIL)), list(PWHEN, $list_alt28, list(CSETQ, result, list(HL_STORE_REMOTE_EVAL, listS(LIST, list(QUOTE, name), append(eval_args, NIL))))), list(PIF, $list_alt31, list(OVERRIDE_REMOTE_HL_STORE_ACCESS, bq_cons(WITHIN_HL_MODIFICATION, append(body, NIL))), list(RET, result))));
                }
            }
        }
    }

    /**
     * define NAME as a (public) Cyc API function which modifies the HL store.
     *
     * @see define-api
     */
    @LispMethod(comment = "define NAME as a (public) Cyc API function which modifies the HL store.\r\n\r\n@see define-api")
    public static SubLObject define_hl_modifier(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        SubLObject documentation_string = NIL;
        SubLObject type_declarations = NIL;
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        arglist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        documentation_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        type_declarations = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject formal_args = memoization_state.define_formal_args(arglist);
        SubLObject eval_args = NIL;
        SubLObject cdolist_list_var = formal_args;
        SubLObject formal_arg = NIL;
        formal_arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject eval_arg = list(LIST, hl_interface_infrastructure.$list25, formal_arg);
            eval_args = cons(eval_arg, eval_args);
            cdolist_list_var = cdolist_list_var.rest();
            formal_arg = cdolist_list_var.first();
        } 
        eval_args = nreverse(eval_args);
        final SubLObject result = hl_interface_infrastructure.$sym26$RESULT;
        return list(hl_interface_infrastructure.DEFINE_API, name, arglist, documentation_string, type_declarations, list(CLET, list(result), hl_interface_infrastructure.$list17, listS(hl_interface_infrastructure.NOTE_HL_MODIFIER_INVOCATION, list(QUOTE, name), append(formal_args, NIL)), list(PWHEN, hl_interface_infrastructure.$list28, list(CSETQ, result, list(hl_interface_infrastructure.HL_STORE_REMOTE_EVAL, listS(LIST, list(QUOTE, name), append(eval_args, NIL))))), list(PIF, hl_interface_infrastructure.$list31, list(hl_interface_infrastructure.OVERRIDE_REMOTE_HL_STORE_ACCESS, bq_cons(hl_interface_infrastructure.WITHIN_HL_MODIFICATION, append(body, NIL))), list(RET, result))));
    }

    /**
     * Code to execute before the internals of the hl-modifier (or hl-creator).
     */
    @LispMethod(comment = "Code to execute before the internals of the hl-modifier (or hl-creator).")
    public static final SubLObject define_hl_modifier_preamble_alt() {
        memoization_state.clear_hl_store_dependent_caches();
        return NIL;
    }

    @LispMethod(comment = "Code to execute before the internals of the hl-modifier (or hl-creator).")
    public static SubLObject define_hl_modifier_preamble() {
        memoization_state.clear_hl_store_dependent_caches();
        return NIL;
    }/**
     * Code to execute before the internals of the hl-modifier (or hl-creator).
     */


    /**
     * Code to execute before the internals of the hl-modifier (or hl-creator).
     */
    @LispMethod(comment = "Code to execute before the internals of the hl-modifier (or hl-creator).")
    public static final SubLObject define_hl_modifier_postamble_alt() {
        memoization_state.clear_hl_store_dependent_caches();
        return NIL;
    }

    @LispMethod(comment = "Code to execute before the internals of the hl-modifier (or hl-creator).")
    public static SubLObject define_hl_modifier_postamble() {
        memoization_state.clear_hl_store_dependent_caches();
        return NIL;
    }/**
     * Code to execute before the internals of the hl-modifier (or hl-creator).
     */


    /**
     * define NAME as a (public) Cyc API function which accesses the HL store.
     *
     * @see define-api
     */
    @LispMethod(comment = "define NAME as a (public) Cyc API function which accesses the HL store.\r\n\r\n@see define-api")
    public static final SubLObject define_hl_accessor_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject arglist = NIL;
            SubLObject documentation_string = NIL;
            SubLObject type_declarations = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            arglist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            documentation_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            type_declarations = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject formal_args = memoization_state.define_formal_args(arglist);
                SubLObject eval_args = NIL;
                SubLObject cdolist_list_var = formal_args;
                SubLObject formal_arg = NIL;
                for (formal_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formal_arg = cdolist_list_var.first()) {
                    {
                        SubLObject eval_arg = list(LIST, $list_alt25, formal_arg);
                        eval_args = cons(eval_arg, eval_args);
                    }
                }
                eval_args = nreverse(eval_args);
                return list(DEFINE_API, name, arglist, documentation_string, type_declarations, list(PIF, $list_alt37, list(RET, list(HL_STORE_REMOTE_EVAL, listS(LIST, list(QUOTE, name), append(eval_args, NIL)))), bq_cons(PROGN, append(body, NIL))));
            }
        }
    }

    @LispMethod(comment = "define NAME as a (public) Cyc API function which accesses the HL store.\r\n\r\n@see define-api")
    public static SubLObject define_hl_accessor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        SubLObject documentation_string = NIL;
        SubLObject type_declarations = NIL;
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        arglist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        documentation_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list14);
        type_declarations = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject formal_args = memoization_state.define_formal_args(arglist);
        SubLObject eval_args = NIL;
        SubLObject cdolist_list_var = formal_args;
        SubLObject formal_arg = NIL;
        formal_arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject eval_arg = list(LIST, hl_interface_infrastructure.$list25, formal_arg);
            eval_args = cons(eval_arg, eval_args);
            cdolist_list_var = cdolist_list_var.rest();
            formal_arg = cdolist_list_var.first();
        } 
        eval_args = nreverse(eval_args);
        return list(hl_interface_infrastructure.DEFINE_API, name, arglist, documentation_string, type_declarations, list(PIF, hl_interface_infrastructure.$list37, list(RET, list(hl_interface_infrastructure.HL_STORE_REMOTE_EVAL, listS(LIST, list(QUOTE, name), append(eval_args, NIL)))), bq_cons(PROGN, append(body, NIL))));
    }/**
     * define NAME as a (public) Cyc API function which accesses the HL store.
     *
     * @see define-api
     */


    public static final SubLObject valid_hl_store_error_handling_mode_p_alt(SubLObject mode) {
        return subl_promotions.memberP(mode, $list_alt38, symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject valid_hl_store_error_handling_mode_p(final SubLObject mode) {
        return subl_promotions.memberP(mode, hl_interface_infrastructure.$list38, symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject hl_store_error_handling_mode_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $hl_store_error_handling_mode$.getDynamicValue(thread) ? ((SubLObject) ($hl_store_error_handling_mode$.getDynamicValue(thread))) : $BREAK;
        }
    }

    public static SubLObject hl_store_error_handling_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != hl_interface_infrastructure.$hl_store_error_handling_mode$.getDynamicValue(thread) ? hl_interface_infrastructure.$hl_store_error_handling_mode$.getDynamicValue(thread) : $BREAK;
    }

    public static final SubLObject hl_store_error_alt(SubLObject error_message) {
        SubLTrampolineFile.checkType(error_message, STRINGP);
        {
            SubLObject pcase_var = com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_error_handling_mode();
            if (pcase_var.eql($IGNORE)) {
                return NIL;
            } else {
                if (pcase_var.eql($WARN)) {
                    return Errors.warn(error_message);
                } else {
                    if (pcase_var.eql($BREAK)) {
                        return Errors.error(error_message);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject hl_store_error(final SubLObject error_message) {
        assert NIL != stringp(error_message) : "! stringp(error_message) " + ("Types.stringp(error_message) " + "CommonSymbols.NIL != Types.stringp(error_message) ") + error_message;
        final SubLObject pcase_var = hl_interface_infrastructure.hl_store_error_handling_mode();
        if (pcase_var.eql($IGNORE)) {
            return NIL;
        }
        if (pcase_var.eql($WARN)) {
            return Errors.warn(error_message);
        }
        if (pcase_var.eql($BREAK)) {
            return Errors.error(error_message);
        }
        return NIL;
    }

    public static final SubLObject with_hl_store_error_handling_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mode = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            mode = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, mode, $list_alt45), listS(CLET, list(list($hl_store_error_handling_mode$, mode)), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_hl_store_error_handling_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = NIL;
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list43);
        mode = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, mode, hl_interface_infrastructure.$list45), listS(CLET, list(list(hl_interface_infrastructure.$hl_store_error_handling_mode$, mode)), append(body, NIL)));
    }

    public static final SubLObject with_hl_store_ignore_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_HL_STORE_ERROR_HANDLING_MODE, $IGNORE, append(body, NIL));
        }
    }

    public static SubLObject with_hl_store_ignore_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(hl_interface_infrastructure.WITH_HL_STORE_ERROR_HANDLING_MODE, $IGNORE, append(body, NIL));
    }

    public static final SubLObject with_hl_store_warn_on_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_HL_STORE_ERROR_HANDLING_MODE, $WARN, append(body, NIL));
        }
    }

    public static SubLObject with_hl_store_warn_on_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(hl_interface_infrastructure.WITH_HL_STORE_ERROR_HANDLING_MODE, $WARN, append(body, NIL));
    }

    public static final SubLObject with_hl_store_break_on_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt48, listS(WITH_HL_STORE_ERROR_HANDLING_MODE, $BREAK, append(body, NIL)));
        }
    }

    public static SubLObject with_hl_store_break_on_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, hl_interface_infrastructure.$list48, listS(hl_interface_infrastructure.WITH_HL_STORE_ERROR_HANDLING_MODE, $BREAK, append(body, NIL)));
    }

    public static final SubLObject reset_next_hl_store_iterator_id_alt() {
        $next_hl_store_iterator_id$.setGlobalValue(ZERO_INTEGER);
        return $next_hl_store_iterator_id$.getGlobalValue();
    }

    public static SubLObject reset_next_hl_store_iterator_id() {
        hl_interface_infrastructure.$next_hl_store_iterator_id$.setGlobalValue(ZERO_INTEGER);
        return hl_interface_infrastructure.$next_hl_store_iterator_id$.getGlobalValue();
    }

    public static final SubLObject candidate_next_hl_store_iterator_id_alt() {
        {
            SubLObject next_id = $next_hl_store_iterator_id$.getGlobalValue();
            $next_hl_store_iterator_id$.setGlobalValue(add($next_hl_store_iterator_id$.getGlobalValue(), ONE_INTEGER));
            if ($next_hl_store_iterator_id$.getGlobalValue().numE($most_positive_fixnum$.getGlobalValue())) {
                $next_hl_store_iterator_id$.setGlobalValue(ZERO_INTEGER);
            }
            return next_id;
        }
    }

    public static SubLObject candidate_next_hl_store_iterator_id() {
        final SubLObject next_id = hl_interface_infrastructure.$next_hl_store_iterator_id$.getGlobalValue();
        hl_interface_infrastructure.$next_hl_store_iterator_id$.setGlobalValue(add(hl_interface_infrastructure.$next_hl_store_iterator_id$.getGlobalValue(), ONE_INTEGER));
        if (hl_interface_infrastructure.$next_hl_store_iterator_id$.getGlobalValue().numE($most_positive_fixnum$.getGlobalValue())) {
            hl_interface_infrastructure.$next_hl_store_iterator_id$.setGlobalValue(ZERO_INTEGER);
        }
        return next_id;
    }

    public static final SubLObject new_hl_store_iterator_id_alt() {
        {
            SubLObject next_id = com.cyc.cycjava.cycl.hl_interface_infrastructure.candidate_next_hl_store_iterator_id();
            while (NIL != com.cyc.cycjava.cycl.hl_interface_infrastructure.lookup_hl_store_iterator(next_id)) {
                next_id = com.cyc.cycjava.cycl.hl_interface_infrastructure.candidate_next_hl_store_iterator_id();
            } 
            return next_id;
        }
    }

    public static SubLObject new_hl_store_iterator_id() {
        SubLObject next_id;
        for (next_id = hl_interface_infrastructure.candidate_next_hl_store_iterator_id(); NIL != hl_interface_infrastructure.lookup_hl_store_iterator(next_id); next_id = hl_interface_infrastructure.candidate_next_hl_store_iterator_id()) {
        }
        return next_id;
    }

    public static final SubLObject note_hl_store_iterator_alt(SubLObject iterator) {
        {
            SubLObject id = NIL;
            SubLObject lock = $hl_store_iterator_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                id = com.cyc.cycjava.cycl.hl_interface_infrastructure.new_hl_store_iterator_id();
                dictionary.dictionary_enter($hl_store_iterators$.getGlobalValue(), id, iterator);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return id;
        }
    }

    public static SubLObject note_hl_store_iterator(final SubLObject iterator) {
        SubLObject id = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(hl_interface_infrastructure.$hl_store_iterator_lock$.getGlobalValue());
            id = hl_interface_infrastructure.new_hl_store_iterator_id();
            dictionary.dictionary_enter(hl_interface_infrastructure.$hl_store_iterators$.getGlobalValue(), id, iterator);
        } finally {
            if (NIL != release) {
                release_lock(hl_interface_infrastructure.$hl_store_iterator_lock$.getGlobalValue());
            }
        }
        return id;
    }

    public static final SubLObject lookup_hl_store_iterator_alt(SubLObject id) {
        return dictionary.dictionary_lookup_without_values($hl_store_iterators$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject lookup_hl_store_iterator(final SubLObject id) {
        return dictionary.dictionary_lookup_without_values(hl_interface_infrastructure.$hl_store_iterators$.getGlobalValue(), id, UNPROVIDED);
    }

    public static final SubLObject unnote_hl_store_iterator_alt(SubLObject id) {
        {
            SubLObject result = NIL;
            SubLObject lock = $hl_store_iterator_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = dictionary.dictionary_remove($hl_store_iterators$.getGlobalValue(), id);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static SubLObject unnote_hl_store_iterator(final SubLObject id) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(hl_interface_infrastructure.$hl_store_iterator_lock$.getGlobalValue());
            result = dictionary.dictionary_remove(hl_interface_infrastructure.$hl_store_iterators$.getGlobalValue(), id);
        } finally {
            if (NIL != release) {
                release_lock(hl_interface_infrastructure.$hl_store_iterator_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static final SubLObject new_hl_store_iterator_int_alt(SubLObject form) {
        {
            SubLObject iterator = eval(form);
            return NIL != iteration.iterator_p(iterator) ? ((SubLObject) (com.cyc.cycjava.cycl.hl_interface_infrastructure.note_hl_store_iterator(iterator))) : NIL;
        }
    }

    public static SubLObject new_hl_store_iterator_int(final SubLObject form) {
        final SubLObject iterator = eval(form);
        return NIL != iteration.iterator_p(iterator) ? hl_interface_infrastructure.note_hl_store_iterator(iterator) : NIL;
    }

    public static final SubLObject hl_store_iterator_next_int_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iterator = com.cyc.cycjava.cycl.hl_interface_infrastructure.lookup_hl_store_iterator(id);
                if (NIL != iterator) {
                    thread.resetMultipleValues();
                    {
                        SubLObject next = iteration.iteration_next(iterator);
                        SubLObject validP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return list(next, validP);
                    }
                } else {
                    return list(NIL, NIL);
                }
            }
        }
    }

    public static SubLObject hl_store_iterator_next_int(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = hl_interface_infrastructure.lookup_hl_store_iterator(id);
        if (NIL != iterator) {
            thread.resetMultipleValues();
            final SubLObject next = iteration.iteration_next(iterator);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return list(next, validP);
        }
        return list(NIL, NIL);
    }

    public static final SubLObject hl_store_iterator_next_n_int_alt(SubLObject id, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iterator = com.cyc.cycjava.cycl.hl_interface_infrastructure.lookup_hl_store_iterator(id);
                SubLObject result = NIL;
                if (NIL != iterator) {
                    {
                        SubLObject doneP = NIL;
                        SubLObject count = NIL;
                        for (count = ZERO_INTEGER; !(count.numG(n) || (NIL != doneP)); count = add(count, ONE_INTEGER)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject next = iteration.iteration_next(iterator);
                                SubLObject validP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != validP) {
                                    result = cons(next, result);
                                } else {
                                    doneP = T;
                                }
                            }
                        }
                    }
                    result = nreverse(result);
                }
                return result;
            }
        }
    }

    public static SubLObject hl_store_iterator_next_n_int(final SubLObject id, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = hl_interface_infrastructure.lookup_hl_store_iterator(id);
        SubLObject result = NIL;
        if (NIL != iterator) {
            SubLObject doneP;
            SubLObject count;
            SubLObject next;
            SubLObject validP;
            for (doneP = NIL, count = NIL, count = ZERO_INTEGER; (!count.numG(n)) && (NIL == doneP); count = add(count, ONE_INTEGER)) {
                thread.resetMultipleValues();
                next = iteration.iteration_next(iterator);
                validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != validP) {
                    result = cons(next, result);
                } else {
                    doneP = T;
                }
            }
            result = nreverse(result);
        }
        return result;
    }

    public static final SubLObject hl_store_iterator_done_int_alt(SubLObject id) {
        {
            SubLObject iterator = com.cyc.cycjava.cycl.hl_interface_infrastructure.lookup_hl_store_iterator(id);
            if (NIL != iterator) {
                return iteration.iteration_done(iterator);
            } else {
                return T;
            }
        }
    }

    public static SubLObject hl_store_iterator_done_int(final SubLObject id) {
        final SubLObject iterator = hl_interface_infrastructure.lookup_hl_store_iterator(id);
        if (NIL != iterator) {
            return iteration.iteration_done(iterator);
        }
        return T;
    }

    public static final SubLObject hl_store_iterator_destroy_int_alt(SubLObject id) {
        {
            SubLObject iterator = com.cyc.cycjava.cycl.hl_interface_infrastructure.lookup_hl_store_iterator(id);
            if (NIL != iterator) {
                com.cyc.cycjava.cycl.hl_interface_infrastructure.unnote_hl_store_iterator(id);
                return iteration.iteration_finalize(iterator);
            } else {
                return T;
            }
        }
    }

    public static SubLObject hl_store_iterator_destroy_int(final SubLObject id) {
        final SubLObject iterator = hl_interface_infrastructure.lookup_hl_store_iterator(id);
        if (NIL != iterator) {
            hl_interface_infrastructure.unnote_hl_store_iterator(id);
            return iteration.iteration_finalize(iterator);
        }
        return T;
    }

    public static final SubLObject new_hl_store_iterator_alt(SubLObject form, SubLObject buffer_size) {
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        SubLTrampolineFile.checkType(form, LISTP);
        SubLTrampolineFile.checkType(buffer_size, POSITIVE_INTEGER_P);
        {
            SubLObject id = (NIL != com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_access_remoteP()) ? ((SubLObject) (com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_remote_eval(list(NEW_HL_STORE_ITERATOR_INT, list(QUOTE, form))))) : com.cyc.cycjava.cycl.hl_interface_infrastructure.new_hl_store_iterator_int(form);
            return buffer_size.numE(ONE_INTEGER) ? ((SubLObject) (com.cyc.cycjava.cycl.hl_interface_infrastructure.create_hl_store_iterator(id))) : com.cyc.cycjava.cycl.hl_interface_infrastructure.create_hl_store_buffered_iterator(id, buffer_size);
        }
    }

    public static SubLObject new_hl_store_iterator(final SubLObject form, SubLObject buffer_size) {
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        assert NIL != listp(form) : "! listp(form) " + ("Types.listp(form) " + "CommonSymbols.NIL != Types.listp(form) ") + form;
        assert NIL != subl_promotions.positive_integer_p(buffer_size) : "! subl_promotions.positive_integer_p(buffer_size) " + ("subl_promotions.positive_integer_p(buffer_size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(buffer_size) ") + buffer_size;
        final SubLObject id = (NIL != hl_interface_infrastructure.hl_access_remoteP()) ? hl_interface_infrastructure.hl_store_remote_eval(list(hl_interface_infrastructure.NEW_HL_STORE_ITERATOR_INT, list(QUOTE, form))) : hl_interface_infrastructure.new_hl_store_iterator_int(form);
        return buffer_size.numE(ONE_INTEGER) ? hl_interface_infrastructure.create_hl_store_iterator(id) : hl_interface_infrastructure.create_hl_store_buffered_iterator(id, buffer_size);
    }

    public static final SubLObject destroy_hl_store_iterator_alt(SubLObject iterator) {
        return iteration.iteration_finalize(iterator);
    }

    public static SubLObject destroy_hl_store_iterator(final SubLObject iterator) {
        return iteration.iteration_finalize(iterator);
    }

    public static final SubLObject create_hl_store_iterator_alt(SubLObject id) {
        return iteration.new_iterator(id, $sym55$HL_STORE_ITERATOR_DONE_, HL_STORE_ITERATOR_NEXT, HL_STORE_ITERATOR_DESTROY);
    }

    public static SubLObject create_hl_store_iterator(final SubLObject id) {
        return iteration.new_iterator(id, hl_interface_infrastructure.$sym55$HL_STORE_ITERATOR_DONE_, hl_interface_infrastructure.HL_STORE_ITERATOR_NEXT, hl_interface_infrastructure.HL_STORE_ITERATOR_DESTROY);
    }

    public static final SubLObject hl_store_iterator_doneP_alt(SubLObject id) {
        return NIL != com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_access_remoteP() ? ((SubLObject) (com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_remote_eval(list(HL_STORE_ITERATOR_DONE_INT, id)))) : com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_iterator_done_int(id);
    }

    public static SubLObject hl_store_iterator_doneP(final SubLObject id) {
        return NIL != hl_interface_infrastructure.hl_access_remoteP() ? hl_interface_infrastructure.hl_store_remote_eval(list(hl_interface_infrastructure.HL_STORE_ITERATOR_DONE_INT, id)) : hl_interface_infrastructure.hl_store_iterator_done_int(id);
    }

    public static final SubLObject hl_store_iterator_next_alt(SubLObject id) {
        {
            SubLObject datum = (NIL != com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_access_remoteP()) ? ((SubLObject) (com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_remote_eval(list(HL_STORE_ITERATOR_NEXT_INT, id)))) : com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_iterator_next_int(id);
            SubLObject current = datum;
            SubLObject next = NIL;
            SubLObject validP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt60);
            next = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt60);
            validP = current.first();
            current = current.rest();
            if (NIL == current) {
                return values(next, id, sublisp_null(validP));
            } else {
                cdestructuring_bind_error(datum, $list_alt60);
            }
        }
        return NIL;
    }

    public static SubLObject hl_store_iterator_next(final SubLObject id) {
        SubLObject current;
        final SubLObject datum = current = (NIL != hl_interface_infrastructure.hl_access_remoteP()) ? hl_interface_infrastructure.hl_store_remote_eval(list(hl_interface_infrastructure.HL_STORE_ITERATOR_NEXT_INT, id)) : hl_interface_infrastructure.hl_store_iterator_next_int(id);
        SubLObject next = NIL;
        SubLObject validP = NIL;
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list60);
        next = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, hl_interface_infrastructure.$list60);
        validP = current.first();
        current = current.rest();
        if (NIL == current) {
            return subl_promotions.values3(next, id, sublisp_null(validP));
        }
        cdestructuring_bind_error(datum, hl_interface_infrastructure.$list60);
        return NIL;
    }

    public static final SubLObject hl_store_iterator_destroy_alt(SubLObject id) {
        return NIL != com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_access_remoteP() ? ((SubLObject) (com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_remote_eval(list(HL_STORE_ITERATOR_DESTROY_INT, id)))) : com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_iterator_destroy_int(id);
    }

    public static SubLObject hl_store_iterator_destroy(final SubLObject id) {
        return NIL != hl_interface_infrastructure.hl_access_remoteP() ? hl_interface_infrastructure.hl_store_remote_eval(list(hl_interface_infrastructure.HL_STORE_ITERATOR_DESTROY_INT, id)) : hl_interface_infrastructure.hl_store_iterator_destroy_int(id);
    }

    public static final SubLObject create_hl_store_buffered_iterator_alt(SubLObject id, SubLObject buffer_size) {
        {
            SubLObject state = list(NIL, id, buffer_size);
            return iteration.new_iterator(state, $sym62$HL_STORE_BUFFERED_ITERATOR_DONE_, HL_STORE_BUFFERED_ITERATOR_NEXT, HL_STORE_BUFFERED_ITERATOR_DESTROY);
        }
    }

    public static SubLObject create_hl_store_buffered_iterator(final SubLObject id, final SubLObject buffer_size) {
        final SubLObject state = list(NIL, id, buffer_size);
        return iteration.new_iterator(state, hl_interface_infrastructure.$sym62$HL_STORE_BUFFERED_ITERATOR_DONE_, hl_interface_infrastructure.HL_STORE_BUFFERED_ITERATOR_NEXT, hl_interface_infrastructure.HL_STORE_BUFFERED_ITERATOR_DESTROY);
    }

    public static final SubLObject hl_store_buffered_iterator_doneP_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject buffer = NIL;
            SubLObject id = NIL;
            SubLObject n = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            buffer = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            n = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean((NIL == buffer) && (NIL != com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_iterator_doneP(id)));
            } else {
                cdestructuring_bind_error(datum, $list_alt65);
            }
        }
        return NIL;
    }

    public static SubLObject hl_store_buffered_iterator_doneP(final SubLObject state) {
        SubLObject buffer = NIL;
        SubLObject id = NIL;
        SubLObject n = NIL;
        destructuring_bind_must_consp(state, state, hl_interface_infrastructure.$list65);
        buffer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, hl_interface_infrastructure.$list65);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, hl_interface_infrastructure.$list65);
        n = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL == buffer) && (NIL != hl_interface_infrastructure.hl_store_iterator_doneP(id)));
        }
        cdestructuring_bind_error(state, hl_interface_infrastructure.$list65);
        return NIL;
    }

    public static final SubLObject hl_store_buffered_iterator_next_alt(SubLObject state) {
        {
            SubLObject next = NIL;
            SubLObject invalidP = NIL;
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject buffer = NIL;
            SubLObject id = NIL;
            SubLObject n = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            buffer = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            n = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == buffer) {
                    {
                        SubLObject new_buffer = (NIL != com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_access_remoteP()) ? ((SubLObject) (com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_remote_eval(list(HL_STORE_ITERATOR_NEXT_N_INT, id, n)))) : com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_iterator_next_n_int(id, n);
                        if (NIL != new_buffer) {
                            next = new_buffer.first();
                            set_nth(ZERO_INTEGER, state, new_buffer.rest());
                        } else {
                            invalidP = T;
                        }
                    }
                } else {
                    next = buffer.first();
                    set_nth(ZERO_INTEGER, state, buffer.rest());
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt65);
            }
            return values(next, state, invalidP);
        }
    }

    public static SubLObject hl_store_buffered_iterator_next(final SubLObject state) {
        SubLObject next = NIL;
        SubLObject invalidP = NIL;
        SubLObject buffer = NIL;
        SubLObject id = NIL;
        SubLObject n = NIL;
        destructuring_bind_must_consp(state, state, hl_interface_infrastructure.$list65);
        buffer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, hl_interface_infrastructure.$list65);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, hl_interface_infrastructure.$list65);
        n = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == buffer) {
                final SubLObject new_buffer = (NIL != hl_interface_infrastructure.hl_access_remoteP()) ? hl_interface_infrastructure.hl_store_remote_eval(list(hl_interface_infrastructure.HL_STORE_ITERATOR_NEXT_N_INT, id, n)) : hl_interface_infrastructure.hl_store_iterator_next_n_int(id, n);
                if (NIL != new_buffer) {
                    next = new_buffer.first();
                    set_nth(ZERO_INTEGER, state, new_buffer.rest());
                } else {
                    invalidP = T;
                }
            } else {
                next = buffer.first();
                set_nth(ZERO_INTEGER, state, buffer.rest());
            }
        } else {
            cdestructuring_bind_error(state, hl_interface_infrastructure.$list65);
        }
        return subl_promotions.values3(next, state, invalidP);
    }

    public static final SubLObject hl_store_buffered_iterator_destroy_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject buffer = NIL;
            SubLObject id = NIL;
            SubLObject n = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            buffer = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            n = current.first();
            current = current.rest();
            if (NIL == current) {
                return com.cyc.cycjava.cycl.hl_interface_infrastructure.hl_store_iterator_destroy(id);
            } else {
                cdestructuring_bind_error(datum, $list_alt65);
            }
        }
        return NIL;
    }

    public static SubLObject hl_store_buffered_iterator_destroy(final SubLObject state) {
        SubLObject buffer = NIL;
        SubLObject id = NIL;
        SubLObject n = NIL;
        destructuring_bind_must_consp(state, state, hl_interface_infrastructure.$list65);
        buffer = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, hl_interface_infrastructure.$list65);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, hl_interface_infrastructure.$list65);
        n = current.first();
        current = current.rest();
        if (NIL == current) {
            return hl_interface_infrastructure.hl_store_iterator_destroy(id);
        }
        cdestructuring_bind_error(state, hl_interface_infrastructure.$list65);
        return NIL;
    }

    public static final SubLObject open_hl_transcript_alt(SubLObject filename) {
        {
            SubLObject stream = compatibility.open_binary(filename, $OUTPUT, UNPROVIDED);
            if (stream.isStream()) {
                $hl_transcript_stream$.setGlobalValue(stream);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject open_hl_transcript(final SubLObject filename) {
        final SubLObject stream = compatibility.open_binary(filename, $OUTPUT);
        if (stream.isStream()) {
            hl_interface_infrastructure.$hl_transcript_stream$.setGlobalValue(stream);
            return T;
        }
        return NIL;
    }

    public static final SubLObject close_hl_transcript_alt() {
        if ($hl_transcript_stream$.getGlobalValue().isStream()) {
            close($hl_transcript_stream$.getGlobalValue(), UNPROVIDED);
            $hl_transcript_stream$.setGlobalValue(NIL);
            return T;
        }
        return NIL;
    }

    public static SubLObject close_hl_transcript() {
        if (hl_interface_infrastructure.$hl_transcript_stream$.getGlobalValue().isStream()) {
            close(hl_interface_infrastructure.$hl_transcript_stream$.getGlobalValue(), UNPROVIDED);
            hl_interface_infrastructure.$hl_transcript_stream$.setGlobalValue(NIL);
            return T;
        }
        return NIL;
    }

    public static final SubLObject new_hl_transcript_op(SubLObject func, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        {
            SubLObject args = remove($UNPROVIDED, list(arg1, arg2, arg3, arg4, arg5), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return listS(func, args);
        }
    }

    public static SubLObject new_hl_transcript_op(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        final SubLObject args = remove($UNPROVIDED, list(arg1, arg2, arg3, arg4, arg5, arg6, arg7), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return listS(func, args);
    }

    public static final SubLObject note_hl_modifier_invocation(SubLObject name, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = $UNPROVIDED;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $UNPROVIDED;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $UNPROVIDED;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $UNPROVIDED;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $UNPROVIDED;
        }
        if ($hl_transcript_stream$.getGlobalValue().isStream()) {
            {
                SubLObject hlop = com.cyc.cycjava.cycl.hl_interface_infrastructure.new_hl_transcript_op(name, arg1, arg2, arg3, arg4, arg5);
                cfasl_output_externalized(hlop, $hl_transcript_stream$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject note_hl_modifier_invocation(final SubLObject name, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7) {
        if (arg1 == UNPROVIDED) {
            arg1 = $UNPROVIDED;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $UNPROVIDED;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $UNPROVIDED;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $UNPROVIDED;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $UNPROVIDED;
        }
        if (arg6 == UNPROVIDED) {
            arg6 = $UNPROVIDED;
        }
        if (arg7 == UNPROVIDED) {
            arg7 = $UNPROVIDED;
        }
        if (hl_interface_infrastructure.$hl_transcript_stream$.getGlobalValue().isStream()) {
            final SubLObject hlop = hl_interface_infrastructure.new_hl_transcript_op(name, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            cfasl_output_externalized(hlop, hl_interface_infrastructure.$hl_transcript_stream$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject load_hl_transcript_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt71$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_4 = stream;
                        SubLObject result = NIL;
                        while ($EOF != result) {
                            result = com.cyc.cycjava.cycl.hl_interface_infrastructure.load_one_hl_transcript_op(stream_4);
                            if ($EOF != result) {
                                count = add(count, ONE_INTEGER);
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject load_hl_transcript(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error(hl_interface_infrastructure.$str71$Unable_to_open__S, filename);
            }
            final SubLObject stream_$4 = stream;
            SubLObject result = NIL;
            while ($EOF != result) {
                result = hl_interface_infrastructure.load_one_hl_transcript_op(stream_$4);
                if ($EOF != result) {
                    count = add(count, ONE_INTEGER);
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
        return count;
    }

    public static final SubLObject load_one_hl_transcript_op_alt(SubLObject stream) {
        {
            SubLObject hlop = cfasl_input(stream, NIL, UNPROVIDED);
            if ($EOF == hlop) {
                return $EOF;
            } else {
                return com.cyc.cycjava.cycl.hl_interface_infrastructure.eval_hl_transcript_op(hlop);
            }
        }
    }

    public static SubLObject load_one_hl_transcript_op(final SubLObject stream) {
        final SubLObject hlop = cfasl_input(stream, NIL, UNPROVIDED);
        if ($EOF == hlop) {
            return $EOF;
        }
        return hl_interface_infrastructure.eval_hl_transcript_op(hlop);
    }

    public static final SubLObject eval_hl_transcript_op_alt(SubLObject hlop) {
        {
            SubLObject func = hlop.first();
            SubLObject arg1 = second(hlop);
            SubLObject rest_args = nthcdr(TWO_INTEGER, hlop);
            return apply(func, arg1, rest_args);
        }
    }

    public static SubLObject eval_hl_transcript_op(final SubLObject hlop) {
        final SubLObject func = hlop.first();
        final SubLObject arg1 = second(hlop);
        final SubLObject rest_args = nthcdr(TWO_INTEGER, hlop);
        return apply(func, arg1, rest_args);
    }

    public static final SubLObject declare_hl_interface_infrastructure_file_alt() {
        declareFunction("hl_modify_localP", "HL-MODIFY-LOCAL?", 0, 0, false);
        declareFunction("hl_modify_remoteP", "HL-MODIFY-REMOTE?", 0, 0, false);
        declareFunction("hl_modify_anywhereP", "HL-MODIFY-ANYWHERE?", 0, 0, false);
        declareFunction("hl_access_localP", "HL-ACCESS-LOCAL?", 0, 0, false);
        declareFunction("hl_access_remoteP", "HL-ACCESS-REMOTE?", 0, 0, false);
        declareMacro("override_remote_hl_store_access", "OVERRIDE-REMOTE-HL-STORE-ACCESS");
        declareMacro("do_not_override_remote_hl_store_access", "DO-NOT-OVERRIDE-REMOTE-HL-STORE-ACCESS");
        declareFunction("set_remote_hl_store_image", "SET-REMOTE-HL-STORE-IMAGE", 3, 0, false);
        declareFunction("unset_remote_hl_store_image", "UNSET-REMOTE-HL-STORE-IMAGE", 0, 0, false);
        declareFunction("clear_remote_hl_store_connection_pool", "CLEAR-REMOTE-HL-STORE-CONNECTION-POOL", 0, 0, false);
        declareFunction("create_remote_hl_store_connection", "CREATE-REMOTE-HL-STORE-CONNECTION", 0, 0, false);
        declareFunction("release_hl_store_connection", "RELEASE-HL-STORE-CONNECTION", 1, 0, false);
        declareFunction("open_remote_hl_store_connection_p", "OPEN-REMOTE-HL-STORE-CONNECTION-P", 1, 0, false);
        declareFunction("get_free_hl_store_connection", "GET-FREE-HL-STORE-CONNECTION", 0, 0, false);
        declareFunction("initialize_remote_hl_store_connections", "INITIALIZE-REMOTE-HL-STORE-CONNECTIONS", 0, 0, false);
        declareFunction("declare_remote_hl_store_image", "DECLARE-REMOTE-HL-STORE-IMAGE", 2, 1, false);
        declareFunction("undeclare_remote_hl_store_image", "UNDECLARE-REMOTE-HL-STORE-IMAGE", 0, 0, false);
        declareFunction("hl_store_remote_eval", "HL-STORE-REMOTE-EVAL", 1, 0, false);
        declareMacro("define_hl_creator", "DEFINE-HL-CREATOR");
        declareMacro("define_hl_modifier", "DEFINE-HL-MODIFIER");
        declareFunction("define_hl_modifier_preamble", "DEFINE-HL-MODIFIER-PREAMBLE", 0, 0, false);
        declareFunction("define_hl_modifier_postamble", "DEFINE-HL-MODIFIER-POSTAMBLE", 0, 0, false);
        declareMacro("define_hl_accessor", "DEFINE-HL-ACCESSOR");
        declareFunction("valid_hl_store_error_handling_mode_p", "VALID-HL-STORE-ERROR-HANDLING-MODE-P", 1, 0, false);
        declareFunction("hl_store_error_handling_mode", "HL-STORE-ERROR-HANDLING-MODE", 0, 0, false);
        declareFunction("hl_store_error", "HL-STORE-ERROR", 1, 0, false);
        declareMacro("with_hl_store_error_handling_mode", "WITH-HL-STORE-ERROR-HANDLING-MODE");
        declareMacro("with_hl_store_ignore_errors", "WITH-HL-STORE-IGNORE-ERRORS");
        declareMacro("with_hl_store_warn_on_errors", "WITH-HL-STORE-WARN-ON-ERRORS");
        declareMacro("with_hl_store_break_on_errors", "WITH-HL-STORE-BREAK-ON-ERRORS");
        declareFunction("reset_next_hl_store_iterator_id", "RESET-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false);
        declareFunction("candidate_next_hl_store_iterator_id", "CANDIDATE-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false);
        declareFunction("new_hl_store_iterator_id", "NEW-HL-STORE-ITERATOR-ID", 0, 0, false);
        declareFunction("note_hl_store_iterator", "NOTE-HL-STORE-ITERATOR", 1, 0, false);
        declareFunction("lookup_hl_store_iterator", "LOOKUP-HL-STORE-ITERATOR", 1, 0, false);
        declareFunction("unnote_hl_store_iterator", "UNNOTE-HL-STORE-ITERATOR", 1, 0, false);
        declareFunction("new_hl_store_iterator_int", "NEW-HL-STORE-ITERATOR-INT", 1, 0, false);
        declareFunction("hl_store_iterator_next_int", "HL-STORE-ITERATOR-NEXT-INT", 1, 0, false);
        declareFunction("hl_store_iterator_next_n_int", "HL-STORE-ITERATOR-NEXT-N-INT", 2, 0, false);
        declareFunction("hl_store_iterator_done_int", "HL-STORE-ITERATOR-DONE-INT", 1, 0, false);
        declareFunction("hl_store_iterator_destroy_int", "HL-STORE-ITERATOR-DESTROY-INT", 1, 0, false);
        declareFunction("new_hl_store_iterator", "NEW-HL-STORE-ITERATOR", 1, 1, false);
        declareFunction("destroy_hl_store_iterator", "DESTROY-HL-STORE-ITERATOR", 1, 0, false);
        declareFunction("create_hl_store_iterator", "CREATE-HL-STORE-ITERATOR", 1, 0, false);
        declareFunction("hl_store_iterator_doneP", "HL-STORE-ITERATOR-DONE?", 1, 0, false);
        new com.cyc.cycjava.cycl.hl_interface_infrastructure.$hl_store_iterator_doneP$UnaryFunction();
        declareFunction("hl_store_iterator_next", "HL-STORE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("hl_store_iterator_destroy", "HL-STORE-ITERATOR-DESTROY", 1, 0, false);
        new com.cyc.cycjava.cycl.hl_interface_infrastructure.$hl_store_iterator_destroy$UnaryFunction();
        declareFunction("create_hl_store_buffered_iterator", "CREATE-HL-STORE-BUFFERED-ITERATOR", 2, 0, false);
        declareFunction("hl_store_buffered_iterator_doneP", "HL-STORE-BUFFERED-ITERATOR-DONE?", 1, 0, false);
        declareFunction("hl_store_buffered_iterator_next", "HL-STORE-BUFFERED-ITERATOR-NEXT", 1, 0, false);
        declareFunction("hl_store_buffered_iterator_destroy", "HL-STORE-BUFFERED-ITERATOR-DESTROY", 1, 0, false);
        declareFunction("open_hl_transcript", "OPEN-HL-TRANSCRIPT", 1, 0, false);
        declareFunction("close_hl_transcript", "CLOSE-HL-TRANSCRIPT", 0, 0, false);
        declareFunction("new_hl_transcript_op", "NEW-HL-TRANSCRIPT-OP", 6, 0, false);
        declareFunction("note_hl_modifier_invocation", "NOTE-HL-MODIFIER-INVOCATION", 1, 5, false);
        declareFunction("load_hl_transcript", "LOAD-HL-TRANSCRIPT", 1, 0, false);
        declareFunction("load_one_hl_transcript_op", "LOAD-ONE-HL-TRANSCRIPT-OP", 1, 0, false);
        declareFunction("eval_hl_transcript_op", "EVAL-HL-TRANSCRIPT-OP", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_hl_interface_infrastructure_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("hl_modify_localP", "HL-MODIFY-LOCAL?", 0, 0, false);
            declareFunction("hl_modify_remoteP", "HL-MODIFY-REMOTE?", 0, 0, false);
            declareFunction("hl_modify_anywhereP", "HL-MODIFY-ANYWHERE?", 0, 0, false);
            declareFunction("hl_access_localP", "HL-ACCESS-LOCAL?", 0, 0, false);
            declareFunction("hl_access_remoteP", "HL-ACCESS-REMOTE?", 0, 0, false);
            declareMacro("override_remote_hl_store_access", "OVERRIDE-REMOTE-HL-STORE-ACCESS");
            declareMacro("do_not_override_remote_hl_store_access", "DO-NOT-OVERRIDE-REMOTE-HL-STORE-ACCESS");
            declareFunction("set_remote_hl_store_image", "SET-REMOTE-HL-STORE-IMAGE", 3, 0, false);
            declareFunction("unset_remote_hl_store_image", "UNSET-REMOTE-HL-STORE-IMAGE", 0, 0, false);
            declareFunction("clear_remote_hl_store_connection_pool", "CLEAR-REMOTE-HL-STORE-CONNECTION-POOL", 0, 0, false);
            declareFunction("create_remote_hl_store_connection", "CREATE-REMOTE-HL-STORE-CONNECTION", 0, 0, false);
            declareFunction("release_hl_store_connection", "RELEASE-HL-STORE-CONNECTION", 1, 0, false);
            declareFunction("open_remote_hl_store_connection_p", "OPEN-REMOTE-HL-STORE-CONNECTION-P", 1, 0, false);
            declareFunction("get_free_hl_store_connection", "GET-FREE-HL-STORE-CONNECTION", 0, 0, false);
            declareFunction("initialize_remote_hl_store_connections", "INITIALIZE-REMOTE-HL-STORE-CONNECTIONS", 0, 0, false);
            declareFunction("declare_remote_hl_store_image", "DECLARE-REMOTE-HL-STORE-IMAGE", 2, 1, false);
            declareFunction("undeclare_remote_hl_store_image", "UNDECLARE-REMOTE-HL-STORE-IMAGE", 0, 0, false);
            declareFunction("hl_store_remote_eval", "HL-STORE-REMOTE-EVAL", 1, 0, false);
            declareMacro("define_hl_creator", "DEFINE-HL-CREATOR");
            declareMacro("define_hl_modifier", "DEFINE-HL-MODIFIER");
            declareFunction("define_hl_modifier_preamble", "DEFINE-HL-MODIFIER-PREAMBLE", 0, 0, false);
            declareFunction("define_hl_modifier_postamble", "DEFINE-HL-MODIFIER-POSTAMBLE", 0, 0, false);
            declareMacro("define_hl_accessor", "DEFINE-HL-ACCESSOR");
            declareFunction("valid_hl_store_error_handling_mode_p", "VALID-HL-STORE-ERROR-HANDLING-MODE-P", 1, 0, false);
            declareFunction("hl_store_error_handling_mode", "HL-STORE-ERROR-HANDLING-MODE", 0, 0, false);
            declareFunction("hl_store_error", "HL-STORE-ERROR", 1, 0, false);
            declareMacro("with_hl_store_error_handling_mode", "WITH-HL-STORE-ERROR-HANDLING-MODE");
            declareMacro("with_hl_store_ignore_errors", "WITH-HL-STORE-IGNORE-ERRORS");
            declareMacro("with_hl_store_warn_on_errors", "WITH-HL-STORE-WARN-ON-ERRORS");
            declareMacro("with_hl_store_break_on_errors", "WITH-HL-STORE-BREAK-ON-ERRORS");
            declareFunction("reset_next_hl_store_iterator_id", "RESET-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false);
            declareFunction("candidate_next_hl_store_iterator_id", "CANDIDATE-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false);
            declareFunction("new_hl_store_iterator_id", "NEW-HL-STORE-ITERATOR-ID", 0, 0, false);
            declareFunction("note_hl_store_iterator", "NOTE-HL-STORE-ITERATOR", 1, 0, false);
            declareFunction("lookup_hl_store_iterator", "LOOKUP-HL-STORE-ITERATOR", 1, 0, false);
            declareFunction("unnote_hl_store_iterator", "UNNOTE-HL-STORE-ITERATOR", 1, 0, false);
            declareFunction("new_hl_store_iterator_int", "NEW-HL-STORE-ITERATOR-INT", 1, 0, false);
            declareFunction("hl_store_iterator_next_int", "HL-STORE-ITERATOR-NEXT-INT", 1, 0, false);
            declareFunction("hl_store_iterator_next_n_int", "HL-STORE-ITERATOR-NEXT-N-INT", 2, 0, false);
            declareFunction("hl_store_iterator_done_int", "HL-STORE-ITERATOR-DONE-INT", 1, 0, false);
            declareFunction("hl_store_iterator_destroy_int", "HL-STORE-ITERATOR-DESTROY-INT", 1, 0, false);
            declareFunction("new_hl_store_iterator", "NEW-HL-STORE-ITERATOR", 1, 1, false);
            declareFunction("destroy_hl_store_iterator", "DESTROY-HL-STORE-ITERATOR", 1, 0, false);
            declareFunction("create_hl_store_iterator", "CREATE-HL-STORE-ITERATOR", 1, 0, false);
            declareFunction("hl_store_iterator_doneP", "HL-STORE-ITERATOR-DONE?", 1, 0, false);
            new hl_interface_infrastructure.$hl_store_iterator_doneP$UnaryFunction();
            declareFunction("hl_store_iterator_next", "HL-STORE-ITERATOR-NEXT", 1, 0, false);
            declareFunction("hl_store_iterator_destroy", "HL-STORE-ITERATOR-DESTROY", 1, 0, false);
            new hl_interface_infrastructure.$hl_store_iterator_destroy$UnaryFunction();
            declareFunction("create_hl_store_buffered_iterator", "CREATE-HL-STORE-BUFFERED-ITERATOR", 2, 0, false);
            declareFunction("hl_store_buffered_iterator_doneP", "HL-STORE-BUFFERED-ITERATOR-DONE?", 1, 0, false);
            declareFunction("hl_store_buffered_iterator_next", "HL-STORE-BUFFERED-ITERATOR-NEXT", 1, 0, false);
            declareFunction("hl_store_buffered_iterator_destroy", "HL-STORE-BUFFERED-ITERATOR-DESTROY", 1, 0, false);
            declareFunction("open_hl_transcript", "OPEN-HL-TRANSCRIPT", 1, 0, false);
            declareFunction("close_hl_transcript", "CLOSE-HL-TRANSCRIPT", 0, 0, false);
            declareFunction("new_hl_transcript_op", "NEW-HL-TRANSCRIPT-OP", 8, 0, false);
            declareFunction("note_hl_modifier_invocation", "NOTE-HL-MODIFIER-INVOCATION", 1, 7, false);
            declareFunction("load_hl_transcript", "LOAD-HL-TRANSCRIPT", 1, 0, false);
            declareFunction("load_one_hl_transcript_op", "LOAD-ONE-HL-TRANSCRIPT-OP", 1, 0, false);
            declareFunction("eval_hl_transcript_op", "EVAL-HL-TRANSCRIPT-OP", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("new_hl_transcript_op", "NEW-HL-TRANSCRIPT-OP", 6, 0, false);
            declareFunction("note_hl_modifier_invocation", "NOTE-HL-MODIFIER-INVOCATION", 1, 5, false);
        }
        return NIL;
    }

    public static SubLObject declare_hl_interface_infrastructure_file_Previous() {
        declareFunction("hl_modify_localP", "HL-MODIFY-LOCAL?", 0, 0, false);
        declareFunction("hl_modify_remoteP", "HL-MODIFY-REMOTE?", 0, 0, false);
        declareFunction("hl_modify_anywhereP", "HL-MODIFY-ANYWHERE?", 0, 0, false);
        declareFunction("hl_access_localP", "HL-ACCESS-LOCAL?", 0, 0, false);
        declareFunction("hl_access_remoteP", "HL-ACCESS-REMOTE?", 0, 0, false);
        declareMacro("override_remote_hl_store_access", "OVERRIDE-REMOTE-HL-STORE-ACCESS");
        declareMacro("do_not_override_remote_hl_store_access", "DO-NOT-OVERRIDE-REMOTE-HL-STORE-ACCESS");
        declareFunction("set_remote_hl_store_image", "SET-REMOTE-HL-STORE-IMAGE", 3, 0, false);
        declareFunction("unset_remote_hl_store_image", "UNSET-REMOTE-HL-STORE-IMAGE", 0, 0, false);
        declareFunction("clear_remote_hl_store_connection_pool", "CLEAR-REMOTE-HL-STORE-CONNECTION-POOL", 0, 0, false);
        declareFunction("create_remote_hl_store_connection", "CREATE-REMOTE-HL-STORE-CONNECTION", 0, 0, false);
        declareFunction("release_hl_store_connection", "RELEASE-HL-STORE-CONNECTION", 1, 0, false);
        declareFunction("open_remote_hl_store_connection_p", "OPEN-REMOTE-HL-STORE-CONNECTION-P", 1, 0, false);
        declareFunction("get_free_hl_store_connection", "GET-FREE-HL-STORE-CONNECTION", 0, 0, false);
        declareFunction("initialize_remote_hl_store_connections", "INITIALIZE-REMOTE-HL-STORE-CONNECTIONS", 0, 0, false);
        declareFunction("declare_remote_hl_store_image", "DECLARE-REMOTE-HL-STORE-IMAGE", 2, 1, false);
        declareFunction("undeclare_remote_hl_store_image", "UNDECLARE-REMOTE-HL-STORE-IMAGE", 0, 0, false);
        declareFunction("hl_store_remote_eval", "HL-STORE-REMOTE-EVAL", 1, 0, false);
        declareMacro("define_hl_creator", "DEFINE-HL-CREATOR");
        declareMacro("define_hl_modifier", "DEFINE-HL-MODIFIER");
        declareFunction("define_hl_modifier_preamble", "DEFINE-HL-MODIFIER-PREAMBLE", 0, 0, false);
        declareFunction("define_hl_modifier_postamble", "DEFINE-HL-MODIFIER-POSTAMBLE", 0, 0, false);
        declareMacro("define_hl_accessor", "DEFINE-HL-ACCESSOR");
        declareFunction("valid_hl_store_error_handling_mode_p", "VALID-HL-STORE-ERROR-HANDLING-MODE-P", 1, 0, false);
        declareFunction("hl_store_error_handling_mode", "HL-STORE-ERROR-HANDLING-MODE", 0, 0, false);
        declareFunction("hl_store_error", "HL-STORE-ERROR", 1, 0, false);
        declareMacro("with_hl_store_error_handling_mode", "WITH-HL-STORE-ERROR-HANDLING-MODE");
        declareMacro("with_hl_store_ignore_errors", "WITH-HL-STORE-IGNORE-ERRORS");
        declareMacro("with_hl_store_warn_on_errors", "WITH-HL-STORE-WARN-ON-ERRORS");
        declareMacro("with_hl_store_break_on_errors", "WITH-HL-STORE-BREAK-ON-ERRORS");
        declareFunction("reset_next_hl_store_iterator_id", "RESET-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false);
        declareFunction("candidate_next_hl_store_iterator_id", "CANDIDATE-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false);
        declareFunction("new_hl_store_iterator_id", "NEW-HL-STORE-ITERATOR-ID", 0, 0, false);
        declareFunction("note_hl_store_iterator", "NOTE-HL-STORE-ITERATOR", 1, 0, false);
        declareFunction("lookup_hl_store_iterator", "LOOKUP-HL-STORE-ITERATOR", 1, 0, false);
        declareFunction("unnote_hl_store_iterator", "UNNOTE-HL-STORE-ITERATOR", 1, 0, false);
        declareFunction("new_hl_store_iterator_int", "NEW-HL-STORE-ITERATOR-INT", 1, 0, false);
        declareFunction("hl_store_iterator_next_int", "HL-STORE-ITERATOR-NEXT-INT", 1, 0, false);
        declareFunction("hl_store_iterator_next_n_int", "HL-STORE-ITERATOR-NEXT-N-INT", 2, 0, false);
        declareFunction("hl_store_iterator_done_int", "HL-STORE-ITERATOR-DONE-INT", 1, 0, false);
        declareFunction("hl_store_iterator_destroy_int", "HL-STORE-ITERATOR-DESTROY-INT", 1, 0, false);
        declareFunction("new_hl_store_iterator", "NEW-HL-STORE-ITERATOR", 1, 1, false);
        declareFunction("destroy_hl_store_iterator", "DESTROY-HL-STORE-ITERATOR", 1, 0, false);
        declareFunction("create_hl_store_iterator", "CREATE-HL-STORE-ITERATOR", 1, 0, false);
        declareFunction("hl_store_iterator_doneP", "HL-STORE-ITERATOR-DONE?", 1, 0, false);
        new hl_interface_infrastructure.$hl_store_iterator_doneP$UnaryFunction();
        declareFunction("hl_store_iterator_next", "HL-STORE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("hl_store_iterator_destroy", "HL-STORE-ITERATOR-DESTROY", 1, 0, false);
        new hl_interface_infrastructure.$hl_store_iterator_destroy$UnaryFunction();
        declareFunction("create_hl_store_buffered_iterator", "CREATE-HL-STORE-BUFFERED-ITERATOR", 2, 0, false);
        declareFunction("hl_store_buffered_iterator_doneP", "HL-STORE-BUFFERED-ITERATOR-DONE?", 1, 0, false);
        declareFunction("hl_store_buffered_iterator_next", "HL-STORE-BUFFERED-ITERATOR-NEXT", 1, 0, false);
        declareFunction("hl_store_buffered_iterator_destroy", "HL-STORE-BUFFERED-ITERATOR-DESTROY", 1, 0, false);
        declareFunction("open_hl_transcript", "OPEN-HL-TRANSCRIPT", 1, 0, false);
        declareFunction("close_hl_transcript", "CLOSE-HL-TRANSCRIPT", 0, 0, false);
        declareFunction("new_hl_transcript_op", "NEW-HL-TRANSCRIPT-OP", 8, 0, false);
        declareFunction("note_hl_modifier_invocation", "NOTE-HL-MODIFIER-INVOCATION", 1, 7, false);
        declareFunction("load_hl_transcript", "LOAD-HL-TRANSCRIPT", 1, 0, false);
        declareFunction("load_one_hl_transcript_op", "LOAD-ONE-HL-TRANSCRIPT-OP", 1, 0, false);
        declareFunction("eval_hl_transcript_op", "EVAL-HL-TRANSCRIPT-OP", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_hl_interface_infrastructure_file_alt() {
        defvar("*HL-STORE-MODIFICATION-AND-ACCESS*", $LOCAL_LOCAL);
        defvar("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*", NIL);
        deflexical("*REMOTE-HL-STORE-IMAGE*", NIL != boundp($remote_hl_store_image$) ? ((SubLObject) ($remote_hl_store_image$.getGlobalValue())) : NIL);
        deflexical("*REMOTE-HL-STORE-CONNECTION-POOL*", NIL != boundp($remote_hl_store_connection_pool$) ? ((SubLObject) ($remote_hl_store_connection_pool$.getGlobalValue())) : queues.create_queue());
        deflexical("*REMOTE-HL-STORE-CONNECTION-POOL-LOCK*", make_lock($str_alt10$Remote_HL_Store_Connection_Pool_L));
        deflexical("*REMOTE-HL-STORE-CONNECTION-POOL-MAX-SIZE*", NINE_INTEGER);
        defparameter("*HL-STORE-ERROR-HANDLING-MODE*", NIL);
        deflexical("*HL-STORE-ITERATORS*", NIL != boundp($hl_store_iterators$) ? ((SubLObject) ($hl_store_iterators$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        deflexical("*NEXT-HL-STORE-ITERATOR-ID*", NIL != boundp($next_hl_store_iterator_id$) ? ((SubLObject) ($next_hl_store_iterator_id$.getGlobalValue())) : ZERO_INTEGER);
        deflexical("*HL-STORE-ITERATOR-LOCK*", make_lock($$$HL_Store_Iterator_Lock));
        deflexical("*HL-TRANSCRIPT-STREAM*", NIL != boundp($hl_transcript_stream$) ? ((SubLObject) ($hl_transcript_stream$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_hl_interface_infrastructure_file() {
        if (SubLFiles.USE_V1) {
            defvar("*HL-STORE-MODIFICATION-AND-ACCESS*", $LOCAL_LOCAL);
            defvar("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*", NIL);
            deflexical("*REMOTE-HL-STORE-IMAGE*", SubLTrampolineFile.maybeDefault(hl_interface_infrastructure.$remote_hl_store_image$, hl_interface_infrastructure.$remote_hl_store_image$, NIL));
            deflexical("*REMOTE-HL-STORE-CONNECTION-POOL*", SubLTrampolineFile.maybeDefault(hl_interface_infrastructure.$remote_hl_store_connection_pool$, hl_interface_infrastructure.$remote_hl_store_connection_pool$, () -> queues.create_queue(UNPROVIDED)));
            deflexical("*REMOTE-HL-STORE-CONNECTION-POOL-LOCK*", make_lock(hl_interface_infrastructure.$str10$Remote_HL_Store_Connection_Pool_L));
            deflexical("*REMOTE-HL-STORE-CONNECTION-POOL-MAX-SIZE*", NINE_INTEGER);
            defparameter("*HL-STORE-ERROR-HANDLING-MODE*", NIL);
            deflexical("*HL-STORE-ITERATORS*", SubLTrampolineFile.maybeDefault(hl_interface_infrastructure.$hl_store_iterators$, hl_interface_infrastructure.$hl_store_iterators$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
            deflexical("*NEXT-HL-STORE-ITERATOR-ID*", SubLTrampolineFile.maybeDefault(hl_interface_infrastructure.$next_hl_store_iterator_id$, hl_interface_infrastructure.$next_hl_store_iterator_id$, ZERO_INTEGER));
            deflexical("*HL-STORE-ITERATOR-LOCK*", make_lock(hl_interface_infrastructure.$$$HL_Store_Iterator_Lock));
            deflexical("*HL-TRANSCRIPT-STREAM*", SubLTrampolineFile.maybeDefault(hl_interface_infrastructure.$hl_transcript_stream$, hl_interface_infrastructure.$hl_transcript_stream$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*REMOTE-HL-STORE-IMAGE*", NIL != boundp($remote_hl_store_image$) ? ((SubLObject) ($remote_hl_store_image$.getGlobalValue())) : NIL);
            deflexical("*REMOTE-HL-STORE-CONNECTION-POOL*", NIL != boundp($remote_hl_store_connection_pool$) ? ((SubLObject) ($remote_hl_store_connection_pool$.getGlobalValue())) : queues.create_queue());
            deflexical("*HL-STORE-ITERATORS*", NIL != boundp($hl_store_iterators$) ? ((SubLObject) ($hl_store_iterators$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
            deflexical("*NEXT-HL-STORE-ITERATOR-ID*", NIL != boundp($next_hl_store_iterator_id$) ? ((SubLObject) ($next_hl_store_iterator_id$.getGlobalValue())) : ZERO_INTEGER);
            deflexical("*HL-TRANSCRIPT-STREAM*", NIL != boundp($hl_transcript_stream$) ? ((SubLObject) ($hl_transcript_stream$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_hl_interface_infrastructure_file_Previous() {
        defvar("*HL-STORE-MODIFICATION-AND-ACCESS*", $LOCAL_LOCAL);
        defvar("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*", NIL);
        deflexical("*REMOTE-HL-STORE-IMAGE*", SubLTrampolineFile.maybeDefault(hl_interface_infrastructure.$remote_hl_store_image$, hl_interface_infrastructure.$remote_hl_store_image$, NIL));
        deflexical("*REMOTE-HL-STORE-CONNECTION-POOL*", SubLTrampolineFile.maybeDefault(hl_interface_infrastructure.$remote_hl_store_connection_pool$, hl_interface_infrastructure.$remote_hl_store_connection_pool$, () -> queues.create_queue(UNPROVIDED)));
        deflexical("*REMOTE-HL-STORE-CONNECTION-POOL-LOCK*", make_lock(hl_interface_infrastructure.$str10$Remote_HL_Store_Connection_Pool_L));
        deflexical("*REMOTE-HL-STORE-CONNECTION-POOL-MAX-SIZE*", NINE_INTEGER);
        defparameter("*HL-STORE-ERROR-HANDLING-MODE*", NIL);
        deflexical("*HL-STORE-ITERATORS*", SubLTrampolineFile.maybeDefault(hl_interface_infrastructure.$hl_store_iterators$, hl_interface_infrastructure.$hl_store_iterators$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
        deflexical("*NEXT-HL-STORE-ITERATOR-ID*", SubLTrampolineFile.maybeDefault(hl_interface_infrastructure.$next_hl_store_iterator_id$, hl_interface_infrastructure.$next_hl_store_iterator_id$, ZERO_INTEGER));
        deflexical("*HL-STORE-ITERATOR-LOCK*", make_lock(hl_interface_infrastructure.$$$HL_Store_Iterator_Lock));
        deflexical("*HL-TRANSCRIPT-STREAM*", SubLTrampolineFile.maybeDefault(hl_interface_infrastructure.$hl_transcript_stream$, hl_interface_infrastructure.$hl_transcript_stream$, NIL));
        return NIL;
    }

    public static SubLObject setup_hl_interface_infrastructure_file() {
        declare_defglobal(hl_interface_infrastructure.$remote_hl_store_image$);
        declare_defglobal(hl_interface_infrastructure.$remote_hl_store_connection_pool$);
        register_macro_helper(hl_interface_infrastructure.DEFINE_HL_MODIFIER_PREAMBLE, hl_interface_infrastructure.$list35);
        register_macro_helper(hl_interface_infrastructure.DEFINE_HL_MODIFIER_POSTAMBLE, hl_interface_infrastructure.$list35);
        declare_defglobal(hl_interface_infrastructure.$hl_store_iterators$);
        declare_defglobal(hl_interface_infrastructure.$next_hl_store_iterator_id$);
        declare_defglobal(hl_interface_infrastructure.$hl_transcript_stream$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        hl_interface_infrastructure.declare_hl_interface_infrastructure_file();
    }

    @Override
    public void initializeVariables() {
        hl_interface_infrastructure.init_hl_interface_infrastructure_file();
    }

    @Override
    public void runTopLevelForms() {
        hl_interface_infrastructure.setup_hl_interface_infrastructure_file();
    }

    static {
    }

    public static final class $hl_store_iterator_doneP$UnaryFunction extends UnaryFunction {
        public $hl_store_iterator_doneP$UnaryFunction() {
            super(extractFunctionNamed("HL-STORE-ITERATOR-DONE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_interface_infrastructure.hl_store_iterator_doneP(arg1);
        }
    }

    public static final class $hl_store_iterator_destroy$UnaryFunction extends UnaryFunction {
        public $hl_store_iterator_destroy$UnaryFunction() {
            super(extractFunctionNamed("HL-STORE-ITERATOR-DESTROY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_interface_infrastructure.hl_store_iterator_destroy(arg1);
        }
    }

    static private final SubLList $list_alt6 = list(list(makeSymbol("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*"), T));

    static private final SubLList $list_alt7 = list(list(makeSymbol("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*"), NIL));

    static private final SubLString $str_alt10$Remote_HL_Store_Connection_Pool_L = makeString("Remote HL Store Connection Pool Lock");

    static private final SubLString $str_alt11$Could_not_open_a_connection_to__s = makeString("Could not open a connection to ~s");

    static private final SubLList $list_alt14 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt17 = list(makeSymbol("DEFINE-HL-MODIFIER-PREAMBLE"));

    static private final SubLList $list_alt21 = list(makeSymbol("HL-MODIFY-ANYWHERE?"));

    static private final SubLList $list_alt23 = list(list(RET, NIL));

    static private final SubLList $list_alt25 = list(QUOTE, QUOTE);

    static private final SubLList $list_alt28 = list(makeSymbol("HL-MODIFY-REMOTE?"));

    static private final SubLList $list_alt31 = list(makeSymbol("HL-MODIFY-LOCAL?"));

    static private final SubLList $list_alt35 = list(makeSymbol("DEFINE-HL-MODIFIER"), makeSymbol("DEFINE-HL-CREATOR"));

    static private final SubLList $list_alt37 = list(makeSymbol("HL-ACCESS-REMOTE?"));

    static private final SubLList $list_alt38 = list(makeKeyword("IGNORE"), $WARN, makeKeyword("BREAK"));

    static private final SubLList $list_alt43 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt45 = list(makeSymbol("VALID-HL-STORE-ERROR-HANDLING-MODE-P"));

    static private final SubLList $list_alt48 = list(list(makeSymbol("*INFERENCE-DEBUG?*"), T));

    static private final SubLList $list_alt60 = list(makeSymbol("NEXT"), makeSymbol("VALID?"));

    static private final SubLList $list_alt65 = list(makeSymbol("BUFFER"), makeSymbol("ID"), makeSymbol("N"));

    static private final SubLString $str_alt71$Unable_to_open__S = makeString("Unable to open ~S");
}

/**
 * Total time: 298 ms
 */
