/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FINITE-STATE-TRANSDUCER
 * source file: /cyc/top/cycl/finite-state-transducer.lisp
 * created:     2019/07/03 17:37:15
 */
public final class finite_state_transducer extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final class $finite_state_transducer_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$initial_state;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$final_states;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$machine_table;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$token_builder;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$input;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$current_token_index;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$current_state;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$memory;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$indexed_output;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$initial_state = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$final_states = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$machine_table = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$token_builder = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$input = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$current_token_index = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$current_state = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$memory = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.this.$indexed_output = value;
        }

        public SubLObject $initial_state = Lisp.NIL;

        public SubLObject $final_states = Lisp.NIL;

        public SubLObject $machine_table = Lisp.NIL;

        public SubLObject $token_builder = Lisp.NIL;

        public SubLObject $input = Lisp.NIL;

        public SubLObject $current_token_index = Lisp.NIL;

        public SubLObject $current_state = Lisp.NIL;

        public SubLObject $memory = Lisp.NIL;

        public SubLObject $indexed_output = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.class, FINITE_STATE_TRANSDUCER, FINITE_STATE_TRANSDUCER_P, $list_alt2, $list_alt3, new String[]{ "$initial_state", "$final_states", "$machine_table", "$token_builder", "$input", "$current_token_index", "$current_state", "$memory", "$indexed_output" }, $list_alt4, $list_alt5, PRINT_FST);
    }

    public static final SubLFile me = new finite_state_transducer();

 public static final String myName = "com.cyc.cycjava.cycl.finite_state_transducer";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_finite_state_transducer$ = makeSymbol("*DTP-FINITE-STATE-TRANSDUCER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol FINITE_STATE_TRANSDUCER = makeSymbol("FINITE-STATE-TRANSDUCER");

    private static final SubLSymbol FINITE_STATE_TRANSDUCER_P = makeSymbol("FINITE-STATE-TRANSDUCER-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("INITIAL-STATE"), makeSymbol("FINAL-STATES"), makeSymbol("MACHINE-TABLE"), makeSymbol("TOKEN-BUILDER"), makeSymbol("INPUT"), makeSymbol("CURRENT-TOKEN-INDEX"), makeSymbol("CURRENT-STATE"), makeSymbol("MEMORY"), makeSymbol("INDEXED-OUTPUT") });

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("INITIAL-STATE"), makeKeyword("FINAL-STATES"), makeKeyword("MACHINE-TABLE"), makeKeyword("TOKEN-BUILDER"), makeKeyword("INPUT"), makeKeyword("CURRENT-TOKEN-INDEX"), makeKeyword("CURRENT-STATE"), makeKeyword("MEMORY"), makeKeyword("INDEXED-OUTPUT") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("FST-INITIAL-STATE"), makeSymbol("FST-FINAL-STATES"), makeSymbol("FST-MACHINE-TABLE"), makeSymbol("FST-TOKEN-BUILDER"), makeSymbol("FST-INPUT"), makeSymbol("FST-CURRENT-TOKEN-INDEX"), makeSymbol("FST-CURRENT-STATE"), makeSymbol("FST-MEMORY"), makeSymbol("FST-INDEXED-OUTPUT") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-FST-INITIAL-STATE"), makeSymbol("_CSETF-FST-FINAL-STATES"), makeSymbol("_CSETF-FST-MACHINE-TABLE"), makeSymbol("_CSETF-FST-TOKEN-BUILDER"), makeSymbol("_CSETF-FST-INPUT"), makeSymbol("_CSETF-FST-CURRENT-TOKEN-INDEX"), makeSymbol("_CSETF-FST-CURRENT-STATE"), makeSymbol("_CSETF-FST-MEMORY"), makeSymbol("_CSETF-FST-INDEXED-OUTPUT") });

    private static final SubLSymbol PRINT_FST = makeSymbol("PRINT-FST");

    private static final SubLSymbol FINITE_STATE_TRANSDUCER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FINITE-STATE-TRANSDUCER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FINITE-STATE-TRANSDUCER-P"));

    private static final SubLSymbol FST_INITIAL_STATE = makeSymbol("FST-INITIAL-STATE");

    private static final SubLSymbol _CSETF_FST_INITIAL_STATE = makeSymbol("_CSETF-FST-INITIAL-STATE");

    private static final SubLSymbol FST_FINAL_STATES = makeSymbol("FST-FINAL-STATES");

    private static final SubLSymbol _CSETF_FST_FINAL_STATES = makeSymbol("_CSETF-FST-FINAL-STATES");

    private static final SubLSymbol FST_MACHINE_TABLE = makeSymbol("FST-MACHINE-TABLE");

    private static final SubLSymbol _CSETF_FST_MACHINE_TABLE = makeSymbol("_CSETF-FST-MACHINE-TABLE");

    private static final SubLSymbol FST_TOKEN_BUILDER = makeSymbol("FST-TOKEN-BUILDER");

    private static final SubLSymbol _CSETF_FST_TOKEN_BUILDER = makeSymbol("_CSETF-FST-TOKEN-BUILDER");

    private static final SubLSymbol FST_INPUT = makeSymbol("FST-INPUT");

    private static final SubLSymbol _CSETF_FST_INPUT = makeSymbol("_CSETF-FST-INPUT");

    private static final SubLSymbol FST_CURRENT_TOKEN_INDEX = makeSymbol("FST-CURRENT-TOKEN-INDEX");

    private static final SubLSymbol _CSETF_FST_CURRENT_TOKEN_INDEX = makeSymbol("_CSETF-FST-CURRENT-TOKEN-INDEX");

    private static final SubLSymbol FST_CURRENT_STATE = makeSymbol("FST-CURRENT-STATE");

    private static final SubLSymbol _CSETF_FST_CURRENT_STATE = makeSymbol("_CSETF-FST-CURRENT-STATE");

    private static final SubLSymbol FST_MEMORY = makeSymbol("FST-MEMORY");

    private static final SubLSymbol _CSETF_FST_MEMORY = makeSymbol("_CSETF-FST-MEMORY");

    private static final SubLSymbol FST_INDEXED_OUTPUT = makeSymbol("FST-INDEXED-OUTPUT");

    private static final SubLSymbol _CSETF_FST_INDEXED_OUTPUT = makeSymbol("_CSETF-FST-INDEXED-OUTPUT");

    private static final SubLSymbol $CURRENT_TOKEN_INDEX = makeKeyword("CURRENT-TOKEN-INDEX");

    private static final SubLString $str36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_FINITE_STATE_TRANSDUCER = makeSymbol("MAKE-FINITE-STATE-TRANSDUCER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_TRANSDUCER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-TRANSDUCER-METHOD");

    private static final SubLString $str42$__FST___S_ = makeString("#<FST: ~S>");

    private static final SubLSymbol FST_OUTPUT = makeSymbol("FST-OUTPUT");

    private static final SubLString $str45$Invalid_final_states__a = makeString("Invalid final states ~a");

    private static final SubLList $list50 = list(list(makeSymbol("MATCH"), makeSymbol("SEQUENCE"), makeSymbol("FST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol FST_INITIALIZE = makeSymbol("FST-INITIALIZE");

    private static final SubLSymbol FST_MATCH_INTERNAL = makeSymbol("FST-MATCH-INTERNAL");

    private static final SubLList $list57 = list($EMIT, makeKeyword("REMEMBER"), makeKeyword("BACKUP"));

    private static final SubLString $str61$Invalid_FST_command__a = makeString("Invalid FST command ~a");

    private static final SubLSymbol FST_ACTION_P = makeSymbol("FST-ACTION-P");

    private static final SubLString $str64$Invalid_FST_action_list__a = makeString("Invalid FST action list ~a");

    public static final SubLObject finite_state_transducer_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_fst(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject finite_state_transducer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fst(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject finite_state_transducer_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject finite_state_transducer_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native.class ? T : NIL;
    }

    public static final SubLObject fst_initial_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.getField2();
    }

    public static SubLObject fst_initial_state(final SubLObject v_object) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject fst_final_states_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.getField3();
    }

    public static SubLObject fst_final_states(final SubLObject v_object) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject fst_machine_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.getField4();
    }

    public static SubLObject fst_machine_table(final SubLObject v_object) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject fst_token_builder_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.getField5();
    }

    public static SubLObject fst_token_builder(final SubLObject v_object) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject fst_input_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.getField6();
    }

    public static SubLObject fst_input(final SubLObject v_object) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject fst_current_token_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.getField7();
    }

    public static SubLObject fst_current_token_index(final SubLObject v_object) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject fst_current_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.getField8();
    }

    public static SubLObject fst_current_state(final SubLObject v_object) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject fst_memory_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.getField9();
    }

    public static SubLObject fst_memory(final SubLObject v_object) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject fst_indexed_output_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.getField10();
    }

    public static SubLObject fst_indexed_output(final SubLObject v_object) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject _csetf_fst_initial_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fst_initial_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_fst_final_states_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fst_final_states(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_fst_machine_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fst_machine_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_fst_token_builder_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_fst_token_builder(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_fst_input_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_fst_input(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_fst_current_token_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_fst_current_token_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_fst_current_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_fst_current_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_fst_memory_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_fst_memory(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_fst_indexed_output_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FINITE_STATE_TRANSDUCER_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_fst_indexed_output(final SubLObject v_object, final SubLObject value) {
        assert NIL != finite_state_transducer_p(v_object) : "! finite_state_transducer.finite_state_transducer_p(v_object) " + "finite_state_transducer.finite_state_transducer_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject make_finite_state_transducer_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INITIAL_STATE)) {
                        _csetf_fst_initial_state(v_new, current_value);
                    } else {
                        if (pcase_var.eql($FINAL_STATES)) {
                            _csetf_fst_final_states(v_new, current_value);
                        } else {
                            if (pcase_var.eql($MACHINE_TABLE)) {
                                _csetf_fst_machine_table(v_new, current_value);
                            } else {
                                if (pcase_var.eql($TOKEN_BUILDER)) {
                                    _csetf_fst_token_builder(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($INPUT)) {
                                        _csetf_fst_input(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($CURRENT_TOKEN_INDEX)) {
                                            _csetf_fst_current_token_index(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($CURRENT_STATE)) {
                                                _csetf_fst_current_state(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($MEMORY)) {
                                                    _csetf_fst_memory(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($INDEXED_OUTPUT)) {
                                                        _csetf_fst_indexed_output(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt35$Invalid_slot__S_for_construction_, current_arg);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_finite_state_transducer(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.finite_state_transducer.$finite_state_transducer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INITIAL_STATE)) {
                _csetf_fst_initial_state(v_new, current_value);
            } else
                if (pcase_var.eql($FINAL_STATES)) {
                    _csetf_fst_final_states(v_new, current_value);
                } else
                    if (pcase_var.eql($MACHINE_TABLE)) {
                        _csetf_fst_machine_table(v_new, current_value);
                    } else
                        if (pcase_var.eql($TOKEN_BUILDER)) {
                            _csetf_fst_token_builder(v_new, current_value);
                        } else
                            if (pcase_var.eql($INPUT)) {
                                _csetf_fst_input(v_new, current_value);
                            } else
                                if (pcase_var.eql($CURRENT_TOKEN_INDEX)) {
                                    _csetf_fst_current_token_index(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CURRENT_STATE)) {
                                        _csetf_fst_current_state(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($MEMORY)) {
                                            _csetf_fst_memory(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($INDEXED_OUTPUT)) {
                                                _csetf_fst_indexed_output(v_new, current_value);
                                            } else {
                                                Errors.error($str36$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_finite_state_transducer(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FINITE_STATE_TRANSDUCER, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INITIAL_STATE, fst_initial_state(obj));
        funcall(visitor_fn, obj, $SLOT, $FINAL_STATES, fst_final_states(obj));
        funcall(visitor_fn, obj, $SLOT, $MACHINE_TABLE, fst_machine_table(obj));
        funcall(visitor_fn, obj, $SLOT, $TOKEN_BUILDER, fst_token_builder(obj));
        funcall(visitor_fn, obj, $SLOT, $INPUT, fst_input(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_TOKEN_INDEX, fst_current_token_index(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_STATE, fst_current_state(obj));
        funcall(visitor_fn, obj, $SLOT, $MEMORY, fst_memory(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEXED_OUTPUT, fst_indexed_output(obj));
        funcall(visitor_fn, obj, $END, MAKE_FINITE_STATE_TRANSDUCER, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_finite_state_transducer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_finite_state_transducer(obj, visitor_fn);
    }

    public static final SubLObject print_fst_alt(SubLObject fst, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt36$__FST___S_, fst_token_builder(fst));
        return NIL;
    }

    public static SubLObject print_fst(final SubLObject fst, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str42$__FST___S_, fst_token_builder(fst));
        return NIL;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return non-negative-integer; the starting index of the current output
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return non-negative-integer; the starting index of the current output")
    public static final SubLObject fst_output_start_alt(SubLObject fst) {
        return fst_indexed_output(fst).first().rest();
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return non-negative-integer; the starting index of the current output
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return non-negative-integer; the starting index of the current output")
    public static SubLObject fst_output_start(final SubLObject fst) {
        return fst_indexed_output(fst).first().rest();
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return non-negative-integer; the ending index of the current output
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return non-negative-integer; the ending index of the current output")
    public static final SubLObject fst_output_end_alt(SubLObject fst) {
        return last(fst_indexed_output(fst), UNPROVIDED).first().rest();
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return non-negative-integer; the ending index of the current output
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return non-negative-integer; the ending index of the current output")
    public static SubLObject fst_output_end(final SubLObject fst) {
        return last(fst_indexed_output(fst), UNPROVIDED).first().rest();
    }

    /**
     *
     *
     * @param INITIAL-STATE
     * 		integer; the initial state of this fst
     * @param FINAL-STATE
     * 		integer; the final state of this fst
     * @param STATE-TABLE-LIST
     * 		list; a list of <<start-state> <label> <action-list> <end-state>>
     * 		quadruples, where <start-state> and <end-state> are integers; <label> is either a predicate
     * 		or literal object, and <action-list> is a list of valid fst actions
     * @return finite-state-transducer; a new transducer with initial state INITIAL-STATE, final
    state FINAL-STATE, machine-table STATE-TABLE-LIST and token-builder TOKEN-BUILDER.
     */
    @LispMethod(comment = "@param INITIAL-STATE\r\n\t\tinteger; the initial state of this fst\r\n@param FINAL-STATE\r\n\t\tinteger; the final state of this fst\r\n@param STATE-TABLE-LIST\r\n\t\tlist; a list of <<start-state> <label> <action-list> <end-state>>\r\n\t\tquadruples, where <start-state> and <end-state> are integers; <label> is either a predicate\r\n\t\tor literal object, and <action-list> is a list of valid fst actions\r\n@return finite-state-transducer; a new transducer with initial state INITIAL-STATE, final\r\nstate FINAL-STATE, machine-table STATE-TABLE-LIST and token-builder TOKEN-BUILDER.")
    public static final SubLObject new_finite_state_transducer_alt(SubLObject initial_state, SubLObject final_states, SubLObject state_table_list, SubLObject token_builder) {
        if (token_builder == UNPROVIDED) {
            token_builder = FST_OUTPUT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(initial_state, INTEGERP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != list_utilities.find_if_not(INTEGERP, final_states, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt39$Invalid_final_states__a, final_states);
                }
            }
            SubLTrampolineFile.checkType(state_table_list, LISTP);
            SubLTrampolineFile.checkType(token_builder, FUNCTION_SPEC_P);
            {
                SubLObject fst = make_finite_state_transducer(UNPROVIDED);
                SubLObject machine_table = make_vector(add(max_state(state_table_list), ONE_INTEGER), UNPROVIDED);
                SubLObject cdolist_list_var = reverse(state_table_list);
                SubLObject quadruple = NIL;
                for (quadruple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , quadruple = cdolist_list_var.first()) {
                    machine_table_set(machine_table, quadruple.first(), second(quadruple), third(quadruple), fourth(quadruple));
                }
                _csetf_fst_initial_state(fst, initial_state);
                _csetf_fst_final_states(fst, final_states);
                _csetf_fst_machine_table(fst, machine_table);
                _csetf_fst_token_builder(fst, token_builder);
                return fst;
            }
        }
    }

    /**
     *
     *
     * @param INITIAL-STATE
     * 		integer; the initial state of this fst
     * @param FINAL-STATE
     * 		integer; the final state of this fst
     * @param STATE-TABLE-LIST
     * 		list; a list of <<start-state> <label> <action-list> <end-state>>
     * 		quadruples, where <start-state> and <end-state> are integers; <label> is either a predicate
     * 		or literal object, and <action-list> is a list of valid fst actions
     * @return finite-state-transducer; a new transducer with initial state INITIAL-STATE, final
    state FINAL-STATE, machine-table STATE-TABLE-LIST and token-builder TOKEN-BUILDER.
     */
    @LispMethod(comment = "@param INITIAL-STATE\r\n\t\tinteger; the initial state of this fst\r\n@param FINAL-STATE\r\n\t\tinteger; the final state of this fst\r\n@param STATE-TABLE-LIST\r\n\t\tlist; a list of <<start-state> <label> <action-list> <end-state>>\r\n\t\tquadruples, where <start-state> and <end-state> are integers; <label> is either a predicate\r\n\t\tor literal object, and <action-list> is a list of valid fst actions\r\n@return finite-state-transducer; a new transducer with initial state INITIAL-STATE, final\r\nstate FINAL-STATE, machine-table STATE-TABLE-LIST and token-builder TOKEN-BUILDER.")
    public static SubLObject new_finite_state_transducer(final SubLObject initial_state, final SubLObject final_states, final SubLObject state_table_list, SubLObject token_builder) {
        if (token_builder == UNPROVIDED) {
            token_builder = FST_OUTPUT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(initial_state) : "! integerp(initial_state) " + ("Types.integerp(initial_state) " + "CommonSymbols.NIL != Types.integerp(initial_state) ") + initial_state;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != list_utilities.find_if_not(INTEGERP, final_states, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str45$Invalid_final_states__a, final_states);
        }
        assert NIL != listp(state_table_list) : "! listp(state_table_list) " + ("Types.listp(state_table_list) " + "CommonSymbols.NIL != Types.listp(state_table_list) ") + state_table_list;
        assert NIL != function_spec_p(token_builder) : "! function_spec_p(token_builder) " + ("Types.function_spec_p(token_builder) " + "CommonSymbols.NIL != Types.function_spec_p(token_builder) ") + token_builder;
        final SubLObject fst = make_finite_state_transducer(UNPROVIDED);
        final SubLObject machine_table = make_vector(add(max_state(state_table_list), ONE_INTEGER), UNPROVIDED);
        SubLObject cdolist_list_var = reverse(state_table_list);
        SubLObject quadruple = NIL;
        quadruple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            machine_table_set(machine_table, quadruple.first(), second(quadruple), third(quadruple), fourth(quadruple));
            cdolist_list_var = cdolist_list_var.rest();
            quadruple = cdolist_list_var.first();
        } 
        _csetf_fst_initial_state(fst, initial_state);
        _csetf_fst_final_states(fst, final_states);
        _csetf_fst_machine_table(fst, machine_table);
        _csetf_fst_token_builder(fst, token_builder);
        return fst;
    }

    /**
     *
     *
     * @param FST
    finite-state-transduce
     * 		
     * @return listp; the list of current output tokens
     */
    @LispMethod(comment = "@param FST\nfinite-state-transduce\r\n\t\t\r\n@return listp; the list of current output tokens")
    public static final SubLObject fst_output_alt(SubLObject fst) {
        return Mapping.mapcar(CAR, fst_indexed_output(fst));
    }

    /**
     *
     *
     * @param FST
    finite-state-transduce
     * 		
     * @return listp; the list of current output tokens
     */
    @LispMethod(comment = "@param FST\nfinite-state-transduce\r\n\t\t\r\n@return listp; the list of current output tokens")
    public static SubLObject fst_output(final SubLObject fst) {
        return Mapping.mapcar(CAR, fst_indexed_output(fst));
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @param SEQUENCE
     * 		string or vector
     * @return object; the first match of FST in SEQUENCE
     * @return integer; the starting position of the match in SEQUENCE
     * @return integer; the ending position of the match in SEQUENCE
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@param SEQUENCE\r\n\t\tstring or vector\r\n@return object; the first match of FST in SEQUENCE\r\n@return integer; the starting position of the match in SEQUENCE\r\n@return integer; the ending position of the match in SEQUENCE")
    public static final SubLObject fst_match_alt(SubLObject fst, SubLObject sequence) {
        SubLTrampolineFile.checkType(fst, FINITE_STATE_TRANSDUCER_P);
        SubLTrampolineFile.checkType(sequence, SEQUENCEP);
        fst_initialize(fst, sequence);
        fst_run(fst);
        return NIL != fst_final_state_p(fst) ? ((SubLObject) (funcall(fst_token_builder(fst), fst))) : NIL;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @param SEQUENCE
     * 		string or vector
     * @return object; the first match of FST in SEQUENCE
     * @return integer; the starting position of the match in SEQUENCE
     * @return integer; the ending position of the match in SEQUENCE
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@param SEQUENCE\r\n\t\tstring or vector\r\n@return object; the first match of FST in SEQUENCE\r\n@return integer; the starting position of the match in SEQUENCE\r\n@return integer; the ending position of the match in SEQUENCE")
    public static SubLObject fst_match(final SubLObject fst, final SubLObject sequence) {
        assert NIL != finite_state_transducer_p(fst) : "! finite_state_transducer.finite_state_transducer_p(fst) " + ("finite_state_transducer.finite_state_transducer_p(fst) " + "CommonSymbols.NIL != finite_state_transducer.finite_state_transducer_p(fst) ") + fst;
        assert NIL != sequencep(sequence) : "! sequencep(sequence) " + ("Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) ") + sequence;
        fst_initialize(fst, sequence);
        fst_run(fst);
        return NIL != fst_final_state_p(fst) ? funcall(fst_token_builder(fst), fst) : NIL;
    }

    /**
     * Execute BODY with MATCH successively bound to the next FST match in SEQUENCE
     */
    @LispMethod(comment = "Execute BODY with MATCH successively bound to the next FST match in SEQUENCE")
    public static final SubLObject fst_do_match_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject match = NIL;
                    SubLObject sequence = NIL;
                    SubLObject fst = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    match = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    sequence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    fst = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, list(FST_INITIALIZE, fst, sequence), listS(CDO, list(list(match, list(FST_MATCH_INTERNAL, fst), list(FST_MATCH_INTERNAL, fst))), list(list(NULL, match)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt44);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Execute BODY with MATCH successively bound to the next FST match in SEQUENCE")
    public static SubLObject fst_do_match(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject match = NIL;
        SubLObject sequence = NIL;
        SubLObject fst = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        match = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        sequence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        fst = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, list(FST_INITIALIZE, fst, sequence), listS(CDO, list(list(match, list(FST_MATCH_INTERNAL, fst), list(FST_MATCH_INTERNAL, fst))), list(list(NULL, match)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list50);
        return NIL;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @param SEQUENCE
     * 		string or vector
     * @return vector; a vector of FST matches of SEQUENCE in the order of the matches until
    FST fails to match SEQUENCE
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@param SEQUENCE\r\n\t\tstring or vector\r\n@return vector; a vector of FST matches of SEQUENCE in the order of the matches until\r\nFST fails to match SEQUENCE")
    public static final SubLObject fst_match_global_alt(SubLObject fst, SubLObject sequence) {
        SubLTrampolineFile.checkType(fst, FINITE_STATE_TRANSDUCER_P);
        SubLTrampolineFile.checkType(sequence, SEQUENCEP);
        {
            SubLObject matches = NIL;
            fst_initialize(fst, sequence);
            {
                SubLObject match = NIL;
                for (match = fst_match_internal(fst); NIL != match; match = fst_match_internal(fst)) {
                    matches = cons(match, matches);
                }
            }
            return list_utilities.list2vector(nreverse(matches));
        }
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @param SEQUENCE
     * 		string or vector
     * @return vector; a vector of FST matches of SEQUENCE in the order of the matches until
    FST fails to match SEQUENCE
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@param SEQUENCE\r\n\t\tstring or vector\r\n@return vector; a vector of FST matches of SEQUENCE in the order of the matches until\r\nFST fails to match SEQUENCE")
    public static SubLObject fst_match_global(final SubLObject fst, final SubLObject sequence) {
        assert NIL != finite_state_transducer_p(fst) : "! finite_state_transducer.finite_state_transducer_p(fst) " + ("finite_state_transducer.finite_state_transducer_p(fst) " + "CommonSymbols.NIL != finite_state_transducer.finite_state_transducer_p(fst) ") + fst;
        assert NIL != sequencep(sequence) : "! sequencep(sequence) " + ("Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) ") + sequence;
        SubLObject matches = NIL;
        fst_initialize(fst, sequence);
        SubLObject match;
        for (match = NIL, match = fst_match_internal(fst); NIL != match; match = fst_match_internal(fst)) {
            matches = cons(match, matches);
        }
        return list_utilities.list2vector(nreverse(matches));
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @param SEQUENCE
     * 		vector or string
     * @return finite-state-transducer; the input FST which has been reset and initialized
    with SEQUENCE as its input
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@param SEQUENCE\r\n\t\tvector or string\r\n@return finite-state-transducer; the input FST which has been reset and initialized\r\nwith SEQUENCE as its input")
    public static final SubLObject fst_initialize_alt(SubLObject fst, SubLObject sequence) {
        _csetf_fst_input(fst, sequence.isList() ? ((SubLObject) (apply(VECTOR, sequence))) : sequence);
        _csetf_fst_current_token_index(fst, ZERO_INTEGER);
        _csetf_fst_current_state(fst, fst_initial_state(fst));
        _csetf_fst_indexed_output(fst, NIL);
        return fst;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @param SEQUENCE
     * 		vector or string
     * @return finite-state-transducer; the input FST which has been reset and initialized
    with SEQUENCE as its input
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@param SEQUENCE\r\n\t\tvector or string\r\n@return finite-state-transducer; the input FST which has been reset and initialized\r\nwith SEQUENCE as its input")
    public static SubLObject fst_initialize(final SubLObject fst, final SubLObject sequence) {
        _csetf_fst_input(fst, sequence.isList() ? apply(VECTOR, sequence) : sequence);
        _csetf_fst_current_token_index(fst, ZERO_INTEGER);
        _csetf_fst_current_state(fst, fst_initial_state(fst));
        _csetf_fst_indexed_output(fst, NIL);
        return fst;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return object; the portion of the input of FST that matched according to FST's
    machine table.
     * @unknown this will destructively change the machine state of FST. In
    particular, FST's input pointer will move forward and not be reset
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return object; the portion of the input of FST that matched according to FST\'s\r\nmachine table.\r\n@unknown this will destructively change the machine state of FST. In\r\nparticular, FST\'s input pointer will move forward and not be reset")
    public static final SubLObject fst_match_internal_alt(SubLObject fst) {
        _csetf_fst_current_state(fst, fst_initial_state(fst));
        _csetf_fst_indexed_output(fst, NIL);
        fst_run(fst);
        return NIL != fst_final_state_p(fst) ? ((SubLObject) (funcall(fst_token_builder(fst), fst))) : NIL;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return object; the portion of the input of FST that matched according to FST's
    machine table.
     * @unknown this will destructively change the machine state of FST. In
    particular, FST's input pointer will move forward and not be reset
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return object; the portion of the input of FST that matched according to FST\'s\r\nmachine table.\r\n@unknown this will destructively change the machine state of FST. In\r\nparticular, FST\'s input pointer will move forward and not be reset")
    public static SubLObject fst_match_internal(final SubLObject fst) {
        _csetf_fst_current_state(fst, fst_initial_state(fst));
        _csetf_fst_indexed_output(fst, NIL);
        fst_run(fst);
        return NIL != fst_final_state_p(fst) ? funcall(fst_token_builder(fst), fst) : NIL;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return finite-state-transducer; run the input FST until it stops, destructively
    updating its state, and return that updated fst
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return finite-state-transducer; run the input FST until it stops, destructively\r\nupdating its state, and return that updated fst")
    public static final SubLObject fst_run_alt(SubLObject fst) {
        {
            SubLObject length = length(fst_input(fst));
            SubLObject machine_table_value = NIL;
            while (!((fst_current_token_index(fst).numGE(length) || (NIL == fst_current_state(fst))) || (NIL != fst_final_state_p(fst)))) {
                machine_table_value = machine_table_get(fst_machine_table(fst), fst_current_state(fst), fst_current_token(fst));
                {
                    SubLObject cdolist_list_var = machine_table_value.first();
                    SubLObject action = NIL;
                    for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                        fst_execute(fst, action);
                    }
                }
                _csetf_fst_current_state(fst, machine_table_value.rest());
                _csetf_fst_current_token_index(fst, add(fst_current_token_index(fst), ONE_INTEGER));
            } 
            if ((NIL != fst_current_state(fst)) && fst_current_token_index(fst).eql(length)) {
                machine_table_value = machine_table_get(fst_machine_table(fst), fst_current_state(fst), $END);
                if (NIL != machine_table_value) {
                    {
                        SubLObject cdolist_list_var = machine_table_value.first();
                        SubLObject action = NIL;
                        for (action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action = cdolist_list_var.first()) {
                            fst_execute(fst, action);
                        }
                    }
                    _csetf_fst_current_state(fst, machine_table_value.rest());
                    _csetf_fst_current_token_index(fst, add(fst_current_token_index(fst), ONE_INTEGER));
                }
            }
            _csetf_fst_indexed_output(fst, nreverse(fst_indexed_output(fst)));
            return fst;
        }
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return finite-state-transducer; run the input FST until it stops, destructively
    updating its state, and return that updated fst
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return finite-state-transducer; run the input FST until it stops, destructively\r\nupdating its state, and return that updated fst")
    public static SubLObject fst_run(final SubLObject fst) {
        final SubLObject length = length(fst_input(fst));
        SubLObject machine_table_value = NIL;
        while (((!fst_current_token_index(fst).numGE(length)) && (NIL != fst_current_state(fst))) && (NIL == fst_final_state_p(fst))) {
            machine_table_value = machine_table_get(fst_machine_table(fst), fst_current_state(fst), fst_current_token(fst));
            SubLObject cdolist_list_var = machine_table_value.first();
            SubLObject action = NIL;
            action = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                fst_execute(fst, action);
                cdolist_list_var = cdolist_list_var.rest();
                action = cdolist_list_var.first();
            } 
            _csetf_fst_current_state(fst, machine_table_value.rest());
            _csetf_fst_current_token_index(fst, add(fst_current_token_index(fst), ONE_INTEGER));
        } 
        if ((NIL != fst_current_state(fst)) && fst_current_token_index(fst).eql(length)) {
            machine_table_value = machine_table_get(fst_machine_table(fst), fst_current_state(fst), $END);
            if (NIL != machine_table_value) {
                SubLObject cdolist_list_var = machine_table_value.first();
                SubLObject action = NIL;
                action = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    fst_execute(fst, action);
                    cdolist_list_var = cdolist_list_var.rest();
                    action = cdolist_list_var.first();
                } 
                _csetf_fst_current_state(fst, machine_table_value.rest());
                _csetf_fst_current_token_index(fst, add(fst_current_token_index(fst), ONE_INTEGER));
            }
        }
        _csetf_fst_indexed_output(fst, nreverse(fst_indexed_output(fst)));
        return fst;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return object; the current input object of FST
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return object; the current input object of FST")
    public static final SubLObject fst_current_token_alt(SubLObject fst) {
        return aref(fst_input(fst), fst_current_token_index(fst));
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return object; the current input object of FST
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return object; the current input object of FST")
    public static SubLObject fst_current_token(final SubLObject fst) {
        return aref(fst_input(fst), fst_current_token_index(fst));
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return boolean; non-nil if FST is in one of its final states, nil otherwise
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return boolean; non-nil if FST is in one of its final states, nil otherwise")
    public static final SubLObject fst_final_state_p_alt(SubLObject fst) {
        return member(fst_current_state(fst), fst_final_states(fst), EQL, UNPROVIDED);
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return boolean; non-nil if FST is in one of its final states, nil otherwise
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return boolean; non-nil if FST is in one of its final states, nil otherwise")
    public static SubLObject fst_final_state_p(final SubLObject fst) {
        return member(fst_current_state(fst), fst_final_states(fst), EQL, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a valid fst-action, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a valid fst-action, nil otherwise")
    public static final SubLObject fst_action_p_alt(SubLObject v_object) {
        return member(v_object, $list_alt52, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a valid fst-action, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a valid fst-action, nil otherwise")
    public static SubLObject fst_action_p(final SubLObject v_object) {
        return member(v_object, $list57, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @param COMMAND
    keyword
     * 		
     * @return finite-state-transducer; a version of FST that been destructively
    modified by running COMMAND on it.
     * @unknown destructively modifies FST
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@param COMMAND\nkeyword\r\n\t\t\r\n@return finite-state-transducer; a version of FST that been destructively\r\nmodified by running COMMAND on it.\r\n@unknown destructively modifies FST")
    public static final SubLObject fst_execute_alt(SubLObject fst, SubLObject command) {
        {
            SubLObject pcase_var = command;
            if (pcase_var.eql($EMIT)) {
                return fst_emit(fst);
            } else {
                if (pcase_var.eql($REMEMBER)) {
                    return fst_remember(fst);
                } else {
                    if (pcase_var.eql($BACKUP)) {
                        return fst_backup(fst);
                    } else {
                        Errors.error($str_alt56$Invalid_FST_command__a, command);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @param COMMAND
    keyword
     * 		
     * @return finite-state-transducer; a version of FST that been destructively
    modified by running COMMAND on it.
     * @unknown destructively modifies FST
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@param COMMAND\nkeyword\r\n\t\t\r\n@return finite-state-transducer; a version of FST that been destructively\r\nmodified by running COMMAND on it.\r\n@unknown destructively modifies FST")
    public static SubLObject fst_execute(final SubLObject fst, final SubLObject command) {
        if (command.eql($EMIT)) {
            return fst_emit(fst);
        }
        if (command.eql($REMEMBER)) {
            return fst_remember(fst);
        }
        if (command.eql($BACKUP)) {
            return fst_backup(fst);
        }
        Errors.error($str61$Invalid_FST_command__a, command);
        return NIL;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return finite-state-transducer; push the current input object of FST onto
    the output and return the updated FST
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return finite-state-transducer; push the current input object of FST onto\r\nthe output and return the updated FST")
    public static final SubLObject fst_emit_alt(SubLObject fst) {
        _csetf_fst_indexed_output(fst, cons(cons(fst_current_token(fst), fst_current_token_index(fst)), fst_indexed_output(fst)));
        return fst;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return finite-state-transducer; push the current input object of FST onto
    the output and return the updated FST
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return finite-state-transducer; push the current input object of FST onto\r\nthe output and return the updated FST")
    public static SubLObject fst_emit(final SubLObject fst) {
        final SubLObject token = fst_current_token(fst);
        final SubLObject modified_token = (token.isInteger() && (NIL != unicode_strings.ascii_char_code_p(token))) ? code_char(token) : token.isInteger() ? unicode_strings.utf8_vector_to_utf8_string(unicode_strings.to_utf8_vector(token)) : token;
        _csetf_fst_indexed_output(fst, cons(cons(modified_token, fst_current_token_index(fst)), fst_indexed_output(fst)));
        return fst;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return finite-state-transducer; store the index - 1 of the current input object of
    FST in its memory and return the updated FST
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return finite-state-transducer; store the index - 1 of the current input object of\r\nFST in its memory and return the updated FST")
    public static final SubLObject fst_remember_alt(SubLObject fst) {
        _csetf_fst_memory(fst, subtract(fst_current_token_index(fst), ONE_INTEGER));
        return fst;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return finite-state-transducer; store the index - 1 of the current input object of
    FST in its memory and return the updated FST
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return finite-state-transducer; store the index - 1 of the current input object of\r\nFST in its memory and return the updated FST")
    public static SubLObject fst_remember(final SubLObject fst) {
        _csetf_fst_memory(fst, subtract(fst_current_token_index(fst), ONE_INTEGER));
        return fst;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return finite-state-transducer; make the current index of FST the index currently
    stored in its memory and return the updated FST
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return finite-state-transducer; make the current index of FST the index currently\r\nstored in its memory and return the updated FST")
    public static final SubLObject fst_backup_alt(SubLObject fst) {
        _csetf_fst_current_token_index(fst, fst_memory(fst));
        return fst;
    }

    /**
     *
     *
     * @param FST
    finite-state-transducer
     * 		
     * @return finite-state-transducer; make the current index of FST the index currently
    stored in its memory and return the updated FST
     */
    @LispMethod(comment = "@param FST\nfinite-state-transducer\r\n\t\t\r\n@return finite-state-transducer; make the current index of FST the index currently\r\nstored in its memory and return the updated FST")
    public static SubLObject fst_backup(final SubLObject fst) {
        _csetf_fst_current_token_index(fst, fst_memory(fst));
        return fst;
    }

    /**
     *
     *
     * @param TABLE
    vector
     * 		
     * @param START-STATE
    integer
     * 		
     * @param LABEL
    object
     * 		
     * @param ACTIONS
    list
     * 		
     * @param END-STATE
    integer
     * 		
     * @return vector; TABLE destructively modified to to contain the information that when
    being in state START-STATE and the current input element @see key-match LABEL then
    execute each fst-action in ACTIONS and go to END-STATE
     */
    @LispMethod(comment = "@param TABLE\nvector\r\n\t\t\r\n@param START-STATE\ninteger\r\n\t\t\r\n@param LABEL\nobject\r\n\t\t\r\n@param ACTIONS\nlist\r\n\t\t\r\n@param END-STATE\ninteger\r\n\t\t\r\n@return vector; TABLE destructively modified to to contain the information that when\r\nbeing in state START-STATE and the current input element @see key-match LABEL then\r\nexecute each fst-action in ACTIONS and go to END-STATE")
    public static final SubLObject machine_table_set_alt(SubLObject table, SubLObject start_state, SubLObject label, SubLObject actions, SubLObject end_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(table, VECTORP);
            SubLTrampolineFile.checkType(start_state, INTEGERP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != list_utilities.find_if_not(FST_ACTION_P, actions, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt59$Invalid_FST_action_list__a, actions);
                }
            }
            SubLTrampolineFile.checkType(actions, LISTP);
            SubLTrampolineFile.checkType(end_state, INTEGERP);
            set_aref(table, start_state, cons(cons(label, cons(actions, end_state)), aref(table, start_state)));
            return table;
        }
    }

    /**
     *
     *
     * @param TABLE
    vector
     * 		
     * @param START-STATE
    integer
     * 		
     * @param LABEL
    object
     * 		
     * @param ACTIONS
    list
     * 		
     * @param END-STATE
    integer
     * 		
     * @return vector; TABLE destructively modified to to contain the information that when
    being in state START-STATE and the current input element @see key-match LABEL then
    execute each fst-action in ACTIONS and go to END-STATE
     */
    @LispMethod(comment = "@param TABLE\nvector\r\n\t\t\r\n@param START-STATE\ninteger\r\n\t\t\r\n@param LABEL\nobject\r\n\t\t\r\n@param ACTIONS\nlist\r\n\t\t\r\n@param END-STATE\ninteger\r\n\t\t\r\n@return vector; TABLE destructively modified to to contain the information that when\r\nbeing in state START-STATE and the current input element @see key-match LABEL then\r\nexecute each fst-action in ACTIONS and go to END-STATE")
    public static SubLObject machine_table_set(final SubLObject table, final SubLObject start_state, final SubLObject label, final SubLObject actions, final SubLObject end_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != vectorp(table) : "! vectorp(table) " + ("Types.vectorp(table) " + "CommonSymbols.NIL != Types.vectorp(table) ") + table;
        assert NIL != integerp(start_state) : "! integerp(start_state) " + ("Types.integerp(start_state) " + "CommonSymbols.NIL != Types.integerp(start_state) ") + start_state;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != list_utilities.find_if_not(FST_ACTION_P, actions, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str64$Invalid_FST_action_list__a, actions);
        }
        assert NIL != listp(actions) : "! listp(actions) " + ("Types.listp(actions) " + "CommonSymbols.NIL != Types.listp(actions) ") + actions;
        assert NIL != integerp(end_state) : "! integerp(end_state) " + ("Types.integerp(end_state) " + "CommonSymbols.NIL != Types.integerp(end_state) ") + end_state;
        set_aref(table, start_state, cons(cons(label, cons(actions, end_state)), aref(table, start_state)));
        return table;
    }

    /**
     *
     *
     * @param TABLE
    vector
     * 		
     * @param START-STATE
    integer
     * 		
     * @param ITEM
    object
     * 		
     * @return cons; a pair whose first element is a list of fst-actions and whose second
    element is a new state (integer), with the obvious interpretation
     */
    @LispMethod(comment = "@param TABLE\nvector\r\n\t\t\r\n@param START-STATE\ninteger\r\n\t\t\r\n@param ITEM\nobject\r\n\t\t\r\n@return cons; a pair whose first element is a list of fst-actions and whose second\r\nelement is a new state (integer), with the obvious interpretation")
    public static final SubLObject machine_table_get_alt(SubLObject table, SubLObject start_state, SubLObject item) {
        {
            SubLObject action_table = aref(table, start_state);
            SubLObject label_value_pair = action_table.first();
            while (!((NIL == label_value_pair) || (NIL != key_matches(label_value_pair.first(), item)))) {
                action_table = action_table.rest();
                label_value_pair = action_table.first();
            } 
            return label_value_pair.rest();
        }
    }

    /**
     *
     *
     * @param TABLE
    vector
     * 		
     * @param START-STATE
    integer
     * 		
     * @param ITEM
    object
     * 		
     * @return cons; a pair whose first element is a list of fst-actions and whose second
    element is a new state (integer), with the obvious interpretation
     */
    @LispMethod(comment = "@param TABLE\nvector\r\n\t\t\r\n@param START-STATE\ninteger\r\n\t\t\r\n@param ITEM\nobject\r\n\t\t\r\n@return cons; a pair whose first element is a list of fst-actions and whose second\r\nelement is a new state (integer), with the obvious interpretation")
    public static SubLObject machine_table_get(final SubLObject table, final SubLObject start_state, final SubLObject item) {
        SubLObject action_table;
        SubLObject label_value_pair;
        for (action_table = aref(table, start_state), label_value_pair = action_table.first(); (NIL != label_value_pair) && (NIL == key_matches(label_value_pair.first(), item)); label_value_pair = action_table.first()) {
            action_table = action_table.rest();
        }
        return label_value_pair.rest();
    }

    /**
     *
     *
     * @param LABEL
     * 		item or function; the label of an FST arc.
     * @return boolean; t if LABEL and CHAR match, nil otherwise. Matching is determined by
    the type of LABEL
     */
    @LispMethod(comment = "@param LABEL\r\n\t\titem or function; the label of an FST arc.\r\n@return boolean; t if LABEL and CHAR match, nil otherwise. Matching is determined by\r\nthe type of LABEL")
    public static final SubLObject key_matches_alt(SubLObject label, SubLObject item) {
        return label.isFunction() && (!item.eql($END)) ? ((SubLObject) (funcall(label, item))) : equalp(label, item);
    }

    /**
     *
     *
     * @param LABEL
     * 		item or function; the label of an FST arc.
     * @return boolean; t if LABEL and CHAR match, nil otherwise. Matching is determined by
    the type of LABEL
     */
    @LispMethod(comment = "@param LABEL\r\n\t\titem or function; the label of an FST arc.\r\n@return boolean; t if LABEL and CHAR match, nil otherwise. Matching is determined by\r\nthe type of LABEL")
    public static SubLObject key_matches(final SubLObject label, SubLObject item) {
        if (item.isInteger() && (NIL != unicode_strings.ascii_char_code_p(item))) {
            item = code_char(item);
        }
        return ((NIL != item) && label.isFunction()) && (!item.eql($END)) ? funcall(label, item) : equalp(label, item);
    }

    /**
     *
     *
     * @return integer; the maximal state used in MACHINE-TABLE-SPECIFICATION
     */
    @LispMethod(comment = "@return integer; the maximal state used in MACHINE-TABLE-SPECIFICATION")
    public static final SubLObject max_state_alt(SubLObject machine_table_specification) {
        SubLTrampolineFile.checkType(machine_table_specification, LISTP);
        {
            SubLObject max = ZERO_INTEGER;
            SubLObject cdolist_list_var = machine_table_specification;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                if (entry.first().numG(max)) {
                    max = entry.first();
                }
                if (last(entry, UNPROVIDED).first().numG(max)) {
                    max = last(entry, UNPROVIDED).first();
                }
            }
            return max;
        }
    }

    /**
     *
     *
     * @return integer; the maximal state used in MACHINE-TABLE-SPECIFICATION
     */
    @LispMethod(comment = "@return integer; the maximal state used in MACHINE-TABLE-SPECIFICATION")
    public static SubLObject max_state(final SubLObject machine_table_specification) {
        assert NIL != listp(machine_table_specification) : "! listp(machine_table_specification) " + ("Types.listp(machine_table_specification) " + "CommonSymbols.NIL != Types.listp(machine_table_specification) ") + machine_table_specification;
        SubLObject max = ZERO_INTEGER;
        SubLObject cdolist_list_var = machine_table_specification;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (entry.first().numG(max)) {
                max = entry.first();
            }
            if (last(entry, UNPROVIDED).first().numG(max)) {
                max = last(entry, UNPROVIDED).first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return max;
    }

    public static SubLObject declare_finite_state_transducer_file() {
        declareFunction("finite_state_transducer_print_function_trampoline", "FINITE-STATE-TRANSDUCER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("finite_state_transducer_p", "FINITE-STATE-TRANSDUCER-P", 1, 0, false);
        new finite_state_transducer.$finite_state_transducer_p$UnaryFunction();
        declareFunction("fst_initial_state", "FST-INITIAL-STATE", 1, 0, false);
        declareFunction("fst_final_states", "FST-FINAL-STATES", 1, 0, false);
        declareFunction("fst_machine_table", "FST-MACHINE-TABLE", 1, 0, false);
        declareFunction("fst_token_builder", "FST-TOKEN-BUILDER", 1, 0, false);
        declareFunction("fst_input", "FST-INPUT", 1, 0, false);
        declareFunction("fst_current_token_index", "FST-CURRENT-TOKEN-INDEX", 1, 0, false);
        declareFunction("fst_current_state", "FST-CURRENT-STATE", 1, 0, false);
        declareFunction("fst_memory", "FST-MEMORY", 1, 0, false);
        declareFunction("fst_indexed_output", "FST-INDEXED-OUTPUT", 1, 0, false);
        declareFunction("_csetf_fst_initial_state", "_CSETF-FST-INITIAL-STATE", 2, 0, false);
        declareFunction("_csetf_fst_final_states", "_CSETF-FST-FINAL-STATES", 2, 0, false);
        declareFunction("_csetf_fst_machine_table", "_CSETF-FST-MACHINE-TABLE", 2, 0, false);
        declareFunction("_csetf_fst_token_builder", "_CSETF-FST-TOKEN-BUILDER", 2, 0, false);
        declareFunction("_csetf_fst_input", "_CSETF-FST-INPUT", 2, 0, false);
        declareFunction("_csetf_fst_current_token_index", "_CSETF-FST-CURRENT-TOKEN-INDEX", 2, 0, false);
        declareFunction("_csetf_fst_current_state", "_CSETF-FST-CURRENT-STATE", 2, 0, false);
        declareFunction("_csetf_fst_memory", "_CSETF-FST-MEMORY", 2, 0, false);
        declareFunction("_csetf_fst_indexed_output", "_CSETF-FST-INDEXED-OUTPUT", 2, 0, false);
        declareFunction("make_finite_state_transducer", "MAKE-FINITE-STATE-TRANSDUCER", 0, 1, false);
        declareFunction("visit_defstruct_finite_state_transducer", "VISIT-DEFSTRUCT-FINITE-STATE-TRANSDUCER", 2, 0, false);
        declareFunction("visit_defstruct_object_finite_state_transducer_method", "VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-TRANSDUCER-METHOD", 2, 0, false);
        declareFunction("print_fst", "PRINT-FST", 1, 2, false);
        declareFunction("fst_output_start", "FST-OUTPUT-START", 1, 0, false);
        declareFunction("fst_output_end", "FST-OUTPUT-END", 1, 0, false);
        declareFunction("new_finite_state_transducer", "NEW-FINITE-STATE-TRANSDUCER", 3, 1, false);
        declareFunction("fst_output", "FST-OUTPUT", 1, 0, false);
        declareFunction("fst_match", "FST-MATCH", 2, 0, false);
        declareMacro("fst_do_match", "FST-DO-MATCH");
        declareFunction("fst_match_global", "FST-MATCH-GLOBAL", 2, 0, false);
        declareFunction("fst_initialize", "FST-INITIALIZE", 2, 0, false);
        declareFunction("fst_match_internal", "FST-MATCH-INTERNAL", 1, 0, false);
        declareFunction("fst_run", "FST-RUN", 1, 0, false);
        declareFunction("fst_current_token", "FST-CURRENT-TOKEN", 1, 0, false);
        declareFunction("fst_final_state_p", "FST-FINAL-STATE-P", 1, 0, false);
        declareFunction("fst_action_p", "FST-ACTION-P", 1, 0, false);
        declareFunction("fst_execute", "FST-EXECUTE", 2, 0, false);
        declareFunction("fst_emit", "FST-EMIT", 1, 0, false);
        declareFunction("fst_remember", "FST-REMEMBER", 1, 0, false);
        declareFunction("fst_backup", "FST-BACKUP", 1, 0, false);
        declareFunction("machine_table_set", "MACHINE-TABLE-SET", 5, 0, false);
        declareFunction("machine_table_get", "MACHINE-TABLE-GET", 3, 0, false);
        declareFunction("key_matches", "KEY-MATCHES", 2, 0, false);
        declareFunction("max_state", "MAX-STATE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_finite_state_transducer_file() {
        defconstant("*DTP-FINITE-STATE-TRANSDUCER*", FINITE_STATE_TRANSDUCER);
        return NIL;
    }

    public static SubLObject setup_finite_state_transducer_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_finite_state_transducer$.getGlobalValue(), symbol_function(FINITE_STATE_TRANSDUCER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FST_INITIAL_STATE, _CSETF_FST_INITIAL_STATE);
        def_csetf(FST_FINAL_STATES, _CSETF_FST_FINAL_STATES);
        def_csetf(FST_MACHINE_TABLE, _CSETF_FST_MACHINE_TABLE);
        def_csetf(FST_TOKEN_BUILDER, _CSETF_FST_TOKEN_BUILDER);
        def_csetf(FST_INPUT, _CSETF_FST_INPUT);
        def_csetf(FST_CURRENT_TOKEN_INDEX, _CSETF_FST_CURRENT_TOKEN_INDEX);
        def_csetf(FST_CURRENT_STATE, _CSETF_FST_CURRENT_STATE);
        def_csetf(FST_MEMORY, _CSETF_FST_MEMORY);
        def_csetf(FST_INDEXED_OUTPUT, _CSETF_FST_INDEXED_OUTPUT);
        identity(FINITE_STATE_TRANSDUCER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_finite_state_transducer$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_TRANSDUCER_METHOD));
        note_funcall_helper_function(PRINT_FST);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_finite_state_transducer_file();
    }

    @Override
    public void initializeVariables() {
        init_finite_state_transducer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_finite_state_transducer_file();
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("INITIAL-STATE"), makeSymbol("FINAL-STATES"), makeSymbol("MACHINE-TABLE"), makeSymbol("TOKEN-BUILDER"), makeSymbol("INPUT"), makeSymbol("CURRENT-TOKEN-INDEX"), makeSymbol("CURRENT-STATE"), makeSymbol("MEMORY"), makeSymbol("INDEXED-OUTPUT") });

    static {
    }

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("INITIAL-STATE"), makeKeyword("FINAL-STATES"), makeKeyword("MACHINE-TABLE"), makeKeyword("TOKEN-BUILDER"), makeKeyword("INPUT"), makeKeyword("CURRENT-TOKEN-INDEX"), makeKeyword("CURRENT-STATE"), makeKeyword("MEMORY"), makeKeyword("INDEXED-OUTPUT") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("FST-INITIAL-STATE"), makeSymbol("FST-FINAL-STATES"), makeSymbol("FST-MACHINE-TABLE"), makeSymbol("FST-TOKEN-BUILDER"), makeSymbol("FST-INPUT"), makeSymbol("FST-CURRENT-TOKEN-INDEX"), makeSymbol("FST-CURRENT-STATE"), makeSymbol("FST-MEMORY"), makeSymbol("FST-INDEXED-OUTPUT") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-FST-INITIAL-STATE"), makeSymbol("_CSETF-FST-FINAL-STATES"), makeSymbol("_CSETF-FST-MACHINE-TABLE"), makeSymbol("_CSETF-FST-TOKEN-BUILDER"), makeSymbol("_CSETF-FST-INPUT"), makeSymbol("_CSETF-FST-CURRENT-TOKEN-INDEX"), makeSymbol("_CSETF-FST-CURRENT-STATE"), makeSymbol("_CSETF-FST-MEMORY"), makeSymbol("_CSETF-FST-INDEXED-OUTPUT") });

    static private final SubLString $str_alt35$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt36$__FST___S_ = makeString("#<FST: ~S>");

    static private final SubLString $str_alt39$Invalid_final_states__a = makeString("Invalid final states ~a");

    static private final SubLList $list_alt44 = list(list(makeSymbol("MATCH"), makeSymbol("SEQUENCE"), makeSymbol("FST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final class $finite_state_transducer_p$UnaryFunction extends UnaryFunction {
        public $finite_state_transducer_p$UnaryFunction() {
            super(extractFunctionNamed("FINITE-STATE-TRANSDUCER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return finite_state_transducer_p(arg1);
        }
    }

    static private final SubLList $list_alt52 = list($EMIT, makeKeyword("REMEMBER"), makeKeyword("BACKUP"));

    static private final SubLString $str_alt56$Invalid_FST_command__a = makeString("Invalid FST command ~a");

    static private final SubLString $str_alt59$Invalid_FST_action_list__a = makeString("Invalid FST action list ~a");
}

/**
 * Total time: 125 ms
 */
