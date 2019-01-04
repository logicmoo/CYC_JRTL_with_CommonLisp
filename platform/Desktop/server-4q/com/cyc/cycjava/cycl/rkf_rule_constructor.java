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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_rule_constructor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_rule_constructor";
    public static final String myFingerPrint = "e6938ffd5d4befcdfaed5adc36b1cabcc73d59619e5bfeb52e473c73c106fc7a";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 770L)
    private static SubLSymbol $rc_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1812L)
    private static SubLSymbol $rc_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1937L)
    private static SubLSymbol $rc_index$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLSymbol $dtp_rc_lhs$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLSymbol $dtp_rc_rhs$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLSymbol $dtp_rc_state$;
    private static final SubLString $str0$Rule_Constructor_Lock;
    private static final SubLSymbol $sym1$WITH_LOCK_HELD;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$_RC_ISG_;
    private static final SubLSymbol $sym4$_RC_INDEX_;
    private static final SubLSymbol $sym5$RC_LHS;
    private static final SubLSymbol $sym6$RC_LHS_P;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym12$RC_LHS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$RC_LHS_ID;
    private static final SubLSymbol $sym15$_CSETF_RC_LHS_ID;
    private static final SubLSymbol $sym16$RC_LHS_NL_SENTENCE;
    private static final SubLSymbol $sym17$_CSETF_RC_LHS_NL_SENTENCE;
    private static final SubLSymbol $sym18$RC_LHS_CONSTRAINTS;
    private static final SubLSymbol $sym19$_CSETF_RC_LHS_CONSTRAINTS;
    private static final SubLSymbol $sym20$RC_LHS_TERMS;
    private static final SubLSymbol $sym21$_CSETF_RC_LHS_TERMS;
    private static final SubLSymbol $sym22$RC_LHS_CYCL;
    private static final SubLSymbol $sym23$_CSETF_RC_LHS_CYCL;
    private static final SubLSymbol $kw24$ID;
    private static final SubLSymbol $kw25$NL_SENTENCE;
    private static final SubLSymbol $kw26$CONSTRAINTS;
    private static final SubLSymbol $kw27$TERMS;
    private static final SubLSymbol $kw28$CYCL;
    private static final SubLString $str29$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw30$BEGIN;
    private static final SubLSymbol $sym31$MAKE_RC_LHS;
    private static final SubLSymbol $kw32$SLOT;
    private static final SubLSymbol $kw33$END;
    private static final SubLSymbol $sym34$VISIT_DEFSTRUCT_OBJECT_RC_LHS_METHOD;
    private static final SubLSymbol $sym35$STRINGP;
    private static final SubLSymbol $sym36$LISTP;
    private static final SubLSymbol $sym37$POSSIBLY_SENTENCE_P;
    private static final SubLSymbol $sym38$RC_RHS;
    private static final SubLSymbol $sym39$RC_RHS_P;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$RC_RHS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$RC_RHS_ID;
    private static final SubLSymbol $sym47$_CSETF_RC_RHS_ID;
    private static final SubLSymbol $sym48$RC_RHS_NL_SENTENCE;
    private static final SubLSymbol $sym49$_CSETF_RC_RHS_NL_SENTENCE;
    private static final SubLSymbol $sym50$RC_RHS_CONSTRAINTS;
    private static final SubLSymbol $sym51$_CSETF_RC_RHS_CONSTRAINTS;
    private static final SubLSymbol $sym52$RC_RHS_EXISTENTIAL_TERM;
    private static final SubLSymbol $sym53$_CSETF_RC_RHS_EXISTENTIAL_TERM;
    private static final SubLSymbol $sym54$RC_RHS_CYCL;
    private static final SubLSymbol $sym55$_CSETF_RC_RHS_CYCL;
    private static final SubLSymbol $kw56$EXISTENTIAL_TERM;
    private static final SubLSymbol $sym57$MAKE_RC_RHS;
    private static final SubLSymbol $sym58$VISIT_DEFSTRUCT_OBJECT_RC_RHS_METHOD;
    private static final SubLSymbol $sym59$SM_CONSTRAINT_RECORD_P;
    private static final SubLSymbol $sym60$SM_INDEXICAL_RECORD_P;
    private static final SubLSymbol $sym61$RC_STATE;
    private static final SubLSymbol $sym62$RC_STATE_P;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$RC_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$RC_STATE_ID;
    private static final SubLSymbol $sym70$_CSETF_RC_STATE_ID;
    private static final SubLSymbol $sym71$RC_STATE_TEXT;
    private static final SubLSymbol $sym72$_CSETF_RC_STATE_TEXT;
    private static final SubLSymbol $sym73$RC_STATE_INTERACTION;
    private static final SubLSymbol $sym74$_CSETF_RC_STATE_INTERACTION;
    private static final SubLSymbol $sym75$RC_STATE_IF_SCENARIO;
    private static final SubLSymbol $sym76$_CSETF_RC_STATE_IF_SCENARIO;
    private static final SubLSymbol $sym77$RC_STATE_THEN_SCENARIO;
    private static final SubLSymbol $sym78$_CSETF_RC_STATE_THEN_SCENARIO;
    private static final SubLSymbol $sym79$RC_STATE_LHS;
    private static final SubLSymbol $sym80$_CSETF_RC_STATE_LHS;
    private static final SubLSymbol $sym81$RC_STATE_RHS;
    private static final SubLSymbol $sym82$_CSETF_RC_STATE_RHS;
    private static final SubLSymbol $sym83$RC_STATE_PARSING_MT;
    private static final SubLSymbol $sym84$_CSETF_RC_STATE_PARSING_MT;
    private static final SubLSymbol $sym85$RC_STATE_GENERATION_MT;
    private static final SubLSymbol $sym86$_CSETF_RC_STATE_GENERATION_MT;
    private static final SubLSymbol $sym87$RC_STATE_DOMAIN_MT;
    private static final SubLSymbol $sym88$_CSETF_RC_STATE_DOMAIN_MT;
    private static final SubLSymbol $sym89$RC_STATE_DOMAIN_INTERACTION_MT;
    private static final SubLSymbol $sym90$_CSETF_RC_STATE_DOMAIN_INTERACTION_MT;
    private static final SubLSymbol $sym91$RC_STATE_VAR_MAP;
    private static final SubLSymbol $sym92$_CSETF_RC_STATE_VAR_MAP;
    private static final SubLSymbol $sym93$RC_STATE_EXCEPTIONS;
    private static final SubLSymbol $sym94$_CSETF_RC_STATE_EXCEPTIONS;
    private static final SubLSymbol $kw95$TEXT;
    private static final SubLSymbol $kw96$INTERACTION;
    private static final SubLSymbol $kw97$IF_SCENARIO;
    private static final SubLSymbol $kw98$THEN_SCENARIO;
    private static final SubLSymbol $kw99$LHS;
    private static final SubLSymbol $kw100$RHS;
    private static final SubLSymbol $kw101$PARSING_MT;
    private static final SubLSymbol $kw102$GENERATION_MT;
    private static final SubLSymbol $kw103$DOMAIN_MT;
    private static final SubLSymbol $kw104$DOMAIN_INTERACTION_MT;
    private static final SubLSymbol $kw105$VAR_MAP;
    private static final SubLSymbol $kw106$EXCEPTIONS;
    private static final SubLSymbol $sym107$MAKE_RC_STATE;
    private static final SubLSymbol $sym108$VISIT_DEFSTRUCT_OBJECT_RC_STATE_METHOD;
    private static final SubLSymbol $sym109$USER_INTERACTION_P;
    private static final SubLSymbol $sym110$SM_SCENARIO_P;
    private static final SubLSymbol $sym111$HLMT_P;
    private static final SubLSymbol $sym112$DOUBLETON_;
    private static final SubLString $str113$If_;
    private static final SubLString $str114$__then_;
    private static final SubLSymbol $kw115$INSERT_EXPLICIT_TYPE_CONSTRAINTS;
    private static final SubLSymbol $sym116$RKF_ADD_OBJECT_VAR_MAP_ENTRY_RC_STATE_METHOD;
    private static final SubLObject $const117$ist;
    private static final SubLObject $const118$exceptWhen;
    private static final SubLObject $const119$exceptFor;
    private static final SubLList $list120;
    private static final SubLString $str121$Exceptions;
    private static final SubLString $str122$Then_Clause;
    private static final SubLSymbol $sym123$SECOND;
    private static final SubLList $list124;
    private static final SubLSymbol $sym125$INDEXED_TERM_P;
    private static final SubLSymbol $sym126$RELEVANT_MT_IS_GENL_MT;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 974L)
    public static SubLObject with_rc_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_rule_constructor.$sym1$WITH_LOCK_HELD, (SubLObject)rkf_rule_constructor.$list2, ConsesLow.append(body, (SubLObject)rkf_rule_constructor.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1068L)
    public static SubLObject rc_find_lhs_by_id(final SubLObject id) {
        return rc_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1231L)
    public static SubLObject rc_find_lhs_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        final SubLObject lhs = rc_find_lhs_by_id(id);
        return lhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1372L)
    public static SubLObject rc_find_rhs_by_id(final SubLObject id) {
        return rc_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1446L)
    public static SubLObject rc_find_rhs_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        final SubLObject rhs = rc_find_rhs_by_id(id);
        return rhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1587L)
    public static SubLObject rc_find_state_by_id(final SubLObject id) {
        return rc_find_object_by_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 1663L)
    public static SubLObject rc_find_state_by_id_string(final SubLObject id_string) {
        final SubLObject id = reader.parse_integer(id_string, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        final SubLObject state = rc_find_state_by_id(id);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2034L)
    public static SubLObject rc_next_id() {
        return integer_sequence_generator.integer_sequence_generator_next(rkf_rule_constructor.$rc_isg$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2141L)
    public static SubLObject rc_add_object(final SubLObject id, final SubLObject v_object) {
        return dictionary.dictionary_enter(rkf_rule_constructor.$rc_index$.getGlobalValue(), id, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2284L)
    public static SubLObject rc_rem_object(final SubLObject id) {
        return dictionary.dictionary_remove(rkf_rule_constructor.$rc_index$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2414L)
    public static SubLObject rc_find_object_by_id(final SubLObject id) {
        return dictionary.dictionary_lookup(rkf_rule_constructor.$rc_index$.getGlobalValue(), id, (SubLObject)rkf_rule_constructor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject rc_lhs_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_rule_constructor.ZERO_INTEGER);
        return (SubLObject)rkf_rule_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject rc_lhs_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rc_lhs_native.class) ? rkf_rule_constructor.T : rkf_rule_constructor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject rc_lhs_id(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject rc_lhs_nl_sentence(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject rc_lhs_constraints(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject rc_lhs_terms(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject rc_lhs_cycl(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject _csetf_rc_lhs_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject _csetf_rc_lhs_nl_sentence(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject _csetf_rc_lhs_constraints(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject _csetf_rc_lhs_terms(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject _csetf_rc_lhs_cycl(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject make_rc_lhs(SubLObject arglist) {
        if (arglist == rkf_rule_constructor.UNPROVIDED) {
            arglist = (SubLObject)rkf_rule_constructor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rc_lhs_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_rule_constructor.NIL, next = arglist; rkf_rule_constructor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw24$ID)) {
                _csetf_rc_lhs_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw25$NL_SENTENCE)) {
                _csetf_rc_lhs_nl_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw26$CONSTRAINTS)) {
                _csetf_rc_lhs_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw27$TERMS)) {
                _csetf_rc_lhs_terms(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw28$CYCL)) {
                _csetf_rc_lhs_cycl(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_rule_constructor.$str29$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject visit_defstruct_rc_lhs(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw30$BEGIN, (SubLObject)rkf_rule_constructor.$sym31$MAKE_RC_LHS, (SubLObject)rkf_rule_constructor.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw24$ID, rc_lhs_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw25$NL_SENTENCE, rc_lhs_nl_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw26$CONSTRAINTS, rc_lhs_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw27$TERMS, rc_lhs_terms(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw28$CYCL, rc_lhs_cycl(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw33$END, (SubLObject)rkf_rule_constructor.$sym31$MAKE_RC_LHS, (SubLObject)rkf_rule_constructor.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2500L)
    public static SubLObject visit_defstruct_object_rc_lhs_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rc_lhs(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2746L)
    public static SubLObject rc_new_lhs() {
        final SubLObject lhs = make_rc_lhs((SubLObject)rkf_rule_constructor.UNPROVIDED);
        final SubLObject id = rc_next_id();
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_lhs_id(lhs, id);
            rc_add_object(id, lhs);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return lhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 2925L)
    public static SubLObject rc_cleanup_lhs(final SubLObject lhs) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(lhs) : lhs;
        final SubLObject id = rc_lhs_id(lhs);
        final SubLObject success = rc_rem_object(id);
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3127L)
    public static SubLObject rc_set_lhs_nl_sentence(final SubLObject lhs, final SubLObject nl_sentence) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(lhs) : lhs;
        assert rkf_rule_constructor.NIL != Types.stringp(nl_sentence) : nl_sentence;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_lhs_nl_sentence(lhs, nl_sentence);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return lhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3327L)
    public static SubLObject rc_set_lhs_constraints(final SubLObject lhs, final SubLObject constraints) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(lhs) : lhs;
        assert rkf_rule_constructor.NIL != Types.listp(constraints) : constraints;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_lhs_constraints(lhs, constraints);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return lhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3526L)
    public static SubLObject rc_set_lhs_terms(final SubLObject lhs, final SubLObject terms) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(lhs) : lhs;
        assert rkf_rule_constructor.NIL != Types.listp(terms) : terms;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_lhs_terms(lhs, terms);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return lhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3695L)
    public static SubLObject rc_set_lhs_cycl(final SubLObject lhs, final SubLObject cycl) {
        assert rkf_rule_constructor.NIL != rc_lhs_p(lhs) : lhs;
        assert rkf_rule_constructor.NIL != el_utilities.possibly_sentence_p(cycl) : cycl;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_lhs_cycl(lhs, cycl);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return lhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject rc_rhs_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_rule_constructor.ZERO_INTEGER);
        return (SubLObject)rkf_rule_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject rc_rhs_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rc_rhs_native.class) ? rkf_rule_constructor.T : rkf_rule_constructor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject rc_rhs_id(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject rc_rhs_nl_sentence(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject rc_rhs_constraints(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject rc_rhs_existential_term(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject rc_rhs_cycl(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject _csetf_rc_rhs_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject _csetf_rc_rhs_nl_sentence(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject _csetf_rc_rhs_constraints(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject _csetf_rc_rhs_existential_term(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject _csetf_rc_rhs_cycl(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject make_rc_rhs(SubLObject arglist) {
        if (arglist == rkf_rule_constructor.UNPROVIDED) {
            arglist = (SubLObject)rkf_rule_constructor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rc_rhs_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_rule_constructor.NIL, next = arglist; rkf_rule_constructor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw24$ID)) {
                _csetf_rc_rhs_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw25$NL_SENTENCE)) {
                _csetf_rc_rhs_nl_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw26$CONSTRAINTS)) {
                _csetf_rc_rhs_constraints(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw56$EXISTENTIAL_TERM)) {
                _csetf_rc_rhs_existential_term(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw28$CYCL)) {
                _csetf_rc_rhs_cycl(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_rule_constructor.$str29$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject visit_defstruct_rc_rhs(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw30$BEGIN, (SubLObject)rkf_rule_constructor.$sym57$MAKE_RC_RHS, (SubLObject)rkf_rule_constructor.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw24$ID, rc_rhs_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw25$NL_SENTENCE, rc_rhs_nl_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw26$CONSTRAINTS, rc_rhs_constraints(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw56$EXISTENTIAL_TERM, rc_rhs_existential_term(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw28$CYCL, rc_rhs_cycl(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw33$END, (SubLObject)rkf_rule_constructor.$sym57$MAKE_RC_RHS, (SubLObject)rkf_rule_constructor.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 3873L)
    public static SubLObject visit_defstruct_object_rc_rhs_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rc_rhs(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 4122L)
    public static SubLObject rc_new_rhs() {
        final SubLObject rhs = make_rc_rhs((SubLObject)rkf_rule_constructor.UNPROVIDED);
        final SubLObject id = rc_next_id();
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_rhs_id(rhs, id);
            rc_add_object(id, rhs);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 4301L)
    public static SubLObject rc_cleanup_rhs(final SubLObject rhs) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(rhs) : rhs;
        final SubLObject id = rc_rhs_id(rhs);
        final SubLObject success = rc_rem_object(id);
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 4503L)
    public static SubLObject rc_set_rhs_nl_sentence(final SubLObject rhs, final SubLObject nl_sentence) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(rhs) : rhs;
        assert rkf_rule_constructor.NIL != Types.stringp(nl_sentence) : nl_sentence;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_rhs_nl_sentence(rhs, nl_sentence);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 4704L)
    public static SubLObject rc_set_rhs_constraints(final SubLObject rhs, final SubLObject constraints) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(rhs) : rhs;
        assert rkf_rule_constructor.NIL != Types.listp(constraints) : constraints;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_rhs_constraints(rhs, constraints);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 4903L)
    public static SubLObject rc_add_rhs_constraint(final SubLObject rhs, final SubLObject constraint) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(rhs) : rhs;
        assert rkf_rule_constructor.NIL != rkf_scenario_manipulator.sm_constraint_record_p(constraint) : constraint;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_rhs_constraints(rhs, (SubLObject)ConsesLow.cons(constraint, rc_rhs_constraints(rhs)));
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5115L)
    public static SubLObject rc_set_rhs_existential_term(final SubLObject rhs, final SubLObject existential_term) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(rhs) : rhs;
        assert rkf_rule_constructor.NIL != rkf_scenario_manipulator.sm_indexical_record_p(existential_term) : existential_term;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_rhs_existential_term(rhs, existential_term);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5355L)
    public static SubLObject rc_set_rhs_cycl(final SubLObject rhs, final SubLObject cycl) {
        assert rkf_rule_constructor.NIL != rc_rhs_p(rhs) : rhs;
        assert rkf_rule_constructor.NIL != el_utilities.possibly_sentence_p(cycl) : cycl;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_rhs_cycl(rhs, cycl);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return rhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_rule_constructor.ZERO_INTEGER);
        return (SubLObject)rkf_rule_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rc_state_native.class) ? rkf_rule_constructor.T : rkf_rule_constructor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_id(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_text(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_interaction(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_if_scenario(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_then_scenario(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_lhs(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_rhs(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_parsing_mt(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_generation_mt(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_domain_mt(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_domain_interaction_mt(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_var_map(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject rc_state_exceptions(final SubLObject v_object) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_id(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_text(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_interaction(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_if_scenario(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_then_scenario(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_lhs(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_rhs(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_generation_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_domain_interaction_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_var_map(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject _csetf_rc_state_exceptions(final SubLObject v_object, final SubLObject value) {
        assert rkf_rule_constructor.NIL != rc_state_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject make_rc_state(SubLObject arglist) {
        if (arglist == rkf_rule_constructor.UNPROVIDED) {
            arglist = (SubLObject)rkf_rule_constructor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rc_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_rule_constructor.NIL, next = arglist; rkf_rule_constructor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw24$ID)) {
                _csetf_rc_state_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw95$TEXT)) {
                _csetf_rc_state_text(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw96$INTERACTION)) {
                _csetf_rc_state_interaction(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw97$IF_SCENARIO)) {
                _csetf_rc_state_if_scenario(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw98$THEN_SCENARIO)) {
                _csetf_rc_state_then_scenario(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw99$LHS)) {
                _csetf_rc_state_lhs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw100$RHS)) {
                _csetf_rc_state_rhs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw101$PARSING_MT)) {
                _csetf_rc_state_parsing_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw102$GENERATION_MT)) {
                _csetf_rc_state_generation_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw103$DOMAIN_MT)) {
                _csetf_rc_state_domain_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw104$DOMAIN_INTERACTION_MT)) {
                _csetf_rc_state_domain_interaction_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw105$VAR_MAP)) {
                _csetf_rc_state_var_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_rule_constructor.$kw106$EXCEPTIONS)) {
                _csetf_rc_state_exceptions(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_rule_constructor.$str29$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject visit_defstruct_rc_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw30$BEGIN, (SubLObject)rkf_rule_constructor.$sym107$MAKE_RC_STATE, (SubLObject)rkf_rule_constructor.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw24$ID, rc_state_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw95$TEXT, rc_state_text(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw96$INTERACTION, rc_state_interaction(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw97$IF_SCENARIO, rc_state_if_scenario(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw98$THEN_SCENARIO, rc_state_then_scenario(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw99$LHS, rc_state_lhs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw100$RHS, rc_state_rhs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw101$PARSING_MT, rc_state_parsing_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw102$GENERATION_MT, rc_state_generation_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw103$DOMAIN_MT, rc_state_domain_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw104$DOMAIN_INTERACTION_MT, rc_state_domain_interaction_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw105$VAR_MAP, rc_state_var_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw32$SLOT, (SubLObject)rkf_rule_constructor.$kw106$EXCEPTIONS, rc_state_exceptions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_rule_constructor.$kw33$END, (SubLObject)rkf_rule_constructor.$sym107$MAKE_RC_STATE, (SubLObject)rkf_rule_constructor.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 5533L)
    public static SubLObject visit_defstruct_object_rc_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rc_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 6014L)
    public static SubLObject rc_new_state() {
        final SubLObject state = make_rc_state((SubLObject)rkf_rule_constructor.UNPROVIDED);
        final SubLObject id = rc_next_id();
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_id(state, id);
            rc_add_object(id, state);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 6207L)
    public static SubLObject rc_cleanup_state(final SubLObject state) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        final SubLObject id = rc_state_id(state);
        final SubLObject success = rc_rem_object(id);
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 6421L)
    public static SubLObject rc_set_state_text(final SubLObject state, final SubLObject text) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != Types.stringp(text) : text;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_text(state, text);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 6600L)
    public static SubLObject rc_set_state_interaction(final SubLObject state, final SubLObject interaction) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != user_interaction_agenda.user_interaction_p(interaction) : interaction;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_interaction(state, interaction);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 6826L)
    public static SubLObject rc_set_state_if_scenario(final SubLObject state, final SubLObject v_scenario) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : v_scenario;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_if_scenario(state, v_scenario);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 7038L)
    public static SubLObject rc_set_state_then_scenario(final SubLObject state, final SubLObject v_scenario) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : v_scenario;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_then_scenario(state, v_scenario);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 7254L)
    public static SubLObject rc_set_state_lhs(final SubLObject state, final SubLObject lhs) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != rc_lhs_p(lhs) : lhs;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_lhs(state, lhs);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 7430L)
    public static SubLObject rc_set_state_rhs(final SubLObject state, final SubLObject rhs) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != rc_rhs_p(rhs) : rhs;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_rhs(state, rhs);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 7606L)
    public static SubLObject rc_set_state_parsing_mt(final SubLObject state, final SubLObject parsing_mt) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != hlmt.hlmt_p(parsing_mt) : parsing_mt;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_parsing_mt(state, parsing_mt);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 7815L)
    public static SubLObject rc_set_state_generation_mt(final SubLObject state, final SubLObject generation_mt) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != hlmt.hlmt_p(generation_mt) : generation_mt;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_generation_mt(state, generation_mt);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 8039L)
    public static SubLObject rc_set_state_domain_mt(final SubLObject state, final SubLObject domain_mt) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != hlmt.hlmt_p(domain_mt) : domain_mt;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_domain_mt(state, domain_mt);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 8243L)
    public static SubLObject rc_set_state_domain_interaction_mt(final SubLObject state, final SubLObject domain_interaction_mt) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != hlmt.hlmt_p(domain_interaction_mt) : domain_interaction_mt;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_domain_interaction_mt(state, domain_interaction_mt);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 8507L)
    public static SubLObject rc_add_state_var_map_entry(final SubLObject state, final SubLObject entry) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != list_utilities.doubletonP(entry) : entry;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_var_map(state, (SubLObject)ConsesLow.cons(entry, rc_state_var_map(state)));
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 8704L)
    public static SubLObject rc_set_state_var_map(final SubLObject state, final SubLObject var_map) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != Types.listp(var_map) : var_map;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_var_map(state, var_map);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 8896L)
    public static SubLObject rc_set_state_exceptions(final SubLObject state, final SubLObject exceptions) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != Types.listp(exceptions) : exceptions;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            _csetf_rc_state_exceptions(state, exceptions);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 9104L)
    public static SubLObject rc_add_state_exception(final SubLObject state, final SubLObject v_scenario) {
        assert rkf_rule_constructor.NIL != rc_state_p(state) : state;
        assert rkf_rule_constructor.NIL != rkf_scenario_manipulator.sm_scenario_p(v_scenario) : v_scenario;
        SubLObject release = (SubLObject)rkf_rule_constructor.NIL;
        try {
            release = Locks.seize_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            SubLObject exceptions = rc_state_exceptions(state);
            if (rkf_rule_constructor.NIL == conses_high.member(v_scenario, exceptions, Symbols.symbol_function((SubLObject)rkf_rule_constructor.EQL), Symbols.symbol_function((SubLObject)rkf_rule_constructor.IDENTITY))) {
                exceptions = (SubLObject)ConsesLow.cons(v_scenario, exceptions);
            }
            _csetf_rc_state_exceptions(state, exceptions);
        }
        finally {
            if (rkf_rule_constructor.NIL != release) {
                Locks.release_lock(rkf_rule_constructor.$rc_lock$.getGlobalValue());
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 9408L)
    public static SubLObject rc_ensure_state_lhs(final SubLObject state) {
        SubLObject lhs = rc_state_lhs(state);
        if (rkf_rule_constructor.NIL == rc_lhs_p(lhs)) {
            lhs = rc_new_lhs();
            rc_set_state_lhs(state, lhs);
        }
        return lhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 9614L)
    public static SubLObject rc_ensure_state_rhs(final SubLObject state) {
        SubLObject rhs = rc_state_rhs(state);
        if (rkf_rule_constructor.NIL == rc_rhs_p(rhs)) {
            rhs = rc_new_rhs();
            rc_set_state_rhs(state, rhs);
        }
        return rhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 9807L)
    public static SubLObject rc_state_complete_lhs_p(final SubLObject state) {
        final SubLObject lhs = rc_state_lhs(state);
        if (rkf_rule_constructor.NIL != rc_lhs_p(lhs)) {
            return rc_lhs_cycl(lhs);
        }
        return (SubLObject)rkf_rule_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 9966L)
    public static SubLObject rc_rule_ready_p(final SubLObject state) {
        return rc_act_construct_rule_cycl(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 10053L)
    public static SubLObject rc_act_new_state() {
        final SubLObject state = rc_new_state();
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 10360L)
    public static SubLObject rc_act_new_state_with_text(final SubLObject text) {
        final SubLObject state = rc_act_new_state();
        rc_set_state_text(state, text);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 10500L)
    public static SubLObject rc_act_new_state_with_if_then(final SubLObject if_sentence, final SubLObject then_sentence) {
        final SubLObject state = rc_act_new_state();
        final SubLObject lhs = rc_new_lhs();
        final SubLObject rhs = rc_new_rhs();
        rc_set_lhs_nl_sentence(lhs, if_sentence);
        rc_set_rhs_nl_sentence(rhs, then_sentence);
        rc_set_state_lhs(state, lhs);
        rc_set_state_rhs(state, rhs);
        final SubLObject text = Sequences.cconcatenate((SubLObject)rkf_rule_constructor.$str113$If_, new SubLObject[] { if_sentence, rkf_rule_constructor.$str114$__then_, then_sentence });
        rc_set_state_text(state, text);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 10943L)
    public static SubLObject rc_act_note_state_interaction(final SubLObject state, final SubLObject interaction) {
        rc_set_state_interaction(state, interaction);
        rc_act_initialize_state_context(state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 11113L)
    public static SubLObject rc_act_note_state_if_scenario(final SubLObject state, final SubLObject if_scenario) {
        return rc_set_state_if_scenario(state, if_scenario);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 11233L)
    public static SubLObject rc_act_note_state_then_scenario(final SubLObject state, final SubLObject then_scenario) {
        return rc_set_state_then_scenario(state, then_scenario);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 11361L)
    public static SubLObject rc_act_initialize_state_context(final SubLObject state) {
        if (rkf_rule_constructor.NIL != user_interaction_agenda.user_interaction_p(rc_state_interaction(state))) {
            final SubLObject v_agenda = user_interaction_agenda.ui_agenda(rc_state_interaction(state));
            rc_set_state_parsing_mt(state, user_interaction_agenda.uia_parsing_interaction_mt(v_agenda));
            rc_set_state_generation_mt(state, user_interaction_agenda.uia_generation_interaction_mt(v_agenda, (SubLObject)rkf_rule_constructor.UNPROVIDED));
            rc_set_state_domain_mt(state, user_interaction_agenda.uia_domain_mt(v_agenda));
            rc_set_state_domain_interaction_mt(state, user_interaction_agenda.uia_domain_interaction_mt(v_agenda));
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 11862L)
    public static SubLObject rc_act_lhs_constraint_nl_sentence(final SubLObject state, final SubLObject constraint_record) {
        final SubLObject generation_mt = rc_state_generation_mt(state);
        final SubLObject domain_mt = rc_state_domain_interaction_mt(state);
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject indexical_records = rc_lhs_terms(lhs);
        return rkf_scenario_manipulator.sm_act_constraint_record_nl_sentence(constraint_record, indexical_records, domain_mt, generation_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 12384L)
    public static SubLObject rc_act_suggest_scenarios(final SubLObject state, final SubLObject nl_sentence) {
        final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
        final SubLObject parsing_mt = rc_state_parsing_mt(state);
        return rkf_scenario_manipulator.sm_act_suggest_scenarios(nl_sentence, domain_interaction_mt, parsing_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 12760L)
    public static SubLObject rc_act_initialize_lhs_from_scenario(final SubLObject state) {
        final SubLObject lhs = rc_ensure_state_lhs(state);
        final SubLObject v_scenario = rc_state_if_scenario(state);
        final SubLObject scenario_phrase = rkf_scenario_manipulator.sm_scenario_phrase(v_scenario);
        final SubLObject constraint_records = rkf_scenario_manipulator.sm_scenario_constraints(v_scenario);
        final SubLObject indexical_records = rkf_scenario_manipulator.sm_scenario_terms(v_scenario);
        rc_set_lhs_constraints(lhs, constraint_records);
        rc_set_lhs_terms(lhs, indexical_records);
        if (rkf_rule_constructor.NIL != scenario_phrase) {
            rc_set_lhs_and_full_sentence(state, scenario_phrase);
        }
        rc_act_compute_and_record_lhs_cycl(state);
        return lhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 13378L)
    public static SubLObject rc_act_compute_and_record_lhs_cycl(final SubLObject state) {
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject constraint_records = rc_lhs_constraints(lhs);
        final SubLObject indexical_records = rc_lhs_terms(lhs);
        rkf_query_constructor.rkf_compute_and_record_variables(state, indexical_records);
        SubLObject cycl = (SubLObject)rkf_rule_constructor.NIL;
        final SubLObject mt = rc_state_domain_interaction_mt(state);
        cycl = rkf_query_constructor.rkf_compute_cycl_from_parts(constraint_records, indexical_records, (SubLObject)rkf_rule_constructor.NIL, (SubLObject)rkf_rule_constructor.NIL, (SubLObject)rkf_rule_constructor.$kw115$INSERT_EXPLICIT_TYPE_CONSTRAINTS, mt);
        rc_set_lhs_cycl(lhs, cycl);
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 13930L)
    public static SubLObject rc_set_lhs_and_full_sentence(final SubLObject state, final SubLObject lhs_nl_sentence) {
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject rhs = rc_state_rhs(state);
        final SubLObject rhs_nl_sentence = rc_rhs_nl_sentence(rhs);
        final SubLObject full_nl_sentence = Sequences.cconcatenate((SubLObject)rkf_rule_constructor.$str113$If_, new SubLObject[] { lhs_nl_sentence, rkf_rule_constructor.$str114$__then_, rhs_nl_sentence });
        rc_set_lhs_nl_sentence(lhs, lhs_nl_sentence);
        rc_set_state_text(state, full_nl_sentence);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 14363L)
    public static SubLObject rkf_add_object_var_map_entry_rc_state_method(final SubLObject v_object, final SubLObject item) {
        return rc_add_state_var_map_entry(v_object, item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 14483L)
    public static SubLObject rc_act_suggest_rhs_constraint(final SubLObject state, final SubLObject nl_sentence) {
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject parsing_mt = rc_state_parsing_mt(state);
        final SubLObject semantic_mt = rc_state_domain_interaction_mt(state);
        if (rkf_rule_constructor.NIL != rc_lhs_p(lhs)) {
            final SubLObject indexical_records = rc_lhs_terms(lhs);
            final SubLObject cycl_sentences = rkf_scenario_manipulator.sm_act_suggest_constraint_cycl_from_text(nl_sentence, indexical_records, parsing_mt, semantic_mt);
            return cycl_sentences;
        }
        return (SubLObject)rkf_rule_constructor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 15004L)
    public static SubLObject rc_act_add_rhs_constraint(final SubLObject state, final SubLObject cycl_sentence) {
        final SubLObject rhs = rc_ensure_state_rhs(state);
        final SubLObject constraint_record = rkf_scenario_manipulator.sm_new_constraint_record(cycl_sentence);
        rc_add_rhs_constraint(rhs, constraint_record);
        rc_act_compute_and_record_rhs_cycl(state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 15290L)
    public static SubLObject rc_act_set_rhs_constraint(final SubLObject state, final SubLObject cycl_sentence) {
        final SubLObject rhs = rc_ensure_state_rhs(state);
        final SubLObject constraint_record = rkf_scenario_manipulator.sm_new_constraint_record(cycl_sentence);
        rc_set_rhs_constraints(rhs, (SubLObject)ConsesLow.list(constraint_record));
        rc_act_compute_and_record_rhs_cycl(state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 15584L)
    public static SubLObject rc_act_suggest_rhs_existentential_type(final SubLObject state, final SubLObject indexical_phrase) {
        final SubLObject parsing_mt = rc_state_parsing_mt(state);
        final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
        return rkf_scenario_manipulator.sm_act_suggest_new_indexical_type(indexical_phrase, parsing_mt, domain_interaction_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 15878L)
    public static SubLObject rc_act_add_existential_of_type(final SubLObject state, final SubLObject indexical_phrase, final SubLObject type) {
        final SubLObject indexical_number = rc_next_indexical_number_of_type(state, type);
        final SubLObject indexical = rkf_scenario_manipulator.sm_new_indexical(type, indexical_number);
        final SubLObject indexical_record = rkf_scenario_manipulator.sm_new_indexical_record(indexical, (SubLObject)ConsesLow.list(indexical_phrase), (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        final SubLObject rhs = rc_state_rhs(state);
        rc_set_rhs_existential_term(rhs, indexical_record);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 16268L)
    public static SubLObject rc_act_compute_and_record_rhs_cycl(final SubLObject state) {
        final SubLObject rhs = rc_state_rhs(state);
        final SubLObject existential = rc_rhs_existential_term(rhs);
        final SubLObject constraint_records = rc_rhs_constraints(rhs);
        final SubLObject lhs = rc_state_lhs(state);
        SubLObject indexical_records = rc_lhs_terms(lhs);
        final SubLObject cycl = (SubLObject)rkf_rule_constructor.NIL;
        if (rkf_rule_constructor.NIL != existential) {
            rkf_query_constructor.rkf_compute_and_record_variables(state, (SubLObject)ConsesLow.list(existential));
            indexical_records = (SubLObject)ConsesLow.cons(existential, indexical_records);
        }
        SubLObject cycl_$1 = (SubLObject)rkf_rule_constructor.NIL;
        cycl_$1 = rkf_query_constructor.rkf_compute_cycl_from_parts(constraint_records, indexical_records, (SubLObject)((rkf_rule_constructor.NIL != existential) ? ConsesLow.list(existential) : rkf_rule_constructor.NIL), (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        rc_set_rhs_cycl(rhs, cycl_$1);
        final SubLObject then_scenario = rc_act_ensure_then_scenario(state);
        final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
        SubLObject cdolist_list_var = constraint_records;
        SubLObject constraint_record = (SubLObject)rkf_rule_constructor.NIL;
        constraint_record = cdolist_list_var.first();
        while (rkf_rule_constructor.NIL != cdolist_list_var) {
            rkf_scenario_manipulator.sm_act_import_constraint(then_scenario, constraint_record, domain_interaction_mt);
            cdolist_list_var = cdolist_list_var.rest();
            constraint_record = cdolist_list_var.first();
        }
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 17228L)
    public static SubLObject rc_act_set_rhs_nl_sentence(final SubLObject state, final SubLObject rhs_nl_sentence) {
        final SubLObject rhs = rc_state_rhs(state);
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject lhs_nl_sentence = rc_lhs_nl_sentence(lhs);
        final SubLObject new_full_sentence = Sequences.cconcatenate((SubLObject)rkf_rule_constructor.$str113$If_, new SubLObject[] { lhs_nl_sentence, rkf_rule_constructor.$str114$__then_, rhs_nl_sentence });
        rc_set_rhs_nl_sentence(rhs, rhs_nl_sentence);
        rc_set_state_text(state, new_full_sentence);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 17609L)
    public static SubLObject rc_next_indexical_number_of_type(final SubLObject state, final SubLObject type) {
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject terms = rc_lhs_terms(lhs);
        SubLObject number = (SubLObject)rkf_rule_constructor.ZERO_INTEGER;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)rkf_rule_constructor.NIL;
        v_term = cdolist_list_var.first();
        while (rkf_rule_constructor.NIL != cdolist_list_var) {
            final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(v_term);
            final SubLObject indexical_type = rkf_scenario_manipulator.sm_indexical_type(indexical);
            final SubLObject indexical_number = rkf_scenario_manipulator.sm_indexical_number(indexical);
            if (type.eql(indexical_type)) {
                number = Numbers.add((SubLObject)rkf_rule_constructor.ONE_INTEGER, Numbers.max(number, indexical_number));
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return number;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 18074L)
    public static SubLObject rc_act_construct_rule_cycl(final SubLObject state) {
        final SubLObject lhs = rc_state_lhs(state);
        final SubLObject lhs_cycl = rc_lhs_cycl(lhs);
        final SubLObject rhs = rc_state_rhs(state);
        final SubLObject rhs_cycl = rc_rhs_cycl(rhs);
        SubLObject rule_cycl = (SubLObject)rkf_rule_constructor.NIL;
        if (rkf_rule_constructor.NIL != lhs_cycl && rkf_rule_constructor.NIL != rhs_cycl) {
            rule_cycl = el_utilities.make_implication(lhs_cycl, rhs_cycl);
        }
        return rule_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 18457L)
    public static SubLObject rc_act_assert_rule(final SubLObject state) {
        final SubLObject rule_cycl = rc_act_construct_rule_cycl(state);
        final SubLObject assert_mt = rc_state_domain_interaction_mt(state);
        final SubLObject result = rkf_assertion_utilities.rkf_assert(rule_cycl, assert_mt, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        SubLObject cdolist_list_var = rc_state_exceptions(state);
        SubLObject exception = (SubLObject)rkf_rule_constructor.NIL;
        exception = cdolist_list_var.first();
        while (rkf_rule_constructor.NIL != cdolist_list_var) {
            final SubLObject except_clause = rc_act_compute_cycl_for_exception(state, exception, rule_cycl, assert_mt);
            rkf_assertion_utilities.rkf_assert(except_clause, assert_mt, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            exception = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 18986L)
    public static SubLObject rc_act_compute_cycl_for_exception(final SubLObject state, final SubLObject exception, final SubLObject rule_cycl, final SubLObject mt) {
        if (rkf_rule_constructor.NIL != list_utilities.singletonP(rkf_scenario_manipulator.sm_scenario_terms(exception)) && rkf_rule_constructor.NIL != list_utilities.singletonP(rkf_scenario_manipulator.sm_scenario_constraints(exception))) {
            return rc_act_compute_except_for_expression(state, exception, rule_cycl, mt);
        }
        return rc_act_compute_except_when_expression(state, exception, rule_cycl, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 19388L)
    public static SubLObject rc_act_compute_except_when_expression(final SubLObject state, final SubLObject exception, SubLObject rule_cycl, final SubLObject mt) {
        final SubLObject constraints = rkf_scenario_manipulator.sm_scenario_constraints(exception);
        final SubLObject existential_terms = (SubLObject)rkf_rule_constructor.NIL;
        final SubLObject assumed_constraints = (SubLObject)rkf_rule_constructor.NIL;
        final SubLObject terms = rkf_scenario_manipulator.sm_scenario_terms(exception);
        SubLObject exception_clause = rkf_query_constructor.rkf_compute_cycl_from_parts(constraints, terms, existential_terms, assumed_constraints, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        if (rkf_rule_constructor.NIL == hlmt.hlmt_equal(mt, rc_state_domain_interaction_mt(state))) {
            rule_cycl = el_utilities.make_binary_formula(rkf_rule_constructor.$const117$ist, mt, rule_cycl);
            exception_clause = rc_adjust_exception_clause_vars_to_foreign_rule(exception_clause, rc_state_var_map(state));
        }
        return el_utilities.make_binary_formula(rkf_rule_constructor.$const118$exceptWhen, exception_clause, rule_cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 20162L)
    public static SubLObject rc_act_compute_except_for_expression(final SubLObject state, final SubLObject exception, SubLObject rule_cycl, final SubLObject mt) {
        final SubLObject constraints = rkf_scenario_manipulator.sm_scenario_constraints(exception);
        final SubLObject exception_term = rc_find_the_exception_term(constraints);
        if (rkf_rule_constructor.NIL == hlmt.hlmt_equal(mt, rc_state_domain_interaction_mt(state))) {
            rule_cycl = el_utilities.make_binary_formula(rkf_rule_constructor.$const117$ist, mt, rule_cycl);
        }
        return el_utilities.make_binary_formula(rkf_rule_constructor.$const119$exceptFor, exception_term, rule_cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 20597L)
    public static SubLObject rc_find_the_exception_term(final SubLObject constraints) {
        final SubLObject constraint = constraints.first();
        final SubLObject formula = rkf_scenario_manipulator.sm_constraint_record_sentence(constraint);
        return (rkf_rule_constructor.NIL != rkf_scenario_manipulator.sm_indexical_p(cycl_utilities.formula_arg1(formula, (SubLObject)rkf_rule_constructor.UNPROVIDED))) ? cycl_utilities.formula_arg2(formula, (SubLObject)rkf_rule_constructor.UNPROVIDED) : cycl_utilities.formula_arg1(formula, (SubLObject)rkf_rule_constructor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 20954L)
    public static SubLObject rc_adjust_exception_clause_vars_to_foreign_rule(final SubLObject clause, final SubLObject var_map) {
        final SubLObject new_clause = el_utilities.copy_formula(clause);
        SubLObject cdolist_list_var = var_map;
        SubLObject var = (SubLObject)rkf_rule_constructor.NIL;
        var = cdolist_list_var.first();
        while (rkf_rule_constructor.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = var;
            SubLObject el_variable = (SubLObject)rkf_rule_constructor.NIL;
            SubLObject indexical = (SubLObject)rkf_rule_constructor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_rule_constructor.$list120);
            el_variable = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_rule_constructor.$list120);
            indexical = current.first();
            current = current.rest();
            if (rkf_rule_constructor.NIL == current) {
                final SubLObject scenario_el_variable = rkf_scenario_manipulator.sm_indexical_record_var(indexical);
                if (!el_variable.eql(scenario_el_variable)) {
                    conses_high.nsubst(el_variable, scenario_el_variable, new_clause, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_rule_constructor.$list120);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return new_clause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 21667L)
    public static SubLObject rc_act_construct_exception_scenario(final SubLObject state) {
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario((SubLObject)rkf_rule_constructor.$str121$Exceptions, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject varmap = cdolist_list_var = rc_state_var_map(state);
        SubLObject variable = (SubLObject)rkf_rule_constructor.NIL;
        variable = cdolist_list_var.first();
        while (rkf_rule_constructor.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable;
            SubLObject el_variable = (SubLObject)rkf_rule_constructor.NIL;
            SubLObject indexical = (SubLObject)rkf_rule_constructor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_rule_constructor.$list120);
            el_variable = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_rule_constructor.$list120);
            indexical = current.first();
            current = current.rest();
            if (rkf_rule_constructor.NIL == current) {
                rkf_scenario_manipulator.sm_act_share_scenario_term(v_scenario, indexical);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_rule_constructor.$list120);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 22137L)
    public static SubLObject rc_act_add_new_exception_scenario(final SubLObject state, final SubLObject exception) {
        return rc_add_state_exception(state, exception);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 22259L)
    public static SubLObject rc_act_exception_constraints(final SubLObject state, final SubLObject exception) {
        return rkf_scenario_manipulator.sm_scenario_constraints(exception);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 22388L)
    public static SubLObject rc_act_ensure_then_scenario(final SubLObject state) {
        SubLObject v_scenario = rc_state_then_scenario(state);
        if (rkf_rule_constructor.NIL == rkf_scenario_manipulator.sm_scenario_p(v_scenario)) {
            v_scenario = rc_act_construct_then_scenario(state);
            rc_set_state_then_scenario(state, v_scenario);
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 22759L)
    public static SubLObject rc_act_construct_then_scenario(final SubLObject state) {
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_new_scenario((SubLObject)rkf_rule_constructor.$str122$Then_Clause, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject varmap = cdolist_list_var = rc_state_var_map(state);
        SubLObject variable = (SubLObject)rkf_rule_constructor.NIL;
        variable = cdolist_list_var.first();
        while (rkf_rule_constructor.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = variable;
            SubLObject el_variable = (SubLObject)rkf_rule_constructor.NIL;
            SubLObject indexical = (SubLObject)rkf_rule_constructor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_rule_constructor.$list120);
            el_variable = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_rule_constructor.$list120);
            indexical = current.first();
            current = current.rest();
            if (rkf_rule_constructor.NIL == current) {
                rkf_scenario_manipulator.sm_act_share_scenario_term(v_scenario, indexical);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_rule_constructor.$list120);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        }
        return v_scenario;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 23122L)
    public static SubLObject rc_act_update_then_scenario(final SubLObject state, final SubLObject then_scenario) {
        final SubLObject constraints = rkf_scenario_manipulator.sm_scenario_constraints(then_scenario);
        rc_set_rhs_constraints(rc_state_rhs(state), constraints);
        rc_act_compute_and_record_rhs_cycl(state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 23378L)
    public static SubLObject rc_act_initialize_rule_for_consequent(final SubLObject state, final SubLObject consequent, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
        final SubLObject generation_mt = rc_state_generation_mt(state);
        thread.resetMultipleValues();
        final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl(consequent, domain_interaction_mt, generation_mt);
        final SubLObject var_map = thread.secondMultipleValue();
        thread.resetMultipleValues();
        rc_set_state_var_map(state, var_map);
        final SubLObject lhs = rc_ensure_state_lhs(state);
        rc_set_lhs_terms(lhs, Mapping.mapcar((SubLObject)rkf_rule_constructor.$sym123$SECOND, var_map));
        final SubLObject rhs = rc_ensure_state_rhs(state);
        rc_set_rhs_cycl(rhs, consequent);
        rc_set_rhs_nl_sentence(rhs, phrase);
        rc_set_rhs_constraints(rhs, rkf_scenario_manipulator.sm_scenario_constraints(v_scenario));
        rkf_scenario_manipulator.sm_act_remove_all_constraints(v_scenario, domain_interaction_mt);
        rc_set_state_if_scenario(state, v_scenario);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 24511L)
    public static SubLObject rc_act_initialize_rule_from_cycl(final SubLObject state, final SubLObject implication_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_rule_constructor.NIL != rc_valid_implication(implication_sentence)) {
            final SubLObject domain_interaction_mt = rc_state_domain_interaction_mt(state);
            final SubLObject generation_mt = rc_state_generation_mt(state);
            thread.resetMultipleValues();
            final SubLObject connective = el_utilities.unmake_binary_formula(implication_sentence);
            final SubLObject lhs_sentence = thread.secondMultipleValue();
            final SubLObject rhs_sentence = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject v_scenario = rkf_scenario_manipulator.sm_act_initialize_scenario_from_cycl(lhs_sentence, domain_interaction_mt, generation_mt);
            final SubLObject var_map = thread.secondMultipleValue();
            thread.resetMultipleValues();
            rc_set_state_var_map(state, var_map);
            rc_set_state_if_scenario(state, v_scenario);
            final SubLObject lhs = rc_act_initialize_lhs_from_scenario(state);
            final SubLObject rhs = rc_act_initialize_rhs_from_cycl(state, rhs_sentence);
            rc_set_state_lhs(state, lhs);
            rc_set_state_rhs(state, rhs);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 25349L)
    public static SubLObject rc_valid_implication(final SubLObject cycl_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_rule_constructor.NIL == el_utilities.el_implication_p(cycl_utilities.hl_to_el(cycl_sentence))) {
            return (SubLObject)rkf_rule_constructor.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject connective = el_utilities.unmake_binary_formula(cycl_sentence);
        final SubLObject lhs = thread.secondMultipleValue();
        final SubLObject rhs = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((rkf_rule_constructor.NIL == el_utilities.el_conjunction_p(lhs) && rkf_rule_constructor.NIL == el_utilities.atomic_sentenceP(lhs)) || rkf_rule_constructor.NIL == el_utilities.atomic_sentenceP(rhs)) {
            return (SubLObject)rkf_rule_constructor.NIL;
        }
        return (SubLObject)rkf_rule_constructor.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 25993L)
    public static SubLObject rc_act_initialize_rhs_from_cycl(final SubLObject state, final SubLObject cycl_sentence) {
        final SubLObject rhs = rc_ensure_state_rhs(state);
        final SubLObject var_map = rc_state_var_map(state);
        final SubLObject rhs_cycl = el_utilities.copy_formula(cycl_sentence);
        SubLObject cdolist_list_var = var_map;
        SubLObject var_map_entry = (SubLObject)rkf_rule_constructor.NIL;
        var_map_entry = cdolist_list_var.first();
        while (rkf_rule_constructor.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = var_map_entry;
            SubLObject var = (SubLObject)rkf_rule_constructor.NIL;
            SubLObject indexical_record = (SubLObject)rkf_rule_constructor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_rule_constructor.$list124);
            var = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_rule_constructor.$list124);
            indexical_record = current.first();
            current = current.rest();
            if (rkf_rule_constructor.NIL == current) {
                final SubLObject indexical = rkf_scenario_manipulator.sm_indexical_record_indexical(indexical_record);
                cycl_utilities.expression_nsubst(indexical, var, rhs_cycl, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_rule_constructor.$list124);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var_map_entry = cdolist_list_var.first();
        }
        rc_act_set_rhs_constraint(state, rhs_cycl);
        final SubLObject constraint_record = rc_rhs_constraints(rhs).first();
        rc_act_lhs_constraint_nl_sentence(state, constraint_record);
        rc_act_compute_and_record_rhs_cycl(state);
        return rhs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 26676L)
    public static SubLObject rkf_find_assertion_for_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == rkf_rule_constructor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLObject assertions = rkf_similar_assertions_locator(sentence, mt);
        SubLObject solution = (SubLObject)rkf_rule_constructor.NIL;
        if (rkf_rule_constructor.NIL == solution) {
            SubLObject csome_list_var = assertions;
            SubLObject assertion = (SubLObject)rkf_rule_constructor.NIL;
            assertion = csome_list_var.first();
            while (rkf_rule_constructor.NIL == solution && rkf_rule_constructor.NIL != csome_list_var) {
                final SubLObject found = czer_meta.find_assertion_cycl(sentence, assertions_high.assertion_mt(assertion));
                if (found.eql(assertion)) {
                    solution = assertion;
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            }
        }
        return solution;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 27272L)
    public static SubLObject rkf_similar_assertions_locator(final SubLObject sentence, SubLObject mt) {
        if (mt == rkf_rule_constructor.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms = list_utilities.remove_if_not((SubLObject)rkf_rule_constructor.$sym125$INDEXED_TERM_P, rkf_gather_similar_assertion_terms(sentence, mt), (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        SubLObject assertions = (SubLObject)rkf_rule_constructor.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_rule_constructor.$sym126$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            assertions = virtual_indexing.assertions_mentioning_terms(terms, (SubLObject)rkf_rule_constructor.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-rule-constructor.lisp", position = 27613L)
    public static SubLObject rkf_gather_similar_assertion_terms(final SubLObject sentence, final SubLObject mt) {
        final SubLObject cnf = czer_main.el_to_hl(sentence, mt);
        return virtual_indexing.terms_for_overlap_index(cnf);
    }
    
    public static SubLObject declare_rkf_rule_constructor_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_rule_constructor", "with_rc_lock", "WITH-RC-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_find_lhs_by_id", "RC-FIND-LHS-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_find_lhs_by_id_string", "RC-FIND-LHS-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_find_rhs_by_id", "RC-FIND-RHS-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_find_rhs_by_id_string", "RC-FIND-RHS-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_find_state_by_id", "RC-FIND-STATE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_find_state_by_id_string", "RC-FIND-STATE-BY-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_next_id", "RC-NEXT-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_add_object", "RC-ADD-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_rem_object", "RC-REM-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_find_object_by_id", "RC-FIND-OBJECT-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_lhs_print_function_trampoline", "RC-LHS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_lhs_p", "RC-LHS-P", 1, 0, false);
        new $rc_lhs_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_lhs_id", "RC-LHS-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_lhs_nl_sentence", "RC-LHS-NL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_lhs_constraints", "RC-LHS-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_lhs_terms", "RC-LHS-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_lhs_cycl", "RC-LHS-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_lhs_id", "_CSETF-RC-LHS-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_lhs_nl_sentence", "_CSETF-RC-LHS-NL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_lhs_constraints", "_CSETF-RC-LHS-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_lhs_terms", "_CSETF-RC-LHS-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_lhs_cycl", "_CSETF-RC-LHS-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "make_rc_lhs", "MAKE-RC-LHS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "visit_defstruct_rc_lhs", "VISIT-DEFSTRUCT-RC-LHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "visit_defstruct_object_rc_lhs_method", "VISIT-DEFSTRUCT-OBJECT-RC-LHS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_new_lhs", "RC-NEW-LHS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_cleanup_lhs", "RC-CLEANUP-LHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_lhs_nl_sentence", "RC-SET-LHS-NL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_lhs_constraints", "RC-SET-LHS-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_lhs_terms", "RC-SET-LHS-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_lhs_cycl", "RC-SET-LHS-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_rhs_print_function_trampoline", "RC-RHS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_rhs_p", "RC-RHS-P", 1, 0, false);
        new $rc_rhs_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_rhs_id", "RC-RHS-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_rhs_nl_sentence", "RC-RHS-NL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_rhs_constraints", "RC-RHS-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_rhs_existential_term", "RC-RHS-EXISTENTIAL-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_rhs_cycl", "RC-RHS-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_rhs_id", "_CSETF-RC-RHS-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_rhs_nl_sentence", "_CSETF-RC-RHS-NL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_rhs_constraints", "_CSETF-RC-RHS-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_rhs_existential_term", "_CSETF-RC-RHS-EXISTENTIAL-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_rhs_cycl", "_CSETF-RC-RHS-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "make_rc_rhs", "MAKE-RC-RHS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "visit_defstruct_rc_rhs", "VISIT-DEFSTRUCT-RC-RHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "visit_defstruct_object_rc_rhs_method", "VISIT-DEFSTRUCT-OBJECT-RC-RHS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_new_rhs", "RC-NEW-RHS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_cleanup_rhs", "RC-CLEANUP-RHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_rhs_nl_sentence", "RC-SET-RHS-NL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_rhs_constraints", "RC-SET-RHS-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_add_rhs_constraint", "RC-ADD-RHS-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_rhs_existential_term", "RC-SET-RHS-EXISTENTIAL-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_rhs_cycl", "RC-SET-RHS-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_print_function_trampoline", "RC-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_p", "RC-STATE-P", 1, 0, false);
        new $rc_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_id", "RC-STATE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_text", "RC-STATE-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_interaction", "RC-STATE-INTERACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_if_scenario", "RC-STATE-IF-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_then_scenario", "RC-STATE-THEN-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_lhs", "RC-STATE-LHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_rhs", "RC-STATE-RHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_parsing_mt", "RC-STATE-PARSING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_generation_mt", "RC-STATE-GENERATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_domain_mt", "RC-STATE-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_domain_interaction_mt", "RC-STATE-DOMAIN-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_var_map", "RC-STATE-VAR-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_exceptions", "RC-STATE-EXCEPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_id", "_CSETF-RC-STATE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_text", "_CSETF-RC-STATE-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_interaction", "_CSETF-RC-STATE-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_if_scenario", "_CSETF-RC-STATE-IF-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_then_scenario", "_CSETF-RC-STATE-THEN-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_lhs", "_CSETF-RC-STATE-LHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_rhs", "_CSETF-RC-STATE-RHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_parsing_mt", "_CSETF-RC-STATE-PARSING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_generation_mt", "_CSETF-RC-STATE-GENERATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_domain_mt", "_CSETF-RC-STATE-DOMAIN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_domain_interaction_mt", "_CSETF-RC-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_var_map", "_CSETF-RC-STATE-VAR-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "_csetf_rc_state_exceptions", "_CSETF-RC-STATE-EXCEPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "make_rc_state", "MAKE-RC-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "visit_defstruct_rc_state", "VISIT-DEFSTRUCT-RC-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "visit_defstruct_object_rc_state_method", "VISIT-DEFSTRUCT-OBJECT-RC-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_new_state", "RC-NEW-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_cleanup_state", "RC-CLEANUP-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_text", "RC-SET-STATE-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_interaction", "RC-SET-STATE-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_if_scenario", "RC-SET-STATE-IF-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_then_scenario", "RC-SET-STATE-THEN-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_lhs", "RC-SET-STATE-LHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_rhs", "RC-SET-STATE-RHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_parsing_mt", "RC-SET-STATE-PARSING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_generation_mt", "RC-SET-STATE-GENERATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_domain_mt", "RC-SET-STATE-DOMAIN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_domain_interaction_mt", "RC-SET-STATE-DOMAIN-INTERACTION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_add_state_var_map_entry", "RC-ADD-STATE-VAR-MAP-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_var_map", "RC-SET-STATE-VAR-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_state_exceptions", "RC-SET-STATE-EXCEPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_add_state_exception", "RC-ADD-STATE-EXCEPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_ensure_state_lhs", "RC-ENSURE-STATE-LHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_ensure_state_rhs", "RC-ENSURE-STATE-RHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_state_complete_lhs_p", "RC-STATE-COMPLETE-LHS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_rule_ready_p", "RC-RULE-READY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_new_state", "RC-ACT-NEW-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_new_state_with_text", "RC-ACT-NEW-STATE-WITH-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_new_state_with_if_then", "RC-ACT-NEW-STATE-WITH-IF-THEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_note_state_interaction", "RC-ACT-NOTE-STATE-INTERACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_note_state_if_scenario", "RC-ACT-NOTE-STATE-IF-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_note_state_then_scenario", "RC-ACT-NOTE-STATE-THEN-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_initialize_state_context", "RC-ACT-INITIALIZE-STATE-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_lhs_constraint_nl_sentence", "RC-ACT-LHS-CONSTRAINT-NL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_suggest_scenarios", "RC-ACT-SUGGEST-SCENARIOS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_initialize_lhs_from_scenario", "RC-ACT-INITIALIZE-LHS-FROM-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_compute_and_record_lhs_cycl", "RC-ACT-COMPUTE-AND-RECORD-LHS-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_set_lhs_and_full_sentence", "RC-SET-LHS-AND-FULL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rkf_add_object_var_map_entry_rc_state_method", "RKF-ADD-OBJECT-VAR-MAP-ENTRY-RC-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_suggest_rhs_constraint", "RC-ACT-SUGGEST-RHS-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_add_rhs_constraint", "RC-ACT-ADD-RHS-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_set_rhs_constraint", "RC-ACT-SET-RHS-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_suggest_rhs_existentential_type", "RC-ACT-SUGGEST-RHS-EXISTENTENTIAL-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_add_existential_of_type", "RC-ACT-ADD-EXISTENTIAL-OF-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_compute_and_record_rhs_cycl", "RC-ACT-COMPUTE-AND-RECORD-RHS-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_set_rhs_nl_sentence", "RC-ACT-SET-RHS-NL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_next_indexical_number_of_type", "RC-NEXT-INDEXICAL-NUMBER-OF-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_construct_rule_cycl", "RC-ACT-CONSTRUCT-RULE-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_assert_rule", "RC-ACT-ASSERT-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_compute_cycl_for_exception", "RC-ACT-COMPUTE-CYCL-FOR-EXCEPTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_compute_except_when_expression", "RC-ACT-COMPUTE-EXCEPT-WHEN-EXPRESSION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_compute_except_for_expression", "RC-ACT-COMPUTE-EXCEPT-FOR-EXPRESSION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_find_the_exception_term", "RC-FIND-THE-EXCEPTION-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_adjust_exception_clause_vars_to_foreign_rule", "RC-ADJUST-EXCEPTION-CLAUSE-VARS-TO-FOREIGN-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_construct_exception_scenario", "RC-ACT-CONSTRUCT-EXCEPTION-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_add_new_exception_scenario", "RC-ACT-ADD-NEW-EXCEPTION-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_exception_constraints", "RC-ACT-EXCEPTION-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_ensure_then_scenario", "RC-ACT-ENSURE-THEN-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_construct_then_scenario", "RC-ACT-CONSTRUCT-THEN-SCENARIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_update_then_scenario", "RC-ACT-UPDATE-THEN-SCENARIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_initialize_rule_for_consequent", "RC-ACT-INITIALIZE-RULE-FOR-CONSEQUENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_initialize_rule_from_cycl", "RC-ACT-INITIALIZE-RULE-FROM-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_valid_implication", "RC-VALID-IMPLICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rc_act_initialize_rhs_from_cycl", "RC-ACT-INITIALIZE-RHS-FROM-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rkf_find_assertion_for_sentence", "RKF-FIND-ASSERTION-FOR-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rkf_similar_assertions_locator", "RKF-SIMILAR-ASSERTIONS-LOCATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_rule_constructor", "rkf_gather_similar_assertion_terms", "RKF-GATHER-SIMILAR-ASSERTION-TERMS", 2, 0, false);
        return (SubLObject)rkf_rule_constructor.NIL;
    }
    
    public static SubLObject init_rkf_rule_constructor_file() {
        rkf_rule_constructor.$rc_lock$ = SubLFiles.deflexical("*RC-LOCK*", Locks.make_lock((SubLObject)rkf_rule_constructor.$str0$Rule_Constructor_Lock));
        rkf_rule_constructor.$rc_isg$ = SubLFiles.deflexical("*RC-ISG*", (rkf_rule_constructor.NIL != Symbols.boundp((SubLObject)rkf_rule_constructor.$sym3$_RC_ISG_)) ? rkf_rule_constructor.$rc_isg$.getGlobalValue() : integer_sequence_generator.new_integer_sequence_generator((SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED));
        rkf_rule_constructor.$rc_index$ = SubLFiles.deflexical("*RC-INDEX*", (rkf_rule_constructor.NIL != Symbols.boundp((SubLObject)rkf_rule_constructor.$sym4$_RC_INDEX_)) ? rkf_rule_constructor.$rc_index$.getGlobalValue() : dictionary.new_dictionary((SubLObject)rkf_rule_constructor.UNPROVIDED, (SubLObject)rkf_rule_constructor.UNPROVIDED));
        rkf_rule_constructor.$dtp_rc_lhs$ = SubLFiles.defconstant("*DTP-RC-LHS*", (SubLObject)rkf_rule_constructor.$sym5$RC_LHS);
        rkf_rule_constructor.$dtp_rc_rhs$ = SubLFiles.defconstant("*DTP-RC-RHS*", (SubLObject)rkf_rule_constructor.$sym38$RC_RHS);
        rkf_rule_constructor.$dtp_rc_state$ = SubLFiles.defconstant("*DTP-RC-STATE*", (SubLObject)rkf_rule_constructor.$sym61$RC_STATE);
        return (SubLObject)rkf_rule_constructor.NIL;
    }
    
    public static SubLObject setup_rkf_rule_constructor_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_rule_constructor.$sym3$_RC_ISG_);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_rule_constructor.$sym4$_RC_INDEX_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_rule_constructor.$dtp_rc_lhs$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_rule_constructor.$sym12$RC_LHS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_rule_constructor.$list13);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym14$RC_LHS_ID, (SubLObject)rkf_rule_constructor.$sym15$_CSETF_RC_LHS_ID);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym16$RC_LHS_NL_SENTENCE, (SubLObject)rkf_rule_constructor.$sym17$_CSETF_RC_LHS_NL_SENTENCE);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym18$RC_LHS_CONSTRAINTS, (SubLObject)rkf_rule_constructor.$sym19$_CSETF_RC_LHS_CONSTRAINTS);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym20$RC_LHS_TERMS, (SubLObject)rkf_rule_constructor.$sym21$_CSETF_RC_LHS_TERMS);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym22$RC_LHS_CYCL, (SubLObject)rkf_rule_constructor.$sym23$_CSETF_RC_LHS_CYCL);
        Equality.identity((SubLObject)rkf_rule_constructor.$sym5$RC_LHS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_rule_constructor.$dtp_rc_lhs$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_rule_constructor.$sym34$VISIT_DEFSTRUCT_OBJECT_RC_LHS_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_rule_constructor.$dtp_rc_rhs$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_rule_constructor.$sym44$RC_RHS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_rule_constructor.$list45);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym46$RC_RHS_ID, (SubLObject)rkf_rule_constructor.$sym47$_CSETF_RC_RHS_ID);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym48$RC_RHS_NL_SENTENCE, (SubLObject)rkf_rule_constructor.$sym49$_CSETF_RC_RHS_NL_SENTENCE);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym50$RC_RHS_CONSTRAINTS, (SubLObject)rkf_rule_constructor.$sym51$_CSETF_RC_RHS_CONSTRAINTS);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym52$RC_RHS_EXISTENTIAL_TERM, (SubLObject)rkf_rule_constructor.$sym53$_CSETF_RC_RHS_EXISTENTIAL_TERM);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym54$RC_RHS_CYCL, (SubLObject)rkf_rule_constructor.$sym55$_CSETF_RC_RHS_CYCL);
        Equality.identity((SubLObject)rkf_rule_constructor.$sym38$RC_RHS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_rule_constructor.$dtp_rc_rhs$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_rule_constructor.$sym58$VISIT_DEFSTRUCT_OBJECT_RC_RHS_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_rule_constructor.$dtp_rc_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_rule_constructor.$sym67$RC_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_rule_constructor.$list68);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym69$RC_STATE_ID, (SubLObject)rkf_rule_constructor.$sym70$_CSETF_RC_STATE_ID);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym71$RC_STATE_TEXT, (SubLObject)rkf_rule_constructor.$sym72$_CSETF_RC_STATE_TEXT);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym73$RC_STATE_INTERACTION, (SubLObject)rkf_rule_constructor.$sym74$_CSETF_RC_STATE_INTERACTION);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym75$RC_STATE_IF_SCENARIO, (SubLObject)rkf_rule_constructor.$sym76$_CSETF_RC_STATE_IF_SCENARIO);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym77$RC_STATE_THEN_SCENARIO, (SubLObject)rkf_rule_constructor.$sym78$_CSETF_RC_STATE_THEN_SCENARIO);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym79$RC_STATE_LHS, (SubLObject)rkf_rule_constructor.$sym80$_CSETF_RC_STATE_LHS);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym81$RC_STATE_RHS, (SubLObject)rkf_rule_constructor.$sym82$_CSETF_RC_STATE_RHS);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym83$RC_STATE_PARSING_MT, (SubLObject)rkf_rule_constructor.$sym84$_CSETF_RC_STATE_PARSING_MT);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym85$RC_STATE_GENERATION_MT, (SubLObject)rkf_rule_constructor.$sym86$_CSETF_RC_STATE_GENERATION_MT);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym87$RC_STATE_DOMAIN_MT, (SubLObject)rkf_rule_constructor.$sym88$_CSETF_RC_STATE_DOMAIN_MT);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym89$RC_STATE_DOMAIN_INTERACTION_MT, (SubLObject)rkf_rule_constructor.$sym90$_CSETF_RC_STATE_DOMAIN_INTERACTION_MT);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym91$RC_STATE_VAR_MAP, (SubLObject)rkf_rule_constructor.$sym92$_CSETF_RC_STATE_VAR_MAP);
        Structures.def_csetf((SubLObject)rkf_rule_constructor.$sym93$RC_STATE_EXCEPTIONS, (SubLObject)rkf_rule_constructor.$sym94$_CSETF_RC_STATE_EXCEPTIONS);
        Equality.identity((SubLObject)rkf_rule_constructor.$sym61$RC_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_rule_constructor.$dtp_rc_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_rule_constructor.$sym108$VISIT_DEFSTRUCT_OBJECT_RC_STATE_METHOD));
        Structures.register_method(rkf_query_constructor.$rkf_add_object_var_map_entry_method_table$.getGlobalValue(), rkf_rule_constructor.$dtp_rc_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_rule_constructor.$sym116$RKF_ADD_OBJECT_VAR_MAP_ENTRY_RC_STATE_METHOD));
        return (SubLObject)rkf_rule_constructor.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_rule_constructor_file();
    }
    
    public void initializeVariables() {
        init_rkf_rule_constructor_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_rule_constructor_file();
    }
    
    static {
        me = (SubLFile)new rkf_rule_constructor();
        rkf_rule_constructor.$rc_lock$ = null;
        rkf_rule_constructor.$rc_isg$ = null;
        rkf_rule_constructor.$rc_index$ = null;
        rkf_rule_constructor.$dtp_rc_lhs$ = null;
        rkf_rule_constructor.$dtp_rc_rhs$ = null;
        rkf_rule_constructor.$dtp_rc_state$ = null;
        $str0$Rule_Constructor_Lock = SubLObjectFactory.makeString("Rule Constructor Lock");
        $sym1$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RC-LOCK*"));
        $sym3$_RC_ISG_ = SubLObjectFactory.makeSymbol("*RC-ISG*");
        $sym4$_RC_INDEX_ = SubLObjectFactory.makeSymbol("*RC-INDEX*");
        $sym5$RC_LHS = SubLObjectFactory.makeSymbol("RC-LHS");
        $sym6$RC_LHS_P = SubLObjectFactory.makeSymbol("RC-LHS-P");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("NL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("NL-SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeKeyword("TERMS"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RC-LHS-ID"), (SubLObject)SubLObjectFactory.makeSymbol("RC-LHS-NL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RC-LHS-CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("RC-LHS-TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("RC-LHS-CYCL"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RC-LHS-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RC-LHS-NL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RC-LHS-CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RC-LHS-TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RC-LHS-CYCL"));
        $sym11$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym12$RC_LHS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RC-LHS-PRINT-FUNCTION-TRAMPOLINE");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RC-LHS-P"));
        $sym14$RC_LHS_ID = SubLObjectFactory.makeSymbol("RC-LHS-ID");
        $sym15$_CSETF_RC_LHS_ID = SubLObjectFactory.makeSymbol("_CSETF-RC-LHS-ID");
        $sym16$RC_LHS_NL_SENTENCE = SubLObjectFactory.makeSymbol("RC-LHS-NL-SENTENCE");
        $sym17$_CSETF_RC_LHS_NL_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-RC-LHS-NL-SENTENCE");
        $sym18$RC_LHS_CONSTRAINTS = SubLObjectFactory.makeSymbol("RC-LHS-CONSTRAINTS");
        $sym19$_CSETF_RC_LHS_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-RC-LHS-CONSTRAINTS");
        $sym20$RC_LHS_TERMS = SubLObjectFactory.makeSymbol("RC-LHS-TERMS");
        $sym21$_CSETF_RC_LHS_TERMS = SubLObjectFactory.makeSymbol("_CSETF-RC-LHS-TERMS");
        $sym22$RC_LHS_CYCL = SubLObjectFactory.makeSymbol("RC-LHS-CYCL");
        $sym23$_CSETF_RC_LHS_CYCL = SubLObjectFactory.makeSymbol("_CSETF-RC-LHS-CYCL");
        $kw24$ID = SubLObjectFactory.makeKeyword("ID");
        $kw25$NL_SENTENCE = SubLObjectFactory.makeKeyword("NL-SENTENCE");
        $kw26$CONSTRAINTS = SubLObjectFactory.makeKeyword("CONSTRAINTS");
        $kw27$TERMS = SubLObjectFactory.makeKeyword("TERMS");
        $kw28$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $str29$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw30$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym31$MAKE_RC_LHS = SubLObjectFactory.makeSymbol("MAKE-RC-LHS");
        $kw32$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw33$END = SubLObjectFactory.makeKeyword("END");
        $sym34$VISIT_DEFSTRUCT_OBJECT_RC_LHS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RC-LHS-METHOD");
        $sym35$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym36$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym37$POSSIBLY_SENTENCE_P = SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P");
        $sym38$RC_RHS = SubLObjectFactory.makeSymbol("RC-RHS");
        $sym39$RC_RHS_P = SubLObjectFactory.makeSymbol("RC-RHS-P");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("NL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTENTIAL-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("NL-SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTENTIAL-TERM"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RC-RHS-ID"), (SubLObject)SubLObjectFactory.makeSymbol("RC-RHS-NL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RC-RHS-CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("RC-RHS-EXISTENTIAL-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("RC-RHS-CYCL"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RC-RHS-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RC-RHS-NL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RC-RHS-CONSTRAINTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RC-RHS-EXISTENTIAL-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RC-RHS-CYCL"));
        $sym44$RC_RHS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RC-RHS-PRINT-FUNCTION-TRAMPOLINE");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RC-RHS-P"));
        $sym46$RC_RHS_ID = SubLObjectFactory.makeSymbol("RC-RHS-ID");
        $sym47$_CSETF_RC_RHS_ID = SubLObjectFactory.makeSymbol("_CSETF-RC-RHS-ID");
        $sym48$RC_RHS_NL_SENTENCE = SubLObjectFactory.makeSymbol("RC-RHS-NL-SENTENCE");
        $sym49$_CSETF_RC_RHS_NL_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-RC-RHS-NL-SENTENCE");
        $sym50$RC_RHS_CONSTRAINTS = SubLObjectFactory.makeSymbol("RC-RHS-CONSTRAINTS");
        $sym51$_CSETF_RC_RHS_CONSTRAINTS = SubLObjectFactory.makeSymbol("_CSETF-RC-RHS-CONSTRAINTS");
        $sym52$RC_RHS_EXISTENTIAL_TERM = SubLObjectFactory.makeSymbol("RC-RHS-EXISTENTIAL-TERM");
        $sym53$_CSETF_RC_RHS_EXISTENTIAL_TERM = SubLObjectFactory.makeSymbol("_CSETF-RC-RHS-EXISTENTIAL-TERM");
        $sym54$RC_RHS_CYCL = SubLObjectFactory.makeSymbol("RC-RHS-CYCL");
        $sym55$_CSETF_RC_RHS_CYCL = SubLObjectFactory.makeSymbol("_CSETF-RC-RHS-CYCL");
        $kw56$EXISTENTIAL_TERM = SubLObjectFactory.makeKeyword("EXISTENTIAL-TERM");
        $sym57$MAKE_RC_RHS = SubLObjectFactory.makeSymbol("MAKE-RC-RHS");
        $sym58$VISIT_DEFSTRUCT_OBJECT_RC_RHS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RC-RHS-METHOD");
        $sym59$SM_CONSTRAINT_RECORD_P = SubLObjectFactory.makeSymbol("SM-CONSTRAINT-RECORD-P");
        $sym60$SM_INDEXICAL_RECORD_P = SubLObjectFactory.makeSymbol("SM-INDEXICAL-RECORD-P");
        $sym61$RC_STATE = SubLObjectFactory.makeSymbol("RC-STATE");
        $sym62$RC_STATE_P = SubLObjectFactory.makeSymbol("RC-STATE-P");
        $list63 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("TEXT"), SubLObjectFactory.makeSymbol("INTERACTION"), SubLObjectFactory.makeSymbol("IF-SCENARIO"), SubLObjectFactory.makeSymbol("THEN-SCENARIO"), SubLObjectFactory.makeSymbol("LHS"), SubLObjectFactory.makeSymbol("RHS"), SubLObjectFactory.makeSymbol("PARSING-MT"), SubLObjectFactory.makeSymbol("GENERATION-MT"), SubLObjectFactory.makeSymbol("DOMAIN-MT"), SubLObjectFactory.makeSymbol("DOMAIN-INTERACTION-MT"), SubLObjectFactory.makeSymbol("VAR-MAP"), SubLObjectFactory.makeSymbol("EXCEPTIONS") });
        $list64 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("TEXT"), SubLObjectFactory.makeKeyword("INTERACTION"), SubLObjectFactory.makeKeyword("IF-SCENARIO"), SubLObjectFactory.makeKeyword("THEN-SCENARIO"), SubLObjectFactory.makeKeyword("LHS"), SubLObjectFactory.makeKeyword("RHS"), SubLObjectFactory.makeKeyword("PARSING-MT"), SubLObjectFactory.makeKeyword("GENERATION-MT"), SubLObjectFactory.makeKeyword("DOMAIN-MT"), SubLObjectFactory.makeKeyword("DOMAIN-INTERACTION-MT"), SubLObjectFactory.makeKeyword("VAR-MAP"), SubLObjectFactory.makeKeyword("EXCEPTIONS") });
        $list65 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("RC-STATE-ID"), SubLObjectFactory.makeSymbol("RC-STATE-TEXT"), SubLObjectFactory.makeSymbol("RC-STATE-INTERACTION"), SubLObjectFactory.makeSymbol("RC-STATE-IF-SCENARIO"), SubLObjectFactory.makeSymbol("RC-STATE-THEN-SCENARIO"), SubLObjectFactory.makeSymbol("RC-STATE-LHS"), SubLObjectFactory.makeSymbol("RC-STATE-RHS"), SubLObjectFactory.makeSymbol("RC-STATE-PARSING-MT"), SubLObjectFactory.makeSymbol("RC-STATE-GENERATION-MT"), SubLObjectFactory.makeSymbol("RC-STATE-DOMAIN-MT"), SubLObjectFactory.makeSymbol("RC-STATE-DOMAIN-INTERACTION-MT"), SubLObjectFactory.makeSymbol("RC-STATE-VAR-MAP"), SubLObjectFactory.makeSymbol("RC-STATE-EXCEPTIONS") });
        $list66 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-ID"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-TEXT"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-INTERACTION"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-IF-SCENARIO"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-THEN-SCENARIO"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-LHS"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-RHS"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-PARSING-MT"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-GENERATION-MT"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-DOMAIN-MT"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-DOMAIN-INTERACTION-MT"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-VAR-MAP"), SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-EXCEPTIONS") });
        $sym67$RC_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RC-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RC-STATE-P"));
        $sym69$RC_STATE_ID = SubLObjectFactory.makeSymbol("RC-STATE-ID");
        $sym70$_CSETF_RC_STATE_ID = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-ID");
        $sym71$RC_STATE_TEXT = SubLObjectFactory.makeSymbol("RC-STATE-TEXT");
        $sym72$_CSETF_RC_STATE_TEXT = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-TEXT");
        $sym73$RC_STATE_INTERACTION = SubLObjectFactory.makeSymbol("RC-STATE-INTERACTION");
        $sym74$_CSETF_RC_STATE_INTERACTION = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-INTERACTION");
        $sym75$RC_STATE_IF_SCENARIO = SubLObjectFactory.makeSymbol("RC-STATE-IF-SCENARIO");
        $sym76$_CSETF_RC_STATE_IF_SCENARIO = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-IF-SCENARIO");
        $sym77$RC_STATE_THEN_SCENARIO = SubLObjectFactory.makeSymbol("RC-STATE-THEN-SCENARIO");
        $sym78$_CSETF_RC_STATE_THEN_SCENARIO = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-THEN-SCENARIO");
        $sym79$RC_STATE_LHS = SubLObjectFactory.makeSymbol("RC-STATE-LHS");
        $sym80$_CSETF_RC_STATE_LHS = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-LHS");
        $sym81$RC_STATE_RHS = SubLObjectFactory.makeSymbol("RC-STATE-RHS");
        $sym82$_CSETF_RC_STATE_RHS = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-RHS");
        $sym83$RC_STATE_PARSING_MT = SubLObjectFactory.makeSymbol("RC-STATE-PARSING-MT");
        $sym84$_CSETF_RC_STATE_PARSING_MT = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-PARSING-MT");
        $sym85$RC_STATE_GENERATION_MT = SubLObjectFactory.makeSymbol("RC-STATE-GENERATION-MT");
        $sym86$_CSETF_RC_STATE_GENERATION_MT = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-GENERATION-MT");
        $sym87$RC_STATE_DOMAIN_MT = SubLObjectFactory.makeSymbol("RC-STATE-DOMAIN-MT");
        $sym88$_CSETF_RC_STATE_DOMAIN_MT = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-DOMAIN-MT");
        $sym89$RC_STATE_DOMAIN_INTERACTION_MT = SubLObjectFactory.makeSymbol("RC-STATE-DOMAIN-INTERACTION-MT");
        $sym90$_CSETF_RC_STATE_DOMAIN_INTERACTION_MT = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-DOMAIN-INTERACTION-MT");
        $sym91$RC_STATE_VAR_MAP = SubLObjectFactory.makeSymbol("RC-STATE-VAR-MAP");
        $sym92$_CSETF_RC_STATE_VAR_MAP = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-VAR-MAP");
        $sym93$RC_STATE_EXCEPTIONS = SubLObjectFactory.makeSymbol("RC-STATE-EXCEPTIONS");
        $sym94$_CSETF_RC_STATE_EXCEPTIONS = SubLObjectFactory.makeSymbol("_CSETF-RC-STATE-EXCEPTIONS");
        $kw95$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw96$INTERACTION = SubLObjectFactory.makeKeyword("INTERACTION");
        $kw97$IF_SCENARIO = SubLObjectFactory.makeKeyword("IF-SCENARIO");
        $kw98$THEN_SCENARIO = SubLObjectFactory.makeKeyword("THEN-SCENARIO");
        $kw99$LHS = SubLObjectFactory.makeKeyword("LHS");
        $kw100$RHS = SubLObjectFactory.makeKeyword("RHS");
        $kw101$PARSING_MT = SubLObjectFactory.makeKeyword("PARSING-MT");
        $kw102$GENERATION_MT = SubLObjectFactory.makeKeyword("GENERATION-MT");
        $kw103$DOMAIN_MT = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $kw104$DOMAIN_INTERACTION_MT = SubLObjectFactory.makeKeyword("DOMAIN-INTERACTION-MT");
        $kw105$VAR_MAP = SubLObjectFactory.makeKeyword("VAR-MAP");
        $kw106$EXCEPTIONS = SubLObjectFactory.makeKeyword("EXCEPTIONS");
        $sym107$MAKE_RC_STATE = SubLObjectFactory.makeSymbol("MAKE-RC-STATE");
        $sym108$VISIT_DEFSTRUCT_OBJECT_RC_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RC-STATE-METHOD");
        $sym109$USER_INTERACTION_P = SubLObjectFactory.makeSymbol("USER-INTERACTION-P");
        $sym110$SM_SCENARIO_P = SubLObjectFactory.makeSymbol("SM-SCENARIO-P");
        $sym111$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym112$DOUBLETON_ = SubLObjectFactory.makeSymbol("DOUBLETON?");
        $str113$If_ = SubLObjectFactory.makeString("If ");
        $str114$__then_ = SubLObjectFactory.makeString(", then ");
        $kw115$INSERT_EXPLICIT_TYPE_CONSTRAINTS = SubLObjectFactory.makeKeyword("INSERT-EXPLICIT-TYPE-CONSTRAINTS");
        $sym116$RKF_ADD_OBJECT_VAR_MAP_ENTRY_RC_STATE_METHOD = SubLObjectFactory.makeSymbol("RKF-ADD-OBJECT-VAR-MAP-ENTRY-RC-STATE-METHOD");
        $const117$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $const118$exceptWhen = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptWhen"));
        $const119$exceptFor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptFor"));
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL"));
        $str121$Exceptions = SubLObjectFactory.makeString("Exceptions");
        $str122$Then_Clause = SubLObjectFactory.makeString("Then-Clause");
        $sym123$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL-RECORD"));
        $sym125$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym126$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
    }
    
    public static final class $rc_lhs_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $nl_sentence;
        public SubLObject $constraints;
        public SubLObject $terms;
        public SubLObject $cycl;
        private static final SubLStructDeclNative structDecl;
        
        public $rc_lhs_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$nl_sentence = (SubLObject)CommonSymbols.NIL;
            this.$constraints = (SubLObject)CommonSymbols.NIL;
            this.$terms = (SubLObject)CommonSymbols.NIL;
            this.$cycl = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rc_lhs_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$nl_sentence;
        }
        
        public SubLObject getField4() {
            return this.$constraints;
        }
        
        public SubLObject getField5() {
            return this.$terms;
        }
        
        public SubLObject getField6() {
            return this.$cycl;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$nl_sentence = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$constraints = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$terms = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$cycl = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rc_lhs_native.class, rkf_rule_constructor.$sym5$RC_LHS, rkf_rule_constructor.$sym6$RC_LHS_P, rkf_rule_constructor.$list7, rkf_rule_constructor.$list8, new String[] { "$id", "$nl_sentence", "$constraints", "$terms", "$cycl" }, rkf_rule_constructor.$list9, rkf_rule_constructor.$list10, rkf_rule_constructor.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $rc_lhs_p$UnaryFunction extends UnaryFunction
    {
        public $rc_lhs_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RC-LHS-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_rule_constructor.rc_lhs_p(arg1);
        }
    }
    
    public static final class $rc_rhs_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $nl_sentence;
        public SubLObject $constraints;
        public SubLObject $existential_term;
        public SubLObject $cycl;
        private static final SubLStructDeclNative structDecl;
        
        public $rc_rhs_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$nl_sentence = (SubLObject)CommonSymbols.NIL;
            this.$constraints = (SubLObject)CommonSymbols.NIL;
            this.$existential_term = (SubLObject)CommonSymbols.NIL;
            this.$cycl = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rc_rhs_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$nl_sentence;
        }
        
        public SubLObject getField4() {
            return this.$constraints;
        }
        
        public SubLObject getField5() {
            return this.$existential_term;
        }
        
        public SubLObject getField6() {
            return this.$cycl;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$nl_sentence = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$constraints = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$existential_term = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$cycl = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rc_rhs_native.class, rkf_rule_constructor.$sym38$RC_RHS, rkf_rule_constructor.$sym39$RC_RHS_P, rkf_rule_constructor.$list40, rkf_rule_constructor.$list41, new String[] { "$id", "$nl_sentence", "$constraints", "$existential_term", "$cycl" }, rkf_rule_constructor.$list42, rkf_rule_constructor.$list43, rkf_rule_constructor.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $rc_rhs_p$UnaryFunction extends UnaryFunction
    {
        public $rc_rhs_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RC-RHS-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_rule_constructor.rc_rhs_p(arg1);
        }
    }
    
    public static final class $rc_state_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $text;
        public SubLObject $interaction;
        public SubLObject $if_scenario;
        public SubLObject $then_scenario;
        public SubLObject $lhs;
        public SubLObject $rhs;
        public SubLObject $parsing_mt;
        public SubLObject $generation_mt;
        public SubLObject $domain_mt;
        public SubLObject $domain_interaction_mt;
        public SubLObject $var_map;
        public SubLObject $exceptions;
        private static final SubLStructDeclNative structDecl;
        
        public $rc_state_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$text = (SubLObject)CommonSymbols.NIL;
            this.$interaction = (SubLObject)CommonSymbols.NIL;
            this.$if_scenario = (SubLObject)CommonSymbols.NIL;
            this.$then_scenario = (SubLObject)CommonSymbols.NIL;
            this.$lhs = (SubLObject)CommonSymbols.NIL;
            this.$rhs = (SubLObject)CommonSymbols.NIL;
            this.$parsing_mt = (SubLObject)CommonSymbols.NIL;
            this.$generation_mt = (SubLObject)CommonSymbols.NIL;
            this.$domain_mt = (SubLObject)CommonSymbols.NIL;
            this.$domain_interaction_mt = (SubLObject)CommonSymbols.NIL;
            this.$var_map = (SubLObject)CommonSymbols.NIL;
            this.$exceptions = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rc_state_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$text;
        }
        
        public SubLObject getField4() {
            return this.$interaction;
        }
        
        public SubLObject getField5() {
            return this.$if_scenario;
        }
        
        public SubLObject getField6() {
            return this.$then_scenario;
        }
        
        public SubLObject getField7() {
            return this.$lhs;
        }
        
        public SubLObject getField8() {
            return this.$rhs;
        }
        
        public SubLObject getField9() {
            return this.$parsing_mt;
        }
        
        public SubLObject getField10() {
            return this.$generation_mt;
        }
        
        public SubLObject getField11() {
            return this.$domain_mt;
        }
        
        public SubLObject getField12() {
            return this.$domain_interaction_mt;
        }
        
        public SubLObject getField13() {
            return this.$var_map;
        }
        
        public SubLObject getField14() {
            return this.$exceptions;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$text = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$interaction = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$if_scenario = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$then_scenario = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$lhs = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$rhs = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$parsing_mt = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$generation_mt = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$domain_mt = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$domain_interaction_mt = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$var_map = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$exceptions = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rc_state_native.class, rkf_rule_constructor.$sym61$RC_STATE, rkf_rule_constructor.$sym62$RC_STATE_P, rkf_rule_constructor.$list63, rkf_rule_constructor.$list64, new String[] { "$id", "$text", "$interaction", "$if_scenario", "$then_scenario", "$lhs", "$rhs", "$parsing_mt", "$generation_mt", "$domain_mt", "$domain_interaction_mt", "$var_map", "$exceptions" }, rkf_rule_constructor.$list65, rkf_rule_constructor.$list66, rkf_rule_constructor.$sym11$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $rc_state_p$UnaryFunction extends UnaryFunction
    {
        public $rc_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RC-STATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_rule_constructor.rc_state_p(arg1);
        }
    }
}

/*

	Total time: 429 ms
	
*/