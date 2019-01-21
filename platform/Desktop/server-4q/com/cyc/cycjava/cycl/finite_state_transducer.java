package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class finite_state_transducer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.finite_state_transducer";
    public static final String myFingerPrint = "d0c68a9ff1dda9d757748fb4a5c9c46de202be54d6272fa7290991bbc3bd6b2b";
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLSymbol $dtp_finite_state_transducer$;
    private static final SubLSymbol $sym0$FINITE_STATE_TRANSDUCER;
    private static final SubLSymbol $sym1$FINITE_STATE_TRANSDUCER_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_FST;
    private static final SubLSymbol $sym7$FINITE_STATE_TRANSDUCER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$FST_INITIAL_STATE;
    private static final SubLSymbol $sym10$_CSETF_FST_INITIAL_STATE;
    private static final SubLSymbol $sym11$FST_FINAL_STATES;
    private static final SubLSymbol $sym12$_CSETF_FST_FINAL_STATES;
    private static final SubLSymbol $sym13$FST_MACHINE_TABLE;
    private static final SubLSymbol $sym14$_CSETF_FST_MACHINE_TABLE;
    private static final SubLSymbol $sym15$FST_TOKEN_BUILDER;
    private static final SubLSymbol $sym16$_CSETF_FST_TOKEN_BUILDER;
    private static final SubLSymbol $sym17$FST_INPUT;
    private static final SubLSymbol $sym18$_CSETF_FST_INPUT;
    private static final SubLSymbol $sym19$FST_CURRENT_TOKEN_INDEX;
    private static final SubLSymbol $sym20$_CSETF_FST_CURRENT_TOKEN_INDEX;
    private static final SubLSymbol $sym21$FST_CURRENT_STATE;
    private static final SubLSymbol $sym22$_CSETF_FST_CURRENT_STATE;
    private static final SubLSymbol $sym23$FST_MEMORY;
    private static final SubLSymbol $sym24$_CSETF_FST_MEMORY;
    private static final SubLSymbol $sym25$FST_INDEXED_OUTPUT;
    private static final SubLSymbol $sym26$_CSETF_FST_INDEXED_OUTPUT;
    private static final SubLSymbol $kw27$INITIAL_STATE;
    private static final SubLSymbol $kw28$FINAL_STATES;
    private static final SubLSymbol $kw29$MACHINE_TABLE;
    private static final SubLSymbol $kw30$TOKEN_BUILDER;
    private static final SubLSymbol $kw31$INPUT;
    private static final SubLSymbol $kw32$CURRENT_TOKEN_INDEX;
    private static final SubLSymbol $kw33$CURRENT_STATE;
    private static final SubLSymbol $kw34$MEMORY;
    private static final SubLSymbol $kw35$INDEXED_OUTPUT;
    private static final SubLString $str36$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw37$BEGIN;
    private static final SubLSymbol $sym38$MAKE_FINITE_STATE_TRANSDUCER;
    private static final SubLSymbol $kw39$SLOT;
    private static final SubLSymbol $kw40$END;
    private static final SubLSymbol $sym41$VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_TRANSDUCER_METHOD;
    private static final SubLString $str42$__FST___S_;
    private static final SubLSymbol $sym43$FST_OUTPUT;
    private static final SubLSymbol $sym44$INTEGERP;
    private static final SubLString $str45$Invalid_final_states__a;
    private static final SubLSymbol $sym46$LISTP;
    private static final SubLSymbol $sym47$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym48$CAR;
    private static final SubLSymbol $sym49$SEQUENCEP;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$PROGN;
    private static final SubLSymbol $sym52$FST_INITIALIZE;
    private static final SubLSymbol $sym53$CDO;
    private static final SubLSymbol $sym54$FST_MATCH_INTERNAL;
    private static final SubLSymbol $sym55$NULL;
    private static final SubLSymbol $sym56$VECTOR;
    private static final SubLList $list57;
    private static final SubLSymbol $kw58$EMIT;
    private static final SubLSymbol $kw59$REMEMBER;
    private static final SubLSymbol $kw60$BACKUP;
    private static final SubLString $str61$Invalid_FST_command__a;
    private static final SubLSymbol $sym62$VECTORP;
    private static final SubLSymbol $sym63$FST_ACTION_P;
    private static final SubLString $str64$Invalid_FST_action_list__a;
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject finite_state_transducer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fst(v_object, stream, (SubLObject)finite_state_transducer.ZERO_INTEGER);
        return (SubLObject)finite_state_transducer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject finite_state_transducer_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $finite_state_transducer_native.class) ? finite_state_transducer.T : finite_state_transducer.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject fst_initial_state(final SubLObject v_object) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject fst_final_states(final SubLObject v_object) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject fst_machine_table(final SubLObject v_object) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject fst_token_builder(final SubLObject v_object) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject fst_input(final SubLObject v_object) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject fst_current_token_index(final SubLObject v_object) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject fst_current_state(final SubLObject v_object) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject fst_memory(final SubLObject v_object) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject fst_indexed_output(final SubLObject v_object) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject _csetf_fst_initial_state(final SubLObject v_object, final SubLObject value) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject _csetf_fst_final_states(final SubLObject v_object, final SubLObject value) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject _csetf_fst_machine_table(final SubLObject v_object, final SubLObject value) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject _csetf_fst_token_builder(final SubLObject v_object, final SubLObject value) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject _csetf_fst_input(final SubLObject v_object, final SubLObject value) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject _csetf_fst_current_token_index(final SubLObject v_object, final SubLObject value) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject _csetf_fst_current_state(final SubLObject v_object, final SubLObject value) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject _csetf_fst_memory(final SubLObject v_object, final SubLObject value) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject _csetf_fst_indexed_output(final SubLObject v_object, final SubLObject value) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject make_finite_state_transducer(SubLObject arglist) {
        if (arglist == finite_state_transducer.UNPROVIDED) {
            arglist = (SubLObject)finite_state_transducer.NIL;
        }
        final SubLObject v_new = (SubLObject)new $finite_state_transducer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)finite_state_transducer.NIL, next = arglist; finite_state_transducer.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)finite_state_transducer.$kw27$INITIAL_STATE)) {
                _csetf_fst_initial_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)finite_state_transducer.$kw28$FINAL_STATES)) {
                _csetf_fst_final_states(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)finite_state_transducer.$kw29$MACHINE_TABLE)) {
                _csetf_fst_machine_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)finite_state_transducer.$kw30$TOKEN_BUILDER)) {
                _csetf_fst_token_builder(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)finite_state_transducer.$kw31$INPUT)) {
                _csetf_fst_input(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)finite_state_transducer.$kw32$CURRENT_TOKEN_INDEX)) {
                _csetf_fst_current_token_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)finite_state_transducer.$kw33$CURRENT_STATE)) {
                _csetf_fst_current_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)finite_state_transducer.$kw34$MEMORY)) {
                _csetf_fst_memory(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)finite_state_transducer.$kw35$INDEXED_OUTPUT)) {
                _csetf_fst_indexed_output(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)finite_state_transducer.$str36$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject visit_defstruct_finite_state_transducer(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw37$BEGIN, (SubLObject)finite_state_transducer.$sym38$MAKE_FINITE_STATE_TRANSDUCER, (SubLObject)finite_state_transducer.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw39$SLOT, (SubLObject)finite_state_transducer.$kw27$INITIAL_STATE, fst_initial_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw39$SLOT, (SubLObject)finite_state_transducer.$kw28$FINAL_STATES, fst_final_states(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw39$SLOT, (SubLObject)finite_state_transducer.$kw29$MACHINE_TABLE, fst_machine_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw39$SLOT, (SubLObject)finite_state_transducer.$kw30$TOKEN_BUILDER, fst_token_builder(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw39$SLOT, (SubLObject)finite_state_transducer.$kw31$INPUT, fst_input(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw39$SLOT, (SubLObject)finite_state_transducer.$kw32$CURRENT_TOKEN_INDEX, fst_current_token_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw39$SLOT, (SubLObject)finite_state_transducer.$kw33$CURRENT_STATE, fst_current_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw39$SLOT, (SubLObject)finite_state_transducer.$kw34$MEMORY, fst_memory(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw39$SLOT, (SubLObject)finite_state_transducer.$kw35$INDEXED_OUTPUT, fst_indexed_output(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)finite_state_transducer.$kw40$END, (SubLObject)finite_state_transducer.$sym38$MAKE_FINITE_STATE_TRANSDUCER, (SubLObject)finite_state_transducer.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 2654L)
    public static SubLObject visit_defstruct_object_finite_state_transducer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_finite_state_transducer(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 3319L)
    public static SubLObject print_fst(final SubLObject fst, SubLObject stream, SubLObject depth) {
        if (stream == finite_state_transducer.UNPROVIDED) {
            stream = (SubLObject)finite_state_transducer.NIL;
        }
        if (depth == finite_state_transducer.UNPROVIDED) {
            depth = (SubLObject)finite_state_transducer.NIL;
        }
        PrintLow.format(stream, (SubLObject)finite_state_transducer.$str42$__FST___S_, fst_token_builder(fst));
        return (SubLObject)finite_state_transducer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 3530L)
    public static SubLObject fst_output_start(final SubLObject fst) {
        return fst_indexed_output(fst).first().rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 3733L)
    public static SubLObject fst_output_end(final SubLObject fst) {
        return conses_high.last(fst_indexed_output(fst), (SubLObject)finite_state_transducer.UNPROVIDED).first().rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 3937L)
    public static SubLObject new_finite_state_transducer(final SubLObject initial_state, final SubLObject final_states, final SubLObject state_table_list, SubLObject token_builder) {
        if (token_builder == finite_state_transducer.UNPROVIDED) {
            token_builder = (SubLObject)finite_state_transducer.$sym43$FST_OUTPUT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert finite_state_transducer.NIL != Types.integerp(initial_state) : initial_state;
        if (finite_state_transducer.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && finite_state_transducer.NIL != list_utilities.find_if_not((SubLObject)finite_state_transducer.$sym44$INTEGERP, final_states, (SubLObject)finite_state_transducer.UNPROVIDED, (SubLObject)finite_state_transducer.UNPROVIDED, (SubLObject)finite_state_transducer.UNPROVIDED)) {
            Errors.error((SubLObject)finite_state_transducer.$str45$Invalid_final_states__a, final_states);
        }
        assert finite_state_transducer.NIL != Types.listp(state_table_list) : state_table_list;
        assert finite_state_transducer.NIL != Types.function_spec_p(token_builder) : token_builder;
        final SubLObject fst = make_finite_state_transducer((SubLObject)finite_state_transducer.UNPROVIDED);
        final SubLObject machine_table = Vectors.make_vector(Numbers.add(max_state(state_table_list), (SubLObject)finite_state_transducer.ONE_INTEGER), (SubLObject)finite_state_transducer.UNPROVIDED);
        SubLObject cdolist_list_var = Sequences.reverse(state_table_list);
        SubLObject quadruple = (SubLObject)finite_state_transducer.NIL;
        quadruple = cdolist_list_var.first();
        while (finite_state_transducer.NIL != cdolist_list_var) {
            machine_table_set(machine_table, quadruple.first(), conses_high.second(quadruple), conses_high.third(quadruple), conses_high.fourth(quadruple));
            cdolist_list_var = cdolist_list_var.rest();
            quadruple = cdolist_list_var.first();
        }
        _csetf_fst_initial_state(fst, initial_state);
        _csetf_fst_final_states(fst, final_states);
        _csetf_fst_machine_table(fst, machine_table);
        _csetf_fst_token_builder(fst, token_builder);
        return fst;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 5549L)
    public static SubLObject fst_output(final SubLObject fst) {
        return Mapping.mapcar((SubLObject)finite_state_transducer.$sym48$CAR, fst_indexed_output(fst));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 5720L)
    public static SubLObject fst_match(final SubLObject fst, final SubLObject sequence) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(fst) : fst;
        assert finite_state_transducer.NIL != Types.sequencep(sequence) : sequence;
        fst_initialize(fst, sequence);
        fst_run(fst);
        return (SubLObject)((finite_state_transducer.NIL != fst_final_state_p(fst)) ? Functions.funcall(fst_token_builder(fst), fst) : finite_state_transducer.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 6234L)
    public static SubLObject fst_do_match(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)finite_state_transducer.$list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject match = (SubLObject)finite_state_transducer.NIL;
        SubLObject sequence = (SubLObject)finite_state_transducer.NIL;
        SubLObject fst = (SubLObject)finite_state_transducer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)finite_state_transducer.$list50);
        match = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)finite_state_transducer.$list50);
        sequence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)finite_state_transducer.$list50);
        fst = current.first();
        current = current.rest();
        if (finite_state_transducer.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)finite_state_transducer.$sym51$PROGN, (SubLObject)ConsesLow.list((SubLObject)finite_state_transducer.$sym52$FST_INITIALIZE, fst, sequence), (SubLObject)ConsesLow.listS((SubLObject)finite_state_transducer.$sym53$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(match, (SubLObject)ConsesLow.list((SubLObject)finite_state_transducer.$sym54$FST_MATCH_INTERNAL, fst), (SubLObject)ConsesLow.list((SubLObject)finite_state_transducer.$sym54$FST_MATCH_INTERNAL, fst))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)finite_state_transducer.$sym55$NULL, match)), ConsesLow.append(body, (SubLObject)finite_state_transducer.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)finite_state_transducer.$list50);
        return (SubLObject)finite_state_transducer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 6541L)
    public static SubLObject fst_match_global(final SubLObject fst, final SubLObject sequence) {
        assert finite_state_transducer.NIL != finite_state_transducer_p(fst) : fst;
        assert finite_state_transducer.NIL != Types.sequencep(sequence) : sequence;
        SubLObject matches = (SubLObject)finite_state_transducer.NIL;
        fst_initialize(fst, sequence);
        SubLObject match;
        for (match = (SubLObject)finite_state_transducer.NIL, match = fst_match_internal(fst); finite_state_transducer.NIL != match; match = fst_match_internal(fst)) {
            matches = (SubLObject)ConsesLow.cons(match, matches);
        }
        return list_utilities.list2vector(Sequences.nreverse(matches));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 6994L)
    public static SubLObject fst_initialize(final SubLObject fst, final SubLObject sequence) {
        _csetf_fst_input(fst, sequence.isList() ? Functions.apply((SubLObject)finite_state_transducer.$sym56$VECTOR, sequence) : sequence);
        _csetf_fst_current_token_index(fst, (SubLObject)finite_state_transducer.ZERO_INTEGER);
        _csetf_fst_current_state(fst, fst_initial_state(fst));
        _csetf_fst_indexed_output(fst, (SubLObject)finite_state_transducer.NIL);
        return fst;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 7529L)
    public static SubLObject fst_match_internal(final SubLObject fst) {
        _csetf_fst_current_state(fst, fst_initial_state(fst));
        _csetf_fst_indexed_output(fst, (SubLObject)finite_state_transducer.NIL);
        fst_run(fst);
        return (SubLObject)((finite_state_transducer.NIL != fst_final_state_p(fst)) ? Functions.funcall(fst_token_builder(fst), fst) : finite_state_transducer.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 8057L)
    public static SubLObject fst_run(final SubLObject fst) {
        final SubLObject length = Sequences.length(fst_input(fst));
        SubLObject machine_table_value = (SubLObject)finite_state_transducer.NIL;
        while (!fst_current_token_index(fst).numGE(length) && finite_state_transducer.NIL != fst_current_state(fst) && finite_state_transducer.NIL == fst_final_state_p(fst)) {
            machine_table_value = machine_table_get(fst_machine_table(fst), fst_current_state(fst), fst_current_token(fst));
            SubLObject cdolist_list_var = machine_table_value.first();
            SubLObject action = (SubLObject)finite_state_transducer.NIL;
            action = cdolist_list_var.first();
            while (finite_state_transducer.NIL != cdolist_list_var) {
                fst_execute(fst, action);
                cdolist_list_var = cdolist_list_var.rest();
                action = cdolist_list_var.first();
            }
            _csetf_fst_current_state(fst, machine_table_value.rest());
            _csetf_fst_current_token_index(fst, Numbers.add(fst_current_token_index(fst), (SubLObject)finite_state_transducer.ONE_INTEGER));
        }
        if (finite_state_transducer.NIL != fst_current_state(fst) && fst_current_token_index(fst).eql(length)) {
            machine_table_value = machine_table_get(fst_machine_table(fst), fst_current_state(fst), (SubLObject)finite_state_transducer.$kw40$END);
            if (finite_state_transducer.NIL != machine_table_value) {
                SubLObject cdolist_list_var = machine_table_value.first();
                SubLObject action = (SubLObject)finite_state_transducer.NIL;
                action = cdolist_list_var.first();
                while (finite_state_transducer.NIL != cdolist_list_var) {
                    fst_execute(fst, action);
                    cdolist_list_var = cdolist_list_var.rest();
                    action = cdolist_list_var.first();
                }
                _csetf_fst_current_state(fst, machine_table_value.rest());
                _csetf_fst_current_token_index(fst, Numbers.add(fst_current_token_index(fst), (SubLObject)finite_state_transducer.ONE_INTEGER));
            }
        }
        _csetf_fst_indexed_output(fst, Sequences.nreverse(fst_indexed_output(fst)));
        return fst;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 10031L)
    public static SubLObject fst_current_token(final SubLObject fst) {
        return Vectors.aref(fst_input(fst), fst_current_token_index(fst));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 10224L)
    public static SubLObject fst_final_state_p(final SubLObject fst) {
        return conses_high.member(fst_current_state(fst), fst_final_states(fst), (SubLObject)finite_state_transducer.EQL, (SubLObject)finite_state_transducer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 10454L)
    public static SubLObject fst_action_p(final SubLObject v_object) {
        return conses_high.member(v_object, (SubLObject)finite_state_transducer.$list57, (SubLObject)finite_state_transducer.UNPROVIDED, (SubLObject)finite_state_transducer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 10620L)
    public static SubLObject fst_execute(final SubLObject fst, final SubLObject command) {
        if (command.eql((SubLObject)finite_state_transducer.$kw58$EMIT)) {
            return fst_emit(fst);
        }
        if (command.eql((SubLObject)finite_state_transducer.$kw59$REMEMBER)) {
            return fst_remember(fst);
        }
        if (command.eql((SubLObject)finite_state_transducer.$kw60$BACKUP)) {
            return fst_backup(fst);
        }
        Errors.error((SubLObject)finite_state_transducer.$str61$Invalid_FST_command__a, command);
        return (SubLObject)finite_state_transducer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 11146L)
    public static SubLObject fst_emit(final SubLObject fst) {
        final SubLObject token = fst_current_token(fst);
        final SubLObject modified_token = (token.isInteger() && finite_state_transducer.NIL != unicode_strings.ascii_char_code_p(token)) ? Characters.code_char(token) : (token.isInteger() ? unicode_strings.utf8_vector_to_utf8_string(unicode_strings.to_utf8_vector(token)) : token);
        _csetf_fst_indexed_output(fst, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(modified_token, fst_current_token_index(fst)), fst_indexed_output(fst)));
        return fst;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 11687L)
    public static SubLObject fst_remember(final SubLObject fst) {
        _csetf_fst_memory(fst, Numbers.subtract(fst_current_token_index(fst), (SubLObject)finite_state_transducer.ONE_INTEGER));
        return fst;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 11973L)
    public static SubLObject fst_backup(final SubLObject fst) {
        _csetf_fst_current_token_index(fst, fst_memory(fst));
        return fst;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 12253L)
    public static SubLObject machine_table_set(final SubLObject table, final SubLObject start_state, final SubLObject label, final SubLObject actions, final SubLObject end_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert finite_state_transducer.NIL != Types.vectorp(table) : table;
        assert finite_state_transducer.NIL != Types.integerp(start_state) : start_state;
        if (finite_state_transducer.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && finite_state_transducer.NIL != list_utilities.find_if_not((SubLObject)finite_state_transducer.$sym63$FST_ACTION_P, actions, (SubLObject)finite_state_transducer.UNPROVIDED, (SubLObject)finite_state_transducer.UNPROVIDED, (SubLObject)finite_state_transducer.UNPROVIDED)) {
            Errors.error((SubLObject)finite_state_transducer.$str64$Invalid_FST_action_list__a, actions);
        }
        assert finite_state_transducer.NIL != Types.listp(actions) : actions;
        assert finite_state_transducer.NIL != Types.integerp(end_state) : end_state;
        Vectors.set_aref(table, start_state, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(label, (SubLObject)ConsesLow.cons(actions, end_state)), Vectors.aref(table, start_state)));
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 13052L)
    public static SubLObject machine_table_get(final SubLObject table, final SubLObject start_state, final SubLObject item) {
        SubLObject action_table;
        SubLObject label_value_pair;
        for (action_table = Vectors.aref(table, start_state), label_value_pair = action_table.first(); finite_state_transducer.NIL != label_value_pair && finite_state_transducer.NIL == key_matches(label_value_pair.first(), item); label_value_pair = action_table.first()) {
            action_table = action_table.rest();
        }
        return label_value_pair.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 13684L)
    public static SubLObject key_matches(final SubLObject label, SubLObject item) {
        if (item.isInteger() && finite_state_transducer.NIL != unicode_strings.ascii_char_code_p(item)) {
            item = Characters.code_char(item);
        }
        return (finite_state_transducer.NIL != item && label.isFunction() && !item.eql((SubLObject)finite_state_transducer.$kw40$END)) ? Functions.funcall(label, item) : Equality.equalp(label, item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/finite-state-transducer.lisp", position = 14226L)
    public static SubLObject max_state(final SubLObject machine_table_specification) {
        assert finite_state_transducer.NIL != Types.listp(machine_table_specification) : machine_table_specification;
        SubLObject max = (SubLObject)finite_state_transducer.ZERO_INTEGER;
        SubLObject cdolist_list_var = machine_table_specification;
        SubLObject entry = (SubLObject)finite_state_transducer.NIL;
        entry = cdolist_list_var.first();
        while (finite_state_transducer.NIL != cdolist_list_var) {
            if (entry.first().numG(max)) {
                max = entry.first();
            }
            if (conses_high.last(entry, (SubLObject)finite_state_transducer.UNPROVIDED).first().numG(max)) {
                max = conses_high.last(entry, (SubLObject)finite_state_transducer.UNPROVIDED).first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return max;
    }
    
    public static SubLObject declare_finite_state_transducer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "finite_state_transducer_print_function_trampoline", "FINITE-STATE-TRANSDUCER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "finite_state_transducer_p", "FINITE-STATE-TRANSDUCER-P", 1, 0, false);
        new $finite_state_transducer_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_initial_state", "FST-INITIAL-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_final_states", "FST-FINAL-STATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_machine_table", "FST-MACHINE-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_token_builder", "FST-TOKEN-BUILDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_input", "FST-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_current_token_index", "FST-CURRENT-TOKEN-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_current_state", "FST-CURRENT-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_memory", "FST-MEMORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_indexed_output", "FST-INDEXED-OUTPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "_csetf_fst_initial_state", "_CSETF-FST-INITIAL-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "_csetf_fst_final_states", "_CSETF-FST-FINAL-STATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "_csetf_fst_machine_table", "_CSETF-FST-MACHINE-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "_csetf_fst_token_builder", "_CSETF-FST-TOKEN-BUILDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "_csetf_fst_input", "_CSETF-FST-INPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "_csetf_fst_current_token_index", "_CSETF-FST-CURRENT-TOKEN-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "_csetf_fst_current_state", "_CSETF-FST-CURRENT-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "_csetf_fst_memory", "_CSETF-FST-MEMORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "_csetf_fst_indexed_output", "_CSETF-FST-INDEXED-OUTPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "make_finite_state_transducer", "MAKE-FINITE-STATE-TRANSDUCER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "visit_defstruct_finite_state_transducer", "VISIT-DEFSTRUCT-FINITE-STATE-TRANSDUCER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "visit_defstruct_object_finite_state_transducer_method", "VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-TRANSDUCER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "print_fst", "PRINT-FST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_output_start", "FST-OUTPUT-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_output_end", "FST-OUTPUT-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "new_finite_state_transducer", "NEW-FINITE-STATE-TRANSDUCER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_output", "FST-OUTPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_match", "FST-MATCH", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.finite_state_transducer", "fst_do_match", "FST-DO-MATCH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_match_global", "FST-MATCH-GLOBAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_initialize", "FST-INITIALIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_match_internal", "FST-MATCH-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_run", "FST-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_current_token", "FST-CURRENT-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_final_state_p", "FST-FINAL-STATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_action_p", "FST-ACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_execute", "FST-EXECUTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_emit", "FST-EMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_remember", "FST-REMEMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "fst_backup", "FST-BACKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "machine_table_set", "MACHINE-TABLE-SET", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "machine_table_get", "MACHINE-TABLE-GET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "key_matches", "KEY-MATCHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.finite_state_transducer", "max_state", "MAX-STATE", 1, 0, false);
        return (SubLObject)finite_state_transducer.NIL;
    }
    
    public static SubLObject init_finite_state_transducer_file() {
        finite_state_transducer.$dtp_finite_state_transducer$ = SubLFiles.defconstant("*DTP-FINITE-STATE-TRANSDUCER*", (SubLObject)finite_state_transducer.$sym0$FINITE_STATE_TRANSDUCER);
        return (SubLObject)finite_state_transducer.NIL;
    }
    
    public static SubLObject setup_finite_state_transducer_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), finite_state_transducer.$dtp_finite_state_transducer$.getGlobalValue(), Symbols.symbol_function((SubLObject)finite_state_transducer.$sym7$FINITE_STATE_TRANSDUCER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)finite_state_transducer.$list8);
        Structures.def_csetf((SubLObject)finite_state_transducer.$sym9$FST_INITIAL_STATE, (SubLObject)finite_state_transducer.$sym10$_CSETF_FST_INITIAL_STATE);
        Structures.def_csetf((SubLObject)finite_state_transducer.$sym11$FST_FINAL_STATES, (SubLObject)finite_state_transducer.$sym12$_CSETF_FST_FINAL_STATES);
        Structures.def_csetf((SubLObject)finite_state_transducer.$sym13$FST_MACHINE_TABLE, (SubLObject)finite_state_transducer.$sym14$_CSETF_FST_MACHINE_TABLE);
        Structures.def_csetf((SubLObject)finite_state_transducer.$sym15$FST_TOKEN_BUILDER, (SubLObject)finite_state_transducer.$sym16$_CSETF_FST_TOKEN_BUILDER);
        Structures.def_csetf((SubLObject)finite_state_transducer.$sym17$FST_INPUT, (SubLObject)finite_state_transducer.$sym18$_CSETF_FST_INPUT);
        Structures.def_csetf((SubLObject)finite_state_transducer.$sym19$FST_CURRENT_TOKEN_INDEX, (SubLObject)finite_state_transducer.$sym20$_CSETF_FST_CURRENT_TOKEN_INDEX);
        Structures.def_csetf((SubLObject)finite_state_transducer.$sym21$FST_CURRENT_STATE, (SubLObject)finite_state_transducer.$sym22$_CSETF_FST_CURRENT_STATE);
        Structures.def_csetf((SubLObject)finite_state_transducer.$sym23$FST_MEMORY, (SubLObject)finite_state_transducer.$sym24$_CSETF_FST_MEMORY);
        Structures.def_csetf((SubLObject)finite_state_transducer.$sym25$FST_INDEXED_OUTPUT, (SubLObject)finite_state_transducer.$sym26$_CSETF_FST_INDEXED_OUTPUT);
        Equality.identity((SubLObject)finite_state_transducer.$sym0$FINITE_STATE_TRANSDUCER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), finite_state_transducer.$dtp_finite_state_transducer$.getGlobalValue(), Symbols.symbol_function((SubLObject)finite_state_transducer.$sym41$VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_TRANSDUCER_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)finite_state_transducer.$sym6$PRINT_FST);
        return (SubLObject)finite_state_transducer.NIL;
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
    
    static {
        me = (SubLFile)new finite_state_transducer();
        finite_state_transducer.$dtp_finite_state_transducer$ = null;
        $sym0$FINITE_STATE_TRANSDUCER = SubLObjectFactory.makeSymbol("FINITE-STATE-TRANSDUCER");
        $sym1$FINITE_STATE_TRANSDUCER_P = SubLObjectFactory.makeSymbol("FINITE-STATE-TRANSDUCER-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INITIAL-STATE"), SubLObjectFactory.makeSymbol("FINAL-STATES"), SubLObjectFactory.makeSymbol("MACHINE-TABLE"), SubLObjectFactory.makeSymbol("TOKEN-BUILDER"), SubLObjectFactory.makeSymbol("INPUT"), SubLObjectFactory.makeSymbol("CURRENT-TOKEN-INDEX"), SubLObjectFactory.makeSymbol("CURRENT-STATE"), SubLObjectFactory.makeSymbol("MEMORY"), SubLObjectFactory.makeSymbol("INDEXED-OUTPUT") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INITIAL-STATE"), SubLObjectFactory.makeKeyword("FINAL-STATES"), SubLObjectFactory.makeKeyword("MACHINE-TABLE"), SubLObjectFactory.makeKeyword("TOKEN-BUILDER"), SubLObjectFactory.makeKeyword("INPUT"), SubLObjectFactory.makeKeyword("CURRENT-TOKEN-INDEX"), SubLObjectFactory.makeKeyword("CURRENT-STATE"), SubLObjectFactory.makeKeyword("MEMORY"), SubLObjectFactory.makeKeyword("INDEXED-OUTPUT") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FST-INITIAL-STATE"), SubLObjectFactory.makeSymbol("FST-FINAL-STATES"), SubLObjectFactory.makeSymbol("FST-MACHINE-TABLE"), SubLObjectFactory.makeSymbol("FST-TOKEN-BUILDER"), SubLObjectFactory.makeSymbol("FST-INPUT"), SubLObjectFactory.makeSymbol("FST-CURRENT-TOKEN-INDEX"), SubLObjectFactory.makeSymbol("FST-CURRENT-STATE"), SubLObjectFactory.makeSymbol("FST-MEMORY"), SubLObjectFactory.makeSymbol("FST-INDEXED-OUTPUT") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-FST-INITIAL-STATE"), SubLObjectFactory.makeSymbol("_CSETF-FST-FINAL-STATES"), SubLObjectFactory.makeSymbol("_CSETF-FST-MACHINE-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-FST-TOKEN-BUILDER"), SubLObjectFactory.makeSymbol("_CSETF-FST-INPUT"), SubLObjectFactory.makeSymbol("_CSETF-FST-CURRENT-TOKEN-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-FST-CURRENT-STATE"), SubLObjectFactory.makeSymbol("_CSETF-FST-MEMORY"), SubLObjectFactory.makeSymbol("_CSETF-FST-INDEXED-OUTPUT") });
        $sym6$PRINT_FST = SubLObjectFactory.makeSymbol("PRINT-FST");
        $sym7$FINITE_STATE_TRANSDUCER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FINITE-STATE-TRANSDUCER-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FINITE-STATE-TRANSDUCER-P"));
        $sym9$FST_INITIAL_STATE = SubLObjectFactory.makeSymbol("FST-INITIAL-STATE");
        $sym10$_CSETF_FST_INITIAL_STATE = SubLObjectFactory.makeSymbol("_CSETF-FST-INITIAL-STATE");
        $sym11$FST_FINAL_STATES = SubLObjectFactory.makeSymbol("FST-FINAL-STATES");
        $sym12$_CSETF_FST_FINAL_STATES = SubLObjectFactory.makeSymbol("_CSETF-FST-FINAL-STATES");
        $sym13$FST_MACHINE_TABLE = SubLObjectFactory.makeSymbol("FST-MACHINE-TABLE");
        $sym14$_CSETF_FST_MACHINE_TABLE = SubLObjectFactory.makeSymbol("_CSETF-FST-MACHINE-TABLE");
        $sym15$FST_TOKEN_BUILDER = SubLObjectFactory.makeSymbol("FST-TOKEN-BUILDER");
        $sym16$_CSETF_FST_TOKEN_BUILDER = SubLObjectFactory.makeSymbol("_CSETF-FST-TOKEN-BUILDER");
        $sym17$FST_INPUT = SubLObjectFactory.makeSymbol("FST-INPUT");
        $sym18$_CSETF_FST_INPUT = SubLObjectFactory.makeSymbol("_CSETF-FST-INPUT");
        $sym19$FST_CURRENT_TOKEN_INDEX = SubLObjectFactory.makeSymbol("FST-CURRENT-TOKEN-INDEX");
        $sym20$_CSETF_FST_CURRENT_TOKEN_INDEX = SubLObjectFactory.makeSymbol("_CSETF-FST-CURRENT-TOKEN-INDEX");
        $sym21$FST_CURRENT_STATE = SubLObjectFactory.makeSymbol("FST-CURRENT-STATE");
        $sym22$_CSETF_FST_CURRENT_STATE = SubLObjectFactory.makeSymbol("_CSETF-FST-CURRENT-STATE");
        $sym23$FST_MEMORY = SubLObjectFactory.makeSymbol("FST-MEMORY");
        $sym24$_CSETF_FST_MEMORY = SubLObjectFactory.makeSymbol("_CSETF-FST-MEMORY");
        $sym25$FST_INDEXED_OUTPUT = SubLObjectFactory.makeSymbol("FST-INDEXED-OUTPUT");
        $sym26$_CSETF_FST_INDEXED_OUTPUT = SubLObjectFactory.makeSymbol("_CSETF-FST-INDEXED-OUTPUT");
        $kw27$INITIAL_STATE = SubLObjectFactory.makeKeyword("INITIAL-STATE");
        $kw28$FINAL_STATES = SubLObjectFactory.makeKeyword("FINAL-STATES");
        $kw29$MACHINE_TABLE = SubLObjectFactory.makeKeyword("MACHINE-TABLE");
        $kw30$TOKEN_BUILDER = SubLObjectFactory.makeKeyword("TOKEN-BUILDER");
        $kw31$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw32$CURRENT_TOKEN_INDEX = SubLObjectFactory.makeKeyword("CURRENT-TOKEN-INDEX");
        $kw33$CURRENT_STATE = SubLObjectFactory.makeKeyword("CURRENT-STATE");
        $kw34$MEMORY = SubLObjectFactory.makeKeyword("MEMORY");
        $kw35$INDEXED_OUTPUT = SubLObjectFactory.makeKeyword("INDEXED-OUTPUT");
        $str36$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw37$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym38$MAKE_FINITE_STATE_TRANSDUCER = SubLObjectFactory.makeSymbol("MAKE-FINITE-STATE-TRANSDUCER");
        $kw39$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw40$END = SubLObjectFactory.makeKeyword("END");
        $sym41$VISIT_DEFSTRUCT_OBJECT_FINITE_STATE_TRANSDUCER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FINITE-STATE-TRANSDUCER-METHOD");
        $str42$__FST___S_ = SubLObjectFactory.makeString("#<FST: ~S>");
        $sym43$FST_OUTPUT = SubLObjectFactory.makeSymbol("FST-OUTPUT");
        $sym44$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str45$Invalid_final_states__a = SubLObjectFactory.makeString("Invalid final states ~a");
        $sym46$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym47$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym48$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym49$SEQUENCEP = SubLObjectFactory.makeSymbol("SEQUENCEP");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MATCH"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)SubLObjectFactory.makeSymbol("FST")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym51$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym52$FST_INITIALIZE = SubLObjectFactory.makeSymbol("FST-INITIALIZE");
        $sym53$CDO = SubLObjectFactory.makeSymbol("CDO");
        $sym54$FST_MATCH_INTERNAL = SubLObjectFactory.makeSymbol("FST-MATCH-INTERNAL");
        $sym55$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym56$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT"), (SubLObject)SubLObjectFactory.makeKeyword("REMEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("BACKUP"));
        $kw58$EMIT = SubLObjectFactory.makeKeyword("EMIT");
        $kw59$REMEMBER = SubLObjectFactory.makeKeyword("REMEMBER");
        $kw60$BACKUP = SubLObjectFactory.makeKeyword("BACKUP");
        $str61$Invalid_FST_command__a = SubLObjectFactory.makeString("Invalid FST command ~a");
        $sym62$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $sym63$FST_ACTION_P = SubLObjectFactory.makeSymbol("FST-ACTION-P");
        $str64$Invalid_FST_action_list__a = SubLObjectFactory.makeString("Invalid FST action list ~a");
    }
    
    public static final class $finite_state_transducer_native extends SubLStructNative
    {
        public SubLObject $initial_state;
        public SubLObject $final_states;
        public SubLObject $machine_table;
        public SubLObject $token_builder;
        public SubLObject $input;
        public SubLObject $current_token_index;
        public SubLObject $current_state;
        public SubLObject $memory;
        public SubLObject $indexed_output;
        private static final SubLStructDeclNative structDecl;
        
        public $finite_state_transducer_native() {
            this.$initial_state = (SubLObject)CommonSymbols.NIL;
            this.$final_states = (SubLObject)CommonSymbols.NIL;
            this.$machine_table = (SubLObject)CommonSymbols.NIL;
            this.$token_builder = (SubLObject)CommonSymbols.NIL;
            this.$input = (SubLObject)CommonSymbols.NIL;
            this.$current_token_index = (SubLObject)CommonSymbols.NIL;
            this.$current_state = (SubLObject)CommonSymbols.NIL;
            this.$memory = (SubLObject)CommonSymbols.NIL;
            this.$indexed_output = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$finite_state_transducer_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$initial_state;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$final_states;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$machine_table;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$token_builder;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$input;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$current_token_index;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$current_state;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$memory;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$indexed_output;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$initial_state = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$final_states = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$machine_table = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$token_builder = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$input = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$current_token_index = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$current_state = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$memory = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$indexed_output = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$finite_state_transducer_native.class, finite_state_transducer.$sym0$FINITE_STATE_TRANSDUCER, finite_state_transducer.$sym1$FINITE_STATE_TRANSDUCER_P, finite_state_transducer.$list2, finite_state_transducer.$list3, new String[] { "$initial_state", "$final_states", "$machine_table", "$token_builder", "$input", "$current_token_index", "$current_state", "$memory", "$indexed_output" }, finite_state_transducer.$list4, finite_state_transducer.$list5, finite_state_transducer.$sym6$PRINT_FST);
        }
    }
    
    public static final class $finite_state_transducer_p$UnaryFunction extends UnaryFunction
    {
        public $finite_state_transducer_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FINITE-STATE-TRANSDUCER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return finite_state_transducer.finite_state_transducer_p(arg1);
        }
    }
}

/*

	Total time: 125 ms
	
*/