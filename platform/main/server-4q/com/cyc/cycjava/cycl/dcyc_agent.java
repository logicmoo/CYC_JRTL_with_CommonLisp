/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.time_has_arrivedP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
 *  module:      DCYC-AGENT
 *  source file: /cyc/top/cycl/dcyc-agent.lisp
 *  created:     2019/07/03 17:37:51
 */
public final class dcyc_agent extends SubLTranslatedFile implements V02 {
    // // Constructor
    private dcyc_agent() {
    }

    public static final SubLFile me = new dcyc_agent();


    // // Definitions
    /**
     * Image dependent agent counter
     */
    // defvar
    private static final SubLSymbol $maximum_agent_id$ = makeSymbol("*MAXIMUM-AGENT-ID*");

    // defparameter
    private static final SubLSymbol $agent_id_lock$ = makeSymbol("*AGENT-ID-LOCK*");

    public static final SubLObject get_next_image_agent_id() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $agent_id_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    ans = $maximum_agent_id$.getDynamicValue(thread);
                    $maximum_agent_id$.setDynamicValue(add($maximum_agent_id$.getDynamicValue(thread), ONE_INTEGER), thread);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return ans;
            }
        }
    }

    // defparameter
    public static final SubLSymbol $cyc_coordinator$ = makeSymbol("*CYC-COORDINATOR*");

    // defparameter
    public static final SubLSymbol $agent_timeout_seconds$ = makeSymbol("*AGENT-TIMEOUT-SECONDS*");

    // defparameter
    public static final SubLSymbol $agent_timeout_microseconds$ = makeSymbol("*AGENT-TIMEOUT-MICROSECONDS*");

    // defparameter
    public static final SubLSymbol $agent_request_timeout_seconds$ = makeSymbol("*AGENT-REQUEST-TIMEOUT-SECONDS*");

    // defparameter
    public static final SubLSymbol $agent_request_timeout_microseconds$ = makeSymbol("*AGENT-REQUEST-TIMEOUT-MICROSECONDS*");

    public static final class $cyc_agent_native extends SubLStructNative {
        @Override
	public SubLStructDecl getStructDecl() {
            return dcyc_agent.$cyc_agent_native.structDecl;
        }

        @Override
	public SubLObject getField2() {
            return $ccc;
        }

        @Override
	public SubLObject getField3() {
            return $peers;
        }

        @Override
	public SubLObject getField4() {
            return $buffer;
        }

        @Override
	public SubLObject getField5() {
            return $busystate;
        }

        @Override
	public SubLObject getField6() {
            return $busylock;
        }

        @Override
	public SubLObject getField7() {
            return $state;
        }

        @Override
	public SubLObject getField8() {
            return $statelock;
        }

        @Override
	public SubLObject setField2(SubLObject value) {
            return $ccc = value;
        }

        @Override
	public SubLObject setField3(SubLObject value) {
            return $peers = value;
        }

        @Override
	public SubLObject setField4(SubLObject value) {
            return $buffer = value;
        }

        @Override
	public SubLObject setField5(SubLObject value) {
            return $busystate = value;
        }

        @Override
	public SubLObject setField6(SubLObject value) {
            return $busylock = value;
        }

        @Override
	public SubLObject setField7(SubLObject value) {
            return $state = value;
        }

        @Override
	public SubLObject setField8(SubLObject value) {
            return $statelock = value;
        }

        public SubLObject $ccc = Lisp.NIL;

        public SubLObject $peers = Lisp.NIL;

        public SubLObject $buffer = Lisp.NIL;

        public SubLObject $busystate = Lisp.NIL;

        public SubLObject $busylock = Lisp.NIL;

        public SubLObject $state = Lisp.NIL;

        public SubLObject $statelock = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(dcyc_agent.$cyc_agent_native.class, CYC_AGENT, CYC_AGENT_P, $list_alt6, $list_alt7, new String[]{ "$ccc", "$peers", "$buffer", "$busystate", "$busylock", "$state", "$statelock" }, $list_alt8, $list_alt9, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_cyc_agent$ = makeSymbol("*DTP-CYC-AGENT*");

    public static final SubLObject cyc_agent_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cyc_agent_p(SubLObject v_object) {
        return v_object.getClass() == dcyc_agent.$cyc_agent_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $cyc_agent_p$UnaryFunction extends UnaryFunction {
        public $cyc_agent_p$UnaryFunction() {
            super(extractFunctionNamed("CYC-AGENT-P"));
        }

        @Override
	public SubLObject processItem(SubLObject arg1) {
            return cyc_agent_p(arg1);
        }
    }

    public static final SubLObject cyc_agent_ccc(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.getField2();
    }

    public static final SubLObject cyc_agent_peers(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.getField3();
    }

    public static final SubLObject cyc_agent_buffer(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.getField4();
    }

    public static final SubLObject cyc_agent_busystate(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.getField5();
    }

    public static final SubLObject cyc_agent_busylock(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.getField6();
    }

    public static final SubLObject cyc_agent_state(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.getField7();
    }

    public static final SubLObject cyc_agent_statelock(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.getField8();
    }

    public static final SubLObject _csetf_cyc_agent_ccc(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_cyc_agent_peers(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_cyc_agent_buffer(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_cyc_agent_busystate(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_cyc_agent_busylock(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_cyc_agent_state(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_cyc_agent_statelock(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_AGENT_P);
        return v_object.setField8(value);
    }

    public static final SubLObject make_cyc_agent(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new dcyc_agent.$cyc_agent_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CCC)) {
                        _csetf_cyc_agent_ccc(v_new, current_value);
                    } else
                        if (pcase_var.eql($PEERS)) {
                            _csetf_cyc_agent_peers(v_new, current_value);
                        } else
                            if (pcase_var.eql($BUFFER)) {
                                _csetf_cyc_agent_buffer(v_new, current_value);
                            } else
                                if (pcase_var.eql($BUSYSTATE)) {
                                    _csetf_cyc_agent_busystate(v_new, current_value);
                                } else
                                    if (pcase_var.eql($BUSYLOCK)) {
                                        _csetf_cyc_agent_busylock(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($STATE)) {
                                            _csetf_cyc_agent_state(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($STATELOCK)) {
                                                _csetf_cyc_agent_statelock(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt33$Invalid_slot__S_for_construction_, current_arg);
                                            }






                }
            }
            return v_new;
        }
    }

    // defparameter
    private static final SubLSymbol $agent_states$ = makeSymbol("AGENT-STATES");

    /**
     *
     *
     * @return state; where state is the state slot of AGENT and a member of agent-states
     */
    public static final SubLObject get_agent_state(SubLObject agent) {
        {
            SubLObject ans = NIL;
            SubLObject lock = cyc_agent_statelock(agent);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ans = cyc_agent_state(agent);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return ans;
        }
    }

    /**
     * Sets the state of AGENT to that specified in VALUE.
     * VALUE must be a valid agent-state @see agent-states
     *
     * @return boolean; t iff VALUE is valid
     */
    public static final SubLObject set_agent_state(SubLObject agent, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.memberP(value, $agent_states$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject lock = cyc_agent_statelock(agent);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        _csetf_cyc_agent_state(agent, value);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                return T;
            }
            return NIL;
        }
    }

    /**
     * Creates a new agent - spawns a task running agent-cycle.
     *
     * @return multiple values;
    1 - task; a pointer to the task that is running agent-cycle
    2 - agent; the newly created agent structure
     */
    public static final SubLObject create_agent(SubLObject coordinator) {
        if (coordinator == UNPROVIDED) {
            coordinator = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject agent = make_cyc_agent(UNPROVIDED);
                SubLObject agent_id = get_next_image_agent_id();
                SubLObject ccc = dcyc_kernel.ccc_constructor(Environment.get_machine_name(UNPROVIDED), cfasl_kernel.cfasl_port(), agent_id);
                SubLObject request = NIL;
                _csetf_cyc_agent_ccc(agent, ccc);
                _csetf_cyc_agent_peers(agent, make_hash_table($int$64, symbol_function(CCC_EQUAL), UNPROVIDED));
                _csetf_cyc_agent_buffer(agent, dcyc_kernel.add_agent_cco_buffer());
                _csetf_cyc_agent_busystate(agent, NIL);
                _csetf_cyc_agent_busylock(agent, make_lock($$$Agent_Busy_Lock));
                if (NIL != coordinator) {
                    _csetf_cyc_agent_state(agent, $COORDINATOR);
                } else {
                    _csetf_cyc_agent_state(agent, $DEFAULT);
                }
                _csetf_cyc_agent_statelock(agent, make_lock($$$Agent_State_Lock));
                {
                    SubLObject _prev_bind_0 = dcyc_kernel.$agent_id$.currentBinding(thread);
                    try {
                        dcyc_kernel.$agent_id$.bind(agent_id, thread);
                        request = process_utilities.new_task($$$Spawning_Agent, symbol_function(AGENT_CYCLE), list(agent), UNPROVIDED);
                        if (NIL == coordinator) {
                            coordinator_register();
                        }
                    } finally {
                        dcyc_kernel.$agent_id$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(request, agent);
            }
        }
    }

    /**
     *
     *
     * @return 0 t; iff agent has been assigned work and has not finished
     * @return 1 nil; iff agent has not been assigned work
     * @unknown - return 1 means that the caller will be assigning work
     * @return 2 response; the command that the agent has been assigned but has not
    received.
     */
    public static final SubLObject amibusyP(SubLObject agent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject coordinator_result = NIL;
                SubLObject ans = NIL;
                SubLObject lock = cyc_agent_busylock(agent);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != cyc_agent_busystate(agent)) {
                        if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt43$Agent_knows_he_is_busy___);
                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                        }
                        ans = T;
                    } else {
                        dcyc_kernel.cco_send(list($QUERY, $$$amibusy), $cyc_coordinator$.getDynamicValue(thread));
                        coordinator_result = dcyc_kernel.cco_data(dcyc_kernel.cco_recv(cyc_agent_buffer(agent)));
                        {
                            SubLObject pcase_var = coordinator_result.first();
                            if (pcase_var.eql($RESPONSE)) {
                                if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt47$Agent_knows_that_it_is_busy___);
                                    force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                }
                                ans = coordinator_result;
                            } else
                                if (pcase_var.eql($QUERY)) {
                                    if (NIL != cadr(coordinator_result)) {
                                        if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt48$Coordinator_knows_agent_is_busy__);
                                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                        }
                                        ans = T;
                                    } else {
                                        if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt49$Coordinator_says_agent_is_not_bus);
                                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                        }
                                        _csetf_cyc_agent_busystate(agent, T);
                                        ans = NIL;
                                    }
                                }

                        }
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

    /**
     * Returns an object read from AGENTs buffer.  VALID-TAGS can be a list
     * of acceptable object tags - if the read object doesn't satisfy them it
     * is removed and continues until a valid object is read.
     *
     * @return 0 multiple-values;
    1 - data contained in the object read from AGENTs buffer
    2 - sender of object read from AGENTs buffer
     * @return 1 nil; iff timeout has occurred
     */
    public static final SubLObject receive_agent_data(SubLObject agent, SubLObject valid_tags) {
        if (valid_tags == UNPROVIDED) {
            valid_tags = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt50$In_receive_agent_data___Valid_Tag, valid_tags);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            {
                SubLObject object_vector = make_vector(ONE_INTEGER, UNPROVIDED);
                SubLObject data_task = dcyc_kernel.cco_irecv(object_vector, cyc_agent_buffer(agent), UNPROVIDED);
                SubLObject timeout = numeric_date_utilities.time_from_now($agent_timeout_seconds$.getDynamicValue(thread));
                SubLObject valid_data = NIL;
                while (!((NIL != valid_data) || (NIL != time_has_arrivedP(timeout)))) {
                    if (NIL != process_utilities.task_completed(data_task)) {
                        if ((NIL != valid_tags) && (NIL != member(dcyc_kernel.cco_data(aref(object_vector, ZERO_INTEGER)).first(), valid_tags, UNPROVIDED, UNPROVIDED))) {
                            valid_data = T;
                        } else {
                            data_task = dcyc_kernel.cco_irecv(object_vector, cyc_agent_buffer(agent), UNPROVIDED);
                        }
                    } else {
                        sleep(TWO_INTEGER);
                    }
                } 
                if (NIL != valid_data) {
                    if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt51$Got_valid_data_back__data___sende, dcyc_kernel.cco_data(aref(object_vector, ZERO_INTEGER)), dcyc_kernel.cco_sender(aref(object_vector, ZERO_INTEGER)));
                        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                    }
                    return values(dcyc_kernel.cco_data(aref(object_vector, ZERO_INTEGER)), dcyc_kernel.cco_sender(aref(object_vector, ZERO_INTEGER)));
                }
                if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt52$Timeout_in_receive_agent_data__);
                    force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                }
                kill_process(process_utilities.task_process(data_task));
            }
            return NIL;
        }
    }

    /**
     * The default cycle that an agent enters when it is created.
     *
     * @return t
     */
    public static final SubLObject agent_cycle(SubLObject agent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            while (cyc_agent_peers(agent).isHashtable()) {
                {
                    SubLObject request = NIL;
                    {
                        SubLObject _prev_bind_0 = dcyc_kernel.$agent_id$.currentBinding(thread);
                        try {
                            dcyc_kernel.$agent_id$.bind(dcyc_kernel.ccc_id(cyc_agent_ccc(agent)), thread);
                            if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt53$Agent_Id___State____a____a__, dcyc_kernel.agent_id(), get_agent_state(agent));
                                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                            }
                            {
                                SubLObject pcase_var = get_agent_state(agent);
                                if (pcase_var.eql($DEFAULT)) {
                                    request = receive_agent_data(agent, $list_alt54);
                                    {
                                        SubLObject data = cadr(request);
                                        SubLObject pcase_var_1 = request.first();
                                        if (pcase_var_1.eql($RESPONSE)) {
                                            if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt55$Recv__response__);
                                                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                            }
                                            agent_response(agent, data);
                                        } else
                                            if (pcase_var_1.eql($BROADCAST)) {
                                                if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt57$Recv__broadcast__);
                                                    force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                }
                                                {
                                                    SubLObject timed_out = NIL;
                                                    SubLObject busy = amibusyP(agent);
                                                    if (NIL == busy) {
                                                        timed_out = agent_broadcast(agent, nth(ZERO_INTEGER, data), nth(ONE_INTEGER, data), nth(TWO_INTEGER, data), nth(THREE_INTEGER, data), nth(FOUR_INTEGER, data));
                                                        {
                                                            SubLObject lock = cyc_agent_busylock(agent);
                                                            SubLObject release = NIL;
                                                            try {
                                                                release = seize_lock(lock);
                                                                _csetf_cyc_agent_busystate(agent, NIL);
                                                            } finally {
                                                                if (NIL != release) {
                                                                    release_lock(lock);
                                                                }
                                                            }
                                                        }
                                                        if (timed_out == dcyc_kernel.$dcyc_timeout$.getDynamicValue(thread)) {
                                                            dcyc_kernel.cco_send(list($RESET, $str_alt59$Timed_Out___Reset_Me), $cyc_coordinator$.getDynamicValue(thread));
                                                        } else {
                                                            dcyc_kernel.cco_send(list($RESET, $str_alt60$Finished___Reset_Me), $cyc_coordinator$.getDynamicValue(thread));
                                                        }
                                                    }
                                                    if (NIL == timed_out) {
                                                        if (busy == T) {
                                                            agent_response(agent, busy);
                                                        }
                                                    }
                                                }
                                            } else
                                                if (pcase_var_1.eql($SCATTER)) {
                                                    if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt62$Recv__scatter__);
                                                        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                    }
                                                    {
                                                        SubLObject timed_out = NIL;
                                                        SubLObject busy = amibusyP(agent);
                                                        if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt63$Busy____a__, busy);
                                                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                        }
                                                        if (NIL == busy) {
                                                            timed_out = agent_scatter(agent, nth(ZERO_INTEGER, data), nth(ONE_INTEGER, data), nth(TWO_INTEGER, data), nth(THREE_INTEGER, data));
                                                            {
                                                                SubLObject lock = cyc_agent_busylock(agent);
                                                                SubLObject release = NIL;
                                                                try {
                                                                    release = seize_lock(lock);
                                                                    _csetf_cyc_agent_busystate(agent, NIL);
                                                                } finally {
                                                                    if (NIL != release) {
                                                                        release_lock(lock);
                                                                    }
                                                                }
                                                            }
                                                            if (timed_out == dcyc_kernel.$dcyc_timeout$.getDynamicValue(thread)) {
                                                                dcyc_kernel.cco_send(list($RESET, $str_alt59$Timed_Out___Reset_Me), $cyc_coordinator$.getDynamicValue(thread));
                                                            } else {
                                                                dcyc_kernel.cco_send(list($RESET, $str_alt60$Finished___Reset_Me), $cyc_coordinator$.getDynamicValue(thread));
                                                            }
                                                        }
                                                        if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt64$Timed_Out____a__, timed_out);
                                                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                        }
                                                        if (NIL == timed_out) {
                                                            if (busy == T) {
                                                                agent_response(agent, busy);
                                                            }
                                                        }
                                                    }
                                                } else
                                                    if (pcase_var_1.eql($STOP)) {
                                                        if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt66$Stop__);
                                                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                        }
                                                        dcyc_kernel.cco_isend(list($REMOVE, $$$Stop_Me), $cyc_coordinator$.getDynamicValue(thread));
                                                        _csetf_cyc_agent_peers(agent, NIL);
                                                    }



                                    }
                                } else
                                    if (pcase_var.eql($EXECUTE)) {
                                        {
                                            SubLObject request_2 = NIL;
                                            SubLObject sender = NIL;
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject x = receive_agent_data(agent, $list_alt70);
                                                SubLObject y = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                request_2 = x;
                                                sender = y;
                                            }
                                            if (NIL != request_2) {
                                                dcyc_kernel.cco_send(agent_execute(cadr(request_2)), sender);
                                            }
                                            dcyc_kernel.cco_send(list($RESET, $str_alt71$Reset_Me___I_m_Done), $cyc_coordinator$.getDynamicValue(thread));
                                            set_agent_state(agent, $DEFAULT);
                                        }
                                    } else
                                        if (pcase_var.eql($COORDINATOR)) {
                                            {
                                                SubLObject data = NIL;
                                                SubLObject sender = NIL;
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject x = receive_agent_data(agent, $list_alt72);
                                                    SubLObject y = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    data = x;
                                                    sender = y;
                                                }
                                                if (NIL != data) {
                                                    {
                                                        SubLObject pcase_var_3 = data.first();
                                                        if (pcase_var_3.eql($PEER_REQUEST)) {
                                                            if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                                                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt74$Recv__peer_request__);
                                                                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                            }
                                                            coordinator_request(cadr(data), agent, sender);
                                                        } else
                                                            if (pcase_var_3.eql($REGISTER)) {
                                                                if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                                                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt76$Recv__register__);
                                                                    force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                                }
                                                                agent_register(sender, agent);
                                                            } else
                                                                if (pcase_var_3.eql($QUERY)) {
                                                                    if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                                                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt77$Recv__query__);
                                                                        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                                    }
                                                                    {
                                                                        SubLObject busy = ($BUSY.eql(gethash(sender, cyc_agent_peers(agent), UNPROVIDED))) ? ((SubLObject) (T)) : NIL;
                                                                        dcyc_kernel.cco_send(list($QUERY, busy), sender);
                                                                    }
                                                                } else
                                                                    if (pcase_var_3.eql($RESET)) {
                                                                        if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                                                                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt79$Recv__reset__);
                                                                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                                                        }
                                                                        sethash(sender, cyc_agent_peers(agent), T);
                                                                    } else
                                                                        if (pcase_var_3.eql($REMOVE)) {
                                                                            remhash(sender, cyc_agent_peers(agent));
                                                                        }




                                                    }
                                                }
                                            }
                                        }


                            }
                        } finally {
                            dcyc_kernel.$agent_id$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            } 
            return T;
        }
    }

    /**
     * The calling agent registers with *cyc-coordinator*.
     *
     * @return boolean; t iff message sent.
     */
    public static final SubLObject coordinator_register() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dcyc_kernel.cco_send(list($REGISTER, $$$Register), $cyc_coordinator$.getDynamicValue(thread));
        }
    }

    /**
     * Agent that receives COMMAND will execute it using eval.
     *
     * @return (eval COMMAND);
     */
    public static final SubLObject agent_execute(SubLObject command) {
        return eval(command);
    }

    /**
     * Stores the CCC in AGENT peer hashtable.
     *
     * @return t;
     */
    public static final SubLObject agent_register(SubLObject ccc, SubLObject agent) {
        sethash(ccc, cyc_agent_peers(agent), T);
        return T;
    }

    /**
     * SENDER needs NUM-PEERS agents to work on a job.
     * COORDINATOR checks its peer list for available agents.
     * If there are enough free agents COORDINATOR sends :response
     * messages to the free agents.
     *
     * @return t;
     */
    public static final SubLObject coordinator_request(SubLObject num_peers, SubLObject coordinator, SubLObject sender) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject counter = ZERO_INTEGER;
                SubLObject done = NIL;
                SubLObject ccc_list = NIL;
                if (NIL == done) {
                    {
                        SubLObject catch_var = NIL;
                        try {
                            {
                                SubLObject cdohash_table = cyc_agent_peers(coordinator);
                                SubLObject ccc = NIL;
                                SubLObject working = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            ccc = getEntryKey(cdohash_entry);
                                            working = getEntryValue(cdohash_entry);
                                            subl_macros.do_hash_table_done_check(done);
                                            if (NIL == dcyc_kernel.ccc_equal(sender, ccc)) {
                                                if (working == T) {
                                                    sethash(ccc, cyc_agent_peers(coordinator), $BUSY);
                                                    ccc_list = cons(ccc, ccc_list);
                                                    counter = add(ONE_INTEGER, counter);
                                                }
                                            }
                                            if (num_peers.numE(counter)) {
                                                done = T;
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                        }
                    }
                }
                if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt82$Here_we_are_with_the_ccc_list____, new SubLObject[]{ length(ccc_list), dcyc_kernel.ccc_machine(ccc_list.first()), dcyc_kernel.ccc_port(ccc_list.first()), dcyc_kernel.ccc_id(ccc_list.first()) });
                    force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                }
                if (num_peers.numE(length(ccc_list))) {
                    {
                        SubLObject cdolist_list_var = ccc_list;
                        SubLObject ccc = NIL;
                        for (ccc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ccc = cdolist_list_var.first()) {
                            dcyc_kernel.cco_isend(list($RESPONSE, sender), ccc);
                        }
                    }
                }
                return T;
            }
        }
    }

    /**
     * An agent at CCC has requested AGENT to do some work.
     * AGENT needs to register with the agent at CCC and await orders.
     *
     * @return t
     */
    public static final SubLObject agent_response(SubLObject agent, SubLObject ccc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != dcyc_kernel.$dcyc_debug$.getDynamicValue(thread)) {
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt83$In_agent_response__);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            dcyc_kernel.cco_send(list($REGISTER, cyc_agent_ccc(agent)), ccc);
            set_agent_state(agent, $EXECUTE);
            return T;
        }
    }

    /**
     * The specified AGENT will send COMMAND to N agents.
     * COLLATE must take a vector and a result as arguments.
     * AGENT calls (funcall COLLATE result-vector STORE-NAME)
     * FINISH-NAME refers to a task that is used to determine when the entire
     * job, rather than any single process, has finished.
     *
     * @unknown - remember to (find-symbol STORE-NAME)
     * @return t
     */
    public static final SubLObject agent_broadcast(SubLObject agent, SubLObject command, SubLObject n, SubLObject collate, SubLObject store_name, SubLObject finish_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_vector = make_vector(n, UNPROVIDED);
                SubLObject timeout = NIL;
                SubLObject request_vector = NIL;
                dcyc_kernel.cco_send(list($PEER_REQUEST, n), $cyc_coordinator$.getDynamicValue(thread));
                request_vector = dcyc_kernel.cco_gather(object_vector, cyc_agent_buffer(agent));
                timeout = dcyc_kernel.cco_waitall(request_vector, $agent_request_timeout_microseconds$.getDynamicValue(thread));
                if (NIL == timeout) {
                    process_utilities._csetf_task_completed(eval(find_symbol(finish_name, UNPROVIDED)), $TIMEOUT);
                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt85$Danger___Encountered_a_timeout_wa);
                    return dcyc_kernel.$dcyc_timeout$.getDynamicValue(thread);
                }
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt86$We_have_received_all_request_vect);
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt87$OV____a__, dcyc_kernel.cco_vector_data(object_vector, symbol_function(SECOND)));
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                object_vector = dcyc_kernel.cco_vector_data(object_vector, symbol_function(SECOND));
                request_vector = dcyc_kernel.cco_broadcast(list($EXECUTE, command), object_vector);
                timeout = dcyc_kernel.cco_waitall(request_vector, $agent_timeout_microseconds$.getDynamicValue(thread));
                if (NIL == timeout) {
                    process_utilities._csetf_task_completed(eval(find_symbol(finish_name, UNPROVIDED)), $TIMEOUT);
                    return dcyc_kernel.$dcyc_timeout$.getDynamicValue(thread);
                }
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt89$We_now_have_broadcasted_everythin);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                request_vector = dcyc_kernel.cco_gather(object_vector, cyc_agent_buffer(agent));
                timeout = dcyc_kernel.cco_waitall(request_vector, UNPROVIDED);
                if (NIL == timeout) {
                    process_utilities._csetf_task_completed(eval(find_symbol(finish_name, UNPROVIDED)), $TIMEOUT);
                    return dcyc_kernel.$dcyc_timeout$.getDynamicValue(thread);
                }
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt90$All_the_machines_have_returned_wi);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                object_vector = dcyc_kernel.cco_vector_data(object_vector, UNPROVIDED);
                funcall(collate, object_vector, store_name);
                process_utilities._csetf_task_completed(eval(find_symbol(finish_name, UNPROVIDED)), T);
            }
            return T;
        }
    }

    /**
     * The specified AGENT will send COMMAND-LIST to (length COMMAND-LIST) agents.
     * COLLATE must take a vector and a result as arguments.
     * AGENT calls (funcall COLLATE result-vector STORE-NAME)
     * FINISH-NAME refers to a task that is used to determine when the entire
     * job, rather than any single process, has finished.
     *
     * @unknown - remember to (find-symbol STORE-NAME)
     * @return t
     */
    public static final SubLObject agent_scatter(SubLObject agent, SubLObject command_list, SubLObject collate, SubLObject store_name, SubLObject finish_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject n = length(command_list);
                SubLObject object_vector = make_vector(n, UNPROVIDED);
                SubLObject timeout = NIL;
                SubLObject request_vector = NIL;
                dcyc_kernel.cco_send(list($PEER_REQUEST, n), $cyc_coordinator$.getDynamicValue(thread));
                request_vector = dcyc_kernel.cco_gather(object_vector, cyc_agent_buffer(agent));
                timeout = dcyc_kernel.cco_waitall(request_vector, $agent_request_timeout_microseconds$.getDynamicValue(thread));
                if (NIL == timeout) {
                    process_utilities._csetf_task_completed(eval(find_symbol(finish_name, UNPROVIDED)), $TIMEOUT);
                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt85$Danger___Encountered_a_timeout_wa);
                    return dcyc_kernel.$dcyc_timeout$.getDynamicValue(thread);
                }
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt86$We_have_received_all_request_vect);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                object_vector = dcyc_kernel.cco_vector_data(object_vector, symbol_function(CADR));
                {
                    SubLObject execute_vector = make_vector(n, UNPROVIDED);
                    SubLObject counter = ZERO_INTEGER;
                    SubLObject cdolist_list_var = command_list;
                    SubLObject command = NIL;
                    for (command = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , command = cdolist_list_var.first()) {
                        set_aref(execute_vector, counter, list($EXECUTE, command));
                        counter = add(counter, ONE_INTEGER);
                    }
                    request_vector = dcyc_kernel.cco_scatter(execute_vector, object_vector);
                }
                timeout = dcyc_kernel.cco_waitall(request_vector, $agent_timeout_microseconds$.getDynamicValue(thread));
                if (NIL == timeout) {
                    process_utilities._csetf_task_completed(eval(find_symbol(finish_name, UNPROVIDED)), $TIMEOUT);
                    return dcyc_kernel.$dcyc_timeout$.getDynamicValue(thread);
                }
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt89$We_now_have_broadcasted_everythin);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                request_vector = dcyc_kernel.cco_gather(object_vector, cyc_agent_buffer(agent));
                timeout = dcyc_kernel.cco_waitall(request_vector, $agent_timeout_microseconds$.getDynamicValue(thread));
                if (NIL == timeout) {
                    process_utilities._csetf_task_completed(eval(find_symbol(finish_name, UNPROVIDED)), $TIMEOUT);
                    return dcyc_kernel.$dcyc_timeout$.getDynamicValue(thread);
                }
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt90$All_the_machines_have_returned_wi);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                object_vector = dcyc_kernel.cco_vector_data(object_vector, UNPROVIDED);
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt92$Object_Vector____a__, object_vector);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                funcall(collate, object_vector, store_name);
                process_utilities._csetf_task_completed(eval(find_symbol(finish_name, UNPROVIDED)), T);
            }
            return T;
        }
    }

    /**
     * Instruct AGENT to broadcast COMMAND to N agents.
     * Use the function COLLATE (which must take a vector and a place to store results as args).
     * RESULT is the place to store the return of COLLATE.
     * FINISHED is a task structure that is used to determine when all commands,
     * including collation have finished.
     *
     * @return task; the task that sends a :broadcast message to AGENT
     */
    public static final SubLObject agent_programmer_broadcast(SubLObject agent, SubLObject command, SubLObject n, SubLObject collate, SubLObject result, SubLObject finished) {
        {
            SubLObject store_name = symbol_name(result);
            SubLObject finish_name = symbol_name(finished);
            return dcyc_kernel.cco_isend(list($BROADCAST, list(command, n, collate, store_name, finish_name)), cyc_agent_ccc(agent));
        }
    }

    /**
     * Instruct AGENT to scatter COMMAND-LIST to (length COMMAND-LIST) agents.
     * Use the function COLLATE (which must take a vector and a place to store results as args).
     * RESULT is the place to store the return of COLLATE.
     * FINISHED is a task structure that is used to determine when all commands,
     * including collation have finished.
     *
     * @return task; the task that sends a :scatter message to AGENT
     */
    public static final SubLObject agent_programmer_scatter(SubLObject agent, SubLObject command_list, SubLObject collate, SubLObject result, SubLObject finished) {
        {
            SubLObject store_name = symbol_name(result);
            SubLObject finish_name = symbol_name(finished);
            return dcyc_kernel.cco_isend(list($SCATTER, list(command_list, collate, store_name, finish_name)), cyc_agent_ccc(agent));
        }
    }

    /**
     * The default collation method assumes OBJECT-VECTOR and the variable referenced by
     * STORE-NAME are both vectors of the same cardinality.
     *
     * @return boolean; t iff OBJECT-VECTOR successfully copied into vector referred to by STORE-NAME
     */
    public static final SubLObject default_collate(SubLObject object_vector, SubLObject store_name) {
        if (object_vector.isVector() && eval(find_symbol(store_name, UNPROVIDED)).isVector()) {
            {
                SubLObject cdotimes_end_var = length(object_vector);
                SubLObject idx = NIL;
                for (idx = ZERO_INTEGER; idx.numL(cdotimes_end_var); idx = add(idx, ONE_INTEGER)) {
                    set_aref(eval(find_symbol(store_name, UNPROVIDED)), idx, aref(object_vector, idx));
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Sends a :stop message to HOST on PORT to agent ID.
     *
     * @return t
     */
    public static final SubLObject stop_agent(SubLObject host, SubLObject port, SubLObject id) {
        if (id == UNPROVIDED) {
            id = ZERO_INTEGER;
        }
        dcyc_kernel.cco_send($list_alt93, dcyc_kernel.ccc_constructor(host, port, id));
        return T;
    }

    public static final SubLObject declare_dcyc_agent_file() {
        declareFunction("get_next_image_agent_id", "GET-NEXT-IMAGE-AGENT-ID", 0, 0, false);
        declareFunction("cyc_agent_print_function_trampoline", "CYC-AGENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cyc_agent_p", "CYC-AGENT-P", 1, 0, false);
        new dcyc_agent.$cyc_agent_p$UnaryFunction();
        declareFunction("cyc_agent_ccc", "CYC-AGENT-CCC", 1, 0, false);
        declareFunction("cyc_agent_peers", "CYC-AGENT-PEERS", 1, 0, false);
        declareFunction("cyc_agent_buffer", "CYC-AGENT-BUFFER", 1, 0, false);
        declareFunction("cyc_agent_busystate", "CYC-AGENT-BUSYSTATE", 1, 0, false);
        declareFunction("cyc_agent_busylock", "CYC-AGENT-BUSYLOCK", 1, 0, false);
        declareFunction("cyc_agent_state", "CYC-AGENT-STATE", 1, 0, false);
        declareFunction("cyc_agent_statelock", "CYC-AGENT-STATELOCK", 1, 0, false);
        declareFunction("_csetf_cyc_agent_ccc", "_CSETF-CYC-AGENT-CCC", 2, 0, false);
        declareFunction("_csetf_cyc_agent_peers", "_CSETF-CYC-AGENT-PEERS", 2, 0, false);
        declareFunction("_csetf_cyc_agent_buffer", "_CSETF-CYC-AGENT-BUFFER", 2, 0, false);
        declareFunction("_csetf_cyc_agent_busystate", "_CSETF-CYC-AGENT-BUSYSTATE", 2, 0, false);
        declareFunction("_csetf_cyc_agent_busylock", "_CSETF-CYC-AGENT-BUSYLOCK", 2, 0, false);
        declareFunction("_csetf_cyc_agent_state", "_CSETF-CYC-AGENT-STATE", 2, 0, false);
        declareFunction("_csetf_cyc_agent_statelock", "_CSETF-CYC-AGENT-STATELOCK", 2, 0, false);
        declareFunction("make_cyc_agent", "MAKE-CYC-AGENT", 0, 1, false);
        declareFunction("get_agent_state", "GET-AGENT-STATE", 1, 0, false);
        declareFunction("set_agent_state", "SET-AGENT-STATE", 2, 0, false);
        declareFunction("create_agent", "CREATE-AGENT", 0, 1, false);
        declareFunction("amibusyP", "AMIBUSY?", 1, 0, false);
        declareFunction("receive_agent_data", "RECEIVE-AGENT-DATA", 1, 1, false);
        declareFunction("agent_cycle", "AGENT-CYCLE", 1, 0, false);
        declareFunction("coordinator_register", "COORDINATOR-REGISTER", 0, 0, false);
        declareFunction("agent_execute", "AGENT-EXECUTE", 1, 0, false);
        declareFunction("agent_register", "AGENT-REGISTER", 2, 0, false);
        declareFunction("coordinator_request", "COORDINATOR-REQUEST", 3, 0, false);
        declareFunction("agent_response", "AGENT-RESPONSE", 2, 0, false);
        declareFunction("agent_broadcast", "AGENT-BROADCAST", 6, 0, false);
        declareFunction("agent_scatter", "AGENT-SCATTER", 5, 0, false);
        declareFunction("agent_programmer_broadcast", "AGENT-PROGRAMMER-BROADCAST", 6, 0, false);
        declareFunction("agent_programmer_scatter", "AGENT-PROGRAMMER-SCATTER", 5, 0, false);
        declareFunction("default_collate", "DEFAULT-COLLATE", 2, 0, false);
        declareFunction("stop_agent", "STOP-AGENT", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_dcyc_agent_file() {
        defvar("*MAXIMUM-AGENT-ID*", ZERO_INTEGER);
        defparameter("*AGENT-ID-LOCK*", make_lock($$$Agent_Id_Lock));
        defparameter("*CYC-COORDINATOR*", dcyc_kernel.ccc_constructor($str_alt1$leakey_cyc_com, $int$3614, ZERO_INTEGER));
        defparameter("*AGENT-TIMEOUT-SECONDS*", $int$24000);
        defparameter("*AGENT-TIMEOUT-MICROSECONDS*", multiply($agent_timeout_seconds$.getDynamicValue(), expt(TEN_INTEGER, SIX_INTEGER)));
        defparameter("*AGENT-REQUEST-TIMEOUT-SECONDS*", TWENTY_INTEGER);
        defparameter("*AGENT-REQUEST-TIMEOUT-MICROSECONDS*", multiply($agent_request_timeout_seconds$.getDynamicValue(), expt(TEN_INTEGER, SIX_INTEGER)));
        defconstant("*DTP-CYC-AGENT*", CYC_AGENT);
        defparameter("AGENT-STATES", $list_alt34);
        return NIL;
    }

    public static final SubLObject setup_dcyc_agent_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_cyc_agent$.getGlobalValue(), symbol_function(CYC_AGENT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CYC_AGENT_CCC, _CSETF_CYC_AGENT_CCC);
        def_csetf(CYC_AGENT_PEERS, _CSETF_CYC_AGENT_PEERS);
        def_csetf(CYC_AGENT_BUFFER, _CSETF_CYC_AGENT_BUFFER);
        def_csetf(CYC_AGENT_BUSYSTATE, _CSETF_CYC_AGENT_BUSYSTATE);
        def_csetf(CYC_AGENT_BUSYLOCK, _CSETF_CYC_AGENT_BUSYLOCK);
        def_csetf(CYC_AGENT_STATE, _CSETF_CYC_AGENT_STATE);
        def_csetf(CYC_AGENT_STATELOCK, _CSETF_CYC_AGENT_STATELOCK);
        identity(CYC_AGENT);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$Agent_Id_Lock = makeString("Agent Id Lock");

    static private final SubLString $str_alt1$leakey_cyc_com = makeString("leakey.cyc.com");

    public static final SubLInteger $int$3614 = makeInteger(3614);

    public static final SubLInteger $int$24000 = makeInteger(24000);

    private static final SubLSymbol CYC_AGENT = makeSymbol("CYC-AGENT");

    private static final SubLSymbol CYC_AGENT_P = makeSymbol("CYC-AGENT-P");

    static private final SubLList $list_alt6 = list(makeSymbol("CCC"), makeSymbol("PEERS"), makeSymbol("BUFFER"), makeSymbol("BUSYSTATE"), makeSymbol("BUSYLOCK"), makeSymbol("STATE"), makeSymbol("STATELOCK"));

    static private final SubLList $list_alt7 = list(makeKeyword("CCC"), makeKeyword("PEERS"), makeKeyword("BUFFER"), makeKeyword("BUSYSTATE"), makeKeyword("BUSYLOCK"), makeKeyword("STATE"), makeKeyword("STATELOCK"));

    static private final SubLList $list_alt8 = list(makeSymbol("CYC-AGENT-CCC"), makeSymbol("CYC-AGENT-PEERS"), makeSymbol("CYC-AGENT-BUFFER"), makeSymbol("CYC-AGENT-BUSYSTATE"), makeSymbol("CYC-AGENT-BUSYLOCK"), makeSymbol("CYC-AGENT-STATE"), makeSymbol("CYC-AGENT-STATELOCK"));

    static private final SubLList $list_alt9 = list(makeSymbol("_CSETF-CYC-AGENT-CCC"), makeSymbol("_CSETF-CYC-AGENT-PEERS"), makeSymbol("_CSETF-CYC-AGENT-BUFFER"), makeSymbol("_CSETF-CYC-AGENT-BUSYSTATE"), makeSymbol("_CSETF-CYC-AGENT-BUSYLOCK"), makeSymbol("_CSETF-CYC-AGENT-STATE"), makeSymbol("_CSETF-CYC-AGENT-STATELOCK"));



    private static final SubLSymbol CYC_AGENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYC-AGENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol CYC_AGENT_CCC = makeSymbol("CYC-AGENT-CCC");

    public static final SubLSymbol _CSETF_CYC_AGENT_CCC = makeSymbol("_CSETF-CYC-AGENT-CCC");

    private static final SubLSymbol CYC_AGENT_PEERS = makeSymbol("CYC-AGENT-PEERS");

    public static final SubLSymbol _CSETF_CYC_AGENT_PEERS = makeSymbol("_CSETF-CYC-AGENT-PEERS");

    private static final SubLSymbol CYC_AGENT_BUFFER = makeSymbol("CYC-AGENT-BUFFER");

    public static final SubLSymbol _CSETF_CYC_AGENT_BUFFER = makeSymbol("_CSETF-CYC-AGENT-BUFFER");

    private static final SubLSymbol CYC_AGENT_BUSYSTATE = makeSymbol("CYC-AGENT-BUSYSTATE");

    public static final SubLSymbol _CSETF_CYC_AGENT_BUSYSTATE = makeSymbol("_CSETF-CYC-AGENT-BUSYSTATE");

    private static final SubLSymbol CYC_AGENT_BUSYLOCK = makeSymbol("CYC-AGENT-BUSYLOCK");

    public static final SubLSymbol _CSETF_CYC_AGENT_BUSYLOCK = makeSymbol("_CSETF-CYC-AGENT-BUSYLOCK");

    private static final SubLSymbol CYC_AGENT_STATE = makeSymbol("CYC-AGENT-STATE");

    public static final SubLSymbol _CSETF_CYC_AGENT_STATE = makeSymbol("_CSETF-CYC-AGENT-STATE");

    private static final SubLSymbol CYC_AGENT_STATELOCK = makeSymbol("CYC-AGENT-STATELOCK");

    public static final SubLSymbol _CSETF_CYC_AGENT_STATELOCK = makeSymbol("_CSETF-CYC-AGENT-STATELOCK");

    private static final SubLSymbol $CCC = makeKeyword("CCC");

    private static final SubLSymbol $PEERS = makeKeyword("PEERS");



    private static final SubLSymbol $BUSYSTATE = makeKeyword("BUSYSTATE");

    private static final SubLSymbol $BUSYLOCK = makeKeyword("BUSYLOCK");



    private static final SubLSymbol $STATELOCK = makeKeyword("STATELOCK");

    static private final SubLString $str_alt33$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt34 = list(makeKeyword("DEFAULT"), makeKeyword("EXECUTE"), makeKeyword("COORDINATOR"));



    private static final SubLSymbol CCC_EQUAL = makeSymbol("CCC-EQUAL");

    static private final SubLString $$$Agent_Busy_Lock = makeString("Agent Busy Lock");

    private static final SubLSymbol $COORDINATOR = makeKeyword("COORDINATOR");



    static private final SubLString $$$Agent_State_Lock = makeString("Agent State Lock");

    static private final SubLString $$$Spawning_Agent = makeString("Spawning Agent");

    private static final SubLSymbol AGENT_CYCLE = makeSymbol("AGENT-CYCLE");

    static private final SubLString $str_alt43$Agent_knows_he_is_busy___ = makeString("Agent knows he is busy!~%");



    static private final SubLString $$$amibusy = makeString("amibusy");



    static private final SubLString $str_alt47$Agent_knows_that_it_is_busy___ = makeString("Agent knows that it is busy!~%");

    static private final SubLString $str_alt48$Coordinator_knows_agent_is_busy__ = makeString("Coordinator knows agent is busy!~%");

    static private final SubLString $str_alt49$Coordinator_says_agent_is_not_bus = makeString("Coordinator says agent is not busy!~%");

    static private final SubLString $str_alt50$In_receive_agent_data___Valid_Tag = makeString("In receive-agent-data~% Valid Tags = ~a~%");

    static private final SubLString $str_alt51$Got_valid_data_back__data___sende = makeString("Got valid data back <data> <sender>: ~a - ~a~%");

    static private final SubLString $str_alt52$Timeout_in_receive_agent_data__ = makeString("Timeout in receive-agent-data~%");

    static private final SubLString $str_alt53$Agent_Id___State____a____a__ = makeString("Agent Id : State = ~a : ~a~%");

    static private final SubLList $list_alt54 = list(makeKeyword("RESPONSE"), makeKeyword("BROADCAST"), makeKeyword("SCATTER"));

    static private final SubLString $str_alt55$Recv__response__ = makeString("Recv :response~%");

    private static final SubLSymbol $BROADCAST = makeKeyword("BROADCAST");

    static private final SubLString $str_alt57$Recv__broadcast__ = makeString("Recv :broadcast~%");



    static private final SubLString $str_alt59$Timed_Out___Reset_Me = makeString("Timed Out - Reset Me");

    static private final SubLString $str_alt60$Finished___Reset_Me = makeString("Finished - Reset Me");

    private static final SubLSymbol $SCATTER = makeKeyword("SCATTER");

    static private final SubLString $str_alt62$Recv__scatter__ = makeString("Recv :scatter~%");

    static private final SubLString $str_alt63$Busy____a__ = makeString("Busy : ~a~%");

    static private final SubLString $str_alt64$Timed_Out____a__ = makeString("Timed Out : ~a~%");



    static private final SubLString $str_alt66$Stop__ = makeString("Stop~%");



    static private final SubLString $$$Stop_Me = makeString("Stop Me");

    private static final SubLSymbol $EXECUTE = makeKeyword("EXECUTE");

    static private final SubLList $list_alt70 = list(makeKeyword("EXECUTE"));

    static private final SubLString $str_alt71$Reset_Me___I_m_Done = makeString("Reset Me - I'm Done");

    static private final SubLList $list_alt72 = list(makeKeyword("PEER-REQUEST"), makeKeyword("REGISTER"), makeKeyword("QUERY"), makeKeyword("RESET"), makeKeyword("REMOVE"));

    private static final SubLSymbol $PEER_REQUEST = makeKeyword("PEER-REQUEST");

    static private final SubLString $str_alt74$Recv__peer_request__ = makeString("Recv :peer-request~%");

    private static final SubLSymbol $REGISTER = makeKeyword("REGISTER");

    static private final SubLString $str_alt76$Recv__register__ = makeString("Recv :register~%");

    static private final SubLString $str_alt77$Recv__query__ = makeString("Recv :query~%");


    static private final SubLString $str_alt79$Recv__reset__ = makeString("Recv :reset~%");

    static private final SubLString $$$Register = makeString("Register");

    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");

    static private final SubLString $str_alt82$Here_we_are_with_the_ccc_list____ = makeString("Here we are with the ccc-list.~% It's length is ~a.~% The first element is ~a ~a ~a.");

    static private final SubLString $str_alt83$In_agent_response__ = makeString("In agent-response~%");



    static private final SubLString $str_alt85$Danger___Encountered_a_timeout_wa = makeString("Danger : Encountered a timeout waiting for machines to respond to requests from coordinator~%");

    static private final SubLString $str_alt86$We_have_received_all_request_vect = makeString("We have received all request vectors and are proceeding...~%");

    static private final SubLString $str_alt87$OV____a__ = makeString("OV : ~a~%");



    static private final SubLString $str_alt89$We_now_have_broadcasted_everythin = makeString("We now have broadcasted everything...~%");

    static private final SubLString $str_alt90$All_the_machines_have_returned_wi = makeString("All the machines have returned with values.~%");



    static private final SubLString $str_alt92$Object_Vector____a__ = makeString("Object Vector : ~a~%");

    static private final SubLList $list_alt93 = list($STOP, makeInteger(23));

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_dcyc_agent_file();
    }

    @Override
    public void initializeVariables() {
        init_dcyc_agent_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_dcyc_agent_file();
    }
}

