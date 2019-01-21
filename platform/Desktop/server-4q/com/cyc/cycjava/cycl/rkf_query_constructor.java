package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_query_constructor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_query_constructor";
    public static final String myFingerPrint = "863de7e9932e18a59f0b7e615948cc9434d55ec0bfb6ff8f52c186a4c6898881";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 759L)
    private static SubLSymbol $qc_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1598L)
    private static SubLSymbol $qc_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1723L)
    private static SubLSymbol $qc_index$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLSymbol $dtp_qc_query$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLSymbol $dtp_qc_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15737L)
    public static SubLSymbol $rkf_add_object_var_map_entry_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15951L)
    public static SubLSymbol $rkf_rem_object_var_map_method_table$;
    private static final SubLString $str0$Query_Constructor_Lock;
    private static final SubLSymbol $sym1$WITH_LOCK_HELD;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$_QC_ISG_;
    private static final SubLSymbol $sym4$_QC_INDEX_;
    private static final SubLSymbol $sym5$QC_QUERY;
    private static final SubLSymbol $sym6$QC_QUERY_P;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym12$QC_QUERY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$QC_QUERY_ID;
    private static final SubLSymbol $sym15$_CSETF_QC_QUERY_ID;
    private static final SubLSymbol $sym16$QC_QUERY_CYCL;
    private static final SubLSymbol $sym17$_CSETF_QC_QUERY_CYCL;
    private static final SubLSymbol $sym18$QC_QUERY_TERMS;
    private static final SubLSymbol $sym19$_CSETF_QC_QUERY_TERMS;
    private static final SubLSymbol $sym20$QC_QUERY_RETURN_TERMS;
    private static final SubLSymbol $sym21$_CSETF_QC_QUERY_RETURN_TERMS;
    private static final SubLSymbol $sym22$QC_QUERY_CONSTRAINTS;
    private static final SubLSymbol $sym23$_CSETF_QC_QUERY_CONSTRAINTS;
    private static final SubLSymbol $sym24$QC_QUERY_VAR_MAP;
    private static final SubLSymbol $sym25$_CSETF_QC_QUERY_VAR_MAP;
    private static final SubLSymbol $sym26$QC_QUERY_SCENARIO;
    private static final SubLSymbol $sym27$_CSETF_QC_QUERY_SCENARIO;
    private static final SubLSymbol $sym28$QC_QUERY_ASSUMED_TERMS;
    private static final SubLSymbol $sym29$_CSETF_QC_QUERY_ASSUMED_TERMS;
    private static final SubLSymbol $sym30$QC_QUERY_ASSUMED_CONSTRAINTS;
    private static final SubLSymbol $sym31$_CSETF_QC_QUERY_ASSUMED_CONSTRAINTS;
    private static final SubLSymbol $kw32$ID;
    private static final SubLSymbol $kw33$CYCL;
    private static final SubLSymbol $kw34$TERMS;
    private static final SubLSymbol $kw35$RETURN_TERMS;
    private static final SubLSymbol $kw36$CONSTRAINTS;
    private static final SubLSymbol $kw37$VAR_MAP;
    private static final SubLSymbol $kw38$SCENARIO;
    private static final SubLSymbol $kw39$ASSUMED_TERMS;
    private static final SubLSymbol $kw40$ASSUMED_CONSTRAINTS;
    private static final SubLString $str41$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw42$BEGIN;
    private static final SubLSymbol $sym43$MAKE_QC_QUERY;
    private static final SubLSymbol $kw44$SLOT;
    private static final SubLSymbol $kw45$END;
    private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_QC_QUERY_METHOD;
    private static final SubLSymbol $sym47$EL_FORMULA_P;
    private static final SubLSymbol $sym48$LISTP;
    private static final SubLSymbol $sym49$SM_INDEXICAL_RECORD_P;
    private static final SubLSymbol $sym50$SM_SCENARIO_P;
    private static final SubLSymbol $sym51$SM_CONSTRAINT_RECORD_P;
    private static final SubLSymbol $sym52$QC_STATE;
    private static final SubLSymbol $sym53$QC_STATE_P;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$QC_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$QC_STATE_ID;
    private static final SubLSymbol $sym61$_CSETF_QC_STATE_ID;
    private static final SubLSymbol $sym62$QC_STATE_TEXT;
    private static final SubLSymbol $sym63$_CSETF_QC_STATE_TEXT;
    private static final SubLSymbol $sym64$QC_STATE_CANDIDATES;
    private static final SubLSymbol $sym65$_CSETF_QC_STATE_CANDIDATES;
    private static final SubLSymbol $sym66$QC_STATE_QUERY;
    private static final SubLSymbol $sym67$_CSETF_QC_STATE_QUERY;
    private static final SubLSymbol $sym68$QC_STATE_INTERACTION;
    private static final SubLSymbol $sym69$_CSETF_QC_STATE_INTERACTION;
    private static final SubLSymbol $sym70$QC_STATE_PARSING_MT;
    private static final SubLSymbol $sym71$_CSETF_QC_STATE_PARSING_MT;
    private static final SubLSymbol $sym72$QC_STATE_GENERATION_MT;
    private static final SubLSymbol $sym73$_CSETF_QC_STATE_GENERATION_MT;
    private static final SubLSymbol $sym74$QC_STATE_DOMAIN_MT;
    private static final SubLSymbol $sym75$_CSETF_QC_STATE_DOMAIN_MT;
    private static final SubLSymbol $sym76$QC_STATE_DOMAIN_INTERACTION_MT;
    private static final SubLSymbol $sym77$_CSETF_QC_STATE_DOMAIN_INTERACTION_MT;
    private static final SubLSymbol $kw78$TEXT;
    private static final SubLSymbol $kw79$CANDIDATES;
    private static final SubLSymbol $kw80$QUERY;
    private static final SubLSymbol $kw81$INTERACTION;
    private static final SubLSymbol $kw82$PARSING_MT;
    private static final SubLSymbol $kw83$GENERATION_MT;
    private static final SubLSymbol $kw84$DOMAIN_MT;
    private static final SubLSymbol $kw85$DOMAIN_INTERACTION_MT;
    private static final SubLSymbol $sym86$MAKE_QC_STATE;
    private static final SubLSymbol $sym87$VISIT_DEFSTRUCT_OBJECT_QC_STATE_METHOD;
    private static final SubLSymbol $sym88$STRINGP;
    private static final SubLSymbol $sym89$USER_INTERACTION_P;
    private static final SubLSymbol $sym90$HLMT_P;
    private static final SubLInteger $int91$256;
    private static final SubLSymbol $sym92$RKF_ADD_OBJECT_VAR_MAP_ENTRY_QC_QUERY_METHOD;
    private static final SubLSymbol $sym93$RKF_REM_OBJECT_VAR_MAP_QC_QUERY_METHOD;
    private static final SubLString $str94$_;
    private static final SubLString $str95$_;
    private static final SubLString $str96$function;
    private static final SubLString $str97$_A;
    private static final SubLSymbol $sym98$SM_CONSTRAINT_RECORD_SENTENCE;
    private static final SubLObject $const99$isa;
    private static final SubLObject $const100$genls;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$SM_INDEXICAL_P;
    private static final SubLSymbol $sym103$SM_INDEXICAL_RECORD_INDEXICAL;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 965L)
    public static SubLObject with_qc_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_query_constructor.$sym1$WITH_LOCK_HELD, (SubLObject)rkf_query_constructor.$list2, ConsesLow.append(body, (SubLObject)rkf_query_constructor.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1059L)
    public static SubLObject qc_find_query_by_id(final SubLObject id) {
        return qc_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1224L)
    public static SubLObject qc_find_query_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
        final SubLObject query = qc_find_query_by_id(id);
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1373L)
    public static SubLObject qc_find_state_by_id(final SubLObject id) {
        return qc_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1449L)
    public static SubLObject qc_find_state_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
        final SubLObject state = qc_find_state_by_id(id);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1820L)
    public static SubLObject qc_next_id() {
        return integer_sequence_generator.integer_sequence_generator_next(rkf_query_constructor.$qc_isg$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 1927L)
    public static SubLObject qc_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter(rkf_query_constructor.$qc_index$.getGlobalValue(), id, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2070L)
    public static SubLObject qc_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove(rkf_query_constructor.$qc_index$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2200L)
    public static SubLObject qc_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup(rkf_query_constructor.$qc_index$.getGlobalValue(), id, (SubLObject)rkf_query_constructor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_query_constructor.ZERO_INTEGER);
        return (SubLObject)rkf_query_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $qc_query_native.class) ? rkf_query_constructor.T : rkf_query_constructor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_id(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_cycl(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_terms(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_return_terms(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_constraints(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_var_map(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_scenario(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_assumed_terms(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject qc_query_assumed_constraints(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject _csetf_qc_query_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject _csetf_qc_query_cycl(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject _csetf_qc_query_terms(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject _csetf_qc_query_return_terms(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject _csetf_qc_query_constraints(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject _csetf_qc_query_var_map(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject _csetf_qc_query_scenario(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject _csetf_qc_query_assumed_terms(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject _csetf_qc_query_assumed_constraints(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_query_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject make_qc_query(SubLObject arglist) {
        if (arglist == rkf_query_constructor.UNPROVIDED) {
            arglist = (SubLObject)rkf_query_constructor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $qc_query_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_query_constructor.NIL, next = arglist; rkf_query_constructor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw32$ID)) {
                _csetf_qc_query_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw33$CYCL)) {
                _csetf_qc_query_cycl(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw34$TERMS)) {
                _csetf_qc_query_terms(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw35$RETURN_TERMS)) {
                _csetf_qc_query_return_terms(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw36$CONSTRAINTS)) {
                _csetf_qc_query_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw37$VAR_MAP)) {
                _csetf_qc_query_var_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw38$SCENARIO)) {
                _csetf_qc_query_scenario(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw39$ASSUMED_TERMS)) {
                _csetf_qc_query_assumed_terms(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw40$ASSUMED_CONSTRAINTS)) {
                _csetf_qc_query_assumed_constraints(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_query_constructor.$str41$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject visit_defstruct_qc_query(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw42$BEGIN, (SubLObject)rkf_query_constructor.$sym43$MAKE_QC_QUERY, (SubLObject)rkf_query_constructor.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw32$ID, qc_query_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw33$CYCL, qc_query_cycl(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw34$TERMS, qc_query_terms(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw35$RETURN_TERMS, qc_query_return_terms(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw36$CONSTRAINTS, qc_query_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw37$VAR_MAP, qc_query_var_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw38$SCENARIO, qc_query_scenario(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw39$ASSUMED_TERMS, qc_query_assumed_terms(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw40$ASSUMED_CONSTRAINTS, qc_query_assumed_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw45$END, (SubLObject)rkf_query_constructor.$sym43$MAKE_QC_QUERY, (SubLObject)rkf_query_constructor.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2286L)
    public static SubLObject visit_defstruct_object_qc_query_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_qc_query(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 2970L)
    public static SubLObject qc_new_query() {
        final SubLObject query = make_qc_query((SubLObject)rkf_query_constructor.UNPROVIDED);
        final SubLObject id = qc_next_id();
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_id(query, id);
            qc_add_object(id, query);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 3163L)
    public static SubLObject qc_cleanup_query(final SubLObject query) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        final SubLObject id = qc_query_id(query);
        final SubLObject success = qc_rem_object(id);
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 3368L)
    public static SubLObject qc_set_query_cycl(final SubLObject query, final SubLObject cycl) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != el_utilities.el_formula_p(cycl) : cycl;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_cycl(query, cycl);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 3552L)
    public static SubLObject qc_set_query_terms(final SubLObject query, final SubLObject indexical_records) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != Types.listp(indexical_records) : indexical_records;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_terms(query, indexical_records);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 3770L)
    public static SubLObject qc_add_query_return_term(final SubLObject query, final SubLObject indexical_record) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            if (rkf_query_constructor.NIL == conses_high.member(indexical_record, qc_query_return_terms(query), Symbols.symbol_function((SubLObject)rkf_query_constructor.EQL), Symbols.symbol_function((SubLObject)rkf_query_constructor.IDENTITY))) {
                _csetf_qc_query_return_terms(query, (SubLObject)ConsesLow.cons(indexical_record, qc_query_return_terms(query)));
            }
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 4017L)
    public static SubLObject qc_rem_query_return_term(final SubLObject query, final SubLObject indexical_record) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_return_terms(query, Sequences.remove(indexical_record, qc_query_return_terms(query), (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED));
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 4305L)
    public static SubLObject qc_set_query_return_terms(final SubLObject query, final SubLObject indexical_records) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != Types.listp(indexical_records) : indexical_records;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_return_terms(query, indexical_records);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 4537L)
    public static SubLObject qc_set_query_constraints(final SubLObject query, final SubLObject constraint_records) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != Types.listp(constraint_records) : constraint_records;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_constraints(query, constraint_records);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 4770L)
    public static SubLObject qc_add_query_var_map_entry(final SubLObject query, final SubLObject entry) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != Types.listp(entry) : entry;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            if (rkf_query_constructor.NIL == conses_high.member(entry, qc_query_var_map(query), Symbols.symbol_function((SubLObject)rkf_query_constructor.EQL), Symbols.symbol_function((SubLObject)rkf_query_constructor.IDENTITY))) {
                _csetf_qc_query_var_map(query, (SubLObject)ConsesLow.cons(entry, qc_query_var_map(query)));
            }
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 4966L)
    public static SubLObject qc_rem_query_var_map(final SubLObject query) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_var_map(query, (SubLObject)rkf_query_constructor.NIL);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 5118L)
    public static SubLObject qc_set_query_scenario(final SubLObject query, final SubLObject v_scenario) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : v_scenario;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_scenario(query, v_scenario);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 5323L)
    public static SubLObject qc_add_query_assumed_term(final SubLObject query, final SubLObject indexical_record) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            if (rkf_query_constructor.NIL == conses_high.member(indexical_record, qc_query_assumed_terms(query), Symbols.symbol_function((SubLObject)rkf_query_constructor.EQL), Symbols.symbol_function((SubLObject)rkf_query_constructor.IDENTITY))) {
                _csetf_qc_query_assumed_terms(query, (SubLObject)ConsesLow.cons(indexical_record, qc_query_assumed_terms(query)));
            }
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 5572L)
    public static SubLObject qc_rem_query_assumed_term(final SubLObject query, final SubLObject indexical_record) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != rkf_scenario_manipulator.sm_indexical_record_p(indexical_record) : indexical_record;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_assumed_terms(query, Sequences.remove(indexical_record, qc_query_assumed_terms(query), (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED));
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 5863L)
    public static SubLObject qc_set_query_assumed_terms(final SubLObject query, final SubLObject indexical_records) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != Types.listp(indexical_records) : indexical_records;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_assumed_terms(query, indexical_records);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6097L)
    public static SubLObject qc_add_query_assumed_constraint(final SubLObject query, final SubLObject constraint_record) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) : constraint_record;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            if (rkf_query_constructor.NIL == conses_high.member(constraint_record, qc_query_assumed_constraints(query), Symbols.symbol_function((SubLObject)rkf_query_constructor.EQL), Symbols.symbol_function((SubLObject)rkf_query_constructor.IDENTITY))) {
                _csetf_qc_query_assumed_constraints(query, (SubLObject)ConsesLow.cons(constraint_record, qc_query_assumed_constraints(query)));
            }
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6362L)
    public static SubLObject qc_rem_query_assumed_constraint(final SubLObject query, final SubLObject constraint_record) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint_record) : constraint_record;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_assumed_constraints(query, Sequences.remove(constraint_record, qc_query_assumed_constraints(query), (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED));
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6675L)
    public static SubLObject qc_set_query_assumed_constraints(final SubLObject query, final SubLObject constraint_records) {
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        assert rkf_query_constructor.NIL != Types.listp(constraint_records) : constraint_records;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_query_assumed_constraints(query, constraint_records);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_query_constructor.ZERO_INTEGER);
        return (SubLObject)rkf_query_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $qc_state_native.class) ? rkf_query_constructor.T : rkf_query_constructor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_id(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_text(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_candidates(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_query(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_interaction(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_parsing_mt(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_generation_mt(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_domain_mt(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject qc_state_domain_interaction_mt(final SubLObject v_object) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject _csetf_qc_state_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject _csetf_qc_state_text(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject _csetf_qc_state_candidates(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject _csetf_qc_state_query(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject _csetf_qc_state_interaction(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject _csetf_qc_state_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject _csetf_qc_state_generation_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject _csetf_qc_state_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject _csetf_qc_state_domain_interaction_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_query_constructor.NIL != qc_state_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject make_qc_state(SubLObject arglist) {
        if (arglist == rkf_query_constructor.UNPROVIDED) {
            arglist = (SubLObject)rkf_query_constructor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $qc_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_query_constructor.NIL, next = arglist; rkf_query_constructor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw32$ID)) {
                _csetf_qc_state_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw78$TEXT)) {
                _csetf_qc_state_text(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw79$CANDIDATES)) {
                _csetf_qc_state_candidates(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw80$QUERY)) {
                _csetf_qc_state_query(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw81$INTERACTION)) {
                _csetf_qc_state_interaction(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw82$PARSING_MT)) {
                _csetf_qc_state_parsing_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw83$GENERATION_MT)) {
                _csetf_qc_state_generation_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw84$DOMAIN_MT)) {
                _csetf_qc_state_domain_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_query_constructor.$kw85$DOMAIN_INTERACTION_MT)) {
                _csetf_qc_state_domain_interaction_mt(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_query_constructor.$str41$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject visit_defstruct_qc_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw42$BEGIN, (SubLObject)rkf_query_constructor.$sym86$MAKE_QC_STATE, (SubLObject)rkf_query_constructor.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw32$ID, qc_state_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw78$TEXT, qc_state_text(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw79$CANDIDATES, qc_state_candidates(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw80$QUERY, qc_state_query(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw81$INTERACTION, qc_state_interaction(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw82$PARSING_MT, qc_state_parsing_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw83$GENERATION_MT, qc_state_generation_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw84$DOMAIN_MT, qc_state_domain_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw44$SLOT, (SubLObject)rkf_query_constructor.$kw85$DOMAIN_INTERACTION_MT, qc_state_domain_interaction_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_query_constructor.$kw45$END, (SubLObject)rkf_query_constructor.$sym86$MAKE_QC_STATE, (SubLObject)rkf_query_constructor.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 6924L)
    public static SubLObject visit_defstruct_object_qc_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_qc_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 7242L)
    public static SubLObject qc_new_state() {
        final SubLObject state = make_qc_state((SubLObject)rkf_query_constructor.UNPROVIDED);
        final SubLObject id = qc_next_id();
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_state_id(state, id);
            qc_add_object(id, state);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 7436L)
    public static SubLObject qc_cleanup_state(final SubLObject state) {
        assert rkf_query_constructor.NIL != qc_state_p(state) : state;
        final SubLObject id = qc_state_id(state);
        final SubLObject success = qc_rem_object(id);
        SubLObject cdolist_list_var = qc_state_candidates(state);
        SubLObject candidate = (SubLObject)rkf_query_constructor.NIL;
        candidate = cdolist_list_var.first();
        while (rkf_query_constructor.NIL != cdolist_list_var) {
            qc_cleanup_query(candidate);
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        qc_cleanup_query(qc_state_query(state));
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 7775L)
    public static SubLObject qc_set_state_text(final SubLObject state, final SubLObject text) {
        assert rkf_query_constructor.NIL != qc_state_p(state) : state;
        assert rkf_query_constructor.NIL != Types.stringp(text) : text;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_state_text(state, text);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 7954L)
    public static SubLObject qc_set_state_candidates(final SubLObject state, final SubLObject candidates) {
        assert rkf_query_constructor.NIL != qc_state_p(state) : state;
        assert rkf_query_constructor.NIL != Types.listp(candidates) : candidates;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_state_candidates(state, candidates);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 8161L)
    public static SubLObject qc_set_state_query(final SubLObject state, final SubLObject query) {
        assert rkf_query_constructor.NIL != qc_state_p(state) : state;
        assert rkf_query_constructor.NIL != qc_query_p(query) : query;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_state_query(state, query);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 8349L)
    public static SubLObject qc_set_state_interaction(final SubLObject state, final SubLObject interaction) {
        assert rkf_query_constructor.NIL != qc_state_p(state) : state;
        assert rkf_query_constructor.NIL != user_interaction_agenda.user_interaction_p(interaction) : interaction;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_state_interaction(state, interaction);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 8575L)
    public static SubLObject qc_set_state_parsing_mt(final SubLObject state, final SubLObject parsing_mt) {
        assert rkf_query_constructor.NIL != qc_state_p(state) : state;
        assert rkf_query_constructor.NIL != hlmt.hlmt_p(parsing_mt) : parsing_mt;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_state_parsing_mt(state, parsing_mt);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 8784L)
    public static SubLObject qc_set_state_generation_mt(final SubLObject state, final SubLObject generation_mt) {
        assert rkf_query_constructor.NIL != qc_state_p(state) : state;
        assert rkf_query_constructor.NIL != hlmt.hlmt_p(generation_mt) : generation_mt;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_state_generation_mt(state, generation_mt);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 9008L)
    public static SubLObject qc_set_state_domain_mt(final SubLObject state, final SubLObject domain_mt) {
        assert rkf_query_constructor.NIL != qc_state_p(state) : state;
        assert rkf_query_constructor.NIL != hlmt.hlmt_p(domain_mt) : domain_mt;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_state_domain_mt(state, domain_mt);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 9212L)
    public static SubLObject qc_set_state_domain_interaction_mt(final SubLObject state, final SubLObject domain_interaction_mt) {
        assert rkf_query_constructor.NIL != qc_state_p(state) : state;
        assert rkf_query_constructor.NIL != hlmt.hlmt_p(domain_interaction_mt) : domain_interaction_mt;
        SubLObject release = (SubLObject)rkf_query_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            _csetf_qc_state_domain_interaction_mt(state, domain_interaction_mt);
        }
        finally {
            if (rkf_query_constructor.NIL != release) {
                Locks.release_lock(rkf_query_constructor.$qc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 9476L)
    public static SubLObject qc_assumable_constraint_p(final SubLObject state, final SubLObject constraint_record) {
        return (SubLObject)rkf_query_constructor.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 10318L)
    public static SubLObject qc_act_new_state() {
        final SubLObject state = qc_new_state();
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 10586L)
    public static SubLObject qc_act_new_state_with_text(final SubLObject text) {
        final SubLObject state = qc_act_new_state();
        qc_set_state_text(state, text);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 10726L)
    public static SubLObject qc_act_note_state_interaction(final SubLObject state, final SubLObject interaction) {
        qc_set_state_interaction(state, interaction);
        qc_act_initialize_state_context(state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 10896L)
    public static SubLObject qc_act_note_state_query(final SubLObject state, final SubLObject query) {
        qc_set_state_query(state, query);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 11000L)
    public static SubLObject qc_act_initialize_state_context(final SubLObject state) {
        if (rkf_query_constructor.NIL != user_interaction_agenda.user_interaction_p(qc_state_interaction(state))) {
            final SubLObject v_agenda = user_interaction_agenda.ui_agenda(qc_state_interaction(state));
            qc_set_state_parsing_mt(state, user_interaction_agenda.uia_parsing_interaction_mt(v_agenda));
            qc_set_state_generation_mt(state, user_interaction_agenda.uia_generation_interaction_mt(v_agenda, (SubLObject)rkf_query_constructor.UNPROVIDED));
            qc_set_state_domain_mt(state, user_interaction_agenda.uia_domain_mt(v_agenda));
            qc_set_state_domain_interaction_mt(state, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 11584L)
    public static SubLObject qc_act_candidate_scenario_expressions(final SubLObject state, final SubLObject text) {
        final SubLObject parsing_mt = qc_state_parsing_mt(state);
        final SubLObject domain_interaction_mt = qc_state_domain_interaction_mt(state);
        final SubLObject candidates = rkf_scenario_manipulator.sm_extract_candidate_scenario_expressions(text, parsing_mt, domain_interaction_mt);
        return candidates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 12114L)
    public static SubLObject qc_act_initialize_scenario_from_expression(final SubLObject state, final SubLObject scenario_expression) {
        final SubLObject text = qc_state_text(state);
        final SubLObject interaction = qc_state_interaction(state);
        final SubLObject v_agenda = (SubLObject)((rkf_query_constructor.NIL != user_interaction_agenda.user_interaction_p(interaction)) ? user_interaction_agenda.ui_agenda(interaction) : rkf_query_constructor.NIL);
        final SubLObject scenario_interaction_mt = (rkf_query_constructor.NIL != v_agenda) ? user_interaction_agenda.uia_ensure_scenario_interaction_mt(v_agenda) : rkf_scenario_constructor.sc_storage_mt();
        final SubLObject parsing_mt = qc_state_parsing_mt(state);
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_expression(scenario_expression, text, scenario_interaction_mt, parsing_mt);
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 12805L)
    public static SubLObject qc_act_initialize_query_from_scenario(final SubLObject state, final SubLObject v_scenario) {
        SubLObject query = qc_state_query(state);
        final SubLObject assumed_constraints = (SubLObject)((rkf_query_constructor.NIL != query) ? qc_query_assumed_constraints(query) : rkf_query_constructor.NIL);
        if (rkf_query_constructor.NIL == qc_query_p(query)) {
            query = qc_new_query();
        }
        qc_set_query_scenario(query, v_scenario);
        final SubLObject new_terms = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        final SubLObject new_return_terms = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        qc_set_query_terms(query, new_terms);
        qc_set_query_return_terms(query, new_return_terms);
        final SubLObject new_constraints = rkf_scenario_manipulator.sm_scenario_constraints(v_scenario);
        SubLObject cdolist_list_var = assumed_constraints;
        SubLObject assumed_constraint = (SubLObject)rkf_query_constructor.NIL;
        assumed_constraint = cdolist_list_var.first();
        while (rkf_query_constructor.NIL != cdolist_list_var) {
            if (rkf_query_constructor.NIL == subl_promotions.memberP(assumed_constraint, new_constraints, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED)) {
                qc_act_deregister_assumed_constraint(state, assumed_constraint);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assumed_constraint = cdolist_list_var.first();
        }
        qc_set_query_constraints(query, new_constraints);
        qc_compute_and_record_variables(query);
        qc_compute_and_record_query_cycl(query);
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 13841L)
    public static SubLObject qc_compute_and_record_variables(final SubLObject query) {
        final SubLObject query_terms = qc_query_terms(query);
        final SubLObject assumed_terms = qc_query_assumed_terms(query);
        final SubLObject variable_terms = conses_high.set_difference(query_terms, assumed_terms, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
        return rkf_compute_and_record_variables(query, variable_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 14138L)
    public static SubLObject qc_compute_set_difference(final SubLObject piece_a, final SubLObject piece_b) {
        return conses_high.set_difference(piece_a, piece_b, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 14243L)
    public static SubLObject qc_compute_and_record_query_cycl(final SubLObject query) {
        final SubLObject constraints = qc_query_constraints(query);
        final SubLObject assumed_constraints = qc_query_assumed_constraints(query);
        final SubLObject query_constraints = qc_compute_set_difference(constraints, assumed_constraints);
        final SubLObject all_terms = qc_query_terms(query);
        final SubLObject assumed_terms = qc_query_assumed_terms(query);
        final SubLObject existential_terms = conses_high.set_difference(conses_high.set_difference(all_terms, qc_query_return_terms(query), (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED), assumed_terms, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
        final SubLObject variable_terms = all_terms;
        final SubLObject cycl = rkf_compute_cycl_from_parts(query_constraints, variable_terms, existential_terms, assumed_constraints, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
        qc_set_query_cycl(query, cycl);
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15177L)
    public static SubLObject rkf_compute_and_record_variables(final SubLObject v_object, final SubLObject indexical_records) {
        rkf_rem_object_var_map(v_object);
        SubLObject cdolist_list_var = indexical_records;
        SubLObject indexical_record = (SubLObject)rkf_query_constructor.NIL;
        indexical_record = cdolist_list_var.first();
        while (rkf_query_constructor.NIL != cdolist_list_var) {
            final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record);
            final SubLObject base = rkf_scenario_manipulator.sm_indexical_record_preferred_phrase(indexical_record);
            final SubLObject variable = rkf_make_el_var(indexical, base);
            rkf_scenario_manipulator.sm_act_set_indexical_record_var(indexical_record, variable);
            rkf_add_object_var_map_entry(v_object, (SubLObject)ConsesLow.list(variable, indexical_record));
            cdolist_list_var = cdolist_list_var.rest();
            indexical_record = cdolist_list_var.first();
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15737L)
    public static SubLObject rkf_add_object_var_map_entry(final SubLObject v_object, final SubLObject item) {
        final SubLObject method_function = Structures.method_func(v_object, rkf_query_constructor.$rkf_add_object_var_map_entry_method_table$.getGlobalValue());
        if (rkf_query_constructor.NIL != method_function) {
            return Functions.funcall(method_function, v_object, item);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15829L)
    public static SubLObject rkf_add_object_var_map_entry_qc_query_method(final SubLObject v_object, final SubLObject item) {
        return qc_add_query_var_map_entry(v_object, item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 15951L)
    public static SubLObject rkf_rem_object_var_map(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, rkf_query_constructor.$rkf_rem_object_var_map_method_table$.getGlobalValue());
        if (rkf_query_constructor.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 16016L)
    public static SubLObject rkf_rem_object_var_map_qc_query_method(final SubLObject v_object) {
        return qc_rem_query_var_map(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 16114L)
    public static SubLObject rkf_make_el_var(final SubLObject indexical, SubLObject base) {
        if (base == rkf_query_constructor.UNPROVIDED) {
            base = (SubLObject)rkf_query_constructor.NIL;
        }
        final SubLObject type = rkf_scenario_manipulator.sm_indexical_type(indexical);
        final SubLObject number = rkf_scenario_manipulator.sm_indexical_number(indexical);
        SubLObject basis = (SubLObject)rkf_query_constructor.NIL;
        if (base.isString()) {
            basis = string_utilities.string_substitute((SubLObject)rkf_query_constructor.$str94$_, (SubLObject)rkf_query_constructor.$str95$_, base, (SubLObject)rkf_query_constructor.UNPROVIDED);
            return cycl_variables.make_el_var(basis);
        }
        if (rkf_query_constructor.NIL != constant_handles.constant_p(type)) {
            basis = constants_high.constant_name(type);
        }
        else if (rkf_query_constructor.NIL != nart_handles.nart_p(type)) {
            basis = (SubLObject)((rkf_query_constructor.NIL != constant_handles.constant_p(cycl_utilities.nat_arg0(type))) ? constants_high.constant_name(cycl_utilities.nat_arg0(type)) : rkf_query_constructor.$str96$function);
        }
        return cycl_variables.make_el_var(Sequences.cconcatenate(basis, new SubLObject[] { rkf_query_constructor.$str94$_, PrintLow.format((SubLObject)rkf_query_constructor.NIL, (SubLObject)rkf_query_constructor.$str97$_A, number) }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 16727L)
    public static SubLObject rkf_compute_cycl_from_parts(final SubLObject query_constraints, final SubLObject variable_terms, SubLObject existential_terms, SubLObject assumed_constraints, SubLObject insert_explicit_typesP, SubLObject mt) {
        if (existential_terms == rkf_query_constructor.UNPROVIDED) {
            existential_terms = (SubLObject)rkf_query_constructor.NIL;
        }
        if (assumed_constraints == rkf_query_constructor.UNPROVIDED) {
            assumed_constraints = (SubLObject)rkf_query_constructor.NIL;
        }
        if (insert_explicit_typesP == rkf_query_constructor.UNPROVIDED) {
            insert_explicit_typesP = (SubLObject)rkf_query_constructor.NIL;
        }
        if (mt == rkf_query_constructor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLObject sentence_list = rkf_compute_cycl_from_terms_and_constraints(query_constraints, variable_terms, insert_explicit_typesP, mt);
        SubLObject cycl = rkf_sentence_from_conjuncts(sentence_list);
        final SubLObject assumed_sentences = (SubLObject)((rkf_query_constructor.NIL != assumed_constraints) ? Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym98$SM_CONSTRAINT_RECORD_SENTENCE), assumed_constraints) : rkf_query_constructor.NIL);
        SubLObject assumed_cycl = (SubLObject)((rkf_query_constructor.NIL != assumed_sentences) ? rkf_sentence_from_conjuncts(assumed_sentences) : rkf_query_constructor.NIL);
        SubLObject cdolist_list_var = variable_terms;
        SubLObject variable_term = (SubLObject)rkf_query_constructor.NIL;
        variable_term = cdolist_list_var.first();
        while (rkf_query_constructor.NIL != cdolist_list_var) {
            final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(variable_term);
            final SubLObject el_var = rkf_scenario_manipulator.sm_indexical_record_var(variable_term);
            if (rkf_query_constructor.NIL != subl_promotions.memberP(variable_term, existential_terms, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED)) {
                cycl = el_utilities.make_existential(indexical, cycl);
            }
            if (rkf_query_constructor.NIL != el_var) {
                cycl = cycl_utilities.expression_subst(el_var, indexical, cycl, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
                assumed_cycl = cycl_utilities.expression_subst(el_var, indexical, assumed_cycl, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable_term = cdolist_list_var.first();
        }
        if (rkf_query_constructor.NIL != assumed_cycl) {
            cycl = el_utilities.make_implication(assumed_cycl, cycl);
        }
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 18378L)
    public static SubLObject rkf_sentence_from_conjuncts(final SubLObject conjuncts) {
        return (rkf_query_constructor.NIL != list_utilities.singletonP(conjuncts)) ? conjuncts.first() : el_utilities.make_conjunction(conjuncts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 18530L)
    public static SubLObject rkf_compute_cycl_from_terms_and_constraints(final SubLObject query_constraints, final SubLObject variable_terms, final SubLObject insert_explicit_typesP, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject base_sentences = Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym98$SM_CONSTRAINT_RECORD_SENTENCE), query_constraints);
        SubLObject additional_sentences = (SubLObject)rkf_query_constructor.NIL;
        if (rkf_query_constructor.NIL != insert_explicit_typesP) {
            SubLObject cdolist_list_var = variable_terms;
            SubLObject variable_term = (SubLObject)rkf_query_constructor.NIL;
            variable_term = cdolist_list_var.first();
            while (rkf_query_constructor.NIL != cdolist_list_var) {
                final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(variable_term);
                thread.resetMultipleValues();
                final SubLObject isas = rkf_scenario_manipulator.sm_term_requires_types_in_relations(indexical, base_sentences, mt);
                final SubLObject v_genls = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (rkf_query_constructor.NIL != isas) {
                    SubLObject cdolist_list_var_$1 = rkf_scenario_manipulator.sm_indexical_record_explicit_isas(variable_term);
                    SubLObject v_isa = (SubLObject)rkf_query_constructor.NIL;
                    v_isa = cdolist_list_var_$1.first();
                    while (rkf_query_constructor.NIL != cdolist_list_var_$1) {
                        final SubLObject tight_constraints = genls.min_cols((SubLObject)ConsesLow.cons(v_isa, conses_high.copy_list(isas)), mt, (SubLObject)rkf_query_constructor.UNPROVIDED);
                        if (rkf_query_constructor.NIL != subl_promotions.memberP(v_isa, tight_constraints, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED)) {
                            SubLObject cdolist_list_var_$2 = tight_constraints;
                            SubLObject constraint = (SubLObject)rkf_query_constructor.NIL;
                            constraint = cdolist_list_var_$2.first();
                            while (rkf_query_constructor.NIL != cdolist_list_var_$2) {
                                final SubLObject item_var = el_utilities.make_binary_formula(rkf_query_constructor.$const99$isa, indexical, constraint);
                                if (rkf_query_constructor.NIL == conses_high.member(item_var, additional_sentences, (SubLObject)rkf_query_constructor.EQUAL, Symbols.symbol_function((SubLObject)rkf_query_constructor.IDENTITY))) {
                                    additional_sentences = (SubLObject)ConsesLow.cons(item_var, additional_sentences);
                                }
                                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                constraint = cdolist_list_var_$2.first();
                            }
                        }
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        v_isa = cdolist_list_var_$1.first();
                    }
                }
                if (rkf_query_constructor.NIL != v_genls) {
                    SubLObject cdolist_list_var_$3 = rkf_scenario_manipulator.sm_indexical_record_explicit_genls(variable_term);
                    SubLObject genl = (SubLObject)rkf_query_constructor.NIL;
                    genl = cdolist_list_var_$3.first();
                    while (rkf_query_constructor.NIL != cdolist_list_var_$3) {
                        final SubLObject tight_constraints = genls.min_cols((SubLObject)ConsesLow.cons(genl, conses_high.copy_list(v_genls)), mt, (SubLObject)rkf_query_constructor.UNPROVIDED);
                        if (rkf_query_constructor.NIL != subl_promotions.memberP(genl, tight_constraints, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED)) {
                            SubLObject cdolist_list_var_$4 = tight_constraints;
                            SubLObject constraint = (SubLObject)rkf_query_constructor.NIL;
                            constraint = cdolist_list_var_$4.first();
                            while (rkf_query_constructor.NIL != cdolist_list_var_$4) {
                                final SubLObject item_var = el_utilities.make_binary_formula(rkf_query_constructor.$const100$genls, indexical, constraint);
                                if (rkf_query_constructor.NIL == conses_high.member(item_var, additional_sentences, (SubLObject)rkf_query_constructor.EQUAL, Symbols.symbol_function((SubLObject)rkf_query_constructor.IDENTITY))) {
                                    additional_sentences = (SubLObject)ConsesLow.cons(item_var, additional_sentences);
                                }
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                constraint = cdolist_list_var_$4.first();
                            }
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        genl = cdolist_list_var_$3.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                variable_term = cdolist_list_var.first();
            }
        }
        return (rkf_query_constructor.NIL != additional_sentences) ? ConsesLow.append(base_sentences, additional_sentences) : base_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 20106L)
    public static SubLObject qc_act_initialize_query_from_cycl(final SubLObject state, final SubLObject cycl_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject domain_interaction_mt = qc_state_domain_interaction_mt(state);
        final SubLObject generation_mt = qc_state_generation_mt(state);
        SubLObject lhs = (SubLObject)rkf_query_constructor.NIL;
        SubLObject rhs = (SubLObject)rkf_query_constructor.NIL;
        if (rkf_query_constructor.NIL != el_utilities.el_general_implication_p(cycl_query)) {
            lhs = cycl_utilities.formula_arg1(cycl_query, (SubLObject)rkf_query_constructor.UNPROVIDED);
            rhs = cycl_utilities.formula_arg2(cycl_query, (SubLObject)rkf_query_constructor.UNPROVIDED);
        }
        else {
            rhs = cycl_query;
        }
        thread.resetMultipleValues();
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl(qc_strip_existentials(rhs), domain_interaction_mt, generation_mt);
        final SubLObject var_map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject query = qc_act_initialize_query_from_scenario(state, v_scenario);
        final SubLObject dont_cares = qc_identify_dont_care_irs(rhs, var_map);
        qc_set_state_query(state, query);
        SubLObject cdolist_list_var = dont_cares;
        SubLObject dont_care = (SubLObject)rkf_query_constructor.NIL;
        dont_care = cdolist_list_var.first();
        while (rkf_query_constructor.NIL != cdolist_list_var) {
            qc_act_register_dont_care(state, dont_care);
            cdolist_list_var = cdolist_list_var.rest();
            dont_care = cdolist_list_var.first();
        }
        if (rkf_query_constructor.NIL != lhs) {
            thread.resetMultipleValues();
            final SubLObject add_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl(qc_strip_existentials(lhs), domain_interaction_mt, generation_mt);
            final SubLObject add_var_map = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var2 = rkf_scenario_manipulator.sm_scenario_constraints(add_scenario);
            SubLObject constraint = (SubLObject)rkf_query_constructor.NIL;
            constraint = cdolist_list_var2.first();
            while (rkf_query_constructor.NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$5 = add_var_map;
                SubLObject var_rec = (SubLObject)rkf_query_constructor.NIL;
                var_rec = cdolist_list_var_$5.first();
                while (rkf_query_constructor.NIL != cdolist_list_var_$5) {
                    SubLObject current;
                    final SubLObject datum = current = var_rec;
                    SubLObject el_variable = (SubLObject)rkf_query_constructor.NIL;
                    SubLObject indexical_record = (SubLObject)rkf_query_constructor.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_constructor.$list101);
                    el_variable = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_query_constructor.$list101);
                    indexical_record = current.first();
                    current = current.rest();
                    if (rkf_query_constructor.NIL == current) {
                        final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record);
                        final SubLObject correct_indexical_record = conses_high.second(conses_high.assoc(el_variable, var_map, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED));
                        final SubLObject correct_indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(correct_indexical_record);
                        cycl_utilities.expression_nsubst(el_variable, indexical, rkf_scenario_manipulator.sm_constraint_record_sentence(constraint), Symbols.symbol_function((SubLObject)rkf_query_constructor.EQUAL), (SubLObject)rkf_query_constructor.UNPROVIDED);
                        cycl_utilities.expression_nsubst(correct_indexical, el_variable, rkf_scenario_manipulator.sm_constraint_record_sentence(constraint), Symbols.symbol_function((SubLObject)rkf_query_constructor.EQUAL), (SubLObject)rkf_query_constructor.UNPROVIDED);
                        qc_act_register_assumed_constraint(state, constraint);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_query_constructor.$list101);
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    var_rec = cdolist_list_var_$5.first();
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                constraint = cdolist_list_var2.first();
            }
        }
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 22124L)
    public static SubLObject qc_identify_dont_care_irs(final SubLObject cycl_query, final SubLObject var_map) {
        final SubLObject dont_care_vars = qc_extract_dont_care_vars(cycl_query);
        SubLObject result = (SubLObject)rkf_query_constructor.NIL;
        SubLObject cdolist_list_var = dont_care_vars;
        SubLObject dont_care_var = (SubLObject)rkf_query_constructor.NIL;
        dont_care_var = cdolist_list_var.first();
        while (rkf_query_constructor.NIL != cdolist_list_var) {
            final SubLObject indexical_record = conses_high.second(conses_high.assoc(dont_care_var, var_map, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED));
            result = (SubLObject)ConsesLow.cons(indexical_record, result);
            cdolist_list_var = cdolist_list_var.rest();
            dont_care_var = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 22460L)
    public static SubLObject qc_extract_dont_care_vars(final SubLObject cycl_query) {
        if (rkf_query_constructor.NIL != el_utilities.el_existential_p(cycl_query)) {
            return (SubLObject)ConsesLow.cons(cycl_utilities.sentence_arg1(cycl_query, (SubLObject)rkf_query_constructor.UNPROVIDED), qc_extract_dont_care_vars(cycl_utilities.sentence_arg2(cycl_query, (SubLObject)rkf_query_constructor.UNPROVIDED)));
        }
        return (SubLObject)rkf_query_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 22726L)
    public static SubLObject qc_strip_existentials(final SubLObject cycl_query) {
        if (rkf_query_constructor.NIL != el_utilities.el_existential_p(cycl_query)) {
            return qc_strip_existentials(cycl_utilities.sentence_arg2(cycl_query, (SubLObject)rkf_query_constructor.UNPROVIDED));
        }
        return cycl_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 22949L)
    public static SubLObject qc_act_register_query(final SubLObject state, final SubLObject query) {
        qc_set_state_query(state, query);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 23147L)
    public static SubLObject qc_act_register_dont_care(final SubLObject state, final SubLObject dont_care) {
        final SubLObject query = qc_state_query(state);
        qc_rem_query_return_term(query, dont_care);
        qc_compute_and_record_query_cycl(query);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 23464L)
    public static SubLObject qc_act_deregister_dont_care(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject query = qc_state_query(state);
        qc_add_query_return_term(query, indexical_record);
        qc_compute_and_record_query_cycl(query);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 23803L)
    public static SubLObject qc_act_register_assumed_term(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject query = qc_state_query(state);
        qc_add_query_assumed_term(query, indexical_record);
        qc_rem_query_return_term(query, indexical_record);
        qc_compute_and_record_query_cycl(query);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 24193L)
    public static SubLObject qc_act_deregister_assumed_term(final SubLObject state, final SubLObject indexical_record) {
        final SubLObject query = qc_state_query(state);
        qc_rem_query_assumed_term(query, indexical_record);
        qc_add_query_return_term(query, indexical_record);
        qc_compute_and_record_query_cycl(query);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 24594L)
    public static SubLObject qc_act_register_assumed_constraint(final SubLObject state, final SubLObject constraint_record) {
        final SubLObject query = qc_state_query(state);
        qc_add_query_assumed_constraint(query, constraint_record);
        final SubLObject sentence = rkf_scenario_manipulator.sm_constraint_record_sentence(constraint_record);
        SubLObject cdolist_list_var;
        final SubLObject assumed_indexicals = cdolist_list_var = cycl_utilities.expression_gather(sentence, Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym102$SM_INDEXICAL_P), (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
        SubLObject assumed_indexical = (SubLObject)rkf_query_constructor.NIL;
        assumed_indexical = cdolist_list_var.first();
        while (rkf_query_constructor.NIL != cdolist_list_var) {
            final SubLObject assumed_term = Sequences.find(assumed_indexical, qc_query_terms(query), Symbols.symbol_function((SubLObject)rkf_query_constructor.EQ), Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym103$SM_INDEXICAL_RECORD_INDEXICAL), (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
            qc_act_register_assumed_term(state, assumed_term);
            cdolist_list_var = cdolist_list_var.rest();
            assumed_indexical = cdolist_list_var.first();
        }
        qc_compute_and_record_query_cycl(query);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 25319L)
    public static SubLObject qc_act_deregister_assumed_constraint(final SubLObject state, final SubLObject constraint_record) {
        final SubLObject query = qc_state_query(state);
        qc_rem_query_assumed_constraint(query, constraint_record);
        final SubLObject sentence = rkf_scenario_manipulator.sm_constraint_record_sentence(constraint_record);
        final SubLObject assumed_indexicals = cycl_utilities.expression_gather(sentence, Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym102$SM_INDEXICAL_P), (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
        final SubLObject other_assumed_sentences = Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym98$SM_CONSTRAINT_RECORD_SENTENCE), qc_query_assumed_constraints(query));
        final SubLObject other_assumed_indexicals = cycl_utilities.expression_gather(other_assumed_sentences, Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym102$SM_INDEXICAL_P), (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
        SubLObject cdolist_list_var = assumed_indexicals;
        SubLObject assumed_indexical = (SubLObject)rkf_query_constructor.NIL;
        assumed_indexical = cdolist_list_var.first();
        while (rkf_query_constructor.NIL != cdolist_list_var) {
            if (rkf_query_constructor.NIL == subl_promotions.memberP(assumed_indexical, other_assumed_indexicals, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED)) {
                final SubLObject assumed_term = Sequences.find(assumed_indexical, qc_query_terms(query), Symbols.symbol_function((SubLObject)rkf_query_constructor.EQ), Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym103$SM_INDEXICAL_RECORD_INDEXICAL), (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED);
                qc_act_deregister_assumed_term(state, assumed_term);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assumed_indexical = cdolist_list_var.first();
        }
        qc_compute_and_record_query_cycl(query);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-query-constructor.lisp", position = 26338L)
    public static SubLObject qc_act_query_cycl(final SubLObject state) {
        final SubLObject query = qc_state_query(state);
        return qc_query_cycl(query);
    }
    
    public static SubLObject declare_rkf_query_constructor_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_query_constructor", "with_qc_lock", "WITH-QC-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_find_query_by_id", "QC-FIND-QUERY-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_find_query_by_id_string", "QC-FIND-QUERY-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_find_state_by_id", "QC-FIND-STATE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_find_state_by_id_string", "QC-FIND-STATE-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_next_id", "QC-NEXT-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_add_object", "QC-ADD-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_rem_object", "QC-REM-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_find_object_by_id", "QC-FIND-OBJECT-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_print_function_trampoline", "QC-QUERY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_p", "QC-QUERY-P", 1, 0, false);
        new $qc_query_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_id", "QC-QUERY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_cycl", "QC-QUERY-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_terms", "QC-QUERY-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_return_terms", "QC-QUERY-RETURN-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_constraints", "QC-QUERY-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_var_map", "QC-QUERY-VAR-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_scenario", "QC-QUERY-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_assumed_terms", "QC-QUERY-ASSUMED-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_query_assumed_constraints", "QC-QUERY-ASSUMED-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_query_id", "_CSETF-QC-QUERY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_query_cycl", "_CSETF-QC-QUERY-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_query_terms", "_CSETF-QC-QUERY-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_query_return_terms", "_CSETF-QC-QUERY-RETURN-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_query_constraints", "_CSETF-QC-QUERY-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_query_var_map", "_CSETF-QC-QUERY-VAR-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_query_scenario", "_CSETF-QC-QUERY-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_query_assumed_terms", "_CSETF-QC-QUERY-ASSUMED-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_query_assumed_constraints", "_CSETF-QC-QUERY-ASSUMED-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "make_qc_query", "MAKE-QC-QUERY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "visit_defstruct_qc_query", "VISIT-DEFSTRUCT-QC-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "visit_defstruct_object_qc_query_method", "VISIT-DEFSTRUCT-OBJECT-QC-QUERY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_new_query", "QC-NEW-QUERY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_cleanup_query", "QC-CLEANUP-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_query_cycl", "QC-SET-QUERY-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_query_terms", "QC-SET-QUERY-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_add_query_return_term", "QC-ADD-QUERY-RETURN-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_rem_query_return_term", "QC-REM-QUERY-RETURN-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_query_return_terms", "QC-SET-QUERY-RETURN-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_query_constraints", "QC-SET-QUERY-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_add_query_var_map_entry", "QC-ADD-QUERY-VAR-MAP-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_rem_query_var_map", "QC-REM-QUERY-VAR-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_query_scenario", "QC-SET-QUERY-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_add_query_assumed_term", "QC-ADD-QUERY-ASSUMED-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_rem_query_assumed_term", "QC-REM-QUERY-ASSUMED-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_query_assumed_terms", "QC-SET-QUERY-ASSUMED-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_add_query_assumed_constraint", "QC-ADD-QUERY-ASSUMED-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_rem_query_assumed_constraint", "QC-REM-QUERY-ASSUMED-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_query_assumed_constraints", "QC-SET-QUERY-ASSUMED-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_print_function_trampoline", "QC-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_p", "QC-STATE-P", 1, 0, false);
        new $qc_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_id", "QC-STATE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_text", "QC-STATE-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_candidates", "QC-STATE-CANDIDATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_query", "QC-STATE-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_interaction", "QC-STATE-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_parsing_mt", "QC-STATE-PARSING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_generation_mt", "QC-STATE-GENERATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_domain_mt", "QC-STATE-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_state_domain_interaction_mt", "QC-STATE-DOMAIN-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_state_id", "_CSETF-QC-STATE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_state_text", "_CSETF-QC-STATE-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_state_candidates", "_CSETF-QC-STATE-CANDIDATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_state_query", "_CSETF-QC-STATE-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_state_interaction", "_CSETF-QC-STATE-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_state_parsing_mt", "_CSETF-QC-STATE-PARSING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_state_generation_mt", "_CSETF-QC-STATE-GENERATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_state_domain_mt", "_CSETF-QC-STATE-DOMAIN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "_csetf_qc_state_domain_interaction_mt", "_CSETF-QC-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "make_qc_state", "MAKE-QC-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "visit_defstruct_qc_state", "VISIT-DEFSTRUCT-QC-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "visit_defstruct_object_qc_state_method", "VISIT-DEFSTRUCT-OBJECT-QC-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_new_state", "QC-NEW-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_cleanup_state", "QC-CLEANUP-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_state_text", "QC-SET-STATE-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_state_candidates", "QC-SET-STATE-CANDIDATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_state_query", "QC-SET-STATE-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_state_interaction", "QC-SET-STATE-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_state_parsing_mt", "QC-SET-STATE-PARSING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_state_generation_mt", "QC-SET-STATE-GENERATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_state_domain_mt", "QC-SET-STATE-DOMAIN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_set_state_domain_interaction_mt", "QC-SET-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_assumable_constraint_p", "QC-ASSUMABLE-CONSTRAINT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_new_state", "QC-ACT-NEW-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_new_state_with_text", "QC-ACT-NEW-STATE-WITH-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_note_state_interaction", "QC-ACT-NOTE-STATE-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_note_state_query", "QC-ACT-NOTE-STATE-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_initialize_state_context", "QC-ACT-INITIALIZE-STATE-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_candidate_scenario_expressions", "QC-ACT-CANDIDATE-SCENARIO-EXPRESSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_initialize_scenario_from_expression", "QC-ACT-INITIALIZE-SCENARIO-FROM-EXPRESSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_initialize_query_from_scenario", "QC-ACT-INITIALIZE-QUERY-FROM-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_compute_and_record_variables", "QC-COMPUTE-AND-RECORD-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_compute_set_difference", "QC-COMPUTE-SET-DIFFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_compute_and_record_query_cycl", "QC-COMPUTE-AND-RECORD-QUERY-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "rkf_compute_and_record_variables", "RKF-COMPUTE-AND-RECORD-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "rkf_add_object_var_map_entry", "RKF-ADD-OBJECT-VAR-MAP-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "rkf_add_object_var_map_entry_qc_query_method", "RKF-ADD-OBJECT-VAR-MAP-ENTRY-QC-QUERY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "rkf_rem_object_var_map", "RKF-REM-OBJECT-VAR-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "rkf_rem_object_var_map_qc_query_method", "RKF-REM-OBJECT-VAR-MAP-QC-QUERY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "rkf_make_el_var", "RKF-MAKE-EL-VAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "rkf_compute_cycl_from_parts", "RKF-COMPUTE-CYCL-FROM-PARTS", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "rkf_sentence_from_conjuncts", "RKF-SENTENCE-FROM-CONJUNCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "rkf_compute_cycl_from_terms_and_constraints", "RKF-COMPUTE-CYCL-FROM-TERMS-AND-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_initialize_query_from_cycl", "QC-ACT-INITIALIZE-QUERY-FROM-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_identify_dont_care_irs", "QC-IDENTIFY-DONT-CARE-IRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_extract_dont_care_vars", "QC-EXTRACT-DONT-CARE-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_strip_existentials", "QC-STRIP-EXISTENTIALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_register_query", "QC-ACT-REGISTER-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_register_dont_care", "QC-ACT-REGISTER-DONT-CARE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_deregister_dont_care", "QC-ACT-DEREGISTER-DONT-CARE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_register_assumed_term", "QC-ACT-REGISTER-ASSUMED-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_deregister_assumed_term", "QC-ACT-DEREGISTER-ASSUMED-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_register_assumed_constraint", "QC-ACT-REGISTER-ASSUMED-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_deregister_assumed_constraint", "QC-ACT-DEREGISTER-ASSUMED-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_query_constructor", "qc_act_query_cycl", "QC-ACT-QUERY-CYCL", 1, 0, false);
        return (SubLObject)rkf_query_constructor.NIL;
    }
    
    public static SubLObject init_rkf_query_constructor_file() {
        rkf_query_constructor.$qc_lock$ = SubLFiles.deflexical("*QC-LOCK*", Locks.make_lock((SubLObject)rkf_query_constructor.$str0$Query_Constructor_Lock));
        rkf_query_constructor.$qc_isg$ = SubLFiles.deflexical("*QC-ISG*", (rkf_query_constructor.NIL != Symbols.boundp((SubLObject)rkf_query_constructor.$sym3$_QC_ISG_)) ? rkf_query_constructor.$qc_isg$.getGlobalValue() : integer_sequence_generator.new_integer_sequence_generator((SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED));
        rkf_query_constructor.$qc_index$ = SubLFiles.deflexical("*QC-INDEX*", (rkf_query_constructor.NIL != Symbols.boundp((SubLObject)rkf_query_constructor.$sym4$_QC_INDEX_)) ? rkf_query_constructor.$qc_index$.getGlobalValue() : dictionary.new_dictionary((SubLObject)rkf_query_constructor.UNPROVIDED, (SubLObject)rkf_query_constructor.UNPROVIDED));
        rkf_query_constructor.$dtp_qc_query$ = SubLFiles.defconstant("*DTP-QC-QUERY*", (SubLObject)rkf_query_constructor.$sym5$QC_QUERY);
        rkf_query_constructor.$dtp_qc_state$ = SubLFiles.defconstant("*DTP-QC-STATE*", (SubLObject)rkf_query_constructor.$sym52$QC_STATE);
        rkf_query_constructor.$rkf_add_object_var_map_entry_method_table$ = SubLFiles.deflexical("*RKF-ADD-OBJECT-VAR-MAP-ENTRY-METHOD-TABLE*", Vectors.make_vector((SubLObject)rkf_query_constructor.$int91$256, (SubLObject)rkf_query_constructor.NIL));
        rkf_query_constructor.$rkf_rem_object_var_map_method_table$ = SubLFiles.deflexical("*RKF-REM-OBJECT-VAR-MAP-METHOD-TABLE*", Vectors.make_vector((SubLObject)rkf_query_constructor.$int91$256, (SubLObject)rkf_query_constructor.NIL));
        return (SubLObject)rkf_query_constructor.NIL;
    }
    
    public static SubLObject setup_rkf_query_constructor_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_query_constructor.$sym3$_QC_ISG_);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_query_constructor.$sym4$_QC_INDEX_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_query_constructor.$dtp_qc_query$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym12$QC_QUERY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_query_constructor.$list13);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym14$QC_QUERY_ID, (SubLObject)rkf_query_constructor.$sym15$_CSETF_QC_QUERY_ID);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym16$QC_QUERY_CYCL, (SubLObject)rkf_query_constructor.$sym17$_CSETF_QC_QUERY_CYCL);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym18$QC_QUERY_TERMS, (SubLObject)rkf_query_constructor.$sym19$_CSETF_QC_QUERY_TERMS);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym20$QC_QUERY_RETURN_TERMS, (SubLObject)rkf_query_constructor.$sym21$_CSETF_QC_QUERY_RETURN_TERMS);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym22$QC_QUERY_CONSTRAINTS, (SubLObject)rkf_query_constructor.$sym23$_CSETF_QC_QUERY_CONSTRAINTS);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym24$QC_QUERY_VAR_MAP, (SubLObject)rkf_query_constructor.$sym25$_CSETF_QC_QUERY_VAR_MAP);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym26$QC_QUERY_SCENARIO, (SubLObject)rkf_query_constructor.$sym27$_CSETF_QC_QUERY_SCENARIO);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym28$QC_QUERY_ASSUMED_TERMS, (SubLObject)rkf_query_constructor.$sym29$_CSETF_QC_QUERY_ASSUMED_TERMS);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym30$QC_QUERY_ASSUMED_CONSTRAINTS, (SubLObject)rkf_query_constructor.$sym31$_CSETF_QC_QUERY_ASSUMED_CONSTRAINTS);
        Equality.identity((SubLObject)rkf_query_constructor.$sym5$QC_QUERY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_query_constructor.$dtp_qc_query$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym46$VISIT_DEFSTRUCT_OBJECT_QC_QUERY_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_query_constructor.$dtp_qc_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym58$QC_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_query_constructor.$list59);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym60$QC_STATE_ID, (SubLObject)rkf_query_constructor.$sym61$_CSETF_QC_STATE_ID);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym62$QC_STATE_TEXT, (SubLObject)rkf_query_constructor.$sym63$_CSETF_QC_STATE_TEXT);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym64$QC_STATE_CANDIDATES, (SubLObject)rkf_query_constructor.$sym65$_CSETF_QC_STATE_CANDIDATES);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym66$QC_STATE_QUERY, (SubLObject)rkf_query_constructor.$sym67$_CSETF_QC_STATE_QUERY);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym68$QC_STATE_INTERACTION, (SubLObject)rkf_query_constructor.$sym69$_CSETF_QC_STATE_INTERACTION);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym70$QC_STATE_PARSING_MT, (SubLObject)rkf_query_constructor.$sym71$_CSETF_QC_STATE_PARSING_MT);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym72$QC_STATE_GENERATION_MT, (SubLObject)rkf_query_constructor.$sym73$_CSETF_QC_STATE_GENERATION_MT);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym74$QC_STATE_DOMAIN_MT, (SubLObject)rkf_query_constructor.$sym75$_CSETF_QC_STATE_DOMAIN_MT);
        Structures.def_csetf((SubLObject)rkf_query_constructor.$sym76$QC_STATE_DOMAIN_INTERACTION_MT, (SubLObject)rkf_query_constructor.$sym77$_CSETF_QC_STATE_DOMAIN_INTERACTION_MT);
        Equality.identity((SubLObject)rkf_query_constructor.$sym52$QC_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_query_constructor.$dtp_qc_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym87$VISIT_DEFSTRUCT_OBJECT_QC_STATE_METHOD));
        Structures.register_method(rkf_query_constructor.$rkf_add_object_var_map_entry_method_table$.getGlobalValue(), rkf_query_constructor.$dtp_qc_query$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym92$RKF_ADD_OBJECT_VAR_MAP_ENTRY_QC_QUERY_METHOD));
        Structures.register_method(rkf_query_constructor.$rkf_rem_object_var_map_method_table$.getGlobalValue(), rkf_query_constructor.$dtp_qc_query$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_query_constructor.$sym93$RKF_REM_OBJECT_VAR_MAP_QC_QUERY_METHOD));
        return (SubLObject)rkf_query_constructor.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_query_constructor_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_query_constructor_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_query_constructor_file();
    }
    
    static {
        me = (SubLFile)new rkf_query_constructor();
        rkf_query_constructor.$qc_lock$ = null;
        rkf_query_constructor.$qc_isg$ = null;
        rkf_query_constructor.$qc_index$ = null;
        rkf_query_constructor.$dtp_qc_query$ = null;
        rkf_query_constructor.$dtp_qc_state$ = null;
        rkf_query_constructor.$rkf_add_object_var_map_entry_method_table$ = null;
        rkf_query_constructor.$rkf_rem_object_var_map_method_table$ = null;
        $str0$Query_Constructor_Lock = SubLObjectFactory.makeString("Query Constructor Lock");
        $sym1$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*QC-LOCK*"));
        $sym3$_QC_ISG_ = SubLObjectFactory.makeSymbol("*QC-ISG*");
        $sym4$_QC_INDEX_ = SubLObjectFactory.makeSymbol("*QC-INDEX*");
        $sym5$QC_QUERY = SubLObjectFactory.makeSymbol("QC-QUERY");
        $sym6$QC_QUERY_P = SubLObjectFactory.makeSymbol("QC-QUERY-P");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("CYCL"), SubLObjectFactory.makeSymbol("TERMS"), SubLObjectFactory.makeSymbol("RETURN-TERMS"), SubLObjectFactory.makeSymbol("CONSTRAINTS"), SubLObjectFactory.makeSymbol("VAR-MAP"), SubLObjectFactory.makeSymbol("SCENARIO"), SubLObjectFactory.makeSymbol("ASSUMED-TERMS"), SubLObjectFactory.makeSymbol("ASSUMED-CONSTRAINTS") });
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("CYCL"), SubLObjectFactory.makeKeyword("TERMS"), SubLObjectFactory.makeKeyword("RETURN-TERMS"), SubLObjectFactory.makeKeyword("CONSTRAINTS"), SubLObjectFactory.makeKeyword("VAR-MAP"), SubLObjectFactory.makeKeyword("SCENARIO"), SubLObjectFactory.makeKeyword("ASSUMED-TERMS"), SubLObjectFactory.makeKeyword("ASSUMED-CONSTRAINTS") });
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("QC-QUERY-ID"), SubLObjectFactory.makeSymbol("QC-QUERY-CYCL"), SubLObjectFactory.makeSymbol("QC-QUERY-TERMS"), SubLObjectFactory.makeSymbol("QC-QUERY-RETURN-TERMS"), SubLObjectFactory.makeSymbol("QC-QUERY-CONSTRAINTS"), SubLObjectFactory.makeSymbol("QC-QUERY-VAR-MAP"), SubLObjectFactory.makeSymbol("QC-QUERY-SCENARIO"), SubLObjectFactory.makeSymbol("QC-QUERY-ASSUMED-TERMS"), SubLObjectFactory.makeSymbol("QC-QUERY-ASSUMED-CONSTRAINTS") });
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-ID"), SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-CYCL"), SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-TERMS"), SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-RETURN-TERMS"), SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-CONSTRAINTS"), SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-VAR-MAP"), SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-SCENARIO"), SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-ASSUMED-TERMS"), SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-ASSUMED-CONSTRAINTS") });
        $sym11$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym12$QC_QUERY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("QC-QUERY-PRINT-FUNCTION-TRAMPOLINE");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("QC-QUERY-P"));
        $sym14$QC_QUERY_ID = SubLObjectFactory.makeSymbol("QC-QUERY-ID");
        $sym15$_CSETF_QC_QUERY_ID = SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-ID");
        $sym16$QC_QUERY_CYCL = SubLObjectFactory.makeSymbol("QC-QUERY-CYCL");
        $sym17$_CSETF_QC_QUERY_CYCL = SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-CYCL");
        $sym18$QC_QUERY_TERMS = SubLObjectFactory.makeSymbol("QC-QUERY-TERMS");
        $sym19$_CSETF_QC_QUERY_TERMS = SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-TERMS");
        $sym20$QC_QUERY_RETURN_TERMS = SubLObjectFactory.makeSymbol("QC-QUERY-RETURN-TERMS");
        $sym21$_CSETF_QC_QUERY_RETURN_TERMS = SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-RETURN-TERMS");
        $sym22$QC_QUERY_CONSTRAINTS = SubLObjectFactory.makeSymbol("QC-QUERY-CONSTRAINTS");
        $sym23$_CSETF_QC_QUERY_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-CONSTRAINTS");
        $sym24$QC_QUERY_VAR_MAP = SubLObjectFactory.makeSymbol("QC-QUERY-VAR-MAP");
        $sym25$_CSETF_QC_QUERY_VAR_MAP = SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-VAR-MAP");
        $sym26$QC_QUERY_SCENARIO = SubLObjectFactory.makeSymbol("QC-QUERY-SCENARIO");
        $sym27$_CSETF_QC_QUERY_SCENARIO = SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-SCENARIO");
        $sym28$QC_QUERY_ASSUMED_TERMS = SubLObjectFactory.makeSymbol("QC-QUERY-ASSUMED-TERMS");
        $sym29$_CSETF_QC_QUERY_ASSUMED_TERMS = SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-ASSUMED-TERMS");
        $sym30$QC_QUERY_ASSUMED_CONSTRAINTS = SubLObjectFactory.makeSymbol("QC-QUERY-ASSUMED-CONSTRAINTS");
        $sym31$_CSETF_QC_QUERY_ASSUMED_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-QC-QUERY-ASSUMED-CONSTRAINTS");
        $kw32$ID = SubLObjectFactory.makeKeyword("ID");
        $kw33$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw34$TERMS = SubLObjectFactory.makeKeyword("TERMS");
        $kw35$RETURN_TERMS = SubLObjectFactory.makeKeyword("RETURN-TERMS");
        $kw36$CONSTRAINTS = SubLObjectFactory.makeKeyword("CONSTRAINTS");
        $kw37$VAR_MAP = SubLObjectFactory.makeKeyword("VAR-MAP");
        $kw38$SCENARIO = SubLObjectFactory.makeKeyword("SCENARIO");
        $kw39$ASSUMED_TERMS = SubLObjectFactory.makeKeyword("ASSUMED-TERMS");
        $kw40$ASSUMED_CONSTRAINTS = SubLObjectFactory.makeKeyword("ASSUMED-CONSTRAINTS");
        $str41$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw42$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym43$MAKE_QC_QUERY = SubLObjectFactory.makeSymbol("MAKE-QC-QUERY");
        $kw44$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw45$END = SubLObjectFactory.makeKeyword("END");
        $sym46$VISIT_DEFSTRUCT_OBJECT_QC_QUERY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-QC-QUERY-METHOD");
        $sym47$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $sym48$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym49$SM_INDEXICAL_RECORD_P = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-P");
        $sym50$SM_SCENARIO_P = SubLObjectFactory.makeSymbol("SM-SCENARIO-P");
        $sym51$SM_CONSTRAINT_RECORD_P = SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-P");
        $sym52$QC_STATE = SubLObjectFactory.makeSymbol("QC-STATE");
        $sym53$QC_STATE_P = SubLObjectFactory.makeSymbol("QC-STATE-P");
        $list54 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("TEXT"), SubLObjectFactory.makeSymbol("CANDIDATES"), SubLObjectFactory.makeSymbol("QUERY"), SubLObjectFactory.makeSymbol("INTERACTION"), SubLObjectFactory.makeSymbol("PARSING-MT"), SubLObjectFactory.makeSymbol("GENERATION-MT"), SubLObjectFactory.makeSymbol("DOMAIN-MT"), SubLObjectFactory.makeSymbol("DOMAIN-INTERACTION-MT") });
        $list55 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("TEXT"), SubLObjectFactory.makeKeyword("CANDIDATES"), SubLObjectFactory.makeKeyword("QUERY"), SubLObjectFactory.makeKeyword("INTERACTION"), SubLObjectFactory.makeKeyword("PARSING-MT"), SubLObjectFactory.makeKeyword("GENERATION-MT"), SubLObjectFactory.makeKeyword("DOMAIN-MT"), SubLObjectFactory.makeKeyword("DOMAIN-INTERACTION-MT") });
        $list56 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("QC-STATE-ID"), SubLObjectFactory.makeSymbol("QC-STATE-TEXT"), SubLObjectFactory.makeSymbol("QC-STATE-CANDIDATES"), SubLObjectFactory.makeSymbol("QC-STATE-QUERY"), SubLObjectFactory.makeSymbol("QC-STATE-INTERACTION"), SubLObjectFactory.makeSymbol("QC-STATE-PARSING-MT"), SubLObjectFactory.makeSymbol("QC-STATE-GENERATION-MT"), SubLObjectFactory.makeSymbol("QC-STATE-DOMAIN-MT"), SubLObjectFactory.makeSymbol("QC-STATE-DOMAIN-INTERACTION-MT") });
        $list57 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-ID"), SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-TEXT"), SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-CANDIDATES"), SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-QUERY"), SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-INTERACTION"), SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-PARSING-MT"), SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-GENERATION-MT"), SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-DOMAIN-MT"), SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-DOMAIN-INTERACTION-MT") });
        $sym58$QC_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("QC-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("QC-STATE-P"));
        $sym60$QC_STATE_ID = SubLObjectFactory.makeSymbol("QC-STATE-ID");
        $sym61$_CSETF_QC_STATE_ID = SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-ID");
        $sym62$QC_STATE_TEXT = SubLObjectFactory.makeSymbol("QC-STATE-TEXT");
        $sym63$_CSETF_QC_STATE_TEXT = SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-TEXT");
        $sym64$QC_STATE_CANDIDATES = SubLObjectFactory.makeSymbol("QC-STATE-CANDIDATES");
        $sym65$_CSETF_QC_STATE_CANDIDATES = SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-CANDIDATES");
        $sym66$QC_STATE_QUERY = SubLObjectFactory.makeSymbol("QC-STATE-QUERY");
        $sym67$_CSETF_QC_STATE_QUERY = SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-QUERY");
        $sym68$QC_STATE_INTERACTION = SubLObjectFactory.makeSymbol("QC-STATE-INTERACTION");
        $sym69$_CSETF_QC_STATE_INTERACTION = SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-INTERACTION");
        $sym70$QC_STATE_PARSING_MT = SubLObjectFactory.makeSymbol("QC-STATE-PARSING-MT");
        $sym71$_CSETF_QC_STATE_PARSING_MT = SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-PARSING-MT");
        $sym72$QC_STATE_GENERATION_MT = SubLObjectFactory.makeSymbol("QC-STATE-GENERATION-MT");
        $sym73$_CSETF_QC_STATE_GENERATION_MT = SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-GENERATION-MT");
        $sym74$QC_STATE_DOMAIN_MT = SubLObjectFactory.makeSymbol("QC-STATE-DOMAIN-MT");
        $sym75$_CSETF_QC_STATE_DOMAIN_MT = SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-DOMAIN-MT");
        $sym76$QC_STATE_DOMAIN_INTERACTION_MT = SubLObjectFactory.makeSymbol("QC-STATE-DOMAIN-INTERACTION-MT");
        $sym77$_CSETF_QC_STATE_DOMAIN_INTERACTION_MT = SubLObjectFactory.makeSymbol("_CSETF-QC-STATE-DOMAIN-INTERACTION-MT");
        $kw78$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw79$CANDIDATES = SubLObjectFactory.makeKeyword("CANDIDATES");
        $kw80$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw81$INTERACTION = SubLObjectFactory.makeKeyword("INTERACTION");
        $kw82$PARSING_MT = SubLObjectFactory.makeKeyword("PARSING-MT");
        $kw83$GENERATION_MT = SubLObjectFactory.makeKeyword("GENERATION-MT");
        $kw84$DOMAIN_MT = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $kw85$DOMAIN_INTERACTION_MT = SubLObjectFactory.makeKeyword("DOMAIN-INTERACTION-MT");
        $sym86$MAKE_QC_STATE = SubLObjectFactory.makeSymbol("MAKE-QC-STATE");
        $sym87$VISIT_DEFSTRUCT_OBJECT_QC_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-QC-STATE-METHOD");
        $sym88$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym89$USER_INTERACTION_P = SubLObjectFactory.makeSymbol("USER-INTERACTION-P");
        $sym90$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $int91$256 = SubLObjectFactory.makeInteger(256);
        $sym92$RKF_ADD_OBJECT_VAR_MAP_ENTRY_QC_QUERY_METHOD = SubLObjectFactory.makeSymbol("RKF-ADD-OBJECT-VAR-MAP-ENTRY-QC-QUERY-METHOD");
        $sym93$RKF_REM_OBJECT_VAR_MAP_QC_QUERY_METHOD = SubLObjectFactory.makeSymbol("RKF-REM-OBJECT-VAR-MAP-QC-QUERY-METHOD");
        $str94$_ = SubLObjectFactory.makeString("-");
        $str95$_ = SubLObjectFactory.makeString(" ");
        $str96$function = SubLObjectFactory.makeString("function");
        $str97$_A = SubLObjectFactory.makeString("~A");
        $sym98$SM_CONSTRAINT_RECORD_SENTENCE = SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-SENTENCE");
        $const99$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const100$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL-RECORD"));
        $sym102$SM_INDEXICAL_P = SubLObjectFactory.makeSymbol("SM-INDEXICAL-P");
        $sym103$SM_INDEXICAL_RECORD_INDEXICAL = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-INDEXICAL");
    }
    
    public static final class $qc_query_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $cycl;
        public SubLObject $terms;
        public SubLObject $return_terms;
        public SubLObject $constraints;
        public SubLObject $var_map;
        public SubLObject $scenario;
        public SubLObject $assumed_terms;
        public SubLObject $assumed_constraints;
        private static final SubLStructDeclNative structDecl;
        
        public $qc_query_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$cycl = (SubLObject)CommonSymbols.NIL;
            this.$terms = (SubLObject)CommonSymbols.NIL;
            this.$return_terms = (SubLObject)CommonSymbols.NIL;
            this.$constraints = (SubLObject)CommonSymbols.NIL;
            this.$var_map = (SubLObject)CommonSymbols.NIL;
            this.$scenario = (SubLObject)CommonSymbols.NIL;
            this.$assumed_terms = (SubLObject)CommonSymbols.NIL;
            this.$assumed_constraints = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$qc_query_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$cycl;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$terms;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$return_terms;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$constraints;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$var_map;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$scenario;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$assumed_terms;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$assumed_constraints;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$cycl = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$terms = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$return_terms = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$constraints = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$var_map = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$scenario = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$assumed_terms = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$assumed_constraints = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$qc_query_native.class, rkf_query_constructor.$sym5$QC_QUERY, rkf_query_constructor.$sym6$QC_QUERY_P, rkf_query_constructor.$list7, rkf_query_constructor.$list8, new String[] { "$id", "$cycl", "$terms", "$return_terms", "$constraints", "$var_map", "$scenario", "$assumed_terms", "$assumed_constraints" }, rkf_query_constructor.$list9, rkf_query_constructor.$list10, rkf_query_constructor.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $qc_query_p$UnaryFunction extends UnaryFunction
    {
        public $qc_query_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("QC-QUERY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_query_constructor.qc_query_p(arg1);
        }
    }
    
    public static final class $qc_state_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $text;
        public SubLObject $candidates;
        public SubLObject $query;
        public SubLObject $interaction;
        public SubLObject $parsing_mt;
        public SubLObject $generation_mt;
        public SubLObject $domain_mt;
        public SubLObject $domain_interaction_mt;
        private static final SubLStructDeclNative structDecl;
        
        public $qc_state_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$text = (SubLObject)CommonSymbols.NIL;
            this.$candidates = (SubLObject)CommonSymbols.NIL;
            this.$query = (SubLObject)CommonSymbols.NIL;
            this.$interaction = (SubLObject)CommonSymbols.NIL;
            this.$parsing_mt = (SubLObject)CommonSymbols.NIL;
            this.$generation_mt = (SubLObject)CommonSymbols.NIL;
            this.$domain_mt = (SubLObject)CommonSymbols.NIL;
            this.$domain_interaction_mt = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$qc_state_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$text;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$candidates;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$query;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$interaction;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$parsing_mt;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$generation_mt;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$domain_mt;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$domain_interaction_mt;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$text = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$candidates = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$query = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$interaction = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$parsing_mt = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$generation_mt = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$domain_mt = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$domain_interaction_mt = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$qc_state_native.class, rkf_query_constructor.$sym52$QC_STATE, rkf_query_constructor.$sym53$QC_STATE_P, rkf_query_constructor.$list54, rkf_query_constructor.$list55, new String[] { "$id", "$text", "$candidates", "$query", "$interaction", "$parsing_mt", "$generation_mt", "$domain_mt", "$domain_interaction_mt" }, rkf_query_constructor.$list56, rkf_query_constructor.$list57, rkf_query_constructor.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $qc_state_p$UnaryFunction extends UnaryFunction
    {
        public $qc_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("QC-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_query_constructor.qc_state_p(arg1);
        }
    }
}

/*

	Total time: 386 ms
	
*/